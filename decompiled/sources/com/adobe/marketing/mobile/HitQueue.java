package com.adobe.marketing.mobile;

import com.adobe.marketing.mobile.AbstractHit;
import com.adobe.marketing.mobile.AbstractHitSchema;
import java.io.File;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
class HitQueue<T extends AbstractHit, E extends AbstractHitSchema<T>> extends AbstractHitsDatabase {
    private static final int DEFAULT_NETWORK_CONNECTION_FAIL_DELAY_TIME = 30;
    private static final String LOG_TAG = "HitQueue";
    private static final int ONE_SECOND = 1000;
    private final Object backgroundMutex;
    private volatile boolean bgThreadActive;
    private final IHitProcessor<T> hitProcessor;
    private final E hitSchema;
    private volatile boolean isSuspended;
    private final SystemInfoService systemInfoService;

    public interface IHitProcessor<T extends AbstractHit> {
        RetryType process(T t10);
    }

    public enum RetryType {
        NO,
        YES,
        WAIT
    }

    public HitQueue(PlatformServices platformServices, File file, String str, E e5, IHitProcessor<T> iHitProcessor) {
        super(platformServices.getDatabaseService(), file, str);
        this.backgroundMutex = new Object();
        this.bgThreadActive = false;
        this.isSuspended = false;
        this.systemInfoService = platformServices.getSystemInfoService();
        this.hitSchema = e5;
        this.hitProcessor = iHitProcessor;
        openOrCreateDatabase();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void delayNetworkAttempts() {
        for (int i10 = 0; i10 < 30; i10++) {
            try {
                if (SystemInfoService.ConnectionStatus.CONNECTED != this.systemInfoService.getNetworkConnectionStatus()) {
                    return;
                }
                Thread.sleep(1000L);
            } catch (Exception e5) {
                Log.debug(LOG_TAG, "Background Thread Interrupted (%s)", e5);
                return;
            }
        }
    }

    private Runnable workerThread() {
        return new Runnable() { // from class: com.adobe.marketing.mobile.HitQueue.1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.lang.Runnable
            public void run() {
                AbstractHit abstractHitSelectOldestHit;
                while (!HitQueue.this.isSuspended && HitQueue.this.systemInfoService != null && SystemInfoService.ConnectionStatus.CONNECTED == HitQueue.this.systemInfoService.getNetworkConnectionStatus() && (abstractHitSelectOldestHit = HitQueue.this.selectOldestHit()) != null && HitQueue.this.hitProcessor != null) {
                    RetryType retryTypeProcess = HitQueue.this.hitProcessor.process(abstractHitSelectOldestHit);
                    if (retryTypeProcess == RetryType.YES) {
                        HitQueue.this.delayNetworkAttempts();
                    } else if (retryTypeProcess != RetryType.NO || !HitQueue.this.deleteHitWithIdentifier(abstractHitSelectOldestHit.identifier)) {
                        break;
                    }
                }
                HitQueue.this.bgThreadActive = false;
            }
        };
    }

    public void bringOnline() {
        this.isSuspended = false;
        if (this.bgThreadActive) {
            return;
        }
        this.bgThreadActive = true;
        synchronized (this.backgroundMutex) {
            new Thread(workerThread(), "ADBMobileBackgroundThread").start();
        }
    }

    @Override // com.adobe.marketing.mobile.AbstractHitsDatabase
    public void initializeDatabase() {
        synchronized (this.dbMutex) {
            try {
                if (!this.database.createTable(this.tableName, this.hitSchema.getColumnNames(), this.hitSchema.getColumnDataTypes(), this.hitSchema.getColumnConstraints())) {
                    Log.warning(LOG_TAG, "Unable to initialize the database properly, table name (%s)", this.tableName);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public boolean isSuspended() {
        return this.isSuspended;
    }

    /* JADX WARN: Code duplicated, block: B:36:0x004d A[Catch: all -> 0x0034, TryCatch #1 {, blocks: (B:4:0x0003, B:6:0x0009, B:22:0x0030, B:33:0x0049, B:36:0x004d, B:37:0x0050, B:38:0x0051, B:39:0x005a), top: B:45:0x0003 }] */
    public T queryHit(Query query) {
        DatabaseService.QueryResult queryResultQuery;
        synchronized (this.dbMutex) {
            DatabaseService.Database database = this.database;
            DatabaseService.QueryResult queryResult = (T) null;
            if (database == null || this.databaseStatus == AbstractHitsDatabase.DatabaseStatus.FATAL_ERROR) {
                Log.warning(LOG_TAG, "Update hit operation failed due to database error", new Object[0]);
                return null;
            }
            try {
                queryResultQuery = database.query(query);
                if (queryResultQuery != null) {
                    try {
                        try {
                            if (queryResultQuery.getCount() > 0 && queryResultQuery.moveToFirst()) {
                                queryResult = (T) this.hitSchema.generateHit(queryResultQuery);
                            }
                        } catch (Exception e5) {
                            e = e5;
                            Log.error(LOG_TAG, "Unable to read from database. Query failed with error %s", e);
                            if (queryResultQuery != null) {
                            }
                            return (T) queryResult;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        queryResult = (T) queryResultQuery;
                        if (queryResult != null) {
                            queryResult.close();
                        }
                        throw th;
                    }
                }
                if (queryResultQuery != null) {
                    queryResultQuery.close();
                }
            } catch (Exception e7) {
                e = e7;
                queryResultQuery = null;
            } catch (Throwable th3) {
                th = th3;
                if (queryResult != null) {
                    queryResult.close();
                }
                throw th;
            }
            return (T) queryResult;
        }
    }

    public boolean queue(T t10) {
        if (t10 == null) {
            Log.debug(LOG_TAG, "Ignoring null hit", new Object[0]);
            return false;
        }
        synchronized (this.dbMutex) {
            try {
                DatabaseService.Database database = this.database;
                if (database != null && this.databaseStatus != AbstractHitsDatabase.DatabaseStatus.FATAL_ERROR) {
                    if (database.insert(this.tableName, this.hitSchema.generateDataMap(t10))) {
                        Log.trace(LOG_TAG, "Hit queued (%s)", t10.getClass().toString());
                        return true;
                    }
                    Log.warning(LOG_TAG, "A database error occurred preventing a hit from being inserted", new Object[0]);
                    reset();
                    return false;
                }
                Log.warning(LOG_TAG, "Ignoring hit due to database error", new Object[0]);
                return false;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public T selectOldestHit() {
        Query.Builder builder = new Query.Builder(this.tableName, this.hitSchema.getColumnNames());
        builder.orderBy("ID ASC");
        builder.limit("1");
        return (T) queryHit(builder.build());
    }

    public void suspend() {
        this.isSuspended = true;
    }

    public boolean updateAllHits(Map<String, Object> map) {
        synchronized (this.dbMutex) {
            try {
                if (this.database != null && this.databaseStatus != AbstractHitsDatabase.DatabaseStatus.FATAL_ERROR) {
                    if (getSize() <= 0) {
                        return true;
                    }
                    if (this.database.update(this.tableName, map, null, null)) {
                        return true;
                    }
                    Log.warning(LOG_TAG, "An error occurred updating database. Resetting database.", new Object[0]);
                    reset();
                    return false;
                }
                Log.warning(LOG_TAG, "Update hits operation failed due to database error", new Object[0]);
                return false;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public boolean updateHit(T t10) {
        if (StringUtils.isNullOrEmpty(t10.identifier)) {
            Log.warning(LOG_TAG, "Unable to update hit with empty identifier", new Object[0]);
            return false;
        }
        synchronized (this.dbMutex) {
            try {
                DatabaseService.Database database = this.database;
                if (database != null && this.databaseStatus != AbstractHitsDatabase.DatabaseStatus.FATAL_ERROR) {
                    if (database.update(this.tableName, this.hitSchema.generateDataMap(t10), "ID = ?", new String[]{t10.identifier})) {
                        return true;
                    }
                    Log.warning(LOG_TAG, "Unable to update hit in database", new Object[0]);
                    return false;
                }
                Log.warning(LOG_TAG, "Update hit operation failed due to database error", new Object[0]);
                return false;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}

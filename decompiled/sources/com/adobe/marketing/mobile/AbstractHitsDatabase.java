package com.adobe.marketing.mobile;

import java.io.File;

/* JADX INFO: loaded from: classes2.dex */
abstract class AbstractHitsDatabase {
    private static final String LOG_TAG = "HitsDatabase";
    DatabaseService.Database database;
    private File databaseFile;
    DatabaseStatus databaseStatus;
    final Object dbMutex = new Object();
    private DatabaseService structuredDataService;
    String tableName;

    public enum DatabaseStatus {
        OK(0),
        FATAL_ERROR(1);

        public final int id;

        DatabaseStatus(int i10) {
            this.id = i10;
        }
    }

    public AbstractHitsDatabase(DatabaseService databaseService, File file, String str) {
        this.structuredDataService = databaseService;
        this.databaseFile = file;
        this.tableName = str;
    }

    private void closeDatabase() {
        synchronized (this.dbMutex) {
            try {
                DatabaseService.Database database = this.database;
                if (database != null) {
                    database.close();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void deleteAllHits() {
        synchronized (this.dbMutex) {
            try {
                DatabaseService.Database database = this.database;
                if (database == null) {
                    Log.warning(LOG_TAG, "%s (Database), couldn't delete hits, db file path: %s", "Unexpected Null Value", this.databaseFile.getAbsolutePath());
                } else {
                    if (!database.delete(this.tableName, null, null)) {
                        Log.warning(LOG_TAG, "Unable to delete all hits from the database table", new Object[0]);
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public boolean deleteHitWithIdentifier(String str) {
        if (StringUtils.isNullOrEmpty(str)) {
            Log.warning(LOG_TAG, "Unable to delete hit with empty identifier", new Object[0]);
            return false;
        }
        synchronized (this.dbMutex) {
            try {
                DatabaseService.Database database = this.database;
                if (database == null) {
                    Log.warning(LOG_TAG, "Couldn't delete hit, %s (Database) - Path to db: %s", "Unexpected Null Value", this.databaseFile.getAbsolutePath());
                    return false;
                }
                if (database.delete(this.tableName, "ID = ?", new String[]{str})) {
                    return true;
                }
                Log.warning(LOG_TAG, "Unable to delete hit due to unexpected error", new Object[0]);
                reset();
                return false;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public long getSize() {
        return getSize(new Query.Builder(this.tableName, new String[]{"ID"}).build());
    }

    public abstract void initializeDatabase();

    public void openOrCreateDatabase() {
        synchronized (this.dbMutex) {
            try {
                closeDatabase();
                File file = this.databaseFile;
                if (file == null) {
                    Log.debug(LOG_TAG, "Database creation failed, %s - database file", "Unexpected Null Value");
                    return;
                }
                if (this.structuredDataService == null) {
                    Log.debug(LOG_TAG, "%s (Database service)", "Unexpected Null Value");
                    return;
                }
                Log.trace(LOG_TAG, "Trying to open database file located at %s", file.getAbsolutePath());
                DatabaseService.Database databaseOpenDatabase = this.structuredDataService.openDatabase(this.databaseFile.getPath());
                this.database = databaseOpenDatabase;
                if (databaseOpenDatabase == null) {
                    Log.debug(LOG_TAG, "Database creation failed for %s", this.databaseFile.getPath());
                } else {
                    initializeDatabase();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void reset() {
        Log.error(LOG_TAG, "Database in unrecoverable state, resetting.", new Object[0]);
        synchronized (this.dbMutex) {
            try {
                File file = this.databaseFile;
                if (file == null || !file.exists() || this.structuredDataService.deleteDatabase(this.databaseFile.getPath())) {
                    openOrCreateDatabase();
                    postReset();
                } else {
                    Log.debug(LOG_TAG, String.format("Failed to delete database file(%s).", this.databaseFile.getAbsolutePath()), new Object[0]);
                    this.databaseStatus = DatabaseStatus.FATAL_ERROR;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public long getSize(Query query) {
        synchronized (this.dbMutex) {
            DatabaseService.Database database = this.database;
            if (database == null) {
                Log.debug(LOG_TAG, "Couldn't get size, %s (database) - Filepath: %s", "Unexpected Null Value", this.databaseFile.getAbsolutePath());
                return 0L;
            }
            DatabaseService.QueryResult queryResult = null;
            try {
                try {
                    DatabaseService.QueryResult queryResultQuery = database.query(query);
                    if (queryResultQuery != null) {
                        long count = queryResultQuery.getCount();
                        queryResultQuery.close();
                        return count;
                    }
                    Log.debug(LOG_TAG, "%s (query result), unable to get tracking queue size", "Unexpected Null Value");
                    if (queryResultQuery != null) {
                        queryResultQuery.close();
                    }
                    return 0L;
                } catch (Exception unused) {
                    Log.debug(LOG_TAG, "Unable to get the count from the cursor.", new Object[0]);
                    if (0 != 0) {
                        queryResult.close();
                    }
                    return 0L;
                }
            } catch (Throwable th2) {
                if (0 != 0) {
                    queryResult.close();
                }
                throw th2;
            }
        }
    }

    public void postReset() {
    }
}

package com.adobe.marketing.mobile.services;

import android.content.ContentValues;
import com.adobe.marketing.mobile.LoggingMode;
import com.adobe.marketing.mobile.MobileCore;
import com.bbva.notifications.constants.PushConstants;
import java.io.File;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
final class SQLiteDataQueue implements DataQueue {
    private static final String LOG_PREFIX = "SQLiteDataQueue";
    private static final String TABLE_NAME = "TB_AEP_DATA_ENTITY";
    private static final String TB_KEY_DATA = "data";
    private static final String TB_KEY_TIMESTAMP = "timestamp";
    private static final String TB_KEY_UNIQUE_IDENTIFIER = "uniqueIdentifier";
    private final SQLiteDatabaseHelper databaseHelper;
    private final String databasePath;
    private boolean isClose = false;
    private final Object dbMutex = new Object();

    public SQLiteDataQueue(File file, String str, SQLiteDatabaseHelper sQLiteDatabaseHelper) {
        this.databaseHelper = sQLiteDatabaseHelper;
        this.databasePath = new File(file, removeRelativePath(str)).getPath();
        createTableIfNotExists();
    }

    private void createTableIfNotExists() {
        if (this.databaseHelper == null) {
            MobileCore.log(LoggingMode.DEBUG, LOG_PREFIX, String.format("Unable to create table (%s), database helper is null", TABLE_NAME));
            return;
        }
        synchronized (this.dbMutex) {
            try {
                if (this.databaseHelper.createTableIfNotExist(this.databasePath, "CREATE TABLE IF NOT EXISTS TB_AEP_DATA_ENTITY (id INTEGER NOT NULL PRIMARY KEY AUTOINCREMENT UNIQUE, uniqueIdentifier TEXT NOT NULL UNIQUE, timestamp INTEGER NOT NULL, data TEXT);")) {
                    MobileCore.log(LoggingMode.VERBOSE, LOG_PREFIX, String.format("createTableIfNotExists - Successfully created/already existed table (%s) ", TABLE_NAME));
                } else {
                    MobileCore.log(LoggingMode.DEBUG, LOG_PREFIX, String.format("createTableIfNotExists - Error creating/accessing table (%s)  ", TABLE_NAME));
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private String removeRelativePath(String str) {
        if (str == null || str.isEmpty()) {
            return str;
        }
        try {
            return str.replaceAll("\\.[/\\\\]", "\\.").replaceAll("[/\\\\](\\.{2,})", PushConstants.GE_PARAMS_SEPARATOR);
        } catch (IllegalArgumentException unused) {
            return str;
        }
    }

    @Override // com.adobe.marketing.mobile.services.DataQueue
    public boolean add(DataEntity dataEntity) {
        boolean zInsertRow;
        if (this.isClose) {
            MobileCore.log(LoggingMode.DEBUG, LOG_PREFIX, "add - Returning false, DataQueue is closed.");
            return false;
        }
        if (dataEntity == null) {
            MobileCore.log(LoggingMode.DEBUG, LOG_PREFIX, "add - Returning false, DataEntity is null.");
            return false;
        }
        HashMap map = new HashMap();
        map.put(TB_KEY_UNIQUE_IDENTIFIER, dataEntity.getUniqueIdentifier());
        map.put("timestamp", Long.valueOf(dataEntity.getTimestamp().getTime()));
        map.put("data", dataEntity.getData() != null ? dataEntity.getData() : "");
        synchronized (this.dbMutex) {
            zInsertRow = this.databaseHelper.insertRow(this.databasePath, TABLE_NAME, map);
            MobileCore.log(LoggingMode.VERBOSE, LOG_PREFIX, String.format("add - Successfully added DataEntity (%s) to DataQueue", dataEntity.toString()));
        }
        return zInsertRow;
    }

    @Override // com.adobe.marketing.mobile.services.DataQueue
    public boolean clear() {
        boolean zClearTable;
        if (this.isClose) {
            MobileCore.log(LoggingMode.DEBUG, LOG_PREFIX, "clear - Returning false, DataQueue is closed");
            return false;
        }
        synchronized (this.dbMutex) {
            try {
                zClearTable = this.databaseHelper.clearTable(this.databasePath, TABLE_NAME);
                LoggingMode loggingMode = LoggingMode.VERBOSE;
                Object[] objArr = new Object[2];
                objArr[0] = zClearTable ? "Successful" : "Failed";
                objArr[1] = TABLE_NAME;
                MobileCore.log(loggingMode, LOG_PREFIX, String.format("clear - %s in clearing Table %s", objArr));
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return zClearTable;
    }

    @Override // com.adobe.marketing.mobile.services.DataQueue
    public void close() {
        this.isClose = true;
    }

    @Override // com.adobe.marketing.mobile.services.DataQueue
    public int count() {
        int tableSize;
        if (this.isClose) {
            MobileCore.log(LoggingMode.DEBUG, LOG_PREFIX, "count - Returning 0, DataQueue is closed");
            return 0;
        }
        synchronized (this.dbMutex) {
            tableSize = this.databaseHelper.getTableSize(this.databasePath, TABLE_NAME);
        }
        return tableSize;
    }

    @Override // com.adobe.marketing.mobile.services.DataQueue
    public List<DataEntity> peek(int i10) {
        List<ContentValues> listQuery;
        if (this.isClose) {
            MobileCore.log(LoggingMode.DEBUG, LOG_PREFIX, "peek n - Returning null, DataQueue is closed.");
            return null;
        }
        if (i10 <= 0) {
            MobileCore.log(LoggingMode.DEBUG, LOG_PREFIX, "peek n - Returning null, n <= 0.");
            return null;
        }
        synchronized (this.dbMutex) {
            listQuery = this.databaseHelper.query(this.databasePath, TABLE_NAME, new String[]{"timestamp", TB_KEY_UNIQUE_IDENTIFIER, "data"}, i10);
        }
        if (listQuery == null || listQuery.isEmpty()) {
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList(listQuery.size());
        for (ContentValues contentValues : listQuery) {
            arrayList.add(new DataEntity(contentValues.getAsString(TB_KEY_UNIQUE_IDENTIFIER), new Date(contentValues.getAsLong("timestamp").longValue()), contentValues.getAsString("data")));
        }
        MobileCore.log(LoggingMode.VERBOSE, LOG_PREFIX, String.format("peek n - Successfully returned %d DataEntities", Integer.valueOf(arrayList.size())));
        return arrayList;
    }

    @Override // com.adobe.marketing.mobile.services.DataQueue
    public boolean remove(int i10) {
        boolean z10;
        if (this.isClose) {
            MobileCore.log(LoggingMode.DEBUG, LOG_PREFIX, "remove n - Returning false, DataQueue is closed");
            return false;
        }
        if (i10 <= 0) {
            MobileCore.log(LoggingMode.DEBUG, LOG_PREFIX, "remove n - Returning false, n <= 0");
            return false;
        }
        synchronized (this.dbMutex) {
            int iRemoveRows = this.databaseHelper.removeRows(this.databasePath, TABLE_NAME, "id ASC", i10);
            MobileCore.log(LoggingMode.VERBOSE, LOG_PREFIX, String.format("remove n - Successfully removed %d DataEntities", Integer.valueOf(iRemoveRows)));
            z10 = iRemoveRows != -1;
        }
        return z10;
    }

    @Override // com.adobe.marketing.mobile.services.DataQueue
    public boolean remove() {
        if (this.isClose) {
            MobileCore.log(LoggingMode.DEBUG, LOG_PREFIX, "remove - Returning false, DataQueue is closed");
            return false;
        }
        return remove(1);
    }

    @Override // com.adobe.marketing.mobile.services.DataQueue
    public DataEntity peek() {
        if (this.isClose) {
            MobileCore.log(LoggingMode.DEBUG, LOG_PREFIX, "peek - Returning null, DataQueue is closed");
            return null;
        }
        List<DataEntity> listPeek = peek(1);
        if (listPeek == null) {
            MobileCore.log(LoggingMode.DEBUG, LOG_PREFIX, "peek - Unable to fetch DataEntity, returning null");
            return null;
        }
        if (listPeek.isEmpty()) {
            MobileCore.log(LoggingMode.DEBUG, LOG_PREFIX, "peek - 0 DataEntities fetch, returning null");
            return null;
        }
        MobileCore.log(LoggingMode.VERBOSE, LOG_PREFIX, String.format("peek - Successfully returned DataEntity (%s)", listPeek.get(0).toString()));
        return listPeek.get(0);
    }
}

package com.adobe.marketing.mobile;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteStatement;
import com.adobe.marketing.mobile.services.ServiceProvider;
import java.io.File;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
class AndroidEventHistoryDatabase implements EventHistoryDatabase {
    private static final String COLUMN_HASH = "eventHash";
    private static final String COLUMN_TIMESTAMP = "timestamp";
    private static final String COUNT = "count";
    private static final String DATABASE_NAME = "EventHistory";
    private static final String LOG_TAG = "AndroidEventHistoryDatabase";
    private static final String NEWEST = "newest";
    private static final String OLDEST = "oldest";
    private static final String TABLE_NAME = "Events";
    private SQLiteDatabase database;
    private final Object dbMutex = new Object();
    private File databaseFile = null;

    public AndroidEventHistoryDatabase() throws EventHistoryDatabaseCreationException {
        if (!openDatabase()) {
            throw new EventHistoryDatabaseCreationException("An error occurred while opening the Android Event History database.");
        }
        String[] strArr = {COLUMN_HASH, "timestamp"};
        DatabaseService.Database.ColumnDataType columnDataType = DatabaseService.Database.ColumnDataType.INTEGER;
        if (!createTable(strArr, new DatabaseService.Database.ColumnDataType[]{columnDataType, columnDataType}, null)) {
            throw new EventHistoryDatabaseCreationException("An error occurred while creating the \"Events\" table in the Android Event History database.");
        }
    }

    private boolean databaseIsWritable() {
        synchronized (this.dbMutex) {
            try {
                SQLiteDatabase sQLiteDatabase = this.database;
                if (sQLiteDatabase == null) {
                    Log.debug(LOG_TAG, "%s (Database), unable to write", "Unexpected Null Value");
                    return false;
                }
                if (!sQLiteDatabase.isOpen()) {
                    Log.debug(LOG_TAG, "Unable to write to database, it is not open", new Object[0]);
                    return false;
                }
                if (!this.database.isReadOnly()) {
                    return true;
                }
                Log.debug(LOG_TAG, "Unable to write to database, it is read-only", new Object[0]);
                return false;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // com.adobe.marketing.mobile.EventHistoryDatabase
    public void close() {
        synchronized (this.dbMutex) {
            this.database.close();
        }
    }

    @Override // com.adobe.marketing.mobile.EventHistoryDatabase
    public boolean createTable(String[] strArr, DatabaseService.Database.ColumnDataType[] columnDataTypeArr, List<List<DatabaseService.Database.ColumnConstraint>> list) {
        return createTable(strArr, columnDataTypeArr, list, false);
    }

    @Override // com.adobe.marketing.mobile.EventHistoryDatabase
    public int delete(long j10, long j11, long j12) {
        int iDelete;
        if (!databaseIsWritable()) {
            Log.debug("Event history database is not writeable. Delete failed for hash %s", Long.toString(j10), new Object[0]);
            return 0;
        }
        if (j12 == 0) {
            j12 = System.currentTimeMillis();
        }
        synchronized (this.dbMutex) {
            try {
                try {
                    iDelete = this.database.delete(TABLE_NAME, "eventHash = ? AND timestamp >= ? AND timestamp <= ?", new String[]{String.valueOf(j10), String.valueOf(j11), String.valueOf(j12)});
                    Log.trace(LOG_TAG, "Count of rows deleted in table %s are %d", TABLE_NAME, Integer.valueOf(iDelete));
                } catch (SQLException e5) {
                    Object[] objArr = new Object[1];
                    objArr[0] = e5.getLocalizedMessage() != null ? e5.getLocalizedMessage() : e5.getMessage();
                    Log.debug(LOG_TAG, "Failed to delete table rows (%s)", objArr);
                    return 0;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return iDelete;
    }

    @Override // com.adobe.marketing.mobile.EventHistoryDatabase
    public boolean deleteDatabase() {
        close();
        synchronized (this.dbMutex) {
            try {
                File file = this.databaseFile;
                if (file == null) {
                    return false;
                }
                try {
                    return file.delete();
                } catch (SecurityException e5) {
                    Object[] objArr = new Object[2];
                    objArr[0] = DATABASE_NAME;
                    objArr[1] = e5.getLocalizedMessage() != null ? e5.getLocalizedMessage() : e5.getMessage();
                    Log.error(LOG_TAG, "Failed to delete %s database (%s)", objArr);
                    return false;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public SQLiteDatabase getDatabase() {
        return this.database;
    }

    @Override // com.adobe.marketing.mobile.EventHistoryDatabase
    public boolean insert(long j10) {
        boolean z10;
        if (!databaseIsWritable()) {
            return false;
        }
        synchronized (this.dbMutex) {
            try {
                try {
                    ContentValues contentValues = new ContentValues();
                    contentValues.put(COLUMN_HASH, Long.valueOf(j10));
                    contentValues.put("timestamp", Long.valueOf(System.currentTimeMillis()));
                    z10 = this.database.insert(TABLE_NAME, null, contentValues) != -1;
                } catch (SQLException e5) {
                    Object[] objArr = new Object[1];
                    objArr[0] = e5.getLocalizedMessage() != null ? e5.getLocalizedMessage() : e5.getMessage();
                    Log.warning(LOG_TAG, "Failed to insert rows into the table (%s)", objArr);
                    return false;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return z10;
    }

    @Override // com.adobe.marketing.mobile.EventHistoryDatabase
    public boolean openDatabase() {
        File applicationCacheDir = ServiceProvider.getInstance().getDeviceInfoService().getApplicationCacheDir();
        if (applicationCacheDir != null) {
            try {
                this.databaseFile = new File(applicationCacheDir.getCanonicalPath() + "/EventHistory");
            } catch (IOException e5) {
                Object[] objArr = new Object[2];
                objArr[0] = DATABASE_NAME;
                objArr[1] = e5.getLocalizedMessage() != null ? e5.getLocalizedMessage() : e5.getMessage();
                Log.warning(LOG_TAG, "Failed to read %s database file (%s)", objArr);
                return false;
            }
        }
        synchronized (this.dbMutex) {
            try {
                try {
                    this.database = SQLiteDatabase.openDatabase(this.databaseFile.getCanonicalPath(), null, 268435472);
                } catch (IOException e7) {
                    Object[] objArr2 = new Object[2];
                    objArr2[0] = DATABASE_NAME;
                    objArr2[1] = e7.getLocalizedMessage() != null ? e7.getLocalizedMessage() : e7.getMessage();
                    Log.error(LOG_TAG, "Failed to open %s database (%s)", objArr2);
                    return false;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return true;
    }

    @Override // com.adobe.marketing.mobile.EventHistoryDatabase
    public DatabaseService.QueryResult select(long j10, long j11, long j12) {
        AndroidCursor androidCursor;
        if (j12 == 0) {
            j12 = System.currentTimeMillis();
        }
        synchronized (this.dbMutex) {
            try {
                try {
                    Cursor cursorRawQuery = this.database.rawQuery("SELECT count(*) as count, min(timestamp) as oldest, max(timestamp) as newest FROM Events  WHERE eventHash = ? AND timestamp >= ? AND timestamp <= ?", new String[]{String.valueOf(j10), String.valueOf(j11), String.valueOf(j12)});
                    cursorRawQuery.moveToFirst();
                    androidCursor = new AndroidCursor(cursorRawQuery);
                } catch (SQLException e5) {
                    Object[] objArr = new Object[1];
                    objArr[0] = e5.getLocalizedMessage() != null ? e5.getLocalizedMessage() : e5.getMessage();
                    Log.warning(LOG_TAG, "Failed to execute query (%s)", objArr);
                    return null;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return androidCursor;
    }

    public boolean createTable(String[] strArr, DatabaseService.Database.ColumnDataType[] columnDataTypeArr, List<List<DatabaseService.Database.ColumnConstraint>> list, boolean z10) {
        if (strArr == null || strArr.length == 0 || columnDataTypeArr == null || columnDataTypeArr.length == 0 || columnDataTypeArr.length != strArr.length || !(list == null || list.size() == strArr.length)) {
            Log.warning(LOG_TAG, "Failed to create table, one or more input parameters is invalid.", new Object[0]);
            return false;
        }
        if (!databaseIsWritable()) {
            Log.warning(LOG_TAG, "Failed to create table, database is not writeable.", new Object[0]);
            return false;
        }
        synchronized (this.dbMutex) {
            SQLiteStatement sQLiteStatementCompileStatement = this.database.compileStatement(QueryStringBuilder.getCreateTableQueryString(TABLE_NAME, strArr, columnDataTypeArr, list, z10));
            try {
                try {
                    sQLiteStatementCompileStatement.execute();
                    sQLiteStatementCompileStatement.close();
                    Log.debug(LOG_TAG, "Table with name %s created.", TABLE_NAME);
                    sQLiteStatementCompileStatement.close();
                } catch (SQLException e5) {
                    Object[] objArr = new Object[1];
                    objArr[0] = e5.getLocalizedMessage() != null ? e5.getLocalizedMessage() : e5.getMessage();
                    Log.warning(LOG_TAG, "Failed to create table (%s)", objArr);
                    sQLiteStatementCompileStatement.close();
                    return false;
                }
            } catch (Throwable th2) {
                sQLiteStatementCompileStatement.close();
                throw th2;
            }
        }
        return true;
    }
}

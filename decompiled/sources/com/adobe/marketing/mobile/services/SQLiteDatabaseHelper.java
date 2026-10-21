package com.adobe.marketing.mobile.services;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.DatabaseUtils;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteStatement;
import androidx.camera.core.processing.f;
import com.adobe.marketing.mobile.LoggingMode;
import com.adobe.marketing.mobile.MobileCore;
import com.bbva.ethermobilesdk.devicechecker.root.service.RootService;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
class SQLiteDatabaseHelper {
    private static final String LOG_PREFIX = "ADBDatabase";

    public enum DatabaseOpenMode {
        READ_ONLY(1),
        READ_WRITE(0);

        final int mode;

        DatabaseOpenMode(int i10) {
            this.mode = i10;
        }
    }

    private void closeDatabase(SQLiteDatabase sQLiteDatabase) {
        if (sQLiteDatabase == null) {
            MobileCore.log(LoggingMode.DEBUG, LOG_PREFIX, "closeDatabase - Unable to close database, database passed is null.");
        } else {
            sQLiteDatabase.close();
            MobileCore.log(LoggingMode.VERBOSE, LOG_PREFIX, "closeDatabase - Successfully closed the database.");
        }
    }

    private static ContentValues getContentValueFromMap(Map<String, Object> map) {
        ContentValues contentValues = new ContentValues();
        for (Map.Entry<String, Object> entry : map.entrySet()) {
            String key = entry.getKey();
            Object value = entry.getValue();
            if (value == null) {
                contentValues.putNull(key);
            } else if (value instanceof String) {
                contentValues.put(key, (String) value);
            } else if (value instanceof Long) {
                contentValues.put(key, (Long) value);
            } else if (value instanceof Integer) {
                contentValues.put(key, (Integer) value);
            } else if (value instanceof Short) {
                contentValues.put(key, (Short) value);
            } else if (value instanceof Byte) {
                contentValues.put(key, (Byte) value);
            } else if (value instanceof Double) {
                contentValues.put(key, (Double) value);
            } else if (value instanceof Float) {
                contentValues.put(key, (Float) value);
            } else if (value instanceof Boolean) {
                contentValues.put(key, (Boolean) value);
            } else if (value instanceof byte[]) {
                contentValues.put(key, (byte[]) value);
            } else {
                MobileCore.log(LoggingMode.WARNING, LOG_PREFIX, String.format("Unsupported data type received for database insertion: columnName (%s) value (%s)", key, value));
            }
        }
        return contentValues;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public boolean clearTable(String str, String str2) throws Throwable {
        SQLiteException e5;
        SQLiteDatabase sQLiteDatabaseOpenDatabase;
        SQLiteDatabase sQLiteDatabase = 0;
        try {
            try {
                sQLiteDatabaseOpenDatabase = openDatabase(str, DatabaseOpenMode.READ_WRITE);
                try {
                    sQLiteDatabaseOpenDatabase.delete(str2, "1", null);
                    closeDatabase(sQLiteDatabaseOpenDatabase);
                    return true;
                } catch (SQLiteException e7) {
                    e5 = e7;
                    MobileCore.log(LoggingMode.WARNING, LOG_PREFIX, String.format("clearTable - Error in clearing table(%s). Returning false. Error: (%s)", str2, e5.getMessage()));
                    closeDatabase(sQLiteDatabaseOpenDatabase);
                    return false;
                }
            } catch (Throwable th2) {
                th = th2;
                sQLiteDatabase = str;
                closeDatabase(sQLiteDatabase);
                throw th;
            }
        } catch (SQLiteException e10) {
            e5 = e10;
            sQLiteDatabaseOpenDatabase = null;
        } catch (Throwable th3) {
            th = th3;
            closeDatabase(sQLiteDatabase);
            throw th;
        }
    }

    public boolean createTableIfNotExist(String str, String str2) {
        SQLiteDatabase sQLiteDatabaseOpenDatabase = null;
        try {
            sQLiteDatabaseOpenDatabase = openDatabase(str, DatabaseOpenMode.READ_WRITE);
            sQLiteDatabaseOpenDatabase.execSQL(str2);
            return true;
        } catch (SQLiteException e5) {
            MobileCore.log(LoggingMode.WARNING, LOG_PREFIX, String.format("createTableIfNotExists - Error in creating/accessing table. Error: (%s)", e5.getMessage()));
            return false;
        } finally {
            closeDatabase(sQLiteDatabaseOpenDatabase);
        }
    }

    /* JADX WARN: Code duplicated, block: B:28:0x006c  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v1 */
    public int getTableSize(String str, String str2) throws Throwable {
        SQLiteDatabase sQLiteDatabaseOpenDatabase;
        String strD = f.d("Select Count (*) from ", str2);
        Cursor cursor = null;
        try {
            try {
                sQLiteDatabaseOpenDatabase = openDatabase(str, DatabaseOpenMode.READ_ONLY);
                try {
                    Cursor cursorRawQuery = sQLiteDatabaseOpenDatabase.rawQuery(strD, null);
                    if (cursorRawQuery.getCount() <= 0 || !cursorRawQuery.moveToFirst()) {
                        MobileCore.log(LoggingMode.DEBUG, LOG_PREFIX, String.format("getTableSize - Error in querying table(%s) size. Returning 0.", str2));
                        cursorRawQuery.close();
                        closeDatabase(sQLiteDatabaseOpenDatabase);
                        return 0;
                    }
                    int i10 = cursorRawQuery.getInt(0);
                    cursorRawQuery.close();
                    closeDatabase(sQLiteDatabaseOpenDatabase);
                    return i10;
                } catch (SQLiteException e5) {
                    e = e5;
                    MobileCore.log(LoggingMode.WARNING, LOG_PREFIX, String.format("getTableSize - Error in querying table(%s) size. Returning 0. Error: (%s)", str2, e.getMessage()));
                    if (0 != 0) {
                        cursor.close();
                    }
                    closeDatabase(sQLiteDatabaseOpenDatabase);
                    return 0;
                }
            } catch (Throwable th2) {
                th = th2;
                if (0 != 0) {
                    cursor.close();
                }
                closeDatabase(str);
                throw th;
            }
        } catch (SQLiteException e7) {
            e = e7;
            sQLiteDatabaseOpenDatabase = null;
        } catch (Throwable th3) {
            th = th3;
            str = 0;
            if (0 != 0) {
                cursor.close();
            }
            closeDatabase(str);
            throw th;
        }
    }

    public boolean insertRow(String str, String str2, Map<String, Object> map) throws Throwable {
        SQLiteDatabase sQLiteDatabase = null;
        try {
            try {
                SQLiteDatabase sQLiteDatabaseOpenDatabase = openDatabase(str, DatabaseOpenMode.READ_WRITE);
                try {
                    boolean z10 = sQLiteDatabaseOpenDatabase.insert(str2, null, getContentValueFromMap(map)) != -1;
                    closeDatabase(sQLiteDatabaseOpenDatabase);
                    return z10;
                } catch (SQLiteException e5) {
                    e = e5;
                    sQLiteDatabase = sQLiteDatabaseOpenDatabase;
                    MobileCore.log(LoggingMode.DEBUG, LOG_PREFIX, String.format("insertRow - Error in inserting row into table (%s). Error: (%s)", str2, e.getMessage()));
                    closeDatabase(sQLiteDatabase);
                    return false;
                } catch (Throwable th2) {
                    th = th2;
                    sQLiteDatabase = sQLiteDatabaseOpenDatabase;
                    closeDatabase(sQLiteDatabase);
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
            }
        } catch (SQLiteException e7) {
            e = e7;
        }
    }

    public SQLiteDatabase openDatabase(String str, DatabaseOpenMode databaseOpenMode) throws SQLiteException {
        if (str == null || str.isEmpty()) {
            MobileCore.log(LoggingMode.DEBUG, LOG_PREFIX, "openDatabase - Failed to open database - filepath is null or empty");
            throw new SQLiteException("Invalid database path. Database path is null or empty.");
        }
        SQLiteDatabase sQLiteDatabaseOpenDatabase = SQLiteDatabase.openDatabase(str, null, databaseOpenMode.mode | 268435472);
        MobileCore.log(LoggingMode.VERBOSE, LOG_PREFIX, String.format("openDatabase - Successfully opened the database at path (%s)", str));
        return sQLiteDatabaseOpenDatabase;
    }

    /* JADX WARN: Code duplicated, block: B:36:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:41:0x00ae  */
    public List<ContentValues> query(String str, String str2, String[] strArr, int i10) throws Throwable {
        SQLiteDatabase sQLiteDatabase;
        Cursor cursor;
        SQLiteDatabase sQLiteDatabase2;
        try {
            SQLiteDatabase sQLiteDatabaseOpenDatabase = openDatabase(str, DatabaseOpenMode.READ_ONLY);
            try {
                sQLiteDatabase2 = sQLiteDatabaseOpenDatabase;
                try {
                    Cursor cursorQuery = sQLiteDatabaseOpenDatabase.query(str2, strArr, null, null, null, null, "id ASC", String.valueOf(i10));
                    try {
                        ArrayList arrayList = new ArrayList(cursorQuery.getCount());
                        if (cursorQuery.moveToFirst()) {
                            do {
                                ContentValues contentValues = new ContentValues();
                                DatabaseUtils.cursorRowToContentValues(cursorQuery, contentValues);
                                arrayList.add(contentValues);
                            } while (cursorQuery.moveToNext());
                        }
                        MobileCore.log(LoggingMode.DEBUG, LOG_PREFIX, String.format("query - Successfully read %d rows from table(%s)", Integer.valueOf(arrayList.size()), str2));
                        List<ContentValues> listUnmodifiableList = Collections.unmodifiableList(arrayList);
                        cursorQuery.close();
                        closeDatabase(sQLiteDatabase2);
                        return listUnmodifiableList;
                    } catch (SQLiteException e5) {
                        e = e5;
                        cursor = cursorQuery;
                        sQLiteDatabase = sQLiteDatabase2;
                        try {
                            MobileCore.log(LoggingMode.DEBUG, LOG_PREFIX, String.format("query - Error in querying database table (%s). Error: (%s)", str2, e.getMessage()));
                            List<ContentValues> list = Collections.EMPTY_LIST;
                            if (cursor != null) {
                                cursor.close();
                            }
                            closeDatabase(sQLiteDatabase);
                            return list;
                        } catch (Throwable th2) {
                            th = th2;
                            if (cursor != null) {
                                cursor.close();
                            }
                            closeDatabase(sQLiteDatabase);
                            throw th;
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        cursor = cursorQuery;
                        sQLiteDatabase = sQLiteDatabase2;
                        if (cursor != null) {
                            cursor.close();
                        }
                        closeDatabase(sQLiteDatabase);
                        throw th;
                    }
                } catch (SQLiteException e7) {
                    e = e7;
                    sQLiteDatabase = sQLiteDatabase2;
                    cursor = null;
                    MobileCore.log(LoggingMode.DEBUG, LOG_PREFIX, String.format("query - Error in querying database table (%s). Error: (%s)", str2, e.getMessage()));
                    List<ContentValues> list2 = Collections.EMPTY_LIST;
                    if (cursor != null) {
                        cursor.close();
                    }
                    closeDatabase(sQLiteDatabase);
                    return list2;
                } catch (Throwable th4) {
                    th = th4;
                    sQLiteDatabase = sQLiteDatabase2;
                    cursor = null;
                    if (cursor != null) {
                        cursor.close();
                    }
                    closeDatabase(sQLiteDatabase);
                    throw th;
                }
            } catch (SQLiteException e10) {
                e = e10;
                sQLiteDatabase2 = sQLiteDatabaseOpenDatabase;
            } catch (Throwable th5) {
                th = th5;
                sQLiteDatabase2 = sQLiteDatabaseOpenDatabase;
            }
        } catch (SQLiteException e11) {
            e = e11;
            sQLiteDatabase = null;
        } catch (Throwable th6) {
            th = th6;
            sQLiteDatabase = null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0070  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v1 */
    public int removeRows(String str, String str2, String str3, int i10) throws Throwable {
        SQLiteDatabase sQLiteDatabaseOpenDatabase;
        SQLiteStatement sQLiteStatementCompileStatement = null;
        try {
            try {
                sQLiteDatabaseOpenDatabase = openDatabase(str, DatabaseOpenMode.READ_WRITE);
                try {
                    sQLiteStatementCompileStatement = sQLiteDatabaseOpenDatabase.compileStatement("DELETE FROM " + str2 + " WHERE id in (SELECT id from " + str2 + " order by " + str3 + " limit " + i10 + RootService.CLOSE_BRACKET);
                    int iExecuteUpdateDelete = sQLiteStatementCompileStatement.executeUpdateDelete();
                    sQLiteStatementCompileStatement.close();
                    closeDatabase(sQLiteDatabaseOpenDatabase);
                    return iExecuteUpdateDelete;
                } catch (SQLiteException e5) {
                    e = e5;
                    MobileCore.log(LoggingMode.WARNING, LOG_PREFIX, String.format("removeRows - Error in deleting rows from table(%s). Returning 0. Error: (%s)", str2, e.getMessage()));
                    if (sQLiteStatementCompileStatement != null) {
                        sQLiteStatementCompileStatement.close();
                    }
                    closeDatabase(sQLiteDatabaseOpenDatabase);
                    return -1;
                }
            } catch (Throwable th2) {
                th = th2;
                if (0 != 0) {
                    sQLiteStatementCompileStatement.close();
                }
                closeDatabase(str);
                throw th;
            }
        } catch (SQLiteException e7) {
            e = e7;
            sQLiteDatabaseOpenDatabase = null;
        } catch (Throwable th3) {
            th = th3;
            str = 0;
            if (0 != 0) {
                sQLiteStatementCompileStatement.close();
            }
            closeDatabase(str);
            throw th;
        }
    }
}

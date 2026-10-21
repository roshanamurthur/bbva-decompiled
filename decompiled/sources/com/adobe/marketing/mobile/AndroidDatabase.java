package com.adobe.marketing.mobile;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteStatement;
import ci.a;
import com.bbva.tohu.android.product.valkyria.sdk.logic.ReplenishLogic;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
class AndroidDatabase implements DatabaseService.Database {
    private static final String LOG_TAG = "AndroidDatabase";
    private static final String MIGRATION_DATABASE_TAG = "_MIGRATION";
    private final SQLiteDatabase database;
    private final Object dbMutex;

    public AndroidDatabase(SQLiteDatabase sQLiteDatabase) {
        Object obj = new Object();
        this.dbMutex = obj;
        synchronized (obj) {
            this.database = sQLiteDatabase;
        }
    }

    private static String[] cleanColumnNames(String[] strArr) {
        if (strArr == null) {
            return null;
        }
        String[] strArr2 = new String[strArr.length];
        for (int i10 = 0; i10 < strArr.length; i10++) {
            strArr2[i10] = cleanString(strArr[i10]);
        }
        return strArr2;
    }

    private static String cleanString(String str) {
        return str.replaceAll("[^a-zA-Z0-9_]", "");
    }

    private boolean copyColumnsFromTableToTable(String str, String str2, String[] strArr) {
        String[] strArrCleanColumnNames = cleanColumnNames(strArr);
        StringBuilder sbD = a.d("INSERT INTO ", str2, " (");
        StringBuilder sb2 = new StringBuilder();
        for (int i10 = 0; i10 < strArrCleanColumnNames.length; i10++) {
            sb2.append(strArrCleanColumnNames[i10]);
            sb2.append(" ");
            if (i10 != strArrCleanColumnNames.length - 1) {
                sb2.append(", ");
            }
        }
        sbD.append((CharSequence) sb2);
        sbD.append(") SELECT ");
        sbD.append((CharSequence) sb2);
        sbD.append(" FROM ");
        sbD.append(str);
        sbD.append(ReplenishLogic.ID_SEPARATOR);
        synchronized (this.dbMutex) {
            try {
                try {
                    SQLiteStatement sQLiteStatementCompileStatement = this.database.compileStatement(sbD.toString());
                    sQLiteStatementCompileStatement.execute();
                    sQLiteStatementCompileStatement.close();
                } catch (Exception e5) {
                    String str3 = LOG_TAG;
                    Object[] objArr = new Object[1];
                    objArr[0] = e5.getLocalizedMessage() != null ? e5.getLocalizedMessage() : e5.getMessage();
                    Log.debug(str3, "Failed to create table (%s)", objArr);
                    return false;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return true;
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

    private String[] getColumnNames(String str) {
        String[] strArrCleanColumnNames;
        synchronized (this.dbMutex) {
            Cursor cursorQuery = null;
            try {
                try {
                    cursorQuery = this.database.query(str, null, null, null, null, null, null);
                    strArrCleanColumnNames = cleanColumnNames(cursorQuery.getColumnNames());
                    try {
                        cursorQuery.close();
                    } catch (Exception unused) {
                    }
                } catch (Throwable th2) {
                    if (cursorQuery != null) {
                        try {
                            cursorQuery.close();
                        } catch (Exception unused2) {
                        }
                    }
                    throw th2;
                }
            } catch (Exception e5) {
                String str2 = LOG_TAG;
                Object[] objArr = new Object[1];
                objArr[0] = e5.getLocalizedMessage() != null ? e5.getLocalizedMessage() : e5.getMessage();
                Log.warning(str2, "Failed to execute query (%s)", objArr);
                String[] strArr = new String[0];
                if (cursorQuery != null) {
                    try {
                        cursorQuery.close();
                    } catch (Exception unused3) {
                    }
                }
                return strArr;
            }
        }
        return strArrCleanColumnNames;
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
                Log.warning(LOG_TAG, "Unsupported data type received for database insertion: columnName " + key + " value: " + value, new Object[0]);
            }
        }
        return contentValues;
    }

    private String[] getUnionColumns(String str, String[] strArr) {
        String[] columnNames = getColumnNames(str);
        Arrays.sort(columnNames);
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < strArr.length; i10++) {
            if (Arrays.binarySearch(columnNames, strArr[i10]) >= 0) {
                arrayList.add(strArr[i10]);
            }
        }
        return (String[]) arrayList.toArray(new String[0]);
    }

    private boolean migrateDatabase(String str, String[] strArr, DatabaseService.Database.ColumnDataType[] columnDataTypeArr, List<List<DatabaseService.Database.ColumnConstraint>> list) {
        synchronized (this.dbMutex) {
            try {
                try {
                    this.database.beginTransaction();
                    String str2 = str + MIGRATION_DATABASE_TAG;
                    if (!createTable(str2, strArr, columnDataTypeArr, list, true)) {
                        this.database.endTransaction();
                        return false;
                    }
                    if (copyColumnsFromTableToTable(str, str2, getUnionColumns(str, strArr)) && deleteTable(str) && renameTable(str2, str)) {
                        this.database.setTransactionSuccessful();
                        this.database.endTransaction();
                        return true;
                    }
                    this.database.endTransaction();
                    return false;
                } catch (Exception e5) {
                    String str3 = LOG_TAG;
                    Object[] objArr = new Object[1];
                    objArr[0] = e5.getLocalizedMessage() != null ? e5.getLocalizedMessage() : e5.getMessage();
                    Log.warning(str3, "Failed to execute query (%s)", objArr);
                    this.database.endTransaction();
                    return false;
                }
            } catch (Throwable th2) {
                this.database.endTransaction();
                throw th2;
            }
        }
    }

    private boolean migrateDatabaseIfNeeded(String str, String[] strArr, DatabaseService.Database.ColumnDataType[] columnDataTypeArr, List<List<DatabaseService.Database.ColumnConstraint>> list) {
        if (Arrays.equals(getColumnNames(str), strArr)) {
            return true;
        }
        return migrateDatabase(str, strArr, columnDataTypeArr, list);
    }

    @Override // com.adobe.marketing.mobile.DatabaseService.Database
    public void close() {
        synchronized (this.dbMutex) {
            this.database.close();
        }
    }

    @Override // com.adobe.marketing.mobile.DatabaseService.Database
    public boolean createTable(String str, String[] strArr, DatabaseService.Database.ColumnDataType[] columnDataTypeArr, List<List<DatabaseService.Database.ColumnConstraint>> list) {
        return createTable(str, strArr, columnDataTypeArr, list, false);
    }

    @Override // com.adobe.marketing.mobile.DatabaseService.Database
    public boolean delete(String str, String str2, String[] strArr) {
        if (!databaseIsWritable()) {
            return false;
        }
        synchronized (this.dbMutex) {
            try {
                try {
                    SQLiteDatabase sQLiteDatabase = this.database;
                    String strCleanString = cleanString(str);
                    if (str2 == null) {
                        str2 = "1";
                    }
                    Log.trace(LOG_TAG, "Count of rows deleted in table %s are %d", str, Integer.valueOf(sQLiteDatabase.delete(strCleanString, str2, strArr)));
                } catch (Exception e5) {
                    String str3 = LOG_TAG;
                    Object[] objArr = new Object[1];
                    objArr[0] = e5.getLocalizedMessage() != null ? e5.getLocalizedMessage() : e5.getMessage();
                    Log.debug(str3, "Failed to delete table rows (%s)", objArr);
                    return false;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return true;
    }

    public boolean deleteTable(String str) {
        synchronized (this.dbMutex) {
            try {
                try {
                    this.database.execSQL("DROP TABLE IF EXISTS " + cleanString(str));
                } catch (Exception e5) {
                    String str2 = LOG_TAG;
                    Object[] objArr = new Object[1];
                    objArr[0] = e5.getLocalizedMessage() != null ? e5.getLocalizedMessage() : e5.getMessage();
                    Log.debug(str2, "Failed to delete table (%s)", objArr);
                    return false;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return true;
    }

    @Override // com.adobe.marketing.mobile.DatabaseService.Database
    public boolean insert(String str, Map<String, Object> map) {
        boolean z10;
        if (StringUtils.isNullOrEmpty(str) || map == null || map.isEmpty()) {
            Log.debug(LOG_TAG, "Could not insert row, table name or column values were empty or null.", new Object[0]);
            return false;
        }
        if (!databaseIsWritable()) {
            return false;
        }
        synchronized (this.dbMutex) {
            try {
                try {
                    z10 = this.database.insert(cleanString(str), null, getContentValueFromMap(map)) != -1;
                } catch (Exception e5) {
                    String str2 = LOG_TAG;
                    Object[] objArr = new Object[1];
                    objArr[0] = e5.getLocalizedMessage() != null ? e5.getLocalizedMessage() : e5.getMessage();
                    Log.warning(str2, "Failed to insert rows into the table (%s)", objArr);
                    return false;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return z10;
    }

    @Override // com.adobe.marketing.mobile.DatabaseService.Database
    public DatabaseService.QueryResult query(Query query) {
        AndroidCursor androidCursor;
        if (query == null) {
            Log.debug(LOG_TAG, "%s (Query), could not provide query result.", "Unexpected Null Value");
            return null;
        }
        synchronized (this.dbMutex) {
            try {
                try {
                    androidCursor = new AndroidCursor(this.database.query(cleanString(query.getTable()), cleanColumnNames(query.getColumns()), query.getSelection(), query.getSelectionArgs(), query.getGroupBy(), query.getHaving(), query.getOrderBy(), query.getLimit()));
                } catch (Exception e5) {
                    String str = LOG_TAG;
                    Object[] objArr = new Object[1];
                    objArr[0] = e5.getLocalizedMessage() != null ? e5.getLocalizedMessage() : e5.getMessage();
                    Log.warning(str, "Failed to execute query (%s)", objArr);
                    return null;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return androidCursor;
    }

    public boolean renameTable(String str, String str2) {
        synchronized (this.dbMutex) {
            try {
                try {
                    this.database.execSQL(String.format("ALTER TABLE %s RENAME TO %s;", str, str2));
                } catch (Exception e5) {
                    String str3 = LOG_TAG;
                    Object[] objArr = new Object[1];
                    objArr[0] = e5.getLocalizedMessage() != null ? e5.getLocalizedMessage() : e5.getMessage();
                    Log.debug(str3, "Failed to rename table (%s)", objArr);
                    return false;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return true;
    }

    @Override // com.adobe.marketing.mobile.DatabaseService.Database
    public boolean update(String str, Map<String, Object> map, String str2, String[] strArr) {
        boolean z10;
        if (StringUtils.isNullOrEmpty(str) || map == null || map.isEmpty()) {
            Log.debug(LOG_TAG, "Could not update rows, table name or column values were empty or null.", new Object[0]);
            return false;
        }
        if (!databaseIsWritable()) {
            return false;
        }
        synchronized (this.dbMutex) {
            try {
                try {
                    z10 = this.database.update(cleanString(str), getContentValueFromMap(map), str2, strArr) != 0;
                } catch (Exception e5) {
                    String str3 = LOG_TAG;
                    Object[] objArr = new Object[1];
                    objArr[0] = e5.getLocalizedMessage() != null ? e5.getLocalizedMessage() : e5.getMessage();
                    Log.warning(str3, "Failed to update table rows (%s)", objArr);
                    return false;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return z10;
    }

    public boolean createTable(String str, String[] strArr, DatabaseService.Database.ColumnDataType[] columnDataTypeArr, List<List<DatabaseService.Database.ColumnConstraint>> list, boolean z10) {
        if (StringUtils.isNullOrEmpty(str) || strArr == null || strArr.length == 0 || columnDataTypeArr == null || columnDataTypeArr.length == 0 || columnDataTypeArr.length != strArr.length || !(list == null || list.size() == strArr.length)) {
            Log.warning(LOG_TAG, "Failed to create table, one or more input parameters is invalid.", new Object[0]);
            return false;
        }
        if (!databaseIsWritable()) {
            return false;
        }
        String strCleanString = cleanString(str);
        String[] strArrCleanColumnNames = cleanColumnNames(strArr);
        synchronized (this.dbMutex) {
            try {
                try {
                    SQLiteStatement sQLiteStatementCompileStatement = this.database.compileStatement(QueryStringBuilder.getCreateTableQueryString(strCleanString, strArrCleanColumnNames, columnDataTypeArr, list, z10));
                    sQLiteStatementCompileStatement.execute();
                    sQLiteStatementCompileStatement.close();
                    migrateDatabaseIfNeeded(strCleanString, strArrCleanColumnNames, columnDataTypeArr, list);
                } catch (Exception e5) {
                    String str2 = LOG_TAG;
                    Object[] objArr = new Object[1];
                    objArr[0] = e5.getLocalizedMessage() != null ? e5.getLocalizedMessage() : e5.getMessage();
                    Log.debug(str2, "Failed to create table (%s)", objArr);
                    return false;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return true;
    }
}

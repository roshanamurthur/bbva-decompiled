package com.adobe.marketing.mobile;

import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
interface DatabaseService {

    public interface Database {

        public enum ColumnConstraint {
            NOT_NULL,
            UNIQUE,
            PRIMARY_KEY,
            AUTOINCREMENT
        }

        public enum ColumnDataType {
            INTEGER,
            REAL,
            TEXT
        }

        void close();

        boolean createTable(String str, String[] strArr, ColumnDataType[] columnDataTypeArr, List<List<ColumnConstraint>> list);

        boolean delete(String str, String str2, String[] strArr);

        boolean insert(String str, Map<String, Object> map);

        QueryResult query(Query query);

        boolean update(String str, Map<String, Object> map, String str2, String[] strArr);
    }

    public interface QueryResult {
        void close();

        int getCount() throws Exception;

        double getDouble(int i10) throws Exception;

        float getFloat(int i10) throws Exception;

        int getInt(int i10) throws Exception;

        long getLong(int i10) throws Exception;

        String getString(int i10) throws Exception;

        boolean isNull(int i10) throws Exception;

        boolean moveToFirst() throws Exception;

        boolean moveToLast() throws Exception;

        boolean moveToNext() throws Exception;
    }

    boolean deleteDatabase(String str);

    Database openDatabase(String str);
}

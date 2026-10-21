package com.adobe.marketing.mobile;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
interface EventHistoryDatabase {
    void close();

    boolean createTable(String[] strArr, DatabaseService.Database.ColumnDataType[] columnDataTypeArr, List<List<DatabaseService.Database.ColumnConstraint>> list);

    int delete(long j10, long j11, long j12);

    boolean deleteDatabase();

    boolean insert(long j10);

    boolean openDatabase();

    DatabaseService.QueryResult select(long j10, long j11, long j12);
}

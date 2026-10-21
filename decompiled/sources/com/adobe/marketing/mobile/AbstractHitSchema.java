package com.adobe.marketing.mobile;

import com.adobe.marketing.mobile.AbstractHit;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
abstract class AbstractHitSchema<T extends AbstractHit> {
    List<List<DatabaseService.Database.ColumnConstraint>> columnConstraints;
    DatabaseService.Database.ColumnDataType[] columnDataTypes;
    String[] columnNames;

    public abstract Map<String, Object> generateDataMap(T t10);

    public abstract T generateHit(DatabaseService.QueryResult queryResult);

    public final List<List<DatabaseService.Database.ColumnConstraint>> getColumnConstraints() {
        return this.columnConstraints;
    }

    public final DatabaseService.Database.ColumnDataType[] getColumnDataTypes() {
        return this.columnDataTypes;
    }

    public final String[] getColumnNames() {
        return this.columnNames;
    }
}

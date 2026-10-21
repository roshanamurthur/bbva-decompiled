package com.adobe.marketing.mobile;

import ci.a;
import com.google.firebase.crashlytics.internal.common.IdManager;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
final class QueryStringBuilder {
    private static final Map<DatabaseService.Database.ColumnConstraint, String> COLUMN_CONSTRAINT_STRING_MAP = new HashMap<DatabaseService.Database.ColumnConstraint, String>() { // from class: com.adobe.marketing.mobile.QueryStringBuilder.1
        {
            put(DatabaseService.Database.ColumnConstraint.PRIMARY_KEY, "PRIMARY KEY");
            put(DatabaseService.Database.ColumnConstraint.AUTOINCREMENT, "AUTOINCREMENT");
            put(DatabaseService.Database.ColumnConstraint.NOT_NULL, "NOT NULL");
            put(DatabaseService.Database.ColumnConstraint.UNIQUE, "UNIQUE");
        }
    };
    private static final Map<DatabaseService.Database.ColumnDataType, String> COLUMN_DATA_TYPE_DEFAULT_MAP = new HashMap<DatabaseService.Database.ColumnDataType, String>() { // from class: com.adobe.marketing.mobile.QueryStringBuilder.2
        {
            put(DatabaseService.Database.ColumnDataType.INTEGER, "0");
            put(DatabaseService.Database.ColumnDataType.REAL, IdManager.DEFAULT_VERSION_NAME);
            put(DatabaseService.Database.ColumnDataType.TEXT, "''");
        }
    };

    private QueryStringBuilder() {
    }

    private static List<String> getColumnConstraints(List<List<DatabaseService.Database.ColumnConstraint>> list) {
        if (list == null || list.isEmpty()) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (List<DatabaseService.Database.ColumnConstraint> list2 : list) {
            if (list2 == null || list2.isEmpty()) {
                arrayList.add(null);
            } else {
                StringBuilder sb2 = new StringBuilder();
                Iterator<DatabaseService.Database.ColumnConstraint> it = list2.iterator();
                while (it.hasNext()) {
                    sb2.append(COLUMN_CONSTRAINT_STRING_MAP.get(it.next()));
                    sb2.append(" ");
                }
                arrayList.add(sb2.toString().trim());
            }
        }
        return arrayList;
    }

    private static List<String> getColumnDataTypes(DatabaseService.Database.ColumnDataType[] columnDataTypeArr) {
        if (columnDataTypeArr == null || columnDataTypeArr.length == 0) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (DatabaseService.Database.ColumnDataType columnDataType : columnDataTypeArr) {
            arrayList.add(columnDataType.name());
        }
        return arrayList;
    }

    public static String getCreateTableQueryString(String str, String[] strArr, DatabaseService.Database.ColumnDataType[] columnDataTypeArr, List<List<DatabaseService.Database.ColumnConstraint>> list, boolean z10) {
        if (StringUtils.isNullOrEmpty(str) || strArr == null || strArr.length == 0 || columnDataTypeArr == null || columnDataTypeArr.length != strArr.length) {
            return null;
        }
        if (list != null && !list.isEmpty() && list.size() != strArr.length) {
            return null;
        }
        List<String> columnDataTypes = getColumnDataTypes(columnDataTypeArr);
        List<String> columnConstraints = getColumnConstraints(list);
        StringBuilder sbD = a.d("CREATE TABLE IF NOT EXISTS ", str, "(");
        for (int i10 = 0; i10 < strArr.length; i10++) {
            sbD.append(strArr[i10]);
            sbD.append(" ");
            sbD.append(columnDataTypes.get(i10));
            if (columnConstraints != null && columnConstraints.get(i10) != null) {
                sbD.append(" ");
                sbD.append(columnConstraints.get(i10));
            }
            if (z10 && columnConstraints != null && list.get(i10) != null && !list.get(i10).contains(DatabaseService.Database.ColumnConstraint.AUTOINCREMENT) && !list.get(i10).contains(DatabaseService.Database.ColumnConstraint.PRIMARY_KEY)) {
                sbD.append(" DEFAULT ");
                sbD.append(COLUMN_DATA_TYPE_DEFAULT_MAP.get(columnDataTypeArr[i10]));
                sbD.append(" ");
            }
            if (i10 < strArr.length - 1) {
                sbD.append(", ");
            }
        }
        sbD.append(")");
        return sbD.toString();
    }
}

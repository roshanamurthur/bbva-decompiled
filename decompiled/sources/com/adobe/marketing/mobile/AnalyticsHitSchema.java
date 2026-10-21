package com.adobe.marketing.mobile;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
class AnalyticsHitSchema extends AbstractHitSchema<AnalyticsHit> {
    private static final int HIT_AAM_FORWARDING_COL_INDEX = 7;
    private static final String HIT_AAM_FORWARDING_COL_NAME = "AAMFORWARDING";
    private static final int HIT_EVENT_IDENTIFIER_COL_INDEX = 8;
    private static final String HIT_EVENT_IDENTIFIER_COL_NAME = "UNIQUEEVENTIDENTIFIER";
    private static final int HIT_ID_COL_INDEX = 0;
    private static final String HIT_ID_COL_NAME = "ID";
    private static final int HIT_IS_PLACEHOLDER_COL_INDEX = 6;
    private static final String HIT_IS_PLACEHOLDER_COL_NAME = "ISPLACEHOLDER";
    private static final int HIT_IS_WAITING_COL_INDEX = 5;
    private static final String HIT_IS_WAITING_COL_NAME = "ISWAITING";
    private static final int HIT_OFFLINE_TRACKING_COL_INDEX = 4;
    private static final String HIT_OFFLINE_TRACKING_COL_NAME = "OFFLINETRACKING";
    private static final int HIT_SERVER_COL_INDEX = 3;
    private static final String HIT_SERVER_COL_NAME = "SERVER";
    private static final int HIT_TIMESTAMP_COL_INDEX = 2;
    private static final String HIT_TIMESTAMP_COL_NAME = "TIMESTAMP";
    private static final int HIT_URL_COL_INDEX = 1;
    private static final String HIT_URL_COL_NAME = "URL";
    private static final String LOG_TAG = "AnalyticsHitSchema";

    public AnalyticsHitSchema() {
        this.columnConstraints = new ArrayList();
        ArrayList arrayList = new ArrayList();
        arrayList.add(DatabaseService.Database.ColumnConstraint.PRIMARY_KEY);
        arrayList.add(DatabaseService.Database.ColumnConstraint.AUTOINCREMENT);
        this.columnConstraints.add(arrayList);
        this.columnConstraints.add(new ArrayList());
        this.columnConstraints.add(new ArrayList());
        this.columnConstraints.add(new ArrayList());
        this.columnConstraints.add(new ArrayList());
        this.columnConstraints.add(new ArrayList());
        this.columnConstraints.add(new ArrayList());
        this.columnConstraints.add(new ArrayList());
        this.columnConstraints.add(new ArrayList());
        this.columnNames = new String[]{HIT_ID_COL_NAME, HIT_URL_COL_NAME, HIT_TIMESTAMP_COL_NAME, HIT_SERVER_COL_NAME, HIT_OFFLINE_TRACKING_COL_NAME, HIT_IS_WAITING_COL_NAME, HIT_IS_PLACEHOLDER_COL_NAME, HIT_AAM_FORWARDING_COL_NAME, HIT_EVENT_IDENTIFIER_COL_NAME};
        DatabaseService.Database.ColumnDataType columnDataType = DatabaseService.Database.ColumnDataType.INTEGER;
        DatabaseService.Database.ColumnDataType columnDataType2 = DatabaseService.Database.ColumnDataType.TEXT;
        this.columnDataTypes = new DatabaseService.Database.ColumnDataType[]{columnDataType, columnDataType2, columnDataType, columnDataType2, columnDataType, columnDataType, columnDataType, columnDataType, columnDataType2};
    }

    public static Map<String, Object> generateUpdateValuesForServer(String str) {
        HashMap map = new HashMap();
        map.put(HIT_SERVER_COL_NAME, str);
        return map;
    }

    public Map<String, Object> generateUpdateValuesForResetIsWaitingFlag() {
        HashMap map = new HashMap();
        map.put(HIT_IS_WAITING_COL_NAME, 0);
        return map;
    }

    public Query getFirstWaitingHitQuery(String str) {
        Query.Builder builder = new Query.Builder(str, this.columnNames);
        builder.selection("ISWAITING = ?", new String[]{"1"});
        builder.limit("1");
        builder.orderBy("ID ASC");
        return builder.build();
    }

    public Query getLatestPlaceHolderHitQuery(String str) {
        Query.Builder builder = new Query.Builder(str, this.columnNames);
        builder.selection("ISPLACEHOLDER = ?", new String[]{"1"});
        builder.limit("1");
        builder.orderBy("ID DESC");
        return builder.build();
    }

    public Query getRegularHitQuery(String str) {
        Query.Builder builder = new Query.Builder(str, this.columnNames);
        builder.selection("ISPLACEHOLDER = ?", new String[]{"0"});
        builder.orderBy("ID DESC");
        return builder.build();
    }

    @Override // com.adobe.marketing.mobile.AbstractHitSchema
    public Map<String, Object> generateDataMap(AnalyticsHit analyticsHit) {
        HashMap map = new HashMap();
        map.put(HIT_URL_COL_NAME, analyticsHit.url);
        map.put(HIT_TIMESTAMP_COL_NAME, Long.valueOf(analyticsHit.timestamp));
        map.put(HIT_SERVER_COL_NAME, analyticsHit.server);
        map.put(HIT_OFFLINE_TRACKING_COL_NAME, Boolean.valueOf(analyticsHit.offlineTrackingEnabled));
        map.put(HIT_IS_WAITING_COL_NAME, Boolean.valueOf(analyticsHit.isWaiting));
        map.put(HIT_IS_PLACEHOLDER_COL_NAME, Boolean.valueOf(analyticsHit.isBackdatePlaceHolder));
        map.put(HIT_AAM_FORWARDING_COL_NAME, Boolean.valueOf(analyticsHit.aamForwardingEnabled));
        map.put(HIT_EVENT_IDENTIFIER_COL_NAME, analyticsHit.uniqueEventIdentifier);
        return map;
    }

    @Override // com.adobe.marketing.mobile.AbstractHitSchema
    public AnalyticsHit generateHit(DatabaseService.QueryResult queryResult) {
        try {
            try {
                AnalyticsHit analyticsHit = new AnalyticsHit();
                analyticsHit.identifier = queryResult.getString(0);
                analyticsHit.url = queryResult.getString(1);
                analyticsHit.timestamp = queryResult.getLong(2);
                analyticsHit.server = queryResult.getString(3);
                analyticsHit.offlineTrackingEnabled = queryResult.getInt(4) == 1;
                analyticsHit.isWaiting = queryResult.getInt(5) == 1;
                analyticsHit.isBackdatePlaceHolder = queryResult.getInt(6) == 1;
                analyticsHit.aamForwardingEnabled = queryResult.getInt(7) == 1;
                analyticsHit.uniqueEventIdentifier = queryResult.getString(8);
                queryResult.close();
                return analyticsHit;
            } catch (Exception e5) {
                Log.error(LOG_TAG, "generateHit - Unable to read from database. Query failed with error %s", e5);
                if (queryResult == null) {
                    return null;
                }
                queryResult.close();
                return null;
            }
        } catch (Throwable th2) {
            if (queryResult != null) {
                queryResult.close();
            }
            throw th2;
        }
    }
}

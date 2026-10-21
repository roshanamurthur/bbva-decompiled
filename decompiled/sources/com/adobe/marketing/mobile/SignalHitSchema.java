package com.adobe.marketing.mobile;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
class SignalHitSchema extends AbstractHitSchema<SignalHit> {
    private static final int HIT_CONTENTTYPE_COL_INDEX = 4;
    private static final String HIT_CONTENTTYPE_COL_NAME = "CONTENTTYPE";
    private static final int HIT_ID_COL_INDEX = 0;
    private static final String HIT_ID_COL_NAME = "ID";
    private static final int HIT_POSTBODY_COL_INDEX = 3;
    private static final String HIT_POSTBODY_COL_NAME = "POSTBODY";
    private static final int HIT_TIMEOUT_COL_INDEX = 5;
    private static final String HIT_TIMEOUT_COL_NAME = "TIMEOUT";
    private static final int HIT_TIMESTAMP_COL_INDEX = 2;
    private static final String HIT_TIMESTAMP_COL_NAME = "TIMESTAMP";
    private static final int HIT_URL_COL_INDEX = 1;
    private static final String HIT_URL_COL_NAME = "URL";
    private static final String LOG_TAG = "SignalHitType";

    public SignalHitSchema() {
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
        this.columnNames = new String[]{HIT_ID_COL_NAME, HIT_URL_COL_NAME, HIT_TIMESTAMP_COL_NAME, HIT_POSTBODY_COL_NAME, HIT_CONTENTTYPE_COL_NAME, HIT_TIMEOUT_COL_NAME};
        DatabaseService.Database.ColumnDataType columnDataType = DatabaseService.Database.ColumnDataType.INTEGER;
        DatabaseService.Database.ColumnDataType columnDataType2 = DatabaseService.Database.ColumnDataType.TEXT;
        this.columnDataTypes = new DatabaseService.Database.ColumnDataType[]{columnDataType, columnDataType2, columnDataType, columnDataType2, columnDataType2, columnDataType};
    }

    @Override // com.adobe.marketing.mobile.AbstractHitSchema
    public Map<String, Object> generateDataMap(SignalHit signalHit) {
        HashMap map = new HashMap();
        map.put(HIT_URL_COL_NAME, signalHit.url);
        map.put(HIT_TIMESTAMP_COL_NAME, Long.valueOf(signalHit.timestamp));
        map.put(HIT_POSTBODY_COL_NAME, signalHit.body);
        map.put(HIT_CONTENTTYPE_COL_NAME, signalHit.contentType);
        map.put(HIT_TIMEOUT_COL_NAME, Integer.valueOf(signalHit.timeout));
        return map;
    }

    @Override // com.adobe.marketing.mobile.AbstractHitSchema
    public SignalHit generateHit(DatabaseService.QueryResult queryResult) {
        try {
            try {
                SignalHit signalHit = new SignalHit();
                signalHit.identifier = queryResult.getString(0);
                signalHit.url = queryResult.getString(1);
                signalHit.timestamp = queryResult.getLong(2);
                signalHit.body = queryResult.getString(3);
                signalHit.contentType = queryResult.getString(4);
                signalHit.timeout = queryResult.getInt(5);
                queryResult.close();
                return signalHit;
            } catch (Exception e5) {
                Log.error(LOG_TAG, "Unable to read from database. Query failed with error %s", e5);
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

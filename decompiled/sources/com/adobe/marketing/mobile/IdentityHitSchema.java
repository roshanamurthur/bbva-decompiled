package com.adobe.marketing.mobile;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
final class IdentityHitSchema extends AbstractHitSchema<IdentityHit> {
    private static final int COL_INDEX_REQUESTS_EVENT_NUMBER = 4;
    private static final int COL_INDEX_REQUESTS_ID = 0;
    private static final int COL_INDEX_REQUESTS_PAIR_ID = 3;
    private static final int COL_INDEX_REQUESTS_SSL = 5;
    private static final int COL_INDEX_REQUESTS_TIMESTAMP = 2;
    private static final int COL_INDEX_REQUESTS_URL = 1;
    private static final String COL_REQUESTS_CONFIG_SSL = "SSL";
    private static final String COL_REQUESTS_EVENT_NUMBER = "EVENT_NUMBER";
    private static final String COL_REQUESTS_ID = "ID";
    private static final String COL_REQUESTS_PAIR_ID = "PAIR_ID";
    private static final String COL_REQUESTS_TIMESTAMP = "TIMESTAMP";
    private static final String COL_REQUESTS_URL = "URL";
    private static final String LOG_TAG = "IdentityHitSchema";

    public IdentityHitSchema() {
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
        this.columnNames = new String[]{COL_REQUESTS_ID, COL_REQUESTS_URL, COL_REQUESTS_TIMESTAMP, COL_REQUESTS_PAIR_ID, COL_REQUESTS_EVENT_NUMBER, COL_REQUESTS_CONFIG_SSL};
        DatabaseService.Database.ColumnDataType columnDataType = DatabaseService.Database.ColumnDataType.INTEGER;
        DatabaseService.Database.ColumnDataType columnDataType2 = DatabaseService.Database.ColumnDataType.TEXT;
        this.columnDataTypes = new DatabaseService.Database.ColumnDataType[]{columnDataType, columnDataType2, columnDataType, columnDataType2, columnDataType, columnDataType};
    }

    public Map<String, Object> generateUpdateValuesForResetEventNumberAndPairId() {
        HashMap map = new HashMap();
        map.put(COL_REQUESTS_PAIR_ID, "");
        map.put(COL_REQUESTS_EVENT_NUMBER, -1);
        return map;
    }

    @Override // com.adobe.marketing.mobile.AbstractHitSchema
    public Map<String, Object> generateDataMap(IdentityHit identityHit) {
        HashMap map = new HashMap();
        map.put(COL_REQUESTS_URL, identityHit.url);
        map.put(COL_REQUESTS_TIMESTAMP, Long.valueOf(identityHit.timestamp));
        map.put(COL_REQUESTS_PAIR_ID, identityHit.pairId);
        map.put(COL_REQUESTS_EVENT_NUMBER, Integer.valueOf(identityHit.eventNumber));
        map.put(COL_REQUESTS_CONFIG_SSL, Boolean.valueOf(identityHit.configSSL));
        return map;
    }

    @Override // com.adobe.marketing.mobile.AbstractHitSchema
    public IdentityHit generateHit(DatabaseService.QueryResult queryResult) {
        try {
            try {
                IdentityHit identityHit = new IdentityHit();
                identityHit.identifier = queryResult.getString(0);
                identityHit.url = queryResult.getString(1);
                identityHit.timestamp = queryResult.getInt(2);
                identityHit.pairId = queryResult.getString(3);
                identityHit.eventNumber = queryResult.getInt(4);
                identityHit.configSSL = queryResult.getInt(5) == 1;
                Log.trace(LOG_TAG, "generateHit : The Identity hits were successfully fetched from the database.", new Object[0]);
                queryResult.close();
                return identityHit;
            } catch (Exception e5) {
                Log.error(LOG_TAG, "generateHit : Unable to read the Identity hits from the database due to an error: (%s).", e5);
                if (queryResult == null) {
                    Log.trace(LOG_TAG, "generateHit : Unable to generate Identity database hit, query result was null.", new Object[0]);
                    return null;
                }
                Log.trace(LOG_TAG, "generateHit : The Identity hits were successfully fetched from the database.", new Object[0]);
                queryResult.close();
                return null;
            }
        } catch (Throwable th2) {
            if (queryResult == null) {
                Log.trace(LOG_TAG, "generateHit : Unable to generate Identity database hit, query result was null.", new Object[0]);
            } else {
                Log.trace(LOG_TAG, "generateHit : The Identity hits were successfully fetched from the database.", new Object[0]);
                queryResult.close();
            }
            throw th2;
        }
    }
}

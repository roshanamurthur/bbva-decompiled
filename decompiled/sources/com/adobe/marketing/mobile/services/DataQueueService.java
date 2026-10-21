package com.adobe.marketing.mobile.services;

import com.adobe.marketing.mobile.LoggingMode;
import com.adobe.marketing.mobile.MobileCore;
import java.io.File;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
class DataQueueService implements DataQueuing {
    private static final String LOG_TAG = "DataQueueService";
    private Map<String, DataQueue> dataQueueCache = new HashMap();
    private final SQLiteDatabaseHelper databaseHelper = new SQLiteDatabaseHelper();

    @Override // com.adobe.marketing.mobile.services.DataQueuing
    public DataQueue getDataQueue(String str) {
        DataQueue dataQueue = this.dataQueueCache.get(str);
        if (dataQueue == null) {
            synchronized (this) {
                try {
                    dataQueue = this.dataQueueCache.get(str);
                    if (dataQueue == null) {
                        File applicationCacheDir = ServiceProvider.getInstance().getDeviceInfoService().getApplicationCacheDir();
                        if (applicationCacheDir == null) {
                            MobileCore.log(LoggingMode.WARNING, LOG_TAG, String.format("Failed in creating DataQueue for database (%s), Cache dir is null.", str));
                            return null;
                        }
                        SQLiteDataQueue sQLiteDataQueue = new SQLiteDataQueue(applicationCacheDir, str, this.databaseHelper);
                        this.dataQueueCache.put(str, sQLiteDataQueue);
                        dataQueue = sQLiteDataQueue;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return dataQueue;
    }
}

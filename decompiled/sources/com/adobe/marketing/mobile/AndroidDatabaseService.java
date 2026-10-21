package com.adobe.marketing.mobile;

import android.database.sqlite.SQLiteDatabase;
import com.bbva.notifications.constants.PushConstants;
import java.io.File;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
class AndroidDatabaseService implements DatabaseService {
    private static final String TAG = "AndroidDatabaseService";
    private final Object dbServiceMutex = new Object();
    private Map<String, DatabaseService.Database> map = new HashMap();
    private final SystemInfoService systemInfoService;

    public AndroidDatabaseService(SystemInfoService systemInfoService) {
        this.systemInfoService = systemInfoService;
        if (systemInfoService == null) {
            Log.warning(TAG, "Unable to access system info service while creating the database service", new Object[0]);
        }
    }

    private String removeRelativePath(String str) {
        try {
            return str.replaceAll("\\.[/\\\\]", "\\.").replaceAll("[/\\\\](\\.{2,})", PushConstants.GE_PARAMS_SEPARATOR);
        } catch (IllegalArgumentException unused) {
            return str;
        }
    }

    @Override // com.adobe.marketing.mobile.DatabaseService
    public boolean deleteDatabase(String str) {
        if (StringUtils.isNullOrEmpty(str)) {
            Log.debug(TAG, "Failed to delete database - filepath is null or empty", new Object[0]);
            return false;
        }
        String strRemoveRelativePath = removeRelativePath(str);
        synchronized (this.dbServiceMutex) {
            try {
                if (!this.map.containsKey(strRemoveRelativePath)) {
                    return false;
                }
                try {
                    File file = new File(strRemoveRelativePath);
                    this.map.remove(strRemoveRelativePath);
                    return file.delete();
                } catch (SecurityException e5) {
                    Log.error(TAG, "Failed to delete database (%s)", e5);
                    return false;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // com.adobe.marketing.mobile.DatabaseService
    public DatabaseService.Database openDatabase(String str) {
        AndroidDatabase androidDatabase;
        if (StringUtils.isNullOrEmpty(str)) {
            Log.debug(TAG, "Failed to open database - filepath is null or empty", new Object[0]);
            return null;
        }
        String strRemoveRelativePath = removeRelativePath(str);
        SystemInfoService systemInfoService = this.systemInfoService;
        if (systemInfoService != null && systemInfoService.getApplicationCacheDir() != null) {
            try {
                if (!new File(strRemoveRelativePath).getCanonicalPath().startsWith(this.systemInfoService.getApplicationCacheDir().getCanonicalPath())) {
                    Log.warning(TAG, "Invalid database file path (%s)", strRemoveRelativePath);
                    return null;
                }
            } catch (Exception e5) {
                Log.warning(TAG, "Failed to read database file (%s)", e5);
                return null;
            }
        }
        synchronized (this.dbServiceMutex) {
            try {
                try {
                    androidDatabase = new AndroidDatabase(SQLiteDatabase.openDatabase(strRemoveRelativePath, null, 268435472));
                    this.map.put(strRemoveRelativePath, androidDatabase);
                } catch (Exception e7) {
                    Log.error(TAG, "Failed to open database (%s)", e7);
                    return null;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return androidDatabase;
    }
}

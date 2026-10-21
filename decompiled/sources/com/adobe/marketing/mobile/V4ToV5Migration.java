package com.adobe.marketing.mobile;

import android.content.Context;
import android.content.SharedPreferences;
import com.google.firebase.dynamiclinks.DynamicLink;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
class V4ToV5Migration {
    private static final String LOG_TAG = "Configuration";
    private static SharedPreferences prefs;

    public static class V4 {
        private static final String DATASTORE_NAME = "APP_MEASUREMENT_CACHE";

        public static class Acquisition {
            private static final String DEFAULTS_KEY_REFERRER_TRACKINGCODE = "trackingcode";
            private static final String DEFAULTS_KEY_REFERRER_UTM_CAMPAIGN = "utm_campaign";
            private static final String DEFAULTS_KEY_REFERRER_UTM_CONTENT = "utm_content";
            private static final String DEFAULTS_KEY_REFERRER_UTM_MEDIUM = "utm_medium";
            private static final String DEFAULTS_KEY_REFERRER_UTM_SOURCE = "utm_source";
            private static final String DEFAULTS_KEY_REFERRER_UTM_TERM = "utm_term";
            private static final String REFERRER_DATA = "ADMS_Referrer_ContextData_Json_String";

            private Acquisition() {
            }
        }

        public static class Analytics {
            private static final String AID = "ADOBEMOBILE_STOREDDEFAULTS_AID";
            private static final String IGNORE_AID = "ADOBEMOBILE_STOREDDEFAULTS_IGNORE_AID";
            private static final String LAST_KNOWN_TIMESTAMP = "ADBLastKnownTimestampKey";

            private Analytics() {
            }
        }

        public static class AudienceManager {
            private static final String USER_ID = "AAMUserId";
            private static final String USER_PROFILE = "AAMUserProfile";

            private AudienceManager() {
            }
        }

        public static class Configuration {
            private static final String GLOBAL_PRIVACY_KEY = "PrivacyStatus";

            private Configuration() {
            }
        }

        public static class Identity {
            private static final String ADVERTISING_IDENTIFIER = "ADOBEMOBILE_STOREDDEFAULTS_ADVERTISING_IDENTIFIER";
            private static final String AID_SYNCED = "ADOBEMOBILE_STOREDDEFAULTS_AID_SYNCED";
            private static final String BLOB = "ADBMOBILE_PERSISTED_MID_BLOB";
            private static final String HINT = "ADBMOBILE_PERSISTED_MID_HINT";
            private static final String MID = "ADBMOBILE_PERSISTED_MID";
            private static final String PUSH_ENABLED = "ADBMOBILE_KEY_PUSH_ENABLED";
            private static final String PUSH_IDENTIFIER = "ADBMOBILE_KEY_PUSH_TOKEN";
            private static final String VISITOR_ID = "APP_MEASUREMENT_VISITOR_ID";
            private static final String VISITOR_IDS = "ADBMOBILE_VISITORID_IDS";
            private static final String VISITOR_ID_SYNC = "ADBMOBILE_VISITORID_SYNC";
            private static final String VISITOR_ID_TTL = "ADBMOBILE_VISITORID_TTL";

            private Identity() {
            }
        }

        public static class Lifecycle {
            private static final String APPLICATION_ID = "ADOBEMOBILE_STOREDDEFAULTS_APPID";
            private static final String CONTEXT_DATA = "ADMS_LifecycleData";
            private static final String INSTALL_DATE = "ADMS_InstallDate";
            private static final String LAST_USED_DATE = "ADMS_LastDateUsed";
            private static final String LAST_VERSION = "ADMS_LastVersion";
            private static final String LAUNCHES = "ADMS_Launches";
            private static final String LAUNCHES_AFTER_UPGRADE = "ADMS_LaunchesAfterUpgrade";
            private static final String OS = "ADOBEMOBILE_STOREDDEFAULTS_OS";
            private static final String PAUSE_DATE = "ADMS_PauseDate";
            private static final String START_DATE = "ADMS_SessionStart";
            private static final String SUCCESFUL_CLOSE = "ADMS_SuccessfulClose";
            private static final String UPGRADE_DATE = "ADMS_UpgradeDate";

            private Lifecycle() {
            }
        }

        public static class Messages {
            private static final String SHARED_PREFERENCES_BLACK_LIST = "messagesBlackList";

            private Messages() {
            }
        }

        public static class Target {
            private static final String COOKIE_EXPIRES = "mboxPC_Expires";
            private static final String COOKIE_VALUE = "mboxPC_Value";
            private static final String LAST_TIMESTAMP = "ADBMOBILE_TARGET_LAST_TIMESTAMP";
            private static final String THIRD_PARTY_ID = "ADBMOBILE_TARGET_3RD_PARTY_ID";
            private static final String TNT_ID = "ADBMOBILE_TARGET_TNT_ID";

            private Target() {
            }
        }

        private V4() {
        }
    }

    public static class V5 {

        public static class Acquisition {
            private static final String DATASTORE_NAME = "Acquisition";
            private static final String REFERRER_DATA = "ADMS_Referrer_ContextData_Json_String";

            private Acquisition() {
            }
        }

        public static class Analytics {
            private static final String AID = "ADOBEMOBILE_STOREDDEFAULTS_AID";
            private static final String DATASTORE_NAME = "AnalyticsDataStorage";
            private static final String IGNORE_AID = "ADOBEMOBILE_STOREDDEFAULTS_IGNORE_AID";
            private static final String VID = "ADOBEMOBILE_STOREDDEFAULTS_VISITOR_IDENTIFIER";

            private Analytics() {
            }
        }

        public static class AudienceManager {
            private static final String DATASTORE_NAME = "AAMDataStore";
            private static final String USER_ID = "AAMUserId";
            private static final String USER_PROFILE = "AAMUserProfile";

            private AudienceManager() {
            }
        }

        public static class Configuration {
            private static final String DATASTORE_NAME = "AdobeMobile_ConfigState";
            private static final String GLOBAL_PRIVACY_KEY = "global.privacy";
            private static final String PERSISTED_OVERRIDDEN_CONFIG = "config.overridden.map";

            private Configuration() {
            }
        }

        public static class Identity {
            private static final String BLOB = "ADOBEMOBILE_PERSISTED_MID_BLOB";
            private static final String DATASTORE_NAME = "visitorIDServiceDataStore";
            private static final String HINT = "ADOBEMOBILE_PERSISTED_MID_HINT";
            private static final String MID = "ADOBEMOBILE_PERSISTED_MID";
            private static final String PUSH_ENABLED = "ADOBEMOBILE_PUSH_ENABLED";
            private static final String VISITOR_ID = "ADOBEMOBILE_VISITOR_ID";
            private static final String VISITOR_IDS = "ADOBEMOBILE_VISITORID_IDS";

            private Identity() {
            }
        }

        public static class Lifecycle {
            private static final String APPLICATION_ID = "ApplicationId";
            private static final String DATASTORE_NAME = "AdobeMobile_Lifecycle";
            private static final String INSTALL_DATE = "InstallDate";
            private static final String LAST_USED_DATE = "LastDateUsed";
            private static final String LAST_VERSION = "LastVersion";
            private static final String LAUNCHES = "Launches";
            private static final String LAUNCHES_AFTER_UPGRADE = "LaunchesAfterUpgrade";
            private static final String OS = "OperatingSystem";
            private static final String PAUSE_DATE = "PauseDate";
            private static final String START_DATE = "ADMS_SessionStart";
            private static final String SUCCESFUL_CLOSE = "SuccessfulClose";
            private static final String UPGRADE_DATE = "UpgradeDate";

            private Lifecycle() {
            }
        }

        public static class MobileServices {
            private static final String DATASTORE_NAME = "ADBMobileServices";
            private static final String DEFAULTS_KEY_INSTALLDATE = "ADMS_Legacy_InstallDate";
            private static final String DEFAULTS_KEY_REFERRER_TRACKINGCODE = "trackingcode";
            private static final String DEFAULTS_KEY_REFERRER_UTM_CAMPAIGN = "utm_campaign";
            private static final String DEFAULTS_KEY_REFERRER_UTM_CONTENT = "utm_content";
            private static final String DEFAULTS_KEY_REFERRER_UTM_MEDIUM = "utm_medium";
            private static final String DEFAULTS_KEY_REFERRER_UTM_SOURCE = "utm_source";
            private static final String DEFAULTS_KEY_REFERRER_UTM_TERM = "utm_term";
            private static final String REFERRER_DATA_JSON_STRING = "ADMS_Referrer_ContextData_Json_String";
            private static final String SHARED_PREFERENCES_BLACK_LIST = "messagesBlackList";

            private MobileServices() {
            }
        }

        public static class Target {
            private static final String DATASTORE_NAME = "ADOBEMOBILE_TARGET";
            private static final String THIRD_PARTY_ID = "THIRD_PARTY_ID";
            private static final String TNT_ID = "TNT_ID";

            private Target() {
            }
        }

        private V5() {
        }
    }

    private long convertMsToSec(long j10) {
        return j10 / 1000;
    }

    private static SharedPreferences getV4SharedPreferences() {
        Context appContext;
        if (prefs == null && (appContext = App.getAppContext()) != null) {
            prefs = appContext.getSharedPreferences("APP_MEASUREMENT_CACHE", 0);
        }
        return prefs;
    }

    private boolean isConfigurationMigrationRequired() {
        SharedPreferences v4SharedPreferences = getV4SharedPreferences();
        if (v4SharedPreferences != null) {
            return v4SharedPreferences.contains("PrivacyStatus");
        }
        Log.debug(LOG_TAG, "%s (application context), failed to migrate v4 configuration data", "Unexpected Null Value");
        return false;
    }

    private boolean isMigrationRequired() {
        SharedPreferences v4SharedPreferences = getV4SharedPreferences();
        if (v4SharedPreferences != null) {
            return v4SharedPreferences.contains("ADMS_InstallDate");
        }
        Log.debug(LOG_TAG, "%s (application context), failed to migrate v4 data", "Unexpected Null Value");
        return false;
    }

    private boolean isVisitorIdMigrationRequired() {
        LocalStorageService.DataStore dataStore = new AndroidLocalStorageService().getDataStore("visitorIDServiceDataStore");
        if (dataStore != null) {
            return dataStore.contains("ADOBEMOBILE_VISITOR_ID");
        }
        Log.debug(LOG_TAG, "%s (application context), failed to migrate v5 visitor identifier", "Unexpected Null Value");
        return false;
    }

    private void migrateConfigurationLocalStorage() {
        MobilePrivacyStatus mobilePrivacyStatus;
        SharedPreferences v4SharedPreferences = getV4SharedPreferences();
        if (v4SharedPreferences == null) {
            Log.debug(LOG_TAG, "%s (application context), failed to migrate v4 storage", "Unexpected Null Value");
            return;
        }
        SharedPreferences.Editor editorEdit = v4SharedPreferences.edit();
        LocalStorageService.DataStore dataStore = new AndroidLocalStorageService().getDataStore("AdobeMobile_ConfigState");
        int i10 = v4SharedPreferences.getInt("PrivacyStatus", -1);
        if (i10 >= 0 && i10 <= 2) {
            if (i10 != 0) {
                mobilePrivacyStatus = i10 != 1 ? MobilePrivacyStatus.UNKNOWN : MobilePrivacyStatus.OPT_OUT;
            } else {
                mobilePrivacyStatus = MobilePrivacyStatus.OPT_IN;
            }
            String string = dataStore.getString("config.overridden.map", null);
            if (string != null) {
                try {
                    JSONObject jSONObject = new JSONObject(string);
                    if (jSONObject.has(EventDataKeys.Configuration.GLOBAL_CONFIG_PRIVACY)) {
                        Log.debug(LOG_TAG, "V5 configuration data already contains setting for global privacy. V4 global privacy not migrated.", new Object[0]);
                    } else {
                        jSONObject.put(EventDataKeys.Configuration.GLOBAL_CONFIG_PRIVACY, mobilePrivacyStatus.getValue());
                        dataStore.setString("config.overridden.map", jSONObject.toString());
                    }
                } catch (JSONException e5) {
                    Log.error(LOG_TAG, "Failed to serialize v5 configuration data. Unable to migrate v4 configuration data to v5. %s", e5.getLocalizedMessage());
                }
            } else {
                HashMap map = new HashMap();
                map.put(EventDataKeys.Configuration.GLOBAL_CONFIG_PRIVACY, mobilePrivacyStatus.getValue());
                dataStore.setString("config.overridden.map", new JSONObject(map).toString());
            }
        }
        editorEdit.remove("PrivacyStatus");
        editorEdit.apply();
        Log.debug(LOG_TAG, "Migration complete for Configuration data.", new Object[0]);
    }

    private void migrateLocalStorage() {
        V4ToV5Migration v4ToV5Migration;
        SharedPreferences v4SharedPreferences = getV4SharedPreferences();
        if (v4SharedPreferences == null) {
            Log.debug(LOG_TAG, "%s (application context), failed to migrate v4 storage", "Unexpected Null Value");
            return;
        }
        SharedPreferences.Editor editorEdit = v4SharedPreferences.edit();
        AndroidLocalStorageService androidLocalStorageService = new AndroidLocalStorageService();
        LocalStorageService.DataStore dataStore = androidLocalStorageService.getDataStore("ADBMobileServices");
        long j10 = v4SharedPreferences.getLong("ADMS_InstallDate", 0L);
        if (j10 > 0) {
            dataStore.setLong("ADMS_Legacy_InstallDate", convertMsToSec(j10));
        }
        dataStore.setString("ADMS_Referrer_ContextData_Json_String", v4SharedPreferences.getString("ADMS_Referrer_ContextData_Json_String", null));
        dataStore.setString("utm_source", v4SharedPreferences.getString("utm_source", null));
        dataStore.setString("utm_medium", v4SharedPreferences.getString("utm_medium", null));
        dataStore.setString(DynamicLink.GoogleAnalyticsParameters.KEY_UTM_TERM, v4SharedPreferences.getString(DynamicLink.GoogleAnalyticsParameters.KEY_UTM_TERM, null));
        dataStore.setString(DynamicLink.GoogleAnalyticsParameters.KEY_UTM_CONTENT, v4SharedPreferences.getString(DynamicLink.GoogleAnalyticsParameters.KEY_UTM_CONTENT, null));
        dataStore.setString("utm_campaign", v4SharedPreferences.getString("utm_campaign", null));
        dataStore.setString("trackingcode", v4SharedPreferences.getString("trackingcode", null));
        dataStore.setString("messagesBlackList", v4SharedPreferences.getString("messagesBlackList", null));
        editorEdit.remove("utm_source");
        editorEdit.remove("utm_medium");
        editorEdit.remove(DynamicLink.GoogleAnalyticsParameters.KEY_UTM_TERM);
        editorEdit.remove(DynamicLink.GoogleAnalyticsParameters.KEY_UTM_CONTENT);
        editorEdit.remove("utm_campaign");
        editorEdit.remove("trackingcode");
        editorEdit.remove("messagesBlackList");
        editorEdit.apply();
        Log.debug(LOG_TAG, "Migration complete for Mobile Services data.", new Object[0]);
        androidLocalStorageService.getDataStore("Acquisition").setString("ADMS_Referrer_ContextData_Json_String", v4SharedPreferences.getString("ADMS_Referrer_ContextData_Json_String", null));
        editorEdit.remove("ADMS_Referrer_ContextData_Json_String");
        editorEdit.apply();
        Log.debug(LOG_TAG, "Migration complete for Acquisition data.", new Object[0]);
        LocalStorageService.DataStore dataStore2 = androidLocalStorageService.getDataStore("AnalyticsDataStorage");
        dataStore2.setString("ADOBEMOBILE_STOREDDEFAULTS_AID", getV4SharedPreferences().getString("ADOBEMOBILE_STOREDDEFAULTS_AID", null));
        dataStore2.setBoolean("ADOBEMOBILE_STOREDDEFAULTS_IGNORE_AID", getV4SharedPreferences().getBoolean("ADOBEMOBILE_STOREDDEFAULTS_IGNORE_AID", false));
        dataStore2.setString("ADOBEMOBILE_STOREDDEFAULTS_VISITOR_IDENTIFIER", getV4SharedPreferences().getString("APP_MEASUREMENT_VISITOR_ID", null));
        editorEdit.remove("ADOBEMOBILE_STOREDDEFAULTS_AID");
        editorEdit.remove("ADOBEMOBILE_STOREDDEFAULTS_IGNORE_AID");
        editorEdit.remove("ADBLastKnownTimestampKey");
        editorEdit.apply();
        Log.debug(LOG_TAG, "Migration complete for Analytics data.", new Object[0]);
        androidLocalStorageService.getDataStore("AAMDataStore").setString("AAMUserId", v4SharedPreferences.getString("AAMUserId", null));
        editorEdit.remove("AAMUserId");
        editorEdit.remove("AAMUserProfile");
        editorEdit.apply();
        Log.debug(LOG_TAG, "Migration complete for Audience Manager data.", new Object[0]);
        LocalStorageService.DataStore dataStore3 = androidLocalStorageService.getDataStore("visitorIDServiceDataStore");
        dataStore3.setString("ADOBEMOBILE_PERSISTED_MID", v4SharedPreferences.getString("ADBMOBILE_PERSISTED_MID", null));
        dataStore3.setString("ADOBEMOBILE_PERSISTED_MID_BLOB", v4SharedPreferences.getString("ADBMOBILE_PERSISTED_MID_BLOB", null));
        dataStore3.setString("ADOBEMOBILE_PERSISTED_MID_HINT", v4SharedPreferences.getString("ADBMOBILE_PERSISTED_MID_HINT", null));
        dataStore3.setString("ADOBEMOBILE_VISITORID_IDS", v4SharedPreferences.getString("ADBMOBILE_VISITORID_IDS", null));
        dataStore3.setBoolean("ADOBEMOBILE_PUSH_ENABLED", v4SharedPreferences.getBoolean("ADBMOBILE_KEY_PUSH_ENABLED", false));
        editorEdit.remove("ADBMOBILE_PERSISTED_MID");
        editorEdit.remove("ADBMOBILE_PERSISTED_MID_BLOB");
        editorEdit.remove("ADBMOBILE_PERSISTED_MID_HINT");
        editorEdit.remove("APP_MEASUREMENT_VISITOR_ID");
        editorEdit.remove("ADBMOBILE_VISITORID_IDS");
        editorEdit.remove("ADBMOBILE_VISITORID_SYNC");
        editorEdit.remove("ADBMOBILE_VISITORID_TTL");
        editorEdit.remove("ADOBEMOBILE_STOREDDEFAULTS_ADVERTISING_IDENTIFIER");
        editorEdit.remove("ADBMOBILE_KEY_PUSH_TOKEN");
        editorEdit.remove("ADBMOBILE_KEY_PUSH_ENABLED");
        editorEdit.remove("ADOBEMOBILE_STOREDDEFAULTS_AID_SYNCED");
        editorEdit.apply();
        Log.debug(LOG_TAG, "Migration complete for Identity (Visitor ID Service) data.", new Object[0]);
        LocalStorageService.DataStore dataStore4 = androidLocalStorageService.getDataStore("AdobeMobile_Lifecycle");
        if (j10 > 0) {
            v4ToV5Migration = this;
            dataStore4.setLong("InstallDate", v4ToV5Migration.convertMsToSec(j10));
        } else {
            v4ToV5Migration = this;
        }
        dataStore4.setString("LastVersion", v4SharedPreferences.getString("ADMS_LastVersion", null));
        long j11 = v4SharedPreferences.getLong("ADMS_LastDateUsed", 0L);
        if (j11 > 0) {
            dataStore4.setLong("LastDateUsed", v4ToV5Migration.convertMsToSec(j11));
        }
        dataStore4.setInt("Launches", v4SharedPreferences.getInt("ADMS_Launches", 0));
        dataStore4.setBoolean("SuccessfulClose", v4SharedPreferences.getBoolean("ADMS_SuccessfulClose", false));
        editorEdit.remove("ADMS_InstallDate");
        editorEdit.remove("ADMS_LastVersion");
        editorEdit.remove("ADMS_LastDateUsed");
        editorEdit.remove("ADMS_Launches");
        editorEdit.remove("ADMS_SuccessfulClose");
        editorEdit.remove("ADMS_LifecycleData");
        editorEdit.remove("ADMS_SessionStart");
        editorEdit.remove("ADMS_PauseDate");
        editorEdit.remove("ADMS_LaunchesAfterUpgrade");
        editorEdit.remove("ADMS_UpgradeDate");
        editorEdit.remove("ADOBEMOBILE_STOREDDEFAULTS_OS");
        editorEdit.remove("ADOBEMOBILE_STOREDDEFAULTS_APPID");
        editorEdit.apply();
        Log.debug(LOG_TAG, "Migration complete for Lifecycle data.", new Object[0]);
        LocalStorageService.DataStore dataStore5 = androidLocalStorageService.getDataStore("ADOBEMOBILE_TARGET");
        dataStore5.setString("TNT_ID", v4SharedPreferences.getString("ADBMOBILE_TARGET_TNT_ID", null));
        dataStore5.setString("THIRD_PARTY_ID", v4SharedPreferences.getString("ADBMOBILE_TARGET_3RD_PARTY_ID", null));
        editorEdit.remove("ADBMOBILE_TARGET_TNT_ID");
        editorEdit.remove("ADBMOBILE_TARGET_3RD_PARTY_ID");
        editorEdit.remove("ADBMOBILE_TARGET_LAST_TIMESTAMP");
        editorEdit.remove("mboxPC_Expires");
        editorEdit.remove("mboxPC_Value");
        editorEdit.apply();
        Log.debug(LOG_TAG, "Migrating complete for Target data.", new Object[0]);
    }

    private void migrateVisitorId() {
        AndroidLocalStorageService androidLocalStorageService = new AndroidLocalStorageService();
        LocalStorageService.DataStore dataStore = androidLocalStorageService.getDataStore("visitorIDServiceDataStore");
        LocalStorageService.DataStore dataStore2 = androidLocalStorageService.getDataStore("AnalyticsDataStorage");
        if (dataStore == null || dataStore2 == null) {
            Log.debug(LOG_TAG, "%s (Identity or Analytics data store), failed to migrate visitor id.", "Unexpected Null Value");
            return;
        }
        if (!dataStore2.contains("ADOBEMOBILE_STOREDDEFAULTS_VISITOR_IDENTIFIER")) {
            dataStore2.setString("ADOBEMOBILE_STOREDDEFAULTS_VISITOR_IDENTIFIER", dataStore.getString("ADOBEMOBILE_VISITOR_ID", null));
        }
        dataStore.remove("ADOBEMOBILE_VISITOR_ID");
    }

    private void removeV4Databases() {
        ArrayList<String> arrayList = new ArrayList();
        arrayList.add("ADBMobile3rdPartyDataCache.sqlite");
        arrayList.add("ADBMobilePIICache.sqlite");
        arrayList.add("ADBMobileDataCache.sqlite");
        arrayList.add("ADBMobileTimedActionsCache.sqlite");
        Context appContext = App.getAppContext();
        if (appContext == null) {
            Log.debug(LOG_TAG, "%s (app context), failed to delete V4 databases", "Unexpected Null Value");
            return;
        }
        File cacheDir = appContext.getCacheDir();
        for (String str : arrayList) {
            try {
                File file = new File(cacheDir, str);
                if (file.exists() && file.delete()) {
                    Log.debug(LOG_TAG, "Removed V4 database %s successfully", str);
                }
            } catch (SecurityException e5) {
                Log.debug(LOG_TAG, "Failed to delete V4 database with name %s (%s)", str, e5);
            }
        }
    }

    public void migrate() {
        if (isMigrationRequired()) {
            Log.debug(LOG_TAG, "Migrating Adobe SDK v4 SharedPreferences for use with Adobe SDK v5.", new Object[0]);
            migrateLocalStorage();
            migrateConfigurationLocalStorage();
            removeV4Databases();
            Log.debug(LOG_TAG, "Full migrating of SharedPreferences successful.", new Object[0]);
        } else if (isConfigurationMigrationRequired()) {
            Log.debug(LOG_TAG, "Migrating Adobe SDK v4 Configuration SharedPreferences for use with Adobe SDK v5.", new Object[0]);
            migrateConfigurationLocalStorage();
            Log.debug(LOG_TAG, "Full migrating of v4 Configuration SharedPreferences successful.", new Object[0]);
        }
        if (isVisitorIdMigrationRequired()) {
            Log.debug(LOG_TAG, "Migrating visitor identifier from Identity to Analytics.", new Object[0]);
            migrateVisitorId();
            Log.debug(LOG_TAG, "Full migration of visitor identifier from Identity to Analytics successful.", new Object[0]);
        }
    }
}

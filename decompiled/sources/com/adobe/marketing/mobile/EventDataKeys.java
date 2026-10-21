package com.adobe.marketing.mobile;

/* JADX INFO: loaded from: classes2.dex */
@Deprecated
final class EventDataKeys {
    public static final String CORE_VERSION = "0.1";
    public static final String DATA_MAP = "adb_data_map";
    public static final String DEEPLINK_SCHEME = "adbinapp";
    public static final String DEEPLINK_SCHEME_PATH_CANCEL = "cancel";
    public static final String DEEPLINK_SCHEME_PATH_CONFIRM = "confirm";
    public static final String DEEPLINK_URI = "adb_deeplink_uri";
    public static final String DEFAULT_DATA_KEY = "defaultdata";
    public static final String EVENT_STATE_OWNER = "stateowner";
    public static final String LOC_LATITUDE = "adb_loc_lat";
    public static final String LOC_LONGITUDE = "adb_loc_long";
    public static final String PAGE_NAME = "adb_page_name";

    public static final class Acquisition {
        public static final String ACQUISITION_TYPE_INSTALL = "install";
        public static final String ACQUISITION_TYPE_KEY = "acquisitiontype";
        public static final String ACQUISITION_TYPE_RETENTION = "retention";
        public static final String APP_ID_KEY = "appid";
        public static final String DATA_DEEPLINK_KEY = "deeplink";
        public static final String LIFECYCLE_LOCAL_NOTIFICATION_ID_KEY = "notificationid";
        public static final String LIFECYCLE_PUSH_MESSAGE_ID_KEY = "pushmessageid";
        public static final String MODULE_NAME = "com.adobe.module.acquisition";
        public static final String REFERRER_DATA = "referrerdata";
        public static final String REFERRER_DATA_KEY = "receivedreferrerdata";

        private Acquisition() {
        }
    }

    public static final class Analytics {
        public static final String ANALYTICS_ID = "aid";
        public static final String ANALYTICS_SERVER_RESPONSE_KEY = "analyticsserverresponse";
        public static final String CLEAR_HITS_QUEUE = "clearhitsqueue";
        public static final String CONTEXT_DATA = "contextdata";
        public static final String FORCE_KICK_HITS = "forcekick";
        public static final String GET_QUEUE_SIZE = "getqueuesize";
        public static final String MODULE_NAME = "com.adobe.module.analytics";
        public static final String QUEUE_SIZE = "queuesize";
        public static final String TRACK_ACTION = "action";
        public static final String TRACK_INTERNAL = "trackinternal";
        public static final String TRACK_STATE = "state";

        public static class ContextDataKeys {
            static final String ACTION_KEY = "a.action";
            static final String ADVERTISING_IDENTIFIER = "a.adid";
            static final String APPLICATION_IDENTIFIER = "a.AppID";
            static final String BEACON_MAJOR_KEY = "a.beacon.major";
            static final String BEACON_MINOR_KEY = "a.beacon.minor";
            static final String BEACON_PROX_KEY = "a.beacon.prox";
            static final String BEACON_UUID_KEY = "a.beacon.uuid";
            static final String CARRIER_NAME = "a.CarrierName";
            static final String CRASH_EVENT_KEY = "a.CrashEvent";
            static final String DAILY_ENGAGED_EVENT_KEY = "a.DailyEngUserEvent";
            static final String DAYS_SINCE_FIRST_LAUNCH = "a.DaysSinceFirstUse";
            static final String DAYS_SINCE_LAST_LAUNCH = "a.DaysSinceLastUse";
            static final String DAYS_SINCE_LAST_UPGRADE = "a.DaysSinceLastUpgrade";
            static final String DAY_OF_WEEK = "a.DayOfWeek";
            static final String DEVICE_NAME = "a.DeviceName";
            static final String DEVICE_RESOLUTION = "a.Resolution";
            static final String HOUR_OF_DAY = "a.HourOfDay";
            static final String IGNORED_SESSION_LENGTH = "a.ignoredSessionLength";
            static final String INSTALL_DATE = "a.InstallDate";
            static final String INSTALL_EVENT_KEY = "a.InstallEvent";
            static final String INTERNAL_ACTION_KEY = "a.internalaction";
            static final String LAUNCHES = "a.Launches";
            static final String LAUNCHES_SINCE_UPGRADE = "a.LaunchesSinceUpgrade";
            static final String LAUNCH_EVENT_KEY = "a.LaunchEvent";
            static final String LOCALE = "a.locale";
            static final String MONTHLY_ENGAGED_EVENT_KEY = "a.MonthlyEngUserEvent";
            static final String OPERATING_SYSTEM = "a.OSVersion";
            static final String PREVIOUS_SESSION_LENGTH = "a.PrevSessionLength";
            static final String RUN_MODE = "a.RunMode";
            static final String TIME_SINCE_LAUNCH_KEY = "a.TimeSinceLaunch";
            static final String UPGRADE_EVENT_KEY = "a.UpgradeEvent";

            private ContextDataKeys() {
            }
        }

        public static class ContextDataValues {
            static final String CRASH_EVENT = "CrashEvent";
            static final String DAILY_ENG_USER_EVENT = "DailyEngUserEvent";
            static final String INSTALL_EVENT = "InstallEvent";
            static final String LAUNCH_EVENT = "LaunchEvent";
            static final String MONTHLY_ENG_USER_EVENT = "MonthlyEngUserEvent";
            static final String UPGRADE_EVENT = "UpgradeEvent";

            private ContextDataValues() {
            }
        }

        private Analytics() {
        }
    }

    public static final class Audience {
        public static final String DPID = "dpid";
        public static final String DPUUID = "dpuuid";
        public static final String MODULE_NAME = "com.adobe.module.audience";
        public static final String UUID = "uuid";
        public static final String VISITOR_PROFILE = "aamprofile";
        public static final String VISITOR_TRAITS = "aamtraits";

        private Audience() {
        }
    }

    public static final class Configuration {
        public static final String AAM_CONFIG_SERVER = "audience.server";
        public static final String AAM_CONFIG_TIMEOUT = "audience.timeout";
        public static final String ACQUISITION_CONFIG_APPID = "acquisition.appid";
        public static final String ACQUISITION_CONFIG_SERVER = "acquisition.server";
        public static final String ANALYTICS_CONFIG_AAMFORWARDING = "analytics.aamForwardingEnabled";
        public static final String ANALYTICS_CONFIG_BACKDATE_PREVIOUS_SESSION = "analytics.backdatePreviousSessionInfo";
        public static final String ANALYTICS_CONFIG_BATCH_LIMIT = "analytics.batchLimit";
        public static final String ANALYTICS_CONFIG_LIFECYCLE_TIMEOUT = "analytics.lifecycleTimeout";
        public static final String ANALYTICS_CONFIG_OFFLINE_TRACKING = "analytics.offlineEnabled";
        public static final String ANALYTICS_CONFIG_REFERRER_TIMEOUT = "analytics.referrerTimeout";
        public static final String ANALYTICS_CONFIG_REPORT_SUITES = "analytics.rsids";
        public static final String ANALYTICS_CONFIG_SERVER = "analytics.server";
        public static final String CONFIGURATION_REQUEST_CONTENT_INTERNAL_BOOT = "config.internal.boot";
        public static final String CONFIGURATION_REQUEST_CONTENT_JSON_APP_ID = "config.appId";
        public static final String CONFIGURATION_REQUEST_CONTENT_JSON_FILE_PATH = "config.filePath";
        public static final String CONFIGURATION_REQUEST_CONTENT_RETRIEVE_CONFIG = "config.getData";
        public static final String CONFIGURATION_REQUEST_CONTENT_UPDATE_CONFIG = "config.update";
        public static final String CONFIGURATION_RESPONSE_IDENTITY_ALL_IDENTIFIERS = "config.allIdentifiers";
        public static final String CONFIG_EXPERIENCE_CLOUD_ORGID_KEY = "experienceCloud.org";
        public static final String GLOBAL_CONFIG_PRIVACY = "global.privacy";
        public static final String GLOBAL_CONFIG_SSL = "global.ssl";
        public static final String IDENTITY_ADID_ENABLED = "identity.adidEnabled";
        public static final String LIFECYCLE_CONFIG_SESSION_TIMEOUT = "lifecycle.sessionTimeout";
        public static final String MESSAGING_URL = "messaging.url";
        public static final String MODULE_NAME = "com.adobe.module.configuration";
        public static final String RULES_CONFIG_URL = "rules.url";
        public static final String SIGNAL_CONFIG_URL = "signals.url";
        public static final String TARGET_CLIENT_CODE = "target.clientCode";
        public static final String TARGET_ENVIRONMENT_ID = "target.environmentId";
        public static final String TARGET_NETWORK_TIMEOUT = "target.timeout";

        private Configuration() {
        }
    }

    public static final class Identity {
        public static final String ADID_DSID = "DSID_20914";
        public static final String ADVERTISING_IDENTIFIER = "advertisingidentifier";
        public static final String AUTHENTICATION_STATE = "authenticationstate";
        public static final String BASE_URL = "baseurl";
        public static final String DPIDS = "dpids";
        public static final String EVENT_PUSH_STATUS = "a.push.optin";
        public static final String FORCE_SYNC = "forcesync";
        public static final String IDENTIFIERS = "visitoridentifiers";
        public static final String IS_SYNC_EVENT = "issyncevent";
        public static final String MCPNS_DPID = "20919";
        public static final String MODULE_NAME = "com.adobe.module.identity";
        public static final String PUSH_IDENTIFIER = "pushidentifier";
        public static final String PUSH_ID_ENABLED_ACTION_NAME = "Push";
        public static final String UPDATED_URL = "updatedurl";
        public static final String USER_IDENTIFIER = "vid";
        public static final String VISITOR_IDS_LAST_SYNC = "lastsync";
        public static final String VISITOR_IDS_LIST = "visitoridslist";
        public static final String VISITOR_ID_BLOB = "blob";
        public static final String VISITOR_ID_LOCATION_HINT = "locationhint";
        public static final String VISITOR_ID_MID = "mid";

        private Identity() {
        }
    }

    public static final class Lifecycle {
        public static final String ADDITIONAL_CONTEXT_DATA = "additionalcontextdata";
        public static final String LIFECYCLE_ACTION_KEY = "action";
        public static final String LIFECYCLE_CONTEXT_DATA = "lifecyclecontextdata";
        public static final String LIFECYCLE_PAUSE = "pause";
        public static final String LIFECYCLE_START = "start";
        public static final String MAX_SESSION_LENGTH = "maxsessionlength";
        public static final String MODULE_NAME = "com.adobe.module.lifecycle";
        public static final String PREVIOUS_SESSION_PAUSE_TIMESTAMP = "previousSessionPauseTimestampmillis";
        public static final String PREVIOUS_SESSION_START_TIMESTAMP = "previoussessionstarttimestampmillis";
        public static final String SESSION_EVENT = "sessionevent";
        public static final String SESSION_START_TIMESTAMP = "starttimestampmillis";

        private Lifecycle() {
        }
    }

    public static final class Messages {
        public static final String MODULE_NAME = "com.adobe.module.messages";

        private Messages() {
        }
    }

    public static final class RuleEngine {
        public static final String CONSEQUENCES_LOADED = "loadedconsequences";
        public static final String CONSEQUENCE_ASSETS_PATH = "assetsPath";
        public static final String CONSEQUENCE_JSON_DETAIL = "detail";
        public static final String CONSEQUENCE_JSON_ID = "id";
        public static final String CONSEQUENCE_JSON_TYPE = "type";
        public static final String CONSEQUENCE_TRIGGERED = "triggeredconsequence";
        public static final String MODULE_NAME = "com.adobe.module.rulesEngine";
        public static final String RULES_REQUEST_CONTENT_DOWNLOAD_RULES = "download_rules";
        public static final String RULES_RESPONSE_CONSEQUENCE_KEY_DETAIL = "detail";
        public static final String RULES_RESPONSE_CONSEQUENCE_KEY_ID = "id";
        public static final String RULES_RESPONSE_CONSEQUENCE_KEY_TYPE = "type";
        public static final String RULES_RESPONSE_CONSEQUENCE_TYPE_OPEN_URL = "url";
        public static final String RULES_RESPONSE_CONSEQUENCE_TYPE_PII = "pii";
        public static final String RULES_RESPONSE_CONSEQUENCE_TYPE_POSTBACKS = "pb";
        public static final String RULES_RESPONSE_CONTENT_CONTEXT_DATA = "context_data";

        private RuleEngine() {
        }
    }

    public static final class Signal {
        public static final String MODULE_NAME = "com.adobe.module.signal";
        public static final String SIGNAL_CONTEXT_DATA = "contextdata";

        private Signal() {
        }
    }

    public static final class Target {
        public static final String BASE_CLASS = "baseclass";
        public static final String CLEAR_PREFETCH_CACHE = "clearcache";
        public static final String DEFAULT_CONTENT = "defaultcontent";
        public static final String LOAD_REQUESTS = "request";
        public static final String LOCATION_CLICKED = "locationclicked";
        public static final String MBOX_NAME = "mboxname";
        public static final String MBOX_PARAMETERS = "mboxparameters";
        public static final String MODULE_NAME = "com.adobe.module.target";
        public static final String ORDER_PARAMETERS = "orderparameters";
        public static final String PREFETCH_REQUESTS = "prefetch";
        public static final String PREFETCH_RESULT = "prefetchresult";
        public static final String PREVIEW_RESTART_DEEP_LINK = "restartdeeplink";
        public static final String PRODUCT_PARAMETERS = "productparameters";
        public static final String PROFILE_PARAMETERS = "profileparams";
        public static final String RESET_EXPERIENCE = "resetexperience";
        public static final String RESPONSE_PAIR_ID = "responsepairid";
        public static final String TARGET_CONTENT = "content";
        public static final String THIRD_PARTY_ID = "thirdpartyid";
        public static final String TNT_ID = "tntid";

        private Target() {
        }
    }

    public static final class UserProfile {
        public static final String CONSEQUENCE_KEY = "key";
        public static final String CONSEQUENCE_OPERATION = "operation";
        public static final String CONSEQUENCE_VALUE = "value";
        public static final String MODULE_NAME = "com.adobe.module.userProfile";
        public static final String REMOVE_DATA_KEY = "userprofileremovekey";
        public static final String UPDATE_DATA_KEY = "userprofileupdatekey";
        public static final String USER_PROFILE_DATA_KEY = "userprofiledata";

        private UserProfile() {
        }
    }

    private EventDataKeys() {
    }
}

package com.adobe.marketing.mobile;

import java.util.HashMap;

/* JADX INFO: loaded from: classes2.dex */
final class AnalyticsConstants {
    static final String ACTION_PREFIX = "AMACTION:";
    static final String ANALYTICS_DATA_STORAGE = "AnalyticsDataStorage";
    static final String ANALYTICS_PARAMETER_KEY_BLOB = "aamb";
    static final String ANALYTICS_PARAMETER_KEY_LOCATION_HINT = "aamlh";
    static final String ANALYTICS_PARAMETER_KEY_MID = "mid";
    static final String ANALYTICS_REQUEST_ACTION_NAME_KEY = "pev2";
    static final String ANALYTICS_REQUEST_ANALYTICS_ID_KEY = "aid";
    static final String ANALYTICS_REQUEST_CHARSET_KEY = "ce";
    static final String ANALYTICS_REQUEST_CONTEXT_DATA_KEY = "c";
    static final String ANALYTICS_REQUEST_CUSTOMER_PERSPECTIVE_KEY = "cp";
    static final String ANALYTICS_REQUEST_DEBUG_API_PAYLOAD = "&p.&debug=true&.p";
    static final String ANALYTICS_REQUEST_FORMATTED_TIMESTAMP_KEY = "t";
    static final String ANALYTICS_REQUEST_IGNORE_PAGE_NAME_KEY = "pe";
    static final String ANALYTICS_REQUEST_PAGE_NAME_KEY = "pageName";
    static final String ANALYTICS_REQUEST_PRIVACY_MODE_KEY = "a.privacy.mode";
    static final String ANALYTICS_REQUEST_PRIVACY_MODE_UNKNOWN = "unknown";
    static final String ANALYTICS_REQUEST_STRING_TIMESTAMP_KEY = "ts";
    static final String ANALYTICS_REQUEST_VISITOR_ID_KEY = "vid";
    static final String APP_STATE_BACKGROUND = "background";
    static final String APP_STATE_FOREGROUND = "foreground";
    static final int CONNECTION_TIMEOUT_SEC = 5;
    static final String CRASH_INTERNAL_ACTION_NAME = "Crash";
    static final String IGNORE_PAGE_NAME_VALUE = "lnk_o";
    static final String INTERNAL_ACTION_PREFIX = "ADBINTERNAL:";
    static final String LIFECYCLE_INTERNAL_ACTION_NAME = "Lifecycle";
    static final HashMap<String, String> MAP_TO_CONTEXT_DATA_KEYS = createMap();
    static final String SESSION_INFO_INTERNAL_ACTION_NAME = "SessionInfo";
    static final String TRACK_INTERNAL_ADOBE_LINK = "AdobeLink";
    static final String VAR_ESCAPE_PREFIX = "&&";

    public static final class ContextDataKeys {
        static final String ACTION_KEY = "a.action";
        static final String ADVERTISING_IDENTIFIER = "a.adid";
        static final String APPLICATION_IDENTIFIER = "a.AppID";
        static final String CARRIER_NAME = "a.CarrierName";
        static final String CRASH_EVENT_KEY = "a.CrashEvent";
        static final String DAILY_ENGAGED_EVENT_KEY = "a.DailyEngUserEvent";
        static final String DAYS_SINCE_FIRST_LAUNCH = "a.DaysSinceFirstUse";
        static final String DAYS_SINCE_LAST_LAUNCH = "a.DaysSinceLastUse";
        static final String DAYS_SINCE_LAST_UPGRADE = "a.DaysSinceLastUpgrade";
        static final String DAY_OF_WEEK = "a.DayOfWeek";
        static final String DEVICE_NAME = "a.DeviceName";
        static final String DEVICE_RESOLUTION = "a.Resolution";
        static final String EVENT_IDENTIFIER_KEY = "a.DebugEventIdentifier";
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
        static final String REGION_ID = "a.loc.poi.id";
        static final String REGION_NAME = "a.loc.poi";
        static final String RUN_MODE = "a.RunMode";
        static final String TIME_SINCE_LAUNCH_KEY = "a.TimeSinceLaunch";
        static final String UPGRADE_EVENT_KEY = "a.UpgradeEvent";

        private ContextDataKeys() {
        }
    }

    public static final class ContextDataValues {
        static final String CRASH_EVENT = "CrashEvent";

        private ContextDataValues() {
        }
    }

    public static final class DataStoreKeys {
        static final String AID_KEY = "ADOBEMOBILE_STOREDDEFAULTS_AID";
        static final String MOST_RECENT_HIT_TIMESTAMP_SECONDS = "mostRecentHitTimestampSeconds";
        static final String VISITOR_IDENTIFIER_KEY = "ADOBEMOBILE_STOREDDEFAULTS_VISITOR_IDENTIFIER";

        private DataStoreKeys() {
        }
    }

    public static final class Default {
        static final boolean DEFAULT_ASSURANCE_SESSION_ENABLED = false;
        static final boolean DEFAULT_BACKDATE_SESSION_INFO_ENABLED = false;
        static final int DEFAULT_BATCH_LIMIT = 0;
        static final boolean DEFAULT_FORWARDING_ENABLED = false;
        static final int DEFAULT_LAUNCH_DEEPLINK_DATA_WAIT_TIMEOUT = 500;
        static final int DEFAULT_LIFECYCLE_PAUSE_START_TIMEOUT = 1000;
        static final int DEFAULT_LIFECYCLE_RESPONSE_WAIT_TIMEOUT = 1000;
        static final int DEFAULT_LIFECYCLE_SESSION_TIMEOUT = 300000;
        static final boolean DEFAULT_OFFLINE_ENABLED = false;
        static final MobilePrivacyStatus DEFAULT_PRIVACY_STATUS = MobilePrivacyStatus.OPT_IN;
        static final int DEFAULT_REFERRER_TIMEOUT = 0;

        private Default() {
        }
    }

    public static final class EventDataKeys {
        static final String STATE_OWNER = "stateowner";

        public static final class Analytics {
            static final String ANALYTICS_ID = "aid";
            static final String ANALYTICS_SERVER_RESPONSE = "analyticsserverresponse";
            static final String CLEAR_HITS_QUEUE = "clearhitsqueue";
            static final String CONTENT_TYPE_HEADER = "Content-Type";
            static final String CONTEXT_DATA = "contextdata";
            static final String ETAG_HEADER = "ETag";
            static final String EXTENSION_NAME = "com.adobe.module.analytics";
            static final String FORCE_KICK_HITS = "forcekick";
            static final String GET_QUEUE_SIZE = "getqueuesize";
            static final String HEADERS_RESPONSE = "headers";
            static final String HIT_HOST = "hitHost";
            static final String HIT_URL = "hitUrl";
            static final String QUEUE_SIZE = "queuesize";
            static final String REQUEST_EVENT_IDENTIFIER = "requestEventIdentifier";
            static final String RULES_CONSEQUENCE_TYPE_TRACK = "an";
            static final String SERVER_HEADER = "Server";
            static final String TRACK_ACTION = "action";
            static final String TRACK_INTERNAL = "trackinternal";
            static final String TRACK_STATE = "state";
            static final String VISITOR_IDENTIFIER = "vid";

            private Analytics() {
            }
        }

        public static final class Assurance {
            static final String EXTENSION_NAME = "com.adobe.assurance";
            static final String SESSION_ID = "sessionid";

            private Assurance() {
            }
        }

        public static final class Configuration {
            static final String ANALYTICS_CONFIG_AAMFORWARDING = "analytics.aamForwardingEnabled";
            static final String ANALYTICS_CONFIG_BACKDATE_PREVIOUS_SESSION = "analytics.backdatePreviousSessionInfo";
            static final String ANALYTICS_CONFIG_BATCH_LIMIT = "analytics.batchLimit";
            static final String ANALYTICS_CONFIG_LAUNCH_HIT_DELAY = "analytics.launchHitDelay";
            static final String ANALYTICS_CONFIG_OFFLINE_TRACKING = "analytics.offlineEnabled";
            static final String ANALYTICS_CONFIG_REPORT_SUITES = "analytics.rsids";
            static final String ANALYTICS_CONFIG_SERVER = "analytics.server";
            static final String CONFIG_EXPERIENCE_CLOUD_ORGID_KEY = "experienceCloud.org";
            static final String EXTENSION_NAME = "com.adobe.module.configuration";
            static final String GLOBAL_CONFIG_PRIVACY = "global.privacy";
            static final String LIFECYCLE_SESSION_TIMEOUT = "lifecycle.sessionTimeout";

            private Configuration() {
            }
        }

        public static final class Identity {
            static final String ADVERTISING_IDENTIFIER = "advertisingidentifier";
            static final String EXTENSION_NAME = "com.adobe.module.identity";
            static final String USER_IDENTIFIER = "vid";
            static final String VISITOR_IDS_LIST = "visitoridslist";
            static final String VISITOR_ID_BLOB = "blob";
            static final String VISITOR_ID_LOCATION_HINT = "locationhint";
            static final String VISITOR_ID_MID = "mid";

            private Identity() {
            }
        }

        public static final class Lifecycle {
            static final String APP_ID = "appid";
            static final String CARRIER_NAME = "carriername";
            static final String CRASH_EVENT = "crashevent";
            static final String DAILY_ENGAGED_EVENT = "dailyenguserevent";
            static final String DAYS_SINCE_FIRST_LAUNCH = "dayssincefirstuse";
            static final String DAYS_SINCE_LAST_LAUNCH = "dayssincelastuse";
            static final String DAYS_SINCE_LAST_UPGRADE = "dayssincelastupgrade";
            static final String DAY_OF_WEEK = "dayofweek";
            static final String DEVICE_NAME = "devicename";
            static final String DEVICE_RESOLUTION = "resolution";
            static final String EXTENSION_NAME = "com.adobe.module.lifecycle";
            static final String HOUR_OF_DAY = "hourofday";
            static final String IGNORED_SESSION_LENGTH = "ignoredsessionlength";
            static final String INSTALL_DATE = "installdate";
            static final String INSTALL_EVENT = "installevent";
            static final String LAUNCHES = "launches";
            static final String LAUNCHES_SINCE_UPGRADE = "launchessinceupgrade";
            static final String LAUNCH_EVENT = "launchevent";
            static final String LIFECYCLE_ACTION_KEY = "action";
            static final String LIFECYCLE_CONTEXT_DATA = "lifecyclecontextdata";
            static final String LIFECYCLE_PAUSE = "pause";
            static final String LIFECYCLE_START = "start";
            static final String LOCALE = "locale";
            static final String MAX_SESSION_LENGTH = "maxsessionlength";
            static final String MONTHLY_ENGAGED_EVENT = "monthlyenguserevent";
            static final String OPERATING_SYSTEM = "osversion";
            static final String PREVIOUS_APP_ID = "previousappid";
            static final String PREVIOUS_OS_VERSION = "previousosversion";
            static final String PREVIOUS_SESSION_LENGTH = "prevsessionlength";
            static final String PREVIOUS_SESSION_PAUSE_TIMESTAMP = "previoussessionpausetimestampmillis";
            static final String PREVIOUS_SESSION_START_TIMESTAMP = "previoussessionstarttimestampmillis";
            static final String RUN_MODE = "runmode";
            static final String SESSION_EVENT = "sessionevent";
            static final String SESSION_START_TIMESTAMP = "starttimestampmillis";
            static final String UPGRADE_EVENT = "upgradeevent";

            private Lifecycle() {
            }
        }

        public static final class Places {
            static final String CURRENT_POI = "currentpoi";
            static final String EXTENSION_NAME = "com.adobe.module.places";
            static final String REGION_ID = "regionid";
            static final String REGION_NAME = "regionname";

            private Places() {
            }
        }

        public static final class RuleEngine {
            static final String CONSEQUENCE_TRIGGERED = "triggeredconsequence";
            static final String RULES_RESPONSE_CONSEQUENCE_KEY_DETAIL = "detail";
            static final String RULES_RESPONSE_CONSEQUENCE_KEY_ID = "id";
            static final String RULES_RESPONSE_CONSEQUENCE_KEY_TYPE = "type";

            private RuleEngine() {
            }
        }

        private EventDataKeys() {
        }
    }

    private AnalyticsConstants() {
    }

    public static HashMap<String, String> createMap() {
        HashMap<String, String> map = new HashMap<>();
        map.put(com.adobe.marketing.mobile.EventDataKeys.Identity.ADVERTISING_IDENTIFIER, "a.adid");
        map.put("appid", "a.AppID");
        map.put("carriername", "a.CarrierName");
        map.put("crashevent", "a.CrashEvent");
        map.put("dailyenguserevent", "a.DailyEngUserEvent");
        map.put("dayofweek", "a.DayOfWeek");
        map.put("dayssincefirstuse", "a.DaysSinceFirstUse");
        map.put("dayssincelastuse", "a.DaysSinceLastUse");
        map.put("dayssincelastupgrade", "a.DaysSinceLastUpgrade");
        map.put("devicename", "a.DeviceName");
        map.put("resolution", "a.Resolution");
        map.put("hourofday", "a.HourOfDay");
        map.put("ignoredsessionlength", "a.ignoredSessionLength");
        map.put("installdate", "a.InstallDate");
        map.put("installevent", "a.InstallEvent");
        map.put("launchevent", "a.LaunchEvent");
        map.put("launches", "a.Launches");
        map.put("launchessinceupgrade", "a.LaunchesSinceUpgrade");
        map.put("locale", "a.locale");
        map.put("monthlyenguserevent", "a.MonthlyEngUserEvent");
        map.put("osversion", "a.OSVersion");
        map.put("prevsessionlength", "a.PrevSessionLength");
        map.put("runmode", "a.RunMode");
        map.put("upgradeevent", "a.UpgradeEvent");
        map.put("previousosversion", "a.OSVersion");
        map.put("previousappid", "a.AppID");
        return map;
    }
}

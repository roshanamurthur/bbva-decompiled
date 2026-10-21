package com.adobe.marketing.mobile;

import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes2.dex */
class LifecycleConstants {
    static final String DATA_STORE_NAME = "AdobeMobile_Lifecycle";
    static final int DEFAULT_LIFECYCLE_TIMEOUT = 300;
    static final long MAX_SESSION_LENGTH_SECONDS;
    static final long WRONG_EPOCH_MAX_LENGTH_SECONDS;

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

    public static class DataStoreKeys {
        static final String APP_ID = "AppId";
        static final String INSTALL_DATE = "InstallDate";
        static final String LAST_USED_DATE = "LastDateUsed";
        static final String LAST_VERSION = "LastVersion";
        static final String LAUNCHES = "Launches";
        static final String LAUNCHES_AFTER_UPGRADE = "LaunchesAfterUpgrade";
        static final String LIFECYCLE_DATA = "LifecycleData";
        static final String OS_VERSION = "OsVersion";
        static final String PAUSE_DATE = "PauseDate";
        static final String START_DATE = "SessionStart";
        static final String SUCCESSFUL_CLOSE = "SuccessfulClose";
        static final String UPGRADE_DATE = "UpgradeDate";

        private DataStoreKeys() {
        }
    }

    public static final class EventDataKeys {
        static final String STATE_OWNER = "stateowner";

        public static final class Configuration {
            static final String LIFECYCLE_CONFIG_SESSION_TIMEOUT = "lifecycle.sessionTimeout";
            static final String MODULE_NAME = "com.adobe.module.configuration";

            private Configuration() {
            }
        }

        public static final class Identity {
            static final String ADVERTISING_IDENTIFIER = "advertisingidentifier";
            static final String MODULE_NAME = "com.adobe.module.identity";

            private Identity() {
            }
        }

        public static final class Lifecycle {
            static final String ADDITIONAL_CONTEXT_DATA = "additionalcontextdata";
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
            static final String MODULE_NAME = "com.adobe.module.lifecycle";
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

        private EventDataKeys() {
        }
    }

    static {
        TimeUnit timeUnit = TimeUnit.DAYS;
        MAX_SESSION_LENGTH_SECONDS = timeUnit.toSeconds(7L);
        WRONG_EPOCH_MAX_LENGTH_SECONDS = timeUnit.toSeconds(10950L);
    }

    private LifecycleConstants() {
    }
}

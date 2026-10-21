package com.adobe.marketing.mobile;

/* JADX INFO: loaded from: classes2.dex */
class ConfigurationConstants {
    static final String FRIENDLY_NAME = "Configuration";

    public static final class EventDataKeys {

        public static final class Configuration {
            static final String BUILD_ENVIRONMENT = "build.environment";
            static final String CONFIGURATION_REQUEST_CONTENT_CLEAR_UPDATED_CONFIG = "config.clearUpdates";
            static final String CONFIGURATION_REQUEST_CONTENT_IS_INTERNAL_EVENT = "config.isinternalevent";
            static final String CONFIGURATION_REQUEST_CONTENT_JSON_APP_ID = "config.appId";
            static final String CONFIGURATION_REQUEST_CONTENT_JSON_ASSET_FILE = "config.assetFile";
            static final String CONFIGURATION_REQUEST_CONTENT_JSON_FILE_PATH = "config.filePath";
            static final String CONFIGURATION_REQUEST_CONTENT_RETRIEVE_CONFIG = "config.getData";
            static final String CONFIGURATION_REQUEST_CONTENT_UPDATE_CONFIG = "config.update";
            static final String CONFIGURATION_RESPONSE_IDENTITY_ALL_IDENTIFIERS = "config.allIdentifiers";
            static final String ENVIRONMENT_PREFIX_DELIMITER = "__";
            static final String EVENT_STATE_OWNER = "stateowner";
            static final String GLOBAL_CONFIG_PRIVACY = "global.privacy";
            static final String MODULE_NAME = "com.adobe.module.configuration";
            static final String RULES_CONFIG_URL = "rules.url";

            private Configuration() {
            }
        }

        public static final class Lifecycle {
            static final String LIFECYCLE_START = "start";
            static final String SESSION_EVENT = "sessionevent";

            private Lifecycle() {
            }
        }

        public static final class RuleEngine {
            static final String CONSEQUENCE_JSON_DETAIL = "detail";
            static final String CONSEQUENCE_JSON_ID = "id";
            static final String CONSEQUENCE_JSON_TYPE = "type";
            static final String CONSEQUENCE_TRIGGERED = "triggeredconsequence";

            private RuleEngine() {
            }
        }

        private EventDataKeys() {
        }
    }

    public static final class SharedStateKeys {

        public static final class Analytics {
            static final String ANALYTICS_ID = "aid";
            static final String MODULE_NAME = "com.adobe.module.analytics";
            static final String USER_IDENTIFIER = "vid";

            private Analytics() {
            }
        }

        public static final class Audience {
            static final String DPID = "dpid";
            static final String DPUUID = "dpuuid";
            static final String MODULE_NAME = "com.adobe.module.audience";
            static final String UUID = "uuid";

            private Audience() {
            }
        }

        public static final class Configuration {
            static final String ANALYTICS_CONFIG_REPORT_SUITES = "analytics.rsids";
            static final String CONFIG_EXPERIENCE_CLOUD_ORGID_KEY = "experienceCloud.org";

            private Configuration() {
            }
        }

        public static final class Identity {
            static final String ADVERTISING_IDENTIFIER = "advertisingidentifier";
            static final String MID = "mid";
            static final String MODULE_NAME = "com.adobe.module.identity";
            static final String PUSH_IDENTIFIER = "pushidentifier";
            static final String VISITOR_IDS_LIST = "visitoridslist";

            private Identity() {
            }
        }

        public static final class Target {
            static final String MODULE_NAME = "com.adobe.module.target";
            static final String THIRD_PARTY_ID = "thirdpartyid";
            static final String TNT_ID = "tntid";

            private Target() {
            }
        }

        private SharedStateKeys() {
        }
    }

    private ConfigurationConstants() {
    }
}

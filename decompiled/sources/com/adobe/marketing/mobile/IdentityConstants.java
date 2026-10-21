package com.adobe.marketing.mobile;

/* JADX INFO: loaded from: classes2.dex */
final class IdentityConstants {
    static final int ID_INFO_SIZE = 3;
    static final String JSON_CONFIG_ORGID_KEY = "experienceCloud.org";
    static final String JSON_CONFIG_PRIVACY_KEY = "global.privacy";
    static final String JSON_EXPERIENCE_CLOUD_SERVER_KEY = "experienceCloud.server";

    public static class DataStoreKeys {
        static final String ADVERTISING_IDENTIFIER = "ADOBEMOBILE_ADVERTISING_IDENTIFIER";
        static final String AID_SYNCED_KEY = "ADOBEMOBILE_AID_SYNCED";
        static final String ANALYTICS_PUSH_SYNC = "ADOBEMOBILE_ANALYTICS_PUSH_SYNC";
        static final String BLOB = "ADOBEMOBILE_PERSISTED_MID_BLOB";
        static final String IDENTITY_PROPERTIES_DATA_STORE_NAME = "visitorIDServiceDataStore";
        static final String LAST_SYNC = "ADOBEMOBILE_VISITORID_SYNC";
        static final String LOCATION_HINT = "ADOBEMOBILE_PERSISTED_MID_HINT";
        static final String MARKETING_CLOUD_ID = "ADOBEMOBILE_PERSISTED_MID";
        static final String PUSH_ENABLED = "ADOBEMOBILE_PUSH_ENABLED";
        static final String PUSH_IDENTIFIER = "ADOBEMOBILE_PUSH_IDENTIFIER";
        static final String TTL = "ADOBEMOBILE_VISITORID_TTL";
        static final String VISITOR_IDS_STRING = "ADOBEMOBILE_VISITORID_IDS";

        private DataStoreKeys() {
        }
    }

    public static final class Defaults {
        static final String CID_DELIMITER = "%01";
        static final MobilePrivacyStatus DEFAULT_MOBILE_PRIVACY = MobilePrivacyStatus.UNKNOWN;
        static final boolean DEFAULT_SSL = true;
        static final long DEFAULT_TTL_VALUE = 600;
        static final String SERVER = "dpm.demdex.net";
        static final int TIMEOUT = 2000;
        static final String ZERO_ADVERTISING_ID = "00000000-0000-0000-0000-000000000000";

        private Defaults() {
        }
    }

    public static final class EventDataKeys {
        static final String STATE_OWNER = "stateowner";

        public static final class Analytics {
            static final String ANALYTICS_ID = "aid";
            static final String CONTEXT_DATA = "contextdata";
            static final String MODULE_NAME = "com.adobe.module.analytics";
            static final String TRACK_ACTION = "action";
            static final String TRACK_INTERNAL = "trackinternal";
            static final String VISITOR_IDENTIFIER = "vid";

            private Analytics() {
            }
        }

        public static final class Audience {
            static final String OPTED_OUT_HIT_SENT = "optedouthitsent";

            private Audience() {
            }
        }

        public static final class Configuration {
            static final String AAM_CONFIG_SERVER = "audience.server";
            static final String CONFIGURATION_REQUEST_CONTENT_UPDATE_CONFIG = "config.update";
            static final String CONFIG_EXPERIENCE_CLOUD_ORGID_KEY = "experienceCloud.org";
            static final String GLOBAL_CONFIG_PRIVACY = "global.privacy";
            static final String MODULE_NAME = "com.adobe.module.configuration";

            private Configuration() {
            }
        }

        public static final class EventHub {
            static final String EXTENSIONS_KEY = "extensions";
            static final String MODULE_NAME = "com.adobe.module.eventhub";

            private EventHub() {
            }
        }

        public static final class Identity {
            static final String ADID_DSID = "DSID_20914";
            static final String ADVERTISING_IDENTIFIER = "advertisingidentifier";
            static final String ANALYTICS_ID = "AVID";
            static final String AUTHENTICATION_STATE = "authenticationstate";
            static final String BASE_URL = "baseurl";
            static final String DPIDS = "dpids";
            static final String EVENT_PUSH_STATUS = "a.push.optin";
            static final String FORCE_SYNC = "forcesync";
            static final String IDENTIFIERS = "visitoridentifiers";
            static final String IS_SYNC_EVENT = "issyncevent";
            static final String MCPNS_DPID = "20919";
            static final String MODULE_NAME = "com.adobe.module.identity";
            static final String PUSH_IDENTIFIER = "pushidentifier";
            static final String PUSH_ID_ENABLED_ACTION_NAME = "Push";
            static final String UPDATED_URL = "updatedurl";
            static final String UPDATE_SHARED_STATE = "updatesharedstate";
            static final String URL_VARIABLES = "urlvariables";
            static final String VISITOR_IDS_LAST_SYNC = "lastsync";
            static final String VISITOR_IDS_LIST = "visitoridslist";
            static final String VISITOR_ID_BLOB = "blob";
            static final String VISITOR_ID_LOCATION_HINT = "locationhint";
            static final String VISITOR_ID_MID = "mid";

            private Identity() {
            }
        }

        private EventDataKeys() {
        }
    }

    public static class UrlKeys {
        static final String ADB_ANALYTICS_PAYLOAD_KEY = "adobe_aa_vid";
        static final String ADB_VISITOR_PAYLOAD_ANALYTICS_ID_KEY = "MCAID";
        static final String ADB_VISITOR_PAYLOAD_KEY = "adobe_mc";
        static final String ADB_VISITOR_PAYLOAD_MARKETING_CLOUD_ID_KEY = "MCMID";
        static final String ADB_VISITOR_PAYLOAD_MARKETING_CLOUD_ORG_ID = "MCORGID";
        static final String ADB_VISITOR_TIMESTAMP_KEY = "TS";
        static final String BLOB = "d_blob";
        static final String CONSENT_INTEGRATION_CODE = "d_consent_ic";
        static final String DEVICE_CONSENT = "device_consent";
        static final String HINT = "dcs_region";
        static final String MID = "d_mid";
        static final String OPT_OUT = "d_optout";
        static final String ORGID = "d_orgid";
        static final String PATH_OPTOUT = "demoptout.jpg";
        static final String RESPONSE_ERROR = "error_msg";
        static final String TTL = "id_sync_ttl";
        static final String VISITOR_ID = "d_cid_ic";

        private UrlKeys() {
        }
    }

    private IdentityConstants() {
    }
}

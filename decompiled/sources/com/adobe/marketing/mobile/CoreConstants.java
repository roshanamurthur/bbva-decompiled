package com.adobe.marketing.mobile;

/* JADX INFO: loaded from: classes2.dex */
final class CoreConstants {

    public static class EventDataKeys {

        public static final class Analytics {
            static final String CONTEXT_DATA = "contextdata";
            static final String TRACK_ACTION = "action";
            static final String TRACK_STATE = "state";

            private Analytics() {
            }
        }

        public static final class Configuration {
            static final String CONFIGURATION_REQUEST_CONTENT_CLEAR_UPDATED_CONFIG = "config.clearUpdates";
            static final String CONFIGURATION_REQUEST_CONTENT_JSON_APP_ID = "config.appId";
            static final String CONFIGURATION_REQUEST_CONTENT_JSON_ASSET_FILE = "config.assetFile";
            static final String CONFIGURATION_REQUEST_CONTENT_JSON_FILE_PATH = "config.filePath";
            static final String CONFIGURATION_REQUEST_CONTENT_RETRIEVE_CONFIG = "config.getData";
            static final String CONFIGURATION_REQUEST_CONTENT_UPDATE_CONFIG = "config.update";
            static final String GLOBAL_CONFIG_PRIVACY = "global.privacy";

            private Configuration() {
            }
        }

        public static final class Identity {
            static final String ADVERTISING_IDENTIFIER = "advertisingidentifier";
            static final String PUSH_IDENTIFIER = "pushidentifier";

            private Identity() {
            }
        }

        public static final class Lifecycle {
            static final String ADDITIONAL_CONTEXT_DATA = "additionalcontextdata";
            static final String LIFECYCLE_ACTION_KEY = "action";
            static final String LIFECYCLE_PAUSE = "pause";
            static final String LIFECYCLE_START = "start";

            private Lifecycle() {
            }
        }

        public static final class RuleEngine {
            static final String RULES_REQUEST_CONTENT_DOWNLOAD_RULES = "download_rules";

            private RuleEngine() {
            }
        }

        public static final class Signal {
            static final String SIGNAL_CONTEXT_DATA = "contextdata";

            private Signal() {
            }
        }

        private EventDataKeys() {
        }
    }

    private CoreConstants() {
    }
}

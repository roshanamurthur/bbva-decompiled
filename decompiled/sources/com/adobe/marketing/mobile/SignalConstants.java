package com.adobe.marketing.mobile;

/* JADX INFO: loaded from: classes2.dex */
class SignalConstants {

    public static final class EventDataKeys {

        public static final class Configuration {
            static final String GLOBAL_CONFIG_PRIVACY = "global.privacy";
            static final String MODULE_NAME = "com.adobe.module.configuration";

            private Configuration() {
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

        public static final class Signal {
            static final String MODULE_NAME = "com.adobe.module.signal";
            static final String RULES_RESPONSE_CONSEQUENCE_TYPE_OPEN_URL = "url";
            static final String RULES_RESPONSE_CONSEQUENCE_TYPE_PII = "pii";
            static final String RULES_RESPONSE_CONSEQUENCE_TYPE_POSTBACKS = "pb";
            static final String RULES_RESPONSE_CONTENT_OPENURL_URLS = "url";
            static final String SIGNAL_CONTEXT_DATA = "contextdata";

            private Signal() {
            }
        }

        private EventDataKeys() {
        }
    }

    private SignalConstants() {
    }
}

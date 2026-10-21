package com.adobe.marketing.mobile;

/* JADX INFO: loaded from: classes2.dex */
class RulesEngineConstants {
    static final String DISPATCH_CONSEQUENCE_EVENT_NAME = "Dispatch Consequence Result";
    static final int MAX_CHAINED_CONSEQUENCE_COUNT = 1;

    public static final class ConsequenceType {
        static final String ATTACH = "add";
        static final String DISPATCH = "dispatch";
        static final String MODIFY = "mod";
    }

    public static final class EventDataKeys {
        static final String CONSEQUENCE_DETAIL = "detail";
        static final String CONSEQUENCE_DETAIL_ACTION_COPY = "copy";
        static final String CONSEQUENCE_DETAIL_ACTION_NEW = "new";
        static final String CONSEQUENCE_DETAIL_EVENT_DATA = "eventdata";
        static final String CONSEQUENCE_DETAIL_EVENT_DATA_ACTION = "eventdataaction";
        static final String CONSEQUENCE_DETAIL_SOURCE = "source";
        static final String CONSEQUENCE_DETAIL_TYPE = "type";
        static final String CONSEQUENCE_JSON_TYPE = "type";
        static final String CONSEQUENCE_TRIGGERED = "triggeredconsequence";

        private EventDataKeys() {
        }
    }

    public static final class EventHistory {
        static final String ANY = "any";

        public static final class RuleDefinition {
            static final String EVENTS = "events";
            static final String FROM = "from";
            static final String MATCHER = "matcher";
            static final String SEARCH_TYPE = "searchType";
            static final String TO = "to";
            static final String VALUE = "value";

            private RuleDefinition() {
            }
        }

        private EventHistory() {
        }
    }

    private RulesEngineConstants() {
    }
}

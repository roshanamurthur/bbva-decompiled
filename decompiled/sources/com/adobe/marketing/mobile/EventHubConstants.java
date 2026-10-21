package com.adobe.marketing.mobile;

/* JADX INFO: loaded from: classes2.dex */
public class EventHubConstants {

    public static final class EventDataKeys {

        public static final class Configuration {
            static final String EVENT_STATE_OWNER = "stateowner";

            private Configuration() {
            }
        }

        public static final class EventHub {
            static final String EXTENSIONS = "extensions";
            static final String FRIENDLY_NAME = "friendlyName";
            static final String SHARED_STATE_NAME = "com.adobe.module.eventhub";
            static final String TYPE = "type";
            static final String VERSION = "version";
            static final String WRAPPER = "wrapper";

            private EventHub() {
            }
        }

        private EventDataKeys() {
        }
    }

    public static final class Wrapper {

        public static final class Name {
            static final String CORDOVA = "Cordova";
            static final String FLUTTER = "Flutter";
            static final String NONE = "None";
            static final String REACT_NATIVE = "React Native";
            static final String UNITY = " Unity";
            static final String XAMARIN = "Xamarin";

            private Name() {
            }
        }

        public static final class Type {
            static final String CORDOVA = "C";
            static final String FLUTTER = "F";
            static final String NONE = "N";
            static final String REACT_NATIVE = "R";
            static final String UNITY = "U";
            static final String XAMARIN = "X";

            private Type() {
            }
        }

        private Wrapper() {
        }
    }

    private EventHubConstants() {
    }
}

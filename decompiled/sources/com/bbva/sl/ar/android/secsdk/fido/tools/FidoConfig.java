package com.bbva.sl.ar.android.secsdk.fido.tools;

import java.util.Map;
import java.util.Objects;

/* JADX INFO: loaded from: classes8.dex */
public class FidoConfig {
    private static final String TAG = "FidoConfig";
    private static Map<String, Object> mProperties;

    public enum Property {
        TENANT("tenant", null),
        AUTOSTART_ON_PUSH("autoStartOnOobPush", Boolean.TRUE),
        SELECTION_TIMEOUT("selectionTimeout", 600);

        private Object defaultValue;
        private String key;

        Property(String str, Object obj) {
            this.key = str;
            this.defaultValue = obj;
        }
    }

    private FidoConfig() {
    }

    public static <T> T getProperty(Property property) {
        Map<String, Object> map = mProperties;
        if (map == null) {
            return null;
        }
        try {
            return map.containsKey(property.key) ? (T) mProperties.get(property.key) : (T) property.defaultValue;
        } catch (ClassCastException unused) {
            Objects.toString(property);
            return (T) property.defaultValue;
        } catch (Exception unused2) {
            Objects.toString(property);
            return (T) property.defaultValue;
        }
    }

    public static void setProperties(Map<String, Object> map) {
        mProperties = map;
    }
}

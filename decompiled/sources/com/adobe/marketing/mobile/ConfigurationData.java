package com.adobe.marketing.mobile;

import androidx.camera.core.impl.utils.c;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
class ConfigurationData {
    private final Map<String, Variant> internalMap = new HashMap();
    private final JsonUtilityService jsonUtilityService;

    public ConfigurationData(JsonUtilityService jsonUtilityService) {
        this.jsonUtilityService = jsonUtilityService;
    }

    private int size() {
        return this.internalMap.size();
    }

    public EventData getEventData() {
        EventData eventData = new EventData();
        for (Map.Entry<String, Variant> entry : this.internalMap.entrySet()) {
            eventData.putVariant(entry.getKey(), entry.getValue());
        }
        return eventData;
    }

    public String getJSONString() {
        try {
            return ((JsonUtilityService.JSONObject) Variant.fromVariantMap(this.internalMap).getTypedObject(new JsonObjectVariantSerializer(this.jsonUtilityService))).toString();
        } catch (Exception e5) {
            Log.debug(ConfigurationExtension.LOG_SOURCE, "Unable create a JSON from ConfigurationData. Exception: (%s)", e5);
            return null;
        }
    }

    public String getKeyForEnvironment(String str, String str2) {
        return str2.isEmpty() ? str : c.a("__", str2, "__", str);
    }

    public boolean isEmpty() {
        return this.internalMap.isEmpty();
    }

    public ConfigurationData put(String str) {
        if (!StringUtils.isNullOrEmpty(str)) {
            try {
                return put(this.jsonUtilityService.createJSONObject(str));
            } catch (Exception e5) {
                Log.debug(ConfigurationExtension.LOG_SOURCE, "Unable to parse the Configuration from JSON String. Exception: (%s)", e5);
            }
        }
        return this;
    }

    public String toString() {
        return this.internalMap.toString();
    }

    public ConfigurationData put(Map<String, Variant> map) {
        if (map != null) {
            try {
                for (Map.Entry<String, Variant> entry : map.entrySet()) {
                    String key = entry.getKey();
                    if (key != null) {
                        this.internalMap.put(key, entry.getValue());
                    }
                }
            } catch (Exception e5) {
                Log.debug(ConfigurationExtension.LOG_SOURCE, "Unable to parse the Configuration from HashMap. Exception: (%s)", e5);
            }
        }
        return this;
    }

    public ConfigurationData put(ConfigurationData configurationData) {
        if (configurationData != null && configurationData.size() > 0) {
            try {
                for (Map.Entry<String, Variant> entry : configurationData.internalMap.entrySet()) {
                    String key = entry.getKey();
                    if (key != null) {
                        this.internalMap.put(key, entry.getValue());
                    }
                }
            } catch (Exception e5) {
                Log.debug(ConfigurationExtension.LOG_SOURCE, "Unable to put new ConfigData. Exception: (%s)", e5);
            }
        }
        return this;
    }

    public ConfigurationData put(JsonUtilityService.JSONObject jSONObject) {
        if (jSONObject == null) {
            return this;
        }
        try {
            String strOptString = jSONObject.optString("build.environment", "");
            Map<String, Variant> variantMap = Variant.fromTypedObject(jSONObject, new JsonObjectVariantSerializer(this.jsonUtilityService)).getVariantMap();
            Iterator<Map.Entry<String, Variant>> it = variantMap.entrySet().iterator();
            while (it.hasNext()) {
                String key = it.next().getKey();
                if (!key.startsWith("__")) {
                    String keyForEnvironment = getKeyForEnvironment(key, strOptString);
                    if (!variantMap.containsKey(keyForEnvironment)) {
                        keyForEnvironment = key;
                    }
                    Variant variant = variantMap.get(keyForEnvironment);
                    if (variant != null) {
                        this.internalMap.put(key, variant);
                    } else {
                        continue;
                    }
                }
            }
        } catch (VariantException e5) {
            Log.debug(ConfigurationExtension.LOG_SOURCE, "Unable to parse the Configuration from JSON Object. Exception: (%s)", e5);
        }
        return this;
    }
}

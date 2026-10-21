package com.adobe.marketing.mobile;

import androidx.camera.core.impl.utils.a;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
class EventDataFlattener {
    private static final String LOG_TAG = "EventDataFlattener";
    private static final String NAMESPACE_DELIMITER = ".";

    private EventDataFlattener() {
    }

    private static Map<String, Variant> flatten(String str, Variant variant) {
        HashMap map = new HashMap();
        map.put(str, variant);
        if (variant.getKind() == VariantKind.MAP) {
            try {
                map.putAll(flatten(str, variant.getVariantMap()));
            } catch (VariantException e5) {
                Log.warning(LOG_TAG, "Unexpected exception in EventDataFlattener.flatten: nameSpacedKey = %s, value = %s, ex = %s", str, variant, e5);
                return Collections.emptyMap();
            }
        }
        return map;
    }

    public static Map<String, Variant> getFlattenedDataMap(EventData eventData) {
        HashMap map = new HashMap();
        if (eventData != null) {
            for (String str : eventData.keys()) {
                try {
                    map.putAll(flatten(str, eventData.getVariant(str)));
                } catch (VariantException e5) {
                    Log.warning(LOG_TAG, "Unexpected exception in EventDataFlattener.getFlattenedDataMap: eventData = %s, key = %s, ex = %s", eventData, str, e5);
                }
            }
        }
        return map;
    }

    public static Map<String, Variant> getFlattenedEventDataMask(Map<String, Variant> map) {
        HashMap map2 = new HashMap();
        if (map != null && !map.isEmpty()) {
            for (String str : map.keySet()) {
                map2.putAll(flatten(str, map.get(str)));
            }
        }
        return map2;
    }

    private static Map<String, Variant> flatten(String str, Map<String, Variant> map) {
        HashMap map2 = new HashMap();
        if (map != null) {
            for (Map.Entry<String, Variant> entry : map.entrySet()) {
                map2.putAll(flatten(a.b(str, ".", entry.getKey() == null ? "" : entry.getKey()), entry.getValue()));
            }
        }
        return map2;
    }
}

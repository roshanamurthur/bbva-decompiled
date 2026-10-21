package com.adobe.marketing.mobile;

import androidx.camera.camera2.internal.compat.u;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
class AnalyticsRequestSerializer {
    private static final int REQUEST_STRINGBUILDER_CAPACITY = 2048;

    public static String generateAnalyticsCustomerIdString(List<VisitorID> list) {
        if (list == null) {
            return null;
        }
        HashMap map = new HashMap();
        for (VisitorID visitorID : list) {
            map.put(serializeIdentifierKeyForAnalyticsID(visitorID.getIdType()), visitorID.getId());
            map.put(serializeAuthenticationKeyForAnalyticsID(visitorID.getIdType()), String.valueOf(visitorID.getAuthenticationState().getValue()));
        }
        HashMap map2 = new HashMap();
        map2.put("cid", ContextDataUtil.translateContextData(map));
        StringBuilder sb2 = new StringBuilder(2048);
        ContextDataUtil.serializeToQueryString(map2, sb2);
        return sb2.toString();
    }

    private static String serializeAuthenticationKeyForAnalyticsID(String str) {
        return u.f(str, ".as");
    }

    private static String serializeIdentifierKeyForAnalyticsID(String str) {
        return u.f(str, ".id");
    }

    public String buildRequest(AnalyticsState analyticsState, Map<String, String> map, Map<String, String> map2) {
        HashMap map3 = map2 != null ? new HashMap(map2) : new HashMap();
        if (map != null) {
            Iterator<Map.Entry<String, String>> it = map.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry<String, String> next = it.next();
                String key = next.getKey();
                if (key == null) {
                    it.remove();
                } else if (key.startsWith("&&")) {
                    map3.put(key.substring(2), next.getValue());
                    it.remove();
                }
            }
        }
        map3.put("c", ContextDataUtil.translateContextData(map));
        StringBuilder sb2 = new StringBuilder(2048);
        sb2.append("ndh=1");
        if (analyticsState != null && analyticsState.isVisitorIDServiceEnabled() && analyticsState.getSerializedVisitorIDsList() != null) {
            sb2.append(analyticsState.getSerializedVisitorIDsList());
        }
        ContextDataUtil.serializeToQueryString(map3, sb2);
        return sb2.toString();
    }
}

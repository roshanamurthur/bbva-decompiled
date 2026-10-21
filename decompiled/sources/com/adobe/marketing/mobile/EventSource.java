package com.adobe.marketing.mobile;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
final class EventSource {
    private static final String ADOBE_PREFIX = "com.adobe.eventSource.";
    private final String name;
    private static final Map<String, EventSource> knownSources = new HashMap();
    private static final Object knownSourcesMutex = new Object();
    static final EventSource BOOTED = get("com.adobe.eventSource.booted");
    static final EventSource NONE = get("com.adobe.eventSource.none");
    static final EventSource OS = get("com.adobe.eventSource.os");
    static final EventSource REQUEST_CONTENT = get("com.adobe.eventSource.requestContent");
    static final EventSource REQUEST_IDENTITY = get("com.adobe.eventSource.requestIdentity");
    static final EventSource REQUEST_PROFILE = get("com.adobe.eventSource.requestProfile");
    static final EventSource REQUEST_RESET = get("com.adobe.eventSource.requestReset");
    static final EventSource RESPONSE_CONTENT = get("com.adobe.eventSource.responseContent");
    static final EventSource RESPONSE_IDENTITY = get("com.adobe.eventSource.responseIdentity");
    static final EventSource RESPONSE_PROFILE = get("com.adobe.eventSource.responseProfile");
    static final EventSource SHARED_STATE = get("com.adobe.eventSource.sharedState");
    static final EventSource WILDCARD = get("com.adobe.eventSource._wildcard_");
    static final EventSource APPLICATION_LAUNCH = get("com.adobe.eventSource.applicationLaunch");
    static final EventSource APPLICATION_CLOSE = get("com.adobe.eventSource.applicationClose");

    private EventSource(String str) {
        this.name = str;
    }

    public static EventSource get(String str) {
        if (StringUtils.isNullOrEmpty(str)) {
            return null;
        }
        String lowerCase = str.toLowerCase();
        synchronized (knownSourcesMutex) {
            try {
                Map<String, EventSource> map = knownSources;
                if (map.containsKey(lowerCase)) {
                    return map.get(lowerCase);
                }
                EventSource eventSource = new EventSource(lowerCase);
                map.put(lowerCase, eventSource);
                return eventSource;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public String getName() {
        return this.name;
    }
}

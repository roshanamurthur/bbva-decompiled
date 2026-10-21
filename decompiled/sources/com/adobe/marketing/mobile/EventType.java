package com.adobe.marketing.mobile;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
final class EventType {
    private static final String ADOBE_PREFIX = "com.adobe.eventType.";
    private final String name;
    private static final Map<String, EventType> knownTypes = new HashMap();
    private static final Object knownTypesMutex = new Object();
    static final EventType ACQUISITION = get("com.adobe.eventType.acquisition");
    static final EventType ANALYTICS = get("com.adobe.eventType.analytics");
    static final EventType AUDIENCEMANAGER = get("com.adobe.eventType.audienceManager");
    static final EventType CAMPAIGN = get("com.adobe.eventType.campaign");
    static final EventType CONFIGURATION = get("com.adobe.eventType.configuration");
    static final EventType CUSTOM = get("com.adobe.eventType.custom");
    static final EventType HUB = get("com.adobe.eventType.hub");
    static final EventType IDENTITY = get("com.adobe.eventType.identity");
    static final EventType LIFECYCLE = get("com.adobe.eventType.lifecycle");
    static final EventType LOCATION = get("com.adobe.eventType.location");
    static final EventType PII = get("com.adobe.eventType.pii");
    static final EventType RULES_ENGINE = get("com.adobe.eventType.rulesEngine");
    static final EventType SIGNAL = get("com.adobe.eventType.signal");
    static final EventType SYSTEM = get("com.adobe.eventType.system");
    static final EventType TARGET = get("com.adobe.eventType.target");
    static final EventType USERPROFILE = get("com.adobe.eventType.userProfile");
    static final EventType PLACES = get("com.adobe.eventType.places");
    static final EventType GENERIC_TRACK = get("com.adobe.eventType.generic.track");
    static final EventType GENERIC_LIFECYLE = get("com.adobe.eventType.generic.lifecycle");
    static final EventType GENERIC_IDENTITY = get("com.adobe.eventType.generic.identity");
    static final EventType GENERIC_PII = get("com.adobe.eventType.generic.pii");
    static final EventType GENERIC_DATA = get("com.adobe.eventType.generic.data");
    static final EventType WILDCARD = get("com.adobe.eventType._wildcard_");

    private EventType(String str) {
        this.name = str;
    }

    public static EventType get(String str) {
        if (StringUtils.isNullOrEmpty(str)) {
            return null;
        }
        String lowerCase = str.toLowerCase();
        synchronized (knownTypesMutex) {
            try {
                Map<String, EventType> map = knownTypes;
                if (map.containsKey(lowerCase)) {
                    return map.get(lowerCase);
                }
                EventType eventType = new EventType(lowerCase);
                map.put(lowerCase, eventType);
                return eventType;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public String getName() {
        return this.name;
    }
}

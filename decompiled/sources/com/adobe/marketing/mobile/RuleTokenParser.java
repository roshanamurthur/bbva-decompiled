package com.adobe.marketing.mobile;

import androidx.databinding.e;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes2.dex */
class RuleTokenParser {
    private static final String KEY_ALL_JSON = "~all_json";
    private static final String KEY_ALL_URL = "~all_url";
    private static final String KEY_CACHEBUST = "~cachebust";
    private static final String KEY_EVENT_SOURCE = "~source";
    private static final String KEY_EVENT_TYPE = "~type";
    private static final String KEY_PREFIX = "~";
    private static final String KEY_SDK_VERSION = "~sdkver";
    private static final String KEY_SHARED_STATE = "~state.";
    private static final String KEY_TIMESTAMP_ISO8601 = "~timestampz";
    private static final String KEY_TIMESTAMP_PLATFORM = "~timestampp";
    private static final String KEY_TIMESTAMP_UNIX = "~timestampu";
    private static final String KEY_URL_ENCODE = "urlenc";
    private static final String KEY_URL_ENCODE_PREFIX = "{%(urlenc";
    private static final String KEY_URL_ENCODE_SUFFIX = ")%}";
    private static final int MIN_TOKEN_LEN = 4;
    private static final int MIN_URL_ENC_TOKEN_LEN = 12;
    private static final int RANDOM_INT_BOUNDARY = 100000000;
    private static final String SHARED_STATE_KEY_DELIMITER = "/";
    private static final String TOKEN_REGEX = "(i*)(\\{%(urlenc\\()?([a-zA-Z0-9_~./&]*?)(\\))?%\\})";
    private final EventHub parentHub;
    private final Map<String, KeyFinder> specialKeyLookupTable = createSpecialKeyLookupTable();
    private final Pattern tokenPattern = Pattern.compile(TOKEN_REGEX);

    public interface KeyFinder {
        String find(Event event);
    }

    public RuleTokenParser(EventHub eventHub) {
        this.parentHub = eventHub;
    }

    private Map<String, KeyFinder> createSpecialKeyLookupTable() {
        HashMap map = new HashMap();
        final PlatformServices platformServices = this.parentHub.getPlatformServices();
        map.put(KEY_EVENT_TYPE, new KeyFinder() { // from class: com.adobe.marketing.mobile.RuleTokenParser.1
            @Override // com.adobe.marketing.mobile.RuleTokenParser.KeyFinder
            public String find(Event event) {
                return event.getEventType().getName();
            }
        });
        map.put(KEY_EVENT_SOURCE, new KeyFinder() { // from class: com.adobe.marketing.mobile.RuleTokenParser.2
            @Override // com.adobe.marketing.mobile.RuleTokenParser.KeyFinder
            public String find(Event event) {
                return event.getEventSource().getName();
            }
        });
        map.put(KEY_TIMESTAMP_UNIX, new KeyFinder() { // from class: com.adobe.marketing.mobile.RuleTokenParser.3
            @Override // com.adobe.marketing.mobile.RuleTokenParser.KeyFinder
            public String find(Event event) {
                return String.valueOf(TimeUtil.getUnixTimeInSeconds());
            }
        });
        map.put(KEY_TIMESTAMP_ISO8601, new KeyFinder() { // from class: com.adobe.marketing.mobile.RuleTokenParser.4
            @Override // com.adobe.marketing.mobile.RuleTokenParser.KeyFinder
            public String find(Event event) {
                if (platformServices != null) {
                    return TimeUtil.getIso8601Date();
                }
                return null;
            }
        });
        map.put(KEY_TIMESTAMP_PLATFORM, new KeyFinder() { // from class: com.adobe.marketing.mobile.RuleTokenParser.5
            @Override // com.adobe.marketing.mobile.RuleTokenParser.KeyFinder
            public String find(Event event) {
                if (platformServices != null) {
                    return TimeUtil.getIso8601DateTimeZoneISO8601();
                }
                return null;
            }
        });
        map.put(KEY_SDK_VERSION, new KeyFinder() { // from class: com.adobe.marketing.mobile.RuleTokenParser.6
            @Override // com.adobe.marketing.mobile.RuleTokenParser.KeyFinder
            public String find(Event event) {
                PlatformServices platformServices2 = platformServices;
                return platformServices2 != null ? platformServices2.getSystemInfoService().getCoreVersion() : "unknown";
            }
        });
        map.put(KEY_CACHEBUST, new KeyFinder() { // from class: com.adobe.marketing.mobile.RuleTokenParser.7
            @Override // com.adobe.marketing.mobile.RuleTokenParser.KeyFinder
            public String find(Event event) {
                return String.valueOf(new SecureRandom().nextInt(RuleTokenParser.RANDOM_INT_BOUNDARY));
            }
        });
        map.put(KEY_ALL_JSON, new KeyFinder() { // from class: com.adobe.marketing.mobile.RuleTokenParser.8
            @Override // com.adobe.marketing.mobile.RuleTokenParser.KeyFinder
            public String find(Event event) {
                JsonUtilityService jsonUtilityService;
                if (event == null || event.getData() == null) {
                    return "";
                }
                PlatformServices platformServices2 = RuleTokenParser.this.parentHub.getPlatformServices();
                JsonUtilityService.JSONObject jSONObject = null;
                if (platformServices2 != null && (jsonUtilityService = platformServices2.getJsonUtilityService()) != null) {
                    try {
                        jSONObject = (JsonUtilityService.JSONObject) Variant.fromVariantMap(EventDataFlattener.getFlattenedDataMap(event.getData())).getTypedObject(new JsonObjectVariantSerializer(jsonUtilityService));
                    } catch (Exception unused) {
                    }
                }
                return jSONObject == null ? "" : jSONObject.toString();
            }
        });
        map.put(KEY_ALL_URL, new KeyFinder() { // from class: com.adobe.marketing.mobile.RuleTokenParser.9
            @Override // com.adobe.marketing.mobile.RuleTokenParser.KeyFinder
            public String find(Event event) {
                return (event == null || event.getData() == null) ? "" : UrlUtilities.serializeToQueryString(EventDataFlattener.getFlattenedDataMap(event.getData()));
            }
        });
        return map;
    }

    private List<String> findTokens(String str) {
        ArrayList arrayList = new ArrayList();
        if (StringUtils.isNullOrEmpty(str)) {
            return arrayList;
        }
        java.util.regex.Matcher matcher = this.tokenPattern.matcher(str);
        while (matcher.find()) {
            String strGroup = matcher.group(0);
            if (!StringUtils.isNullOrEmpty(strGroup)) {
                arrayList.add(strGroup);
            }
        }
        return arrayList;
    }

    private String getKeyFromToken(String str, boolean z10) {
        if (StringUtils.isNullOrEmpty(str)) {
            return str;
        }
        if (z10) {
            return str.length() < MIN_URL_ENC_TOKEN_LEN ? str : e.c(str, 3, 9);
        }
        return str.length() < 4 ? str : e.c(str, 2, 2);
    }

    private String getSharedStateKey(String str, Event event) {
        int iIndexOf;
        String strSubstring = str.substring(7);
        if (!StringUtils.isNullOrEmpty(strSubstring) && (iIndexOf = strSubstring.indexOf("/")) > -1 && strSubstring.length() > iIndexOf) {
            String strSubstring2 = strSubstring.substring(0, iIndexOf);
            String strSubstring3 = strSubstring.substring(iIndexOf + 1);
            Map<String, Variant> flattenedDataMap = EventDataFlattener.getFlattenedDataMap(this.parentHub.getSharedEventState(strSubstring2, event, null));
            if (flattenedDataMap != null && !flattenedDataMap.isEmpty() && flattenedDataMap.containsKey(strSubstring3)) {
                try {
                    return flattenedDataMap.get(strSubstring3).convertToString();
                } catch (VariantException unused) {
                }
            }
        }
        return null;
    }

    public String expandKey(String str, Event event) {
        Variant variant;
        if (!StringUtils.isNullOrEmpty(str) && event != null) {
            if (str.startsWith(KEY_PREFIX)) {
                if (str.startsWith(KEY_SHARED_STATE) && str.indexOf("/") > 7) {
                    return getSharedStateKey(str, event);
                }
                if (this.specialKeyLookupTable.containsKey(str)) {
                    return this.specialKeyLookupTable.get(str).find(event);
                }
            }
            Map<String, Variant> flattenedDataMap = EventDataFlattener.getFlattenedDataMap(event.getData());
            if (flattenedDataMap.containsKey(str) && (variant = flattenedDataMap.get(str)) != null && !(variant instanceof NullVariant)) {
                try {
                    return variant.convertToString();
                } catch (VariantException unused) {
                    return "";
                }
            }
        }
        return null;
    }

    public String expandTokensForString(String str, Event event) {
        if (!StringUtils.isNullOrEmpty(str) && event != null) {
            List<String> listFindTokens = findTokens(str);
            if (listFindTokens.isEmpty()) {
                return str;
            }
            for (String str2 : listFindTokens) {
                boolean z10 = str2.indexOf(KEY_URL_ENCODE, 2) > -1;
                String keyFromToken = getKeyFromToken(str2, z10);
                if (!StringUtils.isNullOrEmpty(keyFromToken)) {
                    String strExpandKey = expandKey(keyFromToken, event);
                    if (StringUtils.isNullOrEmpty(strExpandKey)) {
                        strExpandKey = "";
                    }
                    if (z10) {
                        strExpandKey = UrlUtilities.urlEncode(strExpandKey);
                    }
                    str = str.replace(str2, strExpandKey);
                }
            }
        }
        return str;
    }
}

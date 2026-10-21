package com.adobe.marketing.mobile;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
abstract class Matcher {
    private static final String LOG_TAG = "Matcher";
    private static final String MATCHER_JSON_KEY = "key";
    private static final String MATCHER_JSON_MATCHES = "matcher";
    private static final String MATCHER_JSON_VALUES = "values";
    private static final String MATCHER_STRING_CONTAINS = "co";
    private static final String MATCHER_STRING_ENDS_WITH = "ew";
    private static final String MATCHER_STRING_EQUALS = "eq";
    private static final String MATCHER_STRING_EXISTS = "ex";
    private static final String MATCHER_STRING_GREATER_THAN = "gt";
    private static final String MATCHER_STRING_GREATER_THAN_OR_EQUALS = "ge";
    private static final String MATCHER_STRING_LESS_THAN = "lt";
    private static final String MATCHER_STRING_LESS_THAN_OR_EQUALS = "le";
    private static final String MATCHER_STRING_NOT_CONTAINS = "nc";
    private static final String MATCHER_STRING_NOT_EQUALS = "ne";
    private static final String MATCHER_STRING_NOT_EXISTS = "nx";
    private static final String MATCHER_STRING_STARTS_WITH = "sw";
    protected static final Map<String, Class> _matcherTypeDictionary = initializeMatcherTypeDictionary();
    protected String key;
    protected ArrayList<Object> values = new ArrayList<>();

    private static Map<String, Class> initializeMatcherTypeDictionary() {
        HashMap map = new HashMap();
        map.put(MATCHER_STRING_EQUALS, MatcherEquals.class);
        map.put(MATCHER_STRING_NOT_EQUALS, MatcherNotEquals.class);
        map.put(MATCHER_STRING_GREATER_THAN, MatcherGreaterThan.class);
        map.put(MATCHER_STRING_GREATER_THAN_OR_EQUALS, MatcherGreaterThanOrEqual.class);
        map.put(MATCHER_STRING_LESS_THAN, MatcherLessThan.class);
        map.put(MATCHER_STRING_LESS_THAN_OR_EQUALS, MatcherLessThanOrEqual.class);
        map.put(MATCHER_STRING_CONTAINS, MatcherContains.class);
        map.put(MATCHER_STRING_NOT_CONTAINS, MatcherNotContains.class);
        map.put(MATCHER_STRING_STARTS_WITH, MatcherStartsWith.class);
        map.put(MATCHER_STRING_ENDS_WITH, MatcherEndsWith.class);
        map.put(MATCHER_STRING_EXISTS, MatcherExists.class);
        map.put(MATCHER_STRING_NOT_EXISTS, MatcherNotExists.class);
        return map;
    }

    public static Matcher matcherWithJsonObject(JsonUtilityService.JSONObject jSONObject) {
        MatcherUnknown matcherUnknownNewInstance;
        String strOptString = jSONObject.optString(MATCHER_JSON_MATCHES, "");
        if (strOptString.length() <= 0) {
            Log.debug(LOG_TAG, "Messages - message matcher type is empty", new Object[0]);
        }
        Class<MatcherUnknown> cls = _matcherTypeDictionary.get(strOptString);
        if (cls == null) {
            Log.debug(LOG_TAG, "Messages - message matcher type \"%s\" is invalid", strOptString);
            cls = MatcherUnknown.class;
        }
        try {
            matcherUnknownNewInstance = cls.newInstance();
        } catch (IllegalAccessException e5) {
            Log.error(LOG_TAG, "Messages - Error creating matcher (%s)", e5);
            matcherUnknownNewInstance = null;
        } catch (InstantiationException e7) {
            Log.error(LOG_TAG, "Messages - Error creating matcher (%s)", e7);
            matcherUnknownNewInstance = null;
        }
        if (matcherUnknownNewInstance != null) {
            setMatcherKeyFromJson(jSONObject, matcherUnknownNewInstance);
            try {
                if (matcherUnknownNewInstance instanceof MatcherExists) {
                    return matcherUnknownNewInstance;
                }
                setMatcherValuesFromJson(jSONObject, matcherUnknownNewInstance);
            } catch (JsonException e10) {
                Log.warning(LOG_TAG, "Messages - error creating matcher, values is required (%s)", e10);
            }
        }
        return matcherUnknownNewInstance;
    }

    public static void setMatcherKeyFromJson(JsonUtilityService.JSONObject jSONObject, Matcher matcher) {
        if (matcher == null) {
            return;
        }
        String strOptString = jSONObject.optString("key", "");
        if (strOptString.length() > 0) {
            matcher.key = strOptString;
        } else {
            Log.debug(LOG_TAG, "%s (key), messages - error creating matcher", "Unexpected Empty Value");
        }
    }

    public static void setMatcherValuesFromJson(JsonUtilityService.JSONObject jSONObject, Matcher matcher) throws JsonException {
        JsonUtilityService.JSONArray jSONArray;
        if (matcher == null || (jSONArray = jSONObject.getJSONArray(MATCHER_JSON_VALUES)) == null) {
            return;
        }
        int length = jSONArray.length();
        for (int i10 = 0; i10 < length; i10++) {
            matcher.values.add(jSONArray.get(i10));
        }
        if (matcher.values.isEmpty()) {
            Log.debug(LOG_TAG, "%s (matcher values), messages - error creating matcher", "Unexpected Empty Value");
        }
    }

    public boolean matches(Object obj) {
        return false;
    }

    public abstract String toString();

    public Double tryParseDouble(Object obj) {
        try {
            return Double.valueOf(obj.toString());
        } catch (Exception e5) {
            Log.trace(LOG_TAG, "Could not parse into a Double (%s)", e5);
            return null;
        }
    }
}

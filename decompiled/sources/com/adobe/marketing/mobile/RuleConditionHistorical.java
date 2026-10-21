package com.adobe.marketing.mobile;

import androidx.camera.core.impl.utils.c;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes2.dex */
class RuleConditionHistorical extends RuleCondition {
    private static final int INVALID_VALUE = -1;
    private static final String LOG_TAG = "RuleConditionHistorical";
    private static final int TIMEOUT = 1000;
    private EventHistoryRequest[] eventHistoryRequests;
    private long from;
    private Matcher matcher;
    private String searchType;
    private long to;
    private int value;

    public static RuleConditionHistorical historicalConditionFromJsonObject(JsonUtilityService.JSONObject jSONObject) {
        if (jSONObject == null || jSONObject.length() == 0) {
            Log.trace(LOG_TAG, "error creating historical rule condition from the Json object as the definition was empty.", new Object[0]);
            return null;
        }
        RuleConditionHistorical ruleConditionHistoricalRetrieveHistoryValuesFromJson = retrieveHistoryValuesFromJson(jSONObject);
        if (ruleConditionHistoricalRetrieveHistoryValuesFromJson == null) {
            Log.trace(LOG_TAG, "error creating historical rule condition from the Json object as a required value was missing.", new Object[0]);
            return ruleConditionHistoricalRetrieveHistoryValuesFromJson;
        }
        Matcher matcherMatcherWithJsonObject = Matcher.matcherWithJsonObject(jSONObject);
        ruleConditionHistoricalRetrieveHistoryValuesFromJson.matcher = matcherMatcherWithJsonObject;
        matcherMatcherWithJsonObject.values.add(Integer.valueOf(ruleConditionHistoricalRetrieveHistoryValuesFromJson.value));
        try {
            ruleConditionHistoricalRetrieveHistoryValuesFromJson.eventHistoryRequests = parseEventHistoryRequestsFromJson(jSONObject, ruleConditionHistoricalRetrieveHistoryValuesFromJson);
            return ruleConditionHistoricalRetrieveHistoryValuesFromJson;
        } catch (JsonException e5) {
            Log.trace(LOG_TAG, "error creating historical rule condition from the Json object: %s", e5.getMessage());
            return null;
        }
    }

    private static EventHistoryRequest[] parseEventHistoryRequestsFromJson(JsonUtilityService.JSONObject jSONObject, RuleConditionHistorical ruleConditionHistorical) throws JsonException {
        JsonUtilityService.JSONArray jSONArray = jSONObject.getJSONArray("events");
        if (jSONArray == null || jSONArray.length() == 0) {
            Log.debug(LOG_TAG, "%s - error creating historical rule condition as the rule definition did not contain any events.", "Unexpected Empty Value");
            return null;
        }
        int length = jSONArray.length();
        EventHistoryRequest[] eventHistoryRequestArr = new EventHistoryRequest[length];
        for (int i10 = 0; i10 < length; i10++) {
            JsonUtilityService.JSONObject jSONObject2 = (JsonUtilityService.JSONObject) jSONArray.get(i10);
            Iterator<String> itKeys = jSONObject2.keys();
            HashMap map = new HashMap();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                map.put(next, Variant.fromString(jSONObject2.getString(next)));
            }
            eventHistoryRequestArr[i10] = new EventHistoryRequest(map, ruleConditionHistorical.from, ruleConditionHistorical.to);
        }
        return eventHistoryRequestArr;
    }

    private static RuleConditionHistorical retrieveHistoryValuesFromJson(JsonUtilityService.JSONObject jSONObject) {
        RuleConditionHistorical ruleConditionHistorical = new RuleConditionHistorical();
        String strOptString = jSONObject.optString("searchType", "");
        String strOptString2 = jSONObject.optString("matcher", "");
        int iOptInt = jSONObject.optInt("value", -1);
        long jOptLong = jSONObject.optLong("from", 0L);
        long jOptLong2 = jSONObject.optLong(TypedValues.TransitionType.S_TO, System.currentTimeMillis());
        if (StringUtils.isNullOrEmpty(strOptString)) {
            ruleConditionHistorical.searchType = "any";
            Log.trace(LOG_TAG, "%s (searchType), messages - setting searchType to any", "Unexpected Empty Value");
        } else {
            ruleConditionHistorical.searchType = strOptString;
        }
        if (StringUtils.isNullOrEmpty(strOptString2)) {
            Log.trace(LOG_TAG, "%s (matcherType), messages - error creating historical condition", "Unexpected Empty Value");
            return null;
        }
        if (iOptInt <= -1) {
            Log.trace(LOG_TAG, "%s (value), messages - error creating historical condition", "Unexpected Empty Value");
            return null;
        }
        ruleConditionHistorical.value = iOptInt;
        ruleConditionHistorical.from = jOptLong;
        ruleConditionHistorical.to = jOptLong2;
        return ruleConditionHistorical;
    }

    @Override // com.adobe.marketing.mobile.RuleCondition
    public boolean evaluate(RuleTokenParser ruleTokenParser, Event event) {
        EventHistoryRequest[] eventHistoryRequestArr = this.eventHistoryRequests;
        if (eventHistoryRequestArr == null || eventHistoryRequestArr.length == 0) {
            Log.trace(LOG_TAG, "No event history requests found in the RuleConditionHistorical object.", new Object[0]);
            return false;
        }
        boolean z10 = !this.searchType.equals("any");
        final int[] iArr = new int[1];
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        EventHistoryResultHandler<Integer> eventHistoryResultHandler = new EventHistoryResultHandler<Integer>() { // from class: com.adobe.marketing.mobile.RuleConditionHistorical.1
            @Override // com.adobe.marketing.mobile.EventHistoryResultHandler
            public void call(Integer num) {
                iArr[0] = num.intValue();
                countDownLatch.countDown();
            }
        };
        EventHistory eventHistory = EventHistoryProvider.getEventHistory();
        if (eventHistory == null) {
            Log.warning(LOG_TAG, "Unable to retrieve historical events, the event history is not available.", new Object[0]);
            return false;
        }
        eventHistory.getEvents(this.eventHistoryRequests, z10, eventHistoryResultHandler);
        try {
            countDownLatch.await(1000L, TimeUnit.MILLISECONDS);
            return this.matcher.matches(Integer.valueOf(iArr[0]));
        } catch (InterruptedException e5) {
            Log.warning(LOG_TAG, "Interrupted Exception occurred while waiting for the latch: %s.", e5.getMessage());
            return false;
        }
    }

    public EventHistoryRequest[] getEventHistoryRequests() {
        return this.eventHistoryRequests;
    }

    @Override // com.adobe.marketing.mobile.RuleCondition
    public String toString() {
        StringBuilder sbD = c.d("(HISTORICAL EVENTS FOUND: ");
        for (EventHistoryRequest eventHistoryRequest : this.eventHistoryRequests) {
            sbD.append(eventHistoryRequest.mask);
            sbD.append(", ");
        }
        sbD.setLength(sbD.length() - 2);
        sbD.append(")");
        return sbD.toString();
    }
}

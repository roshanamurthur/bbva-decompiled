package com.adobe.marketing.mobile;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public class MobileIdentities {
    private static final String ADID_DSID = "DSID_20914";
    private static final String JSON_KEY_ANALYTICS_RSIDS = "rsids";
    private static final String JSON_KEY_COMPANYCONTEXTS = "companyContexts";
    private static final String JSON_KEY_NAMESPACE = "namespace";
    private static final String JSON_KEY_TYPE = "type";
    private static final String JSON_KEY_USERIDS = "userIDs";
    private static final String JSON_KEY_USERS = "users";
    private static final String JSON_KEY_VALUE = "value";
    private static final String JSON_VALUE_NAMESPACE_ANALYTICS_AID = "AVID";
    private static final String JSON_VALUE_NAMESPACE_AUDIENCE_UUID = "0";
    private static final String JSON_VALUE_NAMESPACE_COMPANYCONTEXTS = "imsOrgID";
    private static final String JSON_VALUE_NAMESPACE_MCID = "4";
    private static final String JSON_VALUE_NAMESPACE_TARGET_THIRDPARTYID = "3rdpartyid";
    private static final String JSON_VALUE_NAMESPACE_TARGET_TNTID = "tntid";
    private static final String JSON_VALUE_NAMESPACE_USERIDENTIFIER = "vid";
    private static final String JSON_VALUE_TYPE_ANALYTICS = "analytics";
    private static final String JSON_VALUE_TYPE_INTEGRATIONCODE = "integrationCode";
    private static final String JSON_VALUE_TYPE_NAMESPACEID = "namespaceId";
    private static final String JSON_VALUE_TYPE_TARGET = "target";
    private static final String MCPNS_DPID = "20919";

    private MobileIdentities() {
    }

    public static boolean areAllSharedStatesReady(Event event, Module module) {
        if (module.hasSharedEventState(EventDataKeys.Identity.MODULE_NAME) && module.getSharedEventState(EventDataKeys.Identity.MODULE_NAME, event) == EventHub.SHARED_STATE_PENDING) {
            Log.trace(ConfigurationExtension.LOG_SOURCE, "Identity module shared state is not ready", new Object[0]);
            return false;
        }
        if (module.hasSharedEventState(EventDataKeys.Analytics.MODULE_NAME) && module.getSharedEventState(EventDataKeys.Analytics.MODULE_NAME, event) == EventHub.SHARED_STATE_PENDING) {
            Log.trace(ConfigurationExtension.LOG_SOURCE, "Analytics module shared state is not ready", new Object[0]);
            return false;
        }
        if (module.hasSharedEventState(EventDataKeys.Target.MODULE_NAME) && module.getSharedEventState(EventDataKeys.Target.MODULE_NAME, event) == EventHub.SHARED_STATE_PENDING) {
            Log.trace(ConfigurationExtension.LOG_SOURCE, "Target module shared state is not ready", new Object[0]);
            return false;
        }
        if (module.hasSharedEventState(EventDataKeys.Audience.MODULE_NAME) && module.getSharedEventState(EventDataKeys.Audience.MODULE_NAME, event) == EventHub.SHARED_STATE_PENDING) {
            Log.trace(ConfigurationExtension.LOG_SOURCE, "Audience module shared state is not ready", new Object[0]);
            return false;
        }
        if (module.hasSharedEventState(EventDataKeys.Configuration.MODULE_NAME) && module.getSharedEventState(EventDataKeys.Configuration.MODULE_NAME, event) == EventHub.SHARED_STATE_PENDING) {
            Log.trace(ConfigurationExtension.LOG_SOURCE, "Configuration module shared state is not ready", new Object[0]);
            return false;
        }
        Log.trace(ConfigurationExtension.LOG_SOURCE, "All shared states are ready", new Object[0]);
        return true;
    }

    private static Map<String, Object> createUserIdMap(String str, String str2, String str3) {
        HashMap map = new HashMap();
        map.put(JSON_KEY_NAMESPACE, str);
        map.put("value", str2);
        map.put("type", str3);
        return map;
    }

    public static String getAllIdentifiers(JsonUtilityService jsonUtilityService, Event event, Module module) {
        Log.trace(ConfigurationExtension.LOG_SOURCE, "Getting all identifiers from Configuration Extension", new Object[0]);
        HashMap map = new HashMap();
        List<Object> companyContexts = getCompanyContexts(event, module);
        if (!companyContexts.isEmpty()) {
            map.put(JSON_KEY_COMPANYCONTEXTS, companyContexts);
        }
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(getAnalyticsIdentifiers(event, module));
        arrayList.addAll(getTargetIdentifiers(event, module));
        arrayList.addAll(getAudienceIdentifiers(event, module));
        arrayList.addAll(getVisitorIdentifiers(event, module));
        if (!arrayList.isEmpty()) {
            ArrayList arrayList2 = new ArrayList();
            HashMap map2 = new HashMap();
            map2.put(JSON_KEY_USERIDS, arrayList);
            arrayList2.add(map2);
            map.put(JSON_KEY_USERS, arrayList2);
        }
        return jsonUtilityService.createJSONObject(map).toString();
    }

    private static List<Object> getAnalyticsIdentifiers(Event event, Module module) {
        ArrayList arrayList = new ArrayList();
        EventData sharedEventState = module.getSharedEventState(EventDataKeys.Analytics.MODULE_NAME, event);
        if (!isSharedStateValid(sharedEventState)) {
            return arrayList;
        }
        String strOptString = sharedEventState.optString(EventDataKeys.Analytics.ANALYTICS_ID, null);
        if (!StringUtils.isNullOrEmpty(strOptString)) {
            arrayList.add(createUserIdMap(JSON_VALUE_NAMESPACE_ANALYTICS_AID, strOptString, JSON_VALUE_TYPE_INTEGRATIONCODE));
        }
        String strOptString2 = sharedEventState.optString("vid", null);
        if (!StringUtils.isNullOrEmpty(strOptString2)) {
            Map<String, Object> mapCreateUserIdMap = createUserIdMap("vid", strOptString2, "analytics");
            EventData sharedEventState2 = module.getSharedEventState(EventDataKeys.Configuration.MODULE_NAME, event);
            if (!isSharedStateValid(sharedEventState2)) {
                return arrayList;
            }
            String strOptString3 = sharedEventState2.optString(EventDataKeys.Configuration.ANALYTICS_CONFIG_REPORT_SUITES, null);
            if (!StringUtils.isNullOrEmpty(strOptString3)) {
                mapCreateUserIdMap.put(JSON_KEY_ANALYTICS_RSIDS, Arrays.asList(strOptString3.split(",")));
            }
            arrayList.add(mapCreateUserIdMap);
        }
        return arrayList;
    }

    private static List<Object> getAudienceIdentifiers(Event event, Module module) {
        ArrayList arrayList = new ArrayList();
        EventData sharedEventState = module.getSharedEventState(EventDataKeys.Audience.MODULE_NAME, event);
        if (!isSharedStateValid(sharedEventState)) {
            return arrayList;
        }
        String strOptString = sharedEventState.optString(EventDataKeys.Audience.DPUUID, null);
        if (!StringUtils.isNullOrEmpty(strOptString)) {
            arrayList.add(createUserIdMap(sharedEventState.optString(EventDataKeys.Audience.DPID, ""), strOptString, JSON_VALUE_TYPE_NAMESPACEID));
        }
        String strOptString2 = sharedEventState.optString(EventDataKeys.Audience.UUID, null);
        if (!StringUtils.isNullOrEmpty(strOptString2)) {
            arrayList.add(createUserIdMap("0", strOptString2, JSON_VALUE_TYPE_NAMESPACEID));
        }
        return arrayList;
    }

    private static List<Object> getCompanyContexts(Event event, Module module) {
        ArrayList arrayList = new ArrayList();
        EventData sharedEventState = module.getSharedEventState(EventDataKeys.Configuration.MODULE_NAME, event);
        if (isSharedStateValid(sharedEventState)) {
            String strOptString = sharedEventState.optString(EventDataKeys.Configuration.CONFIG_EXPERIENCE_CLOUD_ORGID_KEY, null);
            if (!StringUtils.isNullOrEmpty(strOptString)) {
                HashMap map = new HashMap();
                map.put(JSON_KEY_NAMESPACE, JSON_VALUE_NAMESPACE_COMPANYCONTEXTS);
                map.put("value", strOptString);
                arrayList.add(map);
            }
        }
        return arrayList;
    }

    private static List<Object> getTargetIdentifiers(Event event, Module module) {
        ArrayList arrayList = new ArrayList();
        EventData sharedEventState = module.getSharedEventState(EventDataKeys.Target.MODULE_NAME, event);
        if (!isSharedStateValid(sharedEventState)) {
            return arrayList;
        }
        String strOptString = sharedEventState.optString("tntid", null);
        if (!StringUtils.isNullOrEmpty(strOptString)) {
            arrayList.add(createUserIdMap("tntid", strOptString, "target"));
        }
        String strOptString2 = sharedEventState.optString(EventDataKeys.Target.THIRD_PARTY_ID, null);
        if (!StringUtils.isNullOrEmpty(strOptString2)) {
            arrayList.add(createUserIdMap(JSON_VALUE_NAMESPACE_TARGET_THIRDPARTYID, strOptString2, "target"));
        }
        return arrayList;
    }

    private static List<Object> getVisitorIdentifiers(Event event, Module module) {
        ArrayList arrayList = new ArrayList();
        EventData sharedEventState = module.getSharedEventState(EventDataKeys.Identity.MODULE_NAME, event);
        if (!isSharedStateValid(sharedEventState)) {
            return arrayList;
        }
        String strOptString = sharedEventState.optString(EventDataKeys.Identity.VISITOR_ID_MID, null);
        if (!StringUtils.isNullOrEmpty(strOptString)) {
            arrayList.add(createUserIdMap(JSON_VALUE_NAMESPACE_MCID, strOptString, JSON_VALUE_TYPE_NAMESPACEID));
        }
        List<VisitorID> listOptTypedList = sharedEventState.optTypedList(EventDataKeys.Identity.VISITOR_IDS_LIST, null, VisitorID.VARIANT_SERIALIZER);
        if (listOptTypedList != null && !listOptTypedList.isEmpty()) {
            for (VisitorID visitorID : listOptTypedList) {
                if (!StringUtils.isNullOrEmpty(visitorID.getId())) {
                    arrayList.add(createUserIdMap(visitorID.getIdType(), visitorID.getId(), JSON_VALUE_TYPE_INTEGRATIONCODE));
                }
            }
        }
        String strOptString2 = sharedEventState.optString(EventDataKeys.Identity.PUSH_IDENTIFIER, null);
        if (!StringUtils.isNullOrEmpty(strOptString2)) {
            arrayList.add(createUserIdMap("20919", strOptString2, JSON_VALUE_TYPE_INTEGRATIONCODE));
        }
        return arrayList;
    }

    private static boolean isSharedStateValid(EventData eventData) {
        return (eventData == EventHub.SHARED_STATE_INVALID || eventData == EventHub.SHARED_STATE_PENDING) ? false : true;
    }
}

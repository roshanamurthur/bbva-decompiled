package com.adobe.marketing.mobile;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;

/* JADX INFO: loaded from: classes2.dex */
class RulesEngine {
    private static final String LOG_PREFIX = "Rules Engine";
    private static final Object rulesOperationMutex = new Object();
    protected final RuleTokenParser ruleTokenParser;
    protected final ConcurrentHashMap<Module, ConcurrentLinkedQueue<Rule>> moduleRuleAssociation = new ConcurrentHashMap<>();
    private final ConcurrentHashMap<String, Integer> dispatchChainedEvents = new ConcurrentHashMap<>();

    public RulesEngine(EventHub eventHub) {
        this.ruleTokenParser = new RuleTokenParser(eventHub);
    }

    private Map<String, Variant> getConsequenceDetails(Map<String, Variant> map, String str) {
        if (map != null && !map.isEmpty()) {
            if (!map.containsKey("detail")) {
                Log.debug(LOG_PREFIX, String.format("Unexpected (%s) consequence format, 'details' object is missing.", str), new Object[0]);
                return null;
            }
            Map<String, Variant> mapOptVariantMap = map.get("detail").optVariantMap(null);
            if (mapOptVariantMap != null && !mapOptVariantMap.isEmpty()) {
                return mapOptVariantMap;
            }
            Log.debug(LOG_PREFIX, String.format("Unexpected (%s) consequence format, 'details' is null/empty.", str), new Object[0]);
        }
        return null;
    }

    private String getValueFromConsequenceDetails(Map<String, Variant> map, String str, String str2) {
        if (map == null || StringUtils.isNullOrEmpty(str)) {
            return null;
        }
        if (!map.containsKey(str)) {
            Log.debug(LOG_PREFIX, "Unexpected (%s) consequence format, required key (%s) is missing from 'details'", str2, str);
            return null;
        }
        String strOptString = map.get(str).optString(null);
        if (!StringUtils.isNullOrEmpty(strOptString)) {
            return strOptString;
        }
        Log.debug(LOG_PREFIX, "Unexpected (%s) consequence format, required key (%s) has null/empty value in 'details'.", str2, str);
        return null;
    }

    private int removeCurrentChainedDispatchCount(String str) {
        Integer numRemove = this.dispatchChainedEvents.remove(str);
        if (numRemove != null) {
            return numRemove.intValue();
        }
        return 0;
    }

    public void addRule(Module module, Rule rule) {
        synchronized (rulesOperationMutex) {
            try {
                if (rule == null) {
                    return;
                }
                if (rule.getConsequenceEvents() != null && !rule.getConsequenceEvents().isEmpty()) {
                    this.moduleRuleAssociation.putIfAbsent(module, new ConcurrentLinkedQueue<>());
                    this.moduleRuleAssociation.get(module).add(rule);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public List<Event> evaluateEventWithRules(Event event, List<Rule> list) {
        ArrayList arrayList = new ArrayList();
        synchronized (rulesOperationMutex) {
            try {
                int iRemoveCurrentChainedDispatchCount = removeCurrentChainedDispatchCount(event.getUniqueIdentifier());
                Iterator<Rule> it = list.iterator();
                while (it.hasNext()) {
                    arrayList.addAll(evaluateRuleForEvent(event, it.next(), iRemoveCurrentChainedDispatchCount));
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return arrayList;
    }

    public List<Event> evaluateRuleForEvent(Event event, Rule rule, int i10) {
        ArrayList arrayList = new ArrayList();
        Log.trace(LOG_PREFIX, "Evaluating rule: %s for event number: %s", rule.toString(), Integer.valueOf(event.getEventNumber()));
        if (!rule.evaluateCondition(this.ruleTokenParser, event)) {
            return arrayList;
        }
        for (Event event2 : rule.getConsequenceEvents()) {
            EventData tokenExpandedEventData = getTokenExpandedEventData(event2.getData(), event);
            if (tokenExpandedEventData == null) {
                Log.debug(LOG_PREFIX, "Unable to process a RuleConsequence Event, unable to expand event data.", new Object[0]);
            } else {
                Map<String, Variant> mapOptVariantMap = tokenExpandedEventData.optVariantMap(EventDataKeys.RuleEngine.CONSEQUENCE_TRIGGERED, null);
                if (mapOptVariantMap == null || mapOptVariantMap.isEmpty()) {
                    Log.debug(LOG_PREFIX, "Unable to process a RuleConsequence Event, 'triggeredconsequence' not found in payload.", new Object[0]);
                } else if (mapOptVariantMap.containsKey("type")) {
                    String strOptString = mapOptVariantMap.get("type").optString(null);
                    if (StringUtils.isNullOrEmpty(strOptString)) {
                        Log.debug(LOG_PREFIX, "Unable to process a RuleConsequence Event, no 'type' has been specified.", new Object[0]);
                    } else if ("add".equals(strOptString)) {
                        processAttachDataConsequence(mapOptVariantMap, event);
                    } else if ("mod".equals(strOptString)) {
                        processModifyDataConsequence(mapOptVariantMap, event);
                    } else if ("dispatch".equals(strOptString)) {
                        Event eventProcessDispatchConsequence = processDispatchConsequence(mapOptVariantMap, event, i10);
                        if (eventProcessDispatchConsequence != null) {
                            arrayList.add(eventProcessDispatchConsequence);
                        }
                    } else {
                        arrayList.add(new Event.Builder(event2.getName(), event2.getEventType(), event2.getEventSource()).setData(tokenExpandedEventData).build());
                    }
                } else {
                    Log.debug(LOG_PREFIX, "Unable to process a RuleConsequence Event, no 'type' has been specified.", new Object[0]);
                }
            }
        }
        return arrayList;
    }

    public List<Event> evaluateRules(Event event) {
        ArrayList arrayList;
        synchronized (rulesOperationMutex) {
            try {
                arrayList = new ArrayList();
                int iRemoveCurrentChainedDispatchCount = removeCurrentChainedDispatchCount(event.getUniqueIdentifier());
                Iterator<ConcurrentLinkedQueue<Rule>> it = this.moduleRuleAssociation.values().iterator();
                while (it.hasNext()) {
                    Iterator<Rule> it2 = it.next().iterator();
                    while (it2.hasNext()) {
                        arrayList.addAll(evaluateRuleForEvent(event, it2.next(), iRemoveCurrentChainedDispatchCount));
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return arrayList;
    }

    public Map<String, Integer> getDispatchChainedEvents() {
        return Collections.unmodifiableMap(this.dispatchChainedEvents);
    }

    public ConcurrentHashMap<Module, ConcurrentLinkedQueue<Rule>> getModuleRuleAssociation() {
        return this.moduleRuleAssociation;
    }

    public EventData getTokenExpandedEventData(EventData eventData, Event event) {
        if (eventData == null) {
            return null;
        }
        EventData eventData2 = new EventData();
        for (String str : eventData.keys()) {
            Object object = eventData.getObject(str);
            if (object instanceof Map) {
                eventData2.putObject(str, getTokenExpandedMap((Map) object, event));
            } else if (object instanceof List) {
                eventData2.putObject(str, getTokenExpandedList((List) object, event));
            } else if (object instanceof String) {
                eventData2.putObject(str, this.ruleTokenParser.expandTokensForString((String) object, event));
            } else {
                eventData2.putObject(str, object);
            }
        }
        return eventData2;
    }

    public List<Object> getTokenExpandedList(List<Object> list, Event event) {
        if (list == null || list.isEmpty()) {
            return list;
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (obj instanceof Map) {
                arrayList.add(getTokenExpandedMap((Map) obj, event));
            } else if (obj instanceof List) {
                arrayList.add(getTokenExpandedList((List) obj, event));
            } else if (obj instanceof String) {
                arrayList.add(this.ruleTokenParser.expandTokensForString((String) obj, event));
            } else {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public Map<String, Object> getTokenExpandedMap(Map<String, Object> map, Event event) {
        if (map == null || map.isEmpty()) {
            return map;
        }
        HashMap map2 = new HashMap();
        for (Map.Entry<String, Object> entry : map.entrySet()) {
            Object value = entry.getValue();
            if (value instanceof Map) {
                map2.put(entry.getKey(), getTokenExpandedMap((Map) value, event));
            } else if (value instanceof List) {
                map2.put(entry.getKey(), getTokenExpandedList((List) value, event));
            } else if (value instanceof String) {
                map2.put(entry.getKey(), this.ruleTokenParser.expandTokensForString((String) value, event));
            } else {
                map2.put(entry.getKey(), entry.getValue());
            }
        }
        return map2;
    }

    public void processAttachDataConsequence(Map<String, Variant> map, Event event) {
        Map<String, Variant> consequenceDetails;
        if (event == null || (consequenceDetails = getConsequenceDetails(map, "add")) == null) {
            return;
        }
        if (!consequenceDetails.containsKey("eventdata")) {
            Log.debug(LOG_PREFIX, "Unable to process an AttachDataConsequence Event, 'eventData' is missing from 'details'.", new Object[0]);
            return;
        }
        EventData eventData = new EventData(consequenceDetails.get("eventdata").optVariantMap(null));
        Log.debug(LOG_PREFIX, "Adding EventData to Event #%d with type '%s' and source '%s'.", Integer.valueOf(event.getEventNumber()), event.getEventType().getName(), event.getEventSource().getName());
        Log.debug(LOG_PREFIX, "Original EventData for Event #%d: %s", Integer.valueOf(event.getEventNumber()), event.getData().toString());
        event.getData().merge(eventData);
        Log.debug(LOG_PREFIX, "New EventData for Event #%d: %s", Integer.valueOf(event.getEventNumber()), event.getData().toString());
    }

    public Event processDispatchConsequence(Map<String, Variant> map, Event event, int i10) {
        Event eventBuild;
        if (event == null) {
            return null;
        }
        if (i10 >= 1) {
            Log.trace(LOG_PREFIX, "Unable to process %s consequence, max chained limit of (%d) met for this event uuid (%s).", "dispatch", 1, event.getUniqueIdentifier());
            return null;
        }
        Map<String, Variant> consequenceDetails = getConsequenceDetails(map, "dispatch");
        if (consequenceDetails == null) {
            return null;
        }
        String valueFromConsequenceDetails = getValueFromConsequenceDetails(consequenceDetails, "type", "dispatch");
        String valueFromConsequenceDetails2 = getValueFromConsequenceDetails(consequenceDetails, "source", "dispatch");
        String valueFromConsequenceDetails3 = getValueFromConsequenceDetails(consequenceDetails, "eventdataaction", "dispatch");
        if (!StringUtils.isNullOrEmpty(valueFromConsequenceDetails) && !StringUtils.isNullOrEmpty(valueFromConsequenceDetails2) && !StringUtils.isNullOrEmpty(valueFromConsequenceDetails3)) {
            if ("copy".equals(valueFromConsequenceDetails3)) {
                eventBuild = new Event.Builder("Dispatch Consequence Result", valueFromConsequenceDetails, valueFromConsequenceDetails2).setData(event.getData()).build();
            } else if ("new".equals(valueFromConsequenceDetails3)) {
                Map<String, Variant> mapOptVariantMap = consequenceDetails.containsKey("eventdata") ? consequenceDetails.get("eventdata").optVariantMap(null) : null;
                eventBuild = mapOptVariantMap != null ? new Event.Builder("Dispatch Consequence Result", valueFromConsequenceDetails, valueFromConsequenceDetails2).setData(new EventData(mapOptVariantMap)).build() : new Event.Builder("Dispatch Consequence Result", valueFromConsequenceDetails, valueFromConsequenceDetails2).build();
            } else {
                Log.debug(LOG_PREFIX, "Unable to process the %s consequence, unsupported (%s) 'eventdataaction', expected values are copy/new.", "dispatch", valueFromConsequenceDetails3);
            }
            if (eventBuild != null) {
                this.dispatchChainedEvents.put(eventBuild.getUniqueIdentifier(), Integer.valueOf(i10 + 1));
            }
            return eventBuild;
        }
        return null;
    }

    public void processModifyDataConsequence(Map<String, Variant> map, Event event) {
        Map<String, Variant> consequenceDetails;
        if (event == null || (consequenceDetails = getConsequenceDetails(map, "mod")) == null) {
            return;
        }
        if (!consequenceDetails.containsKey("eventdata")) {
            Log.debug(LOG_PREFIX, "Unable to process a ModifyDataConsequence Event, 'eventData' is missing from 'details'.", new Object[0]);
            return;
        }
        EventData eventData = new EventData(consequenceDetails.get("eventdata").optVariantMap(null));
        Log.debug(LOG_PREFIX, "Modifying EventData on Event #%d with type '%s' and source '%s'.", Integer.valueOf(event.getEventNumber()), event.getEventType().getName(), event.getEventSource().getName());
        Log.debug(LOG_PREFIX, "Original EventData for Event #%d: %s", Integer.valueOf(event.getEventNumber()), event.getData().toString());
        event.getData().overwrite(eventData);
        Log.debug(LOG_PREFIX, "New EventData for Event #%d: %s", Integer.valueOf(event.getEventNumber()), event.getData().toString());
    }

    public void replaceRules(Module module, List<Rule> list) {
        synchronized (rulesOperationMutex) {
            try {
                if (list == null) {
                    this.moduleRuleAssociation.remove(module);
                } else {
                    this.moduleRuleAssociation.put(module, new ConcurrentLinkedQueue<>(list));
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        Log.trace(LOG_PREFIX, "Replaced rules for module: " + module.getModuleName(), new Object[0]);
    }

    public void unregisterAllRules(Module module) {
        synchronized (rulesOperationMutex) {
            this.moduleRuleAssociation.remove(module);
        }
    }
}

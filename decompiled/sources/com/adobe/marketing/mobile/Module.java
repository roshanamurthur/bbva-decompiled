package com.adobe.marketing.mobile;

import java.lang.reflect.Constructor;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* JADX INFO: loaded from: classes2.dex */
abstract class Module {
    private ExecutorService executor;
    private final Object executorMutex = new Object();
    private ModuleDetails moduleDetails;
    private String moduleName;
    private String moduleVersion;
    private final EventHub parentHub;

    public interface OneTimeListenerBlock {
        void call(Event event);
    }

    public Module(String str, EventHub eventHub) {
        this.parentHub = eventHub;
        this.moduleName = str;
    }

    public final boolean clearSharedStates() {
        try {
            this.parentHub.clearSharedStates(this);
            return true;
        } catch (InvalidModuleException e5) {
            Log.error(this.moduleName, "Unable to clear the shared event states (%s)", e5);
            return false;
        }
    }

    public final boolean clearXDMSharedStates() {
        try {
            this.parentHub.clearSharedStates(this, SharedStateType.XDM);
            return true;
        } catch (InvalidModuleException e5) {
            Log.error(this.moduleName, "Unable to clear the XDM shared event states (%s)", e5);
            return false;
        }
    }

    public final <T extends ModuleEventDispatcher<?>> T createDispatcher(Class<T> cls) {
        Constructor<T> declaredConstructor;
        Class<?> cls2 = getClass();
        try {
            declaredConstructor = cls.getDeclaredConstructor(EventHub.class, cls2);
        } catch (NoSuchMethodException unused) {
            try {
                declaredConstructor = cls.getDeclaredConstructor(EventHub.class, cls2.getSuperclass());
            } catch (NoSuchMethodException e5) {
                Log.error(this.moduleName, "Failed to find a constructor for class %s (%s)", cls.getSimpleName(), e5);
                declaredConstructor = null;
            }
        }
        if (declaredConstructor == null) {
            return null;
        }
        try {
            declaredConstructor.setAccessible(true);
            return declaredConstructor.newInstance(this.parentHub, this);
        } catch (Exception e7) {
            Log.error(this.moduleName, "Failed to create dispatcher for class %s (%s)", cls.getSimpleName(), e7);
            return null;
        }
    }

    public final void createOrUpdateSharedState(int i10, EventData eventData) {
        try {
            this.parentHub.createOrUpdateSharedState(this, i10, eventData);
        } catch (InvalidModuleException e5) {
            Log.error(this.moduleName, "Unable to create or update shared state with version (%s)", e5);
        }
    }

    public final void createOrUpdateXDMSharedState(int i10, EventData eventData) {
        try {
            this.parentHub.createOrUpdateSharedState(this, i10, eventData, SharedStateType.XDM);
        } catch (InvalidModuleException e5) {
            Log.error(this.moduleName, "Unable to create or update XDM shared state with version (%s)", e5);
        }
    }

    public final void createSharedState(int i10, EventData eventData) {
        try {
            this.parentHub.createSharedState(this, i10, eventData);
        } catch (InvalidModuleException e5) {
            Log.error(this.moduleName, "Unable to create shared state (%s)", e5);
        }
    }

    public final void createSharedStateAndDispatchEvent(EventData eventData, Event event) {
        if (eventData == null || event == null) {
            Log.debug(this.moduleName, "failed to create the shared state and dispatch the event ( null sharedState or null event)", new Object[0]);
            return;
        }
        try {
            this.parentHub.createSharedStateAndDispatchEvent(this, eventData, event);
        } catch (InvalidModuleException e5) {
            Log.error(this.moduleName, "Unable to create shared state (%s)", e5);
        }
    }

    public final void createXDMSharedState(int i10, EventData eventData) {
        try {
            this.parentHub.createSharedState(this, i10, eventData, SharedStateType.XDM);
        } catch (InvalidModuleException e5) {
            Log.error(this.moduleName, "Unable to create XDM shared state (%s)", e5);
        }
    }

    public final void createXDMSharedStateAndDispatchEvent(EventData eventData, Event event) {
        if (eventData == null || event == null) {
            Log.debug(this.moduleName, "failed to create XDM shared state and dispatch the event ( null sharedState or null event)", new Object[0]);
            return;
        }
        try {
            this.parentHub.createSharedStateAndDispatchEvent(this, eventData, event, SharedStateType.XDM);
        } catch (InvalidModuleException e5) {
            Log.error(this.moduleName, "Unable to create XDM shared state (%s)", e5);
        }
    }

    public final ExecutorService getExecutor() {
        ExecutorService executorService;
        synchronized (this.executorMutex) {
            try {
                if (this.executor == null) {
                    this.executor = Executors.newSingleThreadExecutor();
                }
                executorService = this.executor;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return executorService;
    }

    public ModuleDetails getModuleDetails() {
        return this.moduleDetails;
    }

    public String getModuleName() {
        return this.moduleName;
    }

    public String getModuleVersion() {
        return this.moduleVersion;
    }

    public final EventData getSharedEventState(String str, Event event) {
        try {
            return this.parentHub.getSharedEventState(str, event, this);
        } catch (IllegalArgumentException e5) {
            Log.error(this.moduleName, "Unable to retrieve shared event state (%s)", e5);
            return null;
        }
    }

    public final EventData getXDMSharedEventState(String str, Event event) {
        try {
            return this.parentHub.getSharedEventState(str, event, this, SharedStateType.XDM);
        } catch (IllegalArgumentException e5) {
            Log.error(this.moduleName, "Unable to retrieve XDM shared event state (%s)", e5);
            return null;
        }
    }

    public final boolean hasSharedEventState(String str) {
        try {
            return this.parentHub.hasSharedEventState(str);
        } catch (IllegalArgumentException e5) {
            Log.error(this.moduleName, "Unable to query shared event state (%s)", e5);
            return false;
        }
    }

    public final boolean hasXDMSharedEventState(String str) {
        try {
            return this.parentHub.hasSharedEventState(str, SharedStateType.XDM);
        } catch (IllegalArgumentException e5) {
            Log.error(this.moduleName, "Unable to query XDM shared event state (%s)", e5);
            return false;
        }
    }

    public final <T extends ModuleEventListener<?>> void registerListener(EventType eventType, EventSource eventSource, Class<T> cls) {
        if (eventType == null || eventSource == null || cls == null) {
            Log.error(this.moduleName, "Failed to register listener. EventType, EventSource and listenerClass must be non-null values", new Object[0]);
            return;
        }
        try {
            this.parentHub.registerModuleListener(this, eventType, eventSource, null, cls);
        } catch (InvalidModuleException e5) {
            Log.debug(this.moduleName, "Failed to register listener (%s)", e5);
        }
    }

    public final void registerRule(Rule rule) {
        try {
            this.parentHub.registerModuleRule(this, rule);
        } catch (InvalidModuleException e5) {
            Log.debug(this.moduleName, "Failed to register rule (%s)", e5);
        }
    }

    public final <T extends ModuleEventListener<?>> void registerWildcardListener(Class<T> cls) {
        registerListener(EventType.WILDCARD, EventSource.WILDCARD, cls);
    }

    public final void replaceRules(List<Rule> list) {
        try {
            this.parentHub.replaceModuleRules(this, list);
        } catch (InvalidModuleException e5) {
            Log.debug(this.moduleName, "Failed to register rule (%s)", e5);
        }
    }

    public final void replaceRulesAndEvaluateEvents(List<Rule> list, ReprocessEventsHandler reprocessEventsHandler) {
        this.parentHub.replaceRulesAndEvaluateEvents(this, list, reprocessEventsHandler);
    }

    public void setModuleDetails(ModuleDetails moduleDetails) {
        this.moduleDetails = moduleDetails;
    }

    public void setModuleName(String str) {
        this.moduleName = str;
    }

    public void setModuleVersion(String str) {
        this.moduleVersion = str;
    }

    public final void unregisterAllRules() {
        try {
            this.parentHub.unregisterModuleRules(this);
        } catch (InvalidModuleException e5) {
            Log.debug(this.moduleName, "Failed ot unregister rules for module (%s)", e5);
        }
    }

    public final void unregisterListener(EventType eventType, EventSource eventSource) {
        try {
            this.parentHub.unregisterModuleListener(this, eventType, eventSource);
        } catch (InvalidModuleException e5) {
            Log.debug(this.moduleName, "Failed to unregister listener (%s)", e5);
        }
    }

    public final void unregisterModule() {
        try {
            this.parentHub.unregisterModule(this);
        } catch (InvalidModuleException e5) {
            Log.debug(this.moduleName, "Failed to unregister module (%s)", e5);
        }
    }

    public final void unregisterWildcardListener() {
        unregisterListener(EventType.WILDCARD, EventSource.WILDCARD);
    }

    public final void updateSharedState(int i10, EventData eventData) {
        try {
            this.parentHub.updateSharedState(this, i10, eventData);
        } catch (InvalidModuleException e5) {
            Log.error(this.moduleName, "Unable to update shared state (%s)", e5);
        }
    }

    public final void updateXDMSharedState(int i10, EventData eventData) {
        try {
            this.parentHub.updateSharedState(this, i10, eventData, SharedStateType.XDM);
        } catch (InvalidModuleException e5) {
            Log.error(this.moduleName, "Unable to update XDM shared state (%s)", e5);
        }
    }

    public final void createOrUpdateSharedState(EventData eventData) {
        try {
            this.parentHub.createOrUpdateSharedState(this, eventData);
        } catch (InvalidModuleException e5) {
            Log.error(this.moduleName, "Unable to create or update shared state (%s)", e5);
        }
    }

    public final void createOrUpdateXDMSharedState(EventData eventData) {
        try {
            this.parentHub.createOrUpdateSharedState(this, eventData, SharedStateType.XDM);
        } catch (InvalidModuleException e5) {
            Log.error(this.moduleName, "Unable to create or update XDM shared state (%s)", e5);
        }
    }

    public void onUnregistered() {
    }
}

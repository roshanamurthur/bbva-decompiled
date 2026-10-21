package com.adobe.marketing.mobile;

import androidx.camera.camera2.internal.compat.u;
import androidx.camera.core.processing.f;
import com.noknok.android.client.appsdk_plus.IAppSDKPlus;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes2.dex */
class EventHub {
    private static final long DEFAULT_THREAD_POOL_KEEP_ALIVE_TIME_SECONDS = 60;
    private static final String LOG_CLASS_WAS_NULL = "Extension class was null";
    private static final String LOG_MODULE_NOT_REGISTERED = "Module (%s) is not registered";
    private static final String LOG_MODULE_WAS_NULL = "Module was null";
    private static final String LOG_PROVIDED_MODULE_WAS_NULL = "Provided module was null";
    private static final String LOG_STATENAME_WAS_NULL = "StateName was null";
    private static final int ONE_TIME_LISTENER_TIMEOUT_DEFAULT_MILLISECONDS = 5000;
    public static final int REPROCESS_EVENTS_AMOUNT_LIMIT = 100;
    private static final String SDK_VERSION_DELIMITER = "-";
    public static final EventData SHARED_STATE_PENDING = null;
    private static final String STANDARD_STATE_CHANGE_EVENTNAME = "Shared state change";
    private static final String XDM_STATE_CHANGE_EVENTNAME = "Shared state change (XDM)";
    private final ConcurrentHashMap<String, Module> activeModules;
    private final Object bootMutex;
    protected final String coreVersion;
    private final AtomicInteger currentEventNumber;
    private final EventBus eventBus;
    protected final EventData eventHubSharedState;
    private final ExecutorService eventHubThreadService;
    protected boolean isBooted;
    private final String logPrefix;
    private final ConcurrentHashMap<Module, ConcurrentLinkedQueue<EventListener>> moduleListeners;
    private final ConcurrentHashMap<String, RangedResolver<EventData>> moduleSharedStates;
    private final ConcurrentHashMap<String, RangedResolver<EventData>> moduleXdmSharedStates;
    private final LinkedList<Event> preBootEvents;
    private final RulesEngine rulesEngine;
    private ScheduledExecutorService scheduledThreadPool;
    private final Object scheduledThreadPoolMutex;
    private final PlatformServices services;
    private final ConcurrentHashMap<String, Boolean> sharedStateCircularCheck;
    private final ExecutorService threadPool;
    private WrapperType wrapperType;
    public static final EventData SHARED_STATE_INVALID = new EventData();
    public static final EventData SHARED_STATE_NEXT = new EventData();
    public static final EventData SHARED_STATE_PREV = new EventData();

    public final class EventRunnable implements Runnable {
        final Event event;

        public EventRunnable(Event event) {
            this.event = event;
        }

        @Override // java.lang.Runnable
        public void run() {
            long jCurrentTimeMillis = System.currentTimeMillis();
            List<Event> listEvaluateRules = EventHub.this.rulesEngine.evaluateRules(this.event);
            Iterator<Event> it = listEvaluateRules.iterator();
            while (it.hasNext()) {
                EventHub.this.dispatch(it.next());
            }
            Log.trace(EventHub.this.logPrefix, "Event (%s) #%d (%s) resulted in %d consequence events. Time in rules was %d milliseconds.", this.event.getUniqueIdentifier(), Integer.valueOf(this.event.getEventNumber()), this.event.getName(), Integer.valueOf(listEvaluateRules.size()), Long.valueOf(System.currentTimeMillis() - jCurrentTimeMillis));
            EventHub.this.eventBus.dispatch(this.event);
        }
    }

    public interface RegisterModuleCallback {
        void registered(Module module);
    }

    public final class ReprocessEventsWithRules implements Runnable {
        final List<Event> consequenceEvents = new ArrayList();
        final Module module;
        final ReprocessEventsHandler reprocessEventsHandler;
        final List<Rule> rules;

        public ReprocessEventsWithRules(ReprocessEventsHandler reprocessEventsHandler, List<Rule> list, Module module) {
            this.reprocessEventsHandler = reprocessEventsHandler;
            this.rules = list;
            this.module = module;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                List<Event> events = this.reprocessEventsHandler.getEvents();
                if (events.size() > 100) {
                    Log.debug(EventHub.this.logPrefix, "Failed to reprocess cached events, since the amount of events (%s) reach the limits (%s)", Integer.valueOf(events.size()), 100);
                } else {
                    Iterator<Event> it = events.iterator();
                    while (it.hasNext()) {
                        this.consequenceEvents.addAll(EventHub.this.rulesEngine.evaluateEventWithRules(it.next(), this.rules));
                    }
                }
                this.reprocessEventsHandler.onEventReprocessingComplete();
                Iterator<Event> it2 = this.consequenceEvents.iterator();
                while (it2.hasNext()) {
                    EventHub.this.dispatch(it2.next());
                }
            } catch (Exception e5) {
                Log.debug(EventHub.this.logPrefix, "Failed to reprocess cached events (%s)", e5);
            }
        }
    }

    public EventHub(String str, PlatformServices platformServices) {
        this(str, platformServices, "undefined");
    }

    private void clearSharedStateCommon(Module module, SharedStateType sharedStateType) throws InvalidModuleException {
        if (module == null) {
            throw new InvalidModuleException(LOG_MODULE_WAS_NULL);
        }
        String moduleName = module.getModuleName();
        if (moduleName == null) {
            throw new InvalidModuleException(LOG_STATENAME_WAS_NULL);
        }
        if (sharedStateType == SharedStateType.XDM) {
            this.moduleXdmSharedStates.remove(moduleName);
        } else {
            this.moduleSharedStates.remove(moduleName);
        }
        fireStateChangeEvent(moduleName, sharedStateType);
    }

    private void createOrUpdateSharedStateCommon(Module module, int i10, EventData eventData, boolean z10, boolean z11, SharedStateType sharedStateType) throws InvalidModuleException {
        if (module == null) {
            throw new InvalidModuleException(LOG_MODULE_WAS_NULL);
        }
        String moduleName = module.getModuleName();
        if (moduleName == null) {
            throw new InvalidModuleException(LOG_STATENAME_WAS_NULL);
        }
        createOrUpdateSharedStateCommon(moduleName, i10, eventData, z10, z11, sharedStateType);
    }

    private void fireStateChangeEvent(String str, SharedStateType sharedStateType) {
        dispatch(new Event.Builder(sharedStateType == SharedStateType.STANDARD ? STANDARD_STATE_CHANGE_EVENTNAME : XDM_STATE_CHANGE_EVENTNAME, EventType.HUB, EventSource.SHARED_STATE).setData(new EventData().putString(EventDataKeys.EVENT_STATE_OWNER, str)).build());
    }

    private ScheduledExecutorService getScheduledExecutorService() {
        if (this.scheduledThreadPool == null) {
            synchronized (this.scheduledThreadPoolMutex) {
                try {
                    if (this.scheduledThreadPool == null) {
                        this.scheduledThreadPool = Executors.newSingleThreadScheduledExecutor();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return this.scheduledThreadPool;
    }

    private EventData getSharedEventStateCommon(String str, Event event, Module module, SharedStateType sharedStateType) {
        if (str == null) {
            throw new IllegalArgumentException(LOG_STATENAME_WAS_NULL);
        }
        int eventNumber = Event.SHARED_STATE_NEWEST.getEventNumber();
        if (event != null) {
            eventNumber = event.getEventNumber();
        }
        if (Log.getLogLevel().id >= LoggingMode.DEBUG.id && module != null) {
            String moduleName = module.getModuleName();
            this.sharedStateCircularCheck.put(u.f(moduleName, str), Boolean.TRUE);
            if (this.sharedStateCircularCheck.get(str + moduleName) != null) {
                Log.warning(this.logPrefix, "Circular shared-state dependency between %s and %s, you may have a live-lock.", moduleName, str);
            }
        }
        RangedResolver<EventData> rangedResolver = sharedStateType == SharedStateType.XDM ? this.moduleXdmSharedStates.get(str) : this.moduleSharedStates.get(str);
        return rangedResolver != null ? rangedResolver.resolve(eventNumber) : SHARED_STATE_PENDING;
    }

    private HashMap<String, String> getWrapperInfo() {
        HashMap<String, String> map = new HashMap<>();
        map.put("type", this.wrapperType.getWrapperTag());
        map.put("friendlyName", this.wrapperType.getFriendlyName());
        return map;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean isRegisteredModule(String str) {
        if (str == null) {
            return false;
        }
        return this.activeModules.containsKey(normalizeName(str));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String normalizeName(String str) {
        if (str != null) {
            return str.toLowerCase();
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean unregisterListenerIfPresent(Module module, EventType eventType, EventSource eventSource) {
        ConcurrentLinkedQueue<EventListener> concurrentLinkedQueue = this.moduleListeners.get(module);
        boolean z10 = false;
        if (concurrentLinkedQueue != null && !concurrentLinkedQueue.isEmpty()) {
            for (EventListener eventListener : concurrentLinkedQueue) {
                if (eventListener.getEventSource().equals(eventSource) && eventListener.getEventType().equals(eventType)) {
                    concurrentLinkedQueue.remove(eventListener);
                    this.eventBus.removeListener(eventListener);
                    z10 = true;
                }
            }
        }
        return z10;
    }

    public void addModuleToEventHubSharedState(Module module) {
        if (module == null) {
            return;
        }
        ModuleDetails moduleDetails = module.getModuleDetails();
        String moduleName = module.getModuleName();
        String moduleName2 = moduleDetails == null ? module.getModuleName() : moduleDetails.getName();
        String moduleVersion = moduleDetails == null ? module.getModuleVersion() : moduleDetails.getVersion();
        if (StringUtils.isNullOrEmpty(moduleName)) {
            return;
        }
        Log.trace(this.logPrefix, "Registering extension '%s' with version '%s'", moduleName, moduleVersion);
        Map<String, Variant> mapOptVariantMap = this.eventHubSharedState.optVariantMap(IAppSDKPlus.EXTRA_KEY_EXTENSIONS, new HashMap());
        HashMap map = new HashMap();
        if (moduleVersion == null) {
            moduleVersion = "";
        }
        map.put("version", Variant.fromString(moduleVersion));
        if (moduleName2 == null) {
            moduleName2 = moduleName;
        }
        map.put("friendlyName", Variant.fromString(moduleName2));
        mapOptVariantMap.put(moduleName, Variant.fromVariantMap(map));
        this.eventHubSharedState.putVariantMap(IAppSDKPlus.EXTRA_KEY_EXTENSIONS, mapOptVariantMap);
        synchronized (this.bootMutex) {
            try {
                if (this.isBooted) {
                    createEventHubSharedState(this.currentEventNumber.get());
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void clearSharedStates(Module module) throws InvalidModuleException {
        clearSharedStateCommon(module, SharedStateType.STANDARD);
    }

    public void createEventHubSharedState(int i10) {
        createOrUpdateSharedStateCommon("com.adobe.module.eventhub", i10, this.eventHubSharedState, true, false, SharedStateType.STANDARD);
    }

    public void createOrUpdateSharedState(Module module, int i10, EventData eventData) throws InvalidModuleException {
        createOrUpdateSharedStateCommon(module, i10, eventData, true, true, SharedStateType.STANDARD);
    }

    public void createSharedState(Module module, int i10, EventData eventData) throws InvalidModuleException {
        createOrUpdateSharedStateCommon(module, i10, eventData, true, false, SharedStateType.STANDARD);
    }

    public void createSharedStateAndDispatchEvent(Module module, EventData eventData, Event event) throws InvalidModuleException {
        createSharedStateAndDispatchEvent(module, eventData, event, SharedStateType.STANDARD);
    }

    public void dispatch(Event event) {
        synchronized (this.bootMutex) {
            try {
                event.setEventNumber(this.currentEventNumber.getAndIncrement());
                if (this.isBooted) {
                    this.eventHubThreadService.submit(new EventRunnable(event));
                } else {
                    Log.debug(this.logPrefix, "Event (%s, %s) was dispatched before module registration was finished", event.getEventType().getName(), event.getEventSource().getName());
                    this.preBootEvents.add(event);
                }
                EventHistory eventHistory = EventHistoryProvider.getEventHistory();
                if (eventHistory != null && event.getMask() != null) {
                    eventHistory.recordEvent(event, new EventHistoryResultHandler<Boolean>() { // from class: com.adobe.marketing.mobile.EventHub.2
                        @Override // com.adobe.marketing.mobile.EventHistoryResultHandler
                        public void call(Boolean bool) {
                            Log.trace(EventHub.this.logPrefix, bool.booleanValue() ? "Successfully inserted an Event into EventHistory database" : "Failed to insert an Event into EventHistory database", new Object[0]);
                        }
                    });
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void finishModulesRegistration(final AdobeCallback<Void> adobeCallback) {
        this.eventHubThreadService.submit(new Runnable() { // from class: com.adobe.marketing.mobile.EventHub.1
            @Override // java.lang.Runnable
            public void run() {
                synchronized (EventHub.this.bootMutex) {
                    try {
                        EventHub eventHub = EventHub.this;
                        if (eventHub.isBooted) {
                            Log.trace(eventHub.logPrefix, "Eventhub has already been booted", new Object[0]);
                            return;
                        }
                        Event eventBuild = new Event.Builder("EventHub", EventType.HUB, EventSource.BOOTED).build();
                        eventBuild.setEventNumber(0);
                        EventHub.this.eventHubThreadService.submit(EventHub.this.new EventRunnable(eventBuild));
                        EventHub eventHub2 = EventHub.this;
                        eventHub2.isBooted = true;
                        eventHub2.createEventHubSharedState(0);
                        while (EventHub.this.preBootEvents.peek() != null) {
                            ExecutorService executorService = EventHub.this.eventHubThreadService;
                            EventHub eventHub3 = EventHub.this;
                            executorService.submit(eventHub3.new EventRunnable((Event) eventHub3.preBootEvents.poll()));
                        }
                        if (adobeCallback != null) {
                            EventHub.this.eventHubThreadService.submit(new Runnable() { // from class: com.adobe.marketing.mobile.EventHub.1.1
                                @Override // java.lang.Runnable
                                public void run() {
                                    adobeCallback.call(null);
                                }
                            });
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            }
        });
    }

    public final Collection<Module> getActiveModules() {
        return this.activeModules.values();
    }

    public EventData getInitialEventHubSharedState() {
        EventData eventData = new EventData();
        eventData.putString("version", this.coreVersion);
        eventData.putVariantMap(IAppSDKPlus.EXTRA_KEY_EXTENSIONS, new HashMap());
        eventData.putStringMap("wrapper", getWrapperInfo());
        return eventData;
    }

    public ConcurrentLinkedQueue<EventListener> getModuleListeners(Module module) {
        return this.moduleListeners.get(module);
    }

    public ConcurrentHashMap<Module, ConcurrentLinkedQueue<Rule>> getModuleRuleAssociation() {
        return this.rulesEngine.getModuleRuleAssociation();
    }

    public final PlatformServices getPlatformServices() {
        return this.services;
    }

    public String getSdkVersion() {
        String str = this.coreVersion;
        if (this.wrapperType == WrapperType.NONE) {
            return str;
        }
        StringBuilder sbE = f.e(str, "-");
        sbE.append(this.wrapperType.getWrapperTag());
        return sbE.toString();
    }

    public EventData getSharedEventState(String str, Event event, Module module) {
        return getSharedEventStateCommon(str, event, module, SharedStateType.STANDARD);
    }

    public WrapperType getWrapperType() {
        return this.wrapperType;
    }

    public boolean hasSharedEventState(String str) {
        return hasSharedEventState(str, SharedStateType.STANDARD);
    }

    public void registerEventListener(final EventType eventType, final EventSource eventSource, final AdobeCallbackWithError<Event> adobeCallbackWithError) {
        if (adobeCallbackWithError == null) {
            Log.debug(this.logPrefix, "%s (callback), failed to register the event listener", "Unexpected Null Value");
        } else {
            this.eventHubThreadService.submit(new Runnable() { // from class: com.adobe.marketing.mobile.EventHub.7
                @Override // java.lang.Runnable
                public void run() {
                    try {
                        EventHub.this.eventBus.addListener(new EventListener() { // from class: com.adobe.marketing.mobile.EventHub.7.1
                            @Override // com.adobe.marketing.mobile.EventListener
                            public EventSource getEventSource() {
                                return eventSource;
                            }

                            @Override // com.adobe.marketing.mobile.EventListener
                            public EventType getEventType() {
                                return eventType;
                            }

                            @Override // com.adobe.marketing.mobile.EventListener
                            public void hear(Event event) {
                                adobeCallbackWithError.call(event);
                            }

                            @Override // com.adobe.marketing.mobile.EventListener
                            public void onUnregistered() {
                            }
                        }, eventType, eventSource, null);
                    } catch (Exception e5) {
                        Log.error(EventHub.this.logPrefix, "Failed to register the event listener - (%s)", e5);
                    }
                }
            });
        }
    }

    public final <T extends Extension> void registerExtension(final Class<T> cls) throws InvalidModuleException {
        if (cls == null) {
            throw new InvalidModuleException(LOG_CLASS_WAS_NULL);
        }
        this.eventHubThreadService.submit(new Runnable() { // from class: com.adobe.marketing.mobile.EventHub.4
            @Override // java.lang.Runnable
            public void run() {
                try {
                    ExtensionApi extensionApi = new ExtensionApi(this);
                    Constructor declaredConstructor = cls.getDeclaredConstructor(ExtensionApi.class);
                    declaredConstructor.setAccessible(true);
                    final Extension extension = (Extension) declaredConstructor.newInstance(extensionApi);
                    if (StringUtils.isNullOrEmpty(extension.getName())) {
                        Log.error(EventHub.this.logPrefix, "Failed to register extension, extension name should not be null or empty", extension.getName());
                        extension.onUnexpectedError(new ExtensionUnexpectedError(String.format("Failed to register extension with name (%s), %s class", extension.getName(), cls.getSimpleName()), ExtensionError.BAD_NAME));
                    } else {
                        if (EventHub.this.isRegisteredModule(extension.getName())) {
                            Log.error(EventHub.this.logPrefix, "Failed to register extension, an extension with the same name (%s) already exists", extension.getName());
                            extension.onUnexpectedError(new ExtensionUnexpectedError(String.format("Failed to register extension with name %s, %s class", extension.getName(), cls.getSimpleName()), ExtensionError.DUPLICATE_NAME));
                            return;
                        }
                        EventHub.this.activeModules.put(EventHub.this.normalizeName(extension.getName()), extensionApi);
                        EventHub.this.moduleListeners.putIfAbsent(extensionApi, new ConcurrentLinkedQueue());
                        extensionApi.setExtension(extension);
                        extensionApi.setModuleDetails(new ModuleDetails() { // from class: com.adobe.marketing.mobile.EventHub.4.1
                            @Override // com.adobe.marketing.mobile.ModuleDetails
                            public Map<String, String> getAdditionalInfo() {
                                return new HashMap();
                            }

                            @Override // com.adobe.marketing.mobile.ModuleDetails
                            public String getName() {
                                return extension.getFriendlyName();
                            }

                            @Override // com.adobe.marketing.mobile.ModuleDetails
                            public String getVersion() {
                                return extension.getVersion();
                            }
                        });
                        EventHub.this.addModuleToEventHubSharedState(extensionApi);
                        Log.debug(EventHub.this.logPrefix, "Extension with name %s was registered successfully", extensionApi.getModuleName());
                    }
                } catch (Exception e5) {
                    Log.error(EventHub.this.logPrefix, "Unable to create instance of provided extension %s: %s", cls.getSimpleName(), e5);
                }
            }
        });
    }

    public final void registerModule(Class<? extends Module> cls) throws InvalidModuleException {
        registerModuleWithCallback(cls, null);
    }

    public final <T extends ModuleEventListener<?>> void registerModuleListener(final Module module, final EventType eventType, final EventSource eventSource, final String str, final Class<T> cls) throws InvalidModuleException {
        if (module == null) {
            throw new InvalidModuleException(LOG_MODULE_WAS_NULL);
        }
        if (cls == null || eventType == null || eventSource == null) {
            Log.debug(this.logPrefix, "%s (listenerClass, type or source), failed to register listener", "Unexpected Null Value");
        } else {
            this.eventHubThreadService.submit(new Runnable() { // from class: com.adobe.marketing.mobile.EventHub.6
                @Override // java.lang.Runnable
                public void run() {
                    Constructor declaredConstructor;
                    boolean z10;
                    if (!EventHub.this.isRegisteredModule(module.getModuleName())) {
                        Log.error(EventHub.this.logPrefix, "Failed to register listener, Module (%s) is not registered", module.getModuleName());
                        return;
                    }
                    EventHub.this.unregisterListenerIfPresent(module, eventType, eventSource);
                    Class<?> cls2 = module.getClass();
                    try {
                        declaredConstructor = cls.getDeclaredConstructor(cls2, String.class, String.class);
                        z10 = true;
                    } catch (NoSuchMethodException unused) {
                        declaredConstructor = null;
                        z10 = false;
                    }
                    if (!z10) {
                        try {
                            declaredConstructor = cls.getDeclaredConstructor(cls2, EventType.class, EventSource.class);
                        } catch (NoSuchMethodException unused2) {
                            try {
                                declaredConstructor = cls.getDeclaredConstructor(cls2.getSuperclass(), EventType.class, EventSource.class);
                            } catch (NoSuchMethodException e5) {
                                Log.error(EventHub.this.logPrefix, "Failed to find a constructor for class %s (%s)", cls.getSimpleName(), e5);
                                if (ExtensionApi.class.isAssignableFrom(module.getClass())) {
                                    ((ExtensionApi) module).getExtension().onUnexpectedError(new ExtensionUnexpectedError("Failed to register listener", ExtensionError.UNEXPECTED_ERROR));
                                }
                            }
                        }
                    }
                    if (declaredConstructor != null) {
                        try {
                            declaredConstructor.setAccessible(true);
                            ModuleEventListener moduleEventListener = z10 ? (ModuleEventListener) declaredConstructor.newInstance(module, eventType.getName(), eventSource.getName()) : (ModuleEventListener) declaredConstructor.newInstance(module, eventType, eventSource);
                            EventHub.this.moduleListeners.putIfAbsent(module, new ConcurrentLinkedQueue());
                            ((ConcurrentLinkedQueue) EventHub.this.moduleListeners.get(module)).add(moduleEventListener);
                            EventHub.this.eventBus.addListener(moduleEventListener, eventType, eventSource, str);
                        } catch (Exception e7) {
                            Log.error(EventHub.this.logPrefix, "Failed to register listener for class %s (%s)", cls.getSimpleName(), e7);
                            if (ExtensionApi.class.isAssignableFrom(module.getClass())) {
                                ((ExtensionApi) module).getExtension().onUnexpectedError(new ExtensionUnexpectedError("Failed to register listener", e7, ExtensionError.UNEXPECTED_ERROR));
                            }
                        }
                    }
                }
            });
        }
    }

    public final void registerModuleRule(Module module, Rule rule) throws InvalidModuleException {
        if (module == null) {
            throw new InvalidModuleException(LOG_PROVIDED_MODULE_WAS_NULL);
        }
        if (rule == null) {
            throw new IllegalArgumentException("Cannot register a null rule");
        }
        this.rulesEngine.addRule(module, rule);
    }

    public void registerModuleWithCallback(Class<? extends Module> cls, RegisterModuleCallback registerModuleCallback) throws InvalidModuleException {
        registerModuleWithCallback(cls, null, registerModuleCallback);
    }

    @Deprecated
    public void registerOneTimeListener(EventType eventType, EventSource eventSource, String str, Module.OneTimeListenerBlock oneTimeListenerBlock) {
        registerOneTimeListener(str, oneTimeListenerBlock);
    }

    public void removeModuleFromEventHubSharedState(Module module) {
        if (module == null) {
            return;
        }
        String moduleName = module.getModuleName();
        if (StringUtils.isNullOrEmpty(moduleName)) {
            return;
        }
        Map<String, Variant> mapOptVariantMap = this.eventHubSharedState.optVariantMap(IAppSDKPlus.EXTRA_KEY_EXTENSIONS, new HashMap());
        mapOptVariantMap.remove(moduleName);
        this.eventHubSharedState.putVariantMap(IAppSDKPlus.EXTRA_KEY_EXTENSIONS, mapOptVariantMap);
        synchronized (this.bootMutex) {
            try {
                if (this.isBooted) {
                    createEventHubSharedState(this.currentEventNumber.get());
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void replaceModuleRules(Module module, List<Rule> list) throws InvalidModuleException {
        if (module == null) {
            throw new InvalidModuleException(LOG_PROVIDED_MODULE_WAS_NULL);
        }
        if (list == null) {
            throw new IllegalArgumentException("Cannot register a null rule");
        }
        this.rulesEngine.replaceRules(module, list);
    }

    public void replaceRulesAndEvaluateEvents(Module module, List<Rule> list, ReprocessEventsHandler reprocessEventsHandler) {
        if (reprocessEventsHandler == null) {
            Log.debug(this.logPrefix, "failed to reprocess events as <reprocessEventsHandler> is null ", new Object[0]);
            return;
        }
        if (list == null) {
            Log.debug(this.logPrefix, "failed to reprocess events as <rules> is null ", new Object[0]);
            return;
        }
        try {
            replaceModuleRules(module, list);
            this.eventHubThreadService.submit(new ReprocessEventsWithRules(reprocessEventsHandler, list, module));
        } catch (InvalidModuleException e5) {
            Log.debug(this.logPrefix, "failed to replace rules.", e5);
            reprocessEventsHandler.onEventReprocessingComplete();
        }
    }

    public void resetSharedStates() {
        this.moduleSharedStates.clear();
        this.moduleXdmSharedStates.clear();
    }

    public void setWrapperType(WrapperType wrapperType) {
        synchronized (this.bootMutex) {
            try {
                if (this.isBooted) {
                    Log.warning(this.logPrefix, "Cannot set wrapper type to (%s) - (%s) as event hub has already booted.", wrapperType.getWrapperTag(), wrapperType.getFriendlyName());
                } else {
                    this.wrapperType = wrapperType;
                    this.eventHubSharedState.putStringMap("wrapper", getWrapperInfo());
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void shutdown() {
        this.eventHubThreadService.shutdownNow();
        this.threadPool.shutdownNow();
    }

    public final void unregisterModule(final Module module) throws InvalidModuleException {
        if (module == null) {
            throw new InvalidModuleException(LOG_MODULE_WAS_NULL);
        }
        this.eventHubThreadService.submit(new Runnable() { // from class: com.adobe.marketing.mobile.EventHub.5
            @Override // java.lang.Runnable
            public void run() {
                if (!EventHub.this.isRegisteredModule(module.getModuleName())) {
                    Log.error(EventHub.this.logPrefix, "Failed to unregister module, Module (%s) is not registered", module.getModuleName());
                    return;
                }
                Collection collection = (Collection) EventHub.this.moduleListeners.remove(module);
                if (collection != null) {
                    Iterator it = collection.iterator();
                    while (it.hasNext()) {
                        EventHub.this.eventBus.removeListener((EventListener) it.next());
                    }
                }
                EventHub.this.activeModules.remove(EventHub.this.normalizeName(module.getModuleName()));
                try {
                    module.onUnregistered();
                } catch (Exception e5) {
                    Log.error(EventHub.this.logPrefix, "%s.onUnregistered() threw %s", module.getClass().getSimpleName(), e5);
                }
            }
        });
        removeModuleFromEventHubSharedState(module);
    }

    public final void unregisterModuleListener(final Module module, final EventType eventType, final EventSource eventSource) throws InvalidModuleException {
        if (module == null) {
            throw new InvalidModuleException(LOG_MODULE_WAS_NULL);
        }
        this.eventHubThreadService.submit(new Runnable() { // from class: com.adobe.marketing.mobile.EventHub.10
            @Override // java.lang.Runnable
            public void run() {
                if (EventHub.this.unregisterListenerIfPresent(module, eventType, eventSource)) {
                    return;
                }
                Log.debug(EventHub.this.logPrefix, "Failed to unregister listener (no registered listener)", new Object[0]);
            }
        });
    }

    public final void unregisterModuleRules(Module module) throws InvalidModuleException {
        if (module == null) {
            throw new InvalidModuleException(LOG_PROVIDED_MODULE_WAS_NULL);
        }
        this.rulesEngine.unregisterAllRules(module);
    }

    public void updateSharedState(Module module, int i10, EventData eventData) throws InvalidModuleException {
        createOrUpdateSharedStateCommon(module, i10, eventData, false, true, SharedStateType.STANDARD);
    }

    public EventHub(String str, PlatformServices platformServices, String str2) {
        this.wrapperType = WrapperType.NONE;
        this.scheduledThreadPoolMutex = new Object();
        this.bootMutex = new Object();
        this.logPrefix = String.format("%s(%s)", getClass().getSimpleName(), str);
        if (platformServices == null) {
            throw new IllegalArgumentException("Cannot construct EventHub without a valid platform services instance");
        }
        this.coreVersion = str2;
        this.services = platformServices;
        this.activeModules = new ConcurrentHashMap<>();
        this.moduleListeners = new ConcurrentHashMap<>();
        this.moduleSharedStates = new ConcurrentHashMap<>();
        this.moduleXdmSharedStates = new ConcurrentHashMap<>();
        this.currentEventNumber = new AtomicInteger(1);
        this.preBootEvents = new LinkedList<>();
        this.sharedStateCircularCheck = new ConcurrentHashMap<>();
        this.threadPool = Executors.newCachedThreadPool();
        this.eventHubThreadService = new ThreadPoolExecutor(0, 1, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue());
        this.eventHubSharedState = getInitialEventHubSharedState();
        this.isBooted = false;
        this.rulesEngine = new RulesEngine(this);
        this.eventBus = new EventBus();
    }

    public void clearSharedStates(Module module, SharedStateType sharedStateType) throws InvalidModuleException {
        clearSharedStateCommon(module, sharedStateType);
    }

    public void createOrUpdateSharedState(Module module, EventData eventData) throws InvalidModuleException {
        createOrUpdateSharedStateCommon(module, this.currentEventNumber.get(), eventData, true, false, SharedStateType.STANDARD);
    }

    public void createSharedState(Module module, int i10, EventData eventData, SharedStateType sharedStateType) throws InvalidModuleException {
        createOrUpdateSharedStateCommon(module, i10, eventData, true, false, sharedStateType);
    }

    public void createSharedStateAndDispatchEvent(Module module, EventData eventData, Event event, SharedStateType sharedStateType) throws InvalidModuleException {
        event.setEventNumber(this.currentEventNumber.getAndIncrement());
        createSharedState(module, event.getEventNumber(), eventData, sharedStateType);
        this.eventHubThreadService.submit(new EventRunnable(event));
    }

    public EventData getSharedEventState(String str, Event event, Module module, SharedStateType sharedStateType) {
        return getSharedEventStateCommon(str, event, module, sharedStateType);
    }

    public boolean hasSharedEventState(String str, SharedStateType sharedStateType) {
        if (str == null) {
            throw new IllegalArgumentException(LOG_STATENAME_WAS_NULL);
        }
        RangedResolver<EventData> rangedResolver = sharedStateType == SharedStateType.XDM ? this.moduleXdmSharedStates.get(str) : this.moduleSharedStates.get(str);
        return rangedResolver != null && rangedResolver.containsValidState();
    }

    public final void registerModule(Class<? extends Module> cls, ModuleDetails moduleDetails) throws InvalidModuleException {
        registerModuleWithCallback(cls, moduleDetails, null);
    }

    public void registerModuleWithCallback(final Class<? extends Module> cls, final ModuleDetails moduleDetails, final RegisterModuleCallback registerModuleCallback) throws InvalidModuleException {
        if (cls == null) {
            throw new InvalidModuleException(LOG_CLASS_WAS_NULL);
        }
        this.eventHubThreadService.submit(new Runnable() { // from class: com.adobe.marketing.mobile.EventHub.3
            @Override // java.lang.Runnable
            public void run() {
                Module module;
                try {
                    for (Module module2 : this.getActiveModules()) {
                        if (module2.getClass().getName().equalsIgnoreCase(cls.getName())) {
                            Log.warning(EventHub.this.logPrefix, "Failed to register extension, an extension with the same name (%s) already exists", module2.getModuleName());
                            return;
                        }
                    }
                    if (InternalModule.class.isAssignableFrom(cls)) {
                        Constructor declaredConstructor = cls.getDeclaredConstructor(EventHub.class, PlatformServices.class);
                        declaredConstructor.setAccessible(true);
                        module = (Module) declaredConstructor.newInstance(this, EventHub.this.services);
                    } else {
                        Constructor declaredConstructor2 = cls.getDeclaredConstructor(EventHub.class);
                        declaredConstructor2.setAccessible(true);
                        module = (Module) declaredConstructor2.newInstance(this);
                    }
                    if (EventHub.this.isRegisteredModule(module.getModuleName())) {
                        Log.warning(EventHub.this.logPrefix, "Failed to register extension, an extension with the same name (%s) already exists", module.getModuleName());
                        return;
                    }
                    module.setModuleDetails(moduleDetails);
                    EventHub.this.addModuleToEventHubSharedState(module);
                    EventHub.this.activeModules.put(EventHub.this.normalizeName(module.getModuleName()), module);
                    EventHub.this.moduleListeners.put(module, new ConcurrentLinkedQueue());
                    RegisterModuleCallback registerModuleCallback2 = registerModuleCallback;
                    if (registerModuleCallback2 != null) {
                        registerModuleCallback2.registered(module);
                    }
                } catch (Exception e5) {
                    Log.error(EventHub.this.logPrefix, "Unable to create instance of provided extension %s: %s", cls.getSimpleName(), e5);
                }
            }
        });
    }

    public void registerOneTimeListener(String str, Module.OneTimeListenerBlock oneTimeListenerBlock) {
        registerOneTimeListener(str, oneTimeListenerBlock, (AdobeCallbackWithError) null, 0);
    }

    public void updateSharedState(Module module, int i10, EventData eventData, SharedStateType sharedStateType) throws InvalidModuleException {
        createOrUpdateSharedStateCommon(module, i10, eventData, false, true, sharedStateType);
    }

    public void registerOneTimeListener(String str, Module.OneTimeListenerBlock oneTimeListenerBlock, AdobeCallbackWithError adobeCallbackWithError) {
        registerOneTimeListener(str, oneTimeListenerBlock, adobeCallbackWithError, ONE_TIME_LISTENER_TIMEOUT_DEFAULT_MILLISECONDS);
    }

    public void createOrUpdateSharedState(Module module, int i10, EventData eventData, SharedStateType sharedStateType) throws InvalidModuleException {
        createOrUpdateSharedStateCommon(module, i10, eventData, true, true, sharedStateType);
    }

    public void registerOneTimeListener(final String str, Module.OneTimeListenerBlock oneTimeListenerBlock, final AdobeCallbackWithError adobeCallbackWithError, int i10) {
        if (oneTimeListenerBlock == null) {
            Log.debug(this.logPrefix, "%s (callback block), failed to register one-time listener", "Unexpected Null Value");
            if (adobeCallbackWithError != null) {
                adobeCallbackWithError.fail(AdobeError.CALLBACK_NULL);
                return;
            }
            return;
        }
        final OneTimeListener oneTimeListener = new OneTimeListener(oneTimeListenerBlock);
        this.eventHubThreadService.submit(new Runnable() { // from class: com.adobe.marketing.mobile.EventHub.8
            @Override // java.lang.Runnable
            public void run() {
                try {
                    EventHub.this.eventBus.addListener(oneTimeListener, null, null, str);
                } catch (Exception e5) {
                    Log.error(EventHub.this.logPrefix, "Failed to register one-time listener", e5);
                }
            }
        });
        if (i10 <= 0 || adobeCallbackWithError == null) {
            return;
        }
        getScheduledExecutorService().schedule(new Runnable() { // from class: com.adobe.marketing.mobile.EventHub.9
            @Override // java.lang.Runnable
            public void run() {
                if (oneTimeListener.isCalled()) {
                    return;
                }
                oneTimeListener.cancel();
                EventHub.this.eventHubThreadService.submit(new Runnable() { // from class: com.adobe.marketing.mobile.EventHub.9.1
                    @Override // java.lang.Runnable
                    public void run() {
                        EventBus eventBus = EventHub.this.eventBus;
                        AnonymousClass9 anonymousClass9 = AnonymousClass9.this;
                        eventBus.removeListener(oneTimeListener, null, null, str);
                    }
                });
                adobeCallbackWithError.fail(AdobeError.CALLBACK_TIMEOUT);
            }
        }, i10, TimeUnit.MILLISECONDS);
    }

    private void createOrUpdateSharedStateCommon(String str, int i10, EventData eventData, boolean z10, boolean z11, SharedStateType sharedStateType) {
        boolean zAdd;
        boolean zUpdate;
        ConcurrentHashMap<String, RangedResolver<EventData>> concurrentHashMap = sharedStateType == SharedStateType.XDM ? this.moduleXdmSharedStates : this.moduleSharedStates;
        if (concurrentHashMap.containsKey(str)) {
            boolean zAdd2 = z10 ? concurrentHashMap.get(str).add(i10, eventData) : false;
            if (!z11 || zAdd2) {
                zAdd = zAdd2;
                zUpdate = false;
            } else {
                zAdd = zAdd2;
                zUpdate = concurrentHashMap.get(str).update(i10, eventData);
            }
        } else if (z10) {
            RangedResolver<EventData> rangedResolver = new RangedResolver<>(SHARED_STATE_PENDING, SHARED_STATE_INVALID, SHARED_STATE_NEXT, SHARED_STATE_PREV);
            zAdd = rangedResolver.add(i10, eventData);
            concurrentHashMap.put(str, rangedResolver);
            zUpdate = false;
        } else {
            zUpdate = false;
            zAdd = false;
        }
        if (!zAdd && !zUpdate) {
            Log.warning(this.logPrefix, "Unable to create or update shared state for %s with version %d.", str, Integer.valueOf(i10));
            return;
        }
        if (eventData == SHARED_STATE_PENDING) {
            Log.trace(this.logPrefix, "Will not fire shared state for %s with version %d, when this shared state is PENDING.", str, Integer.valueOf(i10));
            return;
        }
        fireStateChangeEvent(str, sharedStateType);
        if (Log.getLogLevel().id >= LoggingMode.VERBOSE.id) {
            Log.trace(this.logPrefix, "New shared state data for '%s' at version '%d': \n%s", str, Integer.valueOf(i10), eventData.prettyString(1));
        }
    }

    public void createOrUpdateSharedState(Module module, EventData eventData, SharedStateType sharedStateType) throws InvalidModuleException {
        createOrUpdateSharedStateCommon(module, this.currentEventNumber.get(), eventData, true, false, sharedStateType);
    }
}

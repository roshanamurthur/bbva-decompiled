package com.adobe.marketing.mobile;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
class Core {
    private static final String LOG_TAG = "Core";
    EventHub eventHub;
    private boolean startActionCalled;

    public Core(PlatformServices platformServices) {
        this(platformServices, "undefined");
    }

    public void clearUpdatedConfiguration() {
        EventData eventData = new EventData();
        eventData.putBoolean("config.clearUpdates", true);
        this.eventHub.dispatch(new Event.Builder("Clear updated configuration", EventType.CONFIGURATION, EventSource.REQUEST_CONTENT).setData(eventData).build());
    }

    public void collectData(Map<String, Object> map) {
        if (map == null || map.isEmpty()) {
            Log.debug(LOG_TAG, "collectData: Could not dispatch generic data event, data is null or empty.", new Object[0]);
            return;
        }
        this.eventHub.dispatch(new Event.Builder("CollectData", EventType.GENERIC_DATA, EventSource.OS).setEventData(map).build());
        Log.trace(LOG_TAG, "collectData: generic data OS event dispatched.", new Object[0]);
    }

    public void collectPii(Map<String, String> map) {
        if (map == null || map.isEmpty()) {
            Log.debug(LOG_TAG, "Could not trigger PII, the data is null or empty.", new Object[0]);
            return;
        }
        this.eventHub.dispatch(new Event.Builder("CollectPII", EventType.GENERIC_PII, EventSource.REQUEST_CONTENT).setData(new EventData().putStringMap("contextdata", map)).build());
        Log.trace(LOG_TAG, "Collect PII event was sent", new Object[0]);
    }

    public void configureWithAppID(String str) {
        EventData eventData = new EventData();
        eventData.putString(EventDataKeys.Configuration.CONFIGURATION_REQUEST_CONTENT_JSON_APP_ID, str);
        this.eventHub.dispatch(new Event.Builder("Configure with AppID", EventType.CONFIGURATION, EventSource.REQUEST_CONTENT).setData(eventData).build());
    }

    public void configureWithFileInAssets(String str) {
        if (StringUtils.isNullOrEmpty(str)) {
            Log.warning("Configuration", "Unable to configure with null or empty file name", new Object[0]);
            return;
        }
        EventData eventData = new EventData();
        eventData.putString("config.assetFile", str);
        this.eventHub.dispatch(new Event.Builder("Configure with FilePath", EventType.CONFIGURATION, EventSource.REQUEST_CONTENT).setData(eventData).build());
    }

    public void configureWithFileInPath(String str) {
        if (StringUtils.isNullOrEmpty(str)) {
            Log.warning("Configuration", "Unable to configure with null or empty remoteURL", new Object[0]);
            return;
        }
        EventData eventData = new EventData();
        eventData.putString(EventDataKeys.Configuration.CONFIGURATION_REQUEST_CONTENT_JSON_FILE_PATH, str);
        this.eventHub.dispatch(new Event.Builder("Configure with FilePath", EventType.CONFIGURATION, EventSource.REQUEST_CONTENT).setData(eventData).build());
    }

    public boolean dispatchEvent(Event event, ExtensionErrorCallback<ExtensionError> extensionErrorCallback) {
        if (event != null) {
            this.eventHub.dispatch(event);
            return true;
        }
        Log.debug(LOG_TAG, "%s (Core.dispatchEvent) - The event was not dispatched", "Unexpected Null Value");
        if (extensionErrorCallback != null) {
            extensionErrorCallback.error(ExtensionError.EVENT_NULL);
        }
        return false;
    }

    public boolean dispatchEventWithResponseCallback(Event event, final AdobeCallback<Event> adobeCallback, ExtensionErrorCallback<ExtensionError> extensionErrorCallback) {
        if (adobeCallback == null) {
            Log.debug(LOG_TAG, "%s (Core.dispatchEventWithResponseCallback) - The event was not dispatched", "Unexpected Null Value");
            if (extensionErrorCallback != null) {
                extensionErrorCallback.error(ExtensionError.CALLBACK_NULL);
            }
            return false;
        }
        if (event != null) {
            this.eventHub.registerOneTimeListener(event.getResponsePairID(), new Module.OneTimeListenerBlock() { // from class: com.adobe.marketing.mobile.Core.1
                @Override // com.adobe.marketing.mobile.Module.OneTimeListenerBlock
                public void call(Event event2) {
                    adobeCallback.call(event2);
                }
            });
            this.eventHub.dispatch(event);
            return true;
        }
        Log.debug(LOG_TAG, "%s (Core.dispatchEventWithResponseCallback) - The event was not dispatched", "Unexpected Null Value");
        if (extensionErrorCallback != null) {
            extensionErrorCallback.error(ExtensionError.EVENT_NULL);
        }
        return false;
    }

    public boolean dispatchResponseEvent(Event event, Event event2, ExtensionErrorCallback<ExtensionError> extensionErrorCallback) {
        if (event2 == null) {
            Log.debug(LOG_TAG, "%s (Core.dispatchResponseEvent) - The response event was not dispatched", "Unexpected Null Value");
            if (extensionErrorCallback != null) {
                extensionErrorCallback.error(ExtensionError.EVENT_NULL);
            }
            return false;
        }
        if (event != null) {
            event.setPairId(event2.getResponsePairID());
            this.eventHub.dispatch(event);
            return true;
        }
        Log.warning(LOG_TAG, "%s (Core.dispatchResponseEvent) - The response event was not dispatched", "Unexpected Null Value");
        if (extensionErrorCallback != null) {
            extensionErrorCallback.error(ExtensionError.EVENT_NULL);
        }
        return false;
    }

    public void getPrivacyStatus(final AdobeCallback<MobilePrivacyStatus> adobeCallback) {
        if (adobeCallback == null) {
            return;
        }
        EventData eventData = new EventData();
        eventData.putBoolean(EventDataKeys.Configuration.CONFIGURATION_REQUEST_CONTENT_RETRIEVE_CONFIG, true);
        Event eventBuild = new Event.Builder("PrivacyStatusRequest", EventType.CONFIGURATION, EventSource.REQUEST_CONTENT).setData(eventData).build();
        this.eventHub.registerOneTimeListener(eventBuild.getResponsePairID(), new Module.OneTimeListenerBlock() { // from class: com.adobe.marketing.mobile.Core.3
            @Override // com.adobe.marketing.mobile.Module.OneTimeListenerBlock
            public void call(Event event) {
                adobeCallback.call(MobilePrivacyStatus.fromString(event.getData().getString(EventDataKeys.Configuration.GLOBAL_CONFIG_PRIVACY)));
            }
        }, adobeCallback instanceof AdobeCallbackWithError ? (AdobeCallbackWithError) adobeCallback : null);
        this.eventHub.dispatch(eventBuild);
    }

    public void getSdkIdentities(final AdobeCallback<String> adobeCallback) {
        if (adobeCallback == null) {
            return;
        }
        AdobeCallbackWithError adobeCallbackWithError = adobeCallback instanceof AdobeCallbackWithError ? (AdobeCallbackWithError) adobeCallback : null;
        Event eventBuild = new Event.Builder("getSdkIdentities", EventType.CONFIGURATION, EventSource.REQUEST_IDENTITY).build();
        this.eventHub.registerOneTimeListener(eventBuild.getResponsePairID(), new Module.OneTimeListenerBlock() { // from class: com.adobe.marketing.mobile.Core.4
            @Override // com.adobe.marketing.mobile.Module.OneTimeListenerBlock
            public void call(Event event) {
                adobeCallback.call(event.getData().optString(EventDataKeys.Configuration.CONFIGURATION_RESPONSE_IDENTITY_ALL_IDENTIFIERS, "{}"));
            }
        }, adobeCallbackWithError);
        this.eventHub.dispatch(eventBuild);
    }

    public String getSdkVersion() {
        return this.eventHub.getSdkVersion();
    }

    public void lifecyclePause() {
        EventData eventData = new EventData();
        eventData.putString("action", EventDataKeys.Lifecycle.LIFECYCLE_PAUSE);
        this.eventHub.dispatch(new Event.Builder("LifecyclePause", EventType.GENERIC_LIFECYLE, EventSource.REQUEST_CONTENT).setData(eventData).build());
    }

    public void lifecycleStart(Map<String, String> map) {
        EventData eventData = new EventData();
        eventData.putString("action", EventDataKeys.Lifecycle.LIFECYCLE_START);
        eventData.putStringMap(EventDataKeys.Lifecycle.ADDITIONAL_CONTEXT_DATA, map);
        this.eventHub.dispatch(new Event.Builder("LifecycleResume", EventType.GENERIC_LIFECYLE, EventSource.REQUEST_CONTENT).setData(eventData).build());
    }

    public void registerEventListener(String str, String str2, AdobeCallbackWithError<Event> adobeCallbackWithError) {
        this.eventHub.registerEventListener(EventType.get(str), EventSource.get(str2), adobeCallbackWithError);
    }

    public void registerExtension(Class<? extends Extension> cls, ExtensionErrorCallback<ExtensionError> extensionErrorCallback) {
        try {
            this.eventHub.registerExtension(cls);
        } catch (InvalidModuleException e5) {
            Log.debug(LOG_TAG, "Core.registerExtension - Failed to register extension class %s (%s)", cls.getSimpleName(), e5);
            if (extensionErrorCallback != null) {
                extensionErrorCallback.error(ExtensionError.UNEXPECTED_ERROR);
            }
        }
    }

    public void resetIdentities() {
        this.eventHub.dispatch(new Event.Builder("Reset Identities Request", EventType.GENERIC_IDENTITY, EventSource.REQUEST_RESET).build());
    }

    public void setAdvertisingIdentifier(String str) {
        EventData eventData = new EventData();
        eventData.putString(EventDataKeys.Identity.ADVERTISING_IDENTIFIER, str);
        this.eventHub.dispatch(new Event.Builder("SetAdvertisingIdentifier", EventType.GENERIC_IDENTITY, EventSource.REQUEST_CONTENT).setData(eventData).build());
    }

    public void setPrivacyStatus(MobilePrivacyStatus mobilePrivacyStatus) {
        HashMap map = new HashMap();
        map.put(EventDataKeys.Configuration.GLOBAL_CONFIG_PRIVACY, mobilePrivacyStatus == null ? null : mobilePrivacyStatus.getValue());
        updateConfiguration(map);
    }

    public void setPushIdentifier(String str) {
        EventData eventData = new EventData();
        eventData.putString(EventDataKeys.Identity.PUSH_IDENTIFIER, str);
        this.eventHub.dispatch(new Event.Builder("SetPushIdentifier", EventType.GENERIC_IDENTITY, EventSource.REQUEST_CONTENT).setData(eventData).build());
    }

    public void setWrapperType(WrapperType wrapperType) {
        this.eventHub.setWrapperType(wrapperType);
    }

    public void start(AdobeCallback adobeCallback) {
        if (this.startActionCalled) {
            Log.debug(LOG_TAG, "Can't start Core more than once.", new Object[0]);
        } else {
            this.startActionCalled = true;
            this.eventHub.finishModulesRegistration(adobeCallback);
        }
    }

    public void trackAction(String str, Map<String, String> map) {
        EventData eventData = new EventData();
        eventData.putString("action", str);
        if (map == null) {
            map = new HashMap<>();
        }
        eventData.putStringMap("contextdata", map);
        this.eventHub.dispatch(new Event.Builder("Analytics Track", EventType.GENERIC_TRACK, EventSource.REQUEST_CONTENT).setData(eventData).build());
    }

    public void trackState(String str, Map<String, String> map) {
        EventData eventData = new EventData();
        eventData.putString("state", str);
        if (map == null) {
            map = new HashMap<>();
        }
        eventData.putStringMap("contextdata", map);
        this.eventHub.dispatch(new Event.Builder("Analytics Track", EventType.GENERIC_TRACK, EventSource.REQUEST_CONTENT).setData(eventData).build());
    }

    public void updateConfiguration(Map<String, Object> map) {
        HashMap map2 = new HashMap();
        map2.put(EventDataKeys.Configuration.CONFIGURATION_REQUEST_CONTENT_UPDATE_CONFIG, Variant.fromTypedMap(map, PermissiveVariantSerializer.DEFAULT_INSTANCE));
        this.eventHub.dispatch(new Event.Builder("Configuration Update", EventType.CONFIGURATION, EventSource.REQUEST_CONTENT).setData(new EventData(map2)).build());
    }

    public Core(PlatformServices platformServices, String str) {
        Log.setLoggingService(platformServices.getLoggingService());
        EventHub eventHub = new EventHub("AMSEventHub", platformServices, str);
        this.eventHub = eventHub;
        try {
            eventHub.registerModule(ConfigurationExtension.class, new ConfigurationModuleDetails(str));
        } catch (InvalidModuleException e5) {
            Log.error(LOG_TAG, "Failed to register Configuration extension (%s)", e5);
        }
        Log.trace(LOG_TAG, "Core initialization was successful", new Object[0]);
    }

    public void dispatchEventWithResponseCallback(Event event, final AdobeCallbackWithError<Event> adobeCallbackWithError) {
        if (event != null && adobeCallbackWithError != null) {
            this.eventHub.registerOneTimeListener(event.getResponsePairID(), new Module.OneTimeListenerBlock() { // from class: com.adobe.marketing.mobile.Core.2
                @Override // com.adobe.marketing.mobile.Module.OneTimeListenerBlock
                public void call(Event event2) {
                    adobeCallbackWithError.call(event2);
                }
            }, adobeCallbackWithError);
            this.eventHub.dispatch(event);
        } else {
            Log.debug(LOG_TAG, "(Core.dispatchEventWithResponseCallback) - The event was not dispatched, the given Event or AdobeCallbackWithError is null", new Object[0]);
        }
    }

    public Core(PlatformServices platformServices, EventHub eventHub) {
        Log.setLoggingService(platformServices.getLoggingService());
        this.eventHub = eventHub;
        Log.trace(LOG_TAG, "Core initialization was successful", new Object[0]);
    }
}

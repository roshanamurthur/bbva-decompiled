package com.adobe.marketing.mobile;

import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class ExtensionApi extends Module {
    private static final String LOG_TAG = "ExtensionApi";
    private Extension extension;

    public ExtensionApi(EventHub eventHub) {
        super(null, eventHub);
        this.extension = null;
    }

    private boolean clearSharedStateCommon(ExtensionErrorCallback<ExtensionError> extensionErrorCallback, SharedStateType sharedStateType) {
        try {
            return sharedStateType == SharedStateType.XDM ? super.clearXDMSharedStates() : super.clearSharedStates();
        } catch (Exception e5) {
            Log.warning(getLogTag(), "%s.%s Failed to clear the shared states. %s", LOG_TAG, sharedStateType == SharedStateType.XDM ? "clearXDMSharedEventStates" : "clearSharedEventStates", e5);
            if (extensionErrorCallback != null) {
                extensionErrorCallback.error(ExtensionError.UNEXPECTED_ERROR);
            }
            return false;
        }
    }

    private Map<String, Object> getSharedStateCommon(String str, Event event, ExtensionErrorCallback<ExtensionError> extensionErrorCallback, SharedStateType sharedStateType) {
        if (str == null) {
            Log.debug(getLogTag(), "%s (%s.%s State name)", "Unexpected Null Value", LOG_TAG, sharedStateType == SharedStateType.XDM ? "getXDMSharedEventState" : "getSharedEventState");
            if (extensionErrorCallback != null) {
                extensionErrorCallback.error(ExtensionError.UNEXPECTED_ERROR);
            }
            return null;
        }
        try {
            EventData xDMSharedEventState = sharedStateType == SharedStateType.XDM ? super.getXDMSharedEventState(str, event) : super.getSharedEventState(str, event);
            if (xDMSharedEventState == null) {
                return null;
            }
            return xDMSharedEventState.toObjectMap();
        } catch (Exception e5) {
            Log.warning(getLogTag(), "%s.%s Failed to retrieve the shared state %s, %s", LOG_TAG, sharedStateType == SharedStateType.XDM ? "getXDMSharedEventState" : "getSharedEventState", str, e5);
            if (extensionErrorCallback != null) {
                extensionErrorCallback.error(ExtensionError.UNEXPECTED_ERROR);
            }
            return null;
        }
    }

    private boolean setSharedStateCommon(Map<String, Object> map, Event event, ExtensionErrorCallback<ExtensionError> extensionErrorCallback, SharedStateType sharedStateType) {
        try {
            EventData eventDataFromObjectMap = map != null ? EventData.fromObjectMap(map) : EventHub.SHARED_STATE_PENDING;
            if (event == null) {
                if (sharedStateType == SharedStateType.XDM) {
                    createOrUpdateXDMSharedState(eventDataFromObjectMap);
                    return true;
                }
                createOrUpdateSharedState(eventDataFromObjectMap);
                return true;
            }
            if (sharedStateType == SharedStateType.XDM) {
                createOrUpdateXDMSharedState(event.getEventNumber(), eventDataFromObjectMap);
                return true;
            }
            createOrUpdateSharedState(event.getEventNumber(), eventDataFromObjectMap);
            return true;
        } catch (Exception e5) {
            Log.warning(getLogTag(), "%s.%s Failed to set the shared state. %s", LOG_TAG, sharedStateType == SharedStateType.XDM ? "setXDMSharedEventState" : "setSharedEventState", e5);
            if (extensionErrorCallback != null) {
                extensionErrorCallback.error(ExtensionError.UNEXPECTED_ERROR);
            }
            return false;
        }
    }

    public final boolean clearSharedEventStates(ExtensionErrorCallback<ExtensionError> extensionErrorCallback) {
        return clearSharedStateCommon(extensionErrorCallback, SharedStateType.STANDARD);
    }

    public final boolean clearXDMSharedEventStates(ExtensionErrorCallback<ExtensionError> extensionErrorCallback) {
        return clearSharedStateCommon(extensionErrorCallback, SharedStateType.XDM);
    }

    public final Extension getExtension() {
        return this.extension;
    }

    public String getLogTag() {
        Extension extension = this.extension;
        if (extension == null) {
            return LOG_TAG;
        }
        if (extension.getVersion() == null) {
            return this.extension.getName();
        }
        return this.extension.getName() + "(" + this.extension.getVersion() + ")";
    }

    @Override // com.adobe.marketing.mobile.Module
    public /* bridge */ /* synthetic */ String getModuleName() {
        return super.getModuleName();
    }

    @Override // com.adobe.marketing.mobile.Module
    public /* bridge */ /* synthetic */ String getModuleVersion() {
        return super.getModuleVersion();
    }

    public final Map<String, Object> getSharedEventState(String str, Event event, ExtensionErrorCallback<ExtensionError> extensionErrorCallback) {
        return getSharedStateCommon(str, event, extensionErrorCallback, SharedStateType.STANDARD);
    }

    public final Map<String, Object> getXDMSharedEventState(String str, Event event, ExtensionErrorCallback<ExtensionError> extensionErrorCallback) {
        return getSharedStateCommon(str, event, extensionErrorCallback, SharedStateType.XDM);
    }

    @Override // com.adobe.marketing.mobile.Module
    public final void onUnregistered() {
        Extension extension = this.extension;
        if (extension != null) {
            extension.onUnregistered();
        }
    }

    public final <T extends ExtensionListener> boolean registerEventListener(String str, String str2, Class<T> cls, ExtensionErrorCallback<ExtensionError> extensionErrorCallback) {
        if (StringUtils.isNullOrEmpty(str)) {
            Log.debug(getLogTag(), "%s.registerEventListener Event type cannot be null or empty.", LOG_TAG);
            if (extensionErrorCallback != null) {
                extensionErrorCallback.error(ExtensionError.EVENT_TYPE_NOT_SUPPORTED);
            }
            return false;
        }
        if (StringUtils.isNullOrEmpty(str2)) {
            Log.debug(getLogTag(), "%s.registerEventListener Event source cannot be null or empty.", LOG_TAG);
            if (extensionErrorCallback != null) {
                extensionErrorCallback.error(ExtensionError.EVENT_SOURCE_NOT_SUPPORTED);
            }
            return false;
        }
        if (cls != null) {
            Log.trace(getLogTag(), "%s.registerEventListener called for event type '%s' and source '%s'.", LOG_TAG, str, str2);
            super.registerListener(EventType.get(str), EventSource.get(str2), cls);
            return true;
        }
        Log.debug(getLogTag(), "%s (%s.registerEventListener Event listener class)", "Unexpected Null Value", LOG_TAG);
        if (extensionErrorCallback != null) {
            extensionErrorCallback.error(ExtensionError.UNEXPECTED_ERROR);
        }
        return false;
    }

    public final <T extends ExtensionListener> boolean registerWildcardListener(Class<T> cls, ExtensionErrorCallback<ExtensionError> extensionErrorCallback) {
        if (cls != null) {
            Log.debug(getLogTag(), "Registering a wildcard listener. If this is a production environment, consider using the regular listener instead.", new Object[0]);
            super.registerWildcardListener(cls);
            return true;
        }
        Log.debug(getLogTag(), "%s (%s.registerWildcardListener Event listener class)", "Unexpected Null Value", LOG_TAG);
        if (extensionErrorCallback != null) {
            extensionErrorCallback.error(ExtensionError.UNEXPECTED_ERROR);
        }
        return false;
    }

    public final void setExtension(Extension extension) {
        if (this.extension == null) {
            this.extension = extension;
            setModuleName(extension.getName());
            setModuleVersion(extension.getVersion());
        }
    }

    public final boolean setSharedEventState(Map<String, Object> map, Event event, ExtensionErrorCallback<ExtensionError> extensionErrorCallback) {
        return setSharedStateCommon(map, event, extensionErrorCallback, SharedStateType.STANDARD);
    }

    public final boolean setXDMSharedEventState(Map<String, Object> map, Event event, ExtensionErrorCallback<ExtensionError> extensionErrorCallback) {
        return setSharedStateCommon(map, event, extensionErrorCallback, SharedStateType.XDM);
    }

    public final void unregisterExtension() {
        super.unregisterModule();
    }
}

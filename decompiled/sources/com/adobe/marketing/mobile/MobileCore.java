package com.adobe.marketing.mobile;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import java.util.Date;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public class MobileCore {
    private static final String NULL_CONTEXT_MESSAGE = "Context must be set before calling SDK methods";
    private static final String TAG = "MobileCore";
    private static final String VERSION = "1.11.4";
    private static Core core;
    private static final Object mutex = new Object();
    private static PlatformServices platformServices;

    /* JADX INFO: renamed from: com.adobe.marketing.mobile.MobileCore$2, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass2 {
        static final /* synthetic */ int[] $SwitchMap$com$adobe$marketing$mobile$LoggingMode;

        static {
            int[] iArr = new int[LoggingMode.values().length];
            $SwitchMap$com$adobe$marketing$mobile$LoggingMode = iArr;
            try {
                iArr[LoggingMode.ERROR.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$adobe$marketing$mobile$LoggingMode[LoggingMode.WARNING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$adobe$marketing$mobile$LoggingMode[LoggingMode.DEBUG.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$adobe$marketing$mobile$LoggingMode[LoggingMode.VERBOSE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    private MobileCore() {
    }

    public static void clearUpdatedConfiguration() {
        Core core2 = core;
        if (core2 == null) {
            Log.debug(TAG, "Failed to clear updated configuration (%s)", NULL_CONTEXT_MESSAGE);
        } else {
            core2.clearUpdatedConfiguration();
        }
    }

    public static void collectLaunchInfo(Activity activity) {
        if (core == null) {
            Log.debug(TAG, "Failed to collect Activity data (%s)", NULL_CONTEXT_MESSAGE);
            return;
        }
        DataMarshaller dataMarshaller = new DataMarshaller();
        dataMarshaller.marshal(activity);
        core.collectData(dataMarshaller.getData());
    }

    public static void collectMessageInfo(Map<String, Object> map) {
        Core core2 = core;
        if (core2 == null) {
            Log.debug(TAG, "Failed to collect Message Info (%s)", NULL_CONTEXT_MESSAGE);
        } else {
            core2.collectData(map);
        }
    }

    public static void collectPii(Map<String, String> map) {
        Core core2 = core;
        if (core2 == null) {
            Log.debug(TAG, "Failed to collect PII (%s)", NULL_CONTEXT_MESSAGE);
        } else {
            core2.collectPii(map);
        }
    }

    public static void configureWithAppID(String str) {
        Core core2 = core;
        if (core2 == null) {
            Log.debug(TAG, "Failed to set Adobe App ID (%s)", NULL_CONTEXT_MESSAGE);
        } else {
            core2.configureWithAppID(str);
        }
    }

    public static void configureWithFileInAssets(String str) {
        Core core2 = core;
        if (core2 == null) {
            Log.debug(TAG, "Failed to load configuration with asset file (%s)", NULL_CONTEXT_MESSAGE);
        } else {
            core2.configureWithFileInAssets(str);
        }
    }

    public static void configureWithFileInPath(String str) {
        Core core2 = core;
        if (core2 == null) {
            Log.debug(TAG, "Failed to load configuration with file path (%s)", NULL_CONTEXT_MESSAGE);
        } else {
            core2.configureWithFileInPath(str);
        }
    }

    public static boolean dispatchEvent(Event event, ExtensionErrorCallback<ExtensionError> extensionErrorCallback) {
        Core core2 = core;
        if (core2 != null) {
            return core2.dispatchEvent(event, extensionErrorCallback);
        }
        Log.debug(TAG, "Failed to dispatch event. (%s)", NULL_CONTEXT_MESSAGE);
        if (extensionErrorCallback != null) {
            extensionErrorCallback.error(ExtensionError.UNEXPECTED_ERROR);
        }
        return false;
    }

    public static boolean dispatchEventWithResponseCallback(Event event, AdobeCallback<Event> adobeCallback, ExtensionErrorCallback<ExtensionError> extensionErrorCallback) {
        Core core2 = core;
        if (core2 != null) {
            return core2.dispatchEventWithResponseCallback(event, adobeCallback, extensionErrorCallback);
        }
        Log.debug(TAG, "Failed to dispatch event with a response callback. (%s)", NULL_CONTEXT_MESSAGE);
        if (extensionErrorCallback != null) {
            extensionErrorCallback.error(ExtensionError.UNEXPECTED_ERROR);
        }
        return false;
    }

    public static boolean dispatchResponseEvent(Event event, Event event2, ExtensionErrorCallback<ExtensionError> extensionErrorCallback) {
        Core core2 = core;
        if (core2 != null) {
            return core2.dispatchResponseEvent(event, event2, extensionErrorCallback);
        }
        Log.debug(TAG, "Failed to dispatch the response event. (%s)", NULL_CONTEXT_MESSAGE);
        if (extensionErrorCallback != null) {
            extensionErrorCallback.error(ExtensionError.UNEXPECTED_ERROR);
        }
        return false;
    }

    public static String extensionVersion() {
        synchronized (mutex) {
            try {
                Core core2 = core;
                if (core2 == null) {
                    Log.warning(TAG, "Returning version without wrapper type info. Make sure setApplication API is called.", new Object[0]);
                    return "1.11.4";
                }
                return core2.getSdkVersion();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public static Application getApplication() {
        return App.getApplication();
    }

    public static Core getCore() {
        Core core2;
        synchronized (mutex) {
            core2 = core;
        }
        return core2;
    }

    public static LoggingMode getLogLevel() {
        return Log.getLogLevel();
    }

    public static void getPrivacyStatus(AdobeCallback<MobilePrivacyStatus> adobeCallback) {
        Core core2 = core;
        if (core2 != null) {
            core2.getPrivacyStatus(adobeCallback);
            return;
        }
        Log.debug(TAG, "Failed to retrieve the privacy status (%s)", NULL_CONTEXT_MESSAGE);
        if ((adobeCallback instanceof AdobeCallbackWithError) && (adobeCallback != null)) {
            ((AdobeCallbackWithError) adobeCallback).fail(AdobeError.EXTENSION_NOT_INITIALIZED);
        }
    }

    public static void getSdkIdentities(AdobeCallback<String> adobeCallback) {
        if (adobeCallback == null) {
            Log.debug(TAG, "%s (Callback), provide a callback to retrieve the all SDK identities", "Unexpected Null Value");
            return;
        }
        Core core2 = core;
        if (core2 != null) {
            core2.getSdkIdentities(adobeCallback);
            return;
        }
        Log.debug(TAG, "Failed to retrieve the all SDK identities (%s)", NULL_CONTEXT_MESSAGE);
        if ((adobeCallback instanceof AdobeCallbackWithError) && true) {
            ((AdobeCallbackWithError) adobeCallback).fail(AdobeError.EXTENSION_NOT_INITIALIZED);
        }
    }

    public static void lifecyclePause() {
        Core core2 = core;
        if (core2 == null) {
            Log.debug(TAG, "Failed to pause lifecycle session (%s)", NULL_CONTEXT_MESSAGE);
        } else {
            core2.lifecyclePause();
        }
    }

    public static void lifecycleStart(Map<String, String> map) {
        Core core2 = core;
        if (core2 == null) {
            Log.debug(TAG, "Failed to start lifecycle session (%s)", NULL_CONTEXT_MESSAGE);
        } else {
            core2.lifecycleStart(map);
        }
    }

    public static void log(LoggingMode loggingMode, String str, String str2) {
        if (loggingMode == null) {
            return;
        }
        int i10 = AnonymousClass2.$SwitchMap$com$adobe$marketing$mobile$LoggingMode[loggingMode.ordinal()];
        if (i10 == 1) {
            Log.error(str, str2, new Object[0]);
            return;
        }
        if (i10 == 2) {
            Log.warning(str, str2, new Object[0]);
        } else if (i10 == 3) {
            Log.debug(str, str2, new Object[0]);
        } else {
            if (i10 != 4) {
                return;
            }
            Log.trace(str, str2, new Object[0]);
        }
    }

    public static void registerEventListener(String str, String str2, AdobeCallbackWithError<Event> adobeCallbackWithError) {
        Core core2 = core;
        if (core2 == null) {
            Log.debug(TAG, "Failed to register the event listener (%s)", NULL_CONTEXT_MESSAGE);
        } else {
            core2.registerEventListener(str, str2, adobeCallbackWithError);
        }
    }

    public static boolean registerExtension(Class<? extends Extension> cls, ExtensionErrorCallback<ExtensionError> extensionErrorCallback) {
        Core core2 = core;
        if (core2 == null) {
            Log.debug(TAG, "Failed to register the extension. (%s)", NULL_CONTEXT_MESSAGE);
            if (extensionErrorCallback != null) {
                extensionErrorCallback.error(ExtensionError.UNEXPECTED_ERROR);
            }
            return false;
        }
        if (cls != null) {
            core2.registerExtension(cls, extensionErrorCallback);
            return true;
        }
        if (extensionErrorCallback != null) {
            extensionErrorCallback.error(ExtensionError.UNEXPECTED_ERROR);
        }
        return false;
    }

    public static void resetIdentities() {
        Core core2 = core;
        if (core2 == null) {
            Log.debug(TAG, "Failed to reset identities (%s)", NULL_CONTEXT_MESSAGE);
        } else {
            core2.resetIdentities();
        }
    }

    public static void setAdvertisingIdentifier(String str) {
        Core core2 = core;
        if (core2 == null) {
            Log.debug(TAG, "Failed to set advertising identifier (%s)", NULL_CONTEXT_MESSAGE);
        } else {
            core2.setAdvertisingIdentifier(str);
        }
    }

    public static void setApplication(Application application) {
        try {
            new Date().toString();
        } catch (AssertionError | Exception unused) {
        }
        App.setApplication(application);
        new V4ToV5Migration().migrate();
        if (core == null) {
            synchronized (mutex) {
                try {
                    if (platformServices == null) {
                        platformServices = new AndroidPlatformServices();
                    }
                    core = new Core(platformServices, "1.11.4");
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        com.adobe.marketing.mobile.internal.context.App.getInstance().initializeApp(new com.adobe.marketing.mobile.internal.context.App.AppContextProvider() { // from class: com.adobe.marketing.mobile.MobileCore.1
            @Override // com.adobe.marketing.mobile.internal.context.App.AppContextProvider
            public Context getAppContext() {
                return App.getAppContext();
            }

            @Override // com.adobe.marketing.mobile.internal.context.App.AppContextProvider
            public Activity getCurrentActivity() {
                return App.getCurrentActivity();
            }
        });
    }

    public static void setCore(Core core2) {
        synchronized (mutex) {
            core = core2;
        }
    }

    public static void setLargeIconResourceID(int i10) {
        App.setLargeIconResourceID(i10);
    }

    public static void setLogLevel(LoggingMode loggingMode) {
        Log.setLogLevel(loggingMode);
    }

    public static void setPlatformServices(PlatformServices platformServices2) {
        synchronized (mutex) {
            platformServices = platformServices2;
        }
    }

    public static void setPrivacyStatus(MobilePrivacyStatus mobilePrivacyStatus) {
        Core core2 = core;
        if (core2 == null) {
            Log.debug(TAG, "Failed to set privacy status (%s)", NULL_CONTEXT_MESSAGE);
        } else {
            core2.setPrivacyStatus(mobilePrivacyStatus);
        }
    }

    public static void setPushIdentifier(String str) {
        Core core2 = core;
        if (core2 == null) {
            Log.debug(TAG, "Failed to set push identifier (%s)", NULL_CONTEXT_MESSAGE);
        } else {
            core2.setPushIdentifier(str);
        }
    }

    public static void setSmallIconResourceID(int i10) {
        App.setSmallIconResourceID(i10);
    }

    public static void setWrapperType(WrapperType wrapperType) {
        Core core2 = core;
        if (core2 == null) {
            Log.warning(TAG, "Cannot set wrapper type, core is null. Make sure setApplication API is called.", new Object[0]);
        } else {
            core2.setWrapperType(wrapperType);
        }
    }

    public static void start(AdobeCallback adobeCallback) {
        synchronized (mutex) {
            try {
                boolean z10 = true;
                if (core == null) {
                    Log.debug(TAG, "Failed to start SDK (%s)", NULL_CONTEXT_MESSAGE);
                    if (adobeCallback == null) {
                        z10 = false;
                    }
                    if ((adobeCallback instanceof AdobeCallbackWithError) & z10) {
                        ((AdobeCallbackWithError) adobeCallback).fail(AdobeError.EXTENSION_NOT_INITIALIZED);
                    }
                    return;
                }
                try {
                    try {
                        if (EventHistoryProvider.getEventHistory() == null) {
                            EventHistoryProvider.setEventHistory(new AndroidEventHistory());
                            Log.trace(TAG, "Android EventHistory created and set in the EventHistoryProvider", new Object[0]);
                        }
                    } catch (EventHistoryDatabaseCreationException e5) {
                        EventHistoryProvider.setEventHistory(null);
                        Log.warning(TAG, "Failed to create the android event history service: %s", e5.getMessage());
                    }
                } catch (Exception e7) {
                    EventHistoryProvider.setEventHistory(null);
                    Log.warning(TAG, "Failed to create the android event history service: %s", e7.getMessage());
                }
                core.start(adobeCallback);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public static void trackAction(String str, Map<String, String> map) {
        Core core2 = core;
        if (core2 == null) {
            Log.debug(TAG, "Failed to track action %s (%s)", str, NULL_CONTEXT_MESSAGE);
        } else {
            core2.trackAction(str, map);
        }
    }

    public static void trackState(String str, Map<String, String> map) {
        Core core2 = core;
        if (core2 == null) {
            Log.debug(TAG, "Failed to track state %s (%s)", str, NULL_CONTEXT_MESSAGE);
        } else {
            core2.trackState(str, map);
        }
    }

    public static void updateConfiguration(Map<String, Object> map) {
        Core core2 = core;
        if (core2 == null) {
            Log.debug(TAG, "Failed to update configuration (%s)", NULL_CONTEXT_MESSAGE);
        } else {
            core2.updateConfiguration(map);
        }
    }

    public static void dispatchEventWithResponseCallback(Event event, AdobeCallbackWithError<Event> adobeCallbackWithError) {
        Core core2 = core;
        if (core2 == null) {
            Log.debug(TAG, "Failed to dispatch event with a response callback. (%s)", NULL_CONTEXT_MESSAGE);
            if (adobeCallbackWithError != null) {
                adobeCallbackWithError.fail(AdobeError.UNEXPECTED_ERROR);
                return;
            }
            return;
        }
        if (event == null) {
            Log.debug(TAG, "Failed to dispatch event with a response callback: the given event is null ", new Object[0]);
            if (adobeCallbackWithError != null) {
                adobeCallbackWithError.fail(AdobeError.UNEXPECTED_ERROR);
                return;
            }
            return;
        }
        if (adobeCallbackWithError == null) {
            Log.warning(TAG, "Failed to dispatch event with a response callback: the given callback (AdobeCallbackWithError) object is null ", new Object[0]);
        } else {
            core2.dispatchEventWithResponseCallback(event, adobeCallbackWithError);
        }
    }
}

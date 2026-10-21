package com.adobe.marketing.mobile;

/* JADX INFO: loaded from: classes2.dex */
public class Lifecycle {
    private static final String EXTENSION_VERSION = "1.0.7";
    private static final String TAG = "Lifecycle";
    private static LifecycleCore lifecycleCore;

    private Lifecycle() {
    }

    public static String extensionVersion() {
        return EXTENSION_VERSION;
    }

    public static void registerExtension() throws InvalidInitException {
        Core core = MobileCore.getCore();
        if (core == null) {
            throw new InvalidInitException();
        }
        try {
            lifecycleCore = new LifecycleCore(core.eventHub, new LifecycleModuleDetails());
        } catch (Exception unused) {
            throw new InvalidInitException();
        }
    }
}

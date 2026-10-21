package com.adobe.marketing.mobile;

/* JADX INFO: loaded from: classes2.dex */
public class Signal {
    private static final String EXTENSION_VERSION = "1.0.2";
    private static SignalCore signalCore;

    private Signal() {
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
            signalCore = new SignalCore(core.eventHub, new SignalModuleDetails());
        } catch (Exception unused) {
            throw new InvalidInitException();
        }
    }
}

package com.adobe.marketing.mobile;

/* JADX INFO: loaded from: classes2.dex */
abstract class InternalModule extends Module {
    private final PlatformServices services;

    public InternalModule(String str, EventHub eventHub, PlatformServices platformServices) {
        super(str, eventHub);
        this.services = platformServices;
    }

    public final PlatformServices getPlatformServices() {
        return this.services;
    }
}

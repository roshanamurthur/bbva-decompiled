package com.adobe.marketing.mobile;

import com.adobe.marketing.mobile.Module;

/* JADX INFO: loaded from: classes2.dex */
abstract class ModuleEventDispatcher<T extends Module> {
    private final EventHub eventHub;
    protected final T parentModule;

    public ModuleEventDispatcher(EventHub eventHub, T t10) {
        this.eventHub = eventHub;
        this.parentModule = t10;
    }

    public final void dispatch(Event event) {
        this.eventHub.dispatch(event);
    }
}

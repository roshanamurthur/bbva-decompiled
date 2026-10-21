package com.adobe.marketing.mobile;

/* JADX INFO: loaded from: classes2.dex */
public abstract class ExtensionListener extends ModuleEventListener<ExtensionApi> {
    private static final String LOG_TAG = "ExtensionListener";

    public ExtensionListener(ExtensionApi extensionApi, String str, String str2) {
        super(extensionApi, EventType.get(str), EventSource.get(str2));
    }

    public Extension getParentExtension() {
        return ((ExtensionApi) this.parentModule).getExtension();
    }

    @Override // com.adobe.marketing.mobile.ModuleEventListener, com.adobe.marketing.mobile.EventListener
    public void onUnregistered() {
        T t10 = this.parentModule;
        Log.debug(t10 != 0 ? ((ExtensionApi) t10).getLogTag() : LOG_TAG, "Extension listener was unregistered successfully", new Object[0]);
    }
}

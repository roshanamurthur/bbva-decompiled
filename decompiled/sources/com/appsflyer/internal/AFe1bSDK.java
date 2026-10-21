package com.appsflyer.internal;

/* JADX INFO: loaded from: classes2.dex */
public final class AFe1bSDK extends AFa1qSDK {
    @Override // com.appsflyer.internal.AFa1qSDK
    public final AFd1vSDK AFInAppEventParameterName() {
        return this.afErrorLog == 1 ? AFd1vSDK.CONVERSION : AFd1vSDK.LAUNCH;
    }

    @Override // com.appsflyer.internal.AFa1qSDK
    public final boolean afRDLog() {
        return true;
    }
}

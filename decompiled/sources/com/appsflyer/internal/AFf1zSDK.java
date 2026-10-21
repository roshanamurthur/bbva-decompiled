package com.appsflyer.internal;

import com.appsflyer.AFInAppEventType;

/* JADX INFO: loaded from: classes2.dex */
public final class AFf1zSDK extends AFe1cSDK {
    public AFf1zSDK() {
        super(AFInAppEventType.PURCHASE, Boolean.TRUE);
    }

    @Override // com.appsflyer.internal.AFa1qSDK
    public final AFd1vSDK AFInAppEventParameterName() {
        return AFd1vSDK.PURCHASE_VALIDATE;
    }

    @Override // com.appsflyer.internal.AFa1qSDK
    public final AFa1qSDK valueOf(String str) {
        return super.valueOf(AFa1qSDK.AFKeystoreWrapper(str));
    }
}

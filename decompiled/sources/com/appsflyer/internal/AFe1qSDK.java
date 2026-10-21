package com.appsflyer.internal;

import android.annotation.SuppressLint;
import android.content.Context;
import com.appsflyer.AppsFlyerLib;

/* JADX INFO: loaded from: classes2.dex */
public final class AFe1qSDK extends AFa1qSDK {
    @SuppressLint({"VisibleForTests"})
    public AFe1qSDK(Context context) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(String.format(AFe1sSDK.AFKeystoreWrapper, AppsFlyerLib.getInstance().getHostPrefix(), AFa1dSDK.valueOf().getHostName()));
        sb2.append(context.getPackageName());
        super("Register", sb2.toString(), Boolean.FALSE);
    }

    @Override // com.appsflyer.internal.AFa1qSDK
    public final AFd1vSDK AFInAppEventParameterName() {
        return AFd1vSDK.REGISTER;
    }

    @Override // com.appsflyer.internal.AFa1qSDK
    public final boolean afInfoLog() {
        return false;
    }
}

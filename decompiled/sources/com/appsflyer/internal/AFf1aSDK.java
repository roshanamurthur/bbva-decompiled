package com.appsflyer.internal;

import com.appsflyer.AppsFlyerLib;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final class AFf1aSDK implements AFg1wSDK {
    @Override // com.appsflyer.internal.AFg1wSDK
    @NotNull
    public final String AFInAppEventParameterName(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        String str2 = String.format(str, AppsFlyerLib.getInstance().getHostPrefix(), AFa1dSDK.valueOf().getHostName());
        Intrinsics.checkNotNullExpressionValue(str2, "");
        return str2;
    }
}

package com.appsflyer.internal;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.appsflyer.attribution.AppsFlyerRequestListener;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class AFd1dSDK extends AFd1nSDK<String> {
    private final Map<String, Object> afInfoLog;

    public AFd1dSDK(@NonNull Map<String, Object> map, @NonNull AFc1zSDK aFc1zSDK) {
        super(AFd1vSDK.MONITORSDK, new AFd1vSDK[]{AFd1vSDK.RC_CDN}, aFc1zSDK, String.valueOf(map.hashCode()));
        this.afInfoLog = new HashMap(map);
    }

    @Override // com.appsflyer.internal.AFd1nSDK
    public final AFc1nSDK<String> AFKeystoreWrapper(@NonNull String str) {
        return ((AFd1nSDK) this).afErrorLog.AFInAppEventParameterName(this.afInfoLog);
    }

    @Override // com.appsflyer.internal.AFd1nSDK
    @Nullable
    public final AppsFlyerRequestListener afDebugLog() {
        return null;
    }

    @Override // com.appsflyer.internal.AFd1nSDK
    public final boolean afRDLog() {
        return false;
    }
}

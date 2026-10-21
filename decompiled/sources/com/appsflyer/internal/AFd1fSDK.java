package com.appsflyer.internal;

import android.util.Base64;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.appsflyer.AFLogger;
import com.appsflyer.attribution.AppsFlyerRequestListener;
import java.net.MalformedURLException;
import java.net.URL;
import mx.openpay.library.domain.util.Constant;

/* JADX INFO: loaded from: classes2.dex */
public final class AFd1fSDK extends AFd1nSDK<String> {
    private final AFe1eSDK afInfoLog;

    public AFd1fSDK(@NonNull AFe1eSDK aFe1eSDK, @NonNull AFc1zSDK aFc1zSDK) {
        AFd1vSDK aFd1vSDK = aFe1eSDK.afWarnLog;
        AFd1vSDK aFd1vSDK2 = aFd1vSDK == null ? AFd1vSDK.CACHED_EVENT : aFd1vSDK;
        AFd1vSDK[] aFd1vSDKArr = {AFd1vSDK.RC_CDN};
        StringBuilder sb2 = new StringBuilder();
        sb2.append(aFe1eSDK.valueOf);
        sb2.append(Constant.DASH_STRING);
        sb2.append(valueOf(aFe1eSDK));
        super(aFd1vSDK2, aFd1vSDKArr, aFc1zSDK, sb2.toString(), aFe1eSDK.valueOf);
        this.afInfoLog = aFe1eSDK;
    }

    private static String valueOf(AFe1eSDK aFe1eSDK) {
        try {
            return new URL(aFe1eSDK.afInfoLog).getHost();
        } catch (MalformedURLException unused) {
            return "";
        }
    }

    @Override // com.appsflyer.internal.AFd1nSDK
    public final AFc1nSDK<String> AFKeystoreWrapper(String str) {
        String strEncodeToString = Base64.encodeToString(this.afInfoLog.valueOf(), 2);
        AFLogger.afInfoLog("cached data: ".concat(String.valueOf(strEncodeToString)));
        ((AFd1nSDK) this).afDebugLog.valueOf(this.afInfoLog.afInfoLog, strEncodeToString);
        return ((AFd1nSDK) this).afErrorLog.values(this.afInfoLog);
    }

    @Override // com.appsflyer.internal.AFd1nSDK
    @Nullable
    public final AppsFlyerRequestListener afDebugLog() {
        return this.afInfoLog.AFInAppEventType;
    }

    @Override // com.appsflyer.internal.AFd1nSDK
    public final boolean afRDLog() {
        return false;
    }
}

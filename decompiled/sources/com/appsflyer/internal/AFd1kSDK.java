package com.appsflyer.internal;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.appsflyer.AppsFlyerLib;
import com.appsflyer.PurchaseHandler;
import com.appsflyer.internal.components.network.http.ResponseNetwork;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class AFd1kSDK extends AFd1qSDK {
    private final AFb1cSDK afInfoLog;

    public AFd1kSDK(@NonNull Map<String, Object> map, @Nullable PurchaseHandler.PurchaseValidationCallback purchaseValidationCallback, @NonNull AFc1zSDK aFc1zSDK) {
        super(AFd1vSDK.PURCHASE_VALIDATE, new AFd1vSDK[]{AFd1vSDK.RC_CDN}, aFc1zSDK, null, map, purchaseValidationCallback);
        this.afInfoLog = aFc1zSDK.AFInAppEventParameterName();
        this.valueOf.add(AFd1vSDK.CONVERSION);
    }

    @Override // com.appsflyer.internal.AFd1nSDK, com.appsflyer.internal.AFd1uSDK
    public final boolean AFInAppEventType() {
        ResponseNetwork responseNetwork = ((AFd1nSDK) this).AFLogger;
        if (responseNetwork == null || responseNetwork.getStatusCode() != 503) {
            return super.AFInAppEventType();
        }
        return true;
    }

    @Override // com.appsflyer.internal.AFd1nSDK
    public final AFc1nSDK<String> AFKeystoreWrapper(@NonNull String str) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(String.format("https://%sviap.%s/api/v1/android/validate_purchase?app_id=", AppsFlyerLib.getInstance().getHostPrefix(), AFa1dSDK.valueOf().getHostName()));
        sb2.append(this.afInfoLog.values.AFInAppEventParameterName.getPackageName());
        String string = sb2.toString();
        String string2 = new JSONObject(AFVersionDeclaration()).toString();
        StringBuilder sb3 = new StringBuilder();
        sb3.append(this);
        sb3.append(": preparing data: ");
        sb3.append(string2);
        AFc1pSDK.AFKeystoreWrapper(sb3.toString());
        ((AFd1nSDK) this).afDebugLog.valueOf(string, string2);
        return ((AFd1nSDK) this).afErrorLog.AFInAppEventParameterName(AFVersionDeclaration(), str);
    }
}

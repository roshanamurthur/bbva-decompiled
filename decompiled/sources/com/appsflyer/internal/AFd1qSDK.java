package com.appsflyer.internal;

import android.content.Context;
import android.os.Build;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.appsflyer.AppsFlyerProperties;
import com.appsflyer.PurchaseHandler;
import com.appsflyer.attribution.AppsFlyerRequestListener;
import com.appsflyer.internal.components.network.http.ResponseNetwork;
import com.bbva.tohu.android.product.valkyria.sdk.services.impl.BackendServiceDefaultImpl;
import com.salesforce.marketingcloud.storage.db.k;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public abstract class AFd1qSDK extends AFd1nSDK<String> {

    @NonNull
    private final Map<String, Object> AFLogger$LogLevel;

    @Nullable
    private final PurchaseHandler.PurchaseValidationCallback AFVersionDeclaration;
    private final AFb1fSDK afErrorLogForExcManagerOnly;
    private final AFb1cSDK afInfoLog;

    public AFd1qSDK(@NonNull AFd1vSDK aFd1vSDK, @NonNull AFd1vSDK[] aFd1vSDKArr, @NonNull AFc1zSDK aFc1zSDK, @Nullable String str, Map<String, Object> map, @Nullable PurchaseHandler.PurchaseValidationCallback purchaseValidationCallback) {
        super(aFd1vSDK, aFd1vSDKArr, aFc1zSDK, str);
        AFb1cSDK aFb1cSDKAFInAppEventParameterName = aFc1zSDK.AFInAppEventParameterName();
        this.afInfoLog = aFb1cSDKAFInAppEventParameterName;
        AFb1fSDK aFb1fSDKAFKeystoreWrapper = aFc1zSDK.AFKeystoreWrapper();
        this.afErrorLogForExcManagerOnly = aFb1fSDKAFKeystoreWrapper;
        HashMap map2 = new HashMap(new HashMap(map));
        map2.put("app_id", aFb1cSDKAFInAppEventParameterName.values.AFInAppEventParameterName.getPackageName());
        String strValues = AFb1cSDK.values();
        if (strValues != null) {
            map2.put("cuid", strValues);
        }
        Context context = aFb1cSDKAFInAppEventParameterName.values.AFInAppEventParameterName;
        map2.put("app_version_name", AFa1cSDK.AFInAppEventParameterName(context, context.getPackageName()));
        HashMap map3 = new HashMap();
        AFc1uSDK.AFa1wSDK aFa1wSDKValueOf = AFa1bSDK.valueOf(aFb1cSDKAFInAppEventParameterName.values.AFInAppEventParameterName, new HashMap());
        String str2 = aFa1wSDKValueOf != null ? aFa1wSDKValueOf.AFInAppEventParameterName : null;
        if (!AFb1vSDK.AFInAppEventParameterName(str2)) {
            map3.put("advertising_id", str2);
        }
        AFc1uSDK.AFa1wSDK aFa1wSDKValues = AFa1bSDK.values(aFb1cSDKAFInAppEventParameterName.values.AFInAppEventParameterName.getContentResolver());
        String str3 = aFa1wSDKValues != null ? aFa1wSDKValues.AFInAppEventParameterName : null;
        if (!AFb1vSDK.AFInAppEventParameterName(str3)) {
            map3.put("oaid", str3);
        }
        AFc1uSDK.AFa1wSDK aFa1wSDKValues2 = AFa1bSDK.values(aFb1cSDKAFInAppEventParameterName.values.AFInAppEventParameterName.getContentResolver());
        String str4 = aFa1wSDKValues2 != null ? aFa1wSDKValues2.AFInAppEventParameterName : null;
        if (!AFb1vSDK.AFInAppEventParameterName(str4)) {
            map3.put("amazon_aid", str4);
        }
        if (!AppsFlyerProperties.getInstance().getBoolean(AppsFlyerProperties.DEVICE_TRACKING_DISABLED, false)) {
            String strAFInAppEventType = ((AFd1nSDK) this).afRDLog.AFInAppEventType(aFb1fSDKAFKeystoreWrapper);
            if (!AFb1vSDK.AFInAppEventParameterName(strAFInAppEventType)) {
                map3.put("imei", strAFInAppEventType);
            }
        }
        map3.put("appsflyer_id", AFa1aSDK.AFInAppEventParameterName(aFb1cSDKAFInAppEventParameterName.values, aFb1cSDKAFInAppEventParameterName.AFInAppEventType));
        StringBuilder sb2 = new StringBuilder();
        sb2.append(Build.VERSION.SDK_INT);
        map3.put(BackendServiceDefaultImpl.OS_VERSION_HEADER, sb2.toString());
        map3.put(k.a.f65050r, AFa1dSDK.AFKeystoreWrapper);
        map2.put("device_data", map3);
        this.AFLogger$LogLevel = map2;
        this.AFVersionDeclaration = purchaseValidationCallback;
    }

    @NonNull
    public final Map<String, Object> AFVersionDeclaration() {
        return this.AFLogger$LogLevel;
    }

    @Override // com.appsflyer.internal.AFd1nSDK
    @Nullable
    public final AppsFlyerRequestListener afDebugLog() {
        return null;
    }

    @Override // com.appsflyer.internal.AFd1nSDK
    public final boolean afRDLog() {
        return true;
    }

    @Override // com.appsflyer.internal.AFd1nSDK, com.appsflyer.internal.AFd1uSDK
    public final void valueOf() {
        PurchaseHandler.PurchaseValidationCallback purchaseValidationCallback;
        PurchaseHandler.PurchaseValidationCallback purchaseValidationCallback2;
        super.valueOf();
        Throwable thAfInfoLog = afInfoLog();
        if (thAfInfoLog != null && (purchaseValidationCallback2 = this.AFVersionDeclaration) != null) {
            purchaseValidationCallback2.onFailure(thAfInfoLog);
        }
        ResponseNetwork<String> responseNetwork = ((AFd1nSDK) this).AFLogger;
        if (responseNetwork == null || (purchaseValidationCallback = this.AFVersionDeclaration) == null) {
            return;
        }
        purchaseValidationCallback.onResponse(responseNetwork);
    }
}

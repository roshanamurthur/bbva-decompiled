package com.appsflyer;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.appsflyer.internal.AFb1cSDK;
import com.appsflyer.internal.AFb1zSDK;
import com.appsflyer.internal.AFc1zSDK;
import com.appsflyer.internal.AFd1tSDK;
import com.appsflyer.internal.components.network.http.ResponseNetwork;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class PurchaseHandler {

    @NonNull
    public final AFd1tSDK AFInAppEventParameterName;

    @NonNull
    public final AFc1zSDK valueOf;

    @NonNull
    private final AFb1cSDK values;

    public interface PurchaseValidationCallback {
        void onFailure(@NonNull Throwable th2);

        void onResponse(@NonNull ResponseNetwork<String> responseNetwork);
    }

    public PurchaseHandler(@NonNull AFc1zSDK aFc1zSDK) {
        this.valueOf = aFc1zSDK;
        this.values = aFc1zSDK.AFInAppEventParameterName();
        this.AFInAppEventParameterName = aFc1zSDK.getLevel();
    }

    public final boolean AFInAppEventParameterName(Map<String, Object> map, @Nullable PurchaseValidationCallback purchaseValidationCallback, String... strArr) {
        boolean zValueOf = AFb1zSDK.valueOf(map, strArr, this.values);
        if (!zValueOf && purchaseValidationCallback != null) {
            purchaseValidationCallback.onFailure(new IllegalArgumentException("Invalid Request Data"));
        }
        return zValueOf;
    }
}

package com.appsflyer.internal;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.appsflyer.PurchaseHandler;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class AFd1pSDK extends AFd1qSDK {
    public AFd1pSDK(@NonNull Map<String, Object> map, @Nullable PurchaseHandler.PurchaseValidationCallback purchaseValidationCallback, @NonNull AFc1zSDK aFc1zSDK) {
        super(AFd1vSDK.ARS_VALIDATE, new AFd1vSDK[]{AFd1vSDK.RC_CDN}, aFc1zSDK, null, map, purchaseValidationCallback);
        this.valueOf.add(AFd1vSDK.CONVERSION);
    }

    @Override // com.appsflyer.internal.AFd1nSDK
    public final AFc1nSDK<String> AFKeystoreWrapper(@NonNull String str) {
        return ((AFd1nSDK) this).afErrorLog.values(AFVersionDeclaration(), str);
    }
}

package com.huawei.hms.feature.dynamicinstall.installer;

import android.os.Build;
import com.bbva.tohu.android.product.valkyria.sdk.constants.TransactionType;

/* JADX INFO: loaded from: classes10.dex */
public class FeatureCompatVersionApiFactory {
    public static IFeatureEmulatedInstall createDynamicInstaller() {
        int i10 = Build.VERSION.SDK_INT;
        if (Build.VERSION.PREVIEW_SDK_INT != 0) {
            if (i10 == 27) {
                return new c();
            }
            if (i10 == 28) {
                return new c();
            }
        }
        switch (i10) {
            case 23:
            case 24:
            case 25:
                return new b();
            case 26:
            case 27:
                return new c();
            case 28:
                return !Build.VERSION.CODENAME.equalsIgnoreCase(TransactionType.TRANSACTION_TYPE_CONTACTLESS_CODE) ? new c() : new c();
            default:
                return new c();
        }
    }
}

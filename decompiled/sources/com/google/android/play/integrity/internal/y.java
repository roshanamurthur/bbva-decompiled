package com.google.android.play.integrity.internal;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.os.Build;
import com.bbva.ethermobilesdk.devicechecker.root.service.RootService;

/* JADX INFO: compiled from: com.google.android.play:integrity@@1.1.0 */
/* JADX INFO: loaded from: classes10.dex */
public final class y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final k f46399a = new k("PhoneskyVerificationUtils");

    public static boolean a(Context context) {
        try {
            if (context.getPackageManager().getApplicationInfo("com.android.vending", 0).enabled) {
                Signature[] signatureArr = context.getPackageManager().getPackageInfo("com.android.vending", 64).signatures;
                if (signatureArr == null || (signatureArr.length) == 0) {
                    f46399a.e("Phonesky package is not signed -- possibly self-built package. Could not verify.", new Object[0]);
                } else {
                    for (Signature signature : signatureArr) {
                        String strA = x.a(signature.toByteArray());
                        if ("8P1sW0EPJcslw7UzRsiXL64w-O50Ed-RBICtay1g24M".equals(strA)) {
                            return true;
                        }
                        String str = Build.TAGS;
                        if ((str.contains("dev-keys") || str.contains(RootService.TEST_KEYS)) && "GXWy8XF3vIml3_MfnmSmyuKBpT3B0dWbHRR_4cgq-gA".equals(strA)) {
                            return true;
                        }
                    }
                }
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
        return false;
    }
}

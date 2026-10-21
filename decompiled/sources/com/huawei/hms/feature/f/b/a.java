package com.huawei.hms.feature.f.b;

import android.util.Base64;
import com.huawei.hms.feature.utils.Logger;

/* JADX INFO: loaded from: classes10.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f50271a = "Base64";

    public static String a(byte[] bArr) {
        if (bArr == null) {
            return "";
        }
        try {
            String strEncodeToString = Base64.encodeToString(bArr, 2);
            return strEncodeToString != null ? strEncodeToString : "";
        } catch (AssertionError e5) {
            Logger.e(f50271a, "An exception occurred while encoding with Base64,AssertionError:", e5);
            return "";
        }
    }

    public static byte[] a(String str) {
        if (str != null) {
            try {
                byte[] bArrDecode = Base64.decode(str, 2);
                if (bArrDecode != null) {
                    return bArrDecode;
                }
            } catch (IllegalArgumentException e5) {
                Logger.e(f50271a, "Decoding with Base64 IllegalArgumentException:", e5);
            }
        }
        return new byte[0];
    }
}

package com.huawei.appgallery.serviceverifykit.d;

import com.bbva.tohu.android.product.valkyria.sdk.payments.paywave.Constants;

/* JADX INFO: loaded from: classes10.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final char[] f50128a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final char[] f50129b = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    public static char[] a(byte[] bArr, boolean z10) {
        return a(bArr, z10 ? f50129b : f50128a);
    }

    public static String b(byte[] bArr, boolean z10) {
        return new String(a(bArr, z10));
    }

    private static char[] a(byte[] bArr, char[] cArr) {
        char[] cArr2 = new char[bArr.length << 1];
        int i10 = 0;
        for (byte b10 : bArr) {
            int i11 = i10 + 1;
            cArr2[i10] = cArr[(b10 & Constants.CVR_B2b8765_1111_APP_DISABLED) >>> 4];
            i10 += 2;
            cArr2[i11] = cArr[b10 & 15];
        }
        return cArr2;
    }
}

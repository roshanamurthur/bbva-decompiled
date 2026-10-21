package com.facetec.sdk;

import androidx.webkit.ProxyConfig;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes9.dex */
public final class mw {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final AtomicBoolean f42640d = new AtomicBoolean(false);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final CountDownLatch f42641g = new CountDownLatch(1);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private byte[] f42642i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private byte[] f42643j;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final byte[] f42638c = {42};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String[] f42637b = new String[0];

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String[] f42636a = {ProxyConfig.MATCH_ALL_SCHEMES};

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final mw f42639e = new mw();

    public static mw b() {
        return f42639e;
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0013, code lost:
    
        r3 = com.facetec.sdk.mw.class.getResourceAsStream(okhttp3.internal.publicsuffix.PublicSuffixDatabase.PUBLIC_SUFFIX_RESOURCE);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String[] b(java.lang.String[] r9) {
        /*
            Method dump skipped, instruction units count: 292
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facetec.sdk.mw.b(java.lang.String[]):java.lang.String[]");
    }

    private static String b(byte[] bArr, byte[][] bArr2, int i10) {
        int i11;
        boolean z10;
        int i12;
        int i13;
        int length = bArr.length;
        int i14 = 0;
        while (i14 < length) {
            int i15 = (i14 + length) / 2;
            while (i15 >= 0 && bArr[i15] != 10) {
                i15--;
            }
            int i16 = i15 + 1;
            int i17 = 1;
            while (true) {
                i11 = i16 + i17;
                if (bArr[i11] == 10) {
                    break;
                }
                i17++;
            }
            int i18 = i11 - i16;
            int i19 = i10;
            boolean z11 = false;
            int i20 = 0;
            int i21 = 0;
            while (true) {
                if (z11) {
                    i12 = 46;
                    z10 = false;
                } else {
                    z10 = z11;
                    i12 = bArr2[i19][i20] & 255;
                }
                i13 = i12 - (bArr[i16 + i21] & 255);
                if (i13 != 0) {
                    break;
                }
                i21++;
                i20++;
                if (i21 == i18) {
                    break;
                }
                if (bArr2[i19].length != i20) {
                    z11 = z10;
                } else {
                    if (i19 == bArr2.length - 1) {
                        break;
                    }
                    i19++;
                    i20 = -1;
                    z11 = true;
                }
            }
            if (i13 >= 0) {
                if (i13 <= 0) {
                    int i22 = i18 - i21;
                    int length2 = bArr2[i19].length - i20;
                    while (true) {
                        i19++;
                        if (i19 >= bArr2.length) {
                            break;
                        }
                        length2 += bArr2[i19].length;
                    }
                    if (length2 >= i22) {
                        if (length2 <= i22) {
                            return new String(bArr, i16, i18, kz.f42210e);
                        }
                    }
                }
                i14 = i11 + 1;
            }
            length = i15;
        }
        return null;
    }
}

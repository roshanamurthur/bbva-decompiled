package com.google.crypto.tink.subtle;

import com.bbva.tohu.android.product.valkyria.sdk.payments.paywave.Constants;
import com.mastercard.mpsdk.mcbp.mcmlite.apdu.emv.GenerateAcResponseApdu;
import com.veridas.Veridas;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;

/* JADX INFO: loaded from: classes10.dex */
public final class Base64 {
    public static final int CRLF = 4;
    public static final int DEFAULT = 0;
    public static final int NO_CLOSE = 16;
    public static final int NO_PADDING = 1;
    public static final int NO_WRAP = 2;
    public static final int URL_SAFE = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Charset f47425a = Charset.forName("UTF-8");

    public static abstract class a {
    }

    public static class b extends a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final int[] f47426a = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 62, -1, -1, -1, 63, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, -1, -1, -1, -2, -1, -1, -1, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, -1, -1, -1, -1, -1, -1, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1};

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final int[] f47427b = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 62, -1, -1, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, -1, -1, -1, -2, -1, -1, -1, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, -1, -1, -1, -1, 63, -1, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1};
    }

    public static class c extends a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final byte[] f47428a = {65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, Constants.CVR_B1b85_0101_MOBILE_APP, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, Constants.DIRECTORY_ENTRY, 98, 99, 100, 101, 102, 103, 104, 105, GenerateAcResponseApdu.DDA_HEADER, 107, 108, 109, 110, Constants.FCI_TEMPLATE, Constants.CVR_B1b85_0111_VERIFIED_CLOUD, 113, 114, 115, 116, 117, 118, Constants.RESP_MSG_TEMPLATE_FORMAT_2, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 43, 47};

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final byte[] f47429b = {65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, Constants.CVR_B1b85_0101_MOBILE_APP, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, Constants.DIRECTORY_ENTRY, 98, 99, 100, 101, 102, 103, 104, 105, GenerateAcResponseApdu.DDA_HEADER, 107, 108, 109, 110, Constants.FCI_TEMPLATE, Constants.CVR_B1b85_0111_VERIFIED_CLOUD, 113, 114, 115, 116, 117, 118, Constants.RESP_MSG_TEMPLATE_FORMAT_2, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 45, Constants.STATE_ERROR};
    }

    public static byte[] decode(String str) {
        return decode(str, 2);
    }

    public static String encode(byte[] bArr) {
        return encodeToString(bArr, 2);
    }

    public static String encodeToString(byte[] bArr, int i10) {
        try {
            return new String(encode(bArr, i10), Veridas.US_ASCII);
        } catch (UnsupportedEncodingException e5) {
            throw new AssertionError(e5);
        }
    }

    public static byte[] urlSafeDecode(String str) {
        return decode(str, 11);
    }

    public static String urlSafeEncode(byte[] bArr) {
        return encodeToString(bArr, 11);
    }

    public static byte[] decode(String str, int i10) {
        return decode(str.getBytes(f47425a), i10);
    }

    public static byte[] encode(byte[] bArr, int i10) {
        return encode(bArr, 0, bArr.length, i10);
    }

    public static byte[] decode(byte[] bArr, int i10) {
        return decode(bArr, 0, bArr.length, i10);
    }

    public static byte[] encode(byte[] bArr, int i10, int i11, int i12) {
        boolean z10 = (i12 & 1) == 0;
        boolean z11 = (i12 & 2) == 0;
        boolean z12 = (i12 & 4) != 0;
        byte[] bArr2 = (i12 & 8) == 0 ? c.f47428a : c.f47429b;
        int i13 = z11 ? 19 : -1;
        int iA = (i11 / 3) * 4;
        if (z10) {
            if (i11 % 3 > 0) {
                iA += 4;
            }
        } else {
            int i14 = i11 % 3;
            if (i14 == 1) {
                iA += 2;
            } else if (i14 == 2) {
                iA += 3;
            }
        }
        if (z11 && i11 > 0) {
            iA += androidx.appcompat.widget.a.a(i11, 1, 57, 1) * (z12 ? 2 : 1);
        }
        byte[] bArr3 = new byte[iA];
        int i15 = i11 + i10;
        int i16 = i13;
        int i17 = 0;
        int i18 = i10;
        while (true) {
            int i19 = i18 + 3;
            if (i19 > i15) {
                break;
            }
            int i20 = (bArr[i18 + 2] & 255) | ((bArr[i18] & 255) << 16) | ((bArr[i18 + 1] & 255) << 8);
            bArr3[i17] = bArr2[(i20 >> 18) & 63];
            bArr3[i17 + 1] = bArr2[(i20 >> 12) & 63];
            bArr3[i17 + 2] = bArr2[(i20 >> 6) & 63];
            bArr3[i17 + 3] = bArr2[i20 & 63];
            int i21 = i17 + 4;
            i16--;
            if (i16 == 0) {
                if (z12) {
                    bArr3[i21] = 13;
                    i21 = i17 + 5;
                }
                i17 = i21 + 1;
                bArr3[i21] = 10;
                i16 = 19;
            } else {
                i17 = i21;
            }
            i18 = i19;
        }
        int i22 = i18 + 0;
        if (i22 == i15 - 1) {
            int i23 = (bArr[i18] & 255) << 4;
            bArr3[i17] = bArr2[(i23 >> 6) & 63];
            int i24 = i17 + 2;
            bArr3[i17 + 1] = bArr2[i23 & 63];
            if (z10) {
                bArr3[i24] = kotlin.io.encoding.Base64.padSymbol;
                i24 = i17 + 4;
                bArr3[i17 + 3] = kotlin.io.encoding.Base64.padSymbol;
            }
            if (z11) {
                if (z12) {
                    bArr3[i24] = 13;
                    i24++;
                }
                bArr3[i24] = 10;
            }
        } else if (i22 == i15 - 2) {
            int i25 = ((bArr[i18 + 1] & 255) << 2) | ((bArr[i18] & 255) << 10);
            bArr3[i17] = bArr2[(i25 >> 12) & 63];
            bArr3[i17 + 1] = bArr2[(i25 >> 6) & 63];
            int i26 = i17 + 3;
            bArr3[i17 + 2] = bArr2[i25 & 63];
            if (z10) {
                bArr3[i26] = kotlin.io.encoding.Base64.padSymbol;
                i26 = i17 + 4;
            }
            if (z11) {
                if (z12) {
                    bArr3[i26] = 13;
                    i26++;
                }
                bArr3[i26] = 10;
            }
        } else if (z11 && i17 > 0 && i16 != 19) {
            if (z12) {
                bArr3[i17] = 13;
                i17++;
            }
            bArr3[i17] = 10;
        }
        return bArr3;
    }

    public static String encodeToString(byte[] bArr, int i10, int i11, int i12) {
        try {
            return new String(encode(bArr, i10, i11, i12), Veridas.US_ASCII);
        } catch (UnsupportedEncodingException e5) {
            throw new AssertionError(e5);
        }
    }

    /* JADX WARN: Code duplicated, block: B:40:0x00b9  */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x00e3, code lost:
    
        if (r3 != 4) goto L61;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static byte[] decode(byte[] r11, int r12, int r13, int r14) {
        /*
            Method dump skipped, instruction units count: 271
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.crypto.tink.subtle.Base64.decode(byte[], int, int, int):byte[]");
    }
}

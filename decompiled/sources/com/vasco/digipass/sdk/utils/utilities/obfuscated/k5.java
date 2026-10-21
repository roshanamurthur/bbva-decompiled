package com.vasco.digipass.sdk.utils.utilities.obfuscated;

import com.bbva.ethermobilesdk.devicechecker.root.service.RootService;
import com.bbva.tohu.android.product.valkyria.sdk.payments.paywave.Constants;
import com.fasterxml.jackson.core.base.GeneratorBase;
import java.security.AccessController;
import java.security.PrivilegedAction;

/* JADX INFO: loaded from: classes9.dex */
public final class k5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static String f66170a;

    public class a implements PrivilegedAction<String> {
        @Override // java.security.PrivilegedAction
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public String run() {
            return System.getProperty("line.separator");
        }
    }

    static {
        try {
            try {
                f66170a = (String) AccessController.doPrivileged(new a());
            } catch (Exception unused) {
                f66170a = String.format("%n", new Object[0]);
            }
        } catch (Exception unused2) {
            f66170a = RootService.LINE_BREAK;
        }
    }

    public static String a(String str) {
        char[] charArray = str.toCharArray();
        boolean z10 = false;
        for (int i10 = 0; i10 != charArray.length; i10++) {
            char c10 = charArray[i10];
            if ('A' <= c10 && 'Z' >= c10) {
                charArray[i10] = (char) (c10 + ' ');
                z10 = true;
            }
        }
        return z10 ? new String(charArray) : str;
    }

    public static String b(String str) {
        char[] charArray = str.toCharArray();
        boolean z10 = false;
        for (int i10 = 0; i10 != charArray.length; i10++) {
            char c10 = charArray[i10];
            if ('a' <= c10 && 'z' >= c10) {
                charArray[i10] = (char) (c10 - ' ');
                z10 = true;
            }
        }
        return z10 ? new String(charArray) : str;
    }

    public static String c(byte[] bArr) {
        char c10;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        while (i11 < bArr.length) {
            int i13 = i12 + 1;
            byte b10 = bArr[i11];
            if ((b10 & Constants.CVR_B2b8765_1111_APP_DISABLED) == 240) {
                i12 += 2;
                i11 += 4;
            } else {
                if ((b10 & 224) == 224) {
                    i11 += 3;
                } else {
                    i11 = (b10 & Constants.CVR_B2b87_11_RFU) == 192 ? i11 + 2 : i11 + 1;
                }
                i12 = i13;
            }
        }
        char[] cArr = new char[i12];
        int i14 = 0;
        while (i10 < bArr.length) {
            byte b11 = bArr[i10];
            if ((b11 & Constants.CVR_B2b8765_1111_APP_DISABLED) == 240) {
                int i15 = (((((b11 & 3) << 18) | ((bArr[i10 + 1] & 63) << 12)) | ((bArr[i10 + 2] & 63) << 6)) | (bArr[i10 + 3] & 63)) - 65536;
                char c11 = (char) ((i15 >> 10) | GeneratorBase.SURR1_FIRST);
                c10 = (char) ((i15 & 1023) | 56320);
                cArr[i14] = c11;
                i10 += 4;
                i14++;
            } else if ((b11 & 224) == 224) {
                c10 = (char) (((b11 & 15) << 12) | ((bArr[i10 + 1] & 63) << 6) | (bArr[i10 + 2] & 63));
                i10 += 3;
            } else if ((b11 & 208) == 208 || (b11 & Constants.CVR_B2b87_11_RFU) == 192) {
                int i16 = (b11 & 31) << 6;
                byte b12 = bArr[i10 + 1];
                c10 = (char) (i16 | (b12 & 63));
                i10 += 2;
            } else {
                c10 = (char) (b11 & 255);
                i10++;
            }
            cArr[i14] = c10;
            i14++;
        }
        return new String(cArr);
    }

    public static char[] a(byte[] bArr) {
        int length = bArr.length;
        char[] cArr = new char[length];
        for (int i10 = 0; i10 != length; i10++) {
            cArr[i10] = (char) (bArr[i10] & 255);
        }
        return cArr;
    }

    public static String b(byte[] bArr) {
        return new String(a(bArr));
    }

    public static String a() {
        return f66170a;
    }
}

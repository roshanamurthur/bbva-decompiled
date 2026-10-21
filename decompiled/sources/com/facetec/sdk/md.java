package com.facetec.sdk;

import java.io.IOException;
import mx.openpay.library.data.util.CommandConstants;

/* JADX INFO: loaded from: classes9.dex */
public final class md {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static final nj f42459a = nj.c("PRI * HTTP/2.0\r\n\r\nSM\r\n\r\n");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final String[] f42461d = {"DATA", "HEADERS", "PRIORITY", "RST_STREAM", "SETTINGS", "PUSH_PROMISE", "PING", "GOAWAY", "WINDOW_UPDATE", "CONTINUATION"};

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static String[] f42462e = new String[64];

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static String[] f42460b = new String[256];

    static {
        int i10 = 0;
        int i11 = 0;
        while (true) {
            String[] strArr = f42460b;
            if (i11 >= strArr.length) {
                break;
            }
            strArr[i11] = kz.e("%8s", Integer.toBinaryString(i11)).replace(' ', '0');
            i11++;
        }
        String[] strArr2 = f42462e;
        strArr2[0] = "";
        strArr2[1] = "END_STREAM";
        int[] iArr = {1};
        strArr2[8] = "PADDED";
        for (int i12 = 0; i12 <= 0; i12++) {
            int i13 = iArr[i12];
            StringBuilder sb2 = new StringBuilder();
            sb2.append(f42462e[i13]);
            sb2.append("|PADDED");
            f42462e[i13 | 8] = sb2.toString();
        }
        String[] strArr3 = f42462e;
        strArr3[4] = "END_HEADERS";
        strArr3[32] = "PRIORITY";
        strArr3[36] = "END_HEADERS|PRIORITY";
        int[] iArr2 = {4, 32, 36};
        for (int i14 = 0; i14 < 3; i14++) {
            int i15 = iArr2[i14];
            for (int i16 = 0; i16 <= 0; i16++) {
                int i17 = iArr[i16];
                String[] strArr4 = f42462e;
                int i18 = i17 | i15;
                StringBuilder sb3 = new StringBuilder();
                sb3.append(f42462e[i17]);
                sb3.append('|');
                sb3.append(f42462e[i15]);
                strArr4[i18] = sb3.toString();
                StringBuilder sb4 = new StringBuilder();
                sb4.append(f42462e[i17]);
                sb4.append('|');
                sb4.append(f42462e[i15]);
                sb4.append("|PADDED");
                f42462e[i18 | 8] = sb4.toString();
            }
        }
        while (true) {
            String[] strArr5 = f42462e;
            if (i10 >= strArr5.length) {
                return;
            }
            if (strArr5[i10] == null) {
                strArr5[i10] = f42460b[i10];
            }
            i10++;
        }
    }

    private md() {
    }

    public static IllegalArgumentException d(String str, Object... objArr) {
        throw new IllegalArgumentException(kz.e(str, objArr));
    }

    public static IOException e(String str, Object... objArr) throws IOException {
        throw new IOException(kz.e(str, objArr));
    }

    /* JADX WARN: Code duplicated, block: B:34:0x0067  */
    public static String e(boolean z10, int i10, int i11, byte b10, byte b11) {
        String strReplace;
        String[] strArr = f42461d;
        String strE = b10 < strArr.length ? strArr[b10] : kz.e("0x%02x", Byte.valueOf(b10));
        if (b11 == 0) {
            strReplace = "";
        } else if (b10 == 2 || b10 == 3) {
            strReplace = f42460b[b11];
        } else if (b10 == 4 || b10 == 6) {
            strReplace = b11 == 1 ? CommandConstants.COMMAND_ACK : f42460b[b11];
        } else if (b10 == 7 || b10 == 8) {
            strReplace = f42460b[b11];
        } else {
            String[] strArr2 = f42462e;
            String str = b11 < strArr2.length ? strArr2[b11] : f42460b[b11];
            if (b10 != 5 || (b11 & 4) == 0) {
                strReplace = (b10 != 0 || (b11 & 32) == 0) ? str : str.replace("PRIORITY", "COMPRESSED");
            } else {
                strReplace = str.replace("HEADERS", "PUSH_PROMISE");
            }
        }
        Object[] objArr = new Object[5];
        objArr[0] = z10 ? "<<" : ">>";
        objArr[1] = Integer.valueOf(i10);
        objArr[2] = Integer.valueOf(i11);
        objArr[3] = strE;
        objArr[4] = strReplace;
        return kz.e("%s 0x%08x %5d %-13s %s", objArr);
    }
}

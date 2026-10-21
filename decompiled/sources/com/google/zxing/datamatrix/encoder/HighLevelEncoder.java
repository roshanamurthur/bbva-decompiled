package com.google.zxing.datamatrix.encoder;

import androidx.datastore.preferences.protobuf.s0;
import bh.a;
import bh.c;
import bh.d;
import bh.e;
import bh.f;
import com.bbva.ethermobilesdk.devicechecker.root.service.RootService;
import com.google.android.play.core.splitinstall.internal.h;
import com.google.zxing.Dimension;
import java.util.Arrays;
import tc.g;

/* JADX INFO: loaded from: classes10.dex */
public final class HighLevelEncoder {
    public static int a(float[] fArr, int[] iArr, byte[] bArr) {
        Arrays.fill(bArr, (byte) 0);
        int i10 = Integer.MAX_VALUE;
        for (int i11 = 0; i11 < 6; i11++) {
            int iCeil = (int) Math.ceil(fArr[i11]);
            iArr[i11] = iCeil;
            if (i10 > iCeil) {
                Arrays.fill(bArr, (byte) 0);
                i10 = iCeil;
            }
            if (i10 == iCeil) {
                bArr[i11] = (byte) (bArr[i11] + 1);
            }
        }
        return i10;
    }

    public static void b(char c10) {
        String hexString = Integer.toHexString(c10);
        throw new IllegalArgumentException("Illegal character: " + c10 + " (0x" + ("0000".substring(0, 4 - hexString.length()) + hexString) + RootService.CLOSE_BRACKET);
    }

    public static boolean c(char c10) {
        return c10 >= '0' && c10 <= '9';
    }

    public static boolean d(char c10) {
        return c10 >= 128 && c10 <= 255;
    }

    public static int determineConsecutiveDigitCount(CharSequence charSequence, int i10) {
        int length = charSequence.length();
        int i11 = 0;
        if (i10 < length) {
            char cCharAt = charSequence.charAt(i10);
            while (c(cCharAt) && i10 < length) {
                i11++;
                i10++;
                if (i10 < length) {
                    cCharAt = charSequence.charAt(i10);
                }
            }
        }
        return i11;
    }

    public static boolean e(char c10) {
        if (c10 == '\r' || c10 == '*' || c10 == '>' || c10 == ' ') {
            return true;
        }
        if (c10 < '0' || c10 > '9') {
            return c10 >= 'A' && c10 <= 'Z';
        }
        return true;
    }

    public static String encodeHighLevel(String str) {
        return encodeHighLevel(str, SymbolShapeHint.FORCE_NONE, null, null);
    }

    public static int f(String str, int i10, int i11) {
        float[] fArr;
        int i12;
        if (i10 >= str.length()) {
            return i11;
        }
        int i13 = 6;
        if (i11 == 0) {
            fArr = new float[]{0.0f, 1.0f, 1.0f, 1.0f, 1.0f, 1.25f};
        } else {
            fArr = new float[]{1.0f, 2.0f, 2.0f, 2.0f, 2.0f, 2.25f};
            fArr[i11] = 0.0f;
        }
        int i14 = 0;
        int i15 = 0;
        while (true) {
            int i16 = i10 + i15;
            if (i16 == str.length()) {
                byte[] bArr = new byte[i13];
                int[] iArr = new int[i13];
                int iA = a(fArr, iArr, bArr);
                int i17 = i14;
                int i18 = i17;
                while (i17 < i13) {
                    i18 += bArr[i17];
                    i17++;
                }
                if (iArr[i14] == iA) {
                    return i14;
                }
                if (i18 == 1 && bArr[5] > 0) {
                    return 5;
                }
                if (i18 == 1 && bArr[4] > 0) {
                    return 4;
                }
                if (i18 != 1 || bArr[2] <= 0) {
                    return (i18 != 1 || bArr[3] <= 0) ? 1 : 3;
                }
                return 2;
            }
            char cCharAt = str.charAt(i16);
            i15++;
            if (c(cCharAt)) {
                fArr[i14] = fArr[i14] + 0.5f;
            } else if (d(cCharAt)) {
                float fCeil = (float) Math.ceil(fArr[i14]);
                fArr[i14] = fCeil;
                fArr[i14] = fCeil + 2.0f;
            } else {
                float fCeil2 = (float) Math.ceil(fArr[i14]);
                fArr[i14] = fCeil2;
                fArr[i14] = fCeil2 + 1.0f;
            }
            if (cCharAt == ' ' || ((cCharAt >= '0' && cCharAt <= '9') || (cCharAt >= 'A' && cCharAt <= 'Z'))) {
                fArr[1] = fArr[1] + 0.6666667f;
            } else if (d(cCharAt)) {
                fArr[1] = fArr[1] + 2.6666667f;
            } else {
                fArr[1] = fArr[1] + 1.3333334f;
            }
            if (cCharAt == ' ' || ((cCharAt >= '0' && cCharAt <= '9') || (cCharAt >= 'a' && cCharAt <= 'z'))) {
                fArr[2] = fArr[2] + 0.6666667f;
            } else if (d(cCharAt)) {
                fArr[2] = fArr[2] + 2.6666667f;
            } else {
                fArr[2] = fArr[2] + 1.3333334f;
            }
            if (e(cCharAt)) {
                fArr[3] = fArr[3] + 0.6666667f;
            } else if (d(cCharAt)) {
                fArr[3] = fArr[3] + 4.3333335f;
            } else {
                fArr[3] = fArr[3] + 3.3333333f;
            }
            if (cCharAt >= ' ' && cCharAt <= '^') {
                fArr[4] = fArr[4] + 0.75f;
            } else if (d(cCharAt)) {
                fArr[4] = fArr[4] + 4.25f;
            } else {
                fArr[4] = fArr[4] + 3.25f;
            }
            fArr[5] = fArr[5] + 1.0f;
            if (i15 >= 4) {
                int[] iArr2 = new int[6];
                byte[] bArr2 = new byte[6];
                a(fArr, iArr2, bArr2);
                int i19 = 0;
                for (int i20 = 0; i20 < 6; i20++) {
                    i19 += bArr2[i20];
                }
                i12 = 0;
                int i21 = iArr2[0];
                int i22 = iArr2[5];
                if (i21 < i22 && i21 < iArr2[1] && i21 < iArr2[2] && i21 < iArr2[3] && i21 < iArr2[4]) {
                    return 0;
                }
                if (i22 >= i21) {
                    byte b10 = bArr2[1];
                    byte b11 = bArr2[2];
                    byte b12 = bArr2[3];
                    byte b13 = bArr2[4];
                    if (b10 + b11 + b12 + b13 != 0) {
                        if (i19 == 1 && b13 > 0) {
                            return 4;
                        }
                        if (i19 == 1 && b11 > 0) {
                            return 2;
                        }
                        if (i19 == 1 && b12 > 0) {
                            return 3;
                        }
                        int i23 = iArr2[1];
                        int i24 = i23 + 1;
                        if (i24 < i21 && i24 < i22 && i24 < iArr2[4] && i24 < iArr2[2]) {
                            int i25 = iArr2[3];
                            if (i23 < i25) {
                                return 1;
                            }
                            if (i23 == i25) {
                                for (int i26 = i10 + i15 + 1; i26 < str.length(); i26++) {
                                    char cCharAt2 = str.charAt(i26);
                                    if (cCharAt2 == '\r' || cCharAt2 == '*' || cCharAt2 == '>') {
                                        return 3;
                                    }
                                    if (!e(cCharAt2)) {
                                        break;
                                    }
                                }
                                return 1;
                            }
                        }
                    }
                }
                return 5;
            }
            i12 = 0;
            i14 = i12;
            i13 = 6;
        }
    }

    public static String encodeHighLevel(String str, SymbolShapeHint symbolShapeHint, Dimension dimension, Dimension dimension2) {
        int i10 = 0;
        c[] cVarArr = {new a(), new g(), new e(), new f(), new s0(), new h()};
        d dVar = new d(str);
        dVar.f25217b = symbolShapeHint;
        dVar.f25218c = dimension;
        dVar.f25219d = dimension2;
        if (str.startsWith("[)>\u001e05\u001d") && str.endsWith("\u001e\u0004")) {
            dVar.d((char) 236);
            dVar.f25224i = 2;
            dVar.f25221f += 7;
        } else if (str.startsWith("[)>\u001e06\u001d") && str.endsWith("\u001e\u0004")) {
            dVar.d((char) 237);
            dVar.f25224i = 2;
            dVar.f25221f += 7;
        }
        while (dVar.b()) {
            cVarArr[i10].a(dVar);
            int i11 = dVar.f25222g;
            if (i11 >= 0) {
                dVar.f25222g = -1;
                i10 = i11;
            }
        }
        StringBuilder sb2 = dVar.f25220e;
        int length = sb2.length();
        dVar.c(sb2.length());
        int dataCapacity = dVar.f25223h.getDataCapacity();
        if (length < dataCapacity && i10 != 0 && i10 != 5 && i10 != 4) {
            dVar.d((char) 254);
        }
        if (sb2.length() < dataCapacity) {
            sb2.append((char) 129);
        }
        while (sb2.length() < dataCapacity) {
            int length2 = ((sb2.length() + 1) * 149) % 253;
            int i12 = length2 + 130;
            if (i12 > 254) {
                i12 = length2 - 124;
            }
            sb2.append((char) i12);
        }
        return sb2.toString();
    }
}

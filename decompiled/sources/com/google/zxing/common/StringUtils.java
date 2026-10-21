package com.google.zxing.common;

import com.google.zxing.DecodeHintType;
import java.nio.charset.Charset;
import java.util.Map;

/* JADX INFO: loaded from: classes10.dex */
public final class StringUtils {
    public static final String GB2312 = "GB2312";
    public static final String SHIFT_JIS = "SJIS";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f49841a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final boolean f49842b;

    static {
        String strName = Charset.defaultCharset().name();
        f49841a = strName;
        f49842b = SHIFT_JIS.equalsIgnoreCase(strName) || "EUC_JP".equalsIgnoreCase(strName);
    }

    /* JADX WARN: Code duplicated, block: B:71:0x00bc  */
    public static String guessEncoding(byte[] bArr, Map<DecodeHintType, ?> map) {
        int i10;
        byte[] bArr2 = bArr;
        if (map != null) {
            DecodeHintType decodeHintType = DecodeHintType.CHARACTER_SET;
            if (map.containsKey(decodeHintType)) {
                return map.get(decodeHintType).toString();
            }
        }
        int length = bArr2.length;
        boolean z10 = true;
        int i11 = 0;
        boolean z11 = bArr2.length > 3 && bArr2[0] == -17 && bArr2[1] == -69 && bArr2[2] == -65;
        boolean z12 = true;
        boolean z13 = true;
        int i12 = 0;
        int i13 = 0;
        int i14 = 0;
        int i15 = 0;
        int i16 = 0;
        int i17 = 0;
        int i18 = 0;
        int i19 = 0;
        int i20 = 0;
        int i21 = 0;
        int i22 = 0;
        while (i13 < length && (z10 || z12 || z13)) {
            byte b10 = bArr2[i13];
            int i23 = b10 & 255;
            if (z13) {
                if (i14 <= 0) {
                    i10 = length;
                    if ((b10 & 128) != 0) {
                        if ((b10 & 64) != 0) {
                            int i24 = i14 + 1;
                            if ((b10 & 32) == 0) {
                                i16++;
                            } else {
                                i24 = i14 + 2;
                                if ((b10 & 16) == 0) {
                                    i17++;
                                } else {
                                    i14 += 3;
                                    if ((b10 & 8) == 0) {
                                        i18++;
                                    }
                                }
                            }
                            i14 = i24;
                        }
                    }
                } else if ((b10 & 128) != 0) {
                    i14--;
                    i10 = length;
                } else {
                    i10 = length;
                }
                z13 = false;
            } else {
                i10 = length;
            }
            if (z10) {
                if (i23 > 127 && i23 < 160) {
                    z10 = false;
                } else if (i23 > 159 && (i23 < 192 || i23 == 215 || i23 == 247)) {
                    i20++;
                }
            }
            if (z12) {
                if (i15 > 0) {
                    if (i23 < 64 || i23 == 127 || i23 > 252) {
                        z12 = false;
                    } else {
                        i15--;
                    }
                } else if (i23 == 128 || i23 == 160 || i23 > 239) {
                    z12 = false;
                } else if (i23 <= 160 || i23 >= 224) {
                    if (i23 > 127) {
                        i15++;
                        int i25 = i21 + 1;
                        if (i25 > i11) {
                            i11 = i25;
                            i21 = i11;
                        } else {
                            i21 = i25;
                        }
                    } else {
                        i21 = 0;
                    }
                    i22 = 0;
                } else {
                    i12++;
                    int i26 = i22 + 1;
                    if (i26 > i19) {
                        i19 = i26;
                        i22 = i19;
                    } else {
                        i22 = i26;
                    }
                    i21 = 0;
                }
            }
            i13++;
            bArr2 = bArr;
            length = i10;
        }
        int i27 = length;
        if (z13 && i14 > 0) {
            z13 = false;
        }
        if (z12 && i15 > 0) {
            z12 = false;
        }
        if (z13 && (z11 || i16 + i17 + i18 > 0)) {
            return "UTF8";
        }
        if (z12 && (f49842b || i19 >= 3 || i11 >= 3)) {
            return SHIFT_JIS;
        }
        if (z10 && z12) {
            return (!(i19 == 2 && i12 == 2) && i20 * 10 < i27) ? "ISO8859_1" : SHIFT_JIS;
        }
        if (z10) {
            return "ISO8859_1";
        }
        if (z12) {
            return SHIFT_JIS;
        }
        return z13 ? "UTF8" : f49841a;
    }
}

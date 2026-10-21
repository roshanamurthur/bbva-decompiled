package com.mypinpad.tsdk.isolation;

import kotlin.jvm.internal.Intrinsics;
import kotlin.text.l;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class acv {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f52429a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static int f52430b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static int f52431c = 1;

    static {
        new abx.setX();
        f52429a = -1234567890;
        int i10 = f52430b;
        int i11 = (((i10 ^ 15) | (i10 & 15)) << 1) - (((~i10) & 15) | (i10 & (-16)));
        f52431c = i11 % 128;
        int i12 = i11 % 2;
    }

    public static final int setDividerPadding(@NotNull abw abwVar) {
        return ((Integer) setOnFocusChangeListener(new Object[]{abwVar}, -1666208994, 1666208999, (int) System.currentTimeMillis())).intValue();
    }

    /* JADX WARN: Code duplicated, block: B:35:0x0266  */
    /* JADX WARN: Code duplicated, block: B:37:0x026c  */
    /* JADX WARN: Code duplicated, block: B:39:0x0279  */
    /* JADX WARN: Code duplicated, block: B:55:0x0394  */
    /* JADX WARN: Code duplicated, block: B:56:0x0398  */
    /* JADX WARN: Code duplicated, block: B:57:0x0399 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:59:0x039c A[LOOP:1: B:51:0x0344->B:59:0x039c, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:70:0x0372 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:71:0x039e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:75:? A[RETURN, SYNTHETIC] */
    public static /* synthetic */ Object setOnFocusChangeListener(Object[] objArr, int i10, int i11, int i12) {
        int i13;
        Object objValueOf;
        int i14;
        byte b10;
        int i15;
        int i16;
        int i17;
        int i18 = ~i10;
        int i19 = (((~(i18 | i11)) | (~(i18 | i12))) * (-283)) + (i11 * (-282)) + (i10 * 284);
        int i20 = ~i11;
        int i21 = 0;
        switch (((~(i20 | i18 | i12)) * 283) + ((~(i10 | i20)) * 283) + i19) {
            case 1:
                byte bByteValue = ((Byte) objArr[0]).byteValue();
                int i22 = f52431c;
                int i23 = (i22 & (-88)) | ((~i22) & 87);
                int i24 = (i22 & 87) << 1;
                int i25 = (i23 & i24) + (i24 | i23);
                f52430b = i25 % 128;
                int i26 = i25 % 2;
                String strConcatToString = l.concatToString(new char[]{((char[]) ada.setY(new Object[0], 772600238, -772600237, (int) System.currentTimeMillis()))[(bByteValue >> 4) & 15], ((char[]) ada.setY(new Object[0], 772600238, -772600237, (int) System.currentTimeMillis()))[bByteValue & 15]});
                int i27 = f52430b;
                int i28 = ((i27 & 93) - (~(i27 | 93))) - 1;
                f52431c = i28 % 128;
                if (i28 % 2 != 0) {
                    return strConcatToString;
                }
                int i29 = 27 / 0;
                return strConcatToString;
            case 2:
                byte[] bArr = (byte[]) objArr[0];
                int iIntValue = ((Number) objArr[1]).intValue();
                byte[] bArr2 = (byte[]) objArr[2];
                int iIntValue2 = ((Number) objArr[3]).intValue();
                int iIntValue3 = ((Number) objArr[4]).intValue();
                int i30 = f52431c;
                int i31 = (-2) - ((((i30 | 2) << 1) - (i30 ^ 2)) ^ (-1));
                f52430b = i31 % 128;
                if (i31 % 2 != 0) {
                    Intrinsics.checkNotNullParameter(bArr, "");
                    Intrinsics.checkNotNullParameter(bArr2, "");
                    if (iIntValue3 > 0) {
                        i13 = 1;
                        while (true) {
                            int i32 = ((i13 & (-28)) | ((~i13) & 27)) + ((i13 & 27) << 1);
                            int i33 = i32 & (-26);
                            i14 = ((i32 | (-26)) & (~i33)) + (i33 << 1);
                            int i34 = i13 & iIntValue;
                            int i35 = -(-((i13 ^ iIntValue) | i34));
                            b10 = bArr[((i34 | i35) << 1) - (i34 ^ i35)];
                            i15 = -(-iIntValue2);
                            if (b10 != bArr2[((i13 ^ i15) - (~(-(-((i13 & i15) << 1))))) - 1]) {
                                int i36 = f52430b;
                                int i37 = i36 & 119;
                                int i38 = (i37 - (~(-(-((i36 ^ 119) | i37))))) - 1;
                                int i39 = i38 % 128;
                                f52431c = i39;
                                int i40 = i38 % 2;
                                int i41 = i39 & 9;
                                int i42 = (i39 ^ 9) | i41;
                                i16 = ((i41 | i42) << 1) - (i42 ^ i41);
                                f52430b = i16 % 128;
                                if (i16 % 2 == 0) {
                                    throw null;
                                }
                                objValueOf = Boolean.FALSE;
                                break;
                            } else if (i14 >= iIntValue3) {
                                i13 = i14;
                            }
                        }
                    }
                } else {
                    Intrinsics.checkNotNullParameter(bArr, "");
                    Intrinsics.checkNotNullParameter(bArr2, "");
                    if (iIntValue3 > 0) {
                        i13 = 0;
                        while (true) {
                            int i310 = ((i13 & (-28)) | ((~i13) & 27)) + ((i13 & 27) << 1);
                            int i311 = i310 & (-26);
                            i14 = ((i310 | (-26)) & (~i311)) + (i311 << 1);
                            int i312 = i13 & iIntValue;
                            int i313 = -(-((i13 ^ iIntValue) | i312));
                            b10 = bArr[((i312 | i313) << 1) - (i312 ^ i313)];
                            i15 = -(-iIntValue2);
                            if (b10 != bArr2[((i13 ^ i15) - (~(-(-((i13 & i15) << 1))))) - 1]) {
                                int i314 = f52430b;
                                int i315 = i314 & 119;
                                int i316 = (i315 - (~(-(-((i314 ^ 119) | i315))))) - 1;
                                int i317 = i316 % 128;
                                f52431c = i317;
                                int i43 = i316 % 2;
                                int i44 = i317 & 9;
                                int i45 = (i317 ^ 9) | i44;
                                i16 = ((i44 | i45) << 1) - (i45 ^ i44);
                                f52430b = i16 % 128;
                                if (i16 % 2 == 0) {
                                    throw null;
                                }
                                objValueOf = Boolean.FALSE;
                                break;
                            } else if (i14 >= iIntValue3) {
                                i13 = i14;
                            }
                        }
                    }
                }
                int i46 = f52430b;
                int i47 = i46 & 71;
                int i48 = (i46 ^ 71) | i47;
                int i49 = (i47 ^ i48) + ((i48 & i47) << 1);
                f52431c = i49 % 128;
                if (i49 % 2 != 0) {
                    objValueOf = Boolean.TRUE;
                } else {
                    int i50 = 17 / 0;
                    objValueOf = Boolean.TRUE;
                }
                break;
            case 3:
                int iIntValue4 = ((Number) objArr[0]).intValue();
                int i51 = f52431c;
                int i52 = (i51 & (-60)) | ((~i51) & 59);
                int i53 = -(-((i51 & 59) << 1));
                int i54 = (i52 & i53) + (i52 | i53);
                f52430b = i54 % 128;
                int i55 = i54 % 2;
                int i56 = ((-16777216) & iIntValue4) >>> 24;
                int i57 = (16711680 & iIntValue4) >>> 8;
                int i58 = ((~i57) & i56) | ((~i56) & i57);
                int i59 = i56 & i57;
                int i60 = (i59 & i58) | (i58 ^ i59);
                int i61 = (65280 & iIntValue4) << 8;
                int i62 = i60 & i61;
                int i63 = (i60 | i61) & (~i62);
                int i64 = (i63 & i62) | (i63 ^ i62);
                int i65 = (iIntValue4 & 255) << 24;
                int i66 = (i65 & i64) | ((~i65) & i64) | ((~i64) & i65);
                int i67 = i51 ^ 93;
                int i68 = (((i51 & 93) | i67) << 1) - i67;
                f52430b = i68 % 128;
                int i69 = i68 % 2;
                return Integer.valueOf(i66);
            case 4:
                long jLongValue = ((Number) objArr[0]).longValue();
                long jLongValue2 = ((Number) objArr[1]).longValue();
                long jLongValue3 = ((Number) objArr[2]).longValue();
                int i70 = f52431c;
                int i71 = i70 + 69;
                int i72 = i71 % 128;
                f52430b = i72;
                int i73 = i71 % 2;
                if ((jLongValue2 | jLongValue3) >= 0) {
                    f52430b = i72;
                    if (i73 != 0) {
                        int i74 = 85 / 0;
                        if (jLongValue2 <= jLongValue) {
                            if (jLongValue - jLongValue2 >= jLongValue3) {
                                i17 = (i70 ^ 85) + ((i70 & 85) << 1);
                                f52430b = i17 % 128;
                                if (i17 % 2 != 0) {
                                    return null;
                                }
                                int i75 = 29 / 0;
                                return null;
                            }
                        }
                    } else if (jLongValue2 <= jLongValue) {
                        if (jLongValue - jLongValue2 >= jLongValue3) {
                            i17 = (i70 ^ 85) + ((i70 & 85) << 1);
                            f52430b = i17 % 128;
                            if (i17 % 2 != 0) {
                                return null;
                            }
                            int i76 = 29 / 0;
                            return null;
                        }
                    }
                }
                StringBuilder sb2 = new StringBuilder("size=");
                sb2.append(jLongValue);
                sb2.append(" offset=");
                sb2.append(jLongValue2);
                sb2.append(" byteCount=");
                sb2.append(jLongValue3);
                throw new ArrayIndexOutOfBoundsException(sb2.toString());
            case 5:
                abw abwVar = (abw) objArr[0];
                int i77 = f52430b;
                int i78 = (i77 & 111) + (i77 | 111);
                f52431c = i78 % 128;
                int i79 = i78 % 2;
                Intrinsics.checkNotNullParameter(abwVar, "");
                if (64 != f52429a) {
                    int i80 = f52431c;
                    int i81 = i80 & 13;
                    int i82 = (i81 - (~(-(-((i80 ^ 13) | i81))))) - 1;
                    f52430b = i82 % 128;
                    int i83 = i82 % 2;
                    objValueOf = 64;
                } else {
                    int i84 = f52430b;
                    int i85 = i84 & 21;
                    int i86 = (i84 ^ 21) | i85;
                    int i87 = ((i85 | i86) << 1) - (i86 ^ i85);
                    f52431c = i87 % 128;
                    if (i87 % 2 == 0) {
                        ((Integer) abw.setX(new Object[]{abwVar}, -1716166708, 1716166712, System.identityHashCode(abwVar))).intValue();
                        throw null;
                    }
                    int iIntValue5 = ((Integer) abw.setX(new Object[]{abwVar}, -1716166708, 1716166712, System.identityHashCode(abwVar))).intValue();
                    int i88 = f52430b + 93;
                    f52431c = i88 % 128;
                    if (i88 % 2 == 0) {
                        throw null;
                    }
                    objValueOf = Integer.valueOf(iIntValue5);
                }
                break;
            case 6:
                short sShortValue = ((Short) objArr[0]).shortValue();
                int i89 = f52430b;
                int i90 = i89 & 75;
                int i91 = i90 + ((i89 ^ 75) | i90);
                f52431c = i91 % 128;
                int i92 = i91 % 2;
                int i93 = ((65535 & sShortValue) >>> 8) & 255;
                int i94 = (sShortValue & 255) << 8;
                short s4 = (short) ((i94 & i93) | (i93 ^ i94));
                int i95 = ((i89 ^ 58) + ((i89 & 58) << 1)) - 1;
                f52431c = i95 % 128;
                int i96 = i95 % 2;
                return Short.valueOf(s4);
            default:
                int iIntValue6 = ((Number) objArr[0]).intValue();
                int i97 = f52430b;
                int i98 = i97 & 109;
                int i99 = (i98 - (~(-(-((i97 ^ 109) | i98))))) - 1;
                int i100 = i99 % 128;
                f52431c = i100;
                int i101 = i99 % 2;
                if (iIntValue6 != 0) {
                    char[] cArr = {((char[]) ada.setY(new Object[0], 772600238, -772600237, (int) System.currentTimeMillis()))[(iIntValue6 >> 28) & 15], ((char[]) ada.setY(new Object[0], 772600238, -772600237, (int) System.currentTimeMillis()))[(iIntValue6 >> 24) & 15], ((char[]) ada.setY(new Object[0], 772600238, -772600237, (int) System.currentTimeMillis()))[(iIntValue6 >> 20) & 15], ((char[]) ada.setY(new Object[0], 772600238, -772600237, (int) System.currentTimeMillis()))[(iIntValue6 >> 16) & 15], ((char[]) ada.setY(new Object[0], 772600238, -772600237, (int) System.currentTimeMillis()))[(iIntValue6 >> 12) & 15], ((char[]) ada.setY(new Object[0], 772600238, -772600237, (int) System.currentTimeMillis()))[(iIntValue6 >> 8) & 15], ((char[]) ada.setY(new Object[0], 772600238, -772600237, (int) System.currentTimeMillis()))[(iIntValue6 >> 4) & 15], ((char[]) ada.setY(new Object[0], 772600238, -772600237, (int) System.currentTimeMillis()))[iIntValue6 & 15]};
                    int i102 = f52430b;
                    int i103 = i102 & 47;
                    int i104 = (i102 ^ 47) | i103;
                    int i105 = (i103 & i104) + (i104 | i103);
                    f52431c = i105 % 128;
                    int i106 = i105 % 2;
                    while (i21 < 8) {
                        int i107 = f52430b;
                        int i108 = i107 + 9;
                        f52431c = i108 % 128;
                        int i109 = i108 % 2;
                        if (cArr[i21] != '0') {
                            objValueOf = l.concatToString(cArr, i21, 8);
                            int i110 = f52431c;
                            int i111 = i110 & 43;
                            int i112 = -(-((i110 ^ 43) | i111));
                            int i113 = ((i111 | i112) << 1) - (i112 ^ i111);
                            f52430b = i113 % 128;
                            int i114 = i113 % 2;
                        } else {
                            int i115 = (i107 ^ 15) + ((i107 & 15) << 1);
                            int i116 = i115 % 128;
                            f52431c = i116;
                            int i117 = i115 % 2;
                            i21 = (((i21 | 2) << 1) - (i21 ^ 2)) - 1;
                            int i118 = i116 + 29;
                            f52430b = i118 % 128;
                            int i119 = i118 % 2;
                        }
                        break;
                    }
                    objValueOf = l.concatToString(cArr, i21, 8);
                    int i1110 = f52431c;
                    int i1111 = i1110 & 43;
                    int i1112 = -(-((i1110 ^ 43) | i1111));
                    int i1113 = ((i1111 | i1112) << 1) - (i1112 ^ i1111);
                    f52430b = i1113 % 128;
                    int i1114 = i1113 % 2;
                } else {
                    int i120 = i100 & 33;
                    int i121 = (i120 - (~(-(-((i100 ^ 33) | i120))))) - 1;
                    int i122 = i121 % 128;
                    f52430b = i122;
                    int i123 = i121 % 2;
                    int i124 = (((i122 ^ 89) | (i122 & 89)) << 1) - (((~i122) & 89) | (i122 & (-90)));
                    f52431c = i124 % 128;
                    int i125 = i124 % 2;
                    objValueOf = "0";
                }
                break;
        }
        return objValueOf;
    }

    @NotNull
    public static final String setX(byte b10) {
        return (String) setOnFocusChangeListener(new Object[]{Byte.valueOf(b10)}, 178239610, -178239609, (int) System.currentTimeMillis());
    }

    @NotNull
    public static final String setDividerPadding(int i10) {
        return (String) setOnFocusChangeListener(new Object[]{Integer.valueOf(i10)}, 444213623, -444213623, i10);
    }

    public static final boolean setDividerPadding(@NotNull byte[] bArr, int i10, @NotNull byte[] bArr2, int i11, int i12) {
        return ((Boolean) setOnFocusChangeListener(new Object[]{bArr, Integer.valueOf(i10), bArr2, Integer.valueOf(i11), Integer.valueOf(i12)}, -55821670, 55821672, i10)).booleanValue();
    }

    public static final short setDividerPadding(short s4) {
        return ((Short) setOnFocusChangeListener(new Object[]{Short.valueOf(s4)}, 1644758047, -1644758041, (int) System.currentTimeMillis())).shortValue();
    }

    public static final void setDividerPadding(long j10, long j11, long j12) {
        setOnFocusChangeListener(new Object[]{Long.valueOf(j10), Long.valueOf(j11), Long.valueOf(j12)}, 1264570852, -1264570848, (int) System.currentTimeMillis());
    }

    public static final int setOnFocusChangeListener(int i10) {
        return ((Integer) setOnFocusChangeListener(new Object[]{Integer.valueOf(i10)}, 1109503243, -1109503240, i10)).intValue();
    }
}

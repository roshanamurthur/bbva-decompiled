package com.mypinpad.tsdk.isolation;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import java.io.IOException;

/* JADX INFO: loaded from: classes10.dex */
public final class bbc extends baq implements ben {

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public final bbb f54418t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public final byte[] f54419u0;
    public final byte[] v0;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public final byte[] f54420w0;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public final byte[] f54421x0;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    public volatile bae f54422y0;

    public static class setOnFocusChangeListener {

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public static int f54423i = 0;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public static int f54424j = 1;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final bbb f54425a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f54426b = 0;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f54427c = -1;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public byte[] f54428d = null;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public byte[] f54429e = null;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public byte[] f54430f = null;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public byte[] f54431g = null;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public bae f54432h = null;

        public setOnFocusChangeListener(bbb bbbVar) {
            this.f54425a = bbbVar;
        }

        public static /* synthetic */ Object setX(Object[] objArr, int i10, int i11, int i12) {
            Object objValueOf;
            int i13 = (i11 * 702) + (i10 * (-700));
            int i14 = ~i10;
            int i15 = ~i11;
            switch ((i15 * 701) + ((i14 | i11) * (-701)) + ((~(i14 | i15)) * 701) + i13) {
                case 1:
                    setOnFocusChangeListener setonfocuschangelistener = (setOnFocusChangeListener) objArr[0];
                    byte[] bArr = (byte[]) objArr[1];
                    int i16 = (-2) - ((f54423i + 14) ^ (-1));
                    f54424j = i16 % 128;
                    int i17 = i16 % 2;
                    setonfocuschangelistener.f54431g = (byte[]) bbi.setOnFocusChangeListener(new Object[]{bArr}, -759448087, 759448096, (int) System.currentTimeMillis());
                    int i18 = f54423i;
                    int i19 = (i18 ^ 121) + ((i18 & 121) << 1);
                    f54424j = i19 % 128;
                    int i20 = i19 % 2;
                    return setonfocuschangelistener;
                case 2:
                    setOnFocusChangeListener setonfocuschangelistener2 = (setOnFocusChangeListener) objArr[0];
                    bbc bbcVar = new bbc(setonfocuschangelistener2);
                    System.identityHashCode(setonfocuschangelistener2);
                    System.identityHashCode(setonfocuschangelistener2);
                    return bbcVar;
                case 3:
                    setOnFocusChangeListener setonfocuschangelistener3 = (setOnFocusChangeListener) objArr[0];
                    int i21 = f54424j;
                    int i22 = i21 & 123;
                    int i23 = ((i21 ^ 123) | i22) << 1;
                    int i24 = -((i21 | 123) & (~i22));
                    int i25 = (i23 & i24) + (i24 | i23);
                    f54423i = i25 % 128;
                    int i26 = i25 % 2;
                    setonfocuschangelistener3.getClass();
                    int i27 = f54424j + 19;
                    f54423i = i27 % 128;
                    int i28 = i27 % 2;
                    return null;
                case 4:
                    setOnFocusChangeListener setonfocuschangelistener4 = (setOnFocusChangeListener) objArr[0];
                    byte[] bArr2 = (byte[]) objArr[1];
                    int i29 = f54424j;
                    int i30 = ((i29 ^ 1) | (i29 & 1)) << 1;
                    int i31 = -(((~i29) & 1) | (i29 & (-2)));
                    int i32 = ((i30 | i31) << 1) - (i31 ^ i30);
                    f54423i = i32 % 128;
                    int i33 = i32 % 2;
                    setonfocuschangelistener4.f54430f = (byte[]) bbi.setOnFocusChangeListener(new Object[]{bArr2}, -759448087, 759448096, (int) System.currentTimeMillis());
                    int i34 = f54423i;
                    int i35 = ((i34 ^ 84) + ((i34 & 84) << 1)) - 1;
                    f54424j = i35 % 128;
                    int i36 = i35 % 2;
                    return setonfocuschangelistener4;
                case 5:
                    setOnFocusChangeListener setonfocuschangelistener5 = (setOnFocusChangeListener) objArr[0];
                    int i37 = f54423i;
                    int i38 = i37 ^ 5;
                    int i39 = (i37 & 5) << 1;
                    int i40 = (i38 ^ i39) + ((i39 & i38) << 1);
                    f54424j = i40 % 128;
                    int i41 = i40 % 2;
                    int i42 = setonfocuschangelistener5.f54427c;
                    if (i41 == 0) {
                        throw null;
                    }
                    int iCurrentTimeMillis = (int) System.currentTimeMillis();
                    int i43 = ~iCurrentTimeMillis;
                    int i44 = 1311273592 & i43;
                    int i45 = (~i44) & (1311273592 | i43);
                    int i46 = (i45 & i44) | (i45 ^ i44);
                    int i47 = ~i46;
                    int i48 = (i46 | i47) & i47;
                    int i49 = 720982347 ^ i48;
                    int i50 = i48 & 720982347;
                    int i51 = (((i50 & i49) | (i49 ^ i50)) * (-602)) + 93024491;
                    int i52 = (iCurrentTimeMillis & 1311273592) | i44 | (iCurrentTimeMillis & (-1311273593));
                    int i53 = ~i52;
                    int i54 = (i52 | i53) & i53;
                    int i55 = 550568195 & i54;
                    int i56 = (i54 | 550568195) & (~i55);
                    int i57 = (i56 & i55) | (i56 ^ i55);
                    int i58 = i43 | (-1311273593);
                    int i59 = ~((i58 & 720982347) | (i58 ^ 720982347));
                    int i60 = i57 & i59;
                    int i61 = -(-((((i57 | i59) & (~i60)) | i60) * (-301)));
                    int i62 = i51 & i61;
                    int i63 = (i61 | i51) & (~i62);
                    int i64 = -(-(i62 << 1));
                    int i65 = ((i63 | i64) << 1) - (i63 ^ i64);
                    int i66 = i43 & 720982347;
                    int i67 = -(-((~(i66 | ((i43 | 720982347) & (~i66)))) * 301));
                    int i68 = i65 & i67;
                    int i69 = (((i67 | i65) & (~i68)) - (~(-(-(i68 << 1))))) - 1;
                    int iCurrentTimeMillis2 = (int) System.currentTimeMillis();
                    int i70 = ~iCurrentTimeMillis2;
                    int i71 = (iCurrentTimeMillis2 | i70) & i70;
                    int i72 = 1702760616 & i71;
                    int i73 = (~i72) & (1702760616 | i71);
                    int i74 = ~i71;
                    int i75 = (i72 & i73) | (i73 ^ i72);
                    int i76 = (i75 & (-2039599816)) | ((~i75) & 2039599815);
                    int i77 = i75 & 2039599815;
                    int i78 = ~((i77 & i76) | (i76 ^ i77));
                    int i79 = (-2039599816) & i70;
                    int i80 = (~i79) & ((-2039599816) | i70);
                    int i81 = (i79 & i80) | (i80 ^ i79);
                    int i82 = ~((i81 & (-1702760617)) | (i81 & 1702760616) | ((~i81) & (-1702760617)));
                    int i83 = ((i78 & i82) | (i78 ^ i82)) * (-184);
                    int i84 = (-1512031090) & i83;
                    int i85 = i84 + ((i83 ^ (-1512031090)) | i84);
                    int i86 = ~((i70 & 1702760616) | (1702760616 ^ i70));
                    int i87 = 411157063 & i86;
                    int i88 = (i86 | 411157063) & (~i87);
                    int i89 = (i88 & i87) | (i88 ^ i87);
                    int i90 = ~((i71 & (-2039599816)) | ((-2039599816) & i74) | (i71 & 2039599815));
                    int i91 = i89 & i90;
                    int i92 = -(-((((i90 | i89) & (~i91)) | i91) * 184));
                    int i93 = i85 & i92;
                    int i94 = (i92 ^ i85) | i93;
                    int i95 = (i93 & i94) + (i94 | i93);
                    if (i69 <= (i95 ^ (-789585272)) + (((-789585272) & i95) << 1)) {
                        return Integer.valueOf(i42);
                    }
                    throw null;
                case 6:
                    setOnFocusChangeListener setonfocuschangelistener6 = (setOnFocusChangeListener) objArr[0];
                    int iIntValue = ((Number) objArr[1]).intValue();
                    int i96 = f54423i;
                    int i97 = (i96 ^ 39) + ((i96 & 39) << 1);
                    int i98 = i97 % 128;
                    f54424j = i98;
                    int i99 = i97 % 2;
                    setonfocuschangelistener6.f54427c = iIntValue;
                    if (i99 == 0) {
                        int i100 = 1 / 0;
                    }
                    int i101 = (-2) - ((i98 + 32) ^ (-1));
                    f54423i = i101 % 128;
                    int i102 = i101 % 2;
                    return setonfocuschangelistener6;
                case 7:
                    setOnFocusChangeListener setonfocuschangelistener7 = (setOnFocusChangeListener) objArr[0];
                    byte[] bArr3 = (byte[]) objArr[1];
                    int i103 = f54424j + 85;
                    f54423i = i103 % 128;
                    int i104 = i103 % 2;
                    setonfocuschangelistener7.f54428d = (byte[]) bbi.setOnFocusChangeListener(new Object[]{bArr3}, -759448087, 759448096, (int) System.currentTimeMillis());
                    int i105 = f54423i + 3;
                    f54424j = i105 % 128;
                    if (i105 % 2 != 0) {
                        return setonfocuschangelistener7;
                    }
                    int i106 = 75 / 0;
                    return setonfocuschangelistener7;
                case 8:
                    setOnFocusChangeListener setonfocuschangelistener8 = (setOnFocusChangeListener) objArr[0];
                    int i107 = f54424j;
                    int i108 = ((i107 & 91) - (~(i107 | 91))) - 1;
                    f54423i = i108 % 128;
                    if (i108 % 2 == 0) {
                        return setonfocuschangelistener8.f54425a;
                    }
                    bbb bbbVar = setonfocuschangelistener8.f54425a;
                    throw null;
                case 9:
                    setOnFocusChangeListener setonfocuschangelistener9 = (setOnFocusChangeListener) objArr[0];
                    int i109 = f54423i;
                    int i110 = ((i109 & 50) + (i109 | 50)) - 1;
                    f54424j = i110 % 128;
                    int i111 = i110 % 2;
                    bae baeVar = setonfocuschangelistener9.f54432h;
                    int i112 = i109 & 13;
                    int i113 = -(-((i109 ^ 13) | i112));
                    int i114 = (i112 & i113) + (i112 | i113);
                    f54424j = i114 % 128;
                    int i115 = i114 % 2;
                    return baeVar;
                case 10:
                    setOnFocusChangeListener setonfocuschangelistener10 = (setOnFocusChangeListener) objArr[0];
                    int i116 = f54423i;
                    int i117 = ((i116 | 113) << 1) - (i116 ^ 113);
                    f54424j = i117 % 128;
                    if (i117 % 2 != 0) {
                        return setonfocuschangelistener10.f54431g;
                    }
                    byte[] bArr4 = setonfocuschangelistener10.f54431g;
                    throw null;
                case 11:
                    setOnFocusChangeListener setonfocuschangelistener11 = (setOnFocusChangeListener) objArr[0];
                    int iIntValue2 = ((Number) objArr[1]).intValue();
                    int i118 = f54424j;
                    int i119 = ((i118 ^ 12) + ((i118 & 12) << 1)) - 1;
                    int i120 = i119 % 128;
                    f54423i = i120;
                    int i121 = i119 % 2;
                    setonfocuschangelistener11.f54426b = iIntValue2;
                    int i122 = (i120 & (-4)) | ((~i120) & 3);
                    int i123 = (3 & i120) << 1;
                    int i124 = ((i122 | i123) << 1) - (i122 ^ i123);
                    f54424j = i124 % 128;
                    if (i124 % 2 != 0) {
                        return setonfocuschangelistener11;
                    }
                    throw null;
                case 12:
                    setOnFocusChangeListener setonfocuschangelistener12 = (setOnFocusChangeListener) objArr[0];
                    byte[] bArr5 = (byte[]) objArr[1];
                    int i125 = f54423i;
                    int i126 = ((i125 | 125) << 1) - (i125 ^ 125);
                    f54424j = i126 % 128;
                    int i127 = i126 % 2;
                    setonfocuschangelistener12.f54429e = (byte[]) bbi.setOnFocusChangeListener(new Object[]{bArr5}, -759448087, 759448096, (int) System.currentTimeMillis());
                    int i128 = f54423i;
                    int i129 = i128 & 51;
                    int i130 = ((i128 | 51) & (~i129)) + (i129 << 1);
                    f54424j = i130 % 128;
                    if (i130 % 2 != 0) {
                        return setonfocuschangelistener12;
                    }
                    int i131 = 58 / 0;
                    return setonfocuschangelistener12;
                case 13:
                    setOnFocusChangeListener setonfocuschangelistener13 = (setOnFocusChangeListener) objArr[0];
                    bae baeVar2 = (bae) objArr[1];
                    int i132 = f54423i;
                    int i133 = i132 & 65;
                    int i134 = (i132 | 65) & (~i133);
                    int i135 = -(-(i133 << 1));
                    int i136 = ((i134 | i135) << 1) - (i134 ^ i135);
                    int i137 = i136 % 128;
                    f54424j = i137;
                    int i138 = i136 % 2;
                    setonfocuschangelistener13.f54432h = baeVar2;
                    int i139 = i137 & 13;
                    int i140 = -(-((i137 ^ 13) | i139));
                    int i141 = (i139 ^ i140) + ((i139 & i140) << 1);
                    f54423i = i141 % 128;
                    if (i141 % 2 == 0) {
                        return setonfocuschangelistener13;
                    }
                    throw null;
                case 14:
                    setOnFocusChangeListener setonfocuschangelistener14 = (setOnFocusChangeListener) objArr[0];
                    int i142 = (-2) - ((f54424j + 110) ^ (-1));
                    int i143 = i142 % 128;
                    f54423i = i143;
                    int i144 = i142 % 2;
                    byte[] bArr6 = setonfocuschangelistener14.f54428d;
                    int i145 = ((i143 ^ 110) + ((i143 & 110) << 1)) - 1;
                    f54424j = i145 % 128;
                    if (i145 % 2 != 0) {
                        return bArr6;
                    }
                    int i146 = 42 / 0;
                    return bArr6;
                case 15:
                    setOnFocusChangeListener setonfocuschangelistener15 = (setOnFocusChangeListener) objArr[0];
                    int i147 = f54423i + 107;
                    f54424j = i147 % 128;
                    int i148 = i147 % 2;
                    objValueOf = setonfocuschangelistener15.f54430f;
                    if (i148 == 0) {
                        int i149 = 79 / 0;
                    }
                    break;
                case 16:
                    setOnFocusChangeListener setonfocuschangelistener16 = (setOnFocusChangeListener) objArr[0];
                    int i150 = f54424j;
                    int i151 = i150 & 49;
                    int i152 = (((i150 ^ 49) | i151) << 1) - ((i150 | 49) & (~i151));
                    f54423i = i152 % 128;
                    if (i152 % 2 == 0) {
                        return setonfocuschangelistener16.f54429e;
                    }
                    byte[] bArr7 = setonfocuschangelistener16.f54429e;
                    throw null;
                default:
                    setOnFocusChangeListener setonfocuschangelistener17 = (setOnFocusChangeListener) objArr[0];
                    int i153 = f54424j;
                    int i154 = (-2) - ((i153 + 68) ^ (-1));
                    f54423i = i154 % 128;
                    int i155 = i154 % 2;
                    int i156 = setonfocuschangelistener17.f54426b;
                    if (i155 != 0) {
                        throw null;
                    }
                    int i157 = i153 & 75;
                    int i158 = ((((i153 ^ 75) | i157) << 1) - (~(-((i153 | 75) & (~i157))))) - 1;
                    f54423i = i158 % 128;
                    if (i158 % 2 != 0) {
                        int i159 = 34 / 0;
                    }
                    objValueOf = Integer.valueOf(i156);
                    break;
                    break;
            }
            return objValueOf;
        }

        public final setOnFocusChangeListener setCompoundDrawableTintBlendMode(byte[] bArr) {
            return (setOnFocusChangeListener) setX(new Object[]{this, bArr}, -432446162, 432446169, System.identityHashCode(this));
        }

        public final setOnFocusChangeListener setDividerPadding(byte[] bArr) {
            return (setOnFocusChangeListener) setX(new Object[]{this, bArr}, -89552526, 89552538, System.identityHashCode(this));
        }

        public final setOnFocusChangeListener setOnFocusChangeListener(byte[] bArr) {
            return (setOnFocusChangeListener) setX(new Object[]{this, bArr}, 33216659, -33216655, System.identityHashCode(this));
        }

        public final bbc setY() {
            return (bbc) setX(new Object[]{this}, -298937971, 298937973, System.identityHashCode(this));
        }

        public final setOnFocusChangeListener setOnFocusChangeListener(int i10) {
            return (setOnFocusChangeListener) setX(new Object[]{this, Integer.valueOf(i10)}, -310062390, 310062401, i10);
        }

        public final setOnFocusChangeListener setY(bae baeVar) {
            return (setOnFocusChangeListener) setX(new Object[]{this, baeVar}, -124106939, 124106952, System.identityHashCode(this));
        }

        public final setOnFocusChangeListener setX(byte[] bArr) {
            return (setOnFocusChangeListener) setX(new Object[]{this, bArr}, -1164267579, 1164267580, System.identityHashCode(this));
        }

        public final setOnFocusChangeListener setX(int i10) {
            return (setOnFocusChangeListener) setX(new Object[]{this, Integer.valueOf(i10)}, 790666062, -790666056, i10);
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public bbc(setOnFocusChangeListener setonfocuschangelistener) {
        bbb bbbVar = (bbb) setOnFocusChangeListener.setX(new Object[]{setonfocuschangelistener}, 1174711734, -1174711726, (int) System.currentTimeMillis());
        bbbVar.getClass();
        super(true, (String) bbb.setCompoundDrawableTintBlendMode(new Object[]{bbbVar}, 1692396741, -1692396740, System.identityHashCode(bbbVar)));
        bbb bbbVar2 = (bbb) setOnFocusChangeListener.setX(new Object[]{setonfocuschangelistener}, 1174711734, -1174711726, (int) System.currentTimeMillis());
        this.f54418t0 = bbbVar2;
        if (bbbVar2 == null) {
            throw new NullPointerException("params == null");
        }
        int iIntValue = ((Integer) bbb.setCompoundDrawableTintBlendMode(new Object[]{bbbVar2}, 862961959, -862961952, System.identityHashCode(bbbVar2))).intValue();
        byte[] bArr = (byte[]) setOnFocusChangeListener.setX(new Object[]{setonfocuschangelistener}, 353362506, -353362503, (int) System.currentTimeMillis());
        if (bArr == null) {
            byte[] bArr2 = (byte[]) setOnFocusChangeListener.setX(new Object[]{setonfocuschangelistener}, 1670321382, -1670321368, (int) System.currentTimeMillis());
            if (bArr2 == null) {
                this.f54419u0 = new byte[iIntValue];
            } else {
                if (bArr2.length != iIntValue) {
                    throw new IllegalArgumentException("size of secretKeySeed needs to be equal size of digest");
                }
                this.f54419u0 = bArr2;
            }
            byte[] bArr3 = (byte[]) setOnFocusChangeListener.setX(new Object[]{setonfocuschangelistener}, -615294195, 615294211, (int) System.currentTimeMillis());
            if (bArr3 == null) {
                this.v0 = new byte[iIntValue];
            } else {
                if (bArr3.length != iIntValue) {
                    throw new IllegalArgumentException("size of secretKeyPRF needs to be equal size of digest");
                }
                this.v0 = bArr3;
            }
            byte[] bArr4 = (byte[]) setOnFocusChangeListener.setX(new Object[]{setonfocuschangelistener}, 631832867, -631832852, (int) System.currentTimeMillis());
            if (bArr4 == null) {
                this.f54420w0 = new byte[iIntValue];
            } else {
                if (bArr4.length != iIntValue) {
                    throw new IllegalArgumentException("size of publicSeed needs to be equal size of digest");
                }
                this.f54420w0 = bArr4;
            }
            byte[] bArr5 = (byte[]) setOnFocusChangeListener.setX(new Object[]{setonfocuschangelistener}, -1508725201, 1508725211, (int) System.currentTimeMillis());
            if (bArr5 == null) {
                this.f54421x0 = new byte[iIntValue];
            } else {
                if (bArr5.length != iIntValue) {
                    throw new IllegalArgumentException("size of root needs to be equal size of digest");
                }
                this.f54421x0 = bArr5;
            }
            bae baeVar = (bae) setOnFocusChangeListener.setX(new Object[]{setonfocuschangelistener}, -612556071, 612556080, (int) System.currentTimeMillis());
            if (baeVar == null) {
                int iIntValue2 = ((Integer) setOnFocusChangeListener.setX(new Object[]{setonfocuschangelistener}, 513766860, -513766860, (int) System.currentTimeMillis())).intValue();
                int iIntValue3 = 1 << ((Integer) bbb.setCompoundDrawableTintBlendMode(new Object[]{bbbVar2}, 1335966603, -1335966598, System.identityHashCode(bbbVar2))).intValue();
                int iCurrentTimeMillis = (int) System.currentTimeMillis();
                int i10 = -(-(iIntValue3 * (-495)));
                int i11 = 990 ^ i10;
                int i12 = (i10 & 990) << 1;
                int i13 = ((i11 | i12) << 1) - (i12 ^ i11);
                int i14 = ~iIntValue3;
                int i15 = (i14 | iIntValue3) & i14;
                int i16 = (i15 & 1) | (1 ^ i15);
                int i17 = ~i16;
                int i18 = (i16 | i17) & i17;
                int i19 = 1 & iCurrentTimeMillis;
                int i20 = (1 ^ iCurrentTimeMillis) | i19;
                int i21 = ~i20;
                int i22 = i21 & (i20 | i21);
                int i23 = ((~i18) & i22) | ((~i22) & i18);
                int i24 = i22 & i18;
                int i25 = -(~(-(-(((i24 & i23) | (i23 ^ i24)) * 992))));
                int i26 = (-2) - (((i13 & i25) + (i25 | i13)) ^ (-1));
                int i27 = ~((i14 & 1) | ((~i14) & 1) | (i14 & (-2)));
                int i28 = (~i19) & (1 | iCurrentTimeMillis);
                int i29 = ~iCurrentTimeMillis;
                int i30 = ~((i28 & i19) | (i28 ^ i19));
                int i31 = (i27 & i30) | (i27 ^ i30);
                int i32 = (i29 | iCurrentTimeMillis) & i29;
                int i33 = (i32 & (-2)) | (i32 ^ (-2));
                int i34 = ~((i33 & iIntValue3) | (i33 ^ iIntValue3));
                int i35 = ((~i34) & i31) | ((~i31) & i34);
                int i36 = i31 & i34;
                int i37 = -(-(((i36 & i35) | (i35 ^ i36)) * (-496)));
                int i38 = i26 & i37;
                int i39 = ((i26 ^ i37) | i38) << 1;
                int i40 = -((i26 | i37) & (~i38));
                int i41 = ((i39 | i40) << 1) - (i40 ^ i39);
                int i42 = ((iIntValue3 & iCurrentTimeMillis) | (iIntValue3 ^ iCurrentTimeMillis)) * 496;
                baeVar = (iIntValue2 >= ((((~i42) & i41) | ((~i41) & i42)) - (~((i42 & i41) << 1))) - 1 || bArr4 == null || bArr2 == null) ? new bae(bbbVar2, (-3) - (~(-(~(1 << bbbVar2.setOnFocusChangeListener())))), ((Integer) setOnFocusChangeListener.setX(new Object[]{setonfocuschangelistener}, 513766860, -513766860, (int) System.currentTimeMillis())).intValue()) : new bae(bbbVar2, bArr4, bArr2, (ban) new ban.setCompoundDrawableTintBlendMode().setY(), ((Integer) setOnFocusChangeListener.setX(new Object[]{setonfocuschangelistener}, 513766860, -513766860, (int) System.currentTimeMillis())).intValue());
            }
            this.f54422y0 = baeVar;
            if (((Integer) setOnFocusChangeListener.setX(new Object[]{setonfocuschangelistener}, 1742086837, -1742086832, (int) System.currentTimeMillis())).intValue() >= 0) {
                int iIntValue4 = ((Integer) setOnFocusChangeListener.setX(new Object[]{setonfocuschangelistener}, 1742086837, -1742086832, (int) System.currentTimeMillis())).intValue();
                bae baeVar2 = this.f54422y0;
                if (iIntValue4 != ((Integer) bae.setCompoundDrawableTintBlendMode(new Object[]{baeVar2}, 1914682748, -1914682741, System.identityHashCode(baeVar2))).intValue()) {
                    throw new IllegalArgumentException("maxIndex set but not reflected in state");
                }
                return;
            }
            return;
        }
        int iIntValue5 = ((Integer) bbb.setCompoundDrawableTintBlendMode(new Object[]{bbbVar2}, 1335966603, -1335966598, System.identityHashCode(bbbVar2))).intValue();
        int iIntValue6 = ((Integer) ber.setDividerPadding(new Object[]{bArr, 0}, 450133947, -450133937, 0)).intValue();
        if (!((Boolean) bbi.setOnFocusChangeListener(new Object[]{Integer.valueOf(iIntValue5), Long.valueOf(iIntValue6)}, -1829337202, 1829337218, iIntValue5)).booleanValue()) {
            throw new IllegalArgumentException("index out of bounds");
        }
        this.f54419u0 = (byte[]) bbi.setOnFocusChangeListener(new Object[]{bArr, 4, Integer.valueOf(iIntValue)}, 427617211, -427617208, 4);
        int i43 = iIntValue & 4;
        int i44 = i43 + ((iIntValue ^ 4) | i43);
        this.v0 = (byte[]) bbi.setOnFocusChangeListener(new Object[]{bArr, Integer.valueOf(i44), Integer.valueOf(iIntValue)}, 427617211, -427617208, i44);
        int iCurrentTimeMillis2 = (int) System.currentTimeMillis();
        int i45 = ((iIntValue * (-559)) - (~(-(-(i44 * 561))))) - 1;
        int i46 = ~iCurrentTimeMillis2;
        int i47 = i46 & iIntValue;
        int i48 = (~i47) & (i46 | iIntValue);
        int i49 = ~iIntValue;
        int i50 = (~((i48 ^ i47) | (i47 & i48))) * (-560);
        int i51 = ((i45 | i50) << 1) - ((i50 & (~i45)) | ((~i50) & i45));
        int i52 = ~i44;
        int i53 = (i52 & i49) | ((~i52) & iIntValue);
        int i54 = i52 & iIntValue;
        int i55 = (i54 & i53) | (i53 ^ i54);
        int i56 = i55 & iCurrentTimeMillis2;
        int i57 = (i55 | iCurrentTimeMillis2) & (~i56);
        int i58 = (i57 & i56) | (i57 ^ i56);
        int i59 = ~i58;
        int i60 = ((i58 | i59) & i59) * (-560);
        int i61 = i51 & i60;
        int i62 = -(-((i60 ^ i51) | i61));
        int i63 = (i61 & i62) + (i62 | i61);
        int i64 = ~(((i49 | iIntValue) & i49) | i44);
        int i65 = ~((i44 & i46) | (i46 ^ i44));
        int i66 = ((~i65) & i64) | ((~i64) & i65);
        int i67 = i64 & i65;
        int i68 = -(-(((i67 & i66) | (i66 ^ i67)) * 560));
        int i69 = i63 & i68;
        int i70 = (i68 ^ i63) | i69;
        int i71 = ((i69 | i70) << 1) - (i70 ^ i69);
        this.f54420w0 = (byte[]) bbi.setOnFocusChangeListener(new Object[]{bArr, Integer.valueOf(i71), Integer.valueOf(iIntValue)}, 427617211, -427617208, i71);
        int i72 = i71 & iIntValue;
        int i73 = ((((i71 ^ iIntValue) | i72) << 1) - (~(-((i71 | iIntValue) & (~i72))))) - 1;
        this.f54421x0 = (byte[]) bbi.setOnFocusChangeListener(new Object[]{bArr, Integer.valueOf(i73), Integer.valueOf(iIntValue)}, 427617211, -427617208, i73);
        int iCurrentTimeMillis3 = (int) System.currentTimeMillis();
        int i74 = iIntValue * 217;
        int i75 = -(-(i73 * (-215)));
        int i76 = ((((~i75) & i74) | ((~i74) & i75)) - (~((i74 & i75) << 1))) - 1;
        int i77 = iIntValue ^ iCurrentTimeMillis3;
        int i78 = ~iCurrentTimeMillis3;
        int i79 = iCurrentTimeMillis3 & iIntValue;
        int i80 = -(-((~((i79 & i77) | (i77 ^ i79))) * 216));
        int i81 = i76 | i80;
        int i82 = i81 << 1;
        int i83 = -((~(i80 & i76)) & i81);
        int i84 = (i82 ^ i83) + ((i83 & i82) << 1);
        int i85 = ~i73;
        int i86 = i85 & (i85 | i73);
        int i87 = iIntValue & i86;
        int i88 = (i86 | iIntValue) & (~i87);
        int i89 = ((i88 & i87) | (i88 ^ i87) | i78) * (-216);
        int i90 = i84 & i89;
        int i91 = (i89 ^ i84) | i90;
        int i92 = (i90 ^ i91) + ((i91 & i90) << 1);
        int i93 = i78 & iIntValue;
        int i94 = (iIntValue | i78) & (~i93);
        int i95 = ~((i94 & i93) | (i94 ^ i93));
        int i96 = -(-(((i95 & i73) | (i73 ^ i95)) * 216));
        int i97 = i92 & i96;
        int i98 = -(-((i96 ^ i92) | i97));
        int i99 = (i97 ^ i98) + ((i98 & i97) << 1);
        int length = bArr.length;
        int i100 = -i99;
        int i101 = length & i100;
        int i102 = -(-((length ^ i100) | i101));
        try {
            bae baeVar3 = (bae) bbi.setOnFocusChangeListener(new Object[]{(byte[]) bbi.setOnFocusChangeListener(new Object[]{bArr, Integer.valueOf(i99), Integer.valueOf(((i101 | i102) << 1) - (i102 ^ i101))}, 427617211, -427617208, i99), bae.class}, -145577911, 145577915, (int) System.currentTimeMillis());
            if (((Integer) bae.setCompoundDrawableTintBlendMode(new Object[]{baeVar3}, -1508955254, 1508955258, System.identityHashCode(baeVar3))).intValue() != iIntValue6) {
                throw new IllegalStateException("serialized BDS has wrong index");
            }
            bbb bbbVar3 = (bbb) setOnFocusChangeListener.setX(new Object[]{setonfocuschangelistener}, 1174711734, -1174711726, (int) System.currentTimeMillis());
            this.f54422y0 = (bae) bae.setCompoundDrawableTintBlendMode(new Object[]{baeVar3, (adu) bbb.setCompoundDrawableTintBlendMode(new Object[]{bbbVar3}, -2019059677, 2019059677, System.identityHashCode(bbbVar3))}, 1636934983, -1636934981, System.identityHashCode(baeVar3));
        } catch (IOException e5) {
            throw new IllegalArgumentException(e5.getMessage(), e5);
        } catch (ClassNotFoundException e7) {
            throw new IllegalArgumentException(e7.getMessage(), e7);
        }
    }

    public static /* synthetic */ Object a(Object[] objArr) {
        byte[] bArr;
        bbc bbcVar = (bbc) objArr[0];
        synchronized (bbcVar) {
            try {
                bbb bbbVar = bbcVar.f54418t0;
                int iIntValue = ((Integer) bbb.setCompoundDrawableTintBlendMode(new Object[]{bbbVar}, 862961959, -862961952, System.identityHashCode(bbbVar))).intValue();
                int i10 = iIntValue & 4;
                int i11 = ((iIntValue ^ 4) | i10) << 1;
                int i12 = -((~i10) & (iIntValue | 4));
                int i13 = (i11 & i12) + (i11 | i12);
                int i14 = -(-iIntValue);
                int i15 = ((i13 ^ i14) | (i13 & i14)) << 1;
                int i16 = -((i14 & (~i13)) | ((~i14) & i13));
                int i17 = ((i15 | i16) << 1) - (i16 ^ i15);
                int i18 = ~iIntValue;
                int i19 = ((((i17 ^ iIntValue) | (i17 & iIntValue)) << 1) - (~(-(((~i17) & iIntValue) | (i17 & i18))))) - 1;
                int i20 = ~iIntValue;
                int i21 = i19 - i20;
                byte[] bArr2 = new byte[(i21 ^ (-1)) + (i21 << 1)];
                bae baeVar = bbcVar.f54422y0;
                int iIntValue2 = ((Integer) bae.setCompoundDrawableTintBlendMode(new Object[]{baeVar}, -1508955254, 1508955258, System.identityHashCode(baeVar))).intValue();
                ber.setDividerPadding(new Object[]{Integer.valueOf(iIntValue2), bArr2, 0}, -2092293587, 2092293591, iIntValue2);
                bbi.setOnFocusChangeListener(new Object[]{bArr2, bbcVar.f54419u0, 4}, -2011745549, 2011745550, 4);
                int iIdentityHashCode = System.identityHashCode(bbcVar);
                int i22 = (iIntValue * 421) - 1676;
                int i23 = ~iIdentityHashCode;
                int i24 = (iIntValue & i23) | (iIdentityHashCode & i18);
                int i25 = iIdentityHashCode & iIntValue;
                int i26 = (i25 & i24) | (i24 ^ i25);
                int i27 = ((i26 | (~i26)) & (~i26)) * TypedValues.CycleType.TYPE_EASING;
                int i28 = i22 & i27;
                int i29 = ((i22 ^ i27) | i28) << 1;
                int i30 = -((i27 | i22) & (~i28));
                int i31 = (i29 & i30) + (i30 | i29);
                int i32 = -(-((iIntValue | (-5)) * (-420)));
                int i33 = i31 & i32;
                int i34 = -(-((i32 ^ i31) | i33));
                int i35 = ((i33 | i34) << 1) - (i34 ^ i33);
                int i36 = i20 & (i18 | iIntValue);
                int i37 = (-5) & i36;
                int i38 = (i36 | (-5)) & (~i37);
                int i39 = ~((i38 & i37) | (i38 ^ i37));
                int i40 = (i18 & i23) | ((~i23) & iIntValue) | (i23 & iIntValue);
                int i41 = (i40 | (~i40)) & (~i40);
                int i42 = i39 & i41;
                int i43 = (i41 | i39) & (~i42);
                int i44 = ((i43 & i42) | (i43 ^ i42)) * TypedValues.CycleType.TYPE_EASING;
                int i45 = i35 | i44;
                int i46 = ((i45 << 1) - (~(-((~(i44 & i35)) & i45)))) - 1;
                bbi.setOnFocusChangeListener(new Object[]{bArr2, bbcVar.v0, Integer.valueOf(i46)}, -2011745549, 2011745550, i46);
                int i47 = i46 + iIntValue;
                bbi.setOnFocusChangeListener(new Object[]{bArr2, bbcVar.f54420w0, Integer.valueOf(i47)}, -2011745549, 2011745550, i47);
                int i48 = i47 & iIntValue;
                int i49 = (((iIntValue | i47) & (~i48)) - (~(i48 << 1))) - 1;
                bbi.setOnFocusChangeListener(new Object[]{bArr2, bbcVar.f54421x0, Integer.valueOf(i49)}, -2011745549, 2011745550, i49);
                try {
                    bArr = (byte[]) bek.setOnFocusChangeListener(new Object[]{bArr2, (byte[]) bbi.setOnFocusChangeListener(new Object[]{bbcVar.f54422y0}, 258321496, -258321481, (int) System.currentTimeMillis())}, 1396275083, -1396275074, (int) System.currentTimeMillis());
                } catch (IOException e5) {
                    StringBuilder sb2 = new StringBuilder("error serializing bds state: ");
                    sb2.append(e5.getMessage());
                    throw new RuntimeException(sb2.toString());
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return bArr;
    }

    public static /* synthetic */ Object setX(Object[] objArr, int i10, int i11, int i12) {
        byte[] bArr;
        int i13 = ~i10;
        int i14 = ~i11;
        int i15 = ((~(i10 | i14)) * 69) + (((~(i11 | i12)) | (~(i13 | i12)) | (~(i13 | i11))) * (-69)) + (((~(i13 | i14 | i12)) | (~(i10 | i11 | i12))) * 69) + (i11 * (-68)) + (i10 * 70);
        if (i15 == 1) {
            return a(objArr);
        }
        if (i15 == 2) {
            return ((bbc) objArr[0]).f54418t0;
        }
        bbc bbcVar = (bbc) objArr[0];
        synchronized (bbcVar) {
            bArr = (byte[]) setX(new Object[]{bbcVar}, 983815655, -983815654, System.identityHashCode(bbcVar));
        }
        return bArr;
    }

    @Override // com.mypinpad.tsdk.isolation.ben
    public final byte[] setAlwaysDrawnWithCacheEnabled() throws IOException {
        return (byte[]) setX(new Object[]{this}, 143938088, -143938088, System.identityHashCode(this));
    }

    public final bbb setCompoundDrawableTintBlendMode() {
        return (bbb) setX(new Object[]{this}, 73833213, -73833211, System.identityHashCode(this));
    }

    public final byte[] setY() {
        return (byte[]) setX(new Object[]{this}, 983815655, -983815654, System.identityHashCode(this));
    }
}

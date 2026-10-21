package com.mypinpad.tsdk.isolation;

import java.io.IOException;
import mx.openpay.library.domain.util.Constant;

/* JADX INFO: loaded from: classes10.dex */
public final class baz extends bav implements ben {

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final bax f54380s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public final byte[] f54381t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public final byte[] f54382u0;
    public final byte[] v0;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public final byte[] f54383w0;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public volatile long f54384x0;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    public volatile bai f54385y0;

    public static class setY {

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public static int f54386i = 0;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public static int f54387j = 1;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final bax f54388a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public long f54389b = 0;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public long f54390c = -1;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public byte[] f54391d = null;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public byte[] f54392e = null;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public byte[] f54393f = null;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public byte[] f54394g = null;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public bai f54395h = null;

        public setY(bax baxVar) {
            this.f54388a = baxVar;
        }

        public static /* synthetic */ Object setOnFocusChangeListener(Object[] objArr, int i10, int i11, int i12) {
            setY sety;
            int i13;
            int i14 = ~i10;
            int i15 = (i14 * 677) + (i11 * (-676)) + (i10 * 678);
            int i16 = ~i11;
            switch (((~(i10 | i16)) * 677) + ((i14 | i16) * (-677)) + i15) {
                case 1:
                    baz bazVar = new baz((setY) objArr[0]);
                    int i17 = f54386i + 37;
                    f54387j = i17 % 128;
                    int i18 = i17 % 2;
                    return bazVar;
                case 2:
                    setY sety2 = (setY) objArr[0];
                    byte[] bArr = (byte[]) objArr[1];
                    int i19 = f54386i + 67;
                    f54387j = i19 % 128;
                    if (i19 % 2 == 0) {
                        sety2.f54394g = (byte[]) bbi.setOnFocusChangeListener(new Object[]{bArr}, -759448087, 759448096, (int) System.currentTimeMillis());
                        int i20 = 93 / 0;
                    } else {
                        sety2.f54394g = (byte[]) bbi.setOnFocusChangeListener(new Object[]{bArr}, -759448087, 759448096, (int) System.currentTimeMillis());
                    }
                    int i21 = f54387j;
                    int i22 = i21 ^ 13;
                    int i23 = (i21 & 13) << 1;
                    int i24 = (i22 & i23) + (i23 | i22);
                    f54386i = i24 % 128;
                    int i25 = i24 % 2;
                    return sety2;
                case 3:
                    setY sety3 = (setY) objArr[0];
                    byte[] bArr2 = (byte[]) objArr[1];
                    int i26 = f54387j + 101;
                    f54386i = i26 % 128;
                    int i27 = i26 % 2;
                    sety3.f54392e = (byte[]) bbi.setOnFocusChangeListener(new Object[]{bArr2}, -759448087, 759448096, (int) System.currentTimeMillis());
                    int i28 = f54387j;
                    int i29 = (i28 & (-8)) | ((~i28) & 7);
                    int i30 = -(-((i28 & 7) << 1));
                    int i31 = ((i29 | i30) << 1) - (i30 ^ i29);
                    f54386i = i31 % 128;
                    int i32 = i31 % 2;
                    return sety3;
                case 4:
                    setY sety4 = (setY) objArr[0];
                    int i33 = f54387j;
                    int i34 = i33 & 87;
                    int i35 = ((i33 | 87) & (~i34)) + (i34 << 1);
                    f54386i = i35 % 128;
                    int i36 = i35 % 2;
                    sety4.getClass();
                    int i37 = f54387j;
                    int i38 = (((i37 ^ 105) | (i37 & 105)) << 1) - (((~i37) & 105) | (i37 & (-106)));
                    f54386i = i38 % 128;
                    if (i38 % 2 == 0) {
                        return null;
                    }
                    throw null;
                case 5:
                    sety = (setY) objArr[0];
                    long jLongValue = ((Number) objArr[1]).longValue();
                    int i39 = f54386i;
                    int i40 = ((i39 & 50) + (i39 | 50)) - 1;
                    f54387j = i40 % 128;
                    int i41 = i40 % 2;
                    sety.f54390c = jLongValue;
                    if (i41 == 0) {
                        throw null;
                    }
                    break;
                case 6:
                    setY sety5 = (setY) objArr[0];
                    int i42 = f54386i;
                    int i43 = i42 | 77;
                    int i44 = (i43 << 1) - ((~(i42 & 77)) & i43);
                    f54387j = i44 % 128;
                    if (i44 % 2 != 0) {
                        return sety5.f54393f;
                    }
                    byte[] bArr3 = sety5.f54393f;
                    throw null;
                case 7:
                    setY sety6 = (setY) objArr[0];
                    int i45 = f54387j;
                    int i46 = i45 & 83;
                    int i47 = ((i45 ^ 83) | i46) << 1;
                    int i48 = -((~i46) & (i45 | 83));
                    int i49 = (i47 & i48) + (i47 | i48);
                    f54386i = i49 % 128;
                    int i50 = i49 % 2;
                    bax baxVar = sety6.f54388a;
                    int i51 = ((i45 & 5) - (~(-(-(i45 | 5))))) - 1;
                    f54386i = i51 % 128;
                    if (i51 % 2 == 0) {
                        return baxVar;
                    }
                    int i52 = 94 / 0;
                    return baxVar;
                case 8:
                    setY sety7 = (setY) objArr[0];
                    int i53 = (-2) - ((f54386i + 86) ^ (-1));
                    f54387j = i53 % 128;
                    int i54 = i53 % 2;
                    byte[] bArr4 = sety7.f54394g;
                    if (i54 == 0) {
                        int i55 = 91 / 0;
                    }
                    return bArr4;
                case 9:
                    setY sety8 = (setY) objArr[0];
                    int i56 = f54387j + 35;
                    f54386i = i56 % 128;
                    if (i56 % 2 == 0) {
                        return sety8.f54395h;
                    }
                    bai baiVar = sety8.f54395h;
                    throw null;
                case 10:
                    setY sety9 = (setY) objArr[0];
                    int i57 = f54386i;
                    int i58 = i57 & 65;
                    int i59 = -(-((i57 ^ 65) | i58));
                    int i60 = ((i58 | i59) << 1) - (i58 ^ i59);
                    f54387j = i60 % 128;
                    int i61 = i60 % 2;
                    byte[] bArr5 = sety9.f54391d;
                    int i62 = i57 ^ 107;
                    int i63 = -(-((i57 & 107) << 1));
                    int i64 = ((i62 | i63) << 1) - (i62 ^ i63);
                    f54387j = i64 % 128;
                    int i65 = i64 % 2;
                    return bArr5;
                case 11:
                    setY sety10 = (setY) objArr[0];
                    int i66 = f54387j;
                    int i67 = i66 ^ 121;
                    int i68 = -(-((i66 & 121) << 1));
                    int i69 = (i67 ^ i68) + ((i68 & i67) << 1);
                    int i70 = i69 % 128;
                    f54386i = i70;
                    if (i69 % 2 != 0) {
                        long j10 = sety10.f54390c;
                        throw null;
                    }
                    long j11 = sety10.f54390c;
                    int i71 = i70 + 65;
                    f54387j = i71 % 128;
                    int i72 = i71 % 2;
                    return Long.valueOf(j11);
                case 12:
                    sety = (setY) objArr[0];
                    bai baiVar2 = (bai) objArr[1];
                    int i73 = f54386i + 59;
                    f54387j = i73 % 128;
                    if (i73 % 2 != 0 ? ((Long) bai.setOnFocusChangeListener(new Object[]{baiVar2}, -1728564895, 1728564895, System.identityHashCode(baiVar2))).longValue() != 0 : ((Long) bai.setOnFocusChangeListener(new Object[]{baiVar2}, -1728564895, 1728564895, System.identityHashCode(baiVar2))).longValue() != 0) {
                        sety.f54395h = baiVar2;
                        int i74 = f54386i;
                        int i75 = i74 ^ 91;
                        i13 = (((i74 & 91) | i75) << 1) - i75;
                    } else {
                        sety.f54395h = new bai(baiVar2, (1 << sety.f54388a.setCompoundDrawableTintBlendMode()) - 1);
                        i13 = f54386i + 49;
                    }
                    f54387j = i13 % 128;
                    int i76 = i13 % 2;
                    int i77 = f54387j;
                    int i78 = i77 ^ 121;
                    int i79 = ((i77 & 121) | i78) << 1;
                    int i80 = -i78;
                    int i81 = (i79 & i80) + (i79 | i80);
                    f54386i = i81 % 128;
                    if (i81 % 2 != 0) {
                        throw null;
                    }
                    break;
                case 13:
                    sety = (setY) objArr[0];
                    long jLongValue2 = ((Number) objArr[1]).longValue();
                    int i82 = f54387j;
                    int i83 = i82 & 61;
                    int i84 = i82 | 61;
                    int i85 = ((i83 | i84) << 1) - (i83 ^ i84);
                    f54386i = i85 % 128;
                    int i86 = i85 % 2;
                    sety.f54389b = jLongValue2;
                    if (i86 != 0) {
                        throw null;
                    }
                    int i87 = ((i82 ^ 18) + ((i82 & 18) << 1)) - 1;
                    f54386i = i87 % 128;
                    if (i87 % 2 != 0) {
                        throw null;
                    }
                    break;
                case 14:
                    setY sety11 = (setY) objArr[0];
                    byte[] bArr6 = (byte[]) objArr[1];
                    int i88 = f54387j;
                    int i89 = i88 ^ 1;
                    int i90 = -(-((i88 & 1) << 1));
                    int i91 = (i89 & i90) + (i90 | i89);
                    f54386i = i91 % 128;
                    int i92 = i91 % 2;
                    sety11.f54393f = (byte[]) bbi.setOnFocusChangeListener(new Object[]{bArr6}, -759448087, 759448096, (int) System.currentTimeMillis());
                    int i93 = f54386i + 73;
                    f54387j = i93 % 128;
                    int i94 = i93 % 2;
                    return sety11;
                case 15:
                    setY sety12 = (setY) objArr[0];
                    byte[] bArr7 = (byte[]) objArr[1];
                    int i95 = f54387j;
                    int i96 = (i95 ^ 115) + ((i95 & 115) << 1);
                    f54386i = i96 % 128;
                    int i97 = i96 % 2;
                    sety12.f54391d = (byte[]) bbi.setOnFocusChangeListener(new Object[]{bArr7}, -759448087, 759448096, (int) System.currentTimeMillis());
                    int i98 = f54386i;
                    int i99 = i98 & 5;
                    int i100 = ((i98 ^ 5) | i99) << 1;
                    int i101 = -((i98 | 5) & (~i99));
                    int i102 = ((i100 | i101) << 1) - (i101 ^ i100);
                    f54387j = i102 % 128;
                    int i103 = i102 % 2;
                    return sety12;
                case 16:
                    setY sety13 = (setY) objArr[0];
                    int i104 = f54386i;
                    int i105 = (i104 ^ 119) + ((i104 & 119) << 1);
                    f54387j = i105 % 128;
                    if (i105 % 2 != 0) {
                        return sety13.f54392e;
                    }
                    byte[] bArr8 = sety13.f54392e;
                    throw null;
                case 17:
                    setY sety14 = (setY) objArr[0];
                    int i106 = f54387j;
                    int i107 = i106 & 33;
                    int i108 = i106 | 33;
                    int i109 = (i107 & i108) + (i108 | i107);
                    f54386i = i109 % 128;
                    int i110 = i109 % 2;
                    long j12 = sety14.f54389b;
                    if (i110 == 0) {
                        return Long.valueOf(j12);
                    }
                    throw null;
                default:
                    setY sety15 = (setY) objArr[0];
                    int i111 = f54387j;
                    int i112 = (i111 & 108) + (i111 | 108);
                    int i113 = (i112 ^ (-1)) + (i112 << 1);
                    f54386i = i113 % 128;
                    int i114 = i113 % 2;
                    sety15.getClass();
                    if (i114 != 0) {
                        throw null;
                    }
                    int i115 = f54387j;
                    int i116 = (((i115 | 16) << 1) - (i115 ^ 16)) - 1;
                    f54386i = i116 % 128;
                    if (i116 % 2 == 0) {
                        return null;
                    }
                    throw null;
            }
            return sety;
        }

        public final setY setCompoundDrawableTintBlendMode(byte[] bArr) {
            return (setY) setOnFocusChangeListener(new Object[]{this, bArr}, 1321504817, -1321504803, System.identityHashCode(this));
        }

        public final setY setDividerPadding(byte[] bArr) {
            return (setY) setOnFocusChangeListener(new Object[]{this, bArr}, -740996715, 740996717, System.identityHashCode(this));
        }

        public final baz setX() {
            return (baz) setOnFocusChangeListener(new Object[]{this}, -649834479, 649834480, System.identityHashCode(this));
        }

        public final setY setY(byte[] bArr) {
            return (setY) setOnFocusChangeListener(new Object[]{this, bArr}, -1082766226, 1082766241, System.identityHashCode(this));
        }

        public final setY setDividerPadding(long j10) {
            return (setY) setOnFocusChangeListener(new Object[]{this, Long.valueOf(j10)}, -962710601, 962710614, System.identityHashCode(this));
        }

        public final setY setOnFocusChangeListener(bai baiVar) {
            return (setY) setOnFocusChangeListener(new Object[]{this, baiVar}, -2104546983, 2104546995, System.identityHashCode(this));
        }

        public final setY setOnFocusChangeListener(byte[] bArr) {
            return (setY) setOnFocusChangeListener(new Object[]{this, bArr}, 116911589, -116911586, System.identityHashCode(this));
        }

        public final setY setOnFocusChangeListener(long j10) {
            return (setY) setOnFocusChangeListener(new Object[]{this, Long.valueOf(j10)}, -741617942, 741617947, System.identityHashCode(this));
        }
    }

    public baz(setY sety) {
        super(true, ((bax) setY.setOnFocusChangeListener(new Object[]{sety}, 2028976810, -2028976803, (int) System.currentTimeMillis())).setDividerPadding());
        bax baxVar = (bax) setY.setOnFocusChangeListener(new Object[]{sety}, 2028976810, -2028976803, (int) System.currentTimeMillis());
        this.f54380s0 = baxVar;
        if (baxVar == null) {
            throw new NullPointerException("params == null");
        }
        int iIntValue = ((Integer) bax.setOnFocusChangeListener(new Object[]{baxVar}, -1645560145, 1645560148, System.identityHashCode(baxVar))).intValue();
        byte[] bArr = (byte[]) setY.setOnFocusChangeListener(new Object[]{sety}, -2060371251, 2060371255, (int) System.currentTimeMillis());
        if (bArr == null) {
            this.f54384x0 = ((Long) setY.setOnFocusChangeListener(new Object[]{sety}, 857571706, -857571689, (int) System.currentTimeMillis())).longValue();
            byte[] bArr2 = (byte[]) setY.setOnFocusChangeListener(new Object[]{sety}, -556034461, 556034471, (int) System.currentTimeMillis());
            if (bArr2 == null) {
                this.f54381t0 = new byte[iIntValue];
            } else {
                if (bArr2.length != iIntValue) {
                    throw new IllegalArgumentException("size of secretKeySeed needs to be equal size of digest");
                }
                this.f54381t0 = bArr2;
            }
            byte[] bArr3 = (byte[]) setY.setOnFocusChangeListener(new Object[]{sety}, 1010054718, -1010054702, (int) System.currentTimeMillis());
            if (bArr3 == null) {
                this.f54382u0 = new byte[iIntValue];
            } else {
                if (bArr3.length != iIntValue) {
                    throw new IllegalArgumentException("size of secretKeyPRF needs to be equal size of digest");
                }
                this.f54382u0 = bArr3;
            }
            byte[] bArr4 = (byte[]) setY.setOnFocusChangeListener(new Object[]{sety}, 398774680, -398774674, (int) System.currentTimeMillis());
            if (bArr4 == null) {
                this.v0 = new byte[iIntValue];
            } else {
                if (bArr4.length != iIntValue) {
                    throw new IllegalArgumentException("size of publicSeed needs to be equal size of digest");
                }
                this.v0 = bArr4;
            }
            byte[] bArr5 = (byte[]) setY.setOnFocusChangeListener(new Object[]{sety}, -1020221297, 1020221305, (int) System.currentTimeMillis());
            if (bArr5 == null) {
                this.f54383w0 = new byte[iIntValue];
            } else {
                if (bArr5.length != iIntValue) {
                    throw new IllegalArgumentException("size of root needs to be equal size of digest");
                }
                this.f54383w0 = bArr5;
            }
            bai baiVar = (bai) setY.setOnFocusChangeListener(new Object[]{sety}, 357203718, -357203709, (int) System.currentTimeMillis());
            if (baiVar == null) {
                long jLongValue = ((Long) setY.setOnFocusChangeListener(new Object[]{sety}, 857571706, -857571689, (int) System.currentTimeMillis())).longValue();
                int iIntValue2 = ((Integer) bax.setOnFocusChangeListener(new Object[]{baxVar}, -1235800220, 1235800228, System.identityHashCode(baxVar))).intValue();
                baiVar = (!((Boolean) bbi.setOnFocusChangeListener(new Object[]{Integer.valueOf(iIntValue2), Long.valueOf(jLongValue)}, -1829337202, 1829337218, iIntValue2)).booleanValue() || bArr4 == null || bArr2 == null) ? new bai(((Long) setY.setOnFocusChangeListener(new Object[]{sety}, -1162448637, 1162448648, (int) System.currentTimeMillis())).longValue() + 1) : new bai(baxVar, ((Long) setY.setOnFocusChangeListener(new Object[]{sety}, 857571706, -857571689, (int) System.currentTimeMillis())).longValue(), bArr4, bArr2);
            }
            this.f54385y0 = baiVar;
            if (((Long) setY.setOnFocusChangeListener(new Object[]{sety}, -1162448637, 1162448648, (int) System.currentTimeMillis())).longValue() >= 0) {
                long jLongValue2 = ((Long) setY.setOnFocusChangeListener(new Object[]{sety}, -1162448637, 1162448648, (int) System.currentTimeMillis())).longValue();
                bai baiVar2 = this.f54385y0;
                if (jLongValue2 != ((Long) bai.setOnFocusChangeListener(new Object[]{baiVar2}, -1728564895, 1728564895, System.identityHashCode(baiVar2))).longValue()) {
                    throw new IllegalArgumentException("maxIndex set but not reflected in state");
                }
                return;
            }
            return;
        }
        if (((bbb) setY.setOnFocusChangeListener(new Object[]{sety}, -1287552953, 1287552953, (int) System.currentTimeMillis())) == null) {
            throw new NullPointerException("xmss == null");
        }
        int iIntValue3 = ((Integer) bax.setOnFocusChangeListener(new Object[]{baxVar}, -1235800220, 1235800228, System.identityHashCode(baxVar))).intValue();
        int iCurrentTimeMillis = (int) System.currentTimeMillis();
        int i10 = -(~(-(-(iIntValue3 * Constant.ERROR_CODE_408))));
        int i11 = (-2) - ((((-5691) & i10) + (i10 | (-5691))) ^ (-1));
        int i12 = ~iIntValue3;
        int i13 = i12 ^ 7;
        int i14 = i12 & 7;
        int i15 = ~((i13 ^ i14) | (i13 & i14));
        int i16 = iCurrentTimeMillis & 7;
        int i17 = (~i16) & (iCurrentTimeMillis | 7);
        int i18 = ~iCurrentTimeMillis;
        int i19 = ~((i17 ^ i16) | (i17 & i16));
        int i20 = -(-(((i15 ^ i19) | (i15 & i19)) * (-814)));
        int i21 = (((~i11) & i20) | ((~i20) & i11)) + ((i11 & i20) << 1);
        int i22 = (i18 | iCurrentTimeMillis) & i18;
        int i23 = i12 & i22;
        int i24 = (i22 | i12) & (~i23);
        int i25 = ~((i24 & i23) | (i24 ^ i23));
        int i26 = (i12 & (-8)) | (iIntValue3 & 7);
        int i27 = (-8) & iIntValue3;
        int i28 = ~((i26 ^ i27) | (i26 & i27));
        int i29 = ~i28;
        int i30 = (i25 & i29) | ((~i25) & i28);
        int i31 = i25 & i28;
        int i32 = (i30 ^ i31) | (i30 & i31);
        int i33 = iCurrentTimeMillis ^ 7;
        int i34 = ~((i33 ^ i16) | (i33 & i16));
        int i35 = ((~i34) & i32) | ((~i32) & i34);
        int i36 = i32 & i34;
        int i37 = -(~(((i35 & i36) | (i35 ^ i36)) * 407));
        int i38 = ((i21 & i37) + (i37 | i21)) - 1;
        int i39 = ~(((-8) & i18) | i16 | ((-8) & iCurrentTimeMillis));
        int i40 = ((~i39) & i28) | (i39 & i29);
        int i41 = i39 & i28;
        int i42 = (i41 & i40) | (i40 ^ i41);
        int i43 = iIntValue3 ^ iCurrentTimeMillis;
        int i44 = iCurrentTimeMillis & iIntValue3;
        int i45 = (i43 & i44) | (i43 ^ i44);
        int i46 = ~i45;
        int i47 = (i45 | i46) & i46;
        int i48 = -(-(((i42 & i47) | ((~i47) & i42) | ((~i42) & i47)) * 407));
        int i49 = i38 & i48;
        int i50 = i48 | i38;
        int i51 = ((i49 ^ i50) + ((i50 & i49) << 1)) / 8;
        this.f54384x0 = ((Long) bbi.setOnFocusChangeListener(new Object[]{bArr, Integer.valueOf(i51)}, 1947653658, -1947653646, i51)).longValue();
        if (!((Boolean) bbi.setOnFocusChangeListener(new Object[]{Integer.valueOf(iIntValue3), Long.valueOf(this.f54384x0)}, -1829337202, 1829337218, iIntValue3)).booleanValue()) {
            throw new IllegalArgumentException("index out of bounds");
        }
        this.f54381t0 = (byte[]) bbi.setOnFocusChangeListener(new Object[]{bArr, Integer.valueOf(i51), Integer.valueOf(iIntValue)}, 427617211, -427617208, i51);
        int i52 = -(-iIntValue);
        int i53 = ((i51 | i52) << 1) - (i51 ^ i52);
        this.f54382u0 = (byte[]) bbi.setOnFocusChangeListener(new Object[]{bArr, Integer.valueOf(i53), Integer.valueOf(iIntValue)}, 427617211, -427617208, i53);
        int i54 = ~iIntValue;
        int i55 = ((i53 & i54) | ((~i53) & iIntValue)) + ((i53 & iIntValue) << 1);
        this.v0 = (byte[]) bbi.setOnFocusChangeListener(new Object[]{bArr, Integer.valueOf(i55), Integer.valueOf(iIntValue)}, 427617211, -427617208, i55);
        int iCurrentTimeMillis2 = (int) System.currentTimeMillis();
        int i56 = iIntValue * (-1529);
        int i57 = i55 * (-764);
        int i58 = ((((i56 ^ i57) | (i56 & i57)) << 1) - (~(-(((~i56) & i57) | ((~i57) & i56))))) - 1;
        int i59 = ~i55;
        int i60 = (i59 | i55) & i59;
        int i61 = (i60 & i54) | (i54 ^ i60);
        int i62 = ~iCurrentTimeMillis2;
        int i63 = i61 & i62;
        int i64 = (~i63) & (i61 | i62);
        int i65 = ~((i64 & i63) | (i64 ^ i63));
        int i66 = (i55 & i54) | (i54 ^ i55);
        int i67 = ~((i66 & iCurrentTimeMillis2) | (i66 ^ iCurrentTimeMillis2));
        int i68 = (i65 & i67) | (i65 ^ i67);
        int i69 = (i59 ^ iIntValue) | (i59 & iIntValue);
        int i70 = ~((i69 & iCurrentTimeMillis2) | (i69 & i62) | ((~i69) & iCurrentTimeMillis2));
        int i71 = ((~i70) & i68) | ((~i68) & i70);
        int i72 = i68 & i70;
        int i73 = (i58 - (~(((i72 & i71) | (i71 ^ i72)) * 765))) - 1;
        int i74 = i54 & i59;
        int i75 = (~i74) & (i54 | i59);
        int i76 = ~((i74 & i75) | (i75 ^ i74));
        int i77 = (~i62) & i54;
        int i78 = ~i54;
        int i79 = i77 | (i62 & i78);
        int i80 = i54 & i62;
        int i81 = ~((i79 ^ i80) | (i79 & i80));
        int i82 = i76 ^ i81;
        int i83 = i76 & i81;
        int i84 = ((i82 & i83) | (i82 ^ i83)) * 1530;
        int i85 = ((i73 ^ i84) | (i73 & i84)) << 1;
        int i86 = -((i84 & (~i73)) | ((~i84) & i73));
        int i87 = ((i85 | i86) << 1) - (i86 ^ i85);
        int i88 = (iCurrentTimeMillis2 & i78) | i80;
        int i89 = i54 & iCurrentTimeMillis2;
        int i90 = ~((i88 & i89) | (i88 ^ i89));
        int i91 = (i59 ^ i62) | (i59 & i62);
        int i92 = i91 & iIntValue;
        int i93 = (i91 | iIntValue) & (~i92);
        int i94 = ~((i93 & i92) | (i93 ^ i92));
        int i95 = -(-(((i90 & i94) | (i90 ^ i94)) * 765));
        int i96 = i87 | i95;
        int i97 = i96 << 1;
        int i98 = -((~(i95 & i87)) & i96);
        int i99 = (i97 ^ i98) + ((i98 & i97) << 1);
        this.f54383w0 = (byte[]) bbi.setOnFocusChangeListener(new Object[]{bArr, Integer.valueOf(i99), Integer.valueOf(iIntValue)}, 427617211, -427617208, i99);
        int i100 = i99 & i52;
        int i101 = -(-((i52 ^ i99) | i100));
        int i102 = (i100 & i101) + (i100 | i101);
        int length = bArr.length;
        int i103 = -i102;
        int iCurrentTimeMillis3 = (int) System.currentTimeMillis();
        int i104 = i103 * (-495);
        int i105 = length * (-495);
        int i106 = i104 & i105;
        int i107 = (i104 | i105) & (~i106);
        int i108 = i106 << 1;
        int i109 = (i107 & i108) + (i107 | i108);
        int i110 = ~i103;
        int i111 = (i110 | i103) & i110;
        int i112 = ~length;
        int i113 = (i112 | length) & i112;
        int i114 = ~((i113 & i111) | (i111 ^ i113));
        int i115 = i111 ^ iCurrentTimeMillis3;
        int i116 = ~iCurrentTimeMillis3;
        int i117 = i111 & iCurrentTimeMillis3;
        int i118 = ~((i117 & i115) | (i115 ^ i117));
        int i119 = -(-(((i118 & i114) | (i114 ^ i118)) * 992));
        int i120 = (((~i119) & i109) | ((~i109) & i119)) + ((i119 & i109) << 1);
        int i121 = (i110 ^ i112) | (i110 & i112);
        int i122 = ~i121;
        int i123 = (i121 | i122) & i122;
        int i124 = (i110 & i116) | ((~i110) & iCurrentTimeMillis3);
        int i125 = i110 & iCurrentTimeMillis3;
        int i126 = (i125 & i124) | (i124 ^ i125);
        int i127 = ~i126;
        int i128 = (i126 | i127) & i127;
        int i129 = ((~i128) & i123) | ((~i123) & i128);
        int i130 = i128 & i123;
        int i131 = (i130 & i129) | (i129 ^ i130);
        int i132 = i116 & i103;
        int i133 = ((i103 | i116) & (~i132)) | i132;
        int i134 = ~((i133 & length) | (i133 ^ length));
        int i135 = ((i134 & i131) | (i131 ^ i134)) * (-496);
        int i136 = i120 & i135;
        int i137 = (i135 ^ i120) | i136;
        try {
            bai baiVar3 = (bai) bbi.setOnFocusChangeListener(new Object[]{(byte[]) bbi.setOnFocusChangeListener(new Object[]{bArr, Integer.valueOf(i102), Integer.valueOf((((i136 ^ i137) + ((i137 & i136) << 1)) - (~(((length & iCurrentTimeMillis3) | (length ^ iCurrentTimeMillis3)) * 496))) - 1)}, 427617211, -427617208, i102), bai.class}, -145577911, 145577915, (int) System.currentTimeMillis());
            bbb bbbVar = (bbb) setY.setOnFocusChangeListener(new Object[]{sety}, -1287552953, 1287552953, (int) System.currentTimeMillis());
            this.f54385y0 = (bai) bai.setOnFocusChangeListener(new Object[]{baiVar3, (adu) bbb.setCompoundDrawableTintBlendMode(new Object[]{bbbVar}, -2019059677, 2019059677, System.identityHashCode(bbbVar))}, -881598749, 881598754, System.identityHashCode(baiVar3));
        } catch (IOException e5) {
            throw new IllegalArgumentException(e5.getMessage(), e5);
        } catch (ClassNotFoundException e7) {
            throw new IllegalArgumentException(e7.getMessage(), e7);
        }
    }

    public static /* synthetic */ Object a(Object[] objArr) {
        byte[] bArr;
        baz bazVar = (baz) objArr[0];
        synchronized (bazVar) {
            try {
                bax baxVar = bazVar.f54380s0;
                int iIntValue = ((Integer) bax.setOnFocusChangeListener(new Object[]{baxVar}, -1645560145, 1645560148, System.identityHashCode(baxVar))).intValue();
                bax baxVar2 = bazVar.f54380s0;
                int iIntValue2 = ((Integer) bax.setOnFocusChangeListener(new Object[]{baxVar2}, -1235800220, 1235800228, System.identityHashCode(baxVar2))).intValue();
                int i10 = (iIntValue2 & (-8)) | ((~iIntValue2) & 7);
                int i11 = -(-((iIntValue2 & 7) << 1));
                int i12 = ((i10 ^ i11) + ((i11 & i10) << 1)) / 8;
                int iIdentityHashCode = System.identityHashCode(bazVar);
                int i13 = iIntValue * 50;
                int i14 = i12 * (-97);
                int i15 = i13 & i14;
                int i16 = -(-(i13 | i14));
                int i17 = ((i15 | i16) << 1) - (i16 ^ i15);
                int i18 = ~i12;
                int i19 = ~iIdentityHashCode;
                int i20 = i18 ^ i19;
                int i21 = i18 & i19;
                int i22 = ~((i20 & i21) | (i20 ^ i21));
                int i23 = ~i12;
                int i24 = i23 & iIntValue;
                int i25 = (~i24) & (i23 | iIntValue);
                int i26 = ~iIntValue;
                int i27 = ~((i24 & i25) | (i25 ^ i24));
                int i28 = ((i22 & i27) | (i22 ^ i27)) * 98;
                int i29 = ((~i28) & i17) | ((~i17) & i28);
                int i30 = -(-((i17 & i28) << 1));
                int i31 = ((i29 | i30) << 1) - (i30 ^ i29);
                int i32 = ~iIntValue;
                int i33 = ~((i19 & i32) | (i32 ^ i19));
                int i34 = i23 & i33;
                int i35 = (i33 | i23) & (~i34);
                int i36 = (i35 & i34) | (i35 ^ i34);
                int i37 = ~((iIntValue ^ iIdentityHashCode) | (iIntValue & iIdentityHashCode));
                int i38 = i36 & i37;
                int i39 = (i36 | i37) & (~i38);
                int i40 = (((i39 & i38) | (i39 ^ i38)) * (-49)) + i31;
                int i41 = ~(iIdentityHashCode | i18);
                int i42 = (iIntValue & i23) | (i12 & i26);
                int i43 = iIntValue & i12;
                int i44 = ~((i42 & i43) | (i42 ^ i43));
                int i45 = -(-(((i41 & i44) | (i41 ^ i44)) * 49));
                int i46 = ((i40 ^ i45) | (i40 & i45)) << 1;
                int i47 = -((i45 & (~i40)) | ((~i45) & i40));
                int i48 = ((i46 | i47) << 1) - (i47 ^ i46);
                int iIdentityHashCode2 = System.identityHashCode(bazVar);
                int i49 = ((iIntValue * (-183)) - (~(i48 * (-183)))) - 1;
                int i50 = ~iIdentityHashCode2;
                int i51 = (i32 ^ i50) | (i32 & i50);
                int i52 = i51 & i48;
                int i53 = (i51 | i48) & (~i52);
                int i54 = ~i48;
                int i55 = ~(i53 | i52);
                int i56 = ~i48;
                int i57 = i56 & i50;
                int i58 = (~i57) & (i56 | i50);
                int i59 = (i58 ^ i57) | (i58 & i57);
                int i60 = i59 & iIntValue;
                int i61 = (i59 | iIntValue) & (~i60);
                int i62 = ~((i61 & i60) | (i61 ^ i60));
                int i63 = -(-(((i62 & i55) | (i55 ^ i62)) * (-184)));
                int i64 = i49 & i63;
                int i65 = -(-((i63 ^ i49) | i64));
                int i66 = (i64 & i65) + (i65 | i64);
                int i67 = ~(i26 | i54);
                int i68 = i32 ^ i50;
                int i69 = i32 & i50;
                int i70 = ~((i68 & i69) | (i68 ^ i69));
                int i71 = (i67 & i70) | ((~i70) & i67) | ((~i67) & i70);
                int i72 = i56 & i50;
                int i73 = (i50 | i56) & (~i72);
                int i74 = ~((i72 & i73) | (i73 ^ i72));
                int i75 = (i66 - (~(-(-(((i71 & i74) | (i71 ^ i74)) * 184))))) - 1;
                int i76 = iIntValue ^ i48;
                int i77 = iIntValue & i48;
                int i78 = (i75 - (~(((i76 & i77) | (i76 ^ i77)) * 184))) - 1;
                int i79 = -(-iIntValue);
                int i80 = ((-1) << 1) - ((i78 - (~i79)) ^ (-1));
                int i81 = i80 & i79;
                byte[] bArr2 = new byte[i81 + ((i80 ^ i79) | i81)];
                bbi.setOnFocusChangeListener(new Object[]{bArr2, (byte[]) bbi.setOnFocusChangeListener(new Object[]{Long.valueOf(bazVar.f54384x0), Integer.valueOf(i12)}, 450291415, -450291415, i12), 0}, -2011745549, 2011745550, 0);
                bbi.setOnFocusChangeListener(new Object[]{bArr2, bazVar.f54381t0, Integer.valueOf(i12)}, -2011745549, 2011745550, i12);
                int iIdentityHashCode3 = System.identityHashCode(bazVar);
                int i82 = iIntValue * 465;
                int i83 = -(-(i12 * (-463)));
                int i84 = (i82 & i83) + (i82 | i83);
                int i85 = ~iIdentityHashCode3;
                int i86 = i18 & i85;
                int i87 = ~(((~i86) & (i18 | i85)) | i86);
                int i88 = i18 & iIntValue;
                int i89 = (~i88) & (i18 | iIntValue);
                int i90 = (i89 ^ i88) | (i89 & i88);
                int i91 = ((~i90) | i90) & (~i90);
                int i92 = (i91 & i87) | (i87 ^ i91);
                int i93 = (~iIdentityHashCode3) & (i85 | iIdentityHashCode3);
                int i94 = ~((i93 & iIntValue) | (i93 ^ iIntValue));
                int i95 = i92 ^ i94;
                int i96 = i92 & i94;
                int i97 = -(-(((i96 & i95) | (i95 ^ i96)) * 464));
                int i98 = i84 & i97;
                int i99 = ((((i84 ^ i97) | i98) << 1) - (~(-((i84 | i97) & (~i98))))) - 1;
                int i100 = (~iIntValue) & (i26 | iIntValue);
                int i101 = (i85 & i100) | ((~i100) & iIdentityHashCode3);
                int i102 = i100 & iIdentityHashCode3;
                int i103 = (i102 & i101) | (i101 ^ i102);
                int i104 = i103 ^ i23;
                int i105 = i103 & i23;
                int i106 = -(-(((i105 & i104) | (i104 ^ i105)) * (-464)));
                int i107 = i99 & i106;
                int i108 = (((i99 ^ i106) | i107) << 1) - ((i106 | i99) & (~i107));
                int i109 = (i23 | i12) & i18;
                int i110 = i109 & iIntValue;
                int i111 = (i109 | iIntValue) & (~i110);
                int i112 = ~((i111 & i110) | (i111 ^ i110));
                int i113 = iIntValue ^ iIdentityHashCode3;
                int i114 = iIntValue & iIdentityHashCode3;
                int i115 = ~((i114 & i113) | (i113 ^ i114));
                int i116 = i112 & i115;
                int i117 = (i115 | i112) & (~i116);
                int i118 = -(-(((i117 & i116) | (i117 ^ i116)) * 464));
                int i119 = (i108 ^ i118) + ((i118 & i108) << 1);
                bbi.setOnFocusChangeListener(new Object[]{bArr2, bazVar.f54382u0, Integer.valueOf(i119)}, -2011745549, 2011745550, i119);
                int i120 = i119 & i79;
                int i121 = (i120 - (~(-(-((i79 ^ i119) | i120))))) - 1;
                bbi.setOnFocusChangeListener(new Object[]{bArr2, bazVar.v0, Integer.valueOf(i121)}, -2011745549, 2011745550, i121);
                int i122 = -i32;
                int i123 = ((-1) << 1) - (((i121 & i122) + (i121 | i122)) ^ (-1));
                bbi.setOnFocusChangeListener(new Object[]{bArr2, bazVar.f54383w0, Integer.valueOf(i123)}, -2011745549, 2011745550, i123);
                try {
                    bArr = (byte[]) bek.setOnFocusChangeListener(new Object[]{bArr2, (byte[]) bbi.setOnFocusChangeListener(new Object[]{bazVar.f54385y0}, 258321496, -258321481, (int) System.currentTimeMillis())}, 1396275083, -1396275074, (int) System.currentTimeMillis());
                } catch (IOException e5) {
                    StringBuilder sb2 = new StringBuilder("error serializing bds state: ");
                    sb2.append(e5.getMessage());
                    throw new IllegalStateException(sb2.toString(), e5);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return bArr;
    }

    public static /* synthetic */ Object setCompoundDrawableTintBlendMode(Object[] objArr, int i10, int i11, int i12) {
        byte[] bArr;
        int i13 = ~i12;
        int i14 = ~(i13 | i10);
        int i15 = ~((~i10) | i11);
        int i16 = (((~(i10 | (~i11))) | i15 | i14) * 764) + (((~(i13 | i11)) | i15) * (-1528)) + ((i11 | i14) * 764) + (i11 * (-1527)) + (i10 * 765);
        if (i16 != 1) {
            if (i16 == 2) {
                return a(objArr);
            }
            baz bazVar = (baz) objArr[0];
            synchronized (bazVar) {
                bArr = (byte[]) setCompoundDrawableTintBlendMode(new Object[]{bazVar}, 1883648572, -1883648570, System.identityHashCode(bazVar));
            }
            return bArr;
        }
        baz bazVar2 = (baz) objArr[0];
        bax baxVar = bazVar2.f54380s0;
        System.identityHashCode(bazVar2);
        int iIdentityHashCode = System.identityHashCode(bazVar2);
        int i17 = ~iIdentityHashCode;
        int i18 = ((~i17) & (-97167869)) | (97167868 & i17);
        int i19 = (-97167869) & i17;
        int i20 = ~((i18 & i19) | (i18 ^ i19));
        int i21 = ((-92318021) & i20) | ((~i20) & 92318020);
        int i22 = i20 & 92318020;
        int i23 = (i22 & i21) | (i21 ^ i22);
        int i24 = (-707003393) ^ iIdentityHashCode;
        int i25 = (-707003393) & iIdentityHashCode;
        int i26 = ~((i24 & i25) | (i24 ^ i25));
        int i27 = -(~(((i23 & i26) | ((~i26) & i23) | ((~i23) & i26)) * (-713)));
        int i28 = (-2) - ((((625015064 | i27) << 1) - (i27 ^ 625015064)) ^ (-1));
        int i29 = -(-((~(((iIdentityHashCode | (-707003393)) & (~i25)) | i25)) * 1426));
        int i30 = ((i28 | i29) << 1) - (i29 ^ i28);
        int i31 = (-711853241) & i17;
        int i32 = ((-711853241) | i17) & (~i31);
        int i33 = -(-((~((i32 & i31) | (i32 ^ i31))) * 713));
        if (1099328161 > (i30 ^ i33) + ((i33 & i30) << 1)) {
            return baxVar;
        }
        throw null;
    }

    @Override // com.mypinpad.tsdk.isolation.ben
    public final byte[] setAlwaysDrawnWithCacheEnabled() throws IOException {
        return (byte[]) setCompoundDrawableTintBlendMode(new Object[]{this}, -93418388, 93418388, System.identityHashCode(this));
    }

    public final bax setDividerPadding() {
        return (bax) setCompoundDrawableTintBlendMode(new Object[]{this}, 211369596, -211369595, System.identityHashCode(this));
    }

    public final byte[] setY() {
        return (byte[]) setCompoundDrawableTintBlendMode(new Object[]{this}, 1883648572, -1883648570, System.identityHashCode(this));
    }
}

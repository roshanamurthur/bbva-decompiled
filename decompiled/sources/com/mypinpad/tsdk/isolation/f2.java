package com.mypinpad.tsdk.isolation;

import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;

/* JADX INFO: loaded from: classes10.dex */
public final class f2 implements ben {

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public static int f55470s0 = 0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public static int f55471t0 = 1;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final axw f55472p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final byte[] f55473q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final byte[] f55474r0;

    public f2(axw axwVar, byte[] bArr, byte[] bArr2) {
        this.f55472p0 = axwVar;
        this.f55473q0 = bArr;
        this.f55474r0 = bArr2;
    }

    /* JADX WARN: Code duplicated, block: B:64:0x02c0  */
    /* JADX WARN: Code duplicated, block: B:65:0x02c1  */
    /* JADX WARN: Code duplicated, block: B:67:0x02cb  */
    /* JADX WARN: Code duplicated, block: B:69:0x02ea  */
    /* JADX WARN: Code duplicated, block: B:71:0x02ef  */
    /* JADX WARN: Code duplicated, block: B:73:0x0302  */
    /* JADX WARN: Code duplicated, block: B:77:0x030d  */
    public static /* synthetic */ Object a(Object[] objArr, int i10, int i11, int i12) throws Throwable {
        int i13;
        int iHashCode;
        int i14;
        int i15;
        int i16;
        f2 f2Var;
        int i17;
        int i18 = (i11 * (-978)) + (i10 * 980);
        int i19 = ~i11;
        int i20 = ~i12;
        int i21 = (((~(i10 | i20)) | (~(i19 | i12))) * 979) + ((i10 | i12) * (-979)) + ((~(i19 | i20)) * 979) + i18;
        int i22 = 0;
        if (i21 == 1) {
            f2 f2Var2 = (f2) objArr[0];
            int i23 = f55470s0;
            int i24 = (i23 & (-96)) | ((~i23) & 95);
            int i25 = -(-((i23 & 95) << 1));
            int i26 = ((i24 | i25) << 1) - (i24 ^ i25);
            int i27 = i26 % 128;
            f55471t0 = i27;
            int i28 = i26 % 2;
            axw axwVar = f2Var2.f55472p0;
            if (axwVar != null) {
                int i29 = ((i27 | 85) << 1) - (i27 ^ 85);
                f55470s0 = i29 % 128;
                if (i29 % 2 != 0) {
                    iHashCode = axwVar.hashCode();
                    int i30 = 91 / 0;
                } else {
                    iHashCode = axwVar.hashCode();
                }
                i22 = iHashCode;
                int i31 = f55471t0;
                int i32 = (i31 & 86) + (i31 | 86);
                i13 = (i32 ^ (-1)) + (i32 << 1);
                f55470s0 = i13 % 128;
            } else {
                i13 = i23 + 37;
                f55471t0 = i13 % 128;
            }
            int i33 = i13 % 2;
            int i34 = i22 * 31;
            int iHashCode2 = Arrays.hashCode(f2Var2.f55473q0);
            int i35 = ((i34 ^ iHashCode2) - (~((iHashCode2 & i34) << 1))) - 1;
            int i36 = i35 * 31;
            int iHashCode3 = Arrays.hashCode(f2Var2.f55474r0);
            int iIdentityHashCode = System.identityHashCode(f2Var2);
            int i37 = iHashCode3 * 755;
            int i38 = i35 * (-23343);
            int i39 = i37 & i38;
            int i40 = -(-(i38 | i37));
            int i41 = (i39 ^ i40) + ((i40 & i39) << 1);
            int i42 = ~iHashCode3;
            int i43 = i42 & i36;
            int i44 = (~i43) & (i42 | i36);
            int i45 = ~((i44 & i43) | (i44 ^ i43));
            int i46 = i42 & iIdentityHashCode;
            int i47 = (~i46) & (i42 | iIdentityHashCode);
            int i48 = ~iIdentityHashCode;
            int i49 = ~((i46 & i47) | (i47 ^ i46));
            int i50 = i45 ^ i49;
            int i51 = i45 & i49;
            int i52 = (i51 & i50) | (i50 ^ i51);
            int i53 = ~((i36 ^ iIdentityHashCode) | (i36 & iIdentityHashCode));
            int i54 = i52 ^ i53;
            int i55 = i52 & i53;
            int i56 = -(~(((i55 & i54) | (i54 ^ i55)) * (-754)));
            int i57 = (((i41 | i56) << 1) - (i41 ^ i56)) - 1;
            int i58 = i42 ^ i36;
            int i59 = (i58 & i43) | (i58 ^ i43);
            int i60 = (i59 & iIdentityHashCode) | (i59 & i48) | ((~i59) & iIdentityHashCode);
            int i61 = ~i60;
            int i62 = (i60 | i61) & i61;
            int i63 = (i48 ^ iHashCode3) | (i48 & iHashCode3);
            int i64 = i63 & i36;
            int i65 = (i36 | i63) & (~i64);
            int i66 = ~((i65 & i64) | (i65 ^ i64));
            int i67 = i62 & i66;
            int i68 = (i66 | i62) & (~i67);
            int i69 = -(-(((i68 & i67) | (i68 ^ i67)) * (-754)));
            int i70 = i57 ^ i69;
            int i71 = (((i69 & i57) | i70) << 1) - i70;
            int i72 = (iHashCode3 | i42) & i42;
            int i73 = (iIdentityHashCode | i48) & i48;
            int i74 = i72 ^ i73;
            int i75 = i73 & i72;
            int i76 = ((i75 & i74) | (i74 ^ i75)) * 754;
            int i77 = ((~i76) & i71) | ((~i71) & i76);
            int i78 = (i76 & i71) << 1;
            int i79 = (i77 ^ i78) + ((i78 & i77) << 1);
            int i80 = f55470s0;
            int i81 = ((i80 & 62) + (i80 | 62)) - 1;
            f55471t0 = i81 % 128;
            int i82 = i81 % 2;
            return Integer.valueOf(i79);
        }
        DataInputStream dataInputStream = null;
        if (i21 != 2) {
            if (i21 != 3) {
                f2 f2Var3 = (f2) objArr[0];
                int i83 = f55471t0;
                int i84 = ((i83 & (-38)) | ((~i83) & 37)) + ((i83 & 37) << 1);
                f55470s0 = i84 % 128;
                int i85 = i84 % 2;
                axr axrVar = (axr) axr.setDividerPadding(new Object[0], -776185694, 776185694, (int) System.currentTimeMillis());
                axw axwVar2 = f2Var3.f55472p0;
                int iIntValue = ((Integer) axw.setOnFocusChangeListener(new Object[]{axwVar2}, 1670377334, -1670377333, System.identityHashCode(axwVar2))).intValue();
                axr axrVar2 = (axr) axr.setDividerPadding(new Object[]{axrVar, Integer.valueOf(iIntValue)}, 1810000667, -1810000665, iIntValue);
                axr axrVar3 = (axr) axr.setDividerPadding(new Object[]{axrVar2, f2Var3.f55473q0}, 195178378, -195178377, System.identityHashCode(axrVar2));
                axr axrVar4 = (axr) axr.setDividerPadding(new Object[]{axrVar3, f2Var3.f55474r0}, 195178378, -195178377, System.identityHashCode(axrVar3));
                byte[] bArr = (byte[]) axr.setDividerPadding(new Object[]{axrVar4}, 1746305515, -1746305507, System.identityHashCode(axrVar4));
                int i86 = (-2) - ((f55471t0 + 66) ^ (-1));
                f55470s0 = i86 % 128;
                if (i86 % 2 == 0) {
                    return bArr;
                }
                int i87 = 41 / 0;
                return bArr;
            }
            Object obj = objArr[0];
            while (!(obj instanceof f2)) {
                if (obj instanceof DataInputStream) {
                    DataInputStream dataInputStream2 = (DataInputStream) obj;
                    int i88 = dataInputStream2.readInt();
                    axw axwVar3 = (axw) axw.setOnFocusChangeListener(new Object[]{Integer.valueOf(i88)}, 1003383068, -1003383065, i88);
                    byte[] bArr2 = new byte[((Integer) axw.setOnFocusChangeListener(new Object[]{axwVar3}, -2053068740, 2053068745, System.identityHashCode(axwVar3))).intValue()];
                    dataInputStream2.readFully(bArr2);
                    byte[] bArr3 = new byte[((Integer) axw.setOnFocusChangeListener(new Object[]{axwVar3}, -2053068740, 2053068745, System.identityHashCode(axwVar3))).intValue() * ((Integer) axw.setOnFocusChangeListener(new Object[]{axwVar3}, 1831336568, -1831336562, System.identityHashCode(axwVar3))).intValue()];
                    dataInputStream2.readFully(bArr3);
                    f2 f2Var4 = new f2(axwVar3, bArr2, bArr3);
                    int i89 = f55470s0;
                    int i90 = i89 & 63;
                    int i91 = (i89 ^ 63) | i90;
                    int i92 = (i90 ^ i91) + ((i91 & i90) << 1);
                    f55471t0 = i92 % 128;
                    if (i92 % 2 != 0) {
                        return f2Var4;
                    }
                    throw null;
                }
                if (obj instanceof byte[]) {
                    try {
                        DataInputStream dataInputStream3 = new DataInputStream(new ByteArrayInputStream((byte[]) obj));
                        try {
                            f2Var = (f2) a(new Object[]{dataInputStream3}, 1352675476, -1352675473, (int) System.currentTimeMillis());
                            dataInputStream3.close();
                            int i93 = f55470s0;
                            int i94 = i93 & 61;
                            int i95 = (i93 ^ 61) | i94;
                            int i96 = ((i94 | i95) << 1) - (i95 ^ i94);
                            f55471t0 = i96 % 128;
                            if (i96 % 2 != 0) {
                                return f2Var;
                            }
                            i17 = 28;
                            int i97 = i17 / 0;
                            return f2Var;
                        } catch (Throwable th2) {
                            th = th2;
                            dataInputStream = dataInputStream3;
                            if (dataInputStream != null) {
                                dataInputStream.close();
                                int i98 = f55471t0 + 93;
                                f55470s0 = i98 % 128;
                                int i99 = i98 % 2;
                            }
                            throw th;
                        }
                    } catch (Throwable th3) {
                        th = th3;
                    }
                } else {
                    if (!(obj instanceof InputStream)) {
                        throw new IllegalArgumentException("cannot parse ".concat(String.valueOf(obj)));
                    }
                    int i100 = f55470s0;
                    int i101 = i100 & 31;
                    int i102 = i101 + ((i100 ^ 31) | i101);
                    f55471t0 = i102 % 128;
                    InputStream inputStream = (InputStream) obj;
                    if (i102 % 2 == 0) {
                        obj = (byte[]) bfc.setOnFocusChangeListener(new Object[]{inputStream}, 1574614765, -1574614762, (int) System.currentTimeMillis());
                        int i103 = 43 / 0;
                    } else {
                        obj = (byte[]) bfc.setOnFocusChangeListener(new Object[]{inputStream}, 1574614765, -1574614762, (int) System.currentTimeMillis());
                    }
                    int i104 = f55470s0;
                    int i105 = ((i104 & 88) + (i104 | 88)) - 1;
                    f55471t0 = i105 % 128;
                    int i106 = i105 % 2;
                }
            }
            int i107 = f55471t0 + 71;
            f55470s0 = i107 % 128;
            f2Var = (f2) obj;
            if (i107 % 2 == 0) {
                return f2Var;
            }
            i17 = 76;
            int i910 = i17 / 0;
            return f2Var;
        }
        f2 f2Var5 = (f2) objArr[0];
        Object obj2 = objArr[1];
        int i108 = f55470s0;
        int i109 = (i108 | 75) << 1;
        int i110 = ~i108;
        int i111 = -((i108 & (-76)) | (i110 & 75));
        int i112 = (i109 ^ i111) + ((i109 & i111) << 1);
        int i113 = i112 % 128;
        f55471t0 = i113;
        int i114 = i112 % 2;
        if (f2Var5 == obj2) {
            int i115 = i108 ^ 87;
            int i116 = (i108 & 87) << 1;
            int i117 = ((i115 | i116) << 1) - (i115 ^ i116);
            f55471t0 = i117 % 128;
            int i118 = i117 % 2;
            int i119 = ((i108 ^ 121) | (i108 & 121)) << 1;
            int i120 = -((i108 & (-122)) | (i110 & 121));
            int i121 = (i119 ^ i120) + ((i119 & i120) << 1);
            f55471t0 = i121 % 128;
            int i122 = i121 % 2;
            return Boolean.TRUE;
        }
        if (obj2 != null) {
            int i123 = (i113 & 59) + (i113 | 59);
            f55470s0 = i123 % 128;
            if (i123 % 2 != 0) {
                f2Var5.getClass();
                throw null;
            }
            if (f2Var5.getClass() != obj2.getClass()) {
                int i124 = f55470s0;
                int i125 = i124 & 105;
                int i126 = i125 + ((i124 ^ 105) | i125);
                f55471t0 = i126 % 128;
                int i127 = i126 % 2;
            } else {
                f2 f2Var6 = (f2) obj2;
                axw axwVar4 = f2Var6.f55472p0;
                axw axwVar5 = f2Var5.f55472p0;
                if (axwVar5 != null) {
                    int i128 = f55470s0;
                    int i129 = i128 & 63;
                    int i130 = ((((i128 ^ 63) | i129) << 1) - (~(-((i128 | 63) & (~i129))))) - 1;
                    f55471t0 = i130 % 128;
                    int i131 = i130 % 2;
                    if (!axwVar5.equals(axwVar4)) {
                        int i132 = f55471t0 + 114;
                        int i133 = (i132 ^ (-1)) + (i132 << 1);
                        f55470s0 = i133 % 128;
                        int i134 = i133 % 2;
                        int i135 = f55471t0;
                        int i136 = i135 & 53;
                        i16 = i136 + ((i135 ^ 53) | i136);
                        f55470s0 = i16 % 128;
                        if (i16 % 2 != 0) {
                            throw null;
                        }
                    } else {
                        if (!Arrays.equals(f2Var5.f55473q0, f2Var6.f55473q0)) {
                            boolean zEquals = Arrays.equals(f2Var5.f55474r0, f2Var6.f55474r0);
                            i14 = f55471t0 + 123;
                            f55470s0 = i14 % 128;
                            if (i14 % 2 != 0) {
                                int i137 = 1 / 0;
                            }
                            return Boolean.valueOf(zEquals);
                        }
                        int i138 = f55471t0;
                        int i139 = i138 + 73;
                        f55470s0 = i139 % 128;
                        int i140 = i139 % 2;
                        int i141 = (i138 | 49) << 1;
                        int i142 = -(((~i138) & 49) | (i138 & (-50)));
                        i15 = (i141 ^ i142) + ((i142 & i141) << 1);
                        f55470s0 = i15 % 128;
                        if (i15 % 2 != 0) {
                            int i143 = 0 / 0;
                        }
                    }
                } else if (axwVar4 != null) {
                    int i1310 = f55471t0;
                    int i1311 = i1310 & 53;
                    i16 = i1311 + ((i1310 ^ 53) | i1311);
                    f55470s0 = i16 % 128;
                    if (i16 % 2 != 0) {
                        throw null;
                    }
                } else {
                    if (!Arrays.equals(f2Var5.f55473q0, f2Var6.f55473q0)) {
                        boolean zEquals2 = Arrays.equals(f2Var5.f55474r0, f2Var6.f55474r0);
                        i14 = f55471t0 + 123;
                        f55470s0 = i14 % 128;
                        if (i14 % 2 != 0) {
                            int i1312 = 1 / 0;
                        }
                        return Boolean.valueOf(zEquals2);
                    }
                    int i1313 = f55471t0;
                    int i1314 = i1313 + 73;
                    f55470s0 = i1314 % 128;
                    int i144 = i1314 % 2;
                    int i145 = (i1313 | 49) << 1;
                    int i146 = -(((~i1313) & 49) | (i1313 & (-50)));
                    i15 = (i145 ^ i146) + ((i146 & i145) << 1);
                    f55470s0 = i15 % 128;
                    if (i15 % 2 != 0) {
                        int i147 = 0 / 0;
                    }
                }
            }
        } else {
            int i1210 = f55470s0;
            int i1211 = i1210 & 105;
            int i1212 = i1211 + ((i1210 ^ 105) | i1211);
            f55471t0 = i1212 % 128;
            int i1213 = i1212 % 2;
        }
        return Boolean.FALSE;
    }

    public final boolean equals(Object obj) {
        return ((Boolean) a(new Object[]{this, obj}, 8624768, -8624766, System.identityHashCode(this))).booleanValue();
    }

    public final int hashCode() {
        return ((Integer) a(new Object[]{this}, -1780773916, 1780773917, System.identityHashCode(this))).intValue();
    }

    @Override // com.mypinpad.tsdk.isolation.ben
    public final byte[] setAlwaysDrawnWithCacheEnabled() throws IOException {
        return (byte[]) a(new Object[]{this}, 871997978, -871997978, System.identityHashCode(this));
    }
}

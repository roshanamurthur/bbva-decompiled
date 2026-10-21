package com.mypinpad.tsdk.isolation;

import androidx.appcompat.app.i;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import java.io.Serializable;
import kotlin.collections.ArraysKt___ArraysJvmKt;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.ranges.c;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
public final class r1 extends t {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ KProperty<Object>[] f58040j = {i.d(r1.class, "sfi_B1b8b4", "getSfi_B1b8b4()B", 0), i.d(r1.class, "firstRecordNumber_B2", "getFirstRecordNumber_B2()B", 0), i.d(r1.class, "lastRecordNumber_B3", "getLastRecordNumber_B3()B", 0), i.d(r1.class, "offlineDataAuthenticationRecordLength_B4", "getOfflineDataAuthenticationRecordLength_B4()B", 0)};

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static int f58041k = 0;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static int f58042l = 1;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final m f58043f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final p f58044g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    public final p f58045h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    public final p f58046i;

    static {
        int i10 = f58041k;
        int i11 = (i10 ^ 29) + ((i10 & 29) << 1);
        f58042l = i11 % 128;
        int i12 = i11 % 2;
    }

    public r1() {
        super(setAnimation.setDividerPadding().setDividerPadding());
        this.f58043f = new m();
        this.f58044g = new p(1);
        this.f58045h = new p(2);
        this.f58046i = new p(3);
    }

    /* JADX WARN: Code duplicated, block: B:40:0x024b  */
    /* JADX WARN: Code duplicated, block: B:42:0x025d  */
    /* JADX WARN: Code duplicated, block: B:43:0x0263  */
    /* JADX WARN: Code duplicated, block: B:67:0x0364  */
    /* JADX WARN: Code duplicated, block: B:69:0x042e  */
    /* JADX WARN: Code duplicated, block: B:70:0x0450  */
    /* JADX WARN: Code duplicated, block: B:72:0x0464  */
    /* JADX WARN: Code duplicated, block: B:75:0x0469  */
    public static /* synthetic */ Serializable b(Object[] objArr, int i10, int i11, int i12) {
        int i13;
        Object compoundDrawableTintBlendMode;
        byte bByteValue;
        int i14;
        int i15;
        int i16;
        int i17;
        Object x4;
        Object compoundDrawableTintBlendMode2;
        int i18 = ((~(i11 | i12)) * TypedValues.CycleType.TYPE_EASING) + (i11 * 421) + (i10 * (-419));
        int i19 = ~i10;
        int i20 = (((~(i19 | (~i11))) | (~(i11 | (~i12)))) * TypedValues.CycleType.TYPE_EASING) + ((i11 | i19) * (-420)) + i18;
        KProperty<Object>[] kPropertyArr = f58040j;
        switch (i20) {
            case 1:
                r1 r1Var = (r1) objArr[0];
                int i21 = f58042l;
                int i22 = (i21 | 71) << 1;
                int i23 = -(i21 ^ 71);
                int i24 = (i22 & i23) + (i23 | i22);
                f58041k = i24 % 128;
                if (i24 % 2 != 0) {
                    ((Byte) b(new Object[]{r1Var}, -1220788223, 1220788229, System.identityHashCode(r1Var))).byteValue();
                    throw null;
                }
                if (((Byte) b(new Object[]{r1Var}, -1220788223, 1220788229, System.identityHashCode(r1Var))).byteValue() != 0) {
                    int i25 = f58042l;
                    int i26 = (i25 ^ 109) + ((i25 & 109) << 1);
                    f58041k = i26 % 128;
                    int i27 = i26 % 2;
                    if (((Byte) b(new Object[]{r1Var}, -1220788223, 1220788229, System.identityHashCode(r1Var))).byteValue() != 31) {
                        int i28 = f58041k + 118;
                        int i29 = (i28 ^ (-1)) + (i28 << 1);
                        f58042l = i29 % 128;
                        int i30 = i29 % 2;
                        if (((Byte) b(new Object[]{r1Var}, 1926213465, -1926213460, System.identityHashCode(r1Var))).byteValue() != 0) {
                            int i31 = f58042l + 43;
                            f58041k = i31 % 128;
                            if (i31 % 2 != 0) {
                                int i32 = 16 / 0;
                                if (((Byte) b(new Object[]{r1Var}, 329588598, -329588594, System.identityHashCode(r1Var))).byteValue() >= ((Byte) b(new Object[]{r1Var}, 1926213465, -1926213460, System.identityHashCode(r1Var))).byteValue()) {
                                    int i33 = f58042l;
                                    int i34 = (((i33 | 72) << 1) - (i33 ^ 72)) - 1;
                                    f58041k = i34 % 128;
                                    int i35 = i34 % 2;
                                    bByteValue = ((Byte) b(new Object[]{r1Var}, 1321673068, -1321673068, System.identityHashCode(r1Var))).byteValue();
                                    int iByteValue = (((Byte) b(new Object[]{r1Var}, 329588598, -329588594, System.identityHashCode(r1Var))).byteValue() - (~(-(~(-((Byte) b(new Object[]{r1Var}, 1926213465, -1926213460, System.identityHashCode(r1Var))).byteValue()))))) - 1;
                                    int i36 = (iByteValue ^ (-1)) + (iByteValue << 1);
                                    int iIdentityHashCode = System.identityHashCode(r1Var);
                                    int i37 = -(~(-(-(i36 * (-112)))));
                                    int i38 = (((-112) & i37) + (i37 | (-112))) - 1;
                                    int i39 = ~i36;
                                    int i40 = ~iIdentityHashCode;
                                    int i41 = i39 ^ i40;
                                    int i42 = i39 & i40;
                                    int i43 = ~((i41 & i42) | (i41 ^ i42));
                                    int i44 = i43 ^ 1;
                                    int i45 = i43 & 1;
                                    int i46 = -(-(((i45 & i44) | (i44 ^ i45)) * 226));
                                    int i47 = i38 & i46;
                                    int i48 = (i38 ^ i46) | i47;
                                    int i49 = ((i47 | i48) << 1) - (i48 ^ i47);
                                    int i50 = ~(((-2) & i39) | (i36 & 1) | ((-2) & i36));
                                    int i51 = (-2) & iIdentityHashCode;
                                    int i52 = ((-2) | iIdentityHashCode) & (~i51);
                                    int i53 = ~((i52 & i51) | (i52 ^ i51));
                                    int i54 = (i53 & i50) | (i50 ^ i53);
                                    int i55 = (i36 | i39) & i39;
                                    int i56 = i55 & i40;
                                    int i57 = (i55 | i40) & (~i56);
                                    int i58 = (i57 & i56) | (i57 ^ i56);
                                    int i59 = i58 & 1;
                                    int i60 = (i58 | 1) & (~i59);
                                    int i61 = ~((i60 & i59) | (i60 ^ i59));
                                    i14 = (((i54 & i61) | ((~i61) & i54) | ((~i54) & i61)) * (-113)) + i49;
                                    int i62 = i39 & iIdentityHashCode;
                                    i15 = ((iIdentityHashCode | i39) & (~i62)) | i62;
                                    i16 = ~i15;
                                    if (bByteValue <= (i14 - (~(((i15 | i16) & i16) * 113))) - 1) {
                                        int i63 = f58041k;
                                        int i64 = i63 & 87;
                                        int i65 = (~i64) & (i63 | 87);
                                        int i66 = i64 << 1;
                                        int i67 = (i65 ^ i66) + ((i66 & i65) << 1);
                                        f58042l = i67 % 128;
                                        int i68 = i67 % 2;
                                        int i69 = ((i63 ^ 30) + ((i63 & 30) << 1)) - 1;
                                        f58042l = i69 % 128;
                                        int i70 = i69 % 2;
                                        compoundDrawableTintBlendMode = Boolean.TRUE;
                                    }
                                }
                            } else if (((Byte) b(new Object[]{r1Var}, 329588598, -329588594, System.identityHashCode(r1Var))).byteValue() >= ((Byte) b(new Object[]{r1Var}, 1926213465, -1926213460, System.identityHashCode(r1Var))).byteValue()) {
                                int i310 = f58042l;
                                int i311 = (((i310 | 72) << 1) - (i310 ^ 72)) - 1;
                                f58041k = i311 % 128;
                                int i312 = i311 % 2;
                                bByteValue = ((Byte) b(new Object[]{r1Var}, 1321673068, -1321673068, System.identityHashCode(r1Var))).byteValue();
                                int iByteValue2 = (((Byte) b(new Object[]{r1Var}, 329588598, -329588594, System.identityHashCode(r1Var))).byteValue() - (~(-(~(-((Byte) b(new Object[]{r1Var}, 1926213465, -1926213460, System.identityHashCode(r1Var))).byteValue()))))) - 1;
                                int i313 = (iByteValue2 ^ (-1)) + (iByteValue2 << 1);
                                int iIdentityHashCode2 = System.identityHashCode(r1Var);
                                int i314 = -(~(-(-(i313 * (-112)))));
                                int i315 = (((-112) & i314) + (i314 | (-112))) - 1;
                                int i316 = ~i313;
                                int i410 = ~iIdentityHashCode2;
                                int i411 = i316 ^ i410;
                                int i412 = i316 & i410;
                                int i413 = ~((i411 & i412) | (i411 ^ i412));
                                int i414 = i413 ^ 1;
                                int i415 = i413 & 1;
                                int i416 = -(-(((i415 & i414) | (i414 ^ i415)) * 226));
                                int i417 = i315 & i416;
                                int i418 = (i315 ^ i416) | i417;
                                int i419 = ((i417 | i418) << 1) - (i418 ^ i417);
                                int i510 = ~(((-2) & i316) | (i313 & 1) | ((-2) & i313));
                                int i511 = (-2) & iIdentityHashCode2;
                                int i512 = ((-2) | iIdentityHashCode2) & (~i511);
                                int i513 = ~((i512 & i511) | (i512 ^ i511));
                                int i514 = (i513 & i510) | (i510 ^ i513);
                                int i515 = (i313 | i316) & i316;
                                int i516 = i515 & i410;
                                int i517 = (i515 | i410) & (~i516);
                                int i518 = (i517 & i516) | (i517 ^ i516);
                                int i519 = i518 & 1;
                                int i610 = (i518 | 1) & (~i519);
                                int i611 = ~((i610 & i519) | (i610 ^ i519));
                                i14 = (((i514 & i611) | ((~i611) & i514) | ((~i514) & i611)) * (-113)) + i419;
                                int i612 = i316 & iIdentityHashCode2;
                                i15 = ((iIdentityHashCode2 | i316) & (~i612)) | i612;
                                i16 = ~i15;
                                if (bByteValue <= (i14 - (~(((i15 | i16) & i16) * 113))) - 1) {
                                    int i613 = f58041k;
                                    int i614 = i613 & 87;
                                    int i615 = (~i614) & (i613 | 87);
                                    int i616 = i614 << 1;
                                    int i617 = (i615 ^ i616) + ((i616 & i615) << 1);
                                    f58042l = i617 % 128;
                                    int i618 = i617 % 2;
                                    int i619 = ((i613 ^ 30) + ((i613 & 30) << 1)) - 1;
                                    f58042l = i619 % 128;
                                    int i71 = i619 % 2;
                                    compoundDrawableTintBlendMode = Boolean.TRUE;
                                }
                            }
                            int i72 = f58042l;
                            int i73 = i72 & 109;
                            int i74 = -(-((i72 ^ 109) | i73));
                            i13 = (i73 & i74) + (i74 | i73);
                            f58041k = i13 % 128;
                            if (i13 % 2 == 0) {
                                throw null;
                            }
                            compoundDrawableTintBlendMode = Boolean.FALSE;
                        } else {
                            int i75 = f58042l;
                            int i76 = i75 & 109;
                            int i77 = -(-((i75 ^ 109) | i76));
                            i13 = (i76 & i77) + (i77 | i76);
                            f58041k = i13 % 128;
                            if (i13 % 2 == 0) {
                                throw null;
                            }
                            compoundDrawableTintBlendMode = Boolean.FALSE;
                        }
                    } else {
                        int i78 = f58042l;
                        int i79 = i78 & 109;
                        int i710 = -(-((i78 ^ 109) | i79));
                        i13 = (i79 & i710) + (i710 | i79);
                        f58041k = i13 % 128;
                        if (i13 % 2 == 0) {
                            throw null;
                        }
                        compoundDrawableTintBlendMode = Boolean.FALSE;
                    }
                } else {
                    int i711 = f58042l;
                    int i712 = i711 & 109;
                    int i713 = -(-((i711 ^ 109) | i712));
                    i13 = (i712 & i713) + (i713 | i712);
                    f58041k = i13 % 128;
                    if (i13 % 2 == 0) {
                        throw null;
                    }
                    compoundDrawableTintBlendMode = Boolean.FALSE;
                }
                break;
                break;
            case 2:
                r1 r1Var2 = (r1) objArr[0];
                int i80 = f58042l;
                int i81 = i80 & 31;
                int i82 = -(-((i80 ^ 31) | i81));
                int i83 = (i81 ^ i82) + ((i82 & i81) << 1);
                f58041k = i83 % 128;
                if (i83 % 2 != 0) {
                    r1Var2.setCompoundDrawableTintBlendMode();
                    throw null;
                }
                compoundDrawableTintBlendMode = r1Var2.setCompoundDrawableTintBlendMode();
                break;
                break;
            case 3:
                r1 r1Var3 = (r1) objArr[0];
                byte[] bArr = (byte[]) objArr[1];
                int iIntValue = ((Number) objArr[2]).intValue();
                int i84 = f58041k;
                int i85 = ~i84;
                int i86 = (((i84 & (-102)) | (101 & i85)) - (~(-(-((i84 & 101) << 1))))) - 1;
                f58042l = i86 % 128;
                if (i86 % 2 == 0) {
                    throw null;
                }
                if (bArr == null) {
                    int i87 = f58042l;
                    int i88 = i87 & 75;
                    int i89 = (i87 ^ 75) | i88;
                    i17 = (i88 & i89) + (i89 | i88);
                    f58041k = i17 % 128;
                    if (i17 % 2 == 0) {
                        throw null;
                    }
                    compoundDrawableTintBlendMode = Integer.valueOf(iIntValue);
                } else {
                    if (bArr.length == 0) {
                        int i90 = (((i84 ^ 25) | (i84 & 25)) << 1) - ((25 & i85) | (i84 & (-26)));
                        f58042l = i90 % 128;
                        if (i90 % 2 != 0) {
                            int i810 = f58042l;
                            int i811 = i810 & 75;
                            int i812 = (i810 ^ 75) | i811;
                            i17 = (i811 & i812) + (i812 | i811);
                            f58041k = i17 % 128;
                            if (i17 % 2 == 0) {
                                throw null;
                            }
                            compoundDrawableTintBlendMode = Integer.valueOf(iIntValue);
                            break;
                        }
                    } else {
                        int i91 = (i84 | 63) << 1;
                        int i92 = -(i84 ^ 63);
                        int i93 = ((i91 | i92) << 1) - (i91 ^ i92);
                        f58042l = i93 % 128;
                        int i94 = i93 % 2;
                    }
                    int i95 = iIntValue * (-667);
                    int i96 = (-5340) & i95;
                    int i97 = (((-5340) ^ i95) | i96) << 1;
                    int i98 = -((i95 | (-5340)) & (~i96));
                    int i99 = ((i97 | i98) << 1) - (i98 ^ i97);
                    int i100 = ~iIntValue;
                    int i101 = (i100 & 4) | (iIntValue & (-5));
                    int i102 = iIntValue & 4;
                    int i103 = (i101 & i102) | (i101 ^ i102);
                    int i104 = ~i103;
                    int i105 = (((i104 & i100) | (i100 ^ i104)) * (-668)) + i99;
                    int i106 = i100 & iIntValue;
                    int i107 = (~i106) & (i100 | iIntValue);
                    int i108 = ~((i107 ^ i106) | (i106 & i107));
                    int i109 = i108 & 4;
                    int i110 = (~i109) & (i108 | 4);
                    int i111 = -(-(((i110 & i109) | (i110 ^ i109)) * 1336));
                    int i112 = i105 & i111;
                    int i113 = (i112 - (~((i111 ^ i105) | i112))) - 1;
                    int i114 = i103 & i100;
                    int i115 = -(-((i114 | ((i100 | i103) & (~i114))) * 668));
                    int i116 = i113 & i115;
                    int i117 = (i115 | i113) & (~i116);
                    int i118 = -(-(i116 << 1));
                    super.setOnFocusChangeListener(ArraysKt___ArraysJvmKt.plus(new byte[]{4}, ArraysKt___ArraysKt.sliceArray(bArr, c.until(iIntValue, (i117 ^ i118) + ((i117 & i118) << 1)))), 0);
                    int i119 = (i102 - (~(-(-(iIntValue | 4))))) - 1;
                    int i120 = f58041k;
                    int i121 = (-2) - (((i120 ^ 80) + ((i120 & 80) << 1)) ^ (-1));
                    f58042l = i121 % 128;
                    if (i121 % 2 == 0) {
                        throw null;
                    }
                    compoundDrawableTintBlendMode = Integer.valueOf(i119);
                }
                break;
                break;
            case 4:
                r1 r1Var4 = (r1) objArr[0];
                int i122 = f58041k + 123;
                f58042l = i122 % 128;
                if (i122 % 2 == 0) {
                    p pVar = r1Var4.f58045h;
                    x4 = p.setX(new Object[]{pVar, r1Var4, kPropertyArr[3]}, -681277519, 681277519, System.identityHashCode(pVar));
                } else {
                    p pVar2 = r1Var4.f58045h;
                    x4 = p.setX(new Object[]{pVar2, r1Var4, kPropertyArr[2]}, -681277519, 681277519, System.identityHashCode(pVar2));
                }
                compoundDrawableTintBlendMode = Byte.valueOf(((Byte) x4).byteValue());
                break;
            case 5:
                r1 r1Var5 = (r1) objArr[0];
                int i123 = f58042l;
                int i124 = (-2) - (((i123 & 34) + (i123 | 34)) ^ (-1));
                f58041k = i124 % 128;
                int i125 = i124 % 2;
                p pVar3 = r1Var5.f58044g;
                byte bByteValue2 = ((Byte) p.setX(new Object[]{pVar3, r1Var5, kPropertyArr[1]}, -681277519, 681277519, System.identityHashCode(pVar3))).byteValue();
                int i126 = f58042l;
                int i127 = i126 & 61;
                int i128 = (i126 ^ 61) | i127;
                int i129 = (i127 & i128) + (i128 | i127);
                f58041k = i129 % 128;
                int i130 = i129 % 2;
                compoundDrawableTintBlendMode = Byte.valueOf(bByteValue2);
                break;
            case 6:
                r1 r1Var6 = (r1) objArr[0];
                int i131 = f58042l + 95;
                f58041k = i131 % 128;
                if (i131 % 2 != 0) {
                    m mVar = r1Var6.f58043f;
                    compoundDrawableTintBlendMode2 = m.setCompoundDrawableTintBlendMode(new Object[]{mVar, r1Var6, kPropertyArr[1]}, 1820788324, -1820788324, System.identityHashCode(mVar));
                } else {
                    m mVar2 = r1Var6.f58043f;
                    compoundDrawableTintBlendMode2 = m.setCompoundDrawableTintBlendMode(new Object[]{mVar2, r1Var6, kPropertyArr[0]}, 1820788324, -1820788324, System.identityHashCode(mVar2));
                }
                byte bByteValue3 = ((Byte) compoundDrawableTintBlendMode2).byteValue();
                int i132 = f58042l;
                int i133 = (-2) - (((i132 & 120) + (i132 | 120)) ^ (-1));
                f58041k = i133 % 128;
                if (i133 % 2 != 0) {
                    throw null;
                }
                compoundDrawableTintBlendMode = Byte.valueOf(bByteValue3);
                break;
                break;
            default:
                r1 r1Var7 = (r1) objArr[0];
                int i134 = f58041k;
                int i135 = i134 & 25;
                int i136 = -(-((i134 ^ 25) | i135));
                int i137 = ((i135 | i136) << 1) - (i136 ^ i135);
                f58042l = i137 % 128;
                int i138 = i137 % 2;
                p pVar4 = r1Var7.f58046i;
                compoundDrawableTintBlendMode = Byte.valueOf(((Byte) (i138 == 0 ? p.setX(new Object[]{pVar4, r1Var7, kPropertyArr[3]}, -681277519, 681277519, System.identityHashCode(pVar4)) : p.setX(new Object[]{pVar4, r1Var7, kPropertyArr[3]}, -681277519, 681277519, System.identityHashCode(pVar4)))).byteValue());
                break;
        }
        return (Serializable) compoundDrawableTintBlendMode;
    }

    @Override // com.mypinpad.tsdk.isolation.setImageTintList
    @NotNull
    public final byte[] setDividerPadding() {
        return (byte[]) b(new Object[]{this}, -756866047, 756866049, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.isolation.setImageTintList, com.mypinpad.tsdk.isolation.setLeftTopRightBottom
    public final int setOnFocusChangeListener(@Nullable byte[] bArr, int i10) {
        return ((Integer) b(new Object[]{this, bArr, Integer.valueOf(i10)}, -718665634, 718665637, i10)).intValue();
    }
}

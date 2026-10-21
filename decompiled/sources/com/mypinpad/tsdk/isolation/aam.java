package com.mypinpad.tsdk.isolation;

import kotlin.Metadata;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0005\u0018\u0000 \u00052\u00020\u0001:\u0001\u0005B\u0007¢\u0006\u0004\b\u0011\u0010\u0012J \u0010\u0005\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0087\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0015\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\tJ\u0018\u0010\n\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0086\u0002¢\u0006\u0004\b\n\u0010\u000bJ\r\u0010\n\u001a\u00020\u0002¢\u0006\u0004\b\n\u0010\fJ\r\u0010\b\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\fJ\u0015\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u000bJ\u0015\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\u0000¢\u0006\u0004\b\u000e\u0010\u000fR\u0011\u0010\u000e\u001a\u00020\u00028G¢\u0006\u0006\u001a\u0004\b\u0010\u0010\fR\u0011\u0010\n\u001a\u00020\u00028G¢\u0006\u0006\u001a\u0004\b\u0005\u0010\f"}, d2 = {"Lcom/mypinpad/tsdk/i/aam;", "", "", "p0", "p1", "setDividerPadding", "(II)Lcom/mypinpad/tsdk/i/aam;", "", "setY", "(I)Z", "setCompoundDrawableTintBlendMode", "(I)I", "()I", "", "setX", "(Lcom/mypinpad/tsdk/i/aam;)V", "setOnFocusChangeListener", "<init>", "()V"}, k = 1, mv = {1, 6, 0})
public final class aam {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static int f52186c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static int f52187d = 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f52188a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final int[] f52189b = new int[10];

    static {
        int i10 = f52187d + 105;
        f52186c = i10 % 128;
        if (i10 % 2 != 0) {
            throw null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:59:0x0269  */
    /* JADX WARN: Code duplicated, block: B:62:0x0284  */
    public static /* synthetic */ Object setOnFocusChangeListener(Object[] objArr, int i10, int i11, int i12) {
        Object objValueOf;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17 = ~i10;
        int i18 = ~i11;
        int i19 = (~(i17 | i18)) | (~(i18 | i12));
        int i20 = ~i12;
        int i21 = i20 | i10;
        switch (((~i21) * 886) + ((i10 | (~(i11 | i20))) * (-1772)) + ((i19 | (~(i21 | i11))) * 886) + (i11 * (-885)) + (i10 * 1773)) {
            case 1:
                aam aamVar = (aam) objArr[0];
                int i22 = f52186c;
                int i23 = (i22 & 99) + (i22 | 99);
                f52187d = i23 % 128;
                int i24 = i23 % 2;
                int i25 = aamVar.f52188a;
                if (i24 == 0) {
                    Integer.bitCount(i25);
                    throw null;
                }
                int iBitCount = Integer.bitCount(i25);
                int i26 = f52186c;
                int i27 = ((i26 | 85) << 1) - (i26 ^ 85);
                f52187d = i27 % 128;
                int i28 = i27 % 2;
                return Integer.valueOf(iBitCount);
            case 2:
                aam aamVar2 = (aam) objArr[0];
                int iIntValue = ((Number) objArr[1]).intValue();
                int i29 = f52187d;
                int i30 = i29 ^ 99;
                int i31 = ((i29 & 99) | i30) << 1;
                int i32 = -i30;
                int i33 = (i31 ^ i32) + ((i32 & i31) << 1);
                int i34 = i33 % 128;
                f52186c = i34;
                int i35 = i33 % 2;
                if (((1 << iIntValue) & aamVar2.f52188a) == 0) {
                    int i36 = (i34 ^ 109) + ((i34 & 109) << 1);
                    f52187d = i36 % 128;
                    int i37 = i36 % 2;
                    objValueOf = Boolean.FALSE;
                } else {
                    int i38 = i29 & 67;
                    int i39 = ((~i38) & (i29 | 67)) + (i38 << 1);
                    f52186c = i39 % 128;
                    int i40 = i39 % 2;
                    int i41 = i29 + 105;
                    f52186c = i41 % 128;
                    int i42 = i41 % 2;
                    objValueOf = Boolean.TRUE;
                }
                break;
            case 3:
                aam aamVar3 = (aam) objArr[0];
                int i43 = f52186c;
                int i44 = (i43 & 106) + (i43 | 106);
                int i45 = (i44 ^ (-1)) + (i44 << 1);
                f52187d = i45 % 128;
                if (i45 % 2 != 0 ? (aamVar3.f52188a & 2) != 0 : (aamVar3.f52188a & 4) != 0) {
                    int i46 = aamVar3.f52189b[1];
                    int i47 = ((i43 | 79) << 1) - (i43 ^ 79);
                    f52187d = i47 % 128;
                    if (i47 % 2 == 0) {
                        int i48 = 31 / 0;
                    }
                    objValueOf = Integer.valueOf(i46);
                } else {
                    int i49 = i43 & 55;
                    int i50 = ((i43 ^ 55) | i49) << 1;
                    int i51 = -((i43 | 55) & (~i49));
                    int i52 = (i50 ^ i51) + ((i50 & i51) << 1);
                    f52187d = i52 % 128;
                    if (i52 % 2 == 0) {
                        throw null;
                    }
                    objValueOf = -1;
                }
                break;
            case 4:
                aam aamVar4 = (aam) objArr[0];
                int iIntValue2 = ((Number) objArr[1]).intValue();
                int i53 = f52187d;
                int i54 = i53 & 15;
                int i55 = (((i53 ^ 15) | i54) << 1) - ((~i54) & (i53 | 15));
                f52186c = i55 % 128;
                int i56 = i55 % 2;
                int[] iArr = aamVar4.f52189b;
                if (i56 != 0) {
                    i13 = iArr[iIntValue2];
                    int i57 = 17 / 0;
                } else {
                    i13 = iArr[iIntValue2];
                }
                int i58 = (i53 & 76) + (i53 | 76);
                int i59 = (i58 ^ (-1)) + (i58 << 1);
                f52186c = i59 % 128;
                if (i59 % 2 == 0) {
                    return Integer.valueOf(i13);
                }
                throw null;
            case 5:
                aam aamVar5 = (aam) objArr[0];
                int iIntValue3 = ((Number) objArr[1]).intValue();
                int iIntValue4 = ((Number) objArr[2]).intValue();
                int i60 = f52187d;
                int i61 = (i60 ^ 39) + ((i60 & 39) << 1);
                f52186c = i61 % 128;
                if (i61 % 2 != 0) {
                    throw null;
                }
                if (iIntValue3 >= 0) {
                    int i62 = i60 + 87;
                    f52186c = i62 % 128;
                    int i63 = i62 % 2;
                    int[] iArr2 = aamVar5.f52189b;
                    if (iIntValue3 >= iArr2.length) {
                        int i64 = f52186c;
                        int i65 = i64 & 25;
                        int i66 = ((i64 ^ 25) | i65) << 1;
                        int i67 = -((i64 | 25) & (~i65));
                        i14 = (i66 & i67) + (i67 | i66);
                        f52187d = i14 % 128;
                        if (i14 % 2 == 0) {
                            throw null;
                        }
                    } else {
                        int i68 = 1 << iIntValue3;
                        int i69 = aamVar5.f52188a;
                        aamVar5.f52188a = (i68 & i69) | ((~i68) & i69) | ((~i69) & i68);
                        iArr2[iIntValue3] = iIntValue4;
                        int i70 = ((i60 & 110) + (i60 | 110)) - 1;
                        f52186c = i70 % 128;
                        if (i70 % 2 != 0) {
                            int i71 = 49 / 0;
                        }
                    }
                } else {
                    int i610 = f52186c;
                    int i611 = i610 & 25;
                    int i612 = ((i610 ^ 25) | i611) << 1;
                    int i613 = -((i610 | 25) & (~i611));
                    i14 = (i612 & i613) + (i613 | i612);
                    f52187d = i14 % 128;
                    if (i14 % 2 == 0) {
                        throw null;
                    }
                }
                return aamVar5;
            case 6:
                aam aamVar6 = (aam) objArr[0];
                int iIntValue5 = ((Number) objArr[1]).intValue();
                int i72 = f52186c;
                int i73 = i72 + 58;
                int i74 = (i73 ^ (-1)) + (i73 << 1);
                f52187d = i74 % 128;
                int i75 = i74 % 2;
                if ((aamVar6.f52188a & 32) != 0) {
                    int i76 = i72 & 15;
                    int i77 = i76 + ((i72 ^ 15) | i76);
                    f52187d = i77 % 128;
                    int i78 = i77 % 2;
                    int[] iArr3 = aamVar6.f52189b;
                    iIntValue5 = i78 == 0 ? iArr3[5] : iArr3[5];
                } else {
                    int i79 = (((i72 | 21) << 1) - (~(-(i72 ^ 21)))) - 1;
                    f52187d = i79 % 128;
                    if (i79 % 2 == 0) {
                        int i80 = 59 / 0;
                    }
                }
                objValueOf = Integer.valueOf(iIntValue5);
                break;
            case 7:
                aam aamVar7 = (aam) objArr[0];
                int i81 = f52187d;
                int i82 = i81 & 35;
                int i83 = (~i82) & (i81 | 35);
                int i84 = i82 << 1;
                int i85 = ((i83 | i84) << 1) - (i84 ^ i83);
                int i86 = i85 % 128;
                f52186c = i86;
                int i87 = i85 % 2;
                if ((aamVar7.f52188a & 128) != 0) {
                    int i88 = i81 & 115;
                    int i89 = (i81 ^ 115) | i88;
                    int i90 = (i88 ^ i89) + ((i89 & i88) << 1);
                    int i91 = i90 % 128;
                    f52186c = i91;
                    int i92 = i90 % 2;
                    i15 = aamVar7.f52189b[7];
                    int i93 = i91 + 41;
                    f52187d = i93 % 128;
                    if (i93 % 2 == 0) {
                        throw null;
                    }
                } else {
                    int i94 = (-2) - ((i86 + 66) ^ (-1));
                    f52187d = i94 % 128;
                    int i95 = i94 % 2;
                    i15 = 65535;
                }
                objValueOf = Integer.valueOf(i15);
                break;
            case 8:
                aam aamVar8 = (aam) objArr[0];
                int i96 = f52187d;
                int i97 = i96 & 117;
                int i98 = -(-(i96 | 117));
                int i99 = (i97 ^ i98) + ((i97 & i98) << 1);
                int i100 = i99 % 128;
                f52186c = i100;
                if (i99 % 2 == 0 ? (aamVar8.f52188a & 16) == 0 : (aamVar8.f52188a & 36) == 0) {
                    int i101 = i96 & 73;
                    int i102 = (73 ^ i96) | i101;
                    int i103 = (i101 & i102) + (i101 | i102);
                    f52186c = i103 % 128;
                    i16 = Integer.MAX_VALUE;
                    if (i103 % 2 != 0) {
                        int i104 = 98 / 0;
                    }
                } else {
                    int i105 = (((i100 | 14) << 1) - (i100 ^ 14)) - 1;
                    f52187d = i105 % 128;
                    int i106 = i105 % 2;
                    int[] iArr4 = aamVar8.f52189b;
                    i16 = i106 == 0 ? iArr4[2] : iArr4[4];
                    int i107 = (((i100 & (-16)) | ((~i100) & 15)) - (~(-(-((i100 & 15) << 1))))) - 1;
                    f52187d = i107 % 128;
                    if (i107 % 2 == 0) {
                        int i108 = 2 / 0;
                    }
                }
                objValueOf = Integer.valueOf(i16);
                break;
            default:
                aam aamVar9 = (aam) objArr[0];
                aam aamVar10 = (aam) objArr[1];
                int i109 = f52187d + 36;
                int i110 = (i109 ^ (-1)) + (i109 << 1);
                f52186c = i110 % 128;
                int i111 = i110 % 2;
                Intrinsics.checkNotNullParameter(aamVar10, "");
                int i112 = f52186c + 83;
                f52187d = i112 % 128;
                int i113 = i112 % 2;
                int i114 = 0;
                while (i114 < 10) {
                    int i115 = f52187d;
                    int i116 = i115 & 119;
                    int i117 = (i115 ^ 119) | i116;
                    int i118 = (i116 & i117) + (i117 | i116);
                    f52186c = i118 % 128;
                    int i119 = i118 % 2;
                    int i120 = (i114 ^ (-39)) + ((i114 & (-39)) << 1);
                    int i121 = ((i120 ^ 40) | (i120 & 40)) << 1;
                    int i122 = -(((~i120) & 40) | (i120 & (-41)));
                    int i123 = (i121 & i122) + (i122 | i121);
                    if (((Boolean) setOnFocusChangeListener(new Object[]{aamVar10, Integer.valueOf(i114)}, -255055169, 255055171, i114)).booleanValue()) {
                        int i124 = f52186c;
                        int i125 = i124 & 83;
                        int i126 = (i124 | 83) & (~i125);
                        int i127 = i125 << 1;
                        int i128 = (i126 & i127) + (i126 | i127);
                        f52187d = i128 % 128;
                        int i129 = i128 % 2;
                        int i130 = f52187d;
                        int i131 = i130 & 49;
                        int i132 = i130 | 49;
                        int i133 = (i131 ^ i132) + ((i132 & i131) << 1);
                        f52186c = i133 % 128;
                        int i134 = i133 % 2;
                    }
                    i114 = i123;
                }
                int i135 = f52186c;
                int i136 = (((i135 ^ 65) | (i135 & 65)) << 1) - (((~i135) & 65) | (i135 & (-66)));
                f52187d = i136 % 128;
                if (i136 % 2 != 0) {
                    return null;
                }
                int i137 = 73 / 0;
                return null;
        }
        return objValueOf;
    }

    public final int setCompoundDrawableTintBlendMode() {
        return ((Integer) setOnFocusChangeListener(new Object[]{this}, -1487598367, 1487598368, System.identityHashCode(this))).intValue();
    }

    public final int setDividerPadding(int p4) {
        return ((Integer) setOnFocusChangeListener(new Object[]{this, Integer.valueOf(p4)}, -993299434, 993299440, p4)).intValue();
    }

    public final void setX(@NotNull aam p4) {
        setOnFocusChangeListener(new Object[]{this, p4}, 1941022715, -1941022715, System.identityHashCode(this));
    }

    public final int setY() {
        return ((Integer) setOnFocusChangeListener(new Object[]{this}, 1983088750, -1983088742, System.identityHashCode(this))).intValue();
    }

    public final int setCompoundDrawableTintBlendMode(int p4) {
        return ((Integer) setOnFocusChangeListener(new Object[]{this, Integer.valueOf(p4)}, -1915529547, 1915529551, p4)).intValue();
    }

    @NotNull
    public final aam setDividerPadding(int p4, int p10) {
        return (aam) setOnFocusChangeListener(new Object[]{this, Integer.valueOf(p4), Integer.valueOf(p10)}, 444410959, -444410954, p4);
    }

    public final boolean setY(int p4) {
        return ((Boolean) setOnFocusChangeListener(new Object[]{this, Integer.valueOf(p4)}, -255055169, 255055171, p4)).booleanValue();
    }

    @JvmName(name = "setDividerPadding")
    public final int setDividerPadding() {
        return ((Integer) setOnFocusChangeListener(new Object[]{this}, -1082853585, 1082853592, System.identityHashCode(this))).intValue();
    }

    @JvmName(name = "setOnFocusChangeListener")
    public final int setOnFocusChangeListener() {
        return ((Integer) setOnFocusChangeListener(new Object[]{this}, -1086963513, 1086963516, System.identityHashCode(this))).intValue();
    }
}

package com.mypinpad.tsdk.isolation;

import com.bbva.sl.ar.android.libkeymanagement.exception.ReturnCode;

/* JADX INFO: loaded from: classes10.dex */
public final class alw extends alq {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static int f53104j = 0;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static int f53105k = 1;

    public alw(akp akpVar) {
        super(akpVar);
        aku.setCompoundDrawableTintBlendMode(new Object[0], -825950727, 825950727, (int) System.currentTimeMillis());
        setOnFocusChangeListener();
    }

    public static Object setDividerPadding(Object[] objArr, int i10, int i11, int i12) {
        int i13 = (i11 * 971) + (i10 * (-1939));
        int i14 = ~i11;
        int i15 = ~(i14 | i10);
        int i16 = ~((~i12) | i11);
        int i17 = ~i10;
        switch ((((~(i17 | i14)) | i16) * 970) + ((~(i11 | i17)) * 1940) + ((i15 | i16) * (-970)) + i13) {
            case 1:
                alw alwVar = (alw) objArr[0];
                int i18 = f53104j + 43;
                f53105k = i18 % 128;
                int i19 = i18 % 2;
                super.setOnFocusChangeListener();
                alwVar.setCompoundDrawableTintBlendMode = 7640891576956012808L;
                alwVar.setOnFocusChangeListener = -4942790177534073029L;
                alwVar.setDividerPadding = 4354685564936845355L;
                alwVar.setX = -6534734903238641935L;
                alwVar.getNavBarTitleString = 5840696475078001361L;
                alwVar.setOnDragListener = -7276294671716946913L;
                alwVar.setNavigationOnClickListener = 2270897969802886507L;
                alwVar.setOnLongClickListener = 6620516959819538809L;
                int i20 = f53104j;
                int i21 = i20 & 47;
                int i22 = (i20 | 47) & (~i21);
                int i23 = i21 << 1;
                int i24 = (i22 & i23) + (i22 | i23);
                f53105k = i24 % 128;
                int i25 = i24 % 2;
                break;
            case 2:
                int i26 = f53105k;
                int i27 = i26 ^ 125;
                int i28 = (i26 & 125) << 1;
                int i29 = (i27 ^ i28) + ((i28 & i27) << 1);
                int i30 = i29 % 128;
                f53104j = i30;
                int i31 = i29 % 2;
                int i32 = ((i30 ^ 103) | (i30 & 103)) << 1;
                int i33 = -(((~i30) & 103) | (i30 & (-104)));
                int i34 = (i32 ^ i33) + ((i33 & i32) << 1);
                f53105k = i34 % 128;
                if (i34 % 2 != 0) {
                    return "SHA-512";
                }
                throw null;
            case 3:
                alw alwVar2 = (alw) objArr[0];
                byte[] bArr = (byte[]) objArr[1];
                int iIntValue = ((Number) objArr[2]).intValue();
                int i35 = (-2) - ((f53104j + 104) ^ (-1));
                f53105k = i35 % 128;
                int i36 = i35 % 2;
                alwVar2.setCompoundDrawableTintBlendMode();
                ber.setDividerPadding(new Object[]{Long.valueOf(alwVar2.setCompoundDrawableTintBlendMode), bArr, Integer.valueOf(iIntValue)}, 108647497, -108647488, iIntValue);
                long j10 = alwVar2.setOnFocusChangeListener;
                int i37 = -(-(iIntValue * (-949)));
                int i38 = ((-7592) ^ i37) + ((i37 & (-7592)) << 1);
                int i39 = ~iIntValue;
                int i40 = i39 | iIntValue;
                int i41 = i39 & i40;
                int i42 = i39 & i41;
                int i43 = (~i42) & (i39 | i41);
                int i44 = ~((i43 ^ i42) | (i42 & i43));
                int i45 = (-9) & i39;
                int i46 = iIntValue & 8;
                int i47 = ~(i45 | i46 | ((-9) & iIntValue));
                int i48 = i44 & i47;
                int i49 = (~i48) & (i44 | i47);
                int i50 = (((i49 & i48) | (i49 ^ i48)) * ReturnCode.ERR_REPOSITORY) + i38;
                int i51 = ~(i45 | ((~i39) & 8) | (i39 & 8));
                int i52 = ~((iIntValue ^ iIntValue) | (iIntValue & iIntValue));
                int i53 = ((~i52) & i51) | ((~i51) & i52);
                int i54 = i51 & i52;
                int i55 = (((i54 & i53) | (i53 ^ i54)) * (-950)) + i50;
                int i56 = i39 & iIntValue;
                int i57 = (~i56) & i40;
                int i58 = (i56 & i57) | (i57 ^ i56);
                int i59 = ~i58;
                int i60 = (i58 | i59) & i59;
                int i61 = (~i46) & (iIntValue | 8);
                int i62 = ~((i46 & i61) | (i61 ^ i46));
                int i63 = (((i60 & i62) | ((~i62) & i60) | ((~i60) & i62)) * 950) + i55;
                ber.setDividerPadding(new Object[]{Long.valueOf(j10), bArr, Integer.valueOf(i63)}, 108647497, -108647488, i63);
                int i64 = iIntValue ^ 16;
                int i65 = -(-((iIntValue & 16) << 1));
                int i66 = (i64 ^ i65) + ((i64 & i65) << 1);
                ber.setDividerPadding(new Object[]{Long.valueOf(alwVar2.setDividerPadding), bArr, Integer.valueOf(i66)}, 108647497, -108647488, i66);
                long j11 = alwVar2.setX;
                int i67 = (iIntValue * (-782)) + 18816;
                int i68 = i39 * (-783);
                int i69 = i67 & i68;
                int i70 = i69 + ((i67 ^ i68) | i69);
                int i71 = (-25) & i39;
                int i72 = (~i71) & ((-25) | i39);
                int i73 = (i71 & i72) | (i72 ^ i71);
                int i74 = (i73 & i39) | ((~i73) & iIntValue);
                int i75 = i73 & iIntValue;
                int i76 = -(-((~((i75 & i74) | (i74 ^ i75))) * (-783)));
                int i77 = ((i70 | i76) << 1) - (i76 ^ i70);
                int i78 = i41 ^ iIntValue;
                int i79 = i41 & iIntValue;
                int i80 = (i78 & i79) | (i78 ^ i79);
                int i81 = ~i80;
                int i82 = (i80 | i81) & i81;
                int i83 = (-25) & i82;
                int i84 = ((-25) | i82) & (~i83);
                int i85 = -(-(((i84 & i83) | (i84 ^ i83)) * 783));
                int i86 = i77 & i85;
                int i87 = ((((i77 ^ i85) | i86) << 1) - (~(-((i85 | i77) & (~i86))))) - 1;
                ber.setDividerPadding(new Object[]{Long.valueOf(j11), bArr, Integer.valueOf(i87)}, 108647497, -108647488, i87);
                long j12 = alwVar2.getNavBarTitleString;
                int i88 = iIntValue & 32;
                int i89 = (~i88) & (iIntValue | 32);
                int i90 = i88 << 1;
                int i91 = ((i89 | i90) << 1) - (i90 ^ i89);
                ber.setDividerPadding(new Object[]{Long.valueOf(j12), bArr, Integer.valueOf(i91)}, 108647497, -108647488, i91);
                long j13 = alwVar2.setOnDragListener;
                int i92 = iIntValue & 40;
                int i93 = (~i92) & (iIntValue | 40);
                int i94 = -(-(i92 << 1));
                int i95 = (i93 ^ i94) + ((i94 & i93) << 1);
                ber.setDividerPadding(new Object[]{Long.valueOf(j13), bArr, Integer.valueOf(i95)}, 108647497, -108647488, i95);
                int i96 = iIntValue ^ 48;
                int i97 = (iIntValue & 48) << 1;
                int i98 = (i96 & i97) + (i96 | i97);
                ber.setDividerPadding(new Object[]{Long.valueOf(alwVar2.setNavigationOnClickListener), bArr, Integer.valueOf(i98)}, 108647497, -108647488, i98);
                long j14 = alwVar2.setOnLongClickListener;
                int i99 = -(~(-(-(iIntValue * 829))));
                int i100 = (-2) - (((46424 & i99) + (i99 | 46424)) ^ (-1));
                int i101 = ((~i41) & (-57)) | (i41 & 56);
                int i102 = (-57) & i41;
                int i103 = (i101 & i102) | (i101 ^ i102);
                int i104 = ~i103;
                int i105 = (i103 | i104) & i104;
                int i106 = i39 & 56;
                int i107 = (~i106) & (i39 | 56);
                int i108 = (i107 & i106) | (i107 ^ i106);
                int i109 = (i108 & i39) | ((~i108) & iIntValue);
                int i110 = i108 & iIntValue;
                int i111 = ~((i110 & i109) | (i109 ^ i110));
                int i112 = i105 & i111;
                int i113 = -(-((((i105 | i111) & (~i112)) | i112) * (-828)));
                int i114 = (((i100 ^ i113) | (i100 & i113)) << 1) - (((~i100) & i113) | ((~i113) & i100));
                int i115 = (iIntValue & (-57)) | i106;
                int i116 = iIntValue & 56;
                int i117 = (i115 & i116) | (i115 ^ i116);
                int i118 = i117 & i39;
                int i119 = (i117 | i39) & (~i118);
                int i120 = ((i119 & i118) | (i119 ^ i118)) * (-828);
                int i121 = i114 & i120;
                int i122 = (i120 | i114) & (~i121);
                int i123 = -(-(i121 << 1));
                int i124 = ((i122 | i123) << 1) - (i122 ^ i123);
                int i125 = (~i116) & (iIntValue | 56);
                int i126 = (~((i125 & i116) | (i125 ^ i116))) * 828;
                int i127 = i124 & i126;
                int i128 = (i126 ^ i124) | i127;
                int i129 = (i127 & i128) + (i128 | i127);
                ber.setDividerPadding(new Object[]{Long.valueOf(j14), bArr, Integer.valueOf(i129)}, 108647497, -108647488, i129);
                alwVar2.setOnFocusChangeListener();
                int i130 = f53104j;
                int i131 = (i130 & (-74)) | ((~i130) & 73);
                int i132 = -(-((i130 & 73) << 1));
                int i133 = (i131 ^ i132) + ((i132 & i131) << 1);
                f53105k = i133 % 128;
                int i134 = i133 % 2;
                return 64;
            case 4:
                alw alwVar3 = new alw((alw) objArr[0]);
                aku.setCompoundDrawableTintBlendMode(new Object[0], -825950727, 825950727, (int) System.currentTimeMillis());
                int i135 = f53105k;
                int i136 = ((i135 & (-88)) | ((~i135) & 87)) + ((i135 & 87) << 1);
                f53104j = i136 % 128;
                if (i136 % 2 == 0) {
                    return alwVar3;
                }
                int i137 = 91 / 0;
                return alwVar3;
            case 5:
                int i138 = f53105k;
                int i139 = ((i138 ^ 21) | (i138 & 21)) << 1;
                int i140 = -((i138 & (-22)) | ((~i138) & 21));
                int i141 = (i139 & i140) + (i139 | i140);
                f53104j = i141 % 128;
                int i142 = i141 % 2;
                int i143 = i138 + 23;
                f53104j = i143 % 128;
                int i144 = i143 % 2;
                return 64;
            case 6:
                alw alwVar4 = (alw) objArr[0];
                beu beuVar = (beu) objArr[1];
                int i145 = f53104j + 19;
                f53105k = i145 % 128;
                int i146 = i145 % 2;
                alwVar4.setY((alw) beuVar);
                int i147 = f53105k + 80;
                int i148 = (i147 ^ (-1)) + (i147 << 1);
                f53104j = i148 % 128;
                int i149 = i148 % 2;
                break;
            default:
                alw alwVar5 = (alw) objArr[0];
                int i150 = f53104j;
                int i151 = i150 & 75;
                int i152 = (i150 ^ 75) | i151;
                int i153 = (i151 & i152) + (i152 | i151);
                f53105k = i153 % 128;
                int i154 = i153 % 2;
                akl aklVarA = y0.a(new Object[]{alwVar5, 256, alwVar5.setY}, 1475452988, -1475452988, 256);
                int i155 = f53105k;
                int i156 = ((i155 ^ 121) - (~(-(-((i155 & 121) << 1))))) - 1;
                f53104j = i156 % 128;
                int i157 = i156 % 2;
                return aklVarA;
        }
        return null;
    }

    @Override // com.mypinpad.tsdk.isolation.alq
    public final akl getNavBarTitleString() {
        return (akl) setDividerPadding(new Object[]{this}, -1146039858, 1146039858, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.isolation.aky
    public final int setCompoundDrawableTintBlendMode(byte[] bArr, int i10) {
        return ((Integer) setDividerPadding(new Object[]{this, bArr, Integer.valueOf(i10)}, 11036651, -11036648, i10)).intValue();
    }

    @Override // com.mypinpad.tsdk.isolation.alq, com.mypinpad.tsdk.isolation.aky
    public final void setOnFocusChangeListener() {
        setDividerPadding(new Object[]{this}, -1141895969, 1141895970, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.isolation.beu
    public final beu setOnLongClickListener() {
        return (beu) setDividerPadding(new Object[]{this}, 952117462, -952117458, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.isolation.beu
    public final void setX(beu beuVar) {
        setDividerPadding(new Object[]{this, beuVar}, 662631766, -662631760, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.isolation.aky
    public final int setY() {
        return ((Integer) setDividerPadding(new Object[]{this}, 1959146184, -1959146179, System.identityHashCode(this))).intValue();
    }

    public alw() {
        this(akp.getNavBarTitleString);
    }

    @Override // com.mypinpad.tsdk.isolation.aky
    public final String setX() {
        return (String) setDividerPadding(new Object[]{this}, -1022609418, 1022609420, System.identityHashCode(this));
    }
}

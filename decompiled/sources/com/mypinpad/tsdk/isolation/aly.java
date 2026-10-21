package com.mypinpad.tsdk.isolation;

import org.bouncycastle.pqc.jcajce.spec.McElieceCCA2KeyGenParameterSpec;

/* JADX INFO: loaded from: classes10.dex */
public final class aly extends alq {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static int f53108j = 0;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static int f53109k = 1;

    public aly(akp akpVar) {
        super(akpVar);
        aku.setCompoundDrawableTintBlendMode(new Object[0], -825950727, 825950727, (int) System.currentTimeMillis());
        setOnFocusChangeListener();
    }

    public static Object setCompoundDrawableTintBlendMode(Object[] objArr, int i10, int i11, int i12) {
        int i13 = ~i10;
        int i14 = ((i11 | i13) * (-1434)) + (i11 * 1435) + (i10 * (-716));
        int i15 = ~i12;
        int i16 = ~(i15 | i11);
        int i17 = ~(i10 | i11);
        int i18 = i13 | (~i11);
        switch (((i17 | (~(i18 | i15)) | (~(i11 | i12))) * 717) + ((i16 | i17 | (~(i18 | i12))) * 717) + i14) {
            case 1:
                aly alyVar = (aly) objArr[0];
                int i19 = f53109k;
                int i20 = (i19 ^ 103) + ((i19 & 103) << 1);
                f53108j = i20 % 128;
                int i21 = i20 % 2;
                akl aklVarA = y0.a(new Object[]{alyVar, 256, alyVar.setY}, 1475452988, -1475452988, 256);
                int i22 = f53108j;
                int i23 = i22 ^ 69;
                int i24 = ((i22 & 69) | i23) << 1;
                int i25 = -i23;
                int i26 = (i24 & i25) + (i24 | i25);
                f53109k = i26 % 128;
                if (i26 % 2 != 0) {
                    return aklVarA;
                }
                throw null;
            case 2:
                aly alyVar2 = new aly((aly) objArr[0]);
                aku.setCompoundDrawableTintBlendMode(new Object[0], -825950727, 825950727, (int) System.currentTimeMillis());
                int i27 = f53109k + 21;
                f53108j = i27 % 128;
                int i28 = i27 % 2;
                return alyVar2;
            case 3:
                aly alyVar3 = (aly) objArr[0];
                beu beuVar = (beu) objArr[1];
                int i29 = f53109k;
                int i30 = i29 ^ 1;
                int i31 = (i29 & 1) << 1;
                int i32 = ((i30 | i31) << 1) - (i31 ^ i30);
                f53108j = i32 % 128;
                int i33 = i32 % 2;
                super.setY((aly) beuVar);
                if (i33 != 0) {
                    throw null;
                }
                return null;
            case 4:
                int i34 = f53108j + 61;
                int i35 = i34 % 128;
                f53109k = i35;
                if (i34 % 2 == 0) {
                    int i36 = 17 / 0;
                }
                int i37 = ((i35 & (-16)) | ((~i35) & 15)) + ((i35 & 15) << 1);
                f53108j = i37 % 128;
                if (i37 % 2 == 0) {
                    return McElieceCCA2KeyGenParameterSpec.SHA384;
                }
                throw null;
            case 5:
                aly alyVar4 = (aly) objArr[0];
                int i38 = f53108j;
                int i39 = ((i38 & 108) + (i38 | 108)) - 1;
                f53109k = i39 % 128;
                int i40 = i39 % 2;
                super.setOnFocusChangeListener();
                alyVar4.setCompoundDrawableTintBlendMode = -3766243637369397544L;
                alyVar4.setOnFocusChangeListener = 7105036623409894663L;
                alyVar4.setDividerPadding = -7973340178411365097L;
                alyVar4.setX = 1526699215303891257L;
                alyVar4.getNavBarTitleString = 7436329637833083697L;
                alyVar4.setOnDragListener = -8163818279084223215L;
                alyVar4.setNavigationOnClickListener = -2662702644619276377L;
                alyVar4.setOnLongClickListener = 5167115440072839076L;
                int i41 = f53109k;
                int i42 = i41 & 75;
                int i43 = (i41 ^ 75) | i42;
                int i44 = (i42 ^ i43) + ((i43 & i42) << 1);
                f53108j = i44 % 128;
                if (i44 % 2 != 0) {
                    throw null;
                }
                return null;
            case 6:
                aly alyVar5 = (aly) objArr[0];
                byte[] bArr = (byte[]) objArr[1];
                int iIntValue = ((Number) objArr[2]).intValue();
                int i45 = f53109k;
                int i46 = i45 & 115;
                int i47 = ((i45 ^ 115) | i46) << 1;
                int i48 = -((i45 | 115) & (~i46));
                int i49 = (i47 & i48) + (i48 | i47);
                f53108j = i49 % 128;
                int i50 = i49 % 2;
                alyVar5.setCompoundDrawableTintBlendMode();
                ber.setDividerPadding(new Object[]{Long.valueOf(alyVar5.setCompoundDrawableTintBlendMode), bArr, Integer.valueOf(iIntValue)}, 108647497, -108647488, iIntValue);
                int i51 = (iIntValue ^ 9) + ((iIntValue & 9) << 1);
                int i52 = (i51 ^ (-1)) + (i51 << 1);
                ber.setDividerPadding(new Object[]{Long.valueOf(alyVar5.setOnFocusChangeListener), bArr, Integer.valueOf(i52)}, 108647497, -108647488, i52);
                long j10 = alyVar5.setDividerPadding;
                int i53 = (-31601) - (~(-(-(iIntValue * 989))));
                int i54 = (-17) ^ iIntValue;
                int i55 = (-17) & iIntValue;
                int i56 = ~((i54 ^ i55) | (i54 & i55));
                int i57 = (~i56) & iIntValue;
                int i58 = ~iIntValue;
                int i59 = i57 | (i56 & i58);
                int i60 = i56 & iIntValue;
                int i61 = ((i59 ^ i60) | (i59 & i60)) * 988;
                int i62 = ((i53 ^ i61) | (i53 & i61)) << 1;
                int i63 = -((i61 & (~i53)) | ((~i61) & i53));
                int i64 = (i62 ^ i63) + ((i63 & i62) << 1);
                int i65 = i58 & 16;
                int i66 = ~((i58 ^ 16) | i65);
                int i67 = (~i65) & (i58 | 16);
                int i68 = (i67 ^ i65) | (i65 & i67);
                int i69 = ~i68;
                int i70 = (i68 | i69) & i69;
                int i71 = -(-(((i66 & i70) | (i66 ^ i70)) * (-1976)));
                int i72 = i64 & i71;
                int i73 = (i71 ^ i64) | i72;
                int i74 = (i72 & i73) + (i73 | i72);
                int i75 = ((~i55) & ((-17) | iIntValue)) | i55;
                int i76 = ~i75;
                int i77 = (i75 | i76) & i76;
                int i78 = i58 & i58;
                int i79 = ~i58;
                int i80 = (iIntValue & i79) | i78;
                int i81 = i58 & iIntValue;
                int i82 = ~((i80 ^ i81) | (i80 & i81));
                int i83 = i77 ^ i82;
                int i84 = i77 & i82;
                int i85 = (i83 ^ i84) | (i84 & i83);
                int i86 = ((i85 & i82) | (i85 ^ i82)) * 988;
                int i87 = (i74 & i86) + (i86 | i74);
                ber.setDividerPadding(new Object[]{Long.valueOf(j10), bArr, Integer.valueOf(i87)}, 108647497, -108647488, i87);
                long j11 = alyVar5.setX;
                int i88 = (iIntValue * (-69)) + 1704;
                int i89 = (-25) & iIntValue;
                int i90 = ~(((-25) ^ iIntValue) | i89);
                int i91 = iIntValue & iIntValue;
                int i92 = (~i91) & (iIntValue | iIntValue);
                int i93 = ~((i92 ^ i91) | (i91 & i92));
                int i94 = i90 & i93;
                int i95 = (~i94) & (i93 | i90);
                int i96 = -(-(((i95 & i94) | (i95 ^ i94)) * (-140)));
                int i97 = (i88 & i96) + (i88 | i96);
                int i98 = iIntValue & 24;
                int i99 = (~i98) & (iIntValue | 24);
                int i100 = (i99 & i98) | (i99 ^ i98);
                int i101 = -(~(-(-((~((i100 & iIntValue) | (i100 ^ iIntValue))) * 70))));
                int i102 = (i97 ^ i101) + ((i101 & i97) << 1);
                int i103 = (i102 ^ (-1)) + (i102 << 1);
                int i104 = ((-25) & i58) | i98;
                int i105 = ~((i104 & i89) | (i104 ^ i89));
                int i106 = i58 ^ 24;
                int i107 = i58 & 24;
                int i108 = ~((i106 & i107) | (i106 ^ i107));
                int i109 = i105 & i108;
                int i110 = (i105 | i108) & (~i109);
                int i111 = (i110 & i109) | (i110 ^ i109);
                int i112 = i107 | i89;
                int i113 = ~((i98 & i112) | (i112 ^ i98));
                int i114 = ((~i113) & i111) | ((~i111) & i113);
                int i115 = i113 & i111;
                int i116 = -(-(((i115 & i114) | (i114 ^ i115)) * 70));
                int i117 = i103 & i116;
                int i118 = ((i103 ^ i116) | i117) << 1;
                int i119 = -((i116 | i103) & (~i117));
                int i120 = (i118 & i119) + (i119 | i118);
                ber.setDividerPadding(new Object[]{Long.valueOf(j11), bArr, Integer.valueOf(i120)}, 108647497, -108647488, i120);
                int i121 = iIntValue ^ 32;
                int i122 = (iIntValue & 32) << 1;
                int i123 = ((i121 | i122) << 1) - (i121 ^ i122);
                ber.setDividerPadding(new Object[]{Long.valueOf(alyVar5.getNavBarTitleString), bArr, Integer.valueOf(i123)}, 108647497, -108647488, i123);
                long j12 = alyVar5.setOnDragListener;
                int i124 = -(~(-(-(iIntValue * (-978)))));
                int i125 = ((39200 & i124) + (i124 | 39200)) - 1;
                int i126 = (~i78) & (i58 | i58);
                int i127 = (i78 & i126) | (i126 ^ i78);
                int i128 = ~i127;
                int i129 = ((i127 | i128) & i128) * 979;
                int i130 = i125 & i129;
                int i131 = (i129 ^ i125) | i130;
                int i132 = ((i130 | i131) << 1) - (i131 ^ i130);
                int i133 = (iIntValue | 40) * (-979);
                int i134 = ((~i133) & i132) | ((~i132) & i133);
                int i135 = -(-((i133 & i132) << 1));
                int i136 = (i134 & i135) + (i135 | i134);
                int i137 = (i58 | iIntValue) & i58;
                int i138 = (i137 & i58) | ((~i137) & iIntValue);
                int i139 = i137 & iIntValue;
                int i140 = (i139 & i138) | (i138 ^ i139);
                int i141 = ~i140;
                int i142 = (i140 | i141) & i141;
                int i143 = (i58 & (-41)) | (i79 & 40);
                int i144 = i58 & 40;
                int i145 = ~((i143 & i144) | (i143 ^ i144));
                int i146 = -(-(((i142 & i145) | (i142 ^ i145)) * 979));
                int i147 = (i136 ^ i146) + ((i146 & i136) << 1);
                ber.setDividerPadding(new Object[]{Long.valueOf(j12), bArr, Integer.valueOf(i147)}, 108647497, -108647488, i147);
                alyVar5.setOnFocusChangeListener();
                int i148 = f53109k;
                int i149 = (i148 ^ 19) + ((i148 & 19) << 1);
                f53108j = i149 % 128;
                if (i149 % 2 == 0) {
                    return 48;
                }
                throw null;
            default:
                int i150 = f53109k;
                int i151 = i150 ^ 25;
                int i152 = (i150 & 25) << 1;
                int i153 = (i151 ^ i152) + ((i151 & i152) << 1);
                f53108j = i153 % 128;
                int i154 = i153 % 2 != 0 ? 60 : 48;
                int i155 = (i150 ^ 101) + ((i150 & 101) << 1);
                f53108j = i155 % 128;
                int i156 = i155 % 2;
                return Integer.valueOf(i154);
        }
    }

    @Override // com.mypinpad.tsdk.isolation.alq
    public final akl getNavBarTitleString() {
        return (akl) setCompoundDrawableTintBlendMode(new Object[]{this}, -1490849572, 1490849573, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.isolation.alq, com.mypinpad.tsdk.isolation.aky
    public final void setOnFocusChangeListener() {
        setCompoundDrawableTintBlendMode(new Object[]{this}, -1887559442, 1887559447, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.isolation.beu
    public final beu setOnLongClickListener() {
        return (beu) setCompoundDrawableTintBlendMode(new Object[]{this}, -1847274975, 1847274977, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.isolation.beu
    public final void setX(beu beuVar) {
        setCompoundDrawableTintBlendMode(new Object[]{this, beuVar}, 1738655640, -1738655637, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.isolation.aky
    public final int setY() {
        return ((Integer) setCompoundDrawableTintBlendMode(new Object[]{this}, 1287318438, -1287318438, System.identityHashCode(this))).intValue();
    }

    public aly() {
        this(akp.getNavBarTitleString);
    }

    @Override // com.mypinpad.tsdk.isolation.aky
    public final String setX() {
        return (String) setCompoundDrawableTintBlendMode(new Object[]{this}, -1540212847, 1540212851, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.isolation.aky
    public final int setCompoundDrawableTintBlendMode(byte[] bArr, int i10) {
        return ((Integer) setCompoundDrawableTintBlendMode(new Object[]{this, bArr, Integer.valueOf(i10)}, 64531495, -64531489, i10)).intValue();
    }
}

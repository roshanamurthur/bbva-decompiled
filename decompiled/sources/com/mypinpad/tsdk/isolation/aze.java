package com.mypinpad.tsdk.isolation;

import com.bbva.sl.ar.core.libmcrypt.impl.LibMCryptConstants;

/* JADX INFO: loaded from: classes10.dex */
public final class aze implements akk {
    public static final aze setCompoundDrawableTintBlendMode;
    public static final aze setDividerPadding;
    public static final aze setOnDragListener;
    public static final aze setOnFocusChangeListener;
    public static final aze setX;
    public static final aze setY;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public static int f54190w0 = 0;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public static int f54191x0 = 1;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final int f54192p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final int f54193q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final int f54194r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final int f54195s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public final int f54196t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public final alq f54197u0;
    public final q2 v0;

    static {
        q2 q2Var = q2.setX;
        setCompoundDrawableTintBlendMode = new aze(3, q2Var);
        q2 q2Var2 = q2.setOnFocusChangeListener;
        setX = new aze(3, q2Var2);
        q2 q2Var3 = q2.setDividerPadding;
        setY = new aze(3, q2Var3);
        setOnFocusChangeListener = new aze(5, q2Var);
        setDividerPadding = new aze(5, q2Var2);
        setOnDragListener = new aze(5, q2Var3);
        int i10 = f54190w0;
        int i11 = i10 | 31;
        int i12 = i11 << 1;
        int i13 = -((~(i10 & 31)) & i11);
        int i14 = (i12 ^ i13) + ((i13 & i12) << 1);
        f54191x0 = i14 % 128;
        if (i14 % 2 == 0) {
            throw null;
        }
    }

    public aze(int i10, q2 q2Var) {
        alq alyVar;
        if (i10 == 3) {
            this.f54192p0 = 68;
            this.f54193q0 = 32;
            this.f54194r0 = 48;
            alyVar = new aly();
        } else {
            if (i10 != 5) {
                throw new IllegalArgumentException("No valid version. Please choose one of the following: 3, 5");
            }
            this.f54192p0 = 96;
            this.f54193q0 = 36;
            this.f54194r0 = 64;
            alyVar = new alw();
        }
        this.f54197u0 = alyVar;
        int i11 = this.f54192p0;
        int i12 = this.f54193q0;
        int i13 = i12 * (-515);
        int i14 = i11 * 517;
        int i15 = i13 & i14;
        int i16 = (i13 | i14) & (~i15);
        int i17 = -(-(i15 << 1));
        int i18 = (i16 ^ i17) + ((i16 & i17) << 1);
        int i19 = ~i11;
        int i20 = i19 & i10;
        int i21 = (~i20) & (i19 | i10);
        int i22 = ~i10;
        int i23 = i20 | i21;
        int i24 = ~i23;
        int i25 = (i23 | i24) & i24;
        int i26 = ~i12;
        int i27 = (i22 & i26) | ((~i22) & i12);
        int i28 = i22 & i12;
        int i29 = ~((i27 & i28) | (i27 ^ i28));
        int i30 = i25 ^ i29;
        int i31 = i25 & i29;
        int i32 = (i31 & i30) | (i30 ^ i31);
        int i33 = (i22 | i10) & i22;
        int i34 = ~(i33 | i11);
        int i35 = ((i32 & i34) | (i32 ^ i34)) * (-516);
        int i36 = i18 & i35;
        int i37 = -(-((i35 ^ i18) | i36));
        int i38 = (i36 ^ i37) + ((i37 & i36) << 1);
        int i39 = i26 ^ i19;
        int i40 = i19 & i26;
        int i41 = (i40 & i39) | (i39 ^ i40);
        int i42 = i41 ^ i10;
        int i43 = i41 & i10;
        int i44 = ~((i43 & i42) | (i42 ^ i43));
        int i45 = i26 & i33;
        int i46 = i45 | ((i33 | i26) & (~i45));
        int i47 = i46 & i11;
        int i48 = (i46 | i11) & (~i47);
        int i49 = ~((i48 & i47) | (i48 ^ i47));
        int i50 = i44 & i49;
        int i51 = (i44 | i49) & (~i50);
        int i52 = (((i51 & i50) | (i51 ^ i50)) * LibMCryptConstants.IND_HEX_SEGMENTO2) + i38;
        int i53 = (i26 | i12) & i26;
        int i54 = i53 & i11;
        int i55 = (~i54) & (i53 | i11);
        int i56 = ~((i54 & i55) | (i55 ^ i54));
        int i57 = (i11 & i22) | (i22 ^ i11);
        int i58 = ~i57;
        int i59 = (((i57 | i58) & i58) | i56) * LibMCryptConstants.IND_HEX_SEGMENTO2;
        int i60 = i52 & i59;
        int i61 = ((i52 ^ i59) | i60) << 1;
        int i62 = -((i59 | i52) & (~i60));
        int i63 = (i61 & i62) + (i62 | i61);
        int i64 = this.f54194r0;
        int i65 = i64 * (-523);
        int i66 = i63 * 263;
        int i67 = (((~i66) & i65) | ((~i65) & i66)) + ((i65 & i66) << 1);
        int i68 = ~i64;
        int i69 = ~(i68 | i63);
        int i70 = ~i63;
        int i71 = (i70 | i63) & i70;
        int i72 = i71 & i64;
        int i73 = (~i72) & (i71 | i64);
        int i74 = (i73 & i72) | (i73 ^ i72);
        int i75 = ~i74;
        int i76 = (i74 | i75) & i75;
        int i77 = i69 & i76;
        int i78 = ((~i77) & (i69 | i76)) | i77;
        int i79 = (i70 ^ i10) | (i70 & i10);
        int i80 = ~i79;
        int i81 = (i79 | i80) & i80;
        int i82 = ((i78 & i81) | (i78 ^ i81)) * 262;
        int i83 = (i67 & i82) + (i82 | i67);
        int i84 = i70 & i68;
        int i85 = ((~i70) & i64) | i84;
        int i86 = i70 & i64;
        int i87 = -(-((~((i85 & i86) | (i85 ^ i86))) * (-786)));
        int i88 = i83 ^ i87;
        int i89 = ((i83 & i87) | i88) << 1;
        int i90 = -i88;
        int i91 = (i89 & i90) + (i89 | i90);
        int i92 = (i70 ^ i22) | (i70 & i22);
        int i93 = ~i92;
        int i94 = (i92 | i93) & i93;
        int i95 = ~((i63 & i68) | i84 | ((~i68) & i63));
        int i96 = i94 & i95;
        int i97 = (i95 | i94) & (~i96);
        int i98 = (i97 & i96) | (i97 ^ i96);
        int i99 = ~((i71 ^ i64) | i72);
        int i100 = ((~i99) & i98) | ((~i98) & i99);
        int i101 = i98 & i99;
        int i102 = -(-(((i101 & i100) | (i100 ^ i101)) * 262));
        int i103 = i91 & i102;
        this.f54195s0 = ((i102 | i91) & (~i103)) + (i103 << 1);
        int i104 = i64 * 491;
        int i105 = -(~(-(-(i12 * (-489)))));
        int i106 = (-2) - (((i104 ^ i105) + ((i105 & i104) << 1)) ^ (-1));
        int i107 = ((i68 | i64) & i68) | i26;
        int i108 = i107 & i22;
        int i109 = (((i107 | i22) & (~i108)) | i108) * (-490);
        int i110 = i106 & i109;
        int i111 = (i106 ^ i109) | i110;
        int i112 = (i110 & i111) + (i111 | i110);
        int i113 = i53 ^ i64;
        int i114 = i53 & i64;
        int i115 = ~((i114 & i113) | (i113 ^ i114));
        int i116 = ~((i53 & i10) | (i53 ^ i10));
        int i117 = i115 & i116;
        int i118 = -(-((((i116 | i115) & (~i117)) | i117) * 490));
        int i119 = (i112 ^ i118) + ((i118 & i112) << 1);
        int i120 = i68 * 490;
        this.f54196t0 = (((~i120) & i119) | ((~i119) & i120)) + ((i119 & i120) << 1);
        this.v0 = q2Var;
    }

    public static /* synthetic */ Object setX(Object[] objArr, int i10, int i11, int i12) {
        int i13 = (i11 * 591) + (i10 * (-589));
        int i14 = ~i11;
        int i15 = ~i12;
        int i16 = (~(i14 | i10)) | (~(i14 | i15)) | (~(i15 | i10));
        int i17 = ~i10;
        switch ((((~(i17 | i15)) | (~(i11 | i15))) * 590) + (i16 * (-1180)) + (((~(i12 | i17 | i11)) | i16) * 590) + i13) {
            case 1:
                aze azeVar = (aze) objArr[0];
                int i18 = f54190w0;
                int i19 = i18 & 103;
                int i20 = (i19 - (~((i18 ^ 103) | i19))) - 1;
                f54191x0 = i20 % 128;
                int i21 = i20 % 2;
                int i22 = azeVar.f54196t0;
                if (i21 == 0) {
                    int i23 = 16 / 0;
                }
                return Integer.valueOf(i22);
            case 2:
                aze azeVar2 = (aze) objArr[0];
                int i24 = f54190w0;
                int i25 = i24 & 57;
                int i26 = (i24 | 57) & (~i25);
                int i27 = -(-(i25 << 1));
                int i28 = (i26 & i27) + (i26 | i27);
                int i29 = i28 % 128;
                f54191x0 = i29;
                int i30 = i28 % 2;
                int i31 = azeVar2.f54194r0;
                int i32 = i29 & 15;
                int i33 = ((i29 | 15) & (~i32)) + (i32 << 1);
                f54190w0 = i33 % 128;
                int i34 = i33 % 2;
                return Integer.valueOf(i31);
            case 3:
                aze azeVar3 = (aze) objArr[0];
                int i35 = f54191x0;
                int i36 = (i35 & (-66)) | ((~i35) & 65);
                int i37 = (i35 & 65) << 1;
                int i38 = (i36 & i37) + (i37 | i36);
                int i39 = i38 % 128;
                f54190w0 = i39;
                int i40 = i38 % 2;
                int i41 = azeVar3.f54192p0;
                if (i40 != 0) {
                    int i42 = 63 / 0;
                }
                int i43 = i39 & 21;
                int i44 = i39 | 21;
                int i45 = (i43 ^ i44) + ((i44 & i43) << 1);
                f54191x0 = i45 % 128;
                int i46 = i45 % 2;
                return Integer.valueOf(i41);
            case 4:
                int i47 = f54191x0;
                int i48 = (i47 ^ 83) + ((i47 & 83) << 1);
                f54190w0 = i48 % 128;
                return Integer.valueOf(i48 % 2 != 0 ? 119 : 32);
            case 5:
                aze azeVar4 = (aze) objArr[0];
                int i49 = f54191x0;
                int i50 = (i49 & (-118)) | ((~i49) & 117);
                int i51 = -(-((i49 & 117) << 1));
                int i52 = ((i50 | i51) << 1) - (i50 ^ i51);
                f54190w0 = i52 % 128;
                int i53 = i52 % 2;
                q2 q2Var = azeVar4.v0;
                if (i53 != 0) {
                    throw null;
                }
                int i54 = i49 & 17;
                int i55 = (((i49 | 17) & (~i54)) - (~(-(-(i54 << 1))))) - 1;
                f54190w0 = i55 % 128;
                if (i55 % 2 == 0) {
                    return q2Var;
                }
                int i56 = 68 / 0;
                return q2Var;
            case 6:
                aze azeVar5 = (aze) objArr[0];
                int i57 = f54191x0;
                int i58 = i57 & 105;
                int i59 = i57 | 105;
                int i60 = (i58 ^ i59) + ((i58 & i59) << 1);
                f54190w0 = i60 % 128;
                int i61 = i60 % 2;
                alq alqVar = azeVar5.f54197u0;
                if (i61 != 0) {
                    throw null;
                }
                int i62 = (-2) - (((i57 & 48) + (i57 | 48)) ^ (-1));
                f54190w0 = i62 % 128;
                if (i62 % 2 == 0) {
                    return alqVar;
                }
                throw null;
            case 7:
                int i63 = f54190w0;
                int i64 = ((i63 & 22) + (i63 | 22)) - 1;
                f54191x0 = i64 % 128;
                int i65 = i64 % 2;
                int i66 = (-2) - (((i63 ^ 104) + ((i63 & 104) << 1)) ^ (-1));
                f54191x0 = i66 % 128;
                int i67 = i66 % 2;
                return 32;
            case 8:
                aze azeVar6 = (aze) objArr[0];
                int i68 = f54190w0;
                int i69 = i68 & 21;
                int i70 = (i68 ^ 21) | i69;
                int i71 = (i69 & i70) + (i70 | i69);
                int i72 = i71 % 128;
                f54191x0 = i72;
                int i73 = i71 % 2;
                int i74 = azeVar6.f54195s0;
                if (i73 == 0) {
                    int i75 = 13 / 0;
                }
                int i76 = ((i72 ^ 78) + ((i72 & 78) << 1)) - 1;
                f54190w0 = i76 % 128;
                int i77 = i76 % 2;
                return Integer.valueOf(i74);
            default:
                aze azeVar7 = (aze) objArr[0];
                int i78 = f54190w0;
                int i79 = i78 & 111;
                int i80 = ((i78 | 111) & (~i79)) + (i79 << 1);
                int i81 = i80 % 128;
                f54191x0 = i81;
                int i82 = i80 % 2;
                int i83 = azeVar7.f54193q0;
                int i84 = i81 & 5;
                int i85 = ((((i81 ^ 5) | i84) << 1) - (~(-((i81 | 5) & (~i84))))) - 1;
                f54190w0 = i85 % 128;
                if (i85 % 2 != 0) {
                    int i86 = 4 / 0;
                }
                return Integer.valueOf(i83);
        }
    }
}

package com.mypinpad.tsdk.isolation;

import androidx.constraintlayout.core.motion.utils.TypedValues;

/* JADX INFO: loaded from: classes10.dex */
public final class bdr extends bdn {
    public static int E0 = 1;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    public static int f54587y0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public final int f54588t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public final int f54589u0;
    public final bdt v0;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public final bdz f54590w0;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public final bdx f54591x0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bdr(int i10, int i11, bdt bdtVar, bdz bdzVar, bdx bdxVar, String str) {
        super(true, str);
        this.f54588t0 = i10;
        this.f54589u0 = i11;
        this.v0 = bdtVar;
        this.f54590w0 = bdzVar;
        this.f54591x0 = bdxVar;
        beg begVar = new beg(bdtVar, bdzVar);
    }

    public static /* synthetic */ Object setX(Object[] objArr, int i10, int i11, int i12) {
        int i13 = ~i10;
        int i14 = ~i11;
        int i15 = ~i12;
        int i16 = (((~(i10 | i11)) | (~(i13 | i15))) * 564) + ((~(i12 | i13 | i11)) * 1128) + (((~(i14 | i15)) | i13 | (~(i11 | i12))) * (-564)) + (i11 * 565) + (i10 * (-563));
        if (i16 == 1) {
            bdr bdrVar = (bdr) objArr[0];
            int i17 = f54587y0;
            int i18 = i17 ^ 21;
            int i19 = ((i17 & 21) | i18) << 1;
            int i20 = -i18;
            int i21 = ((i19 | i20) << 1) - (i19 ^ i20);
            int i22 = i21 % 128;
            E0 = i22;
            int i23 = i21 % 2;
            bdx bdxVar = bdrVar.f54591x0;
            int i24 = (i22 & (-112)) | ((~i22) & 111);
            int i25 = (i22 & 111) << 1;
            int i26 = (i24 ^ i25) + ((i25 & i24) << 1);
            f54587y0 = i26 % 128;
            if (i26 % 2 == 0) {
                return bdxVar;
            }
            int i27 = 1 / 0;
            return bdxVar;
        }
        if (i16 == 2) {
            bdr bdrVar2 = (bdr) objArr[0];
            int i28 = f54587y0;
            int i29 = (i28 & (-100)) | ((~i28) & 99);
            int i30 = (i28 & 99) << 1;
            int i31 = (i29 ^ i30) + ((i30 & i29) << 1);
            E0 = i31 % 128;
            int i32 = i31 % 2;
            bdt bdtVar = bdrVar2.v0;
            if (i32 != 0) {
                return bdtVar;
            }
            throw null;
        }
        if (i16 != 3) {
            if (i16 != 4) {
                bdr bdrVar3 = (bdr) objArr[0];
                int i33 = E0;
                int i34 = (i33 ^ 71) + ((i33 & 71) << 1);
                f54587y0 = i34 % 128;
                int i35 = i34 % 2;
                int i36 = bdrVar3.f54589u0;
                if (i35 != 0) {
                    int i37 = 12 / 0;
                }
                return Integer.valueOf(i36);
            }
            bdr bdrVar4 = (bdr) objArr[0];
            int i38 = E0;
            int i39 = i38 + 41;
            f54587y0 = i39 % 128;
            int i40 = i39 % 2;
            bdz bdzVar = bdrVar4.f54590w0;
            int i41 = i38 & 63;
            int i42 = ((i38 ^ 63) | i41) << 1;
            int i43 = -((i38 | 63) & (~i41));
            int i44 = (i42 & i43) + (i43 | i42);
            f54587y0 = i44 % 128;
            int i45 = i44 % 2;
            return bdzVar;
        }
        bdr bdrVar5 = (bdr) objArr[0];
        int i46 = E0;
        int i47 = ((i46 ^ 11) | (i46 & 11)) << 1;
        int i48 = -(((~i46) & 11) | (i46 & (-12)));
        int i49 = (i47 & i48) + (i48 | i47);
        f54587y0 = i49 % 128;
        int i50 = i49 % 2;
        int i51 = bdrVar5.f54588t0;
        int iIdentityHashCode = System.identityHashCode(bdrVar5);
        int i52 = ~iIdentityHashCode;
        int i53 = ((-809632401) & i52) | ((-809632401) ^ i52);
        int i54 = ~i53;
        int i55 = (i53 | i54) & i54;
        int i56 = i55 & 1175783754;
        int i57 = (i55 | 1175783754) & (~i56);
        int i58 = (i57 & i56) | (i57 ^ i56);
        int i59 = (960665232 & i52) | (iIdentityHashCode & (-960665233)) | (960665232 & iIdentityHashCode);
        int i60 = ~i59;
        int i61 = -(-((i58 | ((i59 | i60) & i60)) * (-68)));
        int i62 = (((~i61) & (-1296092391)) | (1296092390 & i61)) + ((i61 & (-1296092391)) << 1);
        int i63 = (iIdentityHashCode | i52) & i52;
        int i64 = ((~i63) & 1326816586) | ((-1326816587) & i63);
        int i65 = i63 & 1326816586;
        int i66 = (i65 & i64) | (i64 ^ i65);
        int i67 = i66 ^ 960665232;
        int i68 = i66 & 960665232;
        int i69 = (i68 & i67) | (i67 ^ i68);
        int i70 = ~i69;
        int i71 = -(-(((i69 | i70) & i70) * (-68)));
        int i72 = i62 ^ i71;
        int i73 = ((((i71 & i62) | i72) << 1) - (~(-i72))) - 1;
        int i74 = (-960665233) ^ i52;
        int i75 = i52 & (-960665233);
        int i76 = (i75 & i74) | (i74 ^ i75);
        int i77 = ~i76;
        int i78 = (i76 | i77) & i77;
        int i79 = 1326816586 ^ i78;
        int i80 = i78 & 1326816586;
        int i81 = ((i80 & i79) | (i79 ^ i80)) * 68;
        int i82 = i73 & i81;
        int i83 = (i82 - (~((i73 ^ i81) | i82))) - 1;
        int iIdentityHashCode2 = System.identityHashCode(bdrVar5);
        int i84 = (1596936814 & iIdentityHashCode2) | (1596936814 ^ iIdentityHashCode2);
        int i85 = ~i84;
        int i86 = (i84 | i85) & i85;
        int i87 = ((~i86) & 2050469955) | (i86 & (-2050469956));
        int i88 = i86 & 2050469955;
        int i89 = (-2) - (((-1157788702) - (~(-(~(-(-(((i88 & i87) | (i87 ^ i88)) * (-318)))))))) ^ (-1));
        int i90 = 2050469955 & iIdentityHashCode2;
        int i91 = (~i90) & (2050469955 | iIdentityHashCode2);
        int i92 = ~iIdentityHashCode2;
        int i93 = (i90 & i91) | (i91 ^ i90);
        int i94 = ~i93;
        int i95 = (i93 | i94) & i94;
        int i96 = (i92 ^ (-1596936815)) | (i92 & (-1596936815));
        int i97 = i96 ^ (-2050469956);
        int i98 = i96 & (-2050469956);
        int i99 = ~((i98 & i97) | (i97 ^ i98));
        int i100 = i95 & i99;
        int i101 = (((i95 | i99) & (~i100)) | i100) * TypedValues.AttributesType.TYPE_PIVOT_TARGET;
        int i102 = i89 & i101;
        int i103 = (i89 | i101) & (~i102);
        int i104 = i102 << 1;
        int i105 = (i103 & i104) + (i104 | i103);
        int i106 = ((~i92) & 2050469955) | (i92 & (-2050469956));
        int i107 = 2050469955 & i92;
        int i108 = ~((i106 & i107) | (i106 ^ i107) | (-1596936815));
        int i109 = (-1512509507) ^ iIdentityHashCode2;
        int i110 = iIdentityHashCode2 & (-1512509507);
        int i111 = ~((i110 & i109) | (i109 ^ i110));
        int i112 = i108 & i111;
        int i113 = (i111 | i108) & (~i112);
        int i114 = -(-(((i113 & i112) | (i113 ^ i112)) * TypedValues.AttributesType.TYPE_PIVOT_TARGET));
        int i115 = i105 & i114;
        if (i83 > i115 + ((i114 ^ i105) | i115)) {
            int i116 = 23 / 0;
        }
        return Integer.valueOf(i51);
    }

    public final int setCompoundDrawableTintBlendMode() {
        return ((Integer) setX(new Object[]{this}, 964740926, -964740926, System.identityHashCode(this))).intValue();
    }

    public final int setDividerPadding() {
        return ((Integer) setX(new Object[]{this}, 680320946, -680320943, System.identityHashCode(this))).intValue();
    }

    public final bdx setLayoutAnimation() {
        return (bdx) setX(new Object[]{this}, 35400633, -35400632, System.identityHashCode(this));
    }

    public final bdz setOnLongClickListener() {
        return (bdz) setX(new Object[]{this}, 71521224, -71521220, System.identityHashCode(this));
    }

    public final bdt setY() {
        return (bdt) setX(new Object[]{this}, 1067166877, -1067166875, System.identityHashCode(this));
    }
}

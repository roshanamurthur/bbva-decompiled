package com.mypinpad.tsdk.isolation;

import androidx.constraintlayout.core.motion.utils.TypedValues;

/* JADX INFO: loaded from: classes10.dex */
public final class ajw extends adw implements adg {

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public static int f52942s0 = 0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public static int f52943t0 = 1;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public ady f52944r0;

    public ajw(adr adrVar) {
        this.f52944r0 = adrVar;
    }

    public static Object setOnFocusChangeListener(Object[] objArr, int i10, int i11, int i12) {
        int i13 = ~i11;
        int i14 = (((~((~i10) | i12)) | i13) * (-318)) + (i11 * (-317)) + (i10 * 319);
        int i15 = ~(i13 | i12);
        int i16 = ~i12;
        int i17 = (((~(i10 | i11 | i12)) | (~(i13 | i16 | i10))) * TypedValues.AttributesType.TYPE_PIVOT_TARGET) + ((i15 | (~(i16 | i10 | i11))) * TypedValues.AttributesType.TYPE_PIVOT_TARGET) + i14;
        if (i17 == 1) {
            ajw ajwVar = (ajw) objArr[0];
            int i18 = f52943t0;
            int i19 = (i18 | 37) << 1;
            int i20 = ~i18;
            int i21 = -((i18 & (-38)) | (i20 & 37));
            int i22 = ((i19 | i21) << 1) - (i19 ^ i21);
            f52942s0 = i22 % 128;
            int i23 = i22 % 2;
            boolean z10 = ajwVar.f52944r0 instanceof adr;
            if (i23 != 0) {
                throw null;
            }
            int i24 = ((i18 & (-84)) | (i20 & 83)) + ((i18 & 83) << 1);
            f52942s0 = i24 % 128;
            if (i24 % 2 == 0) {
                return Boolean.valueOf(z10);
            }
            throw null;
        }
        if (i17 == 2) {
            ajw ajwVar2 = (ajw) objArr[0];
            int i25 = f52943t0;
            int i26 = (i25 & 46) + (i25 | 46);
            int i27 = (i26 ^ (-1)) + (i26 << 1);
            int i28 = i27 % 128;
            f52942s0 = i28;
            int i29 = i27 % 2;
            boolean z11 = ajwVar2.f52944r0 instanceof adu;
            int i30 = i28 & 5;
            int i31 = -(-((i28 ^ 5) | i30));
            int i32 = (i30 & i31) + (i30 | i31);
            f52943t0 = i32 % 128;
            int i33 = i32 % 2;
            return Boolean.valueOf(z11);
        }
        if (i17 != 3) {
            if (i17 != 4) {
                ajw ajwVar3 = (ajw) objArr[0];
                int i34 = f52942s0;
                int i35 = ((-1) << 1) - ((i34 + 78) ^ (-1));
                f52943t0 = i35 % 128;
                int i36 = i35 % 2;
                ady adyVar = ajwVar3.f52944r0;
                int i37 = ((i34 | 53) << 1) - (i34 ^ 53);
                f52943t0 = i37 % 128;
                int i38 = i37 % 2;
                return adyVar;
            }
            Object obj = objArr[0];
            int i39 = f52943t0;
            int i40 = i39 + 77;
            f52942s0 = i40 % 128;
            int i41 = i40 % 2;
            if (obj != null) {
                int i42 = (i39 & 91) + (i39 | 91);
                f52942s0 = i42 % 128;
                int i43 = i42 % 2;
                if (!(obj instanceof ajw)) {
                    if (!(obj instanceof ady)) {
                        throw new IllegalArgumentException("unknown object in getInstance()");
                    }
                    ajw ajwVar4 = new ajw();
                    ajwVar4.f52944r0 = (ady) obj;
                    int i44 = f52942s0 + 87;
                    f52943t0 = i44 % 128;
                    if (i44 % 2 == 0) {
                        int i45 = 11 / 0;
                    }
                    return ajwVar4;
                }
            }
            ajw ajwVar5 = (ajw) obj;
            int i46 = f52942s0;
            int i47 = i46 ^ 83;
            int i48 = ((i46 & 83) | i47) << 1;
            int i49 = -i47;
            int i50 = ((i48 | i49) << 1) - (i48 ^ i49);
            f52943t0 = i50 % 128;
            if (i50 % 2 != 0) {
                return ajwVar5;
            }
            throw null;
        }
        ajw ajwVar6 = (ajw) objArr[0];
        int iIdentityHashCode = System.identityHashCode(ajwVar6);
        int i51 = -(-((521676005 | iIdentityHashCode) * (-50)));
        int i52 = ((-1164459255) ^ i51) + ((i51 & (-1164459255)) << 1);
        int i53 = (-134742117) | iIdentityHashCode;
        int i54 = ~i53;
        int i55 = (i53 | i54) & i54;
        int i56 = ~iIdentityHashCode;
        int i57 = ((~i56) & 397442953) | (i56 & (-397442954));
        int i58 = 397442953 & i56;
        int i59 = (i57 & i58) | (i57 ^ i58);
        int i60 = ((-521676006) & i59) | ((~i59) & 521676005);
        int i61 = i59 & 521676005;
        int i62 = ~((i61 & i60) | (i60 ^ i61));
        int i63 = i55 ^ i62;
        int i64 = i55 & i62;
        int i65 = -(-(((i64 & i63) | (i63 ^ i64)) * 50));
        int i66 = ((i52 | i65) << 1) - (i65 ^ i52);
        int i67 = (iIdentityHashCode | i56) & i56;
        int i68 = ~((i67 & 397442953) | ((~i67) & 397442953) | (i67 & (-397442954)));
        int i69 = i68 & (-532185070);
        int i70 = (i68 | (-532185070)) & (~i69);
        int i71 = (i70 & i69) | (i70 ^ i69);
        int i72 = i56 & 521676005;
        int i73 = (521676005 | i56) & (~i72);
        int i74 = ~((i73 & i72) | (i73 ^ i72));
        int i75 = i71 & i74;
        int i76 = (i71 | i74) & (~i75);
        int i77 = -(-(((i76 & i75) | (i76 ^ i75)) * 50));
        int i78 = i66 | i77;
        int i79 = i78 << 1;
        int i80 = -((~(i77 & i66)) & i78);
        int i81 = (i79 ^ i80) + ((i80 & i79) << 1);
        int iIdentityHashCode2 = System.identityHashCode(ajwVar6);
        int i82 = ~iIdentityHashCode2;
        int i83 = ((-1095565441) & i82) | ((~i82) & 1095565440);
        int i84 = i82 & 1095565440;
        int i85 = (i83 & i84) | (i83 ^ i84);
        int i86 = i85 & (-1769846238);
        int i87 = (i85 | (-1769846238)) & (~i86);
        int i88 = ((i87 & i86) | (i87 ^ i86)) * 1444;
        int i89 = (-82549741) & i88;
        int i90 = ((((-82549741) ^ i88) | i89) << 1) - ((i88 | (-82549741)) & (~i89));
        int i91 = (~((1096646864 & iIdentityHashCode2) | (1096646864 ^ iIdentityHashCode2))) | (-1769846238);
        int i92 = (i82 & 1768764813) | ((-1768764814) & iIdentityHashCode2);
        int i93 = iIdentityHashCode2 & 1768764813;
        int i94 = ~((i93 & i92) | (i92 ^ i93));
        int i95 = ((i94 & i91) | (i91 ^ i94)) * (-1444);
        int i96 = (((i90 ^ i95) | (i90 & i95)) << 1) - ((i95 & (~i90)) | ((~i95) & i90));
        int i97 = (i96 ^ 1499430986) + ((1499430986 & i96) << 1);
        ady adyVar2 = ajwVar6.f52944r0;
        if (i81 <= i97) {
            throw null;
        }
        int i98 = f52943t0;
        int i99 = i98 & 39;
        int i100 = (i98 | 39) & (~i99);
        int i101 = i99 << 1;
        int i102 = (i100 & i101) + (i100 | i101);
        f52942s0 = i102 % 128;
        if (i102 % 2 == 0) {
            return adyVar2;
        }
        throw null;
    }

    @Override // com.mypinpad.tsdk.isolation.adw, com.mypinpad.tsdk.isolation.add
    public final ady UiMessageCallbackKtWhenMappings() {
        return (ady) setOnFocusChangeListener(new Object[]{this}, 1822382524, -1822382521, System.identityHashCode(this));
    }

    public final boolean setCompoundDrawableTintBlendMode() {
        return ((Boolean) setOnFocusChangeListener(new Object[]{this}, 129079318, -129079316, System.identityHashCode(this))).booleanValue();
    }

    public final ady setDividerPadding() {
        return (ady) setOnFocusChangeListener(new Object[]{this}, 317561633, -317561633, System.identityHashCode(this));
    }

    public ajw(adu aduVar) {
        this.f52944r0 = aduVar;
    }

    public ajw(ajz ajzVar) {
        this.f52944r0 = null;
        this.f52944r0 = ajzVar.UiMessageCallbackKtWhenMappings();
    }

    public final boolean setOnFocusChangeListener() {
        return ((Boolean) setOnFocusChangeListener(new Object[]{this}, 551840194, -551840193, System.identityHashCode(this))).booleanValue();
    }

    public static ajw setOnFocusChangeListener(Object obj) {
        return (ajw) setOnFocusChangeListener(new Object[]{obj}, 1407491790, -1407491786, (int) System.currentTimeMillis());
    }
}

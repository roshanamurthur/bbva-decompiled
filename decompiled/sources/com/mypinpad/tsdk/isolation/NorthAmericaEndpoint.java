package com.mypinpad.tsdk.isolation;

/* JADX INFO: loaded from: classes10.dex */
public final class NorthAmericaEndpoint extends setCompoundDrawableTintMode {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static int f51784c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f51785a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f51786b;

    public NorthAmericaEndpoint(float f6, float f10) {
        super(null);
        this.f51785a = f6;
        this.f51786b = f10;
    }

    public static /* synthetic */ Object setOnFocusChangeListener(Object[] objArr, int i10, int i11, int i12) {
        int i13 = (i11 * 246) + (i10 * (-244));
        int i14 = ~i11;
        int i15 = (((~((~i12) | i14)) | (~(i14 | i10))) * (-245)) + i13;
        int i16 = ~(i14 | i12);
        if (((i10 | i16) * 245) + (i16 * (-245)) + i15 != 1) {
            NorthAmericaEndpoint northAmericaEndpoint = (NorthAmericaEndpoint) objArr[0];
            int i17 = f51784c;
            int i18 = (i17 & 71) + (i17 | 71);
            int i19 = i18 % 128;
            int i20 = i18 % 2;
            float f6 = northAmericaEndpoint.f51786b;
            int i21 = (i19 & (-18)) | ((~i19) & 17);
            int i22 = (i19 & 17) << 1;
            int i23 = ((i21 | i22) << 1) - (i22 ^ i21);
            f51784c = i23 % 128;
            if (i23 % 2 == 0) {
                return Float.valueOf(f6);
            }
            throw null;
        }
        NorthAmericaEndpoint northAmericaEndpoint2 = (NorthAmericaEndpoint) objArr[0];
        int i24 = f51784c;
        int i25 = i24 & 109;
        int i26 = -(-((i24 ^ 109) | i25));
        int i27 = (i25 ^ i26) + ((i26 & i25) << 1);
        int i28 = i27 % 128;
        int i29 = i27 % 2;
        float f10 = northAmericaEndpoint2.f51785a;
        int iIdentityHashCode = System.identityHashCode(northAmericaEndpoint2);
        int i30 = ~iIdentityHashCode;
        int i31 = ~i30;
        int i32 = 365833295 & i30;
        int i33 = (365833295 | i30) & (~i32);
        int i34 = 815926206 - (~(-(~(((~((i33 & i32) | (i33 ^ i32))) | 148899304) * (-865)))));
        int i35 = (-365833296) ^ iIdentityHashCode;
        int i36 = iIdentityHashCode & (-365833296);
        int i37 = (i36 & i35) | (i35 ^ i36);
        int i38 = ~i37;
        int i39 = (i34 - (~(((i37 | i38) & i38) * 865))) - 1;
        int i40 = 148899304 & i30;
        int i41 = (148899304 | i30) & (~i40);
        int i42 = ~((i40 & i41) | (i41 ^ i40));
        int i43 = (i31 & (-365833296)) | i32;
        int i44 = i30 & (-365833296);
        int i45 = (i44 & i43) | (i43 ^ i44);
        int i46 = ~i45;
        int i47 = (i45 | i46) & i46;
        int i48 = ((i42 & i47) | (i42 ^ i47)) * 865;
        int i49 = i39 & i48;
        int i50 = ((((i39 ^ i48) | i49) << 1) - (~(-((i48 | i39) & (~i49))))) - 1;
        int iIdentityHashCode2 = System.identityHashCode(northAmericaEndpoint2);
        int i51 = ~iIdentityHashCode2;
        int i52 = (-1005440586) & i51;
        int i53 = (iIdentityHashCode2 & 1005440585) | i52;
        int i54 = (-1005440586) & iIdentityHashCode2;
        int i55 = (-576206291) - (~(-(-(((i53 & i54) | (i53 ^ i54)) * (-50)))));
        int i56 = ~((2146299627 & iIdentityHashCode2) | (2146299627 ^ iIdentityHashCode2));
        int i57 = (1560634027 ^ i51) | (1560634027 & i51);
        int i58 = ~((i57 & (-1005440586)) | (i57 & 1005440585) | ((~i57) & (-1005440586)));
        int i59 = (i55 - (~(-(-(((i56 & i58) | (i56 ^ i58)) * 50))))) - 1;
        int i60 = (iIdentityHashCode2 | i51) & i51;
        int i61 = (~((i60 & 1560634027) | ((~i60) & 1560634027) | ((-1560634028) & i60))) | 585665600;
        int i62 = ((~i51) & (-1005440586)) | (1005440585 & i51);
        int i63 = (i62 & i52) | (i62 ^ i52);
        int i64 = ~i63;
        int i65 = (i63 | i64) & i64;
        int i66 = ((~i65) & i61) | ((~i61) & i65);
        int i67 = i61 & i65;
        int i68 = -(-(((i67 & i66) | (i66 ^ i67)) * 50));
        int i69 = ((~i68) & i59) | ((~i59) & i68);
        int i70 = -(-((i68 & i59) << 1));
        if (i50 > ((i69 | i70) << 1) - (i70 ^ i69)) {
            int i71 = 67 / 0;
        }
        return Float.valueOf(f10);
    }

    public final float setDividerPadding() {
        return ((Float) setOnFocusChangeListener(new Object[]{this}, -1117852074, 1117852074, System.identityHashCode(this))).floatValue();
    }

    public final float setOnFocusChangeListener() {
        return ((Float) setOnFocusChangeListener(new Object[]{this}, 1100574478, -1100574477, System.identityHashCode(this))).floatValue();
    }
}

package com.mypinpad.tsdk.isolation;

import java.security.SecureRandom;

/* JADX INFO: loaded from: classes10.dex */
public final class akw {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SecureRandom f53032a;

    public akw(SecureRandom secureRandom) {
        this.f53032a = (SecureRandom) aku.setCompoundDrawableTintBlendMode(new Object[]{secureRandom}, 1484705821, -1484705819, (int) System.currentTimeMillis());
    }

    public static /* synthetic */ Object setY(Object[] objArr, int i10, int i11, int i12) {
        akw akwVar = (akw) objArr[0];
        int iIdentityHashCode = System.identityHashCode(akwVar);
        int i13 = ~iIdentityHashCode;
        int i14 = (1965167232 & i13) | ((-1965167233) & iIdentityHashCode);
        int i15 = 1965167232 & iIdentityHashCode;
        int i16 = ~((i15 & i14) | (i14 ^ i15));
        int i17 = (-2112796619) & i16;
        int i18 = (i16 | (-2112796619)) & (~i17);
        int i19 = -(~(((i18 & i17) | (i18 ^ i17)) * (-140)));
        int i20 = (((-248575949) & i19) + (i19 | (-248575949))) - 1;
        int i21 = (i13 & (-147629387)) | (147629386 & iIdentityHashCode);
        int i22 = (-147629387) & iIdentityHashCode;
        int i23 = (i21 & i22) | (i21 ^ i22);
        int i24 = ~i23;
        int i25 = ((i23 | i24) & i24) * 70;
        int i26 = (i20 & i25) + (i25 | i20);
        int i27 = (-1844225483) & iIdentityHashCode;
        int i28 = (iIdentityHashCode | (-1844225483)) & (~i27);
        int i29 = ~((i28 & i27) | (i28 ^ i27));
        int i30 = (-416200523) & i29;
        int i31 = (i29 | (-416200523)) & (~i30);
        int i32 = ((i31 & i30) | (i31 ^ i30)) * 70;
        int i33 = (i26 ^ i32) + ((i32 & i26) << 1);
        int iIdentityHashCode2 = System.identityHashCode(akwVar);
        int i34 = ~iIdentityHashCode2;
        int i35 = (iIdentityHashCode2 | i34) & i34;
        int i36 = (-1019243559) & i35;
        int i37 = (~i36) & ((-1019243559) | i35);
        int i38 = (i36 & i37) | (i37 ^ i36);
        int i39 = i38 & (-1897896032);
        int i40 = (i38 | (-1897896032)) & (~i39);
        int i41 = ~((i40 & i39) | (i40 ^ i39));
        int i42 = (i35 & 1897896031) | (1897896031 ^ i35);
        int i43 = (1019243558 & i42) | (i42 ^ 1019243558);
        int i44 = ~i43;
        int i45 = (i43 | i44) & i44;
        int i46 = ((~i45) & i41) | ((~i41) & i45);
        int i47 = i41 & i45;
        int i48 = (((i47 & i46) | (i46 ^ i47)) * (-184)) + 1879612790;
        int i49 = (-1019243559) ^ i34;
        int i50 = i34 & (-1019243559);
        int i51 = ~((i50 & i49) | (i49 ^ i50));
        int i52 = ((~i51) & 213935136) | ((-213935137) & i51);
        int i53 = i51 & 213935136;
        int i54 = (i53 & i52) | (i52 ^ i53);
        int i55 = ~i42;
        int i56 = i54 ^ i55;
        int i57 = i55 & i54;
        int i58 = -(-(((i57 & i56) | (i56 ^ i57)) * 184));
        int i59 = (i48 & i58) + (i58 | i48);
        int i60 = (i59 ^ 827342672) + ((827342672 & i59) << 1);
        SecureRandom secureRandom = akwVar.f53032a;
        if (i33 > i60) {
            return secureRandom;
        }
        throw null;
    }

    public final SecureRandom setY() {
        return (SecureRandom) setY(new Object[]{this}, 2046373563, -2046373563, System.identityHashCode(this));
    }
}

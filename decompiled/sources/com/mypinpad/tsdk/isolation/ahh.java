package com.mypinpad.tsdk.isolation;

/* JADX INFO: loaded from: classes10.dex */
public final class ahh extends adw {

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public static int f52657u0 = 0;
    public static int v0 = 1;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public adu f52658r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public adu f52659s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public adu f52660t0 = null;

    public ahh(adu aduVar, adu aduVar2) {
        this.f52658r0 = aduVar;
        this.f52659s0 = aduVar2;
    }

    public static Object setOnFocusChangeListener(Object[] objArr, int i10, int i11, int i12) {
        int i13 = ~i12;
        int i14 = (~i10) | i13;
        int i15 = (((~(i10 | i12)) | (~((~i11) | i10)) | (~(i11 | i14))) * 369) + (((~i14) | i11) * (-369)) + ((i10 | i11 | i13) * (-369)) + (i11 * 370) + (i10 * 370);
        if (i15 == 1) {
            ahh ahhVar = (ahh) objArr[0];
            int i16 = v0;
            int i17 = (i16 ^ 123) + ((i16 & 123) << 1);
            int i18 = i17 % 128;
            f52657u0 = i18;
            int i19 = i17 % 2;
            adu aduVar = ahhVar.f52660t0;
            int i20 = (i18 & 107) + (i18 | 107);
            v0 = i20 % 128;
            if (i20 % 2 != 0) {
                return aduVar;
            }
            int i21 = 14 / 0;
            return aduVar;
        }
        if (i15 == 2) {
            ahh ahhVar2 = (ahh) objArr[0];
            int i22 = v0;
            int i23 = i22 + 41;
            f52657u0 = i23 % 128;
            if (i23 % 2 != 0) {
                adu aduVar2 = ahhVar2.f52659s0;
                throw null;
            }
            adu aduVar3 = ahhVar2.f52659s0;
            int i24 = (((i22 | 94) << 1) - (i22 ^ 94)) - 1;
            f52657u0 = i24 % 128;
            int i25 = i24 % 2;
            return aduVar3;
        }
        if (i15 == 3) {
            ahh ahhVar3 = (ahh) objArr[0];
            adh adhVar = new adh(3);
            adh.setCompoundDrawableTintBlendMode(new Object[]{adhVar, ahhVar3.f52658r0}, 240298319, -240298315, System.identityHashCode(adhVar));
            adh.setCompoundDrawableTintBlendMode(new Object[]{adhVar, ahhVar3.f52659s0}, 240298319, -240298315, System.identityHashCode(adhVar));
            adu aduVar4 = ahhVar3.f52660t0;
            if (aduVar4 != null) {
                System.identityHashCode(ahhVar3);
                System.identityHashCode(ahhVar3);
                adh.setCompoundDrawableTintBlendMode(new Object[]{adhVar, aduVar4}, 240298319, -240298315, System.identityHashCode(adhVar));
                int i26 = f52657u0;
                int i27 = ((i26 | 73) << 1) - (i26 ^ 73);
                v0 = i27 % 128;
                int i28 = i27 % 2;
            }
            afv afvVar = new afv(adhVar);
            int i29 = v0;
            int i30 = i29 & 63;
            int i31 = (i29 ^ 63) | i30;
            int i32 = (i30 ^ i31) + ((i31 & i30) << 1);
            f52657u0 = i32 % 128;
            if (i32 % 2 == 0) {
                return afvVar;
            }
            throw null;
        }
        if (i15 == 4) {
            ahh ahhVar4 = (ahh) objArr[0];
            int i33 = f52657u0;
            int i34 = (((i33 ^ 105) | (i33 & 105)) << 1) - (((~i33) & 105) | (i33 & (-106)));
            v0 = i34 % 128;
            if (i34 % 2 != 0) {
                return ahhVar4.f52658r0;
            }
            adu aduVar5 = ahhVar4.f52658r0;
            throw null;
        }
        Object obj = objArr[0];
        int i35 = v0;
        int i36 = (i35 & (-114)) | ((~i35) & 113);
        int i37 = (i35 & 113) << 1;
        int i38 = ((i36 | i37) << 1) - (i37 ^ i36);
        int i39 = i38 % 128;
        f52657u0 = i39;
        if (i38 % 2 != 0) {
            boolean z10 = obj instanceof ahh;
            throw null;
        }
        if (obj instanceof ahh) {
            int i40 = (-2) - ((i39 + 72) ^ (-1));
            int i41 = i40 % 128;
            v0 = i41;
            if (i40 % 2 == 0) {
                throw null;
            }
            ahh ahhVar5 = (ahh) obj;
            int i42 = ((i41 | 41) << 1) - (i41 ^ 41);
            f52657u0 = i42 % 128;
            if (i42 % 2 == 0) {
                return ahhVar5;
            }
            int i43 = 15 / 0;
            return ahhVar5;
        }
        if (obj == null) {
            int i44 = ((i39 | 78) << 1) - (i39 ^ 78);
            int i45 = (i44 ^ (-1)) + (i44 << 1);
            v0 = i45 % 128;
            int i46 = i45 % 2;
            return null;
        }
        aed compoundDrawableTintBlendMode = aed.setCompoundDrawableTintBlendMode(obj);
        ahh ahhVar6 = new ahh();
        ahhVar6.f52658r0 = (adu) compoundDrawableTintBlendMode.setX(0);
        ahhVar6.f52659s0 = (adu) compoundDrawableTintBlendMode.setX(1);
        if (compoundDrawableTintBlendMode.setCompoundDrawableTintBlendMode() > 2) {
            ahhVar6.f52660t0 = (adu) compoundDrawableTintBlendMode.setX(2);
        }
        int iCurrentTimeMillis = (int) System.currentTimeMillis();
        int i47 = ~iCurrentTimeMillis;
        int i48 = i47 ^ (-724544526);
        int i49 = i47 & (-724544526);
        int i50 = ~(i48 | i49);
        int i51 = i50 & 153748489;
        int i52 = (i50 | 153748489) & (~i51);
        int i53 = -(~(((i52 & i51) | (i52 ^ i51)) * 529));
        int i54 = ((-1650083474) ^ i53) + ((i53 & (-1650083474)) << 1);
        int i55 = (i54 ^ (-1)) + (i54 << 1);
        int i56 = i49 | (724544525 & iCurrentTimeMillis);
        int i57 = iCurrentTimeMillis & (-724544526);
        int i58 = ~((i57 & i56) | (i56 ^ i57));
        int i59 = ((~i58) & (-1993713925)) | (1993713924 & i58);
        int i60 = i58 & (-1993713925);
        int i61 = -(-(((i60 & i59) | (i59 ^ i60)) * 529));
        int i62 = i55 & i61;
        int i63 = i62 + ((i61 ^ i55) | i62);
        int iCurrentTimeMillis2 = (int) System.currentTimeMillis();
        int i64 = ~iCurrentTimeMillis2;
        int i65 = i64 & 551908613;
        int i66 = (~i65) & (i64 | 551908613);
        int i67 = ~((i66 & i65) | (i66 ^ i65));
        int i68 = ((i67 & (-837287208)) | ((~i67) & (-837287208)) | (837287207 & i67)) * (-1188);
        int i69 = (1358112812 & i68) + (i68 | 1358112812);
        int i70 = (-551908614) & i64;
        int i71 = (iCurrentTimeMillis2 & (-551908614)) | (551908613 & iCurrentTimeMillis2) | i70;
        int i72 = ~i71;
        int i73 = (i71 | i72) & i72;
        int i74 = (i73 & (-837287208)) | ((-837287208) ^ i73);
        int i75 = ~(i64 | (-289840423));
        int i76 = ((~i75) & i74) | ((~i74) & i75);
        int i77 = i74 & i75;
        int i78 = ((i77 & i76) | (i76 ^ i77)) * 594;
        int i79 = i69 & i78;
        int i80 = i79 + ((i78 ^ i69) | i79);
        int i81 = ((~i64) & (-551908614)) | i65;
        int i82 = i64 ^ (-289840423);
        int i83 = i64 & (-289840423);
        if (i63 > (i80 - (~((((~((i81 & i70) | (i81 ^ i70))) | 4461828) | (~((i83 & i82) | (i82 ^ i83)))) * 594))) - 1) {
            return ahhVar6;
        }
        throw null;
    }

    @Override // com.mypinpad.tsdk.isolation.adw, com.mypinpad.tsdk.isolation.add
    public final ady UiMessageCallbackKtWhenMappings() {
        return (ady) setOnFocusChangeListener(new Object[]{this}, 578281284, -578281281, System.identityHashCode(this));
    }

    public final adu setCompoundDrawableTintBlendMode() {
        return (adu) setOnFocusChangeListener(new Object[]{this}, -1501399272, 1501399273, System.identityHashCode(this));
    }

    public final adu setX() {
        return (adu) setOnFocusChangeListener(new Object[]{this}, -371706487, 371706491, System.identityHashCode(this));
    }

    public final adu setOnFocusChangeListener() {
        return (adu) setOnFocusChangeListener(new Object[]{this}, 622724280, -622724278, System.identityHashCode(this));
    }

    public static ahh setOnFocusChangeListener(Object obj) {
        return (ahh) setOnFocusChangeListener(new Object[]{obj}, 1278117974, -1278117974, (int) System.currentTimeMillis());
    }
}

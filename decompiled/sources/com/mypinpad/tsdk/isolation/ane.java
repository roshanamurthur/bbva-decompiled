package com.mypinpad.tsdk.isolation;

/* JADX INFO: loaded from: classes10.dex */
public final class ane extends ank {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static int f53303k = 0;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static int f53304l = 1;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final adu f53305i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final adu f53306j;

    public ane(ang angVar, adu aduVar, adu aduVar2, adu aduVar3) {
        super(aduVar, angVar);
        ank ankVar = (ank) angVar;
        if (!((Boolean) ady.setNavigationOnClickListener(new Object[]{aduVar, (adu) ank.setDividerPadding(new Object[]{ankVar}, -1737123400, 1737123400, System.identityHashCode(ankVar))}, -109201153, 109201153, System.identityHashCode(aduVar))).booleanValue()) {
            throw new IllegalArgumentException("named parameters do not match publicKeyParamSet value");
        }
        this.f53305i = aduVar;
        this.f53306j = aduVar2;
    }

    public static /* synthetic */ Object setY(Object[] objArr, int i10, int i11, int i12) {
        int i13 = ~i10;
        int i14 = (((~(i13 | i11)) | (~(i13 | i12))) * (-566)) + (i11 * (-565)) + (i10 * 567);
        int i15 = ~i11;
        if (((~(i15 | i13 | i12)) * 566) + ((~(i10 | i15)) * 566) + i14 == 1) {
            ane aneVar = (ane) objArr[0];
            int i16 = f53304l;
            int i17 = i16 & 85;
            int i18 = ((i16 | 85) & (~i17)) + (i17 << 1);
            int i19 = i18 % 128;
            f53303k = i19;
            int i20 = i18 % 2;
            adu aduVar = aneVar.f53305i;
            int i21 = ((i19 & (-12)) | ((~i19) & 11)) + ((i19 & 11) << 1);
            f53304l = i21 % 128;
            int i22 = i21 % 2;
            return aduVar;
        }
        ane aneVar2 = (ane) objArr[0];
        int i23 = f53303k;
        int i24 = (i23 & 23) + (i23 | 23);
        int i25 = i24 % 128;
        f53304l = i25;
        int i26 = i24 % 2;
        adu aduVar2 = aneVar2.f53306j;
        if (i26 == 0) {
            throw null;
        }
        int i27 = i25 & 57;
        int i28 = (i25 | 57) & (~i27);
        int i29 = i27 << 1;
        int i30 = ((i28 | i29) << 1) - (i28 ^ i29);
        f53303k = i30 % 128;
        if (i30 % 2 == 0) {
            return aduVar2;
        }
        int i31 = 31 / 0;
        return aduVar2;
    }

    public final adu setNavigationOnClickListener() {
        return (adu) setY(new Object[]{this}, -360397317, 360397318, System.identityHashCode(this));
    }

    public final adu setOnLongClickListener() {
        return (adu) setY(new Object[]{this}, -1795598198, 1795598198, System.identityHashCode(this));
    }
}

package com.mypinpad.tsdk.isolation;

/* JADX INFO: loaded from: classes10.dex */
public abstract class j0 extends i0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static int f56574d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static int f56575e = 1;

    public j0(Class cls, int i10) {
        super(cls);
        Integer.valueOf(i10).intValue();
    }

    public static /* synthetic */ ady c(int i10, int i11, int i12, Object[] objArr) {
        int i13 = ~i11;
        int i14 = ~i12;
        int i15 = (((~(i10 | i11)) | (~(i12 | i13))) * 49) + (((~((~i10) | i14)) | i13 | (~(i10 | i12))) * (-49)) + (((~(i13 | i14)) | (~(i13 | i10))) * 98) + (i11 * (-97)) + (i10 * 50);
        if (i15 == 1) {
            j0 j0Var = (j0) objArr[0];
            byte[] bArr = (byte[]) objArr[1];
            int i16 = f56575e;
            int i17 = ((i16 & 3) - (~(3 | i16))) - 1;
            f56574d = i17 % 128;
            int i18 = i17 % 2;
            ady adyVarC = c(-589139092, 589139094, System.identityHashCode(j0Var), new Object[]{j0Var, (ady) ady.setNavigationOnClickListener(new Object[]{bArr}, -1692126728, 1692126730, (int) System.currentTimeMillis())});
            int i19 = f56575e;
            int i20 = ((i19 & (-30)) | ((~i19) & 29)) + ((i19 & 29) << 1);
            f56574d = i20 % 128;
            int i21 = i20 % 2;
            return adyVarC;
        }
        if (i15 != 2) {
            j0 j0Var2 = (j0) objArr[0];
            aeh aehVar = (aeh) objArr[1];
            boolean zBooleanValue = ((Boolean) objArr[2]).booleanValue();
            int i22 = f56574d;
            int i23 = ((i22 | 123) << 1) - (i22 ^ 123);
            f56575e = i23 % 128;
            int i24 = i23 % 2;
            if (128 != ((Integer) aeh.setOnFocusChangeListener(new Object[]{aehVar}, 1270018882, -1270018871, System.identityHashCode(aehVar))).intValue()) {
                throw new IllegalStateException("this method only valid for CONTEXT_SPECIFIC tags");
            }
            ady adyVarC2 = c(-589139092, 589139094, System.identityHashCode(j0Var2), new Object[]{j0Var2, (ady) aeh.setOnFocusChangeListener(new Object[]{aehVar, Boolean.valueOf(zBooleanValue), j0Var2}, 1266906917, -1266906917, System.identityHashCode(aehVar))});
            int i25 = f56575e + 9;
            f56574d = i25 % 128;
            int i26 = i25 % 2;
            return adyVarC2;
        }
        j0 j0Var3 = (j0) objArr[0];
        ady adyVar = (ady) objArr[1];
        int i27 = f56575e;
        int i28 = i27 & 113;
        int i29 = ((i27 ^ 113) | i28) << 1;
        int i30 = -((i27 | 113) & (~i28));
        int i31 = (i29 & i30) + (i30 | i29);
        f56574d = i31 % 128;
        int i32 = i31 % 2;
        if (!j0Var3.f56319a.isInstance(adyVar)) {
            throw new IllegalStateException("unexpected object: ".concat(adyVar.getClass().getName()));
        }
        int i33 = f56575e;
        int i34 = (i33 & (-106)) | ((~i33) & 105);
        int i35 = -(-((i33 & 105) << 1));
        int i36 = ((i34 | i35) << 1) - (i35 ^ i34);
        f56574d = i36 % 128;
        if (i36 % 2 == 0) {
            return adyVar;
        }
        throw null;
    }

    public ady b(aft aftVar) {
        throw new IllegalStateException("unexpected implicit primitive encoding");
    }

    public ady d(aed aedVar) {
        throw new IllegalStateException("unexpected implicit constructed encoding");
    }
}

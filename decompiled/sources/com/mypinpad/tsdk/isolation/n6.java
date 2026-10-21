package com.mypinpad.tsdk.isolation;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes10.dex */
public final class n6 extends Lambda implements Function1<getBeepOnFailure, Boolean> {

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public static int f57202q0 = 0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public static int f57203r0 = 1;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ kl f57204p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n6(kl klVar) {
        super(1);
        this.f57204p0 = klVar;
    }

    public static /* synthetic */ Boolean a(Object[] objArr, int i10, int i11, int i12) {
        int i13 = ~i11;
        int i14 = ((i10 | i12 | i13) * (-676)) + (i11 * (-675)) + (i10 * 677);
        int i15 = ~(i13 | i10);
        int i16 = ~i12;
        if ((((~(i10 | i11 | i12)) | (~((~i10) | i13)) | (~(i13 | i16))) * 676) + ((i15 | (~(i16 | i10))) * 676) + i14 != 1) {
            n6 n6Var = (n6) objArr[0];
            getBeepOnFailure getbeeponfailure = (getBeepOnFailure) objArr[1];
            int i17 = f57202q0;
            int i18 = i17 & 107;
            int i19 = ((i17 ^ 107) | i18) << 1;
            int i20 = -((i17 | 107) & (~i18));
            int i21 = (i19 & i20) + (i20 | i19);
            f57203r0 = i21 % 128;
            int i22 = i21 % 2;
            Intrinsics.checkNotNullParameter(getbeeponfailure, "");
            Boolean boolValueOf = Boolean.valueOf(((Boolean) kl.setDividerPadding(new Object[]{n6Var.f57204p0, getbeeponfailure}, 745115920, -745115906, (int) System.currentTimeMillis())).booleanValue());
            int i23 = f57203r0;
            int i24 = (i23 & (-94)) | ((~i23) & 93);
            int i25 = -(-((i23 & 93) << 1));
            int i26 = (i24 & i25) + (i25 | i24);
            f57202q0 = i26 % 128;
            int i27 = i26 % 2;
            return boolValueOf;
        }
        n6 n6Var2 = (n6) objArr[0];
        Object obj = objArr[1];
        int i28 = f57203r0;
        int i29 = (i28 | 51) << 1;
        int i30 = -(i28 ^ 51);
        int i31 = (i29 & i30) + (i30 | i29);
        f57202q0 = i31 % 128;
        getBeepOnFailure getbeeponfailure2 = (getBeepOnFailure) obj;
        if (i31 % 2 != 0) {
            a(new Object[]{n6Var2, getbeeponfailure2}, 363242472, -363242472, System.identityHashCode(n6Var2));
            throw null;
        }
        Boolean boolA = a(new Object[]{n6Var2, getbeeponfailure2}, 363242472, -363242472, System.identityHashCode(n6Var2));
        int i32 = f57202q0;
        int i33 = ((i32 ^ 119) | (i32 & 119)) << 1;
        int i34 = -(((~i32) & 119) | (i32 & (-120)));
        int i35 = (i33 & i34) + (i34 | i33);
        f57203r0 = i35 % 128;
        int i36 = i35 % 2;
        return boolA;
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ Boolean invoke(getBeepOnFailure getbeeponfailure) {
        return a(new Object[]{this, getbeeponfailure}, 769367447, -769367446, System.identityHashCode(this));
    }
}

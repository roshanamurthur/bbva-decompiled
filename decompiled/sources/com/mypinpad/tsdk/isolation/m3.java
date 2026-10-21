package com.mypinpad.tsdk.isolation;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes10.dex */
public final class m3 extends Lambda implements Function1<getBeepOnFailure, Boolean> {

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public static int f57041q0 = 0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public static int f57042r0 = 1;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ configBeepVolume f57043p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m3(configBeepVolume configbeepvolume) {
        super(1);
        this.f57043p0 = configbeepvolume;
    }

    public static /* synthetic */ Boolean a(Object[] objArr, int i10, int i11, int i12) {
        boolean z10;
        int i13 = (i11 * (-475)) + (i10 * 477);
        int i14 = ~((~i10) | i11);
        int i15 = ~i11;
        int i16 = ~(i15 | i10 | i12);
        if (((~(i10 | i15 | (~i12))) * 476) + (i16 * 952) + ((i14 | i16) * (-476)) + i13 != 1) {
            m3 m3Var = (m3) objArr[0];
            Object obj = objArr[1];
            int i17 = f57041q0;
            int i18 = i17 & 107;
            int i19 = i18 + ((i17 ^ 107) | i18);
            f57042r0 = i19 % 128;
            int i20 = i19 % 2;
            Boolean boolA = a(new Object[]{m3Var, (getBeepOnFailure) obj}, -624283637, 624283638, System.identityHashCode(m3Var));
            System.identityHashCode(m3Var);
            System.identityHashCode(m3Var);
            return boolA;
        }
        m3 m3Var2 = (m3) objArr[0];
        getBeepOnFailure getbeeponfailure = (getBeepOnFailure) objArr[1];
        int i21 = f57041q0;
        int i22 = i21 ^ 67;
        int i23 = ((i21 & 67) | i22) << 1;
        int i24 = -i22;
        int i25 = (i23 & i24) + (i23 | i24);
        f57042r0 = i25 % 128;
        int i26 = i25 % 2;
        Intrinsics.checkNotNullParameter(getbeeponfailure, "");
        if (((Boolean) configBeepVolume.setX(new Object[]{m3Var2.f57043p0, getbeeponfailure}, 1585110179, -1585110178, (int) System.currentTimeMillis())).booleanValue()) {
            int i27 = f57041q0;
            int i28 = i27 & 33;
            int i29 = (i27 ^ 33) | i28;
            int i30 = ((i28 | i29) << 1) - (i29 ^ i28);
            f57042r0 = i30 % 128;
            int i31 = i30 % 2;
            z10 = false;
        } else {
            int i32 = f57041q0;
            int i33 = i32 & 95;
            int i34 = (i32 | 95) & (~i33);
            int i35 = -(-(i33 << 1));
            int i36 = ((i34 | i35) << 1) - (i34 ^ i35);
            f57042r0 = i36 % 128;
            int i37 = i36 % 2;
            z10 = true;
        }
        Boolean boolValueOf = Boolean.valueOf(z10);
        int i38 = f57042r0;
        int i39 = (((i38 & (-92)) | ((~i38) & 91)) - (~((i38 & 91) << 1))) - 1;
        f57041q0 = i39 % 128;
        if (i39 % 2 == 0) {
            return boolValueOf;
        }
        int i40 = 28 / 0;
        return boolValueOf;
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ Boolean invoke(getBeepOnFailure getbeeponfailure) {
        return a(new Object[]{this, getbeeponfailure}, 1343007297, -1343007297, System.identityHashCode(this));
    }
}

package com.mypinpad.tsdk.isolation;

import com.bbva.sl.ar.android.sslpinning.result.ResultCode;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes10.dex */
public final class f9 extends Lambda implements Function1<getBeepOnFailure, Boolean> {

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public static int f55507q0 = 0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public static int f55508r0 = 1;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ setTransitionAlpha f55509p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f9(setTransitionAlpha settransitionalpha) {
        super(1);
        this.f55509p0 = settransitionalpha;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:21:? A[RETURN, SYNTHETIC] */
    public static /* synthetic */ Boolean a(Object[] objArr, int i10, int i11, int i12) {
        boolean z10;
        Boolean boolValueOf;
        int i13;
        int i14 = (i11 * ResultCode.ERROR_TRUST_CERT_DATE_AFTERVALIDITY) + (i10 * (-519));
        int i15 = ~i10;
        int i16 = ~i11;
        int i17 = ~i12;
        int i18 = (((~(i11 | i12)) | (~(i15 | i16 | i17))) * 520) + i14;
        int i19 = ~(i16 | i17);
        int i20 = ~(i12 | i10);
        if ((((~(i10 | i16)) | (~(i15 | i17)) | i20) * 520) + ((i19 | i20) * (-1040)) + i18 == 1) {
            f9 f9Var = (f9) objArr[0];
            Object obj = objArr[1];
            int i21 = f55508r0;
            int i22 = ((i21 & 34) + (i21 | 34)) - 1;
            f55507q0 = i22 % 128;
            int i23 = i22 % 2;
            Boolean boolA = a(new Object[]{f9Var, (getBeepOnFailure) obj}, -610545959, 610545959, System.identityHashCode(f9Var));
            int i24 = f55508r0;
            int i25 = i24 & 47;
            int i26 = (i24 | 47) & (~i25);
            int i27 = -(-(i25 << 1));
            int i28 = (i26 & i27) + (i26 | i27);
            f55507q0 = i28 % 128;
            int i29 = i28 % 2;
            return boolA;
        }
        f9 f9Var2 = (f9) objArr[0];
        getBeepOnFailure getbeeponfailure = (getBeepOnFailure) objArr[1];
        int i30 = f55508r0;
        int i31 = i30 & 1;
        int i32 = -(-((i30 ^ 1) | i31));
        int i33 = (i31 & i32) + (i32 | i31);
        f55507q0 = i33 % 128;
        if (i33 % 2 != 0) {
            Intrinsics.checkNotNullParameter(getbeeponfailure, "");
            ((Boolean) setTransitionAlpha.setY(new Object[]{f9Var2.f55509p0, getbeeponfailure}, 1189044647, -1189044643, (int) System.currentTimeMillis())).booleanValue();
            throw null;
        }
        Intrinsics.checkNotNullParameter(getbeeponfailure, "");
        if (!((Boolean) setTransitionAlpha.setY(new Object[]{f9Var2.f55509p0, getbeeponfailure}, 1189044647, -1189044643, (int) System.currentTimeMillis())).booleanValue()) {
            int i34 = f55507q0;
            int i35 = i34 & 35;
            int i36 = (i34 | 35) & (~i35);
            int i37 = -(-(i35 << 1));
            int i38 = (i36 & i37) + (i36 | i37);
            f55508r0 = i38 % 128;
            if (i38 % 2 != 0) {
                z10 = true;
            }
            boolValueOf = Boolean.valueOf(z10);
            int i39 = f55507q0;
            int i40 = i39 ^ 107;
            int i41 = ((i39 & 107) | i40) << 1;
            int i42 = -i40;
            i13 = (i41 ^ i42) + ((i41 & i42) << 1);
            f55508r0 = i13 % 128;
            if (i13 % 2 == 0) {
                return boolValueOf;
            }
            int i43 = 44 / 0;
            return boolValueOf;
        }
        int i44 = f55507q0;
        int i45 = ((i44 | 117) << 1) - (i44 ^ 117);
        f55508r0 = i45 % 128;
        int i46 = i45 % 2;
        z10 = false;
        boolValueOf = Boolean.valueOf(z10);
        int i310 = f55507q0;
        int i47 = i310 ^ 107;
        int i48 = ((i310 & 107) | i47) << 1;
        int i49 = -i47;
        i13 = (i48 ^ i49) + ((i48 & i49) << 1);
        f55508r0 = i13 % 128;
        if (i13 % 2 == 0) {
            return boolValueOf;
        }
        int i410 = 44 / 0;
        return boolValueOf;
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ Boolean invoke(getBeepOnFailure getbeeponfailure) {
        return a(new Object[]{this, getbeeponfailure}, -128968798, 128968799, System.identityHashCode(this));
    }
}

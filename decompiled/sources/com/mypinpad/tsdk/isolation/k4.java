package com.mypinpad.tsdk.isolation;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "p0", "Lcom/mypinpad/tsdk/i/getBeepOnFailure;", "setY", "(Ljava/lang/String;)Lcom/mypinpad/tsdk/i/getBeepOnFailure;"}, k = 3, mv = {1, 5, 1}, xi = 48)
final class k4 extends Lambda implements Function1<String, getBeepOnFailure> {

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public static int f56749q0 = 0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public static int f56750r0 = 1;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ setMaxWidth f56751p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k4(setMaxWidth setmaxwidth) {
        super(1);
        this.f56751p0 = setmaxwidth;
    }

    public static /* synthetic */ getBeepOnFailure a(Object[] objArr, int i10, int i11, int i12) {
        int i13 = ~i12;
        int i14 = ((i10 | i12) * 164) + (((~(i13 | i11)) | i10) * (-328)) + (i11 * (-163)) + (i10 * 165);
        int i15 = ~i10;
        int i16 = ~i11;
        if ((((~(i10 | i13 | i11)) | (~(i12 | i16)) | (~(i15 | i16))) * 164) + i14 == 1) {
            k4 k4Var = (k4) objArr[0];
            Object obj = objArr[1];
            int i17 = f56749q0;
            int i18 = (((i17 ^ 97) | (i17 & 97)) << 1) - (((~i17) & 97) | (i17 & (-98)));
            f56750r0 = i18 % 128;
            int i19 = i18 % 2;
            getBeepOnFailure getbeeponfailureA = a(new Object[]{k4Var, (String) obj}, -769066968, 769066968, System.identityHashCode(k4Var));
            int i20 = f56749q0 + 62;
            int i21 = (i20 ^ (-1)) + (i20 << 1);
            f56750r0 = i21 % 128;
            int i22 = i21 % 2;
            return getbeeponfailureA;
        }
        k4 k4Var2 = (k4) objArr[0];
        String str = (String) objArr[1];
        int i23 = f56750r0;
        int i24 = ((i23 | 39) << 1) - (i23 ^ 39);
        f56749q0 = i24 % 128;
        if (i24 % 2 == 0) {
            Intrinsics.checkNotNullParameter(str, "");
            setMaxWidth setmaxwidth = k4Var2.f56751p0;
            return (getBeepOnFailure) setMaxWidth.setX(new Object[]{setmaxwidth, str}, -480651882, 480651889, System.identityHashCode(setmaxwidth));
        }
        Intrinsics.checkNotNullParameter(str, "");
        setMaxWidth setmaxwidth2 = k4Var2.f56751p0;
        throw null;
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ getBeepOnFailure invoke(String str) {
        return a(new Object[]{this, str}, -892799410, 892799411, System.identityHashCode(this));
    }
}

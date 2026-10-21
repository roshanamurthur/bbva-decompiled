package com.mypinpad.tsdk.isolation;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/mypinpad/tsdk/i/z;", "", "setDividerPadding", "(Lcom/mypinpad/tsdk/i/z;)V"}, k = 3, mv = {1, 5, 1}, xi = 48)
final class j5 extends Lambda implements Function1<z, Unit> {

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public static int f56603s0 = 0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public static int f56604t0 = 1;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ fd f56605p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ Ref.ObjectRef<getY> f56606q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final /* synthetic */ gv f56607r0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j5(fd fdVar, Ref.ObjectRef<getY> objectRef, gv gvVar) {
        super(1);
        this.f56605p0 = fdVar;
        this.f56606q0 = objectRef;
        this.f56607r0 = gvVar;
    }

    public static /* synthetic */ Unit a(Object[] objArr, int i10, int i11, int i12) {
        boolean z10;
        int i13 = (i11 * TypedValues.MotionType.TYPE_EASING) + (i10 * 302);
        int i14 = ~i10;
        int i15 = ~i12;
        int i16 = ((~(i11 | i15)) * 301) + (((~(i10 | i15 | i11)) | (~(i12 | i14)) | (~((~i11) | i14))) * (-301)) + (((~(i14 | i15)) | i11) * (-602)) + i13;
        Unit unit = null;
        if (i16 != 1) {
            j5 j5Var = (j5) objArr[0];
            Object obj = objArr[1];
            int i17 = f56603s0;
            int i18 = i17 & 13;
            int i19 = i18 + ((i17 ^ 13) | i18);
            f56604t0 = i19 % 128;
            z zVar = (z) obj;
            if (i19 % 2 == 0) {
                a(new Object[]{j5Var, zVar}, -1605185688, 1605185689, System.identityHashCode(j5Var));
                Unit unit2 = Unit.INSTANCE;
                throw null;
            }
            a(new Object[]{j5Var, zVar}, -1605185688, 1605185689, System.identityHashCode(j5Var));
            unit = Unit.INSTANCE;
            int i20 = f56604t0;
            int i21 = (((i20 | 120) << 1) - (i20 ^ 120)) - 1;
            f56603s0 = i21 % 128;
            if (i21 % 2 != 0) {
                int i22 = 43 / 0;
            }
        } else {
            j5 j5Var2 = (j5) objArr[0];
            z zVar2 = (z) objArr[1];
            int i23 = f56603s0;
            int i24 = ((i23 & 94) + (i23 | 94)) - 1;
            f56604t0 = i24 % 128;
            int i25 = i24 % 2;
            Intrinsics.checkNotNullParameter(zVar2, "");
            z.setY(new Object[]{zVar2, j5Var2.f56605p0}, -1362792018, 1362792029, System.identityHashCode(zVar2));
            z.setY(new Object[]{zVar2, j5Var2.f56606q0.element}, 1653459763, -1653459744, System.identityHashCode(zVar2));
            TransactionFailed indeterminateDrawableTiled = setAnimation.setIndeterminateDrawableTiled();
            gv gvVar = j5Var2.f56607r0;
            if (((getBeepOnFailure) setScrollBarDefaultDelayBeforeFade.setDividerPadding(new Object[]{gvVar, indeterminateDrawableTiled}, -1593889019, 1593889062, System.identityHashCode(gvVar))) != null) {
                int i26 = f56603s0 + 17;
                int i27 = i26 % 128;
                f56604t0 = i27;
                int i28 = i26 % 2;
                int i29 = i27 & 21;
                int i30 = i27 | 21;
                int i31 = (i29 & i30) + (i29 | i30);
                f56603s0 = i31 % 128;
                int i32 = i31 % 2;
                z10 = true;
            } else {
                int i33 = f56604t0;
                int i34 = (i33 & 31) + (i33 | 31);
                f56603s0 = i34 % 128;
                int i35 = i34 % 2;
                z10 = false;
            }
            z.setY(new Object[]{zVar2, Boolean.valueOf(z10)}, 1618972104, -1618972098, System.identityHashCode(zVar2));
            int i36 = f56604t0;
            int i37 = (((i36 & (-102)) | ((~i36) & 101)) - (~((i36 & 101) << 1))) - 1;
            f56603s0 = i37 % 128;
            int i38 = i37 % 2;
        }
        return unit;
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ Unit invoke(z zVar) {
        return a(new Object[]{this, zVar}, 445978416, -445978416, System.identityHashCode(this));
    }
}

package com.mypinpad.tsdk.isolation;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/mypinpad/tsdk/i/z;", "", "setY", "(Lcom/mypinpad/tsdk/i/z;)V"}, k = 3, mv = {1, 5, 1}, xi = 48)
final class d4 extends Lambda implements Function1<z, Unit> {

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public static int f55103q0 = 0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public static int f55104r0 = 1;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ j f55105p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d4(j jVar) {
        super(1);
        this.f55105p0 = jVar;
    }

    public static /* synthetic */ Unit a(Object[] objArr, int i10, int i11, int i12) {
        Unit unit;
        int i13 = (i11 * (-929)) + (i10 * (-464));
        int i14 = ~i10;
        int i15 = i11 | i12;
        if (((i14 | i15) * 465) + ((i11 | (~(i12 | i14))) * 930) + (((~i15) | i14) * (-465)) + i13 != 1) {
            d4 d4Var = (d4) objArr[0];
            Object obj = objArr[1];
            int i16 = f55103q0 + 41;
            f55104r0 = i16 % 128;
            z zVar = (z) obj;
            if (i16 % 2 == 0) {
                a(new Object[]{d4Var, zVar}, 2129146961, -2129146960, System.identityHashCode(d4Var));
                unit = Unit.INSTANCE;
                int i17 = 58 / 0;
            } else {
                a(new Object[]{d4Var, zVar}, 2129146961, -2129146960, System.identityHashCode(d4Var));
                unit = Unit.INSTANCE;
            }
            int i18 = f55103q0;
            int i19 = (-2) - (((i18 & 14) + (i18 | 14)) ^ (-1));
            f55104r0 = i19 % 128;
            if (i19 % 2 != 0) {
                return unit;
            }
            int i20 = 44 / 0;
            return unit;
        }
        d4 d4Var2 = (d4) objArr[0];
        z zVar2 = (z) objArr[1];
        int i21 = f55104r0 + 56;
        int i22 = (i21 ^ (-1)) + (i21 << 1);
        f55103q0 = i22 % 128;
        int i23 = i22 % 2;
        Intrinsics.checkNotNullParameter(zVar2, "");
        j jVar = d4Var2.f55105p0;
        z.setY(new Object[]{zVar2, (fd) j.setDividerPadding(new Object[]{jVar}, -624677485, 624677493, System.identityHashCode(jVar))}, -1362792018, 1362792029, System.identityHashCode(zVar2));
        j jVar2 = d4Var2.f55105p0;
        z.setY(new Object[]{zVar2, (getY) j.setDividerPadding(new Object[]{jVar2}, -500139973, 500139976, System.identityHashCode(jVar2))}, 1653459763, -1653459744, System.identityHashCode(zVar2));
        setTransitionVisibility settransitionvisibility = (setTransitionVisibility) j.setDividerPadding(new Object[]{jVar2}, -453755924, 453755935, System.identityHashCode(jVar2));
        if (settransitionvisibility == null) {
            int i24 = f55103q0;
            int i25 = (i24 | 113) << 1;
            int i26 = -(i24 ^ 113);
            int i27 = ((i25 | i26) << 1) - (i26 ^ i25);
            f55104r0 = i27 % 128;
            if (i27 % 2 == 0) {
                setTransitionVisibility.Companion companion = setTransitionVisibility.INSTANCE;
                throw null;
            }
            settransitionvisibility = setTransitionVisibility.setOnDragListener;
            int i28 = f55104r0;
            int i29 = (-2) - (((i28 & 114) + (i28 | 114)) ^ (-1));
            f55103q0 = i29 % 128;
            int i30 = i29 % 2;
        } else {
            int i31 = f55103q0;
            int i32 = i31 & 13;
            int i33 = i31 | 13;
            int i34 = (i32 ^ i33) + ((i33 & i32) << 1);
            f55104r0 = i34 % 128;
            int i35 = i34 % 2;
        }
        z.setY(new Object[]{zVar2, settransitionvisibility}, 1357340711, -1357340703, System.identityHashCode(zVar2));
        z.setY(new Object[]{zVar2, Boolean.valueOf(((Boolean) j.setDividerPadding(new Object[]{jVar2}, 693029875, -693029866, System.identityHashCode(jVar2))).booleanValue())}, 1802544043, -1802544040, System.identityHashCode(zVar2));
        z.setY(new Object[]{zVar2, Boolean.valueOf(((Boolean) j.setDividerPadding(new Object[]{jVar2}, 775130114, -775130109, System.identityHashCode(jVar2))).booleanValue())}, 1456680272, -1456680263, System.identityHashCode(zVar2));
        z.setY(new Object[]{zVar2, Boolean.FALSE}, 1618972104, -1618972098, System.identityHashCode(zVar2));
        z.setY(new Object[]{zVar2, Boolean.TRUE}, 2127853437, -2127853420, System.identityHashCode(zVar2));
        z.setY(new Object[]{zVar2, Byte.valueOf(((Byte) j.setDividerPadding(new Object[]{jVar2}, 1057108919, -1057108909, System.identityHashCode(jVar2))).byteValue())}, -48425587, 48425602, System.identityHashCode(zVar2));
        z.setY(new Object[]{zVar2, i.N_A}, 2047527357, -2047527355, System.identityHashCode(zVar2));
        z.setY(new Object[]{zVar2, g.N_A}, 399783940, -399783926, System.identityHashCode(zVar2));
        int i36 = f55104r0;
        int i37 = i36 & 77;
        int i38 = ((((i36 ^ 77) | i37) << 1) - (~(-((i36 | 77) & (~i37))))) - 1;
        f55103q0 = i38 % 128;
        if (i38 % 2 == 0) {
            return null;
        }
        throw null;
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ Unit invoke(z zVar) {
        return a(new Object[]{this, zVar}, 1488655157, -1488655157, System.identityHashCode(this));
    }
}

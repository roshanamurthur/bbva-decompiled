package com.mypinpad.tsdk.isolation;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/mypinpad/tsdk/i/s;", "", "setX", "(Lcom/mypinpad/tsdk/i/s;)V"}, k = 3, mv = {1, 5, 1}, xi = 48)
final class c5 extends Lambda implements Function1<s, Unit> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public static final c5 f54772p0 = new c5();

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public static int f54773q0 = 0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public static int f54774r0 = 1;

    static {
        int i10 = f54774r0;
        int i11 = (i10 ^ 5) + ((i10 & 5) << 1);
        f54773q0 = i11 % 128;
        int i12 = i11 % 2;
    }

    public c5() {
        super(1);
    }

    public static /* synthetic */ Unit a(Object[] objArr, int i10, int i11, int i12) {
        int i13 = ((~(i10 | i11)) * (-495)) + (i11 * (-494)) + (i10 * (-494));
        int i14 = (~i12) | i10;
        if ((((~((~i10) | (~i11))) | (~i14)) * 495) + (i14 * 495) + i13 == 1) {
            s sVar = (s) objArr[1];
            int i15 = f54773q0;
            int i16 = (i15 ^ 9) + ((i15 & 9) << 1);
            f54774r0 = i16 % 128;
            if (i16 % 2 == 0) {
                Intrinsics.checkNotNullParameter(sVar, "");
                s.setDividerPadding(new Object[]{sVar, setAnimation.setNavigationIcon()}, -1134783533, 1134783536, System.identityHashCode(sVar));
                throw null;
            }
            Intrinsics.checkNotNullParameter(sVar, "");
            s.setDividerPadding(new Object[]{sVar, setAnimation.setNavigationIcon()}, -1134783533, 1134783536, System.identityHashCode(sVar));
            int i17 = f54774r0;
            int i18 = i17 & 47;
            int i19 = (i18 - (~((i17 ^ 47) | i18))) - 1;
            f54773q0 = i19 % 128;
            int i20 = i19 % 2;
            return null;
        }
        c5 c5Var = (c5) objArr[0];
        Object obj = objArr[1];
        int i21 = f54773q0;
        int i22 = ((i21 | 19) << 1) - (i21 ^ 19);
        f54774r0 = i22 % 128;
        s sVar2 = (s) obj;
        if (i22 % 2 == 0) {
            a(new Object[]{c5Var, sVar2}, 1165432973, -1165432972, System.identityHashCode(c5Var));
            Unit unit = Unit.INSTANCE;
            throw null;
        }
        a(new Object[]{c5Var, sVar2}, 1165432973, -1165432972, System.identityHashCode(c5Var));
        Unit unit2 = Unit.INSTANCE;
        int i23 = f54773q0;
        int i24 = ((i23 ^ 80) + ((i23 & 80) << 1)) - 1;
        f54774r0 = i24 % 128;
        if (i24 % 2 != 0) {
            return unit2;
        }
        throw null;
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ Unit invoke(s sVar) {
        return a(new Object[]{this, sVar}, 1434904807, -1434904807, System.identityHashCode(this));
    }
}

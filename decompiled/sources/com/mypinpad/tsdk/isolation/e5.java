package com.mypinpad.tsdk.isolation;

import java.util.Iterator;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/mypinpad/tsdk/i/s;", "", "setX", "(Lcom/mypinpad/tsdk/i/s;)V"}, k = 3, mv = {1, 5, 1}, xi = 48)
final class e5 extends Lambda implements Function1<s, Unit> {

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public static int f55308r0 = 0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public static int f55309s0 = 1;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ setMaxWidth f55310p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ gv f55311q0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e5(setMaxWidth setmaxwidth, gv gvVar) {
        super(1);
        this.f55310p0 = setmaxwidth;
        this.f55311q0 = gvVar;
    }

    public static /* synthetic */ Unit a(Object[] objArr, int i10, int i11, int i12) {
        int i13 = ~((~i10) | i11);
        int i14 = ~i12;
        int i15 = (((~(i14 | i11)) | i13) * (-1188)) + (i11 * (-1187)) + (i10 * 595);
        int i16 = ~i11;
        int i17 = (~(i12 | i16)) | i13;
        int i18 = ~(i14 | i10);
        if ((((~(i10 | i16)) | (~(i16 | i14)) | i18) * 594) + ((i17 | i18) * 594) + i15 == 1) {
            e5 e5Var = (e5) objArr[0];
            Object obj = objArr[1];
            int i19 = f55309s0;
            int i20 = ((i19 ^ 29) - (~(-(-((i19 & 29) << 1))))) - 1;
            f55308r0 = i20 % 128;
            int i21 = i20 % 2;
            a(new Object[]{e5Var, (s) obj}, -299571163, 299571163, System.identityHashCode(e5Var));
            Unit unit = Unit.INSTANCE;
            int i22 = f55309s0;
            int i23 = i22 ^ 93;
            int i24 = ((((i22 & 93) | i23) << 1) - (~(-i23))) - 1;
            f55308r0 = i24 % 128;
            int i25 = i24 % 2;
            return unit;
        }
        e5 e5Var2 = (e5) objArr[0];
        s sVar = (s) objArr[1];
        int i26 = f55309s0;
        int i27 = ((i26 | 31) << 1) - (i26 ^ 31);
        f55308r0 = i27 % 128;
        int i28 = i27 % 2;
        Intrinsics.checkNotNullParameter(sVar, "");
        Iterator<getBeepOnFailure> it = e5Var2.f55310p0.iterator();
        int i29 = f55309s0;
        int i30 = ((i29 | 89) << 1) - (((~i29) & 89) | (i29 & (-90)));
        f55308r0 = i30 % 128;
        int i31 = i30 % 2;
        while (!(!it.hasNext())) {
            int i32 = f55308r0;
            int i33 = i32 ^ 71;
            int i34 = -(-((i32 & 71) << 1));
            int i35 = ((i33 | i34) << 1) - (i34 ^ i33);
            f55309s0 = i35 % 128;
            int i36 = i35 % 2;
            gv gvVar = e5Var2.f55311q0;
            if (i36 == 0) {
                getBeepOnFailure next = it.next();
                setScrollContainer setscrollcontainer = (setScrollContainer) getBeepOnFailure.setOnFocusChangeListener(new Object[]{next}, 865402441, -865402437, System.identityHashCode(next));
                ((Boolean) setScrollBarDefaultDelayBeforeFade.setDividerPadding(new Object[]{gvVar, (String) setScrollContainer.setOnFocusChangeListener(new Object[]{setscrollcontainer}, -888877733, 888877739, System.identityHashCode(setscrollcontainer))}, -578266812, 578266824, System.identityHashCode(gvVar))).booleanValue();
                throw null;
            }
            getBeepOnFailure next2 = it.next();
            setScrollContainer setscrollcontainer2 = (setScrollContainer) getBeepOnFailure.setOnFocusChangeListener(new Object[]{next2}, 865402441, -865402437, System.identityHashCode(next2));
            if (((Boolean) setScrollBarDefaultDelayBeforeFade.setDividerPadding(new Object[]{gvVar, (String) setScrollContainer.setOnFocusChangeListener(new Object[]{setscrollcontainer2}, -888877733, 888877739, System.identityHashCode(setscrollcontainer2))}, -578266812, 578266824, System.identityHashCode(gvVar))).booleanValue()) {
                setScrollContainer setscrollcontainer3 = (setScrollContainer) getBeepOnFailure.setOnFocusChangeListener(new Object[]{next2}, 865402441, -865402437, System.identityHashCode(next2));
                s.setDividerPadding(new Object[]{sVar, (String) setScrollContainer.setOnFocusChangeListener(new Object[]{setscrollcontainer3}, -888877733, 888877739, System.identityHashCode(setscrollcontainer3))}, 1528300875, -1528300873, System.identityHashCode(sVar));
                int i37 = f55308r0;
                int i38 = (((i37 | 64) << 1) - (i37 ^ 64)) - 1;
                f55309s0 = i38 % 128;
                int i39 = i38 % 2;
            }
            int i40 = f55308r0;
            int i41 = (i40 ^ 20) + ((i40 & 20) << 1);
            int i42 = (i41 ^ (-1)) + (i41 << 1);
            f55309s0 = i42 % 128;
            int i43 = i42 % 2;
        }
        int i44 = f55308r0;
        int i45 = (i44 & 12) + (i44 | 12);
        int i46 = (i45 ^ (-1)) + (i45 << 1);
        f55309s0 = i46 % 128;
        if (i46 % 2 != 0) {
            return null;
        }
        throw null;
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ Unit invoke(s sVar) {
        return a(new Object[]{this, sVar}, -136391170, 136391171, System.identityHashCode(this));
    }
}

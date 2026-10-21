package com.mypinpad.tsdk.isolation;

import java.util.Iterator;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/mypinpad/tsdk/i/s;", "", "setY", "(Lcom/mypinpad/tsdk/i/s;)V"}, k = 3, mv = {1, 5, 1}, xi = 48)
final class z4 extends Lambda implements Function1<s, Unit> {

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public static int f62270s0 = 0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public static int f62271t0 = 1;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ setMaxWidth f62272p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ gv f62273q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final /* synthetic */ Ref.BooleanRef f62274r0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z4(setMaxWidth setmaxwidth, gv gvVar, Ref.BooleanRef booleanRef) {
        super(1);
        this.f62272p0 = setmaxwidth;
        this.f62273q0 = gvVar;
        this.f62274r0 = booleanRef;
    }

    public static /* synthetic */ Unit a(Object[] objArr, int i10, int i11, int i12) {
        int i13 = ~i10;
        int i14 = ~i11;
        int i15 = ~i12;
        if ((((~(i14 | i15)) | i13) * 68) + ((~(i11 | i13 | i15)) * (-68)) + (((~(i10 | i11)) | (~(i13 | i14 | i15)) | (~(i12 | i11))) * (-68)) + (i11 * (-67)) + (i10 * 69) == 1) {
            z4 z4Var = (z4) objArr[0];
            Object obj = objArr[1];
            int i16 = f62270s0;
            int i17 = i16 & 87;
            int i18 = ((((i16 ^ 87) | i17) << 1) - (~(-((i16 | 87) & (~i17))))) - 1;
            f62271t0 = i18 % 128;
            s sVar = (s) obj;
            Object[] objArr2 = new Object[2];
            if (i18 % 2 != 0) {
                objArr2[0] = z4Var;
                objArr2[1] = sVar;
                a(objArr2, 941780581, -941780581, System.identityHashCode(z4Var));
                return Unit.INSTANCE;
            }
            objArr2[0] = z4Var;
            objArr2[1] = sVar;
            a(objArr2, 941780581, -941780581, System.identityHashCode(z4Var));
            Unit unit = Unit.INSTANCE;
            throw null;
        }
        z4 z4Var2 = (z4) objArr[0];
        s sVar2 = (s) objArr[1];
        int i19 = f62271t0;
        int i20 = ((i19 ^ 81) | (i19 & 81)) << 1;
        int i21 = -(((~i19) & 81) | (i19 & (-82)));
        int i22 = (i20 ^ i21) + ((i21 & i20) << 1);
        f62270s0 = i22 % 128;
        if (i22 % 2 != 0) {
            Intrinsics.checkNotNullParameter(sVar2, "");
            z4Var2.f62272p0.iterator();
            throw null;
        }
        Intrinsics.checkNotNullParameter(sVar2, "");
        Iterator<getBeepOnFailure> it = z4Var2.f62272p0.iterator();
        while (!(!it.hasNext())) {
            int i23 = f62271t0;
            int i24 = (i23 ^ 1) + ((i23 & 1) << 1);
            f62270s0 = i24 % 128;
            int i25 = i24 % 2;
            getBeepOnFailure next = it.next();
            setScrollContainer setscrollcontainer = (setScrollContainer) getBeepOnFailure.setOnFocusChangeListener(new Object[]{next}, 865402441, -865402437, System.identityHashCode(next));
            String str = (String) setScrollContainer.setOnFocusChangeListener(new Object[]{setscrollcontainer}, -888877733, 888877739, System.identityHashCode(setscrollcontainer));
            gv gvVar = z4Var2.f62273q0;
            if (((Boolean) setScrollBarDefaultDelayBeforeFade.setDividerPadding(new Object[]{gvVar, str}, -578266812, 578266824, System.identityHashCode(gvVar))).booleanValue()) {
                int i26 = f62271t0;
                int i27 = i26 & 73;
                int i28 = ((i26 ^ 73) | i27) << 1;
                int i29 = -((i26 | 73) & (~i27));
                int i30 = (i28 & i29) + (i29 | i28);
                f62270s0 = i30 % 128;
                int i31 = i30 % 2;
                setOnGenericMotionListener setongenericmotionlistener = setOnGenericMotionListener.setCompoundDrawableTintBlendMode;
                setScrollContainer setscrollcontainer2 = (setScrollContainer) getBeepOnFailure.setOnFocusChangeListener(new Object[]{next}, 865402441, -865402437, System.identityHashCode(next));
                if (((Boolean) setOnGenericMotionListener.setCompoundDrawableTintBlendMode(new Object[]{setongenericmotionlistener, gvVar, (String) setScrollContainer.setOnFocusChangeListener(new Object[]{setscrollcontainer2}, -888877733, 888877739, System.identityHashCode(setscrollcontainer2)), setTextSize.setY, Terminal.KERNEL_2, Boolean.FALSE}, 1300757109, -1300757095, System.identityHashCode(setongenericmotionlistener))).booleanValue()) {
                    int i32 = f62270s0;
                    int i33 = i32 & 67;
                    int i34 = i32 | 67;
                    int i35 = ((i33 | i34) << 1) - (i34 ^ i33);
                    f62271t0 = i35 % 128;
                    int i36 = i35 % 2;
                    Ref.BooleanRef booleanRef = z4Var2.f62274r0;
                    if (i36 == 0) {
                        booleanRef.element = true;
                        setScrollContainer setscrollcontainer3 = (setScrollContainer) getBeepOnFailure.setOnFocusChangeListener(new Object[]{next}, 865402441, -865402437, System.identityHashCode(next));
                        s.setDividerPadding(new Object[]{sVar2, (String) setScrollContainer.setOnFocusChangeListener(new Object[]{setscrollcontainer3}, -888877733, 888877739, System.identityHashCode(setscrollcontainer3))}, 1528300875, -1528300873, System.identityHashCode(sVar2));
                    } else {
                        booleanRef.element = true;
                        setScrollContainer setscrollcontainer4 = (setScrollContainer) getBeepOnFailure.setOnFocusChangeListener(new Object[]{next}, 865402441, -865402437, System.identityHashCode(next));
                        s.setDividerPadding(new Object[]{sVar2, (String) setScrollContainer.setOnFocusChangeListener(new Object[]{setscrollcontainer4}, -888877733, 888877739, System.identityHashCode(setscrollcontainer4))}, 1528300875, -1528300873, System.identityHashCode(sVar2));
                    }
                }
            }
            setScrollContainer setscrollcontainer5 = (setScrollContainer) getBeepOnFailure.setOnFocusChangeListener(new Object[]{next}, 865402441, -865402437, System.identityHashCode(next));
            s.setDividerPadding(new Object[]{sVar2, (String) setScrollContainer.setOnFocusChangeListener(new Object[]{setscrollcontainer5}, -888877733, 888877739, System.identityHashCode(setscrollcontainer5))}, 946922932, -946922928, System.identityHashCode(sVar2));
            int i37 = f62271t0 + 55;
            f62270s0 = i37 % 128;
            int i38 = i37 % 2;
        }
        int i39 = f62270s0 + 60;
        int i40 = (i39 ^ (-1)) + (i39 << 1);
        f62271t0 = i40 % 128;
        if (i40 % 2 == 0) {
            int i41 = 14 / 0;
        }
        return null;
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ Unit invoke(s sVar) {
        return a(new Object[]{this, sVar}, 1485432859, -1485432858, System.identityHashCode(this));
    }
}

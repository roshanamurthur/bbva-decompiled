package com.mypinpad.tsdk.isolation;

import java.util.Iterator;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/mypinpad/tsdk/i/s;", "", "setOnFocusChangeListener", "(Lcom/mypinpad/tsdk/i/s;)V"}, k = 3, mv = {1, 5, 1}, xi = 48)
final class d5 extends Lambda implements Function1<s, Unit> {

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public static int f55106s0 = 0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public static int f55107t0 = 1;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ setMaxWidth f55108p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ gv f55109q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final /* synthetic */ Ref.BooleanRef f55110r0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d5(setMaxWidth setmaxwidth, gv gvVar, Ref.BooleanRef booleanRef) {
        super(1);
        this.f55108p0 = setmaxwidth;
        this.f55109q0 = gvVar;
        this.f55110r0 = booleanRef;
    }

    /* JADX WARN: Code duplicated, block: B:31:0x01cf  */
    /* JADX WARN: Type inference failed for: r3v14 */
    /* JADX WARN: Type inference failed for: r3v5 */
    /* JADX WARN: Type inference failed for: r3v6, types: [java.lang.Throwable, kotlin.Unit] */
    public static /* synthetic */ Unit a(Object[] objArr, int i10, int i11, int i12) {
        Iterator<getBeepOnFailure> it;
        int i13 = ~i11;
        int i14 = i13 | i10;
        int i15 = (((~(i10 | i12)) | (~(i13 | i12)) | (~i14)) * 623) + (((~(i11 | (~i10))) | (~i12)) * (-623)) + ((~(i14 | i12)) * 623) + (i11 * (-622)) + (i10 * 624);
        ?? r3 = 0;
        if (i15 != 1) {
            d5 d5Var = (d5) objArr[0];
            Object obj = objArr[1];
            int i16 = f55107t0;
            int i17 = ((i16 & 27) - (~(-(-(i16 | 27))))) - 1;
            f55106s0 = i17 % 128;
            s sVar = (s) obj;
            Object[] objArr2 = new Object[2];
            if (i17 % 2 != 0) {
                objArr2[0] = d5Var;
                objArr2[1] = sVar;
                a(objArr2, -575057674, 575057675, System.identityHashCode(d5Var));
                Unit unit = Unit.INSTANCE;
                throw null;
            }
            objArr2[0] = d5Var;
            objArr2[1] = sVar;
            a(objArr2, -575057674, 575057675, System.identityHashCode(d5Var));
            Unit unit2 = Unit.INSTANCE;
            System.identityHashCode(d5Var);
            System.identityHashCode(d5Var);
            return unit2;
        }
        d5 d5Var2 = (d5) objArr[0];
        s sVar2 = (s) objArr[1];
        int i18 = f55107t0;
        int i19 = (((i18 | 96) << 1) - (i18 ^ 96)) - 1;
        f55106s0 = i19 % 128;
        if (i19 % 2 != 0) {
            Intrinsics.checkNotNullParameter(sVar2, "");
            it = d5Var2.f55108p0.iterator();
            int i20 = 77 / 0;
        } else {
            Intrinsics.checkNotNullParameter(sVar2, "");
            it = d5Var2.f55108p0.iterator();
        }
        gv gvVar = d5Var2.f55109q0;
        Ref.BooleanRef booleanRef = d5Var2.f55110r0;
        int i21 = f55107t0 + 59;
        f55106s0 = i21 % 128;
        int i22 = i21 % 2;
        while (it.hasNext()) {
            int i23 = f55106s0;
            int i24 = i23 & 13;
            int i25 = -(-(i23 | 13));
            int i26 = ((i24 | i25) << 1) - (i25 ^ i24);
            f55107t0 = i26 % 128;
            int i27 = i26 % 2;
            getBeepOnFailure next = it.next();
            setScrollContainer setscrollcontainer = (setScrollContainer) getBeepOnFailure.setOnFocusChangeListener(new Object[]{next}, 865402441, -865402437, System.identityHashCode(next));
            if (((Boolean) setScrollBarDefaultDelayBeforeFade.setDividerPadding(new Object[]{gvVar, (String) setScrollContainer.setOnFocusChangeListener(new Object[]{setscrollcontainer}, -888877733, 888877739, System.identityHashCode(setscrollcontainer))}, -578266812, 578266824, System.identityHashCode(gvVar))).booleanValue()) {
                int i28 = f55106s0;
                int i29 = i28 & 63;
                int i30 = i29 + ((i28 ^ 63) | i29);
                f55107t0 = i30 % 128;
                if (i30 % 2 == 0) {
                    setOnGenericMotionListener setongenericmotionlistener = setOnGenericMotionListener.setCompoundDrawableTintBlendMode;
                    setScrollContainer setscrollcontainer2 = (setScrollContainer) getBeepOnFailure.setOnFocusChangeListener(new Object[]{next}, 865402441, -865402437, System.identityHashCode(next));
                    if (!(!((Boolean) setOnGenericMotionListener.setCompoundDrawableTintBlendMode(new Object[]{setongenericmotionlistener, gvVar, (String) setScrollContainer.setOnFocusChangeListener(new Object[]{setscrollcontainer2}, -888877733, 888877739, System.identityHashCode(setscrollcontainer2)), setTextSize.setY, Terminal.KERNEL_2, Boolean.TRUE}, 1300757109, -1300757095, System.identityHashCode(setongenericmotionlistener))).booleanValue())) {
                        booleanRef.element = true;
                        setScrollContainer setscrollcontainer3 = (setScrollContainer) getBeepOnFailure.setOnFocusChangeListener(new Object[]{next}, 865402441, -865402437, System.identityHashCode(next));
                        s.setDividerPadding(new Object[]{sVar2, (String) setScrollContainer.setOnFocusChangeListener(new Object[]{setscrollcontainer3}, -888877733, 888877739, System.identityHashCode(setscrollcontainer3))}, 1528300875, -1528300873, System.identityHashCode(sVar2));
                        int i31 = f55107t0 + 126;
                        int i32 = (i31 ^ (-1)) + (i31 << 1);
                        f55106s0 = i32 % 128;
                        int i33 = i32 % 2;
                    }
                } else {
                    setOnGenericMotionListener setongenericmotionlistener2 = setOnGenericMotionListener.setCompoundDrawableTintBlendMode;
                    setScrollContainer setscrollcontainer4 = (setScrollContainer) getBeepOnFailure.setOnFocusChangeListener(new Object[]{next}, 865402441, -865402437, System.identityHashCode(next));
                    if (((Boolean) setOnGenericMotionListener.setCompoundDrawableTintBlendMode(new Object[]{setongenericmotionlistener2, gvVar, (String) setScrollContainer.setOnFocusChangeListener(new Object[]{setscrollcontainer4}, -888877733, 888877739, System.identityHashCode(setscrollcontainer4)), setTextSize.setY, Terminal.KERNEL_2, Boolean.FALSE}, 1300757109, -1300757095, System.identityHashCode(setongenericmotionlistener2))).booleanValue()) {
                        booleanRef.element = true;
                        setScrollContainer setscrollcontainer5 = (setScrollContainer) getBeepOnFailure.setOnFocusChangeListener(new Object[]{next}, 865402441, -865402437, System.identityHashCode(next));
                        s.setDividerPadding(new Object[]{sVar2, (String) setScrollContainer.setOnFocusChangeListener(new Object[]{setscrollcontainer5}, -888877733, 888877739, System.identityHashCode(setscrollcontainer5))}, 1528300875, -1528300873, System.identityHashCode(sVar2));
                        int i34 = f55107t0 + 126;
                        int i35 = (i34 ^ (-1)) + (i34 << 1);
                        f55106s0 = i35 % 128;
                        int i36 = i35 % 2;
                    }
                }
            }
            int i37 = f55106s0;
            int i38 = (((i37 | 34) << 1) - (i37 ^ 34)) - 1;
            f55107t0 = i38 % 128;
            int i39 = i38 % 2;
            r3 = 0;
        }
        int i40 = f55107t0;
        int i41 = i40 & 125;
        int i42 = i40 | 125;
        int i43 = (i41 & i42) + (i42 | i41);
        f55106s0 = i43 % 128;
        if (i43 % 2 == 0) {
            return r3;
        }
        throw r3;
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ Unit invoke(s sVar) {
        return a(new Object[]{this, sVar}, -1009363939, 1009363939, System.identityHashCode(this));
    }
}

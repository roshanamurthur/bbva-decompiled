package com.mypinpad.tsdk.isolation;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public abstract class setStateDescription extends setSystemGestureExclusionRects {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static int f60589c;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final component22 f60590b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public setStateDescription(int i10, @NotNull component22 component22Var) {
        super(i10);
        Intrinsics.checkNotNullParameter(component22Var, "");
        this.f60590b = component22Var;
    }

    public static /* synthetic */ Object setY(Object[] objArr, int i10, int i11, int i12) {
        setStateDescription setstatedescription = (setStateDescription) objArr[0];
        int i13 = f60589c;
        int i14 = ((i13 ^ 87) | (i13 & 87)) << 1;
        int i15 = -(((~i13) & 87) | (i13 & (-88)));
        int i16 = (i14 & i15) + (i15 | i14);
        int i17 = i16 % 128;
        int i18 = i16 % 2;
        component22 component22Var = setstatedescription.f60590b;
        if (i18 == 0) {
            throw null;
        }
        int i19 = i17 & 47;
        int i20 = i17 | 47;
        int i21 = ((i19 | i20) << 1) - (i20 ^ i19);
        f60589c = i21 % 128;
        int i22 = i21 % 2;
        return component22Var;
    }

    @NotNull
    public final component22 setCompoundDrawableTintBlendMode() {
        return (component22) setY(new Object[]{this}, 339311731, -339311731, System.identityHashCode(this));
    }
}

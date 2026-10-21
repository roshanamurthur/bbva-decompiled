package com.mypinpad.tsdk.isolation;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class setContentView extends setStateListAnimator {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static int f59602b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final setCompoundDrawableTintMode f59603a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public setContentView(@NotNull setCompoundDrawableTintMode setcompounddrawabletintmode) {
        super(null);
        Intrinsics.checkNotNullParameter(setcompounddrawabletintmode, "");
        this.f59603a = setcompounddrawabletintmode;
    }

    public static /* synthetic */ Object setY(Object[] objArr, int i10, int i11, int i12) {
        setContentView setcontentview = (setContentView) objArr[0];
        int i13 = f59602b + 109;
        int i14 = i13 % 128;
        int i15 = i13 % 2;
        setCompoundDrawableTintMode setcompounddrawabletintmode = setcontentview.f59603a;
        int i16 = i14 & 55;
        int i17 = i16 + ((i14 ^ 55) | i16);
        f59602b = i17 % 128;
        if (i17 % 2 == 0) {
            return setcompounddrawabletintmode;
        }
        throw null;
    }

    @NotNull
    public final setCompoundDrawableTintMode setOnFocusChangeListener() {
        return (setCompoundDrawableTintMode) setY(new Object[]{this}, -995695109, 995695109, System.identityHashCode(this));
    }
}

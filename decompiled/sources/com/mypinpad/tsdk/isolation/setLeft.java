package com.mypinpad.tsdk.isolation;

import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
public final class setLeft extends setWeightSum {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public final setSecondaryProgressTintBlendMode.setCompoundDrawableTintBlendMode f59981a;

    public setLeft(@Nullable setSecondaryProgressTintBlendMode.setCompoundDrawableTintBlendMode setcompounddrawabletintblendmode) {
        super(null);
        this.f59981a = setcompounddrawabletintblendmode;
    }

    public static /* synthetic */ Object setOnFocusChangeListener(Object[] objArr, int i10, int i11, int i12) {
        return ((setLeft) objArr[0]).f59981a;
    }

    @Nullable
    public final setSecondaryProgressTintBlendMode.setCompoundDrawableTintBlendMode setX() {
        return (setSecondaryProgressTintBlendMode.setCompoundDrawableTintBlendMode) setOnFocusChangeListener(new Object[]{this}, 1844756835, -1844756835, System.identityHashCode(this));
    }
}

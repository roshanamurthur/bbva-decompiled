package com.mypinpad.tsdk.isolation;

import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
public final class setOverflowIcon extends setWeightSum {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static int f60285b = 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public final setSecondaryProgressTintBlendMode.setCompoundDrawableTintBlendMode f60286a;

    public setOverflowIcon(@Nullable setSecondaryProgressTintBlendMode.setCompoundDrawableTintBlendMode setcompounddrawabletintblendmode) {
        super(null);
        this.f60286a = setcompounddrawabletintblendmode;
    }

    public static /* synthetic */ Object setX(Object[] objArr, int i10, int i11, int i12) {
        setOverflowIcon setoverflowicon = (setOverflowIcon) objArr[0];
        int i13 = f60285b + 61;
        int i14 = i13 % 128;
        int i15 = i13 % 2;
        setSecondaryProgressTintBlendMode.setCompoundDrawableTintBlendMode setcompounddrawabletintblendmode = setoverflowicon.f60286a;
        int i16 = i14 + 33;
        f60285b = i16 % 128;
        if (i16 % 2 != 0) {
            return setcompounddrawabletintblendmode;
        }
        throw null;
    }

    @Nullable
    public final setSecondaryProgressTintBlendMode.setCompoundDrawableTintBlendMode setCompoundDrawableTintBlendMode() {
        return (setSecondaryProgressTintBlendMode.setCompoundDrawableTintBlendMode) setX(new Object[]{this}, -32501533, 32501533, System.identityHashCode(this));
    }
}

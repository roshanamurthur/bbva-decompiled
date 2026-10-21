package com.mypinpad.tsdk.isolation;

import java.util.List;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class bk extends t {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static int f54713f = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static int f54714g = 1;

    public bk() {
        super(setAnimation.setLineBreakStyle().setDividerPadding());
    }

    public static /* synthetic */ Object setDividerPadding(Object[] objArr, int i10, int i11, int i12) {
        bk bkVar = (bk) objArr[0];
        int i13 = f54714g;
        int i14 = ((i13 & 92) + (i13 | 92)) - 1;
        f54713f = i14 % 128;
        int i15 = i14 % 2;
        setMaxWidth setmaxwidth = (setMaxWidth) getBeepOnFailure.setCompoundDrawableTintBlendMode.setDividerPadding(new Object[]{getBeepOnFailure.setOnFocusChangeListener, bkVar.setCompoundDrawableTintBlendMode()}, 367993749, -367993745, (int) System.currentTimeMillis());
        int i16 = f54713f;
        int i17 = (i16 ^ 27) + ((i16 & 27) << 1);
        f54714g = i17 % 128;
        int i18 = i17 % 2;
        return setmaxwidth;
    }

    @NotNull
    public final List<getBeepOnFailure> getNavBarTitleString() {
        return (List) setDividerPadding(new Object[]{this}, -948914151, 948914151, System.identityHashCode(this));
    }
}

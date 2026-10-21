package com.mypinpad.tsdk.isolation;

import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
public final class wp extends wi {

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    @Nullable
    public final Integer f61663r0;

    public wp(@Nullable Integer num) {
        super(wm.setNavigationOnClickListener, null);
        this.f61663r0 = num;
    }

    public static /* synthetic */ Object setOnFocusChangeListener(Object[] objArr, int i10, int i11, int i12) {
        return ((wp) objArr[0]).f61663r0;
    }

    @Nullable
    public final Integer setOnFocusChangeListener() {
        return (Integer) setOnFocusChangeListener(new Object[]{this}, -168896050, 168896050, System.identityHashCode(this));
    }
}

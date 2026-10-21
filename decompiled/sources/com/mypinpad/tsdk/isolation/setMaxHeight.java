package com.mypinpad.tsdk.isolation;

import java.util.List;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
public final class setMaxHeight {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public final applicationCreated f60099a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public final List<Integer> f60100b;

    public setMaxHeight(@Nullable applicationCreated applicationcreated, @Nullable List<Integer> list) {
        this.f60099a = applicationcreated;
        this.f60100b = list;
    }

    public static /* synthetic */ Object setCompoundDrawableTintBlendMode(Object[] objArr, int i10, int i11, int i12) {
        int i13 = ~((~i10) | (~i11));
        int i14 = ~i12;
        return (((i10 | i11) | i12) * 220) + ((((~(i14 | i11)) | i10) * (-440)) + (((i13 | (~((i14 | i10) | i11))) * 220) + ((i11 * (-219)) + (i10 * 221)))) != 1 ? ((setMaxHeight) objArr[0]).f60099a : ((setMaxHeight) objArr[0]).f60100b;
    }

    @Nullable
    public final List<Integer> setDividerPadding() {
        return (List) setCompoundDrawableTintBlendMode(new Object[]{this}, -1172660376, 1172660377, System.identityHashCode(this));
    }

    @Nullable
    public final applicationCreated setOnFocusChangeListener() {
        return (applicationCreated) setCompoundDrawableTintBlendMode(new Object[]{this}, 303389556, -303389556, System.identityHashCode(this));
    }
}

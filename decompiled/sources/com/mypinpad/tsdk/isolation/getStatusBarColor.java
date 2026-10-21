package com.mypinpad.tsdk.isolation;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class getStatusBarColor {
    public static /* synthetic */ Object setOnFocusChangeListener(Object[] objArr, int i10, int i11, int i12) {
        List list = (List) objArr[0];
        Intrinsics.checkNotNullParameter(list, "");
        setMaxWidth setmaxwidth = new setMaxWidth();
        setmaxwidth.addAll(list);
        return setmaxwidth;
    }

    @NotNull
    public static final setMaxWidth setOnFocusChangeListener(@NotNull List<? extends getBeepOnFailure> list) {
        return (setMaxWidth) setOnFocusChangeListener(new Object[]{list}, 790006071, -790006071, (int) System.currentTimeMillis());
    }
}

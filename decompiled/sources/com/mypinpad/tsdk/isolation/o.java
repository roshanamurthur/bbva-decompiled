package com.mypinpad.tsdk.isolation;

import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class o {
    @NotNull
    public static TransactionCompleted setDividerPadding(@NotNull t tVar, @NotNull KProperty<?> kProperty) {
        return (TransactionCompleted) setX(new Object[]{tVar, kProperty}, 1838106620, -1838106620, (int) System.currentTimeMillis());
    }

    public static /* synthetic */ Object setX(Object[] objArr, int i10, int i11, int i12) {
        t tVar = (t) objArr[0];
        KProperty kProperty = (KProperty) objArr[1];
        Intrinsics.checkNotNullParameter(tVar, "");
        Intrinsics.checkNotNullParameter(kProperty, "");
        copy copyVar = copy.INSTANCE;
        return (TransactionCompleted) copy.setOnFocusChangeListener(new Object[]{(byte[]) setImageTintList.setX(new Object[]{tVar}, -1317873722, 1317873728, System.identityHashCode(tVar))}, 743521406, -743521406, (int) System.currentTimeMillis());
    }
}

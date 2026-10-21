package com.mypinpad.tsdk.isolation;

import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static int f58033a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static int f58034b = 1;

    public static /* synthetic */ Object setCompoundDrawableTintBlendMode(Object[] objArr, int i10, int i11, int i12) {
        t tVar = (t) objArr[0];
        KProperty kProperty = (KProperty) objArr[1];
        int i13 = f58033a;
        int i14 = ((i13 | 83) << 1) - (i13 ^ 83);
        f58034b = i14 % 128;
        int i15 = i14 % 2;
        Intrinsics.checkNotNullParameter(tVar, "");
        Intrinsics.checkNotNullParameter(kProperty, "");
        copy copyVar = copy.INSTANCE;
        TransactionCompleted transactionCompleted = (TransactionCompleted) copy.setOnFocusChangeListener(new Object[]{(byte[]) setImageTintList.setX(new Object[]{tVar}, -1317873722, 1317873728, System.identityHashCode(tVar))}, 111012111, -111012107, (int) System.currentTimeMillis());
        int i16 = f58034b;
        int i17 = i16 & 83;
        int i18 = -(-((i16 ^ 83) | i17));
        int i19 = (i17 & i18) + (i18 | i17);
        f58033a = i19 % 128;
        if (i19 % 2 == 0) {
            return transactionCompleted;
        }
        throw null;
    }

    @NotNull
    public static TransactionCompleted setCompoundDrawableTintBlendMode(@NotNull t tVar, @NotNull KProperty<?> kProperty) {
        return (TransactionCompleted) setCompoundDrawableTintBlendMode(new Object[]{tVar, kProperty}, -215137347, 215137347, (int) System.currentTimeMillis());
    }
}

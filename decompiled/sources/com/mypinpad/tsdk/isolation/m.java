package com.mypinpad.tsdk.isolation;

import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f57022a = 7;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f57023b = 5;

    public static /* synthetic */ Object setCompoundDrawableTintBlendMode(Object[] objArr, int i10, int i11, int i12) {
        m mVar = (m) objArr[0];
        t tVar = (t) objArr[1];
        KProperty kProperty = (KProperty) objArr[2];
        Intrinsics.checkNotNullParameter(tVar, "");
        Intrinsics.checkNotNullParameter(kProperty, "");
        mVar.getClass();
        return Byte.valueOf(((Byte) u.setDividerPadding(new Object[]{tVar, 0, Integer.valueOf(mVar.f57022a), Integer.valueOf(mVar.f57023b)}, -1480922781, 1480922783, 0)).byteValue());
    }

    public final byte setX(@NotNull t tVar, @NotNull KProperty<?> kProperty) {
        return ((Byte) setCompoundDrawableTintBlendMode(new Object[]{this, tVar, kProperty}, 1820788324, -1820788324, System.identityHashCode(this))).byteValue();
    }
}

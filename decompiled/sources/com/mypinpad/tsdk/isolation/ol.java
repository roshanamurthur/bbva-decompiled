package com.mypinpad.tsdk.isolation;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class ol extends oj {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Function1<ok, Unit> f57516a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ol(@NotNull Function1<? super ok, Unit> function1) {
        super(null);
        Intrinsics.checkNotNullParameter(function1, "");
        this.f57516a = function1;
    }

    public static /* synthetic */ Object setY(Object[] objArr, int i10, int i11, int i12) {
        return ((ol) objArr[0]).f57516a;
    }

    @NotNull
    public final Function1<ok, Unit> setOnFocusChangeListener() {
        return (Function1) setY(new Object[]{this}, 1150190985, -1150190985, System.identityHashCode(this));
    }
}

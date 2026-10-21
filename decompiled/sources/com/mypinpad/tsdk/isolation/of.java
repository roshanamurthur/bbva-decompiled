package com.mypinpad.tsdk.isolation;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class of extends oj {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static int f57463b = 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Function1<ok, Unit> f57464a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public of(@NotNull Function1<? super ok, Unit> function1) {
        super(null);
        Intrinsics.checkNotNullParameter(function1, "");
        this.f57464a = function1;
    }

    public static /* synthetic */ Object setX(Object[] objArr, int i10, int i11, int i12) {
        of ofVar = (of) objArr[0];
        int i13 = f57463b;
        int i14 = ((i13 | 115) << 1) - (i13 ^ 115);
        int i15 = i14 % 128;
        int i16 = i14 % 2;
        Function1<ok, Unit> function1 = ofVar.f57464a;
        int i17 = i15 & 71;
        int i18 = i17 + ((i15 ^ 71) | i17);
        f57463b = i18 % 128;
        if (i18 % 2 == 0) {
            int i19 = 52 / 0;
        }
        return function1;
    }

    @NotNull
    public final Function1<ok, Unit> setY() {
        return (Function1) setX(new Object[]{this}, -625985043, 625985043, System.identityHashCode(this));
    }
}

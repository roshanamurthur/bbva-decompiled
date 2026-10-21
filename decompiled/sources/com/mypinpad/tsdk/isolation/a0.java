package com.mypinpad.tsdk.isolation;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
public final class a0 extends ContinuationImpl {

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public static int f51966t0 = 0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public static int f51967u0 = 1;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public GlobalEndpoint f51968p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public /* synthetic */ Object f51969q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final /* synthetic */ GlobalEndpoint<setScrollBarDefaultDelayBeforeFade> f51970r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public int f51971s0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(GlobalEndpoint<setScrollBarDefaultDelayBeforeFade> globalEndpoint, Continuation<? super a0> continuation) {
        super(continuation);
        this.f51970r0 = globalEndpoint;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) throws Exception {
        Object[] objArr = {this, obj};
        System.identityHashCode(this);
        a0 a0Var = (a0) objArr[0];
        Object obj2 = objArr[1];
        int i10 = f51966t0;
        int i11 = i10 & 101;
        int i12 = i11 + ((i10 ^ 101) | i11);
        f51967u0 = i12 % 128;
        int i13 = i12 % 2;
        a0Var.f51969q0 = obj2;
        int i14 = a0Var.f51971s0;
        int i15 = (Integer.MAX_VALUE & i14) | ((~i14) & Integer.MIN_VALUE);
        int i16 = i14 & Integer.MIN_VALUE;
        a0Var.f51971s0 = (i16 & i15) | (i15 ^ i16);
        GlobalEndpoint.Companion companion = GlobalEndpoint.INSTANCE;
        Object compoundDrawableTintBlendMode = GlobalEndpoint.setCompoundDrawableTintBlendMode(new Object[]{a0Var.f51970r0, null, a0Var}, -1335352906, 1335352910, (int) System.currentTimeMillis());
        int i17 = f51967u0;
        int i18 = i17 & 39;
        int i19 = (i17 | 39) & (~i18);
        int i20 = i18 << 1;
        int i21 = (i19 ^ i20) + ((i19 & i20) << 1);
        f51966t0 = i21 % 128;
        int i22 = i21 % 2;
        return compoundDrawableTintBlendMode;
    }
}

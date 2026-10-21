package com.mypinpad.tsdk.isolation;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
public final class e10 extends ContinuationImpl {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public xi f55293p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public String f55294q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public long f55295r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public /* synthetic */ Object f55296s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public final /* synthetic */ xi f55297t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public int f55298u0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e10(xi xiVar, Continuation<? super e10> continuation) {
        super(continuation);
        this.f55297t0 = xiVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Object[] objArr = {this, obj};
        System.identityHashCode(this);
        e10 e10Var = (e10) objArr[0];
        e10Var.f55296s0 = objArr[1];
        int i10 = e10Var.f55298u0;
        e10Var.f55298u0 = (i10 & Integer.MIN_VALUE) | (Integer.MAX_VALUE & i10) | ((~i10) & Integer.MIN_VALUE);
        return xi.setDividerPadding(new Object[]{e10Var.f55297t0, e10Var}, 1415832454, -1415832438, (int) System.currentTimeMillis());
    }
}

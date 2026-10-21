package com.mypinpad.tsdk.isolation;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
public final class t4 extends ContinuationImpl {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public hi f60974p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public /* synthetic */ Object f60975q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final /* synthetic */ hi f60976r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public int f60977s0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t4(hi hiVar, Continuation<? super t4> continuation) {
        super(continuation);
        this.f60976r0 = hiVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Object[] objArr = {this, obj};
        System.identityHashCode(this);
        t4 t4Var = (t4) objArr[0];
        t4Var.f60975q0 = objArr[1];
        t4Var.f60977s0 |= Integer.MIN_VALUE;
        return hi.setX(new Object[]{t4Var.f60976r0, t4Var}, -1379562350, 1379562350, (int) System.currentTimeMillis());
    }
}

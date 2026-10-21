package com.mypinpad.tsdk.isolation;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.channels.ReceiveChannel;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
public final class d10 extends ContinuationImpl {

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public static int f55090u0 = 0;
    public static int v0 = 1;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public xi f55091p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public ReceiveChannel f55092q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public /* synthetic */ Object f55093r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final /* synthetic */ xi f55094s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public int f55095t0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d10(xi xiVar, Continuation<? super d10> continuation) {
        super(continuation);
        this.f55094s0 = xiVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) throws InterruptedException {
        Object[] objArr = {this, obj};
        System.identityHashCode(this);
        d10 d10Var = (d10) objArr[0];
        Object obj2 = objArr[1];
        int i10 = v0 + 77;
        f55090u0 = i10 % 128;
        int i11 = i10 % 2;
        d10Var.f55093r0 = obj2;
        int i12 = d10Var.f55095t0;
        d10Var.f55095t0 = (i12 & Integer.MIN_VALUE) | (i12 ^ Integer.MIN_VALUE);
        Object dividerPadding = xi.setDividerPadding(new Object[]{d10Var.f55094s0, null, d10Var}, 1150949458, -1150949441, (int) System.currentTimeMillis());
        int i13 = f55090u0 + 19;
        v0 = i13 % 128;
        int i14 = i13 % 2;
        return dividerPadding;
    }
}

package com.mypinpad.tsdk.isolation;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
public final class r3 extends ContinuationImpl {

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public static int f58055t0 = 0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public static int f58056u0 = 1;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public eb f58057p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public /* synthetic */ Object f58058q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final /* synthetic */ eb<setScrollBarDefaultDelayBeforeFade, fb<Object>> f58059r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public int f58060s0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r3(eb<setScrollBarDefaultDelayBeforeFade, fb<Object>> ebVar, Continuation<? super r3> continuation) {
        super(continuation);
        this.f58059r0 = ebVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Object[] objArr = {this, obj};
        System.identityHashCode(this);
        r3 r3Var = (r3) objArr[0];
        Object obj2 = objArr[1];
        int i10 = (-2) - ((f58055t0 + 122) ^ (-1));
        f58056u0 = i10 % 128;
        int i11 = i10 % 2;
        r3Var.f58058q0 = obj2;
        int i12 = r3Var.f58060s0;
        r3Var.f58060s0 = (i12 & Integer.MIN_VALUE) | (i12 ^ Integer.MIN_VALUE);
        Object y7 = eb.setY(new Object[]{r3Var.f58059r0, r3Var}, -79897080, 79897081, (int) System.currentTimeMillis());
        int i13 = f58056u0;
        int i14 = ((i13 | 96) << 1) - (i13 ^ 96);
        int i15 = (i14 ^ (-1)) + (i14 << 1);
        f58055t0 = i15 % 128;
        int i16 = i15 % 2;
        return y7;
    }
}

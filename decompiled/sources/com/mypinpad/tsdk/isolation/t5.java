package com.mypinpad.tsdk.isolation;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
public final class t5 extends ContinuationImpl {

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public static int f60978t0 = 0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public static int f60979u0 = 1;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public ir f60980p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public /* synthetic */ Object f60981q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final /* synthetic */ ir f60982r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public int f60983s0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t5(ir irVar, Continuation<? super t5> continuation) {
        super(continuation);
        this.f60982r0 = irVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) throws Exception {
        Object dividerPadding;
        Object[] objArr = {this, obj};
        System.identityHashCode(this);
        t5 t5Var = (t5) objArr[0];
        Object obj2 = objArr[1];
        int i10 = f60979u0;
        int i11 = i10 & 103;
        int i12 = i11 + ((i10 ^ 103) | i11);
        f60978t0 = i12 % 128;
        int i13 = i12 % 2;
        t5Var.f60981q0 = obj2;
        int i14 = t5Var.f60983s0;
        if (i13 != 0) {
            int i15 = i14 & Integer.MIN_VALUE;
            t5Var.f60983s0 = ((i14 | Integer.MIN_VALUE) & (~i15)) | i15;
            dividerPadding = ir.setDividerPadding(new Object[]{t5Var.f60982r0, t5Var}, -442614698, 442614704, (int) System.currentTimeMillis());
            int i16 = 79 / 0;
        } else {
            int i17 = (Integer.MAX_VALUE & i14) | ((~i14) & Integer.MIN_VALUE);
            int i18 = i14 & Integer.MIN_VALUE;
            t5Var.f60983s0 = (i18 & i17) | (i17 ^ i18);
            dividerPadding = ir.setDividerPadding(new Object[]{t5Var.f60982r0, t5Var}, -442614698, 442614704, (int) System.currentTimeMillis());
        }
        int i19 = f60978t0;
        int i20 = (((i19 | 28) << 1) - (i19 ^ 28)) - 1;
        f60979u0 = i20 % 128;
        int i21 = i20 % 2;
        return dividerPadding;
    }
}

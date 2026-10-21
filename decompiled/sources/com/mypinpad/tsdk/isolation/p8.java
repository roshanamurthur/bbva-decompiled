package com.mypinpad.tsdk.isolation;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
public final class p8 extends ContinuationImpl {
    public static int E0 = 0;
    public static int F0 = 1;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public setAdjustViewBounds f57636p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public me f57637q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public getBeepOnFailure f57638r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public getBeepOnFailure f57639s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public values f57640t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public setRotationX f57641u0;
    public getClearButtonIconDrawableId v0;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public /* synthetic */ Object f57642w0;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public final /* synthetic */ setAdjustViewBounds f57643x0;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    public int f57644y0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p8(setAdjustViewBounds setadjustviewbounds, Continuation<? super p8> continuation) {
        super(continuation);
        this.f57643x0 = setadjustviewbounds;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Object[] objArr = {this, obj};
        System.identityHashCode(this);
        p8 p8Var = (p8) objArr[0];
        Object obj2 = objArr[1];
        int i10 = E0;
        int i11 = i10 ^ 39;
        int i12 = ((i10 & 39) | i11) << 1;
        int i13 = -i11;
        int i14 = ((i12 | i13) << 1) - (i12 ^ i13);
        F0 = i14 % 128;
        int i15 = i14 % 2;
        p8Var.f57642w0 = obj2;
        int i16 = p8Var.f57644y0;
        int i17 = (Integer.MAX_VALUE & i16) | ((~i16) & Integer.MIN_VALUE);
        int i18 = i16 & Integer.MIN_VALUE;
        p8Var.f57644y0 = (i18 & i17) | (i17 ^ i18);
        Object compoundDrawableTintBlendMode = setAdjustViewBounds.setCompoundDrawableTintBlendMode(new Object[]{p8Var.f57643x0, p8Var}, -778123476, 778123499, (int) System.currentTimeMillis());
        int i19 = F0;
        int i20 = i19 & 29;
        int i21 = i20 + ((i19 ^ 29) | i20);
        E0 = i21 % 128;
        int i22 = i21 % 2;
        return compoundDrawableTintBlendMode;
    }
}

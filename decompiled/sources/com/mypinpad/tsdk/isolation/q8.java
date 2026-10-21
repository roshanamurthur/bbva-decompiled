package com.mypinpad.tsdk.isolation;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
public final class q8 extends ContinuationImpl {

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public static int f57815t0 = 0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public static int f57816u0 = 1;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public setPictureListener f57817p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public /* synthetic */ Object f57818q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final /* synthetic */ setAdjustViewBounds f57819r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public int f57820s0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q8(setAdjustViewBounds setadjustviewbounds, Continuation<? super q8> continuation) {
        super(continuation);
        this.f57819r0 = setadjustviewbounds;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Object compoundDrawableTintBlendMode;
        Object[] objArr = {this, obj};
        System.identityHashCode(this);
        q8 q8Var = (q8) objArr[0];
        Object obj2 = objArr[1];
        int i10 = f57816u0;
        int i11 = i10 ^ 63;
        int i12 = (i10 & 63) << 1;
        int i13 = ((i11 | i12) << 1) - (i12 ^ i11);
        f57815t0 = i13 % 128;
        int i14 = i13 % 2;
        q8Var.f57818q0 = obj2;
        int i15 = q8Var.f57820s0;
        if (i14 != 0) {
            int i16 = i15 ^ Integer.MIN_VALUE;
            int i17 = i15 & Integer.MIN_VALUE;
            q8Var.f57820s0 = (i17 & i16) | (i16 ^ i17);
            compoundDrawableTintBlendMode = setAdjustViewBounds.setCompoundDrawableTintBlendMode(new Object[]{q8Var.f57819r0, q8Var}, -1178433071, 1178433078, (int) System.currentTimeMillis());
            int i18 = 64 / 0;
        } else {
            int i19 = (Integer.MAX_VALUE & i15) | ((~i15) & Integer.MIN_VALUE);
            int i20 = i15 & Integer.MIN_VALUE;
            q8Var.f57820s0 = (i20 & i19) | (i19 ^ i20);
            compoundDrawableTintBlendMode = setAdjustViewBounds.setCompoundDrawableTintBlendMode(new Object[]{q8Var.f57819r0, q8Var}, -1178433071, 1178433078, (int) System.currentTimeMillis());
        }
        int i21 = f57815t0;
        int i22 = ((i21 ^ 52) + ((i21 & 52) << 1)) - 1;
        f57816u0 = i22 % 128;
        int i23 = i22 % 2;
        return compoundDrawableTintBlendMode;
    }
}

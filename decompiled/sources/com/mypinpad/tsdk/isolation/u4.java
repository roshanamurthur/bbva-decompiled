package com.mypinpad.tsdk.isolation;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
public final class u4 extends ContinuationImpl {

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public static int f61237t0 = 0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public static int f61238u0 = 1;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public ho f61239p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public /* synthetic */ Object f61240q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final /* synthetic */ ho f61241r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public int f61242s0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u4(ho hoVar, Continuation<? super u4> continuation) {
        super(continuation);
        this.f61241r0 = hoVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Object onFocusChangeListener;
        Object[] objArr = {this, obj};
        System.identityHashCode(this);
        u4 u4Var = (u4) objArr[0];
        Object obj2 = objArr[1];
        int i10 = f61238u0;
        int i11 = (((i10 | 6) << 1) - (i10 ^ 6)) - 1;
        f61237t0 = i11 % 128;
        int i12 = i11 % 2;
        u4Var.f61240q0 = obj2;
        int i13 = u4Var.f61242s0;
        if (i12 != 0) {
            u4Var.f61242s0 = (i13 & Integer.MIN_VALUE) | (i13 ^ Integer.MIN_VALUE);
            onFocusChangeListener = ho.setOnFocusChangeListener(new Object[]{u4Var.f61241r0, u4Var}, 1306572932, -1306572932, (int) System.currentTimeMillis());
            int i14 = 13 / 0;
        } else {
            int i15 = i13 & Integer.MIN_VALUE;
            int i16 = (i13 | Integer.MIN_VALUE) & (~i15);
            u4Var.f61242s0 = (i16 & i15) | (i16 ^ i15);
            onFocusChangeListener = ho.setOnFocusChangeListener(new Object[]{u4Var.f61241r0, u4Var}, 1306572932, -1306572932, (int) System.currentTimeMillis());
        }
        int i17 = f61237t0;
        int i18 = i17 | 107;
        int i19 = i18 << 1;
        int i20 = -((~(i17 & 107)) & i18);
        int i21 = ((i19 | i20) << 1) - (i20 ^ i19);
        f61238u0 = i21 % 128;
        if (i21 % 2 != 0) {
            return onFocusChangeListener;
        }
        throw null;
    }
}

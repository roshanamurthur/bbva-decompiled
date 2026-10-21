package com.mypinpad.tsdk.isolation;

import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
public final class r8 extends ContinuationImpl {
    public int E0;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public setAdjustViewBounds f58073p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public getBeepOnFailure f58074q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public getBeepOnFailure f58075r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public values f58076s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public List f58077t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public Iterator f58078u0;
    public setMax v0;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public byte[] f58079w0;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public /* synthetic */ Object f58080x0;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    public final /* synthetic */ setAdjustViewBounds f58081y0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r8(setAdjustViewBounds setadjustviewbounds, Continuation<? super r8> continuation) {
        super(continuation);
        this.f58081y0 = setadjustviewbounds;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Object[] objArr = {this, obj};
        System.identityHashCode(this);
        r8 r8Var = (r8) objArr[0];
        r8Var.f58080x0 = objArr[1];
        int i10 = r8Var.E0;
        int i11 = i10 ^ Integer.MIN_VALUE;
        int i12 = i10 & Integer.MIN_VALUE;
        r8Var.E0 = (i12 & i11) | (i11 ^ i12);
        return setAdjustViewBounds.setCompoundDrawableTintBlendMode(new Object[]{r8Var.f58081y0, r8Var}, 222164682, -222164672, (int) System.currentTimeMillis());
    }
}

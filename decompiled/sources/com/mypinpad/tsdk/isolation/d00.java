package com.mypinpad.tsdk.isolation;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.channels.SendChannel;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
public final class d00 extends ContinuationImpl {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public valueOf f55073p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public SendChannel f55074q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public gz f55075r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public me f55076s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public setTextKeepState f55077t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public setTextColor f55078u0;
    public /* synthetic */ Object v0;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public final /* synthetic */ valueOf f55079w0;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public int f55080x0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d00(valueOf valueof, Continuation<? super d00> continuation) {
        super(continuation);
        this.f55079w0 = valueof;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Object[] objArr = {this, obj};
        System.identityHashCode(this);
        d00 d00Var = (d00) objArr[0];
        d00Var.v0 = objArr[1];
        int i10 = d00Var.f55080x0;
        d00Var.f55080x0 = (i10 & Integer.MIN_VALUE) | (i10 ^ Integer.MIN_VALUE);
        return valueOf.setX(d00Var.f55079w0, null, null, null, null, d00Var);
    }
}

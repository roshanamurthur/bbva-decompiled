package com.bbva.glomohybrid.landing.presentation.adapter;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: LandingAdapter.kt */
/* JADX INFO: loaded from: classes6.dex */
@DebugMetadata(c = "com.bbva.glomohybrid.landing.presentation.adapter.LandingAdapter", f = "LandingAdapter.kt", i = {}, l = {135}, m = "getDataDiffResult", n = {}, s = {})
public final class a extends ContinuationImpl {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public /* synthetic */ Object f33015p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ LandingAdapter f33016q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public int f33017r0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(LandingAdapter landingAdapter, Continuation<? super a> continuation) {
        super(continuation);
        this.f33016q0 = landingAdapter;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.f33015p0 = obj;
        this.f33017r0 |= Integer.MIN_VALUE;
        return LandingAdapter.access$getDataDiffResult(this.f33016q0, null, null, null, this);
    }
}

package com.bbva.glomohybrid.splash.presentation.view;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: SplashActivity.kt */
/* JADX INFO: loaded from: classes7.dex */
@DebugMetadata(c = "com.bbva.glomohybrid.splash.presentation.view.SplashActivity$onCreate$1$1", f = "SplashActivity.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class b extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ SplashActivity f34535p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(SplashActivity splashActivity, Continuation<? super b> continuation) {
        super(2, continuation);
        this.f34535p0 = splashActivity;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new b(this.f34535p0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((b) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        ek.a.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        SplashActivity splashActivity = this.f34535p0;
        SplashActivity.access$setUpViewModel(splashActivity);
        splashActivity.i().getShouldShowRootFragment().observe(splashActivity, new SplashActivity.e(new fa.b(splashActivity)));
        SplashActivity.access$setFragmentResultListener(splashActivity);
        splashActivity.k();
        SplashActivity.access$configureCollectors(splashActivity);
        return Unit.INSTANCE;
    }
}

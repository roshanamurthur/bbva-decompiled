package com.bbva.glomohybrid.login.presentation.view;

import androidx.lifecycle.FlowExtKt;
import androidx.lifecycle.Lifecycle;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: LoginActivity.kt */
/* JADX INFO: loaded from: classes6.dex */
@DebugMetadata(c = "com.bbva.glomohybrid.login.presentation.view.LoginActivity$collectViewState$1", f = "LoginActivity.kt", i = {}, l = {203}, m = "invokeSuspend", n = {}, s = {})
public final class d extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public int f33560p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ LoginActivity f33561q0;

    /* JADX INFO: compiled from: LoginActivity.kt */
    public static final class a<T> implements FlowCollector {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ LoginActivity f33562p0;

        public a(LoginActivity loginActivity) {
            this.f33562p0 = loginActivity;
        }

        @Override // kotlinx.coroutines.flow.FlowCollector
        public final Object emit(Object obj, Continuation continuation) {
            LoginContract.State state = (LoginContract.State) obj;
            if (state instanceof LoginContract.State.Ready) {
                LoginActivity loginActivity = this.f33562p0;
                LoginContract.State.Ready ready = (LoginContract.State.Ready) state;
                LoginActivity.access$getLoginView(loginActivity).getViewModel().updateModel(ready.getState());
                loginActivity.j().setIntent(new LoginContract.Intent.CheckLoginState(ready.getState()));
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(LoginActivity loginActivity, Continuation<? super d> continuation) {
        super(2, continuation);
        this.f33561q0 = loginActivity;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new d(this.f33561q0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((d) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
        int i10 = this.f33560p0;
        if (i10 == 0) {
            ResultKt.throwOnFailure(obj);
            LoginActivity loginActivity = this.f33561q0;
            Flow<LoginContract.State> loginState = loginActivity.j().getLoginState();
            Lifecycle lifecycle = loginActivity.getLifecycle();
            Intrinsics.checkNotNullExpressionValue(lifecycle, "<get-lifecycle>(...)");
            Flow flowFlowWithLifecycle = FlowExtKt.flowWithLifecycle(loginState, lifecycle, Lifecycle.State.CREATED);
            a aVar = new a(loginActivity);
            this.f33560p0 = 1;
            if (flowFlowWithLifecycle.collect(aVar, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        return Unit.INSTANCE;
    }
}

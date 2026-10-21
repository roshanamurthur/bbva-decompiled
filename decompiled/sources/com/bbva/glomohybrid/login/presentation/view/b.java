package com.bbva.glomohybrid.login.presentation.view;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.RepeatOnLifecycleKt;
import com.bbva.component.ui.login.credentials.LoginEvent;
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
@DebugMetadata(c = "com.bbva.glomohybrid.login.presentation.view.LoginActivity$collectEventsLoginViewState$1", f = "LoginActivity.kt", i = {}, l = {381}, m = "invokeSuspend", n = {}, s = {})
public final class b extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public int f33550p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ LoginActivity f33551q0;

    /* JADX INFO: compiled from: LoginActivity.kt */
    @DebugMetadata(c = "com.bbva.glomohybrid.login.presentation.view.LoginActivity$collectEventsLoginViewState$1$1", f = "LoginActivity.kt", i = {}, l = {382}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public int f33552p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ LoginActivity f33553q0;

        /* JADX INFO: renamed from: com.bbva.glomohybrid.login.presentation.view.b$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: LoginActivity.kt */
        public static final class C0144a<T> implements FlowCollector {

            /* JADX INFO: renamed from: p0, reason: collision with root package name */
            public final /* synthetic */ LoginActivity f33554p0;

            public C0144a(LoginActivity loginActivity) {
                this.f33554p0 = loginActivity;
            }

            @Override // kotlinx.coroutines.flow.FlowCollector
            public final Object emit(Object obj, Continuation continuation) {
                LoginEvent loginEvent = (LoginEvent) obj;
                boolean z10 = loginEvent instanceof LoginEvent.OnLoginButtonTaped;
                LoginActivity loginActivity = this.f33554p0;
                if (z10) {
                    loginActivity.j().setIntent(new LoginContract.Intent.LoginButtonTaped(((LoginEvent.OnLoginButtonTaped) loginEvent).getData()));
                } else if (loginEvent instanceof LoginEvent.OnBiometricButtonTaped) {
                    loginActivity.j().setIntent(LoginContract.Intent.BiometricAuthenticationTaped.INSTANCE);
                } else if (loginEvent instanceof LoginEvent.OnRememberedPasswordTaped) {
                    loginActivity.j().setIntent(LoginContract.Intent.RememberedPasswordTaped.INSTANCE);
                } else if (loginEvent instanceof LoginEvent.OnItemListSelected) {
                    loginActivity.j().setIntent(new LoginContract.Intent.UpdateForm(((LoginEvent.OnItemListSelected) loginEvent).getDocumentItem()));
                } else if (loginEvent instanceof LoginEvent.OnPasswordDataInsertedLength) {
                    loginActivity.j().setIntent(new LoginContract.Intent.SendFilledPasswordEvent(((LoginEvent.OnPasswordDataInsertedLength) loginEvent).getDataLength()));
                } else {
                    boolean z11 = loginEvent instanceof LoginEvent.LoginButtonEnabled;
                }
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(LoginActivity loginActivity, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f33553q0 = loginActivity;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new a(this.f33553q0, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
            int i10 = this.f33552p0;
            if (i10 == 0) {
                ResultKt.throwOnFailure(obj);
                LoginActivity loginActivity = this.f33553q0;
                Flow<LoginEvent> onEvents = LoginActivity.access$getLoginView(loginActivity).getViewModel().getOnEvents();
                C0144a c0144a = new C0144a(loginActivity);
                this.f33552p0 = 1;
                if (onEvents.collect(c0144a, this) == coroutine_suspended) {
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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(LoginActivity loginActivity, Continuation<? super b> continuation) {
        super(2, continuation);
        this.f33551q0 = loginActivity;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new b(this.f33551q0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((b) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
        int i10 = this.f33550p0;
        if (i10 == 0) {
            ResultKt.throwOnFailure(obj);
            LoginActivity loginActivity = this.f33551q0;
            Lifecycle lifecycle = loginActivity.getLifecycle();
            Intrinsics.checkNotNullExpressionValue(lifecycle, "<get-lifecycle>(...)");
            Lifecycle.State state = Lifecycle.State.STARTED;
            a aVar = new a(loginActivity, null);
            this.f33550p0 = 1;
            if (RepeatOnLifecycleKt.repeatOnLifecycle(lifecycle, state, aVar, this) == coroutine_suspended) {
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

package com.bbva.glomohybrid.login.presentation.view;

import com.bbva.component.dm.analytics.model.AnalyticsEvent;
import com.bbva.component.dm.biometriclogin.presentation.model.LoginState;
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
@DebugMetadata(c = "com.bbva.glomohybrid.login.presentation.view.LoginActivity$collectBiometricsState$1", f = "LoginActivity.kt", i = {}, l = {220}, m = "invokeSuspend", n = {}, s = {})
public final class a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public int f33547p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ LoginActivity f33548q0;

    /* JADX INFO: renamed from: com.bbva.glomohybrid.login.presentation.view.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: LoginActivity.kt */
    public static final class C0143a<T> implements FlowCollector {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ LoginActivity f33549p0;

        public C0143a(LoginActivity loginActivity) {
            this.f33549p0 = loginActivity;
        }

        @Override // kotlinx.coroutines.flow.FlowCollector
        public final Object emit(Object obj, Continuation continuation) {
            LoginState loginState = (LoginState) obj;
            boolean zAreEqual = Intrinsics.areEqual(loginState, LoginState.BiometricsError.INSTANCE);
            LoginActivity loginActivity = this.f33549p0;
            if (zAreEqual) {
                loginActivity.j().setIntent(LoginContract.Intent.BiometricsLoginError.INSTANCE);
            } else if (Intrinsics.areEqual(loginState, LoginState.BiometricsRetryEndError.INSTANCE) || Intrinsics.areEqual(loginState, LoginState.BiometricsFriendlyFraudError.INSTANCE)) {
                loginActivity.j().setIntent(LoginContract.Intent.LoadUserRememberedCredentials.INSTANCE);
            } else if (Intrinsics.areEqual(loginState, LoginState.BiometricsServerError.INSTANCE)) {
                LoginActivity.access$handleBiometricsServerError(loginActivity);
                loginActivity.j().trackEvent$Login_mexicoGoogleRelease(AnalyticsEvent.LOGIN_UNAVAILABLE_FIDO_SERVICE_ERROR);
            } else if (Intrinsics.areEqual(loginState, LoginState.AccessingBiometrics.INSTANCE)) {
                loginActivity.j().setIntent(LoginContract.Intent.AccessingBiometrics.INSTANCE);
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(LoginActivity loginActivity, Continuation<? super a> continuation) {
        super(2, continuation);
        this.f33548q0 = loginActivity;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new a(this.f33548q0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
        int i10 = this.f33547p0;
        if (i10 == 0) {
            ResultKt.throwOnFailure(obj);
            LoginActivity loginActivity = this.f33548q0;
            Flow<LoginState> flowLoginStateObserver = loginActivity.j().loginStateObserver();
            C0143a c0143a = new C0143a(loginActivity);
            this.f33547p0 = 1;
            if (flowLoginStateObserver.collect(c0143a, this) == coroutine_suspended) {
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

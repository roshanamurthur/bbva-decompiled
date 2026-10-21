package u9;

import com.bbva.glomohybrid.login.presentation.viewmodel.LoginGlobalViewModel;
import com.bbva.glomohybrid.login.presentation.viewmodel.LoginViewModel;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: LoginViewModel.kt */
/* JADX INFO: loaded from: classes6.dex */
@DebugMetadata(c = "com.bbva.glomohybrid.login.presentation.viewmodel.LoginViewModel$initBiometricAuthObserver$1", f = "LoginViewModel.kt", i = {}, l = {118}, m = "invokeSuspend", n = {}, s = {})
public final class g extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public int f93765p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ LoginViewModel f93766q0;

    /* JADX INFO: compiled from: LoginViewModel.kt */
    public static final class a<T> implements FlowCollector {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ LoginViewModel f93767p0;

        public a(LoginViewModel loginViewModel) {
            this.f93767p0 = loginViewModel;
        }

        @Override // kotlinx.coroutines.flow.FlowCollector
        public final Object emit(Object obj, Continuation continuation) {
            LoginViewModel loginViewModel = this.f93767p0;
            LoginGlobalViewModel.onLoginSuccess$default(loginViewModel, null, 1, null);
            LoginViewModel.access$saveLoginDataWhenBiometric(loginViewModel);
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(LoginViewModel loginViewModel, Continuation<? super g> continuation) {
        super(2, continuation);
        this.f93766q0 = loginViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new g(this.f93766q0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((g) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
        int i10 = this.f93765p0;
        if (i10 == 0) {
            ResultKt.throwOnFailure(obj);
            LoginViewModel loginViewModel = this.f93766q0;
            Flow<Unit> flowBiometricAuthObserver = loginViewModel.biometricAuthObserver();
            a aVar = new a(loginViewModel);
            this.f93765p0 = 1;
            if (flowBiometricAuthObserver.collect(aVar, this) == coroutine_suspended) {
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

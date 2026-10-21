package u9;

import com.bbva.glomohybrid.featureflags.domain.model.FeatureFlags;
import com.bbva.glomohybrid.featureflags.repository.FeatureFlagRepositoryExtensionKt;
import com.bbva.glomohybrid.login.presentation.viewmodel.LoginViewModel;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Deferred;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: LoginViewModel.kt */
/* JADX INFO: loaded from: classes6.dex */
@DebugMetadata(c = "com.bbva.glomohybrid.login.presentation.viewmodel.LoginViewModel$getCustomerFromFlag$1", f = "LoginViewModel.kt", i = {}, l = {182}, m = "invokeSuspend", n = {}, s = {})
public final class e extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public int f93759p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public /* synthetic */ Object f93760q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final /* synthetic */ Deferred<FeatureFlags> f93761r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final /* synthetic */ LoginViewModel f93762s0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(Deferred<FeatureFlags> deferred, LoginViewModel loginViewModel, Continuation<? super e> continuation) {
        super(2, continuation);
        this.f93761r0 = deferred;
        this.f93762s0 = loginViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        e eVar = new e(this.f93761r0, this.f93762s0, continuation);
        eVar.f93760q0 = obj;
        return eVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((e) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Object objM5535constructorimpl;
        Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
        int i10 = this.f93759p0;
        try {
            if (i10 == 0) {
                ResultKt.throwOnFailure(obj);
                Deferred<FeatureFlags> deferred = this.f93761r0;
                Result.Companion companion = Result.INSTANCE;
                this.f93759p0 = 1;
                obj = deferred.await(this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            objM5535constructorimpl = Result.m5535constructorimpl((FeatureFlags) obj);
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            objM5535constructorimpl = Result.m5535constructorimpl(ResultKt.createFailure(th2));
        }
        if (Result.m5540isFailureimpl(objM5535constructorimpl)) {
            objM5535constructorimpl = null;
        }
        FeatureFlags featureFlags = (FeatureFlags) objM5535constructorimpl;
        if (featureFlags != null) {
            boolean customerLogins = featureFlags.getCustomerLogins();
            LoginViewModel loginViewModel = this.f93762s0;
            loginViewModel.f33712s1 = customerLogins;
            LoginViewModel.access$addCustomerAction(loginViewModel);
            if (!loginViewModel.f33712s1 || FeatureFlagRepositoryExtensionKt.isLowCostDisabled(LoginViewModel.access$getFeatureFlagsRepository(loginViewModel))) {
                loginViewModel.getCustomer();
            } else {
                LoginViewModel.access$getCustomerIndicators(loginViewModel);
            }
        }
        return Unit.INSTANCE;
    }
}

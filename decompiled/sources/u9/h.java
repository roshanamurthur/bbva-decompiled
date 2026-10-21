package u9;

import com.bbva.glomohybrid.base.viewmodel.ViewModelComponentsProviders;
import com.bbva.glomohybrid.featureflags.domain.model.FeatureFlags;
import com.bbva.glomohybrid.featureflags.domain.model.StorePolicy;
import com.bbva.glomohybrid.featureflags.domain.usecase.SyncFeatureFlagsUseCase;
import com.bbva.glomohybrid.login.presentation.viewmodel.LoginViewModel;
import com.bbva.glomohybrid.profiling.handler.ProfilingFeatureFlagsHandler;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.koin.core.component.KoinScopeComponent;

/* JADX INFO: compiled from: LoginViewModel.kt */
/* JADX INFO: loaded from: classes6.dex */
@DebugMetadata(c = "com.bbva.glomohybrid.login.presentation.viewmodel.LoginViewModel$updateFeatureFlagsAsync$1", f = "LoginViewModel.kt", i = {}, l = {515}, m = "invokeSuspend", n = {}, s = {})
@SourceDebugExtension({"SMAP\nLoginViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LoginViewModel.kt\ncom/bbva/glomohybrid/login/presentation/viewmodel/LoginViewModel$updateFeatureFlagsAsync$1\n+ 2 KoinComponent.kt\norg/koin/core/component/KoinComponentKt\n+ 3 Scope.kt\norg/koin/core/scope/Scope\n+ 4 Koin.kt\norg/koin/core/Koin\n*L\n1#1,552:1\n41#2,6:553\n47#2:560\n41#2,6:562\n47#2:569\n133#3:559\n133#3:568\n107#4:561\n107#4:570\n*S KotlinDebug\n*F\n+ 1 LoginViewModel.kt\ncom/bbva/glomohybrid/login/presentation/viewmodel/LoginViewModel$updateFeatureFlagsAsync$1\n*L\n512#1:553,6\n512#1:560\n514#1:562,6\n514#1:569\n512#1:559\n514#1:568\n512#1:561\n514#1:570\n*E\n"})
public final class h extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super FeatureFlags>, Object> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public int f93768p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ LoginViewModel f93769q0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(LoginViewModel loginViewModel, Continuation<? super h> continuation) {
        super(2, continuation);
        this.f93769q0 = loginViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new h(this.f93769q0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super FeatureFlags> continuation) {
        return ((h) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
        int i10 = this.f93768p0;
        if (i10 == 0) {
            ResultKt.throwOnFailure(obj);
            LoginViewModel loginViewModel = this.f93769q0;
            ViewModelComponentsProviders provider = loginViewModel.getProvider();
            ((ProfilingFeatureFlagsHandler) (provider instanceof KoinScopeComponent ? ((KoinScopeComponent) provider).getScope() : androidx.camera.core.impl.utils.c.f(provider)).get(Reflection.getOrCreateKotlinClass(ProfilingFeatureFlagsHandler.class), null, null)).setDocument(LoginViewModel.access$getUserDocument(loginViewModel));
            ViewModelComponentsProviders provider2 = loginViewModel.getProvider();
            SyncFeatureFlagsUseCase syncFeatureFlagsUseCase = (SyncFeatureFlagsUseCase) (provider2 instanceof KoinScopeComponent ? ((KoinScopeComponent) provider2).getScope() : androidx.camera.core.impl.utils.c.f(provider2)).get(Reflection.getOrCreateKotlinClass(SyncFeatureFlagsUseCase.class), null, null);
            StorePolicy storePolicy = StorePolicy.Local;
            this.f93768p0 = 1;
            obj = syncFeatureFlagsUseCase.execute(storePolicy, (Continuation<? super FeatureFlags>) this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        return obj;
    }
}

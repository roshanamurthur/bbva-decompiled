package u9;

import com.bbva.glomo.user.domain.usecase.DeleteUserDataUseCase;
import com.bbva.glomohybrid.base.viewmodel.ViewModelComponentsProviders;
import com.bbva.glomohybrid.login.presentation.viewmodel.LoginGlobalViewModel;
import com.bbva.sl.ar.android.sslpinning.result.ResultCode;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.koin.core.component.KoinScopeComponent;
import org.koin.core.parameter.ParametersHolder;
import org.koin.core.parameter.ParametersHolderKt;

/* JADX INFO: compiled from: LoginGlobalViewModel.kt */
/* JADX INFO: loaded from: classes6.dex */
@DebugMetadata(c = "com.bbva.glomohybrid.login.presentation.viewmodel.LoginGlobalViewModel$removeUser$2", f = "LoginGlobalViewModel.kt", i = {}, l = {ResultCode.ERROR_TRUST_CERT_DATE_AFTERVALIDITY}, m = "invokeSuspend", n = {}, s = {})
@SourceDebugExtension({"SMAP\nLoginGlobalViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LoginGlobalViewModel.kt\ncom/bbva/glomohybrid/login/presentation/viewmodel/LoginGlobalViewModel$removeUser$2\n+ 2 KoinComponent.kt\norg/koin/core/component/KoinComponentKt\n+ 3 Scope.kt\norg/koin/core/scope/Scope\n+ 4 Koin.kt\norg/koin/core/Koin\n*L\n1#1,939:1\n41#2,6:940\n47#2:947\n133#3:946\n107#4:948\n*S KotlinDebug\n*F\n+ 1 LoginGlobalViewModel.kt\ncom/bbva/glomohybrid/login/presentation/viewmodel/LoginGlobalViewModel$removeUser$2\n*L\n521#1:940,6\n521#1:947\n521#1:946\n521#1:948\n*E\n"})
public final class d extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public int f93756p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ LoginGlobalViewModel f93757q0;

    /* JADX INFO: compiled from: LoginGlobalViewModel.kt */
    public static final class a extends Lambda implements Function0<ParametersHolder> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final a f93758p0 = new a(0);

        @Override // kotlin.jvm.functions.Function0
        public final ParametersHolder invoke() {
            return ParametersHolderKt.parametersOf(Boolean.FALSE);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(LoginGlobalViewModel loginGlobalViewModel, Continuation<? super d> continuation) {
        super(2, continuation);
        this.f93757q0 = loginGlobalViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new d(this.f93757q0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((d) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
        int i10 = this.f93756p0;
        if (i10 == 0) {
            ResultKt.throwOnFailure(obj);
            ViewModelComponentsProviders provider = this.f93757q0.getProvider();
            boolean z10 = provider instanceof KoinScopeComponent;
            DeleteUserDataUseCase deleteUserDataUseCase = (DeleteUserDataUseCase) (z10 ? ((KoinScopeComponent) provider).getScope() : androidx.camera.core.impl.utils.c.f(provider)).get(Reflection.getOrCreateKotlinClass(DeleteUserDataUseCase.class), null, a.f93758p0);
            this.f93756p0 = 1;
            if (deleteUserDataUseCase.execute(this) == coroutine_suspended) {
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

package u9;

import com.bbva.glomohybrid.login.domain.usecase.GetCustomerLoginsUseCase;
import com.bbva.glomohybrid.login.presentation.viewmodel.LoginViewModel;
import com.esotericsoftware.asm.Opcodes;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: LoginViewModel.kt */
/* JADX INFO: loaded from: classes6.dex */
@DebugMetadata(c = "com.bbva.glomohybrid.login.presentation.viewmodel.LoginViewModel$getCustomerIndicators$1", f = "LoginViewModel.kt", i = {}, l = {Opcodes.MULTIANEWARRAY}, m = "invokeSuspend", n = {}, s = {})
public final class f extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public int f93763p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ LoginViewModel f93764q0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(LoginViewModel loginViewModel, Continuation<? super f> continuation) {
        super(2, continuation);
        this.f93764q0 = loginViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new f(this.f93764q0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((f) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
        int i10 = this.f93763p0;
        if (i10 == 0) {
            ResultKt.throwOnFailure(obj);
            GetCustomerLoginsUseCase getCustomerLoginsUseCaseAccess$getGetCustomerLoginsUseCase = LoginViewModel.access$getGetCustomerLoginsUseCase(this.f93764q0);
            this.f93763p0 = 1;
            if (getCustomerLoginsUseCaseAccess$getGetCustomerLoginsUseCase.execute(this) == coroutine_suspended) {
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

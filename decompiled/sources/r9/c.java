package r9;

import com.bbva.component.dm.customer.domain.model.Customer;
import com.bbva.component.dm.customer.domain.model.IndicatorsDataLogins;
import com.bbva.glomohybrid.login.data.model.CustomerLoginsModel;
import com.bbva.glomohybrid.login.domain.model.CustomerIndicatorsLogins;
import com.bbva.glomohybrid.login.domain.usecase.GetCustomerLoginsUseCase;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: GetCustomerLoginsUseCase.kt */
/* JADX INFO: loaded from: classes6.dex */
@DebugMetadata(c = "com.bbva.glomohybrid.login.domain.usecase.GetCustomerLoginsUseCase$handleGetCustomerLogins$2", f = "GetCustomerLoginsUseCase.kt", i = {}, l = {70}, m = "invokeSuspend", n = {}, s = {})
public final class c extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public int f92972p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ Customer f92973q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final /* synthetic */ IndicatorsDataLogins f92974r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final /* synthetic */ GetCustomerLoginsUseCase f92975s0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(GetCustomerLoginsUseCase getCustomerLoginsUseCase, Customer customer, IndicatorsDataLogins indicatorsDataLogins, Continuation continuation) {
        super(2, continuation);
        this.f92973q0 = customer;
        this.f92974r0 = indicatorsDataLogins;
        this.f92975s0 = getCustomerLoginsUseCase;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new c(this.f92975s0, this.f92973q0, this.f92974r0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((c) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
        int i10 = this.f92972p0;
        if (i10 == 0) {
            ResultKt.throwOnFailure(obj);
            CustomerIndicatorsLogins customerIndicatorsLogins = new CustomerIndicatorsLogins(this.f92974r0, new CustomerLoginsModel(this.f92973q0));
            this.f92972p0 = 1;
            if (GetCustomerLoginsUseCase.access$fireSuccess(this.f92975s0, customerIndicatorsLogins, this) == coroutine_suspended) {
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

package r9;

import com.bbva.glomohybrid.base.cells.CellsReactor;
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
@DebugMetadata(c = "com.bbva.glomohybrid.login.domain.usecase.GetCustomerLoginsUseCase$fireSuccess$2", f = "GetCustomerLoginsUseCase.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ CustomerIndicatorsLogins f92966p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(CustomerIndicatorsLogins customerIndicatorsLogins, Continuation<? super a> continuation) {
        super(2, continuation);
        this.f92966p0 = customerIndicatorsLogins;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new a(this.f92966p0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        ek.a.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        CellsReactor.fire(GetCustomerLoginsUseCase.ID, GetCustomerLoginsUseCase.ACTION_GET_CUSTOMER_INDICATORS_LOGINS_SUCCESS, this.f92966p0);
        return Unit.INSTANCE;
    }
}

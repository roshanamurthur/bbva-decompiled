package r9;

import com.bbva.component.dm.customer.domain.model.IndicatorsDataLogins;
import com.bbva.glomohybrid.login.domain.usecase.GetCustomerLoginsUseCase;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: GetCustomerLoginsUseCase.kt */
/* JADX INFO: loaded from: classes6.dex */
@DebugMetadata(c = "com.bbva.glomohybrid.login.domain.usecase.GetCustomerLoginsUseCase", f = "GetCustomerLoginsUseCase.kt", i = {0, 0}, l = {50, 53, 57}, m = "handleGetCustomerIndicators", n = {"this", "indicatorsDataLogins"}, s = {"L$0", "L$1"})
public final class b extends ContinuationImpl {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public GetCustomerLoginsUseCase f92967p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public IndicatorsDataLogins f92968q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public /* synthetic */ Object f92969r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final /* synthetic */ GetCustomerLoginsUseCase f92970s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public int f92971t0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(GetCustomerLoginsUseCase getCustomerLoginsUseCase, Continuation<? super b> continuation) {
        super(continuation);
        this.f92970s0 = getCustomerLoginsUseCase;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.f92969r0 = obj;
        this.f92971t0 |= Integer.MIN_VALUE;
        return GetCustomerLoginsUseCase.access$handleGetCustomerIndicators(this.f92970s0, null, this);
    }
}

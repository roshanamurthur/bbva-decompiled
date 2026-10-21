package com.bbva.glomohybrid.login.domain.usecase;

import bk.q;
import com.bbva.cells.component.kit.model.ActionSpec;
import com.bbva.component.dm.customer.CustomerDataManager;
import com.bbva.component.dm.customer.domain.model.Customer;
import com.bbva.component.dm.customer.domain.model.CustomerResult;
import com.bbva.component.dm.customer.domain.model.IndicatorsDataLogins;
import com.bbva.component.dm.customer.domain.model.IndicatorsLoginsEntity;
import com.bbva.glomohybrid.base.cells.CellsReactor;
import com.bbva.glomohybrid.login.domain.model.CustomerIndicatorsLogins;
import com.bbva.glomoutils.scheduler.DefaultThreadDispatchers;
import com.bbva.glomoutils.scheduler.ThreadDispatchers;
import com.bbva.glomoutils.usecase.SuspendUseCase;
import java.util.Map;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.JvmField;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: GetCustomerLoginsUseCase.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u000b2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u000bB\u0019\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0013\u0010\u0003\u001a\u00020\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\f"}, d2 = {"Lcom/bbva/glomohybrid/login/domain/usecase/GetCustomerLoginsUseCase;", "Lcom/bbva/glomoutils/usecase/SuspendUseCase;", "", "execute", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/bbva/component/dm/customer/CustomerDataManager;", "customerDataManager", "Lcom/bbva/glomoutils/scheduler/ThreadDispatchers;", "dispatcher", "<init>", "(Lcom/bbva/component/dm/customer/CustomerDataManager;Lcom/bbva/glomoutils/scheduler/ThreadDispatchers;)V", "Companion", "Login_mexicoGoogleRelease"}, k = 1, mv = {1, 9, 0})
public final class GetCustomerLoginsUseCase implements SuspendUseCase<Unit> {

    @NotNull
    public static final String ID = "get-customer-login";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final CustomerDataManager f33431a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final ThreadDispatchers f33432b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public Map<String, ? extends Object> f33433c;

    @JvmField
    @NotNull
    public static final ActionSpec<CustomerIndicatorsLogins> ACTION_GET_CUSTOMER_INDICATORS_LOGINS_SUCCESS = new ActionSpec<>("get-indicators-logins-success");

    /* JADX INFO: compiled from: GetCustomerLoginsUseCase.kt */
    @DebugMetadata(c = "com.bbva.glomohybrid.login.domain.usecase.GetCustomerLoginsUseCase", f = "GetCustomerLoginsUseCase.kt", i = {}, l = {33}, m = "execute", n = {}, s = {})
    public static final class a extends ContinuationImpl {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public /* synthetic */ Object f33434p0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public int f33436r0;

        public a(Continuation<? super a> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f33434p0 = obj;
            this.f33436r0 |= Integer.MIN_VALUE;
            return GetCustomerLoginsUseCase.this.execute(this);
        }
    }

    /* JADX INFO: compiled from: GetCustomerLoginsUseCase.kt */
    @DebugMetadata(c = "com.bbva.glomohybrid.login.domain.usecase.GetCustomerLoginsUseCase$execute$2", f = "GetCustomerLoginsUseCase.kt", i = {}, l = {34, 37, 41}, m = "invokeSuspend", n = {}, s = {})
    public static final class b extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public int f33437p0;

        public b(Continuation<? super b> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return GetCustomerLoginsUseCase.this.new b(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((b) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
            int i10 = this.f33437p0;
            GetCustomerLoginsUseCase getCustomerLoginsUseCase = GetCustomerLoginsUseCase.this;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.throwOnFailure(obj);
                } else {
                    if (i10 != 2 && i10 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            }
            ResultKt.throwOnFailure(obj);
            CustomerDataManager customerDataManager = getCustomerLoginsUseCase.f33431a;
            this.f33437p0 = 1;
            obj = customerDataManager.getCustomerIndicators("", this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
            CustomerResult customerResult = (CustomerResult) obj;
            if (customerResult instanceof CustomerResult.Success) {
                IndicatorsLoginsEntity indicatorsLoginsEntity = (IndicatorsLoginsEntity) ((CustomerResult.Success) customerResult).getValue();
                this.f33437p0 = 2;
                if (GetCustomerLoginsUseCase.access$handleGetCustomerIndicators(getCustomerLoginsUseCase, indicatorsLoginsEntity, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else if (customerResult instanceof CustomerResult.Failure) {
                Throwable th2 = (Throwable) customerResult.getErrorOrNull();
                this.f33437p0 = 3;
                if (getCustomerLoginsUseCase.a(th2, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: GetCustomerLoginsUseCase.kt */
    @DebugMetadata(c = "com.bbva.glomohybrid.login.domain.usecase.GetCustomerLoginsUseCase$fireError$2", f = "GetCustomerLoginsUseCase.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class c extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ Exception f33439p0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Exception exc, Continuation<? super c> continuation) {
            super(2, continuation);
            this.f33439p0 = exc;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new c(this.f33439p0, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((c) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            ek.a.getCOROUTINE_SUSPENDED();
            ResultKt.throwOnFailure(obj);
            CellsReactor.fire(CustomerDataManager.ID, CustomerDataManager.ACTION_GET_CUSTOMER_ERROR, this.f33439p0);
            return Unit.INSTANCE;
        }
    }

    public GetCustomerLoginsUseCase(@NotNull CustomerDataManager customerDataManager, @NotNull ThreadDispatchers dispatcher) {
        Intrinsics.checkNotNullParameter(customerDataManager, "customerDataManager");
        Intrinsics.checkNotNullParameter(dispatcher, "dispatcher");
        this.f33431a = customerDataManager;
        this.f33432b = dispatcher;
        this.f33433c = q.emptyMap();
    }

    public static final Object access$fireSuccess(GetCustomerLoginsUseCase getCustomerLoginsUseCase, CustomerIndicatorsLogins customerIndicatorsLogins, Continuation continuation) {
        Object objWithContext = BuildersKt.withContext(getCustomerLoginsUseCase.f33432b.main(), new r9.a(customerIndicatorsLogins, null), continuation);
        return objWithContext == ek.a.getCOROUTINE_SUSPENDED() ? objWithContext : Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    public static final Object access$handleGetCustomerIndicators(GetCustomerLoginsUseCase getCustomerLoginsUseCase, IndicatorsLoginsEntity indicatorsLoginsEntity, Continuation continuation) {
        r9.b bVar;
        IndicatorsDataLogins data;
        getCustomerLoginsUseCase.getClass();
        if (continuation instanceof r9.b) {
            bVar = (r9.b) continuation;
            int i10 = bVar.f92971t0;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                bVar.f92971t0 = i10 - Integer.MIN_VALUE;
            } else {
                bVar = new r9.b(getCustomerLoginsUseCase, continuation);
            }
        } else {
            bVar = new r9.b(getCustomerLoginsUseCase, continuation);
        }
        Object customerLogins = bVar.f92969r0;
        Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
        int i11 = bVar.f92971t0;
        if (i11 != 0) {
            if (i11 == 1) {
                IndicatorsDataLogins indicatorsDataLogins = bVar.f92968q0;
                GetCustomerLoginsUseCase getCustomerLoginsUseCase2 = bVar.f92967p0;
                ResultKt.throwOnFailure(customerLogins);
                data = indicatorsDataLogins;
                getCustomerLoginsUseCase = getCustomerLoginsUseCase2;
            } else {
                if (i11 != 2 && i11 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(customerLogins);
            }
            return Unit.INSTANCE;
        }
        ResultKt.throwOnFailure(customerLogins);
        data = indicatorsLoginsEntity.getData();
        String customerIdGlobal = data.getCustomerIdGlobal();
        bVar.f92967p0 = getCustomerLoginsUseCase;
        bVar.f92968q0 = data;
        bVar.f92971t0 = 1;
        customerLogins = getCustomerLoginsUseCase.f33431a.getCustomerLogins(customerIdGlobal, bVar);
        if (customerLogins == coroutine_suspended) {
            return coroutine_suspended;
        }
        CustomerResult customerResult = (CustomerResult) customerLogins;
        if (customerResult instanceof CustomerResult.Success) {
            Customer customer = (Customer) ((CustomerResult.Success) customerResult).getValue();
            bVar.f92967p0 = null;
            bVar.f92968q0 = null;
            bVar.f92971t0 = 2;
            getCustomerLoginsUseCase.getClass();
            getCustomerLoginsUseCase.f33433c = customer.getMap();
            Object objWithContext = BuildersKt.withContext(getCustomerLoginsUseCase.f33432b.io(), new r9.c(getCustomerLoginsUseCase, customer, data, null), bVar);
            if (objWithContext != ek.a.getCOROUTINE_SUSPENDED()) {
                objWithContext = Unit.INSTANCE;
            }
            if (objWithContext == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else if (customerResult instanceof CustomerResult.Failure) {
            Throwable th2 = (Throwable) customerResult.getErrorOrNull();
            bVar.f92967p0 = null;
            bVar.f92968q0 = null;
            bVar.f92971t0 = 3;
            if (getCustomerLoginsUseCase.a(th2, bVar) == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        return Unit.INSTANCE;
    }

    public static final Object access$handleGetCustomerLogins(GetCustomerLoginsUseCase getCustomerLoginsUseCase, Customer customer, IndicatorsDataLogins indicatorsDataLogins, Continuation continuation) {
        getCustomerLoginsUseCase.getClass();
        getCustomerLoginsUseCase.f33433c = customer.getMap();
        Object objWithContext = BuildersKt.withContext(getCustomerLoginsUseCase.f33432b.io(), new r9.c(getCustomerLoginsUseCase, customer, indicatorsDataLogins, null), continuation);
        return objWithContext == ek.a.getCOROUTINE_SUSPENDED() ? objWithContext : Unit.INSTANCE;
    }

    public final Object a(Throwable th2, Continuation<? super Unit> continuation) {
        Exception exc = th2 instanceof Exception ? (Exception) th2 : null;
        if (exc == null) {
            exc = new Exception(th2);
        }
        Object objWithContext = BuildersKt.withContext(this.f33432b.main(), new c(exc, null), continuation);
        return objWithContext == ek.a.getCOROUTINE_SUSPENDED() ? objWithContext : Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.bbva.glomoutils.usecase.SuspendUseCase
    @Nullable
    public Object execute(@NotNull Continuation<? super Unit> continuation) {
        a aVar;
        if (continuation instanceof a) {
            aVar = (a) continuation;
            int i10 = aVar.f33436r0;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                aVar.f33436r0 = i10 - Integer.MIN_VALUE;
            } else {
                aVar = new a(continuation);
            }
        } else {
            aVar = new a(continuation);
        }
        Object obj = aVar.f33434p0;
        Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
        int i11 = aVar.f33436r0;
        if (i11 == 0) {
            ResultKt.throwOnFailure(obj);
            CoroutineDispatcher coroutineDispatcherIo = this.f33432b.io();
            b bVar = new b(null);
            aVar.f33436r0 = 1;
            if (BuildersKt.withContext(coroutineDispatcherIo, bVar, aVar) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ GetCustomerLoginsUseCase(CustomerDataManager customerDataManager, ThreadDispatchers threadDispatchers, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(customerDataManager, (i10 & 2) != 0 ? new DefaultThreadDispatchers() : threadDispatchers);
    }
}

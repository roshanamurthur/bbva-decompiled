package com.bbva.component.dm.customer;

import com.bbva.cells.component.kit.datamanager.DataManager;
import com.bbva.cells.component.kit.datamanager.domain.usecase.UseCase;
import com.bbva.cells.component.kit.model.ActionSpec;
import com.bbva.component.dm.customer.CustomerDataManager;
import com.bbva.component.dm.customer.di.DefaultFactory;
import com.bbva.component.dm.customer.di.Factory;
import com.bbva.component.dm.customer.domain.model.Customer;
import com.bbva.component.dm.customer.domain.model.CustomerResult;
import com.bbva.component.dm.customer.domain.model.CustomerServiceType;
import com.bbva.component.dm.customer.domain.model.Indicators;
import com.bbva.component.dm.customer.domain.model.IndicatorsLoginsEntity;
import com.bbva.component.request.header.customerid.CustomerIdInterceptor;
import com.bbva.network.NetworkWorker;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.SafeContinuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: CustomerDataManager.kt */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 ,2\u00020\u0001:\u0001,B\u000f\u0012\u0006\u0010)\u001a\u00020(¢\u0006\u0004\b*\u0010+J\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004J\u001f\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007H\u0086@ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000bJ'\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\t0\u00072\u0006\u0010\u0005\u001a\u00020\u0004H\u0086@ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000eJ\u0006\u0010\u000f\u001a\u00020\u0002J\u001f\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u000bJ\u0012\u0010\u0011\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004J)\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u00072\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u000eJ\u000e\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004J'\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\t0\u00072\u0006\u0010\u0005\u001a\u00020\u0004H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0015\u0010\u000eJ\b\u0010\u0016\u001a\u00020\u0004H\u0016J\b\u0010\u0017\u001a\u00020\u0002H\u0014R0\u0010\u001a\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00190\u00188\u0000@\u0000X\u0080.¢\u0006\u0012\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\"\u0010'\u001a\u00020 8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006-"}, d2 = {"Lcom/bbva/component/dm/customer/CustomerDataManager;", "Lcom/bbva/cells/component/kit/datamanager/DataManager;", "", "fetchCustomer", "", CustomerIdInterceptor.FAKE_CUSTOMER_ID, "fetchIndicators", "Lcom/bbva/component/dm/customer/domain/model/CustomerResult;", "Lcom/bbva/component/dm/customer/domain/model/Customer;", "", "getCustomer", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/bbva/component/dm/customer/domain/model/Indicators;", "getIndicators", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "fetchCustomerWithIndicators", "getCustomerWithIndicators", "fetchCustomerLogins", "getCustomerLogins", "fetchCustomerIndicators", "Lcom/bbva/component/dm/customer/domain/model/IndicatorsLoginsEntity;", "getCustomerIndicators", "getId", "onPropertiesBound", "", "", "config", "Ljava/util/Map;", "getConfig$component_dm_customer_release", "()Ljava/util/Map;", "setConfig$component_dm_customer_release", "(Ljava/util/Map;)V", "Lcom/bbva/component/dm/customer/di/Factory;", "v0", "Lcom/bbva/component/dm/customer/di/Factory;", "getFactory$component_dm_customer_release", "()Lcom/bbva/component/dm/customer/di/Factory;", "setFactory$component_dm_customer_release", "(Lcom/bbva/component/dm/customer/di/Factory;)V", "factory", "Lcom/bbva/network/NetworkWorker;", "networkWorker", "<init>", "(Lcom/bbva/network/NetworkWorker;)V", "Companion", "component-dm-customer_release"}, k = 1, mv = {1, 9, 0})
public final class CustomerDataManager extends DataManager {

    @NotNull
    public static final String ID = "component-dm-customer";
    public Map<String, ? extends Object> config;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    @NotNull
    public final NetworkWorker f27537p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public UseCase<Customer, String> f27538q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public UseCase<Customer, String> f27539r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public UseCase<Indicators, String> f27540s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public UseCase<IndicatorsLoginsEntity, String> f27541t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public UseCase<Customer, Unit> f27542u0;

    /* JADX INFO: renamed from: v0, reason: from kotlin metadata */
    @NotNull
    public Factory factory;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @JvmField
    @NotNull
    public static final ActionSpec<Customer> ACTION_GET_CUSTOMER_SUCCESS = new ActionSpec<>("get-customer-success");

    @JvmField
    @NotNull
    public static final ActionSpec<Exception> ACTION_GET_CUSTOMER_ERROR = new ActionSpec<>("get-customer-error");

    @JvmField
    @NotNull
    public static final ActionSpec<Indicators> ACTION_GET_INDICATORS_SUCCESS = new ActionSpec<>("get-indicators-success");

    @JvmField
    @NotNull
    public static final ActionSpec<IndicatorsLoginsEntity> ACTION_GET_CUSTOMER_INDICATORS_SUCCESS = new ActionSpec<>("get-indicators-success");

    @JvmField
    @NotNull
    public static final ActionSpec<Exception> ACTION_GET_INDICATORS_ERROR = new ActionSpec<>("get-indicators-error");

    /* JADX INFO: compiled from: CustomerDataManager.kt */
    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u001a\u0010\u0003\u001a\f\u0012\b\u0012\u00060\u0005j\u0002`\u00060\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u000b\u001a\f\u0012\b\u0012\u00060\u0005j\u0002`\u00060\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lcom/bbva/component/dm/customer/CustomerDataManager$Companion;", "", "()V", "ACTION_GET_CUSTOMER_ERROR", "Lcom/bbva/cells/component/kit/model/ActionSpec;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "ACTION_GET_CUSTOMER_INDICATORS_SUCCESS", "Lcom/bbva/component/dm/customer/domain/model/IndicatorsLoginsEntity;", "ACTION_GET_CUSTOMER_SUCCESS", "Lcom/bbva/component/dm/customer/domain/model/Customer;", "ACTION_GET_INDICATORS_ERROR", "ACTION_GET_INDICATORS_SUCCESS", "Lcom/bbva/component/dm/customer/domain/model/Indicators;", "ID", "", "component-dm-customer_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX INFO: compiled from: CustomerDataManager.kt */
    public static final class a<T> implements UseCase.UseCaseSuccessCallback {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Continuation<CustomerResult<Customer, ? extends Throwable>> f27543a;

        public a(SafeContinuation safeContinuation) {
            this.f27543a = safeContinuation;
        }

        @Override // com.bbva.cells.component.kit.datamanager.domain.usecase.UseCase.UseCaseSuccessCallback
        public final void onUseCaseComplete(Object obj) {
            Result.Companion companion = Result.INSTANCE;
            this.f27543a.resumeWith(Result.m5535constructorimpl(new CustomerResult.Success((Customer) obj)));
        }
    }

    /* JADX INFO: compiled from: CustomerDataManager.kt */
    public static final class b implements UseCase.UseCaseErrorCallback {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Continuation<CustomerResult<Customer, ? extends Throwable>> f27544a;

        public b(SafeContinuation safeContinuation) {
            this.f27544a = safeContinuation;
        }

        @Override // com.bbva.cells.component.kit.datamanager.domain.usecase.UseCase.UseCaseErrorCallback
        public final void onUseCaseError(Throwable th2) {
            Result.Companion companion = Result.INSTANCE;
            this.f27544a.resumeWith(Result.m5535constructorimpl(new CustomerResult.Failure(th2)));
        }
    }

    /* JADX INFO: compiled from: CustomerDataManager.kt */
    public static final class c<T> implements UseCase.UseCaseSuccessCallback {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Continuation<CustomerResult<IndicatorsLoginsEntity, ? extends Throwable>> f27545a;

        public c(SafeContinuation safeContinuation) {
            this.f27545a = safeContinuation;
        }

        @Override // com.bbva.cells.component.kit.datamanager.domain.usecase.UseCase.UseCaseSuccessCallback
        public final void onUseCaseComplete(Object obj) {
            Result.Companion companion = Result.INSTANCE;
            this.f27545a.resumeWith(Result.m5535constructorimpl(new CustomerResult.Success((IndicatorsLoginsEntity) obj)));
        }
    }

    /* JADX INFO: compiled from: CustomerDataManager.kt */
    public static final class d implements UseCase.UseCaseErrorCallback {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Continuation<CustomerResult<IndicatorsLoginsEntity, ? extends Throwable>> f27546a;

        public d(SafeContinuation safeContinuation) {
            this.f27546a = safeContinuation;
        }

        @Override // com.bbva.cells.component.kit.datamanager.domain.usecase.UseCase.UseCaseErrorCallback
        public final void onUseCaseError(Throwable th2) {
            Result.Companion companion = Result.INSTANCE;
            this.f27546a.resumeWith(Result.m5535constructorimpl(new CustomerResult.Failure(th2)));
        }
    }

    /* JADX INFO: compiled from: CustomerDataManager.kt */
    public static final class e<T> implements UseCase.UseCaseSuccessCallback {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Continuation<CustomerResult<Customer, ? extends Throwable>> f27547a;

        public e(SafeContinuation safeContinuation) {
            this.f27547a = safeContinuation;
        }

        @Override // com.bbva.cells.component.kit.datamanager.domain.usecase.UseCase.UseCaseSuccessCallback
        public final void onUseCaseComplete(Object obj) {
            Result.Companion companion = Result.INSTANCE;
            this.f27547a.resumeWith(Result.m5535constructorimpl(new CustomerResult.Success((Customer) obj)));
        }
    }

    /* JADX INFO: compiled from: CustomerDataManager.kt */
    public static final class f implements UseCase.UseCaseErrorCallback {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Continuation<CustomerResult<Customer, ? extends Throwable>> f27548a;

        public f(SafeContinuation safeContinuation) {
            this.f27548a = safeContinuation;
        }

        @Override // com.bbva.cells.component.kit.datamanager.domain.usecase.UseCase.UseCaseErrorCallback
        public final void onUseCaseError(Throwable th2) {
            Result.Companion companion = Result.INSTANCE;
            this.f27548a.resumeWith(Result.m5535constructorimpl(new CustomerResult.Failure(th2)));
        }
    }

    /* JADX INFO: compiled from: CustomerDataManager.kt */
    public static final class g<T> implements UseCase.UseCaseSuccessCallback {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Continuation<CustomerResult<Customer, ? extends Throwable>> f27549a;

        public g(SafeContinuation safeContinuation) {
            this.f27549a = safeContinuation;
        }

        @Override // com.bbva.cells.component.kit.datamanager.domain.usecase.UseCase.UseCaseSuccessCallback
        public final void onUseCaseComplete(Object obj) {
            Result.Companion companion = Result.INSTANCE;
            this.f27549a.resumeWith(Result.m5535constructorimpl(new CustomerResult.Success((Customer) obj)));
        }
    }

    /* JADX INFO: compiled from: CustomerDataManager.kt */
    public static final class h implements UseCase.UseCaseErrorCallback {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Continuation<CustomerResult<Customer, ? extends Throwable>> f27550a;

        public h(SafeContinuation safeContinuation) {
            this.f27550a = safeContinuation;
        }

        @Override // com.bbva.cells.component.kit.datamanager.domain.usecase.UseCase.UseCaseErrorCallback
        public final void onUseCaseError(Throwable th2) {
            Result.Companion companion = Result.INSTANCE;
            this.f27550a.resumeWith(Result.m5535constructorimpl(new CustomerResult.Failure(th2)));
        }
    }

    /* JADX INFO: compiled from: CustomerDataManager.kt */
    public static final class i<T> implements UseCase.UseCaseSuccessCallback {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Continuation<CustomerResult<Indicators, ? extends Throwable>> f27551a;

        public i(SafeContinuation safeContinuation) {
            this.f27551a = safeContinuation;
        }

        @Override // com.bbva.cells.component.kit.datamanager.domain.usecase.UseCase.UseCaseSuccessCallback
        public final void onUseCaseComplete(Object obj) {
            Result.Companion companion = Result.INSTANCE;
            this.f27551a.resumeWith(Result.m5535constructorimpl(new CustomerResult.Success((Indicators) obj)));
        }
    }

    /* JADX INFO: compiled from: CustomerDataManager.kt */
    public static final class j implements UseCase.UseCaseErrorCallback {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Continuation<CustomerResult<Indicators, ? extends Throwable>> f27552a;

        public j(SafeContinuation safeContinuation) {
            this.f27552a = safeContinuation;
        }

        @Override // com.bbva.cells.component.kit.datamanager.domain.usecase.UseCase.UseCaseErrorCallback
        public final void onUseCaseError(Throwable th2) {
            Result.Companion companion = Result.INSTANCE;
            this.f27552a.resumeWith(Result.m5535constructorimpl(new CustomerResult.Failure(th2)));
        }
    }

    public CustomerDataManager(@NotNull NetworkWorker networkWorker) {
        Intrinsics.checkNotNullParameter(networkWorker, "networkWorker");
        this.f27537p0 = networkWorker;
        this.factory = new DefaultFactory();
        newProperty("config", new y4.g(this, 0));
    }

    public static /* synthetic */ void fetchCustomerLogins$default(CustomerDataManager customerDataManager, String str, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = null;
        }
        customerDataManager.fetchCustomerLogins(str);
    }

    public final void fetchCustomer() {
        UseCase<Customer, String> useCase = this.f27538q0;
        if (useCase == null) {
            Intrinsics.throwUninitializedPropertyAccessException("getCustomerUseCase");
            useCase = null;
        }
        useCase.execute(null, new UseCase.UseCaseSuccessCallback() { // from class: y4.e
            @Override // com.bbva.cells.component.kit.datamanager.domain.usecase.UseCase.UseCaseSuccessCallback
            public final void onUseCaseComplete(Object obj) {
                CustomerDataManager.Companion companion = CustomerDataManager.INSTANCE;
                CustomerDataManager this$0 = this.f94749a;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                this$0.fire(CustomerDataManager.ACTION_GET_CUSTOMER_SUCCESS, (Customer) obj);
            }
        }, new UseCase.UseCaseErrorCallback() { // from class: y4.f
            @Override // com.bbva.cells.component.kit.datamanager.domain.usecase.UseCase.UseCaseErrorCallback
            public final void onUseCaseError(Throwable th2) {
                CustomerDataManager.Companion companion = CustomerDataManager.INSTANCE;
                CustomerDataManager this$0 = this.f94750a;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                ActionSpec<Exception> actionSpec = CustomerDataManager.ACTION_GET_CUSTOMER_ERROR;
                Exception exc = th2 instanceof Exception ? (Exception) th2 : null;
                if (exc == null) {
                    exc = new Exception(th2);
                }
                this$0.fire(actionSpec, exc);
            }
        });
    }

    public final void fetchCustomerIndicators(@NotNull String customerId) {
        Intrinsics.checkNotNullParameter(customerId, "customerId");
        UseCase<IndicatorsLoginsEntity, String> useCase = this.f27541t0;
        if (useCase == null) {
            Intrinsics.throwUninitializedPropertyAccessException("getCustomerIndicatorUseCase");
            useCase = null;
        }
        int i10 = 1;
        useCase.execute(customerId, new o4.d(this, i10), new o4.e(this, i10));
    }

    public final void fetchCustomerLogins(@Nullable String customerId) {
        UseCase<Customer, String> useCase = this.f27539r0;
        if (useCase == null) {
            Intrinsics.throwUninitializedPropertyAccessException("getCustomerLoginsUseCase");
            useCase = null;
        }
        int i10 = 0;
        useCase.execute(customerId, new y4.a(this, i10), new y4.b(this, i10));
    }

    public final void fetchCustomerWithIndicators() {
        UseCase<Customer, Unit> useCase = this.f27542u0;
        if (useCase == null) {
            Intrinsics.throwUninitializedPropertyAccessException("getCustomerIndicatorsUseCase");
            useCase = null;
        }
        useCase.execute(null, new UseCase.UseCaseSuccessCallback() { // from class: y4.c
            @Override // com.bbva.cells.component.kit.datamanager.domain.usecase.UseCase.UseCaseSuccessCallback
            public final void onUseCaseComplete(Object obj) {
                CustomerDataManager.Companion companion = CustomerDataManager.INSTANCE;
                CustomerDataManager this$0 = this.f94747a;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                this$0.fire(CustomerDataManager.ACTION_GET_CUSTOMER_SUCCESS, (Customer) obj);
            }
        }, new UseCase.UseCaseErrorCallback() { // from class: y4.d
            @Override // com.bbva.cells.component.kit.datamanager.domain.usecase.UseCase.UseCaseErrorCallback
            public final void onUseCaseError(Throwable th2) {
                CustomerDataManager.Companion companion = CustomerDataManager.INSTANCE;
                CustomerDataManager this$0 = this.f94748a;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                ActionSpec<Exception> actionSpec = CustomerDataManager.ACTION_GET_CUSTOMER_ERROR;
                Exception exc = th2 instanceof Exception ? (Exception) th2 : null;
                if (exc == null) {
                    exc = new Exception(th2);
                }
                this$0.fire(actionSpec, exc);
            }
        });
    }

    public final void fetchIndicators(@NotNull String customerId) {
        Intrinsics.checkNotNullParameter(customerId, "customerId");
        UseCase<Indicators, String> useCase = this.f27540s0;
        if (useCase == null) {
            Intrinsics.throwUninitializedPropertyAccessException("getIndicatorsUseCase");
            useCase = null;
        }
        int i10 = 1;
        useCase.execute(customerId, new o4.b(this, i10), new o4.c(this, i10));
    }

    @NotNull
    public final Map<String, Object> getConfig$component_dm_customer_release() {
        Map<String, ? extends Object> map = this.config;
        if (map != null) {
            return map;
        }
        Intrinsics.throwUninitializedPropertyAccessException("config");
        return null;
    }

    @Nullable
    public final Object getCustomer(@NotNull Continuation<? super CustomerResult<Customer, ? extends Throwable>> continuation) {
        SafeContinuation safeContinuation = new SafeContinuation(IntrinsicsKt__IntrinsicsJvmKt.intercepted(continuation));
        UseCase<Customer, String> useCase = this.f27538q0;
        if (useCase == null) {
            Intrinsics.throwUninitializedPropertyAccessException("getCustomerUseCase");
            useCase = null;
        }
        useCase.execute(null, new a(safeContinuation), new b(safeContinuation));
        Object orThrow = safeContinuation.getOrThrow();
        if (orThrow == ek.a.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return orThrow;
    }

    @Nullable
    public final Object getCustomerIndicators(@NotNull String str, @NotNull Continuation<? super CustomerResult<IndicatorsLoginsEntity, ? extends Throwable>> continuation) {
        SafeContinuation safeContinuation = new SafeContinuation(IntrinsicsKt__IntrinsicsJvmKt.intercepted(continuation));
        UseCase<IndicatorsLoginsEntity, String> useCase = this.f27541t0;
        if (useCase == null) {
            Intrinsics.throwUninitializedPropertyAccessException("getCustomerIndicatorUseCase");
            useCase = null;
        }
        useCase.execute(str, new c(safeContinuation), new d(safeContinuation));
        Object orThrow = safeContinuation.getOrThrow();
        if (orThrow == ek.a.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return orThrow;
    }

    @Nullable
    public final Object getCustomerLogins(@Nullable String str, @NotNull Continuation<? super CustomerResult<Customer, ? extends Throwable>> continuation) {
        SafeContinuation safeContinuation = new SafeContinuation(IntrinsicsKt__IntrinsicsJvmKt.intercepted(continuation));
        UseCase<Customer, String> useCase = this.f27539r0;
        if (useCase == null) {
            Intrinsics.throwUninitializedPropertyAccessException("getCustomerLoginsUseCase");
            useCase = null;
        }
        useCase.execute(str, new e(safeContinuation), new f(safeContinuation));
        Object orThrow = safeContinuation.getOrThrow();
        if (orThrow == ek.a.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return orThrow;
    }

    @Nullable
    public final Object getCustomerWithIndicators(@NotNull Continuation<? super CustomerResult<Customer, ? extends Throwable>> continuation) {
        SafeContinuation safeContinuation = new SafeContinuation(IntrinsicsKt__IntrinsicsJvmKt.intercepted(continuation));
        UseCase<Customer, Unit> useCase = this.f27542u0;
        if (useCase == null) {
            Intrinsics.throwUninitializedPropertyAccessException("getCustomerIndicatorsUseCase");
            useCase = null;
        }
        useCase.execute(null, new g(safeContinuation), new h(safeContinuation));
        Object orThrow = safeContinuation.getOrThrow();
        if (orThrow == ek.a.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return orThrow;
    }

    @NotNull
    /* JADX INFO: renamed from: getFactory$component_dm_customer_release, reason: from getter */
    public final Factory getFactory() {
        return this.factory;
    }

    @Override // com.bbva.cells.component.kit.common.Component
    @NotNull
    /* JADX INFO: renamed from: getId */
    public String getF28076q0() {
        return ID;
    }

    @Nullable
    public final Object getIndicators(@NotNull String str, @NotNull Continuation<? super CustomerResult<Indicators, ? extends Throwable>> continuation) {
        SafeContinuation safeContinuation = new SafeContinuation(IntrinsicsKt__IntrinsicsJvmKt.intercepted(continuation));
        UseCase<Indicators, String> useCase = this.f27540s0;
        if (useCase == null) {
            Intrinsics.throwUninitializedPropertyAccessException("getIndicatorsUseCase");
            useCase = null;
        }
        useCase.execute(str, new i(safeContinuation), new j(safeContinuation));
        Object orThrow = safeContinuation.getOrThrow();
        if (orThrow == ek.a.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return orThrow;
    }

    @Override // com.bbva.cells.component.kit.common.ReactiveComponent
    public void onPropertiesBound() {
        super.onPropertiesBound();
        Factory factory = this.factory;
        CustomerConfig customerConfig = new CustomerConfig(getConfig$component_dm_customer_release());
        CustomerServiceType.Default r3 = CustomerServiceType.Default.INSTANCE;
        NetworkWorker networkWorker = this.f27537p0;
        this.f27538q0 = factory.getCustomerUseCase(networkWorker, customerConfig, r3);
        Factory factory2 = this.factory;
        CustomerConfig customerConfig2 = new CustomerConfig(getConfig$component_dm_customer_release());
        CustomerServiceType.Logins logins = CustomerServiceType.Logins.INSTANCE;
        this.f27539r0 = factory2.getCustomerUseCase(networkWorker, customerConfig2, logins);
        UseCase indicatorsUseCase = this.factory.getIndicatorsUseCase(networkWorker, new CustomerConfig(getConfig$component_dm_customer_release()), r3);
        Intrinsics.checkNotNull(indicatorsUseCase, "null cannot be cast to non-null type com.bbva.cells.component.kit.datamanager.domain.usecase.UseCase<com.bbva.component.dm.customer.domain.model.Indicators, kotlin.String>");
        this.f27540s0 = indicatorsUseCase;
        this.f27542u0 = this.factory.getCustomerWithIndicatorsUseCase(networkWorker, new CustomerConfig(getConfig$component_dm_customer_release()), logins);
        UseCase indicatorsUseCase2 = this.factory.getIndicatorsUseCase(networkWorker, new CustomerConfig(getConfig$component_dm_customer_release()), logins);
        Intrinsics.checkNotNull(indicatorsUseCase2, "null cannot be cast to non-null type com.bbva.cells.component.kit.datamanager.domain.usecase.UseCase<com.bbva.component.dm.customer.domain.model.IndicatorsLoginsEntity, kotlin.String>");
        this.f27541t0 = indicatorsUseCase2;
    }

    public final void setConfig$component_dm_customer_release(@NotNull Map<String, ? extends Object> map) {
        Intrinsics.checkNotNullParameter(map, "<set-?>");
        this.config = map;
    }

    public final void setFactory$component_dm_customer_release(@NotNull Factory factory) {
        Intrinsics.checkNotNullParameter(factory, "<set-?>");
        this.factory = factory;
    }
}

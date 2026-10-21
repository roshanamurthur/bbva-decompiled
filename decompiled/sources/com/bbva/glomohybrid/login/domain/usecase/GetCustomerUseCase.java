package com.bbva.glomohybrid.login.domain.usecase;

import com.bbva.component.dm.customer.CustomerDataManager;
import com.bbva.component.dm.settings.AppSettingsResultExtensionsKt;
import com.bbva.component.dm.settings.repository.AppSettingsRepository;
import com.bbva.component.dm.settings.repository.SettingsPolicy;
import com.bbva.glomo.user.repository.datasource.RememberedUserDataSource;
import com.bbva.glomo.user.repository.datasource.UserLoginDataSource;
import com.bbva.glomoutils.scheduler.DefaultThreadDispatchers;
import com.bbva.glomoutils.scheduler.ThreadDispatchers;
import com.bbva.glomoutils.usecase.SuspendUseCase;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: GetCustomerUseCase.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B1\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u0013\u0010\u0003\u001a\u00020\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0003\u0010\u0004J\u0013\u0010\u0006\u001a\u00020\u0005H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0004\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0013"}, d2 = {"Lcom/bbva/glomohybrid/login/domain/usecase/GetCustomerUseCase;", "Lcom/bbva/glomoutils/usecase/SuspendUseCase;", "", "execute", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "isActiveCustomerLogins", "Lcom/bbva/component/dm/customer/CustomerDataManager;", "customerDataManager", "Lcom/bbva/component/dm/settings/repository/AppSettingsRepository;", "settings", "Lcom/bbva/glomo/user/repository/datasource/UserLoginDataSource;", "userLoginDataSource", "Lcom/bbva/glomo/user/repository/datasource/RememberedUserDataSource;", "rememberedUserDataSource", "Lcom/bbva/glomoutils/scheduler/ThreadDispatchers;", "dispatcher", "<init>", "(Lcom/bbva/component/dm/customer/CustomerDataManager;Lcom/bbva/component/dm/settings/repository/AppSettingsRepository;Lcom/bbva/glomo/user/repository/datasource/UserLoginDataSource;Lcom/bbva/glomo/user/repository/datasource/RememberedUserDataSource;Lcom/bbva/glomoutils/scheduler/ThreadDispatchers;)V", "Login_mexicoGoogleRelease"}, k = 1, mv = {1, 9, 0})
public final class GetCustomerUseCase implements SuspendUseCase<Unit> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final CustomerDataManager f33440a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final AppSettingsRepository f33441b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final UserLoginDataSource f33442c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final RememberedUserDataSource f33443d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final ThreadDispatchers f33444e;

    /* JADX INFO: compiled from: GetCustomerUseCase.kt */
    @DebugMetadata(c = "com.bbva.glomohybrid.login.domain.usecase.GetCustomerUseCase", f = "GetCustomerUseCase.kt", i = {}, l = {23}, m = "execute", n = {}, s = {})
    public static final class a extends ContinuationImpl {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public /* synthetic */ Object f33445p0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public int f33447r0;

        public a(Continuation<? super a> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f33445p0 = obj;
            this.f33447r0 |= Integer.MIN_VALUE;
            return GetCustomerUseCase.this.execute(this);
        }
    }

    /* JADX INFO: compiled from: GetCustomerUseCase.kt */
    @DebugMetadata(c = "com.bbva.glomohybrid.login.domain.usecase.GetCustomerUseCase$execute$2", f = "GetCustomerUseCase.kt", i = {}, l = {24, 30}, m = "invokeSuspend", n = {}, s = {})
    public static final class b extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public int f33448p0;

        public b(Continuation<? super b> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return GetCustomerUseCase.this.new b(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((b) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
            int i10 = this.f33448p0;
            GetCustomerUseCase getCustomerUseCase = GetCustomerUseCase.this;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.throwOnFailure(obj);
                } else {
                    if (i10 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            }
            ResultKt.throwOnFailure(obj);
            this.f33448p0 = 1;
            obj = getCustomerUseCase.isActiveCustomerLogins(this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
            boolean zBooleanValue = ((Boolean) obj).booleanValue();
            if (zBooleanValue) {
                GetCustomerUseCase.access$getCustomerLogins(getCustomerUseCase);
            } else if (!zBooleanValue) {
                GetCustomerUseCase.access$getListCustomer(getCustomerUseCase);
            }
            this.f33448p0 = 2;
            if (GetCustomerUseCase.access$persistStatusCustomerLogins(getCustomerUseCase, zBooleanValue, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return Unit.INSTANCE;
        }
    }

    public GetCustomerUseCase(@NotNull CustomerDataManager customerDataManager, @NotNull AppSettingsRepository settings, @NotNull UserLoginDataSource userLoginDataSource, @NotNull RememberedUserDataSource rememberedUserDataSource, @NotNull ThreadDispatchers dispatcher) {
        Intrinsics.checkNotNullParameter(customerDataManager, "customerDataManager");
        Intrinsics.checkNotNullParameter(settings, "settings");
        Intrinsics.checkNotNullParameter(userLoginDataSource, "userLoginDataSource");
        Intrinsics.checkNotNullParameter(rememberedUserDataSource, "rememberedUserDataSource");
        Intrinsics.checkNotNullParameter(dispatcher, "dispatcher");
        this.f33440a = customerDataManager;
        this.f33441b = settings;
        this.f33442c = userLoginDataSource;
        this.f33443d = rememberedUserDataSource;
        this.f33444e = dispatcher;
    }

    public static final void access$getCustomerLogins(GetCustomerUseCase getCustomerUseCase) {
        getCustomerUseCase.f33440a.fetchCustomerWithIndicators();
    }

    public static final void access$getListCustomer(GetCustomerUseCase getCustomerUseCase) {
        getCustomerUseCase.f33440a.fetchCustomer();
    }

    public static final Object access$persistStatusCustomerLogins(GetCustomerUseCase getCustomerUseCase, boolean z10, Continuation continuation) {
        getCustomerUseCase.f33442c.storeIsGlobalUser(z10);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.bbva.glomoutils.usecase.SuspendUseCase
    @Nullable
    public Object execute(@NotNull Continuation<? super Unit> continuation) {
        a aVar;
        if (continuation instanceof a) {
            aVar = (a) continuation;
            int i10 = aVar.f33447r0;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                aVar.f33447r0 = i10 - Integer.MIN_VALUE;
            } else {
                aVar = new a(continuation);
            }
        } else {
            aVar = new a(continuation);
        }
        Object obj = aVar.f33445p0;
        Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
        int i11 = aVar.f33447r0;
        if (i11 == 0) {
            ResultKt.throwOnFailure(obj);
            CoroutineDispatcher coroutineDispatcherIo = this.f33444e.io();
            b bVar = new b(null);
            aVar.f33447r0 = 1;
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

    @Nullable
    public final Object isActiveCustomerLogins(@NotNull Continuation<? super Boolean> continuation) {
        return Boxing.boxBoolean(AppSettingsResultExtensionsKt.isActiveCustomerLogins(this.f33441b.getSettings(SettingsPolicy.Local), this.f33443d.getDocument()));
    }

    public /* synthetic */ GetCustomerUseCase(CustomerDataManager customerDataManager, AppSettingsRepository appSettingsRepository, UserLoginDataSource userLoginDataSource, RememberedUserDataSource rememberedUserDataSource, ThreadDispatchers threadDispatchers, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(customerDataManager, appSettingsRepository, userLoginDataSource, rememberedUserDataSource, (i10 & 16) != 0 ? new DefaultThreadDispatchers() : threadDispatchers);
    }
}

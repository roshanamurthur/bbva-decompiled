package com.bbva.glomohybrid.login.presentation.viewmodel.handler;

import com.bbva.bridge.dispatcher.MessageDispatcher;
import com.bbva.glomo.user.domain.model.RememberedUser;
import com.bbva.glomo.user.domain.usecase.GetRememberedUserUseCase;
import com.bbva.glomohybrid.base.cells.channels.LoginChannels;
import com.bbva.glomohybrid.base.usecase.UseCaseConstants;
import com.bbva.glomohybrid.base.viewmodel.ViewModelComponentsProviders;
import com.bbva.glomohybrid.login.data.LoginFailureCounterDataStore;
import com.bbva.glomohybrid.login.data.MemoryFailureCounter;
import com.bbva.glomoutils.scheduler.DefaultThreadDispatchers;
import com.bbva.glomoutils.scheduler.ThreadDispatchers;
import com.bbva.glomoutils.usecase.SuspendUseCase;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.koin.core.component.KoinScopeComponent;
import org.koin.core.parameter.ParametersHolder;
import org.koin.core.parameter.ParametersHolderKt;
import org.koin.core.qualifier.QualifierKt;

/* JADX INFO: compiled from: GlobalLoginFailureCounterHandler.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u00102\u00020\u00012\u00020\u0002:\u0001\u0010B\u0019\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\b\u0002\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\b\u0010\u0004\u001a\u00020\u0003H\u0016J\b\u0010\u0005\u001a\u00020\u0003H\u0016R\u0014\u0010\t\u001a\u00020\u00068\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\u0011"}, d2 = {"Lcom/bbva/glomohybrid/login/presentation/viewmodel/handler/GlobalLoginFailureCounterHandler;", "Lcom/bbva/glomohybrid/login/presentation/viewmodel/handler/LoginFailureCounterHandler;", "Lkotlinx/coroutines/CoroutineScope;", "", "compute", "checkCounter", "Lkotlin/coroutines/CoroutineContext;", "getCoroutineContext", "()Lkotlin/coroutines/CoroutineContext;", "coroutineContext", "Lcom/bbva/glomohybrid/base/viewmodel/ViewModelComponentsProviders;", "provider", "Lcom/bbva/glomoutils/scheduler/ThreadDispatchers;", "dispatchers", "<init>", "(Lcom/bbva/glomohybrid/base/viewmodel/ViewModelComponentsProviders;Lcom/bbva/glomoutils/scheduler/ThreadDispatchers;)V", "Companion", "Login_mexicoGoogleRelease"}, k = 1, mv = {1, 9, 0})
@SourceDebugExtension({"SMAP\nGlobalLoginFailureCounterHandler.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GlobalLoginFailureCounterHandler.kt\ncom/bbva/glomohybrid/login/presentation/viewmodel/handler/GlobalLoginFailureCounterHandler\n+ 2 KoinExtensions.kt\ncom/bbva/glomoutils/koin/KoinExtensionsKt\n+ 3 Koin.kt\norg/koin/core/Koin\n+ 4 Scope.kt\norg/koin/core/scope/Scope\n*L\n1#1,127:1\n45#2:128\n120#3:129\n158#4:130\n*S KotlinDebug\n*F\n+ 1 GlobalLoginFailureCounterHandler.kt\ncom/bbva/glomohybrid/login/presentation/viewmodel/handler/GlobalLoginFailureCounterHandler\n*L\n114#1:128\n114#1:129\n114#1:130\n*E\n"})
public final class GlobalLoginFailureCounterHandler implements LoginFailureCounterHandler, CoroutineScope {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    @NotNull
    public final ViewModelComponentsProviders f33755p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    @NotNull
    public final ThreadDispatchers f33756q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final /* synthetic */ CoroutineScope f33757r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    @NotNull
    public final Lazy f33758s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    @NotNull
    public final Lazy f33759t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    @NotNull
    public final Lazy f33760u0;

    @NotNull
    public final Lazy v0;

    /* JADX INFO: compiled from: GlobalLoginFailureCounterHandler.kt */
    @DebugMetadata(c = "com.bbva.glomohybrid.login.presentation.viewmodel.handler.GlobalLoginFailureCounterHandler$checkCounter$1", f = "GlobalLoginFailureCounterHandler.kt", i = {}, l = {66}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public int f33761p0;

        public a(Continuation<? super a> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return GlobalLoginFailureCounterHandler.this.new a(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
            int i10 = this.f33761p0;
            if (i10 == 0) {
                ResultKt.throwOnFailure(obj);
                GlobalLoginFailureCounterHandler globalLoginFailureCounterHandler = GlobalLoginFailureCounterHandler.this;
                if (GlobalLoginFailureCounterHandler.access$allowComputeLoginFailures(globalLoginFailureCounterHandler)) {
                    this.f33761p0 = 1;
                    if (GlobalLoginFailureCounterHandler.access$computeCheckCounter(globalLoginFailureCounterHandler, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
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

    /* JADX INFO: compiled from: GlobalLoginFailureCounterHandler.kt */
    @DebugMetadata(c = "com.bbva.glomohybrid.login.presentation.viewmodel.handler.GlobalLoginFailureCounterHandler$compute$1", f = "GlobalLoginFailureCounterHandler.kt", i = {}, l = {51}, m = "invokeSuspend", n = {}, s = {})
    public static final class b extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public int f33763p0;

        public b(Continuation<? super b> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return GlobalLoginFailureCounterHandler.this.new b(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((b) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
            int i10 = this.f33763p0;
            if (i10 == 0) {
                ResultKt.throwOnFailure(obj);
                GlobalLoginFailureCounterHandler globalLoginFailureCounterHandler = GlobalLoginFailureCounterHandler.this;
                if (GlobalLoginFailureCounterHandler.access$allowComputeLoginFailures(globalLoginFailureCounterHandler)) {
                    this.f33763p0 = 1;
                    if (GlobalLoginFailureCounterHandler.access$computeLoginFailures(globalLoginFailureCounterHandler, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
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

    /* JADX INFO: compiled from: GlobalLoginFailureCounterHandler.kt */
    @DebugMetadata(c = "com.bbva.glomohybrid.login.presentation.viewmodel.handler.GlobalLoginFailureCounterHandler", f = "GlobalLoginFailureCounterHandler.kt", i = {}, l = {120}, m = "isSofTokenEnrolled", n = {}, s = {})
    public static final class c extends ContinuationImpl {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public /* synthetic */ Object f33765p0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public int f33767r0;

        public c(Continuation<? super c> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f33765p0 = obj;
            this.f33767r0 |= Integer.MIN_VALUE;
            return GlobalLoginFailureCounterHandler.this.a(this);
        }
    }

    /* JADX INFO: compiled from: GlobalLoginFailureCounterHandler.kt */
    public static final class d extends Lambda implements Function0<ParametersHolder> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ RememberedUser f33768p0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(RememberedUser rememberedUser) {
            super(0);
            this.f33768p0 = rememberedUser;
        }

        @Override // kotlin.jvm.functions.Function0
        public final ParametersHolder invoke() {
            return ParametersHolderKt.parametersOf(this.f33768p0);
        }
    }

    /* JADX INFO: compiled from: GlobalLoginFailureCounterHandler.kt */
    @SourceDebugExtension({"SMAP\nGlobalLoginFailureCounterHandler.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GlobalLoginFailureCounterHandler.kt\ncom/bbva/glomohybrid/login/presentation/viewmodel/handler/GlobalLoginFailureCounterHandler$loginFailureCounterDataStore$2\n+ 2 KoinComponent.kt\norg/koin/core/component/KoinComponentKt\n+ 3 Scope.kt\norg/koin/core/scope/Scope\n+ 4 Koin.kt\norg/koin/core/Koin\n*L\n1#1,127:1\n41#2,6:128\n47#2:135\n133#3:134\n107#4:136\n*S KotlinDebug\n*F\n+ 1 GlobalLoginFailureCounterHandler.kt\ncom/bbva/glomohybrid/login/presentation/viewmodel/handler/GlobalLoginFailureCounterHandler$loginFailureCounterDataStore$2\n*L\n28#1:128,6\n28#1:135\n28#1:134\n28#1:136\n*E\n"})
    public static final class e extends Lambda implements Function0<LoginFailureCounterDataStore> {
        public e() {
            super(0);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.jvm.functions.Function0
        public final LoginFailureCounterDataStore invoke() {
            ViewModelComponentsProviders viewModelComponentsProviders = GlobalLoginFailureCounterHandler.this.f33755p0;
            return (LoginFailureCounterDataStore) (viewModelComponentsProviders instanceof KoinScopeComponent ? ((KoinScopeComponent) viewModelComponentsProviders).getScope() : androidx.camera.core.impl.utils.c.f(viewModelComponentsProviders)).get(Reflection.getOrCreateKotlinClass(LoginFailureCounterDataStore.class), null, null);
        }
    }

    /* JADX INFO: compiled from: GlobalLoginFailureCounterHandler.kt */
    @SourceDebugExtension({"SMAP\nGlobalLoginFailureCounterHandler.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GlobalLoginFailureCounterHandler.kt\ncom/bbva/glomohybrid/login/presentation/viewmodel/handler/GlobalLoginFailureCounterHandler$memoryFailureCounter$2\n+ 2 KoinComponent.kt\norg/koin/core/component/KoinComponentKt\n+ 3 Scope.kt\norg/koin/core/scope/Scope\n+ 4 Koin.kt\norg/koin/core/Koin\n*L\n1#1,127:1\n41#2,6:128\n47#2:135\n133#3:134\n107#4:136\n*S KotlinDebug\n*F\n+ 1 GlobalLoginFailureCounterHandler.kt\ncom/bbva/glomohybrid/login/presentation/viewmodel/handler/GlobalLoginFailureCounterHandler$memoryFailureCounter$2\n*L\n32#1:128,6\n32#1:135\n32#1:134\n32#1:136\n*E\n"})
    public static final class f extends Lambda implements Function0<MemoryFailureCounter> {
        public f() {
            super(0);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.jvm.functions.Function0
        public final MemoryFailureCounter invoke() {
            ViewModelComponentsProviders viewModelComponentsProviders = GlobalLoginFailureCounterHandler.this.f33755p0;
            return (MemoryFailureCounter) (viewModelComponentsProviders instanceof KoinScopeComponent ? ((KoinScopeComponent) viewModelComponentsProviders).getScope() : androidx.camera.core.impl.utils.c.f(viewModelComponentsProviders)).get(Reflection.getOrCreateKotlinClass(MemoryFailureCounter.class), null, null);
        }
    }

    /* JADX INFO: compiled from: GlobalLoginFailureCounterHandler.kt */
    @SourceDebugExtension({"SMAP\nGlobalLoginFailureCounterHandler.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GlobalLoginFailureCounterHandler.kt\ncom/bbva/glomohybrid/login/presentation/viewmodel/handler/GlobalLoginFailureCounterHandler$messageDispatcher$2\n+ 2 KoinComponent.kt\norg/koin/core/component/KoinComponentKt\n+ 3 Scope.kt\norg/koin/core/scope/Scope\n+ 4 Koin.kt\norg/koin/core/Koin\n*L\n1#1,127:1\n41#2,6:128\n47#2:135\n133#3:134\n107#4:136\n*S KotlinDebug\n*F\n+ 1 GlobalLoginFailureCounterHandler.kt\ncom/bbva/glomohybrid/login/presentation/viewmodel/handler/GlobalLoginFailureCounterHandler$messageDispatcher$2\n*L\n36#1:128,6\n36#1:135\n36#1:134\n36#1:136\n*E\n"})
    public static final class g extends Lambda implements Function0<MessageDispatcher> {
        public g() {
            super(0);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.jvm.functions.Function0
        public final MessageDispatcher invoke() {
            ViewModelComponentsProviders viewModelComponentsProviders = GlobalLoginFailureCounterHandler.this.f33755p0;
            return (MessageDispatcher) (viewModelComponentsProviders instanceof KoinScopeComponent ? ((KoinScopeComponent) viewModelComponentsProviders).getScope() : androidx.camera.core.impl.utils.c.f(viewModelComponentsProviders)).get(Reflection.getOrCreateKotlinClass(MessageDispatcher.class), null, null);
        }
    }

    /* JADX INFO: compiled from: GlobalLoginFailureCounterHandler.kt */
    @SourceDebugExtension({"SMAP\nGlobalLoginFailureCounterHandler.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GlobalLoginFailureCounterHandler.kt\ncom/bbva/glomohybrid/login/presentation/viewmodel/handler/GlobalLoginFailureCounterHandler$rememberedUserUseCase$2\n+ 2 KoinComponent.kt\norg/koin/core/component/KoinComponentKt\n+ 3 Scope.kt\norg/koin/core/scope/Scope\n+ 4 Koin.kt\norg/koin/core/Koin\n*L\n1#1,127:1\n41#2,6:128\n47#2:135\n133#3:134\n107#4:136\n*S KotlinDebug\n*F\n+ 1 GlobalLoginFailureCounterHandler.kt\ncom/bbva/glomohybrid/login/presentation/viewmodel/handler/GlobalLoginFailureCounterHandler$rememberedUserUseCase$2\n*L\n40#1:128,6\n40#1:135\n40#1:134\n40#1:136\n*E\n"})
    public static final class h extends Lambda implements Function0<GetRememberedUserUseCase> {
        public h() {
            super(0);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.jvm.functions.Function0
        public final GetRememberedUserUseCase invoke() {
            ViewModelComponentsProviders viewModelComponentsProviders = GlobalLoginFailureCounterHandler.this.f33755p0;
            return (GetRememberedUserUseCase) (viewModelComponentsProviders instanceof KoinScopeComponent ? ((KoinScopeComponent) viewModelComponentsProviders).getScope() : androidx.camera.core.impl.utils.c.f(viewModelComponentsProviders)).get(Reflection.getOrCreateKotlinClass(GetRememberedUserUseCase.class), null, null);
        }
    }

    public GlobalLoginFailureCounterHandler(@NotNull ViewModelComponentsProviders provider, @NotNull ThreadDispatchers dispatchers) {
        Intrinsics.checkNotNullParameter(provider, "provider");
        Intrinsics.checkNotNullParameter(dispatchers, "dispatchers");
        this.f33755p0 = provider;
        this.f33756q0 = dispatchers;
        this.f33757r0 = CoroutineScopeKt.MainScope();
        this.f33758s0 = LazyKt__LazyJVMKt.lazy(new e());
        this.f33759t0 = LazyKt__LazyJVMKt.lazy(new f());
        this.f33760u0 = LazyKt__LazyJVMKt.lazy(new g());
        this.v0 = LazyKt__LazyJVMKt.lazy(new h());
    }

    public static final boolean access$allowComputeLoginFailures(GlobalLoginFailureCounterHandler globalLoginFailureCounterHandler) {
        return ((LoginFailureCounterDataStore) globalLoginFailureCounterHandler.f33758s0.getValue()).allowCountFailuresLogin();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    public static final Object access$computeCheckCounter(GlobalLoginFailureCounterHandler globalLoginFailureCounterHandler, Continuation continuation) {
        v9.a aVar;
        globalLoginFailureCounterHandler.getClass();
        if (continuation instanceof v9.a) {
            aVar = (v9.a) continuation;
            int i10 = aVar.f93989s0;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                aVar.f93989s0 = i10 - Integer.MIN_VALUE;
            } else {
                aVar = new v9.a(globalLoginFailureCounterHandler, continuation);
            }
        } else {
            aVar = new v9.a(globalLoginFailureCounterHandler, continuation);
        }
        Object objWithContext = aVar.f93987q0;
        Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
        int i11 = aVar.f93989s0;
        if (i11 == 0) {
            ResultKt.throwOnFailure(objWithContext);
            aVar.f93986p0 = globalLoginFailureCounterHandler;
            aVar.f93989s0 = 1;
            objWithContext = BuildersKt.withContext(globalLoginFailureCounterHandler.f33756q0.mo4923default(), new v9.c(globalLoginFailureCounterHandler, null), aVar);
            if (objWithContext == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            globalLoginFailureCounterHandler = aVar.f93986p0;
            ResultKt.throwOnFailure(objWithContext);
        }
        if (((Boolean) objWithContext).booleanValue()) {
            ((MessageDispatcher) globalLoginFailureCounterHandler.f33760u0.getValue()).sendMessage(LoginChannels.LOGIN_FAILURE_ATTEMPTS_MAX, Boolean.TRUE);
            ((MemoryFailureCounter) globalLoginFailureCounterHandler.f33759t0.getValue()).reset();
            ((LoginFailureCounterDataStore) globalLoginFailureCounterHandler.f33758s0.getValue()).reset();
        } else {
            ((MessageDispatcher) globalLoginFailureCounterHandler.f33760u0.getValue()).sendMessage(LoginChannels.LOGIN_FAILURE_ATTEMPTS_MAX, Boolean.FALSE);
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    public static final Object access$computeLoginFailures(GlobalLoginFailureCounterHandler globalLoginFailureCounterHandler, Continuation continuation) {
        v9.b bVar;
        globalLoginFailureCounterHandler.getClass();
        if (continuation instanceof v9.b) {
            bVar = (v9.b) continuation;
            int i10 = bVar.f93993s0;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                bVar.f93993s0 = i10 - Integer.MIN_VALUE;
            } else {
                bVar = new v9.b(globalLoginFailureCounterHandler, continuation);
            }
        } else {
            bVar = new v9.b(globalLoginFailureCounterHandler, continuation);
        }
        Object objA = bVar.f93991q0;
        Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
        int i11 = bVar.f93993s0;
        if (i11 == 0) {
            ResultKt.throwOnFailure(objA);
            bVar.f93990p0 = globalLoginFailureCounterHandler;
            bVar.f93993s0 = 1;
            objA = globalLoginFailureCounterHandler.a(bVar);
            if (objA == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            globalLoginFailureCounterHandler = bVar.f93990p0;
            ResultKt.throwOnFailure(objA);
        }
        if (((Boolean) objA).booleanValue()) {
            ((MemoryFailureCounter) globalLoginFailureCounterHandler.f33759t0.getValue()).increment();
            ((LoginFailureCounterDataStore) globalLoginFailureCounterHandler.f33758s0.getValue()).increment();
        }
        return Unit.INSTANCE;
    }

    public static final MemoryFailureCounter access$getMemoryFailureCounter(GlobalLoginFailureCounterHandler globalLoginFailureCounterHandler) {
        return (MemoryFailureCounter) globalLoginFailureCounterHandler.f33759t0.getValue();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(Continuation<? super Boolean> continuation) {
        c cVar;
        if (continuation instanceof c) {
            cVar = (c) continuation;
            int i10 = cVar.f33767r0;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                cVar.f33767r0 = i10 - Integer.MIN_VALUE;
            } else {
                cVar = new c(continuation);
            }
        } else {
            cVar = new c(continuation);
        }
        Object objExecute = cVar.f33765p0;
        Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
        int i11 = cVar.f33767r0;
        boolean z10 = false;
        if (i11 == 0) {
            ResultKt.throwOnFailure(objExecute);
            SuspendUseCase suspendUseCase = (SuspendUseCase) androidx.camera.core.impl.utils.c.f(this.f33755p0).getOrNull(Reflection.getOrCreateKotlinClass(SuspendUseCase.class), QualifierKt.named(UseCaseConstants.isTokenActiveUseCase), new d(((GetRememberedUserUseCase) this.v0.getValue()).execute()));
            if (suspendUseCase != null) {
                cVar.f33767r0 = 1;
                objExecute = suspendUseCase.execute(cVar);
                if (objExecute == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            return Boxing.boxBoolean(z10);
        }
        if (i11 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(objExecute);
        if (((Boolean) objExecute).booleanValue()) {
            z10 = true;
        }
        return Boxing.boxBoolean(z10);
    }

    @Override // com.bbva.glomohybrid.login.presentation.viewmodel.handler.LoginFailureCounterHandler
    public void checkCounter() {
        BuildersKt__Builders_commonKt.launch$default(this, null, null, new a(null), 3, null);
    }

    @Override // com.bbva.glomohybrid.login.presentation.viewmodel.handler.LoginFailureCounterHandler
    public void compute() {
        BuildersKt__Builders_commonKt.launch$default(this, null, null, new b(null), 3, null);
    }

    @Override // kotlinx.coroutines.CoroutineScope
    @NotNull
    public CoroutineContext getCoroutineContext() {
        return this.f33757r0.getCoroutineContext();
    }

    public /* synthetic */ GlobalLoginFailureCounterHandler(ViewModelComponentsProviders viewModelComponentsProviders, ThreadDispatchers threadDispatchers, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(viewModelComponentsProviders, (i10 & 2) != 0 ? new DefaultThreadDispatchers() : threadDispatchers);
    }
}

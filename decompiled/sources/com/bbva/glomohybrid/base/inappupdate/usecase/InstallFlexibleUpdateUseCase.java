package com.bbva.glomohybrid.base.inappupdate.usecase;

import androidx.camera.core.imagecapture.a;
import com.bbva.glomohybrid.base.inappupdate.InAppUpdatesHandler;
import com.bbva.glomohybrid.base.models.InAppUpdateInfo;
import com.bbva.glomohybrid.base.viewmodel.ViewModelComponentsProviders;
import com.bbva.glomoutils.scheduler.DefaultThreadDispatchers;
import com.bbva.glomoutils.scheduler.ThreadDispatchers;
import com.bbva.glomoutils.usecase.SuspendUseCase;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.koin.core.component.KoinComponent;
import org.koin.core.component.KoinScopeComponent;
import org.koin.core.qualifier.Qualifier;
import org.koin.mp.KoinPlatformTools;

/* JADX INFO: compiled from: InstallFlexibleUpdateUseCase.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0019\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0013\u0010\u0003\u001a\u00020\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u000b"}, d2 = {"Lcom/bbva/glomohybrid/base/inappupdate/usecase/InstallFlexibleUpdateUseCase;", "Lcom/bbva/glomoutils/usecase/SuspendUseCase;", "", "execute", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/bbva/glomohybrid/base/viewmodel/ViewModelComponentsProviders;", "provider", "Lcom/bbva/glomoutils/scheduler/ThreadDispatchers;", "dispatchers", "<init>", "(Lcom/bbva/glomohybrid/base/viewmodel/ViewModelComponentsProviders;Lcom/bbva/glomoutils/scheduler/ThreadDispatchers;)V", "Base_release"}, k = 1, mv = {1, 9, 0})
@SourceDebugExtension({"SMAP\nInstallFlexibleUpdateUseCase.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InstallFlexibleUpdateUseCase.kt\ncom/bbva/glomohybrid/base/inappupdate/usecase/InstallFlexibleUpdateUseCase\n+ 2 KoinComponent.kt\norg/koin/core/component/KoinComponentKt\n*L\n1#1,24:1\n56#2,6:25\n*S KotlinDebug\n*F\n+ 1 InstallFlexibleUpdateUseCase.kt\ncom/bbva/glomohybrid/base/inappupdate/usecase/InstallFlexibleUpdateUseCase\n*L\n16#1:25,6\n*E\n"})
public final class InstallFlexibleUpdateUseCase implements SuspendUseCase<Boolean> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final ThreadDispatchers f31423a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final Lazy f31424b;

    /* JADX INFO: compiled from: InstallFlexibleUpdateUseCase.kt */
    @DebugMetadata(c = "com.bbva.glomohybrid.base.inappupdate.usecase.InstallFlexibleUpdateUseCase", f = "InstallFlexibleUpdateUseCase.kt", i = {0}, l = {19}, m = "execute", n = {"this"}, s = {"L$0"})
    public static final class a extends ContinuationImpl {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public InstallFlexibleUpdateUseCase f31425p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public /* synthetic */ Object f31426q0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public int f31428s0;

        public a(Continuation<? super a> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f31426q0 = obj;
            this.f31428s0 |= Integer.MIN_VALUE;
            return InstallFlexibleUpdateUseCase.this.execute(this);
        }
    }

    /* JADX INFO: compiled from: InstallFlexibleUpdateUseCase.kt */
    @DebugMetadata(c = "com.bbva.glomohybrid.base.inappupdate.usecase.InstallFlexibleUpdateUseCase$execute$2", f = "InstallFlexibleUpdateUseCase.kt", i = {}, l = {19}, m = "invokeSuspend", n = {}, s = {})
    public static final class b extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super InAppUpdateInfo>, Object> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public int f31429p0;

        public b(Continuation<? super b> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return InstallFlexibleUpdateUseCase.this.new b(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super InAppUpdateInfo> continuation) {
            return ((b) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
            int i10 = this.f31429p0;
            if (i10 == 0) {
                ResultKt.throwOnFailure(obj);
                InAppUpdatesHandler inAppUpdatesHandlerAccess$getInAppUpdatesHandler = InstallFlexibleUpdateUseCase.access$getInAppUpdatesHandler(InstallFlexibleUpdateUseCase.this);
                this.f31429p0 = 1;
                obj = inAppUpdatesHandlerAccess$getInAppUpdatesHandler.getInfoForInstall(this);
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

    /* JADX WARN: Multi-variable type inference failed */
    public InstallFlexibleUpdateUseCase(@NotNull final ViewModelComponentsProviders provider, @NotNull ThreadDispatchers dispatchers) {
        Intrinsics.checkNotNullParameter(provider, "provider");
        Intrinsics.checkNotNullParameter(dispatchers, "dispatchers");
        this.f31423a = dispatchers;
        LazyThreadSafetyMode lazyThreadSafetyModeDefaultLazyMode = KoinPlatformTools.INSTANCE.defaultLazyMode();
        final Qualifier qualifier = null;
        final Object[] objArr = 0 == true ? 1 : 0;
        this.f31424b = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyModeDefaultLazyMode, (Function0) new Function0<InAppUpdatesHandler>() { // from class: com.bbva.glomohybrid.base.inappupdate.usecase.InstallFlexibleUpdateUseCase$special$$inlined$inject$default$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v3, types: [com.bbva.glomohybrid.base.inappupdate.InAppUpdatesHandler, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final InAppUpdatesHandler invoke() {
                KoinComponent koinComponent = provider;
                boolean z10 = koinComponent instanceof KoinScopeComponent;
                return (z10 ? ((KoinScopeComponent) koinComponent).getScope() : a.e(koinComponent)).get(Reflection.getOrCreateKotlinClass(InAppUpdatesHandler.class), qualifier, objArr);
            }
        });
    }

    public static final InAppUpdatesHandler access$getInAppUpdatesHandler(InstallFlexibleUpdateUseCase installFlexibleUpdateUseCase) {
        return (InAppUpdatesHandler) installFlexibleUpdateUseCase.f31424b.getValue();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.bbva.glomoutils.usecase.SuspendUseCase
    @Nullable
    public Object execute(@NotNull Continuation<? super Boolean> continuation) {
        a aVar;
        InstallFlexibleUpdateUseCase installFlexibleUpdateUseCase;
        if (continuation instanceof a) {
            aVar = (a) continuation;
            int i10 = aVar.f31428s0;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                aVar.f31428s0 = i10 - Integer.MIN_VALUE;
            } else {
                aVar = new a(continuation);
            }
        } else {
            aVar = new a(continuation);
        }
        Object objWithContext = aVar.f31426q0;
        Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
        int i11 = aVar.f31428s0;
        if (i11 == 0) {
            ResultKt.throwOnFailure(objWithContext);
            CoroutineDispatcher coroutineDispatcherIo = this.f31423a.io();
            b bVar = new b(null);
            aVar.f31425p0 = this;
            aVar.f31428s0 = 1;
            objWithContext = BuildersKt.withContext(coroutineDispatcherIo, bVar, aVar);
            if (objWithContext == coroutine_suspended) {
                return coroutine_suspended;
            }
            installFlexibleUpdateUseCase = this;
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            installFlexibleUpdateUseCase = aVar.f31425p0;
            ResultKt.throwOnFailure(objWithContext);
        }
        if (((InAppUpdateInfo) objWithContext) == null) {
            return Boxing.boxBoolean(false);
        }
        ((InAppUpdatesHandler) installFlexibleUpdateUseCase.f31424b.getValue()).install();
        return Boxing.boxBoolean(true);
    }

    public /* synthetic */ InstallFlexibleUpdateUseCase(ViewModelComponentsProviders viewModelComponentsProviders, ThreadDispatchers threadDispatchers, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(viewModelComponentsProviders, (i10 & 2) != 0 ? new DefaultThreadDispatchers() : threadDispatchers);
    }
}

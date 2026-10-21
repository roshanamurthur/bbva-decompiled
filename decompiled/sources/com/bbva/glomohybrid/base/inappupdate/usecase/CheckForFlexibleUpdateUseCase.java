package com.bbva.glomohybrid.base.inappupdate.usecase;

import androidx.camera.core.imagecapture.a;
import com.bbva.component.dm.settings.domain.model.AppSettings;
import com.bbva.component.dm.settings.domain.model.AppSettingsResult;
import com.bbva.component.dm.settings.domain.model.AppVersionsDataModel;
import com.bbva.component.dm.settings.domain.model.InAppUpdateConfiguration;
import com.bbva.component.dm.settings.domain.model.InAppUpdates;
import com.bbva.component.dm.settings.domain.model.VersionDataModel;
import com.bbva.component.dm.settings.repository.AppSettingsRepository;
import com.bbva.component.dm.settings.repository.SettingsPolicy;
import com.bbva.glomohybrid.base.datasource.InAppUpdatesScheduleDataSource;
import com.bbva.glomohybrid.base.inappupdate.InAppUpdatesHandler;
import com.bbva.glomohybrid.base.models.InAppUpdateInfo;
import com.bbva.glomohybrid.base.models.InAppUpdateType;
import com.bbva.glomohybrid.base.models.InAppUpdatesScheduleData;
import com.bbva.glomohybrid.base.viewmodel.ViewModelComponentsProviders;
import com.bbva.glomoutils.StringDateExtensionsKt;
import com.bbva.glomoutils.scheduler.DefaultThreadDispatchers;
import com.bbva.glomoutils.scheduler.ThreadDispatchers;
import com.bbva.glomoutils.time.StringDate;
import com.bbva.glomoutils.usecase.SuspendUseCase;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
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
import kotlinx.coroutines.DelayKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.koin.core.component.KoinComponent;
import org.koin.core.component.KoinScopeComponent;
import org.koin.core.qualifier.Qualifier;
import org.koin.mp.KoinPlatformTools;

/* JADX INFO: compiled from: CheckForFlexibleUpdateUseCase.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0019\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0013\u0010\u0003\u001a\u00020\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u000b"}, d2 = {"Lcom/bbva/glomohybrid/base/inappupdate/usecase/CheckForFlexibleUpdateUseCase;", "Lcom/bbva/glomoutils/usecase/SuspendUseCase;", "", "execute", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/bbva/glomohybrid/base/viewmodel/ViewModelComponentsProviders;", "provider", "Lcom/bbva/glomoutils/scheduler/ThreadDispatchers;", "dispatchers", "<init>", "(Lcom/bbva/glomohybrid/base/viewmodel/ViewModelComponentsProviders;Lcom/bbva/glomoutils/scheduler/ThreadDispatchers;)V", "Base_release"}, k = 1, mv = {1, 9, 0})
@SourceDebugExtension({"SMAP\nCheckForFlexibleUpdateUseCase.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CheckForFlexibleUpdateUseCase.kt\ncom/bbva/glomohybrid/base/inappupdate/usecase/CheckForFlexibleUpdateUseCase\n+ 2 KoinComponent.kt\norg/koin/core/component/KoinComponentKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,111:1\n56#2,6:112\n56#2,6:118\n56#2,6:124\n1#3:130\n*S KotlinDebug\n*F\n+ 1 CheckForFlexibleUpdateUseCase.kt\ncom/bbva/glomohybrid/base/inappupdate/usecase/CheckForFlexibleUpdateUseCase\n*L\n27#1:112,6\n29#1:118,6\n31#1:124,6\n*E\n"})
public final class CheckForFlexibleUpdateUseCase implements SuspendUseCase<Unit> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final ThreadDispatchers f31402a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final Lazy f31403b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final Lazy f31404c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final Lazy f31405d;

    /* JADX INFO: compiled from: CheckForFlexibleUpdateUseCase.kt */
    @DebugMetadata(c = "com.bbva.glomohybrid.base.inappupdate.usecase.CheckForFlexibleUpdateUseCase", f = "CheckForFlexibleUpdateUseCase.kt", i = {0, 1, 1}, l = {39, 48}, m = "execute", n = {"this", "this", "updateInfo"}, s = {"L$0", "L$0", "L$1"})
    public static final class a extends ContinuationImpl {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public CheckForFlexibleUpdateUseCase f31406p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public InAppUpdateInfo f31407q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public /* synthetic */ Object f31408r0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public int f31410t0;

        public a(Continuation<? super a> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f31408r0 = obj;
            this.f31410t0 |= Integer.MIN_VALUE;
            return CheckForFlexibleUpdateUseCase.this.execute(this);
        }
    }

    /* JADX INFO: compiled from: CheckForFlexibleUpdateUseCase.kt */
    @DebugMetadata(c = "com.bbva.glomohybrid.base.inappupdate.usecase.CheckForFlexibleUpdateUseCase$execute$updateInfo$1", f = "CheckForFlexibleUpdateUseCase.kt", i = {0}, l = {43}, m = "invokeSuspend", n = {"scheduleData"}, s = {"L$0"})
    public static final class b extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super InAppUpdateInfo>, Object> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public InAppUpdatesScheduleData f31411p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public int f31412q0;

        public b(Continuation<? super b> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return CheckForFlexibleUpdateUseCase.this.new b(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super InAppUpdateInfo> continuation) {
            return ((b) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            InAppUpdatesScheduleData inAppUpdatesScheduleData;
            Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
            int i10 = this.f31412q0;
            CheckForFlexibleUpdateUseCase checkForFlexibleUpdateUseCase = CheckForFlexibleUpdateUseCase.this;
            if (i10 == 0) {
                ResultKt.throwOnFailure(obj);
                InAppUpdatesScheduleData inAppUpdatesScheduleData2 = CheckForFlexibleUpdateUseCase.access$getInAppUpdatesConfigDataSource(checkForFlexibleUpdateUseCase).get();
                InAppUpdateConfiguration inAppUpdateConfigurationAccess$getSettingsConfiguration = CheckForFlexibleUpdateUseCase.access$getSettingsConfiguration(checkForFlexibleUpdateUseCase);
                if (!inAppUpdateConfigurationAccess$getSettingsConfiguration.getAvailable()) {
                    return null;
                }
                this.f31411p0 = inAppUpdatesScheduleData2;
                this.f31412q0 = 1;
                Object objAccess$tryInAppUpdate = CheckForFlexibleUpdateUseCase.access$tryInAppUpdate(checkForFlexibleUpdateUseCase, inAppUpdatesScheduleData2, inAppUpdateConfigurationAccess$getSettingsConfiguration, this);
                if (objAccess$tryInAppUpdate == coroutine_suspended) {
                    return coroutine_suspended;
                }
                inAppUpdatesScheduleData = inAppUpdatesScheduleData2;
                obj = objAccess$tryInAppUpdate;
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                inAppUpdatesScheduleData = this.f31411p0;
                ResultKt.throwOnFailure(obj);
            }
            InAppUpdateInfo inAppUpdateInfo = (InAppUpdateInfo) obj;
            if (inAppUpdateInfo == null) {
                return null;
            }
            CheckForFlexibleUpdateUseCase.access$increaseAndSave(checkForFlexibleUpdateUseCase, inAppUpdatesScheduleData, inAppUpdateInfo.getVersion());
            return inAppUpdateInfo;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public CheckForFlexibleUpdateUseCase(@NotNull final ViewModelComponentsProviders provider, @NotNull ThreadDispatchers dispatchers) {
        Intrinsics.checkNotNullParameter(provider, "provider");
        Intrinsics.checkNotNullParameter(dispatchers, "dispatchers");
        this.f31402a = dispatchers;
        KoinPlatformTools koinPlatformTools = KoinPlatformTools.INSTANCE;
        LazyThreadSafetyMode lazyThreadSafetyModeDefaultLazyMode = koinPlatformTools.defaultLazyMode();
        final Qualifier qualifier = null;
        final Object[] objArr = 0 == true ? 1 : 0;
        this.f31403b = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyModeDefaultLazyMode, (Function0) new Function0<InAppUpdatesHandler>() { // from class: com.bbva.glomohybrid.base.inappupdate.usecase.CheckForFlexibleUpdateUseCase$special$$inlined$inject$default$1
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
        LazyThreadSafetyMode lazyThreadSafetyModeDefaultLazyMode2 = koinPlatformTools.defaultLazyMode();
        final Object[] objArr2 = 0 == true ? 1 : 0;
        final Object[] objArr3 = 0 == true ? 1 : 0;
        this.f31404c = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyModeDefaultLazyMode2, (Function0) new Function0<InAppUpdatesScheduleDataSource>() { // from class: com.bbva.glomohybrid.base.inappupdate.usecase.CheckForFlexibleUpdateUseCase$special$$inlined$inject$default$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v3, types: [com.bbva.glomohybrid.base.datasource.InAppUpdatesScheduleDataSource, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final InAppUpdatesScheduleDataSource invoke() {
                KoinComponent koinComponent = provider;
                boolean z10 = koinComponent instanceof KoinScopeComponent;
                return (z10 ? ((KoinScopeComponent) koinComponent).getScope() : a.e(koinComponent)).get(Reflection.getOrCreateKotlinClass(InAppUpdatesScheduleDataSource.class), objArr2, objArr3);
            }
        });
        LazyThreadSafetyMode lazyThreadSafetyModeDefaultLazyMode3 = koinPlatformTools.defaultLazyMode();
        final Object[] objArr4 = 0 == true ? 1 : 0;
        final Object[] objArr5 = 0 == true ? 1 : 0;
        this.f31405d = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyModeDefaultLazyMode3, (Function0) new Function0<AppSettingsRepository>() { // from class: com.bbva.glomohybrid.base.inappupdate.usecase.CheckForFlexibleUpdateUseCase$special$$inlined$inject$default$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v3, types: [com.bbva.component.dm.settings.repository.AppSettingsRepository, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final AppSettingsRepository invoke() {
                KoinComponent koinComponent = provider;
                boolean z10 = koinComponent instanceof KoinScopeComponent;
                return (z10 ? ((KoinScopeComponent) koinComponent).getScope() : a.e(koinComponent)).get(Reflection.getOrCreateKotlinClass(AppSettingsRepository.class), objArr4, objArr5);
            }
        });
    }

    public static final InAppUpdatesScheduleDataSource access$getInAppUpdatesConfigDataSource(CheckForFlexibleUpdateUseCase checkForFlexibleUpdateUseCase) {
        return (InAppUpdatesScheduleDataSource) checkForFlexibleUpdateUseCase.f31404c.getValue();
    }

    public static final InAppUpdateConfiguration access$getSettingsConfiguration(CheckForFlexibleUpdateUseCase checkForFlexibleUpdateUseCase) {
        AppSettings data;
        AppVersionsDataModel appVersion;
        VersionDataModel android2;
        InAppUpdates inAppUpdates;
        AppSettingsResult settings = ((AppSettingsRepository) checkForFlexibleUpdateUseCase.f31405d.getValue()).getSettings(SettingsPolicy.Local);
        InAppUpdateConfiguration flexible = null;
        if (!(settings instanceof AppSettingsResult.FreshResult) && !(settings instanceof AppSettingsResult.CachedResult)) {
            settings = null;
        }
        if (settings != null && (data = settings.getData()) != null && (appVersion = data.getAppVersion()) != null && (android2 = appVersion.getAndroid()) != null && (inAppUpdates = android2.getInAppUpdates()) != null) {
            flexible = inAppUpdates.getFlexible();
        }
        return new InAppUpdateConfiguration(flexible != null ? flexible.getAvailable() : true, flexible != null ? flexible.getPeriod() : 0, flexible != null ? flexible.getLimit() : Integer.MAX_VALUE);
    }

    /* JADX WARN: Code duplicated, block: B:11:0x002b  */
    public static final void access$increaseAndSave(CheckForFlexibleUpdateUseCase checkForFlexibleUpdateUseCase, InAppUpdatesScheduleData inAppUpdatesScheduleData, int i10) {
        InAppUpdatesScheduleData inAppUpdatesScheduleDataCreate;
        checkForFlexibleUpdateUseCase.getClass();
        if (inAppUpdatesScheduleData != null) {
            InAppUpdatesScheduleData inAppUpdatesScheduleDataCopy$default = InAppUpdatesScheduleData.copy$default(inAppUpdatesScheduleData, 0, inAppUpdatesScheduleData.getTimes() + 1, StringDate.getToday$default(StringDate.INSTANCE, null, 1, null), 1, null);
            if (inAppUpdatesScheduleDataCopy$default == null) {
                inAppUpdatesScheduleDataCreate = InAppUpdatesScheduleData.INSTANCE.create(i10);
            } else {
                inAppUpdatesScheduleDataCreate = inAppUpdatesScheduleDataCopy$default.getVersion() == i10 ? inAppUpdatesScheduleDataCopy$default : null;
                if (inAppUpdatesScheduleDataCreate == null) {
                    inAppUpdatesScheduleDataCreate = InAppUpdatesScheduleData.INSTANCE.create(i10);
                }
            }
        } else {
            inAppUpdatesScheduleDataCreate = InAppUpdatesScheduleData.INSTANCE.create(i10);
        }
        ((InAppUpdatesScheduleDataSource) checkForFlexibleUpdateUseCase.f31404c.getValue()).save(inAppUpdatesScheduleDataCreate);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    public static final Object access$tryInAppUpdate(CheckForFlexibleUpdateUseCase checkForFlexibleUpdateUseCase, InAppUpdatesScheduleData inAppUpdatesScheduleData, InAppUpdateConfiguration inAppUpdateConfiguration, Continuation continuation) {
        e8.a aVar;
        String dateShown;
        checkForFlexibleUpdateUseCase.getClass();
        if (continuation instanceof e8.a) {
            aVar = (e8.a) continuation;
            int i10 = aVar.f68285u0;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                aVar.f68285u0 = i10 - Integer.MIN_VALUE;
            } else {
                aVar = new e8.a(checkForFlexibleUpdateUseCase, continuation);
            }
        } else {
            aVar = new e8.a(checkForFlexibleUpdateUseCase, continuation);
        }
        Object infoForDownload = aVar.f68283s0;
        Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
        int i11 = aVar.f68285u0;
        if (i11 == 0) {
            ResultKt.throwOnFailure(infoForDownload);
            Lazy lazy = checkForFlexibleUpdateUseCase.f31403b;
            if (!((InAppUpdatesHandler) lazy.getValue()).getV0()) {
                aVar.f68280p0 = checkForFlexibleUpdateUseCase;
                aVar.f68281q0 = inAppUpdatesScheduleData;
                aVar.f68282r0 = inAppUpdateConfiguration;
                aVar.f68285u0 = 1;
                infoForDownload = ((InAppUpdatesHandler) lazy.getValue()).getInfoForDownload(InAppUpdateType.FLEXIBLE, aVar);
                if (infoForDownload == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            return null;
        }
        if (i11 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        inAppUpdateConfiguration = aVar.f68282r0;
        inAppUpdatesScheduleData = aVar.f68281q0;
        checkForFlexibleUpdateUseCase = aVar.f68280p0;
        ResultKt.throwOnFailure(infoForDownload);
        InAppUpdateInfo inAppUpdateInfo = (InAppUpdateInfo) infoForDownload;
        if (inAppUpdateInfo != null) {
            checkForFlexibleUpdateUseCase.getClass();
            if (inAppUpdatesScheduleData == null || inAppUpdateInfo.getVersion() != inAppUpdatesScheduleData.getVersion()) {
                return inAppUpdateInfo;
            }
            if (inAppUpdatesScheduleData.getTimes() < inAppUpdateConfiguration.getLimit() && (dateShown = inAppUpdatesScheduleData.getDateShown()) != null && !(!StringDateExtensionsKt.isTimeElapseUpperOrEqualsTo$default(dateShown, inAppUpdateConfiguration.getPeriod(), StringDate.getToday$default(StringDate.INSTANCE, null, 1, null), null, 4, null))) {
                return inAppUpdateInfo;
            }
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.bbva.glomoutils.usecase.SuspendUseCase
    @Nullable
    public Object execute(@NotNull Continuation<? super Unit> continuation) {
        a aVar;
        CheckForFlexibleUpdateUseCase checkForFlexibleUpdateUseCase;
        InAppUpdateInfo inAppUpdateInfo;
        CheckForFlexibleUpdateUseCase checkForFlexibleUpdateUseCase2;
        if (continuation instanceof a) {
            aVar = (a) continuation;
            int i10 = aVar.f31410t0;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                aVar.f31410t0 = i10 - Integer.MIN_VALUE;
            } else {
                aVar = new a(continuation);
            }
        } else {
            aVar = new a(continuation);
        }
        Object objWithContext = aVar.f31408r0;
        Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
        int i11 = aVar.f31410t0;
        if (i11 != 0) {
            if (i11 == 1) {
                checkForFlexibleUpdateUseCase = aVar.f31406p0;
                ResultKt.throwOnFailure(objWithContext);
            } else {
                if (i11 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                inAppUpdateInfo = aVar.f31407q0;
                checkForFlexibleUpdateUseCase2 = aVar.f31406p0;
                ResultKt.throwOnFailure(objWithContext);
            }
            ((InAppUpdatesHandler) checkForFlexibleUpdateUseCase2.f31403b.getValue()).startFlow(InAppUpdateType.FLEXIBLE, inAppUpdateInfo);
            return Unit.INSTANCE;
        }
        ResultKt.throwOnFailure(objWithContext);
        CoroutineDispatcher coroutineDispatcherIo = this.f31402a.io();
        b bVar = new b(null);
        aVar.f31406p0 = this;
        aVar.f31410t0 = 1;
        objWithContext = BuildersKt.withContext(coroutineDispatcherIo, bVar, aVar);
        if (objWithContext == coroutine_suspended) {
            return coroutine_suspended;
        }
        checkForFlexibleUpdateUseCase = this;
        InAppUpdateInfo inAppUpdateInfo2 = (InAppUpdateInfo) objWithContext;
        if (inAppUpdateInfo2 == null) {
            return Unit.INSTANCE;
        }
        aVar.f31406p0 = checkForFlexibleUpdateUseCase;
        aVar.f31407q0 = inAppUpdateInfo2;
        aVar.f31410t0 = 2;
        if (DelayKt.delay(1200L, aVar) == coroutine_suspended) {
            return coroutine_suspended;
        }
        inAppUpdateInfo = inAppUpdateInfo2;
        checkForFlexibleUpdateUseCase2 = checkForFlexibleUpdateUseCase;
        ((InAppUpdatesHandler) checkForFlexibleUpdateUseCase2.f31403b.getValue()).startFlow(InAppUpdateType.FLEXIBLE, inAppUpdateInfo);
        return Unit.INSTANCE;
    }

    public /* synthetic */ CheckForFlexibleUpdateUseCase(ViewModelComponentsProviders viewModelComponentsProviders, ThreadDispatchers threadDispatchers, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(viewModelComponentsProviders, (i10 & 2) != 0 ? new DefaultThreadDispatchers() : threadDispatchers);
    }
}

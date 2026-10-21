package com.bbva.component_devicemanager.data.service;

import android.content.Context;
import androidx.camera.core.imagecapture.a;
import androidx.work.CoroutineWorker;
import androidx.work.ListenableWorker;
import androidx.work.WorkerParameters;
import com.bbva.component_devicemanager.data.datasource.RegisterDeviceManagerDataSource;
import com.bbva.component_devicemanager.data.repository.DeviceManagerDataRepository;
import com.bbva.component_devicemanager.domain.model.DeviceManagerData;
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
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.koin.core.Koin;
import org.koin.core.component.KoinComponent;
import org.koin.core.component.KoinScopeComponent;
import org.koin.core.qualifier.Qualifier;
import org.koin.mp.KoinPlatformTools;

/* JADX INFO: compiled from: DeviceManagerService.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002B\u0017\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0013\u0010\u0004\u001a\u00020\u0003H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\f"}, d2 = {"Lcom/bbva/component_devicemanager/data/service/DeviceManagerService;", "Landroidx/work/CoroutineWorker;", "Lorg/koin/core/component/KoinComponent;", "Landroidx/work/ListenableWorker$Result;", "doWork", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Landroid/content/Context;", "context", "Landroidx/work/WorkerParameters;", "params", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "component-devicemanager_mexicoGoogleRelease"}, k = 1, mv = {1, 9, 0})
@SourceDebugExtension({"SMAP\nDeviceManagerService.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DeviceManagerService.kt\ncom/bbva/component_devicemanager/data/service/DeviceManagerService\n+ 2 KoinComponent.kt\norg/koin/core/component/KoinComponentKt\n*L\n1#1,33:1\n56#2,6:34\n56#2,6:40\n*S KotlinDebug\n*F\n+ 1 DeviceManagerService.kt\ncom/bbva/component_devicemanager/data/service/DeviceManagerService\n*L\n17#1:34,6\n18#1:40,6\n*E\n"})
public final class DeviceManagerService extends CoroutineWorker implements KoinComponent {

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    @NotNull
    public final Lazy f28907x0;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    @NotNull
    public final Lazy f28908y0;

    /* JADX INFO: compiled from: DeviceManagerService.kt */
    @DebugMetadata(c = "com.bbva.component_devicemanager.data.service.DeviceManagerService", f = "DeviceManagerService.kt", i = {}, l = {21}, m = "doWork", n = {}, s = {})
    public static final class a extends ContinuationImpl {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public /* synthetic */ Object f28909p0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public int f28911r0;

        public a(Continuation<? super a> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f28909p0 = obj;
            this.f28911r0 |= Integer.MIN_VALUE;
            return DeviceManagerService.this.doWork(this);
        }
    }

    /* JADX INFO: compiled from: DeviceManagerService.kt */
    @DebugMetadata(c = "com.bbva.component_devicemanager.data.service.DeviceManagerService$doWork$2", f = "DeviceManagerService.kt", i = {}, l = {22}, m = "invokeSuspend", n = {}, s = {})
    public static final class b extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super ListenableWorker.Result>, Object> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public int f28912p0;

        public b(Continuation<? super b> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return DeviceManagerService.this.new b(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super ListenableWorker.Result> continuation) {
            return ((b) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
            int i10 = this.f28912p0;
            if (i10 == 0) {
                ResultKt.throwOnFailure(obj);
                this.f28912p0 = 1;
                if (DeviceManagerService.access$runNetworkRequest(DeviceManagerService.this, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return ListenableWorker.Result.success();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public DeviceManagerService(@NotNull Context context, @NotNull WorkerParameters params) {
        super(context, params);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(params, "params");
        KoinPlatformTools koinPlatformTools = KoinPlatformTools.INSTANCE;
        LazyThreadSafetyMode lazyThreadSafetyModeDefaultLazyMode = koinPlatformTools.defaultLazyMode();
        final Qualifier qualifier = null;
        final Object[] objArr = 0 == true ? 1 : 0;
        this.f28907x0 = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyModeDefaultLazyMode, (Function0) new Function0<DeviceManagerDataRepository>() { // from class: com.bbva.component_devicemanager.data.service.DeviceManagerService$special$$inlined$inject$default$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v3, types: [com.bbva.component_devicemanager.data.repository.DeviceManagerDataRepository, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final DeviceManagerDataRepository invoke() {
                KoinComponent koinComponent = this;
                boolean z10 = koinComponent instanceof KoinScopeComponent;
                return (z10 ? ((KoinScopeComponent) koinComponent).getScope() : a.e(koinComponent)).get(Reflection.getOrCreateKotlinClass(DeviceManagerDataRepository.class), qualifier, objArr);
            }
        });
        LazyThreadSafetyMode lazyThreadSafetyModeDefaultLazyMode2 = koinPlatformTools.defaultLazyMode();
        final Object[] objArr2 = 0 == true ? 1 : 0;
        final Object[] objArr3 = 0 == true ? 1 : 0;
        this.f28908y0 = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyModeDefaultLazyMode2, (Function0) new Function0<RegisterDeviceManagerDataSource>() { // from class: com.bbva.component_devicemanager.data.service.DeviceManagerService$special$$inlined$inject$default$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v3, types: [com.bbva.component_devicemanager.data.datasource.RegisterDeviceManagerDataSource, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final RegisterDeviceManagerDataSource invoke() {
                KoinComponent koinComponent = this;
                boolean z10 = koinComponent instanceof KoinScopeComponent;
                return (z10 ? ((KoinScopeComponent) koinComponent).getScope() : a.e(koinComponent)).get(Reflection.getOrCreateKotlinClass(RegisterDeviceManagerDataSource.class), objArr2, objArr3);
            }
        });
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    public static final Object access$runNetworkRequest(DeviceManagerService deviceManagerService, Continuation continuation) {
        e6.a aVar;
        deviceManagerService.getClass();
        if (continuation instanceof e6.a) {
            aVar = (e6.a) continuation;
            int i10 = aVar.f68279s0;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                aVar.f68279s0 = i10 - Integer.MIN_VALUE;
            } else {
                aVar = new e6.a(deviceManagerService, continuation);
            }
        } else {
            aVar = new e6.a(deviceManagerService, continuation);
        }
        Object objFetchDeviceManagerData = aVar.f68277q0;
        Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
        int i11 = aVar.f68279s0;
        if (i11 == 0) {
            ResultKt.throwOnFailure(objFetchDeviceManagerData);
            DeviceManagerDataRepository deviceManagerDataRepository = (DeviceManagerDataRepository) deviceManagerService.f28907x0.getValue();
            aVar.f68276p0 = deviceManagerService;
            aVar.f68279s0 = 1;
            objFetchDeviceManagerData = deviceManagerDataRepository.fetchDeviceManagerData(aVar);
            if (objFetchDeviceManagerData == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            deviceManagerService = aVar.f68276p0;
            ResultKt.throwOnFailure(objFetchDeviceManagerData);
        }
        DeviceManagerData deviceManagerData = (DeviceManagerData) objFetchDeviceManagerData;
        if (deviceManagerData != null) {
            ((RegisterDeviceManagerDataSource) deviceManagerService.f28908y0.getValue()).register(deviceManagerData);
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // androidx.work.CoroutineWorker
    @Nullable
    public Object doWork(@NotNull Continuation<? super ListenableWorker.Result> continuation) {
        a aVar;
        if (continuation instanceof a) {
            aVar = (a) continuation;
            int i10 = aVar.f28911r0;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                aVar.f28911r0 = i10 - Integer.MIN_VALUE;
            } else {
                aVar = new a(continuation);
            }
        } else {
            aVar = new a(continuation);
        }
        Object objWithContext = aVar.f28909p0;
        Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
        int i11 = aVar.f28911r0;
        if (i11 == 0) {
            ResultKt.throwOnFailure(objWithContext);
            CoroutineDispatcher io2 = Dispatchers.getIO();
            b bVar = new b(null);
            aVar.f28911r0 = 1;
            objWithContext = BuildersKt.withContext(io2, bVar, aVar);
            if (objWithContext == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objWithContext);
        }
        Intrinsics.checkNotNullExpressionValue(objWithContext, "withContext(...)");
        return objWithContext;
    }

    @Override // org.koin.core.component.KoinComponent
    @NotNull
    public Koin getKoin() {
        return KoinComponent.DefaultImpls.getKoin(this);
    }
}

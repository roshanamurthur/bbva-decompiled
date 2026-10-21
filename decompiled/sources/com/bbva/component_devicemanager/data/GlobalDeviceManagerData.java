package com.bbva.component_devicemanager.data;

import com.bbva.component_devicemanager.domain.model.DeviceManagerDataSource;
import com.bbva.component_devicemanager.domain.model.GlobalDeviceManagerResponse;
import com.bbva.ethermobile.help.kit.result.Result;
import com.bbva.ethermobilesdk.devicemanager.gms.DeviceManagerGmsApi;
import com.bbva.ethermobilesdk.devicemanager.model.input.DeviceCheckerPlayIntegrityRequest;
import com.bbva.ethermobilesdk.devicemanager.model.input.DeviceIdRequest;
import com.bbva.ethermobilesdk.devicemanager.model.input.DeviceUIdRequest;
import com.bbva.ethermobilesdk.devicemanager.model.output.DeviceIdResponse;
import com.bbva.ethermobilesdk.devicemanager.model.output.DeviceManagerResponse;
import com.bbva.glomo.user.domain.model.RememberedUser;
import com.bbva.glomo.user.repository.datasource.RememberedUserDataSource;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: GlobalDeviceManagerData.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J\u0013\u0010\u0003\u001a\u00020\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0003\u0010\u0004J\n\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0016\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0011"}, d2 = {"Lcom/bbva/component_devicemanager/data/GlobalDeviceManagerData;", "Lcom/bbva/component_devicemanager/domain/model/DeviceManagerDataSource;", "", "getAccessId", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/bbva/component_devicemanager/domain/model/GlobalDeviceManagerResponse;", "collectData", "Lcom/bbva/ethermobilesdk/devicemanager/gms/DeviceManagerGmsApi;", "deviceManager", "Lcom/bbva/glomo/user/repository/datasource/RememberedUserDataSource;", "rememberedUser", "Lcom/bbva/ethermobilesdk/devicemanager/model/input/DeviceCheckerPlayIntegrityRequest;", "deviceCheckerPlayIntegrityRequest", "Lcom/bbva/ethermobilesdk/devicemanager/model/input/DeviceUIdRequest;", "deviceUIdRequest", "<init>", "(Lcom/bbva/ethermobilesdk/devicemanager/gms/DeviceManagerGmsApi;Lcom/bbva/glomo/user/repository/datasource/RememberedUserDataSource;Lcom/bbva/ethermobilesdk/devicemanager/model/input/DeviceCheckerPlayIntegrityRequest;Lcom/bbva/ethermobilesdk/devicemanager/model/input/DeviceUIdRequest;)V", "component-devicemanager_mexicoGoogleRelease"}, k = 1, mv = {1, 9, 0})
public final class GlobalDeviceManagerData implements DeviceManagerDataSource {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    @NotNull
    public final DeviceManagerGmsApi f28861p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    @NotNull
    public final RememberedUserDataSource f28862q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    @NotNull
    public final DeviceCheckerPlayIntegrityRequest f28863r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    @NotNull
    public final DeviceUIdRequest f28864s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    @Nullable
    public Result<DeviceManagerResponse.DeviceManagerGmsResponse> f28865t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    @NotNull
    public final Lazy f28866u0;

    /* JADX INFO: compiled from: GlobalDeviceManagerData.kt */
    @DebugMetadata(c = "com.bbva.component_devicemanager.data.GlobalDeviceManagerData$1", f = "GlobalDeviceManagerData.kt", i = {}, l = {29}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public int f28867p0;

        public a(Continuation<? super a> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return GlobalDeviceManagerData.this.new a(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
            int i10 = this.f28867p0;
            if (i10 == 0) {
                ResultKt.throwOnFailure(obj);
                this.f28867p0 = 1;
                if (GlobalDeviceManagerData.access$initializeData(GlobalDeviceManagerData.this, this) == coroutine_suspended) {
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

    /* JADX INFO: compiled from: GlobalDeviceManagerData.kt */
    public static final class b extends Lambda implements Function0<DeviceIdRequest> {
        public b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final DeviceIdRequest invoke() {
            RememberedUser rememberedUser = GlobalDeviceManagerData.this.f28862q0.get();
            String customerId = rememberedUser != null ? rememberedUser.getCustomerId() : null;
            if (customerId == null) {
                customerId = "";
            }
            return new DeviceIdRequest(customerId);
        }
    }

    /* JADX INFO: compiled from: GlobalDeviceManagerData.kt */
    @DebugMetadata(c = "com.bbva.component_devicemanager.data.GlobalDeviceManagerData", f = "GlobalDeviceManagerData.kt", i = {}, l = {46}, m = "getAccessId", n = {}, s = {})
    public static final class c extends ContinuationImpl {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public /* synthetic */ Object f28870p0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public int f28872r0;

        public c(Continuation<? super c> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f28870p0 = obj;
            this.f28872r0 |= Integer.MIN_VALUE;
            return GlobalDeviceManagerData.this.getAccessId(this);
        }
    }

    public GlobalDeviceManagerData(@NotNull DeviceManagerGmsApi deviceManager, @NotNull RememberedUserDataSource rememberedUser, @NotNull DeviceCheckerPlayIntegrityRequest deviceCheckerPlayIntegrityRequest, @NotNull DeviceUIdRequest deviceUIdRequest) {
        Intrinsics.checkNotNullParameter(deviceManager, "deviceManager");
        Intrinsics.checkNotNullParameter(rememberedUser, "rememberedUser");
        Intrinsics.checkNotNullParameter(deviceCheckerPlayIntegrityRequest, "deviceCheckerPlayIntegrityRequest");
        Intrinsics.checkNotNullParameter(deviceUIdRequest, "deviceUIdRequest");
        this.f28861p0 = deviceManager;
        this.f28862q0 = rememberedUser;
        this.f28863r0 = deviceCheckerPlayIntegrityRequest;
        this.f28864s0 = deviceUIdRequest;
        this.f28866u0 = LazyKt__LazyJVMKt.lazy(new b());
        BuildersKt__Builders_commonKt.launch$default(this, null, null, new a(null), 3, null);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    public static final Object access$initializeData(GlobalDeviceManagerData globalDeviceManagerData, Continuation continuation) {
        d6.a aVar;
        globalDeviceManagerData.getClass();
        if (continuation instanceof d6.a) {
            aVar = (d6.a) continuation;
            int i10 = aVar.f68129s0;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                aVar.f68129s0 = i10 - Integer.MIN_VALUE;
            } else {
                aVar = new d6.a(globalDeviceManagerData, continuation);
            }
        } else {
            aVar = new d6.a(globalDeviceManagerData, continuation);
        }
        Object objGmsApi = aVar.f68127q0;
        Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
        int i11 = aVar.f68129s0;
        if (i11 == 0) {
            ResultKt.throwOnFailure(objGmsApi);
            if (globalDeviceManagerData.f28865t0 != null) {
                return Unit.INSTANCE;
            }
            DeviceIdRequest deviceIdRequest = (DeviceIdRequest) globalDeviceManagerData.f28866u0.getValue();
            aVar.f68126p0 = globalDeviceManagerData;
            aVar.f68129s0 = 1;
            objGmsApi = globalDeviceManagerData.f28861p0.gmsApi(deviceIdRequest, globalDeviceManagerData.f28864s0, globalDeviceManagerData.f28863r0, aVar);
            if (objGmsApi == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            globalDeviceManagerData = aVar.f68126p0;
            ResultKt.throwOnFailure(objGmsApi);
        }
        globalDeviceManagerData.f28865t0 = (Result) objGmsApi;
        return Unit.INSTANCE;
    }

    @Override // com.bbva.component_devicemanager.domain.model.DeviceManagerDataSource
    @Nullable
    public GlobalDeviceManagerResponse collectData() {
        DeviceManagerResponse.DeviceManagerGmsResponse deviceManagerGmsResponse;
        Result<DeviceManagerResponse.DeviceManagerGmsResponse> result = this.f28865t0;
        if (result == null || (deviceManagerGmsResponse = (DeviceManagerResponse.DeviceManagerGmsResponse) com.bbva.ethermobile.help.kit.result.ResultKt.getOrNull(result)) == null) {
            return null;
        }
        return new GlobalDeviceManagerResponse(deviceManagerGmsResponse.getDeviceIdResponse(), deviceManagerGmsResponse.getDeviceUIdResponse(), deviceManagerGmsResponse.getDeviceTypeResponse(), deviceManagerGmsResponse.getDeviceInfoResponse(), deviceManagerGmsResponse.getDeviceCheckerResponse(), deviceManagerGmsResponse.getDeviceCheckerPlayIntegrityResponse(), deviceManagerGmsResponse.getGeolocationResponse());
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.bbva.component_devicemanager.domain.model.DeviceManagerDataSource
    @Nullable
    public Object getAccessId(@NotNull Continuation<? super String> continuation) {
        c cVar;
        Result<DeviceIdResponse> deviceIdResponse;
        DeviceIdResponse deviceIdResponse2;
        Result<String> id;
        if (continuation instanceof c) {
            cVar = (c) continuation;
            int i10 = cVar.f28872r0;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                cVar.f28872r0 = i10 - Integer.MIN_VALUE;
            } else {
                cVar = new c(continuation);
            }
        } else {
            cVar = new c(continuation);
        }
        Object objGmsDeviceIdResponse = cVar.f28870p0;
        Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
        int i11 = cVar.f28872r0;
        if (i11 == 0) {
            ResultKt.throwOnFailure(objGmsDeviceIdResponse);
            DeviceIdRequest deviceIdRequest = (DeviceIdRequest) this.f28866u0.getValue();
            cVar.f28872r0 = 1;
            objGmsDeviceIdResponse = this.f28861p0.gmsDeviceIdResponse(deviceIdRequest, cVar);
            if (objGmsDeviceIdResponse == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objGmsDeviceIdResponse);
        }
        DeviceManagerResponse.DeviceManagerGmsIdResponse deviceManagerGmsIdResponse = (DeviceManagerResponse.DeviceManagerGmsIdResponse) com.bbva.ethermobile.help.kit.result.ResultKt.getOrNull((Result) objGmsDeviceIdResponse);
        String str = (deviceManagerGmsIdResponse == null || (deviceIdResponse = deviceManagerGmsIdResponse.getDeviceIdResponse()) == null || (deviceIdResponse2 = (DeviceIdResponse) com.bbva.ethermobile.help.kit.result.ResultKt.getOrNull(deviceIdResponse)) == null || (id = deviceIdResponse2.getId()) == null) ? null : (String) com.bbva.ethermobile.help.kit.result.ResultKt.getOrNull(id);
        return str == null ? "" : str;
    }

    @Override // com.bbva.component_devicemanager.domain.model.DeviceManagerDataSource, kotlinx.coroutines.CoroutineScope
    @NotNull
    public CoroutineContext getCoroutineContext() {
        return DeviceManagerDataSource.DefaultImpls.getCoroutineContext(this);
    }
}

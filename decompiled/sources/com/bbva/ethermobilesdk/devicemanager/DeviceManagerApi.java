package com.bbva.ethermobilesdk.devicemanager;

import android.app.Application;
import com.bbva.ethermobile.help.kit.result.Result;
import com.bbva.ethermobilesdk.devicemanager.di.Injector;
import com.bbva.ethermobilesdk.devicemanager.domain.usecase.GetDeviceCheckerUseCase;
import com.bbva.ethermobilesdk.devicemanager.domain.usecase.GetDeviceIdUseCase;
import com.bbva.ethermobilesdk.devicemanager.domain.usecase.GetDeviceInfoUseCase;
import com.bbva.ethermobilesdk.devicemanager.domain.usecase.GetDeviceTypeUseCase;
import com.bbva.ethermobilesdk.devicemanager.domain.usecase.GetDeviceUidDefaultUseCase;
import com.bbva.ethermobilesdk.devicemanager.domain.usecase.GetDeviceUidShortUseCase;
import com.bbva.ethermobilesdk.devicemanager.model.input.DeviceIdRequest;
import com.bbva.ethermobilesdk.devicemanager.model.input.DeviceUIdRequest;
import com.bbva.ethermobilesdk.devicemanager.model.input.DeviceUidPolicy;
import com.bbva.ethermobilesdk.devicemanager.model.output.DeviceCheckerResponse;
import com.bbva.ethermobilesdk.devicemanager.model.output.DeviceIdResponse;
import com.bbva.ethermobilesdk.devicemanager.model.output.DeviceInfoResponse;
import com.bbva.ethermobilesdk.devicemanager.model.output.DeviceManagerResponse;
import com.bbva.ethermobilesdk.devicemanager.model.output.DeviceTypeResponse;
import com.bbva.ethermobilesdk.devicemanager.model.output.DeviceUIdResponse;
import com.bbva.ethermobilesdk.devicemanager.model.output.error.DeviceManagerError;
import com.bbva.nativesettings.common.Constants;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.Dispatchers;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: DeviceManagerApi.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u001b\b\u0000\u0012\u0006\u0010\u0018\u001a\u00020\u0017\u0012\b\b\u0002\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b\u001b\u0010\u001cB\u0011\b\u0016\u0012\u0006\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b\u001b\u0010\u001dJ&\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0086@¢\u0006\u0004\b\b\u0010\tJ\u0016\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u0006H\u0086@¢\u0006\u0004\b\u000b\u0010\fJ\u0016\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u0006H\u0086@¢\u0006\u0004\b\u000e\u0010\fJ\u001e\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0086@¢\u0006\u0004\b\u0010\u0010\u0011J\u001e\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0086@¢\u0006\u0004\b\u0013\u0010\u0014J\u0016\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u0006H\u0086@¢\u0006\u0004\b\u0016\u0010\f¨\u0006\u001e"}, d2 = {"Lcom/bbva/ethermobilesdk/devicemanager/DeviceManagerApi;", "", "Lcom/bbva/ethermobilesdk/devicemanager/model/input/DeviceIdRequest;", "deviceIdRequest", "Lcom/bbva/ethermobilesdk/devicemanager/model/input/DeviceUIdRequest;", "deviceUIdRequest", "Lcom/bbva/ethermobile/help/kit/result/Result;", "Lcom/bbva/ethermobilesdk/devicemanager/model/output/DeviceManagerResponse$DeviceManagerDefaultResponse;", "defaultApi", "(Lcom/bbva/ethermobilesdk/devicemanager/model/input/DeviceIdRequest;Lcom/bbva/ethermobilesdk/devicemanager/model/input/DeviceUIdRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/bbva/ethermobilesdk/devicemanager/model/output/DeviceInfoResponse;", "deviceInfoResponse", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/bbva/ethermobilesdk/devicemanager/model/output/DeviceCheckerResponse;", "deviceCheckerResponse", "Lcom/bbva/ethermobilesdk/devicemanager/model/output/DeviceIdResponse;", "deviceIdResponse", "(Lcom/bbva/ethermobilesdk/devicemanager/model/input/DeviceIdRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/bbva/ethermobilesdk/devicemanager/model/output/DeviceUIdResponse;", "deviceUidResponse", "(Lcom/bbva/ethermobilesdk/devicemanager/model/input/DeviceUIdRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/bbva/ethermobilesdk/devicemanager/model/output/DeviceTypeResponse;", "deviceTypeResponse", "Landroid/app/Application;", Constants.APPLICATION, "Lkotlinx/coroutines/CoroutineDispatcher;", "ioDispatcher", "<init>", "(Landroid/app/Application;Lkotlinx/coroutines/CoroutineDispatcher;)V", "(Landroid/app/Application;)V", "devicemanager_release"}, k = 1, mv = {2, 0, 0})
public final class DeviceManagerApi {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final CoroutineDispatcher f29607a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final Injector f29608b;

    /* JADX INFO: compiled from: DeviceManagerApi.kt */
    @DebugMetadata(c = "com.bbva.ethermobilesdk.devicemanager.DeviceManagerApi", f = "DeviceManagerApi.kt", i = {0, 0, 0, 1, 1, 2, 2, 3, 3, 4}, l = {66, 67, 68, 69, 70}, m = "defaultApi", n = {"this", "deviceUIdRequest", "$this$defaultApi_u24lambda_u241", "this", "$this$defaultApi_u24lambda_u241", "this", "$this$defaultApi_u24lambda_u241", "this", "$this$defaultApi_u24lambda_u241", "this"}, s = {"L$0", "L$1", "L$2", "L$0", "L$1", "L$0", "L$1", "L$0", "L$1", "L$0"})
    public static final class a extends ContinuationImpl {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public DeviceManagerApi f29609p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public Object f29610q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public Object f29611r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public Result f29612s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public Result f29613t0;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public /* synthetic */ Object f29614u0;

        /* JADX INFO: renamed from: w0, reason: collision with root package name */
        public int f29615w0;

        public a(Continuation<? super a> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f29614u0 = obj;
            this.f29615w0 |= Integer.MIN_VALUE;
            return DeviceManagerApi.this.defaultApi(null, null, this);
        }
    }

    /* JADX INFO: compiled from: DeviceManagerApi.kt */
    @DebugMetadata(c = "com.bbva.ethermobilesdk.devicemanager.DeviceManagerApi", f = "DeviceManagerApi.kt", i = {0}, l = {105}, m = "deviceCheckerResponse", n = {"this"}, s = {"L$0"})
    public static final class b extends ContinuationImpl {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public DeviceManagerApi f29616p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public /* synthetic */ Object f29617q0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public int f29619s0;

        public b(Continuation<? super b> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f29617q0 = obj;
            this.f29619s0 |= Integer.MIN_VALUE;
            return DeviceManagerApi.this.deviceCheckerResponse(this);
        }
    }

    /* JADX INFO: compiled from: DeviceManagerApi.kt */
    @DebugMetadata(c = "com.bbva.ethermobilesdk.devicemanager.DeviceManagerApi", f = "DeviceManagerApi.kt", i = {0}, l = {125}, m = "deviceIdResponse", n = {"this"}, s = {"L$0"})
    public static final class c extends ContinuationImpl {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public DeviceManagerApi f29620p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public /* synthetic */ Object f29621q0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public int f29623s0;

        public c(Continuation<? super c> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f29621q0 = obj;
            this.f29623s0 |= Integer.MIN_VALUE;
            return DeviceManagerApi.this.deviceIdResponse(null, this);
        }
    }

    /* JADX INFO: compiled from: DeviceManagerApi.kt */
    @DebugMetadata(c = "com.bbva.ethermobilesdk.devicemanager.DeviceManagerApi", f = "DeviceManagerApi.kt", i = {0}, l = {88}, m = "deviceInfoResponse", n = {"this"}, s = {"L$0"})
    public static final class d extends ContinuationImpl {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public DeviceManagerApi f29624p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public /* synthetic */ Object f29625q0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public int f29627s0;

        public d(Continuation<? super d> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f29625q0 = obj;
            this.f29627s0 |= Integer.MIN_VALUE;
            return DeviceManagerApi.this.deviceInfoResponse(this);
        }
    }

    /* JADX INFO: compiled from: DeviceManagerApi.kt */
    @DebugMetadata(c = "com.bbva.ethermobilesdk.devicemanager.DeviceManagerApi", f = "DeviceManagerApi.kt", i = {0}, l = {173}, m = "deviceTypeResponse", n = {"this"}, s = {"L$0"})
    public static final class e extends ContinuationImpl {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public DeviceManagerApi f29628p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public /* synthetic */ Object f29629q0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public int f29631s0;

        public e(Continuation<? super e> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f29629q0 = obj;
            this.f29631s0 |= Integer.MIN_VALUE;
            return DeviceManagerApi.this.deviceTypeResponse(this);
        }
    }

    /* JADX INFO: compiled from: DeviceManagerApi.kt */
    @DebugMetadata(c = "com.bbva.ethermobilesdk.devicemanager.DeviceManagerApi", f = "DeviceManagerApi.kt", i = {0, 1}, l = {146, 154}, m = "deviceUidResponse", n = {"this", "this"}, s = {"L$0", "L$0"})
    public static final class f extends ContinuationImpl {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public DeviceManagerApi f29632p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public /* synthetic */ Object f29633q0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public int f29635s0;

        public f(Continuation<? super f> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f29633q0 = obj;
            this.f29635s0 |= Integer.MIN_VALUE;
            return DeviceManagerApi.this.deviceUidResponse(null, this);
        }
    }

    public DeviceManagerApi(@NotNull Application application, @NotNull CoroutineDispatcher ioDispatcher) {
        Intrinsics.checkNotNullParameter(application, "application");
        Intrinsics.checkNotNullParameter(ioDispatcher, "ioDispatcher");
        this.f29607a = ioDispatcher;
        Injector injector = new Injector(application);
        injector.getLogger().log("Initializing Ether Device Manager version 2.4.0");
        this.f29608b = injector;
    }

    public static Result.Error a(Throwable th2) {
        return new Result.Error(th2 instanceof DeviceManagerError ? (DeviceManagerError) th2 : new DeviceManagerError(null, th2, 1, null));
    }

    /* JADX WARN: Code duplicated, block: B:49:0x00db A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:50:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:53:0x00f4 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:54:0x00f5  */
    /* JADX WARN: Code duplicated, block: B:57:0x010d A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:58:0x010e  */
    /* JADX WARN: Code duplicated, block: B:67:0x013a  */
    /* JADX WARN: Code duplicated, block: B:77:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v13, types: [com.bbva.ethermobilesdk.devicemanager.DeviceManagerApi] */
    /* JADX WARN: Type inference failed for: r1v16 */
    /* JADX WARN: Type inference failed for: r1v17 */
    /* JADX WARN: Type inference failed for: r1v18 */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX WARN: Type inference failed for: r1v9 */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v14 */
    /* JADX WARN: Type inference failed for: r8v15 */
    /* JADX WARN: Type inference failed for: r8v7, types: [com.bbva.ethermobilesdk.devicemanager.DeviceManagerApi] */
    @Nullable
    public final Object defaultApi(@NotNull DeviceIdRequest deviceIdRequest, @NotNull DeviceUIdRequest deviceUIdRequest, @NotNull Continuation<? super Result<DeviceManagerResponse.DeviceManagerDefaultResponse>> continuation) {
        a aVar;
        ?? r1;
        Object objM5535constructorimpl;
        ?? r3;
        Throwable thM5538exceptionOrNullimpl;
        Object objDeviceIdResponse;
        DeviceManagerApi deviceManagerApi;
        DeviceManagerApi deviceManagerApi2;
        DeviceUIdRequest deviceUIdRequest2;
        Result result;
        DeviceManagerApi deviceManagerApi3;
        DeviceManagerApi deviceManagerApi4;
        Result result2;
        Object objDeviceTypeResponse;
        Result result3;
        Result result4;
        DeviceManagerApi deviceManagerApi5;
        Result result5;
        Object objDeviceInfoResponse;
        Result result6;
        Result result7;
        Result result8;
        Object objDeviceCheckerResponse;
        Result result9;
        Result result10;
        Result result11;
        Result result12;
        if (continuation instanceof a) {
            aVar = (a) continuation;
            int i10 = aVar.f29615w0;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                aVar.f29615w0 = i10 - Integer.MIN_VALUE;
            } else {
                aVar = new a(continuation);
            }
        } else {
            aVar = new a(continuation);
        }
        Object objDeviceUidResponse = aVar.f29614u0;
        Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
        int i11 = aVar.f29615w0;
        ?? r10 = 1;
        try {
            if (i11 == 0) {
                ResultKt.throwOnFailure(objDeviceUidResponse);
                try {
                    kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
                    aVar.f29609p0 = this;
                    aVar.f29610q0 = deviceUIdRequest;
                    aVar.f29611r0 = this;
                    aVar.f29615w0 = 1;
                    objDeviceIdResponse = deviceIdResponse(deviceIdRequest, aVar);
                    if (objDeviceIdResponse == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    deviceManagerApi = this;
                    deviceManagerApi2 = deviceManagerApi;
                    deviceUIdRequest2 = deviceUIdRequest;
                } catch (Throwable th2) {
                    th = th2;
                    r1 = this;
                    kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
                    objM5535constructorimpl = kotlin.Result.m5535constructorimpl(ResultKt.createFailure(th));
                    r3 = r1;
                }
            } else {
                if (i11 != 1) {
                    if (i11 == 2) {
                        result = (Result) aVar.f29611r0;
                        deviceManagerApi3 = (DeviceManagerApi) aVar.f29610q0;
                        DeviceManagerApi deviceManagerApi6 = aVar.f29609p0;
                        ResultKt.throwOnFailure(objDeviceUidResponse);
                        deviceManagerApi4 = deviceManagerApi6;
                        result2 = (Result) objDeviceUidResponse;
                        aVar.f29609p0 = deviceManagerApi4;
                        aVar.f29610q0 = deviceManagerApi3;
                        aVar.f29611r0 = result;
                        aVar.f29612s0 = result2;
                        aVar.f29615w0 = 3;
                        objDeviceTypeResponse = deviceManagerApi3.deviceTypeResponse(aVar);
                        if (objDeviceTypeResponse == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        Result result13 = result;
                        result3 = result2;
                        objDeviceUidResponse = objDeviceTypeResponse;
                        result4 = result13;
                        deviceManagerApi5 = deviceManagerApi4;
                        result5 = (Result) objDeviceUidResponse;
                        aVar.f29609p0 = deviceManagerApi5;
                        aVar.f29610q0 = deviceManagerApi3;
                        aVar.f29611r0 = result4;
                        aVar.f29612s0 = result3;
                        aVar.f29613t0 = result5;
                        aVar.f29615w0 = 4;
                        objDeviceInfoResponse = deviceManagerApi3.deviceInfoResponse(aVar);
                        if (objDeviceInfoResponse == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        Result result14 = result3;
                        result6 = result5;
                        objDeviceUidResponse = objDeviceInfoResponse;
                        result7 = result14;
                        r10 = deviceManagerApi5;
                        result8 = (Result) objDeviceUidResponse;
                        aVar.f29609p0 = r10;
                        aVar.f29610q0 = result4;
                        aVar.f29611r0 = result7;
                        aVar.f29612s0 = result6;
                        aVar.f29613t0 = result8;
                        aVar.f29615w0 = 5;
                        objDeviceCheckerResponse = deviceManagerApi3.deviceCheckerResponse(aVar);
                        if (objDeviceCheckerResponse == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        result9 = result7;
                        result10 = result6;
                        result11 = result4;
                        result12 = result8;
                        objDeviceUidResponse = objDeviceCheckerResponse;
                        r1 = r10;
                        objM5535constructorimpl = kotlin.Result.m5535constructorimpl(new Result.Success(new DeviceManagerResponse.DeviceManagerDefaultResponse(result11, result9, result10, result12, (Result) objDeviceUidResponse)));
                        r3 = r1;
                        thM5538exceptionOrNullimpl = kotlin.Result.m5538exceptionOrNullimpl(objM5535constructorimpl);
                        if (thM5538exceptionOrNullimpl == null) {
                            return objM5535constructorimpl;
                        }
                        r3.getClass();
                        return a(thM5538exceptionOrNullimpl);
                    }
                    if (i11 == 3) {
                        result3 = aVar.f29612s0;
                        result4 = (Result) aVar.f29611r0;
                        deviceManagerApi3 = (DeviceManagerApi) aVar.f29610q0;
                        DeviceManagerApi deviceManagerApi7 = aVar.f29609p0;
                        ResultKt.throwOnFailure(objDeviceUidResponse);
                        deviceManagerApi5 = deviceManagerApi7;
                        result5 = (Result) objDeviceUidResponse;
                        aVar.f29609p0 = deviceManagerApi5;
                        aVar.f29610q0 = deviceManagerApi3;
                        aVar.f29611r0 = result4;
                        aVar.f29612s0 = result3;
                        aVar.f29613t0 = result5;
                        aVar.f29615w0 = 4;
                        objDeviceInfoResponse = deviceManagerApi3.deviceInfoResponse(aVar);
                        if (objDeviceInfoResponse == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        Result result15 = result3;
                        result6 = result5;
                        objDeviceUidResponse = objDeviceInfoResponse;
                        result7 = result15;
                        r10 = deviceManagerApi5;
                        result8 = (Result) objDeviceUidResponse;
                        aVar.f29609p0 = r10;
                        aVar.f29610q0 = result4;
                        aVar.f29611r0 = result7;
                        aVar.f29612s0 = result6;
                        aVar.f29613t0 = result8;
                        aVar.f29615w0 = 5;
                        objDeviceCheckerResponse = deviceManagerApi3.deviceCheckerResponse(aVar);
                        if (objDeviceCheckerResponse == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        result9 = result7;
                        result10 = result6;
                        result11 = result4;
                        result12 = result8;
                        objDeviceUidResponse = objDeviceCheckerResponse;
                        r1 = r10;
                        objM5535constructorimpl = kotlin.Result.m5535constructorimpl(new Result.Success(new DeviceManagerResponse.DeviceManagerDefaultResponse(result11, result9, result10, result12, (Result) objDeviceUidResponse)));
                        r3 = r1;
                        thM5538exceptionOrNullimpl = kotlin.Result.m5538exceptionOrNullimpl(objM5535constructorimpl);
                        if (thM5538exceptionOrNullimpl == null) {
                            return objM5535constructorimpl;
                        }
                        r3.getClass();
                        return a(thM5538exceptionOrNullimpl);
                    }
                    if (i11 != 4) {
                        if (i11 != 5) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        Result result16 = aVar.f29613t0;
                        Result result17 = aVar.f29612s0;
                        result9 = (Result) aVar.f29611r0;
                        Result result18 = (Result) aVar.f29610q0;
                        r1 = aVar.f29609p0;
                        try {
                            ResultKt.throwOnFailure(objDeviceUidResponse);
                            result12 = result16;
                            result10 = result17;
                            result11 = result18;
                            r1 = r1;
                            objM5535constructorimpl = kotlin.Result.m5535constructorimpl(new Result.Success(new DeviceManagerResponse.DeviceManagerDefaultResponse(result11, result9, result10, result12, (Result) objDeviceUidResponse)));
                            r3 = r1;
                        } catch (Throwable th3) {
                            th = th3;
                            kotlin.Result.Companion companion3 = kotlin.Result.INSTANCE;
                            objM5535constructorimpl = kotlin.Result.m5535constructorimpl(ResultKt.createFailure(th));
                            r3 = r1;
                        }
                        thM5538exceptionOrNullimpl = kotlin.Result.m5538exceptionOrNullimpl(objM5535constructorimpl);
                        if (thM5538exceptionOrNullimpl == null) {
                            return objM5535constructorimpl;
                        }
                        r3.getClass();
                        return a(thM5538exceptionOrNullimpl);
                    }
                    result6 = aVar.f29613t0;
                    result7 = aVar.f29612s0;
                    result4 = (Result) aVar.f29611r0;
                    deviceManagerApi3 = (DeviceManagerApi) aVar.f29610q0;
                    DeviceManagerApi deviceManagerApi8 = aVar.f29609p0;
                    ResultKt.throwOnFailure(objDeviceUidResponse);
                    r10 = deviceManagerApi8;
                    result8 = (Result) objDeviceUidResponse;
                    aVar.f29609p0 = r10;
                    aVar.f29610q0 = result4;
                    aVar.f29611r0 = result7;
                    aVar.f29612s0 = result6;
                    aVar.f29613t0 = result8;
                    aVar.f29615w0 = 5;
                    objDeviceCheckerResponse = deviceManagerApi3.deviceCheckerResponse(aVar);
                    if (objDeviceCheckerResponse == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    result9 = result7;
                    result10 = result6;
                    result11 = result4;
                    result12 = result8;
                    objDeviceUidResponse = objDeviceCheckerResponse;
                    r1 = r10;
                    objM5535constructorimpl = kotlin.Result.m5535constructorimpl(new Result.Success(new DeviceManagerResponse.DeviceManagerDefaultResponse(result11, result9, result10, result12, (Result) objDeviceUidResponse)));
                    r3 = r1;
                    thM5538exceptionOrNullimpl = kotlin.Result.m5538exceptionOrNullimpl(objM5535constructorimpl);
                    if (thM5538exceptionOrNullimpl == null) {
                        return objM5535constructorimpl;
                    }
                    r3.getClass();
                    return a(thM5538exceptionOrNullimpl);
                }
                DeviceManagerApi deviceManagerApi9 = (DeviceManagerApi) aVar.f29611r0;
                DeviceUIdRequest deviceUIdRequest3 = (DeviceUIdRequest) aVar.f29610q0;
                deviceManagerApi2 = aVar.f29609p0;
                try {
                    ResultKt.throwOnFailure(objDeviceUidResponse);
                    objDeviceIdResponse = objDeviceUidResponse;
                    deviceUIdRequest2 = deviceUIdRequest3;
                    deviceManagerApi = deviceManagerApi9;
                } catch (Throwable th4) {
                    th = th4;
                    r1 = deviceManagerApi2;
                    kotlin.Result.Companion companion4 = kotlin.Result.INSTANCE;
                    objM5535constructorimpl = kotlin.Result.m5535constructorimpl(ResultKt.createFailure(th));
                    r3 = r1;
                }
            }
            result = (Result) objDeviceIdResponse;
            aVar.f29609p0 = deviceManagerApi2;
            aVar.f29610q0 = deviceManagerApi;
            aVar.f29611r0 = result;
            aVar.f29615w0 = 2;
            objDeviceUidResponse = deviceManagerApi.deviceUidResponse(deviceUIdRequest2, aVar);
            if (objDeviceUidResponse == coroutine_suspended) {
                return coroutine_suspended;
            }
            deviceManagerApi3 = deviceManagerApi;
            deviceManagerApi4 = deviceManagerApi2;
            result2 = (Result) objDeviceUidResponse;
            aVar.f29609p0 = deviceManagerApi4;
            aVar.f29610q0 = deviceManagerApi3;
            aVar.f29611r0 = result;
            aVar.f29612s0 = result2;
            aVar.f29615w0 = 3;
            objDeviceTypeResponse = deviceManagerApi3.deviceTypeResponse(aVar);
            if (objDeviceTypeResponse == coroutine_suspended) {
                return coroutine_suspended;
            }
            Result result19 = result;
            result3 = result2;
            objDeviceUidResponse = objDeviceTypeResponse;
            result4 = result19;
            deviceManagerApi5 = deviceManagerApi4;
            result5 = (Result) objDeviceUidResponse;
            aVar.f29609p0 = deviceManagerApi5;
            aVar.f29610q0 = deviceManagerApi3;
            aVar.f29611r0 = result4;
            aVar.f29612s0 = result3;
            aVar.f29613t0 = result5;
            aVar.f29615w0 = 4;
            objDeviceInfoResponse = deviceManagerApi3.deviceInfoResponse(aVar);
            if (objDeviceInfoResponse == coroutine_suspended) {
                return coroutine_suspended;
            }
            Result result110 = result3;
            result6 = result5;
            objDeviceUidResponse = objDeviceInfoResponse;
            result7 = result110;
            r10 = deviceManagerApi5;
            result8 = (Result) objDeviceUidResponse;
            aVar.f29609p0 = r10;
            aVar.f29610q0 = result4;
            aVar.f29611r0 = result7;
            aVar.f29612s0 = result6;
            aVar.f29613t0 = result8;
            aVar.f29615w0 = 5;
            objDeviceCheckerResponse = deviceManagerApi3.deviceCheckerResponse(aVar);
            if (objDeviceCheckerResponse == coroutine_suspended) {
                return coroutine_suspended;
            }
            result9 = result7;
            result10 = result6;
            result11 = result4;
            result12 = result8;
            objDeviceUidResponse = objDeviceCheckerResponse;
            r1 = r10;
            objM5535constructorimpl = kotlin.Result.m5535constructorimpl(new Result.Success(new DeviceManagerResponse.DeviceManagerDefaultResponse(result11, result9, result10, result12, (Result) objDeviceUidResponse)));
            r3 = r1;
            thM5538exceptionOrNullimpl = kotlin.Result.m5538exceptionOrNullimpl(objM5535constructorimpl);
            if (thM5538exceptionOrNullimpl == null) {
                return objM5535constructorimpl;
            }
            r3.getClass();
            return a(thM5538exceptionOrNullimpl);
        } catch (Throwable th5) {
            th = th5;
            r1 = r10;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object deviceCheckerResponse(@NotNull Continuation<? super Result<DeviceCheckerResponse>> continuation) {
        b bVar;
        DeviceManagerApi deviceManagerApi;
        Object objM5535constructorimpl;
        if (continuation instanceof b) {
            bVar = (b) continuation;
            int i10 = bVar.f29619s0;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                bVar.f29619s0 = i10 - Integer.MIN_VALUE;
            } else {
                bVar = new b(continuation);
            }
        } else {
            bVar = new b(continuation);
        }
        Object objInvoke = bVar.f29617q0;
        Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
        int i11 = bVar.f29619s0;
        if (i11 == 0) {
            ResultKt.throwOnFailure(objInvoke);
            try {
                kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
                GetDeviceCheckerUseCase getDeviceCheckerUseCase = new GetDeviceCheckerUseCase(this.f29608b.getDeviceCheckerRepository(), this.f29607a);
                Unit unit = Unit.INSTANCE;
                bVar.f29616p0 = this;
                bVar.f29619s0 = 1;
                objInvoke = getDeviceCheckerUseCase.invoke(unit, bVar);
                if (objInvoke == coroutine_suspended) {
                    return coroutine_suspended;
                }
                deviceManagerApi = this;
            } catch (Throwable th2) {
                th = th2;
                deviceManagerApi = this;
                kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
                objM5535constructorimpl = kotlin.Result.m5535constructorimpl(ResultKt.createFailure(th));
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            deviceManagerApi = bVar.f29616p0;
            try {
                ResultKt.throwOnFailure(objInvoke);
            } catch (Throwable th3) {
                th = th3;
                kotlin.Result.Companion companion3 = kotlin.Result.INSTANCE;
                objM5535constructorimpl = kotlin.Result.m5535constructorimpl(ResultKt.createFailure(th));
            }
        }
        objM5535constructorimpl = kotlin.Result.m5535constructorimpl(new Result.Success((DeviceCheckerResponse) com.bbva.ethermobile.help.kit.result.ResultKt.getOrThrow((Result) objInvoke)));
        Throwable thM5538exceptionOrNullimpl = kotlin.Result.m5538exceptionOrNullimpl(objM5535constructorimpl);
        if (thM5538exceptionOrNullimpl == null) {
            return objM5535constructorimpl;
        }
        deviceManagerApi.getClass();
        return a(thM5538exceptionOrNullimpl);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    @Nullable
    public final Object deviceIdResponse(@NotNull DeviceIdRequest deviceIdRequest, @NotNull Continuation<? super Result<DeviceIdResponse>> continuation) {
        c cVar;
        DeviceManagerApi deviceManagerApi;
        Object objM5535constructorimpl;
        Injector injector = this.f29608b;
        if (continuation instanceof c) {
            cVar = (c) continuation;
            int i10 = cVar.f29623s0;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                cVar.f29623s0 = i10 - Integer.MIN_VALUE;
            } else {
                cVar = new c(continuation);
            }
        } else {
            cVar = new c(continuation);
        }
        Object objInvoke = cVar.f29621q0;
        Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
        int i11 = cVar.f29623s0;
        if (i11 == 0) {
            ResultKt.throwOnFailure(objInvoke);
            try {
                kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
                GetDeviceIdUseCase getDeviceIdUseCase = new GetDeviceIdUseCase(injector.getDeviceInfoRepository(), injector.getCipherJwtSignRepository(), injector.getLogger(), this.f29607a);
                cVar.f29620p0 = this;
                cVar.f29623s0 = 1;
                objInvoke = getDeviceIdUseCase.invoke(deviceIdRequest, cVar);
                if (objInvoke == coroutine_suspended) {
                    return coroutine_suspended;
                }
                deviceManagerApi = this;
            } catch (Throwable th2) {
                th = th2;
                deviceManagerApi = this;
                kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
                objM5535constructorimpl = kotlin.Result.m5535constructorimpl(ResultKt.createFailure(th));
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            deviceManagerApi = cVar.f29620p0;
            try {
                ResultKt.throwOnFailure(objInvoke);
            } catch (Throwable th3) {
                th = th3;
                kotlin.Result.Companion companion3 = kotlin.Result.INSTANCE;
                objM5535constructorimpl = kotlin.Result.m5535constructorimpl(ResultKt.createFailure(th));
            }
        }
        objM5535constructorimpl = kotlin.Result.m5535constructorimpl(new Result.Success((DeviceIdResponse) com.bbva.ethermobile.help.kit.result.ResultKt.getOrThrow((Result) objInvoke)));
        Throwable thM5538exceptionOrNullimpl = kotlin.Result.m5538exceptionOrNullimpl(objM5535constructorimpl);
        if (thM5538exceptionOrNullimpl == null) {
            return objM5535constructorimpl;
        }
        deviceManagerApi.getClass();
        return a(thM5538exceptionOrNullimpl);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object deviceInfoResponse(@NotNull Continuation<? super Result<DeviceInfoResponse>> continuation) {
        d dVar;
        DeviceManagerApi deviceManagerApi;
        Object objM5535constructorimpl;
        if (continuation instanceof d) {
            dVar = (d) continuation;
            int i10 = dVar.f29627s0;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                dVar.f29627s0 = i10 - Integer.MIN_VALUE;
            } else {
                dVar = new d(continuation);
            }
        } else {
            dVar = new d(continuation);
        }
        Object objInvoke = dVar.f29625q0;
        Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
        int i11 = dVar.f29627s0;
        if (i11 == 0) {
            ResultKt.throwOnFailure(objInvoke);
            try {
                kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
                GetDeviceInfoUseCase getDeviceInfoUseCase = new GetDeviceInfoUseCase(this.f29608b.getDeviceInfoRepository(), this.f29607a);
                Unit unit = Unit.INSTANCE;
                dVar.f29624p0 = this;
                dVar.f29627s0 = 1;
                objInvoke = getDeviceInfoUseCase.invoke(unit, dVar);
                if (objInvoke == coroutine_suspended) {
                    return coroutine_suspended;
                }
                deviceManagerApi = this;
            } catch (Throwable th2) {
                th = th2;
                deviceManagerApi = this;
                kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
                objM5535constructorimpl = kotlin.Result.m5535constructorimpl(ResultKt.createFailure(th));
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            deviceManagerApi = dVar.f29624p0;
            try {
                ResultKt.throwOnFailure(objInvoke);
            } catch (Throwable th3) {
                th = th3;
                kotlin.Result.Companion companion3 = kotlin.Result.INSTANCE;
                objM5535constructorimpl = kotlin.Result.m5535constructorimpl(ResultKt.createFailure(th));
            }
        }
        objM5535constructorimpl = kotlin.Result.m5535constructorimpl(new Result.Success((DeviceInfoResponse) com.bbva.ethermobile.help.kit.result.ResultKt.getOrThrow((Result) objInvoke)));
        Throwable thM5538exceptionOrNullimpl = kotlin.Result.m5538exceptionOrNullimpl(objM5535constructorimpl);
        if (thM5538exceptionOrNullimpl == null) {
            return objM5535constructorimpl;
        }
        deviceManagerApi.getClass();
        return a(thM5538exceptionOrNullimpl);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object deviceTypeResponse(@NotNull Continuation<? super Result<DeviceTypeResponse>> continuation) {
        e eVar;
        DeviceManagerApi deviceManagerApi;
        Object objM5535constructorimpl;
        if (continuation instanceof e) {
            eVar = (e) continuation;
            int i10 = eVar.f29631s0;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                eVar.f29631s0 = i10 - Integer.MIN_VALUE;
            } else {
                eVar = new e(continuation);
            }
        } else {
            eVar = new e(continuation);
        }
        Object objInvoke = eVar.f29629q0;
        Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
        int i11 = eVar.f29631s0;
        if (i11 == 0) {
            ResultKt.throwOnFailure(objInvoke);
            try {
                kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
                GetDeviceTypeUseCase getDeviceTypeUseCase = new GetDeviceTypeUseCase(this.f29608b.getDeviceCheckerRepository(), this.f29607a);
                Unit unit = Unit.INSTANCE;
                eVar.f29628p0 = this;
                eVar.f29631s0 = 1;
                objInvoke = getDeviceTypeUseCase.invoke(unit, eVar);
                if (objInvoke == coroutine_suspended) {
                    return coroutine_suspended;
                }
                deviceManagerApi = this;
            } catch (Throwable th2) {
                th = th2;
                deviceManagerApi = this;
                kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
                objM5535constructorimpl = kotlin.Result.m5535constructorimpl(ResultKt.createFailure(th));
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            deviceManagerApi = eVar.f29628p0;
            try {
                ResultKt.throwOnFailure(objInvoke);
            } catch (Throwable th3) {
                th = th3;
                kotlin.Result.Companion companion3 = kotlin.Result.INSTANCE;
                objM5535constructorimpl = kotlin.Result.m5535constructorimpl(ResultKt.createFailure(th));
            }
        }
        objM5535constructorimpl = kotlin.Result.m5535constructorimpl(new Result.Success((DeviceTypeResponse) com.bbva.ethermobile.help.kit.result.ResultKt.getOrThrow((Result) objInvoke)));
        Throwable thM5538exceptionOrNullimpl = kotlin.Result.m5538exceptionOrNullimpl(objM5535constructorimpl);
        if (thM5538exceptionOrNullimpl == null) {
            return objM5535constructorimpl;
        }
        deviceManagerApi.getClass();
        return a(thM5538exceptionOrNullimpl);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v0, types: [com.bbva.ethermobilesdk.devicemanager.model.input.DeviceUIdRequest] */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v13 */
    /* JADX WARN: Type inference failed for: r7v19 */
    /* JADX WARN: Type inference failed for: r7v2 */
    /* JADX WARN: Type inference failed for: r7v20 */
    /* JADX WARN: Type inference failed for: r7v21 */
    /* JADX WARN: Type inference failed for: r7v22 */
    /* JADX WARN: Type inference failed for: r7v3, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v4 */
    @Nullable
    public final Object deviceUidResponse(@NotNull DeviceUIdRequest deviceUIdRequest, @NotNull Continuation<? super Result<DeviceUIdResponse>> continuation) {
        f fVar;
        Object objM5535constructorimpl;
        ?? r10;
        DeviceManagerApi deviceManagerApi;
        DeviceManagerApi deviceManagerApi2;
        DeviceUIdResponse deviceUIdResponse;
        if (continuation instanceof f) {
            fVar = (f) continuation;
            int i10 = fVar.f29635s0;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                fVar.f29635s0 = i10 - Integer.MIN_VALUE;
            } else {
                fVar = new f(continuation);
            }
        } else {
            fVar = new f(continuation);
        }
        Object objInvoke = fVar.f29633q0;
        Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
        int i11 = fVar.f29635s0;
        try {
            if (i11 == 0) {
                ResultKt.throwOnFailure(objInvoke);
                try {
                    kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
                    DeviceUidPolicy policy = deviceUIdRequest.getPolicy();
                    boolean zAreEqual = Intrinsics.areEqual(policy, DeviceUidPolicy.Default.INSTANCE);
                    Injector injector = this.f29608b;
                    CoroutineDispatcher coroutineDispatcher = this.f29607a;
                    if (zAreEqual) {
                        GetDeviceUidDefaultUseCase getDeviceUidDefaultUseCase = new GetDeviceUidDefaultUseCase(injector.getDeviceUidRepository(), injector.getLogger(), coroutineDispatcher);
                        Unit unit = Unit.INSTANCE;
                        fVar.f29632p0 = this;
                        fVar.f29635s0 = 1;
                        objInvoke = getDeviceUidDefaultUseCase.invoke(unit, fVar);
                        if (objInvoke == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        deviceManagerApi2 = this;
                        deviceUIdResponse = (DeviceUIdResponse) com.bbva.ethermobile.help.kit.result.ResultKt.getOrThrow((Result) objInvoke);
                        deviceUIdRequest = deviceManagerApi2;
                    } else {
                        if (!Intrinsics.areEqual(policy, DeviceUidPolicy.Short.INSTANCE)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        GetDeviceUidShortUseCase getDeviceUidShortUseCase = new GetDeviceUidShortUseCase(injector.getDeviceUidRepository(), injector.getLogger(), coroutineDispatcher);
                        Unit unit2 = Unit.INSTANCE;
                        fVar.f29632p0 = this;
                        fVar.f29635s0 = 2;
                        objInvoke = getDeviceUidShortUseCase.invoke(unit2, fVar);
                        if (objInvoke == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        deviceManagerApi = this;
                        deviceUIdResponse = (DeviceUIdResponse) com.bbva.ethermobile.help.kit.result.ResultKt.getOrThrow((Result) objInvoke);
                        deviceUIdRequest = deviceManagerApi;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    deviceUIdRequest = this;
                    kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
                    objM5535constructorimpl = kotlin.Result.m5535constructorimpl(ResultKt.createFailure(th));
                    r10 = deviceUIdRequest;
                }
            } else if (i11 == 1) {
                DeviceManagerApi deviceManagerApi3 = fVar.f29632p0;
                ResultKt.throwOnFailure(objInvoke);
                deviceManagerApi2 = deviceManagerApi3;
                deviceUIdResponse = (DeviceUIdResponse) com.bbva.ethermobile.help.kit.result.ResultKt.getOrThrow((Result) objInvoke);
                deviceUIdRequest = deviceManagerApi2;
            } else {
                if (i11 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                DeviceManagerApi deviceManagerApi4 = fVar.f29632p0;
                ResultKt.throwOnFailure(objInvoke);
                deviceManagerApi = deviceManagerApi4;
                deviceUIdResponse = (DeviceUIdResponse) com.bbva.ethermobile.help.kit.result.ResultKt.getOrThrow((Result) objInvoke);
                deviceUIdRequest = deviceManagerApi;
            }
            objM5535constructorimpl = kotlin.Result.m5535constructorimpl(new Result.Success(deviceUIdResponse));
            r10 = deviceUIdRequest;
        } catch (Throwable th3) {
            th = th3;
        }
        Throwable thM5538exceptionOrNullimpl = kotlin.Result.m5538exceptionOrNullimpl(objM5535constructorimpl);
        if (thM5538exceptionOrNullimpl == null) {
            return objM5535constructorimpl;
        }
        r10.getClass();
        return a(thM5538exceptionOrNullimpl);
    }

    public /* synthetic */ DeviceManagerApi(Application application, CoroutineDispatcher coroutineDispatcher, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(application, (i10 & 2) != 0 ? Dispatchers.getIO() : coroutineDispatcher);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public DeviceManagerApi(@NotNull Application application) {
        this(application, Dispatchers.getIO());
        Intrinsics.checkNotNullParameter(application, "application");
    }
}

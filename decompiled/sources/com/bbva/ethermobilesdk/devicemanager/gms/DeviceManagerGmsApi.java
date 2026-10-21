package com.bbva.ethermobilesdk.devicemanager.gms;

import android.app.Application;
import com.bbva.ethermobile.help.kit.result.Result;
import com.bbva.ethermobilesdk.devicemanager.DeviceManagerApi;
import com.bbva.ethermobilesdk.devicemanager.domain.usecase.GetLastGeolocationUseCase;
import com.bbva.ethermobilesdk.devicemanager.gms.di.Injector;
import com.bbva.ethermobilesdk.devicemanager.gms.domain.usecase.GetDeviceCheckerPlayIntegrityUseCase;
import com.bbva.ethermobilesdk.devicemanager.model.input.DeviceCheckerPlayIntegrityRequest;
import com.bbva.ethermobilesdk.devicemanager.model.input.DeviceIdRequest;
import com.bbva.ethermobilesdk.devicemanager.model.input.DeviceUIdRequest;
import com.bbva.ethermobilesdk.devicemanager.model.output.DeviceCheckerPlayIntegrityResponse;
import com.bbva.ethermobilesdk.devicemanager.model.output.DeviceManagerResponse;
import com.bbva.ethermobilesdk.devicemanager.model.output.GeolocationResponse;
import com.bbva.ethermobilesdk.devicemanager.model.output.error.DeviceManagerError;
import com.bbva.nativesettings.common.Constants;
import kotlin.Metadata;
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

/* JADX INFO: compiled from: DeviceManagerGmsApi.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B%\b\u0000\u0012\u0006\u0010\u0016\u001a\u00020\u0015\u0012\b\b\u0002\u0010\u0018\u001a\u00020\u0017\u0012\b\b\u0002\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b\u001b\u0010\u001cB\u0011\b\u0016\u0012\u0006\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u001b\u0010\u001dJ.\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0086@¢\u0006\u0004\b\n\u0010\u000bJ\u001e\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0086@¢\u0006\u0004\b\r\u0010\u000eJ\u0016\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\bH\u0086@¢\u0006\u0004\b\u0010\u0010\u0011J\u001e\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\b2\u0006\u0010\u0003\u001a\u00020\u0002H\u0086@¢\u0006\u0004\b\u0013\u0010\u0014¨\u0006\u001e"}, d2 = {"Lcom/bbva/ethermobilesdk/devicemanager/gms/DeviceManagerGmsApi;", "", "Lcom/bbva/ethermobilesdk/devicemanager/model/input/DeviceIdRequest;", "deviceIdRequest", "Lcom/bbva/ethermobilesdk/devicemanager/model/input/DeviceUIdRequest;", "deviceUIdRequest", "Lcom/bbva/ethermobilesdk/devicemanager/model/input/DeviceCheckerPlayIntegrityRequest;", "deviceCheckerPlayIntegrityRequest", "Lcom/bbva/ethermobile/help/kit/result/Result;", "Lcom/bbva/ethermobilesdk/devicemanager/model/output/DeviceManagerResponse$DeviceManagerGmsResponse;", "gmsApi", "(Lcom/bbva/ethermobilesdk/devicemanager/model/input/DeviceIdRequest;Lcom/bbva/ethermobilesdk/devicemanager/model/input/DeviceUIdRequest;Lcom/bbva/ethermobilesdk/devicemanager/model/input/DeviceCheckerPlayIntegrityRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/bbva/ethermobilesdk/devicemanager/model/output/DeviceCheckerPlayIntegrityResponse;", "deviceCheckerPlayIntegrityResponse", "(Lcom/bbva/ethermobilesdk/devicemanager/model/input/DeviceCheckerPlayIntegrityRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/bbva/ethermobilesdk/devicemanager/model/output/GeolocationResponse;", "geolocationResponse", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/bbva/ethermobilesdk/devicemanager/model/output/DeviceManagerResponse$DeviceManagerGmsIdResponse;", "gmsDeviceIdResponse", "(Lcom/bbva/ethermobilesdk/devicemanager/model/input/DeviceIdRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Landroid/app/Application;", Constants.APPLICATION, "Lkotlinx/coroutines/CoroutineDispatcher;", "ioDispatcher", "Lcom/bbva/ethermobilesdk/devicemanager/DeviceManagerApi;", "deviceManagerApi", "<init>", "(Landroid/app/Application;Lkotlinx/coroutines/CoroutineDispatcher;Lcom/bbva/ethermobilesdk/devicemanager/DeviceManagerApi;)V", "(Landroid/app/Application;)V", "devicemanager-gms_release"}, k = 1, mv = {2, 0, 0})
public final class DeviceManagerGmsApi {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final CoroutineDispatcher f29712a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final DeviceManagerApi f29713b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final Injector f29714c;

    /* JADX INFO: compiled from: DeviceManagerGmsApi.kt */
    @DebugMetadata(c = "com.bbva.ethermobilesdk.devicemanager.gms.DeviceManagerGmsApi", f = "DeviceManagerGmsApi.kt", i = {0}, l = {97}, m = "deviceCheckerPlayIntegrityResponse", n = {"this"}, s = {"L$0"})
    public static final class a extends ContinuationImpl {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public DeviceManagerGmsApi f29715p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public /* synthetic */ Object f29716q0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public int f29718s0;

        public a(Continuation<? super a> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f29716q0 = obj;
            this.f29718s0 |= Integer.MIN_VALUE;
            return DeviceManagerGmsApi.this.deviceCheckerPlayIntegrityResponse(null, this);
        }
    }

    /* JADX INFO: compiled from: DeviceManagerGmsApi.kt */
    @DebugMetadata(c = "com.bbva.ethermobilesdk.devicemanager.gms.DeviceManagerGmsApi", f = "DeviceManagerGmsApi.kt", i = {0}, l = {113}, m = "geolocationResponse", n = {"this"}, s = {"L$0"})
    public static final class b extends ContinuationImpl {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public DeviceManagerGmsApi f29719p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public /* synthetic */ Object f29720q0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public int f29722s0;

        public b(Continuation<? super b> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f29720q0 = obj;
            this.f29722s0 |= Integer.MIN_VALUE;
            return DeviceManagerGmsApi.this.geolocationResponse(this);
        }
    }

    /* JADX INFO: compiled from: DeviceManagerGmsApi.kt */
    @DebugMetadata(c = "com.bbva.ethermobilesdk.devicemanager.gms.DeviceManagerGmsApi", f = "DeviceManagerGmsApi.kt", i = {0, 0, 0, 0, 1, 1, 1, 2, 2, 2, 3, 3, 3, 4, 4, 4, 5, 5, 6}, l = {67, 68, 69, 70, 71, 72, 75}, m = "gmsApi", n = {"this", "deviceUIdRequest", "deviceCheckerPlayIntegrityRequest", "$this$gmsApi_u24lambda_u241", "this", "deviceCheckerPlayIntegrityRequest", "$this$gmsApi_u24lambda_u241", "this", "deviceCheckerPlayIntegrityRequest", "$this$gmsApi_u24lambda_u241", "this", "deviceCheckerPlayIntegrityRequest", "$this$gmsApi_u24lambda_u241", "this", "deviceCheckerPlayIntegrityRequest", "$this$gmsApi_u24lambda_u241", "this", "$this$gmsApi_u24lambda_u241", "this"}, s = {"L$0", "L$1", "L$2", "L$3", "L$0", "L$1", "L$2", "L$0", "L$1", "L$2", "L$0", "L$1", "L$2", "L$0", "L$1", "L$2", "L$0", "L$1", "L$0"})
    public static final class c extends ContinuationImpl {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public DeviceManagerGmsApi f29723p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public Object f29724q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public Object f29725r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public Object f29726s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public Result f29727t0;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public Result f29728u0;
        public Result v0;

        /* JADX INFO: renamed from: w0, reason: collision with root package name */
        public /* synthetic */ Object f29729w0;

        /* JADX INFO: renamed from: y0, reason: collision with root package name */
        public int f29731y0;

        public c(Continuation<? super c> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f29729w0 = obj;
            this.f29731y0 |= Integer.MIN_VALUE;
            return DeviceManagerGmsApi.this.gmsApi(null, null, null, this);
        }
    }

    /* JADX INFO: compiled from: DeviceManagerGmsApi.kt */
    @DebugMetadata(c = "com.bbva.ethermobilesdk.devicemanager.gms.DeviceManagerGmsApi", f = "DeviceManagerGmsApi.kt", i = {0}, l = {131}, m = "gmsDeviceIdResponse", n = {"this"}, s = {"L$0"})
    public static final class d extends ContinuationImpl {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public DeviceManagerGmsApi f29732p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public /* synthetic */ Object f29733q0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public int f29735s0;

        public d(Continuation<? super d> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f29733q0 = obj;
            this.f29735s0 |= Integer.MIN_VALUE;
            return DeviceManagerGmsApi.this.gmsDeviceIdResponse(null, this);
        }
    }

    public DeviceManagerGmsApi(@NotNull Application application, @NotNull CoroutineDispatcher ioDispatcher, @NotNull DeviceManagerApi deviceManagerApi) {
        Intrinsics.checkNotNullParameter(application, "application");
        Intrinsics.checkNotNullParameter(ioDispatcher, "ioDispatcher");
        Intrinsics.checkNotNullParameter(deviceManagerApi, "deviceManagerApi");
        this.f29712a = ioDispatcher;
        this.f29713b = deviceManagerApi;
        com.bbva.ethermobilesdk.devicemanager.di.Injector injector = new com.bbva.ethermobilesdk.devicemanager.di.Injector(application);
        Injector injector2 = new Injector(injector, application);
        injector.getLogger().log("Initializing Ether Device Manager GMS version 2.4.0");
        this.f29714c = injector2;
    }

    public static Result.Error a(Throwable th2) {
        return new Result.Error(th2 instanceof DeviceManagerError ? (DeviceManagerError) th2 : new DeviceManagerError(null, th2, 1, null));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object deviceCheckerPlayIntegrityResponse(@NotNull DeviceCheckerPlayIntegrityRequest deviceCheckerPlayIntegrityRequest, @NotNull Continuation<? super Result<DeviceCheckerPlayIntegrityResponse>> continuation) {
        a aVar;
        DeviceManagerGmsApi deviceManagerGmsApi;
        Object objM5535constructorimpl;
        if (continuation instanceof a) {
            aVar = (a) continuation;
            int i10 = aVar.f29718s0;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                aVar.f29718s0 = i10 - Integer.MIN_VALUE;
            } else {
                aVar = new a(continuation);
            }
        } else {
            aVar = new a(continuation);
        }
        Object objInvoke = aVar.f29716q0;
        Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
        int i11 = aVar.f29718s0;
        if (i11 == 0) {
            ResultKt.throwOnFailure(objInvoke);
            try {
                kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
                GetDeviceCheckerPlayIntegrityUseCase getDeviceCheckerPlayIntegrityUseCase = new GetDeviceCheckerPlayIntegrityUseCase(this.f29714c.getDeviceCheckerPlayIntegrityRepository(), this.f29712a);
                aVar.f29715p0 = this;
                aVar.f29718s0 = 1;
                objInvoke = getDeviceCheckerPlayIntegrityUseCase.invoke(deviceCheckerPlayIntegrityRequest, aVar);
                if (objInvoke == coroutine_suspended) {
                    return coroutine_suspended;
                }
                deviceManagerGmsApi = this;
            } catch (Throwable th2) {
                th = th2;
                deviceManagerGmsApi = this;
                kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
                objM5535constructorimpl = kotlin.Result.m5535constructorimpl(ResultKt.createFailure(th));
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            deviceManagerGmsApi = aVar.f29715p0;
            try {
                ResultKt.throwOnFailure(objInvoke);
            } catch (Throwable th3) {
                th = th3;
                kotlin.Result.Companion companion3 = kotlin.Result.INSTANCE;
                objM5535constructorimpl = kotlin.Result.m5535constructorimpl(ResultKt.createFailure(th));
            }
        }
        objM5535constructorimpl = kotlin.Result.m5535constructorimpl(new Result.Success((DeviceCheckerPlayIntegrityResponse) com.bbva.ethermobile.help.kit.result.ResultKt.getOrThrow((Result) objInvoke)));
        Throwable thM5538exceptionOrNullimpl = kotlin.Result.m5538exceptionOrNullimpl(objM5535constructorimpl);
        if (thM5538exceptionOrNullimpl == null) {
            return objM5535constructorimpl;
        }
        deviceManagerGmsApi.getClass();
        return a(thM5538exceptionOrNullimpl);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object geolocationResponse(@NotNull Continuation<? super Result<GeolocationResponse>> continuation) {
        b bVar;
        DeviceManagerGmsApi deviceManagerGmsApi;
        Object objM5535constructorimpl;
        if (continuation instanceof b) {
            bVar = (b) continuation;
            int i10 = bVar.f29722s0;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                bVar.f29722s0 = i10 - Integer.MIN_VALUE;
            } else {
                bVar = new b(continuation);
            }
        } else {
            bVar = new b(continuation);
        }
        Object objInvoke = bVar.f29720q0;
        Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
        int i11 = bVar.f29722s0;
        if (i11 == 0) {
            ResultKt.throwOnFailure(objInvoke);
            try {
                kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
                GetLastGeolocationUseCase getLastGeolocationUseCase = new GetLastGeolocationUseCase(this.f29714c.getGeolocationRepository(), this.f29712a);
                Unit unit = Unit.INSTANCE;
                bVar.f29719p0 = this;
                bVar.f29722s0 = 1;
                objInvoke = getLastGeolocationUseCase.invoke(unit, bVar);
                if (objInvoke == coroutine_suspended) {
                    return coroutine_suspended;
                }
                deviceManagerGmsApi = this;
            } catch (Throwable th2) {
                th = th2;
                deviceManagerGmsApi = this;
                kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
                objM5535constructorimpl = kotlin.Result.m5535constructorimpl(ResultKt.createFailure(th));
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            deviceManagerGmsApi = bVar.f29719p0;
            try {
                ResultKt.throwOnFailure(objInvoke);
            } catch (Throwable th3) {
                th = th3;
                kotlin.Result.Companion companion3 = kotlin.Result.INSTANCE;
                objM5535constructorimpl = kotlin.Result.m5535constructorimpl(ResultKt.createFailure(th));
            }
        }
        objM5535constructorimpl = kotlin.Result.m5535constructorimpl(new Result.Success((GeolocationResponse) com.bbva.ethermobile.help.kit.result.ResultKt.getOrThrow((Result) objInvoke)));
        Throwable thM5538exceptionOrNullimpl = kotlin.Result.m5538exceptionOrNullimpl(objM5535constructorimpl);
        if (thM5538exceptionOrNullimpl == null) {
            return objM5535constructorimpl;
        }
        deviceManagerGmsApi.getClass();
        return a(thM5538exceptionOrNullimpl);
    }

    /* JADX WARN: Code duplicated, block: B:50:0x0134 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:51:0x0135  */
    /* JADX WARN: Code duplicated, block: B:54:0x0150 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:55:0x0151  */
    /* JADX WARN: Code duplicated, block: B:58:0x016e A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:59:0x016f  */
    /* JADX WARN: Code duplicated, block: B:62:0x0191 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:63:0x0192  */
    /* JADX WARN: Code duplicated, block: B:66:0x01b1 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:67:0x01b2  */
    /* JADX WARN: Code duplicated, block: B:70:0x01d3 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:71:0x01d4  */
    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    /* JADX WARN: Code duplicated, block: B:80:0x0202  */
    /* JADX WARN: Code duplicated, block: B:92:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Not initialized variable reg: 10, insn: 0x0070: MOVE (r2 I:??[OBJECT, ARRAY]) = (r10 I:??[OBJECT, ARRAY]) (LINE:113), block:B:21:0x0070 */
    @Nullable
    public final Object gmsApi(@NotNull DeviceIdRequest deviceIdRequest, @NotNull DeviceUIdRequest deviceUIdRequest, @NotNull DeviceCheckerPlayIntegrityRequest deviceCheckerPlayIntegrityRequest, @NotNull Continuation<? super Result<DeviceManagerResponse.DeviceManagerGmsResponse>> continuation) {
        c cVar;
        DeviceManagerGmsApi deviceManagerGmsApi;
        DeviceManagerGmsApi deviceManagerGmsApi2;
        Object objM5535constructorimpl;
        Throwable thM5538exceptionOrNullimpl;
        DeviceUIdRequest deviceUIdRequest2;
        DeviceCheckerPlayIntegrityRequest deviceCheckerPlayIntegrityRequest2;
        DeviceManagerGmsApi deviceManagerGmsApi3;
        DeviceManagerGmsApi deviceManagerGmsApi4;
        Result result;
        Object objDeviceUidResponse;
        Result result2;
        DeviceCheckerPlayIntegrityRequest deviceCheckerPlayIntegrityRequest3;
        Result result3;
        Object objDeviceTypeResponse;
        Result result4;
        DeviceCheckerPlayIntegrityRequest deviceCheckerPlayIntegrityRequest4;
        Result result5;
        Object objDeviceInfoResponse;
        Result result6;
        DeviceCheckerPlayIntegrityRequest deviceCheckerPlayIntegrityRequest5;
        DeviceManagerGmsApi deviceManagerGmsApi5;
        Result result7;
        Result result8;
        Result result9;
        Object objDeviceCheckerResponse;
        Result result10;
        DeviceCheckerPlayIntegrityRequest deviceCheckerPlayIntegrityRequest6;
        DeviceManagerGmsApi deviceManagerGmsApi6;
        Result result11;
        Result result12;
        Object objDeviceCheckerPlayIntegrityResponse;
        Result result13;
        DeviceManagerGmsApi deviceManagerGmsApi7;
        Result result14;
        Result result15;
        Result result16;
        Result result17;
        Result result18;
        Object objGeolocationResponse;
        Result result19;
        Result result20;
        Result result21;
        Result result22;
        Result result23;
        if (continuation instanceof c) {
            cVar = (c) continuation;
            int i10 = cVar.f29731y0;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                cVar.f29731y0 = i10 - Integer.MIN_VALUE;
            } else {
                cVar = new c(continuation);
            }
        } else {
            cVar = new c(continuation);
        }
        Object objDeviceIdResponse = cVar.f29729w0;
        Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
        try {
            try {
                switch (cVar.f29731y0) {
                    case 0:
                        ResultKt.throwOnFailure(objDeviceIdResponse);
                        try {
                            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
                            DeviceManagerApi deviceManagerApi = this.f29713b;
                            cVar.f29723p0 = this;
                            deviceUIdRequest2 = deviceUIdRequest;
                            cVar.f29724q0 = deviceUIdRequest2;
                            deviceCheckerPlayIntegrityRequest2 = deviceCheckerPlayIntegrityRequest;
                            cVar.f29725r0 = deviceCheckerPlayIntegrityRequest2;
                            cVar.f29726s0 = this;
                            cVar.f29731y0 = 1;
                            objDeviceIdResponse = deviceManagerApi.deviceIdResponse(deviceIdRequest, cVar);
                            if (objDeviceIdResponse == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            deviceManagerGmsApi3 = this;
                            deviceManagerGmsApi4 = deviceManagerGmsApi3;
                            result = (Result) objDeviceIdResponse;
                            DeviceManagerApi deviceManagerApi2 = deviceManagerGmsApi3.f29713b;
                            cVar.f29723p0 = deviceManagerGmsApi4;
                            cVar.f29724q0 = deviceCheckerPlayIntegrityRequest2;
                            cVar.f29725r0 = deviceManagerGmsApi3;
                            cVar.f29726s0 = result;
                            cVar.f29731y0 = 2;
                            objDeviceUidResponse = deviceManagerApi2.deviceUidResponse(deviceUIdRequest2, cVar);
                            if (objDeviceUidResponse == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            DeviceCheckerPlayIntegrityRequest deviceCheckerPlayIntegrityRequest7 = deviceCheckerPlayIntegrityRequest2;
                            result2 = result;
                            objDeviceIdResponse = objDeviceUidResponse;
                            deviceCheckerPlayIntegrityRequest3 = deviceCheckerPlayIntegrityRequest7;
                            result3 = (Result) objDeviceIdResponse;
                            DeviceManagerApi deviceManagerApi3 = deviceManagerGmsApi3.f29713b;
                            cVar.f29723p0 = deviceManagerGmsApi4;
                            cVar.f29724q0 = deviceCheckerPlayIntegrityRequest3;
                            cVar.f29725r0 = deviceManagerGmsApi3;
                            cVar.f29726s0 = result2;
                            cVar.f29727t0 = result3;
                            cVar.f29731y0 = 3;
                            objDeviceTypeResponse = deviceManagerApi3.deviceTypeResponse(cVar);
                            if (objDeviceTypeResponse == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            DeviceCheckerPlayIntegrityRequest deviceCheckerPlayIntegrityRequest8 = deviceCheckerPlayIntegrityRequest3;
                            result4 = result3;
                            objDeviceIdResponse = objDeviceTypeResponse;
                            deviceCheckerPlayIntegrityRequest4 = deviceCheckerPlayIntegrityRequest8;
                            result5 = (Result) objDeviceIdResponse;
                            DeviceManagerApi deviceManagerApi4 = deviceManagerGmsApi3.f29713b;
                            cVar.f29723p0 = deviceManagerGmsApi4;
                            cVar.f29724q0 = deviceCheckerPlayIntegrityRequest4;
                            cVar.f29725r0 = deviceManagerGmsApi3;
                            cVar.f29726s0 = result2;
                            cVar.f29727t0 = result4;
                            cVar.f29728u0 = result5;
                            cVar.f29731y0 = 4;
                            objDeviceInfoResponse = deviceManagerApi4.deviceInfoResponse(cVar);
                            if (objDeviceInfoResponse == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            Result result24 = result2;
                            result6 = result5;
                            objDeviceIdResponse = objDeviceInfoResponse;
                            deviceCheckerPlayIntegrityRequest5 = deviceCheckerPlayIntegrityRequest4;
                            deviceManagerGmsApi5 = deviceManagerGmsApi3;
                            result7 = result4;
                            result8 = result24;
                            result9 = (Result) objDeviceIdResponse;
                            DeviceManagerApi deviceManagerApi5 = deviceManagerGmsApi5.f29713b;
                            cVar.f29723p0 = deviceManagerGmsApi4;
                            cVar.f29724q0 = deviceCheckerPlayIntegrityRequest5;
                            cVar.f29725r0 = deviceManagerGmsApi5;
                            cVar.f29726s0 = result8;
                            cVar.f29727t0 = result7;
                            cVar.f29728u0 = result6;
                            cVar.v0 = result9;
                            cVar.f29731y0 = 5;
                            objDeviceCheckerResponse = deviceManagerApi5.deviceCheckerResponse(cVar);
                            if (objDeviceCheckerResponse == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            Result result25 = result8;
                            result10 = result9;
                            objDeviceIdResponse = objDeviceCheckerResponse;
                            deviceCheckerPlayIntegrityRequest6 = deviceCheckerPlayIntegrityRequest5;
                            deviceManagerGmsApi6 = deviceManagerGmsApi5;
                            result11 = result25;
                            result12 = (Result) objDeviceIdResponse;
                            cVar.f29723p0 = deviceManagerGmsApi4;
                            cVar.f29724q0 = deviceManagerGmsApi6;
                            cVar.f29725r0 = result11;
                            cVar.f29726s0 = result7;
                            cVar.f29727t0 = result6;
                            cVar.f29728u0 = result10;
                            cVar.v0 = result12;
                            cVar.f29731y0 = 6;
                            objDeviceCheckerPlayIntegrityResponse = deviceManagerGmsApi6.deviceCheckerPlayIntegrityResponse(deviceCheckerPlayIntegrityRequest6, cVar);
                            if (objDeviceCheckerPlayIntegrityResponse == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            Result result26 = result10;
                            result13 = result12;
                            objDeviceIdResponse = objDeviceCheckerPlayIntegrityResponse;
                            deviceManagerGmsApi7 = deviceManagerGmsApi6;
                            result14 = result11;
                            result15 = result7;
                            result16 = result6;
                            result17 = result26;
                            result18 = (Result) objDeviceIdResponse;
                            cVar.f29723p0 = deviceManagerGmsApi4;
                            cVar.f29724q0 = result14;
                            cVar.f29725r0 = result15;
                            cVar.f29726s0 = result16;
                            cVar.f29727t0 = result17;
                            cVar.f29728u0 = result13;
                            cVar.v0 = result18;
                            cVar.f29731y0 = 7;
                            objGeolocationResponse = deviceManagerGmsApi7.geolocationResponse(cVar);
                            if (objGeolocationResponse == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            Result result27 = result14;
                            result19 = result18;
                            objDeviceIdResponse = objGeolocationResponse;
                            deviceManagerGmsApi2 = deviceManagerGmsApi4;
                            result20 = result17;
                            result21 = result15;
                            result22 = result13;
                            result23 = result27;
                            objM5535constructorimpl = kotlin.Result.m5535constructorimpl(new Result.Success(new DeviceManagerResponse.DeviceManagerGmsResponse(result23, result21, result16, result20, result22, result19, (Result) objDeviceIdResponse)));
                            thM5538exceptionOrNullimpl = kotlin.Result.m5538exceptionOrNullimpl(objM5535constructorimpl);
                            if (thM5538exceptionOrNullimpl == null) {
                                return objM5535constructorimpl;
                            }
                            deviceManagerGmsApi2.getClass();
                            return a(thM5538exceptionOrNullimpl);
                        } catch (Throwable th2) {
                            th = th2;
                            deviceManagerGmsApi2 = this;
                            kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
                            objM5535constructorimpl = kotlin.Result.m5535constructorimpl(ResultKt.createFailure(th));
                        }
                        break;
                    case 1:
                        DeviceManagerGmsApi deviceManagerGmsApi8 = (DeviceManagerGmsApi) cVar.f29726s0;
                        deviceCheckerPlayIntegrityRequest2 = (DeviceCheckerPlayIntegrityRequest) cVar.f29725r0;
                        DeviceUIdRequest deviceUIdRequest3 = (DeviceUIdRequest) cVar.f29724q0;
                        deviceManagerGmsApi4 = cVar.f29723p0;
                        ResultKt.throwOnFailure(objDeviceIdResponse);
                        deviceManagerGmsApi3 = deviceManagerGmsApi8;
                        deviceUIdRequest2 = deviceUIdRequest3;
                        result = (Result) objDeviceIdResponse;
                        DeviceManagerApi deviceManagerApi6 = deviceManagerGmsApi3.f29713b;
                        cVar.f29723p0 = deviceManagerGmsApi4;
                        cVar.f29724q0 = deviceCheckerPlayIntegrityRequest2;
                        cVar.f29725r0 = deviceManagerGmsApi3;
                        cVar.f29726s0 = result;
                        cVar.f29731y0 = 2;
                        objDeviceUidResponse = deviceManagerApi6.deviceUidResponse(deviceUIdRequest2, cVar);
                        if (objDeviceUidResponse == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        DeviceCheckerPlayIntegrityRequest deviceCheckerPlayIntegrityRequest9 = deviceCheckerPlayIntegrityRequest2;
                        result2 = result;
                        objDeviceIdResponse = objDeviceUidResponse;
                        deviceCheckerPlayIntegrityRequest3 = deviceCheckerPlayIntegrityRequest9;
                        result3 = (Result) objDeviceIdResponse;
                        DeviceManagerApi deviceManagerApi7 = deviceManagerGmsApi3.f29713b;
                        cVar.f29723p0 = deviceManagerGmsApi4;
                        cVar.f29724q0 = deviceCheckerPlayIntegrityRequest3;
                        cVar.f29725r0 = deviceManagerGmsApi3;
                        cVar.f29726s0 = result2;
                        cVar.f29727t0 = result3;
                        cVar.f29731y0 = 3;
                        objDeviceTypeResponse = deviceManagerApi7.deviceTypeResponse(cVar);
                        if (objDeviceTypeResponse == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        DeviceCheckerPlayIntegrityRequest deviceCheckerPlayIntegrityRequest10 = deviceCheckerPlayIntegrityRequest3;
                        result4 = result3;
                        objDeviceIdResponse = objDeviceTypeResponse;
                        deviceCheckerPlayIntegrityRequest4 = deviceCheckerPlayIntegrityRequest10;
                        result5 = (Result) objDeviceIdResponse;
                        DeviceManagerApi deviceManagerApi8 = deviceManagerGmsApi3.f29713b;
                        cVar.f29723p0 = deviceManagerGmsApi4;
                        cVar.f29724q0 = deviceCheckerPlayIntegrityRequest4;
                        cVar.f29725r0 = deviceManagerGmsApi3;
                        cVar.f29726s0 = result2;
                        cVar.f29727t0 = result4;
                        cVar.f29728u0 = result5;
                        cVar.f29731y0 = 4;
                        objDeviceInfoResponse = deviceManagerApi8.deviceInfoResponse(cVar);
                        if (objDeviceInfoResponse == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        Result result28 = result2;
                        result6 = result5;
                        objDeviceIdResponse = objDeviceInfoResponse;
                        deviceCheckerPlayIntegrityRequest5 = deviceCheckerPlayIntegrityRequest4;
                        deviceManagerGmsApi5 = deviceManagerGmsApi3;
                        result7 = result4;
                        result8 = result28;
                        result9 = (Result) objDeviceIdResponse;
                        DeviceManagerApi deviceManagerApi9 = deviceManagerGmsApi5.f29713b;
                        cVar.f29723p0 = deviceManagerGmsApi4;
                        cVar.f29724q0 = deviceCheckerPlayIntegrityRequest5;
                        cVar.f29725r0 = deviceManagerGmsApi5;
                        cVar.f29726s0 = result8;
                        cVar.f29727t0 = result7;
                        cVar.f29728u0 = result6;
                        cVar.v0 = result9;
                        cVar.f29731y0 = 5;
                        objDeviceCheckerResponse = deviceManagerApi9.deviceCheckerResponse(cVar);
                        if (objDeviceCheckerResponse == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        Result result29 = result8;
                        result10 = result9;
                        objDeviceIdResponse = objDeviceCheckerResponse;
                        deviceCheckerPlayIntegrityRequest6 = deviceCheckerPlayIntegrityRequest5;
                        deviceManagerGmsApi6 = deviceManagerGmsApi5;
                        result11 = result29;
                        result12 = (Result) objDeviceIdResponse;
                        cVar.f29723p0 = deviceManagerGmsApi4;
                        cVar.f29724q0 = deviceManagerGmsApi6;
                        cVar.f29725r0 = result11;
                        cVar.f29726s0 = result7;
                        cVar.f29727t0 = result6;
                        cVar.f29728u0 = result10;
                        cVar.v0 = result12;
                        cVar.f29731y0 = 6;
                        objDeviceCheckerPlayIntegrityResponse = deviceManagerGmsApi6.deviceCheckerPlayIntegrityResponse(deviceCheckerPlayIntegrityRequest6, cVar);
                        if (objDeviceCheckerPlayIntegrityResponse == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        Result result210 = result10;
                        result13 = result12;
                        objDeviceIdResponse = objDeviceCheckerPlayIntegrityResponse;
                        deviceManagerGmsApi7 = deviceManagerGmsApi6;
                        result14 = result11;
                        result15 = result7;
                        result16 = result6;
                        result17 = result210;
                        result18 = (Result) objDeviceIdResponse;
                        cVar.f29723p0 = deviceManagerGmsApi4;
                        cVar.f29724q0 = result14;
                        cVar.f29725r0 = result15;
                        cVar.f29726s0 = result16;
                        cVar.f29727t0 = result17;
                        cVar.f29728u0 = result13;
                        cVar.v0 = result18;
                        cVar.f29731y0 = 7;
                        objGeolocationResponse = deviceManagerGmsApi7.geolocationResponse(cVar);
                        if (objGeolocationResponse == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        Result result211 = result14;
                        result19 = result18;
                        objDeviceIdResponse = objGeolocationResponse;
                        deviceManagerGmsApi2 = deviceManagerGmsApi4;
                        result20 = result17;
                        result21 = result15;
                        result22 = result13;
                        result23 = result211;
                        objM5535constructorimpl = kotlin.Result.m5535constructorimpl(new Result.Success(new DeviceManagerResponse.DeviceManagerGmsResponse(result23, result21, result16, result20, result22, result19, (Result) objDeviceIdResponse)));
                        thM5538exceptionOrNullimpl = kotlin.Result.m5538exceptionOrNullimpl(objM5535constructorimpl);
                        if (thM5538exceptionOrNullimpl == null) {
                            return objM5535constructorimpl;
                        }
                        deviceManagerGmsApi2.getClass();
                        return a(thM5538exceptionOrNullimpl);
                    case 2:
                        Result result30 = (Result) cVar.f29726s0;
                        DeviceManagerGmsApi deviceManagerGmsApi9 = (DeviceManagerGmsApi) cVar.f29725r0;
                        DeviceCheckerPlayIntegrityRequest deviceCheckerPlayIntegrityRequest11 = (DeviceCheckerPlayIntegrityRequest) cVar.f29724q0;
                        deviceManagerGmsApi4 = cVar.f29723p0;
                        ResultKt.throwOnFailure(objDeviceIdResponse);
                        result2 = result30;
                        deviceCheckerPlayIntegrityRequest3 = deviceCheckerPlayIntegrityRequest11;
                        deviceManagerGmsApi3 = deviceManagerGmsApi9;
                        result3 = (Result) objDeviceIdResponse;
                        DeviceManagerApi deviceManagerApi10 = deviceManagerGmsApi3.f29713b;
                        cVar.f29723p0 = deviceManagerGmsApi4;
                        cVar.f29724q0 = deviceCheckerPlayIntegrityRequest3;
                        cVar.f29725r0 = deviceManagerGmsApi3;
                        cVar.f29726s0 = result2;
                        cVar.f29727t0 = result3;
                        cVar.f29731y0 = 3;
                        objDeviceTypeResponse = deviceManagerApi10.deviceTypeResponse(cVar);
                        if (objDeviceTypeResponse == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        DeviceCheckerPlayIntegrityRequest deviceCheckerPlayIntegrityRequest12 = deviceCheckerPlayIntegrityRequest3;
                        result4 = result3;
                        objDeviceIdResponse = objDeviceTypeResponse;
                        deviceCheckerPlayIntegrityRequest4 = deviceCheckerPlayIntegrityRequest12;
                        result5 = (Result) objDeviceIdResponse;
                        DeviceManagerApi deviceManagerApi11 = deviceManagerGmsApi3.f29713b;
                        cVar.f29723p0 = deviceManagerGmsApi4;
                        cVar.f29724q0 = deviceCheckerPlayIntegrityRequest4;
                        cVar.f29725r0 = deviceManagerGmsApi3;
                        cVar.f29726s0 = result2;
                        cVar.f29727t0 = result4;
                        cVar.f29728u0 = result5;
                        cVar.f29731y0 = 4;
                        objDeviceInfoResponse = deviceManagerApi11.deviceInfoResponse(cVar);
                        if (objDeviceInfoResponse == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        Result result212 = result2;
                        result6 = result5;
                        objDeviceIdResponse = objDeviceInfoResponse;
                        deviceCheckerPlayIntegrityRequest5 = deviceCheckerPlayIntegrityRequest4;
                        deviceManagerGmsApi5 = deviceManagerGmsApi3;
                        result7 = result4;
                        result8 = result212;
                        result9 = (Result) objDeviceIdResponse;
                        DeviceManagerApi deviceManagerApi12 = deviceManagerGmsApi5.f29713b;
                        cVar.f29723p0 = deviceManagerGmsApi4;
                        cVar.f29724q0 = deviceCheckerPlayIntegrityRequest5;
                        cVar.f29725r0 = deviceManagerGmsApi5;
                        cVar.f29726s0 = result8;
                        cVar.f29727t0 = result7;
                        cVar.f29728u0 = result6;
                        cVar.v0 = result9;
                        cVar.f29731y0 = 5;
                        objDeviceCheckerResponse = deviceManagerApi12.deviceCheckerResponse(cVar);
                        if (objDeviceCheckerResponse == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        Result result213 = result8;
                        result10 = result9;
                        objDeviceIdResponse = objDeviceCheckerResponse;
                        deviceCheckerPlayIntegrityRequest6 = deviceCheckerPlayIntegrityRequest5;
                        deviceManagerGmsApi6 = deviceManagerGmsApi5;
                        result11 = result213;
                        result12 = (Result) objDeviceIdResponse;
                        cVar.f29723p0 = deviceManagerGmsApi4;
                        cVar.f29724q0 = deviceManagerGmsApi6;
                        cVar.f29725r0 = result11;
                        cVar.f29726s0 = result7;
                        cVar.f29727t0 = result6;
                        cVar.f29728u0 = result10;
                        cVar.v0 = result12;
                        cVar.f29731y0 = 6;
                        objDeviceCheckerPlayIntegrityResponse = deviceManagerGmsApi6.deviceCheckerPlayIntegrityResponse(deviceCheckerPlayIntegrityRequest6, cVar);
                        if (objDeviceCheckerPlayIntegrityResponse == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        Result result214 = result10;
                        result13 = result12;
                        objDeviceIdResponse = objDeviceCheckerPlayIntegrityResponse;
                        deviceManagerGmsApi7 = deviceManagerGmsApi6;
                        result14 = result11;
                        result15 = result7;
                        result16 = result6;
                        result17 = result214;
                        result18 = (Result) objDeviceIdResponse;
                        cVar.f29723p0 = deviceManagerGmsApi4;
                        cVar.f29724q0 = result14;
                        cVar.f29725r0 = result15;
                        cVar.f29726s0 = result16;
                        cVar.f29727t0 = result17;
                        cVar.f29728u0 = result13;
                        cVar.v0 = result18;
                        cVar.f29731y0 = 7;
                        objGeolocationResponse = deviceManagerGmsApi7.geolocationResponse(cVar);
                        if (objGeolocationResponse == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        Result result215 = result14;
                        result19 = result18;
                        objDeviceIdResponse = objGeolocationResponse;
                        deviceManagerGmsApi2 = deviceManagerGmsApi4;
                        result20 = result17;
                        result21 = result15;
                        result22 = result13;
                        result23 = result215;
                        objM5535constructorimpl = kotlin.Result.m5535constructorimpl(new Result.Success(new DeviceManagerResponse.DeviceManagerGmsResponse(result23, result21, result16, result20, result22, result19, (Result) objDeviceIdResponse)));
                        thM5538exceptionOrNullimpl = kotlin.Result.m5538exceptionOrNullimpl(objM5535constructorimpl);
                        if (thM5538exceptionOrNullimpl == null) {
                            return objM5535constructorimpl;
                        }
                        deviceManagerGmsApi2.getClass();
                        return a(thM5538exceptionOrNullimpl);
                    case 3:
                        result4 = cVar.f29727t0;
                        result2 = (Result) cVar.f29726s0;
                        deviceManagerGmsApi3 = (DeviceManagerGmsApi) cVar.f29725r0;
                        DeviceCheckerPlayIntegrityRequest deviceCheckerPlayIntegrityRequest13 = (DeviceCheckerPlayIntegrityRequest) cVar.f29724q0;
                        DeviceManagerGmsApi deviceManagerGmsApi10 = cVar.f29723p0;
                        try {
                            ResultKt.throwOnFailure(objDeviceIdResponse);
                            deviceCheckerPlayIntegrityRequest4 = deviceCheckerPlayIntegrityRequest13;
                            deviceManagerGmsApi4 = deviceManagerGmsApi10;
                            result5 = (Result) objDeviceIdResponse;
                            DeviceManagerApi deviceManagerApi13 = deviceManagerGmsApi3.f29713b;
                            cVar.f29723p0 = deviceManagerGmsApi4;
                            cVar.f29724q0 = deviceCheckerPlayIntegrityRequest4;
                            cVar.f29725r0 = deviceManagerGmsApi3;
                            cVar.f29726s0 = result2;
                            cVar.f29727t0 = result4;
                            cVar.f29728u0 = result5;
                            cVar.f29731y0 = 4;
                            objDeviceInfoResponse = deviceManagerApi13.deviceInfoResponse(cVar);
                            if (objDeviceInfoResponse == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            Result result216 = result2;
                            result6 = result5;
                            objDeviceIdResponse = objDeviceInfoResponse;
                            deviceCheckerPlayIntegrityRequest5 = deviceCheckerPlayIntegrityRequest4;
                            deviceManagerGmsApi5 = deviceManagerGmsApi3;
                            result7 = result4;
                            result8 = result216;
                            result9 = (Result) objDeviceIdResponse;
                            DeviceManagerApi deviceManagerApi14 = deviceManagerGmsApi5.f29713b;
                            cVar.f29723p0 = deviceManagerGmsApi4;
                            cVar.f29724q0 = deviceCheckerPlayIntegrityRequest5;
                            cVar.f29725r0 = deviceManagerGmsApi5;
                            cVar.f29726s0 = result8;
                            cVar.f29727t0 = result7;
                            cVar.f29728u0 = result6;
                            cVar.v0 = result9;
                            cVar.f29731y0 = 5;
                            objDeviceCheckerResponse = deviceManagerApi14.deviceCheckerResponse(cVar);
                            if (objDeviceCheckerResponse == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            Result result217 = result8;
                            result10 = result9;
                            objDeviceIdResponse = objDeviceCheckerResponse;
                            deviceCheckerPlayIntegrityRequest6 = deviceCheckerPlayIntegrityRequest5;
                            deviceManagerGmsApi6 = deviceManagerGmsApi5;
                            result11 = result217;
                            result12 = (Result) objDeviceIdResponse;
                            cVar.f29723p0 = deviceManagerGmsApi4;
                            cVar.f29724q0 = deviceManagerGmsApi6;
                            cVar.f29725r0 = result11;
                            cVar.f29726s0 = result7;
                            cVar.f29727t0 = result6;
                            cVar.f29728u0 = result10;
                            cVar.v0 = result12;
                            cVar.f29731y0 = 6;
                            objDeviceCheckerPlayIntegrityResponse = deviceManagerGmsApi6.deviceCheckerPlayIntegrityResponse(deviceCheckerPlayIntegrityRequest6, cVar);
                            if (objDeviceCheckerPlayIntegrityResponse == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            Result result218 = result10;
                            result13 = result12;
                            objDeviceIdResponse = objDeviceCheckerPlayIntegrityResponse;
                            deviceManagerGmsApi7 = deviceManagerGmsApi6;
                            result14 = result11;
                            result15 = result7;
                            result16 = result6;
                            result17 = result218;
                            result18 = (Result) objDeviceIdResponse;
                            cVar.f29723p0 = deviceManagerGmsApi4;
                            cVar.f29724q0 = result14;
                            cVar.f29725r0 = result15;
                            cVar.f29726s0 = result16;
                            cVar.f29727t0 = result17;
                            cVar.f29728u0 = result13;
                            cVar.v0 = result18;
                            cVar.f29731y0 = 7;
                            objGeolocationResponse = deviceManagerGmsApi7.geolocationResponse(cVar);
                            if (objGeolocationResponse == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            Result result219 = result14;
                            result19 = result18;
                            objDeviceIdResponse = objGeolocationResponse;
                            deviceManagerGmsApi2 = deviceManagerGmsApi4;
                            result20 = result17;
                            result21 = result15;
                            result22 = result13;
                            result23 = result219;
                            objM5535constructorimpl = kotlin.Result.m5535constructorimpl(new Result.Success(new DeviceManagerResponse.DeviceManagerGmsResponse(result23, result21, result16, result20, result22, result19, (Result) objDeviceIdResponse)));
                            thM5538exceptionOrNullimpl = kotlin.Result.m5538exceptionOrNullimpl(objM5535constructorimpl);
                            if (thM5538exceptionOrNullimpl == null) {
                                return objM5535constructorimpl;
                            }
                            deviceManagerGmsApi2.getClass();
                            return a(thM5538exceptionOrNullimpl);
                        } catch (Throwable th3) {
                            th = th3;
                            deviceManagerGmsApi2 = deviceManagerGmsApi10;
                            kotlin.Result.Companion companion3 = kotlin.Result.INSTANCE;
                            objM5535constructorimpl = kotlin.Result.m5535constructorimpl(ResultKt.createFailure(th));
                        }
                        break;
                    case 4:
                        Result result31 = cVar.f29728u0;
                        Result result32 = cVar.f29727t0;
                        Result result33 = (Result) cVar.f29726s0;
                        DeviceManagerGmsApi deviceManagerGmsApi11 = (DeviceManagerGmsApi) cVar.f29725r0;
                        DeviceCheckerPlayIntegrityRequest deviceCheckerPlayIntegrityRequest14 = (DeviceCheckerPlayIntegrityRequest) cVar.f29724q0;
                        DeviceManagerGmsApi deviceManagerGmsApi12 = cVar.f29723p0;
                        try {
                            ResultKt.throwOnFailure(objDeviceIdResponse);
                            result6 = result31;
                            result8 = result33;
                            result7 = result32;
                            deviceManagerGmsApi5 = deviceManagerGmsApi11;
                            deviceManagerGmsApi4 = deviceManagerGmsApi12;
                            deviceCheckerPlayIntegrityRequest5 = deviceCheckerPlayIntegrityRequest14;
                            result9 = (Result) objDeviceIdResponse;
                            DeviceManagerApi deviceManagerApi15 = deviceManagerGmsApi5.f29713b;
                            cVar.f29723p0 = deviceManagerGmsApi4;
                            cVar.f29724q0 = deviceCheckerPlayIntegrityRequest5;
                            cVar.f29725r0 = deviceManagerGmsApi5;
                            cVar.f29726s0 = result8;
                            cVar.f29727t0 = result7;
                            cVar.f29728u0 = result6;
                            cVar.v0 = result9;
                            cVar.f29731y0 = 5;
                            objDeviceCheckerResponse = deviceManagerApi15.deviceCheckerResponse(cVar);
                            if (objDeviceCheckerResponse == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            Result result2110 = result8;
                            result10 = result9;
                            objDeviceIdResponse = objDeviceCheckerResponse;
                            deviceCheckerPlayIntegrityRequest6 = deviceCheckerPlayIntegrityRequest5;
                            deviceManagerGmsApi6 = deviceManagerGmsApi5;
                            result11 = result2110;
                            result12 = (Result) objDeviceIdResponse;
                            cVar.f29723p0 = deviceManagerGmsApi4;
                            cVar.f29724q0 = deviceManagerGmsApi6;
                            cVar.f29725r0 = result11;
                            cVar.f29726s0 = result7;
                            cVar.f29727t0 = result6;
                            cVar.f29728u0 = result10;
                            cVar.v0 = result12;
                            cVar.f29731y0 = 6;
                            objDeviceCheckerPlayIntegrityResponse = deviceManagerGmsApi6.deviceCheckerPlayIntegrityResponse(deviceCheckerPlayIntegrityRequest6, cVar);
                            if (objDeviceCheckerPlayIntegrityResponse == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            Result result2111 = result10;
                            result13 = result12;
                            objDeviceIdResponse = objDeviceCheckerPlayIntegrityResponse;
                            deviceManagerGmsApi7 = deviceManagerGmsApi6;
                            result14 = result11;
                            result15 = result7;
                            result16 = result6;
                            result17 = result2111;
                            result18 = (Result) objDeviceIdResponse;
                            cVar.f29723p0 = deviceManagerGmsApi4;
                            cVar.f29724q0 = result14;
                            cVar.f29725r0 = result15;
                            cVar.f29726s0 = result16;
                            cVar.f29727t0 = result17;
                            cVar.f29728u0 = result13;
                            cVar.v0 = result18;
                            cVar.f29731y0 = 7;
                            objGeolocationResponse = deviceManagerGmsApi7.geolocationResponse(cVar);
                            if (objGeolocationResponse == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            Result result2112 = result14;
                            result19 = result18;
                            objDeviceIdResponse = objGeolocationResponse;
                            deviceManagerGmsApi2 = deviceManagerGmsApi4;
                            result20 = result17;
                            result21 = result15;
                            result22 = result13;
                            result23 = result2112;
                            objM5535constructorimpl = kotlin.Result.m5535constructorimpl(new Result.Success(new DeviceManagerResponse.DeviceManagerGmsResponse(result23, result21, result16, result20, result22, result19, (Result) objDeviceIdResponse)));
                            thM5538exceptionOrNullimpl = kotlin.Result.m5538exceptionOrNullimpl(objM5535constructorimpl);
                            if (thM5538exceptionOrNullimpl == null) {
                                return objM5535constructorimpl;
                            }
                            deviceManagerGmsApi2.getClass();
                            return a(thM5538exceptionOrNullimpl);
                        } catch (Throwable th4) {
                            th = th4;
                            deviceManagerGmsApi2 = deviceManagerGmsApi12;
                            kotlin.Result.Companion companion4 = kotlin.Result.INSTANCE;
                            objM5535constructorimpl = kotlin.Result.m5535constructorimpl(ResultKt.createFailure(th));
                        }
                        break;
                    case 5:
                        result10 = cVar.v0;
                        result6 = cVar.f29728u0;
                        result7 = cVar.f29727t0;
                        Result result34 = (Result) cVar.f29726s0;
                        DeviceManagerGmsApi deviceManagerGmsApi13 = (DeviceManagerGmsApi) cVar.f29725r0;
                        DeviceCheckerPlayIntegrityRequest deviceCheckerPlayIntegrityRequest15 = (DeviceCheckerPlayIntegrityRequest) cVar.f29724q0;
                        DeviceManagerGmsApi deviceManagerGmsApi14 = cVar.f29723p0;
                        ResultKt.throwOnFailure(objDeviceIdResponse);
                        result11 = result34;
                        deviceManagerGmsApi4 = deviceManagerGmsApi14;
                        deviceCheckerPlayIntegrityRequest6 = deviceCheckerPlayIntegrityRequest15;
                        deviceManagerGmsApi6 = deviceManagerGmsApi13;
                        result12 = (Result) objDeviceIdResponse;
                        cVar.f29723p0 = deviceManagerGmsApi4;
                        cVar.f29724q0 = deviceManagerGmsApi6;
                        cVar.f29725r0 = result11;
                        cVar.f29726s0 = result7;
                        cVar.f29727t0 = result6;
                        cVar.f29728u0 = result10;
                        cVar.v0 = result12;
                        cVar.f29731y0 = 6;
                        objDeviceCheckerPlayIntegrityResponse = deviceManagerGmsApi6.deviceCheckerPlayIntegrityResponse(deviceCheckerPlayIntegrityRequest6, cVar);
                        if (objDeviceCheckerPlayIntegrityResponse == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        Result result2113 = result10;
                        result13 = result12;
                        objDeviceIdResponse = objDeviceCheckerPlayIntegrityResponse;
                        deviceManagerGmsApi7 = deviceManagerGmsApi6;
                        result14 = result11;
                        result15 = result7;
                        result16 = result6;
                        result17 = result2113;
                        result18 = (Result) objDeviceIdResponse;
                        cVar.f29723p0 = deviceManagerGmsApi4;
                        cVar.f29724q0 = result14;
                        cVar.f29725r0 = result15;
                        cVar.f29726s0 = result16;
                        cVar.f29727t0 = result17;
                        cVar.f29728u0 = result13;
                        cVar.v0 = result18;
                        cVar.f29731y0 = 7;
                        objGeolocationResponse = deviceManagerGmsApi7.geolocationResponse(cVar);
                        if (objGeolocationResponse == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        Result result2114 = result14;
                        result19 = result18;
                        objDeviceIdResponse = objGeolocationResponse;
                        deviceManagerGmsApi2 = deviceManagerGmsApi4;
                        result20 = result17;
                        result21 = result15;
                        result22 = result13;
                        result23 = result2114;
                        objM5535constructorimpl = kotlin.Result.m5535constructorimpl(new Result.Success(new DeviceManagerResponse.DeviceManagerGmsResponse(result23, result21, result16, result20, result22, result19, (Result) objDeviceIdResponse)));
                        thM5538exceptionOrNullimpl = kotlin.Result.m5538exceptionOrNullimpl(objM5535constructorimpl);
                        if (thM5538exceptionOrNullimpl == null) {
                            return objM5535constructorimpl;
                        }
                        deviceManagerGmsApi2.getClass();
                        return a(thM5538exceptionOrNullimpl);
                    case 6:
                        result13 = cVar.v0;
                        result17 = cVar.f29728u0;
                        result16 = cVar.f29727t0;
                        Result result35 = (Result) cVar.f29726s0;
                        Result result36 = (Result) cVar.f29725r0;
                        DeviceManagerGmsApi deviceManagerGmsApi15 = (DeviceManagerGmsApi) cVar.f29724q0;
                        DeviceManagerGmsApi deviceManagerGmsApi16 = cVar.f29723p0;
                        ResultKt.throwOnFailure(objDeviceIdResponse);
                        result15 = result35;
                        deviceManagerGmsApi4 = deviceManagerGmsApi16;
                        deviceManagerGmsApi7 = deviceManagerGmsApi15;
                        result14 = result36;
                        result18 = (Result) objDeviceIdResponse;
                        cVar.f29723p0 = deviceManagerGmsApi4;
                        cVar.f29724q0 = result14;
                        cVar.f29725r0 = result15;
                        cVar.f29726s0 = result16;
                        cVar.f29727t0 = result17;
                        cVar.f29728u0 = result13;
                        cVar.v0 = result18;
                        cVar.f29731y0 = 7;
                        objGeolocationResponse = deviceManagerGmsApi7.geolocationResponse(cVar);
                        if (objGeolocationResponse == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        Result result2115 = result14;
                        result19 = result18;
                        objDeviceIdResponse = objGeolocationResponse;
                        deviceManagerGmsApi2 = deviceManagerGmsApi4;
                        result20 = result17;
                        result21 = result15;
                        result22 = result13;
                        result23 = result2115;
                        objM5535constructorimpl = kotlin.Result.m5535constructorimpl(new Result.Success(new DeviceManagerResponse.DeviceManagerGmsResponse(result23, result21, result16, result20, result22, result19, (Result) objDeviceIdResponse)));
                        thM5538exceptionOrNullimpl = kotlin.Result.m5538exceptionOrNullimpl(objM5535constructorimpl);
                        if (thM5538exceptionOrNullimpl == null) {
                            return objM5535constructorimpl;
                        }
                        deviceManagerGmsApi2.getClass();
                        return a(thM5538exceptionOrNullimpl);
                    case 7:
                        Result result37 = cVar.v0;
                        Result result38 = cVar.f29728u0;
                        Result result39 = cVar.f29727t0;
                        result16 = (Result) cVar.f29726s0;
                        Result result40 = (Result) cVar.f29725r0;
                        Result result41 = (Result) cVar.f29724q0;
                        deviceManagerGmsApi2 = cVar.f29723p0;
                        try {
                            ResultKt.throwOnFailure(objDeviceIdResponse);
                            result19 = result37;
                            result22 = result38;
                            result23 = result41;
                            result20 = result39;
                            result21 = result40;
                            objM5535constructorimpl = kotlin.Result.m5535constructorimpl(new Result.Success(new DeviceManagerResponse.DeviceManagerGmsResponse(result23, result21, result16, result20, result22, result19, (Result) objDeviceIdResponse)));
                            break;
                        } catch (Throwable th5) {
                            th = th5;
                            kotlin.Result.Companion companion5 = kotlin.Result.INSTANCE;
                            objM5535constructorimpl = kotlin.Result.m5535constructorimpl(ResultKt.createFailure(th));
                        }
                        thM5538exceptionOrNullimpl = kotlin.Result.m5538exceptionOrNullimpl(objM5535constructorimpl);
                        if (thM5538exceptionOrNullimpl == null) {
                            return objM5535constructorimpl;
                        }
                        deviceManagerGmsApi2.getClass();
                        return a(thM5538exceptionOrNullimpl);
                    default:
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } catch (Throwable th6) {
                th = th6;
                deviceManagerGmsApi2 = deviceManagerGmsApi4;
            }
        } catch (Throwable th7) {
            th = th7;
            deviceManagerGmsApi2 = deviceManagerGmsApi;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object gmsDeviceIdResponse(@NotNull DeviceIdRequest deviceIdRequest, @NotNull Continuation<? super Result<DeviceManagerResponse.DeviceManagerGmsIdResponse>> continuation) {
        d dVar;
        DeviceManagerGmsApi deviceManagerGmsApi;
        Object objM5535constructorimpl;
        if (continuation instanceof d) {
            dVar = (d) continuation;
            int i10 = dVar.f29735s0;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                dVar.f29735s0 = i10 - Integer.MIN_VALUE;
            } else {
                dVar = new d(continuation);
            }
        } else {
            dVar = new d(continuation);
        }
        Object objDeviceIdResponse = dVar.f29733q0;
        Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
        int i11 = dVar.f29735s0;
        if (i11 == 0) {
            ResultKt.throwOnFailure(objDeviceIdResponse);
            try {
                kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
                DeviceManagerApi deviceManagerApi = this.f29713b;
                dVar.f29732p0 = this;
                dVar.f29735s0 = 1;
                objDeviceIdResponse = deviceManagerApi.deviceIdResponse(deviceIdRequest, dVar);
                if (objDeviceIdResponse == coroutine_suspended) {
                    return coroutine_suspended;
                }
                deviceManagerGmsApi = this;
            } catch (Throwable th2) {
                th = th2;
                deviceManagerGmsApi = this;
                kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
                objM5535constructorimpl = kotlin.Result.m5535constructorimpl(ResultKt.createFailure(th));
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            deviceManagerGmsApi = dVar.f29732p0;
            try {
                ResultKt.throwOnFailure(objDeviceIdResponse);
            } catch (Throwable th3) {
                th = th3;
                kotlin.Result.Companion companion3 = kotlin.Result.INSTANCE;
                objM5535constructorimpl = kotlin.Result.m5535constructorimpl(ResultKt.createFailure(th));
            }
        }
        objM5535constructorimpl = kotlin.Result.m5535constructorimpl(new Result.Success(new DeviceManagerResponse.DeviceManagerGmsIdResponse((Result) objDeviceIdResponse)));
        Throwable thM5538exceptionOrNullimpl = kotlin.Result.m5538exceptionOrNullimpl(objM5535constructorimpl);
        if (thM5538exceptionOrNullimpl == null) {
            return objM5535constructorimpl;
        }
        deviceManagerGmsApi.getClass();
        return a(thM5538exceptionOrNullimpl);
    }

    public /* synthetic */ DeviceManagerGmsApi(Application application, CoroutineDispatcher coroutineDispatcher, DeviceManagerApi deviceManagerApi, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(application, (i10 & 2) != 0 ? Dispatchers.getIO() : coroutineDispatcher, (i10 & 4) != 0 ? new DeviceManagerApi(application) : deviceManagerApi);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public DeviceManagerGmsApi(@NotNull Application application) {
        this(application, Dispatchers.getIO(), null, 4, null);
        Intrinsics.checkNotNullParameter(application, "application");
    }
}

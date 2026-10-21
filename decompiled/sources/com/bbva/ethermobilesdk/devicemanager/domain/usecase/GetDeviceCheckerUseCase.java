package com.bbva.ethermobilesdk.devicemanager.domain.usecase;

import com.bbva.ethermobile.help.kit.domain.base.SuspendUseCase;
import com.bbva.ethermobile.help.kit.result.Result;
import com.bbva.ethermobilesdk.devicemanager.data.devicechecker.common.repository.DeviceCheckerRepository;
import com.bbva.ethermobilesdk.devicemanager.model.output.DeviceCheckerResponse;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineDispatcher;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: GetDeviceCheckerUseCase.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0017\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u0018\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0002H\u0094@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\r"}, d2 = {"Lcom/bbva/ethermobilesdk/devicemanager/domain/usecase/GetDeviceCheckerUseCase;", "Lcom/bbva/ethermobile/help/kit/domain/base/SuspendUseCase;", "", "Lcom/bbva/ethermobilesdk/devicemanager/model/output/DeviceCheckerResponse;", "parameters", "execute", "(Lkotlin/Unit;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/bbva/ethermobilesdk/devicemanager/data/devicechecker/common/repository/DeviceCheckerRepository;", "deviceCheckerRepository", "Lkotlinx/coroutines/CoroutineDispatcher;", "ioDispatcher", "<init>", "(Lcom/bbva/ethermobilesdk/devicemanager/data/devicechecker/common/repository/DeviceCheckerRepository;Lkotlinx/coroutines/CoroutineDispatcher;)V", "devicemanager_release"}, k = 1, mv = {2, 0, 0})
public final class GetDeviceCheckerUseCase extends SuspendUseCase<Unit, DeviceCheckerResponse> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final DeviceCheckerRepository f29669b;

    /* JADX INFO: compiled from: GetDeviceCheckerUseCase.kt */
    @DebugMetadata(c = "com.bbva.ethermobilesdk.devicemanager.domain.usecase.GetDeviceCheckerUseCase", f = "GetDeviceCheckerUseCase.kt", i = {0, 1}, l = {22, 23, 24}, m = "execute", n = {"$this$execute_u24lambda_u240", "$this$execute_u24lambda_u240"}, s = {"L$0", "L$0"})
    public static final class a extends ContinuationImpl {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public Object f29670p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public Result f29671q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public Result f29672r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public Result f29673s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public Result f29674t0;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public /* synthetic */ Object f29675u0;

        /* JADX INFO: renamed from: w0, reason: collision with root package name */
        public int f29676w0;

        public a(Continuation<? super a> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f29675u0 = obj;
            this.f29676w0 |= Integer.MIN_VALUE;
            return GetDeviceCheckerUseCase.this.execute((Unit) null, (Continuation<? super DeviceCheckerResponse>) this);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetDeviceCheckerUseCase(@NotNull DeviceCheckerRepository deviceCheckerRepository, @NotNull CoroutineDispatcher ioDispatcher) {
        super(ioDispatcher);
        Intrinsics.checkNotNullParameter(deviceCheckerRepository, "deviceCheckerRepository");
        Intrinsics.checkNotNullParameter(ioDispatcher, "ioDispatcher");
        this.f29669b = deviceCheckerRepository;
    }

    /* JADX WARN: Code duplicated, block: B:28:0x00bc A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:29:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.bbva.ethermobile.help.kit.domain.base.SuspendUseCase
    @Nullable
    public Object execute(@NotNull Unit unit, @NotNull Continuation<? super DeviceCheckerResponse> continuation) {
        a aVar;
        Result<Boolean> resultIsDebuggable;
        DeviceCheckerRepository deviceCheckerRepository;
        Result<Boolean> result;
        Result<Boolean> result2;
        Result result3;
        Result<Boolean> result4;
        Result result5;
        Object objIsRoot;
        Result<Boolean> result6;
        Result<Boolean> result7;
        Result result8;
        Result<Boolean> result9;
        Result result10;
        if (continuation instanceof a) {
            aVar = (a) continuation;
            int i10 = aVar.f29676w0;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                aVar.f29676w0 = i10 - Integer.MIN_VALUE;
            } else {
                aVar = new a(continuation);
            }
        } else {
            aVar = new a(continuation);
        }
        Object obj = aVar.f29675u0;
        Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
        int i11 = aVar.f29676w0;
        if (i11 != 0) {
            if (i11 == 1) {
                resultIsDebuggable = aVar.f29673s0;
                result = aVar.f29672r0;
                result2 = aVar.f29671q0;
                deviceCheckerRepository = (DeviceCheckerRepository) aVar.f29670p0;
                ResultKt.throwOnFailure(obj);
            } else if (i11 == 2) {
                result3 = aVar.f29674t0;
                result4 = aVar.f29673s0;
                result = aVar.f29672r0;
                result2 = aVar.f29671q0;
                deviceCheckerRepository = (DeviceCheckerRepository) aVar.f29670p0;
                ResultKt.throwOnFailure(obj);
                result5 = (Result) obj;
                aVar.f29670p0 = result2;
                aVar.f29671q0 = result;
                aVar.f29672r0 = result4;
                aVar.f29673s0 = result3;
                aVar.f29674t0 = result5;
                aVar.f29676w0 = 3;
                objIsRoot = deviceCheckerRepository.isRoot(aVar);
                if (objIsRoot == coroutine_suspended) {
                    return coroutine_suspended;
                }
                result6 = result4;
                result7 = result2;
                result8 = result3;
                result9 = result;
                result10 = result5;
                obj = objIsRoot;
            } else {
                if (i11 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                Result result11 = aVar.f29674t0;
                Result result12 = aVar.f29673s0;
                Result<Boolean> result13 = aVar.f29672r0;
                Result<Boolean> result14 = aVar.f29671q0;
                Result<Boolean> result15 = (Result) aVar.f29670p0;
                ResultKt.throwOnFailure(obj);
                result10 = result11;
                result6 = result13;
                result7 = result15;
                result8 = result12;
                result9 = result14;
            }
            return new DeviceCheckerResponse(result6, result9, result7, result8, result10, (Result) obj);
        }
        ResultKt.throwOnFailure(obj);
        DeviceCheckerRepository deviceCheckerRepository2 = this.f29669b;
        resultIsDebuggable = deviceCheckerRepository2.isDebuggable();
        Result<Boolean> resultIsDeveloperModeEnabled = deviceCheckerRepository2.isDeveloperModeEnabled();
        Result<Boolean> resultIsEmulator = deviceCheckerRepository2.isEmulator();
        aVar.f29670p0 = deviceCheckerRepository2;
        aVar.f29671q0 = resultIsEmulator;
        aVar.f29672r0 = resultIsDeveloperModeEnabled;
        aVar.f29673s0 = resultIsDebuggable;
        aVar.f29676w0 = 1;
        Object objIsFridaCompleteDetected = deviceCheckerRepository2.isFridaCompleteDetected(aVar);
        if (objIsFridaCompleteDetected == coroutine_suspended) {
            return coroutine_suspended;
        }
        deviceCheckerRepository = deviceCheckerRepository2;
        obj = objIsFridaCompleteDetected;
        result = resultIsDeveloperModeEnabled;
        result2 = resultIsEmulator;
        Result result16 = (Result) obj;
        aVar.f29670p0 = deviceCheckerRepository;
        aVar.f29671q0 = result2;
        aVar.f29672r0 = result;
        aVar.f29673s0 = resultIsDebuggable;
        aVar.f29674t0 = result16;
        aVar.f29676w0 = 2;
        Object objIsMagiskCompleteDetected = deviceCheckerRepository.isMagiskCompleteDetected(aVar);
        if (objIsMagiskCompleteDetected == coroutine_suspended) {
            return coroutine_suspended;
        }
        Result<Boolean> result17 = resultIsDebuggable;
        result3 = result16;
        obj = objIsMagiskCompleteDetected;
        result4 = result17;
        result5 = (Result) obj;
        aVar.f29670p0 = result2;
        aVar.f29671q0 = result;
        aVar.f29672r0 = result4;
        aVar.f29673s0 = result3;
        aVar.f29674t0 = result5;
        aVar.f29676w0 = 3;
        objIsRoot = deviceCheckerRepository.isRoot(aVar);
        if (objIsRoot == coroutine_suspended) {
            return coroutine_suspended;
        }
        result6 = result4;
        result7 = result2;
        result8 = result3;
        result9 = result;
        result10 = result5;
        obj = objIsRoot;
        return new DeviceCheckerResponse(result6, result9, result7, result8, result10, (Result) obj);
    }
}

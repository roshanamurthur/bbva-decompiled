package com.bbva.ethermobilesdk.devicemanager.gms.domain.usecase;

import com.bbva.ethermobile.help.kit.domain.base.SuspendUseCase;
import com.bbva.ethermobile.help.kit.result.Result;
import com.bbva.ethermobilesdk.devicemanager.gms.data.devicechecker.playintegrity.repository.DeviceCheckerPlayIntegrityRepository;
import com.bbva.ethermobilesdk.devicemanager.model.input.DeviceCheckerPlayIntegrityRequest;
import com.bbva.ethermobilesdk.devicemanager.model.output.DeviceCheckerPlayIntegrityResponse;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineDispatcher;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: GetDeviceCheckerPlayIntegrityUseCase.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0017\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u0018\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0002H\u0094@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\r"}, d2 = {"Lcom/bbva/ethermobilesdk/devicemanager/gms/domain/usecase/GetDeviceCheckerPlayIntegrityUseCase;", "Lcom/bbva/ethermobile/help/kit/domain/base/SuspendUseCase;", "Lcom/bbva/ethermobilesdk/devicemanager/model/input/DeviceCheckerPlayIntegrityRequest;", "Lcom/bbva/ethermobilesdk/devicemanager/model/output/DeviceCheckerPlayIntegrityResponse;", "parameters", "execute", "(Lcom/bbva/ethermobilesdk/devicemanager/model/input/DeviceCheckerPlayIntegrityRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/bbva/ethermobilesdk/devicemanager/gms/data/devicechecker/playintegrity/repository/DeviceCheckerPlayIntegrityRepository;", "deviceCheckerPlayIntegrityRepository", "Lkotlinx/coroutines/CoroutineDispatcher;", "ioDispatcher", "<init>", "(Lcom/bbva/ethermobilesdk/devicemanager/gms/data/devicechecker/playintegrity/repository/DeviceCheckerPlayIntegrityRepository;Lkotlinx/coroutines/CoroutineDispatcher;)V", "devicemanager-gms_release"}, k = 1, mv = {2, 0, 0})
public final class GetDeviceCheckerPlayIntegrityUseCase extends SuspendUseCase<DeviceCheckerPlayIntegrityRequest, DeviceCheckerPlayIntegrityResponse> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final DeviceCheckerPlayIntegrityRepository f29746b;

    /* JADX INFO: compiled from: GetDeviceCheckerPlayIntegrityUseCase.kt */
    @DebugMetadata(c = "com.bbva.ethermobilesdk.devicemanager.gms.domain.usecase.GetDeviceCheckerPlayIntegrityUseCase", f = "GetDeviceCheckerPlayIntegrityUseCase.kt", i = {}, l = {22}, m = "execute", n = {}, s = {})
    public static final class a extends ContinuationImpl {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public /* synthetic */ Object f29747p0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public int f29749r0;

        public a(Continuation<? super a> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f29747p0 = obj;
            this.f29749r0 |= Integer.MIN_VALUE;
            return GetDeviceCheckerPlayIntegrityUseCase.this.execute((DeviceCheckerPlayIntegrityRequest) null, (Continuation<? super DeviceCheckerPlayIntegrityResponse>) this);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetDeviceCheckerPlayIntegrityUseCase(@NotNull DeviceCheckerPlayIntegrityRepository deviceCheckerPlayIntegrityRepository, @NotNull CoroutineDispatcher ioDispatcher) {
        super(ioDispatcher);
        Intrinsics.checkNotNullParameter(deviceCheckerPlayIntegrityRepository, "deviceCheckerPlayIntegrityRepository");
        Intrinsics.checkNotNullParameter(ioDispatcher, "ioDispatcher");
        this.f29746b = deviceCheckerPlayIntegrityRepository;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.bbva.ethermobile.help.kit.domain.base.SuspendUseCase
    @Nullable
    public Object execute(@NotNull DeviceCheckerPlayIntegrityRequest deviceCheckerPlayIntegrityRequest, @NotNull Continuation<? super DeviceCheckerPlayIntegrityResponse> continuation) {
        a aVar;
        if (continuation instanceof a) {
            aVar = (a) continuation;
            int i10 = aVar.f29749r0;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                aVar.f29749r0 = i10 - Integer.MIN_VALUE;
            } else {
                aVar = new a(continuation);
            }
        } else {
            aVar = new a(continuation);
        }
        Object objIntegrityToken = aVar.f29747p0;
        Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
        int i11 = aVar.f29749r0;
        if (i11 == 0) {
            ResultKt.throwOnFailure(objIntegrityToken);
            String nonce = deviceCheckerPlayIntegrityRequest.getNonce();
            long cloudProjectNumber = deviceCheckerPlayIntegrityRequest.getCloudProjectNumber();
            aVar.f29749r0 = 1;
            objIntegrityToken = this.f29746b.integrityToken(nonce, cloudProjectNumber, aVar);
            if (objIntegrityToken == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objIntegrityToken);
        }
        return new DeviceCheckerPlayIntegrityResponse((Result) objIntegrityToken);
    }
}

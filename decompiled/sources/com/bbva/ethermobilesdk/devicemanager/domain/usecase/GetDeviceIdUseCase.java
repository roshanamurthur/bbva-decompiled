package com.bbva.ethermobilesdk.devicemanager.domain.usecase;

import com.bbva.ethermobile.help.kit.domain.base.SuspendUseCase;
import com.bbva.ethermobile.help.kit.result.Result;
import com.bbva.ethermobilesdk.devicemanager.data.cipher.repository.JwtSignRepository;
import com.bbva.ethermobilesdk.devicemanager.data.deviceinfo.repository.DeviceInfoRepository;
import com.bbva.ethermobilesdk.devicemanager.data.logger.repository.EtherLoggerRepository;
import com.bbva.ethermobilesdk.devicemanager.model.input.DeviceIdRequest;
import com.bbva.ethermobilesdk.devicemanager.model.output.DeviceIdResponse;
import com.bbva.ethermobilesdk.devicemanager.model.output.error.DeviceManagerError;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineDispatcher;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: GetDeviceIdUseCase.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B'\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J\u0018\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0002H\u0094@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0011"}, d2 = {"Lcom/bbva/ethermobilesdk/devicemanager/domain/usecase/GetDeviceIdUseCase;", "Lcom/bbva/ethermobile/help/kit/domain/base/SuspendUseCase;", "Lcom/bbva/ethermobilesdk/devicemanager/model/input/DeviceIdRequest;", "Lcom/bbva/ethermobilesdk/devicemanager/model/output/DeviceIdResponse;", "parameters", "execute", "(Lcom/bbva/ethermobilesdk/devicemanager/model/input/DeviceIdRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/bbva/ethermobilesdk/devicemanager/data/deviceinfo/repository/DeviceInfoRepository;", "deviceInfoRepository", "Lcom/bbva/ethermobilesdk/devicemanager/data/cipher/repository/JwtSignRepository;", "jwtSignRepository", "Lcom/bbva/ethermobilesdk/devicemanager/data/logger/repository/EtherLoggerRepository;", "loggerRepository", "Lkotlinx/coroutines/CoroutineDispatcher;", "ioDispatcher", "<init>", "(Lcom/bbva/ethermobilesdk/devicemanager/data/deviceinfo/repository/DeviceInfoRepository;Lcom/bbva/ethermobilesdk/devicemanager/data/cipher/repository/JwtSignRepository;Lcom/bbva/ethermobilesdk/devicemanager/data/logger/repository/EtherLoggerRepository;Lkotlinx/coroutines/CoroutineDispatcher;)V", "devicemanager_release"}, k = 1, mv = {2, 0, 0})
public final class GetDeviceIdUseCase extends SuspendUseCase<DeviceIdRequest, DeviceIdResponse> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final DeviceInfoRepository f29677b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final JwtSignRepository f29678c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final EtherLoggerRepository f29679d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetDeviceIdUseCase(@NotNull DeviceInfoRepository deviceInfoRepository, @NotNull JwtSignRepository jwtSignRepository, @NotNull EtherLoggerRepository loggerRepository, @NotNull CoroutineDispatcher ioDispatcher) {
        super(ioDispatcher);
        Intrinsics.checkNotNullParameter(deviceInfoRepository, "deviceInfoRepository");
        Intrinsics.checkNotNullParameter(jwtSignRepository, "jwtSignRepository");
        Intrinsics.checkNotNullParameter(loggerRepository, "loggerRepository");
        Intrinsics.checkNotNullParameter(ioDispatcher, "ioDispatcher");
        this.f29677b = deviceInfoRepository;
        this.f29678c = jwtSignRepository;
        this.f29679d = loggerRepository;
    }

    @Override // com.bbva.ethermobile.help.kit.domain.base.SuspendUseCase
    @Nullable
    public Object execute(@NotNull DeviceIdRequest deviceIdRequest, @NotNull Continuation<? super DeviceIdResponse> continuation) throws DeviceManagerError.DeviceIdError.DeviceIdInvalid {
        DeviceInfoRepository deviceInfoRepository = this.f29677b;
        Result<String> androidId = deviceInfoRepository.getAndroidId();
        if (androidId instanceof Result.Success) {
            return new DeviceIdResponse(new Result.Success(((Result.Success) androidId).getValue()));
        }
        if (!(androidId instanceof Result.Error)) {
            throw new NoWhenBranchMatchedException();
        }
        Result.Error error = (Result.Error) androidId;
        Throwable exception = error.getException();
        Class<?> cls = deviceInfoRepository.getClass();
        EtherLoggerRepository etherLoggerRepository = this.f29679d;
        etherLoggerRepository.logError(exception, cls);
        Result<String> collideFingerprint = deviceInfoRepository.getCollideFingerprint(deviceIdRequest.getUserId());
        if (collideFingerprint instanceof Result.Error) {
            etherLoggerRepository.logError(error.getException(), deviceInfoRepository.getClass());
            throw new DeviceManagerError.DeviceIdError.DeviceIdInvalid(null, error.getException(), 1, null);
        }
        if (collideFingerprint instanceof Result.Success) {
            return new DeviceIdResponse(new Result.Success(((Result.Success) collideFingerprint).getValue()));
        }
        throw new NoWhenBranchMatchedException();
    }
}

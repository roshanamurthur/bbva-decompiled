package com.bbva.ethermobilesdk.devicemanager.domain.usecase;

import com.bbva.ethermobile.help.kit.domain.base.SuspendUseCase;
import com.bbva.ethermobile.help.kit.result.Result;
import com.bbva.ethermobilesdk.devicemanager.data.deviceuid.repository.DeviceUidRepository;
import com.bbva.ethermobilesdk.devicemanager.data.logger.repository.EtherLoggerRepository;
import com.bbva.ethermobilesdk.devicemanager.model.output.DeviceUIdResponse;
import com.bbva.ethermobilesdk.devicemanager.model.output.error.DeviceManagerError;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineDispatcher;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: GetDeviceUidDefaultUseCase.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u001f\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0018\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0002H\u0094@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u000f"}, d2 = {"Lcom/bbva/ethermobilesdk/devicemanager/domain/usecase/GetDeviceUidDefaultUseCase;", "Lcom/bbva/ethermobile/help/kit/domain/base/SuspendUseCase;", "", "Lcom/bbva/ethermobilesdk/devicemanager/model/output/DeviceUIdResponse;", "parameters", "execute", "(Lkotlin/Unit;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/bbva/ethermobilesdk/devicemanager/data/deviceuid/repository/DeviceUidRepository;", "deviceUidRepository", "Lcom/bbva/ethermobilesdk/devicemanager/data/logger/repository/EtherLoggerRepository;", "loggerRepository", "Lkotlinx/coroutines/CoroutineDispatcher;", "ioDispatcher", "<init>", "(Lcom/bbva/ethermobilesdk/devicemanager/data/deviceuid/repository/DeviceUidRepository;Lcom/bbva/ethermobilesdk/devicemanager/data/logger/repository/EtherLoggerRepository;Lkotlinx/coroutines/CoroutineDispatcher;)V", "devicemanager_release"}, k = 1, mv = {2, 0, 0})
public final class GetDeviceUidDefaultUseCase extends SuspendUseCase<Unit, DeviceUIdResponse> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final DeviceUidRepository f29703b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final EtherLoggerRepository f29704c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetDeviceUidDefaultUseCase(@NotNull DeviceUidRepository deviceUidRepository, @NotNull EtherLoggerRepository loggerRepository, @NotNull CoroutineDispatcher ioDispatcher) {
        super(ioDispatcher);
        Intrinsics.checkNotNullParameter(deviceUidRepository, "deviceUidRepository");
        Intrinsics.checkNotNullParameter(loggerRepository, "loggerRepository");
        Intrinsics.checkNotNullParameter(ioDispatcher, "ioDispatcher");
        this.f29703b = deviceUidRepository;
        this.f29704c = loggerRepository;
    }

    @Override // com.bbva.ethermobile.help.kit.domain.base.SuspendUseCase
    @Nullable
    public Object execute(@NotNull Unit unit, @NotNull Continuation<? super DeviceUIdResponse> continuation) throws DeviceManagerError.DeviceUIdError.DeviceUIdInvalid {
        DeviceUidRepository deviceUidRepository = this.f29703b;
        Result<String> uidDefault = deviceUidRepository.getUidDefault();
        if (uidDefault instanceof Result.Success) {
            return new DeviceUIdResponse(new Result.Success(((Result.Success) uidDefault).getValue()));
        }
        if (!(uidDefault instanceof Result.Error)) {
            throw new NoWhenBranchMatchedException();
        }
        Result.Error error = (Result.Error) uidDefault;
        this.f29704c.logError(error.getException(), deviceUidRepository.getClass());
        throw new DeviceManagerError.DeviceUIdError.DeviceUIdInvalid(null, error.getException(), 1, null);
    }
}

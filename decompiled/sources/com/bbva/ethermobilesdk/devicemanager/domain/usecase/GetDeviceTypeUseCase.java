package com.bbva.ethermobilesdk.devicemanager.domain.usecase;

import com.bbva.ethermobile.help.kit.domain.base.SuspendUseCase;
import com.bbva.ethermobile.help.kit.result.Result;
import com.bbva.ethermobilesdk.devicemanager.data.devicechecker.common.repository.DeviceCheckerRepository;
import com.bbva.ethermobilesdk.devicemanager.model.output.DeviceType;
import com.bbva.ethermobilesdk.devicemanager.model.output.DeviceTypeResponse;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineDispatcher;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: GetDeviceTypeUseCase.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0017\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u0018\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0002H\u0094@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\r"}, d2 = {"Lcom/bbva/ethermobilesdk/devicemanager/domain/usecase/GetDeviceTypeUseCase;", "Lcom/bbva/ethermobile/help/kit/domain/base/SuspendUseCase;", "", "Lcom/bbva/ethermobilesdk/devicemanager/model/output/DeviceTypeResponse;", "parameters", "execute", "(Lkotlin/Unit;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/bbva/ethermobilesdk/devicemanager/data/devicechecker/common/repository/DeviceCheckerRepository;", "deviceCheckerRepository", "Lkotlinx/coroutines/CoroutineDispatcher;", "ioDispatcher", "<init>", "(Lcom/bbva/ethermobilesdk/devicemanager/data/devicechecker/common/repository/DeviceCheckerRepository;Lkotlinx/coroutines/CoroutineDispatcher;)V", "devicemanager_release"}, k = 1, mv = {2, 0, 0})
public final class GetDeviceTypeUseCase extends SuspendUseCase<Unit, DeviceTypeResponse> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final DeviceCheckerRepository f29702b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetDeviceTypeUseCase(@NotNull DeviceCheckerRepository deviceCheckerRepository, @NotNull CoroutineDispatcher ioDispatcher) {
        super(ioDispatcher);
        Intrinsics.checkNotNullParameter(deviceCheckerRepository, "deviceCheckerRepository");
        Intrinsics.checkNotNullParameter(ioDispatcher, "ioDispatcher");
        this.f29702b = deviceCheckerRepository;
    }

    @Override // com.bbva.ethermobile.help.kit.domain.base.SuspendUseCase
    @Nullable
    public Object execute(@NotNull Unit unit, @NotNull Continuation<? super DeviceTypeResponse> continuation) {
        Result<Boolean> resultIsEmulator = this.f29702b.isEmulator();
        if (resultIsEmulator instanceof Result.Error) {
            return new DeviceTypeResponse(new Result.Success(DeviceType.Mobile.INSTANCE));
        }
        if (resultIsEmulator instanceof Result.Success) {
            return ((Boolean) ((Result.Success) resultIsEmulator).getValue()).booleanValue() ? new DeviceTypeResponse(new Result.Success(DeviceType.Emulator.INSTANCE)) : new DeviceTypeResponse(new Result.Success(DeviceType.Mobile.INSTANCE));
        }
        throw new NoWhenBranchMatchedException();
    }
}

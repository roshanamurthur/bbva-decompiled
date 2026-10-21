package com.bbva.component.dm.devices.di;

import com.bbva.cells.componentkit.usecase.UseCase;
import com.bbva.component.dm.devices.data.HorizonUnrollNotificationsDataSource;
import com.bbva.component.dm.devices.data.UnrollNotificationsDataSource;
import com.bbva.component.dm.devices.model.DevicesDataManagerConfig;
import com.bbva.component.dm.devices.model.UnrollNotificationsRequest;
import com.bbva.component.dm.devices.usecase.UnrollNotificationsUseCase;
import com.bbva.network.NetworkWorker;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: UnrollUseCaseFactory.kt */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J$\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\u0006\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\n¨\u0006\u000b"}, d2 = {"Lcom/bbva/component/dm/devices/di/UnrollUseCaseFactory;", "", "()V", "create", "Lcom/bbva/cells/componentkit/usecase/UseCase;", "Lcom/bbva/component/dm/devices/model/UnrollNotificationsRequest;", "", "worker", "Lcom/bbva/network/NetworkWorker;", "model", "Lcom/bbva/component/dm/devices/model/DevicesDataManagerConfig;", "component-dm-devices_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class UnrollUseCaseFactory {

    @NotNull
    public static final UnrollUseCaseFactory INSTANCE = new UnrollUseCaseFactory();

    /* JADX INFO: compiled from: UnrollUseCaseFactory.kt */
    @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[DevicesDataManagerConfig.EngineType.values().length];
            iArr[DevicesDataManagerConfig.EngineType.HORIZON.ordinal()] = 1;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @NotNull
    public final UseCase<UnrollNotificationsRequest, Unit> create(@NotNull NetworkWorker worker, @Nullable DevicesDataManagerConfig model) {
        Intrinsics.checkNotNullParameter(worker, "worker");
        DevicesDataManagerConfig.EngineType engineType = model != null ? model.getEngineType() : null;
        return new UnrollNotificationsUseCase((engineType != null && WhenMappings.$EnumSwitchMapping$0[engineType.ordinal()] == 1) ? new HorizonUnrollNotificationsDataSource(worker) : new UnrollNotificationsDataSource(worker));
    }
}

package com.bbva.component.dm.devices;

import com.bbva.cells.componentkit.JsonDeserializer;
import com.bbva.cells.componentkit.ViewModel;
import com.bbva.cells.componentkit.model.FetchResult;
import com.bbva.cells.componentkit.usecase.UseCase;
import com.bbva.component.dm.devices.di.UnrollUseCaseFactory;
import com.bbva.component.dm.devices.model.DevicesDataManagerConfig;
import com.bbva.component.dm.devices.model.UnrollNotificationsRequest;
import com.bbva.network.NetworkWorker;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: DevicesDataManager.kt */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ!\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\b\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\r"}, d2 = {"Lcom/bbva/component/dm/devices/DevicesDataManager;", "Lcom/bbva/cells/componentkit/ViewModel;", "Lcom/bbva/component/dm/devices/model/DevicesDataManagerConfig;", "", "deviceId", "Lcom/bbva/cells/componentkit/model/FetchResult;", "", "unrollNotifications", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/bbva/network/NetworkWorker;", "worker", "<init>", "(Lcom/bbva/network/NetworkWorker;)V", "component-dm-devices_release"}, k = 1, mv = {1, 6, 0})
public final class DevicesDataManager extends ViewModel<DevicesDataManagerConfig> {

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    @NotNull
    public final NetworkWorker f27595w0;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    @NotNull
    public final Lazy f27596x0;

    /* JADX INFO: compiled from: DevicesDataManager.kt */
    public static final class a extends Lambda implements Function0<UseCase<? super UnrollNotificationsRequest, Unit>> {
        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final UseCase<? super UnrollNotificationsRequest, Unit> invoke() {
            UnrollUseCaseFactory unrollUseCaseFactory = UnrollUseCaseFactory.INSTANCE;
            DevicesDataManager devicesDataManager = DevicesDataManager.this;
            return unrollUseCaseFactory.create(devicesDataManager.f27595w0, DevicesDataManager.access$getModel(devicesDataManager));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DevicesDataManager(@NotNull NetworkWorker worker) {
        super(new JsonDeserializer(DevicesDataManagerConfig.INSTANCE.serializer()));
        Intrinsics.checkNotNullParameter(worker, "worker");
        this.f27595w0 = worker;
        this.f27596x0 = LazyKt__LazyJVMKt.lazy(new a());
    }

    public static final /* synthetic */ DevicesDataManagerConfig access$getModel(DevicesDataManager devicesDataManager) {
        return devicesDataManager.getModel();
    }

    @Nullable
    public final Object unrollNotifications(@NotNull String str, @NotNull Continuation<? super FetchResult<Unit>> continuation) {
        UseCase useCase = (UseCase) this.f27596x0.getValue();
        DevicesDataManagerConfig model = getModel();
        String host = model != null ? model.getHost() : null;
        if (host == null) {
            throw new IllegalArgumentException("Required value was null.".toString());
        }
        DevicesDataManagerConfig model2 = getModel();
        String appId = model2 != null ? model2.getAppId() : null;
        if (appId != null) {
            return useCase.fetch(new UnrollNotificationsRequest(host, str, appId), continuation);
        }
        throw new IllegalArgumentException("Required value was null.".toString());
    }
}

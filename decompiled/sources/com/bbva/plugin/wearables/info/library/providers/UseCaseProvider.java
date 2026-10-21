package com.bbva.plugin.wearables.info.library.providers;

import com.bbva.plugin.wearables.info.library.usecase.IsDevicePairedUserCase;
import com.bbva.plugin.wearables.info.library.usecase.IsPairedDeviceAppInstalledUseCase;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: DependenciesProvider.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0002\u0010\u0004R\u0012\u0010\u0005\u001a\u00020\u0006X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/bbva/plugin/wearables/info/library/providers/UseCaseProvider;", "", "isAppInstalled", "Lcom/bbva/plugin/wearables/info/library/usecase/IsPairedDeviceAppInstalledUseCase;", "()Lcom/bbva/plugin/wearables/info/library/usecase/IsPairedDeviceAppInstalledUseCase;", "isDeviceConnected", "Lcom/bbva/plugin/wearables/info/library/usecase/IsDevicePairedUserCase;", "()Lcom/bbva/plugin/wearables/info/library/usecase/IsDevicePairedUserCase;", "plugin-wearables-info_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public interface UseCaseProvider {
    @NotNull
    IsPairedDeviceAppInstalledUseCase isAppInstalled();

    @NotNull
    IsDevicePairedUserCase isDeviceConnected();
}

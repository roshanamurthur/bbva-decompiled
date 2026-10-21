package com.bbva.glomohybrid.settings;

import com.bbva.component.dm.settings.domain.model.AppSettingsResult;
import com.bbva.component.dm.settings.domain.usecase.AppSettingsObserver;
import com.bbva.network.NetworkWorker;
import com.bbva.network.model.ConnectionThreshold;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: NetworkSpeedAppSettingsObserver.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\n"}, d2 = {"Lcom/bbva/glomohybrid/settings/NetworkSpeedAppSettingsObserver;", "Lcom/bbva/component/dm/settings/domain/usecase/AppSettingsObserver;", "Lcom/bbva/component/dm/settings/domain/model/AppSettingsResult;", "appSettingsResult", "", "onReceive", "Lcom/bbva/network/NetworkWorker;", "worker", "<init>", "(Lcom/bbva/network/NetworkWorker;)V", "app_mexicoProdGoogleRelease"}, k = 1, mv = {1, 9, 0})
public final class NetworkSpeedAppSettingsObserver implements AppSettingsObserver {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    @NotNull
    public final NetworkWorker f34461p0;

    public NetworkSpeedAppSettingsObserver(@NotNull NetworkWorker worker) {
        Intrinsics.checkNotNullParameter(worker, "worker");
        this.f34461p0 = worker;
    }

    @Override // com.bbva.component.dm.settings.domain.usecase.AppSettingsObserver
    public void onReceive(@NotNull AppSettingsResult appSettingsResult) {
        Intrinsics.checkNotNullParameter(appSettingsResult, "appSettingsResult");
        if (appSettingsResult instanceof AppSettingsResult.FreshResult) {
            ConnectionThreshold networkSpeedConfiguration = appSettingsResult.getData().getNetworkSpeedConfiguration();
            if (networkSpeedConfiguration == null) {
                networkSpeedConfiguration = new ConnectionThreshold(null, null, 3, null);
            }
            this.f34461p0.updateConnectionThreshold(networkSpeedConfiguration);
        }
    }
}

package com.bbva.networkmonitor.component;

import com.bbva.cells.component.kit.common.ReactiveComponent;
import com.bbva.networkmonitor.lib.implementation.NetworkChangeProvider;
import com.bbva.networkmonitor.lib.usecase.NetworkMonitorChangeUseCase;
import com.bbva.networkmonitor.lib.usecase.NetworkProblemsUseCase;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: NetworkMonitorDataManager.kt */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u000e2\u00020\u0001:\u0001\u000eB\u000f\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\b\u0010\u0003\u001a\u00020\u0002H\u0016J\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004J\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¨\u0006\u000f"}, d2 = {"Lcom/bbva/networkmonitor/component/NetworkMonitorDataManager;", "Lcom/bbva/cells/component/kit/common/ReactiveComponent;", "", "getId", "Lkotlinx/coroutines/flow/Flow;", "", "networkMonitor", "", "", "getNetworkProblems", "Lcom/bbva/networkmonitor/lib/implementation/NetworkChangeProvider;", "networkDataProvider", "<init>", "(Lcom/bbva/networkmonitor/lib/implementation/NetworkChangeProvider;)V", "Companion", "cmp-dp-network_release"}, k = 1, mv = {1, 9, 0})
public final class NetworkMonitorDataManager extends ReactiveComponent {

    @NotNull
    public static final String ID = "component-dm-network-monitor";

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    @NotNull
    public final NetworkMonitorChangeUseCase f35201p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    @NotNull
    public final NetworkProblemsUseCase f35202q0;

    public NetworkMonitorDataManager(@NotNull NetworkChangeProvider networkDataProvider) {
        Intrinsics.checkNotNullParameter(networkDataProvider, "networkDataProvider");
        this.f35201p0 = new NetworkMonitorChangeUseCase(networkDataProvider);
        this.f35202q0 = new NetworkProblemsUseCase(networkDataProvider);
    }

    @Override // com.bbva.cells.component.kit.common.Component
    @NotNull
    /* JADX INFO: renamed from: getId */
    public String getF32219p0() {
        return ID;
    }

    @NotNull
    public final List<Integer> getNetworkProblems() {
        return this.f35202q0.execute();
    }

    @NotNull
    public final Flow<Boolean> networkMonitor() {
        return this.f35201p0.execute();
    }
}

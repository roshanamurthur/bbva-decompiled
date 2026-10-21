package com.bbva.networkmonitor.lib.usecase;

import com.bbva.glomoutils.usecase.UseCase;
import com.bbva.networkmonitor.lib.implementation.NetworkChangeProvider;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: NetworkProblemsUseCase.kt */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001B\u000f\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000e\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016¨\u0006\t"}, d2 = {"Lcom/bbva/networkmonitor/lib/usecase/NetworkProblemsUseCase;", "Lcom/bbva/glomoutils/usecase/UseCase;", "", "", "execute", "Lcom/bbva/networkmonitor/lib/implementation/NetworkChangeProvider;", "networkProvider", "<init>", "(Lcom/bbva/networkmonitor/lib/implementation/NetworkChangeProvider;)V", "cmp-dp-network_release"}, k = 1, mv = {1, 9, 0})
public final class NetworkProblemsUseCase implements UseCase<List<? extends Integer>> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final NetworkChangeProvider f35222a;

    public NetworkProblemsUseCase(@NotNull NetworkChangeProvider networkProvider) {
        Intrinsics.checkNotNullParameter(networkProvider, "networkProvider");
        this.f35222a = networkProvider;
    }

    @Override // com.bbva.glomoutils.usecase.UseCase
    @NotNull
    public List<? extends Integer> execute() {
        return this.f35222a.getNetworkCauses();
    }
}

package com.bbva.glomohybrid.login.domain.usecase;

import com.bbva.glomoutils.usecase.UseCase;
import com.bbva.network.NetworkWorker;
import com.bbva.network.model.ConnectionStatusEvent;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: CheckConnectionUseCase.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001B\u000f\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000e\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016¨\u0006\t"}, d2 = {"Lcom/bbva/glomohybrid/login/domain/usecase/CheckConnectionUseCase;", "Lcom/bbva/glomoutils/usecase/UseCase;", "Lkotlinx/coroutines/flow/Flow;", "Lcom/bbva/network/model/ConnectionStatusEvent;", "execute", "Lcom/bbva/network/NetworkWorker;", "worker", "<init>", "(Lcom/bbva/network/NetworkWorker;)V", "Login_mexicoGoogleRelease"}, k = 1, mv = {1, 9, 0})
public final class CheckConnectionUseCase implements UseCase<Flow<? extends ConnectionStatusEvent>> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final NetworkWorker f33418a;

    public CheckConnectionUseCase(@NotNull NetworkWorker worker) {
        Intrinsics.checkNotNullParameter(worker, "worker");
        this.f33418a = worker;
    }

    @Override // com.bbva.glomoutils.usecase.UseCase
    @NotNull
    public Flow<? extends ConnectionStatusEvent> execute() {
        return NetworkWorker.DefaultImpls.connectionStatus$default(this.f33418a, 0L, 1, null);
    }
}

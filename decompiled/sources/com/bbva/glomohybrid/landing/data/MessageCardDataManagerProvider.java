package com.bbva.glomohybrid.landing.data;

import com.bbva.component.dm.aem.AEMDataManager;
import com.bbva.component.dm.aem.model.AEMConfiguration;
import com.bbva.component.dm.settings.domain.model.LandingSectionConfiguration;
import com.bbva.glomohybrid.landing.data.mapper.LandingMessageCardAEMMapper;
import com.bbva.glomohybrid.landing.domain.aem.model.LandingMessageCardModel;
import com.bbva.network.NetworkWorker;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: MessageCardDataManagerProvider.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002¨\u0006\u000e"}, d2 = {"Lcom/bbva/glomohybrid/landing/data/MessageCardDataManagerProvider;", "", "Lcom/bbva/component/dm/settings/domain/model/LandingSectionConfiguration;", "configuration", "Lcom/bbva/component/dm/aem/AEMDataManager;", "", "Lcom/bbva/glomohybrid/landing/domain/aem/model/LandingMessageCardModel;", "provide", "Lcom/bbva/network/NetworkWorker;", "worker", "", "host", "<init>", "(Lcom/bbva/network/NetworkWorker;Ljava/lang/String;)V", "Landing_mexicoRelease"}, k = 1, mv = {1, 9, 0})
public final class MessageCardDataManagerProvider {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final NetworkWorker f32521a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final String f32522b;

    public MessageCardDataManagerProvider(@NotNull NetworkWorker worker, @NotNull String host) {
        Intrinsics.checkNotNullParameter(worker, "worker");
        Intrinsics.checkNotNullParameter(host, "host");
        this.f32521a = worker;
        this.f32522b = host;
    }

    @NotNull
    public final AEMDataManager<List<LandingMessageCardModel>> provide(@NotNull LandingSectionConfiguration configuration) {
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        String str = this.f32522b;
        AEMDataManager<List<LandingMessageCardModel>> aEMDataManager = new AEMDataManager<>(this.f32521a, new LandingMessageCardAEMMapper(str, configuration));
        aEMDataManager.updateModel(new AEMConfiguration(str));
        return aEMDataManager;
    }
}

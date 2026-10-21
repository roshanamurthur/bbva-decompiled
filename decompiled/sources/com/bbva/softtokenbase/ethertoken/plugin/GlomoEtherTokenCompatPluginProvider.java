package com.bbva.softtokenbase.ethertoken.plugin;

import com.bbva.ethermobilesdk.tokencompat.TokenCompatConfig;
import com.bbva.ethermobilesdk.tokencompat.plugin.EtherTokenCompatPlugin;
import com.bbva.softtokenbase.PluginProvider;
import com.bbva.softtokenbase.model.PluginData;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: GlomoEtherTokenCompatPluginProvider.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\b\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\b"}, d2 = {"Lcom/bbva/softtokenbase/ethertoken/plugin/GlomoEtherTokenCompatPluginProvider;", "Lcom/bbva/softtokenbase/PluginProvider;", "Lcom/bbva/softtokenbase/model/PluginData;", "provide", "Lcom/bbva/ethermobilesdk/tokencompat/TokenCompatConfig;", "config", "<init>", "(Lcom/bbva/ethermobilesdk/tokencompat/TokenCompatConfig;)V", "softtokenbase_release"}, k = 1, mv = {1, 9, 0})
public final class GlomoEtherTokenCompatPluginProvider implements PluginProvider {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final TokenCompatConfig f36886a;

    public GlomoEtherTokenCompatPluginProvider(@NotNull TokenCompatConfig config) {
        Intrinsics.checkNotNullParameter(config, "config");
        this.f36886a = config;
    }

    @Override // com.bbva.softtokenbase.PluginProvider
    @NotNull
    public PluginData provide() {
        return new PluginData(EtherTokenCompatPlugin.ID, new EtherTokenCompatPlugin(this.f36886a, null, 2, null));
    }
}

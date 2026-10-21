package com.bbva.softtokenbase.ethertoken.plugin;

import android.content.Context;
import com.bbva.ethermobilesdk.token.plugin.EtherTokenPlugin;
import com.bbva.ethermobilesdk.token.plugin.model.Configuration;
import com.bbva.ethermobilesdk.token.storage.Storage;
import com.bbva.softtokenbase.PluginProvider;
import com.bbva.softtokenbase.model.PluginData;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: GloMoEtherTokenPluginProvider.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B%\u0012\u001c\u0010\t\u001a\u0018\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0004j\u0002`\b¢\u0006\u0004\b\n\u0010\u000bJ\b\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\f"}, d2 = {"Lcom/bbva/softtokenbase/ethertoken/plugin/GloMoEtherTokenPluginProvider;", "Lcom/bbva/softtokenbase/PluginProvider;", "Lcom/bbva/softtokenbase/model/PluginData;", "provide", "Lkotlin/Function2;", "Landroid/content/Context;", "Lcom/bbva/ethermobilesdk/token/plugin/model/Configuration;", "Lcom/bbva/ethermobilesdk/token/storage/Storage;", "Lcom/bbva/ethermobilesdk/token/plugin/StorageProvider;", "storageProvider", "<init>", "(Lkotlin/jvm/functions/Function2;)V", "softtokenbase_release"}, k = 1, mv = {1, 9, 0})
public final class GloMoEtherTokenPluginProvider implements PluginProvider {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Function2<Context, Configuration, Storage> f36885a;

    /* JADX WARN: Multi-variable type inference failed */
    public GloMoEtherTokenPluginProvider(@NotNull Function2<? super Context, ? super Configuration, ? extends Storage> storageProvider) {
        Intrinsics.checkNotNullParameter(storageProvider, "storageProvider");
        this.f36885a = storageProvider;
    }

    @Override // com.bbva.softtokenbase.PluginProvider
    @NotNull
    public PluginData provide() {
        return new PluginData(EtherTokenPlugin.ID, new EtherTokenPlugin(this.f36885a));
    }
}

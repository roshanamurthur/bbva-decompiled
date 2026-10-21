package com.bbva.ethermobilesdk.token.plugin;

import android.content.Context;
import com.bbva.androidtoolkit.plugin.Plugin;
import com.bbva.ethermobilesdk.token.plugin.model.Configuration;
import com.bbva.ethermobilesdk.token.storage.Storage;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: EtherTokenPlugin.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u000e2\u00020\u0001:\u0001\u000eB%\u0012\u001c\u0010\u000b\u001a\u0018\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0006j\u0002`\n¢\u0006\u0004\b\f\u0010\rJ\b\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0005\u001a\u00020\u0004H\u0014¨\u0006\u000f"}, d2 = {"Lcom/bbva/ethermobilesdk/token/plugin/EtherTokenPlugin;", "Lcom/bbva/androidtoolkit/plugin/Plugin;", "", "getId", "Lcom/bbva/ethermobilesdk/token/plugin/EtherTokenCommandFactory;", "createCommandFactory", "Lkotlin/Function2;", "Landroid/content/Context;", "Lcom/bbva/ethermobilesdk/token/plugin/model/Configuration;", "Lcom/bbva/ethermobilesdk/token/storage/Storage;", "Lcom/bbva/ethermobilesdk/token/plugin/StorageProvider;", "storageProvider", "<init>", "(Lkotlin/jvm/functions/Function2;)V", "Companion", "ethertoken-plugin_release"}, k = 1, mv = {1, 8, 0})
public final class EtherTokenPlugin extends Plugin {

    @NotNull
    public static final String ID = "EtherToken";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Function2<Context, Configuration, Storage> f30125a;

    /* JADX WARN: Multi-variable type inference failed */
    public EtherTokenPlugin(@NotNull Function2<? super Context, ? super Configuration, ? extends Storage> storageProvider) {
        Intrinsics.checkNotNullParameter(storageProvider, "storageProvider");
        this.f30125a = storageProvider;
        Injector.INSTANCE.init(storageProvider);
    }

    @Override // com.bbva.androidtoolkit.plugin.Plugin
    @NotNull
    public String getId() {
        return ID;
    }

    @Override // com.bbva.androidtoolkit.plugin.Plugin
    @NotNull
    public EtherTokenCommandFactory createCommandFactory() {
        return new EtherTokenCommandFactory();
    }
}

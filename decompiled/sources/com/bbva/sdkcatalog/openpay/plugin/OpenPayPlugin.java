package com.bbva.sdkcatalog.openpay.plugin;

import com.bbva.androidtoolkit.plugin.Plugin;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: OpenPayPlugin.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0016J\b\u0010\u0006\u001a\u00020\u0007H\u0014¨\u0006\b"}, d2 = {"Lcom/bbva/sdkcatalog/openpay/plugin/OpenPayPlugin;", "Lcom/bbva/androidtoolkit/plugin/Plugin;", "<init>", "()V", "getId", "", "createCommandFactory", "Lcom/bbva/sdkcatalog/openpay/plugin/OpenPayCommandFactory;", "openpay-plugin_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class OpenPayPlugin extends Plugin {
    @Override // com.bbva.androidtoolkit.plugin.Plugin
    @NotNull
    public String getId() {
        return "OpenPay";
    }

    @Override // com.bbva.androidtoolkit.plugin.Plugin
    @NotNull
    public OpenPayCommandFactory createCommandFactory() {
        return new OpenPayCommandFactory();
    }
}

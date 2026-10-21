package com.bbva.gp2.android.product.trustdevice.plugin;

import com.bbva.androidtoolkit.plugin.Plugin;
import com.bbva.androidtoolkit.plugin.command.factory.CommandFactory;
import com.bbva.gp2.android.product.trustdevice.library.TrustDeviceLib;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: TrustDevicePlugin.kt */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u0000 \t2\u00020\u0001:\u0001\tB\u000f\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u0005\u001a\u00020\u0006H\u0014J\b\u0010\u0007\u001a\u00020\bH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/bbva/gp2/android/product/trustdevice/plugin/TrustDevicePlugin;", "Lcom/bbva/androidtoolkit/plugin/Plugin;", "trustDeviceLib", "Lcom/bbva/gp2/android/product/trustdevice/library/TrustDeviceLib;", "(Lcom/bbva/gp2/android/product/trustdevice/library/TrustDeviceLib;)V", "createCommandFactory", "Lcom/bbva/androidtoolkit/plugin/command/factory/CommandFactory;", "getId", "", "Companion", "payments-trustdevice-plugin_release"}, k = 1, mv = {1, 1, 16})
public final class TrustDevicePlugin extends Plugin {

    @NotNull
    public static final String ID = "TrustDevicePlugin";
    private final TrustDeviceLib trustDeviceLib;

    /* JADX WARN: Multi-variable type inference failed */
    public TrustDevicePlugin() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    @Override // com.bbva.androidtoolkit.plugin.Plugin
    @NotNull
    public CommandFactory createCommandFactory() {
        return new TrustDevicePluginCommandFactory();
    }

    @Override // com.bbva.androidtoolkit.plugin.Plugin
    @NotNull
    public String getId() {
        return ID;
    }

    public TrustDevicePlugin(@NotNull TrustDeviceLib trustDeviceLib) {
        this.trustDeviceLib = trustDeviceLib;
        TrustDeviceLibInjector.INSTANCE.initialize(trustDeviceLib);
    }

    public /* synthetic */ TrustDevicePlugin(TrustDeviceLib trustDeviceLib, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? new TrustDeviceLib() : trustDeviceLib);
    }
}

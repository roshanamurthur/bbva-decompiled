package com.bbva.plugin.digipassmanager;

import c4.b;
import com.bbva.androidtoolkit.plugin.Plugin;
import com.bbva.androidtoolkit.plugin.command.factory.CommandFactory;
import com.bbva.network.model.pinning.PinningCatalog;
import com.bbva.plugin.digipassmanager.commands.ActivateTokenCommand;
import com.bbva.plugin.digipassmanager.commands.DeleteTokenCommand;
import com.bbva.plugin.digipassmanager.commands.GenerateOtpCommand;
import com.bbva.plugin.digipassmanager.commands.OpenQRScannerCommand;
import com.bbva.plugin.digipassmanager.commands.RemainingTimeCommand;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import z6.q;
import z6.r;
import z6.s;
import z6.t;

/* JADX INFO: compiled from: DigipassManagerPlugin.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \n2\u00020\u0001:\u0002\n\u000bB\u0011\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\b\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0005\u001a\u00020\u0004H\u0014¨\u0006\f"}, d2 = {"Lcom/bbva/plugin/digipassmanager/DigipassManagerPlugin;", "Lcom/bbva/androidtoolkit/plugin/Plugin;", "", "getId", "Lcom/bbva/androidtoolkit/plugin/command/factory/CommandFactory;", "createCommandFactory", "Lcom/bbva/network/model/pinning/PinningCatalog;", "pinningCatalog", "<init>", "(Lcom/bbva/network/model/pinning/PinningCatalog;)V", "Companion", "DigipassManagerPluginCommandFactory", "digipassmanager-plugin_release"}, k = 1, mv = {1, 8, 0})
public final class DigipassManagerPlugin extends Plugin {

    @NotNull
    public static final String ID = "TokenCronto";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public final PinningCatalog f35623a;

    /* JADX INFO: compiled from: DigipassManagerPlugin.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0080\u0004\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/bbva/plugin/digipassmanager/DigipassManagerPlugin$DigipassManagerPluginCommandFactory;", "Lcom/bbva/androidtoolkit/plugin/command/factory/CommandFactory;", "(Lcom/bbva/plugin/digipassmanager/DigipassManagerPlugin;)V", "digipassmanager-plugin_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public final class DigipassManagerPluginCommandFactory extends CommandFactory {
        public DigipassManagerPluginCommandFactory(DigipassManagerPlugin digipassManagerPlugin) {
            addCommandProvider(ActivateTokenCommand.ID, new b(digipassManagerPlugin, 1));
            addCommandProvider(GenerateOtpCommand.ID, new q(3));
            addCommandProvider(RemainingTimeCommand.ID, new r(3));
            addCommandProvider(DeleteTokenCommand.ID, new s(4));
            addCommandProvider(OpenQRScannerCommand.ID, new t(3));
        }
    }

    public DigipassManagerPlugin(@Nullable PinningCatalog pinningCatalog) {
        this.f35623a = pinningCatalog;
    }

    @Override // com.bbva.androidtoolkit.plugin.Plugin
    @NotNull
    public CommandFactory createCommandFactory() {
        return new DigipassManagerPluginCommandFactory(this);
    }

    @Override // com.bbva.androidtoolkit.plugin.Plugin
    @NotNull
    public String getId() {
        return ID;
    }
}

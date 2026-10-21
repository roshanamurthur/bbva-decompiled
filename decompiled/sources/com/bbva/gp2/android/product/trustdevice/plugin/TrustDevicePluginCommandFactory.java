package com.bbva.gp2.android.product.trustdevice.plugin;

import com.bbva.androidtoolkit.plugin.command.factory.CommandFactory;
import com.bbva.androidtoolkit.plugin.command.factory.CommandProvider;
import com.bbva.gp2.android.product.trustdevice.plugin.command.AreKeysReadyCommand;
import com.bbva.gp2.android.product.trustdevice.plugin.command.DeleteDeviceLocalCommand;
import com.bbva.gp2.android.product.trustdevice.plugin.command.IsRegisteredCommand;
import com.bbva.gp2.android.product.trustdevice.plugin.command.LoginCommand;
import com.bbva.gp2.android.product.trustdevice.plugin.command.PreRegisterCommand;
import com.bbva.gp2.android.product.trustdevice.plugin.command.SetPushTokenCommand;
import com.bbva.gp2.android.product.trustdevice.plugin.command.SetRegistrationTokenCommand;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: TrustDevicePluginCommandFactory.kt */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/bbva/gp2/android/product/trustdevice/plugin/TrustDevicePluginCommandFactory;", "Lcom/bbva/androidtoolkit/plugin/command/factory/CommandFactory;", "()V", "payments-trustdevice-plugin_release"}, k = 1, mv = {1, 1, 16})
public final class TrustDevicePluginCommandFactory extends CommandFactory {
    public TrustDevicePluginCommandFactory() {
        addCommandProvider(AreKeysReadyCommand.ID, new CommandProvider() { // from class: com.bbva.gp2.android.product.trustdevice.plugin.TrustDevicePluginCommandFactory.1
            @Override // com.bbva.androidtoolkit.plugin.command.factory.CommandProvider
            @NotNull
            public final AreKeysReadyCommand create() {
                return new AreKeysReadyCommand(Void.class);
            }
        });
        addCommandProvider("deletedevicelocal", new CommandProvider() { // from class: com.bbva.gp2.android.product.trustdevice.plugin.TrustDevicePluginCommandFactory.2
            @Override // com.bbva.androidtoolkit.plugin.command.factory.CommandProvider
            @NotNull
            public final DeleteDeviceLocalCommand create() {
                return new DeleteDeviceLocalCommand(Void.class);
            }
        });
        addCommandProvider(IsRegisteredCommand.ID, new CommandProvider() { // from class: com.bbva.gp2.android.product.trustdevice.plugin.TrustDevicePluginCommandFactory.3
            @Override // com.bbva.androidtoolkit.plugin.command.factory.CommandProvider
            @NotNull
            public final IsRegisteredCommand create() {
                return new IsRegisteredCommand(Void.class);
            }
        });
        addCommandProvider("login", new CommandProvider() { // from class: com.bbva.gp2.android.product.trustdevice.plugin.TrustDevicePluginCommandFactory.4
            @Override // com.bbva.androidtoolkit.plugin.command.factory.CommandProvider
            @NotNull
            public final LoginCommand create() {
                return new LoginCommand();
            }
        });
        addCommandProvider(PreRegisterCommand.ID, new CommandProvider() { // from class: com.bbva.gp2.android.product.trustdevice.plugin.TrustDevicePluginCommandFactory.5
            @Override // com.bbva.androidtoolkit.plugin.command.factory.CommandProvider
            @NotNull
            public final PreRegisterCommand create() {
                return new PreRegisterCommand();
            }
        });
        addCommandProvider(SetPushTokenCommand.ID, new CommandProvider() { // from class: com.bbva.gp2.android.product.trustdevice.plugin.TrustDevicePluginCommandFactory.6
            @Override // com.bbva.androidtoolkit.plugin.command.factory.CommandProvider
            @NotNull
            public final SetPushTokenCommand create() {
                return new SetPushTokenCommand();
            }
        });
        addCommandProvider(SetRegistrationTokenCommand.ID, new CommandProvider() { // from class: com.bbva.gp2.android.product.trustdevice.plugin.TrustDevicePluginCommandFactory.7
            @Override // com.bbva.androidtoolkit.plugin.command.factory.CommandProvider
            @NotNull
            public final SetRegistrationTokenCommand create() {
                return new SetRegistrationTokenCommand();
            }
        });
    }
}

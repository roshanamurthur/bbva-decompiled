package z6;

import com.bbva.androidtoolkit.plugin.command.AbstractCommand;
import com.bbva.androidtoolkit.plugin.command.factory.CommandProvider;
import com.bbva.ethermobilesdk.deviceinfo.plugin.command.GetAppVersionCommand;
import com.bbva.ethermobilesdk.deviceinfo.plugin.command.GetBatteryLevelCommand;
import com.bbva.ethermobilesdk.plugin.command.pincipher.PinCipherGenerateKeyPairCommand;
import com.bbva.ethermobilesdk.token.plugin.command.ActivateTokenCommand;
import com.bbva.plugin.google.pay.command.PushProvisioningCommand;
import com.bbva.plugin.naturalauthentication.NaturalAuthenticationCommandFactory;
import com.bbva.plugin.naturalauthentication.command.RegisterCommand;
import com.bbva.plugin.push.command.GetPermissionsCommand;
import com.bbva.sdkcatalog.openpay.plugin.command.CheckPaymentLinkCommand;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class a implements CommandProvider {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f94985a;

    public /* synthetic */ a(int i10) {
        this.f94985a = i10;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.bbva.androidtoolkit.plugin.command.factory.CommandProvider
    public final AbstractCommand create() {
        switch (this.f94985a) {
            case 0:
                return new GetAppVersionCommand();
            case 1:
                return new GetBatteryLevelCommand();
            case 2:
                return new PinCipherGenerateKeyPairCommand();
            case 3:
                return new ActivateTokenCommand();
            case 4:
                return new PushProvisioningCommand();
            case 5:
                NaturalAuthenticationCommandFactory.Companion companion = NaturalAuthenticationCommandFactory.Companion;
                return new RegisterCommand(null, 1, 0 == true ? 1 : 0);
            case 6:
                return new GetPermissionsCommand();
            default:
                return new CheckPaymentLinkCommand();
        }
    }
}

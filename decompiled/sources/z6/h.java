package z6;

import com.bbva.androidtoolkit.plugin.activity.result.ActivityLauncher;
import com.bbva.androidtoolkit.plugin.command.AbstractCommand;
import com.bbva.androidtoolkit.plugin.command.factory.CommandProvider;
import com.bbva.ethermobilesdk.deviceinfo.plugin.command.GetCurrentSystemThemeCommand;
import com.bbva.ethermobilesdk.plugin.devicemanager.command.DeviceIdCommand;
import com.bbva.gp2.android.product.mobilepayment.plugin.MobilePaymentCommandFactory;
import com.bbva.plugin.biometrics.command.CheckEnableCommand;
import com.bbva.plugin.localstorage.command.secure.IsBiometricAvailableCommand;
import com.bbva.plugin.signaturepad.PluginCommandFactory;
import com.bbva.plugin.signaturepad.command.CaptureSignatureCommand;
import com.bbva.sdkcatalog.openpay.plugin.command.InitTapOnPhoneCommand;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class h implements CommandProvider {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f94992a;

    public /* synthetic */ h(int i10) {
        this.f94992a = i10;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.bbva.androidtoolkit.plugin.command.factory.CommandProvider
    public final AbstractCommand create() {
        switch (this.f94992a) {
            case 0:
                return new GetCurrentSystemThemeCommand();
            case 1:
                return new DeviceIdCommand();
            case 2:
                return MobilePaymentCommandFactory._init_$lambda$11();
            case 3:
                return new CheckEnableCommand(null, 1, 0 == true ? 1 : 0);
            case 4:
                return new IsBiometricAvailableCommand();
            case 5:
                PluginCommandFactory.Companion companion = PluginCommandFactory.INSTANCE;
                return new CaptureSignatureCommand(new ActivityLauncher());
            default:
                return new InitTapOnPhoneCommand();
        }
    }
}

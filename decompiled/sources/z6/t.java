package z6;

import com.bbva.androidtoolkit.plugin.activity.result.ActivityLauncher;
import com.bbva.androidtoolkit.plugin.command.AbstractCommand;
import com.bbva.androidtoolkit.plugin.command.factory.CommandProvider;
import com.bbva.ethermobilesdk.deviceinfo.plugin.command.GetStorageUsageCommand;
import com.bbva.ethermobilesdk.plugin.command.jwe.JweDecryptCommand;
import com.bbva.ocrcardplugin.command.impl.ScanCommand;
import com.bbva.plugin.digipassmanager.commands.OpenQRScannerCommand;
import com.bbva.plugin.naturalauthentication.NaturalAuthenticationCommandFactory;
import com.bbva.plugin.naturalauthentication.command.GetDeviceIdCommand;
import com.bbva.speech.plugin.command.SpeakCommand;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class t implements CommandProvider {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f95004a;

    public /* synthetic */ t(int i10) {
        this.f95004a = i10;
    }

    @Override // com.bbva.androidtoolkit.plugin.command.factory.CommandProvider
    public final AbstractCommand create() {
        switch (this.f95004a) {
            case 0:
                return new GetStorageUsageCommand();
            case 1:
                return new JweDecryptCommand();
            case 2:
                return new ScanCommand();
            case 3:
                return new OpenQRScannerCommand(new ActivityLauncher());
            case 4:
                NaturalAuthenticationCommandFactory.Companion companion = NaturalAuthenticationCommandFactory.Companion;
                return new GetDeviceIdCommand();
            default:
                return new SpeakCommand();
        }
    }
}

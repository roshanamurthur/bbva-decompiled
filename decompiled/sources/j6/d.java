package j6;

import com.bbva.androidtoolkit.plugin.command.AbstractCommand;
import com.bbva.androidtoolkit.plugin.command.factory.CommandProvider;
import com.bbva.dcaptureplugin.DocumentCaptureCommandFactory;
import com.bbva.dcaptureplugin.command.GetConfigurationKeysCommand;
import com.bbva.ethermobilesdk.deviceinfo.plugin.command.IsDeviceSecureCommand;
import com.bbva.gp2.android.product.mobilepayment.plugin.MobilePaymentCommandFactory;
import com.bbva.plugin.naturalauthentication.NaturalAuthenticationCommandFactory;
import com.bbva.plugin.naturalauthentication.command.DiscoverBiometricCapabilitiesCommand;
import com.bbva.sdkcatalog.openpay.plugin.command.ConnectToBluetoothDeviceCommand;
import com.bbva.selfiecapture.plugin.SelfieCaptureCommandFactory;
import com.bbva.selfiecapture.plugin.command.GetVersionCommand;
import com.bbva.videocapture.VideoCaptureCommandFactory;
import com.bbva.videocapture.command.StopVideoCaptureCommand;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class d implements CommandProvider {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f78794a;

    public /* synthetic */ d(int i10) {
        this.f78794a = i10;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.bbva.androidtoolkit.plugin.command.factory.CommandProvider
    public final AbstractCommand create() {
        switch (this.f78794a) {
            case 0:
                DocumentCaptureCommandFactory.Companion companion = DocumentCaptureCommandFactory.INSTANCE;
                return new GetConfigurationKeysCommand();
            case 1:
                return new IsDeviceSecureCommand();
            case 2:
                return MobilePaymentCommandFactory._init_$lambda$4();
            case 3:
                NaturalAuthenticationCommandFactory.Companion companion2 = NaturalAuthenticationCommandFactory.INSTANCE;
                return new DiscoverBiometricCapabilitiesCommand(null, 1, 0 == true ? 1 : 0);
            case 4:
                return new ConnectToBluetoothDeviceCommand();
            case 5:
                SelfieCaptureCommandFactory.Companion companion3 = SelfieCaptureCommandFactory.INSTANCE;
                return new GetVersionCommand();
            default:
                VideoCaptureCommandFactory.Companion companion4 = VideoCaptureCommandFactory.INSTANCE;
                return new StopVideoCaptureCommand();
        }
    }
}

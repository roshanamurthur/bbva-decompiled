package j6;

import com.bbva.androidtoolkit.plugin.activity.result.ActivityLauncher;
import com.bbva.androidtoolkit.plugin.command.AbstractCommand;
import com.bbva.androidtoolkit.plugin.command.factory.CommandProvider;
import com.bbva.dcaptureplugin.DocumentCaptureCommandFactory;
import com.bbva.dcaptureplugin.command.GetVersionCommand;
import com.bbva.ethermobilesdk.deviceinfo.plugin.command.GetModelCommand;
import com.bbva.gp2.android.product.mobilepayment.plugin.MobilePaymentCommandFactory;
import com.bbva.plugin.naturalauthentication.NaturalAuthenticationCommandFactory;
import com.bbva.plugin.naturalauthentication.command.DiscoverCapabilitiesCommand;
import com.bbva.plugin.zoomauthp.PluginCommandFactory;
import com.bbva.plugin.zoomauthp.command.ZoomUpdateCommand;
import com.bbva.sdkcatalog.openpay.plugin.command.ScanNewDevicesCommand;
import com.bbva.selfiecapture.plugin.SelfieCaptureCommandFactory;
import com.bbva.selfiecapture.plugin.command.StopSelfieCaptureCommand;
import com.bbva.videocapture.VideoCaptureCommandFactory;
import com.bbva.videocapture.command.LaunchVideoCaptureCommand;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class c implements CommandProvider {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f78793a;

    public /* synthetic */ c(int i10) {
        this.f78793a = i10;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.bbva.androidtoolkit.plugin.command.factory.CommandProvider
    public final AbstractCommand create() {
        switch (this.f78793a) {
            case 0:
                DocumentCaptureCommandFactory.Companion companion = DocumentCaptureCommandFactory.INSTANCE;
                return new GetVersionCommand();
            case 1:
                return new GetModelCommand();
            case 2:
                return MobilePaymentCommandFactory._init_$lambda$3();
            case 3:
                NaturalAuthenticationCommandFactory.Companion companion2 = NaturalAuthenticationCommandFactory.INSTANCE;
                return new DiscoverCapabilitiesCommand(null, 1, 0 == true ? 1 : 0);
            case 4:
                PluginCommandFactory.Companion companion3 = PluginCommandFactory.INSTANCE;
                return new ZoomUpdateCommand(new ActivityLauncher());
            case 5:
                return new ScanNewDevicesCommand();
            case 6:
                SelfieCaptureCommandFactory.Companion companion4 = SelfieCaptureCommandFactory.INSTANCE;
                return new StopSelfieCaptureCommand();
            default:
                VideoCaptureCommandFactory.Companion companion5 = VideoCaptureCommandFactory.INSTANCE;
                return new LaunchVideoCaptureCommand();
        }
    }
}

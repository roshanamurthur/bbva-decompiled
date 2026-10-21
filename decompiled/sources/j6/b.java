package j6;

import com.bbva.androidtoolkit.plugin.activity.result.ActivityLauncher;
import com.bbva.androidtoolkit.plugin.command.AbstractCommand;
import com.bbva.androidtoolkit.plugin.command.factory.CommandProvider;
import com.bbva.dcaptureplugin.DocumentCaptureCommandFactory;
import com.bbva.dcaptureplugin.command.StopDocumentCaptureCommand;
import com.bbva.ethermobilesdk.deviceinfo.plugin.command.GetDeviceIdCommand;
import com.bbva.ethermobilesdk.tokencompat.plugin.command.GetTokenOathCommand;
import com.bbva.gp2.android.product.mobilepayment.plugin.MobilePaymentCommandFactory;
import com.bbva.plugin.naturalauthentication.NaturalAuthenticationCommandFactory;
import com.bbva.plugin.naturalauthentication.command.SetFacetsUrlCommand;
import com.bbva.plugin.zoomauthp.PluginCommandFactory;
import com.bbva.plugin.zoomauthp.command.ZoomAuthCommand;
import com.bbva.sdkcatalog.openpay.plugin.command.CheckTapOnPhoneMobileCapabilitiesCommand;
import com.bbva.selfiecapture.plugin.SelfieCaptureCommandFactory;
import com.bbva.selfiecapture.plugin.command.LaunchSelfieCaptureCommand;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class b implements CommandProvider {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f78792a;

    public /* synthetic */ b(int i10) {
        this.f78792a = i10;
    }

    @Override // com.bbva.androidtoolkit.plugin.command.factory.CommandProvider
    public final AbstractCommand create() {
        switch (this.f78792a) {
            case 0:
                DocumentCaptureCommandFactory.Companion companion = DocumentCaptureCommandFactory.INSTANCE;
                return new StopDocumentCaptureCommand();
            case 1:
                return new GetDeviceIdCommand();
            case 2:
                return new GetTokenOathCommand();
            case 3:
                return MobilePaymentCommandFactory._init_$lambda$2();
            case 4:
                NaturalAuthenticationCommandFactory.Companion companion2 = NaturalAuthenticationCommandFactory.INSTANCE;
                return new SetFacetsUrlCommand();
            case 5:
                PluginCommandFactory.Companion companion3 = PluginCommandFactory.INSTANCE;
                return new ZoomAuthCommand(new ActivityLauncher());
            case 6:
                return new CheckTapOnPhoneMobileCapabilitiesCommand();
            default:
                SelfieCaptureCommandFactory.Companion companion4 = SelfieCaptureCommandFactory.INSTANCE;
                return new LaunchSelfieCaptureCommand();
        }
    }
}

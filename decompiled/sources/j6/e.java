package j6;

import com.bbva.androidtoolkit.plugin.command.AbstractCommand;
import com.bbva.androidtoolkit.plugin.command.factory.CommandProvider;
import com.bbva.dcaptureplugin.DocumentCaptureCommandFactory;
import com.bbva.dcaptureplugin.command.GetCountryDocumentsCommand;
import com.bbva.ethermobilesdk.deviceinfo.plugin.command.GetCollideFingerprintCommand;
import com.bbva.gp2.android.product.mobilepayment.plugin.MobilePaymentCommandFactory;
import com.bbva.plugin.naturalauthentication.NaturalAuthenticationCommandFactory;
import com.bbva.plugin.naturalauthentication.command.HasSuitableAuthenticatorCommand;
import com.bbva.sdkcatalog.openpay.plugin.command.ExecuteChargeCommand;
import com.bbva.selfiecapture.plugin.SelfieCaptureCommandFactory;
import com.bbva.selfiecapture.plugin.command.GetConfigurationKeysCommand;
import com.bbva.videocapture.VideoCaptureCommandFactory;
import com.bbva.videocapture.command.GetVersionCommand;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class e implements CommandProvider {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f78795a;

    public /* synthetic */ e(int i10) {
        this.f78795a = i10;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.bbva.androidtoolkit.plugin.command.factory.CommandProvider
    public final AbstractCommand create() {
        switch (this.f78795a) {
            case 0:
                DocumentCaptureCommandFactory.Companion companion = DocumentCaptureCommandFactory.INSTANCE;
                return new GetCountryDocumentsCommand();
            case 1:
                return new GetCollideFingerprintCommand();
            case 2:
                return MobilePaymentCommandFactory._init_$lambda$5();
            case 3:
                NaturalAuthenticationCommandFactory.Companion companion2 = NaturalAuthenticationCommandFactory.INSTANCE;
                return new HasSuitableAuthenticatorCommand(null, 1, 0 == true ? 1 : 0);
            case 4:
                return new ExecuteChargeCommand();
            case 5:
                SelfieCaptureCommandFactory.Companion companion3 = SelfieCaptureCommandFactory.INSTANCE;
                return new GetConfigurationKeysCommand();
            default:
                VideoCaptureCommandFactory.Companion companion4 = VideoCaptureCommandFactory.INSTANCE;
                return new GetVersionCommand();
        }
    }
}

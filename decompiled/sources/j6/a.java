package j6;

import com.bbva.androidtoolkit.plugin.command.AbstractCommand;
import com.bbva.androidtoolkit.plugin.command.factory.CommandProvider;
import com.bbva.dcaptureplugin.DocumentCaptureCommandFactory;
import com.bbva.dcaptureplugin.command.LaunchDocumentCaptureCommand;
import com.bbva.ethermobilesdk.deviceinfo.plugin.command.GetTrueTimeCommand;
import com.bbva.gp2.android.product.mobilepayment.plugin.MobilePaymentCommandFactory;
import com.bbva.plugin.naturalauthentication.NaturalAuthenticationCommandFactory;
import com.bbva.plugin.naturalauthentication.command.ProcessAuthMessageCommand;
import com.bbva.sdkcatalog.openpay.plugin.command.ExecuteTapOnPhoneRefundCommand;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class a implements CommandProvider {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f78791a;

    public /* synthetic */ a(int i10) {
        this.f78791a = i10;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.bbva.androidtoolkit.plugin.command.factory.CommandProvider
    public final AbstractCommand create() {
        switch (this.f78791a) {
            case 0:
                DocumentCaptureCommandFactory.Companion companion = DocumentCaptureCommandFactory.INSTANCE;
                return new LaunchDocumentCaptureCommand();
            case 1:
                return new GetTrueTimeCommand();
            case 2:
                return MobilePaymentCommandFactory._init_$lambda$1();
            case 3:
                NaturalAuthenticationCommandFactory.Companion companion2 = NaturalAuthenticationCommandFactory.INSTANCE;
                return new ProcessAuthMessageCommand(null, 1, 0 == true ? 1 : 0);
            default:
                return new ExecuteTapOnPhoneRefundCommand();
        }
    }
}

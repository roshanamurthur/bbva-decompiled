package z6;

import com.bbva.androidtoolkit.plugin.command.AbstractCommand;
import com.bbva.androidtoolkit.plugin.command.factory.CommandProvider;
import com.bbva.ethermobilesdk.deviceinfo.plugin.command.GetSystemPropertiesCommand;
import com.bbva.gp2.android.product.mobilepayment.plugin.MobilePaymentCommandFactory;
import com.bbva.plugin.naturalauthentication.NaturalAuthenticationCommandFactory;
import com.bbva.plugin.naturalauthentication.command.QuickAuthDataCommand;
import com.bbva.sdkcatalog.openpay.plugin.command.ListTransactionsCommand;
import com.bbva.selfiecapture.plugin.SelfieCaptureCommandFactory;
import com.bbva.selfiecapture.plugin.command.UpdateChallengeCommand;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class k implements CommandProvider {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f94995a;

    public /* synthetic */ k(int i10) {
        this.f94995a = i10;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.bbva.androidtoolkit.plugin.command.factory.CommandProvider
    public final AbstractCommand create() {
        switch (this.f94995a) {
            case 0:
                return new GetSystemPropertiesCommand();
            case 1:
                return MobilePaymentCommandFactory._init_$lambda$7();
            case 2:
                NaturalAuthenticationCommandFactory.Companion companion = NaturalAuthenticationCommandFactory.INSTANCE;
                return new QuickAuthDataCommand(null, 1, 0 == true ? 1 : 0);
            case 3:
                return new ListTransactionsCommand();
            default:
                SelfieCaptureCommandFactory.Companion companion2 = SelfieCaptureCommandFactory.INSTANCE;
                return new UpdateChallengeCommand();
        }
    }
}

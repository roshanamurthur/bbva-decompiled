package z6;

import com.bbva.androidtoolkit.plugin.command.AbstractCommand;
import com.bbva.androidtoolkit.plugin.command.factory.CommandProvider;
import com.bbva.ethermobilesdk.deviceinfo.plugin.command.IsGooglePlayServicesAvailableCommand;
import com.bbva.gp2.android.product.mobilepayment.plugin.MobilePaymentCommandFactory;
import com.bbva.plugin.biometrics.command.AuthenticateCommand;
import com.bbva.plugin.naturalauthentication.NaturalAuthenticationCommandFactory;
import com.bbva.plugin.naturalauthentication.command.InitializeCommand;
import com.bbva.plugin.naturalauthentication.command.provider.FidoCallbackProvider;
import com.bbva.plugin.smsregex.request.Injectior;
import com.bbva.plugin.smsregex.request.command.Request;
import com.bbva.sdkcatalog.openpay.plugin.command.ExecuteTapOnPhoneChargeCommand;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class i implements CommandProvider {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f94993a;

    public /* synthetic */ i(int i10) {
        this.f94993a = i10;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.bbva.androidtoolkit.plugin.command.factory.CommandProvider
    public final AbstractCommand create() {
        FidoCallbackProvider fidoCallbackProvider = null;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        Object[] objArr3 = 0;
        Object[] objArr4 = 0;
        switch (this.f94993a) {
            case 0:
                return new IsGooglePlayServicesAvailableCommand();
            case 1:
                return MobilePaymentCommandFactory._init_$lambda$12();
            case 2:
                return new AuthenticateCommand(objArr3 == true ? 1 : 0, objArr2 == true ? 1 : 0, 3, objArr == true ? 1 : 0);
            case 3:
                NaturalAuthenticationCommandFactory.Companion companion = NaturalAuthenticationCommandFactory.Companion;
                return new InitializeCommand(fidoCallbackProvider, 1, objArr4 == true ? 1 : 0);
            case 4:
                return new Request(Injectior.INSTANCE);
            default:
                return new ExecuteTapOnPhoneChargeCommand();
        }
    }
}

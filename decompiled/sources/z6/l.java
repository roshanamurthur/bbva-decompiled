package z6;

import com.bbva.androidtoolkit.plugin.command.AbstractCommand;
import com.bbva.androidtoolkit.plugin.command.factory.CommandProvider;
import com.bbva.ethermobilesdk.deviceinfo.plugin.command.GetBrightnessLevelCommand;
import com.bbva.ethermobilesdk.deviceinfo.plugin.command.GetLanguageCommand;
import com.bbva.ethermobilesdk.plugin.command.hash.HashCommand;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import com.bbva.plugin.google.pay.command.CardsPendingVerificationCommand;
import com.bbva.plugin.naturalauthentication.NaturalAuthenticationCommandFactory;
import com.bbva.plugin.naturalauthentication.command.OobRegisterCommand;
import com.bbva.sdkcatalog.openpay.plugin.command.UpdatePaymentLinkCommand;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class l implements CommandProvider {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f94996a;

    public /* synthetic */ l(int i10) {
        this.f94996a = i10;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.bbva.androidtoolkit.plugin.command.factory.CommandProvider
    public final AbstractCommand create() {
        switch (this.f94996a) {
            case 0:
                return new GetLanguageCommand();
            case 1:
                return new GetBrightnessLevelCommand();
            case 2:
                return new HashCommand();
            case 3:
                return new GenerateActivationFormCommand();
            case 4:
                return new CardsPendingVerificationCommand();
            case 5:
                NaturalAuthenticationCommandFactory.Companion companion = NaturalAuthenticationCommandFactory.Companion;
                return new OobRegisterCommand(null, 1, 0 == true ? 1 : 0);
            default:
                return new UpdatePaymentLinkCommand();
        }
    }
}

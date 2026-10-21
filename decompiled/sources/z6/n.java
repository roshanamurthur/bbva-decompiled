package z6;

import com.bbva.androidtoolkit.plugin.command.AbstractCommand;
import com.bbva.androidtoolkit.plugin.command.factory.CommandProvider;
import com.bbva.ethermobilesdk.deviceinfo.plugin.command.GetManufacturerCommand;
import com.bbva.ethermobilesdk.token.plugin.command.CreateClientCommand;
import com.bbva.gp2.android.product.mobilepayment.plugin.MobilePaymentCommandFactory;
import com.bbva.plugin.google.pay.command.GetPushDataCommand;
import com.bbva.plugin.naturalauthentication.NaturalAuthenticationCommandFactory;
import com.bbva.plugin.naturalauthentication.command.GetFacetsUrlCommand;
import com.bbva.sdkcatalog.openpay.plugin.command.CreatePaymentLinkCommand;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class n implements CommandProvider {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f94998a;

    public /* synthetic */ n(int i10) {
        this.f94998a = i10;
    }

    @Override // com.bbva.androidtoolkit.plugin.command.factory.CommandProvider
    public final AbstractCommand create() {
        switch (this.f94998a) {
            case 0:
                return new GetManufacturerCommand();
            case 1:
                return new CreateClientCommand();
            case 2:
                return MobilePaymentCommandFactory._init_$lambda$9();
            case 3:
                return new GetPushDataCommand();
            case 4:
                NaturalAuthenticationCommandFactory.Companion companion = NaturalAuthenticationCommandFactory.Companion;
                return new GetFacetsUrlCommand();
            default:
                return new CreatePaymentLinkCommand();
        }
    }
}

package z6;

import com.bbva.androidtoolkit.plugin.command.AbstractCommand;
import com.bbva.androidtoolkit.plugin.command.factory.CommandProvider;
import com.bbva.ethermobilesdk.deviceinfo.plugin.command.GetPlatformCommand;
import com.bbva.gp2.android.product.mobilepayment.plugin.MobilePaymentCommandFactory;
import com.bbva.plugin.naturalauthentication.NaturalAuthenticationCommandFactory;
import com.bbva.plugin.naturalauthentication.command.SetExternalDeviceIdCommand;
import com.bbva.sdkcatalog.openpay.plugin.command.GetPaymentPlansCommand;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class m implements CommandProvider {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f94997a;

    public /* synthetic */ m(int i10) {
        this.f94997a = i10;
    }

    @Override // com.bbva.androidtoolkit.plugin.command.factory.CommandProvider
    public final AbstractCommand create() {
        switch (this.f94997a) {
            case 0:
                return new GetPlatformCommand();
            case 1:
                return MobilePaymentCommandFactory._init_$lambda$8();
            case 2:
                NaturalAuthenticationCommandFactory.Companion companion = NaturalAuthenticationCommandFactory.Companion;
                return new SetExternalDeviceIdCommand();
            default:
                return new GetPaymentPlansCommand();
        }
    }
}

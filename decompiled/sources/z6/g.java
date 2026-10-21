package z6;

import com.bbva.androidtoolkit.plugin.command.AbstractCommand;
import com.bbva.androidtoolkit.plugin.command.factory.CommandProvider;
import com.bbva.ethermobilesdk.deviceinfo.plugin.command.GetNFCStatusCommand;
import com.bbva.ethermobilesdk.plugin.command.symmetric.SymmetricDecryptCommand;
import com.bbva.ethermobilesdk.tokencompat.plugin.command.GetAppReportCommand;
import com.bbva.gp2.android.product.mobilepayment.plugin.MobilePaymentCommandFactory;
import com.bbva.plugin.appsflyer.command.SetOneLinkCustomDomainCommand;
import com.bbva.plugin.geolocation.command.OpenLocationToCoordinatesCommand;
import com.bbva.plugin.localstorage.command.secure.IsSecureHardwareCommand;
import com.bbva.plugin.permissions.command.RequestPermissionCommand;
import com.bbva.sdkcatalog.openpay.plugin.command.SendVoucherCommand;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class g implements CommandProvider {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f94991a;

    public /* synthetic */ g(int i10) {
        this.f94991a = i10;
    }

    @Override // com.bbva.androidtoolkit.plugin.command.factory.CommandProvider
    public final AbstractCommand create() {
        switch (this.f94991a) {
            case 0:
                return new GetNFCStatusCommand();
            case 1:
                return new SymmetricDecryptCommand();
            case 2:
                return new GetAppReportCommand();
            case 3:
                return MobilePaymentCommandFactory._init_$lambda$10();
            case 4:
                return new SetOneLinkCustomDomainCommand();
            case 5:
                return new OpenLocationToCoordinatesCommand();
            case 6:
                return new IsSecureHardwareCommand();
            case 7:
                return new RequestPermissionCommand();
            default:
                return new SendVoucherCommand();
        }
    }
}

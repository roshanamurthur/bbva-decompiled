package z6;

import com.bbva.androidtoolkit.plugin.command.AbstractCommand;
import com.bbva.androidtoolkit.plugin.command.factory.CommandProvider;
import com.bbva.ethermobilesdk.deviceinfo.plugin.command.IsMicrophonePresentCommand;
import com.bbva.ethermobilesdk.plugin.command.symmetric.SymmetricEncryptCommand;
import com.bbva.gp2.android.product.mobilepayment.plugin.MobilePaymentCommandFactory;
import com.bbva.plugin.appsflyer.command.SetAppInviteOneLinkCommand;
import com.bbva.plugin.geolocation.command.CoordinatesToOpenLocationCommand;
import com.bbva.plugin.localstorage.command.secure.InvalidateSecureKeyCommand;
import com.bbva.plugin.permissions.command.CheckPermissionStateCommand;
import com.bbva.plugin.showinfo.command.NativeListModalCommand;
import com.bbva.sdkcatalog.openpay.plugin.command.PaymentLinkListingCommand;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class f implements CommandProvider {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f94990a;

    public /* synthetic */ f(int i10) {
        this.f94990a = i10;
    }

    @Override // com.bbva.androidtoolkit.plugin.command.factory.CommandProvider
    public final AbstractCommand create() {
        switch (this.f94990a) {
            case 0:
                return new IsMicrophonePresentCommand();
            case 1:
                return new SymmetricEncryptCommand();
            case 2:
                return MobilePaymentCommandFactory._init_$lambda$0();
            case 3:
                return new SetAppInviteOneLinkCommand();
            case 4:
                return new CoordinatesToOpenLocationCommand();
            case 5:
                return new InvalidateSecureKeyCommand();
            case 6:
                return new CheckPermissionStateCommand();
            case 7:
                return new NativeListModalCommand();
            default:
                return new PaymentLinkListingCommand();
        }
    }
}

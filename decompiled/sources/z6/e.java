package z6;

import com.bbva.androidtoolkit.plugin.command.AbstractCommand;
import com.bbva.androidtoolkit.plugin.command.factory.CommandProvider;
import com.bbva.ethermobilesdk.deviceinfo.plugin.command.IsBluetoothEnabledCommand;
import com.bbva.ethermobilesdk.plugin.command.symmetric.SymmetricKeyCommand;
import com.bbva.plugin.appsflyer.command.SetAdditionalDataCommand;
import com.bbva.plugin.geolocation.command.IsLocationServiceEnabledCommand;
import com.bbva.plugin.localstorage.command.secure.SetSecureCommand;
import com.bbva.sdkcatalog.openpay.plugin.command.RefundPaymentLinkCommand;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class e implements CommandProvider {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f94989a;

    public /* synthetic */ e(int i10) {
        this.f94989a = i10;
    }

    @Override // com.bbva.androidtoolkit.plugin.command.factory.CommandProvider
    public final AbstractCommand create() {
        switch (this.f94989a) {
            case 0:
                return new IsBluetoothEnabledCommand();
            case 1:
                return new SymmetricKeyCommand();
            case 2:
                return new SetAdditionalDataCommand();
            case 3:
                return new IsLocationServiceEnabledCommand();
            case 4:
                return new SetSecureCommand();
            default:
                return new RefundPaymentLinkCommand();
        }
    }
}

package z6;

import com.bbva.androidtoolkit.plugin.command.AbstractCommand;
import com.bbva.androidtoolkit.plugin.command.factory.CommandProvider;
import com.bbva.ethermobilesdk.deviceinfo.plugin.command.IsAutoZoneEnabledCommand;
import com.bbva.ethermobilesdk.plugin.command.factory.RSAKeyPairCommand;
import com.bbva.plugin.appsflyer.command.SetCustomerCommand;
import com.bbva.plugin.geolocation.command.WatchLocationCommand;
import com.bbva.plugin.localstorage.command.secure.GetSecureCommand;
import com.bbva.sdkcatalog.openpay.plugin.command.InitSdkCommand;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class d implements CommandProvider {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f94988a;

    public /* synthetic */ d(int i10) {
        this.f94988a = i10;
    }

    @Override // com.bbva.androidtoolkit.plugin.command.factory.CommandProvider
    public final AbstractCommand create() {
        switch (this.f94988a) {
            case 0:
                return new IsAutoZoneEnabledCommand();
            case 1:
                return new RSAKeyPairCommand();
            case 2:
                return new SetCustomerCommand();
            case 3:
                return new WatchLocationCommand();
            case 4:
                return new GetSecureCommand();
            default:
                return new InitSdkCommand();
        }
    }
}

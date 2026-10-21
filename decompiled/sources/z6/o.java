package z6;

import com.bbva.androidtoolkit.plugin.command.AbstractCommand;
import com.bbva.androidtoolkit.plugin.command.factory.CommandProvider;
import com.bbva.ethermobilesdk.deviceinfo.plugin.command.GetCountryCommand;
import com.bbva.ethermobilesdk.deviceinfo.plugin.command.GetNetworkTypeCommand;
import com.bbva.ethermobilesdk.plugin.command.hmac.HmacCommand;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateOtpCommand;
import com.bbva.plugin.decode.PluginCommandFactory;
import com.bbva.plugin.decode.command.DecodeCommand;
import com.bbva.plugin.google.pay.command.SearchCardsCommand;
import com.bbva.plugin.naturalauthentication.NaturalAuthenticationCommandFactory;
import com.bbva.plugin.naturalauthentication.command.DeleteCommand;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class o implements CommandProvider {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f94999a;

    public /* synthetic */ o(int i10) {
        this.f94999a = i10;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.bbva.androidtoolkit.plugin.command.factory.CommandProvider
    public final AbstractCommand create() {
        switch (this.f94999a) {
            case 0:
                return new GetNetworkTypeCommand();
            case 1:
                return new GetCountryCommand();
            case 2:
                return new HmacCommand();
            case 3:
                return new GenerateOtpCommand();
            case 4:
                PluginCommandFactory.Companion companion = PluginCommandFactory.INSTANCE;
                return new DecodeCommand();
            case 5:
                return new SearchCardsCommand();
            default:
                NaturalAuthenticationCommandFactory.Companion companion2 = NaturalAuthenticationCommandFactory.Companion;
                return new DeleteCommand(null, 1, 0 == true ? 1 : 0);
        }
    }
}

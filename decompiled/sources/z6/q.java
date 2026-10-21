package z6;

import com.bbva.androidtoolkit.plugin.command.AbstractCommand;
import com.bbva.androidtoolkit.plugin.command.factory.CommandProvider;
import com.bbva.ethermobilesdk.deviceinfo.plugin.command.GetProviderNameCommand;
import com.bbva.ethermobilesdk.plugin.command.factory.Base64ToHexCommand;
import com.bbva.ethermobilesdk.token.plugin.command.GetActivatedTokensDetailCommand;
import com.bbva.plugin.digipassmanager.commands.GenerateOtpCommand;
import com.bbva.plugin.naturalauthentication.NaturalAuthenticationCommandFactory;
import com.bbva.plugin.naturalauthentication.command.ListAuthenticatorsCommand;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class q implements CommandProvider {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f95001a;

    public /* synthetic */ q(int i10) {
        this.f95001a = i10;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.bbva.androidtoolkit.plugin.command.factory.CommandProvider
    public final AbstractCommand create() {
        switch (this.f95001a) {
            case 0:
                return new GetProviderNameCommand();
            case 1:
                return new Base64ToHexCommand();
            case 2:
                return new GetActivatedTokensDetailCommand();
            case 3:
                return new GenerateOtpCommand();
            default:
                NaturalAuthenticationCommandFactory.Companion companion = NaturalAuthenticationCommandFactory.Companion;
                return new ListAuthenticatorsCommand(null, 1, 0 == true ? 1 : 0);
        }
    }
}

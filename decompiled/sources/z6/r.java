package z6;

import com.bbva.androidtoolkit.plugin.command.AbstractCommand;
import com.bbva.androidtoolkit.plugin.command.factory.CommandProvider;
import com.bbva.ethermobilesdk.deviceinfo.plugin.command.GetRamUsageCommand;
import com.bbva.ethermobilesdk.plugin.command.factory.HexToBase64Command;
import com.bbva.ethermobilesdk.token.plugin.command.RemoveTokenCommand;
import com.bbva.plugin.digipassmanager.commands.RemainingTimeCommand;
import com.bbva.plugin.naturalauthentication.NaturalAuthenticationCommandFactory;
import com.bbva.plugin.naturalauthentication.command.AuthenticateCommand;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class r implements CommandProvider {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f95002a;

    public /* synthetic */ r(int i10) {
        this.f95002a = i10;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.bbva.androidtoolkit.plugin.command.factory.CommandProvider
    public final AbstractCommand create() {
        switch (this.f95002a) {
            case 0:
                return new GetRamUsageCommand();
            case 1:
                return new HexToBase64Command();
            case 2:
                return new RemoveTokenCommand();
            case 3:
                return new RemainingTimeCommand();
            default:
                NaturalAuthenticationCommandFactory.Companion companion = NaturalAuthenticationCommandFactory.Companion;
                return new AuthenticateCommand(null, 1, 0 == true ? 1 : 0);
        }
    }
}

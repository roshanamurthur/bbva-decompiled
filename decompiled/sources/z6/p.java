package z6;

import com.bbva.androidtoolkit.plugin.command.AbstractCommand;
import com.bbva.androidtoolkit.plugin.command.factory.CommandProvider;
import com.bbva.ethermobilesdk.deviceinfo.plugin.command.GetCurrentDateCommand;
import com.bbva.ethermobilesdk.deviceinfo.plugin.command.GetScreenOrientationCommand;
import com.bbva.ethermobilesdk.plugin.command.factory.SaltCommand;
import com.bbva.ethermobilesdk.token.plugin.command.GetTokenIdsCommand;
import com.bbva.plugin.google.pay.command.GetCardStatusCommand;
import com.bbva.plugin.naturalauthentication.NaturalAuthenticationCommandFactory;
import com.bbva.plugin.naturalauthentication.command.SignTransactionCommand;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class p implements CommandProvider {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f95000a;

    public /* synthetic */ p(int i10) {
        this.f95000a = i10;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.bbva.androidtoolkit.plugin.command.factory.CommandProvider
    public final AbstractCommand create() {
        switch (this.f95000a) {
            case 0:
                return new GetScreenOrientationCommand();
            case 1:
                return new GetCurrentDateCommand();
            case 2:
                return new SaltCommand();
            case 3:
                return new GetTokenIdsCommand();
            case 4:
                return new GetCardStatusCommand();
            default:
                NaturalAuthenticationCommandFactory.Companion companion = NaturalAuthenticationCommandFactory.Companion;
                return new SignTransactionCommand(null, 1, 0 == true ? 1 : 0);
        }
    }
}

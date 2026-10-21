package z6;

import com.bbva.androidtoolkit.plugin.command.AbstractCommand;
import com.bbva.androidtoolkit.plugin.command.factory.CommandProvider;
import com.bbva.ethermobilesdk.deviceinfo.plugin.command.GetRegionCommand;
import com.bbva.ethermobilesdk.plugin.command.jwe.JweRSAKeyPairCommand;
import com.bbva.ethermobilesdk.token.plugin.command.SetDefaultOcraSuiteCommand;
import com.bbva.ocrcardplugin.command.impl.CanScanCommand;
import com.bbva.plugin.digipassmanager.commands.DeleteTokenCommand;
import com.bbva.plugin.naturalauthentication.NaturalAuthenticationCommandFactory;
import com.bbva.plugin.naturalauthentication.command.OobAuthenticateCommand;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class s implements CommandProvider {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f95003a;

    public /* synthetic */ s(int i10) {
        this.f95003a = i10;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.bbva.androidtoolkit.plugin.command.factory.CommandProvider
    public final AbstractCommand create() {
        switch (this.f95003a) {
            case 0:
                return new GetRegionCommand();
            case 1:
                return new JweRSAKeyPairCommand();
            case 2:
                return new SetDefaultOcraSuiteCommand();
            case 3:
                return new CanScanCommand();
            case 4:
                return new DeleteTokenCommand();
            default:
                NaturalAuthenticationCommandFactory.Companion companion = NaturalAuthenticationCommandFactory.Companion;
                return new OobAuthenticateCommand(null, 1, 0 == true ? 1 : 0);
        }
    }
}

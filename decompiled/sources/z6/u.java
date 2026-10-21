package z6;

import com.bbva.androidtoolkit.plugin.command.AbstractCommand;
import com.bbva.androidtoolkit.plugin.command.factory.CommandProvider;
import com.bbva.ethermobilesdk.deviceinfo.plugin.command.GetCurrentTimeCommand;
import com.bbva.ethermobilesdk.plugin.command.jwe.JweEncryptCommand;
import com.bbva.glomohybrid.documents.plugin.commands.OpenTermsCommand;
import com.bbva.plugin.analyticsdata.command.GetMarketingCloudIdCommand;
import com.bbva.plugin.naturalauthentication.NaturalAuthenticationCommandFactory;
import com.bbva.plugin.naturalauthentication.command.CreateAuthMessageCommand;
import com.bbva.qrplugin.command.ScanCommand;
import com.bbva.speech.plugin.command.RecognizeCommand;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class u implements CommandProvider {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f95005a;

    public /* synthetic */ u(int i10) {
        this.f95005a = i10;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.bbva.androidtoolkit.plugin.command.factory.CommandProvider
    public final AbstractCommand create() {
        switch (this.f95005a) {
            case 0:
                return new GetCurrentTimeCommand();
            case 1:
                return new JweEncryptCommand();
            case 2:
                return new OpenTermsCommand();
            case 3:
                return new GetMarketingCloudIdCommand();
            case 4:
                NaturalAuthenticationCommandFactory.Companion companion = NaturalAuthenticationCommandFactory.Companion;
                return new CreateAuthMessageCommand(null, 1, 0 == true ? 1 : 0);
            case 5:
                return new ScanCommand();
            default:
                return new RecognizeCommand();
        }
    }
}

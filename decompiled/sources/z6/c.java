package z6;

import com.bbva.androidtoolkit.plugin.command.AbstractCommand;
import com.bbva.androidtoolkit.plugin.command.factory.CommandProvider;
import com.bbva.ethermobilesdk.deviceinfo.plugin.command.IsAutoDateAndTimeEnabledCommand;
import com.bbva.ethermobilesdk.plugin.command.rsa.RsaDecryptCommand;
import com.bbva.plugin.appsflyer.command.StartTrackingCommand;
import com.bbva.plugin.geolocation.command.PromptForLocationServiceCommand;
import com.bbva.plugin.localstorage.command.ClearCommand;
import com.bbva.speech.plugin.command.StopSpeakCommand;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class c implements CommandProvider {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f94987a;

    public /* synthetic */ c(int i10) {
        this.f94987a = i10;
    }

    @Override // com.bbva.androidtoolkit.plugin.command.factory.CommandProvider
    public final AbstractCommand create() {
        switch (this.f94987a) {
            case 0:
                return new IsAutoDateAndTimeEnabledCommand();
            case 1:
                return new RsaDecryptCommand();
            case 2:
                return new StartTrackingCommand();
            case 3:
                return new PromptForLocationServiceCommand();
            case 4:
                return new ClearCommand();
            default:
                return new StopSpeakCommand();
        }
    }
}

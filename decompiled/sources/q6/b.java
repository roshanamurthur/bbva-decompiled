package q6;

import com.bbva.androidtoolkit.plugin.command.AbstractCommand;
import com.bbva.androidtoolkit.plugin.command.factory.CommandProvider;
import com.bbva.document.scanner.plugin.command.PreviewDocumentCommand;
import com.bbva.ethermobilesdk.deviceinfo.plugin.command.IsScreenLockedCommand;
import com.bbva.ethermobilesdk.plugin.command.rsa.RsaEncryptCommand;
import com.bbva.ethermobilesdk.tokencompat.plugin.command.SetTokenOathCommand;
import com.bbva.glomohybrid.documents.plugin.commands.OpenPathCommand;
import com.bbva.plugin.appsflyer.command.TrackEventCommand;
import com.bbva.plugin.geolocation.command.GetLocationFromAddressCommand;
import com.bbva.plugin.localstorage.command.RemoveCommand;
import com.bbva.speech.plugin.command.StopRecognitionCommand;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class b implements CommandProvider {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f92767a;

    @Override // com.bbva.androidtoolkit.plugin.command.factory.CommandProvider
    public final AbstractCommand create() {
        switch (this.f92767a) {
            case 0:
                return new PreviewDocumentCommand();
            case 1:
                return new IsScreenLockedCommand();
            case 2:
                return new RsaEncryptCommand();
            case 3:
                return new SetTokenOathCommand();
            case 4:
                return new OpenPathCommand();
            case 5:
                return new TrackEventCommand();
            case 6:
                return new GetLocationFromAddressCommand();
            case 7:
                return new RemoveCommand();
            default:
                return new StopRecognitionCommand();
        }
    }
}

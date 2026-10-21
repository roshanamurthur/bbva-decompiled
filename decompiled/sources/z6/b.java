package z6;

import com.bbva.androidtoolkit.plugin.command.AbstractCommand;
import com.bbva.androidtoolkit.plugin.command.factory.CommandProvider;
import com.bbva.ethermobilesdk.deviceinfo.plugin.command.GetScreenDimensionsCommand;
import com.bbva.ethermobilesdk.plugin.command.pincipher.PinCipherEncryptCommand;
import com.bbva.glomohybrid.documents.plugin.commands.OpenDocumentUrlCommand;
import com.bbva.plugin.analyticsdata.command.SetPrivacyStatusCommand;
import com.bbva.plugin.geolocation.command.GetAddressFromLocationCommand;
import com.bbva.plugin.localstorage.command.GetCommand;
import com.bbva.speech.plugin.command.PauseSpeakCommand;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class b implements CommandProvider {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f94986a;

    @Override // com.bbva.androidtoolkit.plugin.command.factory.CommandProvider
    public final AbstractCommand create() {
        switch (this.f94986a) {
            case 0:
                return new GetScreenDimensionsCommand();
            case 1:
                return new PinCipherEncryptCommand();
            case 2:
                return new OpenDocumentUrlCommand();
            case 3:
                return new SetPrivacyStatusCommand();
            case 4:
                return new GetAddressFromLocationCommand();
            case 5:
                return new GetCommand();
            default:
                return new PauseSpeakCommand();
        }
    }
}

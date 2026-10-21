package q6;

import com.bbva.androidtoolkit.plugin.command.AbstractCommand;
import com.bbva.androidtoolkit.plugin.command.factory.CommandProvider;
import com.bbva.document.scanner.plugin.command.ScanDocumentCommand;
import com.bbva.ethermobilesdk.deviceinfo.plugin.command.GetWebViewVersionCommand;
import com.bbva.ethermobilesdk.plugin.command.pincipher.PinCipherDecryptCommand;
import com.bbva.glomohybrid.documents.plugin.commands.OpenBase64Command;
import com.bbva.plugin.geolocation.command.GetCurrentPositionCommand;
import com.bbva.plugin.localstorage.command.SetCommand;
import com.bbva.speech.plugin.command.ResumeSpeakCommand;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class a implements CommandProvider {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f92766a;

    @Override // com.bbva.androidtoolkit.plugin.command.factory.CommandProvider
    public final AbstractCommand create() {
        switch (this.f92766a) {
            case 0:
                return new ScanDocumentCommand();
            case 1:
                return new GetWebViewVersionCommand();
            case 2:
                return new PinCipherDecryptCommand();
            case 3:
                return new OpenBase64Command();
            case 4:
                return new GetCurrentPositionCommand();
            case 5:
                return new SetCommand();
            default:
                return new ResumeSpeakCommand();
        }
    }
}

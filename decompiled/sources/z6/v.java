package z6;

import com.bbva.androidtoolkit.plugin.command.AbstractCommand;
import com.bbva.androidtoolkit.plugin.command.factory.CommandProvider;
import com.bbva.ethermobilesdk.deviceinfo.plugin.command.GetCurrentTimeZoneCommand;
import com.bbva.ethermobilesdk.plugin.command.pincipher.PinCipherEncryptFromConfigCommand;
import com.bbva.ethermobilesdk.tokencompat.plugin.command.ChangePasswordCommand;
import com.bbva.glomohybrid.documents.plugin.commands.OpenDocumentCommand;
import com.bbva.plugin.analyticsdata.command.GetPrivacyStatusCommand;
import com.bbva.plugin.geolocation.command.ClearWatchLocationCommand;
import com.bbva.plugin.rateapp.command.InAppReviewCommand;
import com.bbva.qrplugin.command.DecodeCommand;
import com.bbva.speech.plugin.command.SupportedLanguagesCommand;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class v implements CommandProvider {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f95006a;

    public /* synthetic */ v(int i10) {
        this.f95006a = i10;
    }

    @Override // com.bbva.androidtoolkit.plugin.command.factory.CommandProvider
    public final AbstractCommand create() {
        switch (this.f95006a) {
            case 0:
                return new GetCurrentTimeZoneCommand();
            case 1:
                return new PinCipherEncryptFromConfigCommand();
            case 2:
                return new ChangePasswordCommand();
            case 3:
                return new OpenDocumentCommand();
            case 4:
                return new GetPrivacyStatusCommand();
            case 5:
                return new ClearWatchLocationCommand();
            case 6:
                return new InAppReviewCommand();
            case 7:
                return new DecodeCommand();
            default:
                return new SupportedLanguagesCommand();
        }
    }
}

package z6;

import com.bbva.androidtoolkit.plugin.command.AbstractCommand;
import com.bbva.androidtoolkit.plugin.command.factory.CommandProvider;
import com.bbva.ethermobilesdk.deviceinfo.plugin.command.IsWifiSecureCommand;
import com.bbva.gp2.android.product.mobilepayment.plugin.MobilePaymentCommandFactory;
import com.bbva.plugin.naturalauthentication.NaturalAuthenticationCommandFactory;
import com.bbva.plugin.naturalauthentication.command.SetQuickAuthCommand;
import com.bbva.sdkcatalog.openpay.plugin.command.ApplyTransactionRefundCommand;
import com.bbva.selfiecapture.plugin.SelfieCaptureCommandFactory;
import com.bbva.selfiecapture.plugin.command.GetNextChallengeCommand;
import com.bbva.videocapture.VideoCaptureCommandFactory;
import com.bbva.videocapture.command.GetConfigurationKeysCommand;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class j implements CommandProvider {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f94994a;

    public /* synthetic */ j(int i10) {
        this.f94994a = i10;
    }

    @Override // com.bbva.androidtoolkit.plugin.command.factory.CommandProvider
    public final AbstractCommand create() {
        switch (this.f94994a) {
            case 0:
                return new IsWifiSecureCommand();
            case 1:
                return MobilePaymentCommandFactory._init_$lambda$6();
            case 2:
                NaturalAuthenticationCommandFactory.Companion companion = NaturalAuthenticationCommandFactory.INSTANCE;
                return new SetQuickAuthCommand();
            case 3:
                return new ApplyTransactionRefundCommand();
            case 4:
                SelfieCaptureCommandFactory.Companion companion2 = SelfieCaptureCommandFactory.INSTANCE;
                return new GetNextChallengeCommand();
            default:
                VideoCaptureCommandFactory.Companion companion3 = VideoCaptureCommandFactory.INSTANCE;
                return new GetConfigurationKeysCommand();
        }
    }
}

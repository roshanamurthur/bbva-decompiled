package na;

import com.bbva.androidtoolkit.plugin.command.callback.CommandCallback;
import com.bbva.gp2.android.product.mobilepayment.library.MobilePaymentLib;
import com.bbva.sdkcatalog.openpay.plugin.command.ExecuteTapOnPhoneChargeCommand;
import com.bbva.tohu.android.product.valkyria.sdk.export.callbacks.TohuCallback;
import kotlin.jvm.functions.Function1;
import mx.openpay.library.core.model.OpenPayChargeState;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class m implements Function1 {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ int f84482p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ Object f84483q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final /* synthetic */ Object f84484r0;

    public /* synthetic */ m(Object obj, Object obj2, int i10) {
        this.f84482p0 = i10;
        this.f84483q0 = obj;
        this.f84484r0 = obj2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i10 = this.f84482p0;
        Object obj2 = this.f84484r0;
        Object obj3 = this.f84483q0;
        switch (i10) {
            case 0:
                return MobilePaymentLib.getTransactionHistory$lambda$10((String) obj3, (String) obj2, (TohuCallback) obj);
            default:
                return ExecuteTapOnPhoneChargeCommand.startCollector$lambda$4((CommandCallback) obj3, (ExecuteTapOnPhoneChargeCommand) obj2, (OpenPayChargeState) obj);
        }
    }
}

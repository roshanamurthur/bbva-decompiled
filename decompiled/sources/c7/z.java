package c7;

import com.bbva.ethermobilesdk.devicemanager.data.deviceinfo.repository.DeviceInfoRepositoryImpl;
import com.bbva.ethermobilesdk.devicemanager.extension.NfcStatusKt;
import com.bbva.gp2.android.product.mobilepayment.library.MobilePaymentLib;
import kotlin.jvm.functions.Function0;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class z implements Function0 {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ int f25418p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ Object f25419q0;

    public /* synthetic */ z(Object obj, int i10) {
        this.f25418p0 = i10;
        this.f25419q0 = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i10 = this.f25418p0;
        Object obj = this.f25419q0;
        switch (i10) {
            case 0:
                return NfcStatusKt.toDeviceManagerResponse(((DeviceInfoRepositoryImpl) obj).f29641a.getHardware().getNfcStatus());
            default:
                return MobilePaymentLib.getCardStatus$lambda$9((String) obj);
        }
    }
}

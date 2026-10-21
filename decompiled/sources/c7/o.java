package c7;

import com.bbva.ethermobilesdk.devicemanager.data.deviceinfo.repository.DeviceInfoRepositoryImpl;
import com.bbva.ethermobilesdk.devicemanager.model.output.error.DeviceManagerError;
import com.bbva.gp2.android.product.mobilepayment.library.MobilePaymentLib;
import kotlin.jvm.functions.Function0;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class o implements Function0 {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ int f25401p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ Object f25402q0;

    public /* synthetic */ o(Object obj, int i10) {
        this.f25401p0 = i10;
        this.f25402q0 = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() throws DeviceManagerError.DeviceInfoError.DeviceInfoInvalid {
        int i10 = this.f25401p0;
        Object obj = this.f25402q0;
        switch (i10) {
            case 0:
                String ipAddressV6 = ((DeviceInfoRepositoryImpl) obj).f29641a.getCom.bbva.appsflyer.DeepLinkListenerAdapter.Constants.ERROR_NETWORK java.lang.String().networkType().getIpAddressV6();
                if (ipAddressV6.length() <= 0) {
                    ipAddressV6 = null;
                }
                if (ipAddressV6 != null) {
                    return ipAddressV6;
                }
                throw new DeviceManagerError.DeviceInfoError.DeviceInfoInvalid(null, null, 3, null);
            default:
                return MobilePaymentLib.setFavouriteCard$lambda$5((String) obj);
        }
    }
}

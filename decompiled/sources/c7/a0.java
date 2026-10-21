package c7;

import com.bbva.ethermobilesdk.deviceinfo.data.Ram;
import com.bbva.ethermobilesdk.devicemanager.data.deviceinfo.repository.DeviceInfoRepositoryImpl;
import com.bbva.ethermobilesdk.devicemanager.model.output.error.DeviceManagerError;
import com.bbva.gp2.android.product.mobilepayment.library.MobilePaymentLib;
import kotlin.jvm.functions.Function0;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class a0 implements Function0 {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ int f25377p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ Object f25378q0;

    public /* synthetic */ a0(Object obj, int i10) {
        this.f25377p0 = i10;
        this.f25378q0 = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() throws DeviceManagerError.DeviceInfoError.DeviceInfoInvalid {
        int i10 = this.f25377p0;
        Object obj = this.f25378q0;
        switch (i10) {
            case 0:
                String runtimeVersion = ((DeviceInfoRepositoryImpl) obj).f29641a.getSystem().getProperties().getRuntimeVersion();
                if (runtimeVersion != null) {
                    return runtimeVersion;
                }
                throw new DeviceManagerError.DeviceInfoError.DeviceInfoInvalid(null, null, 3, null);
            case 1:
                Ram ramUsage = ((DeviceInfoRepositoryImpl) obj).f29641a.getHardware().getRamUsage();
                if (ramUsage != null) {
                    return Long.valueOf(ramUsage.getTotal());
                }
                throw new DeviceManagerError.DeviceInfoError.DeviceInfoInvalid(null, null, 3, null);
            default:
                return MobilePaymentLib.executeAndReturnOK$lambda$17((Function0) obj);
        }
    }
}

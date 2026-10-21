package c7;

import com.bbva.ethermobilesdk.deviceinfo.data.Ram;
import com.bbva.ethermobilesdk.devicemanager.data.deviceinfo.repository.DeviceInfoRepositoryImpl;
import com.bbva.ethermobilesdk.devicemanager.model.output.error.DeviceManagerError;
import kotlin.jvm.functions.Function0;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class l implements Function0 {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ int f25397p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ DeviceInfoRepositoryImpl f25398q0;

    public /* synthetic */ l(DeviceInfoRepositoryImpl deviceInfoRepositoryImpl, int i10) {
        this.f25397p0 = i10;
        this.f25398q0 = deviceInfoRepositoryImpl;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() throws DeviceManagerError.DeviceInfoError.DeviceInfoInvalid {
        int i10 = this.f25397p0;
        DeviceInfoRepositoryImpl deviceInfoRepositoryImpl = this.f25398q0;
        switch (i10) {
            case 0:
                Ram ramUsage = deviceInfoRepositoryImpl.f29641a.getHardware().getRamUsage();
                if (ramUsage != null) {
                    return Long.valueOf(ramUsage.getAvailable());
                }
                throw new DeviceManagerError.DeviceInfoError.DeviceInfoInvalid(null, null, 3, null);
            default:
                return Boolean.valueOf(deviceInfoRepositoryImpl.f29641a.getScreen().isLocked());
        }
    }
}

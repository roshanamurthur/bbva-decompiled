package c7;

import com.bbva.ethermobile.help.kit.result.ResultKt;
import com.bbva.ethermobilesdk.devicemanager.data.deviceinfo.repository.DeviceInfoRepositoryImpl;
import com.bbva.ethermobilesdk.devicemanager.model.output.error.DeviceManagerError;
import kotlin.jvm.functions.Function0;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class d implements Function0 {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ int f25387p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ DeviceInfoRepositoryImpl f25388q0;

    public /* synthetic */ d(DeviceInfoRepositoryImpl deviceInfoRepositoryImpl, int i10) {
        this.f25387p0 = i10;
        this.f25388q0 = deviceInfoRepositoryImpl;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() throws DeviceManagerError.DeviceInfoError.DeviceInfoInvalid {
        int i10 = this.f25387p0;
        DeviceInfoRepositoryImpl deviceInfoRepositoryImpl = this.f25388q0;
        switch (i10) {
            case 0:
                Boolean boolIsWifiSecure = deviceInfoRepositoryImpl.f29641a.getCom.bbva.appsflyer.DeepLinkListenerAdapter.Constants.ERROR_NETWORK java.lang.String().isWifiSecure();
                return Boolean.valueOf(boolIsWifiSecure != null ? boolIsWifiSecure.booleanValue() : false);
            default:
                Long l6 = (Long) ResultKt.getOrNull(deviceInfoRepositoryImpl.ramUsed());
                if (l6 == null) {
                    throw new DeviceManagerError.DeviceInfoError.DeviceInfoInvalid(null, null, 3, null);
                }
                long jLongValue = l6.longValue();
                Long l7 = (Long) ResultKt.getOrNull(deviceInfoRepositoryImpl.ramTotal());
                if (l7 != null) {
                    return Integer.valueOf((int) ((jLongValue * ((long) 100)) / l7.longValue()));
                }
                throw new DeviceManagerError.DeviceInfoError.DeviceInfoInvalid(null, null, 3, null);
        }
    }
}

package c7;

import com.bbva.ethermobilesdk.devicemanager.data.deviceinfo.repository.DeviceInfoRepositoryImpl;
import com.bbva.ethermobilesdk.devicemanager.model.output.error.DeviceManagerError;
import kotlin.jvm.functions.Function0;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class c0 implements Function0 {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ int f25385p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ DeviceInfoRepositoryImpl f25386q0;

    public /* synthetic */ c0(DeviceInfoRepositoryImpl deviceInfoRepositoryImpl, int i10) {
        this.f25385p0 = i10;
        this.f25386q0 = deviceInfoRepositoryImpl;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() throws DeviceManagerError.DeviceInfoError.DeviceInfoInvalid {
        int i10 = this.f25385p0;
        DeviceInfoRepositoryImpl deviceInfoRepositoryImpl = this.f25386q0;
        switch (i10) {
            case 0:
                String runtimeName = deviceInfoRepositoryImpl.f29641a.getSystem().getProperties().getRuntimeName();
                if (runtimeName != null) {
                    return runtimeName;
                }
                throw new DeviceManagerError.DeviceInfoError.DeviceInfoInvalid(null, null, 3, null);
            default:
                return Boolean.valueOf(deviceInfoRepositoryImpl.f29641a.getCom.bbva.appsflyer.DeepLinkListenerAdapter.Constants.ERROR_NETWORK java.lang.String().networkType().getNetworkConnection().getProxy() != null);
        }
    }
}

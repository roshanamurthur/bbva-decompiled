package c7;

import com.bbva.ethermobilesdk.devicemanager.data.deviceinfo.repository.DeviceInfoRepositoryImpl;
import com.bbva.ethermobilesdk.devicemanager.model.output.error.DeviceManagerError;
import com.bbva.sdkcatalog.openpay.plugin.permissions.PermissionExtensionsKt;
import kotlin.jvm.functions.Function0;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class w implements Function0 {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ int f25412p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ Object f25413q0;

    public /* synthetic */ w(Object obj, int i10) {
        this.f25412p0 = i10;
        this.f25413q0 = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() throws DeviceManagerError.DeviceInfoError.DeviceInfoInvalid {
        int i10 = this.f25412p0;
        Object obj = this.f25413q0;
        switch (i10) {
            case 0:
                String ipAddressV4 = ((DeviceInfoRepositoryImpl) obj).f29641a.getCom.bbva.appsflyer.DeepLinkListenerAdapter.Constants.ERROR_NETWORK java.lang.String().networkType().getIpAddressV4();
                if (ipAddressV4.length() <= 0) {
                    ipAddressV4 = null;
                }
                if (ipAddressV4 != null) {
                    return ipAddressV4;
                }
                throw new DeviceManagerError.DeviceInfoError.DeviceInfoInvalid(null, null, 3, null);
            case 1:
                return ((DeviceInfoRepositoryImpl) obj).f29641a.getSystem().getPlatform().getPlatformVersionName();
            default:
                return PermissionExtensionsKt.launchLocationPermissions$lambda$5((Function0) obj);
        }
    }
}

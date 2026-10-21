package c7;

import com.bbva.ethermobilesdk.deviceinfo.data.ApplicationVersion;
import com.bbva.ethermobilesdk.devicemanager.data.deviceinfo.repository.DeviceInfoRepositoryImpl;
import com.bbva.ethermobilesdk.devicemanager.model.output.error.DeviceManagerError;
import com.bbva.sdkcatalog.openpay.plugin.permissions.PermissionExtensionsKt;
import kotlin.jvm.functions.Function0;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class y implements Function0 {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ int f25416p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ Object f25417q0;

    public /* synthetic */ y(Object obj, int i10) {
        this.f25416p0 = i10;
        this.f25417q0 = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() throws DeviceManagerError.DeviceInfoError.DeviceInfoInvalid {
        String versionName;
        int i10 = this.f25416p0;
        Object obj = this.f25417q0;
        switch (i10) {
            case 0:
                ApplicationVersion appVersion = ((DeviceInfoRepositoryImpl) obj).f29641a.getCom.bbva.nativesettings.common.Constants.APPLICATION java.lang.String().getAppVersion();
                if (appVersion == null || (versionName = appVersion.getVersionName()) == null) {
                    throw new DeviceManagerError.DeviceInfoError.DeviceInfoInvalid(null, null, 3, null);
                }
                return versionName;
            case 1:
                Integer networkSignalStrength = ((DeviceInfoRepositoryImpl) obj).f29641a.getCom.bbva.appsflyer.DeepLinkListenerAdapter.Constants.ERROR_NETWORK java.lang.String().networkType().getNetworkConnection().getNetworkSignalStrength();
                if (networkSignalStrength != null) {
                    return Integer.valueOf(networkSignalStrength.intValue());
                }
                throw new DeviceManagerError.DeviceInfoError.DeviceInfoInvalid(null, null, 3, null);
            default:
                return PermissionExtensionsKt.launchBluetoothPermissions$lambda$4$lambda$3$lambda$2((Function0) obj);
        }
    }
}

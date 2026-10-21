package c7;

import com.bbva.ethermobilesdk.deviceinfo.data.Ram;
import com.bbva.ethermobilesdk.devicemanager.data.deviceinfo.repository.DeviceInfoRepositoryImpl;
import com.bbva.ethermobilesdk.devicemanager.model.output.error.DeviceManagerError;
import com.bbva.sdkcatalog.openpay.plugin.permissions.PermissionExtensionsKt;
import kotlin.jvm.functions.Function0;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class s implements Function0 {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ int f25407p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ Object f25408q0;

    public /* synthetic */ s(Object obj, int i10) {
        this.f25407p0 = i10;
        this.f25408q0 = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() throws DeviceManagerError.DeviceInfoError.DeviceInfoInvalid {
        int i10 = this.f25407p0;
        Object obj = this.f25408q0;
        switch (i10) {
            case 0:
                Ram ramUsage = ((DeviceInfoRepositoryImpl) obj).f29641a.getHardware().getRamUsage();
                if (ramUsage != null) {
                    return Long.valueOf(ramUsage.getUsed());
                }
                throw new DeviceManagerError.DeviceInfoError.DeviceInfoInvalid(null, null, 3, null);
            default:
                return PermissionExtensionsKt.launchStoragePermissions$lambda$7((Function0) obj);
        }
    }
}

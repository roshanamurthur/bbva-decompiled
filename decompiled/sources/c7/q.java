package c7;

import com.bbva.ethermobilesdk.devicemanager.data.deviceinfo.repository.DeviceInfoRepositoryImpl;
import com.bbva.sdkcatalog.openpay.plugin.permissions.PermissionExtensionsKt;
import kotlin.jvm.functions.Function0;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class q implements Function0 {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ int f25404p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ Object f25405q0;

    public /* synthetic */ q(Object obj, int i10) {
        this.f25404p0 = i10;
        this.f25405q0 = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i10 = this.f25404p0;
        Object obj = this.f25405q0;
        switch (i10) {
            case 0:
                return ((DeviceInfoRepositoryImpl) obj).f29641a.getLocale().getLanguage().getLanguageName();
            default:
                return PermissionExtensionsKt.launchBluetoothPermissions$lambda$4$lambda$0((Function0) obj);
        }
    }
}

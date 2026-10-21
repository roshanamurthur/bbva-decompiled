package c7;

import com.bbva.ethermobilesdk.devicemanager.data.deviceinfo.repository.DeviceInfoRepositoryImpl;
import com.bbva.ethermobilesdk.devicemanager.extension.SystemThemeKt;
import kotlin.jvm.functions.Function0;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class e implements Function0 {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ int f25390p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ DeviceInfoRepositoryImpl f25391q0;

    public /* synthetic */ e(DeviceInfoRepositoryImpl deviceInfoRepositoryImpl, int i10) {
        this.f25390p0 = i10;
        this.f25391q0 = deviceInfoRepositoryImpl;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i10 = this.f25390p0;
        DeviceInfoRepositoryImpl deviceInfoRepositoryImpl = this.f25391q0;
        switch (i10) {
            case 0:
                return SystemThemeKt.toDeviceManagerResponse(deviceInfoRepositoryImpl.f29641a.getSystem().getCurrentTheme());
            default:
                return Boolean.valueOf(deviceInfoRepositoryImpl.f29641a.getCom.bbva.appsflyer.DeepLinkListenerAdapter.Constants.ERROR_NETWORK java.lang.String().networkType().isCaptivePortal());
        }
    }
}

package c7;

import android.location.LocationManager;
import com.bbva.ethermobilesdk.devicemanager.data.deviceinfo.repository.DeviceInfoRepositoryImpl;
import com.bbva.ethermobilesdk.geolocation.location.provider.LocationManagerProvider;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class c implements Function0 {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ int f25383p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ Object f25384q0;

    public /* synthetic */ c(Object obj, int i10) {
        this.f25383p0 = i10;
        this.f25384q0 = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i10 = this.f25383p0;
        Object obj = this.f25384q0;
        switch (i10) {
            case 0:
                return Integer.valueOf(((DeviceInfoRepositoryImpl) obj).f29641a.getScreen().getBrightnessLevel());
            case 1:
                return ((DeviceInfoRepositoryImpl) obj).f29641a.getCom.bbva.nativesettings.common.Constants.APPLICATION java.lang.String().getAndroidId();
            default:
                LocationManagerProvider locationManagerProvider = (LocationManagerProvider) obj;
                LocationManager locationManager = locationManagerProvider.f29859r0;
                if (locationManager != null) {
                    locationManager.removeUpdates(locationManagerProvider);
                }
                locationManagerProvider.f29860s0.removeLocationUpdates(locationManagerProvider.f29861t0);
                return Unit.INSTANCE;
        }
    }
}

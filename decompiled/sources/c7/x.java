package c7;

import com.bbva.ethermobilesdk.devicemanager.data.deviceinfo.repository.DeviceInfoRepositoryImpl;
import kotlin.jvm.functions.Function0;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class x implements Function0 {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ int f25414p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ DeviceInfoRepositoryImpl f25415q0;

    public /* synthetic */ x(DeviceInfoRepositoryImpl deviceInfoRepositoryImpl, int i10) {
        this.f25414p0 = i10;
        this.f25415q0 = deviceInfoRepositoryImpl;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i10 = this.f25414p0;
        DeviceInfoRepositoryImpl deviceInfoRepositoryImpl = this.f25415q0;
        switch (i10) {
            case 0:
                return Boolean.valueOf(deviceInfoRepositoryImpl.f29641a.getTime().isAutomaticZone());
            default:
                return deviceInfoRepositoryImpl.f29641a.getTime().getCurrentTimeZone();
        }
    }
}

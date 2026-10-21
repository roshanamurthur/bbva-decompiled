package c7;

import com.bbva.ethermobilesdk.devicemanager.data.deviceinfo.repository.DeviceInfoRepositoryImpl;
import kotlin.jvm.functions.Function0;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class b implements Function0 {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ int f25379p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ DeviceInfoRepositoryImpl f25380q0;

    public /* synthetic */ b(DeviceInfoRepositoryImpl deviceInfoRepositoryImpl, int i10) {
        this.f25379p0 = i10;
        this.f25380q0 = deviceInfoRepositoryImpl;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i10 = this.f25379p0;
        DeviceInfoRepositoryImpl deviceInfoRepositoryImpl = this.f25380q0;
        switch (i10) {
            case 0:
                return deviceInfoRepositoryImpl.f29641a.getHardware().getModel();
            default:
                return String.valueOf((int) deviceInfoRepositoryImpl.f29641a.getScreen().getDimensions().getHeight());
        }
    }
}

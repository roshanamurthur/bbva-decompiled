package androidx.activity;

import com.bbva.ethermobilesdk.devicemanager.data.devicechecker.common.repository.DeviceCheckerRepositoryImpl;
import com.bbva.ethermobilesdk.devicemanager.data.deviceinfo.repository.DeviceInfoRepositoryImpl;
import kotlin.jvm.functions.Function0;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class c implements Function0 {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ int f380p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ Object f381q0;

    public /* synthetic */ c(Object obj, int i10) {
        this.f380p0 = i10;
        this.f381q0 = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i10 = this.f380p0;
        Object obj = this.f381q0;
        switch (i10) {
            case 0:
                return ((ComponentActivity) obj).lambda$new$0();
            case 1:
                return Boolean.valueOf(((DeviceCheckerRepositoryImpl) obj).f29636a.getDeveloper().isDeveloperModeEnabled());
            default:
                return String.valueOf((int) ((DeviceInfoRepositoryImpl) obj).f29641a.getScreen().getDimensions().getWidth());
        }
    }
}

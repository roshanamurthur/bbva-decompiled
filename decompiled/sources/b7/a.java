package b7;

import com.bbva.ethermobilesdk.devicemanager.data.devicechecker.common.repository.DeviceCheckerRepositoryImpl;
import com.bbva.ethermobilesdk.devicemanager.data.deviceinfo.repository.DeviceInfoRepositoryImpl;
import kotlin.jvm.functions.Function0;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class a implements Function0 {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ int f24883p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ Object f24884q0;

    public /* synthetic */ a(Object obj, int i10) {
        this.f24883p0 = i10;
        this.f24884q0 = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i10 = this.f24883p0;
        Object obj = this.f24884q0;
        switch (i10) {
            case 0:
                return Boolean.valueOf(((DeviceCheckerRepositoryImpl) obj).f29636a.getCom.mastercard.mpsdk.mcbp.mcmlite.BuildConfig.BUILD_TYPE java.lang.String().isDebuggable());
            default:
                return Boolean.valueOf(((DeviceInfoRepositoryImpl) obj).f29641a.getHardware().isMicrophonePresent());
        }
    }
}

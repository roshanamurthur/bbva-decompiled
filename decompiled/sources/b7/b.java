package b7;

import com.bbva.ethermobilesdk.devicemanager.data.devicechecker.common.repository.DeviceCheckerRepositoryImpl;
import com.bbva.ethermobilesdk.devicemanager.data.deviceinfo.repository.DeviceInfoRepositoryImpl;
import kotlin.jvm.functions.Function0;
import kotlin.text.StringsKt__StringsKt;
import kotlin.text.l;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class b implements Function0 {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ int f24885p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ Object f24886q0;

    public /* synthetic */ b(Object obj, int i10) {
        this.f24885p0 = i10;
        this.f24886q0 = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i10 = this.f24885p0;
        Object obj = this.f24886q0;
        switch (i10) {
            case 0:
                return Boolean.valueOf(((DeviceCheckerRepositoryImpl) obj).f29636a.getEmulator().isEmulator());
            default:
                return StringsKt__StringsKt.substringAfter$default(l.replace$default(((DeviceInfoRepositoryImpl) obj).f29641a.getFileSystem().getStorage().getTotal(), " ", " ", false, 4, (Object) null), " ", (String) null, 2, (Object) null);
        }
    }
}

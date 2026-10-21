package androidx.camera.camera2.internal;

import androidx.camera.core.Preview;
import androidx.camera.core.SurfaceRequest;
import androidx.concurrent.futures.CallbackToFutureAdapter;
import androidx.core.location.LocationManagerCompat;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class k implements Runnable {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ int f1946p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ Object f1947q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final /* synthetic */ Object f1948r0;

    public /* synthetic */ k(Object obj, Object obj2, int i10) {
        this.f1946p0 = i10;
        this.f1947q0 = obj;
        this.f1948r0 = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f1946p0) {
            case 0:
                ((Camera2CameraControlImpl) this.f1947q0).lambda$updateSessionConfigAsync$6((CallbackToFutureAdapter.Completer) this.f1948r0);
                break;
            case 1:
                ((Preview.SurfaceProvider) this.f1947q0).onSurfaceRequested((SurfaceRequest) this.f1948r0);
                break;
            case 2:
                LocationManagerCompat.m mVar = (LocationManagerCompat.m) this.f1947q0;
                String str = (String) this.f1948r0;
                LocationManagerCompat.l lVar = mVar.f19967p0;
                if (lVar != null) {
                    lVar.f19966b.onProviderDisabled(str);
                    break;
                }
                break;
            case 3:
                Runnable runnable = (Runnable) this.f1947q0;
                uf.j.b bVar = (uf.j.b) this.f1948r0;
                try {
                    runnable.run();
                    uf.j.this.set(null);
                } catch (Exception e5) {
                    uf.j.this.setException(e5);
                    return;
                }
                break;
            default:
                String tag = (String) this.f1947q0;
                String msg = (String) this.f1948r0;
                Intrinsics.checkNotNullParameter(tag, "$tag");
                Intrinsics.checkNotNullParameter(msg, "$msg");
                break;
        }
    }
}

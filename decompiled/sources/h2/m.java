package h2;

import android.location.Location;
import androidx.core.location.LocationManagerCompat;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class m implements Runnable {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ int f69282p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ Object f69283q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final /* synthetic */ Object f69284r0;

    public /* synthetic */ m(Object obj, Object obj2, int i10) {
        this.f69282p0 = i10;
        this.f69283q0 = obj;
        this.f69284r0 = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f69282p0) {
            case 0:
                LocationManagerCompat.m mVar = (LocationManagerCompat.m) this.f69283q0;
                Location location = (Location) this.f69284r0;
                LocationManagerCompat.l lVar = mVar.f19967p0;
                if (lVar != null) {
                    lVar.f19966b.onLocationChanged(location);
                    break;
                }
                break;
            default:
                Runnable runnable = (Runnable) this.f69283q0;
                uf.j.b bVar = (uf.j.b) this.f69284r0;
                try {
                    runnable.run();
                } catch (Exception e5) {
                    uf.j.this.setException(e5);
                }
                break;
        }
    }
}

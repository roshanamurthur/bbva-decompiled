package h2;

import android.location.LocationManager;
import androidx.core.location.LocationManagerCompat;
import java.util.concurrent.Callable;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class d implements Callable {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ int f69260p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ Object f69261q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final /* synthetic */ Object f69262r0;

    public /* synthetic */ d(Object obj, Object obj2, int i10) {
        this.f69260p0 = i10;
        this.f69261q0 = obj;
        this.f69262r0 = obj2;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        int i10 = this.f69260p0;
        Object obj = this.f69262r0;
        Object obj2 = this.f69261q0;
        switch (i10) {
            case 0:
                Class<?> cls = LocationManagerCompat.f19942a;
                return Boolean.valueOf(((LocationManager) obj2).addGpsStatusListener((LocationManagerCompat.j) obj));
            default:
                ((Runnable) obj2).run();
                return obj;
        }
    }
}

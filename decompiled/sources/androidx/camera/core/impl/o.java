package androidx.camera.core.impl;

import android.util.Log;
import androidx.core.location.LocationManagerCompat;
import com.bbva.component.ic.security.SecurityDataManager;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class o implements Runnable {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ int f2123p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ Object f2124q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final /* synthetic */ Object f2125r0;

    public /* synthetic */ o(Object obj, Object obj2, int i10) {
        this.f2123p0 = i10;
        this.f2124q0 = obj;
        this.f2125r0 = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f2123p0) {
            case 0:
                ((ConstantObservable) this.f2124q0).lambda$addObserver$0((Observable.Observer) this.f2125r0);
                break;
            case 1:
                LocationManagerCompat.m mVar = (LocationManagerCompat.m) this.f2124q0;
                String str = (String) this.f2125r0;
                LocationManagerCompat.l lVar = mVar.f19967p0;
                if (lVar != null) {
                    lVar.f19966b.onProviderEnabled(str);
                    break;
                }
                break;
            case 2:
                ((SecurityDataManager) this.f2124q0).fire(SecurityDataManager.f28164u0, (List) this.f2125r0);
                break;
            default:
                String tag = (String) this.f2124q0;
                String str2 = (String) this.f2125r0;
                Intrinsics.checkNotNullParameter(tag, "$tag");
                Log.wtf(tag, str2);
                break;
        }
    }
}

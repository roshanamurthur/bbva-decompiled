package androidx.camera.core.impl;

import android.location.Location;
import android.util.Log;
import androidx.core.location.LocationManagerCompat;
import com.bbva.component.ic.security.SecurityDataManager;
import com.visa.internal.LogoElement;
import java.util.List;
import java.util.Map;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class q implements Runnable {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ int f2127p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ Object f2128q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final /* synthetic */ Object f2129r0;

    public /* synthetic */ q(Object obj, Object obj2, int i10) {
        this.f2127p0 = i10;
        this.f2128q0 = obj;
        this.f2129r0 = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() throws Exception {
        switch (this.f2127p0) {
            case 0:
                ((DeferrableSurface) this.f2128q0).lambda$new$1((String) this.f2129r0);
                return;
            case 1:
                LocationManagerCompat.m mVar = (LocationManagerCompat.m) this.f2128q0;
                List<Location> list = (List) this.f2129r0;
                LocationManagerCompat.l lVar = mVar.f19967p0;
                if (lVar == null) {
                    return;
                }
                lVar.f19966b.onLocationChanged(list);
                return;
            case 2:
                ((SecurityDataManager) this.f2128q0).fire(SecurityDataManager.v0, (Map) this.f2129r0);
                return;
            case 3:
                Runnable runnable = (Runnable) this.f2128q0;
                uf.j.b bVar = (uf.j.b) this.f2129r0;
                try {
                    runnable.run();
                    return;
                } catch (Exception e5) {
                    uf.j.this.setException(e5);
                    throw e5;
                }
            case 4:
                String tag = (String) this.f2129r0;
                String msg = (String) this.f2128q0;
                Intrinsics.checkNotNullParameter(tag, "$tag");
                Intrinsics.checkNotNullParameter(msg, "$msg");
                Log.w(tag, msg);
                return;
            default:
                LogoElement.a((LogoElement) this.f2128q0, (Function0) this.f2129r0);
                return;
        }
    }

    public /* synthetic */ q(String str, String str2) {
        this.f2127p0 = 4;
        this.f2129r0 = str;
        this.f2128q0 = str2;
    }
}

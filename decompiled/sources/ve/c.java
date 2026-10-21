package ve;

import android.os.IBinder;
import android.os.RemoteException;
import com.google.android.play.core.review.internal.zze;
import com.google.android.play.core.review.internal.zzj;
import com.google.android.play.core.review.internal.zzt;
import java.util.Iterator;

/* JADX INFO: compiled from: com.google.android.play:review@@2.0.1 */
/* JADX INFO: loaded from: classes10.dex */
public final class c extends zzj {

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ IBinder f94042q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final /* synthetic */ e f94043r0;

    public c(e eVar, IBinder iBinder) {
        this.f94043r0 = eVar;
        this.f94042q0 = iBinder;
    }

    @Override // com.google.android.play.core.review.internal.zzj
    public final void zza() {
        e eVar = this.f94043r0;
        eVar.f94045a.m = zze.zzb(this.f94042q0);
        zzt zztVar = eVar.f94045a;
        zztVar.f46218b.zzd("linkToDeath", new Object[0]);
        try {
            zztVar.m.asBinder().linkToDeath(zztVar.f46226j, 0);
        } catch (RemoteException e5) {
            zztVar.f46218b.zzc(e5, "linkToDeath failed", new Object[0]);
        }
        zztVar.f46223g = false;
        Iterator it = zztVar.f46220d.iterator();
        while (it.hasNext()) {
            ((Runnable) it.next()).run();
        }
        zztVar.f46220d.clear();
    }
}

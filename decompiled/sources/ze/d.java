package ze;

import android.os.IBinder;
import android.os.RemoteException;
import com.google.android.play.core.appupdate.internal.f;
import com.google.android.play.integrity.internal.g;
import com.google.android.play.integrity.internal.l;
import com.google.android.play.integrity.internal.v;
import java.util.Iterator;

/* JADX INFO: compiled from: com.google.android.play:integrity@@1.1.0 */
/* JADX INFO: loaded from: classes10.dex */
public final class d extends l {

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ IBinder f95064q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final /* synthetic */ f f95065r0;

    public d(f fVar, IBinder iBinder) {
        this.f95065r0 = fVar;
        this.f95064q0 = iBinder;
    }

    @Override // com.google.android.play.integrity.internal.l
    public final void b() {
        f fVar = this.f95065r0;
        ((v) fVar.f46058b).m = g.b(this.f95064q0);
        Object obj = fVar.f46058b;
        v vVar = (v) obj;
        vVar.f46388b.d("linkToDeath", new Object[0]);
        try {
            vVar.m.asBinder().linkToDeath(vVar.f46396j, 0);
        } catch (RemoteException e5) {
            vVar.f46388b.c(e5, "linkToDeath failed", new Object[0]);
        }
        v vVar2 = (v) obj;
        vVar2.f46393g = false;
        Iterator it = vVar2.f46390d.iterator();
        while (it.hasNext()) {
            ((Runnable) it.next()).run();
        }
        ((v) obj).f46390d.clear();
    }
}

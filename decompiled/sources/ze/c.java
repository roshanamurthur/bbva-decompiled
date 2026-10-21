package ze;

import com.google.android.play.integrity.internal.l;
import com.google.android.play.integrity.internal.v;

/* JADX INFO: compiled from: com.google.android.play:integrity@@1.1.0 */
/* JADX INFO: loaded from: classes10.dex */
public final class c extends l {

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ v f95063q0;

    public c(v vVar) {
        this.f95063q0 = vVar;
    }

    @Override // com.google.android.play.integrity.internal.l
    public final void b() {
        v vVar = this.f95063q0;
        if (vVar.m != null) {
            vVar.f46388b.d("Unbind from service.", new Object[0]);
            vVar.f46387a.unbindService(vVar.f46398l);
            vVar.f46393g = false;
            vVar.m = null;
            vVar.f46398l = null;
        }
        vVar.a();
    }
}

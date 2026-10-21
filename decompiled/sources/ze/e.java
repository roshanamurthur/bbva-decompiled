package ze;

import com.google.android.play.core.appupdate.internal.f;
import com.google.android.play.integrity.internal.l;
import com.google.android.play.integrity.internal.v;

/* JADX INFO: compiled from: com.google.android.play:integrity@@1.1.0 */
/* JADX INFO: loaded from: classes10.dex */
public final class e extends l {

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ f f95066q0;

    public e(f fVar) {
        this.f95066q0 = fVar;
    }

    @Override // com.google.android.play.integrity.internal.l
    public final void b() {
        f fVar = this.f95066q0;
        v vVar = (v) fVar.f46058b;
        vVar.f46388b.d("unlinkToDeath", new Object[0]);
        vVar.m.asBinder().unlinkToDeath(vVar.f46396j, 0);
        v vVar2 = (v) fVar.f46058b;
        vVar2.m = null;
        vVar2.f46393g = false;
    }
}

package ve;

import com.google.android.play.core.review.internal.zzj;
import com.google.android.play.core.review.internal.zzt;

/* JADX INFO: compiled from: com.google.android.play:review@@2.0.1 */
/* JADX INFO: loaded from: classes10.dex */
public final class b extends zzj {

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ zzt f94041q0;

    public b(zzt zztVar) {
        this.f94041q0 = zztVar;
    }

    @Override // com.google.android.play.core.review.internal.zzj
    public final void zza() {
        zzt zztVar = this.f94041q0;
        if (zztVar.m != null) {
            zztVar.f46218b.zzd("Unbind from service.", new Object[0]);
            zztVar.f46217a.unbindService(zztVar.f46228l);
            zztVar.f46223g = false;
            zztVar.m = null;
            zztVar.f46228l = null;
        }
        zztVar.a();
    }
}

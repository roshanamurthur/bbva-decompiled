package ve;

import com.google.android.play.core.review.internal.zzj;
import com.google.android.play.core.review.internal.zzt;

/* JADX INFO: compiled from: com.google.android.play:review@@2.0.1 */
/* JADX INFO: loaded from: classes10.dex */
public final class d extends zzj {

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ e f94044q0;

    public d(e eVar) {
        this.f94044q0 = eVar;
    }

    @Override // com.google.android.play.core.review.internal.zzj
    public final void zza() {
        e eVar = this.f94044q0;
        zzt zztVar = eVar.f94045a;
        zztVar.f46218b.zzd("unlinkToDeath", new Object[0]);
        zztVar.m.asBinder().unlinkToDeath(zztVar.f46226j, 0);
        zzt zztVar2 = eVar.f94045a;
        zztVar2.m = null;
        zztVar2.f46223g = false;
    }
}

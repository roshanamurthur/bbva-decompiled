package we;

import com.google.android.play.core.splitcompat.zzm;
import java.io.File;
import java.io.IOException;

/* JADX INFO: compiled from: com.google.android.play:feature-delivery@@2.1.0 */
/* JADX INFO: loaded from: classes10.dex */
public final class c implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ d f94223a;

    public c(d dVar) {
        this.f94223a = dVar;
    }

    @Override // we.h
    public final void a(zzm zzmVar, File file, boolean z10) throws IOException {
        d dVar = this.f94223a;
        dVar.f94225b.add(file);
        if (z10) {
            return;
        }
        dVar.f94226c.set(false);
    }
}

package we;

import com.google.android.play.core.splitcompat.SplitCompat;

/* JADX INFO: compiled from: com.google.android.play:feature-delivery@@2.1.0 */
/* JADX INFO: loaded from: classes10.dex */
public final class j implements Runnable {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ SplitCompat f94235p0;

    public j(SplitCompat splitCompat) {
        this.f94235p0 = splitCompat;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.f94235p0.f46244a.zzk();
        } catch (Exception unused) {
        }
    }
}

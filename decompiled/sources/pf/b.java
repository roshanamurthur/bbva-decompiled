package pf;

import androidx.annotation.Nullable;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.concurrent.Callable;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-api@@20.1.0 */
/* JADX INFO: loaded from: classes10.dex */
public final class b implements Callable {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ FirebaseAnalytics f92678p0;

    public b(FirebaseAnalytics firebaseAnalytics) {
        this.f92678p0 = firebaseAnalytics;
    }

    @Override // java.util.concurrent.Callable
    @Nullable
    public final /* bridge */ /* synthetic */ Object call() throws Exception {
        return this.f92678p0.f47577a.zzk();
    }
}

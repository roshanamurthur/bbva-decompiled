package we;

import com.google.android.play.core.splitcompat.SplitCompat;
import com.google.android.play.core.splitinstall.zzq;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: com.google.android.play:feature-delivery@@2.1.0 */
/* JADX INFO: loaded from: classes10.dex */
public final class i implements zzq {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ SplitCompat f94234a;

    public i(SplitCompat splitCompat) {
        this.f94234a = splitCompat;
    }

    @Override // com.google.android.play.core.splitinstall.zzq
    public final Set zza() {
        AtomicReference atomicReference = SplitCompat.f46243e;
        return this.f94234a.a();
    }
}

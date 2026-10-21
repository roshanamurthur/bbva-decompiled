package we;

import com.google.android.play.core.splitcompat.SplitCompat;
import com.google.android.play.core.splitcompat.zze;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: com.google.android.play:feature-delivery@@2.1.0 */
/* JADX INFO: loaded from: classes10.dex */
public final class k implements Runnable {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ Set f94236p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ SplitCompat f94237q0;

    public k(SplitCompat splitCompat, HashSet hashSet) {
        this.f94237q0 = splitCompat;
        this.f94236p0 = hashSet;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            SplitCompat splitCompat = this.f94237q0;
            Set set = this.f94236p0;
            AtomicReference atomicReference = SplitCompat.f46243e;
            splitCompat.getClass();
            Iterator it = set.iterator();
            while (it.hasNext()) {
                zze.zzl(splitCompat.f46244a.zzg((String) it.next()));
            }
            splitCompat.f46245b.zzb();
        } catch (Exception unused) {
        }
    }
}

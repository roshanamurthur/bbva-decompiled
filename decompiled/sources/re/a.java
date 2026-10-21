package re;

import android.util.Pair;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import hg.m;

/* JADX INFO: compiled from: com.google.android.odml:image@@1.0.0-beta1 */
/* JADX INFO: loaded from: classes10.dex */
public final class a implements Continuation {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public Object f92992p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public Object f92993q0;

    public final b a() {
        Integer num = (Integer) this.f92992p0;
        if (num != null && ((Integer) this.f92993q0) != null) {
            return new b(num.intValue(), ((Integer) this.f92993q0).intValue());
        }
        StringBuilder sb2 = new StringBuilder();
        if (((Integer) this.f92992p0) == null) {
            sb2.append(" imageFormat");
        }
        if (((Integer) this.f92993q0) == null) {
            sb2.append(" storageType");
        }
        String strValueOf = String.valueOf(sb2);
        throw new IllegalStateException(ad.d.f(new StringBuilder(strValueOf.length() + 28), "Missing required properties:", strValueOf));
    }

    @Override // com.google.android.gms.tasks.Continuation
    public final Object then(Task task) {
        m mVar = (m) this.f92992p0;
        Pair pair = (Pair) this.f92993q0;
        synchronized (mVar) {
            mVar.f69443b.remove(pair);
        }
        return task;
    }
}

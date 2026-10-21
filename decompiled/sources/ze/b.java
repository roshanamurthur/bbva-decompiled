package ze;

import android.os.IInterface;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.play.core.appupdate.internal.f;
import com.google.android.play.integrity.internal.k;
import com.google.android.play.integrity.internal.l;
import com.google.android.play.integrity.internal.v;
import com.google.android.play.integrity.internal.w;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: compiled from: com.google.android.play:integrity@@1.1.0 */
/* JADX INFO: loaded from: classes10.dex */
public final class b extends l {

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ l f95061q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final /* synthetic */ v f95062r0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(v vVar, TaskCompletionSource taskCompletionSource, l lVar) {
        super(taskCompletionSource);
        this.f95062r0 = vVar;
        this.f95061q0 = lVar;
    }

    @Override // com.google.android.play.integrity.internal.l
    public final void b() {
        v vVar = this.f95062r0;
        IInterface iInterface = vVar.m;
        ArrayList arrayList = vVar.f46390d;
        l lVar = this.f95061q0;
        k kVar = vVar.f46388b;
        if (iInterface != null || vVar.f46393g) {
            if (!vVar.f46393g) {
                lVar.run();
                return;
            } else {
                kVar.d("Waiting to bind to the service.", new Object[0]);
                arrayList.add(lVar);
                return;
            }
        }
        kVar.d("Initiate binding to the service.", new Object[0]);
        arrayList.add(lVar);
        f fVar = new f(vVar, 1);
        vVar.f46398l = fVar;
        vVar.f46393g = true;
        if (vVar.f46387a.bindService(vVar.f46394h, fVar, 1)) {
            return;
        }
        kVar.d("Failed to bind to the service.", new Object[0]);
        vVar.f46393g = false;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((l) it.next()).a(new w());
        }
        arrayList.clear();
    }
}

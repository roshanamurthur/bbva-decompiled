package ve;

import android.os.IInterface;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.play.core.review.internal.zzi;
import com.google.android.play.core.review.internal.zzj;
import com.google.android.play.core.review.internal.zzt;
import com.google.android.play.core.review.internal.zzu;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: compiled from: com.google.android.play:review@@2.0.1 */
/* JADX INFO: loaded from: classes10.dex */
public final class a extends zzj {

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ zzj f94039q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final /* synthetic */ zzt f94040r0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(zzt zztVar, TaskCompletionSource taskCompletionSource, zzj zzjVar) {
        super(taskCompletionSource);
        this.f94040r0 = zztVar;
        this.f94039q0 = zzjVar;
    }

    @Override // com.google.android.play.core.review.internal.zzj
    public final void zza() {
        zzt zztVar = this.f94040r0;
        IInterface iInterface = zztVar.m;
        ArrayList arrayList = zztVar.f46220d;
        zzj zzjVar = this.f94039q0;
        zzi zziVar = zztVar.f46218b;
        if (iInterface != null || zztVar.f46223g) {
            if (!zztVar.f46223g) {
                zzjVar.run();
                return;
            } else {
                zziVar.zzd("Waiting to bind to the service.", new Object[0]);
                arrayList.add(zzjVar);
                return;
            }
        }
        zziVar.zzd("Initiate binding to the service.", new Object[0]);
        arrayList.add(zzjVar);
        e eVar = new e(zztVar);
        zztVar.f46228l = eVar;
        zztVar.f46223g = true;
        if (zztVar.f46217a.bindService(zztVar.f46224h, eVar, 1)) {
            return;
        }
        zziVar.zzd("Failed to bind to the service.", new Object[0]);
        zztVar.f46223g = false;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((zzj) it.next()).zzc(new zzu());
        }
        arrayList.clear();
    }
}

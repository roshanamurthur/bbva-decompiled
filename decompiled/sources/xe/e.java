package xe;

import android.os.RemoteException;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.play.core.splitinstall.internal.zzv;
import java.util.List;

/* JADX INFO: compiled from: com.google.android.play:feature-delivery@@2.1.0 */
/* JADX INFO: loaded from: classes10.dex */
public final class e extends zzv {

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ List f94558q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final /* synthetic */ TaskCompletionSource f94559r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final /* synthetic */ t f94560s0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(t tVar, TaskCompletionSource taskCompletionSource, List list, TaskCompletionSource taskCompletionSource2) {
        super(taskCompletionSource);
        this.f94560s0 = tVar;
        this.f94558q0 = list;
        this.f94559r0 = taskCompletionSource2;
    }

    /* JADX WARN: Type inference failed for: r3v2, types: [android.os.IInterface, com.google.android.play.core.splitinstall.internal.zzbo] */
    @Override // com.google.android.play.core.splitinstall.internal.zzv
    public final void zzc() {
        TaskCompletionSource taskCompletionSource = this.f94559r0;
        List list = this.f94558q0;
        t tVar = this.f94560s0;
        try {
            tVar.f94580b.zze().zzd(tVar.f94579a, t.b(list), t.c(), new l(tVar, taskCompletionSource));
        } catch (RemoteException e5) {
            t.f94577c.zzc(e5, "deferredInstall(%s)", list);
            taskCompletionSource.trySetException(new RuntimeException(e5));
        }
    }
}

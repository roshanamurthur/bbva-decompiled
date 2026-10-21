package xe;

import android.os.RemoteException;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.play.core.splitinstall.internal.zzv;

/* JADX INFO: compiled from: com.google.android.play:feature-delivery@@2.1.0 */
/* JADX INFO: loaded from: classes10.dex */
public final class i extends zzv {

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ TaskCompletionSource f94570q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final /* synthetic */ t f94571r0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(t tVar, TaskCompletionSource taskCompletionSource, TaskCompletionSource taskCompletionSource2) {
        super(taskCompletionSource);
        this.f94571r0 = tVar;
        this.f94570q0 = taskCompletionSource2;
    }

    /* JADX WARN: Type inference failed for: r2v3, types: [android.os.IInterface, com.google.android.play.core.splitinstall.internal.zzbo] */
    @Override // com.google.android.play.core.splitinstall.internal.zzv
    public final void zzc() {
        TaskCompletionSource taskCompletionSource = this.f94570q0;
        t tVar = this.f94571r0;
        try {
            tVar.f94580b.zze().zzi(tVar.f94579a, new q(tVar, taskCompletionSource));
        } catch (RemoteException e5) {
            t.f94577c.zzc(e5, "getSessionStates", new Object[0]);
            taskCompletionSource.trySetException(new RuntimeException(e5));
        }
    }
}

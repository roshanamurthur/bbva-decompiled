package xe;

import android.os.RemoteException;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.play.core.splitinstall.internal.zzv;

/* JADX INFO: compiled from: com.google.android.play:feature-delivery@@2.1.0 */
/* JADX INFO: loaded from: classes10.dex */
public final class j extends zzv {

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ int f94572q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final /* synthetic */ TaskCompletionSource f94573r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final /* synthetic */ t f94574s0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(t tVar, TaskCompletionSource taskCompletionSource, int i10, TaskCompletionSource taskCompletionSource2) {
        super(taskCompletionSource);
        this.f94574s0 = tVar;
        this.f94572q0 = i10;
        this.f94573r0 = taskCompletionSource2;
    }

    /* JADX WARN: Type inference failed for: r3v2, types: [android.os.IInterface, com.google.android.play.core.splitinstall.internal.zzbo] */
    @Override // com.google.android.play.core.splitinstall.internal.zzv
    public final void zzc() {
        TaskCompletionSource taskCompletionSource = this.f94573r0;
        int i10 = this.f94572q0;
        t tVar = this.f94574s0;
        try {
            tVar.f94580b.zze().zzc(tVar.f94579a, i10, t.c(), new k(tVar, taskCompletionSource));
        } catch (RemoteException e5) {
            t.f94577c.zzc(e5, "cancelInstall(%d)", Integer.valueOf(i10));
            taskCompletionSource.trySetException(new RuntimeException(e5));
        }
    }
}

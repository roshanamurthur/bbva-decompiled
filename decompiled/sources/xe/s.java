package xe;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.play.core.splitinstall.SplitInstallException;
import com.google.android.play.core.splitinstall.internal.zzaf;
import com.google.android.play.core.splitinstall.internal.zzbp;
import java.util.List;

/* JADX INFO: compiled from: com.google.android.play:feature-delivery@@2.1.0 */
/* JADX INFO: loaded from: classes10.dex */
public class s extends zzbp {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final TaskCompletionSource f94575e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ t f94576f;

    public s(t tVar, TaskCompletionSource taskCompletionSource) {
        this.f94576f = tVar;
        this.f94575e = taskCompletionSource;
    }

    public void zzb(int i10, Bundle bundle) throws RemoteException {
        this.f94576f.f94580b.zzu(this.f94575e);
        t.f94577c.zzd("onCancelInstall(%d)", Integer.valueOf(i10));
    }

    public void zzc(Bundle bundle) throws RemoteException {
        this.f94576f.f94580b.zzu(this.f94575e);
        t.f94577c.zzd("onDeferredInstall", new Object[0]);
    }

    public void zzd(Bundle bundle) throws RemoteException {
        this.f94576f.f94580b.zzu(this.f94575e);
        t.f94577c.zzd("onDeferredLanguageInstall", new Object[0]);
    }

    public void zze(Bundle bundle) throws RemoteException {
        this.f94576f.f94580b.zzu(this.f94575e);
        t.f94577c.zzd("onDeferredLanguageUninstall", new Object[0]);
    }

    public void zzf(Bundle bundle) throws RemoteException {
        this.f94576f.f94580b.zzu(this.f94575e);
        t.f94577c.zzd("onDeferredUninstall", new Object[0]);
    }

    public void zzg(int i10, Bundle bundle) throws RemoteException {
        this.f94576f.f94580b.zzu(this.f94575e);
        t.f94577c.zzd("onGetSession(%d)", Integer.valueOf(i10));
    }

    public void zzh(List list) throws RemoteException {
        this.f94576f.f94580b.zzu(this.f94575e);
        t.f94577c.zzd("onGetSessionStates", new Object[0]);
    }

    public void zzi(int i10, Bundle bundle) throws RemoteException {
        this.f94576f.f94580b.zzu(this.f94575e);
        t.f94577c.zzd("onStartInstall(%d)", Integer.valueOf(i10));
    }

    @Override // com.google.android.play.core.splitinstall.internal.zzbq
    public final void zzj(int i10, Bundle bundle) throws RemoteException {
        this.f94576f.f94580b.zzu(this.f94575e);
        t.f94577c.zzd("onCompleteInstall(%d)", Integer.valueOf(i10));
    }

    @Override // com.google.android.play.core.splitinstall.internal.zzbq
    public final void zzk(Bundle bundle) throws RemoteException {
        this.f94576f.f94580b.zzu(this.f94575e);
        t.f94577c.zzd("onCompleteInstallForAppUpdate", new Object[0]);
    }

    @Override // com.google.android.play.core.splitinstall.internal.zzbq
    public final void zzl(Bundle bundle) throws RemoteException {
        zzaf zzafVar = this.f94576f.f94580b;
        TaskCompletionSource taskCompletionSource = this.f94575e;
        zzafVar.zzu(taskCompletionSource);
        int i10 = bundle.getInt("error_code");
        t.f94577c.zzb("onError(%d)", Integer.valueOf(i10));
        taskCompletionSource.trySetException(new SplitInstallException(i10));
    }

    @Override // com.google.android.play.core.splitinstall.internal.zzbq
    public final void zzm(Bundle bundle) throws RemoteException {
        this.f94576f.f94580b.zzu(this.f94575e);
        t.f94577c.zzd("onGetSplitsForAppUpdate", new Object[0]);
    }
}

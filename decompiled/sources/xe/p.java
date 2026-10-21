package xe;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.play.core.splitinstall.SplitInstallSessionState;

/* JADX INFO: compiled from: com.google.android.play:feature-delivery@@2.1.0 */
/* JADX INFO: loaded from: classes10.dex */
public final class p extends s {
    @Override // xe.s, com.google.android.play.core.splitinstall.internal.zzbq
    public final void zzg(int i10, Bundle bundle) throws RemoteException {
        super.zzg(i10, bundle);
        this.f94575e.trySetResult(SplitInstallSessionState.zzd(bundle));
    }
}

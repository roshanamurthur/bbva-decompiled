package com.google.android.play.core.appupdate;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.play.core.install.InstallException;

/* JADX INFO: compiled from: com.google.android.play:app-update@@2.1.0 */
/* JADX INFO: loaded from: classes10.dex */
public final class f extends e {
    @Override // com.google.android.play.core.appupdate.e, com.google.android.play.core.appupdate.internal.zzh
    public final void zzb(Bundle bundle) throws RemoteException {
        super.zzb(bundle);
        int i10 = bundle.getInt("error.code", -2);
        TaskCompletionSource taskCompletionSource = this.f46038f;
        if (i10 != 0) {
            taskCompletionSource.trySetException(new InstallException(bundle.getInt("error.code", -2)));
        } else {
            taskCompletionSource.trySetResult(null);
        }
    }
}

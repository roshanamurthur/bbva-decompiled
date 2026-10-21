package com.google.android.gms.common.api.internal;

import android.os.DeadObjectException;
import android.os.RemoteException;
import androidx.annotation.NonNull;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: compiled from: com.google.android.gms:play-services-base@@18.4.0 */
/* JADX INFO: loaded from: classes9.dex */
abstract class zad extends zac {
    protected final TaskCompletionSource zaa;

    public zad(int i10, TaskCompletionSource taskCompletionSource) {
        super(i10);
        this.zaa = taskCompletionSource;
    }

    public abstract void zac(zabq zabqVar) throws RemoteException;

    @Override // com.google.android.gms.common.api.internal.zai
    public final void zad(@NonNull Status status) {
        this.zaa.trySetException(new ApiException(status));
    }

    @Override // com.google.android.gms.common.api.internal.zai
    public final void zae(@NonNull Exception exc) {
        this.zaa.trySetException(exc);
    }

    @Override // com.google.android.gms.common.api.internal.zai
    public final void zaf(zabq zabqVar) throws DeadObjectException {
        try {
            zac(zabqVar);
        } catch (DeadObjectException e5) {
            zad(zai.zah(e5));
            throw e5;
        } catch (RemoteException e7) {
            zad(zai.zah(e7));
        } catch (RuntimeException e10) {
            this.zaa.trySetException(e10);
        }
    }

    @Override // com.google.android.gms.common.api.internal.zai
    public void zag(@NonNull zaad zaadVar, boolean z10) {
    }
}

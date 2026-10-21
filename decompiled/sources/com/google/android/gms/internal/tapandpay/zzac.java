package com.google.android.gms.internal.tapandpay;

import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.TaskUtil;
import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: compiled from: com.google.android.gms:play-services-tapandpay@@18.3.2 */
/* JADX INFO: loaded from: classes9.dex */
final class zzac extends zzah {
    final /* synthetic */ TaskCompletionSource zza;

    public zzac(zzag zzagVar, TaskCompletionSource taskCompletionSource) {
        this.zza = taskCompletionSource;
    }

    @Override // com.google.android.gms.internal.tapandpay.zzah, com.google.android.gms.internal.tapandpay.zzf
    public final void zzz(Status status, String str) throws RemoteException {
        TaskUtil.trySetResultOrApiException(status, str, this.zza);
    }
}

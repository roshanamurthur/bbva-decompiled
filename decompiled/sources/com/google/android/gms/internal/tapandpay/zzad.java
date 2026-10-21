package com.google.android.gms.internal.tapandpay;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.TaskUtil;
import com.google.android.gms.tapandpay.issuer.TokenInfo;
import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: compiled from: com.google.android.gms:play-services-tapandpay@@18.3.2 */
/* JADX INFO: loaded from: classes9.dex */
final class zzad extends zzah {
    final /* synthetic */ TaskCompletionSource zza;

    public zzad(zzag zzagVar, TaskCompletionSource taskCompletionSource) {
        this.zza = taskCompletionSource;
    }

    @Override // com.google.android.gms.internal.tapandpay.zzah, com.google.android.gms.internal.tapandpay.zzf
    public final void zzA(Status status, TokenInfo[] tokenInfoArr) {
        TaskUtil.trySetResultOrApiException(status, zzat.zzi(tokenInfoArr), this.zza);
    }
}

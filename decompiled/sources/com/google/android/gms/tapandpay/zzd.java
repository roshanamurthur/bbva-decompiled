package com.google.android.gms.tapandpay;

import androidx.annotation.Nullable;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BaseImplementation;
import com.google.android.gms.common.api.internal.ListenerHolder;
import com.google.android.gms.internal.tapandpay.zzah;

/* JADX INFO: compiled from: com.google.android.gms:play-services-tapandpay@@18.3.2 */
/* JADX INFO: loaded from: classes9.dex */
public final class zzd extends zzah {
    private static final ListenerHolder.Notifier zza = new zzc();
    private final ListenerHolder zzb;

    public zzd(@Nullable BaseImplementation.ResultHolder resultHolder, ListenerHolder listenerHolder) {
        this.zzb = listenerHolder;
    }

    @Override // com.google.android.gms.internal.tapandpay.zzah, com.google.android.gms.internal.tapandpay.zzf
    public final void zzb() {
        this.zzb.notifyListener(zza);
    }

    @Override // com.google.android.gms.internal.tapandpay.zzah, com.google.android.gms.internal.tapandpay.zzf
    public final void zzc(Status status) {
    }
}

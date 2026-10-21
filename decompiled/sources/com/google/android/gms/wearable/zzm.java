package com.google.android.gms.wearable;

import com.google.android.gms.wearable.internal.zzfe;

/* JADX INFO: loaded from: classes9.dex */
final class zzm implements Runnable {
    private final /* synthetic */ WearableListenerService.zzd zzao;
    private final /* synthetic */ zzfe zzap;

    public zzm(WearableListenerService.zzd zzdVar, zzfe zzfeVar) {
        this.zzao = zzdVar;
        this.zzap = zzfeVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        WearableListenerService.this.onMessageReceived(this.zzap);
    }
}

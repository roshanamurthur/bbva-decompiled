package com.google.android.gms.internal.identity;

import com.google.android.gms.common.api.internal.ListenerHolder;

/* JADX INFO: compiled from: com.google.android.gms:play-services-location@@21.2.0 */
/* JADX INFO: loaded from: classes9.dex */
final class zzdx implements ListenerHolder.Notifier {
    final /* synthetic */ zzdy zza;

    public zzdx(zzdy zzdyVar) {
        this.zza = zzdyVar;
    }

    @Override // com.google.android.gms.common.api.internal.ListenerHolder.Notifier
    public final /* bridge */ /* synthetic */ void notifyListener(Object obj) {
        this.zza.zzg().zzc();
    }

    @Override // com.google.android.gms.common.api.internal.ListenerHolder.Notifier
    public final void onNotifyListenerFailed() {
    }
}

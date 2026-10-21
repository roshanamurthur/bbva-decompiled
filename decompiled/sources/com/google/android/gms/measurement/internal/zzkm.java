package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.text.TextUtils;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement@@20.1.0 */
/* JADX INFO: loaded from: classes9.dex */
final class zzkm implements zzkv {
    final /* synthetic */ zzkp zza;

    public zzkm(zzkp zzkpVar) {
        this.zza = zzkpVar;
    }

    @Override // com.google.android.gms.measurement.internal.zzkv
    public final void zza(String str, String str2, Bundle bundle) {
        if (!TextUtils.isEmpty(str)) {
            this.zza.zzaz().zzp(new zzkl(this, str, "_err", bundle));
            return;
        }
        zzkp zzkpVar = this.zza;
        if (zzkpVar.zzn != null) {
            zzkpVar.zzn.zzay().zzd().zzb("AppId not known when logging event", "_err");
        }
    }
}

package com.google.android.gms.measurement.internal;

import android.util.Log;
import com.bbva.glomohybrid.base.deeplink.extensions.DeepLinkExtensionsKt;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@20.1.0 */
/* JADX INFO: loaded from: classes9.dex */
final class zzee implements Runnable {
    final /* synthetic */ int zza;
    final /* synthetic */ String zzb;
    final /* synthetic */ Object zzc;
    final /* synthetic */ Object zzd;
    final /* synthetic */ Object zze;
    final /* synthetic */ zzeh zzf;

    public zzee(zzeh zzehVar, int i10, String str, Object obj, Object obj2, Object obj3) {
        this.zzf = zzehVar;
        this.zza = i10;
        this.zzb = str;
        this.zzc = obj;
        this.zzd = obj2;
        this.zze = obj3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzew zzewVarZzm = this.zzf.zzs.zzm();
        if (!zzewVarZzm.zzx()) {
            Log.println(6, this.zzf.zzq(), "Persisted config not initialized. Not logging error/warn");
            return;
        }
        zzeh zzehVar = this.zzf;
        if (zzehVar.zza == 0) {
            if (zzehVar.zzs.zzf().zzy()) {
                zzeh zzehVar2 = this.zzf;
                zzehVar2.zzs.zzaw();
                zzehVar2.zza = 'C';
            } else {
                zzeh zzehVar3 = this.zzf;
                zzehVar3.zzs.zzaw();
                zzehVar3.zza = 'c';
            }
        }
        zzeh zzehVar4 = this.zzf;
        if (zzehVar4.zzb < 0) {
            zzehVar4.zzs.zzf().zzh();
            zzehVar4.zzb = 55005L;
        }
        char cCharAt = "01VDIWEA?".charAt(this.zza);
        zzeh zzehVar5 = this.zzf;
        char c10 = zzehVar5.zza;
        long j10 = zzehVar5.zzb;
        String strZzo = zzeh.zzo(true, this.zzb, this.zzc, this.zzd, this.zze);
        StringBuilder sb2 = new StringBuilder(strZzo.length() + 24);
        sb2.append("2");
        sb2.append(cCharAt);
        sb2.append(c10);
        sb2.append(j10);
        sb2.append(DeepLinkExtensionsKt.DYNAMIC_LINK_DELIMITER);
        sb2.append(strZzo);
        String string = sb2.toString();
        if (string.length() > 1024) {
            string = this.zzb.substring(0, 1024);
        }
        zzeu zzeuVar = zzewVarZzm.zzb;
        if (zzeuVar != null) {
            zzeuVar.zzb(string, 1L);
        }
    }
}

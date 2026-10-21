package com.google.mlkit.vision.barcode.internal;

import com.google.android.gms.internal.mlkit_vision_barcode.zzdv;
import com.google.android.gms.internal.mlkit_vision_barcode.zzdy;
import com.google.android.gms.internal.mlkit_vision_barcode.zzjs;
import com.google.android.gms.internal.mlkit_vision_barcode.zzki;
import com.google.android.gms.internal.mlkit_vision_barcode.zzkl;
import com.google.android.gms.internal.mlkit_vision_barcode.zznp;

/* JADX INFO: compiled from: com.google.android.gms:play-services-mlkit-barcode-scanning@@18.0.0 */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class zzg {
    public final /* synthetic */ zzi zza;

    public final zznp zza(Object obj, int i10, zzjs zzjsVar) {
        zzi zziVar = this.zza;
        zzdy zzdyVar = (zzdy) obj;
        zziVar.getClass();
        zzkl zzklVar = new zzkl();
        zzklVar.zze(zziVar.f49570h ? zzki.TYPE_THICK : zzki.TYPE_THIN);
        zzdv zzdvVar = new zzdv();
        zzdvVar.zza(Integer.valueOf(i10));
        zzdvVar.zzc(zzdyVar);
        zzdvVar.zzb(zzjsVar);
        zzklVar.zzd(zzdvVar.zze());
        return zznp.zzd(zzklVar);
    }
}

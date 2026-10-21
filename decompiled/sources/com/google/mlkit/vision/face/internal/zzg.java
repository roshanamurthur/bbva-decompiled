package com.google.mlkit.vision.face.internal;

import com.google.android.gms.internal.mlkit_vision_face.zzdk;
import com.google.android.gms.internal.mlkit_vision_face.zzdn;
import com.google.android.gms.internal.mlkit_vision_face.zzjv;
import com.google.android.gms.internal.mlkit_vision_face.zzkr;
import com.google.android.gms.internal.mlkit_vision_face.zzku;
import com.google.android.gms.internal.mlkit_vision_face.zznr;
import com.google.android.gms.internal.mlkit_vision_face.zzof;

/* JADX INFO: compiled from: com.google.android.gms:play-services-mlkit-face-detection@@17.1.0 */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class zzg {
    public final /* synthetic */ zzh zza;

    public final zznr zza(Object obj, int i10, zzjv zzjvVar) {
        zzh zzhVar = this.zza;
        zzdn zzdnVar = (zzdn) obj;
        zzhVar.getClass();
        zzku zzkuVar = new zzku();
        zzkuVar.zze(zzhVar.f49636g ? zzkr.TYPE_THICK : zzkr.TYPE_THIN);
        zzdk zzdkVar = new zzdk();
        zzdkVar.zza(Integer.valueOf(i10));
        zzdkVar.zzc(zzdnVar);
        zzdkVar.zzb(zzjvVar);
        zzkuVar.zzd(zzdkVar.zze());
        return zzof.zzf(zzkuVar);
    }
}

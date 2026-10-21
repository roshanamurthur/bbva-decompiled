package com.google.android.gms.internal.mlkit_vision_barcode;

import com.google.firebase.analytics.FirebaseAnalytics;
import javax.annotation.CheckForNull;

/* JADX INFO: compiled from: com.google.android.gms:play-services-mlkit-barcode-scanning@@18.0.0 */
/* JADX INFO: loaded from: classes9.dex */
final class zzcb extends zzcc {
    final transient int zza;
    final transient int zzb;
    final /* synthetic */ zzcc zzc;

    public zzcb(zzcc zzccVar, int i10, int i11) {
        this.zzc = zzccVar;
        this.zza = i10;
        this.zzb = i11;
    }

    @Override // java.util.List
    public final Object get(int i10) {
        zzaq.zza(i10, this.zzb, FirebaseAnalytics.Param.INDEX);
        return this.zzc.get(i10 + this.zza);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzbx
    public final int zzb() {
        return this.zzc.zzc() + this.zza + this.zzb;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzbx
    public final int zzc() {
        return this.zzc.zzc() + this.zza;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzbx
    @CheckForNull
    public final Object[] zze() {
        return this.zzc.zze();
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzcc, java.util.List
    /* JADX INFO: renamed from: zzf, reason: merged with bridge method [inline-methods] */
    public final zzcc subList(int i10, int i11) {
        zzaq.zzc(i10, i11, this.zzb);
        zzcc zzccVar = this.zzc;
        int i12 = this.zza;
        return zzccVar.subList(i10 + i12, i11 + i12);
    }
}

package com.google.android.gms.internal.mlkit_vision_barcode;

import com.google.firebase.analytics.FirebaseAnalytics;

/* JADX INFO: compiled from: com.google.android.gms:play-services-mlkit-barcode-scanning@@18.0.0 */
/* JADX INFO: loaded from: classes9.dex */
final class zzcr extends zzcc {
    static final zzcc zza = new zzcr(new Object[0], 0);
    final transient Object[] zzb;
    private final transient int zzc;

    public zzcr(Object[] objArr, int i10) {
        this.zzb = objArr;
        this.zzc = i10;
    }

    @Override // java.util.List
    public final Object get(int i10) {
        zzaq.zza(i10, this.zzc, FirebaseAnalytics.Param.INDEX);
        Object obj = this.zzb[i10];
        obj.getClass();
        return obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzcc, com.google.android.gms.internal.mlkit_vision_barcode.zzbx
    public final int zza(Object[] objArr, int i10) {
        System.arraycopy(this.zzb, 0, objArr, i10, this.zzc);
        return i10 + this.zzc;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzbx
    public final int zzb() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzbx
    public final int zzc() {
        return 0;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzbx
    public final Object[] zze() {
        return this.zzb;
    }
}

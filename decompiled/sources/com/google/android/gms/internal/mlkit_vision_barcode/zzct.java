package com.google.android.gms.internal.mlkit_vision_barcode;

import java.util.Iterator;
import java.util.Map;
import javax.annotation.CheckForNull;

/* JADX INFO: compiled from: com.google.android.gms:play-services-mlkit-barcode-scanning@@18.0.0 */
/* JADX INFO: loaded from: classes9.dex */
final class zzct extends zzcf {
    private final transient zzce zza;
    private final transient Object[] zzb;
    private final transient int zzc;

    public zzct(zzce zzceVar, Object[] objArr, int i10, int i11) {
        this.zza = zzceVar;
        this.zzb = objArr;
        this.zzc = i11;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzbx, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(@CheckForNull Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            Object value = entry.getValue();
            if (value != null && value.equals(this.zza.get(key))) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzcf, com.google.android.gms.internal.mlkit_vision_barcode.zzbx, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final /* synthetic */ Iterator iterator() {
        return zzf().listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzbx
    public final int zza(Object[] objArr, int i10) {
        return zzf().zza(objArr, i10);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzcf, com.google.android.gms.internal.mlkit_vision_barcode.zzbx
    /* JADX INFO: renamed from: zzd */
    public final zzda iterator() {
        return zzf().listIterator(0);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzcf
    public final zzcc zzg() {
        return new zzcs(this);
    }
}

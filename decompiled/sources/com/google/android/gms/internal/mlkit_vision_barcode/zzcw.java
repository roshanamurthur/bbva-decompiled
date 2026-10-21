package com.google.android.gms.internal.mlkit_vision_barcode;

import javax.annotation.CheckForNull;

/* JADX INFO: compiled from: com.google.android.gms:play-services-mlkit-barcode-scanning@@18.0.0 */
/* JADX INFO: loaded from: classes9.dex */
final class zzcw extends zzce {
    static final zzce zza = new zzcw(null, new Object[0], 0);
    final transient Object[] zzb;
    private final transient int zzc;

    private zzcw(@CheckForNull Object obj, Object[] objArr, int i10) {
        this.zzb = objArr;
        this.zzc = i10;
    }

    public static zzcw zzg(int i10, Object[] objArr, zzcd zzcdVar) {
        Object obj = objArr[0];
        obj.getClass();
        Object obj2 = objArr[1];
        obj2.getClass();
        zzbj.zzb(obj, obj2);
        return new zzcw(null, objArr, 1);
    }

    /* JADX WARN: Code duplicated, block: B:4:0x0007  */
    @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzce, java.util.Map
    @CheckForNull
    public final Object get(@CheckForNull Object obj) {
        Object obj2;
        Object[] objArr = this.zzb;
        int i10 = this.zzc;
        if (obj != null && i10 == 1) {
            Object obj3 = objArr[0];
            obj3.getClass();
            if (obj3.equals(obj)) {
                obj2 = objArr[1];
                obj2.getClass();
            } else {
                obj2 = null;
            }
        } else {
            obj2 = null;
        }
        if (obj2 == null) {
            return null;
        }
        return obj2;
    }

    @Override // java.util.Map
    public final int size() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzce
    public final zzbx zza() {
        return new zzcv(this.zzb, 1, this.zzc);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzce
    public final zzcf zzd() {
        return new zzct(this, this.zzb, 0, this.zzc);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzce
    public final zzcf zze() {
        return new zzcu(this, new zzcv(this.zzb, 0, this.zzc));
    }
}

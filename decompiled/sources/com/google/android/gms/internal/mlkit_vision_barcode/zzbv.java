package com.google.android.gms.internal.mlkit_vision_barcode;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: compiled from: com.google.android.gms:play-services-mlkit-barcode-scanning@@18.0.0 */
/* JADX INFO: loaded from: classes9.dex */
class zzbv extends zzbw {
    Object[] zza = new Object[4];
    int zzb = 0;
    boolean zzc;

    public zzbv(int i10) {
    }

    private final void zzd(int i10) {
        Object[] objArr = this.zza;
        int length = objArr.length;
        if (length >= i10) {
            if (this.zzc) {
                this.zza = (Object[]) objArr.clone();
                this.zzc = false;
                return;
            }
            return;
        }
        int i11 = length + (length >> 1) + 1;
        if (i11 < i10) {
            int iHighestOneBit = Integer.highestOneBit(i10 - 1);
            i11 = iHighestOneBit + iHighestOneBit;
        }
        if (i11 < 0) {
            i11 = Integer.MAX_VALUE;
        }
        this.zza = Arrays.copyOf(objArr, i11);
        this.zzc = false;
    }

    public final zzbv zza(Object obj) {
        obj.getClass();
        zzd(this.zzb + 1);
        Object[] objArr = this.zza;
        int i10 = this.zzb;
        this.zzb = i10 + 1;
        objArr[i10] = obj;
        return this;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzbw
    public /* bridge */ /* synthetic */ zzbw zzb(Object obj) {
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final zzbw zzc(Iterable iterable) {
        if (iterable instanceof Collection) {
            zzd(iterable.size() + this.zzb);
            if (iterable instanceof zzbx) {
                this.zzb = ((zzbx) iterable).zza(this.zza, this.zzb);
                return this;
            }
        }
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            zzb(it.next());
        }
        return this;
    }
}

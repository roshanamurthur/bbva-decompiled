package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import ad.d;
import androidx.datastore.preferences.protobuf.e;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* JADX INFO: compiled from: com.google.mlkit:barcode-scanning@@17.0.2 */
/* JADX INFO: loaded from: classes9.dex */
final class zzcq extends zzcm implements RandomAccess, zzft {
    private static final zzcq zza;
    private boolean[] zzb;
    private int zzc;

    static {
        zzcq zzcqVar = new zzcq(new boolean[0], 0);
        zza = zzcqVar;
        zzcqVar.zzb();
    }

    public zzcq() {
        this(new boolean[10], 0);
    }

    private final String zzf(int i10) {
        return d.d(35, "Index:", i10, ", Size:", this.zzc);
    }

    private final void zzg(int i10) {
        if (i10 < 0 || i10 >= this.zzc) {
            throw new IndexOutOfBoundsException(zzf(i10));
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzcm, java.util.AbstractList, java.util.List
    public final /* synthetic */ void add(int i10, Object obj) {
        int i11;
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        zza();
        if (i10 < 0 || i10 > (i11 = this.zzc)) {
            throw new IndexOutOfBoundsException(zzf(i10));
        }
        boolean[] zArr = this.zzb;
        if (i11 < zArr.length) {
            System.arraycopy(zArr, i10, zArr, i10 + 1, i11 - i10);
        } else {
            boolean[] zArr2 = new boolean[e.b(i11, 3, 2, 1)];
            System.arraycopy(zArr, 0, zArr2, 0, i10);
            System.arraycopy(this.zzb, i10, zArr2, i10 + 1, this.zzc - i10);
            this.zzb = zArr2;
        }
        this.zzb[i10] = zBooleanValue;
        this.zzc++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzcm, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        zza();
        zzel.zze(collection);
        if (!(collection instanceof zzcq)) {
            return super.addAll(collection);
        }
        zzcq zzcqVar = (zzcq) collection;
        int i10 = zzcqVar.zzc;
        if (i10 == 0) {
            return false;
        }
        int i11 = this.zzc;
        if (Integer.MAX_VALUE - i11 < i10) {
            throw new OutOfMemoryError();
        }
        int i12 = i11 + i10;
        boolean[] zArr = this.zzb;
        if (i12 > zArr.length) {
            this.zzb = Arrays.copyOf(zArr, i12);
        }
        System.arraycopy(zzcqVar.zzb, 0, this.zzb, this.zzc, zzcqVar.zzc);
        this.zzc = i12;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzcm, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzcq)) {
            return super.equals(obj);
        }
        zzcq zzcqVar = (zzcq) obj;
        if (this.zzc != zzcqVar.zzc) {
            return false;
        }
        boolean[] zArr = zzcqVar.zzb;
        for (int i10 = 0; i10 < this.zzc; i10++) {
            if (this.zzb[i10] != zArr[i10]) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i10) {
        zzg(i10);
        return Boolean.valueOf(this.zzb[i10]);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzcm, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int iZza = 1;
        for (int i10 = 0; i10 < this.zzc; i10++) {
            iZza = (iZza * 31) + zzel.zza(this.zzb[i10]);
        }
        return iZza;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Boolean)) {
            return -1;
        }
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        int i10 = this.zzc;
        for (int i11 = 0; i11 < i10; i11++) {
            if (this.zzb[i11] == zBooleanValue) {
                return i11;
            }
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzcm, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i10) {
        zza();
        zzg(i10);
        boolean[] zArr = this.zzb;
        boolean z10 = zArr[i10];
        int i11 = this.zzc;
        if (i10 < i11 - 1) {
            System.arraycopy(zArr, i10 + 1, zArr, i10, (i11 - i10) - 1);
        }
        this.zzc--;
        ((AbstractList) this).modCount++;
        return Boolean.valueOf(z10);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i10, int i11) {
        zza();
        if (i11 < i10) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        boolean[] zArr = this.zzb;
        System.arraycopy(zArr, i11, zArr, i10, this.zzc - i11);
        this.zzc -= i11 - i10;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzcm, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i10, Object obj) {
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        zza();
        zzg(i10);
        boolean[] zArr = this.zzb;
        boolean z10 = zArr[i10];
        zArr[i10] = zBooleanValue;
        return Boolean.valueOf(z10);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzek
    public final /* bridge */ /* synthetic */ zzek zzd(int i10) {
        if (i10 >= this.zzc) {
            return new zzcq(Arrays.copyOf(this.zzb, i10), this.zzc);
        }
        throw new IllegalArgumentException();
    }

    public final void zze(boolean z10) {
        zza();
        int i10 = this.zzc;
        boolean[] zArr = this.zzb;
        if (i10 == zArr.length) {
            boolean[] zArr2 = new boolean[e.b(i10, 3, 2, 1)];
            System.arraycopy(zArr, 0, zArr2, 0, i10);
            this.zzb = zArr2;
        }
        boolean[] zArr3 = this.zzb;
        int i11 = this.zzc;
        this.zzc = i11 + 1;
        zArr3[i11] = z10;
    }

    private zzcq(boolean[] zArr, int i10) {
        this.zzb = zArr;
        this.zzc = i10;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzcm, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        zze(((Boolean) obj).booleanValue());
        return true;
    }
}

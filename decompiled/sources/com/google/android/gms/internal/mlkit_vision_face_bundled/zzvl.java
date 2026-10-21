package com.google.android.gms.internal.mlkit_vision_face_bundled;

import androidx.camera.camera2.internal.n1;
import androidx.datastore.preferences.protobuf.e;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* JADX INFO: compiled from: com.google.mlkit:face-detection@@16.1.7 */
/* JADX INFO: loaded from: classes9.dex */
final class zzvl extends zzth implements RandomAccess {
    private long[] zza;
    private int zzb;

    static {
        new zzvl(new long[0], 0, false);
    }

    public zzvl() {
        this(new long[10], 0, true);
    }

    private final String zzg(int i10) {
        return n1.e("Index:", i10, ", Size:", this.zzb);
    }

    private final void zzh(int i10) {
        if (i10 < 0 || i10 >= this.zzb) {
            throw new IndexOutOfBoundsException(zzg(i10));
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_face_bundled.zzth, java.util.AbstractList, java.util.List
    public final /* synthetic */ void add(int i10, Object obj) {
        int i11;
        long jLongValue = ((Long) obj).longValue();
        zza();
        if (i10 < 0 || i10 > (i11 = this.zzb)) {
            throw new IndexOutOfBoundsException(zzg(i10));
        }
        int i12 = i10 + 1;
        long[] jArr = this.zza;
        if (i11 < jArr.length) {
            System.arraycopy(jArr, i10, jArr, i12, i11 - i10);
        } else {
            long[] jArr2 = new long[e.b(i11, 3, 2, 1)];
            System.arraycopy(jArr, 0, jArr2, 0, i10);
            System.arraycopy(this.zza, i10, jArr2, i12, this.zzb - i10);
            this.zza = jArr2;
        }
        this.zza[i10] = jLongValue;
        this.zzb++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_face_bundled.zzth, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        zza();
        byte[] bArr = zzvc.zzb;
        collection.getClass();
        if (!(collection instanceof zzvl)) {
            return super.addAll(collection);
        }
        zzvl zzvlVar = (zzvl) collection;
        int i10 = zzvlVar.zzb;
        if (i10 == 0) {
            return false;
        }
        int i11 = this.zzb;
        if (Integer.MAX_VALUE - i11 < i10) {
            throw new OutOfMemoryError();
        }
        int i12 = i11 + i10;
        long[] jArr = this.zza;
        if (i12 > jArr.length) {
            this.zza = Arrays.copyOf(jArr, i12);
        }
        System.arraycopy(zzvlVar.zza, 0, this.zza, this.zzb, zzvlVar.zzb);
        this.zzb = i12;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_face_bundled.zzth, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzvl)) {
            return super.equals(obj);
        }
        zzvl zzvlVar = (zzvl) obj;
        if (this.zzb != zzvlVar.zzb) {
            return false;
        }
        long[] jArr = zzvlVar.zza;
        for (int i10 = 0; i10 < this.zzb; i10++) {
            if (this.zza[i10] != jArr[i10]) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i10) {
        zzh(i10);
        return Long.valueOf(this.zza[i10]);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_face_bundled.zzth, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i10 = 1;
        for (int i11 = 0; i11 < this.zzb; i11++) {
            long j10 = this.zza[i11];
            byte[] bArr = zzvc.zzb;
            i10 = (i10 * 31) + ((int) (j10 ^ (j10 >>> 32)));
        }
        return i10;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Long)) {
            return -1;
        }
        long jLongValue = ((Long) obj).longValue();
        int i10 = this.zzb;
        for (int i11 = 0; i11 < i10; i11++) {
            if (this.zza[i11] == jLongValue) {
                return i11;
            }
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_face_bundled.zzth, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i10) {
        zza();
        zzh(i10);
        long[] jArr = this.zza;
        long j10 = jArr[i10];
        int i11 = this.zzb;
        if (i10 < i11 - 1) {
            System.arraycopy(jArr, i10 + 1, jArr, i10, (i11 - i10) - 1);
        }
        this.zzb--;
        ((AbstractList) this).modCount++;
        return Long.valueOf(j10);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i10, int i11) {
        zza();
        if (i11 < i10) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        long[] jArr = this.zza;
        System.arraycopy(jArr, i11, jArr, i10, this.zzb - i11);
        this.zzb -= i11 - i10;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_face_bundled.zzth, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i10, Object obj) {
        long jLongValue = ((Long) obj).longValue();
        zza();
        zzh(i10);
        long[] jArr = this.zza;
        long j10 = jArr[i10];
        jArr[i10] = jLongValue;
        return Long.valueOf(j10);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_face_bundled.zzvb
    public final /* bridge */ /* synthetic */ zzvb zzd(int i10) {
        if (i10 >= this.zzb) {
            return new zzvl(Arrays.copyOf(this.zza, i10), this.zzb, true);
        }
        throw new IllegalArgumentException();
    }

    public final long zze(int i10) {
        zzh(i10);
        return this.zza[i10];
    }

    public final void zzf(long j10) {
        zza();
        int i10 = this.zzb;
        long[] jArr = this.zza;
        if (i10 == jArr.length) {
            long[] jArr2 = new long[e.b(i10, 3, 2, 1)];
            System.arraycopy(jArr, 0, jArr2, 0, i10);
            this.zza = jArr2;
        }
        long[] jArr3 = this.zza;
        int i11 = this.zzb;
        this.zzb = i11 + 1;
        jArr3[i11] = j10;
    }

    private zzvl(long[] jArr, int i10, boolean z10) {
        super(z10);
        this.zza = jArr;
        this.zzb = i10;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_face_bundled.zzth, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        zzf(((Long) obj).longValue());
        return true;
    }
}

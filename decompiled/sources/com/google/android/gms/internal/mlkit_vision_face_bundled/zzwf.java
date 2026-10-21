package com.google.android.gms.internal.mlkit_vision_face_bundled;

import androidx.camera.camera2.internal.n1;
import androidx.datastore.preferences.protobuf.e;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.RandomAccess;

/* JADX INFO: compiled from: com.google.mlkit:face-detection@@16.1.7 */
/* JADX INFO: loaded from: classes9.dex */
final class zzwf extends zzth implements RandomAccess {
    private static final zzwf zza = new zzwf(new Object[0], 0, false);
    private Object[] zzb;
    private int zzc;

    public zzwf() {
        this(new Object[10], 0, true);
    }

    public static zzwf zze() {
        return zza;
    }

    private final String zzf(int i10) {
        return n1.e("Index:", i10, ", Size:", this.zzc);
    }

    private final void zzg(int i10) {
        if (i10 < 0 || i10 >= this.zzc) {
            throw new IndexOutOfBoundsException(zzf(i10));
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_face_bundled.zzth, java.util.AbstractList, java.util.List
    public final void add(int i10, Object obj) {
        int i11;
        zza();
        if (i10 < 0 || i10 > (i11 = this.zzc)) {
            throw new IndexOutOfBoundsException(zzf(i10));
        }
        int i12 = i10 + 1;
        Object[] objArr = this.zzb;
        if (i11 < objArr.length) {
            System.arraycopy(objArr, i10, objArr, i12, i11 - i10);
        } else {
            Object[] objArr2 = new Object[e.b(i11, 3, 2, 1)];
            System.arraycopy(objArr, 0, objArr2, 0, i10);
            System.arraycopy(this.zzb, i10, objArr2, i12, this.zzc - i10);
            this.zzb = objArr2;
        }
        this.zzb[i10] = obj;
        this.zzc++;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i10) {
        zzg(i10);
        return this.zzb[i10];
    }

    @Override // com.google.android.gms.internal.mlkit_vision_face_bundled.zzth, java.util.AbstractList, java.util.List
    public final Object remove(int i10) {
        zza();
        zzg(i10);
        Object[] objArr = this.zzb;
        Object obj = objArr[i10];
        int i11 = this.zzc;
        if (i10 < i11 - 1) {
            System.arraycopy(objArr, i10 + 1, objArr, i10, (i11 - i10) - 1);
        }
        this.zzc--;
        ((AbstractList) this).modCount++;
        return obj;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_face_bundled.zzth, java.util.AbstractList, java.util.List
    public final Object set(int i10, Object obj) {
        zza();
        zzg(i10);
        Object[] objArr = this.zzb;
        Object obj2 = objArr[i10];
        objArr[i10] = obj;
        ((AbstractList) this).modCount++;
        return obj2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_face_bundled.zzvb
    public final /* bridge */ /* synthetic */ zzvb zzd(int i10) {
        if (i10 >= this.zzc) {
            return new zzwf(Arrays.copyOf(this.zzb, i10), this.zzc, true);
        }
        throw new IllegalArgumentException();
    }

    private zzwf(Object[] objArr, int i10, boolean z10) {
        super(z10);
        this.zzb = objArr;
        this.zzc = i10;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_face_bundled.zzth, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        zza();
        int i10 = this.zzc;
        Object[] objArr = this.zzb;
        if (i10 == objArr.length) {
            this.zzb = Arrays.copyOf(objArr, ((i10 * 3) / 2) + 1);
        }
        Object[] objArr2 = this.zzb;
        int i11 = this.zzc;
        this.zzc = i11 + 1;
        objArr2[i11] = obj;
        ((AbstractList) this).modCount++;
        return true;
    }
}

package com.google.android.gms.internal.mlkit_vision_face_bundled;

import androidx.camera.camera2.internal.n1;
import androidx.datastore.preferences.protobuf.e;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* JADX INFO: compiled from: com.google.mlkit:face-detection@@16.1.7 */
/* JADX INFO: loaded from: classes9.dex */
final class zzuo extends zzth implements RandomAccess {
    private float[] zza;
    private int zzb;

    static {
        new zzuo(new float[0], 0, false);
    }

    public zzuo() {
        this(new float[10], 0, true);
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
        float fFloatValue = ((Float) obj).floatValue();
        zza();
        if (i10 < 0 || i10 > (i11 = this.zzb)) {
            throw new IndexOutOfBoundsException(zzg(i10));
        }
        int i12 = i10 + 1;
        float[] fArr = this.zza;
        if (i11 < fArr.length) {
            System.arraycopy(fArr, i10, fArr, i12, i11 - i10);
        } else {
            float[] fArr2 = new float[e.b(i11, 3, 2, 1)];
            System.arraycopy(fArr, 0, fArr2, 0, i10);
            System.arraycopy(this.zza, i10, fArr2, i12, this.zzb - i10);
            this.zza = fArr2;
        }
        this.zza[i10] = fFloatValue;
        this.zzb++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_face_bundled.zzth, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        zza();
        byte[] bArr = zzvc.zzb;
        collection.getClass();
        if (!(collection instanceof zzuo)) {
            return super.addAll(collection);
        }
        zzuo zzuoVar = (zzuo) collection;
        int i10 = zzuoVar.zzb;
        if (i10 == 0) {
            return false;
        }
        int i11 = this.zzb;
        if (Integer.MAX_VALUE - i11 < i10) {
            throw new OutOfMemoryError();
        }
        int i12 = i11 + i10;
        float[] fArr = this.zza;
        if (i12 > fArr.length) {
            this.zza = Arrays.copyOf(fArr, i12);
        }
        System.arraycopy(zzuoVar.zza, 0, this.zza, this.zzb, zzuoVar.zzb);
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
        if (!(obj instanceof zzuo)) {
            return super.equals(obj);
        }
        zzuo zzuoVar = (zzuo) obj;
        if (this.zzb != zzuoVar.zzb) {
            return false;
        }
        float[] fArr = zzuoVar.zza;
        for (int i10 = 0; i10 < this.zzb; i10++) {
            if (Float.floatToIntBits(this.zza[i10]) != Float.floatToIntBits(fArr[i10])) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i10) {
        zzh(i10);
        return Float.valueOf(this.zza[i10]);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_face_bundled.zzth, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int iFloatToIntBits = 1;
        for (int i10 = 0; i10 < this.zzb; i10++) {
            iFloatToIntBits = (iFloatToIntBits * 31) + Float.floatToIntBits(this.zza[i10]);
        }
        return iFloatToIntBits;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Float)) {
            return -1;
        }
        float fFloatValue = ((Float) obj).floatValue();
        int i10 = this.zzb;
        for (int i11 = 0; i11 < i10; i11++) {
            if (this.zza[i11] == fFloatValue) {
                return i11;
            }
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_face_bundled.zzth, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i10) {
        zza();
        zzh(i10);
        float[] fArr = this.zza;
        float f6 = fArr[i10];
        int i11 = this.zzb;
        if (i10 < i11 - 1) {
            System.arraycopy(fArr, i10 + 1, fArr, i10, (i11 - i10) - 1);
        }
        this.zzb--;
        ((AbstractList) this).modCount++;
        return Float.valueOf(f6);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i10, int i11) {
        zza();
        if (i11 < i10) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        float[] fArr = this.zza;
        System.arraycopy(fArr, i11, fArr, i10, this.zzb - i11);
        this.zzb -= i11 - i10;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_face_bundled.zzth, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i10, Object obj) {
        float fFloatValue = ((Float) obj).floatValue();
        zza();
        zzh(i10);
        float[] fArr = this.zza;
        float f6 = fArr[i10];
        fArr[i10] = fFloatValue;
        return Float.valueOf(f6);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_face_bundled.zzvb
    public final /* bridge */ /* synthetic */ zzvb zzd(int i10) {
        if (i10 >= this.zzb) {
            return new zzuo(Arrays.copyOf(this.zza, i10), this.zzb, true);
        }
        throw new IllegalArgumentException();
    }

    public final float zze(int i10) {
        zzh(i10);
        return this.zza[i10];
    }

    public final void zzf(float f6) {
        zza();
        int i10 = this.zzb;
        float[] fArr = this.zza;
        if (i10 == fArr.length) {
            float[] fArr2 = new float[e.b(i10, 3, 2, 1)];
            System.arraycopy(fArr, 0, fArr2, 0, i10);
            this.zza = fArr2;
        }
        float[] fArr3 = this.zza;
        int i11 = this.zzb;
        this.zzb = i11 + 1;
        fArr3[i11] = f6;
    }

    private zzuo(float[] fArr, int i10, boolean z10) {
        super(z10);
        this.zza = fArr;
        this.zzb = i10;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_face_bundled.zzth, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        zzf(((Float) obj).floatValue());
        return true;
    }
}

package com.google.android.gms.internal.wearable;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
final class zzq implements Cloneable {
    private Object value;
    private zzo<?, ?> zzhi;
    private List<zzv> zzhj = new ArrayList();

    private final byte[] toByteArray() throws IOException {
        byte[] bArr = new byte[zzg()];
        zza(zzl.zzb(bArr));
        return bArr;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: zzt, reason: merged with bridge method [inline-methods] */
    public final zzq clone() {
        zzq zzqVar = new zzq();
        try {
            zzqVar.zzhi = this.zzhi;
            List<zzv> list = this.zzhj;
            if (list == null) {
                zzqVar.zzhj = null;
            } else {
                zzqVar.zzhj.addAll(list);
            }
            Object obj = this.value;
            if (obj != null) {
                if (obj instanceof zzt) {
                    zzqVar.value = (zzt) ((zzt) obj).clone();
                } else if (obj instanceof byte[]) {
                    zzqVar.value = ((byte[]) obj).clone();
                } else {
                    int i10 = 0;
                    if (obj instanceof byte[][]) {
                        byte[][] bArr = (byte[][]) obj;
                        byte[][] bArr2 = new byte[bArr.length][];
                        zzqVar.value = bArr2;
                        while (i10 < bArr.length) {
                            bArr2[i10] = (byte[]) bArr[i10].clone();
                            i10++;
                        }
                    } else if (obj instanceof boolean[]) {
                        zzqVar.value = ((boolean[]) obj).clone();
                    } else if (obj instanceof int[]) {
                        zzqVar.value = ((int[]) obj).clone();
                    } else if (obj instanceof long[]) {
                        zzqVar.value = ((long[]) obj).clone();
                    } else if (obj instanceof float[]) {
                        zzqVar.value = ((float[]) obj).clone();
                    } else if (obj instanceof double[]) {
                        zzqVar.value = ((double[]) obj).clone();
                    } else if (obj instanceof zzt[]) {
                        zzt[] zztVarArr = (zzt[]) obj;
                        zzt[] zztVarArr2 = new zzt[zztVarArr.length];
                        zzqVar.value = zztVarArr2;
                        while (i10 < zztVarArr.length) {
                            zztVarArr2[i10] = (zzt) zztVarArr[i10].clone();
                            i10++;
                        }
                    }
                }
            }
            return zzqVar;
        } catch (CloneNotSupportedException e5) {
            throw new AssertionError(e5);
        }
    }

    public final boolean equals(Object obj) {
        List<zzv> list;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzq)) {
            return false;
        }
        zzq zzqVar = (zzq) obj;
        if (this.value == null || zzqVar.value == null) {
            List<zzv> list2 = this.zzhj;
            if (list2 != null && (list = zzqVar.zzhj) != null) {
                return list2.equals(list);
            }
            try {
                return Arrays.equals(toByteArray(), zzqVar.toByteArray());
            } catch (IOException e5) {
                throw new IllegalStateException(e5);
            }
        }
        zzo<?, ?> zzoVar = this.zzhi;
        if (zzoVar != zzqVar.zzhi) {
            return false;
        }
        if (!zzoVar.zzhd.isArray()) {
            return this.value.equals(zzqVar.value);
        }
        Object obj2 = this.value;
        if (obj2 instanceof byte[]) {
            return Arrays.equals((byte[]) obj2, (byte[]) zzqVar.value);
        }
        if (obj2 instanceof int[]) {
            return Arrays.equals((int[]) obj2, (int[]) zzqVar.value);
        }
        if (obj2 instanceof long[]) {
            return Arrays.equals((long[]) obj2, (long[]) zzqVar.value);
        }
        if (obj2 instanceof float[]) {
            return Arrays.equals((float[]) obj2, (float[]) zzqVar.value);
        }
        if (obj2 instanceof double[]) {
            return Arrays.equals((double[]) obj2, (double[]) zzqVar.value);
        }
        return obj2 instanceof boolean[] ? Arrays.equals((boolean[]) obj2, (boolean[]) zzqVar.value) : Arrays.deepEquals((Object[]) obj2, (Object[]) zzqVar.value);
    }

    public final int hashCode() {
        try {
            return Arrays.hashCode(toByteArray()) + 527;
        } catch (IOException e5) {
            throw new IllegalStateException(e5);
        }
    }

    public final void zza(zzv zzvVar) throws IOException {
        List<zzv> list = this.zzhj;
        if (list != null) {
            list.add(zzvVar);
            return;
        }
        Object obj = this.value;
        if (!(obj instanceof zzt)) {
            if (obj instanceof zzt[]) {
                Collections.singletonList(zzvVar);
                throw new NoSuchMethodError();
            }
            Collections.singletonList(zzvVar);
            throw new NoSuchMethodError();
        }
        byte[] bArr = zzvVar.zzhm;
        zzk zzkVarZza = zzk.zza(bArr, 0, bArr.length);
        int iZzk = zzkVarZza.zzk();
        if (iZzk != bArr.length - zzl.zzi(iZzk)) {
            throw zzs.zzu();
        }
        zzt zztVarZza = ((zzt) this.value).zza(zzkVarZza);
        this.zzhi = this.zzhi;
        this.value = zztVarZza;
        this.zzhj = null;
    }

    public final int zzg() {
        if (this.value != null) {
            throw new NoSuchMethodError();
        }
        int iZzm = 0;
        for (zzv zzvVar : this.zzhj) {
            iZzm += zzl.zzm(zzvVar.tag) + zzvVar.zzhm.length;
        }
        return iZzm;
    }

    public final void zza(zzl zzlVar) throws IOException {
        if (this.value == null) {
            for (zzv zzvVar : this.zzhj) {
                zzlVar.zzl(zzvVar.tag);
                zzlVar.zzc(zzvVar.zzhm);
            }
            return;
        }
        throw new NoSuchMethodError();
    }
}

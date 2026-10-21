package com.google.android.gms.internal.measurement;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-base@@20.1.0 */
/* JADX INFO: loaded from: classes9.dex */
public final class zzkl extends zzii implements RandomAccess, zzkm {
    public static final zzkm zza;
    private static final zzkl zzb;
    private final List zzc;

    static {
        zzkl zzklVar = new zzkl(10);
        zzb = zzklVar;
        zzklVar.zzb();
        zza = zzklVar;
    }

    public zzkl() {
        this(10);
    }

    private static String zzj(Object obj) {
        if (obj instanceof String) {
            return (String) obj;
        }
        return obj instanceof zzix ? ((zzix) obj).zzn(zzkf.zzb) : zzkf.zzh((byte[]) obj);
    }

    @Override // com.google.android.gms.internal.measurement.zzii, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ void add(int i10, Object obj) {
        zzbK();
        this.zzc.add(i10, (String) obj);
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.measurement.zzii, java.util.AbstractList, java.util.List
    public final boolean addAll(int i10, Collection collection) {
        zzbK();
        if (collection instanceof zzkm) {
            collection = ((zzkm) collection).zzh();
        }
        boolean zAddAll = this.zzc.addAll(i10, collection);
        ((AbstractList) this).modCount++;
        return zAddAll;
    }

    @Override // com.google.android.gms.internal.measurement.zzii, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        zzbK();
        this.zzc.clear();
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.measurement.zzii, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i10) {
        zzbK();
        Object objRemove = this.zzc.remove(i10);
        ((AbstractList) this).modCount++;
        return zzj(objRemove);
    }

    @Override // com.google.android.gms.internal.measurement.zzii, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i10, Object obj) {
        zzbK();
        return zzj(this.zzc.set(i10, (String) obj));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zzc.size();
    }

    @Override // com.google.android.gms.internal.measurement.zzke
    public final /* bridge */ /* synthetic */ zzke zzd(int i10) {
        if (i10 < size()) {
            throw new IllegalArgumentException();
        }
        ArrayList arrayList = new ArrayList(i10);
        arrayList.addAll(this.zzc);
        return new zzkl(arrayList);
    }

    @Override // com.google.android.gms.internal.measurement.zzkm
    public final zzkm zze() {
        return zzc() ? new zzmg(this) : this;
    }

    @Override // com.google.android.gms.internal.measurement.zzkm
    public final Object zzf(int i10) {
        return this.zzc.get(i10);
    }

    @Override // java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: zzg, reason: merged with bridge method [inline-methods] */
    public final String get(int i10) {
        Object obj = this.zzc.get(i10);
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof zzix) {
            zzix zzixVar = (zzix) obj;
            String strZzn = zzixVar.zzn(zzkf.zzb);
            if (zzixVar.zzi()) {
                this.zzc.set(i10, strZzn);
            }
            return strZzn;
        }
        byte[] bArr = (byte[]) obj;
        String strZzh = zzkf.zzh(bArr);
        if (zzkf.zzi(bArr)) {
            this.zzc.set(i10, strZzh);
        }
        return strZzh;
    }

    @Override // com.google.android.gms.internal.measurement.zzkm
    public final List zzh() {
        return Collections.unmodifiableList(this.zzc);
    }

    @Override // com.google.android.gms.internal.measurement.zzkm
    public final void zzi(zzix zzixVar) {
        zzbK();
        this.zzc.add(zzixVar);
        ((AbstractList) this).modCount++;
    }

    public zzkl(int i10) {
        this.zzc = new ArrayList(i10);
    }

    private zzkl(ArrayList arrayList) {
        this.zzc = arrayList;
    }

    @Override // com.google.android.gms.internal.measurement.zzii, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        return addAll(size(), collection);
    }
}

package com.google.android.gms.internal.measurement;

import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-base@@20.1.0 */
/* JADX INFO: loaded from: classes9.dex */
public final class zzmg extends AbstractList implements RandomAccess, zzkm {
    private final zzkm zza;

    public zzmg(zzkm zzkmVar) {
        this.zza = zzkmVar;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object get(int i10) {
        return ((zzkl) this.zza).get(i10);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return new zzmf(this);
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i10) {
        return new zzme(this, i10);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zza.size();
    }

    @Override // com.google.android.gms.internal.measurement.zzkm
    public final Object zzf(int i10) {
        return this.zza.zzf(i10);
    }

    @Override // com.google.android.gms.internal.measurement.zzkm
    public final List zzh() {
        return this.zza.zzh();
    }

    @Override // com.google.android.gms.internal.measurement.zzkm
    public final void zzi(zzix zzixVar) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.android.gms.internal.measurement.zzkm
    public final zzkm zze() {
        return this;
    }
}

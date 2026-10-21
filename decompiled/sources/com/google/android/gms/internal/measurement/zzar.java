package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement@@20.1.0 */
/* JADX INFO: loaded from: classes9.dex */
final class zzar implements Iterator {
    final /* synthetic */ zzat zza;
    private int zzb = 0;

    public zzar(zzat zzatVar) {
        this.zza = zzatVar;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.zzb < this.zza.zza.length();
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        int i10 = this.zzb;
        if (i10 >= this.zza.zza.length()) {
            throw new NoSuchElementException();
        }
        this.zzb = i10 + 1;
        return new zzat(String.valueOf(i10));
    }
}

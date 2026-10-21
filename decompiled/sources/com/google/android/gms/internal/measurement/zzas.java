package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement@@20.1.0 */
/* JADX INFO: loaded from: classes9.dex */
final class zzas implements Iterator {
    final /* synthetic */ zzat zza;
    private int zzb = 0;

    public zzas(zzat zzatVar) {
        this.zza = zzatVar;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.zzb < this.zza.zza.length();
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        int i10 = this.zzb;
        zzat zzatVar = this.zza;
        if (i10 >= zzatVar.zza.length()) {
            throw new NoSuchElementException();
        }
        String str = zzatVar.zza;
        this.zzb = i10 + 1;
        return new zzat(String.valueOf(str.charAt(i10)));
    }
}

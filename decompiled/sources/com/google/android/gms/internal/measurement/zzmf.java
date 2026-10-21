package com.google.android.gms.internal.measurement;

import java.util.Iterator;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-base@@20.1.0 */
/* JADX INFO: loaded from: classes9.dex */
final class zzmf implements Iterator {
    final Iterator zza;
    final /* synthetic */ zzmg zzb;

    public zzmf(zzmg zzmgVar) {
        this.zzb = zzmgVar;
        this.zza = zzmgVar.zza.iterator();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.zza.hasNext();
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        return (String) this.zza.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}

package com.google.android.gms.internal.measurement;

import androidx.camera.core.imagecapture.a;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement@@20.1.0 */
/* JADX INFO: loaded from: classes9.dex */
final class zzad implements Iterator {
    final /* synthetic */ zzae zza;
    private int zzb = 0;

    public zzad(zzae zzaeVar) {
        this.zza = zzaeVar;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.zzb < this.zza.zzc();
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        if (this.zzb >= this.zza.zzc()) {
            throw new NoSuchElementException(a.a(32, "Out of bounds index: ", this.zzb));
        }
        zzae zzaeVar = this.zza;
        int i10 = this.zzb;
        this.zzb = i10 + 1;
        return zzaeVar.zze(i10);
    }
}

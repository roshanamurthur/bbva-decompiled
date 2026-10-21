package com.google.android.gms.internal.mlkit_vision_face_bundled;

import java.util.NoSuchElementException;

/* JADX INFO: compiled from: com.google.mlkit:face-detection@@16.1.7 */
/* JADX INFO: loaded from: classes9.dex */
final class zztn extends zzto {
    final /* synthetic */ zztu zza;
    private int zzb = 0;
    private final int zzc;

    public zztn(zztu zztuVar) {
        this.zza = zztuVar;
        this.zzc = zztuVar.zzd();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.zzb < this.zzc;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_face_bundled.zztq
    public final byte zza() {
        int i10 = this.zzb;
        if (i10 >= this.zzc) {
            throw new NoSuchElementException();
        }
        this.zzb = i10 + 1;
        return this.zza.zzb(i10);
    }
}

package com.google.android.gms.internal.mlkit_vision_face_bundled;

import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.Objects;

/* JADX INFO: compiled from: com.google.mlkit:face-detection@@16.1.7 */
/* JADX INFO: loaded from: classes9.dex */
final class zzbc extends zzau {
    private final transient Object[] zza;
    private final transient int zzb;
    private final transient int zzc = 1;

    public zzbc(Object[] objArr, int i10, int i11) {
        this.zza = objArr;
        this.zzb = i10;
    }

    @Override // java.util.List
    public final Object get(int i10) {
        zzak.zza(i10, this.zzc, FirebaseAnalytics.Param.INDEX);
        Object obj = this.zza[i10 + i10 + this.zzb];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zzc;
    }
}

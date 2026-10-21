package com.google.android.gms.internal.mlkit_vision_face_bundled;

import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.AbstractMap;
import java.util.Objects;

/* JADX INFO: compiled from: com.google.mlkit:face-detection@@16.1.7 */
/* JADX INFO: loaded from: classes9.dex */
final class zzaz extends zzau {
    final /* synthetic */ zzba zza;

    public zzaz(zzba zzbaVar) {
        this.zza = zzbaVar;
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ Object get(int i10) {
        zzak.zza(i10, this.zza.zzc, FirebaseAnalytics.Param.INDEX);
        int i11 = i10 + i10;
        Object obj = this.zza.zzb[i11];
        Objects.requireNonNull(obj);
        Object obj2 = this.zza.zzb[i11 + 1];
        Objects.requireNonNull(obj2);
        return new AbstractMap.SimpleImmutableEntry(obj, obj2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zza.zzc;
    }
}

package com.google.android.gms.internal.mlkit_vision_face;

import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.AbstractMap;

/* JADX INFO: compiled from: com.google.android.gms:play-services-mlkit-face-detection@@17.1.0 */
/* JADX INFO: loaded from: classes9.dex */
final class zzcd extends zzbn {
    final /* synthetic */ zzce zza;

    public zzcd(zzce zzceVar) {
        this.zza = zzceVar;
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ Object get(int i10) {
        zzab.zza(i10, this.zza.zzc, FirebaseAnalytics.Param.INDEX);
        zzce zzceVar = this.zza;
        int i11 = i10 + i10;
        Object obj = zzceVar.zzb[i11];
        obj.getClass();
        Object obj2 = zzceVar.zzb[i11 + 1];
        obj2.getClass();
        return new AbstractMap.SimpleImmutableEntry(obj, obj2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zza.zzc;
    }
}

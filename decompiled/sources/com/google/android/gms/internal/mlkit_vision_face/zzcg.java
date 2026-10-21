package com.google.android.gms.internal.mlkit_vision_face;

import com.google.firebase.analytics.FirebaseAnalytics;

/* JADX INFO: compiled from: com.google.android.gms:play-services-mlkit-face-detection@@17.1.0 */
/* JADX INFO: loaded from: classes9.dex */
final class zzcg extends zzbn {
    private final transient Object[] zza;
    private final transient int zzb;
    private final transient int zzc;

    public zzcg(Object[] objArr, int i10, int i11) {
        this.zza = objArr;
        this.zzb = i10;
        this.zzc = i11;
    }

    @Override // java.util.List
    public final Object get(int i10) {
        zzab.zza(i10, this.zzc, FirebaseAnalytics.Param.INDEX);
        Object obj = this.zza[i10 + i10 + this.zzb];
        obj.getClass();
        return obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zzc;
    }
}

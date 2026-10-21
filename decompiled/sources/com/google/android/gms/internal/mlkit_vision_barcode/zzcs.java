package com.google.android.gms.internal.mlkit_vision_barcode;

import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.AbstractMap;

/* JADX INFO: compiled from: com.google.android.gms:play-services-mlkit-barcode-scanning@@18.0.0 */
/* JADX INFO: loaded from: classes9.dex */
final class zzcs extends zzcc {
    final /* synthetic */ zzct zza;

    public zzcs(zzct zzctVar) {
        this.zza = zzctVar;
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ Object get(int i10) {
        zzaq.zza(i10, this.zza.zzc, FirebaseAnalytics.Param.INDEX);
        zzct zzctVar = this.zza;
        int i11 = i10 + i10;
        Object obj = zzctVar.zzb[i11];
        obj.getClass();
        Object obj2 = zzctVar.zzb[i11 + 1];
        obj2.getClass();
        return new AbstractMap.SimpleImmutableEntry(obj, obj2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zza.zzc;
    }
}

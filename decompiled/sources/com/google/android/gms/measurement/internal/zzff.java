package com.google.android.gms.measurement.internal;

import androidx.collection.LruCache;
import com.google.android.gms.common.internal.Preconditions;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement@@20.1.0 */
/* JADX INFO: loaded from: classes9.dex */
final class zzff extends LruCache {
    final /* synthetic */ zzfi zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzff(zzfi zzfiVar, int i10) {
        super(20);
        this.zza = zzfiVar;
    }

    @Override // androidx.collection.LruCache
    public final /* bridge */ /* synthetic */ Object create(Object obj) {
        String str = (String) obj;
        Preconditions.checkNotEmpty(str);
        return zzfi.zzd(this.zza, str);
    }
}

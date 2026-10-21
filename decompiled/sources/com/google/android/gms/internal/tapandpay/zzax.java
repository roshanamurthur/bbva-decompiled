package com.google.android.gms.internal.tapandpay;

import com.google.firebase.analytics.FirebaseAnalytics;

/* JADX INFO: compiled from: com.google.android.gms:play-services-tapandpay@@18.3.2 */
/* JADX INFO: loaded from: classes9.dex */
final class zzax extends zzat {
    static final zzat zza = new zzax(new Object[0], 0);
    final transient Object[] zzb;
    private final transient int zzc;

    public zzax(Object[] objArr, int i10) {
        this.zzb = objArr;
        this.zzc = i10;
    }

    @Override // java.util.List
    public final Object get(int i10) {
        zzam.zza(i10, this.zzc, FirebaseAnalytics.Param.INDEX);
        Object obj = this.zzb[i10];
        obj.getClass();
        return obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.tapandpay.zzat, com.google.android.gms.internal.tapandpay.zzaq
    public final int zza(Object[] objArr, int i10) {
        System.arraycopy(this.zzb, 0, objArr, 0, this.zzc);
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.tapandpay.zzaq
    public final int zzb() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.tapandpay.zzaq
    public final int zzc() {
        return 0;
    }

    @Override // com.google.android.gms.internal.tapandpay.zzaq
    public final Object[] zze() {
        return this.zzb;
    }
}

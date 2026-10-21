package com.google.android.gms.internal.tapandpay;

/* JADX INFO: compiled from: com.google.android.gms:play-services-tapandpay@@18.3.2 */
/* JADX INFO: loaded from: classes9.dex */
final class zzar extends zzao {
    private final zzat zza;

    public zzar(zzat zzatVar, int i10) {
        super(zzatVar.size(), i10);
        this.zza = zzatVar;
    }

    @Override // com.google.android.gms.internal.tapandpay.zzao
    public final Object zza(int i10) {
        return this.zza.get(i10);
    }
}

package com.google.android.gms.internal.measurement;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-base@@20.1.0 */
/* JADX INFO: loaded from: classes9.dex */
final class zzlm implements zzkz {
    private final zzlc zza;
    private final String zzb;
    private final Object[] zzc;
    private final int zzd;

    public zzlm(zzlc zzlcVar, String str, Object[] objArr) {
        this.zza = zzlcVar;
        this.zzb = str;
        this.zzc = objArr;
        char cCharAt = str.charAt(0);
        if (cCharAt < 55296) {
            this.zzd = cCharAt;
            return;
        }
        int i10 = cCharAt & 8191;
        int i11 = 13;
        int i12 = 1;
        while (true) {
            int i13 = i12 + 1;
            char cCharAt2 = str.charAt(i12);
            if (cCharAt2 < 55296) {
                this.zzd = i10 | (cCharAt2 << i11);
                return;
            } else {
                i10 |= (cCharAt2 & 8191) << i11;
                i11 += 13;
                i12 = i13;
            }
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzkz
    public final zzlc zza() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.measurement.zzkz
    public final boolean zzb() {
        return (this.zzd & 2) == 2;
    }

    @Override // com.google.android.gms.internal.measurement.zzkz
    public final int zzc() {
        return (this.zzd & 1) == 1 ? 1 : 2;
    }

    public final String zzd() {
        return this.zzb;
    }

    public final Object[] zze() {
        return this.zzc;
    }
}

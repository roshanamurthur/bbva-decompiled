package com.google.android.gms.internal.measurement;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement@@20.1.0 */
/* JADX INFO: loaded from: classes9.dex */
public final class zzfp extends zzjt implements zzld {
    private zzfp() {
        super(zzfq.zza);
    }

    public final zzfp zza(long j10) {
        if (this.zzb) {
            zzaC();
            this.zzb = false;
        }
        zzfq.zzd((zzfq) this.zza, j10);
        return this;
    }

    public final zzfp zzb(String str) {
        if (this.zzb) {
            zzaC();
            this.zzb = false;
        }
        zzfq.zzc((zzfq) this.zza, str);
        return this;
    }

    public /* synthetic */ zzfp(zzff zzffVar) {
        super(zzfq.zza);
    }
}

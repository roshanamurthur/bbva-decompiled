package com.google.android.gms.internal.measurement;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement@@20.1.0 */
/* JADX INFO: loaded from: classes9.dex */
public final class zzge extends zzjt implements zzld {
    private zzge() {
        super(zzgf.zza);
    }

    public final zzge zza(Iterable iterable) {
        if (this.zzb) {
            zzaC();
            this.zzb = false;
        }
        zzgf.zzh((zzgf) this.zza, iterable);
        return this;
    }

    public final zzge zzb(int i10) {
        if (this.zzb) {
            zzaC();
            this.zzb = false;
        }
        zzgf.zzg((zzgf) this.zza, i10);
        return this;
    }

    public /* synthetic */ zzge(zzff zzffVar) {
        super(zzgf.zza);
    }
}

package com.google.android.gms.internal.measurement;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement@@20.1.0 */
/* JADX INFO: loaded from: classes9.dex */
public final class zzeg extends zzjt implements zzld {
    private zzeg() {
        super(zzeh.zza);
    }

    public final int zza() {
        return ((zzeh) this.zza).zzb();
    }

    public final int zzb() {
        return ((zzeh) this.zza).zzc();
    }

    public final zzeg zzc(int i10, zzei zzeiVar) {
        if (this.zzb) {
            zzaC();
            this.zzb = false;
        }
        zzeh.zzj((zzeh) this.zza, i10, (zzej) zzeiVar.zzay());
        return this;
    }

    public final zzeg zzd(int i10, zzer zzerVar) {
        if (this.zzb) {
            zzaC();
            this.zzb = false;
        }
        zzeh.zzi((zzeh) this.zza, i10, (zzes) zzerVar.zzay());
        return this;
    }

    public final zzej zze(int i10) {
        return ((zzeh) this.zza).zze(i10);
    }

    public final zzes zzf(int i10) {
        return ((zzeh) this.zza).zzf(i10);
    }

    public /* synthetic */ zzeg(zzef zzefVar) {
        super(zzeh.zza);
    }
}

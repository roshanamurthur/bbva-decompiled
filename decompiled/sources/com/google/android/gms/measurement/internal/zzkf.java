package com.google.android.gms.measurement.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement@@20.1.0 */
/* JADX INFO: loaded from: classes9.dex */
abstract class zzkf extends zzke {
    private boolean zza;

    public zzkf(zzkp zzkpVar) {
        super(zzkpVar);
        this.zzf.zzL();
    }

    public final void zzW() {
        if (!zzY()) {
            throw new IllegalStateException("Not initialized");
        }
    }

    public final void zzX() {
        if (this.zza) {
            throw new IllegalStateException("Can't initialize twice");
        }
        zzb();
        this.zzf.zzG();
        this.zza = true;
    }

    public final boolean zzY() {
        return this.zza;
    }

    public abstract boolean zzb();
}

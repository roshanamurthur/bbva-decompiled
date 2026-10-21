package com.google.android.gms.internal.measurement;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-base@@20.1.0 */
/* JADX INFO: loaded from: classes9.dex */
public class zzkk {
    private static final zzjj zzb = zzjj.zza();
    protected volatile zzlc zza;
    private volatile zzix zzc;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzkk)) {
            return false;
        }
        zzkk zzkkVar = (zzkk) obj;
        zzlc zzlcVar = this.zza;
        zzlc zzlcVar2 = zzkkVar.zza;
        if (zzlcVar == null && zzlcVar2 == null) {
            return zzb().equals(zzkkVar.zzb());
        }
        if (zzlcVar != null && zzlcVar2 != null) {
            return zzlcVar.equals(zzlcVar2);
        }
        if (zzlcVar != null) {
            zzkkVar.zzc(zzlcVar.zzbJ());
            return zzlcVar.equals(zzkkVar.zza);
        }
        zzc(zzlcVar2.zzbJ());
        return this.zza.equals(zzlcVar2);
    }

    public int hashCode() {
        return 1;
    }

    public final int zza() {
        if (this.zzc != null) {
            return ((zziv) this.zzc).zza.length;
        }
        if (this.zza != null) {
            return this.zza.zzbr();
        }
        return 0;
    }

    public final zzix zzb() {
        if (this.zzc != null) {
            return this.zzc;
        }
        synchronized (this) {
            try {
                if (this.zzc != null) {
                    return this.zzc;
                }
                if (this.zza == null) {
                    this.zzc = zzix.zzb;
                } else {
                    this.zzc = this.zza.zzbn();
                }
                return this.zzc;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void zzc(zzlc zzlcVar) {
        if (this.zza != null) {
            return;
        }
        synchronized (this) {
            if (this.zza == null) {
                try {
                    this.zza = zzlcVar;
                    this.zzc = zzix.zzb;
                } catch (zzkh unused) {
                    this.zza = zzlcVar;
                    this.zzc = zzix.zzb;
                }
            }
        }
    }
}

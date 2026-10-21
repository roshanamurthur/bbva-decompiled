package com.google.android.gms.internal.wearable;

import java.io.IOException;

/* JADX INFO: loaded from: classes9.dex */
public final class zzh extends zzn<zzh> {
    private static volatile zzh[] zzfz;
    public String name = "";
    public zzi zzga = null;

    public zzh() {
        this.zzhc = null;
        this.zzhl = -1;
    }

    public static zzh[] zzh() {
        if (zzfz == null) {
            synchronized (zzr.zzhk) {
                try {
                    if (zzfz == null) {
                        zzfz = new zzh[0];
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return zzfz;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzh)) {
            return false;
        }
        zzh zzhVar = (zzh) obj;
        String str = this.name;
        if (str == null) {
            if (zzhVar.name != null) {
                return false;
            }
        } else if (!str.equals(zzhVar.name)) {
            return false;
        }
        zzi zziVar = this.zzga;
        if (zziVar == null) {
            if (zzhVar.zzga != null) {
                return false;
            }
        } else if (!zziVar.equals(zzhVar.zzga)) {
            return false;
        }
        zzp zzpVar = this.zzhc;
        if (zzpVar != null && !zzpVar.isEmpty()) {
            return this.zzhc.equals(zzhVar.zzhc);
        }
        zzp zzpVar2 = zzhVar.zzhc;
        return zzpVar2 == null || zzpVar2.isEmpty();
    }

    public final int hashCode() {
        String str = this.name;
        int iHashCode = 0;
        int iHashCode2 = 1588755189 + (str == null ? 0 : str.hashCode());
        zzi zziVar = this.zzga;
        int iHashCode3 = ((iHashCode2 * 31) + (zziVar == null ? 0 : zziVar.hashCode())) * 31;
        zzp zzpVar = this.zzhc;
        if (zzpVar != null && !zzpVar.isEmpty()) {
            iHashCode = this.zzhc.hashCode();
        }
        return iHashCode3 + iHashCode;
    }

    @Override // com.google.android.gms.internal.wearable.zzn, com.google.android.gms.internal.wearable.zzt
    public final void zza(zzl zzlVar) throws IOException {
        zzlVar.zza(1, this.name);
        zzi zziVar = this.zzga;
        if (zziVar != null) {
            zzlVar.zza(2, zziVar);
        }
        super.zza(zzlVar);
    }

    @Override // com.google.android.gms.internal.wearable.zzn, com.google.android.gms.internal.wearable.zzt
    public final int zzg() {
        int iZzb = zzl.zzb(1, this.name) + super.zzg();
        zzi zziVar = this.zzga;
        return zziVar != null ? iZzb + zzl.zzb(2, zziVar) : iZzb;
    }

    @Override // com.google.android.gms.internal.wearable.zzt
    public final /* synthetic */ zzt zza(zzk zzkVar) throws IOException {
        while (true) {
            int iZzj = zzkVar.zzj();
            if (iZzj == 0) {
                return this;
            }
            if (iZzj == 10) {
                this.name = zzkVar.readString();
            } else if (iZzj != 18) {
                if (!super.zza(zzkVar, iZzj)) {
                    return this;
                }
            } else {
                if (this.zzga == null) {
                    this.zzga = new zzi();
                }
                zzkVar.zza(this.zzga);
            }
        }
    }
}

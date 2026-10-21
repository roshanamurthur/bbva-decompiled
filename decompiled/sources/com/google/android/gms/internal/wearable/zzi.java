package com.google.android.gms.internal.wearable;

import java.io.IOException;

/* JADX INFO: loaded from: classes9.dex */
public final class zzi extends zzn<zzi> {
    private static volatile zzi[] zzgb;
    public int type = 1;
    public zzj zzgc = null;

    public zzi() {
        this.zzhc = null;
        this.zzhl = -1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.google.android.gms.internal.wearable.zzt
    /* JADX INFO: renamed from: zzb, reason: merged with bridge method [inline-methods] */
    public final zzi zza(zzk zzkVar) throws IOException {
        while (true) {
            int iZzj = zzkVar.zzj();
            if (iZzj == 0) {
                return this;
            }
            if (iZzj == 8) {
                int position = zzkVar.getPosition();
                try {
                    int iZzk = zzkVar.zzk();
                    if (iZzk <= 0 || iZzk > 15) {
                        StringBuilder sb2 = new StringBuilder(36);
                        sb2.append(iZzk);
                        sb2.append(" is not a valid enum Type");
                        throw new IllegalArgumentException(sb2.toString());
                    }
                    this.type = iZzk;
                } catch (IllegalArgumentException unused) {
                    zzkVar.zzg(position);
                    zza(zzkVar, iZzj);
                }
            } else if (iZzj == 18) {
                if (this.zzgc == null) {
                    this.zzgc = new zzj();
                }
                zzkVar.zza(this.zzgc);
            } else if (!super.zza(zzkVar, iZzj)) {
                return this;
            }
        }
    }

    public static zzi[] zzi() {
        if (zzgb == null) {
            synchronized (zzr.zzhk) {
                try {
                    if (zzgb == null) {
                        zzgb = new zzi[0];
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return zzgb;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzi)) {
            return false;
        }
        zzi zziVar = (zzi) obj;
        if (this.type != zziVar.type) {
            return false;
        }
        zzj zzjVar = this.zzgc;
        if (zzjVar == null) {
            if (zziVar.zzgc != null) {
                return false;
            }
        } else if (!zzjVar.equals(zziVar.zzgc)) {
            return false;
        }
        zzp zzpVar = this.zzhc;
        if (zzpVar != null && !zzpVar.isEmpty()) {
            return this.zzhc.equals(zziVar.zzhc);
        }
        zzp zzpVar2 = zziVar.zzhc;
        return zzpVar2 == null || zzpVar2.isEmpty();
    }

    public final int hashCode() {
        int i10 = 1588755220 + this.type;
        zzj zzjVar = this.zzgc;
        int iHashCode = 0;
        int iHashCode2 = ((i10 * 31) + (zzjVar == null ? 0 : zzjVar.hashCode())) * 31;
        zzp zzpVar = this.zzhc;
        if (zzpVar != null && !zzpVar.isEmpty()) {
            iHashCode = this.zzhc.hashCode();
        }
        return iHashCode2 + iHashCode;
    }

    @Override // com.google.android.gms.internal.wearable.zzn, com.google.android.gms.internal.wearable.zzt
    public final void zza(zzl zzlVar) throws IOException {
        zzlVar.zzd(1, this.type);
        zzj zzjVar = this.zzgc;
        if (zzjVar != null) {
            zzlVar.zza(2, zzjVar);
        }
        super.zza(zzlVar);
    }

    @Override // com.google.android.gms.internal.wearable.zzn, com.google.android.gms.internal.wearable.zzt
    public final int zzg() {
        int iZze = zzl.zze(1, this.type) + super.zzg();
        zzj zzjVar = this.zzgc;
        return zzjVar != null ? iZze + zzl.zzb(2, zzjVar) : iZze;
    }
}

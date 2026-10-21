package com.google.android.gms.internal.wearable;

import java.io.IOException;

/* JADX INFO: loaded from: classes9.dex */
public final class zzg extends zzn<zzg> {
    public zzh[] zzfy = zzh.zzh();

    public zzg() {
        this.zzhc = null;
        this.zzhl = -1;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzg)) {
            return false;
        }
        zzg zzgVar = (zzg) obj;
        if (!zzr.equals(this.zzfy, zzgVar.zzfy)) {
            return false;
        }
        zzp zzpVar = this.zzhc;
        if (zzpVar != null && !zzpVar.isEmpty()) {
            return this.zzhc.equals(zzgVar.zzhc);
        }
        zzp zzpVar2 = zzgVar.zzhc;
        return zzpVar2 == null || zzpVar2.isEmpty();
    }

    public final int hashCode() {
        int iHashCode = (zzr.hashCode(this.zzfy) + 1588755158) * 31;
        zzp zzpVar = this.zzhc;
        return iHashCode + ((zzpVar == null || zzpVar.isEmpty()) ? 0 : this.zzhc.hashCode());
    }

    @Override // com.google.android.gms.internal.wearable.zzn, com.google.android.gms.internal.wearable.zzt
    public final void zza(zzl zzlVar) throws IOException {
        zzh[] zzhVarArr = this.zzfy;
        if (zzhVarArr != null && zzhVarArr.length > 0) {
            int i10 = 0;
            while (true) {
                zzh[] zzhVarArr2 = this.zzfy;
                if (i10 >= zzhVarArr2.length) {
                    break;
                }
                zzh zzhVar = zzhVarArr2[i10];
                if (zzhVar != null) {
                    zzlVar.zza(1, zzhVar);
                }
                i10++;
            }
        }
        super.zza(zzlVar);
    }

    @Override // com.google.android.gms.internal.wearable.zzn, com.google.android.gms.internal.wearable.zzt
    public final int zzg() {
        int iZzg = super.zzg();
        zzh[] zzhVarArr = this.zzfy;
        if (zzhVarArr != null && zzhVarArr.length > 0) {
            int i10 = 0;
            while (true) {
                zzh[] zzhVarArr2 = this.zzfy;
                if (i10 >= zzhVarArr2.length) {
                    break;
                }
                zzh zzhVar = zzhVarArr2[i10];
                if (zzhVar != null) {
                    iZzg = zzl.zzb(1, zzhVar) + iZzg;
                }
                i10++;
            }
        }
        return iZzg;
    }

    public static zzg zza(byte[] bArr) throws zzs {
        return (zzg) zzt.zza(new zzg(), bArr, 0, bArr.length);
    }

    @Override // com.google.android.gms.internal.wearable.zzt
    public final /* synthetic */ zzt zza(zzk zzkVar) throws IOException {
        while (true) {
            int iZzj = zzkVar.zzj();
            if (iZzj == 0) {
                return this;
            }
            if (iZzj != 10) {
                if (!super.zza(zzkVar, iZzj)) {
                    return this;
                }
            } else {
                int iZzb = zzw.zzb(zzkVar, 10);
                zzh[] zzhVarArr = this.zzfy;
                int length = zzhVarArr == null ? 0 : zzhVarArr.length;
                int i10 = iZzb + length;
                zzh[] zzhVarArr2 = new zzh[i10];
                if (length != 0) {
                    System.arraycopy(zzhVarArr, 0, zzhVarArr2, 0, length);
                }
                while (length < i10 - 1) {
                    zzh zzhVar = new zzh();
                    zzhVarArr2[length] = zzhVar;
                    zzkVar.zza(zzhVar);
                    zzkVar.zzj();
                    length++;
                }
                zzh zzhVar2 = new zzh();
                zzhVarArr2[length] = zzhVar2;
                zzkVar.zza(zzhVar2);
                this.zzfy = zzhVarArr2;
            }
        }
    }
}

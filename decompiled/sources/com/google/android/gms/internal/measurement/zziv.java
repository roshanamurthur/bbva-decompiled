package com.google.android.gms.internal.measurement;

import ad.d;
import java.io.IOException;
import java.nio.charset.Charset;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-base@@20.1.0 */
/* JADX INFO: loaded from: classes9.dex */
class zziv extends zziu {
    protected final byte[] zza;

    public zziv(byte[] bArr) {
        bArr.getClass();
        this.zza = bArr;
    }

    @Override // com.google.android.gms.internal.measurement.zzix
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzix) || zzd() != ((zzix) obj).zzd()) {
            return false;
        }
        if (zzd() == 0) {
            return true;
        }
        if (!(obj instanceof zziv)) {
            return obj.equals(this);
        }
        zziv zzivVar = (zziv) obj;
        int iZzk = zzk();
        int iZzk2 = zzivVar.zzk();
        if (iZzk != 0 && iZzk2 != 0 && iZzk != iZzk2) {
            return false;
        }
        int iZzd = zzd();
        if (iZzd > zzivVar.zzd()) {
            int iZzd2 = zzd();
            StringBuilder sb2 = new StringBuilder(40);
            sb2.append("Length too large: ");
            sb2.append(iZzd);
            sb2.append(iZzd2);
            throw new IllegalArgumentException(sb2.toString());
        }
        if (iZzd > zzivVar.zzd()) {
            throw new IllegalArgumentException(d.d(59, "Ran off end of other: 0, ", iZzd, ", ", zzivVar.zzd()));
        }
        byte[] bArr = this.zza;
        byte[] bArr2 = zzivVar.zza;
        zzivVar.zzc();
        int i10 = 0;
        int i11 = 0;
        while (i10 < iZzd) {
            if (bArr[i10] != bArr2[i11]) {
                return false;
            }
            i10++;
            i11++;
        }
        return true;
    }

    @Override // com.google.android.gms.internal.measurement.zzix
    public byte zza(int i10) {
        return this.zza[i10];
    }

    @Override // com.google.android.gms.internal.measurement.zzix
    public byte zzb(int i10) {
        return this.zza[i10];
    }

    public int zzc() {
        return 0;
    }

    @Override // com.google.android.gms.internal.measurement.zzix
    public int zzd() {
        return this.zza.length;
    }

    @Override // com.google.android.gms.internal.measurement.zzix
    public final int zze(int i10, int i11, int i12) {
        return zzkf.zzd(i10, this.zza, 0, i12);
    }

    @Override // com.google.android.gms.internal.measurement.zzix
    public final zzix zzf(int i10, int i11) {
        int iZzj = zzix.zzj(0, i11, zzd());
        return iZzj == 0 ? zzix.zzb : new zzis(this.zza, 0, iZzj);
    }

    @Override // com.google.android.gms.internal.measurement.zzix
    public final String zzg(Charset charset) {
        return new String(this.zza, 0, zzd(), charset);
    }

    @Override // com.google.android.gms.internal.measurement.zzix
    public final void zzh(zzin zzinVar) throws IOException {
        ((zzjc) zzinVar).zzc(this.zza, 0, zzd());
    }

    @Override // com.google.android.gms.internal.measurement.zzix
    public final boolean zzi() {
        return zzmq.zzf(this.zza, 0, zzd());
    }
}

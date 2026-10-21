package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import java.io.IOException;
import java.nio.charset.Charset;

/* JADX INFO: compiled from: com.google.mlkit:barcode-scanning@@17.0.2 */
/* JADX INFO: loaded from: classes9.dex */
class zzcz extends zzcy {
    protected final byte[] zza;

    public zzcz(byte[] bArr) {
        bArr.getClass();
        this.zza = bArr;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdb
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzdb) || zzd() != ((zzdb) obj).zzd()) {
            return false;
        }
        if (zzd() == 0) {
            return true;
        }
        if (!(obj instanceof zzcz)) {
            return obj.equals(this);
        }
        zzcz zzczVar = (zzcz) obj;
        int iZzp = zzp();
        int iZzp2 = zzczVar.zzp();
        if (iZzp == 0 || iZzp2 == 0 || iZzp == iZzp2) {
            return zzg(zzczVar, 0, zzd());
        }
        return false;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdb
    public byte zza(int i10) {
        return this.zza[i10];
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdb
    public byte zzb(int i10) {
        return this.zza[i10];
    }

    public int zzc() {
        return 0;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdb
    public int zzd() {
        return this.zza.length;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdb
    public void zze(byte[] bArr, int i10, int i11, int i12) {
        System.arraycopy(this.zza, i10, bArr, i11, i12);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzcy
    public final boolean zzg(zzdb zzdbVar, int i10, int i11) {
        if (i11 > zzdbVar.zzd()) {
            int iZzd = zzd();
            StringBuilder sb2 = new StringBuilder(40);
            sb2.append("Length too large: ");
            sb2.append(i11);
            sb2.append(iZzd);
            throw new IllegalArgumentException(sb2.toString());
        }
        int i12 = i10 + i11;
        if (i12 > zzdbVar.zzd()) {
            int iZzd2 = zzdbVar.zzd();
            StringBuilder sb3 = new StringBuilder(59);
            sb3.append("Ran off end of other: ");
            sb3.append(i10);
            sb3.append(", ");
            sb3.append(i11);
            sb3.append(", ");
            sb3.append(iZzd2);
            throw new IllegalArgumentException(sb3.toString());
        }
        if (!(zzdbVar instanceof zzcz)) {
            return zzdbVar.zzk(i10, i12).equals(zzk(0, i11));
        }
        zzcz zzczVar = (zzcz) zzdbVar;
        byte[] bArr = this.zza;
        byte[] bArr2 = zzczVar.zza;
        int iZzc = zzc() + i11;
        int iZzc2 = zzc();
        int iZzc3 = zzczVar.zzc() + i10;
        while (iZzc2 < iZzc) {
            if (bArr[iZzc2] != bArr2[iZzc3]) {
                return false;
            }
            iZzc2++;
            iZzc3++;
        }
        return true;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdb
    public final int zzi(int i10, int i11, int i12) {
        return zzel.zzd(i10, this.zza, zzc() + i11, i12);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdb
    public final int zzj(int i10, int i11, int i12) {
        int iZzc = zzc() + i11;
        return zzhe.zzf(i10, this.zza, iZzc, i12 + iZzc);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdb
    public final zzdb zzk(int i10, int i11) {
        int iZzo = zzdb.zzo(i10, i11, zzd());
        return iZzo == 0 ? zzdb.zzb : new zzcw(this.zza, zzc() + i10, iZzo);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdb
    public final String zzl(Charset charset) {
        return new String(this.zza, zzc(), zzd(), charset);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdb
    public final void zzm(zzcr zzcrVar) throws IOException {
        ((zzdg) zzcrVar).zzc(this.zza, zzc(), zzd());
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdb
    public final boolean zzn() {
        int iZzc = zzc();
        return zzhe.zzi(this.zza, iZzc, zzd() + iZzc);
    }
}

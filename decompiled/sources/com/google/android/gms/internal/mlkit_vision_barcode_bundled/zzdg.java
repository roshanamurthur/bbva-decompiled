package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import java.io.IOException;

/* JADX INFO: compiled from: com.google.mlkit:barcode-scanning@@17.0.2 */
/* JADX INFO: loaded from: classes9.dex */
final class zzdg extends zzdi {
    private final byte[] zzb;
    private final int zzc;
    private int zzd;

    public zzdg(byte[] bArr, int i10, int i11) {
        super(null);
        if (bArr == null) {
            throw new NullPointerException("buffer");
        }
        int length = bArr.length;
        if (((length - i11) | i11) < 0) {
            throw new IllegalArgumentException(String.format("Array range is invalid. Buffer.length=%d, offset=%d, length=%d", Integer.valueOf(length), 0, Integer.valueOf(i11)));
        }
        this.zzb = bArr;
        this.zzd = 0;
        this.zzc = i11;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdi
    public final int zza() {
        return this.zzc - this.zzd;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdi
    public final void zzb(byte b10) throws IOException {
        try {
            byte[] bArr = this.zzb;
            int i10 = this.zzd;
            this.zzd = i10 + 1;
            bArr[i10] = b10;
        } catch (IndexOutOfBoundsException e5) {
            throw new zzdh(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.zzd), Integer.valueOf(this.zzc), 1), e5);
        }
    }

    public final void zzc(byte[] bArr, int i10, int i11) throws IOException {
        try {
            System.arraycopy(bArr, i10, this.zzb, this.zzd, i11);
            this.zzd += i11;
        } catch (IndexOutOfBoundsException e5) {
            throw new zzdh(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.zzd), Integer.valueOf(this.zzc), Integer.valueOf(i11)), e5);
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdi
    public final void zzd(int i10, boolean z10) throws IOException {
        zzq(i10 << 3);
        zzb(z10 ? (byte) 1 : (byte) 0);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdi
    public final void zze(int i10, zzdb zzdbVar) throws IOException {
        zzq((i10 << 3) | 2);
        zzq(zzdbVar.zzd());
        zzdbVar.zzm(this);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdi
    public final void zzf(int i10, int i11) throws IOException {
        zzq((i10 << 3) | 5);
        zzg(i11);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdi
    public final void zzg(int i10) throws IOException {
        try {
            byte[] bArr = this.zzb;
            int i11 = this.zzd;
            bArr[i11] = (byte) (i10 & 255);
            bArr[i11 + 1] = (byte) ((i10 >> 8) & 255);
            bArr[i11 + 2] = (byte) ((i10 >> 16) & 255);
            this.zzd = i11 + 4;
            bArr[i11 + 3] = (byte) ((i10 >> 24) & 255);
        } catch (IndexOutOfBoundsException e5) {
            throw new zzdh(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.zzd), Integer.valueOf(this.zzc), 1), e5);
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdi
    public final void zzh(int i10, long j10) throws IOException {
        zzq((i10 << 3) | 1);
        zzi(j10);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdi
    public final void zzi(long j10) throws IOException {
        try {
            byte[] bArr = this.zzb;
            int i10 = this.zzd;
            bArr[i10] = (byte) (((int) j10) & 255);
            bArr[i10 + 1] = (byte) (((int) (j10 >> 8)) & 255);
            bArr[i10 + 2] = (byte) (((int) (j10 >> 16)) & 255);
            bArr[i10 + 3] = (byte) (((int) (j10 >> 24)) & 255);
            bArr[i10 + 4] = (byte) (((int) (j10 >> 32)) & 255);
            bArr[i10 + 5] = (byte) (((int) (j10 >> 40)) & 255);
            bArr[i10 + 6] = (byte) (((int) (j10 >> 48)) & 255);
            this.zzd = i10 + 8;
            bArr[i10 + 7] = (byte) (((int) (j10 >> 56)) & 255);
        } catch (IndexOutOfBoundsException e5) {
            throw new zzdh(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.zzd), Integer.valueOf(this.zzc), 1), e5);
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdi
    public final void zzj(int i10, int i11) throws IOException {
        zzq(i10 << 3);
        zzk(i11);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdi
    public final void zzk(int i10) throws IOException {
        if (i10 >= 0) {
            zzq(i10);
        } else {
            zzs(i10);
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdi
    public final void zzl(byte[] bArr, int i10, int i11) throws IOException {
        zzc(bArr, 0, i11);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdi
    public final void zzm(int i10, String str) throws IOException {
        zzq((i10 << 3) | 2);
        zzn(str);
    }

    public final void zzn(String str) throws IOException {
        int i10 = this.zzd;
        try {
            int iZzD = zzdi.zzD(str.length() * 3);
            int iZzD2 = zzdi.zzD(str.length());
            if (iZzD2 != iZzD) {
                zzq(zzhe.zze(str));
                byte[] bArr = this.zzb;
                int i11 = this.zzd;
                this.zzd = zzhe.zzd(str, bArr, i11, this.zzc - i11);
                return;
            }
            int i12 = i10 + iZzD2;
            this.zzd = i12;
            int iZzd = zzhe.zzd(str, this.zzb, i12, this.zzc - i12);
            this.zzd = i10;
            zzq((iZzd - i10) - iZzD2);
            this.zzd = iZzd;
        } catch (zzhd e5) {
            this.zzd = i10;
            zzH(str, e5);
        } catch (IndexOutOfBoundsException e7) {
            throw new zzdh(e7);
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdi
    public final void zzo(int i10, int i11) throws IOException {
        zzq((i10 << 3) | i11);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdi
    public final void zzp(int i10, int i11) throws IOException {
        zzq(i10 << 3);
        zzq(i11);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdi
    public final void zzq(int i10) throws IOException {
        if (zzdi.zzc) {
            int i11 = zzcn.zza;
        }
        while ((i10 & (-128)) != 0) {
            try {
                byte[] bArr = this.zzb;
                int i12 = this.zzd;
                this.zzd = i12 + 1;
                bArr[i12] = (byte) ((i10 & 127) | 128);
                i10 >>>= 7;
            } catch (IndexOutOfBoundsException e5) {
                throw new zzdh(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.zzd), Integer.valueOf(this.zzc), 1), e5);
            }
        }
        byte[] bArr2 = this.zzb;
        int i13 = this.zzd;
        this.zzd = i13 + 1;
        bArr2[i13] = (byte) i10;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdi
    public final void zzr(int i10, long j10) throws IOException {
        zzq(i10 << 3);
        zzs(j10);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdi
    public final void zzs(long j10) throws IOException {
        if (zzdi.zzc && this.zzc - this.zzd >= 10) {
            while ((j10 & (-128)) != 0) {
                byte[] bArr = this.zzb;
                int i10 = this.zzd;
                this.zzd = i10 + 1;
                zzgz.zzn(bArr, i10, (byte) ((((int) j10) & 127) | 128));
                j10 >>>= 7;
            }
            byte[] bArr2 = this.zzb;
            int i11 = this.zzd;
            this.zzd = i11 + 1;
            zzgz.zzn(bArr2, i11, (byte) j10);
            return;
        }
        while ((j10 & (-128)) != 0) {
            try {
                byte[] bArr3 = this.zzb;
                int i12 = this.zzd;
                this.zzd = i12 + 1;
                bArr3[i12] = (byte) ((((int) j10) & 127) | 128);
                j10 >>>= 7;
            } catch (IndexOutOfBoundsException e5) {
                throw new zzdh(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.zzd), Integer.valueOf(this.zzc), 1), e5);
            }
        }
        byte[] bArr4 = this.zzb;
        int i13 = this.zzd;
        this.zzd = i13 + 1;
        bArr4[i13] = (byte) j10;
    }
}

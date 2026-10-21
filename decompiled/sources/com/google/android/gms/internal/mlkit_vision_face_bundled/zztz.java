package com.google.android.gms.internal.mlkit_vision_face_bundled;

import java.io.IOException;

/* JADX INFO: compiled from: com.google.mlkit:face-detection@@16.1.7 */
/* JADX INFO: loaded from: classes9.dex */
final class zztz extends zzuc {
    private final byte[] zzb;
    private final int zzc;
    private int zzd;

    public zztz(byte[] bArr, int i10, int i11) {
        super(null);
        int length = bArr.length;
        if (((length - i11) | i11) < 0) {
            throw new IllegalArgumentException(String.format("Array range is invalid. Buffer.length=%d, offset=%d, length=%d", Integer.valueOf(length), 0, Integer.valueOf(i11)));
        }
        this.zzb = bArr;
        this.zzd = 0;
        this.zzc = i11;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_face_bundled.zzuc
    public final int zza() {
        return this.zzc - this.zzd;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_face_bundled.zzuc
    public final void zzb(byte b10) throws IOException {
        try {
            byte[] bArr = this.zzb;
            int i10 = this.zzd;
            this.zzd = i10 + 1;
            bArr[i10] = b10;
        } catch (IndexOutOfBoundsException e5) {
            throw new zzua(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.zzd), Integer.valueOf(this.zzc), 1), e5);
        }
    }

    public final void zzc(byte[] bArr, int i10, int i11) throws IOException {
        try {
            System.arraycopy(bArr, 0, this.zzb, this.zzd, i11);
            this.zzd += i11;
        } catch (IndexOutOfBoundsException e5) {
            throw new zzua(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.zzd), Integer.valueOf(this.zzc), Integer.valueOf(i11)), e5);
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_face_bundled.zzuc
    public final void zzd(int i10, boolean z10) throws IOException {
        zzt(i10 << 3);
        zzb(z10 ? (byte) 1 : (byte) 0);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_face_bundled.zzuc
    public final void zze(int i10, zztu zztuVar) throws IOException {
        zzt((i10 << 3) | 2);
        zzt(zztuVar.zzd());
        zztuVar.zzg(this);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_face_bundled.zzuc
    public final void zzf(int i10, int i11) throws IOException {
        zzt((i10 << 3) | 5);
        zzg(i11);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_face_bundled.zzuc
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
            throw new zzua(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.zzd), Integer.valueOf(this.zzc), 1), e5);
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_face_bundled.zzuc
    public final void zzh(int i10, long j10) throws IOException {
        zzt((i10 << 3) | 1);
        zzi(j10);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_face_bundled.zzuc
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
            throw new zzua(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.zzd), Integer.valueOf(this.zzc), 1), e5);
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_face_bundled.zzuc
    public final void zzj(int i10, int i11) throws IOException {
        zzt(i10 << 3);
        zzk(i11);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_face_bundled.zzuc
    public final void zzk(int i10) throws IOException {
        if (i10 >= 0) {
            zzt(i10);
        } else {
            zzv(i10);
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_face_bundled.zzuc
    public final void zzl(byte[] bArr, int i10, int i11) throws IOException {
        zzc(bArr, 0, i11);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_face_bundled.zzuc
    public final void zzm(int i10, zzvw zzvwVar, zzwh zzwhVar) throws IOException {
        zzt((i10 << 3) | 2);
        zzt(((zztf) zzvwVar).zzp(zzwhVar));
        zzwhVar.zzi(zzvwVar, this.zza);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_face_bundled.zzuc
    public final void zzn(int i10, zzvw zzvwVar) throws IOException {
        zzt(11);
        zzs(2, i10);
        zzt(26);
        zzt(zzvwVar.zzu());
        zzvwVar.zzL(this);
        zzt(12);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_face_bundled.zzuc
    public final void zzo(int i10, zztu zztuVar) throws IOException {
        zzt(11);
        zzs(2, i10);
        zze(3, zztuVar);
        zzt(12);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_face_bundled.zzuc
    public final void zzp(int i10, String str) throws IOException {
        zzt((i10 << 3) | 2);
        zzq(str);
    }

    public final void zzq(String str) throws IOException {
        int i10 = this.zzd;
        try {
            int iZzz = zzuc.zzz(str.length() * 3);
            int iZzz2 = zzuc.zzz(str.length());
            if (iZzz2 != iZzz) {
                zzt(zzxf.zzc(str));
                byte[] bArr = this.zzb;
                int i11 = this.zzd;
                this.zzd = zzxf.zzb(str, bArr, i11, this.zzc - i11);
                return;
            }
            int i12 = i10 + iZzz2;
            this.zzd = i12;
            int iZzb = zzxf.zzb(str, this.zzb, i12, this.zzc - i12);
            this.zzd = i10;
            zzt((iZzb - i10) - iZzz2);
            this.zzd = iZzb;
        } catch (zzxe e5) {
            this.zzd = i10;
            zzC(str, e5);
        } catch (IndexOutOfBoundsException e7) {
            throw new zzua(e7);
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_face_bundled.zzuc
    public final void zzr(int i10, int i11) throws IOException {
        zzt((i10 << 3) | i11);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_face_bundled.zzuc
    public final void zzs(int i10, int i11) throws IOException {
        zzt(i10 << 3);
        zzt(i11);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_face_bundled.zzuc
    public final void zzt(int i10) throws IOException {
        while ((i10 & (-128)) != 0) {
            try {
                byte[] bArr = this.zzb;
                int i11 = this.zzd;
                this.zzd = i11 + 1;
                bArr[i11] = (byte) ((i10 | 128) & 255);
                i10 >>>= 7;
            } catch (IndexOutOfBoundsException e5) {
                throw new zzua(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.zzd), Integer.valueOf(this.zzc), 1), e5);
            }
        }
        byte[] bArr2 = this.zzb;
        int i12 = this.zzd;
        this.zzd = i12 + 1;
        bArr2[i12] = (byte) i10;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_face_bundled.zzuc
    public final void zzu(int i10, long j10) throws IOException {
        zzt(i10 << 3);
        zzv(j10);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_face_bundled.zzuc
    public final void zzv(long j10) throws IOException {
        if (!zzuc.zzc || this.zzc - this.zzd < 10) {
            while ((j10 & (-128)) != 0) {
                try {
                    byte[] bArr = this.zzb;
                    int i10 = this.zzd;
                    this.zzd = i10 + 1;
                    bArr[i10] = (byte) ((((int) j10) | 128) & 255);
                    j10 >>>= 7;
                } catch (IndexOutOfBoundsException e5) {
                    throw new zzua(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.zzd), Integer.valueOf(this.zzc), 1), e5);
                }
            }
            byte[] bArr2 = this.zzb;
            int i11 = this.zzd;
            this.zzd = i11 + 1;
            bArr2[i11] = (byte) j10;
            return;
        }
        while (true) {
            int i12 = (int) j10;
            if ((j10 & (-128)) == 0) {
                byte[] bArr3 = this.zzb;
                int i13 = this.zzd;
                this.zzd = i13 + 1;
                zzxc.zzn(bArr3, i13, (byte) i12);
                return;
            }
            byte[] bArr4 = this.zzb;
            int i14 = this.zzd;
            this.zzd = i14 + 1;
            zzxc.zzn(bArr4, i14, (byte) ((i12 | 128) & 255));
            j10 >>>= 7;
        }
    }
}

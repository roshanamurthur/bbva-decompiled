package com.google.android.gms.internal.measurement;

import ad.d;
import androidx.camera.core.imagecapture.a;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-base@@20.1.0 */
/* JADX INFO: loaded from: classes9.dex */
final class zzis extends zziv {
    private final int zzc;

    public zzis(byte[] bArr, int i10, int i11) {
        super(bArr);
        zzix.zzj(0, i11, bArr.length);
        this.zzc = i11;
    }

    @Override // com.google.android.gms.internal.measurement.zziv, com.google.android.gms.internal.measurement.zzix
    public final byte zza(int i10) {
        int i11 = this.zzc;
        if (((i11 - (i10 + 1)) | i10) >= 0) {
            return this.zza[i10];
        }
        if (i10 < 0) {
            throw new ArrayIndexOutOfBoundsException(a.a(22, "Index < 0: ", i10));
        }
        throw new ArrayIndexOutOfBoundsException(d.d(40, "Index > length: ", i10, ", ", i11));
    }

    @Override // com.google.android.gms.internal.measurement.zziv, com.google.android.gms.internal.measurement.zzix
    public final byte zzb(int i10) {
        return this.zza[i10];
    }

    @Override // com.google.android.gms.internal.measurement.zziv
    public final int zzc() {
        return 0;
    }

    @Override // com.google.android.gms.internal.measurement.zziv, com.google.android.gms.internal.measurement.zzix
    public final int zzd() {
        return this.zzc;
    }
}

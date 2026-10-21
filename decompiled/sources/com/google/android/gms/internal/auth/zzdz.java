package com.google.android.gms.internal.auth;

import androidx.appcompat.widget.g0;
import androidx.camera.camera2.internal.n1;

/* JADX INFO: compiled from: com.google.android.gms:play-services-auth-base@@18.0.10 */
/* JADX INFO: loaded from: classes9.dex */
final class zzdz extends zzec {
    private final int zzc;

    public zzdz(byte[] bArr, int i10, int i11) {
        super(bArr);
        zzef.zzi(0, i11, bArr.length);
        this.zzc = i11;
    }

    @Override // com.google.android.gms.internal.auth.zzec, com.google.android.gms.internal.auth.zzef
    public final byte zza(int i10) {
        int i11 = this.zzc;
        if (((i11 - (i10 + 1)) | i10) >= 0) {
            return this.zza[i10];
        }
        if (i10 < 0) {
            throw new ArrayIndexOutOfBoundsException(g0.c("Index < 0: ", i10));
        }
        throw new ArrayIndexOutOfBoundsException(n1.e("Index > length: ", i10, ", ", i11));
    }

    @Override // com.google.android.gms.internal.auth.zzec, com.google.android.gms.internal.auth.zzef
    public final byte zzb(int i10) {
        return this.zza[i10];
    }

    @Override // com.google.android.gms.internal.auth.zzec
    public final int zzc() {
        return 0;
    }

    @Override // com.google.android.gms.internal.auth.zzec, com.google.android.gms.internal.auth.zzef
    public final int zzd() {
        return this.zzc;
    }
}

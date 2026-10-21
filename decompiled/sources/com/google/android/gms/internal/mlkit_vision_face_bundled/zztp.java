package com.google.android.gms.internal.mlkit_vision_face_bundled;

import androidx.appcompat.widget.g0;
import androidx.camera.camera2.internal.n1;

/* JADX INFO: compiled from: com.google.mlkit:face-detection@@16.1.7 */
/* JADX INFO: loaded from: classes9.dex */
final class zztp extends zztt {
    private final int zzc;

    public zztp(byte[] bArr, int i10, int i11) {
        super(bArr);
        zztu.zzh(0, i11, bArr.length);
        this.zzc = i11;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_face_bundled.zztt, com.google.android.gms.internal.mlkit_vision_face_bundled.zztu
    public final byte zza(int i10) {
        int i11 = this.zzc;
        if (((i11 - (i10 + 1)) | i10) >= 0) {
            return ((zztt) this).zza[i10];
        }
        if (i10 < 0) {
            throw new ArrayIndexOutOfBoundsException(g0.c("Index < 0: ", i10));
        }
        throw new ArrayIndexOutOfBoundsException(n1.e("Index > length: ", i10, ", ", i11));
    }

    @Override // com.google.android.gms.internal.mlkit_vision_face_bundled.zztt, com.google.android.gms.internal.mlkit_vision_face_bundled.zztu
    public final byte zzb(int i10) {
        return ((zztt) this).zza[i10];
    }

    @Override // com.google.android.gms.internal.mlkit_vision_face_bundled.zztt
    public final int zzc() {
        return 0;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_face_bundled.zztt, com.google.android.gms.internal.mlkit_vision_face_bundled.zztu
    public final int zzd() {
        return this.zzc;
    }
}

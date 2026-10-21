package com.google.android.gms.internal.mlkit_vision_face_bundled;

import androidx.camera.camera2.internal.n1;
import java.io.IOException;

/* JADX INFO: compiled from: com.google.mlkit:face-detection@@16.1.7 */
/* JADX INFO: loaded from: classes9.dex */
class zztt extends zzts {
    protected final byte[] zza;

    public zztt(byte[] bArr) {
        super(null);
        bArr.getClass();
        this.zza = bArr;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_face_bundled.zztu
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zztu) || zzd() != ((zztu) obj).zzd()) {
            return false;
        }
        if (zzd() == 0) {
            return true;
        }
        if (!(obj instanceof zztt)) {
            return obj.equals(this);
        }
        zztt zzttVar = (zztt) obj;
        int iZzi = zzi();
        int iZzi2 = zzttVar.zzi();
        if (iZzi != 0 && iZzi2 != 0 && iZzi != iZzi2) {
            return false;
        }
        int iZzd = zzd();
        if (iZzd > zzttVar.zzd()) {
            throw new IllegalArgumentException("Length too large: " + iZzd + zzd());
        }
        if (iZzd > zzttVar.zzd()) {
            throw new IllegalArgumentException(n1.e("Ran off end of other: 0, ", iZzd, ", ", zzttVar.zzd()));
        }
        byte[] bArr = this.zza;
        byte[] bArr2 = zzttVar.zza;
        zzttVar.zzc();
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

    @Override // com.google.android.gms.internal.mlkit_vision_face_bundled.zztu
    public byte zza(int i10) {
        return this.zza[i10];
    }

    @Override // com.google.android.gms.internal.mlkit_vision_face_bundled.zztu
    public byte zzb(int i10) {
        return this.zza[i10];
    }

    public int zzc() {
        return 0;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_face_bundled.zztu
    public int zzd() {
        return this.zza.length;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_face_bundled.zztu
    public final int zze(int i10, int i11, int i12) {
        return zzvc.zzb(i10, this.zza, 0, i12);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_face_bundled.zztu
    public final zztu zzf(int i10, int i11) {
        int iZzh = zztu.zzh(0, i11, zzd());
        return iZzh == 0 ? zztu.zzb : new zztp(this.zza, 0, iZzh);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_face_bundled.zztu
    public final void zzg(zztm zztmVar) throws IOException {
        ((zztz) zztmVar).zzc(this.zza, 0, zzd());
    }
}

package com.google.android.gms.internal.mlkit_vision_face_bundled;

import com.google.android.gms.common.internal.Preconditions;
import com.google.firebase.encoders.json.JsonDataEncoderBuilder;
import java.io.UnsupportedEncodingException;

/* JADX INFO: compiled from: com.google.mlkit:face-detection@@16.1.7 */
/* JADX INFO: loaded from: classes9.dex */
public final class zzsh implements zzrw {
    private final zzni zza;
    private zzqw zzb = new zzqw();
    private final int zzc;

    private zzsh(zzni zzniVar, int i10) {
        this.zza = zzniVar;
        zzsn.zza();
        this.zzc = i10;
    }

    public static zzrw zzf(zzni zzniVar, int i10) {
        return new zzsh(zzniVar, i10);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_face_bundled.zzrw
    public final int zza() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_face_bundled.zzrw
    public final zzrw zzb(zznh zznhVar) {
        this.zza.zze(zznhVar);
        return this;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_face_bundled.zzrw
    public final zzrw zzc(zzqw zzqwVar) {
        this.zzb = zzqwVar;
        return this;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_face_bundled.zzrw
    public final String zzd() {
        String strZzk;
        zzqy zzqyVarZzd = this.zza.zzh().zzd();
        return (zzqyVarZzd == null || (strZzk = zzqyVarZzd.zzk()) == null || strZzk.isEmpty()) ? "NA" : (String) Preconditions.checkNotNull(zzqyVarZzd.zzk());
    }

    @Override // com.google.android.gms.internal.mlkit_vision_face_bundled.zzrw
    public final byte[] zze(int i10, boolean z10) {
        this.zzb.zzf(Boolean.valueOf(1 == (i10 ^ 1)));
        this.zzb.zze(Boolean.FALSE);
        this.zza.zzg(this.zzb.zzm());
        try {
            zzsn.zza();
            if (i10 == 0) {
                return new JsonDataEncoderBuilder().configureWith(zzlb.zza).ignoreNullValues(true).build().encode(this.zza.zzh()).getBytes("utf-8");
            }
            zznk zznkVarZzh = this.zza.zzh();
            zzbq zzbqVar = new zzbq();
            zzlb.zza.configure(zzbqVar);
            return zzbqVar.zza().zza(zznkVarZzh);
        } catch (UnsupportedEncodingException e5) {
            throw new UnsupportedOperationException("Failed to covert logging to UTF-8 byte array", e5);
        }
    }
}

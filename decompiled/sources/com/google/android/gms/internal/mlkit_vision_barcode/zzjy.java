package com.google.android.gms.internal.mlkit_vision_barcode;

import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-mlkit-barcode-scanning@@18.0.0 */
/* JADX INFO: loaded from: classes9.dex */
public final class zzjy {
    private final zzjw zza;
    private final Integer zzb;
    private final Integer zzc = null;
    private final Boolean zzd = null;

    public /* synthetic */ zzjy(zzjv zzjvVar, zzjx zzjxVar) {
        this.zza = zzjvVar.zza;
        this.zzb = zzjvVar.zzb;
    }

    public final boolean equals(@Nullable Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzjy)) {
            return false;
        }
        zzjy zzjyVar = (zzjy) obj;
        return Objects.equal(this.zza, zzjyVar.zza) && Objects.equal(this.zzb, zzjyVar.zzb) && Objects.equal(null, null) && Objects.equal(null, null);
    }

    public final int hashCode() {
        return Objects.hashCode(this.zza, this.zzb, null, null);
    }

    @Nullable
    @zzdj(zza = 1)
    public final zzjw zza() {
        return this.zza;
    }

    @Nullable
    @zzdj(zza = 2)
    public final Integer zzb() {
        return this.zzb;
    }
}

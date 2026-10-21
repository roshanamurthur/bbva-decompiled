package com.google.android.gms.internal.mlkit_vision_barcode;

import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-mlkit-barcode-scanning@@18.0.0 */
/* JADX INFO: loaded from: classes9.dex */
public final class zzdy {
    private final zzkj zza;
    private final Boolean zzc;
    private final zzmy zze;
    private final zzcc zzf;
    private final zzcc zzg;
    private final Boolean zzb = null;
    private final zzjy zzd = null;

    public /* synthetic */ zzdy(zzdw zzdwVar, zzdx zzdxVar) {
        this.zza = zzdwVar.zza;
        this.zzc = zzdwVar.zzb;
        this.zze = zzdwVar.zzc;
        this.zzf = zzdwVar.zzd;
        this.zzg = zzdwVar.zze;
    }

    public final boolean equals(@Nullable Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzdy)) {
            return false;
        }
        zzdy zzdyVar = (zzdy) obj;
        return Objects.equal(this.zza, zzdyVar.zza) && Objects.equal(null, null) && Objects.equal(this.zzc, zzdyVar.zzc) && Objects.equal(null, null) && Objects.equal(this.zze, zzdyVar.zze) && Objects.equal(this.zzf, zzdyVar.zzf) && Objects.equal(this.zzg, zzdyVar.zzg);
    }

    public final int hashCode() {
        return Objects.hashCode(this.zza, null, this.zzc, null, this.zze, this.zzf, this.zzg);
    }

    @Nullable
    @zzdj(zza = 6)
    public final zzcc zza() {
        return this.zzf;
    }

    @Nullable
    @zzdj(zza = 7)
    public final zzcc zzb() {
        return this.zzg;
    }

    @Nullable
    @zzdj(zza = 1)
    public final zzkj zzc() {
        return this.zza;
    }

    @Nullable
    @zzdj(zza = 5)
    public final zzmy zzd() {
        return this.zze;
    }

    @Nullable
    @zzdj(zza = 3)
    public final Boolean zze() {
        return this.zzc;
    }
}

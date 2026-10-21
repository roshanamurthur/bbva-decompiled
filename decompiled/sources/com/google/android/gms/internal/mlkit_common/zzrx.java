package com.google.android.gms.internal.mlkit_common;

import com.google.mlkit.common.sdkinternal.ModelType;

/* JADX INFO: compiled from: com.google.mlkit:common@@18.11.0 */
/* JADX INFO: loaded from: classes9.dex */
final class zzrx extends zzsj {
    private final zzmu zza;
    private final String zzb;
    private final boolean zzc;
    private final boolean zzd;
    private final ModelType zze;
    private final zzna zzf;
    private final int zzg;

    public /* synthetic */ zzrx(zzmu zzmuVar, String str, boolean z10, boolean z11, ModelType modelType, zzna zznaVar, int i10, zzrw zzrwVar) {
        this.zza = zzmuVar;
        this.zzb = str;
        this.zzc = z10;
        this.zzd = z11;
        this.zze = modelType;
        this.zzf = zznaVar;
        this.zzg = i10;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzsj) {
            zzsj zzsjVar = (zzsj) obj;
            if (this.zza.equals(zzsjVar.zzc()) && this.zzb.equals(zzsjVar.zze()) && this.zzc == zzsjVar.zzg() && this.zzd == zzsjVar.zzf() && this.zze.equals(zzsjVar.zzb()) && this.zzf.equals(zzsjVar.zzd()) && this.zzg == zzsjVar.zza()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((((((this.zza.hashCode() ^ 1000003) * 1000003) ^ this.zzb.hashCode()) * 1000003) ^ (true != this.zzc ? 1237 : 1231)) * 1000003) ^ (true != this.zzd ? 1237 : 1231)) * 1000003) ^ this.zze.hashCode()) * 1000003) ^ this.zzf.hashCode()) * 1000003) ^ this.zzg;
    }

    public final String toString() {
        zzna zznaVar = this.zzf;
        ModelType modelType = this.zze;
        String string = this.zza.toString();
        String string2 = modelType.toString();
        String string3 = zznaVar.toString();
        StringBuilder sbD = ci.a.d("RemoteModelLoggingOptions{errorCode=", string, ", tfliteSchemaVersion=");
        sbD.append(this.zzb);
        sbD.append(", shouldLogRoughDownloadTime=");
        sbD.append(this.zzc);
        sbD.append(", shouldLogExactDownloadTime=");
        sbD.append(this.zzd);
        sbD.append(", modelType=");
        sbD.append(string2);
        sbD.append(", downloadStatus=");
        sbD.append(string3);
        sbD.append(", failureStatusCode=");
        return androidx.appcompat.widget.a.c(sbD, this.zzg, "}");
    }

    @Override // com.google.android.gms.internal.mlkit_common.zzsj
    public final int zza() {
        return this.zzg;
    }

    @Override // com.google.android.gms.internal.mlkit_common.zzsj
    public final ModelType zzb() {
        return this.zze;
    }

    @Override // com.google.android.gms.internal.mlkit_common.zzsj
    public final zzmu zzc() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.mlkit_common.zzsj
    public final zzna zzd() {
        return this.zzf;
    }

    @Override // com.google.android.gms.internal.mlkit_common.zzsj
    public final String zze() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.mlkit_common.zzsj
    public final boolean zzf() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.mlkit_common.zzsj
    public final boolean zzg() {
        return this.zzc;
    }
}

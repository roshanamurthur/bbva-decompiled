package com.google.android.gms.internal.mlkit_vision_barcode;

/* JADX INFO: compiled from: com.google.android.gms:play-services-mlkit-barcode-scanning@@18.0.0 */
/* JADX INFO: loaded from: classes9.dex */
final class zznc extends zzne {
    private final String zza;
    private final boolean zzb;
    private final int zzc;

    public /* synthetic */ zznc(String str, boolean z10, int i10, zznb zznbVar) {
        this.zza = str;
        this.zzb = z10;
        this.zzc = i10;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzne) {
            zzne zzneVar = (zzne) obj;
            if (this.zza.equals(zzneVar.zzb()) && this.zzb == zzneVar.zzc() && this.zzc == zzneVar.zza()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.zza.hashCode() ^ 1000003) * 1000003) ^ (true != this.zzb ? 1237 : 1231)) * 1000003) ^ this.zzc;
    }

    public final String toString() {
        String str = this.zza;
        boolean z10 = this.zzb;
        int i10 = this.zzc;
        StringBuilder sb2 = new StringBuilder(str.length() + 84);
        sb2.append("MLKitLoggingOptions{libraryName=");
        sb2.append(str);
        sb2.append(", enableFirelog=");
        sb2.append(z10);
        sb2.append(", firelogEventType=");
        sb2.append(i10);
        sb2.append("}");
        return sb2.toString();
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzne
    public final int zza() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzne
    public final String zzb() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzne
    public final boolean zzc() {
        return this.zzb;
    }
}

package com.google.android.gms.internal.mlkit_vision_common;

import androidx.appcompat.widget.a;

/* JADX INFO: compiled from: com.google.mlkit:vision-common@@17.2.0 */
/* JADX INFO: loaded from: classes9.dex */
final class zzko extends zzkr {
    private final String zza;
    private final boolean zzb;
    private final int zzc;

    public /* synthetic */ zzko(String str, boolean z10, int i10, zzkn zzknVar) {
        this.zza = str;
        this.zzb = z10;
        this.zzc = i10;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzkr) {
            zzkr zzkrVar = (zzkr) obj;
            if (this.zza.equals(zzkrVar.zzb()) && this.zzb == zzkrVar.zzc() && this.zzc == zzkrVar.zza()) {
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
        StringBuilder sb2 = new StringBuilder("MLKitLoggingOptions{libraryName=");
        sb2.append(str);
        sb2.append(", enableFirelog=");
        sb2.append(z10);
        sb2.append(", firelogEventType=");
        return a.c(sb2, i10, "}");
    }

    @Override // com.google.android.gms.internal.mlkit_vision_common.zzkr
    public final int zza() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_common.zzkr
    public final String zzb() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_common.zzkr
    public final boolean zzc() {
        return this.zzb;
    }
}

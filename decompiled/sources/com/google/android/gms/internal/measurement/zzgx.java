package com.google.android.gms.internal.measurement;

import android.content.Context;
import androidx.collection.k;
import javax.annotation.Nullable;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@20.1.0 */
/* JADX INFO: loaded from: classes9.dex */
final class zzgx extends zzhs {
    private final Context zza;
    private final zzib zzb;

    public zzgx(Context context, @Nullable zzib zzibVar) {
        if (context == null) {
            throw new NullPointerException("Null context");
        }
        this.zza = context;
        this.zzb = zzibVar;
    }

    public final boolean equals(Object obj) {
        zzib zzibVar;
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzhs) {
            zzhs zzhsVar = (zzhs) obj;
            if (this.zza.equals(zzhsVar.zza()) && ((zzibVar = this.zzb) != null ? zzibVar.equals(zzhsVar.zzb()) : zzhsVar.zzb() == null)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (this.zza.hashCode() ^ 1000003) * 1000003;
        zzib zzibVar = this.zzb;
        return iHashCode ^ (zzibVar == null ? 0 : zzibVar.hashCode());
    }

    public final String toString() {
        String string = this.zza.toString();
        String strValueOf = String.valueOf(this.zzb);
        StringBuilder sb2 = new StringBuilder(string.length() + 46 + strValueOf.length());
        k.e(sb2, "FlagsContext{context=", string, ", hermeticFileOverrides=", strValueOf);
        sb2.append("}");
        return sb2.toString();
    }

    @Override // com.google.android.gms.internal.measurement.zzhs
    public final Context zza() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.measurement.zzhs
    @Nullable
    public final zzib zzb() {
        return this.zzb;
    }
}

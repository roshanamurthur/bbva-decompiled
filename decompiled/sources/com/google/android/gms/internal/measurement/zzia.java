package com.google.android.gms.internal.measurement;

import androidx.collection.f;
import javax.annotation.CheckForNull;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@20.1.0 */
/* JADX INFO: loaded from: classes9.dex */
final class zzia extends zzhz {
    private final Object zza;

    public zzia(Object obj) {
        this.zza = obj;
    }

    public final boolean equals(@CheckForNull Object obj) {
        if (obj instanceof zzia) {
            return this.zza.equals(((zzia) obj).zza);
        }
        return false;
    }

    public final int hashCode() {
        return this.zza.hashCode() + 1502476572;
    }

    public final String toString() {
        String string = this.zza.toString();
        return f.c(new StringBuilder(string.length() + 13), "Optional.of(", string, ")");
    }

    @Override // com.google.android.gms.internal.measurement.zzhz
    public final Object zza() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.measurement.zzhz
    public final boolean zzb() {
        return true;
    }
}

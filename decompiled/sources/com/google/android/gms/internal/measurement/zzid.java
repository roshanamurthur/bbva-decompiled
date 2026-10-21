package com.google.android.gms.internal.measurement;

import androidx.collection.f;
import javax.annotation.CheckForNull;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@20.1.0 */
/* JADX INFO: loaded from: classes9.dex */
final class zzid implements zzib {

    @CheckForNull
    volatile zzib zza;
    volatile boolean zzb;

    @CheckForNull
    Object zzc;

    public zzid(zzib zzibVar) {
        zzibVar.getClass();
        this.zza = zzibVar;
    }

    public final String toString() {
        Object objC = this.zza;
        if (objC == null) {
            String strValueOf = String.valueOf(this.zzc);
            objC = f.c(new StringBuilder(strValueOf.length() + 25), "<supplier that returned ", strValueOf, ">");
        }
        String string = objC.toString();
        return f.c(new StringBuilder(string.length() + 19), "Suppliers.memoize(", string, ")");
    }

    @Override // com.google.android.gms.internal.measurement.zzib
    public final Object zza() {
        if (!this.zzb) {
            synchronized (this) {
                try {
                    if (!this.zzb) {
                        zzib zzibVar = this.zza;
                        zzibVar.getClass();
                        Object objZza = zzibVar.zza();
                        this.zzc = objZza;
                        this.zzb = true;
                        this.zza = null;
                        return objZza;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return this.zzc;
    }
}

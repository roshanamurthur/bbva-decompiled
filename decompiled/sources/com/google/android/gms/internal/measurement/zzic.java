package com.google.android.gms.internal.measurement;

import androidx.collection.f;
import java.io.Serializable;
import javax.annotation.CheckForNull;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@20.1.0 */
/* JADX INFO: loaded from: classes9.dex */
final class zzic implements Serializable, zzib {
    final zzib zza;
    volatile transient boolean zzb;

    @CheckForNull
    transient Object zzc;

    public zzic(zzib zzibVar) {
        zzibVar.getClass();
        this.zza = zzibVar;
    }

    public final String toString() {
        Object objC;
        if (this.zzb) {
            String strValueOf = String.valueOf(this.zzc);
            objC = f.c(new StringBuilder(strValueOf.length() + 25), "<supplier that returned ", strValueOf, ">");
        } else {
            objC = this.zza;
        }
        String strValueOf2 = String.valueOf(objC);
        return f.c(new StringBuilder(strValueOf2.length() + 19), "Suppliers.memoize(", strValueOf2, ")");
    }

    @Override // com.google.android.gms.internal.measurement.zzib
    public final Object zza() {
        if (!this.zzb) {
            synchronized (this) {
                try {
                    if (!this.zzb) {
                        Object objZza = this.zza.zza();
                        this.zzc = objZza;
                        this.zzb = true;
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

package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement@@20.1.0 */
/* JADX INFO: loaded from: classes9.dex */
public abstract class zzaw {
    final List zza = new ArrayList();

    public abstract zzap zza(String str, zzg zzgVar, List list);

    public final zzap zzb(String str) {
        if (!this.zza.contains(zzh.zze(str))) {
            throw new IllegalArgumentException("Command not supported");
        }
        String strValueOf = String.valueOf(str);
        throw new UnsupportedOperationException(strValueOf.length() != 0 ? "Command not implemented: ".concat(strValueOf) : new String("Command not implemented: "));
    }
}

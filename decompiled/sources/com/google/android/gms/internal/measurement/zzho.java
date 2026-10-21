package com.google.android.gms.internal.measurement;

import javax.annotation.Nullable;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@20.1.0 */
/* JADX INFO: loaded from: classes9.dex */
final class zzho extends zzhu {
    public zzho(zzhr zzhrVar, String str, Boolean bool, boolean z10) {
        super(zzhrVar, str, bool, true, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.measurement.zzhu
    @Nullable
    public final /* bridge */ /* synthetic */ Object zza(Object obj) {
        if (zzgv.zzc.matcher(obj).matches()) {
            return Boolean.TRUE;
        }
        if (zzgv.zzd.matcher(obj).matches()) {
            return Boolean.FALSE;
        }
        new StringBuilder(((String) obj).length() + String.valueOf(super.zzc()).length() + 28);
        return null;
    }
}

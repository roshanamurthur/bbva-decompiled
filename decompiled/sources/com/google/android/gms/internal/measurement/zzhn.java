package com.google.android.gms.internal.measurement;

import javax.annotation.Nullable;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@20.1.0 */
/* JADX INFO: loaded from: classes9.dex */
final class zzhn extends zzhu {
    public zzhn(zzhr zzhrVar, String str, Long l6, boolean z10) {
        super(zzhrVar, str, l6, true, null);
    }

    @Override // com.google.android.gms.internal.measurement.zzhu
    @Nullable
    public final /* bridge */ /* synthetic */ Object zza(Object obj) {
        try {
            return Long.valueOf(Long.parseLong((String) obj));
        } catch (NumberFormatException unused) {
            new StringBuilder(((String) obj).length() + String.valueOf(super.zzc()).length() + 25);
            return null;
        }
    }
}

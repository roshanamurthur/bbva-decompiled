package com.google.android.gms.internal.measurement;

import javax.annotation.Nullable;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@20.1.0 */
/* JADX INFO: loaded from: classes9.dex */
final class zzhp extends zzhu {
    public zzhp(zzhr zzhrVar, String str, Double d2, boolean z10) {
        super(zzhrVar, "measurement.test.double_flag", d2, true, null);
    }

    @Override // com.google.android.gms.internal.measurement.zzhu
    @Nullable
    public final /* bridge */ /* synthetic */ Object zza(Object obj) {
        try {
            return Double.valueOf(Double.parseDouble((String) obj));
        } catch (NumberFormatException unused) {
            new StringBuilder(((String) obj).length() + String.valueOf(super.zzc()).length() + 27);
            return null;
        }
    }
}

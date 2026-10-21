package com.google.android.gms.internal.auth;

import javax.annotation.Nullable;

/* JADX INFO: compiled from: com.google.android.gms:play-services-auth-base@@18.0.10 */
/* JADX INFO: loaded from: classes9.dex */
final class zzcx extends zzdc {
    public zzcx(zzcz zzczVar, String str, Double d2, boolean z10) {
        super(zzczVar, str, d2, true, null);
    }

    @Override // com.google.android.gms.internal.auth.zzdc
    @Nullable
    public final /* synthetic */ Object zza(Object obj) {
        try {
            return Double.valueOf(Double.parseDouble((String) obj));
        } catch (NumberFormatException unused) {
            return null;
        }
    }
}

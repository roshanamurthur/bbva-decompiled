package com.google.android.gms.internal.auth;

import javax.annotation.Nullable;

/* JADX INFO: compiled from: com.google.android.gms:play-services-auth-base@@18.0.10 */
/* JADX INFO: loaded from: classes9.dex */
final class zzcv extends zzdc {
    public zzcv(zzcz zzczVar, String str, Long l6, boolean z10) {
        super(zzczVar, str, l6, true, null);
    }

    @Override // com.google.android.gms.internal.auth.zzdc
    @Nullable
    public final /* synthetic */ Object zza(Object obj) {
        try {
            return Long.valueOf(Long.parseLong((String) obj));
        } catch (NumberFormatException unused) {
            return null;
        }
    }
}

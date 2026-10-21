package com.google.android.gms.internal.mlkit_vision_barcode;

import androidx.annotation.Nullable;

/* JADX INFO: compiled from: com.google.android.gms:play-services-mlkit-barcode-scanning@@18.0.0 */
/* JADX INFO: loaded from: classes9.dex */
public final class zzny {

    @Nullable
    private static zzny zza;

    private zzny() {
    }

    public static synchronized zzny zza() {
        try {
            if (zza == null) {
                zza = new zzny();
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return zza;
    }
}

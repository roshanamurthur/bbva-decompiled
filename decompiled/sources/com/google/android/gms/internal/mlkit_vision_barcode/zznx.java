package com.google.android.gms.internal.mlkit_vision_barcode;

import androidx.annotation.Nullable;

/* JADX INFO: compiled from: com.google.android.gms:play-services-mlkit-barcode-scanning@@18.0.0 */
/* JADX INFO: loaded from: classes9.dex */
public final class zznx {

    @Nullable
    private static zznw zza;

    public static synchronized zznm zza(zzne zzneVar) {
        try {
            if (zza == null) {
                zza = new zznw(null);
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return (zznm) zza.get(zzneVar);
    }

    public static synchronized zznm zzb(String str) {
        return zza(zzne.zzd(str).zzd());
    }
}

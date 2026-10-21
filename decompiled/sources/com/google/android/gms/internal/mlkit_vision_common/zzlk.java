package com.google.android.gms.internal.mlkit_vision_common;

import androidx.annotation.Nullable;

/* JADX INFO: compiled from: com.google.mlkit:vision-common@@17.2.0 */
/* JADX INFO: loaded from: classes9.dex */
public final class zzlk {

    @Nullable
    private static zzlk zza;

    private zzlk() {
    }

    public static synchronized zzlk zza() {
        try {
            if (zza == null) {
                zza = new zzlk();
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return zza;
    }

    public static final boolean zzb() {
        return zzlj.zza("mlkit-dev-profiling");
    }
}

package com.google.android.gms.internal.measurement;

import android.os.Build;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@20.1.0 */
/* JADX INFO: loaded from: classes9.dex */
public final class zzgw {
    private static volatile boolean zza = !zza();

    public static boolean zza() {
        return Build.VERSION.SDK_INT >= 24;
    }
}

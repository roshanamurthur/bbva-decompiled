package com.google.android.gms.internal.mlkit_vision_common;

import android.os.SystemClock;
import androidx.annotation.WorkerThread;

/* JADX INFO: compiled from: com.google.mlkit:vision-common@@17.2.0 */
/* JADX INFO: loaded from: classes9.dex */
public final class zzli {
    @WorkerThread
    public static void zza(zzkx zzkxVar, int i10, int i11, long j10, int i12, int i13, int i14, int i15) {
        zzkxVar.zzc(zzc(i10, i11, j10, i12, i13, i14, i15), zzhs.INPUT_IMAGE_CONSTRUCTION);
    }

    @WorkerThread
    public static void zzb(zzkx zzkxVar, int i10, int i11, long j10, int i12, int i13, int i14, int i15) {
        zzkxVar.zzc(zzc(i10, i11, j10, i12, i13, i14, i15), zzhs.ODML_IMAGE);
    }

    private static zzlh zzc(int i10, int i11, long j10, int i12, int i13, int i14, int i15) {
        return new zzlh(i10, i11, i14, i12, i13, SystemClock.elapsedRealtime() - j10, i15);
    }
}

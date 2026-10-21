package com.google.android.play.core.appupdate;

import android.content.Context;
import androidx.annotation.NonNull;
import com.google.android.play.core.appupdate.internal.zzz;

/* JADX INFO: compiled from: com.google.android.play:app-update@@2.1.0 */
/* JADX INFO: loaded from: classes10.dex */
public final class AppUpdateManagerFactory {
    @NonNull
    public static AppUpdateManager create(@NonNull Context context) {
        zza zzaVar;
        synchronized (zzb.class) {
            try {
                if (zzb.f46109a == null) {
                    zzab zzabVar = new zzab();
                    zzabVar.zzb(new b(zzz.zza(context)));
                    zzb.f46109a = zzabVar.zza();
                }
                zzaVar = zzb.f46109a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return zzaVar.zza();
    }
}

package com.google.android.gms.cloudmessaging;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.google.android.gms.common.util.concurrent.NamedThreadFactory;
import com.google.android.gms.tasks.Task;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import javax.annotation.concurrent.GuardedBy;

/* JADX INFO: compiled from: com.google.android.gms:play-services-cloud-messaging@@17.0.0 */
/* JADX INFO: loaded from: classes9.dex */
public final class zzs {

    @Nullable
    @GuardedBy("MessengerIpcClient.class")
    private static zzs zza;
    private final Context zzb;
    private final ScheduledExecutorService zzc;

    @GuardedBy("this")
    private zzm zzd = new zzm(this, null);

    @GuardedBy("this")
    private int zze = 1;

    @VisibleForTesting
    public zzs(Context context, ScheduledExecutorService scheduledExecutorService) {
        this.zzc = scheduledExecutorService;
        this.zzb = context.getApplicationContext();
    }

    public static synchronized zzs zzb(Context context) {
        try {
            if (zza == null) {
                com.google.android.gms.internal.cloudmessaging.zze.zza();
                zza = new zzs(context, Executors.unconfigurableScheduledExecutorService(Executors.newScheduledThreadPool(1, new NamedThreadFactory("MessengerIpcClient"))));
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return zza;
    }

    private final synchronized int zzf() {
        int i10;
        i10 = this.zze;
        this.zze = i10 + 1;
        return i10;
    }

    private final synchronized <T> Task<T> zzg(zzp<T> zzpVar) {
        try {
            if (Log.isLoggable("MessengerIpcClient", 3)) {
                new StringBuilder(String.valueOf(zzpVar).length() + 9);
            }
            if (!this.zzd.zzg(zzpVar)) {
                zzm zzmVar = new zzm(this, null);
                this.zzd = zzmVar;
                zzmVar.zzg(zzpVar);
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return zzpVar.zzb.getTask();
    }

    public final Task<Void> zzc(int i10, Bundle bundle) {
        return zzg(new zzo(zzf(), 2, bundle));
    }

    public final Task<Bundle> zzd(int i10, Bundle bundle) {
        return zzg(new zzr(zzf(), 1, bundle));
    }
}

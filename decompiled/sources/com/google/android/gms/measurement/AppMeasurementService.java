package com.google.android.gms.measurement;

import android.app.Service;
import android.app.job.JobParameters;
import android.content.Intent;
import android.os.IBinder;
import androidx.annotation.MainThread;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.legacy.content.WakefulBroadcastReceiver;
import com.google.android.gms.measurement.internal.zzjq;
import com.google.android.gms.measurement.internal.zzjr;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement@@20.1.0 */
/* JADX INFO: loaded from: classes9.dex */
public final class AppMeasurementService extends Service implements zzjq {
    private zzjr zza;

    private final zzjr zzd() {
        if (this.zza == null) {
            this.zza = new zzjr(this);
        }
        return this.zza;
    }

    @Override // android.app.Service
    @Nullable
    @MainThread
    public IBinder onBind(@NonNull Intent intent) {
        return zzd().zzb(intent);
    }

    @Override // android.app.Service
    @MainThread
    public void onCreate() {
        super.onCreate();
        zzd().zze();
    }

    @Override // android.app.Service
    @MainThread
    public void onDestroy() {
        zzd().zzf();
        super.onDestroy();
    }

    @Override // android.app.Service
    @MainThread
    public void onRebind(@NonNull Intent intent) {
        zzd().zzg(intent);
    }

    @Override // android.app.Service
    @MainThread
    public int onStartCommand(@NonNull Intent intent, int i10, int i11) {
        zzd().zza(intent, i10, i11);
        return 2;
    }

    @Override // android.app.Service
    @MainThread
    public boolean onUnbind(@NonNull Intent intent) {
        zzd().zzj(intent);
        return true;
    }

    @Override // com.google.android.gms.measurement.internal.zzjq
    public final void zza(@NonNull Intent intent) {
        WakefulBroadcastReceiver.completeWakefulIntent(intent);
    }

    @Override // com.google.android.gms.measurement.internal.zzjq
    public final void zzb(@NonNull JobParameters jobParameters, boolean z10) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.android.gms.measurement.internal.zzjq
    public final boolean zzc(int i10) {
        return stopSelfResult(i10);
    }
}

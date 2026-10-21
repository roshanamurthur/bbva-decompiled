package com.google.android.gms.measurement.internal;

import android.annotation.TargetApi;
import android.app.job.JobParameters;
import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import androidx.annotation.MainThread;
import com.google.android.gms.common.internal.Preconditions;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement@@20.1.0 */
/* JADX INFO: loaded from: classes9.dex */
public final class zzjr {
    private final Context zza;

    public zzjr(Context context) {
        Preconditions.checkNotNull(context);
        this.zza = context;
    }

    private final zzeh zzk() {
        return zzfr.zzp(this.zza, null, null).zzay();
    }

    @MainThread
    public final int zza(final Intent intent, int i10, final int i11) {
        zzfr zzfrVarZzp = zzfr.zzp(this.zza, null, null);
        final zzeh zzehVarZzay = zzfrVarZzp.zzay();
        if (intent == null) {
            zzehVarZzay.zzk().zza("AppMeasurementService started with null intent");
            return 2;
        }
        String action = intent.getAction();
        zzfrVarZzp.zzaw();
        zzehVarZzay.zzj().zzc("Local AppMeasurementService called. startId, action", Integer.valueOf(i11), action);
        if ("com.google.android.gms.measurement.UPLOAD".equals(action)) {
            zzh(new Runnable() { // from class: com.google.android.gms.measurement.internal.zzjn
                @Override // java.lang.Runnable
                public final void run() {
                    this.zza.zzc(i11, zzehVarZzay, intent);
                }
            });
        }
        return 2;
    }

    @MainThread
    public final IBinder zzb(Intent intent) {
        if (intent == null) {
            zzk().zzd().zza("onBind called with null intent");
            return null;
        }
        String action = intent.getAction();
        if ("com.google.android.gms.measurement.START".equals(action)) {
            return new zzgj(zzkp.zzt(this.zza), null);
        }
        zzk().zzk().zzb("onBind received unknown action", action);
        return null;
    }

    public final /* synthetic */ void zzc(int i10, zzeh zzehVar, Intent intent) {
        if (((zzjq) this.zza).zzc(i10)) {
            zzehVar.zzj().zzb("Local AppMeasurementService processed last upload request. StartId", Integer.valueOf(i10));
            zzk().zzj().zza("Completed wakeful intent.");
            ((zzjq) this.zza).zza(intent);
        }
    }

    public final /* synthetic */ void zzd(zzeh zzehVar, JobParameters jobParameters) {
        zzehVar.zzj().zza("AppMeasurementJobService processed last upload request.");
        ((zzjq) this.zza).zzb(jobParameters, false);
    }

    @MainThread
    public final void zze() {
        zzfr zzfrVarZzp = zzfr.zzp(this.zza, null, null);
        zzeh zzehVarZzay = zzfrVarZzp.zzay();
        zzfrVarZzp.zzaw();
        zzehVarZzay.zzj().zza("Local AppMeasurementService is starting up");
    }

    @MainThread
    public final void zzf() {
        zzfr zzfrVarZzp = zzfr.zzp(this.zza, null, null);
        zzeh zzehVarZzay = zzfrVarZzp.zzay();
        zzfrVarZzp.zzaw();
        zzehVarZzay.zzj().zza("Local AppMeasurementService is shutting down");
    }

    @MainThread
    public final void zzg(Intent intent) {
        if (intent == null) {
            zzk().zzd().zza("onRebind called with null intent");
        } else {
            zzk().zzj().zzb("onRebind called. action", intent.getAction());
        }
    }

    public final void zzh(Runnable runnable) {
        zzkp zzkpVarZzt = zzkp.zzt(this.zza);
        zzkpVarZzt.zzaz().zzp(new zzjp(this, zzkpVarZzt, runnable));
    }

    @TargetApi(24)
    @MainThread
    public final boolean zzi(final JobParameters jobParameters) {
        zzfr zzfrVarZzp = zzfr.zzp(this.zza, null, null);
        final zzeh zzehVarZzay = zzfrVarZzp.zzay();
        String string = jobParameters.getExtras().getString("action");
        zzfrVarZzp.zzaw();
        zzehVarZzay.zzj().zzb("Local AppMeasurementJobService called. action", string);
        if (!"com.google.android.gms.measurement.UPLOAD".equals(string)) {
            return true;
        }
        zzh(new Runnable() { // from class: com.google.android.gms.measurement.internal.zzjo
            @Override // java.lang.Runnable
            public final void run() {
                this.zza.zzd(zzehVarZzay, jobParameters);
            }
        });
        return true;
    }

    @MainThread
    public final boolean zzj(Intent intent) {
        if (intent == null) {
            zzk().zzd().zza("onUnbind called with null intent");
            return true;
        }
        zzk().zzj().zzb("onUnbind called for intent. action", intent.getAction());
        return true;
    }
}

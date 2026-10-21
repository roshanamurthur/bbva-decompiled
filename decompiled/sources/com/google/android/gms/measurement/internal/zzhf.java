package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.measurement.api.AppMeasurementSdk;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@20.1.0 */
/* JADX INFO: loaded from: classes9.dex */
final class zzhf implements Runnable {
    final /* synthetic */ Bundle zza;
    final /* synthetic */ zzhw zzb;

    public zzhf(zzhw zzhwVar, Bundle bundle) {
        this.zzb = zzhwVar;
        this.zza = bundle;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzhw zzhwVar = this.zzb;
        Bundle bundle = this.zza;
        zzhwVar.zzg();
        zzhwVar.zza();
        Preconditions.checkNotNull(bundle);
        String string = bundle.getString("name");
        String string2 = bundle.getString("origin");
        Preconditions.checkNotEmpty(string);
        Preconditions.checkNotEmpty(string2);
        Preconditions.checkNotNull(bundle.get("value"));
        if (!zzhwVar.zzs.zzJ()) {
            androidx.activity.a.g(zzhwVar.zzs, "Conditional property not set since app measurement is disabled");
            return;
        }
        zzks zzksVar = new zzks(string, bundle.getLong(AppMeasurementSdk.ConditionalUserProperty.TRIGGERED_TIMESTAMP), bundle.get("value"), string2);
        try {
            zzau zzauVarZzz = zzhwVar.zzs.zzv().zzz(bundle.getString("app_id"), bundle.getString(AppMeasurementSdk.ConditionalUserProperty.TRIGGERED_EVENT_NAME), bundle.getBundle(AppMeasurementSdk.ConditionalUserProperty.TRIGGERED_EVENT_PARAMS), string2, 0L, true, true);
            zzhwVar.zzs.zzt().zzE(new zzab(bundle.getString("app_id"), string2, zzksVar, bundle.getLong(AppMeasurementSdk.ConditionalUserProperty.CREATION_TIMESTAMP), false, bundle.getString(AppMeasurementSdk.ConditionalUserProperty.TRIGGER_EVENT_NAME), zzhwVar.zzs.zzv().zzz(bundle.getString("app_id"), bundle.getString(AppMeasurementSdk.ConditionalUserProperty.TIMED_OUT_EVENT_NAME), bundle.getBundle(AppMeasurementSdk.ConditionalUserProperty.TIMED_OUT_EVENT_PARAMS), string2, 0L, true, true), bundle.getLong(AppMeasurementSdk.ConditionalUserProperty.TRIGGER_TIMEOUT), zzauVarZzz, bundle.getLong(AppMeasurementSdk.ConditionalUserProperty.TIME_TO_LIVE), zzhwVar.zzs.zzv().zzz(bundle.getString("app_id"), bundle.getString(AppMeasurementSdk.ConditionalUserProperty.EXPIRED_EVENT_NAME), bundle.getBundle(AppMeasurementSdk.ConditionalUserProperty.EXPIRED_EVENT_PARAMS), string2, 0L, true, true)));
        } catch (IllegalArgumentException unused) {
        }
    }
}

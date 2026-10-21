package com.google.android.gms.measurement.internal;

import android.app.ActivityManager;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.annotation.WorkerThread;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.internal.measurement.zznu;
import com.salesforce.marketingcloud.notifications.NotificationMessage;
import kotlinx.coroutines.DebugKt;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@20.1.0 */
/* JADX INFO: loaded from: classes9.dex */
final class zzjz {
    final /* synthetic */ zzka zza;

    public zzjz(zzka zzkaVar) {
        this.zza = zzkaVar;
    }

    @WorkerThread
    public final void zza() {
        this.zza.zzg();
        if (this.zza.zzs.zzm().zzk(this.zza.zzs.zzav().currentTimeMillis())) {
            this.zza.zzs.zzm().zzg.zza(true);
            ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
            ActivityManager.getMyMemoryState(runningAppProcessInfo);
            if (runningAppProcessInfo.importance == 100) {
                androidx.activity.a.g(this.zza.zzs, "Detected application was in foreground");
                zzc(this.zza.zzs.zzav().currentTimeMillis(), false);
            }
        }
    }

    @WorkerThread
    public final void zzb(long j10, boolean z10) {
        this.zza.zzg();
        this.zza.zzm();
        if (this.zza.zzs.zzm().zzk(j10)) {
            this.zza.zzs.zzm().zzg.zza(true);
        }
        this.zza.zzs.zzm().zzj.zzb(j10);
        if (this.zza.zzs.zzm().zzg.zzb()) {
            zzc(j10, z10);
        }
    }

    @VisibleForTesting
    @WorkerThread
    public final void zzc(long j10, boolean z10) {
        this.zza.zzg();
        if (this.zza.zzs.zzJ()) {
            this.zza.zzs.zzm().zzj.zzb(j10);
            this.zza.zzs.zzay().zzj().zzb("Session started, time", Long.valueOf(this.zza.zzs.zzav().elapsedRealtime()));
            Long lValueOf = Long.valueOf(j10 / 1000);
            this.zza.zzs.zzq().zzZ(DebugKt.DEBUG_PROPERTY_VALUE_AUTO, NotificationMessage.NOTIF_KEY_SID, lValueOf, j10);
            this.zza.zzs.zzm().zzg.zza(false);
            Bundle bundle = new Bundle();
            bundle.putLong(NotificationMessage.NOTIF_KEY_SID, lValueOf.longValue());
            if (this.zza.zzs.zzf().zzs(null, zzdu.zzZ) && z10) {
                bundle.putLong("_aib", 1L);
            }
            this.zza.zzs.zzq().zzH(DebugKt.DEBUG_PROPERTY_VALUE_AUTO, "_s", j10, bundle);
            zznu.zzc();
            if (this.zza.zzs.zzf().zzs(null, zzdu.zzac)) {
                String strZza = this.zza.zzs.zzm().zzo.zza();
                if (TextUtils.isEmpty(strZza)) {
                    return;
                }
                Bundle bundle2 = new Bundle();
                bundle2.putString("_ffr", strZza);
                this.zza.zzs.zzq().zzH(DebugKt.DEBUG_PROPERTY_VALUE_AUTO, "_ssr", j10, bundle2);
            }
        }
    }
}

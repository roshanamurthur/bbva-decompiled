package com.google.android.gms.measurement.internal;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.Application;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import androidx.annotation.MainThread;
import kotlinx.coroutines.DebugKt;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@20.1.0 */
/* JADX INFO: loaded from: classes9.dex */
@TargetApi(14)
@MainThread
final class zzhv implements Application.ActivityLifecycleCallbacks {
    final /* synthetic */ zzhw zza;

    public /* synthetic */ zzhv(zzhw zzhwVar, zzhu zzhuVar) {
        this.zza = zzhwVar;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        zzfr zzfrVar;
        Uri data;
        try {
            try {
                this.zza.zzs.zzay().zzj().zza("onActivityCreated");
                Intent intent = activity.getIntent();
                if (intent == null || (data = intent.getData()) == null || !data.isHierarchical()) {
                    zzfrVar = this.zza.zzs;
                } else {
                    this.zza.zzs.zzv();
                    String stringExtra = intent.getStringExtra("android.intent.extra.REFERRER_NAME");
                    this.zza.zzs.zzaz().zzp(new zzht(this, bundle == null, data, ("android-app://com.google.android.googlequicksearchbox/https/www.google.com".equals(stringExtra) || "https://www.google.com".equals(stringExtra) || "android-app://com.google.appcrawler".equals(stringExtra)) ? "gs" : DebugKt.DEBUG_PROPERTY_VALUE_AUTO, data.getQueryParameter("referrer")));
                    zzfrVar = this.zza.zzs;
                }
            } catch (RuntimeException e5) {
                this.zza.zzs.zzay().zzd().zzb("Throwable caught in onActivityCreated", e5);
                zzfrVar = this.zza.zzs;
            }
            zzik zzikVarZzs = zzfrVar.zzs();
        } finally {
            this.zza.zzs.zzs().zzr(activity, bundle);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        this.zza.zzs.zzs().zzs(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    @MainThread
    public final void onActivityPaused(Activity activity) {
        this.zza.zzs.zzs().zzt(activity);
        zzka zzkaVarZzu = this.zza.zzs.zzu();
        zzkaVarZzu.zzs.zzaz().zzp(new zzjt(zzkaVarZzu, zzkaVarZzu.zzs.zzav().elapsedRealtime()));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    @MainThread
    public final void onActivityResumed(Activity activity) {
        zzka zzkaVarZzu = this.zza.zzs.zzu();
        zzkaVarZzu.zzs.zzaz().zzp(new zzjs(zzkaVarZzu, zzkaVarZzu.zzs.zzav().elapsedRealtime()));
        this.zza.zzs.zzs().zzu(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        this.zza.zzs.zzs().zzv(activity, bundle);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
    }
}

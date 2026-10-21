package com.google.android.play.core.splitinstall;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import java.util.Iterator;
import java.util.LinkedHashSet;
import xe.x;

/* JADX INFO: compiled from: com.google.android.play:feature-delivery@@2.1.0 */
/* JADX INFO: loaded from: classes10.dex */
public final class zzx extends com.google.android.play.core.splitinstall.internal.zzs {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @Nullable
    public static zzx f46374h;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Handler f46375e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final zzg f46376f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final LinkedHashSet f46377g;

    @VisibleForTesting
    public zzx(Context context, zzg zzgVar) {
        super(new com.google.android.play.core.splitinstall.internal.zzu("SplitInstallListenerRegistry"), new IntentFilter("com.google.android.play.core.splitinstall.receiver.SplitInstallUpdateIntentService"), context);
        this.f46375e = new Handler(Looper.getMainLooper());
        this.f46377g = new LinkedHashSet();
        this.f46376f = zzgVar;
    }

    public static synchronized zzx zzg(Context context) {
        try {
            if (f46374h == null) {
                f46374h = new zzx(context, zzo.zza);
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return f46374h;
    }

    public final synchronized void c(SplitInstallStateUpdatedListener splitInstallStateUpdatedListener) {
        this.f46377g.add(splitInstallStateUpdatedListener);
    }

    public final synchronized void d(SplitInstallStateUpdatedListener splitInstallStateUpdatedListener) {
        this.f46377g.remove(splitInstallStateUpdatedListener);
    }

    @Override // com.google.android.play.core.splitinstall.internal.zzs
    public final void zza(Context context, Intent intent) {
        Bundle bundleExtra = intent.getBundleExtra("session_state");
        if (bundleExtra == null) {
            return;
        }
        SplitInstallSessionState splitInstallSessionStateZzd = SplitInstallSessionState.zzd(bundleExtra);
        this.zza.zza("ListenerRegistryBroadcastReceiver.onReceive: %s", splitInstallSessionStateZzd);
        zzh zzhVarZza = this.f46376f.zza();
        if (splitInstallSessionStateZzd.status() != 3 || zzhVarZza == null) {
            zzk(splitInstallSessionStateZzd);
        } else {
            zzhVarZza.zzd(splitInstallSessionStateZzd.c(), new x(this, splitInstallSessionStateZzd, intent, context));
        }
    }

    public final synchronized void zzk(SplitInstallSessionState splitInstallSessionState) {
        try {
            Iterator it = new LinkedHashSet(this.f46377g).iterator();
            while (it.hasNext()) {
                ((SplitInstallStateUpdatedListener) it.next()).onStateUpdate(splitInstallSessionState);
            }
            super.zze(splitInstallSessionState);
        } catch (Throwable th2) {
            throw th2;
        }
    }
}

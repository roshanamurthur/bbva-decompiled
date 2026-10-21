package com.google.android.play.core.splitinstall.internal;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import androidx.annotation.Nullable;
import com.google.android.play.core.listener.StateUpdatedListener;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: compiled from: com.google.android.play:feature-delivery@@2.1.0 */
/* JADX INFO: loaded from: classes10.dex */
public abstract class zzs {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final IntentFilter f46318a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Context f46319b;
    protected final zzu zza;
    protected final Set zzb = new HashSet();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public r f46320c = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public volatile boolean f46321d = false;

    public zzs(zzu zzuVar, IntentFilter intentFilter, Context context) {
        this.zza = zzuVar;
        this.f46318a = intentFilter;
        this.f46319b = zzbr.zza(context);
    }

    public final void a() {
        r rVar;
        if ((this.f46321d || !this.zzb.isEmpty()) && this.f46320c == null) {
            r rVar2 = new r(this);
            this.f46320c = rVar2;
            if (Build.VERSION.SDK_INT >= 33) {
                this.f46319b.registerReceiver(rVar2, this.f46318a, 2);
            } else {
                this.f46319b.registerReceiver(rVar2, this.f46318a);
            }
        }
        if (this.f46321d || !this.zzb.isEmpty() || (rVar = this.f46320c) == null) {
            return;
        }
        this.f46319b.unregisterReceiver(rVar);
        this.f46320c = null;
    }

    public abstract void zza(Context context, Intent intent);

    public final synchronized void zzb(StateUpdatedListener stateUpdatedListener) {
        this.zza.zzd("registerListener", new Object[0]);
        zzbv.zza(stateUpdatedListener, "Registered Play Core listener should not be null.");
        this.zzb.add(stateUpdatedListener);
        a();
    }

    public final synchronized void zzc(boolean z10) {
        this.f46321d = true;
        a();
    }

    public final synchronized void zzd(StateUpdatedListener stateUpdatedListener) {
        this.zza.zzd("unregisterListener", new Object[0]);
        zzbv.zza(stateUpdatedListener, "Unregistered Play Core listener should not be null.");
        this.zzb.remove(stateUpdatedListener);
        a();
    }

    public final synchronized void zze(Object obj) {
        Iterator it = new HashSet(this.zzb).iterator();
        while (it.hasNext()) {
            ((StateUpdatedListener) it.next()).onStateUpdate(obj);
        }
    }
}

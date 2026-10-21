package com.google.android.play.core.appupdate.internal;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import androidx.annotation.Nullable;
import com.google.android.play.core.listener.StateUpdatedListener;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: compiled from: com.google.android.play:app-update@@2.1.0 */
/* JADX INFO: loaded from: classes10.dex */
public abstract class zzl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final IntentFilter f46066a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Context f46067b;
    protected final zzm zza;
    protected final Set zzb = new HashSet();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public a f46068c = null;

    public zzl(zzm zzmVar, IntentFilter intentFilter, Context context) {
        this.zza = zzmVar;
        this.f46066a = intentFilter;
        this.f46067b = zzz.zza(context);
    }

    public final void a() {
        a aVar;
        boolean zIsEmpty = this.zzb.isEmpty();
        Context context = this.f46067b;
        if (!zIsEmpty && this.f46068c == null) {
            a aVar2 = new a(this);
            this.f46068c = aVar2;
            int i10 = Build.VERSION.SDK_INT;
            IntentFilter intentFilter = this.f46066a;
            if (i10 >= 33) {
                context.registerReceiver(aVar2, intentFilter, 2);
            } else {
                context.registerReceiver(aVar2, intentFilter);
            }
        }
        if (!this.zzb.isEmpty() || (aVar = this.f46068c) == null) {
            return;
        }
        context.unregisterReceiver(aVar);
        this.f46068c = null;
    }

    public abstract void zza(Context context, Intent intent);

    public final synchronized void zzb(StateUpdatedListener stateUpdatedListener) {
        this.zza.zzd("registerListener", new Object[0]);
        zzac.zza(stateUpdatedListener, "Registered Play Core listener should not be null.");
        this.zzb.add(stateUpdatedListener);
        a();
    }

    public final synchronized void zzc(StateUpdatedListener stateUpdatedListener) {
        this.zza.zzd("unregisterListener", new Object[0]);
        zzac.zza(stateUpdatedListener, "Unregistered Play Core listener should not be null.");
        this.zzb.remove(stateUpdatedListener);
        a();
    }

    public final synchronized void zzd(Object obj) {
        Iterator it = new HashSet(this.zzb).iterator();
        while (it.hasNext()) {
            ((StateUpdatedListener) it.next()).onStateUpdate(obj);
        }
    }
}

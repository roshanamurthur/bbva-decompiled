package com.google.android.play.core.appupdate.internal;

import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import androidx.annotation.GuardedBy;
import androidx.annotation.Nullable;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: com.google.android.play:app-update@@2.1.0 */
/* JADX INFO: loaded from: classes10.dex */
public final class zzx {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final HashMap f46071n = new HashMap();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f46072a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final zzm f46073b;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f46078g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Intent f46079h;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @Nullable
    public f f46083l;

    @Nullable
    public IInterface m;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ArrayList f46075d = new ArrayList();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @GuardedBy("attachedRemoteTasksLock")
    public final HashSet f46076e = new HashSet();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Object f46077f = new Object();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final zzp f46081j = new IBinder.DeathRecipient() { // from class: com.google.android.play.core.appupdate.internal.zzp
        @Override // android.os.IBinder.DeathRecipient
        public final void binderDied() {
            zzx.zzj(this.zza);
        }
    };

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @GuardedBy("attachedRemoteTasksLock")
    public final AtomicInteger f46082k = new AtomicInteger(0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f46074c = "AppUpdateService";

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final WeakReference f46080i = new WeakReference(null);

    /* JADX WARN: Type inference failed for: r3v4, types: [com.google.android.play.core.appupdate.internal.zzp] */
    public zzx(Context context, zzm zzmVar, String str, Intent intent, com.google.android.play.core.appupdate.zzl zzlVar, @Nullable zzs zzsVar) {
        this.f46072a = context;
        this.f46073b = zzmVar;
        this.f46079h = intent;
    }

    public static /* bridge */ /* synthetic */ void a(zzx zzxVar, zzn zznVar) {
        IInterface iInterface = zzxVar.m;
        ArrayList arrayList = zzxVar.f46075d;
        int i10 = 0;
        zzm zzmVar = zzxVar.f46073b;
        if (iInterface != null || zzxVar.f46078g) {
            if (!zzxVar.f46078g) {
                zznVar.run();
                return;
            } else {
                zzmVar.zzd("Waiting to bind to the service.", new Object[0]);
                arrayList.add(zznVar);
                return;
            }
        }
        zzmVar.zzd("Initiate binding to the service.", new Object[0]);
        arrayList.add(zznVar);
        f fVar = new f(zzxVar, i10);
        zzxVar.f46083l = fVar;
        zzxVar.f46078g = true;
        if (zzxVar.f46072a.bindService(zzxVar.f46079h, fVar, 1)) {
            return;
        }
        zzmVar.zzd("Failed to bind to the service.", new Object[0]);
        zzxVar.f46078g = false;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((zzn) it.next()).zzc(new zzy());
        }
        arrayList.clear();
    }

    public static void zzj(zzx zzxVar) {
        zzxVar.f46073b.zzd("reportBinderDeath", new Object[0]);
        zzs zzsVar = (zzs) zzxVar.f46080i.get();
        if (zzsVar != null) {
            zzxVar.f46073b.zzd("calling onBinderDied", new Object[0]);
            zzsVar.zza();
        } else {
            zzxVar.f46073b.zzd("%s : Binder has died.", zzxVar.f46074c);
            Iterator it = zzxVar.f46075d.iterator();
            while (it.hasNext()) {
                ((zzn) it.next()).zzc(new RemoteException(String.valueOf(zzxVar.f46074c).concat(" : Binder has died.")));
            }
            zzxVar.f46075d.clear();
        }
        synchronized (zzxVar.f46077f) {
            zzxVar.b();
        }
    }

    @GuardedBy("attachedRemoteTasksLock")
    public final void b() {
        HashSet hashSet = this.f46076e;
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            ((TaskCompletionSource) it.next()).trySetException(new RemoteException(String.valueOf(this.f46074c).concat(" : Binder has died.")));
        }
        hashSet.clear();
    }

    public final Handler zzc() {
        Handler handler;
        HashMap map = f46071n;
        synchronized (map) {
            try {
                if (!map.containsKey(this.f46074c)) {
                    HandlerThread handlerThread = new HandlerThread(this.f46074c, 10);
                    handlerThread.start();
                    map.put(this.f46074c, new Handler(handlerThread.getLooper()));
                }
                handler = (Handler) map.get(this.f46074c);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return handler;
    }

    @Nullable
    public final IInterface zze() {
        return this.m;
    }

    public final void zzs(zzn zznVar, @Nullable TaskCompletionSource taskCompletionSource) {
        zzc().post(new b(this, zznVar.f46070p0, taskCompletionSource, zznVar));
    }

    public final void zzu(TaskCompletionSource taskCompletionSource) {
        synchronized (this.f46077f) {
            this.f46076e.remove(taskCompletionSource);
        }
        zzc().post(new c(this));
    }
}

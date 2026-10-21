package com.google.android.play.core.splitinstall.internal;

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

/* JADX INFO: compiled from: com.google.android.play:feature-delivery@@2.1.0 */
/* JADX INFO: loaded from: classes10.dex */
public final class zzaf {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final HashMap f46285n = new HashMap();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f46286a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final zzu f46287b;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f46292g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Intent f46293h;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @Nullable
    public d f46297l;

    @Nullable
    public IInterface m;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ArrayList f46289d = new ArrayList();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @GuardedBy("attachedRemoteTasksLock")
    public final HashSet f46290e = new HashSet();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Object f46291f = new Object();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final zzx f46295j = new IBinder.DeathRecipient() { // from class: com.google.android.play.core.splitinstall.internal.zzx
        @Override // android.os.IBinder.DeathRecipient
        public final void binderDied() {
            zzaf.zzj(this.zza);
        }
    };

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @GuardedBy("attachedRemoteTasksLock")
    public final AtomicInteger f46296k = new AtomicInteger(0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f46288c = "SplitInstallService";

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final WeakReference f46294i = new WeakReference(null);

    /* JADX WARN: Type inference failed for: r3v4, types: [com.google.android.play.core.splitinstall.internal.zzx] */
    public zzaf(Context context, zzu zzuVar, String str, Intent intent, com.google.android.play.core.splitinstall.zzak zzakVar, @Nullable zzaa zzaaVar) {
        this.f46286a = context;
        this.f46287b = zzuVar;
        this.f46293h = intent;
    }

    public static /* bridge */ /* synthetic */ void a(zzaf zzafVar, zzv zzvVar) {
        IInterface iInterface = zzafVar.m;
        ArrayList arrayList = zzafVar.f46289d;
        zzu zzuVar = zzafVar.f46287b;
        if (iInterface != null || zzafVar.f46292g) {
            if (!zzafVar.f46292g) {
                zzvVar.run();
                return;
            } else {
                zzuVar.zzd("Waiting to bind to the service.", new Object[0]);
                arrayList.add(zzvVar);
                return;
            }
        }
        zzuVar.zzd("Initiate binding to the service.", new Object[0]);
        arrayList.add(zzvVar);
        d dVar = new d(zzafVar);
        zzafVar.f46297l = dVar;
        zzafVar.f46292g = true;
        if (zzafVar.f46286a.bindService(zzafVar.f46293h, dVar, 1)) {
            return;
        }
        zzuVar.zzd("Failed to bind to the service.", new Object[0]);
        zzafVar.f46292g = false;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((zzv) it.next()).zzb(new zzag());
        }
        arrayList.clear();
    }

    public static void zzj(zzaf zzafVar) {
        zzafVar.f46287b.zzd("reportBinderDeath", new Object[0]);
        zzaa zzaaVar = (zzaa) zzafVar.f46294i.get();
        if (zzaaVar != null) {
            zzafVar.f46287b.zzd("calling onBinderDied", new Object[0]);
            zzaaVar.zza();
        } else {
            zzafVar.f46287b.zzd("%s : Binder has died.", zzafVar.f46288c);
            Iterator it = zzafVar.f46289d.iterator();
            while (it.hasNext()) {
                ((zzv) it.next()).zzb(new RemoteException(String.valueOf(zzafVar.f46288c).concat(" : Binder has died.")));
            }
            zzafVar.f46289d.clear();
        }
        synchronized (zzafVar.f46291f) {
            zzafVar.b();
        }
    }

    @GuardedBy("attachedRemoteTasksLock")
    public final void b() {
        HashSet hashSet = this.f46290e;
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            ((TaskCompletionSource) it.next()).trySetException(new RemoteException(String.valueOf(this.f46288c).concat(" : Binder has died.")));
        }
        hashSet.clear();
    }

    public final Handler zzc() {
        Handler handler;
        HashMap map = f46285n;
        synchronized (map) {
            try {
                if (!map.containsKey(this.f46288c)) {
                    HandlerThread handlerThread = new HandlerThread(this.f46288c, 10);
                    handlerThread.start();
                    map.put(this.f46288c, new Handler(handlerThread.getLooper()));
                }
                handler = (Handler) map.get(this.f46288c);
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

    public final void zzs(zzv zzvVar, @Nullable TaskCompletionSource taskCompletionSource) {
        zzc().post(new s(this, zzvVar.f46323p0, taskCompletionSource, zzvVar));
    }

    public final void zzu(TaskCompletionSource taskCompletionSource) {
        synchronized (this.f46291f) {
            this.f46290e.remove(taskCompletionSource);
        }
        zzc().post(new t(this));
    }
}

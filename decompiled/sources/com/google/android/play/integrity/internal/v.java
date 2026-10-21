package com.google.android.play.integrity.internal;

import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import androidx.annotation.GuardedBy;
import androidx.annotation.Nullable;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: com.google.android.play:integrity@@1.1.0 */
/* JADX INFO: loaded from: classes10.dex */
public final class v {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final HashMap f46386n = new HashMap();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f46387a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final k f46388b;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f46393g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Intent f46394h;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @Nullable
    public com.google.android.play.core.appupdate.internal.f f46398l;

    @Nullable
    public IInterface m;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ArrayList f46390d = new ArrayList();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @GuardedBy("attachedRemoteTasksLock")
    public final HashSet f46391e = new HashSet();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Object f46392f = new Object();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final n f46396j = new IBinder.DeathRecipient() { // from class: com.google.android.play.integrity.internal.n
        @Override // android.os.IBinder.DeathRecipient
        public final void binderDied() {
            v.h(this.f46385a);
        }
    };

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @GuardedBy("attachedRemoteTasksLock")
    public final AtomicInteger f46397k = new AtomicInteger(0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f46389c = "IntegrityService";

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final WeakReference f46395i = new WeakReference(null);

    /* JADX WARN: Type inference failed for: r3v4, types: [com.google.android.play.integrity.internal.n] */
    public v(Context context, k kVar, String str, Intent intent, com.google.android.play.core.integrity.q qVar, @Nullable q qVar2, byte[] bArr) {
        this.f46387a = context;
        this.f46388b = kVar;
        this.f46394h = intent;
    }

    public static void h(v vVar) {
        vVar.f46388b.d("reportBinderDeath", new Object[0]);
        q qVar = (q) vVar.f46395i.get();
        k kVar = vVar.f46388b;
        if (qVar != null) {
            kVar.d("calling onBinderDied", new Object[0]);
            qVar.a();
        } else {
            String str = vVar.f46389c;
            kVar.d("%s : Binder has died.", str);
            ArrayList arrayList = vVar.f46390d;
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((l) it.next()).a(new RemoteException(String.valueOf(str).concat(" : Binder has died.")));
            }
            arrayList.clear();
        }
        vVar.a();
    }

    public final void a() {
        synchronized (this.f46392f) {
            try {
                Iterator it = this.f46391e.iterator();
                while (it.hasNext()) {
                    ((TaskCompletionSource) it.next()).trySetException(new RemoteException(String.valueOf(this.f46389c).concat(" : Binder has died.")));
                }
                this.f46391e.clear();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final Handler c() {
        Handler handler;
        HashMap map = f46386n;
        synchronized (map) {
            try {
                if (!map.containsKey(this.f46389c)) {
                    HandlerThread handlerThread = new HandlerThread(this.f46389c, 10);
                    handlerThread.start();
                    map.put(this.f46389c, new Handler(handlerThread.getLooper()));
                }
                handler = (Handler) map.get(this.f46389c);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return handler;
    }

    @Nullable
    public final IInterface e() {
        return this.m;
    }

    public final void p(l lVar, @Nullable final TaskCompletionSource taskCompletionSource) {
        synchronized (this.f46392f) {
            this.f46391e.add(taskCompletionSource);
            taskCompletionSource.getTask().addOnCompleteListener(new OnCompleteListener() { // from class: com.google.android.play.integrity.internal.m
                @Override // com.google.android.gms.tasks.OnCompleteListener
                public final void onComplete(Task task) {
                    v vVar = this.f46383a;
                    TaskCompletionSource taskCompletionSource2 = taskCompletionSource;
                    synchronized (vVar.f46392f) {
                        vVar.f46391e.remove(taskCompletionSource2);
                    }
                }
            });
        }
        synchronized (this.f46392f) {
            try {
                if (this.f46397k.getAndIncrement() > 0) {
                    this.f46388b.a("Already connected to the service.", new Object[0]);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        c().post(new ze.b(this, lVar.f46382p0, lVar));
    }

    public final void r(TaskCompletionSource taskCompletionSource) {
        synchronized (this.f46392f) {
            this.f46391e.remove(taskCompletionSource);
        }
        synchronized (this.f46392f) {
            try {
                if (this.f46397k.get() > 0 && this.f46397k.decrementAndGet() > 0) {
                    this.f46388b.d("Leaving the connection open for other ongoing calls.", new Object[0]);
                } else {
                    c().post(new ze.c(this));
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}

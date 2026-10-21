package com.google.android.play.core.review.internal;

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
import ve.a;
import ve.b;
import ve.e;

/* JADX INFO: compiled from: com.google.android.play:review@@2.0.1 */
/* JADX INFO: loaded from: classes10.dex */
public final class zzt {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final HashMap f46216n = new HashMap();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f46217a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final zzi f46218b;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f46223g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Intent f46224h;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @Nullable
    public e f46228l;

    @Nullable
    public IInterface m;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ArrayList f46220d = new ArrayList();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @GuardedBy("attachedRemoteTasksLock")
    public final HashSet f46221e = new HashSet();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Object f46222f = new Object();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final zzl f46226j = new IBinder.DeathRecipient() { // from class: com.google.android.play.core.review.internal.zzl
        @Override // android.os.IBinder.DeathRecipient
        public final void binderDied() {
            zzt.zzh(this.zza);
        }
    };

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @GuardedBy("attachedRemoteTasksLock")
    public final AtomicInteger f46227k = new AtomicInteger(0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f46219c = "com.google.android.finsky.inappreviewservice.InAppReviewService";

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final WeakReference f46225i = new WeakReference(null);

    /* JADX WARN: Type inference failed for: r3v4, types: [com.google.android.play.core.review.internal.zzl] */
    public zzt(Context context, zzi zziVar, String str, Intent intent, com.google.android.play.core.review.zze zzeVar, @Nullable zzo zzoVar, byte[] bArr) {
        this.f46217a = context;
        this.f46218b = zziVar;
        this.f46224h = intent;
    }

    public static void zzh(zzt zztVar) {
        zztVar.f46218b.zzd("reportBinderDeath", new Object[0]);
        zzo zzoVar = (zzo) zztVar.f46225i.get();
        zzi zziVar = zztVar.f46218b;
        if (zzoVar != null) {
            zziVar.zzd("calling onBinderDied", new Object[0]);
            zzoVar.zza();
        } else {
            String str = zztVar.f46219c;
            zziVar.zzd("%s : Binder has died.", str);
            ArrayList arrayList = zztVar.f46220d;
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((zzj) it.next()).zzc(new RemoteException(String.valueOf(str).concat(" : Binder has died.")));
            }
            arrayList.clear();
        }
        zztVar.a();
    }

    public final void a() {
        synchronized (this.f46222f) {
            try {
                Iterator it = this.f46221e.iterator();
                while (it.hasNext()) {
                    ((TaskCompletionSource) it.next()).trySetException(new RemoteException(String.valueOf(this.f46219c).concat(" : Binder has died.")));
                }
                this.f46221e.clear();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final Handler zzc() {
        Handler handler;
        HashMap map = f46216n;
        synchronized (map) {
            try {
                if (!map.containsKey(this.f46219c)) {
                    HandlerThread handlerThread = new HandlerThread(this.f46219c, 10);
                    handlerThread.start();
                    map.put(this.f46219c, new Handler(handlerThread.getLooper()));
                }
                handler = (Handler) map.get(this.f46219c);
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

    public final void zzp(zzj zzjVar, @Nullable final TaskCompletionSource taskCompletionSource) {
        synchronized (this.f46222f) {
            this.f46221e.add(taskCompletionSource);
            taskCompletionSource.getTask().addOnCompleteListener(new OnCompleteListener() { // from class: com.google.android.play.core.review.internal.zzk
                @Override // com.google.android.gms.tasks.OnCompleteListener
                public final void onComplete(Task task) {
                    zzt zztVar = this.zza;
                    TaskCompletionSource taskCompletionSource2 = taskCompletionSource;
                    synchronized (zztVar.f46222f) {
                        zztVar.f46221e.remove(taskCompletionSource2);
                    }
                }
            });
        }
        synchronized (this.f46222f) {
            try {
                if (this.f46227k.getAndIncrement() > 0) {
                    this.f46218b.zza("Already connected to the service.", new Object[0]);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        zzc().post(new a(this, zzjVar.f46215p0, zzjVar));
    }

    public final void zzr(TaskCompletionSource taskCompletionSource) {
        synchronized (this.f46222f) {
            this.f46221e.remove(taskCompletionSource);
        }
        synchronized (this.f46222f) {
            try {
                if (this.f46227k.get() > 0 && this.f46227k.decrementAndGet() > 0) {
                    this.f46218b.zzd("Leaving the connection open for other ongoing calls.", new Object[0]);
                } else {
                    zzc().post(new b(this));
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}

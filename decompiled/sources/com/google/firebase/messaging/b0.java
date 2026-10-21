package com.google.firebase.messaging;

import android.annotation.SuppressLint;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.util.Log;
import androidx.annotation.GuardedBy;
import androidx.annotation.Nullable;
import androidx.camera.core.c0;
import com.google.android.gms.common.stats.ConnectionTracker;
import com.google.android.gms.common.util.concurrent.NamedThreadFactory;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.ArrayDeque;
import java.util.Objects;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: WithinAppServiceConnection.java */
/* JADX INFO: loaded from: classes10.dex */
public final class b0 implements ServiceConnection {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f48614a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Intent f48615b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ScheduledExecutorService f48616c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ArrayDeque f48617d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    public z f48618e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @GuardedBy("this")
    public boolean f48619f;

    /* JADX INFO: compiled from: WithinAppServiceConnection.java */
    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Intent f48620a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final TaskCompletionSource<Void> f48621b = new TaskCompletionSource<>();

        public a(Intent intent) {
            this.f48620a = intent;
        }
    }

    @SuppressLint({"ThreadPoolCreation"})
    public b0(Context context) {
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(0, new NamedThreadFactory("Firebase-FirebaseInstanceIdServiceConnection"));
        this.f48617d = new ArrayDeque();
        this.f48619f = false;
        Context applicationContext = context.getApplicationContext();
        this.f48614a = applicationContext;
        this.f48615b = new Intent(com.google.firebase.iid.ServiceStarter.ACTION_MESSAGING_EVENT).setPackage(applicationContext.getPackageName());
        this.f48616c = scheduledThreadPoolExecutor;
    }

    public final synchronized void a() {
        while (!this.f48617d.isEmpty()) {
            try {
                z zVar = this.f48618e;
                if (zVar == null || !zVar.isBinderAlive()) {
                    if (!this.f48619f) {
                        this.f48619f = true;
                        try {
                            if (!ConnectionTracker.getInstance().bindService(this.f48614a, this.f48615b, this, 65)) {
                                this.f48619f = false;
                                while (true) {
                                    ArrayDeque arrayDeque = this.f48617d;
                                    if (arrayDeque.isEmpty()) {
                                        break;
                                    } else {
                                        ((a) arrayDeque.poll()).f48621b.trySetResult(null);
                                    }
                                }
                            }
                        } catch (SecurityException unused) {
                        }
                    }
                    return;
                }
                this.f48618e.a((a) this.f48617d.poll());
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final synchronized Task<Void> b(Intent intent) {
        a aVar;
        aVar = new a(intent);
        ScheduledExecutorService scheduledExecutorService = this.f48616c;
        final ScheduledFuture<?> scheduledFutureSchedule = scheduledExecutorService.schedule(new c0(aVar, 6), (aVar.f48620a.getFlags() & 268435456) != 0 ? x.f48730a : 9000L, TimeUnit.MILLISECONDS);
        aVar.f48621b.getTask().addOnCompleteListener(scheduledExecutorService, new OnCompleteListener() { // from class: com.google.firebase.messaging.a0
            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final void onComplete(Task task) {
                scheduledFutureSchedule.cancel(false);
            }
        });
        this.f48617d.add(aVar);
        a();
        return aVar.f48621b.getTask();
    }

    @Override // android.content.ServiceConnection
    public final synchronized void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        try {
            if (Log.isLoggable(Constants.TAG, 3)) {
                Objects.toString(componentName);
            }
            this.f48619f = false;
            if (iBinder instanceof z) {
                this.f48618e = (z) iBinder;
                a();
            } else {
                Objects.toString(iBinder);
                while (true) {
                    ArrayDeque arrayDeque = this.f48617d;
                    if (arrayDeque.isEmpty()) {
                        return;
                    } else {
                        ((a) arrayDeque.poll()).f48621b.trySetResult(null);
                    }
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        if (Log.isLoggable(Constants.TAG, 3)) {
            Objects.toString(componentName);
        }
        a();
    }
}

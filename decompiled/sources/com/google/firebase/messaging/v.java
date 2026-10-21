package com.google.firebase.messaging;

import android.content.Context;
import android.os.Bundle;
import androidx.annotation.GuardedBy;
import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import androidx.annotation.WorkerThread;
import androidx.collection.ArrayMap;
import androidx.exifinterface.media.ExifInterface;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.iid.GmsRpc;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: compiled from: TopicsSubscriber.java */
/* JADX INFO: loaded from: classes10.dex */
public final class v {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final long f48712i = TimeUnit.HOURS.toSeconds(8);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ int f48713j = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f48714a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final l f48715b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final k f48716c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final FirebaseMessaging f48717d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ScheduledExecutorService f48719f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final t f48721h;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @GuardedBy("pendingOperations")
    public final ArrayMap f48718e = new ArrayMap();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @GuardedBy("this")
    public boolean f48720g = false;

    public v(FirebaseMessaging firebaseMessaging, l lVar, t tVar, k kVar, Context context, @NonNull ScheduledExecutorService scheduledExecutorService) {
        this.f48717d = firebaseMessaging;
        this.f48715b = lVar;
        this.f48721h = tVar;
        this.f48716c = kVar;
        this.f48714a = context;
        this.f48719f = scheduledExecutorService;
    }

    @WorkerThread
    public static <T> void b(Task<T> task) throws IOException {
        try {
            Tasks.await(task, 30L, TimeUnit.SECONDS);
        } catch (InterruptedException e5) {
            e = e5;
            throw new IOException(GmsRpc.ERROR_SERVICE_NOT_AVAILABLE, e);
        } catch (ExecutionException e7) {
            Throwable cause = e7.getCause();
            if (cause instanceof IOException) {
                throw ((IOException) cause);
            }
            if (!(cause instanceof RuntimeException)) {
                throw new IOException(e7);
            }
            throw ((RuntimeException) cause);
        } catch (TimeoutException e10) {
            e = e10;
            throw new IOException(GmsRpc.ERROR_SERVICE_NOT_AVAILABLE, e);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void a(s sVar, TaskCompletionSource<Void> taskCompletionSource) {
        ArrayDeque arrayDeque;
        synchronized (this.f48718e) {
            try {
                String str = sVar.f48701c;
                if (this.f48718e.containsKey(str)) {
                    arrayDeque = (ArrayDeque) this.f48718e.get(str);
                } else {
                    ArrayDeque arrayDeque2 = new ArrayDeque();
                    this.f48718e.put(str, arrayDeque2);
                    arrayDeque = arrayDeque2;
                }
                arrayDeque.add(taskCompletionSource);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @WorkerThread
    public final void c(String str) throws IOException {
        String strA = this.f48717d.a();
        k kVar = this.f48716c;
        kVar.getClass();
        Bundle bundle = new Bundle();
        bundle.putString("gcm.topic", "/topics/" + str);
        b(kVar.a(kVar.c(strA, "/topics/" + str, bundle)));
    }

    @WorkerThread
    public final void d(String str) throws IOException {
        String strA = this.f48717d.a();
        k kVar = this.f48716c;
        kVar.getClass();
        Bundle bundle = new Bundle();
        bundle.putString("gcm.topic", "/topics/" + str);
        bundle.putString("delete", "1");
        b(kVar.a(kVar.c(strA, "/topics/" + str, bundle)));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void e(s sVar) {
        synchronized (this.f48718e) {
            try {
                String str = sVar.f48701c;
                if (this.f48718e.containsKey(str)) {
                    ArrayDeque arrayDeque = (ArrayDeque) this.f48718e.get(str);
                    TaskCompletionSource taskCompletionSource = (TaskCompletionSource) arrayDeque.poll();
                    if (taskCompletionSource != null) {
                        taskCompletionSource.setResult(null);
                    }
                    if (arrayDeque.isEmpty()) {
                        this.f48718e.remove(str);
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @VisibleForTesting
    public final Task<Void> f(s sVar) {
        t tVar = this.f48721h;
        synchronized (tVar) {
            tVar.f48704b.a(sVar.f48701c);
        }
        TaskCompletionSource<Void> taskCompletionSource = new TaskCompletionSource<>();
        a(sVar, taskCompletionSource);
        return taskCompletionSource.getTask();
    }

    public final synchronized void g(boolean z10) {
        this.f48720g = z10;
    }

    public final void h() {
        boolean z10;
        if (this.f48721h.a() != null) {
            synchronized (this) {
                z10 = this.f48720g;
            }
            if (z10) {
                return;
            }
            j(0L);
        }
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0036  */
    @WorkerThread
    public final boolean i() throws IOException {
        s sVarA;
        byte b10;
        while (true) {
            synchronized (this) {
                try {
                    sVarA = this.f48721h.a();
                    if (sVarA == null) {
                        return true;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            try {
                String str = sVarA.f48700b;
                int iHashCode = str.hashCode();
                if (iHashCode != 83) {
                    if (iHashCode == 85 && str.equals("U")) {
                        b10 = 1;
                    } else {
                        b10 = -1;
                    }
                } else if (str.equals(ExifInterface.LATITUDE_SOUTH)) {
                    b10 = 0;
                } else {
                    b10 = -1;
                }
                String str2 = sVarA.f48699a;
                if (b10 == 0) {
                    c(str2);
                } else if (b10 == 1) {
                    d(str2);
                }
                this.f48721h.c(sVarA);
                e(sVarA);
            } catch (IOException e5) {
                if (GmsRpc.ERROR_SERVICE_NOT_AVAILABLE.equals(e5.getMessage()) || GmsRpc.ERROR_INTERNAL_SERVER_ERROR.equals(e5.getMessage())) {
                    e5.getMessage();
                } else if (e5.getMessage() != null) {
                    throw e5;
                }
                return false;
            }
        }
    }

    public final void j(long j10) {
        this.f48719f.schedule(new w(this, this.f48714a, this.f48715b, Math.min(Math.max(30L, 2 * j10), f48712i)), j10, TimeUnit.SECONDS);
        synchronized (this) {
            this.f48720g = true;
        }
    }
}

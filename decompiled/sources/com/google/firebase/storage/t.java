package com.google.firebase.storage;

import android.app.Activity;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.Preconditions;
import com.google.firebase.storage.StorageTask.ProvideError;
import com.google.firebase.storage.internal.ActivityLifecycleListener;
import com.google.firebase.storage.internal.SmartHandler;
import java.util.HashMap;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: TaskListenerImpl.java */
/* JADX INFO: loaded from: classes10.dex */
public final class t<ListenerTypeT, ResultT extends StorageTask.ProvideError> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ConcurrentLinkedQueue f49191a = new ConcurrentLinkedQueue();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final HashMap<ListenerTypeT, SmartHandler> f49192b = new HashMap<>();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final StorageTask<ResultT> f49193c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f49194d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final a<ListenerTypeT, ResultT> f49195e;

    /* JADX INFO: compiled from: TaskListenerImpl.java */
    public interface a<ListenerTypeT, ResultT> {
        void a(@NonNull Object obj, @NonNull StorageTask.ProvideError provideError);
    }

    public t(@NonNull StorageTask<ResultT> storageTask, int i10, @NonNull a<ListenerTypeT, ResultT> aVar) {
        this.f49193c = storageTask;
        this.f49194d = i10;
        this.f49195e = aVar;
    }

    public final void a(@Nullable Activity activity, @Nullable Executor executor, @NonNull ListenerTypeT listenertypet) {
        boolean z10;
        SmartHandler smartHandler;
        Preconditions.checkNotNull(listenertypet);
        synchronized (this.f49193c.syncObject) {
            try {
                z10 = (this.f49193c.f49045g & this.f49194d) != 0;
                this.f49191a.add(listenertypet);
                smartHandler = new SmartHandler(executor);
                this.f49192b.put(listenertypet, smartHandler);
                if (activity != null) {
                    Preconditions.checkArgument(!activity.isDestroyed(), "Activity is already destroyed!");
                    ActivityLifecycleListener.getInstance().runOnActivityStopped(activity, listenertypet, new androidx.camera.camera2.interop.a(this, listenertypet, 4));
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (z10) {
            smartHandler.callBack(new h2.o(this, listenertypet, 2, this.f49193c.g()));
        }
    }

    public final void b() {
        if ((this.f49193c.f49045g & this.f49194d) != 0) {
            StorageTask.ProvideError provideErrorG = this.f49193c.g();
            for (Object obj : this.f49191a) {
                SmartHandler smartHandler = this.f49192b.get(obj);
                if (smartHandler != null) {
                    smartHandler.callBack(new s(this, obj, 0, provideErrorG));
                }
            }
        }
    }

    public final void c(@NonNull ListenerTypeT listenertypet) {
        Preconditions.checkNotNull(listenertypet);
        synchronized (this.f49193c.syncObject) {
            this.f49192b.remove(listenertypet);
            this.f49191a.remove(listenertypet);
            ActivityLifecycleListener.getInstance().removeCookie(listenertypet);
        }
    }
}

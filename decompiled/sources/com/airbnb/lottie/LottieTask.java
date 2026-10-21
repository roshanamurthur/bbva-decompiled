package com.airbnb.lottie;

import android.os.Handler;
import android.os.Looper;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import com.airbnb.lottie.utils.Logger;
import com.airbnb.lottie.utils.LottieThreadFactory;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.FutureTask;

/* JADX INFO: loaded from: classes2.dex */
public class LottieTask<T> {
    public static Executor EXECUTOR = Executors.newCachedThreadPool(new LottieThreadFactory());

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LinkedHashSet f25659a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LinkedHashSet f25660b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Handler f25661c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    public volatile LottieResult<T> f25662d;

    public static class a<T> extends FutureTask<LottieResult<T>> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public LottieTask<T> f25663p0;

        @Override // java.util.concurrent.FutureTask
        public final void done() {
            try {
                if (isCancelled()) {
                    return;
                }
                try {
                    LottieTask<T> lottieTask = this.f25663p0;
                    LottieResult<T> lottieResult = get();
                    Executor executor = LottieTask.EXECUTOR;
                    lottieTask.c(lottieResult);
                } catch (InterruptedException | ExecutionException e5) {
                    LottieTask<T> lottieTask2 = this.f25663p0;
                    LottieResult<T> lottieResult2 = new LottieResult<>(e5);
                    Executor executor2 = LottieTask.EXECUTOR;
                    lottieTask2.c(lottieResult2);
                }
            } finally {
                this.f25663p0 = null;
            }
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public LottieTask(Callable<LottieResult<T>> callable) {
        this(callable, false);
    }

    public final synchronized void a(Throwable th2) {
        ArrayList arrayList = new ArrayList(this.f25660b);
        if (arrayList.isEmpty()) {
            Logger.warning("Lottie encountered an error but no failure listener was added:", th2);
            return;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((LottieListener) it.next()).onResult(th2);
        }
    }

    public synchronized LottieTask<T> addFailureListener(LottieListener<Throwable> lottieListener) {
        try {
            LottieResult<T> lottieResult = this.f25662d;
            if (lottieResult != null && lottieResult.getException() != null) {
                lottieListener.onResult(lottieResult.getException());
            }
            this.f25660b.add(lottieListener);
        } catch (Throwable th2) {
            throw th2;
        }
        return this;
    }

    public synchronized LottieTask<T> addListener(LottieListener<T> lottieListener) {
        try {
            LottieResult<T> lottieResult = this.f25662d;
            if (lottieResult != null && lottieResult.getValue() != null) {
                lottieListener.onResult(lottieResult.getValue());
            }
            this.f25659a.add(lottieListener);
        } catch (Throwable th2) {
            throw th2;
        }
        return this;
    }

    public final void b() {
        LottieResult<T> lottieResult = this.f25662d;
        if (lottieResult == null) {
            return;
        }
        if (lottieResult.getValue() == null) {
            a(lottieResult.getException());
            return;
        }
        T value = lottieResult.getValue();
        synchronized (this) {
            Iterator it = new ArrayList(this.f25659a).iterator();
            while (it.hasNext()) {
                ((LottieListener) it.next()).onResult(value);
            }
        }
    }

    public final void c(@Nullable LottieResult<T> lottieResult) {
        if (this.f25662d != null) {
            throw new IllegalStateException("A task may only be set once.");
        }
        this.f25662d = lottieResult;
        if (Looper.myLooper() == Looper.getMainLooper()) {
            b();
        } else {
            this.f25661c.post(new androidx.room.d(this, 1));
        }
    }

    @Nullable
    public LottieResult<T> getResult() {
        return this.f25662d;
    }

    public synchronized LottieTask<T> removeFailureListener(LottieListener<Throwable> lottieListener) {
        this.f25660b.remove(lottieListener);
        return this;
    }

    public synchronized LottieTask<T> removeListener(LottieListener<T> lottieListener) {
        this.f25659a.remove(lottieListener);
        return this;
    }

    public LottieTask(T t10) {
        this.f25659a = new LinkedHashSet(1);
        this.f25660b = new LinkedHashSet(1);
        this.f25661c = new Handler(Looper.getMainLooper());
        this.f25662d = null;
        c(new LottieResult<>(t10));
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public LottieTask(Callable<LottieResult<T>> callable, boolean z10) {
        this.f25659a = new LinkedHashSet(1);
        this.f25660b = new LinkedHashSet(1);
        this.f25661c = new Handler(Looper.getMainLooper());
        this.f25662d = null;
        if (z10) {
            try {
                c(callable.call());
                return;
            } catch (Throwable th2) {
                c(new LottieResult<>(th2));
                return;
            }
        }
        Executor executor = EXECUTOR;
        a aVar = new a(callable);
        aVar.f25663p0 = this;
        executor.execute(aVar);
    }
}

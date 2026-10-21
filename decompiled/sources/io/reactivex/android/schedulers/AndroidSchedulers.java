package io.reactivex.android.schedulers;

import android.annotation.SuppressLint;
import android.os.Handler;
import android.os.Looper;
import io.reactivex.Scheduler;
import io.reactivex.android.plugins.RxAndroidPlugins;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes7.dex */
public final class AndroidSchedulers {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Scheduler f69881a = RxAndroidPlugins.initMainThreadScheduler(new a());

    public static class a implements Callable<Scheduler> {
        @Override // java.util.concurrent.Callable
        public final Scheduler call() throws Exception {
            return b.f69882a;
        }
    }

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final mj.a f69882a = new mj.a(new Handler(Looper.getMainLooper()), false);
    }

    public AndroidSchedulers() {
        throw new AssertionError("No instances.");
    }

    public static Scheduler from(Looper looper) {
        return from(looper, false);
    }

    public static Scheduler mainThread() {
        return RxAndroidPlugins.onMainThreadScheduler(f69881a);
    }

    @SuppressLint({"NewApi"})
    public static Scheduler from(Looper looper, boolean z10) {
        if (looper != null) {
            return new mj.a(new Handler(looper), z10);
        }
        throw new NullPointerException("looper == null");
    }
}

package io.reactivex.rxjava3.android.schedulers;

import android.annotation.SuppressLint;
import android.os.Handler;
import android.os.Looper;
import io.reactivex.rxjava3.android.plugins.RxAndroidPlugins;
import io.reactivex.rxjava3.core.Scheduler;
import pj.b;

/* JADX INFO: loaded from: classes12.dex */
public final class AndroidSchedulers {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Scheduler f73938a = RxAndroidPlugins.initMainThreadScheduler(new pj.a());

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f73939a = new b(new Handler(Looper.getMainLooper()), true);
    }

    public AndroidSchedulers() {
        throw new AssertionError("No instances.");
    }

    public static Scheduler from(Looper looper) {
        return from(looper, true);
    }

    public static Scheduler mainThread() {
        return RxAndroidPlugins.onMainThreadScheduler(f73938a);
    }

    @SuppressLint({"NewApi"})
    public static Scheduler from(Looper looper, boolean z10) {
        if (looper != null) {
            return new b(new Handler(looper), z10);
        }
        throw new NullPointerException("looper == null");
    }
}

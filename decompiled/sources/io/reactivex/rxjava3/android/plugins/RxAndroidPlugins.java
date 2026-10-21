package io.reactivex.rxjava3.android.plugins;

import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.exceptions.Exceptions;
import io.reactivex.rxjava3.functions.Function;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes12.dex */
public final class RxAndroidPlugins {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static volatile Function<Callable<Scheduler>, Scheduler> f73936a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static volatile Function<Scheduler, Scheduler> f73937b;

    public RxAndroidPlugins() {
        throw new AssertionError("No instances.");
    }

    public static Function<Callable<Scheduler>, Scheduler> getInitMainThreadSchedulerHandler() {
        return f73936a;
    }

    public static Function<Scheduler, Scheduler> getOnMainThreadSchedulerHandler() {
        return f73937b;
    }

    public static Scheduler initMainThreadScheduler(Callable<Scheduler> callable) throws Throwable {
        if (callable == null) {
            throw new NullPointerException("scheduler == null");
        }
        Function<Callable<Scheduler>, Scheduler> function = f73936a;
        if (function == null) {
            try {
                Scheduler schedulerCall = callable.call();
                if (schedulerCall != null) {
                    return schedulerCall;
                }
                throw new NullPointerException("Scheduler Callable returned null");
            } catch (Throwable th2) {
                throw Exceptions.propagate(th2);
            }
        }
        try {
            Scheduler schedulerApply = function.apply(callable);
            if (schedulerApply != null) {
                return schedulerApply;
            }
            throw new NullPointerException("Scheduler Callable returned null");
        } catch (Throwable th3) {
            throw Exceptions.propagate(th3);
        }
    }

    public static Scheduler onMainThreadScheduler(Scheduler scheduler) {
        if (scheduler == null) {
            throw new NullPointerException("scheduler == null");
        }
        Function<Scheduler, Scheduler> function = f73937b;
        if (function == null) {
            return scheduler;
        }
        try {
            return function.apply(scheduler);
        } catch (Throwable th2) {
            throw Exceptions.propagate(th2);
        }
    }

    public static void reset() {
        setInitMainThreadSchedulerHandler(null);
        setMainThreadSchedulerHandler(null);
    }

    public static void setInitMainThreadSchedulerHandler(Function<Callable<Scheduler>, Scheduler> function) {
        f73936a = function;
    }

    public static void setMainThreadSchedulerHandler(Function<Scheduler, Scheduler> function) {
        f73937b = function;
    }
}

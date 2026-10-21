package io.reactivex.schedulers;

import io.reactivex.Scheduler;
import io.reactivex.annotations.Experimental;
import io.reactivex.annotations.NonNull;
import io.reactivex.internal.schedulers.ComputationScheduler;
import io.reactivex.internal.schedulers.ExecutorScheduler;
import io.reactivex.internal.schedulers.IoScheduler;
import io.reactivex.internal.schedulers.NewThreadScheduler;
import io.reactivex.internal.schedulers.SchedulerPoolFactory;
import io.reactivex.internal.schedulers.SingleScheduler;
import io.reactivex.internal.schedulers.TrampolineScheduler;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes12.dex */
public final class Schedulers {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    public static final Scheduler f78588a = RxJavaPlugins.initSingleScheduler(new h());

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    public static final Scheduler f78589b = RxJavaPlugins.initComputationScheduler(new b());

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    public static final Scheduler f78590c = RxJavaPlugins.initIoScheduler(new c());

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NonNull
    public static final TrampolineScheduler f78591d = TrampolineScheduler.instance();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NonNull
    public static final Scheduler f78592e = RxJavaPlugins.initNewThreadScheduler(new f());

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final ComputationScheduler f78593a = new ComputationScheduler();
    }

    public static final class b implements Callable<Scheduler> {
        @Override // java.util.concurrent.Callable
        public final Scheduler call() throws Exception {
            return a.f78593a;
        }
    }

    public static final class c implements Callable<Scheduler> {
        @Override // java.util.concurrent.Callable
        public final Scheduler call() throws Exception {
            return d.f78594a;
        }
    }

    public static final class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final IoScheduler f78594a = new IoScheduler();
    }

    public static final class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final NewThreadScheduler f78595a = new NewThreadScheduler();
    }

    public static final class f implements Callable<Scheduler> {
        @Override // java.util.concurrent.Callable
        public final Scheduler call() throws Exception {
            return e.f78595a;
        }
    }

    public static final class g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final SingleScheduler f78596a = new SingleScheduler();
    }

    public static final class h implements Callable<Scheduler> {
        @Override // java.util.concurrent.Callable
        public final Scheduler call() throws Exception {
            return g.f78596a;
        }
    }

    public Schedulers() {
        throw new IllegalStateException("No instances!");
    }

    @NonNull
    public static Scheduler computation() {
        return RxJavaPlugins.onComputationScheduler(f78589b);
    }

    @NonNull
    public static Scheduler from(@NonNull Executor executor) {
        return new ExecutorScheduler(executor, false);
    }

    @NonNull
    public static Scheduler io() {
        return RxJavaPlugins.onIoScheduler(f78590c);
    }

    @NonNull
    public static Scheduler newThread() {
        return RxJavaPlugins.onNewThreadScheduler(f78592e);
    }

    public static void shutdown() {
        computation().shutdown();
        io().shutdown();
        newThread().shutdown();
        single().shutdown();
        trampoline().shutdown();
        SchedulerPoolFactory.shutdown();
    }

    @NonNull
    public static Scheduler single() {
        return RxJavaPlugins.onSingleScheduler(f78588a);
    }

    public static void start() {
        computation().start();
        io().start();
        newThread().start();
        single().start();
        trampoline().start();
        SchedulerPoolFactory.start();
    }

    @NonNull
    public static Scheduler trampoline() {
        return f78591d;
    }

    @Experimental
    @NonNull
    public static Scheduler from(@NonNull Executor executor, boolean z10) {
        return new ExecutorScheduler(executor, z10);
    }
}

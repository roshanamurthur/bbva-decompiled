package io.reactivex.rxjava3.schedulers;

import io.reactivex.rxjava3.annotations.NonNull;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.functions.Supplier;
import io.reactivex.rxjava3.internal.schedulers.ComputationScheduler;
import io.reactivex.rxjava3.internal.schedulers.ExecutorScheduler;
import io.reactivex.rxjava3.internal.schedulers.IoScheduler;
import io.reactivex.rxjava3.internal.schedulers.NewThreadScheduler;
import io.reactivex.rxjava3.internal.schedulers.SchedulerPoolFactory;
import io.reactivex.rxjava3.internal.schedulers.SingleScheduler;
import io.reactivex.rxjava3.internal.schedulers.TrampolineScheduler;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes12.dex */
public final class Schedulers {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    public static final Scheduler f78344a = RxJavaPlugins.initSingleScheduler(new h());

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    public static final Scheduler f78345b = RxJavaPlugins.initComputationScheduler(new b());

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    public static final Scheduler f78346c = RxJavaPlugins.initIoScheduler(new c());

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NonNull
    public static final TrampolineScheduler f78347d = TrampolineScheduler.instance();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NonNull
    public static final Scheduler f78348e = RxJavaPlugins.initNewThreadScheduler(new f());

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final ComputationScheduler f78349a = new ComputationScheduler();
    }

    public static final class b implements Supplier<Scheduler> {
        @Override // io.reactivex.rxjava3.functions.Supplier
        public final Scheduler get() throws Throwable {
            return a.f78349a;
        }
    }

    public static final class c implements Supplier<Scheduler> {
        @Override // io.reactivex.rxjava3.functions.Supplier
        public final Scheduler get() throws Throwable {
            return d.f78350a;
        }
    }

    public static final class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final IoScheduler f78350a = new IoScheduler();
    }

    public static final class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final NewThreadScheduler f78351a = new NewThreadScheduler();
    }

    public static final class f implements Supplier<Scheduler> {
        @Override // io.reactivex.rxjava3.functions.Supplier
        public final Scheduler get() throws Throwable {
            return e.f78351a;
        }
    }

    public static final class g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final SingleScheduler f78352a = new SingleScheduler();
    }

    public static final class h implements Supplier<Scheduler> {
        @Override // io.reactivex.rxjava3.functions.Supplier
        public final Scheduler get() throws Throwable {
            return g.f78352a;
        }
    }

    public Schedulers() {
        throw new IllegalStateException("No instances!");
    }

    @NonNull
    public static Scheduler computation() {
        return RxJavaPlugins.onComputationScheduler(f78345b);
    }

    @NonNull
    public static Scheduler from(@NonNull Executor executor) {
        return new ExecutorScheduler(executor, false, false);
    }

    @NonNull
    public static Scheduler io() {
        return RxJavaPlugins.onIoScheduler(f78346c);
    }

    @NonNull
    public static Scheduler newThread() {
        return RxJavaPlugins.onNewThreadScheduler(f78348e);
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
        return RxJavaPlugins.onSingleScheduler(f78344a);
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
        return f78347d;
    }

    @NonNull
    public static Scheduler from(@NonNull Executor executor, boolean z10) {
        return new ExecutorScheduler(executor, z10, false);
    }

    @NonNull
    public static Scheduler from(@NonNull Executor executor, boolean z10, boolean z11) {
        return new ExecutorScheduler(executor, z10, z11);
    }
}

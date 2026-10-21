package rj;

import io.reactivex.rxjava3.annotations.NonNull;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.functions.Action;
import io.reactivex.rxjava3.internal.disposables.EmptyDisposable;
import io.reactivex.rxjava3.internal.functions.Functions;
import java.util.Objects;
import java.util.concurrent.Future;
import org.reactivestreams.Subscription;

/* JADX INFO: compiled from: Disposable.java */
/* JADX INFO: loaded from: classes12.dex */
public final /* synthetic */ class d {
    @NonNull
    public static Disposable a() {
        return EmptyDisposable.INSTANCE;
    }

    @NonNull
    public static Disposable b() {
        return g(Functions.EMPTY_RUNNABLE);
    }

    @NonNull
    public static Disposable c(@NonNull Action action) {
        Objects.requireNonNull(action, "action is null");
        return new a(action);
    }

    @NonNull
    public static Disposable d(@NonNull AutoCloseable autoCloseable) {
        Objects.requireNonNull(autoCloseable, "autoCloseable is null");
        return new b(autoCloseable);
    }

    @NonNull
    public static Disposable e(@NonNull Future<?> future) {
        Objects.requireNonNull(future, "future is null");
        return f(future, true);
    }

    @NonNull
    public static Disposable f(@NonNull Future<?> future, boolean z10) {
        Objects.requireNonNull(future, "future is null");
        return new e(future, z10);
    }

    @NonNull
    public static Disposable g(@NonNull Runnable runnable) {
        Objects.requireNonNull(runnable, "run is null");
        return new g(runnable);
    }

    @NonNull
    public static Disposable h(@NonNull Subscription subscription) {
        Objects.requireNonNull(subscription, "subscription is null");
        return new h(subscription);
    }

    @NonNull
    public static AutoCloseable i(@NonNull final Disposable disposable) {
        Objects.requireNonNull(disposable, "disposable is null");
        return new AutoCloseable() { // from class: rj.c
            @Override // java.lang.AutoCloseable
            public final void close() {
                disposable.dispose();
            }
        };
    }
}

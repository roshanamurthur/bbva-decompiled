package io.reactivex.internal.observers;

import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.CompositeException;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.Action;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Predicate;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes8.dex */
public final class ForEachWhileObserver<T> extends AtomicReference<Disposable> implements Observer<T>, Disposable {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final Predicate<? super T> f69949p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final Consumer<? super Throwable> f69950q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final Action f69951r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public boolean f69952s0;

    public ForEachWhileObserver(Predicate<? super T> predicate, Consumer<? super Throwable> consumer, Action action) {
        this.f69949p0 = predicate;
        this.f69950q0 = consumer;
        this.f69951r0 = action;
    }

    @Override // io.reactivex.disposables.Disposable
    public void dispose() {
        DisposableHelper.dispose(this);
    }

    @Override // io.reactivex.disposables.Disposable
    public boolean isDisposed() {
        return DisposableHelper.isDisposed(get());
    }

    @Override // io.reactivex.Observer
    public void onComplete() {
        if (this.f69952s0) {
            return;
        }
        this.f69952s0 = true;
        try {
            this.f69951r0.run();
        } catch (Throwable th2) {
            Exceptions.throwIfFatal(th2);
            RxJavaPlugins.onError(th2);
        }
    }

    @Override // io.reactivex.Observer
    public void onError(Throwable th2) {
        if (this.f69952s0) {
            RxJavaPlugins.onError(th2);
            return;
        }
        this.f69952s0 = true;
        try {
            this.f69950q0.accept(th2);
        } catch (Throwable th3) {
            Exceptions.throwIfFatal(th3);
            RxJavaPlugins.onError(new CompositeException(th2, th3));
        }
    }

    @Override // io.reactivex.Observer
    public void onNext(T t10) {
        if (this.f69952s0) {
            return;
        }
        try {
            if (this.f69949p0.test(t10)) {
                return;
            }
            dispose();
            onComplete();
        } catch (Throwable th2) {
            Exceptions.throwIfFatal(th2);
            dispose();
            onError(th2);
        }
    }

    @Override // io.reactivex.Observer
    public void onSubscribe(Disposable disposable) {
        DisposableHelper.setOnce(this, disposable);
    }
}

package io.reactivex.observers;

import io.reactivex.CompletableObserver;
import io.reactivex.MaybeObserver;
import io.reactivex.Observer;
import io.reactivex.SingleObserver;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.fuseable.QueueDisposable;
import io.reactivex.internal.util.ExceptionHelper;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes12.dex */
public class TestObserver<T> extends BaseTestConsumer<T, TestObserver<T>> implements Observer<T>, MaybeObserver<T>, SingleObserver<T>, CompletableObserver {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final Observer<? super T> f73827p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final AtomicReference<Disposable> f73828q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public QueueDisposable<T> f73829r0;

    public TestObserver() {
        this(a.INSTANCE);
    }

    public static <T> TestObserver<T> create() {
        return new TestObserver<>();
    }

    public final TestObserver<T> assertOf(Consumer<? super TestObserver<T>> consumer) {
        try {
            consumer.accept(this);
            return this;
        } catch (Throwable th2) {
            throw ExceptionHelper.wrapOrThrow(th2);
        }
    }

    public final void cancel() {
        dispose();
    }

    @Override // io.reactivex.disposables.Disposable
    public final void dispose() {
        DisposableHelper.dispose(this.f73828q0);
    }

    public final boolean hasSubscription() {
        return this.f73828q0.get() != null;
    }

    public final boolean isCancelled() {
        return isDisposed();
    }

    @Override // io.reactivex.disposables.Disposable
    public final boolean isDisposed() {
        return DisposableHelper.isDisposed(this.f73828q0.get());
    }

    @Override // io.reactivex.Observer
    public void onComplete() {
        if (!this.checkSubscriptionOnce) {
            this.checkSubscriptionOnce = true;
            if (this.f73828q0.get() == null) {
                this.errors.add(new IllegalStateException("onSubscribe not called in proper order"));
            }
        }
        try {
            this.lastThread = Thread.currentThread();
            this.completions++;
            this.f73827p0.onComplete();
        } finally {
            this.done.countDown();
        }
    }

    @Override // io.reactivex.Observer
    public void onError(Throwable th2) {
        if (!this.checkSubscriptionOnce) {
            this.checkSubscriptionOnce = true;
            if (this.f73828q0.get() == null) {
                this.errors.add(new IllegalStateException("onSubscribe not called in proper order"));
            }
        }
        try {
            this.lastThread = Thread.currentThread();
            if (th2 == null) {
                this.errors.add(new NullPointerException("onError received a null Throwable"));
            } else {
                this.errors.add(th2);
            }
            this.f73827p0.onError(th2);
        } finally {
            this.done.countDown();
        }
    }

    @Override // io.reactivex.Observer
    public void onNext(T t10) {
        if (!this.checkSubscriptionOnce) {
            this.checkSubscriptionOnce = true;
            if (this.f73828q0.get() == null) {
                this.errors.add(new IllegalStateException("onSubscribe not called in proper order"));
            }
        }
        this.lastThread = Thread.currentThread();
        if (this.establishedFusionMode != 2) {
            this.values.add(t10);
            if (t10 == null) {
                this.errors.add(new NullPointerException("onNext received a null value"));
            }
            this.f73827p0.onNext(t10);
            return;
        }
        while (true) {
            try {
                T tPoll = this.f73829r0.poll();
                if (tPoll == null) {
                    return;
                } else {
                    this.values.add(tPoll);
                }
            } catch (Throwable th2) {
                this.errors.add(th2);
                this.f73829r0.dispose();
                return;
            }
        }
    }

    @Override // io.reactivex.Observer
    public void onSubscribe(Disposable disposable) {
        this.lastThread = Thread.currentThread();
        if (disposable == null) {
            this.errors.add(new NullPointerException("onSubscribe received a null Subscription"));
            return;
        }
        AtomicReference<Disposable> atomicReference = this.f73828q0;
        while (!atomicReference.compareAndSet(null, disposable)) {
            if (atomicReference.get() != null) {
                disposable.dispose();
                if (atomicReference.get() != DisposableHelper.DISPOSED) {
                    this.errors.add(new IllegalStateException("onSubscribe received multiple subscriptions: " + disposable));
                    return;
                }
                return;
            }
        }
        int i10 = this.initialFusionMode;
        if (i10 != 0 && (disposable instanceof QueueDisposable)) {
            QueueDisposable<T> queueDisposable = (QueueDisposable) disposable;
            this.f73829r0 = queueDisposable;
            int iRequestFusion = queueDisposable.requestFusion(i10);
            this.establishedFusionMode = iRequestFusion;
            if (iRequestFusion == 1) {
                this.checkSubscriptionOnce = true;
                this.lastThread = Thread.currentThread();
                while (true) {
                    try {
                        T tPoll = this.f73829r0.poll();
                        if (tPoll == null) {
                            this.completions++;
                            atomicReference.lazySet(DisposableHelper.DISPOSED);
                            return;
                        }
                        this.values.add(tPoll);
                    } catch (Throwable th2) {
                        this.errors.add(th2);
                        return;
                    }
                }
            }
        }
        this.f73827p0.onSubscribe(disposable);
    }

    @Override // io.reactivex.MaybeObserver
    public void onSuccess(T t10) {
        onNext(t10);
        onComplete();
    }

    public TestObserver(Observer<? super T> observer) {
        this.f73828q0 = new AtomicReference<>();
        this.f73827p0 = observer;
    }

    public static <T> TestObserver<T> create(Observer<? super T> observer) {
        return new TestObserver<>(observer);
    }

    @Override // io.reactivex.observers.BaseTestConsumer
    public final TestObserver<T> assertNotSubscribed() {
        if (this.f73828q0.get() != null) {
            throw fail("Subscribed!");
        }
        if (this.errors.isEmpty()) {
            return this;
        }
        throw fail("Not subscribed but errors found");
    }

    @Override // io.reactivex.observers.BaseTestConsumer
    public final TestObserver<T> assertSubscribed() {
        if (this.f73828q0.get() != null) {
            return this;
        }
        throw fail("Not subscribed!");
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class a implements Observer<Object> {
        private static final /* synthetic */ a[] $VALUES;
        public static final a INSTANCE;

        static {
            a aVar = new a("INSTANCE", 0);
            INSTANCE = aVar;
            $VALUES = new a[]{aVar};
        }

        public a() {
            throw null;
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) $VALUES.clone();
        }

        @Override // io.reactivex.Observer
        public final void onComplete() {
        }

        @Override // io.reactivex.Observer
        public final void onError(Throwable th2) {
        }

        @Override // io.reactivex.Observer
        public final void onNext(Object obj) {
        }

        @Override // io.reactivex.Observer
        public final void onSubscribe(Disposable disposable) {
        }
    }
}

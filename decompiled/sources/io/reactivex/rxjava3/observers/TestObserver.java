package io.reactivex.rxjava3.observers;

import io.reactivex.rxjava3.annotations.NonNull;
import io.reactivex.rxjava3.core.CompletableObserver;
import io.reactivex.rxjava3.core.MaybeObserver;
import io.reactivex.rxjava3.core.Observer;
import io.reactivex.rxjava3.core.SingleObserver;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes12.dex */
public class TestObserver<T> extends BaseTestConsumer<T, TestObserver<T>> implements Observer<T>, Disposable, MaybeObserver<T>, SingleObserver<T>, CompletableObserver {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final Observer<? super T> f78237p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final AtomicReference<Disposable> f78238q0;

    public TestObserver() {
        this(a.INSTANCE);
    }

    @NonNull
    public static <T> TestObserver<T> create() {
        return new TestObserver<>();
    }

    @Override // io.reactivex.rxjava3.observers.BaseTestConsumer, io.reactivex.rxjava3.disposables.Disposable
    public final void dispose() {
        DisposableHelper.dispose(this.f78238q0);
    }

    public final boolean hasSubscription() {
        return this.f78238q0.get() != null;
    }

    @Override // io.reactivex.rxjava3.observers.BaseTestConsumer, io.reactivex.rxjava3.disposables.Disposable
    public final boolean isDisposed() {
        return DisposableHelper.isDisposed(this.f78238q0.get());
    }

    @Override // io.reactivex.rxjava3.core.Observer
    public void onComplete() {
        if (!this.checkSubscriptionOnce) {
            this.checkSubscriptionOnce = true;
            if (this.f78238q0.get() == null) {
                this.errors.add(new IllegalStateException("onSubscribe not called in proper order"));
            }
        }
        try {
            this.lastThread = Thread.currentThread();
            this.completions++;
            this.f78237p0.onComplete();
        } finally {
            this.done.countDown();
        }
    }

    @Override // io.reactivex.rxjava3.core.Observer
    public void onError(@NonNull Throwable th2) {
        if (!this.checkSubscriptionOnce) {
            this.checkSubscriptionOnce = true;
            if (this.f78238q0.get() == null) {
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
            this.f78237p0.onError(th2);
        } finally {
            this.done.countDown();
        }
    }

    @Override // io.reactivex.rxjava3.core.Observer
    public void onNext(@NonNull T t10) {
        if (!this.checkSubscriptionOnce) {
            this.checkSubscriptionOnce = true;
            if (this.f78238q0.get() == null) {
                this.errors.add(new IllegalStateException("onSubscribe not called in proper order"));
            }
        }
        this.lastThread = Thread.currentThread();
        this.values.add(t10);
        if (t10 == null) {
            this.errors.add(new NullPointerException("onNext received a null value"));
        }
        this.f78237p0.onNext(t10);
    }

    @Override // io.reactivex.rxjava3.core.Observer
    public void onSubscribe(@NonNull Disposable disposable) {
        this.lastThread = Thread.currentThread();
        if (disposable == null) {
            this.errors.add(new NullPointerException("onSubscribe received a null Subscription"));
            return;
        }
        AtomicReference<Disposable> atomicReference = this.f78238q0;
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
        this.f78237p0.onSubscribe(disposable);
    }

    @Override // io.reactivex.rxjava3.core.MaybeObserver, io.reactivex.rxjava3.core.SingleObserver
    public void onSuccess(@NonNull T t10) {
        onNext(t10);
        onComplete();
    }

    public TestObserver(@NonNull Observer<? super T> observer) {
        this.f78238q0 = new AtomicReference<>();
        this.f78237p0 = observer;
    }

    @NonNull
    public static <T> TestObserver<T> create(@NonNull Observer<? super T> observer) {
        return new TestObserver<>(observer);
    }

    @Override // io.reactivex.rxjava3.observers.BaseTestConsumer
    @NonNull
    public final TestObserver<T> assertSubscribed() {
        if (this.f78238q0.get() != null) {
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

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onComplete() {
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onError(Throwable th2) {
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onNext(Object obj) {
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onSubscribe(Disposable disposable) {
        }
    }
}

package io.reactivex.internal.operators.observable;

import io.reactivex.ObservableSource;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;
import java.util.ArrayDeque;

/* JADX INFO: loaded from: classes12.dex */
public final class ObservableTakeLast<T> extends io.reactivex.internal.operators.observable.a<T, T> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final int f72937p0;

    public static final class a<T> extends ArrayDeque<T> implements Observer<T>, Disposable {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final Observer<? super T> f72938p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final int f72939q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public Disposable f72940r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public volatile boolean f72941s0;

        public a(Observer<? super T> observer, int i10) {
            this.f72938p0 = observer;
            this.f72939q0 = i10;
        }

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
            if (this.f72941s0) {
                return;
            }
            this.f72941s0 = true;
            this.f72940r0.dispose();
        }

        @Override // io.reactivex.disposables.Disposable
        public final boolean isDisposed() {
            return this.f72941s0;
        }

        @Override // io.reactivex.Observer
        public final void onComplete() {
            Observer<? super T> observer = this.f72938p0;
            while (!this.f72941s0) {
                T tPoll = poll();
                if (tPoll == null) {
                    if (this.f72941s0) {
                        return;
                    }
                    observer.onComplete();
                    return;
                }
                observer.onNext(tPoll);
            }
        }

        @Override // io.reactivex.Observer
        public final void onError(Throwable th2) {
            this.f72938p0.onError(th2);
        }

        @Override // io.reactivex.Observer
        public final void onNext(T t10) {
            if (this.f72939q0 == size()) {
                poll();
            }
            offer(t10);
        }

        @Override // io.reactivex.Observer
        public final void onSubscribe(Disposable disposable) {
            if (DisposableHelper.validate(this.f72940r0, disposable)) {
                this.f72940r0 = disposable;
                this.f72938p0.onSubscribe(this);
            }
        }
    }

    public ObservableTakeLast(ObservableSource<T> observableSource, int i10) {
        super(observableSource);
        this.f72937p0 = i10;
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(Observer<? super T> observer) {
        this.source.subscribe(new a(observer, this.f72937p0));
    }
}

package io.reactivex.internal.operators.observable;

import io.reactivex.ObservableSource;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;
import java.util.ArrayDeque;

/* JADX INFO: loaded from: classes12.dex */
public final class ObservableSkipLast<T> extends io.reactivex.internal.operators.observable.a<T, T> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final int f72872p0;

    public static final class a<T> extends ArrayDeque<T> implements Observer<T>, Disposable {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final Observer<? super T> f72873p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final int f72874q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public Disposable f72875r0;

        public a(Observer<? super T> observer, int i10) {
            super(i10);
            this.f72873p0 = observer;
            this.f72874q0 = i10;
        }

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
            this.f72875r0.dispose();
        }

        @Override // io.reactivex.disposables.Disposable
        public final boolean isDisposed() {
            return this.f72875r0.isDisposed();
        }

        @Override // io.reactivex.Observer
        public final void onComplete() {
            this.f72873p0.onComplete();
        }

        @Override // io.reactivex.Observer
        public final void onError(Throwable th2) {
            this.f72873p0.onError(th2);
        }

        @Override // io.reactivex.Observer
        public final void onNext(T t10) {
            if (this.f72874q0 == size()) {
                this.f72873p0.onNext(poll());
            }
            offer(t10);
        }

        @Override // io.reactivex.Observer
        public final void onSubscribe(Disposable disposable) {
            if (DisposableHelper.validate(this.f72875r0, disposable)) {
                this.f72875r0 = disposable;
                this.f72873p0.onSubscribe(this);
            }
        }
    }

    public ObservableSkipLast(ObservableSource<T> observableSource, int i10) {
        super(observableSource);
        this.f72872p0 = i10;
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(Observer<? super T> observer) {
        this.source.subscribe(new a(observer, this.f72872p0));
    }
}

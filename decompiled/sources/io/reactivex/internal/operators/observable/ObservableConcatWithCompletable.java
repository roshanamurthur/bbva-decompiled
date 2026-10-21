package io.reactivex.internal.operators.observable;

import io.reactivex.CompletableObserver;
import io.reactivex.CompletableSource;
import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes12.dex */
public final class ObservableConcatWithCompletable<T> extends io.reactivex.internal.operators.observable.a<T, T> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final CompletableSource f72232p0;

    public static final class a<T> extends AtomicReference<Disposable> implements Observer<T>, CompletableObserver, Disposable {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final Observer<? super T> f72233p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public CompletableSource f72234q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public boolean f72235r0;

        public a(Observer<? super T> observer, CompletableSource completableSource) {
            this.f72233p0 = observer;
            this.f72234q0 = completableSource;
        }

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
            DisposableHelper.dispose(this);
        }

        @Override // io.reactivex.disposables.Disposable
        public final boolean isDisposed() {
            return DisposableHelper.isDisposed(get());
        }

        @Override // io.reactivex.Observer
        public final void onComplete() {
            if (this.f72235r0) {
                this.f72233p0.onComplete();
                return;
            }
            this.f72235r0 = true;
            DisposableHelper.replace(this, null);
            CompletableSource completableSource = this.f72234q0;
            this.f72234q0 = null;
            completableSource.subscribe(this);
        }

        @Override // io.reactivex.Observer
        public final void onError(Throwable th2) {
            this.f72233p0.onError(th2);
        }

        @Override // io.reactivex.Observer
        public final void onNext(T t10) {
            this.f72233p0.onNext(t10);
        }

        @Override // io.reactivex.Observer
        public final void onSubscribe(Disposable disposable) {
            if (!DisposableHelper.setOnce(this, disposable) || this.f72235r0) {
                return;
            }
            this.f72233p0.onSubscribe(this);
        }
    }

    public ObservableConcatWithCompletable(Observable<T> observable, CompletableSource completableSource) {
        super(observable);
        this.f72232p0 = completableSource;
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(Observer<? super T> observer) {
        this.source.subscribe(new a(observer, this.f72232p0));
    }
}

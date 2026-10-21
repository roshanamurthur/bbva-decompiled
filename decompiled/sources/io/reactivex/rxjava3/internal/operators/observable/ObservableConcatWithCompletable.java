package io.reactivex.rxjava3.internal.operators.observable;

import io.reactivex.rxjava3.core.CompletableObserver;
import io.reactivex.rxjava3.core.CompletableSource;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Observer;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes12.dex */
public final class ObservableConcatWithCompletable<T> extends io.reactivex.rxjava3.internal.operators.observable.a<T, T> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final CompletableSource f76513p0;

    public static final class a<T> extends AtomicReference<Disposable> implements Observer<T>, CompletableObserver, Disposable {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final Observer<? super T> f76514p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public CompletableSource f76515q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public boolean f76516r0;

        public a(Observer<? super T> observer, CompletableSource completableSource) {
            this.f76514p0 = observer;
            this.f76515q0 = completableSource;
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public final void dispose() {
            DisposableHelper.dispose(this);
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public final boolean isDisposed() {
            return DisposableHelper.isDisposed(get());
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onComplete() {
            if (this.f76516r0) {
                this.f76514p0.onComplete();
                return;
            }
            this.f76516r0 = true;
            DisposableHelper.replace(this, null);
            CompletableSource completableSource = this.f76515q0;
            this.f76515q0 = null;
            completableSource.subscribe(this);
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onError(Throwable th2) {
            this.f76514p0.onError(th2);
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onNext(T t10) {
            this.f76514p0.onNext(t10);
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onSubscribe(Disposable disposable) {
            if (!DisposableHelper.setOnce(this, disposable) || this.f76516r0) {
                return;
            }
            this.f76514p0.onSubscribe(this);
        }
    }

    public ObservableConcatWithCompletable(Observable<T> observable, CompletableSource completableSource) {
        super(observable);
        this.f76513p0 = completableSource;
    }

    @Override // io.reactivex.rxjava3.core.Observable
    public void subscribeActual(Observer<? super T> observer) {
        this.source.subscribe(new a(observer, this.f76513p0));
    }
}

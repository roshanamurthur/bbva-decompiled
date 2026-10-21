package io.reactivex.internal.operators.observable;

import io.reactivex.ObservableSource;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.util.EmptyComponent;

/* JADX INFO: loaded from: classes12.dex */
public final class ObservableDetach<T> extends io.reactivex.internal.operators.observable.a<T, T> {

    public static final class a<T> implements Observer<T>, Disposable {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public Observer<? super T> f72311p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public Disposable f72312q0;

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
            Disposable disposable = this.f72312q0;
            this.f72312q0 = EmptyComponent.INSTANCE;
            this.f72311p0 = EmptyComponent.asObserver();
            disposable.dispose();
        }

        @Override // io.reactivex.disposables.Disposable
        public final boolean isDisposed() {
            return this.f72312q0.isDisposed();
        }

        @Override // io.reactivex.Observer
        public final void onComplete() {
            Observer<? super T> observer = this.f72311p0;
            this.f72312q0 = EmptyComponent.INSTANCE;
            this.f72311p0 = EmptyComponent.asObserver();
            observer.onComplete();
        }

        @Override // io.reactivex.Observer
        public final void onError(Throwable th2) {
            Observer<? super T> observer = this.f72311p0;
            this.f72312q0 = EmptyComponent.INSTANCE;
            this.f72311p0 = EmptyComponent.asObserver();
            observer.onError(th2);
        }

        @Override // io.reactivex.Observer
        public final void onNext(T t10) {
            this.f72311p0.onNext(t10);
        }

        @Override // io.reactivex.Observer
        public final void onSubscribe(Disposable disposable) {
            if (DisposableHelper.validate(this.f72312q0, disposable)) {
                this.f72312q0 = disposable;
                this.f72311p0.onSubscribe(this);
            }
        }
    }

    public ObservableDetach(ObservableSource<T> observableSource) {
        super(observableSource);
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(Observer<? super T> observer) {
        ObservableSource<T> observableSource = this.source;
        a aVar = new a();
        aVar.f72311p0 = observer;
        observableSource.subscribe(aVar);
    }
}

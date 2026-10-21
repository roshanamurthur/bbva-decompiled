package io.reactivex.rxjava3.internal.operators.observable;

import io.reactivex.rxjava3.core.ObservableSource;
import io.reactivex.rxjava3.core.Observer;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.util.EmptyComponent;

/* JADX INFO: loaded from: classes12.dex */
public final class ObservableDetach<T> extends io.reactivex.rxjava3.internal.operators.observable.a<T, T> {

    public static final class a<T> implements Observer<T>, Disposable {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public Observer<? super T> f76592p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public Disposable f76593q0;

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public final void dispose() {
            Disposable disposable = this.f76593q0;
            this.f76593q0 = EmptyComponent.INSTANCE;
            this.f76592p0 = EmptyComponent.asObserver();
            disposable.dispose();
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public final boolean isDisposed() {
            return this.f76593q0.isDisposed();
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onComplete() {
            Observer<? super T> observer = this.f76592p0;
            this.f76593q0 = EmptyComponent.INSTANCE;
            this.f76592p0 = EmptyComponent.asObserver();
            observer.onComplete();
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onError(Throwable th2) {
            Observer<? super T> observer = this.f76592p0;
            this.f76593q0 = EmptyComponent.INSTANCE;
            this.f76592p0 = EmptyComponent.asObserver();
            observer.onError(th2);
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onNext(T t10) {
            this.f76592p0.onNext(t10);
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onSubscribe(Disposable disposable) {
            if (DisposableHelper.validate(this.f76593q0, disposable)) {
                this.f76593q0 = disposable;
                this.f76592p0.onSubscribe(this);
            }
        }
    }

    public ObservableDetach(ObservableSource<T> observableSource) {
        super(observableSource);
    }

    @Override // io.reactivex.rxjava3.core.Observable
    public void subscribeActual(Observer<? super T> observer) {
        ObservableSource<T> observableSource = this.source;
        a aVar = new a();
        aVar.f76592p0 = observer;
        observableSource.subscribe(aVar);
    }
}

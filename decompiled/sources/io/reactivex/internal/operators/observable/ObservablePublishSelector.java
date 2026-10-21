package io.reactivex.internal.operators.observable;

import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.Function;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.disposables.EmptyDisposable;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.subjects.PublishSubject;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes12.dex */
public final class ObservablePublishSelector<T, R> extends io.reactivex.internal.operators.observable.a<T, R> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final Function<? super Observable<T>, ? extends ObservableSource<R>> f72660p0;

    public static final class a<T, R> implements Observer<T> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final PublishSubject<T> f72661p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final AtomicReference<Disposable> f72662q0;

        public a(PublishSubject publishSubject, b bVar) {
            this.f72661p0 = publishSubject;
            this.f72662q0 = bVar;
        }

        @Override // io.reactivex.Observer
        public final void onComplete() {
            this.f72661p0.onComplete();
        }

        @Override // io.reactivex.Observer
        public final void onError(Throwable th2) {
            this.f72661p0.onError(th2);
        }

        @Override // io.reactivex.Observer
        public final void onNext(T t10) {
            this.f72661p0.onNext(t10);
        }

        @Override // io.reactivex.Observer
        public final void onSubscribe(Disposable disposable) {
            DisposableHelper.setOnce(this.f72662q0, disposable);
        }
    }

    public static final class b<T, R> extends AtomicReference<Disposable> implements Observer<R>, Disposable {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final Observer<? super R> f72663p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public Disposable f72664q0;

        public b(Observer<? super R> observer) {
            this.f72663p0 = observer;
        }

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
            this.f72664q0.dispose();
            DisposableHelper.dispose(this);
        }

        @Override // io.reactivex.disposables.Disposable
        public final boolean isDisposed() {
            return this.f72664q0.isDisposed();
        }

        @Override // io.reactivex.Observer
        public final void onComplete() {
            DisposableHelper.dispose(this);
            this.f72663p0.onComplete();
        }

        @Override // io.reactivex.Observer
        public final void onError(Throwable th2) {
            DisposableHelper.dispose(this);
            this.f72663p0.onError(th2);
        }

        @Override // io.reactivex.Observer
        public final void onNext(R r3) {
            this.f72663p0.onNext(r3);
        }

        @Override // io.reactivex.Observer
        public final void onSubscribe(Disposable disposable) {
            if (DisposableHelper.validate(this.f72664q0, disposable)) {
                this.f72664q0 = disposable;
                this.f72663p0.onSubscribe(this);
            }
        }
    }

    public ObservablePublishSelector(ObservableSource<T> observableSource, Function<? super Observable<T>, ? extends ObservableSource<R>> function) {
        super(observableSource);
        this.f72660p0 = function;
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(Observer<? super R> observer) {
        PublishSubject publishSubjectCreate = PublishSubject.create();
        try {
            ObservableSource observableSource = (ObservableSource) ObjectHelper.requireNonNull(this.f72660p0.apply(publishSubjectCreate), "The selector returned a null ObservableSource");
            b bVar = new b(observer);
            observableSource.subscribe(bVar);
            this.source.subscribe(new a(publishSubjectCreate, bVar));
        } catch (Throwable th2) {
            Exceptions.throwIfFatal(th2);
            EmptyDisposable.error(th2, observer);
        }
    }
}

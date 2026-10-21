package io.reactivex.rxjava3.internal.operators.observable;

import io.reactivex.rxjava3.core.ObservableSource;
import io.reactivex.rxjava3.core.Observer;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import java.util.ArrayDeque;

/* JADX INFO: loaded from: classes12.dex */
public final class ObservableTakeLast<T> extends io.reactivex.rxjava3.internal.operators.observable.a<T, T> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final int f77214p0;

    public static final class a<T> extends ArrayDeque<T> implements Observer<T>, Disposable {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final Observer<? super T> f77215p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final int f77216q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public Disposable f77217r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public volatile boolean f77218s0;

        public a(Observer<? super T> observer, int i10) {
            this.f77215p0 = observer;
            this.f77216q0 = i10;
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public final void dispose() {
            if (this.f77218s0) {
                return;
            }
            this.f77218s0 = true;
            this.f77217r0.dispose();
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public final boolean isDisposed() {
            return this.f77218s0;
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onComplete() {
            Observer<? super T> observer = this.f77215p0;
            while (!this.f77218s0) {
                T tPoll = poll();
                if (tPoll == null) {
                    observer.onComplete();
                    return;
                }
                observer.onNext(tPoll);
            }
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onError(Throwable th2) {
            this.f77215p0.onError(th2);
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onNext(T t10) {
            if (this.f77216q0 == size()) {
                poll();
            }
            offer(t10);
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onSubscribe(Disposable disposable) {
            if (DisposableHelper.validate(this.f77217r0, disposable)) {
                this.f77217r0 = disposable;
                this.f77215p0.onSubscribe(this);
            }
        }
    }

    public ObservableTakeLast(ObservableSource<T> observableSource, int i10) {
        super(observableSource);
        this.f77214p0 = i10;
    }

    @Override // io.reactivex.rxjava3.core.Observable
    public void subscribeActual(Observer<? super T> observer) {
        this.source.subscribe(new a(observer, this.f77214p0));
    }
}

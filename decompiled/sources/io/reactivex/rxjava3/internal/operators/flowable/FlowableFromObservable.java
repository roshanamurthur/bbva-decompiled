package io.reactivex.rxjava3.internal.operators.flowable;

import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.ObservableSource;
import io.reactivex.rxjava3.core.Observer;
import io.reactivex.rxjava3.disposables.Disposable;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* JADX INFO: loaded from: classes12.dex */
public final class FlowableFromObservable<T> extends Flowable<T> {

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final ObservableSource<T> f74937q0;

    public FlowableFromObservable(ObservableSource<T> observableSource) {
        this.f74937q0 = observableSource;
    }

    @Override // io.reactivex.rxjava3.core.Flowable
    public void subscribeActual(Subscriber<? super T> subscriber) {
        this.f74937q0.subscribe(new a(subscriber));
    }

    public static final class a<T> implements Observer<T>, Subscription {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final Subscriber<? super T> f74938p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public Disposable f74939q0;

        public a(Subscriber<? super T> subscriber) {
            this.f74938p0 = subscriber;
        }

        @Override // org.reactivestreams.Subscription
        public final void cancel() {
            this.f74939q0.dispose();
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onComplete() {
            this.f74938p0.onComplete();
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onError(Throwable th2) {
            this.f74938p0.onError(th2);
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onNext(T t10) {
            this.f74938p0.onNext(t10);
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onSubscribe(Disposable disposable) {
            this.f74939q0 = disposable;
            this.f74938p0.onSubscribe(this);
        }

        @Override // org.reactivestreams.Subscription
        public final void request(long j10) {
        }
    }
}

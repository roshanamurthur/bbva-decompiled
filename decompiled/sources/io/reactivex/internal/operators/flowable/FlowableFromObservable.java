package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* JADX INFO: loaded from: classes11.dex */
public final class FlowableFromObservable<T> extends Flowable<T> {

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final Observable<T> f70663q0;

    public FlowableFromObservable(Observable<T> observable) {
        this.f70663q0 = observable;
    }

    @Override // io.reactivex.Flowable
    public void subscribeActual(Subscriber<? super T> subscriber) {
        this.f70663q0.subscribe(new a(subscriber));
    }

    public static final class a<T> implements Observer<T>, Subscription {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final Subscriber<? super T> f70664p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public Disposable f70665q0;

        public a(Subscriber<? super T> subscriber) {
            this.f70664p0 = subscriber;
        }

        @Override // org.reactivestreams.Subscription
        public final void cancel() {
            this.f70665q0.dispose();
        }

        @Override // io.reactivex.Observer
        public final void onComplete() {
            this.f70664p0.onComplete();
        }

        @Override // io.reactivex.Observer
        public final void onError(Throwable th2) {
            this.f70664p0.onError(th2);
        }

        @Override // io.reactivex.Observer
        public final void onNext(T t10) {
            this.f70664p0.onNext(t10);
        }

        @Override // io.reactivex.Observer
        public final void onSubscribe(Disposable disposable) {
            this.f70665q0 = disposable;
            this.f70664p0.onSubscribe(this);
        }

        @Override // org.reactivestreams.Subscription
        public final void request(long j10) {
        }
    }
}

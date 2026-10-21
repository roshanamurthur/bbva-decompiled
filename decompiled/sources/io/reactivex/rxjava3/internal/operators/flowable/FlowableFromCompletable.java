package io.reactivex.rxjava3.internal.operators.flowable;

import io.reactivex.rxjava3.core.CompletableObserver;
import io.reactivex.rxjava3.core.CompletableSource;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.fuseable.AbstractEmptyQueueFuseable;
import io.reactivex.rxjava3.internal.fuseable.HasUpstreamCompletableSource;
import org.reactivestreams.Subscriber;

/* JADX INFO: loaded from: classes12.dex */
public final class FlowableFromCompletable<T> extends Flowable<T> implements HasUpstreamCompletableSource {

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final CompletableSource f74925q0;

    public static final class FromCompletableObserver<T> extends AbstractEmptyQueueFuseable<T> implements CompletableObserver {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final Subscriber<? super T> f74926p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public Disposable f74927q0;

        public FromCompletableObserver(Subscriber<? super T> subscriber) {
            this.f74926p0 = subscriber;
        }

        @Override // io.reactivex.rxjava3.internal.fuseable.AbstractEmptyQueueFuseable, org.reactivestreams.Subscription
        public void cancel() {
            this.f74927q0.dispose();
            this.f74927q0 = DisposableHelper.DISPOSED;
        }

        @Override // io.reactivex.rxjava3.core.CompletableObserver
        public void onComplete() {
            this.f74927q0 = DisposableHelper.DISPOSED;
            this.f74926p0.onComplete();
        }

        @Override // io.reactivex.rxjava3.core.CompletableObserver
        public void onError(Throwable th2) {
            this.f74927q0 = DisposableHelper.DISPOSED;
            this.f74926p0.onError(th2);
        }

        @Override // io.reactivex.rxjava3.core.CompletableObserver
        public void onSubscribe(Disposable disposable) {
            if (DisposableHelper.validate(this.f74927q0, disposable)) {
                this.f74927q0 = disposable;
                this.f74926p0.onSubscribe(this);
            }
        }
    }

    public FlowableFromCompletable(CompletableSource completableSource) {
        this.f74925q0 = completableSource;
    }

    @Override // io.reactivex.rxjava3.internal.fuseable.HasUpstreamCompletableSource
    public CompletableSource source() {
        return this.f74925q0;
    }

    @Override // io.reactivex.rxjava3.core.Flowable
    public void subscribeActual(Subscriber<? super T> subscriber) {
        this.f74925q0.subscribe(new FromCompletableObserver(subscriber));
    }
}

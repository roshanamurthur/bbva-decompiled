package io.reactivex.rxjava3.internal.operators.observable;

import io.reactivex.rxjava3.annotations.Nullable;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Observer;
import io.reactivex.rxjava3.internal.observers.BasicIntQueueDisposable;

/* JADX INFO: loaded from: classes12.dex */
public final class ObservableRange extends Observable<Integer> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final int f76942p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final long f76943q0;

    public static final class a extends BasicIntQueueDisposable<Integer> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final Observer<? super Integer> f76944p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final long f76945q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public long f76946r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public boolean f76947s0;

        public a(Observer<? super Integer> observer, long j10, long j11) {
            this.f76944p0 = observer;
            this.f76946r0 = j10;
            this.f76945q0 = j11;
        }

        @Override // io.reactivex.rxjava3.internal.fuseable.SimpleQueue
        public final void clear() {
            this.f76946r0 = this.f76945q0;
            lazySet(1);
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public final void dispose() {
            set(1);
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public final boolean isDisposed() {
            return get() != 0;
        }

        @Override // io.reactivex.rxjava3.internal.fuseable.SimpleQueue
        public final boolean isEmpty() {
            return this.f76946r0 == this.f76945q0;
        }

        @Override // io.reactivex.rxjava3.internal.fuseable.SimpleQueue
        @Nullable
        public final Object poll() throws Throwable {
            long j10 = this.f76946r0;
            if (j10 != this.f76945q0) {
                this.f76946r0 = 1 + j10;
                return Integer.valueOf((int) j10);
            }
            lazySet(1);
            return null;
        }

        @Override // io.reactivex.rxjava3.internal.fuseable.QueueFuseable
        public final int requestFusion(int i10) {
            if ((i10 & 1) == 0) {
                return 0;
            }
            this.f76947s0 = true;
            return 1;
        }
    }

    public ObservableRange(int i10, int i11) {
        this.f76942p0 = i10;
        this.f76943q0 = ((long) i10) + ((long) i11);
    }

    @Override // io.reactivex.rxjava3.core.Observable
    public void subscribeActual(Observer<? super Integer> observer) {
        Observer<? super Integer> observer2;
        a aVar = new a(observer, this.f76942p0, this.f76943q0);
        observer.onSubscribe(aVar);
        if (aVar.f76947s0) {
            return;
        }
        long j10 = aVar.f76946r0;
        while (true) {
            long j11 = aVar.f76945q0;
            observer2 = aVar.f76944p0;
            if (j10 == j11 || aVar.get() != 0) {
                break;
            }
            observer2.onNext(Integer.valueOf((int) j10));
            j10++;
        }
        if (aVar.get() == 0) {
            aVar.lazySet(1);
            observer2.onComplete();
        }
    }
}

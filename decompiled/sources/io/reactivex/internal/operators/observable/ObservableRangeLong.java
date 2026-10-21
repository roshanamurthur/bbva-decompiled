package io.reactivex.internal.operators.observable;

import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.annotations.Nullable;
import io.reactivex.internal.observers.BasicIntQueueDisposable;

/* JADX INFO: loaded from: classes12.dex */
public final class ObservableRangeLong extends Observable<Long> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final long f72671p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final long f72672q0;

    public static final class a extends BasicIntQueueDisposable<Long> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final Observer<? super Long> f72673p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final long f72674q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public long f72675r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public boolean f72676s0;

        public a(Observer<? super Long> observer, long j10, long j11) {
            this.f72673p0 = observer;
            this.f72675r0 = j10;
            this.f72674q0 = j11;
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public final void clear() {
            this.f72675r0 = this.f72674q0;
            lazySet(1);
        }

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
            set(1);
        }

        @Override // io.reactivex.disposables.Disposable
        public final boolean isDisposed() {
            return get() != 0;
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public final boolean isEmpty() {
            return this.f72675r0 == this.f72674q0;
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        @Nullable
        public final Object poll() throws Exception {
            long j10 = this.f72675r0;
            if (j10 != this.f72674q0) {
                this.f72675r0 = 1 + j10;
                return Long.valueOf(j10);
            }
            lazySet(1);
            return null;
        }

        @Override // io.reactivex.internal.fuseable.QueueFuseable
        public final int requestFusion(int i10) {
            if ((i10 & 1) == 0) {
                return 0;
            }
            this.f72676s0 = true;
            return 1;
        }
    }

    public ObservableRangeLong(long j10, long j11) {
        this.f72671p0 = j10;
        this.f72672q0 = j11;
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(Observer<? super Long> observer) {
        Observer<? super Long> observer2;
        long j10 = this.f72671p0;
        a aVar = new a(observer, j10, j10 + this.f72672q0);
        observer.onSubscribe(aVar);
        if (aVar.f72676s0) {
            return;
        }
        long j11 = aVar.f72675r0;
        while (true) {
            long j12 = aVar.f72674q0;
            observer2 = aVar.f72673p0;
            if (j11 == j12 || aVar.get() != 0) {
                break;
            }
            observer2.onNext(Long.valueOf(j11));
            j11++;
        }
        if (aVar.get() == 0) {
            aVar.lazySet(1);
            observer2.onComplete();
        }
    }
}

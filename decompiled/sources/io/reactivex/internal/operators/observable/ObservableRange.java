package io.reactivex.internal.operators.observable;

import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.annotations.Nullable;
import io.reactivex.internal.observers.BasicIntQueueDisposable;

/* JADX INFO: loaded from: classes12.dex */
public final class ObservableRange extends Observable<Integer> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final int f72665p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final long f72666q0;

    public static final class a extends BasicIntQueueDisposable<Integer> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final Observer<? super Integer> f72667p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final long f72668q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public long f72669r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public boolean f72670s0;

        public a(Observer<? super Integer> observer, long j10, long j11) {
            this.f72667p0 = observer;
            this.f72669r0 = j10;
            this.f72668q0 = j11;
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public final void clear() {
            this.f72669r0 = this.f72668q0;
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
            return this.f72669r0 == this.f72668q0;
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        @Nullable
        public final Object poll() throws Exception {
            long j10 = this.f72669r0;
            if (j10 != this.f72668q0) {
                this.f72669r0 = 1 + j10;
                return Integer.valueOf((int) j10);
            }
            lazySet(1);
            return null;
        }

        @Override // io.reactivex.internal.fuseable.QueueFuseable
        public final int requestFusion(int i10) {
            if ((i10 & 1) == 0) {
                return 0;
            }
            this.f72670s0 = true;
            return 1;
        }
    }

    public ObservableRange(int i10, int i11) {
        this.f72665p0 = i10;
        this.f72666q0 = ((long) i10) + ((long) i11);
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(Observer<? super Integer> observer) {
        Observer<? super Integer> observer2;
        a aVar = new a(observer, this.f72665p0, this.f72666q0);
        observer.onSubscribe(aVar);
        if (aVar.f72670s0) {
            return;
        }
        long j10 = aVar.f72669r0;
        while (true) {
            long j11 = aVar.f72668q0;
            observer2 = aVar.f72667p0;
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

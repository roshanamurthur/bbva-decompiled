package io.reactivex.rxjava3.internal.operators.observable;

import io.reactivex.rxjava3.annotations.Nullable;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Observer;
import io.reactivex.rxjava3.internal.observers.BasicQueueDisposable;
import java.util.Objects;

/* JADX INFO: loaded from: classes12.dex */
public final class ObservableFromArray<T> extends Observable<T> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final T[] f76715p0;

    public static final class a<T> extends BasicQueueDisposable<T> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final Observer<? super T> f76716p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final T[] f76717q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public int f76718r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public boolean f76719s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public volatile boolean f76720t0;

        public a(Observer<? super T> observer, T[] tArr) {
            this.f76716p0 = observer;
            this.f76717q0 = tArr;
        }

        @Override // io.reactivex.rxjava3.internal.fuseable.SimpleQueue
        public final void clear() {
            this.f76718r0 = this.f76717q0.length;
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public final void dispose() {
            this.f76720t0 = true;
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public final boolean isDisposed() {
            return this.f76720t0;
        }

        @Override // io.reactivex.rxjava3.internal.fuseable.SimpleQueue
        public final boolean isEmpty() {
            return this.f76718r0 == this.f76717q0.length;
        }

        @Override // io.reactivex.rxjava3.internal.fuseable.SimpleQueue
        @Nullable
        public final T poll() {
            int i10 = this.f76718r0;
            T[] tArr = this.f76717q0;
            if (i10 == tArr.length) {
                return null;
            }
            this.f76718r0 = i10 + 1;
            T t10 = tArr[i10];
            Objects.requireNonNull(t10, "The array element is null");
            return t10;
        }

        @Override // io.reactivex.rxjava3.internal.fuseable.QueueFuseable
        public final int requestFusion(int i10) {
            if ((i10 & 1) == 0) {
                return 0;
            }
            this.f76719s0 = true;
            return 1;
        }
    }

    public ObservableFromArray(T[] tArr) {
        this.f76715p0 = tArr;
    }

    @Override // io.reactivex.rxjava3.core.Observable
    public void subscribeActual(Observer<? super T> observer) {
        a aVar = new a(observer, this.f76715p0);
        observer.onSubscribe(aVar);
        if (aVar.f76719s0) {
            return;
        }
        T[] tArr = aVar.f76717q0;
        int length = tArr.length;
        for (int i10 = 0; i10 < length && !aVar.f76720t0; i10++) {
            T t10 = tArr[i10];
            if (t10 == null) {
                aVar.f76716p0.onError(new NullPointerException(androidx.camera.core.impl.utils.b.a("The element at index ", i10, " is null")));
                return;
            }
            aVar.f76716p0.onNext(t10);
        }
        if (aVar.f76720t0) {
            return;
        }
        aVar.f76716p0.onComplete();
    }
}

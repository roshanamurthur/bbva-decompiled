package io.reactivex.internal.operators.observable;

import androidx.camera.core.impl.utils.b;
import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.annotations.Nullable;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.observers.BasicQueueDisposable;

/* JADX INFO: loaded from: classes12.dex */
public final class ObservableFromArray<T> extends Observable<T> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final T[] f72434p0;

    public static final class a<T> extends BasicQueueDisposable<T> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final Observer<? super T> f72435p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final T[] f72436q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public int f72437r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public boolean f72438s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public volatile boolean f72439t0;

        public a(Observer<? super T> observer, T[] tArr) {
            this.f72435p0 = observer;
            this.f72436q0 = tArr;
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public final void clear() {
            this.f72437r0 = this.f72436q0.length;
        }

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
            this.f72439t0 = true;
        }

        @Override // io.reactivex.disposables.Disposable
        public final boolean isDisposed() {
            return this.f72439t0;
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public final boolean isEmpty() {
            return this.f72437r0 == this.f72436q0.length;
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        @Nullable
        public final T poll() {
            int i10 = this.f72437r0;
            T[] tArr = this.f72436q0;
            if (i10 == tArr.length) {
                return null;
            }
            this.f72437r0 = i10 + 1;
            return (T) ObjectHelper.requireNonNull(tArr[i10], "The array element is null");
        }

        @Override // io.reactivex.internal.fuseable.QueueFuseable
        public final int requestFusion(int i10) {
            if ((i10 & 1) == 0) {
                return 0;
            }
            this.f72438s0 = true;
            return 1;
        }
    }

    public ObservableFromArray(T[] tArr) {
        this.f72434p0 = tArr;
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(Observer<? super T> observer) {
        a aVar = new a(observer, this.f72434p0);
        observer.onSubscribe(aVar);
        if (aVar.f72438s0) {
            return;
        }
        T[] tArr = aVar.f72436q0;
        int length = tArr.length;
        for (int i10 = 0; i10 < length && !aVar.f72439t0; i10++) {
            T t10 = tArr[i10];
            if (t10 == null) {
                aVar.f72435p0.onError(new NullPointerException(b.a("The element at index ", i10, " is null")));
                return;
            }
            aVar.f72435p0.onNext(t10);
        }
        if (aVar.f72439t0) {
            return;
        }
        aVar.f72435p0.onComplete();
    }
}

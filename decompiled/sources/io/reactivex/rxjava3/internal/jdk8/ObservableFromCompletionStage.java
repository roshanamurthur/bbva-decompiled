package io.reactivex.rxjava3.internal.jdk8;

import androidx.window.layout.h;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Observer;
import io.reactivex.rxjava3.internal.observers.DeferredScalarDisposable;
import java.util.concurrent.CompletionStage;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.BiConsumer;

/* JADX INFO: loaded from: classes12.dex */
public final class ObservableFromCompletionStage<T> extends Observable<T> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final CompletionStage<T> f74110p0;

    public static final class a<T> extends AtomicReference<BiConsumer<T, Throwable>> implements BiConsumer<T, Throwable> {
        @Override // java.util.function.BiConsumer
        public final void accept(Object obj, Throwable th2) {
            Throwable th3 = th2;
            BiConsumer biConsumerF = h.f(get());
            if (biConsumerF != null) {
                biConsumerF.accept(obj, th3);
            }
        }
    }

    public static final class b<T> extends DeferredScalarDisposable<T> implements BiConsumer<T, Throwable> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final a<T> f74111p0;

        public b(Observer<? super T> observer, a<T> aVar) {
            super(observer);
            this.f74111p0 = aVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.function.BiConsumer
        public final void accept(Object obj, Throwable th2) {
            Throwable th3 = th2;
            if (th3 != null) {
                this.downstream.onError(th3);
            } else if (obj != 0) {
                complete(obj);
            } else {
                this.downstream.onError(new NullPointerException("The CompletionStage terminated with null."));
            }
        }

        @Override // io.reactivex.rxjava3.internal.observers.DeferredScalarDisposable, io.reactivex.rxjava3.disposables.Disposable
        public final void dispose() {
            super.dispose();
            this.f74111p0.set(null);
        }
    }

    public ObservableFromCompletionStage(CompletionStage<T> completionStage) {
        this.f74110p0 = completionStage;
    }

    @Override // io.reactivex.rxjava3.core.Observable
    public void subscribeActual(Observer<? super T> observer) {
        a aVar = new a();
        b bVar = new b(observer, aVar);
        aVar.lazySet(bVar);
        observer.onSubscribe(bVar);
        this.f74110p0.whenComplete(aVar);
    }
}

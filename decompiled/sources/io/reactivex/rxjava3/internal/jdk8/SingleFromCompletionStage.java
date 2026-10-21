package io.reactivex.rxjava3.internal.jdk8;

import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.core.SingleObserver;
import io.reactivex.rxjava3.disposables.Disposable;
import java.util.concurrent.CompletionStage;
import java.util.function.BiConsumer;

/* JADX INFO: loaded from: classes12.dex */
public final class SingleFromCompletionStage<T> extends Single<T> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final CompletionStage<T> f74172p0;

    public static final class a<T> implements Disposable, BiConsumer<T, Throwable> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final SingleObserver<? super T> f74173p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final FlowableFromCompletionStage.a<T> f74174q0;

        public a(SingleObserver<? super T> singleObserver, FlowableFromCompletionStage.a<T> aVar) {
            this.f74173p0 = singleObserver;
            this.f74174q0 = aVar;
        }

        @Override // java.util.function.BiConsumer
        public final void accept(Object obj, Throwable th2) {
            Throwable th3 = th2;
            if (th3 != null) {
                this.f74173p0.onError(th3);
            } else if (obj != null) {
                this.f74173p0.onSuccess(obj);
            } else {
                this.f74173p0.onError(new NullPointerException("The CompletionStage terminated with null."));
            }
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public final void dispose() {
            this.f74174q0.set(null);
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public final boolean isDisposed() {
            return this.f74174q0.get() == null;
        }
    }

    public SingleFromCompletionStage(CompletionStage<T> completionStage) {
        this.f74172p0 = completionStage;
    }

    @Override // io.reactivex.rxjava3.core.Single
    public void subscribeActual(SingleObserver<? super T> singleObserver) {
        FlowableFromCompletionStage.a aVar = new FlowableFromCompletionStage.a();
        a aVar2 = new a(singleObserver, aVar);
        aVar.lazySet(aVar2);
        singleObserver.onSubscribe(aVar2);
        this.f74172p0.whenComplete(aVar);
    }
}

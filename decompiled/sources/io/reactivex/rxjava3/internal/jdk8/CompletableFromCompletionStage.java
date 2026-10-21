package io.reactivex.rxjava3.internal.jdk8;

import io.reactivex.rxjava3.core.Completable;
import io.reactivex.rxjava3.core.CompletableObserver;
import io.reactivex.rxjava3.disposables.Disposable;
import java.util.concurrent.CompletionStage;
import java.util.function.BiConsumer;

/* JADX INFO: loaded from: classes12.dex */
public final class CompletableFromCompletionStage<T> extends Completable {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final CompletionStage<T> f74005p0;

    public static final class a<T> implements Disposable, BiConsumer<T, Throwable> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final CompletableObserver f74006p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final FlowableFromCompletionStage.a<T> f74007q0;

        public a(CompletableObserver completableObserver, FlowableFromCompletionStage.a<T> aVar) {
            this.f74006p0 = completableObserver;
            this.f74007q0 = aVar;
        }

        @Override // java.util.function.BiConsumer
        public final void accept(Object obj, Throwable th2) {
            Throwable th3 = th2;
            if (th3 != null) {
                this.f74006p0.onError(th3);
            } else {
                this.f74006p0.onComplete();
            }
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public final void dispose() {
            this.f74007q0.set(null);
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public final boolean isDisposed() {
            return this.f74007q0.get() == null;
        }
    }

    public CompletableFromCompletionStage(CompletionStage<T> completionStage) {
        this.f74005p0 = completionStage;
    }

    @Override // io.reactivex.rxjava3.core.Completable
    public void subscribeActual(CompletableObserver completableObserver) {
        FlowableFromCompletionStage.a aVar = new FlowableFromCompletionStage.a();
        a aVar2 = new a(completableObserver, aVar);
        aVar.lazySet(aVar2);
        completableObserver.onSubscribe(aVar2);
        this.f74005p0.whenComplete(aVar);
    }
}

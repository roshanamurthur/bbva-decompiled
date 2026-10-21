package io.reactivex.rxjava3.internal.jdk8;

import io.reactivex.rxjava3.core.Maybe;
import io.reactivex.rxjava3.core.MaybeObserver;
import io.reactivex.rxjava3.disposables.Disposable;
import java.util.concurrent.CompletionStage;
import java.util.function.BiConsumer;

/* JADX INFO: loaded from: classes12.dex */
public final class MaybeFromCompletionStage<T> extends Maybe<T> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final CompletionStage<T> f74078p0;

    public static final class a<T> implements Disposable, BiConsumer<T, Throwable> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final MaybeObserver<? super T> f74079p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final FlowableFromCompletionStage.a<T> f74080q0;

        public a(MaybeObserver<? super T> maybeObserver, FlowableFromCompletionStage.a<T> aVar) {
            this.f74079p0 = maybeObserver;
            this.f74080q0 = aVar;
        }

        @Override // java.util.function.BiConsumer
        public final void accept(Object obj, Throwable th2) {
            Throwable th3 = th2;
            if (th3 != null) {
                this.f74079p0.onError(th3);
            } else if (obj != null) {
                this.f74079p0.onSuccess(obj);
            } else {
                this.f74079p0.onComplete();
            }
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public final void dispose() {
            this.f74080q0.set(null);
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public final boolean isDisposed() {
            return this.f74080q0.get() == null;
        }
    }

    public MaybeFromCompletionStage(CompletionStage<T> completionStage) {
        this.f74078p0 = completionStage;
    }

    @Override // io.reactivex.rxjava3.core.Maybe
    public void subscribeActual(MaybeObserver<? super T> maybeObserver) {
        FlowableFromCompletionStage.a aVar = new FlowableFromCompletionStage.a();
        a aVar2 = new a(maybeObserver, aVar);
        aVar.lazySet(aVar2);
        maybeObserver.onSubscribe(aVar2);
        this.f74078p0.whenComplete(aVar);
    }
}

package io.reactivex.rxjava3.internal.operators.observable;

import io.reactivex.rxjava3.core.Emitter;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Observer;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.exceptions.Exceptions;
import io.reactivex.rxjava3.functions.BiFunction;
import io.reactivex.rxjava3.functions.Consumer;
import io.reactivex.rxjava3.functions.Supplier;
import io.reactivex.rxjava3.internal.disposables.EmptyDisposable;
import io.reactivex.rxjava3.internal.util.ExceptionHelper;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;

/* JADX INFO: loaded from: classes12.dex */
public final class ObservableGenerate<T, S> extends Observable<T> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final Supplier<S> f76741p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final BiFunction<S, Emitter<T>, S> f76742q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final Consumer<? super S> f76743r0;

    public static final class a<T, S> implements Emitter<T>, Disposable {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final Observer<? super T> f76744p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final BiFunction<S, ? super Emitter<T>, S> f76745q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final Consumer<? super S> f76746r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public S f76747s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public volatile boolean f76748t0;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public boolean f76749u0;
        public boolean v0;

        public a(Observer<? super T> observer, BiFunction<S, ? super Emitter<T>, S> biFunction, Consumer<? super S> consumer, S s4) {
            this.f76744p0 = observer;
            this.f76745q0 = biFunction;
            this.f76746r0 = consumer;
            this.f76747s0 = s4;
        }

        public final void a(S s4) {
            try {
                this.f76746r0.accept(s4);
            } catch (Throwable th2) {
                Exceptions.throwIfFatal(th2);
                RxJavaPlugins.onError(th2);
            }
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public final void dispose() {
            this.f76748t0 = true;
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public final boolean isDisposed() {
            return this.f76748t0;
        }

        @Override // io.reactivex.rxjava3.core.Emitter
        public final void onComplete() {
            if (this.f76749u0) {
                return;
            }
            this.f76749u0 = true;
            this.f76744p0.onComplete();
        }

        @Override // io.reactivex.rxjava3.core.Emitter
        public final void onError(Throwable th2) {
            if (this.f76749u0) {
                RxJavaPlugins.onError(th2);
                return;
            }
            if (th2 == null) {
                th2 = ExceptionHelper.createNullPointerException("onError called with a null Throwable.");
            }
            this.f76749u0 = true;
            this.f76744p0.onError(th2);
        }

        @Override // io.reactivex.rxjava3.core.Emitter
        public final void onNext(T t10) {
            if (this.f76749u0) {
                return;
            }
            if (this.v0) {
                onError(new IllegalStateException("onNext already called in this generate turn"));
            } else if (t10 == null) {
                onError(ExceptionHelper.createNullPointerException("onNext called with a null value."));
            } else {
                this.v0 = true;
                this.f76744p0.onNext(t10);
            }
        }
    }

    public ObservableGenerate(Supplier<S> supplier, BiFunction<S, Emitter<T>, S> biFunction, Consumer<? super S> consumer) {
        this.f76741p0 = supplier;
        this.f76742q0 = biFunction;
        this.f76743r0 = consumer;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // io.reactivex.rxjava3.core.Observable
    public void subscribeActual(Observer<? super T> observer) {
        try {
            S s4 = this.f76741p0.get();
            BiFunction<S, Emitter<T>, S> biFunction = this.f76742q0;
            a aVar = new a(observer, biFunction, this.f76743r0, s4);
            observer.onSubscribe(aVar);
            S s7 = aVar.f76747s0;
            if (aVar.f76748t0) {
                aVar.f76747s0 = null;
                aVar.a(s7);
                return;
            }
            while (!aVar.f76748t0) {
                aVar.v0 = false;
                try {
                    s7 = (S) biFunction.apply(s7, aVar);
                    if (aVar.f76749u0) {
                        aVar.f76748t0 = true;
                        aVar.f76747s0 = null;
                        aVar.a(s7);
                        return;
                    }
                } catch (Throwable th2) {
                    Exceptions.throwIfFatal(th2);
                    aVar.f76747s0 = null;
                    aVar.f76748t0 = true;
                    aVar.onError(th2);
                    aVar.a(s7);
                    return;
                }
            }
            aVar.f76747s0 = null;
            aVar.a(s7);
        } catch (Throwable th3) {
            Exceptions.throwIfFatal(th3);
            EmptyDisposable.error(th3, observer);
        }
    }
}

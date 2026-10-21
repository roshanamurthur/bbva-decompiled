package io.reactivex.internal.operators.observable;

import io.reactivex.Emitter;
import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.BiFunction;
import io.reactivex.functions.Consumer;
import io.reactivex.internal.disposables.EmptyDisposable;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes12.dex */
public final class ObservableGenerate<T, S> extends Observable<T> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final Callable<S> f72455p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final BiFunction<S, Emitter<T>, S> f72456q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final Consumer<? super S> f72457r0;

    public static final class a<T, S> implements Emitter<T>, Disposable {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final Observer<? super T> f72458p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final BiFunction<S, ? super Emitter<T>, S> f72459q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final Consumer<? super S> f72460r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public S f72461s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public volatile boolean f72462t0;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public boolean f72463u0;
        public boolean v0;

        public a(Observer<? super T> observer, BiFunction<S, ? super Emitter<T>, S> biFunction, Consumer<? super S> consumer, S s4) {
            this.f72458p0 = observer;
            this.f72459q0 = biFunction;
            this.f72460r0 = consumer;
            this.f72461s0 = s4;
        }

        public final void a(S s4) {
            try {
                this.f72460r0.accept(s4);
            } catch (Throwable th2) {
                Exceptions.throwIfFatal(th2);
                RxJavaPlugins.onError(th2);
            }
        }

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
            this.f72462t0 = true;
        }

        @Override // io.reactivex.disposables.Disposable
        public final boolean isDisposed() {
            return this.f72462t0;
        }

        @Override // io.reactivex.Emitter
        public final void onComplete() {
            if (this.f72463u0) {
                return;
            }
            this.f72463u0 = true;
            this.f72458p0.onComplete();
        }

        @Override // io.reactivex.Emitter
        public final void onError(Throwable th2) {
            if (this.f72463u0) {
                RxJavaPlugins.onError(th2);
                return;
            }
            if (th2 == null) {
                th2 = new NullPointerException("onError called with null. Null values are generally not allowed in 2.x operators and sources.");
            }
            this.f72463u0 = true;
            this.f72458p0.onError(th2);
        }

        @Override // io.reactivex.Emitter
        public final void onNext(T t10) {
            if (this.f72463u0) {
                return;
            }
            if (this.v0) {
                onError(new IllegalStateException("onNext already called in this generate turn"));
            } else if (t10 == null) {
                onError(new NullPointerException("onNext called with null. Null values are generally not allowed in 2.x operators and sources."));
            } else {
                this.v0 = true;
                this.f72458p0.onNext(t10);
            }
        }
    }

    public ObservableGenerate(Callable<S> callable, BiFunction<S, Emitter<T>, S> biFunction, Consumer<? super S> consumer) {
        this.f72455p0 = callable;
        this.f72456q0 = biFunction;
        this.f72457r0 = consumer;
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
    @Override // io.reactivex.Observable
    public void subscribeActual(Observer<? super T> observer) {
        try {
            S sCall = this.f72455p0.call();
            BiFunction<S, Emitter<T>, S> biFunction = this.f72456q0;
            a aVar = new a(observer, biFunction, this.f72457r0, sCall);
            observer.onSubscribe(aVar);
            S s4 = aVar.f72461s0;
            if (aVar.f72462t0) {
                aVar.f72461s0 = null;
                aVar.a(s4);
                return;
            }
            while (!aVar.f72462t0) {
                aVar.v0 = false;
                try {
                    s4 = (S) biFunction.apply(s4, aVar);
                    if (aVar.f72463u0) {
                        aVar.f72462t0 = true;
                        aVar.f72461s0 = null;
                        aVar.a(s4);
                        return;
                    }
                } catch (Throwable th2) {
                    Exceptions.throwIfFatal(th2);
                    aVar.f72461s0 = null;
                    aVar.f72462t0 = true;
                    aVar.onError(th2);
                    aVar.a(s4);
                    return;
                }
            }
            aVar.f72461s0 = null;
            aVar.a(s4);
        } catch (Throwable th3) {
            Exceptions.throwIfFatal(th3);
            EmptyDisposable.error(th3, observer);
        }
    }
}

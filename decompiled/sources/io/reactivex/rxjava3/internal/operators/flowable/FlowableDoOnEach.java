package io.reactivex.rxjava3.internal.operators.flowable;

import io.reactivex.rxjava3.annotations.Nullable;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.FlowableSubscriber;
import io.reactivex.rxjava3.exceptions.CompositeException;
import io.reactivex.rxjava3.exceptions.Exceptions;
import io.reactivex.rxjava3.functions.Action;
import io.reactivex.rxjava3.functions.Consumer;
import io.reactivex.rxjava3.internal.fuseable.ConditionalSubscriber;
import io.reactivex.rxjava3.internal.subscribers.BasicFuseableConditionalSubscriber;
import io.reactivex.rxjava3.internal.subscribers.BasicFuseableSubscriber;
import io.reactivex.rxjava3.internal.util.ExceptionHelper;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;
import org.reactivestreams.Subscriber;

/* JADX INFO: loaded from: classes12.dex */
public final class FlowableDoOnEach<T> extends io.reactivex.rxjava3.internal.operators.flowable.a<T, T> {

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final Consumer<? super T> f74778q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final Consumer<? super Throwable> f74779r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final Action f74780s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public final Action f74781t0;

    public static final class a<T> extends BasicFuseableConditionalSubscriber<T, T> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final Consumer<? super T> f74782p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final Consumer<? super Throwable> f74783q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final Action f74784r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final Action f74785s0;

        public a(ConditionalSubscriber<? super T> conditionalSubscriber, Consumer<? super T> consumer, Consumer<? super Throwable> consumer2, Action action, Action action2) {
            super(conditionalSubscriber);
            this.f74782p0 = consumer;
            this.f74783q0 = consumer2;
            this.f74784r0 = action;
            this.f74785s0 = action2;
        }

        @Override // io.reactivex.rxjava3.internal.subscribers.BasicFuseableConditionalSubscriber, org.reactivestreams.Subscriber
        public final void onComplete() {
            if (this.done) {
                return;
            }
            try {
                this.f74784r0.run();
                this.done = true;
                this.downstream.onComplete();
                try {
                    this.f74785s0.run();
                } catch (Throwable th2) {
                    Exceptions.throwIfFatal(th2);
                    RxJavaPlugins.onError(th2);
                }
            } catch (Throwable th3) {
                fail(th3);
            }
        }

        @Override // io.reactivex.rxjava3.internal.subscribers.BasicFuseableConditionalSubscriber, org.reactivestreams.Subscriber
        public final void onError(Throwable th2) {
            if (this.done) {
                RxJavaPlugins.onError(th2);
                return;
            }
            this.done = true;
            try {
                this.f74783q0.accept(th2);
                this.downstream.onError(th2);
            } catch (Throwable th3) {
                Exceptions.throwIfFatal(th3);
                this.downstream.onError(new CompositeException(th2, th3));
            }
            try {
                this.f74785s0.run();
            } catch (Throwable th4) {
                Exceptions.throwIfFatal(th4);
                RxJavaPlugins.onError(th4);
            }
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Override // org.reactivestreams.Subscriber
        public final void onNext(T t10) {
            if (this.done) {
                return;
            }
            if (this.sourceMode != 0) {
                this.downstream.onNext(null);
                return;
            }
            try {
                this.f74782p0.accept(t10);
                this.downstream.onNext((Object) t10);
            } catch (Throwable th2) {
                fail(th2);
            }
        }

        @Override // io.reactivex.rxjava3.internal.fuseable.SimpleQueue
        @Nullable
        public final T poll() throws Exception {
            Consumer<? super Throwable> consumer = this.f74783q0;
            try {
                T tPoll = this.qs.poll();
                Action action = this.f74785s0;
                if (tPoll != null) {
                    try {
                        this.f74782p0.accept(tPoll);
                        action.run();
                    } catch (Throwable th2) {
                        try {
                            Exceptions.throwIfFatal(th2);
                            try {
                                consumer.accept(th2);
                                throw ExceptionHelper.throwIfThrowable(th2);
                            } catch (Throwable th3) {
                                Exceptions.throwIfFatal(th3);
                                throw new CompositeException(th2, th3);
                            }
                        } catch (Throwable th4) {
                            action.run();
                            throw th4;
                        }
                    }
                } else if (this.sourceMode == 1) {
                    this.f74784r0.run();
                    action.run();
                }
                return tPoll;
            } catch (Throwable th5) {
                Exceptions.throwIfFatal(th5);
                try {
                    consumer.accept(th5);
                    throw ExceptionHelper.throwIfThrowable(th5);
                } catch (Throwable th6) {
                    Exceptions.throwIfFatal(th6);
                    throw new CompositeException(th5, th6);
                }
            }
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Override // io.reactivex.rxjava3.internal.fuseable.ConditionalSubscriber
        public final boolean tryOnNext(T t10) {
            if (this.done) {
                return false;
            }
            try {
                this.f74782p0.accept(t10);
                return this.downstream.tryOnNext((Object) t10);
            } catch (Throwable th2) {
                fail(th2);
                return false;
            }
        }
    }

    public static final class b<T> extends BasicFuseableSubscriber<T, T> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final Consumer<? super T> f74786p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final Consumer<? super Throwable> f74787q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final Action f74788r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final Action f74789s0;

        public b(Subscriber<? super T> subscriber, Consumer<? super T> consumer, Consumer<? super Throwable> consumer2, Action action, Action action2) {
            super(subscriber);
            this.f74786p0 = consumer;
            this.f74787q0 = consumer2;
            this.f74788r0 = action;
            this.f74789s0 = action2;
        }

        @Override // io.reactivex.rxjava3.internal.subscribers.BasicFuseableSubscriber, org.reactivestreams.Subscriber
        public final void onComplete() {
            if (this.done) {
                return;
            }
            try {
                this.f74788r0.run();
                this.done = true;
                this.downstream.onComplete();
                try {
                    this.f74789s0.run();
                } catch (Throwable th2) {
                    Exceptions.throwIfFatal(th2);
                    RxJavaPlugins.onError(th2);
                }
            } catch (Throwable th3) {
                fail(th3);
            }
        }

        @Override // io.reactivex.rxjava3.internal.subscribers.BasicFuseableSubscriber, org.reactivestreams.Subscriber
        public final void onError(Throwable th2) {
            if (this.done) {
                RxJavaPlugins.onError(th2);
                return;
            }
            this.done = true;
            try {
                this.f74787q0.accept(th2);
                this.downstream.onError(th2);
            } catch (Throwable th3) {
                Exceptions.throwIfFatal(th3);
                this.downstream.onError(new CompositeException(th2, th3));
            }
            try {
                this.f74789s0.run();
            } catch (Throwable th4) {
                Exceptions.throwIfFatal(th4);
                RxJavaPlugins.onError(th4);
            }
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Override // org.reactivestreams.Subscriber
        public final void onNext(T t10) {
            if (this.done) {
                return;
            }
            if (this.sourceMode != 0) {
                this.downstream.onNext(null);
                return;
            }
            try {
                this.f74786p0.accept(t10);
                this.downstream.onNext((Object) t10);
            } catch (Throwable th2) {
                fail(th2);
            }
        }

        @Override // io.reactivex.rxjava3.internal.fuseable.SimpleQueue
        @Nullable
        public final T poll() throws Exception {
            Consumer<? super Throwable> consumer = this.f74787q0;
            try {
                T tPoll = this.qs.poll();
                Action action = this.f74789s0;
                if (tPoll != null) {
                    try {
                        this.f74786p0.accept(tPoll);
                        action.run();
                    } catch (Throwable th2) {
                        try {
                            Exceptions.throwIfFatal(th2);
                            try {
                                consumer.accept(th2);
                                throw ExceptionHelper.throwIfThrowable(th2);
                            } catch (Throwable th3) {
                                Exceptions.throwIfFatal(th3);
                                throw new CompositeException(th2, th3);
                            }
                        } catch (Throwable th4) {
                            action.run();
                            throw th4;
                        }
                    }
                } else if (this.sourceMode == 1) {
                    this.f74788r0.run();
                    action.run();
                }
                return tPoll;
            } catch (Throwable th5) {
                Exceptions.throwIfFatal(th5);
                try {
                    consumer.accept(th5);
                    throw ExceptionHelper.throwIfThrowable(th5);
                } catch (Throwable th6) {
                    Exceptions.throwIfFatal(th6);
                    throw new CompositeException(th5, th6);
                }
            }
        }
    }

    public FlowableDoOnEach(Flowable<T> flowable, Consumer<? super T> consumer, Consumer<? super Throwable> consumer2, Action action, Action action2) {
        super(flowable);
        this.f74778q0 = consumer;
        this.f74779r0 = consumer2;
        this.f74780s0 = action;
        this.f74781t0 = action2;
    }

    @Override // io.reactivex.rxjava3.core.Flowable
    public void subscribeActual(Subscriber<? super T> subscriber) {
        if (subscriber instanceof ConditionalSubscriber) {
            this.source.subscribe((FlowableSubscriber) new a((ConditionalSubscriber) subscriber, this.f74778q0, this.f74779r0, this.f74780s0, this.f74781t0));
        } else {
            this.source.subscribe((FlowableSubscriber) new b(subscriber, this.f74778q0, this.f74779r0, this.f74780s0, this.f74781t0));
        }
    }
}

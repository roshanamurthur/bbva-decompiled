package io.reactivex.rxkotlin;

import androidx.exifinterface.media.ExifInterface;
import io.reactivex.Completable;
import io.reactivex.Flowable;
import io.reactivex.Maybe;
import io.reactivex.Observable;
import io.reactivex.Single;
import io.reactivex.annotations.BackpressureKind;
import io.reactivex.annotations.BackpressureSupport;
import io.reactivex.annotations.CheckReturnValue;
import io.reactivex.annotations.SchedulerSupport;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Action;
import io.reactivex.functions.Consumer;
import io.reactivex.internal.functions.Functions;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import xj.d;
import xj.e;

/* JADX INFO: compiled from: subscribers.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001aX\u0010\u000b\u001a\u00020\n\"\b\b\u0000\u0010\u0001*\u00020\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0014\b\u0002\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00032\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00072\u0014\b\u0002\u0010\t\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00050\u0003H\u0007\u001aX\u0010\u000b\u001a\u00020\n\"\b\b\u0000\u0010\u0001*\u00020\u0000*\b\u0012\u0004\u0012\u00028\u00000\f2\u0014\b\u0002\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00032\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00072\u0014\b\u0002\u0010\t\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00050\u0003H\u0007\u001aH\u0010\u000b\u001a\u00020\n\"\b\b\u0000\u0010\u0001*\u00020\u0000*\b\u0012\u0004\u0012\u00028\u00000\r2\u0014\b\u0002\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00032\u0014\b\u0002\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00050\u0003H\u0007\u001aX\u0010\u000b\u001a\u00020\n\"\b\b\u0000\u0010\u0001*\u00020\u0000*\b\u0012\u0004\u0012\u00028\u00000\u000f2\u0014\b\u0002\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00032\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00072\u0014\b\u0002\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00050\u0003H\u0007\u001a2\u0010\u000b\u001a\u00020\n*\u00020\u00102\u0014\b\u0002\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00032\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0007H\u0007\u001aX\u0010\u0011\u001a\u00020\u0005\"\b\b\u0000\u0010\u0001*\u00020\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0014\b\u0002\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00032\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00072\u0014\b\u0002\u0010\t\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00050\u0003H\u0007\u001aX\u0010\u0011\u001a\u00020\u0005\"\b\b\u0000\u0010\u0001*\u00020\u0000*\b\u0012\u0004\u0012\u00028\u00000\f2\u0014\b\u0002\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00032\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00072\u0014\b\u0002\u0010\t\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00050\u0003H\u0007¨\u0006\u0012"}, d2 = {"", ExifInterface.GPS_DIRECTION_TRUE, "Lio/reactivex/Observable;", "Lkotlin/Function1;", "", "", "onError", "Lkotlin/Function0;", "onComplete", "onNext", "Lio/reactivex/disposables/Disposable;", "subscribeBy", "Lio/reactivex/Flowable;", "Lio/reactivex/Single;", "onSuccess", "Lio/reactivex/Maybe;", "Lio/reactivex/Completable;", "blockingSubscribeBy", "rxkotlin"}, k = 2, mv = {1, 4, 0})
public final class SubscribersKt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final c f78582a = c.f78587p0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final b f78583b = b.f78586p0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f78584c = a.f78585p0;

    /* JADX INFO: compiled from: subscribers.kt */
    public static final class a extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final a f78585p0 = new a(0);

        @Override // kotlin.jvm.functions.Function0
        public final /* bridge */ /* synthetic */ Unit invoke() {
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: subscribers.kt */
    public static final class b extends Lambda implements Function1<Throwable, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final b f78586p0 = new b(1);

        @Override // kotlin.jvm.functions.Function1
        public final /* bridge */ /* synthetic */ Unit invoke(Throwable th2) {
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: subscribers.kt */
    public static final class c extends Lambda implements Function1<Object, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final c f78587p0 = new c(1);

        @Override // kotlin.jvm.functions.Function1
        public final /* bridge */ /* synthetic */ Unit invoke(Object obj) {
            return Unit.INSTANCE;
        }
    }

    public static final <T> Consumer<T> a(@NotNull Function1<? super T, Unit> function1) {
        if (function1 == f78582a) {
            Consumer<T> consumerEmptyConsumer = Functions.emptyConsumer();
            Intrinsics.checkExpressionValueIsNotNull(consumerEmptyConsumer, "Functions.emptyConsumer()");
            return consumerEmptyConsumer;
        }
        if (function1 != null) {
            function1 = (Function1<? super T, Unit>) new e(function1);
        }
        return (Consumer) function1;
    }

    public static final Action b(@NotNull Function0<Unit> function0) {
        Object dVar = function0;
        if (function0 == f78584c) {
            Action action = Functions.EMPTY_ACTION;
            Intrinsics.checkExpressionValueIsNotNull(action, "Functions.EMPTY_ACTION");
            return action;
        }
        if (function0 != null) {
            dVar = new d(function0);
        }
        return (Action) dVar;
    }

    @SchedulerSupport("none")
    public static final <T> void blockingSubscribeBy(@NotNull Observable<T> observable, @NotNull Function1<? super Throwable, Unit> function1, @NotNull Function0<Unit> function0, @NotNull Function1<? super T, Unit> function2) {
        observable.blockingSubscribe(a(function2), c(function1), b(function0));
    }

    public static /* synthetic */ void blockingSubscribeBy$default(Observable observable, Function1 function1, Function0 function0, Function1 function2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            function1 = f78583b;
        }
        if ((i10 & 2) != 0) {
            function0 = f78584c;
        }
        if ((i10 & 4) != 0) {
            function2 = f78582a;
        }
        blockingSubscribeBy(observable, (Function1<? super Throwable, Unit>) function1, (Function0<Unit>) function0, function2);
    }

    public static final Consumer<Throwable> c(@NotNull Function1<? super Throwable, Unit> function1) {
        Object eVar = function1;
        if (function1 == f78583b) {
            Consumer<Throwable> consumer = Functions.ON_ERROR_MISSING;
            Intrinsics.checkExpressionValueIsNotNull(consumer, "Functions.ON_ERROR_MISSING");
            return consumer;
        }
        if (function1 != null) {
            eVar = new e(function1);
        }
        return (Consumer) eVar;
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    @NotNull
    public static final <T> Disposable subscribeBy(@NotNull Observable<T> observable, @NotNull Function1<? super Throwable, Unit> function1, @NotNull Function0<Unit> function0, @NotNull Function1<? super T, Unit> function2) {
        Disposable disposableSubscribe = observable.subscribe(a(function2), c(function1), b(function0));
        Intrinsics.checkExpressionValueIsNotNull(disposableSubscribe, "subscribe(onNext.asConsu…ete.asOnCompleteAction())");
        return disposableSubscribe;
    }

    public static /* synthetic */ Disposable subscribeBy$default(Observable observable, Function1 function1, Function0 function0, Function1 function2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            function1 = f78583b;
        }
        if ((i10 & 2) != 0) {
            function0 = f78584c;
        }
        if ((i10 & 4) != 0) {
            function2 = f78582a;
        }
        return subscribeBy(observable, (Function1<? super Throwable, Unit>) function1, (Function0<Unit>) function0, function2);
    }

    @SchedulerSupport("none")
    @BackpressureSupport(BackpressureKind.UNBOUNDED_IN)
    public static final <T> void blockingSubscribeBy(@NotNull Flowable<T> flowable, @NotNull Function1<? super Throwable, Unit> function1, @NotNull Function0<Unit> function0, @NotNull Function1<? super T, Unit> function2) {
        flowable.blockingSubscribe(a(function2), c(function1), b(function0));
    }

    @NotNull
    @SchedulerSupport("none")
    @BackpressureSupport(BackpressureKind.UNBOUNDED_IN)
    @CheckReturnValue
    public static final <T> Disposable subscribeBy(@NotNull Flowable<T> flowable, @NotNull Function1<? super Throwable, Unit> function1, @NotNull Function0<Unit> function0, @NotNull Function1<? super T, Unit> function2) {
        Disposable disposableSubscribe = flowable.subscribe(a(function2), c(function1), b(function0));
        Intrinsics.checkExpressionValueIsNotNull(disposableSubscribe, "subscribe(onNext.asConsu…ete.asOnCompleteAction())");
        return disposableSubscribe;
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    @NotNull
    public static final <T> Disposable subscribeBy(@NotNull Single<T> single, @NotNull Function1<? super Throwable, Unit> function1, @NotNull Function1<? super T, Unit> function2) {
        Disposable disposableSubscribe = single.subscribe(a(function2), c(function1));
        Intrinsics.checkExpressionValueIsNotNull(disposableSubscribe, "subscribe(onSuccess.asCo…rror.asOnErrorConsumer())");
        return disposableSubscribe;
    }

    public static /* synthetic */ void blockingSubscribeBy$default(Flowable flowable, Function1 function1, Function0 function0, Function1 function2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            function1 = f78583b;
        }
        if ((i10 & 2) != 0) {
            function0 = f78584c;
        }
        if ((i10 & 4) != 0) {
            function2 = f78582a;
        }
        blockingSubscribeBy(flowable, (Function1<? super Throwable, Unit>) function1, (Function0<Unit>) function0, function2);
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    @NotNull
    public static final <T> Disposable subscribeBy(@NotNull Maybe<T> maybe, @NotNull Function1<? super Throwable, Unit> function1, @NotNull Function0<Unit> function0, @NotNull Function1<? super T, Unit> function2) {
        Disposable disposableSubscribe = maybe.subscribe(a(function2), c(function1), b(function0));
        Intrinsics.checkExpressionValueIsNotNull(disposableSubscribe, "subscribe(onSuccess.asCo…ete.asOnCompleteAction())");
        return disposableSubscribe;
    }

    public static /* synthetic */ Disposable subscribeBy$default(Flowable flowable, Function1 function1, Function0 function0, Function1 function2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            function1 = f78583b;
        }
        if ((i10 & 2) != 0) {
            function0 = f78584c;
        }
        if ((i10 & 4) != 0) {
            function2 = f78582a;
        }
        return subscribeBy(flowable, (Function1<? super Throwable, Unit>) function1, (Function0<Unit>) function0, function2);
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    @NotNull
    public static final Disposable subscribeBy(@NotNull Completable completable, @NotNull Function1<? super Throwable, Unit> function1, @NotNull Function0<Unit> function0) {
        b bVar = f78583b;
        if (function1 == bVar && function0 == f78584c) {
            Disposable disposableSubscribe = completable.subscribe();
            Intrinsics.checkExpressionValueIsNotNull(disposableSubscribe, "subscribe()");
            return disposableSubscribe;
        }
        if (function1 == bVar) {
            Disposable disposableSubscribe2 = completable.subscribe(new d(function0));
            Intrinsics.checkExpressionValueIsNotNull(disposableSubscribe2, "subscribe(onComplete)");
            return disposableSubscribe2;
        }
        Disposable disposableSubscribe3 = completable.subscribe(b(function0), new e(function1));
        Intrinsics.checkExpressionValueIsNotNull(disposableSubscribe3, "subscribe(onComplete.asO…ion(), Consumer(onError))");
        return disposableSubscribe3;
    }

    public static /* synthetic */ Disposable subscribeBy$default(Single single, Function1 function1, Function1 function2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            function1 = f78583b;
        }
        if ((i10 & 2) != 0) {
            function2 = f78582a;
        }
        return subscribeBy(single, (Function1<? super Throwable, Unit>) function1, function2);
    }

    public static /* synthetic */ Disposable subscribeBy$default(Maybe maybe, Function1 function1, Function0 function0, Function1 function2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            function1 = f78583b;
        }
        if ((i10 & 2) != 0) {
            function0 = f78584c;
        }
        if ((i10 & 4) != 0) {
            function2 = f78582a;
        }
        return subscribeBy(maybe, (Function1<? super Throwable, Unit>) function1, (Function0<Unit>) function0, function2);
    }

    public static /* synthetic */ Disposable subscribeBy$default(Completable completable, Function1 function1, Function0 function0, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            function1 = f78583b;
        }
        if ((i10 & 2) != 0) {
            function0 = f78584c;
        }
        return subscribeBy(completable, (Function1<? super Throwable, Unit>) function1, (Function0<Unit>) function0);
    }
}

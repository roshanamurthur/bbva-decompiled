package io.reactivex.rxjava3.kotlin;

import androidx.exifinterface.media.ExifInterface;
import io.reactivex.rxjava3.annotations.BackpressureKind;
import io.reactivex.rxjava3.annotations.BackpressureSupport;
import io.reactivex.rxjava3.annotations.CheckReturnValue;
import io.reactivex.rxjava3.annotations.SchedulerSupport;
import io.reactivex.rxjava3.core.Completable;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.Maybe;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.functions.Action;
import io.reactivex.rxjava3.functions.Consumer;
import io.reactivex.rxjava3.internal.functions.Functions;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import uj.d;
import uj.e;

/* JADX INFO: compiled from: subscribers.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001aX\u0010\u000b\u001a\u00020\n\"\b\b\u0000\u0010\u0001*\u00020\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0014\b\u0002\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00032\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00072\u0014\b\u0002\u0010\t\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00050\u0003H\u0007\u001aX\u0010\u000b\u001a\u00020\n\"\b\b\u0000\u0010\u0001*\u00020\u0000*\b\u0012\u0004\u0012\u00028\u00000\f2\u0014\b\u0002\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00032\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00072\u0014\b\u0002\u0010\t\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00050\u0003H\u0007\u001aH\u0010\u000b\u001a\u00020\n\"\b\b\u0000\u0010\u0001*\u00020\u0000*\b\u0012\u0004\u0012\u00028\u00000\r2\u0014\b\u0002\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00032\u0014\b\u0002\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00050\u0003H\u0007\u001aX\u0010\u000b\u001a\u00020\n\"\b\b\u0000\u0010\u0001*\u00020\u0000*\b\u0012\u0004\u0012\u00028\u00000\u000f2\u0014\b\u0002\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00032\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00072\u0014\b\u0002\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00050\u0003H\u0007\u001a2\u0010\u000b\u001a\u00020\n*\u00020\u00102\u0014\b\u0002\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00032\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0007H\u0007\u001aX\u0010\u0011\u001a\u00020\u0005\"\b\b\u0000\u0010\u0001*\u00020\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0014\b\u0002\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00032\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00072\u0014\b\u0002\u0010\t\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00050\u0003H\u0007\u001aX\u0010\u0011\u001a\u00020\u0005\"\b\b\u0000\u0010\u0001*\u00020\u0000*\b\u0012\u0004\u0012\u00028\u00000\f2\u0014\b\u0002\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00032\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00072\u0014\b\u0002\u0010\t\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00050\u0003H\u0007\u001aX\u0010\u0011\u001a\u00020\u0005\"\b\b\u0000\u0010\u0001*\u00020\u0000*\b\u0012\u0004\u0012\u00028\u00000\u000f2\u0014\b\u0002\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00032\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00072\u0014\b\u0002\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00050\u0003H\u0007\u001aH\u0010\u0011\u001a\u00020\u0005\"\b\b\u0000\u0010\u0001*\u00020\u0000*\b\u0012\u0004\u0012\u00028\u00000\r2\u0014\b\u0002\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00032\u0014\b\u0002\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00050\u0003H\u0007\u001a2\u0010\u0011\u001a\u00020\u0005*\u00020\u00102\u0014\b\u0002\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00032\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0007H\u0007¨\u0006\u0012"}, d2 = {"", ExifInterface.GPS_DIRECTION_TRUE, "Lio/reactivex/rxjava3/core/Observable;", "Lkotlin/Function1;", "", "", "onError", "Lkotlin/Function0;", "onComplete", "onNext", "Lio/reactivex/rxjava3/disposables/Disposable;", "subscribeBy", "Lio/reactivex/rxjava3/core/Flowable;", "Lio/reactivex/rxjava3/core/Single;", "onSuccess", "Lio/reactivex/rxjava3/core/Maybe;", "Lio/reactivex/rxjava3/core/Completable;", "blockingSubscribeBy", "rxkotlin"}, k = 2, mv = {1, 4, 0})
public final class SubscribersKt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final c f78208a = c.f78213p0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final b f78209b = b.f78212p0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f78210c = a.f78211p0;

    /* JADX INFO: compiled from: subscribers.kt */
    public static final class a extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final a f78211p0 = new a(0);

        @Override // kotlin.jvm.functions.Function0
        public final /* bridge */ /* synthetic */ Unit invoke() {
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: subscribers.kt */
    public static final class b extends Lambda implements Function1<Throwable, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final b f78212p0 = new b(1);

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(Throwable th2) {
            Throwable it = th2;
            Intrinsics.checkNotNullParameter(it, "it");
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: subscribers.kt */
    public static final class c extends Lambda implements Function1<Object, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final c f78213p0 = new c(1);

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(Object it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return Unit.INSTANCE;
        }
    }

    public static final <T> Consumer<T> a(Function1<? super T, Unit> function1) {
        if (function1 == f78208a) {
            Consumer<T> consumerEmptyConsumer = Functions.emptyConsumer();
            Intrinsics.checkNotNullExpressionValue(consumerEmptyConsumer, "Functions.emptyConsumer()");
            return consumerEmptyConsumer;
        }
        if (function1 != null) {
            function1 = (Function1<? super T, Unit>) new e(function1);
        }
        return (Consumer) function1;
    }

    public static final Action b(Function0<Unit> function0) {
        Object dVar = function0;
        if (function0 == f78210c) {
            Action action = Functions.EMPTY_ACTION;
            Intrinsics.checkNotNullExpressionValue(action, "Functions.EMPTY_ACTION");
            return action;
        }
        if (function0 != null) {
            dVar = new d(function0);
        }
        return (Action) dVar;
    }

    @SchedulerSupport("none")
    public static final <T> void blockingSubscribeBy(@NotNull Observable<T> blockingSubscribeBy, @NotNull Function1<? super Throwable, Unit> onError, @NotNull Function0<Unit> onComplete, @NotNull Function1<? super T, Unit> onNext) {
        Intrinsics.checkNotNullParameter(blockingSubscribeBy, "$this$blockingSubscribeBy");
        Intrinsics.checkNotNullParameter(onError, "onError");
        Intrinsics.checkNotNullParameter(onComplete, "onComplete");
        Intrinsics.checkNotNullParameter(onNext, "onNext");
        blockingSubscribeBy.blockingSubscribe(a(onNext), c(onError), b(onComplete));
    }

    public static /* synthetic */ void blockingSubscribeBy$default(Observable observable, Function1 function1, Function0 function0, Function1 function2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            function1 = f78209b;
        }
        if ((i10 & 2) != 0) {
            function0 = f78210c;
        }
        if ((i10 & 4) != 0) {
            function2 = f78208a;
        }
        blockingSubscribeBy(observable, (Function1<? super Throwable, Unit>) function1, (Function0<Unit>) function0, function2);
    }

    public static final Consumer<Throwable> c(Function1<? super Throwable, Unit> function1) {
        Object eVar = function1;
        if (function1 == f78209b) {
            Consumer<Throwable> consumer = Functions.ON_ERROR_MISSING;
            Intrinsics.checkNotNullExpressionValue(consumer, "Functions.ON_ERROR_MISSING");
            return consumer;
        }
        if (function1 != null) {
            eVar = new e(function1);
        }
        return (Consumer) eVar;
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    @NotNull
    public static final <T> Disposable subscribeBy(@NotNull Observable<T> subscribeBy, @NotNull Function1<? super Throwable, Unit> onError, @NotNull Function0<Unit> onComplete, @NotNull Function1<? super T, Unit> onNext) {
        Intrinsics.checkNotNullParameter(subscribeBy, "$this$subscribeBy");
        Intrinsics.checkNotNullParameter(onError, "onError");
        Intrinsics.checkNotNullParameter(onComplete, "onComplete");
        Intrinsics.checkNotNullParameter(onNext, "onNext");
        Disposable disposableSubscribe = subscribeBy.subscribe(a(onNext), c(onError), b(onComplete));
        Intrinsics.checkNotNullExpressionValue(disposableSubscribe, "subscribe(onNext.asConsu…ete.asOnCompleteAction())");
        return disposableSubscribe;
    }

    public static /* synthetic */ Disposable subscribeBy$default(Observable observable, Function1 function1, Function0 function0, Function1 function2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            function1 = f78209b;
        }
        if ((i10 & 2) != 0) {
            function0 = f78210c;
        }
        if ((i10 & 4) != 0) {
            function2 = f78208a;
        }
        return subscribeBy(observable, (Function1<? super Throwable, Unit>) function1, (Function0<Unit>) function0, function2);
    }

    @BackpressureSupport(BackpressureKind.UNBOUNDED_IN)
    @SchedulerSupport("none")
    public static final <T> void blockingSubscribeBy(@NotNull Flowable<T> blockingSubscribeBy, @NotNull Function1<? super Throwable, Unit> onError, @NotNull Function0<Unit> onComplete, @NotNull Function1<? super T, Unit> onNext) {
        Intrinsics.checkNotNullParameter(blockingSubscribeBy, "$this$blockingSubscribeBy");
        Intrinsics.checkNotNullParameter(onError, "onError");
        Intrinsics.checkNotNullParameter(onComplete, "onComplete");
        Intrinsics.checkNotNullParameter(onNext, "onNext");
        blockingSubscribeBy.blockingSubscribe(a(onNext), c(onError), b(onComplete));
    }

    @CheckReturnValue
    @NotNull
    @BackpressureSupport(BackpressureKind.UNBOUNDED_IN)
    @SchedulerSupport("none")
    public static final <T> Disposable subscribeBy(@NotNull Flowable<T> subscribeBy, @NotNull Function1<? super Throwable, Unit> onError, @NotNull Function0<Unit> onComplete, @NotNull Function1<? super T, Unit> onNext) {
        Intrinsics.checkNotNullParameter(subscribeBy, "$this$subscribeBy");
        Intrinsics.checkNotNullParameter(onError, "onError");
        Intrinsics.checkNotNullParameter(onComplete, "onComplete");
        Intrinsics.checkNotNullParameter(onNext, "onNext");
        Disposable disposableSubscribe = subscribeBy.subscribe(a(onNext), c(onError), b(onComplete));
        Intrinsics.checkNotNullExpressionValue(disposableSubscribe, "subscribe(onNext.asConsu…ete.asOnCompleteAction())");
        return disposableSubscribe;
    }

    @SchedulerSupport("none")
    public static final <T> void blockingSubscribeBy(@NotNull Maybe<T> blockingSubscribeBy, @NotNull Function1<? super Throwable, Unit> onError, @NotNull Function0<Unit> onComplete, @NotNull Function1<? super T, Unit> onSuccess) {
        Intrinsics.checkNotNullParameter(blockingSubscribeBy, "$this$blockingSubscribeBy");
        Intrinsics.checkNotNullParameter(onError, "onError");
        Intrinsics.checkNotNullParameter(onComplete, "onComplete");
        Intrinsics.checkNotNullParameter(onSuccess, "onSuccess");
        blockingSubscribeBy.blockingSubscribe(a(onSuccess), c(onError), b(onComplete));
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    @NotNull
    public static final <T> Disposable subscribeBy(@NotNull Single<T> subscribeBy, @NotNull Function1<? super Throwable, Unit> onError, @NotNull Function1<? super T, Unit> onSuccess) {
        Intrinsics.checkNotNullParameter(subscribeBy, "$this$subscribeBy");
        Intrinsics.checkNotNullParameter(onError, "onError");
        Intrinsics.checkNotNullParameter(onSuccess, "onSuccess");
        Disposable disposableSubscribe = subscribeBy.subscribe(a(onSuccess), c(onError));
        Intrinsics.checkNotNullExpressionValue(disposableSubscribe, "subscribe(onSuccess.asCo…rror.asOnErrorConsumer())");
        return disposableSubscribe;
    }

    @SchedulerSupport("none")
    public static final <T> void blockingSubscribeBy(@NotNull Single<T> blockingSubscribeBy, @NotNull Function1<? super Throwable, Unit> onError, @NotNull Function1<? super T, Unit> onSuccess) {
        Intrinsics.checkNotNullParameter(blockingSubscribeBy, "$this$blockingSubscribeBy");
        Intrinsics.checkNotNullParameter(onError, "onError");
        Intrinsics.checkNotNullParameter(onSuccess, "onSuccess");
        blockingSubscribeBy.blockingSubscribe(a(onSuccess), c(onError));
    }

    public static /* synthetic */ void blockingSubscribeBy$default(Flowable flowable, Function1 function1, Function0 function0, Function1 function2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            function1 = f78209b;
        }
        if ((i10 & 2) != 0) {
            function0 = f78210c;
        }
        if ((i10 & 4) != 0) {
            function2 = f78208a;
        }
        blockingSubscribeBy(flowable, (Function1<? super Throwable, Unit>) function1, (Function0<Unit>) function0, function2);
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    @NotNull
    public static final <T> Disposable subscribeBy(@NotNull Maybe<T> subscribeBy, @NotNull Function1<? super Throwable, Unit> onError, @NotNull Function0<Unit> onComplete, @NotNull Function1<? super T, Unit> onSuccess) {
        Intrinsics.checkNotNullParameter(subscribeBy, "$this$subscribeBy");
        Intrinsics.checkNotNullParameter(onError, "onError");
        Intrinsics.checkNotNullParameter(onComplete, "onComplete");
        Intrinsics.checkNotNullParameter(onSuccess, "onSuccess");
        Disposable disposableSubscribe = subscribeBy.subscribe(a(onSuccess), c(onError), b(onComplete));
        Intrinsics.checkNotNullExpressionValue(disposableSubscribe, "subscribe(onSuccess.asCo…ete.asOnCompleteAction())");
        return disposableSubscribe;
    }

    public static /* synthetic */ Disposable subscribeBy$default(Flowable flowable, Function1 function1, Function0 function0, Function1 function2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            function1 = f78209b;
        }
        if ((i10 & 2) != 0) {
            function0 = f78210c;
        }
        if ((i10 & 4) != 0) {
            function2 = f78208a;
        }
        return subscribeBy(flowable, (Function1<? super Throwable, Unit>) function1, (Function0<Unit>) function0, function2);
    }

    @SchedulerSupport("none")
    public static final void blockingSubscribeBy(@NotNull Completable blockingSubscribeBy, @NotNull Function1<? super Throwable, Unit> onError, @NotNull Function0<Unit> onComplete) {
        Intrinsics.checkNotNullParameter(blockingSubscribeBy, "$this$blockingSubscribeBy");
        Intrinsics.checkNotNullParameter(onError, "onError");
        Intrinsics.checkNotNullParameter(onComplete, "onComplete");
        blockingSubscribeBy.blockingSubscribe(b(onComplete), c(onError));
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    @NotNull
    public static final Disposable subscribeBy(@NotNull Completable subscribeBy, @NotNull Function1<? super Throwable, Unit> onError, @NotNull Function0<Unit> onComplete) {
        Intrinsics.checkNotNullParameter(subscribeBy, "$this$subscribeBy");
        Intrinsics.checkNotNullParameter(onError, "onError");
        Intrinsics.checkNotNullParameter(onComplete, "onComplete");
        b bVar = f78209b;
        if (onError == bVar && onComplete == f78210c) {
            Disposable disposableSubscribe = subscribeBy.subscribe();
            Intrinsics.checkNotNullExpressionValue(disposableSubscribe, "subscribe()");
            return disposableSubscribe;
        }
        if (onError == bVar) {
            Disposable disposableSubscribe2 = subscribeBy.subscribe(new d(onComplete));
            Intrinsics.checkNotNullExpressionValue(disposableSubscribe2, "subscribe(onComplete)");
            return disposableSubscribe2;
        }
        Disposable disposableSubscribe3 = subscribeBy.subscribe(b(onComplete), new e(onError));
        Intrinsics.checkNotNullExpressionValue(disposableSubscribe3, "subscribe(onComplete.asO…ion(), Consumer(onError))");
        return disposableSubscribe3;
    }

    public static /* synthetic */ void blockingSubscribeBy$default(Maybe maybe, Function1 function1, Function0 function0, Function1 function2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            function1 = f78209b;
        }
        if ((i10 & 2) != 0) {
            function0 = f78210c;
        }
        if ((i10 & 4) != 0) {
            function2 = f78208a;
        }
        blockingSubscribeBy(maybe, (Function1<? super Throwable, Unit>) function1, (Function0<Unit>) function0, function2);
    }

    public static /* synthetic */ Disposable subscribeBy$default(Single single, Function1 function1, Function1 function2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            function1 = f78209b;
        }
        if ((i10 & 2) != 0) {
            function2 = f78208a;
        }
        return subscribeBy(single, (Function1<? super Throwable, Unit>) function1, function2);
    }

    public static /* synthetic */ Disposable subscribeBy$default(Maybe maybe, Function1 function1, Function0 function0, Function1 function2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            function1 = f78209b;
        }
        if ((i10 & 2) != 0) {
            function0 = f78210c;
        }
        if ((i10 & 4) != 0) {
            function2 = f78208a;
        }
        return subscribeBy(maybe, (Function1<? super Throwable, Unit>) function1, (Function0<Unit>) function0, function2);
    }

    public static /* synthetic */ void blockingSubscribeBy$default(Single single, Function1 function1, Function1 function2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            function1 = f78209b;
        }
        if ((i10 & 2) != 0) {
            function2 = f78208a;
        }
        blockingSubscribeBy(single, (Function1<? super Throwable, Unit>) function1, function2);
    }

    public static /* synthetic */ void blockingSubscribeBy$default(Completable completable, Function1 function1, Function0 function0, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            function1 = f78209b;
        }
        if ((i10 & 2) != 0) {
            function0 = f78210c;
        }
        blockingSubscribeBy(completable, (Function1<? super Throwable, Unit>) function1, (Function0<Unit>) function0);
    }

    public static /* synthetic */ Disposable subscribeBy$default(Completable completable, Function1 function1, Function0 function0, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            function1 = f78209b;
        }
        if ((i10 & 2) != 0) {
            function0 = f78210c;
        }
        return subscribeBy(completable, (Function1<? super Throwable, Unit>) function1, (Function0<Unit>) function0);
    }
}

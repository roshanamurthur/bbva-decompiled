package io.reactivex.rxjava3.kotlin;

import io.reactivex.rxjava3.annotations.BackpressureKind;
import io.reactivex.rxjava3.annotations.BackpressureSupport;
import io.reactivex.rxjava3.annotations.CheckReturnValue;
import io.reactivex.rxjava3.annotations.SchedulerSupport;
import io.reactivex.rxjava3.core.Completable;
import io.reactivex.rxjava3.core.CompletableSource;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.functions.Action;
import io.reactivex.rxjava3.functions.Function;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: completable.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\u0012\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0007\u001a\u0012\u0010\u0004\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00010\u0005H\u0007\u001a\u0012\u0010\u0004\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00010\u0006H\u0007\u001a\u0010\u0010\u0007\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\t0\b\u001a\n\u0010\u0007\u001a\u00020\u0001*\u00020\n\u001a\u0012\u0010\u0007\u001a\u00020\u0001*\n\u0012\u0006\b\u0001\u0012\u00020\t0\u000b\u001a\u0012\u0010\u0007\u001a\u00020\u0001*\n\u0012\u0006\b\u0001\u0012\u00020\t0\f¨\u0006\r"}, d2 = {"concatAll", "Lio/reactivex/rxjava3/core/Completable;", "", "Lio/reactivex/rxjava3/core/CompletableSource;", "mergeAllCompletables", "Lio/reactivex/rxjava3/core/Flowable;", "Lio/reactivex/rxjava3/core/Observable;", "toCompletable", "Lkotlin/Function0;", "", "Lio/reactivex/rxjava3/functions/Action;", "Ljava/util/concurrent/Callable;", "Ljava/util/concurrent/Future;", "rxkotlin"}, k = 2, mv = {1, 4, 0})
public final class CompletableKt {

    /* JADX INFO: compiled from: completable.kt */
    public static final class a<T, R> implements Function<Completable, CompletableSource> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final a f78095p0 = new a();

        @Override // io.reactivex.rxjava3.functions.Function
        public final CompletableSource apply(Completable completable) {
            return completable;
        }
    }

    /* JADX INFO: compiled from: completable.kt */
    public static final class b<T, R> implements Function<Completable, CompletableSource> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final b f78096p0 = new b();

        @Override // io.reactivex.rxjava3.functions.Function
        public final CompletableSource apply(Completable completable) {
            return completable;
        }
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    @NotNull
    public static final Completable concatAll(@NotNull Iterable<? extends CompletableSource> concatAll) {
        Intrinsics.checkNotNullParameter(concatAll, "$this$concatAll");
        Completable completableConcat = Completable.concat(concatAll);
        Intrinsics.checkNotNullExpressionValue(completableConcat, "Completable.concat(this)");
        return completableConcat;
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    @NotNull
    public static final Completable mergeAllCompletables(@NotNull Observable<Completable> mergeAllCompletables) {
        Intrinsics.checkNotNullParameter(mergeAllCompletables, "$this$mergeAllCompletables");
        Completable completableFlatMapCompletable = mergeAllCompletables.flatMapCompletable(a.f78095p0);
        Intrinsics.checkNotNullExpressionValue(completableFlatMapCompletable, "flatMapCompletable { it }");
        return completableFlatMapCompletable;
    }

    @NotNull
    public static final Completable toCompletable(@NotNull Action toCompletable) {
        Intrinsics.checkNotNullParameter(toCompletable, "$this$toCompletable");
        Completable completableFromAction = Completable.fromAction(toCompletable);
        Intrinsics.checkNotNullExpressionValue(completableFromAction, "Completable.fromAction(this)");
        return completableFromAction;
    }

    @CheckReturnValue
    @NotNull
    @BackpressureSupport(BackpressureKind.UNBOUNDED_IN)
    @SchedulerSupport("none")
    public static final Completable mergeAllCompletables(@NotNull Flowable<Completable> mergeAllCompletables) {
        Intrinsics.checkNotNullParameter(mergeAllCompletables, "$this$mergeAllCompletables");
        Completable completableFlatMapCompletable = mergeAllCompletables.flatMapCompletable(b.f78096p0);
        Intrinsics.checkNotNullExpressionValue(completableFlatMapCompletable, "flatMapCompletable { it }");
        return completableFlatMapCompletable;
    }

    @NotNull
    public static final Completable toCompletable(@NotNull Callable<? extends Object> toCompletable) {
        Intrinsics.checkNotNullParameter(toCompletable, "$this$toCompletable");
        Completable completableFromCallable = Completable.fromCallable(toCompletable);
        Intrinsics.checkNotNullExpressionValue(completableFromCallable, "Completable.fromCallable(this)");
        return completableFromCallable;
    }

    @NotNull
    public static final Completable toCompletable(@NotNull Future<? extends Object> toCompletable) {
        Intrinsics.checkNotNullParameter(toCompletable, "$this$toCompletable");
        Completable completableFromFuture = Completable.fromFuture(toCompletable);
        Intrinsics.checkNotNullExpressionValue(completableFromFuture, "Completable.fromFuture(this)");
        return completableFromFuture;
    }

    @NotNull
    public static final Completable toCompletable(@NotNull Function0<? extends Object> toCompletable) {
        Intrinsics.checkNotNullParameter(toCompletable, "$this$toCompletable");
        Completable completableFromCallable = Completable.fromCallable(new uj.a(toCompletable));
        Intrinsics.checkNotNullExpressionValue(completableFromCallable, "Completable.fromCallable(this)");
        return completableFromCallable;
    }
}

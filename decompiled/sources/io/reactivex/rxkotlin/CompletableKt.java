package io.reactivex.rxkotlin;

import io.reactivex.Completable;
import io.reactivex.CompletableSource;
import io.reactivex.Flowable;
import io.reactivex.Observable;
import io.reactivex.annotations.BackpressureKind;
import io.reactivex.annotations.BackpressureSupport;
import io.reactivex.annotations.CheckReturnValue;
import io.reactivex.annotations.SchedulerSupport;
import io.reactivex.functions.Action;
import io.reactivex.functions.Function;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: completable.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\u0012\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0007\u001a\u0012\u0010\u0004\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00010\u0005H\u0007\u001a\u0012\u0010\u0004\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00010\u0006H\u0007\u001a\u0010\u0010\u0007\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\t0\b\u001a\n\u0010\u0007\u001a\u00020\u0001*\u00020\n\u001a\u0012\u0010\u0007\u001a\u00020\u0001*\n\u0012\u0006\b\u0001\u0012\u00020\t0\u000b\u001a\u0012\u0010\u0007\u001a\u00020\u0001*\n\u0012\u0006\b\u0001\u0012\u00020\t0\f¨\u0006\r"}, d2 = {"concatAll", "Lio/reactivex/Completable;", "", "Lio/reactivex/CompletableSource;", "mergeAllCompletables", "Lio/reactivex/Flowable;", "Lio/reactivex/Observable;", "toCompletable", "Lkotlin/Function0;", "", "Lio/reactivex/functions/Action;", "Ljava/util/concurrent/Callable;", "Ljava/util/concurrent/Future;", "rxkotlin"}, k = 2, mv = {1, 1, 15})
public final class CompletableKt {

    /* JADX INFO: compiled from: completable.kt */
    public static final class a<T, R> implements Function<Completable, CompletableSource> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final a f78469p0 = new a();

        @Override // io.reactivex.functions.Function
        public final CompletableSource apply(Completable completable) {
            return completable;
        }
    }

    /* JADX INFO: compiled from: completable.kt */
    public static final class b<T, R> implements Function<Completable, CompletableSource> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final b f78470p0 = new b();

        @Override // io.reactivex.functions.Function
        public final CompletableSource apply(Completable completable) {
            return completable;
        }
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    @NotNull
    public static final Completable concatAll(@NotNull Iterable<? extends CompletableSource> iterable) {
        Completable completableConcat = Completable.concat(iterable);
        Intrinsics.checkExpressionValueIsNotNull(completableConcat, "Completable.concat(this)");
        return completableConcat;
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    @NotNull
    public static final Completable mergeAllCompletables(@NotNull Observable<Completable> observable) {
        Completable completableFlatMapCompletable = observable.flatMapCompletable(a.f78469p0);
        Intrinsics.checkExpressionValueIsNotNull(completableFlatMapCompletable, "flatMapCompletable { it }");
        return completableFlatMapCompletable;
    }

    @NotNull
    public static final Completable toCompletable(@NotNull Action action) {
        Completable completableFromAction = Completable.fromAction(action);
        Intrinsics.checkExpressionValueIsNotNull(completableFromAction, "Completable.fromAction(this)");
        return completableFromAction;
    }

    @NotNull
    @SchedulerSupport("none")
    @BackpressureSupport(BackpressureKind.UNBOUNDED_IN)
    @CheckReturnValue
    public static final Completable mergeAllCompletables(@NotNull Flowable<Completable> flowable) {
        Completable completableFlatMapCompletable = flowable.flatMapCompletable(b.f78470p0);
        Intrinsics.checkExpressionValueIsNotNull(completableFlatMapCompletable, "flatMapCompletable { it }");
        return completableFlatMapCompletable;
    }

    @NotNull
    public static final Completable toCompletable(@NotNull Callable<? extends Object> callable) {
        Completable completableFromCallable = Completable.fromCallable(callable);
        Intrinsics.checkExpressionValueIsNotNull(completableFromCallable, "Completable.fromCallable(this)");
        return completableFromCallable;
    }

    @NotNull
    public static final Completable toCompletable(@NotNull Future<? extends Object> future) {
        Completable completableFromFuture = Completable.fromFuture(future);
        Intrinsics.checkExpressionValueIsNotNull(completableFromFuture, "Completable.fromFuture(this)");
        return completableFromFuture;
    }

    @NotNull
    public static final Completable toCompletable(@NotNull Function0<? extends Object> function0) {
        Completable completableFromCallable = Completable.fromCallable(new xj.a(function0));
        Intrinsics.checkExpressionValueIsNotNull(completableFromCallable, "Completable.fromCallable(this)");
        return completableFromCallable;
    }
}

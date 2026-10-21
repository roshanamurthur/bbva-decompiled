package io.reactivex.rxjava3.kotlin;

import androidx.exifinterface.media.ExifInterface;
import io.reactivex.rxjava3.annotations.CheckReturnValue;
import io.reactivex.rxjava3.annotations.SchedulerSupport;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.ObservableSource;
import io.reactivex.rxjava3.functions.BiFunction;
import io.reactivex.rxjava3.functions.Function3;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.ReplaceWith;
import kotlin.Triple;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.functions.Function5;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: Observables.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000@\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001ad\u0010\u0000\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u0002H\u0003\u0012\u0004\u0012\u0002H\u0004\u0012\u0004\u0012\u0002H\u00050\u00020\u0001\"\b\b\u0000\u0010\u0003*\u00020\u0006\"\b\b\u0001\u0010\u0004*\u00020\u0006\"\b\b\u0002\u0010\u0005*\u00020\u0006*\b\u0012\u0004\u0012\u0002H\u00030\u00012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u0002H\u00040\b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u0002H\u00050\bH\u0007\u001a\u0082\u0001\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\n0\u0001\"\b\b\u0000\u0010\u0003*\u00020\u0006\"\b\b\u0001\u0010\u0004*\u00020\u0006\"\b\b\u0002\u0010\u0005*\u00020\u0006\"\b\b\u0003\u0010\n*\u00020\u0006*\b\u0012\u0004\u0012\u0002H\u00030\u00012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u0002H\u00040\b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u0002H\u00050\b2 \b\u0004\u0010\u000b\u001a\u001a\u0012\u0004\u0012\u0002H\u0003\u0012\u0004\u0012\u0002H\u0004\u0012\u0004\u0012\u0002H\u0005\u0012\u0004\u0012\u0002H\n0\fH\u0087\bø\u0001\u0000\u001a \u0001\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\n0\u0001\"\b\b\u0000\u0010\u0003*\u00020\u0006\"\b\b\u0001\u0010\u0004*\u00020\u0006\"\b\b\u0002\u0010\u0005*\u00020\u0006\"\b\b\u0003\u0010\r*\u00020\u0006\"\b\b\u0004\u0010\n*\u00020\u0006*\b\u0012\u0004\u0012\u0002H\u00030\u00012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u0002H\u00040\b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u0002H\u00050\b2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u0002H\r0\b2&\b\u0004\u0010\u000b\u001a \u0012\u0004\u0012\u0002H\u0003\u0012\u0004\u0012\u0002H\u0004\u0012\u0004\u0012\u0002H\u0005\u0012\u0004\u0012\u0002H\r\u0012\u0004\u0012\u0002H\n0\u000fH\u0087\bø\u0001\u0000\u001a¾\u0001\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\n0\u0001\"\b\b\u0000\u0010\u0003*\u00020\u0006\"\b\b\u0001\u0010\u0004*\u00020\u0006\"\b\b\u0002\u0010\u0005*\u00020\u0006\"\b\b\u0003\u0010\r*\u00020\u0006\"\b\b\u0004\u0010\u0010*\u00020\u0006\"\b\b\u0005\u0010\n*\u00020\u0006*\b\u0012\u0004\u0012\u0002H\u00030\u00012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u0002H\u00040\b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u0002H\u00050\b2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u0002H\r0\b2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u0002H\u00100\b2,\b\u0004\u0010\u000b\u001a&\u0012\u0004\u0012\u0002H\u0003\u0012\u0004\u0012\u0002H\u0004\u0012\u0004\u0012\u0002H\u0005\u0012\u0004\u0012\u0002H\r\u0012\u0004\u0012\u0002H\u0010\u0012\u0004\u0012\u0002H\n0\u0012H\u0087\bø\u0001\u0000\u001aF\u0010\u0000\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u0002H\u0003\u0012\u0004\u0012\u0002H\u00140\u00130\u0001\"\b\b\u0000\u0010\u0003*\u00020\u0006\"\b\b\u0001\u0010\u0014*\u00020\u0006*\b\u0012\u0004\u0012\u0002H\u00030\u00012\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u0002H\u00140\bH\u0007\u001ad\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\n0\u0001\"\b\b\u0000\u0010\u0003*\u00020\u0006\"\b\b\u0001\u0010\u0014*\u00020\u0006\"\b\b\u0002\u0010\n*\u00020\u0006*\b\u0012\u0004\u0012\u0002H\u00030\u00012\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u0002H\u00140\b2\u001a\b\u0004\u0010\u000b\u001a\u0014\u0012\u0004\u0012\u0002H\u0003\u0012\u0004\u0012\u0002H\u0014\u0012\u0004\u0012\u0002H\n0\u0016H\u0087\bø\u0001\u0000\u001aF\u0010\u0017\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u0002H\u0003\u0012\u0004\u0012\u0002H\u00140\u00130\u0001\"\b\b\u0000\u0010\u0003*\u00020\u0006\"\b\b\u0001\u0010\u0014*\u00020\u0006*\b\u0012\u0004\u0012\u0002H\u00030\u00012\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u0002H\u00140\bH\u0007\u001ad\u0010\u0017\u001a\b\u0012\u0004\u0012\u0002H\n0\u0001\"\b\b\u0000\u0010\u0003*\u00020\u0006\"\b\b\u0001\u0010\u0014*\u00020\u0006\"\b\b\u0002\u0010\n*\u00020\u0006*\b\u0012\u0004\u0012\u0002H\u00030\u00012\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u0002H\u00140\b2\u001a\b\u0004\u0010\u0018\u001a\u0014\u0012\u0004\u0012\u0002H\u0003\u0012\u0004\u0012\u0002H\u0014\u0012\u0004\u0012\u0002H\n0\u0016H\u0087\bø\u0001\u0000\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0019"}, d2 = {"withLatestFrom", "Lio/reactivex/rxjava3/core/Observable;", "Lkotlin/Triple;", ExifInterface.GPS_DIRECTION_TRUE, "T1", "T2", "", "o1", "Lio/reactivex/rxjava3/core/ObservableSource;", "o2", "R", "combiner", "Lkotlin/Function3;", "T3", "o3", "Lkotlin/Function4;", "T4", "o4", "Lkotlin/Function5;", "Lkotlin/Pair;", "U", "other", "Lkotlin/Function2;", "zipWith", "zipper", "rxkotlin"}, k = 2, mv = {1, 4, 0})
public final class ObservablesKt {

    /* JADX INFO: Add missing generic type declarations: [T, U] */
    /* JADX INFO: compiled from: Observables.kt */
    public static final class a<T1, T2, R, T, U> implements BiFunction<T, U, Pair<? extends T, ? extends U>> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final a f78186p0 = new a();

        @Override // io.reactivex.rxjava3.functions.BiFunction
        public final Object apply(Object obj, Object obj2) {
            return new Pair(obj, obj2);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: compiled from: Observables.kt */
    public static final class b<T1, T2, T3, R, T> implements Function3<T, T1, T2, Triple<? extends T, ? extends T1, ? extends T2>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f78187a = new b();

        @Override // io.reactivex.rxjava3.functions.Function3
        public final Object apply(Object obj, Object obj2, Object obj3) {
            return new Triple(obj, obj2, obj3);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T, U] */
    /* JADX INFO: compiled from: Observables.kt */
    public static final class c<T1, T2, R, T, U> implements BiFunction<T, U, Pair<? extends T, ? extends U>> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final c f78188p0 = new c();

        @Override // io.reactivex.rxjava3.functions.BiFunction
        public final Object apply(Object obj, Object obj2) {
            return new Pair(obj, obj2);
        }
    }

    @CheckReturnValue
    @NotNull
    @Deprecated(level = DeprecationLevel.WARNING, message = "New type inference algorithm in Kotlin 1.4 makes this method obsolete. Method will be removed in future RxKotlin release.", replaceWith = @ReplaceWith(expression = "withLatestFrom(other, combiner)", imports = {}))
    @SchedulerSupport("none")
    public static final <T, U, R> Observable<R> withLatestFrom(@NotNull Observable<T> withLatestFrom, @NotNull ObservableSource<U> other, @NotNull final Function2<? super T, ? super U, ? extends R> combiner) {
        Intrinsics.checkNotNullParameter(withLatestFrom, "$this$withLatestFrom");
        Intrinsics.checkNotNullParameter(other, "other");
        Intrinsics.checkNotNullParameter(combiner, "combiner");
        Observable<R> observableWithLatestFrom = withLatestFrom.withLatestFrom(other, new BiFunction<T, U, R>() { // from class: io.reactivex.rxjava3.kotlin.ObservablesKt.withLatestFrom.1
            @Override // io.reactivex.rxjava3.functions.BiFunction
            public final R apply(T t10, U u2) {
                Intrinsics.checkNotNullExpressionValue(t10, "t");
                Intrinsics.checkNotNullExpressionValue(u2, "u");
                return (R) combiner.invoke(t10, u2);
            }
        });
        Intrinsics.checkNotNullExpressionValue(observableWithLatestFrom, "withLatestFrom(other, Bi… combiner.invoke(t, u) })");
        return observableWithLatestFrom;
    }

    @CheckReturnValue
    @NotNull
    @Deprecated(level = DeprecationLevel.WARNING, message = "New type inference algorithm in Kotlin 1.4 makes this method obsolete. Method will be removed in future RxKotlin release.", replaceWith = @ReplaceWith(expression = "zipWith(other, zipper)", imports = {}))
    @SchedulerSupport("none")
    public static final <T, U, R> Observable<R> zipWith(@NotNull Observable<T> zipWith, @NotNull ObservableSource<U> other, @NotNull final Function2<? super T, ? super U, ? extends R> zipper) {
        Intrinsics.checkNotNullParameter(zipWith, "$this$zipWith");
        Intrinsics.checkNotNullParameter(other, "other");
        Intrinsics.checkNotNullParameter(zipper, "zipper");
        Observable<R> observableZipWith = zipWith.zipWith(other, new BiFunction<T, U, R>() { // from class: io.reactivex.rxjava3.kotlin.ObservablesKt.zipWith.1
            @Override // io.reactivex.rxjava3.functions.BiFunction
            public final R apply(T t10, U u2) {
                Intrinsics.checkNotNullExpressionValue(t10, "t");
                Intrinsics.checkNotNullExpressionValue(u2, "u");
                return (R) zipper.invoke(t10, u2);
            }
        });
        Intrinsics.checkNotNullExpressionValue(observableZipWith, "zipWith(other, BiFunctio…-> zipper.invoke(t, u) })");
        return observableZipWith;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @CheckReturnValue
    @SchedulerSupport("none")
    @NotNull
    public static final <T, U> Observable<Pair<T, U>> withLatestFrom(@NotNull Observable<T> withLatestFrom, @NotNull ObservableSource<U> other) {
        Intrinsics.checkNotNullParameter(withLatestFrom, "$this$withLatestFrom");
        Intrinsics.checkNotNullParameter(other, "other");
        Observable<Pair<T, U>> observable = (Observable<Pair<T, U>>) withLatestFrom.withLatestFrom(other, a.f78186p0);
        Intrinsics.checkNotNullExpressionValue(observable, "withLatestFrom(other, Bi…n { t, u -> Pair(t, u) })");
        return observable;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @CheckReturnValue
    @SchedulerSupport("none")
    @NotNull
    public static final <T, U> Observable<Pair<T, U>> zipWith(@NotNull Observable<T> zipWith, @NotNull ObservableSource<U> other) {
        Intrinsics.checkNotNullParameter(zipWith, "$this$zipWith");
        Intrinsics.checkNotNullParameter(other, "other");
        Observable<Pair<T, U>> observable = (Observable<Pair<T, U>>) zipWith.zipWith(other, c.f78188p0);
        Intrinsics.checkNotNullExpressionValue(observable, "zipWith(other, BiFunction { t, u -> Pair(t, u) })");
        return observable;
    }

    @CheckReturnValue
    @NotNull
    @Deprecated(level = DeprecationLevel.WARNING, message = "New type inference algorithm in Kotlin 1.4 makes this method obsolete. Method will be removed in future RxKotlin release.", replaceWith = @ReplaceWith(expression = "withLatestFrom(o1, o2, combiner)", imports = {}))
    @SchedulerSupport("none")
    public static final <T, T1, T2, R> Observable<R> withLatestFrom(@NotNull Observable<T> withLatestFrom, @NotNull ObservableSource<T1> o2, @NotNull ObservableSource<T2> o10, @NotNull final kotlin.jvm.functions.Function3<? super T, ? super T1, ? super T2, ? extends R> combiner) {
        Intrinsics.checkNotNullParameter(withLatestFrom, "$this$withLatestFrom");
        Intrinsics.checkNotNullParameter(o2, "o1");
        Intrinsics.checkNotNullParameter(o10, "o2");
        Intrinsics.checkNotNullParameter(combiner, "combiner");
        Observable<R> observableWithLatestFrom = withLatestFrom.withLatestFrom(o2, o10, new Function3<T, T1, T2, R>() { // from class: io.reactivex.rxjava3.kotlin.ObservablesKt.withLatestFrom.3
            @Override // io.reactivex.rxjava3.functions.Function3
            public final R apply(T t10, T1 t11, T2 t12) {
                Intrinsics.checkNotNullExpressionValue(t10, "t");
                Intrinsics.checkNotNullExpressionValue(t11, "t1");
                Intrinsics.checkNotNullExpressionValue(t12, "t2");
                return (R) combiner.invoke(t10, t11, t12);
            }
        });
        Intrinsics.checkNotNullExpressionValue(observableWithLatestFrom, "withLatestFrom(o1, o2, F…iner.invoke(t, t1, t2) })");
        return observableWithLatestFrom;
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    @NotNull
    public static final <T, T1, T2> Observable<Triple<T, T1, T2>> withLatestFrom(@NotNull Observable<T> withLatestFrom, @NotNull ObservableSource<T1> o2, @NotNull ObservableSource<T2> o10) {
        Intrinsics.checkNotNullParameter(withLatestFrom, "$this$withLatestFrom");
        Intrinsics.checkNotNullParameter(o2, "o1");
        Intrinsics.checkNotNullParameter(o10, "o2");
        Observable<Triple<T, T1, T2>> observable = (Observable<Triple<T, T1, T2>>) withLatestFrom.withLatestFrom(o2, o10, b.f78187a);
        Intrinsics.checkNotNullExpressionValue(observable, "withLatestFrom(o1, o2, F…2 -> Triple(t, t1, t2) })");
        return observable;
    }

    @CheckReturnValue
    @NotNull
    @Deprecated(level = DeprecationLevel.WARNING, message = "New type inference algorithm in Kotlin 1.4 makes this method obsolete. Method will be removed in future RxKotlin release.", replaceWith = @ReplaceWith(expression = "withLatestFrom(o1, o2, o3, combiner)", imports = {}))
    @SchedulerSupport("none")
    public static final <T, T1, T2, T3, R> Observable<R> withLatestFrom(@NotNull Observable<T> withLatestFrom, @NotNull ObservableSource<T1> o2, @NotNull ObservableSource<T2> o10, @NotNull ObservableSource<T3> o11, @NotNull final Function4<? super T, ? super T1, ? super T2, ? super T3, ? extends R> combiner) {
        Intrinsics.checkNotNullParameter(withLatestFrom, "$this$withLatestFrom");
        Intrinsics.checkNotNullParameter(o2, "o1");
        Intrinsics.checkNotNullParameter(o10, "o2");
        Intrinsics.checkNotNullParameter(o11, "o3");
        Intrinsics.checkNotNullParameter(combiner, "combiner");
        Observable<R> observableWithLatestFrom = withLatestFrom.withLatestFrom(o2, o10, o11, new io.reactivex.rxjava3.functions.Function4<T, T1, T2, T3, R>() { // from class: io.reactivex.rxjava3.kotlin.ObservablesKt.withLatestFrom.5
            @Override // io.reactivex.rxjava3.functions.Function4
            public final R apply(T t10, T1 t11, T2 t12, T3 t13) {
                Intrinsics.checkNotNullExpressionValue(t10, "t");
                Intrinsics.checkNotNullExpressionValue(t11, "t1");
                Intrinsics.checkNotNullExpressionValue(t12, "t2");
                Intrinsics.checkNotNullExpressionValue(t13, "t3");
                return (R) combiner.invoke(t10, t11, t12, t13);
            }
        });
        Intrinsics.checkNotNullExpressionValue(observableWithLatestFrom, "withLatestFrom(o1, o2, o….invoke(t, t1, t2, t3) })");
        return observableWithLatestFrom;
    }

    @CheckReturnValue
    @NotNull
    @Deprecated(level = DeprecationLevel.WARNING, message = "New type inference algorithm in Kotlin 1.4 makes this method obsolete. Method will be removed in future RxKotlin release.", replaceWith = @ReplaceWith(expression = "withLatestFrom(o1, o2, o3, o4, combiner)", imports = {}))
    @SchedulerSupport("none")
    public static final <T, T1, T2, T3, T4, R> Observable<R> withLatestFrom(@NotNull Observable<T> withLatestFrom, @NotNull ObservableSource<T1> o2, @NotNull ObservableSource<T2> o10, @NotNull ObservableSource<T3> o11, @NotNull ObservableSource<T4> o12, @NotNull final Function5<? super T, ? super T1, ? super T2, ? super T3, ? super T4, ? extends R> combiner) {
        Intrinsics.checkNotNullParameter(withLatestFrom, "$this$withLatestFrom");
        Intrinsics.checkNotNullParameter(o2, "o1");
        Intrinsics.checkNotNullParameter(o10, "o2");
        Intrinsics.checkNotNullParameter(o11, "o3");
        Intrinsics.checkNotNullParameter(o12, "o4");
        Intrinsics.checkNotNullParameter(combiner, "combiner");
        Observable<R> observableWithLatestFrom = withLatestFrom.withLatestFrom(o2, o10, o11, o12, new io.reactivex.rxjava3.functions.Function5<T, T1, T2, T3, T4, R>() { // from class: io.reactivex.rxjava3.kotlin.ObservablesKt.withLatestFrom.6
            @Override // io.reactivex.rxjava3.functions.Function5
            public final R apply(T t10, T1 t11, T2 t12, T3 t13, T4 t14) {
                Function5 function5 = combiner;
                Intrinsics.checkNotNullExpressionValue(t10, "t");
                Intrinsics.checkNotNullExpressionValue(t11, "t1");
                Intrinsics.checkNotNullExpressionValue(t12, "t2");
                Intrinsics.checkNotNullExpressionValue(t13, "t3");
                Intrinsics.checkNotNullExpressionValue(t14, "t4");
                return (R) function5.invoke(t10, t11, t12, t13, t14);
            }
        });
        Intrinsics.checkNotNullExpressionValue(observableWithLatestFrom, "withLatestFrom(o1, o2, o…oke(t, t1, t2, t3, t4) })");
        return observableWithLatestFrom;
    }
}

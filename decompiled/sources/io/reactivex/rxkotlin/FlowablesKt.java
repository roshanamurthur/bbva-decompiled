package io.reactivex.rxkotlin;

import androidx.exifinterface.media.ExifInterface;
import io.reactivex.Flowable;
import io.reactivex.annotations.BackpressureKind;
import io.reactivex.annotations.BackpressureSupport;
import io.reactivex.annotations.CheckReturnValue;
import io.reactivex.annotations.SchedulerSupport;
import io.reactivex.functions.BiFunction;
import io.reactivex.functions.Function3;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Triple;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.functions.Function5;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.reactivestreams.Publisher;

/* JADX INFO: compiled from: Flowables.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000@\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001ad\u0010\u0000\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u0002H\u0003\u0012\u0004\u0012\u0002H\u0004\u0012\u0004\u0012\u0002H\u00050\u00020\u0001\"\b\b\u0000\u0010\u0003*\u00020\u0006\"\b\b\u0001\u0010\u0004*\u00020\u0006\"\b\b\u0002\u0010\u0005*\u00020\u0006*\b\u0012\u0004\u0012\u0002H\u00030\u00012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u0002H\u00040\b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u0002H\u00050\bH\u0007\u001a\u007f\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\n0\u0001\"\b\b\u0000\u0010\u0003*\u00020\u0006\"\b\b\u0001\u0010\u0004*\u00020\u0006\"\b\b\u0002\u0010\u0005*\u00020\u0006\"\b\b\u0003\u0010\n*\u00020\u0006*\b\u0012\u0004\u0012\u0002H\u00030\u00012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u0002H\u00040\b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u0002H\u00050\b2 \b\u0004\u0010\u000b\u001a\u001a\u0012\u0004\u0012\u0002H\u0003\u0012\u0004\u0012\u0002H\u0004\u0012\u0004\u0012\u0002H\u0005\u0012\u0004\u0012\u0002H\n0\fH\u0087\b\u001a\u009d\u0001\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\n0\u0001\"\b\b\u0000\u0010\u0003*\u00020\u0006\"\b\b\u0001\u0010\u0004*\u00020\u0006\"\b\b\u0002\u0010\u0005*\u00020\u0006\"\b\b\u0003\u0010\r*\u00020\u0006\"\b\b\u0004\u0010\n*\u00020\u0006*\b\u0012\u0004\u0012\u0002H\u00030\u00012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u0002H\u00040\b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u0002H\u00050\b2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u0002H\r0\b2&\b\u0004\u0010\u000b\u001a \u0012\u0004\u0012\u0002H\u0003\u0012\u0004\u0012\u0002H\u0004\u0012\u0004\u0012\u0002H\u0005\u0012\u0004\u0012\u0002H\r\u0012\u0004\u0012\u0002H\n0\u000fH\u0087\b\u001a»\u0001\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\n0\u0001\"\b\b\u0000\u0010\u0003*\u00020\u0006\"\b\b\u0001\u0010\u0004*\u00020\u0006\"\b\b\u0002\u0010\u0005*\u00020\u0006\"\b\b\u0003\u0010\r*\u00020\u0006\"\b\b\u0004\u0010\u0010*\u00020\u0006\"\b\b\u0005\u0010\n*\u00020\u0006*\b\u0012\u0004\u0012\u0002H\u00030\u00012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u0002H\u00040\b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u0002H\u00050\b2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u0002H\r0\b2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u0002H\u00100\b2,\b\u0004\u0010\u000b\u001a&\u0012\u0004\u0012\u0002H\u0003\u0012\u0004\u0012\u0002H\u0004\u0012\u0004\u0012\u0002H\u0005\u0012\u0004\u0012\u0002H\r\u0012\u0004\u0012\u0002H\u0010\u0012\u0004\u0012\u0002H\n0\u0012H\u0087\b\u001aF\u0010\u0000\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u0002H\u0003\u0012\u0004\u0012\u0002H\u00140\u00130\u0001\"\b\b\u0000\u0010\u0003*\u00020\u0006\"\b\b\u0001\u0010\u0014*\u00020\u0006*\b\u0012\u0004\u0012\u0002H\u00030\u00012\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u0002H\u00140\bH\u0007\u001aa\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\n0\u0001\"\b\b\u0000\u0010\u0003*\u00020\u0006\"\b\b\u0001\u0010\u0014*\u00020\u0006\"\b\b\u0002\u0010\n*\u00020\u0006*\b\u0012\u0004\u0012\u0002H\u00030\u00012\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u0002H\u00140\b2\u001a\b\u0004\u0010\u000b\u001a\u0014\u0012\u0004\u0012\u0002H\u0003\u0012\u0004\u0012\u0002H\u0014\u0012\u0004\u0012\u0002H\n0\u0016H\u0087\b\u001aF\u0010\u0017\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u0002H\u0003\u0012\u0004\u0012\u0002H\u00140\u00130\u0001\"\b\b\u0000\u0010\u0003*\u00020\u0006\"\b\b\u0001\u0010\u0014*\u00020\u0006*\b\u0012\u0004\u0012\u0002H\u00030\u00012\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u0002H\u00140\bH\u0007\u001aa\u0010\u0017\u001a\b\u0012\u0004\u0012\u0002H\n0\u0001\"\b\b\u0000\u0010\u0003*\u00020\u0006\"\b\b\u0001\u0010\u0014*\u00020\u0006\"\b\b\u0002\u0010\n*\u00020\u0006*\b\u0012\u0004\u0012\u0002H\u00030\u00012\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u0002H\u00140\b2\u001a\b\u0004\u0010\u0018\u001a\u0014\u0012\u0004\u0012\u0002H\u0003\u0012\u0004\u0012\u0002H\u0014\u0012\u0004\u0012\u0002H\n0\u0016H\u0087\b¨\u0006\u0019"}, d2 = {"withLatestFrom", "Lio/reactivex/Flowable;", "Lkotlin/Triple;", ExifInterface.GPS_DIRECTION_TRUE, "T1", "T2", "", "o1", "Lorg/reactivestreams/Publisher;", "o2", "R", "combiner", "Lkotlin/Function3;", "T3", "o3", "Lkotlin/Function4;", "T4", "o4", "Lkotlin/Function5;", "Lkotlin/Pair;", "U", "other", "Lkotlin/Function2;", "zipWith", "zipper", "rxkotlin"}, k = 2, mv = {1, 1, 15})
public final class FlowablesKt {

    /* JADX INFO: Add missing generic type declarations: [T, U] */
    /* JADX INFO: compiled from: Flowables.kt */
    public static final class a<T1, T2, R, T, U> implements BiFunction<T, U, Pair<? extends T, ? extends U>> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final a f78505p0 = new a();

        @Override // io.reactivex.functions.BiFunction
        public final Object apply(Object obj, Object obj2) {
            return new Pair(obj, obj2);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: compiled from: Flowables.kt */
    public static final class b<T1, T2, T3, R, T> implements Function3<T, T1, T2, Triple<? extends T, ? extends T1, ? extends T2>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f78506a = new b();

        @Override // io.reactivex.functions.Function3
        public final Object apply(Object obj, Object obj2, Object obj3) {
            return new Triple(obj, obj2, obj3);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T, U] */
    /* JADX INFO: compiled from: Flowables.kt */
    public static final class c<T1, T2, R, T, U> implements BiFunction<T, U, Pair<? extends T, ? extends U>> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final c f78507p0 = new c();

        @Override // io.reactivex.functions.BiFunction
        public final Object apply(Object obj, Object obj2) {
            return new Pair(obj, obj2);
        }
    }

    @NotNull
    @SchedulerSupport("none")
    @BackpressureSupport(BackpressureKind.PASS_THROUGH)
    @CheckReturnValue
    public static final <T, U, R> Flowable<R> withLatestFrom(@NotNull Flowable<T> flowable, @NotNull Publisher<U> publisher, @NotNull final Function2<? super T, ? super U, ? extends R> function2) {
        Flowable<R> flowableWithLatestFrom = flowable.withLatestFrom(publisher, new BiFunction<T, U, R>() { // from class: io.reactivex.rxkotlin.FlowablesKt.withLatestFrom.1
            @Override // io.reactivex.functions.BiFunction
            @NotNull
            public final R apply(@NotNull T t10, @NotNull U u2) {
                return (R) function2.invoke(t10, u2);
            }
        });
        Intrinsics.checkExpressionValueIsNotNull(flowableWithLatestFrom, "withLatestFrom(other, Bi… combiner.invoke(t, u) })");
        return flowableWithLatestFrom;
    }

    @NotNull
    @SchedulerSupport("none")
    @BackpressureSupport(BackpressureKind.PASS_THROUGH)
    @CheckReturnValue
    public static final <T, U, R> Flowable<R> zipWith(@NotNull Flowable<T> flowable, @NotNull Publisher<U> publisher, @NotNull final Function2<? super T, ? super U, ? extends R> function2) {
        Flowable<R> flowableZipWith = flowable.zipWith(publisher, new BiFunction<T, U, R>() { // from class: io.reactivex.rxkotlin.FlowablesKt.zipWith.1
            @Override // io.reactivex.functions.BiFunction
            @NotNull
            public final R apply(@NotNull T t10, @NotNull U u2) {
                return (R) function2.invoke(t10, u2);
            }
        });
        Intrinsics.checkExpressionValueIsNotNull(flowableZipWith, "zipWith(other, BiFunctio…-> zipper.invoke(t, u) })");
        return flowableZipWith;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    @SchedulerSupport("none")
    @BackpressureSupport(BackpressureKind.PASS_THROUGH)
    @CheckReturnValue
    public static final <T, U> Flowable<Pair<T, U>> withLatestFrom(@NotNull Flowable<T> flowable, @NotNull Publisher<U> publisher) {
        Flowable<Pair<T, U>> flowable2 = (Flowable<Pair<T, U>>) flowable.withLatestFrom(publisher, a.f78505p0);
        Intrinsics.checkExpressionValueIsNotNull(flowable2, "withLatestFrom(other, Bi…n { t, u -> Pair(t, u) })");
        return flowable2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    @SchedulerSupport("none")
    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    public static final <T, U> Flowable<Pair<T, U>> zipWith(@NotNull Flowable<T> flowable, @NotNull Publisher<U> publisher) {
        Flowable<Pair<T, U>> flowable2 = (Flowable<Pair<T, U>>) flowable.zipWith(publisher, c.f78507p0);
        Intrinsics.checkExpressionValueIsNotNull(flowable2, "zipWith(other, BiFunction { t, u -> Pair(t, u) })");
        return flowable2;
    }

    @NotNull
    @SchedulerSupport("none")
    @BackpressureSupport(BackpressureKind.PASS_THROUGH)
    @CheckReturnValue
    public static final <T, T1, T2, R> Flowable<R> withLatestFrom(@NotNull Flowable<T> flowable, @NotNull Publisher<T1> publisher, @NotNull Publisher<T2> publisher2, @NotNull final kotlin.jvm.functions.Function3<? super T, ? super T1, ? super T2, ? extends R> function3) {
        Flowable<R> flowableWithLatestFrom = flowable.withLatestFrom(publisher, publisher2, new Function3<T, T1, T2, R>() { // from class: io.reactivex.rxkotlin.FlowablesKt.withLatestFrom.3
            @Override // io.reactivex.functions.Function3
            @NotNull
            public final R apply(@NotNull T t10, @NotNull T1 t11, @NotNull T2 t12) {
                return (R) function3.invoke(t10, t11, t12);
            }
        });
        Intrinsics.checkExpressionValueIsNotNull(flowableWithLatestFrom, "withLatestFrom(o1, o2, F…iner.invoke(t, t1, t2) })");
        return flowableWithLatestFrom;
    }

    @NotNull
    @SchedulerSupport("none")
    @BackpressureSupport(BackpressureKind.PASS_THROUGH)
    @CheckReturnValue
    public static final <T, T1, T2> Flowable<Triple<T, T1, T2>> withLatestFrom(@NotNull Flowable<T> flowable, @NotNull Publisher<T1> publisher, @NotNull Publisher<T2> publisher2) {
        Flowable<Triple<T, T1, T2>> flowable2 = (Flowable<Triple<T, T1, T2>>) flowable.withLatestFrom(publisher, publisher2, b.f78506a);
        Intrinsics.checkExpressionValueIsNotNull(flowable2, "withLatestFrom(o1, o2, F…2 -> Triple(t, t1, t2) })");
        return flowable2;
    }

    @NotNull
    @SchedulerSupport("none")
    @BackpressureSupport(BackpressureKind.PASS_THROUGH)
    @CheckReturnValue
    public static final <T, T1, T2, T3, R> Flowable<R> withLatestFrom(@NotNull Flowable<T> flowable, @NotNull Publisher<T1> publisher, @NotNull Publisher<T2> publisher2, @NotNull Publisher<T3> publisher3, @NotNull final Function4<? super T, ? super T1, ? super T2, ? super T3, ? extends R> function4) {
        Flowable<R> flowableWithLatestFrom = flowable.withLatestFrom(publisher, publisher2, publisher3, new io.reactivex.functions.Function4<T, T1, T2, T3, R>() { // from class: io.reactivex.rxkotlin.FlowablesKt.withLatestFrom.5
            @Override // io.reactivex.functions.Function4
            @NotNull
            public final R apply(@NotNull T t10, @NotNull T1 t11, @NotNull T2 t12, @NotNull T3 t13) {
                return (R) function4.invoke(t10, t11, t12, t13);
            }
        });
        Intrinsics.checkExpressionValueIsNotNull(flowableWithLatestFrom, "withLatestFrom(o1, o2, o….invoke(t, t1, t2, t3) })");
        return flowableWithLatestFrom;
    }

    @NotNull
    @SchedulerSupport("none")
    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    public static final <T, T1, T2, T3, T4, R> Flowable<R> withLatestFrom(@NotNull Flowable<T> flowable, @NotNull Publisher<T1> publisher, @NotNull Publisher<T2> publisher2, @NotNull Publisher<T3> publisher3, @NotNull Publisher<T4> publisher4, @NotNull final Function5<? super T, ? super T1, ? super T2, ? super T3, ? super T4, ? extends R> function5) {
        Flowable<R> flowableWithLatestFrom = flowable.withLatestFrom(publisher, publisher2, publisher3, publisher4, new io.reactivex.functions.Function5<T, T1, T2, T3, T4, R>() { // from class: io.reactivex.rxkotlin.FlowablesKt.withLatestFrom.6
            @Override // io.reactivex.functions.Function5
            @NotNull
            public final R apply(@NotNull T t10, @NotNull T1 t11, @NotNull T2 t12, @NotNull T3 t13, @NotNull T4 t14) {
                return (R) function5.invoke(t10, t11, t12, t13, t14);
            }
        });
        Intrinsics.checkExpressionValueIsNotNull(flowableWithLatestFrom, "withLatestFrom(o1, o2, o…oke(t, t1, t2, t3, t4) })");
        return flowableWithLatestFrom;
    }
}

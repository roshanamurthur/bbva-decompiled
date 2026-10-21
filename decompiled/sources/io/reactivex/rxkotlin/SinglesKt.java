package io.reactivex.rxkotlin;

import androidx.exifinterface.media.ExifInterface;
import io.reactivex.Single;
import io.reactivex.SingleSource;
import io.reactivex.annotations.CheckReturnValue;
import io.reactivex.annotations.SchedulerSupport;
import io.reactivex.functions.BiFunction;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: Singles.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u001aF\u0010\u0000\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u0002H\u0003\u0012\u0004\u0012\u0002H\u00040\u00020\u0001\"\b\b\u0000\u0010\u0003*\u00020\u0005\"\b\b\u0001\u0010\u0004*\u00020\u0005*\b\u0012\u0004\u0012\u0002H\u00030\u00012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u0002H\u00040\u0007H\u0007\u001aa\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\b0\u0001\"\b\b\u0000\u0010\u0003*\u00020\u0005\"\b\b\u0001\u0010\u0004*\u00020\u0005\"\b\b\u0002\u0010\b*\u00020\u0005*\b\u0012\u0004\u0012\u0002H\u00030\u00012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u0002H\u00040\u00072\u001a\b\u0004\u0010\t\u001a\u0014\u0012\u0004\u0012\u0002H\u0003\u0012\u0004\u0012\u0002H\u0004\u0012\u0004\u0012\u0002H\b0\nH\u0087\b¨\u0006\u000b"}, d2 = {"zipWith", "Lio/reactivex/Single;", "Lkotlin/Pair;", ExifInterface.GPS_DIRECTION_TRUE, "U", "", "other", "Lio/reactivex/SingleSource;", "R", "zipper", "Lkotlin/Function2;", "rxkotlin"}, k = 2, mv = {1, 1, 15})
public final class SinglesKt {

    /* JADX INFO: Add missing generic type declarations: [T, U] */
    /* JADX INFO: compiled from: Singles.kt */
    public static final class a<T1, T2, R, T, U> implements BiFunction<T, U, Pair<? extends T, ? extends U>> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final a f78580p0 = new a();

        @Override // io.reactivex.functions.BiFunction
        public final Object apply(Object obj, Object obj2) {
            return new Pair(obj, obj2);
        }
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    @NotNull
    public static final <T, U, R> Single<R> zipWith(@NotNull Single<T> single, @NotNull SingleSource<U> singleSource, @NotNull final Function2<? super T, ? super U, ? extends R> function2) {
        Single<R> singleZipWith = single.zipWith(singleSource, new BiFunction<T, U, R>() { // from class: io.reactivex.rxkotlin.SinglesKt.zipWith.1
            @Override // io.reactivex.functions.BiFunction
            @NotNull
            public final R apply(@NotNull T t10, @NotNull U u2) {
                return (R) function2.invoke(t10, u2);
            }
        });
        Intrinsics.checkExpressionValueIsNotNull(singleZipWith, "zipWith(other, BiFunctio…-> zipper.invoke(t, u) })");
        return singleZipWith;
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    @NotNull
    public static final <T, U> Single<Pair<T, U>> zipWith(@NotNull Single<T> single, @NotNull SingleSource<U> singleSource) {
        Single<Pair<T, U>> single2 = (Single<Pair<T, U>>) single.zipWith(singleSource, a.f78580p0);
        Intrinsics.checkExpressionValueIsNotNull(single2, "zipWith(other, BiFunction { t, u -> Pair(t, u) })");
        return single2;
    }
}

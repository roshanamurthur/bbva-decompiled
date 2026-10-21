package io.reactivex.rxjava3.kotlin;

import androidx.exifinterface.media.ExifInterface;
import io.reactivex.rxjava3.annotations.CheckReturnValue;
import io.reactivex.rxjava3.annotations.SchedulerSupport;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.core.SingleSource;
import io.reactivex.rxjava3.functions.BiFunction;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.ReplaceWith;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: Singles.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u001aF\u0010\u0000\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u0002H\u0003\u0012\u0004\u0012\u0002H\u00040\u00020\u0001\"\b\b\u0000\u0010\u0003*\u00020\u0005\"\b\b\u0001\u0010\u0004*\u00020\u0005*\b\u0012\u0004\u0012\u0002H\u00030\u00012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u0002H\u00040\u0007H\u0007\u001ad\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\b0\u0001\"\b\b\u0000\u0010\u0003*\u00020\u0005\"\b\b\u0001\u0010\u0004*\u00020\u0005\"\b\b\u0002\u0010\b*\u00020\u0005*\b\u0012\u0004\u0012\u0002H\u00030\u00012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u0002H\u00040\u00072\u001a\b\u0004\u0010\t\u001a\u0014\u0012\u0004\u0012\u0002H\u0003\u0012\u0004\u0012\u0002H\u0004\u0012\u0004\u0012\u0002H\b0\nH\u0087\bø\u0001\u0000\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u000b"}, d2 = {"zipWith", "Lio/reactivex/rxjava3/core/Single;", "Lkotlin/Pair;", ExifInterface.GPS_DIRECTION_TRUE, "U", "", "other", "Lio/reactivex/rxjava3/core/SingleSource;", "R", "zipper", "Lkotlin/Function2;", "rxkotlin"}, k = 2, mv = {1, 4, 0})
public final class SinglesKt {

    /* JADX INFO: Add missing generic type declarations: [T, U] */
    /* JADX INFO: compiled from: Singles.kt */
    public static final class a<T1, T2, R, T, U> implements BiFunction<T, U, Pair<? extends T, ? extends U>> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final a f78206p0 = new a();

        @Override // io.reactivex.rxjava3.functions.BiFunction
        public final Object apply(Object obj, Object obj2) {
            return new Pair(obj, obj2);
        }
    }

    @CheckReturnValue
    @NotNull
    @Deprecated(level = DeprecationLevel.WARNING, message = "New type inference algorithm in Kotlin 1.4 makes this method obsolete. Method will be removed in future RxKotlin release.", replaceWith = @ReplaceWith(expression = "zipWith(other, zipper)", imports = {}))
    @SchedulerSupport("none")
    public static final <T, U, R> Single<R> zipWith(@NotNull Single<T> zipWith, @NotNull SingleSource<U> other, @NotNull final Function2<? super T, ? super U, ? extends R> zipper) {
        Intrinsics.checkNotNullParameter(zipWith, "$this$zipWith");
        Intrinsics.checkNotNullParameter(other, "other");
        Intrinsics.checkNotNullParameter(zipper, "zipper");
        Single<R> singleZipWith = zipWith.zipWith(other, new BiFunction<T, U, R>() { // from class: io.reactivex.rxjava3.kotlin.SinglesKt.zipWith.1
            @Override // io.reactivex.rxjava3.functions.BiFunction
            public final R apply(T t10, U u2) {
                Intrinsics.checkNotNullExpressionValue(t10, "t");
                Intrinsics.checkNotNullExpressionValue(u2, "u");
                return (R) zipper.invoke(t10, u2);
            }
        });
        Intrinsics.checkNotNullExpressionValue(singleZipWith, "zipWith(other, BiFunctio…-> zipper.invoke(t, u) })");
        return singleZipWith;
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    @NotNull
    public static final <T, U> Single<Pair<T, U>> zipWith(@NotNull Single<T> zipWith, @NotNull SingleSource<U> other) {
        Intrinsics.checkNotNullParameter(zipWith, "$this$zipWith");
        Intrinsics.checkNotNullParameter(other, "other");
        Single<Pair<T, U>> single = (Single<Pair<T, U>>) zipWith.zipWith(other, a.f78206p0);
        Intrinsics.checkNotNullExpressionValue(single, "zipWith(other, BiFunction { t, u -> Pair(t, u) })");
        return single;
    }
}

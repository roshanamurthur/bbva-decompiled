package io.reactivex.rxjava3.kotlin;

import androidx.exifinterface.media.ExifInterface;
import com.bbva.nativesettings.common.Constants;
import io.reactivex.rxjava3.annotations.BackpressureKind;
import io.reactivex.rxjava3.annotations.BackpressureSupport;
import io.reactivex.rxjava3.annotations.CheckReturnValue;
import io.reactivex.rxjava3.annotations.SchedulerSupport;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.Maybe;
import io.reactivex.rxjava3.core.MaybeSource;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.functions.Function;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: maybe.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a#\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\n\b\u0000\u0010\u0002\u0018\u0001*\u00020\u0003*\u0006\u0012\u0002\b\u00030\u0001H\u0087\b\u001a(\u0010\u0004\u001a\b\u0012\u0004\u0012\u0002H\u00060\u0005\"\b\b\u0000\u0010\u0006*\u00020\u0003*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00060\b0\u0007H\u0007\u001a(\u0010\t\u001a\b\u0012\u0004\u0012\u0002H\u00060\u0005\"\b\b\u0000\u0010\u0006*\u00020\u0003*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00060\u00010\u0005H\u0007\u001a(\u0010\t\u001a\b\u0012\u0004\u0012\u0002H\u00060\n\"\b\b\u0000\u0010\u0006*\u00020\u0003*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00060\u00010\nH\u0007\u001a#\u0010\u000b\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\n\b\u0000\u0010\u0002\u0018\u0001*\u00020\u0003*\u0006\u0012\u0002\b\u00030\u0001H\u0087\b¨\u0006\f"}, d2 = {Constants.CAST, "Lio/reactivex/rxjava3/core/Maybe;", "R", "", "concatAll", "Lio/reactivex/rxjava3/core/Flowable;", ExifInterface.GPS_DIRECTION_TRUE, "", "Lio/reactivex/rxjava3/core/MaybeSource;", "mergeAllMaybes", "Lio/reactivex/rxjava3/core/Observable;", "ofType", "rxkotlin"}, k = 2, mv = {1, 4, 0})
public final class MaybeKt {

    /* JADX INFO: compiled from: maybe.kt */
    public static final class a<T, R> implements Function<Maybe<T>, MaybeSource<? extends T>> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final a f78139p0 = new a();

        @Override // io.reactivex.rxjava3.functions.Function
        public final Object apply(Object obj) {
            return (Maybe) obj;
        }
    }

    /* JADX INFO: compiled from: maybe.kt */
    public static final class b<T, R> implements Function<Maybe<T>, MaybeSource<? extends T>> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final b f78140p0 = new b();

        @Override // io.reactivex.rxjava3.functions.Function
        public final Object apply(Object obj) {
            return (Maybe) obj;
        }
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    @NotNull
    public static final /* synthetic */ <R> Maybe<R> cast(@NotNull Maybe<?> cast) {
        Intrinsics.checkNotNullParameter(cast, "$this$cast");
        Intrinsics.reifiedOperationMarker(4, "R");
        Maybe<R> maybe = (Maybe<R>) cast.cast(Object.class);
        Intrinsics.checkNotNullExpressionValue(maybe, "cast(R::class.java)");
        return maybe;
    }

    @CheckReturnValue
    @NotNull
    @BackpressureSupport(BackpressureKind.FULL)
    @SchedulerSupport("none")
    public static final <T> Flowable<T> concatAll(@NotNull Iterable<? extends MaybeSource<T>> concatAll) {
        Intrinsics.checkNotNullParameter(concatAll, "$this$concatAll");
        Flowable<T> flowableConcat = Maybe.concat(concatAll);
        Intrinsics.checkNotNullExpressionValue(flowableConcat, "Maybe.concat(this)");
        return flowableConcat;
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    @NotNull
    public static final <T> Observable<T> mergeAllMaybes(@NotNull Observable<Maybe<T>> mergeAllMaybes) {
        Intrinsics.checkNotNullParameter(mergeAllMaybes, "$this$mergeAllMaybes");
        Observable<T> observable = (Observable<T>) mergeAllMaybes.flatMapMaybe(a.f78139p0);
        Intrinsics.checkNotNullExpressionValue(observable, "flatMapMaybe { it }");
        return observable;
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    @NotNull
    public static final /* synthetic */ <R> Maybe<R> ofType(@NotNull Maybe<?> ofType) {
        Intrinsics.checkNotNullParameter(ofType, "$this$ofType");
        Intrinsics.reifiedOperationMarker(4, "R");
        Maybe<R> maybe = (Maybe<R>) ofType.ofType(Object.class);
        Intrinsics.checkNotNullExpressionValue(maybe, "ofType(R::class.java)");
        return maybe;
    }

    @CheckReturnValue
    @NotNull
    @BackpressureSupport(BackpressureKind.UNBOUNDED_IN)
    @SchedulerSupport("none")
    public static final <T> Flowable<T> mergeAllMaybes(@NotNull Flowable<Maybe<T>> mergeAllMaybes) {
        Intrinsics.checkNotNullParameter(mergeAllMaybes, "$this$mergeAllMaybes");
        Flowable<T> flowable = (Flowable<T>) mergeAllMaybes.flatMapMaybe(b.f78140p0);
        Intrinsics.checkNotNullExpressionValue(flowable, "flatMapMaybe { it }");
        return flowable;
    }
}

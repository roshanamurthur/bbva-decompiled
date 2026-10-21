package io.reactivex.rxjava3.kotlin;

import androidx.exifinterface.media.ExifInterface;
import com.bbva.nativesettings.common.Constants;
import io.reactivex.rxjava3.annotations.BackpressureKind;
import io.reactivex.rxjava3.annotations.BackpressureSupport;
import io.reactivex.rxjava3.annotations.CheckReturnValue;
import io.reactivex.rxjava3.annotations.SchedulerSupport;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.core.SingleSource;
import io.reactivex.rxjava3.functions.Function;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: single.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a#\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\n\b\u0000\u0010\u0002\u0018\u0001*\u00020\u0003*\u0006\u0012\u0002\b\u00030\u0001H\u0086\b\u001a(\u0010\u0004\u001a\b\u0012\u0004\u0012\u0002H\u00060\u0005\"\b\b\u0000\u0010\u0006*\u00020\u0003*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00060\b0\u0007H\u0007\u001a(\u0010\t\u001a\b\u0012\u0004\u0012\u0002H\u00060\u0005\"\b\b\u0000\u0010\u0006*\u00020\u0003*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00060\u00010\u0005H\u0007\u001a(\u0010\t\u001a\b\u0012\u0004\u0012\u0002H\u00060\n\"\b\b\u0000\u0010\u0006*\u00020\u0003*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00060\u00010\nH\u0007¨\u0006\u000b"}, d2 = {Constants.CAST, "Lio/reactivex/rxjava3/core/Single;", "R", "", "concatAll", "Lio/reactivex/rxjava3/core/Flowable;", ExifInterface.GPS_DIRECTION_TRUE, "", "Lio/reactivex/rxjava3/core/SingleSource;", "mergeAllSingles", "Lio/reactivex/rxjava3/core/Observable;", "rxkotlin"}, k = 2, mv = {1, 4, 0})
public final class SingleKt {

    /* JADX INFO: compiled from: single.kt */
    public static final class a<T, R> implements Function<Single<T>, SingleSource<? extends T>> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final a f78194p0 = new a();

        @Override // io.reactivex.rxjava3.functions.Function
        public final Object apply(Object obj) {
            return (Single) obj;
        }
    }

    /* JADX INFO: compiled from: single.kt */
    public static final class b<T, R> implements Function<Single<T>, SingleSource<? extends T>> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final b f78195p0 = new b();

        @Override // io.reactivex.rxjava3.functions.Function
        public final Object apply(Object obj) {
            return (Single) obj;
        }
    }

    @NotNull
    public static final /* synthetic */ <R> Single<R> cast(@NotNull Single<?> cast) {
        Intrinsics.checkNotNullParameter(cast, "$this$cast");
        Intrinsics.reifiedOperationMarker(4, "R");
        Single<R> single = (Single<R>) cast.cast(Object.class);
        Intrinsics.checkNotNullExpressionValue(single, "cast(R::class.java)");
        return single;
    }

    @CheckReturnValue
    @NotNull
    @BackpressureSupport(BackpressureKind.FULL)
    @SchedulerSupport("none")
    public static final <T> Flowable<T> concatAll(@NotNull Iterable<? extends SingleSource<T>> concatAll) {
        Intrinsics.checkNotNullParameter(concatAll, "$this$concatAll");
        Flowable<T> flowableConcat = Single.concat(concatAll);
        Intrinsics.checkNotNullExpressionValue(flowableConcat, "Single.concat(this)");
        return flowableConcat;
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    @NotNull
    public static final <T> Observable<T> mergeAllSingles(@NotNull Observable<Single<T>> mergeAllSingles) {
        Intrinsics.checkNotNullParameter(mergeAllSingles, "$this$mergeAllSingles");
        Observable<T> observable = (Observable<T>) mergeAllSingles.flatMapSingle(a.f78194p0);
        Intrinsics.checkNotNullExpressionValue(observable, "flatMapSingle { it }");
        return observable;
    }

    @CheckReturnValue
    @NotNull
    @BackpressureSupport(BackpressureKind.UNBOUNDED_IN)
    @SchedulerSupport("none")
    public static final <T> Flowable<T> mergeAllSingles(@NotNull Flowable<Single<T>> mergeAllSingles) {
        Intrinsics.checkNotNullParameter(mergeAllSingles, "$this$mergeAllSingles");
        Flowable<T> flowable = (Flowable<T>) mergeAllSingles.flatMapSingle(b.f78195p0);
        Intrinsics.checkNotNullExpressionValue(flowable, "flatMapSingle { it }");
        return flowable;
    }
}

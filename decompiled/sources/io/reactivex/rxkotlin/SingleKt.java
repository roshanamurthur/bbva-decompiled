package io.reactivex.rxkotlin;

import androidx.exifinterface.media.ExifInterface;
import com.bbva.nativesettings.common.Constants;
import io.reactivex.Flowable;
import io.reactivex.Observable;
import io.reactivex.Single;
import io.reactivex.SingleSource;
import io.reactivex.annotations.BackpressureKind;
import io.reactivex.annotations.BackpressureSupport;
import io.reactivex.annotations.CheckReturnValue;
import io.reactivex.annotations.SchedulerSupport;
import io.reactivex.functions.Function;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: single.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a#\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\n\b\u0000\u0010\u0002\u0018\u0001*\u00020\u0003*\u0006\u0012\u0002\b\u00030\u0001H\u0086\b\u001a(\u0010\u0004\u001a\b\u0012\u0004\u0012\u0002H\u00060\u0005\"\b\b\u0000\u0010\u0006*\u00020\u0003*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00060\b0\u0007H\u0007\u001a(\u0010\t\u001a\b\u0012\u0004\u0012\u0002H\u00060\u0005\"\b\b\u0000\u0010\u0006*\u00020\u0003*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00060\u00010\u0005H\u0007\u001a(\u0010\t\u001a\b\u0012\u0004\u0012\u0002H\u00060\n\"\b\b\u0000\u0010\u0006*\u00020\u0003*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00060\u00010\nH\u0007¨\u0006\u000b"}, d2 = {Constants.CAST, "Lio/reactivex/Single;", "R", "", "concatAll", "Lio/reactivex/Flowable;", ExifInterface.GPS_DIRECTION_TRUE, "", "Lio/reactivex/SingleSource;", "mergeAllSingles", "Lio/reactivex/Observable;", "rxkotlin"}, k = 2, mv = {1, 1, 15})
public final class SingleKt {

    /* JADX INFO: compiled from: single.kt */
    public static final class a<T, R> implements Function<T, SingleSource<? extends R>> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final a f78568p0 = new a();

        @Override // io.reactivex.functions.Function
        public final Object apply(Object obj) {
            return (Single) obj;
        }
    }

    /* JADX INFO: compiled from: single.kt */
    public static final class b<T, R> implements Function<T, SingleSource<? extends R>> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final b f78569p0 = new b();

        @Override // io.reactivex.functions.Function
        public final Object apply(Object obj) {
            return (Single) obj;
        }
    }

    @NotNull
    public static final /* synthetic */ <R> Single<R> cast(@NotNull Single<?> single) {
        Intrinsics.reifiedOperationMarker(4, "R");
        Single<R> single2 = (Single<R>) single.cast(Object.class);
        Intrinsics.checkExpressionValueIsNotNull(single2, "cast(R::class.java)");
        return single2;
    }

    @NotNull
    @SchedulerSupport("none")
    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    public static final <T> Flowable<T> concatAll(@NotNull Iterable<? extends SingleSource<T>> iterable) {
        Flowable<T> flowableConcat = Single.concat(iterable);
        Intrinsics.checkExpressionValueIsNotNull(flowableConcat, "Single.concat(this)");
        return flowableConcat;
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    @NotNull
    public static final <T> Observable<T> mergeAllSingles(@NotNull Observable<Single<T>> observable) {
        Observable<T> observable2 = (Observable<T>) observable.flatMapSingle(a.f78568p0);
        Intrinsics.checkExpressionValueIsNotNull(observable2, "flatMapSingle { it }");
        return observable2;
    }

    @NotNull
    @SchedulerSupport("none")
    @BackpressureSupport(BackpressureKind.UNBOUNDED_IN)
    @CheckReturnValue
    public static final <T> Flowable<T> mergeAllSingles(@NotNull Flowable<Single<T>> flowable) {
        Flowable<T> flowable2 = (Flowable<T>) flowable.flatMapSingle(b.f78569p0);
        Intrinsics.checkExpressionValueIsNotNull(flowable2, "flatMapSingle { it }");
        return flowable2;
    }
}

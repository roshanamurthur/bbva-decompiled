package io.reactivex.rxjava3.kotlin;

import androidx.exifinterface.media.ExifInterface;
import com.bbva.nativesettings.common.Constants;
import io.reactivex.rxjava3.annotations.CheckReturnValue;
import io.reactivex.rxjava3.annotations.SchedulerSupport;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.ObservableSource;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.functions.Function;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.ArraysKt___ArraysJvmKt;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntProgression;
import kotlin.sequences.Sequence;
import kotlin.sequences.SequencesKt___SequencesKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: observable.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\u0094\u0001\n\u0002\u0010\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0012\n\u0002\u0010\u0005\n\u0002\u0010\u0019\n\u0002\u0010\f\n\u0002\u0010\u0017\n\u0002\u0010\n\n\u0002\u0010\u0015\n\u0002\u0010\b\n\u0002\u0010\u0016\n\u0002\u0010\t\n\u0002\u0010\u0014\n\u0002\u0010\u0007\n\u0002\u0010\u0013\n\u0002\u0010\u0006\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010(\n\u0002\u0010\u001c\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010%\n\u0000\n\u0002\u0010\u001f\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0012\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\u0007\u001a\u0012\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0001*\u00020\u0004H\u0007\u001a\u0012\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00070\u0001*\u00020\u0006H\u0007\u001a\u0012\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\t0\u0001*\u00020\bH\u0007\u001a\u0012\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0001*\u00020\nH\u0007\u001a\u0012\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\r0\u0001*\u00020\fH\u0007\u001a\u0012\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0001*\u00020\u000eH\u0007\u001a\u0012\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00110\u0001*\u00020\u0010H\u0007\u001a)\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\b\b\u0000\u0010\u0013*\u00020\u0012*\b\u0012\u0004\u0012\u00028\u00000\u0014H\u0007¢\u0006\u0004\b\u0003\u0010\u0015\u001a\u0012\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0001*\u00020\u0016H\u0007\u001a\"\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\b\b\u0000\u0010\u0013*\u00020\u0012*\b\u0012\u0004\u0012\u00028\u00000\u0017H\u0007\u001a\"\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\b\b\u0000\u0010\u0013*\u00020\u0012*\b\u0012\u0004\u0012\u00028\u00000\u0018H\u0007\u001a\"\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\b\b\u0000\u0010\u0013*\u00020\u0012*\b\u0012\u0004\u0012\u00028\u00000\u0019H\u0007\u001a*\u0010\u001a\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\b\b\u0000\u0010\u0013*\u00020\u0012*\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u00010\u0018H\u0007\u001a*\u0010\u001b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\b\b\u0000\u0010\u0013*\u00020\u0012*\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u00010\u0018H\u0007\u001a*\u0010\u001c\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\b\b\u0000\u0010\u0013*\u00020\u0012*\u0010\u0012\f\b\u0001\u0012\b\u0012\u0004\u0012\u00028\u00000\u00180\u0001H\u0007\u001a*\u0010\u001d\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\b\b\u0000\u0010\u0013*\u00020\u0012*\u0010\u0012\f\b\u0001\u0012\b\u0012\u0004\u0012\u00028\u00000\u00180\u0001H\u0007\u001aL\u0010!\u001a\b\u0012\u0004\u0012\u00028\u00010\u0001\"\b\b\u0000\u0010\u0013*\u00020\u0012\"\b\b\u0001\u0010\u001e*\u00020\u0012*\b\u0012\u0004\u0012\u00028\u00000\u00012\u001a\b\u0004\u0010 \u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u00190\u001fH\u0087\bø\u0001\u0000\u001aa\u0010'\u001a\b\u0012\u0004\u0012\u00028\u00010\u0001\"\b\b\u0000\u0010\u0013*\u00020\u0012\"\b\b\u0001\u0010\u001e*\u00020\u0012*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00010\u00182)\b\u0004\u0010&\u001a#\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00028\u00000\"¢\u0006\f\b#\u0012\b\b$\u0012\u0004\b\b(%\u0012\u0004\u0012\u00028\u00010\u001fH\u0087\bø\u0001\u0000\u001aa\u0010)\u001a\b\u0012\u0004\u0012\u00028\u00010\u0001\"\b\b\u0000\u0010\u0013*\u00020\u0012\"\b\b\u0001\u0010\u001e*\u00020\u0012*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00010\u00182)\b\u0004\u0010(\u001a#\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00028\u00000\"¢\u0006\f\b#\u0012\b\b$\u0012\u0004\b\b(%\u0012\u0004\u0012\u00028\u00010\u001fH\u0087\bø\u0001\u0000\u001a#\u0010*\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\n\b\u0000\u0010\u001e\u0018\u0001*\u00020\u0012*\u0006\u0012\u0002\b\u00030\u0001H\u0087\b\u001a#\u0010+\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\n\b\u0000\u0010\u001e\u0018\u0001*\u00020\u0012*\u0006\u0012\u0002\b\u00030\u0001H\u0087\b\u001a(\u0010,\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\b\b\u0000\u0010\u0013*\u00020\u0012*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00010\u0001H\u0007\u001a(\u0010-\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\b\b\u0000\u0010\u0013*\u00020\u0012*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00010\u0001H\u0007\u001a(\u0010.\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\b\b\u0000\u0010\u0013*\u00020\u0012*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00010\u0001H\u0007\u001a(\u0010/\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\b\b\u0000\u0010\u0013*\u00020\u0012*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00010\u0001H\u0007\u001aD\u00105\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010403\"\b\b\u0000\u00100*\u00020\u0012\"\b\b\u0001\u00101*\u00020\u0012*\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001020\u0001H\u0007\u001aJ\u00107\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u0001060403\"\b\b\u0000\u00100*\u00020\u0012\"\b\b\u0001\u00101*\u00020\u0012*\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001020\u0001H\u0007\u001a(\u0010-\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\b\b\u0000\u0010\u0013*\u00020\u0012*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u0000080\u0018H\u0007\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u00069"}, d2 = {"", "Lio/reactivex/rxjava3/core/Observable;", "", "toObservable", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", ExifInterface.GPS_DIRECTION_TRUE, "", "([Ljava/lang/Object;)Lio/reactivex/rxjava3/core/Observable;", "Lkotlin/ranges/IntProgression;", "", "", "Lkotlin/sequences/Sequence;", "merge", "mergeDelayError", "flatMapIterable", "concatMapIterable", "R", "Lkotlin/Function1;", "body", "flatMapSequence", "", "Lkotlin/ParameterName;", "name", "args", "combineFunction", "combineLatest", "zipFunction", "zip", Constants.CAST, "ofType", "mergeAll", "concatAll", "switchLatest", "switchOnNext", ExifInterface.GPS_MEASUREMENT_IN_PROGRESS, "B", "Lkotlin/Pair;", "Lio/reactivex/rxjava3/core/Single;", "", "toMap", "", "toMultimap", "Lio/reactivex/rxjava3/core/ObservableSource;", "rxkotlin"}, k = 2, mv = {1, 4, 0})
public final class ObservableKt {

    /* JADX INFO: compiled from: observable.kt */
    public static final class a<T, R> implements Function<Observable<T>, ObservableSource<? extends T>> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final a f78153p0 = new a();

        @Override // io.reactivex.rxjava3.functions.Function
        public final Object apply(Object obj) {
            return (Observable) obj;
        }
    }

    /* JADX INFO: compiled from: observable.kt */
    public static final class b<T, R> implements Function<Iterable<? extends T>, Iterable<? extends T>> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final b f78154p0 = new b();

        @Override // io.reactivex.rxjava3.functions.Function
        public final Object apply(Object obj) {
            return (Iterable) obj;
        }
    }

    /* JADX INFO: compiled from: observable.kt */
    public static final class c<T, R> implements Function<Iterable<? extends T>, Iterable<? extends T>> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final c f78155p0 = new c();

        @Override // io.reactivex.rxjava3.functions.Function
        public final Object apply(Object obj) {
            return (Iterable) obj;
        }
    }

    /* JADX INFO: compiled from: observable.kt */
    public static final class d<T, R> implements Function<Observable<T>, ObservableSource<? extends T>> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final d f78157p0 = new d();

        @Override // io.reactivex.rxjava3.functions.Function
        public final Object apply(Object obj) {
            return (Observable) obj;
        }
    }

    /* JADX INFO: compiled from: observable.kt */
    public static final class e<T, R> implements Function<Observable<T>, ObservableSource<? extends T>> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final e f78158p0 = new e();

        @Override // io.reactivex.rxjava3.functions.Function
        public final Object apply(Object obj) {
            return (Observable) obj;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [A, B] */
    /* JADX INFO: compiled from: observable.kt */
    public static final class f<T, R, A, B> implements Function<Pair<? extends A, ? extends B>, A> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final f f78159p0 = new f();

        @Override // io.reactivex.rxjava3.functions.Function
        public final Object apply(Object obj) {
            return ((Pair) obj).getFirst();
        }
    }

    /* JADX INFO: Add missing generic type declarations: [A, B] */
    /* JADX INFO: compiled from: observable.kt */
    public static final class g<T, R, A, B> implements Function<Pair<? extends A, ? extends B>, B> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final g f78161p0 = new g();

        @Override // io.reactivex.rxjava3.functions.Function
        public final Object apply(Object obj) {
            return ((Pair) obj).getSecond();
        }
    }

    /* JADX INFO: Add missing generic type declarations: [A, B] */
    /* JADX INFO: compiled from: observable.kt */
    public static final class h<T, R, A, B> implements Function<Pair<? extends A, ? extends B>, A> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final h f78162p0 = new h();

        @Override // io.reactivex.rxjava3.functions.Function
        public final Object apply(Object obj) {
            return ((Pair) obj).getFirst();
        }
    }

    /* JADX INFO: Add missing generic type declarations: [A, B] */
    /* JADX INFO: compiled from: observable.kt */
    public static final class i<T, R, A, B> implements Function<Pair<? extends A, ? extends B>, B> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final i f78163p0 = new i();

        @Override // io.reactivex.rxjava3.functions.Function
        public final Object apply(Object obj) {
            return ((Pair) obj).getSecond();
        }
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    @NotNull
    public static final /* synthetic */ <R> Observable<R> cast(@NotNull Observable<?> cast) {
        Intrinsics.checkNotNullParameter(cast, "$this$cast");
        Intrinsics.reifiedOperationMarker(4, "R");
        Observable<R> observable = (Observable<R>) cast.cast(Object.class);
        Intrinsics.checkNotNullExpressionValue(observable, "cast(R::class.java)");
        return observable;
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    @NotNull
    public static final <T, R> Observable<R> combineLatest(@NotNull Iterable<? extends Observable<T>> combineLatest, @NotNull final Function1<? super List<? extends T>, ? extends R> combineFunction) {
        Intrinsics.checkNotNullParameter(combineLatest, "$this$combineLatest");
        Intrinsics.checkNotNullParameter(combineFunction, "combineFunction");
        Observable<R> observableCombineLatest = Observable.combineLatest(combineLatest, new Function<Object[], R>() { // from class: io.reactivex.rxjava3.kotlin.ObservableKt.combineLatest.1
            @Override // io.reactivex.rxjava3.functions.Function
            public final R apply(Object[] it) {
                Intrinsics.checkNotNullExpressionValue(it, "it");
                List listAsList = ArraysKt___ArraysJvmKt.asList(it);
                ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(listAsList, 10));
                for (T t10 : listAsList) {
                    if (t10 == null) {
                        throw new NullPointerException("null cannot be cast to non-null type T");
                    }
                    arrayList.add(t10);
                }
                return (R) combineFunction.invoke(arrayList);
            }
        });
        Intrinsics.checkNotNullExpressionValue(observableCombineLatest, "Observable.combineLatest…List().map { it as T }) }");
        return observableCombineLatest;
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    @NotNull
    public static final <T> Observable<T> concatAll(@NotNull Observable<Observable<T>> concatAll) {
        Intrinsics.checkNotNullParameter(concatAll, "$this$concatAll");
        Observable<T> observable = (Observable<T>) concatAll.concatMap(a.f78153p0);
        Intrinsics.checkNotNullExpressionValue(observable, "concatMap { it }");
        return observable;
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    @NotNull
    public static final <T> Observable<T> concatMapIterable(@NotNull Observable<? extends Iterable<? extends T>> concatMapIterable) {
        Intrinsics.checkNotNullParameter(concatMapIterable, "$this$concatMapIterable");
        Observable<T> observable = (Observable<T>) concatMapIterable.concatMapIterable(b.f78154p0);
        Intrinsics.checkNotNullExpressionValue(observable, "concatMapIterable { it }");
        return observable;
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    @NotNull
    public static final <T> Observable<T> flatMapIterable(@NotNull Observable<? extends Iterable<? extends T>> flatMapIterable) {
        Intrinsics.checkNotNullParameter(flatMapIterable, "$this$flatMapIterable");
        Observable<T> observable = (Observable<T>) flatMapIterable.flatMapIterable(c.f78155p0);
        Intrinsics.checkNotNullExpressionValue(observable, "flatMapIterable { it }");
        return observable;
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    @NotNull
    public static final <T, R> Observable<R> flatMapSequence(@NotNull Observable<T> flatMapSequence, @NotNull final Function1<? super T, ? extends Sequence<? extends R>> body) {
        Intrinsics.checkNotNullParameter(flatMapSequence, "$this$flatMapSequence");
        Intrinsics.checkNotNullParameter(body, "body");
        Observable<R> observableFlatMap = flatMapSequence.flatMap(new Function<T, ObservableSource<? extends R>>() { // from class: io.reactivex.rxjava3.kotlin.ObservableKt.flatMapSequence.1
            @Override // io.reactivex.rxjava3.functions.Function
            public final ObservableSource<? extends R> apply(T it) {
                Intrinsics.checkNotNullExpressionValue(it, "it");
                return ObservableKt.toObservable((Sequence) body.invoke(it));
            }
        });
        Intrinsics.checkNotNullExpressionValue(observableFlatMap, "flatMap { body(it).toObservable() }");
        return observableFlatMap;
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    @NotNull
    public static final <T> Observable<T> merge(@NotNull Iterable<? extends Observable<? extends T>> merge) {
        Intrinsics.checkNotNullParameter(merge, "$this$merge");
        Observable<T> observableMerge = Observable.merge(toObservable(merge));
        Intrinsics.checkNotNullExpressionValue(observableMerge, "Observable.merge(this.toObservable())");
        return observableMerge;
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    @NotNull
    public static final <T> Observable<T> mergeAll(@NotNull Observable<Observable<T>> mergeAll) {
        Intrinsics.checkNotNullParameter(mergeAll, "$this$mergeAll");
        Observable<T> observable = (Observable<T>) mergeAll.flatMap(d.f78157p0);
        Intrinsics.checkNotNullExpressionValue(observable, "flatMap { it }");
        return observable;
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    @NotNull
    public static final <T> Observable<T> mergeDelayError(@NotNull Iterable<? extends Observable<? extends T>> mergeDelayError) {
        Intrinsics.checkNotNullParameter(mergeDelayError, "$this$mergeDelayError");
        Observable<T> observableMergeDelayError = Observable.mergeDelayError(toObservable(mergeDelayError));
        Intrinsics.checkNotNullExpressionValue(observableMergeDelayError, "Observable.mergeDelayError(this.toObservable())");
        return observableMergeDelayError;
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    @NotNull
    public static final /* synthetic */ <R> Observable<R> ofType(@NotNull Observable<?> ofType) {
        Intrinsics.checkNotNullParameter(ofType, "$this$ofType");
        Intrinsics.reifiedOperationMarker(4, "R");
        Observable<R> observable = (Observable<R>) ofType.ofType(Object.class);
        Intrinsics.checkNotNullExpressionValue(observable, "ofType(R::class.java)");
        return observable;
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    @NotNull
    public static final <T> Observable<T> switchLatest(@NotNull Observable<Observable<T>> switchLatest) {
        Intrinsics.checkNotNullParameter(switchLatest, "$this$switchLatest");
        Observable<T> observable = (Observable<T>) switchLatest.switchMap(e.f78158p0);
        Intrinsics.checkNotNullExpressionValue(observable, "switchMap { it }");
        return observable;
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    @NotNull
    public static final <T> Observable<T> switchOnNext(@NotNull Observable<Observable<T>> switchOnNext) {
        Intrinsics.checkNotNullParameter(switchOnNext, "$this$switchOnNext");
        Observable<T> observableSwitchOnNext = Observable.switchOnNext(switchOnNext);
        Intrinsics.checkNotNullExpressionValue(observableSwitchOnNext, "Observable.switchOnNext(this)");
        return observableSwitchOnNext;
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    @NotNull
    public static final <A, B> Single<Map<A, B>> toMap(@NotNull Observable<Pair<A, B>> toMap) {
        Intrinsics.checkNotNullParameter(toMap, "$this$toMap");
        Single<Map<A, B>> single = (Single<Map<A, B>>) toMap.toMap(f.f78159p0, g.f78161p0);
        Intrinsics.checkNotNullExpressionValue(single, "toMap({ it.first }, { it.second })");
        return single;
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    @NotNull
    public static final <A, B> Single<Map<A, Collection<B>>> toMultimap(@NotNull Observable<Pair<A, B>> toMultimap) {
        Intrinsics.checkNotNullParameter(toMultimap, "$this$toMultimap");
        Single<Map<A, Collection<B>>> single = (Single<Map<A, Collection<B>>>) toMultimap.toMultimap(h.f78162p0, i.f78163p0);
        Intrinsics.checkNotNullExpressionValue(single, "toMultimap({ it.first }, { it.second })");
        return single;
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    @NotNull
    public static final Observable<Boolean> toObservable(@NotNull boolean[] toObservable) {
        Intrinsics.checkNotNullParameter(toObservable, "$this$toObservable");
        return toObservable(ArraysKt___ArraysKt.asIterable(toObservable));
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    @NotNull
    public static final <T, R> Observable<R> zip(@NotNull Iterable<? extends Observable<T>> zip, @NotNull final Function1<? super List<? extends T>, ? extends R> zipFunction) {
        Intrinsics.checkNotNullParameter(zip, "$this$zip");
        Intrinsics.checkNotNullParameter(zipFunction, "zipFunction");
        Observable<R> observableZip = Observable.zip(zip, new Function<Object[], R>() { // from class: io.reactivex.rxjava3.kotlin.ObservableKt.zip.1
            @Override // io.reactivex.rxjava3.functions.Function
            public final R apply(Object[] it) {
                Intrinsics.checkNotNullExpressionValue(it, "it");
                List listAsList = ArraysKt___ArraysJvmKt.asList(it);
                ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(listAsList, 10));
                for (T t10 : listAsList) {
                    if (t10 == null) {
                        throw new NullPointerException("null cannot be cast to non-null type T");
                    }
                    arrayList.add(t10);
                }
                return (R) zipFunction.invoke(arrayList);
            }
        });
        Intrinsics.checkNotNullExpressionValue(observableZip, "Observable.zip(this) { z…List().map { it as T }) }");
        return observableZip;
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    @NotNull
    public static final <T> Observable<T> concatAll(@NotNull Iterable<? extends ObservableSource<T>> concatAll) {
        Intrinsics.checkNotNullParameter(concatAll, "$this$concatAll");
        Observable<T> observableConcat = Observable.concat(concatAll);
        Intrinsics.checkNotNullExpressionValue(observableConcat, "Observable.concat(this)");
        return observableConcat;
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    @NotNull
    public static final Observable<Byte> toObservable(@NotNull byte[] toObservable) {
        Intrinsics.checkNotNullParameter(toObservable, "$this$toObservable");
        return toObservable(ArraysKt___ArraysKt.asIterable(toObservable));
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    @NotNull
    public static final Observable<Character> toObservable(@NotNull char[] toObservable) {
        Intrinsics.checkNotNullParameter(toObservable, "$this$toObservable");
        return toObservable(ArraysKt___ArraysKt.asIterable(toObservable));
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    @NotNull
    public static final Observable<Short> toObservable(@NotNull short[] toObservable) {
        Intrinsics.checkNotNullParameter(toObservable, "$this$toObservable");
        return toObservable(ArraysKt___ArraysKt.asIterable(toObservable));
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    @NotNull
    public static final Observable<Integer> toObservable(@NotNull int[] toObservable) {
        Intrinsics.checkNotNullParameter(toObservable, "$this$toObservable");
        return toObservable(ArraysKt___ArraysKt.asIterable(toObservable));
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    @NotNull
    public static final Observable<Long> toObservable(@NotNull long[] toObservable) {
        Intrinsics.checkNotNullParameter(toObservable, "$this$toObservable");
        return toObservable(ArraysKt___ArraysKt.asIterable(toObservable));
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    @NotNull
    public static final Observable<Float> toObservable(@NotNull float[] toObservable) {
        Intrinsics.checkNotNullParameter(toObservable, "$this$toObservable");
        return toObservable(ArraysKt___ArraysKt.asIterable(toObservable));
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    @NotNull
    public static final Observable<Double> toObservable(@NotNull double[] toObservable) {
        Intrinsics.checkNotNullParameter(toObservable, "$this$toObservable");
        return toObservable(ArraysKt___ArraysKt.asIterable(toObservable));
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    @NotNull
    public static final <T> Observable<T> toObservable(@NotNull T[] toObservable) {
        Intrinsics.checkNotNullParameter(toObservable, "$this$toObservable");
        Observable<T> observableFromArray = Observable.fromArray(Arrays.copyOf(toObservable, toObservable.length));
        Intrinsics.checkNotNullExpressionValue(observableFromArray, "Observable.fromArray(*this)");
        return observableFromArray;
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    @NotNull
    public static final Observable<Integer> toObservable(@NotNull IntProgression toObservable) {
        Intrinsics.checkNotNullParameter(toObservable, "$this$toObservable");
        if (toObservable.getStep() != 1 || ((long) toObservable.getLast()) - ((long) toObservable.getFirst()) >= Integer.MAX_VALUE) {
            Observable<Integer> observableFromIterable = Observable.fromIterable(toObservable);
            Intrinsics.checkNotNullExpressionValue(observableFromIterable, "Observable.fromIterable(this)");
            return observableFromIterable;
        }
        Observable<Integer> observableRange = Observable.range(toObservable.getFirst(), Math.max(0, (toObservable.getLast() - toObservable.getFirst()) + 1));
        Intrinsics.checkNotNullExpressionValue(observableRange, "Observable.range(first, …max(0, last - first + 1))");
        return observableRange;
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    @NotNull
    public static final <T> Observable<T> toObservable(@NotNull Iterable<? extends T> toObservable) {
        Intrinsics.checkNotNullParameter(toObservable, "$this$toObservable");
        Observable<T> observableFromIterable = Observable.fromIterable(toObservable);
        Intrinsics.checkNotNullExpressionValue(observableFromIterable, "Observable.fromIterable(this)");
        return observableFromIterable;
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    @NotNull
    public static final <T> Observable<T> toObservable(@NotNull Sequence<? extends T> toObservable) {
        Intrinsics.checkNotNullParameter(toObservable, "$this$toObservable");
        return toObservable(SequencesKt___SequencesKt.asIterable(toObservable));
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    @NotNull
    public static final <T> Observable<T> toObservable(@NotNull Iterator<? extends T> toObservable) {
        Intrinsics.checkNotNullParameter(toObservable, "$this$toObservable");
        return toObservable(new ObservableKt$toIterable$1(toObservable));
    }
}

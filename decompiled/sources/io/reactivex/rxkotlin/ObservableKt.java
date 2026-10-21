package io.reactivex.rxkotlin;

import androidx.exifinterface.media.ExifInterface;
import com.bbva.nativesettings.common.Constants;
import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.Single;
import io.reactivex.annotations.CheckReturnValue;
import io.reactivex.annotations.SchedulerSupport;
import io.reactivex.functions.Function;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TypeCastException;
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
@Metadata(d1 = {"\u0000\u0094\u0001\n\u0002\u0010\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0012\n\u0002\u0010\u0005\n\u0002\u0010\u0019\n\u0002\u0010\f\n\u0002\u0010\u0017\n\u0002\u0010\n\n\u0002\u0010\u0015\n\u0002\u0010\b\n\u0002\u0010\u0016\n\u0002\u0010\t\n\u0002\u0010\u0014\n\u0002\u0010\u0007\n\u0002\u0010\u0013\n\u0002\u0010\u0006\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010(\n\u0002\u0010\u001c\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010%\n\u0000\n\u0002\u0010\u001f\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0012\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\u0007\u001a\u0012\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0001*\u00020\u0004H\u0007\u001a\u0012\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00070\u0001*\u00020\u0006H\u0007\u001a\u0012\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\t0\u0001*\u00020\bH\u0007\u001a\u0012\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0001*\u00020\nH\u0007\u001a\u0012\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\r0\u0001*\u00020\fH\u0007\u001a\u0012\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0001*\u00020\u000eH\u0007\u001a\u0012\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00110\u0001*\u00020\u0010H\u0007\u001a)\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\b\b\u0000\u0010\u0013*\u00020\u0012*\b\u0012\u0004\u0012\u00028\u00000\u0014H\u0007¢\u0006\u0004\b\u0003\u0010\u0015\u001a\u0012\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0001*\u00020\u0016H\u0007\u001a\"\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\b\b\u0000\u0010\u0013*\u00020\u0012*\b\u0012\u0004\u0012\u00028\u00000\u0017H\u0007\u001a\"\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\b\b\u0000\u0010\u0013*\u00020\u0012*\b\u0012\u0004\u0012\u00028\u00000\u0018H\u0007\u001a\"\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\b\b\u0000\u0010\u0013*\u00020\u0012*\b\u0012\u0004\u0012\u00028\u00000\u0019H\u0007\u001a*\u0010\u001a\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\b\b\u0000\u0010\u0013*\u00020\u0012*\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u00010\u0018H\u0007\u001a*\u0010\u001b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\b\b\u0000\u0010\u0013*\u00020\u0012*\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u00010\u0018H\u0007\u001a*\u0010\u001c\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\b\b\u0000\u0010\u0013*\u00020\u0012*\u0010\u0012\f\b\u0001\u0012\b\u0012\u0004\u0012\u00028\u00000\u00180\u0001H\u0007\u001a*\u0010\u001d\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\b\b\u0000\u0010\u0013*\u00020\u0012*\u0010\u0012\f\b\u0001\u0012\b\u0012\u0004\u0012\u00028\u00000\u00180\u0001H\u0007\u001aI\u0010!\u001a\b\u0012\u0004\u0012\u00028\u00010\u0001\"\b\b\u0000\u0010\u0013*\u00020\u0012\"\b\b\u0001\u0010\u001e*\u00020\u0012*\b\u0012\u0004\u0012\u00028\u00000\u00012\u001a\b\u0004\u0010 \u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u00190\u001fH\u0087\b\u001a^\u0010'\u001a\b\u0012\u0004\u0012\u00028\u00010\u0001\"\b\b\u0000\u0010\u0013*\u00020\u0012\"\b\b\u0001\u0010\u001e*\u00020\u0012*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00010\u00182)\b\u0004\u0010&\u001a#\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00028\u00000\"¢\u0006\f\b#\u0012\b\b$\u0012\u0004\b\b(%\u0012\u0004\u0012\u00028\u00010\u001fH\u0087\b\u001a^\u0010)\u001a\b\u0012\u0004\u0012\u00028\u00010\u0001\"\b\b\u0000\u0010\u0013*\u00020\u0012\"\b\b\u0001\u0010\u001e*\u00020\u0012*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00010\u00182)\b\u0004\u0010(\u001a#\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00028\u00000\"¢\u0006\f\b#\u0012\b\b$\u0012\u0004\b\b(%\u0012\u0004\u0012\u00028\u00010\u001fH\u0087\b\u001a#\u0010*\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\n\b\u0000\u0010\u001e\u0018\u0001*\u00020\u0012*\u0006\u0012\u0002\b\u00030\u0001H\u0087\b\u001a#\u0010+\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\n\b\u0000\u0010\u001e\u0018\u0001*\u00020\u0012*\u0006\u0012\u0002\b\u00030\u0001H\u0087\b\u001a(\u0010,\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\b\b\u0000\u0010\u0013*\u00020\u0012*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00010\u0001H\u0007\u001a(\u0010-\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\b\b\u0000\u0010\u0013*\u00020\u0012*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00010\u0001H\u0007\u001a(\u0010.\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\b\b\u0000\u0010\u0013*\u00020\u0012*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00010\u0001H\u0007\u001a(\u0010/\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\b\b\u0000\u0010\u0013*\u00020\u0012*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00010\u0001H\u0007\u001aD\u00105\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010403\"\b\b\u0000\u00100*\u00020\u0012\"\b\b\u0001\u00101*\u00020\u0012*\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001020\u0001H\u0007\u001aJ\u00107\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u0001060403\"\b\b\u0000\u00100*\u00020\u0012\"\b\b\u0001\u00101*\u00020\u0012*\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001020\u0001H\u0007\u001a(\u0010-\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\b\b\u0000\u0010\u0013*\u00020\u0012*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u0000080\u0018H\u0007¨\u00069"}, d2 = {"", "Lio/reactivex/Observable;", "", "toObservable", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", ExifInterface.GPS_DIRECTION_TRUE, "", "([Ljava/lang/Object;)Lio/reactivex/Observable;", "Lkotlin/ranges/IntProgression;", "", "", "Lkotlin/sequences/Sequence;", "merge", "mergeDelayError", "flatMapIterable", "concatMapIterable", "R", "Lkotlin/Function1;", "body", "flatMapSequence", "", "Lkotlin/ParameterName;", "name", "args", "combineFunction", "combineLatest", "zipFunction", "zip", Constants.CAST, "ofType", "mergeAll", "concatAll", "switchLatest", "switchOnNext", ExifInterface.GPS_MEASUREMENT_IN_PROGRESS, "B", "Lkotlin/Pair;", "Lio/reactivex/Single;", "", "toMap", "", "toMultimap", "Lio/reactivex/ObservableSource;", "rxkotlin"}, k = 2, mv = {1, 4, 0})
public final class ObservableKt {

    /* JADX INFO: compiled from: observable.kt */
    public static final class a<T, R> implements Function<T, ObservableSource<? extends R>> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final a f78527p0 = new a();

        @Override // io.reactivex.functions.Function
        public final Object apply(Object obj) {
            return (Observable) obj;
        }
    }

    /* JADX INFO: compiled from: observable.kt */
    public static final class b implements Function {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final b f78528p0 = new b();

        @Override // io.reactivex.functions.Function
        public final Object apply(Object obj) {
            return (Iterable) obj;
        }
    }

    /* JADX INFO: compiled from: observable.kt */
    public static final class c implements Function {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final c f78529p0 = new c();

        @Override // io.reactivex.functions.Function
        public final Object apply(Object obj) {
            return (Iterable) obj;
        }
    }

    /* JADX INFO: compiled from: observable.kt */
    public static final class d<T, R> implements Function<T, ObservableSource<? extends R>> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final d f78531p0 = new d();

        @Override // io.reactivex.functions.Function
        public final Object apply(Object obj) {
            return (Observable) obj;
        }
    }

    /* JADX INFO: compiled from: observable.kt */
    public static final class e<T, R> implements Function<T, ObservableSource<? extends R>> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final e f78532p0 = new e();

        @Override // io.reactivex.functions.Function
        public final Object apply(Object obj) {
            return (Observable) obj;
        }
    }

    /* JADX INFO: compiled from: observable.kt */
    public static final class f implements Function {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final f f78533p0 = new f();

        @Override // io.reactivex.functions.Function
        public final Object apply(Object obj) {
            return ((Pair) obj).getFirst();
        }
    }

    /* JADX INFO: compiled from: observable.kt */
    public static final class g implements Function {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final g f78535p0 = new g();

        @Override // io.reactivex.functions.Function
        public final Object apply(Object obj) {
            return ((Pair) obj).getSecond();
        }
    }

    /* JADX INFO: compiled from: observable.kt */
    public static final class h implements Function {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final h f78536p0 = new h();

        @Override // io.reactivex.functions.Function
        public final Object apply(Object obj) {
            return ((Pair) obj).getFirst();
        }
    }

    /* JADX INFO: compiled from: observable.kt */
    public static final class i implements Function {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final i f78537p0 = new i();

        @Override // io.reactivex.functions.Function
        public final Object apply(Object obj) {
            return ((Pair) obj).getSecond();
        }
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    @NotNull
    public static final /* synthetic */ <R> Observable<R> cast(@NotNull Observable<?> observable) {
        Intrinsics.reifiedOperationMarker(4, "R");
        Observable<R> observable2 = (Observable<R>) observable.cast(Object.class);
        Intrinsics.checkExpressionValueIsNotNull(observable2, "cast(R::class.java)");
        return observable2;
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    @NotNull
    public static final <T, R> Observable<R> combineLatest(@NotNull Iterable<? extends Observable<T>> iterable, @NotNull final Function1<? super List<? extends T>, ? extends R> function1) {
        Observable<R> observableCombineLatest = Observable.combineLatest(iterable, new Function<Object[], R>() { // from class: io.reactivex.rxkotlin.ObservableKt.combineLatest.1
            @Override // io.reactivex.functions.Function
            @NotNull
            public final R apply(@NotNull Object[] objArr) {
                List listAsList = ArraysKt___ArraysJvmKt.asList(objArr);
                ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(listAsList, 10));
                for (T t10 : listAsList) {
                    if (t10 == null) {
                        throw new TypeCastException("null cannot be cast to non-null type T");
                    }
                    arrayList.add(t10);
                }
                return (R) function1.invoke(arrayList);
            }
        });
        Intrinsics.checkExpressionValueIsNotNull(observableCombineLatest, "Observable.combineLatest…List().map { it as T }) }");
        return observableCombineLatest;
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    @NotNull
    public static final <T> Observable<T> concatAll(@NotNull Observable<Observable<T>> observable) {
        Observable<T> observable2 = (Observable<T>) observable.concatMap(a.f78527p0);
        Intrinsics.checkExpressionValueIsNotNull(observable2, "concatMap { it }");
        return observable2;
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    @NotNull
    public static final <T> Observable<T> concatMapIterable(@NotNull Observable<? extends Iterable<? extends T>> observable) {
        Observable<T> observable2 = (Observable<T>) observable.concatMapIterable(b.f78528p0);
        Intrinsics.checkExpressionValueIsNotNull(observable2, "concatMapIterable { it }");
        return observable2;
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    @NotNull
    public static final <T> Observable<T> flatMapIterable(@NotNull Observable<? extends Iterable<? extends T>> observable) {
        Observable<T> observable2 = (Observable<T>) observable.flatMapIterable(c.f78529p0);
        Intrinsics.checkExpressionValueIsNotNull(observable2, "flatMapIterable { it }");
        return observable2;
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    @NotNull
    public static final <T, R> Observable<R> flatMapSequence(@NotNull Observable<T> observable, @NotNull final Function1<? super T, ? extends Sequence<? extends R>> function1) {
        Observable<R> observableFlatMap = observable.flatMap(new Function<T, ObservableSource<? extends R>>() { // from class: io.reactivex.rxkotlin.ObservableKt.flatMapSequence.1
            @Override // io.reactivex.functions.Function
            @NotNull
            public final Observable<R> apply(@NotNull T t10) {
                return ObservableKt.toObservable((Sequence) function1.invoke(t10));
            }
        });
        Intrinsics.checkExpressionValueIsNotNull(observableFlatMap, "flatMap { body(it).toObservable() }");
        return observableFlatMap;
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    @NotNull
    public static final <T> Observable<T> merge(@NotNull Iterable<? extends Observable<? extends T>> iterable) {
        Observable<T> observableMerge = Observable.merge(toObservable(iterable));
        Intrinsics.checkExpressionValueIsNotNull(observableMerge, "Observable.merge(this.toObservable())");
        return observableMerge;
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    @NotNull
    public static final <T> Observable<T> mergeAll(@NotNull Observable<Observable<T>> observable) {
        Observable<T> observable2 = (Observable<T>) observable.flatMap(d.f78531p0);
        Intrinsics.checkExpressionValueIsNotNull(observable2, "flatMap { it }");
        return observable2;
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    @NotNull
    public static final <T> Observable<T> mergeDelayError(@NotNull Iterable<? extends Observable<? extends T>> iterable) {
        Observable<T> observableMergeDelayError = Observable.mergeDelayError(toObservable(iterable));
        Intrinsics.checkExpressionValueIsNotNull(observableMergeDelayError, "Observable.mergeDelayError(this.toObservable())");
        return observableMergeDelayError;
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    @NotNull
    public static final /* synthetic */ <R> Observable<R> ofType(@NotNull Observable<?> observable) {
        Intrinsics.reifiedOperationMarker(4, "R");
        Observable<R> observable2 = (Observable<R>) observable.ofType(Object.class);
        Intrinsics.checkExpressionValueIsNotNull(observable2, "ofType(R::class.java)");
        return observable2;
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    @NotNull
    public static final <T> Observable<T> switchLatest(@NotNull Observable<Observable<T>> observable) {
        Observable<T> observable2 = (Observable<T>) observable.switchMap(e.f78532p0);
        Intrinsics.checkExpressionValueIsNotNull(observable2, "switchMap { it }");
        return observable2;
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    @NotNull
    public static final <T> Observable<T> switchOnNext(@NotNull Observable<Observable<T>> observable) {
        Observable<T> observableSwitchOnNext = Observable.switchOnNext(observable);
        Intrinsics.checkExpressionValueIsNotNull(observableSwitchOnNext, "Observable.switchOnNext(this)");
        return observableSwitchOnNext;
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    @NotNull
    public static final <A, B> Single<Map<A, B>> toMap(@NotNull Observable<Pair<A, B>> observable) {
        Single<Map<A, B>> single = (Single<Map<A, B>>) observable.toMap(f.f78533p0, g.f78535p0);
        Intrinsics.checkExpressionValueIsNotNull(single, "toMap({ it.first }, { it.second })");
        return single;
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    @NotNull
    public static final <A, B> Single<Map<A, Collection<B>>> toMultimap(@NotNull Observable<Pair<A, B>> observable) {
        Single<Map<A, Collection<B>>> single = (Single<Map<A, Collection<B>>>) observable.toMultimap(h.f78536p0, i.f78537p0);
        Intrinsics.checkExpressionValueIsNotNull(single, "toMultimap({ it.first }, { it.second })");
        return single;
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    @NotNull
    public static final Observable<Boolean> toObservable(@NotNull boolean[] zArr) {
        return toObservable(ArraysKt___ArraysKt.asIterable(zArr));
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    @NotNull
    public static final <T, R> Observable<R> zip(@NotNull Iterable<? extends Observable<T>> iterable, @NotNull final Function1<? super List<? extends T>, ? extends R> function1) {
        Observable<R> observableZip = Observable.zip(iterable, new Function<Object[], R>() { // from class: io.reactivex.rxkotlin.ObservableKt.zip.1
            @Override // io.reactivex.functions.Function
            @NotNull
            public final R apply(@NotNull Object[] objArr) {
                List listAsList = ArraysKt___ArraysJvmKt.asList(objArr);
                ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(listAsList, 10));
                for (T t10 : listAsList) {
                    if (t10 == null) {
                        throw new TypeCastException("null cannot be cast to non-null type T");
                    }
                    arrayList.add(t10);
                }
                return (R) function1.invoke(arrayList);
            }
        });
        Intrinsics.checkExpressionValueIsNotNull(observableZip, "Observable.zip(this) { z…List().map { it as T }) }");
        return observableZip;
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    @NotNull
    public static final <T> Observable<T> concatAll(@NotNull Iterable<? extends ObservableSource<T>> iterable) {
        Observable<T> observableConcat = Observable.concat(iterable);
        Intrinsics.checkExpressionValueIsNotNull(observableConcat, "Observable.concat(this)");
        return observableConcat;
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    @NotNull
    public static final Observable<Byte> toObservable(@NotNull byte[] bArr) {
        return toObservable(ArraysKt___ArraysKt.asIterable(bArr));
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    @NotNull
    public static final Observable<Character> toObservable(@NotNull char[] cArr) {
        return toObservable(ArraysKt___ArraysKt.asIterable(cArr));
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    @NotNull
    public static final Observable<Short> toObservable(@NotNull short[] sArr) {
        return toObservable(ArraysKt___ArraysKt.asIterable(sArr));
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    @NotNull
    public static final Observable<Integer> toObservable(@NotNull int[] iArr) {
        return toObservable(ArraysKt___ArraysKt.asIterable(iArr));
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    @NotNull
    public static final Observable<Long> toObservable(@NotNull long[] jArr) {
        return toObservable(ArraysKt___ArraysKt.asIterable(jArr));
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    @NotNull
    public static final Observable<Float> toObservable(@NotNull float[] fArr) {
        return toObservable(ArraysKt___ArraysKt.asIterable(fArr));
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    @NotNull
    public static final Observable<Double> toObservable(@NotNull double[] dArr) {
        return toObservable(ArraysKt___ArraysKt.asIterable(dArr));
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    @NotNull
    public static final <T> Observable<T> toObservable(@NotNull T[] tArr) {
        Observable<T> observableFromArray = Observable.fromArray(Arrays.copyOf(tArr, tArr.length));
        Intrinsics.checkExpressionValueIsNotNull(observableFromArray, "Observable.fromArray(*this)");
        return observableFromArray;
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    @NotNull
    public static final Observable<Integer> toObservable(@NotNull IntProgression intProgression) {
        if (intProgression.getStep() != 1 || ((long) intProgression.getLast()) - ((long) intProgression.getFirst()) >= Integer.MAX_VALUE) {
            Observable<Integer> observableFromIterable = Observable.fromIterable(intProgression);
            Intrinsics.checkExpressionValueIsNotNull(observableFromIterable, "Observable.fromIterable(this)");
            return observableFromIterable;
        }
        Observable<Integer> observableRange = Observable.range(intProgression.getFirst(), Math.max(0, (intProgression.getLast() - intProgression.getFirst()) + 1));
        Intrinsics.checkExpressionValueIsNotNull(observableRange, "Observable.range(first, …max(0, last - first + 1))");
        return observableRange;
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    @NotNull
    public static final <T> Observable<T> toObservable(@NotNull Iterable<? extends T> iterable) {
        Observable<T> observableFromIterable = Observable.fromIterable(iterable);
        Intrinsics.checkExpressionValueIsNotNull(observableFromIterable, "Observable.fromIterable(this)");
        return observableFromIterable;
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    @NotNull
    public static final <T> Observable<T> toObservable(@NotNull Sequence<? extends T> sequence) {
        return toObservable(SequencesKt___SequencesKt.asIterable(sequence));
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    @NotNull
    public static final <T> Observable<T> toObservable(@NotNull Iterator<? extends T> it) {
        return toObservable(new ObservableKt$toIterable$1(it));
    }
}

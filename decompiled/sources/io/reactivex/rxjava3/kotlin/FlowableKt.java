package io.reactivex.rxjava3.kotlin;

import androidx.exifinterface.media.ExifInterface;
import com.bbva.nativesettings.common.Constants;
import io.reactivex.rxjava3.annotations.BackpressureKind;
import io.reactivex.rxjava3.annotations.BackpressureSupport;
import io.reactivex.rxjava3.annotations.CheckReturnValue;
import io.reactivex.rxjava3.annotations.SchedulerSupport;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.functions.BiFunction;
import io.reactivex.rxjava3.functions.Function;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Triple;
import kotlin.collections.ArraysKt___ArraysJvmKt;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntProgression;
import kotlin.sequences.Sequence;
import kotlin.sequences.SequencesKt___SequencesKt;
import org.jetbrains.annotations.NotNull;
import org.reactivestreams.Publisher;

/* JADX INFO: compiled from: flowable.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000 \u0001\n\u0002\u0010\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0012\n\u0002\u0010\u0005\n\u0002\u0010\u0019\n\u0002\u0010\f\n\u0002\u0010\u0017\n\u0002\u0010\n\n\u0002\u0010\u0015\n\u0002\u0010\b\n\u0002\u0010\u0016\n\u0002\u0010\t\n\u0002\u0010\u0014\n\u0002\u0010\u0007\n\u0002\u0010\u0013\n\u0002\u0010\u0006\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010(\n\u0002\u0010\u001c\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0010%\n\u0000\n\u0002\u0010\u001f\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0012\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\u0007\u001a\u0012\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0001*\u00020\u0004H\u0007\u001a\u0012\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00070\u0001*\u00020\u0006H\u0007\u001a\u0012\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\t0\u0001*\u00020\bH\u0007\u001a\u0012\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0001*\u00020\nH\u0007\u001a\u0012\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\r0\u0001*\u00020\fH\u0007\u001a\u0012\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0001*\u00020\u000eH\u0007\u001a\u0012\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00110\u0001*\u00020\u0010H\u0007\u001a)\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\b\b\u0000\u0010\u0013*\u00020\u0012*\b\u0012\u0004\u0012\u00028\u00000\u0014H\u0007¢\u0006\u0004\b\u0003\u0010\u0015\u001a\u0012\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0001*\u00020\u0016H\u0007\u001a \u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\b\b\u0000\u0010\u0013*\u00020\u0012*\b\u0012\u0004\u0012\u00028\u00000\u0017\u001a\"\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\b\b\u0000\u0010\u0013*\u00020\u0012*\b\u0012\u0004\u0012\u00028\u00000\u0018H\u0007\u001a \u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\b\b\u0000\u0010\u0013*\u00020\u0012*\b\u0012\u0004\u0012\u00028\u00000\u0019\u001a*\u0010\u001a\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\b\b\u0000\u0010\u0013*\u00020\u0012*\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u00010\u0018H\u0007\u001a*\u0010\u001b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\b\b\u0000\u0010\u0013*\u00020\u0012*\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u00010\u0018H\u0007\u001aL\u0010\u001f\u001a\b\u0012\u0004\u0012\u00028\u00010\u0001\"\b\b\u0000\u0010\u0013*\u00020\u0012\"\b\b\u0001\u0010\u001c*\u00020\u0012*\b\u0012\u0004\u0012\u00028\u00000\u00012\u001a\b\u0004\u0010\u001e\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u00190\u001dH\u0087\bø\u0001\u0000\u001aa\u0010%\u001a\b\u0012\u0004\u0012\u00028\u00010\u0001\"\b\b\u0000\u0010\u0013*\u00020\u0012\"\b\b\u0001\u0010\u001c*\u00020\u0012*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00010\u00182)\b\u0004\u0010$\u001a#\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00028\u00000 ¢\u0006\f\b!\u0012\b\b\"\u0012\u0004\b\b(#\u0012\u0004\u0012\u00028\u00010\u001dH\u0087\bø\u0001\u0000\u001aa\u0010'\u001a\b\u0012\u0004\u0012\u00028\u00010\u0001\"\b\b\u0000\u0010\u0013*\u00020\u0012\"\b\b\u0001\u0010\u001c*\u00020\u0012*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00010\u00182)\b\u0004\u0010&\u001a#\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00028\u00000 ¢\u0006\f\b!\u0012\b\b\"\u0012\u0004\b\b(#\u0012\u0004\u0012\u00028\u00010\u001dH\u0087\bø\u0001\u0000\u001a#\u0010(\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\n\b\u0000\u0010\u001c\u0018\u0001*\u00020\u0012*\u0006\u0012\u0002\b\u00030\u0001H\u0087\b\u001a#\u0010)\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\n\b\u0000\u0010\u001c\u0018\u0001*\u00020\u0012*\u0006\u0012\u0002\b\u00030\u0001H\u0087\b\u001aF\u0010%\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010+0\u0001\"\b\b\u0000\u0010\u0013*\u00020\u0012\"\b\b\u0001\u0010\u001c*\u00020\u0012*\b\u0012\u0004\u0012\u00028\u00000\u00012\f\u0010*\u001a\b\u0012\u0004\u0012\u00028\u00010\u0001H\u0007\u001ad\u0010%\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020/0\u0001\"\b\b\u0000\u0010\u0013*\u00020\u0012\"\b\b\u0001\u0010\u001c*\u00020\u0012\"\b\b\u0002\u0010,*\u00020\u0012*\b\u0012\u0004\u0012\u00028\u00000\u00012\f\u0010-\u001a\b\u0012\u0004\u0012\u00028\u00010\u00012\f\u0010.\u001a\b\u0012\u0004\u0012\u00028\u00020\u0001H\u0007\u001a(\u00100\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\b\b\u0000\u0010\u0013*\u00020\u0012*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00010\u0001H\u0007\u001a(\u00101\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\b\b\u0000\u0010\u0013*\u00020\u0012*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00010\u0001H\u0007\u001a(\u00102\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\b\b\u0000\u0010\u0013*\u00020\u0012*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00010\u0001H\u0007\u001a(\u00103\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\b\b\u0000\u0010\u0013*\u00020\u0012*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00010\u0001H\u0007\u001aD\u00108\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010706\"\b\b\u0000\u00104*\u00020\u0012\"\b\b\u0001\u00105*\u00020\u0012*\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010+0\u0001H\u0007\u001aJ\u0010:\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u0001090706\"\b\b\u0000\u00104*\u00020\u0012\"\b\b\u0001\u00105*\u00020\u0012*\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010+0\u0001H\u0007\u001a(\u00101\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\b\b\u0000\u0010\u0013*\u00020\u0012*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000;0\u0018H\u0007\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006<"}, d2 = {"", "Lio/reactivex/rxjava3/core/Flowable;", "", "toFlowable", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", ExifInterface.GPS_DIRECTION_TRUE, "", "([Ljava/lang/Object;)Lio/reactivex/rxjava3/core/Flowable;", "Lkotlin/ranges/IntProgression;", "", "", "Lkotlin/sequences/Sequence;", "merge", "mergeDelayError", "R", "Lkotlin/Function1;", "body", "flatMapSequence", "", "Lkotlin/ParameterName;", "name", "args", "combineFunction", "combineLatest", "zipFunction", "zip", Constants.CAST, "ofType", "flowable", "Lkotlin/Pair;", "U", "flowable1", "flowable2", "Lkotlin/Triple;", "mergeAll", "concatAll", "switchLatest", "switchOnNext", ExifInterface.GPS_MEASUREMENT_IN_PROGRESS, "B", "Lio/reactivex/rxjava3/core/Single;", "", "toMap", "", "toMultimap", "Lorg/reactivestreams/Publisher;", "rxkotlin"}, k = 2, mv = {1, 4, 0})
public final class FlowableKt {

    /* JADX INFO: Add missing generic type declarations: [R, T] */
    /* JADX INFO: compiled from: flowable.kt */
    public static final /* synthetic */ class a<R, T> extends FunctionReferenceImpl implements Function2<T, R, Pair<? extends T, ? extends R>> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final a f78097p0 = new a();

        public a() {
            super(2, Pair.class, "<init>", "<init>(Ljava/lang/Object;Ljava/lang/Object;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return new Pair(obj, obj2);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [R, T, U] */
    /* JADX INFO: compiled from: flowable.kt */
    public static final /* synthetic */ class b<R, T, U> extends FunctionReferenceImpl implements Function3<T, R, U, Triple<? extends T, ? extends R, ? extends U>> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final b f78098p0 = new b();

        public b() {
            super(3, Triple.class, "<init>", "<init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function3
        public final Object invoke(Object obj, Object obj2, Object obj3) {
            return new Triple(obj, obj2, obj3);
        }
    }

    /* JADX INFO: compiled from: flowable.kt */
    public static final class c<T, R> implements Function<Flowable<T>, Publisher<? extends T>> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final c f78099p0 = new c();

        @Override // io.reactivex.rxjava3.functions.Function
        public final Object apply(Object obj) {
            return (Flowable) obj;
        }
    }

    /* JADX INFO: compiled from: flowable.kt */
    public static final class d<T, R> implements Function<Flowable<T>, Publisher<? extends T>> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final d f78101p0 = new d();

        @Override // io.reactivex.rxjava3.functions.Function
        public final Object apply(Object obj) {
            return (Flowable) obj;
        }
    }

    /* JADX INFO: compiled from: flowable.kt */
    public static final class e<T, R> implements Function<Flowable<T>, Publisher<? extends T>> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final e f78102p0 = new e();

        @Override // io.reactivex.rxjava3.functions.Function
        public final Object apply(Object obj) {
            return (Flowable) obj;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [A, B] */
    /* JADX INFO: compiled from: flowable.kt */
    public static final class f<T, R, A, B> implements Function<Pair<? extends A, ? extends B>, A> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final f f78103p0 = new f();

        @Override // io.reactivex.rxjava3.functions.Function
        public final Object apply(Object obj) {
            return ((Pair) obj).getFirst();
        }
    }

    /* JADX INFO: Add missing generic type declarations: [A, B] */
    /* JADX INFO: compiled from: flowable.kt */
    public static final class g<T, R, A, B> implements Function<Pair<? extends A, ? extends B>, B> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final g f78105p0 = new g();

        @Override // io.reactivex.rxjava3.functions.Function
        public final Object apply(Object obj) {
            return ((Pair) obj).getSecond();
        }
    }

    /* JADX INFO: Add missing generic type declarations: [A, B] */
    /* JADX INFO: compiled from: flowable.kt */
    public static final class h<T, R, A, B> implements Function<Pair<? extends A, ? extends B>, A> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final h f78106p0 = new h();

        @Override // io.reactivex.rxjava3.functions.Function
        public final Object apply(Object obj) {
            return ((Pair) obj).getFirst();
        }
    }

    /* JADX INFO: Add missing generic type declarations: [A, B] */
    /* JADX INFO: compiled from: flowable.kt */
    public static final class i<T, R, A, B> implements Function<Pair<? extends A, ? extends B>, B> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final i f78107p0 = new i();

        @Override // io.reactivex.rxjava3.functions.Function
        public final Object apply(Object obj) {
            return ((Pair) obj).getSecond();
        }
    }

    @CheckReturnValue
    @NotNull
    @BackpressureSupport(BackpressureKind.PASS_THROUGH)
    @SchedulerSupport("none")
    public static final /* synthetic */ <R> Flowable<R> cast(@NotNull Flowable<?> cast) {
        Intrinsics.checkNotNullParameter(cast, "$this$cast");
        Intrinsics.reifiedOperationMarker(4, "R");
        Flowable<R> flowable = (Flowable<R>) cast.cast(Object.class);
        Intrinsics.checkNotNullExpressionValue(flowable, "cast(R::class.java)");
        return flowable;
    }

    @CheckReturnValue
    @NotNull
    @BackpressureSupport(BackpressureKind.FULL)
    @SchedulerSupport("none")
    public static final <T, R> Flowable<R> combineLatest(@NotNull Iterable<? extends Flowable<T>> combineLatest, @NotNull final Function1<? super List<? extends T>, ? extends R> combineFunction) {
        Intrinsics.checkNotNullParameter(combineLatest, "$this$combineLatest");
        Intrinsics.checkNotNullParameter(combineFunction, "combineFunction");
        Flowable<R> flowableCombineLatest = Flowable.combineLatest(combineLatest, new Function<Object[], R>() { // from class: io.reactivex.rxjava3.kotlin.FlowableKt.combineLatest.1
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
        Intrinsics.checkNotNullExpressionValue(flowableCombineLatest, "Flowable.combineLatest(t…List().map { it as T }) }");
        return flowableCombineLatest;
    }

    @CheckReturnValue
    @NotNull
    @BackpressureSupport(BackpressureKind.FULL)
    @SchedulerSupport("none")
    public static final <T> Flowable<T> concatAll(@NotNull Flowable<Flowable<T>> concatAll) {
        Intrinsics.checkNotNullParameter(concatAll, "$this$concatAll");
        Flowable<T> flowable = (Flowable<T>) concatAll.concatMap(c.f78099p0);
        Intrinsics.checkNotNullExpressionValue(flowable, "concatMap { it }");
        return flowable;
    }

    @CheckReturnValue
    @NotNull
    @BackpressureSupport(BackpressureKind.FULL)
    @SchedulerSupport("none")
    public static final <T, R> Flowable<R> flatMapSequence(@NotNull Flowable<T> flatMapSequence, @NotNull final Function1<? super T, ? extends Sequence<? extends R>> body) {
        Intrinsics.checkNotNullParameter(flatMapSequence, "$this$flatMapSequence");
        Intrinsics.checkNotNullParameter(body, "body");
        Flowable<R> flowableFlatMap = flatMapSequence.flatMap(new Function<T, Publisher<? extends R>>() { // from class: io.reactivex.rxjava3.kotlin.FlowableKt.flatMapSequence.1
            @Override // io.reactivex.rxjava3.functions.Function
            public final Publisher<? extends R> apply(T it) {
                Intrinsics.checkNotNullExpressionValue(it, "it");
                return FlowableKt.toFlowable((Sequence) body.invoke(it));
            }
        });
        Intrinsics.checkNotNullExpressionValue(flowableFlatMap, "flatMap { body(it).toFlowable() }");
        return flowableFlatMap;
    }

    @CheckReturnValue
    @NotNull
    @BackpressureSupport(BackpressureKind.FULL)
    @SchedulerSupport("none")
    public static final <T> Flowable<T> merge(@NotNull Iterable<? extends Flowable<? extends T>> merge) {
        Intrinsics.checkNotNullParameter(merge, "$this$merge");
        Flowable<T> flowableMerge = Flowable.merge(toFlowable(merge));
        Intrinsics.checkNotNullExpressionValue(flowableMerge, "Flowable.merge(this.toFlowable())");
        return flowableMerge;
    }

    @CheckReturnValue
    @NotNull
    @BackpressureSupport(BackpressureKind.FULL)
    @SchedulerSupport("none")
    public static final <T> Flowable<T> mergeAll(@NotNull Flowable<Flowable<T>> mergeAll) {
        Intrinsics.checkNotNullParameter(mergeAll, "$this$mergeAll");
        Flowable<T> flowable = (Flowable<T>) mergeAll.flatMap(d.f78101p0);
        Intrinsics.checkNotNullExpressionValue(flowable, "flatMap { it }");
        return flowable;
    }

    @CheckReturnValue
    @NotNull
    @BackpressureSupport(BackpressureKind.FULL)
    @SchedulerSupport("none")
    public static final <T> Flowable<T> mergeDelayError(@NotNull Iterable<? extends Flowable<? extends T>> mergeDelayError) {
        Intrinsics.checkNotNullParameter(mergeDelayError, "$this$mergeDelayError");
        Flowable<T> flowableMergeDelayError = Flowable.mergeDelayError(toFlowable(mergeDelayError));
        Intrinsics.checkNotNullExpressionValue(flowableMergeDelayError, "Flowable.mergeDelayError(this.toFlowable())");
        return flowableMergeDelayError;
    }

    @CheckReturnValue
    @NotNull
    @BackpressureSupport(BackpressureKind.PASS_THROUGH)
    @SchedulerSupport("none")
    public static final /* synthetic */ <R> Flowable<R> ofType(@NotNull Flowable<?> ofType) {
        Intrinsics.checkNotNullParameter(ofType, "$this$ofType");
        Intrinsics.reifiedOperationMarker(4, "R");
        Flowable<R> flowable = (Flowable<R>) ofType.ofType(Object.class);
        Intrinsics.checkNotNullExpressionValue(flowable, "ofType(R::class.java)");
        return flowable;
    }

    @CheckReturnValue
    @NotNull
    @BackpressureSupport(BackpressureKind.FULL)
    @SchedulerSupport("none")
    public static final <T> Flowable<T> switchLatest(@NotNull Flowable<Flowable<T>> switchLatest) {
        Intrinsics.checkNotNullParameter(switchLatest, "$this$switchLatest");
        Flowable<T> flowable = (Flowable<T>) switchLatest.switchMap(e.f78102p0);
        Intrinsics.checkNotNullExpressionValue(flowable, "switchMap { it }");
        return flowable;
    }

    @CheckReturnValue
    @NotNull
    @BackpressureSupport(BackpressureKind.FULL)
    @SchedulerSupport("none")
    public static final <T> Flowable<T> switchOnNext(@NotNull Flowable<Flowable<T>> switchOnNext) {
        Intrinsics.checkNotNullParameter(switchOnNext, "$this$switchOnNext");
        Flowable<T> flowableSwitchOnNext = Flowable.switchOnNext(switchOnNext);
        Intrinsics.checkNotNullExpressionValue(flowableSwitchOnNext, "Flowable.switchOnNext(this)");
        return flowableSwitchOnNext;
    }

    @CheckReturnValue
    @NotNull
    public static final Flowable<Boolean> toFlowable(@NotNull boolean[] toFlowable) {
        Intrinsics.checkNotNullParameter(toFlowable, "$this$toFlowable");
        return toFlowable(ArraysKt___ArraysKt.asIterable(toFlowable));
    }

    @CheckReturnValue
    @NotNull
    @BackpressureSupport(BackpressureKind.UNBOUNDED_IN)
    @SchedulerSupport("none")
    public static final <A, B> Single<Map<A, B>> toMap(@NotNull Flowable<Pair<A, B>> toMap) {
        Intrinsics.checkNotNullParameter(toMap, "$this$toMap");
        Single<Map<A, B>> single = (Single<Map<A, B>>) toMap.toMap(f.f78103p0, g.f78105p0);
        Intrinsics.checkNotNullExpressionValue(single, "toMap({ it.first }, { it.second })");
        return single;
    }

    @CheckReturnValue
    @NotNull
    @BackpressureSupport(BackpressureKind.UNBOUNDED_IN)
    @SchedulerSupport("none")
    public static final <A, B> Single<Map<A, Collection<B>>> toMultimap(@NotNull Flowable<Pair<A, B>> toMultimap) {
        Intrinsics.checkNotNullParameter(toMultimap, "$this$toMultimap");
        Single<Map<A, Collection<B>>> single = (Single<Map<A, Collection<B>>>) toMultimap.toMultimap(h.f78106p0, i.f78107p0);
        Intrinsics.checkNotNullExpressionValue(single, "toMultimap({ it.first }, { it.second })");
        return single;
    }

    @CheckReturnValue
    @NotNull
    @BackpressureSupport(BackpressureKind.FULL)
    @SchedulerSupport("none")
    public static final <T, R> Flowable<R> zip(@NotNull Iterable<? extends Flowable<T>> zip, @NotNull final Function1<? super List<? extends T>, ? extends R> zipFunction) {
        Intrinsics.checkNotNullParameter(zip, "$this$zip");
        Intrinsics.checkNotNullParameter(zipFunction, "zipFunction");
        Flowable<R> flowableZip = Flowable.zip(zip, new Function<Object[], R>() { // from class: io.reactivex.rxjava3.kotlin.FlowableKt.zip.1
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
        Intrinsics.checkNotNullExpressionValue(flowableZip, "Flowable.zip(this) { zip…List().map { it as T }) }");
        return flowableZip;
    }

    @CheckReturnValue
    @NotNull
    @BackpressureSupport(BackpressureKind.FULL)
    @SchedulerSupport("none")
    public static final <T, R> Flowable<Pair<T, R>> combineLatest(@NotNull Flowable<T> combineLatest, @NotNull Flowable<R> flowable) {
        Intrinsics.checkNotNullParameter(combineLatest, "$this$combineLatest");
        Intrinsics.checkNotNullParameter(flowable, "flowable");
        a aVar = a.f78097p0;
        Object bVar = aVar;
        if (aVar != null) {
            bVar = new uj.b(aVar);
        }
        Flowable<Pair<T, R>> flowableCombineLatest = Flowable.combineLatest(combineLatest, flowable, (BiFunction) bVar);
        Intrinsics.checkNotNullExpressionValue(flowableCombineLatest, "Flowable.combineLatest(t…able, BiFunction(::Pair))");
        return flowableCombineLatest;
    }

    @CheckReturnValue
    @NotNull
    @BackpressureSupport(BackpressureKind.FULL)
    @SchedulerSupport("none")
    public static final <T> Flowable<T> concatAll(@NotNull Iterable<? extends Publisher<T>> concatAll) {
        Intrinsics.checkNotNullParameter(concatAll, "$this$concatAll");
        Flowable<T> flowableConcat = Flowable.concat(concatAll);
        Intrinsics.checkNotNullExpressionValue(flowableConcat, "Flowable.concat(this)");
        return flowableConcat;
    }

    @CheckReturnValue
    @NotNull
    public static final Flowable<Byte> toFlowable(@NotNull byte[] toFlowable) {
        Intrinsics.checkNotNullParameter(toFlowable, "$this$toFlowable");
        return toFlowable(ArraysKt___ArraysKt.asIterable(toFlowable));
    }

    @CheckReturnValue
    @NotNull
    @BackpressureSupport(BackpressureKind.FULL)
    @SchedulerSupport("none")
    public static final <T, R, U> Flowable<Triple<T, R, U>> combineLatest(@NotNull Flowable<T> combineLatest, @NotNull Flowable<R> flowable1, @NotNull Flowable<U> flowable2) {
        Intrinsics.checkNotNullParameter(combineLatest, "$this$combineLatest");
        Intrinsics.checkNotNullParameter(flowable1, "flowable1");
        Intrinsics.checkNotNullParameter(flowable2, "flowable2");
        b bVar = b.f78098p0;
        Object cVar = bVar;
        if (bVar != null) {
            cVar = new uj.c(bVar);
        }
        Flowable<Triple<T, R, U>> flowableCombineLatest = Flowable.combineLatest(combineLatest, flowable1, flowable2, (io.reactivex.rxjava3.functions.Function3) cVar);
        Intrinsics.checkNotNullExpressionValue(flowableCombineLatest, "Flowable.combineLatest(t…le2, Function3(::Triple))");
        return flowableCombineLatest;
    }

    @CheckReturnValue
    @NotNull
    public static final Flowable<Character> toFlowable(@NotNull char[] toFlowable) {
        Intrinsics.checkNotNullParameter(toFlowable, "$this$toFlowable");
        return toFlowable(ArraysKt___ArraysKt.asIterable(toFlowable));
    }

    @CheckReturnValue
    @NotNull
    public static final Flowable<Short> toFlowable(@NotNull short[] toFlowable) {
        Intrinsics.checkNotNullParameter(toFlowable, "$this$toFlowable");
        return toFlowable(ArraysKt___ArraysKt.asIterable(toFlowable));
    }

    @CheckReturnValue
    @NotNull
    public static final Flowable<Integer> toFlowable(@NotNull int[] toFlowable) {
        Intrinsics.checkNotNullParameter(toFlowable, "$this$toFlowable");
        return toFlowable(ArraysKt___ArraysKt.asIterable(toFlowable));
    }

    @CheckReturnValue
    @NotNull
    public static final Flowable<Long> toFlowable(@NotNull long[] toFlowable) {
        Intrinsics.checkNotNullParameter(toFlowable, "$this$toFlowable");
        return toFlowable(ArraysKt___ArraysKt.asIterable(toFlowable));
    }

    @CheckReturnValue
    @NotNull
    public static final Flowable<Float> toFlowable(@NotNull float[] toFlowable) {
        Intrinsics.checkNotNullParameter(toFlowable, "$this$toFlowable");
        return toFlowable(ArraysKt___ArraysKt.asIterable(toFlowable));
    }

    @CheckReturnValue
    @NotNull
    public static final Flowable<Double> toFlowable(@NotNull double[] toFlowable) {
        Intrinsics.checkNotNullParameter(toFlowable, "$this$toFlowable");
        return toFlowable(ArraysKt___ArraysKt.asIterable(toFlowable));
    }

    @CheckReturnValue
    @NotNull
    @BackpressureSupport(BackpressureKind.FULL)
    @SchedulerSupport("none")
    public static final <T> Flowable<T> toFlowable(@NotNull T[] toFlowable) {
        Intrinsics.checkNotNullParameter(toFlowable, "$this$toFlowable");
        Flowable<T> flowableFromArray = Flowable.fromArray(Arrays.copyOf(toFlowable, toFlowable.length));
        Intrinsics.checkNotNullExpressionValue(flowableFromArray, "Flowable.fromArray(*this)");
        return flowableFromArray;
    }

    @CheckReturnValue
    @NotNull
    @BackpressureSupport(BackpressureKind.FULL)
    @SchedulerSupport("none")
    public static final Flowable<Integer> toFlowable(@NotNull IntProgression toFlowable) {
        Intrinsics.checkNotNullParameter(toFlowable, "$this$toFlowable");
        if (toFlowable.getStep() != 1 || ((long) toFlowable.getLast()) - ((long) toFlowable.getFirst()) >= Integer.MAX_VALUE) {
            Flowable<Integer> flowableFromIterable = Flowable.fromIterable(toFlowable);
            Intrinsics.checkNotNullExpressionValue(flowableFromIterable, "Flowable.fromIterable(this)");
            return flowableFromIterable;
        }
        Flowable<Integer> flowableRange = Flowable.range(toFlowable.getFirst(), Math.max(0, (toFlowable.getLast() - toFlowable.getFirst()) + 1));
        Intrinsics.checkNotNullExpressionValue(flowableRange, "Flowable.range(first, Ma…max(0, last - first + 1))");
        return flowableRange;
    }

    @CheckReturnValue
    @NotNull
    @BackpressureSupport(BackpressureKind.FULL)
    @SchedulerSupport("none")
    public static final <T> Flowable<T> toFlowable(@NotNull Iterable<? extends T> toFlowable) {
        Intrinsics.checkNotNullParameter(toFlowable, "$this$toFlowable");
        Flowable<T> flowableFromIterable = Flowable.fromIterable(toFlowable);
        Intrinsics.checkNotNullExpressionValue(flowableFromIterable, "Flowable.fromIterable(this)");
        return flowableFromIterable;
    }

    @NotNull
    public static final <T> Flowable<T> toFlowable(@NotNull Sequence<? extends T> toFlowable) {
        Intrinsics.checkNotNullParameter(toFlowable, "$this$toFlowable");
        return toFlowable(SequencesKt___SequencesKt.asIterable(toFlowable));
    }

    @NotNull
    public static final <T> Flowable<T> toFlowable(@NotNull Iterator<? extends T> toFlowable) {
        Intrinsics.checkNotNullParameter(toFlowable, "$this$toFlowable");
        return toFlowable(new FlowableKt$toIterable$1(toFlowable));
    }
}

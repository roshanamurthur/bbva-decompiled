package io.reactivex.rxkotlin;

import androidx.exifinterface.media.ExifInterface;
import com.bbva.nativesettings.common.Constants;
import io.reactivex.Flowable;
import io.reactivex.Single;
import io.reactivex.annotations.BackpressureKind;
import io.reactivex.annotations.BackpressureSupport;
import io.reactivex.annotations.CheckReturnValue;
import io.reactivex.annotations.SchedulerSupport;
import io.reactivex.functions.BiFunction;
import io.reactivex.functions.Function;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Triple;
import kotlin.TypeCastException;
import kotlin.collections.ArraysKt___ArraysJvmKt;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.FunctionReference;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.ranges.IntProgression;
import kotlin.reflect.KDeclarationContainer;
import kotlin.sequences.Sequence;
import kotlin.sequences.SequencesKt___SequencesKt;
import org.jetbrains.annotations.NotNull;
import org.reactivestreams.Publisher;

/* JADX INFO: compiled from: flowable.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000 \u0001\n\u0002\u0010\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0012\n\u0002\u0010\u0005\n\u0002\u0010\u0019\n\u0002\u0010\f\n\u0002\u0010\u0017\n\u0002\u0010\n\n\u0002\u0010\u0015\n\u0002\u0010\b\n\u0002\u0010\u0016\n\u0002\u0010\t\n\u0002\u0010\u0014\n\u0002\u0010\u0007\n\u0002\u0010\u0013\n\u0002\u0010\u0006\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010(\n\u0002\u0010\u001c\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0010%\n\u0000\n\u0002\u0010\u001f\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0012\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\u0007\u001a\u0012\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0001*\u00020\u0004H\u0007\u001a\u0012\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00070\u0001*\u00020\u0006H\u0007\u001a\u0012\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\t0\u0001*\u00020\bH\u0007\u001a\u0012\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0001*\u00020\nH\u0007\u001a\u0012\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\r0\u0001*\u00020\fH\u0007\u001a\u0012\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0001*\u00020\u000eH\u0007\u001a\u0012\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00110\u0001*\u00020\u0010H\u0007\u001a)\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\b\b\u0000\u0010\u0013*\u00020\u0012*\b\u0012\u0004\u0012\u00028\u00000\u0014H\u0007¢\u0006\u0004\b\u0003\u0010\u0015\u001a\u0012\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0001*\u00020\u0016H\u0007\u001a \u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\b\b\u0000\u0010\u0013*\u00020\u0012*\b\u0012\u0004\u0012\u00028\u00000\u0017\u001a\"\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\b\b\u0000\u0010\u0013*\u00020\u0012*\b\u0012\u0004\u0012\u00028\u00000\u0018H\u0007\u001a \u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\b\b\u0000\u0010\u0013*\u00020\u0012*\b\u0012\u0004\u0012\u00028\u00000\u0019\u001a*\u0010\u001a\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\b\b\u0000\u0010\u0013*\u00020\u0012*\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u00010\u0018H\u0007\u001a*\u0010\u001b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\b\b\u0000\u0010\u0013*\u00020\u0012*\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u00010\u0018H\u0007\u001aI\u0010\u001f\u001a\b\u0012\u0004\u0012\u00028\u00010\u0001\"\b\b\u0000\u0010\u0013*\u00020\u0012\"\b\b\u0001\u0010\u001c*\u00020\u0012*\b\u0012\u0004\u0012\u00028\u00000\u00012\u001a\b\u0004\u0010\u001e\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u00190\u001dH\u0087\b\u001a^\u0010%\u001a\b\u0012\u0004\u0012\u00028\u00010\u0001\"\b\b\u0000\u0010\u0013*\u00020\u0012\"\b\b\u0001\u0010\u001c*\u00020\u0012*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00010\u00182)\b\u0004\u0010$\u001a#\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00028\u00000 ¢\u0006\f\b!\u0012\b\b\"\u0012\u0004\b\b(#\u0012\u0004\u0012\u00028\u00010\u001dH\u0087\b\u001a^\u0010'\u001a\b\u0012\u0004\u0012\u00028\u00010\u0001\"\b\b\u0000\u0010\u0013*\u00020\u0012\"\b\b\u0001\u0010\u001c*\u00020\u0012*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00010\u00182)\b\u0004\u0010&\u001a#\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00028\u00000 ¢\u0006\f\b!\u0012\b\b\"\u0012\u0004\b\b(#\u0012\u0004\u0012\u00028\u00010\u001dH\u0087\b\u001a#\u0010(\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\n\b\u0000\u0010\u001c\u0018\u0001*\u00020\u0012*\u0006\u0012\u0002\b\u00030\u0001H\u0087\b\u001a#\u0010)\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\n\b\u0000\u0010\u001c\u0018\u0001*\u00020\u0012*\u0006\u0012\u0002\b\u00030\u0001H\u0087\b\u001aF\u0010%\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010+0\u0001\"\b\b\u0000\u0010\u0013*\u00020\u0012\"\b\b\u0001\u0010\u001c*\u00020\u0012*\b\u0012\u0004\u0012\u00028\u00000\u00012\f\u0010*\u001a\b\u0012\u0004\u0012\u00028\u00010\u0001H\u0007\u001ad\u0010%\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020/0\u0001\"\b\b\u0000\u0010\u0013*\u00020\u0012\"\b\b\u0001\u0010\u001c*\u00020\u0012\"\b\b\u0002\u0010,*\u00020\u0012*\b\u0012\u0004\u0012\u00028\u00000\u00012\f\u0010-\u001a\b\u0012\u0004\u0012\u00028\u00010\u00012\f\u0010.\u001a\b\u0012\u0004\u0012\u00028\u00020\u0001H\u0007\u001a(\u00100\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\b\b\u0000\u0010\u0013*\u00020\u0012*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00010\u0001H\u0007\u001a(\u00101\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\b\b\u0000\u0010\u0013*\u00020\u0012*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00010\u0001H\u0007\u001a(\u00102\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\b\b\u0000\u0010\u0013*\u00020\u0012*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00010\u0001H\u0007\u001a(\u00103\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\b\b\u0000\u0010\u0013*\u00020\u0012*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00010\u0001H\u0007\u001aD\u00108\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010706\"\b\b\u0000\u00104*\u00020\u0012\"\b\b\u0001\u00105*\u00020\u0012*\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010+0\u0001H\u0007\u001aJ\u0010:\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u0001090706\"\b\b\u0000\u00104*\u00020\u0012\"\b\b\u0001\u00105*\u00020\u0012*\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010+0\u0001H\u0007\u001a(\u00101\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\b\b\u0000\u0010\u0013*\u00020\u0012*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000;0\u0018H\u0007¨\u0006<"}, d2 = {"", "Lio/reactivex/Flowable;", "", "toFlowable", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", ExifInterface.GPS_DIRECTION_TRUE, "", "([Ljava/lang/Object;)Lio/reactivex/Flowable;", "Lkotlin/ranges/IntProgression;", "", "", "Lkotlin/sequences/Sequence;", "merge", "mergeDelayError", "R", "Lkotlin/Function1;", "body", "flatMapSequence", "", "Lkotlin/ParameterName;", "name", "args", "combineFunction", "combineLatest", "zipFunction", "zip", Constants.CAST, "ofType", "flowable", "Lkotlin/Pair;", "U", "flowable1", "flowable2", "Lkotlin/Triple;", "mergeAll", "concatAll", "switchLatest", "switchOnNext", ExifInterface.GPS_MEASUREMENT_IN_PROGRESS, "B", "Lio/reactivex/Single;", "", "toMap", "", "toMultimap", "Lorg/reactivestreams/Publisher;", "rxkotlin"}, k = 2, mv = {1, 4, 0})
public final class FlowableKt {

    /* JADX INFO: Add missing generic type declarations: [R, T] */
    /* JADX INFO: compiled from: flowable.kt */
    public static final /* synthetic */ class a<R, T> extends FunctionReference implements Function2<T, R, Pair<? extends T, ? extends R>> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final a f78471p0 = new a(2);

        @Override // kotlin.jvm.internal.CallableReference, kotlin.reflect.KCallable
        public final String getName() {
            return "<init>";
        }

        @Override // kotlin.jvm.internal.CallableReference
        public final KDeclarationContainer getOwner() {
            return Reflection.getOrCreateKotlinClass(Pair.class);
        }

        @Override // kotlin.jvm.internal.CallableReference
        public final String getSignature() {
            return "<init>(Ljava/lang/Object;Ljava/lang/Object;)V";
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return new Pair(obj, obj2);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [R, T, U] */
    /* JADX INFO: compiled from: flowable.kt */
    public static final /* synthetic */ class b<R, T, U> extends FunctionReference implements Function3<T, R, U, Triple<? extends T, ? extends R, ? extends U>> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final b f78472p0 = new b(3);

        @Override // kotlin.jvm.internal.CallableReference, kotlin.reflect.KCallable
        public final String getName() {
            return "<init>";
        }

        @Override // kotlin.jvm.internal.CallableReference
        public final KDeclarationContainer getOwner() {
            return Reflection.getOrCreateKotlinClass(Triple.class);
        }

        @Override // kotlin.jvm.internal.CallableReference
        public final String getSignature() {
            return "<init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V";
        }

        @Override // kotlin.jvm.functions.Function3
        public final Object invoke(Object obj, Object obj2, Object obj3) {
            return new Triple(obj, obj2, obj3);
        }
    }

    /* JADX INFO: compiled from: flowable.kt */
    public static final class c<T, R> implements Function<T, Publisher<? extends R>> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final c f78473p0 = new c();

        @Override // io.reactivex.functions.Function
        public final Object apply(Object obj) {
            return (Flowable) obj;
        }
    }

    /* JADX INFO: compiled from: flowable.kt */
    public static final class d<T, R> implements Function<T, Publisher<? extends R>> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final d f78475p0 = new d();

        @Override // io.reactivex.functions.Function
        public final Object apply(Object obj) {
            return (Flowable) obj;
        }
    }

    /* JADX INFO: compiled from: flowable.kt */
    public static final class e<T, R> implements Function<T, Publisher<? extends R>> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final e f78476p0 = new e();

        @Override // io.reactivex.functions.Function
        public final Object apply(Object obj) {
            return (Flowable) obj;
        }
    }

    /* JADX INFO: compiled from: flowable.kt */
    public static final class f implements Function {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final f f78477p0 = new f();

        @Override // io.reactivex.functions.Function
        public final Object apply(Object obj) {
            return ((Pair) obj).getFirst();
        }
    }

    /* JADX INFO: compiled from: flowable.kt */
    public static final class g implements Function {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final g f78479p0 = new g();

        @Override // io.reactivex.functions.Function
        public final Object apply(Object obj) {
            return ((Pair) obj).getSecond();
        }
    }

    /* JADX INFO: compiled from: flowable.kt */
    public static final class h implements Function {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final h f78480p0 = new h();

        @Override // io.reactivex.functions.Function
        public final Object apply(Object obj) {
            return ((Pair) obj).getFirst();
        }
    }

    /* JADX INFO: compiled from: flowable.kt */
    public static final class i implements Function {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final i f78481p0 = new i();

        @Override // io.reactivex.functions.Function
        public final Object apply(Object obj) {
            return ((Pair) obj).getSecond();
        }
    }

    @NotNull
    @SchedulerSupport("none")
    @BackpressureSupport(BackpressureKind.PASS_THROUGH)
    @CheckReturnValue
    public static final /* synthetic */ <R> Flowable<R> cast(@NotNull Flowable<?> flowable) {
        Intrinsics.reifiedOperationMarker(4, "R");
        Flowable<R> flowable2 = (Flowable<R>) flowable.cast(Object.class);
        Intrinsics.checkExpressionValueIsNotNull(flowable2, "cast(R::class.java)");
        return flowable2;
    }

    @NotNull
    @SchedulerSupport("none")
    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    public static final <T, R> Flowable<R> combineLatest(@NotNull Iterable<? extends Flowable<T>> iterable, @NotNull final Function1<? super List<? extends T>, ? extends R> function1) {
        Flowable<R> flowableCombineLatest = Flowable.combineLatest(iterable, new Function<Object[], R>() { // from class: io.reactivex.rxkotlin.FlowableKt.combineLatest.1
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
        Intrinsics.checkExpressionValueIsNotNull(flowableCombineLatest, "Flowable.combineLatest(t…List().map { it as T }) }");
        return flowableCombineLatest;
    }

    @NotNull
    @SchedulerSupport("none")
    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    public static final <T> Flowable<T> concatAll(@NotNull Flowable<Flowable<T>> flowable) {
        Flowable<T> flowable2 = (Flowable<T>) flowable.concatMap(c.f78473p0);
        Intrinsics.checkExpressionValueIsNotNull(flowable2, "concatMap { it }");
        return flowable2;
    }

    @NotNull
    @SchedulerSupport("none")
    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    public static final <T, R> Flowable<R> flatMapSequence(@NotNull Flowable<T> flowable, @NotNull final Function1<? super T, ? extends Sequence<? extends R>> function1) {
        Flowable<R> flowableFlatMap = flowable.flatMap(new Function<T, Publisher<? extends R>>() { // from class: io.reactivex.rxkotlin.FlowableKt.flatMapSequence.1
            @Override // io.reactivex.functions.Function
            @NotNull
            public final Flowable<R> apply(@NotNull T t10) {
                return FlowableKt.toFlowable((Sequence) function1.invoke(t10));
            }
        });
        Intrinsics.checkExpressionValueIsNotNull(flowableFlatMap, "flatMap { body(it).toFlowable() }");
        return flowableFlatMap;
    }

    @NotNull
    @SchedulerSupport("none")
    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    public static final <T> Flowable<T> merge(@NotNull Iterable<? extends Flowable<? extends T>> iterable) {
        Flowable<T> flowableMerge = Flowable.merge(toFlowable(iterable));
        Intrinsics.checkExpressionValueIsNotNull(flowableMerge, "Flowable.merge(this.toFlowable())");
        return flowableMerge;
    }

    @NotNull
    @SchedulerSupport("none")
    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    public static final <T> Flowable<T> mergeAll(@NotNull Flowable<Flowable<T>> flowable) {
        Flowable<T> flowable2 = (Flowable<T>) flowable.flatMap(d.f78475p0);
        Intrinsics.checkExpressionValueIsNotNull(flowable2, "flatMap { it }");
        return flowable2;
    }

    @NotNull
    @SchedulerSupport("none")
    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    public static final <T> Flowable<T> mergeDelayError(@NotNull Iterable<? extends Flowable<? extends T>> iterable) {
        Flowable<T> flowableMergeDelayError = Flowable.mergeDelayError(toFlowable(iterable));
        Intrinsics.checkExpressionValueIsNotNull(flowableMergeDelayError, "Flowable.mergeDelayError(this.toFlowable())");
        return flowableMergeDelayError;
    }

    @NotNull
    @SchedulerSupport("none")
    @BackpressureSupport(BackpressureKind.PASS_THROUGH)
    @CheckReturnValue
    public static final /* synthetic */ <R> Flowable<R> ofType(@NotNull Flowable<?> flowable) {
        Intrinsics.reifiedOperationMarker(4, "R");
        Flowable<R> flowable2 = (Flowable<R>) flowable.ofType(Object.class);
        Intrinsics.checkExpressionValueIsNotNull(flowable2, "ofType(R::class.java)");
        return flowable2;
    }

    @NotNull
    @SchedulerSupport("none")
    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    public static final <T> Flowable<T> switchLatest(@NotNull Flowable<Flowable<T>> flowable) {
        Flowable<T> flowable2 = (Flowable<T>) flowable.switchMap(e.f78476p0);
        Intrinsics.checkExpressionValueIsNotNull(flowable2, "switchMap { it }");
        return flowable2;
    }

    @NotNull
    @SchedulerSupport("none")
    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    public static final <T> Flowable<T> switchOnNext(@NotNull Flowable<Flowable<T>> flowable) {
        Flowable<T> flowableSwitchOnNext = Flowable.switchOnNext(flowable);
        Intrinsics.checkExpressionValueIsNotNull(flowableSwitchOnNext, "Flowable.switchOnNext(this)");
        return flowableSwitchOnNext;
    }

    @CheckReturnValue
    @NotNull
    public static final Flowable<Boolean> toFlowable(@NotNull boolean[] zArr) {
        return toFlowable(ArraysKt___ArraysKt.asIterable(zArr));
    }

    @NotNull
    @SchedulerSupport("none")
    @BackpressureSupport(BackpressureKind.UNBOUNDED_IN)
    @CheckReturnValue
    public static final <A, B> Single<Map<A, B>> toMap(@NotNull Flowable<Pair<A, B>> flowable) {
        Single<Map<A, B>> single = (Single<Map<A, B>>) flowable.toMap(f.f78477p0, g.f78479p0);
        Intrinsics.checkExpressionValueIsNotNull(single, "toMap({ it.first }, { it.second })");
        return single;
    }

    @NotNull
    @SchedulerSupport("none")
    @BackpressureSupport(BackpressureKind.UNBOUNDED_IN)
    @CheckReturnValue
    public static final <A, B> Single<Map<A, Collection<B>>> toMultimap(@NotNull Flowable<Pair<A, B>> flowable) {
        Single<Map<A, Collection<B>>> single = (Single<Map<A, Collection<B>>>) flowable.toMultimap(h.f78480p0, i.f78481p0);
        Intrinsics.checkExpressionValueIsNotNull(single, "toMultimap({ it.first }, { it.second })");
        return single;
    }

    @NotNull
    @SchedulerSupport("none")
    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    public static final <T, R> Flowable<R> zip(@NotNull Iterable<? extends Flowable<T>> iterable, @NotNull final Function1<? super List<? extends T>, ? extends R> function1) {
        Flowable<R> flowableZip = Flowable.zip(iterable, new Function<Object[], R>() { // from class: io.reactivex.rxkotlin.FlowableKt.zip.1
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
        Intrinsics.checkExpressionValueIsNotNull(flowableZip, "Flowable.zip(this) { zip…List().map { it as T }) }");
        return flowableZip;
    }

    @NotNull
    @SchedulerSupport("none")
    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    public static final <T, R> Flowable<Pair<T, R>> combineLatest(@NotNull Flowable<T> flowable, @NotNull Flowable<R> flowable2) {
        a aVar = a.f78471p0;
        Object bVar = aVar;
        if (aVar != null) {
            bVar = new xj.b(aVar);
        }
        Flowable<Pair<T, R>> flowableCombineLatest = Flowable.combineLatest(flowable, flowable2, (BiFunction) bVar);
        Intrinsics.checkExpressionValueIsNotNull(flowableCombineLatest, "Flowable.combineLatest(t…able, BiFunction(::Pair))");
        return flowableCombineLatest;
    }

    @NotNull
    @SchedulerSupport("none")
    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    public static final <T> Flowable<T> concatAll(@NotNull Iterable<? extends Publisher<T>> iterable) {
        Flowable<T> flowableConcat = Flowable.concat(iterable);
        Intrinsics.checkExpressionValueIsNotNull(flowableConcat, "Flowable.concat(this)");
        return flowableConcat;
    }

    @CheckReturnValue
    @NotNull
    public static final Flowable<Byte> toFlowable(@NotNull byte[] bArr) {
        return toFlowable(ArraysKt___ArraysKt.asIterable(bArr));
    }

    @NotNull
    @SchedulerSupport("none")
    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    public static final <T, R, U> Flowable<Triple<T, R, U>> combineLatest(@NotNull Flowable<T> flowable, @NotNull Flowable<R> flowable2, @NotNull Flowable<U> flowable3) {
        b bVar = b.f78472p0;
        Object cVar = bVar;
        if (bVar != null) {
            cVar = new xj.c(bVar);
        }
        Flowable<Triple<T, R, U>> flowableCombineLatest = Flowable.combineLatest(flowable, flowable2, flowable3, (io.reactivex.functions.Function3) cVar);
        Intrinsics.checkExpressionValueIsNotNull(flowableCombineLatest, "Flowable.combineLatest(t…le2, Function3(::Triple))");
        return flowableCombineLatest;
    }

    @CheckReturnValue
    @NotNull
    public static final Flowable<Character> toFlowable(@NotNull char[] cArr) {
        return toFlowable(ArraysKt___ArraysKt.asIterable(cArr));
    }

    @CheckReturnValue
    @NotNull
    public static final Flowable<Short> toFlowable(@NotNull short[] sArr) {
        return toFlowable(ArraysKt___ArraysKt.asIterable(sArr));
    }

    @CheckReturnValue
    @NotNull
    public static final Flowable<Integer> toFlowable(@NotNull int[] iArr) {
        return toFlowable(ArraysKt___ArraysKt.asIterable(iArr));
    }

    @CheckReturnValue
    @NotNull
    public static final Flowable<Long> toFlowable(@NotNull long[] jArr) {
        return toFlowable(ArraysKt___ArraysKt.asIterable(jArr));
    }

    @CheckReturnValue
    @NotNull
    public static final Flowable<Float> toFlowable(@NotNull float[] fArr) {
        return toFlowable(ArraysKt___ArraysKt.asIterable(fArr));
    }

    @CheckReturnValue
    @NotNull
    public static final Flowable<Double> toFlowable(@NotNull double[] dArr) {
        return toFlowable(ArraysKt___ArraysKt.asIterable(dArr));
    }

    @NotNull
    @SchedulerSupport("none")
    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    public static final <T> Flowable<T> toFlowable(@NotNull T[] tArr) {
        Flowable<T> flowableFromArray = Flowable.fromArray(Arrays.copyOf(tArr, tArr.length));
        Intrinsics.checkExpressionValueIsNotNull(flowableFromArray, "Flowable.fromArray(*this)");
        return flowableFromArray;
    }

    @NotNull
    @SchedulerSupport("none")
    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    public static final Flowable<Integer> toFlowable(@NotNull IntProgression intProgression) {
        if (intProgression.getStep() != 1 || ((long) intProgression.getLast()) - ((long) intProgression.getFirst()) >= Integer.MAX_VALUE) {
            Flowable<Integer> flowableFromIterable = Flowable.fromIterable(intProgression);
            Intrinsics.checkExpressionValueIsNotNull(flowableFromIterable, "Flowable.fromIterable(this)");
            return flowableFromIterable;
        }
        Flowable<Integer> flowableRange = Flowable.range(intProgression.getFirst(), Math.max(0, (intProgression.getLast() - intProgression.getFirst()) + 1));
        Intrinsics.checkExpressionValueIsNotNull(flowableRange, "Flowable.range(first, Ma…max(0, last - first + 1))");
        return flowableRange;
    }

    @NotNull
    @SchedulerSupport("none")
    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    public static final <T> Flowable<T> toFlowable(@NotNull Iterable<? extends T> iterable) {
        Flowable<T> flowableFromIterable = Flowable.fromIterable(iterable);
        Intrinsics.checkExpressionValueIsNotNull(flowableFromIterable, "Flowable.fromIterable(this)");
        return flowableFromIterable;
    }

    @NotNull
    public static final <T> Flowable<T> toFlowable(@NotNull Sequence<? extends T> sequence) {
        return toFlowable(SequencesKt___SequencesKt.asIterable(sequence));
    }

    @NotNull
    public static final <T> Flowable<T> toFlowable(@NotNull Iterator<? extends T> it) {
        return toFlowable(new FlowableKt$toIterable$1(it));
    }
}

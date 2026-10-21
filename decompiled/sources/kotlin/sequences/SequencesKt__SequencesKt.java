package kotlin.sequences;

import androidx.exifinterface.media.ExifInterface;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.SinceKotlin;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.internal.LowPriorityInOverloadResolution;
import kotlin.jvm.JvmName;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.random.Random;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: Sequences.kt */
/* JADX INFO: loaded from: classes12.dex */
public class SequencesKt__SequencesKt extends kl.c {

    /* JADX INFO: Add missing generic type declarations: [R] */
    /* JADX INFO: compiled from: Sequences.kt */
    @DebugMetadata(c = "kotlin.sequences.SequencesKt__SequencesKt$flatMapIndexed$1", f = "Sequences.kt", i = {0, 0}, l = {332}, m = "invokeSuspend", n = {"$this$sequence", FirebaseAnalytics.Param.INDEX}, s = {"L$0", "I$0"})
    public static final class a<R> extends RestrictedSuspendLambda implements Function2<SequenceScope<? super R>, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public Iterator f82163p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public int f82164q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public int f82165r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public /* synthetic */ Object f82166s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public final /* synthetic */ Sequence<T> f82167t0;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public final /* synthetic */ Function2<Integer, T, C> f82168u0;
        public final /* synthetic */ Function1<C, Iterator<R>> v0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(Sequence<? extends T> sequence, Function2<? super Integer, ? super T, ? extends C> function2, Function1<? super C, ? extends Iterator<? extends R>> function1, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f82167t0 = sequence;
            this.f82168u0 = function2;
            this.v0 = function1;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            a aVar = new a(this.f82167t0, this.f82168u0, this.v0, continuation);
            aVar.f82166s0 = obj;
            return aVar;
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            SequenceScope sequenceScope;
            int i10;
            Iterator it;
            Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
            int i11 = this.f82165r0;
            if (i11 == 0) {
                ResultKt.throwOnFailure(obj);
                sequenceScope = (SequenceScope) this.f82166s0;
                i10 = 0;
                it = this.f82167t0.iterator();
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                int i12 = this.f82164q0;
                it = this.f82163p0;
                sequenceScope = (SequenceScope) this.f82166s0;
                ResultKt.throwOnFailure(obj);
                i10 = i12;
            }
            while (it.hasNext()) {
                Object next = it.next();
                int i13 = i10 + 1;
                if (i10 < 0) {
                    CollectionsKt__CollectionsKt.throwIndexOverflow();
                }
                Iterator<R> itInvoke = this.v0.invoke((C) this.f82168u0.invoke(Boxing.boxInt(i10), (T) next));
                this.f82166s0 = sequenceScope;
                this.f82163p0 = it;
                this.f82164q0 = i13;
                this.f82165r0 = 1;
                if (sequenceScope.yieldAll(itInvoke, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                i10 = i13;
            }
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull SequenceScope<? super R> sequenceScope, @Nullable Continuation<? super Unit> continuation) {
            return ((a) create(sequenceScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: compiled from: Sequences.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010(\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u00022\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", ExifInterface.GPS_DIRECTION_TRUE, "it", "Lkotlin/sequences/Sequence;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class b<T> extends Lambda implements Function1<Sequence<? extends T>, Iterator<? extends T>> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final b f82170p0 = new b(1);

        public b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        @NotNull
        public final Iterator<T> invoke(@NotNull Sequence<? extends T> it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return it.iterator();
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: compiled from: Sequences.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010(\n\u0002\b\u0002\n\u0002\u0010\u001c\n\u0000\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u00022\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", ExifInterface.GPS_DIRECTION_TRUE, "it", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class c<T> extends Lambda implements Function1<Iterable<? extends T>, Iterator<? extends T>> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final c f82171p0 = new c(1);

        public c() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        @NotNull
        public final Iterator<T> invoke(@NotNull Iterable<? extends T> it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return it.iterator();
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: compiled from: Sequences.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0010\u0000\u001a\u0004\u0018\u0001H\u0001\"\b\b\u0000\u0010\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u0002H\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", ExifInterface.GPS_DIRECTION_TRUE, "", "it", "invoke", "(Ljava/lang/Object;)Ljava/lang/Object;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class d<T> extends Lambda implements Function1<T, T> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ Function0<T> f82172p0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public d(Function0<? extends T> function0) {
            super(1);
            this.f82172p0 = function0;
        }

        @Override // kotlin.jvm.functions.Function1
        @Nullable
        public final T invoke(@NotNull T it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return this.f82172p0.invoke();
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: compiled from: Sequences.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0000\u001a\u0004\u0018\u0001H\u0001\"\b\b\u0000\u0010\u0001*\u00020\u0002H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"<anonymous>", ExifInterface.GPS_DIRECTION_TRUE, "", "invoke", "()Ljava/lang/Object;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class e<T> extends Lambda implements Function0<T> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ T f82173p0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(T t10) {
            super(0);
            this.f82173p0 = t10;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final T invoke() {
            return this.f82173p0;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: compiled from: Sequences.kt */
    @DebugMetadata(c = "kotlin.sequences.SequencesKt__SequencesKt$ifEmpty$1", f = "Sequences.kt", i = {}, l = {69, 71}, m = "invokeSuspend", n = {}, s = {})
    public static final class f<T> extends RestrictedSuspendLambda implements Function2<SequenceScope<? super T>, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public int f82174p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public /* synthetic */ Object f82175q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ Sequence<T> f82176r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final /* synthetic */ Function0<Sequence<T>> f82177s0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public f(Sequence<? extends T> sequence, Function0<? extends Sequence<? extends T>> function0, Continuation<? super f> continuation) {
            super(2, continuation);
            this.f82176r0 = sequence;
            this.f82177s0 = function0;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            f fVar = new f(this.f82176r0, this.f82177s0, continuation);
            fVar.f82175q0 = obj;
            return fVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
            int i10 = this.f82174p0;
            if (i10 == 0) {
                ResultKt.throwOnFailure(obj);
                SequenceScope sequenceScope = (SequenceScope) this.f82175q0;
                Iterator<? extends T> it = this.f82176r0.iterator();
                if (it.hasNext()) {
                    this.f82174p0 = 1;
                    if (sequenceScope.yieldAll(it, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    Sequence<T> sequenceInvoke = this.f82177s0.invoke();
                    this.f82174p0 = 2;
                    if (sequenceScope.yieldAll(sequenceInvoke, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
            } else {
                if (i10 != 1 && i10 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull SequenceScope<? super T> sequenceScope, @Nullable Continuation<? super Unit> continuation) {
            return ((f) create(sequenceScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: compiled from: Sequences.kt */
    @DebugMetadata(c = "kotlin.sequences.SequencesKt__SequencesKt$shuffled$1", f = "Sequences.kt", i = {0, 0}, l = {145}, m = "invokeSuspend", n = {"$this$sequence", "buffer"}, s = {"L$0", "L$1"})
    public static final class g<T> extends RestrictedSuspendLambda implements Function2<SequenceScope<? super T>, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public List f82178p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public int f82179q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public /* synthetic */ Object f82180r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final /* synthetic */ Sequence<T> f82181s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public final /* synthetic */ Random f82182t0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public g(Sequence<? extends T> sequence, Random random, Continuation<? super g> continuation) {
            super(2, continuation);
            this.f82181s0 = sequence;
            this.f82182t0 = random;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            g gVar = new g(this.f82181s0, this.f82182t0, continuation);
            gVar.f82180r0 = obj;
            return gVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            List mutableList;
            SequenceScope sequenceScope;
            Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
            int i10 = this.f82179q0;
            if (i10 == 0) {
                ResultKt.throwOnFailure(obj);
                SequenceScope sequenceScope2 = (SequenceScope) this.f82180r0;
                mutableList = SequencesKt___SequencesKt.toMutableList(this.f82181s0);
                sequenceScope = sequenceScope2;
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                mutableList = this.f82178p0;
                SequenceScope sequenceScope3 = (SequenceScope) this.f82180r0;
                ResultKt.throwOnFailure(obj);
                sequenceScope = sequenceScope3;
            }
            while (!mutableList.isEmpty()) {
                int iNextInt = this.f82182t0.nextInt(mutableList.size());
                Object objRemoveLast = bk.g.removeLast(mutableList);
                if (iNextInt < mutableList.size()) {
                    objRemoveLast = mutableList.set(iNextInt, objRemoveLast);
                }
                this.f82180r0 = sequenceScope;
                this.f82178p0 = mutableList;
                this.f82179q0 = 1;
                if (sequenceScope.yield(objRemoveLast, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull SequenceScope<? super T> sequenceScope, @Nullable Continuation<? super Unit> continuation) {
            return ((g) create(sequenceScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @NotNull
    public static <T> Sequence<T> asSequence(@NotNull final Iterator<? extends T> it) {
        Intrinsics.checkNotNullParameter(it, "<this>");
        return constrainOnce(new Sequence<T>() { // from class: kotlin.sequences.SequencesKt__SequencesKt$asSequence$$inlined$Sequence$1
            @Override // kotlin.sequences.Sequence
            @NotNull
            public Iterator<T> iterator() {
                return it;
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    public static <T> Sequence<T> constrainOnce(@NotNull Sequence<? extends T> sequence) {
        Intrinsics.checkNotNullParameter(sequence, "<this>");
        return sequence instanceof ConstrainedOnceSequence ? sequence : new ConstrainedOnceSequence(sequence);
    }

    @NotNull
    public static <T> Sequence<T> emptySequence() {
        return kotlin.sequences.a.f82272a;
    }

    @NotNull
    public static final <T, C, R> Sequence<R> flatMapIndexed(@NotNull Sequence<? extends T> source, @NotNull Function2<? super Integer, ? super T, ? extends C> transform, @NotNull Function1<? super C, ? extends Iterator<? extends R>> iterator) {
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(transform, "transform");
        Intrinsics.checkNotNullParameter(iterator, "iterator");
        return SequencesKt__SequenceBuilderKt.sequence(new a(source, transform, iterator, null));
    }

    @NotNull
    public static final <T> Sequence<T> flatten(@NotNull Sequence<? extends Sequence<? extends T>> sequence) {
        Intrinsics.checkNotNullParameter(sequence, "<this>");
        b bVar = b.f82170p0;
        return sequence instanceof TransformingSequence ? ((TransformingSequence) sequence).flatten$kotlin_stdlib(bVar) : new FlatteningSequence(sequence, kotlin.sequences.b.f82273p0, bVar);
    }

    @JvmName(name = "flattenSequenceOfIterable")
    @NotNull
    public static final <T> Sequence<T> flattenSequenceOfIterable(@NotNull Sequence<? extends Iterable<? extends T>> sequence) {
        Intrinsics.checkNotNullParameter(sequence, "<this>");
        c cVar = c.f82171p0;
        return sequence instanceof TransformingSequence ? ((TransformingSequence) sequence).flatten$kotlin_stdlib(cVar) : new FlatteningSequence(sequence, kotlin.sequences.b.f82273p0, cVar);
    }

    @NotNull
    public static <T> Sequence<T> generateSequence(@NotNull Function0<? extends T> nextFunction) {
        Intrinsics.checkNotNullParameter(nextFunction, "nextFunction");
        return constrainOnce(new GeneratorSequence(nextFunction, new d(nextFunction)));
    }

    @SinceKotlin(version = "1.3")
    @NotNull
    public static final <T> Sequence<T> ifEmpty(@NotNull Sequence<? extends T> sequence, @NotNull Function0<? extends Sequence<? extends T>> defaultValue) {
        Intrinsics.checkNotNullParameter(sequence, "<this>");
        Intrinsics.checkNotNullParameter(defaultValue, "defaultValue");
        return SequencesKt__SequenceBuilderKt.sequence(new f(sequence, defaultValue, null));
    }

    @NotNull
    public static <T> Sequence<T> sequenceOf(@NotNull T... elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        return elements.length == 0 ? emptySequence() : ArraysKt___ArraysKt.asSequence(elements);
    }

    @SinceKotlin(version = "1.4")
    @NotNull
    public static final <T> Sequence<T> shuffled(@NotNull Sequence<? extends T> sequence) {
        Intrinsics.checkNotNullParameter(sequence, "<this>");
        return shuffled(sequence, Random.INSTANCE);
    }

    @NotNull
    public static final <T, R> Pair<List<T>, List<R>> unzip(@NotNull Sequence<? extends Pair<? extends T, ? extends R>> sequence) {
        Intrinsics.checkNotNullParameter(sequence, "<this>");
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (Pair<? extends T, ? extends R> pair : sequence) {
            arrayList.add(pair.getFirst());
            arrayList2.add(pair.getSecond());
        }
        return TuplesKt.to(arrayList, arrayList2);
    }

    @LowPriorityInOverloadResolution
    @NotNull
    public static <T> Sequence<T> generateSequence(@Nullable T t10, @NotNull Function1<? super T, ? extends T> nextFunction) {
        Intrinsics.checkNotNullParameter(nextFunction, "nextFunction");
        return t10 == null ? kotlin.sequences.a.f82272a : new GeneratorSequence(new e(t10), nextFunction);
    }

    @SinceKotlin(version = "1.4")
    @NotNull
    public static final <T> Sequence<T> shuffled(@NotNull Sequence<? extends T> sequence, @NotNull Random random) {
        Intrinsics.checkNotNullParameter(sequence, "<this>");
        Intrinsics.checkNotNullParameter(random, "random");
        return SequencesKt__SequenceBuilderKt.sequence(new g(sequence, random, null));
    }

    @NotNull
    public static <T> Sequence<T> generateSequence(@NotNull Function0<? extends T> seedFunction, @NotNull Function1<? super T, ? extends T> nextFunction) {
        Intrinsics.checkNotNullParameter(seedFunction, "seedFunction");
        Intrinsics.checkNotNullParameter(nextFunction, "nextFunction");
        return new GeneratorSequence(seedFunction, nextFunction);
    }
}

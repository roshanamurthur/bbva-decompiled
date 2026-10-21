package kotlin.sequences;

import androidx.exifinterface.media.ExifInterface;
import bk.v;
import bk.w;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.mastercard.sonic.androidsvg.SvgConstantsKt;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import kotlin.Deprecated;
import kotlin.DeprecatedSinceKotlin;
import kotlin.ExperimentalStdlibApi;
import kotlin.Metadata;
import kotlin.OverloadResolutionByLambdaReturnType;
import kotlin.Pair;
import kotlin.ReplaceWith;
import kotlin.ResultKt;
import kotlin.SinceKotlin;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.WasExperimental;
import kotlin.collections.ArraysKt___ArraysJvmKt;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.Grouping;
import kotlin.collections.IndexedValue;
import kotlin.collections.SlidingWindowKt;
import kotlin.comparisons.ComparisonsKt__ComparisonsKt$compareBy$2;
import kotlin.comparisons.ComparisonsKt__ComparisonsKt$compareByDescending$1;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.internal.PlatformImplementationsKt;
import kotlin.jvm.JvmName;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: _Sequences.kt */
/* JADX INFO: loaded from: classes12.dex */
@SourceDebugExtension({"SMAP\n_Sequences.kt\nKotlin\n*S Kotlin\n*F\n+ 1 _Sequences.kt\nkotlin/sequences/SequencesKt___SequencesKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n*L\n1#1,3112:1\n179#1,2:3113\n316#1,7:3115\n1324#1,3:3123\n739#1,4:3126\n704#1,4:3130\n722#1,4:3134\n775#1,4:3138\n1017#1,3:3142\n1020#1,3:3152\n1037#1,3:3155\n1040#1,3:3165\n1324#1,3:3182\n1313#1,2:3185\n1#2:3122\n372#3,7:3145\n372#3,7:3158\n372#3,7:3168\n372#3,7:3175\n*S KotlinDebug\n*F\n+ 1 _Sequences.kt\nkotlin/sequences/SequencesKt___SequencesKt\n*L\n87#1:3113,2\n99#1:3115,7\n458#1:3123,3\n658#1:3126,4\n674#1:3130,4\n689#1:3134,4\n760#1:3138,4\n988#1:3142,3\n988#1:3152,3\n1003#1:3155,3\n1003#1:3165,3\n1106#1:3182,3\n1144#1:3185,2\n988#1:3145,7\n1003#1:3158,7\n1019#1:3168,7\n1039#1:3175,7\n*E\n"})
public class SequencesKt___SequencesKt extends kl.d {

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: compiled from: _Sequences.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0004H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", ExifInterface.GPS_DIRECTION_TRUE, "it", "Lkotlin/collections/IndexedValue;", "invoke", "(Lkotlin/collections/IndexedValue;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class c<T> extends Lambda implements Function1<IndexedValue<? extends T>, Boolean> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ Function2<Integer, T, Boolean> f82186p0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public c(Function2<? super Integer, ? super T, Boolean> function2) {
            super(1);
            this.f82186p0 = function2;
        }

        @Override // kotlin.jvm.functions.Function1
        @NotNull
        public final Boolean invoke(@NotNull IndexedValue<? extends T> it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return this.f82186p0.invoke(Integer.valueOf(it.getIndex()), it.getValue());
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: compiled from: _Sequences.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u0002H\u00010\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", ExifInterface.GPS_DIRECTION_TRUE, "it", "Lkotlin/collections/IndexedValue;", "invoke", "(Lkotlin/collections/IndexedValue;)Ljava/lang/Object;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class d<T> extends Lambda implements Function1<IndexedValue<? extends T>, T> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final d f82187p0 = new d(1);

        public d() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final T invoke(@NotNull IndexedValue<? extends T> it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return it.getValue();
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: compiled from: _Sequences.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u0001H\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", ExifInterface.GPS_DIRECTION_TRUE, "", "it", "invoke", "(Ljava/lang/Object;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class e<T> extends Lambda implements Function1<T, Boolean> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final e f82188p0 = new e(1);

        public e() {
            super(1);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function1
        @NotNull
        public final Boolean invoke(@Nullable T t10) {
            return Boolean.valueOf(t10 == null);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [R] */
    /* JADX INFO: compiled from: _Sequences.kt */
    public /* synthetic */ class f<R> extends FunctionReferenceImpl implements Function1<Iterable<? extends R>, Iterator<? extends R>> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final f f82189p0 = new f();

        public f() {
            super(1, Iterable.class, "iterator", "iterator()Ljava/util/Iterator;", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        @NotNull
        public final Iterator<R> invoke(@NotNull Iterable<? extends R> p4) {
            Intrinsics.checkNotNullParameter(p4, "p0");
            return p4.iterator();
        }
    }

    /* JADX INFO: Add missing generic type declarations: [R] */
    /* JADX INFO: compiled from: _Sequences.kt */
    public /* synthetic */ class g<R> extends FunctionReferenceImpl implements Function1<Sequence<? extends R>, Iterator<? extends R>> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final g f82190p0 = new g();

        public g() {
            super(1, Sequence.class, "iterator", "iterator()Ljava/util/Iterator;", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        @NotNull
        public final Iterator<R> invoke(@NotNull Sequence<? extends R> p4) {
            Intrinsics.checkNotNullParameter(p4, "p0");
            return p4.iterator();
        }
    }

    /* JADX INFO: Add missing generic type declarations: [R] */
    /* JADX INFO: compiled from: _Sequences.kt */
    public /* synthetic */ class h<R> extends FunctionReferenceImpl implements Function1<Iterable<? extends R>, Iterator<? extends R>> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final h f82193p0 = new h();

        public h() {
            super(1, Iterable.class, "iterator", "iterator()Ljava/util/Iterator;", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        @NotNull
        public final Iterator<R> invoke(@NotNull Iterable<? extends R> p4) {
            Intrinsics.checkNotNullParameter(p4, "p0");
            return p4.iterator();
        }
    }

    /* JADX INFO: Add missing generic type declarations: [R] */
    /* JADX INFO: compiled from: _Sequences.kt */
    public /* synthetic */ class i<R> extends FunctionReferenceImpl implements Function1<Sequence<? extends R>, Iterator<? extends R>> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final i f82194p0 = new i();

        public i() {
            super(1, Sequence.class, "iterator", "iterator()Ljava/util/Iterator;", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        @NotNull
        public final Iterator<R> invoke(@NotNull Sequence<? extends R> p4) {
            Intrinsics.checkNotNullParameter(p4, "p0");
            return p4.iterator();
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: compiled from: _Sequences.kt */
    @Metadata(d1 = {"\u0000\u0004\n\u0002\b\u0005\u0010\u0000\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u00012\u0006\u0010\u0002\u001a\u0002H\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"<anonymous>", ExifInterface.GPS_DIRECTION_TRUE, "it", "invoke", "(Ljava/lang/Object;)Ljava/lang/Object;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class j<T> extends Lambda implements Function1<T, T> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ Function1<T, Unit> f82195p0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public j(Function1<? super T, Unit> function1) {
            super(1);
            this.f82195p0 = function1;
        }

        @Override // kotlin.jvm.functions.Function1
        public final T invoke(T t10) {
            this.f82195p0.invoke(t10);
            return t10;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: compiled from: _Sequences.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\u0010\u0000\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u0002H\u0001H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", ExifInterface.GPS_DIRECTION_TRUE, FirebaseAnalytics.Param.INDEX, "", "element", "invoke", "(ILjava/lang/Object;)Ljava/lang/Object;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class k<T> extends Lambda implements Function2<Integer, T, T> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ Function2<Integer, T, Unit> f82196p0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public k(Function2<? super Integer, ? super T, Unit> function2) {
            super(2);
            this.f82196p0 = function2;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Integer num, Object obj) {
            return invoke(num.intValue(), obj);
        }

        public final T invoke(int i10, T t10) {
            this.f82196p0.invoke(Integer.valueOf(i10), t10);
            return t10;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: compiled from: _Sequences.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0010\u0000\u001a\u0002H\u0001\"\b\b\u0000\u0010\u0001*\u00020\u00022\b\u0010\u0003\u001a\u0004\u0018\u0001H\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", ExifInterface.GPS_DIRECTION_TRUE, "", "it", "invoke", "(Ljava/lang/Object;)Ljava/lang/Object;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class l<T> extends Lambda implements Function1<T, T> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ Sequence<T> f82197p0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public l(Sequence<? extends T> sequence) {
            super(1);
            this.f82197p0 = sequence;
        }

        @Override // kotlin.jvm.functions.Function1
        @NotNull
        public final T invoke(@Nullable T t10) {
            if (t10 != null) {
                return t10;
            }
            throw new IllegalArgumentException("null element found in " + this.f82197p0 + '.');
        }
    }

    /* JADX INFO: Add missing generic type declarations: [R] */
    /* JADX INFO: compiled from: _Sequences.kt */
    @DebugMetadata(c = "kotlin.sequences.SequencesKt___SequencesKt$runningFold$1", f = "_Sequences.kt", i = {0, 1, 1}, l = {2308, 2312}, m = "invokeSuspend", n = {"$this$sequence", "$this$sequence", "accumulator"}, s = {"L$0", "L$0", "L$1"})
    public static final class m<R> extends RestrictedSuspendLambda implements Function2<SequenceScope<? super R>, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public Object f82198p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public Iterator f82199q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public int f82200r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public /* synthetic */ Object f82201s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public final /* synthetic */ R f82202t0;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public final /* synthetic */ Sequence<T> f82203u0;
        public final /* synthetic */ Function2<R, T, R> v0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public m(R r3, Sequence<? extends T> sequence, Function2<? super R, ? super T, ? extends R> function2, Continuation<? super m> continuation) {
            super(2, continuation);
            this.f82202t0 = r3;
            this.f82203u0 = sequence;
            this.v0 = function2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            m mVar = new m(this.f82202t0, this.f82203u0, this.v0, continuation);
            mVar.f82201s0 = obj;
            return mVar;
        }

        /* JADX WARN: Code duplicated, block: B:17:0x004e  */
        /* JADX WARN: Code duplicated, block: B:23:0x0066 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:24:? A[LOOP:0: B:15:0x0048->B:24:?, LOOP_END, SYNTHETIC] */
        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            SequenceScope sequenceScope;
            SequenceScope sequenceScope2;
            Iterator it;
            Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
            int i10 = this.f82200r0;
            Object objInvoke = this.f82202t0;
            if (i10 != 0) {
                if (i10 == 1) {
                    sequenceScope = (SequenceScope) this.f82201s0;
                    ResultKt.throwOnFailure(obj);
                } else {
                    if (i10 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    it = this.f82199q0;
                    objInvoke = this.f82198p0;
                    sequenceScope2 = (SequenceScope) this.f82201s0;
                    ResultKt.throwOnFailure(obj);
                }
                while (it.hasNext()) {
                    objInvoke = this.v0.invoke((R) objInvoke, (T) it.next());
                    this.f82201s0 = sequenceScope2;
                    this.f82198p0 = objInvoke;
                    this.f82199q0 = it;
                    this.f82200r0 = 2;
                    if (sequenceScope2.yield(objInvoke, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
                return Unit.INSTANCE;
            }
            ResultKt.throwOnFailure(obj);
            sequenceScope = (SequenceScope) this.f82201s0;
            this.f82201s0 = sequenceScope;
            this.f82200r0 = 1;
            if (sequenceScope.yield(objInvoke, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            sequenceScope2 = sequenceScope;
            it = this.f82203u0.iterator();
            while (it.hasNext()) {
                objInvoke = this.v0.invoke((R) objInvoke, (T) it.next());
                this.f82201s0 = sequenceScope2;
                this.f82198p0 = objInvoke;
                this.f82199q0 = it;
                this.f82200r0 = 2;
                if (sequenceScope2.yield(objInvoke, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull SequenceScope<? super R> sequenceScope, @Nullable Continuation<? super Unit> continuation) {
            return ((m) create(sequenceScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [R] */
    /* JADX INFO: compiled from: _Sequences.kt */
    @DebugMetadata(c = "kotlin.sequences.SequencesKt___SequencesKt$runningFoldIndexed$1", f = "_Sequences.kt", i = {0, 1, 1, 1}, l = {2336, 2341}, m = "invokeSuspend", n = {"$this$sequence", "$this$sequence", "accumulator", FirebaseAnalytics.Param.INDEX}, s = {"L$0", "L$0", "L$1", "I$0"})
    public static final class n<R> extends RestrictedSuspendLambda implements Function2<SequenceScope<? super R>, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public Object f82217p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public Iterator f82218q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public int f82219r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public int f82220s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public /* synthetic */ Object f82221t0;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public final /* synthetic */ R f82222u0;
        public final /* synthetic */ Sequence<T> v0;

        /* JADX INFO: renamed from: w0, reason: collision with root package name */
        public final /* synthetic */ Function3<Integer, R, T, R> f82223w0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public n(R r3, Sequence<? extends T> sequence, Function3<? super Integer, ? super R, ? super T, ? extends R> function3, Continuation<? super n> continuation) {
            super(2, continuation);
            this.f82222u0 = r3;
            this.v0 = sequence;
            this.f82223w0 = function3;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            n nVar = new n(this.f82222u0, this.v0, this.f82223w0, continuation);
            nVar.f82221t0 = obj;
            return nVar;
        }

        /* JADX WARN: Code duplicated, block: B:16:0x0055  */
        /* JADX WARN: Code duplicated, block: B:18:0x005d  */
        /* JADX WARN: Code duplicated, block: B:22:0x007b A[LOOP:0: B:14:0x004f->B:22:0x007b, LOOP_END] */
        /* JADX WARN: Code duplicated, block: B:25:0x007a A[SYNTHETIC] */
        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            SequenceScope sequenceScope;
            SequenceScope sequenceScope2;
            Iterator it;
            int i10;
            int i11;
            R rInvoke;
            Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
            int i12 = this.f82220s0;
            Object obj2 = this.f82222u0;
            if (i12 != 0) {
                if (i12 == 1) {
                    sequenceScope = (SequenceScope) this.f82221t0;
                    ResultKt.throwOnFailure(obj);
                } else {
                    if (i12 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    int i13 = this.f82219r0;
                    it = this.f82218q0;
                    obj2 = this.f82217p0;
                    sequenceScope2 = (SequenceScope) this.f82221t0;
                    ResultKt.throwOnFailure(obj);
                    i10 = i13;
                }
                while (it.hasNext()) {
                    Object next = it.next();
                    i11 = i10 + 1;
                    if (i10 < 0) {
                        CollectionsKt__CollectionsKt.throwIndexOverflow();
                    }
                    rInvoke = this.f82223w0.invoke(Boxing.boxInt(i10), (R) obj2, (T) next);
                    this.f82221t0 = sequenceScope2;
                    this.f82217p0 = rInvoke;
                    this.f82218q0 = it;
                    this.f82219r0 = i11;
                    this.f82220s0 = 2;
                    if (sequenceScope2.yield(rInvoke, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    obj2 = rInvoke;
                    i10 = i11;
                }
                return Unit.INSTANCE;
            }
            ResultKt.throwOnFailure(obj);
            sequenceScope = (SequenceScope) this.f82221t0;
            this.f82221t0 = sequenceScope;
            this.f82220s0 = 1;
            if (sequenceScope.yield(obj2, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            sequenceScope2 = sequenceScope;
            it = this.v0.iterator();
            i10 = 0;
            while (it.hasNext()) {
                Object next2 = it.next();
                i11 = i10 + 1;
                if (i10 < 0) {
                    CollectionsKt__CollectionsKt.throwIndexOverflow();
                }
                rInvoke = this.f82223w0.invoke(Boxing.boxInt(i10), (R) obj2, (T) next2);
                this.f82221t0 = sequenceScope2;
                this.f82217p0 = rInvoke;
                this.f82218q0 = it;
                this.f82219r0 = i11;
                this.f82220s0 = 2;
                if (sequenceScope2.yield(rInvoke, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                obj2 = rInvoke;
                i10 = i11;
            }
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull SequenceScope<? super R> sequenceScope, @Nullable Continuation<? super Unit> continuation) {
            return ((n) create(sequenceScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [S] */
    /* JADX INFO: compiled from: _Sequences.kt */
    @DebugMetadata(c = "kotlin.sequences.SequencesKt___SequencesKt$runningReduce$1", f = "_Sequences.kt", i = {0, 0, 0, 1, 1, 1}, l = {2366, 2369}, m = "invokeSuspend", n = {"$this$sequence", "iterator", "accumulator", "$this$sequence", "iterator", "accumulator"}, s = {"L$0", "L$1", "L$2", "L$0", "L$1", "L$2"})
    public static final class o<S> extends RestrictedSuspendLambda implements Function2<SequenceScope<? super S>, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public Iterator f82224p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public Object f82225q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public int f82226r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public /* synthetic */ Object f82227s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public final /* synthetic */ Sequence<T> f82228t0;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public final /* synthetic */ Function2<S, T, S> f82229u0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public o(Sequence<? extends T> sequence, Function2<? super S, ? super T, ? extends S> function2, Continuation<? super o> continuation) {
            super(2, continuation);
            this.f82228t0 = sequence;
            this.f82229u0 = function2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            o oVar = new o(this.f82228t0, this.f82229u0, continuation);
            oVar.f82227s0 = obj;
            return oVar;
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            SequenceScope sequenceScope;
            Object next;
            Iterator it;
            Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
            int i10 = this.f82226r0;
            if (i10 == 0) {
                ResultKt.throwOnFailure(obj);
                sequenceScope = (SequenceScope) this.f82227s0;
                Iterator it2 = this.f82228t0.iterator();
                if (it2.hasNext()) {
                    next = it2.next();
                    this.f82227s0 = sequenceScope;
                    this.f82224p0 = it2;
                    this.f82225q0 = next;
                    this.f82226r0 = 1;
                    if (sequenceScope.yield(next, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    it = it2;
                }
                return Unit.INSTANCE;
            }
            if (i10 != 1 && i10 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            next = this.f82225q0;
            it = this.f82224p0;
            sequenceScope = (SequenceScope) this.f82227s0;
            ResultKt.throwOnFailure(obj);
            while (it.hasNext()) {
                next = this.f82229u0.invoke((S) next, (T) it.next());
                this.f82227s0 = sequenceScope;
                this.f82224p0 = it;
                this.f82225q0 = next;
                this.f82226r0 = 2;
                if (sequenceScope.yield(next, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull SequenceScope<? super S> sequenceScope, @Nullable Continuation<? super Unit> continuation) {
            return ((o) create(sequenceScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [S] */
    /* JADX INFO: compiled from: _Sequences.kt */
    @DebugMetadata(c = "kotlin.sequences.SequencesKt___SequencesKt$runningReduceIndexed$1", f = "_Sequences.kt", i = {0, 0, 0, 1, 1, 1, 1}, l = {2395, 2399}, m = "invokeSuspend", n = {"$this$sequence", "iterator", "accumulator", "$this$sequence", "iterator", "accumulator", FirebaseAnalytics.Param.INDEX}, s = {"L$0", "L$1", "L$2", "L$0", "L$1", "L$2", "I$0"})
    public static final class p<S> extends RestrictedSuspendLambda implements Function2<SequenceScope<? super S>, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public Iterator f82230p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public Object f82231q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public int f82232r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public int f82233s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public /* synthetic */ Object f82234t0;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public final /* synthetic */ Sequence<T> f82235u0;
        public final /* synthetic */ Function3<Integer, S, T, S> v0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public p(Sequence<? extends T> sequence, Function3<? super Integer, ? super S, ? super T, ? extends S> function3, Continuation<? super p> continuation) {
            super(2, continuation);
            this.f82235u0 = sequence;
            this.v0 = function3;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            p pVar = new p(this.f82235u0, this.v0, continuation);
            pVar.f82234t0 = obj;
            return pVar;
        }

        /* JADX WARN: Code duplicated, block: B:18:0x0062  */
        /* JADX WARN: Code duplicated, block: B:20:0x0066  */
        /* JADX WARN: Code duplicated, block: B:24:0x0088 A[LOOP:0: B:16:0x005c->B:24:0x0088, LOOP_END] */
        /* JADX WARN: Code duplicated, block: B:28:0x0087 A[SYNTHETIC] */
        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            SequenceScope sequenceScope;
            Iterator it;
            Object next;
            int i10;
            S sInvoke;
            Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
            int i11 = this.f82233s0;
            int i12 = 1;
            if (i11 == 0) {
                ResultKt.throwOnFailure(obj);
                sequenceScope = (SequenceScope) this.f82234t0;
                it = this.f82235u0.iterator();
                if (it.hasNext()) {
                    next = it.next();
                    this.f82234t0 = sequenceScope;
                    this.f82230p0 = it;
                    this.f82231q0 = next;
                    this.f82233s0 = 1;
                    if (sequenceScope.yield(next, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
                return Unit.INSTANCE;
            }
            if (i11 == 1) {
                next = this.f82231q0;
                it = this.f82230p0;
                sequenceScope = (SequenceScope) this.f82234t0;
                ResultKt.throwOnFailure(obj);
            } else {
                if (i11 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                int i13 = this.f82232r0;
                Object obj2 = this.f82231q0;
                it = this.f82230p0;
                sequenceScope = (SequenceScope) this.f82234t0;
                ResultKt.throwOnFailure(obj);
                i12 = i13;
                next = obj2;
            }
            while (it.hasNext()) {
                i10 = i12 + 1;
                if (i12 < 0) {
                    CollectionsKt__CollectionsKt.throwIndexOverflow();
                }
                sInvoke = this.v0.invoke(Boxing.boxInt(i12), (S) next, (T) it.next());
                this.f82234t0 = sequenceScope;
                this.f82230p0 = it;
                this.f82231q0 = sInvoke;
                this.f82232r0 = i10;
                this.f82233s0 = 2;
                if (sequenceScope.yield(sInvoke, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                next = sInvoke;
                i12 = i10;
            }
            return Unit.INSTANCE;
            while (it.hasNext()) {
                i10 = i12 + 1;
                if (i12 < 0) {
                    CollectionsKt__CollectionsKt.throwIndexOverflow();
                }
                sInvoke = this.v0.invoke(Boxing.boxInt(i12), (S) next, (T) it.next());
                this.f82234t0 = sequenceScope;
                this.f82230p0 = it;
                this.f82231q0 = sInvoke;
                this.f82232r0 = i10;
                this.f82233s0 = 2;
                if (sequenceScope.yield(sInvoke, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                next = sInvoke;
                i12 = i10;
            }
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull SequenceScope<? super S> sequenceScope, @Nullable Continuation<? super Unit> continuation) {
            return ((p) create(sequenceScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [R, T] */
    /* JADX INFO: compiled from: _Sequences.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u00032\u0006\u0010\u0004\u001a\u0002H\u00022\u0006\u0010\u0005\u001a\u0002H\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"<anonymous>", "Lkotlin/Pair;", ExifInterface.GPS_DIRECTION_TRUE, "R", "t1", "t2", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class q<R, T> extends Lambda implements Function2<T, R, Pair<? extends T, ? extends R>> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final q f82236p0 = new q(2);

        public q() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        @NotNull
        public final Pair<T, R> invoke(T t10, R r3) {
            return TuplesKt.to(t10, r3);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: compiled from: _Sequences.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0003\u001a\u0002H\u00022\u0006\u0010\u0004\u001a\u0002H\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "Lkotlin/Pair;", ExifInterface.GPS_DIRECTION_TRUE, "a", "b", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class r<T> extends Lambda implements Function2<T, T, Pair<? extends T, ? extends T>> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final r f82237p0 = new r(2);

        public r() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        @NotNull
        public final Pair<T, T> invoke(T t10, T t11) {
            return TuplesKt.to(t10, t11);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [R] */
    /* JADX INFO: compiled from: _Sequences.kt */
    @DebugMetadata(c = "kotlin.sequences.SequencesKt___SequencesKt$zipWithNext$2", f = "_Sequences.kt", i = {0, 0, 0}, l = {2873}, m = "invokeSuspend", n = {"$this$result", "iterator", "next"}, s = {"L$0", "L$1", "L$2"})
    public static final class s<R> extends RestrictedSuspendLambda implements Function2<SequenceScope<? super R>, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public Iterator f82238p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public Object f82239q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public int f82240r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public /* synthetic */ Object f82241s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public final /* synthetic */ Sequence<T> f82242t0;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public final /* synthetic */ Function2<T, T, R> f82243u0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public s(Sequence<? extends T> sequence, Function2<? super T, ? super T, ? extends R> function2, Continuation<? super s> continuation) {
            super(2, continuation);
            this.f82242t0 = sequence;
            this.f82243u0 = function2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            s sVar = new s(this.f82242t0, this.f82243u0, continuation);
            sVar.f82241s0 = obj;
            return sVar;
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            SequenceScope sequenceScope;
            Object next;
            Iterator it;
            Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
            int i10 = this.f82240r0;
            if (i10 == 0) {
                ResultKt.throwOnFailure(obj);
                SequenceScope sequenceScope2 = (SequenceScope) this.f82241s0;
                Iterator it2 = this.f82242t0.iterator();
                if (!it2.hasNext()) {
                    return Unit.INSTANCE;
                }
                sequenceScope = sequenceScope2;
                next = it2.next();
                it = it2;
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                Object obj2 = this.f82239q0;
                it = this.f82238p0;
                sequenceScope = (SequenceScope) this.f82241s0;
                ResultKt.throwOnFailure(obj);
                next = obj2;
            }
            while (it.hasNext()) {
                Object next2 = it.next();
                R rInvoke = this.f82243u0.invoke((T) next, (T) next2);
                this.f82241s0 = sequenceScope;
                this.f82238p0 = it;
                this.f82239q0 = next2;
                this.f82240r0 = 1;
                if (sequenceScope.yield(rInvoke, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                next = next2;
            }
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull SequenceScope<? super R> sequenceScope, @Nullable Continuation<? super Unit> continuation) {
            return ((s) create(sequenceScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    public static final <T> boolean all(@NotNull Sequence<? extends T> sequence, @NotNull Function1<? super T, Boolean> function1) {
        Iterator itE = androidx.activity.a.e(sequence, "<this>", function1, "predicate");
        while (itE.hasNext()) {
            if (!function1.invoke((Object) itE.next()).booleanValue()) {
                return false;
            }
        }
        return true;
    }

    public static final <T> boolean any(@NotNull Sequence<? extends T> sequence, @NotNull Function1<? super T, Boolean> function1) {
        Iterator itE = androidx.activity.a.e(sequence, "<this>", function1, "predicate");
        while (itE.hasNext()) {
            if (function1.invoke((Object) itE.next()).booleanValue()) {
                return true;
            }
        }
        return false;
    }

    @NotNull
    public static <T> Iterable<T> asIterable(@NotNull Sequence<? extends T> sequence) {
        Intrinsics.checkNotNullParameter(sequence, "<this>");
        return new SequencesKt___SequencesKt$asIterable$$inlined$Iterable$1(sequence);
    }

    @NotNull
    public static final <T, K, V> Map<K, V> associate(@NotNull Sequence<? extends T> sequence, @NotNull Function1<? super T, ? extends Pair<? extends K, ? extends V>> transform) {
        Intrinsics.checkNotNullParameter(sequence, "<this>");
        Intrinsics.checkNotNullParameter(transform, "transform");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator<? extends T> it = sequence.iterator();
        while (it.hasNext()) {
            Pair<? extends K, ? extends V> pairInvoke = transform.invoke(it.next());
            linkedHashMap.put(pairInvoke.getFirst(), pairInvoke.getSecond());
        }
        return linkedHashMap;
    }

    @NotNull
    public static final <T, K> Map<K, T> associateBy(@NotNull Sequence<? extends T> sequence, @NotNull Function1<? super T, ? extends K> keySelector) {
        Intrinsics.checkNotNullParameter(sequence, "<this>");
        Intrinsics.checkNotNullParameter(keySelector, "keySelector");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (T t10 : sequence) {
            linkedHashMap.put(keySelector.invoke(t10), t10);
        }
        return linkedHashMap;
    }

    @NotNull
    public static final <T, K, M extends Map<? super K, ? super T>> M associateByTo(@NotNull Sequence<? extends T> sequence, @NotNull M destination, @NotNull Function1<? super T, ? extends K> keySelector) {
        Intrinsics.checkNotNullParameter(sequence, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(keySelector, "keySelector");
        for (T t10 : sequence) {
            destination.put(keySelector.invoke(t10), t10);
        }
        return destination;
    }

    @NotNull
    public static final <T, K, V, M extends Map<? super K, ? super V>> M associateTo(@NotNull Sequence<? extends T> sequence, @NotNull M destination, @NotNull Function1<? super T, ? extends Pair<? extends K, ? extends V>> transform) {
        Intrinsics.checkNotNullParameter(sequence, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(transform, "transform");
        Iterator<? extends T> it = sequence.iterator();
        while (it.hasNext()) {
            Pair<? extends K, ? extends V> pairInvoke = transform.invoke(it.next());
            destination.put(pairInvoke.getFirst(), pairInvoke.getSecond());
        }
        return destination;
    }

    @SinceKotlin(version = "1.3")
    @NotNull
    public static final <K, V> Map<K, V> associateWith(@NotNull Sequence<? extends K> sequence, @NotNull Function1<? super K, ? extends V> valueSelector) {
        Intrinsics.checkNotNullParameter(sequence, "<this>");
        Intrinsics.checkNotNullParameter(valueSelector, "valueSelector");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (K k10 : sequence) {
            linkedHashMap.put(k10, valueSelector.invoke(k10));
        }
        return linkedHashMap;
    }

    @SinceKotlin(version = "1.3")
    @NotNull
    public static final <K, V, M extends Map<? super K, ? super V>> M associateWithTo(@NotNull Sequence<? extends K> sequence, @NotNull M destination, @NotNull Function1<? super K, ? extends V> valueSelector) {
        Intrinsics.checkNotNullParameter(sequence, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(valueSelector, "valueSelector");
        for (K k10 : sequence) {
            destination.put(k10, valueSelector.invoke(k10));
        }
        return destination;
    }

    @JvmName(name = "averageOfByte")
    public static final double averageOfByte(@NotNull Sequence<Byte> sequence) {
        Intrinsics.checkNotNullParameter(sequence, "<this>");
        Iterator<Byte> it = sequence.iterator();
        double dByteValue = 0.0d;
        int i10 = 0;
        while (it.hasNext()) {
            dByteValue += (double) it.next().byteValue();
            i10++;
            if (i10 < 0) {
                CollectionsKt__CollectionsKt.throwCountOverflow();
            }
        }
        if (i10 == 0) {
            return Double.NaN;
        }
        return dByteValue / ((double) i10);
    }

    @JvmName(name = "averageOfDouble")
    public static final double averageOfDouble(@NotNull Sequence<Double> sequence) {
        Intrinsics.checkNotNullParameter(sequence, "<this>");
        Iterator<Double> it = sequence.iterator();
        double dDoubleValue = 0.0d;
        int i10 = 0;
        while (it.hasNext()) {
            dDoubleValue += it.next().doubleValue();
            i10++;
            if (i10 < 0) {
                CollectionsKt__CollectionsKt.throwCountOverflow();
            }
        }
        if (i10 == 0) {
            return Double.NaN;
        }
        return dDoubleValue / ((double) i10);
    }

    @JvmName(name = "averageOfFloat")
    public static final double averageOfFloat(@NotNull Sequence<Float> sequence) {
        Intrinsics.checkNotNullParameter(sequence, "<this>");
        Iterator<Float> it = sequence.iterator();
        double dFloatValue = 0.0d;
        int i10 = 0;
        while (it.hasNext()) {
            dFloatValue += (double) it.next().floatValue();
            i10++;
            if (i10 < 0) {
                CollectionsKt__CollectionsKt.throwCountOverflow();
            }
        }
        if (i10 == 0) {
            return Double.NaN;
        }
        return dFloatValue / ((double) i10);
    }

    @JvmName(name = "averageOfInt")
    public static final double averageOfInt(@NotNull Sequence<Integer> sequence) {
        Intrinsics.checkNotNullParameter(sequence, "<this>");
        Iterator<Integer> it = sequence.iterator();
        double dIntValue = 0.0d;
        int i10 = 0;
        while (it.hasNext()) {
            dIntValue += (double) it.next().intValue();
            i10++;
            if (i10 < 0) {
                CollectionsKt__CollectionsKt.throwCountOverflow();
            }
        }
        if (i10 == 0) {
            return Double.NaN;
        }
        return dIntValue / ((double) i10);
    }

    @JvmName(name = "averageOfLong")
    public static final double averageOfLong(@NotNull Sequence<Long> sequence) {
        Intrinsics.checkNotNullParameter(sequence, "<this>");
        Iterator<Long> it = sequence.iterator();
        double dLongValue = 0.0d;
        int i10 = 0;
        while (it.hasNext()) {
            dLongValue += it.next().longValue();
            i10++;
            if (i10 < 0) {
                CollectionsKt__CollectionsKt.throwCountOverflow();
            }
        }
        if (i10 == 0) {
            return Double.NaN;
        }
        return dLongValue / ((double) i10);
    }

    @JvmName(name = "averageOfShort")
    public static final double averageOfShort(@NotNull Sequence<Short> sequence) {
        Intrinsics.checkNotNullParameter(sequence, "<this>");
        Iterator<Short> it = sequence.iterator();
        double dShortValue = 0.0d;
        int i10 = 0;
        while (it.hasNext()) {
            dShortValue += (double) it.next().shortValue();
            i10++;
            if (i10 < 0) {
                CollectionsKt__CollectionsKt.throwCountOverflow();
            }
        }
        if (i10 == 0) {
            return Double.NaN;
        }
        return dShortValue / ((double) i10);
    }

    @SinceKotlin(version = "1.2")
    @NotNull
    public static final <T> Sequence<List<T>> chunked(@NotNull Sequence<? extends T> sequence, int i10) {
        Intrinsics.checkNotNullParameter(sequence, "<this>");
        return windowed(sequence, i10, i10, true);
    }

    public static <T> boolean contains(@NotNull Sequence<? extends T> sequence, T t10) {
        Intrinsics.checkNotNullParameter(sequence, "<this>");
        return indexOf(sequence, t10) >= 0;
    }

    public static final <T> int count(@NotNull Sequence<? extends T> sequence, @NotNull Function1<? super T, Boolean> function1) {
        Iterator itE = androidx.activity.a.e(sequence, "<this>", function1, "predicate");
        int i10 = 0;
        while (itE.hasNext()) {
            if (function1.invoke((Object) itE.next()).booleanValue() && (i10 = i10 + 1) < 0) {
                if (!PlatformImplementationsKt.apiVersionIsAtLeast(1, 3, 0)) {
                    throw new ArithmeticException("Count overflow has happened.");
                }
                CollectionsKt__CollectionsKt.throwCountOverflow();
            }
        }
        return i10;
    }

    @NotNull
    public static final <T> Sequence<T> distinct(@NotNull Sequence<? extends T> sequence) {
        Intrinsics.checkNotNullParameter(sequence, "<this>");
        return distinctBy(sequence, a.f82183p0);
    }

    @NotNull
    public static final <T, K> Sequence<T> distinctBy(@NotNull Sequence<? extends T> sequence, @NotNull Function1<? super T, ? extends K> selector) {
        Intrinsics.checkNotNullParameter(sequence, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        return new DistinctSequence(sequence, selector);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    public static <T> Sequence<T> drop(@NotNull Sequence<? extends T> sequence, int i10) {
        Intrinsics.checkNotNullParameter(sequence, "<this>");
        if (i10 < 0) {
            throw new IllegalArgumentException(androidx.camera.core.impl.utils.b.a("Requested element count ", i10, " is less than zero.").toString());
        }
        if (i10 == 0) {
            return sequence;
        }
        return sequence instanceof DropTakeSequence ? ((DropTakeSequence) sequence).drop(i10) : new DropSequence(sequence, i10);
    }

    @NotNull
    public static final <T> Sequence<T> dropWhile(@NotNull Sequence<? extends T> sequence, @NotNull Function1<? super T, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(sequence, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        return new DropWhileSequence(sequence, predicate);
    }

    public static final <T> T elementAt(@NotNull Sequence<? extends T> sequence, int i10) {
        Intrinsics.checkNotNullParameter(sequence, "<this>");
        return (T) elementAtOrElse(sequence, i10, new b(i10));
    }

    public static final <T> T elementAtOrElse(@NotNull Sequence<? extends T> sequence, int i10, @NotNull Function1<? super Integer, ? extends T> defaultValue) {
        Intrinsics.checkNotNullParameter(sequence, "<this>");
        Intrinsics.checkNotNullParameter(defaultValue, "defaultValue");
        if (i10 < 0) {
            return defaultValue.invoke(Integer.valueOf(i10));
        }
        int i11 = 0;
        for (T t10 : sequence) {
            int i12 = i11 + 1;
            if (i10 == i11) {
                return t10;
            }
            i11 = i12;
        }
        return defaultValue.invoke(Integer.valueOf(i10));
    }

    @Nullable
    public static final <T> T elementAtOrNull(@NotNull Sequence<? extends T> sequence, int i10) {
        Intrinsics.checkNotNullParameter(sequence, "<this>");
        if (i10 < 0) {
            return null;
        }
        int i11 = 0;
        for (T t10 : sequence) {
            int i12 = i11 + 1;
            if (i10 == i11) {
                return t10;
            }
            i11 = i12;
        }
        return null;
    }

    @NotNull
    public static <T> Sequence<T> filter(@NotNull Sequence<? extends T> sequence, @NotNull Function1<? super T, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(sequence, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        return new FilteringSequence(sequence, true, predicate);
    }

    @NotNull
    public static final <T> Sequence<T> filterIndexed(@NotNull Sequence<? extends T> sequence, @NotNull Function2<? super Integer, ? super T, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(sequence, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        return new TransformingSequence(new FilteringSequence(new IndexingSequence(sequence), true, new c(predicate)), d.f82187p0);
    }

    @NotNull
    public static final <T, C extends Collection<? super T>> C filterIndexedTo(@NotNull Sequence<? extends T> sequence, @NotNull C destination, @NotNull Function2<? super Integer, ? super T, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(sequence, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int i10 = 0;
        for (T t10 : sequence) {
            int i11 = i10 + 1;
            if (i10 < 0) {
                if (!PlatformImplementationsKt.apiVersionIsAtLeast(1, 3, 0)) {
                    throw new ArithmeticException("Index overflow has happened.");
                }
                CollectionsKt__CollectionsKt.throwIndexOverflow();
            }
            if (predicate.invoke(Integer.valueOf(i10), t10).booleanValue()) {
                destination.add(t10);
            }
            i10 = i11;
        }
        return destination;
    }

    public static final /* synthetic */ <R> Sequence<R> filterIsInstance(Sequence<?> sequence) {
        Intrinsics.checkNotNullParameter(sequence, "<this>");
        Intrinsics.needClassReification();
        Sequence<R> sequenceFilter = filter(sequence, new Function1<Object, Boolean>() { // from class: kotlin.sequences.SequencesKt___SequencesKt.filterIsInstance.1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function1
            @NotNull
            public final Boolean invoke(@Nullable Object obj) {
                Intrinsics.reifiedOperationMarker(3, "R");
                return Boolean.valueOf(obj instanceof Object);
            }
        });
        Intrinsics.checkNotNull(sequenceFilter, "null cannot be cast to non-null type kotlin.sequences.Sequence<R of kotlin.sequences.SequencesKt___SequencesKt.filterIsInstance>");
        return sequenceFilter;
    }

    public static final /* synthetic */ <R, C extends Collection<? super R>> C filterIsInstanceTo(Sequence<?> sequence, C destination) {
        Intrinsics.checkNotNullParameter(sequence, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        for (Object obj : sequence) {
            Intrinsics.reifiedOperationMarker(3, "R");
            if (obj instanceof Object) {
                destination.add(obj);
            }
        }
        return destination;
    }

    @NotNull
    public static <T> Sequence<T> filterNot(@NotNull Sequence<? extends T> sequence, @NotNull Function1<? super T, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(sequence, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        return new FilteringSequence(sequence, false, predicate);
    }

    @NotNull
    public static <T> Sequence<T> filterNotNull(@NotNull Sequence<? extends T> sequence) {
        Intrinsics.checkNotNullParameter(sequence, "<this>");
        Sequence<T> sequenceFilterNot = filterNot(sequence, e.f82188p0);
        Intrinsics.checkNotNull(sequenceFilterNot, "null cannot be cast to non-null type kotlin.sequences.Sequence<T of kotlin.sequences.SequencesKt___SequencesKt.filterNotNull>");
        return sequenceFilterNot;
    }

    @NotNull
    public static final <C extends Collection<? super T>, T> C filterNotNullTo(@NotNull Sequence<? extends T> sequence, @NotNull C destination) {
        Intrinsics.checkNotNullParameter(sequence, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        for (T t10 : sequence) {
            if (t10 != null) {
                destination.add(t10);
            }
        }
        return destination;
    }

    @NotNull
    public static final <T, C extends Collection<? super T>> C filterNotTo(@NotNull Sequence<? extends T> sequence, @NotNull C destination, @NotNull Function1<? super T, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(sequence, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        for (T t10 : sequence) {
            if (!predicate.invoke(t10).booleanValue()) {
                destination.add(t10);
            }
        }
        return destination;
    }

    @NotNull
    public static final <T, C extends Collection<? super T>> C filterTo(@NotNull Sequence<? extends T> sequence, @NotNull C destination, @NotNull Function1<? super T, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(sequence, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        for (T t10 : sequence) {
            if (predicate.invoke(t10).booleanValue()) {
                destination.add(t10);
            }
        }
        return destination;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [T, java.lang.Object] */
    public static final <T> T first(@NotNull Sequence<? extends T> sequence, @NotNull Function1<? super T, Boolean> function1) {
        Iterator itE = androidx.activity.a.e(sequence, "<this>", function1, "predicate");
        while (itE.hasNext()) {
            ?? r1 = (Object) itE.next();
            if (function1.invoke(r1).booleanValue()) {
                return r1;
            }
        }
        throw new NoSuchElementException("Sequence contains no element matching the predicate.");
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [T, java.lang.Object] */
    @Nullable
    public static final <T> T firstOrNull(@NotNull Sequence<? extends T> sequence, @NotNull Function1<? super T, Boolean> function1) {
        Iterator itE = androidx.activity.a.e(sequence, "<this>", function1, "predicate");
        while (itE.hasNext()) {
            ?? r1 = (Object) itE.next();
            if (function1.invoke(r1).booleanValue()) {
                return r1;
            }
        }
        return null;
    }

    @NotNull
    public static <T, R> Sequence<R> flatMap(@NotNull Sequence<? extends T> sequence, @NotNull Function1<? super T, ? extends Sequence<? extends R>> transform) {
        Intrinsics.checkNotNullParameter(sequence, "<this>");
        Intrinsics.checkNotNullParameter(transform, "transform");
        return new FlatteningSequence(sequence, transform, g.f82190p0);
    }

    @SinceKotlin(version = "1.4")
    @JvmName(name = "flatMapIndexedIterable")
    @NotNull
    @OverloadResolutionByLambdaReturnType
    public static final <T, R> Sequence<R> flatMapIndexedIterable(@NotNull Sequence<? extends T> sequence, @NotNull Function2<? super Integer, ? super T, ? extends Iterable<? extends R>> transform) {
        Intrinsics.checkNotNullParameter(sequence, "<this>");
        Intrinsics.checkNotNullParameter(transform, "transform");
        return SequencesKt__SequencesKt.flatMapIndexed(sequence, transform, h.f82193p0);
    }

    @SinceKotlin(version = "1.4")
    @JvmName(name = "flatMapIndexedSequence")
    @NotNull
    @OverloadResolutionByLambdaReturnType
    public static final <T, R> Sequence<R> flatMapIndexedSequence(@NotNull Sequence<? extends T> sequence, @NotNull Function2<? super Integer, ? super T, ? extends Sequence<? extends R>> transform) {
        Intrinsics.checkNotNullParameter(sequence, "<this>");
        Intrinsics.checkNotNullParameter(transform, "transform");
        return SequencesKt__SequencesKt.flatMapIndexed(sequence, transform, i.f82194p0);
    }

    @SinceKotlin(version = "1.4")
    @JvmName(name = "flatMapIterable")
    @NotNull
    @OverloadResolutionByLambdaReturnType
    public static final <T, R> Sequence<R> flatMapIterable(@NotNull Sequence<? extends T> sequence, @NotNull Function1<? super T, ? extends Iterable<? extends R>> transform) {
        Intrinsics.checkNotNullParameter(sequence, "<this>");
        Intrinsics.checkNotNullParameter(transform, "transform");
        return new FlatteningSequence(sequence, transform, f.f82189p0);
    }

    @SinceKotlin(version = "1.4")
    @JvmName(name = "flatMapIterableTo")
    @NotNull
    @OverloadResolutionByLambdaReturnType
    public static final <T, R, C extends Collection<? super R>> C flatMapIterableTo(@NotNull Sequence<? extends T> sequence, @NotNull C destination, @NotNull Function1<? super T, ? extends Iterable<? extends R>> transform) {
        Intrinsics.checkNotNullParameter(sequence, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(transform, "transform");
        Iterator<? extends T> it = sequence.iterator();
        while (it.hasNext()) {
            bk.g.addAll(destination, transform.invoke(it.next()));
        }
        return destination;
    }

    @NotNull
    public static final <T, R, C extends Collection<? super R>> C flatMapTo(@NotNull Sequence<? extends T> sequence, @NotNull C destination, @NotNull Function1<? super T, ? extends Sequence<? extends R>> transform) {
        Intrinsics.checkNotNullParameter(sequence, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(transform, "transform");
        Iterator<? extends T> it = sequence.iterator();
        while (it.hasNext()) {
            bk.g.addAll(destination, transform.invoke(it.next()));
        }
        return destination;
    }

    public static final <T, R> R fold(@NotNull Sequence<? extends T> sequence, R r3, @NotNull Function2<? super R, ? super T, ? extends R> operation) {
        Intrinsics.checkNotNullParameter(sequence, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        Iterator<? extends T> it = sequence.iterator();
        while (it.hasNext()) {
            r3 = operation.invoke(r3, it.next());
        }
        return r3;
    }

    public static final <T, R> R foldIndexed(@NotNull Sequence<? extends T> sequence, R r3, @NotNull Function3<? super Integer, ? super R, ? super T, ? extends R> operation) {
        Intrinsics.checkNotNullParameter(sequence, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        int i10 = 0;
        for (T t10 : sequence) {
            int i11 = i10 + 1;
            if (i10 < 0) {
                if (!PlatformImplementationsKt.apiVersionIsAtLeast(1, 3, 0)) {
                    throw new ArithmeticException("Index overflow has happened.");
                }
                CollectionsKt__CollectionsKt.throwIndexOverflow();
            }
            r3 = operation.invoke(Integer.valueOf(i10), r3, t10);
            i10 = i11;
        }
        return r3;
    }

    public static final <T> void forEach(@NotNull Sequence<? extends T> sequence, @NotNull Function1<? super T, Unit> function1) {
        Iterator itE = androidx.activity.a.e(sequence, "<this>", function1, "action");
        while (itE.hasNext()) {
            function1.invoke((Object) itE.next());
        }
    }

    public static final <T> void forEachIndexed(@NotNull Sequence<? extends T> sequence, @NotNull Function2<? super Integer, ? super T, Unit> action) {
        Intrinsics.checkNotNullParameter(sequence, "<this>");
        Intrinsics.checkNotNullParameter(action, "action");
        int i10 = 0;
        for (T t10 : sequence) {
            int i11 = i10 + 1;
            if (i10 < 0) {
                if (!PlatformImplementationsKt.apiVersionIsAtLeast(1, 3, 0)) {
                    throw new ArithmeticException("Index overflow has happened.");
                }
                CollectionsKt__CollectionsKt.throwIndexOverflow();
            }
            action.invoke(Integer.valueOf(i10), t10);
            i10 = i11;
        }
    }

    @NotNull
    public static final <T, K> Map<K, List<T>> groupBy(@NotNull Sequence<? extends T> sequence, @NotNull Function1<? super T, ? extends K> keySelector) {
        Intrinsics.checkNotNullParameter(sequence, "<this>");
        Intrinsics.checkNotNullParameter(keySelector, "keySelector");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (T t10 : sequence) {
            K kInvoke = keySelector.invoke(t10);
            Object objC = linkedHashMap.get(kInvoke);
            if (objC == null) {
                objC = androidx.constraintlayout.core.state.a.c(linkedHashMap, kInvoke);
            }
            ((List) objC).add(t10);
        }
        return linkedHashMap;
    }

    @NotNull
    public static final <T, K, M extends Map<? super K, List<T>>> M groupByTo(@NotNull Sequence<? extends T> sequence, @NotNull M destination, @NotNull Function1<? super T, ? extends K> keySelector) {
        Intrinsics.checkNotNullParameter(sequence, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(keySelector, "keySelector");
        for (T t10 : sequence) {
            K kInvoke = keySelector.invoke(t10);
            Object objC = destination.get(kInvoke);
            if (objC == null) {
                objC = androidx.fragment.app.a.c(destination, kInvoke);
            }
            ((List) objC).add(t10);
        }
        return destination;
    }

    @SinceKotlin(version = "1.1")
    @NotNull
    public static final <T, K> Grouping<T, K> groupingBy(@NotNull final Sequence<? extends T> sequence, @NotNull final Function1<? super T, ? extends K> keySelector) {
        Intrinsics.checkNotNullParameter(sequence, "<this>");
        Intrinsics.checkNotNullParameter(keySelector, "keySelector");
        return new Grouping<T, K>() { // from class: kotlin.sequences.SequencesKt___SequencesKt.groupingBy.1
            @Override // kotlin.collections.Grouping
            public K keyOf(T element) {
                return keySelector.invoke(element);
            }

            @Override // kotlin.collections.Grouping
            @NotNull
            public Iterator<T> sourceIterator() {
                return sequence.iterator();
            }
        };
    }

    public static final <T> int indexOf(@NotNull Sequence<? extends T> sequence, T t10) {
        Intrinsics.checkNotNullParameter(sequence, "<this>");
        int i10 = 0;
        for (T t11 : sequence) {
            if (i10 < 0) {
                CollectionsKt__CollectionsKt.throwIndexOverflow();
            }
            if (Intrinsics.areEqual(t10, t11)) {
                return i10;
            }
            i10++;
        }
        return -1;
    }

    public static final <T> int indexOfFirst(@NotNull Sequence<? extends T> sequence, @NotNull Function1<? super T, Boolean> function1) {
        Iterator itE = androidx.activity.a.e(sequence, "<this>", function1, "predicate");
        int i10 = 0;
        while (itE.hasNext()) {
            a.e eVar = (Object) itE.next();
            if (i10 < 0) {
                if (!PlatformImplementationsKt.apiVersionIsAtLeast(1, 3, 0)) {
                    throw new ArithmeticException("Index overflow has happened.");
                }
                CollectionsKt__CollectionsKt.throwIndexOverflow();
            }
            if (function1.invoke(eVar).booleanValue()) {
                return i10;
            }
            i10++;
        }
        return -1;
    }

    public static final <T> int indexOfLast(@NotNull Sequence<? extends T> sequence, @NotNull Function1<? super T, Boolean> function1) {
        Iterator itE = androidx.activity.a.e(sequence, "<this>", function1, "predicate");
        int i10 = -1;
        int i11 = 0;
        while (itE.hasNext()) {
            a.e eVar = (Object) itE.next();
            if (i11 < 0) {
                if (!PlatformImplementationsKt.apiVersionIsAtLeast(1, 3, 0)) {
                    throw new ArithmeticException("Index overflow has happened.");
                }
                CollectionsKt__CollectionsKt.throwIndexOverflow();
            }
            if (function1.invoke(eVar).booleanValue()) {
                i10 = i11;
            }
            i11++;
        }
        return i10;
    }

    @NotNull
    public static final <T, A extends Appendable> A joinTo(@NotNull Sequence<? extends T> sequence, @NotNull A buffer, @NotNull CharSequence separator, @NotNull CharSequence prefix, @NotNull CharSequence postfix, int i10, @NotNull CharSequence truncated, @Nullable Function1<? super T, ? extends CharSequence> function1) throws IOException {
        Intrinsics.checkNotNullParameter(sequence, "<this>");
        Intrinsics.checkNotNullParameter(buffer, "buffer");
        Intrinsics.checkNotNullParameter(separator, "separator");
        Intrinsics.checkNotNullParameter(prefix, "prefix");
        Intrinsics.checkNotNullParameter(postfix, "postfix");
        Intrinsics.checkNotNullParameter(truncated, "truncated");
        buffer.append(prefix);
        int i11 = 0;
        for (T t10 : sequence) {
            i11++;
            if (i11 > 1) {
                buffer.append(separator);
            }
            if (i10 >= 0 && i11 > i10) {
                break;
            }
            kotlin.text.d.appendElement(buffer, t10, function1);
        }
        if (i10 >= 0 && i11 > i10) {
            buffer.append(truncated);
        }
        buffer.append(postfix);
        return buffer;
    }

    @NotNull
    public static final <T> String joinToString(@NotNull Sequence<? extends T> sequence, @NotNull CharSequence separator, @NotNull CharSequence prefix, @NotNull CharSequence postfix, int i10, @NotNull CharSequence truncated, @Nullable Function1<? super T, ? extends CharSequence> function1) {
        Intrinsics.checkNotNullParameter(sequence, "<this>");
        Intrinsics.checkNotNullParameter(separator, "separator");
        Intrinsics.checkNotNullParameter(prefix, "prefix");
        Intrinsics.checkNotNullParameter(postfix, "postfix");
        Intrinsics.checkNotNullParameter(truncated, "truncated");
        String string = ((StringBuilder) joinTo(sequence, new StringBuilder(), separator, prefix, postfix, i10, truncated, function1)).toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }

    public static /* synthetic */ String joinToString$default(Sequence sequence, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i10, CharSequence charSequence4, Function1 function1, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            charSequence = ", ";
        }
        CharSequence charSequence5 = (i11 & 2) != 0 ? "" : charSequence2;
        CharSequence charSequence6 = (i11 & 4) == 0 ? charSequence3 : "";
        if ((i11 & 8) != 0) {
            i10 = -1;
        }
        int i12 = i10;
        if ((i11 & 16) != 0) {
            charSequence4 = "...";
        }
        CharSequence charSequence7 = charSequence4;
        if ((i11 & 32) != 0) {
            function1 = null;
        }
        return joinToString(sequence, charSequence, charSequence5, charSequence6, i12, charSequence7, function1);
    }

    public static final <T> T last(@NotNull Sequence<? extends T> sequence, @NotNull Function1<? super T, Boolean> function1) {
        Iterator itE = androidx.activity.a.e(sequence, "<this>", function1, "predicate");
        T t10 = null;
        boolean z10 = false;
        while (itE.hasNext()) {
            Object obj = (Object) itE.next();
            if (function1.invoke(obj).booleanValue()) {
                z10 = true;
                t10 = (T) obj;
            }
        }
        if (z10) {
            return t10;
        }
        throw new NoSuchElementException("Sequence contains no element matching the predicate.");
    }

    public static final <T> int lastIndexOf(@NotNull Sequence<? extends T> sequence, T t10) {
        Intrinsics.checkNotNullParameter(sequence, "<this>");
        int i10 = -1;
        int i11 = 0;
        for (T t11 : sequence) {
            if (i11 < 0) {
                CollectionsKt__CollectionsKt.throwIndexOverflow();
            }
            if (Intrinsics.areEqual(t10, t11)) {
                i10 = i11;
            }
            i11++;
        }
        return i10;
    }

    @Nullable
    public static final <T> T lastOrNull(@NotNull Sequence<? extends T> sequence, @NotNull Function1<? super T, Boolean> function1) {
        Iterator itE = androidx.activity.a.e(sequence, "<this>", function1, "predicate");
        T t10 = null;
        while (itE.hasNext()) {
            Object obj = (Object) itE.next();
            if (function1.invoke(obj).booleanValue()) {
                t10 = (T) obj;
            }
        }
        return t10;
    }

    @NotNull
    public static <T, R> Sequence<R> map(@NotNull Sequence<? extends T> sequence, @NotNull Function1<? super T, ? extends R> transform) {
        Intrinsics.checkNotNullParameter(sequence, "<this>");
        Intrinsics.checkNotNullParameter(transform, "transform");
        return new TransformingSequence(sequence, transform);
    }

    @NotNull
    public static final <T, R> Sequence<R> mapIndexed(@NotNull Sequence<? extends T> sequence, @NotNull Function2<? super Integer, ? super T, ? extends R> transform) {
        Intrinsics.checkNotNullParameter(sequence, "<this>");
        Intrinsics.checkNotNullParameter(transform, "transform");
        return new TransformingIndexedSequence(sequence, transform);
    }

    @NotNull
    public static final <T, R> Sequence<R> mapIndexedNotNull(@NotNull Sequence<? extends T> sequence, @NotNull Function2<? super Integer, ? super T, ? extends R> transform) {
        Intrinsics.checkNotNullParameter(sequence, "<this>");
        Intrinsics.checkNotNullParameter(transform, "transform");
        return filterNotNull(new TransformingIndexedSequence(sequence, transform));
    }

    @NotNull
    public static final <T, R, C extends Collection<? super R>> C mapIndexedNotNullTo(@NotNull Sequence<? extends T> sequence, @NotNull C destination, @NotNull Function2<? super Integer, ? super T, ? extends R> transform) {
        Intrinsics.checkNotNullParameter(sequence, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(transform, "transform");
        int i10 = 0;
        for (T t10 : sequence) {
            int i11 = i10 + 1;
            if (i10 < 0) {
                if (!PlatformImplementationsKt.apiVersionIsAtLeast(1, 3, 0)) {
                    throw new ArithmeticException("Index overflow has happened.");
                }
                CollectionsKt__CollectionsKt.throwIndexOverflow();
            }
            R rInvoke = transform.invoke(Integer.valueOf(i10), t10);
            if (rInvoke != null) {
                destination.add(rInvoke);
            }
            i10 = i11;
        }
        return destination;
    }

    @NotNull
    public static final <T, R, C extends Collection<? super R>> C mapIndexedTo(@NotNull Sequence<? extends T> sequence, @NotNull C destination, @NotNull Function2<? super Integer, ? super T, ? extends R> transform) {
        Intrinsics.checkNotNullParameter(sequence, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(transform, "transform");
        int i10 = 0;
        for (T t10 : sequence) {
            int i11 = i10 + 1;
            if (i10 < 0) {
                if (!PlatformImplementationsKt.apiVersionIsAtLeast(1, 3, 0)) {
                    throw new ArithmeticException("Index overflow has happened.");
                }
                CollectionsKt__CollectionsKt.throwIndexOverflow();
            }
            destination.add(transform.invoke(Integer.valueOf(i10), t10));
            i10 = i11;
        }
        return destination;
    }

    @NotNull
    public static <T, R> Sequence<R> mapNotNull(@NotNull Sequence<? extends T> sequence, @NotNull Function1<? super T, ? extends R> transform) {
        Intrinsics.checkNotNullParameter(sequence, "<this>");
        Intrinsics.checkNotNullParameter(transform, "transform");
        return filterNotNull(new TransformingSequence(sequence, transform));
    }

    @NotNull
    public static final <T, R, C extends Collection<? super R>> C mapNotNullTo(@NotNull Sequence<? extends T> sequence, @NotNull C destination, @NotNull Function1<? super T, ? extends R> transform) {
        Intrinsics.checkNotNullParameter(sequence, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(transform, "transform");
        Iterator<? extends T> it = sequence.iterator();
        while (it.hasNext()) {
            R rInvoke = transform.invoke(it.next());
            if (rInvoke != null) {
                destination.add(rInvoke);
            }
        }
        return destination;
    }

    @NotNull
    public static final <T, R, C extends Collection<? super R>> C mapTo(@NotNull Sequence<? extends T> sequence, @NotNull C destination, @NotNull Function1<? super T, ? extends R> transform) {
        Intrinsics.checkNotNullParameter(sequence, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(transform, "transform");
        Iterator<? extends T> it = sequence.iterator();
        while (it.hasNext()) {
            destination.add(transform.invoke(it.next()));
        }
        return destination;
    }

    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v2, types: [T, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v4, types: [T] */
    /* JADX WARN: Type inference failed for: r0v9 */
    @SinceKotlin(version = "1.4")
    @Nullable
    public static final <T, R extends Comparable<? super R>> T maxByOrNull(@NotNull Sequence<? extends T> sequence, @NotNull Function1<? super T, ? extends R> function1) {
        Iterator itE = androidx.activity.a.e(sequence, "<this>", function1, "selector");
        if (!itE.hasNext()) {
            return null;
        }
        ?? r1 = (Object) itE.next();
        if (!itE.hasNext()) {
            return r1;
        }
        R rInvoke = function1.invoke(r1);
        do {
            Object obj = (Object) itE.next();
            R rInvoke2 = function1.invoke(obj);
            r1 = r1;
            if (rInvoke.compareTo(rInvoke2) < 0) {
                rInvoke = rInvoke2;
                r1 = (T) obj;
            }
        } while (itE.hasNext());
        return (T) r1;
    }

    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v2, types: [T, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v4, types: [T] */
    /* JADX WARN: Type inference failed for: r0v9 */
    @SinceKotlin(version = "1.7")
    @JvmName(name = "maxByOrThrow")
    public static final <T, R extends Comparable<? super R>> T maxByOrThrow(@NotNull Sequence<? extends T> sequence, @NotNull Function1<? super T, ? extends R> function1) {
        Iterator itE = androidx.activity.a.e(sequence, "<this>", function1, "selector");
        if (!itE.hasNext()) {
            throw new NoSuchElementException();
        }
        ?? r1 = (Object) itE.next();
        if (!itE.hasNext()) {
            return r1;
        }
        R rInvoke = function1.invoke(r1);
        do {
            Object obj = (Object) itE.next();
            R rInvoke2 = function1.invoke(obj);
            r1 = r1;
            if (rInvoke.compareTo(rInvoke2) < 0) {
                rInvoke = rInvoke2;
                r1 = (T) obj;
            }
        } while (itE.hasNext());
        return (T) r1;
    }

    @SinceKotlin(version = "1.4")
    @Nullable
    /* JADX INFO: renamed from: maxOrNull, reason: collision with other method in class */
    public static final Double m5784maxOrNull(@NotNull Sequence<Double> sequence) {
        Intrinsics.checkNotNullParameter(sequence, "<this>");
        Iterator<Double> it = sequence.iterator();
        if (!it.hasNext()) {
            return null;
        }
        double dDoubleValue = it.next().doubleValue();
        while (it.hasNext()) {
            dDoubleValue = Math.max(dDoubleValue, it.next().doubleValue());
        }
        return Double.valueOf(dDoubleValue);
    }

    @SinceKotlin(version = "1.7")
    @JvmName(name = "maxOrThrow")
    public static final double maxOrThrow(@NotNull Sequence<Double> sequence) {
        Intrinsics.checkNotNullParameter(sequence, "<this>");
        Iterator<Double> it = sequence.iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException();
        }
        double dDoubleValue = it.next().doubleValue();
        while (it.hasNext()) {
            dDoubleValue = Math.max(dDoubleValue, it.next().doubleValue());
        }
        return dDoubleValue;
    }

    @SinceKotlin(version = "1.4")
    @Nullable
    public static final <T> T maxWithOrNull(@NotNull Sequence<? extends T> sequence, @NotNull Comparator<? super T> comparator) {
        Intrinsics.checkNotNullParameter(sequence, "<this>");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        Iterator<? extends T> it = sequence.iterator();
        if (!it.hasNext()) {
            return null;
        }
        T next = it.next();
        while (it.hasNext()) {
            T next2 = it.next();
            if (comparator.compare(next, next2) < 0) {
                next = next2;
            }
        }
        return next;
    }

    @SinceKotlin(version = "1.7")
    @JvmName(name = "maxWithOrThrow")
    public static final <T> T maxWithOrThrow(@NotNull Sequence<? extends T> sequence, @NotNull Comparator<? super T> comparator) {
        Intrinsics.checkNotNullParameter(sequence, "<this>");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        Iterator<? extends T> it = sequence.iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException();
        }
        T next = it.next();
        while (it.hasNext()) {
            T next2 = it.next();
            if (comparator.compare(next, next2) < 0) {
                next = next2;
            }
        }
        return next;
    }

    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v2, types: [T, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v4, types: [T] */
    /* JADX WARN: Type inference failed for: r0v9 */
    @SinceKotlin(version = "1.4")
    @Nullable
    public static final <T, R extends Comparable<? super R>> T minByOrNull(@NotNull Sequence<? extends T> sequence, @NotNull Function1<? super T, ? extends R> function1) {
        Iterator itE = androidx.activity.a.e(sequence, "<this>", function1, "selector");
        if (!itE.hasNext()) {
            return null;
        }
        ?? r1 = (Object) itE.next();
        if (!itE.hasNext()) {
            return r1;
        }
        R rInvoke = function1.invoke(r1);
        do {
            Object obj = (Object) itE.next();
            R rInvoke2 = function1.invoke(obj);
            r1 = r1;
            if (rInvoke.compareTo(rInvoke2) > 0) {
                rInvoke = rInvoke2;
                r1 = (T) obj;
            }
        } while (itE.hasNext());
        return (T) r1;
    }

    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v2, types: [T, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v4, types: [T] */
    /* JADX WARN: Type inference failed for: r0v9 */
    @SinceKotlin(version = "1.7")
    @JvmName(name = "minByOrThrow")
    public static final <T, R extends Comparable<? super R>> T minByOrThrow(@NotNull Sequence<? extends T> sequence, @NotNull Function1<? super T, ? extends R> function1) {
        Iterator itE = androidx.activity.a.e(sequence, "<this>", function1, "selector");
        if (!itE.hasNext()) {
            throw new NoSuchElementException();
        }
        ?? r1 = (Object) itE.next();
        if (!itE.hasNext()) {
            return r1;
        }
        R rInvoke = function1.invoke(r1);
        do {
            Object obj = (Object) itE.next();
            R rInvoke2 = function1.invoke(obj);
            r1 = r1;
            if (rInvoke.compareTo(rInvoke2) > 0) {
                rInvoke = rInvoke2;
                r1 = (T) obj;
            }
        } while (itE.hasNext());
        return (T) r1;
    }

    @SinceKotlin(version = "1.4")
    @Nullable
    /* JADX INFO: renamed from: minOrNull, reason: collision with other method in class */
    public static final Double m5788minOrNull(@NotNull Sequence<Double> sequence) {
        Intrinsics.checkNotNullParameter(sequence, "<this>");
        Iterator<Double> it = sequence.iterator();
        if (!it.hasNext()) {
            return null;
        }
        double dDoubleValue = it.next().doubleValue();
        while (it.hasNext()) {
            dDoubleValue = Math.min(dDoubleValue, it.next().doubleValue());
        }
        return Double.valueOf(dDoubleValue);
    }

    @SinceKotlin(version = "1.7")
    @JvmName(name = "minOrThrow")
    public static final double minOrThrow(@NotNull Sequence<Double> sequence) {
        Intrinsics.checkNotNullParameter(sequence, "<this>");
        Iterator<Double> it = sequence.iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException();
        }
        double dDoubleValue = it.next().doubleValue();
        while (it.hasNext()) {
            dDoubleValue = Math.min(dDoubleValue, it.next().doubleValue());
        }
        return dDoubleValue;
    }

    @SinceKotlin(version = "1.4")
    @Nullable
    public static final <T> T minWithOrNull(@NotNull Sequence<? extends T> sequence, @NotNull Comparator<? super T> comparator) {
        Intrinsics.checkNotNullParameter(sequence, "<this>");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        Iterator<? extends T> it = sequence.iterator();
        if (!it.hasNext()) {
            return null;
        }
        T next = it.next();
        while (it.hasNext()) {
            T next2 = it.next();
            if (comparator.compare(next, next2) > 0) {
                next = next2;
            }
        }
        return next;
    }

    @SinceKotlin(version = "1.7")
    @JvmName(name = "minWithOrThrow")
    public static final <T> T minWithOrThrow(@NotNull Sequence<? extends T> sequence, @NotNull Comparator<? super T> comparator) {
        Intrinsics.checkNotNullParameter(sequence, "<this>");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        Iterator<? extends T> it = sequence.iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException();
        }
        T next = it.next();
        while (it.hasNext()) {
            T next2 = it.next();
            if (comparator.compare(next, next2) > 0) {
                next = next2;
            }
        }
        return next;
    }

    @NotNull
    public static final <T> Sequence<T> minus(@NotNull final Sequence<? extends T> sequence, final T t10) {
        Intrinsics.checkNotNullParameter(sequence, "<this>");
        return new Sequence<T>() { // from class: kotlin.sequences.SequencesKt___SequencesKt.minus.1

            /* JADX INFO: renamed from: kotlin.sequences.SequencesKt___SequencesKt$minus$1$a */
            /* JADX INFO: compiled from: _Sequences.kt */
            @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0003\u001a\u0002H\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", ExifInterface.GPS_DIRECTION_TRUE, "it", "invoke", "(Ljava/lang/Object;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class a extends Lambda implements Function1<T, Boolean> {

                /* JADX INFO: renamed from: p0, reason: collision with root package name */
                public final /* synthetic */ Ref.BooleanRef f82206p0;

                /* JADX INFO: renamed from: q0, reason: collision with root package name */
                public final /* synthetic */ T f82207q0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public a(Ref.BooleanRef booleanRef, T t10) {
                    super(1);
                    this.f82206p0 = booleanRef;
                    this.f82207q0 = t10;
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // kotlin.jvm.functions.Function1
                @NotNull
                public final Boolean invoke(T t10) {
                    Ref.BooleanRef booleanRef = this.f82206p0;
                    boolean z10 = true;
                    if (!booleanRef.element && Intrinsics.areEqual(t10, this.f82207q0)) {
                        booleanRef.element = true;
                        z10 = false;
                    }
                    return Boolean.valueOf(z10);
                }
            }

            @Override // kotlin.sequences.Sequence
            @NotNull
            public Iterator<T> iterator() {
                return SequencesKt___SequencesKt.filter(sequence, new a(new Ref.BooleanRef(), t10)).iterator();
            }
        };
    }

    public static final <T> boolean none(@NotNull Sequence<? extends T> sequence, @NotNull Function1<? super T, Boolean> function1) {
        Iterator itE = androidx.activity.a.e(sequence, "<this>", function1, "predicate");
        while (itE.hasNext()) {
            if (function1.invoke((Object) itE.next()).booleanValue()) {
                return false;
            }
        }
        return true;
    }

    @SinceKotlin(version = "1.1")
    @NotNull
    public static final <T> Sequence<T> onEach(@NotNull Sequence<? extends T> sequence, @NotNull Function1<? super T, Unit> action) {
        Intrinsics.checkNotNullParameter(sequence, "<this>");
        Intrinsics.checkNotNullParameter(action, "action");
        return map(sequence, new j(action));
    }

    @SinceKotlin(version = "1.4")
    @NotNull
    public static final <T> Sequence<T> onEachIndexed(@NotNull Sequence<? extends T> sequence, @NotNull Function2<? super Integer, ? super T, Unit> action) {
        Intrinsics.checkNotNullParameter(sequence, "<this>");
        Intrinsics.checkNotNullParameter(action, "action");
        return mapIndexed(sequence, new k(action));
    }

    @NotNull
    public static final <T> Pair<List<T>, List<T>> partition(@NotNull Sequence<? extends T> sequence, @NotNull Function1<? super T, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(sequence, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (T t10 : sequence) {
            if (predicate.invoke(t10).booleanValue()) {
                arrayList.add(t10);
            } else {
                arrayList2.add(t10);
            }
        }
        return new Pair<>(arrayList, arrayList2);
    }

    @NotNull
    public static <T> Sequence<T> plus(@NotNull Sequence<? extends T> sequence, T t10) {
        Intrinsics.checkNotNullParameter(sequence, "<this>");
        return SequencesKt__SequencesKt.flatten(SequencesKt__SequencesKt.sequenceOf(sequence, SequencesKt__SequencesKt.sequenceOf(t10)));
    }

    public static final <S, T extends S> S reduce(@NotNull Sequence<? extends T> sequence, @NotNull Function2<? super S, ? super T, ? extends S> operation) {
        Intrinsics.checkNotNullParameter(sequence, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        Iterator<? extends T> it = sequence.iterator();
        if (!it.hasNext()) {
            throw new UnsupportedOperationException("Empty sequence can't be reduced.");
        }
        S next = it.next();
        while (it.hasNext()) {
            next = operation.invoke(next, it.next());
        }
        return next;
    }

    public static final <S, T extends S> S reduceIndexed(@NotNull Sequence<? extends T> sequence, @NotNull Function3<? super Integer, ? super S, ? super T, ? extends S> operation) {
        Intrinsics.checkNotNullParameter(sequence, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        Iterator<? extends T> it = sequence.iterator();
        if (!it.hasNext()) {
            throw new UnsupportedOperationException("Empty sequence can't be reduced.");
        }
        S next = it.next();
        int i10 = 1;
        while (it.hasNext()) {
            int i11 = i10 + 1;
            if (i10 < 0) {
                if (!PlatformImplementationsKt.apiVersionIsAtLeast(1, 3, 0)) {
                    throw new ArithmeticException("Index overflow has happened.");
                }
                CollectionsKt__CollectionsKt.throwIndexOverflow();
            }
            next = operation.invoke(Integer.valueOf(i10), next, it.next());
            i10 = i11;
        }
        return next;
    }

    @SinceKotlin(version = "1.4")
    @Nullable
    public static final <S, T extends S> S reduceIndexedOrNull(@NotNull Sequence<? extends T> sequence, @NotNull Function3<? super Integer, ? super S, ? super T, ? extends S> operation) {
        Intrinsics.checkNotNullParameter(sequence, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        Iterator<? extends T> it = sequence.iterator();
        if (!it.hasNext()) {
            return null;
        }
        S next = it.next();
        int i10 = 1;
        while (it.hasNext()) {
            int i11 = i10 + 1;
            if (i10 < 0) {
                if (!PlatformImplementationsKt.apiVersionIsAtLeast(1, 3, 0)) {
                    throw new ArithmeticException("Index overflow has happened.");
                }
                CollectionsKt__CollectionsKt.throwIndexOverflow();
            }
            next = operation.invoke(Integer.valueOf(i10), next, it.next());
            i10 = i11;
        }
        return next;
    }

    @SinceKotlin(version = "1.4")
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    @Nullable
    public static final <S, T extends S> S reduceOrNull(@NotNull Sequence<? extends T> sequence, @NotNull Function2<? super S, ? super T, ? extends S> operation) {
        Intrinsics.checkNotNullParameter(sequence, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        Iterator<? extends T> it = sequence.iterator();
        if (!it.hasNext()) {
            return null;
        }
        S next = it.next();
        while (it.hasNext()) {
            next = operation.invoke(next, it.next());
        }
        return next;
    }

    @NotNull
    public static final <T> Sequence<T> requireNoNulls(@NotNull Sequence<? extends T> sequence) {
        Intrinsics.checkNotNullParameter(sequence, "<this>");
        return map(sequence, new l(sequence));
    }

    @SinceKotlin(version = "1.4")
    @NotNull
    public static final <T, R> Sequence<R> runningFold(@NotNull Sequence<? extends T> sequence, R r3, @NotNull Function2<? super R, ? super T, ? extends R> operation) {
        Intrinsics.checkNotNullParameter(sequence, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        return SequencesKt__SequenceBuilderKt.sequence(new m(r3, sequence, operation, null));
    }

    @SinceKotlin(version = "1.4")
    @NotNull
    public static final <T, R> Sequence<R> runningFoldIndexed(@NotNull Sequence<? extends T> sequence, R r3, @NotNull Function3<? super Integer, ? super R, ? super T, ? extends R> operation) {
        Intrinsics.checkNotNullParameter(sequence, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        return SequencesKt__SequenceBuilderKt.sequence(new n(r3, sequence, operation, null));
    }

    @SinceKotlin(version = "1.4")
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    @NotNull
    public static final <S, T extends S> Sequence<S> runningReduce(@NotNull Sequence<? extends T> sequence, @NotNull Function2<? super S, ? super T, ? extends S> operation) {
        Intrinsics.checkNotNullParameter(sequence, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        return SequencesKt__SequenceBuilderKt.sequence(new o(sequence, operation, null));
    }

    @SinceKotlin(version = "1.4")
    @NotNull
    public static final <S, T extends S> Sequence<S> runningReduceIndexed(@NotNull Sequence<? extends T> sequence, @NotNull Function3<? super Integer, ? super S, ? super T, ? extends S> operation) {
        Intrinsics.checkNotNullParameter(sequence, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        return SequencesKt__SequenceBuilderKt.sequence(new p(sequence, operation, null));
    }

    @SinceKotlin(version = "1.4")
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    @NotNull
    public static final <T, R> Sequence<R> scan(@NotNull Sequence<? extends T> sequence, R r3, @NotNull Function2<? super R, ? super T, ? extends R> operation) {
        Intrinsics.checkNotNullParameter(sequence, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        return runningFold(sequence, r3, operation);
    }

    @SinceKotlin(version = "1.4")
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    @NotNull
    public static final <T, R> Sequence<R> scanIndexed(@NotNull Sequence<? extends T> sequence, R r3, @NotNull Function3<? super Integer, ? super R, ? super T, ? extends R> operation) {
        Intrinsics.checkNotNullParameter(sequence, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        return runningFoldIndexed(sequence, r3, operation);
    }

    public static final <T> T single(@NotNull Sequence<? extends T> sequence, @NotNull Function1<? super T, Boolean> function1) {
        Iterator itE = androidx.activity.a.e(sequence, "<this>", function1, "predicate");
        T t10 = null;
        boolean z10 = false;
        while (itE.hasNext()) {
            Object obj = (Object) itE.next();
            if (function1.invoke(obj).booleanValue()) {
                if (z10) {
                    throw new IllegalArgumentException("Sequence contains more than one matching element.");
                }
                z10 = true;
                t10 = (T) obj;
            }
        }
        if (z10) {
            return t10;
        }
        throw new NoSuchElementException("Sequence contains no element matching the predicate.");
    }

    @Nullable
    public static final <T> T singleOrNull(@NotNull Sequence<? extends T> sequence, @NotNull Function1<? super T, Boolean> function1) {
        Iterator itE = androidx.activity.a.e(sequence, "<this>", function1, "predicate");
        boolean z10 = false;
        T t10 = null;
        while (itE.hasNext()) {
            Object obj = (Object) itE.next();
            if (function1.invoke(obj).booleanValue()) {
                if (z10) {
                    return null;
                }
                z10 = true;
                t10 = (T) obj;
            }
        }
        if (z10) {
            return t10;
        }
        return null;
    }

    @NotNull
    public static final <T extends Comparable<? super T>> Sequence<T> sorted(@NotNull final Sequence<? extends T> sequence) {
        Intrinsics.checkNotNullParameter(sequence, "<this>");
        return (Sequence<T>) new Sequence<T>() { // from class: kotlin.sequences.SequencesKt___SequencesKt.sorted.1
            @Override // kotlin.sequences.Sequence
            @NotNull
            public Iterator<T> iterator() {
                List mutableList = SequencesKt___SequencesKt.toMutableList(sequence);
                bk.f.sort(mutableList);
                return mutableList.iterator();
            }
        };
    }

    @NotNull
    public static final <T, R extends Comparable<? super R>> Sequence<T> sortedBy(@NotNull Sequence<? extends T> sequence, @NotNull Function1<? super T, ? extends R> selector) {
        Intrinsics.checkNotNullParameter(sequence, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        return sortedWith(sequence, new ComparisonsKt__ComparisonsKt$compareBy$2(selector));
    }

    @NotNull
    public static final <T, R extends Comparable<? super R>> Sequence<T> sortedByDescending(@NotNull Sequence<? extends T> sequence, @NotNull Function1<? super T, ? extends R> selector) {
        Intrinsics.checkNotNullParameter(sequence, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        return sortedWith(sequence, new ComparisonsKt__ComparisonsKt$compareByDescending$1(selector));
    }

    @NotNull
    public static final <T extends Comparable<? super T>> Sequence<T> sortedDescending(@NotNull Sequence<? extends T> sequence) {
        Intrinsics.checkNotNullParameter(sequence, "<this>");
        return sortedWith(sequence, dk.e.reverseOrder());
    }

    @NotNull
    public static <T> Sequence<T> sortedWith(@NotNull final Sequence<? extends T> sequence, @NotNull final Comparator<? super T> comparator) {
        Intrinsics.checkNotNullParameter(sequence, "<this>");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        return new Sequence<T>() { // from class: kotlin.sequences.SequencesKt___SequencesKt.sortedWith.1
            @Override // kotlin.sequences.Sequence
            @NotNull
            public Iterator<T> iterator() {
                List mutableList = SequencesKt___SequencesKt.toMutableList(sequence);
                bk.f.sortWith(mutableList, comparator);
                return mutableList.iterator();
            }
        };
    }

    @Deprecated(message = "Use sumOf instead.", replaceWith = @ReplaceWith(expression = "this.sumOf(selector)", imports = {}))
    @DeprecatedSinceKotlin(warningSince = SvgConstantsKt.VERSION)
    public static final <T> int sumBy(@NotNull Sequence<? extends T> sequence, @NotNull Function1<? super T, Integer> function1) {
        Iterator itE = androidx.activity.a.e(sequence, "<this>", function1, "selector");
        int iIntValue = 0;
        while (itE.hasNext()) {
            iIntValue += function1.invoke((Object) itE.next()).intValue();
        }
        return iIntValue;
    }

    @Deprecated(message = "Use sumOf instead.", replaceWith = @ReplaceWith(expression = "this.sumOf(selector)", imports = {}))
    @DeprecatedSinceKotlin(warningSince = SvgConstantsKt.VERSION)
    public static final <T> double sumByDouble(@NotNull Sequence<? extends T> sequence, @NotNull Function1<? super T, Double> function1) {
        Iterator itE = androidx.activity.a.e(sequence, "<this>", function1, "selector");
        double dDoubleValue = 0.0d;
        while (itE.hasNext()) {
            dDoubleValue += function1.invoke((Object) itE.next()).doubleValue();
        }
        return dDoubleValue;
    }

    @JvmName(name = "sumOfByte")
    public static final int sumOfByte(@NotNull Sequence<Byte> sequence) {
        Intrinsics.checkNotNullParameter(sequence, "<this>");
        Iterator<Byte> it = sequence.iterator();
        int iByteValue = 0;
        while (it.hasNext()) {
            iByteValue += it.next().byteValue();
        }
        return iByteValue;
    }

    @JvmName(name = "sumOfDouble")
    public static final double sumOfDouble(@NotNull Sequence<Double> sequence) {
        Intrinsics.checkNotNullParameter(sequence, "<this>");
        Iterator<Double> it = sequence.iterator();
        double dDoubleValue = 0.0d;
        while (it.hasNext()) {
            dDoubleValue += it.next().doubleValue();
        }
        return dDoubleValue;
    }

    @JvmName(name = "sumOfFloat")
    public static final float sumOfFloat(@NotNull Sequence<Float> sequence) {
        Intrinsics.checkNotNullParameter(sequence, "<this>");
        Iterator<Float> it = sequence.iterator();
        float fFloatValue = 0.0f;
        while (it.hasNext()) {
            fFloatValue += it.next().floatValue();
        }
        return fFloatValue;
    }

    @JvmName(name = "sumOfInt")
    public static final int sumOfInt(@NotNull Sequence<Integer> sequence) {
        Intrinsics.checkNotNullParameter(sequence, "<this>");
        Iterator<Integer> it = sequence.iterator();
        int iIntValue = 0;
        while (it.hasNext()) {
            iIntValue += it.next().intValue();
        }
        return iIntValue;
    }

    @JvmName(name = "sumOfLong")
    public static final long sumOfLong(@NotNull Sequence<Long> sequence) {
        Intrinsics.checkNotNullParameter(sequence, "<this>");
        Iterator<Long> it = sequence.iterator();
        long jLongValue = 0;
        while (it.hasNext()) {
            jLongValue += it.next().longValue();
        }
        return jLongValue;
    }

    @JvmName(name = "sumOfShort")
    public static final int sumOfShort(@NotNull Sequence<Short> sequence) {
        Intrinsics.checkNotNullParameter(sequence, "<this>");
        Iterator<Short> it = sequence.iterator();
        int iShortValue = 0;
        while (it.hasNext()) {
            iShortValue += it.next().shortValue();
        }
        return iShortValue;
    }

    @NotNull
    public static <T> Sequence<T> take(@NotNull Sequence<? extends T> sequence, int i10) {
        Intrinsics.checkNotNullParameter(sequence, "<this>");
        if (i10 < 0) {
            throw new IllegalArgumentException(androidx.camera.core.impl.utils.b.a("Requested element count ", i10, " is less than zero.").toString());
        }
        if (i10 == 0) {
            return SequencesKt__SequencesKt.emptySequence();
        }
        return sequence instanceof DropTakeSequence ? ((DropTakeSequence) sequence).take(i10) : new TakeSequence(sequence, i10);
    }

    @NotNull
    public static <T> Sequence<T> takeWhile(@NotNull Sequence<? extends T> sequence, @NotNull Function1<? super T, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(sequence, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        return new TakeWhileSequence(sequence, predicate);
    }

    @NotNull
    public static final <T, C extends Collection<? super T>> C toCollection(@NotNull Sequence<? extends T> sequence, @NotNull C destination) {
        Intrinsics.checkNotNullParameter(sequence, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Iterator<? extends T> it = sequence.iterator();
        while (it.hasNext()) {
            destination.add(it.next());
        }
        return destination;
    }

    @NotNull
    public static final <T> HashSet<T> toHashSet(@NotNull Sequence<? extends T> sequence) {
        Intrinsics.checkNotNullParameter(sequence, "<this>");
        return (HashSet) toCollection(sequence, new HashSet());
    }

    @NotNull
    public static <T> List<T> toList(@NotNull Sequence<? extends T> sequence) {
        Intrinsics.checkNotNullParameter(sequence, "<this>");
        Iterator<? extends T> it = sequence.iterator();
        if (!it.hasNext()) {
            return CollectionsKt__CollectionsKt.emptyList();
        }
        T next = it.next();
        if (!it.hasNext()) {
            return bk.d.listOf(next);
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(next);
        while (it.hasNext()) {
            arrayList.add(it.next());
        }
        return arrayList;
    }

    @NotNull
    public static <T> List<T> toMutableList(@NotNull Sequence<? extends T> sequence) {
        Intrinsics.checkNotNullParameter(sequence, "<this>");
        return (List) toCollection(sequence, new ArrayList());
    }

    @NotNull
    public static final <T> Set<T> toMutableSet(@NotNull Sequence<? extends T> sequence) {
        Intrinsics.checkNotNullParameter(sequence, "<this>");
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator<? extends T> it = sequence.iterator();
        while (it.hasNext()) {
            linkedHashSet.add(it.next());
        }
        return linkedHashSet;
    }

    @NotNull
    public static final <T> Set<T> toSet(@NotNull Sequence<? extends T> sequence) {
        Intrinsics.checkNotNullParameter(sequence, "<this>");
        Iterator<? extends T> it = sequence.iterator();
        if (!it.hasNext()) {
            return w.emptySet();
        }
        T next = it.next();
        if (!it.hasNext()) {
            return v.setOf(next);
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        linkedHashSet.add(next);
        while (it.hasNext()) {
            linkedHashSet.add(it.next());
        }
        return linkedHashSet;
    }

    @SinceKotlin(version = "1.2")
    @NotNull
    public static final <T> Sequence<List<T>> windowed(@NotNull Sequence<? extends T> sequence, int i10, int i11, boolean z10) {
        Intrinsics.checkNotNullParameter(sequence, "<this>");
        return SlidingWindowKt.windowedSequence(sequence, i10, i11, z10, false);
    }

    public static /* synthetic */ Sequence windowed$default(Sequence sequence, int i10, int i11, boolean z10, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i11 = 1;
        }
        if ((i12 & 4) != 0) {
            z10 = false;
        }
        return windowed(sequence, i10, i11, z10);
    }

    @NotNull
    public static final <T> Sequence<IndexedValue<T>> withIndex(@NotNull Sequence<? extends T> sequence) {
        Intrinsics.checkNotNullParameter(sequence, "<this>");
        return new IndexingSequence(sequence);
    }

    @NotNull
    public static final <T, R> Sequence<Pair<T, R>> zip(@NotNull Sequence<? extends T> sequence, @NotNull Sequence<? extends R> other) {
        Intrinsics.checkNotNullParameter(sequence, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        return new MergingSequence(sequence, other, q.f82236p0);
    }

    @SinceKotlin(version = "1.2")
    @NotNull
    public static final <T> Sequence<Pair<T, T>> zipWithNext(@NotNull Sequence<? extends T> sequence) {
        Intrinsics.checkNotNullParameter(sequence, "<this>");
        return zipWithNext(sequence, r.f82237p0);
    }

    @SinceKotlin(version = "1.2")
    @NotNull
    public static final <T, R> Sequence<R> chunked(@NotNull Sequence<? extends T> sequence, int i10, @NotNull Function1<? super List<? extends T>, ? extends R> transform) {
        Intrinsics.checkNotNullParameter(sequence, "<this>");
        Intrinsics.checkNotNullParameter(transform, "transform");
        return windowed(sequence, i10, i10, true, transform);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    public static final <T> Sequence<T> minus(@NotNull final Sequence<? extends T> sequence, @NotNull final T[] elements) {
        Intrinsics.checkNotNullParameter(sequence, "<this>");
        Intrinsics.checkNotNullParameter(elements, "elements");
        return elements.length == 0 ? sequence : new Sequence<T>() { // from class: kotlin.sequences.SequencesKt___SequencesKt.minus.2

            /* JADX INFO: renamed from: kotlin.sequences.SequencesKt___SequencesKt$minus$2$a */
            /* JADX INFO: compiled from: _Sequences.kt */
            @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0003\u001a\u0002H\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", ExifInterface.GPS_DIRECTION_TRUE, "it", "invoke", "(Ljava/lang/Object;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class a extends Lambda implements Function1<T, Boolean> {

                /* JADX INFO: renamed from: p0, reason: collision with root package name */
                public final /* synthetic */ T[] f82210p0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public a(T[] tArr) {
                    super(1);
                    this.f82210p0 = tArr;
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // kotlin.jvm.functions.Function1
                @NotNull
                public final Boolean invoke(T t10) {
                    return Boolean.valueOf(ArraysKt___ArraysKt.contains(this.f82210p0, t10));
                }
            }

            @Override // kotlin.sequences.Sequence
            @NotNull
            public Iterator<T> iterator() {
                return SequencesKt___SequencesKt.filterNot(sequence, new a(elements)).iterator();
            }
        };
    }

    @NotNull
    public static final <T> Sequence<T> plus(@NotNull Sequence<? extends T> sequence, @NotNull T[] elements) {
        Intrinsics.checkNotNullParameter(sequence, "<this>");
        Intrinsics.checkNotNullParameter(elements, "elements");
        return plus((Sequence) sequence, (Iterable) ArraysKt___ArraysJvmKt.asList(elements));
    }

    @SinceKotlin(version = "1.2")
    @NotNull
    public static final <T, R> Sequence<R> windowed(@NotNull Sequence<? extends T> sequence, int i10, int i11, boolean z10, @NotNull Function1<? super List<? extends T>, ? extends R> transform) {
        Intrinsics.checkNotNullParameter(sequence, "<this>");
        Intrinsics.checkNotNullParameter(transform, "transform");
        return map(SlidingWindowKt.windowedSequence(sequence, i10, i11, z10, true), transform);
    }

    public static /* synthetic */ Sequence windowed$default(Sequence sequence, int i10, int i11, boolean z10, Function1 function1, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i11 = 1;
        }
        if ((i12 & 4) != 0) {
            z10 = false;
        }
        return windowed(sequence, i10, i11, z10, function1);
    }

    @NotNull
    public static final <T, R, V> Sequence<V> zip(@NotNull Sequence<? extends T> sequence, @NotNull Sequence<? extends R> other, @NotNull Function2<? super T, ? super R, ? extends V> transform) {
        Intrinsics.checkNotNullParameter(sequence, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        Intrinsics.checkNotNullParameter(transform, "transform");
        return new MergingSequence(sequence, other, transform);
    }

    @SinceKotlin(version = "1.2")
    @NotNull
    public static final <T, R> Sequence<R> zipWithNext(@NotNull Sequence<? extends T> sequence, @NotNull Function2<? super T, ? super T, ? extends R> transform) {
        Intrinsics.checkNotNullParameter(sequence, "<this>");
        Intrinsics.checkNotNullParameter(transform, "transform");
        return SequencesKt__SequenceBuilderKt.sequence(new s(sequence, transform, null));
    }

    @NotNull
    public static final <T, K, V, M extends Map<? super K, ? super V>> M associateByTo(@NotNull Sequence<? extends T> sequence, @NotNull M destination, @NotNull Function1<? super T, ? extends K> keySelector, @NotNull Function1<? super T, ? extends V> valueTransform) {
        Intrinsics.checkNotNullParameter(sequence, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(keySelector, "keySelector");
        Intrinsics.checkNotNullParameter(valueTransform, "valueTransform");
        for (T t10 : sequence) {
            destination.put(keySelector.invoke(t10), valueTransform.invoke(t10));
        }
        return destination;
    }

    @NotNull
    public static <T> Sequence<T> plus(@NotNull Sequence<? extends T> sequence, @NotNull Iterable<? extends T> elements) {
        Intrinsics.checkNotNullParameter(sequence, "<this>");
        Intrinsics.checkNotNullParameter(elements, "elements");
        return SequencesKt__SequencesKt.flatten(SequencesKt__SequencesKt.sequenceOf(sequence, CollectionsKt___CollectionsKt.asSequence(elements)));
    }

    @NotNull
    public static final <T, K, V> Map<K, V> associateBy(@NotNull Sequence<? extends T> sequence, @NotNull Function1<? super T, ? extends K> keySelector, @NotNull Function1<? super T, ? extends V> valueTransform) {
        Intrinsics.checkNotNullParameter(sequence, "<this>");
        Intrinsics.checkNotNullParameter(keySelector, "keySelector");
        Intrinsics.checkNotNullParameter(valueTransform, "valueTransform");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (T t10 : sequence) {
            linkedHashMap.put(keySelector.invoke(t10), valueTransform.invoke(t10));
        }
        return linkedHashMap;
    }

    @NotNull
    public static final <T> Sequence<T> minus(@NotNull final Sequence<? extends T> sequence, @NotNull final Iterable<? extends T> elements) {
        Intrinsics.checkNotNullParameter(sequence, "<this>");
        Intrinsics.checkNotNullParameter(elements, "elements");
        return new Sequence<T>() { // from class: kotlin.sequences.SequencesKt___SequencesKt.minus.3

            /* JADX INFO: renamed from: kotlin.sequences.SequencesKt___SequencesKt$minus$3$a */
            /* JADX INFO: compiled from: _Sequences.kt */
            @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0003\u001a\u0002H\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", ExifInterface.GPS_DIRECTION_TRUE, "it", "invoke", "(Ljava/lang/Object;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class a extends Lambda implements Function1<T, Boolean> {

                /* JADX INFO: renamed from: p0, reason: collision with root package name */
                public final /* synthetic */ Collection<T> f82213p0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                public a(Collection<? extends T> collection) {
                    super(1);
                    this.f82213p0 = collection;
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // kotlin.jvm.functions.Function1
                @NotNull
                public final Boolean invoke(T t10) {
                    return Boolean.valueOf(this.f82213p0.contains(t10));
                }
            }

            @Override // kotlin.sequences.Sequence
            @NotNull
            public Iterator<T> iterator() {
                Collection collectionConvertToListIfNotCollection = bk.g.convertToListIfNotCollection(elements);
                boolean zIsEmpty = collectionConvertToListIfNotCollection.isEmpty();
                Sequence<T> sequence2 = sequence;
                return zIsEmpty ? sequence2.iterator() : SequencesKt___SequencesKt.filterNot(sequence2, new a(collectionConvertToListIfNotCollection)).iterator();
            }
        };
    }

    @NotNull
    public static final <T> Sequence<T> plus(@NotNull Sequence<? extends T> sequence, @NotNull Sequence<? extends T> elements) {
        Intrinsics.checkNotNullParameter(sequence, "<this>");
        Intrinsics.checkNotNullParameter(elements, "elements");
        return SequencesKt__SequencesKt.flatten(SequencesKt__SequencesKt.sequenceOf(sequence, elements));
    }

    @NotNull
    public static final <T> Sequence<T> minus(@NotNull final Sequence<? extends T> sequence, @NotNull final Sequence<? extends T> elements) {
        Intrinsics.checkNotNullParameter(sequence, "<this>");
        Intrinsics.checkNotNullParameter(elements, "elements");
        return new Sequence<T>() { // from class: kotlin.sequences.SequencesKt___SequencesKt.minus.4

            /* JADX INFO: renamed from: kotlin.sequences.SequencesKt___SequencesKt$minus$4$a */
            /* JADX INFO: compiled from: _Sequences.kt */
            @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0003\u001a\u0002H\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", ExifInterface.GPS_DIRECTION_TRUE, "it", "invoke", "(Ljava/lang/Object;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class a extends Lambda implements Function1<T, Boolean> {

                /* JADX INFO: renamed from: p0, reason: collision with root package name */
                public final /* synthetic */ List<T> f82216p0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                public a(List<? extends T> list) {
                    super(1);
                    this.f82216p0 = list;
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // kotlin.jvm.functions.Function1
                @NotNull
                public final Boolean invoke(T t10) {
                    return Boolean.valueOf(this.f82216p0.contains(t10));
                }
            }

            @Override // kotlin.sequences.Sequence
            @NotNull
            public Iterator<T> iterator() {
                List list = SequencesKt___SequencesKt.toList(elements);
                boolean zIsEmpty = list.isEmpty();
                Sequence<T> sequence2 = sequence;
                return zIsEmpty ? sequence2.iterator() : SequencesKt___SequencesKt.filterNot(sequence2, new a(list)).iterator();
            }
        };
    }

    @SinceKotlin(version = "1.4")
    @Nullable
    /* JADX INFO: renamed from: maxOrNull, reason: collision with other method in class */
    public static final Float m5785maxOrNull(@NotNull Sequence<Float> sequence) {
        Intrinsics.checkNotNullParameter(sequence, "<this>");
        Iterator<Float> it = sequence.iterator();
        if (!it.hasNext()) {
            return null;
        }
        float fFloatValue = it.next().floatValue();
        while (it.hasNext()) {
            fFloatValue = Math.max(fFloatValue, it.next().floatValue());
        }
        return Float.valueOf(fFloatValue);
    }

    @SinceKotlin(version = "1.7")
    @JvmName(name = "maxOrThrow")
    /* JADX INFO: renamed from: maxOrThrow, reason: collision with other method in class */
    public static final float m5786maxOrThrow(@NotNull Sequence<Float> sequence) {
        Intrinsics.checkNotNullParameter(sequence, "<this>");
        Iterator<Float> it = sequence.iterator();
        if (it.hasNext()) {
            float fFloatValue = it.next().floatValue();
            while (it.hasNext()) {
                fFloatValue = Math.max(fFloatValue, it.next().floatValue());
            }
            return fFloatValue;
        }
        throw new NoSuchElementException();
    }

    @SinceKotlin(version = "1.4")
    @Nullable
    /* JADX INFO: renamed from: minOrNull, reason: collision with other method in class */
    public static final Float m5789minOrNull(@NotNull Sequence<Float> sequence) {
        Intrinsics.checkNotNullParameter(sequence, "<this>");
        Iterator<Float> it = sequence.iterator();
        if (!it.hasNext()) {
            return null;
        }
        float fFloatValue = it.next().floatValue();
        while (it.hasNext()) {
            fFloatValue = Math.min(fFloatValue, it.next().floatValue());
        }
        return Float.valueOf(fFloatValue);
    }

    @SinceKotlin(version = "1.7")
    @JvmName(name = "minOrThrow")
    /* JADX INFO: renamed from: minOrThrow, reason: collision with other method in class */
    public static final float m5790minOrThrow(@NotNull Sequence<Float> sequence) {
        Intrinsics.checkNotNullParameter(sequence, "<this>");
        Iterator<Float> it = sequence.iterator();
        if (it.hasNext()) {
            float fFloatValue = it.next().floatValue();
            while (it.hasNext()) {
                fFloatValue = Math.min(fFloatValue, it.next().floatValue());
            }
            return fFloatValue;
        }
        throw new NoSuchElementException();
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: compiled from: _Sequences.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0000\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", ExifInterface.GPS_DIRECTION_TRUE, "it", "", "invoke", "(I)Ljava/lang/Object;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class b<T> extends Lambda implements Function1<Integer, T> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ int f82185p0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(int i10) {
            super(1);
            this.f82185p0 = i10;
        }

        public final T invoke(int i10) {
            throw new IndexOutOfBoundsException(androidx.activity.a.d(new StringBuilder("Sequence doesn't contain element at index "), this.f82185p0, '.'));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Integer num) {
            return invoke(num.intValue());
        }
    }

    public static final <T> boolean any(@NotNull Sequence<? extends T> sequence) {
        Intrinsics.checkNotNullParameter(sequence, "<this>");
        return sequence.iterator().hasNext();
    }

    public static <T> int count(@NotNull Sequence<? extends T> sequence) {
        Intrinsics.checkNotNullParameter(sequence, "<this>");
        Iterator<? extends T> it = sequence.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            it.next();
            i10++;
            if (i10 < 0) {
                CollectionsKt__CollectionsKt.throwCountOverflow();
            }
        }
        return i10;
    }

    @Nullable
    public static <T> T firstOrNull(@NotNull Sequence<? extends T> sequence) {
        Intrinsics.checkNotNullParameter(sequence, "<this>");
        Iterator<? extends T> it = sequence.iterator();
        if (it.hasNext()) {
            return it.next();
        }
        return null;
    }

    public static final <T> boolean none(@NotNull Sequence<? extends T> sequence) {
        Intrinsics.checkNotNullParameter(sequence, "<this>");
        return !sequence.iterator().hasNext();
    }

    @NotNull
    public static final <T, K, V> Map<K, List<V>> groupBy(@NotNull Sequence<? extends T> sequence, @NotNull Function1<? super T, ? extends K> keySelector, @NotNull Function1<? super T, ? extends V> valueTransform) {
        Intrinsics.checkNotNullParameter(sequence, "<this>");
        Intrinsics.checkNotNullParameter(keySelector, "keySelector");
        Intrinsics.checkNotNullParameter(valueTransform, "valueTransform");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (T t10 : sequence) {
            K kInvoke = keySelector.invoke(t10);
            Object objC = linkedHashMap.get(kInvoke);
            if (objC == null) {
                objC = androidx.constraintlayout.core.state.a.c(linkedHashMap, kInvoke);
            }
            ((List) objC).add(valueTransform.invoke(t10));
        }
        return linkedHashMap;
    }

    public static final <T> T first(@NotNull Sequence<? extends T> sequence) {
        Intrinsics.checkNotNullParameter(sequence, "<this>");
        Iterator<? extends T> it = sequence.iterator();
        if (it.hasNext()) {
            return it.next();
        }
        throw new NoSuchElementException("Sequence is empty.");
    }

    @Nullable
    public static final <T> T lastOrNull(@NotNull Sequence<? extends T> sequence) {
        Intrinsics.checkNotNullParameter(sequence, "<this>");
        Iterator<? extends T> it = sequence.iterator();
        if (!it.hasNext()) {
            return null;
        }
        T next = it.next();
        while (it.hasNext()) {
            next = it.next();
        }
        return next;
    }

    @Nullable
    public static final <T> T singleOrNull(@NotNull Sequence<? extends T> sequence) {
        Intrinsics.checkNotNullParameter(sequence, "<this>");
        Iterator<? extends T> it = sequence.iterator();
        if (!it.hasNext()) {
            return null;
        }
        T next = it.next();
        if (it.hasNext()) {
            return null;
        }
        return next;
    }

    @SinceKotlin(version = "1.4")
    @Nullable
    public static <T extends Comparable<? super T>> T maxOrNull(@NotNull Sequence<? extends T> sequence) {
        Intrinsics.checkNotNullParameter(sequence, "<this>");
        Iterator<? extends T> it = sequence.iterator();
        if (!it.hasNext()) {
            return null;
        }
        T next = it.next();
        while (it.hasNext()) {
            T next2 = it.next();
            if (next.compareTo(next2) < 0) {
                next = next2;
            }
        }
        return next;
    }

    @SinceKotlin(version = "1.7")
    @JvmName(name = "maxOrThrow")
    @NotNull
    /* JADX INFO: renamed from: maxOrThrow, reason: collision with other method in class */
    public static final <T extends Comparable<? super T>> T m5787maxOrThrow(@NotNull Sequence<? extends T> sequence) {
        Intrinsics.checkNotNullParameter(sequence, "<this>");
        Iterator<? extends T> it = sequence.iterator();
        if (it.hasNext()) {
            T next = it.next();
            while (it.hasNext()) {
                T next2 = it.next();
                if (next.compareTo(next2) < 0) {
                    next = next2;
                }
            }
            return next;
        }
        throw new NoSuchElementException();
    }

    @SinceKotlin(version = "1.4")
    @Nullable
    public static final <T extends Comparable<? super T>> T minOrNull(@NotNull Sequence<? extends T> sequence) {
        Intrinsics.checkNotNullParameter(sequence, "<this>");
        Iterator<? extends T> it = sequence.iterator();
        if (!it.hasNext()) {
            return null;
        }
        T next = it.next();
        while (it.hasNext()) {
            T next2 = it.next();
            if (next.compareTo(next2) > 0) {
                next = next2;
            }
        }
        return next;
    }

    @SinceKotlin(version = "1.7")
    @JvmName(name = "minOrThrow")
    @NotNull
    /* JADX INFO: renamed from: minOrThrow, reason: collision with other method in class */
    public static final <T extends Comparable<? super T>> T m5791minOrThrow(@NotNull Sequence<? extends T> sequence) {
        Intrinsics.checkNotNullParameter(sequence, "<this>");
        Iterator<? extends T> it = sequence.iterator();
        if (it.hasNext()) {
            T next = it.next();
            while (it.hasNext()) {
                T next2 = it.next();
                if (next.compareTo(next2) > 0) {
                    next = next2;
                }
            }
            return next;
        }
        throw new NoSuchElementException();
    }

    @NotNull
    public static final <T, K, V, M extends Map<? super K, List<V>>> M groupByTo(@NotNull Sequence<? extends T> sequence, @NotNull M destination, @NotNull Function1<? super T, ? extends K> keySelector, @NotNull Function1<? super T, ? extends V> valueTransform) {
        Intrinsics.checkNotNullParameter(sequence, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(keySelector, "keySelector");
        Intrinsics.checkNotNullParameter(valueTransform, "valueTransform");
        for (T t10 : sequence) {
            K kInvoke = keySelector.invoke(t10);
            Object objC = destination.get(kInvoke);
            if (objC == null) {
                objC = androidx.fragment.app.a.c(destination, kInvoke);
            }
            ((List) objC).add(valueTransform.invoke(t10));
        }
        return destination;
    }

    public static <T> T last(@NotNull Sequence<? extends T> sequence) {
        Intrinsics.checkNotNullParameter(sequence, "<this>");
        Iterator<? extends T> it = sequence.iterator();
        if (it.hasNext()) {
            T next = it.next();
            while (it.hasNext()) {
                next = it.next();
            }
            return next;
        }
        throw new NoSuchElementException("Sequence is empty.");
    }

    public static final <T> T single(@NotNull Sequence<? extends T> sequence) {
        Intrinsics.checkNotNullParameter(sequence, "<this>");
        Iterator<? extends T> it = sequence.iterator();
        if (it.hasNext()) {
            T next = it.next();
            if (it.hasNext()) {
                throw new IllegalArgumentException("Sequence has more than one element.");
            }
            return next;
        }
        throw new NoSuchElementException("Sequence is empty.");
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: compiled from: _Sequences.kt */
    @Metadata(d1 = {"\u0000\u0004\n\u0002\b\u0005\u0010\u0000\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u00012\u0006\u0010\u0002\u001a\u0002H\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"<anonymous>", ExifInterface.GPS_DIRECTION_TRUE, "it", "invoke", "(Ljava/lang/Object;)Ljava/lang/Object;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a<T> extends Lambda implements Function1<T, T> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final a f82183p0 = new a(1);

        public a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final T invoke(T t10) {
            return t10;
        }
    }
}

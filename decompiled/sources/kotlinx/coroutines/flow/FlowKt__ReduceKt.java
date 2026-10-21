package kotlinx.coroutines.flow;

import androidx.exifinterface.media.ExifInterface;
import ek.a;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.InlineMarker;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.flow.internal.AbortFlowException;
import kotlinx.coroutines.flow.internal.FlowExceptions_commonKt;
import kotlinx.coroutines.flow.internal.NullSurrogateKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: Reduce.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000,\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\r\u001a!\u0010\u0000\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u0002H\u00010\u0002H\u0086@ø\u0001\u0000¢\u0006\u0002\u0010\u0003\u001aE\u0010\u0000\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u0002H\u00010\u00022\"\u0010\u0004\u001a\u001e\b\u0001\u0012\u0004\u0012\u0002H\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0005H\u0086@ø\u0001\u0000¢\u0006\u0002\u0010\t\u001a#\u0010\n\u001a\u0004\u0018\u0001H\u0001\"\u0004\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u0002H\u00010\u0002H\u0086@ø\u0001\u0000¢\u0006\u0002\u0010\u0003\u001aG\u0010\n\u001a\u0004\u0018\u0001H\u0001\"\u0004\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u0002H\u00010\u00022\"\u0010\u0004\u001a\u001e\b\u0001\u0012\u0004\u0012\u0002H\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0005H\u0086@ø\u0001\u0000¢\u0006\u0002\u0010\t\u001ay\u0010\u000b\u001a\u0002H\f\"\u0004\b\u0000\u0010\u0001\"\u0004\b\u0001\u0010\f*\b\u0012\u0004\u0012\u0002H\u00010\u00022\u0006\u0010\r\u001a\u0002H\f2H\b\u0004\u0010\u000e\u001aB\b\u0001\u0012\u0013\u0012\u0011H\f¢\u0006\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\b(\u0012\u0012\u0013\u0012\u0011H\u0001¢\u0006\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\b(\u0013\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\f0\u0006\u0012\u0006\u0012\u0004\u0018\u00010\b0\u000fH\u0086Hø\u0001\u0000¢\u0006\u0002\u0010\u0014\u001a!\u0010\u0015\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u0002H\u00010\u0002H\u0086@ø\u0001\u0000¢\u0006\u0002\u0010\u0003\u001a#\u0010\u0016\u001a\u0004\u0018\u0001H\u0001\"\u0004\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u0002H\u00010\u0002H\u0086@ø\u0001\u0000¢\u0006\u0002\u0010\u0003\u001as\u0010\u0017\u001a\u0002H\u0018\"\u0004\b\u0000\u0010\u0018\"\b\b\u0001\u0010\u0001*\u0002H\u0018*\b\u0012\u0004\u0012\u0002H\u00010\u00022F\u0010\u000e\u001aB\b\u0001\u0012\u0013\u0012\u0011H\u0018¢\u0006\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\b(\u0019\u0012\u0013\u0012\u0011H\u0001¢\u0006\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\b(\u0013\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00180\u0006\u0012\u0006\u0012\u0004\u0018\u00010\b0\u000fH\u0086@ø\u0001\u0000¢\u0006\u0002\u0010\u001a\u001a!\u0010\u001b\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u0002H\u00010\u0002H\u0086@ø\u0001\u0000¢\u0006\u0002\u0010\u0003\u001a#\u0010\u001c\u001a\u0004\u0018\u0001H\u0001\"\u0004\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u0002H\u00010\u0002H\u0086@ø\u0001\u0000¢\u0006\u0002\u0010\u0003\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001d"}, d2 = {"first", ExifInterface.GPS_DIRECTION_TRUE, "Lkotlinx/coroutines/flow/Flow;", "(Lkotlinx/coroutines/flow/Flow;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "predicate", "Lkotlin/Function2;", "Lkotlin/coroutines/Continuation;", "", "", "(Lkotlinx/coroutines/flow/Flow;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "firstOrNull", "fold", "R", "initial", "operation", "Lkotlin/Function3;", "Lkotlin/ParameterName;", "name", "acc", "value", "(Lkotlinx/coroutines/flow/Flow;Ljava/lang/Object;Lkotlin/jvm/functions/Function3;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "last", "lastOrNull", "reduce", ExifInterface.LATITUDE_SOUTH, "accumulator", "(Lkotlinx/coroutines/flow/Flow;Lkotlin/jvm/functions/Function3;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "single", "singleOrNull", "kotlinx-coroutines-core"}, k = 5, mv = {1, 8, 0}, xi = 48, xs = "kotlinx/coroutines/flow/FlowKt")
@SourceDebugExtension({"SMAP\nReduce.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Reduce.kt\nkotlinx/coroutines/flow/FlowKt__ReduceKt\n+ 2 Limit.kt\nkotlinx/coroutines/flow/FlowKt__LimitKt\n*L\n1#1,172:1\n126#2,15:173\n126#2,15:188\n126#2,15:203\n126#2,15:218\n126#2,15:233\n*S KotlinDebug\n*F\n+ 1 Reduce.kt\nkotlinx/coroutines/flow/FlowKt__ReduceKt\n*L\n72#1:173,15\n92#1:188,15\n106#1:203,15\n124#1:218,15\n137#1:233,15\n*E\n"})
final /* synthetic */ class FlowKt__ReduceKt {

    /* JADX INFO: renamed from: kotlinx.coroutines.flow.FlowKt__ReduceKt$first$1, reason: invalid class name */
    /* JADX INFO: compiled from: Reduce.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__ReduceKt", f = "Reduce.kt", i = {0, 0}, l = {183}, m = "first", n = {"result", "collector$iv"}, s = {"L$0", "L$1"})
    public static final class AnonymousClass1<T> extends ContinuationImpl {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        public AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return FlowKt.first(null, this);
        }
    }

    /* JADX INFO: renamed from: kotlinx.coroutines.flow.FlowKt__ReduceKt$first$3, reason: invalid class name */
    /* JADX INFO: compiled from: Reduce.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__ReduceKt", f = "Reduce.kt", i = {0, 0, 0}, l = {183}, m = "first", n = {"predicate", "result", "collector$iv"}, s = {"L$0", "L$1", "L$2"})
    public static final class AnonymousClass3<T> extends ContinuationImpl {
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;

        public AnonymousClass3(Continuation<? super AnonymousClass3> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return FlowKt.first(null, null, this);
        }
    }

    /* JADX INFO: renamed from: kotlinx.coroutines.flow.FlowKt__ReduceKt$firstOrNull$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: Reduce.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__ReduceKt", f = "Reduce.kt", i = {0, 0}, l = {183}, m = "firstOrNull", n = {"result", "collector$iv"}, s = {"L$0", "L$1"})
    public static final class C06811<T> extends ContinuationImpl {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        public C06811(Continuation<? super C06811> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return FlowKt.firstOrNull(null, this);
        }
    }

    /* JADX INFO: renamed from: kotlinx.coroutines.flow.FlowKt__ReduceKt$firstOrNull$3, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: Reduce.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__ReduceKt", f = "Reduce.kt", i = {0, 0}, l = {183}, m = "firstOrNull", n = {"result", "collector$iv"}, s = {"L$0", "L$1"})
    public static final class C06823<T> extends ContinuationImpl {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        public C06823(Continuation<? super C06823> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return FlowKt.firstOrNull(null, null, this);
        }
    }

    /* JADX INFO: renamed from: kotlinx.coroutines.flow.FlowKt__ReduceKt$fold$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: Reduce.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 176)
    @DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__ReduceKt", f = "Reduce.kt", i = {0}, l = {44}, m = "fold", n = {"accumulator"}, s = {"L$0"})
    @SourceDebugExtension({"SMAP\nReduce.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Reduce.kt\nkotlinx/coroutines/flow/FlowKt__ReduceKt$fold$1\n*L\n1#1,172:1\n*E\n"})
    public static final class C06831<T, R> extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public C06831(Continuation<? super C06831> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return FlowKt__ReduceKt.fold(null, null, null, this);
        }
    }

    /* JADX INFO: renamed from: kotlinx.coroutines.flow.FlowKt__ReduceKt$fold$2, reason: invalid class name */
    /* JADX INFO: compiled from: Reduce.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u00032\u0006\u0010\u0004\u001a\u0002H\u0002H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", ExifInterface.GPS_DIRECTION_TRUE, "R", "value", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"}, k = 3, mv = {1, 8, 0}, xi = 176)
    @SourceDebugExtension({"SMAP\nReduce.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Reduce.kt\nkotlinx/coroutines/flow/FlowKt__ReduceKt$fold$2\n*L\n1#1,172:1\n*E\n"})
    public static final class AnonymousClass2<T> implements FlowCollector {
        final /* synthetic */ Ref.ObjectRef<R> $accumulator;
        final /* synthetic */ Function3<R, T, Continuation<? super R>, Object> $operation;

        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass2(Ref.ObjectRef<R> objectRef, Function3<? super R, ? super T, ? super Continuation<? super R>, ? extends Object> function3) {
            this.$accumulator = objectRef;
            this.$operation = function3;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Override // kotlinx.coroutines.flow.FlowCollector
        @Nullable
        public final Object emit(T t10, @NotNull Continuation<? super Unit> continuation) {
            FlowKt__ReduceKt$fold$2$emit$1 flowKt__ReduceKt$fold$2$emit$1;
            Ref.ObjectRef objectRef;
            if (continuation instanceof FlowKt__ReduceKt$fold$2$emit$1) {
                flowKt__ReduceKt$fold$2$emit$1 = (FlowKt__ReduceKt$fold$2$emit$1) continuation;
                int i10 = flowKt__ReduceKt$fold$2$emit$1.label;
                if ((i10 & Integer.MIN_VALUE) != 0) {
                    flowKt__ReduceKt$fold$2$emit$1.label = i10 - Integer.MIN_VALUE;
                } else {
                    flowKt__ReduceKt$fold$2$emit$1 = new FlowKt__ReduceKt$fold$2$emit$1(this, continuation);
                }
            } else {
                flowKt__ReduceKt$fold$2$emit$1 = new FlowKt__ReduceKt$fold$2$emit$1(this, continuation);
            }
            Object obj = flowKt__ReduceKt$fold$2$emit$1.result;
            Object coroutine_suspended = a.getCOROUTINE_SUSPENDED();
            int i11 = flowKt__ReduceKt$fold$2$emit$1.label;
            if (i11 == 0) {
                ResultKt.throwOnFailure(obj);
                Ref.ObjectRef objectRef2 = this.$accumulator;
                Function3<R, T, Continuation<? super R>, Object> function3 = this.$operation;
                T t11 = objectRef2.element;
                flowKt__ReduceKt$fold$2$emit$1.L$0 = objectRef2;
                flowKt__ReduceKt$fold$2$emit$1.label = 1;
                Object objInvoke = function3.invoke((R) t11, t10, flowKt__ReduceKt$fold$2$emit$1);
                if (objInvoke == coroutine_suspended) {
                    return coroutine_suspended;
                }
                obj = (T) objInvoke;
                objectRef = objectRef2;
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                objectRef = (Ref.ObjectRef) flowKt__ReduceKt$fold$2$emit$1.L$0;
                ResultKt.throwOnFailure(obj);
            }
            objectRef.element = (T) obj;
            return Unit.INSTANCE;
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Nullable
        public final Object emit$$forInline(T t10, @NotNull Continuation<? super Unit> continuation) {
            InlineMarker.mark(4);
            new FlowKt__ReduceKt$fold$2$emit$1(this, continuation);
            InlineMarker.mark(5);
            Ref.ObjectRef<R> objectRef = this.$accumulator;
            objectRef.element = (T) this.$operation.invoke((R) objectRef.element, t10, (Continuation<? super R>) continuation);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: kotlinx.coroutines.flow.FlowKt__ReduceKt$last$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: Reduce.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__ReduceKt", f = "Reduce.kt", i = {0}, l = {155}, m = "last", n = {"result"}, s = {"L$0"})
    public static final class C06841<T> extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public C06841(Continuation<? super C06841> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return FlowKt.last(null, this);
        }
    }

    /* JADX INFO: renamed from: kotlinx.coroutines.flow.FlowKt__ReduceKt$lastOrNull$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: Reduce.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__ReduceKt", f = "Reduce.kt", i = {0}, l = {167}, m = "lastOrNull", n = {"result"}, s = {"L$0"})
    public static final class C06861<T> extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public C06861(Continuation<? super C06861> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return FlowKt.lastOrNull(null, this);
        }
    }

    /* JADX INFO: renamed from: kotlinx.coroutines.flow.FlowKt__ReduceKt$reduce$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: Reduce.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__ReduceKt", f = "Reduce.kt", i = {0}, l = {22}, m = "reduce", n = {"accumulator"}, s = {"L$0"})
    public static final class C06881<S, T extends S> extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public C06881(Continuation<? super C06881> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return FlowKt.reduce(null, null, this);
        }
    }

    /* JADX INFO: renamed from: kotlinx.coroutines.flow.FlowKt__ReduceKt$reduce$2, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: Reduce.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\b\b\u0001\u0010\u0003*\u0002H\u00022\u0006\u0010\u0004\u001a\u0002H\u0003H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", ExifInterface.LATITUDE_SOUTH, ExifInterface.GPS_DIRECTION_TRUE, "value", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class C06892<T> implements FlowCollector {
        final /* synthetic */ Ref.ObjectRef<Object> $accumulator;
        final /* synthetic */ Function3<S, T, Continuation<? super S>, Object> $operation;

        /* JADX WARN: Multi-variable type inference failed */
        public C06892(Ref.ObjectRef<Object> objectRef, Function3<? super S, ? super T, ? super Continuation<? super S>, ? extends Object> function3) {
            this.$accumulator = objectRef;
            this.$operation = function3;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        /* JADX WARN: Type inference fix 'apply assigned field type' failed
        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
         */
        @Override // kotlinx.coroutines.flow.FlowCollector
        @Nullable
        public final Object emit(T t10, @NotNull Continuation<? super Unit> continuation) {
            FlowKt__ReduceKt$reduce$2$emit$1 flowKt__ReduceKt$reduce$2$emit$1;
            Ref.ObjectRef<Object> objectRef;
            Ref.ObjectRef<Object> objectRef2;
            if (continuation instanceof FlowKt__ReduceKt$reduce$2$emit$1) {
                flowKt__ReduceKt$reduce$2$emit$1 = (FlowKt__ReduceKt$reduce$2$emit$1) continuation;
                int i10 = flowKt__ReduceKt$reduce$2$emit$1.label;
                if ((i10 & Integer.MIN_VALUE) != 0) {
                    flowKt__ReduceKt$reduce$2$emit$1.label = i10 - Integer.MIN_VALUE;
                } else {
                    flowKt__ReduceKt$reduce$2$emit$1 = new FlowKt__ReduceKt$reduce$2$emit$1(this, continuation);
                }
            } else {
                flowKt__ReduceKt$reduce$2$emit$1 = new FlowKt__ReduceKt$reduce$2$emit$1(this, continuation);
            }
            Object obj = flowKt__ReduceKt$reduce$2$emit$1.result;
            Object coroutine_suspended = a.getCOROUTINE_SUSPENDED();
            int i11 = flowKt__ReduceKt$reduce$2$emit$1.label;
            if (i11 == 0) {
                ResultKt.throwOnFailure(obj);
                objectRef = this.$accumulator;
                Object obj2 = objectRef.element;
                if (obj2 != NullSurrogateKt.NULL) {
                    Function3<S, T, Continuation<? super S>, Object> function3 = this.$operation;
                    flowKt__ReduceKt$reduce$2$emit$1.L$0 = objectRef;
                    flowKt__ReduceKt$reduce$2$emit$1.label = 1;
                    Object objInvoke = function3.invoke((S) obj2, t10, flowKt__ReduceKt$reduce$2$emit$1);
                    if (objInvoke == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    obj = objInvoke;
                    objectRef2 = objectRef;
                }
                objectRef.element = t10;
                return Unit.INSTANCE;
            }
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            objectRef2 = (Ref.ObjectRef) flowKt__ReduceKt$reduce$2$emit$1.L$0;
            ResultKt.throwOnFailure(obj);
            Object obj3 = obj;
            objectRef = objectRef2;
            t10 = (T) obj3;
            objectRef.element = t10;
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: kotlinx.coroutines.flow.FlowKt__ReduceKt$single$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: Reduce.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__ReduceKt", f = "Reduce.kt", i = {0}, l = {57}, m = "single", n = {"result"}, s = {"L$0"})
    public static final class C06901<T> extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public C06901(Continuation<? super C06901> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return FlowKt.single(null, this);
        }
    }

    /* JADX INFO: renamed from: kotlinx.coroutines.flow.FlowKt__ReduceKt$singleOrNull$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: Reduce.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__ReduceKt", f = "Reduce.kt", i = {0, 0}, l = {183}, m = "singleOrNull", n = {"result", "collector$iv"}, s = {"L$0", "L$1"})
    public static final class C06921<T> extends ContinuationImpl {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        public C06921(Continuation<? super C06921> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return FlowKt.singleOrNull(null, this);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public static final <T> Object first(@NotNull Flow<? extends T> flow, @NotNull Continuation<? super T> continuation) {
        AnonymousClass1 anonymousClass1;
        Ref.ObjectRef objectRef;
        AbortFlowException e5;
        FlowCollector<T> flowCollector;
        if (continuation instanceof AnonymousClass1) {
            anonymousClass1 = (AnonymousClass1) continuation;
            int i10 = anonymousClass1.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                anonymousClass1.label = i10 - Integer.MIN_VALUE;
            } else {
                anonymousClass1 = new AnonymousClass1(continuation);
            }
        } else {
            anonymousClass1 = new AnonymousClass1(continuation);
        }
        Object obj = anonymousClass1.result;
        Object coroutine_suspended = a.getCOROUTINE_SUSPENDED();
        int i11 = anonymousClass1.label;
        if (i11 == 0) {
            ResultKt.throwOnFailure(obj);
            final Ref.ObjectRef objectRef2 = new Ref.ObjectRef();
            objectRef2.element = (T) NullSurrogateKt.NULL;
            FlowCollector<T> flowCollector2 = new FlowCollector<T>() { // from class: kotlinx.coroutines.flow.FlowKt__ReduceKt$first$$inlined$collectWhile$1
                @Override // kotlinx.coroutines.flow.FlowCollector
                @Nullable
                public Object emit(T t10, @NotNull Continuation<? super Unit> continuation2) {
                    objectRef2.element = t10;
                    throw new AbortFlowException(this);
                }
            };
            try {
                anonymousClass1.L$0 = objectRef2;
                anonymousClass1.L$1 = flowCollector2;
                anonymousClass1.label = 1;
                if (flow.collect(flowCollector2, anonymousClass1) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                objectRef = objectRef2;
            } catch (AbortFlowException e7) {
                objectRef = objectRef2;
                e5 = e7;
                flowCollector = flowCollector2;
                FlowExceptions_commonKt.checkOwnership(e5, flowCollector);
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            flowCollector = (FlowKt__ReduceKt$first$$inlined$collectWhile$1) anonymousClass1.L$1;
            objectRef = (Ref.ObjectRef) anonymousClass1.L$0;
            try {
                ResultKt.throwOnFailure(obj);
            } catch (AbortFlowException e10) {
                e5 = e10;
                FlowExceptions_commonKt.checkOwnership(e5, flowCollector);
            }
        }
        T t10 = objectRef.element;
        if (t10 != NullSurrogateKt.NULL) {
            return t10;
        }
        throw new NoSuchElementException("Expected at least one element");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public static final <T> Object firstOrNull(@NotNull Flow<? extends T> flow, @NotNull Continuation<? super T> continuation) {
        C06811 c06811;
        Ref.ObjectRef objectRef;
        AbortFlowException e5;
        FlowCollector<T> flowCollector;
        if (continuation instanceof C06811) {
            c06811 = (C06811) continuation;
            int i10 = c06811.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c06811.label = i10 - Integer.MIN_VALUE;
            } else {
                c06811 = new C06811(continuation);
            }
        } else {
            c06811 = new C06811(continuation);
        }
        Object obj = c06811.result;
        Object coroutine_suspended = a.getCOROUTINE_SUSPENDED();
        int i11 = c06811.label;
        if (i11 == 0) {
            ResultKt.throwOnFailure(obj);
            final Ref.ObjectRef objectRef2 = new Ref.ObjectRef();
            FlowCollector<T> flowCollector2 = new FlowCollector<T>() { // from class: kotlinx.coroutines.flow.FlowKt__ReduceKt$firstOrNull$$inlined$collectWhile$1
                @Override // kotlinx.coroutines.flow.FlowCollector
                @Nullable
                public Object emit(T t10, @NotNull Continuation<? super Unit> continuation2) {
                    objectRef2.element = t10;
                    throw new AbortFlowException(this);
                }
            };
            try {
                c06811.L$0 = objectRef2;
                c06811.L$1 = flowCollector2;
                c06811.label = 1;
                if (flow.collect(flowCollector2, c06811) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                objectRef = objectRef2;
            } catch (AbortFlowException e7) {
                objectRef = objectRef2;
                e5 = e7;
                flowCollector = flowCollector2;
                FlowExceptions_commonKt.checkOwnership(e5, flowCollector);
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            flowCollector = (FlowKt__ReduceKt$firstOrNull$$inlined$collectWhile$1) c06811.L$1;
            objectRef = (Ref.ObjectRef) c06811.L$0;
            try {
                ResultKt.throwOnFailure(obj);
            } catch (AbortFlowException e10) {
                e5 = e10;
                FlowExceptions_commonKt.checkOwnership(e5, flowCollector);
            }
        }
        return objectRef.element;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    @Nullable
    public static final <T, R> Object fold(@NotNull Flow<? extends T> flow, R r3, @NotNull Function3<? super R, ? super T, ? super Continuation<? super R>, ? extends Object> function3, @NotNull Continuation<? super R> continuation) {
        C06831 c06831;
        Ref.ObjectRef objectRef;
        if (continuation instanceof C06831) {
            c06831 = (C06831) continuation;
            int i10 = c06831.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c06831.label = i10 - Integer.MIN_VALUE;
            } else {
                c06831 = new C06831(continuation);
            }
        } else {
            c06831 = new C06831(continuation);
        }
        Object obj = c06831.result;
        Object coroutine_suspended = a.getCOROUTINE_SUSPENDED();
        int i11 = c06831.label;
        if (i11 == 0) {
            ResultKt.throwOnFailure(obj);
            Ref.ObjectRef objectRef2 = new Ref.ObjectRef();
            objectRef2.element = r3;
            FlowCollector<? super Object> anonymousClass2 = new AnonymousClass2<>(objectRef2, function3);
            c06831.L$0 = objectRef2;
            c06831.label = 1;
            if (flow.collect(anonymousClass2, c06831) == coroutine_suspended) {
                return coroutine_suspended;
            }
            objectRef = objectRef2;
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            objectRef = (Ref.ObjectRef) c06831.L$0;
            ResultKt.throwOnFailure(obj);
        }
        return objectRef.element;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public static final <T> Object last(@NotNull Flow<? extends T> flow, @NotNull Continuation<? super T> continuation) {
        C06841 c06841;
        Ref.ObjectRef objectRef;
        if (continuation instanceof C06841) {
            c06841 = (C06841) continuation;
            int i10 = c06841.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c06841.label = i10 - Integer.MIN_VALUE;
            } else {
                c06841 = new C06841(continuation);
            }
        } else {
            c06841 = new C06841(continuation);
        }
        Object obj = c06841.result;
        Object coroutine_suspended = a.getCOROUTINE_SUSPENDED();
        int i11 = c06841.label;
        if (i11 == 0) {
            ResultKt.throwOnFailure(obj);
            final Ref.ObjectRef objectRef2 = new Ref.ObjectRef();
            objectRef2.element = (T) NullSurrogateKt.NULL;
            FlowCollector<? super Object> flowCollector = new FlowCollector() { // from class: kotlinx.coroutines.flow.FlowKt__ReduceKt.last.2
                @Override // kotlinx.coroutines.flow.FlowCollector
                @Nullable
                public final Object emit(T t10, @NotNull Continuation<? super Unit> continuation2) {
                    objectRef2.element = t10;
                    return Unit.INSTANCE;
                }
            };
            c06841.L$0 = objectRef2;
            c06841.label = 1;
            if (flow.collect(flowCollector, c06841) == coroutine_suspended) {
                return coroutine_suspended;
            }
            objectRef = objectRef2;
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            objectRef = (Ref.ObjectRef) c06841.L$0;
            ResultKt.throwOnFailure(obj);
        }
        T t10 = objectRef.element;
        if (t10 != NullSurrogateKt.NULL) {
            return t10;
        }
        throw new NoSuchElementException("Expected at least one element");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public static final <T> Object lastOrNull(@NotNull Flow<? extends T> flow, @NotNull Continuation<? super T> continuation) {
        C06861 c06861;
        Ref.ObjectRef objectRef;
        if (continuation instanceof C06861) {
            c06861 = (C06861) continuation;
            int i10 = c06861.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c06861.label = i10 - Integer.MIN_VALUE;
            } else {
                c06861 = new C06861(continuation);
            }
        } else {
            c06861 = new C06861(continuation);
        }
        Object obj = c06861.result;
        Object coroutine_suspended = a.getCOROUTINE_SUSPENDED();
        int i11 = c06861.label;
        if (i11 == 0) {
            ResultKt.throwOnFailure(obj);
            final Ref.ObjectRef objectRef2 = new Ref.ObjectRef();
            FlowCollector<? super Object> flowCollector = new FlowCollector() { // from class: kotlinx.coroutines.flow.FlowKt__ReduceKt.lastOrNull.2
                @Override // kotlinx.coroutines.flow.FlowCollector
                @Nullable
                public final Object emit(T t10, @NotNull Continuation<? super Unit> continuation2) {
                    objectRef2.element = t10;
                    return Unit.INSTANCE;
                }
            };
            c06861.L$0 = objectRef2;
            c06861.label = 1;
            if (flow.collect(flowCollector, c06861) == coroutine_suspended) {
                return coroutine_suspended;
            }
            objectRef = objectRef2;
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            objectRef = (Ref.ObjectRef) c06861.L$0;
            ResultKt.throwOnFailure(obj);
        }
        return objectRef.element;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r2v1, types: [T, kotlinx.coroutines.internal.Symbol] */
    @Nullable
    public static final <S, T extends S> Object reduce(@NotNull Flow<? extends T> flow, @NotNull Function3<? super S, ? super T, ? super Continuation<? super S>, ? extends Object> function3, @NotNull Continuation<? super S> continuation) {
        C06881 c06881;
        Ref.ObjectRef objectRef;
        if (continuation instanceof C06881) {
            c06881 = (C06881) continuation;
            int i10 = c06881.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c06881.label = i10 - Integer.MIN_VALUE;
            } else {
                c06881 = new C06881(continuation);
            }
        } else {
            c06881 = new C06881(continuation);
        }
        Object obj = c06881.result;
        Object coroutine_suspended = a.getCOROUTINE_SUSPENDED();
        int i11 = c06881.label;
        if (i11 == 0) {
            ResultKt.throwOnFailure(obj);
            Ref.ObjectRef objectRef2 = new Ref.ObjectRef();
            objectRef2.element = NullSurrogateKt.NULL;
            FlowCollector<? super Object> c06892 = new C06892<>(objectRef2, function3);
            c06881.L$0 = objectRef2;
            c06881.label = 1;
            if (flow.collect(c06892, c06881) == coroutine_suspended) {
                return coroutine_suspended;
            }
            objectRef = objectRef2;
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            objectRef = (Ref.ObjectRef) c06881.L$0;
            ResultKt.throwOnFailure(obj);
        }
        T t10 = objectRef.element;
        if (t10 != NullSurrogateKt.NULL) {
            return t10;
        }
        throw new NoSuchElementException("Empty flow can't be reduced");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public static final <T> Object single(@NotNull Flow<? extends T> flow, @NotNull Continuation<? super T> continuation) {
        C06901 c06901;
        Ref.ObjectRef objectRef;
        if (continuation instanceof C06901) {
            c06901 = (C06901) continuation;
            int i10 = c06901.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c06901.label = i10 - Integer.MIN_VALUE;
            } else {
                c06901 = new C06901(continuation);
            }
        } else {
            c06901 = new C06901(continuation);
        }
        Object obj = c06901.result;
        Object coroutine_suspended = a.getCOROUTINE_SUSPENDED();
        int i11 = c06901.label;
        if (i11 == 0) {
            ResultKt.throwOnFailure(obj);
            final Ref.ObjectRef objectRef2 = new Ref.ObjectRef();
            objectRef2.element = (T) NullSurrogateKt.NULL;
            FlowCollector<? super Object> flowCollector = new FlowCollector() { // from class: kotlinx.coroutines.flow.FlowKt__ReduceKt.single.2
                @Override // kotlinx.coroutines.flow.FlowCollector
                @Nullable
                public final Object emit(T t10, @NotNull Continuation<? super Unit> continuation2) {
                    Ref.ObjectRef<Object> objectRef3 = objectRef2;
                    if (objectRef3.element != NullSurrogateKt.NULL) {
                        throw new IllegalArgumentException("Flow has more than one element".toString());
                    }
                    objectRef3.element = t10;
                    return Unit.INSTANCE;
                }
            };
            c06901.L$0 = objectRef2;
            c06901.label = 1;
            if (flow.collect(flowCollector, c06901) == coroutine_suspended) {
                return coroutine_suspended;
            }
            objectRef = objectRef2;
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            objectRef = (Ref.ObjectRef) c06901.L$0;
            ResultKt.throwOnFailure(obj);
        }
        T t10 = objectRef.element;
        if (t10 != NullSurrogateKt.NULL) {
            return t10;
        }
        throw new NoSuchElementException("Flow is empty");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public static final <T> Object singleOrNull(@NotNull Flow<? extends T> flow, @NotNull Continuation<? super T> continuation) {
        C06921 c06921;
        Ref.ObjectRef objectRef;
        AbortFlowException e5;
        FlowCollector<T> flowCollector;
        if (continuation instanceof C06921) {
            c06921 = (C06921) continuation;
            int i10 = c06921.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c06921.label = i10 - Integer.MIN_VALUE;
            } else {
                c06921 = new C06921(continuation);
            }
        } else {
            c06921 = new C06921(continuation);
        }
        Object obj = c06921.result;
        Object coroutine_suspended = a.getCOROUTINE_SUSPENDED();
        int i11 = c06921.label;
        if (i11 == 0) {
            ResultKt.throwOnFailure(obj);
            final Ref.ObjectRef objectRef2 = new Ref.ObjectRef();
            objectRef2.element = (T) NullSurrogateKt.NULL;
            FlowCollector<T> flowCollector2 = new FlowCollector<T>() { // from class: kotlinx.coroutines.flow.FlowKt__ReduceKt$singleOrNull$$inlined$collectWhile$1
                @Override // kotlinx.coroutines.flow.FlowCollector
                @Nullable
                public Object emit(T t10, @NotNull Continuation<? super Unit> continuation2) {
                    Ref.ObjectRef objectRef3 = objectRef2;
                    T t11 = objectRef3.element;
                    T t12 = (T) NullSurrogateKt.NULL;
                    if (t11 == t12) {
                        objectRef3.element = t10;
                        return Unit.INSTANCE;
                    }
                    objectRef3.element = t12;
                    throw new AbortFlowException(this);
                }
            };
            try {
                c06921.L$0 = objectRef2;
                c06921.L$1 = flowCollector2;
                c06921.label = 1;
                if (flow.collect(flowCollector2, c06921) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                objectRef = objectRef2;
            } catch (AbortFlowException e7) {
                objectRef = objectRef2;
                e5 = e7;
                flowCollector = flowCollector2;
                FlowExceptions_commonKt.checkOwnership(e5, flowCollector);
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            flowCollector = (FlowKt__ReduceKt$singleOrNull$$inlined$collectWhile$1) c06921.L$1;
            objectRef = (Ref.ObjectRef) c06921.L$0;
            try {
                ResultKt.throwOnFailure(obj);
            } catch (AbortFlowException e10) {
                e5 = e10;
                FlowExceptions_commonKt.checkOwnership(e5, flowCollector);
            }
        }
        T t10 = objectRef.element;
        if (t10 == NullSurrogateKt.NULL) {
            return null;
        }
        return t10;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public static final <T> Object first(@NotNull Flow<? extends T> flow, @NotNull Function2<? super T, ? super Continuation<? super Boolean>, ? extends Object> function2, @NotNull Continuation<? super T> continuation) {
        AnonymousClass3 anonymousClass3;
        Function2<? super T, ? super Continuation<? super Boolean>, ? extends Object> function3;
        Ref.ObjectRef objectRef;
        AbortFlowException e5;
        FlowCollector<? super Object> flowCollector;
        if (continuation instanceof AnonymousClass3) {
            anonymousClass3 = (AnonymousClass3) continuation;
            int i10 = anonymousClass3.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                anonymousClass3.label = i10 - Integer.MIN_VALUE;
            } else {
                anonymousClass3 = new AnonymousClass3(continuation);
            }
        } else {
            anonymousClass3 = new AnonymousClass3(continuation);
        }
        Object obj = anonymousClass3.result;
        Object coroutine_suspended = a.getCOROUTINE_SUSPENDED();
        int i11 = anonymousClass3.label;
        if (i11 == 0) {
            ResultKt.throwOnFailure(obj);
            Ref.ObjectRef objectRef2 = new Ref.ObjectRef();
            objectRef2.element = (T) NullSurrogateKt.NULL;
            FlowCollector<? super Object> flowKt__ReduceKt$first$$inlined$collectWhile$2 = new FlowKt__ReduceKt$first$$inlined$collectWhile$2<>(function2, objectRef2);
            try {
                anonymousClass3.L$0 = function2;
                anonymousClass3.L$1 = objectRef2;
                anonymousClass3.L$2 = flowKt__ReduceKt$first$$inlined$collectWhile$2;
                anonymousClass3.label = 1;
                if (flow.collect(flowKt__ReduceKt$first$$inlined$collectWhile$2, anonymousClass3) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                function3 = function2;
                objectRef = objectRef2;
            } catch (AbortFlowException e7) {
                function3 = function2;
                objectRef = objectRef2;
                e5 = e7;
                flowCollector = flowKt__ReduceKt$first$$inlined$collectWhile$2;
                FlowExceptions_commonKt.checkOwnership(e5, flowCollector);
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            flowCollector = (FlowKt__ReduceKt$first$$inlined$collectWhile$2) anonymousClass3.L$2;
            objectRef = (Ref.ObjectRef) anonymousClass3.L$1;
            function3 = (Function2) anonymousClass3.L$0;
            try {
                ResultKt.throwOnFailure(obj);
            } catch (AbortFlowException e10) {
                e5 = e10;
                FlowExceptions_commonKt.checkOwnership(e5, flowCollector);
            }
        }
        T t10 = objectRef.element;
        if (t10 != NullSurrogateKt.NULL) {
            return t10;
        }
        throw new NoSuchElementException("Expected at least one element matching the predicate " + function3);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public static final <T> Object firstOrNull(@NotNull Flow<? extends T> flow, @NotNull Function2<? super T, ? super Continuation<? super Boolean>, ? extends Object> function2, @NotNull Continuation<? super T> continuation) {
        C06823 c06823;
        Ref.ObjectRef objectRef;
        AbortFlowException e5;
        FlowCollector<? super Object> flowCollector;
        if (continuation instanceof C06823) {
            c06823 = (C06823) continuation;
            int i10 = c06823.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c06823.label = i10 - Integer.MIN_VALUE;
            } else {
                c06823 = new C06823(continuation);
            }
        } else {
            c06823 = new C06823(continuation);
        }
        Object obj = c06823.result;
        Object coroutine_suspended = a.getCOROUTINE_SUSPENDED();
        int i11 = c06823.label;
        if (i11 == 0) {
            ResultKt.throwOnFailure(obj);
            Ref.ObjectRef objectRef2 = new Ref.ObjectRef();
            FlowCollector<? super Object> flowKt__ReduceKt$firstOrNull$$inlined$collectWhile$2 = new FlowKt__ReduceKt$firstOrNull$$inlined$collectWhile$2<>(function2, objectRef2);
            try {
                c06823.L$0 = objectRef2;
                c06823.L$1 = flowKt__ReduceKt$firstOrNull$$inlined$collectWhile$2;
                c06823.label = 1;
                if (flow.collect(flowKt__ReduceKt$firstOrNull$$inlined$collectWhile$2, c06823) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                objectRef = objectRef2;
            } catch (AbortFlowException e7) {
                objectRef = objectRef2;
                e5 = e7;
                flowCollector = flowKt__ReduceKt$firstOrNull$$inlined$collectWhile$2;
                FlowExceptions_commonKt.checkOwnership(e5, flowCollector);
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            flowCollector = (FlowKt__ReduceKt$firstOrNull$$inlined$collectWhile$2) c06823.L$1;
            objectRef = (Ref.ObjectRef) c06823.L$0;
            try {
                ResultKt.throwOnFailure(obj);
            } catch (AbortFlowException e10) {
                e5 = e10;
                FlowExceptions_commonKt.checkOwnership(e5, flowCollector);
            }
        }
        return objectRef.element;
    }
}

package androidx.compose.foundation;

import androidx.compose.runtime.Stable;
import androidx.exifinterface.media.ExifInterface;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.sync.Mutex;
import kotlinx.coroutines.sync.MutexKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import t.e0;

/* JADX INFO: compiled from: MutatorMutex.kt */
/* JADX INFO: loaded from: classes.dex */
@Stable
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0012B\u0007¢\u0006\u0004\b\u0010\u0010\u0011JA\u0010\b\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u001c\u0010\u0007\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0005H\u0086@ø\u0001\u0000¢\u0006\u0004\b\b\u0010\tJZ\u0010\u000e\u001a\u00028\u0001\"\u0004\b\u0000\u0010\n\"\u0004\b\u0001\u0010\u00022\u0006\u0010\u000b\u001a\u00028\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032'\u0010\u0007\u001a#\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00010\f¢\u0006\u0002\b\rH\u0086@ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000f\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0013"}, d2 = {"Landroidx/compose/foundation/MutatorMutex;", "", "R", "Landroidx/compose/foundation/MutatePriority;", "priority", "Lkotlin/Function1;", "Lkotlin/coroutines/Continuation;", "block", "mutate", "(Landroidx/compose/foundation/MutatePriority;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", ExifInterface.GPS_DIRECTION_TRUE, "receiver", "Lkotlin/Function2;", "Lkotlin/ExtensionFunctionType;", "mutateWith", "(Ljava/lang/Object;Landroidx/compose/foundation/MutatePriority;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "<init>", "()V", "a", "foundation_release"}, k = 1, mv = {1, 8, 0})
public final class MutatorMutex {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final AtomicReference<a> f3428a = new AtomicReference<>(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final Mutex f3429b = MutexKt.Mutex$default(false, 1, null);

    /* JADX INFO: compiled from: MutatorMutex.kt */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final MutatePriority f3430a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public final Job f3431b;

        public a(@NotNull MutatePriority priority, @NotNull Job job) {
            Intrinsics.checkNotNullParameter(priority, "priority");
            Intrinsics.checkNotNullParameter(job, "job");
            this.f3430a = priority;
            this.f3431b = job;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [R] */
    /* JADX INFO: compiled from: MutatorMutex.kt */
    @DebugMetadata(c = "androidx.compose.foundation.MutatorMutex$mutate$2", f = "MutatorMutex.kt", i = {0, 0, 1, 1}, l = {186, 132}, m = "invokeSuspend", n = {"mutator", "$this$withLock_u24default$iv", "mutator", "$this$withLock_u24default$iv"}, s = {"L$0", "L$1", "L$0", "L$1"})
    @SourceDebugExtension({"SMAP\nMutatorMutex.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MutatorMutex.kt\nandroidx/compose/foundation/MutatorMutex$mutate$2\n+ 2 Mutex.kt\nkotlinx/coroutines/sync/MutexKt\n*L\n1#1,180:1\n107#2,10:181\n*S KotlinDebug\n*F\n+ 1 MutatorMutex.kt\nandroidx/compose/foundation/MutatorMutex$mutate$2\n*L\n130#1:181,10\n*E\n"})
    public static final class b<R> extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super R>, Object> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public Mutex f3432p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public Object f3433q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public MutatorMutex f3434r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public int f3435s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public /* synthetic */ Object f3436t0;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public final /* synthetic */ MutatePriority f3437u0;
        public final /* synthetic */ MutatorMutex v0;

        /* JADX INFO: renamed from: w0, reason: collision with root package name */
        public final /* synthetic */ Function1<Continuation<? super R>, Object> f3438w0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public b(MutatePriority mutatePriority, MutatorMutex mutatorMutex, Function1<? super Continuation<? super R>, ? extends Object> function1, Continuation<? super b> continuation) {
            super(2, continuation);
            this.f3437u0 = mutatePriority;
            this.v0 = mutatorMutex;
            this.f3438w0 = function1;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            b bVar = new b(this.f3437u0, this.v0, this.f3438w0, continuation);
            bVar.f3436t0 = obj;
            return bVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Object obj) {
            return ((b) create(coroutineScope, (Continuation) obj)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Type inference failed for: r1v0, types: [int, kotlinx.coroutines.sync.Mutex] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            MutatorMutex mutatorMutex;
            Mutex mutex;
            Function1<Continuation<? super R>, Object> function1;
            a aVar;
            Mutex mutex2;
            a aVar2;
            MutatorMutex mutatorMutex2;
            Throwable th2;
            AtomicReference atomicReference;
            AtomicReference atomicReference2;
            Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
            ?? r1 = this.f3435s0;
            try {
                try {
                    if (r1 == 0) {
                        ResultKt.throwOnFailure(obj);
                        CoroutineContext.Element element = ((CoroutineScope) this.f3436t0).getCoroutineContext().get(Job.INSTANCE);
                        Intrinsics.checkNotNull(element);
                        a aVar3 = new a(this.f3437u0, (Job) element);
                        mutatorMutex = this.v0;
                        MutatorMutex.access$tryMutateOrCancel(mutatorMutex, aVar3);
                        mutex = mutatorMutex.f3429b;
                        this.f3436t0 = aVar3;
                        this.f3432p0 = mutex;
                        Function1<Continuation<? super R>, Object> function2 = this.f3438w0;
                        this.f3433q0 = function2;
                        this.f3434r0 = mutatorMutex;
                        this.f3435s0 = 1;
                        if (mutex.lock(null, this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        function1 = function2;
                        aVar = aVar3;
                    } else {
                        if (r1 != 1) {
                            if (r1 != 2) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            mutatorMutex2 = (MutatorMutex) this.f3433q0;
                            mutex2 = this.f3432p0;
                            aVar2 = (a) this.f3436t0;
                            try {
                                ResultKt.throwOnFailure(obj);
                                atomicReference2 = mutatorMutex2.f3428a;
                                while (!atomicReference2.compareAndSet(aVar2, null) && atomicReference2.get() == aVar2) {
                                }
                                mutex2.unlock(null);
                                return obj;
                            } catch (Throwable th3) {
                                th2 = th3;
                                atomicReference = mutatorMutex2.f3428a;
                                while (!atomicReference.compareAndSet(aVar2, null)) {
                                }
                                throw th2;
                            }
                        }
                        MutatorMutex mutatorMutex3 = this.f3434r0;
                        function1 = (Function1) this.f3433q0;
                        mutex = this.f3432p0;
                        aVar = (a) this.f3436t0;
                        ResultKt.throwOnFailure(obj);
                        mutatorMutex = mutatorMutex3;
                    }
                    this.f3436t0 = aVar;
                    this.f3432p0 = mutex2;
                    this.f3433q0 = mutatorMutex;
                    this.f3434r0 = null;
                    this.f3435s0 = 2;
                    Object objInvoke = function1.invoke(this);
                    if (objInvoke == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    mutatorMutex2 = mutatorMutex;
                    obj = objInvoke;
                    aVar2 = aVar;
                    atomicReference2 = mutatorMutex2.f3428a;
                    while (!atomicReference2.compareAndSet(aVar2, null)) {
                    }
                    mutex2.unlock(null);
                    return obj;
                } catch (Throwable th4) {
                    aVar2 = aVar;
                    mutatorMutex2 = mutatorMutex;
                    th2 = th4;
                    atomicReference = mutatorMutex2.f3428a;
                    while (!atomicReference.compareAndSet(aVar2, null) && atomicReference.get() == aVar2) {
                    }
                    throw th2;
                }
                mutex2 = mutex;
            } catch (Throwable th5) {
                r1.unlock(null);
                throw th5;
            }
        }
    }

    /* JADX INFO: Add missing generic type declarations: [R] */
    /* JADX INFO: compiled from: MutatorMutex.kt */
    @DebugMetadata(c = "androidx.compose.foundation.MutatorMutex$mutateWith$2", f = "MutatorMutex.kt", i = {0, 0, 1, 1}, l = {186, 173}, m = "invokeSuspend", n = {"mutator", "$this$withLock_u24default$iv", "mutator", "$this$withLock_u24default$iv"}, s = {"L$0", "L$1", "L$0", "L$1"})
    @SourceDebugExtension({"SMAP\nMutatorMutex.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MutatorMutex.kt\nandroidx/compose/foundation/MutatorMutex$mutateWith$2\n+ 2 Mutex.kt\nkotlinx/coroutines/sync/MutexKt\n*L\n1#1,180:1\n107#2,10:181\n*S KotlinDebug\n*F\n+ 1 MutatorMutex.kt\nandroidx/compose/foundation/MutatorMutex$mutateWith$2\n*L\n171#1:181,10\n*E\n"})
    public static final class c<R> extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super R>, Object> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public Mutex f3439p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public Object f3440q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public Object f3441r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public MutatorMutex f3442s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public int f3443t0;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public /* synthetic */ Object f3444u0;
        public final /* synthetic */ MutatePriority v0;

        /* JADX INFO: renamed from: w0, reason: collision with root package name */
        public final /* synthetic */ MutatorMutex f3445w0;

        /* JADX INFO: renamed from: x0, reason: collision with root package name */
        public final /* synthetic */ Function2<T, Continuation<? super R>, Object> f3446x0;

        /* JADX INFO: renamed from: y0, reason: collision with root package name */
        public final /* synthetic */ T f3447y0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public c(MutatePriority mutatePriority, MutatorMutex mutatorMutex, Function2<? super T, ? super Continuation<? super R>, ? extends Object> function2, T t10, Continuation<? super c> continuation) {
            super(2, continuation);
            this.v0 = mutatePriority;
            this.f3445w0 = mutatorMutex;
            this.f3446x0 = function2;
            this.f3447y0 = t10;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            c cVar = new c(this.v0, this.f3445w0, this.f3446x0, this.f3447y0, continuation);
            cVar.f3444u0 = obj;
            return cVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Object obj) {
            return ((c) create(coroutineScope, (Continuation) obj)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Type inference failed for: r1v0, types: [int, kotlinx.coroutines.sync.Mutex] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            MutatorMutex mutatorMutex;
            Object obj2;
            a aVar;
            Mutex mutex;
            Function2 function2;
            a aVar2;
            MutatorMutex mutatorMutex2;
            Throwable th2;
            AtomicReference atomicReference;
            AtomicReference atomicReference2;
            Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
            ?? r1 = this.f3443t0;
            try {
                try {
                    if (r1 == 0) {
                        ResultKt.throwOnFailure(obj);
                        CoroutineContext.Element element = ((CoroutineScope) this.f3444u0).getCoroutineContext().get(Job.INSTANCE);
                        Intrinsics.checkNotNull(element);
                        a aVar3 = new a(this.v0, (Job) element);
                        mutatorMutex = this.f3445w0;
                        MutatorMutex.access$tryMutateOrCancel(mutatorMutex, aVar3);
                        Mutex mutex2 = mutatorMutex.f3429b;
                        this.f3444u0 = aVar3;
                        this.f3439p0 = mutex2;
                        Function2 function3 = this.f3446x0;
                        this.f3440q0 = function3;
                        Object obj3 = this.f3447y0;
                        this.f3441r0 = obj3;
                        this.f3442s0 = mutatorMutex;
                        this.f3443t0 = 1;
                        if (mutex2.lock(null, this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        obj2 = obj3;
                        aVar = aVar3;
                        mutex = mutex2;
                        function2 = function3;
                    } else {
                        if (r1 != 1) {
                            if (r1 != 2) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            mutatorMutex2 = (MutatorMutex) this.f3440q0;
                            mutex = this.f3439p0;
                            aVar2 = (a) this.f3444u0;
                            try {
                                ResultKt.throwOnFailure(obj);
                                atomicReference2 = mutatorMutex2.f3428a;
                                while (!atomicReference2.compareAndSet(aVar2, null) && atomicReference2.get() == aVar2) {
                                }
                                mutex.unlock(null);
                                return obj;
                            } catch (Throwable th3) {
                                th2 = th3;
                                atomicReference = mutatorMutex2.f3428a;
                                while (!atomicReference.compareAndSet(aVar2, null)) {
                                }
                                throw th2;
                            }
                        }
                        MutatorMutex mutatorMutex3 = this.f3442s0;
                        obj2 = this.f3441r0;
                        function2 = (Function2) this.f3440q0;
                        Mutex mutex3 = this.f3439p0;
                        aVar = (a) this.f3444u0;
                        ResultKt.throwOnFailure(obj);
                        mutatorMutex = mutatorMutex3;
                        mutex = mutex3;
                    }
                    this.f3444u0 = aVar;
                    this.f3439p0 = mutex;
                    this.f3440q0 = mutatorMutex;
                    this.f3441r0 = null;
                    this.f3442s0 = null;
                    this.f3443t0 = 2;
                    Object objInvoke = function2.invoke(obj2, this);
                    if (objInvoke == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    mutatorMutex2 = mutatorMutex;
                    obj = objInvoke;
                    aVar2 = aVar;
                    atomicReference2 = mutatorMutex2.f3428a;
                    while (!atomicReference2.compareAndSet(aVar2, null)) {
                    }
                    mutex.unlock(null);
                    return obj;
                } catch (Throwable th4) {
                    aVar2 = aVar;
                    mutatorMutex2 = mutatorMutex;
                    th2 = th4;
                    atomicReference = mutatorMutex2.f3428a;
                    while (!atomicReference.compareAndSet(aVar2, null) && atomicReference.get() == aVar2) {
                    }
                    throw th2;
                }
            } catch (Throwable th5) {
                r1.unlock(null);
                throw th5;
            }
        }
    }

    public static final void access$tryMutateOrCancel(MutatorMutex mutatorMutex, a aVar) {
        while (true) {
            AtomicReference<a> atomicReference = mutatorMutex.f3428a;
            a other = atomicReference.get();
            if (other != null) {
                aVar.getClass();
                Intrinsics.checkNotNullParameter(other, "other");
                if (aVar.f3430a.compareTo(other.f3430a) < 0) {
                    throw new CancellationException("Current mutation had a higher priority");
                }
            }
            do {
                if (atomicReference.compareAndSet(other, aVar)) {
                    if (other != null) {
                        other.f3431b.cancel((CancellationException) new e0("Mutation interrupted"));
                        return;
                    }
                    return;
                }
            } while (atomicReference.get() == other);
        }
    }

    public static /* synthetic */ Object mutate$default(MutatorMutex mutatorMutex, MutatePriority mutatePriority, Function1 function1, Continuation continuation, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            mutatePriority = MutatePriority.Default;
        }
        return mutatorMutex.mutate(mutatePriority, function1, continuation);
    }

    public static /* synthetic */ Object mutateWith$default(MutatorMutex mutatorMutex, Object obj, MutatePriority mutatePriority, Function2 function2, Continuation continuation, int i10, Object obj2) {
        if ((i10 & 2) != 0) {
            mutatePriority = MutatePriority.Default;
        }
        return mutatorMutex.mutateWith(obj, mutatePriority, function2, continuation);
    }

    @Nullable
    public final <R> Object mutate(@NotNull MutatePriority mutatePriority, @NotNull Function1<? super Continuation<? super R>, ? extends Object> function1, @NotNull Continuation<? super R> continuation) {
        return CoroutineScopeKt.coroutineScope(new b(mutatePriority, this, function1, null), continuation);
    }

    @Nullable
    public final <T, R> Object mutateWith(T t10, @NotNull MutatePriority mutatePriority, @NotNull Function2<? super T, ? super Continuation<? super R>, ? extends Object> function2, @NotNull Continuation<? super R> continuation) {
        return CoroutineScopeKt.coroutineScope(new c(mutatePriority, this, function2, t10, null), continuation);
    }
}

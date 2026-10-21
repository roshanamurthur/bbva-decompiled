package androidx.room;

import com.veridas.detect.ImageAnalysisKt;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.ContinuationInterceptor;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.JvmName;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CancellableContinuation;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.ThreadContextElementKt;
import kotlinx.coroutines.channels.ProduceKt;
import kotlinx.coroutines.channels.ProducerScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: RoomDatabaseExt.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u00002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\b\u0003\u001a;\u0010\u0006\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\u001c\u0010\u0005\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0002H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u001a;\u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u000e0\r*\u00020\u00012\u0012\u0010\n\u001a\n\u0012\u0006\b\u0001\u0012\u00020\t0\b\"\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\u000f\u0010\u0010\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0011"}, d2 = {"R", "Landroidx/room/RoomDatabase;", "Lkotlin/Function1;", "Lkotlin/coroutines/Continuation;", "", "block", "withTransaction", "(Landroidx/room/RoomDatabase;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "", "tables", "", "emitInitialState", "Lkotlinx/coroutines/flow/Flow;", "", "invalidationTrackerFlow", "(Landroidx/room/RoomDatabase;[Ljava/lang/String;Z)Lkotlinx/coroutines/flow/Flow;", "room-ktx_release"}, k = 2, mv = {1, 8, 0})
@JvmName(name = "RoomDatabaseKt")
@SourceDebugExtension({"SMAP\nRoomDatabaseExt.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RoomDatabaseExt.kt\nandroidx/room/RoomDatabaseKt\n+ 2 CancellableContinuation.kt\nkotlinx/coroutines/CancellableContinuationKt\n*L\n1#1,239:1\n314#2,11:240\n*S KotlinDebug\n*F\n+ 1 RoomDatabaseExt.kt\nandroidx/room/RoomDatabaseKt\n*L\n92#1:240,11\n*E\n"})
public final class RoomDatabaseKt {

    /* JADX INFO: compiled from: RoomDatabaseExt.kt */
    public static final class a implements Runnable {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ CoroutineContext f23295p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ CancellableContinuation<R> f23296q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ RoomDatabase f23297r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final /* synthetic */ Function2<CoroutineScope, Continuation<? super R>, Object> f23298s0;

        /* JADX INFO: renamed from: androidx.room.RoomDatabaseKt$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: RoomDatabaseExt.kt */
        @DebugMetadata(c = "androidx.room.RoomDatabaseKt$startTransactionCoroutine$2$1$1", f = "RoomDatabaseExt.kt", i = {}, l = {103}, m = "invokeSuspend", n = {}, s = {})
        public static final class C0103a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

            /* JADX INFO: renamed from: p0, reason: collision with root package name */
            public int f23299p0;

            /* JADX INFO: renamed from: q0, reason: collision with root package name */
            public /* synthetic */ Object f23300q0;

            /* JADX INFO: renamed from: r0, reason: collision with root package name */
            public final /* synthetic */ RoomDatabase f23301r0;

            /* JADX INFO: renamed from: s0, reason: collision with root package name */
            public final /* synthetic */ CancellableContinuation<R> f23302s0;

            /* JADX INFO: renamed from: t0, reason: collision with root package name */
            public final /* synthetic */ Function2<CoroutineScope, Continuation<? super R>, Object> f23303t0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public C0103a(RoomDatabase roomDatabase, CancellableContinuation<? super R> cancellableContinuation, Function2<? super CoroutineScope, ? super Continuation<? super R>, ? extends Object> function2, Continuation<? super C0103a> continuation) {
                super(2, continuation);
                this.f23301r0 = roomDatabase;
                this.f23302s0 = cancellableContinuation;
                this.f23303t0 = function2;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                C0103a c0103a = new C0103a(this.f23301r0, this.f23302s0, this.f23303t0, continuation);
                c0103a.f23300q0 = obj;
                return c0103a;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((C0103a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                Continuation continuation;
                Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
                int i10 = this.f23299p0;
                if (i10 == 0) {
                    ResultKt.throwOnFailure(obj);
                    CoroutineContext.Element element = ((CoroutineScope) this.f23300q0).getCoroutineContext().get(ContinuationInterceptor.INSTANCE);
                    Intrinsics.checkNotNull(element);
                    CoroutineContext coroutineContextAccess$createTransactionContext = RoomDatabaseKt.access$createTransactionContext(this.f23301r0, (ContinuationInterceptor) element);
                    Result.Companion companion = Result.INSTANCE;
                    Continuation continuation2 = this.f23302s0;
                    this.f23300q0 = continuation2;
                    this.f23299p0 = 1;
                    obj = BuildersKt.withContext(coroutineContextAccess$createTransactionContext, this.f23303t0, this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    continuation = continuation2;
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    continuation = (Continuation) this.f23300q0;
                    ResultKt.throwOnFailure(obj);
                }
                continuation.resumeWith(Result.m5535constructorimpl(obj));
                return Unit.INSTANCE;
            }
        }

        public a(CoroutineContext coroutineContext, CancellableContinuationImpl cancellableContinuationImpl, RoomDatabase roomDatabase, Function2 function2) {
            this.f23295p0 = coroutineContext;
            this.f23296q0 = cancellableContinuationImpl;
            this.f23297r0 = roomDatabase;
            this.f23298s0 = function2;
        }

        @Override // java.lang.Runnable
        public final void run() {
            CancellableContinuation<R> cancellableContinuation = this.f23296q0;
            try {
                BuildersKt.runBlocking(this.f23295p0.minusKey(ContinuationInterceptor.INSTANCE), new C0103a(this.f23297r0, cancellableContinuation, this.f23298s0, null));
            } catch (Throwable th2) {
                cancellableContinuation.cancel(th2);
            }
        }
    }

    /* JADX INFO: Add missing generic type declarations: [R] */
    /* JADX INFO: compiled from: RoomDatabaseExt.kt */
    @DebugMetadata(c = "androidx.room.RoomDatabaseKt$withTransaction$transactionBlock$1", f = "RoomDatabaseExt.kt", i = {0}, l = {62}, m = "invokeSuspend", n = {"transactionElement"}, s = {"L$0"})
    public static final class b<R> extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super R>, Object> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public int f23304p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public /* synthetic */ Object f23305q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ RoomDatabase f23306r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final /* synthetic */ Function1<Continuation<? super R>, Object> f23307s0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public b(RoomDatabase roomDatabase, Function1<? super Continuation<? super R>, ? extends Object> function1, Continuation<? super b> continuation) {
            super(2, continuation);
            this.f23306r0 = roomDatabase;
            this.f23307s0 = function1;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            b bVar = new b(this.f23306r0, this.f23307s0, continuation);
            bVar.f23305q0 = obj;
            return bVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Object obj) {
            return ((b) create(coroutineScope, (Continuation) obj)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object] */
        /* JADX WARN: Type inference failed for: r0v3 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            Throwable th2;
            TransactionElement transactionElement;
            TransactionElement coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
            int i10 = this.f23304p0;
            RoomDatabase roomDatabase = this.f23306r0;
            try {
                if (i10 == 0) {
                    ResultKt.throwOnFailure(obj);
                    CoroutineContext.Element element = ((CoroutineScope) this.f23305q0).getCoroutineContext().get(TransactionElement.INSTANCE);
                    Intrinsics.checkNotNull(element);
                    TransactionElement transactionElement2 = (TransactionElement) element;
                    transactionElement2.acquire();
                    try {
                        roomDatabase.beginTransaction();
                        try {
                            Function1<Continuation<? super R>, Object> function1 = this.f23307s0;
                            this.f23305q0 = transactionElement2;
                            this.f23304p0 = 1;
                            Object objInvoke = function1.invoke(this);
                            if (objInvoke == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            transactionElement = transactionElement2;
                            obj = objInvoke;
                        } catch (Throwable th3) {
                            th2 = th3;
                            roomDatabase.endTransaction();
                            throw th2;
                        }
                    } catch (Throwable th4) {
                        coroutine_suspended = transactionElement2;
                        th = th4;
                        coroutine_suspended.release();
                        throw th;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    transactionElement = (TransactionElement) this.f23305q0;
                    try {
                        ResultKt.throwOnFailure(obj);
                    } catch (Throwable th5) {
                        th2 = th5;
                        roomDatabase.endTransaction();
                        throw th2;
                    }
                }
                roomDatabase.setTransactionSuccessful();
                roomDatabase.endTransaction();
                transactionElement.release();
                return obj;
            } catch (Throwable th6) {
                th = th6;
            }
        }
    }

    /* JADX INFO: renamed from: androidx.room.RoomDatabaseKt$invalidationTrackerFlow$1, reason: invalid class name */
    /* JADX INFO: compiled from: RoomDatabaseExt.kt */
    @DebugMetadata(c = "androidx.room.RoomDatabaseKt$invalidationTrackerFlow$1", f = "RoomDatabaseExt.kt", i = {}, l = {235}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<ProducerScope<? super Set<? extends String>>, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public int f23308p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public /* synthetic */ Object f23309q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ boolean f23310r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final /* synthetic */ RoomDatabase f23311s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public final /* synthetic */ String[] f23312t0;

        /* JADX INFO: renamed from: androidx.room.RoomDatabaseKt$invalidationTrackerFlow$1$a */
        /* JADX INFO: compiled from: RoomDatabaseExt.kt */
        public static final class a extends Lambda implements Function0<Unit> {

            /* JADX INFO: renamed from: p0, reason: collision with root package name */
            public final /* synthetic */ Job f23313p0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(Job job) {
                super(0);
                this.f23313p0 = job;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Unit invoke() {
                Job.DefaultImpls.cancel$default(this.f23313p0, (CancellationException) null, 1, (Object) null);
                return Unit.INSTANCE;
            }
        }

        /* JADX INFO: renamed from: androidx.room.RoomDatabaseKt$invalidationTrackerFlow$1$b */
        /* JADX INFO: compiled from: RoomDatabaseExt.kt */
        @DebugMetadata(c = "androidx.room.RoomDatabaseKt$invalidationTrackerFlow$1$job$1", f = "RoomDatabaseExt.kt", i = {}, l = {ImageAnalysisKt.OVER_EXPOSED_THRESHOLD}, m = "invokeSuspend", n = {}, s = {})
        public static final class b extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

            /* JADX INFO: renamed from: p0, reason: collision with root package name */
            public int f23314p0;

            /* JADX INFO: renamed from: q0, reason: collision with root package name */
            public final /* synthetic */ RoomDatabase f23315q0;

            /* JADX INFO: renamed from: r0, reason: collision with root package name */
            public final /* synthetic */ RoomDatabaseKt$invalidationTrackerFlow$1$observer$1 f23316r0;

            /* JADX INFO: renamed from: s0, reason: collision with root package name */
            public final /* synthetic */ boolean f23317s0;

            /* JADX INFO: renamed from: t0, reason: collision with root package name */
            public final /* synthetic */ ProducerScope<Set<String>> f23318t0;

            /* JADX INFO: renamed from: u0, reason: collision with root package name */
            public final /* synthetic */ String[] f23319u0;
            public final /* synthetic */ AtomicBoolean v0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public b(RoomDatabase roomDatabase, RoomDatabaseKt$invalidationTrackerFlow$1$observer$1 roomDatabaseKt$invalidationTrackerFlow$1$observer$1, boolean z10, ProducerScope<? super Set<String>> producerScope, String[] strArr, AtomicBoolean atomicBoolean, Continuation<? super b> continuation) {
                super(2, continuation);
                this.f23315q0 = roomDatabase;
                this.f23316r0 = roomDatabaseKt$invalidationTrackerFlow$1$observer$1;
                this.f23317s0 = z10;
                this.f23318t0 = producerScope;
                this.f23319u0 = strArr;
                this.v0 = atomicBoolean;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                return new b(this.f23315q0, this.f23316r0, this.f23317s0, this.f23318t0, this.f23319u0, this.v0, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((b) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
                int i10 = this.f23314p0;
                RoomDatabaseKt$invalidationTrackerFlow$1$observer$1 roomDatabaseKt$invalidationTrackerFlow$1$observer$1 = this.f23316r0;
                RoomDatabase roomDatabase = this.f23315q0;
                try {
                    if (i10 == 0) {
                        ResultKt.throwOnFailure(obj);
                        roomDatabase.getInvalidationTracker().addObserver(roomDatabaseKt$invalidationTrackerFlow$1$observer$1);
                        if (this.f23317s0) {
                            this.f23318t0.mo5953trySendJP2dKIU(ArraysKt___ArraysKt.toSet(this.f23319u0));
                        }
                        this.v0.set(false);
                        this.f23314p0 = 1;
                        if (DelayKt.awaitCancellation(this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        if (i10 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                    }
                    throw new KotlinNothingValueException();
                } catch (Throwable th2) {
                    roomDatabase.getInvalidationTracker().removeObserver(roomDatabaseKt$invalidationTrackerFlow$1$observer$1);
                    throw th2;
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(boolean z10, RoomDatabase roomDatabase, String[] strArr, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.f23310r0 = z10;
            this.f23311s0 = roomDatabase;
            this.f23312t0 = strArr;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f23310r0, this.f23311s0, this.f23312t0, continuation);
            anonymousClass1.f23309q0 = obj;
            return anonymousClass1;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(ProducerScope<? super Set<? extends String>> producerScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(producerScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Type inference failed for: r5v0, types: [androidx.room.RoomDatabaseKt$invalidationTrackerFlow$1$observer$1] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            ContinuationInterceptor queryDispatcher;
            Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
            int i10 = this.f23308p0;
            if (i10 == 0) {
                ResultKt.throwOnFailure(obj);
                final ProducerScope producerScope = (ProducerScope) this.f23309q0;
                final AtomicBoolean atomicBoolean = new AtomicBoolean(this.f23310r0);
                final String[] strArr = this.f23312t0;
                ?? r10 = new InvalidationTracker.Observer(strArr) { // from class: androidx.room.RoomDatabaseKt$invalidationTrackerFlow$1$observer$1
                    @Override // androidx.room.InvalidationTracker.Observer
                    public void onInvalidated(@NotNull Set<String> tables) {
                        if (atomicBoolean.get()) {
                            return;
                        }
                        producerScope.mo5953trySendJP2dKIU(tables);
                    }
                };
                TransactionElement transactionElement = (TransactionElement) producerScope.getCoroutineContext().get(TransactionElement.INSTANCE);
                if (transactionElement == null || (queryDispatcher = transactionElement.getTransactionDispatcher()) == null) {
                    queryDispatcher = CoroutinesRoomKt.getQueryDispatcher(this.f23311s0);
                }
                a aVar = new a(BuildersKt__Builders_commonKt.launch$default(producerScope, queryDispatcher, null, new b(this.f23311s0, r10, this.f23310r0, producerScope, this.f23312t0, atomicBoolean, null), 2, null));
                this.f23308p0 = 1;
                if (ProduceKt.awaitClose(producerScope, aVar, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }
    }

    public static final <R> Object a(RoomDatabase roomDatabase, CoroutineContext coroutineContext, Function2<? super CoroutineScope, ? super Continuation<? super R>, ? extends Object> function2, Continuation<? super R> continuation) throws Throwable {
        CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(IntrinsicsKt__IntrinsicsJvmKt.intercepted(continuation), 1);
        cancellableContinuationImpl.initCancellability();
        try {
            roomDatabase.getTransactionExecutor().execute(new a(coroutineContext, cancellableContinuationImpl, roomDatabase, function2));
        } catch (RejectedExecutionException e5) {
            cancellableContinuationImpl.cancel(new IllegalStateException("Unable to acquire a thread to perform the database transaction.", e5));
        }
        Object result = cancellableContinuationImpl.getResult();
        if (result == ek.a.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return result;
    }

    public static final CoroutineContext access$createTransactionContext(RoomDatabase roomDatabase, ContinuationInterceptor continuationInterceptor) {
        TransactionElement transactionElement = new TransactionElement(continuationInterceptor);
        return continuationInterceptor.plus(transactionElement).plus(ThreadContextElementKt.asContextElement(roomDatabase.getSuspendingTransactionId(), Integer.valueOf(System.identityHashCode(transactionElement))));
    }

    @NotNull
    public static final Flow<Set<String>> invalidationTrackerFlow(@NotNull RoomDatabase roomDatabase, @NotNull String[] strArr, boolean z10) {
        return FlowKt.callbackFlow(new AnonymousClass1(z10, roomDatabase, strArr, null));
    }

    public static /* synthetic */ Flow invalidationTrackerFlow$default(RoomDatabase roomDatabase, String[] strArr, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = true;
        }
        return invalidationTrackerFlow(roomDatabase, strArr, z10);
    }

    @Nullable
    public static final <R> Object withTransaction(@NotNull RoomDatabase roomDatabase, @NotNull Function1<? super Continuation<? super R>, ? extends Object> function1, @NotNull Continuation<? super R> continuation) {
        b bVar = new b(roomDatabase, function1, null);
        TransactionElement transactionElement = (TransactionElement) continuation.getF79378p0().get(TransactionElement.INSTANCE);
        ContinuationInterceptor transactionDispatcher = transactionElement != null ? transactionElement.getTransactionDispatcher() : null;
        return transactionDispatcher != null ? BuildersKt.withContext(transactionDispatcher, bVar, continuation) : a(roomDatabase, continuation.getF79378p0(), bVar, continuation);
    }
}

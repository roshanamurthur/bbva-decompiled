package androidx.lifecycle;

import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CancellableContinuation;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.MainCoroutineDispatcher;
import kotlinx.coroutines.sync.Mutex;
import kotlinx.coroutines.sync.MutexKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: RepeatOnLifecycle.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u00000\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001aC\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042'\u0010\u0005\u001a#\b\u0001\u0012\u0004\u0012\u00020\u0007\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\b\u0012\u0006\u0012\u0004\u0018\u00010\t0\u0006¢\u0006\u0002\b\nH\u0086@¢\u0006\u0002\u0010\u000b\u001aC\u0010\u0000\u001a\u00020\u0001*\u00020\f2\u0006\u0010\u0003\u001a\u00020\u00042'\u0010\u0005\u001a#\b\u0001\u0012\u0004\u0012\u00020\u0007\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\b\u0012\u0006\u0012\u0004\u0018\u00010\t0\u0006¢\u0006\u0002\b\nH\u0086@¢\u0006\u0002\u0010\r¨\u0006\u000e"}, d2 = {"repeatOnLifecycle", "", "Landroidx/lifecycle/Lifecycle;", "state", "Landroidx/lifecycle/Lifecycle$State;", "block", "Lkotlin/Function2;", "Lkotlinx/coroutines/CoroutineScope;", "Lkotlin/coroutines/Continuation;", "", "Lkotlin/ExtensionFunctionType;", "(Landroidx/lifecycle/Lifecycle;Landroidx/lifecycle/Lifecycle$State;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Landroidx/lifecycle/LifecycleOwner;", "(Landroidx/lifecycle/LifecycleOwner;Landroidx/lifecycle/Lifecycle$State;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "lifecycle-runtime_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class RepeatOnLifecycleKt {

    /* JADX INFO: compiled from: RepeatOnLifecycle.kt */
    @DebugMetadata(c = "androidx.lifecycle.RepeatOnLifecycleKt$repeatOnLifecycle$3", f = "RepeatOnLifecycle.kt", i = {}, l = {84}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public int f21952p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public /* synthetic */ Object f21953q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ Lifecycle f21954r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final /* synthetic */ Lifecycle.State f21955s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public final /* synthetic */ Function2<CoroutineScope, Continuation<? super Unit>, Object> f21956t0;

        /* JADX INFO: renamed from: androidx.lifecycle.RepeatOnLifecycleKt$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: RepeatOnLifecycle.kt */
        @DebugMetadata(c = "androidx.lifecycle.RepeatOnLifecycleKt$repeatOnLifecycle$3$1", f = "RepeatOnLifecycle.kt", i = {0, 0}, l = {166}, m = "invokeSuspend", n = {"launchedJob", "observer"}, s = {"L$0", "L$1"})
        @SourceDebugExtension({"SMAP\nRepeatOnLifecycle.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RepeatOnLifecycle.kt\nandroidx/lifecycle/RepeatOnLifecycleKt$repeatOnLifecycle$3$1\n+ 2 CancellableContinuation.kt\nkotlinx/coroutines/CancellableContinuationKt\n*L\n1#1,165:1\n314#2,11:166\n*S KotlinDebug\n*F\n+ 1 RepeatOnLifecycle.kt\nandroidx/lifecycle/RepeatOnLifecycleKt$repeatOnLifecycle$3$1\n*L\n97#1:166,11\n*E\n"})
        public static final class C0090a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

            /* JADX INFO: renamed from: p0, reason: collision with root package name */
            public Ref.ObjectRef f21957p0;

            /* JADX INFO: renamed from: q0, reason: collision with root package name */
            public Ref.ObjectRef f21958q0;

            /* JADX INFO: renamed from: r0, reason: collision with root package name */
            public CoroutineScope f21959r0;

            /* JADX INFO: renamed from: s0, reason: collision with root package name */
            public Function2 f21960s0;

            /* JADX INFO: renamed from: t0, reason: collision with root package name */
            public int f21961t0;

            /* JADX INFO: renamed from: u0, reason: collision with root package name */
            public final /* synthetic */ Lifecycle f21962u0;
            public final /* synthetic */ Lifecycle.State v0;

            /* JADX INFO: renamed from: w0, reason: collision with root package name */
            public final /* synthetic */ CoroutineScope f21963w0;

            /* JADX INFO: renamed from: x0, reason: collision with root package name */
            public final /* synthetic */ Function2<CoroutineScope, Continuation<? super Unit>, Object> f21964x0;

            /* JADX INFO: renamed from: androidx.lifecycle.RepeatOnLifecycleKt$a$a$a, reason: collision with other inner class name */
            /* JADX INFO: compiled from: RepeatOnLifecycle.kt */
            public static final class C0091a implements LifecycleEventObserver {

                /* JADX INFO: renamed from: p0, reason: collision with root package name */
                public final /* synthetic */ Lifecycle.Event f21965p0;

                /* JADX INFO: renamed from: q0, reason: collision with root package name */
                public final /* synthetic */ Ref.ObjectRef<Job> f21966q0;

                /* JADX INFO: renamed from: r0, reason: collision with root package name */
                public final /* synthetic */ CoroutineScope f21967r0;

                /* JADX INFO: renamed from: s0, reason: collision with root package name */
                public final /* synthetic */ Lifecycle.Event f21968s0;

                /* JADX INFO: renamed from: t0, reason: collision with root package name */
                public final /* synthetic */ CancellableContinuation<Unit> f21969t0;

                /* JADX INFO: renamed from: u0, reason: collision with root package name */
                public final /* synthetic */ Mutex f21970u0;
                public final /* synthetic */ Function2<CoroutineScope, Continuation<? super Unit>, Object> v0;

                /* JADX INFO: renamed from: androidx.lifecycle.RepeatOnLifecycleKt$a$a$a$a, reason: collision with other inner class name */
                /* JADX INFO: compiled from: RepeatOnLifecycle.kt */
                @DebugMetadata(c = "androidx.lifecycle.RepeatOnLifecycleKt$repeatOnLifecycle$3$1$1$1$1", f = "RepeatOnLifecycle.kt", i = {0, 1}, l = {171, 110}, m = "invokeSuspend", n = {"$this$withLock_u24default$iv", "$this$withLock_u24default$iv"}, s = {"L$0", "L$0"})
                @SourceDebugExtension({"SMAP\nRepeatOnLifecycle.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RepeatOnLifecycle.kt\nandroidx/lifecycle/RepeatOnLifecycleKt$repeatOnLifecycle$3$1$1$1$1\n+ 2 Mutex.kt\nkotlinx/coroutines/sync/MutexKt\n*L\n1#1,165:1\n120#2,10:166\n*S KotlinDebug\n*F\n+ 1 RepeatOnLifecycle.kt\nandroidx/lifecycle/RepeatOnLifecycleKt$repeatOnLifecycle$3$1$1$1$1\n*L\n109#1:166,10\n*E\n"})
                public static final class C0092a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

                    /* JADX INFO: renamed from: p0, reason: collision with root package name */
                    public Mutex f21971p0;

                    /* JADX INFO: renamed from: q0, reason: collision with root package name */
                    public Function2 f21972q0;

                    /* JADX INFO: renamed from: r0, reason: collision with root package name */
                    public int f21973r0;

                    /* JADX INFO: renamed from: s0, reason: collision with root package name */
                    public final /* synthetic */ Mutex f21974s0;

                    /* JADX INFO: renamed from: t0, reason: collision with root package name */
                    public final /* synthetic */ Function2<CoroutineScope, Continuation<? super Unit>, Object> f21975t0;

                    /* JADX INFO: renamed from: androidx.lifecycle.RepeatOnLifecycleKt$a$a$a$a$a, reason: collision with other inner class name */
                    /* JADX INFO: compiled from: RepeatOnLifecycle.kt */
                    @DebugMetadata(c = "androidx.lifecycle.RepeatOnLifecycleKt$repeatOnLifecycle$3$1$1$1$1$1$1", f = "RepeatOnLifecycle.kt", i = {}, l = {111}, m = "invokeSuspend", n = {}, s = {})
                    public static final class C0093a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

                        /* JADX INFO: renamed from: p0, reason: collision with root package name */
                        public int f21976p0;

                        /* JADX INFO: renamed from: q0, reason: collision with root package name */
                        public /* synthetic */ Object f21977q0;

                        /* JADX INFO: renamed from: r0, reason: collision with root package name */
                        public final /* synthetic */ Function2<CoroutineScope, Continuation<? super Unit>, Object> f21978r0;

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        public C0093a(Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object> function2, Continuation<? super C0093a> continuation) {
                            super(2, continuation);
                            this.f21978r0 = function2;
                        }

                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                        @NotNull
                        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                            C0093a c0093a = new C0093a(this.f21978r0, continuation);
                            c0093a.f21977q0 = obj;
                            return c0093a;
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                            return ((C0093a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                        }

                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                        @Nullable
                        public final Object invokeSuspend(@NotNull Object obj) {
                            Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
                            int i10 = this.f21976p0;
                            if (i10 == 0) {
                                ResultKt.throwOnFailure(obj);
                                CoroutineScope coroutineScope = (CoroutineScope) this.f21977q0;
                                this.f21976p0 = 1;
                                if (this.f21978r0.invoke(coroutineScope, this) == coroutine_suspended) {
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

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    public C0092a(Mutex mutex, Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object> function2, Continuation<? super C0092a> continuation) {
                        super(2, continuation);
                        this.f21974s0 = mutex;
                        this.f21975t0 = function2;
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    @NotNull
                    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                        return new C0092a(this.f21974s0, this.f21975t0, continuation);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                        return ((C0092a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    @Nullable
                    public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
                        Mutex mutex;
                        Function2<CoroutineScope, Continuation<? super Unit>, Object> function2;
                        Mutex mutex2;
                        Throwable th2;
                        Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
                        int i10 = this.f21973r0;
                        try {
                            if (i10 == 0) {
                                ResultKt.throwOnFailure(obj);
                                mutex = this.f21974s0;
                                this.f21971p0 = mutex;
                                function2 = this.f21975t0;
                                this.f21972q0 = function2;
                                this.f21973r0 = 1;
                                if (mutex.lock(null, this) == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                            } else {
                                if (i10 != 1) {
                                    if (i10 != 2) {
                                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                    }
                                    mutex2 = this.f21971p0;
                                    try {
                                        ResultKt.throwOnFailure(obj);
                                        Unit unit = Unit.INSTANCE;
                                        mutex2.unlock(null);
                                        return Unit.INSTANCE;
                                    } catch (Throwable th3) {
                                        th2 = th3;
                                        mutex2.unlock(null);
                                        throw th2;
                                    }
                                }
                                function2 = this.f21972q0;
                                Mutex mutex3 = this.f21971p0;
                                ResultKt.throwOnFailure(obj);
                                mutex = mutex3;
                            }
                            C0093a c0093a = new C0093a(function2, null);
                            this.f21971p0 = mutex;
                            this.f21972q0 = null;
                            this.f21973r0 = 2;
                            if (CoroutineScopeKt.coroutineScope(c0093a, this) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            mutex2 = mutex;
                            Unit unit2 = Unit.INSTANCE;
                            mutex2.unlock(null);
                            return Unit.INSTANCE;
                        } catch (Throwable th4) {
                            mutex2 = mutex;
                            th2 = th4;
                            mutex2.unlock(null);
                            throw th2;
                        }
                    }
                }

                public C0091a(Lifecycle.Event event, Ref.ObjectRef objectRef, CoroutineScope coroutineScope, Lifecycle.Event event2, CancellableContinuationImpl cancellableContinuationImpl, Mutex mutex, Function2 function2) {
                    this.f21965p0 = event;
                    this.f21966q0 = objectRef;
                    this.f21967r0 = coroutineScope;
                    this.f21968s0 = event2;
                    this.f21969t0 = cancellableContinuationImpl;
                    this.f21970u0 = mutex;
                    this.v0 = function2;
                }

                /* JADX WARN: Type inference failed for: r9v11, types: [T, kotlinx.coroutines.Job] */
                @Override // androidx.lifecycle.LifecycleEventObserver
                public final void onStateChanged(@NotNull LifecycleOwner lifecycleOwner, @NotNull Lifecycle.Event event) {
                    Intrinsics.checkNotNullParameter(lifecycleOwner, "<anonymous parameter 0>");
                    Intrinsics.checkNotNullParameter(event, "event");
                    Lifecycle.Event event2 = this.f21965p0;
                    Ref.ObjectRef<Job> objectRef = this.f21966q0;
                    if (event == event2) {
                        objectRef.element = BuildersKt__Builders_commonKt.launch$default(this.f21967r0, null, null, new C0092a(this.f21970u0, this.v0, null), 3, null);
                        return;
                    }
                    if (event == this.f21968s0) {
                        Job job = objectRef.element;
                        if (job != null) {
                            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
                        }
                        objectRef.element = null;
                    }
                    if (event == Lifecycle.Event.ON_DESTROY) {
                        Result.Companion companion = Result.INSTANCE;
                        this.f21969t0.resumeWith(Result.m5535constructorimpl(Unit.INSTANCE));
                    }
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public C0090a(Lifecycle lifecycle, Lifecycle.State state, CoroutineScope coroutineScope, Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object> function2, Continuation<? super C0090a> continuation) {
                super(2, continuation);
                this.f21962u0 = lifecycle;
                this.v0 = state;
                this.f21963w0 = coroutineScope;
                this.f21964x0 = function2;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                return new C0090a(this.f21962u0, this.v0, this.f21963w0, this.f21964x0, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((C0090a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* JADX WARN: Code duplicated, block: B:28:0x0098  */
            /* JADX WARN: Code duplicated, block: B:31:0x00a2  */
            /* JADX WARN: Code duplicated, block: B:36:0x00ae  */
            /* JADX WARN: Code duplicated, block: B:39:0x00b8  */
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r11v0, types: [T, androidx.lifecycle.LifecycleObserver, androidx.lifecycle.RepeatOnLifecycleKt$a$a$a, java.lang.Object] */
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
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
                Ref.ObjectRef objectRef;
                Ref.ObjectRef objectRef2;
                Job job;
                LifecycleEventObserver lifecycleEventObserver;
                Job job2;
                LifecycleEventObserver lifecycleEventObserver2;
                Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
                int i10 = this.f21961t0;
                Lifecycle lifecycle = this.f21962u0;
                if (i10 != 0) {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    objectRef2 = this.f21958q0;
                    objectRef = this.f21957p0;
                    try {
                        ResultKt.throwOnFailure(obj);
                        job2 = (Job) objectRef.element;
                        if (job2 != null) {
                            Job.DefaultImpls.cancel$default(job2, (CancellationException) null, 1, (Object) null);
                        }
                        lifecycleEventObserver2 = (LifecycleEventObserver) objectRef2.element;
                        if (lifecycleEventObserver2 != null) {
                            lifecycle.removeObserver(lifecycleEventObserver2);
                        }
                        return Unit.INSTANCE;
                    } catch (Throwable th2) {
                        th = th2;
                        job = (Job) objectRef.element;
                        if (job != null) {
                            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
                        }
                        lifecycleEventObserver = (LifecycleEventObserver) objectRef2.element;
                        if (lifecycleEventObserver != null) {
                            lifecycle.removeObserver(lifecycleEventObserver);
                        }
                        throw th;
                    }
                }
                ResultKt.throwOnFailure(obj);
                if (lifecycle.getF21906d() == Lifecycle.State.DESTROYED) {
                    return Unit.INSTANCE;
                }
                Ref.ObjectRef objectRef3 = new Ref.ObjectRef();
                Ref.ObjectRef objectRef4 = new Ref.ObjectRef();
                try {
                    Lifecycle.State state = this.v0;
                    CoroutineScope coroutineScope = this.f21963w0;
                    Function2<CoroutineScope, Continuation<? super Unit>, Object> function2 = this.f21964x0;
                    this.f21957p0 = objectRef3;
                    this.f21958q0 = objectRef4;
                    this.f21959r0 = coroutineScope;
                    this.f21960s0 = function2;
                    this.f21961t0 = 1;
                    CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(IntrinsicsKt__IntrinsicsJvmKt.intercepted(this), 1);
                    cancellableContinuationImpl.initCancellability();
                    Lifecycle.Event.Companion companion = Lifecycle.Event.INSTANCE;
                    ?? c0091a = new C0091a(companion.upTo(state), objectRef3, coroutineScope, companion.downFrom(state), cancellableContinuationImpl, MutexKt.Mutex$default(false, 1, null), function2);
                    objectRef4.element = c0091a;
                    Intrinsics.checkNotNull(c0091a, "null cannot be cast to non-null type androidx.lifecycle.LifecycleEventObserver");
                    lifecycle.addObserver(c0091a);
                    Object result = cancellableContinuationImpl.getResult();
                    if (result == ek.a.getCOROUTINE_SUSPENDED()) {
                        DebugProbesKt.probeCoroutineSuspended(this);
                    }
                    if (result == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    objectRef = objectRef3;
                    objectRef2 = objectRef4;
                    job2 = (Job) objectRef.element;
                    if (job2 != null) {
                        Job.DefaultImpls.cancel$default(job2, (CancellationException) null, 1, (Object) null);
                    }
                    lifecycleEventObserver2 = (LifecycleEventObserver) objectRef2.element;
                    if (lifecycleEventObserver2 != null) {
                        lifecycle.removeObserver(lifecycleEventObserver2);
                    }
                    return Unit.INSTANCE;
                } catch (Throwable th3) {
                    th = th3;
                    objectRef = objectRef3;
                    objectRef2 = objectRef4;
                    job = (Job) objectRef.element;
                    if (job != null) {
                        Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
                    }
                    lifecycleEventObserver = (LifecycleEventObserver) objectRef2.element;
                    if (lifecycleEventObserver != null) {
                        lifecycle.removeObserver(lifecycleEventObserver);
                    }
                    throw th;
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(Lifecycle lifecycle, Lifecycle.State state, Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object> function2, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f21954r0 = lifecycle;
            this.f21955s0 = state;
            this.f21956t0 = function2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            a aVar = new a(this.f21954r0, this.f21955s0, this.f21956t0, continuation);
            aVar.f21953q0 = obj;
            return aVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
            int i10 = this.f21952p0;
            if (i10 == 0) {
                ResultKt.throwOnFailure(obj);
                CoroutineScope coroutineScope = (CoroutineScope) this.f21953q0;
                MainCoroutineDispatcher immediate = Dispatchers.getMain().getImmediate();
                C0090a c0090a = new C0090a(this.f21954r0, this.f21955s0, coroutineScope, this.f21956t0, null);
                this.f21952p0 = 1;
                if (BuildersKt.withContext(immediate, c0090a, this) == coroutine_suspended) {
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

    @Nullable
    public static final Object repeatOnLifecycle(@NotNull Lifecycle lifecycle, @NotNull Lifecycle.State state, @NotNull Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object> function2, @NotNull Continuation<? super Unit> continuation) {
        if (state == Lifecycle.State.INITIALIZED) {
            throw new IllegalArgumentException("repeatOnLifecycle cannot start work with the INITIALIZED lifecycle state.".toString());
        }
        if (lifecycle.getF21906d() == Lifecycle.State.DESTROYED) {
            return Unit.INSTANCE;
        }
        Object objCoroutineScope = CoroutineScopeKt.coroutineScope(new a(lifecycle, state, function2, null), continuation);
        return objCoroutineScope == ek.a.getCOROUTINE_SUSPENDED() ? objCoroutineScope : Unit.INSTANCE;
    }

    @Nullable
    public static final Object repeatOnLifecycle(@NotNull LifecycleOwner lifecycleOwner, @NotNull Lifecycle.State state, @NotNull Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object> function2, @NotNull Continuation<? super Unit> continuation) {
        Object objRepeatOnLifecycle = repeatOnLifecycle(lifecycleOwner.getLifecycle(), state, function2, continuation);
        return objRepeatOnLifecycle == ek.a.getCOROUTINE_SUSPENDED() ? objRepeatOnLifecycle : Unit.INSTANCE;
    }
}

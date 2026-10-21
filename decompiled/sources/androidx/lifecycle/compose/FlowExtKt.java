package androidx.lifecycle.compose;

import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ProduceStateScope;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.exifinterface.media.ExifInterface;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.RepeatOnLifecycleKt;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.StateFlow;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: FlowExt.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u00002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001aG\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00032\u0006\u0010\u0004\u001a\u0002H\u00022\u0006\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\nH\u0007¢\u0006\u0002\u0010\u000b\u001aI\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00032\u0006\u0010\u0004\u001a\u0002H\u00022\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\nH\u0007¢\u0006\u0002\u0010\u000e\u001a?\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u000f2\u0006\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\nH\u0007¢\u0006\u0002\u0010\u0010\u001aA\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u000f2\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\nH\u0007¢\u0006\u0002\u0010\u0011¨\u0006\u0012"}, d2 = {"collectAsStateWithLifecycle", "Landroidx/compose/runtime/State;", ExifInterface.GPS_DIRECTION_TRUE, "Lkotlinx/coroutines/flow/Flow;", "initialValue", "lifecycle", "Landroidx/lifecycle/Lifecycle;", "minActiveState", "Landroidx/lifecycle/Lifecycle$State;", "context", "Lkotlin/coroutines/CoroutineContext;", "(Lkotlinx/coroutines/flow/Flow;Ljava/lang/Object;Landroidx/lifecycle/Lifecycle;Landroidx/lifecycle/Lifecycle$State;Lkotlin/coroutines/CoroutineContext;Landroidx/compose/runtime/Composer;II)Landroidx/compose/runtime/State;", "lifecycleOwner", "Landroidx/lifecycle/LifecycleOwner;", "(Lkotlinx/coroutines/flow/Flow;Ljava/lang/Object;Landroidx/lifecycle/LifecycleOwner;Landroidx/lifecycle/Lifecycle$State;Lkotlin/coroutines/CoroutineContext;Landroidx/compose/runtime/Composer;II)Landroidx/compose/runtime/State;", "Lkotlinx/coroutines/flow/StateFlow;", "(Lkotlinx/coroutines/flow/StateFlow;Landroidx/lifecycle/Lifecycle;Landroidx/lifecycle/Lifecycle$State;Lkotlin/coroutines/CoroutineContext;Landroidx/compose/runtime/Composer;II)Landroidx/compose/runtime/State;", "(Lkotlinx/coroutines/flow/StateFlow;Landroidx/lifecycle/LifecycleOwner;Landroidx/lifecycle/Lifecycle$State;Lkotlin/coroutines/CoroutineContext;Landroidx/compose/runtime/Composer;II)Landroidx/compose/runtime/State;", "lifecycle-runtime-compose_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nFlowExt.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FlowExt.kt\nandroidx/lifecycle/compose/FlowExtKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,181:1\n77#2:182\n77#2:183\n1225#3,6:184\n*S KotlinDebug\n*F\n+ 1 FlowExt.kt\nandroidx/lifecycle/compose/FlowExtKt\n*L\n58#1:182\n131#1:183\n171#1:184,6\n*E\n"})
public final class FlowExtKt {

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: compiled from: FlowExt.kt */
    @DebugMetadata(c = "androidx.lifecycle.compose.FlowExtKt$collectAsStateWithLifecycle$1$1", f = "FlowExt.kt", i = {}, l = {172}, m = "invokeSuspend", n = {}, s = {})
    public static final class a<T> extends SuspendLambda implements Function2<ProduceStateScope<T>, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public int f22066p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public /* synthetic */ Object f22067q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ Lifecycle f22068r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final /* synthetic */ Lifecycle.State f22069s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public final /* synthetic */ CoroutineContext f22070t0;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public final /* synthetic */ Flow<T> f22071u0;

        /* JADX INFO: renamed from: androidx.lifecycle.compose.FlowExtKt$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: FlowExt.kt */
        @DebugMetadata(c = "androidx.lifecycle.compose.FlowExtKt$collectAsStateWithLifecycle$1$1$1", f = "FlowExt.kt", i = {}, l = {174, 175}, m = "invokeSuspend", n = {}, s = {})
        public static final class C0095a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

            /* JADX INFO: renamed from: p0, reason: collision with root package name */
            public int f22072p0;

            /* JADX INFO: renamed from: q0, reason: collision with root package name */
            public final /* synthetic */ CoroutineContext f22073q0;

            /* JADX INFO: renamed from: r0, reason: collision with root package name */
            public final /* synthetic */ Flow<T> f22074r0;

            /* JADX INFO: renamed from: s0, reason: collision with root package name */
            public final /* synthetic */ ProduceStateScope<T> f22075s0;

            /* JADX INFO: renamed from: androidx.lifecycle.compose.FlowExtKt$a$a$a, reason: collision with other inner class name */
            /* JADX INFO: compiled from: FlowExt.kt */
            public static final class C0096a<T> implements FlowCollector {

                /* JADX INFO: renamed from: p0, reason: collision with root package name */
                public final /* synthetic */ ProduceStateScope<T> f22076p0;

                public C0096a(ProduceStateScope<T> produceStateScope) {
                    this.f22076p0 = produceStateScope;
                }

                @Override // kotlinx.coroutines.flow.FlowCollector
                @Nullable
                public final Object emit(T t10, @NotNull Continuation<? super Unit> continuation) {
                    this.f22076p0.setValue(t10);
                    return Unit.INSTANCE;
                }
            }

            /* JADX INFO: renamed from: androidx.lifecycle.compose.FlowExtKt$a$a$b */
            /* JADX INFO: compiled from: FlowExt.kt */
            @DebugMetadata(c = "androidx.lifecycle.compose.FlowExtKt$collectAsStateWithLifecycle$1$1$1$2", f = "FlowExt.kt", i = {}, l = {176}, m = "invokeSuspend", n = {}, s = {})
            public static final class b extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

                /* JADX INFO: renamed from: p0, reason: collision with root package name */
                public int f22077p0;

                /* JADX INFO: renamed from: q0, reason: collision with root package name */
                public final /* synthetic */ Flow<T> f22078q0;

                /* JADX INFO: renamed from: r0, reason: collision with root package name */
                public final /* synthetic */ ProduceStateScope<T> f22079r0;

                /* JADX INFO: renamed from: androidx.lifecycle.compose.FlowExtKt$a$a$b$a, reason: collision with other inner class name */
                /* JADX INFO: compiled from: FlowExt.kt */
                public static final class C0097a<T> implements FlowCollector {

                    /* JADX INFO: renamed from: p0, reason: collision with root package name */
                    public final /* synthetic */ ProduceStateScope<T> f22080p0;

                    public C0097a(ProduceStateScope<T> produceStateScope) {
                        this.f22080p0 = produceStateScope;
                    }

                    @Override // kotlinx.coroutines.flow.FlowCollector
                    @Nullable
                    public final Object emit(T t10, @NotNull Continuation<? super Unit> continuation) {
                        this.f22080p0.setValue(t10);
                        return Unit.INSTANCE;
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                public b(Flow<? extends T> flow, ProduceStateScope<T> produceStateScope, Continuation<? super b> continuation) {
                    super(2, continuation);
                    this.f22078q0 = flow;
                    this.f22079r0 = produceStateScope;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @NotNull
                public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                    return new b(this.f22078q0, this.f22079r0, continuation);
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                    return ((b) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @Nullable
                public final Object invokeSuspend(@NotNull Object obj) {
                    Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
                    int i10 = this.f22077p0;
                    if (i10 == 0) {
                        ResultKt.throwOnFailure(obj);
                        C0097a c0097a = new C0097a(this.f22079r0);
                        this.f22077p0 = 1;
                        if (this.f22078q0.collect(c0097a, this) == coroutine_suspended) {
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
            public C0095a(CoroutineContext coroutineContext, Flow<? extends T> flow, ProduceStateScope<T> produceStateScope, Continuation<? super C0095a> continuation) {
                super(2, continuation);
                this.f22073q0 = coroutineContext;
                this.f22074r0 = flow;
                this.f22075s0 = produceStateScope;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                return new C0095a(this.f22073q0, this.f22074r0, this.f22075s0, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((C0095a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
                int i10 = this.f22072p0;
                if (i10 == 0) {
                    ResultKt.throwOnFailure(obj);
                    EmptyCoroutineContext emptyCoroutineContext = EmptyCoroutineContext.INSTANCE;
                    CoroutineContext coroutineContext = this.f22073q0;
                    boolean zAreEqual = Intrinsics.areEqual(coroutineContext, emptyCoroutineContext);
                    ProduceStateScope<T> produceStateScope = this.f22075s0;
                    Flow<T> flow = this.f22074r0;
                    if (zAreEqual) {
                        C0096a c0096a = new C0096a(produceStateScope);
                        this.f22072p0 = 1;
                        if (flow.collect(c0096a, this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        b bVar = new b(flow, produceStateScope, null);
                        this.f22072p0 = 2;
                        if (BuildersKt.withContext(coroutineContext, bVar, this) == coroutine_suspended) {
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
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(Lifecycle lifecycle, Lifecycle.State state, CoroutineContext coroutineContext, Flow<? extends T> flow, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f22068r0 = lifecycle;
            this.f22069s0 = state;
            this.f22070t0 = coroutineContext;
            this.f22071u0 = flow;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            a aVar = new a(this.f22068r0, this.f22069s0, this.f22070t0, this.f22071u0, continuation);
            aVar.f22067q0 = obj;
            return aVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Continuation<? super Unit> continuation) {
            return ((a) create((ProduceStateScope) obj, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
            int i10 = this.f22066p0;
            if (i10 == 0) {
                ResultKt.throwOnFailure(obj);
                ProduceStateScope produceStateScope = (ProduceStateScope) this.f22067q0;
                C0095a c0095a = new C0095a(this.f22070t0, this.f22071u0, produceStateScope, null);
                this.f22066p0 = 1;
                if (RepeatOnLifecycleKt.repeatOnLifecycle(this.f22068r0, this.f22069s0, c0095a, this) == coroutine_suspended) {
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

    @Composable
    @NotNull
    public static final <T> State<T> collectAsStateWithLifecycle(@NotNull StateFlow<? extends T> stateFlow, @Nullable LifecycleOwner lifecycleOwner, @Nullable Lifecycle.State state, @Nullable CoroutineContext coroutineContext, @Nullable Composer composer, int i10, int i11) {
        if ((i11 & 1) != 0) {
            lifecycleOwner = (LifecycleOwner) composer.consume(LocalLifecycleOwnerKt.getLocalLifecycleOwner());
        }
        if ((i11 & 2) != 0) {
            state = Lifecycle.State.STARTED;
        }
        Lifecycle.State state2 = state;
        if ((i11 & 4) != 0) {
            coroutineContext = EmptyCoroutineContext.INSTANCE;
        }
        CoroutineContext coroutineContext2 = coroutineContext;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(743249048, i10, -1, "androidx.lifecycle.compose.collectAsStateWithLifecycle (FlowExt.kt:60)");
        }
        int i12 = i10 << 3;
        State<T> stateCollectAsStateWithLifecycle = collectAsStateWithLifecycle(stateFlow, stateFlow.getValue(), lifecycleOwner.getLifecycle(), state2, coroutineContext2, composer, (i10 & 14) | (i12 & 7168) | (i12 & 57344), 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return stateCollectAsStateWithLifecycle;
    }

    @Composable
    @NotNull
    public static final <T> State<T> collectAsStateWithLifecycle(@NotNull StateFlow<? extends T> stateFlow, @NotNull Lifecycle lifecycle, @Nullable Lifecycle.State state, @Nullable CoroutineContext coroutineContext, @Nullable Composer composer, int i10, int i11) {
        if ((i11 & 2) != 0) {
            state = Lifecycle.State.STARTED;
        }
        Lifecycle.State state2 = state;
        if ((i11 & 4) != 0) {
            coroutineContext = EmptyCoroutineContext.INSTANCE;
        }
        CoroutineContext coroutineContext2 = coroutineContext;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1858162195, i10, -1, "androidx.lifecycle.compose.collectAsStateWithLifecycle (FlowExt.kt:95)");
        }
        int i12 = i10 << 3;
        State<T> stateCollectAsStateWithLifecycle = collectAsStateWithLifecycle(stateFlow, stateFlow.getValue(), lifecycle, state2, coroutineContext2, composer, (i10 & 14) | (i12 & 896) | (i12 & 7168) | (i12 & 57344), 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return stateCollectAsStateWithLifecycle;
    }

    @Composable
    @NotNull
    public static final <T> State<T> collectAsStateWithLifecycle(@NotNull Flow<? extends T> flow, T t10, @Nullable LifecycleOwner lifecycleOwner, @Nullable Lifecycle.State state, @Nullable CoroutineContext coroutineContext, @Nullable Composer composer, int i10, int i11) {
        if ((i11 & 2) != 0) {
            lifecycleOwner = (LifecycleOwner) composer.consume(LocalLifecycleOwnerKt.getLocalLifecycleOwner());
        }
        if ((i11 & 4) != 0) {
            state = Lifecycle.State.STARTED;
        }
        Lifecycle.State state2 = state;
        if ((i11 & 8) != 0) {
            coroutineContext = EmptyCoroutineContext.INSTANCE;
        }
        CoroutineContext coroutineContext2 = coroutineContext;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1485997211, i10, -1, "androidx.lifecycle.compose.collectAsStateWithLifecycle (FlowExt.kt:133)");
        }
        State<T> stateCollectAsStateWithLifecycle = collectAsStateWithLifecycle(flow, t10, lifecycleOwner.getLifecycle(), state2, coroutineContext2, composer, (i10 & 14) | (((i10 >> 3) & 8) << 3) | (i10 & 112) | (i10 & 7168) | (57344 & i10), 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return stateCollectAsStateWithLifecycle;
    }

    @Composable
    @NotNull
    public static final <T> State<T> collectAsStateWithLifecycle(@NotNull Flow<? extends T> flow, T t10, @NotNull Lifecycle lifecycle, @Nullable Lifecycle.State state, @Nullable CoroutineContext coroutineContext, @Nullable Composer composer, int i10, int i11) {
        if ((i11 & 4) != 0) {
            state = Lifecycle.State.STARTED;
        }
        Lifecycle.State state2 = state;
        if ((i11 & 8) != 0) {
            coroutineContext = EmptyCoroutineContext.INSTANCE;
        }
        CoroutineContext coroutineContext2 = coroutineContext;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1977777920, i10, -1, "androidx.lifecycle.compose.collectAsStateWithLifecycle (FlowExt.kt:169)");
        }
        Object[] objArr = {flow, lifecycle, state2, coroutineContext2};
        boolean zChangedInstance = ((((i10 & 7168) ^ 3072) > 2048 && composer.changed(state2)) || (i10 & 3072) == 2048) | composer.changedInstance(lifecycle) | composer.changedInstance(coroutineContext2) | composer.changedInstance(flow);
        Object objRememberedValue = composer.rememberedValue();
        if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = new a(lifecycle, state2, coroutineContext2, flow, null);
            composer.updateRememberedValue(objRememberedValue);
        }
        int i12 = i10 >> 3;
        State<T> stateProduceState = SnapshotStateKt.produceState((Object) t10, objArr, (Function2) objRememberedValue, composer, (i12 & 14) | (i12 & 8));
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return stateProduceState;
    }
}

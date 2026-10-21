package m0;

import androidx.compose.runtime.ProduceStateScope;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: SnapshotFlow.kt */
/* JADX INFO: loaded from: classes.dex */
@DebugMetadata(c = "androidx.compose.runtime.SnapshotStateKt__SnapshotFlowKt$collectAsState$1$1", f = "SnapshotFlow.kt", i = {}, l = {68, 69}, m = "invokeSuspend", n = {}, s = {})
public final class o0 extends SuspendLambda implements Function2<ProduceStateScope<Object>, Continuation<? super Unit>, Object> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public int f83287p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public /* synthetic */ Object f83288q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final /* synthetic */ CoroutineContext f83289r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final /* synthetic */ Flow<Object> f83290s0;

    /* JADX INFO: compiled from: SnapshotFlow.kt */
    public static final class a<T> implements FlowCollector {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ ProduceStateScope<Object> f83291p0;

        public a(ProduceStateScope<Object> produceStateScope) {
            this.f83291p0 = produceStateScope;
        }

        @Override // kotlinx.coroutines.flow.FlowCollector
        @Nullable
        public final Object emit(T t10, @NotNull Continuation<? super Unit> continuation) {
            this.f83291p0.setValue(t10);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: SnapshotFlow.kt */
    @DebugMetadata(c = "androidx.compose.runtime.SnapshotStateKt__SnapshotFlowKt$collectAsState$1$1$2", f = "SnapshotFlow.kt", i = {}, l = {70}, m = "invokeSuspend", n = {}, s = {})
    public static final class b extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public int f83292p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ Flow<Object> f83293q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ ProduceStateScope<Object> f83294r0;

        /* JADX INFO: compiled from: SnapshotFlow.kt */
        public static final class a<T> implements FlowCollector {

            /* JADX INFO: renamed from: p0, reason: collision with root package name */
            public final /* synthetic */ ProduceStateScope<Object> f83295p0;

            public a(ProduceStateScope<Object> produceStateScope) {
                this.f83295p0 = produceStateScope;
            }

            @Override // kotlinx.coroutines.flow.FlowCollector
            @Nullable
            public final Object emit(T t10, @NotNull Continuation<? super Unit> continuation) {
                this.f83295p0.setValue(t10);
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Flow<Object> flow, ProduceStateScope<Object> produceStateScope, Continuation<? super b> continuation) {
            super(2, continuation);
            this.f83293q0 = flow;
            this.f83294r0 = produceStateScope;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new b(this.f83293q0, this.f83294r0, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((b) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
            int i10 = this.f83292p0;
            if (i10 == 0) {
                ResultKt.throwOnFailure(obj);
                a aVar = new a(this.f83294r0);
                this.f83292p0 = 1;
                if (this.f83293q0.collect(aVar, this) == coroutine_suspended) {
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
    public o0(CoroutineContext coroutineContext, Flow<Object> flow, Continuation<? super o0> continuation) {
        super(2, continuation);
        this.f83289r0 = coroutineContext;
        this.f83290s0 = flow;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        o0 o0Var = new o0(this.f83289r0, this.f83290s0, continuation);
        o0Var.f83288q0 = obj;
        return o0Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(ProduceStateScope<Object> produceStateScope, Continuation<? super Unit> continuation) {
        return ((o0) create(produceStateScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
        int i10 = this.f83287p0;
        if (i10 == 0) {
            ResultKt.throwOnFailure(obj);
            ProduceStateScope produceStateScope = (ProduceStateScope) this.f83288q0;
            EmptyCoroutineContext emptyCoroutineContext = EmptyCoroutineContext.INSTANCE;
            CoroutineContext coroutineContext = this.f83289r0;
            boolean zAreEqual = Intrinsics.areEqual(coroutineContext, emptyCoroutineContext);
            Flow<Object> flow = this.f83290s0;
            if (zAreEqual) {
                a aVar = new a(produceStateScope);
                this.f83287p0 = 1;
                if (flow.collect(aVar, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                b bVar = new b(flow, produceStateScope, null);
                this.f83287p0 = 2;
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

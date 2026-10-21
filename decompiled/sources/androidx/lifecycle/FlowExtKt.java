package androidx.lifecycle;

import androidx.exifinterface.media.ExifInterface;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.channels.ProducerScope;
import kotlinx.coroutines.channels.SendChannel;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: FlowExt.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a.\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, d2 = {"flowWithLifecycle", "Lkotlinx/coroutines/flow/Flow;", ExifInterface.GPS_DIRECTION_TRUE, "lifecycle", "Landroidx/lifecycle/Lifecycle;", "minActiveState", "Landroidx/lifecycle/Lifecycle$State;", "lifecycle-runtime_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class FlowExtKt {

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: compiled from: FlowExt.kt */
    @DebugMetadata(c = "androidx.lifecycle.FlowExtKt$flowWithLifecycle$1", f = "FlowExt.kt", i = {0}, l = {91}, m = "invokeSuspend", n = {"$this$callbackFlow"}, s = {"L$0"})
    public static final class a<T> extends SuspendLambda implements Function2<ProducerScope<? super T>, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public int f21856p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public /* synthetic */ Object f21857q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ Lifecycle f21858r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final /* synthetic */ Lifecycle.State f21859s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public final /* synthetic */ Flow<T> f21860t0;

        /* JADX INFO: renamed from: androidx.lifecycle.FlowExtKt$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: FlowExt.kt */
        @DebugMetadata(c = "androidx.lifecycle.FlowExtKt$flowWithLifecycle$1$1", f = "FlowExt.kt", i = {}, l = {92}, m = "invokeSuspend", n = {}, s = {})
        public static final class C0086a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

            /* JADX INFO: renamed from: p0, reason: collision with root package name */
            public int f21861p0;

            /* JADX INFO: renamed from: q0, reason: collision with root package name */
            public final /* synthetic */ Flow<T> f21862q0;

            /* JADX INFO: renamed from: r0, reason: collision with root package name */
            public final /* synthetic */ ProducerScope<T> f21863r0;

            /* JADX INFO: renamed from: androidx.lifecycle.FlowExtKt$a$a$a, reason: collision with other inner class name */
            /* JADX INFO: compiled from: FlowExt.kt */
            public static final class C0087a<T> implements FlowCollector {

                /* JADX INFO: renamed from: p0, reason: collision with root package name */
                public final /* synthetic */ ProducerScope<T> f21864p0;

                /* JADX WARN: Multi-variable type inference failed */
                public C0087a(ProducerScope<? super T> producerScope) {
                    this.f21864p0 = producerScope;
                }

                @Override // kotlinx.coroutines.flow.FlowCollector
                @Nullable
                public final Object emit(T t10, @NotNull Continuation<? super Unit> continuation) {
                    Object objSend = this.f21864p0.send(t10, continuation);
                    return objSend == ek.a.getCOROUTINE_SUSPENDED() ? objSend : Unit.INSTANCE;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public C0086a(Flow<? extends T> flow, ProducerScope<? super T> producerScope, Continuation<? super C0086a> continuation) {
                super(2, continuation);
                this.f21862q0 = flow;
                this.f21863r0 = producerScope;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                return new C0086a(this.f21862q0, this.f21863r0, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((C0086a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
                int i10 = this.f21861p0;
                if (i10 == 0) {
                    ResultKt.throwOnFailure(obj);
                    C0087a c0087a = new C0087a(this.f21863r0);
                    this.f21861p0 = 1;
                    if (this.f21862q0.collect(c0087a, this) == coroutine_suspended) {
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
        public a(Lifecycle lifecycle, Lifecycle.State state, Flow<? extends T> flow, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f21858r0 = lifecycle;
            this.f21859s0 = state;
            this.f21860t0 = flow;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            a aVar = new a(this.f21858r0, this.f21859s0, this.f21860t0, continuation);
            aVar.f21857q0 = obj;
            return aVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Continuation<? super Unit> continuation) {
            return ((a) create((ProducerScope) obj, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            ProducerScope producerScope;
            Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
            int i10 = this.f21856p0;
            if (i10 == 0) {
                ResultKt.throwOnFailure(obj);
                ProducerScope producerScope2 = (ProducerScope) this.f21857q0;
                C0086a c0086a = new C0086a(this.f21860t0, producerScope2, null);
                this.f21857q0 = producerScope2;
                this.f21856p0 = 1;
                if (RepeatOnLifecycleKt.repeatOnLifecycle(this.f21858r0, this.f21859s0, c0086a, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                producerScope = producerScope2;
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                producerScope = (ProducerScope) this.f21857q0;
                ResultKt.throwOnFailure(obj);
            }
            SendChannel.DefaultImpls.close$default(producerScope, null, 1, null);
            return Unit.INSTANCE;
        }
    }

    @NotNull
    public static final <T> Flow<T> flowWithLifecycle(@NotNull Flow<? extends T> flow, @NotNull Lifecycle lifecycle, @NotNull Lifecycle.State minActiveState) {
        Intrinsics.checkNotNullParameter(flow, "<this>");
        Intrinsics.checkNotNullParameter(lifecycle, "lifecycle");
        Intrinsics.checkNotNullParameter(minActiveState, "minActiveState");
        return FlowKt.callbackFlow(new a(lifecycle, minActiveState, flow, null));
    }

    public static /* synthetic */ Flow flowWithLifecycle$default(Flow flow, Lifecycle lifecycle, Lifecycle.State state, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            state = Lifecycle.State.STARTED;
        }
        return flowWithLifecycle(flow, lifecycle, state);
    }
}

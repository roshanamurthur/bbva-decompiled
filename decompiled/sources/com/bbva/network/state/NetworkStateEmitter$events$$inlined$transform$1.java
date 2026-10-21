package com.bbva.network.state;

import androidx.exifinterface.media.ExifInterface;
import com.bbva.network.model.ConnectionStatusEvent;
import ek.a;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: Emitters.kt */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00010\u0002H\u008a@¨\u0006\u0004"}, d2 = {ExifInterface.GPS_DIRECTION_TRUE, "R", "Lkotlinx/coroutines/flow/FlowCollector;", "", "kotlinx/coroutines/flow/FlowKt__EmittersKt$transform$1", "<anonymous>"}, k = 3, mv = {1, 8, 0})
@DebugMetadata(c = "com.bbva.network.state.NetworkStateEmitter$events$$inlined$transform$1", f = "NetworkStateEmitter.kt", i = {}, l = {40}, m = "invokeSuspend", n = {}, s = {})
@SourceDebugExtension({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$transform$1\n*L\n1#1,222:1\n*E\n"})
public final class NetworkStateEmitter$events$$inlined$transform$1 extends SuspendLambda implements Function2<FlowCollector<? super ConnectionStatusEvent>, Continuation<? super Unit>, Object> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public int f35187p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public /* synthetic */ Object f35188q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final /* synthetic */ Flow f35189r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final /* synthetic */ NetworkStateEmitter f35190s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public final /* synthetic */ long f35191t0;

    /* JADX INFO: renamed from: com.bbva.network.state.NetworkStateEmitter$events$$inlined$transform$1$1, reason: invalid class name */
    /* JADX INFO: compiled from: Emitters.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u00032\u0006\u0010\u0004\u001a\u0002H\u0002H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"<anonymous>", "", ExifInterface.GPS_DIRECTION_TRUE, "R", "value", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx/coroutines/flow/FlowKt__EmittersKt$transform$1$1"}, k = 3, mv = {1, 8, 0}, xi = 48)
    @SourceDebugExtension({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$transform$1$1\n+ 2 NetworkStateEmitter.kt\ncom/bbva/network/state/NetworkStateEmitter\n*L\n1#1,222:1\n43#2,4:223\n*E\n"})
    public static final class AnonymousClass1<T> implements FlowCollector {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ FlowCollector<ConnectionStatusEvent> f35192p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ NetworkStateEmitter f35193q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ long f35194r0;

        /* JADX INFO: renamed from: com.bbva.network.state.NetworkStateEmitter$events$$inlined$transform$1$1$1, reason: invalid class name and collision with other inner class name */
        /* JADX INFO: compiled from: Emitters.kt */
        @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
        @DebugMetadata(c = "com.bbva.network.state.NetworkStateEmitter$events$$inlined$transform$1$1", f = "NetworkStateEmitter.kt", i = {0, 0}, l = {223, 225}, m = "emit", n = {"this", "it"}, s = {"L$0", "L$1"})
        @SourceDebugExtension({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$transform$1$1$emit$1\n*L\n1#1,222:1\n*E\n"})
        public static final class C01491 extends ContinuationImpl {

            /* JADX INFO: renamed from: p0, reason: collision with root package name */
            public /* synthetic */ Object f35195p0;

            /* JADX INFO: renamed from: q0, reason: collision with root package name */
            public int f35196q0;

            /* JADX INFO: renamed from: s0, reason: collision with root package name */
            public AnonymousClass1 f35198s0;

            /* JADX INFO: renamed from: t0, reason: collision with root package name */
            public ConnectionStatusEvent f35199t0;

            public C01491(Continuation continuation) {
                super(continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                this.f35195p0 = obj;
                this.f35196q0 |= Integer.MIN_VALUE;
                return AnonymousClass1.this.emit(null, this);
            }
        }

        public AnonymousClass1(FlowCollector flowCollector, NetworkStateEmitter networkStateEmitter, long j10) {
            this.f35193q0 = networkStateEmitter;
            this.f35194r0 = j10;
            this.f35192p0 = flowCollector;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlinx.coroutines.flow.FlowCollector
        @Nullable
        public final Object emit(T t10, @NotNull Continuation<? super Unit> continuation) {
            C01491 c01491;
            ConnectionStatusEvent connectionStatusEvent;
            AnonymousClass1<T> anonymousClass1;
            if (continuation instanceof C01491) {
                c01491 = (C01491) continuation;
                int i10 = c01491.f35196q0;
                if ((i10 & Integer.MIN_VALUE) != 0) {
                    c01491.f35196q0 = i10 - Integer.MIN_VALUE;
                } else {
                    c01491 = new C01491(continuation);
                }
            } else {
                c01491 = new C01491(continuation);
            }
            Object obj = c01491.f35195p0;
            Object coroutine_suspended = a.getCOROUTINE_SUSPENDED();
            int i11 = c01491.f35196q0;
            if (i11 != 0) {
                if (i11 == 1) {
                    connectionStatusEvent = c01491.f35199t0;
                    anonymousClass1 = c01491.f35198s0;
                    ResultKt.throwOnFailure(obj);
                } else {
                    if (i11 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            }
            ResultKt.throwOnFailure(obj);
            connectionStatusEvent = (ConnectionStatusEvent) t10;
            c01491.f35198s0 = this;
            c01491.f35199t0 = connectionStatusEvent;
            c01491.f35196q0 = 1;
            if (this.f35192p0.emit(connectionStatusEvent, c01491) == coroutine_suspended) {
                return coroutine_suspended;
            }
            anonymousClass1 = this;
            anonymousClass1.f35193q0.f35183t0 = connectionStatusEvent.getStatus();
            c01491.f35198s0 = null;
            c01491.f35199t0 = null;
            c01491.f35196q0 = 2;
            if (DelayKt.delay(anonymousClass1.f35194r0, c01491) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NetworkStateEmitter$events$$inlined$transform$1(Flow flow, Continuation continuation, NetworkStateEmitter networkStateEmitter, long j10) {
        super(2, continuation);
        this.f35189r0 = flow;
        this.f35190s0 = networkStateEmitter;
        this.f35191t0 = j10;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        NetworkStateEmitter$events$$inlined$transform$1 networkStateEmitter$events$$inlined$transform$1 = new NetworkStateEmitter$events$$inlined$transform$1(this.f35189r0, continuation, this.f35190s0, this.f35191t0);
        networkStateEmitter$events$$inlined$transform$1.f35188q0 = obj;
        return networkStateEmitter$events$$inlined$transform$1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Object coroutine_suspended = a.getCOROUTINE_SUSPENDED();
        int i10 = this.f35187p0;
        if (i10 == 0) {
            ResultKt.throwOnFailure(obj);
            AnonymousClass1 anonymousClass1 = new AnonymousClass1((FlowCollector) this.f35188q0, this.f35190s0, this.f35191t0);
            this.f35187p0 = 1;
            if (this.f35189r0.collect(anonymousClass1, this) == coroutine_suspended) {
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

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull FlowCollector<? super ConnectionStatusEvent> flowCollector, @Nullable Continuation<? super Unit> continuation) {
        return ((NetworkStateEmitter$events$$inlined$transform$1) create(flowCollector, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}

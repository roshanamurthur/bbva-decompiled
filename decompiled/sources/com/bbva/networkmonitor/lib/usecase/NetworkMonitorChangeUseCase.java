package com.bbva.networkmonitor.lib.usecase;

import com.bbva.glomoutils.usecase.UseCase;
import com.bbva.networkmonitor.lib.implementation.NetworkChangeProvider;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.channels.ProduceKt;
import kotlinx.coroutines.channels.ProducerScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: NetworkMonitorChangeUseCase.kt */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001B\u000f\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000e\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016¨\u0006\t"}, d2 = {"Lcom/bbva/networkmonitor/lib/usecase/NetworkMonitorChangeUseCase;", "Lcom/bbva/glomoutils/usecase/UseCase;", "Lkotlinx/coroutines/flow/Flow;", "", "execute", "Lcom/bbva/networkmonitor/lib/implementation/NetworkChangeProvider;", "networkProvider", "<init>", "(Lcom/bbva/networkmonitor/lib/implementation/NetworkChangeProvider;)V", "cmp-dp-network_release"}, k = 1, mv = {1, 9, 0})
public final class NetworkMonitorChangeUseCase implements UseCase<Flow<? extends Boolean>> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final NetworkChangeProvider f35215a;

    /* JADX INFO: compiled from: NetworkMonitorChangeUseCase.kt */
    @DebugMetadata(c = "com.bbva.networkmonitor.lib.usecase.NetworkMonitorChangeUseCase$execute$1", f = "NetworkMonitorChangeUseCase.kt", i = {}, l = {21}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements Function2<ProducerScope<? super Boolean>, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public int f35216p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public /* synthetic */ Object f35217q0;

        /* JADX INFO: renamed from: com.bbva.networkmonitor.lib.usecase.NetworkMonitorChangeUseCase$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: NetworkMonitorChangeUseCase.kt */
        public static final class C0150a extends Lambda implements Function0<Unit> {

            /* JADX INFO: renamed from: p0, reason: collision with root package name */
            public final /* synthetic */ NetworkMonitorChangeUseCase f35219p0;

            /* JADX INFO: renamed from: q0, reason: collision with root package name */
            public final /* synthetic */ Function1<Boolean, Unit> f35220q0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0150a(NetworkMonitorChangeUseCase networkMonitorChangeUseCase, b bVar) {
                super(0);
                this.f35219p0 = networkMonitorChangeUseCase;
                this.f35220q0 = bVar;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Unit invoke() {
                this.f35219p0.f35215a.unregisterListener(this.f35220q0);
                return Unit.INSTANCE;
            }
        }

        /* JADX INFO: compiled from: NetworkMonitorChangeUseCase.kt */
        public static final class b extends Lambda implements Function1<Boolean, Unit> {

            /* JADX INFO: renamed from: p0, reason: collision with root package name */
            public final /* synthetic */ ProducerScope<Boolean> f35221p0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public b(ProducerScope<? super Boolean> producerScope) {
                super(1);
                this.f35221p0 = producerScope;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Unit invoke(Boolean bool) {
                this.f35221p0.mo5953trySendJP2dKIU(Boolean.valueOf(bool.booleanValue()));
                return Unit.INSTANCE;
            }
        }

        public a(Continuation<? super a> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            a aVar = NetworkMonitorChangeUseCase.this.new a(continuation);
            aVar.f35217q0 = obj;
            return aVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(ProducerScope<? super Boolean> producerScope, Continuation<? super Unit> continuation) {
            return ((a) create(producerScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
            int i10 = this.f35216p0;
            if (i10 == 0) {
                ResultKt.throwOnFailure(obj);
                ProducerScope producerScope = (ProducerScope) this.f35217q0;
                b bVar = new b(producerScope);
                NetworkMonitorChangeUseCase networkMonitorChangeUseCase = NetworkMonitorChangeUseCase.this;
                networkMonitorChangeUseCase.f35215a.attachNetworkListener(bVar);
                C0150a c0150a = new C0150a(networkMonitorChangeUseCase, bVar);
                this.f35216p0 = 1;
                if (ProduceKt.awaitClose(producerScope, c0150a, this) == coroutine_suspended) {
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

    public NetworkMonitorChangeUseCase(@NotNull NetworkChangeProvider networkProvider) {
        Intrinsics.checkNotNullParameter(networkProvider, "networkProvider");
        this.f35215a = networkProvider;
    }

    @Override // com.bbva.glomoutils.usecase.UseCase
    @NotNull
    public Flow<? extends Boolean> execute() {
        return FlowKt.callbackFlow(new a(null));
    }
}

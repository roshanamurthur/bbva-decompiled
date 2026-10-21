package com.bbva.networkplugin.net;

import com.bbva.androidtoolkit.plugin.postmessage.PostMessenger;
import com.bbva.network.NetworkWorker;
import com.bbva.network.model.ConnectionStatusEvent;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: ConnectionStatusHandler.kt */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0006\u0010\t\u001a\u00020\u0006R\u0014\u0010\r\u001a\u00020\n8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u000b\u0010\f¨\u0006\u0012"}, d2 = {"Lcom/bbva/networkplugin/net/ConnectionStatusHandler;", "Lkotlinx/coroutines/CoroutineScope;", "Lcom/bbva/androidtoolkit/plugin/postmessage/PostMessenger;", "postMessenger", "", "delay", "", "subscribe", "(Lcom/bbva/androidtoolkit/plugin/postmessage/PostMessenger;Ljava/lang/Long;)V", "unsubscribe", "Lkotlin/coroutines/CoroutineContext;", "getCoroutineContext", "()Lkotlin/coroutines/CoroutineContext;", "coroutineContext", "Lcom/bbva/network/NetworkWorker;", "client", "<init>", "(Lcom/bbva/network/NetworkWorker;)V", "network-plugin_release"}, k = 1, mv = {1, 8, 0})
public final class ConnectionStatusHandler implements CoroutineScope {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    @NotNull
    public final NetworkWorker f35257p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ CoroutineScope f35258q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    @Nullable
    public Job f35259r0;

    /* JADX INFO: compiled from: ConnectionStatusHandler.kt */
    @DebugMetadata(c = "com.bbva.networkplugin.net.ConnectionStatusHandler$subscribe$1", f = "ConnectionStatusHandler.kt", i = {}, l = {23}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public int f35260p0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ Long f35262r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final /* synthetic */ PostMessenger f35263s0;

        /* JADX INFO: renamed from: com.bbva.networkplugin.net.ConnectionStatusHandler$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: ConnectionStatusHandler.kt */
        public static final class C0151a<T> implements FlowCollector {

            /* JADX INFO: renamed from: p0, reason: collision with root package name */
            public final /* synthetic */ PostMessenger f35264p0;

            public C0151a(PostMessenger postMessenger) {
                this.f35264p0 = postMessenger;
            }

            @Override // kotlinx.coroutines.flow.FlowCollector
            public final Object emit(Object obj, Continuation continuation) {
                ConnectionStatusHandlerKt.emitConnectionStatus(this.f35264p0, (ConnectionStatusEvent) obj);
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Long l6, PostMessenger postMessenger, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f35262r0 = l6;
            this.f35263s0 = postMessenger;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return ConnectionStatusHandler.this.new a(this.f35262r0, this.f35263s0, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
            int i10 = this.f35260p0;
            if (i10 == 0) {
                ResultKt.throwOnFailure(obj);
                NetworkWorker networkWorker = ConnectionStatusHandler.this.f35257p0;
                Long l6 = this.f35262r0;
                Flow<ConnectionStatusEvent> flowConnectionStatus = networkWorker.connectionStatus(l6 != null ? l6.longValue() : 100L);
                C0151a c0151a = new C0151a(this.f35263s0);
                this.f35260p0 = 1;
                if (flowConnectionStatus.collect(c0151a, this) == coroutine_suspended) {
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

    public ConnectionStatusHandler(@NotNull NetworkWorker client) {
        Intrinsics.checkNotNullParameter(client, "client");
        this.f35257p0 = client;
        this.f35258q0 = CoroutineScopeKt.MainScope();
    }

    @Override // kotlinx.coroutines.CoroutineScope
    @NotNull
    public CoroutineContext getCoroutineContext() {
        return this.f35258q0.getCoroutineContext();
    }

    public final void subscribe(@NotNull PostMessenger postMessenger, @Nullable Long delay) {
        Intrinsics.checkNotNullParameter(postMessenger, "postMessenger");
        this.f35259r0 = BuildersKt__Builders_commonKt.launch$default(this, null, null, new a(delay, postMessenger, null), 3, null);
    }

    public final void unsubscribe() {
        Job job = this.f35259r0;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
        }
    }
}

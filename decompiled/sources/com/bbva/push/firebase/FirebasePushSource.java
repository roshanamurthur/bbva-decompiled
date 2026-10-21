package com.bbva.push.firebase;

import com.bbva.push.model.Push;
import com.bbva.push.source.PushSource;
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
import kotlinx.coroutines.channels.Channel;
import kotlinx.coroutines.channels.ChannelKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: FirebasePushSource.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J\u0010\u0010\t\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016R\u0014\u0010\r\u001a\u00020\n8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u000e8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u001a\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00070\u000e8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0010¨\u0006\u0014"}, d2 = {"Lcom/bbva/push/firebase/FirebasePushSource;", "Lcom/bbva/push/source/PushSource;", "Lkotlinx/coroutines/CoroutineScope;", "", "token", "", "tokens", "Lcom/bbva/push/model/Push;", "push", "pushes", "Lkotlin/coroutines/CoroutineContext;", "getCoroutineContext", "()Lkotlin/coroutines/CoroutineContext;", "coroutineContext", "Lkotlinx/coroutines/flow/Flow;", "getTokens", "()Lkotlinx/coroutines/flow/Flow;", "getPushes", "<init>", "()V", "firebase-push_release"}, k = 1, mv = {1, 8, 0})
public final class FirebasePushSource implements PushSource, CoroutineScope {

    @NotNull
    public static final FirebasePushSource INSTANCE = new FirebasePushSource();

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    @NotNull
    public static final Channel<String> f36214q0 = ChannelKt.Channel$default(0, null, null, 7, null);

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    @NotNull
    public static final Channel<Push> f36215r0 = ChannelKt.Channel$default(0, null, null, 7, null);

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ CoroutineScope f36216p0 = CoroutineScopeKt.MainScope();

    /* JADX INFO: compiled from: FirebasePushSource.kt */
    @DebugMetadata(c = "com.bbva.push.firebase.FirebasePushSource$pushes$1", f = "FirebasePushSource.kt", i = {}, l = {36}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public int f36217p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ Push f36218q0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Push push, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f36218q0 = push;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new a(this.f36218q0, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
            int i10 = this.f36217p0;
            if (i10 == 0) {
                ResultKt.throwOnFailure(obj);
                Channel channel = FirebasePushSource.f36215r0;
                this.f36217p0 = 1;
                if (channel.send(this.f36218q0, this) == coroutine_suspended) {
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

    /* JADX INFO: compiled from: FirebasePushSource.kt */
    @DebugMetadata(c = "com.bbva.push.firebase.FirebasePushSource$tokens$1", f = "FirebasePushSource.kt", i = {}, l = {30}, m = "invokeSuspend", n = {}, s = {})
    public static final class b extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public int f36219p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ String f36220q0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String str, Continuation<? super b> continuation) {
            super(2, continuation);
            this.f36220q0 = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new b(this.f36220q0, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((b) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
            int i10 = this.f36219p0;
            if (i10 == 0) {
                ResultKt.throwOnFailure(obj);
                Channel channel = FirebasePushSource.f36214q0;
                this.f36219p0 = 1;
                if (channel.send(this.f36220q0, this) == coroutine_suspended) {
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

    @Override // kotlinx.coroutines.CoroutineScope
    @NotNull
    public CoroutineContext getCoroutineContext() {
        return this.f36216p0.getCoroutineContext();
    }

    @Override // com.bbva.push.source.PushSource
    @NotNull
    public Flow<Push> getPushes() {
        return FlowKt.consumeAsFlow(f36215r0);
    }

    @Override // com.bbva.push.source.PushSource
    @NotNull
    public Flow<String> getTokens() {
        return FlowKt.consumeAsFlow(f36214q0);
    }

    @Override // com.bbva.push.source.PushSource
    public void pushes(@NotNull Push push) {
        Intrinsics.checkNotNullParameter(push, "push");
        BuildersKt__Builders_commonKt.launch$default(this, null, null, new a(push, null), 3, null);
    }

    @Override // com.bbva.push.source.PushSource
    public void tokens(@NotNull String token) {
        Intrinsics.checkNotNullParameter(token, "token");
        BuildersKt__Builders_commonKt.launch$default(this, null, null, new b(token, null), 3, null);
    }
}

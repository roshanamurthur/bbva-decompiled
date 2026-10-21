package com.bbva.ethermobilesdk.token.plugin.command;

import com.bbva.androidtoolkit.plugin.command.callback.CommandCallback;
import com.bbva.androidtoolkit.plugin.response.SimpleResponse;
import com.bbva.ethermobilesdk.token.EtherToken;
import com.bbva.ethermobilesdk.token.model.EtherTokenResult;
import com.bbva.ethermobilesdk.token.model.TokenActivation;
import com.bbva.ethermobilesdk.token.plugin.model.PluginEtherTokenErrorKt;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: ActivateTokenCommand.kt */
/* JADX INFO: loaded from: classes5.dex */
@DebugMetadata(c = "com.bbva.ethermobilesdk.token.plugin.command.ActivateTokenCommand$execute$1$1", f = "ActivateTokenCommand.kt", i = {}, l = {41}, m = "invokeSuspend", n = {}, s = {})
public final class a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public int f30154p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ EtherToken f30155q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final /* synthetic */ TokenActivation f30156r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final /* synthetic */ CommandCallback f30157s0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(EtherToken etherToken, TokenActivation tokenActivation, CommandCallback commandCallback, Continuation<? super a> continuation) {
        super(2, continuation);
        this.f30155q0 = etherToken;
        this.f30156r0 = tokenActivation;
        this.f30157s0 = commandCallback;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new a(this.f30155q0, this.f30156r0, this.f30157s0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
        int i10 = this.f30154p0;
        if (i10 == 0) {
            ResultKt.throwOnFailure(obj);
            this.f30154p0 = 1;
            obj = this.f30155q0.activateToken(this.f30156r0, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        EtherTokenResult etherTokenResult = (EtherTokenResult) obj;
        boolean z10 = etherTokenResult instanceof EtherTokenResult.Success;
        CommandCallback commandCallback = this.f30157s0;
        if (z10) {
            commandCallback.sendEvent(SimpleResponse.toJson(ActivateTokenCommand.TOKEN_ID, ((EtherTokenResult.Success) etherTokenResult).getValue()));
        } else if (etherTokenResult instanceof EtherTokenResult.Error) {
            commandCallback.sendError(PluginEtherTokenErrorKt.toMessageError(((EtherTokenResult.Error) etherTokenResult).getValue()));
        }
        return Unit.INSTANCE;
    }
}

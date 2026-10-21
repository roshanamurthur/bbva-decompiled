package com.bbva.ethermobilesdk.token.plugin.command;

import com.bbva.androidtoolkit.plugin.command.callback.CommandCallback;
import com.bbva.androidtoolkit.plugin.response.Errors;
import com.bbva.ethermobilesdk.token.EtherToken;
import com.bbva.ethermobilesdk.token.model.EtherTokenResult;
import com.bbva.ethermobilesdk.token.plugin.model.PluginEtherTokenErrorKt;
import com.bbva.ethermobilesdk.token.plugin.param.DeleteTokenParam;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: RemoveTokenCommand.kt */
/* JADX INFO: loaded from: classes5.dex */
@DebugMetadata(c = "com.bbva.ethermobilesdk.token.plugin.command.RemoveTokenCommand$execute$1$1", f = "RemoveTokenCommand.kt", i = {}, l = {30}, m = "invokeSuspend", n = {}, s = {})
public final class f extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public int f30175p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ EtherToken f30176q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final /* synthetic */ DeleteTokenParam f30177r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final /* synthetic */ CommandCallback f30178s0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(EtherToken etherToken, DeleteTokenParam deleteTokenParam, CommandCallback commandCallback, Continuation<? super f> continuation) {
        super(2, continuation);
        this.f30176q0 = etherToken;
        this.f30177r0 = deleteTokenParam;
        this.f30178s0 = commandCallback;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new f(this.f30176q0, this.f30177r0, this.f30178s0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((f) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
        int i10 = this.f30175p0;
        CommandCallback commandCallback = this.f30178s0;
        try {
            if (i10 == 0) {
                ResultKt.throwOnFailure(obj);
                EtherToken etherToken = this.f30176q0;
                String tokenId = this.f30177r0.getTokenId();
                Intrinsics.checkNotNull(tokenId);
                this.f30175p0 = 1;
                obj = etherToken.deleteToken(tokenId, this);
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
            if (etherTokenResult instanceof EtherTokenResult.Success) {
                commandCallback.sendEvent();
            } else if (etherTokenResult instanceof EtherTokenResult.Error) {
                commandCallback.sendError(PluginEtherTokenErrorKt.toMessageError(((EtherTokenResult.Error) etherTokenResult).getValue()));
            }
        } catch (Exception unused) {
            commandCallback.sendError(Errors.ErrorDefault);
        }
        return Unit.INSTANCE;
    }
}

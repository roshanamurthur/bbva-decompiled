package com.bbva.ethermobilesdk.token.plugin.command;

import com.bbva.androidtoolkit.plugin.command.callback.CommandCallback;
import com.bbva.androidtoolkit.plugin.response.Errors;
import com.bbva.ethermobilesdk.token.EtherToken;
import com.bbva.ethermobilesdk.token.model.EtherTokenResult;
import com.bbva.ethermobilesdk.token.plugin.model.PluginEtherTokenErrorKt;
import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: GetActivatedTokensDetailCommand.kt */
/* JADX INFO: loaded from: classes5.dex */
@DebugMetadata(c = "com.bbva.ethermobilesdk.token.plugin.command.GetActivatedTokensDetailCommand$execute$1$1", f = "GetActivatedTokensDetailCommand.kt", i = {}, l = {32}, m = "invokeSuspend", n = {}, s = {})
public final class d extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public int f30168p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ EtherToken f30169q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final /* synthetic */ CommandCallback f30170r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final /* synthetic */ GetActivatedTokensDetailCommand f30171s0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(EtherToken etherToken, CommandCallback commandCallback, GetActivatedTokensDetailCommand getActivatedTokensDetailCommand, Continuation<? super d> continuation) {
        super(2, continuation);
        this.f30169q0 = etherToken;
        this.f30170r0 = commandCallback;
        this.f30171s0 = getActivatedTokensDetailCommand;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new d(this.f30169q0, this.f30170r0, this.f30171s0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((d) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
        int i10 = this.f30168p0;
        CommandCallback commandCallback = this.f30170r0;
        try {
            if (i10 == 0) {
                ResultKt.throwOnFailure(obj);
                EtherToken etherToken = this.f30169q0;
                this.f30168p0 = 1;
                obj = etherToken.getActivatedTokensDetail(this);
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
                commandCallback.sendEvent(GetActivatedTokensDetailCommand.access$toArray(this.f30171s0, (List) ((EtherTokenResult.Success) etherTokenResult).getValue()));
            } else if (etherTokenResult instanceof EtherTokenResult.Error) {
                commandCallback.sendError(PluginEtherTokenErrorKt.toMessageError(((EtherTokenResult.Error) etherTokenResult).getValue()));
            }
        } catch (Exception unused) {
            commandCallback.sendError(Errors.ErrorDefault);
        }
        return Unit.INSTANCE;
    }
}

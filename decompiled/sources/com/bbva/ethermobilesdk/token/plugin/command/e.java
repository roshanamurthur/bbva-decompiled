package com.bbva.ethermobilesdk.token.plugin.command;

import com.bbva.androidtoolkit.plugin.command.callback.CommandCallback;
import com.bbva.androidtoolkit.plugin.response.Errors;
import com.bbva.ethermobilesdk.token.EtherToken;
import com.bbva.ethermobilesdk.token.model.EtherTokenResult;
import com.bbva.ethermobilesdk.token.plugin.model.PluginEtherTokenErrorKt;
import java.util.Collection;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;

/* JADX INFO: compiled from: GetTokenIdsCommand.kt */
/* JADX INFO: loaded from: classes5.dex */
@DebugMetadata(c = "com.bbva.ethermobilesdk.token.plugin.command.GetTokenIdsCommand$execute$1$1", f = "GetTokenIdsCommand.kt", i = {}, l = {27}, m = "invokeSuspend", n = {}, s = {})
public final class e extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public int f30172p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ EtherToken f30173q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final /* synthetic */ CommandCallback f30174r0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(EtherToken etherToken, CommandCallback commandCallback, Continuation<? super e> continuation) {
        super(2, continuation);
        this.f30173q0 = etherToken;
        this.f30174r0 = commandCallback;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new e(this.f30173q0, this.f30174r0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((e) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
        int i10 = this.f30172p0;
        CommandCallback commandCallback = this.f30174r0;
        try {
            if (i10 == 0) {
                ResultKt.throwOnFailure(obj);
                EtherToken etherToken = this.f30173q0;
                this.f30172p0 = 1;
                obj = etherToken.getTokenIds(this);
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
                commandCallback.sendEvent(new JSONArray((Collection) ((EtherTokenResult.Success) etherTokenResult).getValue()));
            } else if (etherTokenResult instanceof EtherTokenResult.Error) {
                commandCallback.sendError(PluginEtherTokenErrorKt.toMessageError(((EtherTokenResult.Error) etherTokenResult).getValue()));
            }
        } catch (Exception unused) {
            commandCallback.sendError(Errors.ErrorDefault);
        }
        return Unit.INSTANCE;
    }
}

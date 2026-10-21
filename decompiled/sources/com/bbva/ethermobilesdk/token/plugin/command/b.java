package com.bbva.ethermobilesdk.token.plugin.command;

import com.bbva.androidtoolkit.plugin.command.callback.CommandCallback;
import com.bbva.androidtoolkit.plugin.response.Errors;
import com.bbva.ethermobilesdk.token.EtherToken;
import com.bbva.ethermobilesdk.token.model.EtherTokenResult;
import com.bbva.ethermobilesdk.token.model.TokenActivationForm;
import com.bbva.ethermobilesdk.token.plugin.model.PluginEtherTokenErrorKt;
import com.bbva.ethermobilesdk.token.plugin.param.GenerateActivationFormParam;
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
import org.json.JSONObject;

/* JADX INFO: compiled from: GenerateActivationFormCommand.kt */
/* JADX INFO: loaded from: classes5.dex */
@DebugMetadata(c = "com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand$execute$1$1", f = "GenerateActivationFormCommand.kt", i = {}, l = {36}, m = "invokeSuspend", n = {}, s = {})
public final class b extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public int f30158p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ EtherToken f30159q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final /* synthetic */ GenerateActivationFormParam f30160r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final /* synthetic */ CommandCallback f30161s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public final /* synthetic */ GenerateActivationFormCommand f30162t0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(EtherToken etherToken, GenerateActivationFormParam generateActivationFormParam, CommandCallback commandCallback, GenerateActivationFormCommand generateActivationFormCommand, Continuation<? super b> continuation) {
        super(2, continuation);
        this.f30159q0 = etherToken;
        this.f30160r0 = generateActivationFormParam;
        this.f30161s0 = commandCallback;
        this.f30162t0 = generateActivationFormCommand;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new b(this.f30159q0, this.f30160r0, this.f30161s0, this.f30162t0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((b) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        GenerateActivationFormParam generateActivationFormParam = this.f30160r0;
        Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
        int i10 = this.f30158p0;
        CommandCallback commandCallback = this.f30161s0;
        try {
            if (i10 == 0) {
                ResultKt.throwOnFailure(obj);
                EtherToken etherToken = this.f30159q0;
                String authCode = generateActivationFormParam.getAuthCode();
                Intrinsics.checkNotNull(authCode);
                String tokenId = generateActivationFormParam.getTokenId();
                Intrinsics.checkNotNull(tokenId);
                String deviceId = generateActivationFormParam.getDeviceId();
                Intrinsics.checkNotNull(deviceId);
                String protocolVersion = generateActivationFormParam.getProtocolVersion();
                Intrinsics.checkNotNull(protocolVersion);
                this.f30158p0 = 1;
                obj = etherToken.generateActivationForm(authCode, tokenId, deviceId, protocolVersion, this);
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
                commandCallback.sendEvent(new JSONObject(GenerateActivationFormCommand.access$toMap(this.f30162t0, (TokenActivationForm) ((EtherTokenResult.Success) etherTokenResult).getValue())));
            } else if (etherTokenResult instanceof EtherTokenResult.Error) {
                commandCallback.sendError(PluginEtherTokenErrorKt.toMessageError(((EtherTokenResult.Error) etherTokenResult).getValue()));
            }
        } catch (Exception unused) {
            commandCallback.sendError(Errors.ErrorDefault);
        }
        return Unit.INSTANCE;
    }
}

package com.bbva.ethermobilesdk.token.plugin.command;

import com.bbva.androidtoolkit.plugin.command.callback.CommandCallback;
import com.bbva.androidtoolkit.plugin.response.Errors;
import com.bbva.ethermobilesdk.token.EtherToken;
import com.bbva.ethermobilesdk.token.model.EtherTokenResult;
import com.bbva.ethermobilesdk.token.model.OTP;
import com.bbva.ethermobilesdk.token.plugin.model.PluginEtherTokenErrorKt;
import com.bbva.ethermobilesdk.token.plugin.param.GenerateOtpParam;
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

/* JADX INFO: compiled from: GenerateOtpCommand.kt */
/* JADX INFO: loaded from: classes5.dex */
@DebugMetadata(c = "com.bbva.ethermobilesdk.token.plugin.command.GenerateOtpCommand$execute$1$1", f = "GenerateOtpCommand.kt", i = {}, l = {38}, m = "invokeSuspend", n = {}, s = {})
public final class c extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public int f30163p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ EtherToken f30164q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final /* synthetic */ GenerateOtpParam f30165r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final /* synthetic */ CommandCallback f30166s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public final /* synthetic */ GenerateOtpCommand f30167t0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(EtherToken etherToken, GenerateOtpParam generateOtpParam, CommandCallback commandCallback, GenerateOtpCommand generateOtpCommand, Continuation<? super c> continuation) {
        super(2, continuation);
        this.f30164q0 = etherToken;
        this.f30165r0 = generateOtpParam;
        this.f30166s0 = commandCallback;
        this.f30167t0 = generateOtpCommand;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new c(this.f30164q0, this.f30165r0, this.f30166s0, this.f30167t0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((c) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
        int i10 = this.f30163p0;
        CommandCallback commandCallback = this.f30166s0;
        GenerateOtpParam generateOtpParam = this.f30165r0;
        try {
            if (i10 == 0) {
                ResultKt.throwOnFailure(obj);
                EtherToken etherToken = this.f30164q0;
                String tokenId = generateOtpParam.getTokenId();
                Intrinsics.checkNotNull(tokenId);
                String challenge = generateOtpParam.getChallenge();
                boolean nextWindow = generateOtpParam.getNextWindow();
                this.f30163p0 = 1;
                obj = etherToken.generateOtp(tokenId, challenge, nextWindow, this);
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
                commandCallback.sendEvent(new JSONObject(GenerateOtpCommand.access$toMap(this.f30167t0, generateOtpParam.getAction(), (OTP) ((EtherTokenResult.Success) etherTokenResult).getValue())));
            } else if (etherTokenResult instanceof EtherTokenResult.Error) {
                commandCallback.sendError(PluginEtherTokenErrorKt.toMessageError(((EtherTokenResult.Error) etherTokenResult).getValue()));
            }
        } catch (Exception unused) {
            commandCallback.sendError(Errors.ErrorDefault);
        }
        return Unit.INSTANCE;
    }
}

package com.bbva.ethermobilesdk.token.plugin.command;

import com.bbva.androidtoolkit.plugin.command.callback.CommandCallback;
import com.bbva.androidtoolkit.plugin.response.Errors;
import com.bbva.ethermobilesdk.token.EtherToken;
import com.bbva.ethermobilesdk.token.model.EtherTokenResult;
import com.bbva.ethermobilesdk.token.plugin.model.PluginEtherTokenErrorKt;
import com.bbva.ethermobilesdk.token.plugin.param.DefaultOcraSuiteParam;
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

/* JADX INFO: compiled from: SetDefaultOcraSuiteCommand.kt */
/* JADX INFO: loaded from: classes5.dex */
@DebugMetadata(c = "com.bbva.ethermobilesdk.token.plugin.command.SetDefaultOcraSuiteCommand$execute$1$1", f = "SetDefaultOcraSuiteCommand.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class g extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ EtherToken f30179p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ DefaultOcraSuiteParam f30180q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final /* synthetic */ CommandCallback f30181r0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(EtherToken etherToken, DefaultOcraSuiteParam defaultOcraSuiteParam, CommandCallback commandCallback, Continuation<? super g> continuation) {
        super(2, continuation);
        this.f30179p0 = etherToken;
        this.f30180q0 = defaultOcraSuiteParam;
        this.f30181r0 = commandCallback;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new g(this.f30179p0, this.f30180q0, this.f30181r0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((g) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        CommandCallback commandCallback = this.f30181r0;
        ek.a.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        try {
            EtherToken etherToken = this.f30179p0;
            String ocraSuite = this.f30180q0.getOcraSuite();
            Intrinsics.checkNotNull(ocraSuite);
            EtherTokenResult<Unit> defaultOcraSuite = etherToken.setDefaultOcraSuite(ocraSuite);
            if (defaultOcraSuite instanceof EtherTokenResult.Success) {
                commandCallback.sendEvent();
            } else if (defaultOcraSuite instanceof EtherTokenResult.Error) {
                commandCallback.sendError(PluginEtherTokenErrorKt.toMessageError(((EtherTokenResult.Error) defaultOcraSuite).getValue()));
            }
        } catch (Exception unused) {
            commandCallback.sendError(Errors.ErrorDefault);
        }
        return Unit.INSTANCE;
    }
}

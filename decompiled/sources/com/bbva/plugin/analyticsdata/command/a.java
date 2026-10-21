package com.bbva.plugin.analyticsdata.command;

import com.bbva.androidtoolkit.plugin.command.callback.CommandCallback;
import com.bbva.plugin.analyticsdata.command.response.AdobeErrorKt;
import com.bbva.plugin.analyticsdata.controller.Analytics;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: GetMarketingCloudIdCommand.kt */
/* JADX INFO: loaded from: classes5.dex */
@DebugMetadata(c = "com.bbva.plugin.analyticsdata.command.GetMarketingCloudIdCommand$execute$1$1", f = "GetMarketingCloudIdCommand.kt", i = {}, l = {24}, m = "invokeSuspend", n = {}, s = {})
public final class a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public int f35577p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public /* synthetic */ Object f35578q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final /* synthetic */ Analytics f35579r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final /* synthetic */ CommandCallback f35580s0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(Analytics analytics, CommandCallback commandCallback, Continuation<? super a> continuation) {
        super(2, continuation);
        this.f35579r0 = analytics;
        this.f35580s0 = commandCallback;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        a aVar = new a(this.f35579r0, this.f35580s0, continuation);
        aVar.f35578q0 = obj;
        return aVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Object objM5535constructorimpl;
        Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
        int i10 = this.f35577p0;
        try {
            if (i10 == 0) {
                ResultKt.throwOnFailure(obj);
                Analytics analytics = this.f35579r0;
                Result.Companion companion = Result.INSTANCE;
                this.f35577p0 = 1;
                obj = analytics.id(this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            objM5535constructorimpl = Result.m5535constructorimpl((String) obj);
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            objM5535constructorimpl = Result.m5535constructorimpl(ResultKt.createFailure(th2));
        }
        boolean zM5541isSuccessimpl = Result.m5541isSuccessimpl(objM5535constructorimpl);
        CommandCallback commandCallback = this.f35580s0;
        if (zM5541isSuccessimpl) {
            String str = (String) objM5535constructorimpl;
            if (str == null) {
                str = "";
            }
            commandCallback.sendEvent(str);
        }
        Throwable thM5538exceptionOrNullimpl = Result.m5538exceptionOrNullimpl(objM5535constructorimpl);
        if (thM5538exceptionOrNullimpl != null) {
            commandCallback.sendError(AdobeErrorKt.toErrorMessage(thM5538exceptionOrNullimpl));
        }
        return Unit.INSTANCE;
    }
}

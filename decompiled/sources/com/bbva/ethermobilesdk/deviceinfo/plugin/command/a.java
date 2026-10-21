package com.bbva.ethermobilesdk.deviceinfo.plugin.command;

import com.bbva.androidtoolkit.plugin.command.callback.CommandCallback;
import com.bbva.androidtoolkit.plugin.response.Errors;
import com.bbva.ethermobilesdk.deviceinfo.DeviceInfo;
import com.bbva.ethermobilesdk.deviceinfo.component.Time;
import com.bbva.ethermobilesdk.deviceinfo.plugin.command.params.GetTrueTimeParams;
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

/* JADX INFO: compiled from: GetTrueTimeCommand.kt */
/* JADX INFO: loaded from: classes5.dex */
@DebugMetadata(c = "com.bbva.ethermobilesdk.deviceinfo.plugin.command.GetTrueTimeCommand$execute$1$1", f = "GetTrueTimeCommand.kt", i = {}, l = {28}, m = "invokeSuspend", n = {}, s = {})
public final class a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public int f29597p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ DeviceInfo f29598q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final /* synthetic */ GetTrueTimeParams f29599r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final /* synthetic */ CommandCallback f29600s0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(DeviceInfo deviceInfo, GetTrueTimeParams getTrueTimeParams, CommandCallback commandCallback, Continuation<? super a> continuation) {
        super(2, continuation);
        this.f29598q0 = deviceInfo;
        this.f29599r0 = getTrueTimeParams;
        this.f29600s0 = commandCallback;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new a(this.f29598q0, this.f29599r0, this.f29600s0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Unit unit;
        Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
        int i10 = this.f29597p0;
        if (i10 == 0) {
            ResultKt.throwOnFailure(obj);
            Time time = this.f29598q0.getTime();
            GetTrueTimeParams getTrueTimeParams = this.f29599r0;
            Intrinsics.checkNotNull(getTrueTimeParams);
            String host = getTrueTimeParams.getHost();
            Intrinsics.checkNotNull(host);
            Integer timeout = getTrueTimeParams.getTimeout();
            Intrinsics.checkNotNull(timeout);
            int iIntValue = timeout.intValue();
            this.f29597p0 = 1;
            obj = time.getTrueTime(host, iIntValue, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        String str = (String) obj;
        CommandCallback commandCallback = this.f29600s0;
        if (str != null) {
            commandCallback.sendEvent(str);
            unit = Unit.INSTANCE;
        } else {
            unit = null;
        }
        if (unit == null) {
            commandCallback.sendError(Errors.ErrorDefault);
        }
        return Unit.INSTANCE;
    }
}

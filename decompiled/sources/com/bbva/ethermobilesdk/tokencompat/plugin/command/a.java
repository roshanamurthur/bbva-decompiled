package com.bbva.ethermobilesdk.tokencompat.plugin.command;

import com.bbva.androidtoolkit.plugin.command.callback.CommandCallback;
import com.bbva.ethermobilesdk.tokencompat.TokenCompat;
import com.bbva.ethermobilesdk.tokencompat.model.legacy.STToken;
import com.bbva.ethermobilesdk.tokencompat.plugin.param.RegisterTokenParam;
import com.bbva.ethermobilesdk.tokencompat.plugin.util.ResponseMapperKt;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.MainCoroutineDispatcher;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* JADX INFO: compiled from: RegisterTokenCommand.kt */
/* JADX INFO: loaded from: classes5.dex */
@DebugMetadata(c = "com.bbva.ethermobilesdk.tokencompat.plugin.command.RegisterTokenCommand$execute$1$1", f = "RegisterTokenCommand.kt", i = {}, l = {31}, m = "invokeSuspend", n = {}, s = {})
public final class a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public int f30638p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ RegisterTokenParam f30639q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final /* synthetic */ TokenCompat f30640r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final /* synthetic */ CommandCallback f30641s0;

    /* JADX INFO: renamed from: com.bbva.ethermobilesdk.tokencompat.plugin.command.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: RegisterTokenCommand.kt */
    @DebugMetadata(c = "com.bbva.ethermobilesdk.tokencompat.plugin.command.RegisterTokenCommand$execute$1$1$1", f = "RegisterTokenCommand.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class C0129a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ CommandCallback f30642p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ STToken f30643q0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0129a(CommandCallback commandCallback, STToken sTToken, Continuation<? super C0129a> continuation) {
            super(2, continuation);
            this.f30642p0 = commandCallback;
            this.f30643q0 = sTToken;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new C0129a(this.f30642p0, this.f30643q0, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C0129a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            ek.a.getCOROUTINE_SUSPENDED();
            ResultKt.throwOnFailure(obj);
            this.f30642p0.sendEvent(new JSONObject(ResponseMapperKt.toMap(this.f30643q0)));
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(RegisterTokenParam registerTokenParam, TokenCompat tokenCompat, CommandCallback commandCallback, Continuation<? super a> continuation) {
        super(2, continuation);
        this.f30639q0 = registerTokenParam;
        this.f30640r0 = tokenCompat;
        this.f30641s0 = commandCallback;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new a(this.f30639q0, this.f30640r0, this.f30641s0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
        int i10 = this.f30638p0;
        if (i10 == 0) {
            ResultKt.throwOnFailure(obj);
            TokenCompat tokenCompat = this.f30640r0;
            RegisterTokenParam registerTokenParam = this.f30639q0;
            String authCode = registerTokenParam.getAuthCode();
            Intrinsics.checkNotNull(authCode);
            String pin = registerTokenParam.getPin();
            String deviceId = registerTokenParam.getDeviceId();
            Intrinsics.checkNotNull(deviceId);
            String serial = registerTokenParam.getSerial();
            Intrinsics.checkNotNull(serial);
            STToken sTTokenRegisterToken = tokenCompat.registerToken(authCode, pin, deviceId, serial, registerTokenParam.getHeaders());
            MainCoroutineDispatcher main = Dispatchers.getMain();
            C0129a c0129a = new C0129a(this.f30641s0, sTTokenRegisterToken, null);
            this.f30638p0 = 1;
            if (BuildersKt.withContext(main, c0129a, this) == coroutine_suspended) {
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

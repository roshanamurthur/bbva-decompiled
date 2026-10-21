package com.bbva.ethermobilesdk.plugin.devicemanager.command;

import android.app.Application;
import com.bbva.androidtoolkit.plugin.command.AbstractCommand;
import com.bbva.androidtoolkit.plugin.command.callback.CommandCallback;
import com.bbva.ethermobile.help.kit.result.Result;
import com.bbva.ethermobilesdk.devicemanager.DeviceManagerApi;
import com.bbva.ethermobilesdk.devicemanager.model.input.DeviceIdRequest;
import com.bbva.ethermobilesdk.devicemanager.model.output.DeviceIdResponse;
import com.bbva.ethermobilesdk.plugin.devicemanager.di.InjectorKt;
import com.bbva.ethermobilesdk.plugin.devicemanager.error.DeviceManagerErrors;
import com.bbva.ethermobilesdk.plugin.devicemanager.params.DeviceIdParam;
import com.bbva.ethermobilesdk.plugin.devicemanager.util.ParamsValidator;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import org.jetbrains.annotations.NotNull;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: DeviceIdCommand.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u0000 \u000f2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0001\u000fB\u0007¢\u0006\u0004\b\r\u0010\u000eJ\u0018\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0014R\u0014\u0010\f\u001a\u00020\t8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\n\u0010\u000b¨\u0006\u0010"}, d2 = {"Lcom/bbva/ethermobilesdk/plugin/devicemanager/command/DeviceIdCommand;", "Lcom/bbva/androidtoolkit/plugin/command/AbstractCommand;", "Lcom/bbva/ethermobilesdk/plugin/devicemanager/params/DeviceIdParam;", "Lkotlinx/coroutines/CoroutineScope;", "params", "Lcom/bbva/androidtoolkit/plugin/command/callback/CommandCallback;", "callback", "", "execute", "Lkotlin/coroutines/CoroutineContext;", "getCoroutineContext", "()Lkotlin/coroutines/CoroutineContext;", "coroutineContext", "<init>", "()V", "Companion", "devicemanager-plugin_release"}, k = 1, mv = {2, 0, 0})
public final class DeviceIdCommand extends AbstractCommand<DeviceIdParam> implements CoroutineScope {

    @NotNull
    public static final String ID = "deviceid";

    @NotNull
    public static final String OUTPUT_DEVICE_ID = "deviceId";

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ CoroutineScope f29928p0;

    /* JADX INFO: compiled from: DeviceIdCommand.kt */
    @DebugMetadata(c = "com.bbva.ethermobilesdk.plugin.devicemanager.command.DeviceIdCommand$execute$1", f = "DeviceIdCommand.kt", i = {}, l = {24}, m = "invokeSuspend", n = {}, s = {})
    @SourceDebugExtension({"SMAP\nDeviceIdCommand.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DeviceIdCommand.kt\ncom/bbva/ethermobilesdk/plugin/devicemanager/command/DeviceIdCommand$execute$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,46:1\n1#2:47\n*E\n"})
    public static final class a extends SuspendLambda implements Function2<DeviceManagerApi, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public int f29929p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public /* synthetic */ Object f29930q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ DeviceIdParam f29931r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final /* synthetic */ CommandCallback f29932s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public final /* synthetic */ DeviceIdCommand f29933t0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(DeviceIdParam deviceIdParam, CommandCallback commandCallback, DeviceIdCommand deviceIdCommand, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f29931r0 = deviceIdParam;
            this.f29932s0 = commandCallback;
            this.f29933t0 = deviceIdCommand;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            a aVar = new a(this.f29931r0, this.f29932s0, this.f29933t0, continuation);
            aVar.f29930q0 = obj;
            return aVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(DeviceManagerApi deviceManagerApi, Continuation<? super Unit> continuation) {
            return ((a) create(deviceManagerApi, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
            int i10 = this.f29929p0;
            if (i10 == 0) {
                ResultKt.throwOnFailure(obj);
                DeviceManagerApi deviceManagerApi = (DeviceManagerApi) this.f29930q0;
                String userId = this.f29931r0.getUserId();
                Intrinsics.checkNotNull(userId);
                DeviceIdRequest deviceIdRequest = new DeviceIdRequest(userId);
                this.f29929p0 = 1;
                obj = deviceManagerApi.deviceIdResponse(deviceIdRequest, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            DeviceIdResponse deviceIdResponse = (DeviceIdResponse) com.bbva.ethermobile.help.kit.result.ResultKt.getOrNull((Result) obj);
            CommandCallback commandCallback = this.f29932s0;
            if (deviceIdResponse != null) {
                String str = (String) com.bbva.ethermobile.help.kit.result.ResultKt.getOrNull(deviceIdResponse.getId());
                if (str != null) {
                    commandCallback.sendEvent(DeviceIdCommand.access$toJsonObject(this.f29933t0, str));
                } else {
                    commandCallback.sendError(DeviceManagerErrors.ErrorRetrievingLocalResponseDeviceId);
                }
            } else {
                commandCallback.sendError(DeviceManagerErrors.ErrorRetrievingGlobalResponseDeviceId);
            }
            return Unit.INSTANCE;
        }
    }

    public DeviceIdCommand() {
        super(DeviceIdParam.class, new ParamsValidator());
        this.f29928p0 = CoroutineScopeKt.MainScope();
    }

    public static final JSONObject access$toJsonObject(DeviceIdCommand deviceIdCommand, String str) throws JSONException {
        deviceIdCommand.getClass();
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("deviceId", str);
        return jSONObject;
    }

    @Override // kotlinx.coroutines.CoroutineScope
    @NotNull
    public CoroutineContext getCoroutineContext() {
        return this.f29928p0.getCoroutineContext();
    }

    @Override // com.bbva.androidtoolkit.plugin.command.AbstractCommand
    public void execute(@NotNull DeviceIdParam params, @NotNull CommandCallback callback) {
        Intrinsics.checkNotNullParameter(params, "params");
        Intrinsics.checkNotNullParameter(callback, "callback");
        Application mApplication = this.mApplication;
        Intrinsics.checkNotNullExpressionValue(mApplication, "mApplication");
        InjectorKt.launch(this, callback, mApplication, new a(params, callback, this, null));
    }
}

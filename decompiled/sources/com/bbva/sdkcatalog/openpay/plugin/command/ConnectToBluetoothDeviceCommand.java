package com.bbva.sdkcatalog.openpay.plugin.command;

import android.app.Activity;
import com.bbva.androidtoolkit.plugin.command.AbstractCommand;
import com.bbva.androidtoolkit.plugin.command.callback.CommandCallback;
import com.bbva.androidtoolkit.plugin.component.ActivityContainer;
import com.bbva.sdkcatalog.openpay.plugin.CommandExtensionsKt;
import com.bbva.sdkcatalog.openpay.plugin.OpenPayManager;
import com.bbva.sdkcatalog.openpay.plugin.data.error.OpenPayError;
import com.bbva.sdkcatalog.openpay.plugin.data.model.DeviceDTOModel;
import com.bbva.sdkcatalog.openpay.plugin.data.param.ConnectToBluetoothDeviceParams;
import com.bbva.sdkcatalog.openpay.plugin.data.response.ConnectedResponse;
import com.google.gson.Gson;
import com.google.gson.JsonElement;
import ib.s;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import mx.openpay.library.core.OpenPaySdk;
import mx.openpay.library.core.model.extra.SecureTerminal;
import org.jetbrains.annotations.NotNull;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: ConnectToBluetoothDeviceCommand.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\tH\u0014J\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0002J \u0010\u000e\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\u000bH\u0002¨\u0006\u0012"}, d2 = {"Lcom/bbva/sdkcatalog/openpay/plugin/command/ConnectToBluetoothDeviceCommand;", "Lcom/bbva/androidtoolkit/plugin/command/AbstractCommand;", "Lcom/google/gson/JsonElement;", "<init>", "()V", "execute", "", "jsonElement", "callback", "Lcom/bbva/androidtoolkit/plugin/command/callback/CommandCallback;", "parseJsonData", "Lcom/bbva/sdkcatalog/openpay/plugin/data/param/ConnectToBluetoothDeviceParams;", "jsonObject", "Lorg/json/JSONObject;", "connectToBluetoothDevice", "openPayManager", "Lcom/bbva/sdkcatalog/openpay/plugin/OpenPayManager;", "params", "openpay-plugin_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ConnectToBluetoothDeviceCommand extends AbstractCommand<JsonElement> {

    /* JADX INFO: renamed from: com.bbva.sdkcatalog.openpay.plugin.command.ConnectToBluetoothDeviceCommand$connectToBluetoothDevice$1, reason: invalid class name */
    /* JADX INFO: compiled from: ConnectToBluetoothDeviceCommand.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n"}, d2 = {"Lkotlin/Result;", "", "<anonymous>"}, k = 3, mv = {2, 0, 0})
    @DebugMetadata(c = "com.bbva.sdkcatalog.openpay.plugin.command.ConnectToBluetoothDeviceCommand$connectToBluetoothDevice$1", f = "ConnectToBluetoothDeviceCommand.kt", i = {}, l = {74}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass1 extends SuspendLambda implements Function1<Continuation<? super Result<? extends Boolean>>, Object> {
        final /* synthetic */ OpenPayManager $openPayManager;
        final /* synthetic */ ConnectToBluetoothDeviceParams $params;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(ConnectToBluetoothDeviceParams connectToBluetoothDeviceParams, OpenPayManager openPayManager, Continuation<? super AnonymousClass1> continuation) {
            super(1, continuation);
            this.$params = connectToBluetoothDeviceParams;
            this.$openPayManager = openPayManager;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Continuation<?> continuation) {
            return new AnonymousClass1(this.$params, this.$openPayManager, continuation);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Continuation<? super Result<? extends Boolean>> continuation) {
            return invoke2((Continuation<? super Result<Boolean>>) continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objMo4946connectToBluetoothDevice0E7RQCE;
            Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
            int i10 = this.label;
            if (i10 == 0) {
                ResultKt.throwOnFailure(obj);
                DeviceDTOModel deviceDTO = this.$params.getDeviceDTO();
                SecureTerminal secureTerminal = this.$params.getSecureTerminal();
                OpenPayManager openPayManager = this.$openPayManager;
                this.label = 1;
                objMo4946connectToBluetoothDevice0E7RQCE = openPayManager.mo4946connectToBluetoothDevice0E7RQCE(secureTerminal, deviceDTO, this);
                if (objMo4946connectToBluetoothDevice0E7RQCE == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                objMo4946connectToBluetoothDevice0E7RQCE = ((Result) obj).getF79387p0();
            }
            return Result.m5534boximpl(objMo4946connectToBluetoothDevice0E7RQCE);
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(Continuation<? super Result<Boolean>> continuation) {
            return ((AnonymousClass1) create(continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: com.bbva.sdkcatalog.openpay.plugin.command.ConnectToBluetoothDeviceCommand$connectToBluetoothDevice$2, reason: invalid class name */
    /* JADX INFO: compiled from: ConnectToBluetoothDeviceCommand.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "it", "", "<anonymous>"}, k = 3, mv = {2, 0, 0})
    @DebugMetadata(c = "com.bbva.sdkcatalog.openpay.plugin.command.ConnectToBluetoothDeviceCommand$connectToBluetoothDevice$2", f = "ConnectToBluetoothDeviceCommand.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass2 extends SuspendLambda implements Function2<Boolean, Continuation<? super Unit>, Object> {
        final /* synthetic */ CommandCallback $callback;
        int label;
        final /* synthetic */ ConnectToBluetoothDeviceCommand this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(CommandCallback commandCallback, ConnectToBluetoothDeviceCommand connectToBluetoothDeviceCommand, Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
            this.$callback = commandCallback;
            this.this$0 = connectToBluetoothDeviceCommand;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass2(this.$callback, this.this$0, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Boolean bool, Continuation<? super Unit> continuation) {
            return invoke(bool.booleanValue(), continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            ek.a.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            CommandCallback commandCallback = this.$callback;
            Gson gson = ((AbstractCommand) this.this$0).mGson;
            Intrinsics.checkNotNullExpressionValue(gson, "access$getMGson$p$s-1926219956(...)");
            CommandExtensionsKt.sendJsonObjectEvent(commandCallback, gson, new ConnectedResponse(OpenPaySdk.INSTANCE.isConnected().getValue().booleanValue()));
            return Unit.INSTANCE;
        }

        public final Object invoke(boolean z10, Continuation<? super Unit> continuation) {
            return ((AnonymousClass2) create(Boolean.valueOf(z10), continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    public ConnectToBluetoothDeviceCommand() {
        super(JsonElement.class);
    }

    private final void connectToBluetoothDevice(OpenPayManager openPayManager, CommandCallback callback, ConnectToBluetoothDeviceParams params) {
        AnonymousClass1 anonymousClass1 = new AnonymousClass1(params, openPayManager, null);
        AnonymousClass2 anonymousClass2 = new AnonymousClass2(callback, this, null);
        Gson mGson = this.mGson;
        Intrinsics.checkNotNullExpressionValue(mGson, "mGson");
        CommandExtensionsKt.handleResult(callback, anonymousClass1, anonymousClass2, mGson);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit execute$lambda$1(final ConnectToBluetoothDeviceCommand connectToBluetoothDeviceCommand, final CommandCallback commandCallback, final JsonElement jsonElement, OpenPayManager openPayManager, Activity activity) {
        Intrinsics.checkNotNullParameter(openPayManager, "<unused var>");
        Intrinsics.checkNotNullParameter(activity, "<unused var>");
        ActivityContainer mActivityContainer = connectToBluetoothDeviceCommand.mActivityContainer;
        Intrinsics.checkNotNullExpressionValue(mActivityContainer, "mActivityContainer");
        CommandExtensionsKt.invokeCommand(mActivityContainer, commandCallback, 1001, OpenPayError.ErrorBluetoothPermission, new Function2() { // from class: com.bbva.sdkcatalog.openpay.plugin.command.c
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return ConnectToBluetoothDeviceCommand.execute$lambda$1$lambda$0(this.f36393p0, commandCallback, jsonElement, (OpenPayManager) obj, (Activity) obj2);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit execute$lambda$1$lambda$0(ConnectToBluetoothDeviceCommand connectToBluetoothDeviceCommand, CommandCallback commandCallback, JsonElement jsonElement, OpenPayManager openPayManager, Activity activity) {
        Intrinsics.checkNotNullParameter(openPayManager, "openPayManager");
        Intrinsics.checkNotNullParameter(activity, "<unused var>");
        Gson mGson = connectToBluetoothDeviceCommand.mGson;
        Intrinsics.checkNotNullExpressionValue(mGson, "mGson");
        connectToBluetoothDeviceCommand.connectToBluetoothDevice(openPayManager, commandCallback, connectToBluetoothDeviceCommand.parseJsonData(CommandExtensionsKt.getJSONObject(mGson, jsonElement)));
        return Unit.INSTANCE;
    }

    private final ConnectToBluetoothDeviceParams parseJsonData(JSONObject jsonObject) throws JSONException {
        String string = jsonObject.getString("secureTerminal");
        JSONObject jSONObject = jsonObject.getJSONObject("deviceDTO");
        String string2 = jSONObject.getString("name");
        String string3 = jSONObject.getString("address");
        Intrinsics.checkNotNull(string);
        SecureTerminal secureTerminal = new SecureTerminal(string);
        Intrinsics.checkNotNull(string2);
        Intrinsics.checkNotNull(string3);
        return new ConnectToBluetoothDeviceParams(secureTerminal, new DeviceDTOModel(string2, string3));
    }

    @Override // com.bbva.androidtoolkit.plugin.command.AbstractCommand
    public void execute(@NotNull JsonElement jsonElement, @NotNull CommandCallback callback) {
        Intrinsics.checkNotNullParameter(jsonElement, "jsonElement");
        Intrinsics.checkNotNullParameter(callback, "callback");
        ActivityContainer mActivityContainer = this.mActivityContainer;
        Intrinsics.checkNotNullExpressionValue(mActivityContainer, "mActivityContainer");
        CommandExtensionsKt.invokeCommand$default(mActivityContainer, callback, 1003, null, new s(this, callback, jsonElement), 4, null);
    }
}

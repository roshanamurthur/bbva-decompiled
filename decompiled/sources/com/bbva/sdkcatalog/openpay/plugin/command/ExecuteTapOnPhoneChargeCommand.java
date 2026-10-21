package com.bbva.sdkcatalog.openpay.plugin.command;

import android.app.Activity;
import com.bbva.androidtoolkit.plugin.command.AbstractCommand;
import com.bbva.androidtoolkit.plugin.command.callback.CommandCallback;
import com.bbva.androidtoolkit.plugin.component.ActivityContainer;
import com.bbva.ethermobilesdk.geolocation.utils.ConstantsKt;
import com.bbva.notifications.constants.PushConstants;
import com.bbva.sdkcatalog.openpay.plugin.CommandExtensionsKt;
import com.bbva.sdkcatalog.openpay.plugin.MappingExtensionsKt;
import com.bbva.sdkcatalog.openpay.plugin.OpenPayManager;
import com.bbva.sdkcatalog.openpay.plugin.command.collectors.TapOnPhoneTransactionCollector;
import com.bbva.sdkcatalog.openpay.plugin.data.error.OpenPayError;
import com.bbva.sdkcatalog.openpay.plugin.data.param.ExecuteChargeParams;
import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.noknok.android.client.utils.UIConfigTags;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.UninitializedPropertyAccessException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import mx.openpay.library.core.OpenPaySdk;
import mx.openpay.library.core.model.OpenPayChargeState;
import mx.openpay.library.core.model.extra.OrderTerminal;
import mx.openpay.library.core.model.extra.SecureTerminal;
import org.jetbrains.annotations.NotNull;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: ExecuteTapOnPhoneChargeCommand.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u000bH\u0014J\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0002J\u0010\u0010\u0010\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u000bH\u0002J(\u0010\u0011\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0016\u001a\u00020\rH\u0002R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082.¢\u0006\u0002\n\u0000¨\u0006\u0017"}, d2 = {"Lcom/bbva/sdkcatalog/openpay/plugin/command/ExecuteTapOnPhoneChargeCommand;", "Lcom/bbva/androidtoolkit/plugin/command/AbstractCommand;", "Lcom/google/gson/JsonElement;", "<init>", "()V", "collector", "Lcom/bbva/sdkcatalog/openpay/plugin/command/collectors/TapOnPhoneTransactionCollector;", "execute", "", "jsonElement", "callback", "Lcom/bbva/androidtoolkit/plugin/command/callback/CommandCallback;", "parseJsonData", "Lcom/bbva/sdkcatalog/openpay/plugin/data/param/ExecuteChargeParams;", "jsonObject", "Lorg/json/JSONObject;", "startCollector", "executeTapOnPhoneCharge", "openPayManager", "Lcom/bbva/sdkcatalog/openpay/plugin/OpenPayManager;", ConstantsKt.DETECTED_ACTIVITY_EXTRA_ID, "Landroid/app/Activity;", "params", "openpay-plugin_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nExecuteTapOnPhoneChargeCommand.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ExecuteTapOnPhoneChargeCommand.kt\ncom/bbva/sdkcatalog/openpay/plugin/command/ExecuteTapOnPhoneChargeCommand\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,126:1\n1#2:127\n*E\n"})
public final class ExecuteTapOnPhoneChargeCommand extends AbstractCommand<JsonElement> {
    private TapOnPhoneTransactionCollector collector;

    /* JADX INFO: renamed from: com.bbva.sdkcatalog.openpay.plugin.command.ExecuteTapOnPhoneChargeCommand$executeTapOnPhoneCharge$1, reason: invalid class name */
    /* JADX INFO: compiled from: ExecuteTapOnPhoneChargeCommand.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n"}, d2 = {"Lkotlin/Result;", "", "<anonymous>"}, k = 3, mv = {2, 0, 0})
    @DebugMetadata(c = "com.bbva.sdkcatalog.openpay.plugin.command.ExecuteTapOnPhoneChargeCommand$executeTapOnPhoneCharge$1", f = "ExecuteTapOnPhoneChargeCommand.kt", i = {}, l = {116}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass1 extends SuspendLambda implements Function1<Continuation<? super Result<? extends Unit>>, Object> {
        final /* synthetic */ Activity $activity;
        final /* synthetic */ OpenPayManager $openPayManager;
        final /* synthetic */ ExecuteChargeParams $params;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(OpenPayManager openPayManager, Activity activity, ExecuteChargeParams executeChargeParams, Continuation<? super AnonymousClass1> continuation) {
            super(1, continuation);
            this.$openPayManager = openPayManager;
            this.$activity = activity;
            this.$params = executeChargeParams;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Continuation<?> continuation) {
            return new AnonymousClass1(this.$openPayManager, this.$activity, this.$params, continuation);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Continuation<? super Result<? extends Unit>> continuation) {
            return invoke2((Continuation<? super Result<Unit>>) continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objMo4948executeTapOnPhoneCharge0E7RQCE;
            Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
            int i10 = this.label;
            if (i10 == 0) {
                ResultKt.throwOnFailure(obj);
                OpenPayManager openPayManager = this.$openPayManager;
                Activity activity = this.$activity;
                ExecuteChargeParams executeChargeParams = this.$params;
                this.label = 1;
                objMo4948executeTapOnPhoneCharge0E7RQCE = openPayManager.mo4948executeTapOnPhoneCharge0E7RQCE(activity, executeChargeParams, this);
                if (objMo4948executeTapOnPhoneCharge0E7RQCE == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                objMo4948executeTapOnPhoneCharge0E7RQCE = ((Result) obj).getF79387p0();
            }
            return Result.m5534boximpl(objMo4948executeTapOnPhoneCharge0E7RQCE);
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(Continuation<? super Result<Unit>> continuation) {
            return ((AnonymousClass1) create(continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: com.bbva.sdkcatalog.openpay.plugin.command.ExecuteTapOnPhoneChargeCommand$executeTapOnPhoneCharge$2, reason: invalid class name */
    /* JADX INFO: compiled from: ExecuteTapOnPhoneChargeCommand.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "it", "<anonymous>"}, k = 3, mv = {2, 0, 0})
    @DebugMetadata(c = "com.bbva.sdkcatalog.openpay.plugin.command.ExecuteTapOnPhoneChargeCommand$executeTapOnPhoneCharge$2", f = "ExecuteTapOnPhoneChargeCommand.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass2 extends SuspendLambda implements Function2<Unit, Continuation<? super Unit>, Object> {
        int label;

        public AnonymousClass2(Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass2(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            ek.a.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Unit unit, Continuation<? super Unit> continuation) {
            return ((AnonymousClass2) create(unit, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    public ExecuteTapOnPhoneChargeCommand() {
        super(JsonElement.class);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit execute$lambda$0(ExecuteTapOnPhoneChargeCommand executeTapOnPhoneChargeCommand, CommandCallback commandCallback, JsonElement jsonElement, OpenPayManager openPayManager, Activity activity) {
        Intrinsics.checkNotNullParameter(openPayManager, "openPayManager");
        Intrinsics.checkNotNullParameter(activity, "activity");
        Gson mGson = executeTapOnPhoneChargeCommand.mGson;
        Intrinsics.checkNotNullExpressionValue(mGson, "mGson");
        executeTapOnPhoneChargeCommand.collector = new TapOnPhoneTransactionCollector(commandCallback, mGson);
        Gson mGson2 = executeTapOnPhoneChargeCommand.mGson;
        Intrinsics.checkNotNullExpressionValue(mGson2, "mGson");
        executeTapOnPhoneChargeCommand.executeTapOnPhoneCharge(openPayManager, activity, commandCallback, executeTapOnPhoneChargeCommand.parseJsonData(CommandExtensionsKt.getJSONObject(mGson2, jsonElement)));
        return Unit.INSTANCE;
    }

    private final void executeTapOnPhoneCharge(OpenPayManager openPayManager, Activity activity, CommandCallback callback, ExecuteChargeParams params) {
        try {
            startCollector(callback);
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(openPayManager, activity, params, null);
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(null);
            Gson mGson = this.mGson;
            Intrinsics.checkNotNullExpressionValue(mGson, "mGson");
            CommandExtensionsKt.handleResult(callback, anonymousClass1, anonymousClass2, mGson);
        } catch (UninitializedPropertyAccessException unused) {
            callback.sendError(OpenPayError.ErrorInitOpenPay);
        }
    }

    private final ExecuteChargeParams parseJsonData(JSONObject jsonObject) throws JSONException {
        String string = jsonObject.getString("secureTerminal");
        JSONObject jSONObject = jsonObject.getJSONObject("orderTerminal");
        double d2 = jSONObject.getDouble(PushConstants.AMOUNT);
        String string2 = jSONObject.getString("orderId");
        String strOptString = jSONObject.optString("iva");
        if (strOptString.length() <= 0) {
            strOptString = null;
        }
        String strOptString2 = jSONObject.optString("description");
        String str = strOptString2.length() > 0 ? strOptString2 : null;
        String strOptString3 = jSONObject.optString("currency");
        String str2 = strOptString3.length() > 0 ? strOptString3 : null;
        String strOptString4 = jSONObject.optString("dni");
        String str3 = strOptString4.length() > 0 ? strOptString4 : null;
        int iOptInt = jSONObject.optInt(UIConfigTags.TAG_MONTHS, 0);
        Intrinsics.checkNotNull(string);
        SecureTerminal secureTerminal = new SecureTerminal(string);
        Intrinsics.checkNotNull(string2);
        return new ExecuteChargeParams(secureTerminal, new OrderTerminal(d2, strOptString, str, string2, str2, str3, iOptInt));
    }

    private final void startCollector(CommandCallback callback) {
        TapOnPhoneTransactionCollector tapOnPhoneTransactionCollector = this.collector;
        if (tapOnPhoneTransactionCollector == null) {
            Intrinsics.throwUninitializedPropertyAccessException("collector");
            tapOnPhoneTransactionCollector = null;
        }
        tapOnPhoneTransactionCollector.start(OpenPaySdk.INSTANCE.getTapOnPhoneController().getTapOnPhoneChargeResultState(), new na.m(callback, this, 1));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit startCollector$lambda$4(CommandCallback commandCallback, ExecuteTapOnPhoneChargeCommand executeTapOnPhoneChargeCommand, OpenPayChargeState transaction) {
        Intrinsics.checkNotNullParameter(transaction, "transaction");
        TapOnPhoneTransactionCollector tapOnPhoneTransactionCollector = null;
        if (transaction instanceof OpenPayChargeState.Success) {
            Gson mGson = executeTapOnPhoneChargeCommand.mGson;
            Intrinsics.checkNotNullExpressionValue(mGson, "mGson");
            CommandExtensionsKt.sendJsonObjectEvent(commandCallback, mGson, MappingExtensionsKt.toTransactionResponse(((OpenPayChargeState.Success) transaction).getOpenPayCharge()));
            TapOnPhoneTransactionCollector tapOnPhoneTransactionCollector2 = executeTapOnPhoneChargeCommand.collector;
            if (tapOnPhoneTransactionCollector2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("collector");
            } else {
                tapOnPhoneTransactionCollector = tapOnPhoneTransactionCollector2;
            }
            tapOnPhoneTransactionCollector.cancel();
        } else if (!(transaction instanceof OpenPayChargeState.Idle) && !(transaction instanceof OpenPayChargeState.Processing)) {
            commandCallback.sendError(OpenPayError.ErrorGeneric);
            TapOnPhoneTransactionCollector tapOnPhoneTransactionCollector3 = executeTapOnPhoneChargeCommand.collector;
            if (tapOnPhoneTransactionCollector3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("collector");
            } else {
                tapOnPhoneTransactionCollector = tapOnPhoneTransactionCollector3;
            }
            tapOnPhoneTransactionCollector.cancel();
        }
        return Unit.INSTANCE;
    }

    @Override // com.bbva.androidtoolkit.plugin.command.AbstractCommand
    public void execute(@NotNull final JsonElement jsonElement, @NotNull final CommandCallback callback) {
        Intrinsics.checkNotNullParameter(jsonElement, "jsonElement");
        Intrinsics.checkNotNullParameter(callback, "callback");
        ActivityContainer mActivityContainer = this.mActivityContainer;
        Intrinsics.checkNotNullExpressionValue(mActivityContainer, "mActivityContainer");
        CommandExtensionsKt.invokeCommand$default(mActivityContainer, callback, 1002, null, new Function2() { // from class: com.bbva.sdkcatalog.openpay.plugin.command.f
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return ExecuteTapOnPhoneChargeCommand.execute$lambda$0(this.f36402p0, callback, jsonElement, (OpenPayManager) obj, (Activity) obj2);
            }
        }, 4, null);
    }
}

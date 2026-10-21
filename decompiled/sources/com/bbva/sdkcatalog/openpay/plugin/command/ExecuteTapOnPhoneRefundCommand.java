package com.bbva.sdkcatalog.openpay.plugin.command;

import android.app.Activity;
import com.bbva.androidtoolkit.plugin.command.AbstractCommand;
import com.bbva.androidtoolkit.plugin.command.callback.CommandCallback;
import com.bbva.androidtoolkit.plugin.component.ActivityContainer;
import com.bbva.document.scanner.plugin.validators.ValidationConstantsKt;
import com.bbva.ethermobilesdk.geolocation.utils.ConstantsKt;
import com.bbva.notifications.constants.PushConstants;
import com.bbva.sdkcatalog.openpay.plugin.CommandExtensionsKt;
import com.bbva.sdkcatalog.openpay.plugin.MappingExtensionsKt;
import com.bbva.sdkcatalog.openpay.plugin.OpenPayManager;
import com.bbva.sdkcatalog.openpay.plugin.command.collectors.TapOnPhoneTransactionCollector;
import com.bbva.sdkcatalog.openpay.plugin.data.error.OpenPayError;
import com.bbva.sdkcatalog.openpay.plugin.data.param.TapOnPhoneExecuteRefundChargeParams;
import com.google.gson.Gson;
import com.google.gson.JsonElement;
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
import mx.openpay.library.core.model.extra.CardDTO;
import mx.openpay.library.core.model.extra.SecureTerminal;
import mx.openpay.library.core.model.extra.TransactionDTO;
import mx.openpay.library.core.model.taponphone.OpenPayTapOnPhoneRefundChargeState;
import org.jetbrains.annotations.NotNull;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: ExecuteTapOnPhoneRefundCommand.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u000bH\u0014J\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0002J\u0010\u0010\u0010\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u000bH\u0002J(\u0010\u0011\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0016\u001a\u00020\rH\u0002R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082.¢\u0006\u0002\n\u0000¨\u0006\u0017"}, d2 = {"Lcom/bbva/sdkcatalog/openpay/plugin/command/ExecuteTapOnPhoneRefundCommand;", "Lcom/bbva/androidtoolkit/plugin/command/AbstractCommand;", "Lcom/google/gson/JsonElement;", "<init>", "()V", "collector", "Lcom/bbva/sdkcatalog/openpay/plugin/command/collectors/TapOnPhoneTransactionCollector;", "execute", "", "jsonElement", "callback", "Lcom/bbva/androidtoolkit/plugin/command/callback/CommandCallback;", "parseJsonData", "Lcom/bbva/sdkcatalog/openpay/plugin/data/param/TapOnPhoneExecuteRefundChargeParams;", "jsonObject", "Lorg/json/JSONObject;", "startCollector", "executeCharge", ConstantsKt.DETECTED_ACTIVITY_EXTRA_ID, "Landroid/app/Activity;", "openPayManager", "Lcom/bbva/sdkcatalog/openpay/plugin/OpenPayManager;", "params", "openpay-plugin_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nExecuteTapOnPhoneRefundCommand.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ExecuteTapOnPhoneRefundCommand.kt\ncom/bbva/sdkcatalog/openpay/plugin/command/ExecuteTapOnPhoneRefundCommand\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,164:1\n1#2:165\n*E\n"})
public final class ExecuteTapOnPhoneRefundCommand extends AbstractCommand<JsonElement> {
    private TapOnPhoneTransactionCollector collector;

    /* JADX INFO: renamed from: com.bbva.sdkcatalog.openpay.plugin.command.ExecuteTapOnPhoneRefundCommand$executeCharge$1, reason: invalid class name */
    /* JADX INFO: compiled from: ExecuteTapOnPhoneRefundCommand.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n"}, d2 = {"Lkotlin/Result;", "", "<anonymous>"}, k = 3, mv = {2, 0, 0})
    @DebugMetadata(c = "com.bbva.sdkcatalog.openpay.plugin.command.ExecuteTapOnPhoneRefundCommand$executeCharge$1", f = "ExecuteTapOnPhoneRefundCommand.kt", i = {}, l = {154}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass1 extends SuspendLambda implements Function1<Continuation<? super Result<? extends Unit>>, Object> {
        final /* synthetic */ Activity $activity;
        final /* synthetic */ OpenPayManager $openPayManager;
        final /* synthetic */ TapOnPhoneExecuteRefundChargeParams $params;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(OpenPayManager openPayManager, Activity activity, TapOnPhoneExecuteRefundChargeParams tapOnPhoneExecuteRefundChargeParams, Continuation<? super AnonymousClass1> continuation) {
            super(1, continuation);
            this.$openPayManager = openPayManager;
            this.$activity = activity;
            this.$params = tapOnPhoneExecuteRefundChargeParams;
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
            Object objMo4949executeTapOnPhoneRefundCharge0E7RQCE;
            Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
            int i10 = this.label;
            if (i10 == 0) {
                ResultKt.throwOnFailure(obj);
                OpenPayManager openPayManager = this.$openPayManager;
                Activity activity = this.$activity;
                TapOnPhoneExecuteRefundChargeParams tapOnPhoneExecuteRefundChargeParams = this.$params;
                this.label = 1;
                objMo4949executeTapOnPhoneRefundCharge0E7RQCE = openPayManager.mo4949executeTapOnPhoneRefundCharge0E7RQCE(activity, tapOnPhoneExecuteRefundChargeParams, this);
                if (objMo4949executeTapOnPhoneRefundCharge0E7RQCE == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                objMo4949executeTapOnPhoneRefundCharge0E7RQCE = ((Result) obj).getF79387p0();
            }
            return Result.m5534boximpl(objMo4949executeTapOnPhoneRefundCharge0E7RQCE);
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(Continuation<? super Result<Unit>> continuation) {
            return ((AnonymousClass1) create(continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: com.bbva.sdkcatalog.openpay.plugin.command.ExecuteTapOnPhoneRefundCommand$executeCharge$2, reason: invalid class name */
    /* JADX INFO: compiled from: ExecuteTapOnPhoneRefundCommand.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "it", "<anonymous>"}, k = 3, mv = {2, 0, 0})
    @DebugMetadata(c = "com.bbva.sdkcatalog.openpay.plugin.command.ExecuteTapOnPhoneRefundCommand$executeCharge$2", f = "ExecuteTapOnPhoneRefundCommand.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
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

    public ExecuteTapOnPhoneRefundCommand() {
        super(JsonElement.class);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit execute$lambda$0(ExecuteTapOnPhoneRefundCommand executeTapOnPhoneRefundCommand, CommandCallback commandCallback, JsonElement jsonElement, OpenPayManager openPayManager, Activity activity) {
        Intrinsics.checkNotNullParameter(openPayManager, "openPayManager");
        Intrinsics.checkNotNullParameter(activity, "activity");
        Gson mGson = executeTapOnPhoneRefundCommand.mGson;
        Intrinsics.checkNotNullExpressionValue(mGson, "mGson");
        executeTapOnPhoneRefundCommand.collector = new TapOnPhoneTransactionCollector(commandCallback, mGson);
        Gson mGson2 = executeTapOnPhoneRefundCommand.mGson;
        Intrinsics.checkNotNullExpressionValue(mGson2, "mGson");
        executeTapOnPhoneRefundCommand.executeCharge(activity, openPayManager, commandCallback, executeTapOnPhoneRefundCommand.parseJsonData(CommandExtensionsKt.getJSONObject(mGson2, jsonElement)));
        return Unit.INSTANCE;
    }

    private final void executeCharge(Activity activity, OpenPayManager openPayManager, CommandCallback callback, TapOnPhoneExecuteRefundChargeParams params) {
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

    private final TapOnPhoneExecuteRefundChargeParams parseJsonData(JSONObject jsonObject) throws JSONException {
        String string = jsonObject.getString("secureRefundTerminal");
        JSONObject jSONObject = jsonObject.getJSONObject("transaction");
        String strOptString = jSONObject.optString("gatewayCardPresent");
        double dOptDouble = jSONObject.optDouble(PushConstants.AMOUNT);
        String strOptString2 = jSONObject.optString("orderId");
        String strOptString3 = jSONObject.optString("description");
        String strOptString4 = jSONObject.optString("id");
        String strOptString5 = jSONObject.optString("readMode");
        JSONObject jSONObject2 = jSONObject.getJSONObject(ValidationConstantsKt.Card);
        String strOptString6 = jSONObject2.optString("type");
        String strOptString7 = jSONObject2.optString("brand");
        String strOptString8 = jSONObject2.optString("address");
        if (strOptString8.length() <= 0) {
            strOptString8 = null;
        }
        String str = strOptString8;
        String strOptString9 = jSONObject2.optString(com.bbva.ocrcard.utils.ConstantsKt.CARD_NUMBER);
        String strOptString10 = jSONObject2.optString("holderName");
        String strOptString11 = jSONObject2.optString("expirationYear");
        String strOptString12 = jSONObject2.optString("expirationMonth");
        boolean zOptBoolean = jSONObject2.optBoolean("allowsCharges");
        boolean zOptBoolean2 = jSONObject2.optBoolean("allowsPayouts");
        String strOptString13 = jSONObject2.optString("bankName");
        String strOptString14 = jSONObject2.optString("pointsType");
        boolean zOptBoolean3 = jSONObject2.optBoolean("pointsCard");
        String strOptString15 = jSONObject2.optString("bankCode");
        Intrinsics.checkNotNull(string);
        SecureTerminal secureTerminal = new SecureTerminal(string);
        Intrinsics.checkNotNull(strOptString);
        Intrinsics.checkNotNull(strOptString2);
        Intrinsics.checkNotNull(strOptString3);
        Intrinsics.checkNotNull(strOptString4);
        Intrinsics.checkNotNull(strOptString6);
        Intrinsics.checkNotNull(strOptString7);
        Intrinsics.checkNotNull(strOptString9);
        Intrinsics.checkNotNull(strOptString10);
        Intrinsics.checkNotNull(strOptString11);
        Intrinsics.checkNotNull(strOptString12);
        Intrinsics.checkNotNull(strOptString13);
        Intrinsics.checkNotNull(strOptString14);
        Intrinsics.checkNotNull(strOptString15);
        CardDTO cardDTO = new CardDTO(str, zOptBoolean, zOptBoolean2, strOptString15, strOptString13, strOptString7, strOptString9, strOptString12, strOptString11, strOptString10, zOptBoolean3, strOptString14, strOptString6);
        Intrinsics.checkNotNull(strOptString5);
        return new TapOnPhoneExecuteRefundChargeParams(secureTerminal, new TransactionDTO(strOptString4, "", null, "", "", false, "", null, strOptString3, null, "", "", strOptString2, dOptDouble, null, "", null, strOptString, cardDTO, strOptString5, 0.0d, null, "", "", null, null, 53559972, null));
    }

    private final void startCollector(final CommandCallback callback) {
        TapOnPhoneTransactionCollector tapOnPhoneTransactionCollector = this.collector;
        if (tapOnPhoneTransactionCollector == null) {
            Intrinsics.throwUninitializedPropertyAccessException("collector");
            tapOnPhoneTransactionCollector = null;
        }
        tapOnPhoneTransactionCollector.start(OpenPaySdk.INSTANCE.getTapOnPhoneController().getTapOnPhoneRefundChargeResultState(), new Function1() { // from class: com.bbva.sdkcatalog.openpay.plugin.command.h
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ExecuteTapOnPhoneRefundCommand.startCollector$lambda$1(callback, this, (OpenPayTapOnPhoneRefundChargeState) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit startCollector$lambda$1(CommandCallback commandCallback, ExecuteTapOnPhoneRefundCommand executeTapOnPhoneRefundCommand, OpenPayTapOnPhoneRefundChargeState transaction) {
        Intrinsics.checkNotNullParameter(transaction, "transaction");
        TapOnPhoneTransactionCollector tapOnPhoneTransactionCollector = null;
        if (transaction instanceof OpenPayTapOnPhoneRefundChargeState.Success) {
            Gson mGson = executeTapOnPhoneRefundCommand.mGson;
            Intrinsics.checkNotNullExpressionValue(mGson, "mGson");
            CommandExtensionsKt.sendJsonObjectEvent(commandCallback, mGson, MappingExtensionsKt.toTransactionResponse(((OpenPayTapOnPhoneRefundChargeState.Success) transaction).getTransactionDTO()));
            TapOnPhoneTransactionCollector tapOnPhoneTransactionCollector2 = executeTapOnPhoneRefundCommand.collector;
            if (tapOnPhoneTransactionCollector2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("collector");
            } else {
                tapOnPhoneTransactionCollector = tapOnPhoneTransactionCollector2;
            }
            tapOnPhoneTransactionCollector.cancel();
        } else if (!(transaction instanceof OpenPayTapOnPhoneRefundChargeState.Idle) && !(transaction instanceof OpenPayTapOnPhoneRefundChargeState.Processing)) {
            commandCallback.sendError(OpenPayError.ErrorGeneric);
            TapOnPhoneTransactionCollector tapOnPhoneTransactionCollector3 = executeTapOnPhoneRefundCommand.collector;
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
        CommandExtensionsKt.invokeCommand$default(mActivityContainer, callback, 1002, null, new Function2() { // from class: com.bbva.sdkcatalog.openpay.plugin.command.g
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return ExecuteTapOnPhoneRefundCommand.execute$lambda$0(this.f36405p0, callback, jsonElement, (OpenPayManager) obj, (Activity) obj2);
            }
        }, 4, null);
    }
}

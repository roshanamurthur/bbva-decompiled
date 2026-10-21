package com.bbva.sdkcatalog.openpay.plugin.command;

import android.app.Activity;
import com.bbva.androidtoolkit.plugin.command.AbstractCommand;
import com.bbva.androidtoolkit.plugin.command.callback.CommandCallback;
import com.bbva.androidtoolkit.plugin.component.ActivityContainer;
import com.bbva.document.scanner.plugin.validators.ValidationConstantsKt;
import com.bbva.notifications.constants.PushConstants;
import com.bbva.ocrcard.utils.ConstantsKt;
import com.bbva.sdkcatalog.openpay.plugin.CommandExtensionsKt;
import com.bbva.sdkcatalog.openpay.plugin.MappingExtensionsKt;
import com.bbva.sdkcatalog.openpay.plugin.OpenPayManager;
import com.bbva.sdkcatalog.openpay.plugin.data.param.ApplyTransactionRefundParams;
import com.google.gson.Gson;
import com.google.gson.JsonElement;
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
import mx.openpay.library.core.model.extra.CardDTO;
import mx.openpay.library.core.model.extra.OpenPayRefundTransaction;
import mx.openpay.library.core.model.extra.SecureTerminal;
import mx.openpay.library.core.model.extra.TransactionDTO;
import org.jetbrains.annotations.NotNull;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: ApplyTransactionRefundCommand.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\tH\u0014J\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0002J \u0010\u000e\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\u000bH\u0002¨\u0006\u0012"}, d2 = {"Lcom/bbva/sdkcatalog/openpay/plugin/command/ApplyTransactionRefundCommand;", "Lcom/bbva/androidtoolkit/plugin/command/AbstractCommand;", "Lcom/google/gson/JsonElement;", "<init>", "()V", "execute", "", "jsonElement", "callback", "Lcom/bbva/androidtoolkit/plugin/command/callback/CommandCallback;", "parseJsonData", "Lcom/bbva/sdkcatalog/openpay/plugin/data/param/ApplyTransactionRefundParams;", "jsonObject", "Lorg/json/JSONObject;", "applyTransactionRefund", "openPayManager", "Lcom/bbva/sdkcatalog/openpay/plugin/OpenPayManager;", "params", "openpay-plugin_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ApplyTransactionRefundCommand extends AbstractCommand<JsonElement> {

    /* JADX INFO: renamed from: com.bbva.sdkcatalog.openpay.plugin.command.ApplyTransactionRefundCommand$applyTransactionRefund$1, reason: invalid class name */
    /* JADX INFO: compiled from: ApplyTransactionRefundCommand.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n"}, d2 = {"Lkotlin/Result;", "Lmx/openpay/library/core/model/extra/TransactionDTO;", "<anonymous>"}, k = 3, mv = {2, 0, 0})
    @DebugMetadata(c = "com.bbva.sdkcatalog.openpay.plugin.command.ApplyTransactionRefundCommand$applyTransactionRefund$1", f = "ApplyTransactionRefundCommand.kt", i = {}, l = {105}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass1 extends SuspendLambda implements Function1<Continuation<? super Result<? extends TransactionDTO>>, Object> {
        final /* synthetic */ OpenPayManager $openPayManager;
        final /* synthetic */ ApplyTransactionRefundParams $params;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(OpenPayManager openPayManager, ApplyTransactionRefundParams applyTransactionRefundParams, Continuation<? super AnonymousClass1> continuation) {
            super(1, continuation);
            this.$openPayManager = openPayManager;
            this.$params = applyTransactionRefundParams;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Continuation<?> continuation) {
            return new AnonymousClass1(this.$openPayManager, this.$params, continuation);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Continuation<? super Result<? extends TransactionDTO>> continuation) {
            return invoke2((Continuation<? super Result<TransactionDTO>>) continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objMo4944applyTransactionRefundBWLJW6A;
            Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
            int i10 = this.label;
            if (i10 == 0) {
                ResultKt.throwOnFailure(obj);
                OpenPayManager openPayManager = this.$openPayManager;
                SecureTerminal secureTerminal = this.$params.getSecureTerminal();
                SecureTerminal secureRefundTerminal = this.$params.getSecureRefundTerminal();
                OpenPayRefundTransaction openPayRefundTransaction = this.$params.getOpenPayRefundTransaction();
                this.label = 1;
                objMo4944applyTransactionRefundBWLJW6A = openPayManager.mo4944applyTransactionRefundBWLJW6A(secureTerminal, secureRefundTerminal, openPayRefundTransaction, this);
                if (objMo4944applyTransactionRefundBWLJW6A == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                objMo4944applyTransactionRefundBWLJW6A = ((Result) obj).getF79387p0();
            }
            return Result.m5534boximpl(objMo4944applyTransactionRefundBWLJW6A);
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(Continuation<? super Result<TransactionDTO>> continuation) {
            return ((AnonymousClass1) create(continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: com.bbva.sdkcatalog.openpay.plugin.command.ApplyTransactionRefundCommand$applyTransactionRefund$2, reason: invalid class name */
    /* JADX INFO: compiled from: ApplyTransactionRefundCommand.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lmx/openpay/library/core/model/extra/TransactionDTO;", "transaction", "", "<anonymous>"}, k = 3, mv = {2, 0, 0})
    @DebugMetadata(c = "com.bbva.sdkcatalog.openpay.plugin.command.ApplyTransactionRefundCommand$applyTransactionRefund$2", f = "ApplyTransactionRefundCommand.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass2 extends SuspendLambda implements Function2<TransactionDTO, Continuation<? super Unit>, Object> {
        final /* synthetic */ CommandCallback $callback;
        /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ ApplyTransactionRefundCommand this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(CommandCallback commandCallback, ApplyTransactionRefundCommand applyTransactionRefundCommand, Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
            this.$callback = commandCallback;
            this.this$0 = applyTransactionRefundCommand;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.$callback, this.this$0, continuation);
            anonymousClass2.L$0 = obj;
            return anonymousClass2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            ek.a.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            TransactionDTO transactionDTO = (TransactionDTO) this.L$0;
            CommandCallback commandCallback = this.$callback;
            Gson gson = ((AbstractCommand) this.this$0).mGson;
            Intrinsics.checkNotNullExpressionValue(gson, "access$getMGson$p$s-1382521885(...)");
            CommandExtensionsKt.sendJsonObjectEvent(commandCallback, gson, MappingExtensionsKt.toTransactionResponse(transactionDTO));
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(TransactionDTO transactionDTO, Continuation<? super Unit> continuation) {
            return ((AnonymousClass2) create(transactionDTO, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    public ApplyTransactionRefundCommand() {
        super(JsonElement.class);
    }

    private final void applyTransactionRefund(OpenPayManager openPayManager, CommandCallback callback, ApplyTransactionRefundParams params) {
        AnonymousClass1 anonymousClass1 = new AnonymousClass1(openPayManager, params, null);
        AnonymousClass2 anonymousClass2 = new AnonymousClass2(callback, this, null);
        Gson mGson = this.mGson;
        Intrinsics.checkNotNullExpressionValue(mGson, "mGson");
        CommandExtensionsKt.handleResult(callback, anonymousClass1, anonymousClass2, mGson);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit execute$lambda$0(ApplyTransactionRefundCommand applyTransactionRefundCommand, CommandCallback commandCallback, JsonElement jsonElement, OpenPayManager openPayManager, Activity activity) {
        Intrinsics.checkNotNullParameter(openPayManager, "openPayManager");
        Intrinsics.checkNotNullParameter(activity, "<unused var>");
        Gson mGson = applyTransactionRefundCommand.mGson;
        Intrinsics.checkNotNullExpressionValue(mGson, "mGson");
        applyTransactionRefundCommand.applyTransactionRefund(openPayManager, commandCallback, applyTransactionRefundCommand.parseJsonData(CommandExtensionsKt.getJSONObject(mGson, jsonElement)));
        return Unit.INSTANCE;
    }

    private final ApplyTransactionRefundParams parseJsonData(JSONObject jsonObject) throws JSONException {
        String string = jsonObject.getString("secureTerminal");
        String string2 = jsonObject.getString("secureRefundTerminal");
        JSONObject jSONObject = jsonObject.getJSONObject("transaction");
        String string3 = jSONObject.getString("gatewayCardPresent");
        double d2 = jSONObject.getDouble(PushConstants.AMOUNT);
        String string4 = jSONObject.getString("orderId");
        String strOptString = jSONObject.optString("description");
        String string5 = jSONObject.getString("id");
        String string6 = jSONObject.getString("readMode");
        JSONObject jSONObject2 = jSONObject.getJSONObject(ValidationConstantsKt.Card);
        String strOptString2 = jSONObject2.optString("type");
        String strOptString3 = jSONObject2.optString("brand");
        String strOptString4 = jSONObject2.optString(ConstantsKt.CARD_NUMBER);
        String strOptString5 = jSONObject2.optString("holderName");
        String strOptString6 = jSONObject2.optString("expirationYear");
        String strOptString7 = jSONObject2.optString("expirationMonth");
        boolean zOptBoolean = jSONObject2.optBoolean("allowsCharges", false);
        boolean zOptBoolean2 = jSONObject2.optBoolean("allowsPayouts", false);
        String strOptString8 = jSONObject2.optString("bankName");
        String strOptString9 = jSONObject2.optString("bankCode");
        String strOptString10 = jSONObject2.optString("pointsType");
        boolean zOptBoolean3 = jSONObject2.optBoolean("pointsCard", false);
        Intrinsics.checkNotNull(string);
        SecureTerminal secureTerminal = new SecureTerminal(string);
        Intrinsics.checkNotNull(string2);
        SecureTerminal secureTerminal2 = new SecureTerminal(string2);
        Intrinsics.checkNotNull(string4);
        Intrinsics.checkNotNull(string5);
        Intrinsics.checkNotNull(strOptString2);
        Intrinsics.checkNotNull(strOptString3);
        Intrinsics.checkNotNull(strOptString4);
        Intrinsics.checkNotNull(strOptString5);
        Intrinsics.checkNotNull(strOptString6);
        Intrinsics.checkNotNull(strOptString7);
        Intrinsics.checkNotNull(strOptString8);
        Intrinsics.checkNotNull(strOptString10);
        Intrinsics.checkNotNull(strOptString9);
        CardDTO cardDTO = new CardDTO("", zOptBoolean, zOptBoolean2, strOptString9, strOptString8, strOptString3, strOptString4, strOptString7, strOptString6, strOptString5, zOptBoolean3, strOptString10, strOptString2);
        Intrinsics.checkNotNull(string6);
        return new ApplyTransactionRefundParams(secureTerminal, secureTerminal2, new OpenPayRefundTransaction(string3, d2, string4, strOptString, string5, cardDTO, string6));
    }

    @Override // com.bbva.androidtoolkit.plugin.command.AbstractCommand
    public void execute(@NotNull final JsonElement jsonElement, @NotNull final CommandCallback callback) {
        Intrinsics.checkNotNullParameter(jsonElement, "jsonElement");
        Intrinsics.checkNotNullParameter(callback, "callback");
        ActivityContainer mActivityContainer = this.mActivityContainer;
        Intrinsics.checkNotNullExpressionValue(mActivityContainer, "mActivityContainer");
        CommandExtensionsKt.invokeCommand$default(mActivityContainer, callback, null, null, new Function2() { // from class: com.bbva.sdkcatalog.openpay.plugin.command.a
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return ApplyTransactionRefundCommand.execute$lambda$0(this.f36387p0, callback, jsonElement, (OpenPayManager) obj, (Activity) obj2);
            }
        }, 6, null);
    }
}

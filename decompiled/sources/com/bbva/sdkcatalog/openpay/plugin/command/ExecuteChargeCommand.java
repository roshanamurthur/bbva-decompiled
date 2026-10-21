package com.bbva.sdkcatalog.openpay.plugin.command;

import android.annotation.SuppressLint;
import android.app.Activity;
import androidx.appcompat.app.AppCompatActivity;
import com.bbva.androidtoolkit.plugin.command.AbstractCommand;
import com.bbva.androidtoolkit.plugin.command.callback.CommandCallback;
import com.bbva.androidtoolkit.plugin.component.ActivityContainer;
import com.bbva.ethermobilesdk.geolocation.utils.ConstantsKt;
import com.bbva.notifications.constants.PushConstants;
import com.bbva.sdkcatalog.openpay.plugin.CommandExtensionsKt;
import com.bbva.sdkcatalog.openpay.plugin.OpenPayManager;
import com.bbva.sdkcatalog.openpay.plugin.command.collectors.ChargeTransactionCollector;
import com.bbva.sdkcatalog.openpay.plugin.data.error.OpenPayError;
import com.bbva.sdkcatalog.openpay.plugin.data.param.ExecuteChargeParams;
import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.noknok.android.client.utils.UIConfigTags;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.UninitializedPropertyAccessException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import mx.openpay.library.core.OpenPaySdk;
import mx.openpay.library.core.model.extra.OrderTerminal;
import mx.openpay.library.core.model.extra.SecureTerminal;
import org.jetbrains.annotations.NotNull;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: ExecuteChargeCommand.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u000bH\u0014J\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0002J \u0010\u0010\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0013\u001a\u00020\rH\u0003R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082.¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"Lcom/bbva/sdkcatalog/openpay/plugin/command/ExecuteChargeCommand;", "Lcom/bbva/androidtoolkit/plugin/command/AbstractCommand;", "Lcom/google/gson/JsonElement;", "<init>", "()V", "collector", "Lcom/bbva/sdkcatalog/openpay/plugin/command/collectors/ChargeTransactionCollector;", "execute", "", "jsonElement", "callback", "Lcom/bbva/androidtoolkit/plugin/command/callback/CommandCallback;", "parseJsonData", "Lcom/bbva/sdkcatalog/openpay/plugin/data/param/ExecuteChargeParams;", "jsonObject", "Lorg/json/JSONObject;", "executeCharge", ConstantsKt.DETECTED_ACTIVITY_EXTRA_ID, "Landroid/app/Activity;", "params", "openpay-plugin_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nExecuteChargeCommand.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ExecuteChargeCommand.kt\ncom/bbva/sdkcatalog/openpay/plugin/command/ExecuteChargeCommand\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,107:1\n1#2:108\n*E\n"})
public final class ExecuteChargeCommand extends AbstractCommand<JsonElement> {
    private ChargeTransactionCollector collector;

    /* JADX INFO: renamed from: com.bbva.sdkcatalog.openpay.plugin.command.ExecuteChargeCommand$executeCharge$1, reason: invalid class name */
    /* JADX INFO: compiled from: ExecuteChargeCommand.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {2, 0, 0})
    @DebugMetadata(c = "com.bbva.sdkcatalog.openpay.plugin.command.ExecuteChargeCommand$executeCharge$1", f = "ExecuteChargeCommand.kt", i = {}, l = {91}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Activity $activity;
        final /* synthetic */ CommandCallback $callback;
        final /* synthetic */ ExecuteChargeParams $params;
        int label;
        final /* synthetic */ ExecuteChargeCommand this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(Activity activity, ExecuteChargeParams executeChargeParams, CommandCallback commandCallback, ExecuteChargeCommand executeChargeCommand, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$activity = activity;
            this.$params = executeChargeParams;
            this.$callback = commandCallback;
            this.this$0 = executeChargeCommand;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.$activity, this.$params, this.$callback, this.this$0, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
            int i10 = this.label;
            try {
                if (i10 == 0) {
                    ResultKt.throwOnFailure(obj);
                    OpenPaySdk openPaySdk = OpenPaySdk.INSTANCE;
                    Activity activity = this.$activity;
                    Intrinsics.checkNotNull(activity, "null cannot be cast to non-null type androidx.appcompat.app.AppCompatActivity");
                    SecureTerminal secureTerminal = this.$params.getSecureTerminal();
                    OrderTerminal orderTerminal = this.$params.getOrderTerminal();
                    this.label = 1;
                    if (openPaySdk.executeCharge((AppCompatActivity) activity, secureTerminal, orderTerminal, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
            } catch (UninitializedPropertyAccessException unused) {
                this.$callback.sendError(OpenPayError.ErrorInitOpenPay);
            } catch (Exception e5) {
                CommandCallback commandCallback = this.$callback;
                Gson gson = ((AbstractCommand) this.this$0).mGson;
                Intrinsics.checkNotNullExpressionValue(gson, "access$getMGson$p$s-2141023070(...)");
                CommandExtensionsKt.sendJsonObjectError(commandCallback, gson, e5.getMessage());
            }
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    public ExecuteChargeCommand() {
        super(JsonElement.class);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit execute$lambda$0(ExecuteChargeCommand executeChargeCommand, CommandCallback commandCallback, JsonElement jsonElement, OpenPayManager openPayManager, Activity activity) {
        Intrinsics.checkNotNullParameter(openPayManager, "<unused var>");
        Intrinsics.checkNotNullParameter(activity, "activity");
        Gson mGson = executeChargeCommand.mGson;
        Intrinsics.checkNotNullExpressionValue(mGson, "mGson");
        executeChargeCommand.collector = new ChargeTransactionCollector(commandCallback, mGson);
        Gson mGson2 = executeChargeCommand.mGson;
        Intrinsics.checkNotNullExpressionValue(mGson2, "mGson");
        executeChargeCommand.executeCharge(activity, commandCallback, executeChargeCommand.parseJsonData(CommandExtensionsKt.getJSONObject(mGson2, jsonElement)));
        return Unit.INSTANCE;
    }

    @SuppressLint({"MissingPermission"})
    private final void executeCharge(Activity activity, CommandCallback callback, ExecuteChargeParams params) {
        ChargeTransactionCollector chargeTransactionCollector = this.collector;
        ChargeTransactionCollector chargeTransactionCollector2 = null;
        if (chargeTransactionCollector == null) {
            Intrinsics.throwUninitializedPropertyAccessException("collector");
            chargeTransactionCollector = null;
        }
        if (!chargeTransactionCollector.isRunning()) {
            ChargeTransactionCollector chargeTransactionCollector3 = this.collector;
            if (chargeTransactionCollector3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("collector");
            } else {
                chargeTransactionCollector2 = chargeTransactionCollector3;
            }
            chargeTransactionCollector2.start();
        }
        BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.MainScope(), Dispatchers.getMain(), null, new AnonymousClass1(activity, params, callback, this, null), 2, null);
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

    @Override // com.bbva.androidtoolkit.plugin.command.AbstractCommand
    public void execute(@NotNull final JsonElement jsonElement, @NotNull final CommandCallback callback) {
        Intrinsics.checkNotNullParameter(jsonElement, "jsonElement");
        Intrinsics.checkNotNullParameter(callback, "callback");
        ActivityContainer mActivityContainer = this.mActivityContainer;
        Intrinsics.checkNotNullExpressionValue(mActivityContainer, "mActivityContainer");
        CommandExtensionsKt.invokeCommand$default(mActivityContainer, callback, 1002, null, new Function2() { // from class: com.bbva.sdkcatalog.openpay.plugin.command.e
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return ExecuteChargeCommand.execute$lambda$0(this.f36399p0, callback, jsonElement, (OpenPayManager) obj, (Activity) obj2);
            }
        }, 4, null);
    }
}

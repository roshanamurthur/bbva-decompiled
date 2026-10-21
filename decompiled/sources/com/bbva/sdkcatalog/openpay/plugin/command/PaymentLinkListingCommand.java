package com.bbva.sdkcatalog.openpay.plugin.command;

import android.app.Activity;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.bbva.androidtoolkit.plugin.command.AbstractCommand;
import com.bbva.androidtoolkit.plugin.command.callback.CommandCallback;
import com.bbva.androidtoolkit.plugin.component.ActivityContainer;
import com.bbva.glomohybrid.logs.LogKeysKt;
import com.bbva.sdkcatalog.openpay.plugin.CommandExtensionsKt;
import com.bbva.sdkcatalog.openpay.plugin.MappingExtensionsKt;
import com.bbva.sdkcatalog.openpay.plugin.OpenPayManager;
import com.bbva.sdkcatalog.openpay.plugin.data.param.PaymentLinkListingParams;
import com.google.gson.Gson;
import com.google.gson.JsonElement;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import mx.openpay.library.core.model.OpenPayPaymentLink;
import mx.openpay.library.core.model.extra.PaymentLinkFilter;
import mx.openpay.library.core.model.extra.SecureTerminal;
import org.jetbrains.annotations.NotNull;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: PaymentLinkListingCommand.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\tH\u0014J\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0002J \u0010\u000e\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\u000bH\u0002¨\u0006\u0012"}, d2 = {"Lcom/bbva/sdkcatalog/openpay/plugin/command/PaymentLinkListingCommand;", "Lcom/bbva/androidtoolkit/plugin/command/AbstractCommand;", "Lcom/google/gson/JsonElement;", "<init>", "()V", "execute", "", "jsonElement", "callback", "Lcom/bbva/androidtoolkit/plugin/command/callback/CommandCallback;", "parseJsonData", "Lcom/bbva/sdkcatalog/openpay/plugin/data/param/PaymentLinkListingParams;", "jsonObject", "Lorg/json/JSONObject;", "paymentLinkListing", "openPayManager", "Lcom/bbva/sdkcatalog/openpay/plugin/OpenPayManager;", "params", "openpay-plugin_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nPaymentLinkListingCommand.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PaymentLinkListingCommand.kt\ncom/bbva/sdkcatalog/openpay/plugin/command/PaymentLinkListingCommand\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,93:1\n1#2:94\n1557#3:95\n1628#3,3:96\n*S KotlinDebug\n*F\n+ 1 PaymentLinkListingCommand.kt\ncom/bbva/sdkcatalog/openpay/plugin/command/PaymentLinkListingCommand\n*L\n66#1:95\n66#1:96,3\n*E\n"})
public final class PaymentLinkListingCommand extends AbstractCommand<JsonElement> {

    /* JADX INFO: renamed from: com.bbva.sdkcatalog.openpay.plugin.command.PaymentLinkListingCommand$paymentLinkListing$1, reason: invalid class name */
    /* JADX INFO: compiled from: PaymentLinkListingCommand.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\n"}, d2 = {"Lkotlin/Result;", "", "Lmx/openpay/library/core/model/OpenPayPaymentLink;", "<anonymous>"}, k = 3, mv = {2, 0, 0})
    @DebugMetadata(c = "com.bbva.sdkcatalog.openpay.plugin.command.PaymentLinkListingCommand$paymentLinkListing$1", f = "PaymentLinkListingCommand.kt", i = {}, l = {78}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass1 extends SuspendLambda implements Function1<Continuation<? super Result<? extends List<? extends OpenPayPaymentLink>>>, Object> {
        final /* synthetic */ OpenPayManager $openPayManager;
        final /* synthetic */ PaymentLinkListingParams $params;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(OpenPayManager openPayManager, PaymentLinkListingParams paymentLinkListingParams, Continuation<? super AnonymousClass1> continuation) {
            super(1, continuation);
            this.$openPayManager = openPayManager;
            this.$params = paymentLinkListingParams;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Continuation<?> continuation) {
            return new AnonymousClass1(this.$openPayManager, this.$params, continuation);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Continuation<? super Result<? extends List<? extends OpenPayPaymentLink>>> continuation) {
            return invoke2((Continuation<? super Result<? extends List<OpenPayPaymentLink>>>) continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objMo4954paymentLinkListing0E7RQCE;
            Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
            int i10 = this.label;
            if (i10 == 0) {
                ResultKt.throwOnFailure(obj);
                OpenPayManager openPayManager = this.$openPayManager;
                SecureTerminal secureTerminal = this.$params.getSecureTerminal();
                PaymentLinkFilter paymentLinkFilter = this.$params.getPaymentLinkFilter();
                this.label = 1;
                objMo4954paymentLinkListing0E7RQCE = openPayManager.mo4954paymentLinkListing0E7RQCE(secureTerminal, paymentLinkFilter, this);
                if (objMo4954paymentLinkListing0E7RQCE == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                objMo4954paymentLinkListing0E7RQCE = ((Result) obj).getF79387p0();
            }
            return Result.m5534boximpl(objMo4954paymentLinkListing0E7RQCE);
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(Continuation<? super Result<? extends List<OpenPayPaymentLink>>> continuation) {
            return ((AnonymousClass1) create(continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: com.bbva.sdkcatalog.openpay.plugin.command.PaymentLinkListingCommand$paymentLinkListing$2, reason: invalid class name */
    /* JADX INFO: compiled from: PaymentLinkListingCommand.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0004\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n"}, d2 = {"", "Lmx/openpay/library/core/model/OpenPayPaymentLink;", "paymentLinks", "", "<anonymous>"}, k = 3, mv = {2, 0, 0})
    @DebugMetadata(c = "com.bbva.sdkcatalog.openpay.plugin.command.PaymentLinkListingCommand$paymentLinkListing$2", f = "PaymentLinkListingCommand.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    @SourceDebugExtension({"SMAP\nPaymentLinkListingCommand.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PaymentLinkListingCommand.kt\ncom/bbva/sdkcatalog/openpay/plugin/command/PaymentLinkListingCommand$paymentLinkListing$2\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,93:1\n1557#2:94\n1628#2,3:95\n*S KotlinDebug\n*F\n+ 1 PaymentLinkListingCommand.kt\ncom/bbva/sdkcatalog/openpay/plugin/command/PaymentLinkListingCommand$paymentLinkListing$2\n*L\n86#1:94\n86#1:95,3\n*E\n"})
    public static final class AnonymousClass2 extends SuspendLambda implements Function2<List<? extends OpenPayPaymentLink>, Continuation<? super Unit>, Object> {
        final /* synthetic */ CommandCallback $callback;
        /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ PaymentLinkListingCommand this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(CommandCallback commandCallback, PaymentLinkListingCommand paymentLinkListingCommand, Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
            this.$callback = commandCallback;
            this.this$0 = paymentLinkListingCommand;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.$callback, this.this$0, continuation);
            anonymousClass2.L$0 = obj;
            return anonymousClass2;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(List<? extends OpenPayPaymentLink> list, Continuation<? super Unit> continuation) {
            return invoke2((List<OpenPayPaymentLink>) list, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            ek.a.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            List list = (List) this.L$0;
            CommandCallback commandCallback = this.$callback;
            Gson gson = ((AbstractCommand) this.this$0).mGson;
            Intrinsics.checkNotNullExpressionValue(gson, "access$getMGson$p$s-561465529(...)");
            List list2 = list;
            ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list2, 10));
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                arrayList.add(MappingExtensionsKt.toPaymentLinkListingResponse((OpenPayPaymentLink) it.next()));
            }
            CommandExtensionsKt.sendJsonArrayEvent(commandCallback, gson, arrayList);
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(List<OpenPayPaymentLink> list, Continuation<? super Unit> continuation) {
            return ((AnonymousClass2) create(list, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    public PaymentLinkListingCommand() {
        super(JsonElement.class);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit execute$lambda$0(PaymentLinkListingCommand paymentLinkListingCommand, CommandCallback commandCallback, JsonElement jsonElement, OpenPayManager openPayManager, Activity activity) {
        Intrinsics.checkNotNullParameter(openPayManager, "openPayManager");
        Intrinsics.checkNotNullParameter(activity, "<unused var>");
        Gson mGson = paymentLinkListingCommand.mGson;
        Intrinsics.checkNotNullExpressionValue(mGson, "mGson");
        paymentLinkListingCommand.paymentLinkListing(openPayManager, commandCallback, paymentLinkListingCommand.parseJsonData(CommandExtensionsKt.getJSONObject(mGson, jsonElement)));
        return Unit.INSTANCE;
    }

    private final PaymentLinkListingParams parseJsonData(JSONObject jsonObject) throws JSONException {
        String string = jsonObject.getString("secureTerminal");
        JSONObject jSONObject = jsonObject.getJSONObject("paymentLinkFilter");
        String strOptString = jSONObject.optString(LogKeysKt.START_DATE);
        JSONArray jSONArray = null;
        String str = strOptString.length() > 0 ? strOptString : null;
        String strOptString2 = jSONObject.optString(LogKeysKt.END_DATE);
        String str2 = strOptString2.length() > 0 ? strOptString2 : null;
        int iOptInt = jSONObject.optInt("limit", 0);
        int iOptInt2 = jSONObject.optInt(TypedValues.CycleType.S_WAVE_OFFSET, 0);
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("status");
        if (jSONArrayOptJSONArray != null && jSONArrayOptJSONArray.length() > 0) {
            jSONArray = jSONArrayOptJSONArray;
        }
        ArrayList arrayList = new ArrayList();
        if (jSONArray != null) {
            int length = jSONArray.length();
            for (int i10 = 0; i10 < length; i10++) {
                String string2 = jSONArray.getString(i10);
                Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
                arrayList.add(string2);
            }
        }
        Intrinsics.checkNotNull(string);
        SecureTerminal secureTerminal = new SecureTerminal(string);
        String strValueOf = String.valueOf(iOptInt);
        String strValueOf2 = String.valueOf(iOptInt2);
        ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(MappingExtensionsKt.toPaymentLinkStatusFilter((String) it.next()));
        }
        return new PaymentLinkListingParams(secureTerminal, new PaymentLinkFilter(str, str2, strValueOf, strValueOf2, arrayList2));
    }

    private final void paymentLinkListing(OpenPayManager openPayManager, CommandCallback callback, PaymentLinkListingParams params) {
        AnonymousClass1 anonymousClass1 = new AnonymousClass1(openPayManager, params, null);
        AnonymousClass2 anonymousClass2 = new AnonymousClass2(callback, this, null);
        Gson mGson = this.mGson;
        Intrinsics.checkNotNullExpressionValue(mGson, "mGson");
        CommandExtensionsKt.handleResult(callback, anonymousClass1, anonymousClass2, mGson);
    }

    @Override // com.bbva.androidtoolkit.plugin.command.AbstractCommand
    public void execute(@NotNull final JsonElement jsonElement, @NotNull final CommandCallback callback) {
        Intrinsics.checkNotNullParameter(jsonElement, "jsonElement");
        Intrinsics.checkNotNullParameter(callback, "callback");
        ActivityContainer mActivityContainer = this.mActivityContainer;
        Intrinsics.checkNotNullExpressionValue(mActivityContainer, "mActivityContainer");
        CommandExtensionsKt.invokeCommand$default(mActivityContainer, callback, null, null, new Function2() { // from class: com.bbva.sdkcatalog.openpay.plugin.command.m
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return PaymentLinkListingCommand.execute$lambda$0(this.f36422p0, callback, jsonElement, (OpenPayManager) obj, (Activity) obj2);
            }
        }, 6, null);
    }
}

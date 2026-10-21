package com.bbva.sdkcatalog.openpay.plugin.command;

import android.app.Activity;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.bbva.androidtoolkit.plugin.command.AbstractCommand;
import com.bbva.androidtoolkit.plugin.command.callback.CommandCallback;
import com.bbva.androidtoolkit.plugin.component.ActivityContainer;
import com.bbva.sdkcatalog.openpay.plugin.CommandExtensionsKt;
import com.bbva.sdkcatalog.openpay.plugin.MappingExtensionsKt;
import com.bbva.sdkcatalog.openpay.plugin.OpenPayManager;
import com.bbva.sdkcatalog.openpay.plugin.data.param.ListTransactionsParams;
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
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import mx.openpay.library.core.model.OpenPayProductType;
import mx.openpay.library.core.model.extra.PaymentMethod;
import mx.openpay.library.core.model.extra.SecureTerminal;
import mx.openpay.library.core.model.extra.TransactionDTO;
import mx.openpay.library.core.model.extra.TransactionFilter;
import org.jetbrains.annotations.NotNull;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: ListTransactionsCommand.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\tH\u0014J\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0002J \u0010\u000e\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\u000bH\u0002¨\u0006\u0012"}, d2 = {"Lcom/bbva/sdkcatalog/openpay/plugin/command/ListTransactionsCommand;", "Lcom/bbva/androidtoolkit/plugin/command/AbstractCommand;", "Lcom/google/gson/JsonElement;", "<init>", "()V", "execute", "", "jsonElement", "callback", "Lcom/bbva/androidtoolkit/plugin/command/callback/CommandCallback;", "parseJsonData", "Lcom/bbva/sdkcatalog/openpay/plugin/data/param/ListTransactionsParams;", "jsonObject", "Lorg/json/JSONObject;", "listTransactions", "openPayManager", "Lcom/bbva/sdkcatalog/openpay/plugin/OpenPayManager;", "params", "openpay-plugin_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nListTransactionsCommand.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ListTransactionsCommand.kt\ncom/bbva/sdkcatalog/openpay/plugin/command/ListTransactionsCommand\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,113:1\n1#2:114\n1#2:129\n1557#3:115\n1628#3,3:116\n1611#3,9:119\n1863#3:128\n1864#3:130\n1620#3:131\n*S KotlinDebug\n*F\n+ 1 ListTransactionsCommand.kt\ncom/bbva/sdkcatalog/openpay/plugin/command/ListTransactionsCommand\n*L\n86#1:129\n81#1:115\n81#1:116,3\n86#1:119,9\n86#1:128\n86#1:130\n86#1:131\n*E\n"})
public final class ListTransactionsCommand extends AbstractCommand<JsonElement> {

    /* JADX INFO: renamed from: com.bbva.sdkcatalog.openpay.plugin.command.ListTransactionsCommand$listTransactions$1, reason: invalid class name */
    /* JADX INFO: compiled from: ListTransactionsCommand.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\n"}, d2 = {"Lkotlin/Result;", "", "Lmx/openpay/library/core/model/extra/TransactionDTO;", "<anonymous>"}, k = 3, mv = {2, 0, 0})
    @DebugMetadata(c = "com.bbva.sdkcatalog.openpay.plugin.command.ListTransactionsCommand$listTransactions$1", f = "ListTransactionsCommand.kt", i = {}, l = {98}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass1 extends SuspendLambda implements Function1<Continuation<? super Result<? extends List<? extends TransactionDTO>>>, Object> {
        final /* synthetic */ OpenPayManager $openPayManager;
        final /* synthetic */ ListTransactionsParams $params;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(OpenPayManager openPayManager, ListTransactionsParams listTransactionsParams, Continuation<? super AnonymousClass1> continuation) {
            super(1, continuation);
            this.$openPayManager = openPayManager;
            this.$params = listTransactionsParams;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Continuation<?> continuation) {
            return new AnonymousClass1(this.$openPayManager, this.$params, continuation);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Continuation<? super Result<? extends List<? extends TransactionDTO>>> continuation) {
            return invoke2((Continuation<? super Result<? extends List<TransactionDTO>>>) continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objMo4953listTransactions0E7RQCE;
            Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
            int i10 = this.label;
            if (i10 == 0) {
                ResultKt.throwOnFailure(obj);
                OpenPayManager openPayManager = this.$openPayManager;
                SecureTerminal secureTerminal = this.$params.getSecureTerminal();
                TransactionFilter transactionFilter = this.$params.getTransactionFilter();
                this.label = 1;
                objMo4953listTransactions0E7RQCE = openPayManager.mo4953listTransactions0E7RQCE(secureTerminal, transactionFilter, this);
                if (objMo4953listTransactions0E7RQCE == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                objMo4953listTransactions0E7RQCE = ((Result) obj).getF79387p0();
            }
            return Result.m5534boximpl(objMo4953listTransactions0E7RQCE);
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(Continuation<? super Result<? extends List<TransactionDTO>>> continuation) {
            return ((AnonymousClass1) create(continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: com.bbva.sdkcatalog.openpay.plugin.command.ListTransactionsCommand$listTransactions$2, reason: invalid class name */
    /* JADX INFO: compiled from: ListTransactionsCommand.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0004\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n"}, d2 = {"", "Lmx/openpay/library/core/model/extra/TransactionDTO;", "transactions", "", "<anonymous>"}, k = 3, mv = {2, 0, 0})
    @DebugMetadata(c = "com.bbva.sdkcatalog.openpay.plugin.command.ListTransactionsCommand$listTransactions$2", f = "ListTransactionsCommand.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    @SourceDebugExtension({"SMAP\nListTransactionsCommand.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ListTransactionsCommand.kt\ncom/bbva/sdkcatalog/openpay/plugin/command/ListTransactionsCommand$listTransactions$2\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,113:1\n1557#2:114\n1628#2,3:115\n*S KotlinDebug\n*F\n+ 1 ListTransactionsCommand.kt\ncom/bbva/sdkcatalog/openpay/plugin/command/ListTransactionsCommand$listTransactions$2\n*L\n106#1:114\n106#1:115,3\n*E\n"})
    public static final class AnonymousClass2 extends SuspendLambda implements Function2<List<? extends TransactionDTO>, Continuation<? super Unit>, Object> {
        final /* synthetic */ CommandCallback $callback;
        /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ ListTransactionsCommand this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(CommandCallback commandCallback, ListTransactionsCommand listTransactionsCommand, Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
            this.$callback = commandCallback;
            this.this$0 = listTransactionsCommand;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.$callback, this.this$0, continuation);
            anonymousClass2.L$0 = obj;
            return anonymousClass2;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(List<? extends TransactionDTO> list, Continuation<? super Unit> continuation) {
            return invoke2((List<TransactionDTO>) list, continuation);
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
            Intrinsics.checkNotNullExpressionValue(gson, "access$getMGson$p$s-127995240(...)");
            List list2 = list;
            ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list2, 10));
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                arrayList.add(MappingExtensionsKt.toTransactionResponse((TransactionDTO) it.next()));
            }
            CommandExtensionsKt.sendJsonArrayEvent(commandCallback, gson, arrayList);
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(List<TransactionDTO> list, Continuation<? super Unit> continuation) {
            return ((AnonymousClass2) create(list, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    public ListTransactionsCommand() {
        super(JsonElement.class);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit execute$lambda$0(ListTransactionsCommand listTransactionsCommand, CommandCallback commandCallback, JsonElement jsonElement, OpenPayManager openPayManager, Activity activity) {
        Intrinsics.checkNotNullParameter(openPayManager, "openPayManager");
        Intrinsics.checkNotNullParameter(activity, "<unused var>");
        Gson mGson = listTransactionsCommand.mGson;
        Intrinsics.checkNotNullExpressionValue(mGson, "mGson");
        listTransactionsCommand.listTransactions(openPayManager, commandCallback, listTransactionsCommand.parseJsonData(CommandExtensionsKt.getJSONObject(mGson, jsonElement)));
        return Unit.INSTANCE;
    }

    private final void listTransactions(OpenPayManager openPayManager, CommandCallback callback, ListTransactionsParams params) {
        AnonymousClass1 anonymousClass1 = new AnonymousClass1(openPayManager, params, null);
        AnonymousClass2 anonymousClass2 = new AnonymousClass2(callback, this, null);
        Gson mGson = this.mGson;
        Intrinsics.checkNotNullExpressionValue(mGson, "mGson");
        CommandExtensionsKt.handleResult(callback, anonymousClass1, anonymousClass2, mGson);
    }

    private final ListTransactionsParams parseJsonData(JSONObject jsonObject) throws JSONException {
        ArrayList arrayList;
        String string = jsonObject.getString("secureTerminal");
        JSONObject jSONObject = jsonObject.getJSONObject("transactionFilter");
        String strOptString = jSONObject.optString("transactionId");
        ArrayList arrayList2 = null;
        String str = strOptString.length() > 0 ? strOptString : null;
        String strOptString2 = jSONObject.optString("paymentMethod");
        if (strOptString2.length() <= 0) {
            strOptString2 = null;
        }
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("status");
        if (jSONArrayOptJSONArray == null || jSONArrayOptJSONArray.length() <= 0) {
            jSONArrayOptJSONArray = null;
        }
        String strOptString3 = jSONObject.optString("operationGte");
        String str2 = strOptString3.length() > 0 ? strOptString3 : null;
        String strOptString4 = jSONObject.optString("operationLte");
        String str3 = strOptString4.length() > 0 ? strOptString4 : null;
        Integer numValueOf = Integer.valueOf(jSONObject.optInt("limit"));
        Integer num = numValueOf.intValue() != 0 ? numValueOf : null;
        Integer numValueOf2 = Integer.valueOf(jSONObject.optInt(TypedValues.CycleType.S_WAVE_OFFSET));
        Integer num2 = numValueOf2.intValue() != 0 ? numValueOf2 : null;
        JSONArray jSONArrayOptJSONArray2 = jSONObject.optJSONArray("productTypes");
        if (jSONArrayOptJSONArray2 == null || jSONArrayOptJSONArray2.length() <= 0) {
            jSONArrayOptJSONArray2 = null;
        }
        ArrayList arrayList3 = new ArrayList();
        if (jSONArrayOptJSONArray != null) {
            int length = jSONArrayOptJSONArray.length();
            for (int i10 = 0; i10 < length; i10++) {
                String string2 = jSONArrayOptJSONArray.getString(i10);
                Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
                arrayList3.add(string2);
            }
        }
        if (jSONArrayOptJSONArray2 != null) {
            arrayList = new ArrayList();
            int length2 = jSONArrayOptJSONArray2.length();
            for (int i11 = 0; i11 < length2; i11++) {
                String string3 = jSONArrayOptJSONArray2.getString(i11);
                Intrinsics.checkNotNullExpressionValue(string3, "getString(...)");
                arrayList.add(string3);
            }
        } else {
            arrayList = null;
        }
        Intrinsics.checkNotNull(string);
        SecureTerminal secureTerminal = new SecureTerminal(string);
        PaymentMethod paymentMethod = strOptString2 != null ? MappingExtensionsKt.toPaymentMethod(strOptString2) : null;
        ArrayList arrayList4 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList3, 10));
        Iterator it = arrayList3.iterator();
        while (it.hasNext()) {
            arrayList4.add(MappingExtensionsKt.toStatusFilter((String) it.next()));
        }
        ArrayList arrayList5 = (ArrayList) CollectionsKt___CollectionsKt.toCollection(arrayList4, new ArrayList());
        if (arrayList != null) {
            arrayList2 = new ArrayList();
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                OpenPayProductType productType = MappingExtensionsKt.toProductType((String) it2.next());
                if (productType != null) {
                    arrayList2.add(productType);
                }
            }
        }
        return new ListTransactionsParams(secureTerminal, new TransactionFilter(str, paymentMethod, arrayList5, num, num2, str2, str3, arrayList2));
    }

    @Override // com.bbva.androidtoolkit.plugin.command.AbstractCommand
    public void execute(@NotNull final JsonElement jsonElement, @NotNull final CommandCallback callback) {
        Intrinsics.checkNotNullParameter(jsonElement, "jsonElement");
        Intrinsics.checkNotNullParameter(callback, "callback");
        ActivityContainer mActivityContainer = this.mActivityContainer;
        Intrinsics.checkNotNullExpressionValue(mActivityContainer, "mActivityContainer");
        CommandExtensionsKt.invokeCommand$default(mActivityContainer, callback, null, null, new Function2() { // from class: com.bbva.sdkcatalog.openpay.plugin.command.l
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return ListTransactionsCommand.execute$lambda$0(this.f36419p0, callback, jsonElement, (OpenPayManager) obj, (Activity) obj2);
            }
        }, 6, null);
    }
}

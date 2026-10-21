package com.bbva.sdkcatalog.openpay.plugin.command;

import android.app.Activity;
import com.bbva.androidtoolkit.plugin.command.AbstractCommand;
import com.bbva.androidtoolkit.plugin.command.callback.CommandCallback;
import com.bbva.androidtoolkit.plugin.component.ActivityContainer;
import com.bbva.sdkcatalog.openpay.plugin.CommandExtensionsKt;
import com.bbva.sdkcatalog.openpay.plugin.MappingExtensionsKt;
import com.bbva.sdkcatalog.openpay.plugin.OpenPayManager;
import com.bbva.sdkcatalog.openpay.plugin.data.param.UpdatePaymentLinkParams;
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
import mx.openpay.library.core.model.OpenPayPaymentLink;
import mx.openpay.library.core.model.extra.SecureTerminal;
import mx.openpay.library.core.model.extra.UpdatePaymentLink;
import org.jetbrains.annotations.NotNull;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: UpdatePaymentLinkCommand.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\tH\u0014J\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0002J \u0010\u000e\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\u000bH\u0002¨\u0006\u0012"}, d2 = {"Lcom/bbva/sdkcatalog/openpay/plugin/command/UpdatePaymentLinkCommand;", "Lcom/bbva/androidtoolkit/plugin/command/AbstractCommand;", "Lcom/google/gson/JsonElement;", "<init>", "()V", "execute", "", "jsonElement", "callback", "Lcom/bbva/androidtoolkit/plugin/command/callback/CommandCallback;", "parseJsonData", "Lcom/bbva/sdkcatalog/openpay/plugin/data/param/UpdatePaymentLinkParams;", "jsonObject", "Lorg/json/JSONObject;", "updatePaymentLink", "openPayManager", "Lcom/bbva/sdkcatalog/openpay/plugin/OpenPayManager;", "params", "openpay-plugin_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class UpdatePaymentLinkCommand extends AbstractCommand<JsonElement> {

    /* JADX INFO: renamed from: com.bbva.sdkcatalog.openpay.plugin.command.UpdatePaymentLinkCommand$updatePaymentLink$1, reason: invalid class name */
    /* JADX INFO: compiled from: UpdatePaymentLinkCommand.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n"}, d2 = {"Lkotlin/Result;", "Lmx/openpay/library/core/model/OpenPayPaymentLink;", "<anonymous>"}, k = 3, mv = {2, 0, 0})
    @DebugMetadata(c = "com.bbva.sdkcatalog.openpay.plugin.command.UpdatePaymentLinkCommand$updatePaymentLink$1", f = "UpdatePaymentLinkCommand.kt", i = {}, l = {66}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass1 extends SuspendLambda implements Function1<Continuation<? super Result<? extends OpenPayPaymentLink>>, Object> {
        final /* synthetic */ OpenPayManager $openPayManager;
        final /* synthetic */ UpdatePaymentLinkParams $params;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(OpenPayManager openPayManager, UpdatePaymentLinkParams updatePaymentLinkParams, Continuation<? super AnonymousClass1> continuation) {
            super(1, continuation);
            this.$openPayManager = openPayManager;
            this.$params = updatePaymentLinkParams;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Continuation<?> continuation) {
            return new AnonymousClass1(this.$openPayManager, this.$params, continuation);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Continuation<? super Result<? extends OpenPayPaymentLink>> continuation) {
            return invoke2((Continuation<? super Result<OpenPayPaymentLink>>) continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objMo4958updatePaymentLink0E7RQCE;
            Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
            int i10 = this.label;
            if (i10 == 0) {
                ResultKt.throwOnFailure(obj);
                OpenPayManager openPayManager = this.$openPayManager;
                SecureTerminal secureTerminal = this.$params.getSecureTerminal();
                UpdatePaymentLink linkData = this.$params.getLinkData();
                this.label = 1;
                objMo4958updatePaymentLink0E7RQCE = openPayManager.mo4958updatePaymentLink0E7RQCE(secureTerminal, linkData, this);
                if (objMo4958updatePaymentLink0E7RQCE == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                objMo4958updatePaymentLink0E7RQCE = ((Result) obj).getF79387p0();
            }
            return Result.m5534boximpl(objMo4958updatePaymentLink0E7RQCE);
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(Continuation<? super Result<OpenPayPaymentLink>> continuation) {
            return ((AnonymousClass1) create(continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: com.bbva.sdkcatalog.openpay.plugin.command.UpdatePaymentLinkCommand$updatePaymentLink$2, reason: invalid class name */
    /* JADX INFO: compiled from: UpdatePaymentLinkCommand.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lmx/openpay/library/core/model/OpenPayPaymentLink;", "paymentLink", "", "<anonymous>"}, k = 3, mv = {2, 0, 0})
    @DebugMetadata(c = "com.bbva.sdkcatalog.openpay.plugin.command.UpdatePaymentLinkCommand$updatePaymentLink$2", f = "UpdatePaymentLinkCommand.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass2 extends SuspendLambda implements Function2<OpenPayPaymentLink, Continuation<? super Unit>, Object> {
        final /* synthetic */ CommandCallback $callback;
        /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ UpdatePaymentLinkCommand this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(CommandCallback commandCallback, UpdatePaymentLinkCommand updatePaymentLinkCommand, Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
            this.$callback = commandCallback;
            this.this$0 = updatePaymentLinkCommand;
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
            OpenPayPaymentLink openPayPaymentLink = (OpenPayPaymentLink) this.L$0;
            CommandCallback commandCallback = this.$callback;
            Gson gson = ((AbstractCommand) this.this$0).mGson;
            Intrinsics.checkNotNullExpressionValue(gson, "access$getMGson$p$s-1543657260(...)");
            CommandExtensionsKt.sendJsonObjectEvent(commandCallback, gson, MappingExtensionsKt.toPaymentLinkResponse(openPayPaymentLink));
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(OpenPayPaymentLink openPayPaymentLink, Continuation<? super Unit> continuation) {
            return ((AnonymousClass2) create(openPayPaymentLink, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    public UpdatePaymentLinkCommand() {
        super(JsonElement.class);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit execute$lambda$0(UpdatePaymentLinkCommand updatePaymentLinkCommand, CommandCallback commandCallback, JsonElement jsonElement, OpenPayManager openPayManager, Activity activity) {
        Intrinsics.checkNotNullParameter(openPayManager, "openPayManager");
        Intrinsics.checkNotNullParameter(activity, "<unused var>");
        Gson mGson = updatePaymentLinkCommand.mGson;
        Intrinsics.checkNotNullExpressionValue(mGson, "mGson");
        updatePaymentLinkCommand.updatePaymentLink(openPayManager, commandCallback, updatePaymentLinkCommand.parseJsonData(CommandExtensionsKt.getJSONObject(mGson, jsonElement)));
        return Unit.INSTANCE;
    }

    private final UpdatePaymentLinkParams parseJsonData(JSONObject jsonObject) throws JSONException {
        String string = jsonObject.getString("secureTerminal");
        JSONObject jSONObject = jsonObject.getJSONObject("linkData");
        String string2 = jSONObject.getString("status");
        String string3 = jSONObject.getString("id");
        String string4 = jSONObject.getString("expirationDate");
        boolean z10 = jSONObject.getBoolean("sendEmail");
        Intrinsics.checkNotNull(string);
        SecureTerminal secureTerminal = new SecureTerminal(string);
        Intrinsics.checkNotNull(string2);
        Intrinsics.checkNotNull(string3);
        Intrinsics.checkNotNull(string4);
        return new UpdatePaymentLinkParams(secureTerminal, new UpdatePaymentLink(string2, string4, z10, string3));
    }

    private final void updatePaymentLink(OpenPayManager openPayManager, CommandCallback callback, UpdatePaymentLinkParams params) {
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
        CommandExtensionsKt.invokeCommand$default(mActivityContainer, callback, null, null, new Function2() { // from class: com.bbva.sdkcatalog.openpay.plugin.command.r
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return UpdatePaymentLinkCommand.execute$lambda$0(this.f36435p0, callback, jsonElement, (OpenPayManager) obj, (Activity) obj2);
            }
        }, 6, null);
    }
}

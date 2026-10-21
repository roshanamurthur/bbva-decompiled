package com.bbva.sdkcatalog.openpay.plugin.command;

import android.app.Activity;
import com.bbva.androidtoolkit.plugin.command.AbstractCommand;
import com.bbva.androidtoolkit.plugin.command.callback.CommandCallback;
import com.bbva.androidtoolkit.plugin.component.ActivityContainer;
import com.bbva.ethermobilesdk.geolocation.utils.ConstantsKt;
import com.bbva.gp2.android.product.trustdevice.library.TrustDeviceLib;
import com.bbva.sdkcatalog.openpay.plugin.CommandExtensionsKt;
import com.bbva.sdkcatalog.openpay.plugin.OpenPayManager;
import com.bbva.sdkcatalog.openpay.plugin.data.response.NfcStatusResponse;
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
import mx.openpay.library.core.model.OpenPayDeviceNFCStatus;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* JADX INFO: compiled from: InitTapOnPhoneCommand.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\tH\u0014J\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0002J(\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\u0013\u001a\u00020\u000bH\u0002¨\u0006\u0014"}, d2 = {"Lcom/bbva/sdkcatalog/openpay/plugin/command/InitTapOnPhoneCommand;", "Lcom/bbva/androidtoolkit/plugin/command/AbstractCommand;", "Lcom/google/gson/JsonElement;", "<init>", "()V", "execute", "", "jsonElement", "callback", "Lcom/bbva/androidtoolkit/plugin/command/callback/CommandCallback;", "parseJsonData", "", "jsonObject", "Lorg/json/JSONObject;", "initTapOnPhone", ConstantsKt.DETECTED_ACTIVITY_EXTRA_ID, "Landroid/app/Activity;", "openPayManager", "Lcom/bbva/sdkcatalog/openpay/plugin/OpenPayManager;", TrustDeviceLib.JWS, "openpay-plugin_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class InitTapOnPhoneCommand extends AbstractCommand<JsonElement> {

    /* JADX INFO: renamed from: com.bbva.sdkcatalog.openpay.plugin.command.InitTapOnPhoneCommand$initTapOnPhone$1, reason: invalid class name */
    /* JADX INFO: compiled from: InitTapOnPhoneCommand.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n"}, d2 = {"Lkotlin/Result;", "Lmx/openpay/library/core/model/OpenPayDeviceNFCStatus;", "<anonymous>"}, k = 3, mv = {2, 0, 0})
    @DebugMetadata(c = "com.bbva.sdkcatalog.openpay.plugin.command.InitTapOnPhoneCommand$initTapOnPhone$1", f = "InitTapOnPhoneCommand.kt", i = {}, l = {48}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass1 extends SuspendLambda implements Function1<Continuation<? super Result<? extends OpenPayDeviceNFCStatus>>, Object> {
        final /* synthetic */ Activity $activity;
        final /* synthetic */ String $jws;
        final /* synthetic */ OpenPayManager $openPayManager;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(OpenPayManager openPayManager, Activity activity, String str, Continuation<? super AnonymousClass1> continuation) {
            super(1, continuation);
            this.$openPayManager = openPayManager;
            this.$activity = activity;
            this.$jws = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Continuation<?> continuation) {
            return new AnonymousClass1(this.$openPayManager, this.$activity, this.$jws, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objMo4952initTapOnPhone0E7RQCE;
            Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
            int i10 = this.label;
            if (i10 == 0) {
                ResultKt.throwOnFailure(obj);
                OpenPayManager openPayManager = this.$openPayManager;
                Activity activity = this.$activity;
                String str = this.$jws;
                this.label = 1;
                objMo4952initTapOnPhone0E7RQCE = openPayManager.mo4952initTapOnPhone0E7RQCE(activity, str, this);
                if (objMo4952initTapOnPhone0E7RQCE == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                objMo4952initTapOnPhone0E7RQCE = ((Result) obj).getF79387p0();
            }
            return Result.m5534boximpl(objMo4952initTapOnPhone0E7RQCE);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Continuation<? super Result<? extends OpenPayDeviceNFCStatus>> continuation) {
            return ((AnonymousClass1) create(continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: com.bbva.sdkcatalog.openpay.plugin.command.InitTapOnPhoneCommand$initTapOnPhone$2, reason: invalid class name */
    /* JADX INFO: compiled from: InitTapOnPhoneCommand.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lmx/openpay/library/core/model/OpenPayDeviceNFCStatus;", "nfcStatus", "", "<anonymous>"}, k = 3, mv = {2, 0, 0})
    @DebugMetadata(c = "com.bbva.sdkcatalog.openpay.plugin.command.InitTapOnPhoneCommand$initTapOnPhone$2", f = "InitTapOnPhoneCommand.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass2 extends SuspendLambda implements Function2<OpenPayDeviceNFCStatus, Continuation<? super Unit>, Object> {
        final /* synthetic */ CommandCallback $callback;
        /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ InitTapOnPhoneCommand this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(CommandCallback commandCallback, InitTapOnPhoneCommand initTapOnPhoneCommand, Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
            this.$callback = commandCallback;
            this.this$0 = initTapOnPhoneCommand;
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
            OpenPayDeviceNFCStatus openPayDeviceNFCStatus = (OpenPayDeviceNFCStatus) this.L$0;
            CommandCallback commandCallback = this.$callback;
            Gson gson = ((AbstractCommand) this.this$0).mGson;
            Intrinsics.checkNotNullExpressionValue(gson, "access$getMGson$p$s423906479(...)");
            CommandExtensionsKt.sendJsonObjectEvent(commandCallback, gson, new NfcStatusResponse(openPayDeviceNFCStatus == OpenPayDeviceNFCStatus.NFC_ENABLED));
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(OpenPayDeviceNFCStatus openPayDeviceNFCStatus, Continuation<? super Unit> continuation) {
            return ((AnonymousClass2) create(openPayDeviceNFCStatus, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    public InitTapOnPhoneCommand() {
        super(JsonElement.class);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit execute$lambda$0(InitTapOnPhoneCommand initTapOnPhoneCommand, CommandCallback commandCallback, JsonElement jsonElement, OpenPayManager openPayManager, Activity activity) {
        Intrinsics.checkNotNullParameter(openPayManager, "openPayManager");
        Intrinsics.checkNotNullParameter(activity, "activity");
        Gson mGson = initTapOnPhoneCommand.mGson;
        Intrinsics.checkNotNullExpressionValue(mGson, "mGson");
        initTapOnPhoneCommand.initTapOnPhone(activity, openPayManager, commandCallback, initTapOnPhoneCommand.parseJsonData(CommandExtensionsKt.getJSONObject(mGson, jsonElement)));
        return Unit.INSTANCE;
    }

    private final void initTapOnPhone(Activity activity, OpenPayManager openPayManager, CommandCallback callback, String jws) {
        AnonymousClass1 anonymousClass1 = new AnonymousClass1(openPayManager, activity, jws, null);
        AnonymousClass2 anonymousClass2 = new AnonymousClass2(callback, this, null);
        Gson mGson = this.mGson;
        Intrinsics.checkNotNullExpressionValue(mGson, "mGson");
        CommandExtensionsKt.handleResult(callback, anonymousClass1, anonymousClass2, mGson);
    }

    private final String parseJsonData(JSONObject jsonObject) {
        String strOptString = jsonObject.optString("secureTerminal");
        Intrinsics.checkNotNullExpressionValue(strOptString, "optString(...)");
        return strOptString;
    }

    @Override // com.bbva.androidtoolkit.plugin.command.AbstractCommand
    public void execute(@NotNull final JsonElement jsonElement, @NotNull final CommandCallback callback) {
        Intrinsics.checkNotNullParameter(jsonElement, "jsonElement");
        Intrinsics.checkNotNullParameter(callback, "callback");
        ActivityContainer mActivityContainer = this.mActivityContainer;
        Intrinsics.checkNotNullExpressionValue(mActivityContainer, "mActivityContainer");
        CommandExtensionsKt.invokeCommand$default(mActivityContainer, callback, null, null, new Function2() { // from class: com.bbva.sdkcatalog.openpay.plugin.command.k
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return InitTapOnPhoneCommand.execute$lambda$0(this.f36416p0, callback, jsonElement, (OpenPayManager) obj, (Activity) obj2);
            }
        }, 6, null);
    }
}

package com.bbva.gp2.android.product.mobilepayment.library;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import androidx.exifinterface.media.ExifInterface;
import c7.a0;
import c7.o;
import c7.z;
import com.bbva.ethermobilesdk.geolocation.utils.ConstantsKt;
import com.bbva.glomoconfig.constants.ConfigConstantsKt;
import com.bbva.gp2.android.product.mobilepayment.library.MobilePaymentLib;
import com.bbva.gp2.android.product.mobilepayment.library.model.CardRequest;
import com.bbva.gp2.android.product.mobilepayment.library.model.CardResult;
import com.bbva.gp2.android.product.mobilepayment.library.utils.ExtensionsKt;
import com.bbva.localstorage.LocalStorage;
import com.bbva.localstorage.storage.Storage;
import com.bbva.tohu.android.product.valkyria.sdk.export.MobilePayment;
import com.bbva.tohu.android.product.valkyria.sdk.export.callbacks.TohuCallback;
import com.bbva.tohu.android.product.valkyria.sdk.export.callbacks.TohuCallbackErrors;
import com.bbva.tohu.android.product.valkyria.sdk.export.constants.PaymentStatus;
import com.bbva.tohu.android.product.valkyria.sdk.export.exceptions.TohuSdkException;
import com.bbva.tohu.android.product.valkyria.sdk.export.requests.Card;
import com.bbva.tohu.android.product.valkyria.sdk.export.responses.TransactionHistoryResponse;
import com.google.gson.Gson;
import ek.a;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.SafeContinuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import na.b;
import na.c;
import na.d;
import na.f;
import na.g;
import na.i;
import na.m;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: MobilePaymentLib.kt */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0084\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 E2\u00020\u0001:\u0002EFB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J*\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\f\u001a\u00020\bH\u0086@¢\u0006\u0002\u0010\rJ%\u0010\u000e\u001a\n \u000f*\u0004\u0018\u00010\b0\b2\u0006\u0010\u0010\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\bH\u0002¢\u0006\u0002\u0010\u0012J\u0016\u0010\u0013\u001a\u00020\u00142\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u0002J\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\b0\u0007J\u0014\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\u0017\u001a\u00020\bJ\u001c\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\f\u001a\u00020\bH\u0086@¢\u0006\u0002\u0010\u0019J\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\b0\u0007J\u0014\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\u0017\u001a\u00020\bJ$\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\u0017\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\bH\u0086@¢\u0006\u0002\u0010\u001dJ\u0014\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\u001f\u001a\u00020 J\f\u0010!\u001a\b\u0012\u0004\u0012\u00020\"0\u0007J\u001c\u0010#\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020'J\f\u0010(\u001a\b\u0012\u0004\u0012\u00020\"0\u0007J\u0014\u0010)\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010*\u001a\u00020\"J\u0014\u0010+\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\u001f\u001a\u00020 J\u001c\u0010,\u001a\b\u0012\u0004\u0012\u00020.0-2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u0002J\"\u0010/\u001a\b\u0012\u0004\u0012\u0002H00\u0007\"\u0004\b\u0000\u001002\f\u00101\u001a\b\u0012\u0004\u0012\u0002H002H\u0002J\u001c\u00103\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u00101\u001a\b\u0012\u0004\u0012\u00020\u001402H\u0002J`\u00104\u001a\b\u0012\u0004\u0012\u0002H00\u0007\"\u0004\b\u0000\u001002!\u00105\u001a\u001d\u0012\u0013\u0012\u001107¢\u0006\f\b8\u0012\b\b9\u0012\u0004\b\b(:\u0012\u0004\u0012\u00020\u0014062!\u0010;\u001a\u001d\u0012\u0013\u0012\u00110<¢\u0006\f\b8\u0012\b\b9\u0012\u0004\b\b(=\u0012\u0004\u0012\u0002H006H\u0086@¢\u0006\u0002\u0010>J\u0081\u0001\u0010?\u001a\b\u0012\u0004\u0012\u0002H00\u0007\"\u0004\b\u0000\u001002!\u00105\u001a\u001d\u0012\u0013\u0012\u001107¢\u0006\f\b8\u0012\b\b9\u0012\u0004\b\b(:\u0012\u0004\u0012\u00020\u0014062B\u0010@\u001a>\u0012\u001f\u0012\u001d\u0012\n\u0012\b\u0012\u0004\u0012\u0002H00\u00070B¢\u0006\f\b8\u0012\b\b9\u0012\u0004\b\b(C\u0012\u0013\u0012\u00110<¢\u0006\f\b8\u0012\b\b9\u0012\u0004\b\b(=\u0012\u0004\u0012\u00020\u00140AH\u0082@¢\u0006\u0002\u0010DR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006G"}, d2 = {"Lcom/bbva/gp2/android/product/mobilepayment/library/MobilePaymentLib;", "", "<init>", "()V", "gSon", "Lcom/google/gson/Gson;", "enableCards", "Lcom/bbva/gp2/android/product/mobilepayment/library/MobilePaymentResult;", "", "cards", "", "Lcom/bbva/gp2/android/product/mobilepayment/library/model/CardRequest;", "pkcs7", "(Ljava/util/List;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "serializeCardResult", "kotlin.jvm.PlatformType", "cardUniqueRef", "status", "(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "trackNotEnabledCards", "", "getFavouriteCard", "setFavouriteCard", ConfigConstantsKt.LANDING_LABEL_ECOMMERCE_CARD_PARAMS_ID, "deleteDevice", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deleteDeviceLocal", "getCardStatus", "getTransactionHistory", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "paymentAuthenticated", "context", "Landroid/content/Context;", "isNfcPaymentApp", "", "setNfcPaymentApp", ConstantsKt.DETECTED_ACTIVITY_EXTRA_ID, "Landroid/app/Activity;", "requestCode", "", "isCdcvmForLvt", "setCdcvmForLvt", "value", "setContext", "mapperToListOfCard", "", "Lcom/bbva/tohu/android/product/valkyria/sdk/export/requests/Card;", "executeAndReturnResult", ExifInterface.GPS_DIRECTION_TRUE, "block", "Lkotlin/Function0;", "executeAndReturnOK", "suspendExecute", "execution", "Lkotlin/Function1;", "Lcom/bbva/tohu/android/product/valkyria/sdk/export/callbacks/TohuCallback;", "Lkotlin/ParameterName;", "name", "callback", "onSuccessResultValue", "Landroid/os/Bundle;", "bundle", "(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "suspendExecuteWithSuccessBlock", "onSuccess", "Lkotlin/Function2;", "Lkotlin/coroutines/Continuation;", "continuation", "(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Companion", "InternalTouCallback", "payments-mobilepayment_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class MobilePaymentLib {

    @NotNull
    public static final String CARD_DIGITIZATION_IN_PROGRESS_STATUS = "IN_PROGRESS";

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    public static final String OK = "OK";

    @NotNull
    public static final String UNSET_FAVORITE = "UNSET_FAVORITE";

    @NotNull
    private final Gson gSon = new Gson();

    /* JADX INFO: compiled from: MobilePaymentLib.kt */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\t2\u0006\u0010\n\u001a\u00020\u000bR\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/bbva/gp2/android/product/mobilepayment/library/MobilePaymentLib$Companion;", "", "<init>", "()V", "OK", "", "CARD_DIGITIZATION_IN_PROGRESS_STATUS", MobilePaymentLib.UNSET_FAVORITE, "init", "Lcom/bbva/gp2/android/product/mobilepayment/library/MobilePaymentResult;", "context", "Landroid/content/Context;", "payments-mobilepayment_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final MobilePaymentResult<String> init(@NotNull Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            if (!MobilePayment.getInstance().isNfcCapable()) {
                return new MobilePaymentResult.Error(MobilePaymentError.NFC_IS_NEEDED);
            }
            try {
                MobilePayment.getInstance().enableDevice();
                return new MobilePaymentResult.Result("OK");
            } catch (Exception unused) {
                return new MobilePaymentResult.Error(MobilePaymentError.INTERNAL_ERROR);
            }
        }
    }

    /* JADX INFO: compiled from: MobilePaymentLib.kt */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B_\u0012\u0012\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00050\u0004\u0012B\u0010\u0006\u001a>\u0012\u001f\u0012\u001d\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00050\u0004¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\u0003\u0012\u0013\u0012\u00110\n¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\u000b\u0012\u0004\u0012\u00020\f0\u0007¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0016J\u0012\u0010\u0010\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0016J\u0012\u0010\u0011\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0016J\u0012\u0010\u0012\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0016J\u0012\u0010\u0013\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0016R\u001a\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000RJ\u0010\u0006\u001a>\u0012\u001f\u0012\u001d\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00050\u0004¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\u0003\u0012\u0013\u0012\u00110\n¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\u000b\u0012\u0004\u0012\u00020\f0\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"Lcom/bbva/gp2/android/product/mobilepayment/library/MobilePaymentLib$InternalTouCallback;", ExifInterface.GPS_DIRECTION_TRUE, "Lcom/bbva/tohu/android/product/valkyria/sdk/export/callbacks/TohuCallback;", "continuation", "Lkotlin/coroutines/Continuation;", "Lcom/bbva/gp2/android/product/mobilepayment/library/MobilePaymentResult;", "onSuccess", "Lkotlin/Function2;", "Lkotlin/ParameterName;", "name", "Landroid/os/Bundle;", "bundle", "", "<init>", "(Lkotlin/coroutines/Continuation;Lkotlin/jvm/functions/Function2;)V", "callbackResultSuccess", "networkNotPresent", "internalError", "loginNeeded", "temporarilyUnavailable", "payments-mobilepayment_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class InternalTouCallback<T> extends TohuCallback {

        @NotNull
        private final Continuation<MobilePaymentResult<T>> continuation;

        @NotNull
        private final Function2<Continuation<? super MobilePaymentResult<T>>, Bundle, Unit> onSuccess;

        /* JADX WARN: Multi-variable type inference failed */
        public InternalTouCallback(@NotNull Continuation<? super MobilePaymentResult<T>> continuation, @NotNull Function2<? super Continuation<? super MobilePaymentResult<T>>, ? super Bundle, Unit> onSuccess) {
            Intrinsics.checkNotNullParameter(continuation, "continuation");
            Intrinsics.checkNotNullParameter(onSuccess, "onSuccess");
            this.continuation = continuation;
            this.onSuccess = onSuccess;
        }

        @Override // com.bbva.tohu.android.product.valkyria.sdk.export.callbacks.TohuCallback
        public void callbackResultSuccess(@NotNull Bundle bundle) {
            Intrinsics.checkNotNullParameter(bundle, "bundle");
            this.onSuccess.invoke(this.continuation, bundle);
        }

        @Override // com.bbva.tohu.android.product.valkyria.sdk.export.callbacks.TohuCallbackErrors
        public void internalError(@Nullable Bundle bundle) {
            Continuation<MobilePaymentResult<T>> continuation = this.continuation;
            Result.Companion companion = Result.INSTANCE;
            continuation.resumeWith(Result.m5535constructorimpl(new MobilePaymentResult.Error(MobilePaymentError.INTERNAL_ERROR)));
        }

        @Override // com.bbva.tohu.android.product.valkyria.sdk.export.callbacks.TohuCallbackErrors
        public void loginNeeded(@Nullable Bundle bundle) {
            Continuation<MobilePaymentResult<T>> continuation = this.continuation;
            Result.Companion companion = Result.INSTANCE;
            continuation.resumeWith(Result.m5535constructorimpl(new MobilePaymentResult.Error(MobilePaymentError.LOGIN_NEEDED)));
        }

        @Override // com.bbva.tohu.android.product.valkyria.sdk.export.callbacks.TohuCallbackErrors
        public void networkNotPresent(@Nullable Bundle bundle) {
            Continuation<MobilePaymentResult<T>> continuation = this.continuation;
            Result.Companion companion = Result.INSTANCE;
            continuation.resumeWith(Result.m5535constructorimpl(new MobilePaymentResult.Error(MobilePaymentError.NETWORK_NOT_PRESENT)));
        }

        @Override // com.bbva.tohu.android.product.valkyria.sdk.export.callbacks.TohuCallbackErrors
        public void temporarilyUnavailable(@Nullable Bundle bundle) {
            Continuation<MobilePaymentResult<T>> continuation = this.continuation;
            Result.Companion companion = Result.INSTANCE;
            continuation.resumeWith(Result.m5535constructorimpl(new MobilePaymentResult.Error(MobilePaymentError.TEMPORARILY_UNAVAILABLE)));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit deleteDevice$lambda$6(String pkcs7, TohuCallback it) {
        Intrinsics.checkNotNullParameter(pkcs7, "$pkcs7");
        Intrinsics.checkNotNullParameter(it, "it");
        MobilePayment.getInstance().deleteDevice(pkcs7, it);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String deleteDevice$lambda$7(Bundle it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return "OK";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit deleteDeviceLocal$lambda$8() throws TohuSdkException {
        MobilePayment.getInstance().deleteDeviceLocal();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit enableCards$lambda$0(MobilePaymentLib this$0, List cards, String pkcs7, TohuCallback it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(cards, "$cards");
        Intrinsics.checkNotNullParameter(pkcs7, "$pkcs7");
        Intrinsics.checkNotNullParameter(it, "it");
        this$0.trackNotEnabledCards(cards);
        MobilePayment.getInstance().enableCards(this$0.mapperToListOfCard(cards), pkcs7, it);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit enableCards$lambda$3(MobilePaymentLib this$0, Continuation continuation, Bundle bundle) {
        String string;
        String string2;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(continuation, "continuation");
        Intrinsics.checkNotNullParameter(bundle, "bundle");
        String string3 = bundle.getString("result");
        if (string3 != null) {
            int iHashCode = string3.hashCode();
            if (iHashCode != -1347010958) {
                if (iHashCode != -710192431) {
                    if (iHashCode == -477511337 && string3.equals(TohuCallback.CARD_NOT_ELIGIBLE_RESULT) && (string2 = bundle.getString(TohuCallbackErrors.CARD_UNIQUE_REFERENCE_KEY)) != null) {
                        Result.Companion companion = Result.INSTANCE;
                        continuation.resumeWith(Result.m5535constructorimpl(new MobilePaymentResult.Result(this$0.serializeCardResult(string2, "NOT_ELIGIBLE"))));
                    }
                } else if (string3.equals(TohuCallback.DEVICE_NOT_ELIGIBLE_RESULT)) {
                    Result.Companion companion2 = Result.INSTANCE;
                    continuation.resumeWith(Result.m5535constructorimpl(new MobilePaymentResult.Error(MobilePaymentError.DEVICE_NOT_ELIGIBLE)));
                }
            } else if (string3.equals(TohuCallback.IN_PROGRESS_RESULT) && (string = bundle.getString(TohuCallbackErrors.CARD_UNIQUE_REFERENCE_KEY)) != null) {
                Result.Companion companion3 = Result.INSTANCE;
                continuation.resumeWith(Result.m5535constructorimpl(new MobilePaymentResult.Result(this$0.serializeCardResult(string, "IN_PROGRESS"))));
            }
        }
        return Unit.INSTANCE;
    }

    private final MobilePaymentResult<String> executeAndReturnOK(Function0<Unit> block) {
        return executeAndReturnResult(new a0(block, 2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String executeAndReturnOK$lambda$17(Function0 block) {
        Intrinsics.checkNotNullParameter(block, "$block");
        block.invoke();
        return "OK";
    }

    private final <T> MobilePaymentResult<T> executeAndReturnResult(Function0<? extends T> block) {
        try {
            return new MobilePaymentResult.Result(block.invoke());
        } catch (Exception e5) {
            return new MobilePaymentResult.Error(ExtensionsKt.toError(e5));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String getCardStatus$lambda$9(String cardId) {
        Intrinsics.checkNotNullParameter(cardId, "$cardId");
        String cardStatus = MobilePayment.getInstance().getCardStatus(cardId);
        Intrinsics.checkNotNullExpressionValue(cardStatus, "getCardStatus(...)");
        return cardStatus;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String getFavouriteCard$lambda$4() {
        String favouriteCard = MobilePayment.getInstance().getFavouriteCard();
        return favouriteCard == null ? "" : favouriteCard;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit getTransactionHistory$lambda$10(String cardId, String pkcs7, TohuCallback it) {
        Intrinsics.checkNotNullParameter(cardId, "$cardId");
        Intrinsics.checkNotNullParameter(pkcs7, "$pkcs7");
        Intrinsics.checkNotNullParameter(it, "it");
        MobilePayment.getInstance().getTransactionHistory(cardId, pkcs7, it);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String getTransactionHistory$lambda$11(MobilePaymentLib this$0, Bundle it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "it");
        String json = this$0.gSon.toJson((TransactionHistoryResponse) it.getParcelable("result"));
        Intrinsics.checkNotNullExpressionValue(json, "toJson(...)");
        return json;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean isCdcvmForLvt$lambda$15() {
        return MobilePayment.getInstance().isCdcvmForLvt();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean isNfcPaymentApp$lambda$13() {
        return MobilePayment.getInstance().isNfcPaymentApp();
    }

    private final List<Card> mapperToListOfCard(List<CardRequest> cards) {
        ArrayList arrayList = new ArrayList();
        for (CardRequest cardRequest : cards) {
            arrayList.add(new Card(cardRequest.getCardId(), cardRequest.getPan(), cardRequest.getExpirationMonth(), cardRequest.getExpirationYear()));
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit paymentAuthenticated$lambda$12(Context context) {
        Intrinsics.checkNotNullParameter(context, "$context");
        MobilePayment.getInstance().paymentAuthenticated(context);
        return Unit.INSTANCE;
    }

    private final String serializeCardResult(String cardUniqueRef, String status) {
        return this.gSon.toJson(new CardResult(cardUniqueRef, status));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit setCdcvmForLvt$lambda$16(boolean z10) {
        MobilePayment.getInstance().setCdcvmForLvt(z10);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit setFavouriteCard$lambda$5(String cardId) throws TohuSdkException {
        Intrinsics.checkNotNullParameter(cardId, "$cardId");
        MobilePayment mobilePayment = MobilePayment.getInstance();
        if (Intrinsics.areEqual(cardId, UNSET_FAVORITE)) {
            cardId = null;
        }
        mobilePayment.setFavouriteCard(cardId);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit setNfcPaymentApp$lambda$14(Activity activity, int i10) {
        Intrinsics.checkNotNullParameter(activity, "$activity");
        MobilePayment.getInstance().setNfcPaymentApp(activity, i10);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit suspendExecute$lambda$18(Function1 onSuccessResultValue, Continuation continuation, Bundle bundle) {
        Intrinsics.checkNotNullParameter(onSuccessResultValue, "$onSuccessResultValue");
        Intrinsics.checkNotNullParameter(continuation, "continuation");
        Intrinsics.checkNotNullParameter(bundle, "bundle");
        Result.Companion companion = Result.INSTANCE;
        continuation.resumeWith(Result.m5535constructorimpl(new MobilePaymentResult.Result(onSuccessResultValue.invoke(bundle))));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final <T> Object suspendExecuteWithSuccessBlock(Function1<? super TohuCallback, Unit> function1, Function2<? super Continuation<? super MobilePaymentResult<T>>, ? super Bundle, Unit> function2, Continuation<? super MobilePaymentResult<T>> continuation) {
        SafeContinuation safeContinuation = new SafeContinuation(IntrinsicsKt__IntrinsicsJvmKt.intercepted(continuation));
        try {
            function1.invoke(new InternalTouCallback(safeContinuation, function2));
        } catch (Exception e5) {
            Result.Companion companion = Result.INSTANCE;
            safeContinuation.resumeWith(Result.m5535constructorimpl(new MobilePaymentResult.Error(ExtensionsKt.toError(e5))));
        }
        Object orThrow = safeContinuation.getOrThrow();
        if (orThrow == a.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return orThrow;
    }

    private final void trackNotEnabledCards(List<CardRequest> cards) {
        for (CardRequest cardRequest : cards) {
            if (Intrinsics.areEqual(MobilePayment.getInstance().getCardStatus(cardRequest.getCardId()), PaymentStatus.NOT_ENABLED)) {
                Storage.DefaultImpls.set$default(LocalStorage.INSTANCE.getStorage(), cardRequest.getCardId(), PaymentStatus.NOT_ENABLED, false, 4, (Object) null);
            }
        }
    }

    @Nullable
    public final Object deleteDevice(@NotNull final String str, @NotNull Continuation<? super MobilePaymentResult<String>> continuation) {
        return suspendExecute(new Function1() { // from class: na.h
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return MobilePaymentLib.deleteDevice$lambda$6(str, (TohuCallback) obj);
            }
        }, new i(), continuation);
    }

    @NotNull
    public final MobilePaymentResult<String> deleteDeviceLocal() {
        return executeAndReturnOK(new f());
    }

    @Nullable
    public final Object enableCards(@NotNull final List<CardRequest> list, @NotNull final String str, @NotNull Continuation<? super MobilePaymentResult<String>> continuation) {
        return suspendExecuteWithSuccessBlock(new Function1() { // from class: na.k
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return MobilePaymentLib.enableCards$lambda$0(this.f84478p0, list, str, (TohuCallback) obj);
            }
        }, new Function2() { // from class: na.l
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return MobilePaymentLib.enableCards$lambda$3(this.f84481p0, (Continuation) obj, (Bundle) obj2);
            }
        }, continuation);
    }

    @NotNull
    public final MobilePaymentResult<String> getCardStatus(@NotNull String cardId) {
        Intrinsics.checkNotNullParameter(cardId, "cardId");
        return executeAndReturnResult(new z(cardId, 1));
    }

    @NotNull
    public final MobilePaymentResult<String> getFavouriteCard() {
        return executeAndReturnResult(new g());
    }

    @Nullable
    public final Object getTransactionHistory(@NotNull String str, @NotNull String str2, @NotNull Continuation<? super MobilePaymentResult<String>> continuation) {
        return suspendExecute(new m(str, str2, 0), new Function1() { // from class: na.n
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return MobilePaymentLib.getTransactionHistory$lambda$11(this.f84485p0, (Bundle) obj);
            }
        }, continuation);
    }

    @NotNull
    public final MobilePaymentResult<Boolean> isCdcvmForLvt() {
        return executeAndReturnResult(new c());
    }

    @NotNull
    public final MobilePaymentResult<Boolean> isNfcPaymentApp() {
        return executeAndReturnResult(new b());
    }

    @NotNull
    public final MobilePaymentResult<String> paymentAuthenticated(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return executeAndReturnOK(new d(context, 0));
    }

    @NotNull
    public final MobilePaymentResult<String> setCdcvmForLvt(final boolean value) {
        return executeAndReturnOK(new Function0() { // from class: na.e
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return MobilePaymentLib.setCdcvmForLvt$lambda$16(value);
            }
        });
    }

    @NotNull
    public final MobilePaymentResult<String> setContext(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        MobilePayment.getInstance().setContext(context);
        return new MobilePaymentResult.Result("OK");
    }

    @NotNull
    public final MobilePaymentResult<String> setFavouriteCard(@NotNull String cardId) {
        Intrinsics.checkNotNullParameter(cardId, "cardId");
        return executeAndReturnOK(new o(cardId, 1));
    }

    @NotNull
    public final MobilePaymentResult<String> setNfcPaymentApp(@NotNull final Activity activity, final int requestCode) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        return executeAndReturnOK(new Function0() { // from class: na.a
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return MobilePaymentLib.setNfcPaymentApp$lambda$14(activity, requestCode);
            }
        });
    }

    @Nullable
    public final <T> Object suspendExecute(@NotNull Function1<? super TohuCallback, Unit> function1, @NotNull final Function1<? super Bundle, ? extends T> function2, @NotNull Continuation<? super MobilePaymentResult<T>> continuation) {
        return suspendExecuteWithSuccessBlock(function1, new Function2() { // from class: na.j
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return MobilePaymentLib.suspendExecute$lambda$18(function2, (Continuation) obj, (Bundle) obj2);
            }
        }, continuation);
    }
}

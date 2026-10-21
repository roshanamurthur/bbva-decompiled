package com.bbva.notifications.extensions;

import android.content.Context;
import androidx.camera.core.processing.f;
import bk.q;
import com.bbva.glomoutils.time.DateExtensionsKt;
import com.bbva.glomoutils.time.StringDate;
import com.bbva.notifications.R;
import com.bbva.notifications.constants.PushConstants;
import com.bbva.notifications.model.AccountValidationResult;
import com.bbva.notifications.model.EncryptedData;
import com.bbva.notifications.model.PaymentRequestResult;
import com.bbva.notifications.model.PaymentStatusResult;
import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import java.util.Arrays;
import java.util.Date;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import kotlin.text.StringsKt___StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: BanxicoExtension.kt */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u001e\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001\u001a\u001e\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u0003*\u00020\u00062\u0006\u0010\u0002\u001a\u00020\u0001\u001a&\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u0003*\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\b\u001a\u00020\u0004\u001a\f\u0010\u000b\u001a\u0004\u0018\u00010\n*\u00020\t\u001a\f\u0010\r\u001a\u0004\u0018\u00010\f*\u00020\t\u001a\f\u0010\u000f\u001a\u0004\u0018\u00010\u000e*\u00020\t\u001a\f\u0010\u0010\u001a\u0004\u0018\u00010\u0000*\u00020\u0004\u001a\f\u0010\u0011\u001a\u0004\u0018\u00010\u0006*\u00020\u0004\u001a\f\u0010\u0012\u001a\u0004\u0018\u00010\u0007*\u00020\u0004¨\u0006\u0013"}, d2 = {"Lcom/bbva/notifications/model/AccountValidationResult;", "Landroid/content/Context;", "context", "", "", "toMap", "Lcom/bbva/notifications/model/PaymentRequestResult;", "Lcom/bbva/notifications/model/PaymentStatusResult;", "body", "Lcom/google/gson/JsonObject;", "Lcom/bbva/notifications/model/EncryptedData$AccountValidation;", "toAccountValidation", "Lcom/bbva/notifications/model/EncryptedData$PaymentRequest;", "toPaymentRequest", "Lcom/bbva/notifications/model/EncryptedData$PaymentStatus;", "toPaymentStatus", "toAccountValidationResult", "toPaymentRequestResult", "toPaymentStatusResult", "Notifications_mexicoRelease"}, k = 2, mv = {1, 9, 0})
public final class BanxicoExtensionKt {
    @Nullable
    public static final EncryptedData.AccountValidation toAccountValidation(@NotNull JsonObject jsonObject) {
        Object objM5535constructorimpl;
        EncryptedData.AccountValidation accountValidation;
        Intrinsics.checkNotNullParameter(jsonObject, "<this>");
        try {
            Result.Companion companion = Result.INSTANCE;
            JsonElement jsonElement = jsonObject.get("infoCuenta");
            if (jsonElement != null) {
                Intrinsics.checkNotNull(jsonElement);
                accountValidation = (EncryptedData.AccountValidation) new Gson().fromJson(jsonElement, EncryptedData.AccountValidation.class);
            } else {
                accountValidation = null;
            }
            objM5535constructorimpl = Result.m5535constructorimpl(accountValidation);
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            objM5535constructorimpl = Result.m5535constructorimpl(ResultKt.createFailure(th2));
        }
        return (EncryptedData.AccountValidation) (Result.m5540isFailureimpl(objM5535constructorimpl) ? null : objM5535constructorimpl);
    }

    @Nullable
    public static final AccountValidationResult toAccountValidationResult(@NotNull String str) {
        Object objM5535constructorimpl;
        Intrinsics.checkNotNullParameter(str, "<this>");
        try {
            Result.Companion companion = Result.INSTANCE;
            objM5535constructorimpl = Result.m5535constructorimpl((AccountValidationResult) new Gson().fromJson(str, AccountValidationResult.class));
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            objM5535constructorimpl = Result.m5535constructorimpl(ResultKt.createFailure(th2));
        }
        if (Result.m5540isFailureimpl(objM5535constructorimpl)) {
            objM5535constructorimpl = null;
        }
        return (AccountValidationResult) objM5535constructorimpl;
    }

    @NotNull
    public static final Map<String, String> toMap(@NotNull AccountValidationResult accountValidationResult, @NotNull Context context) {
        String string;
        Intrinsics.checkNotNullParameter(accountValidationResult, "<this>");
        Intrinsics.checkNotNullParameter(context, "context");
        Pair[] pairArr = new Pair[9];
        pairArr[0] = TuplesKt.to(PushConstants.NOTIFICATION_TYPE, context.getString(R.string.notification_codi_notification_type));
        pairArr[1] = TuplesKt.to(PushConstants.AMOUNT, context.getString(R.string.notification_codi_account_validation_default_amount));
        pairArr[2] = TuplesKt.to("currency", "MXN");
        pairArr[3] = TuplesKt.to(PushConstants.DETAIL_NOTIFICATION_TYPE, context.getString(R.string.notification_codi_detail_notification_type));
        boolean z10 = accountValidationResult.getVerificationResult() == 1;
        int i10 = R.string.notification_codi_account_validation_validated;
        int i11 = R.string.notification_codi_account_validation_not_validated;
        if (z10) {
            string = context.getString(i10);
            Intrinsics.checkNotNull(string);
        } else {
            string = context.getString(i11);
            Intrinsics.checkNotNull(string);
        }
        pairArr[4] = TuplesKt.to("description", string);
        pairArr[5] = TuplesKt.to("linkedAccount", context.getString(R.string.notification_codi_account_validation_account, f.d("•", StringsKt___StringsKt.takeLast(accountValidationResult.getAccount(), 4))));
        StringDate stringDate = StringDate.INSTANCE;
        pairArr[6] = TuplesKt.to("date", stringDate.getToday("dd MMMM yyyy"));
        pairArr[7] = TuplesKt.to("hour", stringDate.getToday("HH:mm"));
        pairArr[8] = TuplesKt.to("action1", "codiQrScanner");
        return q.mapOf(pairArr);
    }

    @Nullable
    public static final EncryptedData.PaymentRequest toPaymentRequest(@NotNull JsonObject jsonObject) {
        Object objM5535constructorimpl;
        EncryptedData.PaymentRequest paymentRequest;
        Intrinsics.checkNotNullParameter(jsonObject, "<this>");
        try {
            Result.Companion companion = Result.INSTANCE;
            JsonElement jsonElement = jsonObject.get("payreq");
            if (jsonElement != null) {
                Intrinsics.checkNotNull(jsonElement);
                paymentRequest = (EncryptedData.PaymentRequest) new Gson().fromJson(jsonElement, EncryptedData.PaymentRequest.class);
            } else {
                paymentRequest = null;
            }
            objM5535constructorimpl = Result.m5535constructorimpl(paymentRequest);
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            objM5535constructorimpl = Result.m5535constructorimpl(ResultKt.createFailure(th2));
        }
        return (EncryptedData.PaymentRequest) (Result.m5540isFailureimpl(objM5535constructorimpl) ? null : objM5535constructorimpl);
    }

    @Nullable
    public static final PaymentRequestResult toPaymentRequestResult(@NotNull String str) {
        Object objM5535constructorimpl;
        Intrinsics.checkNotNullParameter(str, "<this>");
        try {
            Result.Companion companion = Result.INSTANCE;
            objM5535constructorimpl = Result.m5535constructorimpl((PaymentRequestResult) new Gson().fromJson(str, PaymentRequestResult.class));
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            objM5535constructorimpl = Result.m5535constructorimpl(ResultKt.createFailure(th2));
        }
        if (Result.m5540isFailureimpl(objM5535constructorimpl)) {
            objM5535constructorimpl = null;
        }
        return (PaymentRequestResult) objM5535constructorimpl;
    }

    @Nullable
    public static final EncryptedData.PaymentStatus toPaymentStatus(@NotNull JsonObject jsonObject) {
        Object objM5535constructorimpl;
        EncryptedData.PaymentStatus paymentStatus;
        Intrinsics.checkNotNullParameter(jsonObject, "<this>");
        try {
            Result.Companion companion = Result.INSTANCE;
            JsonElement jsonElement = jsonObject.get("info");
            if (jsonElement != null) {
                Intrinsics.checkNotNull(jsonElement);
                paymentStatus = (EncryptedData.PaymentStatus) new Gson().fromJson(jsonElement, EncryptedData.PaymentStatus.class);
            } else {
                paymentStatus = null;
            }
            objM5535constructorimpl = Result.m5535constructorimpl(paymentStatus);
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            objM5535constructorimpl = Result.m5535constructorimpl(ResultKt.createFailure(th2));
        }
        return (EncryptedData.PaymentStatus) (Result.m5540isFailureimpl(objM5535constructorimpl) ? null : objM5535constructorimpl);
    }

    @Nullable
    public static final PaymentStatusResult toPaymentStatusResult(@NotNull String str) {
        Object objM5535constructorimpl;
        Intrinsics.checkNotNullParameter(str, "<this>");
        try {
            Result.Companion companion = Result.INSTANCE;
            objM5535constructorimpl = Result.m5535constructorimpl((PaymentStatusResult) new Gson().fromJson(str, PaymentStatusResult.class));
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            objM5535constructorimpl = Result.m5535constructorimpl(ResultKt.createFailure(th2));
        }
        if (Result.m5540isFailureimpl(objM5535constructorimpl)) {
            objM5535constructorimpl = null;
        }
        return (PaymentStatusResult) objM5535constructorimpl;
    }

    @NotNull
    public static final Map<String, String> toMap(@NotNull PaymentRequestResult paymentRequestResult, @NotNull Context context) {
        Intrinsics.checkNotNullParameter(paymentRequestResult, "<this>");
        Intrinsics.checkNotNullParameter(context, "context");
        String str = String.format("%.2f", Arrays.copyOf(new Object[]{Double.valueOf(paymentRequestResult.getAmount().doubleValue())}, 1));
        Intrinsics.checkNotNullExpressionValue(str, "format(this, *args)");
        return q.mapOf(TuplesKt.to(PushConstants.NOTIFICATION_TYPE, context.getString(R.string.notification_codi_notification_type)), TuplesKt.to(PushConstants.AMOUNT, str), TuplesKt.to("currency", "MXN"), TuplesKt.to("date", DateExtensionsKt.asString(new Date(paymentRequestResult.getRequestTimestamp()), "dd MMMM yyyy")), TuplesKt.to("hour", DateExtensionsKt.asString(new Date(paymentRequestResult.getRequestTimestamp()), "HH:mm")), TuplesKt.to(PushConstants.DETAIL_NOTIFICATION_TYPE, context.getString(R.string.notification_codi_detail_notification_type)), TuplesKt.to("description", context.getString(R.string.notification_codi_payment_request_description)), TuplesKt.to("receiver", paymentRequestResult.getReceiver().getName()), TuplesKt.to("clabe", "•" + StringsKt___StringsKt.takeLast(paymentRequestResult.getReceiver().getAccount(), 4)), TuplesKt.to("fullClabe", paymentRequestResult.getReceiver().getAccount()), TuplesKt.to("phoneNumber", paymentRequestResult.getReceiver().getCertificateSerialNumber()), TuplesKt.to("folioCodi", paymentRequestResult.getId()), TuplesKt.to("reference", paymentRequestResult.getECommerceId()), TuplesKt.to("operationConcept", paymentRequestResult.getConcept()), TuplesKt.to("verificationDigit", paymentRequestResult.getReceiver().getVerificationDigit().toString()), TuplesKt.to("bankId", paymentRequestResult.getReceiver().getBank().toString()), TuplesKt.to("expirationDate", DateExtensionsKt.asString(new Date(paymentRequestResult.getPaymentLimitTimestamp()), "dd MMMM yyyy")), TuplesKt.to("expirationHour", DateExtensionsKt.asString(new Date(paymentRequestResult.getPaymentLimitTimestamp()), "HH:mm") + " h"), TuplesKt.to("requestTimestamp", String.valueOf(paymentRequestResult.getRequestTimestamp())), TuplesKt.to("paymentLimitTimestamp", String.valueOf(paymentRequestResult.getPaymentLimitTimestamp())), TuplesKt.to("action1", "payCodi"), TuplesKt.to("action2", "postponeCodiPayment"), TuplesKt.to("action3", "rejectCodiPayment"));
    }

    @NotNull
    public static final Map<String, String> toMap(@NotNull PaymentStatusResult paymentStatusResult, @NotNull Context context, @NotNull String body) {
        String string;
        Intrinsics.checkNotNullParameter(paymentStatusResult, "<this>");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(body, "body");
        Map<String, String> mapMapOf = q.mapOf(TuplesKt.to(PushConstants.NOTIFICATION_TYPE, context.getString(R.string.notification_codi_notification_type)), TuplesKt.to(PushConstants.DETAIL_NOTIFICATION_TYPE, context.getString(R.string.notification_codi_detail_notification_type)), TuplesKt.to("date", DateExtensionsKt.asString(new Date(paymentStatusResult.getProcessingTimestamp()), "dd MMMM yyyy")), TuplesKt.to("hour", DateExtensionsKt.asString(new Date(paymentStatusResult.getProcessingTimestamp()), "HH:mm")), TuplesKt.to("description", body));
        if (paymentStatusResult.getStatus() != 1) {
            return mapMapOf;
        }
        Map mutableMap = q.toMutableMap(mapMapOf);
        String string2 = context.getString(R.string.notification_codi_payment_status_detail_notification_type);
        Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
        mutableMap.put(PushConstants.DETAIL_NOTIFICATION_TYPE, string2);
        mutableMap.put("currency", "MXN");
        mutableMap.put(PushConstants.AMOUNT, ai.a.i(new Object[]{Double.valueOf(paymentStatusResult.getAmount().doubleValue())}, 1, "%.2f", "format(this, *args)"));
        mutableMap.put("folioCodi", paymentStatusResult.getId());
        boolean zContains$default = StringsKt__StringsKt.contains$default((CharSequence) body, (CharSequence) "Has realizado un pago", false, 2, (Object) null);
        int i10 = R.string.notification_codi_payment_status_movement_charge_type;
        int i11 = R.string.notification_codi_payment_status_movement_pay_type;
        if (zContains$default) {
            string = context.getString(i10);
            Intrinsics.checkNotNull(string);
        } else {
            string = context.getString(i11);
            Intrinsics.checkNotNull(string);
        }
        mutableMap.put(PushConstants.MOVEMENT_TYPE, string);
        return q.toMap(mutableMap);
    }
}

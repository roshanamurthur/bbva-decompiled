package com.bbva.notifications.utils;

import android.content.Context;
import bk.d;
import bk.q;
import com.bbva.glomo.storage.MainStorage;
import com.bbva.notifications.extensions.BanxicoExtensionKt;
import com.bbva.notifications.model.AccountValidationResult;
import com.bbva.notifications.model.EncryptedData;
import com.bbva.notifications.model.EnrollmentCodiData;
import com.bbva.notifications.model.PaymentRequestResult;
import com.bbva.notifications.model.PaymentStatusResult;
import com.bbva.notifications.model.constants.BanxicoConstants;
import com.bbva.push.model.NotificationOptions;
import com.bbva.push.model.Push;
import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: BanxicoPushDecryption.kt */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0016\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004¨\u0006\u000b"}, d2 = {"Lcom/bbva/notifications/utils/BanxicoPushDecryption;", "", "Landroid/content/Context;", "context", "Lcom/bbva/push/model/Push;", "push", "getDecryptedPush", "Lcom/bbva/glomo/storage/MainStorage;", "storage", "<init>", "(Lcom/bbva/glomo/storage/MainStorage;)V", "Notifications_mexicoRelease"}, k = 1, mv = {1, 9, 0})
public final class BanxicoPushDecryption {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final MainStorage f35471a;

    public BanxicoPushDecryption(@NotNull MainStorage storage) {
        Intrinsics.checkNotNullParameter(storage, "storage");
        this.f35471a = storage;
    }

    public final BanxicoCipherManager a() {
        Object objM5535constructorimpl;
        try {
            Result.Companion companion = Result.INSTANCE;
            EnrollmentCodiData enrollmentCodiData = (EnrollmentCodiData) new Gson().fromJson(MainStorage.getJson$default(this.f35471a, BanxicoConstants.KEY_ENROLLMENT_CODI, false, null, 6, null).toString(), EnrollmentCodiData.class);
            objM5535constructorimpl = Result.m5535constructorimpl(new BanxicoCipherManager(enrollmentCodiData.getPass(), enrollmentCodiData.getMaKS()));
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            objM5535constructorimpl = Result.m5535constructorimpl(ResultKt.createFailure(th2));
        }
        if (Result.m5540isFailureimpl(objM5535constructorimpl)) {
            objM5535constructorimpl = null;
        }
        return (BanxicoCipherManager) objM5535constructorimpl;
    }

    public final void b(String str, String str2) {
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("body", str);
        jsonObject.addProperty(BanxicoConstants.KEY_HISTORICAL_PAYLOAD, str2);
        JsonObject json$default = MainStorage.getJson$default(this.f35471a, BanxicoConstants.KEY_CODI_HISTORICAL_NOTIFICATION, false, null, 6, null);
        if (json$default.has("value")) {
            json$default.getAsJsonArray("value").add(jsonObject);
        } else {
            json$default.add("value", new Gson().toJsonTree(d.listOf(jsonObject)));
        }
        MainStorage.put$default(this.f35471a, BanxicoConstants.KEY_CODI_HISTORICAL_NOTIFICATION, json$default.toString(), false, null, 12, null);
    }

    /* JADX WARN: Code duplicated, block: B:85:0x019b  */
    @NotNull
    public final Push getDecryptedPush(@NotNull Context context, @NotNull Push push) {
        Object objM5535constructorimpl;
        String strDecryptData$default;
        Object objM5535constructorimpl2;
        Map<String, String> map;
        String strDecryptData;
        Object objM5535constructorimpl3;
        String strDecryptData$default2;
        Object objM5535constructorimpl4;
        AccountValidationResult accountValidationResult;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(push, "push");
        try {
            Result.Companion companion = Result.INSTANCE;
            objM5535constructorimpl = Result.m5535constructorimpl(JsonParser.parseString(push.getData().get("data")).getAsJsonObject());
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            objM5535constructorimpl = Result.m5535constructorimpl(ResultKt.createFailure(th2));
        }
        JsonObject jsonObject = new JsonObject();
        if (Result.m5540isFailureimpl(objM5535constructorimpl)) {
            objM5535constructorimpl = jsonObject;
        }
        JsonObject jsonObject2 = (JsonObject) objM5535constructorimpl;
        Intrinsics.checkNotNull(jsonObject2);
        Object accountValidation = BanxicoExtensionKt.toAccountValidation(jsonObject2);
        if (accountValidation == null && (accountValidation = BanxicoExtensionKt.toPaymentStatus(jsonObject2)) == null) {
            accountValidation = BanxicoExtensionKt.toPaymentRequest(jsonObject2);
        }
        JsonElement jsonElement = jsonObject2.get("body");
        String asString = jsonElement != null ? jsonElement.getAsString() : null;
        if (asString == null) {
            asString = "";
        }
        if (accountValidation instanceof EncryptedData.AccountValidation) {
            EncryptedData.AccountValidation accountValidation2 = (EncryptedData.AccountValidation) accountValidation;
            BanxicoCipherManager banxicoCipherManagerA = a();
            if (banxicoCipherManagerA != null) {
                try {
                    strDecryptData$default2 = BanxicoCipherManager.decryptData$default(banxicoCipherManagerA, accountValidation2.getTrackingKey(), accountValidation2.getCipherInfo(), null, 4, null);
                } catch (Throwable th3) {
                    Result.Companion companion3 = Result.INSTANCE;
                    objM5535constructorimpl4 = Result.m5535constructorimpl(ResultKt.createFailure(th3));
                }
            } else {
                strDecryptData$default2 = null;
            }
            objM5535constructorimpl4 = Result.m5535constructorimpl(strDecryptData$default2);
            if (Result.m5540isFailureimpl(objM5535constructorimpl4)) {
                objM5535constructorimpl4 = null;
            }
            String str = (String) objM5535constructorimpl4;
            if (str == null || (accountValidationResult = BanxicoExtensionKt.toAccountValidationResult(str)) == null) {
                map = null;
            } else {
                Gson gson = new Gson();
                JsonObject json$default = MainStorage.getJson$default(this.f35471a, BanxicoConstants.KEY_BANXICO_PUSH_STATUS, false, null, 6, null);
                if (json$default.has("value")) {
                    json$default.getAsJsonArray("value").add(gson.toJsonTree(accountValidationResult));
                } else {
                    json$default.add("value", gson.toJsonTree(d.listOf(accountValidationResult)));
                }
                MainStorage.put$default(this.f35471a, BanxicoConstants.KEY_BANXICO_PUSH_STATUS, json$default.toString(), false, null, 12, null);
                map = BanxicoExtensionKt.toMap(accountValidationResult, context);
            }
        } else if (accountValidation instanceof EncryptedData.PaymentRequest) {
            EncryptedData.PaymentRequest paymentRequest = (EncryptedData.PaymentRequest) accountValidation;
            BanxicoCipherManager banxicoCipherManagerA2 = a();
            if (banxicoCipherManagerA2 != null) {
                try {
                    strDecryptData = banxicoCipherManagerA2.decryptData(paymentRequest.getCipherInfo().getId(), paymentRequest.getCipherInfo().getPaymentData(), String.valueOf(paymentRequest.getCipherInfo().getSerial()));
                } catch (Throwable th4) {
                    Result.Companion companion4 = Result.INSTANCE;
                    objM5535constructorimpl3 = Result.m5535constructorimpl(ResultKt.createFailure(th4));
                }
            } else {
                strDecryptData = null;
            }
            objM5535constructorimpl3 = Result.m5535constructorimpl(strDecryptData);
            if (Result.m5540isFailureimpl(objM5535constructorimpl3)) {
                objM5535constructorimpl3 = null;
            }
            String str2 = (String) objM5535constructorimpl3;
            if (str2 != null) {
                b(asString, str2);
                PaymentRequestResult paymentRequestResult = BanxicoExtensionKt.toPaymentRequestResult(str2);
                if (paymentRequestResult != null) {
                    map = BanxicoExtensionKt.toMap(paymentRequestResult, context);
                } else {
                    map = null;
                }
            } else {
                map = null;
            }
        } else if (accountValidation instanceof EncryptedData.PaymentStatus) {
            EncryptedData.PaymentStatus paymentStatus = (EncryptedData.PaymentStatus) accountValidation;
            BanxicoCipherManager banxicoCipherManagerA3 = a();
            if (banxicoCipherManagerA3 != null) {
                try {
                    strDecryptData$default = BanxicoCipherManager.decryptData$default(banxicoCipherManagerA3, paymentStatus.getCipherInfo().getId(), paymentStatus.getCipherInfo().getPaymentData(), null, 4, null);
                } catch (Throwable th5) {
                    Result.Companion companion5 = Result.INSTANCE;
                    objM5535constructorimpl2 = Result.m5535constructorimpl(ResultKt.createFailure(th5));
                }
            } else {
                strDecryptData$default = null;
            }
            objM5535constructorimpl2 = Result.m5535constructorimpl(strDecryptData$default);
            if (Result.m5540isFailureimpl(objM5535constructorimpl2)) {
                objM5535constructorimpl2 = null;
            }
            String str3 = (String) objM5535constructorimpl2;
            if (str3 != null) {
                b(asString, str3);
                PaymentStatusResult paymentStatusResult = BanxicoExtensionKt.toPaymentStatusResult(str3);
                if (paymentStatusResult != null) {
                    map = BanxicoExtensionKt.toMap(paymentStatusResult, context, asString);
                } else {
                    map = null;
                }
            } else {
                map = null;
            }
        } else {
            map = null;
        }
        if (map == null) {
            map = q.emptyMap();
        }
        Map<String, String> map2 = map;
        NotificationOptions notification = push.getNotification();
        JsonElement jsonElement2 = jsonObject2.get("title");
        String asString2 = jsonElement2 != null ? jsonElement2.getAsString() : null;
        String str4 = asString2 == null ? "" : asString2;
        JsonElement jsonElement3 = jsonObject2.get("body");
        String asString3 = jsonElement3 != null ? jsonElement3.getAsString() : null;
        return new Push(null, notification.copy((16118 & 1) != 0 ? notification.title : str4, (16118 & 2) != 0 ? notification.titleLocKey : null, (16118 & 4) != 0 ? notification.titleLocArgs : null, (16118 & 8) != 0 ? notification.content : asString3 == null ? "" : asString3, (16118 & 16) != 0 ? notification.bodyLocKey : null, (16118 & 32) != 0 ? notification.bodyLocArgs : null, (16118 & 64) != 0 ? notification.icon : null, (16118 & 128) != 0 ? notification.channelId : null, (16118 & 256) != 0 ? notification.clickAction : null, (16118 & 512) != 0 ? notification.color : null, (16118 & 1024) != 0 ? notification.link : null, (16118 & 2048) != 0 ? notification.sound : null, (16118 & 4096) != 0 ? notification.tag : null, (16118 & 8192) != 0 ? notification.rawMessage : null), map2, 1, null);
    }
}

package com.bbva.notifications.delegate;

import com.bbva.glomo.storage.MainStorage;
import com.bbva.glomoutils.time.TimeProvider;
import com.bbva.notifications.activity.NotificationNoCommercialActivity;
import com.bbva.notifications.extensions.BanxicoExtensionKt;
import com.bbva.notifications.model.EncryptedData;
import com.bbva.notifications.model.constants.BanxicoConstants;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: BanxicoUnifiedLogEventDelegate.kt */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u00122\u00020\u0001:\u0001\u0012B\u0019\u0012\u0006\u0010\r\u001a\u00020\f\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J4\u0010\b\u001a\u00020\u00072*\u0010\u0006\u001a&\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0018\u00010\u0002j\u0012\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0018\u0001`\u0005H\u0016J4\u0010\t\u001a\u00020\u00072*\u0010\u0006\u001a&\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0018\u00010\u0002j\u0012\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0018\u0001`\u0005H\u0016J\u0010\u0010\u000b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u0003H\u0016¨\u0006\u0013"}, d2 = {"Lcom/bbva/notifications/delegate/BanxicoUnifiedLogEventDelegate;", "Lcom/bbva/notifications/delegate/LogEventDelegate;", "Ljava/util/HashMap;", "", "", "Lkotlin/collections/HashMap;", "notificationMap", "", "storeSelectPushAction", "storeVisualizePushAction", "method", "storeInformPushAction", "Lcom/bbva/glomo/storage/MainStorage;", "storage", "Lcom/bbva/glomoutils/time/TimeProvider;", "timeProvider", "<init>", "(Lcom/bbva/glomo/storage/MainStorage;Lcom/bbva/glomoutils/time/TimeProvider;)V", "Companion", "Notifications_mexicoRelease"}, k = 1, mv = {1, 9, 0})
public final class BanxicoUnifiedLogEventDelegate implements LogEventDelegate {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final MainStorage f35344a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final TimeProvider f35345b;

    public BanxicoUnifiedLogEventDelegate(@NotNull MainStorage storage, @NotNull TimeProvider timeProvider) {
        Intrinsics.checkNotNullParameter(storage, "storage");
        Intrinsics.checkNotNullParameter(timeProvider, "timeProvider");
        this.f35344a = storage;
        this.f35345b = timeProvider;
    }

    public final void a(String str, HashMap<String, Object> map) {
        String str2;
        String str3;
        Object objM5535constructorimpl;
        String id;
        Object obj = map != null ? map.get(NotificationNoCommercialActivity.NOTIFICATION_INTENT_DATA) : null;
        HashMap map2 = obj instanceof HashMap ? (HashMap) obj : null;
        if (map2 == null || (str2 = (String) map2.get(BanxicoConstants.KEY_UNIFIED_LOG_EVENT_PUSH_APP_STATE)) == null || (str3 = (String) map2.get(BanxicoConstants.KEY_UNIFIED_LOG_EVENT_PUSH_DATA)) == null) {
            return;
        }
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("action", str);
        jsonObject.addProperty("appState", str2);
        try {
            Result.Companion companion = Result.INSTANCE;
            JsonObject asJsonObject = JsonParser.parseString(str3).getAsJsonObject();
            Intrinsics.checkNotNull(asJsonObject);
            Object accountValidation = BanxicoExtensionKt.toAccountValidation(asJsonObject);
            if (accountValidation == null && (accountValidation = BanxicoExtensionKt.toPaymentRequest(asJsonObject)) == null) {
                accountValidation = BanxicoExtensionKt.toPaymentStatus(asJsonObject);
            }
            if (accountValidation instanceof EncryptedData.AccountValidation) {
                id = ((EncryptedData.AccountValidation) accountValidation).getTrackingKey();
            } else if (accountValidation instanceof EncryptedData.PaymentRequest) {
                id = ((EncryptedData.PaymentRequest) accountValidation).getCipherInfo().getId();
            } else {
                id = accountValidation instanceof EncryptedData.PaymentStatus ? ((EncryptedData.PaymentStatus) accountValidation).getCipherInfo().getId() : null;
            }
            objM5535constructorimpl = Result.m5535constructorimpl(id);
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            objM5535constructorimpl = Result.m5535constructorimpl(ResultKt.createFailure(th2));
        }
        String str4 = (String) (Result.m5540isFailureimpl(objM5535constructorimpl) ? null : objM5535constructorimpl);
        if (str4 == null) {
            str4 = "";
        }
        jsonObject.addProperty("folioCr", str4);
        jsonObject.addProperty("content", str3);
        jsonObject.addProperty("timestamp", Long.valueOf(this.f35345b.getMillisTime()));
        BanxicoUnifiedLogEventDelegateKt.access$storeEvent(this.f35344a, BanxicoConstants.KEY_BANXICO_PUSH_UNIFIED_LOG_EVENT, jsonObject);
    }

    @Override // com.bbva.notifications.delegate.LogEventDelegate
    public void storeInformPushAction(@NotNull String method) {
        Intrinsics.checkNotNullParameter(method, "method");
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("action", "INFORMAR");
        jsonObject.addProperty("method", method);
        jsonObject.addProperty("timestamp", Long.valueOf(this.f35345b.getMillisTime()));
        BanxicoUnifiedLogEventDelegateKt.access$storeEvent(this.f35344a, BanxicoConstants.KEY_BANXICO_PUSH_UNIFIED_LOG_EVENT, jsonObject);
    }

    @Override // com.bbva.notifications.delegate.LogEventDelegate
    public void storeSelectPushAction(@Nullable HashMap<String, Object> notificationMap) {
        a("SELECCIONAR", notificationMap);
    }

    @Override // com.bbva.notifications.delegate.LogEventDelegate
    public void storeVisualizePushAction(@Nullable HashMap<String, Object> notificationMap) {
        a("VISUALIZAR", notificationMap);
    }

    public /* synthetic */ BanxicoUnifiedLogEventDelegate(MainStorage mainStorage, TimeProvider timeProvider, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(mainStorage, (i10 & 2) != 0 ? new TimeProvider() : timeProvider);
    }
}

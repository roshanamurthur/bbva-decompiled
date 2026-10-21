package com.bbva.notifications.extensions;

import android.util.Base64;
import com.bbva.notifications.DeepLinkConstants;
import com.bbva.notifications.activity.NotificationNoCommercialActivity;
import com.bbva.notifications.model.NotificationNoCommercialDataKt;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: HashMapExtensions.kt */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001aR\u0010\u0004\u001a&\u0012\u0004\u0012\u00020\u0001\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\u0000j\u0012\u0012\u0004\u0012\u00020\u0001\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u0001`\u0003*&\u0012\u0004\u0012\u00020\u0001\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0018\u00010\u0000j\u0012\u0012\u0004\u0012\u00020\u0001\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0018\u0001`\u0003\u001a.\u0010\u0005\u001a\u00020\u0001*&\u0012\u0004\u0012\u00020\u0001\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\u0000j\u0012\u0012\u0004\u0012\u00020\u0001\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u0001`\u0003¨\u0006\u0006"}, d2 = {"Ljava/util/HashMap;", "", "", "Lkotlin/collections/HashMap;", "getNotification", "toJsonBase64", "Notifications_mexicoRelease"}, k = 2, mv = {1, 9, 0})
public final class HashMapExtensionsKt {
    /* JADX WARN: Multi-variable type inference failed */
    @Nullable
    public static final HashMap<String, String> getNotification(@Nullable HashMap<String, Object> map) {
        HashMap map2 = null;
        Object obj = map != null ? map.get(NotificationNoCommercialActivity.NOTIFICATION_INTENT_DATA) : null;
        HashMap<String, String> map3 = obj instanceof HashMap ? (HashMap) obj : null;
        if (map3 != null) {
            return map3;
        }
        if (map == null) {
            map = null;
        }
        if (map != null && map.containsKey(DeepLinkConstants.INSTANCE.getDEEPLINK_NOTIFICATION())) {
            map2 = map;
        }
        return map2;
    }

    @NotNull
    public static final String toJsonBase64(@Nullable HashMap<String, String> map) {
        Object objM5535constructorimpl;
        byte[] bytes;
        String jsonString;
        try {
            Result.Companion companion = Result.INSTANCE;
            if (map == null || (jsonString = NotificationNoCommercialDataKt.toJsonString(map)) == null) {
                bytes = null;
            } else {
                bytes = jsonString.getBytes(Charsets.UTF_8);
                Intrinsics.checkNotNullExpressionValue(bytes, "this as java.lang.String).getBytes(charset)");
            }
            objM5535constructorimpl = Result.m5535constructorimpl(Base64.encodeToString(bytes, 2));
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            objM5535constructorimpl = Result.m5535constructorimpl(ResultKt.createFailure(th2));
        }
        String str = (String) (Result.m5540isFailureimpl(objM5535constructorimpl) ? null : objM5535constructorimpl);
        return str == null ? "" : str;
    }
}

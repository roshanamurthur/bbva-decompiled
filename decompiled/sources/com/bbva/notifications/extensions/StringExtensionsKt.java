package com.bbva.notifications.extensions;

import com.bbva.notifications.model.NotificationNoCommercialData;
import com.bbva.notifications.model.NotificationNoCommercialDataKt;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: StringExtensions.kt */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u000b\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u001a\u0014\u0010\u0000\u001a\u00020\u0001*\u0004\u0018\u00010\u00022\u0006\u0010\u0003\u001a\u00020\u0002\u001a\u000e\u0010\u0004\u001a\u0004\u0018\u00010\u0005*\u0004\u0018\u00010\u0002¨\u0006\u0006"}, d2 = {"isTargetEvent", "", "", "targetValue", "toNotificationNoCommercialData", "Lcom/bbva/notifications/model/NotificationNoCommercialData;", "Notifications_mexicoRelease"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class StringExtensionsKt {
    public static final boolean isTargetEvent(@Nullable String str, @NotNull String targetValue) {
        Intrinsics.checkNotNullParameter(targetValue, "targetValue");
        if (str != null) {
            return StringsKt__StringsKt.contains$default((CharSequence) str, (CharSequence) targetValue, false, 2, (Object) null);
        }
        return false;
    }

    @Nullable
    public static final NotificationNoCommercialData toNotificationNoCommercialData(@Nullable String str) {
        HashMap<String, String> mapJsonStringToHashMap;
        if (str == null || (mapJsonStringToHashMap = com.bbva.glomohybrid.base.extensions.StringExtensionsKt.jsonStringToHashMap(str)) == null) {
            return null;
        }
        return NotificationNoCommercialDataKt.toNotificationNoCommercialData(mapJsonStringToHashMap);
    }
}

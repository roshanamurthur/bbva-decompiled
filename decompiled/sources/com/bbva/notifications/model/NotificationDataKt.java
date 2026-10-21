package com.bbva.notifications.model;

import com.bbva.notifications.constants.PushConstants;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: NotificationData.kt */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0016\u0010\u0003\u001a\u00020\u0002*\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00010\u0000¨\u0006\u0004"}, d2 = {"", "", "Lcom/bbva/notifications/model/NotificationData;", "toNotificationData", "Notifications_mexicoRelease"}, k = 2, mv = {1, 9, 0})
public final class NotificationDataKt {
    @NotNull
    public static final NotificationData toNotificationData(@NotNull Map<String, String> map) {
        List listEmptyList;
        String strReplace;
        List listSplit$default;
        Intrinsics.checkNotNullParameter(map, "<this>");
        String str = map.get("title");
        String str2 = str == null ? "" : str;
        String str3 = map.get("body_loc_args");
        if (str3 == null || (strReplace = new Regex("[\"\\[\\]]").replace(str3, "")) == null || (listSplit$default = StringsKt__StringsKt.split$default((CharSequence) strReplace, new String[]{","}, false, 0, 6, (Object) null)) == null || (listEmptyList = CollectionsKt___CollectionsKt.toList(listSplit$default)) == null) {
            listEmptyList = CollectionsKt__CollectionsKt.emptyList();
        }
        List list = listEmptyList;
        String str4 = map.get("body_loc_key");
        String str5 = str4 == null ? "" : str4;
        String str6 = map.get(PushConstants.CLICK_ACTION);
        String str7 = str6 == null ? "" : str6;
        boolean zAreEqual = Intrinsics.areEqual(map.get("content_available"), "true");
        String str8 = map.get("content");
        if (str8 == null) {
            str8 = "";
        }
        return new NotificationData(str2, list, str5, str7, zAreEqual, str8);
    }
}

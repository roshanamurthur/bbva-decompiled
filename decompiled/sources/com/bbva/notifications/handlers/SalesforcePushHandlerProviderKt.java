package com.bbva.notifications.handlers;

import com.bbva.notifications.NotificationConstants;
import kotlin.Metadata;
import kotlin.text.l;

/* JADX INFO: compiled from: SalesforcePushHandlerProvider.kt */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"Notifications_mexicoRelease"}, k = 2, mv = {1, 9, 0})
public final class SalesforcePushHandlerProviderKt {
    public static final boolean access$isUrl(String str) {
        return l.equals$default(str, "url", false, 2, null) || l.equals$default(str, NotificationConstants.APPSFLYER_SUBTYPE, false, 2, null);
    }
}

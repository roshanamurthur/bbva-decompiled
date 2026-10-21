package com.bbva.document.scanner.plugin.model;

import com.bbva.document.scanner.NotificationConfig;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: NotificationParam.kt */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u0004\u0018\u00010\u0002H\u0000¨\u0006\u0003"}, d2 = {"toNotificationConfig", "Lcom/bbva/document/scanner/NotificationConfig;", "Lcom/bbva/document/scanner/plugin/model/NotificationParam;", "document-scanner-plugin_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class NotificationParamKt {
    @Nullable
    public static final NotificationConfig toNotificationConfig(@Nullable NotificationParam notificationParam) {
        if (notificationParam != null) {
            return new NotificationConfig(notificationParam.getText(), notificationParam.getDuration());
        }
        return null;
    }
}

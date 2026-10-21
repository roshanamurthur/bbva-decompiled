package com.salesforce.marketingcloud.analytics;

import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import com.salesforce.marketingcloud.notifications.NotificationMessage;

/* JADX INFO: loaded from: classes11.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY})
public interface j {
    void a(@NonNull NotificationMessage notificationMessage);

    void a(@NonNull NotificationMessage notificationMessage, boolean z10);

    void b(@NonNull NotificationMessage notificationMessage);
}

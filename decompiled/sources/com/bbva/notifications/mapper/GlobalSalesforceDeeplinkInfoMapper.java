package com.bbva.notifications.mapper;

import com.bbva.notifications.NotificationConstants;
import com.bbva.notifications.model.SalesforceDeeplinkInfo;
import com.salesforce.marketingcloud.notifications.NotificationMessage;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: SalesforceDeeplinkInfoMapper.kt */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016¨\u0006\u0007"}, d2 = {"Lcom/bbva/notifications/mapper/GlobalSalesforceDeeplinkInfoMapper;", "Lcom/bbva/notifications/mapper/SalesforceDeeplinkInfoMapper;", "()V", "map", "Lcom/bbva/notifications/model/SalesforceDeeplinkInfo;", "notificationMessage", "Lcom/salesforce/marketingcloud/notifications/NotificationMessage;", "Notifications_mexicoRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class GlobalSalesforceDeeplinkInfoMapper implements SalesforceDeeplinkInfoMapper {
    @Override // com.bbva.notifications.mapper.SalesforceDeeplinkInfoMapper
    @NotNull
    public SalesforceDeeplinkInfo map(@NotNull NotificationMessage notificationMessage) {
        Intrinsics.checkNotNullParameter(notificationMessage, "notificationMessage");
        String str = notificationMessage.customKeys().get(NotificationConstants.SALESFORCE_UNIVERSAL);
        if (str == null) {
            str = notificationMessage.customKeys().get(NotificationConstants.SALESFORCE_ORIGIN_ID);
        }
        String str2 = notificationMessage.customKeys().get(NotificationConstants.SALESFORCE_ORIGIN_ID);
        return new SalesforceDeeplinkInfo(str, notificationMessage.customKeys().get(NotificationConstants.SALESFORCE_URL_LANDING), !(str2 == null || str2.length() == 0));
    }
}

package com.bbva.notifications.mapper;

import com.bbva.glomohybrid.mobilepayment.lib.handler.PaymentsNotificationHandler;
import com.bbva.notifications.NotificationConstants;
import com.bbva.notifications.model.SalesforceDeeplinkInfo;
import com.salesforce.marketingcloud.notifications.NotificationMessage;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.l;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: CountrySalesforceDeeplinkInfoMapper.kt */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u00072\u00020\u0001:\u0001\u0007B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016¨\u0006\b"}, d2 = {"Lcom/bbva/notifications/mapper/CountrySalesforceDeeplinkInfoMapper;", "Lcom/bbva/notifications/mapper/SalesforceDeeplinkInfoMapper;", "()V", "map", "Lcom/bbva/notifications/model/SalesforceDeeplinkInfo;", "notificationMessage", "Lcom/salesforce/marketingcloud/notifications/NotificationMessage;", "Companion", "Notifications_mexicoRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nCountrySalesforceDeeplinkInfoMapper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CountrySalesforceDeeplinkInfoMapper.kt\ncom/bbva/notifications/mapper/CountrySalesforceDeeplinkInfoMapper\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,26:1\n1#2:27\n*E\n"})
public final class CountrySalesforceDeeplinkInfoMapper implements SalesforceDeeplinkInfoMapper {
    /* JADX WARN: Code duplicated, block: B:11:0x0033  */
    /* JADX WARN: Code duplicated, block: B:13:0x0041  */
    @Override // com.bbva.notifications.mapper.SalesforceDeeplinkInfoMapper
    @NotNull
    public SalesforceDeeplinkInfo map(@NotNull NotificationMessage notificationMessage) {
        Intrinsics.checkNotNullParameter(notificationMessage, "notificationMessage");
        String str = notificationMessage.customKeys().get(PaymentsNotificationHandler.PRODUCT_ID);
        String str2 = notificationMessage.customKeys().get(NotificationConstants.SALESFORCE_ORIGIN_ID);
        if (str == null) {
            str = notificationMessage.customKeys().get(NotificationConstants.SALESFORCE_UNIVERSAL);
            if (str == null) {
                str = str2;
            }
        } else {
            if (!(!l.isBlank(str)) || str2 == null || l.isBlank(str2)) {
                str = null;
            }
            if (str == null) {
                str = notificationMessage.customKeys().get(NotificationConstants.SALESFORCE_UNIVERSAL);
                if (str == null) {
                    str = str2;
                }
            }
        }
        boolean z10 = !(str2 == null || str2.length() == 0);
        String strUrl = notificationMessage.url();
        String str3 = true ^ (strUrl == null || l.isBlank(strUrl)) ? strUrl : null;
        if (str3 == null) {
            str3 = notificationMessage.customKeys().get(NotificationConstants.SALESFORCE_URL_LANDING);
        }
        return new SalesforceDeeplinkInfo(str, str3, z10);
    }
}

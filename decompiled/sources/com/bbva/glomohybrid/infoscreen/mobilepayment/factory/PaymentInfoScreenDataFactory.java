package com.bbva.glomohybrid.infoscreen.mobilepayment.factory;

import com.bbva.glomohybrid.infoscreen.R;
import com.bbva.glomohybrid.infoscreen.data.model.InfoScreenData;
import com.bbva.glomohybrid.infoscreen.data.model.InfoScreenStyle;
import com.bbva.glomohybrid.mobilepayment.commons.model.PaymentInfoType;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: PaymentInfoScreenDataFactory.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¨\u0006\b"}, d2 = {"Lcom/bbva/glomohybrid/infoscreen/mobilepayment/factory/PaymentInfoScreenDataFactory;", "", "", "type", "Lcom/bbva/glomohybrid/infoscreen/data/model/InfoScreenData;", "getData", "<init>", "()V", "info-modal_mexicoRelease"}, k = 1, mv = {1, 9, 0})
public final class PaymentInfoScreenDataFactory {

    @NotNull
    public static final PaymentInfoScreenDataFactory INSTANCE = new PaymentInfoScreenDataFactory();

    @NotNull
    public final InfoScreenData getData(@Nullable String type) {
        if (Intrinsics.areEqual(type, PaymentInfoType.SUCCESS.getType())) {
            return new InfoScreenData(R.drawable.ill_success, R.string.mobile_payment_info_notification_screen_toolbar_title, R.string.mobile_payment_info_notification_screen_title_success, R.string.mobile_payment_info_notification_screen_description_success, R.string.mobile_payment_info_notification_screen_positive_button, null, InfoScreenStyle.InfoScreenStyleWhite.INSTANCE, 32, null);
        }
        if (Intrinsics.areEqual(type, PaymentInfoType.ERROR.getType())) {
            return new InfoScreenData(R.drawable.ic_warning_illus, R.string.mobile_payment_info_notification_screen_toolbar_title, R.string.mobile_payment_info_notification_screen_title_error, R.string.mobile_payment_info_notification_screen_description_error, R.string.mobile_payment_info_notification_screen_positive_button, null, InfoScreenStyle.InfoScreenStyleWhite.INSTANCE, 32, null);
        }
        if (Intrinsics.areEqual(type, PaymentInfoType.NOT_DEFAULT_CARD.getType())) {
            return new InfoScreenData(R.drawable.ill_withdraw_money_contactless, R.string.mobile_payment_info_notification_screen_toolbar_title, R.string.mobile_payment_info_notification_screen_title_card, R.string.mobile_payment_info_notification_screen_description_card, R.string.mobile_payment_info_notification_screen_insecure_button, null, InfoScreenStyle.InfoScreenStyleWhite.INSTANCE, 32, null);
        }
        if (Intrinsics.areEqual(type, PaymentInfoType.TOKENS_NOT_PRESENT.getType())) {
            return new InfoScreenData(R.drawable.ill_withdraw_money_contactless, R.string.mobile_payment_info_notification_screen_toolbar_title, R.string.mobile_payment_info_notification_screen_title_tokens, R.string.mobile_payment_info_notification_screen_description_tokens, R.string.mobile_payment_info_notification_screen_insecure_button, null, InfoScreenStyle.InfoScreenStyleWhite.INSTANCE, 32, null);
        }
        if (Intrinsics.areEqual(type, PaymentInfoType.INSECURE_DEVICE.getType())) {
            return new InfoScreenData(R.drawable.ill_acces_method, R.string.mobile_payment_info_notification_screen_toolbar_title, R.string.mobile_payment_info_notification_screen_insecure_device_title, R.string.mobile_payment_info_notification_screen_insecure_device_descriptions, R.string.mobile_payment_info_notification_screen_insecure_button, null, InfoScreenStyle.InfoScreenStyleWhite.INSTANCE, 32, null);
        }
        if (Intrinsics.areEqual(type, PaymentInfoType.AUTHENTICATION_REQUIRED.getType())) {
            return new InfoScreenData(R.drawable.ill_acces_method, R.string.mobile_payment_info_notification_screen_toolbar_title, R.string.mobile_payment_info_notification_screen_authentication_device_title, R.string.mobile_payment_info_notification_screen_authentication_device_descriptions, R.string.mobile_payment_info_notification_screen_authentication_button, null, InfoScreenStyle.InfoScreenStyleWhite.INSTANCE, 32, null);
        }
        return Intrinsics.areEqual(type, PaymentInfoType.AUTHENTICATED.getType()) ? new InfoScreenData(R.drawable.ill_withdraw_money_contactless, R.string.mobile_payment_info_notification_screen_toolbar_title, R.string.mobile_payment_info_notification_screen_authenticated_device_title, R.string.mobile_payment_info_notification_screen_authenticated_device_descriptions, R.string.mobile_payment_info_notification_screen_authenticated_button, null, InfoScreenStyle.InfoScreenStyleWhite.INSTANCE, 32, null) : new InfoScreenData(R.drawable.ic_warning_illus, R.string.mobile_payment_info_notification_screen_toolbar_title, R.string.mobile_payment_info_notification_screen_title_error, R.string.mobile_payment_info_notification_screen_description_error, R.string.mobile_payment_info_notification_screen_positive_button, null, InfoScreenStyle.InfoScreenStyleWhite.INSTANCE, 32, null);
    }
}

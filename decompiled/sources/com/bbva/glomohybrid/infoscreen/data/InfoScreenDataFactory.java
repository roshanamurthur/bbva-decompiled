package com.bbva.glomohybrid.infoscreen.data;

import com.bbva.glomohybrid.infoscreen.R;
import com.bbva.glomohybrid.infoscreen.data.model.InfoScreenData;
import com.bbva.glomohybrid.infoscreen.data.model.InfoScreenStyle;
import com.bbva.glomohybrid.infoscreen.fragment.InfoScreenType;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: InfoScreenDataFactory.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¨\u0006\b"}, d2 = {"Lcom/bbva/glomohybrid/infoscreen/data/InfoScreenDataFactory;", "", "Lcom/bbva/glomohybrid/infoscreen/fragment/InfoScreenType;", "type", "Lcom/bbva/glomohybrid/infoscreen/data/model/InfoScreenData;", "getData", "<init>", "()V", "info-modal_mexicoRelease"}, k = 1, mv = {1, 9, 0})
public final class InfoScreenDataFactory {

    @NotNull
    public static final InfoScreenDataFactory INSTANCE = new InfoScreenDataFactory();

    @NotNull
    public final InfoScreenData getData(@NotNull InfoScreenType type) {
        Intrinsics.checkNotNullParameter(type, "type");
        if (Intrinsics.areEqual(type, InfoScreenType.StandardInfoScreen.INSTANCE)) {
            return new InfoScreenData(R.drawable.ic_warning_illus, R.string.error_standard_screen_toolbar_title, R.string.error_standard_screen_title, R.string.error_standard_screen_description, R.string.action_close, null, InfoScreenStyle.InfoScreenStyleWhite.INSTANCE, 32, null);
        }
        if (Intrinsics.areEqual(type, InfoScreenType.NetworkInfoScreen.INSTANCE)) {
            return new InfoScreenData(R.drawable.ill_error_no_connection, R.string.error_screen_no_connection_toolbar_title, R.string.error_screen_no_connection_title, R.string.error_screen_no_connection_description, R.string.error_screen_no_connection_positive_button, Integer.valueOf(R.string.error_screen_no_connection_negative_button), null, 64, null);
        }
        if (Intrinsics.areEqual(type, InfoScreenType.RootRestrictedScreen.INSTANCE)) {
            return new InfoScreenData(R.drawable.ill_error_rooted, R.string.error_root_screen_toolbar_title, R.string.error_root_screen_title, R.string.error_root_screen_description, R.string.error_root_screen_negative_button, null, null, 96, null);
        }
        if (Intrinsics.areEqual(type, InfoScreenType.RootNotRestrictedScreen.INSTANCE)) {
            return new InfoScreenData(R.drawable.ill_error_rooted, R.string.error_not_restrictive_root_screen_toolbar_title, R.string.error_not_restrictive_root_screen_title, R.string.error_not_restrictive_root_screen_description, R.string.error_not_restrictive_root_screen_positive_button, Integer.valueOf(R.string.error_not_restrictive_root_screen_negative_button), null, 64, null);
        }
        if (Intrinsics.areEqual(type, InfoScreenType.NotificationErrorInfoScreen.INSTANCE)) {
            return new InfoScreenData(R.drawable.ic_warning_illus, R.string.error_notification_screen_toolbar_title, R.string.error_notification_screen_title, R.string.error_notification_screen_description, R.string.action_close, null, InfoScreenStyle.InfoScreenStyleWhite.INSTANCE, 32, null);
        }
        if (Intrinsics.areEqual(type, InfoScreenType.DeviceActivationInfoScreen.INSTANCE)) {
            return new InfoScreenData(R.drawable.ic_warning_status, R.string.device_activation_toolbar_title, R.string.device_activation_title, R.string.device_activation_message, R.string.device_activation_positive_button, null, InfoScreenStyle.InfoScreenStyleWhite.INSTANCE, 32, null);
        }
        if (Intrinsics.areEqual(type, InfoScreenType.TimerExpiredForegroundStateErrorInfoScreen.INSTANCE)) {
            return new InfoScreenData(R.drawable.ic_warning_info, R.string.error_notification_timer_expired_foreground_toolbar_title, R.string.error_notification_timer_expired_foreground_title, R.string.error_notification_timer_expired_foreground_message, R.string.action_close, null, null, 96, null);
        }
        if (Intrinsics.areEqual(type, InfoScreenType.TimerExpiredRunningStateErrorInfoScreen.INSTANCE)) {
            return new InfoScreenData(R.drawable.ic_warning_info, R.string.error_notification_timer_expired_running_toolbar_title, R.string.error_notification_timer_expired_running_title, R.string.error_notification_timer_expired_running_message, R.string.action_close, null, null, 96, null);
        }
        throw new NoWhenBranchMatchedException();
    }
}

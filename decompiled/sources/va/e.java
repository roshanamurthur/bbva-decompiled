package va;

import com.bbva.notifications.activity.NotificationNoCommercialActivity;
import com.bbva.notifications.adapter.NotificationAdapter;
import com.bbva.notifications.model.NotificationNoCommercialData;
import com.bbva.notifications.model.NotificationView;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: compiled from: NotificationNoCommercialActivity.kt */
/* JADX INFO: loaded from: classes7.dex */
public final class e extends Lambda implements Function1<NotificationView, Unit> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ NotificationNoCommercialActivity f94004p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(NotificationNoCommercialActivity notificationNoCommercialActivity) {
        super(1);
        this.f94004p0 = notificationNoCommercialActivity;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(NotificationView notificationView) {
        NotificationView notificationView2 = notificationView;
        NotificationNoCommercialData header = notificationView2.getHeader();
        NotificationNoCommercialActivity notificationNoCommercialActivity = this.f94004p0;
        NotificationNoCommercialActivity.access$setNotificationHeader(notificationNoCommercialActivity, header);
        ((NotificationAdapter) notificationNoCommercialActivity.f35305x0.getValue()).setNotificationsList$Notifications_mexicoRelease(notificationView2.getNotificationDetailList());
        Intrinsics.checkNotNull(notificationView2);
        NotificationNoCommercialActivity.access$updateTimerView(notificationNoCommercialActivity, notificationView2);
        NotificationNoCommercialActivity.access$setNotificationShortcutActions(notificationNoCommercialActivity, notificationView2.getShortcutsAction());
        return Unit.INSTANCE;
    }
}

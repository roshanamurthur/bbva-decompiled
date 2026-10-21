package va;

import com.bbva.glomohybrid.infoscreen.fragment.InfoScreenType;
import com.bbva.notifications.activity.NotificationNoCommercialActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: compiled from: NotificationNoCommercialActivity.kt */
/* JADX INFO: loaded from: classes7.dex */
public final class c extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ NotificationNoCommercialActivity f94000p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(NotificationNoCommercialActivity notificationNoCommercialActivity) {
        super(0);
        this.f94000p0 = notificationNoCommercialActivity;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        NotificationNoCommercialActivity.access$showTimerExpiredErrorScreen(this.f94000p0, InfoScreenType.TimerExpiredRunningStateErrorInfoScreen.INSTANCE);
        return Unit.INSTANCE;
    }
}

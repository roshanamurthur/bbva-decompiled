package va;

import com.bbva.glomohybrid.base.models.common.Event;
import com.bbva.glomohybrid.base.router.ActivityRouter;
import com.bbva.glomohybrid.base.router.Route;
import com.bbva.notifications.activity.NotificationNoCommercialActivity;
import com.bbva.notifications.model.EventDialer;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: compiled from: NotificationNoCommercialActivity.kt */
/* JADX INFO: loaded from: classes7.dex */
public final class g extends Lambda implements Function1<Event<? extends Route>, Unit> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ NotificationNoCommercialActivity f94006p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(NotificationNoCommercialActivity notificationNoCommercialActivity) {
        super(1);
        this.f94006p0 = notificationNoCommercialActivity;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Event<? extends Route> event) {
        Event<? extends Route> event2 = event;
        boolean z10 = event2 instanceof EventDialer;
        NotificationNoCommercialActivity notificationNoCommercialActivity = this.f94006p0;
        if (z10) {
            Route contentIfNotHandled = event2.getContentIfNotHandled();
            String route = contentIfNotHandled != null ? contentIfNotHandled.getRoute() : null;
            if (route == null) {
                route = "";
            }
            ((ActivityRouter) notificationNoCommercialActivity.f35301s0.getValue()).launchDialer(route);
        } else {
            NotificationNoCommercialActivity.access$setIsLoading(notificationNoCommercialActivity, false);
            Route contentIfNotHandled2 = event2.getContentIfNotHandled();
            if (contentIfNotHandled2 != null) {
                ActivityRouter.DefaultImpls.navigateTo$default(NotificationNoCommercialActivity.access$getActivityRouter(notificationNoCommercialActivity), contentIfNotHandled2.getRoute(), contentIfNotHandled2.getAnimation(), null, contentIfNotHandled2.getParcel(), 4, null);
                notificationNoCommercialActivity.finish();
            }
        }
        return Unit.INSTANCE;
    }
}

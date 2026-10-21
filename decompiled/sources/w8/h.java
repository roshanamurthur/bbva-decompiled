package w8;

import com.bbva.glomohybrid.base.models.common.Event;
import com.bbva.glomohybrid.base.router.ActivityRouter;
import com.bbva.glomohybrid.base.router.Route;
import com.bbva.glomohybrid.infoscreen.InfoScreenNoCellsActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: compiled from: InfoScreenNoCellsActivity.kt */
/* JADX INFO: loaded from: classes6.dex */
public final class h extends Lambda implements Function1<Event<? extends Route>, Unit> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ InfoScreenNoCellsActivity f94188p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(InfoScreenNoCellsActivity infoScreenNoCellsActivity) {
        super(1);
        this.f94188p0 = infoScreenNoCellsActivity;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Event<? extends Route> event) {
        Route contentIfNotHandled = event.getContentIfNotHandled();
        if (contentIfNotHandled != null) {
            InfoScreenNoCellsActivity infoScreenNoCellsActivity = this.f94188p0;
            ActivityRouter.DefaultImpls.navigateTo$default(InfoScreenNoCellsActivity.access$getActivityRouter(infoScreenNoCellsActivity), contentIfNotHandled.getRoute(), contentIfNotHandled.getAnimation(), null, contentIfNotHandled.getParcel(), 4, null);
            infoScreenNoCellsActivity.finish();
        }
        return Unit.INSTANCE;
    }
}

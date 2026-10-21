package w8;

import com.bbva.glomohybrid.base.models.common.Event;
import com.bbva.glomohybrid.base.router.ActivityRouter;
import com.bbva.glomohybrid.base.router.Route;
import com.bbva.glomohybrid.infoscreen.InfoScreenActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: compiled from: InfoScreenActivity.kt */
/* JADX INFO: loaded from: classes6.dex */
public final class d extends Lambda implements Function1<Event<? extends Route>, Unit> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ InfoScreenActivity f94183p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(InfoScreenActivity infoScreenActivity) {
        super(1);
        this.f94183p0 = infoScreenActivity;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Event<? extends Route> event) {
        Event<? extends Route> it = event;
        Intrinsics.checkNotNullParameter(it, "it");
        Route contentIfNotHandled = it.getContentIfNotHandled();
        if (contentIfNotHandled != null) {
            InfoScreenActivity infoScreenActivity = this.f94183p0;
            ActivityRouter.DefaultImpls.navigateTo$default(InfoScreenActivity.access$getActivityRouter(infoScreenActivity), contentIfNotHandled.getRoute(), contentIfNotHandled.getAnimation(), null, contentIfNotHandled.getParcel(), 4, null);
            infoScreenActivity.finish();
        }
        return Unit.INSTANCE;
    }
}

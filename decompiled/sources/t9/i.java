package t9;

import com.bbva.glomohybrid.base.models.common.Event;
import com.bbva.glomohybrid.base.router.ActivityRouter;
import com.bbva.glomohybrid.base.router.Route;
import com.bbva.glomohybrid.login.presentation.view.LoginActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: compiled from: LoginActivity.kt */
/* JADX INFO: loaded from: classes6.dex */
public final class i extends Lambda implements Function1<Event<? extends Route>, Unit> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ LoginActivity f93487p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(LoginActivity loginActivity) {
        super(1);
        this.f93487p0 = loginActivity;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Event<? extends Route> event) {
        Route contentIfNotHandled = event.getContentIfNotHandled();
        if (contentIfNotHandled != null) {
            ActivityRouter.DefaultImpls.navigateTo$default(LoginActivity.access$getActivityRouter(this.f93487p0), contentIfNotHandled.getRoute(), contentIfNotHandled.getAnimation(), null, contentIfNotHandled.getParcel(), 4, null);
        }
        return Unit.INSTANCE;
    }
}

package k8;

import com.bbva.glomohybrid.base.models.common.Event;
import com.bbva.glomohybrid.base.router.Router;
import com.bbva.glomohybrid.cellsweb.presentation.CellsWebContract;
import com.bbva.glomohybrid.cellsweb.presentation.view.CellsWebActivity;
import com.bbva.glomohybrid.cellsweb.presentation.view.ModalsView;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: compiled from: CellsWebActivity.kt */
/* JADX INFO: loaded from: classes6.dex */
public final class e extends Lambda implements Function1<Event<? extends CellsWebContract.Event>, Unit> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ CellsWebActivity f79249p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(CellsWebActivity cellsWebActivity) {
        super(1);
        this.f79249p0 = cellsWebActivity;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Event<? extends CellsWebContract.Event> event) {
        CellsWebContract.Event contentIfNotHandled;
        ModalsView modalsViewAccess$getSingleAppModalsView;
        Event<? extends CellsWebContract.Event> event2 = event;
        if (event2 != null && (contentIfNotHandled = event2.getContentIfNotHandled()) != null) {
            CellsWebActivity cellsWebActivity = this.f79249p0;
            if (contentIfNotHandled instanceof CellsWebContract.Event.NativeNavigation) {
                CellsWebContract.Event.NativeNavigation nativeNavigation = (CellsWebContract.Event.NativeNavigation) contentIfNotHandled;
                Router.navigate$default(CellsWebActivity.access$getRouter(cellsWebActivity), cellsWebActivity, nativeNavigation.getRoute().getRoute(), nativeNavigation.getRoute().getAnimation(), null, null, true, 24, null);
            } else if (contentIfNotHandled instanceof CellsWebContract.Event.OpenDialer) {
                CellsWebActivity.access$getActivityRouter(cellsWebActivity).launchDialer(((CellsWebContract.Event.OpenDialer) contentIfNotHandled).getPhone());
            } else if ((contentIfNotHandled instanceof CellsWebContract.Event.ShowModal) && (modalsViewAccess$getSingleAppModalsView = CellsWebActivity.access$getSingleAppModalsView(cellsWebActivity)) != null) {
                modalsViewAccess$getSingleAppModalsView.show(((CellsWebContract.Event.ShowModal) contentIfNotHandled).getModal());
            }
        }
        return Unit.INSTANCE;
    }
}

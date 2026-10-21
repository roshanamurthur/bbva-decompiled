package k8;

import com.bbva.glomohybrid.cellsweb.presentation.view.CellsWebActivity;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: compiled from: CellsWebActivity.kt */
/* JADX INFO: loaded from: classes6.dex */
public final class c extends Lambda implements Function1<Pair<? extends Integer, ? extends Boolean>, Unit> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ CellsWebActivity f79245p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(CellsWebActivity cellsWebActivity) {
        super(1);
        this.f79245p0 = cellsWebActivity;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Pair<? extends Integer, ? extends Boolean> pair) {
        Pair<? extends Integer, ? extends Boolean> pair2 = pair;
        CellsWebActivity cellsWebActivity = this.f79245p0;
        CellsWebActivity.access$getBinding(cellsWebActivity).slideMenuViewDashboard.featureItem(pair2.getFirst().intValue(), pair2.getSecond().booleanValue());
        CellsWebActivity.access$computeFeaturedMenuIcon(cellsWebActivity);
        return Unit.INSTANCE;
    }
}

package k8;

import com.bbva.glomohybrid.cellsweb.presentation.view.CellsWebActivity;
import com.bbva.slidemenuview.domain.model.UserMenu;
import com.bbva.slidemenuview.extensions.MenuExtensionsKt;
import com.bbva.slidemenuview.presentation.SlideMenuViewContract;
import com.bbva.ui.component.menu.SlideMenuView;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import org.koin.android.ext.android.AndroidKoinScopeExtKt;
import org.koin.core.qualifier.QualifierKt;

/* JADX INFO: compiled from: CellsWebActivity.kt */
/* JADX INFO: loaded from: classes6.dex */
@SourceDebugExtension({"SMAP\nCellsWebActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CellsWebActivity.kt\ncom/bbva/glomohybrid/cellsweb/presentation/view/CellsWebActivity$setupObservers$2\n+ 2 ComponentCallbackExt.kt\norg/koin/android/ext/android/ComponentCallbackExtKt\n+ 3 Scope.kt\norg/koin/core/scope/Scope\n*L\n1#1,233:1\n52#2,5:234\n133#3:239\n*S KotlinDebug\n*F\n+ 1 CellsWebActivity.kt\ncom/bbva/glomohybrid/cellsweb/presentation/view/CellsWebActivity$setupObservers$2\n*L\n115#1:234,5\n115#1:239\n*E\n"})
public final class b extends Lambda implements Function1<UserMenu, Unit> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ CellsWebActivity f79244p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(CellsWebActivity cellsWebActivity) {
        super(1);
        this.f79244p0 = cellsWebActivity;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(UserMenu userMenu) {
        UserMenu userMenu2 = userMenu;
        CellsWebActivity cellsWebActivity = this.f79244p0;
        SlideMenuView slideMenuViewDashboard = CellsWebActivity.access$getBinding(cellsWebActivity).slideMenuViewDashboard;
        Intrinsics.checkNotNullExpressionValue(slideMenuViewDashboard, "slideMenuViewDashboard");
        SlideMenuViewContract slideMenuViewContractAccess$getMenuViewContract = CellsWebActivity.access$getMenuViewContract(cellsWebActivity);
        Intrinsics.checkNotNull(userMenu2);
        MenuExtensionsKt.updateMenu(slideMenuViewDashboard, slideMenuViewContractAccess$getMenuViewContract, userMenu2, (List) AndroidKoinScopeExtKt.getKoinScope(cellsWebActivity).get(Reflection.getOrCreateKotlinClass(List.class), QualifierKt.named(userMenu2.getUserType()), null));
        CellsWebActivity.access$computeFeaturedMenuIcon(cellsWebActivity);
        return Unit.INSTANCE;
    }
}

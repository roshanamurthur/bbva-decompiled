package ic;

import com.bbva.ui.component.menu.SlideMenuView;
import com.bbva.ui.component.menu.model.MenuItem;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: compiled from: SlideMenuView.kt */
/* JADX INFO: loaded from: classes9.dex */
public final class d extends Lambda implements Function1<MenuItem, Unit> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ SlideMenuView f69588p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(SlideMenuView slideMenuView) {
        super(1);
        this.f69588p0 = slideMenuView;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(MenuItem menuItem) {
        MenuItem menuItem2 = menuItem;
        Intrinsics.checkNotNullParameter(menuItem2, "menuItem");
        boolean isCheckable = menuItem2.getIsCheckable();
        SlideMenuView slideMenuView = this.f69588p0;
        if (isCheckable) {
            slideMenuView.getHeaderMenuItemView().setChecked(false);
        }
        slideMenuView.f36940p0.onItemClick(menuItem2);
        return Unit.INSTANCE;
    }
}

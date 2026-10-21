package com.bbva.slidemenuview.presentation;

import android.content.Context;
import com.bbva.slidemenuview.domain.model.UserMenu;
import com.bbva.ui.component.menu.model.HeaderMenuItem;
import com.bbva.ui.component.menu.model.MenuItem;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: SlideMenuViewContract.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000b\n\u0000\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\u0004\u001a\u00020\u0005H&J \u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u000b2\u0006\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\f\u001a\u00020\rH&¨\u0006\u000e"}, d2 = {"Lcom/bbva/slidemenuview/presentation/SlideMenuViewContract;", "", "getHeaderMenuItem", "Lcom/bbva/ui/component/menu/model/HeaderMenuItem;", "context", "Landroid/content/Context;", "userMenu", "Lcom/bbva/slidemenuview/domain/model/UserMenu;", "getMenuFooterItem", "Lcom/bbva/ui/component/menu/model/MenuItem;", "getMenuItems", "", "isUserLogged", "", "slidemenuview_mexicoRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
public interface SlideMenuViewContract {

    /* JADX INFO: compiled from: SlideMenuViewContract.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class DefaultImpls {
        public static /* synthetic */ List getMenuItems$default(SlideMenuViewContract slideMenuViewContract, Context context, boolean z10, int i10, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getMenuItems");
            }
            if ((i10 & 2) != 0) {
                z10 = false;
            }
            return slideMenuViewContract.getMenuItems(context, z10);
        }
    }

    @NotNull
    HeaderMenuItem getHeaderMenuItem(@NotNull Context context, @NotNull UserMenu userMenu);

    @NotNull
    MenuItem getMenuFooterItem(@NotNull Context context);

    @NotNull
    List<MenuItem> getMenuItems(@NotNull Context context, boolean isUserLogged);
}

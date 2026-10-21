package com.bbva.slidemenuview.presentation.decorator;

import com.bbva.slidemenuview.domain.model.UserMenu;
import com.bbva.ui.component.menu.model.MenuItem;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: MenuDecorator.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J$\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0006\u001a\u00020\u0007H&¨\u0006\b"}, d2 = {"Lcom/bbva/slidemenuview/presentation/decorator/MenuDecorator;", "", "decorate", "", "Lcom/bbva/ui/component/menu/model/MenuItem;", "menuItems", "userMenu", "Lcom/bbva/slidemenuview/domain/model/UserMenu;", "slidemenuview_mexicoRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
public interface MenuDecorator {
    @NotNull
    List<MenuItem> decorate(@NotNull List<? extends MenuItem> menuItems, @NotNull UserMenu userMenu);
}

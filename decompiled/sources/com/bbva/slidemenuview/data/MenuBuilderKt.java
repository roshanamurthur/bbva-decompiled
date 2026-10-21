package com.bbva.slidemenuview.data;

import com.bbva.ui.component.menu.model.HeaderMenuItem;
import com.bbva.ui.component.menu.model.HeaderSubItem;
import com.bbva.ui.component.menu.model.MenuItem;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: MenuBuilder.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000.\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\u001f\u0010\u0000\u001a\u00020\u00012\u0017\u0010\u0002\u001a\u0013\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0002\b\u0006\u001a\u001f\u0010\u0007\u001a\u00020\b2\u0017\u0010\u0002\u001a\u0013\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0002\b\u0006\u001a\u001f\u0010\n\u001a\u00020\u000b2\u0017\u0010\u0002\u001a\u0013\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0002\b\u0006¨\u0006\r"}, d2 = {"headerMenuItem", "Lcom/bbva/ui/component/menu/model/HeaderMenuItem;", "block", "Lkotlin/Function1;", "Lcom/bbva/slidemenuview/data/HeaderMenuItemBuilder;", "", "Lkotlin/ExtensionFunctionType;", "headerSubItem", "Lcom/bbva/ui/component/menu/model/HeaderSubItem;", "Lcom/bbva/slidemenuview/data/HeaderSubItemBuilder;", "menuItem", "Lcom/bbva/ui/component/menu/model/MenuItem;", "Lcom/bbva/slidemenuview/data/MenuItemBuilder;", "slidemenuview_mexicoRelease"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class MenuBuilderKt {
    @NotNull
    public static final HeaderMenuItem headerMenuItem(@NotNull Function1<? super HeaderMenuItemBuilder, Unit> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        HeaderMenuItemBuilder headerMenuItemBuilder = new HeaderMenuItemBuilder();
        block.invoke(headerMenuItemBuilder);
        return headerMenuItemBuilder.build();
    }

    @NotNull
    public static final HeaderSubItem headerSubItem(@NotNull Function1<? super HeaderSubItemBuilder, Unit> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        HeaderSubItemBuilder headerSubItemBuilder = new HeaderSubItemBuilder();
        block.invoke(headerSubItemBuilder);
        return headerSubItemBuilder.build();
    }

    @NotNull
    public static final MenuItem menuItem(@NotNull Function1<? super MenuItemBuilder, Unit> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        MenuItemBuilder menuItemBuilder = new MenuItemBuilder();
        block.invoke(menuItemBuilder);
        return menuItemBuilder.build();
    }
}

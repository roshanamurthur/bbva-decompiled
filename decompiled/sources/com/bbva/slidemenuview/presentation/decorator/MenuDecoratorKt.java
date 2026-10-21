package com.bbva.slidemenuview.presentation.decorator;

import com.bbva.slidemenuview.domain.model.UserMenu;
import com.bbva.ui.component.menu.model.MenuItem;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: MenuDecorator.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u001a,\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u00012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, d2 = {"applyTo", "", "Lcom/bbva/ui/component/menu/model/MenuItem;", "Lcom/bbva/slidemenuview/presentation/decorator/MenuDecorator;", "menuItems", "userMenu", "Lcom/bbva/slidemenuview/domain/model/UserMenu;", "slidemenuview_mexicoRelease"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nMenuDecorator.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MenuDecorator.kt\ncom/bbva/slidemenuview/presentation/decorator/MenuDecoratorKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,24:1\n1789#2,3:25\n*S KotlinDebug\n*F\n+ 1 MenuDecorator.kt\ncom/bbva/slidemenuview/presentation/decorator/MenuDecoratorKt\n*L\n20#1:25,3\n*E\n"})
public final class MenuDecoratorKt {
    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    public static final List<MenuItem> applyTo(@NotNull List<? extends MenuDecorator> list, @NotNull List<? extends MenuItem> menuItems, @NotNull UserMenu userMenu) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        Intrinsics.checkNotNullParameter(menuItems, "menuItems");
        Intrinsics.checkNotNullParameter(userMenu, "userMenu");
        Iterator<T> it = list.iterator();
        List listDecorate = menuItems;
        while (it.hasNext()) {
            listDecorate = ((MenuDecorator) it.next()).decorate(listDecorate, userMenu);
        }
        return listDecorate;
    }
}

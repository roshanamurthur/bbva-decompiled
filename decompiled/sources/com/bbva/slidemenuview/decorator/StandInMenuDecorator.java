package com.bbva.slidemenuview.decorator;

import bk.q;
import com.bbva.glomohybrid.featureflags.repository.FeatureFlagRepositoryExtensionKt;
import com.bbva.glomohybrid.featureflags.repository.FeatureFlagsRepository;
import com.bbva.slidemenuview.MenuItemMap;
import com.bbva.slidemenuview.data.MenuItemStatesBuilder;
import com.bbva.slidemenuview.data.MenuState;
import com.bbva.slidemenuview.data.MenuType;
import com.bbva.slidemenuview.domain.model.UserMenu;
import com.bbva.slidemenuview.extensions.MenuExtensionsKt;
import com.bbva.slidemenuview.presentation.decorator.MenuDecorator;
import com.bbva.ui.component.menu.model.MenuItem;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: StandInMenuDecorator.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¨\u0006\f"}, d2 = {"Lcom/bbva/slidemenuview/decorator/StandInMenuDecorator;", "Lcom/bbva/slidemenuview/presentation/decorator/MenuDecorator;", "", "Lcom/bbva/ui/component/menu/model/MenuItem;", "menuItems", "Lcom/bbva/slidemenuview/domain/model/UserMenu;", "userMenu", "decorate", "Lcom/bbva/glomohybrid/featureflags/repository/FeatureFlagsRepository;", "featureFlagsRepository", "<init>", "(Lcom/bbva/glomohybrid/featureflags/repository/FeatureFlagsRepository;)V", "slidemenuview_mexicoRelease"}, k = 1, mv = {1, 9, 0})
@SourceDebugExtension({"SMAP\nStandInMenuDecorator.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StandInMenuDecorator.kt\ncom/bbva/slidemenuview/decorator/StandInMenuDecorator\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,46:1\n1855#2:47\n1856#2:49\n1#3:48\n*S KotlinDebug\n*F\n+ 1 StandInMenuDecorator.kt\ncom/bbva/slidemenuview/decorator/StandInMenuDecorator\n*L\n24#1:47\n24#1:49\n*E\n"})
public final class StandInMenuDecorator implements MenuDecorator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final FeatureFlagsRepository f36714a;

    public StandInMenuDecorator(@NotNull FeatureFlagsRepository featureFlagsRepository) {
        Intrinsics.checkNotNullParameter(featureFlagsRepository, "featureFlagsRepository");
        this.f36714a = featureFlagsRepository;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.bbva.slidemenuview.presentation.decorator.MenuDecorator
    @NotNull
    public List<MenuItem> decorate(@NotNull List<? extends MenuItem> menuItems, @NotNull UserMenu userMenu) {
        Intrinsics.checkNotNullParameter(menuItems, "menuItems");
        Intrinsics.checkNotNullParameter(userMenu, "userMenu");
        if (!FeatureFlagRepositoryExtensionKt.isStandInEnabled(this.f36714a) || userMenu.getMenuType() != MenuType.PRIVATE) {
            return menuItems;
        }
        ArrayList arrayList = new ArrayList();
        for (MenuItem menuItem : menuItems) {
            if (menuItem.getId() == MenuItemMap.Apps.getId() || menuItem.getId() == MenuItemMap.SmartToken.getId()) {
                arrayList.add(menuItem);
            } else {
                Pair[] pairArr = new Pair[3];
                Map<String, String> states = menuItem.getStates();
                pairArr[0] = TuplesKt.to(MenuItemStatesBuilder.USER_NO, states != null ? states.get(MenuItemStatesBuilder.USER_NO) : null);
                Map<String, String> states2 = menuItem.getStates();
                pairArr[1] = TuplesKt.to(MenuItemStatesBuilder.USER_CACHED, states2 != null ? states2.get(MenuItemStatesBuilder.USER_CACHED) : null);
                pairArr[2] = TuplesKt.to(MenuItemStatesBuilder.USER_LOGGED, MenuState.DISABLED.getState());
                Map mapMapOf = q.mapOf(pairArr);
                Intrinsics.checkNotNull(mapMapOf, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, @[State] kotlin.String>");
                arrayList.add(MenuExtensionsKt.copy$default(menuItem, 0, null, 0, null, false, mapMapOf, null, 95, null));
            }
        }
        return arrayList;
    }
}

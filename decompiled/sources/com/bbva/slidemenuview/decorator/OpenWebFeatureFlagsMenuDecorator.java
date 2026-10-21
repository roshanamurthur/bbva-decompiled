package com.bbva.slidemenuview.decorator;

import com.bbva.glomohybrid.featureflags.domain.model.FeatureFlags;
import com.bbva.glomohybrid.featureflags.repository.datasource.LocalDataSource;
import com.bbva.slidemenuview.MenuItemOpenWebFlagsConfig;
import com.bbva.slidemenuview.cells.components.dm.infraestructure.MenuIdentifierMapper;
import com.bbva.slidemenuview.domain.model.UserMenu;
import com.bbva.slidemenuview.presentation.decorator.MenuDecorator;
import com.bbva.ui.component.menu.model.MenuItem;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: OpenWebFeatureFlagsMenuDecorator.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\f¢\u0006\u0004\b\u0010\u0010\u0011J$\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¨\u0006\u0012"}, d2 = {"Lcom/bbva/slidemenuview/decorator/OpenWebFeatureFlagsMenuDecorator;", "Lcom/bbva/slidemenuview/presentation/decorator/MenuDecorator;", "", "Lcom/bbva/ui/component/menu/model/MenuItem;", "menuItems", "Lcom/bbva/slidemenuview/domain/model/UserMenu;", "userMenu", "decorate", "Lcom/bbva/glomohybrid/featureflags/repository/datasource/LocalDataSource;", "local", "Lcom/bbva/slidemenuview/cells/components/dm/infraestructure/MenuIdentifierMapper;", "menuIdMapper", "", "", "Lcom/bbva/slidemenuview/MenuItemOpenWebFlagsConfig;", "featureFlagsConfig", "<init>", "(Lcom/bbva/glomohybrid/featureflags/repository/datasource/LocalDataSource;Lcom/bbva/slidemenuview/cells/components/dm/infraestructure/MenuIdentifierMapper;Ljava/util/Map;)V", "slidemenuview_mexicoRelease"}, k = 1, mv = {1, 9, 0})
@SourceDebugExtension({"SMAP\nOpenWebFeatureFlagsMenuDecorator.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OpenWebFeatureFlagsMenuDecorator.kt\ncom/bbva/slidemenuview/decorator/OpenWebFeatureFlagsMenuDecorator\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,36:1\n1#2:37\n1549#3:38\n1620#3,3:39\n*S KotlinDebug\n*F\n+ 1 OpenWebFeatureFlagsMenuDecorator.kt\ncom/bbva/slidemenuview/decorator/OpenWebFeatureFlagsMenuDecorator\n*L\n19#1:38\n19#1:39,3\n*E\n"})
public final class OpenWebFeatureFlagsMenuDecorator implements MenuDecorator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final LocalDataSource f36711a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final MenuIdentifierMapper f36712b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final Map<String, MenuItemOpenWebFlagsConfig> f36713c;

    public OpenWebFeatureFlagsMenuDecorator(@NotNull LocalDataSource local, @NotNull MenuIdentifierMapper menuIdMapper, @NotNull Map<String, MenuItemOpenWebFlagsConfig> featureFlagsConfig) {
        Intrinsics.checkNotNullParameter(local, "local");
        Intrinsics.checkNotNullParameter(menuIdMapper, "menuIdMapper");
        Intrinsics.checkNotNullParameter(featureFlagsConfig, "featureFlagsConfig");
        this.f36711a = local;
        this.f36712b = menuIdMapper;
        this.f36713c = featureFlagsConfig;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.bbva.slidemenuview.presentation.decorator.MenuDecorator
    @NotNull
    public List<MenuItem> decorate(@NotNull List<? extends MenuItem> menuItems, @NotNull UserMenu userMenu) {
        Intrinsics.checkNotNullParameter(menuItems, "menuItems");
        Intrinsics.checkNotNullParameter(userMenu, "userMenu");
        FeatureFlags featureFlags = this.f36711a.getFeatureFlags();
        if (featureFlags == null) {
            return menuItems;
        }
        if (!(!featureFlags.getFeatures().isEmpty())) {
            featureFlags = null;
        }
        if (featureFlags == null) {
            return menuItems;
        }
        List<? extends MenuItem> list = menuItems;
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
        for (MenuItem menuItem : list) {
            MenuItemOpenWebFlagsConfig menuItemOpenWebFlagsConfig = this.f36713c.get(this.f36712b.stringIdentifier(menuItem.getId()));
            if (menuItemOpenWebFlagsConfig != null) {
                MenuItem menuItemInvoke = !menuItemOpenWebFlagsConfig.isFeatureEnabled().invoke(featureFlags).booleanValue() ? menuItemOpenWebFlagsConfig.getModify().invoke(menuItem) : menuItem;
                if (menuItemInvoke != null) {
                    menuItem = menuItemInvoke;
                }
            }
            arrayList.add(menuItem);
        }
        return arrayList;
    }
}

package com.bbva.slidemenuview.decorator;

import com.bbva.glomohybrid.featureflags.repository.FeatureFlagRepositoryExtensionKt;
import com.bbva.glomohybrid.featureflags.repository.FeatureFlagsRepository;
import com.bbva.slidemenuview.MenuItemMap;
import com.bbva.slidemenuview.domain.model.UserMenu;
import com.bbva.slidemenuview.extensions.MenuExtensionsKt;
import com.bbva.slidemenuview.presentation.decorator.MenuDecorator;
import com.bbva.ui.component.menu.model.MenuItem;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: SustainabilityDecorator.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \f2\u00020\u0001:\u0001\fB\u000f\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¨\u0006\r"}, d2 = {"Lcom/bbva/slidemenuview/decorator/SustainabilityDecorator;", "Lcom/bbva/slidemenuview/presentation/decorator/MenuDecorator;", "", "Lcom/bbva/ui/component/menu/model/MenuItem;", "menuItems", "Lcom/bbva/slidemenuview/domain/model/UserMenu;", "userMenu", "decorate", "Lcom/bbva/glomohybrid/featureflags/repository/FeatureFlagsRepository;", "featureFlagsRepository", "<init>", "(Lcom/bbva/glomohybrid/featureflags/repository/FeatureFlagsRepository;)V", "Companion", "slidemenuview_mexicoRelease"}, k = 1, mv = {1, 9, 0})
@SourceDebugExtension({"SMAP\nSustainabilityDecorator.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SustainabilityDecorator.kt\ncom/bbva/slidemenuview/decorator/SustainabilityDecorator\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,40:1\n1549#2:41\n1620#2,3:42\n*S KotlinDebug\n*F\n+ 1 SustainabilityDecorator.kt\ncom/bbva/slidemenuview/decorator/SustainabilityDecorator\n*L\n15#1:41\n15#1:42,3\n*E\n"})
public final class SustainabilityDecorator implements MenuDecorator {

    @NotNull
    public static final String SUSTAINABILITY = "sustainability";

    @NotNull
    public static final String SUSTAINABILITY_SECTION = "sustainabilitySection";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final FeatureFlagsRepository f36715a;

    public SustainabilityDecorator(@NotNull FeatureFlagsRepository featureFlagsRepository) {
        Intrinsics.checkNotNullParameter(featureFlagsRepository, "featureFlagsRepository");
        this.f36715a = featureFlagsRepository;
    }

    @Override // com.bbva.slidemenuview.presentation.decorator.MenuDecorator
    @NotNull
    public List<MenuItem> decorate(@NotNull List<? extends MenuItem> menuItems, @NotNull UserMenu userMenu) {
        Intrinsics.checkNotNullParameter(menuItems, "menuItems");
        Intrinsics.checkNotNullParameter(userMenu, "userMenu");
        List<? extends MenuItem> list = menuItems;
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
        for (MenuItem menuItemCopy$default : list) {
            if (menuItemCopy$default.getId() == MenuItemMap.Sustainability.getId()) {
                menuItemCopy$default = MenuExtensionsKt.copy$default(menuItemCopy$default, 0, FeatureFlagRepositoryExtensionKt.isSustainabilitySectionEnabled(this.f36715a) ? SUSTAINABILITY_SECTION : SUSTAINABILITY, 0, null, false, null, null, 125, null);
            }
            arrayList.add(menuItemCopy$default);
        }
        return arrayList;
    }
}

package com.bbva.slidemenuview.decorator;

import com.bbva.glomo.localstorage.LocalStorageConstantsKt;
import com.bbva.glomo.storage.MainStorage;
import com.bbva.slidemenuview.MenuItemMap;
import com.bbva.slidemenuview.domain.model.UserMenu;
import com.bbva.slidemenuview.presentation.decorator.MenuDecorator;
import com.bbva.ui.component.menu.model.MenuItem;
import com.google.gson.JsonElement;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: GlomoMiniorDecorator.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¨\u0006\f"}, d2 = {"Lcom/bbva/slidemenuview/decorator/GlomoMiniorDecorator;", "Lcom/bbva/slidemenuview/presentation/decorator/MenuDecorator;", "", "Lcom/bbva/ui/component/menu/model/MenuItem;", "menuItems", "Lcom/bbva/slidemenuview/domain/model/UserMenu;", "userMenu", "decorate", "Lcom/bbva/glomo/storage/MainStorage;", "storage", "<init>", "(Lcom/bbva/glomo/storage/MainStorage;)V", "slidemenuview_mexicoRelease"}, k = 1, mv = {1, 9, 0})
@SourceDebugExtension({"SMAP\nGlomoMiniorDecorator.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GlomoMiniorDecorator.kt\ncom/bbva/slidemenuview/decorator/GlomoMiniorDecorator\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,40:1\n766#2:41\n857#2,2:42\n*S KotlinDebug\n*F\n+ 1 GlomoMiniorDecorator.kt\ncom/bbva/slidemenuview/decorator/GlomoMiniorDecorator\n*L\n34#1:41\n34#1:42,2\n*E\n"})
public final class GlomoMiniorDecorator implements MenuDecorator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final MainStorage f36701a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final List<Integer> f36702b;

    public GlomoMiniorDecorator(@NotNull MainStorage storage) {
        Intrinsics.checkNotNullParameter(storage, "storage");
        this.f36701a = storage;
        this.f36702b = CollectionsKt__CollectionsKt.listOf((Object[]) new Integer[]{Integer.valueOf(MenuItemMap.Configuration.getId()), Integer.valueOf(MenuItemMap.Security.getId()), Integer.valueOf(MenuItemMap.SmartToken.getId()), Integer.valueOf(MenuItemMap.Sustainability.getId()), Integer.valueOf(MenuItemMap.CardLessWithdrawalHistoric.getId()), Integer.valueOf(MenuItemMap.AtmBranches.getId()), Integer.valueOf(MenuItemMap.About.getId())});
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.bbva.slidemenuview.presentation.decorator.MenuDecorator
    @NotNull
    public List<MenuItem> decorate(@NotNull List<? extends MenuItem> menuItems, @NotNull UserMenu userMenu) {
        Intrinsics.checkNotNullParameter(menuItems, "menuItems");
        Intrinsics.checkNotNullParameter(userMenu, "userMenu");
        JsonElement jsonElement = MainStorage.getJson$default(this.f36701a, LocalStorageConstantsKt.KEY_GLOMO_MINIOR, false, null, 6, null).get(LocalStorageConstantsKt.KEY_VALUE_GLOMO_MINIOR);
        if (jsonElement == null || !jsonElement.getAsBoolean()) {
            return menuItems;
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : menuItems) {
            if (this.f36702b.contains(Integer.valueOf(((MenuItem) obj).getId()))) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }
}

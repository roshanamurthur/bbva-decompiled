package com.bbva.slidemenuview.domain.model;

import androidx.annotation.Keep;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: MenuItems.kt */
/* JADX INFO: loaded from: classes8.dex */
@Keep
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0005\b\u0087\b\u0018\u0000 \u00182\u00020\u0001:\u0001\u0018B%\u0012\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003¢\u0006\u0002\u0010\u0007J\u000f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003HÆ\u0003J)\u0010\r\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\r\u0010\u0011\u001a\u0004\u0018\u00010\u000f¢\u0006\u0002\u0010\u0012J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\u000e\u0010\u0015\u001a\u00020\u00002\u0006\u0010\u0016\u001a\u00020\u0004J\t\u0010\u0017\u001a\u00020\u0004HÖ\u0001R\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\t¨\u0006\u0019"}, d2 = {"Lcom/bbva/slidemenuview/domain/model/MenuItems;", "", "version", "", "", FirebaseAnalytics.Param.ITEMS, "Lcom/bbva/slidemenuview/domain/model/MenuItemSpec;", "(Ljava/util/List;Ljava/util/List;)V", "getItems", "()Ljava/util/List;", "getVersion", "component1", "component2", "copy", "equals", "", "other", "hasFeatures", "()Ljava/lang/Boolean;", GenerateActivationFormCommand.HASH_CODE, "", "markAsVisited", "id", "toString", "Companion", "slidemenuview_mexicoRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nMenuItems.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MenuItems.kt\ncom/bbva/slidemenuview/domain/model/MenuItems\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,39:1\n1549#2:40\n1620#2,3:41\n1747#2,3:44\n*S KotlinDebug\n*F\n+ 1 MenuItems.kt\ncom/bbva/slidemenuview/domain/model/MenuItems\n*L\n13#1:40\n13#1:41,3\n23#1:44,3\n*E\n"})
public final /* data */ class MenuItems {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final MenuItems EMPTY = new MenuItems(0 == true ? 1 : 0, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);

    @NotNull
    private final List<MenuItemSpec> items;

    @NotNull
    private final List<String> version;

    /* JADX INFO: compiled from: MenuItems.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/bbva/slidemenuview/domain/model/MenuItems$Companion;", "", "()V", "EMPTY", "Lcom/bbva/slidemenuview/domain/model/MenuItems;", "getEMPTY", "()Lcom/bbva/slidemenuview/domain/model/MenuItems;", "slidemenuview_mexicoRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final MenuItems getEMPTY() {
            return MenuItems.EMPTY;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public MenuItems() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ MenuItems copy$default(MenuItems menuItems, List list, List list2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            list = menuItems.version;
        }
        if ((i10 & 2) != 0) {
            list2 = menuItems.items;
        }
        return menuItems.copy(list, list2);
    }

    @NotNull
    public final List<String> component1() {
        return this.version;
    }

    @NotNull
    public final List<MenuItemSpec> component2() {
        return this.items;
    }

    @NotNull
    public final MenuItems copy(@NotNull List<String> version, @NotNull List<MenuItemSpec> items) {
        Intrinsics.checkNotNullParameter(version, "version");
        Intrinsics.checkNotNullParameter(items, "items");
        return new MenuItems(version, items);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MenuItems)) {
            return false;
        }
        MenuItems menuItems = (MenuItems) other;
        return Intrinsics.areEqual(this.version, menuItems.version) && Intrinsics.areEqual(this.items, menuItems.items);
    }

    @NotNull
    public final List<MenuItemSpec> getItems() {
        return this.items;
    }

    @NotNull
    public final List<String> getVersion() {
        return this.version;
    }

    @Nullable
    public final Boolean hasFeatures() {
        List<MenuItemSpec> list = this.items;
        boolean z10 = false;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            for (MenuItemSpec menuItemSpec : list) {
                if ((!menuItemSpec.isFeatured().isEmpty()) && !menuItemSpec.isVisited()) {
                    z10 = true;
                    break;
                }
            }
        }
        return Boolean.valueOf(z10);
    }

    public int hashCode() {
        return this.items.hashCode() + (this.version.hashCode() * 31);
    }

    @NotNull
    public final MenuItems markAsVisited(@NotNull String id) {
        Intrinsics.checkNotNullParameter(id, "id");
        List<MenuItemSpec> list = this.items;
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
        for (MenuItemSpec menuItemSpecCopy$default : list) {
            if (Intrinsics.areEqual(menuItemSpecCopy$default.getId(), id) && (!menuItemSpecCopy$default.isFeatured().isEmpty())) {
                menuItemSpecCopy$default = MenuItemSpec.copy$default(menuItemSpecCopy$default, null, null, null, null, true, 15, null);
            }
            arrayList.add(menuItemSpecCopy$default);
        }
        return copy$default(this, null, arrayList, 1, null);
    }

    @NotNull
    public String toString() {
        return "MenuItems(version=" + this.version + ", items=" + this.items + ")";
    }

    public MenuItems(@NotNull List<String> version, @NotNull List<MenuItemSpec> items) {
        Intrinsics.checkNotNullParameter(version, "version");
        Intrinsics.checkNotNullParameter(items, "items");
        this.version = version;
        this.items = items;
    }

    public /* synthetic */ MenuItems(List list, List list2, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? CollectionsKt__CollectionsKt.emptyList() : list, (i10 & 2) != 0 ? CollectionsKt__CollectionsKt.emptyList() : list2);
    }
}

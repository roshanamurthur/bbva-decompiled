package com.bbva.slidemenuview.decorator;

import bk.d;
import com.bbva.glomo.localstorage.LocalStorageConstantsKt;
import com.bbva.glomo.storage.MainStorage;
import com.bbva.slidemenuview.MenuItemMap;
import com.bbva.slidemenuview.data.MenuType;
import com.bbva.slidemenuview.domain.model.MenuItemAction;
import com.bbva.slidemenuview.domain.model.UserMenu;
import com.bbva.slidemenuview.extensions.MenuExtensionsKt;
import com.bbva.slidemenuview.presentation.decorator.MenuDecorator;
import com.bbva.ui.component.menu.model.MenuItem;
import com.google.gson.JsonElement;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: MonoProductDecorator.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¨\u0006\f"}, d2 = {"Lcom/bbva/slidemenuview/decorator/MonoProductDecorator;", "Lcom/bbva/slidemenuview/presentation/decorator/MenuDecorator;", "", "Lcom/bbva/ui/component/menu/model/MenuItem;", "menuItems", "Lcom/bbva/slidemenuview/domain/model/UserMenu;", "userMenu", "decorate", "Lcom/bbva/glomo/storage/MainStorage;", "storage", "<init>", "(Lcom/bbva/glomo/storage/MainStorage;)V", "slidemenuview_mexicoRelease"}, k = 1, mv = {1, 9, 0})
@SourceDebugExtension({"SMAP\nMonoProductDecorator.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MonoProductDecorator.kt\ncom/bbva/slidemenuview/decorator/MonoProductDecorator\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,68:1\n1549#2:69\n1620#2,3:70\n1549#2:73\n1620#2,3:74\n1#3:77\n*S KotlinDebug\n*F\n+ 1 MonoProductDecorator.kt\ncom/bbva/slidemenuview/decorator/MonoProductDecorator\n*L\n46#1:69\n46#1:70,3\n53#1:73\n53#1:74,3\n*E\n"})
public final class MonoProductDecorator implements MenuDecorator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final MainStorage f36707a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final String f36708b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final List<Integer> f36709c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final List<Integer> f36710d;

    /* JADX INFO: compiled from: MonoProductDecorator.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[MenuType.values().length];
            try {
                iArr[MenuType.PUBLIC.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[MenuType.CACHED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[MenuType.PRIVATE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public MonoProductDecorator(@NotNull MainStorage storage) {
        Intrinsics.checkNotNullParameter(storage, "storage");
        this.f36707a = storage;
        this.f36708b = "invitationNonAccountClient";
        MenuItemMap menuItemMap = MenuItemMap.OperationsQr;
        this.f36709c = d.listOf(Integer.valueOf(menuItemMap.getId()));
        this.f36710d = CollectionsKt__CollectionsKt.listOf((Object[]) new Integer[]{Integer.valueOf(menuItemMap.getId()), Integer.valueOf(MenuItemMap.MobilePayment.getId()), Integer.valueOf(MenuItemMap.CardLessWithdrawalHistoric.getId()), Integer.valueOf(MenuItemMap.Clarifications.getId())});
    }

    public final MenuItem a(MenuItem menuItem, boolean z10) {
        String route = z10 ? this.f36708b : null;
        if (route == null) {
            route = menuItem.getRoute();
        }
        String str = route;
        String clickAction = z10 ? "PAGE" : null;
        if (clickAction == null) {
            clickAction = menuItem.getClickAction();
        }
        return MenuExtensionsKt.copy$default(menuItem, 0, str, 0, null, false, null, MenuItemAction.INSTANCE.from(clickAction), 61, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.bbva.slidemenuview.presentation.decorator.MenuDecorator
    @NotNull
    public List<MenuItem> decorate(@NotNull List<? extends MenuItem> menuItems, @NotNull UserMenu userMenu) {
        ArrayList arrayList;
        Intrinsics.checkNotNullParameter(menuItems, "menuItems");
        Intrinsics.checkNotNullParameter(userMenu, "userMenu");
        int i10 = WhenMappings.$EnumSwitchMapping$0[userMenu.getMenuType().ordinal()];
        if (i10 == 1) {
            return menuItems;
        }
        if (i10 == 2) {
            JsonElement jsonElement = MainStorage.getJson$default(this.f36707a, LocalStorageConstantsKt.KEY_MONOPRODUCT, false, null, 6, null).get(LocalStorageConstantsKt.KEY_MONOPRODUCT);
            if (jsonElement == null || !jsonElement.getAsBoolean()) {
                return menuItems;
            }
            List<? extends MenuItem> list = menuItems;
            arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
            for (MenuItem menuItem : list) {
                arrayList.add(a(menuItem, this.f36709c.contains(Integer.valueOf(menuItem.getId()))));
            }
        } else {
            if (i10 != 3) {
                throw new NoWhenBranchMatchedException();
            }
            JsonElement jsonElement2 = MainStorage.getJson$default(this.f36707a, LocalStorageConstantsKt.KEY_MONOPRODUCT, false, null, 6, null).get(LocalStorageConstantsKt.KEY_MONOPRODUCT);
            if (jsonElement2 == null || !jsonElement2.getAsBoolean()) {
                return menuItems;
            }
            List<? extends MenuItem> list2 = menuItems;
            arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list2, 10));
            for (MenuItem menuItem2 : list2) {
                arrayList.add(a(menuItem2, this.f36710d.contains(Integer.valueOf(menuItem2.getId()))));
            }
        }
        return arrayList;
    }
}

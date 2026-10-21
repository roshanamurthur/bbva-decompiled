package com.bbva.slidemenuview.decorator;

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

/* JADX INFO: compiled from: MonoEnterpriseDebitCardUserDecorator.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¨\u0006\f"}, d2 = {"Lcom/bbva/slidemenuview/decorator/MonoEnterpriseDebitCardUserDecorator;", "Lcom/bbva/slidemenuview/presentation/decorator/MenuDecorator;", "", "Lcom/bbva/ui/component/menu/model/MenuItem;", "menuItems", "Lcom/bbva/slidemenuview/domain/model/UserMenu;", "userMenu", "decorate", "Lcom/bbva/glomo/storage/MainStorage;", "storage", "<init>", "(Lcom/bbva/glomo/storage/MainStorage;)V", "slidemenuview_mexicoRelease"}, k = 1, mv = {1, 9, 0})
@SourceDebugExtension({"SMAP\nMonoEnterpriseDebitCardUserDecorator.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MonoEnterpriseDebitCardUserDecorator.kt\ncom/bbva/slidemenuview/decorator/MonoEnterpriseDebitCardUserDecorator\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,73:1\n1549#2:74\n1620#2,3:75\n1549#2:78\n1620#2,3:79\n1#3:82\n*S KotlinDebug\n*F\n+ 1 MonoEnterpriseDebitCardUserDecorator.kt\ncom/bbva/slidemenuview/decorator/MonoEnterpriseDebitCardUserDecorator\n*L\n51#1:74\n51#1:75,3\n58#1:78\n58#1:79,3\n*E\n"})
public final class MonoEnterpriseDebitCardUserDecorator implements MenuDecorator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final MainStorage f36703a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final String f36704b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final List<Integer> f36705c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final List<Integer> f36706d;

    /* JADX INFO: compiled from: MonoEnterpriseDebitCardUserDecorator.kt */
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

    public MonoEnterpriseDebitCardUserDecorator(@NotNull MainStorage storage) {
        Intrinsics.checkNotNullParameter(storage, "storage");
        this.f36703a = storage;
        this.f36704b = "noClientBusinessDebitCardInfo";
        MenuItemMap menuItemMap = MenuItemMap.SmartToken;
        MenuItemMap menuItemMap2 = MenuItemMap.OperationsQr;
        this.f36705c = CollectionsKt__CollectionsKt.listOf((Object[]) new Integer[]{Integer.valueOf(menuItemMap.getId()), Integer.valueOf(menuItemMap2.getId())});
        this.f36706d = CollectionsKt__CollectionsKt.listOf((Object[]) new Integer[]{Integer.valueOf(menuItemMap.getId()), Integer.valueOf(menuItemMap2.getId()), Integer.valueOf(MenuItemMap.MobilePayment.getId()), Integer.valueOf(MenuItemMap.DynamicsAndRewards.getId()), Integer.valueOf(MenuItemMap.CardLessWithdrawalHistoric.getId()), Integer.valueOf(MenuItemMap.RewardsLanding.getId()), Integer.valueOf(MenuItemMap.Sustainability.getId())});
    }

    public final MenuItem a(MenuItem menuItem, boolean z10) {
        String route = z10 ? this.f36704b : null;
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
            JsonElement jsonElement = MainStorage.getJson$default(this.f36703a, LocalStorageConstantsKt.KEY_USER_MONO_ENTERPRISE_DEBIT_CARD, false, null, 6, null).get("value");
            if (jsonElement == null || !jsonElement.getAsBoolean()) {
                return menuItems;
            }
            List<? extends MenuItem> list = menuItems;
            arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
            for (MenuItem menuItem : list) {
                arrayList.add(a(menuItem, this.f36705c.contains(Integer.valueOf(menuItem.getId()))));
            }
        } else {
            if (i10 != 3) {
                throw new NoWhenBranchMatchedException();
            }
            JsonElement jsonElement2 = MainStorage.getJson$default(this.f36703a, LocalStorageConstantsKt.KEY_USER_MONO_ENTERPRISE_DEBIT_CARD, false, null, 6, null).get("value");
            if (jsonElement2 == null || !jsonElement2.getAsBoolean()) {
                return menuItems;
            }
            List<? extends MenuItem> list2 = menuItems;
            arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list2, 10));
            for (MenuItem menuItem2 : list2) {
                arrayList.add(a(menuItem2, this.f36706d.contains(Integer.valueOf(menuItem2.getId()))));
            }
        }
        return arrayList;
    }
}

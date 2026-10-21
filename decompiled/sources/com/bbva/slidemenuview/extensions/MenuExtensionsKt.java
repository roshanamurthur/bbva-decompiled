package com.bbva.slidemenuview.extensions;

import android.content.Context;
import bk.q;
import com.bbva.cells.componentkit.model.dsl.ResourceId;
import com.bbva.component.dm.analytics.constants.AnalyticsConstants;
import com.bbva.glomohybrid.base.models.DeepLinkModel;
import com.bbva.slidemenuview.MenuItemMap;
import com.bbva.slidemenuview.data.MenuBuilderKt;
import com.bbva.slidemenuview.data.MenuItemBuilder;
import com.bbva.slidemenuview.data.MenuItemStatesBuilder;
import com.bbva.slidemenuview.data.MenuState;
import com.bbva.slidemenuview.data.MenuType;
import com.bbva.slidemenuview.domain.model.MenuItemAction;
import com.bbva.slidemenuview.domain.model.UserMenu;
import com.bbva.slidemenuview.presentation.SlideMenuViewContract;
import com.bbva.slidemenuview.presentation.decorator.MenuDecorator;
import com.bbva.slidemenuview.presentation.decorator.MenuDecoratorKt;
import com.bbva.ui.component.menu.SlideMenuView;
import com.bbva.ui.component.menu.model.HeaderMenuItem;
import com.bbva.ui.component.menu.model.HeaderSubItem;
import com.bbva.ui.component.menu.model.MenuItem;
import com.huawei.hms.feature.model.b;
import com.salesforce.marketingcloud.notifications.NotificationMessage;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: MenuExtensions.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000v\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0010\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0000\u001a\u0010\u0010\u0000\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00020\u0001H\u0000\u001a\"\u0010\u0004\u001a\u00020\u0005*\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\u0007H\u0000\u001a\"\u0010\n\u001a\u00020\u0005*\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\u0007H\u0000\u001a\u0095\u0001\u0010\u000b\u001a\u00020\f*\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u00032\b\b\u0002\u0010\u000e\u001a\u00020\u00012\b\b\u0002\u0010\u000f\u001a\u00020\u00012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00012\b\b\u0002\u0010\u0013\u001a\u00020\u00142\b\b\u0002\u0010\u0015\u001a\u00020\u00142\u001b\b\u0002\u0010\u0016\u001a\u0015\u0012\u0004\u0012\u00020\u0001\u0012\t\u0012\u00070\u0001¢\u0006\u0002\b\u0018\u0018\u00010\u00172\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u0001\u001aa\u0010\u000b\u001a\u00020\u0007*\u00020\u00072\b\b\u0002\u0010\r\u001a\u00020\u00032\b\b\u0002\u0010\u000e\u001a\u00020\u00012\b\b\u0002\u0010\u001c\u001a\u00020\u00032\b\b\u0002\u0010\u001d\u001a\u00020\u00012\b\b\u0002\u0010\u001e\u001a\u00020\u00142\u0019\b\u0002\u0010\u0016\u001a\u0013\u0012\u0004\u0012\u00020\u0001\u0012\t\u0012\u00070\u0001¢\u0006\u0002\b\u00180\u00172\b\b\u0002\u0010\u001f\u001a\u00020 \u001a\n\u0010!\u001a\u00020\u0014*\u00020\"\u001a\u001a\u0010#\u001a\u00020\u0003*\b\u0012\u0004\u0012\u00020\u00070$2\u0006\u0010\b\u001a\u00020\u0003H\u0000\u001a\u0014\u0010%\u001a\u00020\u0014*\u00020\u00072\u0006\u0010&\u001a\u00020'H\u0000\u001a\u0014\u0010(\u001a\u0004\u0018\u00010)*\u00020\u00072\u0006\u0010\u000e\u001a\u00020\u0001\u001a\f\u0010*\u001a\u00020\u0001*\u00020'H\u0000\u001a \u0010+\u001a\b\u0012\u0004\u0012\u00020\u00070$*\b\u0012\u0004\u0012\u00020\u00070$2\u0006\u0010&\u001a\u00020'H\u0000\u001a(\u0010,\u001a\u00020\u0005*\u00020\"2\u0006\u0010-\u001a\u00020.2\u0006\u0010/\u001a\u0002002\f\u00101\u001a\b\u0012\u0004\u0012\u0002020$¨\u00063"}, d2 = {"idOf", "", "identifier", "", "addAfter", "", "", "Lcom/bbva/ui/component/menu/model/MenuItem;", "menuItemId", AnalyticsConstants.Key.ITEM, "addBefore", "copy", "Lcom/bbva/ui/component/menu/model/HeaderMenuItem;", "id", "route", "title", NotificationMessage.NOTIF_KEY_SUB_TITLE, "Lcom/bbva/ui/component/menu/model/HeaderSubItem;", "clickAccessibilityLabel", "isChecked", "", "isCheckable", b.f50432b, "", "Lcom/bbva/ui/component/menu/model/BaseMenuItem$State;", "subHeader", "thirdLine", "initials", "iconId", "text", "isFeatured", "clickAction", "Lcom/bbva/slidemenuview/domain/model/MenuItemAction;", "hasFeatures", "Lcom/bbva/ui/component/menu/SlideMenuView;", "positionOf", "", "shouldBeAdded", "type", "Lcom/bbva/slidemenuview/data/MenuType;", "toDeepLink", "Lcom/bbva/glomohybrid/base/models/DeepLinkModel;", "toMenuState", "toVisibleItems", "updateMenu", "menuContract", "Lcom/bbva/slidemenuview/presentation/SlideMenuViewContract;", "userMenu", "Lcom/bbva/slidemenuview/domain/model/UserMenu;", "decorators", "Lcom/bbva/slidemenuview/presentation/decorator/MenuDecorator;", "slidemenuview_mexicoRelease"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nMenuExtensions.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MenuExtensions.kt\ncom/bbva/slidemenuview/extensions/MenuExtensionsKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,132:1\n350#2,7:133\n766#2:140\n857#2,2:141\n1747#2,3:143\n1#3:146\n*S KotlinDebug\n*F\n+ 1 MenuExtensions.kt\ncom/bbva/slidemenuview/extensions/MenuExtensionsKt\n*L\n32#1:133,7\n47#1:140\n47#1:141,2\n93#1:143,3\n*E\n"})
public final class MenuExtensionsKt {

    /* JADX INFO: compiled from: MenuExtensions.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

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
            int[] iArr2 = new int[MenuItemAction.values().length];
            try {
                iArr2[MenuItemAction.PRIVATE_PAGE.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    /* JADX INFO: compiled from: MenuExtensions.kt */
    public static final class a extends Lambda implements Function1<MenuItemBuilder, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ int f36732p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ String f36733q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ int f36734r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final /* synthetic */ String f36735s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public final /* synthetic */ boolean f36736t0;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public final /* synthetic */ Map<String, String> f36737u0;
        public final /* synthetic */ MenuItemAction v0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(int i10, String str, int i11, String str2, boolean z10, Map<String, String> map, MenuItemAction menuItemAction) {
            super(1);
            this.f36732p0 = i10;
            this.f36733q0 = str;
            this.f36734r0 = i11;
            this.f36735s0 = str2;
            this.f36736t0 = z10;
            this.f36737u0 = map;
            this.v0 = menuItemAction;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(MenuItemBuilder menuItemBuilder) {
            MenuItemBuilder menuItem = menuItemBuilder;
            Intrinsics.checkNotNullParameter(menuItem, "$this$menuItem");
            menuItem.setId(this.f36732p0);
            menuItem.setRoute(this.f36733q0);
            menuItem.setIconId(this.f36734r0);
            menuItem.setText(this.f36735s0);
            menuItem.setFeatured(this.f36736t0);
            menuItem.setStates(q.toMutableMap(this.f36737u0));
            menuItem.setClickAction(this.v0);
            return Unit.INSTANCE;
        }
    }

    public static final void addAfter(@NotNull List<MenuItem> list, int i10, @NotNull MenuItem item) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        Intrinsics.checkNotNullParameter(item, "item");
        list.add(positionOf(list, i10) + 1, item);
    }

    public static final void addBefore(@NotNull List<MenuItem> list, int i10, @NotNull MenuItem item) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        Intrinsics.checkNotNullParameter(item, "item");
        list.add(positionOf(list, i10), item);
    }

    @NotNull
    public static final MenuItem copy(@NotNull MenuItem menuItem, int i10, @NotNull String route, int i11, @NotNull String text, boolean z10, @NotNull Map<String, String> states, @NotNull MenuItemAction clickAction) {
        Intrinsics.checkNotNullParameter(menuItem, "<this>");
        Intrinsics.checkNotNullParameter(route, "route");
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(states, "states");
        Intrinsics.checkNotNullParameter(clickAction, "clickAction");
        return MenuBuilderKt.menuItem(new a(i10, route, i11, text, z10, states, clickAction));
    }

    public static /* synthetic */ MenuItem copy$default(MenuItem menuItem, int i10, String str, int i11, String str2, boolean z10, Map map, MenuItemAction menuItemAction, int i12, Object obj) {
        Integer androidId;
        if ((i12 & 1) != 0) {
            i10 = menuItem.getId();
        }
        if ((i12 & 2) != 0) {
            str = menuItem.getRoute();
        }
        String str3 = str;
        if ((i12 & 4) != 0) {
            ResourceId source = menuItem.getIcon().getSource();
            i11 = (source == null || (androidId = source.getAndroidId()) == null) ? 0 : androidId.intValue();
        }
        int i13 = i11;
        if ((i12 & 8) != 0) {
            str2 = menuItem.getText();
        }
        String str4 = str2;
        if ((i12 & 16) != 0) {
            z10 = menuItem.getIsFeatured();
        }
        boolean z11 = z10;
        if ((i12 & 32) != 0) {
            Map<String, String> states = menuItem.getStates();
            if (states == null) {
                states = q.emptyMap();
            }
            map = states;
        }
        Map map2 = map;
        if ((i12 & 64) != 0) {
            menuItemAction = MenuItemAction.INSTANCE.from(menuItem.getClickAction());
        }
        return copy(menuItem, i10, str3, i13, str4, z11, map2, menuItemAction);
    }

    public static final boolean hasFeatures(@NotNull SlideMenuView slideMenuView) {
        Intrinsics.checkNotNullParameter(slideMenuView, "<this>");
        List<MenuItem> items = slideMenuView.getItems();
        if ((items instanceof Collection) && items.isEmpty()) {
            return false;
        }
        Iterator<T> it = items.iterator();
        while (it.hasNext()) {
            if (((MenuItem) it.next()).getIsFeatured()) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0020  */
    /* JADX WARN: Code duplicated, block: B:11:0x0025 A[ORIG_RETURN, RETURN] */
    public static final int idOf(@NotNull String identifier) {
        Intrinsics.checkNotNullParameter(identifier, "identifier");
        for (MenuItemMap menuItemMap : MenuItemMap.values()) {
            if (Intrinsics.areEqual(menuItemMap.getIdentifier(), identifier)) {
                if (menuItemMap != null) {
                    return menuItemMap.getId();
                }
                return -1;
            }
        }
        menuItemMap = null;
        if (menuItemMap != null) {
            return menuItemMap.getId();
        }
        return -1;
    }

    public static final int positionOf(@NotNull List<? extends MenuItem> list, int i10) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        Iterator<? extends MenuItem> it = list.iterator();
        int i11 = 0;
        while (it.hasNext()) {
            if (it.next().getId() == i10) {
                return i11;
            }
            i11++;
        }
        return -1;
    }

    public static final boolean shouldBeAdded(@NotNull MenuItem menuItem, @NotNull MenuType type) {
        String state;
        Intrinsics.checkNotNullParameter(menuItem, "<this>");
        Intrinsics.checkNotNullParameter(type, "type");
        String menuState = toMenuState(type);
        Map<String, String> states = menuItem.getStates();
        if (states == null || (state = states.get(menuState)) == null) {
            state = MenuState.DISABLED.getState();
        }
        return !Intrinsics.areEqual(state, MenuState.HIDDEN.getState());
    }

    @Nullable
    public static final DeepLinkModel toDeepLink(@NotNull MenuItem menuItem, @NotNull String route) {
        Intrinsics.checkNotNullParameter(menuItem, "<this>");
        Intrinsics.checkNotNullParameter(route, "route");
        if (WhenMappings.$EnumSwitchMapping$1[MenuItemAction.INSTANCE.from(menuItem.getClickAction()).ordinal()] == 1) {
            return new DeepLinkModel(null, route, null, null, 12, null);
        }
        return null;
    }

    @NotNull
    public static final String toMenuState(@NotNull MenuType menuType) {
        Intrinsics.checkNotNullParameter(menuType, "<this>");
        int i10 = WhenMappings.$EnumSwitchMapping$0[menuType.ordinal()];
        if (i10 == 1) {
            return MenuItemStatesBuilder.USER_NO;
        }
        if (i10 == 2) {
            return MenuItemStatesBuilder.USER_CACHED;
        }
        if (i10 == 3) {
            return MenuItemStatesBuilder.USER_LOGGED;
        }
        throw new NoWhenBranchMatchedException();
    }

    @NotNull
    public static final List<MenuItem> toVisibleItems(@NotNull List<? extends MenuItem> list, @NotNull MenuType type) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        Intrinsics.checkNotNullParameter(type, "type");
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (shouldBeAdded((MenuItem) obj, type)) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public static final void updateMenu(@NotNull SlideMenuView slideMenuView, @NotNull SlideMenuViewContract menuContract, @NotNull UserMenu userMenu, @NotNull List<? extends MenuDecorator> decorators) {
        Intrinsics.checkNotNullParameter(slideMenuView, "<this>");
        Intrinsics.checkNotNullParameter(menuContract, "menuContract");
        Intrinsics.checkNotNullParameter(userMenu, "userMenu");
        Intrinsics.checkNotNullParameter(decorators, "decorators");
        slideMenuView.setState(userMenu.getMenuType().getValue());
        boolean z10 = userMenu.getMenuType() == MenuType.PRIVATE;
        Context context = slideMenuView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        HeaderMenuItem headerMenuItem = menuContract.getHeaderMenuItem(context, userMenu);
        String userName = userMenu.getUserName();
        if (userName == null) {
            userName = "";
        }
        slideMenuView.setHeaderItem(copy$default(headerMenuItem, 0, null, userName, null, null, false, false, null, null, null, null, 2043, null));
        Context context2 = slideMenuView.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        slideMenuView.setItems(MenuDecoratorKt.applyTo(decorators, menuContract.getMenuItems(context2, z10), userMenu));
        Context context3 = slideMenuView.getContext();
        Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
        slideMenuView.setFooterItem(menuContract.getMenuFooterItem(context3));
    }

    @NotNull
    public static final HeaderMenuItem copy(@NotNull HeaderMenuItem headerMenuItem, int i10, @NotNull String route, @NotNull String title, @Nullable HeaderSubItem headerSubItem, @Nullable String str, boolean z10, boolean z11, @Nullable Map<String, String> map, @Nullable HeaderSubItem headerSubItem2, @Nullable HeaderSubItem headerSubItem3, @Nullable String str2) {
        Intrinsics.checkNotNullParameter(headerMenuItem, "<this>");
        Intrinsics.checkNotNullParameter(route, "route");
        Intrinsics.checkNotNullParameter(title, "title");
        return new HeaderMenuItem(i10, route, title, headerSubItem, str, z10, z11, map, headerSubItem2, headerSubItem3, str2);
    }

    @NotNull
    public static final String idOf(int i10) {
        MenuItemMap menuItemMap;
        String identifier;
        MenuItemMap[] menuItemMapArrValues = MenuItemMap.values();
        int length = menuItemMapArrValues.length;
        int i11 = 0;
        while (true) {
            if (i11 >= length) {
                menuItemMap = null;
                break;
            }
            menuItemMap = menuItemMapArrValues[i11];
            if (menuItemMap.getId() == i10) {
                break;
            }
            i11++;
        }
        return (menuItemMap == null || (identifier = menuItemMap.getIdentifier()) == null) ? "" : identifier;
    }

    public static /* synthetic */ HeaderMenuItem copy$default(HeaderMenuItem headerMenuItem, int i10, String str, String str2, HeaderSubItem headerSubItem, String str3, boolean z10, boolean z11, Map map, HeaderSubItem headerSubItem2, HeaderSubItem headerSubItem3, String str4, int i11, Object obj) {
        return copy(headerMenuItem, (i11 & 1) != 0 ? headerMenuItem.getId() : i10, (i11 & 2) != 0 ? headerMenuItem.getRoute() : str, (i11 & 4) != 0 ? headerMenuItem.getText() : str2, (i11 & 8) != 0 ? headerMenuItem.getCom.salesforce.marketingcloud.notifications.NotificationMessage.NOTIF_KEY_SUB_TITLE java.lang.String() : headerSubItem, (i11 & 16) != 0 ? headerMenuItem.getClickAccessibilityLabel() : str3, (i11 & 32) != 0 ? headerMenuItem.getIsChecked() : z10, (i11 & 64) != 0 ? headerMenuItem.getIsCheckable() : z11, (i11 & 128) != 0 ? headerMenuItem.getStates() : map, (i11 & 256) != 0 ? headerMenuItem.getSubHeader() : headerSubItem2, (i11 & 512) != 0 ? headerMenuItem.getThirdLine() : headerSubItem3, (i11 & 1024) != 0 ? headerMenuItem.getInitials() : str4);
    }
}

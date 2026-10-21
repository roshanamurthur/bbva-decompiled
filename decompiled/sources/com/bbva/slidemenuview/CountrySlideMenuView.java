package com.bbva.slidemenuview;

import android.content.Context;
import com.bbva.glomo.user.domain.model.UserType;
import com.bbva.glomoconfig.constants.CountryRouteConstants;
import com.bbva.glomoconfig.constants.RouteConstants;
import com.bbva.slidemenuview.data.HeaderMenuItemBuilder;
import com.bbva.slidemenuview.data.MenuBuilderKt;
import com.bbva.slidemenuview.data.MenuItemBuilder;
import com.bbva.slidemenuview.data.MenuState;
import com.bbva.slidemenuview.data.MenuType;
import com.bbva.slidemenuview.decorator.SustainabilityDecorator;
import com.bbva.slidemenuview.domain.model.MenuItemAction;
import com.bbva.slidemenuview.domain.model.UserMenu;
import com.bbva.slidemenuview.presentation.SlideMenuViewContract;
import com.bbva.ui.component.menu.model.HeaderMenuItem;
import com.bbva.ui.component.menu.model.HeaderSubItem;
import com.bbva.ui.component.menu.model.MenuItem;
import com.google.android.gms.common.Scopes;
import java.util.Comparator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: CountrySlideMenuView.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ\u001e\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u0018\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tH\u0016J\u0010\u0010\r\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0010"}, d2 = {"Lcom/bbva/slidemenuview/CountrySlideMenuView;", "Lcom/bbva/slidemenuview/presentation/SlideMenuViewContract;", "Landroid/content/Context;", "context", "", "isUserLogged", "", "Lcom/bbva/ui/component/menu/model/MenuItem;", "getMenuItems", "Lcom/bbva/slidemenuview/domain/model/UserMenu;", "userMenu", "Lcom/bbva/ui/component/menu/model/HeaderMenuItem;", "getHeaderMenuItem", "getMenuFooterItem", "<init>", "()V", "slidemenuview_mexicoRelease"}, k = 1, mv = {1, 9, 0})
@SourceDebugExtension({"SMAP\nCountrySlideMenuView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CountrySlideMenuView.kt\ncom/bbva/slidemenuview/CountrySlideMenuView\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,253:1\n1045#2:254\n*S KotlinDebug\n*F\n+ 1 CountrySlideMenuView.kt\ncom/bbva/slidemenuview/CountrySlideMenuView\n*L\n188#1:254\n*E\n"})
public final class CountrySlideMenuView implements SlideMenuViewContract {

    /* JADX INFO: compiled from: CountrySlideMenuView.kt */
    public static final class a extends Lambda implements Function1<HeaderMenuItemBuilder, Unit> {

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ Context f36627q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ UserMenu f36628r0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Context context, UserMenu userMenu) {
            super(1);
            this.f36627q0 = context;
            this.f36628r0 = userMenu;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(HeaderMenuItemBuilder headerMenuItemBuilder) {
            HeaderMenuItemBuilder headerMenuItem = headerMenuItemBuilder;
            Intrinsics.checkNotNullParameter(headerMenuItem, "$this$headerMenuItem");
            headerMenuItem.setRoute(Scopes.PROFILE);
            Context context = this.f36627q0;
            headerMenuItem.setSubtitle(MenuBuilderKt.headerSubItem(new com.bbva.slidemenuview.b(context)));
            headerMenuItem.setThirdLine(CountrySlideMenuView.access$getThirdLineItem(CountrySlideMenuView.this, context, this.f36628r0));
            headerMenuItem.states(com.bbva.slidemenuview.c.f36654p0);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: CountrySlideMenuView.kt */
    public static final class b extends Lambda implements Function1<MenuItemBuilder, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ Context f36629p0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Context context) {
            super(1);
            this.f36629p0 = context;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(MenuItemBuilder menuItemBuilder) {
            MenuItemBuilder menuItem = menuItemBuilder;
            Intrinsics.checkNotNullParameter(menuItem, "$this$menuItem");
            menuItem.setRoute("logout");
            menuItem.setIconId(R.drawable.ic_exit);
            String string = this.f36629p0.getString(R.string.ui_menu_logout);
            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
            menuItem.setText(string);
            menuItem.states(com.bbva.slidemenuview.d.f36673p0);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: CountrySlideMenuView.kt */
    public static final class c extends Lambda implements Function1<MenuItemBuilder, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ Context f36630p0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Context context) {
            super(1);
            this.f36630p0 = context;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(MenuItemBuilder menuItemBuilder) {
            MenuItemBuilder menuItem = menuItemBuilder;
            Intrinsics.checkNotNullParameter(menuItem, "$this$menuItem");
            menuItem.setId(MenuItemMap.AtmBranches.getId());
            menuItem.setRoute(RouteConstants.ATM);
            String string = this.f36630p0.getString(R.string.ui_menu_atm_branches);
            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
            menuItem.setText(string);
            menuItem.setIconId(R.drawable.ic_branch);
            menuItem.states(com.bbva.slidemenuview.f.f36738p0);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: CountrySlideMenuView.kt */
    public static final class d extends Lambda implements Function1<MenuItemBuilder, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ Context f36631p0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(Context context) {
            super(1);
            this.f36631p0 = context;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(MenuItemBuilder menuItemBuilder) {
            MenuItemBuilder menuItem = menuItemBuilder;
            Intrinsics.checkNotNullParameter(menuItem, "$this$menuItem");
            menuItem.setId(MenuItemMap.Clarifications.getId());
            menuItem.setRoute("clarificationsListCare");
            String string = this.f36631p0.getString(R.string.ui_menu_clarification_list);
            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
            menuItem.setText(string);
            menuItem.setIconId(R.drawable.ic_balance_dollar);
            menuItem.states(com.bbva.slidemenuview.g.f36739p0);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: CountrySlideMenuView.kt */
    public static final class e extends Lambda implements Function1<MenuItemBuilder, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ Context f36632p0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(Context context) {
            super(1);
            this.f36632p0 = context;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(MenuItemBuilder menuItemBuilder) {
            MenuItemBuilder menuItem = menuItemBuilder;
            Intrinsics.checkNotNullParameter(menuItem, "$this$menuItem");
            menuItem.setId(MenuItemMap.Security.getId());
            menuItem.setRoute("securityMenu");
            String string = this.f36632p0.getString(R.string.ui_menu_security);
            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
            menuItem.setText(string);
            menuItem.setIconId(R.drawable.ic_security_token);
            menuItem.states(com.bbva.slidemenuview.h.f36740p0);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: CountrySlideMenuView.kt */
    public static final class f extends Lambda implements Function1<MenuItemBuilder, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ Context f36633p0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(Context context) {
            super(1);
            this.f36633p0 = context;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(MenuItemBuilder menuItemBuilder) {
            MenuItemBuilder menuItem = menuItemBuilder;
            Intrinsics.checkNotNullParameter(menuItem, "$this$menuItem");
            menuItem.setId(MenuItemMap.DynamicsAndRewards.getId());
            menuItem.setRoute(RouteConstants.DYNAMICS_AND_REWARDS);
            String string = this.f36633p0.getString(R.string.ui_menu_invite_a_friend);
            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
            menuItem.setText(string);
            menuItem.setIconId(R.drawable.ic_rewards);
            menuItem.states(com.bbva.slidemenuview.i.f36741p0);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: CountrySlideMenuView.kt */
    public static final class g extends Lambda implements Function1<MenuItemBuilder, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ Context f36634p0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(Context context) {
            super(1);
            this.f36634p0 = context;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(MenuItemBuilder menuItemBuilder) {
            MenuItemBuilder menuItem = menuItemBuilder;
            Intrinsics.checkNotNullParameter(menuItem, "$this$menuItem");
            menuItem.setId(MenuItemMap.MobilePayment.getId());
            menuItem.setRoute(CountryRouteConstants.COMING_SOON);
            String string = this.f36634p0.getString(R.string.ui_menu_mobile_payment);
            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
            menuItem.setText(string);
            menuItem.setIconId(R.drawable.ic_nfc);
            menuItem.states(com.bbva.slidemenuview.j.f36742p0);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: CountrySlideMenuView.kt */
    public static final class h extends Lambda implements Function1<MenuItemBuilder, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ Context f36635p0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(Context context) {
            super(1);
            this.f36635p0 = context;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(MenuItemBuilder menuItemBuilder) {
            MenuItemBuilder menuItem = menuItemBuilder;
            Intrinsics.checkNotNullParameter(menuItem, "$this$menuItem");
            menuItem.setId(MenuItemMap.Emergencies.getId());
            menuItem.setRoute("emergencyReports");
            String string = this.f36635p0.getString(R.string.ui_menu_sos);
            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
            menuItem.setText(string);
            menuItem.setIconId(R.drawable.ic_emergencies);
            menuItem.states(com.bbva.slidemenuview.k.f36743p0);
            menuItem.setClickAction(MenuItemAction.PRIVATE_PAGE);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: CountrySlideMenuView.kt */
    public static final class i extends Lambda implements Function1<MenuItemBuilder, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ boolean f36636p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ Context f36637q0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(Context context, boolean z10) {
            super(1);
            this.f36636p0 = z10;
            this.f36637q0 = context;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(MenuItemBuilder menuItemBuilder) {
            MenuItemBuilder menuItem = menuItemBuilder;
            Intrinsics.checkNotNullParameter(menuItem, "$this$menuItem");
            menuItem.setId(MenuItemMap.Sustainability.getId());
            menuItem.setRoute(this.f36636p0 ? SustainabilityDecorator.SUSTAINABILITY : "sustainabilityPublic");
            String string = this.f36637q0.getString(R.string.ui_menu_sustainability);
            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
            menuItem.setText(string);
            menuItem.setIconId(R.drawable.ic_sustainability);
            menuItem.states(com.bbva.slidemenuview.e.f36731p0);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: CountrySlideMenuView.kt */
    public static final class j extends Lambda implements Function1<MenuItemBuilder, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ Context f36638p0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(Context context) {
            super(1);
            this.f36638p0 = context;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(MenuItemBuilder menuItemBuilder) {
            MenuItemBuilder menuItem = menuItemBuilder;
            Intrinsics.checkNotNullParameter(menuItem, "$this$menuItem");
            menuItem.setId(MenuItemMap.RewardsLanding.getId());
            menuItem.setRoute("reward");
            menuItem.setIconId(R.drawable.ic_points_and_promotions);
            String string = this.f36638p0.getString(R.string.ui_menu_rewards_landing);
            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
            menuItem.setText(string);
            menuItem.states(com.bbva.slidemenuview.l.f36744p0);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: CountrySlideMenuView.kt */
    public static final class k extends Lambda implements Function1<MenuItemBuilder, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ Context f36639p0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(Context context) {
            super(1);
            this.f36639p0 = context;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(MenuItemBuilder menuItemBuilder) {
            MenuItemBuilder menuItem = menuItemBuilder;
            Intrinsics.checkNotNullParameter(menuItem, "$this$menuItem");
            menuItem.setId(MenuItemMap.CardLessWithdrawalHistoric.getId());
            menuItem.setRoute("cardlessWithdrawalHistoric");
            String string = this.f36639p0.getString(R.string.ui_menu_mobile_cash_history);
            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
            menuItem.setText(string);
            menuItem.setIconId(R.drawable.ic_movements);
            menuItem.states(com.bbva.slidemenuview.m.f36745p0);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: CountrySlideMenuView.kt */
    public static final class l extends Lambda implements Function1<MenuItemBuilder, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ Context f36640p0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l(Context context) {
            super(1);
            this.f36640p0 = context;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(MenuItemBuilder menuItemBuilder) {
            MenuItemBuilder menuItem = menuItemBuilder;
            Intrinsics.checkNotNullParameter(menuItem, "$this$menuItem");
            menuItem.setId(MenuItemMap.Help.getId());
            menuItem.setRoute("help");
            String string = this.f36640p0.getString(R.string.ui_menu_help);
            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
            menuItem.setText(string);
            menuItem.setIconId(R.drawable.ic_assistance);
            menuItem.states(com.bbva.slidemenuview.n.f36746p0);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: CountrySlideMenuView.kt */
    public static final class m extends Lambda implements Function1<MenuItemBuilder, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ Context f36641p0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public m(Context context) {
            super(1);
            this.f36641p0 = context;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(MenuItemBuilder menuItemBuilder) {
            MenuItemBuilder menuItem = menuItemBuilder;
            Intrinsics.checkNotNullParameter(menuItem, "$this$menuItem");
            menuItem.setId(MenuItemMap.CashZonePayments.getId());
            menuItem.setRoute("cashZonePaymentsMposDash");
            String string = this.f36641p0.getString(R.string.ui_menu_cash_zone_payments);
            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
            menuItem.setText(string);
            menuItem.setIconId(R.drawable.ic_receive_money);
            menuItem.states(com.bbva.slidemenuview.o.f36747p0);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: CountrySlideMenuView.kt */
    public static final class n extends Lambda implements Function1<MenuItemBuilder, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ Context f36642p0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public n(Context context) {
            super(1);
            this.f36642p0 = context;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(MenuItemBuilder menuItemBuilder) {
            MenuItemBuilder menuItem = menuItemBuilder;
            Intrinsics.checkNotNullParameter(menuItem, "$this$menuItem");
            menuItem.setId(MenuItemMap.About.getId());
            menuItem.setRoute("aboutPage");
            String string = this.f36642p0.getString(R.string.ui_menu_about);
            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
            menuItem.setText(string);
            menuItem.setIconId(R.drawable.ic_info);
            menuItem.states(com.bbva.slidemenuview.p.f36748p0);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: CountrySlideMenuView.kt */
    public static final class o extends Lambda implements Function1<MenuItemBuilder, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ Context f36643p0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o(Context context) {
            super(1);
            this.f36643p0 = context;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(MenuItemBuilder menuItemBuilder) {
            MenuItemBuilder menuItem = menuItemBuilder;
            Intrinsics.checkNotNullParameter(menuItem, "$this$menuItem");
            menuItem.setId(MenuItemMap.Configuration.getId());
            menuItem.setRoute("settings");
            String string = this.f36643p0.getString(R.string.ui_menu_configuration);
            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
            menuItem.setText(string);
            menuItem.setIconId(R.drawable.ic_config);
            menuItem.states(com.bbva.slidemenuview.q.f36776p0);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: CountrySlideMenuView.kt */
    public static final class p extends Lambda implements Function1<MenuItemBuilder, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ Context f36644p0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public p(Context context) {
            super(1);
            this.f36644p0 = context;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(MenuItemBuilder menuItemBuilder) {
            MenuItemBuilder menuItem = menuItemBuilder;
            Intrinsics.checkNotNullParameter(menuItem, "$this$menuItem");
            menuItem.setId(MenuItemMap.SmartToken.getId());
            menuItem.setRoute("stOutBand");
            String string = this.f36644p0.getString(R.string.ui_menu_smart_token);
            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
            menuItem.setText(string);
            menuItem.setIconId(R.drawable.ic_token_menu);
            menuItem.states(s.f36782p0);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: CountrySlideMenuView.kt */
    public static final class q extends Lambda implements Function1<MenuItemBuilder, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ Context f36645p0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public q(Context context) {
            super(1);
            this.f36645p0 = context;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(MenuItemBuilder menuItemBuilder) {
            MenuItemBuilder menuItem = menuItemBuilder;
            Intrinsics.checkNotNullParameter(menuItem, "$this$menuItem");
            menuItem.setId(MenuItemMap.OperationsQr.getId());
            menuItem.setRoute("codiQrScanner");
            String string = this.f36645p0.getString(R.string.ui_menu_qr_payments);
            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
            menuItem.setText(string);
            menuItem.setIconId(R.drawable.ic_qr_operations);
            menuItem.setClickAction(MenuItemAction.PRIVATE_PAGE);
            menuItem.states(t.f36783p0);
            return Unit.INSTANCE;
        }
    }

    public static final HeaderSubItem access$getThirdLineItem(CountrySlideMenuView countrySlideMenuView, Context context, UserMenu userMenu) {
        countrySlideMenuView.getClass();
        MenuState menuState = (userMenu.getMenuType() == MenuType.PRIVATE && userMenu.isProfileSelectorActive()) ? MenuState.ENABLED : MenuState.HIDDEN;
        String string = Intrinsics.areEqual(userMenu.getUserType(), UserType.ENTERPRISE.getValue()) ? context.getString(R.string.ui_menu_user_type_selector_enterprise) : context.getString(R.string.ui_menu_user_type_selector_default);
        Intrinsics.checkNotNull(string);
        return MenuBuilderKt.headerSubItem(new bc.b(string, menuState));
    }

    @Override // com.bbva.slidemenuview.presentation.SlideMenuViewContract
    @NotNull
    public HeaderMenuItem getHeaderMenuItem(@NotNull Context context, @NotNull UserMenu userMenu) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(userMenu, "userMenu");
        return MenuBuilderKt.headerMenuItem(new a(context, userMenu));
    }

    @Override // com.bbva.slidemenuview.presentation.SlideMenuViewContract
    @NotNull
    public MenuItem getMenuFooterItem(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return MenuBuilderKt.menuItem(new b(context));
    }

    @Override // com.bbva.slidemenuview.presentation.SlideMenuViewContract
    @NotNull
    public List<MenuItem> getMenuItems(@NotNull Context context, boolean isUserLogged) {
        Intrinsics.checkNotNullParameter(context, "context");
        return CollectionsKt___CollectionsKt.sortedWith(CollectionsKt__CollectionsKt.listOf((Object[]) new MenuItem[]{MenuBuilderKt.menuItem(new i(context, isUserLogged)), MenuBuilderKt.menuItem(new j(context)), MenuBuilderKt.menuItem(new k(context)), MenuBuilderKt.menuItem(new l(context)), MenuBuilderKt.menuItem(new m(context)), MenuBuilderKt.menuItem(new n(context)), MenuBuilderKt.menuItem(new o(context)), MenuBuilderKt.menuItem(new p(context)), MenuBuilderKt.menuItem(new q(context)), MenuBuilderKt.menuItem(new c(context)), MenuBuilderKt.menuItem(new d(context)), MenuBuilderKt.menuItem(new e(context)), MenuBuilderKt.menuItem(new f(context)), MenuBuilderKt.menuItem(new g(context)), MenuBuilderKt.menuItem(new h(context))}), new Comparator() { // from class: com.bbva.slidemenuview.CountrySlideMenuView$getMenuItems$$inlined$sortedBy$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t10, T t11) {
                return dk.e.compareValues(Integer.valueOf(((MenuItem) t10).getId()), Integer.valueOf(((MenuItem) t11).getId()));
            }
        });
    }
}

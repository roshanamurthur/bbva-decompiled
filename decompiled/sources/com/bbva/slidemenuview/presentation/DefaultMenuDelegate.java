package com.bbva.slidemenuview.presentation;

import androidx.camera.core.imagecapture.a;
import androidx.camera.core.impl.utils.c;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import com.bbva.bridge.dispatcher.MessageDispatcher;
import com.bbva.bridge.navigate.NavigateDispatcher;
import com.bbva.bridge.navigate.WebNavigationState;
import com.bbva.component.dm.analytics.constants.AnalyticsConstants;
import com.bbva.component.ui.loader.LoaderSpinnerViewModel;
import com.bbva.glomoconfig.constants.RouteConstants;
import com.bbva.glomohybrid.base.Animation;
import com.bbva.glomohybrid.base.cells.channels.CellsChannels;
import com.bbva.glomohybrid.base.datasource.UserStoredDatasource;
import com.bbva.glomohybrid.base.router.ActivityRouter;
import com.bbva.glomohybrid.base.router.Router;
import com.bbva.glomohybrid.base.viewmodel.ViewModelComponentsProviders;
import com.bbva.glomohybrid.logs.LoggerKt;
import com.bbva.glomoutils.mobileservices.MobileServices;
import com.bbva.slidemenuview.cells.components.dm.MenuDataManager;
import com.bbva.slidemenuview.domain.model.MenuClickAction;
import com.bbva.slidemenuview.domain.model.MenuItemAction;
import com.bbva.slidemenuview.presentation.interceptor.ClickInterceptor;
import java.util.Iterator;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.koin.core.component.KoinComponent;
import org.koin.core.component.KoinScopeComponent;
import org.koin.core.qualifier.Qualifier;
import org.koin.mp.KoinPlatformTools;

/* JADX INFO: compiled from: MenuDelegate.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001BA\u0012\u0006\u0010\u0018\u001a\u00020\u0017\u0012\u0006\u0010\u001a\u001a\u00020\u0019\u0012\u0006\u0010\u001c\u001a\u00020\u001b\u0012\u000e\b\u0002\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001e0\u001d\u0012\b\b\u0002\u0010!\u001a\u00020 \u0012\u0006\u0010#\u001a\u00020\"¢\u0006\u0004\b$\u0010%J\u001e\u0010\u0007\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003j\u0002`\u00060\u0002H\u0016J \u0010\n\u001a\u00020\t2\u0016\u0010\b\u001a\u0012\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003j\u0002`\u0006H\u0016J\u0012\u0010\r\u001a\u00020\t2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0016J\b\u0010\u000e\u001a\u00020\tH\u0016R$\u0010\u0016\u001a\u0004\u0018\u00010\u000f8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015¨\u0006&"}, d2 = {"Lcom/bbva/slidemenuview/presentation/DefaultMenuDelegate;", "Lcom/bbva/slidemenuview/presentation/MenuDelegate;", "Landroidx/lifecycle/LiveData;", "Lkotlin/Pair;", "", "", "Lcom/bbva/slidemenuview/presentation/MenuItemConsumed;", "refreshMenuObserver", "menuItemConsumed", "", "updateFeaturedItem", "Lcom/bbva/slidemenuview/domain/model/MenuClickAction;", AnalyticsConstants.Key.ITEM, "onStoreItemClicked", "onItemClicked", "Lcom/bbva/slidemenuview/presentation/CustomMenuItemClickDelegate;", "t0", "Lcom/bbva/slidemenuview/presentation/CustomMenuItemClickDelegate;", "getDelegate", "()Lcom/bbva/slidemenuview/presentation/CustomMenuItemClickDelegate;", "setDelegate", "(Lcom/bbva/slidemenuview/presentation/CustomMenuItemClickDelegate;)V", "delegate", "Lcom/bbva/glomohybrid/base/viewmodel/ViewModelComponentsProviders;", "provider", "", "loaderId", "Lcom/bbva/glomohybrid/base/router/ActivityRouter;", Router.ID, "", "Lcom/bbva/slidemenuview/presentation/interceptor/ClickInterceptor;", "interceptors", "Lkotlinx/coroutines/CoroutineScope;", "scope", "Lcom/bbva/glomoutils/mobileservices/MobileServices;", "mobileServices", "<init>", "(Lcom/bbva/glomohybrid/base/viewmodel/ViewModelComponentsProviders;Ljava/lang/String;Lcom/bbva/glomohybrid/base/router/ActivityRouter;Ljava/util/List;Lkotlinx/coroutines/CoroutineScope;Lcom/bbva/glomoutils/mobileservices/MobileServices;)V", "slidemenuview_mexicoRelease"}, k = 1, mv = {1, 9, 0})
@SourceDebugExtension({"SMAP\nMenuDelegate.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MenuDelegate.kt\ncom/bbva/slidemenuview/presentation/DefaultMenuDelegate\n+ 2 KoinComponent.kt\norg/koin/core/component/KoinComponentKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,142:1\n56#2,6:143\n56#2,6:149\n56#2,6:155\n1855#3,2:161\n*S KotlinDebug\n*F\n+ 1 MenuDelegate.kt\ncom/bbva/slidemenuview/presentation/DefaultMenuDelegate\n*L\n54#1:143,6\n55#1:149,6\n56#1:155,6\n90#1:161,2\n*E\n"})
public final class DefaultMenuDelegate implements MenuDelegate {

    @NotNull
    public final Lazy E0;

    @Nullable
    public MenuClickAction F0;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    @NotNull
    public final ActivityRouter f36749p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    @NotNull
    public final List<ClickInterceptor> f36750q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    @NotNull
    public final CoroutineScope f36751r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    @NotNull
    public final MobileServices f36752s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public CustomMenuItemClickDelegate delegate;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    @NotNull
    public final MutableLiveData<Pair<Integer, Boolean>> f36754u0;

    @NotNull
    public final Lazy v0;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    @NotNull
    public final Lazy f36755w0;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    @NotNull
    public final Lazy f36756x0;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    @NotNull
    public final Lazy f36757y0;

    /* JADX INFO: compiled from: MenuDelegate.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[MenuItemAction.values().length];
            try {
                iArr[MenuItemAction.PRIVATE_PAGE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[MenuItemAction.PAGE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[MenuItemAction.APP.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[MenuItemAction.PHONE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[MenuItemAction.CUSTOM.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: compiled from: MenuDelegate.kt */
    public static final class a extends Lambda implements Function0<LoaderSpinnerViewModel> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ ViewModelComponentsProviders f36758p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ String f36759q0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(ViewModelComponentsProviders viewModelComponentsProviders, String str) {
            super(0);
            this.f36758p0 = viewModelComponentsProviders;
            this.f36759q0 = str;
        }

        @Override // kotlin.jvm.functions.Function0
        public final LoaderSpinnerViewModel invoke() {
            Object objProvide = this.f36758p0.provide(this.f36759q0);
            if (objProvide != null) {
                return (LoaderSpinnerViewModel) objProvide;
            }
            throw new IllegalArgumentException("Required value was null.".toString());
        }
    }

    /* JADX INFO: compiled from: MenuDelegate.kt */
    public static final class b extends Lambda implements Function0<UserStoredDatasource> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ ViewModelComponentsProviders f36760p0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(ViewModelComponentsProviders viewModelComponentsProviders) {
            super(0);
            this.f36760p0 = viewModelComponentsProviders;
        }

        @Override // kotlin.jvm.functions.Function0
        public final UserStoredDatasource invoke() {
            return (UserStoredDatasource) this.f36760p0.provide(UserStoredDatasource.ID);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public DefaultMenuDelegate(@NotNull final ViewModelComponentsProviders provider, @NotNull String loaderId, @NotNull ActivityRouter router, @NotNull List<? extends ClickInterceptor> interceptors, @NotNull CoroutineScope scope, @NotNull MobileServices mobileServices) {
        Intrinsics.checkNotNullParameter(provider, "provider");
        Intrinsics.checkNotNullParameter(loaderId, "loaderId");
        Intrinsics.checkNotNullParameter(router, "router");
        Intrinsics.checkNotNullParameter(interceptors, "interceptors");
        Intrinsics.checkNotNullParameter(scope, "scope");
        Intrinsics.checkNotNullParameter(mobileServices, "mobileServices");
        this.f36749p0 = router;
        this.f36750q0 = interceptors;
        this.f36751r0 = scope;
        this.f36752s0 = mobileServices;
        this.f36754u0 = new MutableLiveData<>();
        KoinPlatformTools koinPlatformTools = KoinPlatformTools.INSTANCE;
        LazyThreadSafetyMode lazyThreadSafetyModeDefaultLazyMode = koinPlatformTools.defaultLazyMode();
        final Qualifier qualifier = null;
        final Object[] objArr = 0 == true ? 1 : 0;
        this.v0 = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyModeDefaultLazyMode, (Function0) new Function0<MessageDispatcher>() { // from class: com.bbva.slidemenuview.presentation.DefaultMenuDelegate$special$$inlined$inject$default$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v3, types: [com.bbva.bridge.dispatcher.MessageDispatcher, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final MessageDispatcher invoke() {
                KoinComponent koinComponent = provider;
                boolean z10 = koinComponent instanceof KoinScopeComponent;
                return (z10 ? ((KoinScopeComponent) koinComponent).getScope() : a.e(koinComponent)).get(Reflection.getOrCreateKotlinClass(MessageDispatcher.class), qualifier, objArr);
            }
        });
        LazyThreadSafetyMode lazyThreadSafetyModeDefaultLazyMode2 = koinPlatformTools.defaultLazyMode();
        final Object[] objArr2 = 0 == true ? 1 : 0;
        final Object[] objArr3 = 0 == true ? 1 : 0;
        this.f36755w0 = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyModeDefaultLazyMode2, (Function0) new Function0<NavigateDispatcher>() { // from class: com.bbva.slidemenuview.presentation.DefaultMenuDelegate$special$$inlined$inject$default$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v3, types: [com.bbva.bridge.navigate.NavigateDispatcher, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final NavigateDispatcher invoke() {
                KoinComponent koinComponent = provider;
                boolean z10 = koinComponent instanceof KoinScopeComponent;
                return (z10 ? ((KoinScopeComponent) koinComponent).getScope() : a.e(koinComponent)).get(Reflection.getOrCreateKotlinClass(NavigateDispatcher.class), objArr2, objArr3);
            }
        });
        LazyThreadSafetyMode lazyThreadSafetyModeDefaultLazyMode3 = koinPlatformTools.defaultLazyMode();
        final Object[] objArr4 = 0 == true ? 1 : 0;
        final Object[] objArr5 = 0 == true ? 1 : 0;
        this.f36756x0 = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyModeDefaultLazyMode3, (Function0) new Function0<MenuDataManager>() { // from class: com.bbva.slidemenuview.presentation.DefaultMenuDelegate$special$$inlined$inject$default$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v3, types: [com.bbva.slidemenuview.cells.components.dm.MenuDataManager, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final MenuDataManager invoke() {
                KoinComponent koinComponent = provider;
                boolean z10 = koinComponent instanceof KoinScopeComponent;
                return (z10 ? ((KoinScopeComponent) koinComponent).getScope() : a.e(koinComponent)).get(Reflection.getOrCreateKotlinClass(MenuDataManager.class), objArr4, objArr5);
            }
        });
        this.f36757y0 = LazyKt__LazyJVMKt.lazy(new b(provider));
        this.E0 = LazyKt__LazyJVMKt.lazy(new a(provider, loaderId));
    }

    public static final NavigateDispatcher access$getWebNavigationDispatcher(DefaultMenuDelegate defaultMenuDelegate) {
        return (NavigateDispatcher) defaultMenuDelegate.f36755w0.getValue();
    }

    public static final void access$handleWebNavigationState(DefaultMenuDelegate defaultMenuDelegate, WebNavigationState webNavigationState) {
        defaultMenuDelegate.getClass();
        boolean z10 = webNavigationState instanceof WebNavigationState.Loading;
        Lazy lazy = defaultMenuDelegate.E0;
        if (z10) {
            ((LoaderSpinnerViewModel) lazy.getValue()).showSpinner(true);
        } else if (webNavigationState instanceof WebNavigationState.Loaded) {
            ((LoaderSpinnerViewModel) lazy.getValue()).showSpinner(false);
            ActivityRouter.DefaultImpls.navigateTo$default(defaultMenuDelegate.f36749p0, "cellsweb", Animation.SlideRight.INSTANCE, null, null, 12, null);
        }
    }

    @Override // com.bbva.slidemenuview.presentation.MenuDelegate
    @Nullable
    public CustomMenuItemClickDelegate getDelegate() {
        return this.delegate;
    }

    @Override // com.bbva.slidemenuview.presentation.MenuDelegate
    public void onItemClicked() {
        CustomMenuItemClickDelegate delegate;
        MenuClickAction menuClickAction = this.F0;
        if (menuClickAction != null) {
            ((MenuDataManager) this.f36756x0.getValue()).markItemAsVisited(menuClickAction.getId());
            Iterator<T> it = this.f36750q0.iterator();
            while (it.hasNext()) {
                ((ClickInterceptor) it.next()).interceptClick(menuClickAction);
            }
            String route = menuClickAction.getRoute();
            boolean zAreEqual = Intrinsics.areEqual(route, RouteConstants.APP_FEEDBACK);
            Lazy lazy = this.v0;
            if (zAreEqual) {
                ((MessageDispatcher) lazy.getValue()).notifyEvent(CellsChannels.FEEDBACK_CHANNEL);
            } else if (Intrinsics.areEqual(route, "logout")) {
                ((MessageDispatcher) lazy.getValue()).notifyEvent(CellsChannels.LOGOUT_CHANNEL);
            } else {
                int i10 = WhenMappings.$EnumSwitchMapping$0[menuClickAction.getType().ordinal()];
                if (i10 == 1) {
                    UserStoredDatasource userStoredDatasource = (UserStoredDatasource) this.f36757y0.getValue();
                    if (userStoredDatasource != null && userStoredDatasource.isLogged()) {
                        ActivityRouter.DefaultImpls.webNavigationTo$default(this.f36749p0, menuClickAction.getRoute(), null, false, 6, null);
                    }
                } else if (i10 != 2) {
                    ActivityRouter activityRouter = this.f36749p0;
                    if (i10 == 3) {
                        activityRouter.launchApp(menuClickAction.getRoute(), this.f36752s0);
                    } else if (i10 == 4) {
                        activityRouter.launchDialer(menuClickAction.getRoute());
                    } else if (i10 == 5 && (delegate = getDelegate()) != null) {
                        delegate.handleCustomItemClick(menuClickAction);
                    }
                } else if (menuClickAction.getFromWeb()) {
                    ActivityRouter.DefaultImpls.webNavigationTo$default(this.f36749p0, menuClickAction.getRoute(), null, false, 6, null);
                } else {
                    BuildersKt__Builders_commonKt.launch$default(this.f36751r0, null, null, new dc.a(this, menuClickAction, null), 3, null);
                }
            }
            this.F0 = null;
        }
    }

    @Override // com.bbva.slidemenuview.presentation.MenuDelegate
    public void onStoreItemClicked(@Nullable MenuClickAction item) {
        String str = (item == null || !item.getFromWeb()) ? "login" : "browser";
        String route = item != null ? item.getRoute() : null;
        if (route == null) {
            route = "";
        }
        LoggerKt.logVerbose$default(c.a("[SIDEBAR][", str, "] selected item: ", route), null, 2, null);
        if (item == null) {
            item = this.F0;
        }
        this.F0 = item;
    }

    @Override // com.bbva.slidemenuview.presentation.MenuDelegate
    @NotNull
    public LiveData<Pair<Integer, Boolean>> refreshMenuObserver() {
        return this.f36754u0;
    }

    @Override // com.bbva.slidemenuview.presentation.MenuDelegate
    public void setDelegate(@Nullable CustomMenuItemClickDelegate customMenuItemClickDelegate) {
        this.delegate = customMenuItemClickDelegate;
    }

    @Override // com.bbva.slidemenuview.presentation.MenuDelegate
    public void updateFeaturedItem(@NotNull Pair<Integer, Boolean> menuItemConsumed) {
        Intrinsics.checkNotNullParameter(menuItemConsumed, "menuItemConsumed");
        this.f36754u0.setValue(menuItemConsumed);
    }

    public /* synthetic */ DefaultMenuDelegate(ViewModelComponentsProviders viewModelComponentsProviders, String str, ActivityRouter activityRouter, List list, CoroutineScope coroutineScope, MobileServices mobileServices, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(viewModelComponentsProviders, str, activityRouter, (i10 & 8) != 0 ? CollectionsKt__CollectionsKt.emptyList() : list, (i10 & 16) != 0 ? CoroutineScopeKt.MainScope() : coroutineScope, mobileServices);
    }
}

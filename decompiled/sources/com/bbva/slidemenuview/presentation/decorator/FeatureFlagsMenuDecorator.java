package com.bbva.slidemenuview.presentation.decorator;

import bk.q;
import com.bbva.glomoutils.Either;
import com.bbva.glomoutils.EitherKt;
import com.bbva.slidemenuview.cells.components.dm.infraestructure.DefaultMenuIdentifierMapper;
import com.bbva.slidemenuview.cells.components.dm.infraestructure.MenuIdentifierMapper;
import com.bbva.slidemenuview.data.MenuItemStatesBuilder;
import com.bbva.slidemenuview.data.MenuState;
import com.bbva.slidemenuview.domain.model.MenuItemSpec;
import com.bbva.slidemenuview.domain.model.MenuItems;
import com.bbva.slidemenuview.domain.model.UserMenu;
import com.bbva.slidemenuview.domain.usecase.GetFeaturedMenuUseCase;
import com.bbva.slidemenuview.extensions.MenuExtensionsKt;
import com.bbva.ui.component.menu.model.MenuItem;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.sequences.SequencesKt___SequencesKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: FeatureFlagsMenuDecorator.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ$\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¨\u0006\u000e"}, d2 = {"Lcom/bbva/slidemenuview/presentation/decorator/FeatureFlagsMenuDecorator;", "Lcom/bbva/slidemenuview/presentation/decorator/MenuDecorator;", "", "Lcom/bbva/ui/component/menu/model/MenuItem;", "menuItems", "Lcom/bbva/slidemenuview/domain/model/UserMenu;", "userMenu", "decorate", "Lcom/bbva/slidemenuview/domain/usecase/GetFeaturedMenuUseCase;", "getMenuUseCase", "Lcom/bbva/slidemenuview/cells/components/dm/infraestructure/MenuIdentifierMapper;", "menuIdMapper", "<init>", "(Lcom/bbva/slidemenuview/domain/usecase/GetFeaturedMenuUseCase;Lcom/bbva/slidemenuview/cells/components/dm/infraestructure/MenuIdentifierMapper;)V", "slidemenuview_mexicoRelease"}, k = 1, mv = {1, 9, 0})
@SourceDebugExtension({"SMAP\nFeatureFlagsMenuDecorator.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FeatureFlagsMenuDecorator.kt\ncom/bbva/slidemenuview/presentation/decorator/FeatureFlagsMenuDecorator\n+ 2 Either.kt\ncom/bbva/glomoutils/EitherKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,59:1\n46#2,3:60\n1#3:63\n*S KotlinDebug\n*F\n+ 1 FeatureFlagsMenuDecorator.kt\ncom/bbva/slidemenuview/presentation/decorator/FeatureFlagsMenuDecorator\n*L\n22#1:60,3\n*E\n"})
public final class FeatureFlagsMenuDecorator implements MenuDecorator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final GetFeaturedMenuUseCase f36770a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final MenuIdentifierMapper f36771b;

    /* JADX INFO: compiled from: FeatureFlagsMenuDecorator.kt */
    public static final class a extends Lambda implements Function1<MenuItem, MenuItem> {

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ MenuItems f36773q0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(MenuItems menuItems) {
            super(1);
            this.f36773q0 = menuItems;
        }

        @Override // kotlin.jvm.functions.Function1
        public final MenuItem invoke(MenuItem menuItem) {
            MenuItem it = menuItem;
            Intrinsics.checkNotNullParameter(it, "it");
            return FeatureFlagsMenuDecorator.access$applyStates(FeatureFlagsMenuDecorator.this, this.f36773q0.getItems(), it);
        }
    }

    /* JADX INFO: compiled from: FeatureFlagsMenuDecorator.kt */
    public static final class b extends Lambda implements Function1<MenuItem, MenuItem> {

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ MenuItems f36775q0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(MenuItems menuItems) {
            super(1);
            this.f36775q0 = menuItems;
        }

        @Override // kotlin.jvm.functions.Function1
        public final MenuItem invoke(MenuItem menuItem) {
            MenuItem it = menuItem;
            Intrinsics.checkNotNullParameter(it, "it");
            return FeatureFlagsMenuDecorator.access$applyFeatured(FeatureFlagsMenuDecorator.this, this.f36775q0.getItems(), it);
        }
    }

    public FeatureFlagsMenuDecorator(@NotNull GetFeaturedMenuUseCase getMenuUseCase, @NotNull MenuIdentifierMapper menuIdMapper) {
        Intrinsics.checkNotNullParameter(getMenuUseCase, "getMenuUseCase");
        Intrinsics.checkNotNullParameter(menuIdMapper, "menuIdMapper");
        this.f36770a = getMenuUseCase;
        this.f36771b = menuIdMapper;
    }

    public static String a(MenuItemSpec menuItemSpec, String str) {
        MenuState menuState;
        if (menuItemSpec.isHidden().contains(str)) {
            menuState = MenuState.HIDDEN;
        } else {
            menuState = menuItemSpec.isEnabled().contains(str) ? MenuState.ENABLED : MenuState.DISABLED;
        }
        return menuState.getState();
    }

    public static final MenuItem access$applyFeatured(FeatureFlagsMenuDecorator featureFlagsMenuDecorator, List list, MenuItem menuItem) {
        Object next;
        featureFlagsMenuDecorator.getClass();
        Iterator it = list.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!Intrinsics.areEqual(((MenuItemSpec) next).getId(), featureFlagsMenuDecorator.f36771b.stringIdentifier(menuItem.getId())));
        MenuItemSpec menuItemSpec = (MenuItemSpec) next;
        if (menuItemSpec == null) {
            return menuItem;
        }
        return MenuExtensionsKt.copy$default(menuItem, 0, null, 0, null, (menuItemSpec.isFeatured().isEmpty() ^ true) && !menuItemSpec.isVisited(), null, null, 111, null);
    }

    public static final MenuItem access$applyStates(FeatureFlagsMenuDecorator featureFlagsMenuDecorator, List list, MenuItem menuItem) {
        Object next;
        featureFlagsMenuDecorator.getClass();
        Iterator it = list.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!Intrinsics.areEqual(((MenuItemSpec) next).getId(), featureFlagsMenuDecorator.f36771b.stringIdentifier(menuItem.getId())));
        MenuItemSpec menuItemSpec = (MenuItemSpec) next;
        return menuItemSpec == null ? menuItem : MenuExtensionsKt.copy$default(menuItem, 0, null, 0, null, false, q.mapOf(TuplesKt.to(MenuItemStatesBuilder.USER_NO, a(menuItemSpec, "public")), TuplesKt.to(MenuItemStatesBuilder.USER_CACHED, a(menuItemSpec, "cached")), TuplesKt.to(MenuItemStatesBuilder.USER_LOGGED, a(menuItemSpec, "private"))), null, 95, null);
    }

    @Override // com.bbva.slidemenuview.presentation.decorator.MenuDecorator
    @NotNull
    public List<MenuItem> decorate(@NotNull List<? extends MenuItem> menuItems, @NotNull UserMenu userMenu) {
        Intrinsics.checkNotNullParameter(menuItems, "menuItems");
        Intrinsics.checkNotNullParameter(userMenu, "userMenu");
        Either<? extends Throwable, ? extends MenuItems> eitherExecute = this.f36770a.execute();
        if (eitherExecute instanceof Either.Right) {
            MenuItems menuItems2 = (MenuItems) ((Either.Right) eitherExecute).getValue();
            eitherExecute = EitherKt.right(SequencesKt___SequencesKt.toList(SequencesKt___SequencesKt.map(SequencesKt___SequencesKt.map(CollectionsKt___CollectionsKt.asSequence(menuItems), new a(menuItems2)), new b(menuItems2))));
        } else if (!(eitherExecute instanceof Either.Left)) {
            throw new NoWhenBranchMatchedException();
        }
        return (List) EitherKt.rightOrElse(eitherExecute, menuItems);
    }

    public /* synthetic */ FeatureFlagsMenuDecorator(GetFeaturedMenuUseCase getFeaturedMenuUseCase, MenuIdentifierMapper menuIdentifierMapper, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(getFeaturedMenuUseCase, (i10 & 2) != 0 ? new DefaultMenuIdentifierMapper() : menuIdentifierMapper);
    }
}

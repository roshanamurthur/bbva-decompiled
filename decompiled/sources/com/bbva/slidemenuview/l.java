package com.bbva.slidemenuview;

import com.bbva.slidemenuview.data.MenuItemStatesBuilder;
import com.bbva.slidemenuview.data.MenuState;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: compiled from: CountrySlideMenuView.kt */
/* JADX INFO: loaded from: classes8.dex */
public final class l extends Lambda implements Function1<MenuItemStatesBuilder, Unit> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public static final l f36744p0 = new l(1);

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(MenuItemStatesBuilder menuItemStatesBuilder) {
        MenuItemStatesBuilder states = menuItemStatesBuilder;
        Intrinsics.checkNotNullParameter(states, "$this$states");
        MenuState menuState = MenuState.DISABLED;
        states.setNoUser(menuState);
        states.setCachedUser(menuState);
        states.setLoggedUser(MenuState.ENABLED);
        return Unit.INSTANCE;
    }
}

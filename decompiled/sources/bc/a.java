package bc;

import com.bbva.slidemenuview.data.MenuItemStatesBuilder;
import com.bbva.slidemenuview.data.MenuState;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: compiled from: CountrySlideMenuView.kt */
/* JADX INFO: loaded from: classes8.dex */
public final class a extends Lambda implements Function1<MenuItemStatesBuilder, Unit> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ MenuState f24892p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(MenuState menuState) {
        super(1);
        this.f24892p0 = menuState;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(MenuItemStatesBuilder menuItemStatesBuilder) {
        MenuItemStatesBuilder states = menuItemStatesBuilder;
        Intrinsics.checkNotNullParameter(states, "$this$states");
        states.setNoUser(MenuState.HIDDEN);
        MenuState menuState = this.f24892p0;
        states.setCachedUser(menuState);
        states.setLoggedUser(menuState);
        return Unit.INSTANCE;
    }
}

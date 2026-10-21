package ic;

import com.bbva.ui.component.menu.SlideMenuView;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: compiled from: SlideMenuView.kt */
/* JADX INFO: loaded from: classes9.dex */
public final class h extends Lambda implements Function1<String, Unit> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ SlideMenuView f69589p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(SlideMenuView slideMenuView) {
        super(1);
        this.f69589p0 = slideMenuView;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(String str) {
        this.f69589p0.setState(str);
        return Unit.INSTANCE;
    }
}

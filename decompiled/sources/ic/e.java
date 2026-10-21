package ic;

import com.bbva.ui.component.menu.SlideMenuView;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* JADX INFO: compiled from: SlideMenuView.kt */
/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class e extends FunctionReferenceImpl implements Function1<Boolean, Unit> {
    public e(Object obj) {
        super(1, obj, SlideMenuView.class, "toggle", "toggle(Ljava/lang/Boolean;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Boolean bool) {
        SlideMenuView.access$toggle((SlideMenuView) this.receiver, bool);
        return Unit.INSTANCE;
    }
}

package ic;

import com.bbva.ui.component.menu.SlideMenuView;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* JADX INFO: compiled from: SlideMenuView.kt */
/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class g extends FunctionReferenceImpl implements Function1<Map<Integer, ? extends Boolean>, Unit> {
    public g(Object obj) {
        super(1, obj, SlideMenuView.class, "setupFeaturedItems", "setupFeaturedItems(Ljava/util/Map;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Map<Integer, ? extends Boolean> map) {
        ((SlideMenuView) this.receiver).setupFeaturedItems(map);
        return Unit.INSTANCE;
    }
}

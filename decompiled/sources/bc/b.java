package bc;

import com.bbva.slidemenuview.data.HeaderSubItemBuilder;
import com.bbva.slidemenuview.data.MenuState;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: compiled from: CountrySlideMenuView.kt */
/* JADX INFO: loaded from: classes8.dex */
public final class b extends Lambda implements Function1<HeaderSubItemBuilder, Unit> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ String f24893p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ MenuState f24894q0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(String str, MenuState menuState) {
        super(1);
        this.f24893p0 = str;
        this.f24894q0 = menuState;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(HeaderSubItemBuilder headerSubItemBuilder) {
        HeaderSubItemBuilder headerSubItem = headerSubItemBuilder;
        Intrinsics.checkNotNullParameter(headerSubItem, "$this$headerSubItem");
        headerSubItem.setId(1);
        headerSubItem.setText(this.f24893p0);
        headerSubItem.states(new a(this.f24894q0));
        return Unit.INSTANCE;
    }
}

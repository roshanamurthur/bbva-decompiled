package z5;

import com.bbva.component.ui.shortcuts.ShortcutsSimpleView;
import com.bbva.component.ui.shortcuts.model.ShortcutItem;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: compiled from: ShortcutsSimpleView.kt */
/* JADX INFO: loaded from: classes4.dex */
public final class b extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ ShortcutsSimpleView f94980p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ ShortcutItem f94981q0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(ShortcutsSimpleView shortcutsSimpleView, ShortcutItem shortcutItem) {
        super(0);
        this.f94980p0 = shortcutsSimpleView;
        this.f94981q0 = shortcutItem;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        this.f94980p0.getViewModel().tap$component_ui_shortcuts_release(this.f94981q0.getId());
        return Unit.INSTANCE;
    }
}

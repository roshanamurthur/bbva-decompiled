package x5;

import com.bbva.component.ui.modal.list.ListModalView;
import com.bbva.component.ui.modal.list.model.Item;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: ListModalView.kt */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class c extends FunctionReferenceImpl implements Function1<Item, Unit> {
    public c(Object obj) {
        super(1, obj, ListModalView.class, "observeItemsEvents", "observeItemsEvents(Lcom/bbva/component/ui/modal/list/model/Item;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Item item) {
        Item p4 = item;
        Intrinsics.checkNotNullParameter(p4, "p0");
        ((ListModalView) this.receiver).viewModel.itemSelected$component_ui_modal_release(p4);
        return Unit.INSTANCE;
    }
}

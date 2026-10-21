package com.bbva.component.ui.modal.list;

import com.bbva.cells.componentkit.ActionSpec;
import com.bbva.cells.componentkit.JsonDeserializer;
import com.bbva.cells.componentkit.ViewModel;
import com.bbva.component.dm.analytics.constants.AnalyticsConstants;
import com.bbva.component.ui.modal.list.model.Item;
import com.bbva.component.ui.modal.list.model.ListModalState;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: ListModalViewModel.kt */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 \u00142\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0014B\u0007¢\u0006\u0004\b\u0013\u0010\u0005J\u000f\u0010\u0006\u001a\u00020\u0003H\u0000¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\u000b\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u0007H\u0000¢\u0006\u0004\b\t\u0010\nR\u001d\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\r0\f8\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0015"}, d2 = {"Lcom/bbva/component/ui/modal/list/ListModalViewModel;", "Lcom/bbva/cells/componentkit/ViewModel;", "Lcom/bbva/component/ui/modal/list/model/ListModalState;", "", "onClose$component_ui_modal_release", "()V", "onClose", "Lcom/bbva/component/ui/modal/list/model/Item;", AnalyticsConstants.Key.ITEM, "itemSelected$component_ui_modal_release", "(Lcom/bbva/component/ui/modal/list/model/Item;)V", "itemSelected", "Lkotlinx/coroutines/flow/Flow;", "Lcom/bbva/component/ui/modal/list/ListModalEvent;", "w0", "Lkotlinx/coroutines/flow/Flow;", "getOnEvents", "()Lkotlinx/coroutines/flow/Flow;", "onEvents", "<init>", "Companion", "component-ui-modal_release"}, k = 1, mv = {1, 9, 0})
public final class ListModalViewModel extends ViewModel<ListModalState> {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    @NotNull
    public static final ActionSpec<ListModalEvent> f28716x0 = new ActionSpec<>("list-modal-event");

    /* JADX INFO: renamed from: w0, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Flow<ListModalEvent> onEvents;

    /* JADX INFO: compiled from: ListModalViewModel.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0017\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/bbva/component/ui/modal/list/ListModalViewModel$Companion;", "", "()V", "listModalEvent", "Lcom/bbva/cells/componentkit/ActionSpec;", "Lcom/bbva/component/ui/modal/list/ListModalEvent;", "getListModalEvent", "()Lcom/bbva/cells/componentkit/ActionSpec;", "component-ui-modal_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final ActionSpec<ListModalEvent> getListModalEvent() {
            return ListModalViewModel.f28716x0;
        }
    }

    public ListModalViewModel() {
        super(new JsonDeserializer(ListModalState.INSTANCE.serializer()));
        this.onEvents = events(f28716x0);
    }

    @NotNull
    public final Flow<ListModalEvent> getOnEvents() {
        return this.onEvents;
    }

    public final void itemSelected$component_ui_modal_release(@NotNull Item item) {
        Intrinsics.checkNotNullParameter(item, "item");
        fire(f28716x0, new ListModalEvent.OnItemSelected(item));
    }

    public final void onClose$component_ui_modal_release() {
        fire(f28716x0, ListModalEvent.OnClose.INSTANCE);
    }
}

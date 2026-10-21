package com.bbva.component.ui.modal.alert;

import com.bbva.cells.componentkit.ActionSpec;
import com.bbva.cells.componentkit.JsonDeserializer;
import com.bbva.cells.componentkit.ViewModel;
import com.bbva.component.ui.modal.alert.model.AlertModalState;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.coroutines.flow.Flow;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: AlertModalViewModel.kt */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 \u000f2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u000fB\u0007¢\u0006\u0004\b\u000e\u0010\u0005J\u000f\u0010\u0006\u001a\u00020\u0003H\u0000¢\u0006\u0004\b\u0004\u0010\u0005R\u001d\u0010\r\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f¨\u0006\u0010"}, d2 = {"Lcom/bbva/component/ui/modal/alert/AlertModalViewModel;", "Lcom/bbva/cells/componentkit/ViewModel;", "Lcom/bbva/component/ui/modal/alert/model/AlertModalState;", "", "onButtonTapped$component_ui_modal_release", "()V", "onButtonTapped", "Lkotlinx/coroutines/flow/Flow;", "Lcom/bbva/component/ui/modal/alert/AlertModalEvent;", "w0", "Lkotlinx/coroutines/flow/Flow;", "getOnEvents", "()Lkotlinx/coroutines/flow/Flow;", "onEvents", "<init>", "Companion", "component-ui-modal_release"}, k = 1, mv = {1, 9, 0})
public final class AlertModalViewModel extends ViewModel<AlertModalState> {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    @NotNull
    public static final ActionSpec<AlertModalEvent> f28676x0 = new ActionSpec<>("alert-modal-event");

    /* JADX INFO: renamed from: w0, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Flow<AlertModalEvent> onEvents;

    /* JADX INFO: compiled from: AlertModalViewModel.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0017\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/bbva/component/ui/modal/alert/AlertModalViewModel$Companion;", "", "()V", "alertModalEvent", "Lcom/bbva/cells/componentkit/ActionSpec;", "Lcom/bbva/component/ui/modal/alert/AlertModalEvent;", "getAlertModalEvent", "()Lcom/bbva/cells/componentkit/ActionSpec;", "component-ui-modal_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final ActionSpec<AlertModalEvent> getAlertModalEvent() {
            return AlertModalViewModel.f28676x0;
        }
    }

    public AlertModalViewModel() {
        super(new JsonDeserializer(AlertModalState.INSTANCE.serializer()));
        this.onEvents = events(f28676x0);
    }

    @NotNull
    public final Flow<AlertModalEvent> getOnEvents() {
        return this.onEvents;
    }

    public final void onButtonTapped$component_ui_modal_release() {
        fire(f28676x0, AlertModalEvent.OnPrimaryButtonTaped.INSTANCE);
    }
}

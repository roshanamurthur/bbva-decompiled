package com.bbva.component.ui.modal.halfmodal;

import com.bbva.cells.componentkit.ActionSpec;
import com.bbva.cells.componentkit.JsonDeserializer;
import com.bbva.cells.componentkit.ViewModel;
import com.bbva.component.ui.modal.halfmodal.model.HalfModalState;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: HalfModalViewModel.kt */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 \u00182\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0018B\u0007¢\u0006\u0004\b\u0016\u0010\u0017J\u000e\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003J\u000e\u0010\t\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007J\u0006\u0010\n\u001a\u00020\u0005R\u001d\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\f0\u000b8\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R \u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00120\u000b8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u000e\u001a\u0004\b\u0014\u0010\u0010¨\u0006\u0019"}, d2 = {"Lcom/bbva/component/ui/modal/halfmodal/HalfModalViewModel;", "Lcom/bbva/cells/componentkit/ViewModel;", "Lcom/bbva/component/ui/modal/halfmodal/model/HalfModalState;", "Lcom/bbva/component/ui/modal/halfmodal/HalfModalContract$ButtonType;", "buttonType", "", "buttonTapped", "Lcom/bbva/component/ui/modal/halfmodal/HalfModalContract$RadioButtonType;", "radioButtonType", "radioButtonTapped", "closing", "Lkotlinx/coroutines/flow/Flow;", "Lcom/bbva/component/ui/modal/halfmodal/HalfModalEvent;", "w0", "Lkotlinx/coroutines/flow/Flow;", "getOnEvents", "()Lkotlinx/coroutines/flow/Flow;", "onEvents", "Lcom/bbva/component/ui/modal/halfmodal/PrimaryButtonState;", "y0", "getButtonState$component_ui_modal_release", "buttonState", "<init>", "()V", "Companion", "component-ui-modal_release"}, k = 1, mv = {1, 9, 0})
public final class HalfModalViewModel extends ViewModel<HalfModalState> {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    public static final ActionSpec<HalfModalEvent> E0 = new ActionSpec<>("half-modal-event");

    /* JADX INFO: renamed from: w0, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Flow<HalfModalEvent> onEvents;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    @NotNull
    public final MutableStateFlow<PrimaryButtonState> f28692x0;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    @NotNull
    public final MutableStateFlow f28693y0;

    /* JADX INFO: compiled from: HalfModalViewModel.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0017\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/bbva/component/ui/modal/halfmodal/HalfModalViewModel$Companion;", "", "()V", "halfModalEvent", "Lcom/bbva/cells/componentkit/ActionSpec;", "Lcom/bbva/component/ui/modal/halfmodal/HalfModalEvent;", "getHalfModalEvent", "()Lcom/bbva/cells/componentkit/ActionSpec;", "component-ui-modal_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final ActionSpec<HalfModalEvent> getHalfModalEvent() {
            return HalfModalViewModel.E0;
        }
    }

    /* JADX INFO: compiled from: HalfModalViewModel.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[HalfModalContract.ButtonType.values().length];
            try {
                iArr[HalfModalContract.ButtonType.CLOSE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[HalfModalContract.ButtonType.PRIMARY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[HalfModalContract.ButtonType.SECONDARY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public HalfModalViewModel() {
        super(new JsonDeserializer(HalfModalState.INSTANCE.serializer()));
        this.onEvents = events(E0);
        MutableStateFlow<PrimaryButtonState> MutableStateFlow = StateFlowKt.MutableStateFlow(PrimaryButtonState.Disabled.INSTANCE);
        this.f28692x0 = MutableStateFlow;
        this.f28693y0 = MutableStateFlow;
    }

    public final void buttonTapped(@NotNull HalfModalContract.ButtonType buttonType) {
        Intrinsics.checkNotNullParameter(buttonType, "buttonType");
        int i10 = WhenMappings.$EnumSwitchMapping$0[buttonType.ordinal()];
        ActionSpec<HalfModalEvent> actionSpec = E0;
        if (i10 == 1) {
            fire(actionSpec, HalfModalEvent.OnCloseButtonTaped.INSTANCE);
        } else if (i10 == 2) {
            fire(actionSpec, HalfModalEvent.OnPrimaryButtonTaped.INSTANCE);
        } else {
            if (i10 != 3) {
                return;
            }
            fire(actionSpec, HalfModalEvent.OnSecondaryButtonTaped.INSTANCE);
        }
    }

    public final void closing() {
        fire(E0, HalfModalEvent.OnClosing.INSTANCE);
    }

    @NotNull
    public final Flow<PrimaryButtonState> getButtonState$component_ui_modal_release() {
        return this.f28693y0;
    }

    @NotNull
    public final Flow<HalfModalEvent> getOnEvents() {
        return this.onEvents;
    }

    public final void radioButtonTapped(@NotNull HalfModalContract.RadioButtonType radioButtonType) {
        Intrinsics.checkNotNullParameter(radioButtonType, "radioButtonType");
        fire(E0, new HalfModalEvent.OnRadioButtonTapped(radioButtonType));
        this.f28692x0.setValue(PrimaryButtonState.Enabled.INSTANCE);
    }
}

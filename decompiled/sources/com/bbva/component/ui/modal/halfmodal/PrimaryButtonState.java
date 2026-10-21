package com.bbva.component.ui.modal.halfmodal;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: HalfModalViewModel.kt */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0003\u0004B\u0007\b\u0004¢\u0006\u0002\u0010\u0002\u0082\u0001\u0002\u0005\u0006¨\u0006\u0007"}, d2 = {"Lcom/bbva/component/ui/modal/halfmodal/PrimaryButtonState;", "", "()V", "Disabled", "Enabled", "Lcom/bbva/component/ui/modal/halfmodal/PrimaryButtonState$Disabled;", "Lcom/bbva/component/ui/modal/halfmodal/PrimaryButtonState$Enabled;", "component-ui-modal_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public abstract class PrimaryButtonState {

    /* JADX INFO: compiled from: HalfModalViewModel.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/bbva/component/ui/modal/halfmodal/PrimaryButtonState$Disabled;", "Lcom/bbva/component/ui/modal/halfmodal/PrimaryButtonState;", "()V", "component-ui-modal_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Disabled extends PrimaryButtonState {

        @NotNull
        public static final Disabled INSTANCE = new Disabled();

        public Disabled() {
            super(null);
        }
    }

    /* JADX INFO: compiled from: HalfModalViewModel.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/bbva/component/ui/modal/halfmodal/PrimaryButtonState$Enabled;", "Lcom/bbva/component/ui/modal/halfmodal/PrimaryButtonState;", "()V", "component-ui-modal_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Enabled extends PrimaryButtonState {

        @NotNull
        public static final Enabled INSTANCE = new Enabled();

        public Enabled() {
            super(null);
        }
    }

    public PrimaryButtonState() {
    }

    public /* synthetic */ PrimaryButtonState(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}

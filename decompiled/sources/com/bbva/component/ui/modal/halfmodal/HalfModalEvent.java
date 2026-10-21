package com.bbva.component.ui.modal.halfmodal;

import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: HalfModalViewModel.kt */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0005\u0003\u0004\u0005\u0006\u0007B\u0007\b\u0004¢\u0006\u0002\u0010\u0002\u0082\u0001\u0005\b\t\n\u000b\f¨\u0006\r"}, d2 = {"Lcom/bbva/component/ui/modal/halfmodal/HalfModalEvent;", "", "()V", "OnCloseButtonTaped", "OnClosing", "OnPrimaryButtonTaped", "OnRadioButtonTapped", "OnSecondaryButtonTaped", "Lcom/bbva/component/ui/modal/halfmodal/HalfModalEvent$OnCloseButtonTaped;", "Lcom/bbva/component/ui/modal/halfmodal/HalfModalEvent$OnClosing;", "Lcom/bbva/component/ui/modal/halfmodal/HalfModalEvent$OnPrimaryButtonTaped;", "Lcom/bbva/component/ui/modal/halfmodal/HalfModalEvent$OnRadioButtonTapped;", "Lcom/bbva/component/ui/modal/halfmodal/HalfModalEvent$OnSecondaryButtonTaped;", "component-ui-modal_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public abstract class HalfModalEvent {

    /* JADX INFO: compiled from: HalfModalViewModel.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/bbva/component/ui/modal/halfmodal/HalfModalEvent$OnCloseButtonTaped;", "Lcom/bbva/component/ui/modal/halfmodal/HalfModalEvent;", "()V", "component-ui-modal_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class OnCloseButtonTaped extends HalfModalEvent {

        @NotNull
        public static final OnCloseButtonTaped INSTANCE = new OnCloseButtonTaped();

        public OnCloseButtonTaped() {
            super(null);
        }
    }

    /* JADX INFO: compiled from: HalfModalViewModel.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/bbva/component/ui/modal/halfmodal/HalfModalEvent$OnClosing;", "Lcom/bbva/component/ui/modal/halfmodal/HalfModalEvent;", "()V", "component-ui-modal_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class OnClosing extends HalfModalEvent {

        @NotNull
        public static final OnClosing INSTANCE = new OnClosing();

        public OnClosing() {
            super(null);
        }
    }

    /* JADX INFO: compiled from: HalfModalViewModel.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/bbva/component/ui/modal/halfmodal/HalfModalEvent$OnPrimaryButtonTaped;", "Lcom/bbva/component/ui/modal/halfmodal/HalfModalEvent;", "()V", "component-ui-modal_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class OnPrimaryButtonTaped extends HalfModalEvent {

        @NotNull
        public static final OnPrimaryButtonTaped INSTANCE = new OnPrimaryButtonTaped();

        public OnPrimaryButtonTaped() {
            super(null);
        }
    }

    /* JADX INFO: compiled from: HalfModalViewModel.kt */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\u0013\u0010\u0005\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001J\t\u0010\u0007\u001a\u00020\u0006HÖ\u0001J\t\u0010\t\u001a\u00020\bHÖ\u0001J\u0013\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0014"}, d2 = {"Lcom/bbva/component/ui/modal/halfmodal/HalfModalEvent$OnRadioButtonTapped;", "Lcom/bbva/component/ui/modal/halfmodal/HalfModalEvent;", "Lcom/bbva/component/ui/modal/halfmodal/HalfModalContract$RadioButtonType;", "component1", "selected", "copy", "", "toString", "", GenerateActivationFormCommand.HASH_CODE, "", "other", "", "equals", "a", "Lcom/bbva/component/ui/modal/halfmodal/HalfModalContract$RadioButtonType;", "getSelected", "()Lcom/bbva/component/ui/modal/halfmodal/HalfModalContract$RadioButtonType;", "<init>", "(Lcom/bbva/component/ui/modal/halfmodal/HalfModalContract$RadioButtonType;)V", "component-ui-modal_release"}, k = 1, mv = {1, 9, 0})
    public static final /* data */ class OnRadioButtonTapped extends HalfModalEvent {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final HalfModalContract.RadioButtonType selected;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OnRadioButtonTapped(@NotNull HalfModalContract.RadioButtonType selected) {
            super(null);
            Intrinsics.checkNotNullParameter(selected, "selected");
            this.selected = selected;
        }

        public static /* synthetic */ OnRadioButtonTapped copy$default(OnRadioButtonTapped onRadioButtonTapped, HalfModalContract.RadioButtonType radioButtonType, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                radioButtonType = onRadioButtonTapped.selected;
            }
            return onRadioButtonTapped.copy(radioButtonType);
        }

        @NotNull
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final HalfModalContract.RadioButtonType getSelected() {
            return this.selected;
        }

        @NotNull
        public final OnRadioButtonTapped copy(@NotNull HalfModalContract.RadioButtonType selected) {
            Intrinsics.checkNotNullParameter(selected, "selected");
            return new OnRadioButtonTapped(selected);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof OnRadioButtonTapped) && this.selected == ((OnRadioButtonTapped) other).selected;
        }

        @NotNull
        public final HalfModalContract.RadioButtonType getSelected() {
            return this.selected;
        }

        public int hashCode() {
            return this.selected.hashCode();
        }

        @NotNull
        public String toString() {
            return "OnRadioButtonTapped(selected=" + this.selected + ")";
        }
    }

    /* JADX INFO: compiled from: HalfModalViewModel.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/bbva/component/ui/modal/halfmodal/HalfModalEvent$OnSecondaryButtonTaped;", "Lcom/bbva/component/ui/modal/halfmodal/HalfModalEvent;", "()V", "component-ui-modal_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class OnSecondaryButtonTaped extends HalfModalEvent {

        @NotNull
        public static final OnSecondaryButtonTaped INSTANCE = new OnSecondaryButtonTaped();

        public OnSecondaryButtonTaped() {
            super(null);
        }
    }

    public HalfModalEvent() {
    }

    public /* synthetic */ HalfModalEvent(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}

package com.bbva.component.ui.modal.alert;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: AlertModalViewModel.kt */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0001\u0003B\u0007\b\u0004¢\u0006\u0002\u0010\u0002\u0082\u0001\u0001\u0004¨\u0006\u0005"}, d2 = {"Lcom/bbva/component/ui/modal/alert/AlertModalEvent;", "", "()V", "OnPrimaryButtonTaped", "Lcom/bbva/component/ui/modal/alert/AlertModalEvent$OnPrimaryButtonTaped;", "component-ui-modal_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public abstract class AlertModalEvent {

    /* JADX INFO: compiled from: AlertModalViewModel.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/bbva/component/ui/modal/alert/AlertModalEvent$OnPrimaryButtonTaped;", "Lcom/bbva/component/ui/modal/alert/AlertModalEvent;", "()V", "component-ui-modal_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class OnPrimaryButtonTaped extends AlertModalEvent {

        @NotNull
        public static final OnPrimaryButtonTaped INSTANCE = new OnPrimaryButtonTaped();

        public OnPrimaryButtonTaped() {
            super(null);
        }
    }

    public AlertModalEvent() {
    }

    public /* synthetic */ AlertModalEvent(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}

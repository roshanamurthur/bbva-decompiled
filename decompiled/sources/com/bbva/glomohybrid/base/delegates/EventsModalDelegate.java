package com.bbva.glomohybrid.base.delegates;

import com.bbva.glomohybrid.base.models.ModalType;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: EventsModalDelegate.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0007"}, d2 = {"Lcom/bbva/glomohybrid/base/delegates/EventsModalDelegate;", "", "onModalCancelClick", "", "modal", "Lcom/bbva/glomohybrid/base/models/ModalType;", "onModalConfirmClick", "Base_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public interface EventsModalDelegate {

    /* JADX INFO: compiled from: EventsModalDelegate.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class DefaultImpls {
        public static void onModalCancelClick(@NotNull EventsModalDelegate eventsModalDelegate, @NotNull ModalType modal) {
            Intrinsics.checkNotNullParameter(modal, "modal");
        }

        public static void onModalConfirmClick(@NotNull EventsModalDelegate eventsModalDelegate, @NotNull ModalType modal) {
            Intrinsics.checkNotNullParameter(modal, "modal");
        }
    }

    void onModalCancelClick(@NotNull ModalType modal);

    void onModalConfirmClick(@NotNull ModalType modal);
}

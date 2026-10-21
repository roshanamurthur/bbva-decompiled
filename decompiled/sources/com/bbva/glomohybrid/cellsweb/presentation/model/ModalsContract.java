package com.bbva.glomohybrid.cellsweb.presentation.model;

import com.bbva.glomohybrid.base.models.ModalType;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: ModalsContract.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0001\u0003B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0004"}, d2 = {"Lcom/bbva/glomohybrid/cellsweb/presentation/model/ModalsContract;", "", "()V", "Intent", "CellsWeb_mexicoRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class ModalsContract {

    /* JADX INFO: compiled from: ModalsContract.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\b\tR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\u0082\u0001\u0002\n\u000b¨\u0006\f"}, d2 = {"Lcom/bbva/glomohybrid/cellsweb/presentation/model/ModalsContract$Intent;", "", "Lcom/bbva/glomohybrid/base/models/ModalType;", "a", "Lcom/bbva/glomohybrid/base/models/ModalType;", "getModal", "()Lcom/bbva/glomohybrid/base/models/ModalType;", "modal", "CancelClick", "ConfirmClick", "Lcom/bbva/glomohybrid/cellsweb/presentation/model/ModalsContract$Intent$CancelClick;", "Lcom/bbva/glomohybrid/cellsweb/presentation/model/ModalsContract$Intent$ConfirmClick;", "CellsWeb_mexicoRelease"}, k = 1, mv = {1, 9, 0})
    public static abstract class Intent {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final ModalType modal;

        /* JADX INFO: compiled from: ModalsContract.kt */
        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/bbva/glomohybrid/cellsweb/presentation/model/ModalsContract$Intent$CancelClick;", "Lcom/bbva/glomohybrid/cellsweb/presentation/model/ModalsContract$Intent;", "modal", "Lcom/bbva/glomohybrid/base/models/ModalType;", "(Lcom/bbva/glomohybrid/base/models/ModalType;)V", "CellsWeb_mexicoRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class CancelClick extends Intent {
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public CancelClick(@NotNull ModalType modal) {
                super(modal, null);
                Intrinsics.checkNotNullParameter(modal, "modal");
            }
        }

        /* JADX INFO: compiled from: ModalsContract.kt */
        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/bbva/glomohybrid/cellsweb/presentation/model/ModalsContract$Intent$ConfirmClick;", "Lcom/bbva/glomohybrid/cellsweb/presentation/model/ModalsContract$Intent;", "modal", "Lcom/bbva/glomohybrid/base/models/ModalType;", "(Lcom/bbva/glomohybrid/base/models/ModalType;)V", "CellsWeb_mexicoRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class ConfirmClick extends Intent {
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public ConfirmClick(@NotNull ModalType modal) {
                super(modal, null);
                Intrinsics.checkNotNullParameter(modal, "modal");
            }
        }

        public Intent(ModalType modalType, DefaultConstructorMarker defaultConstructorMarker) {
            this.modal = modalType;
        }

        @NotNull
        public final ModalType getModal() {
            return this.modal;
        }
    }
}

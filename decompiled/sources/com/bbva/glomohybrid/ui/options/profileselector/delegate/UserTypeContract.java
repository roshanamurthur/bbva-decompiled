package com.bbva.glomohybrid.ui.options.profileselector.delegate;

import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import com.bbva.glomohybrid.base.models.ModalType;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: UserTypeContract.kt */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0001\u0003B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0004"}, d2 = {"Lcom/bbva/glomohybrid/ui/options/profileselector/delegate/UserTypeContract;", "", "()V", "Event", "gl-ui_mexicoRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class UserTypeContract {

    /* JADX INFO: compiled from: UserTypeContract.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0001\u0003B\u0007\b\u0004¢\u0006\u0002\u0010\u0002\u0082\u0001\u0001\u0004¨\u0006\u0005"}, d2 = {"Lcom/bbva/glomohybrid/ui/options/profileselector/delegate/UserTypeContract$Event;", "", "()V", "ShowModal", "Lcom/bbva/glomohybrid/ui/options/profileselector/delegate/UserTypeContract$Event$ShowModal;", "gl-ui_mexicoRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static abstract class Event {

        /* JADX INFO: compiled from: UserTypeContract.kt */
        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\u0013\u0010\u0005\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001J\t\u0010\u0007\u001a\u00020\u0006HÖ\u0001J\t\u0010\t\u001a\u00020\bHÖ\u0001J\u0013\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0014"}, d2 = {"Lcom/bbva/glomohybrid/ui/options/profileselector/delegate/UserTypeContract$Event$ShowModal;", "Lcom/bbva/glomohybrid/ui/options/profileselector/delegate/UserTypeContract$Event;", "Lcom/bbva/glomohybrid/base/models/ModalType;", "component1", "modal", "copy", "", "toString", "", GenerateActivationFormCommand.HASH_CODE, "", "other", "", "equals", "a", "Lcom/bbva/glomohybrid/base/models/ModalType;", "getModal", "()Lcom/bbva/glomohybrid/base/models/ModalType;", "<init>", "(Lcom/bbva/glomohybrid/base/models/ModalType;)V", "gl-ui_mexicoRelease"}, k = 1, mv = {1, 9, 0})
        public static final /* data */ class ShowModal extends Event {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
            @NotNull
            public final ModalType modal;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public ShowModal(@NotNull ModalType modal) {
                super(null);
                Intrinsics.checkNotNullParameter(modal, "modal");
                this.modal = modal;
            }

            public static /* synthetic */ ShowModal copy$default(ShowModal showModal, ModalType modalType, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    modalType = showModal.modal;
                }
                return showModal.copy(modalType);
            }

            @NotNull
            /* JADX INFO: renamed from: component1, reason: from getter */
            public final ModalType getModal() {
                return this.modal;
            }

            @NotNull
            public final ShowModal copy(@NotNull ModalType modal) {
                Intrinsics.checkNotNullParameter(modal, "modal");
                return new ShowModal(modal);
            }

            public boolean equals(@Nullable Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof ShowModal) && Intrinsics.areEqual(this.modal, ((ShowModal) other).modal);
            }

            @NotNull
            public final ModalType getModal() {
                return this.modal;
            }

            public int hashCode() {
                return this.modal.hashCode();
            }

            @NotNull
            public String toString() {
                return "ShowModal(modal=" + this.modal + ")";
            }
        }

        public Event() {
        }

        public /* synthetic */ Event(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }
}

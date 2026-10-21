package com.bbva.glomohybrid.cellsweb.presentation.view;

import androidx.fragment.app.FragmentActivity;
import com.bbva.component.ui.modal.halfmodal.HalfModalComponent;
import com.bbva.ethermobilesdk.geolocation.utils.ConstantsKt;
import com.bbva.glomoconfig.factory.HalfModalComponentFactory;
import com.bbva.glomohybrid.base.models.ModalType;
import com.bbva.glomohybrid.cellsweb.provider.modal.FullModalProvider;
import com.bbva.glomohybrid.ui.modals.changeuser.FullScreenModalFactory;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: CountrySingleAppModalsView.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\u0012\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0016J\u0010\u0010\u000f\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0014¨\u0006\u0010"}, d2 = {"Lcom/bbva/glomohybrid/cellsweb/presentation/view/CountrySingleAppModalsView;", "Lcom/bbva/glomohybrid/cellsweb/presentation/view/SingleAppModalsView;", ConstantsKt.DETECTED_ACTIVITY_EXTRA_ID, "Landroidx/fragment/app/FragmentActivity;", "fullModalFactory", "Lcom/bbva/glomohybrid/ui/modals/changeuser/FullScreenModalFactory;", "fullModalProvider", "Lcom/bbva/glomohybrid/cellsweb/provider/modal/FullModalProvider;", "halfModalComponent", "Lcom/bbva/component/ui/modal/halfmodal/HalfModalComponent;", "(Landroidx/fragment/app/FragmentActivity;Lcom/bbva/glomohybrid/ui/modals/changeuser/FullScreenModalFactory;Lcom/bbva/glomohybrid/cellsweb/provider/modal/FullModalProvider;Lcom/bbva/component/ui/modal/halfmodal/HalfModalComponent;)V", "show", "", "modal", "Lcom/bbva/glomohybrid/base/models/ModalType;", "showHalfModal", "CellsWeb_mexicoRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class CountrySingleAppModalsView extends SingleAppModalsView {
    public /* synthetic */ CountrySingleAppModalsView(FragmentActivity fragmentActivity, FullScreenModalFactory fullScreenModalFactory, FullModalProvider fullModalProvider, HalfModalComponent halfModalComponent, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(fragmentActivity, fullScreenModalFactory, (i10 & 4) != 0 ? new FullModalProvider() : fullModalProvider, halfModalComponent);
    }

    @Override // com.bbva.glomohybrid.cellsweb.presentation.view.SingleAppModalsView, com.bbva.glomohybrid.cellsweb.presentation.view.ModalsView
    public void show(@Nullable ModalType modal) {
        if (modal instanceof ModalType.ErrorSSONoPhone) {
            if (((ModalType.ErrorSSONoPhone) modal).getAttemps() >= 2) {
                showFullModal(modal);
                return;
            } else {
                showHalfModal(modal);
                return;
            }
        }
        if (modal instanceof ModalType.ChangeUserWithFeaturesList) {
            showFullModal(modal);
        } else if (modal instanceof ModalType.ChangeUser) {
            showHalfModal(modal);
        } else {
            super.show(modal);
        }
    }

    @Override // com.bbva.glomohybrid.cellsweb.presentation.view.SingleAppModalsView
    public void showHalfModal(@NotNull ModalType modal) {
        Intrinsics.checkNotNullParameter(modal, "modal");
        if (modal instanceof ModalType.ChangeUser) {
            observeModalsEvents(getHalfModalComponent().configure(HalfModalComponentFactory.INSTANCE.changeUser(((ModalType.ChangeUser) modal).getUserName())).show(getCom.bbva.ethermobilesdk.geolocation.utils.ConstantsKt.DETECTED_ACTIVITY_EXTRA_ID java.lang.String()), modal);
        } else {
            super.showHalfModal(modal);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CountrySingleAppModalsView(@NotNull FragmentActivity activity, @NotNull FullScreenModalFactory fullModalFactory, @NotNull FullModalProvider fullModalProvider, @NotNull HalfModalComponent halfModalComponent) {
        super(activity, fullModalFactory, fullModalProvider, halfModalComponent);
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(fullModalFactory, "fullModalFactory");
        Intrinsics.checkNotNullParameter(fullModalProvider, "fullModalProvider");
        Intrinsics.checkNotNullParameter(halfModalComponent, "halfModalComponent");
    }
}

package com.bbva.component.ui.modal.halfmodal.views;

import androidx.fragment.app.FragmentActivity;
import com.bbva.component.ui.modal.halfmodal.HalfModalViewModel;
import com.bbva.ethermobilesdk.geolocation.utils.ConstantsKt;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: HalfModalView.kt */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH&R\u0018\u0010\u0002\u001a\u00020\u0003X¦\u000e¢\u0006\f\u001a\u0004\b\u0004\u0010\u0005\"\u0004\b\u0006\u0010\u0007¨\u0006\f"}, d2 = {"Lcom/bbva/component/ui/modal/halfmodal/views/HalfModalView;", "", "viewModel", "Lcom/bbva/component/ui/modal/halfmodal/HalfModalViewModel;", "getViewModel", "()Lcom/bbva/component/ui/modal/halfmodal/HalfModalViewModel;", "setViewModel", "(Lcom/bbva/component/ui/modal/halfmodal/HalfModalViewModel;)V", "show", "", ConstantsKt.DETECTED_ACTIVITY_EXTRA_ID, "Landroidx/fragment/app/FragmentActivity;", "component-ui-modal_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public interface HalfModalView {
    @NotNull
    HalfModalViewModel getViewModel();

    void setViewModel(@NotNull HalfModalViewModel halfModalViewModel);

    void show(@NotNull FragmentActivity activity);
}

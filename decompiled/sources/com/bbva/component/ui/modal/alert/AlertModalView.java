package com.bbva.component.ui.modal.alert;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.fragment.app.DialogFragment;
import androidx.lifecycle.LifecycleOwnerKt;
import com.bbva.component.ui.modal.alert.model.AlertModalState;
import com.bbva.component.ui.modal.databinding.ViewAlertModalContentBinding;
import com.bbva.ui.widget.BbvaButton;
import k5.a;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import v5.b;

/* JADX INFO: compiled from: AlertModalView.kt */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000 \u00152\u00020\u0001:\u0001\u0015B\u0007¢\u0006\u0004\b\u0013\u0010\u0014J$\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016J\u001a\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016R\u0017\u0010\u0012\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0016"}, d2 = {"Lcom/bbva/component/ui/modal/alert/AlertModalView;", "Landroidx/fragment/app/DialogFragment;", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "onCreateView", "view", "", "onViewCreated", "Lcom/bbva/component/ui/modal/alert/AlertModalViewModel;", "q0", "Lcom/bbva/component/ui/modal/alert/AlertModalViewModel;", "getViewModel", "()Lcom/bbva/component/ui/modal/alert/AlertModalViewModel;", "viewModel", "<init>", "()V", "Companion", "component-ui-modal_release"}, k = 1, mv = {1, 9, 0})
public final class AlertModalView extends DialogFragment {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    public static final String TAG = "AlertModalView";

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public ViewAlertModalContentBinding f28674p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final AlertModalViewModel viewModel = new AlertModalViewModel();

    /* JADX INFO: compiled from: AlertModalView.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/bbva/component/ui/modal/alert/AlertModalView$Companion;", "", "()V", "TAG", "", "component-ui-modal_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public static final void access$updateView(AlertModalView alertModalView, AlertModalState alertModalState) {
        if (alertModalView.f28674p0 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        }
        ViewAlertModalContentBinding viewAlertModalContentBinding = alertModalView.f28674p0;
        ViewAlertModalContentBinding viewAlertModalContentBinding2 = null;
        if (viewAlertModalContentBinding == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            viewAlertModalContentBinding = null;
        }
        viewAlertModalContentBinding.title.setText(alertModalState.getTitle());
        ViewAlertModalContentBinding viewAlertModalContentBinding3 = alertModalView.f28674p0;
        if (viewAlertModalContentBinding3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            viewAlertModalContentBinding3 = null;
        }
        viewAlertModalContentBinding3.message.setText(alertModalState.getMessage());
        ViewAlertModalContentBinding viewAlertModalContentBinding4 = alertModalView.f28674p0;
        if (viewAlertModalContentBinding4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            viewAlertModalContentBinding2 = viewAlertModalContentBinding4;
        }
        BbvaButton bbvaButton = viewAlertModalContentBinding2.primaryButton;
        bbvaButton.setText(alertModalState.getButton().getTitle());
        bbvaButton.setVisibility(alertModalState.getButton().isVisible() ? 0 : 8);
    }

    @NotNull
    public final AlertModalViewModel getViewModel() {
        return this.viewModel;
    }

    @Override // androidx.fragment.app.Fragment
    @NotNull
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        ViewAlertModalContentBinding viewAlertModalContentBindingInflate = ViewAlertModalContentBinding.inflate(inflater, container, false);
        Intrinsics.checkNotNullExpressionValue(viewAlertModalContentBindingInflate, "inflate(...)");
        this.f28674p0 = viewAlertModalContentBindingInflate;
        if (viewAlertModalContentBindingInflate == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            viewAlertModalContentBindingInflate = null;
        }
        FrameLayout root = viewAlertModalContentBindingInflate.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
        return root;
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        ViewAlertModalContentBinding viewAlertModalContentBinding = null;
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new b(this, null), 3, null);
        ViewAlertModalContentBinding viewAlertModalContentBinding2 = this.f28674p0;
        if (viewAlertModalContentBinding2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            viewAlertModalContentBinding = viewAlertModalContentBinding2;
        }
        viewAlertModalContentBinding.primaryButton.setOnClickListener(new a(this, 1));
    }
}

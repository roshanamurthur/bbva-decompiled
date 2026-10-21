package com.bbva.component.ui.modal.halfmodal.views;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.LifecycleOwnerKt;
import com.bbva.component.ui.modal.databinding.ViewHalfModalContentBinding;
import com.bbva.component.ui.modal.halfmodal.HalfModalViewModel;
import com.bbva.component.ui.modal.halfmodal.model.ButtonConfig;
import com.bbva.component.ui.modal.halfmodal.model.HalfModalState;
import com.bbva.ethermobilesdk.geolocation.utils.ConstantsKt;
import com.bbva.ui.widget.BbvaButton;
import com.google.android.material.bottomsheet.BottomSheetDialogFragment;
import k5.b;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import n4.j;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import w5.a;
import w5.e;

/* JADX INFO: compiled from: DefaultHalfModalView.kt */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u0000 \u001e2\u00020\u00012\u00020\u0002:\u0001\u001eB\u0007¢\u0006\u0004\b\u001c\u0010\u001dJ$\u0010\n\u001a\u00020\t2\u0006\u0010\u0004\u001a\u00020\u00032\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0016J\u001a\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0016J\u0010\u0010\u0010\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016J\u0010\u0010\u0013\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0016R\"\u0010\u001b\u001a\u00020\u00148\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001a¨\u0006\u001f"}, d2 = {"Lcom/bbva/component/ui/modal/halfmodal/views/DefaultHalfModalView;", "Lcom/bbva/component/ui/modal/halfmodal/views/HalfModalView;", "Lcom/google/android/material/bottomsheet/BottomSheetDialogFragment;", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "onCreateView", "view", "", "onViewCreated", "Landroidx/fragment/app/FragmentActivity;", ConstantsKt.DETECTED_ACTIVITY_EXTRA_ID, "show", "Landroid/content/DialogInterface;", "dialog", "onDismiss", "Lcom/bbva/component/ui/modal/halfmodal/HalfModalViewModel;", "p0", "Lcom/bbva/component/ui/modal/halfmodal/HalfModalViewModel;", "getViewModel", "()Lcom/bbva/component/ui/modal/halfmodal/HalfModalViewModel;", "setViewModel", "(Lcom/bbva/component/ui/modal/halfmodal/HalfModalViewModel;)V", "viewModel", "<init>", "()V", "Companion", "component-ui-modal_release"}, k = 1, mv = {1, 9, 0})
@SourceDebugExtension({"SMAP\nDefaultHalfModalView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DefaultHalfModalView.kt\ncom/bbva/component/ui/modal/halfmodal/views/DefaultHalfModalView\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,100:1\n1#2:101\n*E\n"})
public final class DefaultHalfModalView extends BottomSheetDialogFragment implements HalfModalView {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    public static final String TAG = "HalfModalDefaultView";

    /* JADX INFO: renamed from: p0, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public HalfModalViewModel viewModel = new HalfModalViewModel();

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public ViewHalfModalContentBinding f28708q0;

    /* JADX INFO: compiled from: DefaultHalfModalView.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/bbva/component/ui/modal/halfmodal/views/DefaultHalfModalView$Companion;", "", "()V", "TAG", "", "component-ui-modal_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public static final void access$updateView(DefaultHalfModalView defaultHalfModalView, HalfModalState halfModalState) {
        ViewHalfModalContentBinding viewHalfModalContentBinding = defaultHalfModalView.f28708q0;
        if (viewHalfModalContentBinding == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            viewHalfModalContentBinding = null;
        }
        viewHalfModalContentBinding.title.setText(halfModalState.getTitle());
        viewHalfModalContentBinding.iconActionClose.setImageResource(halfModalState.getActionIcon());
        Integer image = halfModalState.getImage();
        if (image != null) {
            viewHalfModalContentBinding.iconImage.setImageResource(image.intValue());
        }
        viewHalfModalContentBinding.message.setText(halfModalState.getMessage());
        BbvaButton bbvaButton = viewHalfModalContentBinding.primaryButton;
        ButtonConfig primaryButtonText = halfModalState.getPrimaryButtonText();
        bbvaButton.setText(primaryButtonText != null ? primaryButtonText.getTitle() : null);
        ButtonConfig primaryButtonText2 = halfModalState.getPrimaryButtonText();
        int i10 = 8;
        bbvaButton.setVisibility((primaryButtonText2 == null || !primaryButtonText2.isVisible()) ? 8 : 0);
        BbvaButton bbvaButton2 = viewHalfModalContentBinding.secondaryButton;
        ButtonConfig secondaryButtonText = halfModalState.getSecondaryButtonText();
        bbvaButton2.setText(secondaryButtonText != null ? secondaryButtonText.getTitle() : null);
        ButtonConfig secondaryButtonText2 = halfModalState.getSecondaryButtonText();
        if (secondaryButtonText2 != null && secondaryButtonText2.isVisible()) {
            i10 = 0;
        }
        bbvaButton2.setVisibility(i10);
    }

    @Override // com.bbva.component.ui.modal.halfmodal.views.HalfModalView
    @NotNull
    public HalfModalViewModel getViewModel() {
        return this.viewModel;
    }

    @Override // androidx.fragment.app.Fragment
    @NotNull
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        ViewHalfModalContentBinding viewHalfModalContentBindingInflate = ViewHalfModalContentBinding.inflate(inflater, container, false);
        Intrinsics.checkNotNullExpressionValue(viewHalfModalContentBindingInflate, "inflate(...)");
        this.f28708q0 = viewHalfModalContentBindingInflate;
        if (viewHalfModalContentBindingInflate == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            viewHalfModalContentBindingInflate = null;
        }
        FrameLayout root = viewHalfModalContentBindingInflate.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
        return root;
    }

    @Override // androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnDismissListener
    public void onDismiss(@NotNull DialogInterface dialog) {
        Intrinsics.checkNotNullParameter(dialog, "dialog");
        super.onDismiss(dialog);
        getViewModel().closing();
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        ViewHalfModalContentBinding viewHalfModalContentBinding = null;
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new e(this, null), 3, null);
        ViewHalfModalContentBinding viewHalfModalContentBinding2 = this.f28708q0;
        if (viewHalfModalContentBinding2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            viewHalfModalContentBinding2 = null;
        }
        int i10 = 1;
        viewHalfModalContentBinding2.iconActionClose.setOnClickListener(new b(this, i10));
        ViewHalfModalContentBinding viewHalfModalContentBinding3 = this.f28708q0;
        if (viewHalfModalContentBinding3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            viewHalfModalContentBinding3 = null;
        }
        viewHalfModalContentBinding3.primaryButton.setOnClickListener(new a(this, 0));
        ViewHalfModalContentBinding viewHalfModalContentBinding4 = this.f28708q0;
        if (viewHalfModalContentBinding4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            viewHalfModalContentBinding = viewHalfModalContentBinding4;
        }
        viewHalfModalContentBinding.secondaryButton.setOnClickListener(new j(this, i10));
    }

    @Override // com.bbva.component.ui.modal.halfmodal.views.HalfModalView
    public void setViewModel(@NotNull HalfModalViewModel halfModalViewModel) {
        Intrinsics.checkNotNullParameter(halfModalViewModel, "<set-?>");
        this.viewModel = halfModalViewModel;
    }

    @Override // com.bbva.component.ui.modal.halfmodal.views.HalfModalView
    public void show(@NotNull FragmentActivity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        show(activity.getSupportFragmentManager(), TAG);
    }
}

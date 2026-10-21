package com.bbva.component.ui.modal.halfmodal.views;

import android.content.DialogInterface;
import android.content.res.Resources;
import android.os.Bundle;
import android.text.Spannable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.RadioGroup;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.LifecycleOwnerKt;
import com.bbva.component.ui.modal.R;
import com.bbva.component.ui.modal.databinding.ViewHalfModalGenderContentBinding;
import com.bbva.component.ui.modal.extensions.StringExtensionKt;
import com.bbva.component.ui.modal.halfmodal.HalfModalContract;
import com.bbva.component.ui.modal.halfmodal.HalfModalViewModel;
import com.bbva.component.ui.modal.halfmodal.PrimaryButtonState;
import com.bbva.component.ui.modal.halfmodal.model.ButtonConfig;
import com.bbva.component.ui.modal.halfmodal.model.HalfModalState;
import com.bbva.component.ui.modal.halfmodal.views.GenderHalfModalView;
import com.bbva.ethermobilesdk.geolocation.utils.ConstantsKt;
import com.bbva.ui.widget.BbvaButton;
import com.bbva.ui.widget.BbvaTextView;
import com.google.android.material.bottomsheet.BottomSheetDialogFragment;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import w5.f;
import w5.j;
import w5.k;

/* JADX INFO: compiled from: GenderHalfModalView.kt */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u0000 \u001e2\u00020\u00012\u00020\u0002:\u0001\u001eB\u0007¢\u0006\u0004\b\u001c\u0010\u001dJ$\u0010\n\u001a\u00020\t2\u0006\u0010\u0004\u001a\u00020\u00032\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0016J\u001a\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0016J\u0010\u0010\u0010\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016J\u0010\u0010\u0013\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0016R\"\u0010\u001b\u001a\u00020\u00148\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001a¨\u0006\u001f"}, d2 = {"Lcom/bbva/component/ui/modal/halfmodal/views/GenderHalfModalView;", "Lcom/bbva/component/ui/modal/halfmodal/views/HalfModalView;", "Lcom/google/android/material/bottomsheet/BottomSheetDialogFragment;", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "onCreateView", "view", "", "onViewCreated", "Landroidx/fragment/app/FragmentActivity;", ConstantsKt.DETECTED_ACTIVITY_EXTRA_ID, "show", "Landroid/content/DialogInterface;", "dialog", "onDismiss", "Lcom/bbva/component/ui/modal/halfmodal/HalfModalViewModel;", "p0", "Lcom/bbva/component/ui/modal/halfmodal/HalfModalViewModel;", "getViewModel", "()Lcom/bbva/component/ui/modal/halfmodal/HalfModalViewModel;", "setViewModel", "(Lcom/bbva/component/ui/modal/halfmodal/HalfModalViewModel;)V", "viewModel", "<init>", "()V", "Companion", "component-ui-modal_release"}, k = 1, mv = {1, 9, 0})
public final class GenderHalfModalView extends BottomSheetDialogFragment implements HalfModalView {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    public static final String TAG = "HalfModalGenderView";

    /* JADX INFO: renamed from: p0, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public HalfModalViewModel viewModel = new HalfModalViewModel();

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public ViewHalfModalGenderContentBinding f28710q0;

    /* JADX INFO: compiled from: GenderHalfModalView.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/bbva/component/ui/modal/halfmodal/views/GenderHalfModalView$Companion;", "", "()V", "TAG", "", "component-ui-modal_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public static final void access$enableButton(GenderHalfModalView genderHalfModalView, PrimaryButtonState primaryButtonState) {
        ViewHalfModalGenderContentBinding viewHalfModalGenderContentBinding = genderHalfModalView.f28710q0;
        if (viewHalfModalGenderContentBinding == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            viewHalfModalGenderContentBinding = null;
        }
        viewHalfModalGenderContentBinding.primaryButton.setEnabled(primaryButtonState instanceof PrimaryButtonState.Enabled);
    }

    public static final void access$updateView(GenderHalfModalView genderHalfModalView, HalfModalState halfModalState) {
        Spannable spannableAddDrawableLeft;
        ViewHalfModalGenderContentBinding viewHalfModalGenderContentBinding = genderHalfModalView.f28710q0;
        if (viewHalfModalGenderContentBinding == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            viewHalfModalGenderContentBinding = null;
        }
        viewHalfModalGenderContentBinding.title.setText(halfModalState.getTitle());
        viewHalfModalGenderContentBinding.iconActionClose.setImageResource(halfModalState.getActionIcon());
        viewHalfModalGenderContentBinding.message.setText(halfModalState.getMessage());
        BbvaTextView bbvaTextView = viewHalfModalGenderContentBinding.legend;
        String legend = halfModalState.getLegend();
        if (legend != null) {
            int i10 = R.drawable.ic_info;
            Resources resources = genderHalfModalView.getResources();
            Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
            spannableAddDrawableLeft = StringExtensionKt.addDrawableLeft(legend, i10, resources);
        } else {
            spannableAddDrawableLeft = null;
        }
        bbvaTextView.setText(spannableAddDrawableLeft);
        BbvaButton bbvaButton = viewHalfModalGenderContentBinding.primaryButton;
        ButtonConfig primaryButtonText = halfModalState.getPrimaryButtonText();
        bbvaButton.setText(primaryButtonText != null ? primaryButtonText.getTitle() : null);
        ButtonConfig primaryButtonText2 = halfModalState.getPrimaryButtonText();
        bbvaButton.setVisibility((primaryButtonText2 == null || !primaryButtonText2.isVisible()) ? 8 : 0);
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
        ViewHalfModalGenderContentBinding viewHalfModalGenderContentBindingInflate = ViewHalfModalGenderContentBinding.inflate(inflater, container, false);
        Intrinsics.checkNotNullExpressionValue(viewHalfModalGenderContentBindingInflate, "inflate(...)");
        this.f28710q0 = viewHalfModalGenderContentBindingInflate;
        if (viewHalfModalGenderContentBindingInflate == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            viewHalfModalGenderContentBindingInflate = null;
        }
        FrameLayout root = viewHalfModalGenderContentBindingInflate.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
        return root;
    }

    @Override // androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnDismissListener
    public void onDismiss(@NotNull DialogInterface dialog) {
        Intrinsics.checkNotNullParameter(dialog, "dialog");
        super.onDismiss(dialog);
        getViewModel().buttonTapped(HalfModalContract.ButtonType.CLOSE);
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        ViewHalfModalGenderContentBinding viewHalfModalGenderContentBinding = null;
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new j(this, null), 3, null);
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new k(this, null), 3, null);
        ViewHalfModalGenderContentBinding viewHalfModalGenderContentBinding2 = this.f28710q0;
        if (viewHalfModalGenderContentBinding2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            viewHalfModalGenderContentBinding2 = null;
        }
        viewHalfModalGenderContentBinding2.iconActionClose.setOnClickListener(new n4.k(this, 1));
        ViewHalfModalGenderContentBinding viewHalfModalGenderContentBinding3 = this.f28710q0;
        if (viewHalfModalGenderContentBinding3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            viewHalfModalGenderContentBinding3 = null;
        }
        viewHalfModalGenderContentBinding3.primaryButton.setOnClickListener(new f(this, 0));
        ViewHalfModalGenderContentBinding viewHalfModalGenderContentBinding4 = this.f28710q0;
        if (viewHalfModalGenderContentBinding4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            viewHalfModalGenderContentBinding = viewHalfModalGenderContentBinding4;
        }
        viewHalfModalGenderContentBinding.genderGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() { // from class: w5.g
            @Override // android.widget.RadioGroup.OnCheckedChangeListener
            public final void onCheckedChanged(RadioGroup radioGroup, int i10) {
                GenderHalfModalView.Companion companion = GenderHalfModalView.INSTANCE;
                GenderHalfModalView this$0 = this.f94169a;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                if (i10 == R.id.radioFemale) {
                    this$0.getViewModel().radioButtonTapped(HalfModalContract.RadioButtonType.FEMALE);
                } else if (i10 == R.id.radioMale) {
                    this$0.getViewModel().radioButtonTapped(HalfModalContract.RadioButtonType.MALE);
                }
            }
        });
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

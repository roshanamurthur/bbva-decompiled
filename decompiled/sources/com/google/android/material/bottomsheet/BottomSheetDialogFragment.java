package com.google.android.material.bottomsheet;

import android.annotation.SuppressLint;
import android.app.Dialog;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.LayoutRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatDialogFragment;

/* JADX INFO: loaded from: classes10.dex */
public class BottomSheetDialogFragment extends AppCompatDialogFragment {
    private boolean waitingForDismissAllowingStateLoss;

    public BottomSheetDialogFragment() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void dismissAfterAnimation() {
        if (this.waitingForDismissAllowingStateLoss) {
            super.dismissAllowingStateLoss();
        } else {
            super.dismiss();
        }
    }

    private void dismissWithAnimation(@NonNull BottomSheetBehavior<?> bottomSheetBehavior, boolean z10) {
        this.waitingForDismissAllowingStateLoss = z10;
        if (bottomSheetBehavior.getState() == 5) {
            dismissAfterAnimation();
            return;
        }
        if (getDialog() instanceof BottomSheetDialog) {
            BottomSheetDialog bottomSheetDialog = (BottomSheetDialog) getDialog();
            bottomSheetDialog.f44108u0.removeBottomSheetCallback(bottomSheetDialog.K0);
        }
        bottomSheetBehavior.addBottomSheetCallback(new a());
        bottomSheetBehavior.setState(5);
    }

    private boolean tryDismissWithAnimation(boolean z10) {
        Dialog dialog = getDialog();
        if (!(dialog instanceof BottomSheetDialog)) {
            return false;
        }
        BottomSheetDialog bottomSheetDialog = (BottomSheetDialog) dialog;
        BottomSheetBehavior<FrameLayout> behavior = bottomSheetDialog.getBehavior();
        if (!behavior.isHideable() || !bottomSheetDialog.getDismissWithAnimation()) {
            return false;
        }
        dismissWithAnimation(behavior, z10);
        return true;
    }

    @Override // androidx.fragment.app.DialogFragment
    public void dismiss() {
        if (tryDismissWithAnimation(false)) {
            return;
        }
        super.dismiss();
    }

    @Override // androidx.fragment.app.DialogFragment
    public void dismissAllowingStateLoss() {
        if (tryDismissWithAnimation(true)) {
            return;
        }
        super.dismissAllowingStateLoss();
    }

    @Override // androidx.appcompat.app.AppCompatDialogFragment, androidx.fragment.app.DialogFragment
    @NonNull
    public Dialog onCreateDialog(@Nullable Bundle bundle) {
        return new BottomSheetDialog(getContext(), getTheme());
    }

    @SuppressLint({"ValidFragment"})
    public BottomSheetDialogFragment(@LayoutRes int i10) {
        super(i10);
    }

    public class a extends BottomSheetBehavior.BottomSheetCallback {
        public a() {
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.BottomSheetCallback
        public final void onStateChanged(@NonNull View view, int i10) {
            if (i10 == 5) {
                BottomSheetDialogFragment.this.dismissAfterAnimation();
            }
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.BottomSheetCallback
        public final void onSlide(@NonNull View view, float f6) {
        }
    }
}

package com.bbva.touchid.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.Space;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.bbva.touchid.R;

/* JADX INFO: loaded from: classes.dex */
public final class FingerprintDialogContainerBinding implements ViewBinding {

    @NonNull
    public final LinearLayout buttonPanel;

    @NonNull
    public final Button cancelButton;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    @NonNull
    public final LinearLayout f36936p0;

    @NonNull
    public final Button secondDialogButton;

    @NonNull
    public final Space spacer;

    public FingerprintDialogContainerBinding(@NonNull LinearLayout linearLayout, @NonNull LinearLayout linearLayout2, @NonNull Button button, @NonNull Button button2, @NonNull Space space) {
        this.f36936p0 = linearLayout;
        this.buttonPanel = linearLayout2;
        this.cancelButton = button;
        this.secondDialogButton = button2;
        this.spacer = space;
    }

    @NonNull
    public static FingerprintDialogContainerBinding bind(@NonNull View view) {
        int i10 = R.id.buttonPanel;
        LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, i10);
        if (linearLayout != null) {
            i10 = R.id.cancel_button;
            Button button = (Button) ViewBindings.findChildViewById(view, i10);
            if (button != null) {
                i10 = R.id.second_dialog_button;
                Button button2 = (Button) ViewBindings.findChildViewById(view, i10);
                if (button2 != null) {
                    i10 = R.id.spacer;
                    Space space = (Space) ViewBindings.findChildViewById(view, i10);
                    if (space != null) {
                        return new FingerprintDialogContainerBinding((LinearLayout) view, linearLayout, button, button2, space);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @NonNull
    public static FingerprintDialogContainerBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static FingerprintDialogContainerBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(R.layout.fingerprint_dialog_container, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public LinearLayout getRoot() {
        return this.f36936p0;
    }
}

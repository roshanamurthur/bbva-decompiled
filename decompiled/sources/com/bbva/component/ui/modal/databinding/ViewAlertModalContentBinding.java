package com.bbva.component.ui.modal.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.bbva.component.ui.modal.R;
import com.bbva.ui.widget.BbvaButton;
import com.bbva.ui.widget.BbvaTextView;

/* JADX INFO: loaded from: classes4.dex */
public final class ViewAlertModalContentBinding implements ViewBinding {

    @NonNull
    public final LinearLayout content;

    @NonNull
    public final BbvaTextView message;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    @NonNull
    public final FrameLayout f28685p0;

    @NonNull
    public final BbvaButton primaryButton;

    @NonNull
    public final BbvaTextView title;

    public ViewAlertModalContentBinding(@NonNull FrameLayout frameLayout, @NonNull LinearLayout linearLayout, @NonNull BbvaTextView bbvaTextView, @NonNull BbvaButton bbvaButton, @NonNull BbvaTextView bbvaTextView2) {
        this.f28685p0 = frameLayout;
        this.content = linearLayout;
        this.message = bbvaTextView;
        this.primaryButton = bbvaButton;
        this.title = bbvaTextView2;
    }

    @NonNull
    public static ViewAlertModalContentBinding bind(@NonNull View view) {
        int i10 = R.id.content;
        LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, i10);
        if (linearLayout != null) {
            i10 = R.id.message;
            BbvaTextView bbvaTextView = (BbvaTextView) ViewBindings.findChildViewById(view, i10);
            if (bbvaTextView != null) {
                i10 = R.id.primaryButton;
                BbvaButton bbvaButton = (BbvaButton) ViewBindings.findChildViewById(view, i10);
                if (bbvaButton != null) {
                    i10 = R.id.title;
                    BbvaTextView bbvaTextView2 = (BbvaTextView) ViewBindings.findChildViewById(view, i10);
                    if (bbvaTextView2 != null) {
                        return new ViewAlertModalContentBinding((FrameLayout) view, linearLayout, bbvaTextView, bbvaButton, bbvaTextView2);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @NonNull
    public static ViewAlertModalContentBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static ViewAlertModalContentBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(R.layout.view_alert_modal_content, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public FrameLayout getRoot() {
        return this.f28685p0;
    }
}

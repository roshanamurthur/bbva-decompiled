package com.bbva.component.ui.message.link.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.AppCompatButton;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.bbva.component.ui.message.link.R;
import com.google.android.material.textview.MaterialTextView;

/* JADX INFO: loaded from: classes4.dex */
public final class ViewMessageLinkBinding implements ViewBinding {

    @NonNull
    public final ConstraintLayout messageLinkBackground;

    @NonNull
    public final AppCompatButton messageLinkButton;

    @NonNull
    public final MaterialTextView messageLinkTextView;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    @NonNull
    public final View f28660p0;

    public ViewMessageLinkBinding(@NonNull View view, @NonNull ConstraintLayout constraintLayout, @NonNull AppCompatButton appCompatButton, @NonNull MaterialTextView materialTextView) {
        this.f28660p0 = view;
        this.messageLinkBackground = constraintLayout;
        this.messageLinkButton = appCompatButton;
        this.messageLinkTextView = materialTextView;
    }

    @NonNull
    public static ViewMessageLinkBinding bind(@NonNull View view) {
        int i10 = R.id.message_link_background;
        ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(view, i10);
        if (constraintLayout != null) {
            i10 = R.id.message_link_button;
            AppCompatButton appCompatButton = (AppCompatButton) ViewBindings.findChildViewById(view, i10);
            if (appCompatButton != null) {
                i10 = R.id.message_link_text_view;
                MaterialTextView materialTextView = (MaterialTextView) ViewBindings.findChildViewById(view, i10);
                if (materialTextView != null) {
                    return new ViewMessageLinkBinding(view, constraintLayout, appCompatButton, materialTextView);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @NonNull
    public static ViewMessageLinkBinding inflate(@NonNull LayoutInflater layoutInflater, @NonNull ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new NullPointerException("parent");
        }
        layoutInflater.inflate(R.layout.view_message_link, viewGroup);
        return bind(viewGroup);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public View getRoot() {
        return this.f28660p0;
    }
}

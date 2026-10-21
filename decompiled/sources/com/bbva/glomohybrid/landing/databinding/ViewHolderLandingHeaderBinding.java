package com.bbva.glomohybrid.landing.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.bbva.component.ui.landing.access.LandingAccessView;
import com.bbva.component.ui.message.card.MessageCardView;
import com.bbva.component.ui.message.link.MessageLinkView;
import com.bbva.component.ui.shortcuts.ShortcutsSimpleView;
import com.bbva.glomohybrid.landing.R;
import com.bbva.glomohybrid.ui.view.OverlayImageView;

/* JADX INFO: loaded from: classes6.dex */
public final class ViewHolderLandingHeaderBinding implements ViewBinding {

    @NonNull
    public final LandingAccessView access;

    @NonNull
    public final OverlayImageView background;

    @NonNull
    public final MessageCardView blockerMessage;

    @NonNull
    public final MessageLinkView digitalActivation;

    @NonNull
    public final Guideline guidelineTop;

    @NonNull
    public final ConstraintLayout header;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    @NonNull
    public final ConstraintLayout f32547p0;

    @NonNull
    public final ShortcutsSimpleView shortcuts;

    public ViewHolderLandingHeaderBinding(@NonNull ConstraintLayout constraintLayout, @NonNull LandingAccessView landingAccessView, @NonNull OverlayImageView overlayImageView, @NonNull MessageCardView messageCardView, @NonNull MessageLinkView messageLinkView, @NonNull Guideline guideline, @NonNull ConstraintLayout constraintLayout2, @NonNull ShortcutsSimpleView shortcutsSimpleView) {
        this.f32547p0 = constraintLayout;
        this.access = landingAccessView;
        this.background = overlayImageView;
        this.blockerMessage = messageCardView;
        this.digitalActivation = messageLinkView;
        this.guidelineTop = guideline;
        this.header = constraintLayout2;
        this.shortcuts = shortcutsSimpleView;
    }

    @NonNull
    public static ViewHolderLandingHeaderBinding bind(@NonNull View view) {
        int i10 = R.id.access;
        LandingAccessView landingAccessView = (LandingAccessView) ViewBindings.findChildViewById(view, i10);
        if (landingAccessView != null) {
            i10 = R.id.background;
            OverlayImageView overlayImageView = (OverlayImageView) ViewBindings.findChildViewById(view, i10);
            if (overlayImageView != null) {
                i10 = R.id.blocker_message;
                MessageCardView messageCardView = (MessageCardView) ViewBindings.findChildViewById(view, i10);
                if (messageCardView != null) {
                    i10 = R.id.digital_activation;
                    MessageLinkView messageLinkView = (MessageLinkView) ViewBindings.findChildViewById(view, i10);
                    if (messageLinkView != null) {
                        i10 = R.id.guidelineTop;
                        Guideline guideline = (Guideline) ViewBindings.findChildViewById(view, i10);
                        if (guideline != null) {
                            ConstraintLayout constraintLayout = (ConstraintLayout) view;
                            i10 = R.id.shortcuts;
                            ShortcutsSimpleView shortcutsSimpleView = (ShortcutsSimpleView) ViewBindings.findChildViewById(view, i10);
                            if (shortcutsSimpleView != null) {
                                return new ViewHolderLandingHeaderBinding(constraintLayout, landingAccessView, overlayImageView, messageCardView, messageLinkView, guideline, constraintLayout, shortcutsSimpleView);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @NonNull
    public static ViewHolderLandingHeaderBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static ViewHolderLandingHeaderBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(R.layout.view_holder_landing_header, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public ConstraintLayout getRoot() {
        return this.f32547p0;
    }
}

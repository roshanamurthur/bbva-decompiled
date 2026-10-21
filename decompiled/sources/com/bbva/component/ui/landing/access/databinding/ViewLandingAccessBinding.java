package com.bbva.component.ui.landing.access.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.bbva.component.ui.landing.access.R;
import com.bbva.ui.widget.BbvaButton;
import com.bbva.ui.widget.BbvaTextView;
import com.bbva.ui.widget.ClipBox;

/* JADX INFO: loaded from: classes4.dex */
public final class ViewLandingAccessBinding implements ViewBinding {

    @NonNull
    public final ClipBox landingAccessAvatar;

    @NonNull
    public final BbvaButton landingAccessButton;

    @NonNull
    public final ConstraintLayout landingAccessContainer;

    @NonNull
    public final BbvaTextView landingAccessExtendedGreeting;

    @NonNull
    public final BbvaTextView landingAccessGreeting;

    @NonNull
    public final BbvaButton landingAccessLink;

    @NonNull
    public final BbvaTextView landingAccessName;

    @NonNull
    public final LinearLayoutCompat landingUserAccessContainer;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    @NonNull
    public final View f28402p0;

    @NonNull
    public final FrameLayout skeletonAccessContainer;

    public ViewLandingAccessBinding(@NonNull View view, @NonNull ClipBox clipBox, @NonNull BbvaButton bbvaButton, @NonNull ConstraintLayout constraintLayout, @NonNull BbvaTextView bbvaTextView, @NonNull BbvaTextView bbvaTextView2, @NonNull BbvaButton bbvaButton2, @NonNull BbvaTextView bbvaTextView3, @NonNull LinearLayoutCompat linearLayoutCompat, @NonNull FrameLayout frameLayout) {
        this.f28402p0 = view;
        this.landingAccessAvatar = clipBox;
        this.landingAccessButton = bbvaButton;
        this.landingAccessContainer = constraintLayout;
        this.landingAccessExtendedGreeting = bbvaTextView;
        this.landingAccessGreeting = bbvaTextView2;
        this.landingAccessLink = bbvaButton2;
        this.landingAccessName = bbvaTextView3;
        this.landingUserAccessContainer = linearLayoutCompat;
        this.skeletonAccessContainer = frameLayout;
    }

    @NonNull
    public static ViewLandingAccessBinding bind(@NonNull View view) {
        int i10 = R.id.landing_access_avatar;
        ClipBox clipBox = (ClipBox) ViewBindings.findChildViewById(view, i10);
        if (clipBox != null) {
            i10 = R.id.landing_access_button;
            BbvaButton bbvaButton = (BbvaButton) ViewBindings.findChildViewById(view, i10);
            if (bbvaButton != null) {
                i10 = R.id.landing_access_container;
                ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(view, i10);
                if (constraintLayout != null) {
                    i10 = R.id.landing_access_extended_greeting;
                    BbvaTextView bbvaTextView = (BbvaTextView) ViewBindings.findChildViewById(view, i10);
                    if (bbvaTextView != null) {
                        i10 = R.id.landing_access_greeting;
                        BbvaTextView bbvaTextView2 = (BbvaTextView) ViewBindings.findChildViewById(view, i10);
                        if (bbvaTextView2 != null) {
                            i10 = R.id.landing_access_link;
                            BbvaButton bbvaButton2 = (BbvaButton) ViewBindings.findChildViewById(view, i10);
                            if (bbvaButton2 != null) {
                                i10 = R.id.landing_access_name;
                                BbvaTextView bbvaTextView3 = (BbvaTextView) ViewBindings.findChildViewById(view, i10);
                                if (bbvaTextView3 != null) {
                                    i10 = R.id.landing_user_access_container;
                                    LinearLayoutCompat linearLayoutCompat = (LinearLayoutCompat) ViewBindings.findChildViewById(view, i10);
                                    if (linearLayoutCompat != null) {
                                        i10 = R.id.skeleton_access_container;
                                        FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(view, i10);
                                        if (frameLayout != null) {
                                            return new ViewLandingAccessBinding(view, clipBox, bbvaButton, constraintLayout, bbvaTextView, bbvaTextView2, bbvaButton2, bbvaTextView3, linearLayoutCompat, frameLayout);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @NonNull
    public static ViewLandingAccessBinding inflate(@NonNull LayoutInflater layoutInflater, @NonNull ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new NullPointerException("parent");
        }
        layoutInflater.inflate(R.layout.view_landing_access, viewGroup);
        return bind(viewGroup);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public View getRoot() {
        return this.f28402p0;
    }
}

package com.bbva.component.ui.loader.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.airbnb.lottie.LottieAnimationView;
import com.bbva.component.ui.loader.R;
import com.bbva.ui.widget.BbvaTextView;

/* JADX INFO: loaded from: classes4.dex */
public final class LayoutLoaderviewBinding implements ViewBinding {

    @NonNull
    public final Guideline fixedGuideline;

    @NonNull
    public final Guideline halfVerticalGuideline;

    @NonNull
    public final ConstraintLayout lightBackground;

    @NonNull
    public final LottieAnimationView loaderLottieView;

    @NonNull
    public final LottieAnimationView lockLottieView;

    @NonNull
    public final BbvaTextView messageLabel;

    @NonNull
    public final BbvaTextView nextMessageLabel;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    @NonNull
    public final View f28452p0;

    @NonNull
    public final BbvaTextView secondaryMessageLabel;

    public LayoutLoaderviewBinding(@NonNull View view, @NonNull Guideline guideline, @NonNull Guideline guideline2, @NonNull ConstraintLayout constraintLayout, @NonNull LottieAnimationView lottieAnimationView, @NonNull LottieAnimationView lottieAnimationView2, @NonNull BbvaTextView bbvaTextView, @NonNull BbvaTextView bbvaTextView2, @NonNull BbvaTextView bbvaTextView3) {
        this.f28452p0 = view;
        this.fixedGuideline = guideline;
        this.halfVerticalGuideline = guideline2;
        this.lightBackground = constraintLayout;
        this.loaderLottieView = lottieAnimationView;
        this.lockLottieView = lottieAnimationView2;
        this.messageLabel = bbvaTextView;
        this.nextMessageLabel = bbvaTextView2;
        this.secondaryMessageLabel = bbvaTextView3;
    }

    @NonNull
    public static LayoutLoaderviewBinding bind(@NonNull View view) {
        int i10 = R.id.fixedGuideline;
        Guideline guideline = (Guideline) ViewBindings.findChildViewById(view, i10);
        if (guideline != null) {
            i10 = R.id.halfVerticalGuideline;
            Guideline guideline2 = (Guideline) ViewBindings.findChildViewById(view, i10);
            if (guideline2 != null) {
                i10 = R.id.lightBackground;
                ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(view, i10);
                if (constraintLayout != null) {
                    i10 = R.id.loaderLottieView;
                    LottieAnimationView lottieAnimationView = (LottieAnimationView) ViewBindings.findChildViewById(view, i10);
                    if (lottieAnimationView != null) {
                        i10 = R.id.lockLottieView;
                        LottieAnimationView lottieAnimationView2 = (LottieAnimationView) ViewBindings.findChildViewById(view, i10);
                        if (lottieAnimationView2 != null) {
                            i10 = R.id.messageLabel;
                            BbvaTextView bbvaTextView = (BbvaTextView) ViewBindings.findChildViewById(view, i10);
                            if (bbvaTextView != null) {
                                i10 = R.id.nextMessageLabel;
                                BbvaTextView bbvaTextView2 = (BbvaTextView) ViewBindings.findChildViewById(view, i10);
                                if (bbvaTextView2 != null) {
                                    i10 = R.id.secondaryMessageLabel;
                                    BbvaTextView bbvaTextView3 = (BbvaTextView) ViewBindings.findChildViewById(view, i10);
                                    if (bbvaTextView3 != null) {
                                        return new LayoutLoaderviewBinding(view, guideline, guideline2, constraintLayout, lottieAnimationView, lottieAnimationView2, bbvaTextView, bbvaTextView2, bbvaTextView3);
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
    public static LayoutLoaderviewBinding inflate(@NonNull LayoutInflater layoutInflater, @NonNull ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new NullPointerException("parent");
        }
        layoutInflater.inflate(R.layout.layout_loaderview, viewGroup);
        return bind(viewGroup);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public View getRoot() {
        return this.f28452p0;
    }
}

package com.bbva.glomohybrid.welcome.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.bbva.component.ui.loader.LoaderSpinnerComponent;
import com.bbva.component.ui.welcome.footer.WelcomeFooter;
import com.bbva.component.ui.welcome.header.WelcomeHeader;
import com.bbva.glomohybrid.welcome.R;

/* JADX INFO: loaded from: classes7.dex */
public final class ActivityWelcomeBinding implements ViewBinding {

    @NonNull
    public final Guideline bottomGuideline;

    @NonNull
    public final AppCompatImageView imageHeader;

    @NonNull
    public final ConstraintLayout mainView;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    @NonNull
    public final CoordinatorLayout f34729p0;

    @NonNull
    public final Guideline topGuideline;

    @NonNull
    public final WelcomeFooter welcomeFooter;

    @NonNull
    public final WelcomeHeader welcomeHeader;

    @NonNull
    public final LoaderSpinnerComponent welcomeSpinner;

    public ActivityWelcomeBinding(@NonNull CoordinatorLayout coordinatorLayout, @NonNull Guideline guideline, @NonNull AppCompatImageView appCompatImageView, @NonNull ConstraintLayout constraintLayout, @NonNull Guideline guideline2, @NonNull WelcomeFooter welcomeFooter, @NonNull WelcomeHeader welcomeHeader, @NonNull LoaderSpinnerComponent loaderSpinnerComponent) {
        this.f34729p0 = coordinatorLayout;
        this.bottomGuideline = guideline;
        this.imageHeader = appCompatImageView;
        this.mainView = constraintLayout;
        this.topGuideline = guideline2;
        this.welcomeFooter = welcomeFooter;
        this.welcomeHeader = welcomeHeader;
        this.welcomeSpinner = loaderSpinnerComponent;
    }

    @NonNull
    public static ActivityWelcomeBinding bind(@NonNull View view) {
        int i10 = R.id.bottom_guideline;
        Guideline guideline = (Guideline) ViewBindings.findChildViewById(view, i10);
        if (guideline != null) {
            i10 = R.id.imageHeader;
            AppCompatImageView appCompatImageView = (AppCompatImageView) ViewBindings.findChildViewById(view, i10);
            if (appCompatImageView != null) {
                i10 = R.id.mainView;
                ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(view, i10);
                if (constraintLayout != null) {
                    i10 = R.id.top_guideline;
                    Guideline guideline2 = (Guideline) ViewBindings.findChildViewById(view, i10);
                    if (guideline2 != null) {
                        i10 = R.id.welcomeFooter;
                        WelcomeFooter welcomeFooter = (WelcomeFooter) ViewBindings.findChildViewById(view, i10);
                        if (welcomeFooter != null) {
                            i10 = R.id.welcomeHeader;
                            WelcomeHeader welcomeHeader = (WelcomeHeader) ViewBindings.findChildViewById(view, i10);
                            if (welcomeHeader != null) {
                                i10 = R.id.welcomeSpinner;
                                LoaderSpinnerComponent loaderSpinnerComponent = (LoaderSpinnerComponent) ViewBindings.findChildViewById(view, i10);
                                if (loaderSpinnerComponent != null) {
                                    return new ActivityWelcomeBinding((CoordinatorLayout) view, guideline, appCompatImageView, constraintLayout, guideline2, welcomeFooter, welcomeHeader, loaderSpinnerComponent);
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
    public static ActivityWelcomeBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static ActivityWelcomeBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(R.layout.activity_welcome, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public CoordinatorLayout getRoot() {
        return this.f34729p0;
    }
}

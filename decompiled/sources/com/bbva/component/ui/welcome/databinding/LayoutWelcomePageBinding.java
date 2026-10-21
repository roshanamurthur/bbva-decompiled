package com.bbva.component.ui.welcome.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.Guideline;
import androidx.viewbinding.ViewBinding;
import com.airbnb.lottie.LottieAnimationView;
import com.bbva.cellswidgets.CellsImageView;
import com.bbva.cellswidgets.CellsTextView;
import com.bbva.component.ui.welcome.R;
import com.bbva.component.ui.welcome.pager.WelcomePageLayout;

/* JADX INFO: loaded from: classes2.dex */
public final class LayoutWelcomePageBinding implements ViewBinding {

    @NonNull
    public final CellsTextView descriptionTextView;

    @NonNull
    public final Guideline guideline;

    @NonNull
    public final FrameLayout imageContainer;

    @NonNull
    public final CellsImageView imageView;

    @NonNull
    public final LottieAnimationView lottieView;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    @NonNull
    public final WelcomePageLayout f28776p0;

    @NonNull
    public final CellsTextView titleTextView;

    public LayoutWelcomePageBinding(@NonNull WelcomePageLayout welcomePageLayout, @NonNull CellsTextView cellsTextView, @NonNull Guideline guideline, @NonNull FrameLayout frameLayout, @NonNull CellsImageView cellsImageView, @NonNull LottieAnimationView lottieAnimationView, @NonNull CellsTextView cellsTextView2) {
        this.f28776p0 = welcomePageLayout;
        this.descriptionTextView = cellsTextView;
        this.guideline = guideline;
        this.imageContainer = frameLayout;
        this.imageView = cellsImageView;
        this.lottieView = lottieAnimationView;
        this.titleTextView = cellsTextView2;
    }

    @NonNull
    public static LayoutWelcomePageBinding bind(@NonNull View view) {
        int i10 = R.id.descriptionTextView;
        CellsTextView cellsTextView = (CellsTextView) view.findViewById(i10);
        if (cellsTextView != null) {
            i10 = R.id.guideline;
            Guideline guideline = (Guideline) view.findViewById(i10);
            if (guideline != null) {
                i10 = R.id.imageContainer;
                FrameLayout frameLayout = (FrameLayout) view.findViewById(i10);
                if (frameLayout != null) {
                    i10 = R.id.imageView;
                    CellsImageView cellsImageView = (CellsImageView) view.findViewById(i10);
                    if (cellsImageView != null) {
                        i10 = R.id.lottieView;
                        LottieAnimationView lottieAnimationView = (LottieAnimationView) view.findViewById(i10);
                        if (lottieAnimationView != null) {
                            i10 = R.id.titleTextView;
                            CellsTextView cellsTextView2 = (CellsTextView) view.findViewById(i10);
                            if (cellsTextView2 != null) {
                                return new LayoutWelcomePageBinding((WelcomePageLayout) view, cellsTextView, guideline, frameLayout, cellsImageView, lottieAnimationView, cellsTextView2);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @NonNull
    public static LayoutWelcomePageBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static LayoutWelcomePageBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(R.layout.layout_welcome_page, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public WelcomePageLayout getRoot() {
        return this.f28776p0;
    }
}

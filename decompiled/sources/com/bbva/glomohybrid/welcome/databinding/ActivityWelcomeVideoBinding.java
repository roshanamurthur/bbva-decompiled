package com.bbva.glomohybrid.welcome.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextSwitcher;
import android.widget.TextView;
import android.widget.VideoView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.bbva.cellswidgets.CellsButton;
import com.bbva.component.ui.loader.LoaderSpinnerComponent;
import com.bbva.glomohybrid.welcome.R;

/* JADX INFO: loaded from: classes7.dex */
public final class ActivityWelcomeVideoBinding implements ViewBinding {

    @NonNull
    public final VideoView backgroundVideo;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    @NonNull
    public final ConstraintLayout f34731p0;

    @NonNull
    public final CellsButton welcomeBottomButton;

    @NonNull
    public final TextView welcomeBottomText;

    @NonNull
    public final LoaderSpinnerComponent welcomeSpinner;

    @NonNull
    public final TextSwitcher welcomeTextSwitcher;

    @NonNull
    public final CellsButton welcomeTopButton;

    public ActivityWelcomeVideoBinding(@NonNull ConstraintLayout constraintLayout, @NonNull VideoView videoView, @NonNull CellsButton cellsButton, @NonNull TextView textView, @NonNull LoaderSpinnerComponent loaderSpinnerComponent, @NonNull TextSwitcher textSwitcher, @NonNull CellsButton cellsButton2) {
        this.f34731p0 = constraintLayout;
        this.backgroundVideo = videoView;
        this.welcomeBottomButton = cellsButton;
        this.welcomeBottomText = textView;
        this.welcomeSpinner = loaderSpinnerComponent;
        this.welcomeTextSwitcher = textSwitcher;
        this.welcomeTopButton = cellsButton2;
    }

    @NonNull
    public static ActivityWelcomeVideoBinding bind(@NonNull View view) {
        int i10 = R.id.backgroundVideo;
        VideoView videoView = (VideoView) ViewBindings.findChildViewById(view, i10);
        if (videoView != null) {
            i10 = R.id.welcomeBottomButton;
            CellsButton cellsButton = (CellsButton) ViewBindings.findChildViewById(view, i10);
            if (cellsButton != null) {
                i10 = R.id.welcomeBottomText;
                TextView textView = (TextView) ViewBindings.findChildViewById(view, i10);
                if (textView != null) {
                    i10 = R.id.welcomeSpinner;
                    LoaderSpinnerComponent loaderSpinnerComponent = (LoaderSpinnerComponent) ViewBindings.findChildViewById(view, i10);
                    if (loaderSpinnerComponent != null) {
                        i10 = R.id.welcomeTextSwitcher;
                        TextSwitcher textSwitcher = (TextSwitcher) ViewBindings.findChildViewById(view, i10);
                        if (textSwitcher != null) {
                            i10 = R.id.welcomeTopButton;
                            CellsButton cellsButton2 = (CellsButton) ViewBindings.findChildViewById(view, i10);
                            if (cellsButton2 != null) {
                                return new ActivityWelcomeVideoBinding((ConstraintLayout) view, videoView, cellsButton, textView, loaderSpinnerComponent, textSwitcher, cellsButton2);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @NonNull
    public static ActivityWelcomeVideoBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static ActivityWelcomeVideoBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(R.layout.activity_welcome_video, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public ConstraintLayout getRoot() {
        return this.f34731p0;
    }
}

package com.bbva.showinfo.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatButton;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.bbva.showinfo.R;

/* JADX INFO: loaded from: classes8.dex */
public final class LayoutTooltipBinding implements ViewBinding {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    @NonNull
    public final ConstraintLayout f36474p0;

    @NonNull
    public final TextView tooltipBody;

    @NonNull
    public final ImageView tooltipBottomArrow;

    @NonNull
    public final ConstraintLayout tooltipContent;

    @NonNull
    public final ImageView tooltipIzArrow;

    @NonNull
    public final ImageView tooltipIzaArrow;

    @NonNull
    public final ImageView tooltipLeftArrow;

    @NonNull
    public final ImageView tooltipNeArrow;

    @NonNull
    public final ImageView tooltipNiArrow;

    @NonNull
    public final AppCompatButton tooltipPositiveButton;

    @NonNull
    public final ImageView tooltipRightArrow;

    @NonNull
    public final TextView tooltipTitle;

    @NonNull
    public final ImageView tooltipTopArrow;

    public LayoutTooltipBinding(@NonNull ConstraintLayout constraintLayout, @NonNull TextView textView, @NonNull ImageView imageView, @NonNull ConstraintLayout constraintLayout2, @NonNull ImageView imageView2, @NonNull ImageView imageView3, @NonNull ImageView imageView4, @NonNull ImageView imageView5, @NonNull ImageView imageView6, @NonNull AppCompatButton appCompatButton, @NonNull ImageView imageView7, @NonNull TextView textView2, @NonNull ImageView imageView8) {
        this.f36474p0 = constraintLayout;
        this.tooltipBody = textView;
        this.tooltipBottomArrow = imageView;
        this.tooltipContent = constraintLayout2;
        this.tooltipIzArrow = imageView2;
        this.tooltipIzaArrow = imageView3;
        this.tooltipLeftArrow = imageView4;
        this.tooltipNeArrow = imageView5;
        this.tooltipNiArrow = imageView6;
        this.tooltipPositiveButton = appCompatButton;
        this.tooltipRightArrow = imageView7;
        this.tooltipTitle = textView2;
        this.tooltipTopArrow = imageView8;
    }

    @NonNull
    public static LayoutTooltipBinding bind(@NonNull View view) {
        int i10 = R.id.tooltip_body;
        TextView textView = (TextView) ViewBindings.findChildViewById(view, i10);
        if (textView != null) {
            i10 = R.id.tooltip_bottom_arrow;
            ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i10);
            if (imageView != null) {
                i10 = R.id.tooltip_content;
                ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(view, i10);
                if (constraintLayout != null) {
                    i10 = R.id.tooltip_iz_arrow;
                    ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, i10);
                    if (imageView2 != null) {
                        i10 = R.id.tooltip_iza_arrow;
                        ImageView imageView3 = (ImageView) ViewBindings.findChildViewById(view, i10);
                        if (imageView3 != null) {
                            i10 = R.id.tooltip_left_arrow;
                            ImageView imageView4 = (ImageView) ViewBindings.findChildViewById(view, i10);
                            if (imageView4 != null) {
                                i10 = R.id.tooltip_ne_arrow;
                                ImageView imageView5 = (ImageView) ViewBindings.findChildViewById(view, i10);
                                if (imageView5 != null) {
                                    i10 = R.id.tooltip_ni_arrow;
                                    ImageView imageView6 = (ImageView) ViewBindings.findChildViewById(view, i10);
                                    if (imageView6 != null) {
                                        i10 = R.id.tooltip_positive_button;
                                        AppCompatButton appCompatButton = (AppCompatButton) ViewBindings.findChildViewById(view, i10);
                                        if (appCompatButton != null) {
                                            i10 = R.id.tooltip_right_arrow;
                                            ImageView imageView7 = (ImageView) ViewBindings.findChildViewById(view, i10);
                                            if (imageView7 != null) {
                                                i10 = R.id.tooltip_title;
                                                TextView textView2 = (TextView) ViewBindings.findChildViewById(view, i10);
                                                if (textView2 != null) {
                                                    i10 = R.id.tooltip_top_arrow;
                                                    ImageView imageView8 = (ImageView) ViewBindings.findChildViewById(view, i10);
                                                    if (imageView8 != null) {
                                                        return new LayoutTooltipBinding((ConstraintLayout) view, textView, imageView, constraintLayout, imageView2, imageView3, imageView4, imageView5, imageView6, appCompatButton, imageView7, textView2, imageView8);
                                                    }
                                                }
                                            }
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
    public static LayoutTooltipBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static LayoutTooltipBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(R.layout.layout_tooltip, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public ConstraintLayout getRoot() {
        return this.f36474p0;
    }
}

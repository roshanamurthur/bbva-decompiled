package com.bbva.glomohybrid.infoscreen.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.bbva.glomohybrid.infoscreen.R;
import com.bbva.glomohybrid.infoscreen.scratchCard.view.ScratchcardBackgroundView;

/* JADX INFO: loaded from: classes6.dex */
public final class ScratchcardBinding implements ViewBinding {

    @NonNull
    public final ScratchcardBackgroundView backgroundView;

    @NonNull
    public final ImageView closeImage;

    @NonNull
    public final ImageView coverImage;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    @NonNull
    public final View f32299p0;

    @NonNull
    public final TextView textButton;

    @NonNull
    public final Button titleButton;

    @NonNull
    public final TextView titleModalLabel;

    @NonNull
    public final LinearLayout toolbar;

    public ScratchcardBinding(@NonNull View view, @NonNull ScratchcardBackgroundView scratchcardBackgroundView, @NonNull ImageView imageView, @NonNull ImageView imageView2, @NonNull TextView textView, @NonNull Button button, @NonNull TextView textView2, @NonNull LinearLayout linearLayout) {
        this.f32299p0 = view;
        this.backgroundView = scratchcardBackgroundView;
        this.closeImage = imageView;
        this.coverImage = imageView2;
        this.textButton = textView;
        this.titleButton = button;
        this.titleModalLabel = textView2;
        this.toolbar = linearLayout;
    }

    @NonNull
    public static ScratchcardBinding bind(@NonNull View view) {
        int i10 = R.id.backgroundView;
        ScratchcardBackgroundView scratchcardBackgroundView = (ScratchcardBackgroundView) ViewBindings.findChildViewById(view, i10);
        if (scratchcardBackgroundView != null) {
            i10 = R.id.closeImage;
            ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i10);
            if (imageView != null) {
                i10 = R.id.coverImage;
                ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, i10);
                if (imageView2 != null) {
                    i10 = R.id.textButton;
                    TextView textView = (TextView) ViewBindings.findChildViewById(view, i10);
                    if (textView != null) {
                        i10 = R.id.titleButton;
                        Button button = (Button) ViewBindings.findChildViewById(view, i10);
                        if (button != null) {
                            i10 = R.id.titleModalLabel;
                            TextView textView2 = (TextView) ViewBindings.findChildViewById(view, i10);
                            if (textView2 != null) {
                                i10 = R.id.toolbar;
                                LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, i10);
                                if (linearLayout != null) {
                                    return new ScratchcardBinding(view, scratchcardBackgroundView, imageView, imageView2, textView, button, textView2, linearLayout);
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
    public static ScratchcardBinding inflate(@NonNull LayoutInflater layoutInflater, @NonNull ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new NullPointerException("parent");
        }
        layoutInflater.inflate(R.layout.scratchcard, viewGroup);
        return bind(viewGroup);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public View getRoot() {
        return this.f32299p0;
    }
}

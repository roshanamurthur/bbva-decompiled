package com.bbva.glomohybrid.infoscreen.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.bbva.glomohybrid.infoscreen.R;

/* JADX INFO: loaded from: classes6.dex */
public final class ScratchcardBackgroundBinding implements ViewBinding {

    @NonNull
    public final TextView amountLabel;

    @NonNull
    public final ImageView backgroundImage;

    @NonNull
    public final LinearLayout backgroundViewContainer;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    @NonNull
    public final View f32298p0;

    @NonNull
    public final TextView subtitleLabel;

    @NonNull
    public final TextView titleLabel;

    public ScratchcardBackgroundBinding(@NonNull View view, @NonNull TextView textView, @NonNull ImageView imageView, @NonNull LinearLayout linearLayout, @NonNull TextView textView2, @NonNull TextView textView3) {
        this.f32298p0 = view;
        this.amountLabel = textView;
        this.backgroundImage = imageView;
        this.backgroundViewContainer = linearLayout;
        this.subtitleLabel = textView2;
        this.titleLabel = textView3;
    }

    @NonNull
    public static ScratchcardBackgroundBinding bind(@NonNull View view) {
        int i10 = R.id.amountLabel;
        TextView textView = (TextView) ViewBindings.findChildViewById(view, i10);
        if (textView != null) {
            i10 = R.id.backgroundImage;
            ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i10);
            if (imageView != null) {
                i10 = R.id.backgroundViewContainer;
                LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, i10);
                if (linearLayout != null) {
                    i10 = R.id.subtitleLabel;
                    TextView textView2 = (TextView) ViewBindings.findChildViewById(view, i10);
                    if (textView2 != null) {
                        i10 = R.id.titleLabel;
                        TextView textView3 = (TextView) ViewBindings.findChildViewById(view, i10);
                        if (textView3 != null) {
                            return new ScratchcardBackgroundBinding(view, textView, imageView, linearLayout, textView2, textView3);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @NonNull
    public static ScratchcardBackgroundBinding inflate(@NonNull LayoutInflater layoutInflater, @NonNull ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new NullPointerException("parent");
        }
        layoutInflater.inflate(R.layout.scratchcard_background, viewGroup);
        return bind(viewGroup);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public View getRoot() {
        return this.f32298p0;
    }
}

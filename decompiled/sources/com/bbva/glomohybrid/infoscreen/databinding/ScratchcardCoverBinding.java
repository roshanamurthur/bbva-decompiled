package com.bbva.glomohybrid.infoscreen.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.bbva.glomohybrid.infoscreen.R;

/* JADX INFO: loaded from: classes6.dex */
public final class ScratchcardCoverBinding implements ViewBinding {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    @NonNull
    public final View f32300p0;

    @NonNull
    public final ImageView screenImage;

    @NonNull
    public final TextView titleScreenLabel;

    public ScratchcardCoverBinding(@NonNull View view, @NonNull ImageView imageView, @NonNull TextView textView) {
        this.f32300p0 = view;
        this.screenImage = imageView;
        this.titleScreenLabel = textView;
    }

    @NonNull
    public static ScratchcardCoverBinding bind(@NonNull View view) {
        int i10 = R.id.screenImage;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i10);
        if (imageView != null) {
            i10 = R.id.titleScreenLabel;
            TextView textView = (TextView) ViewBindings.findChildViewById(view, i10);
            if (textView != null) {
                return new ScratchcardCoverBinding(view, imageView, textView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @NonNull
    public static ScratchcardCoverBinding inflate(@NonNull LayoutInflater layoutInflater, @NonNull ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new NullPointerException("parent");
        }
        layoutInflater.inflate(R.layout.scratchcard_cover, viewGroup);
        return bind(viewGroup);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public View getRoot() {
        return this.f32300p0;
    }
}

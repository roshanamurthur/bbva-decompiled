package com.bbva.touchid.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.bbva.touchid.R;

/* JADX INFO: loaded from: classes.dex */
public final class FingerprintDialogContentBinding implements ViewBinding {

    @NonNull
    public final LinearLayout fingerprintContainer;

    @NonNull
    public final TextView fingerprintDescription;

    @NonNull
    public final ImageView fingerprintIcon;

    @NonNull
    public final LinearLayout fingerprintIconContainer;

    @NonNull
    public final TextView fingerprintStatus;

    @NonNull
    public final TextView fingerprintSubtitle;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    @NonNull
    public final LinearLayout f36937p0;

    public FingerprintDialogContentBinding(@NonNull LinearLayout linearLayout, @NonNull LinearLayout linearLayout2, @NonNull TextView textView, @NonNull ImageView imageView, @NonNull LinearLayout linearLayout3, @NonNull TextView textView2, @NonNull TextView textView3) {
        this.f36937p0 = linearLayout;
        this.fingerprintContainer = linearLayout2;
        this.fingerprintDescription = textView;
        this.fingerprintIcon = imageView;
        this.fingerprintIconContainer = linearLayout3;
        this.fingerprintStatus = textView2;
        this.fingerprintSubtitle = textView3;
    }

    @NonNull
    public static FingerprintDialogContentBinding bind(@NonNull View view) {
        LinearLayout linearLayout = (LinearLayout) view;
        int i10 = R.id.fingerprint_description;
        TextView textView = (TextView) ViewBindings.findChildViewById(view, i10);
        if (textView != null) {
            i10 = R.id.fingerprint_icon;
            ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i10);
            if (imageView != null) {
                i10 = R.id.fingerprint_icon_container;
                LinearLayout linearLayout2 = (LinearLayout) ViewBindings.findChildViewById(view, i10);
                if (linearLayout2 != null) {
                    i10 = R.id.fingerprint_status;
                    TextView textView2 = (TextView) ViewBindings.findChildViewById(view, i10);
                    if (textView2 != null) {
                        i10 = R.id.fingerprint_subtitle;
                        TextView textView3 = (TextView) ViewBindings.findChildViewById(view, i10);
                        if (textView3 != null) {
                            return new FingerprintDialogContentBinding(linearLayout, linearLayout, textView, imageView, linearLayout2, textView2, textView3);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @NonNull
    public static FingerprintDialogContentBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static FingerprintDialogContentBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(R.layout.fingerprint_dialog_content, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public LinearLayout getRoot() {
        return this.f36937p0;
    }
}

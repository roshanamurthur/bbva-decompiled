package com.bbva.signaturepad.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.bbva.signaturepad.R;
import com.bbva.signaturepad.ui.widget.SignaturePadView;

/* JADX INFO: loaded from: classes8.dex */
public final class ActivityDigitalSignatureBinding implements ViewBinding {

    @NonNull
    public final Button AcceptBtn;

    @NonNull
    public final Button DeleteBtn;

    @NonNull
    public final LinearLayout DigitalSignButtonLayout;

    @NonNull
    public final ImageView DigitalSignClearImg;

    @NonNull
    public final ImageView DigitalSignDirectionsImg;

    @NonNull
    public final LinearLayout DigitalSignDirectionsLayout;

    @NonNull
    public final RelativeLayout DigitalSignLayout;

    @NonNull
    public final SignaturePadView DigitalSignView;

    @NonNull
    public final RelativeLayout SignParentLayout;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    @NonNull
    public final LinearLayout f36567p0;

    public ActivityDigitalSignatureBinding(@NonNull LinearLayout linearLayout, @NonNull Button button, @NonNull Button button2, @NonNull LinearLayout linearLayout2, @NonNull ImageView imageView, @NonNull ImageView imageView2, @NonNull LinearLayout linearLayout3, @NonNull RelativeLayout relativeLayout, @NonNull SignaturePadView signaturePadView, @NonNull RelativeLayout relativeLayout2) {
        this.f36567p0 = linearLayout;
        this.AcceptBtn = button;
        this.DeleteBtn = button2;
        this.DigitalSignButtonLayout = linearLayout2;
        this.DigitalSignClearImg = imageView;
        this.DigitalSignDirectionsImg = imageView2;
        this.DigitalSignDirectionsLayout = linearLayout3;
        this.DigitalSignLayout = relativeLayout;
        this.DigitalSignView = signaturePadView;
        this.SignParentLayout = relativeLayout2;
    }

    @NonNull
    public static ActivityDigitalSignatureBinding bind(@NonNull View view) {
        int i10 = R.id.AcceptBtn;
        Button button = (Button) ViewBindings.findChildViewById(view, i10);
        if (button != null) {
            i10 = R.id.DeleteBtn;
            Button button2 = (Button) ViewBindings.findChildViewById(view, i10);
            if (button2 != null) {
                i10 = R.id.DigitalSignButtonLayout;
                LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, i10);
                if (linearLayout != null) {
                    i10 = R.id.DigitalSignClearImg;
                    ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i10);
                    if (imageView != null) {
                        i10 = R.id.DigitalSignDirectionsImg;
                        ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, i10);
                        if (imageView2 != null) {
                            i10 = R.id.DigitalSignDirectionsLayout;
                            LinearLayout linearLayout2 = (LinearLayout) ViewBindings.findChildViewById(view, i10);
                            if (linearLayout2 != null) {
                                i10 = R.id.DigitalSignLayout;
                                RelativeLayout relativeLayout = (RelativeLayout) ViewBindings.findChildViewById(view, i10);
                                if (relativeLayout != null) {
                                    i10 = R.id.DigitalSignView;
                                    SignaturePadView signaturePadView = (SignaturePadView) ViewBindings.findChildViewById(view, i10);
                                    if (signaturePadView != null) {
                                        i10 = R.id.SignParentLayout;
                                        RelativeLayout relativeLayout2 = (RelativeLayout) ViewBindings.findChildViewById(view, i10);
                                        if (relativeLayout2 != null) {
                                            return new ActivityDigitalSignatureBinding((LinearLayout) view, button, button2, linearLayout, imageView, imageView2, linearLayout2, relativeLayout, signaturePadView, relativeLayout2);
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
    public static ActivityDigitalSignatureBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static ActivityDigitalSignatureBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(R.layout.activity_digital_signature, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public LinearLayout getRoot() {
        return this.f36567p0;
    }
}

package mx.openpay.library.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import mx.openpay.library.R;
import mx.openpay.library.ui.component.signature.SignatureView;

/* JADX INFO: loaded from: classes12.dex */
public final class ActivityDigitalSignatureComponentBinding implements ViewBinding {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ConstraintLayout f83821a;

    @Nullable
    public final LinearLayout buttonsContainer;

    @NonNull
    public final LinearLayout captionContainer;

    @NonNull
    public final TextView captionTextview;

    @NonNull
    public final Button clearButton;

    @NonNull
    public final ImageView closeButton;

    @NonNull
    public final Button continueButton;

    @NonNull
    public final SignatureView signatureView;

    @NonNull
    public final TextView titleTextview;

    public ActivityDigitalSignatureComponentBinding(ConstraintLayout constraintLayout, LinearLayout linearLayout, LinearLayout linearLayout2, TextView textView, Button button, ImageView imageView, Button button2, SignatureView signatureView, TextView textView2) {
        this.f83821a = constraintLayout;
        this.buttonsContainer = linearLayout;
        this.captionContainer = linearLayout2;
        this.captionTextview = textView;
        this.clearButton = button;
        this.closeButton = imageView;
        this.continueButton = button2;
        this.signatureView = signatureView;
        this.titleTextview = textView2;
    }

    @NonNull
    public static ActivityDigitalSignatureComponentBinding bind(@NonNull View view) {
        LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, R.id.buttonsContainer);
        int i10 = R.id.caption_container;
        LinearLayout linearLayout2 = (LinearLayout) ViewBindings.findChildViewById(view, i10);
        if (linearLayout2 != null) {
            i10 = R.id.caption_textview;
            TextView textView = (TextView) ViewBindings.findChildViewById(view, i10);
            if (textView != null) {
                i10 = R.id.clear_button;
                Button button = (Button) ViewBindings.findChildViewById(view, i10);
                if (button != null) {
                    i10 = R.id.close_button;
                    ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i10);
                    if (imageView != null) {
                        i10 = R.id.continue_button;
                        Button button2 = (Button) ViewBindings.findChildViewById(view, i10);
                        if (button2 != null) {
                            i10 = R.id.signature_view;
                            SignatureView signatureView = (SignatureView) ViewBindings.findChildViewById(view, i10);
                            if (signatureView != null) {
                                i10 = R.id.titleTextview;
                                TextView textView2 = (TextView) ViewBindings.findChildViewById(view, i10);
                                if (textView2 != null) {
                                    return new ActivityDigitalSignatureComponentBinding((ConstraintLayout) view, linearLayout, linearLayout2, textView, button, imageView, button2, signatureView, textView2);
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
    public static ActivityDigitalSignatureComponentBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static ActivityDigitalSignatureComponentBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(R.layout.activity_digital_signature_component, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public ConstraintLayout getRoot() {
        return this.f83821a;
    }
}

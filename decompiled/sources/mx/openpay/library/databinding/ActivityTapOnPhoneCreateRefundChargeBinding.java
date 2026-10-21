package mx.openpay.library.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.airbnb.lottie.LottieAnimationView;
import mx.openpay.library.R;

/* JADX INFO: loaded from: classes12.dex */
public final class ActivityTapOnPhoneCreateRefundChargeBinding implements ViewBinding {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final FrameLayout f83823a;

    @NonNull
    public final LottieAnimationView tapOnPhoneAnimation;

    @NonNull
    public final TextView tapOnPhoneBottomDisclaimer;

    @NonNull
    public final ImageView tapOnPhoneCancel;

    @NonNull
    public final ImageView tapOnPhoneCards;

    @NonNull
    public final TextView tapOnPhoneContent;

    @NonNull
    public final ConstraintLayout tapOnPhoneLoader;

    @NonNull
    public final LottieAnimationView tapOnPhoneLoaderAnimation;

    @NonNull
    public final TextView tapOnPhoneLoaderMessage;

    @NonNull
    public final TextView tapOnPhoneLoaderProcessing;

    @NonNull
    public final TextView tapOnPhoneSale;

    @NonNull
    public final TextView tapOnPhoneSaleAmount;

    @NonNull
    public final TextView tapOnPhoneSubtitle;

    @NonNull
    public final TextView tapOnPhoneTitle;

    public ActivityTapOnPhoneCreateRefundChargeBinding(FrameLayout frameLayout, LottieAnimationView lottieAnimationView, TextView textView, ImageView imageView, ImageView imageView2, TextView textView2, ConstraintLayout constraintLayout, LottieAnimationView lottieAnimationView2, TextView textView3, TextView textView4, TextView textView5, TextView textView6, TextView textView7, TextView textView8) {
        this.f83823a = frameLayout;
        this.tapOnPhoneAnimation = lottieAnimationView;
        this.tapOnPhoneBottomDisclaimer = textView;
        this.tapOnPhoneCancel = imageView;
        this.tapOnPhoneCards = imageView2;
        this.tapOnPhoneContent = textView2;
        this.tapOnPhoneLoader = constraintLayout;
        this.tapOnPhoneLoaderAnimation = lottieAnimationView2;
        this.tapOnPhoneLoaderMessage = textView3;
        this.tapOnPhoneLoaderProcessing = textView4;
        this.tapOnPhoneSale = textView5;
        this.tapOnPhoneSaleAmount = textView6;
        this.tapOnPhoneSubtitle = textView7;
        this.tapOnPhoneTitle = textView8;
    }

    @NonNull
    public static ActivityTapOnPhoneCreateRefundChargeBinding bind(@NonNull View view) {
        int i10 = R.id.tap_on_phone_animation;
        LottieAnimationView lottieAnimationView = (LottieAnimationView) ViewBindings.findChildViewById(view, i10);
        if (lottieAnimationView != null) {
            i10 = R.id.tap_on_phone_bottom_disclaimer;
            TextView textView = (TextView) ViewBindings.findChildViewById(view, i10);
            if (textView != null) {
                i10 = R.id.tap_on_phone_cancel;
                ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i10);
                if (imageView != null) {
                    i10 = R.id.tap_on_phone_cards;
                    ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, i10);
                    if (imageView2 != null) {
                        i10 = R.id.tap_on_phone_content;
                        TextView textView2 = (TextView) ViewBindings.findChildViewById(view, i10);
                        if (textView2 != null) {
                            i10 = R.id.tap_on_phone_loader;
                            ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(view, i10);
                            if (constraintLayout != null) {
                                i10 = R.id.tap_on_phone_loader_animation;
                                LottieAnimationView lottieAnimationView2 = (LottieAnimationView) ViewBindings.findChildViewById(view, i10);
                                if (lottieAnimationView2 != null) {
                                    i10 = R.id.tap_on_phone_loader_message;
                                    TextView textView3 = (TextView) ViewBindings.findChildViewById(view, i10);
                                    if (textView3 != null) {
                                        i10 = R.id.tap_on_phone_loader_processing;
                                        TextView textView4 = (TextView) ViewBindings.findChildViewById(view, i10);
                                        if (textView4 != null) {
                                            i10 = R.id.tap_on_phone_sale;
                                            TextView textView5 = (TextView) ViewBindings.findChildViewById(view, i10);
                                            if (textView5 != null) {
                                                i10 = R.id.tap_on_phone_sale_amount;
                                                TextView textView6 = (TextView) ViewBindings.findChildViewById(view, i10);
                                                if (textView6 != null) {
                                                    i10 = R.id.tap_on_phone_subtitle;
                                                    TextView textView7 = (TextView) ViewBindings.findChildViewById(view, i10);
                                                    if (textView7 != null) {
                                                        i10 = R.id.tap_on_phone_title;
                                                        TextView textView8 = (TextView) ViewBindings.findChildViewById(view, i10);
                                                        if (textView8 != null) {
                                                            return new ActivityTapOnPhoneCreateRefundChargeBinding((FrameLayout) view, lottieAnimationView, textView, imageView, imageView2, textView2, constraintLayout, lottieAnimationView2, textView3, textView4, textView5, textView6, textView7, textView8);
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
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @NonNull
    public static ActivityTapOnPhoneCreateRefundChargeBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static ActivityTapOnPhoneCreateRefundChargeBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(R.layout.activity_tap_on_phone_create_refund_charge, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public FrameLayout getRoot() {
        return this.f83823a;
    }
}

package com.google.android.material.textfield;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Typeface;
import android.text.TextUtils;
import android.util.Property;
import android.view.View;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.core.view.ViewCompat;
import com.google.android.material.R;
import com.google.android.material.animation.AnimationUtils;
import com.google.android.material.animation.AnimatorSetCompat;
import com.google.android.material.motion.MotionUtils;
import com.google.android.material.resources.MaterialResources;
import java.util.ArrayList;

/* JADX INFO: compiled from: IndicatorViewController.java */
/* JADX INFO: loaded from: classes10.dex */
public final class p {

    @Nullable
    public ColorStateList A;
    public Typeface B;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f45663a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f45664b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f45665c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NonNull
    public final TimeInterpolator f45666d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NonNull
    public final TimeInterpolator f45667e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NonNull
    public final TimeInterpolator f45668f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Context f45669g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NonNull
    public final TextInputLayout f45670h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public LinearLayout f45671i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f45672j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public FrameLayout f45673k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @Nullable
    public Animator f45674l;
    public final float m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f45675n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f45676o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @Nullable
    public CharSequence f45677p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f45678q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @Nullable
    public AppCompatTextView f45679r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @Nullable
    public CharSequence f45680s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f45681t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f45682u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    @Nullable
    public ColorStateList f45683v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public CharSequence f45684w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public boolean f45685x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    @Nullable
    public AppCompatTextView f45686y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public int f45687z;

    /* JADX INFO: compiled from: IndicatorViewController.java */
    public class a extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ int f45688a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ TextView f45689b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ int f45690c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ TextView f45691d;

        public a(int i10, TextView textView, int i11, TextView textView2) {
            this.f45688a = i10;
            this.f45689b = textView;
            this.f45690c = i11;
            this.f45691d = textView2;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            AppCompatTextView appCompatTextView;
            int i10 = this.f45688a;
            p pVar = p.this;
            pVar.f45675n = i10;
            pVar.f45674l = null;
            TextView textView = this.f45689b;
            if (textView != null) {
                textView.setVisibility(4);
                if (this.f45690c == 1 && (appCompatTextView = pVar.f45679r) != null) {
                    appCompatTextView.setText((CharSequence) null);
                }
            }
            TextView textView2 = this.f45691d;
            if (textView2 != null) {
                textView2.setTranslationY(0.0f);
                textView2.setAlpha(1.0f);
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationStart(Animator animator) {
            TextView textView = this.f45691d;
            if (textView != null) {
                textView.setVisibility(0);
                textView.setAlpha(0.0f);
            }
        }
    }

    public p(@NonNull TextInputLayout textInputLayout) {
        Context context = textInputLayout.getContext();
        this.f45669g = context;
        this.f45670h = textInputLayout;
        this.m = context.getResources().getDimensionPixelSize(R.dimen.design_textinput_caption_translate_y);
        int i10 = R.attr.motionDurationShort4;
        this.f45663a = MotionUtils.resolveThemeDuration(context, i10, 217);
        this.f45664b = MotionUtils.resolveThemeDuration(context, R.attr.motionDurationMedium4, 167);
        this.f45665c = MotionUtils.resolveThemeDuration(context, i10, 167);
        int i11 = R.attr.motionEasingEmphasizedDecelerateInterpolator;
        this.f45666d = MotionUtils.resolveThemeInterpolator(context, i11, AnimationUtils.LINEAR_OUT_SLOW_IN_INTERPOLATOR);
        TimeInterpolator timeInterpolator = AnimationUtils.LINEAR_INTERPOLATOR;
        this.f45667e = MotionUtils.resolveThemeInterpolator(context, i11, timeInterpolator);
        this.f45668f = MotionUtils.resolveThemeInterpolator(context, R.attr.motionEasingLinearInterpolator, timeInterpolator);
    }

    public final void a(TextView textView, int i10) {
        if (this.f45671i == null && this.f45673k == null) {
            Context context = this.f45669g;
            LinearLayout linearLayout = new LinearLayout(context);
            this.f45671i = linearLayout;
            linearLayout.setOrientation(0);
            LinearLayout linearLayout2 = this.f45671i;
            TextInputLayout textInputLayout = this.f45670h;
            textInputLayout.addView(linearLayout2, -1, -2);
            this.f45673k = new FrameLayout(context);
            this.f45671i.addView(this.f45673k, new LinearLayout.LayoutParams(0, -2, 1.0f));
            if (textInputLayout.getEditText() != null) {
                b();
            }
        }
        if (i10 == 0 || i10 == 1) {
            this.f45673k.setVisibility(0);
            this.f45673k.addView(textView);
        } else {
            this.f45671i.addView(textView, new LinearLayout.LayoutParams(-2, -2));
        }
        this.f45671i.setVisibility(0);
        this.f45672j++;
    }

    public final void b() {
        if (this.f45671i != null) {
            TextInputLayout textInputLayout = this.f45670h;
            if (textInputLayout.getEditText() != null) {
                EditText editText = textInputLayout.getEditText();
                Context context = this.f45669g;
                boolean zIsFontScaleAtLeast1_3 = MaterialResources.isFontScaleAtLeast1_3(context);
                LinearLayout linearLayout = this.f45671i;
                int i10 = R.dimen.material_helper_text_font_1_3_padding_horizontal;
                int paddingStart = ViewCompat.getPaddingStart(editText);
                if (zIsFontScaleAtLeast1_3) {
                    paddingStart = context.getResources().getDimensionPixelSize(i10);
                }
                int i11 = R.dimen.material_helper_text_font_1_3_padding_top;
                int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.material_helper_text_default_padding_top);
                if (zIsFontScaleAtLeast1_3) {
                    dimensionPixelSize = context.getResources().getDimensionPixelSize(i11);
                }
                int paddingEnd = ViewCompat.getPaddingEnd(editText);
                if (zIsFontScaleAtLeast1_3) {
                    paddingEnd = context.getResources().getDimensionPixelSize(i10);
                }
                ViewCompat.setPaddingRelative(linearLayout, paddingStart, dimensionPixelSize, paddingEnd, 0);
            }
        }
    }

    public final void c() {
        Animator animator = this.f45674l;
        if (animator != null) {
            animator.cancel();
        }
    }

    public final void d(@NonNull ArrayList arrayList, boolean z10, @Nullable TextView textView, int i10, int i11, int i12) {
        if (textView == null || !z10) {
            return;
        }
        if (i10 == i12 || i10 == i11) {
            boolean z11 = i12 == i10;
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(textView, (Property<TextView, Float>) View.ALPHA, z11 ? 1.0f : 0.0f);
            int i13 = this.f45665c;
            objectAnimatorOfFloat.setDuration(z11 ? this.f45664b : i13);
            objectAnimatorOfFloat.setInterpolator(z11 ? this.f45667e : this.f45668f);
            if (i10 == i12 && i11 != 0) {
                objectAnimatorOfFloat.setStartDelay(i13);
            }
            arrayList.add(objectAnimatorOfFloat);
            if (i12 != i10 || i11 == 0) {
                return;
            }
            ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(textView, (Property<TextView, Float>) View.TRANSLATION_Y, -this.m, 0.0f);
            objectAnimatorOfFloat2.setDuration(this.f45663a);
            objectAnimatorOfFloat2.setInterpolator(this.f45666d);
            objectAnimatorOfFloat2.setStartDelay(i13);
            arrayList.add(objectAnimatorOfFloat2);
        }
    }

    @Nullable
    public final TextView e(int i10) {
        if (i10 == 1) {
            return this.f45679r;
        }
        if (i10 != 2) {
            return null;
        }
        return this.f45686y;
    }

    public final void f() {
        this.f45677p = null;
        c();
        if (this.f45675n == 1) {
            if (!this.f45685x || TextUtils.isEmpty(this.f45684w)) {
                this.f45676o = 0;
            } else {
                this.f45676o = 2;
            }
        }
        i(this.f45675n, this.f45676o, h(this.f45679r, ""));
    }

    public final void g(TextView textView, int i10) {
        FrameLayout frameLayout;
        LinearLayout linearLayout = this.f45671i;
        if (linearLayout == null) {
            return;
        }
        if ((i10 == 0 || i10 == 1) && (frameLayout = this.f45673k) != null) {
            frameLayout.removeView(textView);
        } else {
            linearLayout.removeView(textView);
        }
        int i11 = this.f45672j - 1;
        this.f45672j = i11;
        LinearLayout linearLayout2 = this.f45671i;
        if (i11 == 0) {
            linearLayout2.setVisibility(8);
        }
    }

    public final boolean h(@Nullable TextView textView, @NonNull CharSequence charSequence) {
        TextInputLayout textInputLayout = this.f45670h;
        return ViewCompat.isLaidOut(textInputLayout) && textInputLayout.isEnabled() && !(this.f45676o == this.f45675n && textView != null && TextUtils.equals(textView.getText(), charSequence));
    }

    public final void i(int i10, int i11, boolean z10) {
        TextView textViewE;
        TextView textViewE2;
        if (i10 == i11) {
            return;
        }
        if (z10) {
            AnimatorSet animatorSet = new AnimatorSet();
            this.f45674l = animatorSet;
            ArrayList arrayList = new ArrayList();
            d(arrayList, this.f45685x, this.f45686y, 2, i10, i11);
            d(arrayList, this.f45678q, this.f45679r, 1, i10, i11);
            AnimatorSetCompat.playTogether(animatorSet, arrayList);
            animatorSet.addListener(new a(i11, e(i10), i10, e(i11)));
            animatorSet.start();
        } else if (i10 != i11) {
            if (i11 != 0 && (textViewE2 = e(i11)) != null) {
                textViewE2.setVisibility(0);
                textViewE2.setAlpha(1.0f);
            }
            if (i10 != 0 && (textViewE = e(i10)) != null) {
                textViewE.setVisibility(4);
                if (i10 == 1) {
                    textViewE.setText((CharSequence) null);
                }
            }
            this.f45675n = i11;
        }
        TextInputLayout textInputLayout = this.f45670h;
        textInputLayout.r();
        textInputLayout.u(z10, false);
        textInputLayout.x();
    }
}

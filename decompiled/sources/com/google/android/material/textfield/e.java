package com.google.android.material.textfield;

import android.animation.AnimatorSet;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.view.View;
import android.widget.EditText;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.camera.core.z;
import com.google.android.material.R;
import com.google.android.material.animation.AnimationUtils;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.motion.MotionUtils;

/* JADX INFO: compiled from: ClearTextEndIconDelegate.java */
/* JADX INFO: loaded from: classes10.dex */
public final class e extends n {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f45617e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f45618f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NonNull
    public final TimeInterpolator f45619g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NonNull
    public final TimeInterpolator f45620h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @Nullable
    public EditText f45621i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final n4.k f45622j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final b f45623k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public AnimatorSet f45624l;
    public ValueAnimator m;

    /* JADX WARN: Type inference failed for: r0v1, types: [com.google.android.material.textfield.b] */
    public e(@NonNull m mVar) {
        super(mVar);
        this.f45622j = new n4.k(this, 5);
        this.f45623k = new View.OnFocusChangeListener() { // from class: com.google.android.material.textfield.b
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z10) {
                e eVar = this.f45614a;
                eVar.t(eVar.u());
            }
        };
        Context context = mVar.getContext();
        int i10 = R.attr.motionDurationShort3;
        this.f45617e = MotionUtils.resolveThemeDuration(context, i10, 100);
        this.f45618f = MotionUtils.resolveThemeDuration(mVar.getContext(), i10, 150);
        this.f45619g = MotionUtils.resolveThemeInterpolator(mVar.getContext(), R.attr.motionEasingLinearInterpolator, AnimationUtils.LINEAR_INTERPOLATOR);
        this.f45620h = MotionUtils.resolveThemeInterpolator(mVar.getContext(), R.attr.motionEasingEmphasizedInterpolator, AnimationUtils.LINEAR_OUT_SLOW_IN_INTERPOLATOR);
    }

    @Override // com.google.android.material.textfield.n
    public final void a() {
        if (this.f45660b.J0 != null) {
            return;
        }
        t(u());
    }

    @Override // com.google.android.material.textfield.n
    public final int c() {
        return R.string.clear_text_end_icon_content_description;
    }

    @Override // com.google.android.material.textfield.n
    public final int d() {
        return R.drawable.mtrl_ic_cancel;
    }

    @Override // com.google.android.material.textfield.n
    public final View.OnFocusChangeListener e() {
        return this.f45623k;
    }

    @Override // com.google.android.material.textfield.n
    public final View.OnClickListener f() {
        return this.f45622j;
    }

    @Override // com.google.android.material.textfield.n
    public final View.OnFocusChangeListener g() {
        return this.f45623k;
    }

    @Override // com.google.android.material.textfield.n
    public final void m(@Nullable EditText editText) {
        this.f45621i = editText;
        this.f45659a.setEndIconVisible(u());
    }

    @Override // com.google.android.material.textfield.n
    public final void p(boolean z10) {
        if (this.f45660b.J0 == null) {
            return;
        }
        t(z10);
    }

    @Override // com.google.android.material.textfield.n
    public final void r() {
        int i10 = 2;
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.8f, 1.0f);
        valueAnimatorOfFloat.setInterpolator(this.f45620h);
        valueAnimatorOfFloat.setDuration(this.f45618f);
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.google.android.material.textfield.a
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                e eVar = this.f45613a;
                eVar.getClass();
                float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                CheckableImageButton checkableImageButton = eVar.f45662d;
                checkableImageButton.setScaleX(fFloatValue);
                checkableImageButton.setScaleY(fFloatValue);
            }
        });
        ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
        TimeInterpolator timeInterpolator = this.f45619g;
        valueAnimatorOfFloat2.setInterpolator(timeInterpolator);
        int i11 = this.f45617e;
        valueAnimatorOfFloat2.setDuration(i11);
        valueAnimatorOfFloat2.addUpdateListener(new com.airbnb.lottie.t(this, i10));
        AnimatorSet animatorSet = new AnimatorSet();
        this.f45624l = animatorSet;
        animatorSet.playTogether(valueAnimatorOfFloat, valueAnimatorOfFloat2);
        this.f45624l.addListener(new c(this));
        ValueAnimator valueAnimatorOfFloat3 = ValueAnimator.ofFloat(1.0f, 0.0f);
        valueAnimatorOfFloat3.setInterpolator(timeInterpolator);
        valueAnimatorOfFloat3.setDuration(i11);
        valueAnimatorOfFloat3.addUpdateListener(new com.airbnb.lottie.t(this, i10));
        this.m = valueAnimatorOfFloat3;
        valueAnimatorOfFloat3.addListener(new d(this));
    }

    @Override // com.google.android.material.textfield.n
    public final void s() {
        EditText editText = this.f45621i;
        if (editText != null) {
            editText.post(new z(this, 6));
        }
    }

    public final void t(boolean z10) {
        boolean z11 = this.f45660b.d() == z10;
        if (z10 && !this.f45624l.isRunning()) {
            this.m.cancel();
            this.f45624l.start();
            if (z11) {
                this.f45624l.end();
                return;
            }
            return;
        }
        if (z10) {
            return;
        }
        this.f45624l.cancel();
        this.m.start();
        if (z11) {
            this.m.end();
        }
    }

    public final boolean u() {
        EditText editText = this.f45621i;
        return editText != null && (editText.hasFocus() || this.f45662d.hasFocus()) && this.f45621i.getText().length() > 0;
    }
}

package com.google.android.material.snackbar;

import android.animation.TimeInterpolator;
import android.content.Context;
import android.text.Layout;
import android.util.AttributeSet;
import android.view.ViewPropertyAnimator;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.core.view.ViewCompat;
import com.google.android.material.R;
import com.google.android.material.animation.AnimationUtils;
import com.google.android.material.motion.MotionUtils;

/* JADX INFO: loaded from: classes10.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public class SnackbarContentLayout extends LinearLayout implements ContentViewCallback {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public TextView f45453p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public Button f45454q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final TimeInterpolator f45455r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public int f45456s0;

    public SnackbarContentLayout(@NonNull Context context) {
        this(context, null);
    }

    public final boolean a(int i10, int i11, int i12) {
        boolean z10;
        if (i10 != getOrientation()) {
            setOrientation(i10);
            z10 = true;
        } else {
            z10 = false;
        }
        if (this.f45453p0.getPaddingTop() == i11 && this.f45453p0.getPaddingBottom() == i12) {
            return z10;
        }
        TextView textView = this.f45453p0;
        if (ViewCompat.isPaddingRelative(textView)) {
            ViewCompat.setPaddingRelative(textView, ViewCompat.getPaddingStart(textView), i11, ViewCompat.getPaddingEnd(textView), i12);
            return true;
        }
        textView.setPadding(textView.getPaddingLeft(), i11, textView.getPaddingRight(), i12);
        return true;
    }

    @Override // com.google.android.material.snackbar.ContentViewCallback
    public void animateContentIn(int i10, int i11) {
        this.f45453p0.setAlpha(0.0f);
        long j10 = i11;
        ViewPropertyAnimator duration = this.f45453p0.animate().alpha(1.0f).setDuration(j10);
        TimeInterpolator timeInterpolator = this.f45455r0;
        long j11 = i10;
        duration.setInterpolator(timeInterpolator).setStartDelay(j11).start();
        if (this.f45454q0.getVisibility() == 0) {
            this.f45454q0.setAlpha(0.0f);
            this.f45454q0.animate().alpha(1.0f).setDuration(j10).setInterpolator(timeInterpolator).setStartDelay(j11).start();
        }
    }

    @Override // com.google.android.material.snackbar.ContentViewCallback
    public void animateContentOut(int i10, int i11) {
        this.f45453p0.setAlpha(1.0f);
        long j10 = i11;
        ViewPropertyAnimator duration = this.f45453p0.animate().alpha(0.0f).setDuration(j10);
        TimeInterpolator timeInterpolator = this.f45455r0;
        long j11 = i10;
        duration.setInterpolator(timeInterpolator).setStartDelay(j11).start();
        if (this.f45454q0.getVisibility() == 0) {
            this.f45454q0.setAlpha(1.0f);
            this.f45454q0.animate().alpha(0.0f).setDuration(j10).setInterpolator(timeInterpolator).setStartDelay(j11).start();
        }
    }

    public Button getActionView() {
        return this.f45454q0;
    }

    public TextView getMessageView() {
        return this.f45453p0;
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        this.f45453p0 = (TextView) findViewById(R.id.snackbar_text);
        this.f45454q0 = (Button) findViewById(R.id.snackbar_action);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        if (getOrientation() == 1) {
            return;
        }
        int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.design_snackbar_padding_vertical_2lines);
        int dimensionPixelSize2 = getResources().getDimensionPixelSize(R.dimen.design_snackbar_padding_vertical);
        Layout layout = this.f45453p0.getLayout();
        boolean z10 = layout != null && layout.getLineCount() > 1;
        if (!z10 || this.f45456s0 <= 0 || this.f45454q0.getMeasuredWidth() <= this.f45456s0) {
            if (!z10) {
                dimensionPixelSize = dimensionPixelSize2;
            }
            if (!a(0, dimensionPixelSize, dimensionPixelSize)) {
                return;
            }
        } else if (!a(1, dimensionPixelSize, dimensionPixelSize - dimensionPixelSize2)) {
            return;
        }
        super.onMeasure(i10, i11);
    }

    public void setMaxInlineActionWidth(int i10) {
        this.f45456s0 = i10;
    }

    public SnackbarContentLayout(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f45455r0 = MotionUtils.resolveThemeInterpolator(context, R.attr.motionEasingEmphasizedInterpolator, AnimationUtils.FAST_OUT_SLOW_IN_INTERPOLATOR);
    }
}

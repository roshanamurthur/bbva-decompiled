package com.google.android.material.textfield;

import android.annotation.SuppressLint;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.TintTypedArray;
import androidx.core.view.GravityCompat;
import androidx.core.view.MarginLayoutParamsCompat;
import androidx.core.view.ViewCompat;
import androidx.core.widget.TextViewCompat;
import com.google.android.material.R;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.internal.ViewUtils;
import com.google.android.material.resources.MaterialResources;

/* JADX INFO: compiled from: StartCompoundLayout.java */
/* JADX INFO: loaded from: classes10.dex */
@SuppressLint({"ViewConstructor"})
public final class t extends LinearLayout {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final TextInputLayout f45697p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final AppCompatTextView f45698q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    @Nullable
    public CharSequence f45699r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final CheckableImageButton f45700s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public ColorStateList f45701t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public PorterDuff.Mode f45702u0;
    public int v0;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    @NonNull
    public ImageView.ScaleType f45703w0;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public View.OnLongClickListener f45704x0;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    public boolean f45705y0;

    public t(TextInputLayout textInputLayout, TintTypedArray tintTypedArray) {
        CharSequence text;
        super(textInputLayout.getContext());
        this.f45697p0 = textInputLayout;
        setVisibility(8);
        setOrientation(0);
        setLayoutParams(new FrameLayout.LayoutParams(-2, -1, GravityCompat.START));
        CheckableImageButton checkableImageButton = (CheckableImageButton) LayoutInflater.from(getContext()).inflate(R.layout.design_text_input_start_icon, (ViewGroup) this, false);
        this.f45700s0 = checkableImageButton;
        AppCompatTextView appCompatTextView = new AppCompatTextView(getContext());
        this.f45698q0 = appCompatTextView;
        if (MaterialResources.isFontScaleAtLeast1_3(getContext())) {
            MarginLayoutParamsCompat.setMarginEnd((ViewGroup.MarginLayoutParams) checkableImageButton.getLayoutParams(), 0);
        }
        View.OnLongClickListener onLongClickListener = this.f45704x0;
        checkableImageButton.setOnClickListener(null);
        o.d(checkableImageButton, onLongClickListener);
        this.f45704x0 = null;
        checkableImageButton.setOnLongClickListener(null);
        o.d(checkableImageButton, null);
        int i10 = R.styleable.TextInputLayout_startIconTint;
        if (tintTypedArray.hasValue(i10)) {
            this.f45701t0 = MaterialResources.getColorStateList(getContext(), tintTypedArray, i10);
        }
        int i11 = R.styleable.TextInputLayout_startIconTintMode;
        if (tintTypedArray.hasValue(i11)) {
            this.f45702u0 = ViewUtils.parseTintMode(tintTypedArray.getInt(i11, -1), null);
        }
        int i12 = R.styleable.TextInputLayout_startIconDrawable;
        if (tintTypedArray.hasValue(i12)) {
            b(tintTypedArray.getDrawable(i12));
            int i13 = R.styleable.TextInputLayout_startIconContentDescription;
            if (tintTypedArray.hasValue(i13) && checkableImageButton.getContentDescription() != (text = tintTypedArray.getText(i13))) {
                checkableImageButton.setContentDescription(text);
            }
            checkableImageButton.setCheckable(tintTypedArray.getBoolean(R.styleable.TextInputLayout_startIconCheckable, true));
        }
        int dimensionPixelSize = tintTypedArray.getDimensionPixelSize(R.styleable.TextInputLayout_startIconMinSize, getResources().getDimensionPixelSize(R.dimen.mtrl_min_touch_target_size));
        if (dimensionPixelSize < 0) {
            throw new IllegalArgumentException("startIconSize cannot be less than 0");
        }
        if (dimensionPixelSize != this.v0) {
            this.v0 = dimensionPixelSize;
            checkableImageButton.setMinimumWidth(dimensionPixelSize);
            checkableImageButton.setMinimumHeight(dimensionPixelSize);
        }
        int i14 = R.styleable.TextInputLayout_startIconScaleType;
        if (tintTypedArray.hasValue(i14)) {
            ImageView.ScaleType scaleTypeB = o.b(tintTypedArray.getInt(i14, -1));
            this.f45703w0 = scaleTypeB;
            checkableImageButton.setScaleType(scaleTypeB);
        }
        appCompatTextView.setVisibility(8);
        appCompatTextView.setId(R.id.textinput_prefix_text);
        appCompatTextView.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        ViewCompat.setAccessibilityLiveRegion(appCompatTextView, 1);
        TextViewCompat.setTextAppearance(appCompatTextView, tintTypedArray.getResourceId(R.styleable.TextInputLayout_prefixTextAppearance, 0));
        int i15 = R.styleable.TextInputLayout_prefixTextColor;
        if (tintTypedArray.hasValue(i15)) {
            appCompatTextView.setTextColor(tintTypedArray.getColorStateList(i15));
        }
        CharSequence text2 = tintTypedArray.getText(R.styleable.TextInputLayout_prefixText);
        this.f45699r0 = TextUtils.isEmpty(text2) ? null : text2;
        appCompatTextView.setText(text2);
        e();
        addView(checkableImageButton);
        addView(appCompatTextView);
    }

    public final int a() {
        int marginEnd;
        CheckableImageButton checkableImageButton = this.f45700s0;
        if (checkableImageButton.getVisibility() == 0) {
            marginEnd = MarginLayoutParamsCompat.getMarginEnd((ViewGroup.MarginLayoutParams) checkableImageButton.getLayoutParams()) + checkableImageButton.getMeasuredWidth();
        } else {
            marginEnd = 0;
        }
        return ViewCompat.getPaddingStart(this.f45698q0) + ViewCompat.getPaddingStart(this) + marginEnd;
    }

    public final void b(@Nullable Drawable drawable) {
        CheckableImageButton checkableImageButton = this.f45700s0;
        checkableImageButton.setImageDrawable(drawable);
        if (drawable != null) {
            ColorStateList colorStateList = this.f45701t0;
            PorterDuff.Mode mode = this.f45702u0;
            TextInputLayout textInputLayout = this.f45697p0;
            o.a(textInputLayout, checkableImageButton, colorStateList, mode);
            c(true);
            o.c(textInputLayout, checkableImageButton, this.f45701t0);
            return;
        }
        c(false);
        View.OnLongClickListener onLongClickListener = this.f45704x0;
        checkableImageButton.setOnClickListener(null);
        o.d(checkableImageButton, onLongClickListener);
        this.f45704x0 = null;
        checkableImageButton.setOnLongClickListener(null);
        o.d(checkableImageButton, null);
        if (checkableImageButton.getContentDescription() != null) {
            checkableImageButton.setContentDescription(null);
        }
    }

    public final void c(boolean z10) {
        CheckableImageButton checkableImageButton = this.f45700s0;
        if ((checkableImageButton.getVisibility() == 0) != z10) {
            checkableImageButton.setVisibility(z10 ? 0 : 8);
            d();
            e();
        }
    }

    public final void d() {
        EditText editText = this.f45697p0.f45591s0;
        if (editText == null) {
            return;
        }
        ViewCompat.setPaddingRelative(this.f45698q0, this.f45700s0.getVisibility() == 0 ? 0 : ViewCompat.getPaddingStart(editText), editText.getCompoundPaddingTop(), getContext().getResources().getDimensionPixelSize(R.dimen.material_input_text_to_prefix_suffix_padding), editText.getCompoundPaddingBottom());
    }

    public final void e() {
        int i10 = (this.f45699r0 == null || this.f45705y0) ? 8 : 0;
        setVisibility((this.f45700s0.getVisibility() == 0 || i10 == 0) ? 0 : 8);
        this.f45698q0.setVisibility(i10);
        this.f45697p0.q();
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        d();
    }
}

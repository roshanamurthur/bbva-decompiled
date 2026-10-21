package com.google.android.material.tooltip;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.AttrRes;
import androidx.annotation.FloatRange;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.Px;
import androidx.annotation.RestrictTo;
import androidx.annotation.StringRes;
import androidx.annotation.StyleRes;
import androidx.core.graphics.ColorUtils;
import com.google.android.material.R;
import com.google.android.material.animation.AnimationUtils;
import com.google.android.material.color.MaterialColors;
import com.google.android.material.internal.TextDrawableHelper;
import com.google.android.material.internal.ThemeEnforcement;
import com.google.android.material.resources.MaterialResources;
import com.google.android.material.resources.TextAppearance;
import com.google.android.material.shape.MarkerEdgeTreatment;
import com.google.android.material.shape.MaterialShapeDrawable;
import com.google.android.material.shape.OffsetEdgeTreatment;

/* JADX INFO: loaded from: classes10.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public class TooltipDrawable extends MaterialShapeDrawable implements TextDrawableHelper.TextDrawableDelegate {

    /* JADX INFO: renamed from: j1, reason: collision with root package name */
    @StyleRes
    public static final int f45804j1 = R.style.Widget_MaterialComponents_Tooltip;

    /* JADX INFO: renamed from: k1, reason: collision with root package name */
    @AttrRes
    public static final int f45805k1 = R.attr.tooltipStyle;

    @Nullable
    public CharSequence S0;

    @NonNull
    public final Context T0;

    @Nullable
    public final Paint.FontMetrics U0;

    @NonNull
    public final TextDrawableHelper V0;

    @NonNull
    public final a W0;

    @NonNull
    public final Rect X0;
    public int Y0;
    public int Z0;

    /* JADX INFO: renamed from: a1, reason: collision with root package name */
    public int f45806a1;

    /* JADX INFO: renamed from: b1, reason: collision with root package name */
    public int f45807b1;

    /* JADX INFO: renamed from: c1, reason: collision with root package name */
    public boolean f45808c1;

    /* JADX INFO: renamed from: d1, reason: collision with root package name */
    public int f45809d1;

    /* JADX INFO: renamed from: e1, reason: collision with root package name */
    public int f45810e1;

    /* JADX INFO: renamed from: f1, reason: collision with root package name */
    public float f45811f1;

    /* JADX INFO: renamed from: g1, reason: collision with root package name */
    public float f45812g1;

    /* JADX INFO: renamed from: h1, reason: collision with root package name */
    public float f45813h1;

    /* JADX INFO: renamed from: i1, reason: collision with root package name */
    public float f45814i1;

    public class a implements View.OnLayoutChangeListener {
        public a() {
        }

        @Override // android.view.View.OnLayoutChangeListener
        public final void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
            int i18 = TooltipDrawable.f45804j1;
            TooltipDrawable tooltipDrawable = TooltipDrawable.this;
            tooltipDrawable.getClass();
            int[] iArr = new int[2];
            view.getLocationOnScreen(iArr);
            tooltipDrawable.f45810e1 = iArr[0];
            view.getWindowVisibleDisplayFrame(tooltipDrawable.X0);
        }
    }

    public TooltipDrawable(@NonNull Context context, AttributeSet attributeSet, @AttrRes int i10, @StyleRes int i11) {
        super(context, attributeSet, i10, i11);
        this.U0 = new Paint.FontMetrics();
        TextDrawableHelper textDrawableHelper = new TextDrawableHelper(this);
        this.V0 = textDrawableHelper;
        this.W0 = new a();
        this.X0 = new Rect();
        this.f45811f1 = 1.0f;
        this.f45812g1 = 1.0f;
        this.f45813h1 = 0.5f;
        this.f45814i1 = 1.0f;
        this.T0 = context;
        textDrawableHelper.getTextPaint().density = context.getResources().getDisplayMetrics().density;
        textDrawableHelper.getTextPaint().setTextAlign(Paint.Align.CENTER);
    }

    @NonNull
    public static TooltipDrawable create(@NonNull Context context) {
        return createFromAttributes(context, null, f45805k1, f45804j1);
    }

    @NonNull
    public static TooltipDrawable createFromAttributes(@NonNull Context context, @Nullable AttributeSet attributeSet, @AttrRes int i10, @StyleRes int i11) {
        TooltipDrawable tooltipDrawable = new TooltipDrawable(context, attributeSet, i10, i11);
        TypedArray typedArrayObtainStyledAttributes = ThemeEnforcement.obtainStyledAttributes(tooltipDrawable.T0, attributeSet, R.styleable.Tooltip, i10, i11, new int[0]);
        Context context2 = tooltipDrawable.T0;
        tooltipDrawable.f45809d1 = context2.getResources().getDimensionPixelSize(R.dimen.mtrl_tooltip_arrowSize);
        boolean z10 = typedArrayObtainStyledAttributes.getBoolean(R.styleable.Tooltip_showMarker, true);
        tooltipDrawable.f45808c1 = z10;
        if (z10) {
            tooltipDrawable.setShapeAppearanceModel(tooltipDrawable.getShapeAppearanceModel().toBuilder().setBottomEdge(tooltipDrawable.j()).build());
        } else {
            tooltipDrawable.f45809d1 = 0;
        }
        tooltipDrawable.setText(typedArrayObtainStyledAttributes.getText(R.styleable.Tooltip_android_text));
        TextAppearance textAppearance = MaterialResources.getTextAppearance(context2, typedArrayObtainStyledAttributes, R.styleable.Tooltip_android_textAppearance);
        if (textAppearance != null) {
            int i12 = R.styleable.Tooltip_android_textColor;
            if (typedArrayObtainStyledAttributes.hasValue(i12)) {
                textAppearance.setTextColor(MaterialResources.getColorStateList(context2, typedArrayObtainStyledAttributes, i12));
            }
        }
        tooltipDrawable.setTextAppearance(textAppearance);
        tooltipDrawable.setFillColor(ColorStateList.valueOf(typedArrayObtainStyledAttributes.getColor(R.styleable.Tooltip_backgroundTint, MaterialColors.layer(ColorUtils.setAlphaComponent(MaterialColors.getColor(context2, android.R.attr.colorBackground, TooltipDrawable.class.getCanonicalName()), 229), ColorUtils.setAlphaComponent(MaterialColors.getColor(context2, R.attr.colorOnBackground, TooltipDrawable.class.getCanonicalName()), 153)))));
        tooltipDrawable.setStrokeColor(ColorStateList.valueOf(MaterialColors.getColor(context2, R.attr.colorSurface, TooltipDrawable.class.getCanonicalName())));
        tooltipDrawable.Y0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(R.styleable.Tooltip_android_padding, 0);
        tooltipDrawable.Z0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(R.styleable.Tooltip_android_minWidth, 0);
        tooltipDrawable.f45806a1 = typedArrayObtainStyledAttributes.getDimensionPixelSize(R.styleable.Tooltip_android_minHeight, 0);
        tooltipDrawable.f45807b1 = typedArrayObtainStyledAttributes.getDimensionPixelSize(R.styleable.Tooltip_android_layout_margin, 0);
        typedArrayObtainStyledAttributes.recycle();
        return tooltipDrawable;
    }

    public void detachView(@Nullable View view) {
        if (view == null) {
            return;
        }
        view.removeOnLayoutChangeListener(this.W0);
    }

    @Override // com.google.android.material.shape.MaterialShapeDrawable, android.graphics.drawable.Drawable
    public void draw(@NonNull Canvas canvas) {
        canvas.save();
        float fI = i();
        float f6 = (float) (-((Math.sqrt(2.0d) * ((double) this.f45809d1)) - ((double) this.f45809d1)));
        canvas.scale(this.f45811f1, this.f45812g1, (getBounds().width() * 0.5f) + getBounds().left, (getBounds().height() * this.f45813h1) + getBounds().top);
        canvas.translate(fI, f6);
        super.draw(canvas);
        if (this.S0 != null) {
            Rect bounds = getBounds();
            float fCenterY = bounds.centerY();
            TextDrawableHelper textDrawableHelper = this.V0;
            TextPaint textPaint = textDrawableHelper.getTextPaint();
            Paint.FontMetrics fontMetrics = this.U0;
            textPaint.getFontMetrics(fontMetrics);
            int i10 = (int) (fCenterY - ((fontMetrics.descent + fontMetrics.ascent) / 2.0f));
            if (textDrawableHelper.getTextAppearance() != null) {
                textDrawableHelper.getTextPaint().drawableState = getState();
                textDrawableHelper.updateTextPaintDrawState(this.T0);
                textDrawableHelper.getTextPaint().setAlpha((int) (this.f45814i1 * 255.0f));
            }
            CharSequence charSequence = this.S0;
            canvas.drawText(charSequence, 0, charSequence.length(), bounds.centerX(), i10, textDrawableHelper.getTextPaint());
        }
        canvas.restore();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return (int) Math.max(this.V0.getTextPaint().getTextSize(), this.f45806a1);
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        float f6 = this.Y0 * 2;
        CharSequence charSequence = this.S0;
        return (int) Math.max(f6 + (charSequence == null ? 0.0f : this.V0.getTextWidth(charSequence.toString())), this.Z0);
    }

    public int getLayoutMargin() {
        return this.f45807b1;
    }

    public int getMinHeight() {
        return this.f45806a1;
    }

    public int getMinWidth() {
        return this.Z0;
    }

    @Nullable
    public CharSequence getText() {
        return this.S0;
    }

    @Nullable
    public TextAppearance getTextAppearance() {
        return this.V0.getTextAppearance();
    }

    public int getTextPadding() {
        return this.Y0;
    }

    public final float i() {
        int i10;
        Rect rect = this.X0;
        if (((rect.right - getBounds().right) - this.f45810e1) - this.f45807b1 < 0) {
            i10 = ((rect.right - getBounds().right) - this.f45810e1) - this.f45807b1;
        } else {
            if (((rect.left - getBounds().left) - this.f45810e1) + this.f45807b1 <= 0) {
                return 0.0f;
            }
            i10 = ((rect.left - getBounds().left) - this.f45810e1) + this.f45807b1;
        }
        return i10;
    }

    public final OffsetEdgeTreatment j() {
        float f6 = -i();
        float fWidth = ((float) (((double) getBounds().width()) - (Math.sqrt(2.0d) * ((double) this.f45809d1)))) / 2.0f;
        return new OffsetEdgeTreatment(new MarkerEdgeTreatment(this.f45809d1), Math.min(Math.max(f6, -fWidth), fWidth));
    }

    @Override // com.google.android.material.shape.MaterialShapeDrawable, android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        if (this.f45808c1) {
            setShapeAppearanceModel(getShapeAppearanceModel().toBuilder().setBottomEdge(j()).build());
        }
    }

    @Override // com.google.android.material.shape.MaterialShapeDrawable, android.graphics.drawable.Drawable, com.google.android.material.internal.TextDrawableHelper.TextDrawableDelegate
    public boolean onStateChange(int[] iArr) {
        return super.onStateChange(iArr);
    }

    @Override // com.google.android.material.internal.TextDrawableHelper.TextDrawableDelegate
    public void onTextSizeChange() {
        invalidateSelf();
    }

    public void setLayoutMargin(@Px int i10) {
        this.f45807b1 = i10;
        invalidateSelf();
    }

    public void setMinHeight(@Px int i10) {
        this.f45806a1 = i10;
        invalidateSelf();
    }

    public void setMinWidth(@Px int i10) {
        this.Z0 = i10;
        invalidateSelf();
    }

    public void setRelativeToView(@Nullable View view) {
        if (view == null) {
            return;
        }
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        this.f45810e1 = iArr[0];
        view.getWindowVisibleDisplayFrame(this.X0);
        view.addOnLayoutChangeListener(this.W0);
    }

    public void setRevealFraction(@FloatRange(from = 0.0d, to = 1.0d) float f6) {
        this.f45813h1 = 1.2f;
        this.f45811f1 = f6;
        this.f45812g1 = f6;
        this.f45814i1 = AnimationUtils.lerp(0.0f, 1.0f, 0.19f, 1.0f, f6);
        invalidateSelf();
    }

    public void setText(@Nullable CharSequence charSequence) {
        if (TextUtils.equals(this.S0, charSequence)) {
            return;
        }
        this.S0 = charSequence;
        this.V0.setTextWidthDirty(true);
        invalidateSelf();
    }

    public void setTextAppearance(@Nullable TextAppearance textAppearance) {
        this.V0.setTextAppearance(textAppearance, this.T0);
    }

    public void setTextAppearanceResource(@StyleRes int i10) {
        setTextAppearance(new TextAppearance(this.T0, i10));
    }

    public void setTextPadding(@Px int i10) {
        this.Y0 = i10;
        invalidateSelf();
    }

    public void setTextResource(@StringRes int i10) {
        setText(this.T0.getResources().getString(i10));
    }

    @NonNull
    public static TooltipDrawable createFromAttributes(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        return createFromAttributes(context, attributeSet, f45805k1, f45804j1);
    }
}

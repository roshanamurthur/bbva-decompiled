package com.google.android.material.chip;

import android.R;
import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import androidx.annotation.AnimatorRes;
import androidx.annotation.AttrRes;
import androidx.annotation.BoolRes;
import androidx.annotation.ColorInt;
import androidx.annotation.ColorRes;
import androidx.annotation.DimenRes;
import androidx.annotation.Dimension;
import androidx.annotation.DrawableRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.Px;
import androidx.annotation.StringRes;
import androidx.annotation.StyleRes;
import androidx.annotation.XmlRes;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.core.graphics.drawable.DrawableCompat;
import androidx.core.text.BidiFormatter;
import com.google.android.material.animation.MotionSpec;
import com.google.android.material.canvas.CanvasCompat;
import com.google.android.material.color.MaterialColors;
import com.google.android.material.drawable.DrawableUtils;
import com.google.android.material.internal.TextDrawableHelper;
import com.google.android.material.internal.ThemeEnforcement;
import com.google.android.material.internal.ViewUtils;
import com.google.android.material.resources.MaterialResources;
import com.google.android.material.resources.TextAppearance;
import com.google.android.material.ripple.RippleUtils;
import com.google.android.material.shape.MaterialShapeDrawable;
import java.lang.ref.WeakReference;
import java.util.Arrays;

/* JADX INFO: loaded from: classes10.dex */
public class ChipDrawable extends MaterialShapeDrawable implements Drawable.Callback, TextDrawableHelper.TextDrawableDelegate {

    /* JADX INFO: renamed from: b2, reason: collision with root package name */
    public static final int[] f44256b2 = {R.attr.state_enabled};

    /* JADX INFO: renamed from: c2, reason: collision with root package name */
    public static final ShapeDrawable f44257c2 = new ShapeDrawable(new OvalShape());
    public final Paint A1;
    public final Paint.FontMetrics B1;
    public final RectF C1;
    public final PointF D1;
    public final Path E1;

    @NonNull
    public final TextDrawableHelper F1;

    @ColorInt
    public int G1;

    @ColorInt
    public int H1;

    @ColorInt
    public int I1;

    @ColorInt
    public int J1;

    @ColorInt
    public int K1;

    @ColorInt
    public int L1;
    public boolean M1;

    @ColorInt
    public int N1;
    public int O1;

    @Nullable
    public ColorFilter P1;

    @Nullable
    public PorterDuffColorFilter Q1;

    @Nullable
    public ColorStateList R1;

    @Nullable
    public ColorStateList S0;

    @Nullable
    public PorterDuff.Mode S1;

    @Nullable
    public ColorStateList T0;
    public int[] T1;
    public float U0;
    public boolean U1;
    public float V0;

    @Nullable
    public ColorStateList V1;

    @Nullable
    public ColorStateList W0;

    @NonNull
    public WeakReference<Delegate> W1;
    public float X0;
    public TextUtils.TruncateAt X1;

    @Nullable
    public ColorStateList Y0;
    public boolean Y1;

    @Nullable
    public CharSequence Z0;
    public int Z1;

    /* JADX INFO: renamed from: a1, reason: collision with root package name */
    public boolean f44258a1;

    /* JADX INFO: renamed from: a2, reason: collision with root package name */
    public boolean f44259a2;

    /* JADX INFO: renamed from: b1, reason: collision with root package name */
    @Nullable
    public Drawable f44260b1;

    /* JADX INFO: renamed from: c1, reason: collision with root package name */
    @Nullable
    public ColorStateList f44261c1;

    /* JADX INFO: renamed from: d1, reason: collision with root package name */
    public float f44262d1;

    /* JADX INFO: renamed from: e1, reason: collision with root package name */
    public boolean f44263e1;

    /* JADX INFO: renamed from: f1, reason: collision with root package name */
    public boolean f44264f1;

    /* JADX INFO: renamed from: g1, reason: collision with root package name */
    @Nullable
    public Drawable f44265g1;

    /* JADX INFO: renamed from: h1, reason: collision with root package name */
    @Nullable
    public RippleDrawable f44266h1;

    /* JADX INFO: renamed from: i1, reason: collision with root package name */
    @Nullable
    public ColorStateList f44267i1;

    /* JADX INFO: renamed from: j1, reason: collision with root package name */
    public float f44268j1;

    /* JADX INFO: renamed from: k1, reason: collision with root package name */
    @Nullable
    public CharSequence f44269k1;

    /* JADX INFO: renamed from: l1, reason: collision with root package name */
    public boolean f44270l1;

    /* JADX INFO: renamed from: m1, reason: collision with root package name */
    public boolean f44271m1;

    /* JADX INFO: renamed from: n1, reason: collision with root package name */
    @Nullable
    public Drawable f44272n1;

    /* JADX INFO: renamed from: o1, reason: collision with root package name */
    @Nullable
    public ColorStateList f44273o1;

    /* JADX INFO: renamed from: p1, reason: collision with root package name */
    @Nullable
    public MotionSpec f44274p1;

    /* JADX INFO: renamed from: q1, reason: collision with root package name */
    @Nullable
    public MotionSpec f44275q1;
    public float r1;

    /* JADX INFO: renamed from: s1, reason: collision with root package name */
    public float f44276s1;

    /* JADX INFO: renamed from: t1, reason: collision with root package name */
    public float f44277t1;

    /* JADX INFO: renamed from: u1, reason: collision with root package name */
    public float f44278u1;

    /* JADX INFO: renamed from: v1, reason: collision with root package name */
    public float f44279v1;

    /* JADX INFO: renamed from: w1, reason: collision with root package name */
    public float f44280w1;

    /* JADX INFO: renamed from: x1, reason: collision with root package name */
    public float f44281x1;

    /* JADX INFO: renamed from: y1, reason: collision with root package name */
    public float f44282y1;

    /* JADX INFO: renamed from: z1, reason: collision with root package name */
    @NonNull
    public final Context f44283z1;

    public interface Delegate {
        void onChipDrawableSizeChange();
    }

    public ChipDrawable(@NonNull Context context, AttributeSet attributeSet, @AttrRes int i10, @StyleRes int i11) {
        super(context, attributeSet, i10, i11);
        this.V0 = -1.0f;
        this.A1 = new Paint(1);
        this.B1 = new Paint.FontMetrics();
        this.C1 = new RectF();
        this.D1 = new PointF();
        this.E1 = new Path();
        this.O1 = 255;
        this.S1 = PorterDuff.Mode.SRC_IN;
        this.W1 = new WeakReference<>(null);
        initializeElevationOverlay(context);
        this.f44283z1 = context;
        TextDrawableHelper textDrawableHelper = new TextDrawableHelper(this);
        this.F1 = textDrawableHelper;
        this.Z0 = "";
        textDrawableHelper.getTextPaint().density = context.getResources().getDisplayMetrics().density;
        int[] iArr = f44256b2;
        setState(iArr);
        setCloseIconState(iArr);
        this.Y1 = true;
        if (RippleUtils.USE_FRAMEWORK_RIPPLE) {
            f44257c2.setTint(-1);
        }
    }

    @NonNull
    public static ChipDrawable createFromAttributes(@NonNull Context context, @Nullable AttributeSet attributeSet, @AttrRes int i10, @StyleRes int i11) {
        ChipDrawable chipDrawable = new ChipDrawable(context, attributeSet, i10, i11);
        TypedArray typedArrayObtainStyledAttributes = ThemeEnforcement.obtainStyledAttributes(chipDrawable.f44283z1, attributeSet, com.google.android.material.R.styleable.Chip, i10, i11, new int[0]);
        chipDrawable.f44259a2 = typedArrayObtainStyledAttributes.hasValue(com.google.android.material.R.styleable.Chip_shapeAppearance);
        int i12 = com.google.android.material.R.styleable.Chip_chipSurfaceColor;
        Context context2 = chipDrawable.f44283z1;
        ColorStateList colorStateList = MaterialResources.getColorStateList(context2, typedArrayObtainStyledAttributes, i12);
        if (chipDrawable.S0 != colorStateList) {
            chipDrawable.S0 = colorStateList;
            chipDrawable.onStateChange(chipDrawable.getState());
        }
        chipDrawable.setChipBackgroundColor(MaterialResources.getColorStateList(context2, typedArrayObtainStyledAttributes, com.google.android.material.R.styleable.Chip_chipBackgroundColor));
        chipDrawable.setChipMinHeight(typedArrayObtainStyledAttributes.getDimension(com.google.android.material.R.styleable.Chip_chipMinHeight, 0.0f));
        int i13 = com.google.android.material.R.styleable.Chip_chipCornerRadius;
        if (typedArrayObtainStyledAttributes.hasValue(i13)) {
            chipDrawable.setChipCornerRadius(typedArrayObtainStyledAttributes.getDimension(i13, 0.0f));
        }
        chipDrawable.setChipStrokeColor(MaterialResources.getColorStateList(context2, typedArrayObtainStyledAttributes, com.google.android.material.R.styleable.Chip_chipStrokeColor));
        chipDrawable.setChipStrokeWidth(typedArrayObtainStyledAttributes.getDimension(com.google.android.material.R.styleable.Chip_chipStrokeWidth, 0.0f));
        chipDrawable.setRippleColor(MaterialResources.getColorStateList(context2, typedArrayObtainStyledAttributes, com.google.android.material.R.styleable.Chip_rippleColor));
        chipDrawable.setText(typedArrayObtainStyledAttributes.getText(com.google.android.material.R.styleable.Chip_android_text));
        TextAppearance textAppearance = MaterialResources.getTextAppearance(context2, typedArrayObtainStyledAttributes, com.google.android.material.R.styleable.Chip_android_textAppearance);
        textAppearance.setTextSize(typedArrayObtainStyledAttributes.getDimension(com.google.android.material.R.styleable.Chip_android_textSize, textAppearance.getTextSize()));
        chipDrawable.setTextAppearance(textAppearance);
        int i14 = typedArrayObtainStyledAttributes.getInt(com.google.android.material.R.styleable.Chip_android_ellipsize, 0);
        if (i14 == 1) {
            chipDrawable.setEllipsize(TextUtils.TruncateAt.START);
        } else if (i14 == 2) {
            chipDrawable.setEllipsize(TextUtils.TruncateAt.MIDDLE);
        } else if (i14 == 3) {
            chipDrawable.setEllipsize(TextUtils.TruncateAt.END);
        }
        chipDrawable.setChipIconVisible(typedArrayObtainStyledAttributes.getBoolean(com.google.android.material.R.styleable.Chip_chipIconVisible, false));
        if (attributeSet != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "chipIconEnabled") != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "chipIconVisible") == null) {
            chipDrawable.setChipIconVisible(typedArrayObtainStyledAttributes.getBoolean(com.google.android.material.R.styleable.Chip_chipIconEnabled, false));
        }
        chipDrawable.setChipIcon(MaterialResources.getDrawable(context2, typedArrayObtainStyledAttributes, com.google.android.material.R.styleable.Chip_chipIcon));
        int i15 = com.google.android.material.R.styleable.Chip_chipIconTint;
        if (typedArrayObtainStyledAttributes.hasValue(i15)) {
            chipDrawable.setChipIconTint(MaterialResources.getColorStateList(context2, typedArrayObtainStyledAttributes, i15));
        }
        chipDrawable.setChipIconSize(typedArrayObtainStyledAttributes.getDimension(com.google.android.material.R.styleable.Chip_chipIconSize, -1.0f));
        chipDrawable.setCloseIconVisible(typedArrayObtainStyledAttributes.getBoolean(com.google.android.material.R.styleable.Chip_closeIconVisible, false));
        if (attributeSet != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "closeIconEnabled") != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "closeIconVisible") == null) {
            chipDrawable.setCloseIconVisible(typedArrayObtainStyledAttributes.getBoolean(com.google.android.material.R.styleable.Chip_closeIconEnabled, false));
        }
        chipDrawable.setCloseIcon(MaterialResources.getDrawable(context2, typedArrayObtainStyledAttributes, com.google.android.material.R.styleable.Chip_closeIcon));
        chipDrawable.setCloseIconTint(MaterialResources.getColorStateList(context2, typedArrayObtainStyledAttributes, com.google.android.material.R.styleable.Chip_closeIconTint));
        chipDrawable.setCloseIconSize(typedArrayObtainStyledAttributes.getDimension(com.google.android.material.R.styleable.Chip_closeIconSize, 0.0f));
        chipDrawable.setCheckable(typedArrayObtainStyledAttributes.getBoolean(com.google.android.material.R.styleable.Chip_android_checkable, false));
        chipDrawable.setCheckedIconVisible(typedArrayObtainStyledAttributes.getBoolean(com.google.android.material.R.styleable.Chip_checkedIconVisible, false));
        if (attributeSet != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "checkedIconEnabled") != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "checkedIconVisible") == null) {
            chipDrawable.setCheckedIconVisible(typedArrayObtainStyledAttributes.getBoolean(com.google.android.material.R.styleable.Chip_checkedIconEnabled, false));
        }
        chipDrawable.setCheckedIcon(MaterialResources.getDrawable(context2, typedArrayObtainStyledAttributes, com.google.android.material.R.styleable.Chip_checkedIcon));
        int i16 = com.google.android.material.R.styleable.Chip_checkedIconTint;
        if (typedArrayObtainStyledAttributes.hasValue(i16)) {
            chipDrawable.setCheckedIconTint(MaterialResources.getColorStateList(context2, typedArrayObtainStyledAttributes, i16));
        }
        chipDrawable.setShowMotionSpec(MotionSpec.createFromAttribute(context2, typedArrayObtainStyledAttributes, com.google.android.material.R.styleable.Chip_showMotionSpec));
        chipDrawable.setHideMotionSpec(MotionSpec.createFromAttribute(context2, typedArrayObtainStyledAttributes, com.google.android.material.R.styleable.Chip_hideMotionSpec));
        chipDrawable.setChipStartPadding(typedArrayObtainStyledAttributes.getDimension(com.google.android.material.R.styleable.Chip_chipStartPadding, 0.0f));
        chipDrawable.setIconStartPadding(typedArrayObtainStyledAttributes.getDimension(com.google.android.material.R.styleable.Chip_iconStartPadding, 0.0f));
        chipDrawable.setIconEndPadding(typedArrayObtainStyledAttributes.getDimension(com.google.android.material.R.styleable.Chip_iconEndPadding, 0.0f));
        chipDrawable.setTextStartPadding(typedArrayObtainStyledAttributes.getDimension(com.google.android.material.R.styleable.Chip_textStartPadding, 0.0f));
        chipDrawable.setTextEndPadding(typedArrayObtainStyledAttributes.getDimension(com.google.android.material.R.styleable.Chip_textEndPadding, 0.0f));
        chipDrawable.setCloseIconStartPadding(typedArrayObtainStyledAttributes.getDimension(com.google.android.material.R.styleable.Chip_closeIconStartPadding, 0.0f));
        chipDrawable.setCloseIconEndPadding(typedArrayObtainStyledAttributes.getDimension(com.google.android.material.R.styleable.Chip_closeIconEndPadding, 0.0f));
        chipDrawable.setChipEndPadding(typedArrayObtainStyledAttributes.getDimension(com.google.android.material.R.styleable.Chip_chipEndPadding, 0.0f));
        chipDrawable.setMaxWidth(typedArrayObtainStyledAttributes.getDimensionPixelSize(com.google.android.material.R.styleable.Chip_android_maxWidth, Integer.MAX_VALUE));
        typedArrayObtainStyledAttributes.recycle();
        return chipDrawable;
    }

    @NonNull
    public static ChipDrawable createFromResource(@NonNull Context context, @XmlRes int i10) {
        AttributeSet drawableXml = DrawableUtils.parseDrawableXml(context, i10, "chip");
        int styleAttribute = drawableXml.getStyleAttribute();
        if (styleAttribute == 0) {
            styleAttribute = com.google.android.material.R.style.Widget_MaterialComponents_Chip_Entry;
        }
        return createFromAttributes(context, drawableXml, com.google.android.material.R.attr.chipStandaloneStyle, styleAttribute);
    }

    public static boolean m(@Nullable ColorStateList colorStateList) {
        return colorStateList != null && colorStateList.isStateful();
    }

    public static boolean n(@Nullable Drawable drawable) {
        return drawable != null && drawable.isStateful();
    }

    public static void s(@Nullable Drawable drawable) {
        if (drawable != null) {
            drawable.setCallback(null);
        }
    }

    @Override // com.google.android.material.shape.MaterialShapeDrawable, android.graphics.drawable.Drawable
    public void draw(@NonNull Canvas canvas) {
        int i10;
        Rect bounds = getBounds();
        if (bounds.isEmpty() || getAlpha() == 0) {
            return;
        }
        int i11 = this.O1;
        int iSaveLayerAlpha = i11 < 255 ? CanvasCompat.saveLayerAlpha(canvas, bounds.left, bounds.top, bounds.right, bounds.bottom, i11) : 0;
        boolean z10 = this.f44259a2;
        Paint paint = this.A1;
        RectF rectF = this.C1;
        if (!z10) {
            paint.setColor(this.G1);
            paint.setStyle(Paint.Style.FILL);
            rectF.set(bounds);
            canvas.drawRoundRect(rectF, getChipCornerRadius(), getChipCornerRadius(), paint);
        }
        if (!this.f44259a2) {
            paint.setColor(this.H1);
            paint.setStyle(Paint.Style.FILL);
            ColorFilter colorFilter = this.P1;
            if (colorFilter == null) {
                colorFilter = this.Q1;
            }
            paint.setColorFilter(colorFilter);
            rectF.set(bounds);
            canvas.drawRoundRect(rectF, getChipCornerRadius(), getChipCornerRadius(), paint);
        }
        if (this.f44259a2) {
            super.draw(canvas);
        }
        if (this.X0 > 0.0f && !this.f44259a2) {
            paint.setColor(this.J1);
            paint.setStyle(Paint.Style.STROKE);
            if (!this.f44259a2) {
                ColorFilter colorFilter2 = this.P1;
                if (colorFilter2 == null) {
                    colorFilter2 = this.Q1;
                }
                paint.setColorFilter(colorFilter2);
            }
            float f6 = bounds.left;
            float f10 = this.X0 / 2.0f;
            rectF.set(f6 + f10, bounds.top + f10, bounds.right - f10, bounds.bottom - f10);
            float f11 = this.V0 - (this.X0 / 2.0f);
            canvas.drawRoundRect(rectF, f11, f11, paint);
        }
        paint.setColor(this.K1);
        paint.setStyle(Paint.Style.FILL);
        rectF.set(bounds);
        if (this.f44259a2) {
            RectF rectF2 = new RectF(bounds);
            Path path = this.E1;
            calculatePathForSize(rectF2, path);
            super.drawShape(canvas, paint, path, getBoundsAsRectF());
        } else {
            canvas.drawRoundRect(rectF, getChipCornerRadius(), getChipCornerRadius(), paint);
        }
        if (q()) {
            j(bounds, rectF);
            float f12 = rectF.left;
            float f13 = rectF.top;
            canvas.translate(f12, f13);
            this.f44260b1.setBounds(0, 0, (int) rectF.width(), (int) rectF.height());
            this.f44260b1.draw(canvas);
            canvas.translate(-f12, -f13);
        }
        if (p()) {
            j(bounds, rectF);
            float f14 = rectF.left;
            float f15 = rectF.top;
            canvas.translate(f14, f15);
            this.f44272n1.setBounds(0, 0, (int) rectF.width(), (int) rectF.height());
            this.f44272n1.draw(canvas);
            canvas.translate(-f14, -f15);
        }
        if (this.Y1 && this.Z0 != null) {
            PointF pointF = this.D1;
            pointF.set(0.0f, 0.0f);
            Paint.Align align = Paint.Align.LEFT;
            CharSequence charSequence = this.Z0;
            TextDrawableHelper textDrawableHelper = this.F1;
            if (charSequence != null) {
                float fK = k() + this.r1 + this.f44278u1;
                if (DrawableCompat.getLayoutDirection(this) == 0) {
                    pointF.x = bounds.left + fK;
                } else {
                    pointF.x = bounds.right - fK;
                    align = Paint.Align.RIGHT;
                }
                float fCenterY = bounds.centerY();
                TextPaint textPaint = textDrawableHelper.getTextPaint();
                Paint.FontMetrics fontMetrics = this.B1;
                textPaint.getFontMetrics(fontMetrics);
                pointF.y = fCenterY - ((fontMetrics.descent + fontMetrics.ascent) / 2.0f);
            }
            rectF.setEmpty();
            if (this.Z0 != null) {
                float fK2 = k() + this.r1 + this.f44278u1;
                float fL = l() + this.f44282y1 + this.f44279v1;
                if (DrawableCompat.getLayoutDirection(this) == 0) {
                    rectF.left = bounds.left + fK2;
                    rectF.right = bounds.right - fL;
                } else {
                    rectF.left = bounds.left + fL;
                    rectF.right = bounds.right - fK2;
                }
                rectF.top = bounds.top;
                rectF.bottom = bounds.bottom;
            }
            if (textDrawableHelper.getTextAppearance() != null) {
                textDrawableHelper.getTextPaint().drawableState = getState();
                textDrawableHelper.updateTextPaintDrawState(this.f44283z1);
            }
            textDrawableHelper.getTextPaint().setTextAlign(align);
            boolean z11 = Math.round(textDrawableHelper.getTextWidth(getText().toString())) > Math.round(rectF.width());
            if (z11) {
                int iSave = canvas.save();
                canvas.clipRect(rectF);
                i10 = iSave;
            } else {
                i10 = 0;
            }
            CharSequence charSequenceEllipsize = this.Z0;
            if (z11 && this.X1 != null) {
                charSequenceEllipsize = TextUtils.ellipsize(charSequenceEllipsize, textDrawableHelper.getTextPaint(), rectF.width(), this.X1);
            }
            int i12 = i10;
            canvas.drawText(charSequenceEllipsize, 0, charSequenceEllipsize.length(), pointF.x, pointF.y, textDrawableHelper.getTextPaint());
            if (z11) {
                canvas.restoreToCount(i12);
            }
        }
        if (r()) {
            rectF.setEmpty();
            if (r()) {
                float f16 = this.f44282y1 + this.f44281x1;
                if (DrawableCompat.getLayoutDirection(this) == 0) {
                    float f17 = bounds.right - f16;
                    rectF.right = f17;
                    rectF.left = f17 - this.f44268j1;
                } else {
                    float f18 = bounds.left + f16;
                    rectF.left = f18;
                    rectF.right = f18 + this.f44268j1;
                }
                float fExactCenterY = bounds.exactCenterY();
                float f19 = this.f44268j1;
                float f20 = fExactCenterY - (f19 / 2.0f);
                rectF.top = f20;
                rectF.bottom = f20 + f19;
            }
            float f21 = rectF.left;
            float f22 = rectF.top;
            canvas.translate(f21, f22);
            this.f44265g1.setBounds(0, 0, (int) rectF.width(), (int) rectF.height());
            if (RippleUtils.USE_FRAMEWORK_RIPPLE) {
                this.f44266h1.setBounds(this.f44265g1.getBounds());
                this.f44266h1.jumpToCurrentState();
                this.f44266h1.draw(canvas);
            } else {
                this.f44265g1.draw(canvas);
            }
            canvas.translate(-f21, -f22);
        }
        if (this.O1 < 255) {
            canvas.restoreToCount(iSaveLayerAlpha);
        }
    }

    @Override // com.google.android.material.shape.MaterialShapeDrawable, android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.O1;
    }

    @Nullable
    public Drawable getCheckedIcon() {
        return this.f44272n1;
    }

    @Nullable
    public ColorStateList getCheckedIconTint() {
        return this.f44273o1;
    }

    @Nullable
    public ColorStateList getChipBackgroundColor() {
        return this.T0;
    }

    public float getChipCornerRadius() {
        return this.f44259a2 ? getTopLeftCornerResolvedSize() : this.V0;
    }

    public float getChipEndPadding() {
        return this.f44282y1;
    }

    @Nullable
    public Drawable getChipIcon() {
        Drawable drawable = this.f44260b1;
        if (drawable != null) {
            return DrawableCompat.unwrap(drawable);
        }
        return null;
    }

    public float getChipIconSize() {
        return this.f44262d1;
    }

    @Nullable
    public ColorStateList getChipIconTint() {
        return this.f44261c1;
    }

    public float getChipMinHeight() {
        return this.U0;
    }

    public float getChipStartPadding() {
        return this.r1;
    }

    @Nullable
    public ColorStateList getChipStrokeColor() {
        return this.W0;
    }

    public float getChipStrokeWidth() {
        return this.X0;
    }

    public void getChipTouchBounds(@NonNull RectF rectF) {
        Rect bounds = getBounds();
        rectF.set(bounds);
        if (r()) {
            float f6 = this.f44282y1 + this.f44281x1 + this.f44268j1 + this.f44280w1 + this.f44279v1;
            if (DrawableCompat.getLayoutDirection(this) == 0) {
                rectF.right = bounds.right - f6;
            } else {
                rectF.left = bounds.left + f6;
            }
        }
    }

    @Nullable
    public Drawable getCloseIcon() {
        Drawable drawable = this.f44265g1;
        if (drawable != null) {
            return DrawableCompat.unwrap(drawable);
        }
        return null;
    }

    @Nullable
    public CharSequence getCloseIconContentDescription() {
        return this.f44269k1;
    }

    public float getCloseIconEndPadding() {
        return this.f44281x1;
    }

    public float getCloseIconSize() {
        return this.f44268j1;
    }

    public float getCloseIconStartPadding() {
        return this.f44280w1;
    }

    @NonNull
    public int[] getCloseIconState() {
        return this.T1;
    }

    @Nullable
    public ColorStateList getCloseIconTint() {
        return this.f44267i1;
    }

    public void getCloseIconTouchBounds(@NonNull RectF rectF) {
        Rect bounds = getBounds();
        rectF.setEmpty();
        if (r()) {
            float f6 = this.f44282y1 + this.f44281x1 + this.f44268j1 + this.f44280w1 + this.f44279v1;
            if (DrawableCompat.getLayoutDirection(this) == 0) {
                float f10 = bounds.right;
                rectF.right = f10;
                rectF.left = f10 - f6;
            } else {
                float f11 = bounds.left;
                rectF.left = f11;
                rectF.right = f11 + f6;
            }
            rectF.top = bounds.top;
            rectF.bottom = bounds.bottom;
        }
    }

    @Override // android.graphics.drawable.Drawable
    @Nullable
    public ColorFilter getColorFilter() {
        return this.P1;
    }

    public TextUtils.TruncateAt getEllipsize() {
        return this.X1;
    }

    @Nullable
    public MotionSpec getHideMotionSpec() {
        return this.f44275q1;
    }

    public float getIconEndPadding() {
        return this.f44277t1;
    }

    public float getIconStartPadding() {
        return this.f44276s1;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return (int) this.U0;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return Math.min(Math.round(l() + this.F1.getTextWidth(getText().toString()) + k() + this.r1 + this.f44278u1 + this.f44279v1 + this.f44282y1), this.Z1);
    }

    @Px
    public int getMaxWidth() {
        return this.Z1;
    }

    @Override // com.google.android.material.shape.MaterialShapeDrawable, android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // com.google.android.material.shape.MaterialShapeDrawable, android.graphics.drawable.Drawable
    @TargetApi(21)
    public void getOutline(@NonNull Outline outline) {
        if (this.f44259a2) {
            super.getOutline(outline);
            return;
        }
        Rect bounds = getBounds();
        if (bounds.isEmpty()) {
            outline.setRoundRect(0, 0, getIntrinsicWidth(), getIntrinsicHeight(), this.V0);
        } else {
            outline.setRoundRect(bounds, this.V0);
        }
        outline.setAlpha(getAlpha() / 255.0f);
    }

    @Nullable
    public ColorStateList getRippleColor() {
        return this.Y0;
    }

    @Nullable
    public MotionSpec getShowMotionSpec() {
        return this.f44274p1;
    }

    @Nullable
    public CharSequence getText() {
        return this.Z0;
    }

    @Nullable
    public TextAppearance getTextAppearance() {
        return this.F1.getTextAppearance();
    }

    public float getTextEndPadding() {
        return this.f44279v1;
    }

    public float getTextStartPadding() {
        return this.f44278u1;
    }

    public boolean getUseCompatRipple() {
        return this.U1;
    }

    public final void i(@Nullable Drawable drawable) {
        if (drawable == null) {
            return;
        }
        drawable.setCallback(this);
        DrawableCompat.setLayoutDirection(drawable, DrawableCompat.getLayoutDirection(this));
        drawable.setLevel(getLevel());
        drawable.setVisible(isVisible(), false);
        if (drawable == this.f44265g1) {
            if (drawable.isStateful()) {
                drawable.setState(getCloseIconState());
            }
            DrawableCompat.setTintList(drawable, this.f44267i1);
            return;
        }
        Drawable drawable2 = this.f44260b1;
        if (drawable == drawable2 && this.f44263e1) {
            DrawableCompat.setTintList(drawable2, this.f44261c1);
        }
        if (drawable.isStateful()) {
            drawable.setState(getState());
        }
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void invalidateDrawable(@NonNull Drawable drawable) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.invalidateDrawable(this);
        }
    }

    public boolean isCheckable() {
        return this.f44270l1;
    }

    @Deprecated
    public boolean isCheckedIconEnabled() {
        return isCheckedIconVisible();
    }

    public boolean isCheckedIconVisible() {
        return this.f44271m1;
    }

    @Deprecated
    public boolean isChipIconEnabled() {
        return isChipIconVisible();
    }

    public boolean isChipIconVisible() {
        return this.f44258a1;
    }

    @Deprecated
    public boolean isCloseIconEnabled() {
        return isCloseIconVisible();
    }

    public boolean isCloseIconStateful() {
        return n(this.f44265g1);
    }

    public boolean isCloseIconVisible() {
        return this.f44264f1;
    }

    @Override // com.google.android.material.shape.MaterialShapeDrawable, android.graphics.drawable.Drawable
    public boolean isStateful() {
        TextAppearance textAppearance;
        return m(this.S0) || m(this.T0) || m(this.W0) || (this.U1 && m(this.V1)) || (!((textAppearance = this.F1.getTextAppearance()) == null || textAppearance.getTextColor() == null || !textAppearance.getTextColor().isStateful()) || ((this.f44271m1 && this.f44272n1 != null && this.f44270l1) || n(this.f44260b1) || n(this.f44272n1) || m(this.R1)));
    }

    public final void j(@NonNull Rect rect, @NonNull RectF rectF) {
        rectF.setEmpty();
        if (q() || p()) {
            float f6 = this.r1 + this.f44276s1;
            Drawable drawable = this.M1 ? this.f44272n1 : this.f44260b1;
            float intrinsicWidth = this.f44262d1;
            if (intrinsicWidth <= 0.0f && drawable != null) {
                intrinsicWidth = drawable.getIntrinsicWidth();
            }
            if (DrawableCompat.getLayoutDirection(this) == 0) {
                float f10 = rect.left + f6;
                rectF.left = f10;
                rectF.right = f10 + intrinsicWidth;
            } else {
                float f11 = rect.right - f6;
                rectF.right = f11;
                rectF.left = f11 - intrinsicWidth;
            }
            Drawable drawable2 = this.M1 ? this.f44272n1 : this.f44260b1;
            float fCeil = this.f44262d1;
            if (fCeil <= 0.0f && drawable2 != null) {
                fCeil = (float) Math.ceil(ViewUtils.dpToPx(this.f44283z1, 24));
                if (drawable2.getIntrinsicHeight() <= fCeil) {
                    fCeil = drawable2.getIntrinsicHeight();
                }
            }
            float fExactCenterY = rect.exactCenterY() - (fCeil / 2.0f);
            rectF.top = fExactCenterY;
            rectF.bottom = fExactCenterY + fCeil;
        }
    }

    public final float k() {
        if (!q() && !p()) {
            return 0.0f;
        }
        float f6 = this.f44276s1;
        Drawable drawable = this.M1 ? this.f44272n1 : this.f44260b1;
        float intrinsicWidth = this.f44262d1;
        if (intrinsicWidth <= 0.0f && drawable != null) {
            intrinsicWidth = drawable.getIntrinsicWidth();
        }
        return intrinsicWidth + f6 + this.f44277t1;
    }

    public final float l() {
        if (r()) {
            return this.f44280w1 + this.f44268j1 + this.f44281x1;
        }
        return 0.0f;
    }

    public final boolean o(@NonNull int[] iArr, @NonNull int[] iArr2) {
        boolean z10;
        boolean z11;
        boolean zOnStateChange = super.onStateChange(iArr);
        ColorStateList colorStateList = this.S0;
        int iCompositeElevationOverlayIfNeeded = compositeElevationOverlayIfNeeded(colorStateList != null ? colorStateList.getColorForState(iArr, this.G1) : 0);
        boolean state = true;
        if (this.G1 != iCompositeElevationOverlayIfNeeded) {
            this.G1 = iCompositeElevationOverlayIfNeeded;
            zOnStateChange = true;
        }
        ColorStateList colorStateList2 = this.T0;
        int iCompositeElevationOverlayIfNeeded2 = compositeElevationOverlayIfNeeded(colorStateList2 != null ? colorStateList2.getColorForState(iArr, this.H1) : 0);
        if (this.H1 != iCompositeElevationOverlayIfNeeded2) {
            this.H1 = iCompositeElevationOverlayIfNeeded2;
            zOnStateChange = true;
        }
        int iLayer = MaterialColors.layer(iCompositeElevationOverlayIfNeeded, iCompositeElevationOverlayIfNeeded2);
        if ((this.I1 != iLayer) | (getFillColor() == null)) {
            this.I1 = iLayer;
            setFillColor(ColorStateList.valueOf(iLayer));
            zOnStateChange = true;
        }
        ColorStateList colorStateList3 = this.W0;
        int colorForState = colorStateList3 != null ? colorStateList3.getColorForState(iArr, this.J1) : 0;
        if (this.J1 != colorForState) {
            this.J1 = colorForState;
            zOnStateChange = true;
        }
        int colorForState2 = (this.V1 == null || !RippleUtils.shouldDrawRippleCompat(iArr)) ? 0 : this.V1.getColorForState(iArr, this.K1);
        if (this.K1 != colorForState2) {
            this.K1 = colorForState2;
            if (this.U1) {
                zOnStateChange = true;
            }
        }
        TextDrawableHelper textDrawableHelper = this.F1;
        int colorForState3 = (textDrawableHelper.getTextAppearance() == null || textDrawableHelper.getTextAppearance().getTextColor() == null) ? 0 : textDrawableHelper.getTextAppearance().getTextColor().getColorForState(iArr, this.L1);
        if (this.L1 != colorForState3) {
            this.L1 = colorForState3;
            zOnStateChange = true;
        }
        int[] state2 = getState();
        if (state2 != null) {
            int length = state2.length;
            int i10 = 0;
            while (true) {
                if (i10 < length) {
                    if (state2[i10] != 16842912) {
                        i10++;
                    } else if (this.f44270l1) {
                        z10 = true;
                        break;
                    }
                }
                z10 = false;
                break;
            }
        } else {
            z10 = false;
            break;
        }
        if (this.M1 == z10 || this.f44272n1 == null) {
            z11 = false;
        } else {
            float fK = k();
            this.M1 = z10;
            if (fK != k()) {
                zOnStateChange = true;
                z11 = true;
            } else {
                z11 = false;
                zOnStateChange = true;
            }
        }
        ColorStateList colorStateList4 = this.R1;
        int colorForState4 = colorStateList4 != null ? colorStateList4.getColorForState(iArr, this.N1) : 0;
        if (this.N1 != colorForState4) {
            this.N1 = colorForState4;
            this.Q1 = DrawableUtils.updateTintFilter(this, this.R1, this.S1);
        } else {
            state = zOnStateChange;
        }
        if (n(this.f44260b1)) {
            state |= this.f44260b1.setState(iArr);
        }
        if (n(this.f44272n1)) {
            state |= this.f44272n1.setState(iArr);
        }
        if (n(this.f44265g1)) {
            int[] iArr3 = new int[iArr.length + iArr2.length];
            System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
            System.arraycopy(iArr2, 0, iArr3, iArr.length, iArr2.length);
            state |= this.f44265g1.setState(iArr3);
        }
        if (RippleUtils.USE_FRAMEWORK_RIPPLE && n(this.f44266h1)) {
            state |= this.f44266h1.setState(iArr2);
        }
        if (state) {
            invalidateSelf();
        }
        if (z11) {
            onSizeChange();
        }
        return state;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onLayoutDirectionChanged(int i10) {
        boolean zOnLayoutDirectionChanged = super.onLayoutDirectionChanged(i10);
        if (q()) {
            zOnLayoutDirectionChanged |= DrawableCompat.setLayoutDirection(this.f44260b1, i10);
        }
        if (p()) {
            zOnLayoutDirectionChanged |= DrawableCompat.setLayoutDirection(this.f44272n1, i10);
        }
        if (r()) {
            zOnLayoutDirectionChanged |= DrawableCompat.setLayoutDirection(this.f44265g1, i10);
        }
        if (!zOnLayoutDirectionChanged) {
            return true;
        }
        invalidateSelf();
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onLevelChange(int i10) {
        boolean zOnLevelChange = super.onLevelChange(i10);
        if (q()) {
            zOnLevelChange |= this.f44260b1.setLevel(i10);
        }
        if (p()) {
            zOnLevelChange |= this.f44272n1.setLevel(i10);
        }
        if (r()) {
            zOnLevelChange |= this.f44265g1.setLevel(i10);
        }
        if (zOnLevelChange) {
            invalidateSelf();
        }
        return zOnLevelChange;
    }

    public void onSizeChange() {
        Delegate delegate = this.W1.get();
        if (delegate != null) {
            delegate.onChipDrawableSizeChange();
        }
    }

    @Override // com.google.android.material.shape.MaterialShapeDrawable, android.graphics.drawable.Drawable, com.google.android.material.internal.TextDrawableHelper.TextDrawableDelegate
    public boolean onStateChange(@NonNull int[] iArr) {
        if (this.f44259a2) {
            super.onStateChange(iArr);
        }
        return o(iArr, getCloseIconState());
    }

    @Override // com.google.android.material.internal.TextDrawableHelper.TextDrawableDelegate
    public void onTextSizeChange() {
        onSizeChange();
        invalidateSelf();
    }

    public final boolean p() {
        return this.f44271m1 && this.f44272n1 != null && this.M1;
    }

    public final boolean q() {
        return this.f44258a1 && this.f44260b1 != null;
    }

    public final boolean r() {
        return this.f44264f1 && this.f44265g1 != null;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void scheduleDrawable(@NonNull Drawable drawable, @NonNull Runnable runnable, long j10) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.scheduleDrawable(this, runnable, j10);
        }
    }

    @Override // com.google.android.material.shape.MaterialShapeDrawable, android.graphics.drawable.Drawable
    public void setAlpha(int i10) {
        if (this.O1 != i10) {
            this.O1 = i10;
            invalidateSelf();
        }
    }

    public void setCheckable(boolean z10) {
        if (this.f44270l1 != z10) {
            this.f44270l1 = z10;
            float fK = k();
            if (!z10 && this.M1) {
                this.M1 = false;
            }
            float fK2 = k();
            invalidateSelf();
            if (fK != fK2) {
                onSizeChange();
            }
        }
    }

    public void setCheckableResource(@BoolRes int i10) {
        setCheckable(this.f44283z1.getResources().getBoolean(i10));
    }

    public void setCheckedIcon(@Nullable Drawable drawable) {
        if (this.f44272n1 != drawable) {
            float fK = k();
            this.f44272n1 = drawable;
            float fK2 = k();
            s(this.f44272n1);
            i(this.f44272n1);
            invalidateSelf();
            if (fK != fK2) {
                onSizeChange();
            }
        }
    }

    @Deprecated
    public void setCheckedIconEnabled(boolean z10) {
        setCheckedIconVisible(z10);
    }

    @Deprecated
    public void setCheckedIconEnabledResource(@BoolRes int i10) {
        setCheckedIconVisible(this.f44283z1.getResources().getBoolean(i10));
    }

    public void setCheckedIconResource(@DrawableRes int i10) {
        setCheckedIcon(AppCompatResources.getDrawable(this.f44283z1, i10));
    }

    public void setCheckedIconTint(@Nullable ColorStateList colorStateList) {
        Drawable drawable;
        if (this.f44273o1 != colorStateList) {
            this.f44273o1 = colorStateList;
            if (this.f44271m1 && (drawable = this.f44272n1) != null && this.f44270l1) {
                DrawableCompat.setTintList(drawable, colorStateList);
            }
            onStateChange(getState());
        }
    }

    public void setCheckedIconTintResource(@ColorRes int i10) {
        setCheckedIconTint(AppCompatResources.getColorStateList(this.f44283z1, i10));
    }

    public void setCheckedIconVisible(@BoolRes int i10) {
        setCheckedIconVisible(this.f44283z1.getResources().getBoolean(i10));
    }

    public void setChipBackgroundColor(@Nullable ColorStateList colorStateList) {
        if (this.T0 != colorStateList) {
            this.T0 = colorStateList;
            onStateChange(getState());
        }
    }

    public void setChipBackgroundColorResource(@ColorRes int i10) {
        setChipBackgroundColor(AppCompatResources.getColorStateList(this.f44283z1, i10));
    }

    @Deprecated
    public void setChipCornerRadius(float f6) {
        if (this.V0 != f6) {
            this.V0 = f6;
            setShapeAppearanceModel(getShapeAppearanceModel().withCornerSize(f6));
        }
    }

    @Deprecated
    public void setChipCornerRadiusResource(@DimenRes int i10) {
        setChipCornerRadius(this.f44283z1.getResources().getDimension(i10));
    }

    public void setChipEndPadding(float f6) {
        if (this.f44282y1 != f6) {
            this.f44282y1 = f6;
            invalidateSelf();
            onSizeChange();
        }
    }

    public void setChipEndPaddingResource(@DimenRes int i10) {
        setChipEndPadding(this.f44283z1.getResources().getDimension(i10));
    }

    public void setChipIcon(@Nullable Drawable drawable) {
        Drawable chipIcon = getChipIcon();
        if (chipIcon != drawable) {
            float fK = k();
            this.f44260b1 = drawable != null ? DrawableCompat.wrap(drawable).mutate() : null;
            float fK2 = k();
            s(chipIcon);
            if (q()) {
                i(this.f44260b1);
            }
            invalidateSelf();
            if (fK != fK2) {
                onSizeChange();
            }
        }
    }

    @Deprecated
    public void setChipIconEnabled(boolean z10) {
        setChipIconVisible(z10);
    }

    @Deprecated
    public void setChipIconEnabledResource(@BoolRes int i10) {
        setChipIconVisible(i10);
    }

    public void setChipIconResource(@DrawableRes int i10) {
        setChipIcon(AppCompatResources.getDrawable(this.f44283z1, i10));
    }

    public void setChipIconSize(float f6) {
        if (this.f44262d1 != f6) {
            float fK = k();
            this.f44262d1 = f6;
            float fK2 = k();
            invalidateSelf();
            if (fK != fK2) {
                onSizeChange();
            }
        }
    }

    public void setChipIconSizeResource(@DimenRes int i10) {
        setChipIconSize(this.f44283z1.getResources().getDimension(i10));
    }

    public void setChipIconTint(@Nullable ColorStateList colorStateList) {
        this.f44263e1 = true;
        if (this.f44261c1 != colorStateList) {
            this.f44261c1 = colorStateList;
            if (q()) {
                DrawableCompat.setTintList(this.f44260b1, colorStateList);
            }
            onStateChange(getState());
        }
    }

    public void setChipIconTintResource(@ColorRes int i10) {
        setChipIconTint(AppCompatResources.getColorStateList(this.f44283z1, i10));
    }

    public void setChipIconVisible(@BoolRes int i10) {
        setChipIconVisible(this.f44283z1.getResources().getBoolean(i10));
    }

    public void setChipMinHeight(float f6) {
        if (this.U0 != f6) {
            this.U0 = f6;
            invalidateSelf();
            onSizeChange();
        }
    }

    public void setChipMinHeightResource(@DimenRes int i10) {
        setChipMinHeight(this.f44283z1.getResources().getDimension(i10));
    }

    public void setChipStartPadding(float f6) {
        if (this.r1 != f6) {
            this.r1 = f6;
            invalidateSelf();
            onSizeChange();
        }
    }

    public void setChipStartPaddingResource(@DimenRes int i10) {
        setChipStartPadding(this.f44283z1.getResources().getDimension(i10));
    }

    public void setChipStrokeColor(@Nullable ColorStateList colorStateList) {
        if (this.W0 != colorStateList) {
            this.W0 = colorStateList;
            if (this.f44259a2) {
                setStrokeColor(colorStateList);
            }
            onStateChange(getState());
        }
    }

    public void setChipStrokeColorResource(@ColorRes int i10) {
        setChipStrokeColor(AppCompatResources.getColorStateList(this.f44283z1, i10));
    }

    public void setChipStrokeWidth(float f6) {
        if (this.X0 != f6) {
            this.X0 = f6;
            this.A1.setStrokeWidth(f6);
            if (this.f44259a2) {
                super.setStrokeWidth(f6);
            }
            invalidateSelf();
        }
    }

    public void setChipStrokeWidthResource(@DimenRes int i10) {
        setChipStrokeWidth(this.f44283z1.getResources().getDimension(i10));
    }

    public void setCloseIcon(@Nullable Drawable drawable) {
        Drawable closeIcon = getCloseIcon();
        if (closeIcon != drawable) {
            float fL = l();
            this.f44265g1 = drawable != null ? DrawableCompat.wrap(drawable).mutate() : null;
            if (RippleUtils.USE_FRAMEWORK_RIPPLE) {
                this.f44266h1 = new RippleDrawable(RippleUtils.sanitizeRippleDrawableColor(getRippleColor()), this.f44265g1, f44257c2);
            }
            float fL2 = l();
            s(closeIcon);
            if (r()) {
                i(this.f44265g1);
            }
            invalidateSelf();
            if (fL != fL2) {
                onSizeChange();
            }
        }
    }

    public void setCloseIconContentDescription(@Nullable CharSequence charSequence) {
        if (this.f44269k1 != charSequence) {
            this.f44269k1 = BidiFormatter.getInstance().unicodeWrap(charSequence);
            invalidateSelf();
        }
    }

    @Deprecated
    public void setCloseIconEnabled(boolean z10) {
        setCloseIconVisible(z10);
    }

    @Deprecated
    public void setCloseIconEnabledResource(@BoolRes int i10) {
        setCloseIconVisible(i10);
    }

    public void setCloseIconEndPadding(float f6) {
        if (this.f44281x1 != f6) {
            this.f44281x1 = f6;
            invalidateSelf();
            if (r()) {
                onSizeChange();
            }
        }
    }

    public void setCloseIconEndPaddingResource(@DimenRes int i10) {
        setCloseIconEndPadding(this.f44283z1.getResources().getDimension(i10));
    }

    public void setCloseIconResource(@DrawableRes int i10) {
        setCloseIcon(AppCompatResources.getDrawable(this.f44283z1, i10));
    }

    public void setCloseIconSize(float f6) {
        if (this.f44268j1 != f6) {
            this.f44268j1 = f6;
            invalidateSelf();
            if (r()) {
                onSizeChange();
            }
        }
    }

    public void setCloseIconSizeResource(@DimenRes int i10) {
        setCloseIconSize(this.f44283z1.getResources().getDimension(i10));
    }

    public void setCloseIconStartPadding(float f6) {
        if (this.f44280w1 != f6) {
            this.f44280w1 = f6;
            invalidateSelf();
            if (r()) {
                onSizeChange();
            }
        }
    }

    public void setCloseIconStartPaddingResource(@DimenRes int i10) {
        setCloseIconStartPadding(this.f44283z1.getResources().getDimension(i10));
    }

    public boolean setCloseIconState(@NonNull int[] iArr) {
        if (Arrays.equals(this.T1, iArr)) {
            return false;
        }
        this.T1 = iArr;
        if (r()) {
            return o(getState(), iArr);
        }
        return false;
    }

    public void setCloseIconTint(@Nullable ColorStateList colorStateList) {
        if (this.f44267i1 != colorStateList) {
            this.f44267i1 = colorStateList;
            if (r()) {
                DrawableCompat.setTintList(this.f44265g1, colorStateList);
            }
            onStateChange(getState());
        }
    }

    public void setCloseIconTintResource(@ColorRes int i10) {
        setCloseIconTint(AppCompatResources.getColorStateList(this.f44283z1, i10));
    }

    public void setCloseIconVisible(@BoolRes int i10) {
        setCloseIconVisible(this.f44283z1.getResources().getBoolean(i10));
    }

    @Override // com.google.android.material.shape.MaterialShapeDrawable, android.graphics.drawable.Drawable
    public void setColorFilter(@Nullable ColorFilter colorFilter) {
        if (this.P1 != colorFilter) {
            this.P1 = colorFilter;
            invalidateSelf();
        }
    }

    public void setDelegate(@Nullable Delegate delegate) {
        this.W1 = new WeakReference<>(delegate);
    }

    public void setEllipsize(@Nullable TextUtils.TruncateAt truncateAt) {
        this.X1 = truncateAt;
    }

    public void setHideMotionSpec(@Nullable MotionSpec motionSpec) {
        this.f44275q1 = motionSpec;
    }

    public void setHideMotionSpecResource(@AnimatorRes int i10) {
        setHideMotionSpec(MotionSpec.createFromResource(this.f44283z1, i10));
    }

    public void setIconEndPadding(float f6) {
        if (this.f44277t1 != f6) {
            float fK = k();
            this.f44277t1 = f6;
            float fK2 = k();
            invalidateSelf();
            if (fK != fK2) {
                onSizeChange();
            }
        }
    }

    public void setIconEndPaddingResource(@DimenRes int i10) {
        setIconEndPadding(this.f44283z1.getResources().getDimension(i10));
    }

    public void setIconStartPadding(float f6) {
        if (this.f44276s1 != f6) {
            float fK = k();
            this.f44276s1 = f6;
            float fK2 = k();
            invalidateSelf();
            if (fK != fK2) {
                onSizeChange();
            }
        }
    }

    public void setIconStartPaddingResource(@DimenRes int i10) {
        setIconStartPadding(this.f44283z1.getResources().getDimension(i10));
    }

    public void setMaxWidth(@Px int i10) {
        this.Z1 = i10;
    }

    public void setRippleColor(@Nullable ColorStateList colorStateList) {
        if (this.Y0 != colorStateList) {
            this.Y0 = colorStateList;
            this.V1 = this.U1 ? RippleUtils.sanitizeRippleDrawableColor(colorStateList) : null;
            onStateChange(getState());
        }
    }

    public void setRippleColorResource(@ColorRes int i10) {
        setRippleColor(AppCompatResources.getColorStateList(this.f44283z1, i10));
    }

    public void setShowMotionSpec(@Nullable MotionSpec motionSpec) {
        this.f44274p1 = motionSpec;
    }

    public void setShowMotionSpecResource(@AnimatorRes int i10) {
        setShowMotionSpec(MotionSpec.createFromResource(this.f44283z1, i10));
    }

    public void setText(@Nullable CharSequence charSequence) {
        if (charSequence == null) {
            charSequence = "";
        }
        if (TextUtils.equals(this.Z0, charSequence)) {
            return;
        }
        this.Z0 = charSequence;
        this.F1.setTextWidthDirty(true);
        invalidateSelf();
        onSizeChange();
    }

    public void setTextAppearance(@Nullable TextAppearance textAppearance) {
        this.F1.setTextAppearance(textAppearance, this.f44283z1);
    }

    public void setTextAppearanceResource(@StyleRes int i10) {
        setTextAppearance(new TextAppearance(this.f44283z1, i10));
    }

    public void setTextColor(@ColorInt int i10) {
        setTextColor(ColorStateList.valueOf(i10));
    }

    public void setTextEndPadding(float f6) {
        if (this.f44279v1 != f6) {
            this.f44279v1 = f6;
            invalidateSelf();
            onSizeChange();
        }
    }

    public void setTextEndPaddingResource(@DimenRes int i10) {
        setTextEndPadding(this.f44283z1.getResources().getDimension(i10));
    }

    public void setTextResource(@StringRes int i10) {
        setText(this.f44283z1.getResources().getString(i10));
    }

    public void setTextSize(@Dimension float f6) {
        TextAppearance textAppearance = getTextAppearance();
        if (textAppearance != null) {
            textAppearance.setTextSize(f6);
            this.F1.getTextPaint().setTextSize(f6);
            onTextSizeChange();
        }
    }

    public void setTextStartPadding(float f6) {
        if (this.f44278u1 != f6) {
            this.f44278u1 = f6;
            invalidateSelf();
            onSizeChange();
        }
    }

    public void setTextStartPaddingResource(@DimenRes int i10) {
        setTextStartPadding(this.f44283z1.getResources().getDimension(i10));
    }

    @Override // com.google.android.material.shape.MaterialShapeDrawable, android.graphics.drawable.Drawable, androidx.core.graphics.drawable.TintAwareDrawable
    public void setTintList(@Nullable ColorStateList colorStateList) {
        if (this.R1 != colorStateList) {
            this.R1 = colorStateList;
            onStateChange(getState());
        }
    }

    @Override // com.google.android.material.shape.MaterialShapeDrawable, android.graphics.drawable.Drawable, androidx.core.graphics.drawable.TintAwareDrawable
    public void setTintMode(@NonNull PorterDuff.Mode mode) {
        if (this.S1 != mode) {
            this.S1 = mode;
            this.Q1 = DrawableUtils.updateTintFilter(this, this.R1, mode);
            invalidateSelf();
        }
    }

    public void setUseCompatRipple(boolean z10) {
        if (this.U1 != z10) {
            this.U1 = z10;
            this.V1 = z10 ? RippleUtils.sanitizeRippleDrawableColor(this.Y0) : null;
            onStateChange(getState());
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z10, boolean z11) {
        boolean visible = super.setVisible(z10, z11);
        if (q()) {
            visible |= this.f44260b1.setVisible(z10, z11);
        }
        if (p()) {
            visible |= this.f44272n1.setVisible(z10, z11);
        }
        if (r()) {
            visible |= this.f44265g1.setVisible(z10, z11);
        }
        if (visible) {
            invalidateSelf();
        }
        return visible;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void unscheduleDrawable(@NonNull Drawable drawable, @NonNull Runnable runnable) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.unscheduleDrawable(this, runnable);
        }
    }

    public void setCheckedIconVisible(boolean z10) {
        if (this.f44271m1 != z10) {
            boolean zP = p();
            this.f44271m1 = z10;
            boolean zP2 = p();
            if (zP != zP2) {
                if (zP2) {
                    i(this.f44272n1);
                } else {
                    s(this.f44272n1);
                }
                invalidateSelf();
                onSizeChange();
            }
        }
    }

    public void setChipIconVisible(boolean z10) {
        if (this.f44258a1 != z10) {
            boolean zQ = q();
            this.f44258a1 = z10;
            boolean zQ2 = q();
            if (zQ != zQ2) {
                if (zQ2) {
                    i(this.f44260b1);
                } else {
                    s(this.f44260b1);
                }
                invalidateSelf();
                onSizeChange();
            }
        }
    }

    public void setCloseIconVisible(boolean z10) {
        if (this.f44264f1 != z10) {
            boolean zR = r();
            this.f44264f1 = z10;
            boolean zR2 = r();
            if (zR != zR2) {
                if (zR2) {
                    i(this.f44265g1);
                } else {
                    s(this.f44265g1);
                }
                invalidateSelf();
                onSizeChange();
            }
        }
    }

    public void setTextColor(@Nullable ColorStateList colorStateList) {
        TextAppearance textAppearance = getTextAppearance();
        if (textAppearance != null) {
            textAppearance.setTextColor(colorStateList);
            invalidateSelf();
        }
    }
}

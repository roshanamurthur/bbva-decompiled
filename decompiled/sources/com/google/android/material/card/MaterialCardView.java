package com.google.android.material.card;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Checkable;
import androidx.annotation.ColorInt;
import androidx.annotation.ColorRes;
import androidx.annotation.DimenRes;
import androidx.annotation.Dimension;
import androidx.annotation.DrawableRes;
import androidx.annotation.FloatRange;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.cardview.widget.CardView;
import androidx.core.graphics.drawable.DrawableCompat;
import com.google.android.material.color.MaterialColors;
import com.google.android.material.internal.ThemeEnforcement;
import com.google.android.material.resources.MaterialResources;
import com.google.android.material.ripple.RippleUtils;
import com.google.android.material.shape.MaterialShapeDrawable;
import com.google.android.material.shape.MaterialShapeUtils;
import com.google.android.material.shape.ShapeAppearanceModel;
import com.google.android.material.shape.Shapeable;
import com.google.android.material.theme.overlay.MaterialThemeOverlay;
import ee.b;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* JADX INFO: loaded from: classes10.dex */
public class MaterialCardView extends CardView implements Checkable, Shapeable {
    public static final int CHECKED_ICON_GRAVITY_BOTTOM_END = 8388693;
    public static final int CHECKED_ICON_GRAVITY_BOTTOM_START = 8388691;
    public static final int CHECKED_ICON_GRAVITY_TOP_END = 8388661;
    public static final int CHECKED_ICON_GRAVITY_TOP_START = 8388659;
    public static final int[] G0 = {R.attr.state_checkable};
    public static final int[] H0 = {R.attr.state_checked};
    public static final int[] I0 = {com.google.android.material.R.attr.state_dragged};
    public static final int J0 = com.google.android.material.R.style.Widget_MaterialComponents_CardView;
    public boolean E0;
    public OnCheckedChangeListener F0;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    @NonNull
    public final b f44175w0;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public final boolean f44176x0;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    public boolean f44177y0;

    @Retention(RetentionPolicy.SOURCE)
    public @interface CheckedIconGravity {
    }

    public interface OnCheckedChangeListener {
        void onCheckedChanged(MaterialCardView materialCardView, boolean z10);
    }

    public MaterialCardView(Context context) {
        this(context, null);
    }

    @NonNull
    private RectF getBoundsAsRectF() {
        RectF rectF = new RectF();
        rectF.set(this.f44175w0.f68312c.getBounds());
        return rectF;
    }

    public final void b() {
        b bVar;
        Drawable drawable;
        if (Build.VERSION.SDK_INT <= 26 || (drawable = (bVar = this.f44175w0).f68323o) == null) {
            return;
        }
        Rect bounds = drawable.getBounds();
        int i10 = bounds.bottom;
        bVar.f68323o.setBounds(bounds.left, bounds.top, bounds.right, i10 - 1);
        bVar.f68323o.setBounds(bounds.left, bounds.top, bounds.right, i10);
    }

    public final void c(int i10, int i11, int i12, int i13) {
        super.setContentPadding(i10, i11, i12, i13);
    }

    @Override // androidx.cardview.widget.CardView
    @NonNull
    public ColorStateList getCardBackgroundColor() {
        return this.f44175w0.f68312c.getFillColor();
    }

    @NonNull
    public ColorStateList getCardForegroundColor() {
        return this.f44175w0.f68313d.getFillColor();
    }

    public float getCardViewRadius() {
        return super.getRadius();
    }

    @Nullable
    public Drawable getCheckedIcon() {
        return this.f44175w0.f68319j;
    }

    public int getCheckedIconGravity() {
        return this.f44175w0.f68316g;
    }

    @Dimension
    public int getCheckedIconMargin() {
        return this.f44175w0.f68314e;
    }

    @Dimension
    public int getCheckedIconSize() {
        return this.f44175w0.f68315f;
    }

    @Nullable
    public ColorStateList getCheckedIconTint() {
        return this.f44175w0.f68321l;
    }

    @Override // androidx.cardview.widget.CardView
    public int getContentPaddingBottom() {
        return this.f44175w0.f68311b.bottom;
    }

    @Override // androidx.cardview.widget.CardView
    public int getContentPaddingLeft() {
        return this.f44175w0.f68311b.left;
    }

    @Override // androidx.cardview.widget.CardView
    public int getContentPaddingRight() {
        return this.f44175w0.f68311b.right;
    }

    @Override // androidx.cardview.widget.CardView
    public int getContentPaddingTop() {
        return this.f44175w0.f68311b.top;
    }

    @FloatRange(from = 0.0d, to = 1.0d)
    public float getProgress() {
        return this.f44175w0.f68312c.getInterpolation();
    }

    @Override // androidx.cardview.widget.CardView
    public float getRadius() {
        return this.f44175w0.f68312c.getTopLeftCornerResolvedSize();
    }

    public ColorStateList getRippleColor() {
        return this.f44175w0.f68320k;
    }

    @Override // com.google.android.material.shape.Shapeable
    @NonNull
    public ShapeAppearanceModel getShapeAppearanceModel() {
        return this.f44175w0.m;
    }

    @ColorInt
    @Deprecated
    public int getStrokeColor() {
        ColorStateList colorStateList = this.f44175w0.f68322n;
        if (colorStateList == null) {
            return -1;
        }
        return colorStateList.getDefaultColor();
    }

    @Nullable
    public ColorStateList getStrokeColorStateList() {
        return this.f44175w0.f68322n;
    }

    @Dimension
    public int getStrokeWidth() {
        return this.f44175w0.f68317h;
    }

    public boolean isCheckable() {
        b bVar = this.f44175w0;
        return bVar != null && bVar.f68328t;
    }

    @Override // android.widget.Checkable
    public boolean isChecked() {
        return this.f44177y0;
    }

    public boolean isDragged() {
        return this.E0;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        b bVar = this.f44175w0;
        bVar.k();
        MaterialShapeUtils.setParentAbsoluteElevation(this, bVar.f68312c);
    }

    @Override // android.view.ViewGroup, android.view.View
    public int[] onCreateDrawableState(int i10) {
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i10 + 3);
        if (isCheckable()) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, G0);
        }
        if (isChecked()) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, H0);
        }
        if (isDragged()) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, I0);
        }
        return iArrOnCreateDrawableState;
    }

    @Override // android.view.View
    public void onInitializeAccessibilityEvent(@NonNull AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName("androidx.cardview.widget.CardView");
        accessibilityEvent.setChecked(isChecked());
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(@NonNull AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("androidx.cardview.widget.CardView");
        accessibilityNodeInfo.setCheckable(isCheckable());
        accessibilityNodeInfo.setClickable(isClickable());
        accessibilityNodeInfo.setChecked(isChecked());
    }

    @Override // androidx.cardview.widget.CardView, android.widget.FrameLayout, android.view.View
    public void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        this.f44175w0.e(getMeasuredWidth(), getMeasuredHeight());
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        setBackgroundDrawable(drawable);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        if (this.f44176x0) {
            b bVar = this.f44175w0;
            if (!bVar.f68327s) {
                bVar.f68327s = true;
            }
            super.setBackgroundDrawable(drawable);
        }
    }

    public void setBackgroundInternal(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
    }

    @Override // androidx.cardview.widget.CardView
    public void setCardBackgroundColor(@Nullable ColorStateList colorStateList) {
        this.f44175w0.f68312c.setFillColor(colorStateList);
    }

    @Override // androidx.cardview.widget.CardView
    public void setCardElevation(float f6) {
        super.setCardElevation(f6);
        b bVar = this.f44175w0;
        bVar.f68312c.setElevation(bVar.f68310a.getCardElevation());
    }

    public void setCardForegroundColor(@Nullable ColorStateList colorStateList) {
        MaterialShapeDrawable materialShapeDrawable = this.f44175w0.f68313d;
        if (colorStateList == null) {
            colorStateList = ColorStateList.valueOf(0);
        }
        materialShapeDrawable.setFillColor(colorStateList);
    }

    public void setCheckable(boolean z10) {
        this.f44175w0.f68328t = z10;
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean z10) {
        if (this.f44177y0 != z10) {
            toggle();
        }
    }

    public void setCheckedIcon(@Nullable Drawable drawable) {
        this.f44175w0.g(drawable);
    }

    public void setCheckedIconGravity(int i10) {
        b bVar = this.f44175w0;
        if (bVar.f68316g != i10) {
            bVar.f68316g = i10;
            MaterialCardView materialCardView = bVar.f68310a;
            bVar.e(materialCardView.getMeasuredWidth(), materialCardView.getMeasuredHeight());
        }
    }

    public void setCheckedIconMargin(@Dimension int i10) {
        this.f44175w0.f68314e = i10;
    }

    public void setCheckedIconMarginResource(@DimenRes int i10) {
        if (i10 != -1) {
            this.f44175w0.f68314e = getResources().getDimensionPixelSize(i10);
        }
    }

    public void setCheckedIconResource(@DrawableRes int i10) {
        this.f44175w0.g(AppCompatResources.getDrawable(getContext(), i10));
    }

    public void setCheckedIconSize(@Dimension int i10) {
        this.f44175w0.f68315f = i10;
    }

    public void setCheckedIconSizeResource(@DimenRes int i10) {
        if (i10 != 0) {
            this.f44175w0.f68315f = getResources().getDimensionPixelSize(i10);
        }
    }

    public void setCheckedIconTint(@Nullable ColorStateList colorStateList) {
        b bVar = this.f44175w0;
        bVar.f68321l = colorStateList;
        Drawable drawable = bVar.f68319j;
        if (drawable != null) {
            DrawableCompat.setTintList(drawable, colorStateList);
        }
    }

    @Override // android.view.View
    public void setClickable(boolean z10) {
        super.setClickable(z10);
        b bVar = this.f44175w0;
        if (bVar != null) {
            bVar.k();
        }
    }

    @Override // androidx.cardview.widget.CardView
    public void setContentPadding(int i10, int i11, int i12, int i13) {
        b bVar = this.f44175w0;
        bVar.f68311b.set(i10, i11, i12, i13);
        bVar.l();
    }

    public void setDragged(boolean z10) {
        if (this.E0 != z10) {
            this.E0 = z10;
            refreshDrawableState();
            b();
            invalidate();
        }
    }

    @Override // androidx.cardview.widget.CardView
    public void setMaxCardElevation(float f6) {
        super.setMaxCardElevation(f6);
        this.f44175w0.m();
    }

    public void setOnCheckedChangeListener(@Nullable OnCheckedChangeListener onCheckedChangeListener) {
        this.F0 = onCheckedChangeListener;
    }

    @Override // androidx.cardview.widget.CardView
    public void setPreventCornerOverlap(boolean z10) {
        super.setPreventCornerOverlap(z10);
        b bVar = this.f44175w0;
        bVar.m();
        bVar.l();
    }

    public void setProgress(@FloatRange(from = 0.0d, to = 1.0d) float f6) {
        b bVar = this.f44175w0;
        bVar.f68312c.setInterpolation(f6);
        MaterialShapeDrawable materialShapeDrawable = bVar.f68313d;
        if (materialShapeDrawable != null) {
            materialShapeDrawable.setInterpolation(f6);
        }
        MaterialShapeDrawable materialShapeDrawable2 = bVar.f68326r;
        if (materialShapeDrawable2 != null) {
            materialShapeDrawable2.setInterpolation(f6);
        }
    }

    @Override // androidx.cardview.widget.CardView
    public void setRadius(float f6) {
        super.setRadius(f6);
        b bVar = this.f44175w0;
        bVar.h(bVar.m.withCornerSize(f6));
        bVar.f68318i.invalidateSelf();
        if (bVar.i() || (bVar.f68310a.getPreventCornerOverlap() && !bVar.f68312c.isRoundRect())) {
            bVar.l();
        }
        if (bVar.i()) {
            bVar.m();
        }
    }

    public void setRippleColor(@Nullable ColorStateList colorStateList) {
        Drawable drawable;
        b bVar = this.f44175w0;
        bVar.f68320k = colorStateList;
        if (RippleUtils.USE_FRAMEWORK_RIPPLE && (drawable = bVar.f68323o) != null) {
            ((RippleDrawable) drawable).setColor(colorStateList);
            return;
        }
        MaterialShapeDrawable materialShapeDrawable = bVar.f68325q;
        if (materialShapeDrawable != null) {
            materialShapeDrawable.setFillColor(colorStateList);
        }
    }

    public void setRippleColorResource(@ColorRes int i10) {
        Drawable drawable;
        ColorStateList colorStateList = AppCompatResources.getColorStateList(getContext(), i10);
        b bVar = this.f44175w0;
        bVar.f68320k = colorStateList;
        if (RippleUtils.USE_FRAMEWORK_RIPPLE && (drawable = bVar.f68323o) != null) {
            ((RippleDrawable) drawable).setColor(colorStateList);
            return;
        }
        MaterialShapeDrawable materialShapeDrawable = bVar.f68325q;
        if (materialShapeDrawable != null) {
            materialShapeDrawable.setFillColor(colorStateList);
        }
    }

    @Override // com.google.android.material.shape.Shapeable
    public void setShapeAppearanceModel(@NonNull ShapeAppearanceModel shapeAppearanceModel) {
        setClipToOutline(shapeAppearanceModel.isRoundRect(getBoundsAsRectF()));
        this.f44175w0.h(shapeAppearanceModel);
    }

    public void setStrokeColor(@ColorInt int i10) {
        setStrokeColor(ColorStateList.valueOf(i10));
    }

    public void setStrokeWidth(@Dimension int i10) {
        b bVar = this.f44175w0;
        if (i10 != bVar.f68317h) {
            bVar.f68317h = i10;
            bVar.f68313d.setStroke(i10, bVar.f68322n);
        }
        invalidate();
    }

    @Override // androidx.cardview.widget.CardView
    public void setUseCompatPadding(boolean z10) {
        super.setUseCompatPadding(z10);
        b bVar = this.f44175w0;
        bVar.m();
        bVar.l();
    }

    @Override // android.widget.Checkable
    public void toggle() {
        if (isCheckable() && isEnabled()) {
            this.f44177y0 = !this.f44177y0;
            refreshDrawableState();
            b();
            this.f44175w0.f(this.f44177y0, true);
            OnCheckedChangeListener onCheckedChangeListener = this.F0;
            if (onCheckedChangeListener != null) {
                onCheckedChangeListener.onCheckedChanged(this, this.f44177y0);
            }
        }
    }

    public MaterialCardView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, com.google.android.material.R.attr.materialCardViewStyle);
    }

    public void setStrokeColor(ColorStateList colorStateList) {
        b bVar = this.f44175w0;
        if (bVar.f68322n != colorStateList) {
            bVar.f68322n = colorStateList;
            bVar.f68313d.setStroke(bVar.f68317h, colorStateList);
        }
        invalidate();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public MaterialCardView(Context context, AttributeSet attributeSet, int i10) {
        Drawable drawable;
        int i11 = J0;
        super(MaterialThemeOverlay.wrap(context, attributeSet, i10, i11), attributeSet, i10);
        this.f44177y0 = false;
        this.E0 = false;
        this.f44176x0 = true;
        TypedArray typedArrayObtainStyledAttributes = ThemeEnforcement.obtainStyledAttributes(getContext(), attributeSet, com.google.android.material.R.styleable.MaterialCardView, i10, i11, new int[0]);
        b bVar = new b(this, attributeSet, i10);
        this.f44175w0 = bVar;
        ColorStateList cardBackgroundColor = super.getCardBackgroundColor();
        MaterialShapeDrawable materialShapeDrawable = bVar.f68312c;
        materialShapeDrawable.setFillColor(cardBackgroundColor);
        bVar.f68311b.set(super.getContentPaddingLeft(), super.getContentPaddingTop(), super.getContentPaddingRight(), super.getContentPaddingBottom());
        bVar.l();
        MaterialCardView materialCardView = bVar.f68310a;
        ColorStateList colorStateList = MaterialResources.getColorStateList(materialCardView.getContext(), typedArrayObtainStyledAttributes, com.google.android.material.R.styleable.MaterialCardView_strokeColor);
        bVar.f68322n = colorStateList;
        if (colorStateList == null) {
            bVar.f68322n = ColorStateList.valueOf(-1);
        }
        bVar.f68317h = typedArrayObtainStyledAttributes.getDimensionPixelSize(com.google.android.material.R.styleable.MaterialCardView_strokeWidth, 0);
        boolean z10 = typedArrayObtainStyledAttributes.getBoolean(com.google.android.material.R.styleable.MaterialCardView_android_checkable, false);
        bVar.f68328t = z10;
        materialCardView.setLongClickable(z10);
        bVar.f68321l = MaterialResources.getColorStateList(materialCardView.getContext(), typedArrayObtainStyledAttributes, com.google.android.material.R.styleable.MaterialCardView_checkedIconTint);
        bVar.g(MaterialResources.getDrawable(materialCardView.getContext(), typedArrayObtainStyledAttributes, com.google.android.material.R.styleable.MaterialCardView_checkedIcon));
        bVar.f68315f = typedArrayObtainStyledAttributes.getDimensionPixelSize(com.google.android.material.R.styleable.MaterialCardView_checkedIconSize, 0);
        bVar.f68314e = typedArrayObtainStyledAttributes.getDimensionPixelSize(com.google.android.material.R.styleable.MaterialCardView_checkedIconMargin, 0);
        bVar.f68316g = typedArrayObtainStyledAttributes.getInteger(com.google.android.material.R.styleable.MaterialCardView_checkedIconGravity, 8388661);
        ColorStateList colorStateList2 = MaterialResources.getColorStateList(materialCardView.getContext(), typedArrayObtainStyledAttributes, com.google.android.material.R.styleable.MaterialCardView_rippleColor);
        bVar.f68320k = colorStateList2;
        if (colorStateList2 == null) {
            bVar.f68320k = ColorStateList.valueOf(MaterialColors.getColor(materialCardView, com.google.android.material.R.attr.colorControlHighlight));
        }
        ColorStateList colorStateList3 = MaterialResources.getColorStateList(materialCardView.getContext(), typedArrayObtainStyledAttributes, com.google.android.material.R.styleable.MaterialCardView_cardForegroundColor);
        MaterialShapeDrawable materialShapeDrawable2 = bVar.f68313d;
        materialShapeDrawable2.setFillColor(colorStateList3 == null ? ColorStateList.valueOf(0) : colorStateList3);
        if (RippleUtils.USE_FRAMEWORK_RIPPLE && (drawable = bVar.f68323o) != null) {
            ((RippleDrawable) drawable).setColor(bVar.f68320k);
        } else {
            MaterialShapeDrawable materialShapeDrawable3 = bVar.f68325q;
            if (materialShapeDrawable3 != null) {
                materialShapeDrawable3.setFillColor(bVar.f68320k);
            }
        }
        materialShapeDrawable.setElevation(materialCardView.getCardElevation());
        materialShapeDrawable2.setStroke(bVar.f68317h, bVar.f68322n);
        materialCardView.setBackgroundInternal(bVar.d(materialShapeDrawable));
        Drawable drawableC = bVar.j() ? bVar.c() : materialShapeDrawable2;
        bVar.f68318i = drawableC;
        materialCardView.setForeground(bVar.d(drawableC));
        typedArrayObtainStyledAttributes.recycle();
    }

    @Override // androidx.cardview.widget.CardView
    public void setCardBackgroundColor(@ColorInt int i10) {
        this.f44175w0.f68312c.setFillColor(ColorStateList.valueOf(i10));
    }
}

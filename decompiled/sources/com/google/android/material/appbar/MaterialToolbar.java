package com.google.android.material.appbar;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Pair;
import android.view.Menu;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.ColorInt;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.appcompat.view.menu.MenuBuilder;
import androidx.appcompat.widget.Toolbar;
import androidx.core.graphics.drawable.DrawableCompat;
import androidx.core.view.ViewCompat;
import com.google.android.material.R;
import com.google.android.material.drawable.DrawableUtils;
import com.google.android.material.internal.ThemeEnforcement;
import com.google.android.material.internal.ToolbarUtils;
import com.google.android.material.shape.MaterialShapeDrawable;
import com.google.android.material.shape.MaterialShapeUtils;
import com.google.android.material.theme.overlay.MaterialThemeOverlay;

/* JADX INFO: loaded from: classes10.dex */
public class MaterialToolbar extends Toolbar {

    /* JADX INFO: renamed from: t1, reason: collision with root package name */
    public static final int f43944t1 = R.style.Widget_MaterialComponents_Toolbar;

    /* JADX INFO: renamed from: u1, reason: collision with root package name */
    public static final ImageView.ScaleType[] f43945u1 = {ImageView.ScaleType.MATRIX, ImageView.ScaleType.FIT_XY, ImageView.ScaleType.FIT_START, ImageView.ScaleType.FIT_CENTER, ImageView.ScaleType.FIT_END, ImageView.ScaleType.CENTER, ImageView.ScaleType.CENTER_CROP, ImageView.ScaleType.CENTER_INSIDE};

    /* JADX INFO: renamed from: o1, reason: collision with root package name */
    @Nullable
    public Integer f43946o1;

    /* JADX INFO: renamed from: p1, reason: collision with root package name */
    public boolean f43947p1;

    /* JADX INFO: renamed from: q1, reason: collision with root package name */
    public boolean f43948q1;

    @Nullable
    public ImageView.ScaleType r1;

    /* JADX INFO: renamed from: s1, reason: collision with root package name */
    @Nullable
    public Boolean f43949s1;

    public MaterialToolbar(@NonNull Context context) {
        this(context, null);
    }

    public void clearNavigationIconTint() {
        this.f43946o1 = null;
        Drawable navigationIcon = getNavigationIcon();
        if (navigationIcon != null) {
            DrawableCompat.setTintList(DrawableCompat.wrap(navigationIcon.mutate()), null);
            setNavigationIcon(navigationIcon);
        }
    }

    @Nullable
    public ImageView.ScaleType getLogoScaleType() {
        return this.r1;
    }

    @Nullable
    @ColorInt
    public Integer getNavigationIconTint() {
        return this.f43946o1;
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void inflateMenu(int i10) {
        Menu menu = getMenu();
        boolean z10 = menu instanceof MenuBuilder;
        if (z10) {
            ((MenuBuilder) menu).stopDispatchingItemsChanged();
        }
        super.inflateMenu(i10);
        if (z10) {
            ((MenuBuilder) menu).startDispatchingItemsChanged();
        }
    }

    public boolean isLogoAdjustViewBounds() {
        Boolean bool = this.f43949s1;
        return bool != null && bool.booleanValue();
    }

    public boolean isSubtitleCentered() {
        return this.f43948q1;
    }

    public boolean isTitleCentered() {
        return this.f43947p1;
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        MaterialShapeUtils.setParentAbsoluteElevation(this);
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        if (this.f43947p1 || this.f43948q1) {
            TextView titleTextView = ToolbarUtils.getTitleTextView(this);
            TextView subtitleTextView = ToolbarUtils.getSubtitleTextView(this);
            if (titleTextView != null || subtitleTextView != null) {
                int measuredWidth = getMeasuredWidth();
                int i14 = measuredWidth / 2;
                int paddingLeft = getPaddingLeft();
                int paddingRight = measuredWidth - getPaddingRight();
                for (int i15 = 0; i15 < getChildCount(); i15++) {
                    View childAt = getChildAt(i15);
                    if (childAt.getVisibility() != 8 && childAt != titleTextView && childAt != subtitleTextView) {
                        if (childAt.getRight() < i14 && childAt.getRight() > paddingLeft) {
                            paddingLeft = childAt.getRight();
                        }
                        if (childAt.getLeft() > i14 && childAt.getLeft() < paddingRight) {
                            paddingRight = childAt.getLeft();
                        }
                    }
                }
                Pair pair = new Pair(Integer.valueOf(paddingLeft), Integer.valueOf(paddingRight));
                if (this.f43947p1 && titleTextView != null) {
                    r(pair, titleTextView);
                }
                if (this.f43948q1 && subtitleTextView != null) {
                    r(pair, subtitleTextView);
                }
            }
        }
        ImageView logoImageView = ToolbarUtils.getLogoImageView(this);
        if (logoImageView != null) {
            Boolean bool = this.f43949s1;
            if (bool != null) {
                logoImageView.setAdjustViewBounds(bool.booleanValue());
            }
            ImageView.ScaleType scaleType = this.r1;
            if (scaleType != null) {
                logoImageView.setScaleType(scaleType);
            }
        }
    }

    public final void r(Pair pair, TextView textView) {
        int measuredWidth = getMeasuredWidth();
        int measuredWidth2 = textView.getMeasuredWidth();
        int i10 = (measuredWidth / 2) - (measuredWidth2 / 2);
        int i11 = measuredWidth2 + i10;
        int iMax = Math.max(Math.max(((Integer) pair.first).intValue() - i10, 0), Math.max(i11 - ((Integer) pair.second).intValue(), 0));
        if (iMax > 0) {
            i10 += iMax;
            i11 -= iMax;
            textView.measure(View.MeasureSpec.makeMeasureSpec(i11 - i10, 1073741824), textView.getMeasuredHeightAndState());
        }
        textView.layout(i10, textView.getTop(), i11, textView.getBottom());
    }

    @Override // android.view.View
    @RequiresApi(21)
    public void setElevation(float f6) {
        super.setElevation(f6);
        MaterialShapeUtils.setElevation(this, f6);
    }

    public void setLogoAdjustViewBounds(boolean z10) {
        Boolean bool = this.f43949s1;
        if (bool == null || bool.booleanValue() != z10) {
            this.f43949s1 = Boolean.valueOf(z10);
            requestLayout();
        }
    }

    public void setLogoScaleType(@NonNull ImageView.ScaleType scaleType) {
        if (this.r1 != scaleType) {
            this.r1 = scaleType;
            requestLayout();
        }
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setNavigationIcon(@Nullable Drawable drawable) {
        if (drawable != null && this.f43946o1 != null) {
            drawable = DrawableCompat.wrap(drawable.mutate());
            DrawableCompat.setTint(drawable, this.f43946o1.intValue());
        }
        super.setNavigationIcon(drawable);
    }

    public void setNavigationIconTint(@ColorInt int i10) {
        this.f43946o1 = Integer.valueOf(i10);
        Drawable navigationIcon = getNavigationIcon();
        if (navigationIcon != null) {
            setNavigationIcon(navigationIcon);
        }
    }

    public void setSubtitleCentered(boolean z10) {
        if (this.f43948q1 != z10) {
            this.f43948q1 = z10;
            requestLayout();
        }
    }

    public void setTitleCentered(boolean z10) {
        if (this.f43947p1 != z10) {
            this.f43947p1 = z10;
            requestLayout();
        }
    }

    public MaterialToolbar(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.toolbarStyle);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public MaterialToolbar(@NonNull Context context, @Nullable AttributeSet attributeSet, int i10) {
        ColorStateList colorStateListOrNull;
        int i11 = f43944t1;
        super(MaterialThemeOverlay.wrap(context, attributeSet, i10, i11), attributeSet, i10);
        Context context2 = getContext();
        TypedArray typedArrayObtainStyledAttributes = ThemeEnforcement.obtainStyledAttributes(context2, attributeSet, R.styleable.MaterialToolbar, i10, i11, new int[0]);
        int i12 = R.styleable.MaterialToolbar_navigationIconTint;
        if (typedArrayObtainStyledAttributes.hasValue(i12)) {
            setNavigationIconTint(typedArrayObtainStyledAttributes.getColor(i12, -1));
        }
        this.f43947p1 = typedArrayObtainStyledAttributes.getBoolean(R.styleable.MaterialToolbar_titleCentered, false);
        this.f43948q1 = typedArrayObtainStyledAttributes.getBoolean(R.styleable.MaterialToolbar_subtitleCentered, false);
        int i13 = typedArrayObtainStyledAttributes.getInt(R.styleable.MaterialToolbar_logoScaleType, -1);
        if (i13 >= 0) {
            ImageView.ScaleType[] scaleTypeArr = f43945u1;
            if (i13 < scaleTypeArr.length) {
                this.r1 = scaleTypeArr[i13];
            }
        }
        int i14 = R.styleable.MaterialToolbar_logoAdjustViewBounds;
        if (typedArrayObtainStyledAttributes.hasValue(i14)) {
            this.f43949s1 = Boolean.valueOf(typedArrayObtainStyledAttributes.getBoolean(i14, false));
        }
        typedArrayObtainStyledAttributes.recycle();
        Drawable background = getBackground();
        if (background == null) {
            colorStateListOrNull = ColorStateList.valueOf(0);
        } else {
            colorStateListOrNull = DrawableUtils.getColorStateListOrNull(background);
        }
        if (colorStateListOrNull != null) {
            MaterialShapeDrawable materialShapeDrawable = new MaterialShapeDrawable();
            materialShapeDrawable.setFillColor(colorStateListOrNull);
            materialShapeDrawable.initializeElevationOverlay(context2);
            materialShapeDrawable.setElevation(ViewCompat.getElevation(this));
            ViewCompat.setBackground(this, materialShapeDrawable);
        }
    }
}

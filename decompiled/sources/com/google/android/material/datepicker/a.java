package com.google.android.material.datepicker;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.RippleDrawable;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.StyleRes;
import androidx.core.util.Preconditions;
import androidx.core.view.ViewCompat;
import com.google.android.material.R;
import com.google.android.material.resources.MaterialResources;
import com.google.android.material.shape.MaterialShapeDrawable;
import com.google.android.material.shape.ShapeAppearanceModel;

/* JADX INFO: compiled from: CalendarItemStyle.java */
/* JADX INFO: loaded from: classes10.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    public final Rect f44551a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ColorStateList f44552b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ColorStateList f44553c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ColorStateList f44554d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f44555e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ShapeAppearanceModel f44556f;

    public a(ColorStateList colorStateList, ColorStateList colorStateList2, ColorStateList colorStateList3, int i10, ShapeAppearanceModel shapeAppearanceModel, @NonNull Rect rect) {
        Preconditions.checkArgumentNonnegative(rect.left);
        Preconditions.checkArgumentNonnegative(rect.top);
        Preconditions.checkArgumentNonnegative(rect.right);
        Preconditions.checkArgumentNonnegative(rect.bottom);
        this.f44551a = rect;
        this.f44552b = colorStateList2;
        this.f44553c = colorStateList;
        this.f44554d = colorStateList3;
        this.f44555e = i10;
        this.f44556f = shapeAppearanceModel;
    }

    @NonNull
    public static a a(@NonNull Context context, @StyleRes int i10) {
        Preconditions.checkArgument(i10 != 0, "Cannot create a CalendarItemStyle with a styleResId of 0");
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(i10, R.styleable.MaterialCalendarItem);
        Rect rect = new Rect(typedArrayObtainStyledAttributes.getDimensionPixelOffset(R.styleable.MaterialCalendarItem_android_insetLeft, 0), typedArrayObtainStyledAttributes.getDimensionPixelOffset(R.styleable.MaterialCalendarItem_android_insetTop, 0), typedArrayObtainStyledAttributes.getDimensionPixelOffset(R.styleable.MaterialCalendarItem_android_insetRight, 0), typedArrayObtainStyledAttributes.getDimensionPixelOffset(R.styleable.MaterialCalendarItem_android_insetBottom, 0));
        ColorStateList colorStateList = MaterialResources.getColorStateList(context, typedArrayObtainStyledAttributes, R.styleable.MaterialCalendarItem_itemFillColor);
        ColorStateList colorStateList2 = MaterialResources.getColorStateList(context, typedArrayObtainStyledAttributes, R.styleable.MaterialCalendarItem_itemTextColor);
        ColorStateList colorStateList3 = MaterialResources.getColorStateList(context, typedArrayObtainStyledAttributes, R.styleable.MaterialCalendarItem_itemStrokeColor);
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(R.styleable.MaterialCalendarItem_itemStrokeWidth, 0);
        ShapeAppearanceModel shapeAppearanceModelBuild = ShapeAppearanceModel.builder(context, typedArrayObtainStyledAttributes.getResourceId(R.styleable.MaterialCalendarItem_itemShapeAppearance, 0), typedArrayObtainStyledAttributes.getResourceId(R.styleable.MaterialCalendarItem_itemShapeAppearanceOverlay, 0)).build();
        typedArrayObtainStyledAttributes.recycle();
        return new a(colorStateList, colorStateList2, colorStateList3, dimensionPixelSize, shapeAppearanceModelBuild, rect);
    }

    public final void b(@NonNull TextView textView, @Nullable ColorStateList colorStateList, @Nullable ColorStateList colorStateList2) {
        MaterialShapeDrawable materialShapeDrawable = new MaterialShapeDrawable();
        MaterialShapeDrawable materialShapeDrawable2 = new MaterialShapeDrawable();
        ShapeAppearanceModel shapeAppearanceModel = this.f44556f;
        materialShapeDrawable.setShapeAppearanceModel(shapeAppearanceModel);
        materialShapeDrawable2.setShapeAppearanceModel(shapeAppearanceModel);
        if (colorStateList == null) {
            colorStateList = this.f44553c;
        }
        materialShapeDrawable.setFillColor(colorStateList);
        materialShapeDrawable.setStroke(this.f44555e, this.f44554d);
        ColorStateList colorStateList3 = this.f44552b;
        if (colorStateList2 == null) {
            colorStateList2 = colorStateList3;
        }
        textView.setTextColor(colorStateList2);
        RippleDrawable rippleDrawable = new RippleDrawable(colorStateList3.withAlpha(30), materialShapeDrawable, materialShapeDrawable2);
        Rect rect = this.f44551a;
        ViewCompat.setBackground(textView, new InsetDrawable((Drawable) rippleDrawable, rect.left, rect.top, rect.right, rect.bottom));
    }
}

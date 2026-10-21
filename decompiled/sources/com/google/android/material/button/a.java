package com.google.android.material.button;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import androidx.annotation.Dimension;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.core.graphics.drawable.DrawableCompat;
import androidx.core.view.ViewCompat;
import com.google.android.material.R;
import com.google.android.material.color.MaterialColors;
import com.google.android.material.ripple.RippleUtils;
import com.google.android.material.shape.MaterialShapeDrawable;
import com.google.android.material.shape.ShapeAppearanceModel;
import com.google.android.material.shape.Shapeable;

/* JADX INFO: compiled from: MaterialButtonHelper.java */
/* JADX INFO: loaded from: classes10.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final MaterialButton f44156a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    public ShapeAppearanceModel f44157b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f44158c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f44159d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f44160e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f44161f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f44162g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f44163h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @Nullable
    public PorterDuff.Mode f44164i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @Nullable
    public ColorStateList f44165j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @Nullable
    public ColorStateList f44166k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @Nullable
    public ColorStateList f44167l;

    @Nullable
    public MaterialShapeDrawable m;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f44171q;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public RippleDrawable f44173s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f44174t;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f44168n = false;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f44169o = false;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f44170p = false;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f44172r = true;

    public a(MaterialButton materialButton, @NonNull ShapeAppearanceModel shapeAppearanceModel) {
        this.f44156a = materialButton;
        this.f44157b = shapeAppearanceModel;
    }

    @Nullable
    public final Shapeable a() {
        RippleDrawable rippleDrawable = this.f44173s;
        if (rippleDrawable == null || rippleDrawable.getNumberOfLayers() <= 1) {
            return null;
        }
        return this.f44173s.getNumberOfLayers() > 2 ? (Shapeable) this.f44173s.getDrawable(2) : (Shapeable) this.f44173s.getDrawable(1);
    }

    @Nullable
    public final MaterialShapeDrawable b(boolean z10) {
        RippleDrawable rippleDrawable = this.f44173s;
        if (rippleDrawable == null || rippleDrawable.getNumberOfLayers() <= 0) {
            return null;
        }
        return (MaterialShapeDrawable) ((LayerDrawable) ((InsetDrawable) this.f44173s.getDrawable(0)).getDrawable()).getDrawable(!z10 ? 1 : 0);
    }

    public final void c(@NonNull ShapeAppearanceModel shapeAppearanceModel) {
        this.f44157b = shapeAppearanceModel;
        if (b(false) != null) {
            b(false).setShapeAppearanceModel(shapeAppearanceModel);
        }
        if (b(true) != null) {
            b(true).setShapeAppearanceModel(shapeAppearanceModel);
        }
        if (a() != null) {
            a().setShapeAppearanceModel(shapeAppearanceModel);
        }
    }

    public final void d(@Dimension int i10, @Dimension int i11) {
        MaterialButton materialButton = this.f44156a;
        int paddingStart = ViewCompat.getPaddingStart(materialButton);
        int paddingTop = materialButton.getPaddingTop();
        int paddingEnd = ViewCompat.getPaddingEnd(materialButton);
        int paddingBottom = materialButton.getPaddingBottom();
        int i12 = this.f44160e;
        int i13 = this.f44161f;
        this.f44161f = i11;
        this.f44160e = i10;
        if (!this.f44169o) {
            e();
        }
        ViewCompat.setPaddingRelative(materialButton, paddingStart, (paddingTop + i10) - i12, paddingEnd, (paddingBottom + i11) - i13);
    }

    public final void e() {
        MaterialShapeDrawable materialShapeDrawable = new MaterialShapeDrawable(this.f44157b);
        MaterialButton materialButton = this.f44156a;
        materialShapeDrawable.initializeElevationOverlay(materialButton.getContext());
        DrawableCompat.setTintList(materialShapeDrawable, this.f44165j);
        PorterDuff.Mode mode = this.f44164i;
        if (mode != null) {
            DrawableCompat.setTintMode(materialShapeDrawable, mode);
        }
        materialShapeDrawable.setStroke(this.f44163h, this.f44166k);
        MaterialShapeDrawable materialShapeDrawable2 = new MaterialShapeDrawable(this.f44157b);
        materialShapeDrawable2.setTint(0);
        materialShapeDrawable2.setStroke(this.f44163h, this.f44168n ? MaterialColors.getColor(materialButton, R.attr.colorSurface) : 0);
        MaterialShapeDrawable materialShapeDrawable3 = new MaterialShapeDrawable(this.f44157b);
        this.m = materialShapeDrawable3;
        DrawableCompat.setTint(materialShapeDrawable3, -1);
        RippleDrawable rippleDrawable = new RippleDrawable(RippleUtils.sanitizeRippleDrawableColor(this.f44167l), new InsetDrawable((Drawable) new LayerDrawable(new Drawable[]{materialShapeDrawable2, materialShapeDrawable}), this.f44158c, this.f44160e, this.f44159d, this.f44161f), this.m);
        this.f44173s = rippleDrawable;
        materialButton.setInternalBackground(rippleDrawable);
        MaterialShapeDrawable materialShapeDrawableB = b(false);
        if (materialShapeDrawableB != null) {
            materialShapeDrawableB.setElevation(this.f44174t);
            materialShapeDrawableB.setState(materialButton.getDrawableState());
        }
    }

    public final void f() {
        MaterialShapeDrawable materialShapeDrawableB = b(false);
        MaterialShapeDrawable materialShapeDrawableB2 = b(true);
        if (materialShapeDrawableB != null) {
            materialShapeDrawableB.setStroke(this.f44163h, this.f44166k);
            if (materialShapeDrawableB2 != null) {
                materialShapeDrawableB2.setStroke(this.f44163h, this.f44168n ? MaterialColors.getColor(this.f44156a, R.attr.colorSurface) : 0);
            }
        }
    }
}

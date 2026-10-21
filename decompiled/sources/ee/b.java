package ee;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.Dimension;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.core.graphics.drawable.DrawableCompat;
import androidx.core.view.GravityCompat;
import androidx.core.view.ViewCompat;
import com.google.android.material.R;
import com.google.android.material.animation.AnimationUtils;
import com.google.android.material.card.MaterialCardView;
import com.google.android.material.motion.MotionUtils;
import com.google.android.material.ripple.RippleUtils;
import com.google.android.material.shape.CornerTreatment;
import com.google.android.material.shape.CutCornerTreatment;
import com.google.android.material.shape.MaterialShapeDrawable;
import com.google.android.material.shape.RoundedCornerTreatment;
import com.google.android.material.shape.ShapeAppearanceModel;

/* JADX INFO: compiled from: MaterialCardViewHelper.java */
/* JADX INFO: loaded from: classes10.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public final class b {
    public static final ColorDrawable A;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final double f68309z = Math.cos(Math.toRadians(45.0d));

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    public final MaterialCardView f68310a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    public final Rect f68311b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    public final MaterialShapeDrawable f68312c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NonNull
    public final MaterialShapeDrawable f68313d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Dimension
    public int f68314e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Dimension
    public int f68315f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f68316g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @Dimension
    public int f68317h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @Nullable
    public Drawable f68318i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @Nullable
    public Drawable f68319j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @Nullable
    public ColorStateList f68320k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @Nullable
    public ColorStateList f68321l;

    @Nullable
    public ShapeAppearanceModel m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @Nullable
    public ColorStateList f68322n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @Nullable
    public Drawable f68323o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @Nullable
    public LayerDrawable f68324p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @Nullable
    public MaterialShapeDrawable f68325q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @Nullable
    public MaterialShapeDrawable f68326r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f68327s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f68328t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    @Nullable
    public ValueAnimator f68329u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final TimeInterpolator f68330v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final int f68331w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final int f68332x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public float f68333y;

    static {
        A = Build.VERSION.SDK_INT <= 28 ? new ColorDrawable() : null;
    }

    public b(@NonNull MaterialCardView materialCardView, AttributeSet attributeSet, int i10) {
        int i11 = MaterialCardView.J0;
        this.f68311b = new Rect();
        this.f68327s = false;
        this.f68333y = 0.0f;
        this.f68310a = materialCardView;
        MaterialShapeDrawable materialShapeDrawable = new MaterialShapeDrawable(materialCardView.getContext(), attributeSet, i10, i11);
        this.f68312c = materialShapeDrawable;
        materialShapeDrawable.initializeElevationOverlay(materialCardView.getContext());
        materialShapeDrawable.setShadowColor(-12303292);
        ShapeAppearanceModel.Builder builder = materialShapeDrawable.getShapeAppearanceModel().toBuilder();
        TypedArray typedArrayObtainStyledAttributes = materialCardView.getContext().obtainStyledAttributes(attributeSet, R.styleable.CardView, i10, R.style.CardView);
        int i12 = R.styleable.CardView_cardCornerRadius;
        if (typedArrayObtainStyledAttributes.hasValue(i12)) {
            builder.setAllCornerSizes(typedArrayObtainStyledAttributes.getDimension(i12, 0.0f));
        }
        this.f68313d = new MaterialShapeDrawable();
        h(builder.build());
        this.f68330v = MotionUtils.resolveThemeInterpolator(materialCardView.getContext(), R.attr.motionEasingLinearInterpolator, AnimationUtils.LINEAR_INTERPOLATOR);
        this.f68331w = MotionUtils.resolveThemeDuration(materialCardView.getContext(), R.attr.motionDurationShort2, 300);
        this.f68332x = MotionUtils.resolveThemeDuration(materialCardView.getContext(), R.attr.motionDurationShort1, 300);
        typedArrayObtainStyledAttributes.recycle();
    }

    public static float b(CornerTreatment cornerTreatment, float f6) {
        if (cornerTreatment instanceof RoundedCornerTreatment) {
            return (float) ((1.0d - f68309z) * ((double) f6));
        }
        if (cornerTreatment instanceof CutCornerTreatment) {
            return f6 / 2.0f;
        }
        return 0.0f;
    }

    public final float a() {
        CornerTreatment topLeftCorner = this.m.getTopLeftCorner();
        MaterialShapeDrawable materialShapeDrawable = this.f68312c;
        return Math.max(Math.max(b(topLeftCorner, materialShapeDrawable.getTopLeftCornerResolvedSize()), b(this.m.getTopRightCorner(), materialShapeDrawable.getTopRightCornerResolvedSize())), Math.max(b(this.m.getBottomRightCorner(), materialShapeDrawable.getBottomRightCornerResolvedSize()), b(this.m.getBottomLeftCorner(), materialShapeDrawable.getBottomLeftCornerResolvedSize())));
    }

    @NonNull
    public final LayerDrawable c() {
        Drawable rippleDrawable;
        if (this.f68323o == null) {
            if (RippleUtils.USE_FRAMEWORK_RIPPLE) {
                this.f68326r = new MaterialShapeDrawable(this.m);
                rippleDrawable = new RippleDrawable(this.f68320k, null, this.f68326r);
            } else {
                StateListDrawable stateListDrawable = new StateListDrawable();
                MaterialShapeDrawable materialShapeDrawable = new MaterialShapeDrawable(this.m);
                this.f68325q = materialShapeDrawable;
                materialShapeDrawable.setFillColor(this.f68320k);
                stateListDrawable.addState(new int[]{android.R.attr.state_pressed}, this.f68325q);
                rippleDrawable = stateListDrawable;
            }
            this.f68323o = rippleDrawable;
        }
        if (this.f68324p == null) {
            LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{this.f68323o, this.f68313d, this.f68319j});
            this.f68324p = layerDrawable;
            layerDrawable.setId(2, R.id.mtrl_card_checked_layer_id);
        }
        return this.f68324p;
    }

    @NonNull
    public final a d(Drawable drawable) {
        int iCeil;
        int i10;
        MaterialCardView materialCardView = this.f68310a;
        if (materialCardView.getUseCompatPadding()) {
            int iCeil2 = (int) Math.ceil((materialCardView.getMaxCardElevation() * 1.5f) + (i() ? a() : 0.0f));
            iCeil = (int) Math.ceil(materialCardView.getMaxCardElevation() + (i() ? a() : 0.0f));
            i10 = iCeil2;
        } else {
            iCeil = 0;
            i10 = 0;
        }
        return new a(drawable, iCeil, i10, iCeil, i10);
    }

    public final void e(int i10, int i11) {
        int iCeil;
        int iCeil2;
        int i12;
        int i13;
        if (this.f68324p != null) {
            MaterialCardView materialCardView = this.f68310a;
            if (materialCardView.getUseCompatPadding()) {
                iCeil = (int) Math.ceil(((materialCardView.getMaxCardElevation() * 1.5f) + (i() ? a() : 0.0f)) * 2.0f);
                iCeil2 = (int) Math.ceil((materialCardView.getMaxCardElevation() + (i() ? a() : 0.0f)) * 2.0f);
            } else {
                iCeil = 0;
                iCeil2 = 0;
            }
            int i14 = this.f68316g;
            int i15 = (i14 & GravityCompat.END) == 8388613 ? ((i10 - this.f68314e) - this.f68315f) - iCeil2 : this.f68314e;
            int i16 = (i14 & 80) == 80 ? this.f68314e : ((i11 - this.f68314e) - this.f68315f) - iCeil;
            int i17 = (i14 & GravityCompat.END) == 8388613 ? this.f68314e : ((i10 - this.f68314e) - this.f68315f) - iCeil2;
            int i18 = (i14 & 80) == 80 ? ((i11 - this.f68314e) - this.f68315f) - iCeil : this.f68314e;
            if (ViewCompat.getLayoutDirection(materialCardView) == 1) {
                i13 = i17;
                i12 = i15;
            } else {
                i12 = i17;
                i13 = i15;
            }
            this.f68324p.setLayerInset(2, i13, i18, i12, i16);
        }
    }

    public final void f(boolean z10, boolean z11) {
        Drawable drawable = this.f68319j;
        if (drawable != null) {
            if (!z11) {
                drawable.setAlpha(z10 ? 255 : 0);
                this.f68333y = z10 ? 1.0f : 0.0f;
                return;
            }
            float f6 = z10 ? 1.0f : 0.0f;
            float f10 = z10 ? 1.0f - this.f68333y : this.f68333y;
            ValueAnimator valueAnimator = this.f68329u;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.f68329u = null;
            }
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(this.f68333y, f6);
            this.f68329u = valueAnimatorOfFloat;
            valueAnimatorOfFloat.addUpdateListener(new com.bbva.qr.scanner.views.a(this, 1));
            this.f68329u.setInterpolator(this.f68330v);
            this.f68329u.setDuration((long) ((z10 ? this.f68331w : this.f68332x) * f10));
            this.f68329u.start();
        }
    }

    public final void g(@Nullable Drawable drawable) {
        if (drawable != null) {
            Drawable drawableMutate = DrawableCompat.wrap(drawable).mutate();
            this.f68319j = drawableMutate;
            DrawableCompat.setTintList(drawableMutate, this.f68321l);
            f(this.f68310a.isChecked(), false);
        } else {
            this.f68319j = A;
        }
        LayerDrawable layerDrawable = this.f68324p;
        if (layerDrawable != null) {
            layerDrawable.setDrawableByLayerId(R.id.mtrl_card_checked_layer_id, this.f68319j);
        }
    }

    public final void h(@NonNull ShapeAppearanceModel shapeAppearanceModel) {
        this.m = shapeAppearanceModel;
        MaterialShapeDrawable materialShapeDrawable = this.f68312c;
        materialShapeDrawable.setShapeAppearanceModel(shapeAppearanceModel);
        materialShapeDrawable.setShadowBitmapDrawingEnable(!materialShapeDrawable.isRoundRect());
        MaterialShapeDrawable materialShapeDrawable2 = this.f68313d;
        if (materialShapeDrawable2 != null) {
            materialShapeDrawable2.setShapeAppearanceModel(shapeAppearanceModel);
        }
        MaterialShapeDrawable materialShapeDrawable3 = this.f68326r;
        if (materialShapeDrawable3 != null) {
            materialShapeDrawable3.setShapeAppearanceModel(shapeAppearanceModel);
        }
        MaterialShapeDrawable materialShapeDrawable4 = this.f68325q;
        if (materialShapeDrawable4 != null) {
            materialShapeDrawable4.setShapeAppearanceModel(shapeAppearanceModel);
        }
    }

    public final boolean i() {
        MaterialCardView materialCardView = this.f68310a;
        return materialCardView.getPreventCornerOverlap() && this.f68312c.isRoundRect() && materialCardView.getUseCompatPadding();
    }

    public final boolean j() {
        View view = this.f68310a;
        if (view.isClickable()) {
            return true;
        }
        while (view.isDuplicateParentStateEnabled() && (view.getParent() instanceof View)) {
            view = (View) view.getParent();
        }
        return view.isClickable();
    }

    public final void k() {
        Drawable drawable = this.f68318i;
        Drawable drawableC = j() ? c() : this.f68313d;
        this.f68318i = drawableC;
        if (drawable != drawableC) {
            MaterialCardView materialCardView = this.f68310a;
            if (materialCardView.getForeground() instanceof InsetDrawable) {
                ((InsetDrawable) materialCardView.getForeground()).setDrawable(drawableC);
            } else {
                materialCardView.setForeground(d(drawableC));
            }
        }
    }

    public final void l() {
        MaterialCardView materialCardView = this.f68310a;
        float cardViewRadius = 0.0f;
        float fA = ((materialCardView.getPreventCornerOverlap() && !this.f68312c.isRoundRect()) || i()) ? a() : 0.0f;
        if (materialCardView.getPreventCornerOverlap() && materialCardView.getUseCompatPadding()) {
            cardViewRadius = (float) ((1.0d - f68309z) * ((double) materialCardView.getCardViewRadius()));
        }
        int i10 = (int) (fA - cardViewRadius);
        Rect rect = this.f68311b;
        materialCardView.c(rect.left + i10, rect.top + i10, rect.right + i10, rect.bottom + i10);
    }

    public final void m() {
        boolean z10 = this.f68327s;
        MaterialCardView materialCardView = this.f68310a;
        if (!z10) {
            materialCardView.setBackgroundInternal(d(this.f68312c));
        }
        materialCardView.setForeground(d(this.f68318i));
    }
}

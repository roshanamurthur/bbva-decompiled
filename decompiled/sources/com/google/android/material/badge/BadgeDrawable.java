package com.google.android.material.badge;

import ae.a;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.AttrRes;
import androidx.annotation.ColorInt;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.OptIn;
import androidx.annotation.PluralsRes;
import androidx.annotation.Px;
import androidx.annotation.RestrictTo;
import androidx.annotation.StringRes;
import androidx.annotation.StyleRes;
import androidx.annotation.XmlRes;
import androidx.core.view.ViewCompat;
import com.google.android.material.R;
import com.google.android.material.animation.AnimationUtils;
import com.google.android.material.internal.TextDrawableHelper;
import com.google.android.material.internal.ThemeEnforcement;
import com.google.android.material.resources.MaterialResources;
import com.google.android.material.resources.TextAppearance;
import com.google.android.material.shape.MaterialShapeDrawable;
import com.google.android.material.shape.ShapeAppearanceModel;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.ref.WeakReference;
import java.text.NumberFormat;
import java.util.Locale;

/* JADX INFO: loaded from: classes10.dex */
@OptIn(markerClass = {ExperimentalBadgeUtils.class})
public class BadgeDrawable extends Drawable implements TextDrawableHelper.TextDrawableDelegate {
    public static final int BADGE_CONTENT_NOT_TRUNCATED = -2;

    @Deprecated
    public static final int BOTTOM_END = 8388693;

    @Deprecated
    public static final int BOTTOM_START = 8388691;

    @StyleRes
    public static final int H0 = R.style.Widget_MaterialComponents_Badge;

    @AttrRes
    public static final int I0 = R.attr.badgeStyle;
    public static final int TOP_END = 8388661;
    public static final int TOP_START = 8388659;
    public float E0;

    @Nullable
    public WeakReference<View> F0;

    @Nullable
    public WeakReference<FrameLayout> G0;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    @NonNull
    public final WeakReference<Context> f43956p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    @NonNull
    public final MaterialShapeDrawable f43957q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    @NonNull
    public final TextDrawableHelper f43958r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    @NonNull
    public final Rect f43959s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    @NonNull
    public final BadgeState f43960t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public float f43961u0;
    public float v0;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public int f43962w0;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public float f43963x0;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    public float f43964y0;

    @Retention(RetentionPolicy.SOURCE)
    public @interface BadgeGravity {
    }

    public BadgeDrawable(@NonNull Context context, @XmlRes int i10, @Nullable BadgeState.State state) {
        this.f43956p0 = new WeakReference<>(context);
        ThemeEnforcement.checkMaterialTheme(context);
        this.f43959s0 = new Rect();
        TextDrawableHelper textDrawableHelper = new TextDrawableHelper(this);
        this.f43958r0 = textDrawableHelper;
        textDrawableHelper.getTextPaint().setTextAlign(Paint.Align.CENTER);
        BadgeState badgeState = new BadgeState(context, i10, state);
        this.f43960t0 = badgeState;
        boolean zC = c();
        BadgeState.State state2 = badgeState.f43966b;
        MaterialShapeDrawable materialShapeDrawable = new MaterialShapeDrawable(ShapeAppearanceModel.builder(context, zC ? state2.v0.intValue() : state2.f43980t0.intValue(), c() ? state2.f43982w0.intValue() : state2.f43981u0.intValue()).build());
        this.f43957q0 = materialShapeDrawable;
        f();
        g();
        i();
        d();
        textDrawableHelper.getTextPaint().setAlpha(getAlpha());
        invalidateSelf();
        ColorStateList colorStateListValueOf = ColorStateList.valueOf(state2.f43977q0.intValue());
        if (materialShapeDrawable.getFillColor() != colorStateListValueOf) {
            materialShapeDrawable.setFillColor(colorStateListValueOf);
            invalidateSelf();
        }
        h();
        e();
        k();
        j();
    }

    @NonNull
    public static BadgeDrawable create(@NonNull Context context) {
        return new BadgeDrawable(context, 0, null);
    }

    @NonNull
    public static BadgeDrawable createFromResource(@NonNull Context context, @XmlRes int i10) {
        return new BadgeDrawable(context, i10, null);
    }

    public final void a(@NonNull View view) {
        float y7;
        float x4;
        float height;
        float width;
        View customBadgeParent = getCustomBadgeParent();
        if (customBadgeParent != null) {
            FrameLayout customBadgeParent2 = getCustomBadgeParent();
            if (customBadgeParent2 == null || customBadgeParent2.getId() != R.id.mtrl_anchor_parent) {
                y7 = 0.0f;
                x4 = 0.0f;
            } else {
                if (!(customBadgeParent.getParent() instanceof View)) {
                    return;
                }
                y7 = customBadgeParent.getY();
                x4 = customBadgeParent.getX();
                customBadgeParent = (View) customBadgeParent.getParent();
            }
        } else {
            if (!(view.getParent() instanceof View)) {
                return;
            }
            float y10 = view.getY();
            x4 = view.getX();
            customBadgeParent = (View) view.getParent();
            y7 = y10;
        }
        float y11 = customBadgeParent.getY() + (this.v0 - this.E0) + y7;
        float x6 = customBadgeParent.getX() + (this.f43961u0 - this.f43964y0) + x4;
        if (customBadgeParent.getParent() instanceof View) {
            height = ((this.v0 + this.E0) - (((View) customBadgeParent.getParent()).getHeight() - customBadgeParent.getY())) + y7;
        } else {
            height = 0.0f;
        }
        if (customBadgeParent.getParent() instanceof View) {
            width = ((this.f43961u0 + this.f43964y0) - (((View) customBadgeParent.getParent()).getWidth() - customBadgeParent.getX())) + x4;
        } else {
            width = 0.0f;
        }
        if (y11 < 0.0f) {
            this.v0 = Math.abs(y11) + this.v0;
        }
        if (x6 < 0.0f) {
            this.f43961u0 = Math.abs(x6) + this.f43961u0;
        }
        if (height > 0.0f) {
            this.v0 -= Math.abs(height);
        }
        if (width > 0.0f) {
            this.f43961u0 -= Math.abs(width);
        }
    }

    @Nullable
    public final String b() {
        boolean zHasText = hasText();
        WeakReference<Context> weakReference = this.f43956p0;
        if (!zHasText) {
            if (!hasNumber()) {
                return null;
            }
            int i10 = this.f43962w0;
            BadgeState badgeState = this.f43960t0;
            if (i10 == -2 || getNumber() <= this.f43962w0) {
                return NumberFormat.getInstance(badgeState.f43966b.H0).format(getNumber());
            }
            Context context = weakReference.get();
            return context == null ? "" : String.format(badgeState.f43966b.H0, context.getString(R.string.mtrl_exceed_max_badge_number_suffix), Integer.valueOf(this.f43962w0), "+");
        }
        String text = getText();
        int maxCharacterCount = getMaxCharacterCount();
        if (maxCharacterCount == -2 || text == null || text.length() <= maxCharacterCount) {
            return text;
        }
        Context context2 = weakReference.get();
        if (context2 == null) {
            return "";
        }
        return String.format(context2.getString(R.string.m3_exceed_max_badge_text_suffix), text.substring(0, maxCharacterCount - 1), "…");
    }

    public final boolean c() {
        return hasText() || hasNumber();
    }

    public void clearNumber() {
        BadgeState badgeState = this.f43960t0;
        BadgeState.State state = badgeState.f43966b;
        if (state.E0 != -1) {
            badgeState.f43965a.E0 = -1;
            state.E0 = -1;
            if (hasText()) {
                return;
            }
            d();
        }
    }

    public void clearText() {
        BadgeState badgeState = this.f43960t0;
        BadgeState.State state = badgeState.f43966b;
        if (state.f43984y0 != null) {
            badgeState.f43965a.f43984y0 = null;
            state.f43984y0 = null;
            d();
        }
    }

    public final void d() {
        this.f43958r0.setTextSizeDirty(true);
        f();
        k();
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(@NonNull Canvas canvas) {
        String strB;
        if (getBounds().isEmpty() || getAlpha() == 0 || !isVisible()) {
            return;
        }
        this.f43957q0.draw(canvas);
        if (!c() || (strB = b()) == null) {
            return;
        }
        Rect rect = new Rect();
        TextDrawableHelper textDrawableHelper = this.f43958r0;
        textDrawableHelper.getTextPaint().getTextBounds(strB, 0, strB.length(), rect);
        float fExactCenterY = this.v0 - rect.exactCenterY();
        canvas.drawText(strB, this.f43961u0, rect.bottom <= 0 ? (int) fExactCenterY : Math.round(fExactCenterY), textDrawableHelper.getTextPaint());
    }

    public final void e() {
        WeakReference<View> weakReference = this.F0;
        if (weakReference == null || weakReference.get() == null) {
            return;
        }
        View view = this.F0.get();
        WeakReference<FrameLayout> weakReference2 = this.G0;
        updateBadgeCoordinates(view, weakReference2 != null ? weakReference2.get() : null);
    }

    public final void f() {
        Context context = this.f43956p0.get();
        if (context == null) {
            return;
        }
        boolean zC = c();
        BadgeState badgeState = this.f43960t0;
        this.f43957q0.setShapeAppearanceModel(ShapeAppearanceModel.builder(context, zC ? badgeState.f43966b.v0.intValue() : badgeState.f43966b.f43980t0.intValue(), c() ? badgeState.f43966b.f43982w0.intValue() : badgeState.f43966b.f43981u0.intValue()).build());
        invalidateSelf();
    }

    public final void g() {
        Context context = this.f43956p0.get();
        if (context == null) {
            return;
        }
        TextAppearance textAppearance = new TextAppearance(context, this.f43960t0.f43966b.f43979s0.intValue());
        TextDrawableHelper textDrawableHelper = this.f43958r0;
        if (textDrawableHelper.getTextAppearance() == textAppearance) {
            return;
        }
        textDrawableHelper.setTextAppearance(textAppearance, context);
        h();
        k();
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.f43960t0.f43966b.f43983x0;
    }

    @ColorInt
    public int getBackgroundColor() {
        return this.f43957q0.getFillColor().getDefaultColor();
    }

    public int getBadgeGravity() {
        return this.f43960t0.f43966b.M0.intValue();
    }

    @NonNull
    public Locale getBadgeNumberLocale() {
        return this.f43960t0.f43966b.H0;
    }

    @ColorInt
    public int getBadgeTextColor() {
        return this.f43958r0.getTextPaint().getColor();
    }

    @Nullable
    public CharSequence getContentDescription() {
        Context context;
        if (!isVisible()) {
            return null;
        }
        boolean zHasText = hasText();
        BadgeState badgeState = this.f43960t0;
        if (zHasText) {
            CharSequence charSequence = badgeState.f43966b.I0;
            return charSequence != null ? charSequence : getText();
        }
        if (!hasNumber()) {
            return badgeState.f43966b.J0;
        }
        if (badgeState.f43966b.K0 == 0 || (context = this.f43956p0.get()) == null) {
            return null;
        }
        int i10 = this.f43962w0;
        BadgeState.State state = badgeState.f43966b;
        if (i10 != -2) {
            int number = getNumber();
            int i11 = this.f43962w0;
            if (number > i11) {
                return context.getString(state.L0, Integer.valueOf(i11));
            }
        }
        return context.getResources().getQuantityString(state.K0, getNumber(), Integer.valueOf(getNumber()));
    }

    @Nullable
    public FrameLayout getCustomBadgeParent() {
        WeakReference<FrameLayout> weakReference = this.G0;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    public int getHorizontalOffset() {
        return this.f43960t0.f43966b.Q0.intValue();
    }

    @Px
    public int getHorizontalOffsetWithText() {
        return this.f43960t0.f43966b.S0.intValue();
    }

    @Px
    public int getHorizontalOffsetWithoutText() {
        return this.f43960t0.f43966b.Q0.intValue();
    }

    @Px
    public int getHorizontalPadding() {
        return this.f43960t0.f43966b.O0.intValue();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return this.f43959s0.height();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return this.f43959s0.width();
    }

    @Px
    public int getLargeFontVerticalOffsetAdjustment() {
        return this.f43960t0.f43966b.W0.intValue();
    }

    public int getMaxCharacterCount() {
        return this.f43960t0.f43966b.F0;
    }

    public int getMaxNumber() {
        return this.f43960t0.f43966b.G0;
    }

    public int getNumber() {
        int i10 = this.f43960t0.f43966b.E0;
        if (i10 != -1) {
            return i10;
        }
        return 0;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Nullable
    public String getText() {
        return this.f43960t0.f43966b.f43984y0;
    }

    public int getVerticalOffset() {
        return this.f43960t0.f43966b.R0.intValue();
    }

    @Px
    public int getVerticalOffsetWithText() {
        return this.f43960t0.f43966b.T0.intValue();
    }

    @Px
    public int getVerticalOffsetWithoutText() {
        return this.f43960t0.f43966b.R0.intValue();
    }

    @Px
    public int getVerticalPadding() {
        return this.f43960t0.f43966b.P0.intValue();
    }

    public final void h() {
        this.f43958r0.getTextPaint().setColor(this.f43960t0.f43966b.f43978r0.intValue());
        invalidateSelf();
    }

    public boolean hasNumber() {
        BadgeState.State state = this.f43960t0.f43966b;
        return state.f43984y0 == null && state.E0 != -1;
    }

    public boolean hasText() {
        return this.f43960t0.f43966b.f43984y0 != null;
    }

    public final void i() {
        if (getMaxCharacterCount() != -2) {
            this.f43962w0 = ((int) Math.pow(10.0d, ((double) getMaxCharacterCount()) - 1.0d)) - 1;
        } else {
            this.f43962w0 = getMaxNumber();
        }
        this.f43958r0.setTextSizeDirty(true);
        k();
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        return false;
    }

    public final void j() {
        boolean zBooleanValue = this.f43960t0.f43966b.N0.booleanValue();
        setVisible(zBooleanValue, false);
        if (!BadgeUtils.USE_COMPAT_PARENT || getCustomBadgeParent() == null || zBooleanValue) {
            return;
        }
        ((ViewGroup) getCustomBadgeParent().getParent()).invalidate();
    }

    public final void k() {
        WeakReference<Context> weakReference = this.f43956p0;
        Context context = weakReference.get();
        WeakReference<View> weakReference2 = this.F0;
        View view = weakReference2 != null ? weakReference2.get() : null;
        if (context == null || view == null) {
            return;
        }
        Rect rect = new Rect();
        Rect rect2 = this.f43959s0;
        rect.set(rect2);
        Rect rect3 = new Rect();
        view.getDrawingRect(rect3);
        WeakReference<FrameLayout> weakReference3 = this.G0;
        FrameLayout frameLayout = weakReference3 != null ? weakReference3.get() : null;
        if (frameLayout != null || BadgeUtils.USE_COMPAT_PARENT) {
            if (frameLayout == null) {
                frameLayout = (ViewGroup) view.getParent();
            }
            frameLayout.offsetDescendantRectToMyCoords(view, rect3);
        }
        boolean zC = c();
        BadgeState badgeState = this.f43960t0;
        float f6 = zC ? badgeState.f43968d : badgeState.f43967c;
        this.f43963x0 = f6;
        if (f6 != -1.0f) {
            this.f43964y0 = f6;
            this.E0 = f6;
        } else {
            this.f43964y0 = Math.round((c() ? badgeState.f43971g : badgeState.f43969e) / 2.0f);
            this.E0 = Math.round((c() ? badgeState.f43972h : badgeState.f43970f) / 2.0f);
        }
        if (c()) {
            String strB = b();
            float f10 = this.f43964y0;
            TextDrawableHelper textDrawableHelper = this.f43958r0;
            this.f43964y0 = Math.max(f10, (textDrawableHelper.getTextWidth(strB) / 2.0f) + badgeState.f43966b.O0.intValue());
            float fMax = Math.max(this.E0, (textDrawableHelper.getTextHeight(strB) / 2.0f) + badgeState.f43966b.P0.intValue());
            this.E0 = fMax;
            this.f43964y0 = Math.max(this.f43964y0, fMax);
        }
        int iIntValue = badgeState.f43966b.R0.intValue();
        boolean zC2 = c();
        BadgeState.State state = badgeState.f43966b;
        if (zC2) {
            iIntValue = state.T0.intValue();
            Context context2 = weakReference.get();
            if (context2 != null) {
                iIntValue = AnimationUtils.lerp(iIntValue, iIntValue - state.W0.intValue(), AnimationUtils.lerp(0.0f, 1.0f, 0.3f, 1.0f, MaterialResources.getFontScale(context2) - 1.0f));
            }
        }
        int i10 = badgeState.f43975k;
        if (i10 == 0) {
            iIntValue -= Math.round(this.E0);
        }
        int iIntValue2 = state.V0.intValue() + iIntValue;
        int iIntValue3 = state.M0.intValue();
        if (iIntValue3 == 8388691 || iIntValue3 == 8388693) {
            this.v0 = rect3.bottom - iIntValue2;
        } else {
            this.v0 = rect3.top + iIntValue2;
        }
        int iIntValue4 = c() ? state.S0.intValue() : state.Q0.intValue();
        if (i10 == 1) {
            iIntValue4 += c() ? badgeState.f43974j : badgeState.f43973i;
        }
        int iIntValue5 = state.U0.intValue() + iIntValue4;
        int iIntValue6 = state.M0.intValue();
        if (iIntValue6 == 8388659 || iIntValue6 == 8388691) {
            this.f43961u0 = ViewCompat.getLayoutDirection(view) == 0 ? (rect3.left - this.f43964y0) + iIntValue5 : (rect3.right + this.f43964y0) - iIntValue5;
        } else {
            this.f43961u0 = ViewCompat.getLayoutDirection(view) == 0 ? (rect3.right + this.f43964y0) - iIntValue5 : (rect3.left - this.f43964y0) + iIntValue5;
        }
        if (state.X0.booleanValue()) {
            a(view);
        }
        BadgeUtils.updateBadgeBounds(rect2, this.f43961u0, this.v0, this.f43964y0, this.E0);
        float f11 = this.f43963x0;
        MaterialShapeDrawable materialShapeDrawable = this.f43957q0;
        if (f11 != -1.0f) {
            materialShapeDrawable.setCornerSize(f11);
        }
        if (rect.equals(rect2)) {
            return;
        }
        materialShapeDrawable.setBounds(rect2);
    }

    @Override // android.graphics.drawable.Drawable, com.google.android.material.internal.TextDrawableHelper.TextDrawableDelegate
    public boolean onStateChange(int[] iArr) {
        return super.onStateChange(iArr);
    }

    @Override // com.google.android.material.internal.TextDrawableHelper.TextDrawableDelegate
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public void onTextSizeChange() {
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i10) {
        BadgeState badgeState = this.f43960t0;
        badgeState.f43965a.f43983x0 = i10;
        badgeState.f43966b.f43983x0 = i10;
        this.f43958r0.getTextPaint().setAlpha(getAlpha());
        invalidateSelf();
    }

    public void setAutoAdjustToWithinGrandparentBounds(boolean z10) {
        BadgeState badgeState = this.f43960t0;
        if (badgeState.f43966b.X0.booleanValue() == z10) {
            return;
        }
        badgeState.f43965a.X0 = Boolean.valueOf(z10);
        badgeState.f43966b.X0 = Boolean.valueOf(z10);
        WeakReference<View> weakReference = this.F0;
        if (weakReference == null || weakReference.get() == null) {
            return;
        }
        a(this.F0.get());
    }

    public void setBackgroundColor(@ColorInt int i10) {
        Integer numValueOf = Integer.valueOf(i10);
        BadgeState badgeState = this.f43960t0;
        badgeState.f43965a.f43977q0 = numValueOf;
        badgeState.f43966b.f43977q0 = Integer.valueOf(i10);
        ColorStateList colorStateListValueOf = ColorStateList.valueOf(badgeState.f43966b.f43977q0.intValue());
        MaterialShapeDrawable materialShapeDrawable = this.f43957q0;
        if (materialShapeDrawable.getFillColor() != colorStateListValueOf) {
            materialShapeDrawable.setFillColor(colorStateListValueOf);
            invalidateSelf();
        }
    }

    public void setBadgeGravity(int i10) {
        if (i10 == 8388691 || i10 == 8388693) {
            Log.w("Badge", "Bottom badge gravities are deprecated; please use a top gravity instead.");
        }
        BadgeState badgeState = this.f43960t0;
        if (badgeState.f43966b.M0.intValue() != i10) {
            badgeState.f43965a.M0 = Integer.valueOf(i10);
            badgeState.f43966b.M0 = Integer.valueOf(i10);
            e();
        }
    }

    public void setBadgeNumberLocale(@NonNull Locale locale) {
        BadgeState badgeState = this.f43960t0;
        if (locale.equals(badgeState.f43966b.H0)) {
            return;
        }
        badgeState.f43965a.H0 = locale;
        badgeState.f43966b.H0 = locale;
        invalidateSelf();
    }

    public void setBadgeTextColor(@ColorInt int i10) {
        if (this.f43958r0.getTextPaint().getColor() != i10) {
            Integer numValueOf = Integer.valueOf(i10);
            BadgeState badgeState = this.f43960t0;
            badgeState.f43965a.f43978r0 = numValueOf;
            badgeState.f43966b.f43978r0 = Integer.valueOf(i10);
            h();
        }
    }

    public void setBadgeWithTextShapeAppearance(@StyleRes int i10) {
        Integer numValueOf = Integer.valueOf(i10);
        BadgeState badgeState = this.f43960t0;
        badgeState.f43965a.v0 = numValueOf;
        badgeState.f43966b.v0 = Integer.valueOf(i10);
        f();
    }

    public void setBadgeWithTextShapeAppearanceOverlay(@StyleRes int i10) {
        Integer numValueOf = Integer.valueOf(i10);
        BadgeState badgeState = this.f43960t0;
        badgeState.f43965a.f43982w0 = numValueOf;
        badgeState.f43966b.f43982w0 = Integer.valueOf(i10);
        f();
    }

    public void setBadgeWithoutTextShapeAppearance(@StyleRes int i10) {
        Integer numValueOf = Integer.valueOf(i10);
        BadgeState badgeState = this.f43960t0;
        badgeState.f43965a.f43980t0 = numValueOf;
        badgeState.f43966b.f43980t0 = Integer.valueOf(i10);
        f();
    }

    public void setBadgeWithoutTextShapeAppearanceOverlay(@StyleRes int i10) {
        Integer numValueOf = Integer.valueOf(i10);
        BadgeState badgeState = this.f43960t0;
        badgeState.f43965a.f43981u0 = numValueOf;
        badgeState.f43966b.f43981u0 = Integer.valueOf(i10);
        f();
    }

    public void setContentDescriptionExceedsMaxBadgeNumberStringResource(@StringRes int i10) {
        BadgeState badgeState = this.f43960t0;
        badgeState.f43965a.L0 = i10;
        badgeState.f43966b.L0 = i10;
    }

    public void setContentDescriptionForText(@Nullable CharSequence charSequence) {
        BadgeState badgeState = this.f43960t0;
        badgeState.f43965a.I0 = charSequence;
        badgeState.f43966b.I0 = charSequence;
    }

    public void setContentDescriptionNumberless(CharSequence charSequence) {
        BadgeState badgeState = this.f43960t0;
        badgeState.f43965a.J0 = charSequence;
        badgeState.f43966b.J0 = charSequence;
    }

    public void setContentDescriptionQuantityStringsResource(@PluralsRes int i10) {
        BadgeState badgeState = this.f43960t0;
        badgeState.f43965a.K0 = i10;
        badgeState.f43966b.K0 = i10;
    }

    public void setHorizontalOffset(int i10) {
        setHorizontalOffsetWithoutText(i10);
        setHorizontalOffsetWithText(i10);
    }

    public void setHorizontalOffsetWithText(@Px int i10) {
        Integer numValueOf = Integer.valueOf(i10);
        BadgeState badgeState = this.f43960t0;
        badgeState.f43965a.S0 = numValueOf;
        badgeState.f43966b.S0 = Integer.valueOf(i10);
        k();
    }

    public void setHorizontalOffsetWithoutText(@Px int i10) {
        Integer numValueOf = Integer.valueOf(i10);
        BadgeState badgeState = this.f43960t0;
        badgeState.f43965a.Q0 = numValueOf;
        badgeState.f43966b.Q0 = Integer.valueOf(i10);
        k();
    }

    public void setHorizontalPadding(@Px int i10) {
        BadgeState badgeState = this.f43960t0;
        if (i10 != badgeState.f43966b.O0.intValue()) {
            badgeState.f43965a.O0 = Integer.valueOf(i10);
            badgeState.f43966b.O0 = Integer.valueOf(i10);
            k();
        }
    }

    public void setLargeFontVerticalOffsetAdjustment(@Px int i10) {
        Integer numValueOf = Integer.valueOf(i10);
        BadgeState badgeState = this.f43960t0;
        badgeState.f43965a.W0 = numValueOf;
        badgeState.f43966b.W0 = Integer.valueOf(i10);
        k();
    }

    public void setMaxCharacterCount(int i10) {
        BadgeState badgeState = this.f43960t0;
        BadgeState.State state = badgeState.f43966b;
        if (state.F0 != i10) {
            badgeState.f43965a.F0 = i10;
            state.F0 = i10;
            i();
        }
    }

    public void setMaxNumber(int i10) {
        BadgeState badgeState = this.f43960t0;
        BadgeState.State state = badgeState.f43966b;
        if (state.G0 != i10) {
            badgeState.f43965a.G0 = i10;
            state.G0 = i10;
            i();
        }
    }

    public void setNumber(int i10) {
        int iMax = Math.max(0, i10);
        BadgeState badgeState = this.f43960t0;
        BadgeState.State state = badgeState.f43966b;
        if (state.E0 != iMax) {
            badgeState.f43965a.E0 = iMax;
            state.E0 = iMax;
            if (hasText()) {
                return;
            }
            d();
        }
    }

    public void setText(@Nullable String str) {
        BadgeState badgeState = this.f43960t0;
        if (TextUtils.equals(badgeState.f43966b.f43984y0, str)) {
            return;
        }
        badgeState.f43965a.f43984y0 = str;
        badgeState.f43966b.f43984y0 = str;
        d();
    }

    public void setTextAppearance(@StyleRes int i10) {
        Integer numValueOf = Integer.valueOf(i10);
        BadgeState badgeState = this.f43960t0;
        badgeState.f43965a.f43979s0 = numValueOf;
        badgeState.f43966b.f43979s0 = Integer.valueOf(i10);
        g();
    }

    public void setVerticalOffset(int i10) {
        setVerticalOffsetWithoutText(i10);
        setVerticalOffsetWithText(i10);
    }

    public void setVerticalOffsetWithText(@Px int i10) {
        Integer numValueOf = Integer.valueOf(i10);
        BadgeState badgeState = this.f43960t0;
        badgeState.f43965a.T0 = numValueOf;
        badgeState.f43966b.T0 = Integer.valueOf(i10);
        k();
    }

    public void setVerticalOffsetWithoutText(@Px int i10) {
        Integer numValueOf = Integer.valueOf(i10);
        BadgeState badgeState = this.f43960t0;
        badgeState.f43965a.R0 = numValueOf;
        badgeState.f43966b.R0 = Integer.valueOf(i10);
        k();
    }

    public void setVerticalPadding(@Px int i10) {
        BadgeState badgeState = this.f43960t0;
        if (i10 != badgeState.f43966b.P0.intValue()) {
            badgeState.f43965a.P0 = Integer.valueOf(i10);
            badgeState.f43966b.P0 = Integer.valueOf(i10);
            k();
        }
    }

    public void setVisible(boolean z10) {
        Boolean boolValueOf = Boolean.valueOf(z10);
        BadgeState badgeState = this.f43960t0;
        badgeState.f43965a.N0 = boolValueOf;
        badgeState.f43966b.N0 = Boolean.valueOf(z10);
        j();
    }

    @Deprecated
    public void updateBadgeCoordinates(@NonNull View view, @Nullable ViewGroup viewGroup) {
        if (!(viewGroup instanceof FrameLayout)) {
            throw new IllegalArgumentException("customBadgeParent must be a FrameLayout");
        }
        updateBadgeCoordinates(view, (FrameLayout) viewGroup);
    }

    public void updateBadgeCoordinates(@NonNull View view) {
        updateBadgeCoordinates(view, (FrameLayout) null);
    }

    public void updateBadgeCoordinates(@NonNull View view, @Nullable FrameLayout frameLayout) {
        WeakReference<FrameLayout> weakReference;
        this.F0 = new WeakReference<>(view);
        boolean z10 = BadgeUtils.USE_COMPAT_PARENT;
        if (z10 && frameLayout == null) {
            ViewGroup viewGroup = (ViewGroup) view.getParent();
            if ((viewGroup == null || viewGroup.getId() != R.id.mtrl_anchor_parent) && ((weakReference = this.G0) == null || weakReference.get() != viewGroup)) {
                ViewGroup viewGroup2 = (ViewGroup) view.getParent();
                viewGroup2.setClipChildren(false);
                viewGroup2.setClipToPadding(false);
                FrameLayout frameLayout2 = new FrameLayout(view.getContext());
                frameLayout2.setId(R.id.mtrl_anchor_parent);
                frameLayout2.setClipChildren(false);
                frameLayout2.setClipToPadding(false);
                frameLayout2.setLayoutParams(view.getLayoutParams());
                frameLayout2.setMinimumWidth(view.getWidth());
                frameLayout2.setMinimumHeight(view.getHeight());
                int iIndexOfChild = viewGroup.indexOfChild(view);
                viewGroup.removeViewAt(iIndexOfChild);
                view.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
                frameLayout2.addView(view);
                viewGroup.addView(frameLayout2, iIndexOfChild);
                this.G0 = new WeakReference<>(frameLayout2);
                frameLayout2.post(new a(this, view, frameLayout2));
            }
        } else {
            this.G0 = new WeakReference<>(frameLayout);
        }
        if (!z10) {
            ViewGroup viewGroup3 = (ViewGroup) view.getParent();
            viewGroup3.setClipChildren(false);
            viewGroup3.setClipToPadding(false);
        }
        k();
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
    }
}

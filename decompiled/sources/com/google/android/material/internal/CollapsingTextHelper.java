package com.google.android.material.internal;

import android.animation.TimeInterpolator;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.os.Build;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.View;
import androidx.annotation.ColorInt;
import androidx.annotation.FloatRange;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.core.math.MathUtils;
import androidx.core.text.TextDirectionHeuristicsCompat;
import androidx.core.util.Preconditions;
import androidx.core.view.GravityCompat;
import androidx.core.view.ViewCompat;
import com.google.android.material.animation.AnimationUtils;
import com.google.android.material.color.MaterialColors;
import com.google.android.material.resources.CancelableFontCallback;
import com.google.android.material.resources.TextAppearance;
import com.google.android.material.resources.TypefaceUtils;

/* JADX INFO: loaded from: classes10.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public final class CollapsingTextHelper {
    public Typeface A;
    public Typeface B;
    public Typeface C;
    public CancelableFontCallback D;
    public CancelableFontCallback E;

    @Nullable
    public CharSequence G;

    @Nullable
    public CharSequence H;
    public boolean I;

    @Nullable
    public Bitmap K;
    public float L;
    public float M;
    public float N;
    public float O;
    public float P;
    public int Q;
    public int[] R;
    public boolean S;

    @NonNull
    public final TextPaint T;

    @NonNull
    public final TextPaint U;
    public TimeInterpolator V;
    public TimeInterpolator W;
    public float X;
    public float Y;
    public float Z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final View f44782a;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public ColorStateList f44783a0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public float f44784b;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public float f44785b0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f44786c;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public float f44787c0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public float f44788d;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public float f44789d0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public float f44790e;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public ColorStateList f44791e0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f44792f;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public float f44793f0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NonNull
    public final Rect f44794g;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    public float f44795g0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NonNull
    public final Rect f44796h;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public float f44797h0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NonNull
    public final RectF f44798i;
    public StaticLayout i0;

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    public float f44800j0;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public float f44802k0;

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    public float f44804l0;

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    public CharSequence f44805m0;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public ColorStateList f44806n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public ColorStateList f44807o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f44809p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public float f44811q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public float f44813r;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    @Nullable
    public StaticLayoutBuilderConfigurer f44814r0;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public float f44815s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public float f44816t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public float f44817u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public float f44818v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public Typeface f44819w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public Typeface f44820x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public Typeface f44821y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public Typeface f44822z;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f44799j = 16;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f44801k = 16;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public float f44803l = 15.0f;
    public float m = 15.0f;
    public TextUtils.TruncateAt F = TextUtils.TruncateAt.END;
    public boolean J = true;
    public int n0 = 1;

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    public float f44808o0 = 0.0f;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public float f44810p0 = 1.0f;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public int f44812q0 = 1;

    public class a implements CancelableFontCallback.ApplyFont {
        public a() {
        }

        @Override // com.google.android.material.resources.CancelableFontCallback.ApplyFont
        public final void apply(Typeface typeface) {
            CollapsingTextHelper.this.setCollapsedTypeface(typeface);
        }
    }

    public class b implements CancelableFontCallback.ApplyFont {
        public b() {
        }

        @Override // com.google.android.material.resources.CancelableFontCallback.ApplyFont
        public final void apply(Typeface typeface) {
            CollapsingTextHelper.this.setExpandedTypeface(typeface);
        }
    }

    public CollapsingTextHelper(View view) {
        this.f44782a = view;
        TextPaint textPaint = new TextPaint(129);
        this.T = textPaint;
        this.U = new TextPaint(textPaint);
        this.f44796h = new Rect();
        this.f44794g = new Rect();
        this.f44798i = new RectF();
        float f6 = this.f44788d;
        this.f44790e = androidx.datastore.preferences.protobuf.e.a(1.0f, f6, 0.5f, f6);
        maybeUpdateFontWeightAdjustment(view.getContext().getResources().getConfiguration());
    }

    @ColorInt
    public static int a(@ColorInt int i10, @ColorInt int i11, @FloatRange(from = 0.0d, to = 1.0d) float f6) {
        float f10 = 1.0f - f6;
        return Color.argb(Math.round((Color.alpha(i11) * f6) + (Color.alpha(i10) * f10)), Math.round((Color.red(i11) * f6) + (Color.red(i10) * f10)), Math.round((Color.green(i11) * f6) + (Color.green(i10) * f10)), Math.round((Color.blue(i11) * f6) + (Color.blue(i10) * f10)));
    }

    public static float e(float f6, float f10, float f11, @Nullable TimeInterpolator timeInterpolator) {
        if (timeInterpolator != null) {
            f11 = timeInterpolator.getInterpolation(f11);
        }
        return AnimationUtils.lerp(f6, f10, f11);
    }

    public final boolean b(@NonNull CharSequence charSequence) {
        boolean z10 = ViewCompat.getLayoutDirection(this.f44782a) == 1;
        if (this.J) {
            return (z10 ? TextDirectionHeuristicsCompat.FIRSTSTRONG_RTL : TextDirectionHeuristicsCompat.FIRSTSTRONG_LTR).isRtl(charSequence, 0, charSequence.length());
        }
        return z10;
    }

    public final void c(float f6, boolean z10) {
        float f10;
        float f11;
        Typeface typeface;
        boolean z11;
        Layout.Alignment alignment;
        if (this.G == null) {
            return;
        }
        float fWidth = this.f44796h.width();
        float fWidth2 = this.f44794g.width();
        if (Math.abs(f6 - 1.0f) < 1.0E-5f) {
            f10 = this.m;
            f11 = this.f44793f0;
            this.L = 1.0f;
            typeface = this.f44819w;
        } else {
            float f12 = this.f44803l;
            float f13 = this.f44795g0;
            Typeface typeface2 = this.f44822z;
            if (Math.abs(f6 - 0.0f) < 1.0E-5f) {
                this.L = 1.0f;
            } else {
                this.L = e(this.f44803l, this.m, f6, this.W) / this.f44803l;
            }
            float f14 = this.m / this.f44803l;
            fWidth = (z10 || this.f44786c || fWidth2 * f14 <= fWidth) ? fWidth2 : Math.min(fWidth / f14, fWidth2);
            f10 = f12;
            f11 = f13;
            typeface = typeface2;
        }
        TextPaint textPaint = this.T;
        if (fWidth > 0.0f) {
            boolean z12 = this.M != f10;
            boolean z13 = this.f44797h0 != f11;
            boolean z14 = this.C != typeface;
            StaticLayout staticLayout = this.i0;
            boolean z15 = z12 || z13 || (staticLayout != null && (fWidth > ((float) staticLayout.getWidth()) ? 1 : (fWidth == ((float) staticLayout.getWidth()) ? 0 : -1)) != 0) || z14 || this.S;
            this.M = f10;
            this.f44797h0 = f11;
            this.C = typeface;
            this.S = false;
            textPaint.setLinearText(this.L != 1.0f);
            z11 = z15;
        } else {
            z11 = false;
        }
        if (this.H == null || z11) {
            textPaint.setTextSize(this.M);
            textPaint.setTypeface(this.C);
            textPaint.setLetterSpacing(this.f44797h0);
            boolean zB = b(this.G);
            this.I = zB;
            int i10 = this.n0;
            if (i10 <= 1 || (zB && !this.f44786c)) {
                i10 = 1;
            }
            if (i10 == 1) {
                alignment = Layout.Alignment.ALIGN_NORMAL;
            } else {
                int absoluteGravity = GravityCompat.getAbsoluteGravity(this.f44799j, zB ? 1 : 0) & 7;
                if (absoluteGravity == 1) {
                    alignment = Layout.Alignment.ALIGN_CENTER;
                } else if (absoluteGravity != 5) {
                    alignment = this.I ? Layout.Alignment.ALIGN_OPPOSITE : Layout.Alignment.ALIGN_NORMAL;
                } else {
                    alignment = this.I ? Layout.Alignment.ALIGN_NORMAL : Layout.Alignment.ALIGN_OPPOSITE;
                }
            }
            d dVar = new d(this.G, textPaint, (int) fWidth);
            dVar.f44922l = this.F;
            dVar.f44921k = zB;
            dVar.f44915e = alignment;
            dVar.f44920j = false;
            dVar.f44916f = i10;
            float f15 = this.f44808o0;
            float f16 = this.f44810p0;
            dVar.f44917g = f15;
            dVar.f44918h = f16;
            dVar.f44919i = this.f44812q0;
            dVar.m = this.f44814r0;
            StaticLayout staticLayout2 = (StaticLayout) Preconditions.checkNotNull(dVar.a());
            this.i0 = staticLayout2;
            this.H = staticLayout2.getText();
        }
    }

    @ColorInt
    public final int d(@Nullable ColorStateList colorStateList) {
        if (colorStateList == null) {
            return 0;
        }
        int[] iArr = this.R;
        return iArr != null ? colorStateList.getColorForState(iArr, 0) : colorStateList.getDefaultColor();
    }

    public void draw(@NonNull Canvas canvas) {
        int iSave = canvas.save();
        if (this.H != null) {
            RectF rectF = this.f44798i;
            if (rectF.width() <= 0.0f || rectF.height() <= 0.0f) {
                return;
            }
            TextPaint textPaint = this.T;
            textPaint.setTextSize(this.M);
            float f6 = this.f44817u;
            float f10 = this.f44818v;
            float f11 = this.L;
            if (f11 != 1.0f && !this.f44786c) {
                canvas.scale(f11, f11, f6, f10);
            }
            if (this.n0 <= 1 || ((this.I && !this.f44786c) || (this.f44786c && this.f44784b <= this.f44790e))) {
                canvas.translate(f6, f10);
                this.i0.draw(canvas);
            } else {
                float lineStart = this.f44817u - this.i0.getLineStart(0);
                int alpha = textPaint.getAlpha();
                canvas.translate(lineStart, f10);
                if (!this.f44786c) {
                    textPaint.setAlpha((int) (this.f44804l0 * alpha));
                    if (Build.VERSION.SDK_INT >= 31) {
                        textPaint.setShadowLayer(this.N, this.O, this.P, MaterialColors.compositeARGBWithAlpha(this.Q, textPaint.getAlpha()));
                    }
                    this.i0.draw(canvas);
                }
                if (!this.f44786c) {
                    textPaint.setAlpha((int) (this.f44802k0 * alpha));
                }
                int i10 = Build.VERSION.SDK_INT;
                if (i10 >= 31) {
                    textPaint.setShadowLayer(this.N, this.O, this.P, MaterialColors.compositeARGBWithAlpha(this.Q, textPaint.getAlpha()));
                }
                int lineBaseline = this.i0.getLineBaseline(0);
                CharSequence charSequence = this.f44805m0;
                float f12 = lineBaseline;
                canvas.drawText(charSequence, 0, charSequence.length(), 0.0f, f12, textPaint);
                if (i10 >= 31) {
                    textPaint.setShadowLayer(this.N, this.O, this.P, this.Q);
                }
                if (!this.f44786c) {
                    String strTrim = this.f44805m0.toString().trim();
                    if (strTrim.endsWith("…")) {
                        strTrim = androidx.databinding.e.c(strTrim, 1, 0);
                    }
                    String str = strTrim;
                    textPaint.setAlpha(alpha);
                    canvas.drawText(str, 0, Math.min(this.i0.getLineEnd(0), str.length()), 0.0f, f12, (Paint) textPaint);
                }
            }
            canvas.restoreToCount(iSave);
        }
    }

    public final boolean f(Typeface typeface) {
        CancelableFontCallback cancelableFontCallback = this.E;
        if (cancelableFontCallback != null) {
            cancelableFontCallback.cancel();
        }
        if (this.f44821y == typeface) {
            return false;
        }
        this.f44821y = typeface;
        Typeface typefaceMaybeCopyWithFontWeightAdjustment = TypefaceUtils.maybeCopyWithFontWeightAdjustment(this.f44782a.getContext().getResources().getConfiguration(), typeface);
        this.f44820x = typefaceMaybeCopyWithFontWeightAdjustment;
        if (typefaceMaybeCopyWithFontWeightAdjustment == null) {
            typefaceMaybeCopyWithFontWeightAdjustment = this.f44821y;
        }
        this.f44819w = typefaceMaybeCopyWithFontWeightAdjustment;
        return true;
    }

    public final boolean g(Typeface typeface) {
        CancelableFontCallback cancelableFontCallback = this.D;
        if (cancelableFontCallback != null) {
            cancelableFontCallback.cancel();
        }
        if (this.B == typeface) {
            return false;
        }
        this.B = typeface;
        Typeface typefaceMaybeCopyWithFontWeightAdjustment = TypefaceUtils.maybeCopyWithFontWeightAdjustment(this.f44782a.getContext().getResources().getConfiguration(), typeface);
        this.A = typefaceMaybeCopyWithFontWeightAdjustment;
        if (typefaceMaybeCopyWithFontWeightAdjustment == null) {
            typefaceMaybeCopyWithFontWeightAdjustment = this.B;
        }
        this.f44822z = typefaceMaybeCopyWithFontWeightAdjustment;
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:40:0x0076  */
    public void getCollapsedTextActualBounds(@NonNull RectF rectF, int i10, int i11) {
        float f6;
        float f10;
        float f11;
        float f12;
        int i12;
        int i13;
        boolean zB = b(this.G);
        this.I = zB;
        Rect rect = this.f44796h;
        if (i11 != 17 && (i11 & 7) != 1) {
            if ((i11 & GravityCompat.END) == 8388613 || (i11 & 5) == 5) {
                if (zB) {
                    i13 = rect.left;
                    f11 = i13;
                } else {
                    f6 = rect.right;
                    f10 = this.f44800j0;
                }
            } else if (zB) {
                f6 = rect.right;
                f10 = this.f44800j0;
            } else {
                i13 = rect.left;
                f11 = i13;
            }
            float fMax = Math.max(f11, rect.left);
            rectF.left = fMax;
            rectF.top = rect.top;
            if (i11 != 17 || (i11 & 7) == 1) {
                f12 = (i10 / 2.0f) + (this.f44800j0 / 2.0f);
            } else if ((i11 & GravityCompat.END) == 8388613 || (i11 & 5) == 5) {
                if (this.I) {
                    f12 = fMax + this.f44800j0;
                } else {
                    i12 = rect.right;
                    f12 = i12;
                }
            } else if (this.I) {
                i12 = rect.right;
                f12 = i12;
            } else {
                f12 = this.f44800j0 + fMax;
            }
            rectF.right = Math.min(f12, rect.right);
            rectF.bottom = getCollapsedTextHeight() + rect.top;
        }
        f6 = i10 / 2.0f;
        f10 = this.f44800j0 / 2.0f;
        f11 = f6 - f10;
        float fMax2 = Math.max(f11, rect.left);
        rectF.left = fMax2;
        rectF.top = rect.top;
        if (i11 != 17) {
            f12 = (i10 / 2.0f) + (this.f44800j0 / 2.0f);
        } else {
            f12 = (i10 / 2.0f) + (this.f44800j0 / 2.0f);
        }
        rectF.right = Math.min(f12, rect.right);
        rectF.bottom = getCollapsedTextHeight() + rect.top;
    }

    public ColorStateList getCollapsedTextColor() {
        return this.f44807o;
    }

    public int getCollapsedTextGravity() {
        return this.f44801k;
    }

    public float getCollapsedTextHeight() {
        TextPaint textPaint = this.U;
        textPaint.setTextSize(this.m);
        textPaint.setTypeface(this.f44819w);
        textPaint.setLetterSpacing(this.f44793f0);
        return -textPaint.ascent();
    }

    public float getCollapsedTextSize() {
        return this.m;
    }

    public Typeface getCollapsedTypeface() {
        Typeface typeface = this.f44819w;
        return typeface != null ? typeface : Typeface.DEFAULT;
    }

    @ColorInt
    public int getCurrentCollapsedTextColor() {
        return d(this.f44807o);
    }

    public int getExpandedLineCount() {
        return this.f44809p;
    }

    public ColorStateList getExpandedTextColor() {
        return this.f44806n;
    }

    public float getExpandedTextFullHeight() {
        TextPaint textPaint = this.U;
        textPaint.setTextSize(this.f44803l);
        textPaint.setTypeface(this.f44822z);
        textPaint.setLetterSpacing(this.f44795g0);
        return textPaint.descent() + (-textPaint.ascent());
    }

    public int getExpandedTextGravity() {
        return this.f44799j;
    }

    public float getExpandedTextHeight() {
        TextPaint textPaint = this.U;
        textPaint.setTextSize(this.f44803l);
        textPaint.setTypeface(this.f44822z);
        textPaint.setLetterSpacing(this.f44795g0);
        return -textPaint.ascent();
    }

    public float getExpandedTextSize() {
        return this.f44803l;
    }

    public Typeface getExpandedTypeface() {
        Typeface typeface = this.f44822z;
        return typeface != null ? typeface : Typeface.DEFAULT;
    }

    public float getExpansionFraction() {
        return this.f44784b;
    }

    public float getFadeModeThresholdFraction() {
        return this.f44790e;
    }

    @RequiresApi(23)
    public int getHyphenationFrequency() {
        return this.f44812q0;
    }

    public int getLineCount() {
        StaticLayout staticLayout = this.i0;
        if (staticLayout != null) {
            return staticLayout.getLineCount();
        }
        return 0;
    }

    @RequiresApi(23)
    public float getLineSpacingAdd() {
        return this.i0.getSpacingAdd();
    }

    @RequiresApi(23)
    public float getLineSpacingMultiplier() {
        return this.i0.getSpacingMultiplier();
    }

    public int getMaxLines() {
        return this.n0;
    }

    @Nullable
    public TimeInterpolator getPositionInterpolator() {
        return this.V;
    }

    @Nullable
    public CharSequence getText() {
        return this.G;
    }

    @NonNull
    public TextUtils.TruncateAt getTitleTextEllipsize() {
        return this.F;
    }

    public final void h(float f6) {
        c(f6, false);
        ViewCompat.postInvalidateOnAnimation(this.f44782a);
    }

    public boolean isRtlTextDirectionHeuristicsEnabled() {
        return this.J;
    }

    public final boolean isStateful() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2 = this.f44807o;
        return (colorStateList2 != null && colorStateList2.isStateful()) || ((colorStateList = this.f44806n) != null && colorStateList.isStateful());
    }

    public void maybeUpdateFontWeightAdjustment(@NonNull Configuration configuration) {
        if (Build.VERSION.SDK_INT >= 31) {
            Typeface typeface = this.f44821y;
            if (typeface != null) {
                this.f44820x = TypefaceUtils.maybeCopyWithFontWeightAdjustment(configuration, typeface);
            }
            Typeface typeface2 = this.B;
            if (typeface2 != null) {
                this.A = TypefaceUtils.maybeCopyWithFontWeightAdjustment(configuration, typeface2);
            }
            Typeface typeface3 = this.f44820x;
            if (typeface3 == null) {
                typeface3 = this.f44821y;
            }
            this.f44819w = typeface3;
            Typeface typeface4 = this.A;
            if (typeface4 == null) {
                typeface4 = this.B;
            }
            this.f44822z = typeface4;
            recalculate(true);
        }
    }

    public void recalculate() {
        recalculate(false);
    }

    public void setCollapsedAndExpandedTextColor(@Nullable ColorStateList colorStateList) {
        if (this.f44807o == colorStateList && this.f44806n == colorStateList) {
            return;
        }
        this.f44807o = colorStateList;
        this.f44806n = colorStateList;
        recalculate();
    }

    public void setCollapsedBounds(@NonNull Rect rect) {
        setCollapsedBounds(rect.left, rect.top, rect.right, rect.bottom);
    }

    public void setCollapsedTextAppearance(int i10) {
        View view = this.f44782a;
        TextAppearance textAppearance = new TextAppearance(view.getContext(), i10);
        if (textAppearance.getTextColor() != null) {
            this.f44807o = textAppearance.getTextColor();
        }
        if (textAppearance.getTextSize() != 0.0f) {
            this.m = textAppearance.getTextSize();
        }
        ColorStateList colorStateList = textAppearance.shadowColor;
        if (colorStateList != null) {
            this.f44783a0 = colorStateList;
        }
        this.Y = textAppearance.shadowDx;
        this.Z = textAppearance.shadowDy;
        this.X = textAppearance.shadowRadius;
        this.f44793f0 = textAppearance.letterSpacing;
        CancelableFontCallback cancelableFontCallback = this.E;
        if (cancelableFontCallback != null) {
            cancelableFontCallback.cancel();
        }
        this.E = new CancelableFontCallback(new a(), textAppearance.getFallbackFont());
        textAppearance.getFontAsync(view.getContext(), this.E);
        recalculate();
    }

    public void setCollapsedTextColor(ColorStateList colorStateList) {
        if (this.f44807o != colorStateList) {
            this.f44807o = colorStateList;
            recalculate();
        }
    }

    public void setCollapsedTextGravity(int i10) {
        if (this.f44801k != i10) {
            this.f44801k = i10;
            recalculate();
        }
    }

    public void setCollapsedTextSize(float f6) {
        if (this.m != f6) {
            this.m = f6;
            recalculate();
        }
    }

    public void setCollapsedTypeface(Typeface typeface) {
        if (f(typeface)) {
            recalculate();
        }
    }

    public void setCurrentOffsetY(int i10) {
        this.f44792f = i10;
    }

    public void setExpandedBounds(@NonNull Rect rect) {
        setExpandedBounds(rect.left, rect.top, rect.right, rect.bottom);
    }

    public void setExpandedLetterSpacing(float f6) {
        if (this.f44795g0 != f6) {
            this.f44795g0 = f6;
            recalculate();
        }
    }

    public void setExpandedTextAppearance(int i10) {
        View view = this.f44782a;
        TextAppearance textAppearance = new TextAppearance(view.getContext(), i10);
        if (textAppearance.getTextColor() != null) {
            this.f44806n = textAppearance.getTextColor();
        }
        if (textAppearance.getTextSize() != 0.0f) {
            this.f44803l = textAppearance.getTextSize();
        }
        ColorStateList colorStateList = textAppearance.shadowColor;
        if (colorStateList != null) {
            this.f44791e0 = colorStateList;
        }
        this.f44787c0 = textAppearance.shadowDx;
        this.f44789d0 = textAppearance.shadowDy;
        this.f44785b0 = textAppearance.shadowRadius;
        this.f44795g0 = textAppearance.letterSpacing;
        CancelableFontCallback cancelableFontCallback = this.D;
        if (cancelableFontCallback != null) {
            cancelableFontCallback.cancel();
        }
        this.D = new CancelableFontCallback(new b(), textAppearance.getFallbackFont());
        textAppearance.getFontAsync(view.getContext(), this.D);
        recalculate();
    }

    public void setExpandedTextColor(ColorStateList colorStateList) {
        if (this.f44806n != colorStateList) {
            this.f44806n = colorStateList;
            recalculate();
        }
    }

    public void setExpandedTextGravity(int i10) {
        if (this.f44799j != i10) {
            this.f44799j = i10;
            recalculate();
        }
    }

    public void setExpandedTextSize(float f6) {
        if (this.f44803l != f6) {
            this.f44803l = f6;
            recalculate();
        }
    }

    public void setExpandedTypeface(Typeface typeface) {
        if (g(typeface)) {
            recalculate();
        }
    }

    public void setExpansionFraction(float f6) {
        float f10;
        float fClamp = MathUtils.clamp(f6, 0.0f, 1.0f);
        if (fClamp != this.f44784b) {
            this.f44784b = fClamp;
            boolean z10 = this.f44786c;
            RectF rectF = this.f44798i;
            Rect rect = this.f44796h;
            Rect rect2 = this.f44794g;
            if (z10) {
                if (fClamp < this.f44790e) {
                    rect = rect2;
                }
                rectF.set(rect);
            } else {
                rectF.left = e(rect2.left, rect.left, fClamp, this.V);
                rectF.top = e(this.f44811q, this.f44813r, fClamp, this.V);
                rectF.right = e(rect2.right, rect.right, fClamp, this.V);
                rectF.bottom = e(rect2.bottom, rect.bottom, fClamp, this.V);
            }
            if (!this.f44786c) {
                this.f44817u = e(this.f44815s, this.f44816t, fClamp, this.V);
                this.f44818v = e(this.f44811q, this.f44813r, fClamp, this.V);
                h(fClamp);
                f10 = fClamp;
            } else if (fClamp < this.f44790e) {
                this.f44817u = this.f44815s;
                this.f44818v = this.f44811q;
                h(0.0f);
                f10 = 0.0f;
            } else {
                this.f44817u = this.f44816t;
                this.f44818v = this.f44813r - Math.max(0, this.f44792f);
                h(1.0f);
                f10 = 1.0f;
            }
            TimeInterpolator timeInterpolator = AnimationUtils.FAST_OUT_SLOW_IN_INTERPOLATOR;
            this.f44802k0 = 1.0f - e(0.0f, 1.0f, 1.0f - fClamp, timeInterpolator);
            View view = this.f44782a;
            ViewCompat.postInvalidateOnAnimation(view);
            this.f44804l0 = e(1.0f, 0.0f, fClamp, timeInterpolator);
            ViewCompat.postInvalidateOnAnimation(view);
            ColorStateList colorStateList = this.f44807o;
            ColorStateList colorStateList2 = this.f44806n;
            TextPaint textPaint = this.T;
            if (colorStateList != colorStateList2) {
                textPaint.setColor(a(d(colorStateList2), getCurrentCollapsedTextColor(), f10));
            } else {
                textPaint.setColor(getCurrentCollapsedTextColor());
            }
            int i10 = Build.VERSION.SDK_INT;
            float f11 = this.f44793f0;
            float f12 = this.f44795g0;
            if (f11 != f12) {
                textPaint.setLetterSpacing(e(f12, f11, fClamp, timeInterpolator));
            } else {
                textPaint.setLetterSpacing(f11);
            }
            this.N = e(this.f44785b0, this.X, fClamp, null);
            this.O = e(this.f44787c0, this.Y, fClamp, null);
            this.P = e(this.f44789d0, this.Z, fClamp, null);
            int iA = a(d(this.f44791e0), d(this.f44783a0), fClamp);
            this.Q = iA;
            textPaint.setShadowLayer(this.N, this.O, this.P, iA);
            if (this.f44786c) {
                int alpha = textPaint.getAlpha();
                float f13 = this.f44790e;
                textPaint.setAlpha((int) ((fClamp <= f13 ? AnimationUtils.lerp(1.0f, 0.0f, this.f44788d, f13, fClamp) : AnimationUtils.lerp(0.0f, 1.0f, f13, 1.0f, fClamp)) * alpha));
                if (i10 >= 31) {
                    textPaint.setShadowLayer(this.N, this.O, this.P, MaterialColors.compositeARGBWithAlpha(this.Q, textPaint.getAlpha()));
                }
            }
            ViewCompat.postInvalidateOnAnimation(view);
        }
    }

    public void setFadeModeEnabled(boolean z10) {
        this.f44786c = z10;
    }

    public void setFadeModeStartFraction(float f6) {
        this.f44788d = f6;
        this.f44790e = androidx.datastore.preferences.protobuf.e.a(1.0f, f6, 0.5f, f6);
    }

    @RequiresApi(23)
    public void setHyphenationFrequency(int i10) {
        this.f44812q0 = i10;
    }

    @RequiresApi(23)
    public void setLineSpacingAdd(float f6) {
        this.f44808o0 = f6;
    }

    @RequiresApi(23)
    public void setLineSpacingMultiplier(@FloatRange(from = 0.0d) float f6) {
        this.f44810p0 = f6;
    }

    public void setMaxLines(int i10) {
        if (i10 != this.n0) {
            this.n0 = i10;
            Bitmap bitmap = this.K;
            if (bitmap != null) {
                bitmap.recycle();
                this.K = null;
            }
            recalculate();
        }
    }

    public void setPositionInterpolator(TimeInterpolator timeInterpolator) {
        this.V = timeInterpolator;
        recalculate();
    }

    public void setRtlTextDirectionHeuristicsEnabled(boolean z10) {
        this.J = z10;
    }

    public final boolean setState(int[] iArr) {
        this.R = iArr;
        if (!isStateful()) {
            return false;
        }
        recalculate();
        return true;
    }

    @RequiresApi(23)
    public void setStaticLayoutBuilderConfigurer(@Nullable StaticLayoutBuilderConfigurer staticLayoutBuilderConfigurer) {
        if (this.f44814r0 != staticLayoutBuilderConfigurer) {
            this.f44814r0 = staticLayoutBuilderConfigurer;
            recalculate(true);
        }
    }

    public void setText(@Nullable CharSequence charSequence) {
        if (charSequence == null || !TextUtils.equals(this.G, charSequence)) {
            this.G = charSequence;
            this.H = null;
            Bitmap bitmap = this.K;
            if (bitmap != null) {
                bitmap.recycle();
                this.K = null;
            }
            recalculate();
        }
    }

    public void setTextSizeInterpolator(TimeInterpolator timeInterpolator) {
        this.W = timeInterpolator;
        recalculate();
    }

    public void setTitleTextEllipsize(@NonNull TextUtils.TruncateAt truncateAt) {
        this.F = truncateAt;
        recalculate();
    }

    public void setTypefaces(Typeface typeface) {
        boolean zF = f(typeface);
        boolean zG = g(typeface);
        if (zF || zG) {
            recalculate();
        }
    }

    public void recalculate(boolean z10) {
        float fMeasureText;
        float f6;
        StaticLayout staticLayout;
        View view = this.f44782a;
        if ((view.getHeight() <= 0 || view.getWidth() <= 0) && !z10) {
            return;
        }
        c(1.0f, z10);
        CharSequence charSequence = this.H;
        TextPaint textPaint = this.T;
        if (charSequence != null && (staticLayout = this.i0) != null) {
            this.f44805m0 = TextUtils.ellipsize(charSequence, textPaint, staticLayout.getWidth(), this.F);
        }
        CharSequence charSequence2 = this.f44805m0;
        if (charSequence2 != null) {
            this.f44800j0 = textPaint.measureText(charSequence2, 0, charSequence2.length());
        } else {
            this.f44800j0 = 0.0f;
        }
        int absoluteGravity = GravityCompat.getAbsoluteGravity(this.f44801k, this.I ? 1 : 0);
        int i10 = absoluteGravity & 112;
        Rect rect = this.f44796h;
        if (i10 == 48) {
            this.f44813r = rect.top;
        } else if (i10 != 80) {
            this.f44813r = rect.centerY() - ((textPaint.descent() - textPaint.ascent()) / 2.0f);
        } else {
            this.f44813r = textPaint.ascent() + rect.bottom;
        }
        int i11 = absoluteGravity & GravityCompat.RELATIVE_HORIZONTAL_GRAVITY_MASK;
        if (i11 == 1) {
            this.f44816t = rect.centerX() - (this.f44800j0 / 2.0f);
        } else if (i11 != 5) {
            this.f44816t = rect.left;
        } else {
            this.f44816t = rect.right - this.f44800j0;
        }
        c(0.0f, z10);
        StaticLayout staticLayout2 = this.i0;
        float height = staticLayout2 != null ? staticLayout2.getHeight() : 0.0f;
        StaticLayout staticLayout3 = this.i0;
        if (staticLayout3 == null || this.n0 <= 1) {
            CharSequence charSequence3 = this.H;
            fMeasureText = charSequence3 != null ? textPaint.measureText(charSequence3, 0, charSequence3.length()) : 0.0f;
        } else {
            fMeasureText = staticLayout3.getWidth();
        }
        StaticLayout staticLayout4 = this.i0;
        this.f44809p = staticLayout4 != null ? staticLayout4.getLineCount() : 0;
        int absoluteGravity2 = GravityCompat.getAbsoluteGravity(this.f44799j, this.I ? 1 : 0);
        int i12 = absoluteGravity2 & 112;
        Rect rect2 = this.f44794g;
        if (i12 == 48) {
            this.f44811q = rect2.top;
        } else if (i12 != 80) {
            this.f44811q = rect2.centerY() - (height / 2.0f);
        } else {
            this.f44811q = textPaint.descent() + (rect2.bottom - height);
        }
        int i13 = absoluteGravity2 & GravityCompat.RELATIVE_HORIZONTAL_GRAVITY_MASK;
        if (i13 == 1) {
            this.f44815s = rect2.centerX() - (fMeasureText / 2.0f);
        } else if (i13 != 5) {
            this.f44815s = rect2.left;
        } else {
            this.f44815s = rect2.right - fMeasureText;
        }
        Bitmap bitmap = this.K;
        if (bitmap != null) {
            bitmap.recycle();
            this.K = null;
        }
        h(this.f44784b);
        float f10 = this.f44784b;
        boolean z11 = this.f44786c;
        RectF rectF = this.f44798i;
        if (z11) {
            if (f10 < this.f44790e) {
                rect = rect2;
            }
            rectF.set(rect);
        } else {
            rectF.left = e(rect2.left, rect.left, f10, this.V);
            rectF.top = e(this.f44811q, this.f44813r, f10, this.V);
            rectF.right = e(rect2.right, rect.right, f10, this.V);
            rectF.bottom = e(rect2.bottom, rect.bottom, f10, this.V);
        }
        if (!this.f44786c) {
            this.f44817u = e(this.f44815s, this.f44816t, f10, this.V);
            this.f44818v = e(this.f44811q, this.f44813r, f10, this.V);
            h(f10);
            f6 = f10;
        } else if (f10 < this.f44790e) {
            this.f44817u = this.f44815s;
            this.f44818v = this.f44811q;
            h(0.0f);
            f6 = 0.0f;
        } else {
            this.f44817u = this.f44816t;
            this.f44818v = this.f44813r - Math.max(0, this.f44792f);
            h(1.0f);
            f6 = 1.0f;
        }
        TimeInterpolator timeInterpolator = AnimationUtils.FAST_OUT_SLOW_IN_INTERPOLATOR;
        this.f44802k0 = 1.0f - e(0.0f, 1.0f, 1.0f - f10, timeInterpolator);
        ViewCompat.postInvalidateOnAnimation(view);
        this.f44804l0 = e(1.0f, 0.0f, f10, timeInterpolator);
        ViewCompat.postInvalidateOnAnimation(view);
        ColorStateList colorStateList = this.f44807o;
        ColorStateList colorStateList2 = this.f44806n;
        if (colorStateList != colorStateList2) {
            textPaint.setColor(a(d(colorStateList2), getCurrentCollapsedTextColor(), f6));
        } else {
            textPaint.setColor(getCurrentCollapsedTextColor());
        }
        int i14 = Build.VERSION.SDK_INT;
        float f11 = this.f44793f0;
        float f12 = this.f44795g0;
        if (f11 != f12) {
            textPaint.setLetterSpacing(e(f12, f11, f10, timeInterpolator));
        } else {
            textPaint.setLetterSpacing(f11);
        }
        this.N = e(this.f44785b0, this.X, f10, null);
        this.O = e(this.f44787c0, this.Y, f10, null);
        this.P = e(this.f44789d0, this.Z, f10, null);
        int iA = a(d(this.f44791e0), d(this.f44783a0), f10);
        this.Q = iA;
        textPaint.setShadowLayer(this.N, this.O, this.P, iA);
        if (this.f44786c) {
            int alpha = textPaint.getAlpha();
            float f13 = this.f44790e;
            textPaint.setAlpha((int) ((f10 <= f13 ? AnimationUtils.lerp(1.0f, 0.0f, this.f44788d, f13, f10) : AnimationUtils.lerp(0.0f, 1.0f, f13, 1.0f, f10)) * alpha));
            if (i14 >= 31) {
                textPaint.setShadowLayer(this.N, this.O, this.P, MaterialColors.compositeARGBWithAlpha(this.Q, textPaint.getAlpha()));
            }
        }
        ViewCompat.postInvalidateOnAnimation(view);
    }

    public void setCollapsedBounds(int i10, int i11, int i12, int i13) {
        Rect rect = this.f44796h;
        if (rect.left == i10 && rect.top == i11 && rect.right == i12 && rect.bottom == i13) {
            return;
        }
        rect.set(i10, i11, i12, i13);
        this.S = true;
    }

    public void setExpandedBounds(int i10, int i11, int i12, int i13) {
        Rect rect = this.f44794g;
        if (rect.left == i10 && rect.top == i11 && rect.right == i12 && rect.bottom == i13) {
            return;
        }
        rect.set(i10, i11, i12, i13);
        this.S = true;
    }
}

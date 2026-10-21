package com.google.android.material.transition.platform;

import android.R;
import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.transition.ArcMotion;
import android.transition.PathMotion;
import android.transition.PatternPathMotion;
import android.transition.Transition;
import android.transition.TransitionValues;
import android.util.DisplayMetrics;
import android.util.Log;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import androidx.annotation.ColorInt;
import androidx.annotation.FloatRange;
import androidx.annotation.IdRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.appcompat.widget.g0;
import androidx.core.graphics.PathParser;
import androidx.core.util.Preconditions;
import androidx.core.view.InputDeviceCompat;
import androidx.core.view.ViewCompat;
import androidx.datastore.preferences.protobuf.e;
import com.google.android.material.animation.AnimationUtils;
import com.google.android.material.internal.ViewUtils;
import com.google.android.material.motion.MotionUtils;
import com.google.android.material.shape.AbsoluteCornerSize;
import com.google.android.material.shape.MaterialShapeDrawable;
import com.google.android.material.shape.ShapeAppearanceModel;
import com.google.android.material.shape.ShapeAppearancePathProvider;
import com.google.android.material.shape.Shapeable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Map;
import qe.h;
import qe.i;
import qe.j;
import qe.r;
import qe.s;
import y0.g;

/* JADX INFO: loaded from: classes10.dex */
@RequiresApi(21)
public final class MaterialContainerTransform extends Transition {
    public static final int FADE_MODE_CROSS = 2;
    public static final int FADE_MODE_IN = 0;
    public static final int FADE_MODE_OUT = 1;
    public static final int FADE_MODE_THROUGH = 3;
    public static final int FIT_MODE_AUTO = 0;
    public static final int FIT_MODE_HEIGHT = 2;
    public static final int FIT_MODE_WIDTH = 1;
    public static final int TRANSITION_DIRECTION_AUTO = 0;
    public static final int TRANSITION_DIRECTION_ENTER = 1;
    public static final int TRANSITION_DIRECTION_RETURN = 2;

    @ColorInt
    public int E0;
    public int F0;
    public int G0;
    public int H0;

    @Nullable
    public View I0;

    @Nullable
    public View J0;

    @Nullable
    public ShapeAppearanceModel K0;

    @Nullable
    public ShapeAppearanceModel L0;

    @Nullable
    public ProgressThresholds M0;

    @Nullable
    public ProgressThresholds N0;

    @Nullable
    public ProgressThresholds O0;

    @Nullable
    public ProgressThresholds P0;
    public boolean Q0;
    public float R0;
    public float S0;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public boolean f45919p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public boolean f45920q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public boolean f45921r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final boolean f45922s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    @IdRes
    public int f45923t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    @IdRes
    public int f45924u0;

    @IdRes
    public int v0;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    @ColorInt
    public int f45925w0;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    @ColorInt
    public int f45926x0;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    @ColorInt
    public int f45927y0;
    public static final String[] T0 = {"materialContainerTransition:bounds", "materialContainerTransition:shapeAppearance"};
    public static final c U0 = new c(new ProgressThresholds(0.0f, 0.25f), new ProgressThresholds(0.0f, 1.0f), new ProgressThresholds(0.0f, 1.0f), new ProgressThresholds(0.0f, 0.75f));
    public static final c V0 = new c(new ProgressThresholds(0.6f, 0.9f), new ProgressThresholds(0.0f, 1.0f), new ProgressThresholds(0.0f, 0.9f), new ProgressThresholds(0.3f, 0.9f));
    public static final c W0 = new c(new ProgressThresholds(0.1f, 0.4f), new ProgressThresholds(0.1f, 1.0f), new ProgressThresholds(0.1f, 1.0f), new ProgressThresholds(0.1f, 0.9f));
    public static final c X0 = new c(new ProgressThresholds(0.6f, 0.9f), new ProgressThresholds(0.0f, 0.9f), new ProgressThresholds(0.0f, 0.9f), new ProgressThresholds(0.2f, 0.9f));

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public @interface FadeMode {
    }

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public @interface FitMode {
    }

    public static class ProgressThresholds {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @FloatRange(from = 0.0d, to = 1.0d)
        public final float f45928a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @FloatRange(from = 0.0d, to = 1.0d)
        public final float f45929b;

        public ProgressThresholds(@FloatRange(from = 0.0d, to = 1.0d) float f6, @FloatRange(from = 0.0d, to = 1.0d) float f10) {
            this.f45928a = f6;
            this.f45929b = f10;
        }

        @FloatRange(from = 0.0d, to = 1.0d)
        public float getEnd() {
            return this.f45929b;
        }

        @FloatRange(from = 0.0d, to = 1.0d)
        public float getStart() {
            return this.f45928a;
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public @interface TransitionDirection {
    }

    public class a implements ValueAnimator.AnimatorUpdateListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ d f45930a;

        public a(d dVar) {
            this.f45930a = dVar;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            float animatedFraction = valueAnimator.getAnimatedFraction();
            d dVar = this.f45930a;
            if (dVar.L != animatedFraction) {
                dVar.d(animatedFraction);
            }
        }
    }

    public class b extends r {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ View f45931a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ d f45932b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ View f45933c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ View f45934d;

        public b(View view, d dVar, View view2, View view3) {
            this.f45931a = view;
            this.f45932b = dVar;
            this.f45933c = view2;
            this.f45934d = view3;
        }

        @Override // qe.r, android.transition.Transition.TransitionListener
        public final void onTransitionEnd(@NonNull Transition transition) {
            MaterialContainerTransform materialContainerTransform = MaterialContainerTransform.this;
            materialContainerTransform.removeListener(this);
            if (materialContainerTransform.f45920q0) {
                return;
            }
            this.f45933c.setAlpha(1.0f);
            this.f45934d.setAlpha(1.0f);
            ViewUtils.getOverlay(this.f45931a).remove(this.f45932b);
        }

        @Override // qe.r, android.transition.Transition.TransitionListener
        public final void onTransitionStart(@NonNull Transition transition) {
            ViewUtils.getOverlay(this.f45931a).add(this.f45932b);
            this.f45933c.setAlpha(0.0f);
            this.f45934d.setAlpha(0.0f);
        }
    }

    public static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NonNull
        public final ProgressThresholds f45936a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NonNull
        public final ProgressThresholds f45937b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @NonNull
        public final ProgressThresholds f45938c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @NonNull
        public final ProgressThresholds f45939d;

        public c(ProgressThresholds progressThresholds, ProgressThresholds progressThresholds2, ProgressThresholds progressThresholds3, ProgressThresholds progressThresholds4) {
            this.f45936a = progressThresholds;
            this.f45937b = progressThresholds2;
            this.f45938c = progressThresholds3;
            this.f45939d = progressThresholds4;
        }
    }

    public static final class d extends Drawable {
        public final c A;
        public final qe.a B;
        public final h C;
        public final boolean D;
        public final Paint E;
        public final Path F;
        public qe.c G;
        public j H;
        public RectF I;
        public float J;
        public float K;
        public float L;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final View f45940a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final RectF f45941b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final ShapeAppearanceModel f45942c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final float f45943d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final View f45944e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final RectF f45945f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final ShapeAppearanceModel f45946g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final float f45947h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final Paint f45948i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final Paint f45949j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public final Paint f45950k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public final Paint f45951l;
        public final Paint m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public final com.google.android.material.transition.platform.a f45952n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public final PathMeasure f45953o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public final float f45954p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public final float[] f45955q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public final boolean f45956r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public final float f45957s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public final float f45958t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public final boolean f45959u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public final MaterialShapeDrawable f45960v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public final RectF f45961w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public final RectF f45962x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        public final RectF f45963y;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        public final RectF f45964z;

        public d(PathMotion pathMotion, View view, RectF rectF, ShapeAppearanceModel shapeAppearanceModel, float f6, View view2, RectF rectF2, ShapeAppearanceModel shapeAppearanceModel2, float f10, int i10, int i11, int i12, int i13, boolean z10, boolean z11, qe.a aVar, h hVar, c cVar, boolean z12) {
            Paint paint = new Paint();
            this.f45948i = paint;
            Paint paint2 = new Paint();
            this.f45949j = paint2;
            Paint paint3 = new Paint();
            this.f45950k = paint3;
            this.f45951l = new Paint();
            Paint paint4 = new Paint();
            this.m = paint4;
            this.f45952n = new com.google.android.material.transition.platform.a();
            this.f45955q = new float[]{rectF.centerX(), rectF.top};
            MaterialShapeDrawable materialShapeDrawable = new MaterialShapeDrawable();
            this.f45960v = materialShapeDrawable;
            Paint paint5 = new Paint();
            this.E = paint5;
            this.F = new Path();
            this.f45940a = view;
            this.f45941b = rectF;
            this.f45942c = shapeAppearanceModel;
            this.f45943d = f6;
            this.f45944e = view2;
            this.f45945f = rectF2;
            this.f45946g = shapeAppearanceModel2;
            this.f45947h = f10;
            this.f45956r = z10;
            this.f45959u = z11;
            this.B = aVar;
            this.C = hVar;
            this.A = cVar;
            this.D = z12;
            WindowManager windowManager = (WindowManager) view.getContext().getSystemService("window");
            DisplayMetrics displayMetrics = new DisplayMetrics();
            windowManager.getDefaultDisplay().getMetrics(displayMetrics);
            this.f45957s = displayMetrics.widthPixels;
            this.f45958t = displayMetrics.heightPixels;
            paint.setColor(i10);
            paint2.setColor(i11);
            paint3.setColor(i12);
            materialShapeDrawable.setFillColor(ColorStateList.valueOf(0));
            materialShapeDrawable.setShadowCompatibilityMode(2);
            materialShapeDrawable.setShadowBitmapDrawingEnable(false);
            materialShapeDrawable.setShadowColor(-7829368);
            RectF rectF3 = new RectF(rectF);
            this.f45961w = rectF3;
            this.f45962x = new RectF(rectF3);
            RectF rectF4 = new RectF(rectF3);
            this.f45963y = rectF4;
            this.f45964z = new RectF(rectF4);
            PointF pointF = new PointF(rectF.centerX(), rectF.top);
            PointF pointF2 = new PointF(rectF2.centerX(), rectF2.top);
            PathMeasure pathMeasure = new PathMeasure(pathMotion.getPath(pointF.x, pointF.y, pointF2.x, pointF2.y), false);
            this.f45953o = pathMeasure;
            this.f45954p = pathMeasure.getLength();
            paint4.setStyle(Paint.Style.FILL);
            RectF rectF5 = s.f92861a;
            paint4.setShader(new LinearGradient(0.0f, 0.0f, 0.0f, 0.0f, i13, i13, Shader.TileMode.CLAMP));
            paint5.setStyle(Paint.Style.STROKE);
            paint5.setStrokeWidth(10.0f);
            d(0.0f);
        }

        public final void a(Canvas canvas) {
            c(canvas, this.f45950k);
            Rect bounds = getBounds();
            RectF rectF = this.f45963y;
            float f6 = rectF.left;
            float f10 = rectF.top;
            float f11 = this.H.f92843b;
            int i10 = this.G.f92824b;
            if (i10 <= 0) {
                return;
            }
            int iSave = canvas.save();
            canvas.translate(f6, f10);
            canvas.scale(f11, f11);
            if (i10 < 255) {
                RectF rectF2 = s.f92861a;
                rectF2.set(bounds);
                canvas.saveLayerAlpha(rectF2, i10);
            }
            this.f45944e.draw(canvas);
            canvas.restoreToCount(iSave);
        }

        public final void b(Canvas canvas) {
            c(canvas, this.f45949j);
            Rect bounds = getBounds();
            RectF rectF = this.f45961w;
            float f6 = rectF.left;
            float f10 = rectF.top;
            float f11 = this.H.f92842a;
            int i10 = this.G.f92823a;
            if (i10 <= 0) {
                return;
            }
            int iSave = canvas.save();
            canvas.translate(f6, f10);
            canvas.scale(f11, f11);
            if (i10 < 255) {
                RectF rectF2 = s.f92861a;
                rectF2.set(bounds);
                canvas.saveLayerAlpha(rectF2, i10);
            }
            this.f45940a.draw(canvas);
            canvas.restoreToCount(iSave);
        }

        public final void c(Canvas canvas, Paint paint) {
            if (paint.getColor() == 0 || paint.getAlpha() <= 0) {
                return;
            }
            canvas.drawRect(getBounds(), paint);
        }

        public final void d(float f6) {
            float f10;
            float f11;
            this.L = f6;
            this.m.setAlpha((int) (this.f45956r ? s.c(0.0f, 255.0f, f6) : s.c(255.0f, 0.0f, f6)));
            float f12 = this.f45954p;
            PathMeasure pathMeasure = this.f45953o;
            float[] fArr = this.f45955q;
            pathMeasure.getPosTan(f12 * f6, fArr, null);
            float fA = fArr[0];
            float fA2 = fArr[1];
            if (f6 > 1.0f || f6 < 0.0f) {
                if (f6 > 1.0f) {
                    f11 = (f6 - 1.0f) / 0.00999999f;
                    f10 = 0.99f;
                } else {
                    f10 = 0.01f;
                    f11 = (f6 / 0.01f) * (-1.0f);
                }
                pathMeasure.getPosTan(f12 * f10, fArr, null);
                float f13 = fArr[0];
                float f14 = fArr[1];
                fA = e.a(fA, f13, f11, fA);
                fA2 = e.a(fA2, f14, f11, fA2);
            }
            float f15 = fA;
            float f16 = fA2;
            c cVar = this.A;
            float fFloatValue = ((Float) Preconditions.checkNotNull(Float.valueOf(cVar.f45937b.f45928a))).floatValue();
            float fFloatValue2 = ((Float) Preconditions.checkNotNull(Float.valueOf(cVar.f45937b.f45929b))).floatValue();
            h hVar = this.C;
            RectF rectF = this.f45941b;
            float fWidth = rectF.width();
            float fHeight = rectF.height();
            RectF rectF2 = this.f45945f;
            j jVarA = hVar.a(f6, fFloatValue, fFloatValue2, fWidth, fHeight, rectF2.width(), rectF2.height());
            this.H = jVarA;
            float f17 = jVarA.f92844c / 2.0f;
            float f18 = jVarA.f92845d + f16;
            RectF rectF3 = this.f45961w;
            rectF3.set(f15 - f17, f16, f17 + f15, f18);
            j jVar = this.H;
            float f19 = jVar.f92846e / 2.0f;
            float f20 = jVar.f92847f + f16;
            RectF rectF4 = this.f45963y;
            rectF4.set(f15 - f19, f16, f19 + f15, f20);
            RectF rectF5 = this.f45962x;
            rectF5.set(rectF3);
            RectF rectF6 = this.f45964z;
            rectF6.set(rectF4);
            ProgressThresholds progressThresholds = cVar.f45938c;
            float fFloatValue3 = ((Float) Preconditions.checkNotNull(Float.valueOf(progressThresholds.f45928a))).floatValue();
            float fFloatValue4 = ((Float) Preconditions.checkNotNull(Float.valueOf(progressThresholds.f45929b))).floatValue();
            j jVar2 = this.H;
            h hVar2 = this.C;
            boolean zC = hVar2.c(jVar2);
            RectF rectF7 = zC ? rectF5 : rectF6;
            float fD = s.d(0.0f, 1.0f, fFloatValue3, fFloatValue4, f6, false);
            if (!zC) {
                fD = 1.0f - fD;
            }
            hVar2.b(rectF7, fD, this.H);
            this.I = new RectF(Math.min(rectF5.left, rectF6.left), Math.min(rectF5.top, rectF6.top), Math.max(rectF5.right, rectF6.right), Math.max(rectF5.bottom, rectF6.bottom));
            com.google.android.material.transition.platform.a aVar = this.f45952n;
            aVar.getClass();
            ProgressThresholds progressThresholds2 = cVar.f45939d;
            float start = progressThresholds2.getStart();
            float end = progressThresholds2.getEnd();
            ShapeAppearanceModel shapeAppearanceModelBuild = this.f45942c;
            if (f6 >= start) {
                ShapeAppearanceModel shapeAppearanceModel = this.f45946g;
                if (f6 > end) {
                    shapeAppearanceModelBuild = shapeAppearanceModel;
                } else {
                    shapeAppearanceModelBuild = ((shapeAppearanceModelBuild.getTopLeftCornerSize().getCornerSize(rectF3) == 0.0f && shapeAppearanceModelBuild.getTopRightCornerSize().getCornerSize(rectF3) == 0.0f && shapeAppearanceModelBuild.getBottomRightCornerSize().getCornerSize(rectF3) == 0.0f && shapeAppearanceModelBuild.getBottomLeftCornerSize().getCornerSize(rectF3) == 0.0f) ? shapeAppearanceModel : shapeAppearanceModelBuild).toBuilder().setTopLeftCornerSize(new AbsoluteCornerSize(s.d(shapeAppearanceModelBuild.getTopLeftCornerSize().getCornerSize(rectF3), shapeAppearanceModel.getTopLeftCornerSize().getCornerSize(rectF6), start, end, f6, false))).setTopRightCornerSize(new AbsoluteCornerSize(s.d(shapeAppearanceModelBuild.getTopRightCornerSize().getCornerSize(rectF3), shapeAppearanceModel.getTopRightCornerSize().getCornerSize(rectF6), start, end, f6, false))).setBottomLeftCornerSize(new AbsoluteCornerSize(s.d(shapeAppearanceModelBuild.getBottomLeftCornerSize().getCornerSize(rectF3), shapeAppearanceModel.getBottomLeftCornerSize().getCornerSize(rectF6), start, end, f6, false))).setBottomRightCornerSize(new AbsoluteCornerSize(s.d(shapeAppearanceModelBuild.getBottomRightCornerSize().getCornerSize(rectF3), shapeAppearanceModel.getBottomRightCornerSize().getCornerSize(rectF6), start, end, f6, false))).build();
                }
            }
            aVar.f45992e = shapeAppearanceModelBuild;
            Path path = aVar.f45989b;
            ShapeAppearancePathProvider shapeAppearancePathProvider = aVar.f45991d;
            shapeAppearancePathProvider.calculatePath(shapeAppearanceModelBuild, 1.0f, rectF5, path);
            ShapeAppearanceModel shapeAppearanceModel2 = aVar.f45992e;
            Path path2 = aVar.f45990c;
            shapeAppearancePathProvider.calculatePath(shapeAppearanceModel2, 1.0f, rectF6, path2);
            aVar.f45988a.op(path, path2, Path.Op.UNION);
            this.J = s.c(this.f45943d, this.f45947h, f6);
            float fCenterX = ((this.I.centerX() / (this.f45957s / 2.0f)) - 1.0f) * 0.3f;
            float fCenterY = (this.I.centerY() / this.f45958t) * 1.5f;
            float f21 = this.J;
            float f22 = (int) (fCenterY * f21);
            this.K = f22;
            this.f45951l.setShadowLayer(f21, (int) (fCenterX * f21), f22, 754974720);
            ProgressThresholds progressThresholds3 = cVar.f45936a;
            this.G = this.B.a(f6, ((Float) Preconditions.checkNotNull(Float.valueOf(progressThresholds3.f45928a))).floatValue(), ((Float) Preconditions.checkNotNull(Float.valueOf(progressThresholds3.f45929b))).floatValue());
            Paint paint = this.f45949j;
            if (paint.getColor() != 0) {
                paint.setAlpha(this.G.f92823a);
            }
            Paint paint2 = this.f45950k;
            if (paint2.getColor() != 0) {
                paint2.setAlpha(this.G.f92824b);
            }
            invalidateSelf();
        }

        @Override // android.graphics.drawable.Drawable
        public final void draw(@NonNull Canvas canvas) {
            Paint paint = this.m;
            if (paint.getAlpha() > 0) {
                canvas.drawRect(getBounds(), paint);
            }
            boolean z10 = this.D;
            int iSave = z10 ? canvas.save() : -1;
            boolean z11 = this.f45959u;
            com.google.android.material.transition.platform.a aVar = this.f45952n;
            if (z11 && this.J > 0.0f) {
                canvas.save();
                canvas.clipPath(aVar.f45988a, Region.Op.DIFFERENCE);
                if (Build.VERSION.SDK_INT > 28) {
                    ShapeAppearanceModel shapeAppearanceModel = aVar.f45992e;
                    boolean zIsRoundRect = shapeAppearanceModel.isRoundRect(this.I);
                    Paint paint2 = this.f45951l;
                    if (zIsRoundRect) {
                        float cornerSize = shapeAppearanceModel.getTopLeftCornerSize().getCornerSize(this.I);
                        canvas.drawRoundRect(this.I, cornerSize, cornerSize, paint2);
                    } else {
                        canvas.drawPath(aVar.f45988a, paint2);
                    }
                } else {
                    MaterialShapeDrawable materialShapeDrawable = this.f45960v;
                    RectF rectF = this.I;
                    materialShapeDrawable.setBounds((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
                    materialShapeDrawable.setElevation(this.J);
                    materialShapeDrawable.setShadowVerticalOffset((int) this.K);
                    materialShapeDrawable.setShapeAppearanceModel(aVar.f45992e);
                    materialShapeDrawable.draw(canvas);
                }
                canvas.restore();
            }
            canvas.clipPath(aVar.f45988a);
            c(canvas, this.f45948i);
            if (this.G.f92825c) {
                b(canvas);
                a(canvas);
            } else {
                a(canvas);
                b(canvas);
            }
            if (z10) {
                canvas.restoreToCount(iSave);
                RectF rectF2 = this.f45961w;
                Path path = this.F;
                PointF pointF = new PointF(rectF2.centerX(), rectF2.top);
                float f6 = this.L;
                Paint paint3 = this.E;
                if (f6 == 0.0f) {
                    path.reset();
                    path.moveTo(pointF.x, pointF.y);
                } else {
                    path.lineTo(pointF.x, pointF.y);
                    paint3.setColor(-65281);
                    canvas.drawPath(path, paint3);
                }
                RectF rectF3 = this.f45962x;
                paint3.setColor(InputDeviceCompat.SOURCE_ANY);
                canvas.drawRect(rectF3, paint3);
                paint3.setColor(-16711936);
                canvas.drawRect(rectF2, paint3);
                RectF rectF4 = this.f45964z;
                paint3.setColor(-16711681);
                canvas.drawRect(rectF4, paint3);
                RectF rectF5 = this.f45963y;
                paint3.setColor(-16776961);
                canvas.drawRect(rectF5, paint3);
            }
        }

        @Override // android.graphics.drawable.Drawable
        public final int getOpacity() {
            return -3;
        }

        @Override // android.graphics.drawable.Drawable
        public final void setAlpha(int i10) {
            throw new UnsupportedOperationException("Setting alpha on is not supported");
        }

        @Override // android.graphics.drawable.Drawable
        public final void setColorFilter(@Nullable ColorFilter colorFilter) {
            throw new UnsupportedOperationException("Setting a color filter is not supported");
        }
    }

    public MaterialContainerTransform() {
        this.f45919p0 = false;
        this.f45920q0 = false;
        this.f45921r0 = false;
        this.f45922s0 = false;
        this.f45923t0 = R.id.content;
        this.f45924u0 = -1;
        this.v0 = -1;
        this.f45925w0 = 0;
        this.f45926x0 = 0;
        this.f45927y0 = 0;
        this.E0 = 1375731712;
        this.F0 = 0;
        this.G0 = 0;
        this.H0 = 0;
        this.Q0 = Build.VERSION.SDK_INT >= 28;
        this.R0 = -1.0f;
        this.S0 = -1.0f;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void a(@NonNull TransitionValues transitionValues, @Nullable View view, @IdRes int i10, @Nullable ShapeAppearanceModel shapeAppearanceModel) {
        RectF rectFB;
        if (i10 != -1) {
            View view2 = transitionValues.view;
            RectF rectF = s.f92861a;
            View viewFindViewById = view2.findViewById(i10);
            if (viewFindViewById == null) {
                viewFindViewById = s.a(i10, view2);
            }
            transitionValues.view = viewFindViewById;
        } else if (view != null) {
            transitionValues.view = view;
        } else {
            View view3 = transitionValues.view;
            int i11 = com.google.android.material.R.id.mtrl_motion_snapshot_view;
            if (view3.getTag(i11) instanceof View) {
                View view4 = (View) transitionValues.view.getTag(i11);
                transitionValues.view.setTag(i11, null);
                transitionValues.view = view4;
            }
        }
        View view5 = transitionValues.view;
        if (!ViewCompat.isLaidOut(view5) && view5.getWidth() == 0 && view5.getHeight() == 0) {
            return;
        }
        if (view5.getParent() == null) {
            RectF rectF2 = s.f92861a;
            rectFB = new RectF(view5.getLeft(), view5.getTop(), view5.getRight(), view5.getBottom());
        } else {
            rectFB = s.b(view5);
        }
        transitionValues.values.put("materialContainerTransition:bounds", rectFB);
        Map map = transitionValues.values;
        if (shapeAppearanceModel == null) {
            int i12 = com.google.android.material.R.id.mtrl_motion_snapshot_view;
            if (view5.getTag(i12) instanceof ShapeAppearanceModel) {
                shapeAppearanceModel = (ShapeAppearanceModel) view5.getTag(i12);
            } else {
                Context context = view5.getContext();
                TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(new int[]{com.google.android.material.R.attr.transitionShapeAppearance});
                int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, -1);
                typedArrayObtainStyledAttributes.recycle();
                if (resourceId != -1) {
                    shapeAppearanceModel = ShapeAppearanceModel.builder(context, resourceId, 0).build();
                } else {
                    shapeAppearanceModel = view5 instanceof Shapeable ? ((Shapeable) view5).getShapeAppearanceModel() : ShapeAppearanceModel.builder().build();
                }
            }
        }
        map.put("materialContainerTransition:shapeAppearance", shapeAppearanceModel.withTransformedCornerSizes(new g(rectFB)));
    }

    public final c b(boolean z10, c cVar, c cVar2) {
        if (!z10) {
            cVar = cVar2;
        }
        ProgressThresholds progressThresholds = this.M0;
        ProgressThresholds progressThresholds2 = cVar.f45936a;
        RectF rectF = s.f92861a;
        if (progressThresholds == null) {
            progressThresholds = progressThresholds2;
        }
        ProgressThresholds progressThresholds3 = this.N0;
        if (progressThresholds3 == null) {
            progressThresholds3 = cVar.f45937b;
        }
        ProgressThresholds progressThresholds4 = this.O0;
        if (progressThresholds4 == null) {
            progressThresholds4 = cVar.f45938c;
        }
        ProgressThresholds progressThresholds5 = this.P0;
        if (progressThresholds5 == null) {
            progressThresholds5 = cVar.f45939d;
        }
        return new c(progressThresholds, progressThresholds3, progressThresholds4, progressThresholds5);
    }

    public final void c(Context context, boolean z10) {
        int i10;
        int iResolveThemeDuration;
        int i11 = com.google.android.material.R.attr.motionEasingEmphasizedInterpolator;
        TimeInterpolator timeInterpolator = AnimationUtils.FAST_OUT_SLOW_IN_INTERPOLATOR;
        RectF rectF = s.f92861a;
        if (i11 != 0 && getInterpolator() == null) {
            setInterpolator(MotionUtils.resolveThemeInterpolator(context, i11, timeInterpolator));
        }
        int i12 = z10 ? com.google.android.material.R.attr.motionDurationLong2 : com.google.android.material.R.attr.motionDurationMedium4;
        if (i12 != 0 && getDuration() == -1 && (iResolveThemeDuration = MotionUtils.resolveThemeDuration(context, i12, -1)) != -1) {
            setDuration(iResolveThemeDuration);
        }
        if (this.f45921r0 || (i10 = com.google.android.material.R.attr.motionPath) == 0) {
            return;
        }
        TypedValue typedValue = new TypedValue();
        boolean zResolveAttribute = context.getTheme().resolveAttribute(i10, typedValue, true);
        PathMotion patternPathMotion = null;
        if (zResolveAttribute) {
            int i13 = typedValue.type;
            if (i13 == 16) {
                int i14 = typedValue.data;
                if (i14 != 0) {
                    if (i14 != 1) {
                        throw new IllegalArgumentException(g0.c("Invalid motion path type: ", i14));
                    }
                    patternPathMotion = new MaterialArcMotion();
                }
            } else {
                if (i13 != 3) {
                    throw new IllegalArgumentException("Motion path theme attribute must either be an enum value or path data string");
                }
                patternPathMotion = new PatternPathMotion(PathParser.createPathFromPathData(String.valueOf(typedValue.string)));
            }
        }
        if (patternPathMotion != null) {
            setPathMotion(patternPathMotion);
        }
    }

    @Override // android.transition.Transition
    public void captureEndValues(@NonNull TransitionValues transitionValues) {
        a(transitionValues, this.J0, this.v0, this.L0);
    }

    @Override // android.transition.Transition
    public void captureStartValues(@NonNull TransitionValues transitionValues) {
        a(transitionValues, this.I0, this.f45924u0, this.K0);
    }

    /* JADX WARN: Code duplicated, block: B:39:0x00da  */
    /* JADX WARN: Code duplicated, block: B:43:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:47:0x0100  */
    /* JADX WARN: Code duplicated, block: B:50:0x011b  */
    /* JADX WARN: Code duplicated, block: B:52:0x0120  */
    /* JADX WARN: Code duplicated, block: B:54:0x0123  */
    /* JADX WARN: Code duplicated, block: B:56:0x0126  */
    /* JADX WARN: Code duplicated, block: B:58:0x012b  */
    /* JADX WARN: Code duplicated, block: B:60:0x0137  */
    /* JADX WARN: Code duplicated, block: B:61:0x013a A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:62:0x013c A[PHI: r21
      0x013c: PHI (r21v2 int) = (r21v0 int), (r21v6 int) binds: [B:65:0x0143, B:61:0x013a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:64:0x0141  */
    /* JADX WARN: Code duplicated, block: B:69:0x014e  */
    /* JADX WARN: Code duplicated, block: B:71:0x0153  */
    /* JADX WARN: Code duplicated, block: B:74:0x0159  */
    /* JADX WARN: Code duplicated, block: B:76:0x0165  */
    /* JADX WARN: Code duplicated, block: B:77:0x0169  */
    /* JADX WARN: Code duplicated, block: B:87:0x019a  */
    /* JADX WARN: Code duplicated, block: B:92:0x01aa  */
    @Override // android.transition.Transition
    @Nullable
    public Animator createAnimator(@NonNull ViewGroup viewGroup, @Nullable TransitionValues transitionValues, @Nullable TransitionValues transitionValues2) {
        View viewA;
        View view;
        RectF rectF;
        boolean z10;
        float elevation;
        float elevation2;
        int i10;
        int i11;
        qe.a aVar;
        qe.b.C0483b c0483b;
        int i12;
        qe.a aVar2;
        int i13;
        i.a aVar3;
        h hVar;
        h hVar2;
        PathMotion pathMotion;
        c cVarB;
        qe.a aVar4;
        if (transitionValues != null && transitionValues2 != null) {
            RectF rectF2 = (RectF) transitionValues.values.get("materialContainerTransition:bounds");
            ShapeAppearanceModel shapeAppearanceModel = (ShapeAppearanceModel) transitionValues.values.get("materialContainerTransition:shapeAppearance");
            if (rectF2 != null && shapeAppearanceModel != null) {
                RectF rectF3 = (RectF) transitionValues2.values.get("materialContainerTransition:bounds");
                ShapeAppearanceModel shapeAppearanceModel2 = (ShapeAppearanceModel) transitionValues2.values.get("materialContainerTransition:shapeAppearance");
                if (rectF3 == null || shapeAppearanceModel2 == null) {
                    Log.w("MaterialContainerTransform", "Skipping due to null end bounds. Ensure end view is laid out and measured.");
                    return null;
                }
                View view2 = transitionValues.view;
                View view3 = transitionValues2.view;
                View view4 = view3.getParent() != null ? view3 : view2;
                if (this.f45923t0 == view4.getId()) {
                    viewA = (View) view4.getParent();
                    view = view4;
                } else {
                    viewA = s.a(this.f45923t0, view4);
                    view = null;
                }
                RectF rectFB = s.b(viewA);
                float f6 = -rectFB.left;
                float f10 = -rectFB.top;
                if (view != null) {
                    rectF = s.b(view);
                    rectF.offset(f6, f10);
                } else {
                    rectF = new RectF(0.0f, 0.0f, viewA.getWidth(), viewA.getHeight());
                }
                rectF2.offset(f6, f10);
                rectF3.offset(f6, f10);
                int i14 = this.F0;
                boolean z11 = false;
                if (i14 != 0) {
                    if (i14 == 1) {
                        z10 = true;
                    } else if (i14 != 2) {
                        throw new IllegalArgumentException("Invalid transition direction: " + this.F0);
                    }
                    if (!this.f45922s0) {
                        c(view4.getContext(), z10);
                    }
                    PathMotion pathMotion2 = getPathMotion();
                    elevation = this.R0;
                    if (elevation == -1.0f) {
                        elevation = ViewCompat.getElevation(view2);
                    }
                    float f11 = elevation;
                    elevation2 = this.S0;
                    if (elevation2 == -1.0f) {
                        elevation2 = ViewCompat.getElevation(view3);
                    }
                    float f12 = elevation2;
                    int i15 = this.f45925w0;
                    i10 = this.f45926x0;
                    int i16 = this.f45927y0;
                    int i17 = this.E0;
                    View view5 = viewA;
                    boolean z12 = this.Q0;
                    i11 = this.G0;
                    aVar = qe.b.f92819a;
                    c0483b = qe.b.f92820b;
                    if (i11 != 0) {
                        i12 = i10;
                        if (i11 != 1) {
                            if (i11 != 2) {
                                aVar4 = qe.b.f92821c;
                            } else {
                                if (i11 == 3) {
                                    throw new IllegalArgumentException(g0.c("Invalid fade mode: ", i11));
                                }
                                aVar4 = qe.b.f92822d;
                            }
                            aVar2 = aVar4;
                        } else {
                            if (z10) {
                                aVar = c0483b;
                            }
                            aVar2 = aVar;
                        }
                    } else {
                        i12 = i10;
                        if (!z10) {
                            aVar = c0483b;
                        }
                        aVar2 = aVar;
                    }
                    i13 = this.H0;
                    aVar3 = i.f92840a;
                    hVar = i.f92841b;
                    if (i13 != 0) {
                        if (i13 != 1) {
                            hVar2 = aVar3;
                        } else if (i13 != 2) {
                            throw new IllegalArgumentException(g0.c("Invalid fit mode: ", i13));
                        }
                        pathMotion = getPathMotion();
                        if (!(pathMotion instanceof ArcMotion) || (pathMotion instanceof MaterialArcMotion)) {
                            cVarB = b(z10, W0, X0);
                        } else {
                            cVarB = b(z10, U0, V0);
                        }
                        d dVar = new d(pathMotion2, view2, rectF2, shapeAppearanceModel, f11, view3, rectF3, shapeAppearanceModel2, f12, i15, i12, i16, i17, z10, z12, aVar2, hVar2, cVarB, this.f45919p0);
                        dVar.setBounds(Math.round(rectF.left), Math.round(rectF.top), Math.round(rectF.right), Math.round(rectF.bottom));
                        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                        valueAnimatorOfFloat.addUpdateListener(new a(dVar));
                        addListener(new b(view5, dVar, view2, view3));
                        return valueAnimatorOfFloat;
                    }
                    float fWidth = rectF2.width();
                    float fHeight = rectF2.height();
                    float fWidth2 = rectF3.width();
                    float fHeight2 = rectF3.height();
                    float f13 = (fHeight2 * fWidth) / fWidth2;
                    float f14 = (fWidth2 * fHeight) / fWidth;
                    if (z10 ? f14 >= fHeight2 : f13 >= fHeight) {
                    }
                    hVar2 = hVar;
                    pathMotion = getPathMotion();
                    if (pathMotion instanceof ArcMotion) {
                        cVarB = b(z10, W0, X0);
                    } else {
                        cVarB = b(z10, W0, X0);
                    }
                    d dVar2 = new d(pathMotion2, view2, rectF2, shapeAppearanceModel, f11, view3, rectF3, shapeAppearanceModel2, f12, i15, i12, i16, i17, z10, z12, aVar2, hVar2, cVarB, this.f45919p0);
                    dVar2.setBounds(Math.round(rectF.left), Math.round(rectF.top), Math.round(rectF.right), Math.round(rectF.bottom));
                    ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
                    valueAnimatorOfFloat2.addUpdateListener(new a(dVar2));
                    addListener(new b(view5, dVar2, view2, view3));
                    return valueAnimatorOfFloat2;
                }
                if (rectF3.height() * rectF3.width() > rectF2.height() * rectF2.width()) {
                    z11 = true;
                }
                z10 = z11;
                if (!this.f45922s0) {
                    c(view4.getContext(), z10);
                }
                PathMotion pathMotion3 = getPathMotion();
                elevation = this.R0;
                if (elevation == -1.0f) {
                    elevation = ViewCompat.getElevation(view2);
                }
                float f15 = elevation;
                elevation2 = this.S0;
                if (elevation2 == -1.0f) {
                    elevation2 = ViewCompat.getElevation(view3);
                }
                float f16 = elevation2;
                int i18 = this.f45925w0;
                i10 = this.f45926x0;
                int i19 = this.f45927y0;
                int i110 = this.E0;
                View view6 = viewA;
                boolean z13 = this.Q0;
                i11 = this.G0;
                aVar = qe.b.f92819a;
                c0483b = qe.b.f92820b;
                if (i11 != 0) {
                    i12 = i10;
                    if (i11 != 1) {
                        if (i11 != 2) {
                            aVar4 = qe.b.f92821c;
                        } else {
                            if (i11 == 3) {
                                throw new IllegalArgumentException(g0.c("Invalid fade mode: ", i11));
                            }
                            aVar4 = qe.b.f92822d;
                        }
                        aVar2 = aVar4;
                    } else {
                        if (z10) {
                            aVar = c0483b;
                        }
                        aVar2 = aVar;
                    }
                } else {
                    i12 = i10;
                    if (!z10) {
                        aVar = c0483b;
                    }
                    aVar2 = aVar;
                }
                i13 = this.H0;
                aVar3 = i.f92840a;
                hVar = i.f92841b;
                if (i13 != 0) {
                    if (i13 != 1) {
                        hVar2 = aVar3;
                    } else if (i13 != 2) {
                        throw new IllegalArgumentException(g0.c("Invalid fit mode: ", i13));
                    }
                    pathMotion = getPathMotion();
                    if (pathMotion instanceof ArcMotion) {
                        cVarB = b(z10, W0, X0);
                    } else {
                        cVarB = b(z10, W0, X0);
                    }
                    d dVar3 = new d(pathMotion3, view2, rectF2, shapeAppearanceModel, f15, view3, rectF3, shapeAppearanceModel2, f16, i18, i12, i19, i110, z10, z13, aVar2, hVar2, cVarB, this.f45919p0);
                    dVar3.setBounds(Math.round(rectF.left), Math.round(rectF.top), Math.round(rectF.right), Math.round(rectF.bottom));
                    ValueAnimator valueAnimatorOfFloat3 = ValueAnimator.ofFloat(0.0f, 1.0f);
                    valueAnimatorOfFloat3.addUpdateListener(new a(dVar3));
                    addListener(new b(view6, dVar3, view2, view3));
                    return valueAnimatorOfFloat3;
                }
                float fWidth3 = rectF2.width();
                float fHeight3 = rectF2.height();
                float fWidth4 = rectF3.width();
                float fHeight4 = rectF3.height();
                float f17 = (fHeight4 * fWidth3) / fWidth4;
                float f18 = (fWidth4 * fHeight3) / fWidth3;
                hVar = z10 ? aVar3 : aVar3;
                hVar2 = hVar;
                pathMotion = getPathMotion();
                if (pathMotion instanceof ArcMotion) {
                    cVarB = b(z10, W0, X0);
                } else {
                    cVarB = b(z10, W0, X0);
                }
                d dVar4 = new d(pathMotion3, view2, rectF2, shapeAppearanceModel, f15, view3, rectF3, shapeAppearanceModel2, f16, i18, i12, i19, i110, z10, z13, aVar2, hVar2, cVarB, this.f45919p0);
                dVar4.setBounds(Math.round(rectF.left), Math.round(rectF.top), Math.round(rectF.right), Math.round(rectF.bottom));
                ValueAnimator valueAnimatorOfFloat4 = ValueAnimator.ofFloat(0.0f, 1.0f);
                valueAnimatorOfFloat4.addUpdateListener(new a(dVar4));
                addListener(new b(view6, dVar4, view2, view3));
                return valueAnimatorOfFloat4;
            }
            Log.w("MaterialContainerTransform", "Skipping due to null start bounds. Ensure start view is laid out and measured.");
        }
        return null;
    }

    @ColorInt
    public int getContainerColor() {
        return this.f45925w0;
    }

    @IdRes
    public int getDrawingViewId() {
        return this.f45923t0;
    }

    @ColorInt
    public int getEndContainerColor() {
        return this.f45927y0;
    }

    public float getEndElevation() {
        return this.S0;
    }

    @Nullable
    public ShapeAppearanceModel getEndShapeAppearanceModel() {
        return this.L0;
    }

    @Nullable
    public View getEndView() {
        return this.J0;
    }

    @IdRes
    public int getEndViewId() {
        return this.v0;
    }

    public int getFadeMode() {
        return this.G0;
    }

    @Nullable
    public ProgressThresholds getFadeProgressThresholds() {
        return this.M0;
    }

    public int getFitMode() {
        return this.H0;
    }

    @Nullable
    public ProgressThresholds getScaleMaskProgressThresholds() {
        return this.O0;
    }

    @Nullable
    public ProgressThresholds getScaleProgressThresholds() {
        return this.N0;
    }

    @ColorInt
    public int getScrimColor() {
        return this.E0;
    }

    @Nullable
    public ProgressThresholds getShapeMaskProgressThresholds() {
        return this.P0;
    }

    @ColorInt
    public int getStartContainerColor() {
        return this.f45926x0;
    }

    public float getStartElevation() {
        return this.R0;
    }

    @Nullable
    public ShapeAppearanceModel getStartShapeAppearanceModel() {
        return this.K0;
    }

    @Nullable
    public View getStartView() {
        return this.I0;
    }

    @IdRes
    public int getStartViewId() {
        return this.f45924u0;
    }

    public int getTransitionDirection() {
        return this.F0;
    }

    @Override // android.transition.Transition
    @Nullable
    public String[] getTransitionProperties() {
        return T0;
    }

    public boolean isDrawDebugEnabled() {
        return this.f45919p0;
    }

    public boolean isElevationShadowEnabled() {
        return this.Q0;
    }

    public boolean isHoldAtEndEnabled() {
        return this.f45920q0;
    }

    public void setAllContainerColors(@ColorInt int i10) {
        this.f45925w0 = i10;
        this.f45926x0 = i10;
        this.f45927y0 = i10;
    }

    public void setContainerColor(@ColorInt int i10) {
        this.f45925w0 = i10;
    }

    public void setDrawDebugEnabled(boolean z10) {
        this.f45919p0 = z10;
    }

    public void setDrawingViewId(@IdRes int i10) {
        this.f45923t0 = i10;
    }

    public void setElevationShadowEnabled(boolean z10) {
        this.Q0 = z10;
    }

    public void setEndContainerColor(@ColorInt int i10) {
        this.f45927y0 = i10;
    }

    public void setEndElevation(float f6) {
        this.S0 = f6;
    }

    public void setEndShapeAppearanceModel(@Nullable ShapeAppearanceModel shapeAppearanceModel) {
        this.L0 = shapeAppearanceModel;
    }

    public void setEndView(@Nullable View view) {
        this.J0 = view;
    }

    public void setEndViewId(@IdRes int i10) {
        this.v0 = i10;
    }

    public void setFadeMode(int i10) {
        this.G0 = i10;
    }

    public void setFadeProgressThresholds(@Nullable ProgressThresholds progressThresholds) {
        this.M0 = progressThresholds;
    }

    public void setFitMode(int i10) {
        this.H0 = i10;
    }

    public void setHoldAtEndEnabled(boolean z10) {
        this.f45920q0 = z10;
    }

    @Override // android.transition.Transition
    public void setPathMotion(@Nullable PathMotion pathMotion) {
        super.setPathMotion(pathMotion);
        this.f45921r0 = true;
    }

    public void setScaleMaskProgressThresholds(@Nullable ProgressThresholds progressThresholds) {
        this.O0 = progressThresholds;
    }

    public void setScaleProgressThresholds(@Nullable ProgressThresholds progressThresholds) {
        this.N0 = progressThresholds;
    }

    public void setScrimColor(@ColorInt int i10) {
        this.E0 = i10;
    }

    public void setShapeMaskProgressThresholds(@Nullable ProgressThresholds progressThresholds) {
        this.P0 = progressThresholds;
    }

    public void setStartContainerColor(@ColorInt int i10) {
        this.f45926x0 = i10;
    }

    public void setStartElevation(float f6) {
        this.R0 = f6;
    }

    public void setStartShapeAppearanceModel(@Nullable ShapeAppearanceModel shapeAppearanceModel) {
        this.K0 = shapeAppearanceModel;
    }

    public void setStartView(@Nullable View view) {
        this.I0 = view;
    }

    public void setStartViewId(@IdRes int i10) {
        this.f45924u0 = i10;
    }

    public void setTransitionDirection(int i10) {
        this.F0 = i10;
    }

    public MaterialContainerTransform(@NonNull Context context, boolean z10) {
        this.f45919p0 = false;
        this.f45920q0 = false;
        this.f45921r0 = false;
        this.f45922s0 = false;
        this.f45923t0 = R.id.content;
        this.f45924u0 = -1;
        this.v0 = -1;
        this.f45925w0 = 0;
        this.f45926x0 = 0;
        this.f45927y0 = 0;
        this.E0 = 1375731712;
        this.F0 = 0;
        this.G0 = 0;
        this.H0 = 0;
        this.Q0 = Build.VERSION.SDK_INT >= 28;
        this.R0 = -1.0f;
        this.S0 = -1.0f;
        c(context, z10);
        this.f45922s0 = true;
    }
}

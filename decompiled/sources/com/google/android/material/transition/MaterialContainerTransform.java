package com.google.android.material.transition;

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
import androidx.annotation.RestrictTo;
import androidx.appcompat.widget.g0;
import androidx.core.graphics.PathParser;
import androidx.core.util.Preconditions;
import androidx.core.view.InputDeviceCompat;
import androidx.core.view.ViewCompat;
import androidx.datastore.preferences.protobuf.e;
import androidx.transition.ArcMotion;
import androidx.transition.PathMotion;
import androidx.transition.PatternPathMotion;
import androidx.transition.Transition;
import androidx.transition.TransitionValues;
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
import pe.h;
import pe.i;
import pe.j;
import pe.o;
import pe.p;

/* JADX INFO: loaded from: classes10.dex */
public final class MaterialContainerTransform extends Transition {
    public static final int FADE_MODE_CROSS = 2;
    public static final int FADE_MODE_IN = 0;
    public static final int FADE_MODE_OUT = 1;
    public static final int FADE_MODE_THROUGH = 3;
    public static final int FIT_MODE_AUTO = 0;
    public static final int FIT_MODE_HEIGHT = 2;
    public static final int FIT_MODE_WIDTH = 1;
    public static final String[] I1 = {"materialContainerTransition:bounds", "materialContainerTransition:shapeAppearance"};
    public static final c J1 = new c(new ProgressThresholds(0.0f, 0.25f), new ProgressThresholds(0.0f, 1.0f), new ProgressThresholds(0.0f, 1.0f), new ProgressThresholds(0.0f, 0.75f));
    public static final c K1 = new c(new ProgressThresholds(0.6f, 0.9f), new ProgressThresholds(0.0f, 1.0f), new ProgressThresholds(0.0f, 0.9f), new ProgressThresholds(0.3f, 0.9f));
    public static final c L1 = new c(new ProgressThresholds(0.1f, 0.4f), new ProgressThresholds(0.1f, 1.0f), new ProgressThresholds(0.1f, 1.0f), new ProgressThresholds(0.1f, 0.9f));
    public static final c M1 = new c(new ProgressThresholds(0.6f, 0.9f), new ProgressThresholds(0.0f, 0.9f), new ProgressThresholds(0.0f, 0.9f), new ProgressThresholds(0.2f, 0.9f));
    public static final int TRANSITION_DIRECTION_AUTO = 0;
    public static final int TRANSITION_DIRECTION_ENTER = 1;
    public static final int TRANSITION_DIRECTION_RETURN = 2;

    @Nullable
    public ShapeAppearanceModel A1;

    @Nullable
    public ProgressThresholds B1;

    @Nullable
    public ProgressThresholds C1;

    @Nullable
    public ProgressThresholds D1;

    @Nullable
    public ProgressThresholds E1;
    public boolean F1;
    public float G1;
    public float H1;

    /* JADX INFO: renamed from: j1, reason: collision with root package name */
    public boolean f45842j1;

    /* JADX INFO: renamed from: k1, reason: collision with root package name */
    public boolean f45843k1;

    /* JADX INFO: renamed from: l1, reason: collision with root package name */
    public boolean f45844l1;

    /* JADX INFO: renamed from: m1, reason: collision with root package name */
    public final boolean f45845m1;

    /* JADX INFO: renamed from: n1, reason: collision with root package name */
    @IdRes
    public int f45846n1;

    /* JADX INFO: renamed from: o1, reason: collision with root package name */
    @IdRes
    public int f45847o1;

    /* JADX INFO: renamed from: p1, reason: collision with root package name */
    @IdRes
    public int f45848p1;

    /* JADX INFO: renamed from: q1, reason: collision with root package name */
    @ColorInt
    public int f45849q1;

    @ColorInt
    public int r1;

    /* JADX INFO: renamed from: s1, reason: collision with root package name */
    @ColorInt
    public int f45850s1;

    /* JADX INFO: renamed from: t1, reason: collision with root package name */
    @ColorInt
    public int f45851t1;

    /* JADX INFO: renamed from: u1, reason: collision with root package name */
    public int f45852u1;

    /* JADX INFO: renamed from: v1, reason: collision with root package name */
    public int f45853v1;

    /* JADX INFO: renamed from: w1, reason: collision with root package name */
    public int f45854w1;

    /* JADX INFO: renamed from: x1, reason: collision with root package name */
    @Nullable
    public View f45855x1;

    /* JADX INFO: renamed from: y1, reason: collision with root package name */
    @Nullable
    public View f45856y1;

    /* JADX INFO: renamed from: z1, reason: collision with root package name */
    @Nullable
    public ShapeAppearanceModel f45857z1;

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
        public final float f45858a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @FloatRange(from = 0.0d, to = 1.0d)
        public final float f45859b;

        public ProgressThresholds(@FloatRange(from = 0.0d, to = 1.0d) float f6, @FloatRange(from = 0.0d, to = 1.0d) float f10) {
            this.f45858a = f6;
            this.f45859b = f10;
        }

        @FloatRange(from = 0.0d, to = 1.0d)
        public float getEnd() {
            return this.f45859b;
        }

        @FloatRange(from = 0.0d, to = 1.0d)
        public float getStart() {
            return this.f45858a;
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public @interface TransitionDirection {
    }

    public class a implements ValueAnimator.AnimatorUpdateListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ d f45860a;

        public a(d dVar) {
            this.f45860a = dVar;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            float animatedFraction = valueAnimator.getAnimatedFraction();
            d dVar = this.f45860a;
            if (dVar.L != animatedFraction) {
                dVar.d(animatedFraction);
            }
        }
    }

    public class b extends o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ View f45861a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ d f45862b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ View f45863c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ View f45864d;

        public b(View view, d dVar, View view2, View view3) {
            this.f45861a = view;
            this.f45862b = dVar;
            this.f45863c = view2;
            this.f45864d = view3;
        }

        @Override // androidx.transition.Transition.TransitionListener
        public final void onTransitionEnd(@NonNull Transition transition) {
            MaterialContainerTransform materialContainerTransform = MaterialContainerTransform.this;
            materialContainerTransform.removeListener(this);
            if (materialContainerTransform.f45843k1) {
                return;
            }
            this.f45863c.setAlpha(1.0f);
            this.f45864d.setAlpha(1.0f);
            ViewUtils.getOverlay(this.f45861a).remove(this.f45862b);
        }

        @Override // androidx.transition.Transition.TransitionListener
        public final void onTransitionStart(@NonNull Transition transition) {
            ViewUtils.getOverlay(this.f45861a).add(this.f45862b);
            this.f45863c.setAlpha(0.0f);
            this.f45864d.setAlpha(0.0f);
        }
    }

    public static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NonNull
        public final ProgressThresholds f45866a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NonNull
        public final ProgressThresholds f45867b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @NonNull
        public final ProgressThresholds f45868c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @NonNull
        public final ProgressThresholds f45869d;

        public c(ProgressThresholds progressThresholds, ProgressThresholds progressThresholds2, ProgressThresholds progressThresholds3, ProgressThresholds progressThresholds4) {
            this.f45866a = progressThresholds;
            this.f45867b = progressThresholds2;
            this.f45868c = progressThresholds3;
            this.f45869d = progressThresholds4;
        }
    }

    public static final class d extends Drawable {
        public final c A;
        public final pe.a B;
        public final h C;
        public final boolean D;
        public final Paint E;
        public final Path F;
        public pe.c G;
        public j H;
        public RectF I;
        public float J;
        public float K;
        public float L;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final View f45870a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final RectF f45871b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final ShapeAppearanceModel f45872c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final float f45873d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final View f45874e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final RectF f45875f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final ShapeAppearanceModel f45876g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final float f45877h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final Paint f45878i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final Paint f45879j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public final Paint f45880k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public final Paint f45881l;
        public final Paint m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public final com.google.android.material.transition.a f45882n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public final PathMeasure f45883o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public final float f45884p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public final float[] f45885q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public final boolean f45886r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public final float f45887s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public final float f45888t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public final boolean f45889u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public final MaterialShapeDrawable f45890v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public final RectF f45891w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public final RectF f45892x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        public final RectF f45893y;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        public final RectF f45894z;

        public d(PathMotion pathMotion, View view, RectF rectF, ShapeAppearanceModel shapeAppearanceModel, float f6, View view2, RectF rectF2, ShapeAppearanceModel shapeAppearanceModel2, float f10, int i10, int i11, int i12, int i13, boolean z10, boolean z11, pe.a aVar, h hVar, c cVar, boolean z12) {
            Paint paint = new Paint();
            this.f45878i = paint;
            Paint paint2 = new Paint();
            this.f45879j = paint2;
            Paint paint3 = new Paint();
            this.f45880k = paint3;
            this.f45881l = new Paint();
            Paint paint4 = new Paint();
            this.m = paint4;
            this.f45882n = new com.google.android.material.transition.a();
            this.f45885q = new float[]{rectF.centerX(), rectF.top};
            MaterialShapeDrawable materialShapeDrawable = new MaterialShapeDrawable();
            this.f45890v = materialShapeDrawable;
            Paint paint5 = new Paint();
            this.E = paint5;
            this.F = new Path();
            this.f45870a = view;
            this.f45871b = rectF;
            this.f45872c = shapeAppearanceModel;
            this.f45873d = f6;
            this.f45874e = view2;
            this.f45875f = rectF2;
            this.f45876g = shapeAppearanceModel2;
            this.f45877h = f10;
            this.f45886r = z10;
            this.f45889u = z11;
            this.B = aVar;
            this.C = hVar;
            this.A = cVar;
            this.D = z12;
            WindowManager windowManager = (WindowManager) view.getContext().getSystemService("window");
            DisplayMetrics displayMetrics = new DisplayMetrics();
            windowManager.getDefaultDisplay().getMetrics(displayMetrics);
            this.f45887s = displayMetrics.widthPixels;
            this.f45888t = displayMetrics.heightPixels;
            paint.setColor(i10);
            paint2.setColor(i11);
            paint3.setColor(i12);
            materialShapeDrawable.setFillColor(ColorStateList.valueOf(0));
            materialShapeDrawable.setShadowCompatibilityMode(2);
            materialShapeDrawable.setShadowBitmapDrawingEnable(false);
            materialShapeDrawable.setShadowColor(-7829368);
            RectF rectF3 = new RectF(rectF);
            this.f45891w = rectF3;
            this.f45892x = new RectF(rectF3);
            RectF rectF4 = new RectF(rectF3);
            this.f45893y = rectF4;
            this.f45894z = new RectF(rectF4);
            PointF pointF = new PointF(rectF.centerX(), rectF.top);
            PointF pointF2 = new PointF(rectF2.centerX(), rectF2.top);
            PathMeasure pathMeasure = new PathMeasure(pathMotion.getPath(pointF.x, pointF.y, pointF2.x, pointF2.y), false);
            this.f45883o = pathMeasure;
            this.f45884p = pathMeasure.getLength();
            paint4.setStyle(Paint.Style.FILL);
            RectF rectF5 = p.f92677a;
            paint4.setShader(new LinearGradient(0.0f, 0.0f, 0.0f, 0.0f, i13, i13, Shader.TileMode.CLAMP));
            paint5.setStyle(Paint.Style.STROKE);
            paint5.setStrokeWidth(10.0f);
            d(0.0f);
        }

        public final void a(Canvas canvas) {
            c(canvas, this.f45880k);
            Rect bounds = getBounds();
            RectF rectF = this.f45893y;
            float f6 = rectF.left;
            float f10 = rectF.top;
            float f11 = this.H.f92662b;
            int i10 = this.G.f92643b;
            if (i10 <= 0) {
                return;
            }
            int iSave = canvas.save();
            canvas.translate(f6, f10);
            canvas.scale(f11, f11);
            if (i10 < 255) {
                RectF rectF2 = p.f92677a;
                rectF2.set(bounds);
                canvas.saveLayerAlpha(rectF2, i10);
            }
            this.f45874e.draw(canvas);
            canvas.restoreToCount(iSave);
        }

        public final void b(Canvas canvas) {
            c(canvas, this.f45879j);
            Rect bounds = getBounds();
            RectF rectF = this.f45891w;
            float f6 = rectF.left;
            float f10 = rectF.top;
            float f11 = this.H.f92661a;
            int i10 = this.G.f92642a;
            if (i10 <= 0) {
                return;
            }
            int iSave = canvas.save();
            canvas.translate(f6, f10);
            canvas.scale(f11, f11);
            if (i10 < 255) {
                RectF rectF2 = p.f92677a;
                rectF2.set(bounds);
                canvas.saveLayerAlpha(rectF2, i10);
            }
            this.f45870a.draw(canvas);
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
            this.m.setAlpha((int) (this.f45886r ? p.c(0.0f, 255.0f, f6) : p.c(255.0f, 0.0f, f6)));
            float f12 = this.f45884p;
            PathMeasure pathMeasure = this.f45883o;
            float[] fArr = this.f45885q;
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
            float fFloatValue = ((Float) Preconditions.checkNotNull(Float.valueOf(cVar.f45867b.f45858a))).floatValue();
            float fFloatValue2 = ((Float) Preconditions.checkNotNull(Float.valueOf(cVar.f45867b.f45859b))).floatValue();
            h hVar = this.C;
            RectF rectF = this.f45871b;
            float fWidth = rectF.width();
            float fHeight = rectF.height();
            RectF rectF2 = this.f45875f;
            j jVarA = hVar.a(f6, fFloatValue, fFloatValue2, fWidth, fHeight, rectF2.width(), rectF2.height());
            this.H = jVarA;
            float f17 = jVarA.f92663c / 2.0f;
            float f18 = jVarA.f92664d + f16;
            RectF rectF3 = this.f45891w;
            rectF3.set(f15 - f17, f16, f17 + f15, f18);
            j jVar = this.H;
            float f19 = jVar.f92665e / 2.0f;
            float f20 = jVar.f92666f + f16;
            RectF rectF4 = this.f45893y;
            rectF4.set(f15 - f19, f16, f19 + f15, f20);
            RectF rectF5 = this.f45892x;
            rectF5.set(rectF3);
            RectF rectF6 = this.f45894z;
            rectF6.set(rectF4);
            ProgressThresholds progressThresholds = cVar.f45868c;
            float fFloatValue3 = ((Float) Preconditions.checkNotNull(Float.valueOf(progressThresholds.f45858a))).floatValue();
            float fFloatValue4 = ((Float) Preconditions.checkNotNull(Float.valueOf(progressThresholds.f45859b))).floatValue();
            j jVar2 = this.H;
            h hVar2 = this.C;
            boolean zC = hVar2.c(jVar2);
            RectF rectF7 = zC ? rectF5 : rectF6;
            float fD = p.d(0.0f, 1.0f, fFloatValue3, fFloatValue4, f6, false);
            if (!zC) {
                fD = 1.0f - fD;
            }
            hVar2.b(rectF7, fD, this.H);
            this.I = new RectF(Math.min(rectF5.left, rectF6.left), Math.min(rectF5.top, rectF6.top), Math.max(rectF5.right, rectF6.right), Math.max(rectF5.bottom, rectF6.bottom));
            com.google.android.material.transition.a aVar = this.f45882n;
            aVar.getClass();
            ProgressThresholds progressThresholds2 = cVar.f45869d;
            float start = progressThresholds2.getStart();
            float end = progressThresholds2.getEnd();
            ShapeAppearanceModel shapeAppearanceModelBuild = this.f45872c;
            if (f6 >= start) {
                ShapeAppearanceModel shapeAppearanceModel = this.f45876g;
                if (f6 > end) {
                    shapeAppearanceModelBuild = shapeAppearanceModel;
                } else {
                    shapeAppearanceModelBuild = ((shapeAppearanceModelBuild.getTopLeftCornerSize().getCornerSize(rectF3) == 0.0f && shapeAppearanceModelBuild.getTopRightCornerSize().getCornerSize(rectF3) == 0.0f && shapeAppearanceModelBuild.getBottomRightCornerSize().getCornerSize(rectF3) == 0.0f && shapeAppearanceModelBuild.getBottomLeftCornerSize().getCornerSize(rectF3) == 0.0f) ? shapeAppearanceModel : shapeAppearanceModelBuild).toBuilder().setTopLeftCornerSize(new AbsoluteCornerSize(p.d(shapeAppearanceModelBuild.getTopLeftCornerSize().getCornerSize(rectF3), shapeAppearanceModel.getTopLeftCornerSize().getCornerSize(rectF6), start, end, f6, false))).setTopRightCornerSize(new AbsoluteCornerSize(p.d(shapeAppearanceModelBuild.getTopRightCornerSize().getCornerSize(rectF3), shapeAppearanceModel.getTopRightCornerSize().getCornerSize(rectF6), start, end, f6, false))).setBottomLeftCornerSize(new AbsoluteCornerSize(p.d(shapeAppearanceModelBuild.getBottomLeftCornerSize().getCornerSize(rectF3), shapeAppearanceModel.getBottomLeftCornerSize().getCornerSize(rectF6), start, end, f6, false))).setBottomRightCornerSize(new AbsoluteCornerSize(p.d(shapeAppearanceModelBuild.getBottomRightCornerSize().getCornerSize(rectF3), shapeAppearanceModel.getBottomRightCornerSize().getCornerSize(rectF6), start, end, f6, false))).build();
                }
            }
            aVar.f45916e = shapeAppearanceModelBuild;
            Path path = aVar.f45913b;
            ShapeAppearancePathProvider shapeAppearancePathProvider = aVar.f45915d;
            shapeAppearancePathProvider.calculatePath(shapeAppearanceModelBuild, 1.0f, rectF5, path);
            ShapeAppearanceModel shapeAppearanceModel2 = aVar.f45916e;
            Path path2 = aVar.f45914c;
            shapeAppearancePathProvider.calculatePath(shapeAppearanceModel2, 1.0f, rectF6, path2);
            aVar.f45912a.op(path, path2, Path.Op.UNION);
            this.J = p.c(this.f45873d, this.f45877h, f6);
            float fCenterX = ((this.I.centerX() / (this.f45887s / 2.0f)) - 1.0f) * 0.3f;
            float fCenterY = (this.I.centerY() / this.f45888t) * 1.5f;
            float f21 = this.J;
            float f22 = (int) (fCenterY * f21);
            this.K = f22;
            this.f45881l.setShadowLayer(f21, (int) (fCenterX * f21), f22, 754974720);
            ProgressThresholds progressThresholds3 = cVar.f45866a;
            this.G = this.B.a(f6, ((Float) Preconditions.checkNotNull(Float.valueOf(progressThresholds3.f45858a))).floatValue(), ((Float) Preconditions.checkNotNull(Float.valueOf(progressThresholds3.f45859b))).floatValue());
            Paint paint = this.f45879j;
            if (paint.getColor() != 0) {
                paint.setAlpha(this.G.f92642a);
            }
            Paint paint2 = this.f45880k;
            if (paint2.getColor() != 0) {
                paint2.setAlpha(this.G.f92643b);
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
            boolean z11 = this.f45889u;
            com.google.android.material.transition.a aVar = this.f45882n;
            if (z11 && this.J > 0.0f) {
                canvas.save();
                canvas.clipPath(aVar.f45912a, Region.Op.DIFFERENCE);
                if (Build.VERSION.SDK_INT > 28) {
                    ShapeAppearanceModel shapeAppearanceModel = aVar.f45916e;
                    boolean zIsRoundRect = shapeAppearanceModel.isRoundRect(this.I);
                    Paint paint2 = this.f45881l;
                    if (zIsRoundRect) {
                        float cornerSize = shapeAppearanceModel.getTopLeftCornerSize().getCornerSize(this.I);
                        canvas.drawRoundRect(this.I, cornerSize, cornerSize, paint2);
                    } else {
                        canvas.drawPath(aVar.f45912a, paint2);
                    }
                } else {
                    MaterialShapeDrawable materialShapeDrawable = this.f45890v;
                    RectF rectF = this.I;
                    materialShapeDrawable.setBounds((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
                    materialShapeDrawable.setElevation(this.J);
                    materialShapeDrawable.setShadowVerticalOffset((int) this.K);
                    materialShapeDrawable.setShapeAppearanceModel(aVar.f45916e);
                    materialShapeDrawable.draw(canvas);
                }
                canvas.restore();
            }
            canvas.clipPath(aVar.f45912a);
            c(canvas, this.f45878i);
            if (this.G.f92644c) {
                b(canvas);
                a(canvas);
            } else {
                a(canvas);
                b(canvas);
            }
            if (z10) {
                canvas.restoreToCount(iSave);
                RectF rectF2 = this.f45891w;
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
                RectF rectF3 = this.f45892x;
                paint3.setColor(InputDeviceCompat.SOURCE_ANY);
                canvas.drawRect(rectF3, paint3);
                paint3.setColor(-16711936);
                canvas.drawRect(rectF2, paint3);
                RectF rectF4 = this.f45894z;
                paint3.setColor(-16711681);
                canvas.drawRect(rectF4, paint3);
                RectF rectF5 = this.f45893y;
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
        this.f45842j1 = false;
        this.f45843k1 = false;
        this.f45844l1 = false;
        this.f45845m1 = false;
        this.f45846n1 = R.id.content;
        this.f45847o1 = -1;
        this.f45848p1 = -1;
        this.f45849q1 = 0;
        this.r1 = 0;
        this.f45850s1 = 0;
        this.f45851t1 = 1375731712;
        this.f45852u1 = 0;
        this.f45853v1 = 0;
        this.f45854w1 = 0;
        this.F1 = Build.VERSION.SDK_INT >= 28;
        this.G1 = -1.0f;
        this.H1 = -1.0f;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void q(@NonNull TransitionValues transitionValues, @Nullable View view, @IdRes int i10, @Nullable ShapeAppearanceModel shapeAppearanceModel) {
        RectF rectFB;
        if (i10 != -1) {
            View view2 = transitionValues.view;
            RectF rectF = p.f92677a;
            View viewFindViewById = view2.findViewById(i10);
            if (viewFindViewById == null) {
                viewFindViewById = p.a(i10, view2);
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
            RectF rectF2 = p.f92677a;
            rectFB = new RectF(view5.getLeft(), view5.getTop(), view5.getRight(), view5.getBottom());
        } else {
            rectFB = p.b(view5);
        }
        transitionValues.values.put("materialContainerTransition:bounds", rectFB);
        Map<String, Object> map = transitionValues.values;
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
        map.put("materialContainerTransition:shapeAppearance", shapeAppearanceModel.withTransformedCornerSizes(new com.google.android.material.navigation.c(rectFB)));
    }

    @Override // androidx.transition.Transition
    public void captureEndValues(@NonNull TransitionValues transitionValues) {
        q(transitionValues, this.f45856y1, this.f45848p1, this.A1);
    }

    @Override // androidx.transition.Transition
    public void captureStartValues(@NonNull TransitionValues transitionValues) {
        q(transitionValues, this.f45855x1, this.f45847o1, this.f45857z1);
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
    @Override // androidx.transition.Transition
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
        pe.a aVar;
        pe.b.C0479b c0479b;
        int i12;
        pe.a aVar2;
        int i13;
        i.a aVar3;
        h hVar;
        h hVar2;
        PathMotion pathMotion;
        c cVarR;
        pe.a aVar4;
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
                if (this.f45846n1 == view4.getId()) {
                    viewA = (View) view4.getParent();
                    view = view4;
                } else {
                    viewA = p.a(this.f45846n1, view4);
                    view = null;
                }
                RectF rectFB = p.b(viewA);
                float f6 = -rectFB.left;
                float f10 = -rectFB.top;
                if (view != null) {
                    rectF = p.b(view);
                    rectF.offset(f6, f10);
                } else {
                    rectF = new RectF(0.0f, 0.0f, viewA.getWidth(), viewA.getHeight());
                }
                rectF2.offset(f6, f10);
                rectF3.offset(f6, f10);
                int i14 = this.f45852u1;
                boolean z11 = false;
                if (i14 != 0) {
                    if (i14 == 1) {
                        z10 = true;
                    } else if (i14 != 2) {
                        throw new IllegalArgumentException("Invalid transition direction: " + this.f45852u1);
                    }
                    if (!this.f45845m1) {
                        s(view4.getContext(), z10);
                    }
                    PathMotion pathMotion2 = getPathMotion();
                    elevation = this.G1;
                    if (elevation == -1.0f) {
                        elevation = ViewCompat.getElevation(view2);
                    }
                    float f11 = elevation;
                    elevation2 = this.H1;
                    if (elevation2 == -1.0f) {
                        elevation2 = ViewCompat.getElevation(view3);
                    }
                    float f12 = elevation2;
                    int i15 = this.f45849q1;
                    i10 = this.r1;
                    int i16 = this.f45850s1;
                    int i17 = this.f45851t1;
                    View view5 = viewA;
                    boolean z12 = this.F1;
                    i11 = this.f45853v1;
                    aVar = pe.b.f92638a;
                    c0479b = pe.b.f92639b;
                    if (i11 != 0) {
                        i12 = i10;
                        if (i11 != 1) {
                            if (i11 != 2) {
                                aVar4 = pe.b.f92640c;
                            } else {
                                if (i11 == 3) {
                                    throw new IllegalArgumentException(g0.c("Invalid fade mode: ", i11));
                                }
                                aVar4 = pe.b.f92641d;
                            }
                            aVar2 = aVar4;
                        } else {
                            if (z10) {
                                aVar = c0479b;
                            }
                            aVar2 = aVar;
                        }
                    } else {
                        i12 = i10;
                        if (!z10) {
                            aVar = c0479b;
                        }
                        aVar2 = aVar;
                    }
                    i13 = this.f45854w1;
                    aVar3 = i.f92659a;
                    hVar = i.f92660b;
                    if (i13 != 0) {
                        if (i13 != 1) {
                            hVar2 = aVar3;
                        } else if (i13 != 2) {
                            throw new IllegalArgumentException(g0.c("Invalid fit mode: ", i13));
                        }
                        pathMotion = getPathMotion();
                        if (!(pathMotion instanceof ArcMotion) || (pathMotion instanceof MaterialArcMotion)) {
                            cVarR = r(z10, L1, M1);
                        } else {
                            cVarR = r(z10, J1, K1);
                        }
                        d dVar = new d(pathMotion2, view2, rectF2, shapeAppearanceModel, f11, view3, rectF3, shapeAppearanceModel2, f12, i15, i12, i16, i17, z10, z12, aVar2, hVar2, cVarR, this.f45842j1);
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
                        cVarR = r(z10, L1, M1);
                    } else {
                        cVarR = r(z10, L1, M1);
                    }
                    d dVar2 = new d(pathMotion2, view2, rectF2, shapeAppearanceModel, f11, view3, rectF3, shapeAppearanceModel2, f12, i15, i12, i16, i17, z10, z12, aVar2, hVar2, cVarR, this.f45842j1);
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
                if (!this.f45845m1) {
                    s(view4.getContext(), z10);
                }
                PathMotion pathMotion3 = getPathMotion();
                elevation = this.G1;
                if (elevation == -1.0f) {
                    elevation = ViewCompat.getElevation(view2);
                }
                float f15 = elevation;
                elevation2 = this.H1;
                if (elevation2 == -1.0f) {
                    elevation2 = ViewCompat.getElevation(view3);
                }
                float f16 = elevation2;
                int i18 = this.f45849q1;
                i10 = this.r1;
                int i19 = this.f45850s1;
                int i110 = this.f45851t1;
                View view6 = viewA;
                boolean z13 = this.F1;
                i11 = this.f45853v1;
                aVar = pe.b.f92638a;
                c0479b = pe.b.f92639b;
                if (i11 != 0) {
                    i12 = i10;
                    if (i11 != 1) {
                        if (i11 != 2) {
                            aVar4 = pe.b.f92640c;
                        } else {
                            if (i11 == 3) {
                                throw new IllegalArgumentException(g0.c("Invalid fade mode: ", i11));
                            }
                            aVar4 = pe.b.f92641d;
                        }
                        aVar2 = aVar4;
                    } else {
                        if (z10) {
                            aVar = c0479b;
                        }
                        aVar2 = aVar;
                    }
                } else {
                    i12 = i10;
                    if (!z10) {
                        aVar = c0479b;
                    }
                    aVar2 = aVar;
                }
                i13 = this.f45854w1;
                aVar3 = i.f92659a;
                hVar = i.f92660b;
                if (i13 != 0) {
                    if (i13 != 1) {
                        hVar2 = aVar3;
                    } else if (i13 != 2) {
                        throw new IllegalArgumentException(g0.c("Invalid fit mode: ", i13));
                    }
                    pathMotion = getPathMotion();
                    if (pathMotion instanceof ArcMotion) {
                        cVarR = r(z10, L1, M1);
                    } else {
                        cVarR = r(z10, L1, M1);
                    }
                    d dVar3 = new d(pathMotion3, view2, rectF2, shapeAppearanceModel, f15, view3, rectF3, shapeAppearanceModel2, f16, i18, i12, i19, i110, z10, z13, aVar2, hVar2, cVarR, this.f45842j1);
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
                    cVarR = r(z10, L1, M1);
                } else {
                    cVarR = r(z10, L1, M1);
                }
                d dVar4 = new d(pathMotion3, view2, rectF2, shapeAppearanceModel, f15, view3, rectF3, shapeAppearanceModel2, f16, i18, i12, i19, i110, z10, z13, aVar2, hVar2, cVarR, this.f45842j1);
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
        return this.f45849q1;
    }

    @IdRes
    public int getDrawingViewId() {
        return this.f45846n1;
    }

    @ColorInt
    public int getEndContainerColor() {
        return this.f45850s1;
    }

    public float getEndElevation() {
        return this.H1;
    }

    @Nullable
    public ShapeAppearanceModel getEndShapeAppearanceModel() {
        return this.A1;
    }

    @Nullable
    public View getEndView() {
        return this.f45856y1;
    }

    @IdRes
    public int getEndViewId() {
        return this.f45848p1;
    }

    public int getFadeMode() {
        return this.f45853v1;
    }

    @Nullable
    public ProgressThresholds getFadeProgressThresholds() {
        return this.B1;
    }

    public int getFitMode() {
        return this.f45854w1;
    }

    @Nullable
    public ProgressThresholds getScaleMaskProgressThresholds() {
        return this.D1;
    }

    @Nullable
    public ProgressThresholds getScaleProgressThresholds() {
        return this.C1;
    }

    @ColorInt
    public int getScrimColor() {
        return this.f45851t1;
    }

    @Nullable
    public ProgressThresholds getShapeMaskProgressThresholds() {
        return this.E1;
    }

    @ColorInt
    public int getStartContainerColor() {
        return this.r1;
    }

    public float getStartElevation() {
        return this.G1;
    }

    @Nullable
    public ShapeAppearanceModel getStartShapeAppearanceModel() {
        return this.f45857z1;
    }

    @Nullable
    public View getStartView() {
        return this.f45855x1;
    }

    @IdRes
    public int getStartViewId() {
        return this.f45847o1;
    }

    public int getTransitionDirection() {
        return this.f45852u1;
    }

    @Override // androidx.transition.Transition
    @Nullable
    public String[] getTransitionProperties() {
        return I1;
    }

    public boolean isDrawDebugEnabled() {
        return this.f45842j1;
    }

    public boolean isElevationShadowEnabled() {
        return this.F1;
    }

    public boolean isHoldAtEndEnabled() {
        return this.f45843k1;
    }

    public final c r(boolean z10, c cVar, c cVar2) {
        if (!z10) {
            cVar = cVar2;
        }
        ProgressThresholds progressThresholds = this.B1;
        ProgressThresholds progressThresholds2 = cVar.f45866a;
        RectF rectF = p.f92677a;
        if (progressThresholds == null) {
            progressThresholds = progressThresholds2;
        }
        ProgressThresholds progressThresholds3 = this.C1;
        if (progressThresholds3 == null) {
            progressThresholds3 = cVar.f45867b;
        }
        ProgressThresholds progressThresholds4 = this.D1;
        if (progressThresholds4 == null) {
            progressThresholds4 = cVar.f45868c;
        }
        ProgressThresholds progressThresholds5 = this.E1;
        if (progressThresholds5 == null) {
            progressThresholds5 = cVar.f45869d;
        }
        return new c(progressThresholds, progressThresholds3, progressThresholds4, progressThresholds5);
    }

    public final void s(Context context, boolean z10) {
        int i10;
        int iResolveThemeDuration;
        int i11 = com.google.android.material.R.attr.motionEasingEmphasizedInterpolator;
        TimeInterpolator timeInterpolator = AnimationUtils.FAST_OUT_SLOW_IN_INTERPOLATOR;
        RectF rectF = p.f92677a;
        if (i11 != 0 && getInterpolator() == null) {
            setInterpolator(MotionUtils.resolveThemeInterpolator(context, i11, timeInterpolator));
        }
        int i12 = z10 ? com.google.android.material.R.attr.motionDurationLong2 : com.google.android.material.R.attr.motionDurationMedium4;
        if (i12 != 0 && getDuration() == -1 && (iResolveThemeDuration = MotionUtils.resolveThemeDuration(context, i12, -1)) != -1) {
            setDuration(iResolveThemeDuration);
        }
        if (this.f45844l1 || (i10 = com.google.android.material.R.attr.motionPath) == 0) {
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

    public void setAllContainerColors(@ColorInt int i10) {
        this.f45849q1 = i10;
        this.r1 = i10;
        this.f45850s1 = i10;
    }

    public void setContainerColor(@ColorInt int i10) {
        this.f45849q1 = i10;
    }

    public void setDrawDebugEnabled(boolean z10) {
        this.f45842j1 = z10;
    }

    public void setDrawingViewId(@IdRes int i10) {
        this.f45846n1 = i10;
    }

    public void setElevationShadowEnabled(boolean z10) {
        this.F1 = z10;
    }

    public void setEndContainerColor(@ColorInt int i10) {
        this.f45850s1 = i10;
    }

    public void setEndElevation(float f6) {
        this.H1 = f6;
    }

    public void setEndShapeAppearanceModel(@Nullable ShapeAppearanceModel shapeAppearanceModel) {
        this.A1 = shapeAppearanceModel;
    }

    public void setEndView(@Nullable View view) {
        this.f45856y1 = view;
    }

    public void setEndViewId(@IdRes int i10) {
        this.f45848p1 = i10;
    }

    public void setFadeMode(int i10) {
        this.f45853v1 = i10;
    }

    public void setFadeProgressThresholds(@Nullable ProgressThresholds progressThresholds) {
        this.B1 = progressThresholds;
    }

    public void setFitMode(int i10) {
        this.f45854w1 = i10;
    }

    public void setHoldAtEndEnabled(boolean z10) {
        this.f45843k1 = z10;
    }

    @Override // androidx.transition.Transition
    public void setPathMotion(@Nullable PathMotion pathMotion) {
        super.setPathMotion(pathMotion);
        this.f45844l1 = true;
    }

    public void setScaleMaskProgressThresholds(@Nullable ProgressThresholds progressThresholds) {
        this.D1 = progressThresholds;
    }

    public void setScaleProgressThresholds(@Nullable ProgressThresholds progressThresholds) {
        this.C1 = progressThresholds;
    }

    public void setScrimColor(@ColorInt int i10) {
        this.f45851t1 = i10;
    }

    public void setShapeMaskProgressThresholds(@Nullable ProgressThresholds progressThresholds) {
        this.E1 = progressThresholds;
    }

    public void setStartContainerColor(@ColorInt int i10) {
        this.r1 = i10;
    }

    public void setStartElevation(float f6) {
        this.G1 = f6;
    }

    public void setStartShapeAppearanceModel(@Nullable ShapeAppearanceModel shapeAppearanceModel) {
        this.f45857z1 = shapeAppearanceModel;
    }

    public void setStartView(@Nullable View view) {
        this.f45855x1 = view;
    }

    public void setStartViewId(@IdRes int i10) {
        this.f45847o1 = i10;
    }

    public void setTransitionDirection(int i10) {
        this.f45852u1 = i10;
    }

    public MaterialContainerTransform(@NonNull Context context, boolean z10) {
        this.f45842j1 = false;
        this.f45843k1 = false;
        this.f45844l1 = false;
        this.f45845m1 = false;
        this.f45846n1 = R.id.content;
        this.f45847o1 = -1;
        this.f45848p1 = -1;
        this.f45849q1 = 0;
        this.r1 = 0;
        this.f45850s1 = 0;
        this.f45851t1 = 1375731712;
        this.f45852u1 = 0;
        this.f45853v1 = 0;
        this.f45854w1 = 0;
        this.F1 = Build.VERSION.SDK_INT >= 28;
        this.G1 = -1.0f;
        this.H1 = -1.0f;
        s(context, z10);
        this.f45845m1 = true;
    }
}

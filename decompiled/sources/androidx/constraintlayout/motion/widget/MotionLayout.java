package androidx.constraintlayout.motion.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.DashPathEffect;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Bundle;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.util.SparseIntArray;
import android.view.Display;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnimationUtils;
import android.view.animation.BounceInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.view.animation.OvershootInterpolator;
import androidx.annotation.IdRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.g0;
import androidx.camera.camera2.internal.compat.u;
import androidx.constraintlayout.core.motion.utils.CurveFit;
import androidx.constraintlayout.core.motion.utils.Easing;
import androidx.constraintlayout.core.motion.utils.KeyCache;
import androidx.constraintlayout.core.motion.utils.VelocityMatrix;
import androidx.constraintlayout.core.widgets.Barrier;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import androidx.constraintlayout.core.widgets.ConstraintWidgetContainer;
import androidx.constraintlayout.core.widgets.Flow;
import androidx.constraintlayout.core.widgets.Guideline;
import androidx.constraintlayout.core.widgets.Helper;
import androidx.constraintlayout.core.widgets.HelperWidget;
import androidx.constraintlayout.core.widgets.Placeholder;
import androidx.constraintlayout.core.widgets.VirtualLayout;
import androidx.constraintlayout.motion.utils.StopLogic;
import androidx.constraintlayout.motion.utils.ViewOscillator;
import androidx.constraintlayout.motion.utils.ViewSpline;
import androidx.constraintlayout.motion.utils.ViewState;
import androidx.constraintlayout.widget.ConstraintHelper;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.ConstraintLayoutStates;
import androidx.constraintlayout.widget.ConstraintSet;
import androidx.constraintlayout.widget.Constraints;
import androidx.constraintlayout.widget.R;
import androidx.constraintlayout.widget.StateSet;
import androidx.core.internal.view.SupportMenu;
import androidx.core.view.NestedScrollingParent3;
import androidx.core.view.ViewCompat;
import androidx.core.widget.NestedScrollView;
import com.bbva.glomohybrid.base.deeplink.extensions.DeepLinkExtensionsKt;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes.dex */
public class MotionLayout extends ConstraintLayout implements NestedScrollingParent3 {
    public static final int DEBUG_SHOW_NONE = 0;
    public static final int DEBUG_SHOW_PATH = 2;
    public static final int DEBUG_SHOW_PROGRESS = 1;
    public static boolean IS_IN_EDIT_MODE = false;
    public static final int TOUCH_UP_COMPLETE = 0;
    public static final int TOUCH_UP_COMPLETE_TO_END = 2;
    public static final int TOUCH_UP_COMPLETE_TO_START = 1;
    public static final int TOUCH_UP_DECELERATE = 4;
    public static final int TOUCH_UP_DECELERATE_AND_COMPLETE = 5;
    public static final int TOUCH_UP_NEVER_TO_END = 7;
    public static final int TOUCH_UP_NEVER_TO_START = 6;
    public static final int TOUCH_UP_STOP = 3;
    public static final int VELOCITY_LAYOUT = 1;
    public static final int VELOCITY_POST_LAYOUT = 0;
    public static final int VELOCITY_STATIC_LAYOUT = 3;
    public static final int VELOCITY_STATIC_POST_LAYOUT = 2;
    public final HashMap<View, ViewState> A1;
    public int B1;
    public int C1;
    public int D1;
    public final HashMap<View, MotionController> E0;
    public final Rect E1;
    public long F0;
    public boolean F1;
    public float G0;
    public j G1;
    public float H0;
    public final g H1;
    public float I0;
    public boolean I1;
    public long J0;
    public final RectF J1;
    public float K0;
    public View K1;
    public boolean L0;
    public Matrix L1;
    public boolean M0;
    public final ArrayList<Integer> M1;
    public TransitionListener N0;
    public int O0;
    public f P0;
    public boolean Q0;
    public final StopLogic R0;
    public final e S0;
    public DesignTool T0;
    public int U0;
    public int V0;
    public boolean W0;
    public float X0;
    public float Y0;
    public long Z0;

    /* JADX INFO: renamed from: a1, reason: collision with root package name */
    public float f19416a1;

    /* JADX INFO: renamed from: b1, reason: collision with root package name */
    public boolean f19417b1;

    /* JADX INFO: renamed from: c1, reason: collision with root package name */
    public ArrayList<MotionHelper> f19418c1;

    /* JADX INFO: renamed from: d1, reason: collision with root package name */
    public ArrayList<MotionHelper> f19419d1;

    /* JADX INFO: renamed from: e1, reason: collision with root package name */
    public ArrayList<MotionHelper> f19420e1;

    /* JADX INFO: renamed from: f1, reason: collision with root package name */
    public CopyOnWriteArrayList<TransitionListener> f19421f1;

    /* JADX INFO: renamed from: g1, reason: collision with root package name */
    public int f19422g1;

    /* JADX INFO: renamed from: h1, reason: collision with root package name */
    public long f19423h1;

    /* JADX INFO: renamed from: i1, reason: collision with root package name */
    public float f19424i1;

    /* JADX INFO: renamed from: j1, reason: collision with root package name */
    public int f19425j1;

    /* JADX INFO: renamed from: k1, reason: collision with root package name */
    public float f19426k1;

    /* JADX INFO: renamed from: l1, reason: collision with root package name */
    public int f19427l1;

    /* JADX INFO: renamed from: m1, reason: collision with root package name */
    public int f19428m1;
    protected boolean mMeasureDuringTransition;

    /* JADX INFO: renamed from: n1, reason: collision with root package name */
    public int f19429n1;

    /* JADX INFO: renamed from: o1, reason: collision with root package name */
    public int f19430o1;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public MotionScene f19431p0;

    /* JADX INFO: renamed from: p1, reason: collision with root package name */
    public int f19432p1;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public MotionInterpolator f19433q0;

    /* JADX INFO: renamed from: q1, reason: collision with root package name */
    public int f19434q1;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public Interpolator f19435r0;
    public float r1;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public float f19436s0;

    /* JADX INFO: renamed from: s1, reason: collision with root package name */
    public final KeyCache f19437s1;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public int f19438t0;

    /* JADX INFO: renamed from: t1, reason: collision with root package name */
    public boolean f19439t1;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public int f19440u0;

    /* JADX INFO: renamed from: u1, reason: collision with root package name */
    public i f19441u1;
    public int v0;

    /* JADX INFO: renamed from: v1, reason: collision with root package name */
    public Runnable f19442v1;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public int f19443w0;

    /* JADX INFO: renamed from: w1, reason: collision with root package name */
    public int[] f19444w1;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public int f19445x0;

    /* JADX INFO: renamed from: x1, reason: collision with root package name */
    public int f19446x1;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    public boolean f19447y0;

    /* JADX INFO: renamed from: y1, reason: collision with root package name */
    public boolean f19448y1;

    /* JADX INFO: renamed from: z1, reason: collision with root package name */
    public int f19449z1;

    public interface MotionTracker {
        void addMovement(MotionEvent motionEvent);

        void clear();

        void computeCurrentVelocity(int i10);

        void computeCurrentVelocity(int i10, float f6);

        float getXVelocity();

        float getXVelocity(int i10);

        float getYVelocity();

        float getYVelocity(int i10);

        void recycle();
    }

    public interface TransitionListener {
        void onTransitionChange(MotionLayout motionLayout, int i10, int i11, float f6);

        void onTransitionCompleted(MotionLayout motionLayout, int i10);

        void onTransitionStarted(MotionLayout motionLayout, int i10, int i11);

        void onTransitionTrigger(MotionLayout motionLayout, int i10, boolean z10, float f6);
    }

    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            MotionLayout.this.f19441u1.a();
        }
    }

    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            MotionLayout.this.f19448y1 = false;
        }
    }

    public class c implements Runnable {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ View f19452p0;

        public c(View view) {
            this.f19452p0 = view;
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.f19452p0.setNestedScrollingEnabled(true);
        }
    }

    public class d implements Runnable {
        public d() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            MotionLayout.this.f19441u1.a();
        }
    }

    public class e extends MotionInterpolator {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public float f19454a = 0.0f;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public float f19455b = 0.0f;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public float f19456c;

        public e() {
        }

        @Override // androidx.constraintlayout.motion.widget.MotionInterpolator, android.animation.TimeInterpolator
        public final float getInterpolation(float f6) {
            float f10 = this.f19454a;
            MotionLayout motionLayout = MotionLayout.this;
            if (f10 > 0.0f) {
                float f11 = this.f19456c;
                if (f10 / f11 < f6) {
                    f6 = f10 / f11;
                }
                motionLayout.f19436s0 = f10 - (f11 * f6);
                return ((f10 * f6) - (((f11 * f6) * f6) / 2.0f)) + this.f19455b;
            }
            float f12 = this.f19456c;
            if ((-f10) / f12 < f6) {
                f6 = (-f10) / f12;
            }
            motionLayout.f19436s0 = (f12 * f6) + f10;
            return (((f12 * f6) * f6) / 2.0f) + (f10 * f6) + this.f19455b;
        }

        @Override // androidx.constraintlayout.motion.widget.MotionInterpolator
        public final float getVelocity() {
            return MotionLayout.this.f19436s0;
        }
    }

    public class f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public float[] f19458a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int[] f19459b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final float[] f19460c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public Path f19461d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final Paint f19462e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final Paint f19463f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final Paint f19464g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final Paint f19465h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final Paint f19466i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final float[] f19467j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public int f19468k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public final Rect f19469l = new Rect();
        public final int m = 1;

        public f() {
            Paint paint = new Paint();
            this.f19462e = paint;
            paint.setAntiAlias(true);
            paint.setColor(-21965);
            paint.setStrokeWidth(2.0f);
            Paint.Style style = Paint.Style.STROKE;
            paint.setStyle(style);
            Paint paint2 = new Paint();
            this.f19463f = paint2;
            paint2.setAntiAlias(true);
            paint2.setColor(-2067046);
            paint2.setStrokeWidth(2.0f);
            paint2.setStyle(style);
            Paint paint3 = new Paint();
            this.f19464g = paint3;
            paint3.setAntiAlias(true);
            paint3.setColor(-13391360);
            paint3.setStrokeWidth(2.0f);
            paint3.setStyle(style);
            Paint paint4 = new Paint();
            this.f19465h = paint4;
            paint4.setAntiAlias(true);
            paint4.setColor(-13391360);
            paint4.setTextSize(MotionLayout.this.getContext().getResources().getDisplayMetrics().density * 12.0f);
            this.f19467j = new float[8];
            Paint paint5 = new Paint();
            this.f19466i = paint5;
            paint5.setAntiAlias(true);
            paint3.setPathEffect(new DashPathEffect(new float[]{4.0f, 8.0f}, 0.0f));
            this.f19460c = new float[100];
            this.f19459b = new int[50];
        }

        public final void a(Canvas canvas, int i10, int i11, MotionController motionController) {
            int width;
            int height;
            int[] iArr = this.f19459b;
            int i12 = 4;
            if (i10 == 4) {
                boolean z10 = false;
                boolean z11 = false;
                for (int i13 = 0; i13 < this.f19468k; i13++) {
                    int i14 = iArr[i13];
                    if (i14 == 1) {
                        z10 = true;
                    }
                    if (i14 == 0) {
                        z11 = true;
                    }
                }
                if (z10) {
                    float[] fArr = this.f19458a;
                    canvas.drawLine(fArr[0], fArr[1], fArr[fArr.length - 2], fArr[fArr.length - 1], this.f19464g);
                }
                if (z11) {
                    b(canvas);
                }
            }
            if (i10 == 2) {
                float[] fArr2 = this.f19458a;
                canvas.drawLine(fArr2[0], fArr2[1], fArr2[fArr2.length - 2], fArr2[fArr2.length - 1], this.f19464g);
            }
            if (i10 == 3) {
                b(canvas);
            }
            canvas.drawLines(this.f19458a, this.f19462e);
            View view = motionController.f19389b;
            if (view != null) {
                width = view.getWidth();
                height = motionController.f19389b.getHeight();
            } else {
                width = 0;
                height = 0;
            }
            int i15 = 1;
            while (i15 < i11 - 1) {
                if (i10 == i12 && iArr[i15 - 1] == 0) {
                    i15 = i15;
                } else {
                    int i16 = i15 * 2;
                    float[] fArr3 = this.f19460c;
                    float f6 = fArr3[i16];
                    float f10 = fArr3[i16 + 1];
                    this.f19461d.reset();
                    this.f19461d.moveTo(f6, f10 + 10.0f);
                    this.f19461d.lineTo(f6 + 10.0f, f10);
                    this.f19461d.lineTo(f6, f10 - 10.0f);
                    this.f19461d.lineTo(f6 - 10.0f, f10);
                    this.f19461d.close();
                    int i17 = i15 - 1;
                    motionController.f19407u.get(i17);
                    Paint paint = this.f19466i;
                    if (i10 == i12) {
                        int i18 = iArr[i17];
                        if (i18 == 1) {
                            d(canvas, f6 - 0.0f, f10 - 0.0f);
                        } else if (i18 == 0) {
                            c(canvas, f6 - 0.0f, f10 - 0.0f);
                        } else {
                            if (i18 == 2) {
                                e(canvas, f6 - 0.0f, f10 - 0.0f, width, height);
                            }
                            canvas.drawPath(this.f19461d, paint);
                        }
                        canvas.drawPath(this.f19461d, paint);
                    } else {
                        paint = paint;
                        f10 = f10;
                        f6 = f6;
                        i15 = i15;
                    }
                    if (i10 == 2) {
                        d(canvas, f6 - 0.0f, f10 - 0.0f);
                    }
                    if (i10 == 3) {
                        c(canvas, f6 - 0.0f, f10 - 0.0f);
                    }
                    if (i10 == 6) {
                        e(canvas, f6 - 0.0f, f10 - 0.0f, width, height);
                    }
                    canvas.drawPath(this.f19461d, paint);
                }
                i15++;
                i12 = 4;
            }
            float[] fArr4 = this.f19458a;
            if (fArr4.length > 1) {
                float f11 = fArr4[0];
                float f12 = fArr4[1];
                Paint paint2 = this.f19463f;
                canvas.drawCircle(f11, f12, 8.0f, paint2);
                float[] fArr5 = this.f19458a;
                canvas.drawCircle(fArr5[fArr5.length - 2], fArr5[fArr5.length - 1], 8.0f, paint2);
            }
        }

        public final void b(Canvas canvas) {
            float[] fArr = this.f19458a;
            float f6 = fArr[0];
            float f10 = fArr[1];
            float f11 = fArr[fArr.length - 2];
            float f12 = fArr[fArr.length - 1];
            float fMin = Math.min(f6, f11);
            float fMax = Math.max(f10, f12);
            float fMax2 = Math.max(f6, f11);
            float fMax3 = Math.max(f10, f12);
            Paint paint = this.f19464g;
            canvas.drawLine(fMin, fMax, fMax2, fMax3, paint);
            canvas.drawLine(Math.min(f6, f11), Math.min(f10, f12), Math.min(f6, f11), Math.max(f10, f12), paint);
        }

        public final void c(Canvas canvas, float f6, float f10) {
            float[] fArr = this.f19458a;
            float f11 = fArr[0];
            float f12 = fArr[1];
            float f13 = fArr[fArr.length - 2];
            float f14 = fArr[fArr.length - 1];
            float fMin = Math.min(f11, f13);
            float fMax = Math.max(f12, f14);
            float fMin2 = f6 - Math.min(f11, f13);
            float fMax2 = Math.max(f12, f14) - f10;
            String str = "" + (((int) (((double) ((fMin2 * 100.0f) / Math.abs(f13 - f11))) + 0.5d)) / 100.0f);
            Paint paint = this.f19465h;
            paint.getTextBounds(str, 0, str.length(), this.f19469l);
            Rect rect = this.f19469l;
            canvas.drawText(str, ((fMin2 / 2.0f) - (rect.width() / 2)) + fMin, f10 - 20.0f, paint);
            float fMin3 = Math.min(f11, f13);
            Paint paint2 = this.f19464g;
            canvas.drawLine(f6, f10, fMin3, f10, paint2);
            String str2 = "" + (((int) (((double) ((fMax2 * 100.0f) / Math.abs(f14 - f12))) + 0.5d)) / 100.0f);
            paint.getTextBounds(str2, 0, str2.length(), this.f19469l);
            canvas.drawText(str2, f6 + 5.0f, fMax - ((fMax2 / 2.0f) - (rect.height() / 2)), paint);
            canvas.drawLine(f6, f10, f6, Math.max(f12, f14), paint2);
        }

        public final void d(Canvas canvas, float f6, float f10) {
            float[] fArr = this.f19458a;
            float f11 = fArr[0];
            float f12 = fArr[1];
            float f13 = fArr[fArr.length - 2];
            float f14 = fArr[fArr.length - 1];
            float fHypot = (float) Math.hypot(f11 - f13, f12 - f14);
            float f15 = f13 - f11;
            float f16 = f14 - f12;
            float f17 = (((f10 - f12) * f16) + ((f6 - f11) * f15)) / (fHypot * fHypot);
            float f18 = f11 + (f15 * f17);
            float f19 = f12 + (f17 * f16);
            Path path = new Path();
            path.moveTo(f6, f10);
            path.lineTo(f18, f19);
            float fHypot2 = (float) Math.hypot(f18 - f6, f19 - f10);
            String str = "" + (((int) ((fHypot2 * 100.0f) / fHypot)) / 100.0f);
            Paint paint = this.f19465h;
            paint.getTextBounds(str, 0, str.length(), this.f19469l);
            canvas.drawTextOnPath(str, path, (fHypot2 / 2.0f) - (this.f19469l.width() / 2), -20.0f, paint);
            canvas.drawLine(f6, f10, f18, f19, this.f19464g);
        }

        public final void e(Canvas canvas, float f6, float f10, int i10, int i11) {
            StringBuilder sb2 = new StringBuilder("");
            MotionLayout motionLayout = MotionLayout.this;
            sb2.append(((int) (((double) (((f6 - (i10 / 2)) * 100.0f) / (motionLayout.getWidth() - i10))) + 0.5d)) / 100.0f);
            String string = sb2.toString();
            Paint paint = this.f19465h;
            paint.getTextBounds(string, 0, string.length(), this.f19469l);
            Rect rect = this.f19469l;
            canvas.drawText(string, ((f6 / 2.0f) - (rect.width() / 2)) + 0.0f, f10 - 20.0f, paint);
            float fMin = Math.min(0.0f, 1.0f);
            Paint paint2 = this.f19464g;
            canvas.drawLine(f6, f10, fMin, f10, paint2);
            String str = "" + (((int) (((double) (((f10 - (i11 / 2)) * 100.0f) / (motionLayout.getHeight() - i11))) + 0.5d)) / 100.0f);
            paint.getTextBounds(str, 0, str.length(), this.f19469l);
            canvas.drawText(str, f6 + 5.0f, 0.0f - ((f10 / 2.0f) - (rect.height() / 2)), paint);
            canvas.drawLine(f6, f10, f6, Math.max(0.0f, 1.0f), paint2);
        }
    }

    public class g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public ConstraintWidgetContainer f19471a = new ConstraintWidgetContainer();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public ConstraintWidgetContainer f19472b = new ConstraintWidgetContainer();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public ConstraintSet f19473c = null;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public ConstraintSet f19474d = null;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f19475e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f19476f;

        public g() {
        }

        public static void c(ConstraintWidgetContainer constraintWidgetContainer, ConstraintWidgetContainer constraintWidgetContainer2) {
            ConstraintWidget helperWidget;
            ArrayList<ConstraintWidget> children = constraintWidgetContainer.getChildren();
            HashMap<ConstraintWidget, ConstraintWidget> map = new HashMap<>();
            map.put(constraintWidgetContainer, constraintWidgetContainer2);
            constraintWidgetContainer2.getChildren().clear();
            constraintWidgetContainer2.copy(constraintWidgetContainer, map);
            for (ConstraintWidget constraintWidget : children) {
                if (constraintWidget instanceof Barrier) {
                    helperWidget = new Barrier();
                } else if (constraintWidget instanceof Guideline) {
                    helperWidget = new Guideline();
                } else if (constraintWidget instanceof Flow) {
                    helperWidget = new Flow();
                } else if (constraintWidget instanceof Placeholder) {
                    helperWidget = new Placeholder();
                } else {
                    helperWidget = constraintWidget instanceof Helper ? new HelperWidget() : new ConstraintWidget();
                }
                constraintWidgetContainer2.add(helperWidget);
                map.put(constraintWidget, helperWidget);
            }
            for (ConstraintWidget constraintWidget2 : children) {
                map.get(constraintWidget2).copy(constraintWidget2, map);
            }
        }

        public static ConstraintWidget d(ConstraintWidgetContainer constraintWidgetContainer, View view) {
            if (constraintWidgetContainer.getCompanionWidget() == view) {
                return constraintWidgetContainer;
            }
            ArrayList<ConstraintWidget> children = constraintWidgetContainer.getChildren();
            int size = children.size();
            for (int i10 = 0; i10 < size; i10++) {
                ConstraintWidget constraintWidget = children.get(i10);
                if (constraintWidget.getCompanionWidget() == view) {
                    return constraintWidget;
                }
            }
            return null;
        }

        public final void a() {
            Interpolator interpolatorLoadInterpolator;
            MotionLayout motionLayout = MotionLayout.this;
            int childCount = motionLayout.getChildCount();
            motionLayout.E0.clear();
            SparseArray sparseArray = new SparseArray();
            int[] iArr = new int[childCount];
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = motionLayout.getChildAt(i10);
                MotionController motionController = new MotionController(childAt);
                int id = childAt.getId();
                iArr[i10] = id;
                sparseArray.put(id, motionController);
                motionLayout.E0.put(childAt, motionController);
            }
            for (int i11 = 0; i11 < childCount; i11++) {
                View childAt2 = motionLayout.getChildAt(i11);
                MotionController motionController2 = motionLayout.E0.get(childAt2);
                if (motionController2 != null) {
                    if (this.f19473c != null) {
                        ConstraintWidget constraintWidgetD = d(this.f19471a, childAt2);
                        if (constraintWidgetD != null) {
                            Rect rectA = MotionLayout.a(motionLayout, constraintWidgetD);
                            ConstraintSet constraintSet = this.f19473c;
                            int width = motionLayout.getWidth();
                            int height = motionLayout.getHeight();
                            int i12 = constraintSet.mRotate;
                            if (i12 != 0) {
                                MotionController.i(i12, width, height, rectA, motionController2.f19388a);
                            }
                            androidx.constraintlayout.motion.widget.d dVar = motionController2.f19393f;
                            dVar.f19595r0 = 0.0f;
                            dVar.f19596s0 = 0.0f;
                            motionController2.h(dVar);
                            dVar.f(rectA.left, rectA.top, rectA.width(), rectA.height());
                            ConstraintSet.Constraint parameters = constraintSet.getParameters(motionController2.f19390c);
                            dVar.a(parameters);
                            motionController2.f19399l = parameters.motion.mMotionStagger;
                            motionController2.f19395h.d(rectA, constraintSet, i12, motionController2.f19390c);
                            motionController2.C = parameters.transform.transformPivotTarget;
                            ConstraintSet.Motion motion = parameters.motion;
                            motionController2.E = motion.mQuantizeMotionSteps;
                            motionController2.F = motion.mQuantizeMotionPhase;
                            Context context = motionController2.f19389b.getContext();
                            ConstraintSet.Motion motion2 = parameters.motion;
                            int i13 = motion2.mQuantizeInterpolatorType;
                            String str = motion2.mQuantizeInterpolatorString;
                            int i14 = motion2.mQuantizeInterpolatorID;
                            if (i13 == -2) {
                                interpolatorLoadInterpolator = AnimationUtils.loadInterpolator(context, i14);
                            } else if (i13 == -1) {
                                interpolatorLoadInterpolator = new androidx.constraintlayout.motion.widget.c(Easing.getInterpolator(str));
                            } else if (i13 == 0) {
                                interpolatorLoadInterpolator = new AccelerateDecelerateInterpolator();
                            } else if (i13 == 1) {
                                interpolatorLoadInterpolator = new AccelerateInterpolator();
                            } else if (i13 == 2) {
                                interpolatorLoadInterpolator = new DecelerateInterpolator();
                            } else if (i13 != 4) {
                                interpolatorLoadInterpolator = i13 != 5 ? null : new OvershootInterpolator();
                            } else {
                                interpolatorLoadInterpolator = new BounceInterpolator();
                            }
                            motionController2.G = interpolatorLoadInterpolator;
                        } else if (motionLayout.O0 != 0) {
                            Debug.getLocation();
                            Debug.getName(childAt2);
                            childAt2.getClass();
                        }
                    } else if (motionLayout.f19448y1) {
                        motionController2.setStartState(motionLayout.A1.get(childAt2), childAt2, motionLayout.f19449z1, motionLayout.B1, motionLayout.C1);
                    }
                    if (this.f19474d != null) {
                        ConstraintWidget constraintWidgetD2 = d(this.f19472b, childAt2);
                        if (constraintWidgetD2 != null) {
                            Rect rectA2 = MotionLayout.a(motionLayout, constraintWidgetD2);
                            ConstraintSet constraintSet2 = this.f19474d;
                            int width2 = motionLayout.getWidth();
                            int height2 = motionLayout.getHeight();
                            int i15 = constraintSet2.mRotate;
                            if (i15 != 0) {
                                MotionController.i(i15, width2, height2, rectA2, motionController2.f19388a);
                                rectA2 = motionController2.f19388a;
                            }
                            androidx.constraintlayout.motion.widget.d dVar2 = motionController2.f19394g;
                            dVar2.f19595r0 = 1.0f;
                            dVar2.f19596s0 = 1.0f;
                            motionController2.h(dVar2);
                            dVar2.f(rectA2.left, rectA2.top, rectA2.width(), rectA2.height());
                            dVar2.a(constraintSet2.getParameters(motionController2.f19390c));
                            motionController2.f19396i.d(rectA2, constraintSet2, i15, motionController2.f19390c);
                        } else if (motionLayout.O0 != 0) {
                            Debug.getLocation();
                            Debug.getName(childAt2);
                            childAt2.getClass();
                        }
                    }
                }
            }
            for (int i16 = 0; i16 < childCount; i16++) {
                MotionController motionController3 = (MotionController) sparseArray.get(iArr[i16]);
                int animateRelativeTo = motionController3.getAnimateRelativeTo();
                if (animateRelativeTo != -1) {
                    motionController3.setupRelative((MotionController) sparseArray.get(animateRelativeTo));
                }
            }
        }

        public final void b(int i10, int i11) {
            MotionLayout motionLayout = MotionLayout.this;
            int optimizationLevel = motionLayout.getOptimizationLevel();
            if (motionLayout.f19440u0 == motionLayout.getStartState()) {
                ConstraintWidgetContainer constraintWidgetContainer = this.f19472b;
                ConstraintSet constraintSet = this.f19474d;
                motionLayout.resolveSystem(constraintWidgetContainer, optimizationLevel, (constraintSet == null || constraintSet.mRotate == 0) ? i10 : i11, (constraintSet == null || constraintSet.mRotate == 0) ? i11 : i10);
                ConstraintSet constraintSet2 = this.f19473c;
                if (constraintSet2 != null) {
                    ConstraintWidgetContainer constraintWidgetContainer2 = this.f19471a;
                    int i12 = constraintSet2.mRotate;
                    int i13 = i12 == 0 ? i10 : i11;
                    if (i12 == 0) {
                        i10 = i11;
                    }
                    motionLayout.resolveSystem(constraintWidgetContainer2, optimizationLevel, i13, i10);
                    return;
                }
                return;
            }
            ConstraintSet constraintSet3 = this.f19473c;
            if (constraintSet3 != null) {
                ConstraintWidgetContainer constraintWidgetContainer3 = this.f19471a;
                int i14 = constraintSet3.mRotate;
                motionLayout.resolveSystem(constraintWidgetContainer3, optimizationLevel, i14 == 0 ? i10 : i11, i14 == 0 ? i11 : i10);
            }
            ConstraintWidgetContainer constraintWidgetContainer4 = this.f19472b;
            ConstraintSet constraintSet4 = this.f19474d;
            int i15 = (constraintSet4 == null || constraintSet4.mRotate == 0) ? i10 : i11;
            if (constraintSet4 == null || constraintSet4.mRotate == 0) {
                i10 = i11;
            }
            motionLayout.resolveSystem(constraintWidgetContainer4, optimizationLevel, i15, i10);
        }

        public final void e(ConstraintSet constraintSet, ConstraintSet constraintSet2) {
            this.f19473c = constraintSet;
            this.f19474d = constraintSet2;
            this.f19471a = new ConstraintWidgetContainer();
            this.f19472b = new ConstraintWidgetContainer();
            ConstraintWidgetContainer constraintWidgetContainer = this.f19471a;
            MotionLayout motionLayout = MotionLayout.this;
            constraintWidgetContainer.setMeasurer(((ConstraintLayout) motionLayout).mLayoutWidget.getMeasurer());
            this.f19472b.setMeasurer(((ConstraintLayout) motionLayout).mLayoutWidget.getMeasurer());
            this.f19471a.removeAllChildren();
            this.f19472b.removeAllChildren();
            c(((ConstraintLayout) motionLayout).mLayoutWidget, this.f19471a);
            c(((ConstraintLayout) motionLayout).mLayoutWidget, this.f19472b);
            if (motionLayout.I0 > 0.5d) {
                if (constraintSet != null) {
                    g(this.f19471a, constraintSet);
                }
                g(this.f19472b, constraintSet2);
            } else {
                g(this.f19472b, constraintSet2);
                if (constraintSet != null) {
                    g(this.f19471a, constraintSet);
                }
            }
            this.f19471a.setRtl(motionLayout.isRtl());
            this.f19471a.updateHierarchy();
            this.f19472b.setRtl(motionLayout.isRtl());
            this.f19472b.updateHierarchy();
            ViewGroup.LayoutParams layoutParams = motionLayout.getLayoutParams();
            if (layoutParams != null) {
                if (layoutParams.width == -2) {
                    ConstraintWidgetContainer constraintWidgetContainer2 = this.f19471a;
                    ConstraintWidget.DimensionBehaviour dimensionBehaviour = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
                    constraintWidgetContainer2.setHorizontalDimensionBehaviour(dimensionBehaviour);
                    this.f19472b.setHorizontalDimensionBehaviour(dimensionBehaviour);
                }
                if (layoutParams.height == -2) {
                    ConstraintWidgetContainer constraintWidgetContainer3 = this.f19471a;
                    ConstraintWidget.DimensionBehaviour dimensionBehaviour2 = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
                    constraintWidgetContainer3.setVerticalDimensionBehaviour(dimensionBehaviour2);
                    this.f19472b.setVerticalDimensionBehaviour(dimensionBehaviour2);
                }
            }
        }

        public final void f() {
            HashMap<View, MotionController> map;
            MotionLayout motionLayout = MotionLayout.this;
            int i10 = motionLayout.f19443w0;
            int i11 = motionLayout.f19445x0;
            int mode = View.MeasureSpec.getMode(i10);
            int mode2 = View.MeasureSpec.getMode(i11);
            motionLayout.f19432p1 = mode;
            motionLayout.f19434q1 = mode2;
            b(i10, i11);
            int i12 = 0;
            if (!(motionLayout.getParent() instanceof MotionLayout) || mode != 1073741824 || mode2 != 1073741824) {
                b(i10, i11);
                motionLayout.f19427l1 = this.f19471a.getWidth();
                motionLayout.f19428m1 = this.f19471a.getHeight();
                motionLayout.f19429n1 = this.f19472b.getWidth();
                int height = this.f19472b.getHeight();
                motionLayout.f19430o1 = height;
                motionLayout.mMeasureDuringTransition = (motionLayout.f19427l1 == motionLayout.f19429n1 && motionLayout.f19428m1 == height) ? false : true;
            }
            int i13 = motionLayout.f19427l1;
            int i14 = motionLayout.f19428m1;
            int i15 = motionLayout.f19432p1;
            if (i15 == Integer.MIN_VALUE || i15 == 0) {
                i13 = (int) ((motionLayout.r1 * (motionLayout.f19429n1 - i13)) + i13);
            }
            int i16 = i13;
            int i17 = motionLayout.f19434q1;
            MotionLayout.this.resolveMeasuredDimension(i10, i11, i16, (i17 == Integer.MIN_VALUE || i17 == 0) ? (int) ((motionLayout.r1 * (motionLayout.f19430o1 - i14)) + i14) : i14, this.f19471a.isWidthMeasuredTooSmall() || this.f19472b.isWidthMeasuredTooSmall(), this.f19471a.isHeightMeasuredTooSmall() || this.f19472b.isHeightMeasuredTooSmall());
            int childCount = motionLayout.getChildCount();
            motionLayout.H1.a();
            motionLayout.M0 = true;
            SparseArray sparseArray = new SparseArray();
            int i18 = 0;
            while (true) {
                map = motionLayout.E0;
                if (i18 >= childCount) {
                    break;
                }
                View childAt = motionLayout.getChildAt(i18);
                sparseArray.put(childAt.getId(), map.get(childAt));
                i18++;
            }
            int width = motionLayout.getWidth();
            int height2 = motionLayout.getHeight();
            int iGatPathMotionArc = motionLayout.f19431p0.gatPathMotionArc();
            if (iGatPathMotionArc != -1) {
                for (int i19 = 0; i19 < childCount; i19++) {
                    MotionController motionController = map.get(motionLayout.getChildAt(i19));
                    if (motionController != null) {
                        motionController.setPathMotionArc(iGatPathMotionArc);
                    }
                }
            }
            SparseBooleanArray sparseBooleanArray = new SparseBooleanArray();
            int[] iArr = new int[map.size()];
            int i20 = 0;
            for (int i21 = 0; i21 < childCount; i21++) {
                MotionController motionController2 = map.get(motionLayout.getChildAt(i21));
                if (motionController2.getAnimateRelativeTo() != -1) {
                    sparseBooleanArray.put(motionController2.getAnimateRelativeTo(), true);
                    iArr[i20] = motionController2.getAnimateRelativeTo();
                    i20++;
                }
            }
            if (motionLayout.f19420e1 != null) {
                for (int i22 = 0; i22 < i20; i22++) {
                    MotionController motionController3 = map.get(motionLayout.findViewById(iArr[i22]));
                    if (motionController3 != null) {
                        motionLayout.f19431p0.getKeyFrames(motionController3);
                    }
                }
                Iterator<MotionHelper> it = motionLayout.f19420e1.iterator();
                while (it.hasNext()) {
                    it.next().onPreSetup(motionLayout, map);
                }
                int i23 = 0;
                while (i23 < i20) {
                    MotionController motionController4 = map.get(motionLayout.findViewById(iArr[i23]));
                    if (motionController4 != null) {
                        motionController4.setup(width, height2, motionLayout.G0, motionLayout.getNanoTime());
                    }
                    i23++;
                    i20 = i20;
                }
            } else {
                int i24 = i20;
                for (int i25 = 0; i25 < i24; i25++) {
                    MotionController motionController5 = map.get(motionLayout.findViewById(iArr[i25]));
                    if (motionController5 != null) {
                        motionLayout.f19431p0.getKeyFrames(motionController5);
                        motionController5.setup(width, height2, motionLayout.G0, motionLayout.getNanoTime());
                    }
                }
            }
            for (int i26 = 0; i26 < childCount; i26++) {
                View childAt2 = motionLayout.getChildAt(i26);
                MotionController motionController6 = map.get(childAt2);
                if (!sparseBooleanArray.get(childAt2.getId()) && motionController6 != null) {
                    motionLayout.f19431p0.getKeyFrames(motionController6);
                    motionController6.setup(width, height2, motionLayout.G0, motionLayout.getNanoTime());
                }
            }
            float staggered = motionLayout.f19431p0.getStaggered();
            if (staggered != 0.0f) {
                boolean z10 = ((double) staggered) < 0.0d;
                float fAbs = Math.abs(staggered);
                float fMax = -3.4028235E38f;
                float fMin = Float.MAX_VALUE;
                float fMax2 = -3.4028235E38f;
                float fMin2 = Float.MAX_VALUE;
                for (int i27 = 0; i27 < childCount; i27++) {
                    MotionController motionController7 = map.get(motionLayout.getChildAt(i27));
                    if (!Float.isNaN(motionController7.f19399l)) {
                        for (int i28 = 0; i28 < childCount; i28++) {
                            MotionController motionController8 = map.get(motionLayout.getChildAt(i28));
                            if (!Float.isNaN(motionController8.f19399l)) {
                                fMin = Math.min(fMin, motionController8.f19399l);
                                fMax = Math.max(fMax, motionController8.f19399l);
                            }
                        }
                        while (i12 < childCount) {
                            MotionController motionController9 = map.get(motionLayout.getChildAt(i12));
                            if (!Float.isNaN(motionController9.f19399l)) {
                                motionController9.f19400n = 1.0f / (1.0f - fAbs);
                                if (z10) {
                                    motionController9.m = fAbs - (((fMax - motionController9.f19399l) / (fMax - fMin)) * fAbs);
                                } else {
                                    motionController9.m = fAbs - (((motionController9.f19399l - fMin) * fAbs) / (fMax - fMin));
                                }
                            }
                            i12++;
                        }
                        return;
                    }
                    float finalX = motionController7.getFinalX();
                    float finalY = motionController7.getFinalY();
                    float f6 = z10 ? finalY - finalX : finalY + finalX;
                    fMin2 = Math.min(fMin2, f6);
                    fMax2 = Math.max(fMax2, f6);
                }
                while (i12 < childCount) {
                    MotionController motionController10 = map.get(motionLayout.getChildAt(i12));
                    float finalX2 = motionController10.getFinalX();
                    float finalY2 = motionController10.getFinalY();
                    float f10 = z10 ? finalY2 - finalX2 : finalY2 + finalX2;
                    motionController10.f19400n = 1.0f / (1.0f - fAbs);
                    motionController10.m = fAbs - (((f10 - fMin2) * fAbs) / (fMax2 - fMin2));
                    i12++;
                }
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final void g(ConstraintWidgetContainer constraintWidgetContainer, ConstraintSet constraintSet) {
            SparseArray<ConstraintWidget> sparseArray = new SparseArray<>();
            Constraints.LayoutParams layoutParams = new Constraints.LayoutParams(-2, -2);
            sparseArray.clear();
            sparseArray.put(0, constraintWidgetContainer);
            MotionLayout motionLayout = MotionLayout.this;
            sparseArray.put(motionLayout.getId(), constraintWidgetContainer);
            if (constraintSet != null && constraintSet.mRotate != 0) {
                ConstraintWidgetContainer constraintWidgetContainer2 = this.f19472b;
                int optimizationLevel = motionLayout.getOptimizationLevel();
                int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(motionLayout.getHeight(), 1073741824);
                int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(motionLayout.getWidth(), 1073741824);
                int i10 = MotionLayout.TOUCH_UP_COMPLETE;
                motionLayout.resolveSystem(constraintWidgetContainer2, optimizationLevel, iMakeMeasureSpec, iMakeMeasureSpec2);
            }
            for (ConstraintWidget constraintWidget : constraintWidgetContainer.getChildren()) {
                constraintWidget.setAnimated(true);
                sparseArray.put(((View) constraintWidget.getCompanionWidget()).getId(), constraintWidget);
            }
            for (ConstraintWidget constraintWidget2 : constraintWidgetContainer.getChildren()) {
                View view = (View) constraintWidget2.getCompanionWidget();
                constraintSet.applyToLayoutParams(view.getId(), layoutParams);
                constraintWidget2.setWidth(constraintSet.getWidth(view.getId()));
                constraintWidget2.setHeight(constraintSet.getHeight(view.getId()));
                if (view instanceof ConstraintHelper) {
                    constraintSet.applyToHelper((ConstraintHelper) view, constraintWidget2, layoutParams, sparseArray);
                    if (view instanceof androidx.constraintlayout.widget.Barrier) {
                        ((androidx.constraintlayout.widget.Barrier) view).validateParams();
                    }
                }
                layoutParams.resolveLayoutDirection(motionLayout.getLayoutDirection());
                MotionLayout motionLayout2 = MotionLayout.this;
                int i11 = MotionLayout.TOUCH_UP_COMPLETE;
                motionLayout2.applyConstraintsFromLayoutParams(false, view, constraintWidget2, layoutParams, sparseArray);
                if (constraintSet.getVisibilityMode(view.getId()) == 1) {
                    constraintWidget2.setVisibility(view.getVisibility());
                } else {
                    constraintWidget2.setVisibility(constraintSet.getVisibility(view.getId()));
                }
            }
            for (ConstraintWidget constraintWidget3 : constraintWidgetContainer.getChildren()) {
                if (constraintWidget3 instanceof VirtualLayout) {
                    ConstraintHelper constraintHelper = (ConstraintHelper) constraintWidget3.getCompanionWidget();
                    Helper helper = (Helper) constraintWidget3;
                    constraintHelper.updatePreLayout(constraintWidgetContainer, helper, sparseArray);
                    ((VirtualLayout) helper).captureWidgets();
                }
            }
        }
    }

    public class i {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public float f19480a = Float.NaN;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public float f19481b = Float.NaN;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f19482c = -1;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f19483d = -1;

        public i() {
        }

        public final void a() {
            int i10 = this.f19482c;
            MotionLayout motionLayout = MotionLayout.this;
            if (i10 != -1 || this.f19483d != -1) {
                if (i10 == -1) {
                    motionLayout.transitionToState(this.f19483d);
                } else {
                    int i11 = this.f19483d;
                    if (i11 == -1) {
                        motionLayout.setState(i10, -1, -1);
                    } else {
                        motionLayout.setTransition(i10, i11);
                    }
                }
                motionLayout.setState(j.SETUP);
            }
            if (Float.isNaN(this.f19481b)) {
                if (Float.isNaN(this.f19480a)) {
                    return;
                }
                motionLayout.setProgress(this.f19480a);
            } else {
                motionLayout.setProgress(this.f19480a, this.f19481b);
                this.f19480a = Float.NaN;
                this.f19481b = Float.NaN;
                this.f19482c = -1;
                this.f19483d = -1;
            }
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class j {
        private static final /* synthetic */ j[] $VALUES;
        public static final j FINISHED;
        public static final j MOVING;
        public static final j SETUP;
        public static final j UNDEFINED;

        static {
            j jVar = new j("UNDEFINED", 0);
            UNDEFINED = jVar;
            j jVar2 = new j("SETUP", 1);
            SETUP = jVar2;
            j jVar3 = new j("MOVING", 2);
            MOVING = jVar3;
            j jVar4 = new j("FINISHED", 3);
            FINISHED = jVar4;
            $VALUES = new j[]{jVar, jVar2, jVar3, jVar4};
        }

        public j() {
            throw null;
        }

        public static j valueOf(String str) {
            return (j) Enum.valueOf(j.class, str);
        }

        public static j[] values() {
            return (j[]) $VALUES.clone();
        }
    }

    public MotionLayout(@NonNull Context context) {
        super(context);
        this.f19435r0 = null;
        this.f19436s0 = 0.0f;
        this.f19438t0 = -1;
        this.f19440u0 = -1;
        this.v0 = -1;
        this.f19443w0 = 0;
        this.f19445x0 = 0;
        this.f19447y0 = true;
        this.E0 = new HashMap<>();
        this.F0 = 0L;
        this.G0 = 1.0f;
        this.H0 = 0.0f;
        this.I0 = 0.0f;
        this.K0 = 0.0f;
        this.M0 = false;
        this.O0 = 0;
        this.Q0 = false;
        this.R0 = new StopLogic();
        this.S0 = new e();
        this.W0 = false;
        this.f19417b1 = false;
        this.f19418c1 = null;
        this.f19419d1 = null;
        this.f19420e1 = null;
        this.f19421f1 = null;
        this.f19422g1 = 0;
        this.f19423h1 = -1L;
        this.f19424i1 = 0.0f;
        this.f19425j1 = 0;
        this.f19426k1 = 0.0f;
        this.mMeasureDuringTransition = false;
        this.f19437s1 = new KeyCache();
        this.f19439t1 = false;
        this.f19442v1 = null;
        this.f19444w1 = null;
        this.f19446x1 = 0;
        this.f19448y1 = false;
        this.f19449z1 = 0;
        this.A1 = new HashMap<>();
        this.E1 = new Rect();
        this.F1 = false;
        this.G1 = j.UNDEFINED;
        this.H1 = new g();
        this.I1 = false;
        this.J1 = new RectF();
        this.K1 = null;
        this.L1 = null;
        this.M1 = new ArrayList<>();
        l(null);
    }

    public static Rect a(MotionLayout motionLayout, ConstraintWidget constraintWidget) {
        motionLayout.getClass();
        int y7 = constraintWidget.getY();
        Rect rect = motionLayout.E1;
        rect.top = y7;
        rect.left = constraintWidget.getX();
        rect.right = constraintWidget.getWidth() + rect.left;
        rect.bottom = constraintWidget.getHeight() + rect.top;
        return rect;
    }

    public void addTransitionListener(TransitionListener transitionListener) {
        if (this.f19421f1 == null) {
            this.f19421f1 = new CopyOnWriteArrayList<>();
        }
        this.f19421f1.add(transitionListener);
    }

    public boolean applyViewTransition(int i10, MotionController motionController) {
        MotionScene motionScene = this.f19431p0;
        if (motionScene != null) {
            return motionScene.applyViewTransition(i10, motionController);
        }
        return false;
    }

    public ConstraintSet cloneConstraintSet(int i10) {
        MotionScene motionScene = this.f19431p0;
        if (motionScene == null) {
            return null;
        }
        ConstraintSet constraintSetB = motionScene.b(i10);
        ConstraintSet constraintSet = new ConstraintSet();
        constraintSet.clone(constraintSetB);
        return constraintSet;
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        boolean z10;
        int i10;
        ViewTransitionController viewTransitionController;
        ArrayList<ViewTransition.a> arrayList;
        ArrayList<MotionHelper> arrayList2 = this.f19420e1;
        if (arrayList2 != null) {
            Iterator<MotionHelper> it = arrayList2.iterator();
            while (it.hasNext()) {
                it.next().onPreDraw(canvas);
            }
        }
        boolean z11 = false;
        h(false);
        MotionScene motionScene = this.f19431p0;
        float[] fArr = null;
        if (motionScene != null && (viewTransitionController = motionScene.f19501r) != null && (arrayList = viewTransitionController.f19580e) != null) {
            Iterator<ViewTransition.a> it2 = arrayList.iterator();
            while (it2.hasNext()) {
                it2.next().a();
            }
            ArrayList<ViewTransition.a> arrayList3 = viewTransitionController.f19580e;
            ArrayList<ViewTransition.a> arrayList4 = viewTransitionController.f19581f;
            arrayList3.removeAll(arrayList4);
            arrayList4.clear();
            if (viewTransitionController.f19580e.isEmpty()) {
                viewTransitionController.f19580e = null;
            }
        }
        super.dispatchDraw(canvas);
        if (this.f19431p0 == null) {
            return;
        }
        int i11 = 1;
        if ((this.O0 & 1) == 1 && !isInEditMode()) {
            this.f19422g1++;
            long nanoTime = getNanoTime();
            long j10 = this.f19423h1;
            if (j10 != -1) {
                long j11 = nanoTime - j10;
                if (j11 > 200000000) {
                    this.f19424i1 = ((int) ((this.f19422g1 / (j11 * 1.0E-9f)) * 100.0f)) / 100.0f;
                    this.f19422g1 = 0;
                    this.f19423h1 = nanoTime;
                }
            } else {
                this.f19423h1 = nanoTime;
            }
            Paint paint = new Paint();
            paint.setTextSize(42.0f);
            float progress = ((int) (getProgress() * 1000.0f)) / 10.0f;
            StringBuilder sbD = androidx.camera.core.impl.utils.c.d(this.f19424i1 + " fps " + Debug.getState(this, this.f19438t0) + " -> ");
            sbD.append(Debug.getState(this, this.v0));
            sbD.append(" (progress: ");
            sbD.append(progress);
            sbD.append(" ) state=");
            int i12 = this.f19440u0;
            sbD.append(i12 == -1 ? "undefined" : Debug.getState(this, i12));
            String string = sbD.toString();
            paint.setColor(ViewCompat.MEASURED_STATE_MASK);
            canvas.drawText(string, 11.0f, getHeight() - 29, paint);
            paint.setColor(-7864184);
            canvas.drawText(string, 10.0f, getHeight() - 30, paint);
        }
        if (this.O0 > 1) {
            if (this.P0 == null) {
                this.P0 = new f();
            }
            f fVar = this.P0;
            int duration = this.f19431p0.getDuration();
            int i13 = this.O0;
            fVar.getClass();
            HashMap<View, MotionController> map = this.E0;
            if (map != null && map.size() != 0) {
                canvas.save();
                MotionLayout motionLayout = MotionLayout.this;
                boolean zIsInEditMode = motionLayout.isInEditMode();
                Paint paint2 = fVar.f19462e;
                if (!zIsInEditMode && (i13 & 1) == 2) {
                    String str = motionLayout.getContext().getResources().getResourceName(motionLayout.v0) + DeepLinkExtensionsKt.DYNAMIC_LINK_DELIMITER + motionLayout.getProgress();
                    canvas.drawText(str, 10.0f, motionLayout.getHeight() - 30, fVar.f19465h);
                    canvas.drawText(str, 11.0f, motionLayout.getHeight() - 29, paint2);
                }
                for (MotionController motionController : map.values()) {
                    int drawPath = motionController.getDrawPath();
                    if (i13 > 0 && drawPath == 0) {
                        drawPath = i11;
                    }
                    if (drawPath != 0) {
                        fVar.f19468k = motionController.a(fVar.f19460c, fVar.f19459b);
                        if (drawPath >= i11) {
                            int i14 = duration / 16;
                            float[] fArr2 = fVar.f19458a;
                            if (fArr2 == null || fArr2.length != i14 * 2) {
                                fVar.f19458a = new float[i14 * 2];
                                fVar.f19461d = new Path();
                            }
                            int i15 = fVar.m;
                            float f6 = i15;
                            canvas.translate(f6, f6);
                            paint2.setColor(1996488704);
                            Paint paint3 = fVar.f19466i;
                            paint3.setColor(1996488704);
                            Paint paint4 = fVar.f19463f;
                            paint4.setColor(1996488704);
                            Paint paint5 = fVar.f19464g;
                            paint5.setColor(1996488704);
                            motionController.b(fVar.f19458a, i14);
                            fVar.a(canvas, drawPath, fVar.f19468k, motionController);
                            paint2.setColor(-21965);
                            paint4.setColor(-2067046);
                            paint3.setColor(-2067046);
                            paint5.setColor(-13391360);
                            float f10 = -i15;
                            canvas.translate(f10, f10);
                            fVar.a(canvas, drawPath, fVar.f19468k, motionController);
                            if (drawPath == 5) {
                                fVar.f19461d.reset();
                                int i16 = 0;
                                while (i16 <= 50) {
                                    motionController.f19397j[0].getPos(motionController.c(i16 / 50, fArr), motionController.f19402p);
                                    int[] iArr = motionController.f19401o;
                                    double[] dArr = motionController.f19402p;
                                    androidx.constraintlayout.motion.widget.d dVar = motionController.f19393f;
                                    float[] fArr3 = fVar.f19467j;
                                    dVar.e(iArr, dArr, fArr3, 0);
                                    fVar.f19461d.moveTo(fArr3[0], fArr3[1]);
                                    fVar.f19461d.lineTo(fArr3[2], fArr3[3]);
                                    fVar.f19461d.lineTo(fArr3[4], fArr3[5]);
                                    fVar.f19461d.lineTo(fArr3[6], fArr3[7]);
                                    fVar.f19461d.close();
                                    i16++;
                                    fArr = null;
                                }
                                z10 = false;
                                i10 = 1;
                                paint2.setColor(1140850688);
                                canvas.translate(2.0f, 2.0f);
                                canvas.drawPath(fVar.f19461d, paint2);
                                canvas.translate(-2.0f, -2.0f);
                                paint2.setColor(SupportMenu.CATEGORY_MASK);
                                canvas.drawPath(fVar.f19461d, paint2);
                            } else {
                                z10 = false;
                                i10 = 1;
                            }
                        } else {
                            z10 = z11;
                            i10 = i11;
                        }
                        z11 = z10;
                        i11 = i10;
                        fArr = null;
                    }
                }
                canvas.restore();
            }
        }
        ArrayList<MotionHelper> arrayList5 = this.f19420e1;
        if (arrayList5 != null) {
            Iterator<MotionHelper> it3 = arrayList5.iterator();
            while (it3.hasNext()) {
                it3.next().onPostDraw(canvas);
            }
        }
    }

    public void enableTransition(int i10, boolean z10) {
        MotionScene.Transition transition = getTransition(i10);
        if (z10) {
            transition.setEnabled(true);
            return;
        }
        MotionScene motionScene = this.f19431p0;
        if (transition == motionScene.f19487c) {
            for (MotionScene.Transition transition2 : motionScene.getTransitionsWithState(this.f19440u0)) {
                if (transition2.isEnabled()) {
                    this.f19431p0.f19487c = transition2;
                    break;
                }
            }
        }
        transition.setEnabled(false);
    }

    public void enableViewTransition(int i10, boolean z10) {
        MotionScene motionScene = this.f19431p0;
        if (motionScene != null) {
            motionScene.enableViewTransition(i10, z10);
        }
    }

    public final void f(float f6) {
        MotionScene motionScene = this.f19431p0;
        if (motionScene == null) {
            return;
        }
        float f10 = this.I0;
        float f11 = this.H0;
        if (f10 != f11 && this.L0) {
            this.I0 = f11;
        }
        float f12 = this.I0;
        if (f12 == f6) {
            return;
        }
        this.Q0 = false;
        this.K0 = f6;
        this.G0 = motionScene.getDuration() / 1000.0f;
        setProgress(this.K0);
        this.f19433q0 = null;
        this.f19435r0 = this.f19431p0.getInterpolator();
        this.L0 = false;
        this.F0 = getNanoTime();
        this.M0 = true;
        this.H0 = f12;
        this.I0 = f12;
        invalidate();
    }

    public void fireTransitionCompleted() {
        CopyOnWriteArrayList<TransitionListener> copyOnWriteArrayList;
        if ((this.N0 != null || ((copyOnWriteArrayList = this.f19421f1) != null && !copyOnWriteArrayList.isEmpty())) && this.f19425j1 == -1) {
            this.f19425j1 = this.f19440u0;
            ArrayList<Integer> arrayList = this.M1;
            int iIntValue = !arrayList.isEmpty() ? ((Integer) androidx.appcompat.view.menu.b.b(arrayList, 1)).intValue() : -1;
            int i10 = this.f19440u0;
            if (iIntValue != i10 && i10 != -1) {
                arrayList.add(Integer.valueOf(i10));
            }
        }
        n();
        Runnable runnable = this.f19442v1;
        if (runnable != null) {
            runnable.run();
            this.f19442v1 = null;
        }
        int[] iArr = this.f19444w1;
        if (iArr == null || this.f19446x1 <= 0) {
            return;
        }
        transitionToState(iArr[0]);
        int[] iArr2 = this.f19444w1;
        System.arraycopy(iArr2, 1, iArr2, 0, iArr2.length - 1);
        this.f19446x1--;
    }

    public void fireTrigger(int i10, boolean z10, float f6) {
        TransitionListener transitionListener = this.N0;
        if (transitionListener != null) {
            transitionListener.onTransitionTrigger(this, i10, z10, f6);
        }
        CopyOnWriteArrayList<TransitionListener> copyOnWriteArrayList = this.f19421f1;
        if (copyOnWriteArrayList != null) {
            Iterator<TransitionListener> it = copyOnWriteArrayList.iterator();
            while (it.hasNext()) {
                it.next().onTransitionTrigger(this, i10, z10, f6);
            }
        }
    }

    public final void g(boolean z10) {
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            MotionController motionController = this.E0.get(getChildAt(i10));
            if (motionController != null && "button".equals(Debug.getName(motionController.f19389b)) && motionController.A != null) {
                int i11 = 0;
                while (true) {
                    KeyTrigger[] keyTriggerArr = motionController.A;
                    if (i11 < keyTriggerArr.length) {
                        keyTriggerArr[i11].conditionallyFire(z10 ? -100.0f : 100.0f, motionController.f19389b);
                        i11++;
                    }
                }
            }
        }
    }

    public ConstraintSet getConstraintSet(int i10) {
        MotionScene motionScene = this.f19431p0;
        if (motionScene == null) {
            return null;
        }
        return motionScene.b(i10);
    }

    @IdRes
    public int[] getConstraintSetIds() {
        MotionScene motionScene = this.f19431p0;
        if (motionScene == null) {
            return null;
        }
        return motionScene.getConstraintSetIds();
    }

    public int getCurrentState() {
        return this.f19440u0;
    }

    public ArrayList<MotionScene.Transition> getDefinedTransitions() {
        MotionScene motionScene = this.f19431p0;
        if (motionScene == null) {
            return null;
        }
        return motionScene.getDefinedTransitions();
    }

    public DesignTool getDesignTool() {
        if (this.T0 == null) {
            this.T0 = new DesignTool(this);
        }
        return this.T0;
    }

    public int getEndState() {
        return this.v0;
    }

    public int[] getMatchingConstraintSetIds(String... strArr) {
        MotionScene motionScene = this.f19431p0;
        if (motionScene == null) {
            return null;
        }
        return motionScene.getMatchingStateLabels(strArr);
    }

    public long getNanoTime() {
        return System.nanoTime();
    }

    public float getProgress() {
        return this.I0;
    }

    public MotionScene getScene() {
        return this.f19431p0;
    }

    public int getStartState() {
        return this.f19438t0;
    }

    public float getTargetPosition() {
        return this.K0;
    }

    public MotionScene.Transition getTransition(int i10) {
        return this.f19431p0.getTransitionById(i10);
    }

    public Bundle getTransitionState() {
        if (this.f19441u1 == null) {
            this.f19441u1 = new i();
        }
        i iVar = this.f19441u1;
        MotionLayout motionLayout = MotionLayout.this;
        iVar.f19483d = motionLayout.v0;
        iVar.f19482c = motionLayout.f19438t0;
        iVar.f19481b = motionLayout.getVelocity();
        iVar.f19480a = motionLayout.getProgress();
        i iVar2 = this.f19441u1;
        iVar2.getClass();
        Bundle bundle = new Bundle();
        bundle.putFloat("motion.progress", iVar2.f19480a);
        bundle.putFloat("motion.velocity", iVar2.f19481b);
        bundle.putInt("motion.StartState", iVar2.f19482c);
        bundle.putInt("motion.EndState", iVar2.f19483d);
        return bundle;
    }

    public long getTransitionTimeMs() {
        MotionScene motionScene = this.f19431p0;
        if (motionScene != null) {
            this.G0 = motionScene.getDuration() / 1000.0f;
        }
        return (long) (this.G0 * 1000.0f);
    }

    public float getVelocity() {
        return this.f19436s0;
    }

    public void getViewVelocity(View view, float f6, float f10, float[] fArr, int i10) {
        double[] dArr;
        float[] fArr2 = fArr;
        float velocity = this.f19436s0;
        float f11 = this.I0;
        if (this.f19433q0 != null) {
            float fSignum = Math.signum(this.K0 - f11);
            float interpolation = this.f19433q0.getInterpolation(this.I0 + 1.0E-5f);
            float interpolation2 = this.f19433q0.getInterpolation(this.I0);
            velocity = (((interpolation - interpolation2) / 1.0E-5f) * fSignum) / this.G0;
            f11 = interpolation2;
        }
        MotionInterpolator motionInterpolator = this.f19433q0;
        if (motionInterpolator instanceof MotionInterpolator) {
            velocity = motionInterpolator.getVelocity();
        }
        float f12 = velocity;
        MotionController motionController = this.E0.get(view);
        if ((i10 & 1) == 0) {
            int width = view.getWidth();
            int height = view.getHeight();
            float[] fArr3 = motionController.f19408v;
            float fC = motionController.c(f11, fArr3);
            HashMap<String, ViewSpline> map = motionController.f19411y;
            ViewSpline viewSpline = map == null ? null : map.get("translationX");
            HashMap<String, ViewSpline> map2 = motionController.f19411y;
            ViewSpline viewSpline2 = map2 == null ? null : map2.get("translationY");
            HashMap<String, ViewSpline> map3 = motionController.f19411y;
            ViewSpline viewSpline3 = map3 == null ? null : map3.get(Key.ROTATION);
            HashMap<String, ViewSpline> map4 = motionController.f19411y;
            ViewSpline viewSpline4 = map4 == null ? null : map4.get("scaleX");
            HashMap<String, ViewSpline> map5 = motionController.f19411y;
            ViewSpline viewSpline5 = map5 == null ? null : map5.get("scaleY");
            HashMap<String, ViewOscillator> map6 = motionController.f19412z;
            ViewOscillator viewOscillator = map6 == null ? null : map6.get("translationX");
            HashMap<String, ViewOscillator> map7 = motionController.f19412z;
            ViewOscillator viewOscillator2 = map7 == null ? null : map7.get("translationY");
            HashMap<String, ViewOscillator> map8 = motionController.f19412z;
            ViewOscillator viewOscillator3 = map8 == null ? null : map8.get(Key.ROTATION);
            HashMap<String, ViewOscillator> map9 = motionController.f19412z;
            ViewOscillator viewOscillator4 = map9 == null ? null : map9.get("scaleX");
            HashMap<String, ViewOscillator> map10 = motionController.f19412z;
            ViewOscillator viewOscillator5 = map10 == null ? null : map10.get("scaleY");
            VelocityMatrix velocityMatrix = new VelocityMatrix();
            velocityMatrix.clear();
            velocityMatrix.setRotationVelocity(viewSpline3, fC);
            velocityMatrix.setTranslationVelocity(viewSpline, viewSpline2, fC);
            velocityMatrix.setScaleVelocity(viewSpline4, viewSpline5, fC);
            velocityMatrix.setRotationVelocity(viewOscillator3, fC);
            velocityMatrix.setTranslationVelocity(viewOscillator, viewOscillator2, fC);
            velocityMatrix.setScaleVelocity(viewOscillator4, viewOscillator5, fC);
            ViewOscillator viewOscillator6 = viewOscillator5;
            CurveFit curveFit = motionController.f19398k;
            if (curveFit != null) {
                double[] dArr2 = motionController.f19402p;
                if (dArr2.length > 0) {
                    double d2 = fC;
                    curveFit.getPos(d2, dArr2);
                    motionController.f19398k.getSlope(d2, motionController.f19403q);
                    androidx.constraintlayout.motion.widget.d dVar = motionController.f19393f;
                    int[] iArr = motionController.f19401o;
                    double[] dArr3 = motionController.f19403q;
                    double[] dArr4 = motionController.f19402p;
                    dVar.getClass();
                    androidx.constraintlayout.motion.widget.d.g(f6, f10, fArr, iArr, dArr3, dArr4);
                }
                velocityMatrix.applyTransform(f6, f10, width, height, fArr);
            } else if (motionController.f19397j != null) {
                double dC = motionController.c(fC, fArr3);
                motionController.f19397j[0].getSlope(dC, motionController.f19403q);
                motionController.f19397j[0].getPos(dC, motionController.f19402p);
                float f13 = fArr3[0];
                int i11 = 0;
                while (true) {
                    dArr = motionController.f19403q;
                    if (i11 >= dArr.length) {
                        break;
                    }
                    dArr[i11] = dArr[i11] * ((double) f13);
                    i11++;
                }
                androidx.constraintlayout.motion.widget.d dVar2 = motionController.f19393f;
                int[] iArr2 = motionController.f19401o;
                double[] dArr5 = motionController.f19402p;
                dVar2.getClass();
                androidx.constraintlayout.motion.widget.d.g(f6, f10, fArr, iArr2, dArr, dArr5);
                velocityMatrix.applyTransform(f6, f10, width, height, fArr);
            } else {
                androidx.constraintlayout.motion.widget.d dVar3 = motionController.f19394g;
                float f14 = dVar3.f19597t0;
                androidx.constraintlayout.motion.widget.d dVar4 = motionController.f19393f;
                float f15 = f14 - dVar4.f19597t0;
                float f16 = dVar3.f19598u0 - dVar4.f19598u0;
                float f17 = dVar3.v0 - dVar4.v0;
                float f18 = (dVar3.f19599w0 - dVar4.f19599w0) + f16;
                float f19 = ((f17 + f15) * f6) + ((1.0f - f6) * f15);
                fArr2 = fArr;
                fArr2[0] = f19;
                fArr2[1] = (f18 * f10) + ((1.0f - f10) * f16);
                velocityMatrix.clear();
                velocityMatrix.setRotationVelocity(viewSpline3, fC);
                velocityMatrix.setTranslationVelocity(viewSpline, viewSpline2, fC);
                velocityMatrix.setScaleVelocity(viewSpline4, viewSpline5, fC);
                velocityMatrix.setRotationVelocity(viewOscillator3, fC);
                velocityMatrix.setTranslationVelocity(viewOscillator, viewOscillator2, fC);
                velocityMatrix.setScaleVelocity(viewOscillator4, viewOscillator6, fC);
                velocityMatrix.applyTransform(f6, f10, width, height, fArr);
            }
            fArr2 = fArr;
        } else {
            f12 = f12;
            motionController.d(f11, f6, f10, fArr2);
        }
        if (i10 < 2) {
            fArr2[0] = fArr2[0] * f12;
            fArr2[1] = fArr2[1] * f12;
        }
    }

    /* JADX WARN: Code duplicated, block: B:117:0x01ba  */
    /* JADX WARN: Code duplicated, block: B:127:0x01e8  */
    /* JADX WARN: Code duplicated, block: B:129:0x01ee  */
    /* JADX WARN: Code duplicated, block: B:143:0x021e  */
    /* JADX WARN: Code duplicated, block: B:180:0x018f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:62:0x00e0 A[PHI: r3
      0x00e0: PHI (r3v50 float) = (r3v49 float), (r3v51 float), (r3v51 float) binds: [B:47:0x00ab, B:58:0x00d4, B:60:0x00d8] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:72:0x010d  */
    /* JADX WARN: Code duplicated, block: B:74:0x0114  */
    /* JADX WARN: Code duplicated, block: B:86:0x0134  */
    /* JADX WARN: Code duplicated, block: B:89:0x014b  */
    /* JADX WARN: Code duplicated, block: B:90:0x014d  */
    /* JADX WARN: Code duplicated, block: B:93:0x0155  */
    /* JADX WARN: Code duplicated, block: B:96:0x016c  */
    /* JADX WARN: Code duplicated, block: B:98:0x017c  */
    public final void h(boolean z10) {
        boolean z11;
        char c10;
        int childCount;
        long nanoTime;
        Interpolator interpolator;
        float interpolation;
        Interpolator interpolator2;
        int i10;
        int i11;
        int i12;
        int i13;
        View childAt;
        MotionController motionController;
        boolean z12;
        if (this.J0 == -1) {
            this.J0 = getNanoTime();
        }
        float f6 = this.I0;
        if (f6 > 0.0f && f6 < 1.0f) {
            this.f19440u0 = -1;
        }
        boolean z13 = false;
        if (this.f19417b1 || (this.M0 && (z10 || this.K0 != f6))) {
            float fSignum = Math.signum(this.K0 - f6);
            long nanoTime2 = getNanoTime();
            MotionInterpolator motionInterpolator = this.f19433q0;
            float f10 = !(motionInterpolator instanceof MotionInterpolator) ? (((nanoTime2 - this.J0) * fSignum) * 1.0E-9f) / this.G0 : 0.0f;
            float f11 = this.I0 + f10;
            if (this.L0) {
                f11 = this.K0;
            }
            if ((fSignum <= 0.0f || f11 < this.K0) && (fSignum > 0.0f || f11 > this.K0)) {
                z11 = false;
            } else {
                f11 = this.K0;
                this.M0 = false;
                z11 = true;
            }
            this.I0 = f11;
            this.H0 = f11;
            this.J0 = nanoTime2;
            if (motionInterpolator == null || z11) {
                this.f19436s0 = f10;
            } else {
                if (this.Q0) {
                    float interpolation2 = motionInterpolator.getInterpolation((nanoTime2 - this.F0) * 1.0E-9f);
                    MotionInterpolator motionInterpolator2 = this.f19433q0;
                    StopLogic stopLogic = this.R0;
                    c10 = motionInterpolator2 == stopLogic ? stopLogic.isStopped() ? (char) 2 : (char) 1 : (char) 0;
                    this.I0 = interpolation2;
                    this.J0 = nanoTime2;
                    MotionInterpolator motionInterpolator3 = this.f19433q0;
                    if (motionInterpolator3 instanceof MotionInterpolator) {
                        float velocity = motionInterpolator3.getVelocity();
                        this.f19436s0 = velocity;
                        if (Math.abs(velocity) * this.G0 <= 1.0E-5f && c10 == 2) {
                            this.M0 = false;
                        }
                        if (velocity > 0.0f && interpolation2 >= 1.0f) {
                            this.I0 = 1.0f;
                            this.M0 = false;
                            interpolation2 = 1.0f;
                        }
                        if (velocity >= 0.0f || interpolation2 > 0.0f) {
                            f11 = interpolation2;
                        } else {
                            this.I0 = 0.0f;
                            this.M0 = false;
                            f11 = 0.0f;
                        }
                    } else {
                        f11 = interpolation2;
                    }
                } else {
                    float interpolation3 = motionInterpolator.getInterpolation(f11);
                    MotionInterpolator motionInterpolator4 = this.f19433q0;
                    if (motionInterpolator4 instanceof MotionInterpolator) {
                        this.f19436s0 = motionInterpolator4.getVelocity();
                    } else {
                        this.f19436s0 = ((motionInterpolator4.getInterpolation(f11 + f10) - interpolation3) * fSignum) / f10;
                    }
                    f11 = interpolation3;
                }
                if (Math.abs(this.f19436s0) > 1.0E-5f) {
                    setState(j.MOVING);
                }
                if (c10 != 1) {
                    if ((fSignum <= 0.0f && f11 >= this.K0) || (fSignum <= 0.0f && f11 <= this.K0)) {
                        f11 = this.K0;
                        this.M0 = false;
                    }
                    if (f11 < 1.0f || f11 <= 0.0f) {
                        this.M0 = false;
                        setState(j.FINISHED);
                    }
                }
                childCount = getChildCount();
                this.f19417b1 = false;
                nanoTime = getNanoTime();
                this.r1 = f11;
                interpolator = this.f19435r0;
                if (interpolator == null) {
                    interpolation = f11;
                } else {
                    interpolation = interpolator.getInterpolation(f11);
                }
                interpolator2 = this.f19435r0;
                if (interpolator2 != null) {
                    float interpolation4 = interpolator2.getInterpolation((fSignum / this.G0) + f11);
                    this.f19436s0 = interpolation4;
                    this.f19436s0 = interpolation4 - this.f19435r0.getInterpolation(f11);
                }
                for (i10 = 0; i10 < childCount; i10++) {
                    childAt = getChildAt(i10);
                    motionController = this.E0.get(childAt);
                    if (motionController != null) {
                        this.f19417b1 = motionController.g(childAt, interpolation, nanoTime, this.f19437s1) | this.f19417b1;
                    }
                }
                boolean z14 = (fSignum <= 0.0f && f11 >= this.K0) || (fSignum <= 0.0f && f11 <= this.K0);
                if (!this.f19417b1 && !this.M0 && z14) {
                    setState(j.FINISHED);
                }
                if (this.mMeasureDuringTransition) {
                    requestLayout();
                }
                this.f19417b1 = (!z14) | this.f19417b1;
                if (f11 <= 0.0f && (i13 = this.f19438t0) != -1 && this.f19440u0 != i13) {
                    this.f19440u0 = i13;
                    this.f19431p0.b(i13).applyCustomAttributes(this);
                    setState(j.FINISHED);
                    z13 = true;
                }
                if (f11 >= 1.0d) {
                    i11 = this.f19440u0;
                    i12 = this.v0;
                    if (i11 != i12) {
                        this.f19440u0 = i12;
                        this.f19431p0.b(i12).applyCustomAttributes(this);
                        setState(j.FINISHED);
                        z13 = true;
                    }
                }
                if (!this.f19417b1 || this.M0) {
                    invalidate();
                } else if ((fSignum > 0.0f && f11 == 1.0f) || (fSignum < 0.0f && f11 == 0.0f)) {
                    setState(j.FINISHED);
                }
                if (!this.f19417b1 && !this.M0 && ((fSignum > 0.0f && f11 == 1.0f) || (fSignum < 0.0f && f11 == 0.0f))) {
                    m();
                }
            }
            c10 = 0;
            if (Math.abs(this.f19436s0) > 1.0E-5f) {
                setState(j.MOVING);
            }
            if (c10 != 1) {
                if (fSignum <= 0.0f) {
                    f11 = this.K0;
                    this.M0 = false;
                } else {
                    f11 = this.K0;
                    this.M0 = false;
                }
                if (f11 < 1.0f) {
                    this.M0 = false;
                    setState(j.FINISHED);
                } else {
                    this.M0 = false;
                    setState(j.FINISHED);
                }
            }
            childCount = getChildCount();
            this.f19417b1 = false;
            nanoTime = getNanoTime();
            this.r1 = f11;
            interpolator = this.f19435r0;
            if (interpolator == null) {
                interpolation = f11;
            } else {
                interpolation = interpolator.getInterpolation(f11);
            }
            interpolator2 = this.f19435r0;
            if (interpolator2 != null) {
                float interpolation5 = interpolator2.getInterpolation((fSignum / this.G0) + f11);
                this.f19436s0 = interpolation5;
                this.f19436s0 = interpolation5 - this.f19435r0.getInterpolation(f11);
            }
            while (i10 < childCount) {
                childAt = getChildAt(i10);
                motionController = this.E0.get(childAt);
                if (motionController != null) {
                    this.f19417b1 = motionController.g(childAt, interpolation, nanoTime, this.f19437s1) | this.f19417b1;
                }
            }
            if (fSignum <= 0.0f) {
            }
            if (!this.f19417b1) {
                setState(j.FINISHED);
            }
            if (this.mMeasureDuringTransition) {
                requestLayout();
            }
            this.f19417b1 = (!z14) | this.f19417b1;
            if (f11 <= 0.0f) {
                this.f19440u0 = i13;
                this.f19431p0.b(i13).applyCustomAttributes(this);
                setState(j.FINISHED);
                z13 = true;
            }
            if (f11 >= 1.0d) {
                i11 = this.f19440u0;
                i12 = this.v0;
                if (i11 != i12) {
                    this.f19440u0 = i12;
                    this.f19431p0.b(i12).applyCustomAttributes(this);
                    setState(j.FINISHED);
                    z13 = true;
                }
            }
            if (this.f19417b1) {
                invalidate();
            } else {
                invalidate();
            }
            if (!this.f19417b1) {
                m();
            }
        }
        float f12 = this.I0;
        if (f12 < 1.0f) {
            if (f12 <= 0.0f) {
                int i14 = this.f19440u0;
                int i15 = this.f19438t0;
                z12 = i14 == i15 ? z13 : true;
                this.f19440u0 = i15;
            }
            this.I1 |= z13;
            if (z13 && !this.f19439t1) {
                requestLayout();
            }
            this.H0 = this.I0;
        }
        int i16 = this.f19440u0;
        int i17 = this.v0;
        z12 = i16 == i17 ? z13 : true;
        this.f19440u0 = i17;
        z13 = z12;
        this.I1 |= z13;
        if (z13) {
            requestLayout();
        }
        this.H0 = this.I0;
    }

    public final void i() {
        CopyOnWriteArrayList<TransitionListener> copyOnWriteArrayList;
        if ((this.N0 == null && ((copyOnWriteArrayList = this.f19421f1) == null || copyOnWriteArrayList.isEmpty())) || this.f19426k1 == this.H0) {
            return;
        }
        if (this.f19425j1 != -1) {
            TransitionListener transitionListener = this.N0;
            if (transitionListener != null) {
                transitionListener.onTransitionStarted(this, this.f19438t0, this.v0);
            }
            CopyOnWriteArrayList<TransitionListener> copyOnWriteArrayList2 = this.f19421f1;
            if (copyOnWriteArrayList2 != null) {
                Iterator<TransitionListener> it = copyOnWriteArrayList2.iterator();
                while (it.hasNext()) {
                    it.next().onTransitionStarted(this, this.f19438t0, this.v0);
                }
            }
        }
        this.f19425j1 = -1;
        float f6 = this.H0;
        this.f19426k1 = f6;
        TransitionListener transitionListener2 = this.N0;
        if (transitionListener2 != null) {
            transitionListener2.onTransitionChange(this, this.f19438t0, this.v0, f6);
        }
        CopyOnWriteArrayList<TransitionListener> copyOnWriteArrayList3 = this.f19421f1;
        if (copyOnWriteArrayList3 != null) {
            Iterator<TransitionListener> it2 = copyOnWriteArrayList3.iterator();
            while (it2.hasNext()) {
                it2.next().onTransitionChange(this, this.f19438t0, this.v0, this.H0);
            }
        }
    }

    public boolean isDelayedApplicationOfInitialState() {
        return this.F1;
    }

    public boolean isInRotation() {
        return this.f19448y1;
    }

    public boolean isInteractionEnabled() {
        return this.f19447y0;
    }

    public boolean isViewTransitionEnabled(int i10) {
        MotionScene motionScene = this.f19431p0;
        if (motionScene != null) {
            return motionScene.isViewTransitionEnabled(i10);
        }
        return false;
    }

    public final void j(int i10, float f6, float f10, float f11, float[] fArr) {
        View viewById = getViewById(i10);
        MotionController motionController = this.E0.get(viewById);
        if (motionController != null) {
            motionController.d(f6, f10, f11, fArr);
            viewById.getY();
        } else {
            Log.w("MotionLayout", "WARNING could not find view id " + (viewById == null ? g0.c("", i10) : viewById.getContext().getResources().getResourceName(i10)));
        }
    }

    public void jumpToState(int i10) {
        if (!isAttachedToWindow()) {
            this.f19440u0 = i10;
        }
        if (this.f19438t0 == i10) {
            setProgress(0.0f);
        } else if (this.v0 == i10) {
            setProgress(1.0f);
        } else {
            setTransition(i10, i10);
        }
    }

    public final boolean k(float f6, float f10, MotionEvent motionEvent, View view) {
        boolean z10;
        boolean zOnTouchEvent;
        if (!(view instanceof ViewGroup)) {
            z10 = false;
            break;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount() - 1;
        while (true) {
            if (childCount < 0) {
                z10 = false;
                break;
            }
            View childAt = viewGroup.getChildAt(childCount);
            if (k((childAt.getLeft() + f6) - view.getScrollX(), (childAt.getTop() + f10) - view.getScrollY(), motionEvent, childAt)) {
                z10 = true;
                break;
            }
            childCount--;
        }
        if (!z10) {
            float right = (view.getRight() + f6) - view.getLeft();
            float bottom = (view.getBottom() + f10) - view.getTop();
            RectF rectF = this.J1;
            rectF.set(f6, f10, right, bottom);
            if (motionEvent.getAction() != 0 || rectF.contains(motionEvent.getX(), motionEvent.getY())) {
                float f11 = -f6;
                float f12 = -f10;
                Matrix matrix = view.getMatrix();
                if (matrix.isIdentity()) {
                    motionEvent.offsetLocation(f11, f12);
                    zOnTouchEvent = view.onTouchEvent(motionEvent);
                    motionEvent.offsetLocation(-f11, -f12);
                } else {
                    MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
                    motionEventObtain.offsetLocation(f11, f12);
                    if (this.L1 == null) {
                        this.L1 = new Matrix();
                    }
                    matrix.invert(this.L1);
                    motionEventObtain.transform(this.L1);
                    zOnTouchEvent = view.onTouchEvent(motionEventObtain);
                    motionEventObtain.recycle();
                }
                if (zOnTouchEvent) {
                    return true;
                }
            }
        }
        return z10;
    }

    public final void l(AttributeSet attributeSet) {
        MotionScene motionScene;
        MotionScene motionScene2;
        IS_IN_EDIT_MODE = isInEditMode();
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, R.styleable.MotionLayout);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            boolean z10 = true;
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i10);
                if (index == R.styleable.MotionLayout_layoutDescription) {
                    this.f19431p0 = new MotionScene(getContext(), this, typedArrayObtainStyledAttributes.getResourceId(index, -1));
                } else if (index == R.styleable.MotionLayout_currentState) {
                    this.f19440u0 = typedArrayObtainStyledAttributes.getResourceId(index, -1);
                } else if (index == R.styleable.MotionLayout_motionProgress) {
                    this.K0 = typedArrayObtainStyledAttributes.getFloat(index, 0.0f);
                    this.M0 = true;
                } else if (index == R.styleable.MotionLayout_applyMotionScene) {
                    z10 = typedArrayObtainStyledAttributes.getBoolean(index, z10);
                } else if (index == R.styleable.MotionLayout_showPaths) {
                    if (this.O0 == 0) {
                        this.O0 = typedArrayObtainStyledAttributes.getBoolean(index, false) ? 2 : 0;
                    }
                } else if (index == R.styleable.MotionLayout_motionDebug) {
                    this.O0 = typedArrayObtainStyledAttributes.getInt(index, 0);
                }
            }
            typedArrayObtainStyledAttributes.recycle();
            if (!z10) {
                this.f19431p0 = null;
            }
        }
        if (this.O0 != 0 && (motionScene2 = this.f19431p0) != null) {
            int iG = motionScene2.g();
            MotionScene motionScene3 = this.f19431p0;
            ConstraintSet constraintSetB = motionScene3.b(motionScene3.g());
            String name = Debug.getName(getContext(), iG);
            int childCount = getChildCount();
            for (int i11 = 0; i11 < childCount; i11++) {
                View childAt = getChildAt(i11);
                int id = childAt.getId();
                if (id == -1) {
                    StringBuilder sbD = ci.a.d("CHECK: ", name, " ALL VIEWS SHOULD HAVE ID's ");
                    sbD.append(childAt.getClass().getName());
                    sbD.append(" does not!");
                    Log.w("MotionLayout", sbD.toString());
                }
                if (constraintSetB.getConstraint(id) == null) {
                    StringBuilder sbD2 = ci.a.d("CHECK: ", name, " NO CONSTRAINTS for ");
                    sbD2.append(Debug.getName(childAt));
                    Log.w("MotionLayout", sbD2.toString());
                }
            }
            int[] knownIds = constraintSetB.getKnownIds();
            for (int i12 = 0; i12 < knownIds.length; i12++) {
                int i13 = knownIds[i12];
                String name2 = Debug.getName(getContext(), i13);
                if (findViewById(knownIds[i12]) == null) {
                    Log.w("MotionLayout", "CHECK: " + name + " NO View matches id " + name2);
                }
                if (constraintSetB.getHeight(i13) == -1) {
                    Log.w("MotionLayout", u.g("CHECK: ", name, "(", name2, ") no LAYOUT_HEIGHT"));
                }
                if (constraintSetB.getWidth(i13) == -1) {
                    Log.w("MotionLayout", u.g("CHECK: ", name, "(", name2, ") no LAYOUT_HEIGHT"));
                }
            }
            SparseIntArray sparseIntArray = new SparseIntArray();
            SparseIntArray sparseIntArray2 = new SparseIntArray();
            for (MotionScene.Transition transition : this.f19431p0.getDefinedTransitions()) {
                MotionScene.Transition transition2 = this.f19431p0.f19487c;
                transition.getStartConstraintSetId();
                transition.getEndConstraintSetId();
                int startConstraintSetId = transition.getStartConstraintSetId();
                int endConstraintSetId = transition.getEndConstraintSetId();
                Debug.getName(getContext(), startConstraintSetId);
                Debug.getName(getContext(), endConstraintSetId);
                sparseIntArray.get(startConstraintSetId);
                sparseIntArray2.get(endConstraintSetId);
                sparseIntArray.put(startConstraintSetId, endConstraintSetId);
                sparseIntArray2.put(endConstraintSetId, startConstraintSetId);
                this.f19431p0.b(startConstraintSetId);
                this.f19431p0.b(endConstraintSetId);
            }
        }
        if (this.f19440u0 != -1 || (motionScene = this.f19431p0) == null) {
            return;
        }
        this.f19440u0 = motionScene.g();
        this.f19438t0 = this.f19431p0.g();
        MotionScene.Transition transition3 = this.f19431p0.f19487c;
        this.v0 = transition3 != null ? transition3.f19506c : -1;
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout
    public void loadLayoutDescription(int i10) {
        MotionScene.Transition transition;
        if (i10 == 0) {
            this.f19431p0 = null;
            return;
        }
        try {
            MotionScene motionScene = new MotionScene(getContext(), this, i10);
            this.f19431p0 = motionScene;
            int i11 = -1;
            if (this.f19440u0 == -1) {
                this.f19440u0 = motionScene.g();
                this.f19438t0 = this.f19431p0.g();
                MotionScene.Transition transition2 = this.f19431p0.f19487c;
                if (transition2 != null) {
                    i11 = transition2.f19506c;
                }
                this.v0 = i11;
            }
            if (!isAttachedToWindow()) {
                this.f19431p0 = null;
                return;
            }
            try {
                Display display = getDisplay();
                this.D1 = display == null ? 0 : display.getRotation();
                MotionScene motionScene2 = this.f19431p0;
                if (motionScene2 != null) {
                    ConstraintSet constraintSetB = motionScene2.b(this.f19440u0);
                    this.f19431p0.m(this);
                    ArrayList<MotionHelper> arrayList = this.f19420e1;
                    if (arrayList != null) {
                        Iterator<MotionHelper> it = arrayList.iterator();
                        while (it.hasNext()) {
                            it.next().onFinishedMotionScene(this);
                        }
                    }
                    if (constraintSetB != null) {
                        constraintSetB.applyTo(this);
                    }
                    this.f19438t0 = this.f19440u0;
                }
                m();
                i iVar = this.f19441u1;
                if (iVar != null) {
                    if (this.F1) {
                        post(new a());
                        return;
                    } else {
                        iVar.a();
                        return;
                    }
                }
                MotionScene motionScene3 = this.f19431p0;
                if (motionScene3 == null || (transition = motionScene3.f19487c) == null || transition.getAutoTransition() != 4) {
                    return;
                }
                transitionToEnd();
                setState(j.SETUP);
                setState(j.MOVING);
            } catch (Exception e5) {
                throw new IllegalArgumentException("unable to parse MotionScene file", e5);
            }
        } catch (Exception e7) {
            throw new IllegalArgumentException("unable to parse MotionScene file", e7);
        }
    }

    public final void m() {
        MotionScene.Transition transition;
        androidx.constraintlayout.motion.widget.g gVar;
        View viewFindViewById;
        MotionScene motionScene = this.f19431p0;
        if (motionScene == null) {
            return;
        }
        if (motionScene.a(this, this.f19440u0)) {
            requestLayout();
            return;
        }
        int i10 = this.f19440u0;
        if (i10 != -1) {
            this.f19431p0.addOnClickListeners(this, i10);
        }
        if (!this.f19431p0.o() || (transition = this.f19431p0.f19487c) == null || (gVar = transition.f19515l) == null) {
            return;
        }
        int i11 = gVar.f19605d;
        if (i11 != -1) {
            MotionLayout motionLayout = gVar.f19618r;
            viewFindViewById = motionLayout.findViewById(i11);
            if (viewFindViewById == null) {
                Debug.getName(motionLayout.getContext(), gVar.f19605d);
            }
        } else {
            viewFindViewById = null;
        }
        if (viewFindViewById instanceof NestedScrollView) {
            NestedScrollView nestedScrollView = (NestedScrollView) viewFindViewById;
            nestedScrollView.setOnTouchListener(new androidx.constraintlayout.motion.widget.e());
            nestedScrollView.setOnScrollChangeListener(new androidx.constraintlayout.motion.widget.f());
        }
    }

    public final void n() {
        CopyOnWriteArrayList<TransitionListener> copyOnWriteArrayList;
        if (this.N0 == null && ((copyOnWriteArrayList = this.f19421f1) == null || copyOnWriteArrayList.isEmpty())) {
            return;
        }
        ArrayList<Integer> arrayList = this.M1;
        for (Integer num : arrayList) {
            TransitionListener transitionListener = this.N0;
            if (transitionListener != null) {
                transitionListener.onTransitionCompleted(this, num.intValue());
            }
            CopyOnWriteArrayList<TransitionListener> copyOnWriteArrayList2 = this.f19421f1;
            if (copyOnWriteArrayList2 != null) {
                Iterator<TransitionListener> it = copyOnWriteArrayList2.iterator();
                while (it.hasNext()) {
                    it.next().onTransitionCompleted(this, num.intValue());
                }
            }
        }
        arrayList.clear();
    }

    public MotionTracker obtainVelocityTracker() {
        h hVar = h.f19478b;
        hVar.f19479a = VelocityTracker.obtain();
        return hVar;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        MotionScene.Transition transition;
        int i10;
        super.onAttachedToWindow();
        Display display = getDisplay();
        if (display != null) {
            this.D1 = display.getRotation();
        }
        MotionScene motionScene = this.f19431p0;
        if (motionScene != null && (i10 = this.f19440u0) != -1) {
            ConstraintSet constraintSetB = motionScene.b(i10);
            this.f19431p0.m(this);
            ArrayList<MotionHelper> arrayList = this.f19420e1;
            if (arrayList != null) {
                Iterator<MotionHelper> it = arrayList.iterator();
                while (it.hasNext()) {
                    it.next().onFinishedMotionScene(this);
                }
            }
            if (constraintSetB != null) {
                constraintSetB.applyTo(this);
            }
            this.f19438t0 = this.f19440u0;
        }
        m();
        i iVar = this.f19441u1;
        if (iVar != null) {
            if (this.F1) {
                post(new d());
                return;
            } else {
                iVar.a();
                return;
            }
        }
        MotionScene motionScene2 = this.f19431p0;
        if (motionScene2 == null || (transition = motionScene2.f19487c) == null || transition.getAutoTransition() != 4) {
            return;
        }
        transitionToEnd();
        setState(j.SETUP);
        setState(j.MOVING);
    }

    /* JADX WARN: Code duplicated, block: B:119:0x00f5 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:121:0x00e2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:59:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:62:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:67:0x0100  */
    /* JADX WARN: Code duplicated, block: B:68:0x0117  */
    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        androidx.constraintlayout.motion.widget.g touchResponse;
        int i10;
        RectF rectFB;
        MotionLayout motionLayout;
        int currentState;
        MotionScene motionScene = this.f19431p0;
        if (motionScene == null || !this.f19447y0) {
            return false;
        }
        ViewTransitionController viewTransitionController = motionScene.f19501r;
        if (viewTransitionController != null && (currentState = (motionLayout = viewTransitionController.f19576a).getCurrentState()) != -1) {
            HashSet<View> hashSet = viewTransitionController.f19578c;
            ArrayList<ViewTransition> arrayList = viewTransitionController.f19577b;
            if (hashSet == null) {
                viewTransitionController.f19578c = new HashSet<>();
                for (ViewTransition viewTransition : arrayList) {
                    int childCount = motionLayout.getChildCount();
                    for (int i11 = 0; i11 < childCount; i11++) {
                        View childAt = motionLayout.getChildAt(i11);
                        if (viewTransition.c(childAt)) {
                            childAt.getId();
                            viewTransitionController.f19578c.add(childAt);
                        }
                    }
                }
            }
            float x4 = motionEvent.getX();
            float y7 = motionEvent.getY();
            Rect rect = new Rect();
            int action = motionEvent.getAction();
            ArrayList<ViewTransition.a> arrayList2 = viewTransitionController.f19580e;
            int i12 = 2;
            if (arrayList2 != null && !arrayList2.isEmpty()) {
                for (ViewTransition.a aVar : viewTransitionController.f19580e) {
                    if (action != 1) {
                        if (action != 2) {
                            aVar.getClass();
                        } else {
                            View view = aVar.f19566c.getView();
                            Rect rect2 = aVar.f19575l;
                            view.getHitRect(rect2);
                            if (!rect2.contains((int) x4, (int) y7) && !aVar.f19571h) {
                                aVar.b();
                            }
                        }
                    } else if (!aVar.f19571h) {
                        aVar.b();
                    }
                }
            }
            if (action == 0 || action == 1) {
                ConstraintSet constraintSet = motionLayout.getConstraintSet(currentState);
                Iterator<ViewTransition> it = arrayList.iterator();
                while (it.hasNext()) {
                    ViewTransition next = it.next();
                    int i13 = next.f19544b;
                    if (i13 == 1) {
                        if (action == 0) {
                            for (View view2 : viewTransitionController.f19578c) {
                                if (next.c(view2)) {
                                    view2.getHitRect(rect);
                                    if (rect.contains((int) x4, (int) y7)) {
                                        next.a(viewTransitionController, viewTransitionController.f19576a, currentState, constraintSet, view2);
                                    }
                                    next = next;
                                    i12 = i12;
                                }
                            }
                        }
                    } else if (i13 == i12) {
                        if (action == 1) {
                            while (r16.hasNext()) {
                                if (next.c(view2)) {
                                    view2.getHitRect(rect);
                                    if (rect.contains((int) x4, (int) y7)) {
                                        next.a(viewTransitionController, viewTransitionController.f19576a, currentState, constraintSet, view2);
                                    }
                                    next = next;
                                    i12 = i12;
                                }
                            }
                        }
                    } else if (i13 == 3 && action == 0) {
                        while (r16.hasNext()) {
                            if (next.c(view2)) {
                                view2.getHitRect(rect);
                                if (rect.contains((int) x4, (int) y7)) {
                                    next.a(viewTransitionController, viewTransitionController.f19576a, currentState, constraintSet, view2);
                                }
                                next = next;
                                i12 = i12;
                            }
                        }
                    }
                    i12 = i12;
                }
            }
        }
        MotionScene.Transition transition = this.f19431p0.f19487c;
        if (transition != null && transition.isEnabled() && (touchResponse = transition.getTouchResponse()) != null && ((motionEvent.getAction() != 0 || (rectFB = touchResponse.b(this, new RectF())) == null || rectFB.contains(motionEvent.getX(), motionEvent.getY())) && (i10 = touchResponse.f19606e) != -1)) {
            View view3 = this.K1;
            if (view3 == null || view3.getId() != i10) {
                this.K1 = findViewById(i10);
            }
            View view4 = this.K1;
            if (view4 != null) {
                RectF rectF = this.J1;
                rectF.set(view4.getLeft(), this.K1.getTop(), this.K1.getRight(), this.K1.getBottom());
                if (rectF.contains(motionEvent.getX(), motionEvent.getY()) && !k(this.K1.getLeft(), this.K1.getTop(), motionEvent, this.K1)) {
                    return onTouchEvent(motionEvent);
                }
            }
        }
        return false;
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        this.f19439t1 = true;
        try {
            if (this.f19431p0 == null) {
                super.onLayout(z10, i10, i11, i12, i13);
                return;
            }
            int i14 = i12 - i10;
            int i15 = i13 - i11;
            if (this.U0 != i14 || this.V0 != i15) {
                rebuildScene();
                h(true);
            }
            this.U0 = i14;
            this.V0 = i15;
        } finally {
            this.f19439t1 = false;
        }
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.View
    public void onMeasure(int i10, int i11) {
        boolean z10;
        if (this.f19431p0 == null) {
            super.onMeasure(i10, i11);
            return;
        }
        boolean z11 = true;
        boolean z12 = (this.f19443w0 == i10 && this.f19445x0 == i11) ? false : true;
        if (this.I1) {
            this.I1 = false;
            m();
            n();
            z12 = true;
        }
        if (this.mDirtyHierarchy) {
            z12 = true;
        }
        this.f19443w0 = i10;
        this.f19445x0 = i11;
        int iG = this.f19431p0.g();
        MotionScene.Transition transition = this.f19431p0.f19487c;
        int i12 = transition == null ? -1 : transition.f19506c;
        g gVar = this.H1;
        if ((!z12 && iG == gVar.f19475e && i12 == gVar.f19476f) || this.f19438t0 == -1) {
            if (z12) {
                super.onMeasure(i10, i11);
            }
            z10 = true;
        } else {
            super.onMeasure(i10, i11);
            gVar.e(this.f19431p0.b(iG), this.f19431p0.b(i12));
            gVar.f();
            gVar.f19475e = iG;
            gVar.f19476f = i12;
            z10 = false;
        }
        if (this.mMeasureDuringTransition || z10) {
            int paddingBottom = getPaddingBottom() + getPaddingTop();
            int width = this.mLayoutWidget.getWidth() + getPaddingRight() + getPaddingLeft();
            int height = this.mLayoutWidget.getHeight() + paddingBottom;
            int i13 = this.f19432p1;
            if (i13 == Integer.MIN_VALUE || i13 == 0) {
                int i14 = this.f19427l1;
                width = (int) ((this.r1 * (this.f19429n1 - i14)) + i14);
                requestLayout();
            }
            int i15 = this.f19434q1;
            if (i15 == Integer.MIN_VALUE || i15 == 0) {
                int i16 = this.f19428m1;
                height = (int) ((this.r1 * (this.f19430o1 - i16)) + i16);
                requestLayout();
            }
            setMeasuredDimension(width, height);
        }
        float fSignum = Math.signum(this.K0 - this.I0);
        long nanoTime = getNanoTime();
        MotionInterpolator motionInterpolator = this.f19433q0;
        float interpolation = this.I0 + (!(motionInterpolator instanceof StopLogic) ? (((nanoTime - this.J0) * fSignum) * 1.0E-9f) / this.G0 : 0.0f);
        if (this.L0) {
            interpolation = this.K0;
        }
        if ((fSignum <= 0.0f || interpolation < this.K0) && (fSignum > 0.0f || interpolation > this.K0)) {
            z11 = false;
        } else {
            interpolation = this.K0;
        }
        if (motionInterpolator != null && !z11) {
            interpolation = this.Q0 ? motionInterpolator.getInterpolation((nanoTime - this.F0) * 1.0E-9f) : motionInterpolator.getInterpolation(interpolation);
        }
        if ((fSignum > 0.0f && interpolation >= this.K0) || (fSignum <= 0.0f && interpolation <= this.K0)) {
            interpolation = this.K0;
        }
        this.r1 = interpolation;
        int childCount = getChildCount();
        long nanoTime2 = getNanoTime();
        Interpolator interpolator = this.f19435r0;
        if (interpolator != null) {
            interpolation = interpolator.getInterpolation(interpolation);
        }
        for (int i17 = 0; i17 < childCount; i17++) {
            View childAt = getChildAt(i17);
            MotionController motionController = this.E0.get(childAt);
            if (motionController != null) {
                motionController.g(childAt, interpolation, nanoTime2, this.f19437s1);
            }
        }
        if (this.mMeasureDuringTransition) {
            requestLayout();
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.NestedScrollingParent
    public boolean onNestedFling(@NonNull View view, float f6, float f10, boolean z10) {
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.NestedScrollingParent
    public boolean onNestedPreFling(@NonNull View view, float f6, float f10) {
        return false;
    }

    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v4, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v5 */
    @Override // androidx.core.view.NestedScrollingParent2
    public void onNestedPreScroll(@NonNull View view, int i10, int i11, @NonNull int[] iArr, int i12) {
        MotionScene.Transition transition;
        ?? r1;
        androidx.constraintlayout.motion.widget.g gVar;
        float f6;
        androidx.constraintlayout.motion.widget.g gVar2;
        androidx.constraintlayout.motion.widget.g gVar3;
        androidx.constraintlayout.motion.widget.g touchResponse;
        int i13;
        MotionScene motionScene = this.f19431p0;
        if (motionScene == null || (transition = motionScene.f19487c) == null || !transition.isEnabled()) {
            return;
        }
        int i14 = -1;
        if (!transition.isEnabled() || (touchResponse = transition.getTouchResponse()) == null || (i13 = touchResponse.f19606e) == -1 || view.getId() == i13) {
            MotionScene.Transition transition2 = motionScene.f19487c;
            if (transition2 != null && (gVar3 = transition2.f19515l) != null && gVar3.f19621u) {
                androidx.constraintlayout.motion.widget.g touchResponse2 = transition.getTouchResponse();
                if (touchResponse2 != null && (touchResponse2.f19623w & 4) != 0) {
                    i14 = i11;
                }
                float f10 = this.H0;
                if ((f10 == 1.0f || f10 == 0.0f) && view.canScrollVertically(i14)) {
                    return;
                }
            }
            if (transition.getTouchResponse() != null && (transition.getTouchResponse().f19623w & 1) != 0) {
                float f11 = i10;
                float f12 = i11;
                MotionScene.Transition transition3 = motionScene.f19487c;
                if (transition3 == null || (gVar2 = transition3.f19515l) == null) {
                    f6 = 0.0f;
                } else {
                    gVar2.f19618r.j(gVar2.f19605d, gVar2.f19618r.getProgress(), gVar2.f19609h, gVar2.f19608g, gVar2.f19614n);
                    float f13 = gVar2.f19612k;
                    float[] fArr = gVar2.f19614n;
                    if (f13 != 0.0f) {
                        if (fArr[0] == 0.0f) {
                            fArr[0] = 1.0E-7f;
                        }
                        f6 = (f11 * f13) / fArr[0];
                    } else {
                        if (fArr[1] == 0.0f) {
                            fArr[1] = 1.0E-7f;
                        }
                        f6 = (f12 * gVar2.f19613l) / fArr[1];
                    }
                }
                float f14 = this.I0;
                if ((f14 <= 0.0f && f6 < 0.0f) || (f14 >= 1.0f && f6 > 0.0f)) {
                    view.setNestedScrollingEnabled(false);
                    view.post(new c(view));
                    return;
                }
            }
            float f15 = this.H0;
            long nanoTime = getNanoTime();
            float f16 = i10;
            this.X0 = f16;
            float f17 = i11;
            this.Y0 = f17;
            this.f19416a1 = (float) ((nanoTime - this.Z0) * 1.0E-9d);
            this.Z0 = nanoTime;
            MotionScene.Transition transition4 = motionScene.f19487c;
            if (transition4 != null && (gVar = transition4.f19515l) != null) {
                MotionLayout motionLayout = gVar.f19618r;
                float progress = motionLayout.getProgress();
                if (!gVar.m) {
                    gVar.m = true;
                    motionLayout.setProgress(progress);
                }
                gVar.f19618r.j(gVar.f19605d, progress, gVar.f19609h, gVar.f19608g, gVar.f19614n);
                float f18 = gVar.f19612k;
                float[] fArr2 = gVar.f19614n;
                if (Math.abs((gVar.f19613l * fArr2[1]) + (f18 * fArr2[0])) < 0.01d) {
                    fArr2[0] = 0.01f;
                    fArr2[1] = 0.01f;
                }
                float f19 = gVar.f19612k;
                float fMax = Math.max(Math.min(progress + (f19 != 0.0f ? (f16 * f19) / fArr2[0] : (f17 * gVar.f19613l) / fArr2[1]), 1.0f), 0.0f);
                if (fMax != motionLayout.getProgress()) {
                    motionLayout.setProgress(fMax);
                }
            }
            if (f15 != this.H0) {
                iArr[0] = i10;
                r1 = 1;
                iArr[1] = i11;
            } else {
                r1 = 1;
            }
            h(false);
            if (iArr[0] == 0 && iArr[r1] == 0) {
                return;
            }
            this.W0 = r1;
        }
    }

    @Override // androidx.core.view.NestedScrollingParent2
    public void onNestedScroll(@NonNull View view, int i10, int i11, int i12, int i13, int i14) {
    }

    @Override // androidx.core.view.NestedScrollingParent2
    public void onNestedScrollAccepted(@NonNull View view, @NonNull View view2, int i10, int i11) {
        this.Z0 = getNanoTime();
        this.f19416a1 = 0.0f;
        this.X0 = 0.0f;
        this.Y0 = 0.0f;
    }

    @Override // android.view.View
    public void onRtlPropertiesChanged(int i10) {
        MotionScene motionScene = this.f19431p0;
        if (motionScene != null) {
            motionScene.setRtl(isRtl());
        }
    }

    @Override // androidx.core.view.NestedScrollingParent2
    public boolean onStartNestedScroll(@NonNull View view, @NonNull View view2, int i10, int i11) {
        MotionScene.Transition transition;
        MotionScene motionScene = this.f19431p0;
        return (motionScene == null || (transition = motionScene.f19487c) == null || transition.getTouchResponse() == null || (this.f19431p0.f19487c.getTouchResponse().f19623w & 2) != 0) ? false : true;
    }

    @Override // androidx.core.view.NestedScrollingParent2
    public void onStopNestedScroll(@NonNull View view, int i10) {
        androidx.constraintlayout.motion.widget.g gVar;
        int i11;
        MotionScene motionScene = this.f19431p0;
        if (motionScene != null) {
            float f6 = this.f19416a1;
            if (f6 == 0.0f) {
                return;
            }
            float f10 = this.X0 / f6;
            float f11 = this.Y0 / f6;
            MotionScene.Transition transition = motionScene.f19487c;
            if (transition == null || (gVar = transition.f19515l) == null) {
                return;
            }
            gVar.m = false;
            MotionLayout motionLayout = gVar.f19618r;
            float progress = motionLayout.getProgress();
            gVar.f19618r.j(gVar.f19605d, progress, gVar.f19609h, gVar.f19608g, gVar.f19614n);
            float f12 = gVar.f19612k;
            float[] fArr = gVar.f19614n;
            float f13 = f12 != 0.0f ? (f10 * f12) / fArr[0] : (f11 * gVar.f19613l) / fArr[1];
            if (!Float.isNaN(f13)) {
                progress += f13 / 3.0f;
            }
            if (progress == 0.0f || progress == 1.0f || (i11 = gVar.f19604c) == 3) {
                return;
            }
            motionLayout.touchAnimateTo(i11, ((double) progress) >= 0.5d ? 1.0f : 0.0f, f13);
        }
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0274  */
    /* JADX WARN: Code duplicated, block: B:103:0x0278  */
    /* JADX WARN: Code duplicated, block: B:105:0x027c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:106:0x027e  */
    /* JADX WARN: Code duplicated, block: B:107:0x0280  */
    /* JADX WARN: Code duplicated, block: B:110:0x02b7  */
    /* JADX WARN: Code duplicated, block: B:112:0x02c8  */
    /* JADX WARN: Code duplicated, block: B:114:0x02f1  */
    /* JADX WARN: Code duplicated, block: B:116:0x0320  */
    /* JADX WARN: Code duplicated, block: B:118:0x0325  */
    /* JADX WARN: Code duplicated, block: B:119:0x035a A[PHI: r6 r7
      0x035a: PHI (r6v47 float) = (r6v40 float), (r6v78 float) binds: [B:117:0x0323, B:115:0x0315] A[DONT_GENERATE, DONT_INLINE]
      0x035a: PHI (r7v39 float) = (r7v33 float), (r7v49 float) binds: [B:117:0x0323, B:115:0x0315] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:121:0x0375  */
    /* JADX WARN: Code duplicated, block: B:122:0x038d  */
    /* JADX WARN: Code duplicated, block: B:125:0x03a8  */
    /* JADX WARN: Code duplicated, block: B:127:0x03b6  */
    /* JADX WARN: Code duplicated, block: B:130:0x03bc  */
    /* JADX WARN: Code duplicated, block: B:155:0x0417  */
    /* JADX WARN: Code duplicated, block: B:157:0x041c  */
    /* JADX WARN: Code duplicated, block: B:159:0x0422  */
    /* JADX WARN: Code duplicated, block: B:160:0x0429  */
    /* JADX WARN: Code duplicated, block: B:161:0x043a  */
    /* JADX WARN: Code duplicated, block: B:163:0x0445  */
    /* JADX WARN: Code duplicated, block: B:165:0x0448 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:167:0x044c  */
    /* JADX WARN: Code duplicated, block: B:169:0x046b  */
    /* JADX WARN: Code duplicated, block: B:171:0x046f  */
    /* JADX WARN: Code duplicated, block: B:173:0x0477  */
    /* JADX WARN: Code duplicated, block: B:176:0x0482  */
    /* JADX WARN: Code duplicated, block: B:177:0x0491  */
    /* JADX WARN: Code duplicated, block: B:180:0x04c4  */
    /* JADX WARN: Code duplicated, block: B:181:0x04ca  */
    /* JADX WARN: Code duplicated, block: B:184:0x04d2  */
    /* JADX WARN: Code duplicated, block: B:185:0x04d6  */
    /* JADX WARN: Code duplicated, block: B:188:0x04ea  */
    /* JADX WARN: Code duplicated, block: B:191:0x04f3  */
    /* JADX WARN: Code duplicated, block: B:194:0x0502  */
    /* JADX WARN: Code duplicated, block: B:196:0x0507  */
    /* JADX WARN: Code duplicated, block: B:198:0x050d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:199:0x050f  */
    /* JADX WARN: Code duplicated, block: B:200:0x0511  */
    /* JADX WARN: Code duplicated, block: B:204:0x052c  */
    /* JADX WARN: Code duplicated, block: B:205:0x0531  */
    /* JADX WARN: Code duplicated, block: B:207:0x0539  */
    /* JADX WARN: Code duplicated, block: B:209:0x054a  */
    /* JADX WARN: Code duplicated, block: B:211:0x0563  */
    /* JADX WARN: Code duplicated, block: B:212:0x0572  */
    /* JADX WARN: Code duplicated, block: B:215:0x0596  */
    /* JADX WARN: Code duplicated, block: B:216:0x0598  */
    /* JADX WARN: Code duplicated, block: B:219:0x05a0  */
    /* JADX WARN: Code duplicated, block: B:221:0x05a7  */
    /* JADX WARN: Code duplicated, block: B:224:0x05ad  */
    /* JADX WARN: Code duplicated, block: B:249:0x05fd  */
    /* JADX WARN: Code duplicated, block: B:251:0x0602  */
    /* JADX WARN: Code duplicated, block: B:253:0x0608  */
    /* JADX WARN: Code duplicated, block: B:254:0x060e  */
    /* JADX WARN: Code duplicated, block: B:257:0x0630  */
    /* JADX WARN: Code duplicated, block: B:261:0x063f  */
    /* JADX WARN: Code duplicated, block: B:56:0x0115  */
    /* JADX WARN: Code duplicated, block: B:59:0x011b  */
    /* JADX WARN: Code duplicated, block: B:61:0x011f  */
    /* JADX WARN: Code duplicated, block: B:67:0x0136  */
    /* JADX WARN: Code duplicated, block: B:69:0x013f  */
    /* JADX WARN: Code duplicated, block: B:71:0x0147 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:73:0x014b  */
    /* JADX WARN: Code duplicated, block: B:75:0x0163  */
    /* JADX WARN: Code duplicated, block: B:76:0x018d  */
    /* JADX WARN: Code duplicated, block: B:78:0x0191  */
    /* JADX WARN: Code duplicated, block: B:84:0x020a  */
    /* JADX WARN: Code duplicated, block: B:85:0x020d  */
    /* JADX WARN: Code duplicated, block: B:87:0x0213  */
    /* JADX WARN: Code duplicated, block: B:90:0x021e  */
    /* JADX WARN: Code duplicated, block: B:92:0x0222  */
    /* JADX WARN: Code duplicated, block: B:94:0x022a  */
    /* JADX WARN: Code duplicated, block: B:97:0x0234  */
    /* JADX WARN: Code duplicated, block: B:98:0x0257  */
    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        MotionScene.Transition transition;
        MotionTracker motionTracker;
        int i10;
        androidx.constraintlayout.motion.widget.g gVar;
        MotionTracker motionTracker2;
        boolean z10;
        float[] fArr;
        MotionLayout motionLayout;
        int action;
        float xVelocity;
        float yVelocity;
        float progress;
        int i11;
        char c10;
        char c11;
        float f6;
        float f10;
        float f11;
        float fAbs;
        float f12;
        int i12;
        float rawY;
        float rawX;
        float progress2;
        int i13;
        char c12;
        char c13;
        char c14;
        float f13;
        float fMax;
        float progress3;
        boolean z11;
        float xVelocity2;
        float yVelocity2;
        float f14;
        int action2;
        int[] iArr;
        float progress4;
        int i14;
        int i15;
        float right;
        float f15;
        int top;
        int bottom;
        int i16;
        float degrees;
        float f16;
        int i17;
        float width;
        float height;
        int i18;
        int i19;
        View viewFindViewById;
        float rawX2;
        float rawY2;
        double dAtan2;
        float fAtan2;
        float progress5;
        int i20;
        char c15;
        float fMax2;
        float progress6;
        boolean z12;
        MotionEvent motionEvent2;
        MotionScene motionScene = this.f19431p0;
        if (motionScene == null || !this.f19447y0 || !motionScene.o()) {
            return super.onTouchEvent(motionEvent);
        }
        MotionScene.Transition transition2 = this.f19431p0.f19487c;
        if (transition2 != null && !transition2.isEnabled()) {
            return super.onTouchEvent(motionEvent);
        }
        MotionScene motionScene2 = this.f19431p0;
        int currentState = getCurrentState();
        motionScene2.getClass();
        RectF rectF = new RectF();
        MotionTracker motionTracker3 = motionScene2.f19499p;
        MotionLayout motionLayout2 = motionScene2.f19485a;
        if (motionTracker3 == null) {
            motionScene2.f19499p = motionLayout2.obtainVelocityTracker();
        }
        motionScene2.f19499p.addMovement(motionEvent);
        if (currentState != -1) {
            int action3 = motionEvent.getAction();
            if (action3 == 0) {
                motionScene2.f19502s = motionEvent.getRawX();
                motionScene2.f19503t = motionEvent.getRawY();
                motionScene2.m = motionEvent;
                motionScene2.f19497n = false;
                androidx.constraintlayout.motion.widget.g gVar2 = motionScene2.f19487c.f19515l;
                if (gVar2 != null) {
                    RectF rectFA = gVar2.a(motionLayout2, rectF);
                    if (rectFA == null || rectFA.contains(motionScene2.m.getX(), motionScene2.m.getY())) {
                        RectF rectFB = motionScene2.f19487c.f19515l.b(motionLayout2, rectF);
                        if (rectFB == null || rectFB.contains(motionScene2.m.getX(), motionScene2.m.getY())) {
                            motionScene2.f19498o = false;
                        } else {
                            motionScene2.f19498o = true;
                        }
                        androidx.constraintlayout.motion.widget.g gVar3 = motionScene2.f19487c.f19515l;
                        float f17 = motionScene2.f19502s;
                        float f18 = motionScene2.f19503t;
                        gVar3.f19616p = f17;
                        gVar3.f19617q = f18;
                    } else {
                        motionScene2.m = null;
                        motionScene2.f19497n = true;
                    }
                }
            } else if (action3 == 2 && !motionScene2.f19497n) {
                float rawY3 = motionEvent.getRawY() - motionScene2.f19503t;
                float rawX3 = motionEvent.getRawX() - motionScene2.f19502s;
                if ((rawX3 != 0.0d || rawY3 != 0.0d) && (motionEvent2 = motionScene2.m) != null) {
                    MotionScene.Transition transitionBestTransitionFor = motionScene2.bestTransitionFor(currentState, rawX3, rawY3, motionEvent2);
                    if (transitionBestTransitionFor != null) {
                        setTransition(transitionBestTransitionFor);
                        RectF rectFB2 = motionScene2.f19487c.f19515l.b(motionLayout2, rectF);
                        motionScene2.f19498o = (rectFB2 == null || rectFB2.contains(motionScene2.m.getX(), motionScene2.m.getY())) ? false : true;
                        androidx.constraintlayout.motion.widget.g gVar4 = motionScene2.f19487c.f19515l;
                        float f19 = motionScene2.f19502s;
                        float f20 = motionScene2.f19503t;
                        gVar4.f19616p = f19;
                        gVar4.f19617q = f20;
                        gVar4.m = false;
                    }
                    if (!motionScene2.f19497n) {
                        transition = motionScene2.f19487c;
                        if (transition != null) {
                            motionTracker2 = motionScene2.f19499p;
                            z10 = gVar.f19611j;
                            fArr = gVar.f19614n;
                            motionLayout = gVar.f19618r;
                            if (z10) {
                                motionTracker2.addMovement(motionEvent);
                                action2 = motionEvent.getAction();
                                if (action2 != 0) {
                                    iArr = gVar.f19615o;
                                    if (action2 == 1) {
                                        gVar.m = false;
                                        motionTracker2.computeCurrentVelocity(16);
                                        float xVelocity3 = motionTracker2.getXVelocity();
                                        float yVelocity3 = motionTracker2.getYVelocity();
                                        progress4 = motionLayout.getProgress();
                                        float width2 = motionLayout.getWidth() / 2.0f;
                                        float height2 = motionLayout.getHeight() / 2.0f;
                                        i14 = gVar.f19610i;
                                        if (i14 != -1) {
                                            View viewFindViewById2 = motionLayout.findViewById(i14);
                                            motionLayout.getLocationOnScreen(iArr);
                                            right = iArr[0] + ((viewFindViewById2.getRight() + viewFindViewById2.getLeft()) / 2.0f);
                                            f15 = iArr[1];
                                            top = viewFindViewById2.getTop();
                                            bottom = viewFindViewById2.getBottom();
                                        } else {
                                            i15 = gVar.f19605d;
                                            if (i15 != -1) {
                                                View viewFindViewById3 = motionLayout.findViewById(motionLayout.E0.get(motionLayout.findViewById(i15)).getAnimateRelativeTo());
                                                motionLayout.getLocationOnScreen(iArr);
                                                right = iArr[0] + ((viewFindViewById3.getRight() + viewFindViewById3.getLeft()) / 2.0f);
                                                f15 = iArr[1];
                                                top = viewFindViewById3.getTop();
                                                bottom = viewFindViewById3.getBottom();
                                            } else {
                                                float rawX4 = motionEvent.getRawX() - width2;
                                                float rawY4 = motionEvent.getRawY() - height2;
                                                double degrees2 = Math.toDegrees(Math.atan2(rawY4, rawX4));
                                                i16 = gVar.f19605d;
                                                if (i16 != -1) {
                                                    gVar.f19618r.j(i16, progress4, gVar.f19609h, gVar.f19608g, gVar.f19614n);
                                                    fArr[1] = (float) Math.toDegrees(fArr[1]);
                                                } else {
                                                    fArr[1] = 360.0f;
                                                }
                                                degrees = ((float) (Math.toDegrees(Math.atan2(yVelocity3 + rawY4, xVelocity3 + rawX4)) - degrees2)) * 62.5f;
                                                if (Float.isNaN(degrees)) {
                                                    f16 = progress4;
                                                } else {
                                                    f16 = (((degrees * 3.0f) * gVar.f19622v) / fArr[1]) + progress4;
                                                }
                                                if (f16 == 0.0f) {
                                                    if (0.0f < f16) {
                                                        motionLayout.setState(j.FINISHED);
                                                    } else {
                                                        motionLayout.setState(j.FINISHED);
                                                    }
                                                } else if (0.0f < f16) {
                                                    motionLayout.setState(j.FINISHED);
                                                } else {
                                                    motionLayout.setState(j.FINISHED);
                                                }
                                            }
                                        }
                                        float f21 = right;
                                        height2 = ((bottom + top) / 2.0f) + f15;
                                        width2 = f21;
                                        float rawX5 = motionEvent.getRawX() - width2;
                                        float rawY5 = motionEvent.getRawY() - height2;
                                        double degrees3 = Math.toDegrees(Math.atan2(rawY5, rawX5));
                                        i16 = gVar.f19605d;
                                        if (i16 != -1) {
                                            gVar.f19618r.j(i16, progress4, gVar.f19609h, gVar.f19608g, gVar.f19614n);
                                            fArr[1] = (float) Math.toDegrees(fArr[1]);
                                        } else {
                                            fArr[1] = 360.0f;
                                        }
                                        degrees = ((float) (Math.toDegrees(Math.atan2(yVelocity3 + rawY5, xVelocity3 + rawX5)) - degrees3)) * 62.5f;
                                        if (Float.isNaN(degrees)) {
                                            f16 = (((degrees * 3.0f) * gVar.f19622v) / fArr[1]) + progress4;
                                        } else {
                                            f16 = progress4;
                                        }
                                        if (f16 == 0.0f) {
                                            if (0.0f < f16) {
                                                motionLayout.setState(j.FINISHED);
                                            } else {
                                                motionLayout.setState(j.FINISHED);
                                            }
                                        } else if (0.0f < f16) {
                                            motionLayout.setState(j.FINISHED);
                                        } else {
                                            motionLayout.setState(j.FINISHED);
                                        }
                                    } else if (action2 == 2) {
                                        motionEvent.getRawY();
                                        motionEvent.getRawX();
                                        width = motionLayout.getWidth() / 2.0f;
                                        height = motionLayout.getHeight() / 2.0f;
                                        i18 = gVar.f19610i;
                                        if (i18 != -1) {
                                            View viewFindViewById4 = motionLayout.findViewById(i18);
                                            motionLayout.getLocationOnScreen(iArr);
                                            float right2 = iArr[0] + ((viewFindViewById4.getRight() + viewFindViewById4.getLeft()) / 2.0f);
                                            height = iArr[1] + ((viewFindViewById4.getBottom() + viewFindViewById4.getTop()) / 2.0f);
                                            width = right2;
                                        } else {
                                            i19 = gVar.f19605d;
                                            if (i19 != -1) {
                                                motionLayout.getLocationOnScreen(iArr);
                                                width = iArr[0] + ((viewFindViewById.getRight() + viewFindViewById.getLeft()) / 2.0f);
                                                height = iArr[1] + ((viewFindViewById.getBottom() + viewFindViewById.getTop()) / 2.0f);
                                            }
                                        }
                                        rawX2 = motionEvent.getRawX() - width;
                                        rawY2 = motionEvent.getRawY() - height;
                                        dAtan2 = Math.atan2(motionEvent.getRawY() - height, motionEvent.getRawX() - width);
                                        fAtan2 = (float) (((dAtan2 - Math.atan2(gVar.f19617q - height, gVar.f19616p - width)) * 180.0d) / 3.141592653589793d);
                                        if (fAtan2 > 330.0f) {
                                            fAtan2 -= 360.0f;
                                        } else if (fAtan2 < -330.0f) {
                                            fAtan2 += 360.0f;
                                        }
                                        if (Math.abs(fAtan2) <= 0.01d) {
                                            progress5 = motionLayout.getProgress();
                                            if (!gVar.m) {
                                                gVar.m = true;
                                                motionLayout.setProgress(progress5);
                                            }
                                            i20 = gVar.f19605d;
                                            if (i20 != -1) {
                                                gVar.f19618r.j(i20, progress5, gVar.f19609h, gVar.f19608g, gVar.f19614n);
                                                c15 = 1;
                                                fArr[1] = (float) Math.toDegrees(fArr[1]);
                                            } else {
                                                c15 = 1;
                                                fArr[1] = 360.0f;
                                            }
                                            fMax2 = Math.max(Math.min(((fAtan2 * gVar.f19622v) / fArr[c15]) + progress5, 1.0f), 0.0f);
                                            progress6 = motionLayout.getProgress();
                                            if (fMax2 != progress6) {
                                                if (progress6 != 0.0f) {
                                                    if (progress6 == 0.0f) {
                                                        z12 = true;
                                                    } else {
                                                        z12 = false;
                                                    }
                                                    motionLayout.g(z12);
                                                } else {
                                                    if (progress6 == 0.0f) {
                                                        z12 = true;
                                                    } else {
                                                        z12 = false;
                                                    }
                                                    motionLayout.g(z12);
                                                }
                                                motionLayout.setProgress(fMax2);
                                                motionTracker2.computeCurrentVelocity(1000);
                                                float xVelocity4 = motionTracker2.getXVelocity();
                                                double yVelocity4 = motionTracker2.getYVelocity();
                                                double d2 = xVelocity4;
                                                motionLayout.f19436s0 = (float) Math.toDegrees((float) ((Math.sin(Math.atan2(yVelocity4, d2) - dAtan2) * Math.hypot(yVelocity4, d2)) / Math.hypot(rawX2, rawY2)));
                                            } else {
                                                motionLayout.f19436s0 = 0.0f;
                                            }
                                            gVar.f19616p = motionEvent.getRawX();
                                            gVar.f19617q = motionEvent.getRawY();
                                        } else {
                                            progress5 = motionLayout.getProgress();
                                            if (!gVar.m) {
                                                gVar.m = true;
                                                motionLayout.setProgress(progress5);
                                            }
                                            i20 = gVar.f19605d;
                                            if (i20 != -1) {
                                                gVar.f19618r.j(i20, progress5, gVar.f19609h, gVar.f19608g, gVar.f19614n);
                                                c15 = 1;
                                                fArr[1] = (float) Math.toDegrees(fArr[1]);
                                            } else {
                                                c15 = 1;
                                                fArr[1] = 360.0f;
                                            }
                                            fMax2 = Math.max(Math.min(((fAtan2 * gVar.f19622v) / fArr[c15]) + progress5, 1.0f), 0.0f);
                                            progress6 = motionLayout.getProgress();
                                            if (fMax2 != progress6) {
                                                if (progress6 != 0.0f) {
                                                    if (progress6 == 0.0f) {
                                                        z12 = true;
                                                    } else {
                                                        z12 = false;
                                                    }
                                                    motionLayout.g(z12);
                                                } else {
                                                    if (progress6 == 0.0f) {
                                                        z12 = true;
                                                    } else {
                                                        z12 = false;
                                                    }
                                                    motionLayout.g(z12);
                                                }
                                                motionLayout.setProgress(fMax2);
                                                motionTracker2.computeCurrentVelocity(1000);
                                                float xVelocity5 = motionTracker2.getXVelocity();
                                                double yVelocity5 = motionTracker2.getYVelocity();
                                                double d3 = xVelocity5;
                                                motionLayout.f19436s0 = (float) Math.toDegrees((float) ((Math.sin(Math.atan2(yVelocity5, d3) - dAtan2) * Math.hypot(yVelocity5, d3)) / Math.hypot(rawX2, rawY2)));
                                            } else {
                                                motionLayout.f19436s0 = 0.0f;
                                            }
                                            gVar.f19616p = motionEvent.getRawX();
                                            gVar.f19617q = motionEvent.getRawY();
                                        }
                                    }
                                } else {
                                    gVar.f19616p = motionEvent.getRawX();
                                    gVar.f19617q = motionEvent.getRawY();
                                    gVar.m = false;
                                }
                            } else {
                                motionTracker2.addMovement(motionEvent);
                                action = motionEvent.getAction();
                                if (action == 0) {
                                    gVar.f19616p = motionEvent.getRawX();
                                    gVar.f19617q = motionEvent.getRawY();
                                    gVar.m = false;
                                } else if (action == 1) {
                                    gVar.m = false;
                                    motionTracker2.computeCurrentVelocity(1000);
                                    xVelocity = motionTracker2.getXVelocity();
                                    yVelocity = motionTracker2.getYVelocity();
                                    progress = motionLayout.getProgress();
                                    i11 = gVar.f19605d;
                                    if (i11 != -1) {
                                        gVar.f19618r.j(i11, progress, gVar.f19609h, gVar.f19608g, gVar.f19614n);
                                        c11 = 0;
                                        c10 = 1;
                                    } else {
                                        float fMin = Math.min(motionLayout.getWidth(), motionLayout.getHeight());
                                        c10 = 1;
                                        fArr[1] = gVar.f19613l * fMin;
                                        c11 = 0;
                                        fArr[0] = fMin * gVar.f19612k;
                                    }
                                    f6 = gVar.f19612k;
                                    f10 = fArr[c11];
                                    f11 = fArr[c10];
                                    if (f6 != 0.0f) {
                                        fAbs = xVelocity / f10;
                                    } else {
                                        fAbs = yVelocity / f11;
                                    }
                                    if (Float.isNaN(fAbs)) {
                                        f12 = progress;
                                    } else {
                                        f12 = (fAbs / 3.0f) + progress;
                                    }
                                    if (f12 == 0.0f) {
                                        if (0.0f < f12) {
                                            motionLayout.setState(j.FINISHED);
                                        } else {
                                            motionLayout.setState(j.FINISHED);
                                        }
                                    } else if (0.0f < f12) {
                                        motionLayout.setState(j.FINISHED);
                                    } else {
                                        motionLayout.setState(j.FINISHED);
                                    }
                                } else if (action == 2) {
                                    rawY = motionEvent.getRawY() - gVar.f19617q;
                                    rawX = motionEvent.getRawX() - gVar.f19616p;
                                    if (Math.abs((gVar.f19613l * rawY) + (gVar.f19612k * rawX)) <= gVar.f19624x) {
                                        progress2 = motionLayout.getProgress();
                                        if (!gVar.m) {
                                            gVar.m = true;
                                            motionLayout.setProgress(progress2);
                                        }
                                        i13 = gVar.f19605d;
                                        if (i13 != -1) {
                                            gVar.f19618r.j(i13, progress2, gVar.f19609h, gVar.f19608g, gVar.f19614n);
                                            c13 = 0;
                                            c12 = 1;
                                        } else {
                                            float fMin2 = Math.min(motionLayout.getWidth(), motionLayout.getHeight());
                                            c12 = 1;
                                            fArr[1] = gVar.f19613l * fMin2;
                                            c13 = 0;
                                            fArr[0] = fMin2 * gVar.f19612k;
                                        }
                                        if (Math.abs(((gVar.f19613l * fArr[c12]) + (gVar.f19612k * fArr[c13])) * gVar.f19622v) < 0.01d) {
                                            c14 = 0;
                                            fArr[0] = 0.01f;
                                            fArr[c12] = 0.01f;
                                        } else {
                                            c14 = 0;
                                        }
                                        if (gVar.f19612k != 0.0f) {
                                            f13 = rawX / fArr[c14];
                                        } else {
                                            f13 = rawY / fArr[c12];
                                        }
                                        fMax = Math.max(Math.min(progress2 + f13, 1.0f), 0.0f);
                                        if (gVar.f19604c == 6) {
                                            fMax = Math.max(fMax, 0.01f);
                                        }
                                        if (gVar.f19604c == 7) {
                                            fMax = Math.min(fMax, 0.99f);
                                        }
                                        progress3 = motionLayout.getProgress();
                                        if (fMax != progress3) {
                                            if (progress3 != 0.0f) {
                                                if (progress3 == 0.0f) {
                                                    z11 = true;
                                                } else {
                                                    z11 = false;
                                                }
                                                motionLayout.g(z11);
                                            } else {
                                                if (progress3 == 0.0f) {
                                                    z11 = true;
                                                } else {
                                                    z11 = false;
                                                }
                                                motionLayout.g(z11);
                                            }
                                            motionLayout.setProgress(fMax);
                                            motionTracker2.computeCurrentVelocity(1000);
                                            xVelocity2 = motionTracker2.getXVelocity();
                                            yVelocity2 = motionTracker2.getYVelocity();
                                            if (gVar.f19612k != 0.0f) {
                                                f14 = xVelocity2 / fArr[0];
                                            } else {
                                                f14 = yVelocity2 / fArr[1];
                                            }
                                            motionLayout.f19436s0 = f14;
                                        } else {
                                            motionLayout.f19436s0 = 0.0f;
                                        }
                                        gVar.f19616p = motionEvent.getRawX();
                                        gVar.f19617q = motionEvent.getRawY();
                                    } else {
                                        progress2 = motionLayout.getProgress();
                                        if (!gVar.m) {
                                            gVar.m = true;
                                            motionLayout.setProgress(progress2);
                                        }
                                        i13 = gVar.f19605d;
                                        if (i13 != -1) {
                                            gVar.f19618r.j(i13, progress2, gVar.f19609h, gVar.f19608g, gVar.f19614n);
                                            c13 = 0;
                                            c12 = 1;
                                        } else {
                                            float fMin3 = Math.min(motionLayout.getWidth(), motionLayout.getHeight());
                                            c12 = 1;
                                            fArr[1] = gVar.f19613l * fMin3;
                                            c13 = 0;
                                            fArr[0] = fMin3 * gVar.f19612k;
                                        }
                                        if (Math.abs(((gVar.f19613l * fArr[c12]) + (gVar.f19612k * fArr[c13])) * gVar.f19622v) < 0.01d) {
                                            c14 = 0;
                                            fArr[0] = 0.01f;
                                            fArr[c12] = 0.01f;
                                        } else {
                                            c14 = 0;
                                        }
                                        if (gVar.f19612k != 0.0f) {
                                            f13 = rawX / fArr[c14];
                                        } else {
                                            f13 = rawY / fArr[c12];
                                        }
                                        fMax = Math.max(Math.min(progress2 + f13, 1.0f), 0.0f);
                                        if (gVar.f19604c == 6) {
                                            fMax = Math.max(fMax, 0.01f);
                                        }
                                        if (gVar.f19604c == 7) {
                                            fMax = Math.min(fMax, 0.99f);
                                        }
                                        progress3 = motionLayout.getProgress();
                                        if (fMax != progress3) {
                                            if (progress3 != 0.0f) {
                                                if (progress3 == 0.0f) {
                                                    z11 = true;
                                                } else {
                                                    z11 = false;
                                                }
                                                motionLayout.g(z11);
                                            } else {
                                                if (progress3 == 0.0f) {
                                                    z11 = true;
                                                } else {
                                                    z11 = false;
                                                }
                                                motionLayout.g(z11);
                                            }
                                            motionLayout.setProgress(fMax);
                                            motionTracker2.computeCurrentVelocity(1000);
                                            xVelocity2 = motionTracker2.getXVelocity();
                                            yVelocity2 = motionTracker2.getYVelocity();
                                            if (gVar.f19612k != 0.0f) {
                                                f14 = xVelocity2 / fArr[0];
                                            } else {
                                                f14 = yVelocity2 / fArr[1];
                                            }
                                            motionLayout.f19436s0 = f14;
                                        } else {
                                            motionLayout.f19436s0 = 0.0f;
                                        }
                                        gVar.f19616p = motionEvent.getRawX();
                                        gVar.f19617q = motionEvent.getRawY();
                                    }
                                }
                            }
                        }
                        motionScene2.f19502s = motionEvent.getRawX();
                        motionScene2.f19503t = motionEvent.getRawY();
                        if (motionEvent.getAction() == 1) {
                            motionTracker.recycle();
                            motionScene2.f19499p = null;
                            i10 = this.f19440u0;
                            if (i10 != -1) {
                                motionScene2.a(this, i10);
                            }
                        }
                    }
                }
            } else if (!motionScene2.f19497n) {
                transition = motionScene2.f19487c;
                if (transition != null) {
                    motionTracker2 = motionScene2.f19499p;
                    z10 = gVar.f19611j;
                    fArr = gVar.f19614n;
                    motionLayout = gVar.f19618r;
                    if (z10) {
                        motionTracker2.addMovement(motionEvent);
                        action2 = motionEvent.getAction();
                        if (action2 != 0) {
                            iArr = gVar.f19615o;
                            if (action2 == 1) {
                                gVar.m = false;
                                motionTracker2.computeCurrentVelocity(16);
                                float xVelocity6 = motionTracker2.getXVelocity();
                                float yVelocity6 = motionTracker2.getYVelocity();
                                progress4 = motionLayout.getProgress();
                                float width3 = motionLayout.getWidth() / 2.0f;
                                float height3 = motionLayout.getHeight() / 2.0f;
                                i14 = gVar.f19610i;
                                if (i14 != -1) {
                                    View viewFindViewById5 = motionLayout.findViewById(i14);
                                    motionLayout.getLocationOnScreen(iArr);
                                    right = iArr[0] + ((viewFindViewById5.getRight() + viewFindViewById5.getLeft()) / 2.0f);
                                    f15 = iArr[1];
                                    top = viewFindViewById5.getTop();
                                    bottom = viewFindViewById5.getBottom();
                                } else {
                                    i15 = gVar.f19605d;
                                    if (i15 != -1) {
                                        View viewFindViewById6 = motionLayout.findViewById(motionLayout.E0.get(motionLayout.findViewById(i15)).getAnimateRelativeTo());
                                        motionLayout.getLocationOnScreen(iArr);
                                        right = iArr[0] + ((viewFindViewById6.getRight() + viewFindViewById6.getLeft()) / 2.0f);
                                        f15 = iArr[1];
                                        top = viewFindViewById6.getTop();
                                        bottom = viewFindViewById6.getBottom();
                                    } else {
                                        float rawX6 = motionEvent.getRawX() - width3;
                                        float rawY6 = motionEvent.getRawY() - height3;
                                        double degrees4 = Math.toDegrees(Math.atan2(rawY6, rawX6));
                                        i16 = gVar.f19605d;
                                        if (i16 != -1) {
                                            gVar.f19618r.j(i16, progress4, gVar.f19609h, gVar.f19608g, gVar.f19614n);
                                            fArr[1] = (float) Math.toDegrees(fArr[1]);
                                        } else {
                                            fArr[1] = 360.0f;
                                        }
                                        degrees = ((float) (Math.toDegrees(Math.atan2(yVelocity6 + rawY6, xVelocity6 + rawX6)) - degrees4)) * 62.5f;
                                        if (Float.isNaN(degrees)) {
                                            f16 = (((degrees * 3.0f) * gVar.f19622v) / fArr[1]) + progress4;
                                        } else {
                                            f16 = progress4;
                                        }
                                        if (f16 == 0.0f) {
                                            if (0.0f < f16) {
                                                motionLayout.setState(j.FINISHED);
                                            } else {
                                                motionLayout.setState(j.FINISHED);
                                            }
                                        } else if (0.0f < f16) {
                                            motionLayout.setState(j.FINISHED);
                                        } else {
                                            motionLayout.setState(j.FINISHED);
                                        }
                                    }
                                }
                                float f22 = right;
                                height3 = ((bottom + top) / 2.0f) + f15;
                                width3 = f22;
                                float rawX7 = motionEvent.getRawX() - width3;
                                float rawY7 = motionEvent.getRawY() - height3;
                                double degrees5 = Math.toDegrees(Math.atan2(rawY7, rawX7));
                                i16 = gVar.f19605d;
                                if (i16 != -1) {
                                    gVar.f19618r.j(i16, progress4, gVar.f19609h, gVar.f19608g, gVar.f19614n);
                                    fArr[1] = (float) Math.toDegrees(fArr[1]);
                                } else {
                                    fArr[1] = 360.0f;
                                }
                                degrees = ((float) (Math.toDegrees(Math.atan2(yVelocity6 + rawY7, xVelocity6 + rawX7)) - degrees5)) * 62.5f;
                                if (Float.isNaN(degrees)) {
                                    f16 = (((degrees * 3.0f) * gVar.f19622v) / fArr[1]) + progress4;
                                } else {
                                    f16 = progress4;
                                }
                                if (f16 == 0.0f) {
                                    if (0.0f < f16) {
                                        motionLayout.setState(j.FINISHED);
                                    } else {
                                        motionLayout.setState(j.FINISHED);
                                    }
                                } else if (0.0f < f16) {
                                    motionLayout.setState(j.FINISHED);
                                } else {
                                    motionLayout.setState(j.FINISHED);
                                }
                            } else if (action2 == 2) {
                                motionEvent.getRawY();
                                motionEvent.getRawX();
                                width = motionLayout.getWidth() / 2.0f;
                                height = motionLayout.getHeight() / 2.0f;
                                i18 = gVar.f19610i;
                                if (i18 != -1) {
                                    View viewFindViewById7 = motionLayout.findViewById(i18);
                                    motionLayout.getLocationOnScreen(iArr);
                                    float right3 = iArr[0] + ((viewFindViewById7.getRight() + viewFindViewById7.getLeft()) / 2.0f);
                                    height = iArr[1] + ((viewFindViewById7.getBottom() + viewFindViewById7.getTop()) / 2.0f);
                                    width = right3;
                                } else {
                                    i19 = gVar.f19605d;
                                    if (i19 != -1) {
                                        motionLayout.getLocationOnScreen(iArr);
                                        width = iArr[0] + ((viewFindViewById.getRight() + viewFindViewById.getLeft()) / 2.0f);
                                        height = iArr[1] + ((viewFindViewById.getBottom() + viewFindViewById.getTop()) / 2.0f);
                                    }
                                }
                                rawX2 = motionEvent.getRawX() - width;
                                rawY2 = motionEvent.getRawY() - height;
                                dAtan2 = Math.atan2(motionEvent.getRawY() - height, motionEvent.getRawX() - width);
                                fAtan2 = (float) (((dAtan2 - Math.atan2(gVar.f19617q - height, gVar.f19616p - width)) * 180.0d) / 3.141592653589793d);
                                if (fAtan2 > 330.0f) {
                                    fAtan2 -= 360.0f;
                                } else if (fAtan2 < -330.0f) {
                                    fAtan2 += 360.0f;
                                }
                                if (Math.abs(fAtan2) <= 0.01d) {
                                    progress5 = motionLayout.getProgress();
                                    if (!gVar.m) {
                                        gVar.m = true;
                                        motionLayout.setProgress(progress5);
                                    }
                                    i20 = gVar.f19605d;
                                    if (i20 != -1) {
                                        gVar.f19618r.j(i20, progress5, gVar.f19609h, gVar.f19608g, gVar.f19614n);
                                        c15 = 1;
                                        fArr[1] = (float) Math.toDegrees(fArr[1]);
                                    } else {
                                        c15 = 1;
                                        fArr[1] = 360.0f;
                                    }
                                    fMax2 = Math.max(Math.min(((fAtan2 * gVar.f19622v) / fArr[c15]) + progress5, 1.0f), 0.0f);
                                    progress6 = motionLayout.getProgress();
                                    if (fMax2 != progress6) {
                                        if (progress6 != 0.0f) {
                                            if (progress6 == 0.0f) {
                                                z12 = true;
                                            } else {
                                                z12 = false;
                                            }
                                            motionLayout.g(z12);
                                        } else {
                                            if (progress6 == 0.0f) {
                                                z12 = true;
                                            } else {
                                                z12 = false;
                                            }
                                            motionLayout.g(z12);
                                        }
                                        motionLayout.setProgress(fMax2);
                                        motionTracker2.computeCurrentVelocity(1000);
                                        float xVelocity7 = motionTracker2.getXVelocity();
                                        double yVelocity7 = motionTracker2.getYVelocity();
                                        double d7 = xVelocity7;
                                        motionLayout.f19436s0 = (float) Math.toDegrees((float) ((Math.sin(Math.atan2(yVelocity7, d7) - dAtan2) * Math.hypot(yVelocity7, d7)) / Math.hypot(rawX2, rawY2)));
                                    } else {
                                        motionLayout.f19436s0 = 0.0f;
                                    }
                                    gVar.f19616p = motionEvent.getRawX();
                                    gVar.f19617q = motionEvent.getRawY();
                                } else {
                                    progress5 = motionLayout.getProgress();
                                    if (!gVar.m) {
                                        gVar.m = true;
                                        motionLayout.setProgress(progress5);
                                    }
                                    i20 = gVar.f19605d;
                                    if (i20 != -1) {
                                        gVar.f19618r.j(i20, progress5, gVar.f19609h, gVar.f19608g, gVar.f19614n);
                                        c15 = 1;
                                        fArr[1] = (float) Math.toDegrees(fArr[1]);
                                    } else {
                                        c15 = 1;
                                        fArr[1] = 360.0f;
                                    }
                                    fMax2 = Math.max(Math.min(((fAtan2 * gVar.f19622v) / fArr[c15]) + progress5, 1.0f), 0.0f);
                                    progress6 = motionLayout.getProgress();
                                    if (fMax2 != progress6) {
                                        if (progress6 != 0.0f) {
                                            if (progress6 == 0.0f) {
                                                z12 = true;
                                            } else {
                                                z12 = false;
                                            }
                                            motionLayout.g(z12);
                                        } else {
                                            if (progress6 == 0.0f) {
                                                z12 = true;
                                            } else {
                                                z12 = false;
                                            }
                                            motionLayout.g(z12);
                                        }
                                        motionLayout.setProgress(fMax2);
                                        motionTracker2.computeCurrentVelocity(1000);
                                        float xVelocity8 = motionTracker2.getXVelocity();
                                        double yVelocity8 = motionTracker2.getYVelocity();
                                        double d10 = xVelocity8;
                                        motionLayout.f19436s0 = (float) Math.toDegrees((float) ((Math.sin(Math.atan2(yVelocity8, d10) - dAtan2) * Math.hypot(yVelocity8, d10)) / Math.hypot(rawX2, rawY2)));
                                    } else {
                                        motionLayout.f19436s0 = 0.0f;
                                    }
                                    gVar.f19616p = motionEvent.getRawX();
                                    gVar.f19617q = motionEvent.getRawY();
                                }
                            }
                        } else {
                            gVar.f19616p = motionEvent.getRawX();
                            gVar.f19617q = motionEvent.getRawY();
                            gVar.m = false;
                        }
                    } else {
                        motionTracker2.addMovement(motionEvent);
                        action = motionEvent.getAction();
                        if (action == 0) {
                            gVar.f19616p = motionEvent.getRawX();
                            gVar.f19617q = motionEvent.getRawY();
                            gVar.m = false;
                        } else if (action == 1) {
                            gVar.m = false;
                            motionTracker2.computeCurrentVelocity(1000);
                            xVelocity = motionTracker2.getXVelocity();
                            yVelocity = motionTracker2.getYVelocity();
                            progress = motionLayout.getProgress();
                            i11 = gVar.f19605d;
                            if (i11 != -1) {
                                gVar.f19618r.j(i11, progress, gVar.f19609h, gVar.f19608g, gVar.f19614n);
                                c11 = 0;
                                c10 = 1;
                            } else {
                                float fMin4 = Math.min(motionLayout.getWidth(), motionLayout.getHeight());
                                c10 = 1;
                                fArr[1] = gVar.f19613l * fMin4;
                                c11 = 0;
                                fArr[0] = fMin4 * gVar.f19612k;
                            }
                            f6 = gVar.f19612k;
                            f10 = fArr[c11];
                            f11 = fArr[c10];
                            if (f6 != 0.0f) {
                                fAbs = xVelocity / f10;
                            } else {
                                fAbs = yVelocity / f11;
                            }
                            if (Float.isNaN(fAbs)) {
                                f12 = (fAbs / 3.0f) + progress;
                            } else {
                                f12 = progress;
                            }
                            if (f12 == 0.0f) {
                                if (0.0f < f12) {
                                    motionLayout.setState(j.FINISHED);
                                } else {
                                    motionLayout.setState(j.FINISHED);
                                }
                            } else if (0.0f < f12) {
                                motionLayout.setState(j.FINISHED);
                            } else {
                                motionLayout.setState(j.FINISHED);
                            }
                        } else if (action == 2) {
                            rawY = motionEvent.getRawY() - gVar.f19617q;
                            rawX = motionEvent.getRawX() - gVar.f19616p;
                            if (Math.abs((gVar.f19613l * rawY) + (gVar.f19612k * rawX)) <= gVar.f19624x) {
                                progress2 = motionLayout.getProgress();
                                if (!gVar.m) {
                                    gVar.m = true;
                                    motionLayout.setProgress(progress2);
                                }
                                i13 = gVar.f19605d;
                                if (i13 != -1) {
                                    gVar.f19618r.j(i13, progress2, gVar.f19609h, gVar.f19608g, gVar.f19614n);
                                    c13 = 0;
                                    c12 = 1;
                                } else {
                                    float fMin5 = Math.min(motionLayout.getWidth(), motionLayout.getHeight());
                                    c12 = 1;
                                    fArr[1] = gVar.f19613l * fMin5;
                                    c13 = 0;
                                    fArr[0] = fMin5 * gVar.f19612k;
                                }
                                if (Math.abs(((gVar.f19613l * fArr[c12]) + (gVar.f19612k * fArr[c13])) * gVar.f19622v) < 0.01d) {
                                    c14 = 0;
                                    fArr[0] = 0.01f;
                                    fArr[c12] = 0.01f;
                                } else {
                                    c14 = 0;
                                }
                                if (gVar.f19612k != 0.0f) {
                                    f13 = rawX / fArr[c14];
                                } else {
                                    f13 = rawY / fArr[c12];
                                }
                                fMax = Math.max(Math.min(progress2 + f13, 1.0f), 0.0f);
                                if (gVar.f19604c == 6) {
                                    fMax = Math.max(fMax, 0.01f);
                                }
                                if (gVar.f19604c == 7) {
                                    fMax = Math.min(fMax, 0.99f);
                                }
                                progress3 = motionLayout.getProgress();
                                if (fMax != progress3) {
                                    if (progress3 != 0.0f) {
                                        if (progress3 == 0.0f) {
                                            z11 = true;
                                        } else {
                                            z11 = false;
                                        }
                                        motionLayout.g(z11);
                                    } else {
                                        if (progress3 == 0.0f) {
                                            z11 = true;
                                        } else {
                                            z11 = false;
                                        }
                                        motionLayout.g(z11);
                                    }
                                    motionLayout.setProgress(fMax);
                                    motionTracker2.computeCurrentVelocity(1000);
                                    xVelocity2 = motionTracker2.getXVelocity();
                                    yVelocity2 = motionTracker2.getYVelocity();
                                    if (gVar.f19612k != 0.0f) {
                                        f14 = xVelocity2 / fArr[0];
                                    } else {
                                        f14 = yVelocity2 / fArr[1];
                                    }
                                    motionLayout.f19436s0 = f14;
                                } else {
                                    motionLayout.f19436s0 = 0.0f;
                                }
                                gVar.f19616p = motionEvent.getRawX();
                                gVar.f19617q = motionEvent.getRawY();
                            } else {
                                progress2 = motionLayout.getProgress();
                                if (!gVar.m) {
                                    gVar.m = true;
                                    motionLayout.setProgress(progress2);
                                }
                                i13 = gVar.f19605d;
                                if (i13 != -1) {
                                    gVar.f19618r.j(i13, progress2, gVar.f19609h, gVar.f19608g, gVar.f19614n);
                                    c13 = 0;
                                    c12 = 1;
                                } else {
                                    float fMin6 = Math.min(motionLayout.getWidth(), motionLayout.getHeight());
                                    c12 = 1;
                                    fArr[1] = gVar.f19613l * fMin6;
                                    c13 = 0;
                                    fArr[0] = fMin6 * gVar.f19612k;
                                }
                                if (Math.abs(((gVar.f19613l * fArr[c12]) + (gVar.f19612k * fArr[c13])) * gVar.f19622v) < 0.01d) {
                                    c14 = 0;
                                    fArr[0] = 0.01f;
                                    fArr[c12] = 0.01f;
                                } else {
                                    c14 = 0;
                                }
                                if (gVar.f19612k != 0.0f) {
                                    f13 = rawX / fArr[c14];
                                } else {
                                    f13 = rawY / fArr[c12];
                                }
                                fMax = Math.max(Math.min(progress2 + f13, 1.0f), 0.0f);
                                if (gVar.f19604c == 6) {
                                    fMax = Math.max(fMax, 0.01f);
                                }
                                if (gVar.f19604c == 7) {
                                    fMax = Math.min(fMax, 0.99f);
                                }
                                progress3 = motionLayout.getProgress();
                                if (fMax != progress3) {
                                    if (progress3 != 0.0f) {
                                        if (progress3 == 0.0f) {
                                            z11 = true;
                                        } else {
                                            z11 = false;
                                        }
                                        motionLayout.g(z11);
                                    } else {
                                        if (progress3 == 0.0f) {
                                            z11 = true;
                                        } else {
                                            z11 = false;
                                        }
                                        motionLayout.g(z11);
                                    }
                                    motionLayout.setProgress(fMax);
                                    motionTracker2.computeCurrentVelocity(1000);
                                    xVelocity2 = motionTracker2.getXVelocity();
                                    yVelocity2 = motionTracker2.getYVelocity();
                                    if (gVar.f19612k != 0.0f) {
                                        f14 = xVelocity2 / fArr[0];
                                    } else {
                                        f14 = yVelocity2 / fArr[1];
                                    }
                                    motionLayout.f19436s0 = f14;
                                } else {
                                    motionLayout.f19436s0 = 0.0f;
                                }
                                gVar.f19616p = motionEvent.getRawX();
                                gVar.f19617q = motionEvent.getRawY();
                            }
                        }
                    }
                }
                motionScene2.f19502s = motionEvent.getRawX();
                motionScene2.f19503t = motionEvent.getRawY();
                if (motionEvent.getAction() == 1) {
                    motionTracker.recycle();
                    motionScene2.f19499p = null;
                    i10 = this.f19440u0;
                    if (i10 != -1) {
                        motionScene2.a(this, i10);
                    }
                }
            }
        } else if (!motionScene2.f19497n) {
            transition = motionScene2.f19487c;
            if (transition != null && (gVar = transition.f19515l) != null && !motionScene2.f19498o) {
                motionTracker2 = motionScene2.f19499p;
                z10 = gVar.f19611j;
                fArr = gVar.f19614n;
                motionLayout = gVar.f19618r;
                if (z10) {
                    motionTracker2.addMovement(motionEvent);
                    action2 = motionEvent.getAction();
                    if (action2 != 0) {
                        iArr = gVar.f19615o;
                        if (action2 == 1) {
                            gVar.m = false;
                            motionTracker2.computeCurrentVelocity(16);
                            float xVelocity9 = motionTracker2.getXVelocity();
                            float yVelocity9 = motionTracker2.getYVelocity();
                            progress4 = motionLayout.getProgress();
                            float width4 = motionLayout.getWidth() / 2.0f;
                            float height4 = motionLayout.getHeight() / 2.0f;
                            i14 = gVar.f19610i;
                            if (i14 != -1) {
                                View viewFindViewById8 = motionLayout.findViewById(i14);
                                motionLayout.getLocationOnScreen(iArr);
                                right = iArr[0] + ((viewFindViewById8.getRight() + viewFindViewById8.getLeft()) / 2.0f);
                                f15 = iArr[1];
                                top = viewFindViewById8.getTop();
                                bottom = viewFindViewById8.getBottom();
                            } else {
                                i15 = gVar.f19605d;
                                if (i15 != -1) {
                                    View viewFindViewById9 = motionLayout.findViewById(motionLayout.E0.get(motionLayout.findViewById(i15)).getAnimateRelativeTo());
                                    motionLayout.getLocationOnScreen(iArr);
                                    right = iArr[0] + ((viewFindViewById9.getRight() + viewFindViewById9.getLeft()) / 2.0f);
                                    f15 = iArr[1];
                                    top = viewFindViewById9.getTop();
                                    bottom = viewFindViewById9.getBottom();
                                } else {
                                    float rawX8 = motionEvent.getRawX() - width4;
                                    float rawY8 = motionEvent.getRawY() - height4;
                                    double degrees6 = Math.toDegrees(Math.atan2(rawY8, rawX8));
                                    i16 = gVar.f19605d;
                                    if (i16 != -1) {
                                        gVar.f19618r.j(i16, progress4, gVar.f19609h, gVar.f19608g, gVar.f19614n);
                                        fArr[1] = (float) Math.toDegrees(fArr[1]);
                                    } else {
                                        fArr[1] = 360.0f;
                                    }
                                    degrees = ((float) (Math.toDegrees(Math.atan2(yVelocity9 + rawY8, xVelocity9 + rawX8)) - degrees6)) * 62.5f;
                                    if (Float.isNaN(degrees)) {
                                        f16 = (((degrees * 3.0f) * gVar.f19622v) / fArr[1]) + progress4;
                                    } else {
                                        f16 = progress4;
                                    }
                                    if (f16 == 0.0f && f16 != 1.0f && (i17 = gVar.f19604c) != 3) {
                                        float fAbs2 = (degrees * gVar.f19622v) / fArr[1];
                                        float f23 = ((double) f16) < 0.5d ? 0.0f : 1.0f;
                                        if (i17 == 6) {
                                            if (progress4 + fAbs2 < 0.0f) {
                                                fAbs2 = Math.abs(fAbs2);
                                            }
                                            f23 = 1.0f;
                                        }
                                        if (gVar.f19604c == 7) {
                                            if (progress4 + fAbs2 > 1.0f) {
                                                fAbs2 = -Math.abs(fAbs2);
                                            }
                                            f23 = 0.0f;
                                        }
                                        motionLayout.touchAnimateTo(gVar.f19604c, f23, fAbs2 * 3.0f);
                                        if (0.0f >= progress4 || 1.0f <= progress4) {
                                            motionLayout.setState(j.FINISHED);
                                        }
                                    } else if (0.0f < f16 || 1.0f <= f16) {
                                        motionLayout.setState(j.FINISHED);
                                    }
                                }
                            }
                            float f24 = right;
                            height4 = ((bottom + top) / 2.0f) + f15;
                            width4 = f24;
                            float rawX9 = motionEvent.getRawX() - width4;
                            float rawY9 = motionEvent.getRawY() - height4;
                            double degrees7 = Math.toDegrees(Math.atan2(rawY9, rawX9));
                            i16 = gVar.f19605d;
                            if (i16 != -1) {
                                gVar.f19618r.j(i16, progress4, gVar.f19609h, gVar.f19608g, gVar.f19614n);
                                fArr[1] = (float) Math.toDegrees(fArr[1]);
                            } else {
                                fArr[1] = 360.0f;
                            }
                            degrees = ((float) (Math.toDegrees(Math.atan2(yVelocity9 + rawY9, xVelocity9 + rawX9)) - degrees7)) * 62.5f;
                            if (Float.isNaN(degrees)) {
                                f16 = (((degrees * 3.0f) * gVar.f19622v) / fArr[1]) + progress4;
                            } else {
                                f16 = progress4;
                            }
                            if (f16 == 0.0f) {
                                if (0.0f < f16) {
                                    motionLayout.setState(j.FINISHED);
                                } else {
                                    motionLayout.setState(j.FINISHED);
                                }
                            } else if (0.0f < f16) {
                                motionLayout.setState(j.FINISHED);
                            } else {
                                motionLayout.setState(j.FINISHED);
                            }
                        } else if (action2 == 2) {
                            motionEvent.getRawY();
                            motionEvent.getRawX();
                            width = motionLayout.getWidth() / 2.0f;
                            height = motionLayout.getHeight() / 2.0f;
                            i18 = gVar.f19610i;
                            if (i18 != -1) {
                                View viewFindViewById10 = motionLayout.findViewById(i18);
                                motionLayout.getLocationOnScreen(iArr);
                                float right4 = iArr[0] + ((viewFindViewById10.getRight() + viewFindViewById10.getLeft()) / 2.0f);
                                height = iArr[1] + ((viewFindViewById10.getBottom() + viewFindViewById10.getTop()) / 2.0f);
                                width = right4;
                            } else {
                                i19 = gVar.f19605d;
                                if (i19 != -1 && (viewFindViewById = motionLayout.findViewById(motionLayout.E0.get(motionLayout.findViewById(i19)).getAnimateRelativeTo())) != null) {
                                    motionLayout.getLocationOnScreen(iArr);
                                    width = iArr[0] + ((viewFindViewById.getRight() + viewFindViewById.getLeft()) / 2.0f);
                                    height = iArr[1] + ((viewFindViewById.getBottom() + viewFindViewById.getTop()) / 2.0f);
                                }
                            }
                            rawX2 = motionEvent.getRawX() - width;
                            rawY2 = motionEvent.getRawY() - height;
                            dAtan2 = Math.atan2(motionEvent.getRawY() - height, motionEvent.getRawX() - width);
                            fAtan2 = (float) (((dAtan2 - Math.atan2(gVar.f19617q - height, gVar.f19616p - width)) * 180.0d) / 3.141592653589793d);
                            if (fAtan2 > 330.0f) {
                                fAtan2 -= 360.0f;
                            } else if (fAtan2 < -330.0f) {
                                fAtan2 += 360.0f;
                            }
                            if (Math.abs(fAtan2) <= 0.01d || gVar.m) {
                                progress5 = motionLayout.getProgress();
                                if (!gVar.m) {
                                    gVar.m = true;
                                    motionLayout.setProgress(progress5);
                                }
                                i20 = gVar.f19605d;
                                if (i20 != -1) {
                                    gVar.f19618r.j(i20, progress5, gVar.f19609h, gVar.f19608g, gVar.f19614n);
                                    c15 = 1;
                                    fArr[1] = (float) Math.toDegrees(fArr[1]);
                                } else {
                                    c15 = 1;
                                    fArr[1] = 360.0f;
                                }
                                fMax2 = Math.max(Math.min(((fAtan2 * gVar.f19622v) / fArr[c15]) + progress5, 1.0f), 0.0f);
                                progress6 = motionLayout.getProgress();
                                if (fMax2 != progress6) {
                                    if (progress6 != 0.0f || progress6 == 1.0f) {
                                        if (progress6 == 0.0f) {
                                            z12 = true;
                                        } else {
                                            z12 = false;
                                        }
                                        motionLayout.g(z12);
                                    }
                                    motionLayout.setProgress(fMax2);
                                    motionTracker2.computeCurrentVelocity(1000);
                                    float xVelocity10 = motionTracker2.getXVelocity();
                                    double yVelocity10 = motionTracker2.getYVelocity();
                                    double d11 = xVelocity10;
                                    motionLayout.f19436s0 = (float) Math.toDegrees((float) ((Math.sin(Math.atan2(yVelocity10, d11) - dAtan2) * Math.hypot(yVelocity10, d11)) / Math.hypot(rawX2, rawY2)));
                                } else {
                                    motionLayout.f19436s0 = 0.0f;
                                }
                                gVar.f19616p = motionEvent.getRawX();
                                gVar.f19617q = motionEvent.getRawY();
                            }
                        }
                    } else {
                        gVar.f19616p = motionEvent.getRawX();
                        gVar.f19617q = motionEvent.getRawY();
                        gVar.m = false;
                    }
                } else {
                    motionTracker2.addMovement(motionEvent);
                    action = motionEvent.getAction();
                    if (action == 0) {
                        gVar.f19616p = motionEvent.getRawX();
                        gVar.f19617q = motionEvent.getRawY();
                        gVar.m = false;
                    } else if (action == 1) {
                        gVar.m = false;
                        motionTracker2.computeCurrentVelocity(1000);
                        xVelocity = motionTracker2.getXVelocity();
                        yVelocity = motionTracker2.getYVelocity();
                        progress = motionLayout.getProgress();
                        i11 = gVar.f19605d;
                        if (i11 != -1) {
                            gVar.f19618r.j(i11, progress, gVar.f19609h, gVar.f19608g, gVar.f19614n);
                            c11 = 0;
                            c10 = 1;
                        } else {
                            float fMin7 = Math.min(motionLayout.getWidth(), motionLayout.getHeight());
                            c10 = 1;
                            fArr[1] = gVar.f19613l * fMin7;
                            c11 = 0;
                            fArr[0] = fMin7 * gVar.f19612k;
                        }
                        f6 = gVar.f19612k;
                        f10 = fArr[c11];
                        f11 = fArr[c10];
                        if (f6 != 0.0f) {
                            fAbs = xVelocity / f10;
                        } else {
                            fAbs = yVelocity / f11;
                        }
                        if (Float.isNaN(fAbs)) {
                            f12 = (fAbs / 3.0f) + progress;
                        } else {
                            f12 = progress;
                        }
                        if (f12 == 0.0f && f12 != 1.0f && (i12 = gVar.f19604c) != 3) {
                            float f25 = ((double) f12) < 0.5d ? 0.0f : 1.0f;
                            if (i12 == 6) {
                                if (progress + fAbs < 0.0f) {
                                    fAbs = Math.abs(fAbs);
                                }
                                f25 = 1.0f;
                            }
                            if (gVar.f19604c == 7) {
                                if (progress + fAbs > 1.0f) {
                                    fAbs = -Math.abs(fAbs);
                                }
                                f25 = 0.0f;
                            }
                            motionLayout.touchAnimateTo(gVar.f19604c, f25, fAbs);
                            if (0.0f >= progress || 1.0f <= progress) {
                                motionLayout.setState(j.FINISHED);
                            }
                        } else if (0.0f < f12 || 1.0f <= f12) {
                            motionLayout.setState(j.FINISHED);
                        }
                    } else if (action == 2) {
                        rawY = motionEvent.getRawY() - gVar.f19617q;
                        rawX = motionEvent.getRawX() - gVar.f19616p;
                        if (Math.abs((gVar.f19613l * rawY) + (gVar.f19612k * rawX)) <= gVar.f19624x || gVar.m) {
                            progress2 = motionLayout.getProgress();
                            if (!gVar.m) {
                                gVar.m = true;
                                motionLayout.setProgress(progress2);
                            }
                            i13 = gVar.f19605d;
                            if (i13 != -1) {
                                gVar.f19618r.j(i13, progress2, gVar.f19609h, gVar.f19608g, gVar.f19614n);
                                c13 = 0;
                                c12 = 1;
                            } else {
                                float fMin8 = Math.min(motionLayout.getWidth(), motionLayout.getHeight());
                                c12 = 1;
                                fArr[1] = gVar.f19613l * fMin8;
                                c13 = 0;
                                fArr[0] = fMin8 * gVar.f19612k;
                            }
                            if (Math.abs(((gVar.f19613l * fArr[c12]) + (gVar.f19612k * fArr[c13])) * gVar.f19622v) < 0.01d) {
                                c14 = 0;
                                fArr[0] = 0.01f;
                                fArr[c12] = 0.01f;
                            } else {
                                c14 = 0;
                            }
                            if (gVar.f19612k != 0.0f) {
                                f13 = rawX / fArr[c14];
                            } else {
                                f13 = rawY / fArr[c12];
                            }
                            fMax = Math.max(Math.min(progress2 + f13, 1.0f), 0.0f);
                            if (gVar.f19604c == 6) {
                                fMax = Math.max(fMax, 0.01f);
                            }
                            if (gVar.f19604c == 7) {
                                fMax = Math.min(fMax, 0.99f);
                            }
                            progress3 = motionLayout.getProgress();
                            if (fMax != progress3) {
                                if (progress3 != 0.0f || progress3 == 1.0f) {
                                    if (progress3 == 0.0f) {
                                        z11 = true;
                                    } else {
                                        z11 = false;
                                    }
                                    motionLayout.g(z11);
                                }
                                motionLayout.setProgress(fMax);
                                motionTracker2.computeCurrentVelocity(1000);
                                xVelocity2 = motionTracker2.getXVelocity();
                                yVelocity2 = motionTracker2.getYVelocity();
                                if (gVar.f19612k != 0.0f) {
                                    f14 = xVelocity2 / fArr[0];
                                } else {
                                    f14 = yVelocity2 / fArr[1];
                                }
                                motionLayout.f19436s0 = f14;
                            } else {
                                motionLayout.f19436s0 = 0.0f;
                            }
                            gVar.f19616p = motionEvent.getRawX();
                            gVar.f19617q = motionEvent.getRawY();
                        }
                    }
                }
            }
            motionScene2.f19502s = motionEvent.getRawX();
            motionScene2.f19503t = motionEvent.getRawY();
            if (motionEvent.getAction() == 1 && (motionTracker = motionScene2.f19499p) != null) {
                motionTracker.recycle();
                motionScene2.f19499p = null;
                i10 = this.f19440u0;
                if (i10 != -1) {
                    motionScene2.a(this, i10);
                }
            }
        }
        if (this.f19431p0.f19487c.isTransitionFlag(4)) {
            return this.f19431p0.f19487c.getTouchResponse().m;
        }
        return true;
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup
    public void onViewAdded(View view) {
        super.onViewAdded(view);
        if (view instanceof MotionHelper) {
            MotionHelper motionHelper = (MotionHelper) view;
            if (this.f19421f1 == null) {
                this.f19421f1 = new CopyOnWriteArrayList<>();
            }
            this.f19421f1.add(motionHelper);
            if (motionHelper.isUsedOnShow()) {
                if (this.f19418c1 == null) {
                    this.f19418c1 = new ArrayList<>();
                }
                this.f19418c1.add(motionHelper);
            }
            if (motionHelper.isUseOnHide()) {
                if (this.f19419d1 == null) {
                    this.f19419d1 = new ArrayList<>();
                }
                this.f19419d1.add(motionHelper);
            }
            if (motionHelper.isDecorator()) {
                if (this.f19420e1 == null) {
                    this.f19420e1 = new ArrayList<>();
                }
                this.f19420e1.add(motionHelper);
            }
        }
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup
    public void onViewRemoved(View view) {
        super.onViewRemoved(view);
        ArrayList<MotionHelper> arrayList = this.f19418c1;
        if (arrayList != null) {
            arrayList.remove(view);
        }
        ArrayList<MotionHelper> arrayList2 = this.f19419d1;
        if (arrayList2 != null) {
            arrayList2.remove(view);
        }
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout
    public void parseLayoutDescription(int i10) {
        this.mConstraintLayoutSpec = null;
    }

    @Deprecated
    public void rebuildMotion() {
        rebuildScene();
    }

    public void rebuildScene() {
        this.H1.f();
        invalidate();
    }

    public boolean removeTransitionListener(TransitionListener transitionListener) {
        CopyOnWriteArrayList<TransitionListener> copyOnWriteArrayList = this.f19421f1;
        if (copyOnWriteArrayList == null) {
            return false;
        }
        return copyOnWriteArrayList.remove(transitionListener);
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.View, android.view.ViewParent
    public void requestLayout() {
        MotionScene motionScene;
        MotionScene.Transition transition;
        if (!this.mMeasureDuringTransition && this.f19440u0 == -1 && (motionScene = this.f19431p0) != null && (transition = motionScene.f19487c) != null) {
            int layoutDuringTransition = transition.getLayoutDuringTransition();
            if (layoutDuringTransition == 0) {
                return;
            }
            if (layoutDuringTransition == 2) {
                int childCount = getChildCount();
                for (int i10 = 0; i10 < childCount; i10++) {
                    this.E0.get(getChildAt(i10)).remeasure();
                }
                return;
            }
        }
        super.requestLayout();
    }

    public void rotateTo(int i10, int i11) {
        this.f19448y1 = true;
        this.B1 = getWidth();
        this.C1 = getHeight();
        int rotation = getDisplay().getRotation();
        this.f19449z1 = (rotation + 1) % 4 <= (this.D1 + 1) % 4 ? 2 : 1;
        this.D1 = rotation;
        int childCount = getChildCount();
        for (int i12 = 0; i12 < childCount; i12++) {
            View childAt = getChildAt(i12);
            HashMap<View, ViewState> map = this.A1;
            ViewState viewState = map.get(childAt);
            if (viewState == null) {
                viewState = new ViewState();
                map.put(childAt, viewState);
            }
            viewState.getState(childAt);
        }
        this.f19438t0 = -1;
        this.v0 = i10;
        this.f19431p0.n(-1, i10);
        this.H1.e(null, this.f19431p0.b(this.v0));
        this.H0 = 0.0f;
        this.I0 = 0.0f;
        invalidate();
        transitionToEnd(new b());
        if (i11 > 0) {
            this.G0 = i11 / 1000.0f;
        }
    }

    public void scheduleTransitionTo(int i10) {
        if (getCurrentState() == -1) {
            transitionToState(i10);
            return;
        }
        int[] iArr = this.f19444w1;
        if (iArr == null) {
            this.f19444w1 = new int[4];
        } else if (iArr.length <= this.f19446x1) {
            this.f19444w1 = Arrays.copyOf(iArr, iArr.length * 2);
        }
        int[] iArr2 = this.f19444w1;
        int i11 = this.f19446x1;
        this.f19446x1 = i11 + 1;
        iArr2[i11] = i10;
    }

    public void setDebugMode(int i10) {
        this.O0 = i10;
        invalidate();
    }

    public void setDelayedApplicationOfInitialState(boolean z10) {
        this.F1 = z10;
    }

    public void setInteractionEnabled(boolean z10) {
        this.f19447y0 = z10;
    }

    public void setInterpolatedProgress(float f6) {
        if (this.f19431p0 != null) {
            setState(j.MOVING);
            Interpolator interpolator = this.f19431p0.getInterpolator();
            if (interpolator != null) {
                setProgress(interpolator.getInterpolation(f6));
                return;
            }
        }
        setProgress(f6);
    }

    public void setOnHide(float f6) {
        ArrayList<MotionHelper> arrayList = this.f19419d1;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                this.f19419d1.get(i10).setProgress(f6);
            }
        }
    }

    public void setOnShow(float f6) {
        ArrayList<MotionHelper> arrayList = this.f19418c1;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                this.f19418c1.get(i10).setProgress(f6);
            }
        }
    }

    public void setProgress(float f6, float f10) {
        if (!isAttachedToWindow()) {
            if (this.f19441u1 == null) {
                this.f19441u1 = new i();
            }
            i iVar = this.f19441u1;
            iVar.f19480a = f6;
            iVar.f19481b = f10;
            return;
        }
        setProgress(f6);
        setState(j.MOVING);
        this.f19436s0 = f10;
        if (f10 != 0.0f) {
            f(f10 > 0.0f ? 1.0f : 0.0f);
        } else {
            if (f6 == 0.0f || f6 == 1.0f) {
                return;
            }
            f(f6 > 0.5f ? 1.0f : 0.0f);
        }
    }

    public void setScene(MotionScene motionScene) {
        this.f19431p0 = motionScene;
        motionScene.setRtl(isRtl());
        rebuildScene();
    }

    public void setStartState(int i10) {
        if (isAttachedToWindow()) {
            this.f19440u0 = i10;
            return;
        }
        if (this.f19441u1 == null) {
            this.f19441u1 = new i();
        }
        i iVar = this.f19441u1;
        iVar.f19482c = i10;
        iVar.f19483d = i10;
    }

    public void setState(j jVar) {
        j jVar2 = j.FINISHED;
        if (jVar == jVar2 && this.f19440u0 == -1) {
            return;
        }
        j jVar3 = this.G1;
        this.G1 = jVar;
        j jVar4 = j.MOVING;
        if (jVar3 == jVar4 && jVar == jVar4) {
            i();
        }
        int iOrdinal = jVar3.ordinal();
        if (iOrdinal != 0 && iOrdinal != 1) {
            if (iOrdinal == 2 && jVar == jVar2) {
                fireTransitionCompleted();
                return;
            }
            return;
        }
        if (jVar == jVar4) {
            i();
        }
        if (jVar == jVar2) {
            fireTransitionCompleted();
        }
    }

    public void setTransition(int i10, int i11) {
        if (!isAttachedToWindow()) {
            if (this.f19441u1 == null) {
                this.f19441u1 = new i();
            }
            i iVar = this.f19441u1;
            iVar.f19482c = i10;
            iVar.f19483d = i11;
            return;
        }
        MotionScene motionScene = this.f19431p0;
        if (motionScene != null) {
            this.f19438t0 = i10;
            this.v0 = i11;
            motionScene.n(i10, i11);
            this.H1.e(this.f19431p0.b(i10), this.f19431p0.b(i11));
            rebuildScene();
            this.I0 = 0.0f;
            transitionToStart();
        }
    }

    public void setTransitionDuration(int i10) {
        MotionScene motionScene = this.f19431p0;
        if (motionScene == null) {
            return;
        }
        motionScene.setDuration(i10);
    }

    public void setTransitionListener(TransitionListener transitionListener) {
        this.N0 = transitionListener;
    }

    public void setTransitionState(Bundle bundle) {
        if (this.f19441u1 == null) {
            this.f19441u1 = new i();
        }
        i iVar = this.f19441u1;
        iVar.getClass();
        iVar.f19480a = bundle.getFloat("motion.progress");
        iVar.f19481b = bundle.getFloat("motion.velocity");
        iVar.f19482c = bundle.getInt("motion.StartState");
        iVar.f19483d = bundle.getInt("motion.EndState");
        if (isAttachedToWindow()) {
            this.f19441u1.a();
        }
    }

    @Override // android.view.View
    public String toString() {
        Context context = getContext();
        return Debug.getName(context, this.f19438t0) + "->" + Debug.getName(context, this.v0) + " (pos:" + this.I0 + " Dpos/Dt:" + this.f19436s0;
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0073  */
    /* JADX WARN: Code duplicated, block: B:27:0x0085  */
    /* JADX WARN: Code duplicated, block: B:32:0x009f  */
    /* JADX WARN: Code duplicated, block: B:35:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:43:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:72:0x011e  */
    /* JADX WARN: Code duplicated, block: B:74:0x012a  */
    /* JADX WARN: Code duplicated, block: B:77:0x0132  */
    public void touchAnimateTo(int i10, float f6, float f10) {
        float f11;
        MotionScene motionScene;
        MotionScene.Transition transition;
        MotionScene.Transition transition2;
        float f12;
        androidx.constraintlayout.motion.widget.g gVar;
        androidx.constraintlayout.motion.widget.g gVar2;
        MotionScene.Transition transition3;
        float f13;
        androidx.constraintlayout.motion.widget.g gVar3;
        if (this.f19431p0 == null || this.I0 == f6) {
            return;
        }
        this.Q0 = true;
        this.F0 = getNanoTime();
        float duration = this.f19431p0.getDuration() / 1000.0f;
        this.G0 = duration;
        this.K0 = f6;
        this.M0 = true;
        StopLogic stopLogic = this.R0;
        float f14 = 0.0f;
        if (i10 == 0 || i10 == 1 || i10 == 2) {
            if (i10 != 1 || i10 == 7) {
                f11 = 0.0f;
            } else {
                f11 = (i10 == 2 || i10 == 6) ? 1.0f : f6;
            }
            motionScene = this.f19431p0;
            transition = motionScene.f19487c;
            if (transition != null || (gVar2 = transition.f19515l) == null || gVar2.D == 0) {
                float f15 = this.I0;
                float f16 = motionScene.f();
                transition2 = this.f19431p0.f19487c;
                if (transition2 != null || (gVar = transition2.f19515l) == null) {
                    f12 = 0.0f;
                } else {
                    f12 = gVar.f19619s;
                }
                stopLogic.config(f15, f11, f10, duration, f16, f12);
            } else {
                float f17 = this.I0;
                float f18 = (transition == null || gVar2 == null) ? 0.0f : gVar2.f19626z;
                float f19 = (transition == null || gVar2 == null) ? 0.0f : gVar2.A;
                float f20 = (transition == null || gVar2 == null) ? 0.0f : gVar2.f19625y;
                if (transition != null && gVar2 != null) {
                    f14 = gVar2.B;
                }
                stopLogic.springConfig(f17, f11, f10, f18, f19, f20, f14, (transition == null || gVar2 == null) ? 0 : gVar2.C);
            }
            int i11 = this.f19440u0;
            this.K0 = f11;
            this.f19440u0 = i11;
            this.f19433q0 = stopLogic;
        } else {
            e eVar = this.S0;
            if (i10 == 4) {
                float f21 = this.I0;
                float f22 = this.f19431p0.f();
                eVar.f19454a = f10;
                eVar.f19455b = f21;
                eVar.f19456c = f22;
                this.f19433q0 = eVar;
            } else if (i10 == 5) {
                float f23 = this.I0;
                float f24 = this.f19431p0.f();
                if (f10 > 0.0f) {
                    float f25 = f10 / f24;
                    if (((f10 * f25) - (((f24 * f25) * f25) / 2.0f)) + f23 > 1.0f) {
                        float f26 = this.I0;
                        float f27 = this.f19431p0.f();
                        eVar.f19454a = f10;
                        eVar.f19455b = f26;
                        eVar.f19456c = f27;
                        this.f19433q0 = eVar;
                    } else {
                        StopLogic stopLogic2 = this.R0;
                        float f28 = this.I0;
                        float f29 = this.G0;
                        float f30 = this.f19431p0.f();
                        transition3 = this.f19431p0.f19487c;
                        if (transition3 != null || (gVar3 = transition3.f19515l) == null) {
                            f13 = 0.0f;
                        } else {
                            f13 = gVar3.f19619s;
                        }
                        stopLogic2.config(f28, f6, f10, f29, f30, f13);
                        this.f19436s0 = 0.0f;
                        int i12 = this.f19440u0;
                        this.K0 = f6;
                        this.f19440u0 = i12;
                        this.f19433q0 = stopLogic;
                    }
                } else {
                    float f31 = (-f10) / f24;
                    if ((((f24 * f31) * f31) / 2.0f) + (f10 * f31) + f23 < 0.0f) {
                        float f210 = this.I0;
                        float f211 = this.f19431p0.f();
                        eVar.f19454a = f10;
                        eVar.f19455b = f210;
                        eVar.f19456c = f211;
                        this.f19433q0 = eVar;
                    } else {
                        StopLogic stopLogic3 = this.R0;
                        float f212 = this.I0;
                        float f213 = this.G0;
                        float f32 = this.f19431p0.f();
                        transition3 = this.f19431p0.f19487c;
                        if (transition3 != null) {
                            f13 = 0.0f;
                        } else {
                            f13 = 0.0f;
                        }
                        stopLogic3.config(f212, f6, f10, f213, f32, f13);
                        this.f19436s0 = 0.0f;
                        int i13 = this.f19440u0;
                        this.K0 = f6;
                        this.f19440u0 = i13;
                        this.f19433q0 = stopLogic;
                    }
                }
            } else if (i10 == 6 || i10 == 7) {
                if (i10 != 1) {
                    f11 = 0.0f;
                } else {
                    f11 = 0.0f;
                }
                motionScene = this.f19431p0;
                transition = motionScene.f19487c;
                if (transition != null) {
                    float f110 = this.I0;
                    float f111 = motionScene.f();
                    transition2 = this.f19431p0.f19487c;
                    if (transition2 != null) {
                        f12 = 0.0f;
                    } else {
                        f12 = 0.0f;
                    }
                    stopLogic.config(f110, f11, f10, duration, f111, f12);
                } else {
                    float f112 = this.I0;
                    float f113 = motionScene.f();
                    transition2 = this.f19431p0.f19487c;
                    if (transition2 != null) {
                        f12 = 0.0f;
                    } else {
                        f12 = 0.0f;
                    }
                    stopLogic.config(f112, f11, f10, duration, f113, f12);
                }
                int i14 = this.f19440u0;
                this.K0 = f11;
                this.f19440u0 = i14;
                this.f19433q0 = stopLogic;
            }
        }
        this.L0 = false;
        this.F0 = getNanoTime();
        invalidate();
    }

    public void touchSpringTo(float f6, float f10) {
        androidx.constraintlayout.motion.widget.g gVar;
        androidx.constraintlayout.motion.widget.g gVar2;
        androidx.constraintlayout.motion.widget.g gVar3;
        androidx.constraintlayout.motion.widget.g gVar4;
        androidx.constraintlayout.motion.widget.g gVar5;
        if (this.f19431p0 == null || this.I0 == f6) {
            return;
        }
        this.Q0 = true;
        this.F0 = getNanoTime();
        this.G0 = this.f19431p0.getDuration() / 1000.0f;
        this.K0 = f6;
        this.M0 = true;
        StopLogic stopLogic = this.R0;
        float f11 = this.I0;
        MotionScene.Transition transition = this.f19431p0.f19487c;
        float f12 = 0.0f;
        float f13 = (transition == null || (gVar5 = transition.f19515l) == null) ? 0.0f : gVar5.f19626z;
        float f14 = (transition == null || (gVar4 = transition.f19515l) == null) ? 0.0f : gVar4.A;
        float f15 = (transition == null || (gVar3 = transition.f19515l) == null) ? 0.0f : gVar3.f19625y;
        if (transition != null && (gVar2 = transition.f19515l) != null) {
            f12 = gVar2.B;
        }
        stopLogic.springConfig(f11, f6, f10, f13, f14, f15, f12, (transition == null || (gVar = transition.f19515l) == null) ? 0 : gVar.C);
        int i10 = this.f19440u0;
        this.K0 = f6;
        this.f19440u0 = i10;
        this.f19433q0 = this.R0;
        this.L0 = false;
        this.F0 = getNanoTime();
        invalidate();
    }

    public void transitionToEnd() {
        f(1.0f);
        this.f19442v1 = null;
    }

    public void transitionToStart() {
        f(0.0f);
    }

    public void transitionToState(int i10) {
        if (isAttachedToWindow()) {
            transitionToState(i10, -1, -1);
            return;
        }
        if (this.f19441u1 == null) {
            this.f19441u1 = new i();
        }
        this.f19441u1.f19483d = i10;
    }

    public void updateState(int i10, ConstraintSet constraintSet) {
        MotionScene motionScene = this.f19431p0;
        if (motionScene != null) {
            motionScene.setConstraintSet(i10, constraintSet);
        }
        updateState();
        if (this.f19440u0 == i10) {
            constraintSet.applyTo(this);
        }
    }

    public void updateStateAnimate(int i10, ConstraintSet constraintSet, int i11) {
        if (this.f19431p0 != null && this.f19440u0 == i10) {
            int i12 = R.id.view_transition;
            updateState(i12, getConstraintSet(i10));
            setState(i12, -1, -1);
            updateState(i10, constraintSet);
            MotionScene.Transition transition = new MotionScene.Transition(-1, this.f19431p0, i12, i10);
            transition.setDuration(i11);
            setTransition(transition);
            transitionToEnd();
        }
    }

    public void viewTransition(int i10, View... viewArr) {
        MotionScene motionScene = this.f19431p0;
        if (motionScene != null) {
            motionScene.viewTransition(i10, viewArr);
        }
    }

    public static class h implements MotionTracker {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final h f19478b = new h();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public VelocityTracker f19479a;

        @Override // androidx.constraintlayout.motion.widget.MotionLayout.MotionTracker
        public final void addMovement(MotionEvent motionEvent) {
            VelocityTracker velocityTracker = this.f19479a;
            if (velocityTracker != null) {
                velocityTracker.addMovement(motionEvent);
            }
        }

        @Override // androidx.constraintlayout.motion.widget.MotionLayout.MotionTracker
        public final void clear() {
            VelocityTracker velocityTracker = this.f19479a;
            if (velocityTracker != null) {
                velocityTracker.clear();
            }
        }

        @Override // androidx.constraintlayout.motion.widget.MotionLayout.MotionTracker
        public final void computeCurrentVelocity(int i10) {
            VelocityTracker velocityTracker = this.f19479a;
            if (velocityTracker != null) {
                velocityTracker.computeCurrentVelocity(i10);
            }
        }

        @Override // androidx.constraintlayout.motion.widget.MotionLayout.MotionTracker
        public final float getXVelocity() {
            VelocityTracker velocityTracker = this.f19479a;
            if (velocityTracker != null) {
                return velocityTracker.getXVelocity();
            }
            return 0.0f;
        }

        @Override // androidx.constraintlayout.motion.widget.MotionLayout.MotionTracker
        public final float getYVelocity() {
            VelocityTracker velocityTracker = this.f19479a;
            if (velocityTracker != null) {
                return velocityTracker.getYVelocity();
            }
            return 0.0f;
        }

        @Override // androidx.constraintlayout.motion.widget.MotionLayout.MotionTracker
        public final void recycle() {
            VelocityTracker velocityTracker = this.f19479a;
            if (velocityTracker != null) {
                velocityTracker.recycle();
                this.f19479a = null;
            }
        }

        @Override // androidx.constraintlayout.motion.widget.MotionLayout.MotionTracker
        public final void computeCurrentVelocity(int i10, float f6) {
            VelocityTracker velocityTracker = this.f19479a;
            if (velocityTracker != null) {
                velocityTracker.computeCurrentVelocity(i10, f6);
            }
        }

        @Override // androidx.constraintlayout.motion.widget.MotionLayout.MotionTracker
        public final float getXVelocity(int i10) {
            VelocityTracker velocityTracker = this.f19479a;
            if (velocityTracker != null) {
                return velocityTracker.getXVelocity(i10);
            }
            return 0.0f;
        }

        @Override // androidx.constraintlayout.motion.widget.MotionLayout.MotionTracker
        public final float getYVelocity(int i10) {
            if (this.f19479a != null) {
                return getYVelocity(i10);
            }
            return 0.0f;
        }
    }

    @Override // androidx.core.view.NestedScrollingParent3
    public void onNestedScroll(@NonNull View view, int i10, int i11, int i12, int i13, int i14, int[] iArr) {
        if (this.W0 || i10 != 0 || i11 != 0) {
            iArr[0] = iArr[0] + i12;
            iArr[1] = iArr[1] + i13;
        }
        this.W0 = false;
    }

    public void transitionToStart(Runnable runnable) {
        f(0.0f);
        this.f19442v1 = runnable;
    }

    public void transitionToEnd(Runnable runnable) {
        f(1.0f);
        this.f19442v1 = runnable;
    }

    public void updateState() {
        this.H1.e(this.f19431p0.b(this.f19438t0), this.f19431p0.b(this.v0));
        rebuildScene();
    }

    public void transitionToState(int i10, int i11) {
        if (!isAttachedToWindow()) {
            if (this.f19441u1 == null) {
                this.f19441u1 = new i();
            }
            this.f19441u1.f19483d = i10;
            return;
        }
        transitionToState(i10, -1, -1, i11);
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout
    public void setState(int i10, int i11, int i12) {
        setState(j.SETUP);
        this.f19440u0 = i10;
        this.f19438t0 = -1;
        this.v0 = -1;
        ConstraintLayoutStates constraintLayoutStates = this.mConstraintLayoutSpec;
        if (constraintLayoutStates != null) {
            constraintLayoutStates.updateConstraints(i10, i11, i12);
            return;
        }
        MotionScene motionScene = this.f19431p0;
        if (motionScene != null) {
            motionScene.b(i10).applyTo(this);
        }
    }

    public void setProgress(float f6) {
        if (f6 < 0.0f || f6 > 1.0f) {
            Log.w("MotionLayout", "Warning! Progress is defined for values between 0.0 and 1.0 inclusive");
        }
        if (!isAttachedToWindow()) {
            if (this.f19441u1 == null) {
                this.f19441u1 = new i();
            }
            this.f19441u1.f19480a = f6;
            return;
        }
        if (f6 <= 0.0f) {
            if (this.I0 == 1.0f && this.f19440u0 == this.v0) {
                setState(j.MOVING);
            }
            this.f19440u0 = this.f19438t0;
            if (this.I0 == 0.0f) {
                setState(j.FINISHED);
            }
        } else if (f6 >= 1.0f) {
            if (this.I0 == 0.0f && this.f19440u0 == this.f19438t0) {
                setState(j.MOVING);
            }
            this.f19440u0 = this.v0;
            if (this.I0 == 1.0f) {
                setState(j.FINISHED);
            }
        } else {
            this.f19440u0 = -1;
            setState(j.MOVING);
        }
        if (this.f19431p0 == null) {
            return;
        }
        this.L0 = true;
        this.K0 = f6;
        this.H0 = f6;
        this.J0 = -1L;
        this.F0 = -1L;
        this.f19433q0 = null;
        this.M0 = true;
        invalidate();
    }

    public void transitionToState(int i10, int i11, int i12) {
        transitionToState(i10, i11, i12, -1);
    }

    public void transitionToState(int i10, int i11, int i12, int i13) {
        StateSet stateSet;
        int iConvertToConstraintSet;
        MotionScene motionScene = this.f19431p0;
        if (motionScene != null && (stateSet = motionScene.f19486b) != null && (iConvertToConstraintSet = stateSet.convertToConstraintSet(this.f19440u0, i10, i11, i12)) != -1) {
            i10 = iConvertToConstraintSet;
        }
        int i14 = this.f19440u0;
        if (i14 == i10) {
            return;
        }
        if (this.f19438t0 == i10) {
            f(0.0f);
            if (i13 > 0) {
                this.G0 = i13 / 1000.0f;
                return;
            }
            return;
        }
        if (this.v0 == i10) {
            f(1.0f);
            if (i13 > 0) {
                this.G0 = i13 / 1000.0f;
                return;
            }
            return;
        }
        this.v0 = i10;
        if (i14 != -1) {
            setTransition(i14, i10);
            f(1.0f);
            this.I0 = 0.0f;
            transitionToEnd();
            if (i13 > 0) {
                this.G0 = i13 / 1000.0f;
                return;
            }
            return;
        }
        this.Q0 = false;
        this.K0 = 1.0f;
        this.H0 = 0.0f;
        this.I0 = 0.0f;
        this.J0 = getNanoTime();
        this.F0 = getNanoTime();
        this.L0 = false;
        this.f19433q0 = null;
        if (i13 == -1) {
            this.G0 = this.f19431p0.getDuration() / 1000.0f;
        }
        this.f19438t0 = -1;
        this.f19431p0.n(-1, this.v0);
        SparseArray sparseArray = new SparseArray();
        if (i13 == 0) {
            this.G0 = this.f19431p0.getDuration() / 1000.0f;
        } else if (i13 > 0) {
            this.G0 = i13 / 1000.0f;
        }
        int childCount = getChildCount();
        HashMap<View, MotionController> map = this.E0;
        map.clear();
        for (int i15 = 0; i15 < childCount; i15++) {
            View childAt = getChildAt(i15);
            map.put(childAt, new MotionController(childAt));
            sparseArray.put(childAt.getId(), map.get(childAt));
        }
        this.M0 = true;
        ConstraintSet constraintSetB = this.f19431p0.b(i10);
        g gVar = this.H1;
        gVar.e(null, constraintSetB);
        rebuildScene();
        gVar.a();
        int childCount2 = getChildCount();
        for (int i16 = 0; i16 < childCount2; i16++) {
            View childAt2 = getChildAt(i16);
            MotionController motionController = map.get(childAt2);
            if (motionController != null) {
                androidx.constraintlayout.motion.widget.d dVar = motionController.f19393f;
                dVar.f19595r0 = 0.0f;
                dVar.f19596s0 = 0.0f;
                dVar.f(childAt2.getX(), childAt2.getY(), childAt2.getWidth(), childAt2.getHeight());
                androidx.constraintlayout.motion.widget.b bVar = motionController.f19395h;
                bVar.getClass();
                childAt2.getX();
                childAt2.getY();
                childAt2.getWidth();
                childAt2.getHeight();
                bVar.b(childAt2);
            }
        }
        int width = getWidth();
        int height = getHeight();
        if (this.f19420e1 != null) {
            for (int i17 = 0; i17 < childCount; i17++) {
                MotionController motionController2 = map.get(getChildAt(i17));
                if (motionController2 != null) {
                    this.f19431p0.getKeyFrames(motionController2);
                }
            }
            Iterator<MotionHelper> it = this.f19420e1.iterator();
            while (it.hasNext()) {
                it.next().onPreSetup(this, map);
            }
            for (int i18 = 0; i18 < childCount; i18++) {
                MotionController motionController3 = map.get(getChildAt(i18));
                if (motionController3 != null) {
                    motionController3.setup(width, height, this.G0, getNanoTime());
                }
            }
        } else {
            for (int i19 = 0; i19 < childCount; i19++) {
                MotionController motionController4 = map.get(getChildAt(i19));
                if (motionController4 != null) {
                    this.f19431p0.getKeyFrames(motionController4);
                    motionController4.setup(width, height, this.G0, getNanoTime());
                }
            }
        }
        float staggered = this.f19431p0.getStaggered();
        if (staggered != 0.0f) {
            float fMin = Float.MAX_VALUE;
            float fMax = -3.4028235E38f;
            for (int i20 = 0; i20 < childCount; i20++) {
                MotionController motionController5 = map.get(getChildAt(i20));
                float finalY = motionController5.getFinalY() + motionController5.getFinalX();
                fMin = Math.min(fMin, finalY);
                fMax = Math.max(fMax, finalY);
            }
            for (int i21 = 0; i21 < childCount; i21++) {
                MotionController motionController6 = map.get(getChildAt(i21));
                float finalX = motionController6.getFinalX();
                float finalY2 = motionController6.getFinalY();
                motionController6.f19400n = 1.0f / (1.0f - staggered);
                motionController6.m = staggered - ((((finalX + finalY2) - fMin) * staggered) / (fMax - fMin));
            }
        }
        this.H0 = 0.0f;
        this.I0 = 0.0f;
        this.M0 = true;
        invalidate();
    }

    public void setTransition(int i10) {
        float f6;
        if (this.f19431p0 != null) {
            MotionScene.Transition transition = getTransition(i10);
            this.f19438t0 = transition.getStartConstraintSetId();
            this.v0 = transition.getEndConstraintSetId();
            if (!isAttachedToWindow()) {
                if (this.f19441u1 == null) {
                    this.f19441u1 = new i();
                }
                i iVar = this.f19441u1;
                iVar.f19482c = this.f19438t0;
                iVar.f19483d = this.v0;
                return;
            }
            int i11 = this.f19440u0;
            if (i11 == this.f19438t0) {
                f6 = 0.0f;
            } else {
                f6 = i11 == this.v0 ? 1.0f : Float.NaN;
            }
            this.f19431p0.setTransition(transition);
            this.H1.e(this.f19431p0.b(this.f19438t0), this.f19431p0.b(this.v0));
            rebuildScene();
            if (this.I0 != f6) {
                if (f6 == 0.0f) {
                    g(true);
                    this.f19431p0.b(this.f19438t0).applyTo(this);
                } else if (f6 == 1.0f) {
                    g(false);
                    this.f19431p0.b(this.v0).applyTo(this);
                }
            }
            this.I0 = Float.isNaN(f6) ? 0.0f : f6;
            if (Float.isNaN(f6)) {
                Debug.getLocation();
                transitionToStart();
            } else {
                setProgress(f6);
            }
        }
    }

    public void setTransition(MotionScene.Transition transition) {
        this.f19431p0.setTransition(transition);
        setState(j.SETUP);
        int i10 = this.f19440u0;
        MotionScene.Transition transition2 = this.f19431p0.f19487c;
        if (i10 == (transition2 == null ? -1 : transition2.f19506c)) {
            this.I0 = 1.0f;
            this.H0 = 1.0f;
            this.K0 = 1.0f;
        } else {
            this.I0 = 0.0f;
            this.H0 = 0.0f;
            this.K0 = 0.0f;
        }
        this.J0 = transition.isTransitionFlag(1) ? -1L : getNanoTime();
        int iG = this.f19431p0.g();
        MotionScene motionScene = this.f19431p0;
        MotionScene.Transition transition3 = motionScene.f19487c;
        int i11 = transition3 != null ? transition3.f19506c : -1;
        if (iG == this.f19438t0 && i11 == this.v0) {
            return;
        }
        this.f19438t0 = iG;
        this.v0 = i11;
        motionScene.n(iG, i11);
        ConstraintSet constraintSetB = this.f19431p0.b(this.f19438t0);
        ConstraintSet constraintSetB2 = this.f19431p0.b(this.v0);
        g gVar = this.H1;
        gVar.e(constraintSetB, constraintSetB2);
        int i12 = this.f19438t0;
        int i13 = this.v0;
        gVar.f19475e = i12;
        gVar.f19476f = i13;
        gVar.f();
        rebuildScene();
    }

    public MotionLayout(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f19435r0 = null;
        this.f19436s0 = 0.0f;
        this.f19438t0 = -1;
        this.f19440u0 = -1;
        this.v0 = -1;
        this.f19443w0 = 0;
        this.f19445x0 = 0;
        this.f19447y0 = true;
        this.E0 = new HashMap<>();
        this.F0 = 0L;
        this.G0 = 1.0f;
        this.H0 = 0.0f;
        this.I0 = 0.0f;
        this.K0 = 0.0f;
        this.M0 = false;
        this.O0 = 0;
        this.Q0 = false;
        this.R0 = new StopLogic();
        this.S0 = new e();
        this.W0 = false;
        this.f19417b1 = false;
        this.f19418c1 = null;
        this.f19419d1 = null;
        this.f19420e1 = null;
        this.f19421f1 = null;
        this.f19422g1 = 0;
        this.f19423h1 = -1L;
        this.f19424i1 = 0.0f;
        this.f19425j1 = 0;
        this.f19426k1 = 0.0f;
        this.mMeasureDuringTransition = false;
        this.f19437s1 = new KeyCache();
        this.f19439t1 = false;
        this.f19442v1 = null;
        this.f19444w1 = null;
        this.f19446x1 = 0;
        this.f19448y1 = false;
        this.f19449z1 = 0;
        this.A1 = new HashMap<>();
        this.E1 = new Rect();
        this.F1 = false;
        this.G1 = j.UNDEFINED;
        this.H1 = new g();
        this.I1 = false;
        this.J1 = new RectF();
        this.K1 = null;
        this.L1 = null;
        this.M1 = new ArrayList<>();
        l(attributeSet);
    }

    public MotionLayout(@NonNull Context context, @Nullable AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f19435r0 = null;
        this.f19436s0 = 0.0f;
        this.f19438t0 = -1;
        this.f19440u0 = -1;
        this.v0 = -1;
        this.f19443w0 = 0;
        this.f19445x0 = 0;
        this.f19447y0 = true;
        this.E0 = new HashMap<>();
        this.F0 = 0L;
        this.G0 = 1.0f;
        this.H0 = 0.0f;
        this.I0 = 0.0f;
        this.K0 = 0.0f;
        this.M0 = false;
        this.O0 = 0;
        this.Q0 = false;
        this.R0 = new StopLogic();
        this.S0 = new e();
        this.W0 = false;
        this.f19417b1 = false;
        this.f19418c1 = null;
        this.f19419d1 = null;
        this.f19420e1 = null;
        this.f19421f1 = null;
        this.f19422g1 = 0;
        this.f19423h1 = -1L;
        this.f19424i1 = 0.0f;
        this.f19425j1 = 0;
        this.f19426k1 = 0.0f;
        this.mMeasureDuringTransition = false;
        this.f19437s1 = new KeyCache();
        this.f19439t1 = false;
        this.f19442v1 = null;
        this.f19444w1 = null;
        this.f19446x1 = 0;
        this.f19448y1 = false;
        this.f19449z1 = 0;
        this.A1 = new HashMap<>();
        this.E1 = new Rect();
        this.F1 = false;
        this.G1 = j.UNDEFINED;
        this.H1 = new g();
        this.I1 = false;
        this.J1 = new RectF();
        this.K1 = null;
        this.L1 = null;
        this.M1 = new ArrayList<>();
        l(attributeSet);
    }
}

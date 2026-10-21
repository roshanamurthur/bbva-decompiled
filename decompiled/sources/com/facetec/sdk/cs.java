package com.facetec.sdk;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.os.Build;
import android.os.Handler;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Property;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.OvershootInterpolator;
import android.widget.ExpandableListView;
import com.bbva.tohu.android.product.valkyria.sdk.payments.paywave.Constants;
import com.mastercard.sonic.StatusCode;
import java.lang.reflect.Method;
import java.util.Map;

/* JADX INFO: loaded from: classes9.dex */
class cs extends View {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final int f41000t = (int) ay.e(10);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected Paint f41001a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    RectF f41002b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f41003c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    protected Paint f41004d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    protected RectF f41005e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    protected RectF f41006f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    AnimatorSet f41007g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    protected final float f41008h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    protected RectF f41009i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    protected final float f41010j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private b f41011k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    AnimatorSet f41012l;
    AnimatorSet m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private AnimatorSet f41013n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private Paint f41014o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private Animator f41015p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final Handler f41016q;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private boolean f41017s;

    /* JADX INFO: renamed from: com.facetec.sdk.cs$2, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass2 {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        static final /* synthetic */ int[] f41018e;

        static {
            int[] iArr = new int[FaceTecExitAnimationStyle.values().length];
            f41018e = iArr;
            try {
                iArr[FaceTecExitAnimationStyle.NONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f41018e[FaceTecExitAnimationStyle.RIPPLE_IN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f41018e[FaceTecExitAnimationStyle.RIPPLE_OUT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f41018e[FaceTecExitAnimationStyle.CIRCLE_FADE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public class b {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final Paint f41022b;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final Paint f41025e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final int f41026f;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private final TimeInterpolator f41028h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private final int f41029i;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        AnimatorSet f41021a = null;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        RectF f41023c = null;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        float f41024d = 0.0f;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        float f41030j = 0.0f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final ValueAnimator.AnimatorUpdateListener f41027g = new ValueAnimator.AnimatorUpdateListener() { // from class: com.facetec.sdk.f7
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                this.f41541a.bu_(valueAnimator);
            }
        };

        public b(Context context) {
            int iE = db.e(context, FaceTecSDK.f40106a.f40091o.progressColor1);
            int iE2 = db.e(context, FaceTecSDK.f40106a.f40091o.progressColor2);
            this.f41025e = bt_(iE);
            this.f41022b = bt_(iE2);
            this.f41026f = db.b(context, FaceTecSDK.f40106a.f40091o.progressColor1);
            this.f41029i = db.b(context, FaceTecSDK.f40106a.f40091o.progressColor2);
            this.f41028h = new AccelerateDecelerateInterpolator();
        }

        private ObjectAnimator bs_(Paint paint, int i10) {
            paint.setAlpha(Math.max(0, i10 - 50));
            double d2 = i10;
            ObjectAnimator objectAnimatorOfInt = ObjectAnimator.ofInt(paint, "alpha", (int) (0.8d * d2), (int) (d2 * 0.24d));
            objectAnimatorOfInt.setDuration(500L);
            objectAnimatorOfInt.setInterpolator(new DecelerateInterpolator());
            objectAnimatorOfInt.setStartDelay(cs.this.i() ? 600L : 400L);
            return objectAnimatorOfInt;
        }

        private Paint bt_(int i10) {
            Paint paint = new Paint(1);
            paint.setStyle(Paint.Style.STROKE);
            paint.setStrokeWidth(cs.this.f41008h);
            paint.setStrokeJoin(Paint.Join.ROUND);
            paint.setStrokeCap(Paint.Cap.ROUND);
            paint.setColor(i10);
            return paint;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void bu_(ValueAnimator valueAnimator) {
            cs.this.invalidate();
        }

        public final void d() {
            float fE;
            if (a()) {
                return;
            }
            if (this.f41023c == null) {
                int i10 = FaceTecSDK.f40106a.f40091o.progressRadialOffset;
                if (i10 == 0) {
                    cs csVar = cs.this;
                    fE = csVar.f41008h + csVar.f41010j;
                } else {
                    fE = ay.e((int) (i10 * db.d()));
                }
                RectF rectF = cs.this.f41006f;
                this.f41023c = new RectF(rectF.left + fE, rectF.top + fE, rectF.right - fE, rectF.bottom - fE);
            }
            ObjectAnimator objectAnimatorBs_ = bs_(this.f41025e, this.f41026f);
            ObjectAnimator objectAnimatorBs_2 = bs_(this.f41022b, this.f41029i);
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this, "startStrokePosition", 0.0f, 360.0f);
            boolean zI = cs.this.i();
            objectAnimatorOfFloat.addUpdateListener(this.f41027g);
            objectAnimatorOfFloat.setInterpolator(this.f41028h);
            objectAnimatorOfFloat.setDuration(zI ? 1000L : 800L);
            this.f41030j = 0.0f;
            ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(this, "endStrokePosition", 0.0f, 360.0f);
            objectAnimatorOfFloat2.setDuration(zI ? 1000L : 800L);
            objectAnimatorOfFloat2.addUpdateListener(this.f41027g);
            objectAnimatorOfFloat2.setInterpolator(this.f41028h);
            objectAnimatorOfFloat2.setStartDelay(zI ? 200L : 100L);
            AnimatorSet animatorSet = new AnimatorSet();
            this.f41021a = animatorSet;
            animatorSet.playTogether(objectAnimatorOfFloat, objectAnimatorOfFloat2, objectAnimatorBs_, objectAnimatorBs_2);
            this.f41021a.start();
        }

        public final void setEndStrokePosition(float f6) {
            this.f41030j = f6;
        }

        public final void setStartStrokePosition(float f6) {
            this.f41024d = f6;
        }

        private boolean a() {
            AnimatorSet animatorSet = this.f41021a;
            return animatorSet != null && animatorSet.isStarted();
        }
    }

    public cs(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f41015p = null;
        this.f41017s = false;
        this.f41016q = new Handler();
        this.f41010j = ay.e(db.w()) * db.d();
        this.f41008h = ay.e(((Integer) db.c(new Object[0], 1077540053, -1077540037, (int) System.currentTimeMillis())).intValue()) * db.d();
        post(new i1(this, 3));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void bq_(Runnable runnable, Animator animator) {
        setVisibility(4);
        if (runnable != null) {
            runnable.run();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void br_(AnimatorSet animatorSet) throws Throwable {
        if (animatorSet != null) {
            animatorSet.start();
        } else {
            t.c(getContext(), e.NON_FATAL_ERROR, "animatorSet is null unexpectedly.");
        }
    }

    private void e() {
        if (this.f41014o != null) {
            Context context = getContext();
            this.f41001a.setColor(db.n(context));
            this.f41014o.setColor(db.k(context));
        }
    }

    public final RectF bo_() {
        c(false);
        return this.f41005e;
    }

    public final void bp_(AnimatorSet animatorSet) {
        this.f41015p = animatorSet;
        this.f41016q.post(new e6(this, animatorSet, 1));
    }

    public final void d() {
        b bVar = this.f41011k;
        if (bVar != null) {
            bVar.d();
        }
    }

    public final void f() {
        e();
        invalidate();
    }

    public final void g() {
        setOvalHasExpanded(false);
        bp_(this.f41012l);
    }

    public final int h() {
        return (int) this.f41005e.bottom;
    }

    public final boolean i() {
        return this.f41003c;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.f41005e != null) {
            canvas.drawRect(-400.0f, -400.0f, getWidth() + StatusCode.SUCCESS, getHeight() + StatusCode.SUCCESS, this.f41014o);
            canvas.drawOval(this.f41005e, this.f41004d);
            canvas.drawOval(this.f41006f, this.f41001a);
        }
        b bVar = this.f41011k;
        if (bVar == null || bVar.f41021a == null) {
            return;
        }
        float f6 = bVar.f41024d;
        float f10 = -(f6 - bVar.f41030j);
        canvas.drawArc(bVar.f41023c, f6, f10, false, bVar.f41022b);
        canvas.drawArc(bVar.f41023c, (bVar.f41024d + 180.0f) % 360.0f, f10, false, bVar.f41025e);
    }

    public void setOvalHasExpanded(boolean z10) {
        this.f41003c = z10;
    }

    public void setOvalStrokeWidth(int i10) {
        if (this.f41001a == null) {
            a();
            e();
        }
        this.f41001a.setStrokeWidth(i10);
        invalidate();
    }

    public void setTransparentBackground() {
        if (this.f41014o == null) {
            a();
            e();
        }
        this.f41014o.setColor(0);
        invalidate();
    }

    private void a() {
        setLayerType(1, null);
        Paint paint = new Paint(1);
        this.f41004d = paint;
        paint.setStyle(Paint.Style.FILL);
        this.f41004d.setAlpha(0);
        this.f41004d.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        setLayerType(2, null);
        Paint paint2 = new Paint(1);
        this.f41001a = paint2;
        paint2.setStyle(Paint.Style.STROKE);
        this.f41001a.setStrokeWidth(this.f41010j);
        String[] strArr = {"Nokia 2.2", "Nokia_2_2", "G5", "G5_Plus", "LM-X320", "LM-X420", "LM-X520", "LM-X525", "JAT-L29", "Infinix X650B", "moto e(6) plus"};
        for (int i10 = 0; i10 < 11; i10++) {
            if (Build.MODEL.equals(strArr[i10])) {
                this.f41001a.setAntiAlias(false);
            }
        }
        Paint paint3 = new Paint(1);
        this.f41014o = paint3;
        paint3.setStyle(Paint.Style.FILL);
        e();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void c() {
        c(false);
        a();
        float fWidth = this.f41002b.width() / this.f41005e.width();
        float fHeight = this.f41002b.height() / this.f41005e.height();
        Property property = View.SCALE_X;
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this, (Property<cs, Float>) property, 1.0f, fWidth);
        Property property2 = View.SCALE_Y;
        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(this, (Property<cs, Float>) property2, 1.0f, fHeight);
        AnimatorSet animatorSet = new AnimatorSet();
        this.f41007g = animatorSet;
        animatorSet.setInterpolator(new OvershootInterpolator(0.8f));
        this.f41007g.setDuration(1600L);
        this.f41007g.playTogether(objectAnimatorOfFloat, objectAnimatorOfFloat2);
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.f41013n = animatorSet2;
        animatorSet2.setDuration(0L);
        this.f41013n.playTogether(objectAnimatorOfFloat, objectAnimatorOfFloat2);
        ObjectAnimator objectAnimatorOfFloat3 = ObjectAnimator.ofFloat(this, (Property<cs, Float>) property, 1.0f, fWidth);
        ObjectAnimator objectAnimatorOfFloat4 = ObjectAnimator.ofFloat(this, (Property<cs, Float>) property2, 1.0f, fHeight);
        AnimatorSet animatorSet3 = new AnimatorSet();
        this.m = animatorSet3;
        animatorSet3.setInterpolator(new OvershootInterpolator(1.5f));
        this.m.setDuration(1200L);
        this.m.playTogether(objectAnimatorOfFloat3, objectAnimatorOfFloat4);
        ObjectAnimator objectAnimatorOfFloat5 = ObjectAnimator.ofFloat(this, (Property<cs, Float>) property, fWidth, 1.0f);
        ObjectAnimator objectAnimatorOfFloat6 = ObjectAnimator.ofFloat(this, (Property<cs, Float>) property2, fHeight, 1.0f);
        AnimatorSet animatorSet4 = new AnimatorSet();
        this.f41012l = animatorSet4;
        animatorSet4.setDuration(700L);
        this.f41012l.playTogether(objectAnimatorOfFloat5, objectAnimatorOfFloat6);
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0029  */
    public final void c(Runnable runnable, boolean z10) {
        float f6;
        f();
        FaceTecExitAnimationStyle faceTecExitAnimationStyle = z10 ? FaceTecSDK.f40106a.f40092p : FaceTecSDK.f40106a.f40093r;
        int i10 = AnonymousClass2.f41018e[faceTecExitAnimationStyle.ordinal()];
        float f10 = 1.0f;
        int i11 = StatusCode.SUCCESS;
        if (i10 != 2) {
            f6 = 2.1f;
            if (i10 != 3) {
                if (i10 != 4) {
                    f6 = 1.0f;
                } else {
                    this.f41001a.setColor(db.k(getContext()));
                    i11 = 1000;
                }
            }
            f10 = 1.8f;
        } else {
            f6 = 1.0f;
        }
        if (faceTecExitAnimationStyle != FaceTecExitAnimationStyle.NONE) {
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this, (Property<cs, Float>) View.SCALE_X, getScaleX(), f10);
            ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(this, (Property<cs, Float>) View.SCALE_Y, getScaleY(), f6);
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.setDuration(i11);
            animatorSet.setInterpolator(new DecelerateInterpolator());
            animatorSet.playTogether(objectAnimatorOfFloat, objectAnimatorOfFloat2);
            animatorSet.addListener(new z6(this, 1, runnable));
            animatorSet.addListener(new Animator.AnimatorListener() { // from class: com.facetec.sdk.cs.5
                private static final byte[] $$a = null;
                private static final int $$b = 0;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                private static int f41019b;

                static {
                    init$0();
                    f41019b = -1817348499;
                }

                /* JADX WARN: Code duplicated, block: B:39:0x0198  */
                /* JADX WARN: Code duplicated, block: B:40:0x0199  */
                private static void a(int i12, int i13, int i14, String str, boolean z11, Object[] objArr) throws Throwable {
                    Throwable cause;
                    char[] charArray = str != null ? str.toCharArray() : str;
                    gz gzVar = new gz();
                    char[] cArr = new char[i14];
                    gzVar.f41846c = 0;
                    while (true) {
                        int i15 = gzVar.f41846c;
                        if (i15 >= i14) {
                            break;
                        }
                        char c10 = charArray[i15];
                        gzVar.f41844a = c10;
                        char c11 = (char) (i12 + c10);
                        cArr[i15] = c11;
                        try {
                            Object[] objArr2 = {Integer.valueOf(c11), Integer.valueOf(f41019b)};
                            Map map = bp.f40694x;
                            Object method = map.get(1917901234);
                            if (method == null) {
                                Class cls = (Class) bp.a(23 - View.resolveSize(0, 0), 1025 - ExpandableListView.getPackedPositionGroup(0L), (char) (38454 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1))));
                                byte b10 = (byte) 0;
                                byte b11 = b10;
                                Object[] objArr3 = new Object[1];
                                c(b10, b11, (byte) (b11 - 1), objArr3);
                                String str2 = (String) objArr3[0];
                                Class<?> cls2 = Integer.TYPE;
                                method = cls.getMethod(str2, cls2, cls2);
                                map.put(1917901234, method);
                            }
                            cArr[i15] = ((Character) ((Method) method).invoke(null, objArr2)).charValue();
                            Object[] objArr4 = {gzVar, gzVar};
                            Object method2 = map.get(-1709307603);
                            if (method2 == null) {
                                Class cls3 = (Class) bp.a(Color.blue(0) + 24, (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 764, (char) (36773 - Color.blue(0)));
                                byte b12 = (byte) 1;
                                byte b13 = (byte) (b12 - 1);
                                Object[] objArr5 = new Object[1];
                                c(b12, b13, (byte) (b13 - 1), objArr5);
                                method2 = cls3.getMethod((String) objArr5[0], Object.class, Object.class);
                                map.put(-1709307603, method2);
                            }
                            ((Method) method2).invoke(null, objArr4);
                        } catch (Throwable th2) {
                            cause = th2.getCause();
                            if (cause != null) {
                                throw th2;
                            }
                            throw cause;
                        }
                        cause = th2.getCause();
                        if (cause != null) {
                            throw th2;
                        }
                        throw cause;
                    }
                    if (i13 > 0) {
                        gzVar.f41845b = i13;
                        char[] cArr2 = new char[i14];
                        System.arraycopy(cArr, 0, cArr2, 0, i14);
                        int i16 = gzVar.f41845b;
                        System.arraycopy(cArr2, 0, cArr, i14 - i16, i16);
                        int i17 = gzVar.f41845b;
                        System.arraycopy(cArr2, i17, cArr, 0, i14 - i17);
                    }
                    if (z11) {
                        char[] cArr3 = new char[i14];
                        gzVar.f41846c = 0;
                        while (true) {
                            int i18 = gzVar.f41846c;
                            if (i18 >= i14) {
                                break;
                            }
                            cArr3[i18] = cArr[(i14 - i18) - 1];
                            Object[] objArr6 = {gzVar, gzVar};
                            Map map2 = bp.f40694x;
                            Object method3 = map2.get(-1709307603);
                            if (method3 == null) {
                                Class cls4 = (Class) bp.a(24 - (ViewConfiguration.getScrollBarSize() >> 8), (ViewConfiguration.getScrollDefaultDelay() >> 16) + 765, (char) (36772 - TextUtils.lastIndexOf("", '0', 0, 0)));
                                byte b14 = (byte) 1;
                                byte b15 = (byte) (b14 - 1);
                                Object[] objArr7 = new Object[1];
                                c(b14, b15, (byte) (b15 - 1), objArr7);
                                method3 = cls4.getMethod((String) objArr7[0], Object.class, Object.class);
                                map2.put(-1709307603, method3);
                            }
                            ((Method) method3).invoke(null, objArr6);
                        }
                        cArr = cArr3;
                    }
                    objArr[0] = new String(cArr);
                }

                /* JADX WARN: Code duplicated, block: B:10:0x0029  */
                /* JADX WARN: Code duplicated, block: B:8:0x0021  */
                /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0029 -> B:11:0x0031). Please report as a decompilation issue!!! */
                /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
                    jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0029
                    	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
                    	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
                    	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
                    */
                private static void c(int r6, short r7, byte r8, java.lang.Object[] r9) {
                    /*
                        int r6 = r6 * 5
                        int r6 = r6 + 101
                        byte[] r0 = com.facetec.sdk.cs.AnonymousClass5.$$a
                        int r8 = r8 + 4
                        int r7 = r7 * 4
                        int r1 = r7 + 1
                        byte[] r1 = new byte[r1]
                        r2 = 0
                        if (r0 != 0) goto L17
                        r3 = r1
                        r4 = r2
                        r1 = r0
                        r0 = r9
                        r9 = r8
                        goto L31
                    L17:
                        r3 = r2
                    L18:
                        int r8 = r8 + 1
                        byte r4 = (byte) r6
                        r1[r3] = r4
                        int r4 = r3 + 1
                        if (r3 != r7) goto L29
                        java.lang.String r6 = new java.lang.String
                        r6.<init>(r1, r2)
                        r9[r2] = r6
                        return
                    L29:
                        r3 = r0[r8]
                        r5 = r9
                        r9 = r8
                        r8 = r3
                        r3 = r1
                        r1 = r0
                        r0 = r5
                    L31:
                        int r8 = -r8
                        int r6 = r6 + r8
                        r8 = r9
                        r9 = r0
                        r0 = r1
                        r1 = r3
                        r3 = r4
                        goto L18
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.facetec.sdk.cs.AnonymousClass5.c(int, short, byte, java.lang.Object[]):void");
                }

                public static void init$0() {
                    $$a = new byte[]{Constants.CVR_B1b85_0110_TERMINAL, 45, 8, 40};
                    $$b = 40;
                }

                @Override // android.animation.Animator.AnimatorListener
                public final void onAnimationEnd(Animator animator) throws Throwable {
                    try {
                        Object[] objArr = new Object[1];
                        a(139 - TextUtils.getOffsetBefore("", 0), 14 - TextUtils.indexOf("", "", 0), 16 - View.MeasureSpec.getSize(0), "\u0014\uffffￌ\n\uffff\f\u0005ￌ\ufff1\u0017\u0011\u0012\u0003\u000b\b\uffff", false, objArr);
                        Class<?> cls = Class.forName((String) objArr[0]);
                        Object[] objArr2 = new Object[1];
                        a(145 - ExpandableListView.getPackedPositionChild(0L), (ViewConfiguration.getWindowTouchSlop() >> 8) + 12, 17 - View.combineMeasuredStates(0, 0), "\u0005\u000b￫\u0000\u0004￼￤\u0000\u0003\u0003\u0000\n\ufffa\f\t\t￼", false, objArr2);
                        ch.E("brets", ((Long) cls.getMethod((String) objArr2[0], null).invoke(null, null)).longValue());
                    } catch (Throwable th2) {
                        Throwable cause = th2.getCause();
                        if (cause == null) {
                            throw th2;
                        }
                        throw cause;
                    }
                }

                @Override // android.animation.Animator.AnimatorListener
                public final void onAnimationStart(Animator animator) throws Throwable {
                    try {
                        Object[] objArr = new Object[1];
                        a(139 - (ViewConfiguration.getWindowTouchSlop() >> 8), 14 - (ViewConfiguration.getLongPressTimeout() >> 16), (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 16, "\u0014\uffffￌ\n\uffff\f\u0005ￌ\ufff1\u0017\u0011\u0012\u0003\u000b\b\uffff", false, objArr);
                        Class<?> cls = Class.forName((String) objArr[0]);
                        Object[] objArr2 = new Object[1];
                        a(147 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), 12 - View.MeasureSpec.getSize(0), (-16777199) - Color.rgb(0, 0, 0), "\u0005\u000b￫\u0000\u0004￼￤\u0000\u0003\u0003\u0000\n\ufffa\f\t\t￼", false, objArr2);
                        ch.E("brsts", ((Long) cls.getMethod((String) objArr2[0], null).invoke(null, null)).longValue());
                    } catch (Throwable th2) {
                        Throwable cause = th2.getCause();
                        if (cause == null) {
                            throw th2;
                        }
                        throw cause;
                    }
                }

                @Override // android.animation.Animator.AnimatorListener
                public final void onAnimationCancel(Animator animator) {
                }

                @Override // android.animation.Animator.AnimatorListener
                public final void onAnimationRepeat(Animator animator) {
                }
            });
            bp_(animatorSet);
        }
    }

    public final synchronized void c(boolean z10) {
        try {
            if (!this.f41017s || z10) {
                this.f41017s = true;
                int width = getWidth();
                int height = db.d() < 1.0f ? Resources.getSystem().getDisplayMetrics().heightPixels : getHeight();
                float f6 = width;
                float f10 = 0.65f * f6;
                float f11 = (f6 - f10) / 2.0f;
                float height2 = (getHeight() - (f10 * 1.48f)) / 2.0f;
                RectF rectF = new RectF();
                this.f41005e = rectF;
                rectF.set(f11, height2, f6 - f11, getHeight() - height2);
                RectF rectF2 = new RectF();
                this.f41006f = rectF2;
                RectF rectF3 = this.f41005e;
                float f12 = rectF3.left;
                float f13 = this.f41010j;
                rectF2.set((f13 / 2.0f) + f12, (f13 / 2.0f) + rectF3.top, rectF3.right - (f13 / 2.0f), rectF3.bottom - (f13 / 2.0f));
                RectF rectF4 = new RectF();
                this.f41009i = rectF4;
                RectF rectF5 = this.f41005e;
                float f14 = rectF5.left;
                float f15 = this.f41010j;
                rectF4.set(f14 + f15, rectF5.top + f15, rectF5.right - f15, rectF5.bottom - f15);
                float f16 = 0.98f * f6;
                float f17 = (f6 - f16) / 2.0f;
                float f18 = f16 * 1.7f;
                float f19 = height - (f41000t << 1);
                if (f19 <= f18) {
                    f18 = f19;
                }
                float height3 = (getHeight() - f18) / 2.0f;
                RectF rectF6 = new RectF();
                this.f41002b = rectF6;
                rectF6.set(f17, height3, f6 - f17, getHeight() - height3);
                this.f41011k = new b(getContext());
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }
}

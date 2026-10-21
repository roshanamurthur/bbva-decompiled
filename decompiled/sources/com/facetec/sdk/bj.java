package com.facetec.sdk;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.app.Activity;
import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.hardware.Camera;
import android.media.AudioTrack;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.util.Property;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.animation.DecelerateInterpolator;
import android.widget.ExpandableListView;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import com.bbva.tohu.android.product.valkyria.sdk.payments.paywave.Constants;
import com.mastercard.mpsdk.mcbp.mcmlite.apdu.emv.GenerateAcResponseApdu;
import com.mastercard.sonic.StatusCode;
import com.vasco.digipass.sdk.DigipassSDKConstants;
import com.vasco.digipass.sdk.utils.utilities.UtilitiesSDKConstants;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.Timer;
import java.util.TimerTask;

/* JADX INFO: loaded from: classes9.dex */
public final class bj extends aq {
    private static final byte[] $$a = null;
    private static final int $$b = 0;

    /* JADX INFO: renamed from: af, reason: collision with root package name */
    private static int f40582af;

    /* JADX INFO: renamed from: ah, reason: collision with root package name */
    private static int f40583ah;

    /* JADX INFO: renamed from: aj, reason: collision with root package name */
    private static short[] f40584aj;

    /* JADX INFO: renamed from: ak, reason: collision with root package name */
    private static byte[] f40585ak;

    /* JADX INFO: renamed from: al, reason: collision with root package name */
    private static int f40586al;
    private ImageView A;
    private RelativeLayout B;
    private LinearLayout C;
    private LinearLayout D;
    private RelativeLayout E;
    private RelativeLayout F;
    private LinearLayout G;
    private RelativeLayout H;
    private ImageView I;
    private RelativeLayout J;
    private RelativeLayout K;
    private RelativeLayout L;
    private LinearLayout M;
    private RelativeLayout N;
    private ImageView R;
    private RelativeLayout S;
    private al V;
    private Handler X;
    private Timer Y;
    private boolean Z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    ImageView f40587a;

    /* JADX INFO: renamed from: aa, reason: collision with root package name */
    private cz f40588aa;
    private FrameLayout ab;

    /* JADX INFO: renamed from: ac, reason: collision with root package name */
    private Handler f40589ac;

    /* JADX INFO: renamed from: ae, reason: collision with root package name */
    private boolean f40591ae;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    a f40593b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    a f40594c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    RelativeLayout f40595d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    TextView f40596e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    a f40597f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    a f40598g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    bq f40599h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    View f40600i;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    be f40603l;
    private bm m;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private bk f40606p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private RelativeLayout f40607q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private RelativeLayout f40608r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private RelativeLayout f40609s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private RelativeLayout f40610t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private TextView f40611u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private ImageView f40612v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private TextView f40613w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private TextView f40614x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private ImageView f40615y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private LinearLayout f40616z;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    c f40601j = c.FRONT;
    private boolean Q = false;
    private boolean P = false;
    private boolean O = false;
    private boolean W = false;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    boolean f40602k = false;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    boolean f40605o = false;
    private boolean T = false;
    private boolean U = false;

    /* JADX INFO: renamed from: ad, reason: collision with root package name */
    private TimerTask f40590ad = new cw(new k3(this, 6));

    /* JADX INFO: renamed from: ag, reason: collision with root package name */
    private ViewTreeObserver.OnGlobalLayoutListener f40592ag = new ViewTreeObserver.OnGlobalLayoutListener() { // from class: com.facetec.sdk.bj.5
        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public final void onGlobalLayout() {
            if (bj.this.P) {
                return;
            }
            bj.d(bj.this);
            bj.this.f();
            float fC = db.c();
            float fD = db.d();
            int iE = (int) (ay.e(35) * fC * fD);
            int iE2 = (int) (ay.e(50) * fC * fD);
            int iE3 = db.e();
            float f6 = iE3;
            float f10 = f6 / 2.0f;
            int iRound = Math.round(f10);
            int iRound2 = Math.round(f10);
            int i10 = (int) (20.0f * fC * fD);
            int iJ = db.j();
            int i11 = (int) (fC * 16.0f * fD);
            int iRound3 = Math.round(f10);
            bj.this.g();
            RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) bj.this.M.getLayoutParams();
            layoutParams.setMargins(iE3, 0, iE3, iE3);
            bj.this.M.setLayoutParams(layoutParams);
            bj.this.M.requestLayout();
            RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) bj.this.L.getLayoutParams();
            layoutParams2.setMargins(iE3, 0, iE3, iE3);
            ((ViewGroup.LayoutParams) layoutParams2).height = iE2;
            bj.this.L.setLayoutParams(layoutParams2);
            bj.this.L.requestLayout();
            bj.this.f40597f.setLayoutParams(new LinearLayout.LayoutParams(-1, iE2));
            bj.this.f40597f.requestLayout();
            new LinearLayout.LayoutParams(-1, iE2).setMargins(0, 0, 0, iE3);
            float fD2 = (Resources.getSystem().getDisplayMetrics().widthPixels * db.d()) - (iE3 << 1);
            int i12 = (int) fD2;
            bj.this.M.getLayoutParams().width = i12;
            bj.this.M.requestLayout();
            bj.this.f40593b.getLayoutParams().width = i12;
            bj.this.f40593b.requestLayout();
            float fMin = Math.min(Math.max(iE2, fD2 / 2.0f), (fD2 - f6) / 2.0f);
            bj.this.f40600i.getLayoutParams().width = (int) androidx.camera.camera2.internal.h0.a(fMin, 2.0f, bj.this.f40595d.getWidth(), 3.0f);
            int i13 = (int) fMin;
            bj.this.f40598g.getLayoutParams().width = i13;
            bj.this.f40594c.getLayoutParams().width = i13;
            ((LinearLayout.LayoutParams) bj.this.f40598g.getLayoutParams()).weight = 0.0f;
            ((LinearLayout.LayoutParams) bj.this.f40594c.getLayoutParams()).weight = 0.0f;
            bj.this.f40598g.requestLayout();
            bj.this.f40594c.requestLayout();
            RelativeLayout.LayoutParams layoutParams3 = (RelativeLayout.LayoutParams) bj.this.f40587a.getLayoutParams();
            layoutParams3.setMargins(iRound, iRound, 0, iRound);
            layoutParams3.setMarginStart(iRound);
            layoutParams3.setMarginEnd(iRound);
            bj.this.f40587a.setLayoutParams(layoutParams3);
            bj.this.f40587a.setPadding(iRound, iRound, iRound, iRound);
            bj.this.f40587a.getLayoutParams().height = iE;
            bj.this.f40587a.getLayoutParams().width = iE;
            bj.this.f40587a.requestLayout();
            RelativeLayout.LayoutParams layoutParams4 = (RelativeLayout.LayoutParams) bj.this.I.getLayoutParams();
            ((ViewGroup.LayoutParams) layoutParams4).width = -2;
            ((ViewGroup.LayoutParams) layoutParams4).height = -2;
            layoutParams4.setMargins(0, iRound, iRound, iRound);
            layoutParams4.setMarginStart(iRound);
            layoutParams4.setMarginEnd(iRound);
            bj.this.I.setLayoutParams(layoutParams4);
            bj.this.I.setPadding(iRound2, iRound2, iRound2, iRound2);
            bj.this.I.getLayoutParams().height = iE;
            bj.this.I.getLayoutParams().width = iE;
            bj.this.I.requestLayout();
            if (FaceTecSDK.f40106a.f40090n.f40073e == FaceTecCancelButtonCustomization.ButtonLocation.TOP_RIGHT) {
                ((RelativeLayout.LayoutParams) bj.this.I.getLayoutParams()).addRule(20);
            } else {
                ((RelativeLayout.LayoutParams) bj.this.I.getLayoutParams()).addRule(21);
            }
            float f11 = i10;
            bj.this.f40597f.setTextSize(2, f11);
            bj.this.f40598g.setTextSize(2, f11);
            bj.this.f40594c.setTextSize(2, f11);
            bj.this.f40593b.setTextSize(2, f11);
            bj.this.f40611u.setTextSize(2, iJ);
            bj.this.f40614x.setTextSize(2, f11);
            bj.this.f40613w.setTextSize(2, f11);
            bj.this.f40614x.setPadding(iRound3, iRound3, iRound3, iRound3);
            bj.this.f40613w.setPadding(iRound3, iRound3, iRound3, iRound3);
            bj.this.f40596e.setTextSize(2, i11);
            int iE4 = db.e();
            LinearLayout.LayoutParams layoutParams5 = (LinearLayout.LayoutParams) bj.this.f40611u.getLayoutParams();
            layoutParams5.setMarginStart(iE4);
            layoutParams5.setMarginEnd(iE4);
            bj.this.f40611u.setLayoutParams(layoutParams5);
            bj.this.f40611u.requestLayout();
        }
    };

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    final cc.a f40604n = new cc.a() { // from class: com.facetec.sdk.k5
        @Override // com.facetec.sdk.cc.a
        public final void onIDScanProgress(cf cfVar, ce ceVar) throws Throwable {
            this.f41974a.c(cfVar, ceVar);
        }
    };

    /* JADX INFO: renamed from: com.facetec.sdk.bj$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        static final /* synthetic */ int[] f40617b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        static final /* synthetic */ int[] f40618c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        static final /* synthetic */ int[] f40619d;

        static {
            int[] iArr = new int[cf.values().length];
            f40617b = iArr;
            try {
                iArr[cf.KEEP_SCANNING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f40617b[cf.END_SCAN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f40617b[cf.PRESENT_MANUAL_CAPTURE_BUTTON.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            int[] iArr2 = new int[ce.values().length];
            f40619d = iArr2;
            try {
                iArr2[ce.ID_IMAGE_HOLD_STEADY.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f40619d[ce.ID_IMAGE_FACE_NOT_FOUND.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f40619d[ce.ID_IMAGE_BLURRY.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            int[] iArr3 = new int[FaceTecCancelButtonCustomization.ButtonLocation.values().length];
            f40618c = iArr3;
            try {
                iArr3[FaceTecCancelButtonCustomization.ButtonLocation.TOP_LEFT.ordinal()] = 1;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f40618c[FaceTecCancelButtonCustomization.ButtonLocation.TOP_RIGHT.ordinal()] = 2;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f40618c[FaceTecCancelButtonCustomization.ButtonLocation.CUSTOM.ordinal()] = 3;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f40618c[FaceTecCancelButtonCustomization.ButtonLocation.DISABLED.ordinal()] = 4;
            } catch (NoSuchFieldError unused10) {
            }
        }
    }

    /* JADX INFO: renamed from: com.facetec.sdk.bj$3, reason: invalid class name */
    public class AnonymousClass3 implements Camera.PictureCallback {
        private static final byte[] $$a = null;
        private static final int $$b = 0;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static int[] f40620a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private /* synthetic */ long f40621b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private /* synthetic */ boolean f40622c;

        static {
            init$0();
            f40620a = new int[]{-1863419000, 676064007, -1756952877, 1632822440, 248222764, 308539533, -292994745, -1077506341, 1333705940, 129215524, 1668159793, 1871901499, 188275324, 55915474, 1227531849, -2146405094, 1934731286, -397303564};
        }

        public AnonymousClass3(long j10, boolean z10) {
            this.f40621b = j10;
            this.f40622c = z10;
        }

        private static void e(int[] iArr, int i10, Object[] objArr) throws Throwable {
            char[] cArr;
            Object method;
            String str = "";
            gx gxVar = new gx();
            char[] cArr2 = new char[4];
            char[] cArr3 = new char[iArr.length * 2];
            int[] iArr2 = f40620a;
            int i11 = 1;
            int i12 = 0;
            if (iArr2 != null) {
                int length = iArr2.length;
                int[] iArr3 = new int[length];
                int i13 = 0;
                while (i13 < length) {
                    try {
                        Object[] objArr2 = new Object[i11];
                        objArr2[i12] = Integer.valueOf(iArr2[i13]);
                        Map map = bp.f40694x;
                        Object obj = map.get(835167305);
                        if (obj != null) {
                            method = obj;
                        } else {
                            Class cls = (Class) bp.a(Gravity.getAbsoluteGravity(i12, i12) + 24, 765 - (TypedValue.complexToFloat(i12) > 0.0f ? 1 : (TypedValue.complexToFloat(i12) == 0.0f ? 0 : -1)), (char) ((ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 36772));
                            byte length2 = (byte) $$a.length;
                            Object[] objArr3 = new Object[1];
                            f((byte) i12, length2, (byte) (length2 - 4), objArr3);
                            method = cls.getMethod((String) objArr3[0], Integer.TYPE);
                            map.put(835167305, method);
                        }
                        iArr3[i13] = ((Integer) ((Method) method).invoke(null, objArr2)).intValue();
                        i13++;
                        iArr2 = iArr2;
                        length = length;
                        i11 = 1;
                        i12 = 0;
                    } catch (Throwable th2) {
                        Throwable cause = th2.getCause();
                        if (cause == null) {
                            throw th2;
                        }
                        throw cause;
                    }
                }
                iArr2 = iArr3;
            }
            int length3 = iArr2.length;
            int[] iArr4 = new int[length3];
            int[] iArr5 = f40620a;
            if (iArr5 != null) {
                int length4 = iArr5.length;
                int[] iArr6 = new int[length4];
                int i14 = 0;
                while (i14 < length4) {
                    Object[] objArr4 = {Integer.valueOf(iArr5[i14])};
                    Map map2 = bp.f40694x;
                    Object method2 = map2.get(835167305);
                    if (method2 == null) {
                        Class cls2 = (Class) bp.a(24 - TextUtils.indexOf(str, str, 0), 765 - View.resolveSize(0, 0), (char) (36773 - View.MeasureSpec.getMode(0)));
                        byte length5 = (byte) $$a.length;
                        Object[] objArr5 = new Object[1];
                        f((byte) 0, length5, (byte) (length5 - 4), objArr5);
                        method2 = cls2.getMethod((String) objArr5[0], Integer.TYPE);
                        map2.put(835167305, method2);
                    }
                    iArr6[i14] = ((Integer) ((Method) method2).invoke(null, objArr4)).intValue();
                    i14++;
                    str = str;
                    iArr5 = iArr5;
                    length4 = length4;
                    cArr3 = cArr3;
                }
                cArr = cArr3;
                iArr5 = iArr6;
            } else {
                cArr = cArr3;
            }
            char c10 = 0;
            System.arraycopy(iArr5, 0, iArr4, 0, length3);
            gxVar.f41838c = 0;
            while (true) {
                int i15 = gxVar.f41838c;
                if (i15 >= iArr.length) {
                    objArr[0] = new String(cArr, 0, i10);
                    return;
                }
                int i16 = iArr[i15];
                char c11 = (char) (i16 >> 16);
                cArr2[c10] = c11;
                char c12 = (char) i16;
                cArr2[1] = c12;
                char c13 = (char) (iArr[i15 + 1] >> 16);
                cArr2[2] = c13;
                char c14 = (char) iArr[i15 + 1];
                cArr2[3] = c14;
                gxVar.f41839d = (c11 << 16) + c12;
                gxVar.f41837a = (c13 << 16) + c14;
                gx.b(iArr4);
                int i17 = 0;
                for (int i18 = 16; i17 < i18; i18 = 16) {
                    int i19 = gxVar.f41839d ^ iArr4[i17];
                    gxVar.f41839d = i19;
                    Object[] objArr6 = {gxVar, Integer.valueOf(gx.e(i19)), gxVar, gxVar};
                    Map map3 = bp.f40694x;
                    Object method3 = map3.get(147461875);
                    if (method3 == null) {
                        Class cls3 = (Class) bp.a(23 - (ViewConfiguration.getWindowTouchSlop() >> 8), 1026 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), (char) ((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 38452));
                        byte b10 = (byte) 0;
                        byte b11 = b10;
                        Object[] objArr7 = new Object[1];
                        f(b10, b11, b11, objArr7);
                        method3 = cls3.getMethod((String) objArr7[0], Object.class, Integer.TYPE, Object.class, Object.class);
                        map3.put(147461875, method3);
                    }
                    int iIntValue = ((Integer) ((Method) method3).invoke(null, objArr6)).intValue();
                    gxVar.f41839d = gxVar.f41837a;
                    gxVar.f41837a = iIntValue;
                    i17++;
                }
                int i20 = gxVar.f41839d;
                int i21 = gxVar.f41837a;
                int i22 = i20 ^ iArr4[16];
                gxVar.f41837a = i22;
                int i23 = i21 ^ iArr4[17];
                gxVar.f41839d = i23;
                cArr2[0] = (char) (i23 >>> 16);
                cArr2[1] = (char) i23;
                cArr2[2] = (char) (i22 >>> 16);
                cArr2[3] = (char) i22;
                gx.b(iArr4);
                int i24 = gxVar.f41838c;
                cArr[i24 * 2] = cArr2[0];
                cArr[(i24 * 2) + 1] = cArr2[1];
                cArr[(i24 * 2) + 2] = cArr2[2];
                cArr[(i24 * 2) + 3] = cArr2[3];
                Object[] objArr8 = {gxVar, gxVar};
                Map map4 = bp.f40694x;
                Object method4 = map4.get(-1856717708);
                if (method4 == null) {
                    Class cls4 = (Class) bp.a(24 - (KeyEvent.getMaxKeyCode() >> 16), KeyEvent.getDeadChar(0, 0) + 789, (char) (26624 - Color.blue(0)));
                    byte b12 = (byte) 0;
                    byte b13 = (byte) (b12 + 1);
                    Object[] objArr9 = new Object[1];
                    f(b12, b13, (byte) (b13 - 1), objArr9);
                    method4 = cls4.getMethod((String) objArr9[0], Object.class, Object.class);
                    map4.put(-1856717708, method4);
                }
                ((Method) method4).invoke(null, objArr8);
                c10 = 0;
            }
        }

        /* JADX WARN: Code duplicated, block: B:10:0x0029  */
        /* JADX WARN: Code duplicated, block: B:8:0x0021  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0029 -> B:11:0x0033). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0029
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        private static void f(int r6, short r7, int r8, java.lang.Object[] r9) {
            /*
                int r7 = r7 + 117
                int r6 = r6 * 3
                int r0 = r6 + 1
                byte[] r1 = com.facetec.sdk.bj.AnonymousClass3.$$a
                int r8 = r8 * 4
                int r8 = 4 - r8
                byte[] r0 = new byte[r0]
                r2 = 0
                if (r1 != 0) goto L19
                r3 = r1
                r4 = r2
                r1 = r0
                r0 = r9
                r9 = r8
                r8 = r7
                r7 = r6
                goto L33
            L19:
                r3 = r2
            L1a:
                byte r4 = (byte) r7
                r0[r3] = r4
                int r4 = r3 + 1
                if (r3 != r6) goto L29
                java.lang.String r6 = new java.lang.String
                r6.<init>(r0, r2)
                r9[r2] = r6
                return
            L29:
                r3 = r1[r8]
                r5 = r7
                r7 = r6
                r6 = r3
                r3 = r1
                r1 = r0
                r0 = r9
                r9 = r8
                r8 = r5
            L33:
                int r6 = -r6
                int r6 = r6 + r8
                int r8 = r9 + 1
                r9 = r0
                r0 = r1
                r1 = r3
                r3 = r4
                r5 = r7
                r7 = r6
                r6 = r5
                goto L1a
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facetec.sdk.bj.AnonymousClass3.f(int, short, int, java.lang.Object[]):void");
        }

        public static void init$0() {
            $$a = new byte[]{65, 127, Constants.RESP_MSG_TEMPLATE_FORMAT_2, 113};
            $$b = 63;
        }

        @Override // android.hardware.Camera.PictureCallback
        public final void onPictureTaken(byte[] bArr, Camera camera) throws Throwable {
            an anVar = ag.f40235f;
            ch.k(bArr, false, anVar.f40333a, anVar.f40334c, ag.f40238i, true);
            try {
                Object[] objArr = new Object[1];
                e(new int[]{2092289530, -624700669, -112026054, 1593554665, -1653142710, -1723169478, 526651748, -777729603}, 16 - View.resolveSizeAndState(0, 0, 0), objArr);
                Class<?> cls = Class.forName((String) objArr[0]);
                Object[] objArr2 = new Object[1];
                e(new int[]{-832235193, -1436444225, -671680032, -1297218976, 208414827, 244437510, -264545958, -1791042473, 1416850816, -916820883}, (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 17, objArr2);
                t.c(bj.this.f40603l, e.ID_SCAN_BACK_CAMERA_TAKEPHOTO_API_ELAPSED_TIME, Long.toString(((Long) cls.getMethod((String) objArr2[0], null).invoke(null, null)).longValue() - this.f40621b));
                bj bjVar = bj.this;
                final boolean z10 = this.f40622c;
                bjVar.b(new Runnable() { // from class: com.facetec.sdk.o5
                    @Override // java.lang.Runnable
                    public final void run() throws Throwable {
                        this.f42747p0.a(z10);
                    }
                });
            } catch (Throwable th2) {
                Throwable cause = th2.getCause();
                if (cause == null) {
                    throw th2;
                }
                throw cause;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void a(boolean z10) throws Throwable {
            bj.this.a(z10);
        }
    }

    public enum c {
        FRONT,
        BACK
    }

    static {
        init$0();
        f40583ah = -1709445506;
        f40582af = 315160246;
        f40586al = 298962463;
        f40585ak = new byte[]{33, -88, -40, -77, -1, -4, -98, UtilitiesSDKConstants.SRP_LABEL_ENC, DigipassSDKConstants.SECURE_CHANNEL_MESSAGE_TYPE_INFORMATION_MESSAGE, -84, -9, -28, -126, -52, -82, -6, -63, -60, -61, -32, -36, -52, -8, -23, DigipassSDKConstants.SECURE_CHANNEL_MESSAGE_TYPE_INFORMATION_MESSAGE, -58, -3, -45, -60, -63, -14, -90, -90};
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void N() throws Throwable {
        this.ab.setVisibility(8);
        getFragmentManager().beginTransaction().remove(this.f40588aa).commitAllowingStateLoss();
        this.f40588aa = null;
        i();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:19:0x0065  */
    public /* synthetic */ boolean aI_(View view, MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            this.f40587a.setAlpha(0.4f);
        } else if (motionEvent.getAction() == 3 || motionEvent.getX() < 0.0f) {
            this.f40587a.setAlpha(1.0f);
        } else {
            if (motionEvent.getX() > this.f40587a.getLeft() + this.f40587a.getWidth() + 10 || motionEvent.getY() < 0.0f) {
                this.f40587a.setAlpha(1.0f);
            } else {
                if (motionEvent.getY() > this.f40587a.getTop() + this.f40587a.getHeight() + 10) {
                    this.f40587a.setAlpha(1.0f);
                } else if (motionEvent.getAction() == 1) {
                    this.f40587a.performClick();
                }
            }
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ boolean aJ_(View view, MotionEvent motionEvent) {
        if (this.W && motionEvent.getAction() == 0 && this.f40606p.aA_().contains(motionEvent.getX(), motionEvent.getY())) {
            try {
                if (this.V != null) {
                    n();
                    this.f40591ae = true;
                    this.V.F_(this.K);
                    this.m.d(motionEvent.getX(), motionEvent.getY());
                }
            } catch (Exception unused) {
            }
        }
        return true;
    }

    private static void ai(int i10, byte b10, short s4, int i11, int i12, Object[] objArr) throws Throwable {
        long j10;
        gy gyVar = new gy();
        StringBuilder sb2 = new StringBuilder();
        try {
            Object[] objArr2 = {Integer.valueOf(i10), Integer.valueOf(f40582af)};
            int i13 = 0;
            Map map = bp.f40694x;
            Object method = map.get(-131541546);
            if (method == null) {
                Class cls = (Class) bp.a((ViewConfiguration.getScrollBarFadeDuration() >> 16) + 24, MotionEvent.axisFromString("") + 1625, (char) (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)));
                byte b11 = (byte) ($$b & 5);
                byte b12 = (byte) (b11 - 1);
                Object[] objArr3 = new Object[1];
                am(b11, b12, b12, objArr3);
                String str = (String) objArr3[0];
                Class<?> cls2 = Integer.TYPE;
                method = cls.getMethod(str, cls2, cls2);
                map.put(-131541546, method);
            }
            int iIntValue = ((Integer) ((Method) method).invoke(null, objArr2)).intValue();
            int i14 = iIntValue == -1 ? 1 : 0;
            if (i14 == 0) {
                j10 = 8685730852850169510L;
            } else {
                byte[] bArr = f40585ak;
                if (bArr != null) {
                    int length = bArr.length;
                    byte[] bArr2 = new byte[length];
                    int i15 = 0;
                    while (i15 < length) {
                        Object[] objArr4 = new Object[1];
                        objArr4[i13] = Integer.valueOf(bArr[i15]);
                        Map map2 = bp.f40694x;
                        Object method2 = map2.get(1703225588);
                        if (method2 == null) {
                            Class cls3 = (Class) bp.a(24 - Gravity.getAbsoluteGravity(i13, i13), (ViewConfiguration.getJumpTapTimeout() >> 16) + 1167, (char) ((ViewConfiguration.getLongPressTimeout() >> 16) + 45988));
                            byte b13 = (byte) i13;
                            byte b14 = b13;
                            Object[] objArr5 = new Object[1];
                            am(b13, b14, b14, objArr5);
                            method2 = cls3.getMethod((String) objArr5[0], Integer.TYPE);
                            map2.put(1703225588, method2);
                        }
                        bArr2[i15] = ((Byte) ((Method) method2).invoke(null, objArr4)).byteValue();
                        i15++;
                        bArr = bArr;
                        i13 = 0;
                    }
                    bArr = bArr2;
                }
                if (bArr != null) {
                    byte[] bArr3 = f40585ak;
                    Object[] objArr6 = {Integer.valueOf(i11), Integer.valueOf(f40583ah)};
                    Map map3 = bp.f40694x;
                    Object method3 = map3.get(-131541546);
                    if (method3 == null) {
                        Class cls4 = (Class) bp.a(24 - TextUtils.indexOf("", "", 0), (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 1623, (char) View.MeasureSpec.makeMeasureSpec(0, 0));
                        byte b15 = (byte) ($$b & 5);
                        byte b16 = (byte) (b15 - 1);
                        Object[] objArr7 = new Object[1];
                        am(b15, b16, b16, objArr7);
                        String str2 = (String) objArr7[0];
                        Class<?> cls5 = Integer.TYPE;
                        method3 = cls4.getMethod(str2, cls5, cls5);
                        map3.put(-131541546, method3);
                    }
                    iIntValue = (byte) (((byte) (((long) bArr3[((Integer) ((Method) method3).invoke(null, objArr6)).intValue()]) ^ 8685730852850169510L)) + ((int) (((long) f40582af) ^ 8685730852850169510L)));
                    j10 = 8685730852850169510L;
                } else {
                    j10 = 8685730852850169510L;
                    iIntValue = (short) (((short) (((long) f40584aj[i11 + ((int) (((long) f40583ah) ^ 8685730852850169510L))]) ^ 8685730852850169510L)) + ((int) (((long) f40582af) ^ 8685730852850169510L)));
                }
            }
            if (iIntValue > 0) {
                gyVar.f41841b = ((i11 + iIntValue) - 2) + ((int) (((long) f40583ah) ^ j10)) + i14;
                Object[] objArr8 = {gyVar, Integer.valueOf(i12), Integer.valueOf(f40586al), sb2};
                Map map4 = bp.f40694x;
                Object method4 = map4.get(-1555392445);
                if (method4 == null) {
                    Class cls6 = (Class) bp.a(TextUtils.getOffsetBefore("", 0) + 23, 1484 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), (char) ExpandableListView.getPackedPositionGroup(0L));
                    byte b17 = (byte) ($$b & 14);
                    byte b18 = (byte) (b17 - 2);
                    Object[] objArr9 = new Object[1];
                    am(b17, b18, b18, objArr9);
                    String str3 = (String) objArr9[0];
                    Class<?> cls7 = Integer.TYPE;
                    method4 = cls6.getMethod(str3, Object.class, cls7, cls7, Object.class);
                    map4.put(-1555392445, method4);
                }
                ((StringBuilder) ((Method) method4).invoke(null, objArr8)).append(gyVar.f41843e);
                gyVar.f41842d = gyVar.f41843e;
                byte[] bArr4 = f40585ak;
                if (bArr4 != null) {
                    int length2 = bArr4.length;
                    byte[] bArr5 = new byte[length2];
                    for (int i16 = 0; i16 < length2; i16++) {
                        bArr5[i16] = (byte) (((long) bArr4[i16]) ^ 8685730852850169510L);
                    }
                    bArr4 = bArr5;
                }
                boolean z10 = bArr4 != null;
                gyVar.f41840a = 1;
                while (gyVar.f41840a < iIntValue) {
                    if (z10) {
                        byte[] bArr6 = f40585ak;
                        int i17 = gyVar.f41841b;
                        gyVar.f41841b = i17 - 1;
                        gyVar.f41843e = (char) (gyVar.f41842d + (((byte) (((byte) (((long) bArr6[i17]) ^ 8685730852850169510L)) + s4)) ^ b10));
                    } else {
                        short[] sArr = f40584aj;
                        int i18 = gyVar.f41841b;
                        gyVar.f41841b = i18 - 1;
                        gyVar.f41843e = (char) (gyVar.f41842d + (((short) (((short) (((long) sArr[i18]) ^ 8685730852850169510L)) + s4)) ^ b10));
                    }
                    sb2.append(gyVar.f41843e);
                    gyVar.f41842d = gyVar.f41843e;
                    gyVar.f41840a++;
                }
            }
            objArr[0] = sb2.toString();
        } catch (Throwable th2) {
            Throwable cause = th2.getCause();
            if (cause == null) {
                throw th2;
            }
            throw cause;
        }
    }

    /* JADX WARN: Code duplicated, block: B:10:0x002c  */
    /* JADX WARN: Code duplicated, block: B:8:0x0024  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x002c -> B:11:0x0035). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x002c
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void am(short r7, int r8, byte r9, java.lang.Object[] r10) {
        /*
            int r8 = r8 * 3
            int r8 = 4 - r8
            int r9 = r9 * 3
            int r9 = 1 - r9
            int r7 = r7 * 2
            int r7 = r7 + 66
            byte[] r0 = com.facetec.sdk.bj.$$a
            byte[] r1 = new byte[r9]
            r2 = 0
            if (r0 != 0) goto L19
            r3 = r1
            r4 = r2
            r1 = r0
            r0 = r10
            r10 = r9
            goto L35
        L19:
            r3 = r2
        L1a:
            r6 = r9
            r9 = r7
            r7 = r6
            int r4 = r3 + 1
            byte r5 = (byte) r9
            r1[r3] = r5
            if (r4 != r7) goto L2c
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            r10[r2] = r7
            return
        L2c:
            r3 = r0[r8]
            r6 = r9
            r9 = r7
            r7 = r3
            r3 = r1
            r1 = r0
            r0 = r10
            r10 = r6
        L35:
            int r7 = -r7
            int r8 = r8 + 1
            int r7 = r7 + r10
            r10 = r0
            r0 = r1
            r1 = r3
            r3 = r4
            goto L1a
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facetec.sdk.bj.am(short, int, byte, java.lang.Object[]):void");
    }

    public static /* synthetic */ boolean d(bj bjVar) {
        bjVar.P = true;
        return true;
    }

    public static void init$0() {
        $$a = new byte[]{123, 94, GenerateAcResponseApdu.DAD_ICC_DYNAMIC_DATA_LENGTH, 33};
        $$b = 35;
    }

    public final void a() {
        if (this.V == null) {
            e(7);
            return;
        }
        ch.m(true, true);
        this.f40602k = true;
        o();
        this.V.b();
        if (this.Q) {
            this.V.b(true);
        }
        s();
        d(false);
        this.f40594c.d(false, true);
        this.f40598g.d(false, true);
        this.f40593b.d(true, true);
        this.f40593b.setVisibility(0);
        c cVar = this.f40601j;
        if (cVar == c.FRONT) {
            dd.bv_(this.f40614x, R.string.FaceTec_idscan_capture_id_front_instruction_message);
        } else if (cVar == c.BACK) {
            dd.bv_(this.f40614x, R.string.FaceTec_idscan_capture_id_back_instruction_message);
        }
    }

    @Override // android.app.Fragment
    public final void onAttach(Activity activity) {
        super.onAttach(activity);
        this.f40603l = (be) activity;
    }

    @Override // com.facetec.sdk.aq, android.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
    }

    @Override // android.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(R.layout.facetec_idscan_fragment, viewGroup, false);
    }

    @Override // android.app.Fragment
    public final void onDestroy() throws Throwable {
        super.onDestroy();
        j();
        n();
        p();
        f();
    }

    @Override // android.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) throws Throwable {
        boolean z10;
        int iRound;
        int iRound2;
        int iRound3;
        boolean z11;
        super.onViewCreated(view, bundle);
        this.f40589ac = new Handler();
        this.f40607q = (RelativeLayout) view.findViewById(R.id.idTypeLayout);
        this.f40609s = (RelativeLayout) view.findViewById(R.id.cameraLayout);
        this.f40606p = (bk) view.findViewById(R.id.idCaptureFrameView);
        this.f40613w = (TextView) view.findViewById(R.id.reviewInstructionsText);
        this.f40614x = (TextView) view.findViewById(R.id.captureInstructionsText);
        this.f40596e = (TextView) view.findViewById(R.id.tapToFocusMessageText);
        this.f40615y = (ImageView) view.findViewById(R.id.reviewImageView);
        this.f40593b = (a) view.findViewById(R.id.takePictureButton);
        this.f40594c = (a) view.findViewById(R.id.retakePictureButton);
        this.f40598g = (a) view.findViewById(R.id.acceptPictureButton);
        this.B = (RelativeLayout) view.findViewById(R.id.shutterEffectContainer);
        this.D = (LinearLayout) view.findViewById(R.id.reviewButtonsContainer);
        this.I = (ImageView) view.findViewById(R.id.flashButton);
        this.f40595d = (RelativeLayout) view.findViewById(R.id.parentLayout);
        this.K = (RelativeLayout) view.findViewById(R.id.cameraContainer);
        this.f40610t = (RelativeLayout) view.findViewById(R.id.parentInterfaceLayout);
        this.f40587a = (ImageView) view.findViewById(R.id.cancelButton);
        this.f40597f = (a) view.findViewById(R.id.continueButton);
        this.f40611u = (TextView) view.findViewById(R.id.selectionHeader);
        this.f40612v = (ImageView) view.findViewById(R.id.selectionBrandingImage);
        this.M = (LinearLayout) view.findViewById(R.id.selectionButtonLayout);
        this.L = (RelativeLayout) view.findViewById(R.id.interfaceButtonLayout);
        this.N = (RelativeLayout) view.findViewById(R.id.idTypeLayoutBackground);
        this.J = (RelativeLayout) view.findViewById(R.id.idTypeLayoutContent);
        this.f40616z = (LinearLayout) view.findViewById(R.id.selectionBrandingImageLayout);
        this.f40608r = (RelativeLayout) view.findViewById(R.id.cameraTransitionView);
        this.C = (LinearLayout) view.findViewById(R.id.selectionDocumentImageLayout);
        this.A = (ImageView) view.findViewById(R.id.selectionDocumentImage);
        this.F = (RelativeLayout) view.findViewById(R.id.instructionsContainer);
        this.G = (LinearLayout) view.findViewById(R.id.selectionMainLayout);
        this.m = (bm) view.findViewById(R.id.focusAnimationView);
        this.f40600i = view.findViewById(R.id.reviewButtonSeparator);
        this.H = (RelativeLayout) view.findViewById(R.id.focusMessageContainer);
        this.E = (RelativeLayout) view.findViewById(R.id.croppedFrame);
        this.ab = (FrameLayout) view.findViewById(R.id.securingCameraFragmentContainer);
        this.R = (ImageView) view.findViewById(R.id.mainBrandingImageView);
        this.S = (RelativeLayout) view.findViewById(R.id.mainTransitionView);
        FaceTecIDScanCustomization faceTecIDScanCustomization = FaceTecSDK.f40106a.f40083f;
        int i10 = faceTecIDScanCustomization.selectionScreenBrandingImage;
        if (i10 == 0) {
            i10 = R.drawable.facetec_branding_logo_id_check;
        }
        int i11 = faceTecIDScanCustomization.selectionScreenDocumentImage;
        if (i11 == 0) {
            i11 = R.drawable.facetec_document;
        }
        int i12 = faceTecIDScanCustomization.activeTorchButtonImage;
        if (i12 == 0) {
            i12 = R.drawable.facetec_active_torch;
        }
        int i13 = faceTecIDScanCustomization.inactiveTorchButtonImage;
        if (i13 == 0) {
            i13 = R.drawable.facetec_inactive_torch;
        }
        faceTecIDScanCustomization.selectionScreenDocumentImage = i11;
        faceTecIDScanCustomization.selectionScreenBrandingImage = i10;
        faceTecIDScanCustomization.activeTorchButtonImage = i12;
        faceTecIDScanCustomization.inactiveTorchButtonImage = i13;
        boolean z12 = getArguments().getBoolean("overzoomedDocument");
        this.T = getArguments().getBoolean("isStandaloneIDScan");
        db.h(this.f40595d);
        db.h(this.S);
        this.f40611u.setTypeface(FaceTecSDK.f40106a.f40083f.headerFont);
        this.f40613w.setTypeface(FaceTecSDK.f40106a.f40083f.subtextFont);
        this.f40614x.setTypeface(FaceTecSDK.f40106a.f40083f.subtextFont);
        this.f40596e.setTypeface(FaceTecSDK.f40106a.f40083f.captureScreenFocusMessageFont);
        this.f40611u.setLineSpacing(0.0f, 1.1f);
        dd.bv_(this.f40611u, R.string.FaceTec_idscan_type_selection_header);
        dd.bv_(this.f40597f, R.string.FaceTec_action_continue);
        float fC = db.c() * db.d();
        this.R.getLayoutParams().height = Math.round(ay.e(18) * fC);
        ((ViewGroup.MarginLayoutParams) ((RelativeLayout.LayoutParams) this.R.getLayoutParams())).topMargin = db.e();
        Drawable drawable = ContextCompat.getDrawable(this.f40603l, db.e(getActivity()));
        Drawable drawable2 = ContextCompat.getDrawable(this.f40603l, db.a(getActivity()));
        if (this.T) {
            this.R.setImageDrawable(drawable);
            this.R.setVisibility(0);
        } else if (FaceTecSDK.f40106a.f40083f.showFaceMatchToIDBrandingImage) {
            this.R.setImageDrawable(drawable2);
            this.R.setVisibility(0);
        } else {
            this.R.setVisibility(8);
        }
        int iRound4 = Math.round(ay.e(78) * fC);
        int iAD = db.aD();
        int i14 = 1;
        if (!FaceTecSDK.f40106a.f40083f.showSelectionScreenBrandingImage || iAD == 0) {
            this.f40612v.setVisibility(8);
            iRound4 = 0;
            z10 = false;
            iRound = 0;
        } else {
            if (db.bj()) {
                iRound = Math.round((db.e() / 2.0f) + (ay.e(35) * fC));
            } else {
                iRound = 0;
            }
            this.f40612v.setImageDrawable(ContextCompat.getDrawable(this.f40603l, iAD));
            this.f40612v.setVisibility(0);
            z10 = true;
        }
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f40616z.getLayoutParams();
        ((ViewGroup.LayoutParams) layoutParams).height = iRound4;
        ((ViewGroup.MarginLayoutParams) layoutParams).topMargin = iRound;
        this.f40616z.setLayoutParams(layoutParams);
        int iAE = db.aE();
        if (z10 || !FaceTecSDK.f40106a.f40083f.showSelectionScreenDocumentImage || iAE == 0) {
            this.A.setVisibility(8);
            iRound2 = 0;
            iRound3 = 0;
            z11 = false;
        } else {
            iRound2 = Math.round(ay.e(78) * fC);
            iRound3 = Math.round(db.e());
            this.A.setImageDrawable(ContextCompat.getDrawable(this.f40603l, iAE));
            this.A.setVisibility(0);
            z11 = true;
        }
        LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) this.C.getLayoutParams();
        ((ViewGroup.LayoutParams) layoutParams2).height = iRound2;
        ((ViewGroup.MarginLayoutParams) layoutParams2).topMargin = z11 ? iRound3 : 0;
        ((ViewGroup.MarginLayoutParams) layoutParams2).bottomMargin = iRound3;
        this.C.setLayoutParams(layoutParams2);
        Drawable drawable3 = ContextCompat.getDrawable(this.f40603l, R.drawable.facetec_idscan_capture_instructions_background);
        db.bR_(this.f40603l, this.f40614x, drawable3, db.aB());
        db.bS_(this.f40603l, this.f40614x, drawable3, db.e(this.f40603l, db.aA()), (int) (ay.e(db.t()) * db.d()), (int) (ay.e(db.B()) * db.d()));
        this.f40614x.setBackground(drawable3);
        Drawable drawable4 = ContextCompat.getDrawable(this.f40603l, R.drawable.facetec_idscan_review_instructions_background);
        db.bR_(this.f40603l, this.f40613w, drawable4, db.ax());
        db.bS_(this.f40603l, this.f40613w, drawable4, db.e(this.f40603l, db.az()), (int) (ay.e(db.s()) * db.d()), (int) (ay.e(db.A()) * db.d()));
        this.f40613w.setBackground(drawable4);
        db.bK_(this.f40611u);
        db.bM_(this.f40614x);
        db.bL_(this.f40613w);
        db.bN_(this.f40596e);
        dd.bv_(this.f40596e, R.string.FaceTec_idscan_capture_tap_to_focus_message);
        db.j(this.N);
        this.f40608r.setBackgroundColor(db.b(this.f40603l));
        this.f40593b.a();
        this.f40594c.a();
        this.f40598g.a();
        this.f40597f.a();
        dd.bv_(this.f40593b, R.string.FaceTec_action_take_photo);
        dd.bv_(this.f40594c, R.string.FaceTec_action_retake_photo);
        dd.bv_(this.f40598g, R.string.FaceTec_action_accept_photo);
        if (db.bj()) {
            this.f40587a.setImageDrawable(ContextCompat.getDrawable(this.f40603l, db.aH()));
            this.f40587a.setOnClickListener(new View.OnClickListener() { // from class: com.facetec.sdk.d5
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) throws Throwable {
                    this.f41139p0.c(view2);
                }
            });
            this.f40587a.setOnTouchListener(new View.OnTouchListener() { // from class: com.facetec.sdk.e5
                @Override // android.view.View.OnTouchListener
                public final boolean onTouch(View view2, MotionEvent motionEvent) {
                    return this.f41456p0.aI_(view2, motionEvent);
                }
            });
        }
        int i15 = AnonymousClass1.f40618c[FaceTecSDK.f40106a.f40090n.f40073e.ordinal()];
        if (i15 != 2) {
            if (i15 == 3) {
                this.f40603l.f40518o.setVisibility(0);
            } else if (i15 == 4) {
            }
            this.f40587a.setVisibility(8);
        } else {
            RelativeLayout.LayoutParams layoutParams3 = (RelativeLayout.LayoutParams) this.f40587a.getLayoutParams();
            layoutParams3.removeRule(20);
            layoutParams3.addRule(21);
            this.f40587a.setLayoutParams(layoutParams3);
        }
        this.f40587a.getViewTreeObserver().addOnGlobalLayoutListener(this.f40592ag);
        g();
        if (!this.Z) {
            M();
            this.S.setAlpha(1.0f);
            this.S.setVisibility(0);
        }
        if (z12) {
            bk bkVar = this.f40606p;
            bkVar.f40629b = bk.a.SMALL_FOR_OVERZOOMED;
            bkVar.e();
            bkVar.f40628a.setStrokeWidth(Math.round(bkVar.f40630c));
            bkVar.f40632e = Math.round(ay.e(((Integer) db.c(new Object[0], 1487513195, -1487513153, (int) System.currentTimeMillis())).intValue()) * db.d());
            bkVar.f40635h = bkVar.f40631d;
            bkVar.a(true);
            bkVar.b();
        }
        Handler handler = new Handler(Looper.getMainLooper());
        this.X = handler;
        handler.postDelayed(new g5(this, i14), 600000L);
        b(new h5(this, i14));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void A() throws Throwable {
        be beVar = this.f40603l;
        t.b(getActivity(), this.V.f40309k, false, this.f40601j, beVar.f40510f ? beVar.m : cc.f40802c);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void B() {
        this.I.setImageResource(db.aF());
        this.f40610t.setVisibility(0);
        this.f40614x.setVisibility(0);
        int iE = db.e();
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.F.getLayoutParams();
        float f6 = iE;
        ((ViewGroup.MarginLayoutParams) layoutParams).topMargin = (int) ((this.f40606p.aA_().top - this.F.getHeight()) - f6);
        this.F.setLayoutParams(layoutParams);
        RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) this.H.getLayoutParams();
        ((ViewGroup.MarginLayoutParams) layoutParams2).topMargin = (int) (this.f40606p.aA_().bottom + f6);
        this.H.setLayoutParams(layoutParams2);
        RelativeLayout.LayoutParams layoutParams3 = (RelativeLayout.LayoutParams) this.E.getLayoutParams();
        ((ViewGroup.LayoutParams) layoutParams3).height = (int) (((double) this.E.getWidth()) / 1.59d);
        this.E.setLayoutParams(layoutParams3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void D() {
        float fE = ay.e(20) * db.c() * db.d();
        AnimatorSet animatorSet = new AnimatorSet();
        RelativeLayout relativeLayout = this.L;
        Property property = View.TRANSLATION_Y;
        animatorSet.playTogether(ObjectAnimator.ofFloat(relativeLayout, (Property<RelativeLayout, Float>) property, fE), ObjectAnimator.ofFloat(this.F, (Property<RelativeLayout, Float>) property, -fE));
        animatorSet.setDuration(500L);
        animatorSet.start();
        AnimatorSet animatorSet2 = new AnimatorSet();
        RelativeLayout relativeLayout2 = this.L;
        Property property2 = View.ALPHA;
        animatorSet2.playTogether(ObjectAnimator.ofFloat(relativeLayout2, (Property<RelativeLayout, Float>) property2, 0.0f), ObjectAnimator.ofFloat(this.F, (Property<RelativeLayout, Float>) property2, 0.0f), ObjectAnimator.ofFloat(this.f40596e, (Property<TextView, Float>) property2, 0.0f), ObjectAnimator.ofFloat(this.I, (Property<ImageView, Float>) property2, 0.0f), ObjectAnimator.ofFloat(this.f40587a, (Property<ImageView, Float>) property2, 0.0f), ObjectAnimator.ofFloat(this.R, (Property<ImageView, Float>) property2, 0.0f), ObjectAnimator.ofFloat(this.S, (Property<RelativeLayout, Float>) property2, 0.0f));
        animatorSet2.setDuration(500L);
        animatorSet2.start();
        ImageView imageView = this.f40603l.f40518o;
        if (imageView != null) {
            imageView.animate().alpha(0.0f).setDuration(500L).start();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void E() {
        this.f40593b.d(true, true);
        this.I.setEnabled(true);
        this.f40587a.setEnabled(true);
        this.f40602k = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void F() throws Throwable {
        if (this.f40599h == bq.BACK) {
            this.f40601j = c.BACK;
            dd.bv_(this.f40614x, R.string.FaceTec_idscan_capture_id_back_instruction_message);
        } else {
            this.f40601j = c.FRONT;
            dd.bv_(this.f40614x, R.string.FaceTec_idscan_capture_id_front_instruction_message);
        }
        this.f40608r.setAlpha(1.0f);
        this.J.setVisibility(8);
        int i10 = 4;
        this.f40607q.setVisibility(4);
        this.f40609s.setVisibility(0);
        this.f40610t.setVisibility(0);
        d(false);
        al alVar = this.V;
        int i11 = 3;
        if (alVar == null) {
            e(3);
            return;
        }
        alVar.b();
        o();
        ch.m(this.f40605o, false);
        this.f40589ac.postDelayed(new i2(this, i11), 800L);
        m();
        k();
        this.S.animate().alpha(0.0f).setDuration(500L).setStartDelay(0L).setInterpolator(new DecelerateInterpolator()).setListener(null).withEndAction(new l2(this, i10)).start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void G() throws Throwable {
        c(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void H() {
        al alVar = this.V;
        if (alVar == null) {
            return;
        }
        alVar.e(new b5(this, 0));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void I() {
        RelativeLayout relativeLayout = this.f40608r;
        if (relativeLayout == null) {
            return;
        }
        relativeLayout.animate().alpha(0.0f).setDuration(300L).setInterpolator(new DecelerateInterpolator()).setListener(null).start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void J() {
        cz czVar = this.f40588aa;
        if (czVar != null) {
            czVar.f41085c = true;
            czVar.d();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void K() throws Throwable {
        be beVar = this.f40603l;
        if (beVar != null) {
            beVar.B();
        }
        if (!this.Z) {
            i();
            return;
        }
        int i10 = 1;
        boolean z10 = !this.U;
        cz czVar = new cz();
        this.f40588aa = czVar;
        czVar.f41086d = (cz.e) getActivity();
        getChildFragmentManager().beginTransaction().replace(R.id.securingCameraFragmentContainer, this.f40588aa).addToBackStack(null).commitAllowingStateLoss();
        final int i11 = 0;
        this.ab.setVisibility(0);
        if (z10) {
            i11 = StatusCode.SUCCESS;
        } else {
            i10 = 500;
        }
        this.ab.animate().alpha(1.0f).setDuration(i10).setStartDelay(0L).setListener(null).withEndAction(new aq.b(new Runnable() { // from class: com.facetec.sdk.j5
            @Override // java.lang.Runnable
            public final void run() {
                this.f41894p0.c(i11);
            }
        }));
    }

    public static bj c(boolean z10, boolean z11) {
        bj bjVar = new bj();
        Bundle bundle = new Bundle();
        bundle.putBoolean("overzoomedDocument", z10);
        bundle.putBoolean("isStandaloneIDScan", z11);
        bjVar.setArguments(bundle);
        return bjVar;
    }

    private void i() throws Throwable {
        final boolean z10 = this.f40603l.f40521r == FaceTecIDScanNextStep.SELECTION_SCREEN && this.f40601j != c.BACK && this.f40599h == null;
        if (getActivity() != null) {
            getActivity().runOnUiThread(new Runnable() { // from class: com.facetec.sdk.c5
                @Override // java.lang.Runnable
                public final void run() {
                    this.f40784p0.h(z10);
                }
            });
        }
        t.e(new Object[]{cu.ID_SCAN_START}, -590439926, 590439930, (int) System.currentTimeMillis());
    }

    private void k() {
        this.f40593b.c(new l1(this, 2));
        this.f40594c.c(new b1(this, 5));
        this.f40598g.c(new u2(this, 5));
        this.f40597f.c(new d1(this, 7));
        this.I.setOnClickListener(new View.OnClickListener() { // from class: com.facetec.sdk.l5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) throws Throwable {
                this.f42245p0.b(view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void l() throws Throwable {
        if (this.V == null) {
            e(8);
            return;
        }
        int i10 = 0;
        this.f40598g.d(false, true);
        this.f40594c.d(false, true);
        this.f40587a.setEnabled(false);
        this.Q = false;
        this.I.setImageResource(db.aF());
        this.I.setEnabled(false);
        p();
        this.f40594c.d(false, true);
        this.f40598g.d(false, true);
        this.f40593b.d(false, true);
        if (getActivity() != null) {
            getActivity().runOnUiThread(new h5(this, i10));
        }
        this.f40606p.b(new x1(this, 4));
        cx.b(new y1(this, 3));
    }

    private void m() {
        if (getActivity() == null) {
            return;
        }
        getActivity().runOnUiThread(new f1(this, 5));
    }

    private void n() {
        Timer timer = this.Y;
        if (timer != null) {
            timer.cancel();
            this.Y = null;
        }
        TimerTask timerTask = this.f40590ad;
        if (timerTask != null) {
            timerTask.cancel();
            this.f40590ad = null;
        }
    }

    private void o() {
        n();
        this.f40590ad = new cw(new b6(this, 2));
        Timer timer = new Timer();
        this.Y = timer;
        timer.scheduleAtFixedRate(this.f40590ad, 6000L, 6000L);
    }

    private void p() {
        Handler handler = this.X;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
            this.X = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public void y() throws Throwable {
        this.f40603l.a(FaceTecIDScanStatus.TIMED_OUT);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public void r() throws Throwable {
        cc ccVar = this.f40603l.f40571d;
        if (ccVar == null) {
            return;
        }
        int i10 = 0;
        this.f40597f.d(false, true);
        dd.bv_(this.f40614x, R.string.FaceTec_idscan_capture_id_front_instruction_message);
        m();
        s();
        o();
        this.f40602k = true;
        boolean zC = dr.c(this.f40603l);
        bh bhVar = (bh) getActivity();
        try {
            ccVar.d(bhVar, zC, ((be) getActivity()).f40512h);
            getActivity().runOnUiThread(new g5(this, i10));
        } catch (NullPointerException unused) {
            e eVar = e.PHOENIX_HANDLER_UNEXPECTED_NULL;
            StringBuilder sb2 = new StringBuilder("phoenixHandler is null unexpectedly. Check Activity State Info to see if session has finished");
            sb2.append(t.c((Activity) bhVar));
            t.c(bhVar, eVar, sb2.toString());
        }
    }

    private void s() {
        p();
        Handler handler = new Handler();
        this.X = handler;
        handler.postDelayed(new h3(this, 5), 600000L);
    }

    private void t() {
        d(true);
        if (getActivity() == null) {
            return;
        }
        getActivity().runOnUiThread(new f5(this, 0));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void u() {
        this.f40593b.setAlpha(0.0f);
        this.f40593b.setVisibility(0);
        this.f40593b.animate().alpha(1.0f).setDuration(200L).setListener(null).start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void v() {
        this.f40607q.setVisibility(8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void w() {
        this.f40607q.animate().alpha(0.0f).setDuration(300L).setListener(null).withEndAction(new m2(this, 5)).start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void x() {
        this.f40598g.d(true, true);
        this.f40594c.d(true, true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void z() {
        this.f40603l.v();
    }

    public final ag d() {
        return this.V;
    }

    public final void e(boolean z10) {
        this.Z = z10;
    }

    public final void f() {
        ImageView imageView = this.f40587a;
        if (imageView != null) {
            imageView.getViewTreeObserver().removeOnGlobalLayoutListener(this.f40592ag);
        }
        this.f40592ag = null;
    }

    public final void j() throws Throwable {
        al alVar = this.V;
        if (alVar != null) {
            alVar.b(false);
            ImageView imageView = this.I;
            if (imageView != null) {
                imageView.setImageResource(db.aF());
            }
        }
        this.Q = false;
    }

    private void d(final boolean z10) {
        this.W = !z10;
        dd.bv_(this.f40613w, R.string.FaceTec_idscan_review_id_front_instruction_message);
        if (getActivity() == null) {
            return;
        }
        getActivity().runOnUiThread(new Runnable() { // from class: com.facetec.sdk.i5
            @Override // java.lang.Runnable
            public final void run() {
                this.f41876p0.g(z10);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void g(boolean z10) {
        int i10;
        int i11 = 0;
        if (z10) {
            i10 = 4;
        } else {
            this.f40596e.animate().alpha(1.0f).setDuration(100L);
            this.R.animate().alpha(1.0f).setDuration(100L);
            i10 = 0;
            i11 = 4;
        }
        this.D.setVisibility(i11);
        this.f40615y.setVisibility(i11);
        this.f40613w.setVisibility(i11);
        this.I.setVisibility(i10);
        if (this.f40605o) {
            this.f40593b.setVisibility(i10);
        } else {
            this.f40593b.setVisibility(4);
        }
        this.f40614x.setVisibility(i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public void R() throws Throwable {
        al alVar = this.V;
        if (alVar != null) {
            alVar.E_(false, this.K);
        }
    }

    public final void b(boolean z10) {
        this.U = z10;
    }

    public final void e() {
        this.ab.animate().alpha(0.0f).setDuration(500L).withEndAction(new aq.b(new r1(this, 4))).start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void e(View view) {
        view.setEnabled(true);
        this.f40593b.d(true, true);
    }

    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final void M() throws Throwable {
        int i10 = 1;
        try {
            this.V = (al) ag.q_(this.K, this.f40603l, true);
        } catch (am e5) {
            k.c(e5);
            be beVar = this.f40603l;
            e eVar = e.CAMERA_ERROR;
            StringBuilder sb2 = new StringBuilder("IDScanCameraSetupError with message: ");
            sb2.append(e5.getMessage());
            t.d(beVar, e5, eVar, sb2.toString(), false);
            be beVar2 = this.f40603l;
            beVar2.e(beVar2.f40519p.getStatus(), FaceTecIDScanStatus.CAMERA_ERROR);
        }
        this.V.e(new aq.b(new d2(this, i10)));
        this.K.setOnTouchListener(new h0(this, i10));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void h(boolean z10) {
        d(false);
        int i10 = this.Z ? 0 : 500;
        this.f40609s.setVisibility(0);
        this.f40607q.setVisibility(0);
        float fE = ay.e(20) * db.c() * db.d();
        if (z10) {
            this.G.setTranslationY(-fE);
            this.M.setTranslationY(fE);
            long j10 = i10;
            this.G.animate().alpha(1.0f).translationY(0.0f).setDuration(500L).setStartDelay(j10).setInterpolator(new DecelerateInterpolator()).setListener(null).start();
            this.M.animate().alpha(1.0f).translationY(0.0f).setDuration(500L).setStartDelay(j10).setInterpolator(new DecelerateInterpolator()).setListener(null).start();
        }
        k();
        if (FaceTecSDK.f40106a.f40090n.f40073e == FaceTecCancelButtonCustomization.ButtonLocation.CUSTOM) {
            this.f40603l.a(500, i10);
        } else if (FaceTecSDK.f40106a.f40090n.f40073e != FaceTecCancelButtonCustomization.ButtonLocation.DISABLED) {
            this.f40587a.animate().alpha(1.0f).setDuration(500L).setStartDelay(i10).setInterpolator(new DecelerateInterpolator()).setListener(null).start();
        }
        this.S.animate().alpha(0.0f).setDuration(500L).setStartDelay(i10).setInterpolator(new DecelerateInterpolator()).setListener(null).start();
    }

    private void e(int i10) throws Throwable {
        k.c(new Throwable("FaceTec SDK has experienced an unexpected camera error."));
        be beVar = this.f40603l;
        if (beVar == null) {
            return;
        }
        FaceTecSessionResult faceTecSessionResult = beVar.f40519p;
        if (faceTecSessionResult != null) {
            beVar.e(faceTecSessionResult.getStatus(), FaceTecIDScanStatus.CAMERA_ERROR);
            t.c(this.f40603l, e.CAMERA_ERROR, "IDScan: zoomCamera is null unexpectedly ".concat(String.valueOf(i10)));
            return;
        }
        beVar.e(FaceTecSessionStatus.UNKNOWN_INTERNAL_ERROR, FaceTecIDScanStatus.CAMERA_ERROR);
        be beVar2 = this.f40603l;
        e eVar = e.SESSION_RESULT_UNEXPECTED_NULL;
        StringBuilder sb2 = new StringBuilder("latestSessionResult is null unexpectedly. Check Activity State Info to see if session has finished");
        sb2.append(t.c((Activity) this.f40603l));
        t.c(beVar2, eVar, sb2.toString());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void f(final boolean z10) {
        this.f40598g.d(false, true);
        this.f40594c.d(false, true);
        this.f40593b.d(false, true);
        this.f40593b.setVisibility(4);
        this.B.setVisibility(0);
        this.f40589ac.postDelayed(new Runnable() { // from class: com.facetec.sdk.m5
            @Override // java.lang.Runnable
            public final void run() {
                this.f42402p0.j(z10);
            }
        }, 100L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void c(int i10) {
        long j10 = i10;
        b(new i3(this, 3), j10);
        cz czVar = this.f40588aa;
        Handler handler = czVar.f41083a;
        if (handler != null) {
            handler.removeCallbacks(czVar.f41087e);
        }
        Handler handler2 = new Handler();
        czVar.f41083a = handler2;
        handler2.postDelayed(czVar.f41087e, j10 + 1000);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void j(boolean z10) {
        this.B.setVisibility(4);
        if (z10) {
            return;
        }
        this.f40596e.animate().alpha(0.0f).setDuration(100L);
        this.R.animate().alpha(0.0f).setDuration(100L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(View view) throws Throwable {
        if (this.V == null) {
            e(6);
            return;
        }
        view.setEnabled(false);
        this.f40593b.d(false, true);
        view.postDelayed(new s0(this, view, 2), 1000L);
        boolean z10 = !this.Q;
        this.Q = z10;
        if (z10) {
            this.I.setImageResource(db.aG());
        } else {
            this.I.setImageResource(db.aF());
        }
        this.V.b(this.Q);
    }

    public final void c() {
        a aVar = this.f40593b;
        if (aVar != null) {
            aVar.setEnabled(false);
        }
        s();
        d(new b5(this, 1), 100L);
    }

    public final void g() {
        int iRound = Math.round((ay.e(db.x()) * db.d()) / 2.0f);
        this.f40609s.setPadding(iRound, iRound, iRound, iRound);
        this.f40615y.setPadding(iRound, iRound, iRound, iRound);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void c(View view) throws Throwable {
        this.f40587a.setEnabled(false);
        this.f40598g.d(false, true);
        this.f40594c.d(false, true);
        this.f40593b.d(false, true);
        this.f40603l.a(FaceTecIDScanStatus.USER_CANCELED);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(boolean z10) throws Throwable {
        if (!z10) {
            this.V.c(true);
            ch.n();
        }
        this.W = false;
        if (z10) {
            l();
        } else {
            t();
        }
    }

    private void c(final boolean z10) throws Throwable {
        if ((!bd.f40495d || this.V.f40242l) && this.V.h()) {
            n();
            s();
            this.f40602k = false;
            if (getActivity() == null) {
                return;
            }
            getActivity().runOnUiThread(new Runnable() { // from class: com.facetec.sdk.n5
                @Override // java.lang.Runnable
                public final void run() {
                    this.f42658p0.f(z10);
                }
            });
            al alVar = this.V;
            if (alVar == null) {
                e(9);
                return;
            }
            if (this.Q) {
                alVar.b(false);
            }
            if (bd.f40495d) {
                try {
                    Object[] objArr = new Object[1];
                    ai(ViewConfiguration.getPressedStateDuration() >> 16, (byte) ((-73) - (ViewConfiguration.getPressedStateDuration() >> 16)), (short) (57 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1))), 1999431463 - MotionEvent.axisFromString(""), (-51984463) - KeyEvent.keyCodeFromString(""), objArr);
                    Class<?> cls = Class.forName((String) objArr[0]);
                    Object[] objArr2 = new Object[1];
                    ai(-ExpandableListView.getPackedPositionChild(0L), (byte) ((ViewConfiguration.getJumpTapTimeout() >> 16) - 4), (short) ((Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) - 103), TextUtils.indexOf("", "") + 1999431479, (-51984470) - ExpandableListView.getPackedPositionGroup(0L), objArr2);
                    this.V.J_(new AnonymousClass3(((Long) cls.getMethod((String) objArr2[0], null).invoke(null, null)).longValue(), z10));
                    return;
                } catch (Throwable th2) {
                    Throwable cause = th2.getCause();
                    if (cause == null) {
                        throw th2;
                    }
                    throw cause;
                }
            }
            a(z10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(cf cfVar, ce ceVar) throws Throwable {
        int i10 = AnonymousClass1.f40617b[cfVar.ordinal()];
        int i11 = 3;
        if (i10 == 1) {
            this.O = false;
            if (AnonymousClass1.f40619d[ceVar.ordinal()] == 3 && this.f40591ae) {
                this.V.E_(true, this.K);
                return;
            }
            return;
        }
        if (i10 != 2) {
            if (i10 == 3 && this.f40602k && this.f40593b.getVisibility() != 0) {
                this.f40605o = true;
                b(new g1(this, i11));
                return;
            }
            return;
        }
        if (this.O) {
            return;
        }
        this.O = true;
        c(true);
    }
}

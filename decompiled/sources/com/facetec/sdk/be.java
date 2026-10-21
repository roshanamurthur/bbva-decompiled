package com.facetec.sdk;

import android.animation.Animator;
import android.animation.ArgbEvaluator;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.FragmentTransaction;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.media.AudioTrack;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Process;
import android.os.SystemClock;
import android.provider.Settings;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.Base64;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewOutlineProvider;
import android.view.ViewPropertyAnimator;
import android.view.Window;
import android.view.WindowManager;
import android.view.animation.LinearInterpolator;
import android.widget.ExpandableListView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import com.adobe.marketing.mobile.EventDataKeys;
import com.bbva.ethermobilesdk.devicechecker.root.service.RootService;
import com.bbva.glomohybrid.infoscreen.optionlist.handler.OptionListAnalyticsHandler;
import com.bbva.sl.ar.core.libmcrypt.exception.ErrorCodes;
import com.bbva.tohu.android.product.valkyria.sdk.payments.paywave.Constants;
import com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper;
import com.mastercard.sonic.StatusCode;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Map;
import java.util.Objects;
import java.util.Timer;
import java.util.TimerTask;
import java.util.UUID;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes9.dex */
abstract class be extends bh implements ActivityCompat.OnRequestPermissionsResultCallback, cz.e {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static final byte[] $$d = null;
    private static final int $$e = 0;
    private static final byte[] $$g = null;
    private static final int $$h = 0;
    private static int $10;
    private static int $11;
    private static char[] aM;
    private static int aO;
    private static char aP;
    private static int aQ;
    private volatile byte[] A;
    private volatile com.facetec.sdk.c B;
    private volatile byte[][] D;
    private bt T;
    private dr U;
    private ag W;
    private String X;
    private View Y;
    private ImageView aA;
    private ValueAnimator aC;
    private Integer aD;
    private cr aF;
    private Integer aG;
    private Integer aL;

    /* JADX INFO: renamed from: ac, reason: collision with root package name */
    private int f40497ac;

    /* JADX INFO: renamed from: ad, reason: collision with root package name */
    private RelativeLayout f40498ad;

    /* JADX INFO: renamed from: ae, reason: collision with root package name */
    private RelativeLayout f40499ae;

    /* JADX INFO: renamed from: af, reason: collision with root package name */
    private RelativeLayout f40500af;

    /* JADX INFO: renamed from: ag, reason: collision with root package name */
    private RelativeLayout f40501ag;

    /* JADX INFO: renamed from: ah, reason: collision with root package name */
    private RelativeLayout f40502ah;

    /* JADX INFO: renamed from: ai, reason: collision with root package name */
    private RelativeLayout f40503ai;

    /* JADX INFO: renamed from: aj, reason: collision with root package name */
    private LinearLayout f40504aj;

    /* JADX INFO: renamed from: ak, reason: collision with root package name */
    private RelativeLayout f40505ak;

    /* JADX INFO: renamed from: al, reason: collision with root package name */
    private RelativeLayout f40506al;

    /* JADX INFO: renamed from: am, reason: collision with root package name */
    private View f40507am;
    private String aq;
    private FaceTecIDScanResult at;
    private Timer au;
    private TimerTask ax;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private volatile az f40509e;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    float f40511g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private volatile bo f40513i;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    n f40515k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    bj f40516l;
    String m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    float f40517n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    ImageView f40518o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    FaceTecSessionResult f40519p;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    protected boolean f40522s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    Bitmap f40523t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private volatile co f40524u;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private volatile bz f40526w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private volatile cn f40527x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    View f40528y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private volatile byte[][] f40529z;
    private boolean C = false;
    private boolean H = false;
    private boolean G = false;
    private boolean I = false;
    private boolean E = false;
    private boolean F = false;
    private boolean L = false;
    private boolean J = false;
    private boolean K = false;
    private boolean M = false;
    private boolean N = false;
    private boolean P = false;
    private boolean R = false;
    private boolean Q = false;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    boolean f40510f = false;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    String f40512h = "";

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    boolean f40514j = false;
    private boolean S = false;
    private boolean O = false;
    private boolean V = false;
    private boolean Z = false;

    /* JADX INFO: renamed from: aa, reason: collision with root package name */
    private boolean f40496aa = false;
    private boolean ab = false;

    /* JADX INFO: renamed from: an, reason: collision with root package name */
    private boolean f40508an = false;
    private boolean ar = false;
    private int ao = 0;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    FaceTecIDScanNextStep f40521r = FaceTecIDScanNextStep.SELECTION_SCREEN;
    private boolean ap = false;
    private JSONObject aw = null;
    private int av = 0;
    private boolean as = false;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    boolean f40520q = false;
    private co.c az = co.c.DEFAULT;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    c f40525v = c.NOT_STARTED;
    private boolean ay = false;
    private boolean aB = false;
    private final Object aE = new Object();
    private float aI = 0.0f;
    private boolean aH = false;
    private boolean aK = false;
    private boolean aJ = false;
    private final dr.a aN = new dr.a() { // from class: com.facetec.sdk.be.5
        @Override // com.facetec.sdk.dr.a
        public final void c() throws Throwable {
            be.this.G();
        }

        @Override // com.facetec.sdk.dr.a
        public final void d(dt dtVar, String str) throws Throwable {
            be.this.d(dtVar, str);
        }
    };

    /* JADX INFO: renamed from: com.facetec.sdk.be$3, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass3 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f40530a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        static final /* synthetic */ int[] f40531b;

        static {
            int[] iArr = new int[FaceTecSessionStatus.values().length];
            f40530a = iArr;
            try {
                iArr[FaceTecSessionStatus.SESSION_COMPLETED_SUCCESSFULLY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f40530a[FaceTecSessionStatus.TIMEOUT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f40530a[FaceTecSessionStatus.CONTEXT_SWITCH.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f40530a[FaceTecSessionStatus.REVERSE_PORTRAIT_NOT_ALLOWED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f40530a[FaceTecSessionStatus.LANDSCAPE_MODE_NOT_ALLOWED.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f40530a[FaceTecSessionStatus.NON_PRODUCTION_MODE_KEY_INVALID.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f40530a[FaceTecSessionStatus.USER_CANCELLED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f40530a[FaceTecSessionStatus.CAMERA_PERMISSION_DENIED.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f40530a[FaceTecSessionStatus.SESSION_UNSUCCESSFUL.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            int[] iArr2 = new int[FaceTecSDKStatus.values().length];
            f40531b = iArr2;
            try {
                iArr2[FaceTecSDKStatus.INVALID_DEVICE_KEY_IDENTIFIER.ordinal()] = 1;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f40531b[FaceTecSDKStatus.NETWORK_ISSUES.ordinal()] = 2;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f40531b[FaceTecSDKStatus.DEVICE_LOCKED_OUT.ordinal()] = 3;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f40531b[FaceTecSDKStatus.ENCRYPTION_KEY_INVALID.ordinal()] = 4;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f40531b[FaceTecSDKStatus.DEVICE_IN_LANDSCAPE_MODE.ordinal()] = 5;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f40531b[FaceTecSDKStatus.DEVICE_IN_REVERSE_PORTRAIT_MODE.ordinal()] = 6;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f40531b[FaceTecSDKStatus.DEVICE_NOT_SUPPORTED.ordinal()] = 7;
            } catch (NoSuchFieldError unused16) {
            }
        }
    }

    @FunctionalInterface
    public interface b {
        byte[] getIdScanBytes(String str);
    }

    public enum c {
        NOT_STARTED,
        PRE_SESSION_STARTED,
        FACESCAN_SESSION_STARTED
    }

    static {
        init$2();
        $10 = 0;
        $11 = 1;
        init$1();
        init$0();
        aO = 0;
        aQ = 1;
        aM = new char[]{25164, 25161, 25170, 25157, 25154, 25203, 25163, 25166, 25162, 25155, 25156, 25160, 25186, 25167, 25175, 25103, 25169, 25173, 25165, 25193, 25152, 25176, 25171, 25202, 25158};
        aP = (char) 22462;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(View view) {
        ImageView imageView;
        float f6;
        int i10 = aO + 89;
        aQ = i10 % 128;
        if (i10 % 2 == 0) {
            imageView = this.f40518o;
            f6 = 0.0f;
        } else {
            imageView = this.f40518o;
            f6 = 1.0f;
        }
        imageView.setAlpha(f6);
        onBackPressed();
        this.f40518o.setEnabled(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void aA() {
        int i10 = aO + 23;
        aQ = i10 % 128;
        int i11 = i10 % 2;
        V();
        int i12 = aO + 57;
        aQ = i12 % 128;
        int i13 = i12 % 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void aB() {
        int i10 = aQ + 125;
        aO = i10 % 128;
        int i11 = i10 % 2;
        e(true);
        int i12 = aO + 17;
        aQ = i12 % 128;
        int i13 = i12 % 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void aC() throws Throwable {
        b(new Object[]{this}, -434888470, 434888481, System.identityHashCode(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void aD() {
        int i10 = aQ + 73;
        aO = i10 % 128;
        if (i10 % 2 != 0) {
            getFragmentManager().beginTransaction().replace(this.f40497ac, this.f40524u, "Results").addToBackStack("zoom").commitAllowingStateLoss();
            int i11 = 7 / 0;
        } else {
            getFragmentManager().beginTransaction().replace(this.f40497ac, this.f40524u, "Results").addToBackStack("zoom").commitAllowingStateLoss();
        }
        int i12 = aQ + 97;
        aO = i12 % 128;
        if (i12 % 2 != 0) {
            int i13 = 54 / 0;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void aE() {
        int i10 = aO + 119;
        aQ = i10 % 128;
        int i11 = i10 % 2;
        e(this.f40519p.getStatus(), FaceTecIDScanStatus.USER_CANCELED);
        int i12 = aQ + 79;
        aO = i12 % 128;
        int i13 = i12 % 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void aF() {
        int i10 = aQ + 37;
        aO = i10 % 128;
        int i11 = i10 % 2;
        K();
        int i12 = aQ + 57;
        aO = i12 % 128;
        if (i12 % 2 != 0) {
            int i13 = 67 / 0;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void aG() {
        int i10 = aO + 85;
        aQ = i10 % 128;
        int i11 = i10 % 2;
        O();
        if (i11 == 0) {
            throw null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void aH() {
        int i10 = aQ + 67;
        aO = i10 % 128;
        int i11 = i10 % 2;
        V();
        int i12 = aO + 29;
        aQ = i12 % 128;
        if (i12 % 2 == 0) {
            throw null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void aI() {
        int i10 = aQ + 29;
        aO = i10 % 128;
        if (i10 % 2 != 0) {
            E();
            throw null;
        }
        if (E()) {
            return;
        }
        this.Y.animate().alpha(1.0f).setDuration(800L).setListener(null).withEndAction(new b3(this, 1)).start();
        if (!this.f40510f) {
            int i11 = aQ + 101;
            aO = i11 % 128;
            a(i11 % 2 != 0 ? 8972 : StatusCode.SUCCESS, 0);
            int i12 = aQ + 1;
            aO = i12 % 128;
            int i13 = i12 % 2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void aJ() {
        int i10 = aO + 43;
        aQ = i10 % 128;
        int i11 = i10 % 2;
        ImageView imageView = this.f40518o;
        if (imageView != null) {
            imageView.setEnabled(true);
        }
        int i12 = aQ + 93;
        aO = i12 % 128;
        if (i12 % 2 != 0) {
            throw null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void aK() {
        int i10 = aO + 29;
        aQ = i10 % 128;
        int i11 = i10 % 2;
        this.f40499ae.animate().alpha(0.0f).setDuration(300L).setListener(null).start();
        int i12 = aO + 63;
        aQ = i12 % 128;
        int i13 = i12 % 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void aL() throws Throwable {
        int i10 = aO + 55;
        aQ = i10 % 128;
        int i11 = i10 % 2;
        if (e() == bh.b.GRANTED) {
            int i12 = aQ + 21;
            aO = i12 % 128;
            if (i12 % 2 != 0) {
                throw null;
            }
            if (this.f40510f) {
                return;
            }
            int i13 = 0;
            this.f40500af.setVisibility(0);
            this.f40500af.setAlpha(1.0f);
            if (this.aJ) {
                ag agVar = this.W;
                if (agVar != null) {
                    agVar.e(new k4(this, i13));
                    return;
                }
                int i14 = aO + 83;
                aQ = i14 % 128;
                if (i14 % 2 == 0) {
                    b(new Object[]{this, 4}, -749463482, 749463503, 4);
                } else {
                    b(new Object[]{this, 3}, -749463482, 749463503, 3);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void aM() {
        int i10 = aO + 63;
        int i11 = i10 % 128;
        aQ = i11;
        int i12 = i10 % 2;
        ValueAnimator valueAnimator = this.aC;
        if (valueAnimator != null) {
            int i13 = i11 + 93;
            aO = i13 % 128;
            int i14 = i13 % 2;
            valueAnimator.cancel();
            this.aC.removeAllUpdateListeners();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void aN() {
        int i10 = aO + 67;
        aQ = i10 % 128;
        int i11 = i10 % 2;
        this.ay = false;
        this.aH = true;
        e(((Float) b(new Object[]{this}, -1525704666, 1525704685, System.identityHashCode(this))).floatValue(), this.aF.e(), 0);
        S();
        int i12 = aO + 71;
        aQ = i12 % 128;
        int i13 = i12 % 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void aO() throws Throwable {
        b(new Object[]{this}, 649746145, -649746128, System.identityHashCode(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void aP() {
        if (FaceTecSDK.f40106a.f40090n.f40073e == FaceTecCancelButtonCustomization.ButtonLocation.CUSTOM && FaceTecSDK.f40106a.f40090n.f40072a != null) {
            int iAH = db.aH();
            ImageView imageView = this.f40518o;
            if (imageView != null && iAH != 0) {
                int i10 = aQ + 67;
                aO = i10 % 128;
                if (i10 % 2 != 0) {
                    imageView.setImageDrawable(ContextCompat.getDrawable(this, iAH));
                    throw null;
                }
                imageView.setImageDrawable(ContextCompat.getDrawable(this, iAH));
            }
        }
        int iAC = db.aC();
        if (!(!FaceTecSDK.f40106a.f40085h.showBrandingImage)) {
            int i11 = aQ;
            int i12 = i11 + 81;
            aO = i12 % 128;
            if (i12 % 2 != 0) {
                throw null;
            }
            if (iAC != 0) {
                int i13 = i11 + 101;
                aO = i13 % 128;
                int i14 = i13 % 2;
                this.aA.setImageDrawable(ContextCompat.getDrawable(this, iAC));
            }
        }
        this.f40499ae.setBackground(db.bD_(this));
        ValueAnimator valueAnimatorOfObject = ValueAnimator.ofObject(new ArgbEvaluator(), this.aD, Integer.valueOf(db.e(this, db.K())));
        valueAnimatorOfObject.setDuration(1000L);
        valueAnimatorOfObject.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.facetec.sdk.e4
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                this.f41455a.au_(valueAnimator);
            }
        });
        valueAnimatorOfObject.start();
        ValueAnimator valueAnimatorOfObject2 = ValueAnimator.ofObject(new ArgbEvaluator(), this.aG, Integer.valueOf(db.e(this, ((Integer) db.c(new Object[0], -754104162, 754104165, (int) System.currentTimeMillis())).intValue())));
        valueAnimatorOfObject2.setDuration(1000L);
        valueAnimatorOfObject2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.facetec.sdk.f4
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) throws Throwable {
                this.f41536a.at_(valueAnimator);
            }
        });
        valueAnimatorOfObject2.start();
        final GradientDrawable gradientDrawable = (GradientDrawable) this.f40501ag.getBackground();
        final int iE = (int) (ay.e(db.g()) * db.d());
        ValueAnimator valueAnimatorOfObject3 = ValueAnimator.ofObject(new ArgbEvaluator(), this.aL, Integer.valueOf(db.f(this)));
        valueAnimatorOfObject3.setDuration(1000L);
        valueAnimatorOfObject3.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.facetec.sdk.g4
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                this.f41736a.as_(gradientDrawable, iE, valueAnimator);
            }
        });
        valueAnimatorOfObject3.start();
        if (this.f40513i != null) {
            this.f40513i.j();
        }
        if (this.f40527x != null) {
            int i15 = aO + 57;
            aQ = i15 % 128;
            if (i15 % 2 != 0) {
                this.f40527x.j();
            } else {
                this.f40527x.j();
                throw null;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:23:0x01c7  */
    /* JADX WARN: Code duplicated, block: B:26:0x0244  */
    /* JADX WARN: Code duplicated, block: B:27:0x0245 A[Catch: all -> 0x01c4, TryCatch #0 {all -> 0x01c4, blocks: (B:11:0x0104, B:15:0x0162, B:19:0x01ba, B:37:0x0367, B:41:0x03c3, B:45:0x0421, B:44:0x03e8, B:40:0x0382, B:48:0x0430, B:52:0x048f, B:56:0x04e7, B:55:0x04b4, B:51:0x044b, B:18:0x0187, B:14:0x0122, B:24:0x021d, B:28:0x0289, B:27:0x0245), top: B:68:0x007d }] */
    public /* synthetic */ void aQ() throws Throwable {
        Map map;
        Object method;
        Object[] objArr;
        int i10 = aO + 101;
        aQ = i10 % 128;
        int i11 = i10 % 2;
        ch.b();
        ch.a(new Object[0], 1585286870, -1585286869, (int) System.currentTimeMillis());
        ch.C(d.a());
        int i12 = aO + 113;
        aQ = i12 % 128;
        int i13 = i12 % 2;
        try {
            Class cls = (Class) bp.a((ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 23, (ViewConfiguration.getKeyRepeatDelay() >> 16) + 388, (char) (ViewConfiguration.getKeyRepeatDelay() >> 16));
            byte[] bArr = $$a;
            byte length = (byte) bArr.length;
            byte b10 = (byte) (length - 4);
            Object[] objArr2 = new Object[1];
            aX(length, b10, (byte) (b10 - 1), objArr2);
            long j10 = cls.getField((String) objArr2[0]).getLong(null);
            try {
                if (j10 != -1) {
                    long j11 = j10 + 1920;
                    Object[] objArr3 = new Object[1];
                    aY((byte) (ImageFormat.getBitsPerPixel(0) + 65), "\u0017\n\u0002\u0017\u0006\f\u0000\u0012\f\u0007\u0012\u0014\u0016\u0001\u000f\f\u0002\n\u0011\b\u0003\t", (ViewConfiguration.getFadingEdgeLength() >> 16) + 22, objArr3);
                    Class<?> cls2 = Class.forName((String) objArr3[0]);
                    Object[] objArr4 = new Object[1];
                    aY((byte) ((ViewConfiguration.getKeyRepeatTimeout() >> 16) + 89), "\r\u000f\u0015\u000f\u0000\f\u0000\b\u000f\u0000\u0013\u0012\n\u0001㙘", 15 - Color.red(0), objArr4);
                    if (j11 >= ((Long) cls2.getDeclaredMethod((String) objArr4[0], new Class[0]).invoke(null, new Object[0])).longValue()) {
                        Class cls3 = (Class) bp.a(22 - TextUtils.lastIndexOf("", '0'), 388 - Color.green(0), (char) (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)));
                        byte b11 = (byte) ($$b & 3);
                        byte b12 = (byte) (b11 - 1);
                        Object[] objArr5 = new Object[1];
                        aX(b11, b12, (byte) (b12 - 1), objArr5);
                        Object obj = cls3.getField((String) objArr5[0]).get(null);
                        Object[] objArr6 = {189317247, 0};
                        Map map2 = bp.f40694x;
                        Object method2 = map2.get(1463901671);
                        if (method2 == null) {
                            Class cls4 = (Class) bp.a(23 - TextUtils.indexOf("", "", 0, 0), 388 - (ViewConfiguration.getDoubleTapTimeout() >> 16), (char) (ViewConfiguration.getFadingEdgeLength() >> 16));
                            byte length2 = (byte) bArr.length;
                            byte b13 = (byte) (length2 - 4);
                            Object[] objArr7 = new Object[1];
                            aX(length2, b13, (byte) (b13 - 1), objArr7);
                            String str = (String) objArr7[0];
                            Class<?> cls5 = Integer.TYPE;
                            method2 = cls4.getMethod(str, cls5, cls5);
                            map2.put(1463901671, method2);
                        }
                        Object[] objArr8 = {obj, Integer.valueOf(((Integer) ((Method) method2).invoke(null, objArr6)).intValue())};
                        Object method3 = map2.get(-2142901683);
                        if (method3 == null) {
                            method3 = ((Class) bp.a(24 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), View.resolveSizeAndState(0, 0, 0) + 1836, (char) (TextUtils.indexOf((CharSequence) "", '0', 0) + 1))).getMethod("a", Object[].class, Integer.TYPE);
                            map2.put(-2142901683, method3);
                        }
                        objArr = (Object[]) ((Method) method3).invoke(null, objArr8);
                    } else {
                        Object[] objArr9 = new Object[1];
                        aY((byte) (View.MeasureSpec.getSize(0) + 37), "\u0005\u0015\n\u0018\u0010\u0013\u0017\n\u0014\u0013\u0018\u0016\u0007\u0016\u000f\u0005", 16 - (Process.myTid() >> 22), objArr9);
                        Class<?> cls6 = Class.forName((String) objArr9[0]);
                        Object[] objArr10 = new Object[1];
                        aY((byte) (43 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1))), "\r\u0001\u000b\u000e\u0010\f\u0010\u0016\u000f\u0018\u0003\u0002\u0011\f\u0000\r", 16 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), objArr10);
                        Object[] objArr11 = {Integer.valueOf(((Integer) cls6.getMethod((String) objArr10[0], Object.class).invoke(null, this)).intValue()), 0, 189317247};
                        map = bp.f40694x;
                        method = map.get(388357536);
                        if (method != null) {
                            Class cls7 = (Class) bp.a(View.MeasureSpec.getMode(0) + 23, TextUtils.getTrimmedLength("") + 388, (char) (AndroidCharacter.getMirror('0') - '0'));
                            byte b14 = (byte) 2;
                            byte b15 = (byte) (b14 - 2);
                            Object[] objArr12 = new Object[1];
                            aX(b14, b15, (byte) (b15 - 1), objArr12);
                            String str2 = (String) objArr12[0];
                            Class<?> cls8 = Integer.TYPE;
                            method = cls7.getMethod(str2, cls8, cls8, cls8);
                            map.put(388357536, method);
                        }
                        objArr = (Object[]) ((Method) method).invoke(null, objArr11);
                        Class cls9 = (Class) bp.a(24 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), ImageFormat.getBitsPerPixel(0) + 389, (char) Drawable.resolveOpacity(0, 0));
                        byte b16 = (byte) ($$b & 3);
                        byte b17 = (byte) (b16 - 1);
                        Object[] objArr13 = new Object[1];
                        aX(b16, b17, (byte) (b17 - 1), objArr13);
                        cls9.getField((String) objArr13[0]).set(null, objArr);
                        try {
                            Object[] objArr14 = new Object[1];
                            aY((byte) ((AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 64), "\u0017\n\u0002\u0017\u0006\f\u0000\u0012\f\u0007\u0012\u0014\u0016\u0001\u000f\f\u0002\n\u0011\b\u0003\t", (-16777194) - Color.rgb(0, 0, 0), objArr14);
                            Class<?> cls10 = Class.forName((String) objArr14[0]);
                            Object[] objArr15 = new Object[1];
                            aY((byte) (AndroidCharacter.getMirror('0') + RootService.CLOSE_BRACKET), "\r\u000f\u0015\u000f\u0000\f\u0000\b\u000f\u0000\u0013\u0012\n\u0001㙘", 15 - Drawable.resolveOpacity(0, 0), objArr15);
                            Long lValueOf = Long.valueOf(((Long) cls10.getDeclaredMethod((String) objArr15[0], new Class[0]).invoke(null, new Object[0])).longValue());
                            Class cls11 = (Class) bp.a(22 - ExpandableListView.getPackedPositionChild(0L), 388 - (ViewConfiguration.getScrollDefaultDelay() >> 16), (char) ExpandableListView.getPackedPositionType(0L));
                            byte length3 = (byte) bArr.length;
                            byte b18 = (byte) (length3 - 4);
                            Object[] objArr16 = new Object[1];
                            aX(length3, b18, (byte) (b18 - 1), objArr16);
                            cls11.getField((String) objArr16[0]).set(null, lValueOf);
                        } catch (Exception unused) {
                            throw new RuntimeException();
                        }
                    }
                } else {
                    Object[] objArr17 = new Object[1];
                    aY((byte) (View.MeasureSpec.getSize(0) + 37), "\u0005\u0015\n\u0018\u0010\u0013\u0017\n\u0014\u0013\u0018\u0016\u0007\u0016\u000f\u0005", 16 - (Process.myTid() >> 22), objArr17);
                    Class<?> cls12 = Class.forName((String) objArr17[0]);
                    Object[] objArr18 = new Object[1];
                    aY((byte) (43 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1))), "\r\u0001\u000b\u000e\u0010\f\u0010\u0016\u000f\u0018\u0003\u0002\u0011\f\u0000\r", 16 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), objArr18);
                    Object[] objArr19 = {Integer.valueOf(((Integer) cls12.getMethod((String) objArr18[0], Object.class).invoke(null, this)).intValue()), 0, 189317247};
                    map = bp.f40694x;
                    method = map.get(388357536);
                    if (method != null) {
                        Class cls13 = (Class) bp.a(View.MeasureSpec.getMode(0) + 23, TextUtils.getTrimmedLength("") + 388, (char) (AndroidCharacter.getMirror('0') - '0'));
                        byte b19 = (byte) 2;
                        byte b110 = (byte) (b19 - 2);
                        Object[] objArr110 = new Object[1];
                        aX(b19, b110, (byte) (b110 - 1), objArr110);
                        String str3 = (String) objArr110[0];
                        Class<?> cls14 = Integer.TYPE;
                        method = cls13.getMethod(str3, cls14, cls14, cls14);
                        map.put(388357536, method);
                    }
                    objArr = (Object[]) ((Method) method).invoke(null, objArr19);
                    Class cls15 = (Class) bp.a(24 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), ImageFormat.getBitsPerPixel(0) + 389, (char) Drawable.resolveOpacity(0, 0));
                    byte b111 = (byte) ($$b & 3);
                    byte b112 = (byte) (b111 - 1);
                    Object[] objArr111 = new Object[1];
                    aX(b111, b112, (byte) (b112 - 1), objArr111);
                    cls15.getField((String) objArr111[0]).set(null, objArr);
                    Object[] objArr112 = new Object[1];
                    aY((byte) ((AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 64), "\u0017\n\u0002\u0017\u0006\f\u0000\u0012\f\u0007\u0012\u0014\u0016\u0001\u000f\f\u0002\n\u0011\b\u0003\t", (-16777194) - Color.rgb(0, 0, 0), objArr112);
                    Class<?> cls16 = Class.forName((String) objArr112[0]);
                    Object[] objArr113 = new Object[1];
                    aY((byte) (AndroidCharacter.getMirror('0') + RootService.CLOSE_BRACKET), "\r\u000f\u0015\u000f\u0000\f\u0000\b\u000f\u0000\u0013\u0012\n\u0001㙘", 15 - Drawable.resolveOpacity(0, 0), objArr113);
                    Long lValueOf2 = Long.valueOf(((Long) cls16.getDeclaredMethod((String) objArr113[0], new Class[0]).invoke(null, new Object[0])).longValue());
                    Class cls17 = (Class) bp.a(22 - ExpandableListView.getPackedPositionChild(0L), 388 - (ViewConfiguration.getScrollDefaultDelay() >> 16), (char) ExpandableListView.getPackedPositionType(0L));
                    byte length4 = (byte) bArr.length;
                    byte b113 = (byte) (length4 - 4);
                    Object[] objArr114 = new Object[1];
                    aX(length4, b113, (byte) (b113 - 1), objArr114);
                    cls17.getField((String) objArr114[0]).set(null, lValueOf2);
                }
                int i14 = ((int[]) objArr[1])[0];
                int i15 = ((int[]) objArr[0])[0];
                if (i15 != i14) {
                    ArrayList arrayList = new ArrayList();
                    arrayList.add((String) objArr[2]);
                    arrayList.add((String) objArr[3]);
                    arrayList.add((String) objArr[4]);
                    arrayList.add((String) objArr[5]);
                    arrayList.add((String) objArr[6]);
                    arrayList.add((String) objArr[7]);
                    arrayList.add((String) objArr[8]);
                    throw new RuntimeException(String.valueOf(i15));
                }
                int i16 = aO + 3;
                aQ = i16 % 128;
                if (i16 % 2 == 0) {
                    Object[] objArr20 = {Integer.valueOf(((int[]) objArr[7])[1]), 0};
                    Map map3 = bp.f40694x;
                    Object method4 = map3.get(1463901671);
                    if (method4 == null) {
                        Class cls18 = (Class) bp.a(23 - ExpandableListView.getPackedPositionType(0L), (ViewConfiguration.getFadingEdgeLength() >> 16) + 388, (char) (ExpandableListView.getPackedPositionChild(0L) + 1));
                        byte length5 = (byte) bArr.length;
                        byte b20 = (byte) (length5 - 4);
                        Object[] objArr21 = new Object[1];
                        aX(length5, b20, (byte) (b20 - 1), objArr21);
                        String str4 = (String) objArr21[0];
                        Class<?> cls19 = Integer.TYPE;
                        method4 = cls18.getMethod(str4, cls19, cls19);
                        map3.put(1463901671, method4);
                    }
                    Object[] objArr22 = {objArr, Integer.valueOf(((Integer) ((Method) method4).invoke(null, objArr20)).intValue())};
                    Object method5 = map3.get(-2142901683);
                    if (method5 == null) {
                        method5 = ((Class) bp.a((PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 24, (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 1835, (char) ((-1) - TextUtils.lastIndexOf("", '0', 0, 0)))).getMethod("a", Object[].class, Integer.TYPE);
                        map3.put(-2142901683, method5);
                    }
                    ((Method) method5).invoke(null, objArr22);
                    return;
                }
                Object[] objArr23 = {Integer.valueOf(((int[]) objArr[9])[0]), 0};
                Map map4 = bp.f40694x;
                Object method6 = map4.get(1463901671);
                if (method6 == null) {
                    Class cls20 = (Class) bp.a(24 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), 388 - (ViewConfiguration.getTapTimeout() >> 16), (char) (ViewConfiguration.getLongPressTimeout() >> 16));
                    byte length6 = (byte) bArr.length;
                    byte b21 = (byte) (length6 - 4);
                    Object[] objArr24 = new Object[1];
                    aX(length6, b21, (byte) (b21 - 1), objArr24);
                    String str5 = (String) objArr24[0];
                    Class<?> cls21 = Integer.TYPE;
                    method6 = cls20.getMethod(str5, cls21, cls21);
                    map4.put(1463901671, method6);
                }
                Object[] objArr25 = {objArr, Integer.valueOf(((Integer) ((Method) method6).invoke(null, objArr23)).intValue())};
                Object method7 = map4.get(-2142901683);
                if (method7 == null) {
                    method7 = ((Class) bp.a(24 - (ViewConfiguration.getWindowTouchSlop() >> 8), 1836 - TextUtils.getCapsMode("", 0, 0), (char) (Color.rgb(0, 0, 0) + 16777216))).getMethod("a", Object[].class, Integer.TYPE);
                    map4.put(-2142901683, method7);
                }
                ((Method) method7).invoke(null, objArr25);
            } catch (Throwable th2) {
                Throwable cause = th2.getCause();
                if (cause == null) {
                    throw th2;
                }
                throw cause;
            }
        } catch (Exception unused2) {
            throw new RuntimeException();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void aR() {
        int i10 = aO + 107;
        aQ = i10 % 128;
        int i11 = i10 % 2;
        d(0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void aS() {
        int i10 = aO + 111;
        aQ = i10 % 128;
        if (i10 % 2 == 0) {
            this.f40516l.c();
            throw null;
        }
        this.f40516l.c();
        int i11 = aO + 79;
        aQ = i11 % 128;
        if (i11 % 2 == 0) {
            throw null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void aT() {
        int i10 = aQ + 63;
        aO = i10 % 128;
        int i11 = i10 % 2;
        J();
        d(300);
        int i12 = aO + 43;
        aQ = i12 % 128;
        int i13 = i12 % 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void aU() {
        int i10 = aO + 23;
        aQ = i10 % 128;
        int i11 = i10 % 2;
        O();
        int i12 = aQ + 99;
        aO = i12 % 128;
        if (i12 % 2 != 0) {
            int i13 = 91 / 0;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void aV() {
        int i10 = aQ + 41;
        aO = i10 % 128;
        int i11 = i10 % 2;
        if (isFinishing()) {
            return;
        }
        int i12 = aO + 81;
        aQ = i12 % 128;
        int i13 = 1;
        if (i12 % 2 == 0) {
            int i14 = 38 / 0;
            if (!hasWindowFocus()) {
                return;
            }
        } else if (!hasWindowFocus()) {
            return;
        }
        if (this.f40516l == null) {
            return;
        }
        runOnUiThread(new x1(this, i13));
        int i15 = aO + 101;
        aQ = i15 % 128;
        if (i15 % 2 == 0) {
            throw null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void aW() {
        int i10 = aO + 13;
        aQ = i10 % 128;
        int i11 = i10 % 2;
        dn.b(this);
        int i12 = aO + 123;
        aQ = i12 % 128;
        if (i12 % 2 == 0) {
            int i13 = 77 / 0;
        }
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0028  */
    /* JADX WARN: Code duplicated, block: B:8:0x0020  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0028 -> B:11:0x0032). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0028
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void aX(byte r6, byte r7, int r8, java.lang.Object[] r9) {
        /*
            int r7 = r7 * 3
            int r7 = r7 + 1
            int r8 = r8 + 4
            byte[] r0 = com.facetec.sdk.be.$$a
            int r6 = r6 + 97
            byte[] r1 = new byte[r7]
            r2 = 0
            if (r0 != 0) goto L16
            r3 = r1
            r4 = r2
            r1 = r0
            r0 = r9
            r9 = r8
            r8 = r7
            goto L32
        L16:
            r3 = r2
        L17:
            byte r4 = (byte) r6
            int r8 = r8 + 1
            r1[r3] = r4
            int r3 = r3 + 1
            if (r3 != r7) goto L28
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L28:
            r4 = r0[r8]
            r5 = r8
            r8 = r7
            r7 = r4
            r4 = r3
            r3 = r1
            r1 = r0
            r0 = r9
            r9 = r5
        L32:
            int r6 = r6 + r7
            r7 = r8
            r8 = r9
            r9 = r0
            r0 = r1
            r1 = r3
            r3 = r4
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facetec.sdk.be.aX(byte, byte, int, java.lang.Object[]):void");
    }

    private static void aY(byte b10, String str, int i10, Object[] objArr) throws Throwable {
        char[] charArray;
        int i11;
        char c10;
        int i12 = $10 + 113;
        $11 = i12 % 128;
        if (i12 % 2 == 0) {
            throw null;
        }
        if (str != null) {
            charArray = str.toCharArray();
            int i13 = $11 + 55;
            $10 = i13 % 128;
            int i14 = i13 % 2;
        } else {
            charArray = str;
        }
        char[] cArr = charArray;
        gv gvVar = new gv();
        char[] cArr2 = aM;
        int i15 = -324767611;
        if (cArr2 != null) {
            int i16 = $11 + 43;
            $10 = i16 % 128;
            int i17 = i16 % 2;
            int length = cArr2.length;
            char[] cArr3 = new char[length];
            int i18 = 0;
            while (i18 < length) {
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr2[i18])};
                    Map map = bp.f40694x;
                    Object method = map.get(Integer.valueOf(i15));
                    if (method == null) {
                        Class cls = (Class) bp.a(Drawable.resolveOpacity(0, 0) + 24, (ViewConfiguration.getWindowTouchSlop() >> 8) + 1411, (char) (ViewConfiguration.getTapTimeout() >> 16));
                        byte b11 = (byte) 0;
                        byte b12 = b11;
                        Object[] objArr3 = new Object[1];
                        ba(b11, b12, b12, objArr3);
                        method = cls.getMethod((String) objArr3[0], Integer.TYPE);
                        map.put(-324767611, method);
                    }
                    cArr3[i18] = ((Character) ((Method) method).invoke(null, objArr2)).charValue();
                    i18++;
                    i15 = -324767611;
                } catch (Throwable th2) {
                    Throwable cause = th2.getCause();
                    if (cause == null) {
                        throw th2;
                    }
                    throw cause;
                }
            }
            cArr2 = cArr3;
        }
        Object[] objArr4 = {Integer.valueOf(aP)};
        Map map2 = bp.f40694x;
        Object method2 = map2.get(-324767611);
        char c11 = 6;
        if (method2 == null) {
            Class cls2 = (Class) bp.a(((Process.getThreadPriority(0) + 20) >> 6) + 24, View.MeasureSpec.getSize(0) + 1411, (char) (ViewConfiguration.getLongPressTimeout() >> 16));
            byte b13 = (byte) 0;
            byte b14 = b13;
            Object[] objArr5 = new Object[1];
            ba(b13, b14, b14, objArr5);
            method2 = cls2.getMethod((String) objArr5[0], Integer.TYPE);
            map2.put(-324767611, method2);
        }
        char cCharValue = ((Character) ((Method) method2).invoke(null, objArr4)).charValue();
        char[] cArr4 = new char[i10];
        if (i10 % 2 != 0) {
            int i19 = $10 + 99;
            $11 = i19 % 128;
            int i20 = i19 % 2;
            i11 = i10 - 1;
            cArr4[i11] = (char) (cArr[i11] - b10);
        } else {
            i11 = i10;
        }
        if (i11 > 1) {
            gvVar.f41832e = 0;
            int i21 = $10 + 111;
            $11 = i21 % 128;
            int i22 = i21 % 2;
            while (true) {
                int i23 = gvVar.f41832e;
                if (i23 >= i11) {
                    break;
                }
                char c12 = cArr[i23];
                gvVar.f41829b = c12;
                char c13 = cArr[i23 + 1];
                gvVar.f41831d = c13;
                if (c12 == c13) {
                    cArr4[i23] = (char) (c12 - b10);
                    cArr4[i23 + 1] = (char) (c13 - b10);
                    c10 = c11;
                } else {
                    Object[] objArr6 = new Object[13];
                    objArr6[12] = gvVar;
                    objArr6[11] = Integer.valueOf(cCharValue);
                    objArr6[10] = gvVar;
                    objArr6[9] = gvVar;
                    objArr6[8] = Integer.valueOf(cCharValue);
                    objArr6[7] = gvVar;
                    objArr6[c11] = gvVar;
                    objArr6[5] = Integer.valueOf(cCharValue);
                    objArr6[4] = gvVar;
                    objArr6[3] = gvVar;
                    objArr6[2] = Integer.valueOf(cCharValue);
                    objArr6[1] = gvVar;
                    objArr6[0] = gvVar;
                    Map map3 = bp.f40694x;
                    Object method3 = map3.get(-779085347);
                    if (method3 == null) {
                        Class cls3 = (Class) bp.a(View.MeasureSpec.makeMeasureSpec(0, 0) + 23, (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 718, (char) (1 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1))));
                        byte b15 = (byte) 0;
                        byte b16 = b15;
                        Object[] objArr7 = new Object[1];
                        ba(b15, b16, (byte) (b16 + 1), objArr7);
                        String str2 = (String) objArr7[0];
                        Class<?> cls4 = Integer.TYPE;
                        method3 = cls3.getMethod(str2, Object.class, Object.class, cls4, Object.class, Object.class, cls4, Object.class, Object.class, cls4, Object.class, Object.class, cls4, Object.class);
                        map3.put(-779085347, method3);
                    }
                    int iIntValue = ((Integer) ((Method) method3).invoke(null, objArr6)).intValue();
                    int i24 = gvVar.f41833g;
                    if (iIntValue == i24) {
                        Object[] objArr8 = {gvVar, gvVar, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), gvVar, gvVar, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), gvVar, Integer.valueOf(cCharValue), gvVar};
                        Object method4 = map3.get(531504056);
                        if (method4 != null) {
                            c10 = 6;
                        } else {
                            Class cls5 = (Class) bp.a(View.combineMeasuredStates(0, 0) + 24, 221 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), (char) Color.red(0));
                            Class<?> cls6 = Integer.TYPE;
                            c10 = 6;
                            method4 = cls5.getMethod("l", Object.class, Object.class, cls6, cls6, Object.class, Object.class, cls6, cls6, Object.class, cls6, Object.class);
                            map3.put(531504056, method4);
                        }
                        int iIntValue2 = ((Integer) ((Method) method4).invoke(null, objArr8)).intValue();
                        int i25 = (gvVar.f41828a * cCharValue) + gvVar.f41833g;
                        int i26 = gvVar.f41832e;
                        cArr4[i26] = cArr2[iIntValue2];
                        cArr4[i26 + 1] = cArr2[i25];
                    } else {
                        c10 = 6;
                        int i27 = gvVar.f41830c;
                        int i28 = gvVar.f41828a;
                        if (i27 == i28) {
                            int i29 = $11 + 67;
                            $10 = i29 % 128;
                            int i30 = i29 % 2;
                            int iA = androidx.activity.a.a(gvVar.f41834j, cCharValue, 1, cCharValue);
                            gvVar.f41834j = iA;
                            int iA2 = androidx.activity.a.a(i24, cCharValue, 1, cCharValue);
                            gvVar.f41833g = iA2;
                            int i31 = (i28 * cCharValue) + iA2;
                            int i32 = gvVar.f41832e;
                            cArr4[i32] = cArr2[(i27 * cCharValue) + iA];
                            cArr4[i32 + 1] = cArr2[i31];
                        } else {
                            int i33 = (i27 * cCharValue) + i24;
                            int i34 = (i28 * cCharValue) + gvVar.f41834j;
                            int i35 = gvVar.f41832e;
                            cArr4[i35] = cArr2[i33];
                            cArr4[i35 + 1] = cArr2[i34];
                        }
                    }
                }
                gvVar.f41832e += 2;
                c11 = c10;
            }
        }
        int i36 = 0;
        while (i36 < i10) {
            int i37 = $11 + 31;
            $10 = i37 % 128;
            if (i37 % 2 != 0) {
                cArr4[i36] = (char) (cArr4[i36] ^ 11164);
                i36 += 63;
            } else {
                cArr4[i36] = (char) (cArr4[i36] ^ 13722);
                i36++;
            }
        }
        objArr[0] = new String(cArr4);
    }

    /* JADX WARN: Code duplicated, block: B:10:0x002a  */
    /* JADX WARN: Code duplicated, block: B:8:0x0022  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x002a -> B:11:0x0030). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x002a
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void aZ(int r7, int r8, short r9, java.lang.Object[] r10) {
        /*
            int r8 = r8 * 21
            int r8 = 24 - r8
            int r9 = r9 * 2
            int r9 = 99 - r9
            int r7 = r7 * 21
            int r7 = r7 + 1
            byte[] r0 = com.facetec.sdk.be.$$d
            byte[] r1 = new byte[r7]
            r2 = 0
            if (r0 != 0) goto L18
            r3 = r9
            r4 = r2
            r9 = r8
            r8 = r7
            goto L30
        L18:
            r3 = r2
        L19:
            int r8 = r8 + 1
            int r4 = r3 + 1
            byte r5 = (byte) r9
            r1[r3] = r5
            if (r4 != r7) goto L2a
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            r10[r2] = r7
            return
        L2a:
            r3 = r0[r8]
            r6 = r8
            r8 = r7
            r7 = r9
            r9 = r6
        L30:
            int r7 = r7 + r3
            int r7 = r7 + 2
            r3 = r4
            r6 = r9
            r9 = r7
            r7 = r8
            r8 = r6
            goto L19
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facetec.sdk.be.aZ(int, int, short, java.lang.Object[]):void");
    }

    private void aa() {
        int i10 = aQ + 69;
        aO = i10 % 128;
        if (i10 % 2 != 0) {
            isFinishing();
            throw null;
        }
        if (!isFinishing()) {
            getFragmentManager().beginTransaction().remove(this.f40524u).commitAllowingStateLoss();
            this.f40524u = null;
        } else {
            int i11 = aQ + 79;
            aO = i11 % 128;
            int i12 = i11 % 2;
        }
    }

    private synchronized void ab() throws am {
        if (FaceTecSessionActivity.f40124e != null) {
            Z();
            return;
        }
        boolean z10 = this.f40510f;
        if (!z10) {
            t.c(this, e.UNEXPECTED_EARLY_EXIT_FACESCAN, "Error when setting up primary fragment");
            e(FaceTecSessionStatus.UNKNOWN_INTERNAL_ERROR, FaceTecIDScanStatus.UNSUCCESS);
            return;
        }
        int i10 = aQ + 41;
        aO = i10 % 128;
        this.f40516l = i10 % 2 != 0 ? bj.c(false, z10) : bj.c(false, z10);
        int i11 = aQ + 111;
        aO = i11 % 128;
        int i12 = i11 % 2;
    }

    private void ac() throws Throwable {
        b(new Object[]{this}, 246365851, -246365851, System.identityHashCode(this));
    }

    private void ad() {
        int i10 = aQ + 97;
        aO = i10 % 128;
        int i11 = i10 % 2;
        this.f40508an = true;
        this.m = UUID.randomUUID().toString();
        this.f40571d.b(this.f40516l.f40604n);
        getFragmentManager().beginTransaction().replace(this.f40497ac, this.f40516l, "IDScan").commitAllowingStateLoss();
        int i12 = aO + 35;
        aQ = i12 % 128;
        if (i12 % 2 == 0) {
            int i13 = 8 / 0;
        }
    }

    private void ae() {
        ViewPropertyAnimator viewPropertyAnimatorAnimate;
        float f6;
        int i10 = aO + 113;
        int i11 = i10 % 128;
        aQ = i11;
        if (i10 % 2 == 0) {
            throw null;
        }
        ImageView imageView = this.f40518o;
        if (imageView != null) {
            int i12 = i11 + 123;
            aO = i12 % 128;
            int i13 = i12 % 2;
            if (FaceTecSDK.f40106a.f40090n.f40073e == FaceTecCancelButtonCustomization.ButtonLocation.CUSTOM) {
                int i14 = aQ + 19;
                aO = i14 % 128;
                if (i14 % 2 != 0) {
                    imageView.setEnabled(false);
                    viewPropertyAnimatorAnimate = this.f40518o.animate();
                    f6 = 2.0f;
                } else {
                    imageView.setEnabled(false);
                    viewPropertyAnimatorAnimate = this.f40518o.animate();
                    f6 = 0.0f;
                }
                viewPropertyAnimatorAnimate.alpha(f6).setDuration(300L).setStartDelay(0L).setListener(null).withEndAction(null).start();
            }
        }
    }

    private void af() throws Throwable {
        b(new Object[]{this}, 1080483165, -1080483139, System.identityHashCode(this));
    }

    private void ag() throws Throwable {
        b(new Object[]{this}, 987633992, -987633974, System.identityHashCode(this));
    }

    private void ah() throws Throwable {
        b(new Object[]{this}, 1511765678, -1511765673, System.identityHashCode(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void ai() throws Throwable {
        b(new Object[]{this}, 923332140, -923332117, System.identityHashCode(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void aj() throws Throwable {
        int i10 = aQ + 69;
        aO = i10 % 128;
        int i11 = i10 % 2;
        c(false, false);
        int i12 = aO + 105;
        aQ = i12 % 128;
        int i13 = i12 % 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void ak() throws Throwable {
        b(new Object[]{this}, -548545324, 548545333, System.identityHashCode(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void al() throws Throwable {
        int i10 = aQ + 123;
        aO = i10 % 128;
        int i11 = i10 % 2;
        this.L = true;
        if (this.at.getStatus() != null) {
            int i12 = aO + 9;
            aQ = i12 % 128;
            if (i12 % 2 == 0) {
                t.c(this, e.ID_SCAN_CALLBACK_CALLED, this.at.getStatus().toString());
                throw null;
            }
            t.c(this, e.ID_SCAN_CALLBACK_CALLED, this.at.getStatus().toString());
        }
        FaceTecSessionActivity.f40125i.processIDScanWhileFaceTecSDKWaits(this.at, new br(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void am() {
        int i10 = aQ + 83;
        aO = i10 % 128;
        int i11 = i10 % 2;
        getFragmentManager().beginTransaction().remove(this.f40524u).commitAllowingStateLoss();
        this.f40524u = null;
        co.c cVar = co.c.SKIPPED_NFC;
        this.az = cVar;
        this.f40524u = co.a(true, cVar);
        getFragmentManager().beginTransaction().add(this.f40497ac, this.f40524u, "Results").commitAllowingStateLoss();
        d(new b() { // from class: com.facetec.sdk.w3
            @Override // com.facetec.sdk.be.b
            public final byte[] getIdScanBytes(String str) {
                return this.f42936a.d(str);
            }
        });
        int i12 = aQ + 37;
        aO = i12 % 128;
        if (i12 % 2 != 0) {
            throw null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void an() throws Throwable {
        b(new Object[]{this}, 1945593688, -1945593666, System.identityHashCode(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void ao() {
        FaceTecSessionActivity faceTecSessionActivity;
        this.J = false;
        this.f40527x = (cn) getFragmentManager().findFragmentByTag("RetryZoom");
        if (this.f40527x != null) {
            int i10 = aQ + 53;
            aO = i10 % 128;
            int i11 = i10 % 2;
            if (this.f40527x.f40919o != null) {
                ct ctVar = this.f40527x.f40919o;
                if (ctVar.f41037f == null) {
                    int i12 = aO + 95;
                    aQ = i12 % 128;
                    if (i12 % 2 == 0) {
                        faceTecSessionActivity = (FaceTecSessionActivity) ctVar.getActivity();
                        int i13 = 26 / 0;
                        if (faceTecSessionActivity == null) {
                            return;
                        }
                    } else {
                        faceTecSessionActivity = (FaceTecSessionActivity) ctVar.getActivity();
                        if (faceTecSessionActivity == null) {
                            return;
                        }
                    }
                    ctVar.f41037f = faceTecSessionActivity.f40523t;
                    ctVar.f41033b.setAlpha(0.0f);
                    ctVar.a();
                    ctVar.f41033b.animate().alpha(1.0f).setDuration(400L).setListener(null);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void ap() throws Throwable {
        this.G = false;
        FaceTecSessionStatus faceTecSessionStatus = FaceTecSessionStatus.SESSION_COMPLETED_SUCCESSFULLY;
        FaceTecSessionResult faceTecSessionResult = new FaceTecSessionResult(faceTecSessionStatus, this.D, this.f40529z, this.A);
        faceTecSessionResult.e(cc.f40802c);
        if (FaceTecSessionActivity.f40124e == null) {
            a(faceTecSessionStatus);
            return;
        }
        int i10 = aO + 45;
        aQ = i10 % 128;
        int i11 = i10 % 2;
        this.F = true;
        this.f40519p = faceTecSessionResult;
        if (faceTecSessionResult.getStatus() != null) {
            int i12 = aQ + 61;
            aO = i12 % 128;
            int i13 = i12 % 2;
            t.c(this, e.FACESCAN_CALLBACK_CALLED, this.f40519p.getStatus().toString());
        }
        FaceTecSessionActivity.f40124e.processSessionWhileFaceTecSDKWaits(faceTecSessionResult, new bc(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:22:0x0051 A[PHI: r4
      0x0051: PHI (r4v10 float) = (r4v9 float), (r4v14 float) binds: [B:21:0x004f, B:18:0x003f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:23:0x0054 A[PHI: r4
      0x0054: PHI (r4v12 float) = (r4v9 float), (r4v14 float) binds: [B:21:0x004f, B:18:0x003f] A[DONT_GENERATE, DONT_INLINE]] */
    public /* synthetic */ void ap_(float f6, float f10, Animator animator) {
        float fD;
        float f11;
        if (this.aH || this.aK) {
            this.aH = false;
            this.aK = false;
            return;
        }
        if (!this.ay || ch.h() != cj.ZOOM_CLOSE || this.aB || f6 != this.aF.e()) {
            if (this.ay) {
                int i10 = aQ + 59;
                aO = i10 % 128;
                if (i10 % 2 != 0) {
                    e(f6, f10, 20822);
                } else {
                    e(f6, f10, 1000);
                }
            }
            int i11 = aO + 51;
            aQ = i11 % 128;
            int i12 = i11 % 2;
            return;
        }
        int i13 = aO + 121;
        aQ = i13 % 128;
        if (i13 % 2 == 0) {
            this.aB = false;
            fD = this.aF.d();
            if (this.aF.f40991b) {
                f11 = 0.5f;
            } else {
                f11 = 0.8f;
            }
        } else {
            this.aB = true;
            fD = this.aF.d();
            if (this.aF.f40991b) {
                f11 = 0.5f;
            } else {
                f11 = 0.8f;
            }
        }
        e(fD, f11, 1000);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void aq() {
        int i10 = aO + 49;
        int i11 = i10 % 128;
        aQ = i11;
        int i12 = i10 % 2;
        cc ccVar = this.f40571d;
        if (ccVar != null) {
            int i13 = i11 + 19;
            aO = i13 % 128;
            int i14 = i13 % 2;
            ccVar.i();
        }
        try {
            this.A = ch.s();
        } catch (Exception e5) {
            ay.a(e5.getMessage());
        }
        if (bg.b() && !(!this.I)) {
            int i15 = aQ + 45;
            aO = i15 % 128;
            int i16 = i15 % 2;
            this.D = ch.D();
            this.f40529z = ch.C();
            if (this.f40529z.length > 0) {
                this.f40523t = BitmapFactory.decodeByteArray(this.f40529z[0], 0, this.f40529z[0].length);
            }
        }
        this.f40515k.d();
        if (this.f40509e != null) {
            az azVar = this.f40509e;
            az.a(new Object[]{azVar}, -1297348129, 1297348131, System.identityHashCode(azVar));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void aq_(ValueAnimator valueAnimator) {
        int i10 = aO + 5;
        aQ = i10 % 128;
        int i11 = i10 % 2;
        WindowManager.LayoutParams attributes = getWindow().getAttributes();
        attributes.screenBrightness = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        getWindow().setAttributes(attributes);
        int i12 = aQ + 65;
        aO = i12 % 128;
        if (i12 % 2 != 0) {
            int i13 = 17 / 0;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void ar() {
        int i10 = aO + 95;
        aQ = i10 % 128;
        int i11 = i10 % 2;
        this.f40518o.setEnabled(true);
        int i12 = aO + 49;
        aQ = i12 % 128;
        int i13 = i12 % 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ boolean ar_(View view, MotionEvent motionEvent) {
        return ((Boolean) b(new Object[]{this, view, motionEvent}, -177299616, 177299624, System.identityHashCode(this))).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void as() throws Throwable {
        int i10 = aQ + 1;
        aO = i10 % 128;
        if (i10 % 2 == 0) {
            b(new Object[]{this, this.at.getStatus()}, -1431415695, 1431415697, System.identityHashCode(this));
        } else {
            b(new Object[]{this, this.at.getStatus()}, -1431415695, 1431415697, System.identityHashCode(this));
            throw null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void as_(GradientDrawable gradientDrawable, int i10, ValueAnimator valueAnimator) {
        int i11 = aO + 15;
        aQ = i11 % 128;
        int i12 = i11 % 2;
        Integer num = (Integer) valueAnimator.getAnimatedValue();
        this.aL = num;
        gradientDrawable.setStroke(i10, num.intValue());
        this.f40501ag.setBackground(gradientDrawable);
        this.f40506al.setBackground(gradientDrawable);
        this.f40507am.setBackground(gradientDrawable);
        this.f40501ag.invalidate();
        this.f40506al.invalidate();
        this.f40507am.invalidate();
        int i13 = aO + 27;
        aQ = i13 % 128;
        int i14 = i13 % 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void at() {
        int i10 = aQ + 75;
        aO = i10 % 128;
        int i11 = i10 % 2;
        aa();
        int i12 = aQ + 107;
        aO = i12 % 128;
        int i13 = i12 % 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void at_(ValueAnimator valueAnimator) throws Throwable {
        b(new Object[]{this, valueAnimator}, -9164726, 9164739, System.identityHashCode(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void au() throws Throwable {
        int i10 = aO + 19;
        aQ = i10 % 128;
        int i11 = i10 % 2;
        L();
        if (i11 == 0) {
            int i12 = 96 / 0;
        }
        int i13 = aO + 51;
        aQ = i13 % 128;
        int i14 = i13 % 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void au_(ValueAnimator valueAnimator) {
        int i10 = aQ + 41;
        aO = i10 % 128;
        if (i10 % 2 == 0) {
            Integer num = (Integer) valueAnimator.getAnimatedValue();
            this.aD = num;
            this.f40499ae.setBackgroundColor(num.intValue());
            this.f40499ae.invalidate();
            return;
        }
        Integer num2 = (Integer) valueAnimator.getAnimatedValue();
        this.aD = num2;
        this.f40499ae.setBackgroundColor(num2.intValue());
        this.f40499ae.invalidate();
        int i11 = 82 / 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void av() throws Throwable {
        b(new Object[]{this}, 1877193336, -1877193324, System.identityHashCode(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void aw() {
        int i10 = aO + 49;
        aQ = i10 % 128;
        if (i10 % 2 == 0) {
            isFinishing();
            throw null;
        }
        if (isFinishing() || !hasWindowFocus() || this.f40524u == null) {
            return;
        }
        N();
        int i11 = aQ + 65;
        aO = i11 % 128;
        if (i11 % 2 != 0) {
            throw null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void ax() {
        RelativeLayout relativeLayout;
        float f6;
        int i10 = aQ + 121;
        aO = i10 % 128;
        if (i10 % 2 != 0) {
            this.f40500af.setVisibility(0);
            relativeLayout = this.f40500af;
            f6 = 0.0f;
        } else {
            this.f40500af.setVisibility(0);
            relativeLayout = this.f40500af;
            f6 = 1.0f;
        }
        relativeLayout.setAlpha(f6);
        int i11 = aQ + 33;
        aO = i11 % 128;
        if (i11 % 2 != 0) {
            throw null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void ay() {
        int i10 = aO + 57;
        aQ = i10 % 128;
        if (i10 % 2 == 0) {
            isFinishing();
            throw null;
        }
        if (!isFinishing() && hasWindowFocus()) {
            K();
            return;
        }
        int i11 = aQ + 49;
        aO = i11 % 128;
        if (i11 % 2 != 0) {
            throw null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void az() throws Throwable {
        if (this.f40524u != null) {
            int i10 = aQ + 41;
            aO = i10 % 128;
            int i11 = i10 % 2;
            this.f40524u.e(false, null, new p3(this, 1));
        }
        int i12 = aQ + 51;
        aO = i12 % 128;
        int i13 = i12 % 2;
    }

    public static /* synthetic */ Object b(Object[] objArr, int i10, int i11, int i12) throws Throwable {
        final String strA;
        int i13;
        co coVar;
        Runnable h3Var;
        int i14 = ~i10;
        int i15 = ~i12;
        int i16 = i14 | i15;
        int i17 = ~(i16 | i11);
        int i18 = ~i11;
        int i19 = i15 | i18;
        int i20 = 0;
        switch (((i10 | i11) * 184) + (((~i19) | (~(i14 | i18)) | (~i16)) * 184) + ((i17 | (~(i19 | i10))) * (-184)) + (i11 * (-183)) + (i10 * (-183))) {
            case 1:
                be beVar = (be) objArr[0];
                dt dtVar = (dt) objArr[1];
                String str = (String) objArr[2];
                beVar.f40496aa = false;
                b(new Object[]{beVar}, 1080483165, -1080483139, System.identityHashCode(beVar));
                t.e(beVar, dtVar, str);
                if (dtVar != dt.ConnectionError && dtVar != dt.UnknownRetry) {
                    b(new Object[]{beVar, Boolean.FALSE}, -11714907, 11714914, System.identityHashCode(beVar));
                    return null;
                }
                beVar.av++;
                if (beVar.f40524u != null) {
                    int i21 = aQ + 55;
                    int i22 = i21 % 128;
                    aO = i22;
                    if (i21 % 2 == 0 ? beVar.av > 5 : beVar.av > 3) {
                        int i23 = i22 + 33;
                        aQ = i23 % 128;
                        if (i23 % 2 == 0) {
                            b(new Object[]{beVar, Boolean.TRUE}, -11714907, 11714914, System.identityHashCode(beVar));
                            return null;
                        }
                        b(new Object[]{beVar, Boolean.FALSE}, -11714907, 11714914, System.identityHashCode(beVar));
                        return null;
                    }
                }
                beVar.c(true, false);
                beVar.T.d();
                return null;
            case 2:
                be beVar2 = (be) objArr[0];
                FaceTecIDScanStatus faceTecIDScanStatus = (FaceTecIDScanStatus) objArr[1];
                int i24 = aO + 77;
                aQ = i24 % 128;
                int i25 = i24 % 2;
                beVar2.b(FaceTecSessionStatus.SESSION_COMPLETED_SUCCESSFULLY, faceTecIDScanStatus);
                int i26 = aQ + 87;
                aO = i26 % 128;
                int i27 = i26 % 2;
                return null;
            case 3:
                return c(objArr);
            case 4:
                return d(objArr);
            case 5:
                be beVar3 = (be) objArr[0];
                Timer timer = beVar3.au;
                if (timer != null) {
                    int i28 = aO + 105;
                    aQ = i28 % 128;
                    int i29 = i28 % 2;
                    timer.cancel();
                    beVar3.au = null;
                    int i30 = aQ + 123;
                    aO = i30 % 128;
                    int i31 = i30 % 2;
                }
                TimerTask timerTask = beVar3.ax;
                if (timerTask == null) {
                    return null;
                }
                timerTask.cancel();
                beVar3.ax = null;
                return null;
            case 6:
                return b(objArr);
            case 7:
                final be beVar4 = (be) objArr[0];
                final boolean zBooleanValue = ((Boolean) objArr[1]).booleanValue();
                int i32 = aO + 79;
                aQ = i32 % 128;
                int i33 = i32 % 2;
                beVar4.T.a();
                beVar4.Q = true;
                if (!zBooleanValue) {
                    strA = db.a(ca.FINISHED_WITH_ERROR, beVar4.ab);
                    int i34 = aQ + 35;
                    aO = i34 % 128;
                    int i35 = i34 % 2;
                } else {
                    strA = db.a(ca.FINISHED_WITH_SUCCESS, beVar4.ab);
                }
                beVar4.f40524u.b(new Runnable() { // from class: com.facetec.sdk.e3
                    @Override // java.lang.Runnable
                    public final void run() throws Throwable {
                        this.f41452p0.b(zBooleanValue, strA);
                    }
                }, 800L);
                int i36 = aO + 81;
                aQ = i36 % 128;
                int i37 = i36 % 2;
                return null;
            case 8:
                be beVar5 = (be) objArr[0];
                MotionEvent motionEvent = (MotionEvent) objArr[2];
                if (motionEvent.getAction() == 0) {
                    beVar5.f40518o.setAlpha(0.4f);
                    i13 = aQ + 71;
                } else {
                    if (motionEvent.getAction() != 3) {
                        int i38 = aO + 47;
                        aQ = i38 % 128;
                        if (i38 % 2 != 0 ? motionEvent.getX() >= 0.0f : motionEvent.getX() >= 1.0f) {
                            if (motionEvent.getX() <= beVar5.f40518o.getLeft() + beVar5.f40518o.getWidth() + 10) {
                                int i39 = aO + 125;
                                aQ = i39 % 128;
                                if (i39 % 2 != 0 ? motionEvent.getY() >= 0.0f : motionEvent.getY() >= 2.0f) {
                                    if (motionEvent.getY() <= beVar5.f40518o.getTop() + beVar5.f40518o.getHeight() + 10) {
                                        if (motionEvent.getAction() == 1) {
                                            int i40 = aO + 7;
                                            aQ = i40 % 128;
                                            int i41 = i40 % 2;
                                            beVar5.f40518o.performClick();
                                        }
                                    }
                                    return Boolean.TRUE;
                                }
                            }
                        }
                    }
                    beVar5.f40518o.setAlpha(1.0f);
                    i13 = aQ + 109;
                }
                aO = i13 % 128;
                int i42 = i13 % 2;
                return Boolean.TRUE;
            case 9:
                return a(objArr);
            case 10:
                return h(objArr);
            case 11:
                return f(objArr);
            case 12:
                return i(objArr);
            case 13:
                return j(objArr);
            case 14:
                return g(objArr);
            case 15:
                return n(objArr);
            case 16:
                return k(objArr);
            case 17:
                be beVar6 = (be) objArr[0];
                int i43 = aO + 13;
                aQ = i43 % 128;
                int i44 = i43 % 2;
                beVar6.ay = false;
                beVar6.aH = true;
                beVar6.e(((Float) b(new Object[]{beVar6}, -1525704666, 1525704685, System.identityHashCode(beVar6))).floatValue(), beVar6.aF.d(), 0);
                beVar6.S();
                int i45 = aQ + 35;
                aO = i45 % 128;
                int i46 = i45 % 2;
                return null;
            case 18:
                be beVar7 = (be) objArr[0];
                int i47 = aQ + 21;
                aO = i47 % 128;
                int i48 = i47 % 2;
                beVar7.D = null;
                beVar7.f40529z = null;
                beVar7.A = null;
                int i49 = aQ + 57;
                aO = i49 % 128;
                int i50 = i49 % 2;
                return null;
            case 19:
                return m(objArr);
            case 20:
                return o(objArr);
            case 21:
                return l(objArr);
            case 22:
                be beVar8 = (be) objArr[0];
                int i51 = aQ + 49;
                aO = i51 % 128;
                int i52 = i51 % 2;
                if (!dr.a(beVar8)) {
                    return null;
                }
                int i53 = aO + 23;
                aQ = i53 % 128;
                if (i53 % 2 == 0) {
                    beVar8.c(true, true);
                    b(new Object[]{beVar8}, 1511765678, -1511765673, System.identityHashCode(beVar8));
                    return null;
                }
                beVar8.c(false, true);
                b(new Object[]{beVar8}, 1511765678, -1511765673, System.identityHashCode(beVar8));
                return null;
            case 23:
                be beVar9 = (be) objArr[0];
                int i54 = aO + 107;
                aQ = i54 % 128;
                int i55 = i54 % 2;
                beVar9.f40524u.d(new g3(beVar9, i20));
                int i56 = aQ + 35;
                aO = i56 % 128;
                int i57 = i56 % 2;
                return null;
            case 24:
                be beVar10 = (be) objArr[0];
                String str2 = (String) objArr[1];
                int i58 = aO + 85;
                aQ = i58 % 128;
                if (i58 % 2 == 0) {
                    coVar = beVar10.f40524u;
                    h3Var = new i3(beVar10, i20);
                } else {
                    coVar = beVar10.f40524u;
                    h3Var = new h3(beVar10, i20);
                }
                coVar.d(false, true, str2, h3Var);
                int i59 = aQ + 15;
                aO = i59 % 128;
                int i60 = i59 % 2;
                return null;
            case 25:
                be beVar11 = (be) objArr[0];
                int i61 = aQ + 43;
                aO = i61 % 128;
                int i62 = i61 % 2;
                b(new Object[]{beVar11}, 1080483165, -1080483139, System.identityHashCode(beVar11));
                beVar11.T.a();
                beVar11.Q = true;
                beVar11.as = true;
                beVar11.f40524u.b(new j3(beVar11, db.a(ca.SKIPPED, beVar11.ab), i20), 800L);
                int i63 = aO + 85;
                aQ = i63 % 128;
                int i64 = i63 % 2;
                return null;
            case 26:
                return t(objArr);
            case 27:
                return p(objArr);
            default:
                return e(objArr);
        }
    }

    /* JADX WARN: Code duplicated, block: B:10:0x002c  */
    /* JADX WARN: Code duplicated, block: B:8:0x0024  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x002c -> B:11:0x0034). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x002c
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void ba(byte r7, short r8, byte r9, java.lang.Object[] r10) {
        /*
            int r7 = r7 * 3
            int r7 = 4 - r7
            int r8 = r8 * 3
            int r8 = r8 + 1
            byte[] r0 = com.facetec.sdk.be.$$g
            int r9 = r9 * 6
            int r9 = r9 + 105
            byte[] r1 = new byte[r8]
            r2 = 0
            if (r0 != 0) goto L19
            r3 = r1
            r4 = r2
            r1 = r0
            r0 = r10
            r10 = r8
            goto L34
        L19:
            r3 = r2
            r6 = r9
            r9 = r8
            r8 = r6
        L1d:
            int r4 = r3 + 1
            byte r5 = (byte) r8
            r1[r3] = r5
            if (r4 != r9) goto L2c
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            r10[r2] = r7
            return
        L2c:
            r3 = r0[r7]
            r6 = r10
            r10 = r9
            r9 = r3
            r3 = r1
            r1 = r0
            r0 = r6
        L34:
            int r7 = r7 + 1
            int r9 = -r9
            int r8 = r8 + r9
            r9 = r10
            r10 = r0
            r0 = r1
            r1 = r3
            r3 = r4
            goto L1d
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facetec.sdk.be.ba(byte, short, byte, java.lang.Object[]):void");
    }

    /* JADX WARN: Code duplicated, block: B:9:0x0025  */
    private static /* synthetic */ Object c(Object[] objArr) {
        be beVar = (be) objArr[0];
        int i10 = aQ + 43;
        aO = i10 % 128;
        if (i10 % 2 != 0) {
            int i11 = 86 / 0;
            if (!(!bg.d())) {
                beVar.a(FaceTecSessionStatus.NON_PRODUCTION_MODE_NETWORK_REQUIRED);
            }
        } else if (!(!bg.d())) {
            beVar.a(FaceTecSessionStatus.NON_PRODUCTION_MODE_NETWORK_REQUIRED);
        }
        int i12 = aQ + 37;
        aO = i12 % 128;
        int i13 = i12 % 2;
        return null;
    }

    private void d(boolean z10) throws NullPointerException {
        cc ccVar;
        boolean z11;
        int i10 = aQ + 47;
        aO = i10 % 128;
        if (i10 % 2 != 0) {
            c(z10);
            ccVar = this.f40571d;
            z11 = false;
        } else {
            c(z10);
            ccVar = this.f40571d;
            z11 = true;
        }
        ccVar.f40804b = z11;
        ccVar.m();
    }

    private void e(final float f6, final float f10, int i10) {
        int i11;
        int i12 = aQ;
        int i13 = i12 + 75;
        aO = i13 % 128;
        if (i13 % 2 != 0) {
            throw null;
        }
        int i14 = 1;
        if (!this.aK) {
            int i15 = i12 + 49;
            aO = i15 % 128;
            int i16 = i15 % 2;
            i11 = 1500;
        } else {
            i11 = 750;
        }
        ValueAnimator valueAnimator = this.aC;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.aC.removeAllUpdateListeners();
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(f6, f10);
        this.aC = valueAnimatorOfFloat;
        valueAnimatorOfFloat.setDuration(i11);
        this.aC.addUpdateListener(new k0(this, i14));
        this.aC.setInterpolator(new LinearInterpolator());
        this.aC.setStartDelay(i10);
        this.aC.addListener(new com.facetec.sdk.b() { // from class: com.facetec.sdk.s3
            @Override // com.facetec.sdk.b, android.animation.Animator.AnimatorListener
            public final /* synthetic */ void onAnimationCancel(Animator animator) {
                v1.a(this, animator);
            }

            @Override // android.animation.Animator.AnimatorListener
            public final void onAnimationEnd(Animator animator) {
                this.f42820a.ap_(f10, f6, animator);
            }

            @Override // com.facetec.sdk.b, android.animation.Animator.AnimatorListener
            public final /* synthetic */ void onAnimationRepeat(Animator animator) {
                v1.b(this, animator);
            }

            @Override // com.facetec.sdk.b, android.animation.Animator.AnimatorListener
            public final /* synthetic */ void onAnimationStart(Animator animator) {
                v1.c(this, animator);
            }
        });
        this.aC.start();
    }

    private static /* synthetic */ Object f(Object[] objArr) {
        be beVar = (be) objArr[0];
        int i10 = aO + 123;
        aQ = i10 % 128;
        if (i10 % 2 == 0) {
            beVar.e(FaceTecSessionStatus.USER_CANCELLED_VIA_CLICKABLE_READY_SCREEN_SUBTEXT, (FaceTecIDScanStatus) null);
            throw null;
        }
        beVar.e(FaceTecSessionStatus.USER_CANCELLED_VIA_CLICKABLE_READY_SCREEN_SUBTEXT, (FaceTecIDScanStatus) null);
        int i11 = aQ + 65;
        aO = i11 % 128;
        int i12 = i11 % 2;
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void h(FaceTecIDScanNextStep faceTecIDScanNextStep) throws Throwable {
        int i10 = aO + 15;
        aQ = i10 % 128;
        if (i10 % 2 == 0) {
            isFinishing();
            throw null;
        }
        if (isFinishing()) {
            int i11 = aQ + 39;
            aO = i11 % 128;
            if (i11 % 2 != 0) {
                int i12 = 62 / 0;
                return;
            }
            return;
        }
        b(faceTecIDScanNextStep, false);
        this.K = false;
        co coVar = this.f40524u;
        coVar.f40925d.animate().alpha(0.0f).setDuration(500L).setStartDelay(500L).setListener(null).withEndAction(new l4(this, 1)).start();
        int i13 = aO + 49;
        aQ = i13 % 128;
        if (i13 % 2 == 0) {
            throw null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void i(FaceTecIDScanNextStep faceTecIDScanNextStep) {
        co coVar = this.f40524u;
        co coVar2 = this.f40524u;
        Objects.requireNonNull(coVar2);
        coVar.e(new aq.b(new f3(this, faceTecIDScanNextStep, 0)));
        int i10 = aO + 45;
        aQ = i10 % 128;
        int i11 = i10 % 2;
    }

    public static void init$0() {
        $$a = new byte[]{71, 27, -4, -75};
        $$b = 253;
    }

    public static void init$1() {
        $$d = new byte[]{2, -14, 49, Constants.CVR_B1b85_0111_VERIFIED_CLOUD, 10, -4, ByteSourceJsonBootstrapper.UTF8_BOM_3, 54, -7, 0, 0, 13, ByteSourceJsonBootstrapper.UTF8_BOM_1, -4, -55, 67, ByteSourceJsonBootstrapper.UTF8_BOM_1, 5, -63, 54, -4, -66, 62, -66, 11};
        $$e = 182;
    }

    public static void init$2() {
        $$g = new byte[]{59, 114, 101, 3};
        $$h = ErrorCodes.ERR_CRY_IO_PROPERTIES;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ byte[] j(String str) {
        int i10 = aO + 109;
        aQ = i10 % 128;
        int i11 = i10 % 2;
        byte[] bArrP = ch.p(str, this.m, "");
        int i12 = aO + 85;
        aQ = i12 % 128;
        int i13 = i12 % 2;
        return bArrP;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0034, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0035, code lost:
    
        r1.f40569b.postDelayed(new com.facetec.sdk.h4(r1, com.facetec.sdk.cn.m(), r0), r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0044, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0021, code lost:
    
        if (r1.isFinishing() != false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0028, code lost:
    
        if (r1.isFinishing() != false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x002a, code lost:
    
        r6 = com.facetec.sdk.be.aO + 25;
        com.facetec.sdk.be.aQ = r6 % 128;
        r6 = r6 % 2;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static /* synthetic */ java.lang.Object k(java.lang.Object[] r6) {
        /*
            r0 = 0
            r1 = r6[r0]
            com.facetec.sdk.be r1 = (com.facetec.sdk.be) r1
            r2 = 1
            r6 = r6[r2]
            java.lang.Number r6 = (java.lang.Number) r6
            int r6 = r6.intValue()
            int r2 = com.facetec.sdk.be.aO
            int r2 = r2 + 115
            int r3 = r2 % 128
            com.facetec.sdk.be.aQ = r3
            int r2 = r2 % 2
            r3 = 0
            if (r2 != 0) goto L24
            boolean r2 = r1.isFinishing()
            r4 = 4
            int r4 = r4 / r0
            if (r2 == 0) goto L35
            goto L2a
        L24:
            boolean r2 = r1.isFinishing()
            if (r2 == 0) goto L35
        L2a:
            int r6 = com.facetec.sdk.be.aO
            int r6 = r6 + 25
            int r0 = r6 % 128
            com.facetec.sdk.be.aQ = r0
            int r6 = r6 % 2
            return r3
        L35:
            com.facetec.sdk.cn r2 = com.facetec.sdk.cn.m()
            android.os.Handler r4 = r1.f40569b
            com.facetec.sdk.h4 r5 = new com.facetec.sdk.h4
            r5.<init>(r1, r2, r0)
            long r0 = (long) r6
            r4.postDelayed(r5, r0)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facetec.sdk.be.k(java.lang.Object[]):java.lang.Object");
    }

    private static /* synthetic */ Object l(Object[] objArr) throws Throwable {
        be beVar = (be) objArr[0];
        t.d(beVar, new Throwable("FaceTec SDK has experienced an unexpected camera error."), e.CAMERA_ERROR, "FaceScan: camera is null unexpectedly ".concat(String.valueOf(((Number) objArr[1]).intValue())), true);
        beVar.e(FaceTecSessionStatus.UNKNOWN_INTERNAL_ERROR, (FaceTecIDScanStatus) null);
        int i10 = aQ + 9;
        aO = i10 % 128;
        if (i10 % 2 != 0) {
            int i11 = 48 / 0;
        }
        return null;
    }

    private static /* synthetic */ Object m(Object[] objArr) {
        int i10;
        be beVar = (be) objArr[0];
        float fT = beVar.getWindow().getAttributes().screenBrightness;
        if (fT < 0.0f) {
            try {
                if (Settings.System.getInt(beVar.getContentResolver(), "screen_brightness_mode") == 1) {
                    try {
                        fT = Settings.System.getFloat(beVar.getContentResolver(), "screen_auto_brightness_adj");
                        i10 = aQ + 45;
                    } catch (Settings.SettingNotFoundException unused) {
                        fT = beVar.T();
                    }
                } else {
                    fT = beVar.T();
                    i10 = aQ + 43;
                }
                aO = i10 % 128;
                int i11 = i10 % 2;
            } catch (Settings.SettingNotFoundException unused2) {
                fT = 0.5f;
            }
        }
        return Float.valueOf(fT);
    }

    private static /* synthetic */ Object n(Object[] objArr) throws Throwable {
        be beVar = (be) objArr[0];
        int i10 = aO + 3;
        aQ = i10 % 128;
        if (i10 % 2 != 0) {
            t.c(beVar, e.DEVELOPER_USED_ID_SCAN_CALLBACK, EventDataKeys.DEEPLINK_SCHEME_PATH_CANCEL);
            b(new Object[]{beVar, beVar.at.getStatus()}, -1431415695, 1431415697, System.identityHashCode(beVar));
            return null;
        }
        t.c(beVar, e.DEVELOPER_USED_ID_SCAN_CALLBACK, EventDataKeys.DEEPLINK_SCHEME_PATH_CANCEL);
        b(new Object[]{beVar, beVar.at.getStatus()}, -1431415695, 1431415697, System.identityHashCode(beVar));
        throw null;
    }

    private static /* synthetic */ Object p(Object[] objArr) {
        int i10 = 0;
        be beVar = (be) objArr[0];
        int i11 = aO + 9;
        aQ = i11 % 128;
        if (i11 % 2 == 0) {
            int i12 = FaceTecSDK.REQUEST_CODE_SESSION;
            FaceTecSDK.c cVar = FaceTecSDK.c.NORMAL;
            throw null;
        }
        FaceTecSDK.c cVar2 = FaceTecSDK.f40108c;
        FaceTecSDK.c cVar3 = FaceTecSDK.c.BRIGHT_LIGHT;
        if (cVar2 == cVar3) {
            return null;
        }
        FaceTecSDK.f40108c = cVar3;
        ch.v();
        beVar.runOnUiThread(new o3(beVar, i10));
        int i13 = aQ + 13;
        aO = i13 % 128;
        if (i13 % 2 == 0) {
            return null;
        }
        throw null;
    }

    @Override // com.facetec.sdk.bh, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(Context context) {
        int i10 = aQ + 65;
        aO = i10 % 128;
        int i11 = i10 % 2;
        super.attachBaseContext(context);
        int i12 = aO + 99;
        aQ = i12 % 128;
        int i13 = i12 % 2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0094, code lost:
    
        if (r3 == false) goto L30;
     */
    @Override // com.facetec.sdk.bh
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void g() throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 296
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facetec.sdk.be.g():void");
    }

    /* JADX WARN: Code duplicated, block: B:16:0x001f A[Catch: all -> 0x0018, TryCatch #2 {all -> 0x0018, blocks: (B:3:0x0001, B:5:0x000f, B:17:0x002d, B:19:0x0031, B:21:0x0038, B:24:0x0041, B:26:0x0045, B:29:0x0056, B:32:0x0063, B:34:0x0072, B:36:0x007d, B:41:0x0092, B:45:0x00a8, B:42:0x0096, B:44:0x009c, B:39:0x0088, B:50:0x00c5, B:16:0x001f, B:11:0x0017, B:14:0x001b, B:46:0x00ad, B:7:0x0012), top: B:59:0x0001, inners: #0, #1 }] */
    /* JADX WARN: Code duplicated, block: B:42:0x0096 A[Catch: all -> 0x0018, TryCatch #2 {all -> 0x0018, blocks: (B:3:0x0001, B:5:0x000f, B:17:0x002d, B:19:0x0031, B:21:0x0038, B:24:0x0041, B:26:0x0045, B:29:0x0056, B:32:0x0063, B:34:0x0072, B:36:0x007d, B:41:0x0092, B:45:0x00a8, B:42:0x0096, B:44:0x009c, B:39:0x0088, B:50:0x00c5, B:16:0x001f, B:11:0x0017, B:14:0x001b, B:46:0x00ad, B:7:0x0012), top: B:59:0x0001, inners: #0, #1 }] */
    /* JADX WARN: Code duplicated, block: B:44:0x009c A[Catch: all -> 0x0018, TryCatch #2 {all -> 0x0018, blocks: (B:3:0x0001, B:5:0x000f, B:17:0x002d, B:19:0x0031, B:21:0x0038, B:24:0x0041, B:26:0x0045, B:29:0x0056, B:32:0x0063, B:34:0x0072, B:36:0x007d, B:41:0x0092, B:45:0x00a8, B:42:0x0096, B:44:0x009c, B:39:0x0088, B:50:0x00c5, B:16:0x001f, B:11:0x0017, B:14:0x001b, B:46:0x00ad, B:7:0x0012), top: B:59:0x0001, inners: #0, #1 }] */
    @Override // com.facetec.sdk.bh
    public final synchronized void o() {
        try {
            int i10 = aO + 53;
            aQ = i10 % 128;
            int i11 = 0;
            if (i10 % 2 == 0) {
                int i12 = 5 / 0;
                if (this.f40569b != null) {
                    this.f40569b.removeCallbacks(null);
                    int i13 = aO + 33;
                    aQ = i13 % 128;
                    int i14 = i13 % 2;
                }
            } else if (this.f40569b != null) {
                this.f40569b.removeCallbacks(null);
                int i15 = aO + 33;
                aQ = i15 % 128;
                int i16 = i15 % 2;
            }
            if (this.f40508an) {
                e(false);
                if (this.f40510f) {
                    e(FaceTecSessionStatus.USER_CANCELLED, FaceTecIDScanStatus.USER_CANCELED);
                    return;
                } else if (!this.I) {
                    e(this.f40519p.getStatus(), FaceTecIDScanStatus.USER_CANCELED);
                    return;
                } else {
                    this.f40515k.a(this, t.b.USER_CANCELLED);
                    cx.b(new l4(this, i11));
                    return;
                }
            }
            this.f40515k.a(this, t.b.USER_CANCELLED);
            c(false);
            cc ccVar = this.f40571d;
            if (ccVar != null) {
                int i17 = aO + 89;
                aQ = i17 % 128;
                if (i17 % 2 == 0) {
                    ccVar.f40804b = false;
                    ccVar.f40805d = false;
                    if (this.f40525v == c.PRE_SESSION_STARTED) {
                        ccVar.f();
                    } else if (this.f40525v == c.FACESCAN_SESSION_STARTED) {
                        int i18 = aQ + 59;
                        aO = i18 % 128;
                        int i19 = i18 % 2;
                        ccVar.c(true);
                    }
                } else {
                    ccVar.f40804b = true;
                    ccVar.f40805d = true;
                    if (this.f40525v == c.PRE_SESSION_STARTED) {
                        ccVar.f();
                    } else if (this.f40525v == c.FACESCAN_SESSION_STARTED) {
                        int i110 = aQ + 59;
                        aO = i110 % 128;
                        int i111 = i110 % 2;
                        ccVar.c(true);
                    }
                }
                this.f40571d.b(true);
            }
            try {
                b(new Object[]{this, 400}, -207278363, 207278379, 400);
            } catch (Throwable th2) {
                e eVar = e.SEVERE_ERROR;
                StringBuilder sb2 = new StringBuilder("Unknown error: ");
                sb2.append(th2.getMessage());
                t.d(this, th2, eVar, sb2.toString(), true);
                e(FaceTecSessionStatus.UNKNOWN_INTERNAL_ERROR, (FaceTecIDScanStatus) null);
            }
        } catch (Throwable th3) {
            throw th3;
        }
    }

    @Override // android.app.Activity
    public synchronized void onBackPressed() {
        int i10 = aO + 7;
        aQ = i10 % 128;
        int i11 = i10 % 2;
        if (E()) {
            return;
        }
        if (Q()) {
            if (!this.R) {
                int i12 = aQ + 59;
                int i13 = i12 % 128;
                aO = i13;
                int i14 = i12 % 2;
                if (this.f40508an) {
                    int i15 = i13 + 73;
                    aQ = i15 % 128;
                    if (i15 % 2 == 0) {
                        throw null;
                    }
                    bj bjVar = this.f40516l;
                    if (bjVar != null) {
                        bjVar.f40597f.d(false, true);
                        bjVar.f40598g.d(false, true);
                        bjVar.f40594c.d(false, true);
                        bjVar.f40593b.d(false, true);
                        b(new Object[]{this, FaceTecIDScanStatus.USER_CANCELED}, -1431415695, 1431415697, System.identityHashCode(this));
                        return;
                    }
                }
                if (a()) {
                    int i16 = aQ + 11;
                    aO = i16 % 128;
                    if (i16 % 2 != 0) {
                        a(true);
                        a(FaceTecSessionStatus.CAMERA_PERMISSION_DENIED);
                        return;
                    } else {
                        a(false);
                        a(FaceTecSessionStatus.CAMERA_PERMISSION_DENIED);
                        return;
                    }
                }
                if (this.f40527x != null && getFragmentManager().findFragmentByTag("RetryZoom") != null) {
                    ((ba) getFragmentManager().findFragmentByTag("RetryZoom")).d();
                    return;
                }
                if (this.f40513i != null && getFragmentManager().findFragmentByTag("PreEnroll") != null) {
                    if (e() == bh.b.GRANTED) {
                        r();
                        return;
                    }
                    int i17 = aQ + 81;
                    aO = i17 % 128;
                    int i18 = i17 % 2;
                    p();
                    return;
                }
            }
            o();
        }
    }

    @Override // com.facetec.sdk.bh, android.app.Activity
    @SuppressLint({"ClickableViewAccessibility"})
    public synchronized void onCreate(Bundle bundle) {
        FaceTecSessionStatus faceTecSessionStatus;
        String string;
        super.onCreate(null);
        int i10 = 0;
        if (bundle != null) {
            int i11 = aQ + 45;
            aO = i11 % 128;
            if (i11 % 2 != 0) {
                setResult(0);
                finish();
                return;
            } else {
                setResult(0);
                finish();
                return;
            }
        }
        this.aF = new cr();
        dd.a(this);
        db.bp();
        boolean booleanExtra = getIntent().getBooleanExtra("facetec.idScanOnlyMode", false);
        this.f40510f = booleanExtra;
        if (FaceTecSessionActivity.f40124e == null && !booleanExtra) {
            int i12 = aO + 109;
            aQ = i12 % 128;
            int i13 = i12 % 2;
            aw.b("FaceTecSessionActivity must be launched with the constructor FaceTecSDK.createAndLaunchSession(...).");
            setResult(0);
            finish();
            return;
        }
        t.c(this, e.FULL_SESSION_START, (String) null);
        int i14 = aQ + 49;
        aO = i14 % 128;
        if (i14 % 2 != 0) {
            Window window = getWindow();
            window.clearFlags(AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL);
            window.addFlags(Integer.MIN_VALUE);
            throw null;
        }
        Window window2 = getWindow();
        window2.clearFlags(AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL);
        window2.addFlags(Integer.MIN_VALUE);
        if (!FaceTecSDK.f40106a.f40079b) {
            int i15 = aQ + 49;
            aO = i15 % 128;
            if (i15 % 2 != 0) {
                getWindow().addFlags(32337);
            } else {
                getWindow().addFlags(8192);
            }
        }
        int i16 = FaceTecCustomization.activityThemeId;
        if (i16 != 0) {
            setTheme(i16);
        }
        String stringExtra = getIntent().getStringExtra("zoom.serverSessionToken");
        this.f40512h = stringExtra;
        if (stringExtra == null) {
            this.f40512h = "";
            int i17 = aQ + 17;
            aO = i17 % 128;
            int i18 = i17 % 2;
        }
        setContentView(R.layout.facetec_main_activity);
        int i19 = R.id.signupContainer;
        this.f40497ac = i19;
        this.Y = findViewById(R.id.mainLayout);
        this.f40507am = findViewById(R.id.zoomFrameShadowView);
        this.f40501ag = (RelativeLayout) findViewById(R.id.outerContainer);
        this.f40500af = (RelativeLayout) findViewById(R.id.faceScanCameraContainer);
        this.f40499ae = (RelativeLayout) findViewById(R.id.faceScanCameraTransitionView);
        this.f40502ah = (RelativeLayout) findViewById(R.id.faceScanCameraLayout);
        this.f40498ad = (RelativeLayout) findViewById(i19);
        this.f40506al = (RelativeLayout) findViewById(R.id.borderCover);
        this.f40505ak = (RelativeLayout) findViewById(R.id.subZoomFrame);
        this.f40504aj = (LinearLayout) findViewById(R.id.brandingLogoContainer);
        this.f40503ai = (RelativeLayout) findViewById(R.id.faceScanSessionLayout);
        this.aA = (ImageView) findViewById(R.id.brandingLogoBottom);
        this.f40528y = findViewById(R.id.overlayBackgroundView);
        setTitle(" ");
        try {
            try {
                FaceTecSDK.setCustomization(db.a(FaceTecSDK.f40106a));
                FaceTecGuidanceCustomization faceTecGuidanceCustomization = FaceTecSDK.f40106a.f40086i;
                bl.f40644a = faceTecGuidanceCustomization.subtextFont;
                Typeface typeface = faceTecGuidanceCustomization.buttonFont;
                bl.f40645b = faceTecGuidanceCustomization.headerFont;
                RelativeLayout relativeLayout = (RelativeLayout) findViewById(R.id.backgroundCover);
                this.f40568a = relativeLayout;
                relativeLayout.setAlpha(0.0f);
                int i20 = FaceTecSDK.f40106a.f40089l.backgroundColor;
                if (i20 == 0) {
                    this.f40568a.setBackgroundColor(getResources().getColor(R.color.facetec_outline_shadow_dark));
                } else {
                    this.f40568a.setBackgroundColor(i20);
                }
                int i21 = R.id.backgroundColor;
                this.f40570c = findViewById(i21);
                db.d(findViewById(i21));
                this.f40569b = new Handler();
                int iAM = db.aM();
                int iAT = db.aT();
                FaceTecCustomization faceTecCustomization = FaceTecSDK.f40106a;
                int i22 = faceTecCustomization.f40085h.brandingImage;
                if (i22 == 0) {
                    i22 = R.drawable.facetec_your_app_logo;
                }
                FaceTecCancelButtonCustomization faceTecCancelButtonCustomization = faceTecCustomization.f40090n;
                int i23 = faceTecCancelButtonCustomization.customImage;
                if (i23 == 0) {
                    i23 = R.drawable.facetec_cancel;
                }
                boolean z10 = faceTecCancelButtonCustomization.f40073e != FaceTecCancelButtonCustomization.ButtonLocation.DISABLED && i23 == 0;
                if (FaceTecSessionActivity.f40124e != null) {
                    int i24 = aQ + 13;
                    aO = i24 % 128;
                    int i25 = i24 % 2;
                    if (iAT == 0 || i22 == 0) {
                        z10 = true;
                    }
                }
                if (iAM != 0 && !z10) {
                    FaceTecCustomization faceTecCustomization2 = FaceTecSDK.f40106a;
                    FaceTecGuidanceCustomization faceTecGuidanceCustomization2 = faceTecCustomization2.f40086i;
                    faceTecGuidanceCustomization2.retryScreenIdealImage = iAM;
                    faceTecGuidanceCustomization2.cameraPermissionsScreenImage = iAT;
                    faceTecCustomization2.f40085h.brandingImage = i22;
                    FaceTecCancelButtonCustomization faceTecCancelButtonCustomization2 = faceTecCustomization2.f40090n;
                    faceTecCancelButtonCustomization2.customImage = i23;
                    if (faceTecCancelButtonCustomization2.f40073e == FaceTecCancelButtonCustomization.ButtonLocation.CUSTOM && FaceTecSDK.f40106a.f40090n.f40072a != null) {
                        ImageView imageView = (ImageView) findViewById(R.id.customLocationBackButton);
                        this.f40518o = imageView;
                        imageView.setAlpha(0.0f);
                        this.f40518o.setVisibility(0);
                        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
                        layoutParams.setMarginStart((int) ay.e(FaceTecSDK.f40106a.f40090n.f40072a.left));
                        ((ViewGroup.MarginLayoutParams) layoutParams).topMargin = (int) ay.e(FaceTecSDK.f40106a.f40090n.f40072a.top);
                        ((ViewGroup.LayoutParams) layoutParams).width = (int) ay.e(FaceTecSDK.f40106a.f40090n.f40072a.right);
                        ((ViewGroup.LayoutParams) layoutParams).height = (int) ay.e(FaceTecSDK.f40106a.f40090n.f40072a.bottom);
                        this.f40518o.setLayoutParams(layoutParams);
                        if (FaceTecSDK.f40106a.f40090n.customImage != 0) {
                            this.f40518o.setImageDrawable(ContextCompat.getDrawable(this, db.aH()));
                        }
                        this.f40518o.setOnClickListener(new x2(this, i10));
                        this.f40518o.setOnTouchListener(new y2(this, i10));
                    }
                    FaceTecSDKStatus faceTecSDKStatus = (FaceTecSDKStatus) bg.a(new Object[]{this}, 643267213, -643267207, (int) System.currentTimeMillis());
                    if (faceTecSDKStatus != FaceTecSDKStatus.INITIALIZED) {
                        if (faceTecSDKStatus == FaceTecSDKStatus.NEVER_INITIALIZED) {
                            if (this.f40510f) {
                                FaceTecIDScanStatus faceTecIDScanStatus = FaceTecIDScanStatus.INITIALIZATION_NOT_COMPLETED;
                                string = faceTecIDScanStatus.toString();
                                c(faceTecIDScanStatus);
                            } else {
                                FaceTecSessionStatus faceTecSessionStatus2 = FaceTecSessionStatus.INITIALIZATION_NOT_COMPLETED;
                                string = faceTecSessionStatus2.toString();
                                e(faceTecSessionStatus2, (FaceTecIDScanStatus) null);
                            }
                            t.c(this, e.NON_FATAL_ERROR, string);
                            return;
                        }
                        switch (AnonymousClass3.f40531b[faceTecSDKStatus.ordinal()]) {
                            case 1:
                                faceTecSessionStatus = FaceTecSessionStatus.NON_PRODUCTION_MODE_KEY_INVALID;
                                break;
                            case 2:
                                faceTecSessionStatus = FaceTecSessionStatus.NON_PRODUCTION_MODE_NETWORK_REQUIRED;
                                break;
                            case 3:
                                faceTecSessionStatus = FaceTecSessionStatus.LOCKED_OUT;
                                break;
                            case 4:
                                faceTecSessionStatus = FaceTecSessionStatus.ENCRYPTION_KEY_INVALID;
                                break;
                            case 5:
                                faceTecSessionStatus = FaceTecSessionStatus.LANDSCAPE_MODE_NOT_ALLOWED;
                                break;
                            case 6:
                                faceTecSessionStatus = FaceTecSessionStatus.REVERSE_PORTRAIT_NOT_ALLOWED;
                                break;
                            case 7:
                                faceTecSessionStatus = FaceTecSessionStatus.DEVICE_NOT_SUPPORTED;
                                break;
                            default:
                                faceTecSessionStatus = null;
                                break;
                        }
                        if (!(!this.f40510f) && faceTecSDKStatus == FaceTecSDKStatus.DEVICE_LOCKED_OUT) {
                            FaceTecIDScanStatus faceTecIDScanStatus2 = FaceTecIDScanStatus.LOCKED_OUT;
                            t.c(this, e.NON_FATAL_ERROR, faceTecIDScanStatus2.toString());
                            c(faceTecIDScanStatus2);
                            return;
                        }
                        if (faceTecSessionStatus != null) {
                            t.c(this, e.NON_FATAL_ERROR, faceTecSessionStatus.toString());
                            e(faceTecSessionStatus, (FaceTecIDScanStatus) null);
                            return;
                        }
                        e eVar = e.SEVERE_ERROR;
                        StringBuilder sb2 = new StringBuilder("Couldn't start session with status: ");
                        sb2.append(faceTecSDKStatus.name());
                        t.c(this, eVar, sb2.toString());
                        e(FaceTecSessionStatus.UNKNOWN_INTERNAL_ERROR, (FaceTecIDScanStatus) null);
                        return;
                    }
                    db.e(this.f40528y);
                    dn.d(this);
                    this.f40571d = cc.b((Activity) this);
                    cx.d(new z2(this, i10));
                    this.f40515k = new n();
                    cc.e(new Object[0], -1383766321, 1383766323, (int) System.currentTimeMillis());
                    ch.B(FaceTecSDK.f40106a.f40094t);
                    ch.b((String) bg.a(new Object[0], -357708855, 357708860, (int) System.currentTimeMillis()), bg.f40537a);
                    cc ccVar = this.f40571d;
                    cc.e(new Object[]{ccVar}, 472527550, -472527549, System.identityHashCode(ccVar));
                    bn.c(this);
                    cx.d(new a3(this, i10));
                    ag.f40233d = false;
                    if (bd.f40494c) {
                        ag.b(this);
                    } else {
                        int i26 = aQ + 87;
                        aO = i26 % 128;
                        int i27 = i26 % 2;
                        ag.e(this);
                    }
                    db.b();
                    ap.d(this, ao.FT_EVENT_VERIFY_SESSION_START, new b3(this, i10));
                    cx.b(new c3(this, i10));
                    int iE = (int) (ay.e(db.g()) * db.d());
                    db.h();
                    if (db.d() < 1.0f) {
                        float f6 = ag.f();
                        int i28 = Resources.getSystem().getDisplayMetrics().widthPixels;
                        int i29 = (int) (((double) Resources.getSystem().getDisplayMetrics().widthPixels) * ((double) f6));
                        float fD = db.d();
                        float f10 = i28;
                        this.f40511g = fD * f10;
                        this.f40517n = i29 * fD;
                        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams((int) this.f40511g, (int) this.f40517n);
                        float f11 = this.f40511g;
                        layoutParams2.setMargins(((int) (f10 - f11)) / 2, (iE / 2) + 10, ((int) (f10 - f11)) / 2, 0);
                        this.f40501ag.setLayoutParams(layoutParams2);
                        RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(((int) this.f40511g) + iE, ((int) this.f40517n) + iE);
                        float f12 = this.f40511g;
                        float f13 = iE;
                        layoutParams3.setMargins(((int) (f10 - (f12 + f13))) / 2, 10, ((int) (f10 - (f12 + f13))) / 2, 0);
                        this.f40506al.setLayoutParams(layoutParams3);
                        ((View) this.f40507am.getParent()).setLayoutParams(layoutParams3);
                        RelativeLayout.LayoutParams layoutParams4 = new RelativeLayout.LayoutParams((int) this.f40511g, (int) this.f40517n);
                        layoutParams4.setMargins(0, 0, 0, 0);
                        this.f40502ah.setLayoutParams(layoutParams4);
                        RelativeLayout.LayoutParams layoutParams5 = new RelativeLayout.LayoutParams((int) this.f40511g, (int) this.f40517n);
                        layoutParams5.setMargins(0, 0, 0, 0);
                        this.f40498ad.setLayoutParams(layoutParams5);
                        GradientDrawable gradientDrawable = new GradientDrawable();
                        float fE = ay.e(db.x()) * fD;
                        gradientDrawable.setCornerRadius(fE);
                        int iE2 = db.e(this, FaceTecSDK.f40106a.f40089l.borderColor);
                        gradientDrawable.setStroke(iE, iE2);
                        this.f40501ag.setBackground(gradientDrawable);
                        this.f40506al.setBackground(gradientDrawable);
                        int i30 = aO + 111;
                        aQ = i30 % 128;
                        if (i30 % 2 == 0) {
                            this.f40501ag.setOutlineProvider(ViewOutlineProvider.BACKGROUND);
                            this.f40501ag.setClipToOutline(false);
                            if (FaceTecSDK.f40106a.f40089l.elevation > 0) {
                                GradientDrawable gradientDrawable2 = new GradientDrawable();
                                gradientDrawable2.setCornerRadius(fE);
                                gradientDrawable2.setStroke(iE, iE2);
                                gradientDrawable2.setColor(db.e(this, db.K()));
                                this.f40507am.setBackground(gradientDrawable2);
                                this.f40507am.setElevation(ay.e(FaceTecSDK.f40106a.f40089l.elevation));
                                this.f40507am.setOutlineProvider(ViewOutlineProvider.BACKGROUND);
                                this.f40507am.setClipToOutline(false);
                                this.f40507am.requestLayout();
                            }
                        } else {
                            this.f40501ag.setOutlineProvider(ViewOutlineProvider.BACKGROUND);
                            this.f40501ag.setClipToOutline(true);
                            if (FaceTecSDK.f40106a.f40089l.elevation > 0) {
                                GradientDrawable gradientDrawable3 = new GradientDrawable();
                                gradientDrawable3.setCornerRadius(fE);
                                gradientDrawable3.setStroke(iE, iE2);
                                gradientDrawable3.setColor(db.e(this, db.K()));
                                this.f40507am.setBackground(gradientDrawable3);
                                this.f40507am.setElevation(ay.e(FaceTecSDK.f40106a.f40089l.elevation));
                                this.f40507am.setOutlineProvider(ViewOutlineProvider.BACKGROUND);
                                this.f40507am.setClipToOutline(false);
                                this.f40507am.requestLayout();
                            }
                        }
                    }
                    FaceTecOverlayCustomization faceTecOverlayCustomization = FaceTecSDK.f40106a.f40085h;
                    int i31 = faceTecOverlayCustomization.brandingImage;
                    if (i31 != 0 && faceTecOverlayCustomization.showBrandingImage) {
                        this.aA.setImageDrawable(ContextCompat.getDrawable(this, i31));
                        this.aA.setVisibility(0);
                        float f14 = this.f40511g;
                        if (f14 > 0.0f) {
                            this.aA.setMaxWidth((int) f14);
                        } else {
                            this.aA.setMaxWidth(Resources.getSystem().getDisplayMetrics().widthPixels);
                            int i32 = aQ + 85;
                            aO = i32 % 128;
                            int i33 = i32 % 2;
                        }
                        if ((getResources().getConfiguration().screenLayout & 15) >= 3) {
                            this.f40504aj.setWeightSum(1.0f);
                            this.aA.setMaxHeight((int) ay.e(50));
                            LinearLayout.LayoutParams layoutParams6 = (LinearLayout.LayoutParams) this.aA.getLayoutParams();
                            ((ViewGroup.MarginLayoutParams) layoutParams6).topMargin = (int) ay.e(15);
                            layoutParams6.gravity = 48;
                            this.aA.setLayoutParams(layoutParams6);
                            this.aA.requestLayout();
                            this.f40504aj.requestLayout();
                        }
                    }
                    db.b(this.f40499ae);
                    if (e() == bh.b.GRANTED) {
                        ab();
                    }
                    W();
                    return;
                }
                int i34 = aO + 7;
                aQ = i34 % 128;
                if (i34 % 2 != 0) {
                    e(FaceTecSessionStatus.MISSING_GUIDANCE_IMAGES, (FaceTecIDScanStatus) null);
                    return;
                } else {
                    e(FaceTecSessionStatus.MISSING_GUIDANCE_IMAGES, (FaceTecIDScanStatus) null);
                    throw null;
                }
            } catch (Throwable th2) {
                e eVar2 = e.SEVERE_ERROR;
                StringBuilder sb3 = new StringBuilder("Unknown error: ");
                sb3.append(th2.getMessage());
                t.d(this, th2, eVar2, sb3.toString(), true ^ ag.f40233d);
                e(FaceTecSessionStatus.UNKNOWN_INTERNAL_ERROR, (FaceTecIDScanStatus) null);
                return;
            }
        } catch (am e5) {
            e eVar3 = e.CAMERA_ERROR;
            StringBuilder sb4 = new StringBuilder("FTCameraException: ");
            sb4.append(e5.getMessage());
            t.d(this, e5, eVar3, sb4.toString(), true ^ ag.f40233d);
            e(FaceTecSessionStatus.CAMERA_INITIALIZATION_ISSUE, (FaceTecIDScanStatus) null);
            return;
        } catch (ar e7) {
            e eVar4 = e.SEVERE_ERROR;
            StringBuilder sb5 = new StringBuilder("FTInternalException: ");
            sb5.append(e7.getMessage());
            t.d(this, e7, eVar4, sb5.toString(), true ^ ag.f40233d);
            e(FaceTecSessionStatus.UNKNOWN_INTERNAL_ERROR, (FaceTecIDScanStatus) null);
            return;
        }
        throw th;
    }

    @Override // com.facetec.sdk.bh, android.app.Activity
    public void onDestroy() {
        int i10 = aQ + 13;
        aO = i10 % 128;
        int i11 = i10 % 2;
        super.onDestroy();
        dn.a();
        FaceTecSDK.f40108c = FaceTecSDK.c.NORMAL;
        c cVar = this.f40525v;
        int i12 = 1;
        if (cVar == c.PRE_SESSION_STARTED) {
            int i13 = aQ + 61;
            aO = i13 % 128;
            int i14 = i13 % 2;
            ch.g(true);
        } else if (cVar == c.FACESCAN_SESSION_STARTED) {
            int i15 = aQ + 107;
            aO = i15 % 128;
            int i16 = i15 % 2;
            ch.a(true);
        }
        this.f40525v = c.NOT_STARTED;
        Handler handler = this.f40569b;
        if (handler != null) {
            int i17 = aQ + 97;
            aO = i17 % 128;
            if (i17 % 2 != 0) {
                handler.removeCallbacksAndMessages(null);
                throw null;
            }
            handler.removeCallbacksAndMessages(null);
        }
        if (this.aC != null && ((Float) b(new Object[]{this}, -1525704666, 1525704685, System.identityHashCode(this))).floatValue() != this.aI) {
            this.aK = true;
            e(((Float) b(new Object[]{this}, -1525704666, 1525704685, System.identityHashCode(this))).floatValue(), this.aI, 0);
            new Handler().postDelayed(new v3(this, i12), 800L);
        }
        O();
        dn.e();
        P();
    }

    @Override // android.app.Activity
    public void onNewIntent(Intent intent) {
        int i10 = aO + 53;
        aQ = i10 % 128;
        int i11 = i10 % 2;
        super.onNewIntent(intent);
        dr drVar = this.U;
        if (drVar != null) {
            int i12 = aQ + 9;
            aO = i12 % 128;
            if (i12 % 2 != 0) {
                this.f40496aa = true;
                if (!drVar.cd_(intent, this.aN)) {
                    return;
                }
            } else {
                this.f40496aa = true;
                if (!drVar.cd_(intent, this.aN)) {
                    return;
                }
            }
            this.T.b();
            int i13 = aQ + 63;
            aO = i13 % 128;
            int i14 = i13 % 2;
        }
    }

    @Override // com.facetec.sdk.bh, android.app.Activity
    public void onPause() throws Throwable {
        super.onPause();
        if (e() != bh.b.GRANTED) {
            return;
        }
        int i10 = 1;
        b(new Object[]{this}, 1511765678, -1511765673, System.identityHashCode(this));
        if (!(!this.R)) {
            int i11 = aQ + 55;
            aO = i11 % 128;
            int i12 = i11 % 2;
            this.Z = true;
            return;
        }
        if (ag.f40233d) {
            return;
        }
        if (isFinishing()) {
            cx.d(new o3(this, i10));
        } else if (!a()) {
            int i13 = aO + 89;
            aQ = i13 % 128;
            if (i13 % 2 == 0) {
                b();
                throw null;
            }
            b();
        }
        dn.e();
    }

    @Override // android.app.Activity, androidx.core.app.ActivityCompat.OnRequestPermissionsResultCallback
    public synchronized void onRequestPermissionsResult(int i10, @NonNull String[] strArr, @NonNull int[] iArr) {
        super.onRequestPermissionsResult(i10, strArr, iArr);
        a(false);
        if (i10 == 0) {
            int i11 = 1;
            try {
                SharedPreferences.Editor editorEdit = ((SharedPreferences) bg.a(new Object[]{this}, 1435759663, -1435759656, (int) System.currentTimeMillis())).edit();
                editorEdit.putBoolean("cameraPermissionsShown", true);
                editorEdit.apply();
                if (iArr.length == 1) {
                    int i12 = aQ + 107;
                    int i13 = i12 % 128;
                    aO = i13;
                    int i14 = i12 % 2;
                    if (iArr[0] == 0) {
                        int i15 = i13 + 57;
                        aQ = i15 % 128;
                        int i16 = i15 % 2;
                        ab();
                        if (!this.f40510f) {
                            int i17 = aQ + 105;
                            aO = i17 % 128;
                            int i18 = i17 % 2;
                            runOnUiThread(new b4(this, i11));
                            ag agVar = this.W;
                            if (agVar == null) {
                                b(new Object[]{this, 4}, -749463482, 749463503, 4);
                                return;
                            } else {
                                this.aJ = true;
                                agVar.e(new k4(this, i11));
                                this.W.b();
                            }
                        }
                        this.f40513i.m();
                        int i19 = aO + 71;
                        aQ = i19 % 128;
                        int i20 = i19 % 2;
                        return;
                    }
                }
                if (!this.f40510f) {
                    e eVar = e.NON_FATAL_ERROR;
                    FaceTecSessionStatus faceTecSessionStatus = FaceTecSessionStatus.CAMERA_PERMISSION_DENIED;
                    t.c(this, eVar, faceTecSessionStatus.toString());
                    e(faceTecSessionStatus, (FaceTecIDScanStatus) null);
                    return;
                }
                int i21 = aO + 43;
                aQ = i21 % 128;
                int i22 = i21 % 2;
                e eVar2 = e.NON_FATAL_ERROR;
                FaceTecIDScanStatus faceTecIDScanStatus = FaceTecIDScanStatus.CAMERA_PERMISSION_DENIED;
                t.c(this, eVar2, faceTecIDScanStatus.toString());
                c(faceTecIDScanStatus);
                int i23 = aQ + 97;
                aO = i23 % 128;
                if (i23 % 2 == 0) {
                } else {
                    throw null;
                }
            } catch (Exception e5) {
                e eVar3 = e.SEVERE_ERROR;
                StringBuilder sb2 = new StringBuilder("Camera Permission Request Error: ");
                sb2.append(e5.getMessage());
                t.d(this, e5, eVar3, sb2.toString(), true ^ ag.f40233d);
                e(FaceTecSessionStatus.UNKNOWN_INTERNAL_ERROR, (FaceTecIDScanStatus) null);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0055 A[Catch: all -> 0x0031, TryCatch #0 {all -> 0x0031, blocks: (B:3:0x0001, B:8:0x000f, B:10:0x0015, B:12:0x0023, B:15:0x0034, B:17:0x0038, B:19:0x0044, B:27:0x0055, B:24:0x004e, B:25:0x004f, B:28:0x0060, B:30:0x0064, B:32:0x006a, B:34:0x006e, B:36:0x007c, B:37:0x007f, B:39:0x0083, B:42:0x008a, B:44:0x008e, B:48:0x009e, B:50:0x00a4, B:52:0x00b0, B:54:0x00b6, B:59:0x00c7, B:88:0x0110, B:20:0x0048, B:57:0x00bd, B:61:0x00d3, B:64:0x00e1, B:65:0x00e9, B:67:0x00ef, B:71:0x00f5, B:75:0x00fb, B:77:0x00ff, B:81:0x0105, B:85:0x010b), top: B:93:0x0001, inners: #1, #2 }] */
    @Override // com.facetec.sdk.bh, android.app.Activity
    public synchronized void onResume() {
        bj bjVar;
        try {
            super.onResume();
            if (e() != bh.b.GRANTED) {
                return;
            }
            this.f40522s = false;
            ag agVar = this.W;
            if (agVar != null) {
                int i10 = aO + 83;
                int i11 = i10 % 128;
                aQ = i11;
                int i12 = i10 % 2;
                if (agVar instanceof al) {
                    int i13 = i11 + 41;
                    aO = i13 % 128;
                    int i14 = i13 % 2;
                    ((al) agVar).i();
                }
            }
            bj bjVar2 = this.f40516l;
            if (bjVar2 != null) {
                int i15 = aO + 51;
                aQ = i15 % 128;
                if (i15 % 2 == 0) {
                    int i16 = 0 / 0;
                    if (bjVar2.d() != null) {
                        ((al) this.f40516l.d()).i();
                    }
                } else if (bjVar2.d() != null) {
                    ((al) this.f40516l.d()).i();
                }
            }
            if (ag.f40233d && (!this.R) && (bjVar = this.f40516l) != null) {
                int i17 = aO + 9;
                aQ = i17 % 128;
                int i18 = i17 % 2;
                if (!bjVar.f40602k) {
                    bjVar.a();
                }
            }
            if (this.Z) {
                this.Z = false;
                I();
                return;
            }
            if (this.C) {
                int i19 = aQ;
                int i20 = i19 + 15;
                aO = i20 % 128;
                int i21 = i20 % 2;
                if (this.ab) {
                    return;
                }
                this.C = false;
                if (this.f40508an) {
                    int i22 = i19 + 103;
                    aO = i22 % 128;
                    int i23 = i22 % 2;
                    bj bjVar3 = this.f40516l;
                    if (bjVar3 != null && bjVar3.isAdded()) {
                        this.f40516l.M();
                        return;
                    }
                }
                try {
                    this.f40571d = cc.b((Activity) this);
                    if (!this.K) {
                        int i24 = aO + 23;
                        aQ = i24 % 128;
                        if (i24 % 2 == 0) {
                            Z();
                            this.W.b();
                            int i25 = 23 / 0;
                        } else {
                            Z();
                            this.W.b();
                        }
                    }
                    if (!E()) {
                        if (this.K) {
                            return;
                        }
                        if (this.M) {
                            return;
                        }
                        if (this.f40516l != null && this.ar) {
                            return;
                        }
                        if (this.N) {
                        } else {
                            K();
                        }
                    }
                } catch (Throwable th2) {
                    e eVar = e.SEVERE_ERROR;
                    StringBuilder sb2 = new StringBuilder("Unknown error: ");
                    sb2.append(th2.getMessage());
                    t.d(this, th2, eVar, sb2.toString(), !ag.f40233d);
                    e(FaceTecSessionStatus.UNKNOWN_INTERNAL_ERROR, (FaceTecIDScanStatus) null);
                }
            }
        } catch (Throwable th3) {
            throw th3;
        }
    }

    @Override // com.facetec.sdk.bh, android.app.Activity
    public void onStart() {
        int i10 = aO + 1;
        aQ = i10 % 128;
        int i11 = i10 % 2;
        super.onStart();
        if (i11 == 0) {
            throw null;
        }
    }

    @Override // android.app.Activity
    public void onStop() throws Throwable {
        super.onStop();
        if (e() != bh.b.GRANTED) {
            return;
        }
        b(new Object[]{this}, 1080483165, -1080483139, System.identityHashCode(this));
        this.f40522s = true;
        if (ag.f40233d) {
            return;
        }
        int i10 = aQ + 53;
        int i11 = i10 % 128;
        aO = i11;
        int i12 = i10 % 2;
        if (this.K || this.M) {
            return;
        }
        int i13 = i11 + 95;
        aQ = i13 % 128;
        int i14 = i13 % 2;
        if (this.F) {
            return;
        }
        e(true);
        dn.e();
        ag agVar = this.W;
        if ((agVar == null || !(agVar instanceof al)) && !this.O) {
            O();
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onWindowFocusChanged(boolean z10) {
        this.O = z10;
        if (e() != bh.b.GRANTED) {
            return;
        }
        if (!z10) {
            if (a() || isFinishing()) {
                return;
            }
            b();
            return;
        }
        if (E()) {
            return;
        }
        synchronized (this) {
            try {
                boolean z11 = this.K;
                if (z11 && !this.f40510f) {
                    b(FaceTecIDScanNextStep.SELECTION_SCREEN);
                } else if (z11 && this.f40510f && !this.f40508an) {
                    u();
                } else if (this.M) {
                    K();
                } else if (this.f40516l != null && this.ar) {
                    N();
                } else if (this.N) {
                    L();
                } else if (this.P) {
                    M();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // com.facetec.sdk.bh
    public final synchronized void q() {
        int i10 = aQ + 41;
        aO = i10 % 128;
        int i11 = i10 % 2;
        e(false);
        e eVar = e.NON_FATAL_ERROR;
        FaceTecIDScanStatus faceTecIDScanStatus = FaceTecIDScanStatus.LANDSCAPE_MODE_NOT_ALLOWED;
        t.c(this, eVar, faceTecIDScanStatus.toString());
        if (!this.f40508an) {
            e(FaceTecSessionStatus.LANDSCAPE_MODE_NOT_ALLOWED, (FaceTecIDScanStatus) null);
            int i12 = aO + 83;
            aQ = i12 % 128;
            if (i12 % 2 != 0) {
                return;
            } else {
                throw null;
            }
        }
        int i13 = aO + 125;
        aQ = i13 % 128;
        if (i13 % 2 != 0) {
            e(this.f40519p.getStatus(), faceTecIDScanStatus);
            return;
        } else {
            e(this.f40519p.getStatus(), faceTecIDScanStatus);
            throw null;
        }
        throw th;
    }

    @Override // com.facetec.sdk.bh
    public final void r() throws Throwable {
        int i10 = aO + 87;
        aQ = i10 % 128;
        int i11 = i10 % 2;
        c(false);
        this.f40515k.a(this, t.b.USER_CANCELLED);
        e eVar = e.NON_FATAL_ERROR;
        FaceTecSessionStatus faceTecSessionStatus = FaceTecSessionStatus.USER_CANCELLED;
        t.c(this, eVar, faceTecSessionStatus.toString());
        e(faceTecSessionStatus, (FaceTecIDScanStatus) null);
        int i12 = aO + 87;
        aQ = i12 % 128;
        if (i12 % 2 == 0) {
            int i13 = 48 / 0;
        }
    }

    @Override // com.facetec.sdk.bh
    public final synchronized void t() {
        try {
            if (!this.f40508an) {
                a(FaceTecSessionStatus.SESSION_COMPLETED_SUCCESSFULLY);
                return;
            }
            int i10 = aQ + 23;
            aO = i10 % 128;
            int i11 = i10 % 2;
            b(new Object[]{this, FaceTecIDScanStatus.SUCCESS}, -1431415695, 1431415697, System.identityHashCode(this));
            int i12 = aO + 67;
            aQ = i12 % 128;
            if (i12 % 2 != 0) {
            } else {
                throw null;
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final void v() {
        if (isFinishing()) {
            return;
        }
        int i10 = aO + 47;
        aQ = i10 % 128;
        if (i10 % 2 == 0) {
            throw null;
        }
        bj bjVar = this.f40516l;
        if (bjVar == null) {
            return;
        }
        if (bjVar.f40601j == bj.c.FRONT) {
            this.az = co.c.FRONT_SIDE;
        } else {
            this.az = co.c.BACK_SIDE;
        }
        if (!isFinishing()) {
            int i11 = aO + 37;
            aQ = i11 % 128;
            int i12 = i11 % 2;
            bj bjVar2 = this.f40516l;
            if (bjVar2 != null) {
                this.f40571d.d(bjVar2.f40604n);
                getFragmentManager().beginTransaction().remove(this.f40516l).commitAllowingStateLoss();
                this.f40516l = null;
                int i13 = aQ + 53;
                aO = i13 % 128;
                int i14 = i13 % 2;
            }
        }
        this.f40524u = co.a(true, this.az);
        getFragmentManager().beginTransaction().add(this.f40497ac, this.f40524u, "Results").commitAllowingStateLoss();
        if (FaceTecSDK.f40106a.f40090n.f40073e == FaceTecCancelButtonCustomization.ButtonLocation.CUSTOM) {
            ae();
        }
        d(new b() { // from class: com.facetec.sdk.x3
            @Override // com.facetec.sdk.be.b
            public final byte[] getIdScanBytes(String str) {
                return this.f42959a.j(str);
            }
        });
    }

    public final void w() {
        int i10 = aO + 59;
        aQ = i10 % 128;
        int i11 = i10 % 2;
        this.ay = false;
        this.aB = false;
        ValueAnimator valueAnimator = this.aC;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.aC.removeAllUpdateListeners();
        }
        int i12 = aO + 33;
        aQ = i12 % 128;
        int i13 = i12 % 2;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x001f A[Catch: all -> 0x0019, TryCatch #2 {all -> 0x0019, blocks: (B:3:0x0001, B:5:0x000f, B:16:0x001f, B:19:0x0027, B:26:0x0038, B:11:0x0018, B:14:0x001b, B:24:0x0036, B:7:0x0013), top: B:35:0x0001, inners: #0, #1 }] */
    /* JADX WARN: Code duplicated, block: B:18:0x0026  */
    /* JADX WARN: Code duplicated, block: B:19:0x0027 A[Catch: all -> 0x0019, TRY_LEAVE, TryCatch #2 {all -> 0x0019, blocks: (B:3:0x0001, B:5:0x000f, B:16:0x001f, B:19:0x0027, B:26:0x0038, B:11:0x0018, B:14:0x001b, B:24:0x0036, B:7:0x0013), top: B:35:0x0001, inners: #0, #1 }] */
    /* JADX WARN: Code duplicated, block: B:21:0x0033 A[DONT_GENERATE] */
    /* JADX WARN: Code duplicated, block: B:23:0x0035  */
    /* JADX WARN: Instruction removed from duplicated block: B:21:0x0033, please report this as an issue */
    private synchronized boolean E() {
        int i10;
        try {
            int i11 = aO + 27;
            aQ = i11 % 128;
            if (i11 % 2 == 0) {
                int i12 = 88 / 0;
                if (!this.H) {
                    if (!(!isFinishing())) {
                        i10 = aO + 13;
                        aQ = i10 % 128;
                        if (i10 % 2 != 0) {
                            return false;
                        }
                        throw null;
                    }
                }
            } else if (!this.H) {
                if (!(!isFinishing())) {
                    i10 = aO + 13;
                    aQ = i10 % 128;
                    if (i10 % 2 != 0) {
                        return false;
                    }
                    throw null;
                }
            }
            return true;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void H() throws Throwable {
        b(new Object[]{this}, -1556291264, 1556291267, System.identityHashCode(this));
    }

    private void J() {
        int i10 = aO + 33;
        aQ = i10 % 128;
        int i11 = i10 % 2;
        this.ar = false;
        getFragmentManager().beginTransaction().replace(this.f40497ac, this.f40516l, "IDScan").commitAllowingStateLoss();
        this.f40571d.b(this.f40516l.f40604n);
        this.f40516l.b(new b1(this, 1), 100L);
        int i12 = aQ + 67;
        aO = i12 % 128;
        int i13 = i12 % 2;
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0067  */
    /* JADX WARN: Code duplicated, block: B:17:0x006b  */
    /* JADX WARN: Code duplicated, block: B:20:0x0075  */
    /* JADX WARN: Code duplicated, block: B:21:0x0092  */
    private void K() {
        dn.e();
        if (!(!this.M)) {
            int i10 = aO + 5;
            aQ = i10 % 128;
            int i11 = i10 % 2;
            if (bs.h(this)) {
                int i12 = aQ + 85;
                aO = i12 % 128;
                int i13 = i12 % 2;
                e(FaceTecSessionStatus.LOCKED_OUT);
            }
            bs.e(new Object[]{this}, -1012379954, 1012379956, (int) System.currentTimeMillis());
        }
        if (this.f40527x != null) {
            int i14 = aQ + 117;
            aO = i14 % 128;
            int i15 = i14 % 2;
            if (getFragmentManager().findFragmentByTag("RetryZoom") == null) {
                if (this.f40527x == null) {
                    this.f40527x = cn.m();
                }
                if (this.M) {
                    int i16 = aQ + 1;
                    aO = i16 % 128;
                    int i17 = i16 % 2;
                    getFragmentManager().beginTransaction().add(this.f40497ac, this.f40527x, "RetryZoom").commitAllowingStateLoss();
                } else {
                    getFragmentManager().beginTransaction().replace(this.f40497ac, this.f40527x, "RetryZoom").commitAllowingStateLoss();
                }
            } else {
                this.f40527x.e((Context) this, true);
                int i18 = aQ + 87;
                aO = i18 % 128;
                int i19 = i18 % 2;
            }
        } else {
            if (this.f40527x == null) {
                this.f40527x = cn.m();
            }
            if (this.M) {
                int i110 = aQ + 1;
                aO = i110 % 128;
                int i111 = i110 % 2;
                getFragmentManager().beginTransaction().add(this.f40497ac, this.f40527x, "RetryZoom").commitAllowingStateLoss();
            } else {
                getFragmentManager().beginTransaction().replace(this.f40497ac, this.f40527x, "RetryZoom").commitAllowingStateLoss();
            }
        }
        this.M = false;
        if (FaceTecSDK.f40106a.f40090n.f40073e == FaceTecCancelButtonCustomization.ButtonLocation.CUSTOM) {
            a(300, 0);
        }
        d(1000);
    }

    private void L() throws Throwable {
        int i10 = aQ + 9;
        aO = i10 % 128;
        int i11 = i10 % 2;
        this.N = false;
        FragmentTransaction fragmentTransactionBeginTransaction = getFragmentManager().beginTransaction();
        this.f40526w = bz.d(this.aw);
        fragmentTransactionBeginTransaction.setCustomAnimations(R.animator.facetec_no_delay_fade_in, 0).add(this.f40497ac, this.f40526w, "OCRConfirmation").commitAllowingStateLoss();
        d(1000);
        t.e(new Object[]{cu.RESULT_OCR}, -590439926, 590439930, (int) System.currentTimeMillis());
        int i12 = aQ + 125;
        aO = i12 % 128;
        int i13 = i12 % 2;
    }

    private void M() throws Throwable {
        this.P = false;
        FragmentTransaction fragmentTransactionBeginTransaction = getFragmentManager().beginTransaction();
        this.B = new com.facetec.sdk.c();
        fragmentTransactionBeginTransaction.setCustomAnimations(R.animator.facetec_no_delay_fade_in, 0).add(this.f40497ac, this.B, "AdditionalReview").commitAllowingStateLoss();
        d(1000);
        t.e(new Object[]{cu.RESULT_ADDITIONAL_REVIEW}, -590439926, 590439930, (int) System.currentTimeMillis());
        int i10 = aQ + 85;
        aO = i10 % 128;
        int i11 = i10 % 2;
    }

    private void N() {
        if (this.f40524u == null) {
            J();
            int i10 = aO + 117;
            aQ = i10 % 128;
            int i11 = i10 % 2;
            return;
        }
        this.f40524u.e(new m4(this, 1));
        int i12 = aO + 101;
        aQ = i12 % 128;
        if (i12 % 2 == 0) {
            throw null;
        }
    }

    private void O() {
        ag agVar;
        synchronized (this.aE) {
            agVar = this.W;
            this.W = null;
        }
        if (agVar != null) {
            agVar.e();
        }
    }

    private void P() {
        int i10 = aQ + 53;
        aO = i10 % 128;
        if (i10 % 2 != 0) {
            this.f40509e = null;
            this.f40513i = null;
            this.f40527x = null;
            this.f40524u = null;
            this.f40526w = null;
            this.B = null;
            throw null;
        }
        this.f40509e = null;
        this.f40513i = null;
        this.f40527x = null;
        this.f40524u = null;
        this.f40526w = null;
        this.B = null;
        int i11 = aQ + 43;
        aO = i11 % 128;
        if (i11 % 2 != 0) {
            throw null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0026  */
    /* JADX WARN: Code duplicated, block: B:13:0x002a  */
    /* JADX WARN: Code duplicated, block: B:21:0x0051  */
    /* JADX WARN: Code duplicated, block: B:23:0x0055  */
    /* JADX WARN: Code duplicated, block: B:26:0x0067  */
    /* JADX WARN: Code duplicated, block: B:28:0x006b  */
    /* JADX WARN: Code duplicated, block: B:31:0x0086  */
    /* JADX WARN: Code duplicated, block: B:33:0x008b  */
    /* JADX WARN: Code duplicated, block: B:44:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:46:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:48:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:50:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:51:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:53:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:55:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:58:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:60:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:62:0x0107  */
    /* JADX WARN: Code duplicated, block: B:64:0x010d  */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x003e, code lost:
    
        if (getFragmentManager().findFragmentByTag("OCRConfirmation") != null) goto L15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private boolean Q() throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 306
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facetec.sdk.be.Q():boolean");
    }

    private float R() {
        return ((Float) b(new Object[]{this}, -1525704666, 1525704685, System.identityHashCode(this))).floatValue();
    }

    private void S() {
        if (this.aG == null) {
            this.aG = Integer.valueOf(db.e(this, FaceTecSDK.f40106a.f40085h.backgroundColor));
        }
        int i10 = 2;
        if (this.aD == null) {
            int i11 = aQ + 113;
            aO = i11 % 128;
            int i12 = i11 % 2;
            this.aD = Integer.valueOf(db.e(this, FaceTecSDK.f40106a.f40086i.backgroundColors));
            int i13 = aO + 103;
            aQ = i13 % 128;
            int i14 = i13 % 2;
        }
        if (this.aL == null) {
            this.aL = Integer.valueOf(db.e(this, FaceTecSDK.f40106a.f40089l.borderColor));
        }
        runOnUiThread(new b3(this, i10));
    }

    private float T() throws Settings.SettingNotFoundException {
        int i10 = aQ + 119;
        aO = i10 % 128;
        int i11 = i10 % 2;
        float f6 = Settings.System.getInt(getContentResolver(), "screen_brightness") / 255.0f;
        int i12 = aQ + 113;
        aO = i12 % 128;
        int i13 = i12 % 2;
        return f6;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:24:0x01ae  */
    /* JADX WARN: Code duplicated, block: B:27:0x0218  */
    /* JADX WARN: Code duplicated, block: B:28:0x0219 A[Catch: all -> 0x01ab, TryCatch #3 {all -> 0x01ab, blocks: (B:12:0x00df, B:16:0x014a, B:20:0x01a1, B:36:0x031a, B:40:0x037c, B:44:0x03d1, B:43:0x03a1, B:39:0x033d, B:49:0x043b, B:53:0x04a3, B:57:0x04fa, B:56:0x04c8, B:52:0x045e, B:19:0x016f, B:15:0x0106, B:25:0x01fe, B:29:0x0248, B:28:0x0219), top: B:85:0x0059 }] */
    @DoNotInline
    public void U() throws Throwable {
        Map map;
        Object declaredConstructor;
        Object[] objArrB$7c19d016;
        int i10 = aO + 125;
        aQ = i10 % 128;
        try {
            if (i10 % 2 == 0) {
                Class cls = (Class) bp.a(24 - View.getDefaultSize(0, 0), 483 - (ViewConfiguration.getScrollBarSize() >> 8), (char) ((ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) - 1));
                byte b10 = (byte) 2;
                byte b11 = (byte) (b10 - 2);
                Object[] objArr = new Object[1];
                aX(b10, b11, (byte) (b11 - 1), objArr);
                cls.getField((String) objArr[0]).getLong(null);
                throw null;
            }
            Class cls2 = (Class) bp.a((ViewConfiguration.getFadingEdgeLength() >> 16) + 24, (Process.myPid() >> 22) + 483, (char) ('0' - AndroidCharacter.getMirror('0')));
            byte b12 = (byte) 2;
            byte b13 = (byte) (b12 - 2);
            Object[] objArr2 = new Object[1];
            aX(b12, b13, (byte) (b13 - 1), objArr2);
            long j10 = cls2.getField((String) objArr2[0]).getLong(null);
            try {
                if (j10 != -1) {
                    long j11 = j10 + 1899;
                    Object[] objArr3 = new Object[1];
                    aY((byte) ((ViewConfiguration.getKeyRepeatDelay() >> 16) + 64), "\u0017\n\u0002\u0017\u0006\f\u0000\u0012\f\u0007\u0012\u0014\u0016\u0001\u000f\f\u0002\n\u0011\b\u0003\t", 22 - View.resolveSize(0, 0), objArr3);
                    Class<?> cls3 = Class.forName((String) objArr3[0]);
                    Object[] objArr4 = new Object[1];
                    aY((byte) (ExpandableListView.getPackedPositionGroup(0L) + 89), "\r\u000f\u0015\u000f\u0000\f\u0000\b\u000f\u0000\u0013\u0012\n\u0001㙘", 15 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), objArr4);
                    if (j11 >= ((Long) cls3.getDeclaredMethod((String) objArr4[0], new Class[0]).invoke(null, new Object[0])).longValue()) {
                        Class cls4 = (Class) bp.a(24 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), 483 - (ViewConfiguration.getScrollDefaultDelay() >> 16), (char) (1 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1))));
                        byte b14 = (byte) 0;
                        byte b15 = b14;
                        Object[] objArr5 = new Object[1];
                        aX(b14, b15, (byte) (b15 - 1), objArr5);
                        Object obj = cls4.getField((String) objArr5[0]).get(null);
                        Object[] objArr6 = {-1705959747, 0, 11};
                        Map map2 = bp.f40694x;
                        Object method = map2.get(482456668);
                        if (method == null) {
                            Class cls5 = (Class) bp.a(23 - ((byte) KeyEvent.getModifierMetaStateMask()), ((byte) KeyEvent.getModifierMetaStateMask()) + 484, (char) (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)));
                            byte b16 = (byte) 2;
                            byte b17 = (byte) (b16 - 2);
                            Object[] objArr7 = new Object[1];
                            aX(b16, b17, (byte) (b17 - 1), objArr7);
                            String str = (String) objArr7[0];
                            Class<?> cls6 = Integer.TYPE;
                            method = cls5.getMethod(str, cls6, cls6, cls6);
                            map2.put(482456668, method);
                        }
                        Object[] objArr8 = {obj, Integer.valueOf(((Integer) ((Method) method).invoke(null, objArr6)).intValue())};
                        Object method2 = map2.get(1372858038);
                        if (method2 == null) {
                            method2 = ((Class) bp.a(25 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), 1860 - Color.red(0), (char) (ViewConfiguration.getJumpTapTimeout() >> 16))).getMethod("b", Object[].class, Integer.TYPE);
                            map2.put(1372858038, method2);
                        }
                        objArrB$7c19d016 = (Object[]) ((Method) method2).invoke(null, objArr8);
                    } else {
                        Object[] objArr9 = new Object[1];
                        aY((byte) (37 - TextUtils.getTrimmedLength("")), "\u0005\u0015\n\u0018\u0010\u0013\u0017\n\u0014\u0013\u0018\u0016\u0007\u0016\u000f\u0005", 16 - Drawable.resolveOpacity(0, 0), objArr9);
                        Class<?> cls7 = Class.forName((String) objArr9[0]);
                        Object[] objArr10 = new Object[1];
                        aY((byte) (43 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1))), "\r\u0001\u000b\u000e\u0010\f\u0010\u0016\u000f\u0018\u0003\u0002\u0011\f\u0000\r", TextUtils.lastIndexOf("", '0', 0) + 17, objArr10);
                        int iIntValue = ((Integer) cls7.getMethod((String) objArr10[0], Object.class).invoke(null, this)).intValue();
                        Object[] objArr11 = {-995461662};
                        map = bp.f40694x;
                        declaredConstructor = map.get(-604395575);
                        if (declaredConstructor != null) {
                            declaredConstructor = ((Class) bp.a(24 - View.resolveSizeAndState(0, 0, 0), View.MeasureSpec.makeMeasureSpec(0, 0) + 459, (char) (Color.rgb(0, 0, 0) + 16777216))).getDeclaredConstructor(Integer.TYPE);
                            map.put(-604395575, declaredConstructor);
                        }
                        objArrB$7c19d016 = fq.b$7c19d016(iIntValue, ((Constructor) declaredConstructor).newInstance(objArr11));
                        Class cls8 = (Class) bp.a(24 - (ViewConfiguration.getFadingEdgeLength() >> 16), (KeyEvent.getMaxKeyCode() >> 16) + 483, (char) (ViewConfiguration.getKeyRepeatDelay() >> 16));
                        byte b18 = (byte) 0;
                        byte b19 = b18;
                        Object[] objArr12 = new Object[1];
                        aX(b18, b19, (byte) (b19 - 1), objArr12);
                        cls8.getField((String) objArr12[0]).set(null, objArrB$7c19d016);
                        try {
                            Object[] objArr13 = new Object[1];
                            aY((byte) (TextUtils.indexOf((CharSequence) "", '0') + 65), "\u0017\n\u0002\u0017\u0006\f\u0000\u0012\f\u0007\u0012\u0014\u0016\u0001\u000f\f\u0002\n\u0011\b\u0003\t", 22 - TextUtils.getOffsetAfter("", 0), objArr13);
                            Class<?> cls9 = Class.forName((String) objArr13[0]);
                            Object[] objArr14 = new Object[1];
                            aY((byte) (TextUtils.indexOf("", "", 0, 0) + 89), "\r\u000f\u0015\u000f\u0000\f\u0000\b\u000f\u0000\u0013\u0012\n\u0001㙘", KeyEvent.normalizeMetaState(0) + 15, objArr14);
                            Long lValueOf = Long.valueOf(((Long) cls9.getDeclaredMethod((String) objArr14[0], new Class[0]).invoke(null, new Object[0])).longValue());
                            Class cls10 = (Class) bp.a(Color.blue(0) + 24, 483 - Drawable.resolveOpacity(0, 0), (char) View.resolveSize(0, 0));
                            byte b20 = (byte) 2;
                            byte b21 = (byte) (b20 - 2);
                            Object[] objArr15 = new Object[1];
                            aX(b20, b21, (byte) (b21 - 1), objArr15);
                            cls10.getField((String) objArr15[0]).set(null, lValueOf);
                        } catch (Exception unused) {
                            throw new RuntimeException();
                        }
                    }
                } else {
                    Object[] objArr16 = new Object[1];
                    aY((byte) (37 - TextUtils.getTrimmedLength("")), "\u0005\u0015\n\u0018\u0010\u0013\u0017\n\u0014\u0013\u0018\u0016\u0007\u0016\u000f\u0005", 16 - Drawable.resolveOpacity(0, 0), objArr16);
                    Class<?> cls11 = Class.forName((String) objArr16[0]);
                    Object[] objArr17 = new Object[1];
                    aY((byte) (43 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1))), "\r\u0001\u000b\u000e\u0010\f\u0010\u0016\u000f\u0018\u0003\u0002\u0011\f\u0000\r", TextUtils.lastIndexOf("", '0', 0) + 17, objArr17);
                    int iIntValue2 = ((Integer) cls11.getMethod((String) objArr17[0], Object.class).invoke(null, this)).intValue();
                    Object[] objArr18 = {-995461662};
                    map = bp.f40694x;
                    declaredConstructor = map.get(-604395575);
                    if (declaredConstructor != null) {
                        declaredConstructor = ((Class) bp.a(24 - View.resolveSizeAndState(0, 0, 0), View.MeasureSpec.makeMeasureSpec(0, 0) + 459, (char) (Color.rgb(0, 0, 0) + 16777216))).getDeclaredConstructor(Integer.TYPE);
                        map.put(-604395575, declaredConstructor);
                    }
                    objArrB$7c19d016 = fq.b$7c19d016(iIntValue2, ((Constructor) declaredConstructor).newInstance(objArr18));
                    Class cls12 = (Class) bp.a(24 - (ViewConfiguration.getFadingEdgeLength() >> 16), (KeyEvent.getMaxKeyCode() >> 16) + 483, (char) (ViewConfiguration.getKeyRepeatDelay() >> 16));
                    byte b110 = (byte) 0;
                    byte b111 = b110;
                    Object[] objArr19 = new Object[1];
                    aX(b110, b111, (byte) (b111 - 1), objArr19);
                    cls12.getField((String) objArr19[0]).set(null, objArrB$7c19d016);
                    Object[] objArr110 = new Object[1];
                    aY((byte) (TextUtils.indexOf((CharSequence) "", '0') + 65), "\u0017\n\u0002\u0017\u0006\f\u0000\u0012\f\u0007\u0012\u0014\u0016\u0001\u000f\f\u0002\n\u0011\b\u0003\t", 22 - TextUtils.getOffsetAfter("", 0), objArr110);
                    Class<?> cls13 = Class.forName((String) objArr110[0]);
                    Object[] objArr111 = new Object[1];
                    aY((byte) (TextUtils.indexOf("", "", 0, 0) + 89), "\r\u000f\u0015\u000f\u0000\f\u0000\b\u000f\u0000\u0013\u0012\n\u0001㙘", KeyEvent.normalizeMetaState(0) + 15, objArr111);
                    Long lValueOf2 = Long.valueOf(((Long) cls13.getDeclaredMethod((String) objArr111[0], new Class[0]).invoke(null, new Object[0])).longValue());
                    Class cls14 = (Class) bp.a(Color.blue(0) + 24, 483 - Drawable.resolveOpacity(0, 0), (char) View.resolveSize(0, 0));
                    byte b22 = (byte) 2;
                    byte b23 = (byte) (b22 - 2);
                    Object[] objArr112 = new Object[1];
                    aX(b22, b23, (byte) (b23 - 1), objArr112);
                    cls14.getField((String) objArr112[0]).set(null, lValueOf2);
                }
                int i11 = ((int[]) objArrB$7c19d016[1])[0];
                int i12 = ((int[]) objArrB$7c19d016[0])[0];
                if (i12 == i11) {
                    int i13 = aQ + 19;
                    aO = i13 % 128;
                    int i14 = i13 % 2;
                    Object[] objArr20 = {Integer.valueOf(((int[]) objArrB$7c19d016[2])[0]), 0, 11};
                    Map map3 = bp.f40694x;
                    Object method3 = map3.get(482456668);
                    if (method3 == null) {
                        Class cls15 = (Class) bp.a(ExpandableListView.getPackedPositionType(0L) + 24, 483 - TextUtils.indexOf("", "", 0, 0), (char) TextUtils.getOffsetBefore("", 0));
                        byte b24 = (byte) 2;
                        byte b25 = (byte) (b24 - 2);
                        Object[] objArr21 = new Object[1];
                        aX(b24, b25, (byte) (b25 - 1), objArr21);
                        String str2 = (String) objArr21[0];
                        Class<?> cls16 = Integer.TYPE;
                        method3 = cls15.getMethod(str2, cls16, cls16, cls16);
                        map3.put(482456668, method3);
                    }
                    Object[] objArr22 = {objArrB$7c19d016, Integer.valueOf(((Integer) ((Method) method3).invoke(null, objArr20)).intValue())};
                    Object method4 = map3.get(1372858038);
                    if (method4 == null) {
                        method4 = ((Class) bp.a(24 - (ViewConfiguration.getFadingEdgeLength() >> 16), View.combineMeasuredStates(0, 0) + 1860, (char) KeyEvent.keyCodeFromString(""))).getMethod("b", Object[].class, Integer.TYPE);
                        map3.put(1372858038, method4);
                    }
                    ((Method) method4).invoke(null, objArr22);
                    return;
                }
                long j12 = ((long) (i11 ^ i12)) ^ 4901335507608272896L;
                int i15 = aO + 97;
                aQ = i15 % 128;
                int i16 = i15 % 2;
                try {
                    Object[] objArr23 = {Long.valueOf(j12), 1141181103L};
                    byte[] bArr = $$d;
                    byte b26 = (byte) (bArr[0] - 1);
                    Object[] objArr24 = new Object[1];
                    aZ(b26, b26, bArr[9], objArr24);
                    Class<?> cls17 = Class.forName((String) objArr24[0]);
                    byte b27 = bArr[9];
                    byte b28 = b27;
                    Object[] objArr25 = new Object[1];
                    aZ(b27, b28, b28, objArr25);
                    String str3 = (String) objArr25[0];
                    Class<?> cls18 = Long.TYPE;
                    cls17.getMethod(str3, cls18, cls18).invoke(null, objArr23);
                    Object[] objArr26 = {Integer.valueOf(((int[]) objArrB$7c19d016[2])[0]), 0, 11};
                    Map map4 = bp.f40694x;
                    Object method5 = map4.get(482456668);
                    if (method5 == null) {
                        Class cls19 = (Class) bp.a(24 - TextUtils.indexOf("", "", 0, 0), 531 - AndroidCharacter.getMirror('0'), (char) (1 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1))));
                        byte b29 = (byte) 2;
                        byte b30 = (byte) (b29 - 2);
                        Object[] objArr27 = new Object[1];
                        aX(b29, b30, (byte) (b30 - 1), objArr27);
                        String str4 = (String) objArr27[0];
                        Class<?> cls20 = Integer.TYPE;
                        method5 = cls19.getMethod(str4, cls20, cls20, cls20);
                        map4.put(482456668, method5);
                    }
                    Object[] objArr28 = {objArrB$7c19d016, Integer.valueOf(((Integer) ((Method) method5).invoke(null, objArr26)).intValue())};
                    Object method6 = map4.get(1372858038);
                    if (method6 == null) {
                        method6 = ((Class) bp.a(23 - MotionEvent.axisFromString(""), 1861 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), (char) (ViewConfiguration.getKeyRepeatDelay() >> 16))).getMethod("b", Object[].class, Integer.TYPE);
                        map4.put(1372858038, method6);
                    }
                    ((Method) method6).invoke(null, objArr28);
                    int i17 = aQ + 45;
                    aO = i17 % 128;
                    if (i17 % 2 != 0) {
                        throw null;
                    }
                } catch (Throwable th2) {
                    Throwable cause = th2.getCause();
                    if (cause == null) {
                        throw th2;
                    }
                    throw cause;
                }
            } catch (Throwable th3) {
                Throwable cause2 = th3.getCause();
                if (cause2 == null) {
                    throw th3;
                }
                throw cause2;
            }
        } catch (Exception unused2) {
            throw new RuntimeException();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:10:0x0020, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0021, code lost:
    
        r5.aJ = false;
        runOnUiThread(new com.facetec.sdk.v2(r5, r2));
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x002b, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0012, code lost:
    
        if (r5.aJ == false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0017, code lost:
    
        if (r5.aJ == false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0019, code lost:
    
        r1 = r1 + 79;
        com.facetec.sdk.be.aQ = r1 % 128;
        r1 = r1 % 2;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void V() {
        /*
            r5 = this;
            int r0 = com.facetec.sdk.be.aQ
            int r0 = r0 + 111
            int r1 = r0 % 128
            com.facetec.sdk.be.aO = r1
            r2 = 2
            int r0 = r0 % r2
            r3 = 0
            if (r0 == 0) goto L15
            boolean r0 = r5.aJ
            r4 = 92
            int r4 = r4 / r3
            if (r0 != 0) goto L21
            goto L19
        L15:
            boolean r0 = r5.aJ
            if (r0 != 0) goto L21
        L19:
            int r1 = r1 + 79
            int r0 = r1 % 128
            com.facetec.sdk.be.aQ = r0
            int r1 = r1 % r2
            return
        L21:
            r5.aJ = r3
            com.facetec.sdk.v2 r0 = new com.facetec.sdk.v2
            r0.<init>(r5, r2)
            r5.runOnUiThread(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facetec.sdk.be.V():void");
    }

    /* JADX WARN: Code duplicated, block: B:22:0x005f A[Catch: all -> 0x003e, TryCatch #2 {all -> 0x003e, blocks: (B:3:0x0001, B:5:0x0035, B:8:0x0041, B:10:0x0045, B:12:0x0050, B:22:0x005f, B:24:0x0063, B:27:0x0078, B:28:0x007a, B:31:0x0080, B:33:0x0087, B:34:0x0093, B:35:0x0097, B:37:0x00a4, B:18:0x0059, B:19:0x005a, B:38:0x00b2, B:14:0x0054), top: B:48:0x0001, inners: #0 }] */
    /* JADX WARN: Code duplicated, block: B:24:0x0063 A[Catch: all -> 0x003e, TRY_LEAVE, TryCatch #2 {all -> 0x003e, blocks: (B:3:0x0001, B:5:0x0035, B:8:0x0041, B:10:0x0045, B:12:0x0050, B:22:0x005f, B:24:0x0063, B:27:0x0078, B:28:0x007a, B:31:0x0080, B:33:0x0087, B:34:0x0093, B:35:0x0097, B:37:0x00a4, B:18:0x0059, B:19:0x005a, B:38:0x00b2, B:14:0x0054), top: B:48:0x0001, inners: #0 }] */
    /* JADX WARN: Code duplicated, block: B:27:0x0078 A[Catch: all -> 0x003e, TRY_ENTER, TRY_LEAVE, TryCatch #2 {all -> 0x003e, blocks: (B:3:0x0001, B:5:0x0035, B:8:0x0041, B:10:0x0045, B:12:0x0050, B:22:0x005f, B:24:0x0063, B:27:0x0078, B:28:0x007a, B:31:0x0080, B:33:0x0087, B:34:0x0093, B:35:0x0097, B:37:0x00a4, B:18:0x0059, B:19:0x005a, B:38:0x00b2, B:14:0x0054), top: B:48:0x0001, inners: #0 }] */
    /* JADX WARN: Code duplicated, block: B:30:0x007e  */
    /* JADX WARN: Code duplicated, block: B:33:0x0087 A[Catch: all -> 0x003e, Exception -> 0x00a4, TRY_ENTER, TryCatch #1 {Exception -> 0x00a4, blocks: (B:28:0x007a, B:33:0x0087, B:34:0x0093, B:35:0x0097), top: B:46:0x007a }] */
    /* JADX WARN: Code duplicated, block: B:35:0x0097 A[Catch: all -> 0x003e, Exception -> 0x00a4, TRY_LEAVE, TryCatch #1 {Exception -> 0x00a4, blocks: (B:28:0x007a, B:33:0x0087, B:34:0x0093, B:35:0x0097), top: B:46:0x007a }] */
    private synchronized void W() {
        int i10;
        ag agVar;
        Runnable n4Var;
        try {
            int i11 = aO + 45;
            aQ = i11 % 128;
            int i12 = 2;
            int i13 = i11 % 2;
            bh.b bVarE = e();
            ch.d();
            int i14 = 1;
            float fFloatValue = ((Float) b(new Object[]{this}, -1525704666, 1525704685, System.identityHashCode(this))).floatValue();
            this.aI = fFloatValue;
            if (fFloatValue > 0.70000005f) {
                this.aH = true;
                e(fFloatValue, 0.6f, 0);
            }
            if (bVarE == bh.b.GRANTED) {
                int i15 = aQ + 79;
                int i16 = i15 % 128;
                aO = i16;
                if (i15 % 2 != 0) {
                    int i17 = 56 / 0;
                    if (!this.f40510f) {
                        if (this.W == null) {
                            b(new Object[]{this, 1}, -749463482, 749463503, 1);
                            return;
                        }
                        this.aJ = true;
                        try {
                            if (this.V) {
                                i10 = i16 + 89;
                                aQ = i10 % 128;
                                if (i10 % 2 == 0) {
                                    this.f40500af.setVisibility(0);
                                    agVar = this.W;
                                    n4Var = new i1(this, i14);
                                } else {
                                    this.f40500af.setVisibility(0);
                                    agVar = this.W;
                                    n4Var = new n4(this, i12);
                                }
                                agVar.e(n4Var);
                            }
                        } catch (Exception unused) {
                        }
                        this.W.b();
                        int i18 = aQ + 123;
                        aO = i18 % 128;
                        int i19 = i18 % 2;
                    }
                } else if (!this.f40510f) {
                    if (this.W == null) {
                        b(new Object[]{this, 1}, -749463482, 749463503, 1);
                        return;
                    }
                    this.aJ = true;
                    if (this.V) {
                        i10 = i16 + 89;
                        aQ = i10 % 128;
                        if (i10 % 2 == 0) {
                            this.f40500af.setVisibility(0);
                            agVar = this.W;
                            n4Var = new i1(this, i14);
                        } else {
                            this.f40500af.setVisibility(0);
                            agVar = this.W;
                            n4Var = new n4(this, i12);
                        }
                        agVar.e(n4Var);
                    }
                    this.W.b();
                    int i110 = aQ + 123;
                    aO = i110 % 128;
                    int i111 = i110 % 2;
                }
            }
            t.f42832c = true;
            t.f42831b = 0;
            this.f40513i = bo.c(bVarE, this.f40510f);
            getFragmentManager().beginTransaction().replace(this.f40497ac, this.f40513i, "PreEnroll").commitAllowingStateLoss();
        } catch (Throwable th2) {
            throw th2;
        }
    }

    private synchronized void X() {
        int i10 = aO + 19;
        aQ = i10 % 128;
        int i11 = i10 % 2;
        if (E()) {
            return;
        }
        int i12 = 1;
        if (this.W == null) {
            b(new Object[]{this, 2}, -749463482, 749463503, 2);
            return;
        }
        ImageView imageView = this.f40518o;
        if (imageView != null) {
            imageView.setEnabled(false);
            new Handler(Looper.getMainLooper()).postDelayed(new z2(this, i12), 800L);
        }
        this.W.b();
        if ((FaceTecSDK.f40108c == FaceTecSDK.c.LOW_LIGHT || FaceTecSDK.f40108c == FaceTecSDK.c.LOW_LIGHT_FROM_SENSOR) && !this.ay) {
            int i13 = aO + 9;
            aQ = i13 % 128;
            int i14 = i13 % 2;
            this.ay = true;
            this.aH = false;
            this.aK = false;
            e(this.aF.e(), this.aF.f40991b ? 0.55f : 0.8f, 0);
        }
        FragmentTransaction fragmentTransactionBeginTransaction = getFragmentManager().beginTransaction();
        if (this.f40513i == null && this.f40527x == null) {
            fragmentTransactionBeginTransaction.setCustomAnimations(R.animator.facetec_no_delay_fade_in, 0).replace(this.f40497ac, this.f40509e, "Zoom").commitAllowingStateLoss();
        } else {
            fragmentTransactionBeginTransaction.replace(this.f40497ac, this.f40509e, "Zoom").commitAllowingStateLoss();
            this.f40513i = null;
            this.f40527x = null;
        }
        dn.c(this);
    }

    private void Y() throws Throwable {
        b(new Object[]{this}, 695221187, -695221167, System.identityHashCode(this));
    }

    private synchronized void Z() throws am {
        int i10 = aO + 43;
        aQ = i10 % 128;
        int i11 = i10 % 2;
        this.f40509e = az.a();
        if (this.W == null) {
            int i12 = aQ + 107;
            aO = i12 % 128;
            int i13 = i12 % 2;
            ag agVarQ_ = ag.q_(this.f40500af, this, false);
            this.W = agVarQ_;
            this.V = agVarQ_ instanceof ai;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void f(boolean z10) {
        int i10 = aO + 65;
        aQ = i10 % 128;
        int i11 = i10 % 2;
        if (bg.b()) {
            this.D = ch.D();
            this.f40529z = ch.C();
            if (this.f40529z.length > 0) {
                this.f40523t = BitmapFactory.decodeByteArray(this.f40529z[0], 0, this.f40529z[0].length);
            }
        }
        try {
            if (bg.d()) {
                int i12 = aO + 83;
                aQ = i12 % 128;
                int i13 = i12 % 2;
                if (z10) {
                    FaceTecSessionResult faceTecSessionResult = new FaceTecSessionResult(FaceTecSessionStatus.SESSION_UNSUCCESSFUL, this.D, this.f40529z, ch.s());
                    faceTecSessionResult.e(cc.f40802c);
                    this.f40515k.b(this, faceTecSessionResult, bg.f40537a);
                }
            }
        } catch (Exception unused) {
        }
        this.f40515k.d();
        if (this.f40509e != null) {
            az azVar = this.f40509e;
            az.a(new Object[]{azVar}, -1297348129, 1297348131, System.identityHashCode(azVar));
        }
    }

    private static /* synthetic */ Object j(Object[] objArr) {
        be beVar = (be) objArr[0];
        ValueAnimator valueAnimator = (ValueAnimator) objArr[1];
        int i10 = aQ + 45;
        aO = i10 % 128;
        int i11 = i10 % 2;
        Integer num = (Integer) valueAnimator.getAnimatedValue();
        beVar.aG = num;
        beVar.f40528y.setBackgroundColor(num.intValue());
        beVar.f40528y.invalidate();
        int i12 = aO + 33;
        aQ = i12 % 128;
        if (i12 % 2 != 0) {
            return null;
        }
        throw null;
    }

    public final void A() throws Throwable {
        b(new Object[]{this}, 666961326, -666961311, System.identityHashCode(this));
    }

    public final void B() {
        int i10;
        int i11 = aQ + 121;
        int i12 = i11 % 128;
        aO = i12;
        if (i11 % 2 != 0) {
            throw null;
        }
        if (this.S) {
            return;
        }
        int i13 = 1;
        this.S = true;
        if (!this.f40510f) {
            i10 = 400;
        } else {
            int i14 = i12 + 43;
            aQ = i14 % 128;
            i10 = i14 % 2 == 0 ? 83 : 50;
        }
        new Handler(Looper.getMainLooper()).postDelayed(new n4(this, i13), i10);
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0029  */
    /* JADX WARN: Code duplicated, block: B:12:0x0032  */
    /* JADX WARN: Code duplicated, block: B:9:0x001e  */
    public final void C() {
        int i10;
        int i11 = aO + 95;
        aQ = i11 % 128;
        int i12 = 2;
        if (i11 % 2 == 0) {
            e(true);
            if (this.f40569b != null) {
                i10 = aQ + 39;
                aO = i10 % 128;
                if (i10 % 2 != 0) {
                    this.f40569b.removeCallbacks(null);
                    int i13 = 24 / 0;
                } else {
                    this.f40569b.removeCallbacks(null);
                }
            }
        } else {
            e(false);
            if (this.f40569b != null) {
                i10 = aQ + 39;
                aO = i10 % 128;
                if (i10 % 2 != 0) {
                    this.f40569b.removeCallbacks(null);
                    int i14 = 24 / 0;
                } else {
                    this.f40569b.removeCallbacks(null);
                }
            }
        }
        if (!this.I) {
            e(FaceTecSessionStatus.USER_CANCELLED_VIA_CLICKABLE_READY_SCREEN_SUBTEXT, (FaceTecIDScanStatus) null);
            int i15 = aQ + 103;
            aO = i15 % 128;
            int i16 = i15 % 2;
            return;
        }
        int i17 = aO + 97;
        aQ = i17 % 128;
        int i18 = i17 % 2;
        this.f40515k.a(this, t.b.USER_CANCELLED);
        cx.b(new l4(this, i12));
    }

    public final void D() throws Throwable {
        b(new Object[]{this}, 560820595, -560820591, System.identityHashCode(this));
    }

    public final void F() throws Throwable {
        b(new Object[]{this}, -545945752, 545945777, System.identityHashCode(this));
    }

    public final void G() throws Throwable {
        int i10 = aO + 123;
        aQ = i10 % 128;
        if (i10 % 2 == 0) {
            this.f40496aa = false;
            b(new Object[]{this}, 1080483165, -1080483139, System.identityHashCode(this));
            b(new Object[]{this, Boolean.FALSE}, -11714907, 11714914, System.identityHashCode(this));
        } else {
            this.f40496aa = false;
            b(new Object[]{this}, 1080483165, -1080483139, System.identityHashCode(this));
            b(new Object[]{this, Boolean.TRUE}, -11714907, 11714914, System.identityHashCode(this));
        }
        int i11 = aO + 47;
        aQ = i11 % 128;
        if (i11 % 2 == 0) {
            throw null;
        }
    }

    public final void I() throws Throwable {
        b(new Object[]{this}, 1511765678, -1511765673, System.identityHashCode(this));
        this.ax = new cw(new t0(this, 1));
        Timer timer = new Timer();
        this.au = timer;
        timer.scheduleAtFixedRate(this.ax, 250L, 500L);
        int i10 = aQ + 3;
        aO = i10 % 128;
        if (i10 % 2 != 0) {
            throw null;
        }
    }

    public synchronized void s() {
        int i10 = aQ + 63;
        aO = i10 % 128;
        int i11 = i10 % 2;
        this.f40516l.e();
        int i12 = aO + 63;
        aQ = i12 % 128;
        if (i12 % 2 == 0) {
            throw null;
        }
    }

    public final void u() throws Throwable {
        int i10 = aO + 39;
        aQ = i10 % 128;
        int i11 = i10 % 2;
        b(this.f40521r, true);
        this.K = true;
        int i12 = aO + 39;
        aQ = i12 % 128;
        if (i12 % 2 == 0) {
            throw null;
        }
    }

    public final void x() throws Throwable {
        b(new Object[]{this}, 226858727, -226858700, System.identityHashCode(this));
    }

    public final boolean y() {
        int i10 = aO;
        int i11 = i10 + 105;
        aQ = i11 % 128;
        int i12 = i11 % 2;
        boolean z10 = this.C;
        int i13 = i10 + 119;
        aQ = i13 % 128;
        if (i13 % 2 != 0) {
            return z10;
        }
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:9:0x002f  */
    public final void z() throws Throwable {
        int i10 = aO + 63;
        aQ = i10 % 128;
        int i11 = 2;
        if (i10 % 2 == 0) {
            t.c(this, e.DEVELOPER_USED_FACESCAN_CALLBACK, OptionListAnalyticsHandler.RETRY);
            this.H = false;
            this.G = true;
            this.F = false;
            if (this.f40571d != null) {
                cc ccVar = this.f40571d;
                ccVar.f40804b = false;
                ccVar.c(true);
                int i12 = aQ + 95;
                aO = i12 % 128;
                int i13 = i12 % 2;
            }
        } else {
            t.c(this, e.DEVELOPER_USED_FACESCAN_CALLBACK, OptionListAnalyticsHandler.RETRY);
            this.H = false;
            this.G = false;
            this.F = false;
            if (this.f40571d != null) {
                cc ccVar2 = this.f40571d;
                ccVar2.f40804b = false;
                ccVar2.c(true);
                int i14 = aQ + 95;
                aO = i14 % 128;
                int i15 = i14 % 2;
            }
        }
        this.M = true;
        runOnUiThread(new d1(this, i11));
    }

    @Override // com.facetec.sdk.bh
    public final void i() {
        w2 w2Var;
        int i10 = aQ + 81;
        aO = i10 % 128;
        if (i10 % 2 != 0) {
            this.I = true;
            this.W.d();
            w2Var = new w2();
        } else {
            this.I = true;
            this.W.d();
            w2Var = new w2();
        }
        cx.d(w2Var);
    }

    @Override // com.facetec.sdk.bh
    public final void l() {
        int i10 = aO + 37;
        aQ = i10 % 128;
        int i11 = i10 % 2;
        ch.T(dn.d());
        az.f40415d = true;
        X();
        int i12 = aO + 55;
        aQ = i12 % 128;
        int i13 = i12 % 2;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0032 A[Catch: all -> 0x0019, TryCatch #1 {all -> 0x0019, blocks: (B:3:0x0001, B:5:0x0010, B:12:0x0023, B:14:0x0032, B:15:0x0040, B:18:0x004f, B:19:0x0050, B:25:0x0072, B:10:0x001b, B:23:0x0070, B:16:0x004d), top: B:30:0x0001, inners: #0, #2 }] */
    /* JADX WARN: Code duplicated, block: B:15:0x0040 A[Catch: all -> 0x0019, TRY_LEAVE, TryCatch #1 {all -> 0x0019, blocks: (B:3:0x0001, B:5:0x0010, B:12:0x0023, B:14:0x0032, B:15:0x0040, B:18:0x004f, B:19:0x0050, B:25:0x0072, B:10:0x001b, B:23:0x0070, B:16:0x004d), top: B:30:0x0001, inners: #0, #2 }] */
    private synchronized void c(FaceTecIDScanStatus faceTecIDScanStatus) {
        int i10;
        try {
            int i11 = aO;
            int i12 = i11 + 67;
            aQ = i12 % 128;
            if (i12 % 2 == 0) {
                this.H = true;
                this.G = false;
                if (this.f40571d != null) {
                    i10 = i11 + 5;
                    aQ = i10 % 128;
                    if (i10 % 2 != 0) {
                        cc ccVar = this.f40571d;
                        cc.e(new Object[]{ccVar}, -583599493, 583599499, System.identityHashCode(ccVar));
                    } else {
                        cc ccVar2 = this.f40571d;
                        cc.e(new Object[]{ccVar2}, -583599493, 583599499, System.identityHashCode(ccVar2));
                        throw null;
                    }
                }
                throw th;
            }
            this.H = true;
            this.G = false;
            if (this.f40571d != null) {
                i10 = i11 + 5;
                aQ = i10 % 128;
                if (i10 % 2 != 0) {
                    cc ccVar3 = this.f40571d;
                    cc.e(new Object[]{ccVar3}, -583599493, 583599499, System.identityHashCode(ccVar3));
                } else {
                    cc ccVar4 = this.f40571d;
                    cc.e(new Object[]{ccVar4}, -583599493, 583599499, System.identityHashCode(ccVar4));
                    throw null;
                }
                throw th;
            }
            b(new Object[]{this, faceTecIDScanStatus}, -1431415695, 1431415697, System.identityHashCode(this));
            int i13 = aO + 49;
            aQ = i13 % 128;
            if (i13 % 2 == 0) {
                throw null;
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // com.facetec.sdk.bh
    public final synchronized void k() {
        try {
            int i10 = aQ + 47;
            aO = i10 % 128;
            if (i10 % 2 != 0) {
                this.f40515k.a(this, t.b.USER_CANCELLED);
                e eVar = e.NON_FATAL_ERROR;
                FaceTecSessionStatus faceTecSessionStatus = FaceTecSessionStatus.USER_CANCELLED;
                t.c(this, eVar, faceTecSessionStatus.toString());
                e(faceTecSessionStatus, (FaceTecIDScanStatus) null);
                int i11 = 78 / 0;
            } else {
                this.f40515k.a(this, t.b.USER_CANCELLED);
                e eVar2 = e.NON_FATAL_ERROR;
                FaceTecSessionStatus faceTecSessionStatus2 = FaceTecSessionStatus.USER_CANCELLED;
                t.c(this, eVar2, faceTecSessionStatus2.toString());
                e(faceTecSessionStatus2, (FaceTecIDScanStatus) null);
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final void a(FaceTecSessionStatus faceTecSessionStatus) {
        int i10 = aO + 23;
        aQ = i10 % 128;
        int i11 = i10 % 2;
        b(faceTecSessionStatus, (FaceTecIDScanStatus) null);
        int i12 = aQ + 57;
        aO = i12 % 128;
        if (i12 % 2 != 0) {
            throw null;
        }
    }

    private static /* synthetic */ Object t(Object[] objArr) {
        be beVar = (be) objArr[0];
        int i10 = aO;
        int i11 = i10 + 55;
        aQ = i11 % 128;
        int i12 = i11 % 2;
        dr drVar = beVar.U;
        if (drVar != null) {
            if (!beVar.f40522s) {
                int i13 = i10 + 111;
                aQ = i13 % 128;
                int i14 = i13 % 2;
                try {
                    drVar.e();
                    int i15 = aO + 55;
                    aQ = i15 % 128;
                    int i16 = i15 % 2;
                } catch (Exception unused) {
                }
            }
            beVar.U = null;
        }
        int i17 = aQ + 115;
        aO = i17 % 128;
        int i18 = i17 % 2;
        return null;
    }

    @Override // com.facetec.sdk.bh
    public final synchronized void d() {
        int i10 = aQ + 29;
        aO = i10 % 128;
        try {
            if (i10 % 2 != 0) {
                as.e(this);
                this.f40515k.a(this, t.b.USER_WAS_SUCCESSFUL);
                b(new Object[]{this}, 987633992, -987633974, System.identityHashCode(this));
                bs.b(this);
                int i11 = 98 / 0;
            } else {
                as.e(this);
                this.f40515k.a(this, t.b.USER_WAS_SUCCESSFUL);
                b(new Object[]{this}, 987633992, -987633974, System.identityHashCode(this));
                bs.b(this);
            }
        } catch (Throwable th2) {
            t.c(this, e.LOG_SUCCESSFUL_ENROLLMENT_ERROR, th2.getMessage());
        }
        this.H = true;
        this.G = true;
        if (FaceTecSDK.f40106a.vocalGuidanceCustomization.mode == FaceTecVocalGuidanceCustomization.VocalGuidanceMode.FULL_VOCAL_GUIDANCE) {
            int i12 = aQ + 105;
            aO = i12 % 128;
            if (i12 % 2 == 0) {
                dn.a(this, dn.b.UPLOADING);
                try {
                    b(new Object[]{this}, 246365851, -246365851, System.identityHashCode(this));
                } catch (Throwable th3) {
                    t.d(this, th3, e.ASYNC_FACE_SCAN_SUCCESS_TASK_ERROR, th3.getMessage(), true);
                    e(FaceTecSessionStatus.UNKNOWN_INTERNAL_ERROR);
                    return;
                }
            } else {
                dn.a(this, dn.b.UPLOADING);
                throw null;
            }
        } else {
            b(new Object[]{this}, 246365851, -246365851, System.identityHashCode(this));
        }
        throw th;
    }

    @Override // com.facetec.sdk.bh
    public final void j() throws Throwable {
        int i10 = aO + 13;
        aQ = i10 % 128;
        try {
            if (i10 % 2 == 0) {
                dn.e();
                this.f40515k.a(this, t.b.SESSION_TIMEOUT);
                b(new Object[]{this}, 987633992, -987633974, System.identityHashCode(this));
                d(true);
                b(new Object[]{this, 30047}, -207278363, 207278379, 30047);
            } else {
                dn.e();
                this.f40515k.a(this, t.b.SESSION_TIMEOUT);
                b(new Object[]{this}, 987633992, -987633974, System.identityHashCode(this));
                d(false);
                b(new Object[]{this, 400}, -207278363, 207278379, 400);
            }
        } catch (Throwable th2) {
            e eVar = e.SEVERE_ERROR;
            StringBuilder sb2 = new StringBuilder();
            FaceTecSessionStatus faceTecSessionStatus = FaceTecSessionStatus.UNKNOWN_INTERNAL_ERROR;
            sb2.append(faceTecSessionStatus);
            sb2.append(": ");
            sb2.append(th2.getMessage());
            t.d(this, th2, eVar, sb2.toString(), true);
            e(faceTecSessionStatus);
        }
    }

    @Override // com.facetec.sdk.bh
    public final void n() throws Throwable {
        b(new Object[]{this}, 1729256513, -1729256499, System.identityHashCode(this));
    }

    @Override // com.facetec.sdk.bh
    public final void p() {
        if (!this.f40510f) {
            a(FaceTecSessionStatus.CAMERA_PERMISSION_DENIED);
            int i10 = aQ + 43;
            aO = i10 % 128;
            if (i10 % 2 != 0) {
                throw null;
            }
            return;
        }
        int i11 = aO + 43;
        aQ = i11 % 128;
        int i12 = i11 % 2;
        c(FaceTecIDScanStatus.CAMERA_PERMISSION_DENIED);
    }

    /* JADX WARN: Code duplicated, block: B:14:0x003e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:15:0x0040  */
    /* JADX WARN: Code duplicated, block: B:16:0x004f  */
    private static /* synthetic */ Object h(Object[] objArr) {
        be beVar = (be) objArr[0];
        int i10 = 1;
        boolean zBooleanValue = ((Boolean) objArr[1]).booleanValue();
        int i11 = aQ + 77;
        aO = i11 % 128;
        if (i11 % 2 == 0) {
            FaceTecSDK.c cVar = FaceTecSDK.f40108c;
            FaceTecSDK.c cVar2 = FaceTecSDK.c.LOW_LIGHT;
            if (cVar != cVar2) {
                int i12 = aO + 43;
                aQ = i12 % 128;
                if (i12 % 2 == 0) {
                    int i13 = 58 / 0;
                    if (FaceTecSDK.f40108c != FaceTecSDK.c.LOW_LIGHT_FROM_SENSOR) {
                        if (zBooleanValue) {
                            int i14 = aO + 109;
                            aQ = i14 % 128;
                            int i15 = i14 % 2;
                            FaceTecSDK.f40108c = FaceTecSDK.c.LOW_LIGHT_FROM_SENSOR;
                        } else {
                            FaceTecSDK.f40108c = cVar2;
                        }
                        ch.v();
                        beVar.runOnUiThread(new c3(beVar, i10));
                    }
                } else if (FaceTecSDK.f40108c != FaceTecSDK.c.LOW_LIGHT_FROM_SENSOR) {
                    if (zBooleanValue) {
                        int i16 = aO + 109;
                        aQ = i16 % 128;
                        int i17 = i16 % 2;
                        FaceTecSDK.f40108c = FaceTecSDK.c.LOW_LIGHT_FROM_SENSOR;
                    } else {
                        FaceTecSDK.f40108c = cVar2;
                    }
                    ch.v();
                    beVar.runOnUiThread(new c3(beVar, i10));
                }
            }
            return null;
        }
        int i18 = FaceTecSDK.REQUEST_CODE_SESSION;
        FaceTecSDK.c cVar3 = FaceTecSDK.c.NORMAL;
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x001c, code lost:
    
        if (com.facetec.sdk.FaceTecSessionActivity.f40125i == null) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x001e, code lost:
    
        a(r3.f40519p.getStatus());
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0028, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x002b, code lost:
    
        if (r4 != com.facetec.sdk.FaceTecIDScanNextStep.SKIP) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x002d, code lost:
    
        e(r3.f40519p.getStatus(), com.facetec.sdk.FaceTecIDScanStatus.SKIPPED);
        r4 = com.facetec.sdk.be.aQ + 47;
        com.facetec.sdk.be.aO = r4 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0042, code lost:
    
        if ((r4 % 2) != 0) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0045, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0047, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x004a, code lost:
    
        r3.H = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x004e, code lost:
    
        if (r3.f40571d == null) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0054, code lost:
    
        if (hasWindowFocus() != false) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0057, code lost:
    
        b(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x005b, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x005d, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0013, code lost:
    
        if (com.facetec.sdk.FaceTecSessionActivity.f40125i == null) goto L16;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private synchronized void a(com.facetec.sdk.FaceTecIDScanNextStep r4) {
        /*
            r3 = this;
            monitor-enter(r3)
            int r0 = com.facetec.sdk.be.aO     // Catch: java.lang.Throwable -> L18
            int r0 = r0 + 63
            int r1 = r0 % 128
            com.facetec.sdk.be.aQ = r1     // Catch: java.lang.Throwable -> L18
            int r0 = r0 % 2
            r1 = 0
            if (r0 != 0) goto L1a
            com.facetec.sdk.FaceTecIDScanProcessor r0 = com.facetec.sdk.FaceTecSessionActivity.f40125i     // Catch: java.lang.Throwable -> L18
            r2 = 79
            int r2 = r2 / r1
            if (r0 != 0) goto L29
            goto L1e
        L16:
            r4 = move-exception
            throw r4     // Catch: java.lang.Throwable -> L18
        L18:
            r4 = move-exception
            goto L5e
        L1a:
            com.facetec.sdk.FaceTecIDScanProcessor r0 = com.facetec.sdk.FaceTecSessionActivity.f40125i     // Catch: java.lang.Throwable -> L18
            if (r0 != 0) goto L29
        L1e:
            com.facetec.sdk.FaceTecSessionResult r4 = r3.f40519p     // Catch: java.lang.Throwable -> L18
            com.facetec.sdk.FaceTecSessionStatus r4 = r4.getStatus()     // Catch: java.lang.Throwable -> L18
            r3.a(r4)     // Catch: java.lang.Throwable -> L18
            monitor-exit(r3)
            return
        L29:
            com.facetec.sdk.FaceTecIDScanNextStep r0 = com.facetec.sdk.FaceTecIDScanNextStep.SKIP     // Catch: java.lang.Throwable -> L18
            if (r4 != r0) goto L4a
            com.facetec.sdk.FaceTecSessionResult r4 = r3.f40519p     // Catch: java.lang.Throwable -> L18
            com.facetec.sdk.FaceTecSessionStatus r4 = r4.getStatus()     // Catch: java.lang.Throwable -> L18
            com.facetec.sdk.FaceTecIDScanStatus r0 = com.facetec.sdk.FaceTecIDScanStatus.SKIPPED     // Catch: java.lang.Throwable -> L18
            r3.e(r4, r0)     // Catch: java.lang.Throwable -> L18
            int r4 = com.facetec.sdk.be.aQ     // Catch: java.lang.Throwable -> L18
            int r4 = r4 + 47
            int r0 = r4 % 128
            com.facetec.sdk.be.aO = r0     // Catch: java.lang.Throwable -> L18
            int r4 = r4 % 2
            if (r4 != 0) goto L46
            monitor-exit(r3)
            return
        L46:
            r4 = 0
            throw r4     // Catch: java.lang.Throwable -> L48
        L48:
            r4 = move-exception
            throw r4     // Catch: java.lang.Throwable -> L18
        L4a:
            r3.H = r1     // Catch: java.lang.Throwable -> L18
            com.facetec.sdk.cc r0 = r3.f40571d     // Catch: java.lang.Throwable -> L18
            if (r0 == 0) goto L5c
            boolean r0 = r3.hasWindowFocus()     // Catch: java.lang.Throwable -> L18
            if (r0 != 0) goto L57
            goto L5c
        L57:
            r3.b(r4)     // Catch: java.lang.Throwable -> L18
            monitor-exit(r3)
            return
        L5c:
            monitor-exit(r3)
            return
        L5e:
            monitor-exit(r3)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facetec.sdk.be.a(com.facetec.sdk.FaceTecIDScanNextStep):void");
    }

    @Override // com.facetec.sdk.bh
    public final synchronized void m() {
        t.c(this, e.NON_FATAL_ERROR, FaceTecSessionStatus.USER_CANCELLED.toString());
        cc ccVar = this.f40571d;
        if (ccVar == null) {
            return;
        }
        ccVar.f();
        this.f40571d.c(true);
        if (!this.f40571d.a(this, false)) {
            int i10 = aO + 111;
            aQ = i10 % 128;
            int i11 = i10 % 2;
            b(ak.f40301s);
        }
        this.f40527x.p();
        int i12 = aO + 59;
        aQ = i12 % 128;
        int i13 = i12 % 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void i(String str) throws Throwable {
        int i10 = aQ + 37;
        aO = i10 % 128;
        int i11 = i10 % 2;
        if (this.f40524u != null) {
            int i12 = aO + 21;
            aQ = i12 % 128;
            if (i12 % 2 != 0) {
                this.f40524u.e(str);
            } else {
                this.f40524u.e(str);
                throw null;
            }
        }
    }

    private synchronized void e(FaceTecSessionStatus faceTecSessionStatus) {
        int i10 = aO + 111;
        aQ = i10 % 128;
        int i11 = i10 % 2;
        e(faceTecSessionStatus, (FaceTecIDScanStatus) null);
        int i12 = aO + 25;
        aQ = i12 % 128;
        int i13 = i12 % 2;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0021 A[Catch: all -> 0x0016, TryCatch #2 {all -> 0x0016, blocks: (B:3:0x0001, B:5:0x000f, B:13:0x0021, B:14:0x0036, B:16:0x003d, B:18:0x0048, B:20:0x004c, B:23:0x0050, B:26:0x0054, B:27:0x0055, B:29:0x0059, B:31:0x006a, B:34:0x0079, B:37:0x0088, B:38:0x0089, B:40:0x0091, B:42:0x009c, B:45:0x00a1, B:48:0x00a6, B:49:0x00a7, B:10:0x0019, B:24:0x0052, B:46:0x00a4, B:35:0x0086), top: B:58:0x0001, inners: #0, #1, #3 }] */
    public final synchronized void e(FaceTecSessionStatus faceTecSessionStatus, FaceTecIDScanStatus faceTecIDScanStatus) {
        try {
            int i10 = aO + 61;
            aQ = i10 % 128;
            if (i10 % 2 == 0) {
                this.G = true;
                if (this.f40571d != null) {
                    if (faceTecIDScanStatus == null) {
                        cc ccVar = this.f40571d;
                        ccVar.f40804b = true;
                        cc.e(new Object[]{ccVar}, -583599493, 583599499, System.identityHashCode(ccVar));
                    }
                }
                throw th;
            }
            this.G = false;
            if (this.f40571d != null) {
                if (faceTecIDScanStatus == null) {
                    cc ccVar2 = this.f40571d;
                    ccVar2.f40804b = true;
                    cc.e(new Object[]{ccVar2}, -583599493, 583599499, System.identityHashCode(ccVar2));
                }
            }
            if (E()) {
                int i11 = aQ + 107;
                aO = i11 % 128;
                if (i11 % 2 == 0) {
                    if (faceTecIDScanStatus != FaceTecIDScanStatus.SKIPPED) {
                        this.F = false;
                        return;
                    }
                } else {
                    FaceTecIDScanStatus faceTecIDScanStatus2 = FaceTecIDScanStatus.SUCCESS;
                    throw null;
                }
                throw th;
            }
            if (this.f40508an) {
                int i12 = aO + 97;
                aQ = i12 % 128;
                if (i12 % 2 != 0) {
                    b(new Object[]{this, faceTecIDScanStatus}, -1431415695, 1431415697, System.identityHashCode(this));
                    return;
                } else {
                    b(new Object[]{this, faceTecIDScanStatus}, -1431415695, 1431415697, System.identityHashCode(this));
                    throw null;
                }
            }
            this.H = true;
            this.G = false;
            if (faceTecIDScanStatus == FaceTecIDScanStatus.SKIPPED) {
                int i13 = aO + 3;
                aQ = i13 % 128;
                if (i13 % 2 != 0) {
                    b(faceTecSessionStatus, faceTecIDScanStatus);
                    return;
                } else {
                    b(faceTecSessionStatus, faceTecIDScanStatus);
                    throw null;
                }
            }
            a(faceTecSessionStatus);
            return;
        } catch (Throwable th2) {
            throw th2;
        }
        throw th2;
    }

    @Override // com.facetec.sdk.bh
    public final synchronized void h() {
        int i10 = aQ + 45;
        aO = i10 % 128;
        int i11 = i10 % 2;
        this.f40515k.a(this, t.b.USER_FAILED);
        int i12 = 0;
        b(new Object[]{this}, 987633992, -987633974, System.identityHashCode(this));
        try {
            d(true);
            this.f40527x = cn.m();
            this.f40509e.b(new v3(this, i12), 400L);
            int i13 = aO + 59;
            aQ = i13 % 128;
            int i14 = i13 % 2;
        } catch (Throwable th2) {
            e eVar = e.SEVERE_ERROR;
            StringBuilder sb2 = new StringBuilder();
            FaceTecSessionStatus faceTecSessionStatus = FaceTecSessionStatus.UNKNOWN_INTERNAL_ERROR;
            sb2.append(faceTecSessionStatus);
            sb2.append(": ");
            sb2.append(th2.getMessage());
            t.d(this, th2, eVar, sb2.toString(), true);
            e(faceTecSessionStatus);
        }
    }

    private static /* synthetic */ Object i(Object[] objArr) throws Throwable {
        be beVar = (be) objArr[0];
        int i10 = aQ + 37;
        aO = i10 % 128;
        int i11 = i10 % 2;
        beVar.M();
        if (i11 != 0) {
            throw null;
        }
        int i12 = aO + 39;
        aQ = i12 % 128;
        int i13 = i12 % 2;
        return null;
    }

    @Override // com.facetec.sdk.bh
    public final synchronized void f() {
        try {
            int i10 = aQ + 5;
            aO = i10 % 128;
            int i11 = i10 % 2;
            ag agVar = this.W;
            if (agVar != null) {
                agVar.c();
            }
            ch.i();
            if (FaceTecSessionActivity.f40124e != null) {
                int i12 = aO + 81;
                aQ = i12 % 128;
                int i13 = 0;
                if (i12 % 2 == 0) {
                    this.f40524u = co.a(false, this.az);
                    if (FaceTecSDK.f40106a.f40090n.f40073e == FaceTecCancelButtonCustomization.ButtonLocation.CUSTOM) {
                        ae();
                        int i14 = aO + 33;
                        aQ = i14 % 128;
                        int i15 = i14 % 2;
                    }
                } else {
                    this.f40524u = co.a(false, this.az);
                    if (FaceTecSDK.f40106a.f40090n.f40073e == FaceTecCancelButtonCustomization.ButtonLocation.CUSTOM) {
                        ae();
                        int i16 = aO + 33;
                        aQ = i16 % 128;
                        int i17 = i16 % 2;
                    }
                }
                this.f40509e.b(new n4(this, i13), 400L);
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    private void i(boolean z10) throws Throwable {
        b(new Object[]{this, Boolean.valueOf(z10)}, -11714907, 11714914, System.identityHashCode(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void j(final boolean z10) {
        int i10 = aO + 91;
        aQ = i10 % 128;
        int i11 = i10 % 2;
        getFragmentManager().beginTransaction().remove(this.f40524u).commitAllowingStateLoss();
        this.f40524u = null;
        co.c cVar = co.c.NFC;
        this.az = cVar;
        this.f40524u = co.a(true, cVar);
        getFragmentManager().beginTransaction().add(this.f40497ac, this.f40524u, "Results").commitAllowingStateLoss();
        d(new b() { // from class: com.facetec.sdk.u3
            @Override // com.facetec.sdk.be.b
            public final byte[] getIdScanBytes(String str) {
                return this.f42898a.d(z10, str);
            }
        });
        int i12 = aO + 61;
        aQ = i12 % 128;
        int i13 = i12 % 2;
    }

    public final void c(final String str) {
        int i10 = aO + 69;
        aQ = i10 % 128;
        if (i10 % 2 != 0) {
            runOnUiThread(new Runnable() { // from class: com.facetec.sdk.y3
                @Override // java.lang.Runnable
                public final void run() throws Throwable {
                    this.f42992p0.i(str);
                }
            });
        } else {
            runOnUiThread(new j3(this, str, 1));
            throw null;
        }
    }

    public final void c(final float f6) {
        int i10 = aO + 111;
        aQ = i10 % 128;
        int i11 = i10 % 2;
        runOnUiThread(new Runnable() { // from class: com.facetec.sdk.a4
            @Override // java.lang.Runnable
            public final void run() {
                this.f40188p0.b(f6);
            }
        });
        int i12 = aO + 111;
        aQ = i12 % 128;
        if (i12 % 2 == 0) {
            throw null;
        }
    }

    public final boolean a(String str, FaceTecIDScanNextStep faceTecIDScanNextStep) throws Throwable {
        int i10 = aQ + 3;
        aO = i10 % 128;
        int i11 = i10 % 2;
        String strZ = ch.Z(str, false);
        if (strZ.isEmpty()) {
            t.c(this, e.SCAN_RESULT_BLOB_DECODE_ERROR, (String) null);
            z();
            int i12 = aO + 103;
            aQ = i12 % 128;
            if (i12 % 2 != 0) {
                return false;
            }
            throw null;
        }
        try {
            if (!(!new JSONObject(strZ).optBoolean("success", false))) {
                int i13 = aQ + 39;
                aO = i13 % 128;
                int i14 = i13 % 2;
                d(faceTecIDScanNextStep);
                return true;
            }
            z();
            return false;
        } catch (JSONException unused) {
            z();
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void c(final FaceTecIDScanNextStep faceTecIDScanNextStep) throws Throwable {
        if (this.f40524u != null) {
            int i10 = aQ + 71;
            aO = i10 % 128;
            int i11 = i10 % 2;
            this.f40524u.e(true, FaceTecCustomization.overrideResultScreenSuccessMessage, new Runnable() { // from class: com.facetec.sdk.j4
                @Override // java.lang.Runnable
                public final void run() {
                    this.f41892p0.e(faceTecIDScanNextStep);
                }
            });
        }
        int i12 = aO + 21;
        aQ = i12 % 128;
        if (i12 % 2 == 0) {
            throw null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void h(final boolean z10) {
        int i10 = aQ + 35;
        aO = i10 % 128;
        if (i10 % 2 == 0) {
            this.f40524u.d(new Runnable() { // from class: com.facetec.sdk.m3
                @Override // java.lang.Runnable
                public final void run() {
                    this.f42398p0.j(z10);
                }
            });
        } else {
            this.f40524u.d(new n3(this, z10, 0));
            throw null;
        }
    }

    private static /* synthetic */ Object g(Object[] objArr) {
        be beVar = (be) objArr[0];
        int i10 = aO + 39;
        aQ = i10 % 128;
        int i11 = i10 % 2;
        beVar.f40509e = az.a();
        beVar.I = false;
        ch.T(dn.d());
        az.f40415d = true;
        beVar.X();
        int i12 = aO + 31;
        aQ = i12 % 128;
        if (i12 % 2 != 0) {
            return null;
        }
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void c(Runnable runnable) throws Throwable {
        if (this.f40524u != null) {
            this.f40524u.e(true, this.aq, new c4(this, runnable, 0));
            int i10 = aQ + 79;
            aO = i10 % 128;
            int i11 = i10 % 2;
        }
        int i12 = aO + 121;
        aQ = i12 % 128;
        int i13 = i12 % 2;
    }

    public final void d(final FaceTecIDScanNextStep faceTecIDScanNextStep) throws Throwable {
        t.c(this, e.DEVELOPER_USED_FACESCAN_CALLBACK, "succeed");
        if (FaceTecSDK.f40106a.vocalGuidanceCustomization.mode == FaceTecVocalGuidanceCustomization.VocalGuidanceMode.FULL_VOCAL_GUIDANCE) {
            dn.a(this, dn.b.SUCCESS);
        } else if (!dn.f41289d) {
            int i10 = aQ + 27;
            aO = i10 % 128;
            int i11 = i10 % 2;
            SharedPreferences.Editor editorEdit = dn.f41287b.edit();
            editorEdit.putBoolean("facetecMoveCloserSoundHasBeenPlayed", true);
            editorEdit.apply();
        }
        if (FaceTecSessionActivity.f40125i != null) {
            this.K = true;
        }
        runOnUiThread(new Runnable() { // from class: com.facetec.sdk.d4
            @Override // java.lang.Runnable
            public final void run() throws Throwable {
                this.f41137p0.c(faceTecIDScanNextStep);
            }
        });
        int i12 = aO + 43;
        aQ = i12 % 128;
        int i13 = i12 % 2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0026, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0027, code lost:
    
        r4.J = true;
        com.facetec.sdk.dn.e();
        com.facetec.sdk.cx.d(new com.facetec.sdk.t3(r4, r5)).e(new com.facetec.sdk.a3(r4, r2));
        r5 = com.facetec.sdk.be.aQ + 49;
        com.facetec.sdk.be.aO = r5 % 128;
        r5 = r5 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0047, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0013, code lost:
    
        if (r4.J != false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0018, code lost:
    
        if (r4.J != false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x001a, code lost:
    
        r5 = (r1 ^ 11) + ((r1 & 11) << 1);
        com.facetec.sdk.be.aO = r5 % 128;
        r5 = r5 % 2;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void c(final boolean r5) {
        /*
            r4 = this;
            int r0 = com.facetec.sdk.be.aO
            int r0 = r0 + 85
            int r1 = r0 % 128
            com.facetec.sdk.be.aQ = r1
            int r0 = r0 % 2
            r2 = 1
            if (r0 != 0) goto L16
            boolean r0 = r4.J
            r3 = 41
            int r3 = r3 / 0
            if (r0 == 0) goto L27
            goto L1a
        L16:
            boolean r0 = r4.J
            if (r0 == 0) goto L27
        L1a:
            r5 = r1 ^ 11
            r0 = r1 & 11
            int r0 = r0 << r2
            int r5 = r5 + r0
            int r0 = r5 % 128
            com.facetec.sdk.be.aO = r0
            int r5 = r5 % 2
            return
        L27:
            r4.J = r2
            com.facetec.sdk.dn.e()
            com.facetec.sdk.t3 r0 = new com.facetec.sdk.t3
            r0.<init>()
            com.facetec.sdk.cx r5 = com.facetec.sdk.cx.d(r0)
            com.facetec.sdk.a3 r0 = new com.facetec.sdk.a3
            r0.<init>(r4, r2)
            r5.e(r0)
            int r5 = com.facetec.sdk.be.aQ
            int r5 = r5 + 49
            int r0 = r5 % 128
            com.facetec.sdk.be.aO = r0
            int r5 = r5 % 2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facetec.sdk.be.c(boolean):void");
    }

    private static /* synthetic */ Object o(Object[] objArr) {
        View viewA;
        be beVar = (be) objArr[0];
        int i10 = aQ + 99;
        aO = i10 % 128;
        if (i10 % 2 == 0) {
            ag agVar = beVar.W;
            if (agVar != null) {
                viewA = agVar.a();
                int i11 = aO + 25;
                aQ = i11 % 128;
                int i12 = i11 % 2;
            } else {
                viewA = null;
            }
            db.h(beVar.f40499ae);
            beVar.f40499ae.animate().alpha(1.0f).setDuration(300L).setListener(null).withEndAction(new o4(beVar, viewA, 1)).start();
            beVar.O();
            return null;
        }
        ag agVar2 = beVar.W;
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(boolean z10, String str) throws Throwable {
        if (this.f40524u != null) {
            this.f40524u.e(z10, str, new z0(this, 1));
            int i10 = aQ + 27;
            aO = i10 % 128;
            int i11 = i10 % 2;
        }
        int i12 = aQ + 27;
        aO = i12 % 128;
        int i13 = i12 % 2;
    }

    public final void a(int i10, int i11) {
        ImageView imageView = this.f40518o;
        if (imageView == null || FaceTecSDK.f40106a.f40090n.f40073e != FaceTecCancelButtonCustomization.ButtonLocation.CUSTOM) {
            return;
        }
        int i12 = aO + 77;
        aQ = i12 % 128;
        int i13 = i12 % 2;
        imageView.animate().alpha(1.0f).setDuration(i10).setStartDelay(i11).setListener(null).withEndAction(new m4(this, 2)).start();
        int i14 = aO + 123;
        aQ = i14 % 128;
        int i15 = i14 % 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ byte[] c(JSONObject jSONObject, String str) {
        int i10 = aO + 83;
        aQ = i10 % 128;
        int i11 = i10 % 2;
        byte[] bArrP = ch.p(str, this.m, jSONObject.toString());
        int i12 = aQ + 111;
        aO = i12 % 128;
        int i13 = i12 % 2;
        return bArrP;
    }

    private void d(final Runnable runnable) throws Throwable {
        int i10 = aQ + 87;
        aO = i10 % 128;
        if (i10 % 2 == 0) {
            t.c(this, e.DEVELOPER_USED_ID_SCAN_CALLBACK, "succeed");
            runOnUiThread(new o4(this, runnable, 0));
            int i11 = aO + 91;
            aQ = i11 % 128;
            int i12 = i11 % 2;
            return;
        }
        t.c(this, e.DEVELOPER_USED_ID_SCAN_CALLBACK, "succeed");
        runOnUiThread(new Runnable() { // from class: com.facetec.sdk.p4
            @Override // java.lang.Runnable
            public final void run() throws Throwable {
                this.f42769p0.c(runnable);
            }
        });
        throw null;
    }

    private static /* synthetic */ Object a(Object[] objArr) throws Throwable {
        int i10 = 0;
        be beVar = (be) objArr[0];
        beVar.f40500af.setVisibility(4);
        if (beVar.f40524u != null && beVar.f40516l != null) {
            beVar.f40524u.e(true, beVar.aq, new v2(beVar, i10));
            int i11 = aQ + 15;
            aO = i11 % 128;
            int i12 = i11 % 2;
        }
        int i13 = aO + 121;
        aQ = i13 % 128;
        if (i13 % 2 == 0) {
            int i14 = 51 / 0;
        }
        return null;
    }

    private void c(boolean z10, boolean z11) throws Throwable {
        int i10 = aO + 91;
        aQ = i10 % 128;
        int i11 = i10 % 2;
        if (this.Q || this.f40496aa) {
            return;
        }
        if (this.T == null) {
            this.T = new bt(this.f40524u, this.ab);
        }
        if (this.U == null) {
            this.U = dr.d(this, this.ap);
        }
        dr drVar = this.U;
        if (drVar == null) {
            b(new Object[]{this, Boolean.FALSE}, -11714907, 11714914, System.identityHashCode(this));
            return;
        }
        if (this.f40522s) {
            int i12 = aQ + 23;
            aO = i12 % 128;
            int i13 = i12 % 2;
            return;
        }
        try {
            if (drVar.d(getClass(), this.X)) {
                if (z10) {
                    return;
                }
                this.T.e(z11);
                return;
            }
            int i14 = aO + 79;
            aQ = i14 % 128;
            if (i14 % 2 != 0) {
                t.e(this, dt.Unknown, "did not start");
                b(new Object[]{this}, -545945752, 545945777, System.identityHashCode(this));
            } else {
                t.e(this, dt.Unknown, "did not start");
                b(new Object[]{this}, -545945752, 545945777, System.identityHashCode(this));
                try {
                    throw null;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        } catch (Exception e5) {
            e5.printStackTrace();
            t.e(this, dt.Unknown, e5.getMessage());
            b(new Object[]{this}, -545945752, 545945777, System.identityHashCode(this));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(String str) throws Throwable {
        b(new Object[]{this, str}, 453860961, -453860937, System.identityHashCode(this));
    }

    private void e(boolean z10) {
        int i10;
        boolean z11;
        synchronized (this) {
            try {
                cc ccVar = this.f40571d;
                i10 = 0;
                if (ccVar != null) {
                    ccVar.o();
                    if (z10) {
                        cc.e();
                        this.f40571d = null;
                        z11 = false;
                    } else {
                        z11 = true;
                    }
                } else {
                    z11 = false;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (z11) {
            Thread thread = new Thread(new k3(this, i10));
            thread.setPriority(10);
            thread.start();
        }
    }

    public final void a(FaceTecIDScanStatus faceTecIDScanStatus) throws Throwable {
        b(new Object[]{this, faceTecIDScanStatus}, -1431415695, 1431415697, System.identityHashCode(this));
    }

    private void a(int i10) throws Throwable {
        b(new Object[]{this, Integer.valueOf(i10)}, -749463482, 749463503, i10);
    }

    private static /* synthetic */ Object d(Object[] objArr) throws Throwable {
        int i10 = 0;
        be beVar = (be) objArr[0];
        beVar.f40515k.e(beVar, t.b.USER_WAS_SUCCESSFUL, beVar.m, beVar.f40510f);
        if (beVar.B == null && beVar.f40524u != null) {
            beVar.d(new u2(beVar, i10));
            int i11 = aQ + 37;
            aO = i11 % 128;
            if (i11 % 2 == 0) {
                return null;
            }
            throw null;
        }
        b(new Object[]{beVar, beVar.at.getStatus()}, -1431415695, 1431415697, System.identityHashCode(beVar));
        int i12 = aQ + 37;
        aO = i12 % 128;
        int i13 = i12 % 2;
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x003e A[PHI: r0
      0x003e: PHI (r0v8 com.facetec.sdk.bj) = (r0v4 com.facetec.sdk.bj), (r0v10 com.facetec.sdk.bj) binds: [B:8:0x0029, B:5:0x001b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:9:0x002b A[PHI: r0
      0x002b: PHI (r0v5 com.facetec.sdk.bj) = (r0v4 com.facetec.sdk.bj), (r0v10 com.facetec.sdk.bj) binds: [B:8:0x0029, B:5:0x001b] A[DONT_GENERATE, DONT_INLINE]] */
    private void d(final boolean z10, bq bqVar, @Nullable final String str) throws Throwable {
        bj bjVar;
        int i10 = aO + 13;
        aQ = i10 % 128;
        boolean z11 = true;
        if (i10 % 2 == 0) {
            t.c(this, e.DEVELOPER_USED_ID_SCAN_CALLBACK, OptionListAnalyticsHandler.RETRY);
            this.ar = false;
            this.L = false;
            bjVar = this.f40516l;
            if (z10) {
                z11 = false;
            } else {
                int i11 = aQ;
                int i12 = i11 + 51;
                aO = i12 % 128;
                int i13 = i12 % 2;
                int i14 = i11 + 113;
                aO = i14 % 128;
                int i15 = i14 % 2;
            }
        } else {
            t.c(this, e.DEVELOPER_USED_ID_SCAN_CALLBACK, OptionListAnalyticsHandler.RETRY);
            this.ar = true;
            this.L = false;
            bjVar = this.f40516l;
            if (z10) {
                z11 = false;
            } else {
                int i16 = aQ;
                int i17 = i16 + 51;
                aO = i17 % 128;
                int i18 = i17 % 2;
                int i19 = i16 + 113;
                aO = i19 % 128;
                int i110 = i19 % 2;
            }
        }
        bjVar.f40605o = z11;
        this.f40516l.f40599h = bqVar;
        runOnUiThread(new Runnable() { // from class: com.facetec.sdk.z3
            @Override // java.lang.Runnable
            public final void run() throws Throwable {
                this.f43017p0.a(z10, str);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void e(FaceTecIDScanNextStep faceTecIDScanNextStep) {
        int i10 = aQ + 71;
        aO = i10 % 128;
        int i11 = i10 % 2;
        a(faceTecIDScanNextStep);
        int i12 = aQ + 27;
        aO = i12 % 128;
        if (i12 % 2 != 0) {
            throw null;
        }
    }

    public final boolean e(String str) throws Throwable {
        boolean zOptBoolean;
        boolean zOptBoolean2;
        boolean zOptBoolean3;
        boolean zOptBoolean4;
        boolean zOptBoolean5;
        boolean zOptBoolean6;
        boolean zOptBoolean7;
        boolean z10;
        try {
            JSONObject jSONObject = new JSONObject(ch.Z(str, true));
            JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("data");
            if (jSONObjectOptJSONObject == null) {
                b(new Object[]{this}, 666961326, -666961311, System.identityHashCode(this));
                return false;
            }
            JSONObject jSONObjectOptJSONObject2 = jSONObjectOptJSONObject.optJSONObject("flags");
            if (jSONObjectOptJSONObject2 == null) {
                b(new Object[]{this}, 666961326, -666961311, System.identityHashCode(this));
                return false;
            }
            int iOptInt = jSONObjectOptJSONObject2.optInt("nextStep");
            boolean zOptBoolean8 = jSONObjectOptJSONObject2.optBoolean("isPassport", false);
            this.ap = jSONObjectOptJSONObject2.optBoolean("useNFCCompatMode", false);
            boolean zOptBoolean9 = jSONObject.optBoolean("success");
            JSONObject jSONObjectOptJSONObject3 = jSONObjectOptJSONObject.optJSONObject("resultsFlags");
            if (jSONObjectOptJSONObject3 != null) {
                zOptBoolean6 = jSONObjectOptJSONObject3.optBoolean("matchedHighlyEnough");
                zOptBoolean7 = jSONObjectOptJSONObject3.optBoolean("wasFullID");
                zOptBoolean4 = jSONObjectOptJSONObject3.optBoolean("idTypeNotSupported");
                zOptBoolean5 = jSONObjectOptJSONObject3.optBoolean("overzoomedDocument");
                zOptBoolean = jSONObjectOptJSONObject3.optBoolean("retryDueToBarcode");
                zOptBoolean3 = jSONObjectOptJSONObject3.optBoolean("wasLikelyRealID");
                zOptBoolean2 = !FaceTecSDK.f40106a.f40083f.disableAdditionalReviewScreen ? jSONObjectOptJSONObject3.optBoolean("additionalReviewRequired") : false;
            } else {
                zOptBoolean = false;
                zOptBoolean2 = false;
                zOptBoolean3 = false;
                zOptBoolean4 = false;
                zOptBoolean5 = false;
                zOptBoolean6 = false;
                zOptBoolean7 = false;
            }
            int i10 = this.ao;
            boolean z11 = i10 == 1 || i10 == 2;
            this.ao = iOptInt;
            this.f40516l = bj.c(zOptBoolean5, this.f40510f);
            cq cqVar = cq.UNKNOWN;
            if (zOptBoolean9) {
                if (iOptInt == 1) {
                    int i11 = aQ + 113;
                    aO = i11 % 128;
                    if (i11 % 2 != 0) {
                        cq cqVar2 = cq.UNKNOWN;
                        throw null;
                    }
                    cqVar = cq.IDSCAN_SUCCESS_FRONT_SIDE_BACK_NEXT;
                } else if (iOptInt == 3) {
                    if (this.R) {
                        if (this.as) {
                            cqVar = cq.IDSCAN_SKIP_OR_ERROR_NFC;
                        } else {
                            cqVar = cq.IDSCAN_SUCCESS_NFC;
                        }
                    } else if (z11) {
                        cqVar = cq.IDSCAN_SUCCESS_BACK_SIDE;
                    } else if (zOptBoolean8) {
                        cqVar = cq.IDSCAN_SUCCESS_PASSPORT;
                    } else {
                        cqVar = cq.IDSCAN_SUCCESS_FRONT_SIDE;
                    }
                } else if (iOptInt == 4) {
                    if (zOptBoolean2) {
                        cqVar = cq.IDSCAN_SUCCESS_ADDITIONAL_REVIEW;
                    } else {
                        cqVar = cq.IDSCAN_SUCCESS_USER_CONFIRMATION;
                        int i12 = aQ + 93;
                        aO = i12 % 128;
                        int i13 = i12 % 2;
                    }
                } else if (iOptInt == 5) {
                    if (z11) {
                        cqVar = cq.IDSCAN_SUCCESS_BACK_SIDE_NFC_NEXT;
                    } else if (zOptBoolean8) {
                        int i14 = aO + 111;
                        aQ = i14 % 128;
                        int i15 = i14 % 2;
                        cqVar = cq.IDSCAN_SUCCESS_PASSPORT_NFC_NEXT;
                    } else {
                        cqVar = cq.IDSCAN_SUCCESS_FRONT_SIDE_NFC_NEXT;
                    }
                }
            } else if (zOptBoolean4) {
                int i16 = aO + 101;
                aQ = i16 % 128;
                if (i16 % 2 == 0) {
                    cqVar = cq.IDSCAN_RETRY_ID_TYPE_NOT_SUPPORTED;
                    int i17 = 54 / 0;
                } else {
                    cqVar = cq.IDSCAN_RETRY_ID_TYPE_NOT_SUPPORTED;
                }
            } else if (!zOptBoolean7) {
                int i18 = aO + 15;
                aQ = i18 % 128;
                if (i18 % 2 == 0) {
                    cqVar = cq.IDSCAN_RETRY_ID_NOT_FULLY_VISIBLE;
                    int i19 = 55 / 0;
                } else {
                    cqVar = cq.IDSCAN_RETRY_ID_NOT_FULLY_VISIBLE;
                }
            } else if (!zOptBoolean6 && zOptBoolean3) {
                int i20 = aQ + 85;
                aO = i20 % 128;
                if (i20 % 2 != 0) {
                    cq cqVar3 = cq.UNKNOWN;
                    throw null;
                }
                cqVar = cq.IDSCAN_RETRY_FACE_DID_NOT_MATCH;
            } else if (zOptBoolean) {
                cqVar = cq.IDSCAN_RETRY_BARCODE_NOT_READ;
            } else {
                cqVar = cq.IDSCAN_RETRY_OCR_RESULTS_NOT_GOOD_ENOUGH;
            }
            if (iOptInt == 3 && this.R) {
                int i21 = aQ + 97;
                aO = i21 % 128;
                int i22 = i21 % 2;
                if (this.as) {
                    cqVar = cq.IDSCAN_SKIP_OR_ERROR_NFC;
                } else {
                    cqVar = cq.IDSCAN_SUCCESS_NFC;
                }
            }
            String strA = db.a(cqVar);
            this.aq = strA;
            if (iOptInt == 4) {
                int i23 = aO + 65;
                aQ = i23 % 128;
                if (i23 % 2 == 0) {
                    throw null;
                }
                if (zOptBoolean2) {
                    this.P = true;
                    d(new v2(this, 1));
                    return true;
                }
                b(new Object[]{this}, 560820595, -560820591, System.identityHashCode(this));
                return true;
            }
            if (iOptInt != 0) {
                if (iOptInt == 1) {
                    this.f40516l.f40601j = bj.c.BACK;
                    d(true, bq.BACK, strA);
                } else if (iOptInt == 2) {
                    this.f40516l.f40601j = bj.c.BACK;
                    z10 = false;
                    d(false, bq.BACK, strA);
                } else {
                    if (iOptInt != 3) {
                        if (iOptInt == 5) {
                            if (jSONObjectOptJSONObject2.optBoolean("hasNFC") && !jSONObjectOptJSONObject2.optBoolean("isPassport")) {
                                int i24 = aO + 65;
                                aQ = i24 % 128;
                                int i25 = i24 % 2;
                                this.ab = true;
                            }
                            this.X = jSONObjectOptJSONObject.optString("mrzKey");
                            this.av = 0;
                            O();
                            this.R = true;
                            runOnUiThread(new r3(this, 0));
                            t.e(new Object[]{cu.NFC_START}, -590439926, 590439930, (int) System.currentTimeMillis());
                            return false;
                        }
                        b(new Object[]{this}, 666961326, -666961311, System.identityHashCode(this));
                        return false;
                    }
                    int i26 = aO + 43;
                    aQ = i26 % 128;
                    if (i26 % 2 != 0) {
                        cc ccVar = this.f40571d;
                        if (ccVar != null) {
                            ccVar.g();
                            this.aw = jSONObjectOptJSONObject;
                            this.N = true;
                            d(new p3(this, 0));
                        } else {
                            e eVar = e.UNEXPECTED_NULL;
                            StringBuilder sb2 = new StringBuilder("phoenixHandler is null inside onIDScanResultNextStep(). Session is finished: ");
                            sb2.append(isFinishing());
                            t.c(this, eVar, sb2.toString());
                        }
                    } else {
                        throw null;
                    }
                }
                return false;
            }
            this.f40516l.f40601j = bj.c.FRONT;
            z10 = false;
            d(false, bq.FRONT, strA);
            return z10;
        } catch (JSONException e5) {
            e5.printStackTrace();
            b(new Object[]{this, null}, -1431415695, 1431415697, System.identityHashCode(this));
            return false;
        }
    }

    private void c(int i10) throws Throwable {
        b(new Object[]{this, Integer.valueOf(i10)}, -207278363, 207278379, i10);
    }

    private void d(int i10) {
        int i11 = aO + 91;
        aQ = i11 % 128;
        int i12 = i11 % 2;
        if (this.f40524u != null) {
            int i13 = aQ + 23;
            aO = i13 % 128;
            if (i13 % 2 == 0) {
                if (isFinishing()) {
                    return;
                }
                if (i10 == 0) {
                    aa();
                    return;
                } else {
                    this.f40524u.d(new s1(this, 1), i10);
                    return;
                }
            }
            isFinishing();
            throw null;
        }
    }

    private void d(final b bVar) {
        final String string = UUID.randomUUID().toString();
        this.at = new FaceTecIDScanResult(FaceTecIDScanStatus.SUCCESS);
        cx.d(new Runnable() { // from class: com.facetec.sdk.q3
            @Override // java.lang.Runnable
            public final void run() {
                this.f42777p0.e(string, bVar);
            }
        }).e(new b4(this, 0));
        int i10 = aO + 3;
        aQ = i10 % 128;
        int i11 = i10 % 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ byte[] d(String str) {
        int i10 = aQ + 113;
        aO = i10 % 128;
        byte[] bArrT = i10 % 2 != 0 ? ch.t(str, this.m, true, false) : ch.t(str, this.m, false, true);
        int i11 = aQ + 9;
        aO = i11 % 128;
        int i12 = i11 % 2;
        return bArrT;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ byte[] d(boolean z10, String str) {
        int i10 = aO + 121;
        aQ = i10 % 128;
        int i11 = i10 % 2;
        byte[] bArrT = ch.t(str, this.m, z10, false);
        int i12 = aO + 115;
        aQ = i12 % 128;
        if (i12 % 2 != 0) {
            return bArrT;
        }
        throw null;
    }

    private void b(FaceTecIDScanNextStep faceTecIDScanNextStep) throws Throwable {
        if (this.f40524u == null) {
            int i10 = aQ + 53;
            aO = i10 % 128;
            int i11 = i10 % 2;
            b(faceTecIDScanNextStep, false);
            this.K = false;
            return;
        }
        this.f40524u.b(new k1(this, faceTecIDScanNextStep, 1));
        int i12 = aQ + 39;
        aO = i12 % 128;
        int i13 = i12 % 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void d(cn cnVar) throws Throwable {
        b(new Object[]{this, cnVar}, 532022957, -532022951, System.identityHashCode(this));
    }

    public final void d(dt dtVar, String str) throws Throwable {
        b(new Object[]{this, dtVar, str}, 1886832182, -1886832181, System.identityHashCode(this));
    }

    @Override // com.facetec.sdk.bh
    public final synchronized void b() {
        boolean z10 = this.f40508an;
        if (z10) {
            bj bjVar = this.f40516l;
            if (bjVar != null) {
                bjVar.j();
            }
            return;
        }
        if (this.C) {
            return;
        }
        this.C = true;
        if (this.H) {
            return;
        }
        if (!z10) {
            int i10 = aQ + 75;
            aO = i10 % 128;
            if (i10 % 2 != 0) {
                throw null;
            }
            if (!this.f40510f) {
                if (e() != bh.b.GRANTED) {
                    int i11 = aO + 41;
                    aQ = i11 % 128;
                    int i12 = i11 % 2;
                    e(FaceTecSessionStatus.CONTEXT_SWITCH, (FaceTecIDScanStatus) null);
                } else if (!E()) {
                    this.f40515k.a(this, t.b.SESSION_CONTEXT_SWITCH);
                    c(false);
                }
                t.c(this, e.NON_FATAL_ERROR, FaceTecSessionStatus.CONTEXT_SWITCH.toString());
                return;
            }
        }
        t.c(this, e.NON_FATAL_ERROR, FaceTecIDScanStatus.CONTEXT_SWITCH.toString());
    }

    /* JADX WARN: Code duplicated, block: B:102:0x01a1 A[Catch: all -> 0x005c, TryCatch #1 {all -> 0x005c, blocks: (B:3:0x0001, B:5:0x0007, B:8:0x000d, B:10:0x0020, B:12:0x0024, B:14:0x002f, B:16:0x0033, B:18:0x0037, B:20:0x004c, B:23:0x005f, B:47:0x00cb, B:65:0x0139, B:66:0x0147, B:71:0x014f, B:78:0x0162, B:80:0x0166, B:82:0x016c, B:85:0x0172, B:86:0x0174, B:89:0x0179, B:91:0x017d, B:93:0x018c, B:102:0x01a1, B:100:0x019e, B:104:0x01a5, B:107:0x01aa, B:76:0x015e, B:64:0x0136, B:27:0x006e, B:28:0x006f, B:30:0x0073, B:32:0x0077, B:34:0x007b, B:36:0x008e, B:40:0x009d, B:42:0x00a1, B:43:0x00a8, B:45:0x00b0, B:46:0x00bf, B:37:0x0091, B:39:0x009b, B:110:0x01af, B:116:0x01be, B:114:0x01bc, B:25:0x006c, B:96:0x0199, B:48:0x00d2, B:50:0x00d9, B:53:0x00df, B:54:0x00fb, B:59:0x0110, B:61:0x0129, B:62:0x0133, B:56:0x00ff, B:57:0x0105, B:58:0x010b), top: B:121:0x0001, inners: #0, #2, #3, #4, #5 }] */
    /* JADX WARN: Code duplicated, block: B:103:0x01a4  */
    /* JADX WARN: Code duplicated, block: B:28:0x006f A[Catch: all -> 0x005c, TryCatch #1 {all -> 0x005c, blocks: (B:3:0x0001, B:5:0x0007, B:8:0x000d, B:10:0x0020, B:12:0x0024, B:14:0x002f, B:16:0x0033, B:18:0x0037, B:20:0x004c, B:23:0x005f, B:47:0x00cb, B:65:0x0139, B:66:0x0147, B:71:0x014f, B:78:0x0162, B:80:0x0166, B:82:0x016c, B:85:0x0172, B:86:0x0174, B:89:0x0179, B:91:0x017d, B:93:0x018c, B:102:0x01a1, B:100:0x019e, B:104:0x01a5, B:107:0x01aa, B:76:0x015e, B:64:0x0136, B:27:0x006e, B:28:0x006f, B:30:0x0073, B:32:0x0077, B:34:0x007b, B:36:0x008e, B:40:0x009d, B:42:0x00a1, B:43:0x00a8, B:45:0x00b0, B:46:0x00bf, B:37:0x0091, B:39:0x009b, B:110:0x01af, B:116:0x01be, B:114:0x01bc, B:25:0x006c, B:96:0x0199, B:48:0x00d2, B:50:0x00d9, B:53:0x00df, B:54:0x00fb, B:59:0x0110, B:61:0x0129, B:62:0x0133, B:56:0x00ff, B:57:0x0105, B:58:0x010b), top: B:121:0x0001, inners: #0, #2, #3, #4, #5 }] */
    /* JADX WARN: Code duplicated, block: B:36:0x008e A[Catch: all -> 0x005c, TryCatch #1 {all -> 0x005c, blocks: (B:3:0x0001, B:5:0x0007, B:8:0x000d, B:10:0x0020, B:12:0x0024, B:14:0x002f, B:16:0x0033, B:18:0x0037, B:20:0x004c, B:23:0x005f, B:47:0x00cb, B:65:0x0139, B:66:0x0147, B:71:0x014f, B:78:0x0162, B:80:0x0166, B:82:0x016c, B:85:0x0172, B:86:0x0174, B:89:0x0179, B:91:0x017d, B:93:0x018c, B:102:0x01a1, B:100:0x019e, B:104:0x01a5, B:107:0x01aa, B:76:0x015e, B:64:0x0136, B:27:0x006e, B:28:0x006f, B:30:0x0073, B:32:0x0077, B:34:0x007b, B:36:0x008e, B:40:0x009d, B:42:0x00a1, B:43:0x00a8, B:45:0x00b0, B:46:0x00bf, B:37:0x0091, B:39:0x009b, B:110:0x01af, B:116:0x01be, B:114:0x01bc, B:25:0x006c, B:96:0x0199, B:48:0x00d2, B:50:0x00d9, B:53:0x00df, B:54:0x00fb, B:59:0x0110, B:61:0x0129, B:62:0x0133, B:56:0x00ff, B:57:0x0105, B:58:0x010b), top: B:121:0x0001, inners: #0, #2, #3, #4, #5 }] */
    /* JADX WARN: Code duplicated, block: B:37:0x0091 A[Catch: all -> 0x005c, TryCatch #1 {all -> 0x005c, blocks: (B:3:0x0001, B:5:0x0007, B:8:0x000d, B:10:0x0020, B:12:0x0024, B:14:0x002f, B:16:0x0033, B:18:0x0037, B:20:0x004c, B:23:0x005f, B:47:0x00cb, B:65:0x0139, B:66:0x0147, B:71:0x014f, B:78:0x0162, B:80:0x0166, B:82:0x016c, B:85:0x0172, B:86:0x0174, B:89:0x0179, B:91:0x017d, B:93:0x018c, B:102:0x01a1, B:100:0x019e, B:104:0x01a5, B:107:0x01aa, B:76:0x015e, B:64:0x0136, B:27:0x006e, B:28:0x006f, B:30:0x0073, B:32:0x0077, B:34:0x007b, B:36:0x008e, B:40:0x009d, B:42:0x00a1, B:43:0x00a8, B:45:0x00b0, B:46:0x00bf, B:37:0x0091, B:39:0x009b, B:110:0x01af, B:116:0x01be, B:114:0x01bc, B:25:0x006c, B:96:0x0199, B:48:0x00d2, B:50:0x00d9, B:53:0x00df, B:54:0x00fb, B:59:0x0110, B:61:0x0129, B:62:0x0133, B:56:0x00ff, B:57:0x0105, B:58:0x010b), top: B:121:0x0001, inners: #0, #2, #3, #4, #5 }] */
    /* JADX WARN: Code duplicated, block: B:39:0x009b A[Catch: all -> 0x005c, TryCatch #1 {all -> 0x005c, blocks: (B:3:0x0001, B:5:0x0007, B:8:0x000d, B:10:0x0020, B:12:0x0024, B:14:0x002f, B:16:0x0033, B:18:0x0037, B:20:0x004c, B:23:0x005f, B:47:0x00cb, B:65:0x0139, B:66:0x0147, B:71:0x014f, B:78:0x0162, B:80:0x0166, B:82:0x016c, B:85:0x0172, B:86:0x0174, B:89:0x0179, B:91:0x017d, B:93:0x018c, B:102:0x01a1, B:100:0x019e, B:104:0x01a5, B:107:0x01aa, B:76:0x015e, B:64:0x0136, B:27:0x006e, B:28:0x006f, B:30:0x0073, B:32:0x0077, B:34:0x007b, B:36:0x008e, B:40:0x009d, B:42:0x00a1, B:43:0x00a8, B:45:0x00b0, B:46:0x00bf, B:37:0x0091, B:39:0x009b, B:110:0x01af, B:116:0x01be, B:114:0x01bc, B:25:0x006c, B:96:0x0199, B:48:0x00d2, B:50:0x00d9, B:53:0x00df, B:54:0x00fb, B:59:0x0110, B:61:0x0129, B:62:0x0133, B:56:0x00ff, B:57:0x0105, B:58:0x010b), top: B:121:0x0001, inners: #0, #2, #3, #4, #5 }] */
    /* JADX WARN: Code duplicated, block: B:42:0x00a1 A[Catch: all -> 0x005c, TryCatch #1 {all -> 0x005c, blocks: (B:3:0x0001, B:5:0x0007, B:8:0x000d, B:10:0x0020, B:12:0x0024, B:14:0x002f, B:16:0x0033, B:18:0x0037, B:20:0x004c, B:23:0x005f, B:47:0x00cb, B:65:0x0139, B:66:0x0147, B:71:0x014f, B:78:0x0162, B:80:0x0166, B:82:0x016c, B:85:0x0172, B:86:0x0174, B:89:0x0179, B:91:0x017d, B:93:0x018c, B:102:0x01a1, B:100:0x019e, B:104:0x01a5, B:107:0x01aa, B:76:0x015e, B:64:0x0136, B:27:0x006e, B:28:0x006f, B:30:0x0073, B:32:0x0077, B:34:0x007b, B:36:0x008e, B:40:0x009d, B:42:0x00a1, B:43:0x00a8, B:45:0x00b0, B:46:0x00bf, B:37:0x0091, B:39:0x009b, B:110:0x01af, B:116:0x01be, B:114:0x01bc, B:25:0x006c, B:96:0x0199, B:48:0x00d2, B:50:0x00d9, B:53:0x00df, B:54:0x00fb, B:59:0x0110, B:61:0x0129, B:62:0x0133, B:56:0x00ff, B:57:0x0105, B:58:0x010b), top: B:121:0x0001, inners: #0, #2, #3, #4, #5 }] */
    /* JADX WARN: Code duplicated, block: B:45:0x00b0 A[Catch: all -> 0x005c, TryCatch #1 {all -> 0x005c, blocks: (B:3:0x0001, B:5:0x0007, B:8:0x000d, B:10:0x0020, B:12:0x0024, B:14:0x002f, B:16:0x0033, B:18:0x0037, B:20:0x004c, B:23:0x005f, B:47:0x00cb, B:65:0x0139, B:66:0x0147, B:71:0x014f, B:78:0x0162, B:80:0x0166, B:82:0x016c, B:85:0x0172, B:86:0x0174, B:89:0x0179, B:91:0x017d, B:93:0x018c, B:102:0x01a1, B:100:0x019e, B:104:0x01a5, B:107:0x01aa, B:76:0x015e, B:64:0x0136, B:27:0x006e, B:28:0x006f, B:30:0x0073, B:32:0x0077, B:34:0x007b, B:36:0x008e, B:40:0x009d, B:42:0x00a1, B:43:0x00a8, B:45:0x00b0, B:46:0x00bf, B:37:0x0091, B:39:0x009b, B:110:0x01af, B:116:0x01be, B:114:0x01bc, B:25:0x006c, B:96:0x0199, B:48:0x00d2, B:50:0x00d9, B:53:0x00df, B:54:0x00fb, B:59:0x0110, B:61:0x0129, B:62:0x0133, B:56:0x00ff, B:57:0x0105, B:58:0x010b), top: B:121:0x0001, inners: #0, #2, #3, #4, #5 }] */
    private synchronized void b(FaceTecSessionStatus faceTecSessionStatus, FaceTecIDScanStatus faceTecIDScanStatus) {
        FaceTecIDScanResult faceTecIDScanResult;
        t.b bVar;
        n nVar;
        boolean z10;
        try {
            if (!this.G && !this.E) {
                this.E = true;
                cx.d(new m4(this, 0));
                dn.e();
                if (FaceTecSessionActivity.f40124e != null && !this.F) {
                    int i10 = aQ + 31;
                    aO = i10 % 128;
                    if (i10 % 2 == 0) {
                        if (!this.f40510f && !this.f40520q) {
                            FaceTecSessionResult faceTecSessionResult = new FaceTecSessionResult(faceTecSessionStatus, this.D, this.f40529z, this.A);
                            this.f40519p = faceTecSessionResult;
                            this.F = true;
                            if (faceTecSessionResult.getStatus() != null) {
                                t.c(this, e.FACESCAN_CALLBACK_CALLED, this.f40519p.getStatus().toString());
                            }
                            FaceTecSessionActivity.f40124e.processSessionWhileFaceTecSDKWaits(this.f40519p, new bc(this));
                        } else if (FaceTecSessionActivity.f40125i != null) {
                            faceTecIDScanResult = new FaceTecIDScanResult(faceTecIDScanStatus);
                            this.at = faceTecIDScanResult;
                            this.L = true;
                            bVar = t.b.USER_WAS_SUCCESSFUL;
                            if (faceTecIDScanResult.getStatus() == FaceTecIDScanStatus.USER_CANCELED) {
                                bVar = t.b.USER_CANCELLED;
                            } else if (this.at.getStatus() == FaceTecIDScanStatus.CONTEXT_SWITCH) {
                                bVar = t.b.SESSION_CONTEXT_SWITCH;
                            }
                            nVar = this.f40515k;
                            if (nVar != null) {
                                nVar.e(this, bVar, this.m, this.f40510f);
                            }
                            if (this.at.getStatus() != null) {
                                t.c(this, e.ID_SCAN_CALLBACK_CALLED, this.at.getStatus().toString());
                            }
                            FaceTecSessionActivity.f40125i.processIDScanWhileFaceTecSDKWaits(this.at, new br(this));
                        }
                    } else {
                        throw null;
                    }
                } else if (FaceTecSessionActivity.f40125i != null && !this.L && !this.f40520q) {
                    faceTecIDScanResult = new FaceTecIDScanResult(faceTecIDScanStatus);
                    this.at = faceTecIDScanResult;
                    this.L = true;
                    bVar = t.b.USER_WAS_SUCCESSFUL;
                    if (faceTecIDScanResult.getStatus() == FaceTecIDScanStatus.USER_CANCELED) {
                        bVar = t.b.USER_CANCELLED;
                    } else if (this.at.getStatus() == FaceTecIDScanStatus.CONTEXT_SWITCH) {
                        bVar = t.b.SESSION_CONTEXT_SWITCH;
                    }
                    nVar = this.f40515k;
                    if (nVar != null) {
                        nVar.e(this, bVar, this.m, this.f40510f);
                    }
                    if (this.at.getStatus() != null) {
                        t.c(this, e.ID_SCAN_CALLBACK_CALLED, this.at.getStatus().toString());
                    }
                    FaceTecSessionActivity.f40125i.processIDScanWhileFaceTecSDKWaits(this.at, new br(this));
                }
                this.H = true;
                Intent intent = new Intent();
                try {
                    e(false);
                    n nVar2 = this.f40515k;
                    if (nVar2 != null) {
                        nVar2.d();
                    }
                    as.d(new Object[]{faceTecSessionStatus, this}, 1164904952, -1164904952, (int) System.currentTimeMillis());
                    switch (AnonymousClass3.f40530a[faceTecSessionStatus.ordinal()]) {
                        case 1:
                            ap.d(this, ao.FT_EVENT_VERIFY_SESSION_SUCCESS);
                            break;
                        case 2:
                        case 3:
                        case 4:
                        case 5:
                            ap.d(this, ao.FT_EVENT_VERIFY_SESSION_FAIL);
                            break;
                        case 7:
                        case 8:
                        case 9:
                            ap.d(this, ao.FT_EVENT_VERIFY_SESSION_CANCEL);
                            break;
                    }
                    FaceTecSessionResult faceTecSessionResult2 = new FaceTecSessionResult(faceTecSessionStatus, this.D, this.f40529z, this.A);
                    faceTecSessionResult2.e(cc.f40802c);
                    intent.putExtra(FaceTecSDK.EXTRA_SESSION_RESULTS, faceTecSessionResult2);
                    if (FaceTecSessionActivity.f40125i != null) {
                        O();
                        intent.putExtra(FaceTecSDK.EXTRA_ID_SCAN_RESULTS, this.at);
                    }
                    this.f40519p = faceTecSessionResult2;
                } catch (Throwable th2) {
                    k.c(th2);
                }
                FaceTecSessionActivity.f40124e = null;
                FaceTecSessionActivity.f40125i = null;
                setResult(-1, intent);
                finish();
                P();
                try {
                    if (!(!this.V) && faceTecIDScanStatus == null) {
                        int i11 = aQ + 101;
                        aO = i11 % 128;
                        z10 = i11 % 2 == 0;
                    }
                } catch (Exception e5) {
                    k.c(e5);
                }
                if (faceTecSessionStatus == FaceTecSessionStatus.SESSION_UNSUCCESSFUL) {
                    int i12 = FaceTecSDK.f40106a.exitAnimationUnsuccessResourceID;
                    if (i12 == -1) {
                        i12 = z10 ^ true ? 0 : R.anim.facetec_fade_out;
                    }
                    overridePendingTransition(0, i12);
                    return;
                }
                if (faceTecSessionStatus == FaceTecSessionStatus.SESSION_COMPLETED_SUCCESSFULLY) {
                    int i13 = aQ + 73;
                    aO = i13 % 128;
                    int i14 = i13 % 2;
                    int i15 = FaceTecSDK.f40106a.exitAnimationSuccessResourceID;
                    if (i15 == -1) {
                        int i16 = aO + 61;
                        aQ = i16 % 128;
                        if (i16 % 2 == 0) {
                            int i17 = 34 / 0;
                            if (!z10) {
                                i15 = 0;
                            } else {
                                i15 = R.anim.facetec_fade_out;
                            }
                        } else if (z10) {
                            i15 = R.anim.facetec_fade_out;
                        } else {
                            i15 = 0;
                        }
                    }
                    overridePendingTransition(0, i15);
                    return;
                }
                overridePendingTransition(0, 0);
                return;
            }
            int i18 = aQ + 81;
            aO = i18 % 128;
            if (i18 % 2 == 0) {
                return;
            } else {
                throw null;
            }
        } catch (Throwable th3) {
            throw th3;
        }
        throw th3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void e(Runnable runnable) {
        int i10 = aO + 95;
        aQ = i10 % 128;
        int i11 = i10 % 2;
        if (isFinishing() || !hasWindowFocus()) {
            int i12 = aQ + 19;
            aO = i12 % 128;
            if (i12 % 2 != 0) {
                throw null;
            }
            return;
        }
        if (runnable != null) {
            runnable.run();
        }
        int i13 = aQ + 67;
        aO = i13 % 128;
        if (i13 % 2 != 0) {
            throw null;
        }
    }

    private static /* synthetic */ Object e(Object[] objArr) {
        be beVar = (be) objArr[0];
        int i10 = aQ + 69;
        aO = i10 % 128;
        int i11 = i10 % 2;
        cx.d(new r3(beVar, 1)).e(new i4(beVar, 0));
        int i12 = aQ + 9;
        aO = i12 % 128;
        if (i12 % 2 == 0) {
            return null;
        }
        throw null;
    }

    public final void e(final JSONObject jSONObject) {
        int i10 = aQ + 55;
        aO = i10 % 128;
        int i11 = i10 % 2;
        d(0);
        co.c cVar = co.c.USER_CONFIRMED_INFO;
        this.az = cVar;
        this.f40524u = co.a(true, cVar);
        getFragmentManager().beginTransaction().setCustomAnimations(R.animator.facetec_no_delay_fade_in, 0).add(this.f40497ac, this.f40524u, "Results").commitAllowingStateLoss();
        d(new b() { // from class: com.facetec.sdk.d3
            @Override // com.facetec.sdk.be.b
            public final byte[] getIdScanBytes(String str) {
                return this.f41135a.c(jSONObject, str);
            }
        });
        int i12 = aQ + 61;
        aO = i12 % 128;
        int i13 = i12 % 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void e(String str, b bVar) {
        this.at.f40101c = str;
        byte[][] bArrU = ch.u();
        byte[][] bArrY = ch.y();
        FaceTecIDScanResult faceTecIDScanResult = this.at;
        if (bArrU != null) {
            int i10 = aO + 33;
            aQ = i10 % 128;
            int i11 = i10 % 2;
            int i12 = 0;
            while (i12 < bArrU.length) {
                int i13 = aO + 15;
                aQ = i13 % 128;
                if (i13 % 2 == 0) {
                    faceTecIDScanResult.f40103e.add(Base64.encodeToString(bArrU[i12], 4));
                    i12 += 53;
                } else {
                    faceTecIDScanResult.f40103e.add(Base64.encodeToString(bArrU[i12], 2));
                    i12++;
                }
            }
        }
        FaceTecIDScanResult faceTecIDScanResult2 = this.at;
        if (bArrY != null) {
            for (byte[] bArr : bArrY) {
                int i14 = aO + 115;
                aQ = i14 % 128;
                int i15 = i14 % 2;
                faceTecIDScanResult2.f40099a.add(Base64.encodeToString(bArr, 2));
            }
        }
        this.at.f40102d = bVar.getIdScanBytes(str);
    }

    private static /* synthetic */ Object b(Object[] objArr) {
        be beVar = (be) objArr[0];
        cn cnVar = (cn) objArr[1];
        int i10 = aO + 5;
        aQ = i10 % 128;
        int i11 = i10 % 2;
        if (beVar.isFinishing()) {
            return null;
        }
        beVar.getFragmentManager().beginTransaction().replace(beVar.f40497ac, cnVar, "RetryZoom").commitAllowingStateLoss();
        beVar.f40527x = cnVar;
        int i12 = aQ + 97;
        aO = i12 % 128;
        if (i12 % 2 == 0) {
            return null;
        }
        throw null;
    }

    @Override // com.facetec.sdk.bh
    public final void b(int i10) throws Throwable {
        e eVar = e.SEVERE_ERROR;
        StringBuilder sb2 = new StringBuilder();
        FaceTecSessionStatus faceTecSessionStatus = FaceTecSessionStatus.UNKNOWN_INTERNAL_ERROR;
        sb2.append(faceTecSessionStatus);
        sb2.append(": ");
        sb2.append(i10);
        String string = sb2.toString();
        boolean z10 = true;
        if (!ag.f40233d) {
            int i11 = aQ + 47;
            int i12 = i11 % 128;
            aO = i12;
            int i13 = i11 % 2;
            int i14 = i12 + 101;
            aQ = i14 % 128;
            int i15 = i14 % 2;
        } else {
            z10 = false;
        }
        t.d(this, null, eVar, string, z10);
        e(faceTecSessionStatus, (FaceTecIDScanStatus) null);
    }

    @Override // com.facetec.sdk.bh
    public final void b(String str) throws Throwable {
        if (this.f40508an) {
            int i10 = aQ + 31;
            aO = i10 % 128;
            int i11 = i10 % 2;
            t.c(this, e.UNEXPECTED_EARLY_EXIT_IDSCAN, "IDScan Camera Error: ".concat(String.valueOf(str)));
            b(new Object[]{this, FaceTecIDScanStatus.CAMERA_ERROR}, -1431415695, 1431415697, System.identityHashCode(this));
            return;
        }
        t.c(this, e.UNEXPECTED_EARLY_EXIT_FACESCAN, "FaceScan Camera Error: ".concat(String.valueOf(str)));
        e(FaceTecSessionStatus.CAMERA_INITIALIZATION_ISSUE, (FaceTecIDScanStatus) null);
        int i12 = aQ + 25;
        aO = i12 % 128;
        if (i12 % 2 != 0) {
            throw null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b(View view) {
        int i10 = aO + 111;
        aQ = i10 % 128;
        if (i10 % 2 != 0) {
            if (view != null) {
                view.setVisibility(4);
                int i11 = aO + 91;
                aQ = i11 % 128;
                int i12 = i11 % 2;
            }
            this.f40502ah.setVisibility(4);
            return;
        }
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b(float f6) {
        int i10 = aQ + 25;
        aO = i10 % 128;
        int i11 = i10 % 2;
        if (this.f40524u != null) {
            int i12 = aO + 99;
            aQ = i12 % 128;
            if (i12 % 2 == 0) {
                this.f40524u.b(f6);
                int i13 = 11 / 0;
            } else {
                this.f40524u.b(f6);
            }
        }
    }

    private void b(FaceTecIDScanNextStep faceTecIDScanNextStep, boolean z10) throws Throwable {
        cc ccVar = this.f40571d;
        if (ccVar == null) {
            return;
        }
        ccVar.c();
        b(new Object[]{this}, 695221187, -695221167, System.identityHashCode(this));
        if (this.f40509e != null) {
            int i10 = aO + 95;
            aQ = i10 % 128;
            if (i10 % 2 == 0) {
                getFragmentManager().findFragmentByTag("Zoom");
                throw null;
            }
            if (getFragmentManager().findFragmentByTag("Zoom") != null) {
                getFragmentManager().beginTransaction().remove(this.f40509e).commitAllowingStateLoss();
            }
            this.f40509e = null;
            int i11 = aO + 45;
            aQ = i11 % 128;
            int i12 = i11 % 2;
        }
        if (this.f40516l == null) {
            this.f40516l = bj.c(false, this.f40510f);
        }
        if (!this.f40510f) {
            this.f40519p = new FaceTecSessionResult(this.f40519p.getStatus(), this.D, this.f40529z, this.A);
            if (this.f40525v == c.FACESCAN_SESSION_STARTED) {
                this.f40571d.c(true);
            }
        }
        this.f40521r = faceTecIDScanNextStep;
        this.f40516l.e(z10);
        this.f40516l.b(this.f40514j);
        ad();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b(final boolean z10, String str) throws Throwable {
        int i10 = aQ + 125;
        aO = i10 % 128;
        int i11 = i10 % 2;
        this.f40524u.d(z10, z10, str, new Runnable() { // from class: com.facetec.sdk.l3
            @Override // java.lang.Runnable
            public final void run() {
                this.f42241p0.h(z10);
            }
        });
        int i12 = aQ + 75;
        aO = i12 % 128;
        int i13 = i12 % 2;
    }

    public final void b(boolean z10) throws Throwable {
        b(new Object[]{this, Boolean.valueOf(z10)}, -2013187710, 2013187720, System.identityHashCode(this));
    }
}

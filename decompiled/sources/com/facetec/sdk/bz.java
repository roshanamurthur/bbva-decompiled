package com.facetec.sdk;

import android.animation.ArgbEvaluator;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Process;
import android.text.AndroidCharacter;
import android.text.Editable;
import android.text.InputFilter;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewOutlineProvider;
import android.view.ViewTreeObserver;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.ExpandableListView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.core.content.ContextCompat;
import androidx.vectordrawable.graphics.drawable.Animatable2Compat;
import androidx.vectordrawable.graphics.drawable.AnimatedVectorDrawableCompat;
import com.bbva.nativesettings.common.Constants;
import com.mastercard.mpsdk.mcbp.mcmlite.apdu.Iso7816;
import com.nulabinc.zxcvbn.Guess;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes9.dex */
public final class bz extends aq {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static char[] K;
    private static long N;
    private TextView A;
    private LinearLayout B;
    private RelativeLayout C;
    private View D;
    private EditText H;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    JSONObject f40735a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected a f40736b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected RelativeLayout f40737c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    protected LinearLayout f40738d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    protected ScrollView f40739e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    AnimatedVectorDrawableCompat f40740f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    protected LinearLayout f40741g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    protected ImageView f40742h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    AnimatedVectorDrawableCompat f40743i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    protected TextView f40744j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    protected int f40745k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    protected int f40746l;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    protected Drawable f40748o;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    final float f40750q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    final float f40751r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    final int f40753t;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private View f40757x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private View f40758y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private Animatable2Compat.AnimationCallback f40759z;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private int f40752s = 500;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private int f40756w = 300;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private int f40755v = 200;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private int f40754u = Guess.REFERENCE_YEAR;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    protected boolean f40747n = false;
    protected boolean m = true;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    protected boolean f40749p = true;
    private boolean I = true;
    private boolean F = false;
    private boolean E = false;
    private float G = db.c();

    /* JADX INFO: renamed from: com.facetec.sdk.bz$1, reason: invalid class name */
    public class AnonymousClass1 extends Animatable2Compat.AnimationCallback {
        public AnonymousClass1() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void c() {
            AnimatedVectorDrawableCompat animatedVectorDrawableCompat = bz.this.f40743i;
            if (animatedVectorDrawableCompat == null) {
                return;
            }
            animatedVectorDrawableCompat.start();
        }

        @Override // androidx.vectordrawable.graphics.drawable.Animatable2Compat.AnimationCallback
        public final void onAnimationEnd(Drawable drawable) {
            bz.this.b(new u2(this, 2));
        }
    }

    /* JADX INFO: renamed from: com.facetec.sdk.bz$3, reason: invalid class name */
    public class AnonymousClass3 implements ViewTreeObserver.OnGlobalLayoutListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private /* synthetic */ Context f40761a;

        public AnonymousClass3(Context context) {
            this.f40761a = context;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ boolean aX_(View view, MotionEvent motionEvent) {
            if (!bz.this.f40737c.isEnabled()) {
                return true;
            }
            if (motionEvent.getAction() == 0) {
                bz.e(bz.this, true);
            } else if (motionEvent.getAction() == 3 || motionEvent.getX() < 0.0f || motionEvent.getX() > bz.this.f40737c.getWidth() || motionEvent.getY() < 0.0f || motionEvent.getY() > bz.this.f40737c.getHeight()) {
                bz.e(bz.this, false);
            } else if (motionEvent.getAction() == 1) {
                bz.this.f40737c.performClick();
            }
            return true;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void e() {
            int scrollY = bz.this.f40739e.getScrollY();
            int height = bz.this.f40739e.getHeight() + scrollY;
            int bottom = bz.this.f40738d.getBottom();
            if (!bz.this.f40736b.isEnabled() && bottom <= height) {
                bz.this.f40736b.d(true, true);
            }
            bz bzVar = bz.this;
            if (!bzVar.f40747n || scrollY <= 0) {
                return;
            }
            bz.d(bzVar);
        }

        /* JADX WARN: Code duplicated, block: B:34:0x0215 A[DONT_INVERT] */
        /* JADX WARN: Code duplicated, block: B:35:0x0217  */
        /* JADX WARN: Code duplicated, block: B:37:0x021d  */
        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        @SuppressLint({"ClickableViewAccessibility"})
        public final void onGlobalLayout() {
            bz bzVar;
            ViewTreeObserver viewTreeObserver = bz.this.f40739e.getViewTreeObserver();
            if (viewTreeObserver.isAlive()) {
                Rect rect = new Rect();
                bz.this.f40739e.getHitRect(rect);
                boolean localVisibleRect = bz.this.f40736b.getLocalVisibleRect(rect);
                boolean z10 = bz.this.f40739e.getHeight() < bz.this.f40738d.getHeight();
                if (z10 && (!localVisibleRect || bz.this.m)) {
                    bz bzVar2 = bz.this;
                    if (bzVar2.f40749p) {
                        if (!bzVar2.m) {
                            bzVar2.f40736b.setEnabled(false);
                        }
                        viewTreeObserver.addOnScrollChangedListener(new ViewTreeObserver.OnScrollChangedListener() { // from class: com.facetec.sdk.j6
                            @Override // android.view.ViewTreeObserver.OnScrollChangedListener
                            public final void onScrollChanged() {
                                this.f41896a.e();
                            }
                        });
                        int iRound = Math.round(ay.e(40) * bz.this.f40750q);
                        int iRound2 = Math.round(ay.e(5) * bz.this.f40750q) << 2;
                        bz.this.f40741g.getLayoutParams().width = -2;
                        bz.this.f40741g.getLayoutParams().height = iRound;
                        ((RelativeLayout.LayoutParams) bz.this.f40741g.getLayoutParams()).setMargins(iRound2, 0, iRound2, 0);
                        bz bzVar3 = bz.this;
                        if (bzVar3.m) {
                            ((ViewGroup.MarginLayoutParams) ((RelativeLayout.LayoutParams) bzVar3.f40737c.getLayoutParams())).bottomMargin = bz.this.f40736b.getHeight() + (bz.this.f40753t << 1);
                        } else {
                            ((ViewGroup.MarginLayoutParams) ((RelativeLayout.LayoutParams) bzVar3.f40737c.getLayoutParams())).bottomMargin = bz.this.f40753t;
                        }
                        if (FaceTecSDK.f40106a.f40084g.showScrollIndicatorImage) {
                            int iRound3 = Math.round(ay.e(30) * bz.this.f40750q);
                            bz.this.f40742h.getLayoutParams().width = iRound3;
                            bz.this.f40742h.getLayoutParams().height = iRound3;
                            bz.e(bz.this, this.f40761a);
                        } else {
                            bz.this.f40742h.getLayoutParams().width = 0;
                            bz.this.f40742h.getLayoutParams().height = 0;
                            bz.this.f40742h.setVisibility(8);
                        }
                        bz bzVar4 = bz.this;
                        float f6 = bzVar4.f40750q * 16.0f;
                        Typeface typeface = FaceTecSDK.f40106a.f40084g.scrollIndicatorFont;
                        dd.bv_(bzVar4.f40744j, R.string.FaceTec_idscan_ocr_confirmation_scroll_message);
                        bz.this.f40744j.setTextSize(f6);
                        bz bzVar5 = bz.this;
                        bzVar5.f40744j.setTextColor(bzVar5.f40745k);
                        bz.this.f40744j.setTypeface(typeface);
                        ((LinearLayout.LayoutParams) bz.this.f40744j.getLayoutParams()).setMarginEnd(bz.this.f40753t / 2);
                        float fV = db.v();
                        float fRound = fV == -1.0f ? iRound / 2.0f : Math.round(ay.e(Math.round(fV)) * bz.this.f40751r);
                        bz.this.f40748o = ContextCompat.getDrawable(this.f40761a, R.drawable.facetec_scroll_down_indicator);
                        if (bz.this.f40748o != null) {
                            ((GradientDrawable) bz.this.f40748o).setStroke(Math.round(ay.e(db.q()) * bz.this.f40751r), db.e(this.f40761a, db.at()));
                            ((GradientDrawable) bz.this.f40748o).setCornerRadius(fRound);
                            bz bzVar6 = bz.this;
                            ((GradientDrawable) bzVar6.f40748o).setColor(bzVar6.f40746l);
                            bz bzVar7 = bz.this;
                            bzVar7.f40737c.setBackground(bzVar7.f40748o);
                        }
                        bz.this.f40737c.setElevation(ay.e(FaceTecSDK.f40106a.f40084g.scrollIndicatorElevation));
                        bz.this.f40737c.setOutlineProvider(ViewOutlineProvider.BACKGROUND);
                        bz.this.f40737c.setClipToOutline(false);
                        bz.this.f40737c.requestLayout();
                        bz.this.f40737c.setOnClickListener(new View.OnClickListener() { // from class: com.facetec.sdk.k6
                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                this.f41975p0.e(view);
                            }
                        });
                        bz.this.f40737c.setOnTouchListener(new View.OnTouchListener() { // from class: com.facetec.sdk.l6
                            @Override // android.view.View.OnTouchListener
                            public final boolean onTouch(View view, MotionEvent motionEvent) {
                                return this.f42246p0.aX_(view, motionEvent);
                            }
                        });
                        bz.this.f40737c.setVisibility(0);
                    } else if (!z10) {
                        bzVar = bz.this;
                        if (!bzVar.m) {
                            ((ViewGroup.MarginLayoutParams) ((LinearLayout.LayoutParams) bz.this.f40736b.getLayoutParams())).topMargin += Math.max(0, bzVar.f40739e.getHeight() - bz.this.f40738d.getHeight());
                            bz.this.f40736b.requestLayout();
                        }
                    }
                } else if (!z10) {
                    bzVar = bz.this;
                    if (!bzVar.m) {
                        ((ViewGroup.MarginLayoutParams) ((LinearLayout.LayoutParams) bz.this.f40736b.getLayoutParams())).topMargin += Math.max(0, bzVar.f40739e.getHeight() - bz.this.f40738d.getHeight());
                        bz.this.f40736b.requestLayout();
                    }
                }
                viewTreeObserver.removeOnGlobalLayoutListener(this);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void d() {
            bz.this.f40737c.setEnabled(false);
            bz.this.f40736b.setEnabled(true);
            bz.d(bz.this);
            bz.this.f40739e.fullScroll(130);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void e(View view) {
            bz.this.f40739e.post(new d1(this, 5));
        }
    }

    /* JADX INFO: renamed from: com.facetec.sdk.bz$4, reason: invalid class name */
    public class AnonymousClass4 extends Animatable2Compat.AnimationCallback {
        public AnonymousClass4() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void d() {
            AnimatedVectorDrawableCompat animatedVectorDrawableCompat = bz.this.f40740f;
            if (animatedVectorDrawableCompat == null) {
                return;
            }
            animatedVectorDrawableCompat.start();
        }

        @Override // androidx.vectordrawable.graphics.drawable.Animatable2Compat.AnimationCallback
        public final void onAnimationEnd(Drawable drawable) {
            bz.this.b(new f1(this, 2));
        }
    }

    static {
        init$0();
        K = new char[]{8684, 21737, 52204, 32461, 62864, 26796, 40883, 4746, 35217, 15574, 45913, 9829, 23901, 53316, 18215, 64057, 32908, 62865, Iso7816.SW_RECORD_NOT_FOUND, 57254, 21676, 51656, 16086, 46079, 10468};
        N = -1408727936988875293L;
    }

    public bz() {
        float fD = db.d();
        this.f40751r = fD;
        this.f40750q = this.G * fD;
        this.f40753t = db.e();
    }

    /* JADX WARN: Code duplicated, block: B:38:0x01bb  */
    /* JADX WARN: Code duplicated, block: B:39:0x01bc  */
    private static void J(int i10, int i11, char c10, Object[] objArr) throws Throwable {
        long j10;
        Throwable cause;
        gt gtVar = new gt();
        long[] jArr = new long[i10];
        gtVar.f41826d = 0;
        while (true) {
            int i12 = gtVar.f41826d;
            j10 = 0;
            if (i12 >= i10) {
                break;
            }
            try {
                Object[] objArr2 = {Integer.valueOf(K[i11 + i12])};
                Map map = bp.f40694x;
                Object method = map.get(-167668390);
                if (method == null) {
                    method = ((Class) bp.a(TextUtils.indexOf("", "", 0, 0) + 24, KeyEvent.keyCodeFromString("") + 245, (char) (1 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1))))).getMethod("d", Integer.TYPE);
                    map.put(-167668390, method);
                }
                Object[] objArr3 = {Long.valueOf(((Long) ((Method) method).invoke(null, objArr2)).longValue()), Long.valueOf(gtVar.f41826d), Long.valueOf(N), Integer.valueOf(c10)};
                Object method2 = map.get(-1565725271);
                if (method2 == null) {
                    Class cls = (Class) bp.a(24 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), 1672 - TextUtils.getTrimmedLength(""), (char) ((ViewConfiguration.getKeyRepeatDelay() >> 16) + 58390));
                    byte b10 = (byte) 0;
                    byte b11 = (byte) (b10 - 1);
                    Object[] objArr4 = new Object[1];
                    L(b10, b11, (byte) (b11 + 1), objArr4);
                    String str = (String) objArr4[0];
                    Class<?> cls2 = Long.TYPE;
                    method2 = cls.getMethod(str, cls2, cls2, cls2, Integer.TYPE);
                    map.put(-1565725271, method2);
                }
                jArr[i12] = ((Long) ((Method) method2).invoke(null, objArr3)).longValue();
                Object[] objArr5 = {gtVar, gtVar};
                Object method3 = map.get(453950717);
                if (method3 == null) {
                    method3 = ((Class) bp.a(24 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), 269 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), (char) (25686 - Color.green(0)))).getMethod("b", Object.class, Object.class);
                    map.put(453950717, method3);
                }
                ((Method) method3).invoke(null, objArr5);
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
        char[] cArr = new char[i10];
        gtVar.f41826d = 0;
        while (true) {
            int i13 = gtVar.f41826d;
            if (i13 >= i10) {
                objArr[0] = new String(cArr);
                return;
            }
            cArr[i13] = (char) jArr[i13];
            Object[] objArr6 = {gtVar, gtVar};
            Map map2 = bp.f40694x;
            Object method4 = map2.get(453950717);
            if (method4 == null) {
                method4 = ((Class) bp.a(24 - ExpandableListView.getPackedPositionGroup(j10), View.MeasureSpec.getMode(0) + 269, (char) (KeyEvent.keyCodeFromString("") + 25686))).getMethod("b", Object.class, Object.class);
                map2.put(453950717, method4);
            }
            ((Method) method4).invoke(null, objArr6);
            j10 = 0;
        }
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0029  */
    /* JADX WARN: Code duplicated, block: B:8:0x0021  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0029 -> B:11:0x0038). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0029
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void L(int r6, byte r7, byte r8, java.lang.Object[] r9) {
        /*
            int r7 = r7 + 4
            int r8 = r8 * 4
            int r0 = r8 + 1
            int r6 = r6 * 3
            int r6 = 99 - r6
            byte[] r1 = com.facetec.sdk.bz.$$a
            byte[] r0 = new byte[r0]
            r2 = 0
            if (r1 != 0) goto L18
            r3 = r1
            r4 = r2
            r1 = r0
            r0 = r9
            r9 = r8
            r8 = r7
            goto L38
        L18:
            r3 = r2
        L19:
            r5 = r7
            r7 = r6
            r6 = r5
            byte r4 = (byte) r7
            r0[r3] = r4
            if (r3 != r8) goto L29
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            r9[r2] = r6
            return
        L29:
            int r6 = r6 + 1
            int r3 = r3 + 1
            r4 = r1[r6]
            r5 = r7
            r7 = r6
            r6 = r4
            r4 = r3
            r3 = r1
            r1 = r0
            r0 = r9
            r9 = r8
            r8 = r5
        L38:
            int r6 = r6 + r8
            r8 = r9
            r9 = r0
            r0 = r1
            r1 = r3
            r3 = r4
            goto L19
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facetec.sdk.bz.L(int, byte, byte, java.lang.Object[]):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:120:0x04b4 A[LOOP:2: B:118:0x04ae->B:120:0x04b4, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:124:0x04e7 A[LOOP:3: B:122:0x04e1->B:124:0x04e7, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:127:0x0502  */
    /* JADX WARN: Code duplicated, block: B:167:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:89:0x03a9 A[Catch: JSONException -> 0x0385, TryCatch #1 {JSONException -> 0x0385, blocks: (B:72:0x0362, B:106:0x03f7, B:87:0x03a3, B:89:0x03a9, B:90:0x03aa, B:109:0x043a), top: B:131:0x0362 }] */
    /* JADX WARN: Code duplicated, block: B:90:0x03aa A[Catch: JSONException -> 0x0385, TryCatch #1 {JSONException -> 0x0385, blocks: (B:72:0x0362, B:106:0x03f7, B:87:0x03a3, B:89:0x03a9, B:90:0x03aa, B:109:0x043a), top: B:131:0x0362 }] */
    public /* synthetic */ void a(Context context, JSONObject jSONObject) throws Throwable {
        ArrayList arrayList;
        int i10;
        int iRound;
        int i11;
        int iMax;
        ArrayList arrayList2;
        int iMin;
        int i12;
        ViewTreeObserver viewTreeObserver;
        JSONArray jSONArrayOptJSONArray;
        JSONArray jSONArray;
        int i13;
        LayerDrawable layerDrawable;
        int i14;
        Typeface typeface;
        int i15;
        String str;
        String str2;
        String str3;
        ArrayList arrayList3;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        int i23;
        final int i24;
        int i25;
        ax axVar;
        Typeface typeface2;
        int i26;
        Throwable cause;
        String str4 = "uiFieldDescriptionText";
        String str5 = "fieldFriendlyName";
        String str6 = "groupFriendlyName";
        int iRound2 = Math.round(ay.e(30) * this.f40750q);
        int iRound3 = Math.round(ay.e(100) * this.f40750q);
        int iRound4 = Math.round(this.f40750q * 16.0f);
        int iRound5 = Math.round(this.f40750q * 12.0f);
        Typeface typeface3 = FaceTecSDK.f40106a.f40084g.sectionHeaderFont;
        int iE = db.e(context, db.ao());
        Typeface typeface4 = FaceTecSDK.f40106a.f40084g.fieldLabelFont;
        int iE2 = db.e(context, db.an());
        Typeface typeface5 = FaceTecSDK.f40106a.f40084g.inputFieldFont;
        int iE3 = db.e(context, db.aq());
        int i27 = iRound2;
        int iE4 = db.e(context, ((Integer) db.c(new Object[]{context}, 123760937, -123760935, (int) System.currentTimeMillis())).intValue());
        int iRound6 = Math.round(ay.e(db.p()));
        int iMax2 = Math.max(iRound6 == 0 ? 0 : 1, Math.round(iRound6 * this.f40751r));
        int iRound7 = Math.round(ay.e(db.E()));
        int i28 = iE4;
        int iMax3 = Math.max(iRound7 == 0 ? 0 : 1, Math.round(iRound7 * this.f40751r));
        int iE5 = db.e(context, db.as());
        int iE6 = db.e(context, db.ar());
        Typeface typeface6 = typeface4;
        LayerDrawable layerDrawable2 = (LayerDrawable) ContextCompat.getDrawable(context, R.drawable.facetec_ocr_input_background);
        int i29 = iE2;
        if (layerDrawable2 != null) {
            GradientDrawable gradientDrawable = (GradientDrawable) layerDrawable2.findDrawableByLayerId(R.id.gradientDrawable);
            gradientDrawable.setStroke(iMax2, iE5);
            gradientDrawable.setCornerRadius(iMax3);
            gradientDrawable.setColor(iE6);
            if (FaceTecSDK.f40106a.f40084g.showInputFieldBottomBorderOnly) {
                int i30 = -iMax2;
                layerDrawable2.setLayerInset(0, i30, i30, i30, 0);
                gradientDrawable.setCornerRadius(0.0f);
            }
        }
        ArrayList arrayList4 = new ArrayList();
        try {
            JSONArray jSONArrayOptJSONArray2 = jSONObject.optJSONArray("groups");
            if (jSONArrayOptJSONArray2 == null) {
                return;
            }
            int i31 = 0;
            while (i31 < jSONArrayOptJSONArray2.length()) {
                JSONObject jSONObjectOptJSONObject = jSONArrayOptJSONArray2.optJSONObject(i31);
                if (jSONObjectOptJSONObject == null || (jSONArrayOptJSONArray = jSONObjectOptJSONObject.optJSONArray("fields")) == null) {
                    return;
                }
                if (jSONArrayOptJSONArray.length() > 0) {
                    jSONArray = jSONArrayOptJSONArray2;
                    String strOptString = jSONObjectOptJSONObject.optString("groupKey");
                    int i32 = i31;
                    String strA = a(strOptString, null, str6, jSONObjectOptJSONObject.optString(str6));
                    ax axVar2 = new ax(context);
                    str3 = str6;
                    layerDrawable = layerDrawable2;
                    LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
                    int i33 = this.f40753t;
                    ArrayList arrayList5 = arrayList4;
                    try {
                        layoutParams.setMargins(i33, i33, i33, Math.round(i33 / 2.0f));
                        layoutParams.gravity = 17;
                        axVar2.setLayoutParams(layoutParams);
                        axVar2.setTextSize(iRound4);
                        axVar2.setText(strA);
                        axVar2.setTextColor(iE);
                        axVar2.setTypeface(typeface3);
                        this.B.addView(axVar2);
                        int i34 = 0;
                        int i35 = 0;
                        while (i34 < jSONArrayOptJSONArray.length()) {
                            JSONObject jSONObject2 = jSONArrayOptJSONArray.getJSONObject(i34);
                            String strOptString2 = jSONObject2.optString("fieldKey");
                            JSONArray jSONArray2 = jSONArrayOptJSONArray;
                            String strA2 = a(strOptString, strOptString2, str5, jSONObject2.optString(str5));
                            ax axVar3 = axVar2;
                            String strA3 = a(strOptString, strOptString2, str4, jSONObject2.optString(str4));
                            String str7 = strOptString;
                            if (strA3 == null) {
                                strA3 = "";
                            }
                            int i36 = iE;
                            String upperCase = jSONObject2.optString("scannedValue").toUpperCase(getResources().getConfiguration().locale);
                            if (jSONObject2.optBoolean("uiEditable")) {
                                LinearLayout linearLayout = new LinearLayout(context);
                                try {
                                    linearLayout.setOrientation(0);
                                    Typeface typeface7 = typeface3;
                                    LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -2);
                                    int i37 = this.f40753t;
                                    layoutParams2.setMargins(i37, i37 / 4, i37, i37 / 4);
                                    linearLayout.setLayoutParams(layoutParams2);
                                    ax axVar4 = new ax(context);
                                    LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(iRound3, -2);
                                    try {
                                        layoutParams3.setMargins(0, 0, 0, 0);
                                        layoutParams3.setMarginEnd(this.f40753t / 2);
                                        axVar4.setLayoutParams(layoutParams3);
                                        float f6 = iRound5;
                                        axVar4.setTextSize(f6);
                                        axVar4.setText(strA2);
                                        int i38 = i29;
                                        axVar4.setTextColor(i38);
                                        Typeface typeface8 = typeface6;
                                        axVar4.setTypeface(typeface8);
                                        axVar4.setMaxLines(1);
                                        axVar4.setSingleLine(true);
                                        axVar4.setEllipsize(TextUtils.TruncateAt.END);
                                        axVar4.setTextDirection(5);
                                        ArrayList arrayList6 = arrayList5;
                                        try {
                                            arrayList6.add(axVar4);
                                            linearLayout.addView(axVar4);
                                            final EditText editText = new EditText(context);
                                            int i39 = this.f40753t / 4;
                                            int i40 = i39 << 1;
                                            editText.setPadding(i39, i40, i39, i40);
                                            int i41 = i27;
                                            iRound5 = iRound5;
                                            try {
                                                LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(-1, i41);
                                                try {
                                                    layoutParams4.setMargins(0, 0, 0, 0);
                                                    editText.setLayoutParams(layoutParams4);
                                                    int i42 = iE3;
                                                    editText.setTextColor(i42);
                                                    editText.setTextSize(f6);
                                                    int i43 = i28;
                                                    editText.setHintTextColor(i43);
                                                    editText.setText(upperCase);
                                                    editText.setHint(strA3);
                                                    Typeface typeface9 = typeface5;
                                                    editText.setTypeface(typeface9);
                                                    LayerDrawable layerDrawable3 = layerDrawable;
                                                    editText.setBackground(layerDrawable3);
                                                    editText.setTextDirection(5);
                                                    InputFilter[] filters = editText.getFilters();
                                                    typeface5 = typeface9;
                                                    InputFilter[] inputFilterArr = new InputFilter[filters.length + 1];
                                                    i26 = i41;
                                                    layerDrawable = layerDrawable3;
                                                    try {
                                                        Object[] objArr = new Object[5];
                                                        objArr[4] = Integer.valueOf(filters.length);
                                                        objArr[3] = 0;
                                                        objArr[2] = inputFilterArr;
                                                        objArr[1] = 0;
                                                        try {
                                                            objArr[0] = filters;
                                                            arrayList = arrayList6;
                                                            try {
                                                                Object[] objArr2 = new Object[1];
                                                                J(TextUtils.getTrimmedLength("") + 16, Color.argb(0, 0, 0, 0), (char) (TextUtils.getCapsMode("", 0, 0) + 41323), objArr2);
                                                                try {
                                                                    Class<?> cls = Class.forName((String) objArr2[0]);
                                                                    Object[] objArr3 = new Object[1];
                                                                    J(ExpandableListView.getPackedPositionChild(0L) + 10, (Process.myPid() >> 22) + 16, (char) (AndroidCharacter.getMirror('0') - '0'), objArr3);
                                                                    try {
                                                                        String str8 = (String) objArr3[0];
                                                                        Class<?> cls2 = Integer.TYPE;
                                                                        cls.getMethod(str8, Object.class, cls2, Object.class, cls2, cls2).invoke(null, objArr);
                                                                        try {
                                                                            inputFilterArr[filters.length] = new InputFilter.AllCaps();
                                                                            editText.setFilters(inputFilterArr);
                                                                            editText.setInputType(4096);
                                                                            editText.setImeOptions(6);
                                                                            FaceTecOCRConfirmationCustomization faceTecOCRConfirmationCustomization = FaceTecSDK.f40106a.f40084g;
                                                                            final Typeface typeface10 = faceTecOCRConfirmationCustomization.inputFieldFont;
                                                                            final Typeface typeface11 = faceTecOCRConfirmationCustomization.inputFieldPlaceholderFont;
                                                                            final boolean z10 = typeface10 != typeface11;
                                                                            i22 = i42;
                                                                            i10 = 0;
                                                                            i24 = i32;
                                                                            i25 = i38;
                                                                            typeface6 = typeface8;
                                                                            typeface2 = typeface7;
                                                                            axVar = axVar3;
                                                                            i23 = i43;
                                                                            final int i44 = i34;
                                                                            try {
                                                                                editText.addTextChangedListener(new TextWatcher() { // from class: com.facetec.sdk.bz.5
                                                                                    @Override // android.text.TextWatcher
                                                                                    public final void onTextChanged(CharSequence charSequence, int i45, int i46, int i47) {
                                                                                        if (z10) {
                                                                                            if (charSequence.length() == 0) {
                                                                                                editText.setTypeface(typeface11);
                                                                                            } else {
                                                                                                Typeface typeface12 = editText.getTypeface();
                                                                                                Typeface typeface13 = typeface10;
                                                                                                if (typeface12 != typeface13) {
                                                                                                    editText.setTypeface(typeface13);
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                        try {
                                                                                            bz.this.f40735a.optJSONArray("groups").optJSONObject(i24).optJSONArray("fields").optJSONObject(i44).putOpt("userUpdatedValue", charSequence.toString());
                                                                                        } catch (JSONException e5) {
                                                                                            e5.printStackTrace();
                                                                                        }
                                                                                    }

                                                                                    @Override // android.text.TextWatcher
                                                                                    public final void afterTextChanged(Editable editable) {
                                                                                    }

                                                                                    @Override // android.text.TextWatcher
                                                                                    public final void beforeTextChanged(CharSequence charSequence, int i45, int i46, int i47) {
                                                                                    }
                                                                                });
                                                                                editText.setOnFocusChangeListener(new lc.c(this, editText, 1));
                                                                                editText.setOnEditorActionListener(new TextView.OnEditorActionListener() { // from class: com.facetec.sdk.g6
                                                                                    @Override // android.widget.TextView.OnEditorActionListener
                                                                                    public final boolean onEditorAction(TextView textView, int i45, KeyEvent keyEvent) {
                                                                                        return this.f41741p0.aS_(editText, textView, i45, keyEvent);
                                                                                    }
                                                                                });
                                                                                linearLayout.addView(editText);
                                                                                this.B.addView(linearLayout);
                                                                                i35++;
                                                                            } catch (JSONException e5) {
                                                                                e = e5;
                                                                            }
                                                                        } catch (JSONException e7) {
                                                                            e = e7;
                                                                            i10 = 0;
                                                                        }
                                                                    } catch (Throwable th2) {
                                                                        th = th2;
                                                                        cause = th.getCause();
                                                                        if (cause != null) {
                                                                            throw th;
                                                                        }
                                                                        throw cause;
                                                                    }
                                                                } catch (Throwable th3) {
                                                                    th = th3;
                                                                }
                                                            } catch (Throwable th4) {
                                                                th = th4;
                                                                cause = th.getCause();
                                                                if (cause != null) {
                                                                    throw th;
                                                                }
                                                                throw cause;
                                                            }
                                                        } catch (Throwable th5) {
                                                            th = th5;
                                                        }
                                                    } catch (Throwable th6) {
                                                        th = th6;
                                                    }
                                                } catch (JSONException e10) {
                                                    e = e10;
                                                    i10 = 0;
                                                    arrayList = arrayList6;
                                                }
                                            } catch (JSONException e11) {
                                                e = e11;
                                                arrayList = arrayList6;
                                                i10 = 0;
                                            }
                                        } catch (JSONException e12) {
                                            e = e12;
                                            iRound5 = iRound5;
                                        }
                                    } catch (JSONException e13) {
                                        e = e13;
                                        i10 = 0;
                                        arrayList = arrayList5;
                                    }
                                } catch (JSONException e14) {
                                    e = e14;
                                    i10 = 0;
                                }
                            } else {
                                i22 = iE3;
                                i23 = i28;
                                i24 = i32;
                                arrayList = arrayList5;
                                i25 = i29;
                                axVar = axVar3;
                                typeface2 = typeface3;
                                i26 = i27;
                                iRound5 = iRound5;
                            }
                            i34++;
                            axVar2 = axVar;
                            iE3 = i22;
                            iRound5 = iRound5;
                            i27 = i26;
                            i29 = i25;
                            jSONArrayOptJSONArray = jSONArray2;
                            i32 = i24;
                            iE = i36;
                            str5 = str5;
                            strOptString = str7;
                            i28 = i23;
                            typeface3 = typeface2;
                            iRound4 = iRound4;
                            iRound3 = iRound3;
                            str4 = str4;
                            arrayList5 = arrayList;
                        }
                        ax axVar5 = axVar2;
                        i14 = iE;
                        typeface = typeface3;
                        i15 = iRound4;
                        str = str4;
                        str2 = str5;
                        i16 = iRound3;
                        i17 = iE3;
                        i18 = i28;
                        i13 = i32;
                        arrayList3 = arrayList5;
                        i19 = i29;
                        i20 = i27;
                        i21 = iRound5;
                        if (i35 == 0) {
                            this.B.removeView(axVar5);
                        }
                    } catch (JSONException e15) {
                        e = e15;
                        iRound5 = iRound5;
                        arrayList = arrayList5;
                    }
                } else {
                    jSONArray = jSONArrayOptJSONArray2;
                    i13 = i31;
                    layerDrawable = layerDrawable2;
                    i14 = iE;
                    typeface = typeface3;
                    i15 = iRound4;
                    str = str4;
                    str2 = str5;
                    str3 = str6;
                    arrayList3 = arrayList4;
                    i16 = iRound3;
                    i17 = iE3;
                    i18 = i28;
                    i19 = i29;
                    i20 = i27;
                    i21 = iRound5;
                }
                i31 = i13 + 1;
                jSONArrayOptJSONArray2 = jSONArray;
                iE3 = i17;
                iRound5 = i21;
                i27 = i20;
                i29 = i19;
                str6 = str3;
                layerDrawable2 = layerDrawable;
                iE = i14;
                str5 = str2;
                i28 = i18;
                typeface3 = typeface;
                iRound4 = i15;
                iRound3 = i16;
                str4 = str;
                arrayList4 = arrayList3;
            }
            iRound5 = iRound5;
            arrayList = arrayList4;
            i10 = 0;
            iRound = Math.round(ay.c(iRound5));
            int iRound8 = Math.round(ay.e(120) * this.f40750q);
            i11 = i10;
            iMax = i11;
            while (i11 < arrayList.size()) {
                iMax = Math.max(iMax, ay.W_(((TextView) arrayList.get(i11)).getText().toString(), iRound, FaceTecSDK.f40106a.f40084g.fieldLabelFont).d());
                i11++;
            }
            arrayList2 = arrayList;
            iMin = Math.min(iRound8, iMax);
            for (i12 = i10; i12 < arrayList2.size(); i12++) {
                ((TextView) arrayList2.get(i12)).getLayoutParams().width = iMin;
            }
            viewTreeObserver = this.f40739e.getViewTreeObserver();
            if (viewTreeObserver.isAlive()) {
                viewTreeObserver.addOnGlobalLayoutListener(new AnonymousClass3(context));
            }
        } catch (JSONException e16) {
            e = e16;
            iRound5 = iRound5;
            arrayList = arrayList4;
        }
        i10 = 0;
        e.printStackTrace();
        iRound = Math.round(ay.c(iRound5));
        int iRound9 = Math.round(ay.e(120) * this.f40750q);
        i11 = i10;
        iMax = i11;
        while (i11 < arrayList.size()) {
            iMax = Math.max(iMax, ay.W_(((TextView) arrayList.get(i11)).getText().toString(), iRound, FaceTecSDK.f40106a.f40084g.fieldLabelFont).d());
            i11++;
        }
        arrayList2 = arrayList;
        iMin = Math.min(iRound9, iMax);
        while (i12 < arrayList2.size()) {
            ((TextView) arrayList2.get(i12)).getLayoutParams().width = iMin;
        }
        viewTreeObserver = this.f40739e.getViewTreeObserver();
        if (viewTreeObserver.isAlive()) {
            viewTreeObserver.addOnGlobalLayoutListener(new AnonymousClass3(context));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ boolean aS_(EditText editText, TextView textView, int i10, KeyEvent keyEvent) {
        if (editText == null) {
            return false;
        }
        editText.setCursorVisible(false);
        if (keyEvent != null && keyEvent.getKeyCode() == 66) {
            b(textView);
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void aT_(EditText editText, View view, boolean z10) {
        if (editText == null) {
            return;
        }
        if (z10) {
            this.H = editText;
            editText.setCursorVisible(true);
        } else {
            this.H = null;
            editText.setCursorVisible(false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void aU_(ValueAnimator valueAnimator) {
        int iIntValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
        this.f40745k = iIntValue;
        this.f40744j.setTextColor(iIntValue);
        this.f40744j.postInvalidate();
        if (this.F) {
            this.f40742h.setColorFilter(this.f40745k, PorterDuff.Mode.SRC_IN);
            this.f40742h.postInvalidate();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void aV_(ValueAnimator valueAnimator) {
        int iIntValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
        this.f40746l = iIntValue;
        ((GradientDrawable) this.f40748o).setColor(iIntValue);
        this.f40737c.setBackground(this.f40748o);
        this.f40737c.postInvalidate();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ boolean aW_(View view, MotionEvent motionEvent) {
        EditText editText;
        if (motionEvent.getAction() == 0 && (editText = this.H) != null && editText.isFocused()) {
            Rect rect = new Rect();
            this.H.getGlobalVisibleRect(rect);
            if (!rect.contains((int) motionEvent.getRawX(), (int) motionEvent.getRawY())) {
                this.H.clearFocus();
                b(view);
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public void e() {
        if (this.f40747n) {
            b(new s1(this, 5));
        }
    }

    @NonNull
    public static bz d(JSONObject jSONObject) {
        bz bzVar = new bz();
        Bundle bundle = new Bundle();
        bundle.putString("ocrDataJSONString", jSONObject.toString());
        bzVar.setArguments(bundle);
        return bzVar;
    }

    public static void init$0() {
        $$a = new byte[]{89, -71, -70, 122};
        $$b = 219;
    }

    @Override // com.facetec.sdk.aq, android.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
    }

    @Override // android.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewInflate = layoutInflater.inflate(R.layout.facetec_ocr_confirmation_fragment, viewGroup, false);
        this.f40757x = viewInflate;
        return viewInflate;
    }

    @Override // android.app.Fragment
    @SuppressLint({"ClickableViewAccessibility"})
    public final void onViewCreated(View view, Bundle bundle) {
        String string;
        super.onViewCreated(view, bundle);
        Activity activity = getActivity();
        try {
            if (getArguments() != null && (string = getArguments().getString("ocrDataJSONString")) != null) {
                this.f40735a = new JSONObject(string);
            }
        } catch (JSONException e5) {
            e5.printStackTrace();
        }
        this.f40758y = view.findViewById(R.id.backgroundView);
        this.f40736b = (a) view.findViewById(R.id.confirmButton);
        this.f40739e = (ScrollView) view.findViewById(R.id.mainContentScrollView);
        this.f40738d = (LinearLayout) view.findViewById(R.id.scrollableContentLayout);
        this.B = (LinearLayout) view.findViewById(R.id.dynamicContentLayout);
        this.A = (TextView) view.findViewById(R.id.mainHeaderTextView);
        this.D = view.findViewById(R.id.mainHeaderDividerLineView);
        this.f40737c = (RelativeLayout) view.findViewById(R.id.scrollDownIndicatorLayout);
        this.f40741g = (LinearLayout) view.findViewById(R.id.scrollDownIndicatorContentLayout);
        this.f40744j = (TextView) view.findViewById(R.id.scrollDownIndicatorTextView);
        this.f40742h = (ImageView) view.findViewById(R.id.scrollDownIndicatorImageView);
        this.C = (RelativeLayout) view.findViewById(R.id.outsetActionButtonLayout);
        FaceTecOCRConfirmationCustomization faceTecOCRConfirmationCustomization = FaceTecSDK.f40106a.f40084g;
        this.m = faceTecOCRConfirmationCustomization.enableFixedConfirmButton;
        this.I = faceTecOCRConfirmationCustomization.enableScrollIndicatorTextAnimation;
        this.f40749p = faceTecOCRConfirmationCustomization.enableScrollIndicator;
        int i10 = 1;
        this.F = faceTecOCRConfirmationCustomization.customScrollIndicatorAnimation == 0;
        this.f40745k = db.e(getActivity(), db.aw());
        this.f40746l = db.e(getActivity(), ((Integer) db.c(new Object[0], -408862161, 408862171, (int) System.currentTimeMillis())).intValue());
        int iRound = Math.round(this.f40750q * 20.0f);
        Typeface typeface = FaceTecSDK.f40106a.f40084g.mainHeaderFont;
        int iE = db.e(activity, db.ap());
        int iRound2 = Math.round(ay.e(db.n()));
        int iMax = Math.max(iRound2 == 0 ? 0 : 1, Math.round(iRound2 * this.f40751r));
        int iE2 = db.e(activity, db.aj());
        dd.bv_(this.A, R.string.FaceTec_idscan_ocr_confirmation_main_header);
        this.A.setTextColor(iE);
        this.A.setTypeface(typeface);
        this.A.setTextSize(iRound);
        ((LinearLayout.LayoutParams) this.A.getLayoutParams()).setMargins(0, 0, 0, this.f40753t);
        this.D.getLayoutParams().height = iMax;
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.D.getLayoutParams();
        int i11 = this.f40753t;
        layoutParams.setMargins(i11, 0, i11, 0);
        this.D.setBackgroundColor(iE2);
        int iRound3 = Math.round(ay.e(50) * this.f40750q);
        this.f40736b.getLayoutParams().height = iRound3;
        if (this.m) {
            this.f40738d.removeView(this.f40736b);
            this.C.addView(this.f40736b);
            this.C.setVisibility(0);
            RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) this.f40736b.getLayoutParams();
            int i12 = this.f40753t;
            layoutParams2.setMargins(i12, 0, i12, i12);
        } else {
            LinearLayout.LayoutParams layoutParams3 = (LinearLayout.LayoutParams) this.f40736b.getLayoutParams();
            int i13 = this.f40753t;
            layoutParams3.setMargins(i13, i13 << 1, i13, 0);
        }
        dd.bv_(this.f40736b, R.string.FaceTec_action_confirm);
        this.f40736b.setEnabled(true);
        this.f40736b.e();
        this.f40736b.c(new aq.b(new g3(this, 3)));
        if (this.m) {
            RelativeLayout.LayoutParams layoutParams4 = (RelativeLayout.LayoutParams) this.f40739e.getLayoutParams();
            int i14 = this.f40753t;
            layoutParams4.setMargins(0, i14, 0, (i14 << 1) + iRound3);
        } else {
            RelativeLayout.LayoutParams layoutParams5 = (RelativeLayout.LayoutParams) this.f40739e.getLayoutParams();
            int i15 = this.f40753t;
            layoutParams5.setMargins(0, i15, 0, i15);
        }
        db.a(this.f40758y);
        this.f40758y.getBackground().setAlpha(db.aS());
        Drawable drawable = ContextCompat.getDrawable(activity, R.drawable.facetec_scrollbar_vertical_track);
        Drawable drawable2 = ContextCompat.getDrawable(activity, R.drawable.facetec_scrollbar_vertical_thumb);
        int iA = db.a(iE, 128);
        int iRound4 = Math.round(ay.e(10) * this.f40750q);
        int iRound5 = Math.round(ay.e(5) * this.f40750q);
        if (drawable != null) {
            GradientDrawable gradientDrawable = (GradientDrawable) drawable;
            gradientDrawable.setColor(0);
            gradientDrawable.setCornerRadius(iRound5);
        }
        if (drawable2 != null) {
            GradientDrawable gradientDrawable2 = (GradientDrawable) drawable2;
            gradientDrawable2.setColor(iA);
            gradientDrawable2.setCornerRadius(iRound5);
        }
        this.f40738d.setScrollBarSize(iRound4);
        if (Build.VERSION.SDK_INT >= 29) {
            this.f40738d.setVerticalScrollbarTrackDrawable(drawable);
            this.f40738d.setVerticalScrollbarThumbDrawable(drawable2);
        }
        this.f40738d.setOnTouchListener(new View.OnTouchListener() { // from class: com.facetec.sdk.i6
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view2, MotionEvent motionEvent) {
                return this.f41878p0.aW_(view2, motionEvent);
            }
        });
        b(new h2.o(this, getActivity(), i10, this.f40735a));
        b(new u4(this, 4));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void c() {
        this.f40744j.animate().alpha(0.0f).setStartDelay(2000L).setDuration(300L).setListener(null).withEndAction(new b1(this, 7)).start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void f() {
        this.f40740f = ay.a(getActivity(), R.drawable.facetec_animated_double_down_chevron);
        this.f40742h.setColorFilter(db.aw(), PorterDuff.Mode.SRC_IN);
        this.f40742h.setImageDrawable(this.f40740f);
        AnonymousClass4 anonymousClass4 = new AnonymousClass4();
        this.f40759z = anonymousClass4;
        this.f40740f.registerAnimationCallback(anonymousClass4);
        this.f40742h.setVisibility(0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void g() {
        if (this.f40747n) {
            return;
        }
        this.f40747n = true;
        AnimatedVectorDrawableCompat animatedVectorDrawableCompat = this.f40743i;
        if (animatedVectorDrawableCompat != null) {
            animatedVectorDrawableCompat.start();
        } else {
            AnimatedVectorDrawableCompat animatedVectorDrawableCompat2 = this.f40740f;
            if (animatedVectorDrawableCompat2 != null) {
                animatedVectorDrawableCompat2.start();
            }
        }
        if (this.I) {
            e();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void h() {
        this.C.animate().alpha(1.0f).setDuration(500L).setStartDelay(1000L).setListener(null).start();
        this.f40736b.animate().alpha(1.0f).setDuration(500L).setStartDelay(1000L).setListener(null).start();
        this.f40739e.animate().alpha(1.0f).setDuration(500L).setStartDelay(1000L).setListener(null).withEndAction(new l2(this, 5)).start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void i() {
        if (this.f40737c.getVisibility() == 0) {
            this.f40737c.animate().alpha(1.0f).setDuration(500L).setListener(null).withEndAction(new k3(this, 7)).start();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void j() {
        this.f40742h.setImageDrawable(this.f40743i);
        AnonymousClass1 anonymousClass1 = new AnonymousClass1();
        this.f40759z = anonymousClass1;
        this.f40743i.registerAnimationCallback(anonymousClass1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void l() {
        this.f40736b.d(false, true);
        final aq.b bVar = new aq.b(new f5(this, 2));
        b(new Runnable() { // from class: com.facetec.sdk.f6
            @Override // java.lang.Runnable
            public final void run() {
                this.f41539p0.d(bVar);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void m() {
        be beVar = (be) getActivity();
        if (beVar != null) {
            beVar.e(this.f40735a);
        }
    }

    private void b(View view) {
        ((InputMethodManager) getActivity().getApplicationContext().getSystemService(Constants.INPUT_METHOD)).hideSoftInputFromWindow(view.getWindowToken(), 0);
    }

    public static /* synthetic */ void e(bz bzVar, Context context) {
        int iAK = db.aK();
        int iAI = db.aI();
        if (iAK != 0) {
            bzVar.f40743i = ay.a(bzVar.getActivity(), iAK);
        }
        if (bzVar.f40743i != null) {
            bzVar.b(new z0(bzVar, 3));
            bzVar.f40742h.setVisibility(0);
        } else {
            if (iAI != 0) {
                bzVar.f40742h.setImageResource(iAI);
                bzVar.f40742h.clearAnimation();
                bzVar.f40742h.setVisibility(0);
                return;
            }
            bzVar.b(new l1(bzVar, 4));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void d(aq.b bVar) {
        this.C.animate().alpha(0.0f).setDuration(500L).setStartDelay(0L).setListener(null).start();
        this.f40736b.animate().alpha(0.0f).setDuration(500L).setStartDelay(0L).setListener(null).start();
        this.f40739e.animate().alpha(0.0f).setDuration(500L).setStartDelay(0L).setListener(null).withEndAction(bVar).start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void d() {
        Animatable2Compat.AnimationCallback animationCallback;
        Animatable2Compat.AnimationCallback animationCallback2;
        AnimatedVectorDrawableCompat animatedVectorDrawableCompat = this.f40743i;
        if (animatedVectorDrawableCompat != null && (animationCallback2 = this.f40759z) != null) {
            animatedVectorDrawableCompat.unregisterAnimationCallback(animationCallback2);
            this.f40743i.stop();
            this.f40743i = null;
            this.f40759z = null;
        }
        AnimatedVectorDrawableCompat animatedVectorDrawableCompat2 = this.f40740f;
        if (animatedVectorDrawableCompat2 != null && (animationCallback = this.f40759z) != null) {
            animatedVectorDrawableCompat2.unregisterAnimationCallback(animationCallback);
            this.f40740f.stop();
            this.f40740f = null;
            this.f40759z = null;
        }
        this.f40737c.setVisibility(8);
    }

    public static /* synthetic */ void e(final bz bzVar, boolean z10) {
        Activity activity;
        int iAw;
        int i10 = bzVar.f40746l;
        int iE = db.e(bzVar.getActivity(), z10 ? db.av() : ((Integer) db.c(new Object[0], -408862161, 408862171, (int) System.currentTimeMillis())).intValue());
        int i11 = bzVar.f40745k;
        if (z10) {
            activity = bzVar.getActivity();
            iAw = db.ay();
        } else {
            activity = bzVar.getActivity();
            iAw = db.aw();
        }
        int iE2 = db.e(activity, iAw);
        int i12 = 1;
        if (i10 != iE) {
            ValueAnimator valueAnimatorOfObject = ValueAnimator.ofObject(new ArgbEvaluator(), Integer.valueOf(i10), Integer.valueOf(iE));
            valueAnimatorOfObject.setDuration(200L);
            valueAnimatorOfObject.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.facetec.sdk.h6
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    this.f41861a.aV_(valueAnimator);
                }
            });
            valueAnimatorOfObject.start();
        }
        if (i11 != iE2) {
            ValueAnimator valueAnimatorOfObject2 = ValueAnimator.ofObject(new ArgbEvaluator(), Integer.valueOf(i11), Integer.valueOf(iE2));
            valueAnimatorOfObject2.setDuration(200L);
            valueAnimatorOfObject2.addUpdateListener(new s5(bzVar, i12));
            valueAnimatorOfObject2.start();
        }
    }

    public static /* synthetic */ void d(bz bzVar) {
        bzVar.f40747n = false;
        bzVar.f40737c.animate().alpha(0.0f).setDuration(300L).setListener(null).withEndAction(new i2(bzVar, 4)).start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a() {
        this.f40744j.animate().alpha(1.0f).setStartDelay(0L).setDuration(300L).setListener(null).withEndAction(new y1(this, 4)).start();
    }

    private void a(String str) {
        if (this.E) {
            return;
        }
        aw.b(str);
    }

    private static String a(JSONObject jSONObject, String str) {
        try {
            return jSONObject.getString(str);
        } catch (JSONException unused) {
            return null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:82:0x01d1  */
    /* JADX WARN: Code duplicated, block: B:99:? A[RETURN, SYNTHETIC] */
    private String a(String str, String str2, String str3, String str4) {
        String str5;
        JSONObject jSONObject = bg.f40543g;
        String strA = null;
        if (jSONObject != null) {
            try {
                JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("groups");
                if (jSONArrayOptJSONArray == null) {
                    a("OCR Localization and Text Customization Error: OCR Localization and Text Customization JSON is missing \"groups\" key. Falling back to use internal default values for all OCR strings. Please make sure your OCR Localization and Text Customization JSON is valid and up-to-date with the specifications from the latest version of the FaceTec SDK.");
                } else if (jSONArrayOptJSONArray.length() == 0) {
                    a("OCR Localization and Text Customization Error: OCR Localization and Text Customization JSON has an empty array for the value of the \"groups\" key. Falling back to use internal default values for all OCR strings. Please make sure your OCR Localization and Text Customization JSON is valid and up-to-date with the specifications from the latest version of the FaceTec SDK.");
                } else {
                    int i10 = 0;
                    while (i10 < jSONArrayOptJSONArray.length()) {
                        JSONObject jSONObject2 = jSONArrayOptJSONArray.getJSONObject(i10);
                        String strA2 = a(jSONObject2, "groupKey");
                        if (strA2 != null && !strA2.isEmpty()) {
                            if (!strA2.equals(str)) {
                                jSONArrayOptJSONArray = jSONArrayOptJSONArray;
                                break;
                            }
                            if (str2 == null) {
                                strA = a(jSONObject2, str3);
                                if (strA == null) {
                                    try {
                                        StringBuilder sb2 = new StringBuilder("OCR Localization and Text Customization Error: OCR Localization and Text Customization JSON is missing a valid \"");
                                        sb2.append(str3);
                                        sb2.append("\" key-value pair in the group object with a \"groupKey\" value of \"");
                                        sb2.append(str);
                                        sb2.append("\". Falling back to use \"groupKey\" value of \"");
                                        sb2.append(str);
                                        sb2.append("\" for this OCR string. Please make sure your OCR Localization and Text Customization JSON is valid and up-to-date with the specifications from the latest version of the FaceTec SDK.");
                                        aw.b(sb2.toString());
                                        strA = str;
                                    } catch (JSONException e5) {
                                        e = e5;
                                        strA = str;
                                        e.printStackTrace();
                                        a("OCR Localization and Text Customization Error: OCR Localization and Text Customization JSON is in an invalid format. Falling back to use internal default values for all OCR strings. Please make sure your OCR Localization and Text Customization JSON is valid and up-to-date with the specifications from the latest version of the FaceTec SDK.");
                                        if (strA == null) {
                                            return str4;
                                        }
                                        return strA;
                                    }
                                }
                                if (this.E) {
                                    break;
                                }
                            }
                            JSONArray jSONArrayOptJSONArray2 = jSONObject2.optJSONArray("fields");
                            if (jSONArrayOptJSONArray2 == null) {
                                StringBuilder sb3 = new StringBuilder("OCR Localization and Text Customization Error: OCR Localization and Text Customization JSON is missing a valid \"fields\" key-value pair in the group object with a \"groupKey\" value of \"");
                                sb3.append(str);
                                sb3.append("\". Falling back to use internal default values for all OCR strings in this group's fields. Please make sure your OCR Localization and Text Customization JSON is valid and up-to-date with the specifications from the latest version of the FaceTec SDK.");
                                a(sb3.toString());
                            } else if (jSONArrayOptJSONArray2.length() == 0) {
                                StringBuilder sb4 = new StringBuilder("OCR Localization and Text Customization Error: OCR Localization and Text Customization JSON has an empty array for the value of the \"fields\" key in the group object with a \"groupKey\" value of \"");
                                sb4.append(str);
                                sb4.append("\". Falling back to use internal default values for all OCR strings in this group's fields. Please make sure your OCR Localization and Text Customization JSON is valid and up-to-date with the specifications from the latest version of the FaceTec SDK.");
                                a(sb4.toString());
                            } else {
                                int i11 = 0;
                                while (true) {
                                    if (i11 < jSONArrayOptJSONArray2.length()) {
                                        JSONObject jSONObject3 = jSONArrayOptJSONArray2.getJSONObject(i11);
                                        String strA3 = a(jSONObject3, "fieldKey");
                                        if (strA3 != null && !strA3.isEmpty()) {
                                            if (strA3.equals(str2)) {
                                                strA = a(jSONObject3, str3);
                                                if (strA == null && str3.equals("uiFieldDescriptionText")) {
                                                    str5 = "fieldFriendlyName";
                                                    strA = a(jSONObject3, "fieldFriendlyName");
                                                    StringBuilder sb5 = new StringBuilder("OCR Localization and Text Customization Error: OCR Localization and Text Customization JSON is missing a valid \"");
                                                    sb5.append(str3);
                                                    sb5.append("\" key-value pair in the field object with a \"fieldKey\" value of \"");
                                                    sb5.append(str2);
                                                    sb5.append("\". Falling back to use \"");
                                                    sb5.append("fieldFriendlyName");
                                                    sb5.append("\" value of \"");
                                                    sb5.append(strA);
                                                    sb5.append("\" for this OCR string. Please make sure your OCR Localization and Text Customization JSON is valid and up-to-date with the specifications from the latest version of the FaceTec SDK.");
                                                    aw.b(sb5.toString());
                                                } else {
                                                    str5 = str3;
                                                }
                                                if (strA == null) {
                                                    try {
                                                        StringBuilder sb6 = new StringBuilder("OCR Localization and Text Customization Error: OCR Localization and Text Customization JSON is missing a valid \"");
                                                        sb6.append(str5);
                                                        sb6.append("\" key-value pair in the field object with a \"fieldKey\" value of \"");
                                                        sb6.append(str2);
                                                        sb6.append("\". Falling back to use \"fieldKey\" value of \"");
                                                        sb6.append(str2);
                                                        sb6.append("\" for this OCR string. Please make sure your OCR Localization and Text Customization JSON is valid and up-to-date with the specifications from the latest version of the FaceTec SDK.");
                                                        aw.b(sb6.toString());
                                                        strA = str2;
                                                    } catch (JSONException e7) {
                                                        e = e7;
                                                        strA = str2;
                                                        e.printStackTrace();
                                                        a("OCR Localization and Text Customization Error: OCR Localization and Text Customization JSON is in an invalid format. Falling back to use internal default values for all OCR strings. Please make sure your OCR Localization and Text Customization JSON is valid and up-to-date with the specifications from the latest version of the FaceTec SDK.");
                                                        if (strA == null) {
                                                            return str4;
                                                        }
                                                        return strA;
                                                    }
                                                }
                                                if (this.E) {
                                                    break;
                                                }
                                            } else {
                                                jSONArrayOptJSONArray = jSONArrayOptJSONArray;
                                            }
                                        } else {
                                            jSONArrayOptJSONArray = jSONArrayOptJSONArray;
                                            a("OCR Localization and Text Customization Error: OCR Localization and Text Customization JSON is missing a valid \"fieldKey\" key-value pair from an object in the \"fields\" array. Falling back to use internal default value for this OCR string. Please make sure your OCR Localization and Text Customization JSON is valid and up-to-date with the specifications from the latest version of the FaceTec SDK.");
                                        }
                                        i11++;
                                        jSONArrayOptJSONArray = jSONArrayOptJSONArray;
                                    }
                                }
                            }
                            jSONArrayOptJSONArray = jSONArrayOptJSONArray;
                            break;
                            break;
                        }
                        jSONArrayOptJSONArray = jSONArrayOptJSONArray;
                        a("OCR Localization and Text Customization Error: OCR Localization and Text Customization JSON is missing a valid \"groupKey\" key-value pair from an object in the \"groups\" array. Falling back to use internal default value for this OCR string. Please make sure your OCR Localization and Text Customization JSON is valid and up-to-date with the specifications from the latest version of the FaceTec SDK.");
                        i10++;
                        jSONArrayOptJSONArray = jSONArrayOptJSONArray;
                    }
                }
                if (strA == null) {
                    if (str2 == null) {
                        StringBuilder sb7 = new StringBuilder("OCR Localization and Text Customization Error: OCR Localization and Text Customization JSON is missing a valid \"");
                        sb7.append(str3);
                        sb7.append("\" key-value pair in the group object with a \"groupKey\" value of \"");
                        sb7.append(str);
                        sb7.append("\". Falling back to use internal default value of \"");
                        sb7.append(str4);
                        sb7.append("\" for this OCR string. Please make sure your OCR Localization and Text Customization JSON is valid and up-to-date with the specifications from the latest version of the FaceTec SDK.");
                        aw.b(sb7.toString());
                    } else {
                        StringBuilder sb8 = new StringBuilder("OCR Localization and Text Customization Error: OCR Localization and Text Customization JSON is missing a valid \"");
                        sb8.append(str3);
                        sb8.append("\" key-value pair in the field object with a \"fieldKey\" value of \"");
                        sb8.append(str2);
                        sb8.append("\" within the \"fields\" array of the group object with a \"groupKey\" value of \"");
                        sb8.append(str);
                        sb8.append("\". Falling back to use internal default value of \"");
                        sb8.append(str4);
                        sb8.append("\" for this OCR string. Please make sure your OCR Localization and Text Customization JSON is valid and up-to-date with the specifications from the latest version of the FaceTec SDK.");
                        aw.b(sb8.toString());
                    }
                }
                if (!this.E) {
                    this.E = true;
                }
            } catch (JSONException e10) {
                e = e10;
            }
        }
        if (strA == null) {
            return str4;
        }
        return strA;
    }
}

package com.facetec.sdk;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.drawable.GradientDrawable;
import android.media.AudioTrack;
import android.os.Build;
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
import android.view.ViewOutlineProvider;
import android.view.ViewTreeObserver;
import android.widget.ExpandableListView;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;
import androidx.annotation.Nullable;
import androidx.core.content.ContextCompat;
import androidx.core.widget.TextViewCompat;
import androidx.exifinterface.media.ExifInterface;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Map;
import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes9.dex */
public final class az extends aq {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static final byte[] $$d = null;
    private static final int $$e = 0;
    private static int $10;
    private static int $11;
    private static long C;
    private static int E;
    private static int G;
    private static char H;
    private static int I;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static boolean f40415d;
    private Handler B;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private LinearLayout f40416a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    ck f40417b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ImageView f40418c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private TextView f40419e;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private View f40421g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private cm f40422h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private a f40423i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private cs f40424j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private FrameLayout f40425k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private TextView f40426l;
    private Handler m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private Handler f40427n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private Handler f40428o;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private Semaphore f40436w;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f40420f = false;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private boolean f40429p = false;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private boolean f40431r = false;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private boolean f40432s = false;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private boolean f40433t = false;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private boolean f40430q = false;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private cj f40435v = null;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private boolean f40434u = false;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private final int f40438y = (int) ay.e(12);

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private boolean f40437x = false;
    private boolean D = false;
    private final Runnable A = new h3(this, 4);

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private final cc.b f40439z = new cc.b() { // from class: com.facetec.sdk.u1
        @Override // com.facetec.sdk.cc.b
        public final void onPreSessionProgress(cp cpVar, ci ciVar, ck ckVar, cl clVar) {
            this.f42895a.c(cpVar, ciVar, ckVar, clVar);
        }
    };

    /* JADX INFO: renamed from: com.facetec.sdk.az$4, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass4 {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        static final /* synthetic */ int[] f40440c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        static final /* synthetic */ int[] f40441d;

        static {
            int[] iArr = new int[FaceTecCancelButtonCustomization.ButtonLocation.values().length];
            f40440c = iArr;
            try {
                iArr[FaceTecCancelButtonCustomization.ButtonLocation.TOP_LEFT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f40440c[FaceTecCancelButtonCustomization.ButtonLocation.TOP_RIGHT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f40440c[FaceTecCancelButtonCustomization.ButtonLocation.CUSTOM.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f40440c[FaceTecCancelButtonCustomization.ButtonLocation.DISABLED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            int[] iArr2 = new int[FaceTecSecurityWatermarkImage.values().length];
            f40441d = iArr2;
            try {
                iArr2[FaceTecSecurityWatermarkImage.FACETEC_ZOOM.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f40441d[FaceTecSecurityWatermarkImage.FACETEC.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    public class a implements cc.e {
        public a() {
        }

        @Override // com.facetec.sdk.cc.e
        public final void b() {
            az.a(new Object[]{az.this}, 2012320647, -2012320644, (int) System.currentTimeMillis());
            az.this.d();
        }

        @Override // com.facetec.sdk.cc.e
        public final void c() {
            az.a(new Object[]{az.this}, 2012320647, -2012320644, (int) System.currentTimeMillis());
            az.this.c();
        }

        @Override // com.facetec.sdk.cc.e
        public final void d(cj cjVar, cg cgVar) throws Throwable {
            az.this.c(cjVar, cgVar);
        }

        @Override // com.facetec.sdk.cc.e
        public final void e() {
            az.a(new Object[]{az.this}, 2012320647, -2012320644, (int) System.currentTimeMillis());
            az.this.e();
        }

        @Override // com.facetec.sdk.cc.e
        public final void d() {
            az.a(new Object[]{az.this}, 2012320647, -2012320644, (int) System.currentTimeMillis());
            az.this.b();
        }
    }

    static {
        init$1();
        $10 = 0;
        $11 = 1;
        init$0();
        E = 0;
        I = 1;
        i();
        f40415d = false;
        int i10 = I + 65;
        E = i10 % 128;
        if (i10 % 2 != 0) {
            throw null;
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
    private static void F(int r7, int r8, short r9, java.lang.Object[] r10) {
        /*
            byte[] r0 = com.facetec.sdk.az.$$a
            int r7 = r7 + 98
            int r8 = r8 + 4
            int r9 = r9 * 2
            int r9 = 1 - r9
            byte[] r1 = new byte[r9]
            r2 = 0
            if (r0 != 0) goto L16
            r7 = r8
            r3 = r1
            r4 = r2
            r1 = r0
            r0 = r10
            r10 = r9
            goto L32
        L16:
            r3 = r2
        L17:
            int r4 = r3 + 1
            byte r5 = (byte) r7
            r1[r3] = r5
            int r8 = r8 + 1
            if (r4 != r9) goto L28
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            r10[r2] = r7
            return
        L28:
            r3 = r0[r8]
            r6 = r9
            r9 = r7
            r7 = r8
            r8 = r3
            r3 = r1
            r1 = r0
            r0 = r10
            r10 = r6
        L32:
            int r8 = -r8
            int r8 = r8 + r9
            r9 = r10
            r10 = r0
            r0 = r1
            r1 = r3
            r3 = r4
            r6 = r8
            r8 = r7
            r7 = r6
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facetec.sdk.az.F(int, int, short, java.lang.Object[]):void");
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0015  */
    /* JADX WARN: Code duplicated, block: B:9:0x0021  */
    private static void J(String str, int i10, char c10, String str2, String str3, Object[] objArr) throws Throwable {
        Object charArray;
        char[] charArray2;
        char[] charArray3;
        char c11;
        int i11 = $10 + 1;
        int i12 = i11 % 128;
        $11 = i12;
        int i13 = 0;
        if (i11 % 2 == 0) {
            int i14 = 97 / 0;
            if (str3 != null) {
                int i15 = i12 + 107;
                $10 = i15 % 128;
                int i16 = i15 % 2;
                charArray = str3.toCharArray();
            } else {
                charArray = str3;
            }
        } else if (str3 != null) {
            int i17 = i12 + 107;
            $10 = i17 % 128;
            int i18 = i17 % 2;
            charArray = str3.toCharArray();
        } else {
            charArray = str3;
        }
        char[] cArr = (char[]) charArray;
        if (str2 != null) {
            int i19 = $10 + 105;
            $11 = i19 % 128;
            int i20 = i19 % 2;
            charArray2 = str2.toCharArray();
        } else {
            charArray2 = str2;
        }
        char[] cArr2 = charArray2;
        if (str != null) {
            int i21 = $10 + 109;
            $11 = i21 % 128;
            if (i21 % 2 == 0) {
                str.toCharArray();
                throw null;
            }
            charArray3 = str.toCharArray();
        } else {
            charArray3 = str;
        }
        char[] cArr3 = charArray3;
        go goVar = new go();
        int length = cArr3.length;
        char[] cArr4 = new char[length];
        int length2 = cArr.length;
        char[] cArr5 = new char[length2];
        System.arraycopy(cArr3, 0, cArr4, 0, length);
        System.arraycopy(cArr, 0, cArr5, 0, length2);
        cArr4[0] = (char) (cArr4[0] ^ c10);
        cArr5[2] = (char) (cArr5[2] + ((char) i10));
        int length3 = cArr2.length;
        char[] cArr6 = new char[length3];
        goVar.f41794c = 0;
        int i22 = $11 + 91;
        $10 = i22 % 128;
        int i23 = i22 % 2;
        while (goVar.f41794c < length3) {
            try {
                Object[] objArr2 = new Object[1];
                objArr2[i13] = goVar;
                Map map = bp.f40694x;
                Object method = map.get(26369957);
                if (method == null) {
                    Class cls = (Class) bp.a(View.MeasureSpec.getSize(i13) + 23, KeyEvent.getDeadChar(i13, i13) + 719, (char) (1 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1))));
                    byte b10 = (byte) (-1);
                    Object[] objArr3 = new Object[1];
                    K((byte) 52, b10, (byte) (b10 + 1), objArr3);
                    String str4 = (String) objArr3[i13];
                    Class<?>[] clsArr = new Class[1];
                    clsArr[i13] = Object.class;
                    method = cls.getMethod(str4, clsArr);
                    map.put(26369957, method);
                }
                int iIntValue = ((Integer) ((Method) method).invoke(null, objArr2)).intValue();
                Object[] objArr4 = new Object[1];
                objArr4[i13] = goVar;
                Object method2 = map.get(-1014658957);
                if (method2 == null) {
                    Class cls2 = (Class) bp.a(24 - KeyEvent.keyCodeFromString(""), 197 - (ViewConfiguration.getDoubleTapTimeout() >> 16), (char) KeyEvent.normalizeMetaState(i13));
                    Class<?>[] clsArr2 = new Class[1];
                    clsArr2[i13] = Object.class;
                    method2 = cls2.getMethod(ExifInterface.GPS_MEASUREMENT_IN_PROGRESS, clsArr2);
                    map.put(-1014658957, method2);
                }
                int iIntValue2 = ((Integer) ((Method) method2).invoke(null, objArr4)).intValue();
                int i24 = cArr4[goVar.f41794c % 4] * 32718;
                Object[] objArr5 = new Object[3];
                objArr5[2] = Integer.valueOf(cArr5[iIntValue]);
                objArr5[1] = Integer.valueOf(i24);
                objArr5[i13] = goVar;
                Object method3 = map.get(918635547);
                if (method3 == null) {
                    Class cls3 = (Class) bp.a(24 - (ViewConfiguration.getFadingEdgeLength() >> 16), 1316 - (ViewConfiguration.getJumpTapTimeout() >> 16), (char) (41877 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1))));
                    byte b11 = (byte) (-1);
                    Object[] objArr6 = new Object[1];
                    K((byte) 55, b11, (byte) (b11 + 1), objArr6);
                    String str5 = (String) objArr6[0];
                    Class<?> cls4 = Integer.TYPE;
                    method3 = cls3.getMethod(str5, Object.class, cls4, cls4);
                    map.put(918635547, method3);
                }
                ((Method) method3).invoke(null, objArr5);
                Object[] objArr7 = {Integer.valueOf(cArr4[iIntValue2] * 32718), Integer.valueOf(cArr5[iIntValue])};
                Object method4 = map.get(-1899743495);
                if (method4 != null) {
                    c11 = 2;
                } else {
                    Class cls5 = (Class) bp.a(24 - View.resolveSizeAndState(0, 0, 0), (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 837, (char) Color.alpha(0));
                    byte b12 = (byte) 0;
                    byte b13 = (byte) (b12 - 1);
                    Object[] objArr8 = new Object[1];
                    K(b12, b13, (byte) (b13 + 1), objArr8);
                    String str6 = (String) objArr8[0];
                    c11 = 2;
                    Class<?> cls6 = Integer.TYPE;
                    method4 = cls5.getMethod(str6, cls6, cls6);
                    map.put(-1899743495, method4);
                }
                cArr5[iIntValue2] = ((Character) ((Method) method4).invoke(null, objArr7)).charValue();
                char c12 = goVar.f41793b;
                cArr4[iIntValue2] = c12;
                int i25 = goVar.f41794c;
                cArr6[i25] = (char) ((((long) ((int) (((long) G) ^ 5402764725387775499L))) ^ (((long) (c12 ^ cArr2[i25])) ^ (C ^ 5402764725387775499L))) ^ ((long) ((char) (((long) H) ^ 5402764725387775499L))));
                goVar.f41794c = i25 + 1;
                i13 = 0;
            } catch (Throwable th2) {
                Throwable cause = th2.getCause();
                if (cause == null) {
                    throw th2;
                }
                throw cause;
            }
        }
        objArr[0] = new String(cArr6);
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
    private static void K(byte r6, byte r7, byte r8, java.lang.Object[] r9) {
        /*
            int r6 = r6 + 67
            byte[] r0 = com.facetec.sdk.az.$$d
            int r8 = r8 * 3
            int r1 = r8 + 1
            int r7 = r7 + 4
            byte[] r1 = new byte[r1]
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
            int r7 = r7 + 1
            byte r4 = (byte) r6
            r1[r3] = r4
            int r4 = r3 + 1
            if (r3 != r8) goto L28
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L28:
            r3 = r0[r7]
            r5 = r7
            r7 = r6
            r6 = r3
            r3 = r1
            r1 = r0
            r0 = r9
            r9 = r8
            r8 = r5
        L32:
            int r6 = -r6
            int r6 = r6 + r7
            r7 = r8
            r8 = r9
            r9 = r0
            r0 = r1
            r1 = r3
            r3 = r4
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facetec.sdk.az.K(byte, byte, byte, java.lang.Object[]):void");
    }

    public static /* synthetic */ Object a(Object[] objArr, int i10, int i11, int i12) {
        cs csVar;
        int i13 = ~i11;
        int i14 = ~(i13 | i10);
        int i15 = ~i12;
        int i16 = ~(i15 | i10);
        switch (((i13 | i16) * 712) + (((~(i10 | i11 | i12)) | (~(i13 | i15 | i10))) * (-712)) + ((i14 | i16) * (-712)) + (i11 * 713) + (i10 * (-711))) {
            case 1:
                return d(objArr);
            case 2:
                return b(objArr);
            case 3:
                az azVar = (az) objArr[0];
                int i17 = I + 47;
                E = i17 % 128;
                int i18 = 2;
                if (i17 % 2 != 0) {
                    dn.b();
                    csVar = azVar.f40424j;
                    i18 = 3;
                } else {
                    dn.b();
                    csVar = azVar.f40424j;
                }
                csVar.setImportantForAccessibility(i18);
                azVar.f40424j.setOnTouchListener(null);
                return null;
            case 4:
                return a(objArr);
            case 5:
                return e(objArr);
            case 6:
                return j(objArr);
            case 7:
                return h(objArr);
            default:
                return c(objArr);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean aa_(Context context, View view, MotionEvent motionEvent) {
        int i10 = I + 115;
        E = i10 % 128;
        int i11 = i10 % 2;
        if (motionEvent.getAction() == 1) {
            dn.a(context, dn.b.BLIND_USER_ASSIST_FACESCAN_FEEDBACK);
        }
        int i12 = I + 117;
        E = i12 % 128;
        int i13 = i12 % 2;
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:23:0x009e  */
    public /* synthetic */ boolean ab_(View view, MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            this.f40418c.setAlpha(0.4f);
        } else if (motionEvent.getAction() == 3 || motionEvent.getX() < 0.0f || motionEvent.getX() > this.f40418c.getLeft() + this.f40418c.getWidth() + 10 || motionEvent.getY() < 0.0f) {
            this.f40418c.setAlpha(1.0f);
        } else {
            int i10 = I + 69;
            E = i10 % 128;
            int i11 = i10 % 2;
            if (motionEvent.getY() > this.f40418c.getTop() + this.f40418c.getHeight() + 10) {
                this.f40418c.setAlpha(1.0f);
            } else if (motionEvent.getAction() == 1) {
                this.f40418c.setAlpha(1.0f);
                this.f40418c.setEnabled(false);
                if (((bh) a(new Object[]{this}, -504724426, 504724432, System.identityHashCode(this))) == null) {
                    int i12 = E + 23;
                    I = i12 % 128;
                    int i13 = i12 % 2;
                    return false;
                }
                this.f40418c.performClick();
            }
        }
        int i14 = I + 107;
        E = i14 % 128;
        if (i14 % 2 == 0) {
            return true;
        }
        throw null;
    }

    private static /* synthetic */ Object d(Object[] objArr) {
        cc ccVarF;
        bh bhVar;
        az azVar = (az) objArr[0];
        Context context = (Context) objArr[1];
        be beVar = (be) objArr[2];
        int i10 = E + 9;
        I = i10 % 128;
        if (i10 % 2 == 0) {
            ccVarF = azVar.f();
            int i11 = 8 / 0;
            if (ccVarF == null) {
                return null;
            }
        } else {
            ccVarF = azVar.f();
            if (ccVarF == null) {
                return null;
            }
        }
        if (ccVarF.c(context, beVar.f40512h) || (bhVar = (bh) a(new Object[]{azVar}, -504724426, 504724432, System.identityHashCode(azVar))) == null) {
            return null;
        }
        int i12 = I + 93;
        E = i12 % 128;
        int i13 = i12 % 2;
        bhVar.b(ak.f40300r);
        return null;
    }

    public static void init$0() {
        $$a = new byte[]{15, -22, 123, 71};
        $$b = 234;
    }

    public static void init$1() {
        $$d = new byte[]{50, 85, 12, -110};
        $$e = 219;
    }

    public final void b() {
        be beVar = (be) getActivity();
        if (beVar != null) {
            beVar.w();
        }
        int i10 = 0;
        bh bhVar = (bh) a(new Object[]{this}, -504724426, 504724432, System.identityHashCode(this));
        if (!(!isAdded())) {
            int i11 = E + 31;
            I = i11 % 128;
            if (i11 % 2 == 0) {
                throw null;
            }
            if (bhVar == null) {
                return;
            }
            j();
            bs.a(bhVar);
            if (this.f40431r) {
                int i12 = I + 49;
                E = i12 % 128;
                if (i12 % 2 != 0) {
                    ap.d(bhVar, ao.FT_EVENT_FACESCAN_SESSION_FAIL);
                    int i13 = 51 / 0;
                } else {
                    ap.d(bhVar, ao.FT_EVENT_FACESCAN_SESSION_FAIL);
                }
            }
            c((Runnable) new aq.b(new k1(this, bhVar, i10)), false);
        }
    }

    @Override // com.facetec.sdk.aq, android.app.Fragment
    public final void onCreate(Bundle bundle) {
        a(new Object[]{this, bundle}, -116362281, 116362286, System.identityHashCode(this));
    }

    @Override // android.app.Fragment
    public final Animator onCreateAnimator(int i10, boolean z10, int i11) {
        int i12 = E;
        int i13 = i12 + 75;
        I = i13 % 128;
        int i14 = i13 % 2;
        if (z10) {
            return super.onCreateAnimator(i10, z10, i11);
        }
        int i15 = i12 + 19;
        I = i15 % 128;
        if (i15 % 2 != 0) {
            return ObjectAnimator.ofFloat((Object) null, "alpha", 1.0f, 0.0f).setDuration(400L);
        }
        ObjectAnimator.ofFloat((Object) null, "alpha", 1.0f, 0.0f).setDuration(400L);
        throw null;
    }

    @Override // android.app.Fragment
    @SuppressLint({"ClickableViewAccessibility"})
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i10 = I + 115;
        E = i10 % 128;
        int i11 = i10 % 2;
        View viewInflate = layoutInflater.inflate(R.layout.facetec_facescan_fragment, viewGroup, false);
        int i12 = I + 125;
        E = i12 % 128;
        if (i12 % 2 != 0) {
            int i13 = 91 / 0;
        }
        return viewInflate;
    }

    @Override // android.app.Fragment
    public final void onPause() {
        Handler handler;
        int i10 = I + 79;
        E = i10 % 128;
        if (i10 % 2 != 0) {
            super.onPause();
            throw null;
        }
        super.onPause();
        Handler handler2 = this.f40427n;
        if (handler2 != null) {
            handler2.removeCallbacksAndMessages(null);
        }
        Handler handler3 = this.m;
        if (handler3 != null) {
            int i11 = E + 21;
            I = i11 % 128;
            int i12 = i11 % 2;
            handler3.removeCallbacksAndMessages(null);
        }
        Handler handler4 = this.f40428o;
        if (handler4 != null) {
            handler4.removeCallbacksAndMessages(null);
            int i13 = E + 27;
            I = i13 % 128;
            int i14 = i13 % 2;
        }
        cm cmVar = this.f40422h;
        if (cmVar != null && (handler = cmVar.f40907f) != null) {
            handler.removeCallbacksAndMessages(null);
            cmVar.f40907f = null;
        }
        Handler handler5 = this.B;
        if (handler5 != null) {
            handler5.removeCallbacksAndMessages(null);
            this.B = null;
        }
        int i15 = E + 17;
        I = i15 % 128;
        int i16 = i15 % 2;
    }

    @Override // android.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) throws Throwable {
        String str;
        super.onViewCreated(view, bundle);
        final bh bhVar = (bh) a(new Object[]{this}, -504724426, 504724432, System.identityHashCode(this));
        cc ccVarF = f();
        if (ccVarF == null) {
            return;
        }
        t.f42834e = ak.f40295l;
        a aVar = new a();
        this.f40423i = aVar;
        ccVarF.c(aVar);
        cp cpVarN = ccVarF.n();
        ck ckVarL = ccVarF.l();
        cp cpVar = cp.READY_TO_START_FACESCAN_SESSION;
        if (cpVarN != cpVar) {
            ccVarF.e(this.f40439z);
        }
        this.f40416a = (LinearLayout) view.findViewById(R.id.zoomLogoContainer);
        this.f40419e = (TextView) view.findViewById(R.id.zoomLogoText);
        String packageName = bhVar.getPackageName();
        ImageView imageView = (ImageView) view.findViewById(R.id.securityWatermark);
        int i10 = AnonymousClass4.f40441d[FaceTecSDK.f40106a.securityWatermarkImage.ordinal()];
        int i11 = 2;
        if (i10 == 1) {
            imageView.setImageDrawable(ContextCompat.getDrawable(getActivity(), R.drawable.facetec_internal_zoom_watermark));
            int i12 = E + 113;
            I = i12 % 128;
            int i13 = i12 % 2;
        } else if (i10 == 2) {
            imageView.setImageDrawable(ContextCompat.getDrawable(getActivity(), R.drawable.facetec_internal_facetec_watermark));
        }
        float fC = db.c();
        imageView.setLayoutParams(new LinearLayout.LayoutParams(-2, (int) (Resources.getSystem().getDisplayMetrics().heightPixels * db.d() * 0.15f * fC)));
        this.f40419e.setVisibility(0);
        this.f40419e.setTextSize(db.d() * 8.0f * fC);
        if (!packageName.contains("com.facetec.zoomlogin")) {
            TextView textView = this.f40419e;
            if (Build.CPU_ABI.equals("arm64-v8a")) {
                int i14 = E + 85;
                I = i14 % 128;
                if (i14 % 2 == 0) {
                    throw null;
                }
                str = " 64-bit";
            } else {
                str = "";
            }
            textView.setText("v9.6.101".concat(str));
        } else {
            this.f40419e.setText("v9.6.101");
        }
        this.f40416a.setPadding(0, 0, 0, 12);
        this.f40424j = (cs) view.findViewById(R.id.zoomOval);
        this.f40421g = view.findViewById(R.id.instructionsBackground);
        this.f40418c = (ImageView) view.findViewById(R.id.zoomBackButton);
        this.f40426l = (TextView) view.findViewById(R.id.authReasonText);
        cm cmVar = (cm) view.findViewById(R.id.zoomProgressBar);
        this.f40422h = cmVar;
        cmVar.setVisibility(4);
        TextView textView2 = (TextView) cmVar.findViewById(R.id.zoomFeedbackText);
        cmVar.f40904c = textView2;
        textView2.setImportantForAccessibility(2);
        TextViewCompat.setAutoSizeTextTypeWithDefaults(cmVar.f40904c, 1);
        TextViewCompat.setAutoSizeTextTypeUniformWithConfiguration(cmVar.f40904c, 5, 50, 1, 2);
        cg cgVar = cg.HOLD_STEADY;
        int iD = cm.d(cgVar);
        if (cpVarN == cpVar) {
            cmVar.f40902a = cgVar;
        } else {
            switch (cm.AnonymousClass4.f40915e[ckVarL.ordinal()]) {
                case 1:
                    cmVar.f40905d = ck.FRAME_YOUR_FACE;
                    break;
                case 2:
                    cmVar.f40905d = ck.FRAME_YOUR_FACE;
                    break;
                case 3:
                    cmVar.f40905d = ck.WEARING_SUNGLASSES;
                    break;
                case 4:
                    cmVar.f40905d = ck.BAD_POSE;
                    break;
                case 5:
                    cmVar.f40905d = ck.TOO_BRIGHT;
                    break;
                case 6:
                    cmVar.f40905d = ck.TOO_DARK;
                    break;
                case 7:
                    cmVar.f40905d = ck.MAKING_FACE;
                    break;
                case 8:
                    cmVar.f40905d = ck.HOLD_STEADY_3;
                    break;
                case 9:
                    cmVar.f40905d = ck.HOLD_STEADY_2;
                    break;
                case 10:
                    cmVar.f40905d = ck.HOLD_STEADY_1;
                    break;
                case 11:
                    cmVar.f40905d = ck.MOVE_CLOSER;
                    int i15 = E + 77;
                    I = i15 % 128;
                    int i16 = i15 % 2;
                    break;
                case 12:
                    cmVar.f40905d = ck.MOVE_AWAY;
                    break;
            }
            iD = cm.b(cmVar.f40905d);
        }
        dn.c(iD);
        dd.bv_(cmVar.f40904c, iD);
        cmVar.f40904c.setTypeface(FaceTecSDK.f40106a.f40088k.textFont);
        db.bJ_(cmVar.f40904c);
        GradientDrawable gradientDrawable = (GradientDrawable) db.c(new Object[]{cmVar.getContext()}, 1215991464, -1215991421, (int) System.currentTimeMillis());
        View viewFindViewById = cmVar.findViewById(R.id.zoomFeedbackContainer);
        cmVar.f40906e = viewFindViewById;
        viewFindViewById.setBackground(gradientDrawable);
        int i17 = E + 53;
        I = i17 % 128;
        int i18 = i17 % 2;
        cmVar.setPadding(10, 10, 10, 15);
        cmVar.f40906e.setElevation(ay.e(FaceTecSDK.f40106a.f40088k.elevation));
        cmVar.f40906e.setOutlineProvider(ViewOutlineProvider.BACKGROUND);
        cmVar.f40906e.setClipToOutline(false);
        cmVar.f40906e.requestLayout();
        TextView textView3 = cmVar.f40904c;
        Property property = View.ALPHA;
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(textView3, (Property<TextView, Float>) property, 0.0f);
        cmVar.f40911j = objectAnimatorOfFloat;
        objectAnimatorOfFloat.setDuration(400L);
        cmVar.f40911j.addListener(cmVar.f40909h);
        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(cmVar.f40904c, (Property<TextView, Float>) property, 1.0f);
        cmVar.f40910i = objectAnimatorOfFloat2;
        objectAnimatorOfFloat2.setDuration(400L);
        float fE = ay.e(db.f().height) * db.d();
        float fE2 = ay.e(db.f().width) * db.d();
        cmVar.f40904c.getLayoutParams().height = (int) fE;
        cmVar.f40904c.getLayoutParams().width = (int) fE2;
        int iRound = Math.round(ay.e(10) * db.d() * db.c());
        cmVar.f40904c.setPadding(iRound, Math.round(iRound * 1.1f), iRound, iRound);
        cmVar.f40904c.requestLayout();
        cm cmVar2 = this.f40422h;
        if (cmVar2.getLayoutParams() instanceof ViewGroup.MarginLayoutParams) {
            RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) cmVar2.getLayoutParams();
            ((Integer) db.c(new Object[0], -920817160, 920817172, (int) System.currentTimeMillis())).intValue();
            layoutParams.addRule(13, -1);
            layoutParams.setMargins(0, 0, 0, 0);
            cmVar2.requestLayout();
        }
        this.f40426l.setTypeface(bl.f40644a);
        db.c(new Object[]{this.f40426l}, 166285300, -166285292, (int) System.currentTimeMillis());
        FrameLayout frameLayout = (FrameLayout) view.findViewById(R.id.transitionView);
        this.f40425k = frameLayout;
        db.d(frameLayout);
        this.f40427n = new Handler(Looper.getMainLooper());
        this.m = new Handler();
        if (cpVarN == cpVar) {
            a(new Object[]{this, bhVar}, -272011198, 272011198, System.identityHashCode(this));
        }
        if (dn.d()) {
            ((FaceTecSessionActivity) bhVar).setTitle(" ");
            this.f40424j.setImportantForAccessibility(1);
            this.f40424j.setContentDescription(bhVar.getString(R.string.FaceTec_accessibility_tap_guidance));
            this.f40424j.setOnTouchListener(new View.OnTouchListener() { // from class: com.facetec.sdk.n1
                @Override // android.view.View.OnTouchListener
                public final boolean onTouch(View view2, MotionEvent motionEvent) {
                    return az.aa_(bhVar, view2, motionEvent);
                }
            });
        }
        this.f40418c.setEnabled(true);
        if (FaceTecSDK.f40106a.f40090n.f40073e != FaceTecCancelButtonCustomization.ButtonLocation.DISABLED) {
            int i19 = I + 63;
            E = i19 % 128;
            int i20 = i19 % 2;
            int iAH = db.aH();
            if (iAH == 0) {
                iAH = R.drawable.facetec_cancel;
                e eVar = e.CANCEL_BUTTON_RESOURCE_ID_ERROR;
                StringBuilder sb2 = new StringBuilder("Activity State Info: ");
                sb2.append(t.c((Activity) bhVar));
                t.c(bhVar, eVar, sb2.toString());
            }
            this.f40418c.setImageDrawable(ContextCompat.getDrawable(bhVar, iAH));
        }
        int i21 = AnonymousClass4.f40440c[FaceTecSDK.f40106a.f40090n.f40073e.ordinal()];
        int i22 = 3;
        if (i21 == 2) {
            RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) this.f40418c.getLayoutParams();
            layoutParams2.removeRule(20);
            layoutParams2.addRule(21);
            this.f40418c.setLayoutParams(layoutParams2);
        } else if (i21 == 3 || i21 == 4) {
            this.f40418c.setVisibility(8);
        }
        this.f40418c.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() { // from class: com.facetec.sdk.o1
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public final void onGlobalLayout() {
                this.f42740p0.w();
            }
        });
        this.f40418c.setOnClickListener(new View.OnClickListener() { // from class: com.facetec.sdk.p1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.f42763p0.d(bhVar, view2);
            }
        });
        this.f40418c.setOnTouchListener(new View.OnTouchListener() { // from class: com.facetec.sdk.q1
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view2, MotionEvent motionEvent) {
                return this.f42775p0.ab_(view2, motionEvent);
            }
        });
        bh bhVar2 = (bh) a(new Object[]{this}, -504724426, 504724432, System.identityHashCode(this));
        if (bhVar2 != null) {
            int i23 = I + 55;
            E = i23 % 128;
            int i24 = i23 % 2;
            bhVar2.runOnUiThread(new i2(this, i11));
        }
        this.f40429p = false;
        this.f40424j.setVisibility(0);
        this.f40424j.setAlpha(1.0f);
        this.f40425k.setAlpha(0.0f);
        this.f40418c.setAlpha(0.0f);
        new Handler().postDelayed(new aq.b(new l2(this, i22)), 0L);
    }

    private static /* synthetic */ Object c(Object[] objArr) throws Throwable {
        final az azVar = (az) objArr[0];
        final Context context = (Context) objArr[1];
        t.f42834e = ak.m;
        azVar.f40420f = false;
        final be beVar = (be) azVar.getActivity();
        if (beVar != null) {
            int i10 = I + 19;
            E = i10 % 128;
            int i11 = i10 % 2;
            beVar.f40525v = be.c.FACESCAN_SESSION_STARTED;
        }
        azVar.f40427n.postDelayed(new aq.b(new Runnable() { // from class: com.facetec.sdk.t1
            @Override // java.lang.Runnable
            public final void run() {
                this.f42861p0.e(context, beVar);
            }
        }), 20L);
        t.e(new Object[]{cu.FACE_SCAN_UNZOOMED}, -590439926, 590439930, (int) System.currentTimeMillis());
        int i12 = E + 17;
        I = i12 % 128;
        if (i12 % 2 != 0) {
            return null;
        }
        throw null;
    }

    private static /* synthetic */ Object e(Object[] objArr) {
        az azVar = (az) objArr[0];
        super.onCreate((Bundle) objArr[1]);
        azVar.f40431r = false;
        azVar.f40432s = false;
        azVar.f40433t = false;
        azVar.f40436w = new Semaphore(1);
        int i10 = I + 115;
        E = i10 % 128;
        if (i10 % 2 == 0) {
            return null;
        }
        throw null;
    }

    @Nullable
    private cc f() {
        int i10 = E + 53;
        I = i10 % 128;
        if (i10 % 2 == 0) {
            throw null;
        }
        bh bhVar = (bh) a(new Object[]{this}, -504724426, 504724432, System.identityHashCode(this));
        if (bhVar == null) {
            return null;
        }
        cc ccVar = bhVar.f40571d;
        int i11 = I + 27;
        E = i11 % 128;
        if (i11 % 2 == 0) {
            return ccVar;
        }
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void g(bh bhVar) {
        a(new Object[]{bhVar}, -1232741188, 1232741192, (int) System.currentTimeMillis());
    }

    private static /* synthetic */ Object h(Object[] objArr) {
        az azVar = (az) objArr[0];
        bh bhVar = (bh) objArr[1];
        int i10 = E + 81;
        int i11 = i10 % 128;
        I = i11;
        if (i10 % 2 == 0) {
            boolean z10 = azVar.f40431r;
            throw null;
        }
        if (azVar.f40431r) {
            int i12 = i11 + 31;
            E = i12 % 128;
            int i13 = i12 % 2;
            ap.d(bhVar, ao.FT_EVENT_FACESCAN_SESSION_FAIL);
            int i14 = I + 11;
            E = i14 % 128;
            int i15 = i14 % 2;
        }
        bhVar.o();
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void i(bh bhVar) {
        this.f40427n.post(new aq.b(new l1(bhVar, 0)));
        int i10 = E + 107;
        I = i10 % 128;
        if (i10 % 2 == 0) {
            throw null;
        }
    }

    private static /* synthetic */ Object j(Object[] objArr) {
        az azVar = (az) objArr[0];
        int i10 = E + 75;
        I = i10 % 128;
        int i11 = i10 % 2;
        bh bhVar = (bh) azVar.getActivity();
        if (i11 == 0) {
            throw null;
        }
        int i12 = I + 41;
        E = i12 % 128;
        int i13 = i12 % 2;
        return bhVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:24:0x019f  */
    /* JADX WARN: Code duplicated, block: B:27:0x0222  */
    /* JADX WARN: Code duplicated, block: B:28:0x0223 A[Catch: all -> 0x019c, TryCatch #3 {all -> 0x019c, blocks: (B:12:0x00e9, B:16:0x0143, B:20:0x0192, B:38:0x034f, B:42:0x03a8, B:46:0x03fd, B:45:0x03c9, B:41:0x036a, B:49:0x040b, B:53:0x0462, B:57:0x04b0, B:56:0x0483, B:52:0x0426, B:60:0x050c, B:64:0x0568, B:68:0x05b5, B:67:0x0589, B:63:0x0527, B:19:0x0164, B:15:0x0107, B:25:0x01fc, B:29:0x0265, B:28:0x0223), top: B:91:0x0053 }] */
    public /* synthetic */ void k() throws Throwable {
        Map map;
        Object method;
        Object[] objArr;
        int i10 = E + 21;
        I = i10 % 128;
        try {
            if (i10 % 2 == 0) {
                Class cls = (Class) bp.a(24 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 388, (char) KeyEvent.normalizeMetaState(0));
                byte b10 = (byte) 3;
                byte b11 = (byte) (b10 - 4);
                Object[] objArr2 = new Object[1];
                F(b10, b11, (byte) (b11 + 1), objArr2);
                cls.getField((String) objArr2[0]).getLong(null);
                throw null;
            }
            Class cls2 = (Class) bp.a(23 - Color.blue(0), 387 - ImageFormat.getBitsPerPixel(0), (char) (ImageFormat.getBitsPerPixel(0) + 1));
            byte b12 = (byte) 3;
            byte b13 = (byte) (b12 - 4);
            Object[] objArr3 = new Object[1];
            F(b12, b13, (byte) (b13 + 1), objArr3);
            long j10 = cls2.getField((String) objArr3[0]).getLong(null);
            try {
                if (j10 != -1) {
                    long j11 = j10 + 2028;
                    Object[] objArr4 = new Object[1];
                    J("\udc5e퓢⪢㔖", TextUtils.getTrimmedLength(""), (char) View.MeasureSpec.getSize(0), "ស蒛宛儝禯ຶ놤̿铆ꘅ\ud8a2ᔮ\uee1c瀩欦煢ᰋ㦺\u0ee0鸦ॴ۹", "\u0000\u0000\u0000\u0000", objArr4);
                    Class<?> cls3 = Class.forName((String) objArr4[0]);
                    Object[] objArr5 = new Object[1];
                    J("れ襔⪛놪", TextUtils.getCapsMode("", 0, 0) - 1685498832, (char) (43562 - (ViewConfiguration.getFadingEdgeLength() >> 16)), "ᣊ뻣\ue403왲⠍\u200e鷖ȴ\ufb18耉㮕ㇺ瓪⬯貭", "\u0000\u0000\u0000\u0000", objArr5);
                    if (j11 >= ((Long) cls3.getDeclaredMethod((String) objArr5[0], new Class[0]).invoke(null, new Object[0])).longValue()) {
                        Class cls4 = (Class) bp.a((ViewConfiguration.getScrollDefaultDelay() >> 16) + 23, TextUtils.indexOf((CharSequence) "", '0', 0) + 389, (char) (ViewConfiguration.getLongPressTimeout() >> 16));
                        byte b14 = (byte) 0;
                        byte b15 = (byte) (b14 - 1);
                        Object[] objArr6 = new Object[1];
                        F(b14, b15, (byte) (b15 + 1), objArr6);
                        Object obj = cls4.getField((String) objArr6[0]).get(null);
                        Object[] objArr7 = {130225708, 0};
                        Map map2 = bp.f40694x;
                        Object method2 = map2.get(1463901671);
                        if (method2 == null) {
                            Class cls5 = (Class) bp.a(23 - View.combineMeasuredStates(0, 0), 388 - View.resolveSize(0, 0), (char) (ViewConfiguration.getJumpTapTimeout() >> 16));
                            byte b16 = (byte) 3;
                            byte b17 = (byte) (b16 - 4);
                            Object[] objArr8 = new Object[1];
                            F(b16, b17, (byte) (b17 + 1), objArr8);
                            String str = (String) objArr8[0];
                            Class<?> cls6 = Integer.TYPE;
                            method2 = cls5.getMethod(str, cls6, cls6);
                            map2.put(1463901671, method2);
                        }
                        Object[] objArr9 = {obj, Integer.valueOf(((Integer) ((Method) method2).invoke(null, objArr7)).intValue())};
                        Object method3 = map2.get(-2142901683);
                        if (method3 == null) {
                            method3 = ((Class) bp.a(23 - MotionEvent.axisFromString(""), (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 1836, (char) Color.blue(0))).getMethod("a", Object[].class, Integer.TYPE);
                            map2.put(-2142901683, method3);
                        }
                        objArr = (Object[]) ((Method) method3).invoke(null, objArr9);
                    } else {
                        Object[] objArr10 = new Object[1];
                        J("죵稾꽂䐁", KeyEvent.normalizeMetaState(0), (char) (431 - Color.alpha(0)), "擎૩\uf501舏묁\ue441흥홑缹ꝡᒱ孔讳⚃켢낯", "\u0000\u0000\u0000\u0000", objArr10);
                        Class<?> cls7 = Class.forName((String) objArr10[0]);
                        Object[] objArr11 = new Object[1];
                        J("扭⪫퇗\uda5f", (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), (char) ((AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 24529), "搥\ud8de群豺賝㹪⅃ᑥ\ue86d්\uf29fṻ涚㔳䑉꘤", "\u0000\u0000\u0000\u0000", objArr11);
                        Object[] objArr12 = {Integer.valueOf(((Integer) cls7.getMethod((String) objArr11[0], Object.class).invoke(null, this)).intValue()), 0, 130225708};
                        map = bp.f40694x;
                        method = map.get(388357536);
                        if (method != null) {
                            Class cls8 = (Class) bp.a((ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 23, 388 - ExpandableListView.getPackedPositionType(0L), (char) ExpandableListView.getPackedPositionGroup(0L));
                            byte b18 = (byte) 1;
                            byte b19 = (byte) (-b18);
                            Object[] objArr13 = new Object[1];
                            F(b18, b19, (byte) (b19 + 1), objArr13);
                            String str2 = (String) objArr13[0];
                            Class<?> cls9 = Integer.TYPE;
                            method = cls8.getMethod(str2, cls9, cls9, cls9);
                            map.put(388357536, method);
                        }
                        objArr = (Object[]) ((Method) method).invoke(null, objArr12);
                        Class cls10 = (Class) bp.a((ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 23, 388 - (ViewConfiguration.getEdgeSlop() >> 16), (char) (ViewConfiguration.getMinimumFlingVelocity() >> 16));
                        byte b20 = (byte) 0;
                        byte b21 = (byte) (b20 - 1);
                        Object[] objArr14 = new Object[1];
                        F(b20, b21, (byte) (b21 + 1), objArr14);
                        cls10.getField((String) objArr14[0]).set(null, objArr);
                        try {
                            Object[] objArr15 = new Object[1];
                            J("\udc5e퓢⪢㔖", (-1) - Process.getGidForName(""), (char) KeyEvent.normalizeMetaState(0), "ស蒛宛儝禯ຶ놤̿铆ꘅ\ud8a2ᔮ\uee1c瀩欦煢ᰋ㦺\u0ee0鸦ॴ۹", "\u0000\u0000\u0000\u0000", objArr15);
                            Class<?> cls11 = Class.forName((String) objArr15[0]);
                            Object[] objArr16 = new Object[1];
                            J("れ襔⪛놪", ExpandableListView.getPackedPositionType(0L) - 1685498832, (char) (43562 - KeyEvent.normalizeMetaState(0)), "ᣊ뻣\ue403왲⠍\u200e鷖ȴ\ufb18耉㮕ㇺ瓪⬯貭", "\u0000\u0000\u0000\u0000", objArr16);
                            Long lValueOf = Long.valueOf(((Long) cls11.getDeclaredMethod((String) objArr16[0], new Class[0]).invoke(null, new Object[0])).longValue());
                            Class cls12 = (Class) bp.a(23 - View.combineMeasuredStates(0, 0), (ViewConfiguration.getWindowTouchSlop() >> 8) + 388, (char) (Process.getGidForName("") + 1));
                            byte b22 = (byte) 3;
                            byte b23 = (byte) (b22 - 4);
                            Object[] objArr17 = new Object[1];
                            F(b22, b23, (byte) (b23 + 1), objArr17);
                            cls12.getField((String) objArr17[0]).set(null, lValueOf);
                        } catch (Exception unused) {
                            throw new RuntimeException();
                        }
                    }
                } else {
                    Object[] objArr18 = new Object[1];
                    J("죵稾꽂䐁", KeyEvent.normalizeMetaState(0), (char) (431 - Color.alpha(0)), "擎૩\uf501舏묁\ue441흥홑缹ꝡᒱ孔讳⚃켢낯", "\u0000\u0000\u0000\u0000", objArr18);
                    Class<?> cls13 = Class.forName((String) objArr18[0]);
                    Object[] objArr19 = new Object[1];
                    J("扭⪫퇗\uda5f", (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), (char) ((AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 24529), "搥\ud8de群豺賝㹪⅃ᑥ\ue86d්\uf29fṻ涚㔳䑉꘤", "\u0000\u0000\u0000\u0000", objArr19);
                    Object[] objArr110 = {Integer.valueOf(((Integer) cls13.getMethod((String) objArr19[0], Object.class).invoke(null, this)).intValue()), 0, 130225708};
                    map = bp.f40694x;
                    method = map.get(388357536);
                    if (method != null) {
                        Class cls14 = (Class) bp.a((ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 23, 388 - ExpandableListView.getPackedPositionType(0L), (char) ExpandableListView.getPackedPositionGroup(0L));
                        byte b110 = (byte) 1;
                        byte b111 = (byte) (-b110);
                        Object[] objArr111 = new Object[1];
                        F(b110, b111, (byte) (b111 + 1), objArr111);
                        String str3 = (String) objArr111[0];
                        Class<?> cls15 = Integer.TYPE;
                        method = cls14.getMethod(str3, cls15, cls15, cls15);
                        map.put(388357536, method);
                    }
                    objArr = (Object[]) ((Method) method).invoke(null, objArr110);
                    Class cls16 = (Class) bp.a((ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 23, 388 - (ViewConfiguration.getEdgeSlop() >> 16), (char) (ViewConfiguration.getMinimumFlingVelocity() >> 16));
                    byte b24 = (byte) 0;
                    byte b25 = (byte) (b24 - 1);
                    Object[] objArr112 = new Object[1];
                    F(b24, b25, (byte) (b25 + 1), objArr112);
                    cls16.getField((String) objArr112[0]).set(null, objArr);
                    Object[] objArr113 = new Object[1];
                    J("\udc5e퓢⪢㔖", (-1) - Process.getGidForName(""), (char) KeyEvent.normalizeMetaState(0), "ស蒛宛儝禯ຶ놤̿铆ꘅ\ud8a2ᔮ\uee1c瀩欦煢ᰋ㦺\u0ee0鸦ॴ۹", "\u0000\u0000\u0000\u0000", objArr113);
                    Class<?> cls17 = Class.forName((String) objArr113[0]);
                    Object[] objArr114 = new Object[1];
                    J("れ襔⪛놪", ExpandableListView.getPackedPositionType(0L) - 1685498832, (char) (43562 - KeyEvent.normalizeMetaState(0)), "ᣊ뻣\ue403왲⠍\u200e鷖ȴ\ufb18耉㮕ㇺ瓪⬯貭", "\u0000\u0000\u0000\u0000", objArr114);
                    Long lValueOf2 = Long.valueOf(((Long) cls17.getDeclaredMethod((String) objArr114[0], new Class[0]).invoke(null, new Object[0])).longValue());
                    Class cls18 = (Class) bp.a(23 - View.combineMeasuredStates(0, 0), (ViewConfiguration.getWindowTouchSlop() >> 8) + 388, (char) (Process.getGidForName("") + 1));
                    byte b26 = (byte) 3;
                    byte b27 = (byte) (b26 - 4);
                    Object[] objArr115 = new Object[1];
                    F(b26, b27, (byte) (b27 + 1), objArr115);
                    cls18.getField((String) objArr115[0]).set(null, lValueOf2);
                }
                int i11 = ((int[]) objArr[1])[0];
                int i12 = ((int[]) objArr[0])[0];
                if (i12 != i11) {
                    ArrayList arrayList = new ArrayList();
                    arrayList.add((String) objArr[2]);
                    arrayList.add((String) objArr[3]);
                    arrayList.add((String) objArr[4]);
                    arrayList.add((String) objArr[5]);
                    arrayList.add((String) objArr[6]);
                    arrayList.add((String) objArr[7]);
                    arrayList.add((String) objArr[8]);
                    int[] iArr = new int[i12];
                    int i13 = i12 - 1;
                    iArr[i13] = 1;
                    Toast.makeText((Context) null, iArr[((i12 * i13) % 2) - 1], 1).show();
                    Object[] objArr20 = {Integer.valueOf(((int[]) objArr[9])[0]), 0};
                    Map map3 = bp.f40694x;
                    Object method4 = map3.get(1463901671);
                    if (method4 == null) {
                        Class cls19 = (Class) bp.a((ViewConfiguration.getWindowTouchSlop() >> 8) + 23, 388 - (ViewConfiguration.getWindowTouchSlop() >> 8), (char) (KeyEvent.getMaxKeyCode() >> 16));
                        byte b28 = (byte) 3;
                        byte b29 = (byte) (b28 - 4);
                        Object[] objArr21 = new Object[1];
                        F(b28, b29, (byte) (b29 + 1), objArr21);
                        String str4 = (String) objArr21[0];
                        Class<?> cls20 = Integer.TYPE;
                        method4 = cls19.getMethod(str4, cls20, cls20);
                        map3.put(1463901671, method4);
                    }
                    Object[] objArr22 = {objArr, Integer.valueOf(((Integer) ((Method) method4).invoke(null, objArr20)).intValue())};
                    Object method5 = map3.get(-2142901683);
                    if (method5 == null) {
                        method5 = ((Class) bp.a(TextUtils.getTrimmedLength("") + 24, 1836 - (KeyEvent.getMaxKeyCode() >> 16), (char) TextUtils.indexOf("", "", 0, 0))).getMethod("a", Object[].class, Integer.TYPE);
                        map3.put(-2142901683, method5);
                    }
                    ((Method) method5).invoke(null, objArr22);
                    int i14 = I + 5;
                    E = i14 % 128;
                    if (i14 % 2 != 0) {
                        throw null;
                    }
                    return;
                }
                int i15 = I + 3;
                E = i15 % 128;
                if (i15 % 2 != 0) {
                    Object[] objArr23 = {Integer.valueOf(((int[]) objArr[46])[0]), 0};
                    Map map4 = bp.f40694x;
                    Object method6 = map4.get(1463901671);
                    if (method6 == null) {
                        Class cls21 = (Class) bp.a(TextUtils.indexOf("", "", 0, 0) + 23, (ViewConfiguration.getKeyRepeatDelay() >> 16) + 388, (char) (ViewConfiguration.getDoubleTapTimeout() >> 16));
                        byte b30 = (byte) 3;
                        byte b31 = (byte) (b30 - 4);
                        Object[] objArr24 = new Object[1];
                        F(b30, b31, (byte) (b31 + 1), objArr24);
                        String str5 = (String) objArr24[0];
                        Class<?> cls22 = Integer.TYPE;
                        method6 = cls21.getMethod(str5, cls22, cls22);
                        map4.put(1463901671, method6);
                    }
                    Object[] objArr25 = {objArr, Integer.valueOf(((Integer) ((Method) method6).invoke(null, objArr23)).intValue())};
                    Object method7 = map4.get(-2142901683);
                    if (method7 == null) {
                        method7 = ((Class) bp.a(25 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), View.resolveSizeAndState(0, 0, 0) + 1836, (char) ((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) - 1))).getMethod("a", Object[].class, Integer.TYPE);
                        map4.put(-2142901683, method7);
                    }
                    ((Method) method7).invoke(null, objArr25);
                    return;
                }
                Object[] objArr26 = {Integer.valueOf(((int[]) objArr[9])[0]), 0};
                Map map5 = bp.f40694x;
                Object method8 = map5.get(1463901671);
                if (method8 == null) {
                    Class cls23 = (Class) bp.a(TextUtils.getCapsMode("", 0, 0) + 23, 387 - Process.getGidForName(""), (char) (ViewConfiguration.getScrollBarFadeDuration() >> 16));
                    byte b32 = (byte) 3;
                    byte b33 = (byte) (b32 - 4);
                    Object[] objArr27 = new Object[1];
                    F(b32, b33, (byte) (b33 + 1), objArr27);
                    String str6 = (String) objArr27[0];
                    Class<?> cls24 = Integer.TYPE;
                    method8 = cls23.getMethod(str6, cls24, cls24);
                    map5.put(1463901671, method8);
                }
                Object[] objArr28 = {objArr, Integer.valueOf(((Integer) ((Method) method8).invoke(null, objArr26)).intValue())};
                Object method9 = map5.get(-2142901683);
                if (method9 == null) {
                    method9 = ((Class) bp.a(24 - Gravity.getAbsoluteGravity(0, 0), 1835 - TextUtils.lastIndexOf("", '0', 0), (char) (Process.getGidForName("") + 1))).getMethod("a", Object[].class, Integer.TYPE);
                    map5.put(-2142901683, method9);
                }
                ((Method) method9).invoke(null, objArr28);
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
    public /* synthetic */ void l() {
        int i10 = E + 125;
        I = i10 % 128;
        int i11 = i10 % 2;
        this.f40422h.e();
        int i12 = E + 51;
        I = i12 % 128;
        if (i12 % 2 == 0) {
            throw null;
        }
    }

    private void m() {
        int i10 = E + 63;
        I = i10 % 128;
        if (i10 % 2 == 0) {
            this.f40424j.i();
            throw null;
        }
        if (this.f40424j.i()) {
            int i11 = E + 9;
            I = i11 % 128;
            if (i11 % 2 != 0) {
                this.f40424j.g();
            } else {
                this.f40424j.g();
                throw null;
            }
        }
    }

    private void n() {
        if (this.f40434u) {
            return;
        }
        int i10 = E + 113;
        I = i10 % 128;
        int i11 = i10 % 2;
        if (this.f40431r) {
            this.f40424j.d();
            this.f40434u = true;
            int i12 = I + 79;
            E = i12 % 128;
            int i13 = i12 % 2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void o() {
        int i10 = I + 57;
        E = i10 % 128;
        int i11 = i10 % 2;
        if (ch.h() == cj.ZOOM_CLOSE) {
            dn.a((bh) a(new Object[]{this}, -504724426, 504724432, System.identityHashCode(this)), dn.b.FACE_CAPTURE_MOVE_CLOSER_DELAYED);
            int i12 = E + 103;
            I = i12 % 128;
            int i13 = i12 % 2;
        }
        int i14 = I + 41;
        E = i14 % 128;
        int i15 = i14 % 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void p() {
        int i10 = I + 91;
        E = i10 % 128;
        if (i10 % 2 != 0) {
            int i11 = 55 / 0;
            if (this.f40420f) {
                return;
            }
        } else if (!(!this.f40420f)) {
            return;
        }
        this.f40416a.setAlpha(0.0f);
        if (bd.f40494c) {
            this.f40416a.setVisibility(4);
        } else {
            int i12 = I + 119;
            E = i12 % 128;
            int i13 = i12 % 2;
            this.f40416a.setVisibility(0);
        }
        this.f40419e.setAlpha(0.0f);
        this.f40437x = false;
        this.f40424j.c(false);
        int iH = this.f40424j.h() - (this.f40438y << 1);
        if ((((int) this.f40424j.f41002b.bottom) - this.f40416a.getHeight()) - (this.f40438y << 1) >= iH) {
            int i14 = I + 3;
            E = i14 % 128;
            int i15 = i14 % 2;
            if (db.a() < 1.4d) {
                int i16 = I + 85;
                E = i16 % 128;
                if (i16 % 2 != 0) {
                    this.f40416a.setY(iH);
                    int i17 = 87 / 0;
                } else {
                    this.f40416a.setY(iH);
                }
            }
        }
        this.f40416a.animate().alpha(1.0f).setDuration(500L).setListener(null).start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void q() {
        int i10 = I + 3;
        int i11 = i10 % 128;
        E = i11;
        int i12 = i10 % 2;
        this.f40429p = true;
        int i13 = i11 + 25;
        I = i13 % 128;
        if (i13 % 2 == 0) {
            throw null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:6:0x005d  */
    public /* synthetic */ void r() {
        this.f40424j.setVisibility(0);
        this.f40422h.c();
        this.f40424j.animate().alpha(1.0f).setDuration(200L).setListener(null).start();
        this.f40425k.animate().alpha(0.0f).setDuration(300L).setListener(null).start();
        if (FaceTecSDK.f40106a.f40090n.f40073e != FaceTecCancelButtonCustomization.ButtonLocation.TOP_LEFT) {
            int i10 = I + 39;
            E = i10 % 128;
            int i11 = i10 % 2;
            if (FaceTecSDK.f40106a.f40090n.f40073e == FaceTecCancelButtonCustomization.ButtonLocation.TOP_RIGHT) {
                this.f40418c.setVisibility(0);
                this.f40418c.animate().alpha(1.0f).setDuration(500L).setStartDelay(50L).setListener(null).start();
                int i12 = I + 103;
                E = i12 % 128;
                int i13 = i12 % 2;
            }
        } else {
            this.f40418c.setVisibility(0);
            this.f40418c.animate().alpha(1.0f).setDuration(500L).setStartDelay(50L).setListener(null).start();
            int i14 = I + 103;
            E = i14 % 128;
            int i15 = i14 % 2;
        }
        bh bhVar = (bh) a(new Object[]{this}, -504724426, 504724432, System.identityHashCode(this));
        if (bhVar == null) {
            return;
        }
        bhVar.f40570c.animate().alpha(0.0f).setDuration(500L).setStartDelay(0L).setListener(null).start();
        int i16 = 4;
        this.f40427n.postDelayed(new aq.b(new b1(this, i16)), 500L);
        this.f40427n.postDelayed(new aq.b(new u2(this, i16)), 1150L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void s() {
        int i10 = I + 103;
        E = i10 % 128;
        int i11 = i10 % 2;
        this.f40436w.release();
        int i12 = I + 61;
        E = i12 % 128;
        int i13 = i12 % 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void t() {
        int i10 = I + 69;
        E = i10 % 128;
        if (i10 % 2 != 0) {
            this.f40418c.setImageResource(db.aH());
            this.f40424j.f();
            throw null;
        }
        this.f40418c.setImageResource(db.aH());
        this.f40424j.f();
        int i11 = I + 35;
        E = i11 % 128;
        int i12 = i11 % 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void w() {
        int i10 = E + 107;
        I = i10 % 128;
        if (i10 % 2 == 0) {
            throw null;
        }
        if (this.f40430q) {
            return;
        }
        this.f40430q = true;
        float fC = db.c();
        float fD = db.d();
        int iE = db.e();
        int iE2 = (int) (ay.e(35) * fD * fC);
        float f6 = iE / 2.0f;
        int iRound = Math.round(f6);
        int iRound2 = Math.round(f6);
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.f40418c.getLayoutParams();
        layoutParams.setMargins(iRound, iRound, 0, 0);
        layoutParams.setMarginStart(iRound);
        layoutParams.setMarginEnd(iRound);
        this.f40418c.setLayoutParams(layoutParams);
        this.f40418c.setPadding(iRound2, iRound2, iRound2, iRound2);
        this.f40418c.getLayoutParams().height = iE2;
        this.f40418c.getLayoutParams().width = iE2;
        this.f40418c.requestLayout();
        int i11 = E + 3;
        I = i11 % 128;
        int i12 = i11 % 2;
    }

    @Nullable
    private bh g() {
        return (bh) a(new Object[]{this}, -504724426, 504724432, System.identityHashCode(this));
    }

    private void j() {
        int i10 = E + 63;
        I = i10 % 128;
        int i11 = i10 % 2;
        cc ccVarF = f();
        if (ccVarF != null) {
            int i12 = I + 55;
            E = i12 % 128;
            if (i12 % 2 == 0) {
                ccVarF.e(this.f40423i);
                this.f40423i = null;
            } else {
                ccVarF.e(this.f40423i);
                this.f40423i = null;
                throw null;
            }
        }
        int i13 = E + 27;
        I = i13 % 128;
        int i14 = i13 % 2;
    }

    public static void i() {
        C = 5402764725387775499L;
        G = -2051027445;
        H = (char) 47709;
    }

    public final void e() {
        be beVar = (be) getActivity();
        int i10 = 0;
        if (beVar != null) {
            int i11 = I + 39;
            E = i11 % 128;
            if (i11 % 2 != 0) {
                beVar.w();
                int i12 = 19 / 0;
            } else {
                beVar.w();
            }
        }
        bh bhVar = (bh) a(new Object[]{this}, -504724426, 504724432, System.identityHashCode(this));
        if (!isAdded() || bhVar == null) {
            int i13 = E + 121;
            I = i13 % 128;
            if (i13 % 2 == 0) {
                throw null;
            }
            return;
        }
        j();
        bs.a(bhVar);
        if (this.f40431r) {
            ap.d(bhVar, ao.FT_EVENT_FACESCAN_SESSION_FAIL);
        }
        c((Runnable) new aq.b(new j1(this, bhVar, i10)), false);
        int i14 = E + 5;
        I = i14 % 128;
        int i15 = i14 % 2;
    }

    public static az a() {
        az azVar = new az();
        Bundle bundle = new Bundle();
        bundle.putString("reason", null);
        azVar.setArguments(bundle);
        int i10 = I + 11;
        E = i10 % 128;
        if (i10 % 2 == 0) {
            return azVar;
        }
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void d(bh bhVar) {
        int i10 = I + 43;
        E = i10 % 128;
        int i11 = i10 % 2;
        bhVar.f();
        int i12 = I + 77;
        E = i12 % 128;
        if (i12 % 2 != 0) {
            throw null;
        }
    }

    public final void h() {
        a(new Object[]{this}, -1297348129, 1297348131, System.identityHashCode(this));
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0041  */
    /* JADX WARN: Code duplicated, block: B:17:0x0045  */
    /* JADX WARN: Code duplicated, block: B:31:0x009d  */
    public final void c(cj cjVar, cg cgVar) throws Throwable {
        bh bhVar = (bh) a(new Object[]{this}, -504724426, 504724432, System.identityHashCode(this));
        if (!isAdded() || bhVar == null) {
            return;
        }
        if (this.f40424j.i()) {
            int i10 = I + 113;
            E = i10 % 128;
            if (i10 % 2 != 0) {
                int i11 = 67 / 0;
                if (cgVar == cg.HOLD_STEADY) {
                    if (!this.f40437x) {
                        int i12 = I + 43;
                        E = i12 % 128;
                        int i13 = i12 % 2;
                        this.f40419e.animate().alpha(1.0f).setDuration(500L).setStartDelay(0L).setListener(null).start();
                        this.f40437x = true;
                    }
                }
            } else if (cgVar == cg.HOLD_STEADY) {
                if (!this.f40437x) {
                    int i14 = I + 43;
                    E = i14 % 128;
                    int i15 = i14 % 2;
                    this.f40419e.animate().alpha(1.0f).setDuration(500L).setStartDelay(0L).setListener(null).start();
                    this.f40437x = true;
                }
            }
        }
        if (!this.f40431r) {
            int i16 = I + 15;
            E = i16 % 128;
            if (i16 % 2 == 0) {
                if (cgVar != cg.FACE_NOT_FOUND) {
                    int i17 = E + 125;
                    I = i17 % 128;
                    if (i17 % 2 == 0) {
                        this.f40431r = false;
                        if (!this.f40432s) {
                            this.f40432s = true;
                            bs.e(new Object[]{bhVar}, -1012379954, 1012379956, (int) System.currentTimeMillis());
                        }
                    } else {
                        this.f40431r = true;
                        if (!this.f40432s) {
                            this.f40432s = true;
                            bs.e(new Object[]{bhVar}, -1012379954, 1012379956, (int) System.currentTimeMillis());
                        }
                    }
                    bhVar.i();
                }
            } else {
                cg cgVar2 = cg.HOLD_STEADY;
                throw null;
            }
        }
        if (isAdded()) {
            int i18 = I;
            int i19 = i18 + 109;
            E = i19 % 128;
            int i20 = i19 % 2;
            if (this.f40420f) {
                return;
            }
            cj cjVar2 = this.f40435v;
            if (cjVar2 != cjVar) {
                if (cjVar2 != null) {
                    int i21 = i18 + 29;
                    E = i21 % 128;
                    int i22 = i21 % 2;
                    n();
                }
                this.f40435v = cjVar;
                this.f40434u = false;
            }
            if (cjVar == cj.ZOOM_CLOSE) {
                t.f42834e = ak.f40297o;
                if (!this.f40424j.i()) {
                    cx.d(new u4(this, 3));
                    cs csVar = this.f40424j;
                    csVar.setOvalHasExpanded(true);
                    csVar.bp_(csVar.m);
                    if (dn.d()) {
                        dn.d((bh) a(new Object[]{this}, -504724426, 504724432, System.identityHashCode(this)), getString(R.string.FaceTec_accessibility_feedback_move_phone_closer));
                    }
                    if (FaceTecSDK.f40106a.vocalGuidanceCustomization.mode == FaceTecVocalGuidanceCustomization.VocalGuidanceMode.FULL_VOCAL_GUIDANCE) {
                        dn.a((bh) a(new Object[]{this}, -504724426, 504724432, System.identityHashCode(this)), dn.b.FACE_CAPTURE_MOVE_CLOSER_AUTOMATIC);
                        Handler handler = new Handler();
                        this.B = handler;
                        handler.postDelayed(this.A, 4500L);
                    }
                    if (FaceTecSDK.f40106a.f40088k.enablePulsatingText) {
                        Handler handler2 = new Handler();
                        this.f40428o = handler2;
                        handler2.postDelayed(new aq.b(new k3(this, 5)), 3000L);
                    }
                    t.e(new Object[]{cu.FACE_SCAN_ZOOMED}, -590439926, 590439930, (int) System.currentTimeMillis());
                }
            }
            b(cjVar, cgVar);
        }
    }

    public final void d() {
        int i10 = E + 125;
        I = i10 % 128;
        if (i10 % 2 == 0) {
            int i11 = 56 / 0;
            if (this.D) {
                return;
            }
        } else if (this.D) {
            return;
        }
        this.D = true;
        final bh bhVar = (bh) a(new Object[]{this}, -504724426, 504724432, System.identityHashCode(this));
        if (!isAdded() || bhVar == null) {
            return;
        }
        c((Runnable) new aq.b(new Runnable() { // from class: com.facetec.sdk.m1
            @Override // java.lang.Runnable
            public final void run() {
                this.f42394p0.e(bhVar);
            }
        }), true);
        int i12 = I + 77;
        E = i12 % 128;
        int i13 = i12 % 2;
    }

    private static /* synthetic */ Object a(Object[] objArr) {
        bh bhVar = (bh) objArr[0];
        int i10 = E + 55;
        I = i10 % 128;
        int i11 = i10 % 2;
        bhVar.j();
        if (i11 == 0) {
            throw null;
        }
        int i12 = E + 117;
        I = i12 % 128;
        if (i12 % 2 == 0) {
            int i13 = 93 / 0;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(bh bhVar) {
        this.f40427n.post(new aq.b(new s1(bhVar, 0)));
        int i10 = E + 35;
        I = i10 % 128;
        int i11 = i10 % 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void b(bh bhVar) {
        int i10 = E + 107;
        I = i10 % 128;
        int i11 = i10 % 2;
        bhVar.h();
        if (i11 == 0) {
            int i12 = 47 / 0;
        }
        int i13 = E + 97;
        I = i13 % 128;
        int i14 = i13 % 2;
    }

    private synchronized void b(cj cjVar, cg cgVar) {
        try {
            int i10 = E + 117;
            I = i10 % 128;
            if (i10 % 2 != 0) {
                if (cjVar == cj.ZOOM_FAR) {
                    m();
                }
                if (cgVar == cg.HOLD_STEADY) {
                    this.f40424j.d();
                    this.f40434u = true;
                }
                cm cmVar = this.f40422h;
                if (cgVar != cmVar.f40902a) {
                    int i11 = E + 15;
                    I = i11 % 128;
                    if (i11 % 2 != 0) {
                        if (!cmVar.f40908g) {
                            cmVar.f40902a = cgVar;
                            cmVar.e(cm.d(cgVar));
                            return;
                        }
                    } else {
                        throw null;
                    }
                }
                return;
            }
            cj cjVar2 = cj.ZOOM_CLOSE;
            throw null;
        } catch (Throwable th2) {
            throw th2;
        }
        throw th2;
    }

    private synchronized void a(ck ckVar) {
        int i10 = I + 107;
        E = i10 % 128;
        if (i10 % 2 == 0) {
            m();
            cm cmVar = this.f40422h;
            if (ckVar != cmVar.f40905d && !cmVar.f40908g) {
                cmVar.f40905d = ckVar;
                int iB = cm.b(ckVar);
                if (!cmVar.f40908g) {
                    int i11 = I + 95;
                    E = i11 % 128;
                    if (i11 % 2 == 0) {
                        if (iB != cmVar.f40903b) {
                            cmVar.f40903b = iB;
                            cmVar.f40908g = false;
                            dn.c(iB);
                            dd.bv_(cmVar.f40904c, cmVar.f40903b);
                        }
                    } else {
                        throw null;
                    }
                }
                return;
            }
            int i12 = I + 33;
            E = i12 % 128;
            if (i12 % 2 == 0) {
                return;
            } else {
                throw null;
            }
        }
        m();
        ck ckVar2 = this.f40422h.f40905d;
        throw null;
        throw th;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void d(bh bhVar, View view) {
        a(new Object[]{this, bhVar, view}, -819158006, 819158013, System.identityHashCode(this));
    }

    private void d(Context context) {
        a(new Object[]{this, context}, -272011198, 272011198, System.identityHashCode(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void e(bh bhVar) {
        this.f40427n.post(new aq.b(new d1(bhVar, 1)));
        int i10 = E + 19;
        I = i10 % 128;
        int i11 = i10 % 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void e(Context context, be beVar) {
        a(new Object[]{this, context, beVar}, -233648760, 233648761, System.identityHashCode(this));
    }

    private void b(boolean z10) {
        int i10 = E + 41;
        I = i10 % 128;
        if (i10 % 2 != 0) {
            int i11 = z10 ? 400 : 300;
            cs csVar = this.f40424j;
            AnimatorSet animatorSet = csVar.m;
            if (animatorSet != null) {
                animatorSet.cancel();
            }
            AnimatorSet animatorSet2 = csVar.f41007g;
            if (animatorSet2 != null) {
                int i12 = I + 9;
                E = i12 % 128;
                int i13 = i12 % 2;
                animatorSet2.cancel();
            }
            AnimatorSet animatorSet3 = csVar.f41012l;
            if (animatorSet3 != null) {
                int i14 = I + 39;
                E = i14 % 128;
                int i15 = i14 % 2;
                animatorSet3.cancel();
            }
            this.f40424j.c(new aq.b(new m2(this, 4)), z10);
            try {
                this.f40436w.acquire();
            } catch (InterruptedException e5) {
                e5.printStackTrace();
            }
            this.f40418c.setVisibility(4);
            this.f40421g.setVisibility(4);
            this.f40426l.setVisibility(4);
            db.h(this.f40425k);
            this.f40425k.animate().alpha(1.0f).setDuration(i11 + 100).setStartDelay(0L).setListener(null).start();
            AnimatorSet duration = new AnimatorSet().setDuration(i11);
            LinearLayout linearLayout = this.f40416a;
            Property property = View.ALPHA;
            cm cmVar = this.f40422h;
            duration.playTogether(ObjectAnimator.ofFloat(linearLayout, (Property<LinearLayout, Float>) property, 0.0f), ObjectAnimator.ofFloat(this.f40422h, (Property<cm, Float>) property, 0.0f), ObjectAnimator.ofFloat(this.f40418c, (Property<ImageView, Float>) property, 0.0f), ObjectAnimator.ofFloat(cmVar, (Property<cm, Float>) View.TRANSLATION_Y, (-cmVar.getHeight()) / 2));
            duration.start();
            return;
        }
        throw null;
    }

    public final void c() {
        int i10 = 0;
        this.D = false;
        be beVar = (be) getActivity();
        if (beVar != null) {
            beVar.w();
        }
        bh bhVar = (bh) a(new Object[]{this}, -504724426, 504724432, System.identityHashCode(this));
        if (bhVar == null) {
            return;
        }
        j();
        if (this.f40432s) {
            int i11 = I + 87;
            E = i11 % 128;
            int i12 = i11 % 2;
            bs.c(bhVar);
            this.f40432s = false;
        }
        if (!(!this.f40433t)) {
            int i13 = I + 103;
            E = i13 % 128;
            try {
                if (i13 % 2 != 0) {
                    this.f40433t = true;
                } else {
                    this.f40433t = false;
                }
            } catch (Exception e5) {
                e5.printStackTrace();
            }
        }
        ap.d(bhVar, ao.FT_EVENT_FACESCAN_SESSION_SUCCESS);
        this.f40427n.post(new r1(bhVar, i10));
        int i14 = I + 119;
        E = i14 % 128;
        if (i14 % 2 != 0) {
            throw null;
        }
    }

    private static /* synthetic */ Object b(Object[] objArr) {
        az azVar = (az) objArr[0];
        int i10 = E;
        int i11 = i10 + 91;
        I = i11 % 128;
        int i12 = i11 % 2;
        Semaphore semaphore = azVar.f40436w;
        if (semaphore != null) {
            int i13 = i10 + 117;
            I = i13 % 128;
            try {
                if (i13 % 2 == 0) {
                    semaphore.tryAcquire(2000L, TimeUnit.MILLISECONDS);
                    throw null;
                }
                if (semaphore.tryAcquire(2000L, TimeUnit.MILLISECONDS)) {
                    azVar.f40436w.release();
                    int i14 = E + 11;
                    I = i14 % 128;
                    int i15 = i14 % 2;
                }
                return null;
            } catch (InterruptedException e5) {
                e5.printStackTrace();
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void c(bh bhVar) {
        int i10 = E + 59;
        I = i10 % 128;
        int i11 = i10 % 2;
        bhVar.d();
        int i12 = E + 11;
        I = i12 % 128;
        int i13 = i12 % 2;
    }

    private void c(Runnable runnable, boolean z10) {
        int i10 = E + 109;
        I = i10 % 128;
        if (i10 % 2 == 0) {
            n();
            b(z10);
            runnable.run();
            int i11 = 67 / 0;
        } else {
            n();
            b(z10);
            runnable.run();
        }
        int i12 = I + 107;
        E = i12 % 128;
        int i13 = i12 % 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(cp cpVar, ci ciVar, ck ckVar, cl clVar) {
        if (cpVar == cp.TIMEOUT_GO_TO_RETRY) {
            cc ccVarF = f();
            if (ccVarF != null) {
                int i10 = I + 107;
                E = i10 % 128;
                if (i10 % 2 == 0) {
                    ccVarF.f();
                    ccVarF.b(this.f40439z);
                } else {
                    ccVarF.f();
                    ccVarF.b(this.f40439z);
                    throw null;
                }
            }
            bh bhVar = (bh) a(new Object[]{this}, -504724426, 504724432, System.identityHashCode(this));
            if (bhVar != null) {
                int i11 = I + 61;
                E = i11 % 128;
                if (i11 % 2 != 0) {
                    bhVar.g();
                    int i12 = 37 / 0;
                    return;
                } else {
                    bhVar.g();
                    return;
                }
            }
            return;
        }
        if (this.f40429p && cpVar != cp.DETECTING_LIGHT_MODE) {
            if (cpVar == cp.DETECTING_FACE_FEEDBACK) {
                if (!isAdded() || this.f40420f) {
                    return;
                }
                this.f40417b = ckVar;
                a(ckVar);
                int i13 = I + 25;
                E = i13 % 128;
                if (i13 % 2 != 0) {
                    throw null;
                }
                return;
            }
            cc ccVarF2 = f();
            if (ccVarF2 != null) {
                ccVarF2.f();
                ccVarF2.b(this.f40439z);
            }
            a(new Object[]{this, (bh) a(new Object[]{this}, -504724426, 504724432, System.identityHashCode(this))}, -272011198, 272011198, System.identityHashCode(this));
        }
    }
}

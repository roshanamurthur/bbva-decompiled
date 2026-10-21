package com.facetec.sdk;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.Configuration;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Build;
import android.os.Looper;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import android.widget.Toast;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.core.content.ContextCompat;
import com.bbva.notifications.constants.PushConstants;
import com.vierge.pinpadsdk.message.base.MessageUtils;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes9.dex */
final class bg {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static final byte[] $$d = null;
    private static final int $$e = 0;
    private static final byte[] $$g = null;
    private static final int $$h = 0;
    private static int $10;
    private static int $11;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static String f40537a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    static String f40538b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    static int f40539c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    static FaceTecAuditTrailType f40540d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    static FaceTecAuditTrailImagesToReturn f40541e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static String f40542f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    static JSONObject f40543g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static String f40544h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NonNull
    private static c f40545i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static String f40546j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static Boolean f40547k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static String f40548l;
    private static boolean m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static boolean f40549n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static boolean f40550o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static char[] f40551p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static long f40552q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static /* synthetic */ boolean f40553r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static char[] f40554s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static SharedPreferences f40555t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private static final byte[] f40556u = null;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private static int f40557v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private static char f40558w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private static int f40559x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private static final int f40560y = 0;

    /* JADX INFO: renamed from: com.facetec.sdk.bg$5, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass5 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f40561a;

        static {
            int[] iArr = new int[c.values().length];
            f40561a = iArr;
            try {
                iArr[c.VALIDATED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f40561a[c.REJECTED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f40561a[c.NETWORK_ERROR.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f40561a[c.VERSION_DEPRECATED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f40561a[c.NEVER_VALIDATED.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    public enum c {
        NEVER_VALIDATED,
        VALIDATED,
        REJECTED,
        VERSION_DEPRECATED,
        NETWORK_ERROR
    }

    static {
        init$2();
        $10 = 0;
        $11 = 1;
        init$1();
        init$0();
        m();
        f40559x = 0;
        f40557v = 1;
        n();
        g();
        Process.getThreadPriority(0);
        SystemClock.elapsedRealtime();
        Drawable.resolveOpacity(0, 0);
        int i10 = f40559x + 43;
        f40557v = i10 % 128;
        int i11 = i10 % 2;
        f40553r = true;
        f40537a = null;
        f40540d = FaceTecAuditTrailType.HEIGHT_640;
        f40541e = FaceTecAuditTrailImagesToReturn.ONE;
        f40543g = null;
        f40545i = c.NEVER_VALIDATED;
        m = false;
        f40548l = null;
        f40550o = false;
        f40549n = false;
        f40547k = null;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x002e  */
    /* JADX WARN: Code duplicated, block: B:8:0x0026  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x002e -> B:11:0x0037). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x002e
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void E(int r7, int r8, short r9, java.lang.Object[] r10) {
        /*
            int r9 = r9 * 17
            int r9 = 18 - r9
            byte[] r0 = com.facetec.sdk.bg.$$d
            int r7 = r7 * 2
            int r7 = 101 - r7
            int r8 = r8 * 17
            int r8 = 21 - r8
            byte[] r1 = new byte[r9]
            r2 = 0
            if (r0 != 0) goto L1b
            r7 = r9
            r3 = r1
            r4 = r2
            r9 = r8
            r1 = r0
            r0 = r10
            r10 = r7
            goto L37
        L1b:
            r3 = r2
            r6 = r9
            r9 = r7
            r7 = r6
        L1f:
            int r4 = r3 + 1
            byte r5 = (byte) r9
            r1[r3] = r5
            if (r4 != r7) goto L2e
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            r10[r2] = r7
            return
        L2e:
            r3 = r0[r8]
            r6 = r9
            r9 = r8
            r8 = r3
            r3 = r1
            r1 = r0
            r0 = r10
            r10 = r6
        L37:
            int r8 = -r8
            int r10 = r10 + r8
            int r8 = r10 + 3
            int r9 = r9 + 1
            r10 = r0
            r0 = r1
            r1 = r3
            r3 = r4
            r6 = r9
            r9 = r8
            r8 = r6
            goto L1f
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facetec.sdk.bg.E(int, int, short, java.lang.Object[]):void");
    }

    public static /* synthetic */ Object a(Object[] objArr, int i10, int i11, int i12) {
        int i13 = (i11 * TypedValues.MotionType.TYPE_EASING) + (i10 * 302);
        int i14 = ~i10;
        int i15 = ~i12;
        switch (((~(i11 | i15)) * 301) + (((~(i10 | i15 | i11)) | (~(i12 | i14)) | (~((~i11) | i14))) * (-301)) + (((~(i14 | i15)) | i11) * (-602)) + i13) {
            case 1:
                return d(objArr);
            case 2:
                return a(objArr);
            case 3:
                return e(objArr);
            case 4:
                return c(objArr);
            case 5:
                return g(objArr);
            case 6:
                return j(objArr);
            case 7:
                return i(objArr);
            case 8:
                return h(objArr);
            default:
                return b(objArr);
        }
    }

    public static boolean an_(@NonNull Configuration configuration) {
        int i10 = f40557v + 101;
        int i11 = i10 % 128;
        f40559x = i11;
        int i12 = i10 % 2;
        if (configuration.orientation != 2) {
            return false;
        }
        int i13 = i11 + 119;
        f40557v = i13 % 128;
        if (i13 % 2 != 0) {
            return true;
        }
        throw null;
    }

    public static SharedPreferences ao_(Context context) {
        return (SharedPreferences) a(new Object[]{context}, 1435759663, -1435759656, (int) System.currentTimeMillis());
    }

    private static /* synthetic */ Object b(Object[] objArr) {
        Context context = (Context) objArr[0];
        if (i(context)) {
            int i10 = f40557v + 115;
            f40559x = i10 % 128;
            int i11 = i10 % 2;
            try {
                ch.c(context);
                int i12 = f40557v + 73;
                f40559x = i12 % 128;
                if (i12 % 2 != 0) {
                    int i13 = 93 / 0;
                }
            } catch (Exception unused) {
            }
        }
        return null;
    }

    public static boolean c() {
        int i10 = f40557v;
        int i11 = i10 + 89;
        f40559x = i11 % 128;
        int i12 = i11 % 2;
        int i13 = i10 + 3;
        f40559x = i13 % 128;
        int i14 = i13 % 2;
        return false;
    }

    public static boolean d() {
        int i10 = f40557v + 1;
        f40559x = i10 % 128;
        if (i10 % 2 == 0) {
            return f40550o;
        }
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void e(String str, Context context, FaceTecSDK.InitializeCallback initializeCallback, String str2, String str3) throws Throwable {
        int i10 = f40559x + 89;
        f40557v = i10 % 128;
        int i11 = i10 % 2;
        if (e(str)) {
            a(new Object[]{context}, -2085143645, 2085143653, (int) System.currentTimeMillis());
            b(context, str2, str3, initializeCallback);
            return;
        }
        a(new Object[]{context, initializeCallback, Boolean.FALSE}, -1564157998, 1564158002, (int) System.currentTimeMillis());
        int i12 = f40559x + 39;
        f40557v = i12 % 128;
        if (i12 % 2 == 0) {
            int i13 = 26 / 0;
        }
    }

    public static int f(Context context) {
        int i10 = f40559x + 125;
        f40557v = i10 % 128;
        int i11 = i10 % 2;
        int i12 = ((SharedPreferences) a(new Object[]{context}, 1435759663, -1435759656, (int) System.currentTimeMillis())).getInt(ak.U, 0);
        int i13 = f40559x + 55;
        f40557v = i13 % 128;
        if (i13 % 2 != 0) {
            return i12;
        }
        throw null;
    }

    private static /* synthetic */ Object g(Object[] objArr) {
        int i10 = f40559x + 33;
        int i11 = i10 % 128;
        f40557v = i11;
        if (i10 % 2 == 0) {
            throw null;
        }
        String str = f40548l;
        int i12 = i11 + 29;
        f40559x = i12 % 128;
        int i13 = i12 % 2;
        return str;
    }

    private static boolean h(@NonNull Context context) {
        if (context.getPackageManager().hasSystemFeature("org.chromium.arc")) {
            return true;
        }
        int i10 = f40559x + 65;
        f40557v = i10 % 128;
        if (i10 % 2 == 0) {
            context.getPackageManager().hasSystemFeature("org.chromium.arc.device_management");
            throw null;
        }
        if (context.getPackageManager().hasSystemFeature("org.chromium.arc.device_management")) {
            return true;
        }
        int i11 = f40557v + 59;
        f40559x = i11 % 128;
        if (i11 % 2 == 0) {
            return false;
        }
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0030  */
    private static synchronized boolean i(@NonNull Context context) {
        boolean z10;
        try {
            if (f40547k == null) {
                if (l() && m(context)) {
                    int i10 = f40557v + 19;
                    f40559x = i10 % 128;
                    if (i10 % 2 != 0) {
                        h(context);
                        throw null;
                    }
                    if (h(context)) {
                        z10 = false;
                    } else {
                        z10 = true;
                    }
                } else {
                    z10 = false;
                }
                f40547k = Boolean.valueOf(z10);
                int i11 = f40559x + 5;
                f40557v = i11 % 128;
                int i12 = i11 % 2;
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return f40547k.booleanValue();
    }

    public static void init$0() {
        $$a = new byte[]{2, -32, -79, 81};
        $$b = 223;
    }

    public static void init$1() {
        $$d = new byte[]{6, 45, -19, 87, -9, 5, 66, -53, 8, 1, 1, -12, MessageUtils.MESSAGE_18_DC2, 5, 56, -66, MessageUtils.MESSAGE_18_DC2, -4, 64, -58, -6};
        $$e = 23;
    }

    public static void init$2() {
        $$g = new byte[]{17, -47, 16, 110};
        $$h = 242;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:22:0x019b A[Catch: all -> 0x0198, TryCatch #2 {all -> 0x0198, blocks: (B:11:0x00db, B:15:0x0137, B:19:0x018e, B:35:0x02dc, B:39:0x0333, B:43:0x038e, B:42:0x0358, B:38:0x02f7, B:46:0x039e, B:50:0x03f6, B:54:0x044d, B:53:0x041b, B:49:0x03b9, B:57:0x04ac, B:61:0x0501, B:65:0x0558, B:64:0x0526, B:60:0x04c7, B:18:0x015c, B:14:0x00f9, B:22:0x019b, B:26:0x0208, B:25:0x01c4), top: B:79:0x0050 }] */
    /* JADX WARN: Code duplicated, block: B:24:0x01c3  */
    /* JADX WARN: Code duplicated, block: B:25:0x01c4 A[Catch: all -> 0x0198, TryCatch #2 {all -> 0x0198, blocks: (B:11:0x00db, B:15:0x0137, B:19:0x018e, B:35:0x02dc, B:39:0x0333, B:43:0x038e, B:42:0x0358, B:38:0x02f7, B:46:0x039e, B:50:0x03f6, B:54:0x044d, B:53:0x041b, B:49:0x03b9, B:57:0x04ac, B:61:0x0501, B:65:0x0558, B:64:0x0526, B:60:0x04c7, B:18:0x015c, B:14:0x00f9, B:22:0x019b, B:26:0x0208, B:25:0x01c4), top: B:79:0x0050 }] */
    @DoNotInline
    public static void k() throws Throwable {
        Map map;
        Object method;
        Object[] objArr;
        int i10 = f40557v + 37;
        f40559x = i10 % 128;
        int i11 = i10 % 2;
        try {
            Class cls = (Class) bp.a((ViewConfiguration.getMinimumFlingVelocity() >> 16) + 23, (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 387, (char) Color.red(0));
            byte b10 = (byte) 0;
            byte b11 = b10;
            byte b12 = b11;
            Object[] objArr2 = new Object[1];
            A(b10, b11, b12, objArr2);
            long j10 = cls.getField((String) objArr2[0]).getLong(null);
            try {
                if (j10 != -1) {
                    long j11 = j10 + 2042;
                    Object[] objArr3 = new Object[1];
                    B((byte) (6 - KeyEvent.keyCodeFromString("")), "\t\u0007\u000e\u0005\u000b\u0018\r\u0014\n\t\u0018\u0012\u0000\u0007\u0014\u0015\n\u0003\r\n\u0002\u0017", (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 22, objArr3);
                    Class<?> cls2 = Class.forName((String) objArr3[0]);
                    Object[] objArr4 = new Object[1];
                    B((byte) (15 - TextUtils.indexOf((CharSequence) "", '0')), "\u0016\n\u0006\r\n\u0000\u000b\u000f\u0017\u0005\u000e\u0016\u0017\u000b㘏", 15 - View.resolveSize(0, 0), objArr4);
                    if (j11 >= ((Long) cls2.getDeclaredMethod((String) objArr4[0], new Class[0]).invoke(null, new Object[0])).longValue()) {
                        int i12 = f40557v + 81;
                        f40559x = i12 % 128;
                        int i13 = i12 % 2;
                        Class cls3 = (Class) bp.a((ViewConfiguration.getDoubleTapTimeout() >> 16) + 23, TextUtils.getCapsMode("", 0, 0) + 388, (char) Color.blue(0));
                        byte b13 = (byte) (b10 + 3);
                        Object[] objArr5 = new Object[1];
                        A(b10, b13, (byte) (b13 - 3), objArr5);
                        Object obj = cls3.getField((String) objArr5[0]).get(null);
                        Object[] objArr6 = {-699020150, 0};
                        Map map2 = bp.f40694x;
                        Object method2 = map2.get(1463901671);
                        if (method2 == null) {
                            Class cls4 = (Class) bp.a(22 - TextUtils.lastIndexOf("", '0'), 388 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), (char) ((ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) - 1));
                            Object[] objArr7 = new Object[1];
                            A(b10, b11, b12, objArr7);
                            String str = (String) objArr7[0];
                            Class<?> cls5 = Integer.TYPE;
                            method2 = cls4.getMethod(str, cls5, cls5);
                            map2.put(1463901671, method2);
                        }
                        Object[] objArr8 = {obj, Integer.valueOf(((Integer) ((Method) method2).invoke(null, objArr6)).intValue())};
                        Object method3 = map2.get(-2142901683);
                        if (method3 == null) {
                            method3 = ((Class) bp.a((ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 23, Gravity.getAbsoluteGravity(0, 0) + 1836, (char) View.getDefaultSize(0, 0))).getMethod("a", Object[].class, Integer.TYPE);
                            map2.put(-2142901683, method3);
                        }
                        objArr = (Object[]) ((Method) method3).invoke(null, objArr8);
                    } else {
                        Object[] objArr9 = {0, 0, -699020150};
                        map = bp.f40694x;
                        method = map.get(388357536);
                        if (method != null) {
                            Class cls6 = (Class) bp.a(23 - Color.alpha(0), 388 - View.getDefaultSize(0, 0), (char) (ViewConfiguration.getTouchSlop() >> 8));
                            byte b14 = $$a[0];
                            Object[] objArr10 = new Object[1];
                            A(b10, b14, (byte) (b14 - 2), objArr10);
                            String str2 = (String) objArr10[0];
                            Class<?> cls7 = Integer.TYPE;
                            method = cls6.getMethod(str2, cls7, cls7, cls7);
                            map.put(388357536, method);
                        }
                        objArr = (Object[]) ((Method) method).invoke(null, objArr9);
                        Class cls8 = (Class) bp.a(23 - (ViewConfiguration.getTapTimeout() >> 16), TextUtils.indexOf("", "") + 388, (char) (ViewConfiguration.getEdgeSlop() >> 16));
                        byte b15 = (byte) (b10 + 3);
                        Object[] objArr11 = new Object[1];
                        A(b10, b15, (byte) (b15 - 3), objArr11);
                        cls8.getField((String) objArr11[0]).set(null, objArr);
                        try {
                            Object[] objArr12 = new Object[1];
                            B((byte) (5 - TextUtils.indexOf((CharSequence) "", '0')), "\t\u0007\u000e\u0005\u000b\u0018\r\u0014\n\t\u0018\u0012\u0000\u0007\u0014\u0015\n\u0003\r\n\u0002\u0017", KeyEvent.getDeadChar(0, 0) + 22, objArr12);
                            Class<?> cls9 = Class.forName((String) objArr12[0]);
                            Object[] objArr13 = new Object[1];
                            B((byte) (TextUtils.indexOf("", "", 0, 0) + 16), "\u0016\n\u0006\r\n\u0000\u000b\u000f\u0017\u0005\u000e\u0016\u0017\u000b㘏", 14 - TextUtils.lastIndexOf("", '0', 0, 0), objArr13);
                            Long lValueOf = Long.valueOf(((Long) cls9.getDeclaredMethod((String) objArr13[0], new Class[0]).invoke(null, new Object[0])).longValue());
                            Class cls10 = (Class) bp.a(23 - Color.blue(0), (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 387, (char) (ViewConfiguration.getMinimumFlingVelocity() >> 16));
                            Object[] objArr14 = new Object[1];
                            A(b10, b11, b12, objArr14);
                            cls10.getField((String) objArr14[0]).set(null, lValueOf);
                        } catch (Exception unused) {
                            throw new RuntimeException();
                        }
                    }
                } else {
                    Object[] objArr15 = {0, 0, -699020150};
                    map = bp.f40694x;
                    method = map.get(388357536);
                    if (method != null) {
                        Class cls11 = (Class) bp.a(23 - Color.alpha(0), 388 - View.getDefaultSize(0, 0), (char) (ViewConfiguration.getTouchSlop() >> 8));
                        byte b16 = $$a[0];
                        Object[] objArr16 = new Object[1];
                        A(b10, b16, (byte) (b16 - 2), objArr16);
                        String str3 = (String) objArr16[0];
                        Class<?> cls12 = Integer.TYPE;
                        method = cls11.getMethod(str3, cls12, cls12, cls12);
                        map.put(388357536, method);
                    }
                    objArr = (Object[]) ((Method) method).invoke(null, objArr15);
                    Class cls13 = (Class) bp.a(23 - (ViewConfiguration.getTapTimeout() >> 16), TextUtils.indexOf("", "") + 388, (char) (ViewConfiguration.getEdgeSlop() >> 16));
                    byte b17 = (byte) (b10 + 3);
                    Object[] objArr17 = new Object[1];
                    A(b10, b17, (byte) (b17 - 3), objArr17);
                    cls13.getField((String) objArr17[0]).set(null, objArr);
                    Object[] objArr18 = new Object[1];
                    B((byte) (5 - TextUtils.indexOf((CharSequence) "", '0')), "\t\u0007\u000e\u0005\u000b\u0018\r\u0014\n\t\u0018\u0012\u0000\u0007\u0014\u0015\n\u0003\r\n\u0002\u0017", KeyEvent.getDeadChar(0, 0) + 22, objArr18);
                    Class<?> cls14 = Class.forName((String) objArr18[0]);
                    Object[] objArr19 = new Object[1];
                    B((byte) (TextUtils.indexOf("", "", 0, 0) + 16), "\u0016\n\u0006\r\n\u0000\u000b\u000f\u0017\u0005\u000e\u0016\u0017\u000b㘏", 14 - TextUtils.lastIndexOf("", '0', 0, 0), objArr19);
                    Long lValueOf2 = Long.valueOf(((Long) cls14.getDeclaredMethod((String) objArr19[0], new Class[0]).invoke(null, new Object[0])).longValue());
                    Class cls15 = (Class) bp.a(23 - Color.blue(0), (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 387, (char) (ViewConfiguration.getMinimumFlingVelocity() >> 16));
                    Object[] objArr110 = new Object[1];
                    A(b10, b11, b12, objArr110);
                    cls15.getField((String) objArr110[0]).set(null, lValueOf2);
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
                    int[] iArr = new int[i15];
                    int i16 = i15 - 1;
                    iArr[i16] = 1;
                    Toast.makeText((Context) null, iArr[((i15 * i16) % 2) - 1], 1).show();
                    Object[] objArr20 = {Integer.valueOf(((int[]) objArr[9])[0]), 0};
                    Map map3 = bp.f40694x;
                    Object method4 = map3.get(1463901671);
                    if (method4 == null) {
                        Class cls16 = (Class) bp.a(23 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), (ViewConfiguration.getEdgeSlop() >> 16) + 388, (char) (ViewConfiguration.getMaximumDrawingCacheSize() >> 24));
                        Object[] objArr21 = new Object[1];
                        A(b10, b11, b12, objArr21);
                        String str4 = (String) objArr21[0];
                        Class<?> cls17 = Integer.TYPE;
                        method4 = cls16.getMethod(str4, cls17, cls17);
                        map3.put(1463901671, method4);
                    }
                    Object[] objArr22 = {objArr, Integer.valueOf(((Integer) ((Method) method4).invoke(null, objArr20)).intValue())};
                    Object method5 = map3.get(-2142901683);
                    if (method5 == null) {
                        method5 = ((Class) bp.a(24 - (ViewConfiguration.getPressedStateDuration() >> 16), ImageFormat.getBitsPerPixel(0) + 1837, (char) (ViewConfiguration.getScrollBarFadeDuration() >> 16))).getMethod("a", Object[].class, Integer.TYPE);
                        map3.put(-2142901683, method5);
                    }
                    ((Method) method5).invoke(null, objArr22);
                    return;
                }
                int i17 = f40557v + 109;
                f40559x = i17 % 128;
                if (i17 % 2 != 0) {
                    Object[] objArr23 = {Integer.valueOf(((int[]) objArr[79])[0]), 0};
                    Map map4 = bp.f40694x;
                    Object method6 = map4.get(1463901671);
                    if (method6 == null) {
                        Class cls18 = (Class) bp.a((SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 22, 388 - View.MeasureSpec.getMode(0), (char) ((-1) - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1))));
                        Object[] objArr24 = new Object[1];
                        A(b10, b11, b12, objArr24);
                        String str5 = (String) objArr24[0];
                        Class<?> cls19 = Integer.TYPE;
                        method6 = cls18.getMethod(str5, cls19, cls19);
                        map4.put(1463901671, method6);
                    }
                    Object[] objArr25 = {objArr, Integer.valueOf(((Integer) ((Method) method6).invoke(null, objArr23)).intValue())};
                    Object method7 = map4.get(-2142901683);
                    if (method7 == null) {
                        method7 = ((Class) bp.a(TextUtils.indexOf("", "") + 24, 1837 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), (char) (1 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1))))).getMethod("a", Object[].class, Integer.TYPE);
                        map4.put(-2142901683, method7);
                    }
                    ((Method) method7).invoke(null, objArr25);
                    return;
                }
                Object[] objArr26 = {Integer.valueOf(((int[]) objArr[9])[0]), 0};
                Map map5 = bp.f40694x;
                Object method8 = map5.get(1463901671);
                if (method8 == null) {
                    Class cls20 = (Class) bp.a((ViewConfiguration.getJumpTapTimeout() >> 16) + 23, 389 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), (char) (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)));
                    Object[] objArr27 = new Object[1];
                    A(b10, b11, b12, objArr27);
                    String str6 = (String) objArr27[0];
                    Class<?> cls21 = Integer.TYPE;
                    method8 = cls20.getMethod(str6, cls21, cls21);
                    map5.put(1463901671, method8);
                }
                Object[] objArr28 = {objArr, Integer.valueOf(((Integer) ((Method) method8).invoke(null, objArr26)).intValue())};
                Object method9 = map5.get(-2142901683);
                if (method9 == null) {
                    method9 = ((Class) bp.a(23 - TextUtils.indexOf((CharSequence) "", '0'), 1836 - (Process.myTid() >> 22), (char) Drawable.resolveOpacity(0, 0))).getMethod("a", Object[].class, Integer.TYPE);
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

    private static boolean l() {
        if (!Build.CPU_ABI.toLowerCase().startsWith("arm")) {
            return false;
        }
        int i10 = f40559x + 117;
        int i11 = i10 % 128;
        f40557v = i11;
        int i12 = i10 % 2;
        int i13 = i11 + 85;
        f40559x = i13 % 128;
        if (i13 % 2 == 0) {
            return true;
        }
        throw null;
    }

    private static boolean m(@NonNull Context context) {
        if (context.getPackageManager().hasSystemFeature("android.hardware.camera.front")) {
            return true;
        }
        int i10 = f40557v + 3;
        f40559x = i10 % 128;
        if (i10 % 2 != 0) {
            Build.MODEL.equals("Lenovo YT3-850F");
            throw null;
        }
        if (Build.MODEL.equals("Lenovo YT3-850F")) {
            return true;
        }
        ae.i();
        int i11 = f40557v + 33;
        f40559x = i11 % 128;
        int i12 = i11 % 2;
        return false;
    }

    private static String n(Context context) throws Exception {
        int i10 = f40557v + 41;
        f40559x = i10 % 128;
        int i11 = i10 % 2;
        byte[] bArrC = d.c(context);
        Object[] objArr = new Object[1];
        C((char) ((ViewConfiguration.getJumpTapTimeout() >> 16) + 15469), AndroidCharacter.getMirror('0') - '0', Drawable.resolveOpacity(0, 0) + 20, objArr);
        String strSubstring = bi.b(bArrC, ((String) objArr[0]).intern()).substring(0, 16);
        int i12 = f40557v + 7;
        f40559x = i12 % 128;
        int i13 = i12 % 2;
        return strSubstring;
    }

    private static String o(Context context) throws Exception {
        return (String) a(new Object[]{context}, -808853209, 808853212, (int) System.currentTimeMillis());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void p(Context context) {
        int i10 = f40557v + 31;
        f40559x = i10 % 128;
        int i11 = i10 % 2;
        k(context);
        int i12 = f40557v + 109;
        f40559x = i12 % 128;
        if (i12 % 2 != 0) {
            throw null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void q(Context context) {
        int i10 = f40557v + 55;
        f40559x = i10 % 128;
        int i11 = i10 % 2;
        ag.e(context);
        int i12 = f40559x + 7;
        f40557v = i12 % 128;
        int i13 = i12 % 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void r() throws Throwable {
        int i10 = f40557v + 91;
        f40559x = i10 % 128;
        int i11 = i10 % 2;
        ch.b();
        int i12 = f40559x + 11;
        f40557v = i12 % 128;
        int i13 = i12 % 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void s(Context context) {
        int i10 = f40559x + 23;
        f40557v = i10 % 128;
        int i11 = i10 % 2;
        k(context);
        if (i11 == 0) {
            throw null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0028  */
    /* JADX WARN: Code duplicated, block: B:8:0x0020  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0028 -> B:11:0x0033). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0028
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void A(short r7, short r8, byte r9, java.lang.Object[] r10) {
        /*
            int r8 = 101 - r8
            byte[] r0 = com.facetec.sdk.bg.$$a
            int r9 = r9 * 3
            int r1 = r9 + 1
            int r7 = r7 * 3
            int r7 = 4 - r7
            byte[] r1 = new byte[r1]
            r2 = 0
            if (r0 != 0) goto L18
            r8 = r7
            r3 = r1
            r4 = r2
            r1 = r0
            r0 = r10
            r10 = r9
            goto L33
        L18:
            r3 = r2
        L19:
            byte r4 = (byte) r8
            r1[r3] = r4
            int r4 = r3 + 1
            if (r3 != r9) goto L28
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            r10[r2] = r7
            return
        L28:
            r3 = r0[r7]
            r5 = r8
            r8 = r7
            r7 = r5
            r6 = r10
            r10 = r9
            r9 = r3
            r3 = r1
            r1 = r0
            r0 = r6
        L33:
            int r7 = r7 + r9
            int r8 = r8 + 1
            r9 = r10
            r10 = r0
            r0 = r1
            r1 = r3
            r3 = r4
            r5 = r8
            r8 = r7
            r7 = r5
            goto L19
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facetec.sdk.bg.A(short, short, byte, java.lang.Object[]):void");
    }

    private static void B(byte b10, String str, int i10, Object[] objArr) throws Throwable {
        int i11;
        char[] charArray = str != null ? str.toCharArray() : str;
        gv gvVar = new gv();
        char[] cArr = f40554s;
        int i12 = -324767611;
        if (cArr != null) {
            int i13 = $11 + 9;
            $10 = i13 % 128;
            int i14 = i13 % 2;
            int length = cArr.length;
            char[] cArr2 = new char[length];
            int i15 = 0;
            while (i15 < length) {
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr[i15])};
                    Map map = bp.f40694x;
                    Object method = map.get(Integer.valueOf(i12));
                    if (method == null) {
                        Class cls = (Class) bp.a(24 - Color.argb(0, 0, 0, 0), View.combineMeasuredStates(0, 0) + 1411, (char) Color.alpha(0));
                        byte b11 = (byte) 0;
                        byte b12 = b11;
                        Object[] objArr3 = new Object[1];
                        D(b11, b12, (byte) (b12 + 1), objArr3);
                        method = cls.getMethod((String) objArr3[0], Integer.TYPE);
                        map.put(-324767611, method);
                    }
                    cArr2[i15] = ((Character) ((Method) method).invoke(null, objArr2)).charValue();
                    i15++;
                    i12 = -324767611;
                } catch (Throwable th2) {
                    Throwable cause = th2.getCause();
                    if (cause == null) {
                        throw th2;
                    }
                    throw cause;
                }
            }
            cArr = cArr2;
        }
        Object[] objArr4 = {Integer.valueOf(f40558w)};
        Map map2 = bp.f40694x;
        Object method2 = map2.get(-324767611);
        long j10 = 0;
        if (method2 == null) {
            Class cls2 = (Class) bp.a(24 - KeyEvent.getDeadChar(0, 0), 1411 - (ViewConfiguration.getFadingEdgeLength() >> 16), (char) ExpandableListView.getPackedPositionGroup(0L));
            byte b13 = (byte) 0;
            byte b14 = b13;
            Object[] objArr5 = new Object[1];
            D(b13, b14, (byte) (b14 + 1), objArr5);
            method2 = cls2.getMethod((String) objArr5[0], Integer.TYPE);
            map2.put(-324767611, method2);
        }
        char cCharValue = ((Character) ((Method) method2).invoke(null, objArr4)).charValue();
        char[] cArr3 = new char[i10];
        if (i10 % 2 != 0) {
            int i16 = $10 + 119;
            $11 = i16 % 128;
            if (i16 % 2 == 0) {
                i11 = i10 + 36;
                cArr3[i11] = (char) (charArray[i11] % b10);
            } else {
                i11 = i10 - 1;
                cArr3[i11] = (char) (charArray[i11] - b10);
            }
        } else {
            i11 = i10;
        }
        if (i11 > 1) {
            gvVar.f41832e = 0;
            while (true) {
                int i17 = gvVar.f41832e;
                if (i17 >= i11) {
                    break;
                }
                char c10 = charArray[i17];
                gvVar.f41829b = c10;
                char c11 = charArray[i17 + 1];
                gvVar.f41831d = c11;
                if (c10 == c11) {
                    int i18 = $11 + 123;
                    $10 = i18 % 128;
                    if (i18 % 2 != 0) {
                        cArr3[i17] = (char) (c10 * b10);
                        cArr3[i17] = (char) (c11 - b10);
                    } else {
                        cArr3[i17] = (char) (c10 - b10);
                        cArr3[i17 + 1] = (char) (c11 - b10);
                    }
                } else {
                    Object[] objArr6 = {gvVar, gvVar, Integer.valueOf(cCharValue), gvVar, gvVar, Integer.valueOf(cCharValue), gvVar, gvVar, Integer.valueOf(cCharValue), gvVar, gvVar, Integer.valueOf(cCharValue), gvVar};
                    Map map3 = bp.f40694x;
                    Object method3 = map3.get(-779085347);
                    if (method3 == null) {
                        Class cls3 = (Class) bp.a((KeyEvent.getMaxKeyCode() >> 16) + 23, (ViewConfiguration.getScrollBarSize() >> 8) + 719, (char) (ExpandableListView.getPackedPositionForGroup(0) > j10 ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == j10 ? 0 : -1)));
                        byte b15 = (byte) 0;
                        byte b16 = b15;
                        Object[] objArr7 = new Object[1];
                        D(b15, b16, b16, objArr7);
                        String str2 = (String) objArr7[0];
                        Class<?> cls4 = Integer.TYPE;
                        method3 = cls3.getMethod(str2, Object.class, Object.class, cls4, Object.class, Object.class, cls4, Object.class, Object.class, cls4, Object.class, Object.class, cls4, Object.class);
                        map3.put(-779085347, method3);
                    }
                    int iIntValue = ((Integer) ((Method) method3).invoke(null, objArr6)).intValue();
                    int i19 = gvVar.f41833g;
                    if (iIntValue == i19) {
                        Object[] objArr8 = {gvVar, gvVar, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), gvVar, gvVar, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), gvVar, Integer.valueOf(cCharValue), gvVar};
                        Object method4 = map3.get(531504056);
                        if (method4 == null) {
                            Class cls5 = (Class) bp.a((ViewConfiguration.getEdgeSlop() >> 16) + 24, 221 - (ViewConfiguration.getKeyRepeatDelay() >> 16), (char) Color.green(0));
                            Class<?> cls6 = Integer.TYPE;
                            method4 = cls5.getMethod("l", Object.class, Object.class, cls6, cls6, Object.class, Object.class, cls6, cls6, Object.class, cls6, Object.class);
                            map3.put(531504056, method4);
                        }
                        int iIntValue2 = ((Integer) ((Method) method4).invoke(null, objArr8)).intValue();
                        int i20 = (gvVar.f41828a * cCharValue) + gvVar.f41833g;
                        int i21 = gvVar.f41832e;
                        cArr3[i21] = cArr[iIntValue2];
                        cArr3[i21 + 1] = cArr[i20];
                        int i22 = $11 + 113;
                        $10 = i22 % 128;
                        int i23 = i22 % 2;
                    } else {
                        int i24 = gvVar.f41830c;
                        int i25 = gvVar.f41828a;
                        if (i24 == i25) {
                            int iA = androidx.activity.a.a(gvVar.f41834j, cCharValue, 1, cCharValue);
                            gvVar.f41834j = iA;
                            int iA2 = androidx.activity.a.a(i19, cCharValue, 1, cCharValue);
                            gvVar.f41833g = iA2;
                            int i26 = (i25 * cCharValue) + iA2;
                            int i27 = gvVar.f41832e;
                            cArr3[i27] = cArr[(i24 * cCharValue) + iA];
                            cArr3[i27 + 1] = cArr[i26];
                        } else {
                            int i28 = (i24 * cCharValue) + i19;
                            int i29 = (i25 * cCharValue) + gvVar.f41834j;
                            int i30 = gvVar.f41832e;
                            cArr3[i30] = cArr[i28];
                            cArr3[i30 + 1] = cArr[i29];
                        }
                    }
                }
                gvVar.f41832e += 2;
                j10 = 0;
            }
        }
        int i31 = $11 + 55;
        $10 = i31 % 128;
        int i32 = i31 % 2;
        int i33 = 0;
        while (i33 < i10) {
            int i34 = $10 + 115;
            $11 = i34 % 128;
            if (i34 % 2 == 0) {
                cArr3[i33] = (char) (cArr3[i33] ^ 7752);
                i33 += 34;
            } else {
                cArr3[i33] = (char) (cArr3[i33] ^ 13722);
                i33++;
            }
        }
        objArr[0] = new String(cArr3);
    }

    /* JADX WARN: Code duplicated, block: B:47:0x0227  */
    /* JADX WARN: Code duplicated, block: B:48:0x0228  */
    private static void C(char c10, int i10, int i11, Object[] objArr) throws Throwable {
        Throwable cause;
        gt gtVar = new gt();
        long[] jArr = new long[i11];
        gtVar.f41826d = 0;
        while (true) {
            int i12 = gtVar.f41826d;
            if (i12 >= i11) {
                break;
            }
            try {
                Object[] objArr2 = {Integer.valueOf(f40551p[i10 + i12])};
                Map map = bp.f40694x;
                Object method = map.get(-167668390);
                if (method == null) {
                    method = ((Class) bp.a(24 - Color.argb(0, 0, 0, 0), 245 - (ViewConfiguration.getPressedStateDuration() >> 16), (char) TextUtils.getCapsMode("", 0, 0))).getMethod("d", Integer.TYPE);
                    map.put(-167668390, method);
                }
                Object[] objArr3 = {Long.valueOf(((Long) ((Method) method).invoke(null, objArr2)).longValue()), Long.valueOf(gtVar.f41826d), Long.valueOf(f40552q), Integer.valueOf(c10)};
                Object method2 = map.get(-1565725271);
                if (method2 == null) {
                    Class cls = (Class) bp.a(24 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), ExpandableListView.getPackedPositionType(0L) + 1672, (char) ((AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 58389));
                    byte b10 = (byte) 0;
                    byte b11 = b10;
                    Object[] objArr4 = new Object[1];
                    D(b10, b11, (byte) (b11 + 2), objArr4);
                    String str = (String) objArr4[0];
                    Class<?> cls2 = Long.TYPE;
                    method2 = cls.getMethod(str, cls2, cls2, cls2, Integer.TYPE);
                    map.put(-1565725271, method2);
                }
                jArr[i12] = ((Long) ((Method) method2).invoke(null, objArr3)).longValue();
                Object[] objArr5 = {gtVar, gtVar};
                Object method3 = map.get(453950717);
                if (method3 == null) {
                    method3 = ((Class) bp.a(24 - (ViewConfiguration.getKeyRepeatDelay() >> 16), Drawable.resolveOpacity(0, 0) + 269, (char) (25686 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1))))).getMethod("b", Object.class, Object.class);
                    map.put(453950717, method3);
                }
                ((Method) method3).invoke(null, objArr5);
                int i13 = $10 + 67;
                $11 = i13 % 128;
                int i14 = i13 % 2;
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
        char[] cArr = new char[i11];
        gtVar.f41826d = 0;
        while (true) {
            int i15 = gtVar.f41826d;
            if (i15 >= i11) {
                objArr[0] = new String(cArr);
                return;
            }
            int i16 = $11 + 51;
            $10 = i16 % 128;
            if (i16 % 2 != 0) {
                cArr[i15] = (char) jArr[i15];
                Object[] objArr6 = {gtVar, gtVar};
                Map map2 = bp.f40694x;
                Object method4 = map2.get(453950717);
                if (method4 == null) {
                    method4 = ((Class) bp.a('H' - AndroidCharacter.getMirror('0'), ExpandableListView.getPackedPositionGroup(0L) + 269, (char) ((AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 25686))).getMethod("b", Object.class, Object.class);
                    map2.put(453950717, method4);
                }
                ((Method) method4).invoke(null, objArr6);
                int i17 = 3 / 0;
            } else {
                cArr[i15] = (char) jArr[i15];
                Object[] objArr7 = {gtVar, gtVar};
                Map map3 = bp.f40694x;
                Object method5 = map3.get(453950717);
                if (method5 == null) {
                    method5 = ((Class) bp.a(24 - KeyEvent.normalizeMetaState(0), 268 - TextUtils.indexOf((CharSequence) "", '0', 0), (char) ((ViewConfiguration.getScrollDefaultDelay() >> 16) + 25686))).getMethod("b", Object.class, Object.class);
                    map3.put(453950717, method5);
                }
                ((Method) method5).invoke(null, objArr7);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:10:0x002e  */
    /* JADX WARN: Code duplicated, block: B:8:0x0026  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x002e -> B:11:0x0039). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x002e
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void D(byte r7, byte r8, short r9, java.lang.Object[] r10) {
        /*
            int r7 = r7 * 2
            int r7 = r7 + 4
            byte[] r0 = com.facetec.sdk.bg.$$g
            int r8 = r8 * 2
            int r1 = r8 + 1
            int r9 = r9 * 6
            int r9 = 111 - r9
            byte[] r1 = new byte[r1]
            r2 = 0
            if (r0 != 0) goto L1a
            r3 = r1
            r4 = r2
            r1 = r0
            r0 = r10
            r10 = r8
            r8 = r7
            goto L39
        L1a:
            r3 = r2
            r5 = r8
            r8 = r7
            r7 = r9
            r9 = r5
        L1f:
            byte r4 = (byte) r7
            r1[r3] = r4
            int r4 = r3 + 1
            if (r3 != r9) goto L2e
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            r10[r2] = r7
            return
        L2e:
            r3 = r0[r8]
            r5 = r8
            r8 = r7
            r7 = r5
            r6 = r10
            r10 = r9
            r9 = r3
            r3 = r1
            r1 = r0
            r0 = r6
        L39:
            int r7 = r7 + 1
            int r8 = r8 + r9
            r9 = r10
            r10 = r0
            r0 = r1
            r1 = r3
            r3 = r4
            r5 = r8
            r8 = r7
            r7 = r5
            goto L1f
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facetec.sdk.bg.D(byte, byte, short, java.lang.Object[]):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void a(String str, Context context, FaceTecSDK.InitializeCallback initializeCallback) throws Throwable {
        int i10 = f40557v + 87;
        f40559x = i10 % 128;
        if (i10 % 2 != 0) {
            e(str);
            throw null;
        }
        if (!e(str)) {
            a(new Object[]{context, initializeCallback, Boolean.FALSE}, -1564157998, 1564158002, (int) System.currentTimeMillis());
            return;
        }
        a(new Object[]{context}, -2085143645, 2085143653, (int) System.currentTimeMillis());
        d(context, initializeCallback);
        int i11 = f40559x + 27;
        f40557v = i11 % 128;
        if (i11 % 2 == 0) {
            int i12 = 47 / 0;
        }
    }

    private static /* synthetic */ Object c(Object[] objArr) {
        final Context context = (Context) objArr[0];
        final FaceTecSDK.InitializeCallback initializeCallback = (FaceTecSDK.InitializeCallback) objArr[1];
        final boolean zBooleanValue = ((Boolean) objArr[2]).booleanValue();
        int i10 = f40559x;
        int i11 = i10 + 29;
        f40557v = i11 % 128;
        if (i11 % 2 == 0) {
            throw null;
        }
        if (initializeCallback != null) {
            cx.d(new Runnable() { // from class: com.facetec.sdk.w4
                @Override // java.lang.Runnable
                public final void run() {
                    bg.d(zBooleanValue, context, initializeCallback);
                }
            });
            return null;
        }
        int i12 = i10 + 111;
        f40557v = i12 % 128;
        int i13 = i12 % 2;
        return null;
    }

    private static synchronized void d(@NonNull Context context, at.c cVar) {
        int i10 = f40557v + 25;
        f40559x = i10 % 128;
        int i11 = i10 % 2;
        b(context, false);
        d(context);
        at.a(context, cVar);
        int i12 = f40559x + 23;
        f40557v = i12 % 128;
        int i13 = i12 % 2;
    }

    public static void g() {
        int i10 = f40557v + 73;
        f40559x = i10 % 128;
        if (i10 % 2 == 0) {
            f40551p = new char[]{48359, 28226, 6601, 50416, 63056, 41261, 19626, 32746, 10609, 54427, 34786, 45321, 23663, 3988, 15100, 58480, 38760, 17107, 27657, 8056};
            f40552q = -9083229944028966315L;
        } else {
            f40551p = new char[]{48359, 28226, 6601, 50416, 63056, 41261, 19626, 32746, 10609, 54427, 34786, 45321, 23663, 3988, 15100, 58480, 38760, 17107, 27657, 8056};
            f40552q = -9083229944028966315L;
            int i11 = 28 / 0;
        }
    }

    private static /* synthetic */ Object j(Object[] objArr) {
        String str;
        Context context = (Context) objArr[0];
        if (!i(context)) {
            int i10 = f40557v + 69;
            f40559x = i10 % 128;
            int i11 = i10 % 2;
            FaceTecSDKStatus faceTecSDKStatus = FaceTecSDKStatus.DEVICE_NOT_SUPPORTED;
            int i12 = f40559x + 3;
            f40557v = i12 % 128;
            int i13 = i12 % 2;
            return faceTecSDKStatus;
        }
        if (f40537a != null && ((str = f40548l) == null || !(!str.isEmpty()))) {
            return FaceTecSDKStatus.ENCRYPTION_KEY_INVALID;
        }
        if (an_(context.getResources().getConfiguration())) {
            return FaceTecSDKStatus.DEVICE_IN_LANDSCAPE_MODE;
        }
        if (ay.c(context) == 9) {
            int i14 = f40557v + 67;
            f40559x = i14 % 128;
            int i15 = i14 % 2;
            return FaceTecSDKStatus.DEVICE_IN_REVERSE_PORTRAIT_MODE;
        }
        int i16 = AnonymousClass5.f40561a[f40545i.ordinal()];
        if (i16 == 1) {
            if (!bs.h(context)) {
                return FaceTecSDKStatus.INITIALIZED;
            }
            int i17 = f40557v + 61;
            f40559x = i17 % 128;
            int i18 = i17 % 2;
            return FaceTecSDKStatus.DEVICE_LOCKED_OUT;
        }
        if (i16 != 2) {
            if (i16 == 3) {
                return FaceTecSDKStatus.NETWORK_ISSUES;
            }
            if (i16 != 4) {
                return i16 != 5 ? FaceTecSDKStatus.NEVER_INITIALIZED : FaceTecSDKStatus.NEVER_INITIALIZED;
            }
            return FaceTecSDKStatus.VERSION_DEPRECATED;
        }
        if (!m) {
            return FaceTecSDKStatus.INVALID_DEVICE_KEY_IDENTIFIER;
        }
        FaceTecSDKStatus faceTecSDKStatus2 = FaceTecSDKStatus.KEY_EXPIRED_OR_INVALID;
        int i19 = f40557v + 57;
        f40559x = i19 % 128;
        if (i19 % 2 == 0) {
            return faceTecSDKStatus2;
        }
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @DoNotInline
    public static void o() {
        a(new Object[0], 792367568, -792367566, (int) System.currentTimeMillis());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void r(Context context) {
        a(new Object[]{context}, -1480299748, 1480299748, (int) System.currentTimeMillis());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void s() {
        int i10 = f40557v + 103;
        f40559x = i10 % 128;
        int i11 = i10 % 2;
        at.e();
        cc.b();
        int i12 = f40559x + 77;
        f40557v = i12 % 128;
        if (i12 % 2 == 0) {
            int i13 = 41 / 0;
        }
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0024  */
    /* JADX WARN: Code duplicated, block: B:8:0x001c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:11:0x0031). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0024
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void z(byte r6, short r7, short r8, java.lang.Object[] r9) {
        /*
            int r6 = 118 - r6
            int r7 = 1375 - r7
            byte[] r0 = com.facetec.sdk.bg.f40556u
            int r1 = 385 - r8
            byte[] r1 = new byte[r1]
            int r8 = 384 - r8
            r2 = 0
            if (r0 != 0) goto L16
            r3 = r1
            r4 = r2
            r1 = r0
            r0 = r9
            r9 = r8
            r8 = r7
            goto L31
        L16:
            r3 = r2
        L17:
            byte r4 = (byte) r6
            r1[r3] = r4
            if (r3 != r8) goto L24
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L24:
            r4 = r0[r7]
            int r3 = r3 + 1
            r5 = r7
            r7 = r6
            r6 = r4
            r4 = r3
            r3 = r1
            r1 = r0
            r0 = r9
            r9 = r8
            r8 = r5
        L31:
            int r7 = r7 + r6
            int r6 = r7 + 4
            int r7 = r8 + 1
            r8 = r9
            r9 = r0
            r0 = r1
            r1 = r3
            r3 = r4
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facetec.sdk.bg.z(byte, short, short, java.lang.Object[]):void");
    }

    private static void g(@NonNull Context context) {
        a(new Object[]{context}, -2085143645, 2085143653, (int) System.currentTimeMillis());
    }

    private static void l(Context context) {
        int i10 = f40559x + 71;
        f40557v = i10 % 128;
        int i11 = i10 % 2;
        try {
            if (d.d(context) == d.a.New) {
                int i12 = f40559x + 99;
                f40557v = i12 % 128;
                if (i12 % 2 != 0) {
                    String str = (String) a(new Object[]{context}, -808853209, 808853212, (int) System.currentTimeMillis());
                    f40546j = str;
                    f40542f = str;
                    return;
                } else {
                    String str2 = (String) a(new Object[]{context}, -808853209, 808853212, (int) System.currentTimeMillis());
                    f40546j = str2;
                    f40542f = str2;
                    throw null;
                }
            }
            String strN = n(context);
            f40542f = strN;
            f40546j = UUID.nameUUIDFromBytes(strN.getBytes()).toString();
        } catch (Exception unused) {
            String strE = ay.e(15, 0);
            f40546j = strE;
            f40542f = strE;
        }
    }

    public static String f() {
        return (String) a(new Object[0], -357708855, 357708860, (int) System.currentTimeMillis());
    }

    public static void h() {
        int i10 = f40559x + 11;
        f40557v = i10 % 128;
        int i11 = i10 % 2;
        aw.c("***********************************************************************************************************************************");
        aw.c("* WARNING: You are using initializeInDevelopmentMode with a PRODUCTION Key. *");
        aw.c("* Please use initializeInProductionMode, even if you are still Developing your Application. *");
        aw.c("* Please review https://dev.facetec.com/keys#key-types *");
        aw.c("***********************************************************************************************************************************");
        int i12 = f40559x + 33;
        f40557v = i12 % 128;
        if (i12 % 2 == 0) {
            int i13 = 7 / 0;
        }
    }

    public static boolean b() {
        int i10 = f40559x + 7;
        f40557v = i10 % 128;
        int i11 = i10 % 2;
        if (f40540d == FaceTecAuditTrailType.DISABLED) {
            return false;
        }
        int i12 = f40557v + 95;
        f40559x = i12 % 128;
        int i13 = i12 % 2;
        return true;
    }

    @NonNull
    public static FaceTecSDK.CameraPermissionStatus c(@NonNull Context context) {
        int i10 = f40559x + 65;
        f40557v = i10 % 128;
        int i11 = i10 % 2;
        if (ContextCompat.checkSelfPermission(context, "android.permission.CAMERA") != 0) {
            FaceTecSDK.CameraPermissionStatus cameraPermissionStatus = FaceTecSDK.CameraPermissionStatus.NOT_YET_REQUESTED;
            int i12 = f40557v + 71;
            f40559x = i12 % 128;
            if (i12 % 2 == 0) {
                return cameraPermissionStatus;
            }
            throw null;
        }
        return FaceTecSDK.CameraPermissionStatus.GRANTED;
    }

    public static void n() {
        f40554s = new char[]{25186, 25189, 25176, 25154, 25188, 25170, 25167, 25185, 25152, 25171, 25157, 25169, 25165, 25164, 25166, 25184, 25203, 25190, 25191, 25202, 25156, 25160, 25162, 25103, 25173};
        f40558w = (char) 22462;
    }

    public static synchronized String b(@Nullable Context context, boolean z10) {
        try {
            if (f40546j == null) {
                int i10 = f40557v + 105;
                int i11 = i10 % 128;
                f40559x = i11;
                int i12 = i10 % 2;
                if (context != null) {
                    int i13 = i11 + 63;
                    f40557v = i13 % 128;
                    if (i13 % 2 == 0) {
                        l(context);
                        int i14 = 27 / 0;
                    } else {
                        l(context);
                    }
                }
            }
            if (z10) {
                int i15 = f40557v + 47;
                f40559x = i15 % 128;
                int i16 = i15 % 2;
                return f40542f;
            }
            String str = f40546j;
            int i17 = f40557v + 37;
            f40559x = i17 % 128;
            if (i17 % 2 == 0) {
                return str;
            }
            throw null;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void d(boolean z10, Context context, FaceTecSDK.InitializeCallback initializeCallback) {
        boolean zC;
        int i10 = f40559x + 105;
        f40557v = i10 % 128;
        int i11 = i10 % 2;
        if (z10) {
            try {
                zC = ch.c(context);
            } catch (Exception unused) {
                zC = false;
            }
            if (!zC) {
                f40545i = c.REJECTED;
            }
            try {
                f40549n = true;
                initializeCallback.onCompletion(zC);
                return;
            } finally {
                f40549n = false;
            }
        }
        initializeCallback.onCompletion(false);
        int i12 = f40557v + 79;
        f40559x = i12 % 128;
        int i13 = i12 % 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void e(Context context, FaceTecSDK.InitializeCallback initializeCallback, at.a aVar) {
        boolean z10;
        if (aVar != null) {
            int i10 = f40557v;
            int i11 = i10 + 41;
            f40559x = i11 % 128;
            if (i11 % 2 == 0) {
                if (aVar.f40404a) {
                    if (!aVar.f40405d) {
                        int i12 = i10 + 23;
                        f40559x = i12 % 128;
                        int i13 = i12 % 2;
                        f40545i = c.VALIDATED;
                        z10 = true;
                    } else {
                        f40545i = c.VERSION_DEPRECATED;
                    }
                    a(new Object[]{context, initializeCallback, Boolean.valueOf(z10)}, -1564157998, 1564158002, (int) System.currentTimeMillis());
                }
                f40545i = c.REJECTED;
            } else {
                boolean z11 = aVar.f40404a;
                throw null;
            }
        } else {
            f40545i = c.NETWORK_ERROR;
        }
        z10 = false;
        a(new Object[]{context, initializeCallback, Boolean.valueOf(z10)}, -1564157998, 1564158002, (int) System.currentTimeMillis());
    }

    public static void m() {
        byte[] bArr = new byte[1509];
        System.arraycopy("f:pÁ\u0000÷\u0001÷ý\u0001öý\u0002õý\u0003ôý\u0004óý\u0005òý\u0006ñý\u0007ðý\bïý\u0000ûøý\u0000ü÷ý\u0000ýö\bð\u0001÷ý\u0000þõý\u0000ÿôý\u0000\u0000óý\u0000\u0001òý\u0000\u0002ñý\u0000\u0003ð\u0001ûø\u0001÷ý\u0000\u0004ïý\u0001úø\u0001ü÷ý\u0001û÷\u0001ýöý\u0001üöý\u0001ýõý\u0001þôý\u0001ÿóý\u0001\u0000òý\u0001\u0001ñý\u0001\u0002ð\bð\u0001ÿô\u0001ýöý\u0000\u0004ïý\u0001\u0003ï\bðý\u0002ùøý\u0002ú÷ý\u0002ûöý\u0002üõ\u0001\u0000ó\u0001ÿôý\u0002ýôý\u0002þó\u0001\u0001òý\u0002ÿò\u0001ûø\u0001ýöý\u0000\u0004ïý\u0002\u0000ñ\bðý\u0002\u0001ðý\u0002þó\u0001\u0001òý\u0002\u0002ï\u0001\u0002ñ\u0001\u0003ðý\u0003øø\u0001\u0004ïý\u0001úø\u0002úø\u0002û÷\u0001\u0001òý\u0002\u0000ñ\u0001\u0004ïý\u0001úøý\u0003ù÷\u0002üö\u0002ýõ\u0002þô\u0002û÷ý\u0003úö\u0002ÿóý\u0003ûõý\u0003üôý\u0003ýóý\u0003ýóý\u0003ù÷\u0002\u0001ñ\u0002\u0002ð\u0002û÷ý\u0003úö\u0002ÿóý\u0003þòý\u0003ÿñý\u0003\u0000ðý\u0003\u0000ðý\u0003\u0001ï\u0002\u0003ï\u0003ùøý\u0004÷ø\u0002ÿóý\u0004ø÷ý\u0004ùöý\u0004úõý\u0004úõý\u0004ûô\u0003ûöý\u0004üó\u0003üõý\u0004üóý\u0004ýò\u0001ýöý\u0004þñ\u0001÷ý\u0004þó\u0011çÉ:ñ\tõÃ!\u001dúó\u0001õùøù\u0007ó\u0011çÉ:ñ\tõÃ\u0017!\u0002íþú\tç\u0007\u0005ìæ\u0013\u0001\u0002Þ\u0007\u0007\u0005ìó\u0011çÉCûñÿ¾#üð÷ë\tò\u0007úäüð÷\u0000÷\u0001ýöý\u0001öý\u0002õý\u0003ôý\u0004óý\u0005òý\u0006ñ\u0003ýôý\u0007ðý\bï\u0001ÿôý\u0000ûøý\u0000ü÷ý\u0000ýö\u0003þó\u0001ýöý\u0007ðý\bï\bð\u0001÷ý\u0000þõ\u0003ÿòý\u0000ÿô\u0001÷ý\u0000\u0000ó\bðý\u0000\u0001òý\u0000\u0002ñý\u0000\u0003ðý\u0000\u0004ï\u0003\u0000ñ\u0003\u0001ðý\u0001úøý\u0001û÷\u0001\u0001òý\u0001üö\u0003\u0002ïý\u0007ðý\u0001ýõ\bðý\u0001þôý\u0001û÷\u0001\u0001òý\bï\u0001\u0002ñ\u0001\u0002ñ\u0002û÷\u0001\u0001òý\u0001ÿó\u0004øø\u0001\u0001òý\u0001ýõý\u0001\u0000ò\u0004ù÷\u0004úöý\u0001\u0001ñ\u0001\u0002ñ\u0002û÷ý\u0001\u0002ðý\u0001\u0003ïý\u0002ùøý\u0002ùøý\u0002ú÷\u0004ûõ\u0004úöý\u0002ûö\u0001\u0002ñ\u0002û÷ý\u0002üõý\u0002ýôý\u0002þóý\u0002ÿò\u0003\u0000ñ\u0001ü÷\u0003ÿòý\u0002\u0000ñý\u0001û÷\u0001\u0001ò\u0004ýóý\u0002\u0001ð\u0001\u0001òý\u0001üöý\u0002\u0002ï\u0004þòý\u0003øø\u0004ÿñý\u0003øøý\u0003ù÷\u0001ýöý\u0003úö\u0001÷ý\u0003úöý\u0003ûõ\u0001÷ý\u0003üô\u0001ýöý\u0003ü\u0000÷\u0004\u0001ïý\u0001öý\u0002õý\u0003ô\u0001\u0002ñ\u0002ÿó\u0001\u0001òý\u0004ó\u0001\u0004ïý\u0005òý\u0006ñ\u0005÷ø\u0005ø÷\u0002þô\u0002û÷ý\u0007ð\u0002ÿóý\bïý\u0000ûøý\u0000ü÷ý\u0000ü÷ý\u0006ñ\u0005ùö\u0005ø÷\u0003ùøý\u0007ð\u0002ÿóý\u0000ýöý\u0000þõý\u0000ÿôý\u0000\u0000ó\u0001\u0004ï\u0004ýóý\u0000\u0001ò\u0001\u0001òý\u0005òý\u0000\u0002ñ\u0005úõý\u0000\u0003ð\u0005ûôý\u0000\u0003\u0000÷\bð\u0001ýöý\u0001ö\u0005üóý\u0002õ\u0005üó\u0003\u0001ðý\u0003ôý\u0004óý\u0005òý\u0006ñý\u0007ðý\bïý\u0000ûøý\u0000ü÷\u0005ýò\u0005þñý\u0000ýöý\u0000þõ\bð\u0001ü÷ý\u0000ÿô\u0001ûø\u0001÷ý\u0000\u0000óý\u0000\u0001òý\u0000\u0002ñý\u0000ûø\u0005ÿðý\u0000\u0000óý\u0000\u0003ð\u0001\u0002ñ\u0002ÿó\u0001\u0001òý\u0000\u0004ï\u0001\u0004ïý\u0000\u0003ðý\u0001úø\u0005\u0000ï\u0006öø\u0005ø÷\u0003ùøý\u0001û÷\u0002ÿóý\u0001üöý\u0001ýõý\u0001þôý\u0001ÿó\u0001\u0004ï\u0004ýóý\u0001\u0000ò\u0001\u0001òý\u0000\u0003ðý\u0001\u0001ñ\u0006÷÷\u0005ø÷\u0002þô\u0002û÷ý\u0001\u0002ð\u0002ÿóý\u0001\u0003ïý\u0002ùøý\u0002ú÷ý\u0002ú÷ý\u0002ûö\u0001÷ý\u0002üõ\u0001ýöý\u0002üó\u0011çÉ:ñ\tõÃ\u0010)üùõø\t÷\u0007\u0003î\u0000÷\bðý\u0001ö\bðý\u0002õ\bðý\u0003ô\u0001\u0001òý\u0004óý\u0005ò\u0001\u0001òý\u0006ñý\u0005ò\u0001\u0001òý\u0007ð\u0004øø\u0001\u0001òý\bï\u0001\u0004ïý\u0000ûøý\u0000ü÷\u0006øö\u0002ýõ\u0003ùøý\u0000ýö\u0002ÿóý\u0000þõý\u0000ÿôý\u0000\u0000óý\u0000\u0000óý\u0000ü÷\u0006ùõ\u0006öø\u0005ø÷\u0003ùøý\u0000ýö\u0002ÿóý\u0000\u0001òý\u0000\u0002ñý\u0000\u0003ðý\u0000\u0004ï\bðý\u0001ö\bðý\u0002õ\bðý\u0003ô\u0001\u0001òý\u0001úøý\u0005ò\u0001\u0001òý\u0001û÷ý\u0005ò\u0001\u0001ò\u0004ýóý\u0001üö\u0001\u0001òý\u0007ðý\u0001ýõ\u0006úôý\u0001þô\u0005úõý\u0001þ\u0000÷ý\u0001öý\u0002õý\u0003ôý\u0004óý\u0005ò\u0004ýóý\u0006ñý\u0007ðý\bïý\u0000ûøý\u0000ü÷\u0001\u0001òý\u0000ýö\u0002úø\u0006ûóý\u0000þõ\u0001\u0004ïý\u0005òý\u0000ÿô\u0006üò\u0002ýõ\u0002þô\u0002û÷ý\u0000\u0000ó\u0002ÿóý\u0000\u0001òý\u0000\u0002ñý\u0000\u0003ðý\u0000\u0003ðý\u0000\u0004ï\u0006ýñ\u0002\u0002ð\u0002û÷ý\u0001úø\u0002ÿóý\u0001û÷ý\u0001üöý\u0001ýõý\u0001ý".getBytes("ISO-8859-1"), 0, bArr, 0, 1509);
        f40556u = bArr;
        f40560y = 30;
    }

    private static /* synthetic */ Object i(Object[] objArr) {
        Context context = (Context) objArr[0];
        if (f40555t == null) {
            int i10 = f40557v + 123;
            f40559x = i10 % 128;
            int i11 = i10 % 2;
            if (!f40553r && Looper.myLooper() == Looper.getMainLooper()) {
                throw new AssertionError();
            }
            f40555t = context.getSharedPreferences("zoom.sdk.settings", 0);
        }
        SharedPreferences sharedPreferences = f40555t;
        int i12 = f40559x + 61;
        f40557v = i12 % 128;
        if (i12 % 2 != 0) {
            return sharedPreferences;
        }
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:22:0x01a2 A[Catch: all -> 0x019f, TryCatch #3 {all -> 0x019f, blocks: (B:11:0x00d3, B:15:0x013e, B:19:0x0195, B:33:0x02c1, B:37:0x0325, B:41:0x037e, B:40:0x034a, B:36:0x02e4, B:47:0x03fa, B:51:0x045b, B:55:0x04b0, B:54:0x0480, B:50:0x041d, B:18:0x0163, B:14:0x00fa, B:22:0x01a2, B:26:0x01ee, B:25:0x01bd), top: B:76:0x0055 }] */
    /* JADX WARN: Code duplicated, block: B:24:0x01bc  */
    /* JADX WARN: Code duplicated, block: B:25:0x01bd A[Catch: all -> 0x019f, TryCatch #3 {all -> 0x019f, blocks: (B:11:0x00d3, B:15:0x013e, B:19:0x0195, B:33:0x02c1, B:37:0x0325, B:41:0x037e, B:40:0x034a, B:36:0x02e4, B:47:0x03fa, B:51:0x045b, B:55:0x04b0, B:54:0x0480, B:50:0x041d, B:18:0x0163, B:14:0x00fa, B:22:0x01a2, B:26:0x01ee, B:25:0x01bd), top: B:76:0x0055 }] */
    private static /* synthetic */ Object a(Object[] objArr) throws Throwable {
        Map map;
        Object declaredConstructor;
        Object[] objArrE$6581038f;
        int i10 = f40557v + 85;
        f40559x = i10 % 128;
        int i11 = i10 % 2;
        try {
            Class cls = (Class) bp.a((Process.myPid() >> 22) + 24, 483 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), (char) Color.red(0));
            byte b10 = (byte) 0;
            byte[] bArr = $$a;
            byte b11 = bArr[0];
            Object[] objArr2 = new Object[1];
            A(b10, b11, (byte) (b11 - 2), objArr2);
            long j10 = cls.getField((String) objArr2[0]).getLong(null);
            try {
                if (j10 != -1) {
                    long j11 = j10 + 2039;
                    Object[] objArr3 = new Object[1];
                    B((byte) (6 - (ViewConfiguration.getScrollDefaultDelay() >> 16)), "\t\u0007\u000e\u0005\u000b\u0018\r\u0014\n\t\u0018\u0012\u0000\u0007\u0014\u0015\n\u0003\r\n\u0002\u0017", KeyEvent.getDeadChar(0, 0) + 22, objArr3);
                    Class<?> cls2 = Class.forName((String) objArr3[0]);
                    Object[] objArr4 = new Object[1];
                    B((byte) (15 - MotionEvent.axisFromString("")), "\u0016\n\u0006\r\n\u0000\u000b\u000f\u0017\u0005\u000e\u0016\u0017\u000b㘏", TextUtils.getCapsMode("", 0, 0) + 15, objArr4);
                    if (j11 >= ((Long) cls2.getDeclaredMethod((String) objArr4[0], new Class[0]).invoke(null, new Object[0])).longValue()) {
                        Class cls3 = (Class) bp.a(24 - TextUtils.getOffsetBefore("", 0), (ViewConfiguration.getPressedStateDuration() >> 16) + 483, (char) View.combineMeasuredStates(0, 0));
                        byte length = (byte) bArr.length;
                        Object[] objArr5 = new Object[1];
                        A(b10, length, (byte) (length - 4), objArr5);
                        Object obj = cls3.getField((String) objArr5[0]).get(null);
                        Object[] objArr6 = {-612904573, 0, 11};
                        Map map2 = bp.f40694x;
                        Object method = map2.get(482456668);
                        if (method == null) {
                            Class cls4 = (Class) bp.a(24 - TextUtils.indexOf("", "", 0), (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 482, (char) ((-1) - TextUtils.indexOf((CharSequence) "", '0', 0)));
                            byte b12 = bArr[0];
                            Object[] objArr7 = new Object[1];
                            A(b10, b12, (byte) (b12 - 2), objArr7);
                            String str = (String) objArr7[0];
                            Class<?> cls5 = Integer.TYPE;
                            method = cls4.getMethod(str, cls5, cls5, cls5);
                            map2.put(482456668, method);
                        }
                        Object[] objArr8 = {obj, Integer.valueOf(((Integer) ((Method) method).invoke(null, objArr6)).intValue())};
                        Object method2 = map2.get(1372858038);
                        if (method2 == null) {
                            method2 = ((Class) bp.a((ViewConfiguration.getLongPressTimeout() >> 16) + 24, (ViewConfiguration.getTouchSlop() >> 8) + 1860, (char) TextUtils.indexOf("", ""))).getMethod("b", Object[].class, Integer.TYPE);
                            map2.put(1372858038, method2);
                        }
                        objArrE$6581038f = (Object[]) ((Method) method2).invoke(null, objArr8);
                    } else {
                        Object[] objArr9 = {1763832420};
                        map = bp.f40694x;
                        declaredConstructor = map.get(-604395575);
                        if (declaredConstructor != null) {
                            declaredConstructor = ((Class) bp.a('H' - AndroidCharacter.getMirror('0'), (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 458, (char) TextUtils.getOffsetAfter("", 0))).getDeclaredConstructor(Integer.TYPE);
                            map.put(-604395575, declaredConstructor);
                        }
                        objArrE$6581038f = dr.c.e$6581038f(((Constructor) declaredConstructor).newInstance(objArr9));
                        Class cls6 = (Class) bp.a((SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 23, 484 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), (char) (Process.myPid() >> 22));
                        byte length2 = (byte) bArr.length;
                        Object[] objArr10 = new Object[1];
                        A(b10, length2, (byte) (length2 - 4), objArr10);
                        cls6.getField((String) objArr10[0]).set(null, objArrE$6581038f);
                        try {
                            Object[] objArr11 = new Object[1];
                            B((byte) ((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 5), "\t\u0007\u000e\u0005\u000b\u0018\r\u0014\n\t\u0018\u0012\u0000\u0007\u0014\u0015\n\u0003\r\n\u0002\u0017", (ViewConfiguration.getScrollDefaultDelay() >> 16) + 22, objArr11);
                            Class<?> cls7 = Class.forName((String) objArr11[0]);
                            Object[] objArr12 = new Object[1];
                            B((byte) (16 - KeyEvent.getDeadChar(0, 0)), "\u0016\n\u0006\r\n\u0000\u000b\u000f\u0017\u0005\u000e\u0016\u0017\u000b㘏", TextUtils.lastIndexOf("", '0', 0, 0) + 16, objArr12);
                            Long lValueOf = Long.valueOf(((Long) cls7.getDeclaredMethod((String) objArr12[0], new Class[0]).invoke(null, new Object[0])).longValue());
                            Class cls8 = (Class) bp.a((ViewConfiguration.getFadingEdgeLength() >> 16) + 24, TextUtils.indexOf("", "", 0) + 483, (char) ((-1) - TextUtils.indexOf((CharSequence) "", '0', 0, 0)));
                            byte b13 = bArr[0];
                            Object[] objArr13 = new Object[1];
                            A(b10, b13, (byte) (b13 - 2), objArr13);
                            cls8.getField((String) objArr13[0]).set(null, lValueOf);
                        } catch (Exception unused) {
                            throw new RuntimeException();
                        }
                    }
                } else {
                    Object[] objArr14 = {1763832420};
                    map = bp.f40694x;
                    declaredConstructor = map.get(-604395575);
                    if (declaredConstructor != null) {
                        declaredConstructor = ((Class) bp.a('H' - AndroidCharacter.getMirror('0'), (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 458, (char) TextUtils.getOffsetAfter("", 0))).getDeclaredConstructor(Integer.TYPE);
                        map.put(-604395575, declaredConstructor);
                    }
                    objArrE$6581038f = dr.c.e$6581038f(((Constructor) declaredConstructor).newInstance(objArr14));
                    Class cls9 = (Class) bp.a((SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 23, 484 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), (char) (Process.myPid() >> 22));
                    byte length3 = (byte) bArr.length;
                    Object[] objArr15 = new Object[1];
                    A(b10, length3, (byte) (length3 - 4), objArr15);
                    cls9.getField((String) objArr15[0]).set(null, objArrE$6581038f);
                    Object[] objArr16 = new Object[1];
                    B((byte) ((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 5), "\t\u0007\u000e\u0005\u000b\u0018\r\u0014\n\t\u0018\u0012\u0000\u0007\u0014\u0015\n\u0003\r\n\u0002\u0017", (ViewConfiguration.getScrollDefaultDelay() >> 16) + 22, objArr16);
                    Class<?> cls10 = Class.forName((String) objArr16[0]);
                    Object[] objArr17 = new Object[1];
                    B((byte) (16 - KeyEvent.getDeadChar(0, 0)), "\u0016\n\u0006\r\n\u0000\u000b\u000f\u0017\u0005\u000e\u0016\u0017\u000b㘏", TextUtils.lastIndexOf("", '0', 0, 0) + 16, objArr17);
                    Long lValueOf2 = Long.valueOf(((Long) cls10.getDeclaredMethod((String) objArr17[0], new Class[0]).invoke(null, new Object[0])).longValue());
                    Class cls11 = (Class) bp.a((ViewConfiguration.getFadingEdgeLength() >> 16) + 24, TextUtils.indexOf("", "", 0) + 483, (char) ((-1) - TextUtils.indexOf((CharSequence) "", '0', 0, 0)));
                    byte b14 = bArr[0];
                    Object[] objArr18 = new Object[1];
                    A(b10, b14, (byte) (b14 - 2), objArr18);
                    cls11.getField((String) objArr18[0]).set(null, lValueOf2);
                }
                int i12 = ((int[]) objArrE$6581038f[1])[0];
                int i13 = ((int[]) objArrE$6581038f[0])[0];
                if (i13 == i12) {
                    Object[] objArr19 = {Integer.valueOf(((int[]) objArrE$6581038f[2])[0]), 0, 11};
                    Map map3 = bp.f40694x;
                    Object method3 = map3.get(482456668);
                    if (method3 == null) {
                        Class cls12 = (Class) bp.a(25 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), 483 - (ViewConfiguration.getJumpTapTimeout() >> 16), (char) Drawable.resolveOpacity(0, 0));
                        byte b15 = bArr[0];
                        Object[] objArr20 = new Object[1];
                        A(b10, b15, (byte) (b15 - 2), objArr20);
                        String str2 = (String) objArr20[0];
                        Class<?> cls13 = Integer.TYPE;
                        method3 = cls12.getMethod(str2, cls13, cls13, cls13);
                        map3.put(482456668, method3);
                    }
                    Object[] objArr21 = {objArrE$6581038f, Integer.valueOf(((Integer) ((Method) method3).invoke(null, objArr19)).intValue())};
                    Object method4 = map3.get(1372858038);
                    if (method4 == null) {
                        method4 = ((Class) bp.a(View.resolveSize(0, 0) + 24, 1861 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), (char) (1 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1))))).getMethod("b", Object[].class, Integer.TYPE);
                        map3.put(1372858038, method4);
                    }
                    ((Method) method4).invoke(null, objArr21);
                    int i14 = f40559x + 95;
                    f40557v = i14 % 128;
                    int i15 = i14 % 2;
                    return null;
                }
                long j12 = ((long) (i12 ^ i13)) ^ (-6869230419590512640L);
                int i16 = f40559x;
                int i17 = i16 + 89;
                f40557v = i17 % 128;
                int i18 = i17 % 2;
                int i19 = i16 + 95;
                f40557v = i19 % 128;
                int i20 = i19 % 2;
                try {
                    Object[] objArr22 = {Long.valueOf(j12), -1599367338L};
                    byte[] bArr2 = $$d;
                    byte b16 = bArr2[9];
                    byte b17 = b16;
                    Object[] objArr23 = new Object[1];
                    E(b16, b17, (byte) (b17 - 1), objArr23);
                    Class<?> cls14 = Class.forName((String) objArr23[0]);
                    byte b18 = bArr2[9];
                    byte b19 = (byte) (b18 - 1);
                    Object[] objArr24 = new Object[1];
                    E(b19, b19, b18, objArr24);
                    String str3 = (String) objArr24[0];
                    Class<?> cls15 = Long.TYPE;
                    cls14.getMethod(str3, cls15, cls15).invoke(null, objArr22);
                    Object[] objArr25 = {Integer.valueOf(((int[]) objArrE$6581038f[2])[0]), 0, 11};
                    Map map4 = bp.f40694x;
                    Object method5 = map4.get(482456668);
                    if (method5 == null) {
                        Class cls16 = (Class) bp.a(ExpandableListView.getPackedPositionGroup(0L) + 24, 483 - Drawable.resolveOpacity(0, 0), (char) (ExpandableListView.getPackedPositionChild(0L) + 1));
                        byte b20 = bArr[0];
                        Object[] objArr26 = new Object[1];
                        A(b10, b20, (byte) (b20 - 2), objArr26);
                        String str4 = (String) objArr26[0];
                        Class<?> cls17 = Integer.TYPE;
                        method5 = cls16.getMethod(str4, cls17, cls17, cls17);
                        map4.put(482456668, method5);
                    }
                    Object[] objArr27 = {objArrE$6581038f, Integer.valueOf(((Integer) ((Method) method5).invoke(null, objArr25)).intValue())};
                    Object method6 = map4.get(1372858038);
                    if (method6 == null) {
                        method6 = ((Class) bp.a(24 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), ExpandableListView.getPackedPositionType(0L) + 1860, (char) Gravity.getAbsoluteGravity(0, 0))).getMethod("b", Object[].class, Integer.TYPE);
                        map4.put(1372858038, method6);
                    }
                    ((Method) method6).invoke(null, objArr27);
                    return null;
                } catch (Throwable th2) {
                    Throwable cause = th2.getCause();
                    if (cause != null) {
                        throw cause;
                    }
                    throw th2;
                }
            } catch (Throwable th3) {
                Throwable cause2 = th3.getCause();
                if (cause2 != null) {
                    throw cause2;
                }
                throw th3;
            }
        } catch (Exception unused2) {
            throw new RuntimeException();
        }
    }

    public static void c(FaceTecAuditTrailType faceTecAuditTrailType) {
        int i10 = f40559x;
        int i11 = i10 + 65;
        f40557v = i11 % 128;
        int i12 = i11 % 2;
        if (faceTecAuditTrailType != f40540d) {
            int i13 = i10 + 43;
            f40557v = i13 % 128;
            int i14 = i13 % 2;
            f40540d = faceTecAuditTrailType;
            cx.d(new v4());
        }
        int i15 = f40557v + 43;
        f40559x = i15 % 128;
        int i16 = i15 % 2;
    }

    /* JADX WARN: Code duplicated, block: B:105:0x0264 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:74:0x0257 A[ADDED_TO_REGION] */
    private static /* synthetic */ Object h(Object[] objArr) throws Throwable {
        char c10 = 0;
        di diVar = new di((Context) objArr[0]);
        Object[] objArr2 = new Object[1];
        z((byte) 73, (short) 200, (short) 184, objArr2);
        String str = (String) objArr2[0];
        byte b10 = (byte) 74;
        short s4 = (short) (b10 | 913);
        Object[] objArr3 = new Object[1];
        z(b10, s4, (short) (s4 & 1440), objArr3);
        try {
            Object[] objArr4 = {(String) objArr3[0]};
            byte[] bArr = f40556u;
            char c11 = 16;
            short s7 = (short) 987;
            short s9 = (short) 369;
            Object[] objArr5 = new Object[1];
            z((byte) (-bArr[16]), s7, s9, objArr5);
            Class<?> cls = Class.forName((String) objArr5[0]);
            Object[] objArr6 = new Object[1];
            z(bArr[15], (short) 972, (short) 380, objArr6);
            String str2 = (String) objArr6[0];
            Object[] objArr7 = new Object[1];
            z((byte) (-bArr[16]), s7, s9, objArr7);
            Object[] objArr8 = (Object[]) cls.getMethod(str2, Class.forName((String) objArr7[0])).invoke(str, objArr4);
            int[] iArr = new int[objArr8.length];
            int i10 = 0;
            while (i10 < objArr8.length) {
                Object[] objArr9 = new Object[1];
                objArr9[c10] = objArr8[i10];
                byte[] bArr2 = f40556u;
                short s10 = (short) 968;
                short s11 = (short) 368;
                Object[] objArr10 = new Object[1];
                z((byte) (-bArr2[c11]), s10, s11, objArr10);
                Class<?> cls2 = Class.forName((String) objArr10[c10]);
                byte b11 = bArr2[4];
                Object[] objArr11 = new Object[1];
                z(b11, (short) (b11 | 952), (short) 378, objArr11);
                String str3 = (String) objArr11[0];
                Object[] objArr12 = new Object[1];
                z((byte) (-bArr2[16]), s7, s9, objArr12);
                Object objInvoke = cls2.getMethod(str3, Class.forName((String) objArr12[0])).invoke(null, objArr9);
                c11 = 16;
                Object[] objArr13 = new Object[1];
                z((byte) (-bArr2[16]), s10, s11, objArr13);
                Class<?> cls3 = Class.forName((String) objArr13[0]);
                Object[] objArr14 = new Object[1];
                z((byte) (-bArr2[19]), (short) 946, (short) 377, objArr14);
                iArr[i10] = ((Integer) cls3.getMethod((String) objArr14[0], null).invoke(objInvoke, null)).intValue();
                i10++;
                c10 = 0;
            }
            int i11 = 0;
            while (true) {
                int i12 = i11 + 1;
                try {
                    switch (diVar.b(iArr[i11])) {
                        case -24:
                            i11 = 58;
                            break;
                        case -23:
                            diVar.b(31);
                            int i13 = diVar.f41202b;
                            i12 = 41;
                            i11 = (i13 == 4 || i13 != 39) ? i12 : 1;
                            break;
                        case -22:
                            diVar.f41205e = 1;
                            diVar.b(2);
                            diVar.b(5);
                            diVar.f41205e = diVar.f41209i.hashCode();
                            diVar.b(6);
                            break;
                        case -21:
                            diVar.f41208h = new z4();
                            diVar.b(4);
                            break;
                        case -20:
                            try {
                                diVar.f41208h = new a5(0);
                                diVar.b(4);
                            } catch (Throwable th2) {
                                th = th2;
                                if (i12 >= 54) {
                                }
                                throw th;
                            }
                            break;
                        case -19:
                            diVar.b(44);
                            throw ((Throwable) diVar.f41209i);
                        case -18:
                            i11 = 59;
                            break;
                        case -17:
                            i11 = 61;
                            break;
                        case -16:
                            diVar.b(7);
                            if (diVar.f41202b == 0) {
                                i11 = 39;
                            }
                            break;
                        case -15:
                            i11 = 18;
                            break;
                        case -14:
                            i11 = 29;
                            break;
                        case -13:
                            diVar.b(7);
                            if (diVar.f41202b == 0) {
                                i11 = 28;
                            }
                            break;
                        case -12:
                            diVar.f41205e = 1;
                            diVar.b(2);
                            diVar.b(3);
                            f40559x = diVar.f41202b;
                            break;
                        case -11:
                            try {
                                diVar.f41205e = f40557v;
                                diVar.b(6);
                            } catch (Throwable th3) {
                                th = th3;
                                if (i12 >= 54 || i12 > 58) {
                                    throw th;
                                }
                                diVar.f41208h = th;
                                diVar.b(48);
                                i11 = 40;
                            }
                            break;
                        case -10:
                            return null;
                        case -9:
                            i11 = 30;
                            break;
                        case -8:
                            i11 = 20;
                            break;
                        case -7:
                            diVar.f41208h = new z4();
                            diVar.b(4);
                            break;
                        case -6:
                            diVar.f41205e = 1;
                            diVar.b(2);
                            diVar.b(5);
                            diVar.f41208h = cx.d((Runnable) diVar.f41209i);
                            diVar.b(4);
                            break;
                        case -5:
                            diVar.f41208h = new y4();
                            diVar.b(4);
                            break;
                        case -4:
                            diVar.f41205e = 1;
                            diVar.b(2);
                            diVar.b(5);
                            Object[] objArr15 = new Object[1];
                            try {
                                objArr15[0] = (Context) diVar.f41209i;
                                diVar.f41208h = (SharedPreferences) a(objArr15, 1435759663, -1435759656, (int) System.currentTimeMillis());
                                diVar.b(4);
                            } catch (Throwable th4) {
                                th = th4;
                                if (i12 >= 54) {
                                }
                                throw th;
                            }
                            break;
                        case -3:
                            diVar.f41205e = 1;
                            diVar.b(2);
                            diVar.b(5);
                            as.d((Context) diVar.f41209i);
                            break;
                        case -2:
                            diVar.f41205e = 1;
                            diVar.b(2);
                            diVar.b(5);
                            bs.e((Context) diVar.f41209i);
                            break;
                        case -1:
                            i11 = 15;
                            break;
                        default:
                            break;
                    }
                } catch (Throwable th5) {
                    th = th5;
                }
            }
        } catch (Throwable th6) {
            Throwable cause = th6.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th6;
        }
    }

    @NonNull
    public static FaceTecSDKStatus b(@NonNull Context context) {
        return (FaceTecSDKStatus) a(new Object[]{context}, 643267213, -643267207, (int) System.currentTimeMillis());
    }

    /* JADX WARN: Code duplicated, block: B:133:0x03e8 A[PHI: r3 r13
      0x03e8: PHI (r3v7 int) = (r3v6 int), (r3v6 int), (r3v5 int), (r3v5 int), (r3v5 int), (r3v5 int), (r3v5 int), (r3v5 int), (r3v5 int), (r3v5 int) binds: [B:141:0x041c, B:142:0x041e, B:135:0x03f8, B:132:0x03d5, B:123:0x0385, B:121:0x0363, B:120:0x035e, B:114:0x0345, B:105:0x030c, B:17:0x0149] A[DONT_GENERATE, DONT_INLINE]
      0x03e8: PHI (r13v32 short) = 
      (r13v9 short)
      (r13v9 short)
      (r13v11 short)
      (r13v12 short)
      (r13v18 short)
      (r13v19 short)
      (r16v1 short)
      (r13v23 short)
      (r13v25 short)
      (r13v33 short)
     binds: [B:141:0x041c, B:142:0x041e, B:135:0x03f8, B:132:0x03d5, B:123:0x0385, B:121:0x0363, B:120:0x035e, B:114:0x0345, B:105:0x030c, B:17:0x0149] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:148:0x0434  */
    /* JADX WARN: Code duplicated, block: B:194:0x0440 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    private static void b(@NonNull Context context, String str, String str2, @Nullable FaceTecSDK.InitializeCallback initializeCallback) throws Throwable {
        int i10;
        int i11;
        int i12;
        di diVar = new di(context, str, str2, initializeCallback);
        Object[] objArr = new Object[1];
        z((byte) 73, (short) 454, (short) 150, objArr);
        char c10 = 0;
        String str3 = (String) objArr[0];
        byte b10 = (byte) 74;
        short s4 = (short) (b10 | 913);
        Object[] objArr2 = new Object[1];
        z(b10, s4, (short) (s4 & 1440), objArr2);
        try {
            Object[] objArr3 = {(String) objArr2[0]};
            byte[] bArr = f40556u;
            char c11 = 16;
            short s7 = (short) 987;
            short s9 = (short) 369;
            Object[] objArr4 = new Object[1];
            z((byte) (-bArr[16]), s7, s9, objArr4);
            Class<?> cls = Class.forName((String) objArr4[0]);
            short s10 = (short) 380;
            Object[] objArr5 = new Object[1];
            z(bArr[15], (short) 972, s10, objArr5);
            String str4 = (String) objArr5[0];
            Object[] objArr6 = new Object[1];
            z((byte) (-bArr[16]), s7, s9, objArr6);
            Object[] objArr7 = (Object[]) cls.getMethod(str4, Class.forName((String) objArr6[0])).invoke(str3, objArr3);
            int[] iArr = new int[objArr7.length];
            int i13 = 0;
            while (true) {
                i10 = 368;
                if (i13 >= objArr7.length) {
                    break;
                }
                Object[] objArr8 = new Object[1];
                objArr8[c10] = objArr7[i13];
                byte[] bArr2 = f40556u;
                byte b11 = (byte) (-bArr2[c11]);
                short s11 = (short) 968;
                short s12 = (short) 368;
                Object[] objArr9 = new Object[1];
                z(b11, s11, s12, objArr9);
                Class<?> cls2 = Class.forName((String) objArr9[c10]);
                byte b12 = bArr2[4];
                Object[] objArr10 = objArr7;
                short s13 = s10;
                Object[] objArr11 = new Object[1];
                z(b12, (short) (b12 | 952), (short) 378, objArr11);
                String str5 = (String) objArr11[0];
                Object[] objArr12 = new Object[1];
                z((byte) (-bArr2[16]), s7, s9, objArr12);
                Object objInvoke = cls2.getMethod(str5, Class.forName((String) objArr12[0])).invoke(null, objArr8);
                Object[] objArr13 = new Object[1];
                z((byte) (-bArr2[16]), s11, s12, objArr13);
                Class<?> cls3 = Class.forName((String) objArr13[0]);
                Object[] objArr14 = new Object[1];
                z((byte) (-bArr2[19]), (short) 946, (short) 377, objArr14);
                iArr[i13] = ((Integer) cls3.getMethod((String) objArr14[0], null).invoke(objInvoke, null)).intValue();
                i13++;
                objArr7 = objArr10;
                s10 = s13;
                c10 = 0;
                c11 = 16;
            }
            short s14 = s10;
            int i14 = 0;
            while (true) {
                int i15 = i14 + 1;
                try {
                    switch (diVar.b(iArr[i14])) {
                        case -33:
                            i14 = 65;
                            i10 = 368;
                            break;
                        case -32:
                            s14 = s14;
                            diVar.b(31);
                            int i16 = diVar.f41202b;
                            i15 = 49;
                            if (i16 == 0 || i16 != 1) {
                                i14 = i15;
                            } else {
                                i14 = 36;
                            }
                            s14 = s14;
                            i10 = 368;
                            break;
                        case -31:
                            i14 = 1;
                            break;
                        case -30:
                            i14 = 64;
                            i10 = 368;
                            break;
                        case -29:
                            s14 = s14;
                            diVar.b(26);
                            if (diVar.f41202b == 0) {
                                i14 = 63;
                            } else {
                                i14 = i15;
                            }
                            s14 = s14;
                            i10 = 368;
                            break;
                        case -28:
                            s14 = s14;
                            diVar.f41205e = 1;
                            diVar.b(2);
                            diVar.b(3);
                            f40557v = diVar.f41202b;
                            i14 = i15;
                            s14 = s14;
                            i10 = 368;
                            break;
                        case -27:
                            diVar.f41205e = f40559x;
                            diVar.b(6);
                            i14 = i15;
                            s14 = s14;
                            i10 = 368;
                            break;
                        case -26:
                            diVar.f41205e = 1;
                            diVar.b(2);
                            diVar.b(5);
                            diVar.f41205e = diVar.f41209i.hashCode();
                            diVar.b(6);
                            i14 = i15;
                            s14 = s14;
                            i10 = 368;
                            break;
                        case -25:
                            s14 = s14;
                            diVar.b(44);
                            throw ((Throwable) diVar.f41209i);
                        case -24:
                            i14 = 66;
                            i10 = 368;
                            break;
                        case -23:
                            i14 = 68;
                            i10 = 368;
                            break;
                        case -22:
                            s14 = s14;
                            diVar.b(7);
                            if (diVar.f41202b == 0) {
                                i14 = 47;
                            } else {
                                i14 = i15;
                            }
                            s14 = s14;
                            i10 = 368;
                            break;
                        case -21:
                            s14 = s14;
                            diVar.f41205e = 1;
                            diVar.b(2);
                            diVar.b(3);
                            f40559x = diVar.f41202b;
                            i14 = i15;
                            s14 = s14;
                            i10 = 368;
                            break;
                        case -20:
                            diVar.f41205e = f40557v;
                            diVar.b(6);
                            i14 = i15;
                            s14 = s14;
                            i10 = 368;
                            break;
                        case -19:
                            i14 = 54;
                            break;
                        case -18:
                            return;
                        case -17:
                            s14 = s14;
                            diVar.f41208h = c.REJECTED;
                            try {
                                diVar.b(4);
                                i14 = i15;
                            } catch (Throwable th2) {
                                th = th2;
                                if (i15 >= 50) {
                                }
                                throw th;
                            }
                            s14 = s14;
                            i10 = 368;
                            break;
                        case -16:
                            i14 = 38;
                            i10 = 368;
                            break;
                        case -15:
                            s14 = s14;
                            try {
                                diVar.f41205e = 3;
                                diVar.b(2);
                                diVar.b(5);
                                Context context2 = (Context) diVar.f41209i;
                                diVar.b(5);
                                FaceTecSDK.InitializeCallback initializeCallback2 = (FaceTecSDK.InitializeCallback) diVar.f41209i;
                                diVar.b(3);
                                boolean z10 = diVar.f41202b != 0;
                                Object[] objArr15 = new Object[3];
                                try {
                                    objArr15[0] = context2;
                                    objArr15[1] = initializeCallback2;
                                    objArr15[2] = Boolean.valueOf(z10);
                                    a(objArr15, -1564157998, 1564158002, (int) System.currentTimeMillis());
                                    i14 = i15;
                                } catch (Throwable th3) {
                                    th = th3;
                                    if (i15 >= 50 || i15 > 54) {
                                        throw th;
                                    }
                                    diVar.f41208h = th;
                                    diVar.b(48);
                                    i14 = 48;
                                }
                            } catch (Throwable th4) {
                                th = th4;
                            }
                            s14 = s14;
                            i10 = 368;
                            break;
                        case -14:
                            s14 = s14;
                            diVar.f41205e = 2;
                            diVar.b(2);
                            diVar.b(5);
                            Context context3 = (Context) diVar.f41209i;
                            diVar.b(5);
                            d.a(context3, (d.c) diVar.f41209i);
                            i14 = i15;
                            s14 = s14;
                            i10 = 368;
                            break;
                        case -13:
                            s14 = s14;
                            diVar.f41205e = 2;
                            diVar.b(2);
                            diVar.b(5);
                            d.c cVar = (d.c) diVar.f41209i;
                            diVar.b(5);
                            cVar.f41113b = (Boolean) diVar.f41209i;
                            i14 = i15;
                            s14 = s14;
                            i10 = 368;
                            break;
                        case -12:
                            try {
                                try {
                                    byte b13 = (byte) (-f40556u[16]);
                                    Object[] objArr16 = new Object[1];
                                    z(b13, (short) (b13 | 208), (short) i10, objArr16);
                                    boolean z11 = false;
                                    try {
                                        Class<?> cls4 = Class.forName((String) objArr16[0]);
                                        Object[] objArr17 = new Object[1];
                                        s14 = s14;
                                        try {
                                            z((byte) 48, (short) 204, s14, objArr17);
                                            z11 = false;
                                            try {
                                                try {
                                                    diVar.f41208h = cls4.getField((String) objArr17[0]).get(null);
                                                    try {
                                                        diVar.b(4);
                                                        i14 = i15;
                                                    } catch (Throwable th5) {
                                                        th = th5;
                                                        if (i15 >= 50) {
                                                        }
                                                        throw th;
                                                    }
                                                } catch (Throwable th6) {
                                                    th = th6;
                                                    if (i15 >= 50) {
                                                    }
                                                    throw th;
                                                }
                                            } catch (Throwable th7) {
                                                th = th7;
                                                if (i15 >= 50) {
                                                }
                                                throw th;
                                            }
                                        } catch (Throwable th8) {
                                            th = th8;
                                            if (i15 >= 50) {
                                            }
                                            throw th;
                                        }
                                    } catch (Throwable th9) {
                                        th = th9;
                                        s14 = s14;
                                    }
                                } catch (Throwable th10) {
                                    th = th10;
                                    s14 = s14;
                                }
                            } catch (Throwable th11) {
                                th = th11;
                                s14 = s14;
                            }
                            s14 = s14;
                            i10 = 368;
                            break;
                        case -11:
                            diVar.f41208h = new d.c();
                            i11 = 4;
                            try {
                                diVar.b(i11);
                                s14 = s14;
                                i14 = i15;
                            } catch (Throwable th12) {
                                th = th12;
                                if (i15 >= 50) {
                                }
                                throw th;
                            }
                            s14 = s14;
                            i10 = 368;
                            break;
                        case -10:
                            diVar.f41205e = 1;
                            diVar.b(2);
                            diVar.b(5);
                            f40545i = (c) diVar.f41209i;
                            s14 = s14;
                            i14 = i15;
                            s14 = s14;
                            i10 = 368;
                            break;
                        case -9:
                            diVar.f41208h = c.VALIDATED;
                            i11 = 4;
                            diVar.b(i11);
                            s14 = s14;
                            i14 = i15;
                            s14 = s14;
                            i10 = 368;
                            break;
                        case -8:
                            i14 = 27;
                            break;
                        case -7:
                            i14 = 13;
                            break;
                        case -6:
                            diVar.b(9);
                            i14 = diVar.f41202b == 0 ? 12 : i15;
                            break;
                        case -5:
                            diVar.f41208h = bwL26042$e.VALIDATED;
                            i11 = 4;
                            diVar.b(i11);
                            s14 = s14;
                            i14 = i15;
                            s14 = s14;
                            i10 = 368;
                            break;
                        case -4:
                            diVar.f41205e = 3;
                            diVar.b(2);
                            diVar.b(5);
                            Context context4 = (Context) diVar.f41209i;
                            diVar.b(5);
                            String str6 = (String) diVar.f41209i;
                            diVar.b(5);
                            try {
                                Object[] objArr18 = {context4, str6, (String) diVar.f41209i};
                                Map map = bp.f40694x;
                                Object declaredMethod = map.get(563543633);
                                if (declaredMethod == null) {
                                    declaredMethod = ((Class) bp.a(24 - TextUtils.getTrimmedLength(""), (ViewConfiguration.getWindowTouchSlop() >> 8) + 78, (char) Color.argb(0, 0, 0, 0))).getDeclaredMethod("b", Context.class, String.class, String.class);
                                    map.put(563543633, declaredMethod);
                                }
                                diVar.f41208h = ((Method) declaredMethod).invoke(null, objArr18);
                                i11 = 4;
                                diVar.b(i11);
                                s14 = s14;
                                i14 = i15;
                                s14 = s14;
                                i10 = 368;
                            } catch (Throwable th13) {
                                Throwable cause = th13.getCause();
                                if (cause == null) {
                                    throw th13;
                                }
                                throw cause;
                            }
                            break;
                        case -3:
                            diVar.f41205e = 1;
                            diVar.b(2);
                            diVar.b(5);
                            diVar.f41208h = d((Context) diVar.f41209i);
                            i12 = 4;
                            try {
                                diVar.b(i12);
                                s14 = s14;
                                i14 = i15;
                            } catch (Throwable th14) {
                                th = th14;
                                if (i15 >= 50) {
                                }
                                throw th;
                            }
                            s14 = s14;
                            i10 = 368;
                            break;
                        case -2:
                            diVar.f41205e = 2;
                            diVar.b(2);
                            diVar.b(5);
                            Context context5 = (Context) diVar.f41209i;
                            diVar.b(3);
                            diVar.f41208h = b(context5, diVar.f41202b != 0);
                            i12 = 4;
                            diVar.b(i12);
                            s14 = s14;
                            i14 = i15;
                            s14 = s14;
                            i10 = 368;
                            break;
                        case -1:
                            i14 = 32;
                            break;
                        default:
                            s14 = s14;
                            i14 = i15;
                            s14 = s14;
                            i10 = 368;
                            break;
                    }
                } catch (Throwable th15) {
                    th = th15;
                    if (i15 >= 50) {
                    }
                    throw th;
                }
            }
        } catch (Throwable th16) {
            Throwable cause2 = th16.getCause();
            if (cause2 == null) {
                throw th16;
            }
            throw cause2;
        }
    }

    public static void i() {
        int i10 = f40559x + 99;
        f40557v = i10 % 128;
        if (i10 % 2 == 0) {
            aw.c("***********************************************************************************************************************************");
            aw.c("* WARNING: You are using DEVELOPMENT-ONLY Keys. *");
            aw.c("* Development Keys should only be used while you are familiarizing yourself with Device SDK functionality or if you do not yet have a commercial agreement with FaceTec. *");
            aw.c("* This Key IS NOT supported for Production Environments. *");
            aw.c("* If you have a commercial agreement with FaceTec, you should be using Production SDK Encryption Keys, even if you are still Developing your Application. *");
            aw.c("* Please use initializeInProductionMode if you are deploying this for use in a Real App with Real Users. *");
            aw.c("* Please review https://dev.facetec.com/keys#key-types *");
            aw.c("***********************************************************************************************************************************");
            int i11 = 3 / 0;
        } else {
            aw.c("***********************************************************************************************************************************");
            aw.c("* WARNING: You are using DEVELOPMENT-ONLY Keys. *");
            aw.c("* Development Keys should only be used while you are familiarizing yourself with Device SDK functionality or if you do not yet have a commercial agreement with FaceTec. *");
            aw.c("* This Key IS NOT supported for Production Environments. *");
            aw.c("* If you have a commercial agreement with FaceTec, you should be using Production SDK Encryption Keys, even if you are still Developing your Application. *");
            aw.c("* Please use initializeInProductionMode if you are deploying this for use in a Real App with Real Users. *");
            aw.c("* Please review https://dev.facetec.com/keys#key-types *");
            aw.c("***********************************************************************************************************************************");
        }
        int i12 = f40557v + 51;
        f40559x = i12 % 128;
        int i13 = i12 % 2;
    }

    public static void b(@NonNull Context context, String str, String str2, @Nullable String str3, @Nullable FaceTecSDK.InitializeCallback initializeCallback) throws Throwable {
        int i10;
        di diVar = new di(context, str, str2, str3, initializeCallback);
        int i11 = 1;
        Object[] objArr = new Object[1];
        z((byte) 73, (short) 917, (short) 56, objArr);
        char c10 = 0;
        String str4 = (String) objArr[0];
        byte b10 = (byte) 74;
        short s4 = (short) (b10 | 913);
        Object[] objArr2 = new Object[1];
        z(b10, s4, (short) (s4 & 1440), objArr2);
        try {
            Object[] objArr3 = {(String) objArr2[0]};
            byte[] bArr = f40556u;
            char c11 = 16;
            short s7 = (short) 987;
            short s9 = (short) 369;
            Object[] objArr4 = new Object[1];
            z((byte) (-bArr[16]), s7, s9, objArr4);
            Class<?> cls = Class.forName((String) objArr4[0]);
            Object[] objArr5 = new Object[1];
            z(bArr[15], (short) 972, (short) 380, objArr5);
            String str5 = (String) objArr5[0];
            Object[] objArr6 = new Object[1];
            z((byte) (-bArr[16]), s7, s9, objArr6);
            Object[] objArr7 = (Object[]) cls.getMethod(str5, Class.forName((String) objArr6[0])).invoke(str4, objArr3);
            int[] iArr = new int[objArr7.length];
            int i12 = 0;
            while (i12 < objArr7.length) {
                Object[] objArr8 = new Object[1];
                objArr8[c10] = objArr7[i12];
                byte[] bArr2 = f40556u;
                short s10 = (short) 968;
                short s11 = (short) 368;
                Object[] objArr9 = new Object[1];
                z((byte) (-bArr2[c11]), s10, s11, objArr9);
                Class<?> cls2 = Class.forName((String) objArr9[c10]);
                byte b11 = bArr2[4];
                Object[] objArr10 = new Object[1];
                z(b11, (short) (b11 | 952), (short) 378, objArr10);
                String str6 = (String) objArr10[0];
                Object[] objArr11 = new Object[1];
                z((byte) (-bArr2[16]), s7, s9, objArr11);
                Object objInvoke = cls2.getMethod(str6, Class.forName((String) objArr11[0])).invoke(null, objArr8);
                Object[] objArr12 = new Object[1];
                z((byte) (-bArr2[16]), s10, s11, objArr12);
                Class<?> cls3 = Class.forName((String) objArr12[0]);
                Object[] objArr13 = new Object[1];
                z((byte) (-bArr2[19]), (short) 946, (short) 377, objArr13);
                iArr[i12] = ((Integer) cls3.getMethod((String) objArr13[0], null).invoke(objInvoke, null)).intValue();
                i12++;
                c11 = 16;
                c10 = 0;
            }
            int i13 = 0;
            while (true) {
                int i14 = i13 + 1;
                try {
                    int iB = diVar.b(iArr[i13]);
                    i13 = 31;
                    switch (iB) {
                        case -44:
                            i13 = 93;
                            break;
                        case -43:
                            diVar.b(31);
                            int i15 = diVar.f41202b;
                            i14 = 8;
                            if (i15 != 0 && i15 == 1) {
                                i10 = 11;
                                i13 = i10;
                            }
                            break;
                        case -42:
                            i13 = 88;
                            break;
                        case -41:
                            diVar.b(31);
                            int i16 = diVar.f41202b;
                            i13 = (i16 == 0 || i16 != 1) ? 19 : 15;
                            break;
                        case -40:
                            i13 = 83;
                            break;
                        case -39:
                            diVar.b(31);
                            if (diVar.f41202b != 60) {
                                i13 = 73;
                            }
                            break;
                        case -38:
                            diVar.f41205e = 1;
                            diVar.b(2);
                            diVar.b(5);
                            diVar.f41205e = diVar.f41209i.hashCode();
                            diVar.b(6);
                            break;
                        case -37:
                            diVar.f41205e = 5;
                            diVar.b(2);
                            diVar.b(5);
                            String str7 = (String) diVar.f41209i;
                            diVar.b(5);
                            Context context2 = (Context) diVar.f41209i;
                            diVar.b(5);
                            FaceTecSDK.InitializeCallback initializeCallback2 = (FaceTecSDK.InitializeCallback) diVar.f41209i;
                            diVar.b(5);
                            String str8 = (String) diVar.f41209i;
                            diVar.b(5);
                            diVar.f41208h = new t4(str7, context2, initializeCallback2, str8, (String) diVar.f41209i);
                            diVar.b(4);
                            break;
                        case -36:
                            diVar.b(44);
                            throw ((Throwable) diVar.f41209i);
                        case -35:
                            i13 = 84;
                            break;
                        case -34:
                            i13 = 86;
                            break;
                        case -33:
                            diVar.b(7);
                            if (diVar.f41202b == 0) {
                                i10 = 71;
                                i13 = i10;
                            }
                            break;
                        case -32:
                            diVar.f41205e = 1;
                            diVar.b(2);
                            diVar.b(3);
                            f40559x = diVar.f41202b;
                            break;
                        case -31:
                            diVar.f41205e = f40557v;
                            diVar.b(6);
                            break;
                        case -30:
                            i13 = 1;
                            break;
                        case -29:
                            i13 = 62;
                            break;
                        case -28:
                            diVar.b(26);
                            if (diVar.f41202b == 0) {
                                i10 = 61;
                                i13 = i10;
                            }
                            break;
                        case -27:
                            diVar.f41205e = 1;
                            diVar.b(2);
                            diVar.b(3);
                            f40557v = diVar.f41202b;
                            break;
                        case -26:
                            diVar.f41205e = f40559x;
                            diVar.b(6);
                            break;
                        case -25:
                            i13 = 53;
                            break;
                        case -24:
                            diVar.f41205e = 1;
                            diVar.b(2);
                            diVar.b(5);
                            diVar.f41208h = new h3((Context) diVar.f41209i, i11);
                            diVar.b(4);
                            break;
                        case -23:
                            i13 = 40;
                            break;
                        case -22:
                            i13 = 50;
                            break;
                        case -21:
                            diVar.f41205e = 1;
                            diVar.b(2);
                            diVar.b(5);
                            diVar.f41208h = cx.d((Runnable) diVar.f41209i);
                            diVar.b(4);
                            break;
                        case -20:
                            diVar.f41205e = 5;
                            diVar.b(2);
                            diVar.b(5);
                            final String str9 = (String) diVar.f41209i;
                            diVar.b(5);
                            final Context context3 = (Context) diVar.f41209i;
                            diVar.b(5);
                            final FaceTecSDK.InitializeCallback initializeCallback3 = (FaceTecSDK.InitializeCallback) diVar.f41209i;
                            diVar.b(5);
                            final String str10 = (String) diVar.f41209i;
                            diVar.b(5);
                            final String str11 = (String) diVar.f41209i;
                            diVar.f41208h = new Runnable() { // from class: com.facetec.sdk.s4
                                @Override // java.lang.Runnable
                                public final void run() throws Throwable {
                                    bg.e(str9, context3, initializeCallback3, str10, str11);
                                }
                            };
                            diVar.b(4);
                            break;
                        case -19:
                            i13 = 37;
                            break;
                        case -18:
                            i13 = 63;
                            break;
                        case -17:
                            diVar.b(7);
                            if (diVar.f41202b == 0) {
                                i10 = 30;
                                i13 = i10;
                            }
                            break;
                        case -16:
                            diVar.f41205e = 1;
                            diVar.b(2);
                            diVar.b(5);
                            diVar.f41205e = i((Context) diVar.f41209i) ? 1 : 0;
                            diVar.b(6);
                            break;
                        case -15:
                            diVar.f41205e = 1;
                            diVar.b(2);
                            diVar.b(3);
                            m = diVar.f41202b != 0;
                            break;
                        case -14:
                            diVar.f41205e = 1;
                            diVar.b(2);
                            diVar.b(5);
                            f40537a = (String) diVar.f41209i;
                            break;
                        case -13:
                            diVar.f41205e = 2;
                            diVar.b(2);
                            diVar.b(5);
                            Context context4 = (Context) diVar.f41209i;
                            diVar.b(3);
                            d(context4, diVar.f41202b != 0);
                            break;
                        case -12:
                            i13 = 89;
                            break;
                        case -11:
                            i13 = 91;
                            break;
                        case -10:
                            diVar.b(13);
                            if (diVar.f41202b == 0) {
                                i10 = 14;
                                i13 = i10;
                            }
                            break;
                        case -9:
                            return;
                        case -8:
                            diVar.f41205e = 3;
                            diVar.b(2);
                            diVar.b(5);
                            Context context5 = (Context) diVar.f41209i;
                            diVar.b(5);
                            FaceTecSDK.InitializeCallback initializeCallback4 = (FaceTecSDK.InitializeCallback) diVar.f41209i;
                            diVar.b(3);
                            boolean z10 = diVar.f41202b != 0;
                            Object[] objArr14 = new Object[3];
                            try {
                                objArr14[0] = context5;
                                objArr14[1] = initializeCallback4;
                                objArr14[2] = Boolean.valueOf(z10);
                                a(objArr14, -1564157998, 1564158002, (int) System.currentTimeMillis());
                            } catch (Throwable th2) {
                                th = th2;
                                if (i14 < 79 || i14 > 83) {
                                    throw th;
                                }
                                diVar.f41208h = th;
                                diVar.b(48);
                                i13 = 72;
                            }
                            break;
                        case -7:
                            i13 = 94;
                            break;
                        case -6:
                            i13 = 96;
                            break;
                        case -5:
                            diVar.b(9);
                            i13 = diVar.f41202b == 0 ? 7 : i14;
                            break;
                        case -4:
                            diVar.f41208h = c.VALIDATED;
                            diVar.b(4);
                            break;
                        case -3:
                            diVar.f41208h = f40545i;
                            diVar.b(4);
                            break;
                        case -2:
                            diVar.f41205e = 1;
                            diVar.b(2);
                            diVar.b(3);
                            f40550o = diVar.f41202b != 0;
                            break;
                        case -1:
                            i13 = 45;
                            break;
                        default:
                            break;
                    }
                } catch (Throwable th3) {
                    th = th3;
                }
            }
        } catch (Throwable th4) {
            Throwable cause = th4.getCause();
            if (cause == null) {
                throw th4;
            }
            throw cause;
        }
    }

    public static void d(Context context, boolean z10) {
        int i10 = f40557v;
        int i11 = i10 + 81;
        f40559x = i11 % 128;
        int i12 = 2;
        int i13 = i11 % 2;
        int i14 = 0;
        if (z10) {
            int i15 = i10 + 55;
            f40559x = i15 % 128;
            if (i15 % 2 == 0) {
                cx.b(new u4(context, i14));
            } else {
                cx.b(new z0(context, i12));
                throw null;
            }
        }
        cx.d(new k3(context, 1));
        int i16 = f40557v + 55;
        f40559x = i16 % 128;
        if (i16 % 2 != 0) {
            int i17 = 34 / 0;
        }
    }

    public static boolean e(Context context) {
        int i10 = f40557v + 33;
        f40559x = i10 % 128;
        int i11 = i10 % 2;
        boolean zH = bs.h(context);
        int i12 = f40559x + 89;
        f40557v = i12 % 128;
        int i13 = i12 % 2;
        return zH;
    }

    private static /* synthetic */ Object e(Object[] objArr) throws Exception {
        Context context = (Context) objArr[0];
        int i10 = f40557v + 33;
        f40559x = i10 % 128;
        int i11 = i10 % 2;
        byte[] bArrC = d.c(context);
        Object[] objArr2 = new Object[1];
        C((char) (KeyEvent.getDeadChar(0, 0) + 15469), Color.green(0), TextUtils.indexOf("", "", 0) + 20, objArr2);
        String string = UUID.nameUUIDFromBytes(bi.c(bArrC, ((String) objArr2[0]).intern())).toString();
        int i12 = f40557v + 115;
        f40559x = i12 % 128;
        if (i12 % 2 == 0) {
            return string;
        }
        throw null;
    }

    @Nullable
    public static synchronized String d(@Nullable Context context) {
        try {
            int i10 = f40557v + 9;
            int i11 = i10 % 128;
            f40559x = i11;
            if (i10 % 2 == 0) {
                if (f40544h == null && context != null) {
                    int i12 = i11 + 81;
                    f40557v = i12 % 128;
                    int i13 = i12 % 2;
                    f40544h = context.getPackageName();
                }
            } else {
                throw null;
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return f40544h;
    }

    private static boolean e(String str) {
        int i10 = f40557v + 15;
        f40559x = i10 % 128;
        int i11 = i10 % 2;
        if (str != null) {
            try {
                f40548l = str.trim();
                return true;
            } catch (Exception unused) {
            }
        }
        int i12 = f40557v + 55;
        f40559x = i12 % 128;
        if (i12 % 2 == 0) {
            return false;
        }
        throw null;
    }

    public static void j() {
        if (!f40549n) {
            int i10 = f40557v + 113;
            f40559x = i10 % 128;
            int i11 = i10 % 2;
            return;
        }
        aw.c("***********************************************************************************************************************************");
        aw.c("* FaceTec SDK Code Integration PROBLEM Detected.                                                                                  *");
        aw.c("* Your App Code is creating a new FaceTecSession in the Initialization Completion Callback.                                       *");
        aw.c("* This will cause User Experience Issues and is not recommended. Please see the FaceTec Developer Documentation for more details. *");
        aw.c("***********************************************************************************************************************************");
        int i12 = f40559x + 33;
        f40557v = i12 % 128;
        if (i12 % 2 == 0) {
            int i13 = 75 / 0;
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:14:0x012e. Please report as an issue. */
    private static /* synthetic */ Object d(Object[] objArr) throws Throwable {
        int i10;
        int i11;
        di diVar = new di();
        byte[] bArr = f40556u;
        char c10 = 4;
        short s4 = bArr[4];
        Object[] objArr2 = new Object[1];
        z((byte) 73, s4, (short) (s4 | 250), objArr2);
        int i12 = 0;
        String str = (String) objArr2[0];
        byte b10 = (byte) 74;
        short s7 = (short) (b10 | 913);
        Object[] objArr3 = new Object[1];
        z(b10, s7, (short) (s7 & 1440), objArr3);
        try {
            Object[] objArr4 = {(String) objArr3[0]};
            char c11 = 16;
            short s9 = (short) 987;
            short s10 = (short) 369;
            Object[] objArr5 = new Object[1];
            z((byte) (-bArr[16]), s9, s10, objArr5);
            Class<?> cls = Class.forName((String) objArr5[0]);
            Object[] objArr6 = new Object[1];
            z(bArr[15], (short) 972, (short) 380, objArr6);
            String str2 = (String) objArr6[0];
            Object[] objArr7 = new Object[1];
            z((byte) (-bArr[16]), s9, s10, objArr7);
            Object[] objArr8 = (Object[]) cls.getMethod(str2, Class.forName((String) objArr7[0])).invoke(str, objArr4);
            int[] iArr = new int[objArr8.length];
            int i13 = 0;
            while (i13 < objArr8.length) {
                Object[] objArr9 = new Object[1];
                objArr9[i12] = objArr8[i13];
                byte[] bArr2 = f40556u;
                short s11 = (short) 968;
                short s12 = (short) 368;
                Object[] objArr10 = new Object[1];
                z((byte) (-bArr2[c11]), s11, s12, objArr10);
                Class<?> cls2 = Class.forName((String) objArr10[i12]);
                byte b11 = bArr2[c10];
                Object[] objArr11 = new Object[1];
                z(b11, (short) (b11 | 952), (short) 378, objArr11);
                String str3 = (String) objArr11[0];
                Object[] objArr12 = new Object[1];
                z((byte) (-bArr2[16]), s9, s10, objArr12);
                Object objInvoke = cls2.getMethod(str3, Class.forName((String) objArr12[0])).invoke(null, objArr9);
                Object[] objArr13 = new Object[1];
                z((byte) (-bArr2[16]), s11, s12, objArr13);
                Class<?> cls3 = Class.forName((String) objArr13[0]);
                Object[] objArr14 = new Object[1];
                z((byte) (-bArr2[19]), (short) 946, (short) 377, objArr14);
                iArr[i13] = ((Integer) cls3.getMethod((String) objArr14[0], null).invoke(objInvoke, null)).intValue();
                i13++;
                c11 = 16;
                i12 = 0;
                c10 = 4;
            }
            while (true) {
                int i14 = i12 + 1;
                switch (diVar.b(iArr[i12])) {
                    case -23:
                        i14 = 17;
                        break;
                    case -22:
                        i14 = 39;
                        break;
                    case -21:
                        diVar.b(26);
                        if (diVar.f41202b == 0) {
                            i14 = 38;
                        }
                        break;
                    case -20:
                        diVar.f41205e = 1;
                        diVar.b(2);
                        diVar.b(3);
                        f40557v = diVar.f41202b;
                        break;
                    case -19:
                        i10 = f40559x;
                        diVar.f41205e = i10;
                        diVar.b(6);
                        break;
                    case -18:
                        i12 = 1;
                        break;
                    case -17:
                        i14 = 29;
                        break;
                    case -16:
                        diVar.b(7);
                        if (diVar.f41202b == 0) {
                            i14 = 28;
                        }
                        break;
                    case -15:
                        diVar.f41205e = 1;
                        diVar.b(2);
                        diVar.b(3);
                        f40559x = diVar.f41202b;
                        break;
                    case -14:
                        i10 = f40557v;
                        diVar.f41205e = i10;
                        diVar.b(6);
                        break;
                    case -13:
                        i12 = 19;
                        break;
                    case -12:
                        i14 = 30;
                        break;
                    case -11:
                        i11 = 4;
                        diVar.f41205e = 1;
                        diVar.b(2);
                        diVar.b(5);
                        diVar.f41208h = cx.b((Runnable) diVar.f41209i);
                        diVar.b(i11);
                        break;
                    case -10:
                        diVar.f41208h = new r4();
                        i11 = 4;
                        diVar.b(i11);
                        break;
                    case -9:
                        diVar.f41205e = 1;
                        diVar.b(2);
                        diVar.b(5);
                        f40545i = (c) diVar.f41209i;
                        break;
                    case -8:
                        diVar.f41208h = c.NEVER_VALIDATED;
                        diVar.b(4);
                        break;
                    case -7:
                        diVar.f41205e = 1;
                        diVar.b(2);
                        diVar.b(5);
                        f40537a = (String) diVar.f41209i;
                        break;
                    case -6:
                        break;
                    case -5:
                        i12 = 6;
                        break;
                    case -4:
                        i12 = 5;
                        break;
                    case -3:
                        diVar.b(26);
                        i12 = diVar.f41202b == 0 ? 4 : i14;
                        break;
                    case -2:
                        diVar.f41205e = ch.a() ? 1 : 0;
                        diVar.b(6);
                        break;
                    case -1:
                        i12 = 14;
                        break;
                    default:
                        break;
                }
                return null;
            }
        } catch (Throwable th2) {
            Throwable cause = th2.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th2;
        }
    }

    private static void d(Context context, @Nullable FaceTecSDK.InitializeCallback initializeCallback, boolean z10) {
        a(new Object[]{context, initializeCallback, Boolean.valueOf(z10)}, -1564157998, 1564158002, (int) System.currentTimeMillis());
    }

    public static void e() {
        a(new Object[0], 1040995132, -1040995131, (int) System.currentTimeMillis());
    }

    private static void d(@NonNull Context context, @Nullable FaceTecSDK.InitializeCallback initializeCallback) throws Throwable {
        di diVar = new di(context, initializeCallback);
        byte b10 = (byte) 73;
        Object[] objArr = new Object[1];
        z(b10, (short) (b10 | 516), (short) 249, objArr);
        int i10 = 0;
        String str = (String) objArr[0];
        byte b11 = (byte) 74;
        short s4 = (short) (b11 | 913);
        Object[] objArr2 = new Object[1];
        z(b11, s4, (short) (s4 & 1440), objArr2);
        try {
            Object[] objArr3 = {(String) objArr2[0]};
            byte[] bArr = f40556u;
            char c10 = 16;
            short s7 = (short) 987;
            short s9 = (short) 369;
            Object[] objArr4 = new Object[1];
            z((byte) (-bArr[16]), s7, s9, objArr4);
            Class<?> cls = Class.forName((String) objArr4[0]);
            Object[] objArr5 = new Object[1];
            z(bArr[15], (short) 972, (short) 380, objArr5);
            String str2 = (String) objArr5[0];
            Object[] objArr6 = new Object[1];
            z((byte) (-bArr[16]), s7, s9, objArr6);
            Object[] objArr7 = (Object[]) cls.getMethod(str2, Class.forName((String) objArr6[0])).invoke(str, objArr3);
            int[] iArr = new int[objArr7.length];
            int i11 = 0;
            while (i11 < objArr7.length) {
                Object[] objArr8 = new Object[1];
                objArr8[i10] = objArr7[i11];
                byte[] bArr2 = f40556u;
                short s10 = (short) 968;
                short s11 = (short) 368;
                Object[] objArr9 = new Object[1];
                z((byte) (-bArr2[c10]), s10, s11, objArr9);
                Class<?> cls2 = Class.forName((String) objArr9[i10]);
                byte b12 = bArr2[4];
                Object[] objArr10 = new Object[1];
                z(b12, (short) (b12 | 952), (short) 378, objArr10);
                String str3 = (String) objArr10[0];
                Object[] objArr11 = new Object[1];
                z((byte) (-bArr2[16]), s7, s9, objArr11);
                Object objInvoke = cls2.getMethod(str3, Class.forName((String) objArr11[0])).invoke(null, objArr8);
                Object[] objArr12 = new Object[1];
                z((byte) (-bArr2[16]), s10, s11, objArr12);
                Class<?> cls3 = Class.forName((String) objArr12[0]);
                Object[] objArr13 = new Object[1];
                z((byte) (-bArr2[19]), (short) 946, (short) 377, objArr13);
                iArr[i11] = ((Integer) cls3.getMethod((String) objArr13[0], null).invoke(objInvoke, null)).intValue();
                i11++;
                i10 = 0;
                c10 = 16;
            }
            while (true) {
                int i12 = i10 + 1;
                try {
                    switch (diVar.b(iArr[i10])) {
                        case -18:
                            i10 = 37;
                            break;
                        case -17:
                            diVar.b(31);
                            i10 = diVar.f41202b != 4 ? 32 : 9;
                            break;
                        case -16:
                            diVar.f41205e = 1;
                            diVar.b(2);
                            diVar.b(5);
                            diVar.f41205e = diVar.f41209i.hashCode();
                            diVar.b(6);
                            break;
                        case -15:
                            diVar.b(44);
                            throw ((Throwable) diVar.f41209i);
                        case -14:
                            i10 = 38;
                            break;
                        case -13:
                            i10 = 40;
                            break;
                        case -12:
                            diVar.b(7);
                            i10 = diVar.f41202b == 0 ? 30 : i12;
                            break;
                        case -11:
                            i10 = 1;
                            break;
                        case -10:
                            i10 = 21;
                            break;
                        case -9:
                            diVar.b(7);
                            if (diVar.f41202b == 0) {
                                i10 = 20;
                            }
                            break;
                        case -8:
                            diVar.f41205e = 1;
                            diVar.b(2);
                            diVar.b(3);
                            f40559x = diVar.f41202b;
                            break;
                        case -7:
                            diVar.f41205e = f40557v;
                            diVar.b(6);
                            break;
                        case -6:
                            return;
                        case -5:
                            i10 = 11;
                            break;
                        case -4:
                            i10 = 22;
                            break;
                        case -3:
                            diVar.f41205e = 2;
                            diVar.b(2);
                            diVar.b(5);
                            Context context2 = (Context) diVar.f41209i;
                            diVar.b(5);
                            d(context2, (at.c) diVar.f41209i);
                            break;
                        case -2:
                            diVar.f41205e = 2;
                            diVar.b(2);
                            diVar.b(5);
                            final Context context3 = (Context) diVar.f41209i;
                            diVar.b(5);
                            final FaceTecSDK.InitializeCallback initializeCallback2 = (FaceTecSDK.InitializeCallback) diVar.f41209i;
                            diVar.f41208h = new at.c() { // from class: com.facetec.sdk.q4
                                @Override // com.facetec.sdk.at.c
                                public final void onCompletion(at.a aVar) {
                                    bg.e(context3, initializeCallback2, aVar);
                                }
                            };
                            diVar.b(4);
                            break;
                        case -1:
                            i10 = 5;
                            break;
                        default:
                            break;
                    }
                } catch (Throwable th2) {
                    if (i12 < 33 || i12 > 37) {
                        throw th2;
                    }
                    diVar.f41208h = th2;
                    diVar.b(48);
                    i10 = 31;
                }
            }
        } catch (Throwable th3) {
            Throwable cause = th3.getCause();
            if (cause == null) {
                throw th3;
            }
            throw cause;
        }
    }

    public static void d(@NonNull Context context, String str, @Nullable String str2, @Nullable FaceTecSDK.InitializeCallback initializeCallback) throws Throwable {
        int i10;
        int i11;
        Object obj;
        int i12;
        Object string;
        int i13;
        di diVar = new di(context, str, str2, initializeCallback);
        byte b10 = (byte) 73;
        short s4 = (short) (b10 | MessageUtils.MESSAGE_18_DC2);
        byte[] bArr = f40556u;
        char c10 = 4;
        Object[] objArr = new Object[1];
        z(b10, s4, bArr[4], objArr);
        char c11 = 0;
        String str3 = (String) objArr[0];
        byte b11 = (byte) 74;
        short s7 = (short) (b11 | 913);
        Object[] objArr2 = new Object[1];
        z(b11, s7, (short) (s7 & 1440), objArr2);
        try {
            Object[] objArr3 = {(String) objArr2[0]};
            char c12 = 16;
            short s9 = (short) 987;
            short s10 = (short) 369;
            Object[] objArr4 = new Object[1];
            z((byte) (-bArr[16]), s9, s10, objArr4);
            Class<?> cls = Class.forName((String) objArr4[0]);
            Object[] objArr5 = new Object[1];
            z(bArr[15], (short) 972, (short) 380, objArr5);
            String str4 = (String) objArr5[0];
            Object[] objArr6 = new Object[1];
            z((byte) (-bArr[16]), s9, s10, objArr6);
            Object[] objArr7 = (Object[]) cls.getMethod(str4, Class.forName((String) objArr6[0])).invoke(str3, objArr3);
            int[] iArr = new int[objArr7.length];
            int i14 = 0;
            while (i14 < objArr7.length) {
                Object[] objArr8 = new Object[1];
                objArr8[c11] = objArr7[i14];
                byte[] bArr2 = f40556u;
                short s11 = (short) 968;
                short s12 = (short) 368;
                Object[] objArr9 = new Object[1];
                z((byte) (-bArr2[c12]), s11, s12, objArr9);
                Class<?> cls2 = Class.forName((String) objArr9[c11]);
                byte b12 = bArr2[c10];
                Object[] objArr10 = new Object[1];
                z(b12, (short) (b12 | 952), (short) 378, objArr10);
                String str5 = (String) objArr10[0];
                Object[] objArr11 = new Object[1];
                z((byte) (-bArr2[16]), s9, s10, objArr11);
                Object objInvoke = cls2.getMethod(str5, Class.forName((String) objArr11[0])).invoke(null, objArr8);
                Object[] objArr12 = new Object[1];
                z((byte) (-bArr2[16]), s11, s12, objArr12);
                Class<?> cls3 = Class.forName((String) objArr12[0]);
                Object[] objArr13 = new Object[1];
                z((byte) (-bArr2[19]), (short) 946, (short) 377, objArr13);
                iArr[i14] = ((Integer) cls3.getMethod((String) objArr13[0], null).invoke(objInvoke, null)).intValue();
                i14++;
                c11 = 0;
                c10 = 4;
                c12 = 16;
            }
            int i15 = 0;
            while (true) {
                int i16 = i15 + 1;
                int i17 = 13;
                int i18 = 3;
                switch (diVar.b(iArr[i15])) {
                    case -57:
                        i16 = 106;
                        break;
                    case -56:
                        diVar.b(31);
                        int i19 = diVar.f41202b;
                        if (i19 != 0 && i19 == 1) {
                            i17 = 9;
                        }
                        i15 = i17;
                        break;
                    case -55:
                        i16 = 101;
                        break;
                    case -54:
                        diVar.b(31);
                        int i20 = diVar.f41202b;
                        int i21 = 51;
                        if (i20 != 28 && i20 == 80) {
                            i21 = 45;
                        }
                        i15 = i21;
                        break;
                    case -53:
                        i16 = 63;
                        break;
                    case -52:
                        i16 = 100;
                        break;
                    case -51:
                        diVar.b(7);
                        if (diVar.f41202b == 0) {
                            i16 = 99;
                        }
                        break;
                    case -50:
                        diVar.f41205e = 1;
                        diVar.b(2);
                        diVar.b(3);
                        f40559x = diVar.f41202b;
                        break;
                    case -49:
                        i10 = f40557v;
                        diVar.f41205e = i10;
                        diVar.b(6);
                        break;
                    case -48:
                        i16 = 69;
                        break;
                    case -47:
                        i16 = 91;
                        break;
                    case -46:
                        diVar.b(26);
                        if (diVar.f41202b == 0) {
                            i16 = 90;
                        }
                        break;
                    case -45:
                        i16 = 65;
                        break;
                    case -44:
                        i16 = 81;
                        break;
                    case -43:
                        diVar.b(26);
                        if (diVar.f41202b == 0) {
                            i16 = 80;
                        }
                        break;
                    case -42:
                        diVar.f41205e = 1;
                        diVar.b(2);
                        diVar.b(3);
                        f40557v = diVar.f41202b;
                        break;
                    case -41:
                        i10 = f40559x;
                        diVar.f41205e = i10;
                        diVar.b(6);
                        break;
                    case -40:
                        i15 = 1;
                        break;
                    case -39:
                        i16 = 92;
                        break;
                    case -38:
                        diVar.f41205e = 1;
                        diVar.b(2);
                        diVar.b(5);
                        diVar.f41208h = new d1((Context) diVar.f41209i, i18);
                        diVar.b(4);
                        break;
                    case -37:
                        i16 = 55;
                        break;
                    case -36:
                        i16 = 71;
                        break;
                    case -35:
                        i11 = 4;
                        diVar.f41205e = 1;
                        diVar.b(2);
                        diVar.b(5);
                        diVar.f41208h = cx.d((Runnable) diVar.f41209i);
                        diVar.b(i11);
                        break;
                    case -34:
                        diVar.f41205e = 3;
                        diVar.b(2);
                        diVar.b(5);
                        String str6 = (String) diVar.f41209i;
                        diVar.b(5);
                        Context context2 = (Context) diVar.f41209i;
                        diVar.b(5);
                        diVar.f41208h = new x4(str6, context2, (FaceTecSDK.InitializeCallback) diVar.f41209i);
                        i11 = 4;
                        diVar.b(i11);
                        break;
                    case -33:
                        i16 = 102;
                        break;
                    case -32:
                        i16 = 104;
                        break;
                    case -31:
                        diVar.b(7);
                        if (diVar.f41202b == 0) {
                            i16 = 44;
                        }
                        break;
                    case -30:
                        diVar.f41205e = 1;
                        diVar.b(2);
                        diVar.b(5);
                        diVar.f41205e = i((Context) diVar.f41209i) ? 1 : 0;
                        diVar.b(6);
                        break;
                    case -29:
                        i16 = 82;
                        break;
                    case -28:
                        diVar.f41205e = 1;
                        diVar.b(2);
                        diVar.b(5);
                        f40545i = (c) diVar.f41209i;
                        break;
                    case -27:
                        obj = c.REJECTED;
                        diVar.f41208h = obj;
                        i11 = 4;
                        diVar.b(i11);
                        break;
                    case -26:
                        i16 = 40;
                        break;
                    case -25:
                        i16 = 33;
                        break;
                    case -24:
                        diVar.b(13);
                        if (diVar.f41202b == 0) {
                            i16 = 32;
                        }
                        break;
                    case -23:
                        obj = f40537a;
                        diVar.f41208h = obj;
                        i11 = 4;
                        diVar.b(i11);
                        break;
                    case -22:
                        diVar.f41205e = 1;
                        diVar.b(2);
                        diVar.b(3);
                        m = diVar.f41202b != 0;
                        break;
                    case -21:
                        diVar.f41205e = 1;
                        diVar.b(2);
                        diVar.b(5);
                        f40537a = (String) diVar.f41209i;
                        break;
                    case -20:
                        return;
                    case -19:
                        diVar.f41205e = 3;
                        diVar.b(2);
                        diVar.b(5);
                        Context context3 = (Context) diVar.f41209i;
                        diVar.b(5);
                        FaceTecSDK.InitializeCallback initializeCallback2 = (FaceTecSDK.InitializeCallback) diVar.f41209i;
                        diVar.b(3);
                        a(new Object[]{context3, initializeCallback2, Boolean.valueOf(diVar.f41202b != 0)}, -1564157998, 1564158002, (int) System.currentTimeMillis());
                        break;
                    case -18:
                        i16 = 25;
                        break;
                    case -17:
                        i16 = 21;
                        break;
                    case -16:
                        diVar.b(9);
                        if (diVar.f41202b == 0) {
                            i16 = 20;
                        }
                        break;
                    case -15:
                        i12 = 4;
                        diVar.f41208h = c.VALIDATED;
                        diVar.b(i12);
                        break;
                    case -14:
                        string = f40545i;
                        diVar.f41208h = string;
                        i12 = 4;
                        diVar.b(i12);
                        break;
                    case -13:
                        diVar.f41205e = 2;
                        diVar.b(2);
                        diVar.b(5);
                        Context context4 = (Context) diVar.f41209i;
                        diVar.b(3);
                        d(context4, diVar.f41202b != 0);
                        break;
                    case -12:
                        i15 = i17;
                        break;
                    case -11:
                        diVar.f41205e = 1;
                        diVar.b(2);
                        diVar.b(5);
                        t.f42833d = (String) diVar.f41209i;
                        break;
                    case -10:
                        diVar.f41205e = 1;
                        diVar.b(2);
                        diVar.b(5);
                        string = diVar.f41209i.toString();
                        diVar.f41208h = string;
                        i12 = 4;
                        diVar.b(i12);
                        break;
                    case -9:
                        byte[] bArr3 = f40556u;
                        Object[] objArr14 = new Object[1];
                        z((byte) (-bArr3[16]), (short) 939, (short) 371, objArr14);
                        Class<?> cls4 = Class.forName((String) objArr14[0]);
                        byte b13 = bArr3[18];
                        Object[] objArr15 = new Object[1];
                        z(b13, (short) (b13 | 922), (short) 375, objArr15);
                        string = cls4.getMethod((String) objArr15[0], null).invoke(null, null);
                        diVar.f41208h = string;
                        i12 = 4;
                        diVar.b(i12);
                        break;
                    case -8:
                        i15 = 107;
                        break;
                    case -7:
                        i15 = 109;
                        break;
                    case -6:
                        diVar.b(7);
                        i15 = diVar.f41202b == 0 ? 8 : i16;
                        break;
                    case -5:
                        diVar.f41205e = 2;
                        diVar.b(2);
                        diVar.b(5);
                        Object obj2 = diVar.f41209i;
                        diVar.b(5);
                        diVar.f41205e = obj2.equals(diVar.f41209i) ? 1 : 0;
                        diVar.b(6);
                        break;
                    case -4:
                        i13 = 4;
                        diVar.f41208h = "";
                        diVar.b(i13);
                        break;
                    case -3:
                        diVar.f41208h = t.f42833d;
                        i13 = 4;
                        diVar.b(i13);
                        break;
                    case -2:
                        diVar.f41205e = 1;
                        diVar.b(2);
                        diVar.b(3);
                        f40550o = diVar.f41202b != 0;
                        break;
                    case -1:
                        i15 = 60;
                        break;
                    default:
                        break;
                }
            }
        } catch (Throwable th2) {
            Throwable cause = th2.getCause();
            if (cause == null) {
                throw th2;
            }
            throw cause;
        }
    }

    public static boolean a() {
        if (m) {
            return false;
        }
        int i10 = f40557v;
        int i11 = i10 + 7;
        f40559x = i11 % 128;
        int i12 = i11 % 2;
        int i13 = i10 + 37;
        f40559x = i13 % 128;
        if (i13 % 2 == 0) {
            return true;
        }
        throw null;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r3v2 long, still in use, count: 2, list:
          (r3v2 long) from 0x001f: PHI (r3 I:??) = (r3v0 long), (r3v2 long) binds: [B:8:0x001d, B:5:0x0014] A[DONT_GENERATE, DONT_INLINE]
          (r3v2 long) from 0x0012: CMP_L (r3v2 long), (0 long) A[WRAPPED]
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:93)
        	at jadx.core.dex.visitors.regions.TernaryMod.makeTernaryInsn(TernaryMod.java:132)
        	at jadx.core.dex.visitors.regions.TernaryMod.processRegion(TernaryMod.java:67)
        	at jadx.core.dex.visitors.regions.TernaryMod.enterRegion(TernaryMod.java:50)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:96)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:27)
        	at jadx.core.dex.visitors.regions.TernaryMod.process(TernaryMod.java:36)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.process(IfRegionVisitor.java:44)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.visit(IfRegionVisitor.java:30)
        */
    @androidx.annotation.Nullable
    public static java.lang.Long a(android.content.Context r5) {
        /*
            int r0 = com.facetec.sdk.bg.f40559x
            int r0 = r0 + 37
            int r1 = r0 % 128
            com.facetec.sdk.bg.f40557v = r1
            int r0 = r0 % 2
            r1 = 0
            if (r0 != 0) goto L17
            long r3 = com.facetec.sdk.bs.i(r5)
            int r5 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r5 == 0) goto L24
            goto L1f
        L17:
            long r3 = com.facetec.sdk.bs.i(r5)
            int r5 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r5 == 0) goto L24
        L1f:
            java.lang.Long r5 = java.lang.Long.valueOf(r3)
            return r5
        L24:
            int r5 = com.facetec.sdk.bg.f40559x
            int r5 = r5 + 103
            int r0 = r5 % 128
            com.facetec.sdk.bg.f40557v = r0
            int r5 = r5 % 2
            r5 = 0
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facetec.sdk.bg.a(android.content.Context):java.lang.Long");
    }

    @NonNull
    public static String a(String str) {
        int i10 = f40557v + 119;
        f40559x = i10 % 128;
        int i11 = i10 % 2;
        String strB = b(null, true);
        if (strB == null) {
            strB = PushConstants.GE_PARAMS_SEPARATOR;
        }
        if (f40544h == null) {
            return "";
        }
        StringBuilder sb2 = new StringBuilder("facetec|sdk|android|");
        sb2.append(f40544h);
        sb2.append("|");
        androidx.collection.k.e(sb2, f40537a, "|", strB, "|");
        sb2.append(Build.MODEL);
        sb2.append("|");
        sb2.append(FaceTecSDK.version());
        sb2.append("|");
        sb2.append(Locale.getDefault());
        sb2.append("|");
        sb2.append(Locale.getDefault().getLanguage());
        sb2.append("|");
        sb2.append(str);
        String string = sb2.toString();
        int i12 = f40557v + 25;
        f40559x = i12 % 128;
        if (i12 % 2 != 0) {
            int i13 = 98 / 0;
        }
        return string;
    }

    private static void k(Context context) {
        SharedPreferences.Editor editorEdit;
        String str;
        int i10;
        int i11 = f40559x + 33;
        f40557v = i11 % 128;
        if (i11 % 2 == 0) {
            editorEdit = ((SharedPreferences) a(new Object[]{context}, 1435759663, -1435759656, (int) System.currentTimeMillis())).edit();
            int iF = f(context);
            str = ak.U;
            i10 = iF << 1;
        } else {
            editorEdit = ((SharedPreferences) a(new Object[]{context}, 1435759663, -1435759656, (int) System.currentTimeMillis())).edit();
            int iF2 = f(context);
            str = ak.U;
            i10 = iF2 + 1;
        }
        editorEdit.putInt(str, i10);
        editorEdit.apply();
    }

    public static void a(JSONObject jSONObject) {
        int i10 = f40559x + 3;
        f40557v = i10 % 128;
        if (i10 % 2 == 0) {
            jSONObject.has("dGVULgo:UY%BjRq4N@@~4(9Bp1)GZ1+{");
            throw null;
        }
        if (!jSONObject.has("dGVULgo:UY%BjRq4N@@~4(9Bp1)GZ1+{")) {
            f40543g = jSONObject;
            return;
        }
        try {
            bn.c(jSONObject.getString("dGVULgo:UY%BjRq4N@@~4(9Bp1)GZ1+{"));
            int i11 = f40559x + 103;
            f40557v = i11 % 128;
            if (i11 % 2 == 0) {
                throw null;
            }
        } catch (JSONException unused) {
        }
    }
}

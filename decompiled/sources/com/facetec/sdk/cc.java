package com.facetec.sdk;

import android.app.Activity;
import android.content.Context;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.hardware.usb.UsbDevice;
import android.hardware.usb.UsbManager;
import android.media.AudioTrack;
import android.os.Build;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
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
import androidx.annotation.MainThread;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.core.view.InputDeviceCompat;
import androidx.core.view.PointerIconCompat;
import com.bbva.sl.ar.core.libmcrypt.exception.ErrorCodes;
import com.bbva.tohu.android.product.valkyria.sdk.payments.paywave.Constants;
import com.esotericsoftware.asm.Opcodes;
import java.lang.ref.WeakReference;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Timer;
import java.util.TimerTask;
import java.util.UUID;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes9.dex */
final class cc {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static final byte[] $$d = null;
    private static final int $$e = 0;
    private static int $10;
    private static int $11;
    private static char[] E;
    private static /* synthetic */ boolean F;
    private static long J;
    private static int K;
    private static long L;
    private static char[] M;
    private static char N;
    private static final int O = 0;
    private static int P;
    private static final byte[] Q = null;
    private static int R;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static volatile String f40801a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    static volatile String f40802c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    private static cc f40803e;
    private final p A;
    private v C;
    private boolean D;
    private final Runnable[] H;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final WeakReference<Activity> f40811k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private cg f40812l;
    private cf m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private ce f40813n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private cj f40814o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private cl f40815p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private ci f40816q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private cp f40817r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private ck f40818s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private d f40819t;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private int f40824y;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    boolean f40804b = false;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    boolean f40805d = false;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private c f40820u = c.NOT_STARTED;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private final Object f40821v = new Object();

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private int f40823x = 0;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private final Timer f40822w = new Timer();
    private TimerTask B = null;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private Date f40825z = null;
    private final Semaphore G = new Semaphore(1);
    private boolean I = false;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final ExecutorService f40806f = Executors.newSingleThreadExecutor();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final ExecutorService f40809i = Executors.newSingleThreadExecutor();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final ArrayList<WeakReference<b>> f40808h = new ArrayList<>(2);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final ArrayList<WeakReference<e>> f40807g = new ArrayList<>(2);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final ArrayList<WeakReference<a>> f40810j = new ArrayList<>(2);

    /* JADX INFO: renamed from: com.facetec.sdk.cc$5, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass5 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f40826a;

        static {
            int[] iArr = new int[c.values().length];
            f40826a = iArr;
            try {
                iArr[c.NOT_STARTED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f40826a[c.FINISHED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f40826a[c.WAITING_TO_FINISH.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f40826a[c.PRE_SESSION.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f40826a[c.PROCESSING.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    @FunctionalInterface
    public interface a {
        void onIDScanProgress(cf cfVar, ce ceVar);
    }

    @FunctionalInterface
    public interface b {
        void onPreSessionProgress(cp cpVar, ci ciVar, ck ckVar, cl clVar);
    }

    public enum c {
        NOT_STARTED,
        PRE_SESSION,
        PROCESSING,
        ID_SCAN,
        WAITING_TO_FINISH,
        FINISHED
    }

    public static class d {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final int f40834b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final byte[] f40835d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final int f40836e;

        public d(byte[] bArr, int i10, int i11) {
            this.f40835d = bArr;
            this.f40834b = i10;
            this.f40836e = i11;
        }
    }

    public interface e {
        void b();

        void c();

        void d();

        void d(cj cjVar, cg cgVar);

        void e();
    }

    static {
        init$1();
        $10 = 0;
        $11 = 1;
        init$0();
        t();
        P = 0;
        R = 1;
        s();
        r();
        p();
        int i10 = R + 21;
        P = i10 % 128;
        int i11 = i10 % 2;
        F = true;
        f40803e = null;
        f40801a = "";
        f40802c = "";
        int i12 = R + 57;
        P = i12 % 128;
        if (i12 % 2 != 0) {
            int i13 = 24 / 0;
        }
    }

    private cc(Activity activity) {
        this.D = true;
        int i10 = 2;
        int i11 = 3;
        this.H = new Runnable[]{new r1(this, i10), new s1(this, i11), new g3(this, i10), new h3(this, i11), new i3(this, i10)};
        this.f40811k = new WeakReference<>(activity);
        this.A = new p(activity);
        this.C = new v(activity);
        f40802c = null;
        this.D = bg.d();
    }

    private void A() throws Throwable {
        int i10 = R + 65;
        P = i10 % 128;
        int i11 = i10 % 2;
        o();
        c(true);
        try {
            ExecutorService executorService = this.f40806f;
            TimeUnit timeUnit = TimeUnit.SECONDS;
            executorService.awaitTermination(2L, timeUnit);
            this.f40809i.awaitTermination(2L, timeUnit);
        } catch (InterruptedException unused) {
        }
        e(new Object[]{this}, 749438003, -749438003, System.identityHashCode(this));
        int i12 = P + 91;
        R = i12 % 128;
        if (i12 % 2 == 0) {
            int i13 = 9 / 0;
        }
    }

    private Runnable B() throws Throwable {
        Cdo cdo = new Cdo(this);
        byte[] bArr = Q;
        char c10 = '!';
        short s4 = bArr[33];
        Object[] objArr = new Object[1];
        af(s4, (byte) (s4 | 73), (short) 653, objArr);
        char c11 = 0;
        String str = (String) objArr[0];
        short s7 = (short) 112;
        Object[] objArr2 = new Object[1];
        af(s7, (byte) 74, (short) (O | 593), objArr2);
        try {
            Object[] objArr3 = {(String) objArr2[0]};
            char c12 = 20;
            byte b10 = bArr[20];
            Object[] objArr4 = new Object[1];
            af(s7, b10, (short) (b10 | 738), objArr4);
            Class<?> cls = Class.forName((String) objArr4[0]);
            int i10 = 131;
            Object[] objArr5 = new Object[1];
            af((short) 127, bArr[131], (short) 761, objArr5);
            String str2 = (String) objArr5[0];
            byte b11 = bArr[20];
            Object[] objArr6 = new Object[1];
            af(s7, b11, (short) (b11 | 738), objArr6);
            Object[] objArr7 = (Object[]) cls.getMethod(str2, Class.forName((String) objArr6[0])).invoke(str, objArr3);
            int[] iArr = new int[objArr7.length];
            int i11 = 0;
            while (i11 < objArr7.length) {
                Object[] objArr8 = new Object[1];
                objArr8[c11] = objArr7[i11];
                short s9 = (short) i10;
                byte[] bArr2 = Q;
                byte b12 = bArr2[c12];
                Object[] objArr9 = new Object[1];
                af(s9, b12, (short) (b12 | 737), objArr9);
                Class<?> cls2 = Class.forName((String) objArr9[c11]);
                byte b13 = bArr2[c10];
                Object[] objArr10 = new Object[1];
                af((short) 147, b13, (short) (b13 | 759), objArr10);
                String str3 = (String) objArr10[c11];
                byte b14 = bArr2[20];
                Object[] objArr11 = new Object[1];
                af(s7, b14, (short) (b14 | 738), objArr11);
                Object objInvoke = cls2.getMethod(str3, Class.forName((String) objArr11[0])).invoke(null, objArr8);
                byte b15 = bArr2[20];
                Object[] objArr12 = new Object[1];
                af(s9, b15, (short) (b15 | 737), objArr12);
                Class<?> cls3 = Class.forName((String) objArr12[0]);
                Object[] objArr13 = new Object[1];
                af((short) 153, bArr2[25], (short) 758, objArr13);
                iArr[i11] = ((Integer) cls3.getMethod((String) objArr13[0], null).invoke(objInvoke, null)).intValue();
                i11++;
                c10 = '!';
                c11 = 0;
                c12 = 20;
                i10 = 131;
            }
            int i12 = 0;
            while (true) {
                int i13 = i12 + 1;
                try {
                    switch (cdo.d(iArr[i12])) {
                        case -15:
                            i12 = 32;
                            break;
                        case -14:
                            cdo.d(22);
                            i12 = cdo.f41318c != 82 ? 27 : 14;
                            break;
                        case -13:
                            cdo.d(14);
                            throw ((Throwable) cdo.f41321f);
                        case -12:
                            i12 = 33;
                            break;
                        case -11:
                            i12 = 35;
                            break;
                        case -10:
                            cdo.d(18);
                            i12 = cdo.f41318c == 0 ? 25 : i13;
                            break;
                        case -9:
                            cdo.f41319d = 1;
                            cdo.d(3);
                            cdo.d(6);
                            R = cdo.f41318c;
                            break;
                        case -8:
                            cdo.f41319d = P;
                            cdo.d(7);
                            break;
                        case -7:
                            cdo.d(14);
                            return (Runnable) cdo.f41321f;
                        case -6:
                            i12 = 1;
                            break;
                        case -5:
                            i12 = 16;
                            break;
                        case -4:
                            cdo.f41319d = 2;
                            cdo.d(3);
                            cdo.d(4);
                            Object obj = cdo.f41321f;
                            cdo.d(6);
                            try {
                                Object[] objArr14 = new Object[1];
                                boolean z10 = false;
                                try {
                                    objArr14[0] = Integer.valueOf(cdo.f41318c);
                                    int i14 = O;
                                    short s10 = (short) (i14 & PointerIconCompat.TYPE_TEXT);
                                    byte[] bArr3 = Q;
                                    byte b16 = bArr3[20];
                                    Object[] objArr15 = new Object[1];
                                    af(s10, b16, (short) (b16 | 738), objArr15);
                                    z10 = false;
                                    Class<?> cls4 = Class.forName((String) objArr15[0]);
                                    Object[] objArr16 = new Object[1];
                                    af((short) (i14 + 3), bArr3[18], (short) 759, objArr16);
                                    try {
                                        try {
                                            cdo.f41319d = ((Integer) cls4.getMethod((String) objArr16[0], Integer.TYPE).invoke(obj, objArr14)).intValue();
                                            cdo.d(7);
                                        } catch (Throwable th2) {
                                            th = th2;
                                            if (i13 < 28 || i13 > 32) {
                                                throw th;
                                            }
                                            cdo.f41324i = th;
                                            cdo.d(25);
                                            i12 = 26;
                                        }
                                    } catch (Throwable th3) {
                                        th = th3;
                                        Throwable cause = th.getCause();
                                        if (cause != null) {
                                            throw cause;
                                        }
                                        throw th;
                                    }
                                } catch (Throwable th4) {
                                    th = th4;
                                }
                            } catch (Throwable th5) {
                                th = th5;
                            }
                            break;
                        case -3:
                            cdo.f41319d = 1;
                            cdo.d(3);
                            cdo.d(4);
                            cdo.f41324i = ((cc) cdo.f41321f).H;
                            cdo.d(1);
                            break;
                        case -2:
                            try {
                                short s11 = (short) (O & PointerIconCompat.TYPE_TEXT);
                                byte b17 = Q[20];
                                Object[] objArr17 = new Object[1];
                                af(s11, b17, (short) (b17 | 738), objArr17);
                                try {
                                    cdo.f41324i = Class.forName((String) objArr17[0]).getDeclaredConstructor(null).newInstance(null);
                                    cdo.d(1);
                                } catch (Throwable th6) {
                                    th = th6;
                                    Throwable cause2 = th.getCause();
                                    if (cause2 != null) {
                                        throw cause2;
                                    }
                                    throw th;
                                }
                            } catch (Throwable th7) {
                                th = th7;
                            }
                            break;
                        case -1:
                            i12 = 10;
                            break;
                        default:
                            break;
                    }
                } catch (Throwable th8) {
                    th = th8;
                }
            }
        } catch (Throwable th9) {
            Throwable cause3 = th9.getCause();
            if (cause3 != null) {
                throw cause3;
            }
            throw th9;
        }
    }

    private void C() {
        e(new Object[]{this}, 749438003, -749438003, System.identityHashCode(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:23:0x01b2  */
    /* JADX WARN: Code duplicated, block: B:26:0x0244  */
    /* JADX WARN: Code duplicated, block: B:27:0x0245 A[Catch: all -> 0x01af, TryCatch #2 {all -> 0x01af, blocks: (B:11:0x0105, B:15:0x0156, B:19:0x01a5, B:35:0x0381, B:39:0x03d2, B:43:0x042a, B:42:0x03f3, B:38:0x039c, B:46:0x0481, B:50:0x04d1, B:54:0x0522, B:53:0x04f2, B:49:0x049c, B:18:0x0177, B:14:0x0123, B:24:0x021e, B:28:0x028c, B:27:0x0245), top: B:68:0x005b }] */
    public void D() throws Throwable {
        Map map;
        Object method;
        Object[] objArr;
        int i10 = R + 55;
        int i11 = i10 % 128;
        P = i11;
        int i12 = i10 % 2;
        int i13 = i11 + 69;
        int i14 = i13 % 128;
        R = i14;
        int i15 = i13 % 2;
        int i16 = i14 + 61;
        P = i16 % 128;
        int i17 = i16 % 2;
        try {
            Class cls = (Class) bp.a(TextUtils.getOffsetBefore("", 0) + 23, (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 388, (char) KeyEvent.getDeadChar(0, 0));
            byte b10 = (byte) 0;
            byte b11 = b10;
            byte b12 = b11;
            Object[] objArr2 = new Object[1];
            ad(b10, b11, b12, objArr2);
            long j10 = cls.getField((String) objArr2[0]).getLong(null);
            try {
                if (j10 != -1) {
                    int i18 = P + 31;
                    R = i18 % 128;
                    int i19 = i18 % 2;
                    long j11 = j10 + 1859;
                    Object[] objArr3 = new Object[1];
                    ae(292 - ExpandableListView.getPackedPositionType(0L), 1 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), View.resolveSizeAndState(0, 0, 0) + 22, "\b\ufffe\u000b\u0001\u000f\f\u0006\u0001ￋ\f\u0010ￋ\ufff0\u0016\u0010\u0011\u0002\n￠\t\f\u0000", false, objArr3);
                    Class<?> cls2 = Class.forName((String) objArr3[0]);
                    Object[] objArr4 = new Object[1];
                    ae((AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 295, (Process.myPid() >> 22) + 13, 16 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), "\ufffa\t\f\ufffe�￫\ufffe\ufffa\u0005\r\u0002\u0006\ufffe\ufffe\u0005", false, objArr4);
                    if (j11 >= ((Long) cls2.getDeclaredMethod((String) objArr4[0], new Class[0]).invoke(null, new Object[0])).longValue()) {
                        Class cls3 = (Class) bp.a(KeyEvent.keyCodeFromString("") + 23, Color.green(0) + 388, (char) (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)));
                        byte b13 = (byte) ($$b & 15);
                        byte b14 = (byte) (b13 - 3);
                        Object[] objArr5 = new Object[1];
                        ad(b13, b14, b14, objArr5);
                        Object obj = cls3.getField((String) objArr5[0]).get(null);
                        Object[] objArr6 = {-1633150209, 0};
                        Map map2 = bp.f40694x;
                        Object method2 = map2.get(1463901671);
                        if (method2 == null) {
                            Class cls4 = (Class) bp.a(View.MeasureSpec.getMode(0) + 23, KeyEvent.keyCodeFromString("") + 388, (char) TextUtils.indexOf("", "", 0, 0));
                            Object[] objArr7 = new Object[1];
                            ad(b10, b11, b12, objArr7);
                            String str = (String) objArr7[0];
                            Class<?> cls5 = Integer.TYPE;
                            method2 = cls4.getMethod(str, cls5, cls5);
                            map2.put(1463901671, method2);
                        }
                        Object[] objArr8 = {obj, Integer.valueOf(((Integer) ((Method) method2).invoke(null, objArr6)).intValue())};
                        Object method3 = map2.get(-2142901683);
                        if (method3 == null) {
                            method3 = ((Class) bp.a(23 - TextUtils.lastIndexOf("", '0', 0, 0), TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 1837, (char) (ViewConfiguration.getFadingEdgeLength() >> 16))).getMethod("a", Object[].class, Integer.TYPE);
                            map2.put(-2142901683, method3);
                        }
                        objArr = (Object[]) ((Method) method3).invoke(null, objArr8);
                    } else {
                        Object[] objArr9 = new Object[1];
                        ae(292 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), 14 - ((byte) KeyEvent.getModifierMetaStateMask()), TextUtils.getOffsetAfter("", 0) + 16, "\u0003\u0012\u0011\u0017\ufff1ￌ\u0005\f\uffff\nￌ\uffff\u0014\uffff\b\u000b", true, objArr9);
                        Class<?> cls6 = Class.forName((String) objArr9[0]);
                        Object[] objArr10 = new Object[1];
                        ae(295 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), 8 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), (ViewConfiguration.getScrollDefaultDelay() >> 16) + 16, "\ufffb\r\u0002\uffdd\t\ufffe\uffff\u0003\ufffe\uffff\b\u000e\u0003\u000e\u0013￢", false, objArr10);
                        Object[] objArr11 = {Integer.valueOf(((Integer) cls6.getMethod((String) objArr10[0], Object.class).invoke(null, this)).intValue()), 0, -1633150209};
                        map = bp.f40694x;
                        method = map.get(388357536);
                        if (method != null) {
                            Class cls7 = (Class) bp.a(23 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 388, (char) KeyEvent.normalizeMetaState(0));
                            byte b15 = (byte) ($$b & 14);
                            byte b16 = (byte) (b15 - 2);
                            Object[] objArr12 = new Object[1];
                            ad(b15, b16, b16, objArr12);
                            String str2 = (String) objArr12[0];
                            Class<?> cls8 = Integer.TYPE;
                            method = cls7.getMethod(str2, cls8, cls8, cls8);
                            map.put(388357536, method);
                        }
                        objArr = (Object[]) ((Method) method).invoke(null, objArr11);
                        Class cls9 = (Class) bp.a(23 - (ViewConfiguration.getDoubleTapTimeout() >> 16), (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 387, (char) (AndroidCharacter.getMirror('0') - '0'));
                        byte b17 = (byte) ($$b & 15);
                        byte b18 = (byte) (b17 - 3);
                        Object[] objArr13 = new Object[1];
                        ad(b17, b18, b18, objArr13);
                        cls9.getField((String) objArr13[0]).set(null, objArr);
                        try {
                            Object[] objArr14 = new Object[1];
                            ae(292 - (Process.myPid() >> 22), (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 21, "\b\ufffe\u000b\u0001\u000f\f\u0006\u0001ￋ\f\u0010ￋ\ufff0\u0016\u0010\u0011\u0002\n￠\t\f\u0000", false, objArr14);
                            Class<?> cls10 = Class.forName((String) objArr14[0]);
                            Object[] objArr15 = new Object[1];
                            ae(297 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), 13 - (ViewConfiguration.getLongPressTimeout() >> 16), (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 15, "\ufffa\t\f\ufffe�￫\ufffe\ufffa\u0005\r\u0002\u0006\ufffe\ufffe\u0005", false, objArr15);
                            Long lValueOf = Long.valueOf(((Long) cls10.getDeclaredMethod((String) objArr15[0], new Class[0]).invoke(null, new Object[0])).longValue());
                            Class cls11 = (Class) bp.a(22 - MotionEvent.axisFromString(""), 436 - AndroidCharacter.getMirror('0'), (char) (TextUtils.indexOf((CharSequence) "", '0') + 1));
                            Object[] objArr16 = new Object[1];
                            ad(b10, b11, b12, objArr16);
                            cls11.getField((String) objArr16[0]).set(null, lValueOf);
                            int i20 = R + 13;
                            P = i20 % 128;
                            int i21 = i20 % 2;
                        } catch (Exception unused) {
                            throw new RuntimeException();
                        }
                    }
                } else {
                    Object[] objArr17 = new Object[1];
                    ae(292 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), 14 - ((byte) KeyEvent.getModifierMetaStateMask()), TextUtils.getOffsetAfter("", 0) + 16, "\u0003\u0012\u0011\u0017\ufff1ￌ\u0005\f\uffff\nￌ\uffff\u0014\uffff\b\u000b", true, objArr17);
                    Class<?> cls12 = Class.forName((String) objArr17[0]);
                    Object[] objArr18 = new Object[1];
                    ae(295 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), 8 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), (ViewConfiguration.getScrollDefaultDelay() >> 16) + 16, "\ufffb\r\u0002\uffdd\t\ufffe\uffff\u0003\ufffe\uffff\b\u000e\u0003\u000e\u0013￢", false, objArr18);
                    Object[] objArr19 = {Integer.valueOf(((Integer) cls12.getMethod((String) objArr18[0], Object.class).invoke(null, this)).intValue()), 0, -1633150209};
                    map = bp.f40694x;
                    method = map.get(388357536);
                    if (method != null) {
                        Class cls13 = (Class) bp.a(23 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 388, (char) KeyEvent.normalizeMetaState(0));
                        byte b19 = (byte) ($$b & 14);
                        byte b110 = (byte) (b19 - 2);
                        Object[] objArr110 = new Object[1];
                        ad(b19, b110, b110, objArr110);
                        String str3 = (String) objArr110[0];
                        Class<?> cls14 = Integer.TYPE;
                        method = cls13.getMethod(str3, cls14, cls14, cls14);
                        map.put(388357536, method);
                    }
                    objArr = (Object[]) ((Method) method).invoke(null, objArr19);
                    Class cls15 = (Class) bp.a(23 - (ViewConfiguration.getDoubleTapTimeout() >> 16), (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 387, (char) (AndroidCharacter.getMirror('0') - '0'));
                    byte b111 = (byte) ($$b & 15);
                    byte b112 = (byte) (b111 - 3);
                    Object[] objArr111 = new Object[1];
                    ad(b111, b112, b112, objArr111);
                    cls15.getField((String) objArr111[0]).set(null, objArr);
                    Object[] objArr112 = new Object[1];
                    ae(292 - (Process.myPid() >> 22), (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 21, "\b\ufffe\u000b\u0001\u000f\f\u0006\u0001ￋ\f\u0010ￋ\ufff0\u0016\u0010\u0011\u0002\n￠\t\f\u0000", false, objArr112);
                    Class<?> cls16 = Class.forName((String) objArr112[0]);
                    Object[] objArr113 = new Object[1];
                    ae(297 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), 13 - (ViewConfiguration.getLongPressTimeout() >> 16), (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 15, "\ufffa\t\f\ufffe�￫\ufffe\ufffa\u0005\r\u0002\u0006\ufffe\ufffe\u0005", false, objArr113);
                    Long lValueOf2 = Long.valueOf(((Long) cls16.getDeclaredMethod((String) objArr113[0], new Class[0]).invoke(null, new Object[0])).longValue());
                    Class cls17 = (Class) bp.a(22 - MotionEvent.axisFromString(""), 436 - AndroidCharacter.getMirror('0'), (char) (TextUtils.indexOf((CharSequence) "", '0') + 1));
                    Object[] objArr114 = new Object[1];
                    ad(b10, b11, b12, objArr114);
                    cls17.getField((String) objArr114[0]).set(null, lValueOf2);
                    int i22 = R + 13;
                    P = i22 % 128;
                    int i23 = i22 % 2;
                }
                int i24 = ((int[]) objArr[1])[0];
                int i25 = ((int[]) objArr[0])[0];
                if (i25 == i24) {
                    Object[] objArr20 = {Integer.valueOf(((int[]) objArr[9])[0]), 0};
                    Map map3 = bp.f40694x;
                    Object method4 = map3.get(1463901671);
                    if (method4 == null) {
                        Class cls18 = (Class) bp.a(KeyEvent.getDeadChar(0, 0) + 23, TextUtils.indexOf("", "", 0, 0) + 388, (char) (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)));
                        Object[] objArr21 = new Object[1];
                        ad(b10, b11, b12, objArr21);
                        String str4 = (String) objArr21[0];
                        Class<?> cls19 = Integer.TYPE;
                        method4 = cls18.getMethod(str4, cls19, cls19);
                        map3.put(1463901671, method4);
                    }
                    Object[] objArr22 = {objArr, Integer.valueOf(((Integer) ((Method) method4).invoke(null, objArr20)).intValue())};
                    Object method5 = map3.get(-2142901683);
                    if (method5 == null) {
                        method5 = ((Class) bp.a(24 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), (ViewConfiguration.getKeyRepeatDelay() >> 16) + 1836, (char) (1 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1))))).getMethod("a", Object[].class, Integer.TYPE);
                        map3.put(-2142901683, method5);
                    }
                    ((Method) method5).invoke(null, objArr22);
                    return;
                }
                ArrayList arrayList = new ArrayList();
                arrayList.add((String) objArr[2]);
                arrayList.add((String) objArr[3]);
                arrayList.add((String) objArr[4]);
                arrayList.add((String) objArr[5]);
                arrayList.add((String) objArr[6]);
                arrayList.add((String) objArr[7]);
                arrayList.add((String) objArr[8]);
                Toast.makeText((Context) null, i25 / (((i25 - 1) * i25) % 2), 0).show();
                Object[] objArr23 = {Integer.valueOf(((int[]) objArr[9])[0]), 0};
                Map map4 = bp.f40694x;
                Object method6 = map4.get(1463901671);
                if (method6 == null) {
                    Class cls20 = (Class) bp.a(23 - View.MeasureSpec.getMode(0), 388 - View.getDefaultSize(0, 0), (char) (ViewConfiguration.getLongPressTimeout() >> 16));
                    Object[] objArr24 = new Object[1];
                    ad(b10, b11, b12, objArr24);
                    String str5 = (String) objArr24[0];
                    Class<?> cls21 = Integer.TYPE;
                    method6 = cls20.getMethod(str5, cls21, cls21);
                    map4.put(1463901671, method6);
                }
                Object[] objArr25 = {objArr, Integer.valueOf(((Integer) ((Method) method6).invoke(null, objArr23)).intValue())};
                Object method7 = map4.get(-2142901683);
                if (method7 == null) {
                    method7 = ((Class) bp.a((ViewConfiguration.getKeyRepeatTimeout() >> 16) + 24, Color.blue(0) + 1836, (char) (ViewConfiguration.getDoubleTapTimeout() >> 16))).getMethod("a", Object[].class, Integer.TYPE);
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

    private synchronized void E() {
        int i10 = R + 99;
        P = i10 % 128;
        int i11 = i10 % 2;
        Activity activity = this.f40811k.get();
        if (activity == null) {
            return;
        }
        activity.runOnUiThread(new m2(this, 3));
        int i12 = R + 21;
        P = i12 % 128;
        if (i12 % 2 == 0) {
        } else {
            throw null;
        }
    }

    private void F() {
        if (t.f42832c) {
            n nVar = ((be) this.f40811k.get()).f40515k;
            int i10 = t.f42831b;
            if (i10 == 1) {
                int i11 = P + 85;
                R = i11 % 128;
                int i12 = i11 % 2;
                ch.G("waypoint", 1);
                nVar.a(this.f40811k.get(), t.b.WAYPOINT_UPLOAD);
            } else if (i10 > 10) {
                int i13 = R + 81;
                P = i13 % 128;
                int i14 = i13 % 2;
                ch.G("waypoint", 2);
                nVar.a(this.f40811k.get(), t.b.WAYPOINT_UPLOAD);
                t.f42832c = false;
            }
            t.f42831b++;
        }
    }

    private void G() {
        synchronized (this.f40821v) {
            c cVar = this.f40820u;
            if (cVar == c.FINISHED || cVar == c.WAITING_TO_FINISH) {
                return;
            }
            if (this.f40825z != null && new Date().getTime() - this.f40825z.getTime() > 615000) {
                k.c(new Throwable("Phoenix hang was detected"));
                c(false);
                this.f40814o = cj.PROCESSING_COMPLETE_TIMED_OUT;
                N();
            }
        }
    }

    private synchronized void H() {
        try {
            int i10 = P + 103;
            R = i10 % 128;
            if (i10 % 2 == 0) {
                this.f40811k.get();
                throw null;
            }
            Activity activity = this.f40811k.get();
            if (activity != null) {
                activity.runOnUiThread(new k3(this, 4));
                return;
            }
            int i11 = P + 69;
            R = i11 % 128;
            if (i11 % 2 != 0) {
                return;
            } else {
                throw null;
            }
        } catch (Throwable th2) {
            throw th2;
        }
        throw th2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void I() throws Throwable {
        JSONObject jSONObject;
        JSONObject jSONObjectA = this.C.b().a();
        Object[] objArr = new Object[1];
        ah(Color.green(0) + 3, "\u000e\u000b㙏", (byte) (84 - (KeyEvent.getMaxKeyCode() >> 16)), objArr);
        String strOptString = jSONObjectA.optString(((String) objArr[0]).intern());
        Object[] objArr2 = new Object[1];
        ah(2 - ((byte) KeyEvent.getModifierMetaStateMask()), "\u0004\u0002㘚", (byte) (31 - (ViewConfiguration.getTapTimeout() >> 16)), objArr2);
        String strOptString2 = jSONObjectA.optString(((String) objArr2[0]).intern());
        Object[] objArr3 = new Object[1];
        ah(1 - TextUtils.lastIndexOf("", '0', 0), "\u0000\u000b", (byte) (102 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1))), objArr3);
        String strOptString3 = jSONObjectA.optString(((String) objArr3[0]).intern());
        Object[] objArr4 = new Object[1];
        ah(6 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), "\u0002\b\u0004\u0001㘸", (byte) (61 - (ViewConfiguration.getMinimumFlingVelocity() >> 16)), objArr4);
        String strOptString4 = jSONObjectA.optString(((String) objArr4[0]).intern());
        Object[] objArr5 = new Object[1];
        ah(6 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), "\u000e\t\u0004\u0001㘾", (byte) (66 - TextUtils.indexOf((CharSequence) "", '0', 0)), objArr5);
        String strOptString5 = jSONObjectA.optString(((String) objArr5[0]).intern());
        Object[] objArr6 = new Object[1];
        ah(5 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), "\u0006\u0002\u0004\f㗰", (byte) (((Process.getThreadPriority(0) + 20) >> 6) + 69), objArr6);
        String strOptString6 = jSONObjectA.optString(((String) objArr6[0]).intern());
        Object[] objArr7 = new Object[1];
        ai((char) (ViewConfiguration.getScrollBarSize() >> 8), TextUtils.indexOf("", "", 0, 0), TextUtils.getOffsetBefore("", 0) + 5, objArr7);
        String strOptString7 = jSONObjectA.optString(((String) objArr7[0]).intern());
        Object[] objArr8 = new Object[1];
        ai((char) (TextUtils.lastIndexOf("", '0', 0, 0) + 1), 5 - (ViewConfiguration.getScrollDefaultDelay() >> 16), 4 - ((byte) KeyEvent.getModifierMetaStateMask()), objArr8);
        String strOptString8 = jSONObjectA.optString(((String) objArr8[0]).intern());
        Object[] objArr9 = new Object[1];
        ah((SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 4, "\u0002\b\u0006\t㘶", (byte) (TextUtils.indexOf("", "") + 64), objArr9);
        String strOptString9 = jSONObjectA.optString(((String) objArr9[0]).intern());
        Object[] objArr10 = new Object[1];
        ai((char) ((ViewConfiguration.getKeyRepeatDelay() >> 16) + 41441), 9 - Process.getGidForName(""), 6 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), objArr10);
        String strOptString10 = jSONObjectA.optString(((String) objArr10[0]).intern());
        Object[] objArr11 = new Object[1];
        ai((char) (706 - Color.argb(0, 0, 0, 0)), (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 16, 5 - TextUtils.getTrimmedLength(""), objArr11);
        String strOptString11 = jSONObjectA.optString(((String) objArr11[0]).intern());
        Object[] objArr12 = new Object[1];
        ah(Color.green(0) + 5, "\u0006\u0002\u000e\u0006㗎", (byte) (37 - TextUtils.indexOf((CharSequence) "", '0')), objArr12);
        String strOptString12 = jSONObjectA.optString(((String) objArr12[0]).intern());
        Object[] objArr13 = new Object[1];
        ah((ViewConfiguration.getMaximumFlingVelocity() >> 16) + 5, "\u0006\u0002\u000e\u0006㘒", (byte) (105 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1))), objArr13);
        String strOptString13 = jSONObjectA.optString(((String) objArr13[0]).intern());
        Object[] objArr14 = new Object[1];
        ah((AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 3, "\u000e\u000b㙏", (byte) (84 - View.combineMeasuredStates(0, 0)), objArr14);
        c(((String) objArr14[0]).intern(), strOptString);
        Object[] objArr15 = new Object[1];
        ah(View.combineMeasuredStates(0, 0) + 2, "\u0000\u000b", (byte) ((ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 103), objArr15);
        c(((String) objArr15[0]).intern(), strOptString3);
        Object[] objArr16 = new Object[1];
        ah(KeyEvent.keyCodeFromString("") + 3, "\u0004\u0002㘚", (byte) (32 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1))), objArr16);
        c(((String) objArr16[0]).intern(), strOptString2);
        Object[] objArr17 = new Object[1];
        ah(6 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), "\u0002\b\u0004\u0001㘸", (byte) (View.getDefaultSize(0, 0) + 61), objArr17);
        c(((String) objArr17[0]).intern(), strOptString4);
        Object[] objArr18 = new Object[1];
        ah((SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 4, "\u000e\t\u0004\u0001㘾", (byte) (66 - ImageFormat.getBitsPerPixel(0)), objArr18);
        c(((String) objArr18[0]).intern(), strOptString5);
        Object[] objArr19 = new Object[1];
        ah(5 - Color.alpha(0), "\u0006\u0002\u0004\f㗰", (byte) ((ViewConfiguration.getDoubleTapTimeout() >> 16) + 69), objArr19);
        c(((String) objArr19[0]).intern(), strOptString6);
        Object[] objArr20 = new Object[1];
        ai((char) (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), MotionEvent.axisFromString("") + 6, objArr20);
        c(((String) objArr20[0]).intern(), strOptString7);
        Object[] objArr21 = new Object[1];
        ai((char) ((-1) - ExpandableListView.getPackedPositionChild(0L)), '5' - AndroidCharacter.getMirror('0'), 5 - (ViewConfiguration.getEdgeSlop() >> 16), objArr21);
        c(((String) objArr21[0]).intern(), strOptString8);
        Object[] objArr22 = new Object[1];
        ah(5 - View.resolveSize(0, 0), "\u0002\b\u0006\t㘶", (byte) (65 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1))), objArr22);
        ch.G(((String) objArr22[0]).intern(), Integer.parseInt(strOptString9));
        Object[] objArr23 = new Object[1];
        ai((char) (41441 - (ViewConfiguration.getTouchSlop() >> 8)), (ViewConfiguration.getScrollBarSize() >> 8) + 10, ImageFormat.getBitsPerPixel(0) + 6, objArr23);
        ch.G(((String) objArr23[0]).intern(), Integer.parseInt(strOptString10));
        Object[] objArr24 = new Object[1];
        ai((char) (Color.blue(0) + TypedValues.TransitionType.TYPE_STAGGERED), TextUtils.indexOf("", "") + 15, 5 - Drawable.resolveOpacity(0, 0), objArr24);
        ch.G(((String) objArr24[0]).intern(), Integer.parseInt(strOptString11));
        Object[] objArr25 = new Object[1];
        ah(ExpandableListView.getPackedPositionType(0L) + 5, "\u0006\u0002\u000e\u0006㗎", (byte) (38 - (ViewConfiguration.getPressedStateDuration() >> 16)), objArr25);
        ch.G(((String) objArr25[0]).intern(), Integer.parseInt(strOptString12));
        Object[] objArr26 = new Object[1];
        ah(5 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), "\u0006\u0002\u000e\u0006㘒", (byte) (TextUtils.lastIndexOf("", '0', 0, 0) + 106), objArr26);
        ch.G(((String) objArr26[0]).intern(), Integer.parseInt(strOptString13));
        try {
            Object[] objArr27 = new Object[1];
            ah(TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 4, "\u000e\u000b㙏", (byte) (83 - Process.getGidForName("")), objArr27);
            jSONObject = jSONObjectA;
            try {
                jSONObject.put(((String) objArr27[0]).intern(), new ArrayList().toString());
                Object[] objArr28 = new Object[1];
                ah(5 - View.combineMeasuredStates(0, 0), "\u0006\u0002\u0004\f㗰", (byte) (Color.rgb(0, 0, 0) + 16777285), objArr28);
                jSONObject.put(((String) objArr28[0]).intern(), new ArrayList().toString());
                Object[] objArr29 = new Object[1];
                ai((char) (ViewConfiguration.getEdgeSlop() >> 16), TextUtils.getTrimmedLength(""), (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 6, objArr29);
                jSONObject.put(((String) objArr29[0]).intern(), new ArrayList().toString());
                Object[] objArr30 = new Object[1];
                ai((char) ((Process.getThreadPriority(0) + 20) >> 6), 5 - TextUtils.getOffsetAfter("", 0), ExpandableListView.getPackedPositionGroup(0L) + 5, objArr30);
                jSONObject.put(((String) objArr30[0]).intern(), new ArrayList().toString());
            } catch (JSONException unused) {
            }
        } catch (JSONException unused2) {
            jSONObject = jSONObjectA;
        }
        Object[] objArr31 = new Object[1];
        ah(3 - View.MeasureSpec.makeMeasureSpec(0, 0), "\u0004\r㙚", (byte) ((ViewConfiguration.getDoubleTapTimeout() >> 16) + 94), objArr31);
        ch.J(((String) objArr31[0]).intern(), jSONObject.toString());
        int i10 = R + 65;
        P = i10 % 128;
        int i11 = i10 % 2;
    }

    @NonNull
    private synchronized List<a> J() {
        try {
            ArrayList arrayList = new ArrayList(this.f40810j.size());
            Iterator<WeakReference<a>> it = this.f40810j.iterator();
            while (!(!it.hasNext())) {
                a aVar = it.next().get();
                if (aVar != null) {
                    arrayList.add(aVar);
                    int i10 = P + 97;
                    R = i10 % 128;
                    int i11 = i10 % 2;
                }
            }
            int i12 = P + 73;
            R = i12 % 128;
            if (i12 % 2 != 0) {
                return arrayList;
            }
            int i13 = 10 / 0;
            return arrayList;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @NonNull
    private synchronized List<b> K() {
        ArrayList arrayList;
        try {
            arrayList = new ArrayList(this.f40808h.size());
            Iterator<WeakReference<b>> it = this.f40808h.iterator();
            int i10 = P + 109;
            R = i10 % 128;
            int i11 = i10 % 2;
            while (it.hasNext()) {
                int i12 = R + 125;
                P = i12 % 128;
                if (i12 % 2 != 0) {
                    it.next().get();
                    throw null;
                }
                b bVar = it.next().get();
                if (bVar != null) {
                    arrayList.add(bVar);
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return arrayList;
    }

    @MainThread
    private synchronized void L() {
        Iterator<e> it;
        try {
            int i10 = P + 53;
            R = i10 % 128;
            if (i10 % 2 == 0) {
                it = M().iterator();
                int i11 = 59 / 0;
            } else {
                it = M().iterator();
            }
            while (it.hasNext()) {
                it.next().e();
                int i12 = P + 5;
                R = i12 % 128;
                int i13 = i12 % 2;
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @NonNull
    private synchronized List<e> M() {
        ArrayList arrayList;
        try {
            arrayList = new ArrayList(this.f40807g.size());
            Iterator<WeakReference<e>> it = this.f40807g.iterator();
            while (it.hasNext()) {
                int i10 = P + 21;
                R = i10 % 128;
                if (i10 % 2 == 0) {
                    it.next().get();
                    throw null;
                }
                e eVar = it.next().get();
                if (eVar != null) {
                    int i11 = R + 97;
                    P = i11 % 128;
                    if (i11 % 2 != 0) {
                        arrayList.add(eVar);
                        throw null;
                    }
                    arrayList.add(eVar);
                    int i12 = P + 73;
                    R = i12 % 128;
                    int i13 = i12 % 2;
                }
                throw th;
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return arrayList;
    }

    private synchronized void N() {
        int i10 = P + 37;
        R = i10 % 128;
        int i11 = 2;
        int i12 = i10 % 2;
        Activity activity = this.f40811k.get();
        if (activity == null) {
            return;
        }
        cj cjVar = this.f40814o;
        int i13 = 1;
        if (cjVar == cj.PROCESSING_COMPLETE_STILL_COMPUTING) {
            int i14 = P + 53;
            R = i14 % 128;
            int i15 = i14 % 2;
            activity.runOnUiThread(new i4(this, i13));
            return;
        }
        if (cjVar == cj.PROCESSING_COMPLETE_TIMED_OUT) {
            activity.runOnUiThread(new x1(this, 3));
            return;
        }
        if (cjVar == cj.PROCESSING_COMPLETE_RETRY) {
            activity.runOnUiThread(new y1(this, i11));
            return;
        }
        if (cjVar != cj.PROCESSING_COMPLETE_SUCCESS) {
            activity.runOnUiThread(new l2(this, i11));
            return;
        }
        int i16 = R + 121;
        P = i16 % 128;
        int i17 = i16 % 2;
        activity.runOnUiThread(new i2(this, i13));
    }

    @MainThread
    private synchronized void O() {
        Iterator<e> it = M().iterator();
        while (!(!it.hasNext())) {
            int i10 = R + 77;
            P = i10 % 128;
            int i11 = i10 % 2;
            it.next().d(this.f40814o, this.f40812l);
        }
        int i12 = R + 59;
        P = i12 % 128;
        if (i12 % 2 != 0) {
            int i13 = 24 / 0;
        }
    }

    @MainThread
    private synchronized void P() {
        int i10 = P + 9;
        R = i10 % 128;
        if (i10 % 2 == 0) {
            M().iterator();
            throw null;
        }
        Iterator<e> it = M().iterator();
        int i11 = R + 3;
        P = i11 % 128;
        int i12 = i11 % 2;
        while (it.hasNext()) {
            it.next().d();
        }
    }

    @MainThread
    private synchronized void Q() {
        try {
            Iterator<e> it = M().iterator();
            int i10 = P + 71;
            R = i10 % 128;
            int i11 = i10 % 2;
            while (!(!it.hasNext())) {
                it.next().c();
            }
            int i12 = P + 51;
            R = i12 % 128;
            if (i12 % 2 == 0) {
                throw null;
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @MainThread
    private synchronized void R() {
        Iterator<e> it = M().iterator();
        int i10 = P + 105;
        R = i10 % 128;
        while (true) {
            int i11 = i10 % 2;
            if (!(!it.hasNext())) {
                int i12 = R + 37;
                P = i12 % 128;
                int i13 = i12 % 2;
                it.next().b();
                i10 = R + 35;
                P = i10 % 128;
            }
        }
    }

    @MainThread
    private synchronized void S() {
        Iterator<b> it;
        try {
            int i10 = P + 17;
            R = i10 % 128;
            if (i10 % 2 == 0) {
                it = K().iterator();
                int i11 = 87 / 0;
            } else {
                it = K().iterator();
            }
            while (it.hasNext()) {
                int i12 = P + 51;
                R = i12 % 128;
                if (i12 % 2 == 0) {
                    it.next().onPreSessionProgress(this.f40817r, this.f40816q, this.f40818s, this.f40815p);
                    throw null;
                }
                it.next().onPreSessionProgress(this.f40817r, this.f40816q, this.f40818s, this.f40815p);
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void T() {
        int i10 = R + 47;
        P = i10 % 128;
        int i11 = i10 % 2;
        O();
        if (i11 != 0) {
            throw null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void U() {
        int i10 = P + 83;
        R = i10 % 128;
        int i11 = i10 % 2;
        P();
        int i12 = R + 45;
        P = i12 % 128;
        if (i12 % 2 != 0) {
            int i13 = 85 / 0;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void V() {
        e(new Object[]{this}, -308258679, 308258683, System.identityHashCode(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void W() {
        int i10 = P + 105;
        R = i10 % 128;
        int i11 = i10 % 2;
        L();
        int i12 = P + 7;
        R = i12 % 128;
        if (i12 % 2 == 0) {
            throw null;
        }
    }

    @MainThread
    private synchronized void X() {
        int i10 = R + 5;
        P = i10 % 128;
        if (i10 % 2 != 0) {
            J().iterator();
            throw null;
        }
        Iterator<a> it = J().iterator();
        while (!(!it.hasNext())) {
            it.next().onIDScanProgress(this.m, this.f40813n);
        }
        int i11 = P + 91;
        R = i11 % 128;
        int i12 = i11 % 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void Y() {
        e(new Object[]{this}, 1176138166, -1176138158, System.identityHashCode(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void Z() {
        int i10 = R + 9;
        P = i10 % 128;
        int i11 = i10 % 2;
        G();
        int i12 = P + 121;
        R = i12 % 128;
        if (i12 % 2 == 0) {
            throw null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void aa() {
        int i10 = R + 19;
        P = i10 % 128;
        int i11 = i10 % 2;
        G();
        int i12 = R + 23;
        P = i12 % 128;
        if (i12 % 2 != 0) {
            throw null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void ab() {
        int i10 = R + 99;
        P = i10 % 128;
        int i11 = i10 % 2;
        X();
        if (i11 != 0) {
            int i12 = 44 / 0;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void ac() {
        e(new Object[]{this}, 1175273414, -1175273407, System.identityHashCode(this));
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0025  */
    /* JADX WARN: Code duplicated, block: B:8:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x0030). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0025
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void ad(byte r6, byte r7, byte r8, java.lang.Object[] r9) {
        /*
            int r6 = 101 - r6
            int r8 = r8 * 3
            int r0 = r8 + 1
            byte[] r1 = com.facetec.sdk.cc.$$a
            int r7 = r7 * 4
            int r7 = 4 - r7
            byte[] r0 = new byte[r0]
            r2 = 0
            if (r1 != 0) goto L17
            r3 = r1
            r4 = r2
            r1 = r0
            r0 = r9
            r9 = r8
            goto L30
        L17:
            r3 = r2
        L18:
            byte r4 = (byte) r6
            r0[r3] = r4
            if (r3 != r8) goto L25
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            r9[r2] = r6
            return
        L25:
            int r3 = r3 + 1
            r4 = r1[r7]
            r5 = r9
            r9 = r8
            r8 = r4
            r4 = r3
            r3 = r1
            r1 = r0
            r0 = r5
        L30:
            int r7 = r7 + 1
            int r6 = r6 + r8
            r8 = r9
            r9 = r0
            r0 = r1
            r1 = r3
            r3 = r4
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facetec.sdk.cc.ad(byte, byte, byte, java.lang.Object[]):void");
    }

    /* JADX WARN: Code duplicated, block: B:48:0x0235  */
    /* JADX WARN: Code duplicated, block: B:49:0x0236  */
    private static void ae(int i10, int i11, int i12, String str, boolean z10, Object[] objArr) throws Throwable {
        Throwable cause;
        char[] charArray = str != null ? str.toCharArray() : str;
        gz gzVar = new gz();
        char[] cArr = new char[i12];
        int i13 = 0;
        gzVar.f41846c = 0;
        while (true) {
            int i14 = gzVar.f41846c;
            if (i14 >= i12) {
                break;
            }
            int i15 = $10 + 75;
            $11 = i15 % 128;
            int i16 = i15 % 2;
            char c10 = charArray[i14];
            gzVar.f41844a = c10;
            char c11 = (char) (i10 + c10);
            cArr[i14] = c11;
            try {
                Object[] objArr2 = new Object[2];
                objArr2[1] = Integer.valueOf(K);
                objArr2[i13] = Integer.valueOf(c11);
                Map map = bp.f40694x;
                Object method = map.get(1917901234);
                if (method == null) {
                    Class cls = (Class) bp.a(22 - ImageFormat.getBitsPerPixel(i13), TextUtils.getOffsetAfter("", i13) + InputDeviceCompat.SOURCE_GAMEPAD, (char) ((ViewConfiguration.getScrollDefaultDelay() >> 16) + 38453));
                    byte b10 = (byte) i13;
                    byte b11 = b10;
                    Object[] objArr3 = new Object[1];
                    aj(b10, b11, (byte) (b11 | 10), objArr3);
                    String str2 = (String) objArr3[0];
                    Class<?> cls2 = Integer.TYPE;
                    method = cls.getMethod(str2, cls2, cls2);
                    map.put(1917901234, method);
                }
                cArr[i14] = ((Character) ((Method) method).invoke(null, objArr2)).charValue();
                Object[] objArr4 = {gzVar, gzVar};
                Object method2 = map.get(-1709307603);
                if (method2 == null) {
                    Class cls3 = (Class) bp.a(24 - KeyEvent.keyCodeFromString(""), ((byte) KeyEvent.getModifierMetaStateMask()) + 766, (char) (36773 - (ViewConfiguration.getTouchSlop() >> 8)));
                    byte b12 = (byte) 0;
                    byte b13 = b12;
                    Object[] objArr5 = new Object[1];
                    aj(b12, b13, (byte) (b13 + 5), objArr5);
                    method2 = cls3.getMethod((String) objArr5[0], Object.class, Object.class);
                    map.put(-1709307603, method2);
                }
                ((Method) method2).invoke(null, objArr4);
                int i17 = $10 + 43;
                $11 = i17 % 128;
                int i18 = i17 % 2;
                i13 = 0;
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
        if (i11 > 0) {
            gzVar.f41845b = i11;
            char[] cArr2 = new char[i12];
            System.arraycopy(cArr, 0, cArr2, 0, i12);
            int i19 = gzVar.f41845b;
            System.arraycopy(cArr2, 0, cArr, i12 - i19, i19);
            int i20 = gzVar.f41845b;
            System.arraycopy(cArr2, i20, cArr, 0, i12 - i20);
        }
        if (z10) {
            int i21 = $10 + 83;
            $11 = i21 % 128;
            int i22 = i21 % 2;
            char[] cArr3 = new char[i12];
            gzVar.f41846c = 0;
            while (true) {
                int i23 = gzVar.f41846c;
                if (i23 >= i12) {
                    break;
                }
                int i24 = $11 + 9;
                $10 = i24 % 128;
                if (i24 % 2 != 0) {
                    cArr3[i23] = cArr[(i12 << i23) / 0];
                    Object[] objArr6 = {gzVar, gzVar};
                    Map map2 = bp.f40694x;
                    Object method3 = map2.get(-1709307603);
                    if (method3 == null) {
                        Class cls4 = (Class) bp.a(24 - View.resolveSizeAndState(0, 0, 0), (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 764, (char) ((Process.myTid() >> 22) + 36773));
                        byte b14 = (byte) 0;
                        byte b15 = b14;
                        Object[] objArr7 = new Object[1];
                        aj(b14, b15, (byte) (b15 + 5), objArr7);
                        method3 = cls4.getMethod((String) objArr7[0], Object.class, Object.class);
                        map2.put(-1709307603, method3);
                    }
                    ((Method) method3).invoke(null, objArr6);
                } else {
                    cArr3[i23] = cArr[(i12 - i23) - 1];
                    Object[] objArr8 = {gzVar, gzVar};
                    Map map3 = bp.f40694x;
                    Object method4 = map3.get(-1709307603);
                    if (method4 == null) {
                        Class cls5 = (Class) bp.a((AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 24, 764 - TextUtils.indexOf((CharSequence) "", '0', 0), (char) (ImageFormat.getBitsPerPixel(0) + 36774));
                        byte b16 = (byte) 0;
                        byte b17 = b16;
                        Object[] objArr9 = new Object[1];
                        aj(b16, b17, (byte) (b17 + 5), objArr9);
                        method4 = cls5.getMethod((String) objArr9[0], Object.class, Object.class);
                        map3.put(-1709307603, method4);
                    }
                    ((Method) method4).invoke(null, objArr8);
                }
            }
            cArr = cArr3;
        }
        objArr[0] = new String(cArr);
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0026  */
    /* JADX WARN: Code duplicated, block: B:8:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:11:0x0030). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0026
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void af(int r6, short r7, short r8, java.lang.Object[] r9) {
        /*
            int r0 = 766 - r8
            int r7 = 118 - r7
            byte[] r1 = com.facetec.sdk.cc.Q
            int r6 = r6 + 4
            byte[] r0 = new byte[r0]
            int r8 = 765 - r8
            r2 = 0
            if (r1 != 0) goto L16
            r7 = r6
            r3 = r1
            r4 = r2
            r1 = r0
            r0 = r9
            r9 = r8
            goto L30
        L16:
            r3 = r2
        L17:
            byte r4 = (byte) r7
            r0[r3] = r4
            int r4 = r3 + 1
            if (r3 != r8) goto L26
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            r9[r2] = r6
            return
        L26:
            r3 = r1[r6]
            r5 = r7
            r7 = r6
            r6 = r3
            r3 = r1
            r1 = r0
            r0 = r9
            r9 = r8
            r8 = r5
        L30:
            int r6 = -r6
            int r6 = r6 + r8
            int r7 = r7 + 1
            r8 = r9
            r9 = r0
            r0 = r1
            r1 = r3
            r3 = r4
            r5 = r7
            r7 = r6
            r6 = r5
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facetec.sdk.cc.af(int, short, short, java.lang.Object[]):void");
    }

    /* JADX WARN: Code duplicated, block: B:36:0x0160  */
    /* JADX WARN: Code duplicated, block: B:37:0x0161  */
    private static void ag(String str, int i10, Object[] objArr) throws Throwable {
        char[] charArray;
        Throwable cause;
        if (str != null) {
            int i11 = $10 + 57;
            $11 = i11 % 128;
            int i12 = i11 % 2;
            charArray = str.toCharArray();
        } else {
            charArray = str;
        }
        char[] cArr = charArray;
        gw gwVar = new gw();
        gwVar.f41836e = i10;
        int length = cArr.length;
        long[] jArr = new long[length];
        gwVar.f41835a = 0;
        while (true) {
            int i13 = gwVar.f41835a;
            if (i13 >= cArr.length) {
                break;
            }
            int i14 = $11 + 117;
            $10 = i14 % 128;
            int i15 = i14 % 2;
            try {
                Object[] objArr2 = {Integer.valueOf(cArr[i13]), gwVar, gwVar};
                Map map = bp.f40694x;
                Object method = map.get(346539884);
                if (method == null) {
                    method = ((Class) bp.a((-16777192) - Color.rgb(0, 0, 0), (ViewConfiguration.getFadingEdgeLength() >> 16) + 245, (char) (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)))).getMethod("r", Integer.TYPE, Object.class, Object.class);
                    map.put(346539884, method);
                }
                jArr[i13] = ((Long) ((Method) method).invoke(null, objArr2)).longValue() ^ (L ^ (-4932774504156859221L));
                Object[] objArr3 = {gwVar, gwVar};
                Object method2 = map.get(593077425);
                if (method2 == null) {
                    method2 = ((Class) bp.a(TextUtils.indexOf((CharSequence) "", '0') + 24, View.resolveSizeAndState(0, 0, 0) + 150, (char) (ViewConfiguration.getScrollDefaultDelay() >> 16))).getMethod("q", Object.class, Object.class);
                    map.put(593077425, method2);
                }
                ((Method) method2).invoke(null, objArr3);
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
        char[] cArr2 = new char[length];
        gwVar.f41835a = 0;
        while (true) {
            int i16 = gwVar.f41835a;
            if (i16 >= cArr.length) {
                objArr[0] = new String(cArr2);
                return;
            }
            cArr2[i16] = (char) jArr[i16];
            Object[] objArr4 = {gwVar, gwVar};
            Map map2 = bp.f40694x;
            Object method3 = map2.get(593077425);
            if (method3 == null) {
                method3 = ((Class) bp.a((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 22, 150 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), (char) (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)))).getMethod("q", Object.class, Object.class);
                map2.put(593077425, method3);
            }
            ((Method) method3).invoke(null, objArr4);
        }
    }

    /* JADX WARN: Code duplicated, block: B:51:0x01c8  */
    /* JADX WARN: Code duplicated, block: B:52:0x01e4  */
    /* JADX WARN: Code duplicated, block: B:57:0x023b A[Catch: all -> 0x00a1, TRY_ENTER, TryCatch #0 {all -> 0x00a1, blocks: (B:13:0x003a, B:17:0x008c, B:16:0x004f, B:23:0x00a6, B:27:0x00fe, B:26:0x00bf, B:31:0x0113, B:35:0x0168, B:53:0x01e6, B:57:0x023b, B:58:0x02a0, B:62:0x02b3, B:66:0x0345, B:65:0x02f6, B:34:0x012e), top: B:82:0x003a }] */
    /* JADX WARN: Code duplicated, block: B:61:0x02b1  */
    /* JADX WARN: Code duplicated, block: B:64:0x02f3  */
    /* JADX WARN: Code duplicated, block: B:65:0x02f6 A[Catch: all -> 0x00a1, TryCatch #0 {all -> 0x00a1, blocks: (B:13:0x003a, B:17:0x008c, B:16:0x004f, B:23:0x00a6, B:27:0x00fe, B:26:0x00bf, B:31:0x0113, B:35:0x0168, B:53:0x01e6, B:57:0x023b, B:58:0x02a0, B:62:0x02b3, B:66:0x0345, B:65:0x02f6, B:34:0x012e), top: B:82:0x003a }] */
    /* JADX WARN: Code duplicated, block: B:68:0x0364  */
    /* JADX WARN: Code duplicated, block: B:70:0x036d  */
    /* JADX WARN: Code duplicated, block: B:71:0x0395  */
    private static void ah(int i10, String str, byte b10, Object[] objArr) throws Throwable {
        int i11;
        char c10;
        Map map;
        Object method;
        int iIntValue;
        int i12;
        int i13;
        int i14;
        Object method2;
        int i15 = $11 + 43;
        $10 = i15 % 128;
        int i16 = 2;
        int i17 = i15 % 2;
        char[] charArray = str != null ? str.toCharArray() : str;
        gv gvVar = new gv();
        char[] cArr = E;
        int i18 = -324767611;
        int i19 = 0;
        if (cArr != null) {
            int length = cArr.length;
            char[] cArr2 = new char[length];
            int i20 = 0;
            while (i20 < length) {
                int i21 = $11 + 17;
                $10 = i21 % 128;
                if (i21 % i16 != 0) {
                    try {
                        Object[] objArr2 = new Object[1];
                        objArr2[i19] = Integer.valueOf(cArr[i20]);
                        Map map2 = bp.f40694x;
                        Object method3 = map2.get(Integer.valueOf(i18));
                        if (method3 == null) {
                            Class cls = (Class) bp.a(KeyEvent.getDeadChar(i19, i19) + 24, TextUtils.indexOf("", "", i19, i19) + 1411, (char) (TypedValue.complexToFraction(i19, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(i19, 0.0f, 0.0f) == 0.0f ? 0 : -1)));
                            byte b11 = (byte) i19;
                            byte b12 = b11;
                            Object[] objArr3 = new Object[1];
                            aj(b11, b12, (byte) (b12 | 6), objArr3);
                            method3 = cls.getMethod((String) objArr3[0], Integer.TYPE);
                            map2.put(-324767611, method3);
                        }
                        cArr2[i20] = ((Character) ((Method) method3).invoke(null, objArr2)).charValue();
                    } catch (Throwable th2) {
                        Throwable cause = th2.getCause();
                        if (cause == null) {
                            throw th2;
                        }
                        throw cause;
                    }
                } else {
                    Object[] objArr4 = {Integer.valueOf(cArr[i20])};
                    Map map3 = bp.f40694x;
                    Object method4 = map3.get(-324767611);
                    if (method4 == null) {
                        Class cls2 = (Class) bp.a(TextUtils.indexOf("", "", 0, 0) + 24, 1411 - (Process.myTid() >> 22), (char) (((byte) KeyEvent.getModifierMetaStateMask()) + 1));
                        byte b13 = (byte) 0;
                        byte b14 = b13;
                        Object[] objArr5 = new Object[1];
                        aj(b13, b14, (byte) (b14 | 6), objArr5);
                        method4 = cls2.getMethod((String) objArr5[0], Integer.TYPE);
                        map3.put(-324767611, method4);
                    }
                    cArr2[i20] = ((Character) ((Method) method4).invoke(null, objArr4)).charValue();
                    i20++;
                }
                i16 = 2;
                i18 = -324767611;
                i19 = 0;
            }
            cArr = cArr2;
        }
        Object[] objArr6 = {Integer.valueOf(N)};
        Map map4 = bp.f40694x;
        Object method5 = map4.get(-324767611);
        char c11 = '0';
        if (method5 == null) {
            Class cls3 = (Class) bp.a(24 - View.combineMeasuredStates(0, 0), 1411 - TextUtils.indexOf("", "", 0, 0), (char) (TextUtils.indexOf((CharSequence) "", '0', 0) + 1));
            byte b15 = (byte) 0;
            byte b16 = b15;
            Object[] objArr7 = new Object[1];
            aj(b15, b16, (byte) (b16 | 6), objArr7);
            method5 = cls3.getMethod((String) objArr7[0], Integer.TYPE);
            map4.put(-324767611, method5);
        }
        char cCharValue = ((Character) ((Method) method5).invoke(null, objArr6)).charValue();
        char[] cArr3 = new char[i10];
        if (i10 % 2 != 0) {
            int i22 = $11 + 75;
            $10 = i22 % 128;
            int i23 = i22 % 2;
            i11 = i10 - 1;
            cArr3[i11] = (char) (charArray[i11] - b10);
        } else {
            i11 = i10;
        }
        if (i11 > 1) {
            int i24 = $10 + 101;
            $11 = i24 % 128;
            int i25 = i24 % 2;
            gvVar.f41832e = 0;
            while (true) {
                int i26 = gvVar.f41832e;
                if (i26 >= i11) {
                    break;
                }
                int i27 = $10 + 85;
                int i28 = i27 % 128;
                $11 = i28;
                if (i27 % 2 == 0) {
                    char c12 = charArray[i26];
                    gvVar.f41829b = c12;
                    char c13 = charArray[i26 % 0];
                    gvVar.f41831d = c13;
                    if (c12 == c13) {
                        int i29 = i28 + 25;
                        $10 = i29 % 128;
                        int i30 = i29 % 2;
                        cArr3[i26] = (char) (gvVar.f41829b - b10);
                        cArr3[i26 + 1] = (char) (gvVar.f41831d - b10);
                        c10 = c11;
                    } else {
                        Object[] objArr8 = {gvVar, gvVar, Integer.valueOf(cCharValue), gvVar, gvVar, Integer.valueOf(cCharValue), gvVar, gvVar, Integer.valueOf(cCharValue), gvVar, gvVar, Integer.valueOf(cCharValue), gvVar};
                        map = bp.f40694x;
                        method = map.get(-779085347);
                        if (method == null) {
                            Class cls4 = (Class) bp.a(23 - (ViewConfiguration.getDoubleTapTimeout() >> 16), (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 718, (char) (AndroidCharacter.getMirror(c11) - '0'));
                            byte b17 = (byte) 0;
                            byte b18 = b17;
                            Object[] objArr9 = new Object[1];
                            aj(b17, b18, b18, objArr9);
                            String str2 = (String) objArr9[0];
                            Class<?> cls5 = Integer.TYPE;
                            method = cls4.getMethod(str2, Object.class, Object.class, cls5, Object.class, Object.class, cls5, Object.class, Object.class, cls5, Object.class, Object.class, cls5, Object.class);
                            map.put(-779085347, method);
                        }
                        iIntValue = ((Integer) ((Method) method).invoke(null, objArr8)).intValue();
                        i12 = gvVar.f41833g;
                        if (iIntValue == i12) {
                            Object[] objArr10 = {gvVar, gvVar, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), gvVar, gvVar, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), gvVar, Integer.valueOf(cCharValue), gvVar};
                            method2 = map.get(531504056);
                            if (method2 != null) {
                                c10 = '0';
                            } else {
                                c10 = '0';
                                Class cls6 = (Class) bp.a(23 - MotionEvent.axisFromString(""), 269 - AndroidCharacter.getMirror('0'), (char) (TextUtils.indexOf((CharSequence) "", '0') + 1));
                                Class<?> cls7 = Integer.TYPE;
                                method2 = cls6.getMethod("l", Object.class, Object.class, cls7, cls7, Object.class, Object.class, cls7, cls7, Object.class, cls7, Object.class);
                                map.put(531504056, method2);
                            }
                            int iIntValue2 = ((Integer) ((Method) method2).invoke(null, objArr10)).intValue();
                            int i31 = (gvVar.f41828a * cCharValue) + gvVar.f41833g;
                            int i32 = gvVar.f41832e;
                            cArr3[i32] = cArr[iIntValue2];
                            cArr3[i32 + 1] = cArr[i31];
                        } else {
                            c10 = '0';
                            i13 = gvVar.f41830c;
                            i14 = gvVar.f41828a;
                            if (i13 == i14) {
                                int i33 = $10 + 121;
                                $11 = i33 % 128;
                                int i34 = i33 % 2;
                                int iA = androidx.activity.a.a(gvVar.f41834j, cCharValue, 1, cCharValue);
                                gvVar.f41834j = iA;
                                int iA2 = androidx.activity.a.a(i12, cCharValue, 1, cCharValue);
                                gvVar.f41833g = iA2;
                                int i35 = (i14 * cCharValue) + iA2;
                                int i36 = gvVar.f41832e;
                                cArr3[i36] = cArr[(i13 * cCharValue) + iA];
                                cArr3[i36 + 1] = cArr[i35];
                            } else {
                                int i37 = (i13 * cCharValue) + i12;
                                int i38 = (i14 * cCharValue) + gvVar.f41834j;
                                int i39 = gvVar.f41832e;
                                cArr3[i39] = cArr[i37];
                                cArr3[i39 + 1] = cArr[i38];
                            }
                        }
                    }
                } else {
                    char c14 = charArray[i26];
                    gvVar.f41829b = c14;
                    char c15 = charArray[i26 + 1];
                    gvVar.f41831d = c15;
                    if (c14 == c15) {
                        int i210 = i28 + 25;
                        $10 = i210 % 128;
                        int i310 = i210 % 2;
                        cArr3[i26] = (char) (gvVar.f41829b - b10);
                        cArr3[i26 + 1] = (char) (gvVar.f41831d - b10);
                        c10 = c11;
                    } else {
                        Object[] objArr11 = {gvVar, gvVar, Integer.valueOf(cCharValue), gvVar, gvVar, Integer.valueOf(cCharValue), gvVar, gvVar, Integer.valueOf(cCharValue), gvVar, gvVar, Integer.valueOf(cCharValue), gvVar};
                        map = bp.f40694x;
                        method = map.get(-779085347);
                        if (method == null) {
                            Class cls8 = (Class) bp.a(23 - (ViewConfiguration.getDoubleTapTimeout() >> 16), (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 718, (char) (AndroidCharacter.getMirror(c11) - '0'));
                            byte b19 = (byte) 0;
                            byte b110 = b19;
                            Object[] objArr12 = new Object[1];
                            aj(b19, b110, b110, objArr12);
                            String str3 = (String) objArr12[0];
                            Class<?> cls9 = Integer.TYPE;
                            method = cls8.getMethod(str3, Object.class, Object.class, cls9, Object.class, Object.class, cls9, Object.class, Object.class, cls9, Object.class, Object.class, cls9, Object.class);
                            map.put(-779085347, method);
                        }
                        iIntValue = ((Integer) ((Method) method).invoke(null, objArr11)).intValue();
                        i12 = gvVar.f41833g;
                        if (iIntValue == i12) {
                            Object[] objArr13 = {gvVar, gvVar, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), gvVar, gvVar, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), gvVar, Integer.valueOf(cCharValue), gvVar};
                            method2 = map.get(531504056);
                            if (method2 != null) {
                                c10 = '0';
                            } else {
                                c10 = '0';
                                Class cls10 = (Class) bp.a(23 - MotionEvent.axisFromString(""), 269 - AndroidCharacter.getMirror('0'), (char) (TextUtils.indexOf((CharSequence) "", '0') + 1));
                                Class<?> cls11 = Integer.TYPE;
                                method2 = cls10.getMethod("l", Object.class, Object.class, cls11, cls11, Object.class, Object.class, cls11, cls11, Object.class, cls11, Object.class);
                                map.put(531504056, method2);
                            }
                            int iIntValue3 = ((Integer) ((Method) method2).invoke(null, objArr13)).intValue();
                            int i311 = (gvVar.f41828a * cCharValue) + gvVar.f41833g;
                            int i312 = gvVar.f41832e;
                            cArr3[i312] = cArr[iIntValue3];
                            cArr3[i312 + 1] = cArr[i311];
                        } else {
                            c10 = '0';
                            i13 = gvVar.f41830c;
                            i14 = gvVar.f41828a;
                            if (i13 == i14) {
                                int i313 = $10 + 121;
                                $11 = i313 % 128;
                                int i314 = i313 % 2;
                                int iA3 = androidx.activity.a.a(gvVar.f41834j, cCharValue, 1, cCharValue);
                                gvVar.f41834j = iA3;
                                int iA4 = androidx.activity.a.a(i12, cCharValue, 1, cCharValue);
                                gvVar.f41833g = iA4;
                                int i315 = (i14 * cCharValue) + iA4;
                                int i316 = gvVar.f41832e;
                                cArr3[i316] = cArr[(i13 * cCharValue) + iA3];
                                cArr3[i316 + 1] = cArr[i315];
                            } else {
                                int i317 = (i13 * cCharValue) + i12;
                                int i318 = (i14 * cCharValue) + gvVar.f41834j;
                                int i319 = gvVar.f41832e;
                                cArr3[i319] = cArr[i317];
                                cArr3[i319 + 1] = cArr[i318];
                            }
                        }
                    }
                }
                gvVar.f41832e += 2;
                c11 = c10;
            }
        }
        for (int i40 = 0; i40 < i10; i40++) {
            cArr3[i40] = (char) (cArr3[i40] ^ 13722);
        }
        objArr[0] = new String(cArr3);
    }

    /* JADX WARN: Code duplicated, block: B:47:0x0228  */
    /* JADX WARN: Code duplicated, block: B:48:0x0229  */
    private static void ai(char c10, int i10, int i11, Object[] objArr) throws Throwable {
        int i12;
        Throwable cause;
        gt gtVar = new gt();
        long[] jArr = new long[i11];
        gtVar.f41826d = 0;
        while (true) {
            int i13 = gtVar.f41826d;
            if (i13 >= i11) {
                break;
            }
            try {
                Object[] objArr2 = {Integer.valueOf(M[i10 + i13])};
                Map map = bp.f40694x;
                Object method = map.get(-167668390);
                if (method == null) {
                    method = ((Class) bp.a(24 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), (ViewConfiguration.getKeyRepeatDelay() >> 16) + 245, (char) (1 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1))))).getMethod("d", Integer.TYPE);
                    map.put(-167668390, method);
                }
                Object[] objArr3 = {Long.valueOf(((Long) ((Method) method).invoke(null, objArr2)).longValue()), Long.valueOf(gtVar.f41826d), Long.valueOf(J), Integer.valueOf(c10)};
                Object method2 = map.get(-1565725271);
                if (method2 == null) {
                    Class cls = (Class) bp.a(24 - View.MeasureSpec.getMode(0), 1672 - View.getDefaultSize(0, 0), (char) ((ViewConfiguration.getLongPressTimeout() >> 16) + 58390));
                    byte b10 = (byte) 0;
                    byte b11 = b10;
                    Object[] objArr4 = new Object[1];
                    aj(b10, b11, (byte) (b11 | 12), objArr4);
                    String str = (String) objArr4[0];
                    Class<?> cls2 = Long.TYPE;
                    method2 = cls.getMethod(str, cls2, cls2, cls2, Integer.TYPE);
                    map.put(-1565725271, method2);
                }
                jArr[i13] = ((Long) ((Method) method2).invoke(null, objArr3)).longValue();
                Object[] objArr5 = {gtVar, gtVar};
                Object method3 = map.get(453950717);
                if (method3 == null) {
                    method3 = ((Class) bp.a((ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 23, 269 - ExpandableListView.getPackedPositionGroup(0L), (char) (25687 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1))))).getMethod("b", Object.class, Object.class);
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
        char[] cArr = new char[i11];
        gtVar.f41826d = 0;
        int i14 = $10 + 25;
        $11 = i14 % 128;
        int i15 = 2;
        int i16 = i14 % 2;
        while (true) {
            int i17 = gtVar.f41826d;
            if (i17 >= i11) {
                objArr[0] = new String(cArr);
                return;
            }
            int i18 = $10 + 65;
            $11 = i18 % 128;
            if (i18 % i15 == 0) {
                cArr[i17] = (char) jArr[i17];
                Object[] objArr6 = new Object[i15];
                objArr6[1] = gtVar;
                objArr6[0] = gtVar;
                Map map2 = bp.f40694x;
                Object method4 = map2.get(453950717);
                if (method4 == null) {
                    method4 = ((Class) bp.a(((byte) KeyEvent.getModifierMetaStateMask()) + 25, Color.argb(0, 0, 0, 0) + 269, (char) (25686 - (ViewConfiguration.getWindowTouchSlop() >> 8)))).getMethod("b", Object.class, Object.class);
                    map2.put(453950717, method4);
                }
                ((Method) method4).invoke(null, objArr6);
                throw null;
            }
            cArr[i17] = (char) jArr[i17];
            Object[] objArr7 = {gtVar, gtVar};
            Map map3 = bp.f40694x;
            Object method5 = map3.get(453950717);
            if (method5 != null) {
                i12 = 2;
            } else {
                i12 = 2;
                method5 = ((Class) bp.a(TextUtils.getOffsetBefore("", 0) + 24, 269 - Color.alpha(0), (char) (TextUtils.lastIndexOf("", '0', 0, 0) + 25687))).getMethod("b", Object.class, Object.class);
                map3.put(453950717, method5);
            }
            ((Method) method5).invoke(null, objArr7);
            i15 = i12;
        }
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0025  */
    /* JADX WARN: Code duplicated, block: B:8:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x002a). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0025
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void aj(int r7, int r8, byte r9, java.lang.Object[] r10) {
        /*
            int r7 = r7 * 3
            int r7 = 4 - r7
            byte[] r0 = com.facetec.sdk.cc.$$d
            int r9 = 111 - r9
            int r8 = r8 * 3
            int r8 = 1 - r8
            byte[] r1 = new byte[r8]
            r2 = 0
            if (r0 != 0) goto L15
            r3 = r9
            r5 = r2
            r9 = r8
            goto L2a
        L15:
            r3 = r2
        L16:
            byte r4 = (byte) r9
            int r5 = r3 + 1
            r1[r3] = r4
            if (r5 != r8) goto L25
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            r10[r2] = r7
            return
        L25:
            r3 = r0[r7]
            r6 = r9
            r9 = r8
            r8 = r6
        L2a:
            int r3 = -r3
            int r8 = r8 + r3
            int r7 = r7 + 1
            r3 = r5
            r6 = r9
            r9 = r8
            r8 = r6
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facetec.sdk.cc.aj(int, int, byte, java.lang.Object[]):void");
    }

    public static synchronized cc b(Activity activity) throws Throwable {
        cc ccVar;
        try {
            int i10 = R + 121;
            P = i10 % 128;
            int i11 = i10 % 2;
            if (f40803e == null) {
                f40803e = new cc(activity);
                boolean zC = ch.c(activity);
                if (!F && !zC) {
                    throw new AssertionError();
                }
            }
            ccVar = f40803e;
            int i12 = R + 103;
            P = i12 % 128;
            if (i12 % 2 != 0) {
                throw null;
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return ccVar;
    }

    private static /* synthetic */ Object d(Object[] objArr) {
        cc ccVar = (cc) objArr[0];
        v vVar = ccVar.C;
        if (vVar != null) {
            int i10 = R + 71;
            P = i10 % 128;
            if (i10 % 2 != 0) {
                c cVar = c.NOT_STARTED;
                throw null;
            }
            if (ccVar.f40820u != c.ID_SCAN) {
                vVar.d(false);
                return null;
            }
        }
        int i11 = P + 113;
        R = i11 % 128;
        int i12 = i11 % 2;
        return null;
    }

    public static void init$0() {
        $$a = new byte[]{59, -111, 25, -88};
        $$b = 51;
    }

    public static void init$1() {
        $$d = new byte[]{75, -55, -56, -106};
        $$e = 168;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:23:0x01b6  */
    /* JADX WARN: Code duplicated, block: B:26:0x024b  */
    /* JADX WARN: Code duplicated, block: B:27:0x024c A[Catch: all -> 0x01b3, TryCatch #0 {all -> 0x01b3, blocks: (B:11:0x00fe, B:15:0x0153, B:19:0x01a9, B:35:0x0383, B:39:0x03d9, B:43:0x042f, B:42:0x03fb, B:38:0x039e, B:46:0x048e, B:50:0x04de, B:54:0x052d, B:53:0x0500, B:49:0x04a9, B:18:0x0174, B:14:0x011c, B:24:0x0225, B:28:0x0290, B:27:0x024c), top: B:64:0x0054 }] */
    public void x() throws Throwable {
        Map map;
        Object method;
        Object[] objArr;
        int i10 = P + 125;
        R = i10 % 128;
        int i11 = i10 % 2;
        try {
            Class cls = (Class) bp.a((ViewConfiguration.getPressedStateDuration() >> 16) + 23, 388 - (ViewConfiguration.getWindowTouchSlop() >> 8), (char) (KeyEvent.getMaxKeyCode() >> 16));
            byte b10 = (byte) 0;
            byte b11 = b10;
            byte b12 = b11;
            Object[] objArr2 = new Object[1];
            ad(b10, b11, b12, objArr2);
            long j10 = cls.getField((String) objArr2[0]).getLong(null);
            try {
                if (j10 != -1) {
                    int i12 = R + 11;
                    P = i12 % 128;
                    int i13 = i12 % 2;
                    long j11 = j10 + 1985;
                    Object[] objArr3 = new Object[1];
                    ae(TextUtils.lastIndexOf("", '0', 0) + 293, (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 1, TextUtils.lastIndexOf("", '0') + 23, "\b\ufffe\u000b\u0001\u000f\f\u0006\u0001ￋ\f\u0010ￋ\ufff0\u0016\u0010\u0011\u0002\n￠\t\f\u0000", false, objArr3);
                    Class<?> cls2 = Class.forName((String) objArr3[0]);
                    Object[] objArr4 = new Object[1];
                    ae(296 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), 12 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), 15 - Color.alpha(0), "\ufffa\t\f\ufffe�￫\ufffe\ufffa\u0005\r\u0002\u0006\ufffe\ufffe\u0005", false, objArr4);
                    if (j11 >= ((Long) cls2.getDeclaredMethod((String) objArr4[0], new Class[0]).invoke(null, new Object[0])).longValue()) {
                        Class cls3 = (Class) bp.a(22 - MotionEvent.axisFromString(""), 388 - KeyEvent.getDeadChar(0, 0), (char) ('0' - AndroidCharacter.getMirror('0')));
                        byte b13 = (byte) ($$b & 15);
                        byte b14 = (byte) (b13 - 3);
                        Object[] objArr5 = new Object[1];
                        ad(b13, b14, b14, objArr5);
                        Object obj = cls3.getField((String) objArr5[0]).get(null);
                        Object[] objArr6 = {-586666007, 0};
                        Map map2 = bp.f40694x;
                        Object method2 = map2.get(1463901671);
                        if (method2 == null) {
                            Class cls4 = (Class) bp.a(TextUtils.lastIndexOf("", '0', 0) + 24, 388 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), (char) ExpandableListView.getPackedPositionType(0L));
                            Object[] objArr7 = new Object[1];
                            ad(b10, b11, b12, objArr7);
                            String str = (String) objArr7[0];
                            Class<?> cls5 = Integer.TYPE;
                            method2 = cls4.getMethod(str, cls5, cls5);
                            map2.put(1463901671, method2);
                        }
                        Object[] objArr8 = {obj, Integer.valueOf(((Integer) ((Method) method2).invoke(null, objArr6)).intValue())};
                        Object method3 = map2.get(-2142901683);
                        if (method3 == null) {
                            method3 = ((Class) bp.a(24 - (ViewConfiguration.getWindowTouchSlop() >> 8), 1837 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), (char) ((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) - 1))).getMethod("a", Object[].class, Integer.TYPE);
                            map2.put(-2142901683, method3);
                        }
                        objArr = (Object[]) ((Method) method3).invoke(null, objArr8);
                    } else {
                        Object[] objArr9 = new Object[1];
                        ae(292 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), (ViewConfiguration.getScrollBarSize() >> 8) + 15, 16 - (Process.myPid() >> 22), "\u0003\u0012\u0011\u0017\ufff1ￌ\u0005\f\uffff\nￌ\uffff\u0014\uffff\b\u000b", true, objArr9);
                        Class<?> cls6 = Class.forName((String) objArr9[0]);
                        Object[] objArr10 = new Object[1];
                        ae(295 - KeyEvent.keyCodeFromString(""), (ViewConfiguration.getTapTimeout() >> 16) + 7, (ViewConfiguration.getFadingEdgeLength() >> 16) + 16, "\ufffb\r\u0002\uffdd\t\ufffe\uffff\u0003\ufffe\uffff\b\u000e\u0003\u000e\u0013￢", false, objArr10);
                        Object[] objArr11 = {Integer.valueOf(((Integer) cls6.getMethod((String) objArr10[0], Object.class).invoke(null, this)).intValue()), 0, -586666007};
                        map = bp.f40694x;
                        method = map.get(388357536);
                        if (method != null) {
                            Class cls7 = (Class) bp.a(23 - (KeyEvent.getMaxKeyCode() >> 16), KeyEvent.getDeadChar(0, 0) + 388, (char) Color.blue(0));
                            byte b15 = (byte) ($$b & 14);
                            byte b16 = (byte) (b15 - 2);
                            Object[] objArr12 = new Object[1];
                            ad(b15, b16, b16, objArr12);
                            String str2 = (String) objArr12[0];
                            Class<?> cls8 = Integer.TYPE;
                            method = cls7.getMethod(str2, cls8, cls8, cls8);
                            map.put(388357536, method);
                        }
                        objArr = (Object[]) ((Method) method).invoke(null, objArr11);
                        Class cls9 = (Class) bp.a(Color.green(0) + 23, (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 387, (char) (ExpandableListView.getPackedPositionChild(0L) + 1));
                        byte b17 = (byte) ($$b & 15);
                        byte b18 = (byte) (b17 - 3);
                        Object[] objArr13 = new Object[1];
                        ad(b17, b18, b18, objArr13);
                        cls9.getField((String) objArr13[0]).set(null, objArr);
                        try {
                            Object[] objArr14 = new Object[1];
                            ae(291 - Process.getGidForName(""), 1 - Gravity.getAbsoluteGravity(0, 0), (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 21, "\b\ufffe\u000b\u0001\u000f\f\u0006\u0001ￋ\f\u0010ￋ\ufff0\u0016\u0010\u0011\u0002\n￠\t\f\u0000", false, objArr14);
                            Class<?> cls10 = Class.forName((String) objArr14[0]);
                            Object[] objArr15 = new Object[1];
                            ae((ViewConfiguration.getJumpTapTimeout() >> 16) + 296, (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 13, Color.green(0) + 15, "\ufffa\t\f\ufffe�￫\ufffe\ufffa\u0005\r\u0002\u0006\ufffe\ufffe\u0005", false, objArr15);
                            Long lValueOf = Long.valueOf(((Long) cls10.getDeclaredMethod((String) objArr15[0], new Class[0]).invoke(null, new Object[0])).longValue());
                            Class cls11 = (Class) bp.a((ViewConfiguration.getLongPressTimeout() >> 16) + 23, AndroidCharacter.getMirror('0') + 340, (char) (ViewConfiguration.getJumpTapTimeout() >> 16));
                            Object[] objArr16 = new Object[1];
                            ad(b10, b11, b12, objArr16);
                            cls11.getField((String) objArr16[0]).set(null, lValueOf);
                        } catch (Exception unused) {
                            throw new RuntimeException();
                        }
                    }
                } else {
                    Object[] objArr17 = new Object[1];
                    ae(292 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), (ViewConfiguration.getScrollBarSize() >> 8) + 15, 16 - (Process.myPid() >> 22), "\u0003\u0012\u0011\u0017\ufff1ￌ\u0005\f\uffff\nￌ\uffff\u0014\uffff\b\u000b", true, objArr17);
                    Class<?> cls12 = Class.forName((String) objArr17[0]);
                    Object[] objArr18 = new Object[1];
                    ae(295 - KeyEvent.keyCodeFromString(""), (ViewConfiguration.getTapTimeout() >> 16) + 7, (ViewConfiguration.getFadingEdgeLength() >> 16) + 16, "\ufffb\r\u0002\uffdd\t\ufffe\uffff\u0003\ufffe\uffff\b\u000e\u0003\u000e\u0013￢", false, objArr18);
                    Object[] objArr19 = {Integer.valueOf(((Integer) cls12.getMethod((String) objArr18[0], Object.class).invoke(null, this)).intValue()), 0, -586666007};
                    map = bp.f40694x;
                    method = map.get(388357536);
                    if (method != null) {
                        Class cls13 = (Class) bp.a(23 - (KeyEvent.getMaxKeyCode() >> 16), KeyEvent.getDeadChar(0, 0) + 388, (char) Color.blue(0));
                        byte b19 = (byte) ($$b & 14);
                        byte b110 = (byte) (b19 - 2);
                        Object[] objArr110 = new Object[1];
                        ad(b19, b110, b110, objArr110);
                        String str3 = (String) objArr110[0];
                        Class<?> cls14 = Integer.TYPE;
                        method = cls13.getMethod(str3, cls14, cls14, cls14);
                        map.put(388357536, method);
                    }
                    objArr = (Object[]) ((Method) method).invoke(null, objArr19);
                    Class cls15 = (Class) bp.a(Color.green(0) + 23, (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 387, (char) (ExpandableListView.getPackedPositionChild(0L) + 1));
                    byte b111 = (byte) ($$b & 15);
                    byte b112 = (byte) (b111 - 3);
                    Object[] objArr111 = new Object[1];
                    ad(b111, b112, b112, objArr111);
                    cls15.getField((String) objArr111[0]).set(null, objArr);
                    Object[] objArr112 = new Object[1];
                    ae(291 - Process.getGidForName(""), 1 - Gravity.getAbsoluteGravity(0, 0), (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 21, "\b\ufffe\u000b\u0001\u000f\f\u0006\u0001ￋ\f\u0010ￋ\ufff0\u0016\u0010\u0011\u0002\n￠\t\f\u0000", false, objArr112);
                    Class<?> cls16 = Class.forName((String) objArr112[0]);
                    Object[] objArr113 = new Object[1];
                    ae((ViewConfiguration.getJumpTapTimeout() >> 16) + 296, (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 13, Color.green(0) + 15, "\ufffa\t\f\ufffe�￫\ufffe\ufffa\u0005\r\u0002\u0006\ufffe\ufffe\u0005", false, objArr113);
                    Long lValueOf2 = Long.valueOf(((Long) cls16.getDeclaredMethod((String) objArr113[0], new Class[0]).invoke(null, new Object[0])).longValue());
                    Class cls17 = (Class) bp.a((ViewConfiguration.getLongPressTimeout() >> 16) + 23, AndroidCharacter.getMirror('0') + 340, (char) (ViewConfiguration.getJumpTapTimeout() >> 16));
                    Object[] objArr114 = new Object[1];
                    ad(b10, b11, b12, objArr114);
                    cls17.getField((String) objArr114[0]).set(null, lValueOf2);
                }
                int i14 = ((int[]) objArr[1])[0];
                int i15 = ((int[]) objArr[0])[0];
                if (i15 == i14) {
                    int i16 = P + 17;
                    R = i16 % 128;
                    int i17 = i16 % 2;
                    Object[] objArr20 = {Integer.valueOf(((int[]) objArr[9])[0]), 0};
                    Map map3 = bp.f40694x;
                    Object method4 = map3.get(1463901671);
                    if (method4 == null) {
                        Class cls18 = (Class) bp.a(23 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), 388 - (ViewConfiguration.getTouchSlop() >> 8), (char) (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)));
                        Object[] objArr21 = new Object[1];
                        ad(b10, b11, b12, objArr21);
                        String str4 = (String) objArr21[0];
                        Class<?> cls19 = Integer.TYPE;
                        method4 = cls18.getMethod(str4, cls19, cls19);
                        map3.put(1463901671, method4);
                    }
                    Object[] objArr22 = {objArr, Integer.valueOf(((Integer) ((Method) method4).invoke(null, objArr20)).intValue())};
                    Object method5 = map3.get(-2142901683);
                    if (method5 == null) {
                        method5 = ((Class) bp.a(((Process.getThreadPriority(0) + 20) >> 6) + 24, (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 1835, (char) (TextUtils.lastIndexOf("", '0', 0) + 1))).getMethod("a", Object[].class, Integer.TYPE);
                        map3.put(-2142901683, method5);
                    }
                    ((Method) method5).invoke(null, objArr22);
                    return;
                }
                ArrayList arrayList = new ArrayList();
                arrayList.add((String) objArr[2]);
                arrayList.add((String) objArr[3]);
                arrayList.add((String) objArr[4]);
                arrayList.add((String) objArr[5]);
                arrayList.add((String) objArr[6]);
                arrayList.add((String) objArr[7]);
                arrayList.add((String) objArr[8]);
                int[] iArr = new int[i15];
                int i18 = i15 - 1;
                iArr[i18] = 1;
                Toast.makeText((Context) null, iArr[((i15 * i18) % 2) - 1], 1).show();
                Object[] objArr23 = {Integer.valueOf(((int[]) objArr[9])[0]), 0};
                Map map4 = bp.f40694x;
                Object method6 = map4.get(1463901671);
                if (method6 == null) {
                    Class cls20 = (Class) bp.a(View.resolveSize(0, 0) + 23, 389 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), (char) TextUtils.getOffsetAfter("", 0));
                    Object[] objArr24 = new Object[1];
                    ad(b10, b11, b12, objArr24);
                    String str5 = (String) objArr24[0];
                    Class<?> cls21 = Integer.TYPE;
                    method6 = cls20.getMethod(str5, cls21, cls21);
                    map4.put(1463901671, method6);
                }
                Object[] objArr25 = {objArr, Integer.valueOf(((Integer) ((Method) method6).invoke(null, objArr23)).intValue())};
                Object method7 = map4.get(-2142901683);
                if (method7 == null) {
                    method7 = ((Class) bp.a((PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 24, 1836 - TextUtils.indexOf("", "", 0), (char) Color.green(0))).getMethod("a", Object[].class, Integer.TYPE);
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
    /* JADX WARN: Code duplicated, block: B:24:0x01aa  */
    /* JADX WARN: Code duplicated, block: B:27:0x0237  */
    /* JADX WARN: Code duplicated, block: B:28:0x0238 A[Catch: all -> 0x01a7, TryCatch #1 {all -> 0x01a7, blocks: (B:12:0x00f7, B:16:0x0152, B:20:0x019d, B:36:0x036b, B:40:0x03bb, B:44:0x0407, B:43:0x03dd, B:39:0x0386, B:47:0x0466, B:51:0x04ba, B:55:0x050b, B:54:0x04dc, B:50:0x0481, B:19:0x0173, B:15:0x0115, B:25:0x0211, B:29:0x0281, B:28:0x0238), top: B:70:0x0053 }] */
    public void y() throws Throwable {
        Map map;
        Object method;
        Object[] objArr;
        int i10 = R + 87;
        P = i10 % 128;
        if (i10 % 2 != 0) {
            throw null;
        }
        try {
            Class cls = (Class) bp.a(23 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), 387 - TextUtils.lastIndexOf("", '0', 0, 0), (char) (ViewConfiguration.getLongPressTimeout() >> 16));
            byte b10 = (byte) 0;
            byte b11 = b10;
            byte b12 = b11;
            Object[] objArr2 = new Object[1];
            ad(b10, b11, b12, objArr2);
            long j10 = cls.getField((String) objArr2[0]).getLong(null);
            try {
                if (j10 != -1) {
                    int i11 = R + 13;
                    P = i11 % 128;
                    int i12 = i11 % 2;
                    long j11 = j10 + 2004;
                    Object[] objArr3 = new Object[1];
                    ae(292 - ExpandableListView.getPackedPositionGroup(0L), (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 21, "\b\ufffe\u000b\u0001\u000f\f\u0006\u0001ￋ\f\u0010ￋ\ufff0\u0016\u0010\u0011\u0002\n￠\t\f\u0000", false, objArr3);
                    Class<?> cls2 = Class.forName((String) objArr3[0]);
                    Object[] objArr4 = new Object[1];
                    ae(296 - View.MeasureSpec.getMode(0), 13 - KeyEvent.keyCodeFromString(""), TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 16, "\ufffa\t\f\ufffe�￫\ufffe\ufffa\u0005\r\u0002\u0006\ufffe\ufffe\u0005", false, objArr4);
                    if (j11 >= ((Long) cls2.getDeclaredMethod((String) objArr4[0], new Class[0]).invoke(null, new Object[0])).longValue()) {
                        Class cls3 = (Class) bp.a(23 - KeyEvent.normalizeMetaState(0), 388 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), (char) TextUtils.getOffsetBefore("", 0));
                        byte b13 = (byte) ($$b & 15);
                        byte b14 = (byte) (b13 - 3);
                        Object[] objArr5 = new Object[1];
                        ad(b13, b14, b14, objArr5);
                        Object obj = cls3.getField((String) objArr5[0]).get(null);
                        Object[] objArr6 = {-570313585, 0};
                        Map map2 = bp.f40694x;
                        Object method2 = map2.get(1463901671);
                        if (method2 == null) {
                            Class cls4 = (Class) bp.a(23 - (ViewConfiguration.getTapTimeout() >> 16), TextUtils.lastIndexOf("", '0', 0, 0) + 389, (char) ((Process.getThreadPriority(0) + 20) >> 6));
                            Object[] objArr7 = new Object[1];
                            ad(b10, b11, b12, objArr7);
                            String str = (String) objArr7[0];
                            Class<?> cls5 = Integer.TYPE;
                            method2 = cls4.getMethod(str, cls5, cls5);
                            map2.put(1463901671, method2);
                        }
                        Object[] objArr8 = {obj, Integer.valueOf(((Integer) ((Method) method2).invoke(null, objArr6)).intValue())};
                        Object method3 = map2.get(-2142901683);
                        if (method3 == null) {
                            method3 = ((Class) bp.a(23 - Process.getGidForName(""), 1836 - TextUtils.getOffsetBefore("", 0), (char) TextUtils.indexOf("", ""))).getMethod("a", Object[].class, Integer.TYPE);
                            map2.put(-2142901683, method3);
                        }
                        objArr = (Object[]) ((Method) method3).invoke(null, objArr8);
                    } else {
                        Object[] objArr9 = new Object[1];
                        ae(291 - (Process.myTid() >> 22), TextUtils.indexOf("", "") + 15, TextUtils.getOffsetBefore("", 0) + 16, "\u0003\u0012\u0011\u0017\ufff1ￌ\u0005\f\uffff\nￌ\uffff\u0014\uffff\b\u000b", true, objArr9);
                        Class<?> cls6 = Class.forName((String) objArr9[0]);
                        Object[] objArr10 = new Object[1];
                        ae(295 - (ViewConfiguration.getKeyRepeatDelay() >> 16), TextUtils.indexOf("", "") + 7, KeyEvent.getDeadChar(0, 0) + 16, "\ufffb\r\u0002\uffdd\t\ufffe\uffff\u0003\ufffe\uffff\b\u000e\u0003\u000e\u0013￢", false, objArr10);
                        Object[] objArr11 = {Integer.valueOf(((Integer) cls6.getMethod((String) objArr10[0], Object.class).invoke(null, this)).intValue()), 0, -570313585};
                        map = bp.f40694x;
                        method = map.get(388357536);
                        if (method != null) {
                            Class cls7 = (Class) bp.a(22 - ((byte) KeyEvent.getModifierMetaStateMask()), 389 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), (char) (1 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1))));
                            byte b15 = (byte) ($$b & 14);
                            byte b16 = (byte) (b15 - 2);
                            Object[] objArr12 = new Object[1];
                            ad(b15, b16, b16, objArr12);
                            String str2 = (String) objArr12[0];
                            Class<?> cls8 = Integer.TYPE;
                            method = cls7.getMethod(str2, cls8, cls8, cls8);
                            map.put(388357536, method);
                        }
                        objArr = (Object[]) ((Method) method).invoke(null, objArr11);
                        Class cls9 = (Class) bp.a(22 - ((byte) KeyEvent.getModifierMetaStateMask()), View.resolveSize(0, 0) + 388, (char) View.getDefaultSize(0, 0));
                        byte b17 = (byte) ($$b & 15);
                        byte b18 = (byte) (b17 - 3);
                        Object[] objArr13 = new Object[1];
                        ad(b17, b18, b18, objArr13);
                        cls9.getField((String) objArr13[0]).set(null, objArr);
                        try {
                            Object[] objArr14 = new Object[1];
                            ae(Color.alpha(0) + 292, 1 - (ViewConfiguration.getDoubleTapTimeout() >> 16), 23 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), "\b\ufffe\u000b\u0001\u000f\f\u0006\u0001ￋ\f\u0010ￋ\ufff0\u0016\u0010\u0011\u0002\n￠\t\f\u0000", false, objArr14);
                            Class<?> cls10 = Class.forName((String) objArr14[0]);
                            Object[] objArr15 = new Object[1];
                            ae(Color.blue(0) + 296, ExpandableListView.getPackedPositionGroup(0L) + 13, (ViewConfiguration.getPressedStateDuration() >> 16) + 15, "\ufffa\t\f\ufffe�￫\ufffe\ufffa\u0005\r\u0002\u0006\ufffe\ufffe\u0005", false, objArr15);
                            Long lValueOf = Long.valueOf(((Long) cls10.getDeclaredMethod((String) objArr15[0], new Class[0]).invoke(null, new Object[0])).longValue());
                            Class cls11 = (Class) bp.a(23 - Color.green(0), 388 - ((Process.getThreadPriority(0) + 20) >> 6), (char) ((SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) - 1));
                            Object[] objArr16 = new Object[1];
                            ad(b10, b11, b12, objArr16);
                            cls11.getField((String) objArr16[0]).set(null, lValueOf);
                        } catch (Exception unused) {
                            throw new RuntimeException();
                        }
                    }
                } else {
                    Object[] objArr17 = new Object[1];
                    ae(291 - (Process.myTid() >> 22), TextUtils.indexOf("", "") + 15, TextUtils.getOffsetBefore("", 0) + 16, "\u0003\u0012\u0011\u0017\ufff1ￌ\u0005\f\uffff\nￌ\uffff\u0014\uffff\b\u000b", true, objArr17);
                    Class<?> cls12 = Class.forName((String) objArr17[0]);
                    Object[] objArr18 = new Object[1];
                    ae(295 - (ViewConfiguration.getKeyRepeatDelay() >> 16), TextUtils.indexOf("", "") + 7, KeyEvent.getDeadChar(0, 0) + 16, "\ufffb\r\u0002\uffdd\t\ufffe\uffff\u0003\ufffe\uffff\b\u000e\u0003\u000e\u0013￢", false, objArr18);
                    Object[] objArr19 = {Integer.valueOf(((Integer) cls12.getMethod((String) objArr18[0], Object.class).invoke(null, this)).intValue()), 0, -570313585};
                    map = bp.f40694x;
                    method = map.get(388357536);
                    if (method != null) {
                        Class cls13 = (Class) bp.a(22 - ((byte) KeyEvent.getModifierMetaStateMask()), 389 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), (char) (1 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1))));
                        byte b19 = (byte) ($$b & 14);
                        byte b110 = (byte) (b19 - 2);
                        Object[] objArr110 = new Object[1];
                        ad(b19, b110, b110, objArr110);
                        String str3 = (String) objArr110[0];
                        Class<?> cls14 = Integer.TYPE;
                        method = cls13.getMethod(str3, cls14, cls14, cls14);
                        map.put(388357536, method);
                    }
                    objArr = (Object[]) ((Method) method).invoke(null, objArr19);
                    Class cls15 = (Class) bp.a(22 - ((byte) KeyEvent.getModifierMetaStateMask()), View.resolveSize(0, 0) + 388, (char) View.getDefaultSize(0, 0));
                    byte b111 = (byte) ($$b & 15);
                    byte b112 = (byte) (b111 - 3);
                    Object[] objArr111 = new Object[1];
                    ad(b111, b112, b112, objArr111);
                    cls15.getField((String) objArr111[0]).set(null, objArr);
                    Object[] objArr112 = new Object[1];
                    ae(Color.alpha(0) + 292, 1 - (ViewConfiguration.getDoubleTapTimeout() >> 16), 23 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), "\b\ufffe\u000b\u0001\u000f\f\u0006\u0001ￋ\f\u0010ￋ\ufff0\u0016\u0010\u0011\u0002\n￠\t\f\u0000", false, objArr112);
                    Class<?> cls16 = Class.forName((String) objArr112[0]);
                    Object[] objArr113 = new Object[1];
                    ae(Color.blue(0) + 296, ExpandableListView.getPackedPositionGroup(0L) + 13, (ViewConfiguration.getPressedStateDuration() >> 16) + 15, "\ufffa\t\f\ufffe�￫\ufffe\ufffa\u0005\r\u0002\u0006\ufffe\ufffe\u0005", false, objArr113);
                    Long lValueOf2 = Long.valueOf(((Long) cls16.getDeclaredMethod((String) objArr113[0], new Class[0]).invoke(null, new Object[0])).longValue());
                    Class cls17 = (Class) bp.a(23 - Color.green(0), 388 - ((Process.getThreadPriority(0) + 20) >> 6), (char) ((SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) - 1));
                    Object[] objArr114 = new Object[1];
                    ad(b10, b11, b12, objArr114);
                    cls17.getField((String) objArr114[0]).set(null, lValueOf2);
                }
                int i13 = ((int[]) objArr[1])[0];
                int i14 = ((int[]) objArr[0])[0];
                if (i14 == i13) {
                    Object[] objArr20 = {Integer.valueOf(((int[]) objArr[9])[0]), 0};
                    Map map3 = bp.f40694x;
                    Object method4 = map3.get(1463901671);
                    if (method4 == null) {
                        Class cls18 = (Class) bp.a(Process.getGidForName("") + 24, TextUtils.indexOf("", "", 0, 0) + 388, (char) (ViewConfiguration.getDoubleTapTimeout() >> 16));
                        Object[] objArr21 = new Object[1];
                        ad(b10, b11, b12, objArr21);
                        String str4 = (String) objArr21[0];
                        Class<?> cls19 = Integer.TYPE;
                        method4 = cls18.getMethod(str4, cls19, cls19);
                        map3.put(1463901671, method4);
                    }
                    Object[] objArr22 = {objArr, Integer.valueOf(((Integer) ((Method) method4).invoke(null, objArr20)).intValue())};
                    Object method5 = map3.get(-2142901683);
                    if (method5 == null) {
                        method5 = ((Class) bp.a(24 - View.resolveSize(0, 0), 1836 - Color.alpha(0), (char) View.MeasureSpec.getMode(0))).getMethod("a", Object[].class, Integer.TYPE);
                        map3.put(-2142901683, method5);
                    }
                    ((Method) method5).invoke(null, objArr22);
                    return;
                }
                ArrayList arrayList = new ArrayList();
                arrayList.add((String) objArr[2]);
                arrayList.add((String) objArr[3]);
                arrayList.add((String) objArr[4]);
                arrayList.add((String) objArr[5]);
                arrayList.add((String) objArr[6]);
                arrayList.add((String) objArr[7]);
                arrayList.add((String) objArr[8]);
                int[] iArr = new int[i14];
                int i15 = i14 - 1;
                iArr[i15] = 1;
                Toast.makeText((Context) null, iArr[((i14 * i15) % 2) - 1], 1).show();
                Object[] objArr23 = {Integer.valueOf(((int[]) objArr[9])[0]), 0};
                Map map4 = bp.f40694x;
                Object method6 = map4.get(1463901671);
                if (method6 == null) {
                    Class cls20 = (Class) bp.a((ViewConfiguration.getDoubleTapTimeout() >> 16) + 23, (ViewConfiguration.getFadingEdgeLength() >> 16) + 388, (char) (ViewConfiguration.getWindowTouchSlop() >> 8));
                    Object[] objArr24 = new Object[1];
                    ad(b10, b11, b12, objArr24);
                    String str5 = (String) objArr24[0];
                    Class<?> cls21 = Integer.TYPE;
                    method6 = cls20.getMethod(str5, cls21, cls21);
                    map4.put(1463901671, method6);
                }
                Object[] objArr25 = {objArr, Integer.valueOf(((Integer) ((Method) method6).invoke(null, objArr23)).intValue())};
                Object method7 = map4.get(-2142901683);
                if (method7 == null) {
                    method7 = ((Class) bp.a(25 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), 1836 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), (char) TextUtils.getTrimmedLength(""))).getMethod("a", Object[].class, Integer.TYPE);
                    map4.put(-2142901683, method7);
                }
                ((Method) method7).invoke(null, objArr25);
                int i16 = R + 3;
                P = i16 % 128;
                int i17 = i16 % 2;
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

    private void z() {
        int i10 = R + 23;
        P = i10 % 128;
        int i11 = i10 % 2;
        this.I = false;
        this.G.release();
        int i12 = P + 41;
        R = i12 % 128;
        int i13 = i12 % 2;
    }

    public final void c() {
        int i10 = P;
        int i11 = i10 + 125;
        R = i11 % 128;
        if (i11 % 2 == 0) {
            throw null;
        }
        v vVar = this.C;
        if (vVar != null) {
            vVar.e();
            return;
        }
        int i12 = i10 + 53;
        R = i12 % 128;
        if (i12 % 2 == 0) {
            int i13 = 65 / 0;
        }
    }

    private static /* synthetic */ Object a(Object[] objArr) {
        int i10 = P + 23;
        R = i10 % 128;
        int i11 = i10 % 2;
        f40801a = UUID.randomUUID().toString();
        int i12 = P + 39;
        R = i12 % 128;
        if (i12 % 2 == 0) {
            int i13 = 87 / 0;
        }
        return null;
    }

    public static /* synthetic */ Object e(Object[] objArr, int i10, int i11, int i12) {
        int i13 = (i11 * 334) + (i10 * (-665));
        int i14 = ~i10;
        int i15 = (i14 * (-333)) + i13;
        int i16 = ~i12;
        switch ((((~(i14 | i12)) | (~(i11 | i16))) * 333) + (((~(i14 | i16)) | (~(i11 | i12))) * 333) + i15) {
            case 1:
                return d(objArr);
            case 2:
                return a(objArr);
            case 3:
                return c(objArr);
            case 4:
                cc ccVar = (cc) objArr[0];
                int i17 = P + 51;
                R = i17 % 128;
                int i18 = i17 % 2;
                ccVar.Q();
                int i19 = P + 117;
                R = i19 % 128;
                int i20 = i19 % 2;
                return null;
            case 5:
                return b(objArr);
            case 6:
                return h(objArr);
            case 7:
                return f(objArr);
            case 8:
                return g(objArr);
            default:
                return e(objArr);
        }
    }

    private static /* synthetic */ Object h(Object[] objArr) {
        int i10 = 0;
        cc ccVar = (cc) objArr[0];
        v vVar = ccVar.C;
        if (vVar != null) {
            int i11 = R + 111;
            P = i11 % 128;
            if (i11 % 2 != 0) {
                vVar.c();
                throw null;
            }
            if (vVar.c()) {
                ccVar.C.e(ccVar.f40805d, new n6(ccVar, i10));
                return null;
            }
        }
        int i12 = P + 93;
        R = i12 % 128;
        if (i12 % 2 != 0) {
            return null;
        }
        throw null;
    }

    public static boolean k() {
        int i10 = P + 23;
        R = i10 % 128;
        int i11 = i10 % 2;
        boolean zAb = ch.ab();
        int i12 = P + 21;
        R = i12 % 128;
        int i13 = i12 % 2;
        return zAb;
    }

    public static void p() {
        int i10 = P + 25;
        int i11 = i10 % 128;
        R = i11;
        int i12 = i10 % 2;
        E = new char[]{25160, 25166, 25165, 25161, 25104, 25159, 25170, 25107, 25152, 25167, 25157, 25106, 25173, 25154, 25175, 25171};
        N = (char) 22463;
        M = new char[]{32897, 52233, 6560, 25914, 45719, 32897, 52233, 6560, 25914, 45718, 8559, 28154, 47182, 50398, 4904, 33347, 52939, 7023, 26613, 45142};
        J = -5249479379940684673L;
        int i13 = i11 + 35;
        P = i13 % 128;
        if (i13 % 2 != 0) {
            throw null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:16:0x001a  */
    private boolean q() {
        boolean z10;
        synchronized (this.f40821v) {
            try {
                c cVar = this.f40820u;
                if (cVar != c.PRE_SESSION && cVar != c.PROCESSING && cVar != c.ID_SCAN) {
                    z10 = false;
                } else if (this.I) {
                    z10 = false;
                } else {
                    z10 = true;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return z10;
    }

    public static void r() {
        int i10 = P;
        int i11 = i10 + 111;
        R = i11 % 128;
        int i12 = i11 % 2;
        L = 7923978072827348176L;
        int i13 = i10 + 105;
        R = i13 % 128;
        if (i13 % 2 == 0) {
            throw null;
        }
    }

    public static void s() {
        K = -1817348475;
    }

    public static void t() {
        byte[] bArr = new byte[1121];
        System.arraycopy("@Òaüü\u0005ÿû\u0006ú\u0006ÿú\u0007÷\tÿù\bô\fÿú\u0007ó\rÿø\tû\u0001\u0004û\u0000\u0005ûÿ\u0006ÿ÷\nûþ\u0007ÿö\u000bÿõ\fûü\tûû\nûú\u000bÿô\rû\u0001\u0004ûú\u000bÿü\u0001\u0004ÿü\u0000\u0005ÿüÿ\u0006ÿüþ\u0007ûþ\u0007ûø\rú\u0002\u0004ú\u0001\u0005ÿö\u000bÿüý\búÿ\u0007ÿüü\túþ\bÿüü\të\u00153Â\u000bó\u00079Ûß\u0002\tû\u0007\u0003\u0004\u0003õ\të\u00153Â\u000bó\u00079åÛú\u000fþ\u0002ó\u0015õ÷\u0010\u0016éûú\u001eõõ÷\u0010\të\u00153¹\u0001\u000bý>Üñó\nõ\u0002\tí\u0004+Ûúü\u0005ú\u0006ÿû\u0006ÿú\u0007ÿù\bÿø\tÿ÷\nú\u0006ÿö\u000bÿõ\fÿô\rÿü\u0001\u0004ú\u0006ÿö\u000bÿü\u0000\u0005ÿüÿ\u0006ÿüþ\u0007ÿü\u0001\u0004ú\u0006úú\fÿüý\bÿüü\tÿü\u0001\u0004ù\u0003\u0004ÿüû\nú\u0006ÿüú\u000bÿüù\fÿüø\rÿû\u0002\u0004ú\u0006ÿö\u000bÿü\u0000\u0005ÿû\u0001\u0005ÿû\u0000\u0006ÿû\u0002\u0004ù\u0003\u0004ÿûÿ\u0007ù\u0002\u0005ÿûþ\bù\u0001\u0006ÿûý\tÿûü\nÿûû\u000bú\u0006ÿüú\u000bÿûú\fÿûù\rÿú\u0003\u0004ù\u0003\u0004ÿú\u0002\u0005ù\u0002\u0005ÿú\u0001\u0006ù\u0000\u0007ÿú\u0000\u0007ÿúÿ\bÿúþ\tùÿ\bÿúý\nÿúþ\tÿúü\u000bú\u0006ùþ\tÿúû\fÿúú\rÿù\u0004\u0004ú\u0006ÿüý\bÿù\u0003\u0005ÿù\u0002\u0006ÿù\u0001\u0007ù\u0003\u0004ÿù\u0000\bù\u0002\u0005ÿùÿ\tÿüü\tÿùþ\nú\u0006úú\fÿüú\u000bùü\u000bÿùý\u000bú\u0006ù\u0002\u0005ÿùü\fú\u0006ÿùû\rÿø\u0005\u0004ú\u0006ÿø\u0004\u0005ÿø\u0003\u0006ûÿ\u0006ÿø\u0002\u0007ú\u0006ÿû\u0006ÿø\u0001\bùû\fÿø\u0000\tùú\rÿøÿ\nÿøþ\u000bÿøý\fÿøü\rù\u0002\u0005ÿüû\nú\u0006ÿú\u0007ÿ÷\u0006\u0004ú\u0006ø\u0004\u0004ÿ÷\u0005\u0005ÿ÷\u0004\u0006ø\u0004\u0004ÿ÷\u0003\u0007ÿ÷\u0002\bù\u0002\u0005ÿüû\nù\u0003\u0004ÿüû\nû\u0001\u0004ø\u0003\u0005ÿ÷\u0001\tû\u0001\u0004û\u0000\u0005ûÿ\u0006ÿúü\u000bû\u0001\u0004û\u0000\u0005ûÿ\u0006ÿú\u0001\u0006ø\u0002\u0006ûú\u000bûÿ\u0006ÿûÿ\u0007û\u0001\u0004û\u0000\u0005ûÿ\u0006ÿù\u0000\bÿ÷\u0000\nø\u0001\u0007ø\u0000\bøÿ\tûú\u000bÿ÷ÿ\u000bû\u0001\u0004ûú\u000bÿ÷þ\fÿ÷ý\rÿö\u0007\u0004ÿö\u0007\u0004ÿö\u0006\u0005øþ\nøý\u000bûú\u000bÿö\u0005\u0006û\u0000\u0005ÿö\u0004\u0007ÿö\u0003\bÿö\u0002\tÿö\u0001\nùÿ\bøü\fûÿ\u0006ÿö\u0000\u000bÿúþ\tÿúü\u000bÿö\u0006\u0005øû\r÷\u0005\u0004÷\u0004\u0005ÿö\u0005\u0006û\u0001\u0004ûú\u000bÿöÿ\fÿöþ\rÿõ\b\u0004÷\u0003\u0006ûÿ\u0006ÿù\u0000\bÿö\u0006\u0005÷\u0002\u0007øý\u000bûú\u000bÿö\u0005\u0006û\u0001\u0004ûú\u000bÿõ\u0007\u0005ÿõ\u0006\u0006ÿõ\u0005\u0007ÿõ\u0005\u0007ÿ÷\u0000\n÷\u0001\b÷\u0000\tÿ÷ÿ\u000bû\u0000\u0005ÿõ\u0004\bÿõ\u0003\tÿõ\u0002\n÷ÿ\n÷þ\u000bûÿ\u0006ÿú\u0001\u0006ÿõ\u0001\u000b÷ý\fÿõ\u0000\f÷ü\rÿõ\u0000\fÿõÿ\rù\u0003\u0004ÿô\t\u0004ù\u0002\u0005ÿô\t\u0004ÿô\b\u0005ù\u0002\u0005ÿô\u0007\u0006ù\u0003\u0004ÿô\u0007\u0006ÿô\u0006\u0007ù\u0003\u0004ÿô\u0005\bù\u0002\u0005ÿô\u0005\të\u00153Â\u000bó\u00079é×ù\bý\u000eûû\rõó\nò\u0003\u0006\u00056¿üEìÍ\fý\b@Î\u0011óÿ\nú\u0001\u000fùì\u0016ûú\të\u00153¹\u0001\u000bý>Úëü\bó\u0010û\u0003\u0001ï\t\u0007$Í.Ýñ\u0013\u0001\u0012ñí\u000f\të\u00153¹\u0001\u000bý>Úëü\bó\u001eóî\b\të\u00153¹\u0001\u000bý>íßïÿ\u0002\u0011þï1Ô\u0003\u0000\u0007\u0002ï\u000bú\u0001÷\u0007\u0004ï\të\u00153¹\u0001\u000bý>Ëô\u0001\u000bî\u0003\u0000\r÷úFéÍ\u0013\u0002î\u0001\u0005ý\u001fîóü\r\u0006þ\u000bó\u0001\u0010õø\t".getBytes("ISO-8859-1"), 0, bArr, 0, 1121);
        Q = bArr;
        O = 172;
    }

    private static synchronized void u() {
        if (f40802c != null) {
            if (!f40802c.equals("")) {
                int i10 = R + 35;
                P = i10 % 128;
                int i11 = i10 % 2;
                f40802c = UUID.randomUUID().toString();
            }
            return;
        }
        int i12 = R + 3;
        P = i12 % 128;
        if (i12 % 2 == 0) {
            f40802c = UUID.randomUUID().toString();
        } else {
            f40802c = UUID.randomUUID().toString();
            throw null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void v() {
        e(new Object[]{this}, -1914090881, 1914090884, System.identityHashCode(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:39:0x0299  */
    /* JADX WARN: Code duplicated, block: B:42:0x0329  */
    /* JADX WARN: Code duplicated, block: B:43:0x032a A[Catch: all -> 0x01b6, TryCatch #2 {all -> 0x01b6, blocks: (B:15:0x0103, B:19:0x0157, B:23:0x01ac, B:24:0x01b2, B:51:0x0467, B:55:0x04b9, B:59:0x050c, B:58:0x04da, B:54:0x0482, B:22:0x0178, B:18:0x0121, B:29:0x01ec, B:33:0x0241, B:37:0x0291, B:36:0x0262, B:32:0x020a, B:40:0x0303, B:44:0x0376, B:43:0x032a), top: B:75:0x0056 }] */
    public void w() throws Throwable {
        Map map;
        Object method;
        Object[] objArr;
        Object objInvoke;
        int i10 = P + 113;
        R = i10 % 128;
        if (i10 % 2 == 0) {
            int i11 = 69 / 0;
        }
        try {
            Class cls = (Class) bp.a(24 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 387, (char) (ViewConfiguration.getEdgeSlop() >> 16));
            byte b10 = (byte) 0;
            byte b11 = b10;
            byte b12 = b11;
            Object[] objArr2 = new Object[1];
            ad(b10, b11, b12, objArr2);
            long j10 = cls.getField((String) objArr2[0]).getLong(null);
            try {
                if (j10 != -1) {
                    long j11 = j10 + 1948;
                    Object[] objArr3 = new Object[1];
                    ae((KeyEvent.getMaxKeyCode() >> 16) + 292, 1 - TextUtils.indexOf("", "", 0), 22 - (ViewConfiguration.getScrollBarSize() >> 8), "\b\ufffe\u000b\u0001\u000f\f\u0006\u0001ￋ\f\u0010ￋ\ufff0\u0016\u0010\u0011\u0002\n￠\t\f\u0000", false, objArr3);
                    Class<?> cls2 = Class.forName((String) objArr3[0]);
                    Object[] objArr4 = new Object[1];
                    ae((ViewConfiguration.getEdgeSlop() >> 16) + 296, 14 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), View.MeasureSpec.getSize(0) + 15, "\ufffa\t\f\ufffe�￫\ufffe\ufffa\u0005\r\u0002\u0006\ufffe\ufffe\u0005", false, objArr4);
                    if (j11 >= ((Long) cls2.getDeclaredMethod((String) objArr4[0], new Class[0]).invoke(null, new Object[0])).longValue()) {
                        int i12 = R + 13;
                        P = i12 % 128;
                        if (i12 % 2 != 0) {
                            Class cls3 = (Class) bp.a((-16777193) - Color.rgb(0, 0, 0), 388 - (ViewConfiguration.getScrollBarSize() >> 8), (char) Gravity.getAbsoluteGravity(0, 0));
                            byte b13 = (byte) ($$b & 15);
                            byte b14 = (byte) (b13 - 3);
                            Object[] objArr5 = new Object[1];
                            ad(b13, b14, b14, objArr5);
                            Object obj = cls3.getField((String) objArr5[0]).get(null);
                            Object[] objArr6 = {-1110615422, 0};
                            Map map2 = bp.f40694x;
                            Object method2 = map2.get(1463901671);
                            if (method2 == null) {
                                Class cls4 = (Class) bp.a(ExpandableListView.getPackedPositionGroup(0L) + 23, 388 - (ViewConfiguration.getScrollBarSize() >> 8), (char) TextUtils.indexOf("", ""));
                                Object[] objArr7 = new Object[1];
                                ad(b10, b11, b12, objArr7);
                                String str = (String) objArr7[0];
                                Class<?> cls5 = Integer.TYPE;
                                method2 = cls4.getMethod(str, cls5, cls5);
                                map2.put(1463901671, method2);
                            }
                            Object[] objArr8 = {obj, Integer.valueOf(((Integer) ((Method) method2).invoke(null, objArr6)).intValue())};
                            Object method3 = map2.get(-2142901683);
                            if (method3 == null) {
                                method3 = ((Class) bp.a(24 - (ViewConfiguration.getKeyRepeatDelay() >> 16), 1836 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), (char) (ViewConfiguration.getFadingEdgeLength() >> 16))).getMethod("a", Object[].class, Integer.TYPE);
                                map2.put(-2142901683, method3);
                            }
                            objInvoke = ((Method) method3).invoke(null, objArr8);
                        } else {
                            Class cls6 = (Class) bp.a(23 - TextUtils.getOffsetBefore("", 0), 388 - ExpandableListView.getPackedPositionGroup(0L), (char) Drawable.resolveOpacity(0, 0));
                            byte b15 = (byte) ($$b & 15);
                            byte b16 = (byte) (b15 - 3);
                            Object[] objArr9 = new Object[1];
                            ad(b15, b16, b16, objArr9);
                            Object obj2 = cls6.getField((String) objArr9[0]).get(null);
                            Object[] objArr10 = {-1110615422, 0};
                            Map map3 = bp.f40694x;
                            Object method4 = map3.get(1463901671);
                            if (method4 == null) {
                                Class cls7 = (Class) bp.a(TextUtils.indexOf("", "", 0, 0) + 23, 388 - View.MeasureSpec.getSize(0), (char) ((Process.getThreadPriority(0) + 20) >> 6));
                                Object[] objArr11 = new Object[1];
                                ad(b10, b11, b12, objArr11);
                                String str2 = (String) objArr11[0];
                                Class<?> cls8 = Integer.TYPE;
                                method4 = cls7.getMethod(str2, cls8, cls8);
                                map3.put(1463901671, method4);
                            }
                            Object[] objArr12 = {obj2, Integer.valueOf(((Integer) ((Method) method4).invoke(null, objArr10)).intValue())};
                            Object method5 = map3.get(-2142901683);
                            if (method5 == null) {
                                method5 = ((Class) bp.a((PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 24, Color.red(0) + 1836, (char) View.MeasureSpec.makeMeasureSpec(0, 0))).getMethod("a", Object[].class, Integer.TYPE);
                                map3.put(-2142901683, method5);
                            }
                            objInvoke = ((Method) method5).invoke(null, objArr12);
                        }
                        objArr = (Object[]) objInvoke;
                    } else {
                        Object[] objArr13 = new Object[1];
                        ae(291 - (ViewConfiguration.getEdgeSlop() >> 16), 15 - TextUtils.getCapsMode("", 0, 0), (ViewConfiguration.getPressedStateDuration() >> 16) + 16, "\u0003\u0012\u0011\u0017\ufff1ￌ\u0005\f\uffff\nￌ\uffff\u0014\uffff\b\u000b", true, objArr13);
                        Class<?> cls9 = Class.forName((String) objArr13[0]);
                        Object[] objArr14 = new Object[1];
                        ae((ViewConfiguration.getWindowTouchSlop() >> 8) + 295, Color.alpha(0) + 7, AndroidCharacter.getMirror('0') - ' ', "\ufffb\r\u0002\uffdd\t\ufffe\uffff\u0003\ufffe\uffff\b\u000e\u0003\u000e\u0013￢", false, objArr14);
                        Object[] objArr15 = {Integer.valueOf(((Integer) cls9.getMethod((String) objArr14[0], Object.class).invoke(null, this)).intValue()), 0, -1110615422};
                        map = bp.f40694x;
                        method = map.get(388357536);
                        if (method != null) {
                            Class cls10 = (Class) bp.a(24 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), 388 - View.resolveSizeAndState(0, 0, 0), (char) (1 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1))));
                            byte b17 = (byte) ($$b & 14);
                            byte b18 = (byte) (b17 - 2);
                            Object[] objArr16 = new Object[1];
                            ad(b17, b18, b18, objArr16);
                            String str3 = (String) objArr16[0];
                            Class<?> cls11 = Integer.TYPE;
                            method = cls10.getMethod(str3, cls11, cls11, cls11);
                            map.put(388357536, method);
                        }
                        objArr = (Object[]) ((Method) method).invoke(null, objArr15);
                        Class cls12 = (Class) bp.a((SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 22, (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 388, (char) (1 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1))));
                        byte b19 = (byte) ($$b & 15);
                        byte b20 = (byte) (b19 - 3);
                        Object[] objArr17 = new Object[1];
                        ad(b19, b20, b20, objArr17);
                        cls12.getField((String) objArr17[0]).set(null, objArr);
                        try {
                            Object[] objArr18 = new Object[1];
                            ae(ExpandableListView.getPackedPositionChild(0L) + 293, 1 - (ViewConfiguration.getKeyRepeatDelay() >> 16), 22 - View.resolveSizeAndState(0, 0, 0), "\b\ufffe\u000b\u0001\u000f\f\u0006\u0001ￋ\f\u0010ￋ\ufff0\u0016\u0010\u0011\u0002\n￠\t\f\u0000", false, objArr18);
                            Class<?> cls13 = Class.forName((String) objArr18[0]);
                            Object[] objArr19 = new Object[1];
                            ae(TextUtils.getOffsetBefore("", 0) + 296, ((byte) KeyEvent.getModifierMetaStateMask()) + Constants.CVR_B1b41_1110_ONLINE_PIN, 15 - TextUtils.indexOf("", ""), "\ufffa\t\f\ufffe�￫\ufffe\ufffa\u0005\r\u0002\u0006\ufffe\ufffe\u0005", false, objArr19);
                            Long lValueOf = Long.valueOf(((Long) cls13.getDeclaredMethod((String) objArr19[0], new Class[0]).invoke(null, new Object[0])).longValue());
                            Class cls14 = (Class) bp.a(23 - ExpandableListView.getPackedPositionGroup(0L), View.getDefaultSize(0, 0) + 388, (char) (ViewConfiguration.getKeyRepeatDelay() >> 16));
                            Object[] objArr20 = new Object[1];
                            ad(b10, b11, b12, objArr20);
                            cls14.getField((String) objArr20[0]).set(null, lValueOf);
                        } catch (Exception unused) {
                            throw new RuntimeException();
                        }
                    }
                } else {
                    Object[] objArr110 = new Object[1];
                    ae(291 - (ViewConfiguration.getEdgeSlop() >> 16), 15 - TextUtils.getCapsMode("", 0, 0), (ViewConfiguration.getPressedStateDuration() >> 16) + 16, "\u0003\u0012\u0011\u0017\ufff1ￌ\u0005\f\uffff\nￌ\uffff\u0014\uffff\b\u000b", true, objArr110);
                    Class<?> cls15 = Class.forName((String) objArr110[0]);
                    Object[] objArr111 = new Object[1];
                    ae((ViewConfiguration.getWindowTouchSlop() >> 8) + 295, Color.alpha(0) + 7, AndroidCharacter.getMirror('0') - ' ', "\ufffb\r\u0002\uffdd\t\ufffe\uffff\u0003\ufffe\uffff\b\u000e\u0003\u000e\u0013￢", false, objArr111);
                    Object[] objArr112 = {Integer.valueOf(((Integer) cls15.getMethod((String) objArr111[0], Object.class).invoke(null, this)).intValue()), 0, -1110615422};
                    map = bp.f40694x;
                    method = map.get(388357536);
                    if (method != null) {
                        Class cls16 = (Class) bp.a(24 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), 388 - View.resolveSizeAndState(0, 0, 0), (char) (1 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1))));
                        byte b110 = (byte) ($$b & 14);
                        byte b111 = (byte) (b110 - 2);
                        Object[] objArr113 = new Object[1];
                        ad(b110, b111, b111, objArr113);
                        String str4 = (String) objArr113[0];
                        Class<?> cls17 = Integer.TYPE;
                        method = cls16.getMethod(str4, cls17, cls17, cls17);
                        map.put(388357536, method);
                    }
                    objArr = (Object[]) ((Method) method).invoke(null, objArr112);
                    Class cls18 = (Class) bp.a((SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 22, (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 388, (char) (1 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1))));
                    byte b112 = (byte) ($$b & 15);
                    byte b21 = (byte) (b112 - 3);
                    Object[] objArr114 = new Object[1];
                    ad(b112, b21, b21, objArr114);
                    cls18.getField((String) objArr114[0]).set(null, objArr);
                    Object[] objArr115 = new Object[1];
                    ae(ExpandableListView.getPackedPositionChild(0L) + 293, 1 - (ViewConfiguration.getKeyRepeatDelay() >> 16), 22 - View.resolveSizeAndState(0, 0, 0), "\b\ufffe\u000b\u0001\u000f\f\u0006\u0001ￋ\f\u0010ￋ\ufff0\u0016\u0010\u0011\u0002\n￠\t\f\u0000", false, objArr115);
                    Class<?> cls19 = Class.forName((String) objArr115[0]);
                    Object[] objArr116 = new Object[1];
                    ae(TextUtils.getOffsetBefore("", 0) + 296, ((byte) KeyEvent.getModifierMetaStateMask()) + Constants.CVR_B1b41_1110_ONLINE_PIN, 15 - TextUtils.indexOf("", ""), "\ufffa\t\f\ufffe�￫\ufffe\ufffa\u0005\r\u0002\u0006\ufffe\ufffe\u0005", false, objArr116);
                    Long lValueOf2 = Long.valueOf(((Long) cls19.getDeclaredMethod((String) objArr116[0], new Class[0]).invoke(null, new Object[0])).longValue());
                    Class cls110 = (Class) bp.a(23 - ExpandableListView.getPackedPositionGroup(0L), View.getDefaultSize(0, 0) + 388, (char) (ViewConfiguration.getKeyRepeatDelay() >> 16));
                    Object[] objArr21 = new Object[1];
                    ad(b10, b11, b12, objArr21);
                    cls110.getField((String) objArr21[0]).set(null, lValueOf2);
                }
                if (((int[]) objArr[0])[0] != ((int[]) objArr[1])[0]) {
                    ArrayList arrayList = new ArrayList();
                    arrayList.add((String) objArr[2]);
                    arrayList.add((String) objArr[3]);
                    arrayList.add((String) objArr[4]);
                    arrayList.add((String) objArr[5]);
                    arrayList.add((String) objArr[6]);
                    arrayList.add((String) objArr[7]);
                    arrayList.add((String) objArr[8]);
                    throw null;
                }
                int i13 = R + 113;
                P = i13 % 128;
                int i14 = i13 % 2;
                Object[] objArr22 = {Integer.valueOf(((int[]) objArr[9])[0]), 0};
                Map map4 = bp.f40694x;
                Object method6 = map4.get(1463901671);
                if (method6 == null) {
                    Class cls20 = (Class) bp.a(23 - View.MeasureSpec.makeMeasureSpec(0, 0), 388 - ExpandableListView.getPackedPositionGroup(0L), (char) (ViewConfiguration.getMinimumFlingVelocity() >> 16));
                    Object[] objArr23 = new Object[1];
                    ad(b10, b11, b12, objArr23);
                    String str5 = (String) objArr23[0];
                    Class<?> cls21 = Integer.TYPE;
                    method6 = cls20.getMethod(str5, cls21, cls21);
                    map4.put(1463901671, method6);
                }
                Object[] objArr24 = {objArr, Integer.valueOf(((Integer) ((Method) method6).invoke(null, objArr22)).intValue())};
                Object method7 = map4.get(-2142901683);
                if (method7 == null) {
                    method7 = ((Class) bp.a(23 - TextUtils.indexOf((CharSequence) "", '0', 0, 0), 1836 - (ViewConfiguration.getLongPressTimeout() >> 16), (char) (ViewConfiguration.getScrollBarFadeDuration() >> 16))).getMethod("a", Object[].class, Integer.TYPE);
                    map4.put(-2142901683, method7);
                }
                ((Method) method7).invoke(null, objArr24);
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

    public final synchronized void f() {
        boolean z10;
        cx.d(B());
        synchronized (this.f40821v) {
            try {
                c cVar = this.f40820u;
                if (cVar == c.PRE_SESSION || cVar == c.PROCESSING || cVar == c.WAITING_TO_FINISH) {
                    this.f40820u = c.FINISHED;
                    z10 = true;
                } else {
                    z10 = false;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (z10) {
            ch.g(true);
        }
    }

    public final synchronized void g() {
        boolean z10;
        cx.d(B());
        synchronized (this.f40821v) {
            try {
                c cVar = this.f40820u;
                if (cVar == c.ID_SCAN || cVar == c.PRE_SESSION || cVar == c.PROCESSING || cVar == c.WAITING_TO_FINISH) {
                    this.f40820u = c.FINISHED;
                    z10 = true;
                } else {
                    z10 = false;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (z10) {
            ch.f(false);
        }
    }

    public final void i() {
        v vVar = this.C;
        if (vVar != null) {
            int i10 = P + 19;
            R = i10 % 128;
            int i11 = i10 % 2;
            vVar.d();
        }
        int i12 = P + 13;
        R = i12 % 128;
        int i13 = i12 % 2;
    }

    public final d j() {
        int i10 = P + 21;
        R = i10 % 128;
        if (i10 % 2 != 0) {
            return this.f40819t;
        }
        int i11 = 44 / 0;
        return this.f40819t;
    }

    public final ck l() {
        int i10 = P + 77;
        R = i10 % 128;
        int i11 = i10 % 2;
        ck ckVarK = ch.k();
        this.f40818s = ckVarK;
        int i12 = R + 115;
        P = i12 % 128;
        if (i12 % 2 == 0) {
            return ckVarK;
        }
        throw null;
    }

    public final synchronized void m() {
        synchronized (this.f40821v) {
            try {
                c cVar = this.f40820u;
                if (cVar == c.PROCESSING || cVar == c.WAITING_TO_FINISH) {
                    this.f40820u = c.FINISHED;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        cx.d(B());
        e(new Object[]{this}, 749438003, -749438003, System.identityHashCode(this));
        e(new Object[]{this}, -583599493, 583599499, System.identityHashCode(this));
        this.f40808h.clear();
        this.f40807g.clear();
    }

    public final cp n() {
        int i10 = P + 85;
        R = i10 % 128;
        int i11 = i10 % 2;
        cp cpVarL = ch.l();
        this.f40817r = cpVarL;
        int i12 = R + 7;
        P = i12 % 128;
        if (i12 % 2 == 0) {
            return cpVarL;
        }
        throw null;
    }

    public final void o() throws Throwable {
        synchronized (this.f40821v) {
            try {
                c cVar = this.f40820u;
                if (cVar == c.PRE_SESSION || cVar == c.PROCESSING || cVar == c.ID_SCAN) {
                    this.f40820u = c.WAITING_TO_FINISH;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        e(new Object[]{this}, 749438003, -749438003, System.identityHashCode(this));
        ArrayList<WeakReference<b>> arrayList = this.f40808h;
        short s4 = (short) 1044;
        try {
            byte[] bArr = Q;
            short s7 = (short) 738;
            Object[] objArr = new Object[1];
            af(s4, bArr[20], s7, objArr);
            Class<?> cls = Class.forName((String) objArr[0]);
            short s9 = (short) 1071;
            short s10 = (short) 761;
            Object[] objArr2 = new Object[1];
            af(s9, bArr[1024], s10, objArr2);
            cls.getMethod((String) objArr2[0], null).invoke(arrayList, null);
            ArrayList<WeakReference<e>> arrayList2 = this.f40807g;
            Object[] objArr3 = new Object[1];
            af(s4, bArr[20], s7, objArr3);
            Class<?> cls2 = Class.forName((String) objArr3[0]);
            Object[] objArr4 = new Object[1];
            af(s9, bArr[1024], s10, objArr4);
            cls2.getMethod((String) objArr4[0], null).invoke(arrayList2, null);
            ArrayList<WeakReference<a>> arrayList3 = this.f40810j;
            Object[] objArr5 = new Object[1];
            af(s4, bArr[20], s7, objArr5);
            Class<?> cls3 = Class.forName((String) objArr5[0]);
            Object[] objArr6 = new Object[1];
            af(s9, bArr[1024], s10, objArr6);
            cls3.getMethod((String) objArr6[0], null).invoke(arrayList3, null);
            ExecutorService executorService = this.f40806f;
            short s11 = (short) 1075;
            short s12 = (short) 730;
            Object[] objArr7 = new Object[1];
            af(s11, bArr[20], s12, objArr7);
            Class<?> cls4 = Class.forName((String) objArr7[0]);
            short s13 = (short) 1110;
            short s14 = (short) 758;
            Object[] objArr8 = new Object[1];
            af(s13, bArr[131], s14, objArr8);
            cls4.getMethod((String) objArr8[0], null).invoke(executorService, null);
            ExecutorService executorService2 = this.f40809i;
            Object[] objArr9 = new Object[1];
            af(s11, bArr[20], s12, objArr9);
            Class<?> cls5 = Class.forName((String) objArr9[0]);
            Object[] objArr10 = new Object[1];
            af(s13, bArr[131], s14, objArr10);
            cls5.getMethod((String) objArr10[0], null).invoke(executorService2, null);
        } catch (Throwable th3) {
            Throwable cause = th3.getCause();
            if (cause == null) {
                throw th3;
            }
            throw cause;
        }
    }

    private void a(@NonNull Context context) {
        if (bx.b(context)) {
            ch.z();
        }
        if (this.D) {
            int i10 = R + 87;
            P = i10 % 128;
            int i11 = i10 % 2;
            ch.w();
            int i12 = P + 99;
            R = i12 % 128;
            int i13 = i12 % 2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0021 A[Catch: all -> 0x001b, TryCatch #2 {all -> 0x001b, blocks: (B:4:0x0003, B:6:0x0010, B:24:0x003d, B:30:0x004d, B:17:0x0021, B:19:0x002b, B:20:0x0033, B:23:0x003c, B:12:0x001a, B:15:0x001d, B:8:0x0014, B:21:0x003a, B:28:0x004b), top: B:37:0x0003, inners: #0, #1, #3 }] */
    /* JADX WARN: Code duplicated, block: B:19:0x002b A[Catch: all -> 0x001b, TryCatch #2 {all -> 0x001b, blocks: (B:4:0x0003, B:6:0x0010, B:24:0x003d, B:30:0x004d, B:17:0x0021, B:19:0x002b, B:20:0x0033, B:23:0x003c, B:12:0x001a, B:15:0x001d, B:8:0x0014, B:21:0x003a, B:28:0x004b), top: B:37:0x0003, inners: #0, #1, #3 }] */
    /* JADX WARN: Code duplicated, block: B:20:0x0033 A[Catch: all -> 0x001b, TRY_LEAVE, TryCatch #2 {all -> 0x001b, blocks: (B:4:0x0003, B:6:0x0010, B:24:0x003d, B:30:0x004d, B:17:0x0021, B:19:0x002b, B:20:0x0033, B:23:0x003c, B:12:0x001a, B:15:0x001d, B:8:0x0014, B:21:0x003a, B:28:0x004b), top: B:37:0x0003, inners: #0, #1, #3 }] */
    public static synchronized void e() {
        int i10;
        try {
            int i11 = R;
            int i12 = i11 + 91;
            P = i12 % 128;
            if (i12 % 2 != 0) {
                int i13 = 56 / 0;
                if (f40803e != null) {
                    i10 = i11 + 31;
                    P = i10 % 128;
                    if (i10 % 2 == 0) {
                        f40803e.A();
                        f40803e = null;
                    } else {
                        f40803e.A();
                        f40803e = null;
                        throw null;
                    }
                    throw th;
                }
            } else if (f40803e != null) {
                i10 = i11 + 31;
                P = i10 % 128;
                if (i10 % 2 == 0) {
                    f40803e.A();
                    f40803e = null;
                } else {
                    f40803e.A();
                    f40803e = null;
                    throw null;
                }
                throw th;
            }
            int i14 = R + 3;
            P = i14 % 128;
            if (i14 % 2 != 0) {
                throw null;
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final synchronized void c(e eVar) {
        this.f40807g.add(new WeakReference<>(eVar));
        int i10 = P + 79;
        R = i10 % 128;
        int i11 = i10 % 2;
    }

    public final synchronized void d(a aVar) {
        try {
            Iterator<WeakReference<a>> it = this.f40810j.iterator();
            int i10 = R + 89;
            P = i10 % 128;
            int i11 = i10 % 2;
            while (!(!it.hasNext())) {
                int i12 = P + 77;
                R = i12 % 128;
                if (i12 % 2 != 0) {
                    if (it.next().get() == aVar) {
                        it.remove();
                    }
                } else {
                    it.next().get();
                    throw null;
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public static synchronized void b() {
        try {
            if (f40803e == null) {
                int i10 = P + 59;
                R = i10 % 128;
                int i11 = i10 % 2;
                ch.f();
            }
            int i12 = R + 41;
            P = i12 % 128;
            int i13 = i12 % 2;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public static void h() {
        e(new Object[0], -1383766321, 1383766323, (int) System.currentTimeMillis());
    }

    /* JADX WARN: Code duplicated, block: B:23:0x01bb  */
    /* JADX WARN: Code duplicated, block: B:26:0x024c  */
    /* JADX WARN: Code duplicated, block: B:27:0x024d A[Catch: all -> 0x01b8, TryCatch #0 {all -> 0x01b8, blocks: (B:11:0x0109, B:15:0x015d, B:19:0x01ad, B:35:0x0381, B:39:0x03d2, B:43:0x0422, B:42:0x03f5, B:38:0x0398, B:46:0x047b, B:50:0x04c8, B:54:0x051e, B:53:0x04eb, B:49:0x0492, B:18:0x0180, B:14:0x0123, B:24:0x0229, B:28:0x0296, B:27:0x024d), top: B:64:0x005c }] */
    private static /* synthetic */ Object c(Object[] objArr) throws Throwable {
        Map map;
        Object method;
        Object[] objArr2;
        cc ccVar = (cc) objArr[0];
        int i10 = P + 9;
        R = i10 % 128;
        int i11 = i10 % 2;
        try {
            Class cls = (Class) bp.a((SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 22, (ViewConfiguration.getFadingEdgeLength() >> 16) + 388, (char) (ViewConfiguration.getEdgeSlop() >> 16));
            byte b10 = (byte) 0;
            byte b11 = b10;
            byte b12 = b11;
            Object[] objArr3 = new Object[1];
            ad(b10, b11, b12, objArr3);
            long j10 = cls.getField((String) objArr3[0]).getLong(null);
            try {
                if (j10 != -1) {
                    long j11 = j10 + 2040;
                    Object[] objArr4 = new Object[1];
                    ae(TextUtils.getTrimmedLength("") + 292, Color.argb(0, 0, 0, 0) + 1, 22 - (ViewConfiguration.getDoubleTapTimeout() >> 16), "\b\ufffe\u000b\u0001\u000f\f\u0006\u0001ￋ\f\u0010ￋ\ufff0\u0016\u0010\u0011\u0002\n￠\t\f\u0000", false, objArr4);
                    Class<?> cls2 = Class.forName((String) objArr4[0]);
                    Object[] objArr5 = new Object[1];
                    ae((ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 296, 13 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), 15 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), "\ufffa\t\f\ufffe�￫\ufffe\ufffa\u0005\r\u0002\u0006\ufffe\ufffe\u0005", false, objArr5);
                    if (j11 >= ((Long) cls2.getDeclaredMethod((String) objArr5[0], new Class[0]).invoke(null, new Object[0])).longValue()) {
                        int i12 = P + 77;
                        R = i12 % 128;
                        int i13 = i12 % 2;
                        Class cls3 = (Class) bp.a(TextUtils.lastIndexOf("", '0', 0, 0) + 24, ((byte) KeyEvent.getModifierMetaStateMask()) + 389, (char) Color.argb(0, 0, 0, 0));
                        byte b13 = (byte) ($$b & 15);
                        byte b14 = (byte) (b13 - 3);
                        Object[] objArr6 = new Object[1];
                        ad(b13, b14, b14, objArr6);
                        Object obj = cls3.getField((String) objArr6[0]).get(null);
                        Object[] objArr7 = {-1418756761, 0};
                        Map map2 = bp.f40694x;
                        Object method2 = map2.get(1463901671);
                        if (method2 == null) {
                            Class cls4 = (Class) bp.a(23 - TextUtils.indexOf("", "", 0), View.MeasureSpec.getMode(0) + 388, (char) (1 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1))));
                            Object[] objArr8 = new Object[1];
                            ad(b10, b11, b12, objArr8);
                            String str = (String) objArr8[0];
                            Class<?> cls5 = Integer.TYPE;
                            method2 = cls4.getMethod(str, cls5, cls5);
                            map2.put(1463901671, method2);
                        }
                        Object[] objArr9 = {obj, Integer.valueOf(((Integer) ((Method) method2).invoke(null, objArr7)).intValue())};
                        Object method3 = map2.get(-2142901683);
                        if (method3 == null) {
                            method3 = ((Class) bp.a(24 - Color.red(0), TextUtils.indexOf((CharSequence) "", '0') + 1837, (char) View.resolveSizeAndState(0, 0, 0))).getMethod("a", Object[].class, Integer.TYPE);
                            map2.put(-2142901683, method3);
                        }
                        objArr2 = (Object[]) ((Method) method3).invoke(null, objArr9);
                    } else {
                        Object[] objArr10 = new Object[1];
                        ae(291 - TextUtils.indexOf("", "", 0), 15 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), View.MeasureSpec.getSize(0) + 16, "\u0003\u0012\u0011\u0017\ufff1ￌ\u0005\f\uffff\nￌ\uffff\u0014\uffff\b\u000b", true, objArr10);
                        Class<?> cls6 = Class.forName((String) objArr10[0]);
                        Object[] objArr11 = new Object[1];
                        ae(343 - AndroidCharacter.getMirror('0'), 8 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 15, "\ufffb\r\u0002\uffdd\t\ufffe\uffff\u0003\ufffe\uffff\b\u000e\u0003\u000e\u0013￢", false, objArr11);
                        Object[] objArr12 = {Integer.valueOf(((Integer) cls6.getMethod((String) objArr11[0], Object.class).invoke(null, ccVar)).intValue()), 0, -1418756761};
                        map = bp.f40694x;
                        method = map.get(388357536);
                        if (method != null) {
                            Class cls7 = (Class) bp.a(View.MeasureSpec.getMode(0) + 23, (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 387, (char) (ViewConfiguration.getKeyRepeatTimeout() >> 16));
                            byte b15 = (byte) ($$b & 14);
                            byte b16 = (byte) (b15 - 2);
                            Object[] objArr13 = new Object[1];
                            ad(b15, b16, b16, objArr13);
                            String str2 = (String) objArr13[0];
                            Class<?> cls8 = Integer.TYPE;
                            method = cls7.getMethod(str2, cls8, cls8, cls8);
                            map.put(388357536, method);
                        }
                        objArr2 = (Object[]) ((Method) method).invoke(null, objArr12);
                        Class cls9 = (Class) bp.a((AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 22, 387 - ImageFormat.getBitsPerPixel(0), (char) TextUtils.getOffsetAfter("", 0));
                        byte b17 = (byte) ($$b & 15);
                        byte b18 = (byte) (b17 - 3);
                        Object[] objArr14 = new Object[1];
                        ad(b17, b18, b18, objArr14);
                        cls9.getField((String) objArr14[0]).set(null, objArr2);
                        try {
                            Object[] objArr15 = new Object[1];
                            ae(ExpandableListView.getPackedPositionChild(0L) + 293, 1 - TextUtils.getOffsetBefore("", 0), 22 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), "\b\ufffe\u000b\u0001\u000f\f\u0006\u0001ￋ\f\u0010ￋ\ufff0\u0016\u0010\u0011\u0002\n￠\t\f\u0000", false, objArr15);
                            Class<?> cls10 = Class.forName((String) objArr15[0]);
                            Object[] objArr16 = new Object[1];
                            ae((ViewConfiguration.getTouchSlop() >> 8) + 296, 13 - (ViewConfiguration.getFadingEdgeLength() >> 16), 15 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), "\ufffa\t\f\ufffe�￫\ufffe\ufffa\u0005\r\u0002\u0006\ufffe\ufffe\u0005", false, objArr16);
                            Long lValueOf = Long.valueOf(((Long) cls10.getDeclaredMethod((String) objArr16[0], new Class[0]).invoke(null, new Object[0])).longValue());
                            Class cls11 = (Class) bp.a(23 - View.combineMeasuredStates(0, 0), (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 388, (char) KeyEvent.getDeadChar(0, 0));
                            Object[] objArr17 = new Object[1];
                            ad(b10, b11, b12, objArr17);
                            cls11.getField((String) objArr17[0]).set(null, lValueOf);
                        } catch (Exception unused) {
                            throw new RuntimeException();
                        }
                    }
                } else {
                    Object[] objArr18 = new Object[1];
                    ae(291 - TextUtils.indexOf("", "", 0), 15 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), View.MeasureSpec.getSize(0) + 16, "\u0003\u0012\u0011\u0017\ufff1ￌ\u0005\f\uffff\nￌ\uffff\u0014\uffff\b\u000b", true, objArr18);
                    Class<?> cls12 = Class.forName((String) objArr18[0]);
                    Object[] objArr19 = new Object[1];
                    ae(343 - AndroidCharacter.getMirror('0'), 8 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 15, "\ufffb\r\u0002\uffdd\t\ufffe\uffff\u0003\ufffe\uffff\b\u000e\u0003\u000e\u0013￢", false, objArr19);
                    Object[] objArr110 = {Integer.valueOf(((Integer) cls12.getMethod((String) objArr19[0], Object.class).invoke(null, ccVar)).intValue()), 0, -1418756761};
                    map = bp.f40694x;
                    method = map.get(388357536);
                    if (method != null) {
                        Class cls13 = (Class) bp.a(View.MeasureSpec.getMode(0) + 23, (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 387, (char) (ViewConfiguration.getKeyRepeatTimeout() >> 16));
                        byte b19 = (byte) ($$b & 14);
                        byte b110 = (byte) (b19 - 2);
                        Object[] objArr111 = new Object[1];
                        ad(b19, b110, b110, objArr111);
                        String str3 = (String) objArr111[0];
                        Class<?> cls14 = Integer.TYPE;
                        method = cls13.getMethod(str3, cls14, cls14, cls14);
                        map.put(388357536, method);
                    }
                    objArr2 = (Object[]) ((Method) method).invoke(null, objArr110);
                    Class cls15 = (Class) bp.a((AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 22, 387 - ImageFormat.getBitsPerPixel(0), (char) TextUtils.getOffsetAfter("", 0));
                    byte b111 = (byte) ($$b & 15);
                    byte b112 = (byte) (b111 - 3);
                    Object[] objArr112 = new Object[1];
                    ad(b111, b112, b112, objArr112);
                    cls15.getField((String) objArr112[0]).set(null, objArr2);
                    Object[] objArr113 = new Object[1];
                    ae(ExpandableListView.getPackedPositionChild(0L) + 293, 1 - TextUtils.getOffsetBefore("", 0), 22 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), "\b\ufffe\u000b\u0001\u000f\f\u0006\u0001ￋ\f\u0010ￋ\ufff0\u0016\u0010\u0011\u0002\n￠\t\f\u0000", false, objArr113);
                    Class<?> cls16 = Class.forName((String) objArr113[0]);
                    Object[] objArr114 = new Object[1];
                    ae((ViewConfiguration.getTouchSlop() >> 8) + 296, 13 - (ViewConfiguration.getFadingEdgeLength() >> 16), 15 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), "\ufffa\t\f\ufffe�￫\ufffe\ufffa\u0005\r\u0002\u0006\ufffe\ufffe\u0005", false, objArr114);
                    Long lValueOf2 = Long.valueOf(((Long) cls16.getDeclaredMethod((String) objArr114[0], new Class[0]).invoke(null, new Object[0])).longValue());
                    Class cls17 = (Class) bp.a(23 - View.combineMeasuredStates(0, 0), (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 388, (char) KeyEvent.getDeadChar(0, 0));
                    Object[] objArr115 = new Object[1];
                    ad(b10, b11, b12, objArr115);
                    cls17.getField((String) objArr115[0]).set(null, lValueOf2);
                }
                int i14 = ((int[]) objArr2[1])[0];
                int i15 = ((int[]) objArr2[0])[0];
                if (i15 == i14) {
                    Object[] objArr20 = {Integer.valueOf(((int[]) objArr2[9])[0]), 0};
                    Map map3 = bp.f40694x;
                    Object method4 = map3.get(1463901671);
                    if (method4 == null) {
                        Class cls18 = (Class) bp.a(23 - (KeyEvent.getMaxKeyCode() >> 16), 388 - ExpandableListView.getPackedPositionGroup(0L), (char) (ViewConfiguration.getScrollBarSize() >> 8));
                        Object[] objArr21 = new Object[1];
                        ad(b10, b11, b12, objArr21);
                        String str4 = (String) objArr21[0];
                        Class<?> cls19 = Integer.TYPE;
                        method4 = cls18.getMethod(str4, cls19, cls19);
                        map3.put(1463901671, method4);
                    }
                    Object[] objArr22 = {objArr2, Integer.valueOf(((Integer) ((Method) method4).invoke(null, objArr20)).intValue())};
                    Object method5 = map3.get(-2142901683);
                    if (method5 == null) {
                        method5 = ((Class) bp.a(23 - TextUtils.indexOf((CharSequence) "", '0', 0), ImageFormat.getBitsPerPixel(0) + 1837, (char) View.resolveSizeAndState(0, 0, 0))).getMethod("a", Object[].class, Integer.TYPE);
                        map3.put(-2142901683, method5);
                    }
                    ((Method) method5).invoke(null, objArr22);
                    return null;
                }
                ArrayList arrayList = new ArrayList();
                arrayList.add((String) objArr2[2]);
                arrayList.add((String) objArr2[3]);
                arrayList.add((String) objArr2[4]);
                arrayList.add((String) objArr2[5]);
                arrayList.add((String) objArr2[6]);
                arrayList.add((String) objArr2[7]);
                arrayList.add((String) objArr2[8]);
                Toast.makeText((Context) null, i15 / (((i15 - 1) * i15) % 2), 0).show();
                Object[] objArr23 = {Integer.valueOf(((int[]) objArr2[9])[0]), 0};
                Map map4 = bp.f40694x;
                Object method6 = map4.get(1463901671);
                if (method6 == null) {
                    Class cls20 = (Class) bp.a(Drawable.resolveOpacity(0, 0) + 23, View.MeasureSpec.makeMeasureSpec(0, 0) + 388, (char) ((-1) - Process.getGidForName("")));
                    Object[] objArr24 = new Object[1];
                    ad(b10, b11, b12, objArr24);
                    String str5 = (String) objArr24[0];
                    Class<?> cls21 = Integer.TYPE;
                    method6 = cls20.getMethod(str5, cls21, cls21);
                    map4.put(1463901671, method6);
                }
                Object[] objArr25 = {objArr2, Integer.valueOf(((Integer) ((Method) method6).invoke(null, objArr23)).intValue())};
                Object method7 = map4.get(-2142901683);
                if (method7 == null) {
                    method7 = ((Class) bp.a(24 - TextUtils.getOffsetBefore("", 0), 1836 - (ViewConfiguration.getTouchSlop() >> 8), (char) (1 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1))))).getMethod("a", Object[].class, Integer.TYPE);
                    map4.put(-2142901683, method7);
                }
                ((Method) method7).invoke(null, objArr25);
                return null;
            } catch (Throwable th2) {
                Throwable cause = th2.getCause();
                if (cause != null) {
                    throw cause;
                }
                throw th2;
            }
        } catch (Exception unused2) {
            throw new RuntimeException();
        }
    }

    private static /* synthetic */ Object f(Object[] objArr) {
        cc ccVar = (cc) objArr[0];
        int i10 = R + 47;
        P = i10 % 128;
        int i11 = i10 % 2;
        ccVar.S();
        int i12 = P + 33;
        R = i12 % 128;
        if (i12 % 2 != 0) {
            return null;
        }
        throw null;
    }

    private static /* synthetic */ Object g(Object[] objArr) {
        cc ccVar = (cc) objArr[0];
        int i10 = R + 121;
        P = i10 % 128;
        int i11 = i10 % 2;
        ccVar.R();
        if (i11 != 0) {
            throw null;
        }
        int i12 = P + 9;
        R = i12 % 128;
        if (i12 % 2 == 0) {
            int i13 = 58 / 0;
        }
        return null;
    }

    public final void a(final byte[] bArr, final int i10, final int i11, final int i12, final Boolean bool) {
        this.f40819t = new d(bArr, i10, i11);
        if (this.f40825z == null) {
            this.f40825z = new Date();
        }
        int i13 = 2;
        if (!this.f40809i.isShutdown() && this.f40820u != c.ID_SCAN && this.C.a()) {
            int i14 = R + 61;
            P = i14 % 128;
            int i15 = i14 % 2;
            if (bArr.length > 0 && (i10 > 25 || i11 > 25)) {
                try {
                    this.f40809i.execute(new k1(this, aa.e(bArr, i10, i11), i13));
                } catch (RejectedExecutionException unused) {
                }
            }
        }
        if (!q()) {
            int i16 = P + 9;
            R = i16 % 128;
            if (i16 % 2 == 0) {
                int i17 = 67 / 0;
                return;
            }
            return;
        }
        if (!this.G.tryAcquire()) {
            int i18 = R + 11;
            P = i18 % 128;
            int i19 = i18 % 2;
        } else {
            this.I = true;
            try {
                this.f40806f.execute(new Runnable() { // from class: com.facetec.sdk.o6
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f42749p0.b(bArr, i10, i11, i12, bool);
                    }
                });
            } catch (RejectedExecutionException unused2) {
                z();
            }
        }
    }

    public final void b(final boolean z10) {
        int i10 = P + 97;
        R = i10 % 128;
        if (i10 % 2 == 0) {
            throw null;
        }
        if (this.C != null && this.f40820u != c.ID_SCAN) {
            e(new Object[]{this}, -583599493, 583599499, System.identityHashCode(this));
            cx.d(new Runnable() { // from class: com.facetec.sdk.m6
                @Override // java.lang.Runnable
                public final void run() {
                    this.f42404p0.e(z10);
                }
            });
        } else {
            int i11 = P + 45;
            R = i11 % 128;
            if (i11 % 2 == 0) {
                throw null;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void e(boolean z10) {
        int i10 = R + 119;
        P = i10 % 128;
        int i11 = i10 % 2;
        i();
        this.C.d(z10);
        this.f40805d = false;
    }

    public final synchronized void b(a aVar) {
        this.f40810j.add(new WeakReference<>(aVar));
        int i10 = P + 23;
        R = i10 % 128;
        if (i10 % 2 == 0) {
            throw null;
        }
    }

    public final synchronized void d(@NonNull Context context, boolean z10, String str) {
        this.f40824y = 0;
        cx.d(B());
        int[] iArr = AnonymousClass5.f40826a;
        c cVar = this.f40820u;
        short s4 = (short) 946;
        try {
            byte[] bArr = Q;
            Object[] objArr = new Object[1];
            af(s4, bArr[20], (short) 752, objArr);
            Class<?> cls = Class.forName((String) objArr[0]);
            short s7 = (short) (O | 787);
            byte b10 = bArr[13];
            Object[] objArr2 = new Object[1];
            af(s7, b10, (short) (b10 | Constants.CVR_B2b8765_1111_APP_DISABLED), objArr2);
            int i10 = iArr[((Integer) cls.getMethod((String) objArr2[0], null).invoke(cVar, null)).intValue()];
            int i11 = 2;
            if (i10 == 1 || i10 == 2) {
                if (!ch.h(z10, str)) {
                    return;
                } else {
                    this.f40820u = c.ID_SCAN;
                }
            } else {
                if (i10 == 3 || i10 == 4) {
                    return;
                }
                if (i10 == 5) {
                    return;
                }
            }
            synchronized (this.f40822w) {
                e(new Object[]{this}, 749438003, -749438003, System.identityHashCode(this));
                cw cwVar = new cw(new u4(this, i11));
                this.B = cwVar;
                Timer timer = this.f40822w;
                try {
                    Object[] objArr3 = {cwVar, 60L, 10000L};
                    byte b11 = bArr[20];
                    Object[] objArr4 = new Object[1];
                    af((short) 994, b11, (short) (b11 | 739), objArr4);
                    Class<?> cls2 = Class.forName((String) objArr4[0]);
                    short s9 = (short) PointerIconCompat.TYPE_TEXT;
                    byte b12 = bArr[131];
                    Object[] objArr5 = new Object[1];
                    af(s9, b12, (short) (b12 | 744), objArr5);
                    String str2 = (String) objArr5[0];
                    Object[] objArr6 = new Object[1];
                    af((short) 1026, bArr[20], (short) 747, objArr6);
                    Class<?> cls3 = Long.TYPE;
                    cls2.getMethod(str2, Class.forName((String) objArr6[0]), cls3, cls3).invoke(timer, objArr3);
                } catch (Throwable th2) {
                    Throwable cause = th2.getCause();
                    if (cause == null) {
                        throw th2;
                    }
                    throw cause;
                }
            }
            e(new Object[]{context}, -1038929918, 1038929923, (int) System.currentTimeMillis());
        } catch (Throwable th3) {
            Throwable cause2 = th3.getCause();
            if (cause2 == null) {
                throw th3;
            }
            throw cause2;
        }
    }

    public final synchronized void b(b bVar) {
        try {
            int i10 = R + 29;
            P = i10 % 128;
            int i11 = i10 % 2;
            Iterator<WeakReference<b>> it = this.f40808h.iterator();
            while (!(!it.hasNext())) {
                if (it.next().get() == bVar) {
                    it.remove();
                }
            }
            int i12 = P + 53;
            R = i12 % 128;
            if (i12 % 2 == 0) {
                throw null;
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final synchronized void e(b bVar) {
        this.f40808h.add(new WeakReference<>(bVar));
        int i10 = P + 65;
        R = i10 % 128;
        if (i10 % 2 == 0) {
            throw null;
        }
    }

    public final synchronized void e(e eVar) {
        try {
            int i10 = R + 15;
            P = i10 % 128;
            if (i10 % 2 == 0) {
                Iterator<WeakReference<e>> it = this.f40807g.iterator();
                while (it.hasNext()) {
                    if (it.next().get() == eVar) {
                        it.remove();
                        int i11 = R + 1;
                        P = i11 % 128;
                        int i12 = i11 % 2;
                    }
                    int i13 = R + 97;
                    P = i13 % 128;
                    int i14 = i13 % 2;
                }
            } else {
                this.f40807g.iterator();
                throw null;
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    private static /* synthetic */ Object b(Object[] objArr) throws Throwable {
        Context context = (Context) objArr[0];
        int i10 = R + 1;
        P = i10 % 128;
        int i11 = i10 % 2;
        ch.L(f40802c);
        ch.N(bg.b(context, false));
        Object[] objArr2 = new Object[1];
        ah(7 - Drawable.resolveOpacity(0, 0), "\t\n\u000b\u000e\u0002\u0001㘩", (byte) (42 - ImageFormat.getBitsPerPixel(0)), objArr2);
        ch.K(((String) objArr2[0]).intern());
        ch.M(Build.MODEL);
        ch.R(Build.VERSION.RELEASE);
        ch.O(context.getPackageName());
        Locale locale = Locale.getDefault();
        ch.S(locale.getLanguage());
        ch.Q(locale.toString());
        ch.P("9.6.101");
        ch.V(as.a());
        ch.W(((Integer) as.d(new Object[]{context}, -528518656, 528518657, (int) System.currentTimeMillis())).intValue());
        ch.I(ak.f40283ag, FaceTecSDK.f40110e);
        ch.I(ak.f40281ae, FaceTecSDK.f40111h);
        ch.I(ak.f40284ah, FaceTecSDK.f40112j);
        bn.a();
        int i12 = P + 113;
        R = i12 % 128;
        if (i12 % 2 != 0) {
            return null;
        }
        throw null;
    }

    public final synchronized boolean a(@NonNull Context context, boolean z10) {
        Cdo cdo;
        cdo = new Cdo(this, context, z10 ? 1 : 0);
        byte[] bArr = Q;
        char c10 = '!';
        Object[] objArr = new Object[1];
        af((short) 181, (byte) 73, bArr[33], objArr);
        char c11 = 0;
        String str = (String) objArr[0];
        short s4 = (short) 112;
        Object[] objArr2 = new Object[1];
        af(s4, (byte) 74, (short) (O | 593), objArr2);
        try {
            Object[] objArr3 = {(String) objArr2[0]};
            char c12 = 20;
            byte b10 = bArr[20];
            Object[] objArr4 = new Object[1];
            af(s4, b10, (short) (b10 | 738), objArr4);
            Class<?> cls = Class.forName((String) objArr4[0]);
            int i10 = 131;
            Object[] objArr5 = new Object[1];
            af((short) 127, bArr[131], (short) 761, objArr5);
            String str2 = (String) objArr5[0];
            byte b11 = bArr[20];
            Object[] objArr6 = new Object[1];
            af(s4, b11, (short) (b11 | 738), objArr6);
            Object[] objArr7 = (Object[]) cls.getMethod(str2, Class.forName((String) objArr6[0])).invoke(str, objArr3);
            int[] iArr = new int[objArr7.length];
            int i11 = 0;
            while (i11 < objArr7.length) {
                Object[] objArr8 = new Object[1];
                objArr8[c11] = objArr7[i11];
                short s7 = (short) i10;
                byte[] bArr2 = Q;
                byte b12 = bArr2[c12];
                Object[] objArr9 = new Object[1];
                af(s7, b12, (short) (b12 | 737), objArr9);
                Class<?> cls2 = Class.forName((String) objArr9[c11]);
                byte b13 = bArr2[c10];
                Object[] objArr10 = new Object[1];
                af((short) 147, b13, (short) (b13 | 759), objArr10);
                String str3 = (String) objArr10[c11];
                byte b14 = bArr2[20];
                Object[] objArr11 = new Object[1];
                af(s4, b14, (short) (b14 | 738), objArr11);
                Object objInvoke = cls2.getMethod(str3, Class.forName((String) objArr11[0])).invoke(null, objArr8);
                byte b15 = bArr2[20];
                Object[] objArr12 = new Object[1];
                af(s7, b15, (short) (b15 | 737), objArr12);
                Class<?> cls3 = Class.forName((String) objArr12[0]);
                Object[] objArr13 = new Object[1];
                af((short) 153, bArr2[25], (short) 758, objArr13);
                iArr[i11] = ((Integer) cls3.getMethod((String) objArr13[0], null).invoke(objInvoke, null)).intValue();
                i11++;
                c11 = 0;
                c10 = '!';
                c12 = 20;
                i10 = 131;
            }
            int i12 = 0;
            while (true) {
                int i13 = i12 + 1;
                try {
                    switch (cdo.d(iArr[i12])) {
                        case -94:
                            i12 = 217;
                            break;
                        case -93:
                            cdo.d(22);
                            int i14 = cdo.f41318c;
                            i12 = (i14 == 0 || i14 != 1) ? 7 : 25;
                            break;
                        case -92:
                            i12 = ErrorCodes.ERR_CRY_BAD_BLOCK_SIZE;
                            break;
                        case -91:
                            cdo.d(22);
                            int i15 = cdo.f41318c;
                            i12 = (i15 == 0 || i15 != 1) ? 134 : 176;
                            break;
                        case -90:
                            i12 = 207;
                            break;
                        case -89:
                            cdo.d(22);
                            i12 = cdo.f41318c != 0 ? 73 : 71;
                            break;
                        case -88:
                            i12 = 202;
                            break;
                        case -87:
                            cdo.d(22);
                            int i16 = cdo.f41318c;
                            i12 = (i16 == 13 || i16 != 42) ? 51 : 49;
                            break;
                        case -86:
                            i12 = 126;
                            break;
                        case -85:
                            i12 = Opcodes.IFNULL;
                            break;
                        case -84:
                            cdo.d(36);
                            i12 = cdo.f41318c == 0 ? Opcodes.MULTIANEWARRAY : i13;
                            break;
                        case -83:
                            i12 = 122;
                            break;
                        case -82:
                            i12 = 189;
                            break;
                        case -81:
                            cdo.d(18);
                            if (cdo.f41318c == 0) {
                                i12 = 188;
                            }
                            break;
                        case -80:
                            i12 = ErrorCodes.ERR_CRY_BAD_PIN_SIZE;
                            break;
                        case -79:
                            i12 = ErrorCodes.ERR_CRY_BAD_REC_RSA_PRIKEY;
                            break;
                        case -78:
                            cdo.d(18);
                            if (cdo.f41318c == 0) {
                                i12 = 175;
                            }
                            break;
                        case -77:
                            cdo.d(18);
                            if (cdo.f41318c == 0) {
                                i12 = 165;
                            }
                            break;
                        case -76:
                            cdo.d(14);
                            throw ((Throwable) cdo.f41321f);
                        case -75:
                            i12 = 57;
                            break;
                        case -74:
                            i12 = 160;
                            break;
                        case -73:
                            cdo.d(18);
                            if (cdo.f41318c == 0) {
                                i12 = 158;
                            }
                            break;
                        case -72:
                            cdo.f41319d = 1;
                            cdo.d(3);
                            cdo.d(6);
                            R = cdo.f41318c;
                            break;
                        case -71:
                            cdo.f41319d = P;
                            cdo.d(7);
                            break;
                        case -70:
                            i12 = 30;
                            break;
                        case -69:
                            i12 = 149;
                            break;
                        case -68:
                            cdo.d(36);
                            if (cdo.f41318c == 0) {
                                i12 = 148;
                            }
                            break;
                        case -67:
                            cdo.f41319d = 1;
                            cdo.d(3);
                            cdo.d(6);
                            P = cdo.f41318c;
                            break;
                        case -66:
                            cdo.f41319d = R;
                            cdo.d(7);
                            break;
                        case -65:
                            i12 = 1;
                            break;
                        case -64:
                            break;
                        case -63:
                            cdo.f41319d = 1;
                            cdo.d(3);
                            cdo.d(4);
                            Object[] objArr14 = new Object[1];
                            try {
                                objArr14[0] = (Context) cdo.f41321f;
                                e(objArr14, -1038929918, 1038929923, (int) System.currentTimeMillis());
                            } catch (Throwable th2) {
                                th = th2;
                                if (i13 >= 161) {
                                }
                                throw th;
                            }
                            break;
                        case -62:
                            u();
                            break;
                        case -61:
                            cdo.f41319d = 2;
                            cdo.d(3);
                            cdo.d(4);
                            cc ccVar = (cc) cdo.f41321f;
                            cdo.d(4);
                            ccVar.a((Context) cdo.f41321f);
                            break;
                        case -60:
                            cdo.f41319d = 2;
                            cdo.d(3);
                            cdo.d(4);
                            cc ccVar2 = (cc) cdo.f41321f;
                            cdo.d(4);
                            ccVar2.f40820u = (c) cdo.f41321f;
                            break;
                        case -59:
                            i12 = 105;
                            break;
                        case -58:
                            i12 = 103;
                            break;
                        case -57:
                            cdo.d(18);
                            if (cdo.f41318c == 0) {
                                i12 = 102;
                            }
                            break;
                        case -56:
                            cdo.f41319d = 1;
                            cdo.d(3);
                            cdo.d(6);
                            cdo.f41319d = ch.c(cdo.f41318c != 0) ? 1 : 0;
                            cdo.d(7);
                            break;
                        case -55:
                            cdo.d(22);
                            int i17 = cdo.f41318c;
                            i12 = (i17 == 1 || i17 == 2) ? 98 : (i17 == 3 || i17 == 4) ? 115 : 117;
                            break;
                        case -54:
                            try {
                                cdo.f41319d = 1;
                                cdo.d(3);
                                cdo.d(4);
                                Object obj = cdo.f41321f;
                                short s9 = (short) 946;
                                try {
                                    byte[] bArr3 = Q;
                                    try {
                                        Object[] objArr15 = new Object[1];
                                        af(s9, bArr3[20], (short) 752, objArr15);
                                        Class<?> cls4 = Class.forName((String) objArr15[0]);
                                        short s10 = (short) (O | 787);
                                        byte b16 = bArr3[13];
                                        Object[] objArr16 = new Object[1];
                                        af(s10, b16, (short) (b16 | Constants.CVR_B2b8765_1111_APP_DISABLED), objArr16);
                                        try {
                                            try {
                                                cdo.f41319d = ((Integer) cls4.getMethod((String) objArr16[0], null).invoke(obj, null)).intValue();
                                                cdo.d(7);
                                            } catch (Throwable th3) {
                                                th = th3;
                                                if (i13 >= 161 || i13 > 166) {
                                                    throw th;
                                                }
                                                cdo.f41324i = th;
                                                cdo.d(25);
                                                i12 = 159;
                                            }
                                        } catch (Throwable th4) {
                                            th = th4;
                                            Throwable cause = th.getCause();
                                            if (cause != null) {
                                                throw cause;
                                            }
                                            throw th;
                                        }
                                    } catch (Throwable th5) {
                                        th = th5;
                                    }
                                } catch (Throwable th6) {
                                    th = th6;
                                }
                            } catch (Throwable th7) {
                                th = th7;
                            }
                            break;
                        case -53:
                            cdo.f41324i = AnonymousClass5.f40826a;
                            cdo.d(1);
                            break;
                        case -52:
                            cdo.f41319d = 1;
                            cdo.d(3);
                            cdo.d(4);
                            cdo.f41324i = cx.d((Runnable) cdo.f41321f);
                            cdo.d(1);
                            break;
                        case -51:
                            cdo.f41319d = 1;
                            cdo.d(3);
                            cdo.d(4);
                            cdo.f41324i = ((cc) cdo.f41321f).B();
                            cdo.d(1);
                            break;
                        case -50:
                            cdo.f41319d = 2;
                            cdo.d(3);
                            cdo.d(4);
                            cc ccVar3 = (cc) cdo.f41321f;
                            cdo.d(4);
                            ccVar3.f40817r = (cp) cdo.f41321f;
                            break;
                        case -49:
                            cdo.f41324i = cp.DETECTING_LIGHT_MODE;
                            cdo.d(1);
                            break;
                        case -48:
                            cdo.f41319d = 2;
                            cdo.d(3);
                            cdo.d(4);
                            cc ccVar4 = (cc) cdo.f41321f;
                            cdo.d(6);
                            ccVar4.f40824y = cdo.f41318c;
                            break;
                        case -47:
                            cdo.f41319d = 2;
                            cdo.d(3);
                            cdo.d(4);
                            cc ccVar5 = (cc) cdo.f41321f;
                            cdo.d(6);
                            ccVar5.f40823x = cdo.f41318c;
                            break;
                        case -46:
                            i12 = 179;
                            break;
                        case -45:
                            i12 = 166;
                            break;
                        case -44:
                            i12 = 75;
                            break;
                        case -43:
                            i12 = ErrorCodes.ERR_CRY_BAD_REC_RSA_PUBKEY;
                            break;
                        case -42:
                            i12 = ErrorCodes.ERR_CRY_IO_PROPERTIES;
                            break;
                        case -41:
                            cdo.d(36);
                            if (cdo.f41318c == 0) {
                                i12 = 70;
                            }
                            break;
                        case -40:
                            break;
                        case -39:
                            i12 = 66;
                            break;
                        case -38:
                            cdo.d(18);
                            if (cdo.f41318c == 0) {
                                i12 = 65;
                            }
                            break;
                        case -37:
                            i12 = 77;
                            break;
                        case -36:
                            cdo.d(18);
                            if (cdo.f41318c == 0) {
                                i12 = 60;
                            }
                            break;
                        case -35:
                            i12 = 61;
                            break;
                        case -34:
                            i12 = 150;
                            break;
                        case -33:
                            cdo.d(18);
                            if (cdo.f41318c == 0) {
                                i12 = 56;
                            }
                            break;
                        case -32:
                            i12 = 53;
                            break;
                        case -31:
                            i12 = 190;
                            break;
                        case -30:
                            i12 = 203;
                            break;
                        case -29:
                            i12 = 205;
                            break;
                        case -28:
                            cdo.d(18);
                            if (cdo.f41318c == 0) {
                                i12 = 48;
                            }
                            break;
                        case -27:
                            break;
                        case -26:
                            i12 = 44;
                            break;
                        case -25:
                            cdo.d(18);
                            if (cdo.f41318c == 0) {
                                i12 = 43;
                            }
                            break;
                        case -24:
                            i12 = 130;
                            break;
                        case -23:
                            i12 = 40;
                            break;
                        case -22:
                            i12 = 36;
                            break;
                        case -21:
                            cdo.d(18);
                            if (cdo.f41318c == 0) {
                                i12 = 35;
                            }
                            break;
                        case -20:
                            i12 = 38;
                            break;
                        case -19:
                            i12 = 138;
                            break;
                        case -18:
                            cdo.d(18);
                            if (cdo.f41318c == 0) {
                                i12 = 29;
                            }
                            break;
                        case -17:
                            cdo.f41319d = 1;
                            cdo.d(3);
                            cdo.d(4);
                            cdo.f41319d = ((cc) cdo.f41321f).f40823x;
                            cdo.d(7);
                            break;
                        case -16:
                            cdo.d(29);
                            break;
                        case -15:
                            cdo.f41319d = 2;
                            cdo.d(3);
                            cdo.d(4);
                            cc ccVar6 = (cc) cdo.f41321f;
                            cdo.d(6);
                            ccVar6.b(cdo.f41318c != 0);
                            break;
                        case -14:
                            cdo.f41319d = 1;
                            cdo.d(3);
                            cdo.d(4);
                            cdo.f41319d = ((cc) cdo.f41321f).f40804b ? 1 : 0;
                            cdo.d(7);
                            break;
                        case -13:
                            i12 = 18;
                            break;
                        case -12:
                            cdo.d(18);
                            if (cdo.f41318c == 0) {
                                i12 = 17;
                            }
                            break;
                        case -11:
                            cdo.f41319d = 1;
                            cdo.d(3);
                            cdo.d(4);
                            cdo.f41319d = ((v) cdo.f41321f).c() ? 1 : 0;
                            cdo.d(7);
                            break;
                        case -10:
                            i12 = 23;
                            break;
                        case -9:
                            i12 = 12;
                            break;
                        case -8:
                            cdo.d(27);
                            if (cdo.f41318c == 0) {
                                i12 = 11;
                            }
                            break;
                        case -7:
                            cdo.f41319d = 1;
                            cdo.d(3);
                            cdo.d(4);
                            cdo.f41324i = ((cc) cdo.f41321f).C;
                            cdo.d(1);
                            break;
                        case -6:
                            i12 = 218;
                            break;
                        case -5:
                            i12 = 220;
                            break;
                        case -4:
                            cdo.d(26);
                            if (cdo.f41318c == 0) {
                                i12 = 6;
                            }
                            break;
                        case -3:
                            cdo.f41324i = c.PRE_SESSION;
                            cdo.d(1);
                            break;
                        case -2:
                            cdo.f41319d = 1;
                            cdo.d(3);
                            cdo.d(4);
                            cdo.f41324i = ((cc) cdo.f41321f).f40820u;
                            cdo.d(1);
                            break;
                        case -1:
                            i12 = 119;
                            break;
                        default:
                            break;
                    }
                } catch (Throwable th8) {
                    th = th8;
                }
            }
        } catch (Throwable th9) {
            Throwable cause2 = th9.getCause();
            if (cause2 != null) {
                throw cause2;
            }
            throw th9;
        }
        return cdo.f41318c != 0;
    }

    public final void a() {
        e(new Object[]{this}, -583599493, 583599499, System.identityHashCode(this));
    }

    private static /* synthetic */ Object e(Object[] objArr) {
        cc ccVar = (cc) objArr[0];
        synchronized (ccVar.f40822w) {
            try {
                ccVar.f40825z = null;
                TimerTask timerTask = ccVar.B;
                if (timerTask != null) {
                    timerTask.cancel();
                    ccVar.B = null;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return null;
    }

    private void d(byte[] bArr, int i10, int i11, int i12, Boolean bool) throws Throwable {
        c cVar;
        synchronized (this.f40821v) {
            c cVar2 = this.f40820u;
            if (cVar2 == c.FINISHED || cVar2 == (cVar = c.WAITING_TO_FINISH)) {
                return;
            }
            int i13 = this.f40824y + 1;
            this.f40824y = i13;
            if (i13 < 4) {
                return;
            }
            try {
                Object[] objArr = new Object[1];
                ag("뀑\ueb53ڟꇁ\udd71硺鎬컪橔藄\u20f2尡\uf764ኺ䷠\ue951", 23369 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), objArr);
                Class<?> cls = Class.forName((String) objArr[0]);
                Object[] objArr2 = new Object[1];
                ag("뀘თ\uf1bb劂㍺鐨甙헀뛚ិ\uf864奥㨾鬒築\udca5붘", View.MeasureSpec.getSize(0) + 41177, objArr2);
                ch.j(this.D, bArr, ((Long) cls.getMethod((String) objArr2[0], null).invoke(null, null)).longValue(), bool.booleanValue(), i10, i11, i12, false);
                this.f40814o = ch.h();
                this.f40812l = ch.p();
                cj cjVar = this.f40814o;
                if (cjVar == cj.ZOOM_CLOSE) {
                    this.f40805d = true;
                }
                if (cjVar.e()) {
                    this.f40820u = cVar;
                }
                cj cjVar2 = this.f40814o;
                if (cjVar2 == cj.PROCESSING_COMPLETE_TIMED_OUT || cjVar2 == cj.PROCESSING_COMPLETE_RETRY || cjVar2 == cj.PROCESSING_COMPLETE_SUCCESS) {
                    this.f40820u = cVar;
                    e(new Object[]{this}, -583599493, 583599499, System.identityHashCode(this));
                }
                N();
            } catch (Throwable th2) {
                Throwable cause = th2.getCause();
                if (cause == null) {
                    throw th2;
                }
                throw cause;
            }
        }
    }

    private void e(byte[] bArr, int i10, int i11, int i12, Boolean bool) throws Throwable {
        synchronized (this.f40821v) {
            if (this.f40820u != c.PRE_SESSION) {
                return;
            }
            int i13 = this.f40824y + 1;
            this.f40824y = i13;
            if (i13 < 4) {
                return;
            }
            F();
            try {
                Object[] objArr = new Object[1];
                ag("뀑\ueb53ڟꇁ\udd71硺鎬컪橔藄\u20f2尡\uf764ኺ䷠\ue951", 23370 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), objArr);
                Class<?> cls = Class.forName((String) objArr[0]);
                Object[] objArr2 = new Object[1];
                ag("뀘თ\uf1bb劂㍺鐨甙헀뛚ិ\uf864奥㨾鬒築\udca5붘", 41177 - TextUtils.indexOf("", "", 0), objArr2);
                ch.j(this.D, bArr, ((Long) cls.getMethod((String) objArr2[0], null).invoke(null, null)).longValue(), bool.booleanValue(), i10, i11, i12, true);
                this.f40817r = ch.l();
                this.f40816q = ch.j();
                this.f40818s = ch.k();
                this.f40815p = ch.m();
                E();
            } catch (Throwable th2) {
                Throwable cause = th2.getCause();
                if (cause == null) {
                    throw th2;
                }
                throw cause;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b(Context context) {
        if (this.D) {
            int i10 = P + 7;
            R = i10 % 128;
            if (i10 % 2 == 0) {
                l.b(context);
                int i11 = 2 / 0;
            } else {
                l.b(context);
            }
        }
        int i12 = R + 5;
        P = i12 % 128;
        if (i12 % 2 != 0) {
            throw null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0075 A[Catch: all -> 0x0066, TRY_LEAVE, TryCatch #3 {all -> 0x0066, blocks: (B:5:0x0006, B:8:0x004c, B:32:0x015f, B:33:0x0161, B:38:0x01f0, B:48:0x020f, B:49:0x0210, B:15:0x005b, B:17:0x005f, B:20:0x0069, B:21:0x0075, B:25:0x007d, B:27:0x0088, B:28:0x008e, B:30:0x0150, B:31:0x0159, B:51:0x0212, B:53:0x0218, B:54:0x0219, B:7:0x000f, B:34:0x0162, B:37:0x01ef, B:44:0x0207, B:46:0x020d, B:47:0x020e, B:36:0x0183), top: B:62:0x0006, inners: #0, #1 }] */
    /* JADX WARN: Code duplicated, block: B:23:0x007b A[DONT_GENERATE] */
    /* JADX WARN: Code duplicated, block: B:25:0x007d A[Catch: all -> 0x0066, TRY_ENTER, TryCatch #3 {all -> 0x0066, blocks: (B:5:0x0006, B:8:0x004c, B:32:0x015f, B:33:0x0161, B:38:0x01f0, B:48:0x020f, B:49:0x0210, B:15:0x005b, B:17:0x005f, B:20:0x0069, B:21:0x0075, B:25:0x007d, B:27:0x0088, B:28:0x008e, B:30:0x0150, B:31:0x0159, B:51:0x0212, B:53:0x0218, B:54:0x0219, B:7:0x000f, B:34:0x0162, B:37:0x01ef, B:44:0x0207, B:46:0x020d, B:47:0x020e, B:36:0x0183), top: B:62:0x0006, inners: #0, #1 }] */
    /* JADX WARN: Code duplicated, block: B:27:0x0088 A[Catch: all -> 0x0066, TryCatch #3 {all -> 0x0066, blocks: (B:5:0x0006, B:8:0x004c, B:32:0x015f, B:33:0x0161, B:38:0x01f0, B:48:0x020f, B:49:0x0210, B:15:0x005b, B:17:0x005f, B:20:0x0069, B:21:0x0075, B:25:0x007d, B:27:0x0088, B:28:0x008e, B:30:0x0150, B:31:0x0159, B:51:0x0212, B:53:0x0218, B:54:0x0219, B:7:0x000f, B:34:0x0162, B:37:0x01ef, B:44:0x0207, B:46:0x020d, B:47:0x020e, B:36:0x0183), top: B:62:0x0006, inners: #0, #1 }] */
    /* JADX WARN: Code duplicated, block: B:30:0x0150 A[Catch: all -> 0x0066, TryCatch #3 {all -> 0x0066, blocks: (B:5:0x0006, B:8:0x004c, B:32:0x015f, B:33:0x0161, B:38:0x01f0, B:48:0x020f, B:49:0x0210, B:15:0x005b, B:17:0x005f, B:20:0x0069, B:21:0x0075, B:25:0x007d, B:27:0x0088, B:28:0x008e, B:30:0x0150, B:31:0x0159, B:51:0x0212, B:53:0x0218, B:54:0x0219, B:7:0x000f, B:34:0x0162, B:37:0x01ef, B:44:0x0207, B:46:0x020d, B:47:0x020e, B:36:0x0183), top: B:62:0x0006, inners: #0, #1 }] */
    /* JADX WARN: Instruction removed from duplicated block: B:23:0x007b, please report this as an issue */
    public final synchronized boolean c(@NonNull Context context, String str) {
        Class<?> cls;
        Object[] objArr;
        try {
            this.f40824y = 0;
            int[] iArr = AnonymousClass5.f40826a;
            c cVar = this.f40820u;
            short s4 = (short) 946;
            try {
                byte[] bArr = Q;
                int i10 = 1;
                Object[] objArr2 = new Object[1];
                af(s4, bArr[20], (short) 752, objArr2);
                Class<?> cls2 = Class.forName((String) objArr2[0]);
                short s7 = (short) (O | 787);
                byte b10 = bArr[13];
                Object[] objArr3 = new Object[1];
                af(s7, b10, (short) (b10 | Constants.CVR_B2b8765_1111_APP_DISABLED), objArr3);
                int i11 = iArr[((Integer) cls2.getMethod((String) objArr3[0], null).invoke(cVar, null)).intValue()];
                if (i11 == 1 || i11 == 2) {
                    if (!ch.e(str)) {
                        return false;
                    }
                    this.f40820u = c.PROCESSING;
                    a(context);
                    if (this.D) {
                        l.b();
                        l.d();
                    }
                    l.c();
                    l.e();
                    ch.G(ak.U, bg.f(context));
                    ch.F(ak.f40279ac, bd.f40494c);
                    ch.I(ak.f40279ac, bd.f40494c ? 1 : 0);
                    ch.I(ak.f40303u, l.f42225a);
                    String str2 = ak.f40305w;
                    short s9 = (short) 965;
                    short s10 = (short) 742;
                    Object[] objArr4 = new Object[1];
                    af(s9, bArr[118], s10, objArr4);
                    Class<?> cls3 = Class.forName((String) objArr4[0]);
                    short s11 = (short) 988;
                    byte b11 = (byte) (-bArr[1022]);
                    Object[] objArr5 = new Object[1];
                    af(s11, b11, (short) (b11 | 724), objArr5);
                    ch.G(str2, cls3.getField((String) objArr5[0]).getInt(null));
                    String str3 = ak.f40305w;
                    Object[] objArr6 = new Object[1];
                    af(s9, bArr[118], s10, objArr6);
                    Class<?> cls4 = Class.forName((String) objArr6[0]);
                    byte b12 = (byte) (-bArr[1022]);
                    Object[] objArr7 = new Object[1];
                    af(s11, b12, (short) (b12 | 724), objArr7);
                    ch.I(str3, cls4.getField((String) objArr7[0]).getInt(null));
                    l.a();
                    cx.d(new c4(this, context, i10));
                    Object[] objArr8 = new Object[1];
                    af(s9, bArr[118], s10, objArr8);
                    cls = Class.forName((String) objArr8[0]);
                    byte b13 = (byte) (-bArr[1022]);
                    objArr = new Object[1];
                    af(s11, b13, (short) (b13 | 724), objArr);
                    if (cls.getField((String) objArr[0]).getInt(null) >= 23) {
                        cx.b(new u2(context, 3));
                    }
                    l.f();
                    l.g();
                } else if (i11 == 3) {
                    if (ag.f40233d) {
                        ch.a(true);
                        ch.e(str);
                    }
                    ch.c();
                    this.f40820u = c.PROCESSING;
                    u();
                } else if (i11 == 4) {
                    if (!ch.e(str)) {
                        return false;
                    }
                    this.f40820u = c.PROCESSING;
                    a(context);
                    if (this.D) {
                        l.b();
                        l.d();
                    }
                    l.c();
                    l.e();
                    ch.G(ak.U, bg.f(context));
                    ch.F(ak.f40279ac, bd.f40494c);
                    ch.I(ak.f40279ac, bd.f40494c ? 1 : 0);
                    ch.I(ak.f40303u, l.f42225a);
                    String str4 = ak.f40305w;
                    short s12 = (short) 965;
                    short s13 = (short) 742;
                    Object[] objArr9 = new Object[1];
                    af(s12, bArr[118], s13, objArr9);
                    Class<?> cls5 = Class.forName((String) objArr9[0]);
                    short s14 = (short) 988;
                    byte b14 = (byte) (-bArr[1022]);
                    Object[] objArr10 = new Object[1];
                    af(s14, b14, (short) (b14 | 724), objArr10);
                    ch.G(str4, cls5.getField((String) objArr10[0]).getInt(null));
                    String str5 = ak.f40305w;
                    Object[] objArr11 = new Object[1];
                    af(s12, bArr[118], s13, objArr11);
                    Class<?> cls6 = Class.forName((String) objArr11[0]);
                    byte b15 = (byte) (-bArr[1022]);
                    Object[] objArr12 = new Object[1];
                    af(s14, b15, (short) (b15 | 724), objArr12);
                    ch.I(str5, cls6.getField((String) objArr12[0]).getInt(null));
                    l.a();
                    cx.d(new c4(this, context, i10));
                    Object[] objArr13 = new Object[1];
                    af(s12, bArr[118], s13, objArr13);
                    cls = Class.forName((String) objArr13[0]);
                    byte b16 = (byte) (-bArr[1022]);
                    objArr = new Object[1];
                    af(s14, b16, (short) (b16 | 724), objArr);
                    if (cls.getField((String) objArr[0]).getInt(null) >= 23) {
                        cx.b(new u2(context, 3));
                    }
                    l.f();
                    l.g();
                }
                synchronized (this.f40822w) {
                    e(new Object[]{this}, 749438003, -749438003, System.identityHashCode(this));
                    cw cwVar = new cw(new d1(this, 6));
                    this.B = cwVar;
                    Timer timer = this.f40822w;
                    try {
                        Object[] objArr14 = {cwVar, 60L, 10000L};
                        byte b17 = bArr[20];
                        Object[] objArr15 = new Object[1];
                        af((short) 994, b17, (short) (b17 | 739), objArr15);
                        Class<?> cls7 = Class.forName((String) objArr15[0]);
                        short s15 = (short) PointerIconCompat.TYPE_TEXT;
                        byte b18 = bArr[131];
                        Object[] objArr16 = new Object[1];
                        af(s15, b18, (short) (b18 | 744), objArr16);
                        String str6 = (String) objArr16[0];
                        Object[] objArr17 = new Object[1];
                        af((short) 1026, bArr[20], (short) 747, objArr17);
                        Class<?> cls8 = Long.TYPE;
                        cls7.getMethod(str6, Class.forName((String) objArr17[0]), cls8, cls8).invoke(timer, objArr14);
                    } catch (Throwable th2) {
                        Throwable cause = th2.getCause();
                        if (cause != null) {
                            throw cause;
                        }
                        throw th2;
                    }
                }
                e(new Object[]{context}, -1038929918, 1038929923, (int) System.currentTimeMillis());
                return true;
            } catch (Throwable th3) {
                Throwable cause2 = th3.getCause();
                if (cause2 != null) {
                    throw cause2;
                }
                throw th3;
            }
        } catch (Throwable th4) {
            throw th4;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b(byte[] bArr, int i10, int i11, int i12, Boolean bool) {
        int i13 = P + 107;
        R = i13 % 128;
        try {
            if (i13 % 2 != 0) {
                c cVar = this.f40820u;
                if (cVar == c.PRE_SESSION) {
                    e(bArr, i10, i11, i12, bool);
                } else if (cVar == c.ID_SCAN) {
                    int i14 = P + 105;
                    R = i14 % 128;
                    int i15 = i14 % 2;
                    c(bArr, i10, i11, i12, bool);
                } else {
                    d(bArr, i10, i11, i12, bool);
                }
                z();
                return;
            }
            c cVar2 = c.NOT_STARTED;
            throw null;
        } catch (Throwable th2) {
            try {
                th2.printStackTrace();
            } finally {
                z();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void d(Context context) {
        String strTrim;
        au.c("UMT");
        UsbManager usbManager = (UsbManager) context.getApplicationContext().getSystemService("usb");
        au.b("UMT");
        au.c("UDT");
        HashMap<String, UsbDevice> deviceList = usbManager.getDeviceList();
        au.b("UDT");
        StringBuilder sb2 = new StringBuilder();
        StringBuilder sb3 = new StringBuilder();
        StringBuilder sb4 = new StringBuilder();
        StringBuilder sb5 = new StringBuilder();
        int i10 = P + 113;
        R = i10 % 128;
        int i11 = i10 % 2;
        boolean z10 = false;
        for (Iterator<UsbDevice> it = deviceList.values().iterator(); !(!it.hasNext()); it = it) {
            UsbDevice next = it.next();
            if (next != null) {
                String deviceName = next.getDeviceName();
                String strValueOf = String.valueOf(next.getDeviceClass());
                if (next.getManufacturerName() != null) {
                    int i12 = P + 43;
                    R = i12 % 128;
                    if (i12 % 2 != 0) {
                        strTrim = next.getManufacturerName().trim();
                    } else {
                        next.getManufacturerName().trim();
                        throw null;
                    }
                } else {
                    strTrim = "FT_NULL";
                }
                String strTrim2 = next.getProductName() != null ? next.getProductName().trim() : "FT_NULL";
                sb2.append(deviceName);
                short s4 = (short) 112;
                byte b10 = (byte) 74;
                int i13 = O;
                Object[] objArr = new Object[1];
                af(s4, b10, (short) (i13 | 593), objArr);
                sb2.append((String) objArr[0]);
                sb3.append(strValueOf);
                Object[] objArr2 = new Object[1];
                af(s4, b10, (short) (i13 | 593), objArr2);
                sb3.append((String) objArr2[0]);
                sb4.append(strTrim);
                Object[] objArr3 = new Object[1];
                af(s4, b10, (short) (i13 | 593), objArr3);
                sb4.append((String) objArr3[0]);
                sb5.append(strTrim2);
                Object[] objArr4 = new Object[1];
                af(s4, b10, (short) (i13 | 593), objArr4);
                sb5.append((String) objArr4[0]);
                z10 = true;
            }
        }
        ch.F(ak.A, z10);
        ch.D(ak.F, sb2.toString());
        ch.D(ak.H, sb3.toString());
        ch.D(ak.G, sb4.toString());
        ch.D(ak.E, sb5.toString());
        ch.D(ak.K, String.valueOf(au.d("UMT")));
        ch.D(ak.M, String.valueOf(au.d("UDT")));
    }

    public final synchronized void c(boolean z10) {
        boolean z11;
        synchronized (this.f40821v) {
            try {
                c cVar = this.f40820u;
                if (cVar == c.PROCESSING || cVar == c.WAITING_TO_FINISH) {
                    this.f40820u = c.FINISHED;
                    z11 = true;
                } else {
                    z11 = false;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        cx.d(B());
        e(new Object[]{this}, 749438003, -749438003, System.identityHashCode(this));
        e(new Object[]{this}, -583599493, 583599499, System.identityHashCode(this));
        if (z11) {
            ch.a(z10);
        }
    }

    public final void d() {
        e(new Object[]{this}, 472527550, -472527549, System.identityHashCode(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void c(byte[] bArr) {
        int i10 = R + 63;
        P = i10 % 128;
        if (i10 % 2 != 0) {
            throw null;
        }
        v vVar = this.C;
        if (vVar == null) {
            return;
        }
        vVar.a(bArr);
        int i11 = R + 89;
        P = i11 % 128;
        if (i11 % 2 != 0) {
            int i12 = 44 / 0;
        }
    }

    private void c(byte[] bArr, int i10, int i11, int i12, Boolean bool) {
        synchronized (this.f40821v) {
            if (this.f40820u != c.ID_SCAN) {
                return;
            }
            int i13 = this.f40824y + 1;
            this.f40824y = i13;
            if (i13 < 4) {
                return;
            }
            ch.k(bArr, bool.booleanValue(), i10, i11, i12, false);
            this.m = ch.x();
            this.f40813n = (ce) ch.a(new Object[0], 2121926027, -2121926027, (int) System.currentTimeMillis());
            H();
        }
    }

    private static void c(String str, String str2) {
        JSONObject jSONObject = new JSONObject();
        try {
            try {
                jSONObject.put("metadata", new JSONObject(str2));
                int i10 = R + 121;
                P = i10 % 128;
                int i11 = i10 % 2;
            } catch (JSONException unused) {
                return;
            }
        } catch (JSONException unused2) {
            jSONObject.put("metadata", new JSONArray(str2));
        }
        ch.H(str, jSONObject.toString());
        int i12 = P + 49;
        R = i12 % 128;
        if (i12 % 2 == 0) {
            throw null;
        }
    }

    private static void c(@NonNull Context context) {
        e(new Object[]{context}, -1038929918, 1038929923, (int) System.currentTimeMillis());
    }
}

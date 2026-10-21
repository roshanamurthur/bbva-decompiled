package com.facetec.sdk;

import android.annotation.SuppressLint;
import android.content.ContentResolver;
import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Looper;
import android.os.Process;
import android.os.SystemClock;
import android.provider.Settings;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.bbva.tohu.android.product.valkyria.sdk.payments.paywave.Constants;
import com.google.firebase.dynamiclinks.DynamicLink;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.lang.reflect.Method;
import java.nio.charset.StandardCharsets;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes9.dex */
final class d {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10;
    private static int $11;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static byte[] f41097a;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static d f41098d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static a f41099e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static long f41100f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static int f41101g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static Object f41102h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static /* synthetic */ boolean f41103i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static char[] f41104j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static int f41105k;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private c f41106b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private ac f41107c;

    /* JADX INFO: renamed from: com.facetec.sdk.d$2, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass2 {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        static final /* synthetic */ int[] f41108c;

        static {
            int[] iArr = new int[c.b.values().length];
            f41108c = iArr;
            try {
                iArr[c.b.ID.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f41108c[c.b.APP_SEND_DIAGNOSTICS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f41108c[c.b.DIAGNOSTICS_SIZE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f41108c[c.b.CACHE_KEY.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f41108c[c.b.IS_VERSION_DEPRECATED.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f41108c[c.b.RECENT_FAILURES.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f41108c[c.b.APPLICATION_ID.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f41108c[c.b.IS_LATEST_VERSION.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    public enum a {
        Old,
        New
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        f41101g = 0;
        f41105k = 1;
        e();
        f41103i = true;
        f41097a = null;
        f41098d = null;
        f41099e = a.Old;
        f41102h = new Object();
        int i10 = f41101g + 85;
        f41105k = i10 % 128;
        int i11 = i10 % 2;
    }

    private d(Context context) throws Throwable {
        this.f41106b = new c();
        this.f41107c = new ac(context);
        try {
            byte[] bArrD = bf.d(context, i(context), h(context));
            JSONObject jSONObject = new JSONObject(new String(bArrD, 0, bArrD.length, StandardCharsets.UTF_8));
            Object[] objArr = new Object[1];
            l((char) (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), KeyEvent.keyCodeFromString(""), 8 - Color.green(0), objArr);
            String strOptString = jSONObject.optString(((String) objArr[0]).intern(), "");
            Object[] objArr2 = new Object[1];
            l((char) (ViewConfiguration.getTapTimeout() >> 16), 8 - (Process.myTid() >> 22), View.resolveSizeAndState(0, 0, 0) + 5, objArr2);
            JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject(((String) objArr2[0]).intern());
            if (!strOptString.isEmpty()) {
                this.f41106b = c.c(new JSONObject(strOptString));
            }
            if (jSONObjectOptJSONObject != null) {
                this.f41107c = ac.d(context, jSONObjectOptJSONObject.toString());
            }
        } catch (FileNotFoundException unused) {
        } catch (Exception e5) {
            k.c(e5);
        }
    }

    public static synchronized ac a(Context context) {
        ac acVar;
        int i10 = f41105k + 125;
        f41101g = i10 % 128;
        int i11 = i10 % 2;
        try {
            acVar = e(context).f41107c;
            int i12 = f41101g + 21;
            f41105k = i12 % 128;
            int i13 = i12 % 2;
        } catch (Exception unused) {
            return new ac(context);
        }
        return acVar;
    }

    public static /* synthetic */ Object b(Object[] objArr, int i10, int i11, int i12) {
        return c(objArr);
    }

    public static byte[] c(Context context) throws Exception {
        synchronized (f41102h) {
            try {
                if (f41097a == null) {
                    f41097a = f(context);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return bi.c(f41097a);
    }

    public static synchronized a d(Context context) {
        a aVar;
        try {
            int i10 = f41105k + 95;
            f41101g = i10 % 128;
            try {
                if (i10 % 2 != 0) {
                    f(context);
                    throw null;
                }
                f(context);
                aVar = f41099e;
                int i11 = f41105k + 75;
                f41101g = i11 % 128;
                if (i11 % 2 != 0) {
                    throw null;
                }
            } catch (Exception unused) {
            }
        } catch (Throwable th2) {
            throw th2;
        }
        throw th2;
        return aVar;
    }

    private static synchronized d e(Context context) {
        try {
            int i10 = f41101g + 103;
            f41105k = i10 % 128;
            int i11 = i10 % 2;
            if (f41098d == null) {
                f41098d = new d(context);
                int i12 = f41105k + 91;
                f41101g = i12 % 128;
                int i13 = i12 % 2;
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return f41098d;
    }

    private static byte[] f(Context context) throws Exception {
        ContentResolver contentResolver = context.getContentResolver();
        Object[] objArr = new Object[1];
        l((char) (64762 - View.MeasureSpec.getSize(0)), ExpandableListView.getPackedPositionChild(0L) + 36, 9 - TextUtils.lastIndexOf("", '0', 0), objArr);
        String string = Settings.Secure.getString(contentResolver, ((String) objArr[0]).intern());
        StringBuilder sb2 = new StringBuilder();
        sb2.append(context.getPackageName());
        sb2.append(string);
        Object[] objArr2 = new Object[1];
        l((char) (23376 - (ViewConfiguration.getMinimumFlingVelocity() >> 16)), 45 - Color.blue(0), Process.getGidForName("") + 11, objArr2);
        sb2.append(((String) objArr2[0]).intern());
        String strB = bi.b(sb2.toString());
        StringBuilder sb3 = new StringBuilder();
        sb3.append(context.getPackageName());
        sb3.append(string);
        Object[] objArr3 = new Object[1];
        l((char) ((ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 1), View.MeasureSpec.getMode(0) + 55, (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 4, objArr3);
        sb3.append(((String) objArr3[0]).intern());
        String strB2 = bi.b(sb3.toString());
        try {
            byte[] bArrB = bf.b(context, strB);
            if (bArrB.length > 0) {
                int i10 = f41105k + 37;
                f41101g = i10 % 128;
                try {
                    if (i10 % 2 != 0) {
                        f41099e = a.values()[bf.c(context, strB2)];
                        throw null;
                    }
                    f41099e = a.values()[bf.c(context, strB2)];
                    int i11 = f41101g + 31;
                    f41105k = i11 % 128;
                    int i12 = i11 % 2;
                    return bArrB;
                } catch (Exception unused) {
                }
            }
        } catch (FileNotFoundException unused2) {
        }
        byte[] bArrA = ay.a(32, 128);
        bf.b(context, strB, bArrA);
        a aVar = a.New;
        f41099e = aVar;
        byte bOrdinal = (byte) aVar.ordinal();
        FileOutputStream fileOutputStreamOpenFileOutput = context.openFileOutput(strB2, 0);
        fileOutputStreamOpenFileOutput.write(bOrdinal);
        fileOutputStreamOpenFileOutput.close();
        return bArrA;
    }

    private static byte[] h(Context context) throws Exception {
        int i10 = f41105k + 61;
        f41101g = i10 % 128;
        int i11 = i10 % 2;
        byte[] bArrC = c(context);
        Object[] objArr = new Object[1];
        l((char) (TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 1), (ViewConfiguration.getWindowTouchSlop() >> 8) + 72, Color.red(0) + 14, objArr);
        byte[] bArrC2 = bi.c(bArrC, ((String) objArr[0]).intern());
        int i12 = f41101g + 125;
        f41105k = i12 % 128;
        int i13 = i12 % 2;
        return bArrC2;
    }

    private static String i(Context context) throws Exception {
        int i10 = f41101g + 119;
        f41105k = i10 % 128;
        int i11 = i10 % 2;
        byte[] bArrC = c(context);
        Object[] objArr = new Object[1];
        l((char) (Process.myPid() >> 22), 59 - KeyEvent.getDeadChar(0, 0), 13 - TextUtils.getOffsetBefore("", 0), objArr);
        String strB = bi.b(bArrC, ((String) objArr[0]).intern());
        int i12 = f41101g + 39;
        f41105k = i12 % 128;
        if (i12 % 2 != 0) {
            return strB;
        }
        throw null;
    }

    public static void init$0() {
        $$a = new byte[]{Constants.CVR_B1b85_0101_MOBILE_APP, -61, -32, -31};
        $$b = 216;
    }

    /* JADX WARN: Code duplicated, block: B:38:0x01cf  */
    /* JADX WARN: Code duplicated, block: B:39:0x01d0  */
    private static void l(char c10, int i10, int i11, Object[] objArr) throws Throwable {
        Throwable cause;
        gt gtVar = new gt();
        long[] jArr = new long[i11];
        gtVar.f41826d = 0;
        while (true) {
            int i12 = gtVar.f41826d;
            if (i12 >= i11) {
                break;
            }
            int i13 = $10 + 113;
            $11 = i13 % 128;
            int i14 = i13 % 2;
            try {
                Object[] objArr2 = {Integer.valueOf(f41104j[i10 + i12])};
                Map map = bp.f40694x;
                Object method = map.get(-167668390);
                if (method == null) {
                    method = ((Class) bp.a(25 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), 245 - (Process.myPid() >> 22), (char) View.getDefaultSize(0, 0))).getMethod("d", Integer.TYPE);
                    map.put(-167668390, method);
                }
                Object[] objArr3 = {Long.valueOf(((Long) ((Method) method).invoke(null, objArr2)).longValue()), Long.valueOf(gtVar.f41826d), Long.valueOf(f41100f), Integer.valueOf(c10)};
                Object method2 = map.get(-1565725271);
                if (method2 == null) {
                    Class cls = (Class) bp.a(View.getDefaultSize(0, 0) + 24, 1671 - TextUtils.lastIndexOf("", '0', 0, 0), (char) (58391 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1))));
                    byte b10 = (byte) 0;
                    byte b11 = b10;
                    Object[] objArr4 = new Object[1];
                    m(b10, b11, (byte) (b11 - 1), objArr4);
                    String str = (String) objArr4[0];
                    Class<?> cls2 = Long.TYPE;
                    method2 = cls.getMethod(str, cls2, cls2, cls2, Integer.TYPE);
                    map.put(-1565725271, method2);
                }
                jArr[i12] = ((Long) ((Method) method2).invoke(null, objArr3)).longValue();
                Object[] objArr5 = {gtVar, gtVar};
                Object method3 = map.get(453950717);
                if (method3 == null) {
                    method3 = ((Class) bp.a(24 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), 269 - View.resolveSize(0, 0), (char) (KeyEvent.getDeadChar(0, 0) + 25686))).getMethod("b", Object.class, Object.class);
                    map.put(453950717, method3);
                }
                ((Method) method3).invoke(null, objArr5);
                int i15 = $11 + 79;
                $10 = i15 % 128;
                int i16 = i15 % 2;
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
            int i17 = gtVar.f41826d;
            if (i17 >= i11) {
                objArr[0] = new String(cArr);
                return;
            }
            cArr[i17] = (char) jArr[i17];
            Object[] objArr6 = {gtVar, gtVar};
            Map map2 = bp.f40694x;
            Object method4 = map2.get(453950717);
            if (method4 == null) {
                method4 = ((Class) bp.a(25 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), 270 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), (char) (25686 - Color.blue(0)))).getMethod("b", Object.class, Object.class);
                map2.put(453950717, method4);
            }
            ((Method) method4).invoke(null, objArr6);
        }
    }

    /* JADX WARN: Code duplicated, block: B:10:0x002d  */
    /* JADX WARN: Code duplicated, block: B:8:0x0025  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x002d -> B:11:0x0037). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x002d
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void m(int r7, int r8, int r9, java.lang.Object[] r10) {
        /*
            int r9 = r9 + 4
            byte[] r0 = com.facetec.sdk.d.$$a
            int r7 = r7 * 3
            int r7 = r7 + 1
            int r8 = r8 * 4
            int r8 = r8 + 99
            byte[] r1 = new byte[r7]
            r2 = 0
            if (r0 != 0) goto L18
            r8 = r7
            r3 = r1
            r5 = r2
            r1 = r0
            r0 = r10
            r10 = r9
            goto L37
        L18:
            r3 = r2
            r6 = r9
            r9 = r8
        L1b:
            r8 = r6
            byte r4 = (byte) r9
            int r8 = r8 + 1
            int r5 = r3 + 1
            r1[r3] = r4
            if (r5 != r7) goto L2d
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            r10[r2] = r7
            return
        L2d:
            r3 = r0[r8]
            r6 = r8
            r8 = r7
            r7 = r3
            r3 = r1
            r1 = r0
            r0 = r10
            r10 = r9
            r9 = r6
        L37:
            int r7 = r7 + r10
            r10 = r0
            r0 = r1
            r1 = r3
            r3 = r5
            r6 = r9
            r9 = r7
            r7 = r8
            goto L1b
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facetec.sdk.d.m(int, int, int, java.lang.Object[]):void");
    }

    private static synchronized c b() {
        c cVar;
        int i10 = f41105k + 41;
        int i11 = i10 % 128;
        f41101g = i11;
        int i12 = i10 % 2;
        d dVar = f41098d;
        if (dVar == null) {
            try {
                Object[] objArr = new Object[1];
                l((char) ((ViewConfiguration.getFadingEdgeLength() >> 16) + 49408), 13 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), 16 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), objArr);
                throw new RuntimeException(((String) objArr[0]).intern());
            } catch (Exception e5) {
                k.c(e5);
                return new c();
            }
        }
        cVar = dVar.f41106b;
        int i13 = i11 + 45;
        f41105k = i13 % 128;
        int i14 = i13 % 2;
        return cVar;
    }

    @SuppressLint({"StaticFieldLeak"})
    public static synchronized void a(Context context, c cVar) {
        try {
            int i10 = f41105k + 89;
            f41101g = i10 % 128;
            int i11 = i10 % 2;
            try {
                d dVarE = e(context);
                dVarE.f41106b = cVar;
                dVarE.b(context);
                int i12 = f41105k + 77;
                f41101g = i12 % 128;
                if (i12 % 2 != 0) {
                    throw null;
                }
            } catch (Exception e5) {
                k.c(e5);
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public static int d() {
        return ((Integer) b(new Object[0], 1657849494, -1657849494, (int) System.currentTimeMillis())).intValue();
    }

    public static synchronized void e(Context context, ac acVar) {
        int i10 = f41105k + 75;
        f41101g = i10 % 128;
        try {
            if (i10 % 2 == 0) {
                d dVarE = e(context);
                dVarE.f41107c = acVar;
                dVarE.b(context);
                int i11 = f41105k + 23;
                f41101g = i11 % 128;
                if (i11 % 2 != 0) {
                    int i12 = 70 / 0;
                    return;
                }
                return;
            }
            d dVarE2 = e(context);
            dVarE2.f41107c = acVar;
            dVarE2.b(context);
            throw null;
        } catch (Exception e5) {
            k.c(e5);
            return;
        }
        throw th;
    }

    private static /* synthetic */ Object c(Object[] objArr) {
        int i10 = f41105k + 109;
        f41101g = i10 % 128;
        if (i10 % 2 == 0) {
            return Integer.valueOf(b().f41115d.intValue());
        }
        b().f41115d.intValue();
        throw null;
    }

    private void b(Context context) throws Exception {
        int i10 = f41105k + 69;
        f41101g = i10 % 128;
        if (i10 % 2 != 0) {
            throw null;
        }
        if (!f41103i && Thread.currentThread().equals(Looper.getMainLooper().getThread())) {
            throw new AssertionError();
        }
        f41098d = this;
        JSONObject jSONObject = new JSONObject();
        String strC = this.f41106b.c();
        Object[] objArr = new Object[1];
        l((char) ((ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) - 1), TextUtils.getTrimmedLength(""), (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 8, objArr);
        jSONObject.put(((String) objArr[0]).intern(), strC);
        Object[] objArr2 = new Object[1];
        l((char) Drawable.resolveOpacity(0, 0), 8 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), (KeyEvent.getMaxKeyCode() >> 16) + 5, objArr2);
        jSONObject.put(((String) objArr2[0]).intern(), this.f41107c.a());
        Object[] objArr3 = new Object[1];
        l((char) (ExpandableListView.getPackedPositionChild(0L) + 12560), (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 29, MotionEvent.axisFromString("") + 7, objArr3);
        jSONObject.put(((String) objArr3[0]).intern(), ay.e(16, 32));
        bf.d(context, i(context), h(context), jSONObject.toString().getBytes(StandardCharsets.UTF_8));
        int i11 = f41105k + 123;
        f41101g = i11 % 128;
        int i12 = i11 % 2;
    }

    public static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        String f41112a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Boolean f41113b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        Boolean f41114c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Integer f41115d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        String f41116e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Integer f41117g;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        Integer f41118i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private Boolean f41119j;

        public enum b {
            ID("id"),
            APP_SEND_DIAGNOSTICS(DynamicLink.SocialMetaTagParameters.KEY_SOCIAL_DESCRIPTION),
            DIAGNOSTICS_SIZE("ds"),
            CACHE_KEY("ck"),
            IS_VERSION_DEPRECATED("vd"),
            RECENT_FAILURES("rf"),
            APPLICATION_ID("ai"),
            IS_LATEST_VERSION("lv");


            /* JADX INFO: renamed from: i, reason: collision with root package name */
            final String f41129i;

            b(String str) {
                this.f41129i = str;
            }
        }

        public c() {
            Boolean bool = Boolean.FALSE;
            this.f41113b = bool;
            this.f41115d = 10;
            this.f41114c = bool;
            this.f41119j = Boolean.TRUE;
        }

        public static c c(JSONObject jSONObject) throws JSONException {
            c cVar = new c();
            for (b bVar : b.values()) {
                switch (AnonymousClass2.f41108c[bVar.ordinal()]) {
                    case 1:
                        cVar.f41116e = jSONObject.getString(bVar.f41129i);
                        break;
                    case 2:
                        cVar.f41113b = Boolean.valueOf(jSONObject.getBoolean(bVar.f41129i));
                        break;
                    case 3:
                        cVar.f41115d = Integer.valueOf(jSONObject.getInt(bVar.f41129i));
                        break;
                    case 4:
                        cVar.f41112a = jSONObject.getString(bVar.f41129i);
                        break;
                    case 5:
                        cVar.f41114c = Boolean.valueOf(jSONObject.getBoolean(bVar.f41129i));
                        break;
                    case 6:
                        cVar.f41117g = Integer.valueOf(jSONObject.getInt(bVar.f41129i));
                        break;
                    case 7:
                        cVar.f41118i = Integer.valueOf(jSONObject.getInt(bVar.f41129i));
                        break;
                    case 8:
                        cVar.f41119j = Boolean.valueOf(jSONObject.getBoolean(bVar.f41129i));
                        break;
                }
            }
            return cVar;
        }

        public final String c() {
            JSONObject jSONObject = new JSONObject();
            try {
                for (b bVar : b.values()) {
                    switch (AnonymousClass2.f41108c[bVar.ordinal()]) {
                        case 1:
                            jSONObject.put(bVar.f41129i, this.f41116e);
                            break;
                        case 2:
                            jSONObject.put(bVar.f41129i, this.f41113b);
                            break;
                        case 3:
                            jSONObject.put(bVar.f41129i, this.f41115d);
                            break;
                        case 4:
                            jSONObject.put(bVar.f41129i, this.f41112a);
                            break;
                        case 5:
                            jSONObject.put(bVar.f41129i, this.f41114c);
                            break;
                        case 6:
                            jSONObject.put(bVar.f41129i, this.f41117g);
                            break;
                        case 7:
                            jSONObject.put(bVar.f41129i, this.f41118i);
                            break;
                        case 8:
                            jSONObject.put(bVar.f41129i, this.f41119j);
                            break;
                    }
                }
            } catch (JSONException e5) {
                e5.printStackTrace();
            }
            return jSONObject.toString();
        }
    }

    public static boolean a() {
        int i10 = f41101g + 29;
        f41105k = i10 % 128;
        int i11 = i10 % 2;
        boolean zBooleanValue = b().f41113b.booleanValue();
        int i12 = f41101g + 113;
        f41105k = i12 % 128;
        if (i12 % 2 != 0) {
            return zBooleanValue;
        }
        throw null;
    }

    public static void e() {
        f41104j = new char[]{32926, 33454, 34005, 34539, 34844, 35389, 35950, 36756, 32926, 33453, 34005, 34553, 34833, 16830, 17326, 17877, 18411, 18716, 19261, 19822, 20116, 20733, 21206, 21752, 22076, 22614, 23146, 24471, 25008, 45456, 45989, 46528, 47092, 47381, 47921, 31862, 32351, 30783, 31255, 29920, 30400, 28823, 29506, 27982, 28453, 56284, 55787, 57217, 56720, 54101, 53611, 55083, 54486, 51966, 51342, 32900, 33442, 33989, 34537, 32951, 33444, 33998, 34546, 34868, 35363, 35961, 36771, 37308, 37839, 38384, 38681, 39191, 32951, 33444, 33998, 34546, 34868, 35363, 35961, 36771, 37308, 37839, 38384, 38660, 39232, 39802};
        f41100f = -964928861943004469L;
    }
}

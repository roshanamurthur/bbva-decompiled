package com.facetec.sdk;

import android.graphics.Color;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.facetec.sdk.r, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
final class C0579r {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10;
    private static int $11;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static char[] f42784o;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static int f42785q;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static long f42786s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static int f42787t;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    w f42793f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    w f42795h;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    w f42797j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private w f42798k;
    private w m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private q f42800n;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    List<z> f42791d = new ArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    List<String> f42790c = new ArrayList();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    List<List<Integer>> f42788a = new ArrayList();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private List<List<z>> f42794g = new ArrayList();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private List<List<z>> f42799l = new ArrayList();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    List<List<List<z>>> f42792e = new ArrayList();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    List<List<List<z>>> f42789b = new ArrayList();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    List<List<List<z>>> f42796i = new ArrayList();

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        f42787t = 0;
        f42785q = 1;
        f42784o = new char[]{46606, 46846, 46791, 46688, 46647, 46652, 46696, 46650, 46652, 46654, 46652, 46703, 46632, 46646, 46652, 46608, 46807, 46971, 46969, 46927, 46755, 46689, 46636, 46634, 46640, 46615, 46699, 46655, 46643, 46641, 46652, 46703, 46615, 46615, 46632, 46644, 46632, 46810, 46624, 46617, 46624};
        f42786s = 6876770272904907333L;
    }

    public C0579r() {
        w wVar = w.NOT_RAN;
        this.m = wVar;
        this.f42798k = wVar;
        this.f42793f = wVar;
        this.f42797j = wVar;
        this.f42795h = wVar;
        this.f42800n = new q();
    }

    public static void init$0() {
        $$a = new byte[]{82, -85, -97, 13};
        $$b = 20;
    }

    /* JADX WARN: Code duplicated, block: B:30:0x00f5  */
    /* JADX WARN: Code duplicated, block: B:36:0x011e  */
    /* JADX WARN: Code duplicated, block: B:37:0x0121 A[Catch: all -> 0x00c7, TryCatch #0 {all -> 0x00c7, blocks: (B:10:0x0036, B:14:0x00a0, B:13:0x0054, B:34:0x0100, B:38:0x016b, B:48:0x01fc, B:52:0x0258, B:51:0x0214, B:37:0x0121, B:41:0x017f, B:45:0x01e8, B:44:0x019f), top: B:83:0x0036 }] */
    /* JADX WARN: Code duplicated, block: B:43:0x019e  */
    /* JADX WARN: Code duplicated, block: B:44:0x019f A[Catch: all -> 0x00c7, TryCatch #0 {all -> 0x00c7, blocks: (B:10:0x0036, B:14:0x00a0, B:13:0x0054, B:34:0x0100, B:38:0x016b, B:48:0x01fc, B:52:0x0258, B:51:0x0214, B:37:0x0121, B:41:0x017f, B:45:0x01e8, B:44:0x019f), top: B:83:0x0036 }] */
    private static void p(String str, int[] iArr, boolean z10, Object[] objArr) throws Throwable {
        int i10;
        int i11;
        char c10;
        Map map;
        Object method;
        Map map2;
        Object method2;
        String str2 = str;
        int i12 = $11 + 69;
        $10 = i12 % 128;
        int i13 = i12 % 2;
        Object bytes = str2;
        if (str2 != null) {
            bytes = str2.getBytes("ISO-8859-1");
        }
        byte[] bArr = (byte[]) bytes;
        hb hbVar = new hb();
        char c11 = 0;
        int i14 = iArr[0];
        int i15 = 1;
        int i16 = iArr[1];
        int i17 = iArr[2];
        int i18 = iArr[3];
        char[] cArr = f42784o;
        long j10 = 0;
        if (cArr != null) {
            int length = cArr.length;
            char[] cArr2 = new char[length];
            int i19 = 0;
            while (i19 < length) {
                try {
                    Object[] objArr2 = new Object[i15];
                    objArr2[c11] = Integer.valueOf(cArr[i19]);
                    Map map3 = bp.f40694x;
                    Object method3 = map3.get(834839604);
                    if (method3 == null) {
                        Class cls = (Class) bp.a(24 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), (ViewConfiguration.getZoomControlsTimeout() > j10 ? 1 : (ViewConfiguration.getZoomControlsTimeout() == j10 ? 0 : -1)) + 764, (char) ((ViewConfiguration.getZoomControlsTimeout() > j10 ? 1 : (ViewConfiguration.getZoomControlsTimeout() == j10 ? 0 : -1)) + 36772));
                        byte b10 = (byte) 0;
                        byte b11 = (byte) (b10 - 1);
                        Object[] objArr3 = new Object[1];
                        u(b10, b11, (byte) (b11 & 8), objArr3);
                        method3 = cls.getMethod((String) objArr3[0], Integer.TYPE);
                        map3.put(834839604, method3);
                    }
                    cArr2[i19] = ((Character) ((Method) method3).invoke(null, objArr2)).charValue();
                    i19++;
                    int i20 = $11 + 53;
                    $10 = i20 % 128;
                    int i21 = i20 % 2;
                    length = length;
                    i17 = i17;
                    cArr = cArr;
                    c11 = 0;
                    i15 = 1;
                    j10 = 0;
                } catch (Throwable th2) {
                    Throwable cause = th2.getCause();
                    if (cause == null) {
                        throw th2;
                    }
                    throw cause;
                }
            }
            i10 = i17;
            cArr = cArr2;
        } else {
            i10 = i17;
        }
        char[] cArr3 = new char[i16];
        System.arraycopy(cArr, i14, cArr3, 0, i16);
        if (bArr != null) {
            char[] cArr4 = new char[i16];
            hbVar.f41865e = 0;
            char c12 = 0;
            while (true) {
                int i22 = hbVar.f41865e;
                if (i22 >= i16) {
                    break;
                }
                int i23 = $11 + 29;
                $10 = i23 % 128;
                if (i23 % 2 == 0) {
                    c10 = 1;
                    if (bArr[i22] == 1) {
                        char c13 = cArr3[i22];
                        Object[] objArr4 = new Object[2];
                        objArr4[c10] = Integer.valueOf(c12);
                        objArr4[0] = Integer.valueOf(c13);
                        map2 = bp.f40694x;
                        method2 = map2.get(427996090);
                        if (method2 != null) {
                            Class cls2 = (Class) bp.a(Gravity.getAbsoluteGravity(0, 0) + 23, 1025 - View.getDefaultSize(0, 0), (char) ((SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 38452));
                            byte b12 = (byte) 0;
                            byte b13 = (byte) (b12 - 1);
                            Object[] objArr5 = new Object[1];
                            u(b12, b13, (byte) (b13 & 7), objArr5);
                            String str3 = (String) objArr5[0];
                            Class<?> cls3 = Integer.TYPE;
                            method2 = cls2.getMethod(str3, cls3, cls3);
                            map2.put(427996090, method2);
                        }
                        cArr4[i22] = ((Character) ((Method) method2).invoke(null, objArr4)).charValue();
                    } else {
                        Object[] objArr6 = {Integer.valueOf(cArr3[i22]), Integer.valueOf(c12)};
                        map = bp.f40694x;
                        method = map.get(-236045356);
                        if (method != null) {
                            Class cls4 = (Class) bp.a(24 - Color.blue(0), TextUtils.lastIndexOf("", '0', 0, 0) + 412, (char) ((Process.getThreadPriority(0) + 20) >> 6));
                            byte b14 = (byte) 0;
                            byte b15 = (byte) (b14 - 1);
                            Object[] objArr7 = new Object[1];
                            u(b14, b15, (byte) (b15 & 5), objArr7);
                            String str4 = (String) objArr7[0];
                            Class<?> cls5 = Integer.TYPE;
                            method = cls4.getMethod(str4, cls5, cls5);
                            map.put(-236045356, method);
                        }
                        cArr4[i22] = ((Character) ((Method) method).invoke(null, objArr6)).charValue();
                    }
                } else if (bArr[i22] == 0) {
                    c10 = 1;
                    char c14 = cArr3[i22];
                    Object[] objArr8 = new Object[2];
                    objArr8[c10] = Integer.valueOf(c12);
                    objArr8[0] = Integer.valueOf(c14);
                    map2 = bp.f40694x;
                    method2 = map2.get(427996090);
                    if (method2 != null) {
                        Class cls6 = (Class) bp.a(Gravity.getAbsoluteGravity(0, 0) + 23, 1025 - View.getDefaultSize(0, 0), (char) ((SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 38452));
                        byte b16 = (byte) 0;
                        byte b17 = (byte) (b16 - 1);
                        Object[] objArr9 = new Object[1];
                        u(b16, b17, (byte) (b17 & 7), objArr9);
                        String str5 = (String) objArr9[0];
                        Class<?> cls7 = Integer.TYPE;
                        method2 = cls6.getMethod(str5, cls7, cls7);
                        map2.put(427996090, method2);
                    }
                    cArr4[i22] = ((Character) ((Method) method2).invoke(null, objArr8)).charValue();
                } else {
                    Object[] objArr10 = {Integer.valueOf(cArr3[i22]), Integer.valueOf(c12)};
                    map = bp.f40694x;
                    method = map.get(-236045356);
                    if (method != null) {
                        Class cls8 = (Class) bp.a(24 - Color.blue(0), TextUtils.lastIndexOf("", '0', 0, 0) + 412, (char) ((Process.getThreadPriority(0) + 20) >> 6));
                        byte b18 = (byte) 0;
                        byte b19 = (byte) (b18 - 1);
                        Object[] objArr11 = new Object[1];
                        u(b18, b19, (byte) (b19 & 5), objArr11);
                        String str6 = (String) objArr11[0];
                        Class<?> cls9 = Integer.TYPE;
                        method = cls8.getMethod(str6, cls9, cls9);
                        map.put(-236045356, method);
                    }
                    cArr4[i22] = ((Character) ((Method) method).invoke(null, objArr10)).charValue();
                }
                c12 = cArr4[hbVar.f41865e];
                Object[] objArr12 = {hbVar, hbVar};
                Map map4 = bp.f40694x;
                Object method4 = map4.get(540243420);
                if (method4 == null) {
                    Class cls10 = (Class) bp.a(24 - View.MeasureSpec.getSize(0), (ViewConfiguration.getDoubleTapTimeout() >> 16) + 411, (char) View.MeasureSpec.getMode(0));
                    byte b20 = (byte) 0;
                    Object[] objArr13 = new Object[1];
                    u(b20, (byte) (b20 - 1), $$a[3], objArr13);
                    method4 = cls10.getMethod((String) objArr13[0], Object.class, Object.class);
                    map4.put(540243420, method4);
                }
                ((Method) method4).invoke(null, objArr12);
            }
            cArr3 = cArr4;
        }
        if (i18 > 0) {
            int i24 = $10 + 93;
            $11 = i24 % 128;
            int i25 = i24 % 2;
            char[] cArr5 = new char[i16];
            i11 = 0;
            System.arraycopy(cArr3, 0, cArr5, 0, i16);
            int i26 = i16 - i18;
            System.arraycopy(cArr5, 0, cArr3, i26, i18);
            System.arraycopy(cArr5, i18, cArr3, 0, i26);
        } else {
            i11 = 0;
        }
        if (z10) {
            char[] cArr6 = new char[i16];
            while (true) {
                hbVar.f41865e = i11;
                int i27 = hbVar.f41865e;
                if (i27 >= i16) {
                    break;
                }
                cArr6[i27] = cArr3[(i16 - i27) - 1];
                i11 = i27 + 1;
            }
            cArr3 = cArr6;
        }
        if (i10 > 0) {
            int i28 = $11 + 43;
            $10 = i28 % 128;
            char c15 = 2;
            hbVar.f41865e = i28 % 2 != 0 ? 1 : 0;
            while (true) {
                int i29 = hbVar.f41865e;
                if (i29 >= i16) {
                    break;
                }
                cArr3[i29] = (char) (cArr3[i29] - iArr[c15]);
                hbVar.f41865e = i29 + 1;
                c15 = 2;
            }
        }
        String str7 = new String(cArr3);
        int i30 = $11 + 109;
        $10 = i30 % 128;
        if (i30 % 2 != 0) {
            throw null;
        }
        objArr[0] = str7;
    }

    private static void r(String str, int i10, Object[] objArr) throws Throwable {
        int i11 = $10 + 41;
        $11 = i11 % 128;
        if (i11 % 2 == 0) {
            throw null;
        }
        char[] charArray = str != null ? str.toCharArray() : str;
        ha haVar = new ha();
        char[] cArrB = ha.b(f42786s ^ (-7412675099708671612L), charArray, i10);
        haVar.f41863b = 4;
        while (true) {
            int i12 = haVar.f41863b;
            if (i12 >= cArrB.length) {
                String str2 = new String(cArrB, 4, cArrB.length - 4);
                int i13 = $10 + 1;
                $11 = i13 % 128;
                int i14 = i13 % 2;
                objArr[0] = str2;
                return;
            }
            int i15 = i12 - 4;
            haVar.f41864c = i15;
            try {
                Object[] objArr2 = {Long.valueOf(cArrB[i12] ^ cArrB[i12 % 4]), Long.valueOf(i15), Long.valueOf(f42786s)};
                Map map = bp.f40694x;
                Object method = map.get(1967282843);
                if (method == null) {
                    Class cls = (Class) bp.a((ViewConfiguration.getScrollDefaultDelay() >> 16) + 24, 765 - Color.green(0), (char) (36773 - (ViewConfiguration.getMinimumFlingVelocity() >> 16)));
                    byte b10 = (byte) 0;
                    byte b11 = (byte) (b10 - 1);
                    Object[] objArr3 = new Object[1];
                    u(b10, b11, (byte) (b11 + 1), objArr3);
                    String str3 = (String) objArr3[0];
                    Class<?> cls2 = Long.TYPE;
                    method = cls.getMethod(str3, cls2, cls2, cls2);
                    map.put(1967282843, method);
                }
                cArrB[i12] = ((Character) ((Method) method).invoke(null, objArr2)).charValue();
                Object[] objArr4 = {haVar, haVar};
                Object method2 = map.get(1724890883);
                if (method2 == null) {
                    method2 = ((Class) bp.a((-16777192) - Color.rgb(0, 0, 0), 268 - TextUtils.indexOf((CharSequence) "", '0'), (char) (25686 - (Process.myTid() >> 22)))).getMethod("h", Object.class, Object.class);
                    map.put(1724890883, method2);
                }
                ((Method) method2).invoke(null, objArr4);
            } catch (Throwable th2) {
                Throwable cause = th2.getCause();
                if (cause == null) {
                    throw th2;
                }
                throw cause;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0029  */
    /* JADX WARN: Code duplicated, block: B:8:0x0021  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0029 -> B:11:0x0035). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0029
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void u(short r6, int r7, int r8, java.lang.Object[] r9) {
        /*
            int r8 = r8 + 102
            int r6 = r6 * 4
            int r0 = 1 - r6
            int r7 = r7 + 4
            byte[] r1 = com.facetec.sdk.C0579r.$$a
            byte[] r0 = new byte[r0]
            r2 = 0
            int r6 = 0 - r6
            if (r1 != 0) goto L19
            r8 = r7
            r3 = r1
            r4 = r2
            r7 = r6
            r1 = r0
            r0 = r9
            r9 = r8
            goto L35
        L19:
            r3 = r2
        L1a:
            int r7 = r7 + 1
            byte r4 = (byte) r8
            r0[r3] = r4
            if (r3 != r6) goto L29
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            r9[r2] = r6
            return
        L29:
            int r3 = r3 + 1
            r4 = r1[r7]
            r5 = r7
            r7 = r6
            r6 = r4
            r4 = r3
            r3 = r1
            r1 = r0
            r0 = r9
            r9 = r5
        L35:
            int r6 = -r6
            int r8 = r8 + r6
            r6 = r7
            r7 = r9
            r9 = r0
            r0 = r1
            r1 = r3
            r3 = r4
            goto L1a
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facetec.sdk.C0579r.u(short, int, int, java.lang.Object[]):void");
    }

    public final JSONObject a() {
        List<z> list = this.f42791d;
        JSONArray jSONArray = new JSONArray();
        int i10 = 0;
        while (i10 < list.size()) {
            int i11 = f42787t + 51;
            f42785q = i11 % 128;
            if (i11 % 2 == 0) {
                jSONArray.put(list.get(i10).c());
                i10 += 119;
            } else {
                jSONArray.put(list.get(i10).c());
                i10++;
            }
        }
        JSONArray jSONArrayE = aa.e(this.f42794g);
        JSONArray jSONArrayE2 = aa.e(this.f42799l);
        JSONArray jSONArrayC = aa.c(this.f42792e);
        JSONArray jSONArrayC2 = aa.c(this.f42789b);
        JSONArray jSONArrayC3 = aa.c(this.f42796i);
        JSONObject jSONObject = new JSONObject();
        try {
            Object[] objArr = new Object[1];
            p("\u0000\u0000\u0001", new int[]{0, 3, 60, 3}, false, objArr);
            jSONObject.put(((String) objArr[0]).intern(), jSONArray.toString());
            Object[] objArr2 = new Object[1];
            p("\u0001\u0000\u0000", new int[]{3, 3, 0, 0}, false, objArr2);
            jSONObject.put(((String) objArr2[0]).intern(), this.f42790c.toString());
            Object[] objArr3 = new Object[1];
            r("\uefcb\uefa3ㄎ芮爀⺜", 1 - View.MeasureSpec.makeMeasureSpec(0, 0), objArr3);
            jSONObject.put(((String) objArr3[0]).intern(), this.f42788a.toString());
            Object[] objArr4 = new Object[1];
            r("쑂쐫폢몁\ued85ଧ恇\udd65\uf6af", (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 1, objArr4);
            jSONObject.put(((String) objArr4[0]).intern(), jSONArrayE.toString());
            Object[] objArr5 = new Object[1];
            p("\u0001\u0001\u0000\u0001\u0000", new int[]{6, 5, 0, 5}, false, objArr5);
            jSONObject.put(((String) objArr5[0]).intern(), jSONArrayE2.toString());
            Object[] objArr6 = new Object[1];
            p("\u0000\u0000\u0001\u0000\u0000", new int[]{11, 5, 0, 0}, false, objArr6);
            jSONObject.put(((String) objArr6[0]).intern(), jSONArrayC.toString());
            Object[] objArr7 = new Object[1];
            p("\u0001\u0000\u0001\u0000\u0001", new int[]{16, 5, 177, 0}, false, objArr7);
            jSONObject.put(((String) objArr7[0]).intern(), jSONArrayC2.toString());
            Object[] objArr8 = new Object[1];
            p("\u0000\u0000\u0001\u0000\u0000", new int[]{21, 5, 4, 0}, false, objArr8);
            jSONObject.put(((String) objArr8[0]).intern(), jSONArrayC3.toString());
            Object[] objArr9 = new Object[1];
            p("\u0000\u0001\u0001\u0000\u0000", new int[]{26, 5, 0, 2}, true, objArr9);
            jSONObject.put(((String) objArr9[0]).intern(), String.valueOf(this.m.f42933d));
            Object[] objArr10 = new Object[1];
            r("\udb2b\udb48⽘采\uf328ᑃ鳽\uf623\ue80f", -((byte) KeyEvent.getModifierMetaStateMask()), objArr10);
            jSONObject.put(((String) objArr10[0]).intern(), String.valueOf(this.f42798k.f42933d));
            Object[] objArr11 = new Object[1];
            p("\u0000\u0001\u0001\u0000\u0000", new int[]{31, 5, 0, 2}, false, objArr11);
            jSONObject.put(((String) objArr11[0]).intern(), String.valueOf(this.f42793f.f42933d));
            Object[] objArr12 = new Object[1];
            r("렢롎ꐻ퀆Ჷ眔ឌ럠ޘ", -MotionEvent.axisFromString(""), objArr12);
            jSONObject.put(((String) objArr12[0]).intern(), String.valueOf(this.f42797j.f42933d));
            Object[] objArr13 = new Object[1];
            p(null, new int[]{36, 5, 13, 3}, true, objArr13);
            jSONObject.put(((String) objArr13[0]).intern(), String.valueOf(this.f42795h.f42933d));
            Object[] objArr14 = new Object[1];
            r("\u0b49ଯᣤ턐̹쐩\uab17뛴\u181b", (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), objArr14);
            jSONObject.put(((String) objArr14[0]).intern(), new JSONObject().toString());
            int i12 = f42787t + 91;
            f42785q = i12 % 128;
            int i13 = i12 % 2;
        } catch (JSONException unused) {
        }
        return jSONObject;
    }
}

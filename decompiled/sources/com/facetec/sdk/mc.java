package com.facetec.sdk;

import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.core.view.ViewCompat;
import androidx.exifinterface.media.ExifInterface;
import androidx.webkit.ProxyConfig;
import com.bbva.component.dm.headers.EtagInterceptor;
import com.bbva.tohu.android.core.response.Result;
import com.bbva.tohu.android.core.response.backend.aso.AsoResponse;
import com.google.firebase.dynamiclinks.DynamicLink;
import com.vasco.digipass.sdk.utils.utilities.UtilitiesSDKConstants;
import java.io.IOException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes9.dex */
final class mc {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    static final Map<nj, Integer> f42435c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    static final mg[] f42436e;

    public static final class a {
        private static final byte[] $$a = null;
        private static final int $$b = 0;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private static long f42437f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private static int f42438g;
        private static char m;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final List<mg> f42439a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final nh f42440b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f42441c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private mg[] f42442d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final int f42443e;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private int f42444h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private int f42445i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private int f42446j;

        static {
            init$0();
            f42437f = 2572478164056071692L;
            f42438g = -2051027445;
            m = (char) 52747;
        }

        public a(nz nzVar, byte b10) {
            this(nzVar);
        }

        private nj a(int i10) throws IOException {
            if (c(i10)) {
                return mc.f42436e[i10].f42550j;
            }
            int iD = d(i10 - mc.f42436e.length);
            if (iD >= 0) {
                mg[] mgVarArr = this.f42442d;
                if (iD < mgVarArr.length) {
                    return mgVarArr[iD].f42550j;
                }
            }
            StringBuilder sb2 = new StringBuilder("Header index too large ");
            sb2.append(i10 + 1);
            throw new IOException(sb2.toString());
        }

        private nj b() throws IOException {
            int iA = a();
            boolean z10 = (iA & 128) == 128;
            int iD = d(iA, 127);
            return z10 ? nj.e(mj.b().c(this.f42440b.h(iD))) : this.f42440b.a(iD);
        }

        private void e() {
            Arrays.fill(this.f42442d, (Object) null);
            this.f42445i = this.f42442d.length - 1;
            this.f42444h = 0;
            this.f42446j = 0;
        }

        public static void init$0() {
            $$a = new byte[]{41, UtilitiesSDKConstants.SRP_LABEL_MAC, -97, -39};
            $$b = 249;
        }

        private static void k(String str, int i10, char c10, String str2, String str3, Object[] objArr) throws Throwable {
            char c11;
            char[] charArray = str3 != null ? str3.toCharArray() : str3;
            char[] charArray2 = str2 != null ? str2.toCharArray() : str2;
            char[] charArray3 = str != null ? str.toCharArray() : str;
            go goVar = new go();
            int length = charArray3.length;
            char[] cArr = new char[length];
            int length2 = charArray.length;
            char[] cArr2 = new char[length2];
            int i11 = 0;
            System.arraycopy(charArray3, 0, cArr, 0, length);
            System.arraycopy(charArray, 0, cArr2, 0, length2);
            cArr[0] = (char) (cArr[0] ^ c10);
            cArr2[2] = (char) (cArr2[2] + ((char) i10));
            int length3 = charArray2.length;
            char[] cArr3 = new char[length3];
            goVar.f41794c = 0;
            while (goVar.f41794c < length3) {
                try {
                    Object[] objArr2 = new Object[1];
                    objArr2[i11] = goVar;
                    Map map = bp.f40694x;
                    Object method = map.get(26369957);
                    if (method == null) {
                        Class cls = (Class) bp.a(23 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), (ExpandableListView.getPackedPositionForChild(i11, i11) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(i11, i11) == 0L ? 0 : -1)) + 720, (char) Color.blue(i11));
                        byte b10 = (byte) i11;
                        Object[] objArr3 = new Object[1];
                        l(b10, (byte) (b10 | 52), b10, objArr3);
                        String str4 = (String) objArr3[i11];
                        Class<?>[] clsArr = new Class[1];
                        clsArr[i11] = Object.class;
                        method = cls.getMethod(str4, clsArr);
                        map.put(26369957, method);
                    }
                    int iIntValue = ((Integer) ((Method) method).invoke(null, objArr2)).intValue();
                    Object[] objArr4 = new Object[1];
                    objArr4[i11] = goVar;
                    Object method2 = map.get(-1014658957);
                    if (method2 == null) {
                        Class cls2 = (Class) bp.a((PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 24, (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 196, (char) Color.alpha(i11));
                        Class<?>[] clsArr2 = new Class[1];
                        clsArr2[i11] = Object.class;
                        method2 = cls2.getMethod(ExifInterface.GPS_MEASUREMENT_IN_PROGRESS, clsArr2);
                        map.put(-1014658957, method2);
                    }
                    int iIntValue2 = ((Integer) ((Method) method2).invoke(null, objArr4)).intValue();
                    int i12 = cArr[goVar.f41794c % 4] * 32718;
                    Object[] objArr5 = new Object[3];
                    objArr5[2] = Integer.valueOf(cArr2[iIntValue]);
                    objArr5[1] = Integer.valueOf(i12);
                    objArr5[i11] = goVar;
                    Object method3 = map.get(918635547);
                    if (method3 == null) {
                        Class cls3 = (Class) bp.a(24 - (ViewConfiguration.getTapTimeout() >> 16), TextUtils.getOffsetBefore("", i11) + 1316, (char) (Gravity.getAbsoluteGravity(i11, i11) + 41876));
                        byte b11 = (byte) i11;
                        Object[] objArr6 = new Object[1];
                        l(b11, (byte) (b11 | 55), b11, objArr6);
                        String str5 = (String) objArr6[0];
                        Class<?> cls4 = Integer.TYPE;
                        method3 = cls3.getMethod(str5, Object.class, cls4, cls4);
                        map.put(918635547, method3);
                    }
                    ((Method) method3).invoke(null, objArr5);
                    Object[] objArr7 = {Integer.valueOf(cArr[iIntValue2] * 32718), Integer.valueOf(cArr2[iIntValue])};
                    Object method4 = map.get(-1899743495);
                    if (method4 != null) {
                        c11 = 2;
                    } else {
                        Class cls5 = (Class) bp.a(View.MeasureSpec.makeMeasureSpec(0, 0) + 24, MotionEvent.axisFromString("") + 838, (char) (ViewConfiguration.getKeyRepeatDelay() >> 16));
                        byte b12 = (byte) 0;
                        byte b13 = b12;
                        Object[] objArr8 = new Object[1];
                        l(b12, b13, b13, objArr8);
                        String str6 = (String) objArr8[0];
                        c11 = 2;
                        Class<?> cls6 = Integer.TYPE;
                        method4 = cls5.getMethod(str6, cls6, cls6);
                        map.put(-1899743495, method4);
                    }
                    cArr2[iIntValue2] = ((Character) ((Method) method4).invoke(null, objArr7)).charValue();
                    char c12 = goVar.f41793b;
                    cArr[iIntValue2] = c12;
                    int i13 = goVar.f41794c;
                    cArr3[i13] = (char) (((((long) (c12 ^ charArray2[i13])) ^ (f42437f ^ 5402764725387775499L)) ^ ((long) ((int) (((long) f42438g) ^ 5402764725387775499L)))) ^ ((long) ((char) (((long) m) ^ 5402764725387775499L))));
                    goVar.f41794c = i13 + 1;
                    length3 = length3;
                    i11 = 0;
                } catch (Throwable th2) {
                    Throwable cause = th2.getCause();
                    if (cause == null) {
                        throw th2;
                    }
                    throw cause;
                }
            }
            objArr[0] = new String(cArr3);
        }

        /* JADX WARN: Code duplicated, block: B:10:0x0023  */
        /* JADX WARN: Code duplicated, block: B:8:0x001b  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:11:0x002a). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0023
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        private static void l(short r6, byte r7, byte r8, java.lang.Object[] r9) {
            /*
                int r7 = r7 + 67
                int r6 = r6 * 2
                int r0 = r6 + 1
                byte[] r1 = com.facetec.sdk.mc.a.$$a
                int r8 = r8 * 4
                int r8 = 4 - r8
                byte[] r0 = new byte[r0]
                r2 = 0
                if (r1 != 0) goto L15
                r7 = r6
                r4 = r8
                r3 = r2
                goto L2a
            L15:
                r3 = r2
            L16:
                byte r4 = (byte) r7
                r0[r3] = r4
                if (r3 != r6) goto L23
                java.lang.String r6 = new java.lang.String
                r6.<init>(r0, r2)
                r9[r2] = r6
                return
            L23:
                int r3 = r3 + 1
                r4 = r1[r8]
                r5 = r7
                r7 = r6
                r6 = r5
            L2a:
                int r8 = r8 + 1
                int r4 = -r4
                int r6 = r6 + r4
                r5 = r7
                r7 = r6
                r6 = r5
                goto L16
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facetec.sdk.mc.a.l(short, byte, byte, java.lang.Object[]):void");
        }

        public final void c() throws Throwable {
            while (!this.f42440b.c()) {
                byte bF = this.f42440b.f();
                int i10 = bF & 255;
                if (i10 == 128) {
                    throw new IOException("index == 0");
                }
                if ((bF & 128) == 128) {
                    int iD = d(i10, 127);
                    int i11 = iD - 1;
                    if (!c(i11)) {
                        int iD2 = d(i11 - mc.f42436e.length);
                        if (iD2 >= 0) {
                            mg[] mgVarArr = this.f42442d;
                            if (iD2 < mgVarArr.length) {
                                this.f42439a.add(mgVarArr[iD2]);
                            }
                        }
                        StringBuilder sb2 = new StringBuilder("Header index too large ");
                        sb2.append(iD);
                        throw new IOException(sb2.toString());
                    }
                    this.f42439a.add(mc.f42436e[i11]);
                } else if (i10 == 64) {
                    d(new mg(mc.a(b()), b()));
                } else if ((bF & 64) == 64) {
                    d(new mg(a(d(i10, 63) - 1), b()));
                } else if ((bF & 32) == 32) {
                    int iD3 = d(i10, 31);
                    this.f42441c = iD3;
                    if (iD3 < 0 || iD3 > this.f42443e) {
                        StringBuilder sb3 = new StringBuilder("Invalid dynamic table size update ");
                        sb3.append(this.f42441c);
                        throw new IOException(sb3.toString());
                    }
                    int i12 = this.f42446j;
                    if (iD3 < i12) {
                        if (iD3 == 0) {
                            e();
                        } else {
                            e(i12 - iD3);
                        }
                    }
                } else if (i10 == 16 || i10 == 0) {
                    this.f42439a.add(new mg(mc.a(b()), b()));
                } else {
                    this.f42439a.add(new mg(a(d(i10, 15) - 1), b()));
                }
            }
        }

        public final List<mg> d() {
            ArrayList arrayList = new ArrayList(this.f42439a);
            this.f42439a.clear();
            return arrayList;
        }

        private a(nz nzVar) {
            this.f42439a = new ArrayList();
            mg[] mgVarArr = new mg[8];
            this.f42442d = mgVarArr;
            this.f42445i = mgVarArr.length - 1;
            this.f42444h = 0;
            this.f42446j = 0;
            this.f42443e = 4096;
            this.f42441c = 4096;
            this.f42440b = no.c(nzVar);
        }

        private int d(int i10) {
            return this.f42445i + 1 + i10;
        }

        private void d(mg mgVar) throws Throwable {
            this.f42439a.add(mgVar);
            int i10 = mgVar.f42548f;
            int i11 = this.f42441c;
            if (i10 > i11) {
                e();
                return;
            }
            e((this.f42446j + i10) - i11);
            int i12 = this.f42444h + 1;
            mg[] mgVarArr = this.f42442d;
            if (i12 > mgVarArr.length) {
                mg[] mgVarArr2 = new mg[mgVarArr.length << 1];
                try {
                    Object[] objArr = {mgVarArr, 0, mgVarArr2, Integer.valueOf(mgVarArr.length), Integer.valueOf(mgVarArr.length)};
                    Object[] objArr2 = new Object[1];
                    k("\u0ef2톨⛘퓺", ViewConfiguration.getLongPressTimeout() >> 16, (char) (Color.green(0) + 64038), "\uf715\uf049\ue71e뚬⨋ଂ㿛ⶃ阒燘Ұ࣎뻈⥶窺傘", "ဇ㲽㺦楉", objArr2);
                    Class<?> cls = Class.forName((String) objArr2[0]);
                    Object[] objArr3 = new Object[1];
                    k("\ue573퍛\ue246㥾", (ViewConfiguration.getJumpTapTimeout() >> 16) + 1188256741, (char) (ViewCompat.MEASURED_STATE_MASK - Color.rgb(0, 0, 0)), "계긇ꆭ\ue06b趹\ueaa1搊䛇櫮", "ဇ㲽㺦楉", objArr3);
                    String str = (String) objArr3[0];
                    Class<?> cls2 = Integer.TYPE;
                    cls.getMethod(str, Object.class, cls2, Object.class, cls2, cls2).invoke(null, objArr);
                    this.f42445i = this.f42442d.length - 1;
                    this.f42442d = mgVarArr2;
                } catch (Throwable th2) {
                    Throwable cause = th2.getCause();
                    if (cause == null) {
                        throw th2;
                    }
                    throw cause;
                }
            }
            int i13 = this.f42445i;
            this.f42445i = i13 - 1;
            this.f42442d[i13] = mgVar;
            this.f42444h++;
            this.f42446j += i10;
        }

        private int e(int i10) throws Throwable {
            int i11;
            if (i10 <= 0) {
                return 0;
            }
            int i12 = 0;
            int length = this.f42442d.length - 1;
            int i13 = i10;
            while (true) {
                i11 = this.f42445i;
                if (length < i11 || i13 <= 0) {
                    break;
                }
                int i14 = this.f42442d[length].f42548f;
                i13 -= i14;
                this.f42446j -= i14;
                this.f42444h--;
                i12++;
                length--;
            }
            mg[] mgVarArr = this.f42442d;
            try {
                Object[] objArr = {mgVarArr, Integer.valueOf(i11 + 1), mgVarArr, Integer.valueOf(i11 + 1 + i12), Integer.valueOf(this.f42444h)};
                Object[] objArr2 = new Object[1];
                k("\u0ef2톨⛘퓺", Color.red(0), (char) (64038 - (ViewConfiguration.getDoubleTapTimeout() >> 16)), "\uf715\uf049\ue71e뚬⨋ଂ㿛ⶃ阒燘Ұ࣎뻈⥶窺傘", "ဇ㲽㺦楉", objArr2);
                Class<?> cls = Class.forName((String) objArr2[0]);
                Object[] objArr3 = new Object[1];
                k("\ue573퍛\ue246㥾", 1188256742 + (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), (char) (ViewConfiguration.getKeyRepeatTimeout() >> 16), "계긇ꆭ\ue06b趹\ueaa1搊䛇櫮", "ဇ㲽㺦楉", objArr3);
                String str = (String) objArr3[0];
                Class<?> cls2 = Integer.TYPE;
                cls.getMethod(str, Object.class, cls2, Object.class, cls2, cls2).invoke(null, objArr);
                this.f42445i += i12;
                return i12;
            } catch (Throwable th2) {
                Throwable cause = th2.getCause();
                if (cause != null) {
                    throw cause;
                }
                throw th2;
            }
        }

        private int a() throws IOException {
            return this.f42440b.f() & 255;
        }

        private int d(int i10, int i11) throws IOException {
            int i12 = i10 & i11;
            if (i12 < i11) {
                return i12;
            }
            int i13 = 0;
            while (true) {
                int iA = a();
                if ((iA & 128) == 0) {
                    return i11 + (iA << i13);
                }
                i11 += (iA & 127) << i13;
                i13 += 7;
            }
        }

        private static boolean c(int i10) {
            return i10 >= 0 && i10 <= mc.f42436e.length - 1;
        }
    }

    public static final class d {
        private static final byte[] $$a = null;
        private static final int $$b = 0;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private static char[] f42447l;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private static char f42448o;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f42449a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        boolean f42450b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final nb f42451c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f42452d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f42453e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f42454f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        mg[] f42455g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f42456h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private final boolean f42457i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private int f42458j;

        static {
            init$0();
            f42447l = new char[]{25163, 25165, 25152, 25158, 25159, 25175, 25173, 25160, 25164, 25170, 25169, 25161, 25154, 25202, 25153, 25162, 25176, 25166, 25167, 25171, 25157, 25103, 25156, 25019, 25155};
            f42448o = (char) 22462;
        }

        public d(nb nbVar) {
            this(nbVar, (byte) 0);
        }

        public static void init$0() {
            $$a = new byte[]{103, 86, 73, 31};
            $$b = 32;
        }

        private static void k(byte b10, String str, int i10, Object[] objArr) throws Throwable {
            int i11;
            char[] charArray = str != null ? str.toCharArray() : str;
            gv gvVar = new gv();
            char[] cArr = f42447l;
            int i12 = -324767611;
            int i13 = 0;
            if (cArr != null) {
                int length = cArr.length;
                char[] cArr2 = new char[length];
                int i14 = 0;
                while (i14 < length) {
                    try {
                        Object[] objArr2 = {Integer.valueOf(cArr[i14])};
                        Map map = bp.f40694x;
                        Object method = map.get(Integer.valueOf(i12));
                        if (method == null) {
                            Class cls = (Class) bp.a((PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 24, (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 1411, (char) View.getDefaultSize(0, 0));
                            byte b11 = (byte) 0;
                            byte b12 = (byte) (b11 - 1);
                            Object[] objArr3 = new Object[1];
                            m(b11, b12, (byte) (b12 + 1), objArr3);
                            method = cls.getMethod((String) objArr3[0], Integer.TYPE);
                            map.put(-324767611, method);
                        }
                        cArr2[i14] = ((Character) ((Method) method).invoke(null, objArr2)).charValue();
                        i14++;
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
            Object[] objArr4 = {Integer.valueOf(f42448o)};
            Map map2 = bp.f40694x;
            Object method2 = map2.get(-324767611);
            if (method2 == null) {
                Class cls2 = (Class) bp.a((Process.myPid() >> 22) + 24, TextUtils.indexOf((CharSequence) "", '0') + 1412, (char) (ViewConfiguration.getJumpTapTimeout() >> 16));
                byte b13 = (byte) 0;
                byte b14 = (byte) (b13 - 1);
                Object[] objArr5 = new Object[1];
                m(b13, b14, (byte) (b14 + 1), objArr5);
                method2 = cls2.getMethod((String) objArr5[0], Integer.TYPE);
                map2.put(-324767611, method2);
            }
            char cCharValue = ((Character) ((Method) method2).invoke(null, objArr4)).charValue();
            char[] cArr3 = new char[i10];
            if (i10 % 2 != 0) {
                i11 = i10 - 1;
                cArr3[i11] = (char) (charArray[i11] - b10);
            } else {
                i11 = i10;
            }
            if (i11 > 1) {
                gvVar.f41832e = 0;
                while (true) {
                    int i15 = gvVar.f41832e;
                    if (i15 >= i11) {
                        break;
                    }
                    char c10 = charArray[i15];
                    gvVar.f41829b = c10;
                    char c11 = charArray[i15 + 1];
                    gvVar.f41831d = c11;
                    if (c10 == c11) {
                        cArr3[i15] = (char) (c10 - b10);
                        cArr3[i15 + 1] = (char) (c11 - b10);
                    } else {
                        Object[] objArr6 = new Object[13];
                        objArr6[12] = gvVar;
                        objArr6[11] = Integer.valueOf(cCharValue);
                        objArr6[10] = gvVar;
                        objArr6[9] = gvVar;
                        objArr6[8] = Integer.valueOf(cCharValue);
                        objArr6[7] = gvVar;
                        objArr6[6] = gvVar;
                        objArr6[5] = Integer.valueOf(cCharValue);
                        objArr6[4] = gvVar;
                        objArr6[3] = gvVar;
                        objArr6[2] = Integer.valueOf(cCharValue);
                        objArr6[1] = gvVar;
                        objArr6[i13] = gvVar;
                        Map map3 = bp.f40694x;
                        Object method3 = map3.get(-779085347);
                        if (method3 == null) {
                            Class cls3 = (Class) bp.a((SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 22, 719 - TextUtils.indexOf("", "", i13, i13), (char) Color.argb(i13, i13, i13, i13));
                            byte b15 = (byte) 1;
                            byte b16 = (byte) (-b15);
                            Object[] objArr7 = new Object[1];
                            m(b15, b16, (byte) (b16 + 1), objArr7);
                            String str2 = (String) objArr7[0];
                            Class<?> cls4 = Integer.TYPE;
                            method3 = cls3.getMethod(str2, Object.class, Object.class, cls4, Object.class, Object.class, cls4, Object.class, Object.class, cls4, Object.class, Object.class, cls4, Object.class);
                            map3.put(-779085347, method3);
                        }
                        int iIntValue = ((Integer) ((Method) method3).invoke(null, objArr6)).intValue();
                        int i16 = gvVar.f41833g;
                        if (iIntValue == i16) {
                            Object[] objArr8 = {gvVar, gvVar, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), gvVar, gvVar, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), gvVar, Integer.valueOf(cCharValue), gvVar};
                            Object method4 = map3.get(531504056);
                            if (method4 == null) {
                                Class cls5 = (Class) bp.a(Color.green(0) + 24, TextUtils.getOffsetBefore("", 0) + 221, (char) ((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) - 1));
                                Class<?> cls6 = Integer.TYPE;
                                method4 = cls5.getMethod("l", Object.class, Object.class, cls6, cls6, Object.class, Object.class, cls6, cls6, Object.class, cls6, Object.class);
                                map3.put(531504056, method4);
                            }
                            int iIntValue2 = ((Integer) ((Method) method4).invoke(null, objArr8)).intValue();
                            int i17 = (gvVar.f41828a * cCharValue) + gvVar.f41833g;
                            int i18 = gvVar.f41832e;
                            cArr3[i18] = cArr[iIntValue2];
                            cArr3[i18 + 1] = cArr[i17];
                        } else {
                            int i19 = gvVar.f41830c;
                            int i20 = gvVar.f41828a;
                            if (i19 == i20) {
                                int iA = androidx.activity.a.a(gvVar.f41834j, cCharValue, 1, cCharValue);
                                gvVar.f41834j = iA;
                                int iA2 = androidx.activity.a.a(i16, cCharValue, 1, cCharValue);
                                gvVar.f41833g = iA2;
                                int i21 = (i20 * cCharValue) + iA2;
                                int i22 = gvVar.f41832e;
                                cArr3[i22] = cArr[(i19 * cCharValue) + iA];
                                cArr3[i22 + 1] = cArr[i21];
                            } else {
                                int i23 = (i19 * cCharValue) + i16;
                                int i24 = (i20 * cCharValue) + gvVar.f41834j;
                                int i25 = gvVar.f41832e;
                                cArr3[i25] = cArr[i23];
                                cArr3[i25 + 1] = cArr[i24];
                            }
                        }
                    }
                    gvVar.f41832e += 2;
                    i13 = 0;
                }
            }
            for (int i26 = 0; i26 < i10; i26++) {
                cArr3[i26] = (char) (cArr3[i26] ^ 13722);
            }
            objArr[0] = new String(cArr3);
        }

        /* JADX WARN: Code duplicated, block: B:10:0x0029  */
        /* JADX WARN: Code duplicated, block: B:8:0x0021  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0029 -> B:11:0x0034). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0029
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        private static void m(byte r6, int r7, short r8, java.lang.Object[] r9) {
            /*
                int r7 = r7 + 4
                int r8 = r8 * 3
                int r0 = 1 - r8
                int r6 = r6 * 6
                int r6 = r6 + 105
                byte[] r1 = com.facetec.sdk.mc.d.$$a
                byte[] r0 = new byte[r0]
                r2 = 0
                int r8 = 0 - r8
                if (r1 != 0) goto L19
                r3 = r1
                r4 = r2
                r1 = r0
                r0 = r9
                r9 = r8
                goto L34
            L19:
                r3 = r2
            L1a:
                int r7 = r7 + 1
                byte r4 = (byte) r6
                r0[r3] = r4
                if (r3 != r8) goto L29
                java.lang.String r6 = new java.lang.String
                r6.<init>(r0, r2)
                r9[r2] = r6
                return
            L29:
                r4 = r1[r7]
                int r3 = r3 + 1
                r5 = r9
                r9 = r8
                r8 = r4
                r4 = r3
                r3 = r1
                r1 = r0
                r0 = r5
            L34:
                int r6 = r6 + r8
                r8 = r9
                r9 = r0
                r0 = r1
                r1 = r3
                r3 = r4
                goto L1a
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facetec.sdk.mc.d.m(byte, int, short, java.lang.Object[]):void");
        }

        public final void b(int i10, int i11, int i12) {
            if (i10 < i11) {
                this.f42451c.h(i10 | i12);
                return;
            }
            this.f42451c.h(i12 | i11);
            int i13 = i10 - i11;
            while (i13 >= 128) {
                this.f42451c.h(128 | (i13 & 127));
                i13 >>>= 7;
            }
            this.f42451c.h(i13);
        }

        public final void c() {
            Arrays.fill(this.f42455g, (Object) null);
            this.f42454f = this.f42455g.length - 1;
            this.f42458j = 0;
            this.f42456h = 0;
        }

        public final void d(nj njVar) throws IOException {
            if (this.f42457i) {
                mj.b();
                if (mj.d(njVar) < njVar.g()) {
                    nb nbVar = new nb();
                    mj.b();
                    mj.c(njVar, nbVar);
                    nj njVarO = nbVar.o();
                    b(njVarO.g(), 127, 128);
                    this.f42451c.d(njVarO);
                    return;
                }
            }
            b(njVar.g(), 127, 0);
            this.f42451c.d(njVar);
        }

        public final void e(mg mgVar) throws Throwable {
            int i10 = mgVar.f42548f;
            int i11 = this.f42453e;
            if (i10 > i11) {
                c();
                return;
            }
            c((this.f42456h + i10) - i11);
            int i12 = this.f42458j + 1;
            mg[] mgVarArr = this.f42455g;
            if (i12 > mgVarArr.length) {
                mg[] mgVarArr2 = new mg[mgVarArr.length << 1];
                try {
                    Object[] objArr = {mgVarArr, 0, mgVarArr2, Integer.valueOf(mgVarArr.length), Integer.valueOf(mgVarArr.length)};
                    Object[] objArr2 = new Object[1];
                    k((byte) (42 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1))), "\u0001\u0003\u0007\u0000\u0001\u0006\u0003\u0011\u0001\u0017\u000b\u0012\u0005\u0007\u0017\u0007", ImageFormat.getBitsPerPixel(0) + 17, objArr2);
                    Class<?> cls = Class.forName((String) objArr2[0]);
                    Object[] objArr3 = new Object[1];
                    k((byte) (67 - Color.alpha(0)), "\u0004\u0011\u0011\u0004\u0011\u000b\u000f\f㘦", ExpandableListView.getPackedPositionChild(0L) + 10, objArr3);
                    String str = (String) objArr3[0];
                    Class<?> cls2 = Integer.TYPE;
                    cls.getMethod(str, Object.class, cls2, Object.class, cls2, cls2).invoke(null, objArr);
                    this.f42454f = this.f42455g.length - 1;
                    this.f42455g = mgVarArr2;
                } catch (Throwable th2) {
                    Throwable cause = th2.getCause();
                    if (cause == null) {
                        throw th2;
                    }
                    throw cause;
                }
            }
            int i13 = this.f42454f;
            this.f42454f = i13 - 1;
            this.f42455g[i13] = mgVar;
            this.f42458j++;
            this.f42456h += i10;
        }

        private d(nb nbVar, byte b10) {
            this.f42449a = Integer.MAX_VALUE;
            mg[] mgVarArr = new mg[8];
            this.f42455g = mgVarArr;
            this.f42454f = mgVarArr.length - 1;
            this.f42458j = 0;
            this.f42456h = 0;
            this.f42452d = 4096;
            this.f42453e = 4096;
            this.f42457i = true;
            this.f42451c = nbVar;
        }

        public final int c(int i10) throws Throwable {
            int i11;
            if (i10 <= 0) {
                return 0;
            }
            int length = this.f42455g.length - 1;
            int i12 = 0;
            while (true) {
                i11 = this.f42454f;
                if (length < i11 || i10 <= 0) {
                    break;
                }
                int i13 = this.f42455g[length].f42548f;
                i10 -= i13;
                this.f42456h -= i13;
                this.f42458j--;
                i12++;
                length--;
            }
            mg[] mgVarArr = this.f42455g;
            try {
                Object[] objArr = {mgVarArr, Integer.valueOf(i11 + 1), mgVarArr, Integer.valueOf(i11 + 1 + i12), Integer.valueOf(this.f42458j)};
                Object[] objArr2 = new Object[1];
                k((byte) (View.resolveSize(0, 0) + 41), "\u0001\u0003\u0007\u0000\u0001\u0006\u0003\u0011\u0001\u0017\u000b\u0012\u0005\u0007\u0017\u0007", TextUtils.getCapsMode("", 0, 0) + 16, objArr2);
                Class<?> cls = Class.forName((String) objArr2[0]);
                Object[] objArr3 = new Object[1];
                k((byte) (67 - (ViewConfiguration.getLongPressTimeout() >> 16)), "\u0004\u0011\u0011\u0004\u0011\u000b\u000f\f㘦", 8 - TextUtils.indexOf((CharSequence) "", '0'), objArr3);
                String str = (String) objArr3[0];
                Class<?> cls2 = Integer.TYPE;
                cls.getMethod(str, Object.class, cls2, Object.class, cls2, cls2).invoke(null, objArr);
                mg[] mgVarArr2 = this.f42455g;
                int i14 = this.f42454f;
                Arrays.fill(mgVarArr2, i14 + 1, i14 + 1 + i12, (Object) null);
                this.f42454f += i12;
                return i12;
            } catch (Throwable th2) {
                Throwable cause = th2.getCause();
                if (cause != null) {
                    throw cause;
                }
                throw th2;
            }
        }
    }

    static {
        mg mgVar = new mg(mg.f42547h, "");
        int i10 = 0;
        nj njVar = mg.f42546e;
        nj njVar2 = mg.f42542a;
        nj njVar3 = mg.f42543b;
        nj njVar4 = mg.f42544c;
        mg[] mgVarArr = {mgVar, new mg(njVar, "GET"), new mg(njVar, "POST"), new mg(njVar2, "/"), new mg(njVar2, "/index.html"), new mg(njVar3, ProxyConfig.MATCH_HTTP), new mg(njVar3, ProxyConfig.MATCH_HTTPS), new mg(njVar4, Result.OK_RESPONSE_CODE), new mg(njVar4, "204"), new mg(njVar4, "206"), new mg(njVar4, "304"), new mg(njVar4, "400"), new mg(njVar4, AsoResponse.ERROR_TYPE_TOKEN_INCORRECT), new mg(njVar4, Result.INTERNAL_ERROR_RESPONSE_CODE), new mg("accept-charset", ""), new mg("accept-encoding", "gzip, deflate"), new mg("accept-language", ""), new mg("accept-ranges", ""), new mg("accept", ""), new mg("access-control-allow-origin", ""), new mg("age", ""), new mg("allow", ""), new mg("authorization", ""), new mg("cache-control", ""), new mg("content-disposition", ""), new mg("content-encoding", ""), new mg("content-language", ""), new mg(net.ipsoft.amelia.sdk.internal.c.c.f84797b, ""), new mg("content-location", ""), new mg("content-range", ""), new mg(net.ipsoft.amelia.sdk.internal.c.c.f84798c, ""), new mg("cookie", ""), new mg("date", ""), new mg(EtagInterceptor.HEADER_ETAG, ""), new mg("expect", ""), new mg("expires", ""), new mg("from", ""), new mg("host", ""), new mg("if-match", ""), new mg("if-modified-since", ""), new mg("if-none-match", ""), new mg("if-range", ""), new mg("if-unmodified-since", ""), new mg("last-modified", ""), new mg(DynamicLink.Builder.KEY_LINK, ""), new mg("location", ""), new mg("max-forwards", ""), new mg("proxy-authenticate", ""), new mg("proxy-authorization", ""), new mg("range", ""), new mg("referer", ""), new mg("refresh", ""), new mg("retry-after", ""), new mg("server", ""), new mg("set-cookie", ""), new mg("strict-transport-security", ""), new mg("transfer-encoding", ""), new mg("user-agent", ""), new mg("vary", ""), new mg("via", ""), new mg("www-authenticate", "")};
        f42436e = mgVarArr;
        LinkedHashMap linkedHashMap = new LinkedHashMap(mgVarArr.length);
        while (true) {
            mg[] mgVarArr2 = f42436e;
            if (i10 >= mgVarArr2.length) {
                f42435c = Collections.unmodifiableMap(linkedHashMap);
                return;
            } else {
                if (!linkedHashMap.containsKey(mgVarArr2[i10].f42550j)) {
                    linkedHashMap.put(mgVarArr2[i10].f42550j, Integer.valueOf(i10));
                }
                i10++;
            }
        }
    }

    public static nj a(nj njVar) throws IOException {
        int iG = njVar.g();
        for (int i10 = 0; i10 < iG; i10++) {
            byte bC = njVar.c(i10);
            if (bC >= 65 && bC <= 90) {
                StringBuilder sb2 = new StringBuilder("PROTOCOL_ERROR response malformed: mixed case name: ");
                sb2.append(njVar.b());
                throw new IOException(sb2.toString());
            }
        }
        return njVar;
    }
}

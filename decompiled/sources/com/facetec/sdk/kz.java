package com.facetec.sdk;

import android.graphics.Color;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewConfiguration;
import com.bbva.ethermobilesdk.deviceinfo.component.Time;
import com.bbva.glomohybrid.base.deeplink.extensions.DeepLinkExtensionsKt;
import com.mastercard.sonic.androidsvg.SvgConstantsKt;
import java.io.Closeable;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.IDN;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;
import java.nio.charset.Charset;
import java.security.GeneralSecurityException;
import java.security.KeyStore;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;
import javax.annotation.Nullable;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;
import mx.openpay.library.domain.util.Constant;

/* JADX INFO: loaded from: classes9.dex */
public final class kz {
    private static final byte[] $$a = null;
    private static final int $$b = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String[] f42206a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final TimeZone f42207b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final byte[] f42208c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final kt f42209d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Charset f42210e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final nj f42211f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final nj f42212g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final nj f42213h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final nj f42214i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final Comparator<String> f42215j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final Charset f42216k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final Charset f42217l;
    private static final Charset m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final Charset f42218n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final nj f42219o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static final Pattern f42220p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static final Method f42221q;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static int[] f42222t;

    static {
        init$0();
        c();
        byte[] bArr = new byte[0];
        f42208c = bArr;
        f42206a = new String[0];
        f42209d = kt.a(bArr);
        Method declaredMethod = null;
        kp.d(null, bArr);
        f42211f = nj.b("efbbbf");
        f42213h = nj.b("feff");
        f42214i = nj.b("fffe");
        f42212g = nj.b("0000ffff");
        f42219o = nj.b("ffff0000");
        f42210e = Charset.forName("UTF-8");
        Charset.forName("ISO-8859-1");
        m = Charset.forName("UTF-16BE");
        f42216k = Charset.forName("UTF-16LE");
        f42217l = Charset.forName("UTF-32BE");
        f42218n = Charset.forName("UTF-32LE");
        f42207b = TimeZone.getTimeZone(Time.GMT);
        f42215j = new Comparator<String>() { // from class: com.facetec.sdk.kz.3
            @Override // java.util.Comparator
            public final /* synthetic */ int compare(String str, String str2) {
                return str.compareTo(str2);
            }
        };
        try {
            declaredMethod = Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class);
        } catch (Exception unused) {
        }
        f42221q = declaredMethod;
        f42220p = Pattern.compile("([0-9a-fA-F]*:[0-9a-fA-F:.]*)|([\\d.]+)");
    }

    public static void a(long j10, long j11) {
        if (j11 < 0 || 0 > j10 || j10 < j11) {
            throw new ArrayIndexOutOfBoundsException();
        }
    }

    public static boolean b(nz nzVar, int i10, TimeUnit timeUnit) throws Throwable {
        try {
            Object[] objArr = new Object[1];
            r(new int[]{-292664324, -1897434975, 1430602662, -1258863289, -1433658877, 727063753, 731797879, -2011890452}, 17 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), objArr);
            Class<?> cls = Class.forName((String) objArr[0]);
            Object[] objArr2 = new Object[1];
            r(new int[]{-960144951, 76509247, -1565714527, -419163242}, 8 - (ViewConfiguration.getLongPressTimeout() >> 16), objArr2);
            long jLongValue = ((Long) cls.getMethod((String) objArr2[0], null).invoke(null, null)).longValue();
            long jC_ = nzVar.a().b_() ? nzVar.a().c_() - jLongValue : Long.MAX_VALUE;
            nzVar.a().d(Math.min(jC_, timeUnit.toNanos(i10)) + jLongValue);
            try {
                nb nbVar = new nb();
                while (nzVar.d(nbVar, SvgConstantsKt.SPECIFIED_FONT_FAMILY) != -1) {
                    try {
                        nbVar.p();
                    } catch (InterruptedIOException unused) {
                        if (jC_ == Long.MAX_VALUE) {
                            nzVar.a().d_();
                        } else {
                            nzVar.a().d(jLongValue + jC_);
                        }
                        return false;
                    } catch (Throwable th2) {
                        th = th2;
                        if (jC_ == Long.MAX_VALUE) {
                            nzVar.a().d_();
                        } else {
                            nzVar.a().d(jLongValue + jC_);
                        }
                        throw th;
                    }
                }
                if (jC_ == Long.MAX_VALUE) {
                    nzVar.a().d_();
                } else {
                    nzVar.a().d(jLongValue + jC_);
                }
                return true;
            } catch (InterruptedIOException unused2) {
            } catch (Throwable th3) {
                th = th3;
            }
        } catch (Throwable th4) {
            Throwable cause = th4.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th4;
        }
    }

    public static boolean c(nz nzVar, TimeUnit timeUnit) {
        try {
            return b(nzVar, 100, timeUnit);
        } catch (IOException unused) {
            return false;
        }
    }

    public static int d(char c10) {
        if (c10 >= '0' && c10 <= '9') {
            return c10 - '0';
        }
        if (c10 >= 'a' && c10 <= 'f') {
            return c10 - 'W';
        }
        if (c10 < 'A' || c10 > 'F') {
            return -1;
        }
        return c10 - '7';
    }

    public static void e(Throwable th2, Throwable th3) {
        Method method = f42221q;
        if (method != null) {
            try {
                method.invoke(th2, th3);
            } catch (IllegalAccessException | InvocationTargetException unused) {
            }
        }
    }

    public static void init$0() {
        $$a = new byte[]{6, 45, -19, 87};
        $$b = 172;
    }

    private static void r(int[] iArr, int i10, Object[] objArr) throws Throwable {
        char[] cArr;
        Object method;
        Object method2;
        Object method3;
        gx gxVar = new gx();
        char[] cArr2 = new char[4];
        char[] cArr3 = new char[iArr.length * 2];
        int[] iArr2 = f42222t;
        int i11 = 1;
        int i12 = 0;
        if (iArr2 != null) {
            int length = iArr2.length;
            int[] iArr3 = new int[length];
            int i13 = 0;
            while (i13 < length) {
                try {
                    Object[] objArr2 = new Object[1];
                    objArr2[i12] = Integer.valueOf(iArr2[i13]);
                    Map map = bp.f40694x;
                    Object obj = map.get(835167305);
                    if (obj != null) {
                        method3 = obj;
                    } else {
                        Class cls = (Class) bp.a(24 - Drawable.resolveOpacity(i12, i12), (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 764, (char) ((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 36772));
                        byte length2 = (byte) $$a.length;
                        Object[] objArr3 = new Object[1];
                        s((byte) i12, length2, (byte) (length2 - 4), objArr3);
                        method3 = cls.getMethod((String) objArr3[0], Integer.TYPE);
                        map.put(835167305, method3);
                    }
                    iArr3[i13] = ((Integer) ((Method) method3).invoke(null, objArr2)).intValue();
                    i13++;
                    iArr2 = iArr2;
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
        int[] iArr5 = f42222t;
        float f6 = 0.0f;
        if (iArr5 != null) {
            int length4 = iArr5.length;
            int[] iArr6 = new int[length4];
            int i14 = 0;
            while (i14 < length4) {
                Object[] objArr4 = new Object[i11];
                objArr4[0] = Integer.valueOf(iArr5[i14]);
                Map map2 = bp.f40694x;
                Object obj2 = map2.get(835167305);
                if (obj2 != null) {
                    method2 = obj2;
                } else {
                    Class cls2 = (Class) bp.a(View.resolveSize(0, 0) + 24, 765 - (PointF.length(f6, f6) > f6 ? 1 : (PointF.length(f6, f6) == f6 ? 0 : -1)), (char) (36773 - (ViewConfiguration.getKeyRepeatTimeout() >> 16)));
                    byte length5 = (byte) $$a.length;
                    Object[] objArr5 = new Object[1];
                    s((byte) 0, length5, (byte) (length5 - 4), objArr5);
                    method2 = cls2.getMethod((String) objArr5[0], Integer.TYPE);
                    map2.put(835167305, method2);
                }
                iArr6[i14] = ((Integer) ((Method) method2).invoke(null, objArr4)).intValue();
                i14++;
                iArr5 = iArr5;
                length4 = length4;
                cArr3 = cArr3;
                f6 = 0.0f;
                i11 = 1;
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
                Object obj3 = map3.get(147461875);
                if (obj3 != null) {
                    method = obj3;
                } else {
                    Class cls3 = (Class) bp.a(23 - (ViewConfiguration.getFadingEdgeLength() >> 16), 1025 - TextUtils.getCapsMode("", 0, 0), (char) (TextUtils.lastIndexOf("", '0') + 38454));
                    byte b10 = (byte) 0;
                    byte b11 = b10;
                    Object[] objArr7 = new Object[1];
                    s(b10, b11, b11, objArr7);
                    method = cls3.getMethod((String) objArr7[0], Object.class, Integer.TYPE, Object.class, Object.class);
                    map3.put(147461875, method);
                }
                int iIntValue = ((Integer) ((Method) method).invoke(null, objArr6)).intValue();
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
                Class cls4 = (Class) bp.a(TextUtils.getTrimmedLength("") + 24, 789 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), (char) (26623 - TextUtils.indexOf((CharSequence) "", '0', 0)));
                byte b12 = (byte) 0;
                byte b13 = (byte) (b12 + 1);
                Object[] objArr9 = new Object[1];
                s(b12, b13, (byte) (b13 - 1), objArr9);
                method4 = cls4.getMethod((String) objArr9[0], Object.class, Object.class);
                map4.put(-1856717708, method4);
            }
            ((Method) method4).invoke(null, objArr8);
            c10 = 0;
        }
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0028  */
    /* JADX WARN: Code duplicated, block: B:8:0x0020  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0028 -> B:11:0x002a). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0028
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void s(short r6, short r7, int r8, java.lang.Object[] r9) {
        /*
            byte[] r0 = com.facetec.sdk.kz.$$a
            int r6 = r6 * 2
            int r6 = r6 + 4
            int r8 = r8 * 4
            int r1 = r8 + 1
            int r7 = r7 + 117
            byte[] r1 = new byte[r1]
            r2 = 0
            if (r0 != 0) goto L15
            r3 = r7
            r4 = r2
            r7 = r6
            goto L2a
        L15:
            r3 = r2
            r5 = r7
            r7 = r6
            r6 = r5
        L19:
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
        L2a:
            int r6 = r6 + r3
            int r7 = r7 + 1
            r3 = r4
            goto L19
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facetec.sdk.kz.s(short, short, int, java.lang.Object[]):void");
    }

    public static void a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (RuntimeException e5) {
                throw e5;
            } catch (Exception unused) {
            }
        }
    }

    public static int c(String str, int i10, int i11) {
        while (true) {
            i11--;
            if (i11 < i10) {
                return i10;
            }
            char cCharAt = str.charAt(i11);
            if (cCharAt != '\t' && cCharAt != '\n' && cCharAt != '\f' && cCharAt != '\r' && cCharAt != ' ') {
                return i11 + 1;
            }
        }
    }

    public static boolean d(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    public static Charset c(nh nhVar, Charset charset) throws IOException {
        nj njVar = f42211f;
        if (nhVar.c(njVar)) {
            nhVar.j(njVar.g());
            return f42210e;
        }
        nj njVar2 = f42213h;
        if (nhVar.c(njVar2)) {
            nhVar.j(njVar2.g());
            return m;
        }
        nj njVar3 = f42214i;
        if (nhVar.c(njVar3)) {
            nhVar.j(njVar3.g());
            return f42216k;
        }
        nj njVar4 = f42212g;
        if (nhVar.c(njVar4)) {
            nhVar.j(njVar4.g());
            return f42217l;
        }
        nj njVar5 = f42219o;
        if (!nhVar.c(njVar5)) {
            return charset;
        }
        nhVar.j(njVar5.g());
        return f42218n;
    }

    public static void d(Socket socket) {
        if (socket != null) {
            try {
                socket.close();
            } catch (AssertionError e5) {
                if (!e(e5)) {
                    throw e5;
                }
            } catch (RuntimeException e7) {
                if (!"bio == null".equals(e7.getMessage())) {
                    throw e7;
                }
            } catch (Exception unused) {
            }
        }
    }

    public static String[] e(Comparator<? super String> comparator, String[] strArr, String[] strArr2) {
        ArrayList arrayList = new ArrayList();
        for (String str : strArr) {
            for (String str2 : strArr2) {
                if (comparator.compare(str, str2) == 0) {
                    arrayList.add(str);
                    break;
                }
            }
        }
        return (String[]) arrayList.toArray(new String[arrayList.size()]);
    }

    public static <K, V> Map<K, V> a(Map<K, V> map) {
        if (map.isEmpty()) {
            return Collections.emptyMap();
        }
        return Collections.unmodifiableMap(new LinkedHashMap(map));
    }

    public static String a(kk kkVar, boolean z10) {
        String strI;
        if (kkVar.i().contains(DeepLinkExtensionsKt.DYNAMIC_LINK_DELIMITER)) {
            StringBuilder sb2 = new StringBuilder(Constant.BRACKET_OPEN);
            sb2.append(kkVar.i());
            sb2.append(Constant.BRACKET_CLOSE);
            strI = sb2.toString();
        } else {
            strI = kkVar.i();
        }
        if (!z10 && kkVar.j() == kk.b(kkVar.b())) {
            return strI;
        }
        StringBuilder sbE = androidx.camera.core.processing.f.e(strI, DeepLinkExtensionsKt.DYNAMIC_LINK_DELIMITER);
        sbE.append(kkVar.j());
        return sbE.toString();
    }

    public static <T> List<T> d(List<T> list) {
        return Collections.unmodifiableList(new ArrayList(list));
    }

    public static boolean d(String str) {
        return f42220p.matcher(str).matches();
    }

    public static boolean e(AssertionError assertionError) {
        return (assertionError.getCause() == null || assertionError.getMessage() == null || !assertionError.getMessage().contains("getsockname failed")) ? false : true;
    }

    public static String e(String str, int i10, int i11) {
        int iB = b(str, i10, i11);
        return str.substring(iB, c(str, iB, i11));
    }

    public static int e(String str) {
        int length = str.length();
        for (int i10 = 0; i10 < length; i10++) {
            char cCharAt = str.charAt(i10);
            if (cCharAt <= 31 || cCharAt >= 127) {
                return i10;
            }
        }
        return -1;
    }

    public static <T> List<T> b(T... tArr) {
        return Collections.unmodifiableList(Arrays.asList((Object[]) tArr.clone()));
    }

    public static ThreadFactory b(final String str, final boolean z10) {
        return new ThreadFactory() { // from class: com.facetec.sdk.kz.2
            @Override // java.util.concurrent.ThreadFactory
            public final Thread newThread(Runnable runnable) {
                Thread thread = new Thread(runnable, str);
                thread.setDaemon(z10);
                return thread;
            }
        };
    }

    public static String e(String str, Object... objArr) {
        return String.format(Locale.US, str, objArr);
    }

    public static boolean b(Comparator<String> comparator, String[] strArr, String[] strArr2) {
        if (strArr != null && strArr2 != null && strArr.length != 0 && strArr2.length != 0) {
            for (String str : strArr) {
                for (String str2 : strArr2) {
                    if (comparator.compare(str, str2) == 0) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    private static boolean e(String str, int i10, int i11, byte[] bArr, int i12) {
        int i13 = i12;
        while (i10 < i11) {
            if (i13 == bArr.length) {
                return false;
            }
            if (i13 != i12) {
                if (str.charAt(i10) != '.') {
                    return false;
                }
                i10++;
            }
            int i14 = i10;
            int i15 = 0;
            while (i14 < i11) {
                char cCharAt = str.charAt(i14);
                if (cCharAt < '0' || cCharAt > '9') {
                    break;
                }
                if ((i15 == 0 && i10 != i14) || (i15 = ((i15 * 10) + cCharAt) - 48) > 255) {
                    return false;
                }
                i14++;
            }
            if (i14 - i10 == 0) {
                return false;
            }
            bArr[i13] = (byte) i15;
            i13++;
            i10 = i14;
        }
        return i13 == i12 + 4;
    }

    public static void c() {
        f42222t = new int[]{956257482, 194530159, 1621305127, -1734429144, 2076989957, 735085665, -1487093420, -1184536339, 834690938, -728091687, 2145678410, -620029978, -148417959, 17381111, -1872867196, -1178627614, 778652647, 324596849};
    }

    public static int a(Comparator<String> comparator, String[] strArr, String str) {
        int length = strArr.length;
        for (int i10 = 0; i10 < length; i10++) {
            if (comparator.compare(strArr[i10], str) == 0) {
                return i10;
            }
        }
        return -1;
    }

    public static int b(String str, int i10, int i11) {
        while (i10 < i11) {
            char cCharAt = str.charAt(i10);
            if (cCharAt != '\t' && cCharAt != '\n' && cCharAt != '\f' && cCharAt != '\r' && cCharAt != ' ') {
                return i10;
            }
            i10++;
        }
        return i11;
    }

    public static kj e(List<mg> list) {
        kj.d dVar = new kj.d();
        for (mg mgVar : list) {
            kv.f42195e.b(dVar, mgVar.f42550j.b(), mgVar.f42549g.b());
        }
        return dVar.d();
    }

    public static int b(String str, int i10, int i11, char c10) {
        while (i10 < i11) {
            if (str.charAt(i10) == c10) {
                return i10;
            }
            i10++;
        }
        return i11;
    }

    public static String[] a(String[] strArr, String str) throws Throwable {
        int length = strArr.length;
        String[] strArr2 = new String[length + 1];
        try {
            Object[] objArr = {strArr, 0, strArr2, 0, Integer.valueOf(strArr.length)};
            Object[] objArr2 = new Object[1];
            r(new int[]{-292664324, -1897434975, 1430602662, -1258863289, -1433658877, 727063753, 731797879, -2011890452}, (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 16, objArr2);
            Class<?> cls = Class.forName((String) objArr2[0]);
            Object[] objArr3 = new Object[1];
            r(new int[]{-1061517787, -1614280836, 1592507273, 239912707, 869241205, 783391475}, 9 - (ViewConfiguration.getScrollBarSize() >> 8), objArr3);
            String str2 = (String) objArr3[0];
            Class<?> cls2 = Integer.TYPE;
            cls.getMethod(str2, Object.class, cls2, Object.class, cls2, cls2).invoke(null, objArr);
            strArr2[length] = str;
            return strArr2;
        } catch (Throwable th2) {
            Throwable cause = th2.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th2;
        }
    }

    public static String b(String str) throws Throwable {
        InetAddress inetAddressA;
        if (str.contains(DeepLinkExtensionsKt.DYNAMIC_LINK_DELIMITER)) {
            int i10 = 0;
            if (str.startsWith(Constant.BRACKET_OPEN) && str.endsWith(Constant.BRACKET_CLOSE)) {
                inetAddressA = a(str, 1, str.length() - 1);
            } else {
                inetAddressA = a(str, 0, str.length());
            }
            if (inetAddressA == null) {
                return null;
            }
            byte[] address = inetAddressA.getAddress();
            if (address.length == 16) {
                int i11 = -1;
                int i12 = 0;
                int i13 = 0;
                while (i12 < address.length) {
                    int i14 = i12;
                    while (i14 < 16 && address[i14] == 0 && address[i14 + 1] == 0) {
                        i14 += 2;
                    }
                    int i15 = i14 - i12;
                    if (i15 > i13 && i15 >= 4) {
                        i11 = i12;
                        i13 = i15;
                    }
                    i12 = i14 + 2;
                }
                nb nbVar = new nb();
                while (i10 < address.length) {
                    if (i10 == i11) {
                        nbVar.h(58);
                        i10 += i13;
                        if (i10 == 16) {
                            nbVar.h(58);
                        }
                    } else {
                        if (i10 > 0) {
                            nbVar.h(58);
                        }
                        nbVar.f(((address[i10] & 255) << 8) | (address[i10 + 1] & 255));
                        i10 += 2;
                    }
                }
                return nbVar.m();
            }
            StringBuilder sb2 = new StringBuilder("Invalid IPv6 address: '");
            sb2.append(str);
            sb2.append("'");
            throw new AssertionError(sb2.toString());
        }
        try {
            String lowerCase = IDN.toASCII(str).toLowerCase(Locale.US);
            if (lowerCase.isEmpty() || a(lowerCase)) {
                return null;
            }
            return lowerCase;
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }

    public static int a(String str, int i10, int i11, String str2) {
        while (i10 < i11) {
            if (str2.indexOf(str.charAt(i10)) != -1) {
                return i10;
            }
            i10++;
        }
        return i11;
    }

    private static boolean a(String str) {
        for (int i10 = 0; i10 < str.length(); i10++) {
            char cCharAt = str.charAt(i10);
            if (cCharAt <= 31 || cCharAt >= 127 || " #%/:?@[\\]".indexOf(cCharAt) != -1) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:31:0x005a  */
    /* JADX WARN: Code duplicated, block: B:33:0x0064 A[LOOP:1: B:30:0x0058->B:33:0x0064, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:67:0x006a A[EDGE_INSN: B:67:0x006a->B:34:0x006a BREAK  A[LOOP:1: B:30:0x0058->B:33:0x0064], SYNTHETIC] */
    @Nullable
    private static InetAddress a(String str, int i10, int i11) throws Throwable {
        int i12;
        int i13;
        int i14;
        int iD;
        int i15 = 16;
        byte[] bArr = new byte[16];
        int i16 = i10;
        int i17 = 0;
        int i18 = -1;
        int i19 = -1;
        while (true) {
            if (i16 >= i11) {
                i12 = i15;
                break;
            }
            if (i17 == i15) {
                return null;
            }
            int i20 = i16 + 2;
            if (i20 <= i11 && str.regionMatches(i16, "::", 0, 2)) {
                if (i18 != -1) {
                    return null;
                }
                i17 += 2;
                i18 = i17;
                if (i20 == i11) {
                    i12 = 16;
                    break;
                }
                i19 = i20;
                i13 = 0;
                i16 = i19;
                while (i16 < i11) {
                    iD = d(str.charAt(i16));
                    if (iD != -1) {
                        break;
                        break;
                    }
                    i13 = (i13 << 4) + iD;
                    i16++;
                }
                i14 = i16 - i19;
                if (i14 != 0) {
                }
                return null;
            }
            if (i17 != 0) {
                if (!str.regionMatches(i16, DeepLinkExtensionsKt.DYNAMIC_LINK_DELIMITER, 0, 1)) {
                    if (!str.regionMatches(i16, Constant.DOT_STRING, 0, 1) || !e(str, i19, i11, bArr, i17 - 2)) {
                        return null;
                    }
                    i17 += 2;
                    i12 = 16;
                    break;
                }
                i16++;
            }
            i19 = i16;
            i13 = 0;
            i16 = i19;
            while (i16 < i11) {
                iD = d(str.charAt(i16));
                if (iD != -1) {
                    break;
                }
                i13 = (i13 << 4) + iD;
                i16++;
            }
            i14 = i16 - i19;
            if (i14 != 0 || i14 > 4) {
                return null;
            }
            int i21 = i17 + 1;
            bArr[i17] = (byte) (i13 >>> 8);
            i17 += 2;
            bArr[i21] = (byte) i13;
            i15 = 16;
        }
        if (i17 != i12) {
            if (i18 == -1) {
                return null;
            }
            int i22 = i17 - i18;
            try {
                Object[] objArr = {bArr, Integer.valueOf(i18), bArr, Integer.valueOf(16 - i22), Integer.valueOf(i22)};
                Object[] objArr2 = new Object[1];
                r(new int[]{-292664324, -1897434975, 1430602662, -1258863289, -1433658877, 727063753, 731797879, -2011890452}, Color.green(0) + 16, objArr2);
                Class<?> cls = Class.forName((String) objArr2[0]);
                Object[] objArr3 = new Object[1];
                r(new int[]{-1061517787, -1614280836, 1592507273, 239912707, 869241205, 783391475}, 9 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), objArr3);
                String str2 = (String) objArr3[0];
                Class<?> cls2 = Integer.TYPE;
                cls.getMethod(str2, Object.class, cls2, Object.class, cls2, cls2).invoke(null, objArr);
                Arrays.fill(bArr, i18, (16 - i17) + i18, (byte) 0);
            } catch (Throwable th2) {
                Throwable cause = th2.getCause();
                if (cause != null) {
                    throw cause;
                }
                throw th2;
            }
        }
        try {
            return InetAddress.getByAddress(bArr);
        } catch (UnknownHostException unused) {
            throw new AssertionError();
        }
    }

    public static int b(String str, TimeUnit timeUnit) {
        if (timeUnit != null) {
            long millis = timeUnit.toMillis(60L);
            if (millis > 2147483647L) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(str);
                sb2.append(" too large.");
                throw new IllegalArgumentException(sb2.toString());
            }
            if (millis != 0) {
                return (int) millis;
            }
            StringBuilder sb3 = new StringBuilder();
            sb3.append(str);
            sb3.append(" too small.");
            throw new IllegalArgumentException(sb3.toString());
        }
        throw new NullPointerException("unit == null");
    }

    public static X509TrustManager a() {
        try {
            TrustManagerFactory trustManagerFactory = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
            trustManagerFactory.init((KeyStore) null);
            TrustManager[] trustManagers = trustManagerFactory.getTrustManagers();
            if (trustManagers.length == 1) {
                TrustManager trustManager = trustManagers[0];
                if (trustManager instanceof X509TrustManager) {
                    return (X509TrustManager) trustManager;
                }
            }
            StringBuilder sb2 = new StringBuilder("Unexpected default trust managers:");
            sb2.append(Arrays.toString(trustManagers));
            throw new IllegalStateException(sb2.toString());
        } catch (GeneralSecurityException e5) {
            throw b("No System TLS", e5);
        }
    }

    public static AssertionError b(String str, Exception exc) {
        AssertionError assertionError = new AssertionError(str);
        try {
            assertionError.initCause(exc);
        } catch (IllegalStateException unused) {
        }
        return assertionError;
    }
}

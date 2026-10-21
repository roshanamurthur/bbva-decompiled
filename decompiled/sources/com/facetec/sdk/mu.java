package com.facetec.sdk;

import android.graphics.ImageFormat;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.bbva.ethermobilesdk.deviceinfo.component.Sys;
import java.io.IOException;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.security.NoSuchAlgorithmException;
import java.security.Security;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.annotation.Nullable;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;
import org.objenesis.strategy.PlatformDescription;

/* JADX INFO: loaded from: classes9.dex */
public class mu {
    private static final byte[] $$a = null;
    private static final int $$b = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final mu f42630a;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final Logger f42631d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static int[] f42632e;

    static {
        mu muVarB;
        init$0();
        j();
        if (g()) {
            muVarB = mm.a();
            if (muVarB == null && (muVarB = mp.b()) == null) {
                throw new NullPointerException("No platform found on Android");
            }
        } else if ((!d() || (muVarB = ms.d()) == null) && (muVarB = mt.b()) == null && (muVarB = mr.a()) == null) {
            muVarB = new mu();
        }
        f42630a = muVarB;
        f42631d = Logger.getLogger(kl.class.getName());
    }

    public static boolean g() throws Throwable {
        try {
            Object[] objArr = {Sys.VM_NAME};
            Object[] objArr2 = new Object[1];
            h(new int[]{5995157, 2068998800, 713822103, 420818544, -2034224430, -1252254193, 1669662140, -1147322886}, 17 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), objArr2);
            Class<?> cls = Class.forName((String) objArr2[0]);
            Object[] objArr3 = new Object[1];
            h(new int[]{675665120, -101778711, 982909005, 83627931, -1291596685, -1608913715}, 12 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), objArr3);
            return PlatformDescription.DALVIK.equals(cls.getMethod((String) objArr3[0], String.class).invoke(null, objArr));
        } catch (Throwable th2) {
            Throwable cause = th2.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th2;
        }
    }

    private static void h(int[] iArr, int i10, Object[] objArr) throws Throwable {
        char[] cArr;
        Object method;
        Object method2;
        gx gxVar = new gx();
        char[] cArr2 = new char[4];
        char[] cArr3 = new char[iArr.length * 2];
        int[] iArr2 = f42632e;
        long j10 = 0;
        int i11 = 1;
        char c10 = 0;
        if (iArr2 != null) {
            int length = iArr2.length;
            int[] iArr3 = new int[length];
            int i12 = 0;
            while (i12 < length) {
                try {
                    Object[] objArr2 = new Object[i11];
                    objArr2[c10] = Integer.valueOf(iArr2[i12]);
                    Map map = bp.f40694x;
                    Object obj = map.get(835167305);
                    if (obj != null) {
                        method2 = obj;
                    } else {
                        Class cls = (Class) bp.a(25 - (Process.getElapsedCpuTime() > j10 ? 1 : (Process.getElapsedCpuTime() == j10 ? 0 : -1)), 765 - (KeyEvent.getMaxKeyCode() >> 16), (char) (36774 - (SystemClock.elapsedRealtimeNanos() > j10 ? 1 : (SystemClock.elapsedRealtimeNanos() == j10 ? 0 : -1))));
                        byte b10 = (byte) (-1);
                        byte b11 = (byte) (b10 + 1);
                        Object[] objArr3 = new Object[1];
                        k(b10, b11, b11, objArr3);
                        method2 = cls.getMethod((String) objArr3[0], Integer.TYPE);
                        map.put(835167305, method2);
                    }
                    iArr3[i12] = ((Integer) ((Method) method2).invoke(null, objArr2)).intValue();
                    i12++;
                    iArr2 = iArr2;
                    j10 = 0;
                    i11 = 1;
                    c10 = 0;
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
        int length2 = iArr2.length;
        int[] iArr4 = new int[length2];
        int[] iArr5 = f42632e;
        if (iArr5 != null) {
            int length3 = iArr5.length;
            int[] iArr6 = new int[length3];
            int i13 = 0;
            while (i13 < length3) {
                Object[] objArr4 = {Integer.valueOf(iArr5[i13])};
                Map map2 = bp.f40694x;
                Object method3 = map2.get(835167305);
                if (method3 == null) {
                    Class cls2 = (Class) bp.a(25 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), 765 - ExpandableListView.getPackedPositionType(0L), (char) (36773 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1))));
                    byte b12 = (byte) (-1);
                    byte b13 = (byte) (b12 + 1);
                    Object[] objArr5 = new Object[1];
                    k(b12, b13, b13, objArr5);
                    method3 = cls2.getMethod((String) objArr5[0], Integer.TYPE);
                    map2.put(835167305, method3);
                }
                iArr6[i13] = ((Integer) ((Method) method3).invoke(null, objArr4)).intValue();
                i13++;
                iArr5 = iArr5;
                length3 = length3;
                cArr3 = cArr3;
            }
            cArr = cArr3;
            iArr5 = iArr6;
        } else {
            cArr = cArr3;
        }
        char c11 = 0;
        System.arraycopy(iArr5, 0, iArr4, 0, length2);
        gxVar.f41838c = 0;
        while (true) {
            int i14 = gxVar.f41838c;
            if (i14 >= iArr.length) {
                objArr[0] = new String(cArr, 0, i10);
                return;
            }
            int i15 = iArr[i14];
            char c12 = (char) (i15 >> 16);
            cArr2[c11] = c12;
            char c13 = (char) i15;
            cArr2[1] = c13;
            char c14 = (char) (iArr[i14 + 1] >> 16);
            cArr2[2] = c14;
            char c15 = (char) iArr[i14 + 1];
            cArr2[3] = c15;
            gxVar.f41839d = (c12 << 16) + c13;
            gxVar.f41837a = (c14 << 16) + c15;
            gx.b(iArr4);
            int i16 = 0;
            for (int i17 = 16; i16 < i17; i17 = 16) {
                int i18 = gxVar.f41839d ^ iArr4[i16];
                gxVar.f41839d = i18;
                Object[] objArr6 = {gxVar, Integer.valueOf(gx.e(i18)), gxVar, gxVar};
                Map map3 = bp.f40694x;
                Object method4 = map3.get(147461875);
                if (method4 == null) {
                    Class cls3 = (Class) bp.a(22 - ImageFormat.getBitsPerPixel(0), 1025 - KeyEvent.keyCodeFromString(""), (char) ((ViewConfiguration.getMinimumFlingVelocity() >> 16) + 38453));
                    byte b14 = (byte) (-1);
                    Object[] objArr7 = new Object[1];
                    k(b14, (byte) (b14 + 1), (byte) $$a.length, objArr7);
                    method4 = cls3.getMethod((String) objArr7[0], Object.class, Integer.TYPE, Object.class, Object.class);
                    map3.put(147461875, method4);
                }
                int iIntValue = ((Integer) ((Method) method4).invoke(null, objArr6)).intValue();
                gxVar.f41839d = gxVar.f41837a;
                gxVar.f41837a = iIntValue;
                i16++;
            }
            int i19 = gxVar.f41839d;
            int i20 = gxVar.f41837a;
            int i21 = i19 ^ iArr4[16];
            gxVar.f41837a = i21;
            int i22 = i20 ^ iArr4[17];
            gxVar.f41839d = i22;
            cArr2[0] = (char) (i22 >>> 16);
            cArr2[1] = (char) i22;
            cArr2[2] = (char) (i21 >>> 16);
            cArr2[3] = (char) i21;
            gx.b(iArr4);
            int i23 = gxVar.f41838c;
            cArr[i23 * 2] = cArr2[0];
            cArr[(i23 * 2) + 1] = cArr2[1];
            cArr[(i23 * 2) + 2] = cArr2[2];
            cArr[(i23 * 2) + 3] = cArr2[3];
            Object[] objArr8 = {gxVar, gxVar};
            Map map4 = bp.f40694x;
            Object obj2 = map4.get(-1856717708);
            if (obj2 != null) {
                method = obj2;
            } else {
                Class cls4 = (Class) bp.a(View.resolveSizeAndState(0, 0, 0) + 24, 789 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), (char) (26624 - KeyEvent.normalizeMetaState(0)));
                byte b15 = (byte) (-1);
                byte b16 = (byte) (b15 + 1);
                Object[] objArr9 = new Object[1];
                k(b15, b16, (byte) (b16 + 3), objArr9);
                method = cls4.getMethod((String) objArr9[0], Object.class, Object.class);
                map4.put(-1856717708, method);
            }
            ((Method) method).invoke(null, objArr8);
            c11 = 0;
        }
    }

    public static mu i() {
        return f42630a;
    }

    public static void init$0() {
        $$a = new byte[]{67, 101, -39, 103};
        $$b = 189;
    }

    public static void j() {
        f42632e = new int[]{-623171509, -932690314, -199558202, -83023446, -372211436, 591376994, 1038230240, -838259339, 851610051, -1195401498, 800319226, -2118518142, -1427704845, -1811319330, 1817500257, 103166660, 435042709, -909264121};
    }

    /* JADX WARN: Code duplicated, block: B:10:0x002a  */
    /* JADX WARN: Code duplicated, block: B:8:0x0022  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x002a -> B:11:0x0035). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x002a
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void k(int r7, short r8, short r9, java.lang.Object[] r10) {
        /*
            int r7 = r7 + 4
            int r9 = 121 - r9
            byte[] r0 = com.facetec.sdk.mu.$$a
            int r8 = r8 * 4
            int r8 = 1 - r8
            byte[] r1 = new byte[r8]
            r2 = 0
            if (r0 != 0) goto L16
            r9 = r7
            r3 = r1
            r5 = r2
            r1 = r0
            r0 = r10
            r10 = r8
            goto L35
        L16:
            r3 = r2
            r6 = r8
            r8 = r7
            r7 = r9
            r9 = r6
        L1b:
            byte r4 = (byte) r7
            int r5 = r3 + 1
            r1[r3] = r4
            if (r5 != r9) goto L2a
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            r10[r2] = r7
            return
        L2a:
            int r8 = r8 + 1
            r3 = r0[r8]
            r6 = r9
            r9 = r8
            r8 = r3
            r3 = r1
            r1 = r0
            r0 = r10
            r10 = r6
        L35:
            int r7 = r7 + r8
            r8 = r9
            r9 = r10
            r10 = r0
            r0 = r1
            r1 = r3
            r3 = r5
            goto L1b
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facetec.sdk.mu.k(int, short, short, java.lang.Object[]):void");
    }

    public void a(SSLSocket sSLSocket) {
    }

    public void b(SSLSocket sSLSocket, @Nullable String str, List<ko> list) throws IOException {
    }

    public SSLContext c() {
        try {
            Object[] objArr = {"java.specification.version"};
            Object[] objArr2 = new Object[1];
            h(new int[]{5995157, 2068998800, 713822103, 420818544, -2034224430, -1252254193, 1669662140, -1147322886}, 16 - TextUtils.getOffsetAfter("", 0), objArr2);
            Class<?> cls = Class.forName((String) objArr2[0]);
            Object[] objArr3 = new Object[1];
            h(new int[]{675665120, -101778711, 982909005, 83627931, -1291596685, -1608913715}, 11 - (ViewConfiguration.getTapTimeout() >> 16), objArr3);
            if ("1.7".equals(cls.getMethod((String) objArr3[0], String.class).invoke(null, objArr))) {
                try {
                    return SSLContext.getInstance("TLSv1.2");
                } catch (NoSuchAlgorithmException unused) {
                }
            }
            try {
                return SSLContext.getInstance("TLS");
            } catch (NoSuchAlgorithmException e5) {
                throw new IllegalStateException("No TLS provider", e5);
            }
        } catch (Throwable th2) {
            Throwable cause = th2.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th2;
        }
    }

    @Nullable
    public String d(SSLSocket sSLSocket) {
        return null;
    }

    public void e(SSLSocketFactory sSLSocketFactory) {
    }

    public String toString() {
        return getClass().getSimpleName();
    }

    public void a(Socket socket, InetSocketAddress inetSocketAddress, int i10) throws IOException {
        socket.connect(inetSocketAddress, i10);
    }

    @Nullable
    public X509TrustManager b(SSLSocketFactory sSLSocketFactory) {
        try {
            Object objB = b(sSLSocketFactory, Class.forName("sun.security.ssl.SSLContextImpl"), "context");
            if (objB == null) {
                return null;
            }
            return (X509TrustManager) b(objB, X509TrustManager.class, "trustManager");
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }

    public boolean d(String str) {
        return true;
    }

    public Object e(String str) {
        if (f42631d.isLoggable(Level.FINE)) {
            return new Throwable(str);
        }
        return null;
    }

    public void a(int i10, String str, @Nullable Throwable th2) {
        f42631d.log(i10 == 5 ? Level.WARNING : Level.INFO, str, th2);
    }

    public final mz d(SSLSocketFactory sSLSocketFactory) {
        X509TrustManager x509TrustManagerB = b(sSLSocketFactory);
        if (x509TrustManagerB != null) {
            return b(x509TrustManagerB);
        }
        StringBuilder sb2 = new StringBuilder("Unable to extract the trust manager on ");
        sb2.append(i());
        sb2.append(", sslSocketFactory is ");
        sb2.append(sSLSocketFactory.getClass());
        throw new IllegalStateException(sb2.toString());
    }

    public static List<String> b(List<ko> list) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            ko koVar = list.get(i10);
            if (koVar != ko.HTTP_1_0) {
                arrayList.add(koVar.toString());
            }
        }
        return arrayList;
    }

    public void a(String str, Object obj) {
        if (obj == null) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(str);
            sb2.append(" To see where this was allocated, set the OkHttpClient logger level to FINE: Logger.getLogger(OkHttpClient.class.getName()).setLevel(Level.FINE);");
            str = sb2.toString();
        }
        a(5, str, (Throwable) obj);
    }

    private static boolean d() throws Throwable {
        try {
            Object[] objArr = {"okhttp.platform"};
            Object[] objArr2 = new Object[1];
            h(new int[]{5995157, 2068998800, 713822103, 420818544, -2034224430, -1252254193, 1669662140, -1147322886}, 16 - View.getDefaultSize(0, 0), objArr2);
            Class<?> cls = Class.forName((String) objArr2[0]);
            Object[] objArr3 = new Object[1];
            h(new int[]{675665120, -101778711, 982909005, 83627931, -1291596685, -1608913715}, ImageFormat.getBitsPerPixel(0) + 12, objArr3);
            if ("conscrypt".equals(cls.getMethod((String) objArr3[0], String.class).invoke(null, objArr))) {
                return true;
            }
            return "Conscrypt".equals(Security.getProviders()[0].getName());
        } catch (Throwable th2) {
            Throwable cause = th2.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th2;
        }
    }

    public mz b(X509TrustManager x509TrustManager) {
        return new mx(d(x509TrustManager));
    }

    @Nullable
    public static <T> T b(Object obj, Class<T> cls, String str) {
        do {
            for (Class<?> superclass = obj.getClass(); superclass != Object.class; superclass = superclass.getSuperclass()) {
                try {
                    Field declaredField = superclass.getDeclaredField(str);
                    declaredField.setAccessible(true);
                    Object obj2 = declaredField.get(obj);
                    if (obj2 != null && cls.isInstance(obj2)) {
                        return cls.cast(obj2);
                    }
                    return null;
                } catch (IllegalAccessException unused) {
                    throw new AssertionError();
                } catch (NoSuchFieldException unused2) {
                }
            }
            if (str.equals("delegate")) {
                break;
            }
            obj = b(obj, (Class<Object>) Object.class, "delegate");
        } while (obj != null);
        return null;
    }

    public static byte[] d(List<ko> list) {
        nb nbVar = new nb();
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            ko koVar = list.get(i10);
            if (koVar != ko.HTTP_1_0) {
                nbVar.h(koVar.toString().length());
                nbVar.e(koVar.toString());
            }
        }
        return nbVar.l();
    }

    public nc d(X509TrustManager x509TrustManager) {
        return new my(x509TrustManager.getAcceptedIssuers());
    }
}

package com.facetec.sdk;

import android.graphics.Color;
import android.media.AudioTrack;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.exifinterface.media.ExifInterface;
import com.bbva.glomohybrid.base.deeplink.extensions.DeepLinkExtensionsKt;
import java.io.IOException;
import java.lang.ref.Reference;
import java.lang.reflect.Method;
import java.net.ConnectException;
import java.net.Proxy;
import java.net.Socket;
import java.net.SocketTimeoutException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;
import javax.net.ssl.SSLPeerUnverifiedException;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes9.dex */
public final class lm extends mf.b {
    private static final byte[] $$a = null;
    private static final int $$b = 0;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static int f42325q;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static long f42326s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static char f42327t;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    Socket f42328a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    ke f42329b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    Socket f42330c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final kx f42331d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final kd f42332e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    ko f42333f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    ni f42334g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    nh f42335h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f42336i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    mf f42337j;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f42339l;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f42340n = 1;
    public final List<Reference<lj>> m = new ArrayList();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public long f42338k = Long.MAX_VALUE;

    static {
        init$0();
        f42326s = 5402764725387775499L;
        f42325q = 1657419796;
        f42327t = (char) 52747;
    }

    public lm(kd kdVar, kx kxVar) {
        this.f42332e = kdVar;
        this.f42331d = kxVar;
    }

    public static void init$0() {
        $$a = new byte[]{27, 92, 98, 63};
        $$b = 2;
    }

    private static void p(String str, int i10, char c10, String str2, String str3, Object[] objArr) throws Throwable {
        int i11;
        char[] charArray = str3 != null ? str3.toCharArray() : str3;
        char[] charArray2 = str2 != null ? str2.toCharArray() : str2;
        char[] charArray3 = str != null ? str.toCharArray() : str;
        go goVar = new go();
        int length = charArray3.length;
        char[] cArr = new char[length];
        int length2 = charArray.length;
        char[] cArr2 = new char[length2];
        int i12 = 0;
        System.arraycopy(charArray3, 0, cArr, 0, length);
        System.arraycopy(charArray, 0, cArr2, 0, length2);
        cArr[0] = (char) (cArr[0] ^ c10);
        int i13 = 2;
        cArr2[2] = (char) (cArr2[2] + ((char) i10));
        int length3 = charArray2.length;
        char[] cArr3 = new char[length3];
        goVar.f41794c = 0;
        while (goVar.f41794c < length3) {
            try {
                Object[] objArr2 = new Object[1];
                objArr2[i12] = goVar;
                Map map = bp.f40694x;
                Object method = map.get(26369957);
                if (method == null) {
                    Class cls = (Class) bp.a((ViewConfiguration.getTouchSlop() >> 8) + 23, (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 719, (char) (ViewConfiguration.getMaximumFlingVelocity() >> 16));
                    byte b10 = (byte) ($$b - i13);
                    byte b11 = b10;
                    Object[] objArr3 = new Object[1];
                    r(b10, b11, (byte) (b11 + 3), objArr3);
                    String str4 = (String) objArr3[i12];
                    Class<?>[] clsArr = new Class[1];
                    clsArr[i12] = Object.class;
                    method = cls.getMethod(str4, clsArr);
                    map.put(26369957, method);
                }
                int iIntValue = ((Integer) ((Method) method).invoke(null, objArr2)).intValue();
                Object[] objArr4 = new Object[1];
                objArr4[i12] = goVar;
                Object method2 = map.get(-1014658957);
                if (method2 == null) {
                    Class cls2 = (Class) bp.a(View.combineMeasuredStates(i12, i12) + 24, 197 - TextUtils.getCapsMode("", i12, i12), (char) (1 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1))));
                    Class<?>[] clsArr2 = new Class[1];
                    clsArr2[i12] = Object.class;
                    method2 = cls2.getMethod(ExifInterface.GPS_MEASUREMENT_IN_PROGRESS, clsArr2);
                    map.put(-1014658957, method2);
                }
                int iIntValue2 = ((Integer) ((Method) method2).invoke(null, objArr4)).intValue();
                Object[] objArr5 = {goVar, Integer.valueOf(cArr[goVar.f41794c % 4] * 32718), Integer.valueOf(cArr2[iIntValue])};
                Object method3 = map.get(918635547);
                if (method3 == null) {
                    Class cls3 = (Class) bp.a(24 - TextUtils.indexOf("", ""), 1316 - Color.green(0), (char) (41876 - (ViewConfiguration.getMaximumFlingVelocity() >> 16)));
                    byte b12 = (byte) ($$b - 2);
                    byte b13 = b12;
                    Object[] objArr6 = new Object[1];
                    r(b12, b13, b13, objArr6);
                    String str5 = (String) objArr6[0];
                    Class<?> cls4 = Integer.TYPE;
                    method3 = cls3.getMethod(str5, Object.class, cls4, cls4);
                    map.put(918635547, method3);
                }
                ((Method) method3).invoke(null, objArr5);
                Object[] objArr7 = {Integer.valueOf(cArr[iIntValue2] * 32718), Integer.valueOf(cArr2[iIntValue])};
                Object method4 = map.get(-1899743495);
                if (method4 != null) {
                    i11 = 2;
                } else {
                    Class cls5 = (Class) bp.a((AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 23, 836 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), (char) (ViewConfiguration.getLongPressTimeout() >> 16));
                    byte b14 = (byte) ($$b - 2);
                    byte b15 = b14;
                    Object[] objArr8 = new Object[1];
                    r(b14, b15, (byte) (b15 | 55), objArr8);
                    String str6 = (String) objArr8[0];
                    i11 = 2;
                    Class<?> cls6 = Integer.TYPE;
                    method4 = cls5.getMethod(str6, cls6, cls6);
                    map.put(-1899743495, method4);
                }
                cArr2[iIntValue2] = ((Character) ((Method) method4).invoke(null, objArr7)).charValue();
                char c11 = goVar.f41793b;
                cArr[iIntValue2] = c11;
                int i14 = goVar.f41794c;
                cArr3[i14] = (char) (((((long) (c11 ^ charArray2[i14])) ^ (f42326s ^ 5402764725387775499L)) ^ ((long) ((int) (((long) f42325q) ^ 5402764725387775499L)))) ^ ((long) ((char) (((long) f42327t) ^ 5402764725387775499L))));
                goVar.f41794c = i14 + 1;
                i13 = i11;
                length3 = length3;
                i12 = 0;
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

    /* JADX WARN: Code duplicated, block: B:10:0x0029  */
    /* JADX WARN: Code duplicated, block: B:8:0x0021  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0029 -> B:11:0x0038). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0029
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void r(int r6, byte r7, short r8, java.lang.Object[] r9) {
        /*
            int r8 = 122 - r8
            byte[] r0 = com.facetec.sdk.lm.$$a
            int r7 = r7 * 3
            int r7 = 3 - r7
            int r6 = r6 * 4
            int r1 = 1 - r6
            byte[] r1 = new byte[r1]
            r2 = 0
            int r6 = 0 - r6
            if (r0 != 0) goto L1b
            r3 = r1
            r4 = r2
            r1 = r0
            r0 = r9
            r9 = r8
            r8 = r7
            r7 = r6
            goto L38
        L1b:
            r3 = r2
        L1c:
            byte r4 = (byte) r8
            r1[r3] = r4
            if (r3 != r6) goto L29
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L29:
            int r3 = r3 + 1
            int r7 = r7 + 1
            r4 = r0[r7]
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
            int r6 = r6 + r9
            r9 = r0
            r0 = r1
            r1 = r3
            r3 = r4
            r5 = r8
            r8 = r6
            r6 = r7
            r7 = r5
            goto L1c
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facetec.sdk.lm.r(int, byte, short, java.lang.Object[]):void");
    }

    public final boolean a(kk kkVar) {
        if (kkVar.j() != this.f42331d.a().e().j()) {
            return false;
        }
        if (kkVar.i().equals(this.f42331d.a().e().i())) {
            return true;
        }
        if (this.f42329b != null) {
            nf nfVar = nf.f42683a;
            if (nf.d(kkVar.i(), (X509Certificate) this.f42329b.a().get(0))) {
                return true;
            }
        }
        return false;
    }

    public final kx b() {
        return this.f42331d;
    }

    public final void c() {
        kz.d(this.f42330c);
    }

    public final void d(int i10, int i11) throws IOException {
        Proxy proxyE = this.f42331d.e();
        this.f42330c = (proxyE.type() == Proxy.Type.DIRECT || proxyE.type() == Proxy.Type.HTTP) ? this.f42331d.a().f41903e.createSocket() : new Socket(proxyE);
        this.f42331d.b();
        this.f42330c.setSoTimeout(i11);
        try {
            mu.i().a(this.f42330c, this.f42331d.b(), i10);
            try {
                this.f42335h = no.c(no.a(this.f42330c));
                this.f42334g = no.c(no.e(this.f42330c));
            } catch (NullPointerException e5) {
                if ("throw with null exception".equals(e5.getMessage())) {
                    throw new IOException(e5);
                }
            }
        } catch (ConnectException e7) {
            StringBuilder sb2 = new StringBuilder("Failed to connect to ");
            sb2.append(this.f42331d.b());
            ConnectException connectException = new ConnectException(sb2.toString());
            connectException.initCause(e7);
            throw connectException;
        }
    }

    public final boolean e(boolean z10) throws Throwable {
        if (this.f42328a.isClosed() || this.f42328a.isInputShutdown() || this.f42328a.isOutputShutdown()) {
            return false;
        }
        mf mfVar = this.f42337j;
        if (mfVar != null) {
            try {
                Object[] objArr = new Object[1];
                p("슢쿽녂肭", ViewConfiguration.getEdgeSlop() >> 16, (char) ((ViewConfiguration.getTapTimeout() >> 16) + 44465), "\uf3cb绗ݧ뷦鶆选倹툐ꍪ磚尬⦑᧰캬躖\uf645", "\u0000\u0000\u0000\u0000", objArr);
                Class<?> cls = Class.forName((String) objArr[0]);
                Object[] objArr2 = new Object[1];
                p("\ue913ᙣ㍺†", (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), (char) (ViewConfiguration.getFadingEdgeLength() >> 16), "飗춞癊厎玜᷍\uf355⢭", "\u0000\u0000\u0000\u0000", objArr2);
                return mfVar.b(((Long) cls.getMethod((String) objArr2[0], null).invoke(null, null)).longValue());
            } catch (Throwable th2) {
                Throwable cause = th2.getCause();
                if (cause != null) {
                    throw cause;
                }
                throw th2;
            }
        }
        if (z10) {
            try {
                int soTimeout = this.f42328a.getSoTimeout();
                try {
                    this.f42328a.setSoTimeout(1);
                    if (this.f42335h.c()) {
                        this.f42328a.setSoTimeout(soTimeout);
                        return false;
                    }
                    this.f42328a.setSoTimeout(soTimeout);
                    return true;
                } catch (Throwable th3) {
                    this.f42328a.setSoTimeout(soTimeout);
                    throw th3;
                }
            } catch (SocketTimeoutException unused) {
            } catch (IOException unused2) {
                return false;
            }
        }
        return true;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Connection{");
        sb2.append(this.f42331d.a().e().i());
        sb2.append(DeepLinkExtensionsKt.DYNAMIC_LINK_DELIMITER);
        sb2.append(this.f42331d.a().e().j());
        sb2.append(", proxy=");
        sb2.append(this.f42331d.e());
        sb2.append(" hostAddress=");
        sb2.append(this.f42331d.b());
        sb2.append(" cipherSuite=");
        ke keVar = this.f42329b;
        sb2.append(keVar != null ? keVar.f42020e : "none");
        sb2.append(" protocol=");
        sb2.append(this.f42333f);
        sb2.append(AbstractJsonLexerKt.END_OBJ);
        return sb2.toString();
    }

    @Override // com.facetec.sdk.mf.b
    public final void b(ml mlVar) throws IOException {
        mlVar.c(lz.REFUSED_STREAM);
    }

    public final Socket a() {
        return this.f42328a;
    }

    @Override // com.facetec.sdk.mf.b
    public final void e(mf mfVar) {
        synchronized (this.f42332e) {
            this.f42340n = mfVar.c();
        }
    }

    public final boolean e() {
        return this.f42337j != null;
    }

    public final void d(int i10) throws IOException {
        this.f42328a.setSoTimeout(0);
        mf.a aVar = new mf.a();
        Socket socket = this.f42328a;
        String strI = this.f42331d.a().e().i();
        nh nhVar = this.f42335h;
        ni niVar = this.f42334g;
        aVar.f42523d = socket;
        aVar.f42520a = strI;
        aVar.f42521b = nhVar;
        aVar.f42522c = niVar;
        aVar.f42524e = this;
        aVar.f42526i = i10;
        mf mfVar = new mf(aVar);
        this.f42337j = mfVar;
        mfVar.m.b();
        mfVar.m.e(mfVar.f42485l);
        int iD = mfVar.f42485l.d();
        if (iD != 65535) {
            mfVar.m.a(0, iD - 65535);
        }
        new Thread(mfVar.f42490s).start();
    }

    public final boolean d(jr jrVar, @Nullable kx kxVar) {
        if (this.m.size() >= this.f42340n || this.f42336i || !kv.f42195e.e(this.f42331d.a(), jrVar)) {
            return false;
        }
        if (jrVar.e().i().equals(b().a().e().i())) {
            return true;
        }
        if (this.f42337j == null || kxVar == null) {
            return false;
        }
        Proxy.Type type = kxVar.e().type();
        Proxy.Type type2 = Proxy.Type.DIRECT;
        if (type != type2 || this.f42331d.e().type() != type2 || !this.f42331d.b().equals(kxVar.b()) || kxVar.a().g() != nf.f42683a || !a(jrVar.e())) {
            return false;
        }
        try {
            jrVar.i().e(jrVar.e().i(), d().a());
            return true;
        } catch (SSLPeerUnverifiedException unused) {
            return false;
        }
    }

    public final ke d() {
        return this.f42329b;
    }
}

package com.mypinpad.tsdk.isolation;

import android.graphics.ImageFormat;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewConfiguration;
import androidx.camera.camera2.internal.n1;
import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Method;
import java.security.cert.CRL;
import java.security.cert.CRLException;
import java.security.cert.CertPath;
import java.security.cert.Certificate;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactorySpi;
import java.security.cert.CertificateParsingException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes10.dex */
public final class aoi extends CertificateFactorySpi {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final d1 f53407h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final d1 f53408i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static long f53409j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static int f53410k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static char f53411l;
    public static int m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static int f53412n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final int f53413o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final int f53414p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final byte[] f53415q = null;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final int f53416r = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final aow f53417a = new aow();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public aee f53418b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f53419c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public InputStream f53420d = null;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public aee f53421e = null;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f53422f = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public InputStream f53423g = null;

    public static class a extends CertificateException {

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public static int f53424q0;

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public Throwable f53425p0;

        @Override // java.lang.Throwable
        public final Throwable getCause() {
            System.identityHashCode(this);
            a aVar = (a) new Object[]{this}[0];
            int i10 = f53424q0;
            int i11 = (i10 & (-28)) | ((~i10) & 27);
            int i12 = -(-((i10 & 27) << 1));
            int i13 = (i11 ^ i12) + ((i12 & i11) << 1);
            int i14 = i13 % 128;
            int i15 = i13 % 2;
            Throwable th2 = aVar.f53425p0;
            int i16 = i14 & 117;
            int i17 = i14 | 117;
            int i18 = (i16 & i17) + (i17 | i16);
            f53424q0 = i18 % 128;
            if (i18 % 2 == 0) {
                return th2;
            }
            throw null;
        }
    }

    static {
        b();
        int i10 = 0;
        f53413o = 0;
        f53414p = 1;
        m = 0;
        f53412n = 1;
        g();
        f53407h = new d1("CERTIFICATE");
        f53408i = new d1("CRL");
        String str = "";
        char cIndexOf = (char) (TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 8804);
        int bitsPerPixel = ImageFormat.getBitsPerPixel(0) - 1952240967;
        char[] charArray = "\uab1b⛚朸賓\udcfd".toCharArray();
        int i11 = f53413o + 27;
        f53414p = i11 % 128;
        int i12 = 2;
        int i13 = i11 % 2;
        char[] charArray2 = "\u0000\u0000\u0000\u0000".toCharArray();
        char[] charArray3 = "룍ꌪ掋눢".toCharArray();
        int i14 = f53414p + 29;
        f53413o = i14 % 128;
        int i15 = i14 % 2;
        UiMessageCallbackKtWhenMappings uiMessageCallbackKtWhenMappings = new UiMessageCallbackKtWhenMappings();
        int length = charArray3.length;
        char[] cArr = new char[length];
        int length2 = charArray2.length;
        char[] cArr2 = new char[length2];
        System.arraycopy(charArray3, 0, cArr, 0, length);
        System.arraycopy(charArray2, 0, cArr2, 0, length2);
        cArr[0] = (char) (cIndexOf ^ cArr[0]);
        cArr2[2] = (char) (cArr2[2] + ((char) bitsPerPixel));
        int length3 = charArray.length;
        char[] cArr3 = new char[length3];
        uiMessageCallbackKtWhenMappings.setX = 0;
        while (uiMessageCallbackKtWhenMappings.setX < length3) {
            int i16 = f53414p + 41;
            f53413o = i16 % 128;
            int i17 = i16 % i12;
            try {
                Object[] objArr = new Object[1];
                objArr[i10] = uiMessageCallbackKtWhenMappings;
                Map map = setTextScaleX.setMaxEms;
                Object method = map.get(20564334);
                if (method == null) {
                    Class cls = (Class) setTextScaleX.setX((char) (50678 - (TypedValue.complexToFraction(i10, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(i10, 0.0f, 0.0f) == 0.0f ? 0 : -1))), TextUtils.getOffsetAfter(str, i10) + 39, (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 1737);
                    byte b10 = (byte) i10;
                    byte b11 = b10;
                    Object[] objArr2 = new Object[1];
                    a(b10, b11, b11, objArr2);
                    method = cls.getMethod((String) objArr2[0], Object.class);
                    map.put(20564334, method);
                }
                int iIntValue = ((Integer) ((Method) method).invoke(null, objArr)).intValue();
                Object[] objArr3 = {uiMessageCallbackKtWhenMappings};
                Object method2 = map.get(-68974155);
                int i18 = f53416r;
                if (method2 == null) {
                    Class cls2 = (Class) setTextScaleX.setX((char) (View.getDefaultSize(0, 0) + 8125), 37 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), 646 - TextUtils.getOffsetAfter(str, 0));
                    byte b12 = (byte) (i18 & 3);
                    byte b13 = (byte) (b12 - 3);
                    Object[] objArr4 = new Object[1];
                    a(b12, b13, b13, objArr4);
                    method2 = cls2.getMethod((String) objArr4[0], Object.class);
                    map.put(-68974155, method2);
                }
                int iIntValue2 = ((Integer) ((Method) method2).invoke(null, objArr3)).intValue();
                Object[] objArr5 = {uiMessageCallbackKtWhenMappings, Integer.valueOf(cArr[uiMessageCallbackKtWhenMappings.setX % 4] * 32718), Integer.valueOf(cArr2[iIntValue])};
                Object method3 = map.get(-1108711559);
                if (method3 == null) {
                    Class cls3 = (Class) setTextScaleX.setX((char) View.combineMeasuredStates(0, 0), 48 - TextUtils.lastIndexOf(str, '0', 0, 0), 434 - View.getDefaultSize(0, 0));
                    byte b14 = (byte) (i18 & 1);
                    byte b15 = (byte) (b14 - 1);
                    Object[] objArr6 = new Object[1];
                    a(b14, b15, b15, objArr6);
                    String str2 = (String) objArr6[0];
                    Class<?> cls4 = Integer.TYPE;
                    method3 = cls3.getMethod(str2, Object.class, cls4, cls4);
                    map.put(-1108711559, method3);
                }
                ((Method) method3).invoke(null, objArr5);
                Object[] objArr7 = {Integer.valueOf(cArr[iIntValue2] * 32718), Integer.valueOf(cArr2[iIntValue])};
                Object method4 = map.get(533021397);
                if (method4 == null) {
                    Class cls5 = (Class) setTextScaleX.setX((char) (4449 - (ViewConfiguration.getDoubleTapTimeout() >> 16)), 43 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), 1021 - View.MeasureSpec.getMode(0));
                    byte b16 = (byte) 0;
                    Object[] objArr8 = new Object[1];
                    a((byte) (i18 & 6), b16, b16, objArr8);
                    String str3 = (String) objArr8[0];
                    Class<?> cls6 = Integer.TYPE;
                    method4 = cls5.getMethod(str3, cls6, cls6);
                    map.put(533021397, method4);
                }
                cArr2[iIntValue2] = ((Character) ((Method) method4).invoke(null, objArr7)).charValue();
                char c10 = uiMessageCallbackKtWhenMappings.setDividerPadding;
                cArr[iIntValue2] = c10;
                int i19 = uiMessageCallbackKtWhenMappings.setX;
                cArr3[i19] = (char) (((((long) (c10 ^ charArray[i19])) ^ (f53409j ^ (-2443367703579691432L))) ^ ((long) ((int) (((long) f53410k) ^ (-2443367703579691432L))))) ^ ((long) ((char) (((long) f53411l) ^ (-2443367703579691432L)))));
                uiMessageCallbackKtWhenMappings.setX = i19 + 1;
                length3 = length3;
                str = str;
                i10 = 0;
                i12 = 2;
            } catch (Throwable th2) {
                Throwable cause = th2.getCause();
                if (cause == null) {
                    throw th2;
                }
                throw cause;
            }
        }
        new d1(n1.f(cArr3));
        int i20 = m + 89;
        f53412n = i20 % 128;
        if (i20 % 2 == 0) {
            int i21 = 36 / 0;
        }
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0026  */
    /* JADX WARN: Code duplicated, block: B:8:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:11:0x002a). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0026
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public static void a(byte r6, int r7, short r8, java.lang.Object[] r9) {
        /*
            int r7 = r7 * 4
            int r7 = r7 + 4
            int r8 = r8 * 3
            int r0 = r8 + 1
            int r6 = r6 + 113
            byte[] r0 = new byte[r0]
            byte[] r1 = com.mypinpad.tsdk.isolation.aoi.f53415q
            r2 = 0
            if (r1 != 0) goto L15
            r4 = r7
            r6 = r8
            r3 = r2
            goto L2a
        L15:
            r3 = r2
            r5 = r8
            r8 = r6
            r6 = r5
        L19:
            byte r4 = (byte) r8
            r0[r3] = r4
            if (r3 != r6) goto L26
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            r9[r2] = r6
            return
        L26:
            int r3 = r3 + 1
            r4 = r1[r7]
        L2a:
            int r7 = r7 + 1
            int r8 = r8 + r4
            goto L19
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mypinpad.tsdk.isolation.aoi.a(byte, int, short, java.lang.Object[]):void");
    }

    public static void b() {
        f53415q = new byte[]{27, 123, 116, -20};
        f53416r = 255;
    }

    public static void g() {
        f53411l = (char) 40166;
        f53409j = -2443367703579691432L;
        f53410k = -461867432;
    }

    public static /* synthetic */ Object setDividerPadding(Object[] objArr, int i10, int i11, int i12) throws CertificateParsingException {
        int i13 = (~i10) | (~i12);
        int i14 = ((i10 | (~(i11 | i12))) * 519) + (((~(i13 | i11)) | (~(i10 | i11 | i12))) * (-519)) + (((~i13) | i11) * 519) + (i11 * (-518)) + (i10 * (-518));
        if (i14 == 1) {
            aoi aoiVar = (aoi) objArr[0];
            InputStream inputStream = (InputStream) objArr[1];
            boolean zBooleanValue = ((Boolean) objArr[2]).booleanValue();
            int i15 = f53412n + 15;
            m = i15 % 128;
            int i16 = i15 % 2;
            Certificate certificateE = aoiVar.e(f53407h.d(inputStream, zBooleanValue));
            int i17 = m + 65;
            f53412n = i17 % 128;
            if (i17 % 2 != 0) {
                return certificateE;
            }
            int i18 = 16 / 0;
            return certificateE;
        }
        if (i14 != 2) {
            i1 i1Var = new i1(((aoi) objArr[0]).f53417a, (aix) objArr[1]);
            int i19 = m + 25;
            f53412n = i19 % 128;
            if (i19 % 2 != 0) {
                return i1Var;
            }
            int i20 = 38 / 0;
            return i1Var;
        }
        aoi aoiVar2 = (aoi) objArr[0];
        if (aoiVar2.f53418b != null) {
            while (true) {
                int i21 = aoiVar2.f53419c;
                aee aeeVar = aoiVar2.f53418b;
                if (i21 >= ((Integer) aee.setCompoundDrawableTintBlendMode(new Object[]{aeeVar}, -1113602318, 1113602320, System.identityHashCode(aeeVar))).intValue()) {
                    break;
                }
                aee aeeVar2 = aoiVar2.f53418b;
                int i22 = aoiVar2.f53419c;
                aoiVar2.f53419c = i22 + 1;
                add addVar = (add) aee.setCompoundDrawableTintBlendMode(new Object[]{aeeVar2, Integer.valueOf(i22)}, -1624993461, 1624993461, i22);
                if (addVar instanceof aed) {
                    return new m1(aoiVar2.f53417a, aiy.setY(addVar));
                }
                int i23 = f53412n + 121;
                m = i23 % 128;
                int i24 = i23 % 2;
            }
        }
        int i25 = f53412n + 67;
        m = i25 % 128;
        if (i25 % 2 == 0) {
            return null;
        }
        throw null;
    }

    public final CRL c() throws CRLException {
        int i10 = m + 81;
        int i11 = i10 % 128;
        f53412n = i11;
        int i12 = i10 % 2;
        aee aeeVar = this.f53421e;
        if (aeeVar != null) {
            int i13 = i11 + 9;
            m = i13 % 128;
            int i14 = i13 % 2;
            if (this.f53422f < ((Integer) aee.setCompoundDrawableTintBlendMode(new Object[]{aeeVar}, -1113602318, 1113602320, System.identityHashCode(aeeVar))).intValue()) {
                aee aeeVar2 = this.f53421e;
                int i15 = this.f53422f;
                this.f53422f = i15 + 1;
                return (CRL) setDividerPadding(new Object[]{this, aix.setOnFocusChangeListener((add) aee.setCompoundDrawableTintBlendMode(new Object[]{aeeVar2, Integer.valueOf(i15)}, -1624993461, 1624993461, i15))}, 1616762323, -1616762323, System.identityHashCode(this));
            }
        }
        int i16 = m + 15;
        f53412n = i16 % 128;
        if (i16 % 2 != 0) {
            return null;
        }
        throw null;
    }

    public final CRL d(adq adqVar) throws IOException, CRLException {
        int i10 = m + 85;
        f53412n = i10 % 128;
        if (i10 % 2 != 0) {
            return j((aed) aed.setY(new Object[]{(ady) adq.setOnFocusChangeListener(new Object[]{adqVar}, -1818946624, 1818946633, System.identityHashCode(adqVar))}, 691787085, -691787084, (int) System.currentTimeMillis()));
        }
        j((aed) aed.setY(new Object[]{(ady) adq.setOnFocusChangeListener(new Object[]{adqVar}, -1818946624, 1818946633, System.identityHashCode(adqVar))}, 691787085, -691787084, (int) System.currentTimeMillis()));
        throw null;
    }

    public final Certificate e(aed aedVar) throws CertificateParsingException {
        if (aedVar == null) {
            int i10 = f53412n + 45;
            m = i10 % 128;
            if (i10 % 2 == 0) {
                return null;
            }
            throw null;
        }
        if (aedVar.setCompoundDrawableTintBlendMode() > 1) {
            int i11 = f53412n + 119;
            m = i11 % 128;
            int i12 = i11 % 2;
            if ((aedVar.setX(0) instanceof adu) && aedVar.setX(0).equals(ahv.setAlwaysDrawnWithCacheEnabled)) {
                ahz ahzVar = (ahz) ahz.setX(new Object[]{(aed) aed.setY(new Object[]{(aeh) aedVar.setX(1), Boolean.TRUE}, 113370947, -113370947, (int) System.currentTimeMillis())}, 1328596349, -1328596348, (int) System.currentTimeMillis());
                this.f53418b = (aee) ahz.setX(new Object[]{ahzVar}, -730401705, 730401707, System.identityHashCode(ahzVar));
                return (Certificate) setDividerPadding(new Object[]{this}, 1675771393, -1675771391, System.identityHashCode(this));
            }
        }
        return new m1(this.f53417a, aiy.setY(aedVar));
    }

    @Override // java.security.cert.CertificateFactorySpi
    public final CRL engineGenerateCRL(InputStream inputStream) throws CRLException {
        int i10 = m + 9;
        f53412n = i10 % 128;
        int i11 = i10 % 2;
        CRL crlF = f(inputStream, true);
        int i12 = m + 101;
        f53412n = i12 % 128;
        if (i12 % 2 != 0) {
            return crlF;
        }
        throw null;
    }

    @Override // java.security.cert.CertificateFactorySpi
    public final Collection engineGenerateCRLs(InputStream inputStream) throws CRLException {
        ArrayList arrayList = new ArrayList();
        BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream);
        int i10 = f53412n + 13;
        m = i10 % 128;
        while (true) {
            int i11 = i10 % 2;
            CRL crlF = f(bufferedInputStream, arrayList.isEmpty());
            if (crlF == null) {
                return arrayList;
            }
            arrayList.add(crlF);
            i10 = m + 125;
            f53412n = i10 % 128;
        }
    }

    @Override // java.security.cert.CertificateFactorySpi
    public final CertPath engineGenerateCertPath(List list) throws CertificateException {
        Iterator it;
        int i10 = f53412n + 55;
        m = i10 % 128;
        if (i10 % 2 != 0) {
            it = list.iterator();
            int i11 = 58 / 0;
        } else {
            it = list.iterator();
        }
        while (it.hasNext()) {
            Object next = it.next();
            if (next != null && !(next instanceof X509Certificate)) {
                StringBuilder sb2 = new StringBuilder("list contains non X509Certificate object while creating CertPath\n");
                sb2.append(next.toString());
                throw new CertificateException(sb2.toString());
            }
        }
        aok aokVar = new aok(list);
        int i12 = m + 95;
        f53412n = i12 % 128;
        int i13 = i12 % 2;
        return aokVar;
    }

    @Override // java.security.cert.CertificateFactorySpi
    public final Certificate engineGenerateCertificate(InputStream inputStream) throws CertificateException {
        int i10 = m + 35;
        f53412n = i10 % 128;
        int i11 = i10 % 2;
        Certificate certificateH = h(inputStream, true);
        int i12 = m + 81;
        f53412n = i12 % 128;
        if (i12 % 2 == 0) {
            int i13 = 35 / 0;
        }
        return certificateH;
    }

    @Override // java.security.cert.CertificateFactorySpi
    public final Collection engineGenerateCertificates(InputStream inputStream) throws CertificateException {
        BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream);
        ArrayList arrayList = new ArrayList();
        int i10 = m + 1;
        f53412n = i10 % 128;
        while (true) {
            int i11 = i10 % 2;
            Certificate certificateH = h(bufferedInputStream, arrayList.isEmpty());
            if (certificateH == null) {
                return arrayList;
            }
            int i12 = m + 123;
            f53412n = i12 % 128;
            int i13 = i12 % 2;
            arrayList.add(certificateH);
            i10 = f53412n + 17;
            m = i10 % 128;
        }
    }

    @Override // java.security.cert.CertificateFactorySpi
    public final Iterator engineGetCertPathEncodings() {
        int i10 = f53412n + 9;
        m = i10 % 128;
        int i11 = i10 % 2;
        Iterator it = aok.f53426q0.iterator();
        int i12 = m + 9;
        f53412n = i12 % 128;
        int i13 = i12 % 2;
        return it;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0020  */
    /* JADX WARN: Code duplicated, block: B:12:0x0024  */
    /* JADX WARN: Code duplicated, block: B:15:0x0032 A[Catch: Exception -> 0x005d, CRLException -> 0x005f, TRY_LEAVE, TryCatch #2 {CRLException -> 0x005f, Exception -> 0x005d, blocks: (B:13:0x002d, B:15:0x0032, B:18:0x0058, B:24:0x0062, B:27:0x0070, B:31:0x0092, B:36:0x00af, B:40:0x00c0, B:42:0x00c5, B:30:0x0077), top: B:47:0x002d }] */
    /* JADX WARN: Code duplicated, block: B:17:0x004e  */
    /* JADX WARN: Code duplicated, block: B:24:0x0062 A[Catch: Exception -> 0x005d, CRLException -> 0x005f, TRY_LEAVE, TryCatch #2 {CRLException -> 0x005f, Exception -> 0x005d, blocks: (B:13:0x002d, B:15:0x0032, B:18:0x0058, B:24:0x0062, B:27:0x0070, B:31:0x0092, B:36:0x00af, B:40:0x00c0, B:42:0x00c5, B:30:0x0077), top: B:47:0x002d }] */
    /* JADX WARN: Code duplicated, block: B:27:0x0070 A[Catch: Exception -> 0x005d, CRLException -> 0x005f, TRY_ENTER, TryCatch #2 {CRLException -> 0x005f, Exception -> 0x005d, blocks: (B:13:0x002d, B:15:0x0032, B:18:0x0058, B:24:0x0062, B:27:0x0070, B:31:0x0092, B:36:0x00af, B:40:0x00c0, B:42:0x00c5, B:30:0x0077), top: B:47:0x002d }] */
    /* JADX WARN: Code duplicated, block: B:29:0x0076  */
    /* JADX WARN: Code duplicated, block: B:30:0x0077 A[Catch: Exception -> 0x005d, CRLException -> 0x005f, TryCatch #2 {CRLException -> 0x005f, Exception -> 0x005d, blocks: (B:13:0x002d, B:15:0x0032, B:18:0x0058, B:24:0x0062, B:27:0x0070, B:31:0x0092, B:36:0x00af, B:40:0x00c0, B:42:0x00c5, B:30:0x0077), top: B:47:0x002d }] */
    /* JADX WARN: Code duplicated, block: B:34:0x009c  */
    /* JADX WARN: Code duplicated, block: B:36:0x00af A[Catch: Exception -> 0x005d, CRLException -> 0x005f, TRY_ENTER, TRY_LEAVE, TryCatch #2 {CRLException -> 0x005f, Exception -> 0x005d, blocks: (B:13:0x002d, B:15:0x0032, B:18:0x0058, B:24:0x0062, B:27:0x0070, B:31:0x0092, B:36:0x00af, B:40:0x00c0, B:42:0x00c5, B:30:0x0077), top: B:47:0x002d }] */
    /* JADX WARN: Code duplicated, block: B:39:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:42:0x00c5 A[Catch: Exception -> 0x005d, CRLException -> 0x005f, TRY_LEAVE, TryCatch #2 {CRLException -> 0x005f, Exception -> 0x005d, blocks: (B:13:0x002d, B:15:0x0032, B:18:0x0058, B:24:0x0062, B:27:0x0070, B:31:0x0092, B:36:0x00af, B:40:0x00c0, B:42:0x00c5, B:30:0x0077), top: B:47:0x002d }] */
    public final CRL f(InputStream inputStream, boolean z10) throws CRLException {
        aee aeeVar;
        int i10;
        int i11 = f53412n;
        int i12 = i11 + 55;
        m = i12 % 128;
        try {
            if (i12 % 2 == 0) {
                if (this.f53423g != null) {
                    if (this.f53423g != inputStream) {
                        int i13 = i11 + 113;
                        m = i13 % 128;
                        int i14 = i13 % 2;
                    }
                }
                aeeVar = this.f53421e;
                if (aeeVar != null) {
                    if (this.f53422f != ((Integer) aee.setCompoundDrawableTintBlendMode(new Object[]{aeeVar}, -1113602318, 1113602320, System.identityHashCode(aeeVar))).intValue()) {
                        int i15 = f53412n + 21;
                        m = i15 % 128;
                        int i16 = i15 % 2;
                        return c();
                    }
                    this.f53421e = null;
                    this.f53422f = 0;
                    int i17 = m + 1;
                    f53412n = i17 % 128;
                    int i18 = i17 % 2;
                    return null;
                }
                if (!inputStream.markSupported()) {
                    inputStream = new ByteArrayInputStream((byte[]) bfc.setOnFocusChangeListener(new Object[]{inputStream}, 1574614765, -1574614762, (int) System.currentTimeMillis()));
                }
                inputStream.mark(1);
                i10 = inputStream.read();
                if (i10 != -1) {
                    inputStream.reset();
                    if (i10 == 48) {
                        return d(new adq(inputStream, (byte) 0));
                    }
                    int i19 = m + 109;
                    f53412n = i19 % 128;
                    int i20 = i19 % 2;
                    return i(inputStream, z10);
                }
                int i21 = m + 15;
                int i22 = i21 % 128;
                f53412n = i22;
                int i23 = i21 % 2;
                int i24 = i22 + 29;
                m = i24 % 128;
                int i25 = i24 % 2;
                return null;
            }
            int i26 = 0 / 0;
            if (this.f53423g != null) {
                if (this.f53423g != inputStream) {
                    int i110 = i11 + 113;
                    m = i110 % 128;
                    int i111 = i110 % 2;
                }
            }
            aeeVar = this.f53421e;
            if (aeeVar != null) {
                if (this.f53422f != ((Integer) aee.setCompoundDrawableTintBlendMode(new Object[]{aeeVar}, -1113602318, 1113602320, System.identityHashCode(aeeVar))).intValue()) {
                    int i112 = f53412n + 21;
                    m = i112 % 128;
                    int i113 = i112 % 2;
                    return c();
                }
                this.f53421e = null;
                this.f53422f = 0;
                int i114 = m + 1;
                f53412n = i114 % 128;
                int i115 = i114 % 2;
                return null;
            }
            if (!inputStream.markSupported()) {
                inputStream = new ByteArrayInputStream((byte[]) bfc.setOnFocusChangeListener(new Object[]{inputStream}, 1574614765, -1574614762, (int) System.currentTimeMillis()));
            }
            inputStream.mark(1);
            i10 = inputStream.read();
            if (i10 != -1) {
                inputStream.reset();
                if (i10 == 48) {
                    return d(new adq(inputStream, (byte) 0));
                }
                int i116 = m + 109;
                f53412n = i116 % 128;
                int i27 = i116 % 2;
                return i(inputStream, z10);
            }
            int i28 = m + 15;
            int i29 = i28 % 128;
            f53412n = i29;
            int i210 = i28 % 2;
            int i211 = i29 + 29;
            m = i211 % 128;
            int i212 = i211 % 2;
            return null;
            aeeVar = this.f53421e;
            if (aeeVar != null) {
                if (this.f53422f != ((Integer) aee.setCompoundDrawableTintBlendMode(new Object[]{aeeVar}, -1113602318, 1113602320, System.identityHashCode(aeeVar))).intValue()) {
                    int i117 = f53412n + 21;
                    m = i117 % 128;
                    int i118 = i117 % 2;
                    return c();
                }
                this.f53421e = null;
                this.f53422f = 0;
                int i119 = m + 1;
                f53412n = i119 % 128;
                int i1110 = i119 % 2;
                return null;
            }
            if (!inputStream.markSupported()) {
                inputStream = new ByteArrayInputStream((byte[]) bfc.setOnFocusChangeListener(new Object[]{inputStream}, 1574614765, -1574614762, (int) System.currentTimeMillis()));
            }
            inputStream.mark(1);
            i10 = inputStream.read();
            if (i10 != -1) {
                inputStream.reset();
                if (i10 == 48) {
                    return d(new adq(inputStream, (byte) 0));
                }
                int i1111 = m + 109;
                f53412n = i1111 % 128;
                int i213 = i1111 % 2;
                return i(inputStream, z10);
            }
            int i214 = m + 15;
            int i215 = i214 % 128;
            f53412n = i215;
            int i216 = i214 % 2;
            int i217 = i215 + 29;
            m = i217 % 128;
            int i218 = i217 % 2;
            return null;
        } catch (CRLException e5) {
            throw e5;
        } catch (Exception e7) {
            throw new CRLException(e7.toString());
        }
        this.f53423g = inputStream;
        this.f53421e = null;
        this.f53422f = 0;
    }

    /* JADX WARN: Code duplicated, block: B:4:0x0008  */
    public final Certificate h(InputStream inputStream, boolean z10) throws CertificateException {
        InputStream inputStream2 = this.f53420d;
        if (inputStream2 == null) {
            this.f53420d = inputStream;
            this.f53418b = null;
            this.f53419c = 0;
        } else if (inputStream2 != inputStream) {
            int i10 = m + 27;
            f53412n = i10 % 128;
            if (i10 % 2 == 0) {
                this.f53420d = inputStream;
                this.f53418b = null;
                this.f53419c = 1;
            } else {
                this.f53420d = inputStream;
                this.f53418b = null;
                this.f53419c = 0;
            }
        }
        try {
            aee aeeVar = this.f53418b;
            if (aeeVar != null) {
                if (this.f53419c != ((Integer) aee.setCompoundDrawableTintBlendMode(new Object[]{aeeVar}, -1113602318, 1113602320, System.identityHashCode(aeeVar))).intValue()) {
                    return (Certificate) setDividerPadding(new Object[]{this}, 1675771393, -1675771391, System.identityHashCode(this));
                }
                this.f53418b = null;
                this.f53419c = 0;
                return null;
            }
            if (!inputStream.markSupported()) {
                inputStream = new ByteArrayInputStream((byte[]) bfc.setOnFocusChangeListener(new Object[]{inputStream}, 1574614765, -1574614762, (int) System.currentTimeMillis()));
            }
            inputStream.mark(1);
            int i11 = inputStream.read();
            if (i11 == -1) {
                return null;
            }
            inputStream.reset();
            if (i11 != 48) {
                return (Certificate) setDividerPadding(new Object[]{this, inputStream, Boolean.valueOf(z10)}, 189109282, -189109281, System.identityHashCode(this));
            }
            Certificate certificateK = k(new adq(inputStream));
            int i12 = f53412n + 67;
            m = i12 % 128;
            int i13 = i12 % 2;
            return certificateK;
        } catch (Exception e5) {
            StringBuilder sb2 = new StringBuilder("parsing issue: ");
            sb2.append(e5.getMessage());
            a aVar = new a(sb2.toString());
            aVar.f53425p0 = e5;
            throw aVar;
        }
    }

    public final CRL i(InputStream inputStream, boolean z10) throws IOException, CRLException {
        int i10 = f53412n + 5;
        m = i10 % 128;
        int i11 = i10 % 2;
        aed aedVarD = f53408i.d(inputStream, z10);
        if (i11 != 0) {
            j(aedVarD);
            throw null;
        }
        CRL crlJ = j(aedVarD);
        int i12 = f53412n + 91;
        m = i12 % 128;
        int i13 = i12 % 2;
        return crlJ;
    }

    public final CRL j(aed aedVar) throws CRLException {
        if (aedVar == null) {
            int i10 = m + 97;
            f53412n = i10 % 128;
            if (i10 % 2 != 0) {
                return null;
            }
            throw null;
        }
        if (aedVar.setCompoundDrawableTintBlendMode() > 1 && (aedVar.setX(0) instanceof adu)) {
            int i11 = f53412n + 29;
            m = i11 % 128;
            if (i11 % 2 == 0 ? aedVar.setX(0).equals(ahv.setAlwaysDrawnWithCacheEnabled) : aedVar.setX(1).equals(ahv.setAlwaysDrawnWithCacheEnabled)) {
                ahz ahzVar = (ahz) ahz.setX(new Object[]{(aed) aed.setY(new Object[]{(aeh) aedVar.setX(1), Boolean.TRUE}, 113370947, -113370947, (int) System.currentTimeMillis())}, 1328596349, -1328596348, (int) System.currentTimeMillis());
                this.f53421e = (aee) ahz.setX(new Object[]{ahzVar}, 875563904, -875563904, System.identityHashCode(ahzVar));
                return c();
            }
        }
        return (CRL) setDividerPadding(new Object[]{this, aix.setOnFocusChangeListener(aedVar)}, 1616762323, -1616762323, System.identityHashCode(this));
    }

    public final Certificate k(adq adqVar) throws CertificateParsingException, IOException {
        int i10 = m + 53;
        f53412n = i10 % 128;
        if (i10 % 2 != 0) {
            return e((aed) aed.setY(new Object[]{(ady) adq.setOnFocusChangeListener(new Object[]{adqVar}, -1818946624, 1818946633, System.identityHashCode(adqVar))}, 691787085, -691787084, (int) System.currentTimeMillis()));
        }
        e((aed) aed.setY(new Object[]{(ady) adq.setOnFocusChangeListener(new Object[]{adqVar}, -1818946624, 1818946633, System.identityHashCode(adqVar))}, 691787085, -691787084, (int) System.currentTimeMillis()));
        throw null;
    }

    @Override // java.security.cert.CertificateFactorySpi
    public final CertPath engineGenerateCertPath(InputStream inputStream, String str) throws CertificateException {
        aok aokVar = new aok(inputStream, str);
        int i10 = f53412n + 7;
        m = i10 % 128;
        int i11 = i10 % 2;
        return aokVar;
    }

    @Override // java.security.cert.CertificateFactorySpi
    public final CertPath engineGenerateCertPath(InputStream inputStream) throws CertificateException {
        int i10 = f53412n + 45;
        m = i10 % 128;
        if (i10 % 2 != 0) {
            engineGenerateCertPath(inputStream, "PkiPath");
            throw null;
        }
        CertPath certPathEngineGenerateCertPath = engineGenerateCertPath(inputStream, "PkiPath");
        int i11 = f53412n + 91;
        m = i11 % 128;
        if (i11 % 2 == 0) {
            return certPathEngineGenerateCertPath;
        }
        throw null;
    }
}

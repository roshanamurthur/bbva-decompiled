package com.mypinpad.tsdk.isolation;

import android.os.Process;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import bk.v;
import java.lang.reflect.Method;
import java.security.GeneralSecurityException;
import java.security.cert.CertPath;
import java.security.cert.CertPathValidator;
import java.security.cert.Certificate;
import java.security.cert.PKIXParameters;
import java.security.cert.TrustAnchor;
import java.security.cert.X509Certificate;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
public final class TerminalSessionCallbackKt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final char f51856a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final char f51857b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final char f51858c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final char f51859d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static int f51860e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static int f51861f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f51862g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final byte[] f51863h = null;

    static {
        c();
        f51862g = 1;
        f51860e = 0;
        f51861f = 1;
        f51859d = (char) 53819;
        f51858c = (char) 50215;
        f51856a = (char) 42935;
        f51857b = (char) 8942;
    }

    public static void a(String str, int i10, Object[] objArr) throws Throwable {
        int i11;
        int i12 = f51862g;
        int i13 = i12 + 103;
        int i14 = i13 % 128;
        int i15 = 2;
        int i16 = i13 % 2;
        char[] charArray = str.toCharArray();
        setAlwaysDrawnWithCacheEnabled setalwaysdrawnwithcacheenabled = new setAlwaysDrawnWithCacheEnabled();
        char[] cArr = new char[charArray.length];
        int i17 = 0;
        setalwaysdrawnwithcacheenabled.setOnFocusChangeListener = 0;
        char[] cArr2 = new char[2];
        while (true) {
            int i18 = setalwaysdrawnwithcacheenabled.setOnFocusChangeListener;
            if (i18 >= charArray.length) {
                objArr[0] = new String(cArr, 0, i10);
                return;
            }
            cArr2[i17] = charArray[i18];
            cArr2[1] = charArray[i18 + 1];
            int i19 = i12 + 121;
            int i20 = i19 % 128;
            int i21 = i19 % i15;
            int i22 = 58224;
            int i23 = i17;
            while (i23 < 16) {
                int i24 = i12 + 119;
                int i25 = i24 % 128;
                int i26 = i24 % i15;
                char c10 = cArr2[1];
                char c11 = cArr2[i17];
                int i27 = (c11 + i22) ^ ((c11 << 4) + ((char) (((long) f51858c) ^ 4333817592127744003L)));
                int i28 = c11 >>> 5;
                try {
                    Object[] objArr2 = new Object[4];
                    objArr2[3] = Integer.valueOf(f51859d);
                    objArr2[i15] = Integer.valueOf(i28);
                    objArr2[1] = Integer.valueOf(i27);
                    objArr2[0] = Integer.valueOf(c10);
                    Map map = setTextScaleX.setMaxEms;
                    Object method = map.get(-1434759016);
                    if (method == null) {
                        Class cls = (Class) setTextScaleX.setX((char) ((ViewConfiguration.getScrollBarFadeDuration() >> 16) + 48534), 47 - ExpandableListView.getPackedPositionGroup(0L), View.resolveSize(0, 0) + 2672);
                        byte b10 = (byte) 0;
                        byte b11 = b10;
                        Object[] objArr3 = new Object[1];
                        b(b11, b10, b11, objArr3);
                        String str2 = (String) objArr3[0];
                        Class<?> cls2 = Integer.TYPE;
                        method = cls.getMethod(str2, cls2, cls2, cls2, cls2);
                        map.put(-1434759016, method);
                    }
                    char cCharValue = ((Character) ((Method) method).invoke(null, objArr2)).charValue();
                    cArr2[1] = cCharValue;
                    Object[] objArr4 = {Integer.valueOf(cArr2[0]), Integer.valueOf((cCharValue + i22) ^ ((cCharValue << 4) + ((char) (((long) f51856a) ^ 4333817592127744003L)))), Integer.valueOf(cCharValue >>> 5), Integer.valueOf(f51857b)};
                    Object method2 = map.get(-1434759016);
                    if (method2 == null) {
                        Class cls3 = (Class) setTextScaleX.setX((char) (48534 - (ViewConfiguration.getTouchSlop() >> 8)), (ViewConfiguration.getFadingEdgeLength() >> 16) + 47, 2672 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24));
                        byte b12 = (byte) 0;
                        byte b13 = b12;
                        Object[] objArr5 = new Object[1];
                        b(b13, b12, b13, objArr5);
                        String str3 = (String) objArr5[0];
                        Class<?> cls4 = Integer.TYPE;
                        method2 = cls3.getMethod(str3, cls4, cls4, cls4, cls4);
                        map.put(-1434759016, method2);
                    }
                    cArr2[0] = ((Character) ((Method) method2).invoke(null, objArr4)).charValue();
                    i22 -= 40503;
                    i23++;
                    i15 = 2;
                    i17 = 0;
                } catch (Throwable th2) {
                    Throwable cause = th2.getCause();
                    if (cause == null) {
                        throw th2;
                    }
                    throw cause;
                }
            }
            int i29 = setalwaysdrawnwithcacheenabled.setOnFocusChangeListener;
            cArr[i29] = cArr2[0];
            cArr[i29 + 1] = cArr2[1];
            Object[] objArr6 = {setalwaysdrawnwithcacheenabled, setalwaysdrawnwithcacheenabled};
            Map map2 = setTextScaleX.setMaxEms;
            Object method3 = map2.get(1396159716);
            if (method3 != null) {
                i11 = 2;
            } else {
                Class cls5 = (Class) setTextScaleX.setX((char) Gravity.getAbsoluteGravity(0, 0), 38 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), View.combineMeasuredStates(0, 0) + 2145);
                byte b14 = (byte) 0;
                byte b15 = b14;
                Object[] objArr7 = new Object[1];
                b(b15, b14, (byte) (b15 + 1), objArr7);
                i11 = 2;
                method3 = cls5.getMethod((String) objArr7[0], Object.class, Object.class);
                map2.put(1396159716, method3);
            }
            ((Method) method3).invoke(null, objArr6);
            i15 = i11;
            i17 = 0;
        }
    }

    public static void b(byte b10, int i10, short s4, Object[] objArr) {
        int i11 = b10 * 4;
        int i12 = (s4 * 2) + 103;
        int i13 = 4 - (i10 * 4);
        byte[] bArr = new byte[i11 + 1];
        byte[] bArr2 = f51863h;
        int i14 = -1;
        if (bArr2 == null) {
            i13++;
            i12 += i13;
        }
        while (true) {
            i14++;
            bArr[i14] = (byte) i12;
            if (i14 == i11) {
                objArr[0] = new String(bArr, 0);
                return;
            } else {
                byte b11 = bArr2[i13];
                i13++;
                i12 += b11;
            }
        }
    }

    public static void c() {
        f51863h = new byte[]{8, -126, 3, -115};
    }

    @NotNull
    public static byte[] d(@NotNull X509Certificate x509Certificate) {
        Intrinsics.checkNotNullParameter(x509Certificate, "");
        setOnItemSelectedListener setonitemselectedlistener = setOnItemSelectedListener.INSTANCE;
        byte[] encoded = x509Certificate.getPublicKey().getEncoded();
        Intrinsics.checkNotNullExpressionValue(encoded, "");
        new alp();
        alp alpVar = new alp();
        alm.setY(new Object[]{alpVar, encoded, 0, Integer.valueOf(encoded.length)}, 1533057357, -1533057354, 0);
        byte[] bArr = new byte[alpVar.setY()];
        alpVar.setCompoundDrawableTintBlendMode(bArr, 0);
        int i10 = f51861f + 113;
        f51860e = i10 % 128;
        int i11 = i10 % 2;
        return bArr;
    }

    public static final boolean setCompoundDrawableTintBlendMode(@NotNull CertPath certPath) throws Throwable {
        Intrinsics.checkNotNullParameter(certPath, "");
        X509Certificate dividerPadding = setDividerPadding(certPath);
        if (dividerPadding == null) {
            int i10 = f51861f + 25;
            f51860e = i10 % 128;
            int i11 = i10 % 2;
            return false;
        }
        PKIXParameters pKIXParameters = new PKIXParameters((Set<TrustAnchor>) v.setOf(new TrustAnchor(dividerPadding, null)));
        pKIXParameters.setRevocationEnabled(false);
        Object[] objArr = new Object[1];
        a("턼ᢜ슯꒴", TextUtils.lastIndexOf("", '0', 0) + 5, objArr);
        try {
            CertPathValidator.getInstance(((String) objArr[0]).intern()).validate(certPath, pKIXParameters);
            int i12 = f51860e + 75;
            f51861f = i12 % 128;
            int i13 = i12 % 2;
            return true;
        } catch (GeneralSecurityException unused) {
            return false;
        }
    }

    public static final boolean setDividerPadding(@NotNull X509Certificate x509Certificate, @NotNull String str) {
        Intrinsics.checkNotNullParameter(x509Certificate, "");
        Intrinsics.checkNotNullParameter(str, "");
        String name = x509Certificate.getSubjectDN().getName();
        Intrinsics.checkNotNullExpressionValue(name, "");
        boolean zContainsMatchIn = new Regex(str).containsMatchIn(name);
        int i10 = f51861f + 97;
        f51860e = i10 % 128;
        int i11 = i10 % 2;
        return zContainsMatchIn;
    }

    public static /* synthetic */ Object setOnFocusChangeListener(Object[] objArr, int i10, int i11, int i12) {
        X509Certificate x509Certificate = (X509Certificate) objArr[0];
        String str = (String) objArr[1];
        int i13 = f51860e + 125;
        f51861f = i13 % 128;
        if (i13 % 2 != 0) {
            Intrinsics.checkNotNullParameter(x509Certificate, "");
            Intrinsics.checkNotNullParameter(str, "");
            return Boolean.valueOf(Intrinsics.areEqual(str, setScrollIndicators.setX(d(x509Certificate))));
        }
        Intrinsics.checkNotNullParameter(x509Certificate, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.areEqual(str, setScrollIndicators.setX(d(x509Certificate)));
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0030  */
    /* JADX WARN: Code duplicated, block: B:14:0x0035 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:16:0x0037  */
    /* JADX WARN: Code duplicated, block: B:18:0x0041  */
    /* JADX WARN: Code duplicated, block: B:20:0x004e  */
    /* JADX WARN: Code duplicated, block: B:9:0x002a A[PHI: r0
      0x002a: PHI (r0v5 java.util.List<? extends java.security.cert.Certificate>) = 
      (r0v4 java.util.List<? extends java.security.cert.Certificate>)
      (r0v19 java.util.List<? extends java.security.cert.Certificate>)
     binds: [B:8:0x0028, B:5:0x001c] A[DONT_GENERATE, DONT_INLINE]] */
    @Nullable
    public static final X509Certificate setX(@NotNull CertPath certPath) throws Throwable {
        List<? extends Certificate> certificates;
        boolean z10;
        Certificate certificate;
        int i10 = f51861f + 49;
        f51860e = i10 % 128;
        if (i10 % 2 == 0) {
            Intrinsics.checkNotNullParameter(certPath, "");
            certificates = certPath.getCertificates();
            if (certificates != null) {
                if (!certificates.isEmpty()) {
                    z10 = false;
                }
            }
            if (z10) {
                return null;
            }
            certificate = certPath.getCertificates().get(0);
            if (certificate == null) {
                Object[] objArr = new Object[1];
                a("펮륙쒵鋠虳䆠쥱蹏ꁵ\uf683頽ⲡ桿\uf8f4虳䆠䤄㡝頽ⲡ쟝济鮎ﲔ抐團鲱\u176d뤬睄ꐑ\ue7e9駴磶뚦쯄\udea9燸\u2efa槒㻠\ued50嶞巷㖛ⷫग़頑駴磶娨脮넍俘왬蒟ꡬ料鹗ꫴ拍㧵䎈ꊈꙧ❶ﮔꁔ\ue5e7\u0fe4㥏墴", MotionEvent.axisFromString("") + 72, objArr);
                throw new NullPointerException(((String) objArr[0]).intern());
            }
            X509Certificate x509Certificate = (X509Certificate) certificate;
            int i11 = f51861f + 93;
            f51860e = i11 % 128;
            int i12 = i11 % 2;
            return x509Certificate;
        }
        Intrinsics.checkNotNullParameter(certPath, "");
        certificates = certPath.getCertificates();
        int i13 = 80 / 0;
        if (certificates != null) {
            if (!certificates.isEmpty()) {
                z10 = false;
            }
        }
        if (z10) {
            return null;
        }
        certificate = certPath.getCertificates().get(0);
        if (certificate == null) {
            Object[] objArr2 = new Object[1];
            a("펮륙쒵鋠虳䆠쥱蹏ꁵ\uf683頽ⲡ桿\uf8f4虳䆠䤄㡝頽ⲡ쟝济鮎ﲔ抐團鲱\u176d뤬睄ꐑ\ue7e9駴磶뚦쯄\udea9燸\u2efa槒㻠\ued50嶞巷㖛ⷫग़頑駴磶娨脮넍俘왬蒟ꡬ料鹗ꫴ拍㧵䎈ꊈꙧ❶ﮔꁔ\ue5e7\u0fe4㥏墴", MotionEvent.axisFromString("") + 72, objArr2);
            throw new NullPointerException(((String) objArr2[0]).intern());
        }
        X509Certificate x509Certificate2 = (X509Certificate) certificate;
        int i14 = f51861f + 93;
        f51860e = i14 % 128;
        int i15 = i14 % 2;
        return x509Certificate2;
        z10 = true;
        if (z10) {
            return null;
        }
        certificate = certPath.getCertificates().get(0);
        if (certificate == null) {
            Object[] objArr3 = new Object[1];
            a("펮륙쒵鋠虳䆠쥱蹏ꁵ\uf683頽ⲡ桿\uf8f4虳䆠䤄㡝頽ⲡ쟝济鮎ﲔ抐團鲱\u176d뤬睄ꐑ\ue7e9駴磶뚦쯄\udea9燸\u2efa槒㻠\ued50嶞巷㖛ⷫग़頑駴磶娨脮넍俘왬蒟ꡬ料鹗ꫴ拍㧵䎈ꊈꙧ❶ﮔꁔ\ue5e7\u0fe4㥏墴", MotionEvent.axisFromString("") + 72, objArr3);
            throw new NullPointerException(((String) objArr3[0]).intern());
        }
        X509Certificate x509Certificate3 = (X509Certificate) certificate;
        int i16 = f51861f + 93;
        f51860e = i16 % 128;
        int i17 = i16 % 2;
        return x509Certificate3;
    }

    @Nullable
    public static final X509Certificate setDividerPadding(@NotNull CertPath certPath) throws Throwable {
        Intrinsics.checkNotNullParameter(certPath, "");
        List<? extends Certificate> certificates = certPath.getCertificates();
        if (certificates != null) {
            int i10 = f51860e + 105;
            f51861f = i10 % 128;
            if (i10 % 2 == 0) {
                certificates.isEmpty();
                throw null;
            }
            if (!certificates.isEmpty()) {
                Certificate certificate = certPath.getCertificates().get(certPath.getCertificates().size() - 1);
                if (certificate != null) {
                    return (X509Certificate) certificate;
                }
                Object[] objArr = new Object[1];
                a("펮륙쒵鋠虳䆠쥱蹏ꁵ\uf683頽ⲡ桿\uf8f4虳䆠䤄㡝頽ⲡ쟝济鮎ﲔ抐團鲱\u176d뤬睄ꐑ\ue7e9駴磶뚦쯄\udea9燸\u2efa槒㻠\ued50嶞巷㖛ⷫग़頑駴磶娨脮넍俘왬蒟ꡬ料鹗ꫴ拍㧵䎈ꊈꙧ❶ﮔꁔ\ue5e7\u0fe4㥏墴", View.resolveSizeAndState(0, 0, 0) + 71, objArr);
                throw new NullPointerException(((String) objArr[0]).intern());
            }
        }
        int i11 = f51860e + 53;
        f51861f = i11 % 128;
        int i12 = i11 % 2;
        return null;
    }

    public static final boolean setCompoundDrawableTintBlendMode(@NotNull X509Certificate x509Certificate, @NotNull String str) {
        return ((Boolean) setOnFocusChangeListener(new Object[]{x509Certificate, str}, -589787074, 589787074, (int) System.currentTimeMillis())).booleanValue();
    }
}
